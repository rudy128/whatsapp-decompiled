package X;

import java.util.List;

/* renamed from: X.9qU  reason: invalid class name and case insensitive filesystem */
public final class C193679qU {
    public final C22496BAd A00;
    public final List A01;

    public C193679qU(C22496BAd bAd, List list) {
        C18070vi.A0d(list, 2);
        this.A00 = bAd;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193679qU) {
                C193679qU r5 = (C193679qU) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0L(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SuggestionBucketResult(bucket=");
        A10.append(this.A00);
        A10.append(", jids=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
