package X;

public abstract class CGU {
    public static int A00;

    static {
        int i = -1;
        if (System.getProperty("JSON_SMART_SIMPLE") != null) {
            i = 4032;
        }
        A00 = i;
    }
}
