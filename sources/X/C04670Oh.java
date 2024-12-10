package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.0Oh  reason: invalid class name and case insensitive filesystem */
public abstract class C04670Oh {
    public C17490uk A00;
    public boolean A01 = true;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final C17490uk A07;
    public final Map A08 = new HashMap();

    /* access modifiers changed from: private */
    public final void A01(C04280Mo r6, C01850Ad r7, int i) {
        long A0p;
        float A012;
        loop0:
        while (true) {
            float f = (float) i;
            A0p = AnonymousClass001.A0p(f, f);
            long j = AnonymousClass0QY.A03;
            do {
                A0p = A03(r7, A0p);
                r7 = r7.A0x();
                C18070vi.A0b(r7);
                if (C18070vi.A18(r7, this.A07.BT2())) {
                    break loop0;
                }
            } while (!A04(r7).containsKey(r6));
            i = A02(r6, r7);
        }
        if (r6 instanceof AnonymousClass0AE) {
            A012 = AnonymousClass0QY.A02(A0p);
        } else {
            A012 = AnonymousClass0QY.A01(A0p);
        }
        int A013 = C22339B3q.A01(A012);
        Map map = this.A08;
        if (map.containsKey(r6)) {
            A013 = AnonymousClass0MK.A00(r6, AnonymousClass000.A0M(AnonymousClass1D7.A06(r6, map)), A013);
        }
        map.put(r6, Integer.valueOf(A013));
    }

    public abstract int A02(C04280Mo r1, C01850Ad r2);

    public abstract long A03(C01850Ad r1, long j);

    public abstract Map A04(C01850Ad r1);

    public final void A05() {
        this.A01 = true;
        C17490uk r2 = this.A07;
        C17490uk BWB = r2.BWB();
        if (BWB != null) {
            if (this.A06) {
                BWB.CFV();
            } else if (this.A02 || this.A05) {
                BWB.requestLayout();
            }
            if (this.A04) {
                r2.CFV();
            }
            if (this.A03) {
                r2.requestLayout();
            }
            BWB.BMo().A05();
        }
    }

    public final void A06() {
        Map map = this.A08;
        map.clear();
        C17490uk r1 = this.A07;
        r1.BLV(new C10860j1(this));
        map.putAll(A04(r1.BT2()));
        this.A01 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1.A03 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0068, code lost:
        r0 = r0.BMo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        if (r3.A03 != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07() {
        /*
            r3 = this;
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A02
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x0011
            boolean r1 = r3.A03
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            X.0uk r2 = r3.A07
            if (r0 != 0) goto L_0x0038
            X.0uk r0 = r2.BWB()
            if (r0 == 0) goto L_0x003a
            X.0Oh r0 = r0.BMo()
            X.0uk r2 = r0.A00
            if (r2 == 0) goto L_0x003b
            X.0Oh r1 = r2.BMo()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x0038
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x003b
        L_0x0038:
            r3.A00 = r2
        L_0x003a:
            return
        L_0x003b:
            X.0uk r2 = r3.A00
            if (r2 == 0) goto L_0x003a
            X.0Oh r1 = r2.BMo()
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x003a
            boolean r0 = r1.A03
            if (r0 != 0) goto L_0x003a
            X.0uk r0 = r2.BWB()
            if (r0 == 0) goto L_0x0062
            X.0Oh r0 = r0.BMo()
            if (r0 == 0) goto L_0x0062
            r0.A07()
        L_0x0062:
            X.0uk r0 = r2.BWB()
            if (r0 == 0) goto L_0x0071
            X.0Oh r0 = r0.BMo()
            if (r0 == 0) goto L_0x0071
            X.0uk r2 = r0.A00
            goto L_0x0038
        L_0x0071:
            r2 = 0
            goto L_0x0038
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C04670Oh.A07():void");
    }

    public C04670Oh(C17490uk r2) {
        this.A07 = r2;
    }
}
