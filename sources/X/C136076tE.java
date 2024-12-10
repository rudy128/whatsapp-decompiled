package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.6tE  reason: invalid class name and case insensitive filesystem */
public final class C136076tE {
    public final C136456tq A00;
    public final List A01;
    public final List A02;
    public final Map A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136076tE) {
                C136076tE r5 = (C136076tE) obj;
                if (this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0N(this.A01, AnonymousClass3MX.A03(this.A04)))) + AnonymousClass001.A0k(this.A00);
    }

    public C136076tE(C136456tq r1, List list, List list2, Map map, boolean z) {
        this.A04 = z;
        this.A01 = list;
        this.A03 = map;
        this.A02 = list2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EligibilityCheckResult(isAccountLinked=");
        A10.append(this.A04);
        A10.append(", destinationList=");
        A10.append(this.A01);
        A10.append(", crosspostedStateMap=");
        A10.append(this.A03);
        A10.append(", uniqueIdList=");
        A10.append(this.A02);
        A10.append(", purposeEncryptionParams=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
