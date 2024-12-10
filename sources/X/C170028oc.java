package X;

import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.8oc  reason: invalid class name and case insensitive filesystem */
public final class C170028oc extends AnonymousClass1KF {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11P A02;

    public void A03(C20942Abw abw, UserJid userJid) {
    }

    public void A04(UserJid userJid) {
    }

    public void A05(UserJid userJid, long j) {
    }

    public void A02() {
        AnonymousClass00H r7 = this.A00;
        Iterator it = ((C1770096u) r7.get()).A09().iterator();
        while (it.hasNext()) {
            C19977A1n a1n = (C19977A1n) it.next();
            if (System.currentTimeMillis() - a1n.A00 > C19977A1n.A03) {
                C22941Dw r0 = UserJid.Companion;
                ((C1770096u) r7.get()).A0B(C22941Dw.A03(a1n.A02));
            }
        }
    }

    public C170028oc(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.A0A != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r3.A0A != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass8BT.A0K(r10)
            if (r5 == 0) goto L_0x009b
            X.00H r4 = r9.A00
            java.lang.Object r0 = r4.get()
            X.96u r0 = (X.C1770096u) r0
            X.A1n r8 = r0.A08(r5)
            if (r8 == 0) goto L_0x009b
            X.9ub r3 = r8.A01
            boolean r2 = r3.A02
            if (r2 != 0) goto L_0x0024
            int r1 = r3.A00
            r0 = 3
            if (r1 != r0) goto L_0x0024
            boolean r0 = r3.A0A
            r7 = 1
            if (r0 == 0) goto L_0x0025
        L_0x0024:
            r7 = 0
        L_0x0025:
            X.9nJ r1 = r3.A00()
            int r0 = r3.A00
            if (r2 == 0) goto L_0x002f
            int r0 = r0 + 1
        L_0x002f:
            r1.A00 = r0
            r0 = 0
            r1.A02 = r0
            X.9ub r6 = r1.A00()
            java.lang.Object r4 = r4.get()
            X.96u r4 = (X.C1770096u) r4
            java.lang.String r3 = r8.A02
            long r1 = java.lang.System.currentTimeMillis()
            X.A1n r0 = new X.A1n
            r0.<init>(r6, r3, r1)
            r4.A0A(r0)
            boolean r0 = r6.A02
            if (r0 != 0) goto L_0x005a
            int r1 = r6.A00
            r0 = 3
            if (r1 != r0) goto L_0x005a
            boolean r1 = r6.A0A
            r0 = 1
            if (r1 == 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            if (r7 != 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            X.00H r0 = r9.A01
            java.util.Iterator r6 = X.AnonymousClass8BX.A0m(r0)
        L_0x0065:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r0 = r6.next()
            X.2aZ r0 = (X.C52222aZ) r0
            X.00H r0 = r0.A00
            java.lang.Object r4 = r0.get()
            X.6jq r4 = (X.C130686jq) r4
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            X.00H r0 = r4.A05
            java.lang.Object r0 = r0.get()
            X.6m0 r0 = (X.C131996m0) r0
            X.0ve r2 = r0.A01
            r1 = 3981(0xf8d, float:5.579E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0065
            X.10I r2 = r4.A03
            r1 = 7
            X.7R0 r0 = new X.7R0
            r0.<init>(r4, r5, r3, r1)
            r2.CGF(r0)
            goto L_0x0065
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170028oc.A06(X.206):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.9nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.9nJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.9nJ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass206 r7) {
        /*
            r6 = this;
            com.whatsapp.jid.UserJid r3 = X.AnonymousClass8BT.A0K(r7)
            if (r3 == 0) goto L_0x0040
            X.00H r2 = r6.A00
            java.lang.Object r0 = r2.get()
            X.96u r0 = (X.C1770096u) r0
            X.A1n r0 = r0.A08(r3)
            if (r0 != 0) goto L_0x0041
            X.Abw r1 = X.AnonymousClass2UZ.A00(r7)
            boolean r0 = r1 instanceof X.AnonymousClass8oR
            if (r0 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x0040
            X.9nJ r1 = new X.9nJ
            r1.<init>()
        L_0x0023:
            r0 = 1
            r1.A02 = r0
            java.lang.Object r5 = r2.get()
            X.96u r5 = (X.C1770096u) r5
            java.lang.String r4 = r3.getRawString()
            X.9ub r3 = r1.A00()
            long r1 = java.lang.System.currentTimeMillis()
            X.A1n r0 = new X.A1n
            r0.<init>(r3, r4, r1)
            r5.A0A(r0)
        L_0x0040:
            return
        L_0x0041:
            X.9ub r0 = r0.A01
            X.9nJ r1 = r0.A00()
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170028oc.A07(X.206):void");
    }
}
