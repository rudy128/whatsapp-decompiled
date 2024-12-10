package X;

import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.6qu  reason: invalid class name and case insensitive filesystem */
public final class C134636qu {
    public final LinkedHashSet A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C134636qu) {
                C134636qu r5 = (C134636qu) obj;
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

    public C134636qu(LinkedHashSet linkedHashSet, Set set) {
        this.A00 = linkedHashSet;
        this.A01 = set;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("UnsentCrosspostingSession(messageRowIds=");
        A10.append(this.A00);
        A10.append(", destinationAppList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
