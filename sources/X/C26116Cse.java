package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;

/* renamed from: X.Cse  reason: case insensitive filesystem */
public class C26116Cse {
    public Bitmap A00;
    public final int A01;
    public final Paint A02;
    public final Rect A03 = AnonymousClass3MW.A07();
    public final Rect A04 = AnonymousClass3MW.A07();
    public final Rect A05;
    public final EAH A06;
    public final C25524ChM A07;
    public final C99 A08;
    public final boolean A09;
    public final int[] A0A;
    public final C24988CSo[] A0B;

    public static synchronized Bitmap A00(C26116Cse cse, int i, int i2) {
        Bitmap bitmap;
        synchronized (cse) {
            Bitmap bitmap2 = cse.A00;
            if (bitmap2 != null && (bitmap2.getWidth() < i || cse.A00.getHeight() < i2)) {
                Bitmap bitmap3 = cse.A00;
                if (bitmap3 != null) {
                    bitmap3.recycle();
                    cse.A00 = null;
                }
            }
            Bitmap bitmap4 = cse.A00;
            if (bitmap4 == null) {
                bitmap4 = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
                cse.A00 = bitmap4;
            }
            bitmap4.eraseColor(0);
            bitmap = cse.A00;
        }
        return bitmap;
    }

    public static Rect A01(Rect rect, EAH eah) {
        int min;
        int min2;
        if (rect == null) {
            min = eah.getWidth();
            min2 = eah.getHeight();
        } else {
            min = Math.min(rect.width(), eah.getWidth());
            min2 = Math.min(rect.height(), eah.getHeight());
        }
        return new Rect(0, 0, min, min2);
    }

    public void A03(Canvas canvas, int i) {
        int width;
        int height;
        int xOffset;
        int yOffset;
        EAH eah = this.A06;
        C28591E9g frame = eah.getFrame(i);
        try {
            if (frame.getWidth() > 0 && frame.getHeight() > 0) {
                if (eah.doesRenderSupportScaling()) {
                    Rect rect = this.A05;
                    double width2 = ((double) rect.width()) / ((double) eah.getWidth());
                    double height2 = ((double) rect.height()) / ((double) eah.getHeight());
                    int round = (int) Math.round(((double) frame.getWidth()) * width2);
                    int round2 = (int) Math.round(((double) frame.getHeight()) * height2);
                    int xOffset2 = (int) (((double) frame.getXOffset()) * width2);
                    int yOffset2 = (int) (((double) frame.getYOffset()) * height2);
                    synchronized (this) {
                        try {
                            int width3 = rect.width();
                            int height3 = rect.height();
                            A00(this, width3, height3);
                            Bitmap bitmap = this.A00;
                            if (bitmap != null) {
                                frame.renderFrame(round, round2, bitmap);
                            }
                            Rect rect2 = this.A04;
                            rect2.set(0, 0, width3, height3);
                            Rect rect3 = this.A03;
                            rect3.set(xOffset2, yOffset2, width3 + xOffset2, height3 + yOffset2);
                            Bitmap bitmap2 = this.A00;
                            if (bitmap2 != null) {
                                canvas.drawBitmap(bitmap2, rect2, rect3, (Paint) null);
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } else {
                    if (this.A09) {
                        float max = Math.max(((float) frame.getWidth()) / ((float) Math.min(frame.getWidth(), canvas.getWidth())), ((float) frame.getHeight()) / ((float) Math.min(frame.getHeight(), canvas.getHeight())));
                        width = (int) (((float) frame.getWidth()) / max);
                        height = (int) (((float) frame.getHeight()) / max);
                        xOffset = (int) (((float) frame.getXOffset()) / max);
                        yOffset = (int) (((float) frame.getYOffset()) / max);
                    } else {
                        width = frame.getWidth();
                        height = frame.getHeight();
                        xOffset = frame.getXOffset();
                        yOffset = frame.getYOffset();
                    }
                    synchronized (this) {
                        try {
                            Bitmap A002 = A00(this, width, height);
                            this.A00 = A002;
                            frame.renderFrame(width, height, A002);
                            canvas.save();
                            canvas.translate((float) xOffset, (float) yOffset);
                            canvas.drawBitmap(this.A00, 0.0f, 0.0f, (Paint) null);
                            canvas.restore();
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                    }
                }
            }
        } finally {
            frame.dispose();
        }
    }

    public static void A02(Canvas canvas, C24988CSo cSo, C26116Cse cse, float f, float f2) {
        if (cSo.A04 == C24255ByD.DISPOSE_TO_BACKGROUND) {
            int A032 = BE8.A03((float) cSo.A01, f);
            int A033 = BE8.A03((float) cSo.A00, f2);
            int A034 = BE8.A03((float) cSo.A02, f);
            int A035 = BE8.A03((float) cSo.A03, f2);
            canvas.drawRect(new Rect(A034, A035, A032 + A034, A033 + A035), cse.A02);
        }
    }

    public C26116Cse(Rect rect, C25524ChM chM, C99 c99, boolean z) {
        this.A08 = c99;
        this.A07 = chM;
        EAH eah = chM.A01;
        this.A06 = eah;
        int[] frameDurations = eah.getFrameDurations();
        this.A0A = frameDurations;
        C18070vi.A0d(frameDurations, 0);
        for (int i = 0; i < r3; i++) {
            if (frameDurations[i] < 11) {
                frameDurations[i] = 100;
            }
        }
        int i2 = 0;
        for (int i3 : frameDurations) {
            i2 += i3;
        }
        this.A01 = i2;
        for (int i4 = 0; i4 < r3; i4++) {
        }
        this.A05 = A01(rect, eah);
        this.A09 = z;
        this.A0B = new C24988CSo[eah.getFrameCount()];
        for (int i5 = 0; i5 < this.A06.getFrameCount(); i5++) {
            this.A0B[i5] = this.A06.getFrameInfo(i5);
        }
        Paint A062 = AnonymousClass3MW.A06();
        this.A02 = A062;
        C108965cb.A11(A062, PorterDuff.Mode.CLEAR);
    }
}
