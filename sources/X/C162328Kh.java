package X;

/* renamed from: X.8Kh  reason: invalid class name and case insensitive filesystem */
public class C162328Kh extends C224519z {
    public double childSystemTimeS;
    public double childUserTimeS;
    public double systemTimeS;
    public double userTimeS;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C162328Kh r6 = (C162328Kh) obj;
            if (!(Double.compare(r6.systemTimeS, this.systemTimeS) == 0 && Double.compare(r6.userTimeS, this.userTimeS) == 0 && Double.compare(r6.childSystemTimeS, this.childSystemTimeS) == 0 && Double.compare(r6.childUserTimeS, this.childUserTimeS) == 0)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.8Kh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.8Kh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.8Kh} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.C224519z r5, X.C224519z r6) {
        /*
            r4 = this;
            X.8Kh r5 = (X.C162328Kh) r5
            X.8Kh r6 = (X.C162328Kh) r6
            if (r6 != 0) goto L_0x000b
            X.8Kh r6 = new X.8Kh
            r6.<init>()
        L_0x000b:
            if (r5 != 0) goto L_0x0011
            r6.A01(r4)
            return
        L_0x0011:
            double r2 = r4.systemTimeS
            double r0 = r5.systemTimeS
            double r2 = r2 - r0
            r6.systemTimeS = r2
            double r2 = r4.userTimeS
            double r0 = r5.userTimeS
            double r2 = r2 - r0
            r6.userTimeS = r2
            double r2 = r4.childSystemTimeS
            double r0 = r5.childSystemTimeS
            double r2 = r2 - r0
            r6.childSystemTimeS = r2
            double r2 = r4.childUserTimeS
            double r0 = r5.childUserTimeS
            double r2 = r2 - r0
            r6.childUserTimeS = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162328Kh.A02(X.19z, X.19z):void");
    }

    /* renamed from: A03 */
    public void A01(C162328Kh r3) {
        this.userTimeS = r3.userTimeS;
        this.systemTimeS = r3.systemTimeS;
        this.childUserTimeS = r3.childUserTimeS;
        this.childSystemTimeS = r3.childSystemTimeS;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.systemTimeS);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.userTimeS);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.childSystemTimeS);
        int i3 = (i2 * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.childUserTimeS);
        return (i3 * 31) + ((int) (doubleToLongBits4 ^ (doubleToLongBits4 >>> 32)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CpuMetrics{userTimeS=");
        A10.append(this.userTimeS);
        A10.append(", systemTimeS=");
        A10.append(this.systemTimeS);
        A10.append(", childUserTimeS=");
        A10.append(this.childUserTimeS);
        A10.append(", childSystemTimeS=");
        A10.append(this.childSystemTimeS);
        return C17890vO.A0b(A10);
    }
}
