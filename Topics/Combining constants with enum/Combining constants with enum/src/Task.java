// You can experiment here, it won't be checked

public class Task {
  public static void main(String[] args) {
    // put your code here
    Zodiac capricorn = Zodiac.CAPRICORN;
    Zodiac leo = Zodiac.LEO;
    System.out.println(capricorn.name());
    Zodiac taurus = Zodiac.valueOf("TAURUS");
    System.out.println(leo.equals(Zodiac.TAURUS));
    System.out.println(Zodiac.AQUARIUS.ordinal());
  }

  public enum Zodiac {
    ARIES,
    TAURUS,
    GEMINI,
    CANCER,
    LEO,
    VIRGO,
    LIBRA,
    SCORPIO,
    SAGITTARIUS,
    CAPRICORN,
    AQUARIUS,
    PISCES
  }
}
