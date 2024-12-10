package X;

import java.util.Iterator;

/* renamed from: X.DAk  reason: case insensitive filesystem */
public class C26710DAk implements E4B {
    public final int A00;
    public final Object A01;

    public C26710DAk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Bzk(int i, int i2) {
        if (this.A00 != 0) {
            C22809BPx bPx = (C22809BPx) this.A01;
            if (bPx.A00 != i) {
                bPx.A00 = i;
                Iterator A0j = C17890vO.A0j(bPx.A04);
                while (A0j.hasNext()) {
                    ((C25742ClC) A0j.next()).A01 = bPx.A00;
                }
                return;
            }
            return;
        }
        C22808BPw bPw = (C22808BPw) this.A01;
        bPw.A0i.Bzj(i2);
        C22808BPw.A03(bPw, bPw.A0S);
    }
}
