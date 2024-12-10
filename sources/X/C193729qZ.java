package X;

import java.util.Map;

/* renamed from: X.9qZ  reason: invalid class name and case insensitive filesystem */
public final class C193729qZ {
    public final long A00;
    public final Map A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193729qZ) {
                C193729qZ r8 = (C193729qZ) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass8BV.A00(this.A00));
    }

    public C193729qZ(Map map, long j) {
        this.A00 = j;
        this.A01 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CategoryCache(creationTime=");
        A10.append(this.A00);
        A10.append(", categories=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
