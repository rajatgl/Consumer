package com.waterportabilitydataconsumer.repository;

import com.waterportabilitydataconsumer.entity.TransformerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JsonConsumerRepository extends CrudRepository<TransformerModel,Integer> {
}
