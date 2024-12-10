package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.9Dh  reason: invalid class name and case insensitive filesystem */
public final class C178489Dh extends C198999zG implements C22473B9f {
    public final C22472B9e A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final C29621ca A04;

    public C178489Dh(C29621ca r2, C22472B9e b9e, String str, String str2, List list) {
        C18070vi.A0d(b9e, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = b9e;
        this.A04 = r2;
        this.A00 = r2;
    }

    public void BAP(C183939a9 r13) {
        String str;
        int i;
        int i2;
        boolean equalsIgnoreCase = "out of stock".equalsIgnoreCase(this.A01);
        C188569hd r3 = r13.A00;
        r3.A06 = this.A02;
        r3.A00 = equalsIgnoreCase ? 1 : 0;
        ArrayList A13 = AnonymousClass000.A13();
        for (AnonymousClass9DJ r1 : this.A03) {
            C18070vi.A0d(r1, 0);
            String str2 = r1.A03;
            AnonymousClass9CY r0 = (AnonymousClass9CY) r1.A02;
            if (r0 != null) {
                str = r0.A01;
            } else {
                str = null;
            }
            String str3 = r1.A04;
            C178229Ch r2 = (C178229Ch) r1.A01;
            if (r2 != null) {
                i = (int) r2.A01;
                i2 = (int) r2.A00;
            } else {
                i = 0;
                i2 = 0;
            }
            if (str == null) {
                str = str3;
            }
            A13.add(new AEI(str2, str, str3, i, i2));
        }
        r3.A09 = A13;
        this.A00.BAO(new C182989Wm(r3));
    }
}
