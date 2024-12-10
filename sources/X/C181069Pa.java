package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.Reference;

/* renamed from: X.9Pa  reason: invalid class name and case insensitive filesystem */
public abstract class C181069Pa {
    public static final void A00(ImageView imageView, B6T b6t, B6T b6t2, C198229y0 r7, String str, String str2) {
        Bitmap bitmap;
        C72473Md.A1M(r7, b6t, b6t2, 3);
        if (str2 != null && AnonymousClass000.A1Y(b6t.get())) {
            str = str2;
        } else if (str == null) {
            return;
        }
        C189959k8 r5 = new C189959k8(imageView, b6t2);
        C002100z r3 = r7.A00;
        Reference reference = (Reference) r3.A04(str);
        if (reference == null || (bitmap = (Bitmap) reference.get()) == null) {
            AnonymousClass3MW.A1T(new AnonymousClass9B3(r3, r5, r7.A01, str), r7.A02, 0);
            return;
        }
        r5.A00(bitmap);
    }
}
