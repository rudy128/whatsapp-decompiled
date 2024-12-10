package X;

/* renamed from: X.AhP  reason: case insensitive filesystem */
public final class C21278AhP implements C22470B9c {
    public static final C21278AhP A00 = new C21278AhP();

    public final Object BCF(C29621ca r19, C62672rm r20) {
        C29621ca r3 = r19;
        C62672rm r2 = r20;
        int A17 = C18070vi.A17(r3, r2);
        if (!r2.A09(r3, "config")) {
            return null;
        }
        String[] strArr = new String[A17];
        strArr[0] = "endpoint";
        Class<String> cls = String.class;
        Long A0X = C108975cc.A0X();
        Long A0k = AnonymousClass8BV.A0k();
        if (r2.A05(r3, cls, A0X, A0k, (Object) null, strArr, false) == null) {
            return null;
        }
        String[] strArr2 = new String[A17];
        strArr2[0] = "auth";
        if (r2.A05(r3, cls, A0X, A0k, (Object) null, strArr2, false) == null) {
            return null;
        }
        String[] strArr3 = new String[A17];
        strArr3[0] = "p256dh";
        if (r2.A05(r3, cls, A0X, A0k, (Object) null, strArr3, false) == null) {
            return null;
        }
        String[] strArr4 = new String[A17];
        if (r2.A05(r3, cls, AnonymousClass8BW.A0Z("platform", strArr4, 0), AnonymousClass8BU.A0j(), "web", strArr4, false) != null) {
            return new AnonymousClass9EO(r3);
        }
        return null;
    }
}
