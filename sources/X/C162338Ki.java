package X;

/* renamed from: X.8Ki  reason: invalid class name and case insensitive filesystem */
public class C162338Ki extends C224519z {
    public final AnonymousClass00O mMetricsMap = new AnonymousClass00O(0);
    public final AnonymousClass00O mMetricsValid = new AnonymousClass00O(0);

    public static boolean A00(AnonymousClass00O r7, AnonymousClass00O r8) {
        boolean equals;
        if (r7 != r8) {
            int size = r7.size();
            if (size == r8.size()) {
                int i = 0;
                while (i < size) {
                    Object A04 = r7.A04(i);
                    Object A06 = r7.A06(i);
                    Object obj = r8.get(A04);
                    if (A06 != null) {
                        equals = A06.equals(obj);
                    } else if (obj == null) {
                        equals = r8.containsKey(A04);
                    }
                    if (equals) {
                        i++;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C162338Ki r5 = (C162338Ki) obj;
            if (!A00(this.mMetricsValid, r5.mMetricsValid) || !A00(this.mMetricsMap, r5.mMetricsMap)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void A02(C224519z r8, C224519z r9) {
        boolean z;
        Boolean bool;
        C162338Ki r82 = (C162338Ki) r8;
        C162338Ki r92 = (C162338Ki) r9;
        if (r92 == null) {
            throw AnonymousClass000.A0k("CompositeMetrics doesn't support nullable results");
        } else if (r82 == null) {
            r92.A01(this);
        } else {
            int size = this.mMetricsMap.size();
            for (int i = 0; i < size; i++) {
                Class cls = (Class) this.mMetricsMap.A04(i);
                if (!A05(cls) || !r82.A05(cls)) {
                    z = false;
                } else {
                    z = true;
                    C224519z A03 = r92.A03(cls);
                    if (A03 != null) {
                        A03(cls).A02(r82.A03(cls), A03);
                    }
                }
                AnonymousClass00O r1 = r92.mMetricsValid;
                if (z) {
                    bool = Boolean.TRUE;
                } else {
                    bool = Boolean.FALSE;
                }
                r1.put(cls, bool);
            }
        }
    }

    public C224519z A03(Class cls) {
        return (C224519z) cls.cast(this.mMetricsMap.get(cls));
    }

    /* renamed from: A04 */
    public void A01(C162338Ki r6) {
        AnonymousClass00O r1;
        Boolean bool;
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            Class cls = (Class) this.mMetricsMap.A04(i);
            C224519z A03 = r6.A03(cls);
            if (A03 != null) {
                A03(cls).A01(A03);
                boolean A05 = r6.A05(cls);
                r1 = this.mMetricsValid;
                if (A05) {
                    bool = Boolean.TRUE;
                }
                bool = Boolean.FALSE;
            } else {
                r1 = this.mMetricsValid;
                bool = Boolean.FALSE;
            }
            r1.put(cls, bool);
        }
    }

    public boolean A05(Class cls) {
        Boolean bool = (Boolean) this.mMetricsValid.get(cls);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.mMetricsValid, AnonymousClass000.A0L(this.mMetricsMap));
    }

    public String toString() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Composite Metrics{\n");
        int size = this.mMetricsMap.size();
        for (int i = 0; i < size; i++) {
            A10.append(this.mMetricsMap.A06(i));
            if (A05((Class) this.mMetricsMap.A04(i))) {
                str = " [valid]";
            } else {
                str = " [invalid]";
            }
            A10.append(str);
            A10.append(10);
        }
        return AnonymousClass000.A0y("}", A10);
    }
}
