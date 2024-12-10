package X;

import android.view.animation.Animation;
import android.widget.TextView;
import com.whatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.registration.phonenumberentry.RegisterPhone;

/* renamed from: X.8d7  reason: invalid class name and case insensitive filesystem */
public class C166568d7 extends C90704eV {
    public final int A00;
    public final Object A01;

    public C166568d7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        TextView textView;
        if (this.A00 != 0) {
            RegisterPhone registerPhone = (RegisterPhone) this.A01;
            if (!registerPhone.A0x) {
                textView = registerPhone.A0D;
            } else {
                return;
            }
        } else {
            textView = ((PaymentView) this.A01).A0G;
        }
        textView.setVisibility(8);
    }
}
