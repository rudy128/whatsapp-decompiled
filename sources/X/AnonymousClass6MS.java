package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ThumbnailUtils;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.Set;

/* renamed from: X.6MS  reason: invalid class name */
public class AnonymousClass6MS extends A34 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6MS(Bitmap bitmap, AnonymousClass1FL r3, AnonymousClass740 r4) {
        super(r3, true);
        this.A02 = r4;
        this.A01 = bitmap;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Bitmap bitmap;
        if (this.A00 != 0) {
            return ((AnonymousClass72F) this.A01).A07.A00();
        }
        try {
            AnonymousClass740 r6 = (AnonymousClass740) this.A02;
            Bitmap bitmap2 = r6.A02;
            if (bitmap2 != null) {
                Bitmap bitmap3 = (Bitmap) this.A01;
                int i = r6.A0K;
                bitmap = Bitmap.createScaledBitmap(bitmap2, i, (int) (((float) i) / 0.5625f), true);
                Canvas A0E = C108955ca.A0E(bitmap);
                RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap3.getWidth(), (float) bitmap3.getHeight());
                RectF rectF2 = new RectF(0.0f, 0.0f, (float) A0E.getWidth(), (float) A0E.getHeight());
                Matrix A0J = C108945cZ.A0J();
                A0J.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                A0J.mapRect(rectF);
                A0E.drawBitmap(bitmap3, (Rect) null, rectF, (Paint) null);
            } else {
                bitmap = ThumbnailUtils.extractThumbnail((Bitmap) this.A01, r6.A0K, r6.A0J);
                if (bitmap == null) {
                    return null;
                }
            }
            r6.A03 = bitmap;
            C112135kz r0 = r6.A0B;
            if (r0 == null) {
                return null;
            }
            Arrays.fill(r0.A03, true);
            return null;
        } catch (OutOfMemoryError e) {
            Log.e("FilterThumbnailAdapter/updateBaseThumbnail/OutOfMemoryError", e);
            return null;
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass10T A0V;
        C23691Hg r1;
        C145207Kj r5;
        if (1 - this.A00 != 0) {
            super.A0H(obj);
            return;
        }
        Set set = (Set) obj;
        AnonymousClass72F r4 = (AnonymousClass72F) this.A01;
        if (set != null) {
            C19830z4 r3 = r4.A02;
            C17880vN.A1F(C19830z4.A00(r3), "payment_background_batch_require_fetch", false);
            r3.A1i("payment_backgrounds_batch_last_fetch_timestamp");
            A0V = C17880vN.A0V(r4.A0D);
            if (!set.isEmpty()) {
                r1 = new C97014om(set, 31);
            }
            r5 = (C145207Kj) this.A02;
            if (r5 != null && set != null) {
                AEX aex = r5.A03;
                if (set.contains(aex.A0F)) {
                    r5.A04.A08.A00(r5.A02, aex, r5.A01, r5.A00);
                    return;
                }
                return;
            }
        }
        A0V = C17880vN.A0V(r4.A0D);
        r1 = new AnonymousClass7KX(26);
        A0V.notifyAllObservers(r1);
        r5 = (C145207Kj) this.A02;
        if (r5 != null) {
        }
    }

    public AnonymousClass6MS(C145207Kj r2, AnonymousClass72F r3) {
        this.A01 = r3;
        this.A02 = r2;
    }
}
