package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: X.1VU  reason: invalid class name */
public class AnonymousClass1VU {
    public final C18030ve A00;

    public static Drawable A00(Resources.Theme theme, Resources resources, C43011z6 r4, C18030ve r5, int i) {
        if (C18020vd.A05(C18040vf.A02, r5, 1257)) {
            return new AnonymousClass26q(theme, resources, r4, i);
        }
        return new C43031z8(theme, resources, r4, i);
    }

    public Drawable A01(Resources resources, Bitmap bitmap, C43011z6 r6) {
        if (C18020vd.A05(C18040vf.A02, this.A00, 1257)) {
            return new AnonymousClass26q(resources, bitmap, r6);
        }
        return new C43031z8(resources, bitmap, r6);
    }

    public Drawable A02(C43011z6 r5, int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        if (C18020vd.A05(C18040vf.A02, this.A00, 1257)) {
            return new AnonymousClass26q(colorDrawable, r5);
        }
        return new C43031z8(colorDrawable, r5);
    }

    public AnonymousClass1VU(C18030ve r1) {
        this.A00 = r1;
    }
}
