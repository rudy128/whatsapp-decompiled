package X;

/* renamed from: X.9Qs  reason: invalid class name and case insensitive filesystem */
public abstract class C181499Qs {
    public static final C21598Amm A00(A6Z a6z) {
        String obj = a6z.toString();
        int A00 = A6Z.A00(a6z);
        if (A00 == 405) {
            return new C175068xw(obj, 405);
        }
        BC4 A02 = a6z.A02();
        if (A02 instanceof C172868u9) {
            return new C175068xw(obj, A00);
        }
        if (A02 instanceof C172878uA) {
            return new C175058xv(obj);
        }
        if (A02 instanceof C172858u8) {
            return new C175048xu();
        }
        return new C21598Amm(obj, A00);
    }
}
