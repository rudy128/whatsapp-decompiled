package X;

import java.util.Map;

/* renamed from: X.6tD  reason: invalid class name and case insensitive filesystem */
public final class C136066tD {
    public final long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136066tD) {
                C136066tD r8 = (C136066tD) obj;
                if (this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03) || !C18070vi.A18(this.A02, r8.A02) || !C18070vi.A18(this.A01, r8.A01) || !C18070vi.A18(this.A04, r8.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A04, ((((((AnonymousClass000.A0I(this.A00) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01)) * 31);
    }

    public C136066tD(String str, String str2, String str3, Map map, long j) {
        this.A00 = j;
        this.A03 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A04 = map;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MultiDestinationCrosspostingInfo(messageRowId=");
        A10.append(this.A00);
        A10.append(", uniqueId=");
        A10.append(this.A03);
        A10.append(", mediaFilePath=");
        A10.append(this.A02);
        A10.append(", directUrlPath=");
        A10.append(this.A01);
        A10.append(", destinationStateMap=");
        return AnonymousClass001.A1F(this.A04, A10);
    }
}
