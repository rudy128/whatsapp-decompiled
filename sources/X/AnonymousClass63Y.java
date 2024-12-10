package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63Y  reason: invalid class name */
public final class AnonymousClass63Y extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public String A04;
    public String A05;

    public AnonymousClass63Y() {
        super(4746, AnonymousClass184.A01(), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A03);
        r3.CHf(7, this.A04);
        r3.CHf(3, this.A02);
        r3.CHf(4, this.A05);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(C108975cc.A0S(AnonymousClass184.A03(C17880vN.A0m(), this.A00, A13), this.A01, A13), this.A03, A13), this.A04);
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A06(C17880vN.A0j(), this.A02, A13), this.A05);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsChannelPostForward {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "channelForwardContentType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "channelForwardGroupType", A10);
        AnonymousClass186.A00(this.A03, "cid", A10);
        AnonymousClass186.A00(this.A04, "destinationChannelId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "mediaType", A10);
        return AnonymousClass184.A0S(this.A05, "postId", A10);
    }
}
