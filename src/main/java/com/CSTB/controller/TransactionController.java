package com.CSTB.controller;

import com.CSTB.message.HelloClient;
import com.CSTB.message.MessageReply;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@RestController
public class TransactionController {
    private static final Logger logger = Logger.getLogger(TransactionController.class.getName());
    @GetMapping("/")
    public String Hello() throws InterruptedException {
        String dateTimeNow = Instant.now().toString();
        String canal = "canal 1";
        // Access a service running on the local machine on port 50051
        String target = "localhost:50051";

        // Create a communication channel to the server, known as a Channel. Channels are thread-safe
        // and reusable. It is common to create channels at the beginning of your application and reuse
        // them until the application shuts down.
        //
        // For the example we use plaintext insecure credentials to avoid needing TLS certificates. To
        // use TLS, use TlsChannelCredentials instead.
        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                .build();
        MessageReply message;
        try {
            HelloClient client = new HelloClient(channel);
            message = client.send(canal,"Hello now:"+dateTimeNow);
        } finally {
            // ManagedChannels use resources like threads and TCP connections. To prevent leaking these
            // resources the channel should be shut down when it will no longer be used. If it may be used
            // again leave it running.
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }

        return message.getAck();
    }
}
