package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import java.util.ArrayList;
import java.util.List;

public class ARI implements C22442B7y {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public ARI(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
        this.A03 = obj3;
    }

    public final void BlH(List list) {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                ((C175578yw) obj).A0G.A00((AnonymousClass8pK) this.A02, (A7B) null, (ArrayList) this.A03, false, false);
                return;
            case 1:
                ((C175548yt) obj).A09.A00((AnonymousClass8pK) this.A02, (A7B) null, (ArrayList) this.A03, false);
                return;
            default:
                DialogFragment dialogFragment = (DialogFragment) this.A03;
                BrazilConfirmReceivePaymentFragment brazilConfirmReceivePaymentFragment = (BrazilConfirmReceivePaymentFragment) ((AY6) obj).A01;
                brazilConfirmReceivePaymentFragment.A00.A04();
                brazilConfirmReceivePaymentFragment.A1k(brazilConfirmReceivePaymentFragment.A0E.A02(brazilConfirmReceivePaymentFragment.A1B(), (AnonymousClass8pK) this.A02));
                if (dialogFragment != null) {
                    dialogFragment.A28();
                    return;
                }
                return;
        }
    }
}
