package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;

/* renamed from: X.73r  reason: invalid class name and case insensitive filesystem */
public final class C1409473r {
    public int A00;
    public int A01;
    public int A02;
    public Rect A03;
    public C113615nN A04;
    public C122686Ri A05 = C122686Ri.CONTROLS_SHOWN;
    public AnonymousClass6T0 A06;
    public C39351sv A07;
    public C39351sv A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B = true;
    public boolean A0C = true;
    public boolean A0D;
    public final C112285lE A0E;
    public final C18000vb A0F;
    public final AnonymousClass1DC A0G;
    public final C23661Hd A0H;
    public final C18030ve A0I;

    public C1409473r(C112285lE r2, C18000vb r3, C23661Hd r4, C18030ve r5, AnonymousClass1DC r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0p(r6, r2, r5);
        this.A0F = r3;
        this.A0G = r6;
        this.A0E = r2;
        this.A0I = r5;
        this.A0H = r4;
    }

    private final Point A01(int i, int i2) {
        boolean z;
        int i3 = 0;
        if ((i >= i2 || i > this.A01) && (i2 >= i || i2 > this.A01)) {
            z = false;
        } else {
            z = true;
        }
        if (this.A01 != 0 && !z) {
            if (C18020vd.A05(C18040vf.A02, this.A0I, 12435) && this.A0H.A02(false)) {
                int i4 = this.A01;
                if (i4 > i) {
                    i4 = i;
                }
                int i5 = i4;
                if (i >= i2) {
                    if (i2 != 0) {
                        i3 = (i * i4) / i2;
                    }
                    i5 = i3;
                    i3 = i4;
                } else if (i != 0) {
                    i3 = (i2 * i4) / i;
                }
                return new Point(i5, i3);
            }
        }
        return new Point(i, i2);
    }

    public static final void A04(C1409473r r4, boolean z) {
        float f = 0.0f;
        if (!z) {
            Rect rect = r4.A03;
            if (rect != null) {
                f = (float) rect.width();
            }
            int i = -1;
            if (AnonymousClass3MY.A1b(r4.A0F)) {
                i = 1;
            }
            f *= (float) i;
        }
        View A082 = r4.A08();
        if (A082 != null) {
            A082.animate().setDuration(250).setInterpolator((DecelerateInterpolator) C1409273p.A0E.getValue()).translationX(f).start();
        }
    }

    public static final Point A02(ViewGroup viewGroup, C1409473r r6, AnonymousClass7DM r7) {
        int i;
        float f;
        if (!r7.A03) {
            float f2 = C122686Ri.A00;
            Point point = r7.A00;
            i = (int) (((float) point.x) * f2);
            f = ((float) point.y) * f2;
        } else {
            int width = viewGroup.getWidth();
            C39351sv r0 = r6.A08;
            if (r0 != null) {
                i = width - (r0.A01 + r0.A02);
                int height = viewGroup.getHeight();
                C39351sv r02 = r6.A08;
                if (r02 != null) {
                    int i2 = height - (r02.A03 + r02.A00);
                    Point point2 = r7.A00;
                    float f3 = ((float) point2.x) / ((float) point2.y);
                    float f4 = (float) i;
                    float f5 = (float) i2;
                    if (f3 <= f4 / f5) {
                        return r6.A01((int) (f5 * f3), i2);
                    }
                    f = f4 / f3;
                }
            }
            C18070vi.A11("focusViewMargins");
            throw null;
        }
        return r6.A01(i, (int) f);
    }

    public final View A08() {
        C113615nN r0 = this.A04;
        if (r0 != null) {
            return r0.A0H;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (r1 < 1.0f) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09() {
        /*
            r8 = this;
            boolean r3 = r8.A0D
            if (r3 == 0) goto L_0x01a4
            X.6Ri r2 = r8.A05
            X.6Ri r0 = X.C122686Ri.CONTROLS_HIDDEN
            if (r2 != r0) goto L_0x01a4
            X.6Ri r1 = X.C122686Ri.CONTROLS_SHOWN
        L_0x000c:
            X.6Ri r0 = X.C122686Ri.FOCUS
            if (r1 != r0) goto L_0x019d
            r1 = 1065353216(0x3f800000, float:1.0)
        L_0x0012:
            if (r3 != 0) goto L_0x001b
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r7 = 0
            if (r0 >= 0) goto L_0x001c
        L_0x001b:
            r7 = 1
        L_0x001c:
            android.view.View r3 = r8.A08()
            if (r3 == 0) goto L_0x00c2
            X.6Ri r0 = X.C122686Ri.AR_EFFECT_SELF_FLOATING
            if (r2 != r0) goto L_0x0165
            int r0 = r8.A05()
            int r2 = r0 / 2
            int r0 = A00(r8)
            int r0 = r0 / 2
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>(r2, r0)
        L_0x0037:
            int r0 = r4.x
            float r0 = (float) r0
            r3.setPivotX(r0)
            int r0 = r4.y
            float r0 = (float) r0
            r3.setPivotY(r0)
            r3.setScaleX(r1)
            r3.setScaleY(r1)
            X.5nN r6 = r8.A04
            if (r6 == 0) goto L_0x0072
            boolean r0 = r6 instanceof X.C116165wV
            if (r0 == 0) goto L_0x014f
            X.5wV r6 = (X.C116165wV) r6
            com.whatsapp.WaImageView r5 = r6.A0I
            if (r5 == 0) goto L_0x0072
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0072
            int r0 = r6.A08
            float r0 = (float) r0
            float r0 = r0 / r1
            int r4 = (int) r0
            android.view.ViewGroup$MarginLayoutParams r2 = X.AnonymousClass3MW.A0B(r5)
            int r0 = r6.A09
            float r0 = (float) r0
            float r0 = r0 / r1
            int r0 = (int) r0
            r2.topMargin = r0
            X.C108955ca.A1I(r5, r4, r2)
        L_0x0072:
            if (r7 == 0) goto L_0x014c
            android.graphics.RectF r5 = X.AnonymousClass3MW.A08()
            android.graphics.Matrix r2 = r3.getMatrix()
            android.graphics.Rect r1 = X.AnonymousClass3MW.A07()
            r3.getDrawingRect(r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r2.mapRect(r5, r0)
            float r0 = r5.left
            int r4 = (int) r0
            float r0 = r5.top
            int r3 = (int) r0
            float r0 = r5.right
            int r2 = (int) r0
            float r0 = r5.bottom
            int r1 = (int) r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r4, r3, r2, r1)
        L_0x009c:
            r8.A03 = r0
            X.6Ri r2 = r8.A05
            X.6Vz r0 = X.C123826Vz.$redex_init_class
            int r1 = r2.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x00f5
            r0 = 4
            if (r1 == r0) goto L_0x00c3
            X.6Ri r0 = X.C122686Ri.PIP
            boolean r2 = X.AnonymousClass000.A1Z(r2, r0)
            r1 = 0
            r0 = 0
            android.graphics.Point r3 = r8.A06(r0, r0, r1, r2)
            if (r3 == 0) goto L_0x00c2
        L_0x00ba:
            int r0 = r3.x
            r8.A00 = r0
            int r0 = r3.y
            r8.A02 = r0
        L_0x00c2:
            return
        L_0x00c3:
            android.view.View r0 = r8.A08()
            r2 = 0
            if (r0 == 0) goto L_0x00ce
            android.view.ViewParent r2 = r0.getParent()
        L_0x00ce:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00c2
            android.view.View r2 = (android.view.View) r2
            if (r2 == 0) goto L_0x00c2
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            int r0 = r2.getWidth()
            int r1 = r0 / 2
            int r0 = r8.A05()
            int r0 = r0 / 2
            int r1 = r1 - r0
            r3.x = r1
            int r1 = X.C108945cZ.A06(r2)
            int r0 = A00(r8)
            int r0 = r0 / 2
            goto L_0x013b
        L_0x00f5:
            android.view.View r0 = r8.A08()
            r5 = 0
            if (r0 == 0) goto L_0x0100
            android.view.ViewParent r5 = r0.getParent()
        L_0x0100:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00c2
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L_0x00c2
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            android.graphics.Rect r0 = r8.A03
            if (r0 == 0) goto L_0x0147
            int r4 = r0.right
        L_0x0113:
            int r0 = r8.A05()
            int r4 = r4 - r0
            android.graphics.Rect r0 = r8.A03
            if (r0 == 0) goto L_0x0145
            int r2 = r0.left
        L_0x011e:
            int r0 = r5.getWidth()
            int r1 = r0 / 2
            int r0 = r8.A05()
            int r0 = r0 / 2
            int r1 = r1 - r0
            int r2 = r2 + r4
            int r0 = r2 / 2
            int r1 = r1 - r0
            r3.x = r1
            int r1 = r5.getHeight()
            android.graphics.Rect r0 = r8.A03
            if (r0 == 0) goto L_0x0140
            int r0 = r0.bottom
        L_0x013b:
            int r1 = r1 - r0
            r3.y = r1
            goto L_0x00ba
        L_0x0140:
            int r0 = A00(r8)
            goto L_0x013b
        L_0x0145:
            r2 = 0
            goto L_0x011e
        L_0x0147:
            int r4 = r8.A05()
            goto L_0x0113
        L_0x014c:
            r0 = 0
            goto L_0x009c
        L_0x014f:
            boolean r0 = r6 instanceof X.C116185wX
            if (r0 == 0) goto L_0x0072
            X.5wX r6 = (X.C116185wX) r6
            int r0 = r6.A0D
            float r0 = (float) r0
            float r0 = r0 / r1
            int r2 = (int) r0
            com.whatsapp.WaImageView r1 = r6.A0N
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            X.C108955ca.A1I(r1, r2, r0)
            goto L_0x0072
        L_0x0165:
            android.graphics.Point r4 = new android.graphics.Point
            r4.<init>()
            boolean r0 = r8.A0C
            r2 = 0
            if (r0 != 0) goto L_0x0193
            boolean r0 = r8.A0D
            if (r0 != 0) goto L_0x0193
            X.0vb r0 = r8.A0F
            boolean r0 = X.AnonymousClass3MW.A1Z(r0)
            if (r0 == 0) goto L_0x019b
        L_0x017b:
            int r0 = r8.A05()
        L_0x017f:
            r4.x = r0
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x018f
            android.view.View r0 = r8.A08()
            if (r0 == 0) goto L_0x018f
            int r2 = r0.getHeight()
        L_0x018f:
            r4.y = r2
            goto L_0x0037
        L_0x0193:
            X.0vb r0 = r8.A0F
            boolean r0 = X.AnonymousClass3MY.A1b(r0)
            if (r0 != 0) goto L_0x017b
        L_0x019b:
            r0 = 0
            goto L_0x017f
        L_0x019d:
            float r1 = r1.sizeFactor
            float r0 = X.C122686Ri.A00
            float r1 = r1 / r0
            goto L_0x0012
        L_0x01a4:
            X.6Ri r1 = r8.A05
            r2 = r1
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409473r.A09():void");
    }

    public final void A0A(ViewGroup viewGroup) {
        C113615nN r1 = this.A04;
        if (!(r1 == null || r1.A05 == null)) {
            r1.A0B();
        }
        C113615nN r0 = this.A04;
        if (r0 != null) {
            r0.A0I((C108525bq) null);
        }
        this.A04 = null;
        viewGroup.removeAllViews();
    }

    public static int A00(C1409473r r0) {
        View A082 = r0.A08();
        if (A082 != null) {
            return A082.getHeight();
        }
        return 0;
    }

    public static final void A03(C1409473r r2, boolean z) {
        View A082 = r2.A08();
        if (A082 != null) {
            A082.animate().setDuration(250).setInterpolator((DecelerateInterpolator) C1409273p.A0E.getValue()).alpha(C108975cc.A01(z ? 1 : 0)).start();
        }
    }

    public final int A05() {
        View A082 = A08();
        if (A082 != null) {
            return A082.getWidth();
        }
        return 0;
    }

    public final Point A06(float f, float f2, boolean z, boolean z2) {
        View view;
        boolean z3;
        int i;
        C39351sv r3;
        int i2;
        int A002;
        int i3;
        int i4;
        int A052;
        int i5;
        int A053;
        int A003;
        boolean z4;
        View A082 = A08();
        Point point = null;
        if (A082 != null) {
            ViewParent parent = A082.getParent();
            if ((parent instanceof ViewGroup) && (view = (View) parent) != null) {
                if (z) {
                    Point point2 = new Point();
                    int i6 = this.A00;
                    Rect rect = this.A03;
                    int i7 = 0;
                    if (rect != null) {
                        i5 = rect.left;
                    } else {
                        i5 = 0;
                    }
                    int i8 = i6 + i5;
                    if (rect != null) {
                        A053 = rect.width();
                    } else {
                        A053 = A05();
                    }
                    point2.x = i8 + (A053 / 2);
                    int i9 = this.A02;
                    Rect rect2 = this.A03;
                    if (rect2 != null) {
                        i7 = rect2.top;
                    }
                    int i10 = i9 + i7;
                    if (rect2 != null) {
                        A003 = rect2.height();
                    } else {
                        A003 = A00(this);
                    }
                    int i11 = i10 + (A003 / 2);
                    point2.y = i11;
                    float f3 = ((float) i11) + (f2 * 0.1f);
                    boolean z5 = false;
                    int i12 = ((((float) point2.x) + (f * 0.1f)) > C108955ca.A00(view) ? 1 : ((((float) point2.x) + (f * 0.1f)) == C108955ca.A00(view) ? 0 : -1));
                    C18000vb r0 = this.A0F;
                    if (i12 <= 0 ? !AnonymousClass3MW.A1Z(r0) : !AnonymousClass3MY.A1b(r0)) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    this.A0C = z4;
                    if (f3 > ((float) C108945cZ.A06(view))) {
                        z5 = true;
                    }
                    this.A0B = z5;
                }
                if (z2 || this.A0D || this.A0C ? AnonymousClass3MY.A1b(this.A0F) : AnonymousClass3MW.A1Z(this.A0F)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                point = new Point();
                if (z3) {
                    int width = view.getWidth();
                    Rect rect3 = this.A03;
                    if (rect3 != null) {
                        A052 = rect3.right;
                    } else {
                        A052 = A05();
                    }
                    int i13 = width - A052;
                    r3 = this.A07;
                    if (r3 != null) {
                        i2 = i13 - r3.A02;
                    }
                    C18070vi.A11("floatingViewMargins");
                    throw null;
                }
                Rect rect4 = this.A03;
                if (rect4 != null) {
                    i = rect4.left;
                } else {
                    i = 0;
                }
                int i14 = -i;
                r3 = this.A07;
                if (r3 != null) {
                    i2 = i14 + r3.A01;
                }
                C18070vi.A11("floatingViewMargins");
                throw null;
                point.x = i2;
                if (this.A0B || z2 || this.A0D) {
                    int height = view.getHeight();
                    Rect rect5 = this.A03;
                    if (rect5 != null) {
                        A002 = rect5.bottom;
                    } else {
                        A002 = A00(this);
                    }
                    int i15 = height - A002;
                    C39351sv r02 = this.A07;
                    if (r02 != null) {
                        i3 = i15 - r02.A00;
                    }
                    C18070vi.A11("floatingViewMargins");
                    throw null;
                }
                Rect rect6 = this.A03;
                if (rect6 != null) {
                    i4 = rect6.top;
                } else {
                    i4 = 0;
                }
                i3 = (-i4) + r3.A03;
                point.y = i3;
            }
        }
        return point;
    }

    public final Rect A07() {
        int i;
        int A052;
        int A002;
        Rect A072 = AnonymousClass3MW.A07();
        int i2 = this.A00;
        Rect rect = this.A03;
        int i3 = 0;
        if (rect != null) {
            i = rect.left;
        } else {
            i = 0;
        }
        int i4 = i2 + i;
        A072.left = i4;
        int i5 = this.A02;
        if (rect != null) {
            i3 = rect.top;
        }
        A072.top = i5 + i3;
        if (rect != null) {
            A052 = rect.width();
        } else {
            A052 = A05();
        }
        A072.right = i4 + A052;
        int i6 = A072.top;
        Rect rect2 = this.A03;
        if (rect2 != null) {
            A002 = rect2.height();
        } else {
            A002 = A00(this);
        }
        A072.bottom = i6 + A002;
        return A072;
    }
}
