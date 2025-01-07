package com.lld.design_patterns.creational.builder;

public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String gpu;
    private final String os;

    public Computer(String cpu, String ram, String storage, String gpu, String os) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.gpu = gpu;
        this.os = os;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGpu() {
        return gpu;
    }

    public String getOs() {
        return os;
    }

    @Override
    public String toString() {
        return "Computer{" + "CPU='" + cpu + '\'' + ", RAM='" + ram + '\'' + ", Storage='" + storage + '\'' + ", GPU='" + gpu + '\'' + ", OS='" + os + '\'' + '}';
    }
}
