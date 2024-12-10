package com.whatsapp.payments.viewmodel;

import X.AXS;
import X.AnonymousClass00H;
import X.AnonymousClass118;
import X.AnonymousClass11O;
import X.AnonymousClass11P;
import X.AnonymousClass18O;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KB;
import X.AnonymousClass1KL;
import X.AnonymousClass1KN;
import X.AnonymousClass1OZ;
import X.AnonymousClass1QD;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8BT;
import X.AnonymousClass8BW;
import X.AnonymousClass8BY;
import X.C108945cZ;
import X.C108955ca;
import X.C175628z1;
import X.C175978za;
import X.C17880vN;
import X.C185069by;
import X.C190279kf;
import X.C196259ui;
import X.C197889xR;
import X.C20118A8b;
import X.C20338AGu;
import X.C22801Dg;
import X.C29591cX;
import X.C31061ex;
import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiSecureQrCodeViewModel extends AnonymousClass1J2 {
    public final C22801Dg A00;
    public final C22801Dg A01;
    public final AnonymousClass1DT A02;
    public final AnonymousClass18O A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass11O A05;
    public final AXS A06;
    public final C31061ex A07;
    public final AnonymousClass1QS A08;
    public final AnonymousClass1KB A09;
    public final AnonymousClass118 A0A;
    public final AnonymousClass1QJ A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public static void A00(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, int i) {
        IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel2 = indiaUpiSecureQrCodeViewModel;
        int i2 = i;
        if (indiaUpiSecureQrCodeViewModel2.A03.A09(AnonymousClass18O.A0W)) {
            A03(indiaUpiSecureQrCodeViewModel2, 2, -1);
            AXS axs = indiaUpiSecureQrCodeViewModel2.A06;
            synchronized (axs) {
                String[] strArr = {"signedQrCode", "signedQrCodeTs"};
                try {
                    AnonymousClass1QD r5 = axs.A01;
                    String A062 = r5.A06();
                    if (!TextUtils.isEmpty(A062)) {
                        JSONObject A16 = C17880vN.A16(A062);
                        int i3 = 0;
                        do {
                            A16.remove(strArr[i3]);
                            i3++;
                        } while (i3 < 2);
                        AnonymousClass8BT.A1G(r5, A16);
                    }
                } catch (JSONException e) {
                    Log.w("PAY: IndiaUpiPaymentSharedPrefs deleteFromPaymentInfo for keys threw: ", e);
                }
            }
            C22801Dg r4 = indiaUpiSecureQrCodeViewModel2.A00;
            C20118A8b a8b = (C20118A8b) AnonymousClass8BS.A0W(r4);
            a8b.A0I = null;
            a8b.A04 = "02";
            r4.A0F(a8b);
            Context context = indiaUpiSecureQrCodeViewModel2.A0A.A00;
            AnonymousClass1KB r13 = indiaUpiSecureQrCodeViewModel2.A09;
            C196259ui r16 = new C196259ui();
            C175628z1 r11 = new C175628z1(context, r13, C17880vN.A0U(indiaUpiSecureQrCodeViewModel2.A0C), AnonymousClass8BR.A0a(indiaUpiSecureQrCodeViewModel2.A0D), r16, indiaUpiSecureQrCodeViewModel2.A07);
            String A072 = ((C20118A8b) AnonymousClass8BS.A0W(r4)).A07();
            C190279kf r6 = new C190279kf(indiaUpiSecureQrCodeViewModel2, i2);
            AnonymousClass1OZ r52 = r11.A02;
            String A0B2 = r52.A0B();
            String A0v = AnonymousClass8BT.A0v(A072);
            C29591cX A0Y = C108955ca.A0Y();
            AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
            AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A0B2, A0v);
            C29591cX A0R = AnonymousClass8BS.A0R();
            C29591cX.A01(A0R, "action", "upi-sign-qr-code");
            if (AnonymousClass8BS.A1O(A072, 1, 10000)) {
                C29591cX.A01(A0R, "qr-code", A072);
            }
            AnonymousClass8BW.A1B(r52, new C175978za(r11.A00, r11.A01, r11.A03, C197889xR.A04(r11, "upi-sign-qr-code"), r11, r6), C29591cX.A00(A0R, A0Y), A0B2);
            return;
        }
        A03(indiaUpiSecureQrCodeViewModel2, 0, i2);
        return;
    }

    public static void A03(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, int i, int i2) {
        indiaUpiSecureQrCodeViewModel.A01.A0F(new C185069by(i, i2));
    }

    public static void A04(IndiaUpiSecureQrCodeViewModel indiaUpiSecureQrCodeViewModel, String str, int i) {
        int i2;
        C22801Dg r4 = indiaUpiSecureQrCodeViewModel.A00;
        C20118A8b a8b = (C20118A8b) r4.A06();
        if (str.equals(a8b.A0A)) {
            i2 = 3;
        } else {
            AnonymousClass1QJ r1 = indiaUpiSecureQrCodeViewModel.A0B;
            AnonymousClass1KN r2 = ((AnonymousClass1KL) r1.A01()).A05;
            AnonymousClass1KN A0H = AnonymousClass8BT.A0H(r1.A01(), str);
            if (A0H == null || A0H.A00.compareTo(r2.A00) < 0) {
                a8b.A0A = null;
                r4.A0F(a8b);
                i2 = 0;
            } else {
                a8b.A0A = str;
                r4.A0F(a8b);
                A00(indiaUpiSecureQrCodeViewModel, i);
                return;
            }
        }
        A03(indiaUpiSecureQrCodeViewModel, i2, i);
    }

    public IndiaUpiSecureQrCodeViewModel(AnonymousClass1KB r7, AnonymousClass18O r8, AnonymousClass11P r9, AnonymousClass118 r10, AnonymousClass11O r11, AXS axs, C31061ex r13, AnonymousClass1QJ r14, AnonymousClass1QS r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        C22801Dg A0R = C108945cZ.A0R();
        this.A01 = A0R;
        C22801Dg A0R2 = C108945cZ.A0R();
        this.A00 = A0R2;
        AnonymousClass1DT A0L = AnonymousClass3MW.A0L();
        this.A02 = A0L;
        this.A04 = r9;
        this.A09 = r7;
        this.A0A = r10;
        this.A03 = r8;
        this.A0C = r16;
        this.A08 = r15;
        this.A07 = r13;
        this.A0B = r14;
        this.A0D = r17;
        this.A06 = axs;
        this.A05 = r11;
        A0R.A0F(new C185069by(0, -1));
        A0R2.A0F(new Object());
        A0R2.A0H(A0L, new C20338AGu(this, 7));
    }
}
