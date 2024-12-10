package X;

import java.util.List;

/* renamed from: X.4VA  reason: invalid class name */
public final class AnonymousClass4VA {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final List A04;
    public final C18100vl A05 = C99164sN.A01(this, 12);
    public final C18100vl A06 = C99164sN.A01(this, 13);

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4VA) {
                AnonymousClass4VA r5 = (AnonymousClass4VA) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A03, AnonymousClass000.A0N(this.A00, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A04)))));
    }

    public AnonymousClass4VA(List list, List list2, List list3, List list4, List list5) {
        C18070vi.A0k(list2, list3);
        C18070vi.A0d(list5, 5);
        this.A04 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A00 = list4;
        this.A03 = list5;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterEnforcementMap(suspensions=");
        A10.append(this.A04);
        A10.append(", geosuspensions=");
        A10.append(this.A01);
        A10.append(", messageEnforcements=");
        A10.append(this.A02);
        A10.append(", copyrightSuspensions=");
        A10.append(this.A00);
        A10.append(", profilePictureDeletions=");
        return AnonymousClass001.A1F(this.A03, A10);
    }
}
