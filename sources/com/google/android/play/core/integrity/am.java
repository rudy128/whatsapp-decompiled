package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

public final class am extends IntegrityTokenRequest.Builder {
    public String a;
    public Long b;

    public final IntegrityTokenRequest build() {
        String str = this.a;
        if (str != null) {
            return new ao(str, this.b, (Object) null, (an) null);
        }
        throw AnonymousClass000.A0n("Missing required properties: nonce");
    }

    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        throw AnonymousClass000.A0s("Null nonce");
    }

    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j) {
        this.b = Long.valueOf(j);
        return this;
    }
}
