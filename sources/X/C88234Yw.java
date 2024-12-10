package X;

import android.view.View;
import android.view.animation.LinearInterpolator;

/* renamed from: X.4Yw  reason: invalid class name and case insensitive filesystem */
public abstract class C88234Yw {
    public static final float A00(int i) {
        if (i < 0) {
            i = 0;
        } else if (i > 3) {
            i = 3;
        } else if (i == 1) {
            return 270.0f;
        }
        if (i != 3) {
            return 90.0f * ((float) i);
        }
        return 90.0f;
    }

    public static final void A02(View view, Long l, float f) {
        C18070vi.A0d(view, 0);
        float rotation = view.getRotation() % 360.0f;
        if (rotation < 0.0f) {
            rotation += 360.0f;
        }
        float f2 = f % 360.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        }
        if (!(rotation == f2 || l == null)) {
            long longValue = l.longValue();
            if (longValue > 0) {
                AnonymousClass1D6 A01 = A01(rotation, f2);
                float A04 = AnonymousClass000.A04(A01.first);
                float A042 = AnonymousClass000.A04(A01.second);
                view.setRotation(A04);
                view.animate().rotation(A042).setDuration(longValue).setInterpolator(new LinearInterpolator()).start();
                return;
            }
        }
        view.setRotation(f2);
    }

    public static final AnonymousClass1D6 A01(float f, float f2) {
        Float valueOf = Float.valueOf(360.0f);
        if (f == 0.0f && f2 == 270.0f) {
            return AnonymousClass1D6.A01(valueOf, Float.valueOf(f2));
        }
        if (f == 270.0f && f2 == 0.0f) {
            return AnonymousClass1D6.A01(Float.valueOf(f), valueOf);
        }
        return AnonymousClass1D6.A01(Float.valueOf(f), Float.valueOf(f2));
    }
}
