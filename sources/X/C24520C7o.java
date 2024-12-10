package X;

/* renamed from: X.C7o  reason: case insensitive filesystem */
public abstract class C24520C7o {
    public static final int A00(DFL dfl) {
        String A0i = BE7.A0i(dfl);
        if (A0i == null || A0i.equals("column")) {
            return 1;
        }
        if (A0i.equals("row")) {
            return 0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unknown direction ");
        throw AnonymousClass001.A12(A0i, A10);
    }
}
