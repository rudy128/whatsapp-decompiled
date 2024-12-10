package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.Ba7  reason: case insensitive filesystem */
public final class C23031Ba7 extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public String A00;

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, X.Ba7] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:15|(2:17|18)|19|20|21|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0022 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x003e */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:12:0x0022=Splitter:B:12:0x0022, B:21:0x003e=Splitter:B:21:0x003e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C23031Ba7 A00(android.content.Context r6, int r7) {
        /*
            android.content.res.Resources r0 = r6.getResources()
            java.io.InputStream r6 = r0.openRawResource(r7)
            java.io.ByteArrayOutputStream r5 = X.C108945cZ.A15()     // Catch:{ IOException -> 0x003f }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r4]     // Catch:{ IOException -> 0x003f }
        L_0x0010:
            r2 = 0
            int r1 = r6.read(r3, r2, r4)     // Catch:{ all -> 0x0035 }
            r0 = -1
            if (r1 == r0) goto L_0x001c
            r5.write(r3, r2, r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0010
        L_0x001c:
            r6.close()     // Catch:{ IOException -> 0x001f }
        L_0x001f:
            r5.close()     // Catch:{ IOException -> 0x0022 }
        L_0x0022:
            byte[] r2 = r5.toByteArray()     // Catch:{ IOException -> 0x003f }
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = new java.lang.String     // Catch:{ IOException -> 0x003f }
            r1.<init>(r2, r0)     // Catch:{ IOException -> 0x003f }
            X.Ba7 r0 = new X.Ba7     // Catch:{ IOException -> 0x003f }
            r0.<init>()     // Catch:{ IOException -> 0x003f }
            r0.A00 = r1     // Catch:{ IOException -> 0x003f }
            return r0
        L_0x0035:
            r0 = move-exception
            if (r6 == 0) goto L_0x003b
            r6.close()     // Catch:{ IOException -> 0x003b }
        L_0x003b:
            r5.close()     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            throw r0     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            r0 = move-exception
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 37
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "Failed to read resource "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23031Ba7.A00(android.content.Context, int):X.Ba7");
    }

    public void writeToParcel(Parcel parcel, int i) {
        DJ0.A0G(parcel, this.A00, C26293Cx2.A00(parcel));
    }
}
