package X;

import android.view.animation.Animation;
import com.whatsapp.QrImageView;
import com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView;
import com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel;

/* renamed from: X.AFp  reason: case insensitive filesystem */
public class C20307AFp implements Animation.AnimationListener {
    public final /* synthetic */ C22359B4n A00;
    public final /* synthetic */ QrImageView A01;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public C20307AFp(C22359B4n b4n, QrImageView qrImageView) {
        this.A01 = qrImageView;
        this.A00 = b4n;
    }

    public void onAnimationEnd(Animation animation) {
        C20453ALq aLq = (C20453ALq) this.A00;
        IndiaUpiDisplaySecureQrCodeView indiaUpiDisplaySecureQrCodeView = aLq.A01;
        IndiaUpiSecureQrCodeViewModel.A03(indiaUpiDisplaySecureQrCodeView.A0G, 3, aLq.A00);
    }
}
