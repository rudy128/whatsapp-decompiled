package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqp  reason: case insensitive filesystem */
public final class C23832Bqp extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public String A04;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A04);
        r3.CHf(3, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A02);
        r3.CHf(6, this.A03);
    }

    public C23832Bqp() {
        super(4870, AnonymousClass184.A01(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A04);
        AnonymousClass184.A0X(A13, 2);
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C17880vN.A0j(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMetaVerifiedInteraction {");
        AnonymousClass186.A00(this.A04, "businessOwnerJid", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "metaVerifiedInteractionAction", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "metaVerifiedInteractionAssetType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "metaVerifiedInteractionReferral", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A03), "metaVerifiedInteractionSurface", A10);
    }
}
