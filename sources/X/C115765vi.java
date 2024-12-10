package X;

import java.util.List;

/* renamed from: X.5vi  reason: invalid class name and case insensitive filesystem */
public final class C115765vi extends C123056Sy {
    public final Integer A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C115765vi) {
                C115765vi r5 = (C115765vi) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0L(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C115765vi(Integer num, List list) {
        this.A01 = list;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loaded(memories=");
        A10.append(this.A01);
        A10.append(", userMessage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
