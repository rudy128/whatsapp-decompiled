package X;

import android.view.ViewGroup;
import android.view.animation.Animation;
import com.whatsapp.contact.picker.PhoneContactsSelector;

/* renamed from: X.79E  reason: invalid class name */
public class AnonymousClass79E implements Animation.AnimationListener {
    public final int A00;
    public final /* synthetic */ PhoneContactsSelector A01;

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }

    public AnonymousClass79E(PhoneContactsSelector phoneContactsSelector, int i) {
        this.A01 = phoneContactsSelector;
        this.A00 = i;
    }

    public void onAnimationEnd(Animation animation) {
        PhoneContactsSelector phoneContactsSelector = this.A01;
        phoneContactsSelector.A03.clearAnimation();
        ViewGroup.MarginLayoutParams A0B = AnonymousClass3MW.A0B(phoneContactsSelector.A03);
        A0B.setMargins(A0B.leftMargin, this.A00, A0B.rightMargin, A0B.bottomMargin);
        phoneContactsSelector.A03.setLayoutParams(A0B);
    }
}
