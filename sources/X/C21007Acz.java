package X;

import android.net.Uri;
import android.os.Vibrator;
import com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment;
import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;
import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Acz  reason: case insensitive filesystem */
public class C21007Acz implements AnonymousClass8AH {
    public final /* synthetic */ IndiaUpiScanQrCodeFragment A00;

    public C21007Acz(IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment) {
        this.A00 = indiaUpiScanQrCodeFragment;
    }

    public void BnR(int i) {
        AnonymousClass1KB r1;
        int i2;
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A00;
        if (indiaUpiScanQrCodeFragment.A02.A03()) {
            r1 = indiaUpiScanQrCodeFragment.A01;
            i2 = 2131889961;
        } else if (i != 2) {
            r1 = indiaUpiScanQrCodeFragment.A01;
            i2 = 2131887932;
        } else {
            return;
        }
        r1.A08(i2, 1);
    }

    public void C1j() {
        Log.i("qractivity/previewready");
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A00;
        indiaUpiScanQrCodeFragment.A0C = null;
        C21427Aju.A00(indiaUpiScanQrCodeFragment.A0A, this, 3);
        if (IndiaUpiScanQrCodeFragment.A00(indiaUpiScanQrCodeFragment)) {
            indiaUpiScanQrCodeFragment.A2A();
        }
        ((C192489oU) indiaUpiScanQrCodeFragment.A0B.get()).A00("payments_camera");
    }

    public void C2H(String str) {
        String str2;
        String str3;
        int A0E;
        String str4;
        IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = this.A00;
        ((C192489oU) indiaUpiScanQrCodeFragment.A0B.get()).A01(2);
        if (indiaUpiScanQrCodeFragment.A1b() && indiaUpiScanQrCodeFragment.A0E) {
            String str5 = str;
            if (str != null && !str5.equals(indiaUpiScanQrCodeFragment.A0C)) {
                indiaUpiScanQrCodeFragment.A0C = str5;
                IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) indiaUpiScanQrCodeFragment.A1D();
                C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
                A03.A07("qr_detection_result", "success");
                IndiaUpiQrTabActivity.A03(A03, indiaUpiQrTabActivity, 0, 208);
                Vibrator A0H = indiaUpiQrTabActivity.A08.A0H();
                if (A0H != null) {
                    A0H.vibrate(75);
                }
                if (!C20092A6u.A02(indiaUpiQrTabActivity.A0E, indiaUpiQrTabActivity.A06.A0G()) || !C20092A6u.A03(indiaUpiQrTabActivity.A0E, str5)) {
                    boolean A4d = indiaUpiQrTabActivity.A4d();
                    C18030ve r1 = indiaUpiQrTabActivity.A0E;
                    C18040vf r3 = C18040vf.A02;
                    if (C18020vd.A05(r3, r1, 1354)) {
                        Uri parse = Uri.parse(str5);
                        if (!C18020vd.A05(r3, indiaUpiQrTabActivity.A0E, 10019) || !indiaUpiQrTabActivity.A4d() || !((A0E = indiaUpiQrTabActivity.A03.A0E(parse)) == 2 || A0E == 19)) {
                            C20756AXl aXl = indiaUpiQrTabActivity.A05;
                            if (indiaUpiQrTabActivity.A4d()) {
                                str3 = "main_qr_code_camera";
                            } else {
                                str3 = "payments_camera";
                            }
                            C20756AXl.A00(indiaUpiQrTabActivity, (AnonymousClass1BI) null, new AX5(indiaUpiQrTabActivity, 1025, A4d), new AX7(indiaUpiQrTabActivity, 1), aXl, str5, "SCANNED_QR_CODE", str3, A4d);
                            return;
                        }
                        indiaUpiQrTabActivity.A00.CGU(indiaUpiQrTabActivity, parse, (AnonymousClass206) null);
                        return;
                    }
                    if (indiaUpiQrTabActivity.A4d()) {
                        str2 = "main_qr_code_camera";
                    } else {
                        str2 = "payments_camera";
                    }
                    indiaUpiQrTabActivity.CMk(IndiaUpiQrCodeScannedDialogFragment.A00((AnonymousClass1BI) null, str5, "SCANNED_QR_CODE", str2), "SCANNED_QR_CODE");
                    return;
                } else if (indiaUpiQrTabActivity.A07.A0D() && ((A0u) indiaUpiQrTabActivity.A0E.get()).A02()) {
                    C20756AXl aXl2 = indiaUpiQrTabActivity.A05;
                    if (indiaUpiQrTabActivity.A4d()) {
                        str4 = "main_qr_code_camera";
                    } else {
                        str4 = "payments_camera";
                    }
                    aXl2.A01(indiaUpiQrTabActivity, (AnonymousClass1BI) null, (BB3) null, str5, "SCANNED_QR_CODE", str4);
                    return;
                } else if (!((A0u) indiaUpiQrTabActivity.A0E.get()).A02()) {
                    indiaUpiQrTabActivity.A05.CGD(new C177849Av(indiaUpiQrTabActivity, indiaUpiQrTabActivity.A08, new Aa3(indiaUpiQrTabActivity, "SCANNED_QR_CODE", str5)), new AnonymousClass1F9[0]);
                    return;
                } else {
                    return;
                }
            }
        }
        indiaUpiScanQrCodeFragment.A08.CFY();
    }

    public void C2I(Map map) {
        String str;
        AnonymousClass1FL A1B = this.A00.A1B();
        if (A1B instanceof IndiaUpiQrTabActivity) {
            IndiaUpiQrTabActivity indiaUpiQrTabActivity = (IndiaUpiQrTabActivity) A1B;
            C20112A7u A03 = C20112A7u.A03(new C20112A7u[0]);
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                A03.A07(C17880vN.A0x(A16), AnonymousClass8BR.A10(A16));
            }
            AZ6 az6 = indiaUpiQrTabActivity.A09;
            if (indiaUpiQrTabActivity.A4d()) {
                str = "main_qr_code_camera";
            } else {
                str = "payments_camera";
            }
            az6.BiM(A03, (Integer) null, "qr_code_scan_error", str, 0);
        }
    }
}
