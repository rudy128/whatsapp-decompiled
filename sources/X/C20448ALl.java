package X;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.whatsapp.biz.cart.view.fragment.CartFragment;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.registration.RegisterName;

/* renamed from: X.ALl  reason: case insensitive filesystem */
public class C20448ALl implements C107845ai {
    public final int A00;
    public final Object A01;

    public C20448ALl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void BmC() {
        View view;
        int i = this.A00;
        Object obj = this.A01;
        switch (i) {
            case 0:
                view = ((CartFragment) obj).A0c;
                break;
            case 1:
                view = ((PaymentView) obj).A0m.A0B;
                C17960vV.A05(view);
                break;
            default:
                view = ((RegisterName) obj).A0I;
                break;
        }
        if (view == null) {
            return;
        }
        view.dispatchKeyEvent(new KeyEvent(0, 67));
    }

    public void BsW(int[] iArr) {
        EditText editText;
        int i;
        int i2 = this.A00;
        Object obj = this.A01;
        switch (i2) {
            case 0:
                editText = ((CartFragment) obj).A0c;
                i = 65536;
                break;
            case 1:
                editText = ((PaymentView) obj).A0m.A0B;
                i = 0;
                break;
            default:
                editText = ((RegisterName) obj).A0I;
                i = 25;
                break;
        }
        C43251zV.A09(editText, iArr, i);
    }
}
