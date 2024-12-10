package X;

/* renamed from: X.8Kk  reason: invalid class name and case insensitive filesystem */
public class C162358Kk extends C223019j {
    public final AnonymousClass00O A00;

    public /* bridge */ /* synthetic */ C224519z A01() {
        C162338Ki r6 = new C162338Ki();
        AnonymousClass00O r5 = this.A00;
        int size = r5.size();
        for (int i = 0; i < size; i++) {
            Object A04 = r5.A04(i);
            r6.mMetricsMap.put(A04, ((C223019j) r5.A06(i)).A01());
            r6.mMetricsValid.put(A04, Boolean.FALSE);
        }
        return r6;
    }

    public /* bridge */ /* synthetic */ boolean A02(C224519z r9) {
        boolean z;
        Boolean bool;
        C162338Ki r92 = (C162338Ki) r9;
        if (r92 != null) {
            AnonymousClass00O r7 = r92.mMetricsMap;
            int size = r7.size();
            boolean z2 = false;
            for (int i = 0; i < size; i++) {
                Class cls = (Class) r7.A04(i);
                C223019j r1 = (C223019j) this.A00.get(cls);
                if (r1 != null) {
                    z = r1.A02(r92.A03(cls));
                } else {
                    z = false;
                }
                AnonymousClass00O r12 = r92.mMetricsValid;
                if (z) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                r12.put(cls, bool);
                z2 |= z;
            }
            return z2;
        }
        throw AnonymousClass000.A0k("Null value passed to getSnapshot!");
    }

    public C162358Kk(AnonymousClass00O r3) {
        AnonymousClass00O r0 = new AnonymousClass00O(0);
        this.A00 = r0;
        r0.A09(r3);
    }
}
