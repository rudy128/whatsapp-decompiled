package X;

import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.DOj  reason: case insensitive filesystem */
public final class C26987DOj implements BCx {
    public final int A00;
    public final int A01;
    public final String A02;
    public final WeakReference A03;

    public C26987DOj(ImageView imageView, String str, int i, int i2) {
        C18070vi.A0d(imageView, 4);
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = AnonymousClass3MW.A0z(imageView);
    }

    public boolean BKx() {
        return false;
    }

    public Integer BVo() {
        return null;
    }

    public ImageView BSp() {
        return (ImageView) this.A03.get();
    }

    public int BUR() {
        return this.A00;
    }

    public int BUV() {
        return this.A01;
    }

    public String Bb5() {
        return this.A02;
    }

    public String getId() {
        return this.A02;
    }
}
