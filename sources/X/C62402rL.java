package X;

import java.util.List;

/* renamed from: X.2rL  reason: invalid class name and case insensitive filesystem */
public final class C62402rL {
    public final List A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62402rL) {
                C62402rL r5 = (C62402rL) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A00)));
    }

    public C62402rL(List list, List list2, List list3) {
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeContactsData(nativeContactsAdded=");
        A10.append(this.A00);
        A10.append(", nativeContactsRemoved=");
        A10.append(this.A01);
        A10.append(", unChangedContacts=");
        return AnonymousClass001.A1F(this.A02, A10);
    }

    public C62402rL() {
        this(AnonymousClass000.A13(), AnonymousClass000.A13(), AnonymousClass000.A13());
    }
}
