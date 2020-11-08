package com.github.cemyeniceri.unicraft.jms.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HelloWorldMessage implements Serializable {
    private final long serialVersionUID = -8442226682612089725L;
    private UUID id;
    private String message;
}
