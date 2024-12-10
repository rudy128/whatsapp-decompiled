package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

public final class BIi extends ImageView {
    public boolean A00;
    public final ObjectAnimator A01;

    public BIi(Context context) {
        super(context);
        float[] A1V = C108945cZ.A1V();
        // fill-array-data instruction
        A1V[0] = 0;
        A1V[1] = 1135869952;
        ObjectAnimator duration = ObjectAnimator.ofFloat(this, "rotation", A1V).setDuration(850);
        C18070vi.A0X(duration);
        this.A01 = duration;
        duration.setRepeatMode(1);
        duration.setRepeatCount(-1);
        duration.setInterpolator(new LinearInterpolator());
        AnonymousClass3MX.A1B(context, this, 2131233012);
    }

    public void onDetachedFromWindow() {
        this.A00 = false;
        this.A01.cancel();
        super.onDetachedFromWindow();
    }

    public void onVisibilityChanged(View view, int i) {
        C18070vi.A0d(view, 0);
        super.onVisibilityChanged(view, i);
        if (getWindowToken() == null) {
            return;
        }
        if (i != 0 || getVisibility() != 0) {
            this.A01.cancel();
            this.A00 = false;
        } else if (getAnimation() != null) {
        } else {
            if (getMeasuredWidth() != 0) {
                this.A01.start();
            } else {
                this.A00 = true;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            this.A01.start();
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A00) {
            this.A01.start();
            this.A00 = false;
        }
    }
}
