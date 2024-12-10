package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

public final class DNR implements E6D {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public View A0B;
    public ViewTreeObserver.OnPreDrawListener A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public boolean CHw(DOZ doz, Object obj, int i) {
        float f;
        float f2;
        C18070vi.A0d(obj, 2);
        if (i == 35) {
            float A042 = AnonymousClass000.A04(obj);
            this.A07 = A042;
            View view = this.A0B;
            if (view != null) {
                view.setScaleX(A042);
                return true;
            }
        } else if (i == 36) {
            float A043 = AnonymousClass000.A04(obj);
            this.A08 = A043;
            View view2 = this.A0B;
            if (view2 != null) {
                view2.setScaleY(A043);
                return true;
            }
        } else if (i == 38) {
            try {
                String str = (String) obj;
                if (str == null) {
                    f = 0.0f;
                } else {
                    f = A90.A01(str);
                }
                this.A09 = f;
                this.A0I = BE6.A1V(str);
            } catch (AnonymousClass9HX e) {
                C25913CoX.A00(doz, "ViewTransformsExtensionBinderUtils", "Could not parse translation_x value. ", e);
            }
            View view3 = this.A0B;
            if (view3 != null) {
                float A032 = C108945cZ.A03(view3);
                float f3 = this.A09;
                if (this.A0I) {
                    f3 = BE7.A01(f3, A032);
                }
                view3.setTranslationX(f3);
                return true;
            }
        } else if (i == 138) {
            float A044 = AnonymousClass000.A04(obj);
            this.A04 = A044;
            View view4 = this.A0B;
            if (view4 != null) {
                view4.setRotation(A044);
                return true;
            }
        } else if (i != 141) {
            switch (i) {
                case 40:
                    try {
                        String str2 = (String) obj;
                        if (str2 == null) {
                            f2 = 0.0f;
                        } else {
                            f2 = A90.A01(str2);
                        }
                        this.A0A = f2;
                        this.A0J = BE6.A1V(str2);
                    } catch (AnonymousClass9HX e2) {
                        C25913CoX.A00(doz, "ViewTransformsExtensionBinderUtils", "Could not parse translation_y value. ", e2);
                    }
                    View view5 = this.A0B;
                    if (view5 != null) {
                        float A045 = C108945cZ.A04(view5);
                        float f4 = this.A0A;
                        if (this.A0J) {
                            f4 = BE7.A01(f4, A045);
                        }
                        view5.setTranslationY(f4);
                        break;
                    }
                    break;
                case 41:
                    try {
                        String str3 = (String) obj;
                        this.A02 = A90.A01(str3);
                        this.A0G = BE6.A1V(str3);
                        this.A0F = true;
                    } catch (AnonymousClass9HX e3) {
                        C25913CoX.A00(doz, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_x value. ", e3);
                    }
                    View view6 = this.A0B;
                    if (view6 != null) {
                        float A033 = C108945cZ.A03(view6);
                        float f5 = this.A02;
                        if (this.A0G) {
                            f5 = BE7.A01(f5, A033);
                        }
                        view6.setPivotX(f5);
                        return true;
                    }
                    break;
                case 42:
                    try {
                        String str4 = (String) obj;
                        this.A03 = A90.A01(str4);
                        this.A0H = BE6.A1V(str4);
                        this.A0F = true;
                    } catch (AnonymousClass9HX e4) {
                        C25913CoX.A00(doz, "ViewTransformsExtensionBinderUtils", "Could not parse pivot_y value. ", e4);
                    }
                    View view7 = this.A0B;
                    if (view7 != null) {
                        float A046 = C108945cZ.A04(view7);
                        float f6 = this.A03;
                        if (this.A0H) {
                            f6 = BE7.A01(f6, A046);
                        }
                        view7.setPivotY(f6);
                        return true;
                    }
                    break;
                case 43:
                    this.A01 = AnonymousClass000.A04(obj);
                    View view8 = this.A0B;
                    if (view8 != null) {
                        Context A047 = AnonymousClass3MY.A04(view8);
                        float f7 = this.A01;
                        if (f7 == 0.0f) {
                            f7 = 2.14748365E9f;
                        }
                        float A002 = C72463Mc.A00(A047);
                        view8.setCameraDistance(A002 * A002 * (-f7) * C26089Cs7.A00);
                        return true;
                    }
                    break;
                case 44:
                    float A048 = AnonymousClass000.A04(obj);
                    this.A05 = A048;
                    View view9 = this.A0B;
                    if (view9 != null) {
                        view9.setRotationX(A048);
                        return true;
                    }
                    break;
                case 45:
                    float A049 = AnonymousClass000.A04(obj);
                    this.A06 = A049;
                    View view10 = this.A0B;
                    if (view10 != null) {
                        view10.setRotationY(A049);
                        return true;
                    }
                    break;
                default:
                    return false;
            }
        } else {
            float A0410 = AnonymousClass000.A04(obj);
            this.A00 = A0410;
            View view11 = this.A0B;
            if (view11 != null) {
                view11.setAlpha(A0410);
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (X.BE6.A1V(r2) == false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ac, code lost:
        if (X.BE6.A1V(r1) != false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (X.BE6.A1V(r2) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.DFL r9) {
        /*
            r8 = this;
            java.lang.String r4 = "ViewTransformsExtensionBinderUtils"
            r0 = 141(0x8d, float:1.98E-43)
            r7 = 1065353216(0x3f800000, float:1.0)
            float r0 = r9.A03(r0, r7)
            r8.A00 = r0
            r0 = 38
            r3 = 0
            r5 = 0
            r6 = 1
            r1 = 0
            java.lang.String r2 = r9.A0D(r0)     // Catch:{ 9HX -> 0x0047 }
            if (r2 != 0) goto L_0x001a
            r0 = 0
            goto L_0x001e
        L_0x001a:
            float r0 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0047 }
        L_0x001e:
            r8.A09 = r0     // Catch:{ 9HX -> 0x0047 }
            if (r2 == 0) goto L_0x0029
            boolean r2 = X.BE6.A1V(r2)     // Catch:{ 9HX -> 0x0047 }
            r0 = 1
            if (r2 != 0) goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r8.A0I = r0     // Catch:{ 9HX -> 0x0047 }
            java.lang.String r2 = X.BE7.A0g(r9)     // Catch:{ 9HX -> 0x0047 }
            if (r2 != 0) goto L_0x0034
            r0 = 0
            goto L_0x0038
        L_0x0034:
            float r0 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x0047 }
        L_0x0038:
            r8.A0A = r0     // Catch:{ 9HX -> 0x0047 }
            if (r2 == 0) goto L_0x0043
            boolean r2 = X.BE6.A1V(r2)     // Catch:{ 9HX -> 0x0047 }
            r0 = 1
            if (r2 != 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            r8.A0J = r0     // Catch:{ 9HX -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r2 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.C25913CoX.A00(r3, r4, r0, r2)
        L_0x004d:
            r0 = 35
            float r0 = r9.A03(r0, r7)
            r8.A07 = r0
            r0 = 36
            float r0 = r9.A03(r0, r7)
            r8.A08 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r9.A03(r0, r1)
            r8.A04 = r0
            r0 = 44
            float r0 = r9.A03(r0, r1)
            r8.A05 = r0
            r0 = 45
            float r0 = r9.A03(r0, r1)
            r8.A06 = r0
            r1 = 43
            r0 = 1151336448(0x44a00000, float:1280.0)
            float r0 = r9.A03(r1, r0)
            r8.A01 = r0
            r0 = 41
            java.lang.String r1 = r9.A0D(r0)     // Catch:{ 9HX -> 0x00bd }
            java.lang.String r2 = X.BE7.A0i(r9)     // Catch:{ 9HX -> 0x00bd }
            if (r1 != 0) goto L_0x008d
            if (r2 == 0) goto L_0x00c3
        L_0x008d:
            r8.A0F = r6     // Catch:{ 9HX -> 0x00bd }
            if (r1 != 0) goto L_0x0094
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x0098
        L_0x0094:
            float r0 = X.A90.A01(r1)     // Catch:{ 9HX -> 0x00bd }
        L_0x0098:
            r8.A02 = r0     // Catch:{ 9HX -> 0x00bd }
            if (r2 != 0) goto L_0x009f
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x00a3
        L_0x009f:
            float r0 = X.A90.A01(r2)     // Catch:{ 9HX -> 0x00bd }
        L_0x00a3:
            r8.A03 = r0     // Catch:{ 9HX -> 0x00bd }
            if (r1 == 0) goto L_0x00ae
            boolean r1 = X.BE6.A1V(r1)     // Catch:{ 9HX -> 0x00bd }
            r0 = 0
            if (r1 == 0) goto L_0x00af
        L_0x00ae:
            r0 = 1
        L_0x00af:
            r8.A0G = r0     // Catch:{ 9HX -> 0x00bd }
            if (r2 == 0) goto L_0x00b9
            boolean r0 = X.BE6.A1V(r2)     // Catch:{ 9HX -> 0x00bd }
            if (r0 == 0) goto L_0x00ba
        L_0x00b9:
            r5 = 1
        L_0x00ba:
            r8.A0H = r5     // Catch:{ 9HX -> 0x00bd }
            return
        L_0x00bd:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.C25913CoX.A00(r3, r4, r0, r1)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DNR.A00(X.DFL):void");
    }
}
