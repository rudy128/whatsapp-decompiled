package X;

import android.graphics.Bitmap;
import com.whatsapp.status.playback.content.BlurFrameLayout;
import java.lang.ref.WeakReference;

/* renamed from: X.6MA  reason: invalid class name */
public final class AnonymousClass6MA extends A34 {
    public final WeakReference A00;

    public void A0E() {
        this.A00.clear();
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap[] bitmapArr = (Bitmap[]) objArr;
        C18070vi.A0d(bitmapArr, 0);
        Bitmap copy = bitmapArr[0].copy(Bitmap.Config.ARGB_8888, true);
        C18070vi.A0X(copy);
        C124316Xw.A00(16, copy);
        return copy;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C18070vi.A0d(bitmap, 0);
        BlurFrameLayout blurFrameLayout = (BlurFrameLayout) this.A00.get();
        if (blurFrameLayout != null) {
            Bitmap bitmap2 = blurFrameLayout.A01;
            if (bitmap2 == null) {
                blurFrameLayout.setAlpha(0.0f);
                blurFrameLayout.A02 = C108985cd.A0G(blurFrameLayout).setDuration(500);
            } else {
                bitmap2.recycle();
            }
            blurFrameLayout.A01 = bitmap;
            blurFrameLayout.invalidate();
        }
    }

    public AnonymousClass6MA(BlurFrameLayout blurFrameLayout) {
        this.A00 = AnonymousClass3MW.A0z(blurFrameLayout);
    }
}
