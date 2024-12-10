package X;

import android.graphics.drawable.Animatable;
import android.widget.ImageView;

/* renamed from: X.BIg  reason: case insensitive filesystem */
public final class C22656BIg extends ImageView {
    public Animatable A00;
    public boolean A01;

    public void onAttachedToWindow() {
        Animatable animatable;
        super.onAttachedToWindow();
        if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            Animatable animatable2 = this.A00;
            C18070vi.A0b(animatable2);
            animatable2.start();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animatable animatable = this.A00;
        if (animatable != null && animatable.isRunning()) {
            Animatable animatable2 = this.A00;
            C18070vi.A0b(animatable2);
            animatable2.stop();
        }
    }

    public void setVisibility(int i) {
        Animatable animatable;
        super.setVisibility(i);
        if (getVisibility() != 0) {
            Animatable animatable2 = this.A00;
            if (animatable2 != null && animatable2.isRunning()) {
                Animatable animatable3 = this.A00;
                C18070vi.A0b(animatable3);
                animatable3.stop();
            }
        } else if (this.A01 && (animatable = this.A00) != null && !animatable.isRunning()) {
            Animatable animatable4 = this.A00;
            C18070vi.A0b(animatable4);
            animatable4.start();
        }
    }
}
