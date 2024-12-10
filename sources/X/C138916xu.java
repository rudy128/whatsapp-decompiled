package X;

/* renamed from: X.6xu  reason: invalid class name and case insensitive filesystem */
public class C138916xu {
    public final int A00;
    public final String A01;

    public C138916xu(C145227Kl r2, int i) {
        C18070vi.A0d(r2, 2);
        this.A00 = i;
        String id = r2.getId();
        C18070vi.A0X(id);
        this.A01 = id;
    }

    public boolean A00(int i) {
        boolean z = this instanceof AnonymousClass6Ho;
        int i2 = this.A00;
        if (!z) {
            return AnonymousClass000.A1T(i, i2);
        }
        if (i < i2 || i >= i2 + 4) {
            return false;
        }
        return true;
    }

    public C138916xu(int i, String str) {
        C18070vi.A0d(str, 2);
        this.A00 = i;
        this.A01 = str;
    }
}
