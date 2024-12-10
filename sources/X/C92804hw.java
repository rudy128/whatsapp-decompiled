package X;

import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: X.4hw  reason: invalid class name and case insensitive filesystem */
public final class C92804hw implements BCx {
    public final C84634Kg A00;
    public final AEA A01;
    public final int A02;
    public final int A03;
    public final WeakReference A04 = AnonymousClass3MW.A0z((Object) null);

    public C92804hw(C84634Kg r2, AEA aea, int i, int i2) {
        this.A01 = aea;
        this.A00 = r2;
        this.A03 = i;
        this.A02 = i2;
    }

    public ImageView BSp() {
        return (ImageView) this.A04.get();
    }

    public int BUR() {
        return this.A02;
    }

    public int BUV() {
        return this.A03;
    }

    public String Bb5() {
        String str = this.A01.A03;
        if (str == null) {
            return "";
        }
        return str;
    }

    public String getId() {
        return this.A01.A00;
    }

    public boolean BKx() {
        return AnonymousClass000.A1P(Bb5().length());
    }

    public Integer BVo() {
        return C17880vN.A0l();
    }
}
