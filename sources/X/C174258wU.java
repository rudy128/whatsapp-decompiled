package X;

import java.util.List;

/* renamed from: X.8wU  reason: invalid class name and case insensitive filesystem */
public final class C174258wU extends C174358we {
    public final List A00;
    public final C22821Di A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174258wU) {
                C174258wU r5 = (C174258wU) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, 0));
    }

    public C174258wU(List list, C22821Di r3) {
        super(51);
        this.A00 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SuggestedSearchListItemData(suggestionType=");
        A10.append(0);
        A10.append(", suggestedSearch=");
        A10.append(this.A00);
        A10.append(", clickListener=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
