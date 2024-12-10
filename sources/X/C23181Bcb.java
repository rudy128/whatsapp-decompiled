package X;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: X.Bcb  reason: case insensitive filesystem */
public final class C23181Bcb extends DJ0 {
    public static final Parcelable.Creator CREATOR = new Object();
    public ParcelFileDescriptor A00;
    public byte[] A01 = new byte[0];

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C23181Bcb) {
            return Arrays.equals(this.A01, ((C23181Bcb) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0084, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0085, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009f, code lost:
        if (r5 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a1, code lost:
        A00(r5);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083 A[Catch:{ all -> 0x0098 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException)] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:32:0x0070=Splitter:B:32:0x0070, B:38:0x0086=Splitter:B:38:0x0086} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            java.lang.String r4 = "ParcelByteArray"
            byte[] r6 = r7.A01
            r3 = 0
            android.os.ParcelFileDescriptor r0 = r7.A00
            if (r0 != 0) goto L_0x00a7
            java.io.File r5 = X.C24452C4r.A00     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            if (r5 == 0) goto L_0x0065
            java.lang.String r0 = "teleporter"
            java.lang.StringBuilder r2 = X.BE6.A0u(r0)     // Catch:{ IOException -> 0x005c, IllegalStateException -> 0x0084, all -> 0x006c }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x005c, IllegalStateException -> 0x0084, all -> 0x006c }
            java.lang.String r1 = X.C17880vN.A0u(r2, r0)     // Catch:{ IOException -> 0x005c, IllegalStateException -> 0x0084, all -> 0x006c }
            java.lang.String r0 = ".tmp"
            java.io.File r2 = java.io.File.createTempFile(r1, r0, r5)     // Catch:{ IOException -> 0x005c, IllegalStateException -> 0x0084, all -> 0x006c }
            java.io.FileOutputStream r1 = X.C108945cZ.A19(r2)     // Catch:{ FileNotFoundException -> 0x0053 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r2, r0)     // Catch:{ FileNotFoundException -> 0x0053 }
            r2.delete()     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            android.util.Pair r2 = android.util.Pair.create(r1, r0)     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            java.lang.Object r1 = r2.first     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            java.io.OutputStream r1 = (java.io.OutputStream) r1     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            java.io.BufferedOutputStream r0 = new java.io.BufferedOutputStream     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            r5.<init>(r0)     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            int r0 = r6.length     // Catch:{ IllegalStateException -> 0x0051, IOException -> 0x004f }
            r5.writeInt(r0)     // Catch:{ IllegalStateException -> 0x0051, IOException -> 0x004f }
            r5.write(r6)     // Catch:{ IllegalStateException -> 0x0051, IOException -> 0x004f }
            java.lang.Object r0 = r2.second     // Catch:{ IllegalStateException -> 0x0051, IOException -> 0x004f }
            android.os.ParcelFileDescriptor r0 = (android.os.ParcelFileDescriptor) r0     // Catch:{ IllegalStateException -> 0x0051, IOException -> 0x004f }
            A00(r5)
            goto L_0x00a5
        L_0x004f:
            r0 = move-exception
            goto L_0x0070
        L_0x0051:
            r0 = move-exception
            goto L_0x0086
        L_0x0053:
            r2 = move-exception
            java.lang.String r0 = "Temporary file is somehow already deleted"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            r1.<init>(r0, r2)     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            goto L_0x0064
        L_0x005c:
            r2 = move-exception
            java.lang.String r0 = "Could not create temporary file"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            r1.<init>(r0, r2)     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
        L_0x0064:
            throw r1     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
        L_0x0065:
            java.lang.String r0 = "Must set temp dir before writing this object to a parcel"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
            throw r0     // Catch:{ IllegalStateException -> 0x0084, IOException -> 0x006e, all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            throw r0
        L_0x006e:
            r0 = move-exception
            r5 = r3
        L_0x0070:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "Could not write into unlinked file. "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0098 }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x0098 }
            if (r5 == 0) goto L_0x00a4
            goto L_0x00a1
        L_0x0084:
            r0 = move-exception
            r5 = r3
        L_0x0086:
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "Could not create unlinked file. "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0098 }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x0098 }
            goto L_0x009f
        L_0x0098:
            r0 = move-exception
            if (r5 == 0) goto L_0x009e
            A00(r5)
        L_0x009e:
            throw r0
        L_0x009f:
            if (r5 == 0) goto L_0x00a4
        L_0x00a1:
            A00(r5)
        L_0x00a4:
            r0 = r3
        L_0x00a5:
            r7.A00 = r0
        L_0x00a7:
            r5 = 1
            r4 = r9 | 1
            int r2 = X.C26293Cx2.A00(r8)
            android.os.ParcelFileDescriptor r1 = r7.A00
            r0 = 0
            X.C26293Cx2.A09(r8, r1, r5, r4, r0)
            X.C26293Cx2.A05(r8, r2)
            r7.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23181Bcb.writeToParcel(android.os.Parcel, int):void");
    }

    public static void A00(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("ParcelByteArray", "Could not close stream", e);
        }
    }
}
