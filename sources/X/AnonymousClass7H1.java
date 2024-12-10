package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.7H1  reason: invalid class name */
public abstract class AnonymousClass7H1 implements AnonymousClass8B2 {
    public final long A00;
    public final Uri A01;
    public final AnonymousClass11B A02;
    public final String A03;
    public final long A04;
    public final long A05;
    public final String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A01(long r14, int r16) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.AnonymousClass65a
            if (r0 == 0) goto L_0x0012
            java.io.File r1 = r13.BQC()
            r4 = 0
            r6 = 0
            if (r1 != 0) goto L_0x0051
            java.lang.String r0 = "mediafileutils/createVideoThumbnail/file=null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0011:
            return r4
        L_0x0012:
            android.net.Uri r2 = r13.A01
            X.11B r1 = r13.A02
            r3 = 0
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r2 = r1.A06(r2, r0)     // Catch:{ IOException -> 0x0034, IllegalArgumentException -> 0x0030, NullPointerException -> 0x0038 }
            r0 = r16
            android.graphics.Bitmap r4 = X.C137236v8.A01(r2, r0, r14)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x003f
            r2.close()     // Catch:{ IOException -> 0x0034, IllegalArgumentException -> 0x0030, NullPointerException -> 0x0038 }
            goto L_0x003f
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x0034, IllegalArgumentException -> 0x0030, NullPointerException -> 0x0038 }
            throw r0     // Catch:{ IOException -> 0x0034, IllegalArgumentException -> 0x0030, NullPointerException -> 0x0038 }
        L_0x0030:
            r1 = move-exception
            java.lang.String r0 = "Util/makeBitmap/IllegalArgumentException/"
            goto L_0x003b
        L_0x0034:
            r1 = move-exception
            java.lang.String r0 = "Util/makeBitmap/IOException/"
            goto L_0x003b
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "Util/makeBitmap/NullPointerException/"
        L_0x003b:
            com.whatsapp.util.Log.e(r0, r1)
            r4 = r3
        L_0x003f:
            if (r4 == 0) goto L_0x0011
            r1 = r13
            boolean r0 = r13 instanceof X.AnonymousClass65Z
            if (r0 == 0) goto L_0x004f
            X.65Z r1 = (X.AnonymousClass65Z) r1
            int r0 = r1.A00
        L_0x004a:
            android.graphics.Bitmap r4 = X.C137236v8.A00(r4, r0)
            return r4
        L_0x004f:
            r0 = 0
            goto L_0x004a
        L_0x0051:
            X.DRK.A04(r1)     // Catch:{ IOException -> 0x0055 }
            goto L_0x0057
        L_0x0055:
            r0 = 0
            goto L_0x0058
        L_0x0057:
            r0 = 1
        L_0x0058:
            if (r0 == 0) goto L_0x006a
            android.graphics.Bitmap r4 = X.DRK.A00(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x005f, Exception -> 0x0063 }
            return r4
        L_0x005f:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/gif file not read "
            goto L_0x0066
        L_0x0063:
            r1 = move-exception
            java.lang.String r0 = "mediafileutils/createGifThumbnail/unexpected gif exception "
        L_0x0066:
            com.whatsapp.util.Log.e(r0, r1)
            return r4
        L_0x006a:
            r10 = 0
            r8 = 512(0x200, float:7.175E-43)
            X.6c1 r5 = new X.6c1
            r5.<init>(r1)
            r9 = r6
            r12 = r6
            r7 = r6
            android.graphics.Bitmap r4 = X.C1408873l.A00(r4, r5, r6, r7, r8, r9, r10, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H1.A01(long, int):android.graphics.Bitmap");
    }

    public /* synthetic */ File BQC() {
        String str = this.A03;
        if (str == null) {
            return null;
        }
        return C108945cZ.A17(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass7H1)) {
            return false;
        }
        return C18070vi.A18(this.A01, ((AnonymousClass7H1) obj).A01);
    }

    public int hashCode() {
        return this.A01.hashCode();
    }

    public String toString() {
        return C18070vi.A0H(this.A01);
    }

    public AnonymousClass7H1(Uri uri, AnonymousClass11B r2, String str, String str2, long j, long j2, long j3) {
        this.A02 = r2;
        this.A00 = j;
        this.A01 = uri;
        this.A03 = str;
        this.A06 = str2;
        this.A05 = j2;
        this.A04 = j3;
    }

    public Uri BLl() {
        return this.A01;
    }

    public String BQD() {
        return this.A03;
    }

    public long BQH() {
        return this.A05;
    }

    public /* synthetic */ long BQv() {
        return 0;
    }

    public String BUw() {
        return this.A06;
    }

    public long getContentLength() {
        return this.A04;
    }
}
