package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* renamed from: X.AiI  reason: case insensitive filesystem */
public class C21333AiI implements Closeable {
    public int A00;
    public int A01;
    public byte[] A02;
    public final InputStream A03;
    public final Charset A04;
    public final /* synthetic */ C21334AiJ A05;

    public C21333AiI(C21334AiJ aiJ, InputStream inputStream, Charset charset) {
        this.A05 = aiJ;
        if (charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(C21334AiJ.A0F)) {
            this.A03 = inputStream;
            this.A04 = charset;
            this.A02 = new byte[DefaultCrypto.BUFFER_SIZE];
        } else {
            throw AnonymousClass000.A0k("Unsupported encoding");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3[r2] == 13) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A00() {
        /*
            r8 = this;
            java.io.InputStream r5 = r8.A03
            monitor-enter(r5)
            byte[] r2 = r8.A02     // Catch:{ all -> 0x009a }
            if (r2 == 0) goto L_0x008d
            int r6 = r8.A01     // Catch:{ all -> 0x009a }
            int r1 = r8.A00     // Catch:{ all -> 0x009a }
            if (r6 < r1) goto L_0x001a
            int r0 = r2.length     // Catch:{ all -> 0x009a }
            r6 = 0
            int r1 = r5.read(r2, r6, r0)     // Catch:{ all -> 0x009a }
            r0 = -1
            if (r1 == r0) goto L_0x0094
            r8.A01 = r6     // Catch:{ all -> 0x009a }
            r8.A00 = r1     // Catch:{ all -> 0x009a }
        L_0x001a:
            r4 = r6
        L_0x001b:
            r7 = 10
            if (r4 == r1) goto L_0x0048
            byte[] r3 = r8.A02     // Catch:{ all -> 0x009a }
            byte r0 = r3[r4]     // Catch:{ all -> 0x009a }
            if (r0 != r7) goto L_0x0026
            goto L_0x0029
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x001b
        L_0x0029:
            if (r4 == r6) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            r2 = r4
            goto L_0x0036
        L_0x002e:
            int r2 = r4 + -1
            byte r1 = r3[r2]     // Catch:{ all -> 0x009a }
            r0 = 13
            if (r1 != r0) goto L_0x002c
        L_0x0036:
            int r2 = r2 - r6
            java.nio.charset.Charset r0 = r8.A04     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r0.name()     // Catch:{ all -> 0x009a }
            java.lang.String r1 = new java.lang.String     // Catch:{ all -> 0x009a }
            r1.<init>(r3, r6, r2, r0)     // Catch:{ all -> 0x009a }
            int r0 = r4 + 1
            r8.A01 = r0     // Catch:{ all -> 0x009a }
            monitor-exit(r5)     // Catch:{ all -> 0x009a }
            return r1
        L_0x0048:
            int r1 = r1 - r6
            int r0 = r1 + 80
            X.9HO r6 = new X.9HO     // Catch:{ all -> 0x009a }
            r6.<init>(r8, r0)     // Catch:{ all -> 0x009a }
        L_0x0050:
            byte[] r2 = r8.A02     // Catch:{ all -> 0x009a }
            int r1 = r8.A01     // Catch:{ all -> 0x009a }
            int r0 = r8.A00     // Catch:{ all -> 0x009a }
            int r0 = r0 - r1
            r6.write(r2, r1, r0)     // Catch:{ all -> 0x009a }
            r2 = -1
            r8.A00 = r2     // Catch:{ all -> 0x009a }
            byte[] r1 = r8.A02     // Catch:{ all -> 0x009a }
            int r0 = r1.length     // Catch:{ all -> 0x009a }
            r4 = 0
            int r3 = r5.read(r1, r4, r0)     // Catch:{ all -> 0x009a }
            if (r3 == r2) goto L_0x0087
            r8.A01 = r4     // Catch:{ all -> 0x009a }
            r8.A00 = r3     // Catch:{ all -> 0x009a }
            r2 = 0
        L_0x006c:
            if (r2 == r3) goto L_0x0050
            byte[] r1 = r8.A02     // Catch:{ all -> 0x009a }
            byte r0 = r1[r2]     // Catch:{ all -> 0x009a }
            if (r0 != r7) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            int r2 = r2 + 1
            goto L_0x006c
        L_0x0078:
            if (r2 == r4) goto L_0x007d
            r6.write(r1, r4, r2)     // Catch:{ all -> 0x009a }
        L_0x007d:
            int r0 = r2 + 1
            r8.A01 = r0     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x009a }
            monitor-exit(r5)     // Catch:{ all -> 0x009a }
            return r0
        L_0x0087:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x009a }
            r0.<init>()     // Catch:{ all -> 0x009a }
            goto L_0x0099
        L_0x008d:
            java.lang.String r0 = "LineReader is closed"
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x009a }
            goto L_0x0099
        L_0x0094:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x009a }
            r0.<init>()     // Catch:{ all -> 0x009a }
        L_0x0099:
            throw r0     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x009a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21333AiI.A00():java.lang.String");
    }

    public void close() {
        InputStream inputStream = this.A03;
        synchronized (inputStream) {
            if (this.A02 != null) {
                this.A02 = null;
                inputStream.close();
            }
        }
    }
}
