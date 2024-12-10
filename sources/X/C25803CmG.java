package X;

import android.util.Property;
import android.view.View;

/* renamed from: X.CmG  reason: case insensitive filesystem */
public class C25803CmG {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;

    public void A01(View view) {
        float f = this.A05;
        float f2 = this.A06;
        float f3 = this.A07;
        float f4 = this.A03;
        float f5 = this.A04;
        float f6 = this.A00;
        float f7 = this.A01;
        float f8 = this.A02;
        Property property = BMV.A01;
        view.setTranslationX(f);
        view.setTranslationY(f2);
        AnonymousClass1Xr.A03(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C25803CmG)) {
            return false;
        }
        C25803CmG cmG = (C25803CmG) obj;
        if (cmG.A05 == this.A05 && cmG.A06 == this.A06 && cmG.A07 == this.A07 && cmG.A03 == this.A03 && cmG.A04 == this.A04 && cmG.A00 == this.A00 && cmG.A01 == this.A01 && cmG.A02 == this.A02) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        float f = this.A05;
        int i = 0;
        float f2 = this.A06;
        float f3 = this.A07;
        float f4 = this.A03;
        float f5 = this.A04;
        float f6 = this.A00;
        float f7 = this.A01;
        int A072 = ((((((((((((BE9.A07((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)), f) * 31) + BE9.A07((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1)), f2)) * 31) + BE9.A07((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1)), f3)) * 31) + BE9.A07((f4 > 0.0f ? 1 : (f4 == 0.0f ? 0 : -1)), f4)) * 31) + BE9.A07((f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1)), f5)) * 31) + BE9.A07((f6 > 0.0f ? 1 : (f6 == 0.0f ? 0 : -1)), f6)) * 31) + BE9.A07((f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1)), f7)) * 31;
        float f8 = this.A02;
        if (f8 != 0.0f) {
            i = Float.floatToIntBits(f8);
        }
        return A072 + i;
    }

    public C25803CmG(View view) {
        this.A05 = view.getTranslationX();
        this.A06 = view.getTranslationY();
        this.A07 = A00(view);
        this.A03 = view.getScaleX();
        this.A04 = view.getScaleY();
        this.A00 = view.getRotationX();
        this.A01 = view.getRotationY();
        this.A02 = view.getRotation();
    }

    public static float A00(View view) {
        return view.getTranslationZ();
    }
}
