package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Vector;

public abstract class BIS extends FrameLayout implements C28413E0e, C28414E0f, C28415E0g {
    public static final double A0n = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02 = 0.5d;
    public double A03 = 0.5d;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public int A0C = -987675;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public long A0H;
    public long A0I = SystemClock.uptimeMillis();
    public long A0J;
    public long A0K;
    public Context A0L;
    public DAE A0M;
    public C25007CTh A0N;
    public DA3 A0O;
    public C65 A0P;
    public DTP A0Q;
    public CUZ A0R;
    public EBQ A0S = EBQ.A00;
    public Queue A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public C28412E0d A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final Matrix A0e = C108945cZ.A0J();
    public final Matrix A0f = C108945cZ.A0J();
    public final EnumSet A0g = EnumSet.of(C24324BzL.A00);
    public final BroadcastReceiver A0h = new C22584BEi(this, 3);
    public final ComponentCallbacks A0i = new C26330Cxn(this);
    public final Paint A0j = C108945cZ.A0K(2);
    public final RectF A0k = AnonymousClass3MW.A08();
    public final float[] A0l = new float[2];
    public final float[] A0m = new float[4];

    public static void A07(BIS bis) {
        bis.A0Y = false;
        bis.A0M.A0R.A06();
    }

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r2.A0G == null) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01() {
        /*
            r5 = this;
            X.DAE r2 = r5.A0M
            boolean r0 = r2.A0M
            if (r0 == 0) goto L_0x000b
            X.BPU r1 = r2.A0G
            r0 = 1
            if (r1 != 0) goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r4 = 1
            if (r0 == 0) goto L_0x0018
            X.Ck9 r1 = r2.A0U
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x0018
            r1.A01(r4)
        L_0x0018:
            boolean r0 = r5.A0b
            if (r0 != 0) goto L_0x0031
            android.content.Context r3 = r5.A0L
            android.content.ComponentCallbacks r0 = r5.A0i
            r3.registerComponentCallbacks(r0)
            android.content.BroadcastReceiver r2 = r5.A0h
            java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>(r1)
            r3.registerReceiver(r2, r0)
            r5.A0b = r4
        L_0x0031:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIS.A01():void");
    }

    private void A02() {
        C25678Ck9 ck9 = this.A0M.A0U;
        if (ck9.A03) {
            ck9.A01(false);
        }
        if (this.A0b) {
            Context context = this.A0L;
            context.unregisterComponentCallbacks(this.A0i);
            try {
                context.unregisterReceiver(this.A0h);
            } catch (IllegalArgumentException unused) {
            }
            this.A0b = false;
        }
        this.A0M.A06();
        C26138Ct1[] ct1Arr = C26138Ct1.A0P;
        int i = 0;
        do {
            ct1Arr[i].A03();
            i++;
        } while (i < 8);
    }

    private void A03() {
        RectF rectF = this.A0k;
        rectF.left = 0.0f;
        rectF.right = (float) this.A0F;
        rectF.top = 0.0f;
        rectF.bottom = (float) this.A0D;
        Matrix matrix = this.A0f;
        matrix.mapRect(rectF);
        float[] fArr = this.A0m;
        float f = this.A04;
        fArr[0] = -f;
        float f2 = -this.A05;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0J;
        this.A00 = (double) (max / f3);
        this.A01 = (double) (max2 / f3);
    }

    private void A04(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0l;
        fArr[0] = this.A04 - f;
        fArr[1] = this.A05 - f2;
        this.A0f.mapVectors(fArr);
        long j = this.A0J;
        double d = (double) j;
        this.A02 = A00(((double) f3) + (((double) fArr[0]) / d));
        this.A03 = A0B(((double) f4) + (((double) fArr[1]) / d), j);
    }

    private void A05(int i, float f) {
        this.A0G = i;
        this.A0B = f;
        int i2 = 1 << i;
        this.A0E = i2;
        this.A0J = (long) (i2 * this.A0M.A0N);
    }

    private void A06(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            DAE dae = this.A0M;
            A05((int) Math.min(Math.max((float) bundle.getInt("zoom"), dae.A01), dae.A00), bundle.getFloat("scale"));
            this.A02 = bundle.getDouble("xVisibleCenter") - ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1)));
            double d = bundle.getDouble("yVisibleCenter");
            DAE dae2 = this.A0M;
            this.A03 = d - ((double) (((long) (dae2.A06 - dae2.A04)) / (this.A0J << 1)));
            this.A0A = bundle.getFloat("rotation");
            Matrix matrix = this.A0e;
            float f = this.A0B;
            matrix.setScale(f, f);
            matrix.postRotate(this.A0A);
            matrix.invert(this.A0f);
            this.A0d = false;
        }
    }

    public static void A08(BIS bis) {
        DAE dae = bis.A0M;
        C26022Cqg cqg = dae.A0T.A09;
        if (cqg.A03 == -1) {
            cqg.A03 = 1;
        }
        bis.A0Y = true;
        dae.A06();
        DTP dtp = bis.A0Q;
        dtp.A0D.removeCallbacks(dtp);
        dtp.A09 = false;
        dtp.A05 = false;
        dtp.A06 = true;
        dtp.A0E.forceFinished(true);
        dtp.A01 = 0.0f;
        dtp.A00 = 0.0f;
    }

    public static void A09(BIS bis) {
        C26022Cqg cqg = bis.A0M.A0T.A09;
        if (cqg.A03 == -1) {
            cqg.A03 = 1;
        }
        DTP dtp = bis.A0Q;
        View view = dtp.A0D;
        view.removeCallbacks(dtp);
        dtp.A06 = false;
        dtp.A05 = true;
        view.postOnAnimation(dtp);
    }

    public static boolean A0A(BIS bis, float f, float f2, float f3) {
        float f4 = bis.A0B * f;
        int i = bis.A0G;
        while (f4 > 2.0f) {
            f4 /= 2.0f;
            i++;
        }
        while (f4 < 1.0f) {
            f4 *= 2.0f;
            i--;
        }
        if (bis.A0I((((float) i) + f4) - 1.0f, f2, f3)) {
            bis.A0M.A04();
        }
        return AnonymousClass000.A1O((bis.A06 > 1.0f ? 1 : (bis.A06 == 1.0f ? 0 : -1)));
    }

    public double A0B(double d, long j) {
        double d2 = this.A01 * (((double) this.A0J) / ((double) j));
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    public final void A0C() {
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            this.A0M.A0W.get(i);
        }
        Vector vector = C25782Clt.A02;
        C22787BPa bPa = new C22787BPa();
        C27087DTm.A00(bPa);
        C27087DTm.A01(bPa, (String) null);
    }

    public void A0E(float f, float f2, float f3) {
        if (this.A0W) {
            C26152CtJ ctJ = this.A0M.A0R;
            float[] fArr = this.A0l;
            ctJ.A0A(fArr, f2, f3);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0e;
            matrix.postRotate(f - this.A0A, f2, f3);
            matrix.invert(this.A0f);
            this.A0A = f % 360.0f;
            A03();
            A04(f2, f3, f4, f5);
        }
    }

    public final void A0F(Bundle bundle) {
        C25007CTh cTh = this.A0N;
        DAE dae = new DAE(cTh, this);
        this.A0M = dae;
        D44 d44 = cTh.A02;
        if (d44 == null) {
            float f = dae.A01;
            A05((int) f, (f % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(d44.A02, dae.A01), dae.A00);
            A05((int) min, (min % 1.0f) + 1.0f);
            C20269AEc aEc = d44.A03;
            if (aEc != null) {
                this.A02 = C26152CtJ.A01(aEc.A01);
                this.A03 = C26152CtJ.A00(aEc.A00);
            }
            this.A0A = d44.A00;
        }
        this.A0P = dae.A0S;
        Matrix matrix = this.A0e;
        float f2 = this.A0B;
        matrix.setScale(f2, f2);
        matrix.postRotate(this.A0A);
        matrix.invert(this.A0f);
        A06(bundle);
    }

    public final void A0G(Bundle bundle) {
        if (!this.A0d) {
            bundle.putDouble("xVisibleCenter", this.A02 + ((double) (((long) (0 - this.A0M.A05)) / (this.A0J << 1))));
            double d = this.A03;
            DAE dae = this.A0M;
            bundle.putDouble("yVisibleCenter", d + ((double) (((long) (dae.A06 - dae.A04)) / (this.A0J << 1))));
            bundle.putInt("zoom", this.A0G);
            bundle.putFloat("scale", this.A0B);
            bundle.putFloat("rotation", this.A0A);
            this.A0d = true;
        }
    }

    public void A0H(E46 e46) {
        Queue queue;
        if (!this.A0c || ((queue = this.A0T) != null && !queue.isEmpty())) {
            Queue queue2 = this.A0T;
            if (queue2 == null) {
                queue2 = AnonymousClass8BR.A14();
                this.A0T = queue2;
            }
            queue2.add(e46);
            return;
        }
        e46.Bxa(this.A0M);
    }

    public boolean A0I(float f, float f2, float f3) {
        C26152CtJ ctJ = this.A0M.A0R;
        float[] fArr = this.A0l;
        ctJ.A0A(fArr, f2, f3);
        float f4 = fArr[0];
        float f5 = fArr[1];
        DAE dae = this.A0M;
        float min = Math.min(Math.max(f, dae.A01), dae.A00);
        float f6 = (min % 1.0f) + 1.0f;
        int i = this.A0G;
        float f7 = f6 / this.A0B;
        this.A06 = f7;
        A05((int) min, f6);
        Matrix matrix = this.A0e;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0f);
        A03();
        A04(f2, f3, f4, f5);
        if (this.A0G != i) {
            return true;
        }
        return false;
    }

    public EnumSet getCurrentAttribution() {
        return this.A0g;
    }

    @Deprecated
    public final DAE getMap() {
        return this.A0M;
    }

    public final C25007CTh getMapOptions() {
        return this.A0N;
    }

    public float getPixelSize() {
        return (float) this.A0J;
    }

    public float getTileScale() {
        return this.A0B;
    }

    public float getZoom() {
        return (((float) this.A0G) + this.A0B) - 1.0f;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A06(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z = this.A0d;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (z) {
            return onSaveInstanceState;
        }
        Bundle A0D2 = C17880vN.A0D();
        A0G(A0D2);
        A0D2.putParcelable("parentBundle", onSaveInstanceState);
        return A0D2;
    }

    public final void setMapEventHandler(EBQ ebq) {
        if (ebq == null) {
            ebq = EBQ.A00;
        }
        this.A0S = ebq;
    }

    public BIS(Context context, C25007CTh cTh) {
        super(context);
        if ("FacebookMapOptions.java".equals(cTh.A03) && "MapView.java".length() > 0) {
            cTh.A03 = "MapView.java";
        }
        this.A0H = System.nanoTime();
        setWillNotDraw(false);
        this.A0L = context;
        this.A0N = cTh;
        boolean z = cTh.A06;
        cTh.A06 = z;
        this.A0C = z ? -15789542 : -987675;
        CUZ cuz = new CUZ(context, this);
        this.A0R = cuz;
        Matrix matrix = this.A0f;
        cuz.A0J = matrix;
        cuz.A08 = 0.87f;
        this.A0W = this.A0L.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0Z = true;
        DTP dtp = new DTP(this, this);
        this.A0Q = dtp;
        dtp.A04 = matrix;
        C26101CsL.A08.add(AnonymousClass3MW.A0z(this));
        C26101CsL.A02(false);
    }

    public void A0D(double d, double d2) {
        this.A02 = A00(d);
        this.A03 = A0B(d2, this.A0J);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A01();
            this.A0K = System.nanoTime();
            if (!this.A0X) {
                BPX bpx = this.A0M.A0T.A03;
                bpx.A01.set(0);
                bpx.A00.set(0);
                bpx.A01.set(0);
                this.A0X = true;
                return;
            }
            return;
        }
        throw AnonymousClass8BR.A0w("MapView.onCreate() must be called!");
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A03();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        DAE dae = this.A0M;
        BPU bpu = dae.A0G;
        if (bpu != null) {
            bpu.A04.A03();
            bpu.A03();
        }
        dae.A03();
        Vector vector = C25782Clt.A02;
        C22787BPa bPa = new C22787BPa();
        C27087DTm.A00(bPa);
        C27087DTm.A01(bPa, (String) null);
        A02();
    }

    public void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(this.A0C);
        this.A0U = true;
        int size = this.A0M.A0W.size();
        for (int i = 0; i < size; i++) {
            DA3 da3 = (DA3) this.A0M.A0W.get(i);
            if (da3.A04) {
                da3.A08(canvas);
                if (da3 instanceof BPW) {
                    this.A0U &= AnonymousClass000.A1P(((BPS) da3).A00);
                }
            }
        }
        if (this.A0U && this.A0X) {
            new C27312Dbj(this.A0M.A0T.A03, this.A0N.A04);
            this.A0X = false;
        }
        long nanoTime2 = System.nanoTime();
        String str = this.A0N.A04;
        C26138Ct1.A0C.A04(nanoTime2 - nanoTime);
        if (this.A0H > 0) {
            new C27314Dbl(this, str, nanoTime2);
            this.A0H = 0;
        }
        if (this.A0K > 0) {
            new C27315Dbm(this, str, nanoTime2);
            this.A0K = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00bb, code lost:
        if (r1 != false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            long r2 = java.lang.System.nanoTime()
            super.onLayout(r10, r11, r12, r13, r14)
            int r0 = r9.getWidth()
            r9.A0F = r0
            int r5 = r9.getHeight()
            r9.A0D = r5
            int r4 = r9.A0F
            float r0 = (float) r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r9.A04 = r0
            float r0 = (float) r5
            float r0 = r0 / r1
            r9.A05 = r0
            int r0 = java.lang.Math.max(r5, r4)
            double r4 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            X.DAE r6 = r9.A0M
            int r0 = r6.A0N
            double r0 = (double) r0
            int r0 = X.BE7.A03(r4, r0)
            double r0 = (double) r0
            double r4 = java.lang.Math.log(r0)
            double r0 = A0n
            double r4 = r4 / r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
            r9.A07 = r0
            float r1 = r6.A01
            X.BIS r0 = r6.A0Q
            float r0 = r0.A07
            float r4 = java.lang.Math.max(r1, r0)
            r6.A01 = r4
            int r0 = r9.A0G
            float r1 = (float) r0
            float r0 = r9.A0B
            float r1 = r1 + r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r6
            r8 = 1
            r5 = 0
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
            int r0 = (int) r4
            float r4 = r4 % r6
            float r4 = r4 + r6
            r9.A05(r0, r4)
            r1 = 1
        L_0x0061:
            r9.A03()
            boolean r0 = r9.A0c
            if (r0 != 0) goto L_0x00bb
            int r0 = r9.A0G
            float r4 = (float) r0
            float r0 = r9.A0B
            float r4 = r4 + r0
            float r4 = r4 - r6
            X.DAE r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            boolean r0 = r9.A0I(r4, r1, r0)
            if (r0 == 0) goto L_0x0084
            X.DAE r0 = r9.A0M
            r0.A04()
        L_0x0084:
            double r6 = r9.A02
            double r0 = r9.A03
            r9.A0D(r6, r0)
            float r4 = r9.A0A
            X.DAE r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            r9.A0E(r4, r1, r0)
            r9.A0c = r8
        L_0x009c:
            X.DAE r0 = r9.A0M
            r0.A04()
        L_0x00a1:
            X.DAE r0 = r9.A0M
            java.util.List r0 = r0.A0W
            int r1 = r0.size()
        L_0x00a9:
            if (r5 >= r1) goto L_0x00c0
            X.DAE r0 = r9.A0M
            java.util.List r0 = r0.A0W
            java.lang.Object r0 = r0.get(r5)
            X.DA3 r0 = (X.DA3) r0
            r0.A04()
            int r5 = r5 + 1
            goto L_0x00a9
        L_0x00bb:
            if (r1 == 0) goto L_0x00a1
            goto L_0x009c
        L_0x00be:
            r1 = 0
            goto L_0x0061
        L_0x00c0:
            java.util.Queue r0 = r9.A0T
            if (r0 == 0) goto L_0x00ce
            X.BPb r1 = new X.BPb
            r1.<init>(r9)
            android.os.Handler r0 = X.C26096CsG.A01
            r0.post(r1)
        L_0x00ce:
            X.Ct1 r0 = X.C26138Ct1.A0E
            X.BE8.A0z(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIS.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.BPR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v56, resolved type: X.BPT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: X.BPT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: X.BPT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v83, resolved type: X.BPR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v84, resolved type: X.BPR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v85, resolved type: X.BPT} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: X.BPT} */
    /* JADX WARNING: type inference failed for: r4v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b1, code lost:
        if (X.C108945cZ.A00(r4.A0C, r4.A0A) <= r8) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03bd, code lost:
        if (r14 != 0.0f) goto L_0x03bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x042f, code lost:
        if (r12 <= (r1 + r2)) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0075, code lost:
        if (X.C108945cZ.A00(r11, r4.A01) <= r3) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        if (X.C108945cZ.A00(r11, r4.A0A) <= r13) goto L_0x028f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x037e A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03c2 A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x03d4 A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x03fc A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x049b A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x04a0 A[Catch:{ all -> 0x04b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013f A[Catch:{ all -> 0x04b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            r20 = this;
            long r15 = java.lang.System.nanoTime()
            r0 = r20
            X.CUZ r4 = r0.A0R     // Catch:{ all -> 0x04b1 }
            r7 = r21
            int r8 = r7.getActionMasked()     // Catch:{ all -> 0x04b1 }
            int r10 = r7.getPointerCount()     // Catch:{ all -> 0x04b1 }
            long r0 = r7.getEventTime()     // Catch:{ all -> 0x04b1 }
            float r9 = r7.getX()     // Catch:{ all -> 0x04b1 }
            float r11 = r7.getY()     // Catch:{ all -> 0x04b1 }
            boolean r2 = r4.A0Q     // Catch:{ all -> 0x04b1 }
            java.lang.String r5 = "longPressTimeout"
            r12 = 2
            r3 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0049
            if (r8 != r12) goto L_0x0042
            if (r10 > r6) goto L_0x0042
            float r2 = r4.A09     // Catch:{ all -> 0x04b1 }
            float r14 = X.C108945cZ.A00(r9, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = r4.A0R     // Catch:{ all -> 0x04b1 }
            float r13 = (float) r2     // Catch:{ all -> 0x04b1 }
            int r2 = (r14 > r13 ? 1 : (r14 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x0042
            float r2 = r4.A0A     // Catch:{ all -> 0x04b1 }
            float r2 = X.C108945cZ.A00(r11, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x028f
        L_0x0042:
            r4.A0Q = r3     // Catch:{ all -> 0x04b1 }
            android.os.Handler r2 = X.C26096CsG.A01     // Catch:{ all -> 0x04b1 }
            r2.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x04b1 }
        L_0x0049:
            if (r8 == r12) goto L_0x028f
            if (r8 != 0) goto L_0x00eb
            r4.A0N = r3     // Catch:{ all -> 0x04b1 }
            r4.A0M = r3     // Catch:{ all -> 0x04b1 }
            boolean r2 = r4.A0O     // Catch:{ all -> 0x04b1 }
            if (r2 == 0) goto L_0x0077
            long r2 = r4.A0G     // Catch:{ all -> 0x04b1 }
            long r12 = r0 - r2
            int r2 = r4.A0E     // Catch:{ all -> 0x04b1 }
            long r2 = (long) r2     // Catch:{ all -> 0x04b1 }
            int r8 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r8 > 0) goto L_0x0077
            float r2 = r4.A00     // Catch:{ all -> 0x04b1 }
            float r8 = X.C108945cZ.A00(r9, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = r4.A0D     // Catch:{ all -> 0x04b1 }
            float r3 = (float) r2     // Catch:{ all -> 0x04b1 }
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0077
            float r2 = r4.A01     // Catch:{ all -> 0x04b1 }
            float r2 = X.C108945cZ.A00(r11, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0080
        L_0x0077:
            r2 = 0
            r4.A0O = r2     // Catch:{ all -> 0x04b1 }
            r4.A00 = r9     // Catch:{ all -> 0x04b1 }
            r4.A01 = r11     // Catch:{ all -> 0x04b1 }
            r4.A0G = r0     // Catch:{ all -> 0x04b1 }
        L_0x0080:
            r4.A09 = r9     // Catch:{ all -> 0x04b1 }
            r4.A0A = r11     // Catch:{ all -> 0x04b1 }
            r4.A0Q = r6     // Catch:{ all -> 0x04b1 }
            X.DTm r8 = r4.A0T     // Catch:{ all -> 0x04b1 }
            long r2 = r4.A0S     // Catch:{ all -> 0x04b1 }
            android.os.Handler r6 = X.C26096CsG.A01     // Catch:{ all -> 0x04b1 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04b1 }
            long r0 = r0 + r2
            r6.postAtTime(r8, r5, r0)     // Catch:{ all -> 0x04b1 }
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x00b3
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()     // Catch:{ all -> 0x04b1 }
            r4.A0K = r0     // Catch:{ all -> 0x04b1 }
        L_0x009e:
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            r0.addMovement(r7)     // Catch:{ all -> 0x04b1 }
            X.E0f r7 = r4.A0L     // Catch:{ all -> 0x04b1 }
            X.BIS r7 = (X.BIS) r7     // Catch:{ all -> 0x04b1 }
            r0 = 0
            r7.A0V = r0     // Catch:{ all -> 0x04b1 }
            X.DAE r0 = r7.A0M     // Catch:{ all -> 0x04b1 }
            java.util.List r6 = r0.A0W     // Catch:{ all -> 0x04b1 }
            int r5 = X.AnonymousClass3MX.A01(r6)     // Catch:{ all -> 0x04b1 }
            goto L_0x00b7
        L_0x00b3:
            r0.clear()     // Catch:{ all -> 0x04b1 }
            goto L_0x009e
        L_0x00b7:
            r4 = 0
            r3 = 0
        L_0x00b9:
            if (r5 < 0) goto L_0x00d3
            java.lang.Object r2 = r6.get(r5)     // Catch:{ all -> 0x04b1 }
            X.DA3 r2 = (X.DA3) r2     // Catch:{ all -> 0x04b1 }
            boolean r0 = r2.A04     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x00d0
            int r1 = r2.A06(r9, r11)     // Catch:{ all -> 0x04b1 }
            r0 = 2
            if (r1 == r0) goto L_0x00d4
            if (r1 <= r3) goto L_0x00d0
            r4 = r2
            r3 = 1
        L_0x00d0:
            int r5 = r5 + -1
            goto L_0x00b9
        L_0x00d3:
            r2 = r4
        L_0x00d4:
            r7.A0O = r2     // Catch:{ all -> 0x04b1 }
            if (r2 == 0) goto L_0x04a9
            boolean r0 = r2 instanceof X.BPT     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x00e6
            X.BPT r2 = (X.BPT) r2     // Catch:{ all -> 0x04b1 }
            boolean r0 = r2.A0H     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04a9
            r0 = 1
            r2.A0I = r0     // Catch:{ all -> 0x04b1 }
            goto L_0x0150
        L_0x00e6:
            boolean r0 = r2 instanceof X.BPR     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04a9
            goto L_0x0150
        L_0x00eb:
            if (r8 != r6) goto L_0x0268
            r4.A0F = r3     // Catch:{ all -> 0x04b1 }
            long r2 = r4.A0I     // Catch:{ all -> 0x04b1 }
            long r12 = r0 - r2
            int r2 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x04b1 }
            long r2 = (long) r2     // Catch:{ all -> 0x04b1 }
            int r5 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x015f
            X.E0f r3 = r4.A0L     // Catch:{ all -> 0x04b1 }
            X.BIS r3 = (X.BIS) r3     // Catch:{ all -> 0x04b1 }
            A07(r3)     // Catch:{ all -> 0x04b1 }
            X.C65 r0 = r3.A0P     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x011f
            X.DAE r5 = r3.A0M     // Catch:{ all -> 0x04b1 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.CXL r2 = new X.CXL     // Catch:{ all -> 0x04b1 }
            r2.<init>()     // Catch:{ all -> 0x04b1 }
            r2.A02 = r0     // Catch:{ all -> 0x04b1 }
            r0 = 0
            X.DA4 r1 = new X.DA4     // Catch:{ all -> 0x04b1 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x04b1 }
        L_0x011a:
            r0 = 200(0xc8, float:2.8E-43)
            r5.A0A(r2, r1, r0)     // Catch:{ all -> 0x04b1 }
        L_0x011f:
            boolean r0 = r4.A0O     // Catch:{ all -> 0x04b1 }
            r0 = r0 ^ 1
            r4.A0O = r0     // Catch:{ all -> 0x04b1 }
            X.E0f r1 = r4.A0L     // Catch:{ all -> 0x04b1 }
            X.BIS r1 = (X.BIS) r1     // Catch:{ all -> 0x04b1 }
            A07(r1)     // Catch:{ all -> 0x04b1 }
            boolean r0 = r1.A0V     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x013b
            X.DTP r0 = r1.A0Q     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A05     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x013b
            X.DAE r0 = r1.A0M     // Catch:{ all -> 0x04b1 }
            r0.A04()     // Catch:{ all -> 0x04b1 }
        L_0x013b:
            X.DA3 r2 = r1.A0O     // Catch:{ all -> 0x04b1 }
            if (r2 == 0) goto L_0x04a9
            boolean r0 = r2 instanceof X.BPT     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x0155
            X.BPT r2 = (X.BPT) r2     // Catch:{ all -> 0x04b1 }
            boolean r0 = r2.A0H     // Catch:{ all -> 0x04b1 }
            r1 = 0
            if (r0 == 0) goto L_0x04a9
            boolean r0 = r2.A0I     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04a9
            r2.A0I = r1     // Catch:{ all -> 0x04b1 }
        L_0x0150:
            r2.A03()     // Catch:{ all -> 0x04b1 }
            goto L_0x04a9
        L_0x0155:
            boolean r0 = r2 instanceof X.BPR     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04a9
            X.BPR r2 = (X.BPR) r2     // Catch:{ all -> 0x04b1 }
            r0 = 0
            r2.A04 = r0     // Catch:{ all -> 0x04b1 }
            goto L_0x0150
        L_0x015f:
            boolean r2 = r4.A0O     // Catch:{ all -> 0x04b1 }
            java.lang.String r5 = "clickTimeout"
            if (r2 == 0) goto L_0x01c1
            long r2 = r4.A0G     // Catch:{ all -> 0x04b1 }
            long r12 = r0 - r2
            int r2 = r4.A0E     // Catch:{ all -> 0x04b1 }
            long r2 = (long) r2     // Catch:{ all -> 0x04b1 }
            int r6 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01c1
            float r2 = r4.A00     // Catch:{ all -> 0x04b1 }
            float r6 = X.C108945cZ.A00(r9, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = r4.A0D     // Catch:{ all -> 0x04b1 }
            float r3 = (float) r2     // Catch:{ all -> 0x04b1 }
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x01c1
            float r2 = r4.A01     // Catch:{ all -> 0x04b1 }
            float r2 = X.C108945cZ.A00(r11, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x01c1
            android.os.Handler r0 = X.C26096CsG.A01     // Catch:{ all -> 0x04b1 }
            r0.removeCallbacksAndMessages(r5)     // Catch:{ all -> 0x04b1 }
            X.E0f r3 = r4.A0L     // Catch:{ all -> 0x04b1 }
            float r2 = r4.A00     // Catch:{ all -> 0x04b1 }
            float r1 = r4.A01     // Catch:{ all -> 0x04b1 }
            X.BIS r3 = (X.BIS) r3     // Catch:{ all -> 0x04b1 }
            A07(r3)     // Catch:{ all -> 0x04b1 }
            X.C65 r0 = r3.A0P     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x011f
            int r2 = (int) r2     // Catch:{ all -> 0x04b1 }
            int r0 = (int) r1     // Catch:{ all -> 0x04b1 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x04b1 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x04b1 }
            X.DAE r5 = r3.A0M     // Catch:{ all -> 0x04b1 }
            r0 = 1065353216(0x3f800000, float:1.0)
            X.CXL r2 = new X.CXL     // Catch:{ all -> 0x04b1 }
            r2.<init>()     // Catch:{ all -> 0x04b1 }
            r2.A02 = r0     // Catch:{ all -> 0x04b1 }
            int r0 = r1.x     // Catch:{ all -> 0x04b1 }
            float r0 = (float) r0     // Catch:{ all -> 0x04b1 }
            r2.A03 = r0     // Catch:{ all -> 0x04b1 }
            int r0 = r1.y     // Catch:{ all -> 0x04b1 }
            float r0 = (float) r0     // Catch:{ all -> 0x04b1 }
            r2.A04 = r0     // Catch:{ all -> 0x04b1 }
            r0 = 1
            X.DA4 r1 = new X.DA4     // Catch:{ all -> 0x04b1 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x04b1 }
            goto L_0x011a
        L_0x01c1:
            boolean r2 = r4.A0N     // Catch:{ all -> 0x04b1 }
            if (r2 != 0) goto L_0x01da
            boolean r2 = r4.A0Q     // Catch:{ all -> 0x04b1 }
            if (r2 != 0) goto L_0x01da
            X.DTm r3 = r4.A0U     // Catch:{ all -> 0x04b1 }
            int r0 = r4.A0E     // Catch:{ all -> 0x04b1 }
            long r6 = (long) r0     // Catch:{ all -> 0x04b1 }
            android.os.Handler r2 = X.C26096CsG.A01     // Catch:{ all -> 0x04b1 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04b1 }
            long r0 = r0 + r6
            r2.postAtTime(r3, r5, r0)     // Catch:{ all -> 0x04b1 }
            goto L_0x011f
        L_0x01da:
            long r2 = r4.A0H     // Catch:{ all -> 0x04b1 }
            long r0 = r0 - r2
            int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x04b1 }
            long r5 = (long) r2     // Catch:{ all -> 0x04b1 }
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x0206
            boolean r0 = r4.A0M     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x0206
            X.E0f r2 = r4.A0L     // Catch:{ all -> 0x04b1 }
            X.BIS r2 = (X.BIS) r2     // Catch:{ all -> 0x04b1 }
            X.C65 r0 = r2.A0P     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x0206
            r0 = 0
            r2.A0Y = r0     // Catch:{ all -> 0x04b1 }
            X.DTP r1 = r2.A0Q     // Catch:{ all -> 0x04b1 }
            r0 = 1
            r1.A07 = r0     // Catch:{ all -> 0x04b1 }
            A09(r2)     // Catch:{ all -> 0x04b1 }
            X.EBQ r1 = r2.A0S     // Catch:{ all -> 0x04b1 }
            java.lang.String r0 = "zoom"
            r1.CHV(r0)     // Catch:{ all -> 0x04b1 }
        L_0x0206:
            boolean r0 = r4.A0N     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x011f
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            r0.addMovement(r7)     // Catch:{ all -> 0x04b1 }
            android.view.VelocityTracker r1 = r4.A0K     // Catch:{ all -> 0x04b1 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)     // Catch:{ all -> 0x04b1 }
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            float r5 = r0.getXVelocity()     // Catch:{ all -> 0x04b1 }
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            float r6 = r0.getYVelocity()     // Catch:{ all -> 0x04b1 }
            float r1 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x04b1 }
            float r0 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x04b1 }
            float r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x04b1 }
            float r0 = r4.A07     // Catch:{ all -> 0x04b1 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x011f
            X.E0f r3 = r4.A0L     // Catch:{ all -> 0x04b1 }
            float r2 = r4.A08     // Catch:{ all -> 0x04b1 }
            float r5 = r5 * r2
            float r2 = r2 * r6
            X.BIS r3 = (X.BIS) r3     // Catch:{ all -> 0x04b1 }
            X.C65 r0 = r3.A0P     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x011f
            r0 = 0
            r3.A0Y = r0     // Catch:{ all -> 0x04b1 }
            X.DTP r1 = r3.A0Q     // Catch:{ all -> 0x04b1 }
            int r6 = r3.A0F     // Catch:{ all -> 0x04b1 }
            int r7 = r3.A0D     // Catch:{ all -> 0x04b1 }
            int r8 = (int) r5     // Catch:{ all -> 0x04b1 }
            int r9 = (int) r2     // Catch:{ all -> 0x04b1 }
            android.widget.OverScroller r5 = r1.A0E     // Catch:{ all -> 0x04b1 }
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = r10
            r13 = r11
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x04b1 }
            r0 = 1
            r1.A08 = r0     // Catch:{ all -> 0x04b1 }
            A09(r3)     // Catch:{ all -> 0x04b1 }
            X.EBQ r1 = r3.A0S     // Catch:{ all -> 0x04b1 }
            java.lang.String r0 = "pan"
            r1.CHV(r0)     // Catch:{ all -> 0x04b1 }
            goto L_0x011f
        L_0x0268:
            r2 = 5
            if (r8 != r2) goto L_0x026f
            r4.A0I = r0     // Catch:{ all -> 0x04b1 }
            goto L_0x04a9
        L_0x026f:
            r2 = 6
            if (r8 != r2) goto L_0x027e
            if (r10 != r12) goto L_0x04a9
            r4.A0H = r0     // Catch:{ all -> 0x04b1 }
            boolean r0 = r4.A0P     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x04a9
            r4.A0M = r3     // Catch:{ all -> 0x04b1 }
            goto L_0x04a9
        L_0x027e:
            r0 = 3
            if (r8 != r0) goto L_0x04a9
            r4.A0F = r3     // Catch:{ all -> 0x04b1 }
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04a9
            r0.recycle()     // Catch:{ all -> 0x04b1 }
            r0 = 0
            r4.A0K = r0     // Catch:{ all -> 0x04b1 }
            goto L_0x04a9
        L_0x028f:
            r19 = 0
            r1 = 0
            r6 = 0
            r5 = 0
        L_0x0294:
            if (r1 >= r10) goto L_0x02a3
            float r0 = r7.getX(r1)     // Catch:{ all -> 0x04b1 }
            float r6 = r6 + r0
            float r0 = r7.getY(r1)     // Catch:{ all -> 0x04b1 }
            float r5 = r5 + r0
            int r1 = r1 + 1
            goto L_0x0294
        L_0x02a3:
            float r13 = (float) r10     // Catch:{ all -> 0x04b1 }
            float r6 = r6 / r13
            float r5 = r5 / r13
            r12 = 0
            r8 = 0
        L_0x02a8:
            if (r12 >= r10) goto L_0x02bf
            float r0 = r7.getX(r12)     // Catch:{ all -> 0x04b1 }
            float r0 = r0 - r6
            double r2 = (double) r0     // Catch:{ all -> 0x04b1 }
            float r0 = r7.getY(r12)     // Catch:{ all -> 0x04b1 }
            float r0 = r0 - r5
            double r0 = (double) r0     // Catch:{ all -> 0x04b1 }
            double r0 = java.lang.Math.hypot(r2, r0)     // Catch:{ all -> 0x04b1 }
            float r2 = (float) r0     // Catch:{ all -> 0x04b1 }
            float r8 = r8 + r2
            int r12 = r12 + 1
            goto L_0x02a8
        L_0x02bf:
            float r8 = r8 / r13
            r4.A0B = r6     // Catch:{ all -> 0x04b1 }
            r4.A0C = r5     // Catch:{ all -> 0x04b1 }
            android.graphics.Matrix r2 = r4.A0J     // Catch:{ all -> 0x04b1 }
            if (r2 == 0) goto L_0x02e2
            float[] r1 = r4.A0V     // Catch:{ all -> 0x04b1 }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x04b1 }
            r12 = 1
            r1[r12] = r5     // Catch:{ all -> 0x04b1 }
            r2.mapPoints(r1)     // Catch:{ all -> 0x04b1 }
            r6 = r1[r0]     // Catch:{ all -> 0x04b1 }
            r5 = r1[r12]     // Catch:{ all -> 0x04b1 }
        L_0x02d7:
            int r0 = r4.A0F     // Catch:{ all -> 0x04b1 }
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r10 == r0) goto L_0x0306
            r4.A02 = r8     // Catch:{ all -> 0x04b1 }
            r4.A06 = r2     // Catch:{ all -> 0x04b1 }
            goto L_0x02e4
        L_0x02e2:
            r12 = 1
            goto L_0x02d7
        L_0x02e4:
            if (r10 <= r12) goto L_0x02fd
            float r0 = r7.getY(r12)     // Catch:{ all -> 0x04b1 }
            float r11 = r11 - r0
            double r0 = (double) r11     // Catch:{ all -> 0x04b1 }
            float r2 = r7.getX(r12)     // Catch:{ all -> 0x04b1 }
            float r9 = r9 - r2
            double r2 = (double) r9     // Catch:{ all -> 0x04b1 }
            double r0 = java.lang.Math.atan2(r0, r2)     // Catch:{ all -> 0x04b1 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x04b1 }
            float r2 = (float) r0     // Catch:{ all -> 0x04b1 }
            r4.A05 = r2     // Catch:{ all -> 0x04b1 }
        L_0x02fd:
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x04a3
            r0.clear()     // Catch:{ all -> 0x04b1 }
            goto L_0x04a3
        L_0x0306:
            float r3 = r4.A06     // Catch:{ all -> 0x04b1 }
            if (r10 <= r12) goto L_0x0384
            float r1 = r4.A02     // Catch:{ all -> 0x04b1 }
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0313
            float r17 = r8 / r1
            goto L_0x0315
        L_0x0313:
            r17 = 1065353216(0x3f800000, float:1.0)
        L_0x0315:
            float r12 = r17 / r3
            float r0 = X.C108945cZ.A00(r12, r2)     // Catch:{ all -> 0x04b1 }
            double r0 = (double) r0
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            boolean r18 = X.AnonymousClass000.A1R(r2)
            boolean r0 = r4.A0P     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x035d
            r1 = 1
            float r0 = r7.getY(r1)     // Catch:{ all -> 0x04b1 }
            float r11 = r11 - r0
            double r2 = (double) r11     // Catch:{ all -> 0x04b1 }
            float r0 = r7.getX(r1)     // Catch:{ all -> 0x04b1 }
            float r9 = r9 - r0
            double r0 = (double) r9     // Catch:{ all -> 0x04b1 }
            double r0 = java.lang.Math.atan2(r2, r0)     // Catch:{ all -> 0x04b1 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x04b1 }
            float r2 = (float) r0     // Catch:{ all -> 0x04b1 }
            int r0 = r4.A0F     // Catch:{ all -> 0x04b1 }
            if (r0 == r10) goto L_0x0347
            r4.A05 = r2     // Catch:{ all -> 0x04b1 }
        L_0x0347:
            float r0 = r4.A05     // Catch:{ all -> 0x04b1 }
            float r3 = r2 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0355
            float r3 = r3 - r1
            goto L_0x0360
        L_0x0355:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0360
            float r3 = r3 + r1
            goto L_0x0360
        L_0x035d:
            r0 = 0
            goto L_0x0371
        L_0x0360:
            r4.A05 = r2     // Catch:{ all -> 0x04b1 }
            float r0 = java.lang.Math.abs(r3)     // Catch:{ all -> 0x04b1 }
            double r0 = (double) r0     // Catch:{ all -> 0x04b1 }
            r13 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x035d
            r0 = 0
            r4.A0I = r0     // Catch:{ all -> 0x04b1 }
        L_0x0371:
            float r2 = r4.A02     // Catch:{ all -> 0x04b1 }
            float r3 = X.C108945cZ.A00(r8, r2)     // Catch:{ all -> 0x04b1 }
            int r2 = r4.A0R     // Catch:{ all -> 0x04b1 }
            float r2 = (float) r2     // Catch:{ all -> 0x04b1 }
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0380
            r4.A0I = r0     // Catch:{ all -> 0x04b1 }
        L_0x0380:
            r2 = r12
            r3 = r17
            goto L_0x0386
        L_0x0384:
            r18 = 0
        L_0x0386:
            float r0 = r4.A03     // Catch:{ all -> 0x04b1 }
            float r17 = r6 - r0
            float r0 = r4.A04     // Catch:{ all -> 0x04b1 }
            float r14 = r5 - r0
            boolean r0 = r4.A0N     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x03aa
            float r1 = r4.A0B     // Catch:{ all -> 0x04b1 }
            float r0 = r4.A09     // Catch:{ all -> 0x04b1 }
            float r1 = X.C108945cZ.A00(r1, r0)     // Catch:{ all -> 0x04b1 }
            int r0 = r4.A0R     // Catch:{ all -> 0x04b1 }
            float r8 = (float) r0     // Catch:{ all -> 0x04b1 }
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x03bf
            float r1 = r4.A0C     // Catch:{ all -> 0x04b1 }
            float r0 = r4.A0A     // Catch:{ all -> 0x04b1 }
            float r0 = X.C108945cZ.A00(r1, r0)     // Catch:{ all -> 0x04b1 }
            goto L_0x03af
        L_0x03aa:
            boolean r0 = r4.A0M     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x03b3
            goto L_0x03b7
        L_0x03af:
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x03bf
        L_0x03b3:
            r11 = 0
            if (r18 == 0) goto L_0x03f7
            goto L_0x03c3
        L_0x03b7:
            int r0 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r0 != 0) goto L_0x03bf
            int r0 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x03b3
        L_0x03bf:
            r11 = 1
            if (r18 == 0) goto L_0x03f7
            r11 = 0
        L_0x03c3:
            X.E0f r8 = r4.A0L     // Catch:{ all -> 0x04b1 }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 * r2
            float r9 = r4.A0B     // Catch:{ all -> 0x04b1 }
            float r2 = r4.A0C     // Catch:{ all -> 0x04b1 }
            X.BIS r8 = (X.BIS) r8     // Catch:{ all -> 0x04b1 }
            X.C65 r0 = r8.A0P     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x03f3
            A08(r8)     // Catch:{ all -> 0x04b1 }
            r8.A08 = r9     // Catch:{ all -> 0x04b1 }
            r8.A09 = r2     // Catch:{ all -> 0x04b1 }
            boolean r0 = A0A(r8, r1, r9, r2)     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x03f0
            boolean r0 = r8.A0Z     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x03f0
            X.DTP r2 = r8.A0Q     // Catch:{ all -> 0x04b1 }
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r0
            r2.A01 = r1     // Catch:{ all -> 0x04b1 }
            r0 = 0
            r2.A03 = r0     // Catch:{ all -> 0x04b1 }
        L_0x03f0:
            r8.invalidate()     // Catch:{ all -> 0x04b1 }
        L_0x03f3:
            r4.A06 = r3     // Catch:{ all -> 0x04b1 }
            r0 = 1
            goto L_0x03f8
        L_0x03f7:
            r0 = 0
        L_0x03f8:
            r4.A0M = r0     // Catch:{ all -> 0x04b1 }
            if (r11 == 0) goto L_0x04a0
            X.E0f r8 = r4.A0L     // Catch:{ all -> 0x04b1 }
            float r13 = r4.A0B     // Catch:{ all -> 0x04b1 }
            float r12 = r4.A0C     // Catch:{ all -> 0x04b1 }
            float r9 = r4.A08     // Catch:{ all -> 0x04b1 }
            float r17 = r17 * r9
            float r9 = r9 * r14
            X.BIS r8 = (X.BIS) r8     // Catch:{ all -> 0x04b1 }
            X.DA3 r11 = r8.A0O     // Catch:{ all -> 0x04b1 }
            if (r11 == 0) goto L_0x0437
            boolean r0 = r11 instanceof X.BPR     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x0437
            X.BPR r11 = (X.BPR) r11     // Catch:{ all -> 0x04b1 }
            boolean r0 = r11.A04     // Catch:{ all -> 0x04b1 }
            r3 = 0
            if (r0 == 0) goto L_0x0437
            float r1 = r11.A01     // Catch:{ all -> 0x04b1 }
            float r2 = r11.A02     // Catch:{ all -> 0x04b1 }
            float r0 = r1 - r2
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0431
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0431
            float r1 = r11.A03     // Catch:{ all -> 0x04b1 }
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0431
            float r1 = r1 + r2
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0437
        L_0x0431:
            r11.A04 = r3     // Catch:{ all -> 0x04b1 }
            r11.A03()     // Catch:{ all -> 0x04b1 }
            goto L_0x0497
        L_0x0437:
            X.C65 r0 = r8.A0P     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x0497
            r14 = 1
            r8.requestDisallowInterceptTouchEvent(r14)     // Catch:{ all -> 0x04b1 }
            A08(r8)     // Catch:{ all -> 0x04b1 }
            double r0 = r8.A02     // Catch:{ all -> 0x04b1 }
            long r2 = r8.A0J     // Catch:{ all -> 0x04b1 }
            float r13 = (float) r2     // Catch:{ all -> 0x04b1 }
            float r11 = r17 / r13
            double r11 = (double) r11     // Catch:{ all -> 0x04b1 }
            double r0 = r0 - r11
            double r0 = A00(r0)     // Catch:{ all -> 0x04b1 }
            r8.A02 = r0     // Catch:{ all -> 0x04b1 }
            double r0 = r8.A03     // Catch:{ all -> 0x04b1 }
            float r11 = r9 / r13
            double r11 = (double) r11     // Catch:{ all -> 0x04b1 }
            double r0 = r0 - r11
            double r0 = r8.A0B(r0, r2)     // Catch:{ all -> 0x04b1 }
            r8.A03 = r0     // Catch:{ all -> 0x04b1 }
            r8.invalidate()     // Catch:{ all -> 0x04b1 }
            X.DAE r11 = r8.A0M     // Catch:{ all -> 0x04b1 }
            X.E44 r0 = r11.A09     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x0470
            java.util.ArrayList r0 = r11.A0V     // Catch:{ all -> 0x04b1 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04b1 }
            if (r0 != 0) goto L_0x0495
        L_0x0470:
            float r0 = java.lang.Math.abs(r17)     // Catch:{ all -> 0x04b1 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0482
            float r0 = java.lang.Math.abs(r9)     // Catch:{ all -> 0x04b1 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0495
        L_0x0482:
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04b1 }
            long r0 = r8.A0I     // Catch:{ all -> 0x04b1 }
            long r17 = r2 - r0
            r12 = 200(0xc8, double:9.9E-322)
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x0495
            r11.A04()     // Catch:{ all -> 0x04b1 }
            r8.A0I = r2     // Catch:{ all -> 0x04b1 }
        L_0x0495:
            r8.A0V = r14     // Catch:{ all -> 0x04b1 }
        L_0x0497:
            android.view.VelocityTracker r0 = r4.A0K     // Catch:{ all -> 0x04b1 }
            if (r0 == 0) goto L_0x049e
            r0.addMovement(r7)     // Catch:{ all -> 0x04b1 }
        L_0x049e:
            r0 = 1
            goto L_0x04a1
        L_0x04a0:
            r0 = 0
        L_0x04a1:
            r4.A0N = r0     // Catch:{ all -> 0x04b1 }
        L_0x04a3:
            r4.A03 = r6     // Catch:{ all -> 0x04b1 }
            r4.A04 = r5     // Catch:{ all -> 0x04b1 }
            r4.A0F = r10     // Catch:{ all -> 0x04b1 }
        L_0x04a9:
            r3 = 1
            X.Ct1 r2 = X.C26138Ct1.A0N
            r0 = r15
            X.BE8.A0z(r2, r0)
            return r3
        L_0x04b1:
            r3 = move-exception
            X.Ct1 r2 = X.C26138Ct1.A0N
            r0 = r15
            X.BE8.A0z(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BIS.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A01();
        } else {
            A02();
        }
    }

    public void setOnFirstTileLoadedCallback(C28412E0d e0d) {
        this.A0a = e0d;
    }
}
