package com.whatsapp.calling.callgrid.view;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DT;
import X.AnonymousClass1K1;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass6UO;
import X.AnonymousClass70A;
import X.AnonymousClass7DI;
import X.AnonymousClass7DK;
import X.C108945cZ;
import X.C112285lE;
import X.C113615nN;
import X.C116155wU;
import X.C116185wX;
import X.C125666bS;
import X.C130786k0;
import X.C1422778v;
import X.C1594484o;
import X.C1594584p;
import X.C160958At;
import X.C17960vV;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C27691Xc;
import X.C28931bI;
import X.C50602Vb;
import X.C72463Mc;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.whatsapp.voipcalling.VoipActivityV2;
import java.lang.ref.WeakReference;

public class PipViewContainer extends FrameLayout implements AnonymousClass009 {
    public int A00;
    public int A01;
    public int A02;
    public ValueAnimator A03;
    public Point A04;
    public Point A05;
    public Pair A06;
    public C125666bS A07;
    public C112285lE A08;
    public C113615nN A09;
    public C1594584p A0A;
    public C130786k0 A0B;
    public C18000vb A0C;
    public C18030ve A0D;
    public AnonymousClass031 A0E;
    public WeakReference A0F;
    public WeakReference A0G;
    public C18140vp A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public WeakReference A0N;
    public boolean A0O;
    public final int A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int A0S;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.AnonymousClass70A r7, boolean r8) {
        /*
            r6 = this;
            r4 = 0
            boolean r3 = X.AnonymousClass000.A1W(r7)
            r2 = 1
            if (r8 == 0) goto L_0x0016
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x0016
            int r1 = r6.getVisibility()
            if (r3 == 0) goto L_0x002e
            r0 = 8
            if (r1 == r0) goto L_0x0030
        L_0x0016:
            r5 = 0
        L_0x0017:
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x002a
            if (r5 != 0) goto L_0x0027
            if (r3 == 0) goto L_0x002b
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
        L_0x0024:
            r6.setVisibility(r4)
        L_0x0027:
            A04(r6, r7)
        L_0x002a:
            return
        L_0x002b:
            r4 = 8
            goto L_0x0024
        L_0x002e:
            if (r1 != 0) goto L_0x0016
        L_0x0030:
            r5 = 1
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0079
            r6.setAlpha(r1)
            r6.setVisibility(r4)
        L_0x003c:
            r6.A0L = r2
            android.view.ViewPropertyAnimator r0 = r6.animate()
            if (r3 == 0) goto L_0x0046
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0046:
            android.view.ViewPropertyAnimator r2 = r0.alpha(r1)
            if (r3 == 0) goto L_0x0076
            r0 = 250(0xfa, double:1.235E-321)
        L_0x004e:
            android.view.ViewPropertyAnimator r1 = r2.setDuration(r0)
            if (r3 == 0) goto L_0x006d
            X.0vl r0 = X.C1409273p.A0E
            java.lang.Object r0 = r0.getValue()
            android.view.animation.DecelerateInterpolator r0 = (android.view.animation.DecelerateInterpolator) r0
        L_0x005c:
            android.view.ViewPropertyAnimator r1 = r1.setInterpolator(r0)
            X.74V r0 = new X.74V
            r0.<init>(r6, r7, r3)
            android.view.ViewPropertyAnimator r0 = r1.setListener(r0)
            r0.start()
            goto L_0x0017
        L_0x006d:
            X.0vl r0 = X.C1409273p.A0D
            java.lang.Object r0 = r0.getValue()
            android.view.animation.AccelerateInterpolator r0 = (android.view.animation.AccelerateInterpolator) r0
            goto L_0x005c
        L_0x0076:
            r0 = 200(0xc8, double:9.9E-322)
            goto L_0x004e
        L_0x0079:
            r6.setAlpha(r0)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.PipViewContainer.A07(X.70A, boolean):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0M = true;
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.6UO, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v20, types: [X.6UO, java.lang.Object] */
    public static AnonymousClass6UO A00(Point point, Point point2, PipViewContainer pipViewContainer, C130786k0 r10) {
        int dimensionPixelSize;
        int i;
        AnonymousClass6UO r0;
        int width;
        WeakReference weakReference;
        C28931bI r3;
        if (C72463Mc.A1Z(pipViewContainer.A0H)) {
            Rect A072 = AnonymousClass3MW.A07();
            Matrix matrix = pipViewContainer.getMatrix();
            RectF rectF = new RectF(new Rect(0, 0, point2.x, point2.y));
            matrix.mapRect(rectF);
            rectF.round(A072);
            if (AnonymousClass3MY.A1b(pipViewContainer.A0C)) {
                width = A072.left;
            } else {
                width = pipViewContainer.getWidth() - A072.right;
            }
            int i2 = pipViewContainer.A0P;
            int i3 = i2 - width;
            boolean z = pipViewContainer.A0K;
            int i4 = pipViewContainer.A07.A00;
            if (!(!z || (weakReference = pipViewContainer.A0F) == null || (r3 = (C28931bI) weakReference.get()) == null || r3.A00 == null)) {
                i4 = r3.A02().getBottom() - pipViewContainer.A02;
            }
            int i5 = (i2 + i4) - A072.top;
            int width2 = ((point.x - i2) - A072.width()) - width;
            i = (((point.y - i2) - A072.height()) - pipViewContainer.A01) - A072.top;
            ? obj = new Object();
            obj.A02 = i3;
            obj.A00 = width2;
            obj.A03 = i5;
            r0 = obj;
        } else {
            int i6 = pipViewContainer.A0P;
            int i7 = r10.A05 + i6;
            if (r10.A02 == 0) {
                dimensionPixelSize = 0;
            } else {
                dimensionPixelSize = pipViewContainer.getResources().getDimensionPixelSize(r10.A02);
            }
            i = (((point.y - point2.y) - i6) - r10.A03) - dimensionPixelSize;
            ? obj2 = new Object();
            obj2.A02 = i6;
            obj2.A00 = (point.x - point2.x) - i6;
            obj2.A03 = i7;
            r0 = obj2;
        }
        r0.A01 = i;
        return r0;
    }

    public static void A01(PipViewContainer pipViewContainer) {
        int i;
        float f;
        float f2;
        Point point;
        int i2;
        int i3;
        Point point2;
        int i4;
        int i5;
        int i6;
        int i7;
        C130786k0 r10 = pipViewContainer.A0B;
        if (r10 != null && !pipViewContainer.A0J) {
            Point point3 = pipViewContainer.A05;
            if (point3 == null) {
                point = new Point(0, 0);
            } else {
                int i8 = r10.A06;
                if (i8 <= 0 || (i = r10.A04) <= 0) {
                    i8 = point3.x;
                    r10.A06 = i8;
                    i = point3.y;
                    r10.A04 = i;
                }
                int min = Math.min(i8, i);
                int max = Math.max(i8, i);
                int i9 = point3.x;
                int i10 = point3.y;
                int min2 = Math.min(i9, i10);
                int max2 = Math.max(i9, i10);
                int i11 = i9;
                if (i8 < i) {
                    i11 = i10;
                }
                if (i8 >= i) {
                    i9 = i10;
                }
                float f3 = (float) max2;
                float f4 = (float) min2;
                int i12 = (f3 > (2.5f * f4) ? 1 : (f3 == (2.5f * f4) ? 0 : -1));
                float f5 = r10.A00;
                if (i12 > 0) {
                    f = f5 * f3;
                    f2 = (float) max;
                } else {
                    f = f5 * f4;
                    f2 = (float) min;
                }
                float f6 = (float) min;
                float f7 = (float) max;
                float A012 = C108945cZ.A01(((float) i11) * 0.5f, f7, C108945cZ.A01(((float) i9) * 0.5f, f6, f / f2));
                int i13 = (int) (f6 * A012);
                int i14 = (int) (f7 * A012);
                if (i8 >= i) {
                    point = new Point(i14, i13);
                }
            }
            ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(pipViewContainer);
            A0B2.width = point.x;
            A0B2.height = point.y;
            Point point4 = pipViewContainer.A05;
            boolean z = true;
            if (point4 != null) {
                C130786k0 r1 = pipViewContainer.A0B;
                if (r1.A01 == 1) {
                    boolean A1Z = C72463Mc.A1Z(pipViewContainer.A0H);
                    Point point5 = pipViewContainer.A05;
                    if (A1Z) {
                        int i15 = pipViewContainer.A0S;
                        pipViewContainer.setX((float) ((point5.x - point.x) - i15));
                        pipViewContainer.setY((float) ((pipViewContainer.A05.y - point.y) - i15));
                        i7 = 0;
                        i6 = 0;
                    } else {
                        int i16 = pipViewContainer.A0S;
                        i6 = (point5.x - point.x) - i16;
                        i7 = (point5.y - point.y) - i16;
                    }
                    i5 = 0;
                } else {
                    AnonymousClass6UO A002 = A00(point4, point, pipViewContainer, r1);
                    C130786k0 r12 = pipViewContainer.A0B;
                    if (r12.A09) {
                        i4 = A002.A00;
                        i5 = A002.A02;
                    } else {
                        i4 = A002.A02;
                        i5 = A002.A00;
                    }
                    if (r12.A08) {
                        i7 = A002.A01;
                    } else {
                        i7 = A002.A03;
                    }
                }
                C18000vb r7 = pipViewContainer.A0C;
                int i17 = i5;
                if (AnonymousClass3MY.A1b(r7)) {
                    i17 = i6;
                }
                if (AnonymousClass3MY.A1b(r7)) {
                    i6 = i5;
                }
                A0B2.setMargins(i17, i7, i6, 0);
            }
            pipViewContainer.setLayoutParams(A0B2);
            if (A0B2.height >= A0B2.width) {
                z = false;
            }
            if (z != pipViewContainer.A0O) {
                pipViewContainer.A0O = z;
                C113615nN r0 = pipViewContainer.A09;
                if (r0 != null) {
                    pipViewContainer.A06(r0.A05);
                }
            }
            C130786k0 r2 = pipViewContainer.A0B;
            if (C72463Mc.A1Z(pipViewContainer.A0H)) {
                if (pipViewContainer.A00 == 1 && (((i3 = r2.A01) == 3 || i3 == 2) && (point2 = pipViewContainer.A04) != null)) {
                    pipViewContainer.setX((float) point2.x);
                    pipViewContainer.setY((float) pipViewContainer.A04.y);
                    pipViewContainer.A04 = null;
                }
                if (pipViewContainer.A00 == 3 && ((i2 = r2.A01) == 1 || i2 == 0)) {
                    Point point6 = pipViewContainer.A04;
                    if (point6 == null) {
                        point6 = new Point();
                        pipViewContainer.A04 = point6;
                    }
                    point6.x = (int) pipViewContainer.getX();
                    pipViewContainer.A04.y = (int) pipViewContainer.getY();
                }
                pipViewContainer.A00 = r2.A01;
            }
        }
    }

    public static void A02(PipViewContainer pipViewContainer) {
        C1594584p r1;
        Pair pair = pipViewContainer.A06;
        if (pair != null && (r1 = pipViewContainer.A0A) != null) {
            boolean A1Y = AnonymousClass000.A1Y(pair.first);
            boolean A1Y2 = AnonymousClass000.A1Y(pair.second);
            CallGridViewModel callGridViewModel = ((AnonymousClass7DK) r1).A00.A0A;
            C17960vV.A07(callGridViewModel);
            AnonymousClass1DT r2 = callGridViewModel.A0U;
            Object A062 = r2.A06();
            C17960vV.A07(A062);
            C130786k0 r12 = (C130786k0) A062;
            if (!(r12.A09 == A1Y && r12.A08 == A1Y2)) {
                r12.A08 = A1Y2;
                r12.A09 = A1Y;
                r2.A0F(r12);
            }
            pipViewContainer.A06 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (X.AnonymousClass3MY.A1b(r5.A0C) == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r1 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        r0 = r5.getWidth();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r3 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r2 = r5.getHeight();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        r5.setPivotX((float) r0);
        r5.setPivotY((float) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r1 == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r4.A09 != false) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r4 != null) goto L_0x000e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r4.A08 != false) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(com.whatsapp.calling.callgrid.view.PipViewContainer r5) {
        /*
            X.6k0 r4 = r5.A0B
            r3 = 1
            r2 = 0
            if (r4 == 0) goto L_0x000b
            boolean r0 = r4.A09
            r1 = 0
            if (r0 == 0) goto L_0x000e
        L_0x000b:
            r1 = 1
            if (r4 == 0) goto L_0x0013
        L_0x000e:
            boolean r0 = r4.A08
            if (r0 != 0) goto L_0x0013
            r3 = 0
        L_0x0013:
            X.0vb r0 = r5.A0C
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 == 0) goto L_0x0030
            if (r1 == 0) goto L_0x0032
        L_0x001d:
            int r0 = r5.getWidth()
        L_0x0021:
            if (r3 == 0) goto L_0x0027
            int r2 = r5.getHeight()
        L_0x0027:
            float r0 = (float) r0
            r5.setPivotX(r0)
            float r0 = (float) r2
            r5.setPivotY(r0)
            return
        L_0x0030:
            if (r1 == 0) goto L_0x001d
        L_0x0032:
            r0 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.view.PipViewContainer.A03(com.whatsapp.calling.callgrid.view.PipViewContainer):void");
    }

    public static void A04(PipViewContainer pipViewContainer, AnonymousClass70A r5) {
        int i;
        if (r5 != null) {
            if (pipViewContainer.A09 != null) {
                C112285lE r0 = pipViewContainer.A08;
                boolean z = pipViewContainer.A0O;
                C18070vi.A0d(r0.A08, 1);
                if (!r5.A0O || r5.A0D) {
                    i = 7;
                    if (z) {
                        i = 8;
                    }
                } else {
                    i = 1;
                }
                C113615nN r1 = pipViewContainer.A09;
                if (i == r1.A01) {
                    AnonymousClass70A r02 = r1.A05;
                    if (r02 != null) {
                        C17960vV.A07(r02);
                        if (!AnonymousClass70A.A00(r5, r02)) {
                            pipViewContainer.A09.A0B();
                        }
                    }
                    pipViewContainer.A09.A0J(r5);
                    return;
                }
            }
            pipViewContainer.A06(r5);
            return;
        }
        ValueAnimator valueAnimator = pipViewContainer.A03;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            pipViewContainer.A03.cancel();
        }
        C113615nN r12 = pipViewContainer.A09;
        if (!(r12 == null || r12.A05 == null)) {
            r12.A0B();
        }
        pipViewContainer.A09 = null;
        pipViewContainer.removeAllViews();
    }

    public static void A05(PipViewContainer pipViewContainer, boolean z) {
        C1594484o r0;
        C1594584p r02 = pipViewContainer.A0A;
        if (r02 != null && (r0 = ((AnonymousClass7DK) r02).A00.A05) != null) {
            VoipActivityV2 voipActivityV2 = ((AnonymousClass7DI) r0).A00;
            voipActivityV2.A2K = z;
            if (z && voipActivityV2.A1b != null) {
                VoipActivityV2.A1a(voipActivityV2);
            }
        }
    }

    private void A06(AnonymousClass70A r4) {
        int i;
        C113615nN r1 = this.A09;
        if (!(r1 == null || r1.A05 == null)) {
            r1.A0B();
        }
        this.A09 = null;
        removeAllViews();
        C112285lE r2 = this.A08;
        boolean z = this.A0O;
        C18070vi.A0h(r4, r2.A08);
        if (!r4.A0O || r4.A0D) {
            i = 7;
            if (z) {
                i = 8;
            }
        } else {
            i = 1;
        }
        C113615nN r12 = (C113615nN) r2.A0F(this, i);
        this.A09 = r12;
        if (r12 instanceof C116185wX) {
            ((C116185wX) r12).A0K();
        }
        addView(this.A09.A0H, new ViewGroup.LayoutParams(-1, -1));
        this.A09.A0J(r4);
        C113615nN r13 = this.A09;
        if (r13 instanceof C116155wU) {
            r13.A0E(9);
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A0E;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A0E = r0;
        }
        return r0.generatedComponent();
    }

    public Rect getGlobalVisibleRect() {
        C113615nN r2 = this.A09;
        Rect A072 = AnonymousClass3MW.A07();
        if (!(r2 == null || r2.A05 == null)) {
            r2.A0H.getGlobalVisibleRect(A072);
        }
        return A072;
    }

    public void setBannerAndHeaderWeakReference(WeakReference weakReference, WeakReference weakReference2) {
        this.A0N = weakReference;
        this.A0F = weakReference2;
    }

    public PipViewContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0I) {
            this.A0I = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r2 = r1.A10;
            this.A0D = AnonymousClass10E.A8r(r2);
            this.A0C = AnonymousClass10E.A6Q(r2);
            AnonymousClass1K1 r12 = r1.A0z;
            this.A08 = (C112285lE) r12.A6M.get();
            this.A07 = (C125666bS) r12.A5q.get();
            this.A0H = r2.A8t;
        }
        boolean z = false;
        this.A01 = 0;
        this.A0G = null;
        this.A00 = 3;
        this.A0K = false;
        this.A02 = 0;
        this.A0J = false;
        this.A0P = context.getResources().getDimensionPixelSize(2131165694);
        this.A0S = context.getResources().getDimensionPixelSize(2131165696);
        this.A0R = !C50602Vb.A00 ? true : z;
        setOnTouchListener(new C1422778v(this));
        this.A0Q = !C18020vd.A05(C18040vf.A02, this.A0D, 9439);
    }

    public boolean getIsLandscapeVideo() {
        return this.A0O;
    }

    public C113615nN getPipViewHolder() {
        return this.A09;
    }

    public void setGlassesUiPlugin(C160958At r2) {
        this.A0G = AnonymousClass3MW.A0z(r2);
    }

    public void setPipListener(C1594584p r1) {
        this.A0A = r1;
    }

    public PipViewContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PipViewContainer(Context context) {
        this(context, (AttributeSet) null);
    }
}
