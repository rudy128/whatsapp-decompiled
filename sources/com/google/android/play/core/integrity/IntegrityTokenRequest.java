package com.google.android.play.core.integrity;

public abstract class IntegrityTokenRequest {

    public abstract class Builder {
        public abstract IntegrityTokenRequest build();

        public abstract Builder setCloudProjectNumber(long j);

        public abstract Builder setNonce(String str);
    }

    public abstract Long cloudProjectNumber();

    public abstract String nonce();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.play.core.integrity.IntegrityTokenRequest$Builder, java.lang.Object] */
    public static Builder builder() {
        return new Object();
    }
}
