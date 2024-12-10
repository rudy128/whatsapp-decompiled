package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;

/* renamed from: X.6WT  reason: invalid class name */
public abstract class AnonymousClass6WT {
    public static final void A00(Drawable drawable, ImageView imageView, Fragment fragment, C139226yS r13, C136166tN r14, int i, int i2, boolean z) {
        AnonymousClass891 r4;
        Fragment fragment2 = fragment;
        C18070vi.A0d(fragment, 0);
        ImageView imageView2 = imageView;
        C18070vi.A0d(imageView, 3);
        Object tag = imageView.getTag();
        String str = null;
        if (tag instanceof AnonymousClass891) {
            r4 = (AnonymousClass891) tag;
            if (r4 != null) {
                str = r4.Ba8();
            }
        } else {
            r4 = null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        C139226yS r8 = r13;
        A10.append(r13.A02);
        A10.append('-');
        A10.append(r13.A04);
        A10.append('-');
        A10.append(r13.A01);
        A10.append('-');
        if (!C18070vi.A18(str, AnonymousClass3MY.A0r(A10, r13.A06))) {
            if (r14 != null) {
                r14.A01(r4);
            }
            AnonymousClass8B2 r7 = r13.A03;
            AnonymousClass7HX r9 = new AnonymousClass7HX(imageView, r7, r13, i);
            C144447Hi r3 = new C144447Hi(drawable, imageView2, fragment2, r7, r8, r9, i2, z);
            imageView2.setTag(r9);
            if (r14 != null) {
                r14.A02(r9, r3);
            }
        }
    }
}
