package X;

/* renamed from: X.8Kf  reason: invalid class name and case insensitive filesystem */
public class C162308Kf extends C224519z {
    public long realtimeMs;
    public long uptimeMs;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C162308Kf r7 = (C162308Kf) obj;
            if (!(this.uptimeMs == r7.uptimeMs && this.realtimeMs == r7.realtimeMs)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void A01(C224519z r3) {
        C162308Kf r32 = (C162308Kf) r3;
        this.uptimeMs = r32.uptimeMs;
        this.realtimeMs = r32.realtimeMs;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.8Kf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.8Kf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.8Kf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.C224519z r5, X.C224519z r6) {
        /*
            r4 = this;
            X.8Kf r5 = (X.C162308Kf) r5
            X.8Kf r6 = (X.C162308Kf) r6
            if (r6 != 0) goto L_0x000b
            X.8Kf r6 = new X.8Kf
            r6.<init>()
        L_0x000b:
            if (r5 != 0) goto L_0x0016
            long r0 = r4.uptimeMs
            r6.uptimeMs = r0
            long r0 = r4.realtimeMs
            r6.realtimeMs = r0
            return
        L_0x0016:
            long r2 = r4.uptimeMs
            long r0 = r5.uptimeMs
            long r2 = r2 - r0
            r6.uptimeMs = r2
            long r2 = r4.realtimeMs
            long r0 = r5.realtimeMs
            long r2 = r2 - r0
            r6.realtimeMs = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162308Kf.A02(X.19z, X.19z):void");
    }

    public int hashCode() {
        long j = this.uptimeMs;
        long j2 = this.realtimeMs;
        return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TimeMetrics{uptimeMs=");
        A10.append(this.uptimeMs);
        A10.append(", realtimeMs=");
        A10.append(this.realtimeMs);
        return C17890vO.A0b(A10);
    }
}
