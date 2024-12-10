package X;

public abstract class CBz {
    public static String A00(DFL dfl) {
        int i = dfl.A05;
        if (i != 13319) {
            C25913CoX.A01("BloksTextProviderMapper", AnonymousClass001.A1I("Unrecognized Text provider with style id ", AnonymousClass000.A10(), i));
            return "";
        }
        long A05 = dfl.A05(36, 0);
        String str = "date";
        String A0f = BE7.A0f(dfl);
        if (A0f != null) {
            str = A0f;
        }
        return AnonymousClass9OT.A00(str, BE7.A0d(dfl), BE7.A0g(dfl), BE7.A0h(dfl), A05);
    }
}
