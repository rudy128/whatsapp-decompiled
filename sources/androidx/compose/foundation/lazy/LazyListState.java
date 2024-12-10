package androidx.compose.foundation.lazy;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass074;
import X.AnonymousClass08V;
import X.AnonymousClass0CH;
import X.AnonymousClass0D0;
import X.AnonymousClass0ET;
import X.AnonymousClass0GU;
import X.AnonymousClass0H1;
import X.AnonymousClass0H2;
import X.AnonymousClass0H3;
import X.AnonymousClass0MW;
import X.AnonymousClass0N4;
import X.AnonymousClass0OG;
import X.AnonymousClass0OM;
import X.AnonymousClass0Q9;
import X.AnonymousClass0V0;
import X.AnonymousClass0V7;
import X.AnonymousClass0V8;
import X.AnonymousClass0XG;
import X.AnonymousClass0XN;
import X.AnonymousClass1OX;
import X.AnonymousClass3F6;
import X.AnonymousClass4Z4;
import X.C02250Dh;
import X.C03970Li;
import X.C04790Ov;
import X.C05500Um;
import X.C05740Vn;
import X.C05780Vr;
import X.C06620Za;
import X.C06830Zv;
import X.C09590gx;
import X.C11860kn;
import X.C14550pC;
import X.C15690r2;
import X.C15700r3;
import X.C15720r5;
import X.C16180rq;
import X.C16450sH;
import X.C16590sg;
import X.C16680sp;
import X.C16840tJ;
import X.C17210uI;
import X.C17330uU;
import X.C17370uY;
import X.C18100vl;
import X.C18560wh;
import X.C22339B3q;
import X.C25290Ccs;
import X.C25411Oc;
import X.C26229CvL;
import X.C27621Wu;
import X.C28644ECa;
import X.C29431cG;
import X.C30391dr;
import androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier;
import androidx.compose.runtime.snapshots.Snapshot;
import java.util.List;

public final class LazyListState implements C16840tJ {
    public static final C16680sp A0R = AnonymousClass0ET.A00(C11860kn.A00, C14550pC.A00);
    public float A00;
    public long A01;
    public C05780Vr A02;
    public AnonymousClass0XG A03;
    public C16450sH A04;
    public boolean A05;
    public int A06;
    public int A07;
    public C16180rq A08;
    public C28644ECa A09;
    public AnonymousClass1OX A0A;
    public boolean A0B;
    public boolean A0C;
    public final C17210uI A0D;
    public final AnonymousClass0OM A0E;
    public final AnonymousClass0OG A0F;
    public final AwaitFirstLayoutModifier A0G;
    public final AnonymousClass0H2 A0H;
    public final AnonymousClass0H3 A0I;
    public final C17330uU A0J;
    public final C17330uU A0K;
    public final C17330uU A0L;
    public final C17330uU A0M;
    public final C17370uY A0N;
    public final C16840tJ A0O;
    public final AnonymousClass0H1 A0P;
    public final C06830Zv A0Q;

    public final float A07(float f) {
        if ((f < 0.0f && !AnonymousClass001.A1b(this.A0K)) || (f > 0.0f && !AnonymousClass001.A1b(this.A0J))) {
            return 0.0f;
        }
        float f2 = this.A00;
        if (Math.abs(f2) <= 0.5f) {
            float f3 = f2 + f;
            this.A00 = f3;
            if (Math.abs(f3) > 0.5f) {
                C17330uU r7 = this.A0L;
                AnonymousClass0XG r6 = (AnonymousClass0XG) r7.getValue();
                float f4 = this.A00;
                int A012 = C22339B3q.A01(f4);
                AnonymousClass0XG r3 = this.A03;
                if (!r6.A00(A012, !this.A05) || (r3 != null && !r3.A00(A012, true))) {
                    C16450sH r0 = this.A04;
                    if (r0 != null) {
                        r0.BLX();
                    }
                    A05((C15700r3) r7.getValue(), f4 - this.A00);
                } else {
                    A0C(r6, this.A05, true);
                    A06(this.A0M);
                    A05(r6, f4 - this.A00);
                }
            }
            float f5 = this.A00;
            if (Math.abs(f5) <= 0.5f) {
                return f;
            }
            float f6 = f - f5;
            this.A00 = 0.0f;
            return f6;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("entered drag with non-zero pending scroll: ");
        A10.append(f2);
        throw AnonymousClass000.A0m(A10);
    }

    public final Object A09(C30391dr r4, int i) {
        Object A002 = CH0(AnonymousClass0CH.Default, r4, new LazyListState$scrollToItem$2(this, (C30391dr) null, i, 0));
        if (A002 != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A002;
    }

    public static final C05780Vr A00(C16590sg r9, Object obj, Object obj2) {
        return new C05780Vr((AnonymousClass0D0) r9.BPS().invoke(obj2), r9, obj, Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static /* synthetic */ AnonymousClass08V A01() {
        C27621Wu r2 = C27621Wu.A00;
        C05740Vn A002 = AnonymousClass0Q9.A00();
        C18100vl r0 = AnonymousClass0GU.A01;
        return new AnonymousClass08V(A002, r2);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.074, X.0D0] */
    private final void A03(float f) {
        Snapshot A022;
        float f2 = f;
        if (f > this.A09.CPQ(1.0f)) {
            Snapshot A002 = C04790Ov.A00();
            try {
                A022 = A002.A02();
                float A052 = AnonymousClass001.A05(this.A02.A05);
                C05780Vr r2 = this.A02;
                boolean z = r2.A03;
                if (z) {
                    float f3 = ((AnonymousClass074) r2.A02).A00;
                    long j = r2.A01;
                    long j2 = r2.A00;
                    C16590sg r8 = r2.A04;
                    Float valueOf = Float.valueOf(A052 - f);
                    ? obj = new Object();
                    obj.A00 = f3;
                    this.A02 = new C05780Vr(obj, r8, valueOf, j, j2, z);
                    AnonymousClass1OX r22 = this.A0A;
                    if (r22 != null) {
                        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new LazyListState$updateScrollDeltaForPostLookahead$2$1(this, (C30391dr) null), r22, 3);
                    }
                } else {
                    this.A02 = new C05780Vr((AnonymousClass0D0) null, AnonymousClass0MW.A02, Float.valueOf(-f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
                    AnonymousClass1OX r23 = this.A0A;
                    if (r23 != null) {
                        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new LazyListState$updateScrollDeltaForPostLookahead$2$2(this, (C30391dr) null), r23, 3);
                    }
                }
                AnonymousClass0N4.A00(A022);
                A002.A0D();
            } catch (Throwable th) {
                A002.A0D();
                throw th;
            }
        }
    }

    private final void A04(C15700r3 r4) {
        int i;
        if (this.A06 != -1) {
            List list = ((AnonymousClass0XG) r4).A08;
            if (AnonymousClass000.A1a(list)) {
                if (this.A0C) {
                    i = ((AnonymousClass0V0) ((C15690r2) C29431cG.A0d(list))).A04 + 1;
                } else {
                    i = ((AnonymousClass0V0) ((C15690r2) C29431cG.A0b(list))).A04 - 1;
                }
                if (this.A06 != i) {
                    this.A06 = -1;
                    C16180rq r0 = this.A08;
                    if (r0 != null) {
                        r0.cancel();
                    }
                    this.A08 = null;
                }
            }
        }
    }

    private final void A05(C15700r3 r6, float f) {
        boolean z;
        int i;
        C16180rq r1;
        C16180rq r12;
        if (this.A0B) {
            AnonymousClass0XG r62 = (AnonymousClass0XG) r6;
            List list = r62.A08;
            if (!list.isEmpty()) {
                if (f < 0.0f) {
                    z = true;
                    i = ((AnonymousClass0V0) ((C15690r2) C29431cG.A0d(list))).A04 + 1;
                } else {
                    z = false;
                    i = ((AnonymousClass0V0) ((C15690r2) C29431cG.A0b(list))).A04 - 1;
                }
                if (i != this.A06 && i >= 0 && i < r62.A04) {
                    if (!(this.A0C == z || (r12 = this.A08) == null)) {
                        r12.cancel();
                    }
                    this.A0C = z;
                    this.A06 = i;
                    AnonymousClass0H3 r13 = this.A0I;
                    long j = this.A01;
                    C15720r5 r2 = r13.A00;
                    if (r2 != null) {
                        C06620Za r22 = (C06620Za) r2;
                        r1 = new AnonymousClass0V7(i, j);
                        r22.A05.A0F(r1);
                        if (!r22.A00) {
                            r22.A00 = true;
                            r22.A04.post(r22);
                        }
                    } else {
                        r1 = AnonymousClass0V8.A00;
                    }
                    this.A08 = r1;
                }
            }
        }
    }

    public static final void A06(C17330uU r1) {
        r1.setValue(C27621Wu.A00);
    }

    public final C25411Oc A0A() {
        return (C25411Oc) this.A0F.A02.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if (r6.A01 != 0) goto L_0x002a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(X.AnonymousClass0XG r6, boolean r7, boolean r8) {
        /*
            r5 = this;
            if (r7 != 0) goto L_0x0009
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x000c
            r5.A03 = r6
            return
        L_0x0009:
            r0 = 1
            r5.A05 = r0
        L_0x000c:
            X.0OG r4 = r5.A0F
            if (r8 == 0) goto L_0x0051
            int r2 = r6.A01
            float r1 = (float) r2
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x007b
            X.0uP r0 = r4.A04
            r0.CJC(r2)
        L_0x001d:
            X.0V0 r0 = r6.A07
            if (r0 == 0) goto L_0x0025
            int r0 = r0.A04
            if (r0 != 0) goto L_0x002a
        L_0x0025:
            int r0 = r6.A01
            r1 = 0
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r1 = 1
        L_0x002b:
            X.0uU r0 = r5.A0J
            X.AnonymousClass000.A1C(r0, r1)
            boolean r1 = r6.A02
            X.0uU r0 = r5.A0K
            X.AnonymousClass000.A1C(r0, r1)
            float r1 = r5.A00
            float r0 = r6.A00
            float r1 = r1 - r0
            r5.A00 = r1
            X.0uU r0 = r5.A0L
            r0.setValue(r6)
            if (r7 == 0) goto L_0x004a
            float r0 = r6.A03
            r5.A03(r0)
        L_0x004a:
            int r0 = r5.A07
            int r0 = r0 + 1
            r5.A07 = r0
            return
        L_0x0051:
            X.0V0 r3 = r6.A07
            if (r3 == 0) goto L_0x0079
            java.lang.Object r0 = r3.A08
        L_0x0057:
            r4.A00 = r0
            boolean r0 = r4.A01
            if (r0 != 0) goto L_0x0061
            int r0 = r6.A04
            if (r0 <= 0) goto L_0x0073
        L_0x0061:
            r0 = 1
            r4.A01 = r0
            int r2 = r6.A01
            float r1 = (float) r2
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x008d
            if (r3 == 0) goto L_0x0077
            int r0 = r3.A04
        L_0x0070:
            X.AnonymousClass0OG.A00(r4, r0, r2)
        L_0x0073:
            r5.A04(r6)
            goto L_0x001d
        L_0x0077:
            r0 = 0
            goto L_0x0070
        L_0x0079:
            r0 = 0
            goto L_0x0057
        L_0x007b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "scrollOffset should be non-negative ("
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x008d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "scrollOffset should be non-negative ("
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass001.A1L(r1, r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.A0C(X.0XG, boolean, boolean):void");
    }

    public float BIy(float f) {
        return this.A0O.BIy(f);
    }

    public boolean BOE() {
        return AnonymousClass001.A1b(this.A0J);
    }

    public boolean BOF() {
        return AnonymousClass001.A1b(this.A0K);
    }

    public boolean BgL() {
        return this.A0O.BgL();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        if (r1.CH0(r7, r5, r9) != r3) goto L_0x0025;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object CH0(X.AnonymousClass0CH r7, X.C30391dr r8, X.AnonymousClass1OS r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C07580bQ
            if (r0 == 0) goto L_0x005e
            r5 = r8
            X.0bQ r5 = (X.C07580bQ) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r1) goto L_0x003d
            if (r0 != r2) goto L_0x0064
            X.C30691eM.A01(r4)
        L_0x0025:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0028:
            X.C30691eM.A01(r4)
            androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier r0 = r6.A0G
            r5.L$0 = r6
            r5.L$1 = r7
            r5.L$2 = r9
            r5.label = r1
            java.lang.Object r0 = r0.A00(r5)
            if (r0 == r3) goto L_0x005d
            r0 = r6
            goto L_0x004c
        L_0x003d:
            java.lang.Object r9 = r5.L$2
            X.1OS r9 = (X.AnonymousClass1OS) r9
            java.lang.Object r7 = r5.L$1
            X.0CH r7 = (X.AnonymousClass0CH) r7
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.lazy.LazyListState r0 = (androidx.compose.foundation.lazy.LazyListState) r0
            X.C30691eM.A01(r4)
        L_0x004c:
            X.0tJ r1 = r0.A0O
            r0 = 0
            r5.L$0 = r0
            r5.L$1 = r0
            r5.L$2 = r0
            r5.label = r2
            java.lang.Object r0 = r1.CH0(r7, r5, r9)
            if (r0 != r3) goto L_0x0025
        L_0x005d:
            return r3
        L_0x005e:
            X.0bQ r5 = new X.0bQ
            r5.<init>(r6, r8)
            goto L_0x0012
        L_0x0064:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListState.CH0(X.0CH, X.1dr, X.1OS):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier] */
    /* JADX WARNING: type inference failed for: r0v21, types: [X.0H3, java.lang.Object] */
    public LazyListState(int i, int i2) {
        this.A0F = new AnonymousClass0OG(i, i2);
        this.A0P = new AnonymousClass0H1(this);
        AnonymousClass0XG r2 = C03970Li.A00;
        C05740Vn A002 = AnonymousClass0Q9.A00();
        C18100vl r0 = AnonymousClass0GU.A01;
        this.A0L = new AnonymousClass08V(A002, r2);
        this.A0D = new C05500Um();
        this.A09 = C25290Ccs.A01(1.0f, 1.0f);
        this.A0O = C02250Dh.A00(new C09590gx(this));
        this.A0B = true;
        this.A06 = -1;
        this.A0N = new AnonymousClass0XN(this);
        this.A0G = new Object();
        this.A0E = new AnonymousClass0OM();
        this.A0H = new AnonymousClass0H2();
        this.A01 = C26229CvL.A02(0, 0, 15);
        this.A0Q = new C06830Zv();
        this.A0K = AnonymousClass0Q9.A01(false);
        this.A0J = AnonymousClass0Q9.A01(false);
        this.A0M = A01();
        this.A0I = new Object();
        C16590sg r1 = AnonymousClass0MW.A02;
        Float valueOf = Float.valueOf(0.0f);
        this.A02 = A00(r1, valueOf, valueOf);
    }

    public final C06830Zv A08() {
        return this.A0Q;
    }

    public final AnonymousClass1OX A0B() {
        return this.A0A;
    }

    public final void A0D(C28644ECa eCa) {
        this.A09 = eCa;
    }

    public final void A0E(AnonymousClass1OX r1) {
        this.A0A = r1;
    }

    public LazyListState() {
        this(0, 0);
    }
}
