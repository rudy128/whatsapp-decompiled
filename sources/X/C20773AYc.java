package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.AYc  reason: case insensitive filesystem */
public class C20773AYc implements BBF {
    public final /* synthetic */ AZW A00;
    public final /* synthetic */ String A01;

    public C20773AYc(AZW azw, String str) {
        this.A00 = azw;
        this.A01 = str;
    }

    public void C26(A7B a7b) {
        AZW azw = this.A00;
        ((DialogFragment) azw.A02).A29();
        ((A5V) azw.A01).A03();
    }

    public void C27(AZ2 az2) {
        AZW azw = this.A00;
        C198959zC r2 = new C198959zC(az2);
        String str = this.A01;
        A5V.A01(r2, (PinBottomSheetDialogFragment) azw.A02, (A5V) azw.A01, str);
    }
}
