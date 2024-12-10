package X;

import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.whatsapp.calling.views.VoipCallControlRingingDotsIndicator;

/* renamed from: X.3Ob  reason: invalid class name */
public final class AnonymousClass3Ob extends Animation {
    public final float A00 = 0.14f;
    public final float A01 = 0.66f;
    public final int A02 = 800;
    public final int A03 = 100;
    public final VoipCallControlRingingDotsIndicator A04;

    public void applyTransformation(float f, Transformation transformation) {
        VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator;
        int i = 0;
        do {
            int duration = ((int) (((float) getDuration()) * f)) - (this.A03 * (i + 1));
            int i2 = this.A02;
            int i3 = i2 / 2;
            float f2 = (float) duration;
            if (duration > i3) {
                f2 = ((float) i2) - ((float) duration);
            }
            float f3 = f2 / ((float) i3);
            if (f3 < 0.0f) {
                f3 = 0.0f;
            } else if (f3 > 1.0f) {
                f3 = 1.0f;
            }
            voipCallControlRingingDotsIndicator = this.A04;
            float f4 = this.A00;
            float f5 = f4 + ((this.A01 - f4) * f3);
            if (i >= 0) {
                voipCallControlRingingDotsIndicator.A04[i] = f5;
            }
            i++;
        } while (i < 3);
        voipCallControlRingingDotsIndicator.invalidate();
    }

    public AnonymousClass3Ob(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator) {
        this.A04 = voipCallControlRingingDotsIndicator;
        setDuration(1500);
        setInterpolator(new LinearInterpolator());
    }

    public AnonymousClass3Ob(VoipCallControlRingingDotsIndicator voipCallControlRingingDotsIndicator, float f, float f2, int i, int i2, int i3) {
        this.A04 = voipCallControlRingingDotsIndicator;
        setDuration(1500);
        setInterpolator(new LinearInterpolator());
    }
}
