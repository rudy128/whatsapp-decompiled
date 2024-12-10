package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Comparator;

public abstract class DA3 implements C22405B6i {
    public static int A0D;
    public static final Comparator A0E = new DUR(7);
    public double A00;
    public double A01;
    public float A02;
    public int A03 = 1;
    public boolean A04 = true;
    public final int A05;
    public final Context A06;
    public final DAE A07;
    public final C26152CtJ A08;
    public final C199339zp A09 = new Object();
    public final float[] A0A = C108945cZ.A1V();
    public final float A0B;
    public final int A0C;

    public abstract void A08(Canvas canvas);

    public void A03() {
        this.A07.A0Q.invalidate();
    }

    public void A04() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this instanceof BPQ) {
            BPQ bpq = (BPQ) this;
            float f6 = bpq.A03;
            float f7 = f6 + 0.0f;
            float f8 = f6 + ((float) bpq.A07.A06);
            float f9 = bpq.A02;
            bpq.A00 = f7 + f9;
            bpq.A01 = f8 + f9;
        } else if (this instanceof BPP) {
            BPP bpp = (BPP) this;
            DAE dae = bpp.A07;
            BIS bis = dae.A0Q;
            Rect rect = bpp.A03;
            Drawable drawable = bpp.A06;
            rect.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int ordinal = bpp.A07.ordinal();
            if (ordinal == 0) {
                f = bpp.A00;
                f4 = 0.0f + f;
                f3 = f + ((float) dae.A06);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    f5 = bpp.A00;
                    f2 = (((float) (bis.getWidth() - rect.width())) - f5) - ((float) dae.A05);
                } else {
                    f5 = bpp.A00;
                    f2 = f5 + 0.0f;
                }
                f3 = (((float) (bis.getHeight() - rect.height())) - f5) - ((float) dae.A04);
            } else {
                f = bpp.A00;
                f4 = (((float) (bis.getWidth() - rect.width())) - f) - ((float) dae.A05);
                f3 = f + ((float) dae.A06);
            }
            RectF rectF = bpp.A04;
            rectF.set(rect);
            rectF.offsetTo(f2, f3);
            rect.offsetTo((int) f2, (int) f3);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            RectF rectF2 = bpp.A05;
            float f10 = bpp.A02;
            rectF2.set(centerX - f10, centerY - f10, centerX + f10, centerY + f10);
        }
    }

    public void A05(boolean z) {
        this.A04 = z;
        A03();
    }

    public int A06(float f, float f2) {
        if (this instanceof BPT) {
            BPT bpt = (BPT) this;
            if (bpt.A0J) {
                Matrix matrix = BPT.A0X;
                matrix.setRotate(bpt.A05);
                float[] fArr = bpt.A0T;
                fArr[0] = bpt.A01 - bpt.A03;
                fArr[1] = bpt.A07 - bpt.A06;
                matrix.mapPoints(fArr);
                float f3 = fArr[0] + bpt.A09;
                fArr[0] = f3;
                float f4 = fArr[1] + (bpt.A0A - bpt.A0R);
                fArr[1] = f4;
                int i = bpt.A0C;
                float f5 = (float) bpt.A0B;
                float f6 = f4 - f5;
                float f7 = (float) (i / 2);
                float f8 = f3 - f7;
                float f9 = f3 + f7;
                float f10 = bpt.A0S;
                if (f5 <= f10) {
                    float f11 = bpt.A08;
                    f6 -= f11;
                    f4 -= f11;
                }
                if (((float) i) <= f10) {
                    float f12 = bpt.A02;
                    f8 -= f12;
                    f9 += f12;
                }
                if (f >= f8 && f <= f9 && f2 >= f6 && f2 <= f4) {
                    bpt.A0H = true;
                    return 2;
                }
            }
            bpt.A0H = false;
            if (!BPT.A02(bpt)) {
                return 0;
            }
            long nanoTime = System.nanoTime();
            try {
                float[] fArr2 = bpt.A0T;
                fArr2[0] = f;
                fArr2[1] = f2;
                Matrix matrix2 = BPT.A0X;
                matrix2.setRotate(-bpt.A05, bpt.A09, bpt.A0A);
                matrix2.mapPoints(fArr2);
                float f13 = fArr2[0];
                float f14 = bpt.A09;
                float f15 = f14 - bpt.A03;
                if (f13 >= f15 && f13 <= bpt.A04 + f14) {
                    float f16 = fArr2[1];
                    float f17 = bpt.A0A;
                    if (f16 >= f17 - bpt.A06 && f16 <= f17 + bpt.A00) {
                        return 2;
                    }
                }
                float f18 = bpt.A02;
                if (f13 >= f15 - f18 && f13 <= f14 + bpt.A04 + f18) {
                    float f19 = fArr2[1];
                    float f20 = bpt.A0A;
                    float f21 = bpt.A08;
                    if (f19 >= (f20 - bpt.A06) - f21 && f19 <= f20 + bpt.A00 + f21) {
                        BE8.A0z(C26138Ct1.A0H, nanoTime);
                        return 1;
                    }
                }
                BE8.A0z(C26138Ct1.A0H, nanoTime);
                return 0;
            } finally {
                BE8.A0z(C26138Ct1.A0H, nanoTime);
            }
        } else if (this instanceof BPR) {
            BPR bpr = (BPR) this;
            float f22 = bpr.A01;
            float f23 = bpr.A02;
            float f24 = f22 - f23;
            if (f >= f24 && f <= f22) {
                float f25 = bpr.A03;
                if (f2 >= f25 && f2 <= f25 + f23) {
                    bpr.A04 = true;
                    return 2;
                }
            }
            float f26 = bpr.A00;
            if (f >= f24 - f26 && f <= f22 + f26) {
                float f27 = bpr.A03;
                if (f2 >= f27 - f26 && f2 <= f27 + f23 + f26) {
                    bpr.A04 = true;
                    return 1;
                }
            }
            bpr.A04 = false;
            return 0;
        } else if (this instanceof BPQ) {
            BPQ bpq = (BPQ) this;
            float f28 = bpq.A00;
            float f29 = bpq.A02;
            if (f >= f28 - f29 && f <= f28 + f29) {
                float f30 = bpq.A01;
                if (f2 >= f30 - f29 && f2 <= f30 + f29) {
                    return 2;
                }
            }
            float f31 = bpq.A09;
            if (f < f28 - f31 || f > f28 + f31) {
                return 0;
            }
            float f32 = bpq.A01;
            if (f2 < f32 - f31 || f2 > f32 + f31) {
                return 0;
            }
            return 1;
        } else if (!(this instanceof BPP)) {
            return 0;
        } else {
            BPP bpp = (BPP) this;
            if (!bpp.A04.contains(f, f2)) {
                return AnonymousClass000.A1O(bpp.A05.contains(f, f2) ? 1 : 0) ? 1 : 0;
            }
            return 2;
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, X.D3H] */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        if (r4.A0H.A06() != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A07(float r13, float r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.BPT
            if (r0 == 0) goto L_0x017f
            r1 = r12
            X.BPT r1 = (X.BPT) r1
            X.DAE r5 = r1.A07
            java.lang.String r2 = "marker_click"
            X.BIS r0 = r5.A0Q
            X.EBQ r0 = r0.A0S
            r0.CHV(r2)
            boolean r0 = r1.A0H
            r3 = 1
            if (r0 == 0) goto L_0x008d
            X.DAE r0 = r1.A0D
            if (r0 == 0) goto L_0x008d
            X.E0b r2 = r0.A0A
            if (r2 == 0) goto L_0x008d
            X.DA8 r2 = (X.DA8) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r2.A01
            com.whatsapp.location.LocationPicker r0 = (com.whatsapp.location.LocationPicker) r0
            X.75M r2 = r0.A0O
            int r0 = r1.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A0a(r0, r1)
        L_0x0034:
            return r3
        L_0x0035:
            java.lang.Object r5 = r2.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity r5 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r5
            java.lang.Object r0 = r1.A0F
            X.6yC r0 = (X.C139086yC) r0
            if (r0 == 0) goto L_0x0034
            X.11S r2 = r5.A02
            X.2nL r0 = r0.A02
            com.whatsapp.jid.UserJid r8 = r0.A06
            boolean r0 = r2.A0O(r8)
            if (r0 != 0) goto L_0x0034
            X.AEc r1 = r1.A0E
            X.DAE r0 = r5.A05
            X.C17960vV.A07(r0)
            X.CtJ r0 = r0.A0R
            android.graphics.Point r0 = r0.A04(r1)
            android.graphics.Rect r6 = X.AnonymousClass3MW.A07()
            int r1 = r0.x
            r6.left = r1
            int r0 = r0.y
            r6.top = r0
            r6.right = r1
            r6.bottom = r0
            X.7By r4 = r5.A0N
            X.2nL r2 = r4.A0O
            if (r2 == 0) goto L_0x008a
            double r0 = r2.A00
            java.lang.Double r9 = java.lang.Double.valueOf(r0)
            double r0 = r2.A01
            java.lang.Double r10 = java.lang.Double.valueOf(r0)
        L_0x007a:
            r0 = 16
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            X.1BI r7 = r4.A0I
            android.content.Intent r0 = X.A09.A00(r5, r6, r7, r8, r9, r10, r11)
            r5.startActivity(r0)
            return r3
        L_0x008a:
            r9 = 0
            r10 = r9
            goto L_0x007a
        L_0x008d:
            X.DAE r0 = r1.A0D
            if (r0 == 0) goto L_0x0034
            X.E0c r2 = r0.A0C
            if (r2 == 0) goto L_0x016c
            X.DAA r2 = (X.DAA) r2
            int r0 = r2.A00
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r4 = r2.A01
            com.whatsapp.location.LocationPicker r4 = (com.whatsapp.location.LocationPicker) r4
            X.75M r2 = r4.A0O
            boolean r0 = r2.A0i
            if (r0 != 0) goto L_0x0034
            int r0 = r1.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            if (r0 == 0) goto L_0x016c
            com.whatsapp.location.PlaceInfo r0 = r2.A0U
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r2 = r0.A0D
            if (r2 == 0) goto L_0x00bf
            X.BPT r2 = (X.BPT) r2
            X.CgX r0 = r4.A05
            r2.A0C(r0)
            r2.A09()
        L_0x00bf:
            X.CgX r0 = r4.A06
            r1.A0C(r0)
            X.75M r0 = r4.A0O
            r0.A0Z(r1)
            X.75M r0 = r4.A0O
            android.view.View r0 = r0.A08
            r2 = 8
            r0.setVisibility(r2)
            X.75M r0 = r4.A0O
            android.view.View r0 = r0.A0B
            r0.setVisibility(r2)
            X.75M r0 = r4.A0O
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x00e7
            X.17x r0 = r4.A0H
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0034
        L_0x00e7:
            r1.A0A()
            return r3
        L_0x00eb:
            java.lang.Object r5 = r2.A01
            com.whatsapp.location.GroupChatLiveLocationsActivity r5 = (com.whatsapp.location.GroupChatLiveLocationsActivity) r5
            X.7By r0 = r5.A0N
            r0.A0W = r3
            r6 = 0
            r0.A0U = r6
            android.view.View r4 = r0.A0C
            X.2nL r2 = r0.A0O
            r0 = 8
            if (r2 != 0) goto L_0x00ff
            r0 = 0
        L_0x00ff:
            r4.setVisibility(r0)
            java.lang.Object r2 = r1.A0F
            boolean r0 = r2 instanceof X.C139086yC
            if (r0 == 0) goto L_0x0166
            X.6yC r2 = (X.C139086yC) r2
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0128
            X.7By r1 = r5.A0N
            java.util.List r0 = r2.A04
            java.lang.Object r0 = r0.get(r6)
            X.2nL r0 = (X.C60072nL) r0
            X.6yC r2 = r1.A0K(r0)
            if (r2 == 0) goto L_0x0166
            java.lang.String r1 = r2.A03
            java.util.Map r0 = r5.A0V
            java.lang.Object r1 = r0.get(r1)
            X.BPT r1 = (X.BPT) r1
        L_0x0128:
            int r0 = r2.A00
            if (r0 == r3) goto L_0x0166
            java.util.List r4 = r2.A04
            int r0 = r4.size()
            if (r0 != r3) goto L_0x013a
            X.7By r0 = r5.A0N
            r0.A0X(r2, r3)
            goto L_0x00e7
        L_0x013a:
            X.DAE r0 = r5.A05
            X.C17960vV.A07(r0)
            X.D44 r0 = r0.A02()
            float r1 = r0.A02
            r0 = 1098907648(0x41800000, float:16.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0151
            X.7By r0 = r5.A0N
            r0.A0X(r2, r3)
            return r3
        L_0x0151:
            com.whatsapp.location.GroupChatLiveLocationsActivity.A0d(r5, r4, r3)
            X.7By r2 = r5.A0N
            X.DAE r0 = r5.A05
            X.D44 r0 = r0.A02()
            float r1 = r0.A02
            X.6eC r0 = new X.6eC
            r0.<init>(r4, r1)
            r2.A0L = r0
            return r3
        L_0x0166:
            X.7By r0 = r5.A0N
            r0.A0N()
            return r3
        L_0x016c:
            r1.A0A()
            X.AEc r0 = r1.A0E
            X.CXL r2 = new X.CXL
            r2.<init>()
            r2.A06 = r0
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            r5.A0A(r2, r0, r1)
            return r3
        L_0x017f:
            boolean r0 = r12 instanceof X.BPR
            if (r0 == 0) goto L_0x01a3
            X.DAE r2 = r12.A07
            java.lang.String r1 = "my_location_button_click"
            X.BIS r0 = r2.A0Q
            X.EBQ r0 = r0.A0S
            r0.CHV(r1)
            X.Ck9 r0 = r2.A0U
            android.location.Location r0 = r0.A00
            if (r0 == 0) goto L_0x01a1
            X.AEc r1 = X.BEA.A0T(r0)
            r0 = 1097859072(0x41700000, float:15.0)
            X.CXL r1 = X.C25306CdA.A01(r1, r0)
        L_0x019e:
            r2.A08(r1)
        L_0x01a1:
            r0 = 1
            return r0
        L_0x01a3:
            boolean r0 = r12 instanceof X.BPQ
            if (r0 == 0) goto L_0x01b2
            X.DAE r2 = r12.A07
            r0 = 0
            X.CXL r1 = new X.CXL
            r1.<init>()
            r1.A00 = r0
            goto L_0x019e
        L_0x01b2:
            boolean r0 = r12 instanceof X.BPP
            if (r0 == 0) goto L_0x031f
            r3 = r12
            X.BPP r3 = (X.BPP) r3
            X.DAE r0 = r3.A07
            X.D44 r10 = r0.A02()
            X.BIS r1 = r0.A0Q
            X.Cif r2 = r3.A01
            android.content.Context r5 = r3.A06
            int r8 = r1.getWidth()
            int r7 = r1.getHeight()
            android.content.Context r0 = r0.A0O
            android.content.res.Resources r11 = r0.getResources()
            java.lang.String r6 = X.C26101CsL.A04
            X.CTh r0 = r1.A0N
            java.lang.String r1 = r0.A04
            X.D3H r3 = new X.D3H
            r3.<init>()
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.A00 = r0
            r3.A01 = r0
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            r3.A0C = r0
            r3.A08 = r1
            java.lang.String r0 = "InfoButtonDrawable.java"
            r3.A04 = r0
            X.AEc r9 = r10.A03
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            double r0 = r9.A00
            r4.append(r0)
            X.BE6.A1K(r4)
            double r0 = r9.A01
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.A02 = r0
            float r0 = r10.A02
            int r0 = (int) r0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A0B = r0
            android.util.DisplayMetrics r0 = r11.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r10 = 2
            if (r0 >= 0) goto L_0x021e
            r10 = 1
        L_0x021e:
            android.util.DisplayMetrics r0 = r11.getDisplayMetrics()
            float r1 = r0.density
            r0 = 1069547520(0x3fc00000, float:1.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d2
            r9 = 1
        L_0x022b:
            boolean r0 = X.C26101CsL.A06
            X.C26101CsL.A02(r0)
            X.CTC r0 = X.C26101CsL.A0B
            java.lang.String r0 = r0.A03
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r4 = r0.buildUpon()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            int r8 = r8 / r10
            X.BE8.A1C(r0, r8)
            int r7 = r7 / r10
            java.lang.String r1 = X.C17880vN.A0t(r0, r7)
            java.lang.String r0 = "size"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r0, r1)
            java.lang.String r1 = "scale"
            java.lang.String r0 = java.lang.String.valueOf(r10)
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r1, r0)
            java.lang.String r1 = "marker_scale"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            android.net.Uri$Builder r1 = r4.appendQueryParameter(r1, r0)
            java.lang.String r0 = "language"
            android.net.Uri$Builder r4 = r1.appendQueryParameter(r0, r6)
            java.lang.String r1 = r3.A05
            if (r1 != 0) goto L_0x026f
            java.lang.String r1 = "jpg"
        L_0x026f:
            java.lang.String r0 = "format"
            android.net.Uri$Builder r4 = r4.appendQueryParameter(r0, r1)
            java.lang.String r1 = "visible"
            java.lang.String r0 = r3.A0A
            if (r0 == 0) goto L_0x027e
            r4.appendQueryParameter(r1, r0)
        L_0x027e:
            java.lang.String r1 = "circle"
            java.lang.String r0 = r3.A03
            if (r0 == 0) goto L_0x0287
            r4.appendQueryParameter(r1, r0)
        L_0x0287:
            java.lang.String r1 = "markers"
            java.lang.String r0 = r3.A06
            if (r0 == 0) goto L_0x0290
            r4.appendQueryParameter(r1, r0)
        L_0x0290:
            java.lang.String r1 = "path"
            java.lang.String r0 = r3.A07
            if (r0 == 0) goto L_0x0299
            r4.appendQueryParameter(r1, r0)
        L_0x0299:
            java.lang.String r1 = "center"
            java.lang.String r0 = r3.A02
            if (r0 == 0) goto L_0x02a2
            r4.appendQueryParameter(r1, r0)
        L_0x02a2:
            java.lang.String r1 = "zoom"
            java.lang.String r0 = r3.A0B
            if (r0 == 0) goto L_0x02ab
            r4.appendQueryParameter(r1, r0)
        L_0x02ab:
            java.util.List r0 = r3.A0C
            int r7 = r0.size()
            r6 = 0
        L_0x02b2:
            if (r6 >= r7) goto L_0x02dc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "marker_list["
            r1.append(r0)
            r1.append(r6)
            java.lang.String r1 = X.AnonymousClass000.A0z(r1)
            java.util.List r0 = r3.A0C
            java.lang.String r0 = X.C17880vN.A0w(r0, r6)
            if (r0 == 0) goto L_0x02cf
            r4.appendQueryParameter(r1, r0)
        L_0x02cf:
            int r6 = r6 + 1
            goto L_0x02b2
        L_0x02d2:
            r0 = 1075838976(0x40200000, float:2.5)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            r9 = 3
            if (r0 >= 0) goto L_0x022b
            r9 = 2
            goto L_0x022b
        L_0x02dc:
            java.lang.String r1 = "theme"
            java.lang.String r0 = r3.A09
            if (r0 == 0) goto L_0x02e5
            r4.appendQueryParameter(r1, r0)
        L_0x02e5:
            java.lang.String r1 = r3.A04
            if (r1 != 0) goto L_0x02eb
            java.lang.String r1 = "StaticMapView.java"
        L_0x02eb:
            java.lang.String r0 = "_nc_client_caller"
            r4.appendQueryParameter(r0, r1)
            java.lang.String r1 = "_nc_client_id"
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x02f9
            r4.appendQueryParameter(r1, r0)
        L_0x02f9:
            android.net.Uri r4 = r4.build()
            X.Bth r0 = r2.A05
            X.1nl r3 = r0.A09
            java.lang.String r0 = "https://mbasic.facebook.com/maps/information/?"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            android.net.Uri$Builder r2 = r0.buildUpon()
            java.lang.String r1 = "static_map_url"
            java.lang.String r0 = r4.toString()
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)
            android.net.Uri r1 = r0.build()
            r0 = 0
            r3.CGU(r5, r1, r0)
            goto L_0x01a1
        L_0x031f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DA3.A07(float, float):boolean");
    }

    public C20269AEc BXJ() {
        if (this instanceof BPT) {
            return ((BPT) this).A0E;
        }
        return new C20269AEc(C26152CtJ.A02(this.A01), (this.A00 * 360.0d) - 180.0d);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.9zp, java.lang.Object] */
    public DA3(DAE dae) {
        int i = A0D;
        A0D = i + 1;
        this.A05 = i;
        this.A07 = dae;
        this.A08 = dae.A0R;
        Context context = dae.A0Q.getContext();
        this.A06 = context;
        this.A0B = C72463Mc.A00(context);
        this.A0C = dae.A0N;
    }
}
