package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

public class BPL extends C26688D9l implements C28651ECk {
    public static final AtomicReference A0D = new AtomicReference();
    public static final Pattern A0E = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public InputStream A04;
    public HttpURLConnection A05;
    public int A06;
    public C26115Csd A07;
    public boolean A08;
    public final int A09;
    public final C24846CMp A0A;
    public final C24846CMp A0B;
    public final String A0C;

    public BPL(C24846CMp cMp, String str, int i) {
        super(true);
        if (!TextUtils.isEmpty(str)) {
            this.A0C = str;
            this.A0B = new C24846CMp();
            this.A09 = i;
            this.A0A = cMp;
            return;
        }
        throw BE6.A0j();
    }

    public void close() {
        try {
            InputStream inputStream = this.A04;
            if (inputStream != null) {
                inputStream.close();
            }
            this.A04 = null;
            A00();
            if (this.A08) {
                this.A08 = false;
                A01();
            }
        } catch (IOException e) {
            throw new BPN(this.A07, e, 3);
        } catch (Throwable th) {
            this.A04 = null;
            A00();
            if (this.A08) {
                this.A08 = false;
                A01();
            }
            throw th;
        }
    }

    private void A00() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.A05 = null;
        }
    }

    public Map BYJ() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public Uri Bb3() {
        HttpURLConnection httpURLConnection = this.A05;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long CAj(X.C26115Csd r20) {
        /*
            r19 = this;
            java.lang.String r11 = "Unable to connect to "
            r10 = r19
            r4 = r20
            r10.A07 = r4
            r8 = 0
            r10.A00 = r8
            r10.A01 = r8
            r10.A02()
            X.CkW r0 = r4.A05
            java.util.Map r0 = r0.A0N
            java.util.Iterator r5 = X.AnonymousClass000.A15(r0)
        L_0x0019:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0041
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r5)
            java.lang.Object r3 = r0.getKey()
            java.lang.Object r2 = r0.getValue()
            X.C26056CrS.A01(r3)
            X.C26056CrS.A01(r2)
            X.CMp r1 = r10.A0B
            monitor-enter(r1)
            r0 = 0
            r1.A00 = r0     // Catch:{ all -> 0x003e }
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x003e }
            r0.put(r3, r2)     // Catch:{ all -> 0x003e }
            monitor-exit(r1)
            goto L_0x0019
        L_0x003e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0041:
            r7 = 1
            android.net.Uri r13 = r4.A04     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = r13.toString()     // Catch:{ IOException -> 0x027b }
            java.net.URL r1 = new java.net.URL     // Catch:{ IOException -> 0x027b }
            r1.<init>(r0)     // Catch:{ IOException -> 0x027b }
            byte[] r14 = r4.A08     // Catch:{ IOException -> 0x027b }
            long r2 = r4.A03     // Catch:{ IOException -> 0x027b }
            long r5 = r4.A02     // Catch:{ IOException -> 0x027b }
            r18 = 1
            int r0 = r4.A00     // Catch:{ IOException -> 0x027b }
            r12 = r0 & 1
            if (r12 == r7) goto L_0x005d
            r18 = 0
        L_0x005d:
            java.lang.String r0 = r1.getHost()     // Catch:{ IOException -> 0x027b }
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r0)     // Catch:{ IOException -> 0x027b }
            boolean r0 = r0.isLoopbackAddress()     // Catch:{ IOException -> 0x027b }
            if (r0 == 0) goto L_0x0087
            java.net.Proxy r0 = java.net.Proxy.NO_PROXY     // Catch:{ IOException -> 0x027b }
            java.net.URLConnection r1 = r1.openConnection(r0)     // Catch:{ IOException -> 0x027b }
        L_0x0071:
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ IOException -> 0x027b }
            r10.A05 = r1     // Catch:{ IOException -> 0x027b }
            r0 = 8000(0x1f40, float:1.121E-41)
            r1.setConnectTimeout(r0)     // Catch:{ IOException -> 0x027b }
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027b }
            int r0 = r10.A09     // Catch:{ IOException -> 0x027b }
            r1.setReadTimeout(r0)     // Catch:{ IOException -> 0x027b }
            X.CMp r1 = r10.A0A     // Catch:{ IOException -> 0x027b }
            if (r1 == 0) goto L_0x00b9
            monitor-enter(r1)     // Catch:{ IOException -> 0x027b }
            goto L_0x008c
        L_0x0087:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ IOException -> 0x027b }
            goto L_0x0071
        L_0x008c:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0278 }
            if (r0 != 0) goto L_0x009c
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0278 }
            java.util.HashMap r0 = X.BE6.A10(r0)     // Catch:{ all -> 0x0278 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0278 }
            r1.A00 = r0     // Catch:{ all -> 0x0278 }
        L_0x009c:
            monitor-exit(r1)     // Catch:{ IOException -> 0x027b }
            java.util.Iterator r16 = X.AnonymousClass000.A15(r0)     // Catch:{ IOException -> 0x027b }
        L_0x00a1:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x027b }
            if (r0 == 0) goto L_0x00b9
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r16)     // Catch:{ IOException -> 0x027b }
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.lang.String r1 = X.C17880vN.A0x(r0)     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = X.AnonymousClass8BR.A10(r0)     // Catch:{ IOException -> 0x027b }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027b }
            goto L_0x00a1
        L_0x00b9:
            X.CMp r1 = r10.A0B     // Catch:{ IOException -> 0x027b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x027b }
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x0278 }
            if (r0 != 0) goto L_0x00cc
            java.util.Map r0 = r1.A01     // Catch:{ all -> 0x0278 }
            java.util.HashMap r0 = X.BE6.A10(r0)     // Catch:{ all -> 0x0278 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0278 }
            r1.A00 = r0     // Catch:{ all -> 0x0278 }
        L_0x00cc:
            monitor-exit(r1)     // Catch:{ IOException -> 0x027b }
            java.util.Iterator r16 = X.AnonymousClass000.A15(r0)     // Catch:{ IOException -> 0x027b }
        L_0x00d1:
            boolean r0 = r16.hasNext()     // Catch:{ IOException -> 0x027b }
            if (r0 == 0) goto L_0x00e9
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r16)     // Catch:{ IOException -> 0x027b }
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.lang.String r1 = X.C17880vN.A0x(r0)     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = X.AnonymousClass8BR.A10(r0)     // Catch:{ IOException -> 0x027b }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027b }
            goto L_0x00d1
        L_0x00e9:
            r16 = -1
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00f3
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x011e
        L_0x00f3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = "bytes="
            r1.append(r0)     // Catch:{ IOException -> 0x027b }
            r1.append(r2)     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = "-"
            java.lang.String r15 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x027b }
            int r0 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x0117
            java.lang.StringBuilder r15 = X.AnonymousClass000.A11(r15)     // Catch:{ IOException -> 0x027b }
            long r0 = r2 + r5
            r16 = 1
            long r0 = r0 - r16
            java.lang.String r15 = X.C17880vN.A0u(r15, r0)     // Catch:{ IOException -> 0x027b }
        L_0x0117:
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = "Range"
            r1.setRequestProperty(r0, r15)     // Catch:{ IOException -> 0x027b }
        L_0x011e:
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = r10.A0C     // Catch:{ IOException -> 0x027b }
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027b }
            if (r18 != 0) goto L_0x0132
            java.net.HttpURLConnection r15 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r15.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x027b }
        L_0x0132:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027b }
            r0.setInstanceFollowRedirects(r7)     // Catch:{ IOException -> 0x027b }
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027b }
            boolean r0 = X.AnonymousClass000.A1W(r14)
            r1.setDoOutput(r0)     // Catch:{ IOException -> 0x027b }
            if (r14 == 0) goto L_0x0143
            goto L_0x0149
        L_0x0143:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027b }
            r0.connect()     // Catch:{ IOException -> 0x027b }
            goto L_0x0169
        L_0x0149:
            java.net.HttpURLConnection r1 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ IOException -> 0x027b }
            int r1 = r14.length     // Catch:{ IOException -> 0x027b }
            if (r1 == 0) goto L_0x0143
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027b }
            r0.setFixedLengthStreamingMode(r1)     // Catch:{ IOException -> 0x027b }
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027b }
            r0.connect()     // Catch:{ IOException -> 0x027b }
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027b }
            java.io.OutputStream r0 = r0.getOutputStream()     // Catch:{ IOException -> 0x027b }
            r0.write(r14)     // Catch:{ IOException -> 0x027b }
            r0.close()     // Catch:{ IOException -> 0x027b }
        L_0x0169:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x027b }
            r10.A05 = r0     // Catch:{ IOException -> 0x027b }
            int r14 = r0.getResponseCode()     // Catch:{ IOException -> 0x0264 }
            r10.A06 = r14     // Catch:{ IOException -> 0x0264 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r14 < r1) goto L_0x0245
            r0 = 299(0x12b, float:4.19E-43)
            if (r14 > r0) goto L_0x0245
            java.net.HttpURLConnection r0 = r10.A05
            r0.getContentType()
            int r0 = r10.A06
            if (r0 != r1) goto L_0x0189
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0189
            r8 = r2
        L_0x0189:
            r10.A03 = r8
            if (r12 == r7) goto L_0x0229
            java.net.HttpURLConnection r8 = r10.A05
            java.lang.String r0 = "Content-Length"
            java.lang.String r14 = r8.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            java.lang.String r12 = "]"
            java.lang.String r11 = "DefaultHttpDataSource"
            if (r0 != 0) goto L_0x01b4
            long r2 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x01a4 }
            goto L_0x01b6
        L_0x01a4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected Content-Length ["
            X.C17890vO.A10(r0, r14, r12, r1)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r11, r0)
        L_0x01b4:
            r2 = -1
        L_0x01b6:
            java.lang.String r0 = "Content-Range"
            java.lang.String r9 = r8.getHeaderField(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x0218
            java.util.regex.Pattern r0 = A0E
            java.util.regex.Matcher r8 = r0.matcher(r9)
            boolean r0 = r8.find()
            if (r0 == 0) goto L_0x0218
            r0 = 2
            java.lang.String r0 = r8.group(r0)     // Catch:{ NumberFormatException -> 0x0208 }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0208 }
            java.lang.String r8 = r8.group(r7)     // Catch:{ NumberFormatException -> 0x0208 }
            long r15 = java.lang.Long.parseLong(r8)     // Catch:{ NumberFormatException -> 0x0208 }
            long r0 = r0 - r15
            r15 = 1
            long r0 = r0 + r15
            r15 = 0
            int r8 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x01eb
            r2 = r0
            goto L_0x0218
        L_0x01eb:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0218
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ NumberFormatException -> 0x0208 }
            java.lang.String r8 = "Inconsistent headers ["
            r13.append(r8)     // Catch:{ NumberFormatException -> 0x0208 }
            r13.append(r14)     // Catch:{ NumberFormatException -> 0x0208 }
            java.lang.String r8 = "] ["
            r13.append(r8)     // Catch:{ NumberFormatException -> 0x0208 }
            X.BEA.A1N(r9, r12, r11, r13)     // Catch:{ NumberFormatException -> 0x0208 }
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ NumberFormatException -> 0x0208 }
            goto L_0x0218
        L_0x0208:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected Content-Range ["
            X.C17890vO.A10(r0, r9, r12, r1)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r11, r0)
        L_0x0218:
            r0 = -1
            int r8 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0229
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x0226
            long r5 = r10.A03
            long r0 = r2 - r5
        L_0x0226:
            r10.A02 = r0
            goto L_0x022b
        L_0x0229:
            r10.A02 = r5
        L_0x022b:
            java.net.HttpURLConnection r0 = r10.A05     // Catch:{ IOException -> 0x023b }
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x023b }
            r10.A04 = r0     // Catch:{ IOException -> 0x023b }
            r10.A08 = r7
            r10.A04(r4)
            long r0 = r10.A02
            return r0
        L_0x023b:
            r1 = move-exception
            r10.A00()
            X.BPN r0 = new X.BPN
            r0.<init>((X.C26115Csd) r4, (java.io.IOException) r1, (int) r7)
            throw r0
        L_0x0245:
            java.net.HttpURLConnection r0 = r10.A05
            java.util.Map r1 = r0.getHeaderFields()
            r10.A00()
            int r0 = r10.A06
            X.BPM r2 = new X.BPM
            r2.<init>(r4, r1, r0)
            int r1 = r10.A06
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x0263
            X.BxR r0 = new X.BxR
            r0.<init>()
            r2.initCause(r0)
        L_0x0263:
            throw r2
        L_0x0264:
            r3 = move-exception
            r10.A00()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r2 = X.BEA.A0j(r13, r11, r0)
            r1 = 2000(0x7d0, float:2.803E-42)
            X.BPN r0 = new X.BPN
            r0.<init>(r4, r3, r2, r1)
            throw r0
        L_0x0278:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IOException -> 0x027b }
            throw r0     // Catch:{ IOException -> 0x027b }
        L_0x027b:
            r3 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r11)
            android.net.Uri r0 = r4.A04
            X.AnonymousClass8BS.A1D(r0, r1)
            java.lang.String r2 = r1.toString()
            r1 = 2000(0x7d0, float:2.803E-42)
            X.BPN r0 = new X.BPN
            r0.<init>(r4, r3, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPL.CAj(X.Csd):long");
    }

    public int read(byte[] bArr, int i, int i2) {
        Throwable th;
        try {
            if (this.A01 != this.A03) {
                AtomicReference atomicReference = A0D;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet((Object) null);
                if (bArr2 == null) {
                    bArr2 = new byte[ZipDecompressor.UNZIP_BUFFER_SIZE];
                }
                while (true) {
                    long j = this.A01;
                    long j2 = this.A03;
                    if (j == j2) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int read = this.A04.read(bArr2, 0, (int) Math.min(j2 - j, (long) bArr2.length));
                    if (!Thread.currentThread().isInterrupted()) {
                        if (read == -1) {
                            th = BE6.A0i();
                            break;
                        }
                        this.A01 += (long) read;
                        A03(read);
                    } else {
                        th = new InterruptedIOException();
                        break;
                    }
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.A02;
            if (j3 != -1) {
                long j4 = j3 - this.A00;
                if (j4 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j4);
            }
            int read2 = this.A04.read(bArr, i, i2);
            if (read2 != -1) {
                this.A00 += (long) read2;
                A03(read2);
                return read2;
            } else if (this.A02 == -1) {
                return -1;
            } else {
                th = BE6.A0i();
                throw th;
            }
        } catch (IOException e) {
            throw new BPN(this.A07, e, 2);
        }
    }
}
