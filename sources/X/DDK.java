package X;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.os.Build;
import java.io.FileDescriptor;
import java.util.concurrent.Executor;

public class DDK implements ECv {
    public final C25052CVg A00;
    public final ContentResolver A01;
    public final Executor A02;

    public void CCn(C25268CcD ccD, ECs eCs) {
        ECs eCs2 = eCs;
        DDI ddi = (DDI) eCs2;
        C28605E9w e9w = ddi.A05;
        C25256Cbv cbv = ddi.A07;
        eCs.CD4("local", "exif");
        C22862BSq bSq = new C22862BSq(ccD, this, eCs2, e9w, cbv);
        C25027CUe.A00(eCs, bSq, this, 1);
        this.A02.execute(bSq);
    }

    public static ExifInterface A00(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT >= 24) {
            return new ExifInterface(fileDescriptor);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[SYNTHETIC, Splitter:B:24:0x003e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.media.ExifInterface A01(android.net.Uri r7) {
        /*
            r6 = this;
            android.content.ContentResolver r5 = r6.A01
            java.lang.String r4 = X.C20012A3c.A00(r5, r7)
            r3 = 0
            if (r4 != 0) goto L_0x000a
            return r3
        L_0x000a:
            r2 = 0
            java.io.File r1 = X.C108945cZ.A17(r4)     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            if (r0 == 0) goto L_0x001c
            boolean r0 = r1.canRead()     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            if (r0 == 0) goto L_0x001c
            r2 = 1
        L_0x001c:
            if (r2 == 0) goto L_0x0024
            android.media.ExifInterface r0 = new android.media.ExifInterface     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            r0.<init>(r4)     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            return r0
        L_0x0024:
            if (r7 != 0) goto L_0x0028
            r1 = 0
            goto L_0x002c
        L_0x0028:
            java.lang.String r1 = r7.getScheme()     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
        L_0x002c:
            java.lang.String r0 = "content"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = "r"
            android.content.res.AssetFileDescriptor r2 = r5.openAssetFileDescriptor(r7, r0)     // Catch:{ FileNotFoundException -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r2 = r3
        L_0x003c:
            if (r2 == 0) goto L_0x0057
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            r0 = 24
            if (r1 < r0) goto L_0x0057
            java.io.FileDescriptor r0 = r2.getFileDescriptor()     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            android.media.ExifInterface r0 = A00(r0)     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            r2.close()     // Catch:{ IOException -> 0x0057, StackOverflowError -> 0x0050 }
            return r0
        L_0x0050:
            java.lang.Class<X.DDK> r1 = X.DDK.class
            java.lang.String r0 = "StackOverflowError in ExifInterface constructor"
            X.C26265CwA.A03(r1, r0)
        L_0x0057:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDK.A01(android.net.Uri):android.media.ExifInterface");
    }

    public DDK(ContentResolver contentResolver, C25052CVg cVg, Executor executor) {
        this.A02 = executor;
        this.A00 = cVg;
        this.A01 = contentResolver;
    }
}
