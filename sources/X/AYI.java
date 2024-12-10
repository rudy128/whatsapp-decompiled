package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.payments.ui.PaymentBottomSheet;

public class AYI implements BBC {
    public final /* synthetic */ B90 A00;
    public final /* synthetic */ B91 A01;
    public final /* synthetic */ AnonymousClass92s A02;
    public final /* synthetic */ PaymentBottomSheet A03;
    public final /* synthetic */ Runnable A04;

    public AYI(B90 b90, B91 b91, AnonymousClass92s r3, PaymentBottomSheet paymentBottomSheet, Runnable runnable) {
        this.A02 = r3;
        this.A03 = paymentBottomSheet;
        this.A04 = runnable;
        this.A00 = b90;
        this.A01 = b91;
    }

    public void Bss(A7B a7b) {
        AnonymousClass92s r2 = this.A02;
        r2.A08.get();
        int i = a7b.A00;
        if (i == 10752 || i == 10756 || i == 10755) {
            AnonymousClass92s.A0c(a7b, this.A00, r2, this.A03);
        } else {
            r2.BhR(r2.A5s(a7b));
        }
        this.A01.Bss(a7b);
    }

    public void C3k(AnonymousClass9FM r6) {
        AnonymousClass9DD r0 = r6.A01;
        if (r0 != null) {
            AnonymousClass92s r4 = this.A02;
            r4.startActivityForResult(AnonymousClass1LU.A1c(r4, r0.A04, r0.A03, r0.A02, 1), EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            ((A0J) r4.A0R.get()).A01(r4.A07);
            PaymentBottomSheet paymentBottomSheet = this.A03;
            if (paymentBottomSheet != null) {
                paymentBottomSheet.A28();
            }
            r4.BiK((C20112A7u) null, AnonymousClass3MY.A0f(), (Integer) null, "in_app_browser_checkout");
        }
        this.A04.run();
    }
}
