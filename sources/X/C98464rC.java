package X;

import java.util.List;

/* renamed from: X.4rC  reason: invalid class name and case insensitive filesystem */
public final class C98464rC implements B6R {
    public final AnonymousClass1EC A00;
    public final String A01;
    public final List A02;
    public final C18100vl A03 = AnonymousClass1DF.A01(new AnonymousClass5FF(this));

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C98464rC) {
                C98464rC r5 = (C98464rC) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A02, AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A01)));
    }

    public C98464rC(AnonymousClass1EC r2, String str, List list) {
        this.A01 = str;
        this.A00 = r2;
        this.A02 = list;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoveCommunityParticipantsRequest(iqId=");
        A10.append(this.A01);
        A10.append(", parentGroupJid=");
        A10.append(this.A00);
        A10.append(", listOfUsers=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
