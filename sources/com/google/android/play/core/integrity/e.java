package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class e extends StandardIntegrityManager.PrepareIntegrityTokenRequest {
    public final long a;

    public final int a() {
        return 0;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof StandardIntegrityManager.PrepareIntegrityTokenRequest) && this.a == ((e) ((StandardIntegrityManager.PrepareIntegrityTokenRequest) obj)).a);
    }

    public final int hashCode() {
        return (AnonymousClass000.A0I(this.a) ^ 1000003) * 1000003;
    }

    public /* synthetic */ e(long j, int i, d dVar) {
        this.a = j;
    }

    public final String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PrepareIntegrityTokenRequest{cloudProjectNumber=");
        A10.append(this.a);
        return AnonymousClass000.A0y(", webViewRequestMode=0}", A10);
    }
}
