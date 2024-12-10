package X;

import android.widget.ProgressBar;
import com.whatsapp.QrImageView;
import com.whatsapp.identity.ScanQrCodeActivity;
import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.EnumMap;
import java.util.Set;

/* renamed from: X.7IF  reason: invalid class name */
public final class AnonymousClass7IF implements AnonymousClass894 {
    public final /* synthetic */ ScanQrCodeActivity A00;

    public AnonymousClass7IF(ScanQrCodeActivity scanQrCodeActivity) {
        this.A00 = scanQrCodeActivity;
    }

    public void Bub(C128396fv r8, Set set) {
        String str;
        ScanQrCodeActivity scanQrCodeActivity = this.A00;
        ProgressBar progressBar = scanQrCodeActivity.A00;
        if (progressBar == null) {
            str = "progressBar";
        } else {
            progressBar.setVisibility(8);
            if (r8 != null) {
                if (scanQrCodeActivity.A08 != null) {
                    C128396fv r0 = scanQrCodeActivity.A07;
                    if (r0 == r8) {
                        return;
                    }
                    if (r0 != null) {
                        C133506os r1 = r0.A01;
                        C133506os r02 = r8.A01;
                        if (!(r1 == null || r02 == null || !r1.equals(r02))) {
                            return;
                        }
                    }
                } else {
                    str = "fingerprintUtil";
                }
            }
            scanQrCodeActivity.A07 = r8;
            C136676uC r03 = scanQrCodeActivity.A09;
            if (r03 != null) {
                r03.A0A = r8;
                if (r8 != null) {
                    QrImageView qrImageView = (QrImageView) scanQrCodeActivity.findViewById(2131434246);
                    try {
                        EnumMap enumMap = new EnumMap(C24262ByL.class);
                        C25088CWz A002 = C25912CoW.A00(AnonymousClass00R.A00, new String(r8.A02.A0M(), scanQrCodeActivity.A0E), enumMap);
                        scanQrCodeActivity.A01 = A002;
                        qrImageView.setQrCode(A002);
                        qrImageView.invalidate();
                        return;
                    } catch (C2V | UnsupportedEncodingException e) {
                        Log.w("scanqrcode/", e);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                str = "qrCodeValidationUtil";
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void C1J() {
        ProgressBar progressBar = this.A00.A00;
        if (progressBar == null) {
            C18070vi.A11("progressBar");
            throw null;
        } else {
            progressBar.setVisibility(0);
        }
    }
}
