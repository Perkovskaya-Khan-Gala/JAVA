package Home_work6;

import java.time.LocalDate;

public class Laptop {
    private int id;
    private String modelName;// название модели
    private String colour;// цвет
    private int price;// цена в рублях
    private String manufacturer;// производитель
    private String originCountry;// место производства
    private int yearOfIssue;// год выпуска
    private float weight;// вес, кг
    private float screenDiagonal;// диагональ экрана, дюймы
    private String videoCardModel;// название видеокарты
    private int ram;// обьем оперативной памяти, ГБ
    private String cpuName;// название процессора
    private String os;// операционная система
    private int ssd;// общий обьем твердотельных накопителей, ГБ
    private int corsNumber;// количество ядер
    private float cpuFrequency;// частота ядра процессора, Ггц

    public Laptop(int id, String modelName, int price, String manufacturer, String originCountry,
            int i, float weight, float screenDiagonal, String videoCardModel, int ram, String cpuName,
            String os, int ssd, int corsNumber, float cpuFrequency, String colour) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
        this.manufacturer = manufacturer;
        this.originCountry = originCountry;
        this.yearOfIssue = i;
        this.weight = weight;
        this.screenDiagonal = screenDiagonal;
        this.videoCardModel = videoCardModel;
        this.ram = ram;
        this.cpuName = cpuName;
        this.os = os;
        this.ssd = ssd;
        this.corsNumber = corsNumber;
        this.cpuFrequency = cpuFrequency;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Laptop [id=" + id + ", modelName=" + modelName + ", colour=" + colour + ", price=" + price
                + ", manufacturer=" + manufacturer
                + ", originCountry=" + originCountry + ", yearOfIssue=" + yearOfIssue + ", weight=" + weight
                + ", screenDiagonal=" + screenDiagonal + ", videoCardName=" + videoCardModel + ", ram=" + ram
                + ", cpuName=" + cpuName + ", os=" + os + ", ssd=" + ssd + ", corsNumber=" + corsNumber
                + ", cpuFrequency=" + cpuFrequency + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(float screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getVideoCardModel() {
        return videoCardModel;
    }

    public void setVideoCardModel(String videoCardModel) {
        this.videoCardModel = videoCardModel;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getCpuName() {
        return cpuName;
    }

    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getCorsNumber() {
        return corsNumber;
    }

    public void setCorsNumber(int corsNumber) {
        this.corsNumber = corsNumber;
    }

    public float getCpuFrequency() {
        return cpuFrequency;
    }

    public void setCpuFrequency(float cpuFrequency) {
        this.cpuFrequency = cpuFrequency;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
