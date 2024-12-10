package X;

import java.util.List;

/* renamed from: X.2lR  reason: invalid class name and case insensitive filesystem */
public final class C58902lR {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C58902lR) && C18070vi.A18(this.A00, ((C58902lR) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C58902lR(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("QualityBizIntentFlagFetchResult(bizIntentFlagInfoList=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
