package X;

import java.util.List;
import java.util.Map;

public final class AWY implements BCA {
    public final C198139xq A00;
    public final AnonymousClass6RR A01;
    public final BCA A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public /* synthetic */ void Bsr(C21598Amm amm, String str) {
    }

    public void CDZ(List list, String str) {
        C198139xq r5;
        C18070vi.A0d(list, 0);
        if (this.A05 == null && (r5 = this.A00) != null) {
            String str2 = this.A01.value;
            String str3 = this.A03;
            String str4 = this.A04;
            C18070vi.A0d(str2, 0);
            int A002 = C18020vd.A00(C18040vf.A02, r5.A01, 5304);
            if (A002 < 0) {
                A002 = 0;
            }
            long A012 = ((long) A002) + AnonymousClass11P.A01(r5.A00);
            if (str4 == null) {
                str4 = "global";
            }
            if (str3 == null) {
                str3 = "explore";
            }
            StringBuilder A11 = AnonymousClass000.A11(str3);
            A11.append('_');
            A11.append(str2);
            String A0Z = C17890vO.A0Z(str4, A11, '_');
            Map map = r5.A02;
            synchronized (map) {
                map.put(A0Z, new C194499rp(str, list, A012));
            }
            C198139xq.A00(r5);
        }
        this.A02.CDZ(list, str);
    }

    public void Bsq(C21598Amm amm) {
        String str = this.A05;
        BCA bca = this.A02;
        if (str == null) {
            bca.Bsq(amm);
        } else {
            bca.Bsr(amm, str);
        }
    }

    public AWY(C198139xq r1, AnonymousClass6RR r2, BCA bca, String str, String str2, String str3) {
        this.A01 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A00 = r1;
        this.A02 = bca;
    }
}
