package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;
import java.util.Map;

/* renamed from: X.CbE  reason: case insensitive filesystem */
public final class C25218CbE {
    public final C25187Cad A00;
    public final BloksComponentQueryResources A01;
    public final String A02;
    public final String A03;
    public final Map A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25218CbE) {
                C25218CbE cbE = (C25218CbE) obj;
                if (!C18070vi.A18(this.A00, cbE.A00) || !C18070vi.A18(this.A02, cbE.A02) || !C18070vi.A18(this.A04, cbE.A04) || !C18070vi.A18(this.A03, cbE.A03) || !C18070vi.A18(this.A01, cbE.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17890vO.A02(this.A03, AnonymousClass000.A0N(this.A04, C17890vO.A02(this.A02, AnonymousClass000.A0L(this.A00)))) + AnonymousClass001.A0k(this.A01);
    }

    public C25218CbE(C25187Cad cad, BloksComponentQueryResources bloksComponentQueryResources, String str, String str2, Map map) {
        this.A00 = cad;
        this.A02 = str;
        this.A04 = map;
        this.A03 = str2;
        this.A01 = bloksComponentQueryResources;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BloksBatchedComponentQueryParseResult(componentParseResult=");
        A10.append(this.A00);
        A10.append(", appId=");
        A10.append(this.A02);
        A10.append(", consumedParams=");
        A10.append(this.A04);
        A10.append(", rawComponentPayload=");
        A10.append(this.A03);
        A10.append(", resources=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
