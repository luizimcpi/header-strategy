package com.devlhse.headerstrategy.model;

public class CarResponse {

    private String name;

    public String getName() {
        return name;
    }

    private CarResponse(Builder builder) {
        name = builder.name;
    }

    public static final class Builder {
        private String name;

        public Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public CarResponse build() {
            return new CarResponse(this);
        }
    }
}
