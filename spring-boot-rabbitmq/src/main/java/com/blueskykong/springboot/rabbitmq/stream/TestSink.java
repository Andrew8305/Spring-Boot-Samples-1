package com.blueskykong.springboot.rabbitmq.stream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author keets
 */
public interface TestSink {
    String INPUT = "test-input";

    @Input(INPUT)
    SubscribableChannel input();
}
