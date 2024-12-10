package X;

import java.util.List;

/* renamed from: X.6rO  reason: invalid class name and case insensitive filesystem */
public final class C134936rO {
    public final C135876su A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134936rO) {
                C134936rO r5 = (C134936rO) obj;
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

    public C134936rO(C135876su r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SnaplPayload(requiredMetadata=");
        A10.append(this.A00);
        A10.append(", events=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
