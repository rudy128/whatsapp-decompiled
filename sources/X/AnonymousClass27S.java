package X;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: X.27S  reason: invalid class name */
public abstract class AnonymousClass27S extends C39171sd {
    public boolean A00;
    public boolean A01;

    public abstract void A09(BJP bjp, int i, int i2);

    public void A06(AttributeSet attributeSet) {
        super.A06(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C39121sW.A01);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.A01 = true;
                } else if (index == 13) {
                    this.A00 = true;
                }
            }
        }
    }

    public void onAttachedToWindow() {
        ViewParent parent;
        super.onAttachedToWindow();
        if ((this.A01 || this.A00) && (parent = getParent()) != null && (parent instanceof ConstraintLayout)) {
            ConstraintLayout constraintLayout = (ConstraintLayout) parent;
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.A00; i++) {
                View view = (View) constraintLayout.A05.get(this.A05[i]);
                if (view != null) {
                    if (this.A01) {
                        view.setVisibility(visibility);
                    }
                    if (this.A00 && elevation > 0.0f) {
                        view.setTranslationZ(view.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public void setElevation(float f) {
        super.setElevation(f);
        A05();
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        A05();
    }
}
