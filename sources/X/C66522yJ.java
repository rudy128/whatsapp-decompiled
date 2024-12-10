package X;

/* renamed from: X.2yJ  reason: invalid class name and case insensitive filesystem */
public class C66522yJ implements C41121vq {
    public final long A00;
    public final long A01;
    public final C70483Bg A02;
    public final C58742lB A03;
    public final AnonymousClass1BI A04;

    public int BTW() {
        return 7;
    }

    public AnonymousClass1BI BTb() {
        return null;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        C17890vO.A1L(objArr, this.A00);
        objArr[1] = this.A04;
        objArr[2] = this.A03;
        C17890vO.A1O(objArr, this.A01);
        return AnonymousClass000.A0P(this.A02, objArr, 4);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C66522yJ)) {
            return false;
        }
        C66522yJ r7 = (C66522yJ) obj;
        if (this.A00 != r7.A00 || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03) || this.A01 != r7.A01 || !C42171xk.A00(this.A02, r7.A02)) {
            return false;
        }
        return true;
    }

    public C66522yJ(C70483Bg r1, C58742lB r2, AnonymousClass1BI r3, long j, long j2) {
        this.A00 = j;
        this.A01 = j2;
        this.A04 = r3;
        this.A03 = r2;
        this.A02 = r1;
    }

    public C70483Bg BO2() {
        return this.A02;
    }

    public /* synthetic */ int BYi() {
        return -1;
    }
}
