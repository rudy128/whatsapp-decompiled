package X;

import android.view.View;

/* renamed from: X.7Op  reason: invalid class name and case insensitive filesystem */
public final class C146307Op implements AnonymousClass86B {
    public final View A00;
    public final View A01;
    public final View A02;

    public C146307Op(View view, View view2, View view3) {
        C18070vi.A0d(view, 1);
        this.A00 = view;
        this.A01 = view2;
        this.A02 = view3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C146307Op) {
                C146307Op r5 = (C146307Op) obj;
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

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyBannerShareViewDataData(containerView=");
        A10.append(this.A00);
        A10.append(", fbShareIcon=");
        A10.append(this.A01);
        A10.append(", thirdPartyIcon=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
