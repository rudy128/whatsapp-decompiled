package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

public final class BFG extends Drawable implements Drawable.Callback, E4Q {
    public static final /* synthetic */ EEE[] A0K;
    public long A00;
    public Rect A01;
    public C26738DBr A02;
    public C25809CmM A03;
    public Object A04;
    public int A05;
    public int A06;
    public ColorFilter A07;
    public boolean A08;
    public final C27173DXi A09;
    public final CPS A0A;
    public final BQl A0B;
    public final C25809CmM A0C;
    public final C25809CmM A0D;
    public final C25809CmM A0E;
    public final C27082DTh A0F;
    public final C18090vk A0G;
    public final C18090vk A0H;
    public final C97 A0I;
    public final C22821Di A0J;

    static {
        Class<BFG> cls = BFG.class;
        A0K = new EEE[]{new C28236Dtw(cls, "dataSource", "getDataSource()Lcom/facebook/datasource/DataSource;"), new C28236Dtw(cls, "closeable", "getCloseable()Ljava/io/Closeable;")};
    }

    public BFG(C97 c97) {
        C18070vi.A0d(c97, 1);
        this.A0I = c97;
        this.A0A = new CPS();
        this.A0B = new BQl();
        C25707Ckd ckd = C25707Ckd.A02;
        this.A0F = new C27082DTh(this, 14);
        this.A06 = -1;
        this.A05 = -1;
        C27940Doc doc = new C27940Doc(this);
        this.A0J = doc;
        this.A09 = new C27173DXi(doc);
        C27493DgM dgM = new C27493DgM(this);
        this.A0G = dgM;
        C27494DgN dgN = new C27494DgN(this);
        this.A0H = dgN;
        this.A0E = new C25809CmM(dgM, dgN);
        this.A0C = new C25809CmM(this.A0G, this.A0H);
        this.A0D = new C25809CmM(this.A0G, this.A0H);
    }

    public void draw(Canvas canvas) {
        C22821Di r0;
        C18070vi.A0d(canvas, 0);
        if (!this.A08) {
            A00(getBounds());
        }
        C22821Di r02 = this.A0E.A04;
        if (r02 != null) {
            r02.invoke(canvas);
        }
        C22821Di r03 = this.A0C.A04;
        if (r03 != null) {
            r03.invoke(canvas);
        }
        C25809CmM cmM = this.A03;
        if (!(cmM == null || (r0 = cmM.A04) == null)) {
            r0.invoke(canvas);
        }
        C22821Di r04 = this.A0D.A04;
        if (r04 != null) {
            r04.invoke(canvas);
        }
    }

    public int getOpacity() {
        return -2;
    }

    public void onBoundsChange(Rect rect) {
        C18070vi.A0d(rect, 0);
        super.onBoundsChange(rect);
        A00(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        C18070vi.A0d(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        C18070vi.A0d(runnable, 1);
        unscheduleSelf(runnable);
    }

    private final void A00(Rect rect) {
        if (rect != null) {
            C25809CmM cmM = this.A0E;
            C3F c3f = cmM.A03;
            cmM.A01(cmM.A01, rect, cmM.A09.A01, c3f);
            C25809CmM cmM2 = this.A0C;
            C3F c3f2 = cmM2.A03;
            cmM2.A01(cmM2.A01, rect, cmM2.A09.A01, c3f2);
            C25809CmM cmM3 = this.A03;
            if (cmM3 != null) {
                C3F c3f3 = cmM3.A03;
                cmM3.A01(cmM3.A01, rect, cmM3.A09.A01, c3f3);
            }
            C25809CmM cmM4 = this.A0D;
            C3F c3f4 = cmM4.A03;
            cmM4.A01(cmM4.A01, rect, cmM4.A09.A01, c3f4);
            this.A08 = true;
        }
    }

    public final void A01() {
        if (this.A02 != null) {
            CPS cps = this.A0A;
            long j = this.A00;
            C25434Cfh.A00((DRN) null, (C26048CrF) null, this);
            C28604E9v e9v = cps.A01;
            if (e9v != null) {
                e9v.C2u(j);
            }
            AtomicLong atomicLong = CEZ.A00;
        }
        C25707Ckd.A02.A00(this);
        this.A00 = 0;
        C27173DXi dXi = this.A09;
        EEE[] eeeArr = A0K;
        dXi.CLJ((Object) null, eeeArr[1]);
        this.A0B.CLJ((Object) null, eeeArr[0]);
        this.A02 = null;
        this.A04 = null;
        this.A06 = -1;
        this.A05 = -1;
        this.A0E.A02(true);
        this.A0C.A02(true);
        C25809CmM cmM = this.A03;
        if (cmM != null) {
            cmM.A02(true);
        }
        this.A0D.A02(true);
        this.A08 = false;
        try {
            this.A0A.A01 = null;
        } catch (IOException unused) {
        }
    }

    public Drawable BMW() {
        C3F c3f = this.A0C.A03;
        if (c3f instanceof C22829BRh) {
            return ((C22829BRh) c3f).A02;
        }
        return null;
    }

    public int getIntrinsicHeight() {
        int i = this.A05;
        if (i == -1) {
            return super.getIntrinsicHeight();
        }
        return i;
    }

    public int getIntrinsicWidth() {
        int i = this.A06;
        if (i == -1) {
            return super.getIntrinsicWidth();
        }
        return i;
    }

    public void setAlpha(int i) {
        this.A0E.A00(i);
        this.A0C.A00(i);
        C25809CmM cmM = this.A03;
        if (cmM != null) {
            cmM.A00(i);
        }
        this.A0D.A00(i);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A07 = colorFilter;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.C97, java.lang.Object] */
    public BFG() {
        this(new Object());
    }
}
