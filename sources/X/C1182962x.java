package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.62x  reason: invalid class name and case insensitive filesystem */
public final class C1182962x extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;

    public C1182962x() {
        super(4728, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A03);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0T(AnonymousClass184.A06(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChannelLinkShare {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "channelLinkShareDirection", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "channelLinkShareEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "channelLinkShareScreen", A10);
        return AnonymousClass184.A0S(this.A03, "cid", A10);
    }
}
