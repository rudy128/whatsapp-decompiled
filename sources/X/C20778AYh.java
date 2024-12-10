package X;

import java.io.File;

/* renamed from: X.AYh  reason: case insensitive filesystem */
public class C20778AYh implements BBF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C20778AYh(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A03 = obj;
    }

    public void C26(A7B a7b) {
        if (this.A00 != 0) {
            ((C58042k3) this.A01).A02.A05.execute(new C21425Ajs(this.A02, 49));
            return;
        }
        AMJ amj = (AMJ) this.A02;
        amj.BiO(a7b, (Integer) this.A04);
        amj.BtH(a7b);
    }

    public void C27(AZ2 az2) {
        if (this.A00 != 0) {
            C26551So r1 = (C26551So) this.A04;
            ((C58042k3) this.A01).A00(az2, (C130136iw) this.A02, r1, (File) this.A03);
            return;
        }
        AMJ amj = (AMJ) this.A02;
        amj.BiP((Integer) this.A04);
        C198959zC r12 = new C198959zC(az2);
        C198809yw.A00((C42621yT) this.A03, (C198809yw) this.A01, amj, r12);
    }
}
