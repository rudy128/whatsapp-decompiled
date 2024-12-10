package X;

/* renamed from: X.4ia  reason: invalid class name and case insensitive filesystem */
public final class C93194ia implements C108845cO {
    public final A99 A00;
    public final String A01;

    public /* bridge */ /* synthetic */ void Bop(Object obj) {
        String str = this.A01;
        if (str == null) {
            C17960vV.A0F(false, "Call ID cannot be null");
            return;
        }
        A99 a99 = this.A00;
        if (a99 != null) {
            a99.A0m(0, 13, str, (String) null);
        }
    }

    public C93194ia(A99 a99, String str) {
        this.A01 = str;
        this.A00 = a99;
    }
}
