package X;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import com.whatsapp.camera.overlays.AutofocusOverlay;
import com.whatsapp.camera.overlays.ShutterOverlay;
import com.whatsapp.camera.overlays.ZoomOverlay;

/* renamed from: X.6pV  reason: invalid class name and case insensitive filesystem */
public class C133796pV {
    public final View A00;
    public final AutofocusOverlay A01;
    public final ShutterOverlay A02;
    public final C160978Av A03;
    public final ZoomOverlay A04;

    public void A00(float f, float f2) {
        AutofocusOverlay autofocusOverlay = this.A01;
        float f3 = autofocusOverlay.A00 / 2.0f;
        float f4 = f;
        float f5 = f2;
        autofocusOverlay.A01 = new RectF(f - f3, f2 - f3, f3 + f, f3 + f2);
        autofocusOverlay.A03 = null;
        autofocusOverlay.setVisibility(0);
        if (autofocusOverlay.A04) {
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.5f, 1.0f, 1.5f, 1.0f, 0, f4, 0, f5);
            scaleAnimation.setDuration(400);
            scaleAnimation.setInterpolator(new OvershootInterpolator());
            scaleAnimation.setFillAfter(true);
            autofocusOverlay.startAnimation(scaleAnimation);
        }
        autofocusOverlay.invalidate();
        autofocusOverlay.removeCallbacks(autofocusOverlay.A07);
    }

    public void A01(boolean z, boolean z2) {
        long j;
        AutofocusOverlay autofocusOverlay = this.A01;
        autofocusOverlay.A03 = Boolean.valueOf(z);
        autofocusOverlay.invalidate();
        Runnable runnable = autofocusOverlay.A07;
        if (z2) {
            j = 0;
        } else {
            j = 1000;
        }
        autofocusOverlay.postDelayed(runnable, j);
    }

    public C133796pV(ViewGroup viewGroup, C160978Av r6, boolean z) {
        this.A03 = r6;
        this.A00 = AnonymousClass3MX.A0A(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624485);
        AutofocusOverlay autofocusOverlay = (AutofocusOverlay) AnonymousClass1HF.A06(viewGroup, 2131427932);
        this.A01 = autofocusOverlay;
        this.A04 = (ZoomOverlay) AnonymousClass1HF.A06(viewGroup, 2131437108);
        ShutterOverlay shutterOverlay = (ShutterOverlay) AnonymousClass1HF.A06(viewGroup, 2131435444);
        this.A02 = shutterOverlay;
        if (z) {
            Paint paint = shutterOverlay.A03;
            C108945cZ.A1L(paint);
            paint.setColor(-16777216);
        }
        autofocusOverlay.A04 = z;
        if (z) {
            autofocusOverlay.A06.setStrokeWidth(autofocusOverlay.getResources().getDimension(2131165408));
            autofocusOverlay.A00 = autofocusOverlay.getResources().getDimension(2131165406);
        }
    }
}
