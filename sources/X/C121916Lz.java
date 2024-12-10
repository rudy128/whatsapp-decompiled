package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;
import java.lang.ref.SoftReference;

/* renamed from: X.6Lz  reason: invalid class name and case insensitive filesystem */
public class C121916Lz extends A34 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageView A02;
    public final /* synthetic */ AEX A03;
    public final /* synthetic */ C132646nG A04;
    public final /* synthetic */ String A05;

    public C121916Lz(ImageView imageView, AEX aex, C132646nG r3, String str, int i, int i2) {
        this.A04 = r3;
        this.A05 = str;
        this.A03 = aex;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = imageView;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C132646nG r0 = this.A04;
        return r0.A01.A06(this.A03.A01(r0.A00.A0H()), this.A05, this.A01, this.A00);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            ImageView imageView = this.A02;
            BitmapDrawable A052 = C108965cb.A05(bitmap, imageView);
            this.A04.A02.put(this.A05, new SoftReference(A052));
            imageView.setImageDrawable(A052);
            AnonymousClass3MW.A1R(imageView);
        }
    }
}
