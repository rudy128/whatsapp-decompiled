package X;

/* renamed from: X.4Vy  reason: invalid class name and case insensitive filesystem */
public abstract class C87534Vy {
    public static Integer A00(String str) {
        if (str.equals("GLOBAL_FROM_NUX")) {
            return AnonymousClass00R.A00;
        }
        if (str.equals("GLOBAL_FROM_SETTING")) {
            return AnonymousClass00R.A01;
        }
        if (str.equals("GLOBAL_FROM_SETTING_NUX")) {
            return AnonymousClass00R.A0C;
        }
        if (str.equals("PER_CHAT")) {
            return AnonymousClass00R.A0N;
        }
        throw AnonymousClass000.A0k(str);
    }

    public static String A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "GLOBAL_FROM_SETTING";
            case 2:
                return "GLOBAL_FROM_SETTING_NUX";
            case 3:
                return "PER_CHAT";
            default:
                return "GLOBAL_FROM_NUX";
        }
    }
}
