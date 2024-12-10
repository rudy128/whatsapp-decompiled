package X;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class BPJ extends C26688D9l implements E9Q {
    public long A00;
    public AssetFileDescriptor A01;
    public Uri A02;
    public InputStream A03;
    public boolean A04;
    public final Resources A05;

    public BPJ(Context context) {
        super(false);
        this.A05 = context.getResources();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
        if (r4.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004b, code lost:
        if (r4.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0053, code lost:
        if (r4.A04 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r4.A04 = false;
        A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x005a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void close() {
        /*
            r4 = this;
            r3 = 0
            r4.A02 = r3
            r2 = 0
            java.io.InputStream r0 = r4.A03     // Catch:{ IOException -> 0x0027 }
            if (r0 == 0) goto L_0x000b
            r0.close()     // Catch:{ IOException -> 0x0027 }
        L_0x000b:
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x0020 }
            if (r0 == 0) goto L_0x0014
            r0.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0014:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x001f
            r4.A04 = r2
            r4.A01()
        L_0x001f:
            return
        L_0x0020:
            r1 = move-exception
            X.BxH r0 = new X.BxH     // Catch:{ all -> 0x004e }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x004e }
            throw r0     // Catch:{ all -> 0x004e }
        L_0x0027:
            r1 = move-exception
            X.BxH r0 = new X.BxH     // Catch:{ all -> 0x002e }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x002e }
            throw r0     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            r4.A03 = r3
            android.content.res.AssetFileDescriptor r0 = r4.A01     // Catch:{ IOException -> 0x003f }
            if (r0 == 0) goto L_0x0038
            r0.close()     // Catch:{ IOException -> 0x003f }
        L_0x0038:
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005a
            goto L_0x0055
        L_0x003f:
            r1 = move-exception
            X.BxH r0 = new X.BxH     // Catch:{ all -> 0x0046 }
            r0.<init>((java.io.IOException) r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005a
            goto L_0x0055
        L_0x004e:
            r1 = move-exception
            r4.A01 = r3
            boolean r0 = r4.A04
            if (r0 == 0) goto L_0x005a
        L_0x0055:
            r4.A04 = r2
            r4.A01()
        L_0x005a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BPJ.close():void");
    }

    public Uri Bb3() {
        return this.A02;
    }

    public long CAj(C26115Csd csd) {
        Throwable th;
        try {
            Uri uri = csd.A04;
            this.A02 = uri;
            if (TextUtils.equals("rawresource", uri.getScheme())) {
                try {
                    int parseInt = Integer.parseInt(this.A02.getLastPathSegment());
                    A02();
                    AssetFileDescriptor openRawResourceFd = this.A05.openRawResourceFd(parseInt);
                    this.A01 = openRawResourceFd;
                    FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                    this.A03 = fileInputStream;
                    fileInputStream.skip(this.A01.getStartOffset());
                    InputStream inputStream = this.A03;
                    long j = csd.A03;
                    if (inputStream.skip(j) >= j) {
                        long j2 = csd.A02;
                        long j3 = -1;
                        if (j2 != -1) {
                            this.A00 = j2;
                        } else {
                            long length = this.A01.getLength();
                            if (length != -1) {
                                j3 = length - j;
                            }
                            this.A00 = j3;
                        }
                        this.A04 = true;
                        A04(csd);
                        return this.A00;
                    }
                    th = BE6.A0i();
                } catch (NumberFormatException unused) {
                    th = new C24205BxH("Resource identifier must be an integer.");
                }
            } else {
                th = new C24205BxH("URI must use scheme rawresource");
            }
            throw th;
        } catch (IOException e) {
            throw new C24205BxH(e);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.A00;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, (long) i2);
                } catch (IOException e) {
                    throw new C24205BxH(e);
                }
            }
            int read = this.A03.read(bArr, i, i2);
            if (read != -1) {
                long j2 = this.A00;
                if (j2 != -1) {
                    this.A00 = j2 - ((long) read);
                }
                A03(read);
                return read;
            } else if (this.A00 != -1) {
                throw new C24205BxH((IOException) BE6.A0i());
            }
        }
        return -1;
    }
}
