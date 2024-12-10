package X;

import android.content.Context;
import android.net.Uri;

public class ALX implements AnonymousClass1L8 {
    public final AnonymousClass1KB A00;
    public final C36361nl A01;
    public final AnonymousClass1PM A02;
    public final AnonymousClass11C A03;
    public final C18000vb A04;
    public final C32981i4 A05;
    public final C18030ve A06;
    public final AnonymousClass1QJ A07;
    public final AnonymousClass1QS A08;
    public final C31041ev A09;
    public final AnonymousClass10I A0A;
    public final AnonymousClass1L9 A0B;
    public final AnonymousClass11P A0C;
    public final AnonymousClass1QL A0D;
    public final AnonymousClass1QE A0E = AnonymousClass1QE.A00("PaymentActivityLauncher", "infra", "COMMON");

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        if (r4.A08.A06.A00.A09(X.AnonymousClass18O.A0V) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.Intent A00(android.content.Context r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            r2 = 1
            if (r7 != 0) goto L_0x0015
            if (r6 != 0) goto L_0x0014
            X.1QS r0 = r4.A08
            X.1QO r0 = r0.A06
            X.18O r1 = r0.A00
            X.18R r0 = X.AnonymousClass18O.A0V
            boolean r0 = r1.A09(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0015
        L_0x0014:
            r6 = 1
        L_0x0015:
            java.lang.String r3 = "extra_setup_mode"
            X.1QL r1 = r4.A0D
            boolean r0 = r1.A0C()
            if (r6 != 0) goto L_0x0049
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.A0F()
            if (r0 != 0) goto L_0x006d
            X.1QS r1 = r4.A08
            X.BD1 r0 = r1.A06()
            boolean r0 = r0.BEG()
            if (r0 != 0) goto L_0x006d
            X.BD1 r0 = r1.A06()
            java.lang.Class r0 = r0.BMM()
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r5, r0)
            r0 = 2
            r1.putExtra(r3, r0)
        L_0x0043:
            java.lang.String r0 = "extra_is_pay_money_only"
            r1.putExtra(r0, r6)
            return r1
        L_0x0049:
            if (r0 != 0) goto L_0x006d
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x006d
            X.1QS r1 = r4.A08
            X.BD1 r0 = r1.A06()
            boolean r0 = r0.BEG()
            if (r0 != 0) goto L_0x006d
            X.BD1 r0 = r1.A06()
            java.lang.Class r0 = r0.BMM()
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r5, r0)
            r1.putExtra(r3, r2)
            goto L_0x0043
        L_0x006d:
            X.1QS r0 = r4.A08
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BYz()
            android.content.Intent r1 = X.AnonymousClass8BR.A07(r5, r0)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALX.A00(android.content.Context, boolean, boolean):android.content.Intent");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CGU(android.content.Context r13, android.net.Uri r14, X.AnonymousClass206 r15) {
        /*
            r12 = this;
            r5 = r12
            if (r14 != 0) goto L_0x000b
            X.1QE r1 = r12.A0E
            java.lang.String r0 = "start-activity/uri-is-null"
            r1.A05(r0)
        L_0x000a:
            return
        L_0x000b:
            X.7Ik r3 = X.AnonymousClass8BR.A0Z()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            java.lang.String r1 = r14.getLastPathSegment()
            java.lang.String r0 = "paymentHandle"
            X.77e r3 = X.AnonymousClass8BR.A0Y(r3, r2, r1, r0)
            java.lang.String r1 = "wapay"
            java.lang.String r0 = r14.getScheme()
            boolean r0 = r1.equals(r0)
            r2 = 0
            if (r0 == 0) goto L_0x00b1
            boolean r0 = X.C20061A5k.A02(r3)
            if (r0 != 0) goto L_0x00b1
            if (r15 == 0) goto L_0x00af
            X.205 r1 = r15.A0v
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x00af
            X.1BI r0 = r1.A00
            com.whatsapp.jid.UserJid r4 = X.C22941Dw.A00(r0)
        L_0x003c:
            r1 = 1
            android.content.Intent r2 = r12.A00(r13, r2, r1)
            java.lang.String r0 = "extra_payment_handle"
            r2.putExtra(r0, r3)
            java.lang.String r0 = "verify-vpa-in-background"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "vpa_handle_chat"
            r2.putExtra(r1, r0)
            if (r4 == 0) goto L_0x00ac
            java.lang.String r1 = r4.getRawString()
        L_0x0058:
            java.lang.String r0 = "extra_chat_jid"
            r2.putExtra(r0, r1)
            X.1L9 r0 = r12.A0B
            r0.A08(r13, r2)
            if (r15 == 0) goto L_0x000a
            X.11P r0 = r12.A0C
            long r10 = X.AnonymousClass11P.A01(r0)
            java.lang.Object r8 = r3.A00
            java.lang.String r8 = (java.lang.String) r8
            X.205 r7 = r15.A0v
            X.1PM r1 = r12.A02
            X.1BI r0 = r7.A00
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r0)
            X.1yf r6 = r1.A01(r0)
            X.0ve r2 = r12.A06
            r1 = 4288(0x10c0, float:6.009E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x000a
            boolean r0 = r7.A02
            if (r0 != 0) goto L_0x000a
            if (r6 == 0) goto L_0x000a
            boolean r0 = r6.A02()
            if (r0 != 0) goto L_0x009a
            boolean r0 = r6.A03()
            if (r0 == 0) goto L_0x000a
        L_0x009a:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x000a
            X.10I r0 = r12.A0A
            r9 = 0
            X.3CG r4 = new X.3CG
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.CGF(r4)
            return
        L_0x00ac:
            java.lang.String r1 = ""
            goto L_0x0058
        L_0x00af:
            r4 = 0
            goto L_0x003c
        L_0x00b1:
            java.lang.String r1 = "upi"
            java.lang.String r0 = r14.getScheme()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00c3
            X.1nl r0 = r12.A01
            r0.CGU(r13, r14, r15)
            return
        L_0x00c3:
            X.1i4 r0 = r12.A05
            int r1 = r0.A0E(r14)
            r0 = 21
            if (r1 != r0) goto L_0x00f1
            X.1QS r0 = r12.A08
            X.BD1 r0 = r0.A06()
            java.lang.Class r0 = r0.BWy()
            if (r0 == 0) goto L_0x000a
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = r0.getName()
            r2.setClassName(r1, r0)
            r2.setData(r14)
            X.1L9 r0 = r12.A0B
            r0.A08(r13, r2)
            return
        L_0x00f1:
            X.1QE r1 = r12.A0E
            java.lang.String r0 = "start-activity/uri-is-not-wapay-compatible"
            r1.A05(r0)
            X.1KB r1 = r12.A00
            r0 = 2131886448(0x7f120170, float:1.9407475E38)
            r1.A08(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ALX.CGU(android.content.Context, android.net.Uri, X.206):void");
    }

    public void CGV(Context context, Uri uri, AnonymousClass206 r3, int i) {
    }

    public void CGW(Context context, Uri uri, AnonymousClass206 r3, int i, int i2) {
    }

    public ALX(AnonymousClass1L9 r4, AnonymousClass1KB r5, C36361nl r6, AnonymousClass1PM r7, AnonymousClass11C r8, AnonymousClass11P r9, C18000vb r10, C32981i4 r11, C18030ve r12, AnonymousClass1QL r13, AnonymousClass1QJ r14, AnonymousClass1QS r15, C31041ev r16, AnonymousClass10I r17) {
        this.A0C = r9;
        this.A06 = r12;
        this.A00 = r5;
        this.A0A = r17;
        this.A01 = r6;
        this.A0B = r4;
        this.A04 = r10;
        this.A05 = r11;
        this.A03 = r8;
        this.A08 = r15;
        this.A0D = r13;
        this.A02 = r7;
        this.A07 = r14;
        this.A09 = r16;
    }
}
