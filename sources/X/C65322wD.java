package X;

import android.widget.ImageView;

/* renamed from: X.2wD  reason: invalid class name and case insensitive filesystem */
public class C65322wD implements C43091zF {
    public final int A00;
    public final Object A01;

    public C65322wD(AnonymousClass17O r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public /* synthetic */ void C64(C43191zP r4) {
        if (2 - this.A00 == 0) {
            AnonymousClass17O r2 = (AnonymousClass17O) this.A01;
            C43191zP r0 = r2.A05;
            if (r0 != null) {
                r0.A04.remove(this);
            }
            C43191zP r1 = r2.A05;
            if (r1 != null) {
                r1.A03 = r2.A07;
            }
        }
    }

    public void C65(C43191zP r11) {
        Integer num;
        double d;
        switch (this.A00) {
            case 0:
                if (r11 != null) {
                    AnonymousClass17O r4 = (AnonymousClass17O) this.A01;
                    float f = ((float) r11.A07.A00) * 180.0f;
                    float abs = Math.abs(f) % 360.0f;
                    if (abs < 90.0f || abs > 270.0f) {
                        num = AnonymousClass00R.A00;
                    } else {
                        num = AnonymousClass00R.A01;
                    }
                    ImageView imageView = r4.A03;
                    if (imageView != null) {
                        if (num.intValue() != 0) {
                            imageView.setImageBitmap(r4.A01);
                            f -= 180.0f;
                        } else {
                            imageView.setImageBitmap(r4.A02);
                        }
                        imageView.setRotationY(f);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (r11 != null) {
                    d = r11.A07.A00;
                } else {
                    d = 1.0d;
                }
                double d2 = 1.0d + (((d - 0.0d) / (1.0d - 0.0d)) * (0.8999999761581421d - 1.0d));
                ImageView imageView2 = ((AnonymousClass17O) this.A01).A03;
                if (imageView2 != null) {
                    float f2 = (float) d2;
                    imageView2.setScaleX(f2);
                    imageView2.setScaleY(f2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
