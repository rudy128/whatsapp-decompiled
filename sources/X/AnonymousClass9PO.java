package X;

import android.text.TextUtils;
import android.widget.ImageView;

/* renamed from: X.9PO  reason: invalid class name */
public abstract class AnonymousClass9PO {
    public static void A00(ImageView imageView, C183889Zz r11, C20005A2v a2v, C20246ADe aDe) {
        ImageView imageView2 = imageView;
        AnonymousClass9PP.A00(imageView);
        if (aDe != null) {
            String str = aDe.A01;
            if (!TextUtils.isEmpty(str)) {
                C183889Zz r5 = r11;
                C20005A2v a2v2 = a2v;
                a2v2.A03(imageView2, new AEI(aDe.A00, str, (String) null, 0, 0), (B7F) null, r5, new ANS(), new ANY(0), 2);
            }
        }
    }
}
