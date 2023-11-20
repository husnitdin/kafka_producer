package uz.geeks.cab_book_driver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import uz.geeks.cab_book_driver.constant.Constants;

@Service
public class CabLocationService {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public boolean updateLocation(String location) {

        kafkaTemplate.send(Constants.CAB_LOCATION, location);

        return true;
    }

}
