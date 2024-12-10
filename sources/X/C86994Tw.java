package X;

import java.util.List;

/* renamed from: X.4Tw  reason: invalid class name and case insensitive filesystem */
public final class C86994Tw {
    public final AnonymousClass1E7 A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86994Tw) {
                C86994Tw r5 = (C86994Tw) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public C86994Tw(AnonymousClass1E7 r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViolatingMessages(contact=");
        A10.append(this.A00);
        A10.append(", messageList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
