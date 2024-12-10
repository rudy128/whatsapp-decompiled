package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.util.DisplayMetrics;

/* renamed from: X.71g  reason: invalid class name and case insensitive filesystem */
public final class C1403971g {
    public final AnonymousClass118 A00;
    public final C18100vl A01 = AnonymousClass7S4.A02(this, 25);
    public final C18100vl A02 = AnonymousClass7S4.A02(this, 22);
    public final C18100vl A03 = AnonymousClass7S4.A02(this, 24);
    public final C18100vl A04 = AnonymousClass7S4.A02(this, 23);

    public C1403971g(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final Bitmap A00(Bitmap bitmap) {
        DisplayMetrics A07 = C108965cb.A07();
        int max = Math.max(A07.widthPixels, A07.heightPixels);
        Bitmap createBitmap = Bitmap.createBitmap(max, max, Bitmap.Config.ARGB_8888);
        Canvas A0I = C108945cZ.A0I(createBitmap);
        A0I.drawColor(0);
        A0I.drawBitmap(bitmap, (float) ((max - bitmap.getWidth()) / 2), (float) ((max - bitmap.getHeight()) / 2), (Paint) null);
        C18070vi.A0X(createBitmap);
        bitmap.recycle();
        return createBitmap;
    }

    public final Bitmap A02(Bitmap bitmap) {
        int dimensionPixelSize = AnonymousClass3MW.A05(this.A00).getDimensionPixelSize(2131168910);
        Bitmap bitmap2 = bitmap;
        C18100vl r6 = this.A02;
        float max = (((float) Math.max(bitmap2.getWidth(), bitmap2.getHeight())) * ((float) dimensionPixelSize)) / ((float) C72453Mb.A0I(r6));
        int width = bitmap2.getWidth();
        int height = bitmap2.getHeight();
        Bitmap A0H = C108945cZ.A0H(width, height);
        Canvas A0I = C108945cZ.A0I(A0H);
        Paint A06 = AnonymousClass3MW.A06();
        A06.setAntiAlias(true);
        boolean A1O = AnonymousClass000.A1O(bitmap2.getPixel(0, 0));
        int i = width - 1;
        boolean A1O2 = AnonymousClass000.A1O(bitmap2.getPixel(i, 0));
        int i2 = height - 1;
        boolean A1O3 = AnonymousClass000.A1O(bitmap2.getPixel(0, i2));
        boolean A1O4 = AnonymousClass000.A1O(bitmap2.getPixel(i, i2));
        float[] fArr = new float[8];
        if (A1O) {
            fArr[1] = max;
            fArr[0] = max;
        }
        if (A1O2) {
            fArr[3] = max;
            fArr[2] = max;
        }
        if (A1O4) {
            fArr[5] = max;
            fArr[4] = max;
        }
        if (A1O3) {
            fArr[7] = max;
            fArr[6] = max;
        }
        Path A0L = C108945cZ.A0L();
        A0L.addRoundRect(new RectF(0.0f, 0.0f, (float) width, (float) height), fArr, Path.Direction.CW);
        A0I.drawPath(A0L, A06);
        C108965cb.A11(A06, PorterDuff.Mode.SRC_IN);
        A0I.drawBitmap(bitmap2, 0.0f, 0.0f, A06);
        C18070vi.A0X(A0H);
        bitmap2.recycle();
        int min = Math.min(Math.max(A0H.getWidth(), A0H.getHeight()), C72453Mb.A0I(this.A01));
        Bitmap A042 = AnonymousClass204.A04(A0H, min, (min * 16) / 512);
        C18070vi.A0X(A042);
        A0H.recycle();
        A0H.recycle();
        Bitmap A05 = AnonymousClass204.A05(A042, new PorterDuffColorFilter(C72453Mb.A0I(this.A03), PorterDuff.Mode.SRC_ATOP), (((float) Math.max(A042.getWidth(), A042.getHeight())) * ((float) C72453Mb.A0I(this.A04))) / ((float) C72453Mb.A0I(r6)));
        C18070vi.A0X(A05);
        A042.recycle();
        A042.recycle();
        return A05;
    }

    public static final Bitmap A01(Bitmap bitmap) {
        Bitmap A032 = AnonymousClass204.A03(bitmap);
        C18070vi.A0X(A032);
        bitmap.recycle();
        if (Math.min(A032.getWidth(), A032.getHeight()) >= 512) {
            return A032;
        }
        float width = (float) A032.getWidth();
        float height = (float) A032.getHeight();
        float max = 512.0f / Math.max(width, height);
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A032, Math.round(width * max), Math.round(max * height), true);
        C18070vi.A0X(createScaledBitmap);
        A032.recycle();
        return createScaledBitmap;
    }
}
