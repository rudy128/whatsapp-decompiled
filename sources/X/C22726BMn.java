package X;

import java.util.Set;

/* renamed from: X.BMn  reason: case insensitive filesystem */
public final class C22726BMn extends C24470C5k {
    public final Set A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C22726BMn) && super.equals(obj) && C18070vi.A18(this.A00, ((C22726BMn) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A00, 0) + 1231;
    }

    public C22726BMn(Set set) {
        this.A00 = set;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        C108975cc.A17(A10, "ActivityRule:{tag={");
        A10.append("},filters={");
        A10.append(this.A00);
        C108975cc.A16(A10, "}, alwaysExpand={");
        return AnonymousClass000.A0y("}}", A10);
    }
}
