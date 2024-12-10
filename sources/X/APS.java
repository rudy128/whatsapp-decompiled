package X;

import java.util.List;

public class APS implements C22494BAb {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AP5 A02;
    public final /* synthetic */ AF0 A03;
    public final /* synthetic */ List A04;

    public APS(AP5 ap5, AF0 af0, List list, int i, int i2) {
        this.A02 = ap5;
        this.A03 = af0;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = list;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9No, java.lang.Object] */
    public void ByL() {
        AP5 ap5 = this.A02;
        C188769hx r3 = ap5.A09;
        r3.A03 = 4;
        AF0 af0 = this.A03;
        int i = this.A00;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = af0;
        r3.A07 = obj;
        obj.A00(this.A01, this.A04);
        ap5.A0B();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9No, java.lang.Object] */
    public void C1v(Integer num, Integer num2, Integer num3, Integer num4) {
        AP5 ap5 = this.A02;
        C188769hx r3 = ap5.A09;
        r3.A03 = 3;
        AF0 af0 = this.A03;
        int i = this.A00;
        ? obj = new Object();
        obj.A00 = i;
        obj.A01 = af0;
        r3.A07 = obj;
        obj.A00(this.A01, this.A04);
        r3.A09 = num2;
        r3.A0C = num3;
        r3.A0B = num4;
        r3.A0A = num;
        ap5.A0B();
    }
}
