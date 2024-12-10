package com.whatsapp.payments.ui;

import X.A0J;
import X.A2J;
import X.A3T;
import X.A7B;
import X.AE0;
import X.AES;
import X.AEV;
import X.AH1;
import X.AHE;
import X.ARR;
import X.AS8;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10I;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass122;
import X.AnonymousClass1BI;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1QO;
import X.AnonymousClass1QR;
import X.AnonymousClass1QS;
import X.AnonymousClass1R2;
import X.AnonymousClass1W6;
import X.AnonymousClass205;
import X.AnonymousClass21K;
import X.AnonymousClass2L2;
import X.AnonymousClass3C5;
import X.AnonymousClass3MW;
import X.AnonymousClass6X6;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BX;
import X.AnonymousClass8F3;
import X.AnonymousClass8Gd;
import X.AnonymousClass8pF;
import X.AnonymousClass92q;
import X.AnonymousClass9BR;
import X.AnonymousClass9I2;
import X.BD5;
import X.C003401n;
import X.C108965cb;
import X.C170318pf;
import X.C175748zD;
import X.C1764594h;
import X.C177739Aj;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C181539Qw;
import X.C182599Uz;
import X.C184849bc;
import X.C189699jf;
import X.C189709jg;
import X.C191499mh;
import X.C191559mn;
import X.C191979nV;
import X.C192479oS;
import X.C196229uf;
import X.C196819vh;
import X.C198179xu;
import X.C198609yc;
import X.C20112A7u;
import X.C20251ADj;
import X.C20266ADy;
import X.C20279AEn;
import X.C20280AEo;
import X.C20285AEt;
import X.C20337AGt;
import X.C20828Aa6;
import X.C20872Aao;
import X.C20874Aaq;
import X.C20875Aar;
import X.C20932Abm;
import X.C21432Ajz;
import X.C22941Dw;
import X.C24681Lg;
import X.C25181Nf;
import X.C33251iW;
import X.C33651jA;
import X.C36401np;
import X.C36531o3;
import X.C72463Mc;
import X.C72473Md;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

public class IndiaUpiCheckOrderDetailsActivity extends AnonymousClass92q implements BD5 {
    public C182599Uz A00;
    public C33251iW A01;
    public AnonymousClass1M9 A02;
    public AnonymousClass1PM A03;
    public C36531o3 A04;
    public C18000vb A05;
    public C24681Lg A06;
    public C175748zD A07;
    public C33651jA A08;
    public C20828Aa6 A09;
    public C1764594h A0A;
    public AnonymousClass8F3 A0B;
    public C192479oS A0C;
    public C189709jg A0D;
    public C36401np A0E;
    public AnonymousClass00H A0F;
    public List A0G;
    public C177739Aj A0H;

    private void A0Q(AnonymousClass9I2 r16, C191979nV r17, int i) {
        int i2;
        int i3;
        C003401n supportActionBar = getSupportActionBar();
        int i4 = i;
        if (supportActionBar != null) {
            Resources resources = getResources();
            C18030ve r0 = this.A0E;
            if (i4 == 1) {
                i3 = C181539Qw.A00(AnonymousClass8BX.A03(r0));
            } else {
                int A032 = AnonymousClass8BX.A03(r0);
                i3 = 2131893318;
                if (A032 != 2) {
                    i3 = 2131893319;
                    if (A032 != 3) {
                        i3 = 2131893317;
                    }
                }
            }
            supportActionBar.A0S(resources.getString(i3));
        }
        int i5 = 11;
        if (i4 == 1) {
            i5 = 4;
        }
        C191979nV r10 = r17;
        this.A01.A07(r10.A0B, this.A09.A08, i5);
        C18030ve r2 = this.A0E;
        List list = this.A0F;
        C18070vi.A0d(r2, 1);
        LinkedHashMap A012 = A3T.A01(this, r2.A0I(1767), list);
        String str = this.A09.A08;
        C18070vi.A0d(str, 0);
        if (A012.get(str) == null) {
            i2 = 0;
        } else {
            i2 = 1;
            if (this.A0I) {
                i2 = 5;
            }
        }
        if (TextUtils.isEmpty(this.A0D)) {
            this.A0D = this.A09.A0C;
        }
        C20828Aa6 aa6 = this.A09;
        aa6.A05.A02(this, this.A02, this.A01, r16, r10, aa6.A08, this.A0F, i2, i4);
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet, androidx.fragment.app.Fragment, com.whatsapp.payments.ui.bottomsheet.Hilt_PaymentMayBeInProgressBottomSheet, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0094, code lost:
        if (r2.A08.A03().getBoolean("pref_p2m_hybrid_tos_accepted", false) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A5u(X.ARR r14, X.C20279AEn r15) {
        /*
            r13 = this;
            r10 = 0
            X.A7u r3 = X.C20112A7u.A01()
            X.1R2 r2 = r13.A0W
            X.1QS r1 = r2.A0A
            java.lang.String r0 = "p2p_context"
            X.1QK r0 = r1.A02(r0)
            X.1QM r1 = r0.A03()
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "unset"
            java.lang.String r1 = r1.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "tos_with_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0087
        L_0x002f:
            r1 = 0
        L_0x0030:
            java.lang.String r0 = "tos_displayed"
            r3.A08(r0, r1)
            java.lang.String r1 = "is_template"
            boolean r0 = r13.A0J
            r3.A08(r1, r0)
            X.ADy r0 = r13.A06
            if (r0 == 0) goto L_0x0047
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "coupon_id"
            r3.A07(r0, r1)
        L_0x0047:
            X.AZ6 r2 = r13.A0S
            java.lang.Integer r4 = X.C17880vN.A0l()
            java.lang.String r6 = r13.A0g
            java.lang.String r7 = r13.A0m
            java.lang.String r8 = r13.A0l
            r9 = 1
            java.lang.String r5 = "order_details"
            r11 = r9
            r12 = r10
            r2.BiJ(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            boolean r0 = r15.A09
            if (r0 == 0) goto L_0x0097
            r13.A5p(r10)
            java.lang.String r3 = r13.BXz()
            X.C18070vi.A0d(r3, r10)
            com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet r2 = new com.whatsapp.payments.ui.bottomsheet.PaymentMayBeInProgressBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.C17880vN.A0D()
            java.lang.String r0 = "arg_receiver_name"
            r1.putString(r0, r3)
            r2.A1R(r1)
            X.9ey r0 = new X.9ey
            r0.<init>(r14, r13, r2, r15)
            r2.A00 = r0
            java.lang.String r0 = "PaymentMayBeInProgressBottomSheet"
            r13.CMk(r2, r0)
            return
        L_0x0087:
            X.1QD r0 = r2.A08
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "pref_p2m_hybrid_tos_accepted"
            boolean r0 = r1.getBoolean(r0, r10)
            r1 = 1
            if (r0 == 0) goto L_0x0030
            goto L_0x002f
        L_0x0097:
            r13.A5o(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity.A5u(X.ARR, X.AEn):void");
    }

    public void Bpc(AnonymousClass1BI r1, C191559mn r2, AnonymousClass21K r3) {
    }

    public static void A03(IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity, C20279AEn aEn) {
        if (aEn != null) {
            indiaUpiCheckOrderDetailsActivity.A06 = aEn.A04;
            indiaUpiCheckOrderDetailsActivity.A01 = aEn.A0B;
            aEn.A01 = AnonymousClass8BS.A01(indiaUpiCheckOrderDetailsActivity);
            ((A0J) indiaUpiCheckOrderDetailsActivity.A0R.get()).A01(indiaUpiCheckOrderDetailsActivity.A07);
            C189699jf r1 = indiaUpiCheckOrderDetailsActivity.A04;
            AnonymousClass205 r4 = indiaUpiCheckOrderDetailsActivity.A07;
            AnonymousClass8Gd r3 = indiaUpiCheckOrderDetailsActivity.A09.A06;
            C18070vi.A0i(r4, r3);
            r1.A00.CGF(new AnonymousClass3C5(r3, r4, aEn, 4));
        }
    }

    public boolean Bg0() {
        if (this instanceof IndiaUpiQuickBuyActivity) {
            return true;
        }
        return false;
    }

    public void Bl6(String str) {
        if (C18020vd.A05(C18040vf.A02, this.A0E, 10457)) {
            Intent A0A2 = C17880vN.A0A();
            A0A2.setClassName(getPackageName(), "com.whatsapp.payments.ui.IndiaUpiAddressFormActivity");
            startActivity(A0A2);
            return;
        }
        CNA(2131893912);
        this.A0D.A00(this.A01, new C20874Aaq(this), str);
    }

    public void BlW() {
        Object obj;
        AnonymousClass21K r0;
        C20285AEt BPK;
        this.A0S.A0C(C17880vN.A0h(), 205, "order_details", this.A0g, this.A0m, this.A0l, true);
        C20828Aa6 aa6 = this.A09;
        AnonymousClass205 r8 = this.A07;
        String str = this.A0g;
        String str2 = this.A0m;
        String str3 = this.A0l;
        C198179xu r3 = (C198179xu) aa6.A06.A03.A06();
        AnonymousClass1FY r02 = aa6.A01;
        Intent A0G2 = C72463Mc.A0G(r02);
        A0G2.setClassName(r02.getPackageName(), "com.whatsapp.payments.ui.IndiaUpiSavingsOfferActivity");
        AnonymousClass1R2.A0E(A0G2, r8);
        if (!(r3 == null || (obj = r3.A01) == null || (r0 = ((A2J) obj).A05) == null || (BPK = r0.BPK()) == null)) {
            A0G2.putExtra("extra_checkout_info_content", BPK.A02);
        }
        A0G2.putExtra("extra_referral_screen", str);
        A0G2.putExtra("extra_order_type", str2);
        A0G2.putExtra("extra_payment_config_id", str3);
        aa6.A01.startActivityForResult(A0G2, 1001);
    }

    public void Bzg(AnonymousClass9I2 r5, C191979nV r6) {
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            A0Q(r5, r6, r6.A00);
        } else if (this.A0I) {
            this.A0F.getClass();
            C17960vV.A0C(AnonymousClass000.A1a(this.A0F));
            C20932Abm abm = (C20932Abm) ((C20251ADj) this.A0F.get(0)).A00;
            abm.getClass();
            String str = abm.A02;
            CNh(AnonymousClass6X6.A00(this, this.A0E, C22941Dw.A00(this.A07.A00), str), 0);
            A5p(false);
        } else {
            AnonymousClass3MW.A1T(new AnonymousClass9BR(r6, this, 7), this.A05, 0);
        }
    }

    public void C59(ARR arr) {
        AnonymousClass11S r1 = this.A02;
        r1.A0I();
        if (r1.A0P(r1.A02)) {
            this.A0H = C108965cb.A0w();
            BhQ(2131893932);
        } else if (AnonymousClass8BT.A1X(this)) {
            C21432Ajz.A00(this.A05, this, new C184849bc(arr, this), 16);
        } else {
            A5m(arr);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            A03(this, (C20279AEn) intent.getParcelableExtra("extra_checkout_info_content"));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass205 A032 = AnonymousClass1R2.A03(getIntent());
        C17960vV.A07(A032);
        this.A07 = A032;
        UserJid A002 = C22941Dw.A00(A032.A00);
        AnonymousClass11P r13 = this.A05;
        C18030ve r10 = this.A0E;
        C36401np r9 = this.A0E;
        Resources resources = getResources();
        AnonymousClass1R2 r7 = this.A0W;
        C18000vb r6 = this.A05;
        AnonymousClass1QS r5 = this.A0Q;
        AnonymousClass1PM r4 = this.A03;
        AnonymousClass1QO r3 = this.A0P;
        C25181Nf r2 = this.A06;
        C36531o3 r1 = this.A04;
        C18070vi.A0w(r13, r10, r9, resources, r7);
        C18070vi.A0x(r6, r5, r4, r3, r2);
        C18070vi.A0d(r1, 11);
        C196229uf r23 = new C196229uf(resources, r4, r1, r13, r6, r2, r10, r3, r5, r7, r9);
        C18030ve r14 = this.A0E;
        AnonymousClass1KB r132 = this.A05;
        AnonymousClass1LU r102 = this.A08;
        AnonymousClass10I r92 = this.A05;
        AnonymousClass1R2 r8 = this.A0W;
        C18000vb r72 = this.A05;
        C192479oS r62 = this.A0C;
        AnonymousClass1M9 r52 = this.A02;
        AnonymousClass122 r42 = this.A07;
        AnonymousClass1M9 r16 = r52;
        C18000vb r17 = r72;
        AnonymousClass122 r18 = r42;
        AnonymousClass1KB r15 = r132;
        this.A09 = new C20828Aa6(r15, r16, r17, r18, this.A07, r14, r102, this.A08, r23, r62, r8, this.A01, r92);
        C182599Uz r22 = this.A00;
        C18070vi.A0d(r22, 0);
        AnonymousClass8F3 r0 = (AnonymousClass8F3) AnonymousClass8BR.A0C(new AH1(r22, 3), this).A00(AnonymousClass8F3.class);
        this.A0B = r0;
        C20337AGt.A00(this, r0.A07, 9);
        AnonymousClass11P r172 = this.A05;
        C18030ve r162 = this.A0E;
        AnonymousClass10I r152 = this.A05;
        C33251iW r142 = this.A01;
        AnonymousClass1R2 r103 = this.A0W;
        AnonymousClass11C r93 = this.A08;
        AnonymousClass1QS r82 = this.A0Q;
        AnonymousClass122 r73 = this.A07;
        AnonymousClass1W6 A0c = C17880vN.A0c(this.A0d);
        C24681Lg r63 = this.A06;
        AnonymousClass1PM r53 = this.A03;
        AnonymousClass1QR r43 = this.A07;
        AnonymousClass205 r12 = this.A07;
        C198609yc r27 = (C198609yc) this.A0e.get();
        AnonymousClass1R2 r28 = r103;
        AnonymousClass205 r29 = r12;
        AnonymousClass2L2 r25 = (AnonymousClass2L2) this.A0X.get();
        AnonymousClass1QS r26 = r82;
        C18030ve r232 = r162;
        UserJid userJid = A002;
        C24681Lg r21 = r63;
        AnonymousClass1QR r222 = r43;
        AnonymousClass11P r19 = r172;
        AnonymousClass122 r20 = r73;
        AnonymousClass1PM r173 = r53;
        AnonymousClass11C r182 = r93;
        C33251iW r163 = r142;
        C20828Aa6 aa6 = this.A09;
        aa6.A00(this, A002, this, (AnonymousClass8Gd) AnonymousClass8BR.A0C(new AHE(r163, r173, r182, r19, r20, r21, r222, r232, userJid, r25, r26, r27, r28, r29, A0c, r152, false, Bg0()), this).A00(AnonymousClass8Gd.class));
        if (!(this instanceof IndiaUpiQuickBuyActivity)) {
            C72473Md.A18(this);
            setContentView((View) this.A09.A05);
        }
        C170318pf r54 = this.A0P;
        C20828Aa6 aa62 = this.A09;
        String str = aa62.A0B;
        if (str == null) {
            str = "";
        }
        r54.A02 = new C20280AEo(aa62.A00, str, this.A07.A01);
        if (this.A0H == null) {
            C177739Aj r110 = new C177739Aj(this);
            this.A0H = r110;
            AnonymousClass3MW.A1T(r110, this.A05, 0);
        }
        A5M();
    }

    public void A4v(Intent intent) {
        super.A4v(intent);
        intent.putExtra("extra_order_id", this.A09.A0B);
        intent.putExtra("extra_order_expiry_ts_in_sec", this.A09.A00);
        intent.putExtra("extra_payment_config_id", this.A09.A0C);
    }

    public void A5U(AnonymousClass8pF r5, AnonymousClass8pF r6, A7B a7b, String str, boolean z) {
        super.A5U(r5, r6, a7b, str, z);
        if (a7b == null && r5 == null && r6 == null && str != null) {
            this.A04.A00(this.A09.A06, new C20872Aao(str), this.A07);
        }
    }

    public boolean Be9() {
        return !Bg0();
    }

    public void Bzh(AnonymousClass9I2 r2, C191979nV r3) {
        if (Bg0()) {
            finish();
        } else {
            A0Q(r2, r3, 4);
        }
    }

    public void C32() {
        Object obj;
        AnonymousClass21K r0;
        C20285AEt BPK;
        AE0 ae0;
        String str;
        String str2;
        CNA(2131894217);
        C20112A7u A032 = C20112A7u.A03(new C20112A7u[0]);
        C20266ADy aDy = this.A06;
        if (aDy != null) {
            A032.A07("coupon_id", aDy.A02);
        }
        this.A0S.BiJ(A032, 206, "order_details", this.A0g, this.A0m, this.A0l, 1, false, true, false);
        C20828Aa6 aa6 = this.A09;
        AnonymousClass205 r1 = this.A07;
        AnonymousClass8F3 r3 = this.A0B;
        C198179xu r02 = (C198179xu) aa6.A06.A03.A06();
        if (r02 != null && (obj = r02.A01) != null && (r0 = ((A2J) obj).A05) != null && (BPK = r0.BPK()) != null) {
            C20279AEn aEn = BPK.A02;
            C22941Dw r03 = UserJid.Companion;
            AnonymousClass1BI r04 = null;
            if (r1 != null) {
                r04 = r1.A00;
            }
            UserJid A012 = C22941Dw.A01(r04);
            PhoneUserJid A002 = AnonymousClass11S.A00(r3.A00);
            C18070vi.A0z(A002, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            if (aEn != null && (ae0 = aEn.A0C) != null && A012 != null && (str = ae0.A01) != null && (str2 = ae0.A02) != null) {
                JSONObject A013 = C196819vh.A01((AEV) null, A002, aEn, AnonymousClass00R.A0C, (String) null, (String) null);
                C191499mh r4 = r3.A03;
                String A062 = r3.A01.A06();
                C18070vi.A0X(A062);
                r4.A00(new AS8(r3, aEn, 2), A012, A062, ae0.A00, str2, str, A013);
            }
        }
    }

    public void C5T(AES aes, String str) {
        CNA(2131893912);
        this.A0D.A00(aes, new C20875Aar(aes, this), str);
    }

    public void onStart() {
        super.onStart();
        if (Bg0()) {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!Bg0()) {
            return super.onTouchEvent(motionEvent);
        }
        C108965cb.A0y(this);
        return true;
    }
}
