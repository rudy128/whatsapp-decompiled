package X;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

/* renamed from: X.Cte  reason: case insensitive filesystem */
public abstract class C26165Cte {
    public static ImageView.ScaleType A00(int i) {
        if (i == 0) {
            return ImageView.ScaleType.FIT_XY;
        }
        if (i == 1) {
            return ImageView.ScaleType.FIT_START;
        }
        if (i == 2) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        if (i == 3) {
            return ImageView.ScaleType.FIT_END;
        }
        if (i == 5) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i != 6) {
            return ImageView.ScaleType.CENTER;
        }
        return ImageView.ScaleType.CENTER_INSIDE;
    }

    public static void A04(CheckableImageButton checkableImageButton) {
        if (Build.VERSION.SDK_INT <= 22) {
            checkableImageButton.setBackground(CBQ.A00(checkableImageButton.getContext(), (int) AnonymousClass1YU.A00(checkableImageButton.getContext(), 4)));
        }
    }

    public static void A01(ColorStateList colorStateList, PorterDuff.Mode mode, CheckableImageButton checkableImageButton, TextInputLayout textInputLayout) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = BE7.A0E(drawable);
            if (colorStateList == null || !colorStateList.isStateful()) {
                C27831Xu.A03(colorStateList, drawable);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int length2 = drawableState2.length;
                int[] copyOf = Arrays.copyOf(drawableState, length + length2);
                System.arraycopy(drawableState2, 0, copyOf, length, length2);
                C27831Xu.A03(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())), drawable);
            }
            if (mode != null) {
                C27831Xu.A07(mode, drawable);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void A02(ColorStateList colorStateList, CheckableImageButton checkableImageButton, TextInputLayout textInputLayout) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int length2 = drawableState2.length;
            int[] copyOf = Arrays.copyOf(drawableState, length + length2);
            System.arraycopy(drawableState2, 0, copyOf, length, length2);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable A0E = BE7.A0E(drawable);
            C27831Xu.A03(ColorStateList.valueOf(colorForState), A0E);
            checkableImageButton.setImageDrawable(A0E);
        }
    }

    public static void A03(View.OnLongClickListener onLongClickListener, CheckableImageButton checkableImageButton) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = false;
        int i = 1;
        boolean A1W = AnonymousClass000.A1W(onLongClickListener);
        if (hasOnClickListeners || A1W) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.A01 = hasOnClickListeners;
        checkableImageButton.setLongClickable(A1W);
        if (!z) {
            i = 2;
        }
        checkableImageButton.setImportantForAccessibility(i);
    }
}
