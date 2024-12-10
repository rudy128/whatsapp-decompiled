package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.DBk  reason: case insensitive filesystem */
public final class C26733DBk implements C28657ECr {
    public Rect A00;
    public int A01;
    public int A02;
    public C24773CJq A03;
    public final Paint A04 = C108945cZ.A0K(6);
    public final C28603E9u A05;
    public final E96 A06;
    public final C25082CWs A07;
    public final boolean A08;
    public final Bitmap.Config A09 = Bitmap.Config.ARGB_8888;
    public final Matrix A0A = C108945cZ.A0J();
    public final Path A0B = C108945cZ.A0L();
    public final E95 A0C;
    public final C129546hy A0D;
    public final C25026CUc A0E;

    public C26733DBk(E95 e95, C28603E9u e9u, E96 e96, C129546hy r5, C25082CWs cWs, C25026CUc cUc, boolean z) {
        C18070vi.A0d(cUc, 1);
        this.A0E = cUc;
        this.A05 = e9u;
        this.A0C = e95;
        this.A07 = cWs;
        this.A08 = z;
        this.A06 = e96;
        this.A0D = r5;
        A00();
    }

    private final boolean A01(Canvas canvas, int i, int i2) {
        DRN drn = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.A08) {
                E96 e96 = this.A06;
                if (e96 == null) {
                    return false;
                }
                DRN BNP = e96.BNP(i, canvas.getWidth(), canvas.getHeight());
                if (BNP != null) {
                    try {
                        if (BNP.A06()) {
                            Object A052 = BNP.A05();
                            C18070vi.A0X(A052);
                            Bitmap bitmap = (Bitmap) A052;
                            Rect rect = this.A00;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A04);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, this.A04);
                            }
                            BNP.close();
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        drn = BNP;
                        if (drn != null) {
                            drn.close();
                        }
                        throw th;
                    }
                }
                e96.CCP(canvas.getWidth(), canvas.getHeight());
                if (BNP == null) {
                    return false;
                }
                BNP.close();
                return false;
            }
            if (i2 == 0) {
                drn = this.A05.BNy(i);
                z = A02(canvas, drn, i, 0);
            } else if (i2 == 1) {
                drn = this.A05.BNQ();
                if (drn != null && drn.A06()) {
                    C25082CWs cWs = this.A07;
                    Object A053 = drn.A05();
                    C18070vi.A0X(A053);
                    if (!cWs.A00((Bitmap) A053, i)) {
                        drn.close();
                    } else if (A02(canvas, drn, i, 1)) {
                        z = true;
                    }
                }
                i3 = 2;
            } else if (i2 != 2) {
                drn = this.A05.BRZ();
                z = A02(canvas, drn, i, 3);
                i3 = -1;
            } else {
                drn = this.A0E.A00(this.A09, this.A02, this.A01);
                if (drn.A06()) {
                    C25082CWs cWs2 = this.A07;
                    Object A054 = drn.A05();
                    C18070vi.A0X(A054);
                    if (!cWs2.A00((Bitmap) A054, i)) {
                        drn.close();
                    } else if (A02(canvas, drn, i, 2)) {
                        z = true;
                    }
                }
                i3 = 3;
                drn.close();
                if (z && i3 != -1) {
                    return A01(canvas, i, i3);
                }
            }
            if (drn != null) {
                drn.close();
            }
            return z ? z : z;
        } catch (RuntimeException e) {
            C26265CwA.A04(C26733DBk.class, "Failed to create frame bitmap", e);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public boolean BJT(Canvas canvas, Drawable drawable, int i) {
        C129546hy r2;
        E96 e96;
        boolean A012 = A01(canvas, i, 0);
        if (!(this.A08 || (r2 = this.A0D) == null || (e96 = this.A06) == null)) {
            e96.CCQ(this, this.A05, r2, i);
        }
        return A012;
    }

    private final void A00() {
        int i;
        C25082CWs cWs = this.A07;
        int width = cWs.A00.A06.getWidth();
        this.A02 = width;
        int i2 = -1;
        if (width == -1) {
            Rect rect = this.A00;
            if (rect != null) {
                i = rect.width();
            } else {
                i = -1;
            }
            this.A02 = i;
        }
        int height = cWs.A00.A06.getHeight();
        this.A01 = height;
        if (height == -1) {
            Rect rect2 = this.A00;
            if (rect2 != null) {
                i2 = rect2.height();
            }
            this.A01 = i2;
        }
    }

    private final boolean A02(Canvas canvas, DRN drn, int i, int i2) {
        if (drn == null || !DRN.A02(drn)) {
            return false;
        }
        Object A052 = drn.A05();
        C18070vi.A0X(A052);
        Bitmap bitmap = (Bitmap) A052;
        Rect rect = this.A00;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.A04);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.A04);
        }
        if (i2 == 3 || this.A08) {
            return true;
        }
        this.A05.Bv4(drn, i);
        return true;
    }

    public int BS1(int i) {
        return this.A0C.BS1(i);
    }

    public int BTC() {
        return this.A01;
    }

    public int BTD() {
        return this.A02;
    }

    public int BUH() {
        return this.A0C.BUH();
    }

    public void CHp(int i) {
        this.A04.setAlpha(i);
    }

    public void CI7(Rect rect) {
        this.A00 = rect;
        C25082CWs cWs = this.A07;
        C26116Cse cse = cWs.A00;
        if (!C26116Cse.A01(rect, cse.A06).equals(cse.A05)) {
            cse = new C26116Cse(rect, cse.A07, cse.A08, cse.A09);
        }
        if (cse != cWs.A00) {
            cWs.A00 = cse;
            cWs.A01 = new C26113Csb(cse, cWs.A03, cWs.A04);
        }
        A00();
    }

    public void CIP(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public int getFrameCount() {
        return this.A0C.getFrameCount();
    }

    public int getLoopCount() {
        return this.A0C.getLoopCount();
    }

    public void CHt(C24773CJq cJq) {
        this.A03 = cJq;
    }
}
