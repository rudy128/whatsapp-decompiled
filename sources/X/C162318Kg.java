package X;

/* renamed from: X.8Kg  reason: invalid class name and case insensitive filesystem */
public class C162318Kg extends C224519z {
    public long mobileBytesRx;
    public long mobileBytesTx;
    public long wifiBytesRx;
    public long wifiBytesTx;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C162318Kg r7 = (C162318Kg) obj;
            if (!(this.mobileBytesTx == r7.mobileBytesTx && this.mobileBytesRx == r7.mobileBytesRx && this.wifiBytesTx == r7.wifiBytesTx && this.wifiBytesRx == r7.wifiBytesRx)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ void A01(C224519z r3) {
        C162318Kg r32 = (C162318Kg) r3;
        this.mobileBytesRx = r32.mobileBytesRx;
        this.mobileBytesTx = r32.mobileBytesTx;
        this.wifiBytesRx = r32.wifiBytesRx;
        this.wifiBytesTx = r32.wifiBytesTx;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: X.8Kg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: X.8Kg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.8Kg} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.C224519z r5, X.C224519z r6) {
        /*
            r4 = this;
            X.8Kg r5 = (X.C162318Kg) r5
            X.8Kg r6 = (X.C162318Kg) r6
            if (r6 != 0) goto L_0x000b
            X.8Kg r6 = new X.8Kg
            r6.<init>()
        L_0x000b:
            if (r5 != 0) goto L_0x001e
            long r0 = r4.mobileBytesRx
            r6.mobileBytesRx = r0
            long r0 = r4.mobileBytesTx
            r6.mobileBytesTx = r0
            long r0 = r4.wifiBytesRx
            r6.wifiBytesRx = r0
            long r0 = r4.wifiBytesTx
            r6.wifiBytesTx = r0
            return
        L_0x001e:
            long r2 = r4.mobileBytesTx
            long r0 = r5.mobileBytesTx
            long r2 = r2 - r0
            r6.mobileBytesTx = r2
            long r2 = r4.mobileBytesRx
            long r0 = r5.mobileBytesRx
            long r2 = r2 - r0
            r6.mobileBytesRx = r2
            long r2 = r4.wifiBytesTx
            long r0 = r5.wifiBytesTx
            long r2 = r2 - r0
            r6.wifiBytesTx = r2
            long r2 = r4.wifiBytesRx
            long r0 = r5.wifiBytesRx
            long r2 = r2 - r0
            r6.wifiBytesRx = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C162318Kg.A02(X.19z, X.19z):void");
    }

    public int hashCode() {
        long j = this.mobileBytesTx;
        long j2 = this.mobileBytesRx;
        long j3 = this.wifiBytesTx;
        long j4 = this.wifiBytesRx;
        return (((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NetworkMetrics{mobileBytesTx=");
        A10.append(this.mobileBytesTx);
        A10.append(", mobileBytesRx=");
        A10.append(this.mobileBytesRx);
        A10.append(", wifiBytesTx=");
        A10.append(this.wifiBytesTx);
        A10.append(", wifiBytesRx=");
        A10.append(this.wifiBytesRx);
        return C17890vO.A0b(A10);
    }
}
