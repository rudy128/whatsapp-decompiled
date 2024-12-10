package X;

import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* renamed from: X.69F  reason: invalid class name */
public final class AnonymousClass69F extends AnonymousClass69G {
    public ImageView.ScaleType getDefaultScaleType() {
        return ImageView.ScaleType.FIT_CENTER;
    }

    public void setImageDrawable(Drawable drawable) {
        if (!isSelected() && !isPressed()) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            if (drawable != null) {
                drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            }
        }
        super.setImageDrawable(drawable);
    }

    public void setSelected(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float f;
        super.setSelected(z);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof LinearLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            marginLayoutParams = AnonymousClass3Ma.A0D();
        }
        Resources A0Y = AnonymousClass000.A0Y(this);
        if (!z) {
            int dimensionPixelSize = A0Y.getDimensionPixelSize(2131168774);
            int dimensionPixelSize2 = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168777);
            setMaxWidth(AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168913));
            marginLayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, 0);
            f = 0.6f;
        } else {
            setMaxWidth(A0Y.getDimensionPixelSize(2131168912));
            marginLayoutParams.setMargins(0, 0, 0, 0);
            f = 1.0f;
        }
        setAlpha(f);
        this.A02 = getMaxWidth();
        setLayoutParams(marginLayoutParams);
    }
}
