package com.whatsapp.payments.ui;

import X.A4K;
import X.A54;
import X.A5H;
import X.A5Y;
import X.AGC;
import X.AXR;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1K1;
import X.AnonymousClass1KI;
import X.AnonymousClass1QO;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4Yv;
import X.AnonymousClass8BR;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.AnonymousClass8BW;
import X.AnonymousClass8pY;
import X.AnonymousClass90Q;
import X.C000200d;
import X.C108965cb;
import X.C137116uw;
import X.C161568Fz;
import X.C170278pb;
import X.C1763291s;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C191389mW;
import X.C192469oR;
import X.C195929uA;
import X.C196779vd;
import X.C19944A0b;
import X.C20037A4g;
import X.C20074A6a;
import X.C20284AEs;
import X.C20751AXg;
import X.C33311ic;
import X.C33701jF;
import X.C63662tU;
import X.C63932tv;
import android.os.Build;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

public class BrazilPaymentCardDetailsActivity extends C1763291s {
    public AnonymousClass1KI A00;
    public AXR A01;
    public C19944A0b A02;
    public C20751AXg A03;
    public C20074A6a A04;
    public AnonymousClass1QO A05;
    public A54 A06;
    public A5H A07;
    public A4K A08;
    public C195929uA A09;
    public C20037A4g A0A;
    public A5Y A0B;
    public C161568Fz A0C;
    public C192469oR A0D;
    public AnonymousClass00H A0E;
    public boolean A0F;

    public void A4d(boolean z) {
        FingerprintBottomSheet fingerprintBottomSheet;
        String A0c = AnonymousClass8BW.A0c(this);
        PinBottomSheetDialogFragment A002 = C196779vd.A00();
        if (Build.VERSION.SDK_INT >= 23) {
            fingerprintBottomSheet = FingerprintBottomSheet.A0A.A00();
        } else {
            fingerprintBottomSheet = null;
        }
        AnonymousClass90Q r8 = new AnonymousClass90Q(this.A02, this.A05, this.A03, this.A07, A0c, this.A04.A0A);
        C161568Fz r1 = this.A0C;
        if (r1 != null) {
            r1.A0U(this, fingerprintBottomSheet, r8, A002, A0c, "REMOVEMETHOD", "FB");
        }
    }

    public static void A0V(BrazilPaymentCardDetailsActivity brazilPaymentCardDetailsActivity, String str) {
        if (C18020vd.A05(C18040vf.A02, brazilPaymentCardDetailsActivity.A05.A02, 2984)) {
            brazilPaymentCardDetailsActivity.CEx();
            C20284AEs A082 = AnonymousClass8BR.A0R(brazilPaymentCardDetailsActivity.A0A).A08(str);
            C17960vV.A07(A082);
            AnonymousClass8pY r2 = (AnonymousClass8pY) A082.A08;
            if (r2 != null) {
                String str2 = r2.A0F;
                if (str2.equals("NEEDS_RETOKENIZATION") || str2.equals("NEEDS_RETOKENIZATION_DELETED")) {
                    brazilPaymentCardDetailsActivity.CNh(C170278pb.A01(brazilPaymentCardDetailsActivity, r2, str), 1);
                }
            }
        }
    }

    public void A2y() {
        if (!this.A0F) {
            this.A0F = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A00 = AnonymousClass10E.A12(r2);
            this.A06 = AnonymousClass3MY.A0Z(r2);
            this.A0E = AnonymousClass10E.AL1(r2);
            this.A05 = AnonymousClass8BT.A0J(r2);
            this.A02 = C108965cb.A0H(r2);
            this.A01 = AnonymousClass8BT.A0A(r1);
            this.A03 = AnonymousClass10E.A6Q(r2);
            this.A0A = AnonymousClass3MZ.A0z(r2);
            this.A09 = AnonymousClass3Ma.A0q(r2);
            this.A0G = C000200d.A00(r2.A87);
            this.A07 = AnonymousClass8BT.A0R(r2);
            this.A08 = AnonymousClass8BV.A0G(r2);
            this.A0F = C000200d.A00(r2.Ach);
            this.A0A = AnonymousClass8BT.A0V(r2);
            this.A00 = AnonymousClass3MZ.A0n(r2);
            this.A02 = AnonymousClass8BU.A0Q(r2);
            this.A03 = AnonymousClass8BU.A0R(r2);
            this.A07 = (C191389mW) r2.AaX.get();
            this.A06 = AnonymousClass8BU.A0S(r2);
            this.A05 = (C33701jF) r2.A8I.get();
            this.A0B = C000200d.A00(r2.A84);
            this.A04 = r1.A8N();
            this.A01 = (C33311ic) r2.A88.get();
            this.A0E = C000200d.A00(r2.A6N);
            this.A08 = (A4K) r1.AET.get();
            this.A02 = (C19944A0b) r1.A70.get();
            this.A01 = (AXR) r1.A6y.get();
            this.A0A = (C20037A4g) r1.A71.get();
            this.A05 = AnonymousClass3Ma.A0q(r2);
            this.A09 = (C195929uA) r1.AEU.get();
            this.A00 = AnonymousClass8BT.A0I(r2);
            this.A0D = (C192469oR) r1.A72.get();
            this.A03 = AnonymousClass1K1.A1M(A002);
            this.A04 = (C20074A6a) r2.AFz.get();
            this.A06 = (A54) r2.Acu.get();
            this.A07 = (A5H) r1.AER.get();
            this.A0B = (A5Y) r1.A7B.get();
        }
    }

    public void A4b() {
        AnonymousClass4Yv.A01(this, 201);
    }

    public void A4e() {
        if (!C18020vd.A05(C18040vf.A02, this.A05.A02, 10896)) {
            super.A4e();
        }
    }

    public BrazilPaymentCardDetailsActivity(int i) {
        this.A0F = false;
        AGC.A00(this, 21);
    }

    /* JADX WARNING: type inference failed for: r2v13, types: [X.8DJ, android.widget.FrameLayout, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4c(X.C20284AEs r9, boolean r10) {
        /*
            r8 = this;
            super.A4c(r9, r10)
            if (r10 == 0) goto L_0x0072
            r0 = 2131433582(0x7f0b186e, float:1.8488954E38)
            X.C72463Mc.A19(r8, r0)
            X.8DJ r2 = new X.8DJ
            r2.<init>(r8)
            boolean r0 = r2.A05
            if (r0 != 0) goto L_0x001a
            r0 = 1
            r2.A05 = r0
            r2.generatedComponent()
        L_0x001a:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131626320(0x7f0e0950, float:1.8879873E38)
            r3 = 1
            r1.inflate(r0, r2, r3)
            r0 = 0
            r2.setBottomDividerSpaceVisibility(r0)
            r0 = 2131428849(0x7f0b05f1, float:1.8479354E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r2, r0)
            r2.A02 = r0
            r0 = 2131428851(0x7f0b05f3, float:1.8479358E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r2, r0)
            r2.A03 = r0
            r0 = 2131428850(0x7f0b05f2, float:1.8479356E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0H(r2, r0)
            r2.A01 = r0
            r0 = 2131428854(0x7f0b05f6, float:1.8479364E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0H(r2, r0)
            r2.A00 = r0
            X.BF4 r1 = new X.BF4
            r1.<init>(r8)
            android.widget.ImageView r0 = r2.A00
            r0.setImageDrawable(r1)
            android.widget.ImageView r0 = r2.A00
            r0.setClipToOutline(r3)
            r8.A09 = r2
            X.AEs r0 = r8.A04
            X.8pK r0 = (X.AnonymousClass8pK) r0
            r2.setCard(r0)
            r0 = 2131433578(0x7f0b186a, float:1.8488946E38)
            android.view.ViewGroup r2 = X.AnonymousClass3MX.A0F(r8, r0)
            X.8DJ r1 = r8.A09
            r0 = 0
            r2.addView(r1, r0)
        L_0x0072:
            X.8pb r5 = r9.A08
            X.8pY r5 = (X.AnonymousClass8pY) r5
            if (r5 == 0) goto L_0x0153
            X.8DJ r0 = r8.A09
            if (r0 == 0) goto L_0x010e
            X.A4g r4 = r8.A0A
            X.AEs r3 = r8.A04
            r0 = 2131428854(0x7f0b05f6, float:1.8479364E38)
            android.widget.ImageView r2 = X.AnonymousClass3MX.A0I(r8, r0)
            android.content.Context r0 = r8.getBaseContext()
            X.BF4 r1 = new X.BF4
            r1.<init>(r0)
            r0 = 1
            X.C20037A4g.A00(r1, r2, r3, r4, r0)
            X.8DJ r0 = r8.A09
            r1 = 8
            r0.setCardNameTextViewVisibility(r1)
            X.8DJ r0 = r8.A09
            r0.setCardNetworkIconVisibility(r1)
            X.8DJ r2 = r8.A09
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131100018(0x7f060172, float:1.7812406E38)
            int r0 = r1.getColor(r0)
            r2.setCardNumberTextColor(r0)
            java.lang.String r4 = r5.A0D
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x010e
            X.8DJ r6 = r8.A09     // Catch:{ Exception -> 0x0101 }
            r0 = 0
            char r1 = r4.charAt(r0)     // Catch:{ Exception -> 0x0101 }
            r0 = 48
            java.lang.String r7 = "Unknown color"
            if (r1 != r0) goto L_0x00fc
            r2 = 1
            char r1 = r4.charAt(r2)     // Catch:{ Exception -> 0x0101 }
            r0 = 120(0x78, float:1.68E-43)
            if (r1 == r0) goto L_0x00d6
            char r1 = r4.charAt(r2)     // Catch:{ Exception -> 0x0101 }
            r0 = 88
            if (r1 != r0) goto L_0x00fc
        L_0x00d6:
            r0 = 2
            java.lang.String r1 = r4.substring(r0)     // Catch:{ Exception -> 0x0101 }
            r0 = 16
            long r2 = java.lang.Long.parseLong(r1, r0)     // Catch:{ Exception -> 0x0101 }
            int r1 = r4.length()     // Catch:{ Exception -> 0x0101 }
            r0 = 8
            if (r1 != r0) goto L_0x00ee
            r0 = -16777216(0xffffffffff000000, double:NaN)
            long r2 = r2 | r0
            goto L_0x00f7
        L_0x00ee:
            r0 = 10
            if (r1 == r0) goto L_0x00f7
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r7)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0100
        L_0x00f7:
            int r0 = (int) r2     // Catch:{ Exception -> 0x0101 }
            r6.setCardNumberTextColor(r0)     // Catch:{ Exception -> 0x0101 }
            goto L_0x010e
        L_0x00fc:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r7)     // Catch:{ Exception -> 0x0101 }
        L_0x0100:
            throw r0     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "PAY: Could not apply label color: "
            r1.append(r0)
            X.C17890vO.A13(r4, r1, r2)
        L_0x010e:
            java.lang.String r1 = r5.A0I
            int r0 = r1.hashCode()
            switch(r0) {
                case -1757659853: goto L_0x0157;
                case -591252731: goto L_0x015a;
                case 1124965819: goto L_0x016b;
                case 1925346054: goto L_0x0186;
                default: goto L_0x0117;
            }
        L_0x0117:
            r1 = 0
            X.8Gf r0 = new X.8Gf
            r0.<init>(r8, r1)
            X.1It r1 = X.AnonymousClass8BR.A0C(r0, r8)
            java.lang.Class<X.96L> r0 = X.AnonymousClass96L.class
            X.1J2 r0 = r1.A00(r0)
            X.8Fz r0 = (X.C161568Fz) r0
            r8.A0C = r0
            X.1DT r1 = r0.A03
            r0 = 37
            X.C20336AGs.A00(r8, r1, r0)
            X.8Fz r0 = r8.A0C
            X.1DT r1 = r0.A00
            r0 = 38
            X.C20336AGs.A00(r8, r1, r0)
            X.8Fz r1 = r8.A0C
            boolean r0 = r1 instanceof X.AnonymousClass96M
            if (r0 == 0) goto L_0x0154
            X.96M r1 = (X.AnonymousClass96M) r1
            X.1DT r1 = r1.A03
        L_0x0145:
            r0 = 39
            X.C20336AGs.A00(r8, r1, r0)
            X.8Fz r0 = r8.A0C
            X.1DT r1 = r0.A02
            r0 = 40
            X.C20336AGs.A00(r8, r1, r0)
        L_0x0153:
            return
        L_0x0154:
            X.1DT r1 = r1.A01
            goto L_0x0145
        L_0x0157:
            java.lang.String r0 = "VOIDED"
            goto L_0x015c
        L_0x015a:
            java.lang.String r0 = "EXPIRED"
        L_0x015c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 0
            X.C1763291s.A03(r8, r0)
            X.8De r2 = r8.A08
            r1 = 13
            goto L_0x017b
        L_0x016b:
            java.lang.String r0 = "SUSPENDED"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0117
            r0 = 3
            X.C1763291s.A03(r8, r0)
            X.8De r2 = r8.A08
            r1 = 12
        L_0x017b:
            if (r2 == 0) goto L_0x0117
            X.AFQ r0 = new X.AFQ
            r0.<init>(r8, r1)
            r2.setAlertButtonClickListener(r0)
            goto L_0x0117
        L_0x0186:
            java.lang.String r0 = "ACTIVE"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0117
            java.lang.String r1 = "REQUIRES_VERIFICATION"
            java.lang.String r0 = r5.A0M
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01cc
            X.1QO r0 = r8.A05
            X.0ve r1 = r0.A02
            r0 = 10896(0x2a90, float:1.5269E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 != 0) goto L_0x0117
            r0 = 4
            X.C1763291s.A03(r8, r0)
            X.8De r0 = r8.A08
            if (r0 == 0) goto L_0x0117
            X.0ve r1 = r8.A0E
            r0 = 1927(0x787, float:2.7E-42)
            boolean r4 = X.C18020vd.A05(r2, r1, r0)
            X.8De r3 = r8.A08
            X.AEs r0 = r8.A04
            java.lang.String r2 = r0.A0A
            r1 = 17
            if (r4 == 0) goto L_0x01c2
            r1 = 16
        L_0x01c2:
            X.AFV r0 = new X.AFV
            r0.<init>(r1, r2, r8)
            r3.setAlertButtonClickListener(r0)
            goto L_0x0117
        L_0x01cc:
            boolean r0 = r5.A0a
            if (r0 != 0) goto L_0x01d9
            boolean r0 = r5.A0Z
            if (r0 == 0) goto L_0x01d9
            r8.A4e()
            goto L_0x0117
        L_0x01d9:
            java.lang.Long r0 = r5.A09
            if (r0 == 0) goto L_0x0117
            long r3 = X.AnonymousClass8BS.A01(r8)
            java.lang.Long r0 = r5.A09
            long r1 = r0.longValue()
            r6 = 30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            int r0 = X.A87.A00(r0, r3, r1)
            if (r0 > r6) goto L_0x0117
            r0 = 2
            X.C1763291s.A03(r8, r0)
            java.lang.Long r0 = X.C17890vO.A0L()
            r5.A09 = r0
            X.1QS r0 = r8.A0A
            X.A5I r2 = r0.A01()
            X.AEs r1 = r8.A04
            r0 = 0
            r2.A03(r0, r1)
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity.A4c(X.AEs, boolean):void");
    }

    public BrazilPaymentCardDetailsActivity() {
        this(0);
    }
}
