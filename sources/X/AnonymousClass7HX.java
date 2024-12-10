package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.7HX  reason: invalid class name */
public final class AnonymousClass7HX implements AnonymousClass891 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImageView A01;
    public final /* synthetic */ AnonymousClass8B2 A02;
    public final /* synthetic */ C139226yS A03;

    public AnonymousClass7HX(ImageView imageView, AnonymousClass8B2 r2, C139226yS r3, int i) {
        this.A01 = imageView;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }

    public String Ba8() {
        C139226yS r3 = this.A03;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r3.A02);
        A10.append('-');
        A10.append(r3.A04);
        A10.append('-');
        A10.append(r3.A01);
        A10.append('-');
        return AnonymousClass3MY.A0r(A10, r3.A06);
    }

    public Bitmap BhZ() {
        Bitmap CP6;
        if (this.A01.getTag() != this) {
            return null;
        }
        AnonymousClass8B2 r1 = this.A02;
        if (r1 == null || (CP6 = r1.CP6(this.A00)) == null) {
            return AnonymousClass6YZ.A00;
        }
        return CP6;
    }
}
