package com.whatsapp.payments.ui;

import X.A2J;
import X.A63;
import X.A6X;
import X.A9X;
import X.ADI;
import X.ADQ;
import X.AEE;
import X.AES;
import X.ARR;
import X.AW0;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass122;
import X.AnonymousClass129;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1KB;
import X.AnonymousClass1KH;
import X.AnonymousClass1KN;
import X.AnonymousClass1LU;
import X.AnonymousClass1PM;
import X.AnonymousClass1QE;
import X.AnonymousClass1R2;
import X.AnonymousClass1TI;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass21K;
import X.AnonymousClass25B;
import X.AnonymousClass34B;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass68M;
import X.AnonymousClass7SD;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BW;
import X.AnonymousClass8Gd;
import X.AnonymousClass8pG;
import X.AnonymousClass96X;
import X.AnonymousClass9I2;
import X.AnonymousClass9RL;
import X.B5Y;
import X.BBS;
import X.BD6;
import X.BIE;
import X.C108945cZ;
import X.C108955ca;
import X.C108965cb;
import X.C108985cd;
import X.C170308pe;
import X.C1762690g;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C190269ke;
import X.C191409mY;
import X.C191559mn;
import X.C191819nE;
import X.C191979nV;
import X.C192479oS;
import X.C198179xu;
import X.C199189za;
import X.C20098A7b;
import X.C20128A8n;
import X.C20151A9n;
import X.C20251ADj;
import X.C20274AEh;
import X.C20275AEi;
import X.C20279AEn;
import X.C20284AEs;
import X.C20285AEt;
import X.C20599ARj;
import X.C20601ARl;
import X.C20927Abh;
import X.C20932Abm;
import X.C21111Aef;
import X.C21536Alj;
import X.C22463B8v;
import X.C22971Dz;
import X.C23520Bik;
import X.C24681Lg;
import X.C26551So;
import X.C30921ej;
import X.C33651jA;
import X.C36181nT;
import X.C64062u9;
import X.C72453Mb;
import X.C73203Rj;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet;
import com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2;
import com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class BrazilOrderDetailsActivity extends C1762690g implements BD6, BBS, C22463B8v, B5Y {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass1PM A03;
    public C24681Lg A04;
    public AnonymousClass1KH A05;
    public AnonymousClass1LU A06;
    public C30921ej A07;
    public C33651jA A08;
    public AnonymousClass96X A09;
    public C191409mY A0A;
    public PaymentCheckoutOrderDetailsViewV2 A0B;
    public AnonymousClass8Gd A0C;
    public BrazilPaymentComplianceViewModel A0D;
    public C191559mn A0E;
    public C191979nV A0F;
    public C192479oS A0G;
    public C198179xu A0H;
    public AnonymousClass1R2 A0I;
    public AnonymousClass205 A0J;
    public AnonymousClass21K A0K;
    public C199189za A0L;
    public A6X A0M;
    public AnonymousClass129 A0N;
    public AnonymousClass00H A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public String A0S;
    public String A0T;
    public List A0U;
    public boolean A0V;
    public final Set A0W;
    public final Set A0X;

    public /* synthetic */ void Bl6(String str) {
    }

    public /* synthetic */ void BlW() {
    }

    public void Bza() {
    }

    public void Bzc(AnonymousClass21K r16, String str) {
        AnonymousClass205 r11;
        AnonymousClass21K r1 = r16;
        this.A0M.A06(r1, A03(this), (String) null, (List) null, 7, true, false, false);
        C20285AEt BPK = r1.BPK();
        C17960vV.A07(BPK);
        C20279AEn aEn = BPK.A02;
        C192479oS r8 = this.A0G;
        C17960vV.A07(aEn);
        if (!TextUtils.isEmpty(aEn.A06)) {
            r11 = this.A0J;
        } else {
            r11 = null;
        }
        Intent A002 = r8.A00(this, aEn, r11, (String) null, str, (String) null);
        if (A002 == null) {
            Log.e("Pay: BrazilOrderDetailsActivity/onOpenTransactionDetailClicked the transaction details intent is null");
        } else {
            startActivity(A002);
        }
    }

    public void C0L(ARR arr, AnonymousClass21K r2, String str, String str2, List list) {
    }

    public /* synthetic */ void C32() {
    }

    public /* synthetic */ void C5T(AES aes, String str) {
    }

    public /* synthetic */ void CAA() {
    }

    public boolean CMK(int i) {
        return i == 405 || i == 401 || i == 403 || i == 420;
    }

    public static Integer A03(BrazilOrderDetailsActivity brazilOrderDetailsActivity) {
        Integer num;
        AnonymousClass8pG r0;
        C20274AEh A0C2;
        C191979nV r2 = brazilOrderDetailsActivity.A0F;
        ADQ adq = r2.A09;
        if (adq != null) {
            num = Integer.valueOf(adq.A00);
        } else {
            num = null;
        }
        AW0 aw0 = r2.A07;
        if (aw0 == null || (r0 = aw0.A0A) == null || (A0C2 = r0.A0C()) == null) {
            return num;
        }
        return Integer.valueOf(A0C2.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (14 == r8.A00) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Q(X.ARR r6, X.AnonymousClass1BI r7, com.whatsapp.payments.ui.BrazilOrderDetailsActivity r8, X.C20934Abo r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            java.util.Set r1 = r8.A0X
            int r0 = r8.A01
            boolean r2 = X.C108965cb.A1b(r1, r0)
            X.C17960vV.A07(r7)
            X.21K r1 = r8.A0K
            if (r12 == 0) goto L_0x0016
            r3 = 14
            int r0 = r8.A00
            r4 = 0
            if (r3 != r0) goto L_0x0017
        L_0x0016:
            r4 = 1
        L_0x0017:
            java.lang.String r5 = "merchantJid"
            X.C18070vi.A0o(r10, r1, r6)
            r0 = 5
            X.C18070vi.A0d(r9, r0)
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "total_amount"
            r3.putString(r0, r10)
            X.AnonymousClass3MY.A15(r3, r7, r5)
            java.lang.String r0 = "payment_settings"
            r3.putParcelable(r0, r9)
            java.lang.String r0 = "total_amount_money_representation"
            r3.putParcelable(r0, r6)
            java.lang.String r0 = "referral_screen"
            r3.putString(r0, r11)
            java.lang.String r0 = "is_quick_launch_enabled"
            r3.putBoolean(r0, r2)
            X.AEt r2 = r1.BPK()
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            java.lang.String r0 = "interactive_message_content"
            r3.putParcelable(r0, r2)
            X.206 r1 = (X.AnonymousClass206) r1
            int r1 = r1.A0u
            java.lang.String r0 = "message_type"
            r3.putInt(r0, r1)
            X.AEn r0 = r2.A02
            X.C17960vV.A07(r0)
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = "referenceId"
            r3.putString(r0, r1)
            java.lang.String r0 = "should_enable_pix_key_flow"
            r3.putBoolean(r0, r4)
            com.whatsapp.payments.ui.BrazilPixBottomSheet r1 = new com.whatsapp.payments.ui.BrazilPixBottomSheet
            r1.<init>()
            r1.A1R(r3)
            X.A9t r0 = r1.A05
            r0.A00 = r8
            X.C20098A7b.A00(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A0Q(X.ARR, X.1BI, com.whatsapp.payments.ui.BrazilOrderDetailsActivity, X.Abo, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r5.A08) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0V(X.ARR r10, X.AnonymousClass1BI r11, com.whatsapp.payments.ui.BrazilOrderDetailsActivity r12, java.lang.String r13, java.lang.String r14) {
        /*
            X.21K r0 = r12.A0K
            r2 = r0
            X.206 r2 = (X.AnonymousClass206) r2
            X.AEt r0 = r0.BPK()
            X.C17960vV.A07(r0)
            X.AEn r5 = r0.A02
            if (r5 == 0) goto L_0x0019
            java.lang.String r0 = r5.A08
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r9 = 1
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r9 = 0
        L_0x001a:
            r4 = 0
            if (r5 == 0) goto L_0x0029
            X.ADZ r0 = r5.A0E
            if (r0 == 0) goto L_0x0029
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x0029
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L_0x0029:
            com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel r8 = r12.A0D
            r6 = r11
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            java.lang.String r3 = r12.A0S
            X.C17960vV.A07(r3)
            X.205 r0 = r2.A0v
            java.lang.String r7 = r0.A01
            java.lang.String r1 = r12.A0T
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.C18070vi.A0o(r10, r3, r7)
            r8.A01 = r6
            r8.A00 = r10
            r8.A04 = r3
            r8.A03 = r7
            r8.A05 = r1
            r8.A02 = r4
            java.lang.String r8 = r12.A0S
            X.C17960vV.A07(r8)
            java.lang.String r6 = r12.A0T
            r0 = 1
            X.C18070vi.A0f(r14, r0, r8)
            com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet r1 = new com.whatsapp.payments.ui.BrazilHostedPaymentPageBottomSheet
            r1.<init>()
            android.os.Bundle r3 = X.C17880vN.A0D()
            java.lang.String r0 = "psp_name"
            r3.putString(r0, r13)
            java.lang.String r0 = "total_amount"
            r3.putString(r0, r14)
            java.lang.String r0 = "merchant_jid"
            X.AnonymousClass3MY.A15(r3, r11, r0)
            java.lang.String r0 = "payment_money"
            r3.putParcelable(r0, r10)
            java.lang.String r0 = "order_id"
            r3.putString(r0, r8)
            java.lang.String r0 = "message_id"
            r3.putString(r0, r7)
            java.lang.String r0 = "payment_config"
            r3.putString(r0, r6)
            java.lang.String r0 = "max_installment_count"
            r3.putString(r0, r4)
            r1.A1R(r3)
            X.A9t r0 = r1.A05
            r0.A00 = r12
            if (r9 == 0) goto L_0x00a5
            X.Aa4 r4 = new X.Aa4
            r4.<init>(r1, r12, r2)
            X.9mY r3 = r12.A0A
            java.lang.String r2 = r5.A08
            r1 = 34
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r12, r5, r4, r1)
            r3.A00(r0, r2)
            return
        L_0x00a5:
            X.C20098A7b.A00(r1, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A0V(X.ARR, X.1BI, com.whatsapp.payments.ui.BrazilOrderDetailsActivity, java.lang.String, java.lang.String):void");
    }

    public static void A0d(AnonymousClass1BI r11, BrazilOrderDetailsActivity brazilOrderDetailsActivity, String str, int i) {
        String str2;
        C20279AEn aEn;
        AnonymousClass21K r7 = brazilOrderDetailsActivity.A0K;
        C20285AEt BPK = r7.BPK();
        if (BPK == null || (aEn = BPK.A02) == null) {
            str2 = null;
        } else {
            str2 = aEn.A06;
        }
        C20279AEn A0T2 = brazilOrderDetailsActivity.A0C.A0T(brazilOrderDetailsActivity.A0J, r7, str, "pending_buyer_confirmation", i);
        AnonymousClass8Gd r3 = brazilOrderDetailsActivity.A0C;
        AnonymousClass21K r2 = brazilOrderDetailsActivity.A0K;
        C190269ke r72 = (C190269ke) brazilOrderDetailsActivity.A0Q.get();
        C18070vi.A0d(r2, 2);
        if (C18020vd.A05(C18040vf.A02, r3.A06, 10873) && C22971Dz.A0d(r11) && r72 != null && r72.A00(11217, r11.user) && A0T2.A0T && !C18070vi.A18(A0T2.A06, str2)) {
            UserJid userJid = (UserJid) r11;
            if (r3.A05.A04(userJid)) {
                r3.CHM(userJid, A0T2, r2);
            }
        }
    }

    public static void A0q(AnonymousClass1BI r6, BrazilOrderDetailsActivity brazilOrderDetailsActivity, String str, String str2, String str3, boolean z) {
        if (AnonymousClass8BU.A1R(brazilOrderDetailsActivity.A0P)) {
            brazilOrderDetailsActivity.A0C.A0T(brazilOrderDetailsActivity.A0J, brazilOrderDetailsActivity.A0K, (String) null, "pending_buyer_confirmation", 2);
        }
        C17960vV.A07(r6);
        C17960vV.A07(str);
        PaymentCustomInstructionsBottomSheet A002 = AnonymousClass9RL.A00(r6, str, str2, str3, z);
        A002.A05.A00 = brazilOrderDetailsActivity;
        C20098A7b.A00(A002, brazilOrderDetailsActivity);
    }

    public static void A0r(BrazilOrderDetailsActivity brazilOrderDetailsActivity, AnonymousClass21K r8, int i) {
        A6X a6x = brazilOrderDetailsActivity.A0M;
        ArrayList A002 = brazilOrderDetailsActivity.A0E.A00();
        AnonymousClass21K r2 = r8;
        a6x.A06(r2, A03(brazilOrderDetailsActivity), AnonymousClass1R2.A06(i), A002, 5, true, true, true);
    }

    public static void A0s(BrazilOrderDetailsActivity brazilOrderDetailsActivity, boolean z) {
        C20279AEn aEn;
        AEE aee;
        C20275AEi aEi;
        C20285AEt BPK = brazilOrderDetailsActivity.A0K.BPK();
        if (BPK == null || (aee = BPK.A05) == null || (aEi = aee.A00) == null) {
            z = false;
        } else if (((C191819nE) brazilOrderDetailsActivity.A0O.get()).A00(aEi)) {
            z = true;
        }
        String A012 = A6X.A01(brazilOrderDetailsActivity.A0K);
        if (TextUtils.isEmpty(A012)) {
            brazilOrderDetailsActivity.A0M.A07.get();
            A012 = C108985cd.A0f();
            AnonymousClass21K r3 = brazilOrderDetailsActivity.A0K;
            C20285AEt BPK2 = r3.BPK();
            if (!(BPK2 == null || (aEn = BPK2.A02) == null)) {
                aEn.A05 = A012;
                brazilOrderDetailsActivity.A0C.CQb(aEn, brazilOrderDetailsActivity.A0J, r3);
            }
        }
        AnonymousClass21K r2 = brazilOrderDetailsActivity.A0K;
        AnonymousClass206 r1 = (AnonymousClass206) r2;
        AnonymousClass1BI r4 = r1.A0v.A00;
        if (r4 != null) {
            A6X a6x = brazilOrderDetailsActivity.A0M;
            C20285AEt BPK3 = r2.BPK();
            int i = r1.A0u;
            ArrayList A002 = brazilOrderDetailsActivity.A0E.A00();
            a6x.A03(r4, BPK3, A03(brazilOrderDetailsActivity), A012, AnonymousClass1R2.A06(brazilOrderDetailsActivity.A0E.A01), A002, 39, i, C199189za.A00((AnonymousClass206) brazilOrderDetailsActivity.A0K), true, true, true, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0140, code lost:
        if (X.C108965cb.A1b(r10.A0W, r10.A00) != false) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4e(android.os.Bundle r32) {
        /*
            r31 = this;
            r10 = r31
            java.lang.String r0 = X.AnonymousClass8BV.A0o(r10)
            r10.A0j = r0
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "extra_is_quick_buy"
            r3 = 0
            boolean r0 = r1.getBooleanExtra(r0, r3)
            r10.A0V = r0
            android.content.Intent r2 = r10.getIntent()
            java.lang.String r1 = "extra_quick_launch_option"
            r0 = -2
            int r0 = r2.getIntExtra(r1, r0)
            r10.A01 = r0
            android.content.Intent r2 = r10.getIntent()
            r1 = -1
            java.lang.String r0 = "extra_quick_launch_action"
            int r0 = r2.getIntExtra(r0, r1)
            r10.A00 = r0
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r10)
            r1 = 2131624535(0x7f0e0257, float:1.8876252E38)
            r0 = 0
            android.view.View r0 = r2.inflate(r1, r0, r3)
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r0 = (com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2) r0
            r10.A0B = r0
            X.01n r3 = r10.getSupportActionBar()
            boolean r0 = r10.A0V
            r2 = 1
            if (r0 != 0) goto L_0x01cc
            java.util.Set r1 = r10.A0X
            int r0 = r10.A01
            boolean r0 = X.C108965cb.A1b(r1, r0)
            if (r0 != 0) goto L_0x01cc
            java.util.Set r1 = r10.A0W
            int r0 = r10.A00
            boolean r0 = X.C108965cb.A1b(r1, r0)
            if (r0 != 0) goto L_0x01cc
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r0 = r10.A0B
            r10.setContentView((android.view.View) r0)
            if (r3 == 0) goto L_0x0066
            r3.A0W(r2)
        L_0x0066:
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "extra_order_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r10.A0S = r0
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "extra_payment_config_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r10.A0T = r0
            android.content.Intent r1 = r10.getIntent()
            java.lang.String r0 = "extra_order_expiry_ts_in_sec"
            long r0 = X.C108975cc.A06(r1, r0)
            r10.A02 = r0
            android.content.Intent r0 = r10.getIntent()
            X.205 r0 = X.AnonymousClass4aU.A02(r0)
            X.C17960vV.A07(r0)
            r10.A0J = r0
            X.11P r11 = r10.A05
            X.0ve r9 = r10.A0E
            X.1np r8 = r10.A0c
            android.content.res.Resources r13 = r10.getResources()
            X.1R2 r7 = r10.A0I
            X.129 r6 = r10.A0N
            X.0vb r5 = r10.A06
            X.1QS r4 = r10.A0Q
            X.1PM r3 = r10.A03
            X.1QO r2 = r10.A0P
            X.00H r1 = r10.A0P
            X.1Nf r0 = r10.A06
            X.96X r12 = new X.96X
            r14 = r10
            r15 = r3
            r16 = r11
            r17 = r5
            r18 = r0
            r19 = r9
            r20 = r2
            r21 = r4
            r22 = r7
            r23 = r6
            r24 = r8
            r25 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r10.A09 = r12
            r12.A00 = r10
            X.10I r1 = r10.A05
            X.1QR r0 = r10.A07
            X.9mY r3 = new X.9mY
            r3.<init>(r0, r10, r1)
            r10.A0A = r3
            X.1Fv r2 = r10.getLifecycle()
            r1 = 1
            X.AGh r0 = new X.AGh
            r0.<init>(r3, r1)
            r2.A05(r0)
            java.util.Set r14 = r10.A0X
            int r0 = r10.A01
            boolean r0 = X.C108965cb.A1b(r14, r0)
            if (r0 == 0) goto L_0x01c8
            int r1 = r10.A01
            r0 = 6
            if (r1 != r0) goto L_0x01c8
            r12 = 0
        L_0x00f8:
            X.11P r0 = r10.A05
            r30 = r0
            X.0ve r0 = r10.A0E
            r16 = r0
            X.10I r15 = r10.A05
            X.1iW r13 = r10.A03
            X.1R2 r11 = r10.A0I
            X.11C r9 = r10.A08
            X.1QS r8 = r10.A0Q
            X.122 r7 = r10.A07
            X.00H r0 = r10.A0d
            X.1W6 r26 = X.C17880vN.A0c(r0)
            X.1Lg r6 = r10.A04
            X.1PM r5 = r10.A03
            X.1QR r4 = r10.A07
            X.00H r0 = r10.A0i
            java.lang.Object r3 = r0.get()
            X.2L2 r3 = (X.AnonymousClass2L2) r3
            X.00H r0 = r10.A0e
            java.lang.Object r2 = r0.get()
            X.9yc r2 = (X.C198609yc) r2
            X.205 r1 = r10.A0J
            boolean r0 = r10.A0V
            if (r0 != 0) goto L_0x0142
            int r0 = r10.A01
            boolean r0 = X.C108965cb.A1b(r14, r0)
            if (r0 != 0) goto L_0x0142
            java.util.Set r14 = r10.A0W
            int r0 = r10.A00
            boolean r0 = X.C108965cb.A1b(r14, r0)
            r29 = 0
            if (r0 == 0) goto L_0x0144
        L_0x0142:
            r29 = 1
        L_0x0144:
            X.AHE r0 = new X.AHE
            r28 = 1
            r27 = r15
            r23 = r2
            r24 = r11
            r25 = r1
            r20 = r12
            r21 = r3
            r22 = r8
            r17 = r6
            r18 = r4
            r19 = r16
            r14 = r9
            r15 = r30
            r16 = r7
            r11 = r0
            r12 = r13
            r13 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r10)
            java.lang.Class<X.8Gd> r0 = X.AnonymousClass8Gd.class
            X.1J2 r0 = r1.A00(r0)
            X.8Gd r0 = (X.AnonymousClass8Gd) r0
            r10.A0C = r0
            r1 = r32
            if (r32 == 0) goto L_0x01ae
            java.lang.String r0 = "save_order_detail_state_key"
            android.os.Bundle r0 = r1.getBundle(r0)
            if (r0 == 0) goto L_0x01ae
            X.8Gd r0 = r10.A0C
            r0.A0W(r1)
        L_0x0186:
            X.8Gd r0 = r10.A0C
            X.1DS r1 = r0.A03
            r0 = 33
            X.C20336AGs.A00(r10, r1, r0)
            X.1It r1 = X.AnonymousClass3MW.A0N(r10)
            java.lang.Class<com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel> r0 = com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel r0 = (com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel) r0
            r10.A0D = r0
            X.1DT r1 = r0.A01
            r0 = 34
            X.C20336AGs.A00(r10, r1, r0)
            com.whatsapp.payments.ui.viewmodel.BrazilPaymentComplianceViewModel r0 = r10.A0D
            X.1DT r1 = r0.A00
            r0 = 35
            X.C20336AGs.A00(r10, r1, r0)
            return
        L_0x01ae:
            X.1R2 r4 = r10.A0I
            X.11S r0 = r10.A02
            com.whatsapp.jid.PhoneUserJid r3 = X.AnonymousClass11S.A00(r0)
            com.whatsapp.jid.UserJid r2 = r10.A0J
            X.2tK r0 = X.C63572tK.A0E
            java.lang.String r1 = "55"
            X.1Ln r0 = r10.A09
            boolean r1 = r4.A0i(r0, r3, r2, r1)
            X.8Gd r0 = r10.A0C
            r0.A0a(r1)
            goto L_0x0186
        L_0x01c8:
            com.whatsapp.jid.UserJid r12 = r10.A0J
            goto L_0x00f8
        L_0x01cc:
            if (r3 == 0) goto L_0x0066
            r3.A0E()
            r0 = 2131895077(0x7f122325, float:1.9424977E38)
            r10.CNA(r0)
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilOrderDetailsActivity.A4e(android.os.Bundle):void");
    }

    public void A4p(C20274AEh aEh, AnonymousClass1KN r14, C20284AEs aEs, AnonymousClass34B r16, String str, String str2, String str3, int i) {
        Integer num;
        AnonymousClass8BT.A1K(this.A05, this, str2, 41);
        if (aEh != null) {
            num = Integer.valueOf(aEh.A01);
        } else {
            num = null;
        }
        this.A0M.A06(this.A0K, num, "native", this.A0E.A00(), 19, false, false, true);
        super.A4p(aEh, r14, aEs, r16, str, str2, str3, i);
    }

    public void A4t(AnonymousClass1BI r7, HashMap hashMap) {
        String str;
        C20251ADj aDj;
        boolean z;
        C191559mn r0 = (C191559mn) AnonymousClass8BT.A0r(hashMap, 8);
        if (r0 == null || (aDj = r0.A03) == null) {
            str = "Payment checkout option configuration does not contains boleto";
        } else {
            C20927Abh abh = (C20927Abh) aDj.A00;
            if (abh == null) {
                str = "Payment link object is null";
            } else if (!this.A0C.A0d(abh.A00)) {
                str = AnonymousClass1QE.A01("BrazilOrderDetailActivity", "copy boleto code failed");
            } else {
                String A012 = A6X.A01(this.A0K);
                if (TextUtils.isEmpty(A012)) {
                    this.A0M.A07.get();
                    A012 = C108985cd.A0f();
                }
                A0d(r7, this, A012, 8);
                View view = this.A00;
                if (view == null) {
                    view = getWindow().getDecorView().findViewById(16908290);
                    z = true;
                    if (view == null) {
                        str = AnonymousClass1QE.A01("BrazilOrderDetailActivity", "cannot show snackbar, no view available");
                    }
                } else {
                    z = false;
                }
                C23520Bik A013 = C23520Bik.A01(view, 2131888293, -1);
                if (z) {
                    BIE bie = A013.A0J;
                    ViewGroup.LayoutParams layoutParams = bie.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = getResources().getDimensionPixelSize(2131166253);
                        bie.setLayoutParams(layoutParams);
                    }
                }
                A013.A08();
                return;
            }
        }
        Log.e(str);
    }

    public void A4u(AnonymousClass9I2 r8, C191979nV r9, int i) {
        AnonymousClass10I r6 = this.A05;
        AnonymousClass122 r1 = this.A07;
        C33651jA r4 = this.A08;
        A63.A02(this.A05, r1, this.A07, new C20599ARj(this, r8, r9, i), r4, r9.A0B, r6);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01d8, code lost:
        if (r6.equals(r4) == false) goto L_0x017f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bob(X.ARR r24, X.AnonymousClass1BI r25, X.ADQ r26, X.C191559mn r27, X.AnonymousClass21K r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.util.HashMap r32) {
        /*
            r23 = this;
            r8 = r25
            java.lang.String r4 = "BrazilOrderDetailsActivity"
            r2 = 1
            r3 = 0
            java.lang.String r0 = "invalid merchant JID"
            X.AnonymousClass1QE.A01(r4, r0)     // Catch:{ IllegalArgumentException -> 0x020f }
            java.lang.Boolean r0 = X.C17960vV.A01     // Catch:{ IllegalArgumentException -> 0x020f }
            r11 = r27
            boolean r1 = X.AnonymousClass000.A1W(r11)
            java.lang.String r0 = "invalid payment method"
            java.lang.String r0 = X.AnonymousClass1QE.A01(r4, r0)     // Catch:{ IllegalArgumentException -> 0x020f }
            X.C17960vV.A0G(r1, r0)     // Catch:{ IllegalArgumentException -> 0x020f }
            r13 = r28
            X.AEt r0 = r13.BPK()     // Catch:{ IllegalArgumentException -> 0x020f }
            if (r0 != 0) goto L_0x0025
            r2 = 0
        L_0x0025:
            java.lang.String r0 = "invalid message content"
            java.lang.String r0 = X.AnonymousClass1QE.A01(r4, r0)     // Catch:{ IllegalArgumentException -> 0x020f }
            X.C17960vV.A0G(r2, r0)     // Catch:{ IllegalArgumentException -> 0x020f }
            r5 = 6
            r15 = r32
            java.lang.Object r12 = X.AnonymousClass8BT.A0r(r15, r5)
            X.9mn r12 = (X.C191559mn) r12
            int r0 = r11.A01
            r1 = -1
            r9 = r23
            r7 = r24
            r10 = r26
            r14 = r30
            if (r0 == r1) goto L_0x0145
            r2 = r31
            if (r0 == 0) goto L_0x0140
            r1 = 2
            if (r0 == r1) goto L_0x011c
            r1 = 3
            if (r0 == r1) goto L_0x00c2
            r1 = 5
            if (r0 == r1) goto L_0x00be
            if (r0 == r5) goto L_0x0082
            r1 = 7
            if (r0 == r1) goto L_0x006a
            r1 = 8
            if (r0 == r1) goto L_0x0063
            java.lang.String r1 = "onCheckoutCtaButtonClicked : the selected payment method is not supported"
            X.AnonymousClass8BS.A1F(r4, r1)
        L_0x005f:
            A0r(r9, r13, r0)
            return
        L_0x0063:
            X.C17960vV.A07(r8)
            r9.A4t(r8, r15)
            goto L_0x005f
        L_0x006a:
            X.C17960vV.A07(r8)
            X.9xu r1 = r9.A0H
            if (r1 == 0) goto L_0x0080
            java.lang.Object r1 = r1.A01
            if (r1 == 0) goto L_0x0080
            X.A2J r1 = (X.A2J) r1
            java.lang.String r1 = r1.A07
        L_0x0079:
            X.C17960vV.A07(r14)
            A0V(r7, r8, r9, r1, r14)
            goto L_0x005f
        L_0x0080:
            r1 = 0
            goto L_0x0079
        L_0x0082:
            if (r12 == 0) goto L_0x005f
            X.ADj r4 = r12.A03
            if (r4 == 0) goto L_0x005f
            java.lang.String r3 = r4.A01
            java.lang.String r1 = "pix_static_code"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x009a
            java.lang.String r1 = "pix_dynamic_code"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x005f
        L_0x009a:
            X.BDZ r3 = r4.A00
            boolean r1 = r3 instanceof X.C20934Abo
            if (r1 == 0) goto L_0x005f
            X.C17960vV.A07(r8)
            X.C17960vV.A07(r14)
            X.C17960vV.A07(r7)
            X.Abo r3 = (X.C20934Abo) r3
            boolean r21 = A0t(r13)
            r15 = r7
            r16 = r8
            r17 = r9
            r18 = r3
            r19 = r14
            r20 = r2
            A0Q(r15, r16, r17, r18, r19, r20, r21)
            goto L_0x005f
        L_0x00be:
            r9.A4v(r15)
            goto L_0x005f
        L_0x00c2:
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = java.lang.System.currentTimeMillis()
            long r17 = r4.toSeconds(r1)
            X.8Gd r12 = r9.A0C
            r14 = 0
            r16 = 3
            r15 = r14
            X.AEn r4 = r12.A0U(r13, r14, r15, r16, r17)
            X.8Gd r1 = r9.A0C
            boolean r1 = r1.A0b()
            if (r1 == 0) goto L_0x0111
            r1 = 2131893287(0x7f121c27, float:1.9421346E38)
            java.lang.String r2 = r9.getString(r1)
            X.1iW r1 = r9.A03
            r1.A0W(r8, r2)
        L_0x00ea:
            X.8Gd r2 = r9.A0C
            X.205 r1 = r9.A0J
            r2.CQb(r4, r1, r13)
            X.A6X r14 = r9.A0M
            X.21K r15 = r9.A0K
            X.9mn r1 = r9.A0E
            java.util.ArrayList r18 = r1.A00()
            java.lang.Integer r16 = A03(r9)
            r22 = 1
            r19 = 19
            java.lang.String r17 = "confirm"
            r21 = r3
            r20 = r3
            r14.A06(r15, r16, r17, r18, r19, r20, r21, r22)
            r9.finish()
            goto L_0x005f
        L_0x0111:
            X.8Gd r1 = r9.A0C
            X.C17960vV.A07(r8)
            com.whatsapp.jid.UserJid r8 = (com.whatsapp.jid.UserJid) r8
            r1.CHM(r8, r4, r13)
            goto L_0x00ea
        L_0x011c:
            X.ADz r1 = r11.A02
            if (r1 != 0) goto L_0x0126
            java.lang.String r0 = "invalid external payemnt configuration payload"
            X.AnonymousClass8BS.A1F(r4, r0)
            return
        L_0x0126:
            X.C17960vV.A07(r8)
            java.lang.String r1 = r1.A00
            X.C17960vV.A07(r1)
            boolean r20 = A0t(r13)
            r15 = r8
            r16 = r9
            r17 = r1
            r18 = r2
            r19 = r14
            A0q(r15, r16, r17, r18, r19, r20)
            goto L_0x005f
        L_0x0140:
            A0c(r7, r9, r10, r13, r2)
            goto L_0x005f
        L_0x0145:
            X.1ej r1 = r9.A07
            X.1ei r1 = r1.A00()
            if (r1 == 0) goto L_0x020c
            X.0ve r4 = r1.A00
            r2 = 12476(0x30bc, float:1.7483E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            if (r1 == 0) goto L_0x020c
            X.AEt r1 = r13.BPK()
            if (r1 == 0) goto L_0x020c
            X.AEn r1 = r1.A02
            if (r1 == 0) goto L_0x020c
            java.lang.String r6 = r1.A0J
            java.util.List r2 = r11.A05
            r5 = 0
            if (r6 == 0) goto L_0x017f
            int r1 = r6.length()
            if (r1 == 0) goto L_0x017f
            if (r2 == 0) goto L_0x017f
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x017f
            int r1 = r6.hashCode()
            switch(r1) {
                case -1383481471: goto L_0x01d2;
                case -787544450: goto L_0x01db;
                case -497186157: goto L_0x01c7;
                case 94431075: goto L_0x01bc;
                case 268888205: goto L_0x01b9;
                default: goto L_0x017f;
            }
        L_0x017f:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x0192
            java.util.List r1 = r11.A05
            X.C17960vV.A07(r1)
            java.lang.Object r1 = r1.get(r3)
            X.AEZ r1 = (X.AEZ) r1
            java.lang.String r5 = r1.A0A
        L_0x0192:
            java.util.List r3 = r11.A05
            X.C17960vV.A07(r3)
            java.lang.String r1 = r9.A0j
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01b6
            java.lang.String r2 = r9.A0j
        L_0x01a1:
            r1 = 1
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r2 = com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet.A00(r5, r2, r3, r1)
            X.A9t r1 = r2.A03
            r1.A00 = r9
            X.AaR r6 = new X.AaR
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A05 = r6
            X.C20098A7b.A00(r2, r9)
            goto L_0x005f
        L_0x01b6:
            java.lang.String r2 = "order_details"
            goto L_0x01a1
        L_0x01b9:
            java.lang.String r1 = "pix_dynamic_code"
            goto L_0x01dd
        L_0x01bc:
            java.lang.String r1 = "cards"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x017f
            java.lang.String r4 = "WhatsappPay"
            goto L_0x01e5
        L_0x01c7:
            java.lang.String r1 = "payment_link"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x017f
            java.lang.String r4 = "checkout_lite"
            goto L_0x01e5
        L_0x01d2:
            java.lang.String r4 = "boleto"
            boolean r1 = r6.equals(r4)
            if (r1 != 0) goto L_0x01e5
            goto L_0x017f
        L_0x01db:
            java.lang.String r1 = "pix_static_code"
        L_0x01dd:
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x017f
            java.lang.String r4 = "pix"
        L_0x01e5:
            java.util.Iterator r6 = r2.iterator()
        L_0x01e9:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x020a
            java.lang.Object r2 = r6.next()
            r1 = r2
            X.AEZ r1 = (X.AEZ) r1
            if (r1 == 0) goto L_0x0208
            java.lang.String r1 = r1.A0A
        L_0x01fa:
            boolean r1 = X.C18070vi.A18(r1, r4)
            if (r1 == 0) goto L_0x01e9
        L_0x0200:
            X.AEZ r2 = (X.AEZ) r2
            if (r2 == 0) goto L_0x017f
            java.lang.String r5 = r2.A0A
            goto L_0x017f
        L_0x0208:
            r1 = r5
            goto L_0x01fa
        L_0x020a:
            r2 = r5
            goto L_0x0200
        L_0x020c:
            r5 = 0
            goto L_0x017f
        L_0x020f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilOrderDetailsActivity.Bob(X.ARR, X.1BI, X.ADQ, X.9mn, X.21K, java.lang.String, java.lang.String, java.lang.String, java.util.HashMap):void");
    }

    public void Bv9(String str, String str2) {
        C20279AEn aEn;
        AnonymousClass21K r1 = this.A0K;
        C20285AEt BPK = r1.BPK();
        if (!(BPK == null || (aEn = BPK.A02) == null)) {
            aEn.A08 = str2;
            this.A07.CQw((AnonymousClass206) r1);
        }
        Intent A0G2 = C108945cZ.A0G("android.intent.action.VIEW");
        A0G2.setData(Uri.parse(str));
        startActivity(A0G2);
        finish();
    }

    public void ByJ(AnonymousClass1BI r10, AnonymousClass21K r11, long j) {
        this.A0M.A06(r11, A03(this), (String) null, (List) null, 8, false, false, false);
        Intent A1w = this.A06.A1w(this, r10, 0);
        A1w.putExtra("extra_quoted_message_row_id", j);
        startActivity(A1w);
    }

    public void CA9(AnonymousClass1DT r25, AnonymousClass21K r26) {
        AEE aee;
        C20275AEi aEi;
        AnonymousClass21K r5 = r26;
        C20285AEt BPK = r5.BPK();
        if (BPK == null || (aee = BPK.A05) == null || (aEi = aee.A00) == null) {
            Log.e("Cannot find document metadata on interactive message");
            return;
        }
        C191819nE r2 = (C191819nE) this.A0O.get();
        if (!TextUtils.isEmpty(aEi.A00)) {
            String str = aEi.A00;
            C18070vi.A0d(str, 0);
            File A072 = r2.A02.A07(C108945cZ.A17(str));
            if (A072 != null && A072.exists()) {
                A0s(this, true);
                String str2 = aEi.A07;
                Intent A0G2 = C108945cZ.A0G("android.intent.action.VIEW");
                A0G2.setDataAndType(C64062u9.A02(this, A072), str2);
                A0G2.setFlags(1);
                this.A01.A08(this, A0G2);
                return;
            }
        }
        C191819nE r7 = (C191819nE) this.A0O.get();
        AnonymousClass7SD r6 = new AnonymousClass7SD(r7, this, r5, 1);
        C21536Alj alj = new C21536Alj(this, 0);
        AnonymousClass1KB r13 = r7.A00;
        AnonymousClass18K r4 = r7.A06;
        AnonymousClass68M r11 = new AnonymousClass68M(this, r13, r7.A01, r7.A03, r7.A04, r4, r6, alj);
        C36181nT r62 = (C36181nT) this.A0R.get();
        AnonymousClass1DT r42 = r25;
        AnonymousClass3Ma.A1O(r62, 1, r42);
        if (!C18070vi.A18(r42.A06(), true)) {
            r42.A0E(true);
            C26551So r8 = C26551So.A0B;
            String str3 = aEi.A06;
            String str4 = aEi.A05;
            String str5 = aEi.A08;
            String str6 = aEi.A03;
            String str7 = aEi.A07;
            byte[] bArr = aEi.A09;
            Long l = aEi.A01;
            C17960vV.A07(l);
            C18070vi.A0X(l);
            r62.A0A(r11, r8, new C21111Aef(r42, 17), (AnonymousClass1TI) null, (String) null, str3, str4, str5, str6, str7, bArr, 6, 8, 1, 0, l.longValue());
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        A2J a2j;
        ADI adi;
        C198179xu r0 = this.A0H;
        if (!(r0 == null || (a2j = (A2J) r0.A01) == null)) {
            Bundle A0D2 = C17880vN.A0D();
            Boolean bool = a2j.A06;
            if (bool != null) {
                A0D2.putBoolean("should_show_shimmer_key", bool.booleanValue());
            }
            A0D2.putParcelable("checkout_error_code_key", a2j.A03);
            A0D2.putParcelable("merchant_jid_key", a2j.A02);
            A0D2.putSerializable("merchant_status_key", a2j.A04);
            AnonymousClass21K r02 = a2j.A05;
            if (r02 != null) {
                AW0 A002 = AnonymousClass25B.A00((AnonymousClass206) r02);
                C20128A8n a8n = C20128A8n.$redex_init_class;
                if (A002 == null) {
                    adi = null;
                } else {
                    adi = new ADI(A002);
                }
                A0D2.putParcelable("payment_transaction_key", adi);
            }
            List list = a2j.A08;
            if (list != null) {
                A0D2.putParcelableArrayList("installment_option_key", C17880vN.A10(list));
            }
            bundle.putBundle("save_order_detail_state_key", A0D2);
        }
        super.onSaveInstanceState(bundle);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.A0V && !C108965cb.A1b(this.A0X, this.A01)) {
            return super.onTouchEvent(motionEvent);
        }
        C108965cb.A0y(this);
        return true;
    }

    public BrazilOrderDetailsActivity() {
        Integer[] numArr = new Integer[7];
        boolean A1b = C72453Mb.A1b(numArr, -1);
        boolean A1b2 = AnonymousClass8BU.A1b(numArr, 6);
        AnonymousClass3MX.A1R(numArr, 2);
        C17880vN.A1T(numArr, A1b ? 1 : 0, 3);
        C17880vN.A1T(numArr, 7, 4);
        AnonymousClass3MX.A1R(numArr, 5);
        this.A0X = C17900vP.A0I(AnonymousClass3MY.A0g(), numArr, 6);
        Integer[] numArr2 = new Integer[2];
        C17880vN.A1T(numArr2, 3, A1b);
        this.A0W = C17900vP.A0I(14, numArr2, A1b2 ? 1 : 0);
    }

    public static void A0c(ARR arr, BrazilOrderDetailsActivity brazilOrderDetailsActivity, ADQ adq, AnonymousClass21K r11, String str) {
        brazilOrderDetailsActivity.CNA(2131895077);
        AnonymousClass10I r6 = brazilOrderDetailsActivity.A05;
        AnonymousClass122 r1 = brazilOrderDetailsActivity.A07;
        C33651jA r4 = brazilOrderDetailsActivity.A08;
        A63.A02(brazilOrderDetailsActivity.A05, r1, brazilOrderDetailsActivity.A07, new C20601ARl(arr, brazilOrderDetailsActivity, adq, r11, str), r4, r11, r6);
    }

    public static boolean A0t(AnonymousClass21K r0) {
        C20279AEn aEn;
        C20285AEt BPK = r0.BPK();
        if (BPK == null || (aEn = BPK.A02) == null) {
            return false;
        }
        return aEn.A08();
    }

    public void A4s(C170308pe r2, int i) {
        super.A4s(r2, i);
        r2.A02 = A4m();
    }

    public void A4v(HashMap hashMap) {
        String str;
        C20251ADj aDj;
        C191559mn r0 = (C191559mn) hashMap.get(C17880vN.A0l());
        if (r0 == null || (aDj = r0.A03) == null || !this.A0P.A0O(Collections.singletonList(aDj))) {
            str = "Payment checkout option configuration does not contains payment link";
        } else {
            C20932Abm abm = (C20932Abm) aDj.A00;
            if (abm == null) {
                str = "Payment link object is null";
            } else {
                String A0Q2 = C17890vO.A0Q();
                AnonymousClass21K r02 = this.A0K;
                if (r02 != null && !TextUtils.isEmpty(A6X.A01(r02))) {
                    A0Q2 = A6X.A01(this.A0K);
                }
                this.A0C.A0T(this.A0J, this.A0K, A0Q2, "pending", 5);
                String str2 = abm.A02;
                Intent A0G2 = C108945cZ.A0G("android.intent.action.VIEW");
                A0G2.setData(Uri.parse(str2));
                startActivity(A0G2);
                finish();
                return;
            }
        }
        Log.e(str);
    }

    public void CMz(AW0 aw0, AnonymousClass1BI r13, long j) {
        C20285AEt BPK;
        C20279AEn aEn;
        C20285AEt BPK2;
        C20279AEn aEn2;
        int i;
        int i2 = 2131893210;
        int i3 = 2131893209;
        int i4 = aw0.A02;
        if (i4 == 401 || i4 == 403 || i4 == 420) {
            i2 = 2131893208;
            i3 = 2131893207;
        }
        AnonymousClass1BI r6 = r13;
        if (!(((r13 == null || !((C190269ke) this.A0Q.get()).A00(7751, r13.user)) && ((BPK = this.A0K.BPK()) == null || (aEn = BPK.A02) == null || !this.A0I.A0q(aEn))) || (BPK2 = this.A0K.BPK()) == null || (aEn2 = BPK2.A02) == null || aEn2.A00 == (i = aw0.A02))) {
            aEn2.A00 = i;
            if (aw0.A0L()) {
                aEn2.A06 = null;
                aEn2.A07 = "captured";
            }
            this.A07.CQw((AnonymousClass206) this.A0K);
        }
        C73203Rj A0E2 = AnonymousClass8BW.A0E(this);
        A0E2.A0k(getString(i2));
        C108955ca.A1D(this, A0E2, i3);
        C20151A9n.A00(A0E2, this, 44, 2131899286);
        A0E2.A0X(new A9X(r6, this, 0, j), 2131887988);
        AnonymousClass3MY.A1G(A0E2);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if ((this.A0V || C108965cb.A1b(this.A0X, this.A01)) && i2 == 0) {
            C108965cb.A0y(this);
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0V || C108965cb.A1b(this.A0X, this.A01)) {
            overridePendingTransition(0, 0);
        }
    }
}
