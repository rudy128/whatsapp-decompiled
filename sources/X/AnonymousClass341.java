package X;

import java.util.Set;

/* renamed from: X.341  reason: invalid class name */
public final class AnonymousClass341 implements C72443Lz {
    public final C19880zA A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C19880zA A05;
    public final AnonymousClass190 A06;
    public final AnonymousClass1PM A07;
    public final C25491Ok A08;
    public final AnonymousClass1CM A09;

    public AnonymousClass341(C19880zA r1, C19880zA r2, AnonymousClass190 r3, AnonymousClass1PM r4, C25491Ok r5, C18030ve r6, AnonymousClass1CM r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r6, r3, r4, r1, r7);
        C18070vi.A0x(r8, r9, r2, r10, r5);
        this.A01 = r6;
        this.A06 = r3;
        this.A07 = r4;
        this.A05 = r1;
        this.A09 = r7;
        this.A02 = r8;
        this.A03 = r9;
        this.A00 = r2;
        this.A04 = r10;
        this.A08 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x017d, code lost:
        if (r2.containsKey(X.C179569Im.A07) == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01b1, code lost:
        if (r10.BVU(r2, 1) <= 0) goto L_0x017f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BLq(X.C196049uN r13, X.C195829ty r14, X.A1O r15) {
        /*
            r12 = this;
            X.C18070vi.A0h(r15, r14)
            X.206 r1 = r14.A03
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            com.whatsapp.jid.Jid r3 = r15.A06
            X.1PM r0 = r12.A07
            com.whatsapp.jid.UserJid r6 = X.C22941Dw.A00(r3)
            X.1yf r2 = r0.A01(r6)
            X.1BI r0 = X.C22971Dz.A00(r3)
            X.C17960vV.A07(r0)
            X.C18070vi.A0X(r0)
            java.lang.String r0 = "biz"
            X.1cX r7 = new X.1cX
            r7.<init>((java.lang.String) r0)
            X.0zA r3 = r12.A00
            boolean r0 = r3.A07()
            if (r0 == 0) goto L_0x0038
            r3.A03()
            java.lang.String r0 = "isPremiumMessageChat"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0038:
            boolean r0 = r1 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x0054
            X.00H r0 = r12.A04
            java.lang.Object r3 = r0.get()
            X.1y1 r3 = (X.C42341y1) r3
            r0 = r1
            X.21K r0 = (X.AnonymousClass21K) r0
            X.A6j r3 = r3.A01(r0)
            if (r3 == 0) goto L_0x0054
            boolean r0 = r3 instanceof X.C1773998k
            if (r0 == 0) goto L_0x01bb
            r3.A0I(r7)
        L_0x0054:
            if (r2 == 0) goto L_0x0087
            boolean r0 = r2.A02()
            if (r0 == 0) goto L_0x0087
            int r11 = r2.A01
            if (r11 <= 0) goto L_0x0087
            int r10 = r2.A00
            if (r10 <= 0) goto L_0x0087
            long r3 = r2.A04
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            java.lang.String r8 = java.lang.String.valueOf(r10)
            java.lang.String r0 = "actual_actors"
            X.C29591cX.A01(r7, r0, r8)
            java.lang.String r8 = java.lang.String.valueOf(r11)
            java.lang.String r0 = "host_storage"
            X.C29591cX.A01(r7, r0, r8)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r0 = "privacy_mode_ts"
            X.C29591cX.A01(r7, r0, r3)
        L_0x0087:
            java.util.List r0 = r7.A02
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0097
            java.util.List r0 = r7.A03
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x009e
        L_0x0097:
            X.1ca r0 = r7.A03()
            r5.add(r0)
        L_0x009e:
            X.1Ok r0 = r12.A08
            boolean r6 = r0.A00(r6)
            X.00H r0 = r12.A02
            java.lang.Object r3 = r0.get()
            X.2aA r3 = (X.C51972aA) r3
            if (r1 == 0) goto L_0x0130
            X.Abw r0 = X.AnonymousClass2UZ.A00(r1)
            if (r0 == 0) goto L_0x0130
            X.Abw r0 = X.AnonymousClass2UZ.A00(r1)
            boolean r0 = r0 instanceof X.AnonymousClass8oR
            if (r0 == 0) goto L_0x0130
            X.0ve r4 = r3.A00
            r0 = 5776(0x1690, float:8.094E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0130
            if (r2 == 0) goto L_0x0125
            boolean r0 = r2.A01()
            if (r0 == 0) goto L_0x0125
        L_0x00d0:
            X.Abw r2 = X.AnonymousClass2UZ.A00(r1)
            boolean r0 = r2 instanceof X.AnonymousClass8oR
            if (r0 == 0) goto L_0x0130
            X.8oR r2 = (X.AnonymousClass8oR) r2
            if (r2 == 0) goto L_0x0130
            r0 = 11035(0x2b1b, float:1.5463E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0123
            java.lang.String r4 = r2.A07
        L_0x00e6:
            java.lang.String r1 = r2.A06
            java.lang.String r0 = "FB_Ads"
            boolean r0 = X.C18070vi.A18(r1, r0)
            java.lang.String r3 = r2.A05
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "conversion_source"
            X.C17890vO.A11(r0, r1, r2)
            java.lang.String r0 = "conversion_data"
            X.C17890vO.A11(r0, r3, r2)
            if (r4 == 0) goto L_0x010a
            java.lang.String r0 = "signals"
            X.C17890vO.A11(r0, r4, r2)
        L_0x010a:
            r0 = 0
            X.1MD[] r0 = new X.AnonymousClass1MD[r0]
            java.lang.Object[] r1 = r2.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            java.lang.String r0 = "ctwa"
            X.1ca r2 = new X.1ca
            r2.<init>(r0, r1)
        L_0x011a:
            r5.add(r2)
        L_0x011d:
            java.util.List r0 = r15.A0A
            r0.addAll(r5)
            return
        L_0x0123:
            r4 = 0
            goto L_0x00e6
        L_0x0125:
            r0 = 11538(0x2d12, float:1.6168E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0130
            if (r6 == 0) goto L_0x0130
            goto L_0x00d0
        L_0x0130:
            X.0ve r2 = r12.A01
            r3 = 0
            r0 = 11655(0x2d87, float:1.6332E-41)
            X.0vf r8 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r8, r2, r0)
            if (r0 == 0) goto L_0x011d
            X.00H r0 = r12.A03
            java.lang.Object r4 = r0.get()
            X.2do r4 = (X.C54232do) r4
            r7 = 0
            if (r1 == 0) goto L_0x011d
            X.Abw r6 = X.AnonymousClass2UZ.A00(r1)
            if (r6 == 0) goto L_0x011d
            boolean r0 = r6 instanceof X.AnonymousClass8oQ
            if (r0 == 0) goto L_0x011d
            X.8oQ r6 = (X.AnonymousClass8oQ) r6
            X.0ve r2 = r4.A02
            r0 = 12761(0x31d9, float:1.7882E-41)
            int r2 = X.C18020vd.A00(r8, r2, r0)
            r0 = 1
            if (r2 == r0) goto L_0x01b8
            r0 = 2
            if (r2 == r0) goto L_0x01b5
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x0164:
            int r2 = r0.intValue()
            if (r2 == r3) goto L_0x018f
            r0 = 1
            if (r2 != r0) goto L_0x017f
            java.util.Map r2 = r6.A02
            X.9Im r0 = X.C179569Im.PARTNER_NAME
            boolean r0 = r2.containsKey(r0)
            if (r0 != 0) goto L_0x017f
            X.9Im r0 = X.C179569Im.PROVISIONAL_PARTNER_TOKEN
            boolean r0 = r2.containsKey(r0)
            if (r0 == 0) goto L_0x018f
        L_0x017f:
            org.json.JSONObject r0 = r6.A02()
            java.lang.String r1 = X.C18070vi.A0H(r0)
            java.lang.String r0 = "ctwa_attribution"
            X.1ca r2 = new X.1ca
            r2.<init>((java.lang.String) r0, (java.lang.String) r1, (X.AnonymousClass1MD[]) r7)
            goto L_0x011a
        L_0x018f:
            X.205 r0 = r1.A0v
            X.1BI r1 = r0.A00
            if (r1 == 0) goto L_0x011d
            X.1LW r0 = r4.A00
            long r2 = r0.A09(r1)
            X.121 r10 = r4.A01
            r0 = 2
            long r8 = r10.BVV(r2, r0)
            r0 = 1
            int r4 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x011d
            long r3 = r10.BVU(r2, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x017f
            goto L_0x011d
        L_0x01b5:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0164
        L_0x01b8:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0164
        L_0x01bb:
            java.util.List r0 = r7.A02
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0054
            java.util.List r0 = r7.A03
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 != 0) goto L_0x0054
            X.1ca r0 = r3.A06()
            if (r0 == 0) goto L_0x0054
            X.1cX r7 = new X.1cX
            r7.<init>((X.C29621ca) r0)
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass341.BLq(X.9uN, X.9ty, X.A1O):void");
    }

    public AnonymousClass9IM Ba7() {
        return AnonymousClass9IM.BUSINESS;
    }

    public /* synthetic */ Set CGJ() {
        return C25511Om.A00;
    }

    public /* synthetic */ Set CGK() {
        return C25511Om.A00;
    }
}
