package X;

import android.graphics.drawable.Drawable;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaImageView;

/* renamed from: X.5gD  reason: invalid class name and case insensitive filesystem */
public final class C110555gD extends LinearLayout {
    public TextView A00;
    public TextView A01;
    public WaImageView A02;

    public final void setIconDrawableRes(Drawable drawable) {
        WaImageView waImageView = this.A02;
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        waImageView.setVisibility(i);
        if (drawable != null) {
            waImageView.setImageDrawable(drawable);
        }
    }

    public final void setSecondaryText(String str) {
        setText(str, this.A01);
    }

    public final void setSecondaryTextSize(float f) {
        this.A01.setTextSize(f);
    }

    public final void setText(String str) {
        setText(str, this.A00);
    }

    private final void setText(String str, TextView textView) {
        int i = 0;
        if (str == null) {
            i = 8;
        }
        textView.setVisibility(i);
        if (str != null) {
            textView.setText(str);
        }
    }
}
