package com.whatsapp.payments.ui;

import X.A0B;
import X.A46;
import X.A7B;
import X.A7U;
import X.AGC;
import X.AH2;
import X.AXS;
import X.AZ6;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1KN;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BY;
import X.AnonymousClass8FZ;
import X.AnonymousClass8pN;
import X.AnonymousClass8pS;
import X.AnonymousClass91S;
import X.AnonymousClass91U;
import X.C137116uw;
import X.C1418477e;
import X.C175818zK;
import X.C175838zM;
import X.C175978za;
import X.C18070vi;
import X.C182589Uy;
import X.C186949f1;
import X.C189669jc;
import X.C195859u1;
import X.C197889xR;
import X.C20284AEs;
import X.C20337AGt;
import X.C20752AXh;
import X.C29591cX;
import X.C29601cY;
import X.C30931ek;
import X.C31061ex;
import X.C33711jG;
import X.C63662tU;
import X.C63932tv;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;

public class IndiaUpiCheckBalanceActivity extends AnonymousClass91S {
    public C182589Uy A00;
    public AnonymousClass8pN A01;
    public AnonymousClass1KI A02;
    public C1418477e A03;
    public AnonymousClass8FZ A04;
    public boolean A05;
    public final AnonymousClass1QE A06;

    public static void A03(IndiaUpiCheckBalanceActivity indiaUpiCheckBalanceActivity, String str) {
        AnonymousClass8pN r1 = indiaUpiCheckBalanceActivity.A01;
        indiaUpiCheckBalanceActivity.A5C((AnonymousClass8pS) r1.A08, str, r1.A0B, (String) indiaUpiCheckBalanceActivity.A03.A00, (String) C20284AEs.A02(r1), 4);
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            AnonymousClass91U.A1V(r2, r1, this);
            AnonymousClass91U.A1Q(A002, r2, r1, this, r2.A7z);
            AnonymousClass91U.A1P(A002, r2, r1, AnonymousClass8BU.A0E(r2), this);
            AnonymousClass91U.A1Y(r2, this);
            AnonymousClass91U.A1W(r2, r1, this);
            AnonymousClass91U.A1T(A002, r2, r1, this);
            this.A02 = AnonymousClass8BT.A0I(r2);
            this.A00 = (C182589Uy) A002.A4N.get();
        }
    }

    public void A5E(HashMap hashMap) {
        C1418477e r3;
        this.A06.A06("onGetCredentials called");
        AnonymousClass8FZ r2 = this.A04;
        A46.A00(r2.A02.A00, r2.A01, 2131890771);
        AnonymousClass8pN r7 = r2.A04;
        AnonymousClass8pS r1 = (AnonymousClass8pS) r7.A08;
        C1418477e r4 = r1.A08;
        if (!(r4 == null || (r3 = r1.A05) == null)) {
            HashMap hashMap2 = hashMap;
            if (hashMap != null) {
                String str = r1.A0A;
                C175818zK r0 = r2.A05;
                String str2 = r1.A0E;
                C1418477e r5 = r2.A00;
                String str3 = r7.A0A;
                C189669jc r12 = new C189669jc(r2);
                AnonymousClass1OZ r31 = r0.A03;
                String A0B = r31.A0B();
                String A07 = r0.A04.A07("MPIN", hashMap2, 4);
                if (A07 == null) {
                    r12.A00((AnonymousClass1KN) null, (AnonymousClass1KN) null, A7B.A00());
                    return;
                }
                String A0h = AnonymousClass8BS.A0h(r5);
                String str4 = r0.A08;
                String A0h2 = AnonymousClass8BS.A0h(r4);
                String A0h3 = AnonymousClass8BS.A0h(r3);
                String A012 = r0.A07.A01();
                C18070vi.A0d(str3, 2);
                C18070vi.A0d(A0h, 3);
                C18070vi.A0d(str4, 4);
                C18070vi.A0d(A0h2, 6);
                C18070vi.A0d(A0h3, 8);
                String[] strArr = new String[10];
                strArr[0] = "CREDIT";
                strArr[1] = "CREDIT_LINE";
                strArr[2] = "CURRENT";
                strArr[3] = "DEFAULT";
                strArr[4] = "NRE";
                strArr[5] = "NRO";
                strArr[6] = "OD_SECURED";
                strArr[7] = "OD_UNSECURED";
                strArr[8] = "SAVINGS";
                List A0O = C18070vi.A0O("UNKNOWN", strArr, 9);
                C29591cX A0O2 = AnonymousClass8BY.A0O();
                AnonymousClass8BY.A16(A0O2, "w:pay");
                AnonymousClass8BY.A15(A0O2, A0B);
                C29591cX A0R = AnonymousClass8BS.A0R();
                C29591cX.A01(A0R, "action", "upi-check-balance");
                if (AnonymousClass8BV.A1Y(str3, 1, false)) {
                    C29591cX.A01(A0R, "credential-id", str3);
                }
                if (C29601cY.A04(A0h, 35, 35, false)) {
                    C29591cX.A01(A0R, "seq-no", A0h);
                }
                AnonymousClass8BY.A1C(A0R, str4, false);
                if (AnonymousClass8BV.A1Y(A07, 0, false)) {
                    C29591cX.A01(A0R, "mpin", A07);
                }
                if (C29601cY.A04(A0h2, 1, 100, false)) {
                    C29591cX.A01(A0R, "vpa", A0h2);
                }
                if (str2 != null && C29601cY.A04(str2, 1, 100, true)) {
                    C29591cX.A01(A0R, "vpa-id", str2);
                }
                if (AnonymousClass8BU.A1Z(A0h3, 0, false)) {
                    C29591cX.A01(A0R, "upi-bank-info", A0h3);
                }
                if (A012 != null && C29601cY.A04(A012, 1, 1000, true)) {
                    C29591cX.A01(A0R, "device_ssid", A012);
                }
                A0R.A08(str, "account_type", A0O);
                AnonymousClass1OZ r9 = r31;
                r9.A0I(new C175978za(r0.A00, r0.A01, r0.A05, C197889xR.A04(r0, "upi-check-balance"), r0, r12), C29591cX.A00(A0R, A0O2), A0B, 204, 0);
                return;
            }
        }
        r2.A06.A05("vpaHandle, miscBankInfo or credentials is null");
        C186949f1 r13 = new C186949f1(1);
        r13.A00 = A7B.A00();
        r2.A07.A0F(r13);
    }

    public void C5K(A7B a7b) {
        throw new UnsupportedOperationException(this.A06.A03("onSetPin unsupported"));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = (AnonymousClass8pN) AnonymousClass91U.A1I(this);
        AnonymousClass1KB r5 = this.A05;
        AnonymousClass1OZ A0M = AnonymousClass8BT.A0M(this);
        C30931ek r0 = this.A0A;
        A0B a0b = this.A09;
        A7U a7u = this.A0M;
        C31061ex r10 = this.A0N;
        C195859u1 r11 = this.A05;
        AZ6 az6 = this.A0S;
        C33711jG A0S = AnonymousClass8BT.A0S(this);
        AXS axs = this.A0N;
        this.A07 = new C175838zM(this, r5, A0M, a7u, axs, A0S, r10, r11, this, az6, a0b, this.A0V, r0);
        this.A03 = AnonymousClass8BR.A0Y(AnonymousClass8BR.A0Z(), String.class, A4m(axs.A0F()), "upiSequenceNumber");
        AnonymousClass1KB r52 = this.A05;
        AnonymousClass1OZ A0M2 = AnonymousClass8BT.A0M(this);
        C30931ek r13 = this.A0A;
        A7U a7u2 = this.A0M;
        A0B a0b2 = this.A09;
        AnonymousClass8FZ r2 = (AnonymousClass8FZ) AnonymousClass8BR.A0C(new AH2(new C175818zK(this, r52, this.A02, A0M2, a7u2, AnonymousClass8BT.A0S(this), this.A0N, this.A05, a0b2, r13), this, 2), this).A00(AnonymousClass8FZ.class);
        this.A04 = r2;
        r2.A01.A0A(this, new C20337AGt(this, 7));
        AnonymousClass8FZ r22 = this.A04;
        r22.A07.A0A(this, new C20337AGt(this, 8));
        A44(getString(2131895077));
        A59(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        return A52(X.C21447AkE.A00(r10, r0), r5, r6, r7, r8, r9);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog onCreateDialog(int r11) {
        /*
            r10 = this;
            r0 = 27
            r3 = r10
            r7 = r11
            if (r11 == r0) goto L_0x004f
            r0 = 28
            if (r11 == r0) goto L_0x0048
            switch(r11) {
                case 10: goto L_0x0029;
                case 11: goto L_0x0048;
                case 12: goto L_0x0012;
                default: goto L_0x000d;
            }
        L_0x000d:
            android.app.Dialog r0 = super.onCreateDialog(r11)
            return r0
        L_0x0012:
            r0 = 2131897425(0x7f122c51, float:1.942974E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131897424(0x7f122c50, float:1.9429737E38)
            java.lang.String r6 = r10.getString(r0)
            r8 = 2131899101(0x7f1232dd, float:1.9433138E38)
            r9 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 17
            goto L_0x003f
        L_0x0029:
            r0 = 2131897423(0x7f122c4f, float:1.9429735E38)
            java.lang.String r5 = r10.getString(r0)
            r0 = 2131897422(0x7f122c4e, float:1.9429733E38)
            java.lang.String r6 = r10.getString(r0)
            r8 = 2131894173(0x7f121f9d, float:1.9423143E38)
            r9 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 16
        L_0x003f:
            X.AkE r4 = X.C21447AkE.A00(r10, r0)
            X.05w r0 = r3.A52(r4, r5, r6, r7, r8, r9)
            return r0
        L_0x0048:
            X.8pN r0 = r10.A01
            android.app.Dialog r0 = r10.A50(r0, r11)
            return r0
        L_0x004f:
            X.3Rj r2 = X.AnonymousClass4a6.A00(r10)
            r0 = 2131888266(0x7f12088a, float:1.9411162E38)
            r2.A0D(r0)
            r0 = 2131888267(0x7f12088b, float:1.9411165E38)
            r2.A0E(r0)
            r1 = 2131899286(0x7f123396, float:1.9433514E38)
            r0 = 14
            X.C20154A9q.A00(r2, r10, r0, r1)
            X.05w r0 = r2.create()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity.onCreateDialog(int):android.app.Dialog");
    }

    public IndiaUpiCheckBalanceActivity(int i) {
        this.A05 = false;
        AGC.A00(this, 49);
    }

    public void Bwk(A7B a7b, String str) {
        Integer num;
        if (!TextUtils.isEmpty(str)) {
            this.A06.A06("onListKeys called");
            A03(this, str);
        } else if (a7b != null && !C20752AXh.A01(this, "upi-list-keys", a7b.A00, false)) {
            if (this.A04.A05("upi-list-keys")) {
                AnonymousClass91U.A1b(this);
                A59(this.A01);
                return;
            }
            AnonymousClass1QE r2 = this.A06;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("onListKeys: ");
            if (str != null) {
                num = AnonymousClass8BT.A0j(str);
            } else {
                num = null;
            }
            A10.append(num);
            AnonymousClass8BV.A1E(r2, " failed; ; showErrorAndFinish", A10);
            A56();
        }
    }

    public IndiaUpiCheckBalanceActivity() {
        this(0);
        this.A06 = AnonymousClass1QE.A00("IndiaUpiCheckPinActivity", "payment-settings", "IN");
    }
}
