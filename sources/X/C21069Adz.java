package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.Adz  reason: case insensitive filesystem */
public final class C21069Adz implements C108315bU {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ B6T A01;
    public final /* synthetic */ B6T A02;
    public final /* synthetic */ C198229y0 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ WeakReference A06;
    public final /* synthetic */ WeakReference A07;

    public void C8a() {
    }

    public C21069Adz(ImageView imageView, B6T b6t, B6T b6t2, C198229y0 r4, String str, String str2, WeakReference weakReference, WeakReference weakReference2) {
        this.A07 = weakReference;
        this.A06 = weakReference2;
        this.A02 = b6t;
        this.A05 = str;
        this.A00 = imageView;
        this.A04 = str2;
        this.A03 = r4;
        this.A01 = b6t2;
    }

    public void Bwt() {
        String str = this.A05;
        if (str != null && str.length() != 0) {
            ImageView imageView = this.A00;
            String str2 = this.A04;
            C181069Pa.A00(imageView, this.A01, this.A02, this.A03, str, str2);
        }
    }

    public void C8b(Bitmap bitmap) {
        ImageView imageView = (ImageView) this.A07.get();
        Object obj = this.A06.get();
        Number number = (Number) this.A02.get();
        if (imageView != null && obj != null && number != null) {
            imageView.setColorFilter(number.intValue());
        }
    }
}
