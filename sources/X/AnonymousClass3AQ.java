package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.3AQ  reason: invalid class name */
public final class AnonymousClass3AQ implements AnonymousClass3M2 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1418377d A01;
    public final /* synthetic */ C26631Sw A02;
    public final /* synthetic */ StickerView A03;

    public /* synthetic */ void BuW() {
    }

    public void CMa(Bitmap bitmap, View view, AnonymousClass206 r15) {
        C18070vi.A0e(view, 0, r15);
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            C26631Sw r0 = this.A02;
            C1418377d r3 = this.A01;
            StickerView stickerView = this.A03;
            int i = this.A00;
            r0.A06(new C59842my(stickerView, r3, (AnonymousClass889) null, i, i, 1, 0, false, false, false));
            return;
        }
        this.A03.setImageBitmap(bitmap);
    }

    public AnonymousClass3AQ(C1418377d r1, C26631Sw r2, StickerView stickerView, int i) {
        this.A03 = stickerView;
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public void CN4(View view) {
        this.A03.setImageResource(2131233044);
    }

    public int BZK() {
        return this.A00;
    }
}
