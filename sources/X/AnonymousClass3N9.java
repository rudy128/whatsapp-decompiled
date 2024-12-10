package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.whatsapp.settings.SettingsRowPrivacyLinearLayout;

/* renamed from: X.3N9  reason: invalid class name */
public class AnonymousClass3N9 extends Drawable {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public AnonymousClass3N9(AnonymousClass4XZ r2) {
        this.A02 = r2;
        this.A01 = AnonymousClass3MZ.A0A();
    }

    public void draw(Canvas canvas) {
        int A002;
        float f;
        float f2;
        switch (this.A00) {
            case 0:
                C110335fK r2 = (C110335fK) this.A02;
                if (r2.A00 > 0.0f) {
                    A002 = C19740yt.A00(r2.getContext(), 2131100284);
                    f = (float) (A002 >> 24);
                    f2 = r2.A00;
                    break;
                } else {
                    return;
                }
            case 1:
                AnonymousClass4XZ r4 = (AnonymousClass4XZ) this.A02;
                if (r4.A00 > 0.0f) {
                    C79073uJ r0 = r4.A0D;
                    A002 = AnonymousClass3MZ.A02(r0.getContext(), r0.getContext(), 2130969230, 2131100227);
                    f = (float) (A002 >> 24);
                    f2 = r4.A00;
                    break;
                } else {
                    return;
                }
            default:
                SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout = (SettingsRowPrivacyLinearLayout) this.A02;
                if (settingsRowPrivacyLinearLayout.A00 > 0.0f) {
                    A002 = AnonymousClass3MZ.A02(settingsRowPrivacyLinearLayout.getContext(), settingsRowPrivacyLinearLayout.getContext(), 2130971194, 2131102530);
                    f = (float) (A002 >> 24);
                    f2 = settingsRowPrivacyLinearLayout.A00;
                    break;
                } else {
                    return;
                }
        }
        int i = (A002 & 16777215) | (((int) (f * f2)) << 24);
        Paint paint = (Paint) this.A01;
        paint.setColor(i);
        canvas.drawRect(getBounds(), paint);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public AnonymousClass3N9(SettingsRowPrivacyLinearLayout settingsRowPrivacyLinearLayout) {
        this.A02 = settingsRowPrivacyLinearLayout;
        this.A01 = AnonymousClass3MZ.A0A();
    }

    public AnonymousClass3N9(C110335fK r2) {
        this.A02 = r2;
        this.A01 = AnonymousClass3MZ.A0A();
    }
}
