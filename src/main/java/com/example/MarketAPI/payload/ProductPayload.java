package com.example.MarketAPI.payload;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductPayload {
    String name;

    String hashId;

    String description;

    Long price;



}
