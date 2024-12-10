package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.io.File;

/* renamed from: X.4VT  reason: invalid class name */
public class AnonymousClass4VT {
    public Drawable A00;
    public final int A01;
    public final A2k A02;
    public final boolean A03;

    public void A01(Drawable drawable, Drawable drawable2, ImageView imageView, String str) {
        A00(drawable, drawable2, imageView, (C108315bU) null, str);
    }

    public void A02(ImageView imageView, C108315bU r8, String str) {
        A00((Drawable) null, (Drawable) null, imageView, r8, str);
    }

    public void A03(ImageView imageView, String str) {
        A00((Drawable) null, (Drawable) null, imageView, (C108315bU) null, str);
    }

    public void A00(Drawable drawable, Drawable drawable2, ImageView imageView, C108315bU r15, String str) {
        int i = this.A01;
        String str2 = str;
        this.A02.A03(new C92814hx(drawable, drawable2, imageView, r15, str2, str2, i, i), this.A03);
    }

    public void A04(C108315bU r12, String str) {
        int i = this.A01;
        this.A02.A03(new C92814hx((Drawable) null, (Drawable) null, (ImageView) null, r12, str, str, i, i), false);
    }

    public AnonymousClass4VT(AnonymousClass1KB r11, AnonymousClass1D9 r12, C86284Ra r13, AnonymousClass10I r14, int i) {
        A2k a2k = r13.A04;
        if (a2k == null) {
            AnonymousClass181 r2 = r13.A07;
            Drawable drawable = r13.A03;
            File file = r13.A0A;
            long j = r13.A01;
            String str = r13.A0B;
            a2k = new C115515vB(r11, r2, new C92784hu(drawable, (Drawable) null), r12, r14, file, str, j);
        }
        this.A02 = a2k;
        this.A03 = r13.A05;
        this.A01 = i;
        this.A00 = r13.A02;
    }
}
