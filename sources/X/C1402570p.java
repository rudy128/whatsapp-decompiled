package X;

/* renamed from: X.70p  reason: invalid class name and case insensitive filesystem */
public abstract class C1402570p {
    public static final boolean A02(Integer num) {
        if (num == AnonymousClass00R.A0Y || num == AnonymousClass00R.A18 || num == AnonymousClass00R.A0H || num == AnonymousClass00R.A0I) {
            return true;
        }
        return false;
    }

    public static final int A00(Integer num) {
        int intValue = num.intValue();
        if (intValue == 4) {
            return 3;
        }
        if (intValue == 8) {
            return 4;
        }
        if (intValue == 13) {
            return 6;
        }
        switch (intValue) {
            case 1:
            case 22:
                return 2;
            case 2:
            case 23:
                return 5;
            case 24:
                return 7;
            case 25:
                return 8;
            default:
                return 1;
        }
    }

    public static final Integer A01(Integer num) {
        int intValue = num.intValue();
        int i = 1;
        if (intValue != 10) {
            if (intValue != 22 && intValue != 23) {
                return null;
            }
            i = 2;
        }
        return Integer.valueOf(i);
    }
}
