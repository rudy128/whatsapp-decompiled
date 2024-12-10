package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.2ym  reason: invalid class name and case insensitive filesystem */
public final class C66812ym implements C42971z2 {
    public AnonymousClass1VX A00 = AnonymousClass1VW.A06;
    public final AnonymousClass1VW A01;

    public C66812ym(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public /* synthetic */ void CBg() {
    }

    public /* synthetic */ void CIg(AnonymousClass1BI r1) {
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            CN5(imageView);
        }
    }

    public void CN5(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        AnonymousClass1VW r2 = this.A01;
        if (r2.A0D()) {
            r2.A0B(imageView, this.A00, 2131233521);
        } else {
            r2.A0B(imageView, (AnonymousClass1VX) null, 2131231051);
        }
    }
}
