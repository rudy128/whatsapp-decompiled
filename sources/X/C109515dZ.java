package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5dZ  reason: invalid class name and case insensitive filesystem */
public final class C109515dZ extends Drawable implements Animatable, C1597585t {
    public static int A0C = 4000;
    public int A00;
    public int A01;
    public long A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final C139646zD A06;
    public final List A07;
    public final Paint A08;
    public final AnonymousClass11P A09;
    public final C18030ve A0A;
    public final C18100vl A0B;

    public C109515dZ(AnonymousClass11P r3, C18030ve r4, C139646zD r5) {
        this.A06 = r5;
        this.A09 = r3;
        this.A0A = r4;
        if (AnonymousClass73J.A00) {
            A0C = SearchActionVerificationClientService.NOTIFICATION_ID;
        }
        this.A08 = C108945cZ.A0K(1);
        this.A0B = AnonymousClass1DF.A01(new C153937qK(this));
        this.A07 = AnonymousClass000.A13();
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        C18070vi.A0d(canvas, 0);
        boolean z = this.A04;
        C139646zD r1 = this.A06;
        if (!z || (bitmap = r1.A02) == null) {
            bitmap = r1.A0B;
        }
        C18070vi.A0b(bitmap);
        A00(bitmap, canvas, this);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A08.setColorFilter(colorFilter);
    }

    public void stop() {
        if (this.A04) {
            this.A04 = false;
            C139646zD r5 = this.A06;
            Set set = r5.A0I;
            set.remove(this);
            if (set.isEmpty()) {
                r5.A0J = false;
                r5.A00 = 0;
                C139396yl r3 = r5.A0E;
                synchronized (r3) {
                    r3.A00 = 0;
                    r3.A02 = null;
                    Bitmap bitmap = r3.A01;
                    if (bitmap != null) {
                        r3.A03 = null;
                        bitmap.recycle();
                        r3.A01 = null;
                    }
                }
                r5.A03 = false;
                Bitmap bitmap2 = r5.A02;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    r5.A02 = null;
                }
                r5.A01 = null;
                r5.A0C.A0I(r5.A0H);
                AnonymousClass1T0 r2 = r5.A0F.A04;
                synchronized (r2) {
                    Iterator it = r2.A01.iterator();
                    while (it.hasNext()) {
                        if (((AnonymousClass7PV) it.next()).A02 == r3) {
                            it.remove();
                        }
                    }
                }
            }
            for (C6Y A012 : this.A07) {
                A012.A01(this);
            }
            invalidateSelf();
        }
    }

    public static final void A00(Bitmap bitmap, Canvas canvas, C109515dZ r5) {
        if (bitmap.isRecycled()) {
            if (C18020vd.A05(C18040vf.A02, r5.A0A, 8746)) {
                return;
            }
        }
        if (bitmap.getWidth() != bitmap.getHeight()) {
            if (C18020vd.A05(C18040vf.A02, r5.A0A, 11141)) {
                C139646zD r1 = r5.A06;
                canvas.drawBitmap(bitmap, (float) r1.A09, (float) r1.A0A, r5.A08);
                return;
            }
        }
        canvas.drawBitmap(bitmap, (Rect) null, r5.getBounds(), r5.A08);
    }

    public boolean isRunning() {
        return this.A04;
    }

    public void start() {
        this.A02 = SystemClock.uptimeMillis();
        if (!this.A04 || AnonymousClass73J.A00) {
            this.A00 = 0;
            this.A04 = true;
            C139646zD r4 = this.A06;
            int i = r4.A00;
            int i2 = r4.A0G.A00;
            boolean z = true;
            if (i <= Math.max(i2 / 5, 1)) {
                z = false;
            }
            this.A05 = z;
            r4.A0I.add(this);
            if (!r4.A0J && i2 > 1) {
                r4.A0J = true;
                r4.A01();
            }
            for (C6Y A022 : this.A07) {
                A022.A02(this);
            }
        }
    }
}
