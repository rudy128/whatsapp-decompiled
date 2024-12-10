package X;

import java.util.List;

/* renamed from: X.DNt  reason: case insensitive filesystem */
public class C26971DNt implements C28669EDl {
    public final C24956CRg A00;
    public final COJ A01;
    public final Object[] A02;
    public final Object[] A03;

    public /* bridge */ /* synthetic */ E8A BFz(E9O e9o) {
        COJ coj;
        COJ coj2 = this.A01;
        if (coj2 != null) {
            E9O e9o2 = coj2.A00;
            E9O e9o3 = e9o2;
            if (!(e9o == null || e9o2 == null)) {
                e9o2 = e9o2.Bie(e9o);
            }
            if (null == coj2.A01 && e9o2 == e9o3) {
                coj = coj2;
            } else {
                coj = new COJ(e9o2, (List) null);
            }
            if (coj != coj2) {
                return new C26971DNt(this.A00, coj, this.A02, this.A03);
            }
        }
        return this;
    }

    public void BKO() {
    }

    public C26971DNt CQH() {
        return this;
    }

    public E9O BZU() {
        COJ coj = this.A01;
        if (coj == null) {
            return null;
        }
        return coj.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r5.length > 0) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C26971DNt(X.C24956CRg r3, X.COJ r4, java.lang.Object[] r5, java.lang.Object[] r6) {
        /*
            r2 = this;
            r2.<init>()
            X.C25344Ce3.A00(r3)
            r2.A00 = r3
            r2.A02 = r5
            r2.A03 = r6
            r2.A01 = r4
            if (r5 == 0) goto L_0x0014
            int r0 = r5.length
            r1 = 0
            if (r0 <= 0) goto L_0x0015
        L_0x0014:
            r1 = 1
        L_0x0015:
            java.lang.String r0 = "boundArgs must not be empty; use null"
            X.C25344Ce3.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26971DNt.<init>(X.CRg, X.COJ, java.lang.Object[], java.lang.Object[]):void");
    }
}
