package X;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.05A  reason: invalid class name */
public final class AnonymousClass05A extends View implements C16950tU {
    public static Field A0F;
    public static Method A0G;
    public static boolean A0H;
    public static boolean A0I;
    public static final ViewOutlineProvider A0J = new AnonymousClass05J();
    public static final C03400Hx A0K = new Object();
    public static final AnonymousClass1OS A0L = C14400ox.A00;
    public boolean A00;
    public int A01;
    public long A02 = AnonymousClass0NB.A01;
    public Rect A03;
    public C18090vk A04;
    public C22821Di A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final AnonymousClass0Q2 A09;
    public final long A0A;
    public final AnonymousClass0HC A0B = new AnonymousClass0HC();
    public final AndroidComposeView A0C;
    public final AnonymousClass05C A0D;
    public final AnonymousClass0J1 A0E = new AnonymousClass0J1(A0L);

    public void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.A0C;
        androidComposeView.A0Y();
        this.A05 = null;
        this.A04 = null;
        boolean A0a = androidComposeView.A0a(this);
        if (Build.VERSION.SDK_INT >= 23 || A0I || !A0a) {
            this.A0D.removeViewInLayout(this);
        } else {
            setVisibility(8);
        }
    }

    public void forceLayout() {
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    private final void A00() {
        Rect rect;
        if (this.A06) {
            Rect rect2 = this.A03;
            if (rect2 == null) {
                this.A03 = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C18070vi.A0b(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.A03;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.A00) {
            this.A00 = z;
            this.A0C.A0Z(this, z);
        }
    }

    public void Bdn(float[] fArr) {
        float[] A002 = this.A0E.A00(this);
        if (A002 != null) {
            C05040Qd.A06(fArr, A002);
        }
    }

    public void Bij(C02100Cs r2, boolean z) {
        float[] fArr;
        AnonymousClass0J1 r0 = this.A0E;
        if (z) {
            fArr = r0.A00(this);
            if (fArr == null) {
                r2.A01 = 0.0f;
                r2.A03 = 0.0f;
                r2.A02 = 0.0f;
                r2.A00 = 0.0f;
                return;
            }
        } else {
            fArr = r0.A01(this);
        }
        C05040Qd.A02(r2, fArr);
    }

    public long Bik(long j, boolean z) {
        float[] fArr;
        AnonymousClass0J1 r0 = this.A0E;
        if (z) {
            fArr = r0.A00(this);
            if (fArr == null) {
                return AnonymousClass0QY.A01;
            }
        } else {
            fArr = r0.A01(this);
        }
        return C05040Qd.A00(fArr, j);
    }

    public void CG5(C18090vk r4, C22821Di r5) {
        if (Build.VERSION.SDK_INT >= 23 || A0I) {
            this.A0D.addView(this);
        } else {
            setVisibility(0);
        }
        this.A06 = false;
        this.A07 = false;
        this.A02 = AnonymousClass0NB.A01;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void CPj(float[] fArr) {
        C05040Qd.A06(fArr, this.A0E.A01(this));
    }

    public void CQf() {
        if (this.A00 && !A0I) {
            A0K.A00(this);
            setInvalidated(false);
        }
    }

    public void dispatchDraw(Canvas canvas) {
        boolean z;
        AnonymousClass0WO r4 = this.A0B.A00;
        Canvas canvas2 = r4.A00;
        r4.A00 = canvas;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            r4.CGe();
            this.A09.A06(r4);
            z = true;
        } else {
            z = false;
        }
        C22821Di r0 = this.A05;
        if (r0 != null) {
            r0.invoke(r4);
        }
        if (z) {
            r4.CFz();
        }
        r4.A00 = canvas2;
        setInvalidated(false);
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass0FM.A00(this.A0C);
        }
        return -1;
    }

    public void invalidate() {
        if (!this.A00) {
            setInvalidated(true);
            super.invalidate();
            this.A0C.invalidate();
        }
    }

    public AnonymousClass05A(AndroidComposeView androidComposeView, AnonymousClass05C r4, C18090vk r5, C22821Di r6) {
        super(androidComposeView.getContext());
        this.A0C = androidComposeView;
        this.A0D = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A09 = new AnonymousClass0Q2(androidComposeView.getDensity());
        setWillNotDraw(false);
        r4.addView(this);
        this.A0A = (long) View.generateViewId();
    }

    private final C17040te getManualClipPath() {
        if (!getClipToOutline()) {
            return null;
        }
        AnonymousClass0Q2 r1 = this.A09;
        if (!r1.A06) {
            return null;
        }
        AnonymousClass0Q2.A02(r1);
        return r1.A02;
    }

    public void BJa(C16960tV r4) {
        boolean A1R = AnonymousClass000.A1R((getElevation() > 0.0f ? 1 : (getElevation() == 0.0f ? 0 : -1)));
        this.A07 = A1R;
        if (A1R) {
            r4.BJz();
        }
        this.A0D.A00(this, r4, getDrawingTime());
        if (this.A07) {
            r4.BIk();
        }
    }

    public boolean Bez(long j) {
        C01990Cf r2;
        float A012 = AnonymousClass0QY.A01(j);
        float A022 = AnonymousClass0QY.A02(j);
        if (this.A06) {
            if (0.0f > A012 || A012 >= ((float) getWidth()) || 0.0f > A022 || A022 >= ((float) getHeight())) {
                return false;
            }
        } else if (getClipToOutline()) {
            AnonymousClass0Q2 r1 = this.A09;
            if (!r1.A05 || (r2 = r1.A01) == null) {
                return true;
            }
            return AnonymousClass0Q2.A04(r2, AnonymousClass0QY.A01(j), AnonymousClass0QY.A02(j));
        }
        return true;
    }

    public void Bk4(long j) {
        int A0G2 = AnonymousClass000.A0G(j);
        if (A0G2 != getLeft()) {
            offsetLeftAndRight(A0G2 - getLeft());
            AnonymousClass0J1 r1 = this.A0E;
            r1.A00 = true;
            r1.A01 = true;
        }
        int A0H2 = AnonymousClass000.A0H(j);
        if (A0H2 != getTop()) {
            offsetTopAndBottom(A0H2 - getTop());
            AnonymousClass0J1 r12 = this.A0E;
            r12.A00 = true;
            r12.A01 = true;
        }
    }

    public void CFr(long j) {
        ViewOutlineProvider viewOutlineProvider;
        int A0G2 = AnonymousClass000.A0G(j);
        int A0H2 = AnonymousClass000.A0H(j);
        if (A0G2 != getWidth() || A0H2 != getHeight()) {
            long j2 = this.A02;
            long j3 = AnonymousClass0NB.A01;
            float A022 = AnonymousClass001.A02(j2);
            float f = (float) A0G2;
            setPivotX(A022 * f);
            float f2 = (float) A0H2;
            setPivotY(AnonymousClass001.A01(this.A02) * f2);
            AnonymousClass0Q2 r7 = this.A09;
            long A0p = AnonymousClass001.A0p(f, f2);
            long j4 = AnonymousClass0QG.A02;
            if (r7.A00 != A0p) {
                r7.A00 = A0p;
                r7.A03 = true;
            }
            if (r7.A05() != null) {
                viewOutlineProvider = A0J;
            } else {
                viewOutlineProvider = null;
            }
            setOutlineProvider(viewOutlineProvider);
            layout(getLeft(), getTop(), getLeft() + A0G2, getTop() + A0H2);
            A00();
            AnonymousClass0J1 r1 = this.A0E;
            r1.A00 = true;
            r1.A01 = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a4, code lost:
        if (r13.A05() == X.AnonymousClass0GC.A00) goto L_0x00a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        if (r13.A05() != X.AnonymousClass0GC.A00) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CQp(X.AnonymousClass0WP r13, X.C28644ECa r14, X.C24246By4 r15) {
        /*
            r12 = this;
            int r3 = r13.A02()
            int r0 = r12.A01
            r3 = r3 | r0
            r0 = r3 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x002f
            long r4 = r13.Bal()
            r12.A02 = r4
            long r0 = X.AnonymousClass0NB.A01
            float r1 = X.AnonymousClass001.A02(r4)
            int r0 = r12.getWidth()
            float r0 = (float) r0
            float r1 = r1 * r0
            r12.setPivotX(r1)
            long r0 = r12.A02
            float r1 = X.AnonymousClass001.A01(r0)
            int r0 = r12.getHeight()
            float r0 = (float) r0
            float r1 = r1 * r0
            r12.setPivotY(r1)
        L_0x002f:
            r0 = r3 & 1
            if (r0 == 0) goto L_0x003a
            float r0 = r13.BYZ()
            r12.setScaleX(r0)
        L_0x003a:
            r0 = r3 & 2
            if (r0 == 0) goto L_0x0045
            float r0 = r13.BYa()
            r12.setScaleY(r0)
        L_0x0045:
            r0 = r3 & 4
            if (r0 == 0) goto L_0x0050
            float r0 = r13.A00()
            r12.setAlpha(r0)
        L_0x0050:
            r0 = r3 & 8
            if (r0 == 0) goto L_0x0058
            r0 = 0
            r12.setTranslationX(r0)
        L_0x0058:
            r0 = r3 & 16
            if (r0 == 0) goto L_0x0060
            r0 = 0
            r12.setTranslationY(r0)
        L_0x0060:
            r0 = r3 & 32
            if (r0 == 0) goto L_0x006b
            float r0 = r13.A01()
            r12.setElevation(r0)
        L_0x006b:
            r0 = r3 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0073
            r0 = 0
            r12.setRotation(r0)
        L_0x0073:
            r0 = r3 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x007b
            r0 = 0
            r12.setRotationX(r0)
        L_0x007b:
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0083
            r0 = 0
            r12.setRotationY(r0)
        L_0x0083:
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x008e
            float r0 = r13.BO8()
            r12.setCameraDistancePx(r0)
        L_0x008e:
            X.0te r0 = r12.getManualClipPath()
            r2 = 0
            boolean r4 = X.AnonymousClass000.A1W(r0)
            boolean r5 = r13.A08()
            if (r5 == 0) goto L_0x00a6
            X.0s9 r1 = r13.A05()
            X.0s9 r0 = X.AnonymousClass0GC.A00
            r11 = 1
            if (r1 != r0) goto L_0x00a7
        L_0x00a6:
            r11 = 0
        L_0x00a7:
            r0 = r3 & 24576(0x6000, float:3.4438E-41)
            if (r0 == 0) goto L_0x00bf
            if (r5 == 0) goto L_0x00b6
            X.0s9 r5 = r13.A05()
            X.0s9 r1 = X.AnonymousClass0GC.A00
            r0 = 1
            if (r5 == r1) goto L_0x00b7
        L_0x00b6:
            r0 = 0
        L_0x00b7:
            r12.A06 = r0
            r12.A00()
            r12.setClipToOutline(r11)
        L_0x00bf:
            X.0Q2 r5 = r12.A09
            X.0s9 r6 = r13.A05()
            float r9 = r13.A00()
            float r10 = r13.A01()
            r7 = r14
            r8 = r15
            boolean r1 = r5.A07(r6, r7, r8, r9, r10, r11)
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x00e2
            android.graphics.Outline r0 = r5.A05()
            if (r0 == 0) goto L_0x0158
            android.view.ViewOutlineProvider r0 = A0J
        L_0x00df:
            r12.setOutlineProvider(r0)
        L_0x00e2:
            X.0te r0 = r12.getManualClipPath()
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r4 != r0) goto L_0x00f0
            if (r0 == 0) goto L_0x00f3
            if (r1 == 0) goto L_0x00f3
        L_0x00f0:
            r12.invalidate()
        L_0x00f3:
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x0107
            float r1 = r12.getElevation()
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0107
            X.0vk r0 = r12.A04
            if (r0 == 0) goto L_0x0107
            r0.invoke()
        L_0x0107:
            r0 = r3 & 7963(0x1f1b, float:1.1159E-41)
            if (r0 == 0) goto L_0x0112
            X.0J1 r1 = r12.A0E
            r0 = 1
            r1.A00 = r0
            r1.A01 = r0
        L_0x0112:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0136
            r0 = r3 & 64
            if (r0 == 0) goto L_0x0127
            long r0 = r13.A03()
            int r0 = X.AnonymousClass0Oy.A00(r0)
            X.AnonymousClass0LR.A00(r12, r0)
        L_0x0127:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0136
            long r0 = r13.A04()
            int r0 = X.AnonymousClass0Oy.A00(r0)
            X.AnonymousClass0LR.A01(r12, r0)
        L_0x0136:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0144
            r0 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0144
            X.AnonymousClass0FN.A00(r12)
        L_0x0144:
            r0 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 & r0
            if (r3 == 0) goto L_0x0151
            r0 = 0
            r12.setLayerType(r2, r0)
            r0 = 1
            r12.A08 = r0
        L_0x0151:
            int r0 = r13.A02()
            r12.A01 = r0
            return
        L_0x0158:
            r0 = 0
            goto L_0x00df
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05A.CQp(X.0WP, X.ECa, X.By4):void");
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final AnonymousClass05C getContainer() {
        return this.A0D;
    }

    public long getLayerId() {
        return this.A0A;
    }

    public final AndroidComposeView getOwnerView() {
        return this.A0C;
    }

    public boolean hasOverlappingRendering() {
        return this.A08;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }
}
