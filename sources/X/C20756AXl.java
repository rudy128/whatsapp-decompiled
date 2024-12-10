package X;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;

/* renamed from: X.AXl  reason: case insensitive filesystem */
public class C20756AXl implements C160818Aa {
    public final AnonymousClass18O A00;
    public final C18030ve A01;
    public final AXS A02;
    public final AZ6 A03;
    public final AnonymousClass1QE A04 = AnonymousClass1QE.A00("IndiaUpiPaymentQrManager", "payment", "IN");
    public final A8C A05;

    public void A01(Activity activity, AnonymousClass1BI r11, BB3 bb3, String str, String str2, String str3) {
        A00(activity, r11, new AX5(activity, 0, false), bb3, this, str, str2, str3, false);
    }

    public DialogFragment BXl(AnonymousClass1BI r2, String str, String str2, int i) {
        String str3;
        if (i != 3) {
            str3 = "SCANNED_QR_CODE";
        } else {
            str3 = "GALLERY_QR_CODE";
        }
        return IndiaUpiQrCodeScannedDialogFragment.A00(r2, str, str3, str2);
    }

    public void BcO(AnonymousClass1FL r1, String str, int i, int i2) {
    }

    public boolean Bh0(String str) {
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.content.Context r13, X.AnonymousClass1BI r14, X.B8X r15, X.BB3 r16, X.C20756AXl r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            r5 = r17
            X.0ve r7 = r5.A01
            X.AXS r6 = r5.A02
            java.lang.String r0 = r6.A0G()
            boolean r0 = X.C20092A6u.A02(r7, r0)
            r10 = r13
            r2 = r18
            r3 = r19
            r13 = r20
            if (r0 == 0) goto L_0x0043
            boolean r0 = X.C20092A6u.A03(r7, r2)
            if (r0 == 0) goto L_0x0043
            java.lang.Class<com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity> r0 = com.whatsapp.payments.ui.international.IndiaUpiInternationalValidateQrActivity.class
            android.content.Intent r4 = X.AnonymousClass8BR.A07(r10, r0)
            java.lang.String r1 = "INTERNATIONAL_QR_PAYLOAD"
            java.lang.String r0 = "UTF-8"
            java.lang.String r0 = java.net.URLEncoder.encode(r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x002f }
            r4.putExtra(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x002f }
            goto L_0x0037
        L_0x002f:
            r2 = move-exception
            X.1QE r1 = r5.A04
            java.lang.String r0 = "Url encode of qr payload failure: "
            r1.A0A(r0, r2)
        L_0x0037:
            java.lang.String r0 = "INTERNATIONAL_QR_SOURCE"
            r4.putExtra(r0, r3)
            X.AnonymousClass8BR.A1D(r4, r13)
            r10.startActivity(r4)
            return
        L_0x0043:
            X.A8b r11 = X.C20118A8b.A01(r2, r3)
            java.lang.String r4 = X.AXS.A00(r6)
            r0 = r16
            if (r11 == 0) goto L_0x00db
            java.lang.String r1 = r11.A0O
            if (r1 == 0) goto L_0x00db
            boolean r1 = r1.equalsIgnoreCase(r4)
            if (r1 == 0) goto L_0x00db
            r1 = 2131893840(0x7f121e50, float:1.9422468E38)
        L_0x005c:
            java.lang.String r4 = r10.getString(r1)
            r1 = 0
            X.A7u[] r1 = new X.C20112A7u[r1]
            r16 = 0
            X.A7u r15 = X.C20112A7u.A03(r1)
            r6 = 9267(0x2433, float:1.2986E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r7, r6)
            if (r1 == 0) goto L_0x00b2
            r1 = 9960(0x26e8, float:1.3957E-41)
            java.lang.String r1 = r7.A0I(r1)
            java.lang.String r1 = r1.toLowerCase()
            java.util.List r9 = X.AnonymousClass8BW.A0t(r1)
            android.net.Uri r8 = android.net.Uri.parse(r2)
            java.lang.String r2 = r8.getScheme()
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r7 = "qrc_uri_scheme"
            if (r1 != 0) goto L_0x00d5
            java.lang.String r6 = r2.toLowerCase()
            boolean r1 = r9.contains(r6)
            if (r1 == 0) goto L_0x00d5
            java.lang.String r2 = "qrc_uri_authority"
            java.lang.String r1 = r8.getAuthority()
            r15.A07(r2, r1)
            r15.A07(r7, r6)
        L_0x00a7:
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x00b2
            java.lang.String r1 = "qrc_source"
            r15.A07(r1, r3)
        L_0x00b2:
            X.AZ6 r14 = r5.A03
            java.lang.String r17 = "qr_code_scan_error"
            r19 = 0
            r18 = r13
            r14.BiM(r15, r16, r17, r18, r19)
            X.3Rj r3 = X.AnonymousClass4a6.A00(r10)
            r2 = 2131899286(0x7f123396, float:1.9433514E38)
            r1 = 38
            X.C20151A9n.A00(r3, r0, r1, r2)
            r3.A0S(r4)
            r1 = 12
            X.A9Q.A00(r3, r0, r1)
            X.AnonymousClass3MY.A1G(r3)
        L_0x00d4:
            return
        L_0x00d5:
            java.lang.String r1 = "others"
            r15.A07(r7, r1)
            goto L_0x00a7
        L_0x00db:
            if (r16 == 0) goto L_0x00fe
            if (r18 == 0) goto L_0x00fe
            java.lang.String r1 = "upi://mandate"
            boolean r1 = r2.startsWith(r1)
            if (r1 == 0) goto L_0x00fe
            java.lang.String r1 = r6.A0G()
            boolean r1 = X.A8C.A03(r7, r11, r1)
            if (r1 == 0) goto L_0x0134
            X.A8C r9 = r5.A05
            r1 = 0
            X.Aam r12 = new X.Aam
            r12.<init>(r0, r1)
            r14 = 1
            r9.A0A(r10, r11, r12, r13, r14)
            return
        L_0x00fe:
            boolean r1 = X.A7Z.A04(r11)
            if (r1 != 0) goto L_0x0134
            boolean r1 = X.C87544Vz.A00(r7)
            if (r1 == 0) goto L_0x0131
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet> r1 = com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet.class
        L_0x010c:
            android.content.Intent r3 = X.AnonymousClass8BR.A07(r10, r1)
            X.18O r4 = r5.A00
            r5 = r14
            if (r21 == 0) goto L_0x012a
            r8 = 0
            r6 = r11
            r7 = r13
            X.A7Z.A02(r3, r4, r5, r6, r7, r8)
            java.lang.String r2 = "extra_return_result_and_finish_on_send_money_complete"
            r1 = 1
            r3.putExtra(r2, r1)
        L_0x0121:
            r15.C5A(r3)
            if (r16 == 0) goto L_0x00d4
            r0.C4O()
            return
        L_0x012a:
            r8 = 1
            r6 = r11
            r7 = r13
            X.A7Z.A02(r3, r4, r5, r6, r7, r8)
            goto L_0x0121
        L_0x0131:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity> r1 = com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.class
            goto L_0x010c
        L_0x0134:
            r1 = 2131893841(0x7f121e51, float:1.942247E38)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20756AXl.A00(android.content.Context, X.1BI, X.B8X, X.BB3, X.AXl, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public void CNI(Activity activity, AnonymousClass1BI r9, String str, String str2) {
        A01(activity, r9, new AX6(), str, "SCANNED_QR_CODE", str2);
    }

    public C20756AXl(AnonymousClass18O r4, C18030ve r5, AXS axs, AZ6 az6, A8C a8c) {
        this.A02 = axs;
        this.A00 = r4;
        this.A03 = az6;
        this.A01 = r5;
        this.A05 = a8c;
    }

    public String BWc(String str) {
        C20118A8b A002 = C20118A8b.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (A002 != null) {
            return A002.A0O;
        }
        return null;
    }

    public boolean Bgz(String str) {
        C20118A8b A002 = C20118A8b.A00(Uri.parse(str), "SCANNED_QR_CODE");
        if (!AnonymousClass000.A1O(str.startsWith("upi://mandate") ? 1 : 0) ? A002 != null : !(!A8C.A03(this.A01, A002, this.A02.A0G()) || A002.A0L != null)) {
            if (!TextUtils.isEmpty(A002.A0O)) {
                return true;
            }
        }
        return false;
    }
}
