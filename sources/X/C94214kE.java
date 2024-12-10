package X;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.Collection;

/* renamed from: X.4kE  reason: invalid class name and case insensitive filesystem */
public final class C94214kE implements C42971z2 {
    public AnonymousClass1VX A00 = AnonymousClass1VW.A06;
    public boolean A01;
    public final AnonymousClass1VW A02;

    public C94214kE(AnonymousClass1VW r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    public /* synthetic */ void CBg() {
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
        AnonymousClass1VW r4 = this.A02;
        if (r4.A0D()) {
            int i = 2131233521;
            if (this.A01) {
                i = 2131233171;
            }
            imageView.setImageDrawable(r4.A08(new C65482wZ(4), this.A00, i));
            return;
        }
        int i2 = 2131231047;
        if (this.A01) {
            i2 = 2131231053;
        }
        imageView.setImageResource(i2);
    }

    public final void A00(Collection collection) {
        boolean z = true;
        if (collection.size() != 1 || !((AnonymousClass1E7) C29431cG.A0X(collection)).A0F()) {
            z = false;
        }
        this.A01 = z;
    }

    public void CIg(AnonymousClass1BI r2) {
        this.A00 = AnonymousClass1VW.A01(r2);
    }
}
