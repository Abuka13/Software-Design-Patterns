public interface CarBuilder {
    void setName(String name);
    void setEngine(String engine);
    void setYear(String year);
    void setType(String type);
    Car build();
}
