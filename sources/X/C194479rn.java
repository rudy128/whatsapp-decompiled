package X;

import java.util.Set;

/* renamed from: X.9rn  reason: invalid class name and case insensitive filesystem */
public final class C194479rn {
    public final int A00;
    public final C22512BAt A01;
    public final Set A02;

    public C194479rn(C22512BAt bAt, Set set, int i) {
        C18070vi.A0d(set, 2);
        this.A00 = i;
        this.A02 = set;
        this.A01 = bAt;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C194479rn) {
                C194479rn r5 = (C194479rn) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StubMessageParserInfo(messageType=");
        A10.append(this.A00);
        A10.append(", stubTypes=");
        A10.append(this.A02);
        A10.append(", parser=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
