package X;

import com.whatsapp.jid.GroupJid;
import java.util.Collection;

/* renamed from: X.3mC  reason: invalid class name and case insensitive filesystem */
public final class C75953mC extends AnonymousClass4VY {
    public boolean A00;
    public final AnonymousClass1VE A01;
    public final AnonymousClass4Cl A02;
    public final AnonymousClass1MW A03;
    public final C18030ve A04;
    public final GroupJid A05;
    public final C18100vl A06;
    public final boolean A07;
    public final boolean A08;
    public final int A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r9, r2) == 2) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r9, 11615) == 1) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C75953mC(X.AnonymousClass1VE r4, X.AnonymousClass4Cl r5, X.C86104Qe r6, X.AnonymousClass1M9 r7, X.AnonymousClass1MW r8, X.C18030ve r9, com.whatsapp.jid.GroupJid r10, int r11, boolean r12) {
        /*
            r3 = this;
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            r0 = 3
            X.C72473Md.A1M(r9, r8, r4, r0)
            r3.<init>(r6, r7)
            r3.A04 = r9
            r3.A03 = r8
            r3.A01 = r4
            r3.A05 = r10
            r3.A09 = r11
            r3.A07 = r12
            if (r12 == 0) goto L_0x004b
            r0 = 25
            r2 = 11617(0x2d61, float:1.6279E-41)
            if (r11 != r0) goto L_0x0041
            r1 = 11615(0x2d5f, float:1.6276E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r9, r1)
            r0 = 1
            r2 = 11615(0x2d5f, float:1.6276E-41)
            if (r1 != r0) goto L_0x0041
        L_0x002c:
            r0 = 1
        L_0x002d:
            r3.A08 = r0
            if (r0 == 0) goto L_0x0033
            X.4Cl r5 = X.AnonymousClass4Cl.Both
        L_0x0033:
            r3.A02 = r5
            X.5CM r0 = new X.5CM
            r0.<init>(r3)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r3.A06 = r0
            return
        L_0x0041:
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r9, r2)
            r0 = 2
            if (r1 != r0) goto L_0x004b
            goto L_0x002c
        L_0x004b:
            r0 = 0
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75953mC.<init>(X.1VE, X.4Cl, X.4Qe, X.1M9, X.1MW, X.0ve, com.whatsapp.jid.GroupJid, int, boolean):void");
    }

    public AnonymousClass4ZN A03(Collection collection, boolean z) {
        if (!this.A07) {
            return A05(false);
        }
        if (C72453Mb.A0I(this.A06) >= C18020vd.A00(C18040vf.A02, this.A04, 11520) || this.A09 != 25) {
            return super.A03(collection, z);
        }
        return AnonymousClass3MX.A0t(2131895618);
    }
}
