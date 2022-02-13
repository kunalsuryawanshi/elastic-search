package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "customer", shards = 2)
@Data
public class Customer {
    @Id
    private String id;
    private String name;
    private String age;
}
