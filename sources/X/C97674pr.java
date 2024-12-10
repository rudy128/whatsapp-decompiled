package X;

import com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity;
import com.whatsapp.qrcode.contactqr.QrScanCodeFragment;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.4pr  reason: invalid class name and case insensitive filesystem */
public class C97674pr implements AnonymousClass8AH {
    public final int A00;
    public final Object A01;

    public C97674pr(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BnR(int i) {
        AnonymousClass1KB r1;
        int i2;
        int i3 = this.A00;
        Object obj = this.A01;
        if (2 - i3 != 0) {
            AnonymousClass46N r3 = (AnonymousClass46N) obj;
            if (r3.A03.A03()) {
                r1 = r3.A05;
                i2 = 2131889961;
            } else {
                if (i != 2) {
                    r1 = r3.A05;
                    i2 = 2131887932;
                }
                r3.finish();
                return;
            }
            r1.A08(i2, 1);
            r3.finish();
            return;
        }
        QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) obj;
        if (qrScanCodeFragment.A02.A03()) {
            qrScanCodeFragment.A01.A08(2131889961, 1);
        }
        AnonymousClass1FL A1B = qrScanCodeFragment.A1B();
        if (A1B instanceof AnonymousClass990) {
            AnonymousClass990 r12 = (AnonymousClass990) A1B;
            r12.A02.A0J(AnonymousClass3MY.A1b(r12.A0E) ^ true ? 1 : 0, true);
        }
    }

    public void C1j() {
        switch (this.A00) {
            case 0:
                IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) this.A01;
                indiaUpiQrCodeScanActivity.A02.A06("indiaupiqractivity/previewready");
                indiaUpiQrCodeScanActivity.A08 = true;
                ((C192489oU) indiaUpiQrCodeScanActivity.A00.get()).A00("payments_camera");
                return;
            case 1:
                Log.i("qractivity/previewready");
                ((AnonymousClass46N) this.A01).A08 = true;
                return;
            default:
                ((QrScanCodeFragment) this.A01).A05.CGF(new AnonymousClass7RB((Object) this, 36));
                return;
        }
    }

    public void C2H(String str) {
        switch (this.A00) {
            case 0:
                IndiaUpiQrCodeScanActivity indiaUpiQrCodeScanActivity = (IndiaUpiQrCodeScanActivity) this.A01;
                ((C192489oU) indiaUpiQrCodeScanActivity.A00.get()).A01(2);
                indiaUpiQrCodeScanActivity.A4c(str);
                return;
            case 1:
                Log.i("QrScannerActivity/onQrCodeDetected");
                AnonymousClass46N r1 = (AnonymousClass46N) this.A01;
                if (!r1.A07) {
                    r1.A4c(str);
                    return;
                }
                return;
            default:
                QrScanCodeFragment qrScanCodeFragment = (QrScanCodeFragment) this.A01;
                if (!qrScanCodeFragment.A07) {
                    if (str != null && !str.equals(qrScanCodeFragment.A06)) {
                        qrScanCodeFragment.A06 = str;
                        if (((AnonymousClass990) qrScanCodeFragment.A1D()).A4e(str, true, 2)) {
                            qrScanCodeFragment.A09 = true;
                            qrScanCodeFragment.A01.A0I(qrScanCodeFragment.A0D);
                            return;
                        }
                        qrScanCodeFragment.A01.A08(2131888841, 1);
                    }
                    qrScanCodeFragment.A04.CFY();
                    return;
                }
                return;
        }
    }

    public /* synthetic */ void C2I(Map map) {
    }
}
