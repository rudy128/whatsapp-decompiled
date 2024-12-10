package X;

import java.util.List;
import java.util.Map;

public final class A21 {
    public final AnonymousClass1EC A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final Map A04;

    public A21(AnonymousClass1EC r2, List list, Map map) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
        this.A03 = list;
        this.A04 = map;
        this.A01 = null;
        this.A02 = null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A21) {
                A21 a21 = (A21) obj;
                if (!C18070vi.A18(this.A00, a21.A00) || !C18070vi.A18(this.A03, a21.A03) || !C18070vi.A18(this.A04, a21.A04) || !C18070vi.A18(this.A01, a21.A01) || !C18070vi.A18(this.A02, a21.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A04, AnonymousClass000.A0N(this.A03, AnonymousClass001.A0k(this.A00) * 31)) + C17900vP.A00(this.A01)) * 31) + C108955ca.A06(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RemoveCommunityParticipantsResponse(from=");
        A10.append(this.A00);
        A10.append(", successList=");
        A10.append(this.A03);
        A10.append(", failTable=");
        A10.append(this.A04);
        A10.append(", errorCode=");
        A10.append(this.A01);
        A10.append(", errorText=");
        return C17900vP.A0B(this.A02, A10);
    }

    public A21(String str, String str2) {
        C18460wS r2 = C18460wS.A00;
        AnonymousClass1CQ A0I = AnonymousClass1D7.A0I();
        this.A00 = null;
        this.A03 = r2;
        this.A04 = A0I;
        this.A01 = str;
        this.A02 = str2;
    }
}
