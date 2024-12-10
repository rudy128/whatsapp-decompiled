package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.smartcapture.ui.CaptureOverlayFragment;
import com.facebook.smartcapture.view.IdCaptureActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.CxO  reason: case insensitive filesystem */
public class C26305CxO implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C26305CxO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onAnimationEnd(Animator animator) {
        C28510E4u e4u;
        if (this.A00 != 0) {
            WeakReference weakReference = ((CaptureOverlayFragment) this.A01).A00;
            if (weakReference != null && (e4u = (C28510E4u) weakReference.get()) != null) {
                C26805DEn dEn = ((IdCaptureActivity) e4u).A03;
                if (dEn == null) {
                    C18070vi.A11("presenter");
                    throw null;
                }
                dEn.A04 = AnonymousClass00R.A03;
                C26805DEn.A00(dEn, true);
                return;
            }
            return;
        }
        C22645BHh bHh = (C22645BHh) this.A01;
        C23679Bnm bnm = bHh.A03;
        ViewParent parent = bnm.getParent();
        C18070vi.A0z(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) parent).removeView(bnm);
        ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(bnm);
        A0P.leftMargin = 0;
        A0P.topMargin = 0;
        bnm.setRenderResult(bHh.A01, bHh.A02);
        bnm.setScaleX(1.0f);
        bnm.setScaleY(1.0f);
        if (!bHh.A04) {
            bHh.A04 = true;
            bHh.addView(bnm);
            bHh.requestLayout();
        }
    }

    public void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            C22645BHh bHh = (C22645BHh) this.A01;
            if (bHh.A00 != null) {
                if (bHh.A04) {
                    bHh.A04 = false;
                    bHh.removeView(bHh.A03);
                    bHh.requestLayout();
                }
                View rootView = bHh.getRootView();
                if (rootView instanceof ViewGroup) {
                    C23679Bnm bnm = bHh.A03;
                    bnm.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
                    ((ViewGroup) rootView).addView(bnm);
                    return;
                }
                throw AnonymousClass000.A0n("Root view is not a ViewGroup");
            }
            bHh.A05 = true;
        }
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationRepeat(Animator animator) {
    }
}
