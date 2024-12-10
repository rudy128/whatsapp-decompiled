package X;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.whatsapp.util.Log;

/* renamed from: X.4VN  reason: invalid class name */
public class AnonymousClass4VN {
    public int A00 = 0;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public final C18000vb A03;

    public float A01(Resources.Theme theme, Resources resources) {
        return A02(theme, resources, this.A00);
    }

    public float A02(Resources.Theme theme, Resources resources, int i) {
        int i2;
        float f;
        if (this.A02 == 0.0f) {
            float f2 = resources.getDisplayMetrics().scaledDensity;
            if (theme != null) {
                f = resources.getDimension(2131169432);
                try {
                    TypedValue typedValue = new TypedValue();
                    theme.resolveAttribute(2130971887, typedValue, true);
                    int i3 = typedValue.data;
                    if (i3 != -1) {
                        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i3, new int[]{16842901});
                        C18070vi.A0X(obtainStyledAttributes);
                        try {
                            f = obtainStyledAttributes.getDimension(0, f);
                        } finally {
                            obtainStyledAttributes.recycle();
                        }
                    }
                } catch (Resources.NotFoundException e) {
                    Log.e("TypographyUtils/getTextStyleFromThemeStyle/resource not found", e);
                }
            } else {
                C17960vV.A0F(false, "ConversationFont/getTextSizeFromThemeStyle theme passed should be nonnull to ensure consistency in font size");
                f = resources.getDimension(2131169432);
            }
            this.A02 = f / f2;
        }
        if (i == -1) {
            i2 = -2;
        } else {
            i2 = 0;
            if (i == 1) {
                i2 = 4;
            }
        }
        C18000vb r2 = this.A03;
        if (r2.A05().equals("ar") || r2.A05().equals("fa")) {
            i2++;
        }
        return this.A02 + ((float) i2);
    }

    public float A03(Resources resources) {
        float f = this.A01;
        if (f == 0.0f) {
            f = resources.getDimension(2131166183) / resources.getDisplayMetrics().scaledDensity;
            this.A01 = f;
        }
        int i = this.A00;
        int i2 = -2;
        if (i != -1) {
            i2 = 0;
            if (i == 1) {
                i2 = 4;
            }
        }
        return f + ((float) i2);
    }

    public AnonymousClass4VN(C18000vb r2) {
        this.A03 = r2;
    }

    public float A00(Resources.Theme theme, Resources resources) {
        return (A01(theme, resources) * 24.0f) / 27.0f;
    }
}
