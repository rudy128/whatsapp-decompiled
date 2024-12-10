package X;

import com.whatsapp.payments.ui.IndiaUpiQrTabActivity;
import com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment;

public class AX7 implements BB3 {
    public final int A00;
    public final Object A01;

    public AX7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C4N() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            IndiaUpiScanQrCodeFragment indiaUpiScanQrCodeFragment = ((IndiaUpiQrTabActivity) obj).A0B;
            indiaUpiScanQrCodeFragment.A0C = null;
            indiaUpiScanQrCodeFragment.A08.CFY();
            return;
        }
        AnonymousClass3MW.A1U(obj);
    }

    public void C4O() {
        if (this.A00 == 0) {
            AnonymousClass3MW.A1U(this.A01);
        }
    }
}
