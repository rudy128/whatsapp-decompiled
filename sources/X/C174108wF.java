package X;

/* renamed from: X.8wF  reason: invalid class name and case insensitive filesystem */
public class C174108wF extends C174358we {
    public final int A00;
    public final C22436B7s A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
                return false;
            }
            C174108wF r5 = (C174108wF) obj;
            if (!this.A02.equals(r5.A02) || this.A00 != r5.A00 || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public C174108wF(C22436B7s b7s, String str, int i) {
        super(32);
        this.A02 = str;
        this.A00 = i;
        this.A01 = b7s;
    }

    public int hashCode() {
        return this.A02.hashCode();
    }
}
