package X;

import java.util.ArrayList;

public class AZT implements C22460B8s {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public AZT(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj;
    }

    public final void C3g(C198959zC r16) {
        C198959zC r7 = r16;
        if (this.A00 != 0) {
            A4K a4k = (A4K) this.A01;
            a4k.A06.A00(new C20769AXy(a4k, r7, (C191689n0) this.A02, this.A04), r7, this.A03);
            return;
        }
        A4K a4k2 = (A4K) this.A01;
        String str = this.A03;
        String str2 = this.A04;
        C191529mk r4 = a4k2.A06;
        String[] A1Z = C17880vN.A1Z();
        AnonymousClass8BS.A1B(str, str2, A1Z);
        AY1 ay1 = new AY1((C22461B8t) this.A02, a4k2, r7);
        if ("token".equals(r7.A00.A03)) {
            C191069ly r9 = new C191069ly(ay1);
            int i = 0;
            do {
                ArrayList A13 = AnonymousClass000.A13();
                AnonymousClass3Ma.A1P("fbpay_pin", A1Z[i], A13);
                AnonymousClass10I r0 = r4.A05;
                AnonymousClass17E r11 = r4.A03;
                AnonymousClass1QD r72 = r4.A01;
                C50412Ui r12 = r4.A04;
                AnonymousClass3MW.A1T(new C175528yr(r4.A00, r72, r4.A02, r9, (BB7) null, r11, r12, A13, i), r0, 0);
                i++;
            } while (i < 2);
            return;
        }
        ay1.C7Y(A1Z);
    }
}
