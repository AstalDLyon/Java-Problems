class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    public Phone(String ownerName, String number){
        this(ownerName,"UF", "158", number);
    }
    public Phone(String ownerName, String countryCode, String cityCode, String number){
        this.ownerName = ownerName;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.number = number;
    }
}