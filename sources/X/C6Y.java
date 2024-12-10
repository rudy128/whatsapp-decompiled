package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import java.lang.ref.WeakReference;

public abstract class C6Y {
    public Animatable2.AnimationCallback A00;

    public void A01(Drawable drawable) {
        View A0O;
        C22716BMd bMd = (C22716BMd) this;
        switch (bMd.A00) {
            case 0:
                ColorStateList colorStateList = ((MaterialCheckBox) bMd.A01).A02;
                if (colorStateList != null) {
                    C27831Xu.A03(colorStateList, drawable);
                    return;
                }
                return;
            case 1:
                CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) bMd.A01;
                circularProgressIndicator.setIndeterminate(false);
                circularProgressIndicator.A01(circularProgressIndicator.A00, circularProgressIndicator.A06);
                return;
            case 2:
                CircularProgressIndicator circularProgressIndicator2 = (CircularProgressIndicator) bMd.A01;
                if (!circularProgressIndicator2.A04) {
                    circularProgressIndicator2.setVisibility(circularProgressIndicator2.A01);
                    return;
                }
                return;
            default:
                C59492mO r1 = (C59492mO) bMd.A01;
                C454028v r0 = r1.A00;
                if (r0 != null) {
                    r0.start();
                }
                WeakReference weakReference = r1.A02;
                if (weakReference != null && (A0O = C108945cZ.A0O(weakReference)) != null) {
                    A0O.invalidate();
                    return;
                }
                return;
        }
    }

    public void A02(Drawable drawable) {
    }

    public Animatable2.AnimationCallback A00() {
        Animatable2.AnimationCallback animationCallback = this.A00;
        if (animationCallback != null) {
            return animationCallback;
        }
        BEv bEv = new BEv(this);
        this.A00 = bEv;
        return bEv;
    }
}
