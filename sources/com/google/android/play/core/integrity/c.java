package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {
    public long a;
    public byte b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i) {
        this.b = (byte) (this.b | 2);
        return this;
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.a = j;
        this.b = (byte) (this.b | 1);
        return this;
    }

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        byte b2 = this.b;
        if (b2 == 3) {
            return new e(this.a, 0, (d) null);
        }
        StringBuilder A10 = AnonymousClass000.A10();
        if ((b2 & 1) == 0) {
            A10.append(" cloudProjectNumber");
        }
        if ((b2 & 2) == 0) {
            A10.append(" webViewRequestMode");
        }
        throw AnonymousClass000.A0n("Missing required properties:".concat(A10.toString()));
    }
}
