package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;

public class IntegrityServiceException extends ApiException {
    public final Throwable a;

    public final synchronized Throwable getCause() {
        return this.a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IntegrityServiceException(int r5, java.lang.Throwable r6) {
        /*
            r4 = this;
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.Object[] r2 = X.AnonymousClass3MW.A1b()
            r0 = 0
            X.C17880vN.A1T(r2, r5, r0)
            r1 = 1
            java.lang.String r0 = com.google.android.play.core.integrity.model.a.a(r5)
            r2[r1] = r0
            java.lang.String r0 = "Integrity API error (%d): %s."
            java.lang.String r1 = java.lang.String.format(r3, r0, r2)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r5, r1)
            r4.<init>(r0)
            if (r5 == 0) goto L_0x0024
            r4.a = r6
            return
        L_0x0024:
            java.lang.String r0 = "ErrorCode should not be 0."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.IntegrityServiceException.<init>(int, java.lang.Throwable):void");
    }

    public int getErrorCode() {
        return this.mStatus.A00;
    }
}
