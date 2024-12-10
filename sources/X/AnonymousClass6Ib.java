package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.EditText;

/* renamed from: X.6Ib  reason: invalid class name */
public final class AnonymousClass6Ib extends C89564cf {
    public boolean A00;
    public final EditText A01;
    public final ViewGroup A02;

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        GradientDrawable gradientDrawable;
        if (this.A02.getVisibility() != 0) {
            EditText editText = this.A01;
            boolean z = true;
            if (editText.getLineCount() <= 1) {
                z = false;
            }
            if (this.A00 != z) {
                Resources resources = editText.getResources();
                int i4 = 2131168775;
                if (z) {
                    i4 = 2131168774;
                }
                C108985cd.A0z(editText, resources.getDimensionPixelSize(i4));
                Drawable background = editText.getBackground();
                if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                    Resources resources2 = editText.getResources();
                    int i5 = 2131168781;
                    if (z) {
                        i5 = 2131168777;
                    }
                    gradientDrawable.setCornerRadius(AnonymousClass3MW.A00(resources2, i5));
                    editText.setBackground(gradientDrawable);
                }
                this.A00 = z;
            }
        }
    }

    public AnonymousClass6Ib(ViewGroup viewGroup, EditText editText) {
        this.A02 = viewGroup;
        this.A01 = editText;
    }
}
