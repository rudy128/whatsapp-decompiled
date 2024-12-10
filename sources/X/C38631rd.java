package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.View;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1rd  reason: invalid class name and case insensitive filesystem */
public class C38631rd extends Drawable implements Animatable, Drawable.Callback {
    public static final boolean A0j;
    public static final Executor A0k = new ThreadPoolExecutor(0, 2, 35, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new C38641re());
    public float A00;
    public Bitmap A01;
    public Canvas A02;
    public Matrix A03;
    public Matrix A04;
    public Paint A05;
    public Rect A06;
    public Rect A07;
    public Rect A08;
    public RectF A09;
    public RectF A0A;
    public RectF A0B;
    public Handler A0C;
    public C49342Qc A0D;
    public C122996Ss A0E;
    public AnonymousClass3KF A0F;
    public C39801tf A0G;
    public C38661rg A0H = C38661rg.AUTOMATIC;
    public AnonymousClass2RZ A0I;
    public C24983CSi A0J;
    public C25577CiH A0K;
    public BN4 A0L;
    public Integer A0M = AnonymousClass00R.A00;
    public Runnable A0N;
    public String A0O;
    public String A0P;
    public Map A0Q;
    public boolean A0R = true;
    public boolean A0S;
    public boolean A0T = false;
    public boolean A0U;
    public boolean A0V = false;
    public boolean A0W = false;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z = false;
    public boolean A0a = true;
    public boolean A0b = false;
    public int A0c = 255;
    public final C38651rf A0d;
    public final ArrayList A0e = new ArrayList();
    public final Semaphore A0f;
    public final ValueAnimator.AnimatorUpdateListener A0g;
    public final Matrix A0h = new Matrix();
    public final Runnable A0i;

    public int getOpacity() {
        return -3;
    }

    static {
        boolean z = false;
        if (Build.VERSION.SDK_INT <= 25) {
            z = true;
        }
        A0j = z;
    }

    private void A00(Canvas canvas) {
        BN4 bn4 = this.A0L;
        C39801tf r6 = this.A0G;
        if (bn4 != null && r6 != null) {
            Matrix matrix = this.A0h;
            matrix.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                matrix.preScale(((float) bounds.width()) / ((float) r6.A04.width()), ((float) bounds.height()) / ((float) r6.A04.height()));
                matrix.preTranslate((float) bounds.left, (float) bounds.top);
            }
            bn4.BJJ(canvas, matrix, this.A0c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00da, code lost:
        if ((!((android.view.ViewGroup) r1).getClipChildren()) != false) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0141  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.graphics.Canvas r10, X.BN4 r11) {
        /*
            r9 = this;
            X.1tf r0 = r9.A0G
            if (r0 == 0) goto L_0x0189
            android.graphics.Canvas r0 = r9.A02
            if (r0 != 0) goto L_0x004e
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r9.A02 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.A0B = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r9.A03 = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r9.A04 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A06 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.A09 = r0
            X.BEt r0 = new X.BEt
            r0.<init>()
            r9.A05 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A08 = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.A07 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.A0A = r0
        L_0x004e:
            android.graphics.Matrix r0 = r9.A03
            r10.getMatrix(r0)
            android.graphics.Rect r0 = r9.A06
            r10.getClipBounds(r0)
            android.graphics.Rect r5 = r9.A06
            android.graphics.RectF r4 = r9.A09
            int r0 = r5.left
            float r3 = (float) r0
            int r0 = r5.top
            float r2 = (float) r0
            int r0 = r5.right
            float r1 = (float) r0
            int r0 = r5.bottom
            float r0 = (float) r0
            r4.set(r3, r2, r1, r0)
            android.graphics.Matrix r1 = r9.A03
            android.graphics.RectF r0 = r9.A09
            r1.mapRect(r0)
            android.graphics.RectF r1 = r9.A09
            android.graphics.Rect r0 = r9.A06
            A02(r0, r1)
            boolean r0 = r9.A0R
            r3 = 0
            android.graphics.RectF r4 = r9.A0B
            if (r0 == 0) goto L_0x0191
            int r0 = r9.getIntrinsicWidth()
            float r2 = (float) r0
            int r0 = r9.getIntrinsicHeight()
            float r1 = (float) r0
            r0 = 0
            r4.set(r0, r0, r2, r1)
        L_0x008e:
            android.graphics.Matrix r1 = r9.A03
            android.graphics.RectF r0 = r9.A0B
            r1.mapRect(r0)
            android.graphics.Rect r1 = r9.getBounds()
            int r0 = r1.width()
            float r4 = (float) r0
            int r0 = r9.getIntrinsicWidth()
            float r0 = (float) r0
            float r4 = r4 / r0
            int r0 = r1.height()
            float r2 = (float) r0
            int r0 = r9.getIntrinsicHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            android.graphics.RectF r7 = r9.A0B
            float r6 = r7.left
            float r6 = r6 * r4
            float r5 = r7.top
            float r5 = r5 * r2
            float r1 = r7.right
            float r1 = r1 * r4
            float r0 = r7.bottom
            float r0 = r0 * r2
            r7.set(r6, r5, r1, r0)
            android.graphics.drawable.Drawable$Callback r1 = r9.getCallback()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x00dc
            android.view.View r1 = (android.view.View) r1
            android.view.ViewParent r1 = r1.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00dc
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.getClipChildren()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x00ef
        L_0x00dc:
            android.graphics.RectF r8 = r9.A0B
            android.graphics.Rect r7 = r9.A06
            int r0 = r7.left
            float r6 = (float) r0
            int r0 = r7.top
            float r5 = (float) r0
            int r0 = r7.right
            float r1 = (float) r0
            int r0 = r7.bottom
            float r0 = (float) r0
            r8.intersect(r6, r5, r1, r0)
        L_0x00ef:
            android.graphics.RectF r0 = r9.A0B
            float r0 = r0.width()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            android.graphics.RectF r0 = r9.A0B
            float r0 = r0.height()
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r6 = (int) r0
            if (r5 <= 0) goto L_0x0189
            if (r6 <= 0) goto L_0x0189
            android.graphics.Bitmap r0 = r9.A01
            r7 = 1
            if (r0 == 0) goto L_0x018a
            int r0 = r0.getWidth()
            if (r0 < r5) goto L_0x018a
            android.graphics.Bitmap r0 = r9.A01
            int r0 = r0.getHeight()
            if (r0 < r6) goto L_0x018a
            android.graphics.Bitmap r0 = r9.A01
            int r0 = r0.getWidth()
            if (r0 > r5) goto L_0x012e
            android.graphics.Bitmap r0 = r9.A01
            int r0 = r0.getHeight()
            if (r0 <= r6) goto L_0x013d
        L_0x012e:
            android.graphics.Bitmap r0 = r9.A01
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r0, r3, r3, r5, r6)
        L_0x0134:
            r9.A01 = r1
            android.graphics.Canvas r0 = r9.A02
            r0.setBitmap(r1)
            r9.A0V = r7
        L_0x013d:
            boolean r0 = r9.A0V
            if (r0 == 0) goto L_0x0179
            android.graphics.Matrix r7 = r9.A0h
            android.graphics.Matrix r0 = r9.A03
            r7.set(r0)
            r7.preScale(r4, r2)
            android.graphics.RectF r2 = r9.A0B
            float r0 = r2.left
            float r1 = -r0
            float r0 = r2.top
            float r0 = -r0
            r7.postTranslate(r1, r0)
            android.graphics.Bitmap r0 = r9.A01
            r0.eraseColor(r3)
            android.graphics.Canvas r1 = r9.A02
            int r0 = r9.A0c
            r11.BJJ(r1, r7, r0)
            android.graphics.Matrix r1 = r9.A03
            android.graphics.Matrix r0 = r9.A04
            r1.invert(r0)
            android.graphics.Matrix r2 = r9.A04
            android.graphics.RectF r1 = r9.A0A
            android.graphics.RectF r0 = r9.A0B
            r2.mapRect(r1, r0)
            android.graphics.RectF r1 = r9.A0A
            android.graphics.Rect r0 = r9.A07
            A02(r0, r1)
        L_0x0179:
            android.graphics.Rect r0 = r9.A08
            r0.set(r3, r3, r5, r6)
            android.graphics.Bitmap r3 = r9.A01
            android.graphics.Rect r2 = r9.A08
            android.graphics.Rect r1 = r9.A07
            android.graphics.Paint r0 = r9.A05
            r10.drawBitmap(r3, r2, r1, r0)
        L_0x0189:
            return
        L_0x018a:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r5, r6, r0)
            goto L_0x0134
        L_0x0191:
            r0 = 0
            r11.BNg(r0, r4, r3)
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38631rd.A01(android.graphics.Canvas, X.BN4):void");
    }

    public static void A02(Rect rect, RectF rectF) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    public static void A03(C38631rd r30) {
        C38631rd r2 = r30;
        C39801tf r4 = r2.A0G;
        if (r4 != null) {
            C40111uB r0 = C40231uN.A00;
            Rect rect = r4.A04;
            List emptyList = Collections.emptyList();
            Integer num = AnonymousClass00R.A00;
            List emptyList2 = Collections.emptyList();
            Integer num2 = num;
            Integer num3 = num;
            BN4 bn4 = new BN4(r4, r2, new C40941vX(r4, (C40561uu) null, (C22736BMz) null, (C24946CQw) null, new C40691v7(), (C24747CIj) null, (CS8) null, num, num3, num2, "__container", (String) null, emptyList, emptyList2, Collections.emptyList(), 0.0f, 0.0f, (float) rect.width(), (float) rect.height(), 0, 0, 0, -1, -1, false), r4.A07);
            r2.A0L = bn4;
            if (r2.A0X) {
                bn4.A0E(true);
            }
            r2.A0L.A01 = r2.A0R;
        }
    }

    public static void A04(C38631rd r6) {
        C39801tf r1 = r6.A0G;
        if (r1 != null) {
            C38661rg r0 = r6.A0H;
            int i = Build.VERSION.SDK_INT;
            boolean z = r1.A0C;
            int i2 = r1.A03;
            int ordinal = r0.ordinal();
            boolean z2 = false;
            if (ordinal != 1 && (ordinal == 2 || ((z && i < 28) || i2 > 4 || i <= 25))) {
                z2 = true;
            }
            r6.A0b = z2;
        }
    }

    public void A05() {
        C38651rf r1 = this.A0d;
        if (r1.A07) {
            r1.cancel();
            if (!isVisible()) {
                this.A0M = AnonymousClass00R.A00;
            }
        }
        this.A0G = null;
        this.A0L = null;
        this.A0K = null;
        this.A00 = -3.4028235E38f;
        r1.A06 = null;
        r1.A03 = -2.14748365E9f;
        r1.A02 = 2.14748365E9f;
        invalidateSelf();
    }

    public void A06() {
        this.A0e.clear();
        C38651rf r2 = this.A0d;
        Choreographer.getInstance().removeFrameCallback(r2);
        r2.A07 = false;
        for (Animator.AnimatorPauseListener onAnimationPause : r2.A0C) {
            onAnimationPause.onAnimationPause(r2);
        }
        if (!isVisible()) {
            this.A0M = AnonymousClass00R.A00;
        }
    }

    public void A07() {
        float A012;
        Integer num;
        if (this.A0L == null) {
            this.A0e.add(new C65172vx(this, 1));
            return;
        }
        A04(this);
        if (this.A0a || this.A0T || this.A0d.getRepeatCount() == 0) {
            if (isVisible()) {
                this.A0d.A05();
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            this.A0M = num;
        }
        if (!this.A0a && !this.A0T) {
            C38651rf r2 = this.A0d;
            if (r2.A04 < 0.0f) {
                A012 = r2.A02();
            } else {
                A012 = r2.A01();
            }
            A0C((int) A012);
            r2.A03();
            if (!isVisible()) {
                this.A0M = AnonymousClass00R.A00;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[LOOP:0: B:18:0x0053->B:20:0x0059, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r3 = this;
            X.BN4 r0 = r3.A0L
            if (r0 != 0) goto L_0x0010
            java.util.ArrayList r2 = r3.A0e
            r1 = 0
            X.2vx r0 = new X.2vx
            r0.<init>(r3, r1)
            r2.add(r0)
        L_0x000f:
            return
        L_0x0010:
            A04(r3)
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x0023
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x0023
            X.1rf r0 = r3.A0d
            int r0 = r0.getRepeatCount()
            if (r0 != 0) goto L_0x0077
        L_0x0023:
            boolean r0 = r3.isVisible()
            if (r0 == 0) goto L_0x0073
            X.1rf r2 = r3.A0d
            r0 = 1
            r2.A07 = r0
            r2.A06()
            r0 = 0
            r2.A05 = r0
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            float r1 = r2.A00
            if (r0 >= 0) goto L_0x0063
            float r0 = r2.A02()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            float r0 = r2.A01()
        L_0x004a:
            r2.A07(r0)
        L_0x004d:
            java.util.Set r0 = r2.A0C
            java.util.Iterator r1 = r0.iterator()
        L_0x0053:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            java.lang.Object r0 = r1.next()
            android.animation.Animator$AnimatorPauseListener r0 = (android.animation.Animator.AnimatorPauseListener) r0
            r0.onAnimationResume(r2)
            goto L_0x0053
        L_0x0063:
            float r0 = r2.A01()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            float r0 = r2.A02()
            goto L_0x004a
        L_0x0070:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x0075
        L_0x0073:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
        L_0x0075:
            r3.A0M = r0
        L_0x0077:
            boolean r0 = r3.A0a
            if (r0 != 0) goto L_0x000f
            boolean r0 = r3.A0T
            if (r0 != 0) goto L_0x000f
            X.1rf r2 = r3.A0d
            float r1 = r2.A04
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x009e
            float r0 = r2.A02()
        L_0x008c:
            int r0 = (int) r0
            r3.A0C(r0)
            r2.A03()
            boolean r0 = r3.isVisible()
            if (r0 != 0) goto L_0x000f
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r3.A0M = r0
            return
        L_0x009e:
            float r0 = r2.A01()
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C38631rd.A08():void");
    }

    public void A09(float f) {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            this.A0e.add(new C65212w1(this, f, 0));
            return;
        }
        C38651rf r3 = this.A0d;
        float f2 = r0.A02;
        float f3 = r0.A00;
        PointF pointF = C40761vE.A00;
        r3.A08(r3.A03, f2 + (f * (f3 - f2)));
    }

    public void A0A(float f) {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            this.A0e.add(new C65212w1(this, f, 1));
            return;
        }
        float f2 = r0.A02;
        float f3 = r0.A00;
        PointF pointF = C40761vE.A00;
        A0E((int) (f2 + (f * (f3 - f2))));
    }

    public void A0B(float f) {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            this.A0e.add(new C38701rk(this, f));
            return;
        }
        C38651rf r3 = this.A0d;
        float f2 = r0.A02;
        float f3 = r0.A00;
        PointF pointF = C40761vE.A00;
        r3.A07(f2 + (f * (f3 - f2)));
    }

    public void A0C(int i) {
        if (this.A0G == null) {
            this.A0e.add(new C65202w0(this, i, 0));
        } else {
            this.A0d.A07((float) i);
        }
    }

    public void A0D(int i) {
        if (this.A0G == null) {
            this.A0e.add(new C65202w0(this, i, 1));
            return;
        }
        C38651rf r2 = this.A0d;
        r2.A08(r2.A03, ((float) i) + 0.99f);
    }

    public void A0E(int i) {
        if (this.A0G == null) {
            this.A0e.add(new C65202w0(this, i, 2));
            return;
        }
        C38651rf r2 = this.A0d;
        r2.A08((float) i, (float) ((int) r2.A02));
    }

    public void A0F(int i, int i2) {
        if (this.A0G == null) {
            this.A0e.add(new C65182vy(this, i, i2));
        } else {
            this.A0d.A08((float) i, ((float) i2) + 0.99f);
        }
    }

    public void A0G(C26046CrD crD, C25723Ckt ckt, Object obj) {
        BN4 bn4 = this.A0L;
        if (bn4 == null) {
            this.A0e.add(new C65222w2(this, crD, ckt, obj));
            return;
        }
        if (crD == C26046CrD.A02) {
            bn4.BBs(ckt, obj);
        } else {
            E7H e7h = crD.A00;
            if (e7h != null) {
                e7h.BBs(ckt, obj);
            } else {
                ArrayList arrayList = new ArrayList();
                bn4.CFv(crD, new C26046CrD(new String[0]), arrayList, 0);
                for (int i = 0; i < arrayList.size(); i++) {
                    ((C26046CrD) arrayList.get(i)).A00.BBs(ckt, obj);
                }
                if (!(!arrayList.isEmpty())) {
                    return;
                }
            }
        }
        invalidateSelf();
        if (obj == EBL.A0R) {
            A0B(this.A0d.A00());
        }
    }

    public void A0H(String str) {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            this.A0e.add(new C65192vz(this, str, 1));
            return;
        }
        C54042dV A012 = r0.A01(str);
        if (A012 != null) {
            A0D((int) (A012.A01 + A012.A00));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0I(String str) {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            this.A0e.add(new C65192vz(this, str, 0));
            return;
        }
        C54042dV A012 = r0.A01(str);
        if (A012 != null) {
            int i = (int) A012.A01;
            A0F(i, ((int) A012.A00) + i);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A0J(String str) {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            this.A0e.add(new C65192vz(this, str, 2));
            return;
        }
        C54042dV A012 = r0.A01(str);
        if (A012 != null) {
            A0E((int) A012.A01);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find marker with name ");
        sb.append(str);
        sb.append(".");
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean A0K(C39801tf r6) {
        float f;
        float f2;
        if (this.A0G == r6) {
            return false;
        }
        this.A0V = true;
        A05();
        this.A0G = r6;
        A03(this);
        C38651rf r4 = this.A0d;
        boolean z = false;
        if (r4.A06 == null) {
            z = true;
        }
        r4.A06 = r6;
        if (z) {
            f = Math.max(r4.A03, r6.A02);
            f2 = Math.min(r4.A02, r6.A00);
        } else {
            f = (float) ((int) r6.A02);
            f2 = (float) ((int) r6.A00);
        }
        r4.A08(f, f2);
        float f3 = r4.A00;
        r4.A00 = 0.0f;
        r4.A01 = 0.0f;
        r4.A07((float) ((int) f3));
        r4.A04();
        A0B(r4.getAnimatedFraction());
        ArrayList arrayList = this.A0e;
        Iterator it = new ArrayList(arrayList).iterator();
        while (it.hasNext()) {
            C38691rj r0 = (C38691rj) it.next();
            if (r0 != null) {
                r0.CGH();
            }
            it.remove();
        }
        arrayList.clear();
        r6.A0D.A00 = this.A0Y;
        A04(this);
        Drawable.Callback callback = getCallback();
        if (callback instanceof ImageView) {
            ImageView imageView = (ImageView) callback;
            imageView.setImageDrawable((Drawable) null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void draw(Canvas canvas) {
        BN4 bn4 = this.A0L;
        if (bn4 != null) {
            C49342Qc r1 = this.A0D;
            if (r1 == null) {
                r1 = AnonymousClass9U1.A00;
            }
            boolean z = false;
            if (r1 == C49342Qc.ENABLED) {
                z = true;
                try {
                    this.A0f.acquire();
                    C39801tf r2 = this.A0G;
                    if (r2 != null) {
                        float f = this.A00;
                        float A002 = this.A0d.A00();
                        this.A00 = A002;
                        if (Math.abs(A002 - f) * r2.A00() >= 50.0f) {
                            A0B(A002);
                        }
                    }
                } catch (InterruptedException unused) {
                    if (!z) {
                        return;
                    }
                } catch (Throwable th) {
                    if (z) {
                        this.A0f.release();
                        if (bn4.A00 != this.A0d.A00()) {
                            A0k.execute(this.A0i);
                        }
                    }
                    throw th;
                }
            }
            if (this.A0Z) {
                try {
                    if (this.A0b) {
                        A01(canvas, bn4);
                    } else {
                        A00(canvas);
                    }
                } catch (Throwable unused2) {
                }
            } else if (this.A0b) {
                A01(canvas, bn4);
            } else {
                A00(canvas);
            }
            this.A0V = false;
            if (!z) {
                return;
            }
            this.A0f.release();
            if (bn4.A00 != this.A0d.A00()) {
                A0k.execute(this.A0i);
            }
        }
    }

    public int getIntrinsicHeight() {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            return -1;
        }
        return r0.A04.height();
    }

    public int getIntrinsicWidth() {
        C39801tf r0 = this.A0G;
        if (r0 == null) {
            return -1;
        }
        return r0.A04.width();
    }

    public void invalidateSelf() {
        Drawable.Callback callback;
        if (!this.A0V) {
            this.A0V = true;
            if ((!A0j || Looper.getMainLooper() == Looper.myLooper()) && (callback = getCallback()) != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public boolean isRunning() {
        C38651rf r0 = this.A0d;
        if (r0 == null) {
            return false;
        }
        return r0.A07;
    }

    public void setAlpha(int i) {
        this.A0c = i;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C196379ux.A00("Use addColorFilter instead.");
    }

    public void stop() {
        this.A0e.clear();
        this.A0d.A03();
        if (!isVisible()) {
            this.A0M = AnonymousClass00R.A00;
        }
    }

    public C38631rd() {
        C38651rf r4 = new C38651rf();
        this.A0d = r4;
        C38671rh r2 = new C38671rh(this);
        this.A0g = r2;
        this.A0f = new Semaphore(1);
        this.A0i = new C449025f((Object) this, 8);
        this.A00 = -3.4028235E38f;
        r4.addUpdateListener(r2);
    }

    public int getAlpha() {
        return this.A0c;
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Integer num;
        boolean z3 = !isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            Integer num2 = this.A0M;
            if (num2 == AnonymousClass00R.A01) {
                A07();
            } else if (num2 == AnonymousClass00R.A0C) {
                A08();
                return visible;
            }
        } else {
            if (this.A0d.A07) {
                A06();
                num = AnonymousClass00R.A0C;
            } else if (!z3) {
                num = AnonymousClass00R.A00;
            }
            this.A0M = num;
            return visible;
        }
        return visible;
    }

    public void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            A07();
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
