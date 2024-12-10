package com.whatsapp.payments.ui;

import X.A43;
import X.A46;
import X.A7B;
import X.A8C;
import X.ADI;
import X.AGD;
import X.ARR;
import X.AW0;
import X.AY8;
import X.AYN;
import X.AYO;
import X.AYP;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1E8;
import X.AnonymousClass1K1;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1KN;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4A4;
import X.AnonymousClass4a6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass8BY;
import X.AnonymousClass8GL;
import X.AnonymousClass8pI;
import X.AnonymousClass8pS;
import X.AnonymousClass91U;
import X.AnonymousClass933;
import X.AnonymousClass9F3;
import X.AnonymousClass9O4;
import X.AnonymousClass9V0;
import X.C010105w;
import X.C108955ca;
import X.C108965cb;
import X.C137116uw;
import X.C1418477e;
import X.C170318pf;
import X.C175758zE;
import X.C175828zL;
import X.C175848zN;
import X.C175858zO;
import X.C175878zQ;
import X.C175978za;
import X.C178749Eh;
import X.C17890vO;
import X.C17960vV;
import X.C18070vi;
import X.C190779lV;
import X.C191339mR;
import X.C196219ue;
import X.C196259ui;
import X.C197889xR;
import X.C20061A5k;
import X.C20121A8g;
import X.C20128A8n;
import X.C20160A9w;
import X.C20163A9z;
import X.C20274AEh;
import X.C20284AEs;
import X.C22450B8i;
import X.C22565BDa;
import X.C29591cX;
import X.C29601cY;
import X.C29621ca;
import X.C31061ex;
import X.C33711jG;
import X.C63662tU;
import X.C63932tv;
import X.C72483Me;
import X.C73203Rj;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class IndiaUpiMandatePaymentActivity extends AnonymousClass933 {
    public int A00;
    public AnonymousClass9V0 A01;
    public PaymentBottomSheet A02;
    public AnonymousClass8GL A03;
    public String A04;
    public boolean A05;
    public final AnonymousClass1QE A06;

    public void BpZ(View view, View view2, C20274AEh aEh, AnonymousClass8pI r5, C20284AEs aEs, PaymentBottomSheet paymentBottomSheet) {
        super.BpZ(view, view2, (C20274AEh) null, r5, aEs, paymentBottomSheet);
        this.A0S.BiI(104, "approve_mandate_prompt", this.A04, 1, true);
    }

    public boolean CN3() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 || (i == 155 && i2 != -1)) {
            finish();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    public static Intent A03(Context context, AW0 aw0, String str, int i) {
        ADI adi;
        Intent A07 = AnonymousClass8BR.A07(context, IndiaUpiMandatePaymentActivity.class);
        C20128A8n a8n = C20128A8n.$redex_init_class;
        if (aw0 == null) {
            adi = null;
        } else {
            adi = new ADI(aw0);
        }
        A07.putExtra("payment_transaction_info", adi);
        A07.putExtra("user_action", i);
        A07.putExtra("extra_referral_screen", str);
        return A07;
    }

    public void A2y() {
        if (!this.A05) {
            this.A05 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r1 = A002.AAQ;
            C63932tv.A02(r1, this);
            AnonymousClass10G r3 = r1.A00;
            C63932tv.A01(r1, r3, this);
            C63662tU.A00(r1, r3, this, r3.A5A);
            AnonymousClass91U.A1V(r1, r3, this);
            AnonymousClass91U.A1Q(A002, r1, r3, this, r1.A7z);
            AnonymousClass91U.A1P(A002, r1, r3, AnonymousClass8BU.A0E(r1), this);
            AnonymousClass91U.A1Y(r1, this);
            AnonymousClass91U.A1W(r1, r3, this);
            AnonymousClass91U.A1T(A002, r1, r3, this);
            this.A06 = AnonymousClass3MY.A0Z(r1);
            this.A04 = (AnonymousClass1KH) r1.A94.get();
            this.A00 = AnonymousClass3MZ.A0e(r1);
            this.A0C = (A8C) r3.A2k.get();
            this.A0D = (A43) r1.AW8.get();
            this.A01 = AnonymousClass3Ma.A0b(r1);
            this.A09 = (C191339mR) r3.AEX.get();
            AnonymousClass933.A0V(r1, AnonymousClass8BT.A0I(r1), this);
            this.A01 = (AnonymousClass9V0) A002.A4P.get();
        }
    }

    public void A5G(C20284AEs aEs, HashMap hashMap) {
        C29621ca r14;
        C175978za r5;
        C31061ex r0;
        int i;
        C196259ui r10;
        C33711jG r9;
        AnonymousClass1KB r8;
        Context context;
        C175848zN r4;
        C22450B8i b8i;
        String str;
        String str2;
        String str3;
        C1418477e r2;
        AnonymousClass4A4 r1;
        String str4;
        C1418477e r52;
        AnonymousClass4A4 r23;
        C20284AEs aEs2 = aEs;
        AnonymousClass8GL r22 = this.A03;
        if (aEs == null) {
            aEs2 = r22.A05;
        }
        r22.A0L.A06("handleCredentialBlob");
        A46.A00(r22.A04.A00, r22.A01, 2131895077);
        AW0 aw0 = r22.A07;
        C170318pf r82 = (C170318pf) aw0.A0A;
        C17960vV.A07(r82);
        HashMap hashMap2 = hashMap;
        switch (r22.A00) {
            case 1:
            case 4:
                AnonymousClass9O4 r83 = r82.A0H.A0C;
                C175848zN r11 = r22.A08;
                AYP ayp = new AYP(aEs2, r83, r22);
                ArrayList A0w = AnonymousClass8BU.A0w("PAY: acceptPayeeMandate called");
                C17890vO.A11("action", "upi-accept-mandate-request", A0w);
                C175848zN.A01(aw0, r11, A0w);
                C175848zN.A00(aEs2, r11, "upi-accept-mandate-request", hashMap2, A0w);
                C170318pf r53 = (C170318pf) aw0.A0A;
                C196219ue r02 = r53.A0H;
                C17960vV.A07(r02);
                C1418477e r24 = r02.A06;
                if (!C20061A5k.A03(r24)) {
                    C17890vO.A11("mandate-info", (String) AnonymousClass8BT.A0q(r24), A0w);
                }
                C175848zN.A02(r83, r53, (String) null, A0w, false);
                C175758zE r25 = r11.A07;
                if (r25 != null) {
                    r25.A00("U66", A0w);
                }
                C196259ui A042 = C197889xR.A04(r11, "upi-accept-mandate-request");
                C29621ca[] A032 = C175848zN.A03(aw0, r11);
                r0 = r11.A01;
                r14 = AnonymousClass8BR.A0l("account", AnonymousClass8BT.A1b(A0w, 0), A032);
                r5 = new C175978za(r11.A00, r11.A02, r11.A06, A042, (C22450B8i) ayp, r11, 5);
                break;
            case 3:
                r4 = r22.A08;
                String str5 = r22.A0A;
                b8i = new AYN(r22);
                ArrayList A0w2 = AnonymousClass8BU.A0w("PAY: revokePayerMandate called");
                C17890vO.A11("action", "upi-revoke-mandate", A0w2);
                C175848zN.A01(aw0, r4, A0w2);
                C175848zN.A02((AnonymousClass9O4) null, (C170318pf) aw0.A0A, str5, A0w2, true);
                C175848zN.A00(aEs2, r4, "upi-revoke-mandate", hashMap2, A0w2);
                r10 = C197889xR.A04(r4, "upi-revoke-mandate");
                C175758zE r26 = r4.A07;
                if (r26 != null) {
                    r26.A00("U66", A0w2);
                }
                C29621ca[] A033 = C175848zN.A03(aw0, r4);
                r0 = r4.A01;
                r14 = AnonymousClass8BR.A0l("account", AnonymousClass8BT.A1b(A0w2, 0), A033);
                context = r4.A00;
                r8 = r4.A02;
                r9 = r4.A06;
                i = 6;
                break;
            case 6:
                r4 = r22.A08;
                String str6 = r22.A0A;
                b8i = new AYO(r82, r22, 1);
                ArrayList A0w3 = AnonymousClass8BU.A0w("PAY: resumePayeeMandate called");
                C17890vO.A11("action", "upi-resume-mandate", A0w3);
                C175848zN.A01(aw0, r4, A0w3);
                C170318pf r27 = (C170318pf) aw0.A0A;
                C17960vV.A07(r27);
                C175848zN.A02((AnonymousClass9O4) null, r27, str6, A0w3, true);
                C17890vO.A11("receiver-name", (String) C20061A5k.A01(r27.A0B), A0w3);
                C175848zN.A00(aEs2, r4, "upi-resume-mandate", hashMap2, A0w3);
                C29621ca[] A034 = C175848zN.A03(aw0, r4);
                C175758zE r12 = r4.A07;
                if (r12 != null) {
                    r12.A00("U66", A0w3);
                }
                r10 = C197889xR.A04(r4, "upi-resume-mandate");
                r0 = r4.A01;
                r14 = AnonymousClass8BR.A0l("account", AnonymousClass8BT.A1b(A0w3, 0), A034);
                context = r4.A00;
                r8 = r4.A02;
                r9 = r4.A06;
                i = 8;
                break;
            case 7:
                AW0 aw02 = r22.A06;
                C1418477e r112 = null;
                if (aw02 != null) {
                    str = (String) AnonymousClass8BT.A0q(((C170318pf) aw02.A0A).A0H.A08);
                } else {
                    str = null;
                }
                if (aEs2 != null) {
                    AnonymousClass8pS r03 = (AnonymousClass8pS) aEs2.A08;
                    if (r03 != null) {
                        r112 = r03.A05;
                    }
                    str2 = aEs2.A0A;
                } else {
                    str2 = null;
                }
                String str7 = aw0.A0K;
                C175828zL r92 = r22.A0H;
                AnonymousClass1KN r102 = aw0.A09;
                String str8 = r82.A0T;
                String str9 = r82.A0U;
                String str10 = r82.A0R;
                String str11 = str10;
                String str12 = str8;
                String str13 = str9;
                r92.A01(r102, r112, new AY8(r22, str7), r22.A0I, r22.A0K, str7, str12, str13, str11, r82.A0S, str2, str, hashMap2);
                return;
            case 8:
                AnonymousClass1E8 A0Q = AnonymousClass3MZ.A0Q(r22.A02);
                C17960vV.A07(aEs2);
                C175848zN r3 = r22.A08;
                C190779lV r113 = new C190779lV(A0Q, aw0, r22);
                Log.i("PAY: createAndApproveMandate called");
                if (hashMap != null) {
                    str3 = r3.A04.A07("MPIN", hashMap2, 8);
                } else {
                    str3 = null;
                }
                C170318pf r6 = (C170318pf) aw0.A0A;
                AnonymousClass8pS r04 = (AnonymousClass8pS) aEs2.A08;
                if (r04 != null) {
                    r2 = r04.A05;
                } else {
                    r2 = null;
                }
                String str14 = aEs2.A0A;
                AnonymousClass1OZ r103 = r3.A03;
                String A0B = r103.A0B();
                C17960vV.A07(r6);
                C196219ue r42 = r6.A0H;
                C17960vV.A07(r42);
                C17960vV.A07(r42.A0G);
                C17960vV.A07(r42.A0E);
                C17960vV.A07(aw0.A09);
                r6.A0T = AnonymousClass8BS.A0h(r3.A05.A0D());
                ARR A012 = r3.A01.A01(aw0.A07, aw0.A09);
                aw0.A08 = A012;
                aw0.A0H = str14;
                C178749Eh r7 = new C178749Eh(String.valueOf(A012.getValue()), String.valueOf(A012.A00), AnonymousClass8BU.A0n(A012), 17);
                String A013 = r3.A08.A01();
                String str15 = r6.A0V;
                String str16 = r6.A0T;
                String str17 = r6.A0R;
                C17960vV.A07(r2);
                String A0h = AnonymousClass8BS.A0h(r2);
                C196219ue r13 = r6.A0H;
                String str18 = (String) AnonymousClass8BT.A0q(r13.A07);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long seconds = timeUnit.toSeconds(r13.A02);
                long seconds2 = timeUnit.toSeconds(r6.A0H.A01);
                C196219ue r05 = r6.A0H;
                String str19 = r05.A0J;
                C17960vV.A07(str3);
                Object A0q = AnonymousClass8BT.A0q(r6.A0B);
                C17960vV.A07(A0q);
                String str20 = (String) A0q;
                Object A0q2 = AnonymousClass8BT.A0q(r05.A0A);
                C17960vV.A07(A0q2);
                String str21 = (String) A0q2;
                String str22 = r6.A0O;
                C17960vV.A07(str22);
                String str23 = r05.A0L;
                String str24 = r05.A0F;
                String A0b = AnonymousClass8BS.A0b(r05.A0N ? 1 : 0);
                String str25 = r05.A0G;
                Locale locale = Locale.US;
                String upperCase = str25.toUpperCase(locale);
                String upperCase2 = r05.A0E.toUpperCase(locale);
                String str26 = r05.A0K;
                if (str26 != null) {
                    r1 = new AnonymousClass4A4(str26.toUpperCase(locale), 8);
                } else {
                    r1 = null;
                }
                AnonymousClass9F3 r122 = new AnonymousClass9F3(r7, r1, A0B, A013, str15, str16, str17, A0h, str18, str19, str3, str20, str21, str22, str23, str24, str14, A0b, upperCase, upperCase2, seconds, seconds2);
                C196259ui r72 = r3.A00;
                if (r72 != null) {
                    r72.A02("upi-create-mandate");
                }
                AnonymousClass8BW.A1B(r103, new C175878zQ(r3.A00, r3.A01, r3.A02, r3.A06, r72, r113, r122), (C29621ca) r122.A04, A0B);
                return;
            case 9:
                C17960vV.A07(aEs2);
                C175848zN r06 = r22.A08;
                AYO ayo = new AYO(aw0, r22, 0);
                Log.i("PAY: updateMandateByIntent called");
                if (hashMap != null) {
                    str4 = r06.A04.A07("MPIN", hashMap2, 9);
                } else {
                    str4 = null;
                }
                C170318pf r32 = (C170318pf) aw0.A0A;
                AnonymousClass8pS r28 = (AnonymousClass8pS) aEs2.A08;
                if (r28 != null) {
                    r52 = r28.A05;
                } else {
                    r52 = null;
                }
                String str27 = aEs2.A0A;
                AnonymousClass1OZ r522 = r06.A03;
                String A0B2 = r522.A0B();
                C17960vV.A07(r32);
                C196219ue r62 = r32.A0H;
                C17960vV.A07(r62);
                C17960vV.A07(r62.A0G);
                C17960vV.A07(r62.A0E);
                C17960vV.A07(r62.A08);
                AnonymousClass9O4 r63 = r62.A0C;
                C17960vV.A07(r63);
                C17960vV.A07(r63.A01);
                C17960vV.A07(r63.A04);
                C17960vV.A07(r52);
                C17960vV.A07(aw0.A09);
                C17960vV.A07(aw0.A0K);
                r32.A0T = AnonymousClass8BS.A0h(r06.A05.A0D());
                ARR A014 = r06.A01.A01(aw0.A07, aw0.A09);
                aw0.A08 = A014;
                aw0.A0H = str27;
                C178749Eh r29 = new C178749Eh(String.valueOf(A014.getValue()), String.valueOf(A014.A00), AnonymousClass8BU.A0n(A014), 17);
                C22565BDa bDa = r32.A0H.A0C.A01;
                ARR arr = (ARR) bDa;
                C178749Eh r210 = new C178749Eh(String.valueOf(bDa.getValue()), String.valueOf(arr.A00), AnonymousClass8BU.A0n(arr), 17);
                String str28 = aw0.A0K;
                String A0h2 = AnonymousClass8BS.A0h(r32.A0H.A08);
                String A015 = r06.A08.A01();
                C196219ue r211 = r32.A0H;
                String A0h3 = AnonymousClass8BS.A0h(r211.A0C.A04);
                String str29 = r32.A0T;
                String str30 = r32.A0R;
                String A0h4 = AnonymousClass8BS.A0h(r52);
                String str31 = (String) AnonymousClass8BT.A0q(r211.A07);
                TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                long seconds3 = timeUnit2.toSeconds(r211.A02);
                long seconds4 = timeUnit2.toSeconds(r32.A0H.A0C.A00);
                C196219ue r212 = r32.A0H;
                String str32 = r212.A0J;
                C17960vV.A07(str4);
                Object A0q3 = AnonymousClass8BT.A0q(r32.A0B);
                C17960vV.A07(A0q3);
                String str33 = (String) A0q3;
                Object A0q4 = AnonymousClass8BT.A0q(r212.A0A);
                C17960vV.A07(A0q4);
                String str34 = (String) A0q4;
                String str35 = r32.A0O;
                C17960vV.A07(str35);
                String str36 = r212.A0L;
                String A0b2 = AnonymousClass8BS.A0b(r212.A0N ? 1 : 0);
                String str37 = r212.A0G;
                Locale locale2 = Locale.US;
                String upperCase3 = str37.toUpperCase(locale2);
                String upperCase4 = r212.A0E.toUpperCase(locale2);
                String str38 = r212.A0K;
                if (str38 != null) {
                    r23 = new AnonymousClass4A4(str38.toUpperCase(locale2), 8);
                } else {
                    r23 = null;
                }
                C18070vi.A0d(str28, 2);
                C18070vi.A0d(A0h2, 3);
                C18070vi.A0d(A015, 4);
                C18070vi.A0d(A0h3, 5);
                C18070vi.A0d(str29, 6);
                C18070vi.A0d(str30, 7);
                C72483Me.A17(A0h4, str4, str33, str34, 8);
                AnonymousClass8BU.A1I(str35, 16, str27);
                C18070vi.A0d(upperCase3, 21);
                C18070vi.A0d(upperCase4, 22);
                Object obj = "1";
                List A0N = C18070vi.A0N("0", obj, new String[2], 0, 1);
                List A0o = AnonymousClass8BX.A0o("0", obj, 2, 1);
                String[] strArr = new String[3];
                strArr[0] = "EXACT";
                strArr[1] = "MAX";
                List A0O = C18070vi.A0O("UNKNOWN", strArr, 2);
                String[] strArr2 = new String[11];
                strArr2[0] = "ASPRESENTED";
                strArr2[1] = "BIMONTHLY";
                strArr2[2] = "DAILY";
                strArr2[3] = "FORTNIGHTLY";
                strArr2[4] = "HALFYEARLY";
                strArr2[5] = "MONTHLY";
                strArr2[6] = "ONETIME";
                strArr2[7] = "QUARTERLY";
                strArr2[8] = "UNKNOWN";
                strArr2[9] = "WEEKLY";
                List A0O2 = C18070vi.A0O("YEARLY", strArr2, 10);
                C29591cX A0Y = C108955ca.A0Y();
                AnonymousClass8BY.A13(A0Y);
                AnonymousClass8BY.A15(A0Y, A0B2);
                C29591cX A0R = AnonymousClass8BS.A0R();
                C29591cX.A01(A0R, "action", "upi-update-mandate-by-url");
                if (AnonymousClass8BV.A1Y(str28, 1, false)) {
                    C29591cX.A01(A0R, "transaction-id", str28);
                }
                if (C29601cY.A04(A0h2, 0, 255, false)) {
                    C29591cX.A01(A0R, "mandate-no", A0h2);
                }
                if (C29601cY.A04(A015, 1, 255, false)) {
                    C29591cX.A01(A0R, "device-id", A015);
                }
                String str39 = A0h3;
                if (AnonymousClass8BV.A1U(str39, 0)) {
                    C29591cX.A01(A0R, "seq-no", str39);
                }
                if (C29601cY.A04(str29, 1, 100, false)) {
                    C29591cX.A01(A0R, "sender-vpa", str29);
                }
                if (C29601cY.A04(str30, 1, 100, false)) {
                    C29591cX.A01(A0R, "receiver-vpa", str30);
                }
                if (AnonymousClass8BV.A1Y(A0h4, 0, false)) {
                    C29591cX.A01(A0R, "upi-bank-info", A0h4);
                }
                if (str31 != null && AnonymousClass8BU.A1Z(str31, 0, true)) {
                    C29591cX.A01(A0R, "mandate-name", str31);
                }
                if (C29601cY.A03(Long.valueOf(seconds3), 0, 9007199254740991L, false)) {
                    C108965cb.A1I(A0R, "start-ts", seconds3);
                }
                if (C29601cY.A03(Long.valueOf(seconds4), 0, 9007199254740991L, false)) {
                    C108965cb.A1I(A0R, "end-ts", seconds4);
                }
                if (str32 != null && C29601cY.A04(str32, 1, 2, true)) {
                    C29591cX.A01(A0R, "recurrence-day", str32);
                }
                if (AnonymousClass8BV.A1Y(str4, 0, false)) {
                    C29591cX.A01(A0R, "mpin", str4);
                }
                if (C29601cY.A04(str33, 1, 100, false)) {
                    C29591cX.A01(A0R, "receiver-name", str33);
                }
                if (C29601cY.A04(str34, 1, 100, false)) {
                    C29591cX.A01(A0R, "purpose-code", str34);
                }
                if (C29601cY.A04(str35, 0, 4, false)) {
                    C29591cX.A01(A0R, "mcc", str35);
                }
                if (str36 != null && AnonymousClass8BV.A1X(str36, 1, true)) {
                    C29591cX.A01(A0R, "ref-id", str36);
                }
                if (C29601cY.A04(str27, 1, 100, false)) {
                    C29591cX.A01(A0R, "credential-id", str27);
                }
                A0R.A09(A0b2, "is-revocable", A0N);
                A0R.A09("1", "share-to-payee", A0o);
                A0R.A09(upperCase3, "amount-rule", A0O);
                A0R.A09(upperCase4, "frequency-rule", A0O2);
                C108955ca.A1P(C178749Eh.A00(r29, "original-amount"), A0R);
                C108955ca.A1P(C178749Eh.A00(r210, "amount"), A0R);
                if (r23 != null) {
                    C20121A8g.A09(A0R, r23);
                }
                r522.A0I(new C175858zO(r06.A00, r06.A02, r06.A06, C197889xR.A04(r06, "upi-update-mandate-by-url"), ayo), C29591cX.A00(A0R, A0Y), A0B2, 204, 0);
                return;
            default:
                return;
        }
        r5 = new C175978za(context, r8, r9, r10, b8i, r4, i);
        r0.A0I(r5, r14, "set", 0);
    }

    public void C5K(A7B a7b) {
        throw new UnsupportedOperationException(this.A06.A03("onSetPin unsupported"));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x010c, code lost:
        r3.A0M.CGF(new X.C21461AkS(r3, r4, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0116, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0131, code lost:
        r2 = X.C188629hj.A00(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0135, code lost:
        r2.A03 = r5;
        r3.A09.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x013c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r7 = r18
            r0 = r19
            super.onCreate(r0)
            java.lang.String r0 = X.AnonymousClass8BV.A0p(r7)
            r7.A04 = r0
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = new com.whatsapp.payments.ui.PaymentBottomSheet
            r0.<init>()
            r7.A02 = r0
            android.content.Intent r2 = r7.getIntent()
            java.lang.String r1 = "user_action"
            r0 = 0
            int r0 = r2.getIntExtra(r1, r0)
            r7.A00 = r0
            X.A7U r11 = r7.A0M
            X.1KB r9 = r7.A05
            X.190 r8 = r7.A03
            X.9ui r14 = r7.A04
            X.1OZ r10 = X.AnonymousClass8BT.A0M(r7)
            X.1ek r1 = r7.A0A
            X.1ex r15 = r7.A0N
            X.8zE r0 = r7.A06
            X.1jG r13 = X.AnonymousClass8BT.A0S(r7)
            X.AXS r12 = r7.A0N
            X.8zN r6 = new X.8zN
            r16 = r0
            r17 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.0ve r4 = r7.A0E
            X.1KB r10 = r7.A05
            X.1OZ r12 = X.AnonymousClass8BT.A0M(r7)
            X.1ek r3 = r7.A0A
            X.A0B r2 = r7.A09
            X.A7U r1 = r7.A0M
            X.1ex r0 = r7.A0N
            X.1jG r14 = X.AnonymousClass8BT.A0S(r7)
            X.8zL r8 = new X.8zL
            r9 = r7
            r11 = r4
            r13 = r1
            r15 = r0
            r16 = r2
            r17 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.AH6 r0 = new X.AH6
            r0.<init>(r8, r6, r7)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r7)
            java.lang.Class<X.8GL> r0 = X.AnonymousClass8GL.class
            X.1J2 r0 = r1.A00(r0)
            X.8GL r0 = (X.AnonymousClass8GL) r0
            r7.A03 = r0
            r6 = 12
            X.AGt r1 = new X.AGt
            r1.<init>(r7, r6)
            X.1DT r0 = r0.A01
            r0.A0A(r7, r1)
            X.8GL r2 = r7.A03
            r0 = 13
            X.AGt r1 = new X.AGt
            r1.<init>(r7, r0)
            X.1wy r0 = r2.A09
            r0.A0A(r7, r1)
            X.1It r1 = X.AnonymousClass3MW.A0N(r7)
            java.lang.Class<X.8FM> r0 = X.AnonymousClass8FM.class
            X.1J2 r0 = r1.A00(r0)
            X.8FM r0 = (X.AnonymousClass8FM) r0
            X.1DT r1 = r0.A00
            r0 = 14
            X.C20337AGt.A00(r7, r1, r0)
            X.8GL r3 = r7.A03
            X.AW0 r5 = r3.A07
            X.8pG r1 = r5.A0A
            r4 = r1
            X.8pf r4 = (X.C170318pf) r4
            int r0 = r3.A00
            switch(r0) {
                case 1: goto L_0x0130;
                case 2: goto L_0x0117;
                case 3: goto L_0x0108;
                case 4: goto L_0x0103;
                case 5: goto L_0x0100;
                case 6: goto L_0x00fa;
                case 7: goto L_0x00ea;
                case 8: goto L_0x00cc;
                case 9: goto L_0x00b2;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            return
        L_0x00b2:
            X.C17960vV.A07(r4)
            X.9ue r0 = r4.A0H
            X.C17960vV.A07(r0)
            X.9O4 r2 = r0.A0C
            java.lang.String r1 = "upiSequenceNumber"
            java.lang.String r0 = r3.A0A
            X.77e r0 = X.C20061A5k.A00(r0, r1)
            r2.A04 = r0
            r4 = 2131897523(0x7f122cb3, float:1.9429938E38)
            r2 = 14
            goto L_0x010c
        L_0x00cc:
            X.9hj r2 = X.C188629hj.A00(r6)
            X.C17960vV.A07(r1)
            java.lang.String r0 = r3.A0A
            r4.A0V = r0
            X.AXS r0 = r3.A0D
            java.lang.String r0 = X.AXS.A00(r0)
            r4.A0T = r0
            X.11P r1 = r3.A03
            X.11S r0 = r3.A02
            java.lang.String r0 = X.AnonymousClass8BS.A0e(r0, r1)
            r4.A0M = r0
            goto L_0x0135
        L_0x00ea:
            X.C17960vV.A07(r4)
            X.10I r2 = r3.A0M
            java.lang.String r1 = r4.A0N
            X.9Az r0 = new X.9Az
            r0.<init>(r3, r1)
            X.C17890vO.A0u(r0, r2)
            return
        L_0x00fa:
            r4 = 2131897562(0x7f122cda, float:1.9430017E38)
            r2 = 10
            goto L_0x010c
        L_0x0100:
            r0 = 9
            goto L_0x0131
        L_0x0103:
            r4 = 2131897523(0x7f122cb3, float:1.9429938E38)
            r2 = 7
            goto L_0x010c
        L_0x0108:
            r4 = 2131897563(0x7f122cdb, float:1.943002E38)
            r2 = 4
        L_0x010c:
            X.10I r1 = r3.A0M
            X.AkS r0 = new X.AkS
            r0.<init>((X.AnonymousClass8GL) r3, (int) r4, (int) r2)
            r1.CGF(r0)
            return
        L_0x0117:
            X.9ue r0 = r4.A0H
            X.9O4 r0 = r0.A0C
            r2 = 2131897575(0x7f122ce7, float:1.9430043E38)
            if (r0 != 0) goto L_0x0123
            r2 = 2131897510(0x7f122ca6, float:1.9429912E38)
        L_0x0123:
            r0 = 5
            X.9hj r1 = X.C188629hj.A00(r0)
            r1.A00 = r2
            X.1wy r0 = r3.A09
            r0.A0F(r1)
            return
        L_0x0130:
            r0 = 6
        L_0x0131:
            X.9hj r2 = X.C188629hj.A00(r0)
        L_0x0135:
            r2.A03 = r5
            X.1wy r0 = r3.A09
            r0.A0F(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiMandatePaymentActivity(int i) {
        this.A05 = false;
        AGD.A00(this, 8);
    }

    public void A5H(PaymentBottomSheet paymentBottomSheet) {
        super.A5H(paymentBottomSheet);
        paymentBottomSheet.A01 = C20160A9w.A00(this, 16);
        this.A0S.BiI((Integer) null, "approve_mandate_prompt", this.A04, 0, true);
    }

    public void A5I(PaymentBottomSheet paymentBottomSheet) {
        super.A5I(paymentBottomSheet);
        paymentBottomSheet.A01 = C20160A9w.A00(this, 15);
    }

    public void A5J(PaymentBottomSheet paymentBottomSheet) {
        super.A5J(paymentBottomSheet);
        paymentBottomSheet.A01 = C20160A9w.A00(this, 18);
    }

    public void A5L(int i) {
        C73203Rj A002 = AnonymousClass4a6.A00(this);
        A002.A0D(i);
        A002.A0T(true);
        A002.A0Z((DialogInterface.OnClickListener) null, 2131893839);
        A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
        A002.A00.A0O(C20160A9w.A00(this, 20));
        C010105w create = A002.create();
        create.setOnShowListener(new C20163A9z(this, 2));
        create.show();
    }

    public void Blk(ViewGroup viewGroup) {
        super.Blk(viewGroup);
        AnonymousClass3MW.A0J(viewGroup, 2131436044).setText(2131897506);
    }

    public IndiaUpiMandatePaymentActivity() {
        this(0);
        this.A06 = AnonymousClass1QE.A00("IndiaUpiMandatePaymentActivity", "payment-settings", "IN");
    }
}
