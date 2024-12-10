package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.whatsapp.webpagepreview.WebPagePreviewView;

/* renamed from: X.3Mi  reason: invalid class name and case insensitive filesystem */
public class C72513Mi extends AnimatorListenerAdapter {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ WebPagePreviewView A02;

    public C72513Mi(View view, WebPagePreviewView webPagePreviewView, float f) {
        this.A02 = webPagePreviewView;
        this.A00 = f;
        this.A01 = view;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.A00 == 0.0f) {
            View view = this.A01;
            view.setVisibility(8);
            view.setAlpha(1.0f);
        }
    }

    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        if (this.A00 == 1.0f) {
            this.A01.setVisibility(0);
        }
    }
}
