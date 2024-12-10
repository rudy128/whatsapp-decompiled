package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.5cu  reason: invalid class name and case insensitive filesystem */
public class C109155cu extends AnimatorListenerAdapter {
    public final float A00;
    public final int A01;
    public final Object A02;

    public C109155cu(Object obj, float f, int i) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    public void onAnimationCancel(Animator animator) {
        if (this.A01 != 0) {
            ((C1407973c) this.A02).A0D.setAlpha(this.A00);
            onAnimationEnd(animator);
            return;
        }
        ((View) this.A02).setX(this.A00);
    }

    public void onAnimationEnd(Animator animator) {
        if (this.A01 == 0) {
            ((View) this.A02).setX(this.A00);
        } else if (this.A00 == 0.0f) {
            C1407973c r3 = (C1407973c) this.A02;
            r3.A0D.setVisibility(8);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0H;
            C131796lg r0 = voipCallControlBottomSheetV2.A0b;
            if (r0 != null) {
                r0.A00(false);
            }
            VoipCallControlBottomSheetV2.A05(voipCallControlBottomSheetV2, 0.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        if (1 - this.A01 != 0) {
            super.onAnimationStart(animator);
        } else if (this.A00 == 1.0f) {
            C1407973c r3 = (C1407973c) this.A02;
            r3.A0D.setVisibility(0);
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = r3.A0H;
            C131796lg r0 = voipCallControlBottomSheetV2.A0b;
            if (r0 != null) {
                r0.A00(true);
            }
            VoipCallControlBottomSheetV2.A05(voipCallControlBottomSheetV2, 1.0f);
        }
    }
}
