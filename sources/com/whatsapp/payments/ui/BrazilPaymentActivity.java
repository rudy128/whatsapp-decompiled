package com.whatsapp.payments.ui;

import X.A0R;
import X.A27;
import X.A54;
import X.A5F;
import X.A5H;
import X.A5I;
import X.A5Y;
import X.A8e;
import X.ADQ;
import X.AQ4;
import X.ARR;
import X.AXR;
import X.AYZ;
import X.AZZ;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass01E;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1KB;
import X.AnonymousClass1KI;
import X.AnonymousClass1KJ;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1KW;
import X.AnonymousClass1LU;
import X.AnonymousClass1QD;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass34B;
import X.AnonymousClass3Bx;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass6X5;
import X.AnonymousClass72F;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8pY;
import X.AnonymousClass90Y;
import X.AnonymousClass91U;
import X.AnonymousClass9YI;
import X.B5P;
import X.B5S;
import X.B9B;
import X.BD4;
import X.BDw;
import X.C010105w;
import X.C108945cZ;
import X.C108955ca;
import X.C132646nG;
import X.C1418377d;
import X.C167268fj;
import X.C170278pb;
import X.C170308pe;
import X.C175378yc;
import X.C1762890k;
import X.C1768996b;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C180609Nf;
import X.C183449Yh;
import X.C184999br;
import X.C185009bs;
import X.C185019bt;
import X.C185029bu;
import X.C186969f3;
import X.C188639hk;
import X.C188709hr;
import X.C191079lz;
import X.C191389mW;
import X.C191529mk;
import X.C191949nS;
import X.C192469oR;
import X.C195929uA;
import X.C196669vR;
import X.C196779vd;
import X.C196809vg;
import X.C198769ys;
import X.C198809yw;
import X.C19944A0b;
import X.C19962A0v;
import X.C20037A4g;
import X.C20074A6a;
import X.C20087A6p;
import X.C20153A9p;
import X.C20160A9w;
import X.C20274AEh;
import X.C20280AEo;
import X.C20284AEs;
import X.C20323AGf;
import X.C20325AGh;
import X.C20751AXg;
import X.C20759AXo;
import X.C20847AaP;
import X.C20855AaX;
import X.C21115Aej;
import X.C21124Aes;
import X.C21132Af0;
import X.C21133Af1;
import X.C21415Aji;
import X.C22539BBw;
import X.C22546BCd;
import X.C22971Dz;
import X.C24751Ln;
import X.C24921Me;
import X.C26631Sw;
import X.C30931ek;
import X.C31061ex;
import X.C33251iW;
import X.C33351ig;
import X.C33711jG;
import X.C36401np;
import X.C62212r1;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.jid.UserJid;
import com.whatsapp.numberkeyboard.NumberEntryKeyboard;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import java.util.ArrayList;
import java.util.List;

public class BrazilPaymentActivity extends C1762890k implements C22546BCd, BDw, B9B, B5P {
    public int A00;
    public int A01 = 0;
    public Context A02;
    public C33251iW A03;
    public C21132Af0 A04;
    public C24921Me A05;
    public C18000vb A06;
    public AnonymousClass1QR A07;
    public AnonymousClass1KI A08;
    public AnonymousClass1LU A09;
    public AXR A0A;
    public C19944A0b A0B;
    public C20751AXg A0C;
    public C20074A6a A0D;
    public C20323AGf A0E;
    public AnonymousClass1QD A0F;
    public C191079lz A0G;
    public C132646nG A0H;
    public AnonymousClass72F A0I;
    public A54 A0J;
    public A27 A0K;
    public BD4 A0L;
    public C191949nS A0M;
    public C191389mW A0N;
    public AnonymousClass90Y A0O;
    public A5H A0P;
    public C195929uA A0Q;
    public C20037A4g A0R;
    public A5Y A0S;
    public ConfirmPaymentFragment A0T;
    public C20847AaP A0U;
    public A0R A0V;
    public PaymentView A0W;
    public A5F A0X;
    public C192469oR A0Y;
    public C30931ek A0Z;
    public C18010vc A0a;
    public AnonymousClass129 A0b;
    public C36401np A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public AnonymousClass00H A0i;
    public String A0j;
    public String A0k;
    public boolean A0l;
    public boolean A0m = false;
    public boolean A0n = false;
    public BottomSheetBehavior A0o;
    public final B5S A0p = new C20759AXo(this, 1);
    public final C180609Nf A0q = new C175378yc(this, 0);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r11.A0P.A02, 2928) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0x(X.AnonymousClass1KN r10, com.whatsapp.payments.ui.BrazilPaymentActivity r11, X.ADQ r12, java.lang.String r13, java.lang.String r14) {
        /*
            r5 = r11
            X.A5Y r4 = r11.A0S
            java.lang.String r0 = "p2m_context"
            r7 = r13
            boolean r0 = r0.equals(r13)
            java.lang.String r3 = "p2p_context"
            if (r0 == 0) goto L_0x001d
            X.1QO r0 = r11.A0P
            X.0ve r2 = r0.A02
            r1 = 2928(0xb70, float:4.103E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r1 = r13
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r1 = r3
        L_0x001e:
            r2 = 0
            java.lang.String r0 = "merchant_account_linking_context"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = X.A5Y.A00(r4)
        L_0x002b:
            r8 = r14
            if (r1 != 0) goto L_0x0064
            X.0ve r2 = r11.A0E
            X.0z4 r1 = r11.A0A
            X.1QD r0 = r11.A0F
            boolean r0 = X.C196809vg.A01(r1, r2, r0)
            r4 = r10
            r6 = r12
            if (r0 == 0) goto L_0x005a
            boolean r0 = r3.equals(r13)
            if (r0 == 0) goto L_0x005a
            java.util.ArrayList r0 = com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet.A05
            X.AaZ r3 = new X.AaZ
            r3.<init>(r4, r5, r6, r7, r8)
            X.BD4 r0 = r11.A0L
            com.whatsapp.payments.ui.BrazilPaymentIncomeCollectionBottomSheet r1 = X.AnonymousClass6X5.A00(r0, r3, r14)
            java.lang.String r0 = "BrazilPaymentIncomeCollectionBottomSheet"
            r11.CMm(r1, r0)
            return
        L_0x0055:
            java.lang.String r1 = X.A5Y.A01(r4, r1, r2)
            goto L_0x002b
        L_0x005a:
            boolean r14 = r11.A0m
            r9 = r11
            r11 = r12
            r12 = r13
            r13 = r8
            r9.A4r(r10, r11, r12, r13, r14)
            return
        L_0x0064:
            java.lang.String r0 = "brpay_p_account_recovery_eligibility_screen"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0072
            X.A5F r0 = r11.A0X
            r0.A02(r11, r13, r14)
            return
        L_0x0072:
            A10(r11, r1, r13, r14, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.A0x(X.1KN, com.whatsapp.payments.ui.BrazilPaymentActivity, X.ADQ, java.lang.String, java.lang.String):void");
    }

    public C62212r1 A4o(AnonymousClass1KN r5, int i) {
        C198769ys r2;
        if (i == 0 && (r2 = this.A0T.A01().A01) != null) {
            if (r5.A00.compareTo(((ARR) r2.A09.A00).A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public void A4p(C20274AEh aEh, AnonymousClass1KN r15, C20284AEs aEs, AnonymousClass34B r17, String str, String str2, String str3, int i) {
        String paymentNote;
        List mentionedJids;
        PaymentView paymentView = this.A0W;
        if (paymentView == null) {
            mentionedJids = AnonymousClass000.A13();
            paymentNote = "";
        } else {
            paymentNote = paymentView.getPaymentNote();
            mentionedJids = this.A0W.getMentionedJids();
        }
        this.A05.CGF(new C21415Aji(aEh, r15, aEs, r17, this, paymentNote, str, str2, str3, mentionedJids, i));
    }

    public void A4r(AnonymousClass1KN r10, ADQ adq, String str, String str2, boolean z) {
        this.A04.A0D();
        C21132Af0 A002 = A5I.A00(this.A0Q);
        this.A04 = A002;
        A002.A0A(new C21124Aes(r10, this, adq, str, str2, z), this.A05.A05);
    }

    public void A4s(C170308pe r2, int i) {
        if (i == 1) {
            A4h(r2);
        }
    }

    public AnonymousClass01E BMU() {
        return this;
    }

    public String BWf() {
        return null;
    }

    public boolean BgS() {
        return false;
    }

    public void Bl4() {
    }

    public void BlN(String str) {
    }

    public void C0F() {
    }

    public /* synthetic */ void C0K() {
    }

    public void C5B() {
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        this.A04.A0D();
        C21132Af0 A002 = A5I.A00(this.A0Q);
        this.A04 = A002;
        if (i2 == -1) {
            A002.A0A(new C21133Af1(intent, this, 14), this.A05.A05);
        }
    }

    public static void A0v(C20274AEh aEh, AnonymousClass1KN r17, C20284AEs aEs, AnonymousClass34B r19, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        FingerprintBottomSheet A002 = FingerprintBottomSheet.A0A.A00();
        AnonymousClass1KN r6 = r17;
        int intValue = r6.A00.scaleByPowerOfTen(3).intValue();
        AnonymousClass1KJ r3 = AnonymousClass1KL.A0A;
        C17960vV.A07(r3);
        BrazilPaymentActivity brazilPaymentActivity2 = brazilPaymentActivity;
        C20274AEh aEh2 = aEh;
        C20284AEs aEs2 = aEs;
        String str3 = str2;
        C198809yw A4n = brazilPaymentActivity2.A4n(aEh2, aEs2, C196669vR.A00(r3, 1000, (long) intValue), str3, "fingerprint", brazilPaymentActivity2.A0k);
        A002.A02 = new C167268fj(brazilPaymentActivity2, A002, brazilPaymentActivity2.A05, A4n, brazilPaymentActivity2.A0Q, new AYZ(A002, aEh2, r6, aEs2, r19, brazilPaymentActivity2, str, str3));
        brazilPaymentActivity2.A0O.Bix("enter_fingerprint", brazilPaymentActivity2.A00);
        brazilPaymentActivity2.CMl(A002);
    }

    public static void A0y(BrazilPaymentActivity brazilPaymentActivity) {
        if (brazilPaymentActivity.A01 == 0) {
            C20087A6p.A03(C20087A6p.A01(brazilPaymentActivity.A05, (AnonymousClass1KN) null, brazilPaymentActivity.A0U, brazilPaymentActivity.A0m), brazilPaymentActivity.A0L, "new_payment", brazilPaymentActivity.A0j);
        }
    }

    public static void A0z(BrazilPaymentActivity brazilPaymentActivity, String str) {
        if (C18020vd.A05(C18040vf.A02, brazilPaymentActivity.A0P.A02, 2984)) {
            brazilPaymentActivity.CEx();
            C20284AEs A082 = AnonymousClass8BR.A0R(brazilPaymentActivity.A0Q).A08(str);
            C17960vV.A07(A082);
            AnonymousClass8pY r2 = (AnonymousClass8pY) A082.A08;
            if (r2 != null) {
                String str2 = r2.A0F;
                if (str2.equals("NEEDS_RETOKENIZATION") || str2.equals("NEEDS_RETOKENIZATION_DELETED")) {
                    brazilPaymentActivity.CNh(C170278pb.A01(brazilPaymentActivity, r2, str), 1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0075, code lost:
        if (X.AnonymousClass8BT.A1X(r7) != false) goto L_0x0077;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A10(com.whatsapp.payments.ui.BrazilPaymentActivity r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            X.AaB r6 = new X.AaB
            r7 = r8
            r8 = r10
            r10 = r11
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11)
            X.A5Y r0 = r7.A0S
            boolean r0 = r0.A08(r8)
            if (r0 == 0) goto L_0x0027
            com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet r5 = X.C196799vf.A00(r10)
            r1 = 1
            X.AaC r0 = new X.AaC
            r0.<init>(r7, r1)
            r5.A02 = r0
        L_0x001d:
            X.A9t r0 = r5.A03
            r0.A00 = r7
            r5.A01 = r6
        L_0x0023:
            r7.CMl(r5)
            return
        L_0x0027:
            X.0ve r2 = r7.A0E
            r1 = 3013(0xbc5, float:4.222E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0040
            java.lang.String r0 = "p2p_context"
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x0040
            com.whatsapp.payments.ui.PaymentsWarmWelcomeBottomSheet r5 = X.C196799vf.A01(r10)
            goto L_0x001d
        L_0x0040:
            if (r12 == 0) goto L_0x0066
            r4 = 2131886475(0x7f12018b, float:1.940753E38)
            r3 = 2131886474(0x7f12018a, float:1.9407528E38)
            r2 = 2131886473(0x7f120189, float:1.9407526E38)
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r5 = new com.whatsapp.payments.ui.AddPaymentMethodBottomSheet
            r5.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r10)
            r5.A1R(r1)
            X.9dj r0 = new X.9dj
            r0.<init>(r4, r3, r2)
            r5.A03 = r0
        L_0x0063:
            r5.A04 = r6
            goto L_0x0023
        L_0x0066:
            X.1QO r0 = r7.A0P
            boolean r0 = r0.A0E()
            if (r0 != 0) goto L_0x0077
            boolean r0 = X.AnonymousClass8BT.A1X(r7)
            r3 = 2131886180(0x7f120064, float:1.9406932E38)
            if (r0 == 0) goto L_0x007a
        L_0x0077:
            r3 = 2131895714(0x7f1225a2, float:1.9426269E38)
        L_0x007a:
            r2 = 0
            com.whatsapp.payments.ui.AddPaymentMethodBottomSheet r5 = new com.whatsapp.payments.ui.AddPaymentMethodBottomSheet
            r5.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "referral_screen"
            r1.putString(r0, r10)
            r5.A1R(r1)
            X.9dj r0 = new X.9dj
            r0.<init>(r2, r3, r2)
            r5.A03 = r0
            X.A9t r0 = r5.A05
            r0.A00 = r7
            goto L_0x0063
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.A10(com.whatsapp.payments.ui.BrazilPaymentActivity, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public static boolean A12(C20284AEs aEs, int i) {
        String str;
        AnonymousClass8pY r1 = (AnonymousClass8pY) aEs.A08;
        if (r1 != null && A8e.A08(aEs)) {
            if (i == 1) {
                String str2 = r1.A0N;
                if (str2 == null || !(!"DISABLED".equals(str2))) {
                    return true;
                }
            } else if (i != 0 || ((str = r1.A0L) != null && (!"DISABLED".equals(str)))) {
                return false;
            } else {
                return true;
            }
        }
        return false;
    }

    public C20280AEo A4m() {
        if (!(this instanceof BrazilOrderDetailsActivity)) {
            return null;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this;
        String str = brazilOrderDetailsActivity.A0S;
        C17960vV.A07(str);
        String str2 = brazilOrderDetailsActivity.A0J.A01;
        long j = brazilOrderDetailsActivity.A02;
        return new C20280AEo(str, str2, brazilOrderDetailsActivity.A0T, brazilOrderDetailsActivity.A0m, brazilOrderDetailsActivity.A0U, j);
    }

    public C198809yw A4n(C20274AEh aEh, C20284AEs aEs, ARR arr, String str, String str2, String str3) {
        String str4;
        C170278pb r0;
        AnonymousClass11P r16 = this.A05;
        C18030ve r22 = this.A0E;
        AnonymousClass1KB r42 = this.A05;
        AnonymousClass11S r41 = this.A02;
        AnonymousClass10I r15 = this.A05;
        C191529mk r13 = this.A0R;
        AnonymousClass1QS r11 = this.A0Q;
        C30931ek r9 = this.A0Z;
        C191949nS r8 = this.A0M;
        C195929uA r7 = this.A0Q;
        C31061ex r6 = this.A0N;
        C33351ig r5 = this.A0T;
        C33711jG A0S2 = AnonymousClass8BT.A0S(this);
        A5H a5h = this.A0P;
        A54 a54 = this.A0J;
        C20284AEs aEs2 = aEs;
        String str5 = aEs2.A0A;
        UserJid userJid = this.A0J;
        C17960vV.A07(userJid);
        if (aEs2.A05() != 6 || (r0 = aEs2.A08) == null) {
            str4 = null;
        } else if (((AnonymousClass8pY) r0).A03 == 1) {
            str4 = "debit";
        } else {
            str4 = "credit";
        }
        C20280AEo A4m = A4m();
        ARR arr2 = arr;
        C62212r1 A4o = A4o(arr2.A02, this.A01);
        String str6 = str3;
        C191529mk r27 = r13;
        A54 a542 = a54;
        C191949nS r29 = r8;
        C33351ig r30 = r5;
        A5H a5h2 = a5h;
        C195929uA r33 = r7;
        C30931ek r34 = r9;
        AnonymousClass10I r35 = r15;
        String str7 = str5;
        ARR arr3 = arr2;
        return new C198809yw(this, r42, r41, r16, (C24751Ln) this.A0d.get(), arr2, arr3, aEh, A4m, r22, userJid, A0S2, r6, r11, r27, a542, r29, r30, A4o, a5h2, r33, r34, r35, str7, str6, str4, str, str2);
    }

    public void A4q(AnonymousClass1KN r4) {
        if (C196809vg.A01(this.A0A, this.A0E, this.A0F)) {
            ArrayList arrayList = BrazilPaymentIncomeCollectionBottomSheet.A05;
            CMm(AnonymousClass6X5.A00(this.A0L, new C20855AaX(this, r4, 0), this.A0j), "BrazilPaymentIncomeCollectionBottomSheet");
            return;
        }
        A4g(r4);
    }

    public boolean Bfn() {
        return TextUtils.isEmpty(this.A0r);
    }

    public void Bt0(String str) {
        AnonymousClass90Y r5 = this.A0O;
        int i = this.A00;
        r5.A03.A01(Integer.valueOf(i), AnonymousClass001.A1I("p2p_flow_tag", AnonymousClass000.A10(), i), "error_message", str);
        C20087A6p.A02(C20087A6p.A01(this.A05, (AnonymousClass1KN) null, this.A0U, this.A0m), this.A0L, AnonymousClass8BS.A0V(), "new_payment", this.A0j, 4);
    }

    public void BvH() {
        C19962A0v a0v = this.A0U;
        if (a0v != null && a0v.A01 != null) {
            BD4 bd4 = this.A0L;
            Bundle A0D2 = C17880vN.A0D();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(bd4, a0v);
            paymentIncentiveViewFragment.A1R(A0D2);
            paymentIncentiveViewFragment.A04 = new AnonymousClass9YI(paymentIncentiveViewFragment);
            CMl(paymentIncentiveViewFragment);
        }
    }

    public void C0E() {
        AnonymousClass1BI r0 = this.A0G;
        C17960vV.A07(r0);
        if (C22971Dz.A0e(r0) && this.A00 == 0) {
            A4f(AnonymousClass3MY.A09(this));
        }
    }

    public void C3O(AnonymousClass1KN r7) {
        String A012 = A5Y.A01(this.A0S, "p2p_context", false);
        A5I A013 = this.A0Q.A01();
        C21132Af0 af0 = new C21132Af0();
        A013.A03.CGF(new AnonymousClass3Bx(A013, af0, 45));
        af0.A09(new C21115Aej(r7, this, A012));
    }

    public void C57(AnonymousClass1KN r4) {
        String str;
        if (this.A0m) {
            str = "p2m_context";
        } else {
            str = "p2p_context";
        }
        A0x(r4, this, (ADQ) null, str, this.A0j);
    }

    public void C58() {
        A4k(this.A0L, this.A0U);
    }

    public void C8L(boolean z) {
        C19962A0v a0v = this.A0U;
        BD4 bd4 = this.A0L;
        if (z) {
            AnonymousClass91U.A1a(this, bd4, a0v, 49);
        } else {
            AnonymousClass91U.A1a(this, bd4, a0v, 48);
        }
    }

    /* JADX WARNING: type inference failed for: r29v2, types: [X.AQ3, java.lang.Object] */
    public /* bridge */ /* synthetic */ C188709hr CCo() {
        AnonymousClass1KJ A012 = this.A08.A01("BRL");
        AnonymousClass1BI r17 = this.A0G;
        String str = this.A0n;
        C1418377d r14 = this.A0a;
        Integer num = this.A0j;
        String str2 = this.A0s;
        int i = 2;
        if (this.A0y) {
            i = 0;
        }
        C185029bu r3 = new C185029bu(i, 0);
        C183449Yh r2 = new C183449Yh(false);
        C185009bs r1 = new C185009bs(NumberEntryKeyboard.A00(this.A06), this.A0u);
        String str3 = this.A0r;
        String str4 = this.A0o;
        String str5 = this.A0q;
        C184999br r0 = new C184999br(A012, 0);
        C18000vb r11 = this.A06;
        AnonymousClass1KL r9 = (AnonymousClass1KL) A012;
        C188639hk r21 = new C188639hk(C108945cZ.A0N(2132083656, new int[]{0, 0, 0, 0}), C108945cZ.A0N(2132083657, new int[]{0, 0, 0, 0}), (C22539BBw) null, r0, new C1768996b(this, r11, A012, r9.A00, r9.A05, this), str3, str4, str5, 2132083655, true, true, true);
        C18030ve r12 = this.A0E;
        AnonymousClass1KW r112 = this.A0D;
        AnonymousClass11C r10 = this.A08;
        C18000vb r92 = this.A06;
        C26631Sw r8 = this.A0b;
        C18010vc r7 = this.A0a;
        AQ4 aq4 = new AQ4(this, r10, r92, this.A0C, r112, r12, new Object(), r7, r8);
        C185019bt r93 = new C185019bt(this, C18020vd.A05(C18040vf.A02, r12, 811));
        AnonymousClass72F r102 = this.A0I;
        C185009bs r23 = r1;
        C183449Yh r24 = r2;
        C185019bt r25 = r93;
        C185029bu r26 = r3;
        C1418377d r27 = r14;
        Integer num2 = num;
        String str6 = str;
        return new C188709hr(r17, aq4, this, this, r21, new C186969f3(this.A0C, this.A0H, r102, false), r23, r24, r25, r26, r27, num2, str6, str2, false);
    }

    public void onBackPressed() {
        PaymentView paymentView = this.A0W;
        if (paymentView == null || !paymentView.A0J()) {
            AnonymousClass1BI r0 = this.A0G;
            C17960vV.A07(r0);
            if (!C22971Dz.A0e(r0) || this.A00 != 0) {
                C20087A6p.A02(C20087A6p.A01(this.A05, (AnonymousClass1KN) null, this.A0U, this.A0m), this.A0L, 1, "new_payment", (String) null, 1);
                finish();
                return;
            }
            this.A0J = null;
            A4f(AnonymousClass3MY.A09(this));
        }
    }

    public Dialog onCreateDialog(int i) {
        C010105w A012 = this.A0V.A01((Bundle) null, this, i);
        if (A012 == null) {
            return super.onCreateDialog(i);
        }
        return A012;
    }

    public static void A0u(BottomSheetDialogFragment bottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity) {
        C73203Rj A002 = AnonymousClass4a6.A00(brazilPaymentActivity);
        C108955ca.A1D(brazilPaymentActivity.A02, A002, 2131893043);
        A002.A0L(new C20153A9p(bottomSheetDialogFragment, brazilPaymentActivity, 16), brazilPaymentActivity.A02.getString(2131887451));
        C010105w create = A002.create();
        create.setOnDismissListener(C20160A9w.A00(bottomSheetDialogFragment, 8));
        create.show();
    }

    public static void A0w(C20274AEh aEh, AnonymousClass1KN r8, C20284AEs aEs, AnonymousClass34B r10, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        PinBottomSheetDialogFragment A002 = C196779vd.A00();
        A002.A0E.A00 = brazilPaymentActivity;
        A002.A09 = new AZZ(aEh, r8, aEs, r10, A002, brazilPaymentActivity, str2, str);
        brazilPaymentActivity.A0O.Bix("enter_pin", brazilPaymentActivity.A00);
        brazilPaymentActivity.CMl(A002);
    }

    public static void A11(BrazilPaymentActivity brazilPaymentActivity, boolean z) {
        PaymentView paymentView = (PaymentView) brazilPaymentActivity.findViewById(2131433689);
        brazilPaymentActivity.A0W = paymentView;
        paymentView.setPaymentTabsVisibility(8);
        PaymentView paymentView2 = brazilPaymentActivity.A0W;
        paymentView2.A0k = brazilPaymentActivity;
        brazilPaymentActivity.getLifecycle().A05(new C20325AGh(paymentView2, 2));
        PaymentView paymentView3 = brazilPaymentActivity.A0W;
        if (z) {
            paymentView3.setPaymentTabsVisibility(8);
        } else {
            paymentView3.setPaymentTabsVisibility(0);
        }
        PaymentView paymentView4 = brazilPaymentActivity.A0W;
        AnonymousClass1E7 r2 = brazilPaymentActivity.A08;
        String A0I2 = brazilPaymentActivity.A05.A0I(r2);
        paymentView4.A18 = A0I2;
        paymentView4.A0E.setText(A0I2);
        paymentView4.A06.setVisibility(8);
        paymentView4.A0S.A07(paymentView4.A0Q, r2);
        A0y(brazilPaymentActivity);
    }

    public void Buo(String str, boolean z) {
        if (!TextUtils.isEmpty(str) && !z) {
            A4j(this.A0L, this.A0U);
        }
    }

    public void CMi(DialogFragment dialogFragment) {
        CMl(dialogFragment);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            X.0ve r0 = r7.A0E
            boolean r0 = X.C87544Vz.A00(r0)
            r7.A0l = r0
            X.118 r0 = r7.A05
            android.content.Context r0 = r0.A00
            r7.A02 = r0
            X.1QS r0 = r7.A0Q
            X.Af0 r0 = X.A5I.A00(r0)
            r7.A04 = r0
            X.00H r0 = r7.A0g
            X.10T r1 = X.C17880vN.A0V(r0)
            X.9Nf r0 = r7.A0q
            r1.registerObserver(r0)
            com.whatsapp.jid.UserJid r0 = r7.A0J
            if (r0 != 0) goto L_0x0041
            X.1BI r1 = r7.A0G
            X.C17960vV.A07(r1)
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x003b
            android.os.Bundle r0 = X.AnonymousClass3MY.A09(r7)
            r7.A4f(r0)
        L_0x003a:
            return
        L_0x003b:
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A00(r1)
            r7.A0J = r0
        L_0x0041:
            X.0ve r4 = r7.A0E
            X.1iW r1 = r7.A03
            X.122 r2 = r7.A07
            X.00H r0 = r7.A0d
            X.1W6 r6 = X.C17880vN.A0c(r0)
            X.00H r0 = r7.A0e
            java.lang.Object r5 = r0.get()
            X.9yc r5 = (X.C198609yc) r5
            X.1QR r3 = r7.A07
            X.AaP r0 = new X.AaP
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A0U = r0
            r7.A4e(r8)
            if (r8 != 0) goto L_0x0129
            X.90Y r2 = r7.A0O
            r1 = 185470254(0xb0e0d2e, float:2.735812E-32)
            java.lang.String r0 = r7.A0j
            java.lang.Integer r0 = r2.A00(r0, r1)
            if (r0 == 0) goto L_0x0076
            int r0 = r0.intValue()
        L_0x0074:
            r7.A00 = r0
        L_0x0076:
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x0094
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_request_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r7.A0k = r0
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            boolean r0 = X.AnonymousClass3MY.A1a(r1, r0)
            r7.A11 = r0
        L_0x0094:
            X.0ve r1 = r7.A0E
            r0 = 1482(0x5ca, float:2.077E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x00b8
            X.10I r5 = r7.A05
            X.1QS r4 = r7.A0Q
            X.1QD r2 = r7.A0F
            X.1QL r1 = r7.A0K
            X.AGf r0 = new X.AGf
            r0.<init>(r1, r2, r4, r5)
            r7.A0E = r0
            X.1Fv r1 = r7.getLifecycle()
            X.AGf r0 = r7.A0E
            r1.A05(r0)
        L_0x00b8:
            X.A5Y r0 = r7.A0S
            X.9uA r0 = r0.A03
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00dc
            X.1QD r2 = r7.A0F
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "payment_account_recoverable"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0119
            android.content.SharedPreferences r1 = r2.A03()
            java.lang.String r0 = "payment_account_recoverable_time_ms"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0119
        L_0x00dc:
            boolean r0 = r7 instanceof com.whatsapp.payments.ui.BrazilOrderDetailsActivity
            if (r0 != 0) goto L_0x003a
            boolean r0 = r7.A0l
            if (r0 == 0) goto L_0x003a
            android.view.View r1 = r7.A00
            r0 = 2131435191(0x7f0b1eb7, float:1.8492217E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r1, r0)
            com.google.android.material.bottomsheet.BottomSheetBehavior r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior
            r0.<init>()
            r7.A0o = r0
            X.00H r0 = r7.A0f
            java.lang.Object r2 = r0.get()
            X.6uJ r2 = (X.C136736uJ) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.A0o
            X.1L4 r0 = r7.A09
            r2.A01(r3, r1, r7, r0)
            X.01n r0 = r7.getSupportActionBar()
            X.C181769Rt.A00(r7, r0)
            X.00H r0 = r7.A0f
            java.lang.Object r2 = r0.get()
            X.6uJ r2 = (X.C136736uJ) r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r7.A0o
            r0 = 0
            r2.A03(r1, r0)
            return
        L_0x0119:
            X.0ve r1 = r7.A0E
            r0 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x00dc
            X.9lz r0 = r7.A0G
            r0.A00(r7)
            goto L_0x00dc
        L_0x0129:
            java.lang.String r0 = "flow_instance_key"
            int r0 = r8.getInt(r0)
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.A0n) {
            this.A0O.A02(this.A00, 4);
            C17880vN.A0V(this.A0i).unregisterObserver(this.A0p);
        }
        this.A0L.reset();
        C17880vN.A0V(this.A0g).unregisterObserver(this.A0q);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        AnonymousClass1BI r0 = this.A0G;
        C17960vV.A07(r0);
        if (!C22971Dz.A0e(r0) || this.A00 != 0) {
            finish();
            return true;
        }
        this.A0J = null;
        A4f(AnonymousClass3MY.A09(this));
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("flow_instance_key", this.A00);
    }
}
