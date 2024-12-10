package X;

import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.whatsapp.WaTextView;
import com.whatsapp.account.delete.DeleteAccountConfirmation;
import com.whatsapp.registration.RegistrationScrollView;
import com.whatsapp.registration.phonenumberentry.ChangeNumber;

/* renamed from: X.AFj  reason: case insensitive filesystem */
public class C20301AFj implements ViewTreeObserver.OnScrollChangedListener {
    public final int A00;
    public final Object A01;

    public C20301AFj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onScrollChanged() {
        float f;
        float f2;
        float f3;
        switch (this.A00) {
            case 0:
                DeleteAccountConfirmation.A03((DeleteAccountConfirmation) this.A01);
                return;
            case 1:
                RegistrationScrollView registrationScrollView = (RegistrationScrollView) this.A01;
                boolean canScrollVertically = registrationScrollView.canScrollVertically(1);
                if (registrationScrollView.canScrollVertically(-1) || canScrollVertically) {
                    int bottom = registrationScrollView.getChildAt(registrationScrollView.getChildCount() - 1).getBottom();
                    int height = registrationScrollView.getHeight();
                    int scrollY = registrationScrollView.getScrollY();
                    float height2 = (float) (registrationScrollView.getChildAt(0).getHeight() - height);
                    float f4 = ((float) scrollY) / height2;
                    float f5 = ((float) (bottom - (height + scrollY))) / height2;
                    WaTextView waTextView = registrationScrollView.A02;
                    if (f4 < 0.1f) {
                        f2 = registrationScrollView.A06;
                        f = f4 * 10.0f * f2;
                    } else {
                        f = registrationScrollView.A06;
                        f2 = f;
                    }
                    AnonymousClass1HF.A0W(waTextView, f);
                    LinearLayout linearLayout = registrationScrollView.A01;
                    if (f5 < 0.1f) {
                        f3 = f5 * 10.0f * f2;
                    } else {
                        f3 = f2;
                    }
                    AnonymousClass1HF.A0W(linearLayout, f3);
                    return;
                }
                return;
            default:
                ChangeNumber.A10((ChangeNumber) this.A01);
                return;
        }
    }
}
