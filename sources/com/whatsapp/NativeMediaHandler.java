package com.whatsapp;

import X.AnonymousClass11C;
import X.C17970vW;
import X.C18030ve;

public class NativeMediaHandler {
    public boolean A00 = false;
    public final C18030ve A01;
    public final AnonymousClass11C A02;

    public static native void initFileHandlingCallbacks(NativeMediaHandler nativeMediaHandler);

    public void A00() {
        synchronized (this) {
            if (!this.A00) {
                Boolean bool = C17970vW.A03;
                initFileHandlingCallbacks(this);
                this.A00 = true;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0055 A[SYNTHETIC, Splitter:B:16:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068 A[Catch:{ all -> 0x0070, all -> 0x0077, Exception -> 0x007c }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int openFile(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r5 = "; path="
            java.lang.String r4 = "; mode="
            r6 = 0
            if (r8 == 0) goto L_0x0090
            if (r9 == 0) goto L_0x0090
            r1 = r8
            java.lang.String r0 = "/mnt/content/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "content://"
            r1.append(r0)
            r0 = 13
            java.lang.String r0 = r8.substring(r0)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0025:
            android.net.Uri r3 = android.net.Uri.parse(r1)
        L_0x0029:
            java.lang.String r0 = "r+"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0046
            java.lang.String r9 = "rw"
            goto L_0x0046
        L_0x0034:
            java.lang.String r0 = "/"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L_0x0025
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            android.net.Uri r3 = android.net.Uri.fromFile(r0)
            goto L_0x0029
        L_0x0046:
            X.11C r0 = r7.A02     // Catch:{ Exception -> 0x007c }
            X.11B r0 = r0.A0O()     // Catch:{ Exception -> 0x007c }
            X.C17960vV.A07(r0)     // Catch:{ Exception -> 0x007c }
            android.os.ParcelFileDescriptor r2 = r0.A06(r3, r9)     // Catch:{ Exception -> 0x007c }
            if (r2 != 0) goto L_0x0068
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0070 }
            java.lang.String r0 = "nativemediahandler/openFile failed, not opened; uri="
            r1.append(r0)     // Catch:{ all -> 0x0070 }
            r1.append(r3)     // Catch:{ all -> 0x0070 }
            X.C17900vP.A0c(r4, r9, r5, r8, r1)     // Catch:{ all -> 0x0070 }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0070 }
            return r6
        L_0x0068:
            int r0 = r2.detachFd()     // Catch:{ all -> 0x0070 }
            r2.close()     // Catch:{ Exception -> 0x007c }
            return r0
        L_0x0070:
            r1 = move-exception
            if (r2 == 0) goto L_0x007b
            r2.close()     // Catch:{ all -> 0x0077 }
            goto L_0x007b
        L_0x0077:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x007c }
        L_0x007b:
            throw r1     // Catch:{ Exception -> 0x007c }
        L_0x007c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "nativemediahandler/openFile failed; uri="
            r1.append(r0)
            r1.append(r3)
            X.C17900vP.A0c(r4, r9, r5, r8, r1)
            X.C17880vN.A1M(r1, r2)
            return r6
        L_0x0090:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "nativemediahandler/openFile wrong arguments; path="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " mode="
            X.C17900vP.A0e(r0, r9, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.NativeMediaHandler.openFile(java.lang.String, java.lang.String):int");
    }

    public NativeMediaHandler(AnonymousClass11C r2, C18030ve r3) {
        this.A01 = r3;
        this.A02 = r2;
    }
}
