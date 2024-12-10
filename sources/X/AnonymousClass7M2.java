package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import com.whatsapp.payments.ui.MessageWithLinkWebViewActivity;

/* renamed from: X.7M2  reason: invalid class name */
public class AnonymousClass7M2 implements C1602987x {
    public final int A00;
    public final Object A01;

    public AnonymousClass7M2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void C3E() {
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 1:
                C108945cZ.A1Q(obj);
                return;
            case 3:
                ((MediaViewBaseFragment) obj).A2D();
                return;
            case 4:
                ((MessageWithLinkWebViewActivity) obj).finish();
                return;
            case 5:
                AnonymousClass1FR r1 = (AnonymousClass1FR) ((AnonymousClass6M4) obj).A07.get();
                if (r1 instanceof Activity) {
                    AnonymousClass3MW.A1U(r1);
                    return;
                }
                return;
            default:
                ((DialogFragment) obj).A28();
                return;
        }
    }
}
