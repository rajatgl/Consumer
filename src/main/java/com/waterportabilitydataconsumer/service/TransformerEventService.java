package com.waterportabilitydataconsumer.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waterportabilitydataconsumer.entity.TransformerModel;
import com.waterportabilitydataconsumer.repository.JsonConsumerRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransformerEventService {

    @Autowired
    JsonConsumerRepository jsonConsumerRepository;

    @Autowired
    ObjectMapper objectMapper;

    public void processJsonConsumerEvent(ConsumerRecord<Long, TransformerModel> consumerRecord){
        //WaterPortability consumerEvent = getFromJson(consumerRecord.value(),consumerRecord.key());
        TransformerModel consumerModel = consumerRecord.value();
        log.info("Consumer Event : {}",consumerModel);
        Long key = consumerRecord.key();
        log.info("Consumer Key : {}",key);
        saveEvent(consumerModel);
    }

    private void saveEvent(TransformerModel waterPortabilityModel) {
        jsonConsumerRepository.save(waterPortabilityModel);
        log.info("Consumer Event: {} Persisted!",waterPortabilityModel);
    }


}
