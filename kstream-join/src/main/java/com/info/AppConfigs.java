package com.info;

class AppConfigs {

    public final static String applicationID = "KStreamJoinDemo";
    public final static String bootstrapServers = "localhost:9092,localhost:9093,localhost:9094";
    public final static String paymentRequestTopicName = "payment_request";
    public final static String paymentConfirmationTopicName = "payment_confirmation";
    public final static String stateStoreName = "C:\\Setup\\kafka_2.12-2.5.0\\tmp\\state-store";
}
