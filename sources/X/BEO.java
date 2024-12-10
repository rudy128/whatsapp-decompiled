package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.util.Property;
import android.view.View;

public class BEO extends AnimatorListenerAdapter {
    public Matrix A00 = C108945cZ.A0J();
    public boolean A01;
    public final /* synthetic */ Matrix A02;
    public final /* synthetic */ View A03;
    public final /* synthetic */ CS7 A04;
    public final /* synthetic */ C25803CmG A05;
    public final /* synthetic */ BMV A06;
    public final /* synthetic */ boolean A07;

    public void onAnimationCancel(Animator animator) {
        this.A01 = true;
    }

    public BEO(Matrix matrix, View view, CS7 cs7, C25803CmG cmG, BMV bmv, boolean z) {
        this.A06 = bmv;
        this.A07 = z;
        this.A02 = matrix;
        this.A03 = view;
        this.A05 = cmG;
        this.A04 = cs7;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.A01) {
            if (this.A07) {
                Matrix matrix = this.A02;
                Matrix matrix2 = this.A00;
                matrix2.set(matrix);
                View view = this.A03;
                view.setTag(2131436427, matrix2);
                this.A05.A01(view);
            } else {
                View view2 = this.A03;
                view2.setTag(2131436427, (Object) null);
                view2.setTag(2131433423, (Object) null);
            }
        }
        View view3 = this.A03;
        C25446Cfx.A02.A01((Matrix) null, view3);
        this.A05.A01(view3);
    }

    public void onAnimationPause(Animator animator) {
        Matrix matrix = this.A04.A02;
        Matrix matrix2 = this.A00;
        matrix2.set(matrix);
        View view = this.A03;
        view.setTag(2131436427, matrix2);
        this.A05.A01(view);
    }

    public void onAnimationResume(Animator animator) {
        View view = this.A03;
        Property property = BMV.A01;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        AnonymousClass1Xr.A03(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }
}
