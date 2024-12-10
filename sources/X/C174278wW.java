package X;

import java.util.List;

/* renamed from: X.8wW  reason: invalid class name and case insensitive filesystem */
public final class C174278wW extends C174358we {
    public final C20079A6f A00;
    public final AnonymousClass9X3 A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C174278wW) {
                C174278wW r5 = (C174278wW) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0L(this.A00)));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C174278wW(C20079A6f a6f, AnonymousClass9X3 r3, List list) {
        super(46);
        C72473Md.A1I(a6f, r3);
        this.A00 = a6f;
        this.A02 = list;
        this.A01 = r3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NearbyBusinessWidgetListItemData(searchLocation=");
        A10.append(this.A00);
        A10.append(", businessProfiles=");
        A10.append(this.A02);
        A10.append(", nearbyBusinessClickListener=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
