package X;

public class APW implements BD3 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AP5 A01;
    public final /* synthetic */ AF0 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public APW(AP5 ap5, AF0 af0, String str, String str2, int i) {
        this.A01 = ap5;
        this.A00 = i;
        this.A02 = af0;
        this.A03 = str;
        this.A04 = str2;
    }

    public int BKI() {
        return this.A01.A0C.Bbj();
    }

    public String BkK() {
        C180699No r0 = this.A01.A09.A07;
        if (r0 == null) {
            return null;
        }
        return r0.A02;
    }

    public Double CC2() {
        return this.A02.A02;
    }

    public String CCV() {
        C180699No r0 = this.A01.A09.A07;
        if (r0 == null) {
            return null;
        }
        return r0.A03;
    }

    public double CCv() {
        return this.A02.A00;
    }

    public String CDH() {
        return this.A02.A0H;
    }

    public String CH7() {
        return this.A01.A0K;
    }

    public String CD9() {
        return this.A03;
    }

    public int CDG() {
        return this.A00;
    }

    public String CH5() {
        return this.A04;
    }
}
