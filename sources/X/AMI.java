package X;

import android.widget.TextView;
import com.whatsapp.authentication.FingerprintBottomSheet;

public class AMI implements BCP {
    public final /* synthetic */ BCP A00;
    public final /* synthetic */ C167278fk A01;

    public AMI(BCP bcp, C167278fk r2) {
        this.A01 = r2;
        this.A00 = bcp;
    }

    public /* synthetic */ void A00() {
        this.A01.A05.C5b();
    }

    public void Blr(int i, CharSequence charSequence) {
        this.A00.Blr(i, charSequence);
    }

    public void Bls() {
        this.A00.Bls();
    }

    public void Blu(int i, CharSequence charSequence) {
        this.A00.Blu(i, charSequence);
    }

    public void Blv(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A01.A02;
        fingerprintBottomSheet.A2D(false);
        TextView textView = fingerprintBottomSheet.A01;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = fingerprintBottomSheet.A00;
        if (textView2 != null) {
            textView2.setEnabled(false);
        }
        this.A00.Blv(bArr);
    }
}
