package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: X.4kB  reason: invalid class name and case insensitive filesystem */
public final class C94184kB implements C42971z2 {
    public AnonymousClass1VX A00 = AnonymousClass1VW.A06;
    public final int A01;
    public final AnonymousClass1VW A02;

    public C94184kB(AnonymousClass1VW r2, int i) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
        this.A01 = i;
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
        AnonymousClass1VW r1 = this.A02;
        Context A04 = AnonymousClass3MY.A04(imageView);
        int i = 2131233211;
        if (r1.A0D()) {
            i = 2131233135;
        }
        imageView.setImageBitmap(r1.A04(A04, this.A00, -2.14748365E9f, i, this.A01));
    }

    public void CIg(AnonymousClass1BI r2) {
        this.A00 = AnonymousClass1VW.A01(r2);
    }
}
