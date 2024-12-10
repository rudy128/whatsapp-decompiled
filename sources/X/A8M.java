package X;

import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.nio.ByteBuffer;

public final class A8M {
    public static final A8M A00 = new Object();
    public static final byte[] A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0021, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.os.CancellationSignal r2, X.AnonymousClass1TI r3, java.io.File r4, java.io.InputStream r5, byte[] r6, long r7) {
        /*
            r0 = 4
            X.C18070vi.A0d(r2, r0)
            r2.throwIfCanceled()
            X.6QY r1 = new X.6QY     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
            r1.<init>(r5, r7)     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
            if (r6 == 0) goto L_0x0022
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r4)     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
            X.A8M r0 = A00     // Catch:{ all -> 0x001b }
            r0.A06(r3, r1, r2, r6)     // Catch:{ all -> 0x001b }
            r2.close()     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
            return
        L_0x001b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
            throw r0     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
        L_0x0022:
            X.C64062u9.A0U(r4, r1, r7)     // Catch:{ SocketException -> 0x003c, IOException -> 0x0026 }
            return
        L_0x0026:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "p2p/P2PDataTransferUtils/Error processing stream, skipping this data and deleting file: "
            X.C108995ce.A1M(r0, r1, r2)
            boolean r0 = r4.delete()
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "p2p/P2PDataTransferUtils/Failed to delete file"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x003b:
            return
        L_0x003c:
            r2 = move-exception
            r1 = 605(0x25d, float:8.48E-43)
            X.9HZ r0 = new X.9HZ
            r0.<init>((int) r1, (java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8M.A03(android.os.CancellationSignal, X.1TI, java.io.File, java.io.InputStream, byte[], long):void");
    }

    public static final void A04(C175248yO r3, Exception exc) {
        int i;
        C18070vi.A0d(r3, 1);
        if (exc instanceof B8K) {
            i = ((B8K) exc).BUv();
            C17900vP.A0j("p2p/P2PDataTransferUtils/error code received during transfer: ", AnonymousClass000.A10(), i);
        } else {
            Log.e("p2p/P2PDataTransferUtils/failure during transfer process: ", exc);
            i = 1;
        }
        r3.A00(i, exc.getMessage());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        X.CDX.A00(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass1TI r6, java.io.InputStream r7, java.io.OutputStream r8, byte[] r9) {
        /*
            r5 = this;
            r4 = 2
            r0 = 16
            byte[] r3 = new byte[r0]     // Catch:{ GeneralSecurityException -> 0x003f }
            int r1 = r7.read(r3)     // Catch:{ GeneralSecurityException -> 0x003f }
            r0 = -1
            if (r1 == r0) goto L_0x0031
            javax.crypto.Cipher r2 = X.AnonymousClass8BR.A18()     // Catch:{ GeneralSecurityException -> 0x003f }
            javax.crypto.spec.IvParameterSpec r1 = X.AnonymousClass8BR.A19(r3)     // Catch:{ GeneralSecurityException -> 0x003f }
            javax.crypto.spec.SecretKeySpec r0 = X.AnonymousClass8BS.A0v(r9)     // Catch:{ GeneralSecurityException -> 0x003f }
            r2.init(r4, r0, r1)     // Catch:{ GeneralSecurityException -> 0x003f }
            javax.crypto.CipherOutputStream r1 = new javax.crypto.CipherOutputStream     // Catch:{ GeneralSecurityException -> 0x003f }
            r1.<init>(r8, r2)     // Catch:{ GeneralSecurityException -> 0x003f }
            if (r6 == 0) goto L_0x0026
            X.C64062u9.A0G(r6, r7, r1)     // Catch:{ all -> 0x002d }
            goto L_0x0029
        L_0x0026:
            X.C64062u9.A00(r7, r1)     // Catch:{ all -> 0x002d }
        L_0x0029:
            r1.close()     // Catch:{ GeneralSecurityException -> 0x003f }
            return
        L_0x002d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r2 = move-exception
            goto L_0x003b
        L_0x0031:
            r1 = 605(0x25d, float:8.48E-43)
            java.lang.String r0 = "No bytes to read"
            X.9HZ r2 = new X.9HZ     // Catch:{ GeneralSecurityException -> 0x003f }
            r2.<init>((int) r1, (java.lang.String) r0)     // Catch:{ GeneralSecurityException -> 0x003f }
            goto L_0x003e
        L_0x003b:
            X.CDX.A00(r1, r0)     // Catch:{ GeneralSecurityException -> 0x003f }
        L_0x003e:
            throw r2     // Catch:{ GeneralSecurityException -> 0x003f }
        L_0x003f:
            r3 = move-exception
            java.lang.String r2 = "Failed to decrypt stream"
            r1 = 105(0x69, float:1.47E-43)
            X.9HZ r0 = new X.9HZ
            r0.<init>(r2, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8M.A06(X.1TI, java.io.InputStream, java.io.OutputStream, byte[]):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.A8M] */
    static {
        byte[] A1a = AnonymousClass8BT.A1a("f84Z7HXNlLvU8vledkRkLCXBWB16jaE3gyDeRPPkwtQ=");
        C18070vi.A0X(A1a);
        A01 = A1a;
    }

    public static final A4Y A00(CancellationSignal cancellationSignal, InputStream inputStream) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        try {
            byte[] bArr = new byte[16];
            if (inputStream.read(bArr) != -1) {
                return new A4Y(ByteBuffer.wrap(bArr, 0, 4).getInt(), ByteBuffer.wrap(bArr, 4, 8).getLong(), ByteBuffer.wrap(bArr, 12, 4).getInt());
            }
            throw new AnonymousClass9HZ(605, "No bytes to read");
        } catch (SocketException e) {
            throw new AnonymousClass9HZ(605, (Throwable) e);
        }
    }

    public static final String A01(CancellationSignal cancellationSignal, InputStream inputStream, byte[] bArr, long j) {
        if (cancellationSignal != null) {
            cancellationSignal.throwIfCanceled();
        }
        if (bArr != null) {
            try {
                AnonymousClass6QY r2 = new AnonymousClass6QY(inputStream, j);
                ByteArrayOutputStream A15 = C108945cZ.A15();
                A00.A06((AnonymousClass1TI) null, r2, A15, bArr);
                String byteArrayOutputStream = A15.toString(C19620yd.A0A);
                if (byteArrayOutputStream != null) {
                    return byteArrayOutputStream;
                }
            } catch (SocketException e) {
                throw new AnonymousClass9HZ(605, (Throwable) e);
            } catch (IOException unused) {
                return null;
            }
        }
        byte[] bArr2 = new byte[((int) j)];
        if (inputStream.read(bArr2) != -1) {
            return C108955ca.A13(bArr2);
        }
        throw new AnonymousClass9HZ(605, "No bytes to read");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.os.CancellationSignal r3, X.A4Y r4, java.io.OutputStream r5) {
        /*
            if (r3 == 0) goto L_0x0005
            r3.throwIfCanceled()     // Catch:{ SocketException -> 0x007b }
        L_0x0005:
            r0 = 16
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ SocketException -> 0x007b }
            int r0 = r4.A01     // Catch:{ SocketException -> 0x007b }
            r3.putInt(r0)     // Catch:{ SocketException -> 0x007b }
            r2 = 4
            long r0 = r4.A02     // Catch:{ SocketException -> 0x007b }
            r3.putLong(r2, r0)     // Catch:{ SocketException -> 0x007b }
            r1 = 12
            int r0 = r4.A00     // Catch:{ SocketException -> 0x007b }
            r3.putInt(r1, r0)     // Catch:{ SocketException -> 0x007b }
            byte[] r0 = r3.array()     // Catch:{ SocketException -> 0x007b }
            X.C18070vi.A0X(r0)     // Catch:{ SocketException -> 0x007b }
            r5.write(r0)     // Catch:{ SocketException -> 0x007b }
            r5.flush()     // Catch:{ SocketException -> 0x007b }
            boolean r0 = r4 instanceof X.C173688vX     // Catch:{ SocketException -> 0x007b }
            if (r0 == 0) goto L_0x005a
            X.8vX r4 = (X.C173688vX) r4     // Catch:{ SocketException -> 0x007b }
            java.io.File r0 = r4.A01     // Catch:{ SocketException -> 0x007b }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r0)     // Catch:{ SocketException -> 0x007b }
            byte[] r1 = r4.A03     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0043
            X.1TI r0 = r4.A00     // Catch:{ all -> 0x0053 }
            A05(r0, r2, r5, r1)     // Catch:{ all -> 0x0053 }
        L_0x003f:
            r5.flush()     // Catch:{ all -> 0x0053 }
            goto L_0x004f
        L_0x0043:
            X.1TI r0 = r4.A00     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x004b
            X.C64062u9.A0G(r0, r2, r5)     // Catch:{ all -> 0x0053 }
            goto L_0x003f
        L_0x004b:
            X.C64062u9.A00(r2, r5)     // Catch:{ all -> 0x0053 }
            goto L_0x003f
        L_0x004f:
            r2.close()     // Catch:{ SocketException -> 0x007b }
            return
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ SocketException -> 0x007b }
            throw r0     // Catch:{ SocketException -> 0x007b }
        L_0x005a:
            boolean r0 = r4 instanceof X.C173678vW     // Catch:{ SocketException -> 0x007b }
            if (r0 == 0) goto L_0x007a
            X.8vW r4 = (X.C173678vW) r4     // Catch:{ SocketException -> 0x007b }
            byte[] r2 = r4.A03     // Catch:{ SocketException -> 0x007b }
            if (r2 == 0) goto L_0x0073
            byte[] r0 = r4.A00     // Catch:{ SocketException -> 0x007b }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ SocketException -> 0x007b }
            r1.<init>(r0)     // Catch:{ SocketException -> 0x007b }
            r0 = 0
            A05(r0, r1, r5, r2)     // Catch:{ SocketException -> 0x007b }
        L_0x006f:
            r5.flush()     // Catch:{ SocketException -> 0x007b }
            goto L_0x0079
        L_0x0073:
            byte[] r0 = r4.A00     // Catch:{ SocketException -> 0x007b }
            r5.write(r0)     // Catch:{ SocketException -> 0x007b }
            goto L_0x006f
        L_0x0079:
            return
        L_0x007a:
            return
        L_0x007b:
            r2 = move-exception
            r1 = 605(0x25d, float:8.48E-43)
            X.9HZ r0 = new X.9HZ
            r0.<init>((int) r1, (java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8M.A02(android.os.CancellationSignal, X.A4Y, java.io.OutputStream):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass1TI r6, java.io.InputStream r7, java.io.OutputStream r8, byte[] r9) {
        /*
            boolean r5 = X.AnonymousClass8BU.A1X(r9)
            r0 = 16
            byte[] r4 = X.C17970vW.A0I(r0)     // Catch:{ GeneralSecurityException -> 0x0035 }
            javax.crypto.Cipher r3 = X.AnonymousClass8BR.A18()     // Catch:{ GeneralSecurityException -> 0x0035 }
            javax.crypto.spec.IvParameterSpec r1 = X.AnonymousClass8BR.A19(r4)     // Catch:{ GeneralSecurityException -> 0x0035 }
            javax.crypto.spec.SecretKeySpec r0 = X.AnonymousClass8BS.A0v(r9)     // Catch:{ GeneralSecurityException -> 0x0035 }
            r3.init(r5, r0, r1)     // Catch:{ GeneralSecurityException -> 0x0035 }
            javax.crypto.CipherInputStream r2 = new javax.crypto.CipherInputStream     // Catch:{ GeneralSecurityException -> 0x0035 }
            r2.<init>(r7, r3)     // Catch:{ GeneralSecurityException -> 0x0035 }
            r8.write(r4)     // Catch:{ all -> 0x002e }
            if (r6 == 0) goto L_0x0027
            X.C64062u9.A0G(r6, r2, r8)     // Catch:{ all -> 0x002e }
            goto L_0x002a
        L_0x0027:
            X.C64062u9.A00(r2, r8)     // Catch:{ all -> 0x002e }
        L_0x002a:
            r2.close()     // Catch:{ GeneralSecurityException -> 0x0035 }
            return
        L_0x002e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ GeneralSecurityException -> 0x0035 }
            throw r0     // Catch:{ GeneralSecurityException -> 0x0035 }
        L_0x0035:
            r2 = move-exception
            java.lang.String r1 = "Failed to encrypt stream"
            X.9HZ r0 = new X.9HZ
            r0.<init>(r1, r2, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8M.A05(X.1TI, java.io.InputStream, java.io.OutputStream, byte[]):void");
    }
}
