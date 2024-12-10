package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.transition.Transition;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.whatsapp.mediacomposer.ImageComposerFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import com.whatsapp.mediacomposer.MediaComposerFragment;

/* renamed from: X.5tZ  reason: invalid class name and case insensitive filesystem */
public class C115205tZ extends C1419277m {
    public final int A00;
    public final Object A01;

    public C115205tZ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onTransitionEnd(Transition transition) {
        C127446eN r5;
        C135806sn A2A;
        if (this.A00 != 0) {
            ((C1600787a) this.A01).C9F(false);
            return;
        }
        MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) this.A01;
        MediaComposerFragment A0d = MediaComposerActivity.A0d(mediaComposerActivity);
        if (!(A0d instanceof ImageComposerFragment) || (r5 = mediaComposerActivity.A0e) == null) {
            MediaComposerActivity.A1B(mediaComposerActivity, A0d);
            return;
        }
        MediaComposerActivity mediaComposerActivity2 = r5.A01.A00;
        MediaComposerFragment A0d2 = MediaComposerActivity.A0d(mediaComposerActivity2);
        if (A0d2 == null || (A2A = A0d2.A2A()) == null || A2A.equals(C124396Ye.A00)) {
            MediaComposerActivity.A1B(mediaComposerActivity2, MediaComposerActivity.A0d(mediaComposerActivity2));
            return;
        }
        View view = r5.A00;
        Property property = View.SCALE_X;
        float[] fArr = new float[2];
        fArr[0] = 1.0f;
        float f = A2A.A03;
        ObjectAnimator A0C = C108945cZ.A0C(property, view, fArr, f, 1);
        Property property2 = View.SCALE_Y;
        float[] fArr2 = new float[2];
        fArr2[0] = 1.0f;
        ObjectAnimator A0C2 = C108945cZ.A0C(property2, view, fArr2, f, 1);
        Property property3 = View.ROTATION;
        float[] fArr3 = new float[2];
        fArr3[0] = 0.0f;
        ObjectAnimator A0C3 = C108945cZ.A0C(property3, view, fArr3, A2A.A02, 1);
        Property property4 = View.TRANSLATION_X;
        float[] fArr4 = new float[2];
        fArr4[0] = 0.0f;
        ObjectAnimator A0C4 = C108945cZ.A0C(property4, view, fArr4, A2A.A00, 1);
        Property property5 = View.TRANSLATION_Y;
        float[] fArr5 = new float[2];
        fArr5[0] = 0.0f;
        ObjectAnimator A0C5 = C108945cZ.A0C(property5, view, fArr5, A2A.A01, 1);
        AnimatorSet A0B = C108945cZ.A0B();
        Animator[] A1Z = C108945cZ.A1Z(A0C, A0C2, 5, 0);
        A1Z[2] = A0C3;
        A1Z[3] = A0C4;
        A1Z[4] = A0C5;
        A0B.playTogether(A1Z);
        A0B.setDuration(150);
        A0B.setInterpolator(new AccelerateDecelerateInterpolator());
        C109195cy.A02(A0B, r5, 16);
        A0B.start();
    }

    public void onTransitionStart(Transition transition) {
        if (this.A00 != 0) {
            super.onTransitionStart(transition);
            return;
        }
        MediaComposerFragment A0d = MediaComposerActivity.A0d((MediaComposerActivity) this.A01);
        if (A0d != null) {
            A0d.A2E();
        }
    }
}
