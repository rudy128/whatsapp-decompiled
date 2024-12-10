package X;

/* renamed from: X.CfM  reason: case insensitive filesystem */
public abstract class C25414CfM {
    public static final Integer[] A00;

    static {
        Integer num = AnonymousClass00R.A00;
        Integer num2 = AnonymousClass00R.A01;
        Integer num3 = AnonymousClass00R.A0C;
        A00 = new Integer[]{num2, num, AnonymousClass00R.A0N, num3};
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "M";
            case 2:
                return "Q";
            case 3:
                return "H";
            default:
                return "L";
        }
    }
}
