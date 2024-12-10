package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.biz.catalog.view.widgets.QuantitySelector;

public class A9F implements ValueAnimator.AnimatorUpdateListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public A9F(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i2;
        this.A03 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        int i2;
        QuantitySelector quantitySelector;
        switch (this.A00) {
            case 0:
                quantitySelector = (QuantitySelector) this.A03;
                int i3 = this.A01;
                i2 = this.A02;
                i = AnonymousClass000.A0M(valueAnimator.getAnimatedValue());
                if (i == i3) {
                    quantitySelector.A0B = true;
                }
                ViewGroup.LayoutParams layoutParams = quantitySelector.getLayoutParams();
                layoutParams.width = i;
                quantitySelector.setLayoutParams(layoutParams);
                int measuredWidth = quantitySelector.A0H.getMeasuredWidth();
                TextView textView = quantitySelector.A0F;
                if (i > i3 + (textView.getMeasuredWidth() * 2) + (((measuredWidth - textView.getMeasuredWidth()) / 2) / 2)) {
                    QuantitySelector.A02(quantitySelector);
                    break;
                }
                break;
            case 1:
                quantitySelector = (QuantitySelector) this.A03;
                int i4 = this.A01;
                i2 = this.A02;
                i = AnonymousClass000.A0M(valueAnimator.getAnimatedValue());
                if (i == i4) {
                    quantitySelector.A0B = true;
                }
                ViewGroup.LayoutParams layoutParams2 = quantitySelector.getLayoutParams();
                layoutParams2.width = i;
                quantitySelector.setLayoutParams(layoutParams2);
                TextView textView2 = quantitySelector.A0F;
                if (i < (textView2.getMeasuredWidth() * 2) + i2 + (((i2 - textView2.getMeasuredWidth()) / 2) / 2)) {
                    QuantitySelector.A01(quantitySelector);
                    break;
                }
                break;
            default:
                int i5 = this.A01;
                int i6 = this.A02;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                ((ViewGroup.MarginLayoutParams) this.A03).setMargins(0, (int) ((animatedFraction * ((float) i5)) + ((1.0f - animatedFraction) * ((float) i6))), 0, 0);
                return;
        }
        if (i == i2) {
            quantitySelector.A0B = false;
            quantitySelector.A02.removeAllUpdateListeners();
        }
    }
}
