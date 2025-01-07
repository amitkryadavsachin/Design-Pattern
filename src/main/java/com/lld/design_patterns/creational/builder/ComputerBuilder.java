package com.lld.design_patterns.creational.builder;

public class ComputerBuilder {
        private String cpu;
        private String ram;
        private String storage;
        private String gpu;
        private String os;

        public ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(String ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }

        public ComputerBuilder setOs(String os) {
            this.os = os;
            return this;
        }

        public Computer build() {
            return new Computer(cpu, ram, storage, gpu, os);
        }
    }
