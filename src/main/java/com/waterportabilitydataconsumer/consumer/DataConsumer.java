package com.waterportabilitydataconsumer.consumer;

import com.waterportabilitydataconsumer.entity.TransformerModel;
import com.waterportabilitydataconsumer.service.TransformerEventService;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class DataConsumer {

    @Autowired
    TransformerEventService waterPotabilityEventService;

    @KafkaListener(topics = {"unique-topic-name"})
    public void onMessage1(ConsumerRecord<Long, TransformerModel> consumerRecord){

        waterPotabilityEventService.processJsonConsumerEvent(consumerRecord);
        log.info("ConsumerRecord-C1 : {} ", consumerRecord );

    }
}
