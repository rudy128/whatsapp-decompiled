package X;

/* renamed from: X.8wH  reason: invalid class name and case insensitive filesystem */
public class C174128wH extends C174358we {
    public final C38471rL A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C174128wH r5 = (C174128wH) obj;
            if (!this.A01.equals(r5.A01) || !this.A02.equals(r5.A02) || this.A03 != r5.A03) {
                return false;
            }
        }
        return true;
    }

    public C174128wH(C38471rL r2, String str, String str2, boolean z) {
        super(35);
        this.A02 = str;
        this.A00 = r2;
        this.A03 = z;
        this.A01 = str2;
    }

    public int hashCode() {
        return this.A01.hashCode();
    }
}
