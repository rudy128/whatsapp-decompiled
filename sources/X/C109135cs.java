package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.5cs  reason: invalid class name and case insensitive filesystem */
public final class C109135cs extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C121386Jl A02;

    public C109135cs(C121386Jl r1, int i, int i2) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = i2;
    }

    public void onAnimationEnd(Animator animator) {
        C121386Jl r1 = this.A02;
        int i = this.A01;
        List list = C42011xT.A0I;
        if (!r1.A05) {
            r1.A00 = -1;
            r1.A02 = null;
            WaTextView waTextView = r1.A09;
            C108975cc.A0v(waTextView, i);
            int i2 = 0;
            if (i == 0) {
                i2 = 8;
            }
            waTextView.setVisibility(i2);
            if (waTextView.getVisibility() != 0) {
                AnonymousClass3MW.A1S(waTextView);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        C121386Jl r1 = this.A02;
        int i = this.A00;
        List list = C42011xT.A0I;
        WaTextView waTextView = r1.A09;
        C108975cc.A0v(waTextView, i);
        waTextView.setVisibility(0);
    }
}
