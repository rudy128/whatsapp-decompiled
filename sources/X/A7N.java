package X;

import android.util.Pair;
import com.whatsapp.util.Log;
import com.whatsapp.util.NativeUtils;
import java.io.File;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class A7N {
    public long A00;
    public long A01;
    public Boolean A02;
    public String A03;
    public String A04;
    public final AnonymousClass181 A05;
    public final C22554BCn A06;
    public final C184599bD A07;
    public final C220418j A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E = AnonymousClass8BR.A14();
    public final List A0F = AnonymousClass8BR.A14();
    public final List A0G = AnonymousClass8BR.A14();
    public final List A0H = AnonymousClass8BR.A14();
    public final AtomicBoolean A0I = new AtomicBoolean();
    public final AtomicReference A0J = new AtomicReference();
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    public static String A01(URL url) {
        if (!(url == null || url.getHost() == null)) {
            try {
                return InetAddress.getByName(url.getHost()).getHostAddress();
            } catch (UnknownHostException unused) {
            }
        }
        return null;
    }

    private Pair A00() {
        boolean z;
        Socket socket = (Socket) this.A0J.get();
        int i = 0;
        if (socket != null) {
            try {
                i = NativeUtils.getFileDescriptorForSocket(socket);
                z = true;
            } catch (UnsatisfiedLinkError | UnsupportedOperationException e) {
                Log.w("httpsformpost/getSocketInfo", e);
            }
            return C108945cZ.A0N(Integer.valueOf(i), Boolean.valueOf(z));
        }
        z = false;
        return C108945cZ.A0N(Integer.valueOf(i), Boolean.valueOf(z));
    }

    private void A02(Pair pair, C187689gD r9, OutputStream outputStream, AtomicLong atomicLong) {
        int i;
        int i2;
        long j = r9.A02;
        long j2 = j;
        while (j > 0) {
            j -= r9.A03.skip(j);
        }
        byte[] bArr = new byte[16384];
        do {
            int read = r9.A03.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
                j2 += (long) read;
                int A012 = C108965cb.A01(pair);
                int i3 = 0;
                if (AnonymousClass000.A1Y(pair.second)) {
                    try {
                        i3 = NativeUtils.getBytesInSocketOutputQueue(A012);
                    } catch (UnsupportedOperationException unused) {
                    }
                }
                long j3 = j2 - ((long) i3);
                C22554BCn bCn = this.A06;
                if (bCn != null) {
                    bCn.Bqr(j3);
                }
                if (Thread.currentThread().isInterrupted()) {
                    throw new InterruptedIOException();
                }
            } else {
                C184599bD r2 = this.A07;
                if (r2 != null) {
                    try {
                        byte[] A0K2 = r2.A01.A0K(r2.A00);
                        if (A0K2 != null) {
                            Arrays.toString(A0K2);
                            outputStream.write(A0K2);
                            i = A0K2.length;
                            atomicLong.set(j2 + ((long) i));
                            return;
                        }
                    } catch (Exception unused2) {
                        Log.e("MediaUpload/Error when prepare seal padding");
                    }
                }
                i = 0;
                atomicLong.set(j2 + ((long) i));
                return;
            }
        } while (!this.A0I.getAndSet(false));
        C184599bD r22 = this.A07;
        if (r22 != null) {
            try {
                byte[] A0K3 = r22.A01.A0K(r22.A00);
                if (A0K3 != null) {
                    Arrays.toString(A0K3);
                    outputStream.write(A0K3);
                    i2 = A0K3.length;
                    atomicLong.set(j2 + ((long) i2));
                    throw new AnonymousClass9HV();
                }
            } catch (Exception unused3) {
                Log.e("MediaUpload/Error when prepare seal padding");
            }
        }
        i2 = 0;
        atomicLong.set(j2 + ((long) i2));
        throw new AnonymousClass9HV();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0323, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("failure during latePostParam call; name=");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x033a, code lost:
        throw new java.io.IOException(X.AnonymousClass000.A0y((java.lang.String) r15.first, r1), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03df, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03f9, code lost:
        X.AnonymousClass0DT.A00(r2, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:53:0x0164, B:122:0x030f] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03bf A[LOOP:4: B:156:0x03b9->B:158:0x03bf, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A04(X.C191779nA r24) {
        /*
            r23 = this;
            r5 = r23
            r9 = r24
            if (r24 == 0) goto L_0x0013
            java.util.List r2 = r5.A0H
            java.lang.String r1 = "auth"
            java.lang.String r0 = r9.A01
            android.util.Pair r0 = X.C108945cZ.A0N(r1, r0)
            r2.add(r0)
        L_0x0013:
            java.lang.String r8 = X.C17890vO.A0Q()     // Catch:{ all -> 0x0409 }
            java.lang.String r10 = r5.A0B     // Catch:{ all -> 0x0409 }
            android.net.Uri r0 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x0409 }
            android.net.Uri$Builder r3 = r0.buildUpon()     // Catch:{ all -> 0x0409 }
            java.util.List r0 = r5.A0H     // Catch:{ all -> 0x0409 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0409 }
        L_0x0027:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0409 }
            if (r0 == 0) goto L_0x003f
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0409 }
            android.util.Pair r0 = (android.util.Pair) r0     // Catch:{ all -> 0x0409 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0409 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0409 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0409 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0409 }
            r3.appendQueryParameter(r1, r0)     // Catch:{ all -> 0x0409 }
            goto L_0x0027
        L_0x003f:
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0409 }
            java.net.URLConnection r4 = X.AnonymousClass8BV.A0v(r0)     // Catch:{ all -> 0x0409 }
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ all -> 0x0409 }
            boolean r0 = r5.A0L     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r0 == 0) goto L_0x0059
            r1 = 1
            X.18j r0 = r5.A08     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.DcK r15 = r0.A01(r1)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x0054:
            boolean r0 = r5.A0M     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r0 == 0) goto L_0x0070
            goto L_0x0060
        L_0x0059:
            X.18j r0 = r5.A08     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9A9 r15 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x03fd }
            goto L_0x0054
        L_0x0060:
            if (r24 == 0) goto L_0x0070
            java.lang.String r2 = r9.A07     // Catch:{ IllegalArgumentException -> 0x03fd }
            javax.net.ssl.HostnameVerifier r1 = javax.net.ssl.HttpsURLConnection.getDefaultHostnameVerifier()     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.AlR r0 = new X.AlR     // Catch:{ IllegalArgumentException -> 0x03fd }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setHostnameVerifier(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x0070:
            int r7 = r15.BPF()     // Catch:{ IllegalArgumentException -> 0x03fd }
            r0 = r15
            javax.net.ssl.SSLSocketFactory r0 = (javax.net.ssl.SSLSocketFactory) r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setSSLSocketFactory(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r0 = 60000(0xea60, float:8.4078E-41)
            r4.setReadTimeout(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r5.A0C     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r1 = r5.A0D     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r1 == 0) goto L_0x009c
            java.lang.String r0 = "X-FB-Request-Analytics-Tags"
            r4.setRequestProperty(r0, r1)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x009c:
            java.lang.String r1 = r5.A0A     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r1 == 0) goto L_0x00a5
            java.lang.String r0 = "Companion_User_Secret"
            r4.setRequestProperty(r0, r1)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x00a5:
            r6 = 0
            if (r24 == 0) goto L_0x00ff
            java.lang.String r1 = "Host"
            java.lang.String r0 = r9.A07     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.util.List r12 = r5.A0E     // Catch:{ IllegalArgumentException -> 0x03fd }
            boolean r0 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r0 != 0) goto L_0x010e
            java.lang.Object r0 = r12.get(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9gD r0 = (X.C187689gD) r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r2 = r0.A01     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.Object r0 = r12.get(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9gD r0 = (X.C187689gD) r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x03fd }
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 <= 0) goto L_0x00ed
            java.lang.String r3 = "Content-Range"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = "bytes "
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.Object r0 = r12.get(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9gD r0 = (X.C187689gD) r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r0 = r0.A02     // Catch:{ IllegalArgumentException -> 0x03fd }
            r2.append(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = "-*/*"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setRequestProperty(r3, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            goto L_0x010e
        L_0x00ed:
            boolean r0 = r5.A0K     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r0 == 0) goto L_0x010e
            int r0 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            java.lang.String r1 = "Content-Length"
            java.lang.String r0 = java.lang.Long.toString(r2)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setRequestProperty(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            goto L_0x010e
        L_0x00ff:
            java.lang.String r2 = "Content-Type"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = "multipart/form-data; boundary="
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setRequestProperty(r2, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x010e:
            r0 = 1
            r4.setDoOutput(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.setChunkedStreamingMode(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.BCn r3 = r5.A06     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r3 == 0) goto L_0x011c
            r3.Bpq()     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x011c:
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03fd }
            r4.connect()     // Catch:{ all -> 0x03e6 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r0 = r0 - r11
            r5.A00 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.net.URL r0 = r4.getURL()     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = A01(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r5.A04 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r3 == 0) goto L_0x0139
            r3.Bpi(r10)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x0139:
            int r0 = r15.BPF()     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r0 != r7) goto L_0x0140
            r6 = 1
        L_0x0140:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r5.A02 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.181 r0 = r5.A05     // Catch:{ IllegalArgumentException -> 0x03fd }
            r22 = r0
            java.lang.Integer r0 = r5.A09     // Catch:{ IllegalArgumentException -> 0x03fd }
            r21 = r0
            r19 = 0
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9He r6 = new X.9He     // Catch:{ IllegalArgumentException -> 0x03fd }
            r2 = r22
            r1 = r19
            r6.<init>(r2, r7, r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ IllegalArgumentException -> 0x03fd }
            r7.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r24 == 0) goto L_0x019f
            java.util.List r0 = r5.A0E     // Catch:{ all -> 0x03df }
            r20 = r0
            int r0 = r20.size()     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x034c
            int r0 = r20.size()     // Catch:{ all -> 0x03df }
            r8 = 0
            boolean r6 = X.C17890vO.A1R(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03df }
            java.lang.String r1 = "MMS4 upload only supports a single file; we have been given "
            r0 = r20
            X.C17890vO.A15(r1, r2, r0)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x03df }
            X.C17960vV.A0F(r6, r0)     // Catch:{ all -> 0x03df }
            r0 = r20
            java.lang.Object r2 = r0.get(r8)     // Catch:{ all -> 0x03df }
            X.9gD r2 = (X.C187689gD) r2     // Catch:{ all -> 0x03df }
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x03df }
            r1.<init>()     // Catch:{ all -> 0x03df }
            android.util.Pair r0 = r5.A00()     // Catch:{ all -> 0x03df }
            r5.A02(r0, r2, r7, r1)     // Catch:{ all -> 0x03df }
            goto L_0x034c
        L_0x019f:
            android.util.Pair r17 = r5.A00()     // Catch:{ all -> 0x03df }
            r0 = 2
            byte[] r11 = new byte[r0]     // Catch:{ all -> 0x03df }
            r11 = {13, 10} // fill-array     // Catch:{ all -> 0x03df }
            java.util.List r0 = r5.A0E     // Catch:{ all -> 0x03df }
            r20 = r0
            java.util.Iterator r16 = r20.iterator()     // Catch:{ all -> 0x03df }
            r18 = 0
        L_0x01b3:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03df }
            java.lang.String r14 = "\r\n"
            java.lang.String r13 = "Content-Disposition: form-data; name=\""
            java.lang.String r12 = "\\\""
            java.lang.String r10 = "\""
            java.lang.String r9 = "\\\\"
            java.lang.String r6 = "\\"
            java.lang.String r2 = "--"
            if (r0 == 0) goto L_0x0299
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x03df }
            X.9gD r15 = (X.C187689gD) r15     // Catch:{ all -> 0x03df }
            if (r18 == 0) goto L_0x01d2
            r7.write(r11)     // Catch:{ all -> 0x03df }
        L_0x01d2:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r2, r8, r14)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r0)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r15.A05     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r0.replace(r6, r9)     // Catch:{ all -> 0x03df }
            java.lang.String r1 = r0.replace(r10, r12)     // Catch:{ all -> 0x03df }
            java.lang.String r2 = r15.A04     // Catch:{ all -> 0x03df }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x03df }
            java.lang.String r14 = "\"\r\n"
            if (r0 != 0) goto L_0x028f
            java.lang.String r0 = r2.replace(r6, r9)     // Catch:{ all -> 0x03df }
            java.lang.String r2 = r0.replace(r10, r12)     // Catch:{ all -> 0x03df }
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r13, r1)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "\"; filename=\""
            X.C17890vO.A10(r0, r2, r14, r1)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x03df }
        L_0x0202:
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x03df }
            r7.write(r0)     // Catch:{ all -> 0x03df }
            int r1 = r15.A00     // Catch:{ all -> 0x03df }
            if (r1 != 0) goto L_0x024c
            java.lang.String r0 = "Content-Type: application/x-gzip\r\n"
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x03df }
            r7.write(r0)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "Content-Encoding: gzip\r\n"
        L_0x0218:
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x03df }
            r7.write(r0)     // Catch:{ all -> 0x03df }
            long r0 = r15.A02     // Catch:{ all -> 0x03df }
            r9 = 0
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x023b
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03df }
            java.lang.String r2 = "Content-Range: bytes "
            r6.append(r2)     // Catch:{ all -> 0x03df }
            r6.append(r0)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "-*/*\r\n"
            r6.append(r0)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r6)     // Catch:{ all -> 0x03df }
        L_0x023b:
            r7.write(r11)     // Catch:{ all -> 0x03df }
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ all -> 0x03df }
            r1.<init>()     // Catch:{ all -> 0x03df }
            r0 = r17
            r5.A02(r0, r15, r7, r1)     // Catch:{ all -> 0x03df }
            r18 = 1
            goto L_0x01b3
        L_0x024c:
            r0 = 1
            if (r1 != r0) goto L_0x0252
            java.lang.String r0 = "Content-Type: application/zip\r\n"
            goto L_0x0218
        L_0x0252:
            r0 = 3
            if (r1 != r0) goto L_0x0258
            java.lang.String r0 = "Content-Type: image/jpeg\r\n"
            goto L_0x0218
        L_0x0258:
            r0 = 6
            if (r1 != r0) goto L_0x025e
            java.lang.String r0 = "Content-Type: image/png\r\n"
            goto L_0x0218
        L_0x025e:
            r0 = 7
            if (r1 != r0) goto L_0x0264
            java.lang.String r0 = "Content-Type: image/tiff\r\n"
            goto L_0x0218
        L_0x0264:
            r0 = 4
            if (r1 != r0) goto L_0x026a
            java.lang.String r0 = "Content-Type: image/gif\r\n"
            goto L_0x0218
        L_0x026a:
            r0 = 5
            if (r1 != r0) goto L_0x0270
            java.lang.String r0 = "Content-Type: image/bmp\r\n"
            goto L_0x0218
        L_0x0270:
            r0 = 8
            if (r1 != r0) goto L_0x0277
            java.lang.String r0 = "Content-Type: image/webp\r\n"
            goto L_0x0218
        L_0x0277:
            r0 = 9
            if (r1 != r0) goto L_0x027e
            java.lang.String r0 = "Content-Type: image/heic\r\n"
            goto L_0x0218
        L_0x027e:
            r0 = 10
            if (r1 != r0) goto L_0x0285
            java.lang.String r0 = "Content-Type: application/pdf\r\n"
            goto L_0x0218
        L_0x0285:
            r0 = 11
            if (r1 != r0) goto L_0x028c
            java.lang.String r0 = "Content-Type: video/mp4\r\n"
            goto L_0x0218
        L_0x028c:
            java.lang.String r0 = "Content-Type: application/octet-stream\r\n"
            goto L_0x0218
        L_0x028f:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r13, r1, r14)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x03df }
            goto L_0x0202
        L_0x0299:
            java.util.List r0 = r5.A0G     // Catch:{ all -> 0x03df }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x03df }
        L_0x029f:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03df }
            java.lang.String r17 = "\"\r\n\r\n"
            if (r0 == 0) goto L_0x02dc
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x03df }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x03df }
            java.lang.Object r0 = r15.first     // Catch:{ all -> 0x03df }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r0.replace(r6, r9)     // Catch:{ all -> 0x03df }
            java.lang.String r1 = r0.replace(r10, r12)     // Catch:{ all -> 0x03df }
            if (r18 == 0) goto L_0x02be
            r7.write(r11)     // Catch:{ all -> 0x03df }
        L_0x02be:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r2, r8, r14)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r0)     // Catch:{ all -> 0x03df }
            r0 = r17
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r13, r1, r0)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r0)     // Catch:{ all -> 0x03df }
            java.lang.Object r0 = r15.second     // Catch:{ all -> 0x03df }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03df }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x03df }
            r7.write(r0)     // Catch:{ all -> 0x03df }
            r18 = 1
            goto L_0x029f
        L_0x02dc:
            java.util.List r0 = r5.A0F     // Catch:{ all -> 0x03df }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x03df }
        L_0x02e2:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x03df }
            if (r0 == 0) goto L_0x033b
            java.lang.Object r15 = r16.next()     // Catch:{ all -> 0x03df }
            android.util.Pair r15 = (android.util.Pair) r15     // Catch:{ all -> 0x03df }
            java.lang.Object r0 = r15.first     // Catch:{ all -> 0x03df }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03df }
            java.lang.String r0 = r0.replace(r6, r9)     // Catch:{ all -> 0x03df }
            java.lang.String r1 = r0.replace(r10, r12)     // Catch:{ all -> 0x03df }
            if (r18 == 0) goto L_0x02ff
            r7.write(r11)     // Catch:{ all -> 0x03df }
        L_0x02ff:
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r2, r8, r14)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r0)     // Catch:{ all -> 0x03df }
            r0 = r17
            java.lang.StringBuilder r0 = X.C17900vP.A0H(r13, r1, r0)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r0)     // Catch:{ all -> 0x03df }
            java.lang.Object r0 = r15.second     // Catch:{ Exception -> 0x0323 }
            java.util.concurrent.Callable r0 = (java.util.concurrent.Callable) r0     // Catch:{ Exception -> 0x0323 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0323 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0323 }
            byte[] r0 = r0.getBytes()     // Catch:{ Exception -> 0x0323 }
            r7.write(r0)     // Catch:{ Exception -> 0x0323 }
            r18 = 1
            goto L_0x02e2
        L_0x0323:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "failure during latePostParam call; name="
            r1.append(r0)     // Catch:{ all -> 0x03df }
            java.lang.Object r0 = r15.first     // Catch:{ all -> 0x03df }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x03df }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x03df }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x03df }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x03df }
            throw r0     // Catch:{ all -> 0x03df }
        L_0x033b:
            if (r18 == 0) goto L_0x0340
            r7.write(r11)     // Catch:{ all -> 0x03df }
        L_0x0340:
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0o(r2, r8)     // Catch:{ all -> 0x03df }
            java.lang.String r0 = "--\r\n"
            r1.append(r0)     // Catch:{ all -> 0x03df }
            X.AnonymousClass8BW.A1G(r7, r1)     // Catch:{ all -> 0x03df }
        L_0x034c:
            r7.close()     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r8 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03fd }
            int r7 = r4.getResponseCode()     // Catch:{ all -> 0x03d6 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r0 = r0 - r8
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r4.getHeaderField(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r5.A03 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            r0 = 400(0x190, float:5.6E-43)
            if (r7 < r0) goto L_0x038e
            java.io.InputStream r0 = r4.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x03fd }
            if (r0 == 0) goto L_0x03b2
            java.io.InputStream r8 = r4.getErrorStream()     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9Hb r6 = new X.9Hb     // Catch:{ IllegalArgumentException -> 0x03fd }
            r2 = r22
            r1 = r19
            r0 = r21
            r6.<init>(r2, r8, r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x03fd }
            r2.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = X.AnonymousClass1EY.A00(r2)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03af
            r3.Bt0(r0)     // Catch:{ all -> 0x03cc }
            goto L_0x03af
        L_0x038e:
            java.io.InputStream r8 = r4.getInputStream()     // Catch:{ IllegalArgumentException -> 0x03fd }
            X.9Hb r6 = new X.9Hb     // Catch:{ IllegalArgumentException -> 0x03fd }
            r2 = r22
            r1 = r19
            r0 = r21
            r6.<init>(r2, r8, r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IllegalArgumentException -> 0x03fd }
            r2.<init>(r6)     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r1 = X.AnonymousClass1EY.A00(r2)     // Catch:{ all -> 0x03cc }
            if (r3 == 0) goto L_0x03af
            java.util.Map r0 = r4.getHeaderFields()     // Catch:{ all -> 0x03cc }
            r3.C3W(r1, r0)     // Catch:{ all -> 0x03cc }
        L_0x03af:
            r2.close()     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x03b2:
            r4.disconnect()     // Catch:{ all -> 0x0409 }
            java.util.Iterator r1 = r20.iterator()
        L_0x03b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03cb
            java.lang.Object r0 = r1.next()
            X.9gD r0 = (X.C187689gD) r0
            java.io.InputStream r0 = r0.A03
            X.AnonymousClass1EY.A02(r0)
            goto L_0x03b9
        L_0x03cb:
            return r7
        L_0x03cc:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x03d1 }
            goto L_0x03d5
        L_0x03d1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x03d5:
            throw r1     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x03d6:
            r2 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r0 = r0 - r8
            r5.A01 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            goto L_0x03fc
        L_0x03df:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x03e4 }
            goto L_0x03fc
        L_0x03e4:
            r0 = move-exception
            goto L_0x03f9
        L_0x03e6:
            r2 = move-exception
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ IllegalArgumentException -> 0x03fd }
            long r0 = r0 - r11
            r5.A00 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.net.URL r0 = r4.getURL()     // Catch:{ IllegalArgumentException -> 0x03fd }
            java.lang.String r0 = A01(r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
            r5.A04 = r0     // Catch:{ IllegalArgumentException -> 0x03fd }
            goto L_0x03fc
        L_0x03f9:
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x03fc:
            throw r2     // Catch:{ IllegalArgumentException -> 0x03fd }
        L_0x03fd:
            r1 = move-exception
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0404 }
            r0.<init>(r1)     // Catch:{ all -> 0x0404 }
            throw r0     // Catch:{ all -> 0x0404 }
        L_0x0404:
            r0 = move-exception
            r4.disconnect()     // Catch:{ all -> 0x0409 }
            throw r0     // Catch:{ all -> 0x0409 }
        L_0x0409:
            r2 = move-exception
            java.util.List r0 = r5.A0E
            java.util.Iterator r1 = r0.iterator()
        L_0x0410:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0422
            java.lang.Object r0 = r1.next()
            X.9gD r0 = (X.C187689gD) r0
            java.io.InputStream r0 = r0.A03
            X.AnonymousClass1EY.A02(r0)
            goto L_0x0410
        L_0x0422:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7N.A04(X.9nA):int");
    }

    public void A05(InputStream inputStream, String str, String str2, long j, long j2) {
        this.A0E.add(new C187689gD(inputStream, str, str2, 2, j, j2));
    }

    public void A06(String str, String str2) {
        this.A0G.add(Pair.create(str, str2));
    }

    public void A07(String str, String str2) {
        this.A0H.add(Pair.create(str, str2));
    }

    public A7N(AnonymousClass181 r2, C22554BCn bCn, C184599bD r4, C220418j r5, String str, String str2, String str3, String str4, int i, boolean z, boolean z2, boolean z3) {
        this.A08 = r5;
        this.A0B = str;
        this.A0C = str2;
        this.A06 = bCn;
        this.A0L = z;
        this.A0M = z2;
        this.A05 = r2;
        this.A09 = Integer.valueOf(i);
        this.A0K = z3;
        this.A0D = str3;
        this.A0A = str4;
        this.A07 = r4;
    }

    public static void A03(A7N a7n, File file, InputStream inputStream, String str) {
        a7n.A05(inputStream, str, file.getName(), 0, file.length());
    }
}
