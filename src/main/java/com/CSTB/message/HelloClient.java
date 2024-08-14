package com.CSTB.message;

import io.grpc.Channel;
import io.grpc.StatusRuntimeException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloClient {
    private static final Logger logger = Logger.getLogger(HelloClient.class.getName());

    private final GreeterGrpc.GreeterBlockingStub blockingStub;

    /** Construct client for accessing HelloWorld server using the existing channel. */
    public HelloClient(Channel channel) {
        // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's responsibility to
        // shut it down.

        // Passing Channels to code makes code easier to test and makes it easier to reuse Channels.
        blockingStub = GreeterGrpc.newBlockingStub(channel);
    }

    /** Say hello to server. */
    public MessageReply send(String canal, String name) {
        logger.info("Will try to send the date-time " + name + " ...");
        SendMessageRequest message = SendMessageRequest.newBuilder().setChannel(canal).setMessage(name).build();
        MessageReply response;
        try {
            response = blockingStub.sendMessage(message);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return MessageReply.getDefaultInstance();
        }
        logger.info(response.getAck());
        return response;
    }

    /**
     * Greet server. If provided, the first element of {@code args} is the name to use in the
     * greeting. The second argument is the target server.
     */

}
