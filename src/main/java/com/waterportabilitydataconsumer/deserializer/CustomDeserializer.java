package com.waterportabilitydataconsumer.deserializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.waterportabilitydataconsumer.entity.TransformerModel;
import org.apache.kafka.common.serialization.Deserializer;

import java.io.IOException;
import java.util.Map;

public class CustomDeserializer implements Deserializer<TransformerModel> {

    ObjectMapper objectMapper;

    @Override
    public void configure(Map<String, ?> configs, boolean isKey) {
        objectMapper = new ObjectMapper();
    }

    @Override
    public TransformerModel deserialize(String topic, byte[] data) {
        try {
            return objectMapper.readValue(data, TransformerModel.class);
        } catch (final IOException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
