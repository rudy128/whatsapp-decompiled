package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.644  reason: invalid class name */
public final class AnonymousClass644 extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Long A06;
    public Long A07;
    public Long A08;
    public String A09;
    public String A0A;

    public AnonymousClass644() {
        super(4692, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(7, this.A06);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(10, this.A03);
        r3.CHf(12, this.A04);
        r3.CHf(4, this.A09);
        r3.CHf(9, this.A07);
        r3.CHf(5, this.A0A);
        r3.CHf(6, this.A05);
        r3.CHf(13, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 8);
        A13.put(AnonymousClass184.A0F(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0B(AnonymousClass184.A06(AnonymousClass184.A0E(AnonymousClass184.A0C(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A09(C17880vN.A0h(), this.A00, A13), this.A06, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A09, A13), this.A07, A13), this.A0A, A13), this.A05, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamChannelCoreEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "channelCoreEventType", A10);
        AnonymousClass186.A00(this.A06, "channelDirectorySessionId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "channelEntryPoint", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "channelEntryPointApp", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "channelEntryPointMetadata", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "channelEventUnit", A10);
        AnonymousClass186.A00(this.A09, "cid", A10);
        AnonymousClass186.A00(this.A07, "directoryChannelIndex", A10);
        AnonymousClass186.A00(this.A0A, "entryPointMetadata", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "eventSurface", A10);
        return AnonymousClass184.A0S(this.A08, "similarChannelsSessionId", A10);
    }
}
