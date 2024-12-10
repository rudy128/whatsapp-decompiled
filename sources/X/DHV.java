package X;

import java.util.List;

public class DHV implements E7t {
    public long A00 = -1;
    public long A01;
    public C24802CKv A02;
    public C25752ClM A03;
    public DH2 A04;
    public C25265Cc6 A05;
    public C25265Cc6 A06;
    public C25624Cj4 A07;
    public boolean A08;
    public boolean A09;
    public final C26259Cw4 A0A;

    public static void A00(DHV dhv) {
        long j;
        int i;
        C26159CtX.A01(dhv.A02);
        C26159CtX.A01(dhv.A07);
        if (!dhv.A08) {
            dhv.A08 = true;
            C25624Cj4 cj4 = dhv.A07;
            boolean z = true ^ dhv.A02.A00;
            List list = cj4.A0B;
            C26159CtX.A01(list);
            List list2 = cj4.A0D;
            int size = list2.size();
            C26159CtX.A01(list);
            int i2 = 0;
            C26171Ctn.A03(AnonymousClass000.A1T(size, list.size()), "Presentation time list and FrameBufferTexture time list should be the same");
            C24802CKv cKv = cj4.A05;
            C26159CtX.A01(cKv);
            if (!cKv.A00) {
                j = BE9.A0M(list2, AnonymousClass3MX.A02(list2, 1));
            } else {
                j = 0;
            }
            int size2 = list.size();
            if (z) {
                i = size2 - 2;
                i2 = 1;
            } else {
                i = size2 - 1;
            }
            while (i >= i2) {
                C25624Cj4.A00((CZA) list.get(i), cj4, BE9.A0M(list2, AnonymousClass3MX.A02(list2, 1) - i) + j);
                i--;
            }
        }
    }

    public EAS BHI() {
        return new DHN(this);
    }

    public EAb BHL() {
        return new DHQ(this);
    }

    public DHV(C26259Cw4 cw4) {
        this.A0A = cw4;
    }
}
