package X;

import android.view.animation.Animation;
import com.whatsapp.WaTextView;
import com.whatsapp.mediacomposer.doodle.titlebar.TitleBarView;
import com.whatsapp.wabloks.base.BkFcsPreloadingScreenFragment;
import java.util.Queue;

/* renamed from: X.79D  reason: invalid class name */
public class AnonymousClass79D implements Animation.AnimationListener {
    public final int A00;
    public final Object A01;

    public AnonymousClass79D(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animation animation) {
        if (this.A00 != 0) {
            C128046fM r2 = (C128046fM) ((BkFcsPreloadingScreenFragment) this.A01).A08.get();
            r2.A00 = false;
            while (true) {
                Queue queue = r2.A01;
                if (!queue.isEmpty()) {
                    C108945cZ.A1P(queue.remove());
                } else {
                    return;
                }
            }
        } else {
            TitleBarView titleBarView = (TitleBarView) this.A01;
            WaTextView waTextView = titleBarView.A0F;
            if (waTextView != null) {
                waTextView.setAlpha(0.0f);
                WaTextView waTextView2 = titleBarView.A0F;
                if (waTextView2 != null) {
                    waTextView2.setVisibility(8);
                    return;
                }
            }
            C18070vi.A11("mediaQualityToolTip");
            throw null;
        }
    }

    public void onAnimationRepeat(Animation animation) {
    }

    public void onAnimationStart(Animation animation) {
    }
}
