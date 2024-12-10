package X;

import android.graphics.Bitmap;
import android.widget.ImageView;

public final class AQC implements C42971z2 {
    public int A00 = 2131231047;
    public final AnonymousClass118 A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public /* synthetic */ void CBg() {
    }

    public /* synthetic */ void CIg(AnonymousClass1BI r1) {
    }

    public void CMZ(Bitmap bitmap, ImageView imageView, boolean z) {
        C18070vi.A0d(imageView, 0);
        if (bitmap != null) {
            imageView.setTag(2131435441, (Object) null);
            imageView.setImageBitmap(bitmap);
            return;
        }
        CN5(imageView);
    }

    public void CN5(ImageView imageView) {
        C18070vi.A0d(imageView, 0);
        imageView.setTag(2131435441, AnonymousClass000.A0i());
        AnonymousClass3MX.A0x(this.A03).CGF(new C21458AkP(this, imageView, 46));
    }

    public AQC(AnonymousClass118 r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
