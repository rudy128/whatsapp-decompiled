package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.whatsapp.mediaview.MediaViewFragment;
import com.whatsapp.registration.verifyphone.VerifyPhoneNumber;
import java.util.List;

/* renamed from: X.5hW  reason: invalid class name and case insensitive filesystem */
public class C110935hW extends AnonymousClass1XU {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C110935hW(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void A1S(View view, int i) {
        if (this.A00 == 0 && i == 256) {
            MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A01;
            if (mediaViewFragment.A1n) {
                C121996Mj r1 = (C121996Mj) this.A02;
                r1.A09 = true;
                r1.setPlayControlVisibility(0);
                mediaViewFragment.A1n = false;
            }
            C121996Mj r12 = (C121996Mj) this.A02;
            if (!C108995ce.A1U(r12.A0F)) {
                r12.A05();
            }
            r12.A0A(3000);
            return;
        }
        super.A1S(view, i);
    }

    public void A1T(View view, AccessibilityEvent accessibilityEvent) {
        if (1 - this.A00 != 0) {
            super.A1T(view, accessibilityEvent);
            return;
        }
        super.A1T(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 1) {
            C108945cZ.A1P(this.A02);
            VerifyPhoneNumber.A1i((VerifyPhoneNumber) this.A01);
        }
    }

    public void A1Z(View view, C26228CvK cvK) {
        Context context;
        int i;
        switch (this.A00) {
            case 1:
                super.A1Z(view, cvK);
                C26137Ct0 ct0 = C26137Ct0.A08;
                context = (Context) this.A01;
                i = 2131898589;
                break;
            case 2:
                super.A1Z((View) this.A02, cvK);
                C26137Ct0 ct02 = C26137Ct0.A08;
                C113485nA r1 = (C113485nA) this.A01;
                List list = C42011xT.A0I;
                context = r1.A05;
                i = r1.A00;
                break;
            default:
                super.A1Z(view, cvK);
                return;
        }
        cvK.A0L(new C26137Ct0(16, (CharSequence) context.getString(i)));
    }
}
