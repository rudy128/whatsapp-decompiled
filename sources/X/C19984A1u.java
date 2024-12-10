package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.A1u  reason: case insensitive filesystem */
public final class C19984A1u {
    public final String A00;
    public final String A01;
    public final List A02;
    public final Map A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19984A1u) {
                C19984A1u a1u = (C19984A1u) obj;
                if (!C18070vi.A18(this.A02, a1u.A02) || !C18070vi.A18(this.A03, a1u.A03) || !C18070vi.A18(this.A00, a1u.A00) || !C18070vi.A18(this.A01, a1u.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C19984A1u(String str, String str2) {
        C18460wS r1 = C18460wS.A00;
        AnonymousClass1CQ A0I = AnonymousClass1D7.A0I();
        this.A02 = r1;
        this.A03 = A0I;
        this.A00 = str;
        this.A01 = str2;
    }

    public int hashCode() {
        return ((AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A02)) + C17900vP.A00(this.A00)) * 31) + C108955ca.A06(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BatchGetGroupInfoResponse(groupInfoList=");
        A10.append(this.A02);
        A10.append(", failTable=");
        A10.append(this.A03);
        A10.append(", errorCode=");
        A10.append(this.A00);
        A10.append(", errorText=");
        return C17900vP.A0B(this.A01, A10);
    }

    public C19984A1u(List list, Map map) {
        this.A02 = list;
        this.A03 = map;
        this.A00 = null;
        this.A01 = null;
    }
}
