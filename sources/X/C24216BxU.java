package X;

import java.io.InputStream;

/* renamed from: X.BxU  reason: case insensitive filesystem */
public class C24216BxU extends InputStream {
    public C24223Bxb A00;
    public C28475E2q A01;

    public synchronized void mark(int i) {
        this.A00.mark(i);
    }

    public synchronized void reset() {
        this.A00.reset();
    }

    public int available() {
        return this.A00.available();
    }

    public void close() {
        this.A00.close();
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0117, code lost:
        X.C27347DcJ.A06(r8, new javax.net.ssl.SSLException(X.BE9.A0u(r0)), (byte) 2, (byte) 80, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0124, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0125, code lost:
        X.C27347DcJ.A06(r8, r0.ex, (byte) 2, r0.description, r0.errorTransient);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r19, int r20, int r21) {
        /*
            r18 = this;
            r12 = r19
            r10 = r21
            r11 = r20
            if (r19 == 0) goto L_0x016f
            r9 = 0
            if (r21 == 0) goto L_0x016e
            int r1 = r20 + r21
            int r0 = r12.length
            if (r1 <= r0) goto L_0x0017
            java.lang.String r0 = "Not enough space in destination buffer."
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0017:
            r1 = r18
            X.Bxb r13 = r1.A00
            int r0 = r13.available()
            if (r0 <= 0) goto L_0x0037
            int r3 = java.lang.Math.min(r10, r0)
            int r2 = r13.read(r12, r11, r3)
            if (r2 > r3) goto L_0x014d
            int r11 = r11 + r3
            int r10 = r10 - r3
            int r9 = r9 + r3
        L_0x002e:
            int r0 = r13.available()
            if (r0 == 0) goto L_0x016e
            if (r9 < r10) goto L_0x0017
            return r9
        L_0x0037:
            X.E2q r8 = r1.A01
            X.DcJ r8 = (X.C27347DcJ) r8
            boolean r0 = r8.A0C
            r7 = 80
            r6 = 0
            r5 = 2
            r4 = 0
            if (r0 == 0) goto L_0x00fa
            boolean r0 = r8.A0B
            if (r0 != 0) goto L_0x00fa
            X.DPc r1 = r8.A02
            boolean r0 = r1.A0Z
            if (r0 == 0) goto L_0x00fa
            java.util.List r0 = r1.A0R
            if (r0 == 0) goto L_0x00fa
            java.util.List r0 = r1.A0S
            if (r0 == 0) goto L_0x00fa
            r1.A0Y = r6     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.CVT r2 = r8.A06     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.Buj r0 = new X.Buj     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r2.A00(r0)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r8.A09()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.DPc r1 = r8.A02     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            boolean r0 = r1.A0f     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r16 = 0
            if (r0 != 0) goto L_0x00a3
            java.util.List r0 = r1.A0R     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r2 = 0
        L_0x0079:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            if (r0 == 0) goto L_0x0094
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.CWK r14 = (X.CWK) r14     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            long r2 = r2 + r0
            X.CVT r1 = r8.A06     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.Buc r0 = new X.Buc     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r1.A00(r0)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            goto L_0x0079
        L_0x0094:
            java.lang.Integer r14 = X.AnonymousClass00R.A01     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.lang.String r0 = "Replayed early data len = "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.C25420CfS.A00(r14, r0)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
        L_0x00a3:
            X.DPc r0 = r8.A02     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.util.List r0 = r0.A0S     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r2 = 0
        L_0x00ad:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r14 = r15.next()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.CWK r14 = (X.CWK) r14     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            int r0 = r14.A00     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            long r2 = r2 + r0
            X.CVT r1 = r8.A06     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.Buc r0 = new X.Buc     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            r1.A00(r0)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            goto L_0x00ad
        L_0x00c8:
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f4
            java.lang.Integer r14 = X.AnonymousClass00R.A01     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            java.lang.String r0 = "Spillover early data len = "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            X.C25420CfS.A00(r14, r0)     // Catch:{ IOException -> 0x0164, 18c -> 0x00ea, Exception -> 0x00dc }
            goto L_0x00f4
        L_0x00dc:
            r0 = move-exception
            java.lang.Throwable r1 = X.BE9.A0u(r0)     // Catch:{ all -> 0x0166 }
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException     // Catch:{ all -> 0x0166 }
            r0.<init>(r1)     // Catch:{ all -> 0x0166 }
            X.C27347DcJ.A06(r8, r0, r5, r7, r6)     // Catch:{ all -> 0x0166 }
            goto L_0x00f4
        L_0x00ea:
            r0 = move-exception
            byte r2 = r0.description     // Catch:{ all -> 0x0166 }
            boolean r1 = r0.errorTransient     // Catch:{ all -> 0x0166 }
            javax.net.ssl.SSLException r0 = r0.ex     // Catch:{ all -> 0x0166 }
            X.C27347DcJ.A06(r8, r0, r5, r2, r1)     // Catch:{ all -> 0x0166 }
        L_0x00f4:
            X.DPc r0 = r8.A02
            r0.A0R = r4
            r0.A0S = r4
        L_0x00fa:
            X.DPc r0 = r8.A02     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            X.Cai r2 = r0.A0A     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            monitor-enter(r2)     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            X.CLx r1 = r2.A01()     // Catch:{ all -> 0x0113 }
            monitor-exit(r2)     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            r4 = r1
            boolean r0 = r1 instanceof X.C24062Bun     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            if (r0 != 0) goto L_0x012e
            boolean r0 = r1 instanceof X.C24049Bua     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            if (r0 != 0) goto L_0x0144
            X.CVT r0 = r8.A06     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            r0.A00(r1)     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            goto L_0x012e
        L_0x0113:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
            throw r0     // Catch:{ 18c -> 0x0124, Exception -> 0x0116 }
        L_0x0116:
            r0 = move-exception
            java.lang.Throwable r1 = X.BE9.A0u(r0)
            javax.net.ssl.SSLException r0 = new javax.net.ssl.SSLException
            r0.<init>(r1)
            X.C27347DcJ.A06(r8, r0, r5, r7, r6)
            goto L_0x012e
        L_0x0124:
            r0 = move-exception
            byte r2 = r0.description
            boolean r1 = r0.errorTransient
            javax.net.ssl.SSLException r0 = r0.ex
            X.C27347DcJ.A06(r8, r0, r5, r2, r1)
        L_0x012e:
            X.CRp r0 = X.CIL.A00
            java.lang.Class r1 = r0.getClass()
            X.CVT r0 = r8.A06
            X.CQc r0 = r0.A00
            X.CRp r0 = r0.A00
            boolean r0 = r1.isInstance(r0)
            if (r0 == 0) goto L_0x0144
            boolean r0 = r4 instanceof X.C24050Bub
            if (r0 == 0) goto L_0x00fa
        L_0x0144:
            boolean r0 = r4 instanceof X.C24049Bua
            if (r0 == 0) goto L_0x002e
            X.C27347DcJ.A03(r4, r8)
            r0 = 0
            throw r0
        L_0x014d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Read returned more than requested bytes. "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " > "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0164:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r1 = move-exception
            X.DPc r0 = r8.A02
            r0.A0R = r4
            r0.A0S = r4
            throw r1
        L_0x016e:
            return r9
        L_0x016f:
            java.lang.String r0 = "Buffer is null"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24216BxU.read(byte[], int, int):int");
    }

    public long skip(long j) {
        return this.A00.skip(j);
    }

    public int read(byte[] bArr) {
        if (bArr != null) {
            return read(bArr, 0, bArr.length);
        }
        throw C17880vN.A0f("Buffer is null.");
    }

    public int read() {
        byte[] bArr = new byte[1];
        int read = read(bArr);
        if (read > 1) {
            throw C17880vN.A0f("Read returned more than 1 byte");
        } else if (read == 1) {
            return (short) ((short) (bArr[0] & 255));
        } else {
            return -1;
        }
    }
}
