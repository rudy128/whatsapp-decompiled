package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: X.3C6  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C6 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ BitmapDrawable A01;
    public final /* synthetic */ BitmapDrawable A02;
    public final /* synthetic */ C40071u7 A03;

    public final void run() {
        C40071u7 r4 = this.A03;
        float f = this.A00;
        BitmapDrawable bitmapDrawable = this.A01;
        BitmapDrawable bitmapDrawable2 = this.A02;
        C18070vi.A0d(r4, 0);
        synchronized (r4) {
            int i = (int) (255.0f * f);
            if (i < 0) {
                i = 0;
            } else if (i > 255) {
                i = 255;
            }
            float max = Math.max(f, 0.5f);
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), (int) (((float) bitmapDrawable.getIntrinsicWidth()) * max), (int) (((float) bitmapDrawable.getIntrinsicHeight()) * max), false);
            C18070vi.A0X(createScaledBitmap);
            int max2 = (int) (((float) Math.max(bitmapDrawable.getIntrinsicWidth(), bitmapDrawable2.getIntrinsicWidth())) * 2.0f);
            int max3 = (int) (((float) Math.max(bitmapDrawable.getIntrinsicHeight(), bitmapDrawable2.getIntrinsicHeight())) * 2.0f);
            Bitmap createBitmap = Bitmap.createBitmap(max2, max3, Bitmap.Config.ARGB_8888);
            C18070vi.A0X(createBitmap);
            Canvas canvas = new Canvas(createBitmap);
            if (i > 0) {
                Paint paint = r4.A01;
                paint.setAlpha(i);
                canvas.drawBitmap(createScaledBitmap, (float) ((max2 / 2) - (createScaledBitmap.getWidth() / 2)), (float) ((max3 / 2) - (createScaledBitmap.getHeight() / 2)), paint);
            }
            float f2 = 1.0f - f;
            if (f2 >= 0.5f) {
                float max4 = Math.max(f2, 0.5f);
                int i2 = (int) (f2 * 255.0f);
                if (i2 < 0) {
                    i2 = 0;
                } else if (i2 > 255) {
                    i2 = 255;
                }
                Paint paint2 = r4.A01;
                paint2.setAlpha(i2);
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDrawable2.getBitmap(), (int) (((float) bitmapDrawable2.getIntrinsicHeight()) * max4), (int) (((float) bitmapDrawable2.getIntrinsicWidth()) * max4), false);
                C18070vi.A0X(createScaledBitmap2);
                canvas.drawBitmap(createScaledBitmap2, (float) ((max2 / 2) - (createScaledBitmap2.getWidth() / 2)), (float) ((max3 / 2) - (createScaledBitmap2.getHeight() / 2)), paint2);
            }
            r4.A03.A0J(new C146527Pl(r4, createBitmap, 40));
        }
    }

    public /* synthetic */ AnonymousClass3C6(BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2, C40071u7 r3, float f) {
        this.A03 = r3;
        this.A00 = f;
        this.A01 = bitmapDrawable;
        this.A02 = bitmapDrawable2;
    }
}
