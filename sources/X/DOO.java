package X;

public class DOO implements E6M {
    public final C25670Ck0 A00;
    public final CYQ A01;
    public final Object A02;
    public final String A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DOO doo = (DOO) obj;
            if (!AnonymousClass026.A00(this.A01, doo.A01) || !this.A03.equals(doo.A03) || !AnonymousClass026.A00(this.A00, doo.A00)) {
                return false;
            }
        }
        return true;
    }

    public Object get() {
        return this.A02;
    }

    public DOO(C25670Ck0 ck0, CYQ cyq, Object obj) {
        this.A01 = cyq;
        this.A03 = obj.toString();
        this.A00 = ck0;
        this.A02 = cyq.A00(ck0, obj, obj).A00();
    }
}
