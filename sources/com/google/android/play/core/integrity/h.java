package com.google.android.play.core.integrity;

import X.AnonymousClass000;
import X.BEA;
import X.C17900vP;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.Set;

public final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {
    public final String a;
    public final Set b;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest) {
                String str = this.a;
                h hVar = (h) ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj);
                String str2 = hVar.a;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.b.equals(hVar.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String requestHash() {
        return this.a;
    }

    public final Set verdictOptOut() {
        return this.b;
    }

    public final int hashCode() {
        return ((C17900vP.A00(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String obj = this.b.toString();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StandardIntegrityTokenRequest{requestHash=");
        A10.append(this.a);
        A10.append(", verdictOptOut=");
        return BEA.A0n(obj, A10);
    }

    public /* synthetic */ h(String str, Set set, g gVar) {
        this.a = str;
        this.b = set;
    }
}
