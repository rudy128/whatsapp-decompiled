package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.CbU  reason: case insensitive filesystem */
public final class C25233CbU {
    public final E8A A00;
    public final E8A A01;
    public final E8A A02;
    public final E8A A03;
    public final String A04;
    public final Map A05;
    public final Set A06;
    public final boolean A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25233CbU) {
                C25233CbU cbU = (C25233CbU) obj;
                if (!C18070vi.A18(this.A04, cbU.A04) || !C18070vi.A18(this.A00, cbU.A00) || !C18070vi.A18(this.A03, cbU.A03) || !C18070vi.A18(this.A02, cbU.A02) || !C18070vi.A18(this.A06, cbU.A06) || !C18070vi.A18(this.A05, cbU.A05) || !C18070vi.A18(this.A01, cbU.A01) || this.A07 != cbU.A07 || this.A08 != cbU.A08) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((((((((((AnonymousClass000.A0N(this.A00, C17880vN.A03(this.A04)) + AnonymousClass001.A0k(this.A03)) * 31) + AnonymousClass001.A0k(this.A02)) * 31) + AnonymousClass001.A0k(this.A06)) * 31) + AnonymousClass001.A0k(this.A05)) * 31) + C17880vN.A02(this.A01)) * 31, this.A07), this.A08);
    }

    public C25233CbU(E8A e8a, E8A e8a2, E8A e8a3, E8A e8a4, String str, Map map, Set set, boolean z, boolean z2) {
        this.A04 = str;
        this.A00 = e8a;
        this.A03 = e8a2;
        this.A02 = e8a3;
        this.A06 = set;
        this.A05 = map;
        this.A01 = e8a4;
        this.A07 = z;
        this.A08 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScopedBloksComponentQueryDefinition(id=");
        A10.append(this.A04);
        A10.append(", appIdExpression=");
        A10.append(this.A00);
        A10.append(", paramsExpression=");
        A10.append(this.A03);
        A10.append(", clientParamsExpression=");
        A10.append(this.A02);
        A10.append(", dependencies=");
        A10.append(this.A06);
        A10.append(", targets=");
        A10.append(this.A05);
        A10.append(", cacheTTLExpression=");
        A10.append(this.A01);
        A10.append(", isDiskCacheEnabled=");
        A10.append(this.A07);
        A10.append(", isScoped=");
        return C17900vP.A0F(A10, this.A08);
    }
}
