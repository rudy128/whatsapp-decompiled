package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.9BE  reason: invalid class name */
public class AnonymousClass9BE extends A34 {
    public final int A00;
    public final int A01;
    public final Uri A02;
    public final C26521Sl A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Uri uri;
        Bitmap bitmap = (Bitmap) obj;
        AnonymousClass990 r6 = (AnonymousClass990) this.A04.get();
        if (r6 != null && !r6.Bed()) {
            ImageView imageView = r6.A01;
            int i = 0;
            if (bitmap == null) {
                i = 8;
            }
            imageView.setVisibility(i);
            r6.A01.setImageBitmap(bitmap);
            if (bitmap == null || (uri = r6.A00) == null) {
                r6.A05.A08(2131889981, 0);
                r6.A0a = false;
                r6.CEx();
                return;
            }
            AnonymousClass3MW.A1T(new AnonymousClass6MT(uri, r6.A0e, r6.A0T), r6.A05, 0);
        }
    }

    public AnonymousClass9BE(Uri uri, AnonymousClass990 r3, C26521Sl r4, int i, int i2) {
        this.A03 = r4;
        this.A02 = uri;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = AnonymousClass3MW.A0z(r3);
    }
}
