package com.google.android.recaptcha.internal;

import X.AnonymousClass3Gr;
import android.content.Context;
import java.io.File;

public final class zzad {
    public final Context zza;

    public zzad(Context context) {
        this.zza = context;
    }

    public static final byte[] zza(File file) {
        return AnonymousClass3Gr.A02(file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void zzb(java.io.File r2, byte[] r3) {
        /*
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r2.delete()
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "Unable to delete existing encrypted file"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0013:
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            java.io.FileOutputStream r2 = X.C108945cZ.A19(r2)
            r2.write(r3)     // Catch:{ all -> 0x0022 }
            r2.close()
            return
        L_0x0022:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0024 }
        L_0x0024:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzad.zzb(java.io.File, byte[]):void");
    }
}
