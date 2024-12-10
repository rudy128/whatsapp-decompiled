package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.mediaview.MediaViewBaseFragment;

/* renamed from: X.799  reason: invalid class name */
public class AnonymousClass799 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ View A04;
    public final /* synthetic */ C1600787a A05;
    public final /* synthetic */ AnonymousClass6A8 A06;

    public AnonymousClass799(View view, C1600787a r2, AnonymousClass6A8 r3, int i, int i2, int i3, int i4) {
        this.A06 = r3;
        this.A04 = view;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = i3;
        this.A00 = i4;
        this.A05 = r2;
    }

    public boolean onPreDraw() {
        View view = this.A04;
        AnonymousClass3MX.A1G(view, this);
        int[] A1W = C108945cZ.A1W();
        view.getLocationOnScreen(A1W);
        AnonymousClass6A8 r3 = this.A06;
        r3.A02 = this.A01 - A1W[0];
        r3.A04 = this.A02 - A1W[1];
        float f = (float) this.A03;
        r3.A01 = f / C108945cZ.A03(view);
        float f2 = (float) this.A00;
        float A042 = f2 / C108945cZ.A04(view);
        r3.A00 = A042;
        float f3 = r3.A01;
        if (f3 < A042) {
            r3.A01 = A042;
            r3.A02 = (int) (((float) r3.A02) - (((C108945cZ.A03(view) * r3.A01) - f) / 2.0f));
        } else {
            r3.A00 = f3;
            r3.A04 = (int) (((float) r3.A04) - (((C108945cZ.A04(view) * r3.A00) - f2) / 2.0f));
        }
        C1600787a r6 = this.A05;
        MediaViewBaseFragment mediaViewBaseFragment = r3.A06;
        r3.A03 = C72453Mb.A08(mediaViewBaseFragment.A14());
        Drawable drawable = r3.A05;
        int[] A1W2 = C108945cZ.A1W();
        // fill-array-data instruction
        A1W2[0] = 0;
        A1W2[1] = 255;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(drawable, "alpha", A1W2);
        ofInt.setDuration(220);
        ofInt.setInterpolator(new AccelerateInterpolator());
        ofInt.start();
        AnonymousClass65h r11 = mediaViewBaseFragment.A09;
        r11.setPivotX(0.0f);
        r11.setPivotY(0.0f);
        r11.setScaleX(r3.A01);
        r11.setScaleY(r3.A00);
        r11.setTranslationX((float) r3.A02);
        r11.setTranslationY((float) r3.A04);
        View findViewWithTag = mediaViewBaseFragment.A09.findViewWithTag(mediaViewBaseFragment.A29());
        if (findViewWithTag != null) {
            findViewWithTag.setAlpha(0.0f);
            findViewWithTag.animate().setDuration(110).alpha(1.0f).setInterpolator(new DecelerateInterpolator(2.0f));
        }
        r11.animate().setDuration(220).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new C109105cp(r3, r6, 1));
        return true;
    }
}
