package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

public final class f extends StandardIntegrityManager.StandardIntegrityTokenRequest.Builder {
    public String a;
    public Set b;

    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setRequestHash(String str) {
        this.a = str;
        return this;
    }

    public final StandardIntegrityManager.StandardIntegrityTokenRequest build() {
        Set set = this.b;
        if (set != null) {
            return new h(this.a, set, (g) null);
        }
        throw AnonymousClass000.A0n("Missing required properties: verdictOptOut");
    }

    public final StandardIntegrityManager.StandardIntegrityTokenRequest.Builder setVerdictOptOut(Set set) {
        if (set != null) {
            this.b = set;
            return this;
        }
        throw AnonymousClass000.A0s("Null verdictOptOut");
    }
}
