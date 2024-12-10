package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;

/* renamed from: X.7Kg  reason: invalid class name and case insensitive filesystem */
public final class C145177Kg implements C160818Aa {
    public final C18030ve A00;

    public C145177Kg(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bh0(String str) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 3773)) {
            return C1403170x.A01(str);
        }
        return false;
    }

    public /* synthetic */ void CNI(Activity activity, AnonymousClass1BI r2, String str, String str2) {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BcO(X.AnonymousClass1FL r27, java.lang.String r28, int r29, int r30) {
        /*
            r26 = this;
            r19 = r28
            boolean r0 = X.C1403170x.A01(r19)
            r18 = 0
            if (r0 == 0) goto L_0x0172
            r2 = 0
            r11 = 0
            r10 = 0
            r9 = 0
            r8 = 0
            r7 = 0
            r6 = 0
            r17 = 0
            r16 = 0
            r3 = 0
            r5 = 0
            r4 = 0
            r12 = 0
        L_0x0019:
            int r0 = r19.length()
            if (r12 >= r0) goto L_0x00df
            r0 = r19
            X.6hN r13 = X.C1403170x.A00(r0, r12)
            java.lang.Integer r0 = r13.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d0;
                case 2: goto L_0x00ca;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x002e;
                case 6: goto L_0x002e;
                case 7: goto L_0x002e;
                case 8: goto L_0x002e;
                case 9: goto L_0x00db;
                case 10: goto L_0x003d;
                case 11: goto L_0x00c6;
                case 12: goto L_0x00c2;
                case 13: goto L_0x00be;
                case 14: goto L_0x00ba;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00b2;
                case 17: goto L_0x00ad;
                case 18: goto L_0x0033;
                case 19: goto L_0x00aa;
                case 20: goto L_0x0033;
                default: goto L_0x002e;
            }
        L_0x002e:
            java.lang.String r0 = "Not interested in Card Payment Account Information"
        L_0x0030:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0033:
            java.lang.String r0 = r13.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 4
            int r12 = r12 + r0
            goto L_0x0019
        L_0x003d:
            java.lang.String r1 = r13.A03
            r0 = 0
            X.6hN r14 = X.C1403170x.A00(r1, r0)
            java.lang.String r1 = "00"
            java.lang.String r0 = r14.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r1 = r14.A03
            java.lang.String r0 = "br.gov.bcb.pix"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x00a7
            java.lang.String r0 = r14.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r15 = r0 + 4
        L_0x0060:
            java.lang.String r0 = r13.A03
            int r0 = r0.length()
            if (r15 >= r0) goto L_0x0033
            java.lang.String r0 = r13.A03
            X.6hN r14 = X.C1403170x.A00(r0, r15)
            java.lang.String r1 = r14.A01
            java.lang.String r0 = "01"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0084
            java.lang.String r2 = r14.A03
        L_0x007a:
            java.lang.String r0 = r14.A02
            int r0 = java.lang.Integer.parseInt(r0)
            int r0 = r0 + 4
            int r15 = r15 + r0
            goto L_0x0060
        L_0x0084:
            java.lang.String r0 = "25"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0094
            java.lang.String r4 = r14.A03
            java.lang.String r0 = "Its a Dynamic PIX QRCode"
        L_0x0090:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x007a
        L_0x0094:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Found PIX_SCHEMA_ID_UNKNOWN: "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = ".id"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            goto L_0x0090
        L_0x00a7:
            java.lang.String r0 = "Not interested parsing other account information"
            goto L_0x0030
        L_0x00aa:
            java.lang.String r10 = r13.A03
            goto L_0x0033
        L_0x00ad:
            java.lang.String r0 = r13.A03
            r16 = r0
            goto L_0x0033
        L_0x00b2:
            java.lang.String r8 = r13.A03
            goto L_0x0033
        L_0x00b6:
            java.lang.String r7 = r13.A03
            goto L_0x0033
        L_0x00ba:
            java.lang.String r11 = r13.A03
            goto L_0x0033
        L_0x00be:
            java.lang.String r3 = r13.A03
            goto L_0x0033
        L_0x00c2:
            java.lang.String r5 = r13.A03
            goto L_0x0033
        L_0x00c6:
            java.lang.String r9 = r13.A03
            goto L_0x0033
        L_0x00ca:
            java.lang.String r0 = r13.A03
            r17 = r0
            goto L_0x0033
        L_0x00d0:
            java.lang.String r6 = r13.A03
            goto L_0x0033
        L_0x00d4:
            java.lang.String r0 = "Found Unknown EMV"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0033
        L_0x00db:
            java.lang.String r0 = "Not interested in EMV Co. Reserved Payment Account Information"
            goto L_0x0030
        L_0x00df:
            if (r6 != 0) goto L_0x00e7
            java.lang.String r0 = "payloadFormatIndicator"
        L_0x00e3:
            X.C18070vi.A11(r0)
            throw r18
        L_0x00e7:
            if (r11 != 0) goto L_0x00ec
            java.lang.String r0 = "countryCode"
            goto L_0x00e3
        L_0x00ec:
            if (r9 != 0) goto L_0x00f1
            java.lang.String r0 = "payeeCategoryCode"
            goto L_0x00e3
        L_0x00f1:
            if (r5 != 0) goto L_0x00f6
            java.lang.String r0 = "txnCurrency"
            goto L_0x00e3
        L_0x00f6:
            if (r7 != 0) goto L_0x00fb
            java.lang.String r0 = "payeeName"
            goto L_0x00e3
        L_0x00fb:
            if (r8 != 0) goto L_0x0100
            java.lang.String r0 = "payeeCity"
            goto L_0x00e3
        L_0x0100:
            if (r10 != 0) goto L_0x0105
            java.lang.String r0 = "crc16"
            goto L_0x00e3
        L_0x0105:
            X.77P r13 = new X.77P
            r22 = r3
            r23 = r7
            r24 = r8
            r25 = r10
            r18 = r16
            r19 = r11
            r20 = r9
            r21 = r5
            r14 = r2
            r15 = r4
            r16 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = r29
            r2 = r30
            java.lang.String r6 = X.AnonymousClass1R2.A07(r3, r2)
            java.lang.String r0 = "unknown"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0140
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r6)
            java.lang.String r0 = " CS:"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ", MPO:"
            java.lang.String r6 = X.AnonymousClass001.A1I(r0, r1, r2)
        L_0x0140:
            java.lang.String r0 = r13.A00
            if (r0 == 0) goto L_0x016c
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            if (r0 != 0) goto L_0x016c
            X.1GP r5 = r27.getSupportFragmentManager()
            r4 = 0
            r3 = 1
            X.C18070vi.A0d(r6, r3)
            com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet r2 = new com.whatsapp.payments.pix.ui.FoundPixQrCodeBottomSheet
            r2.<init>()
            r0 = 2
            X.1D6[] r1 = new X.AnonymousClass1D6[r0]
            java.lang.String r0 = "bundle_key_pix_qrcode"
            X.AnonymousClass1D6.A03(r0, r13, r1, r4)
            java.lang.String r0 = "referral_screen"
            X.AnonymousClass1D6.A03(r0, r6, r1, r3)
            X.AnonymousClass3MX.A1I(r2, r1)
            X.C20098A7b.A02(r2, r5)
            return
        L_0x016c:
            java.lang.String r0 = "Pix key is not available to copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0172:
            java.lang.String r0 = "Cannot handle Qr code data. Unable to parse"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C145177Kg.BcO(X.1FL, java.lang.String, int, int):void");
    }

    public /* synthetic */ String BWc(String str) {
        return null;
    }

    public /* synthetic */ boolean Bgz(String str) {
        return false;
    }

    public /* synthetic */ DialogFragment BXl(AnonymousClass1BI r2, String str, String str2, int i) {
        return null;
    }
}
