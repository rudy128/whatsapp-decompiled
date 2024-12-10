package X;

import android.content.DialogInterface;
import android.net.Uri;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;

/* renamed from: X.Acy  reason: case insensitive filesystem */
public class C21006Acy implements C1601987n {
    public final int A00;
    public final Object A01;

    public C21006Acy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void C3m(String str, int i) {
        String str2;
        int A0E;
        String str3;
        String str4 = str;
        if (this.A00 != 0) {
            AnonymousClass990 r4 = (AnonymousClass990) this.A01;
            if (!r4.Bed()) {
                r4.A0a = false;
                r4.CEx();
                if (i != 0) {
                    if (i == 1) {
                        C1408473h.A04((C42741yf) null, (C62602rf) null, r4.A0H, (C129806iO) null, (Boolean) null, 1, 3, C1408473h.A05(str));
                    } else if (i != 2 || r4.A4e(str, false, 3)) {
                        return;
                    }
                    C139676zG r1 = r4.A0N;
                    r1.A05.CMk(AnonymousClass4HW.A00(6), "qr_code_scanning_dialog_fragment_tag");
                } else {
                    C73203Rj A002 = AnonymousClass4a6.A00(r4);
                    A002.setPositiveButton(2131899286, (DialogInterface.OnClickListener) null);
                    A002.A0D(2131889981);
                    A002.A0O(C20160A9w.A00(r4, 32));
                    AnonymousClass3MY.A1G(A002);
                }
                r4.A0N.A0j = true;
                return;
            }
            return;
        }
        IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) this.A01;
        indiaUpiQrTabActivity.CEx();
        if (!indiaUpiQrTabActivity.Bed()) {
            int i2 = 2131889981;
            if (i != 0) {
                i2 = 2131888841;
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    if (!C20092A6u.A02(indiaUpiQrTabActivity.A0E, indiaUpiQrTabActivity.A06.A0G()) || !C20092A6u.A03(indiaUpiQrTabActivity.A0E, str)) {
                        Uri parse = Uri.parse(str);
                        boolean z = false;
                        if (C18020vd.A05(C18040vf.A02, indiaUpiQrTabActivity.A0E, 10019) && indiaUpiQrTabActivity.A4d() && ((A0E = indiaUpiQrTabActivity.A03.A0E(parse)) == 2 || A0E == 19)) {
                            z = true;
                        }
                        if (z) {
                            indiaUpiQrTabActivity.A00.CGU(indiaUpiQrTabActivity, parse, (AnonymousClass206) null);
                            return;
                        }
                        if (indiaUpiQrTabActivity.A4d()) {
                            str2 = "main_qr_code_gallery";
                        } else {
                            str2 = "payments_camera_gallery";
                        }
                        indiaUpiQrTabActivity.CMk(IndiaUpiQrCodeScannedDialogFragment.A00((AnonymousClass1BI) null, str, "GALLERY_QR_CODE", str2), "GALLERY_QR_CODE");
                        return;
                    } else if (indiaUpiQrTabActivity.A07.A0D() && ((A0u) indiaUpiQrTabActivity.A0E.get()).A02()) {
                        C20756AXl aXl = indiaUpiQrTabActivity.A05;
                        if (indiaUpiQrTabActivity.A4d()) {
                            str3 = "main_qr_code_gallery";
                        } else {
                            str3 = "payments_camera_gallery";
                        }
                        aXl.A01(indiaUpiQrTabActivity, (AnonymousClass1BI) null, (BB3) null, str4, "GALLERY_QR_CODE", str3);
                        return;
                    } else if (!((A0u) indiaUpiQrTabActivity.A0E.get()).A02()) {
                        indiaUpiQrTabActivity.A05.CGD(new C177849Av(indiaUpiQrTabActivity, indiaUpiQrTabActivity.A08, new Aa3(indiaUpiQrTabActivity, "GALLERY_QR_CODE", str)), new AnonymousClass1F9[0]);
                        return;
                    } else {
                        return;
                    }
                }
            }
            String string = indiaUpiQrTabActivity.getString(i2);
            C73203Rj A003 = AnonymousClass4a6.A00(indiaUpiQrTabActivity);
            C73203Rj.A06(A003);
            A003.A0S(string);
            AnonymousClass3MY.A1G(A003);
        }
    }
}
