package X;

import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.CuZ  reason: case insensitive filesystem */
public class C26203CuZ {
    public static C22614BFu A0K;
    public static final Object A0L = C17880vN.A0p();
    public static final ArrayList A0M = AnonymousClass000.A13();
    public static final ArrayList A0N = AnonymousClass000.A13();
    public static final ArrayList A0O = AnonymousClass000.A13();
    public static final ArrayList A0P = AnonymousClass000.A13();
    public static final ArrayList A0Q = AnonymousClass000.A13();
    public static final Interpolator A0R = new AccelerateDecelerateInterpolator();
    public static final C25782Clt A0S = new C25782Clt(64);
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06;
    public long A07 = 300;
    public long A08 = -1;
    public long A09;
    public Interpolator A0A = A0R;
    public ArrayList A0B = null;
    public ArrayList A0C = null;
    public boolean A0D = true;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public float[] A0I = new float[2];
    public float[] A0J = new float[2];

    public static C26203CuZ A00(float f, float f2) {
        C26203CuZ cuZ = (C26203CuZ) A0S.A00();
        if (cuZ == null) {
            cuZ = new C26203CuZ();
        }
        cuZ.A03 = 2;
        float[] fArr = cuZ.A0I;
        fArr[0] = 0.0f;
        float[] fArr2 = cuZ.A0J;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        cuZ.A0E = false;
        return cuZ;
    }

    public static void A01(C26203CuZ cuZ) {
        A0M.remove(cuZ);
        A0P.remove(cuZ);
        A0N.remove(cuZ);
        cuZ.A04 = 0;
        cuZ.A0G = false;
        if (cuZ.A0F) {
            cuZ.A0F = false;
            ArrayList arrayList = cuZ.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    DAE dae = (DAE) cuZ.A0B.get(i);
                    if (cuZ == dae.A0I) {
                        dae.A0I = null;
                    } else if (cuZ == dae.A0J) {
                        dae.A0J = null;
                    } else if (cuZ == dae.A0K) {
                        dae.A0K = null;
                    } else if (cuZ == dae.A0H) {
                        dae.A0H = null;
                    }
                    cuZ.A04();
                    if (dae.A0L && dae.A0I == null && dae.A0J == null && dae.A0K == null && dae.A0H == null) {
                        dae.A0L = false;
                        E7P e7p = dae.A07;
                        if (e7p != null) {
                            dae.A07 = null;
                            e7p.Buc();
                        }
                        dae.A04();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        if (r2 >= 1.0f) goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C26203CuZ r9, long r10) {
        /*
            int r0 = r9.A04
            r7 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0011
            r9.A04 = r6
            long r2 = r9.A08
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x00dc
            r9.A09 = r10
        L_0x0011:
            long r3 = r9.A07
            r5 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d8
            long r0 = r9.A09
            long r10 = r10 - r0
            float r2 = (float) r10
            float r0 = (float) r3
            float r2 = r2 / r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00d5
        L_0x0023:
            int r7 = r9.A02
            int r1 = r9.A05
            if (r7 < r1) goto L_0x00ba
            r0 = -1
            if (r1 == r0) goto L_0x00ba
            float r2 = java.lang.Math.min(r2, r5)
        L_0x0030:
            int r1 = r9.A03
            r3 = 0
            r4 = 1
            r7 = 2
            if (r1 != r7) goto L_0x006f
            boolean r0 = r9.A0D
            if (r0 == 0) goto L_0x0046
            r9.A0D = r3
            float[] r0 = r9.A0J
            r1 = r0[r4]
            r0 = r0[r3]
            float r1 = r1 - r0
            r9.A01 = r1
        L_0x0046:
            android.view.animation.Interpolator r0 = r9.A0A
            float r1 = r0.getInterpolation(r2)
            float[] r0 = r9.A0J
            r2 = r0[r3]
            float r0 = r9.A01
            float r1 = r1 * r0
            float r2 = r2 + r1
        L_0x0054:
            r9.A00 = r2
            java.util.ArrayList r0 = r9.A0C
            if (r0 == 0) goto L_0x00e6
            int r2 = r0.size()
            r1 = 0
        L_0x005f:
            if (r1 >= r2) goto L_0x00e6
            java.util.ArrayList r0 = r9.A0C
            java.lang.Object r0 = r0.get(r1)
            X.E47 r0 = (X.E47) r0
            r0.BlR(r9)
            int r1 = r1 + 1
            goto L_0x005f
        L_0x006f:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x008e
            android.view.animation.Interpolator r0 = r9.A0A
            float r2 = r0.getInterpolation(r2)
            float[] r0 = r9.A0I
            r1 = r0[r3]
            float r2 = r2 - r1
            r0 = r0[r4]
            float r0 = r0 - r1
            float r2 = r2 / r0
            float[] r0 = r9.A0J
            r1 = r0[r3]
            r0 = r0[r4]
            float r2 = X.C17880vN.A00(r0, r1, r2)
            goto L_0x0054
        L_0x008e:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b4
            android.view.animation.Interpolator r0 = r9.A0A
            float r5 = r0.getInterpolation(r2)
            float[] r0 = r9.A0I
            int r4 = r9.A03
            int r3 = r4 + -2
            r2 = r0[r3]
            float r5 = r5 - r2
            int r1 = r4 + -1
            r0 = r0[r1]
            float r0 = r0 - r2
            float r5 = r5 / r0
            float[] r0 = r9.A0J
            r2 = r0[r3]
            r1 = r0[r1]
            int r4 = r4 - r7
            r0 = r0[r4]
            float r1 = r1 - r0
            float r5 = r5 * r1
            float r2 = r2 + r5
            goto L_0x0054
        L_0x00b4:
            float[] r0 = r9.A0J
            int r1 = r1 - r4
            r2 = r0[r1]
            goto L_0x0054
        L_0x00ba:
            java.util.ArrayList r6 = r9.A0B
            if (r6 == 0) goto L_0x00cb
            int r1 = r6.size()
            r0 = 0
        L_0x00c3:
            if (r0 >= r1) goto L_0x00cb
            r6.get(r0)
            int r0 = r0 + 1
            goto L_0x00c3
        L_0x00cb:
            int r0 = (int) r2
            int r7 = r7 + r0
            r9.A02 = r7
            float r2 = r2 % r5
            long r0 = r9.A09
            long r0 = r0 + r3
            r9.A09 = r0
        L_0x00d5:
            r6 = 0
            goto L_0x0030
        L_0x00d8:
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0023
        L_0x00dc:
            long r0 = r10 - r2
            r9.A09 = r0
            r0 = -1
            r9.A08 = r0
            goto L_0x0011
        L_0x00e6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26203CuZ.A02(X.CuZ, long):boolean");
    }

    public void A03() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0P.contains(this) || A0N.contains(this)) {
            if (this.A0F && (arrayList = this.A0B) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    DAE dae = (DAE) this.A0B.get(i);
                    if (this == dae.A0I) {
                        dae.A0I = null;
                    } else if (this == dae.A0J) {
                        dae.A0J = null;
                    } else if (this == dae.A0K) {
                        dae.A0K = null;
                    } else if (this == dae.A0H) {
                        dae.A0H = null;
                    }
                    A04();
                    if (dae.A0I == null && dae.A0J == null && dae.A0K == null && dae.A0H == null) {
                        dae.A0L = false;
                        E7P e7p = dae.A07;
                        if (e7p != null) {
                            dae.A07 = null;
                            e7p.Bnj();
                        }
                        dae.A04();
                    }
                }
            }
            A01(this);
        }
    }

    public void A04() {
        ArrayList arrayList = this.A0B;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0C;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A09 = 0;
        this.A08 = -1;
        this.A02 = 0;
        this.A0H = false;
        this.A06 = 0;
        this.A04 = 0;
        this.A0F = false;
        this.A0G = false;
        this.A0E = false;
        this.A07 = 300;
        this.A05 = 0;
        this.A0A = A0R;
        this.A00 = 0.0f;
        this.A0D = true;
        A0S.A02(this);
    }

    public void A06(long j) {
        if (j >= 0) {
            this.A07 = j;
            return;
        }
        throw AnonymousClass000.A0k(C17890vO.A0a("Animators cannot have negative duration: ", AnonymousClass000.A10(), j));
    }

    public void A07(DAE dae) {
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A13();
            this.A0B = arrayList;
        }
        arrayList.add(dae);
    }

    public void A08(E47 e47) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A13();
            this.A0C = arrayList;
        }
        arrayList.add(e47);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.BFu, android.os.Handler] */
    public void A05() {
        long j;
        C22614BFu bFu;
        if (Looper.myLooper() != null) {
            this.A02 = 0;
            this.A04 = 0;
            this.A0G = true;
            this.A0H = false;
            A0P.add(this);
            if (!this.A0E || this.A04 == 0) {
                j = 0;
            } else {
                j = AnimationUtils.currentAnimationTimeMillis() - this.A09;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A08 = j;
                this.A04 = AnonymousClass8BU.A00(this.A0E ? 1 : 0);
            }
            this.A09 = currentAnimationTimeMillis - j;
            this.A0E = true;
            A02(this, currentAnimationTimeMillis);
            this.A0F = true;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.get(i);
                }
            }
            synchronized (A0L) {
                C22614BFu bFu2 = A0K;
                bFu = bFu2;
                if (bFu2 == null) {
                    ? handler = new Handler();
                    A0K = handler;
                    bFu = handler;
                }
            }
            bFu.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }
}
