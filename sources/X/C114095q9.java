package X;

import android.widget.ImageView;

/* renamed from: X.5q9  reason: invalid class name and case insensitive filesystem */
public class C114095q9 extends AnonymousClass7B6 {
    public final int A00;
    public final /* synthetic */ AnonymousClass70F A01;

    public C114095q9(AnonymousClass70F r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public void C65(C43191zP r12) {
        C43201zQ r10 = r12.A07;
        double d = 1.0d - 0.0d;
        float f = (float) (0.5d + (((r10.A00 - 0.0d) / d) * (1.0d - 0.5d)));
        AnonymousClass70F r7 = this.A01;
        ImageView imageView = r7.A0O;
        imageView.setScaleX(f);
        imageView.setScaleY(f);
        int i = this.A00;
        if (i != 0) {
            float f2 = (float) (0.0d + (((r10.A00 - 0.0d) / d) * (((double) i) - 0.0d)));
            int width = imageView.getWidth() / 4;
            if (AnonymousClass3MW.A1Z(r7.A0R)) {
                width = -width;
            }
            imageView.setTranslationX(f2 + ((float) width));
        }
    }
}
