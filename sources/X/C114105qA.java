package X;

import android.widget.ImageButton;

/* renamed from: X.5qA  reason: invalid class name and case insensitive filesystem */
public class C114105qA extends AnonymousClass7B6 {
    public final float A00;
    public final float A01;
    public final /* synthetic */ AnonymousClass72I A02;

    public void C65(C43191zP r6) {
        C18070vi.A0d(r6, 0);
        float f = (float) r6.A07.A00;
        AnonymousClass72I r3 = this.A02;
        ImageButton imageButton = r3.A00;
        imageButton.setScaleX(f);
        imageButton.setScaleY(f);
        AnonymousClass72I.A01(r3, Math.max((int) A00(r6, 0.0f, 76.0f), 0));
    }

    public C114105qA(AnonymousClass72I r1, float f, float f2) {
        this.A02 = r1;
        this.A01 = f;
        this.A00 = f2;
    }

    public final double A00(C43191zP r11, float f, float f2) {
        float f3 = this.A01;
        float f4 = this.A00;
        float min = Math.min(f3, f4);
        float max = Math.max(f3, f4);
        double d = (double) min;
        double d2 = (double) f;
        return d2 + (((r11.A07.A00 - d) / (((double) max) - d)) * (((double) f2) - d2));
    }
}
