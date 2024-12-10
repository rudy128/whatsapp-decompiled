package X;

import java.util.List;

/* renamed from: X.9qm  reason: invalid class name and case insensitive filesystem */
public final class C193859qm {
    public final String A00;
    public final List A01;

    public C193859qm(String str, List list) {
        C18070vi.A0d(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193859qm) {
                C193859qm r5 = (C193859qm) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, C17880vN.A03(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SupportMessageFeedback(messageId=");
        A10.append(this.A00);
        A10.append(", feedbackKindList=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
