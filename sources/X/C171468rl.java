package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.8rl  reason: invalid class name and case insensitive filesystem */
public final class C171468rl extends AnonymousClass184 {
    public Boolean A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public String A08;
    public String A09;

    public C171468rl() {
        super(3782, new C18180vt(1, 1000, 2000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A08);
        r3.CHf(12, this.A01);
        r3.CHf(3, this.A02);
        r3.CHf(13, this.A03);
        r3.CHf(7, this.A09);
        r3.CHf(14, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(11, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0A(AnonymousClass184.A0G(AnonymousClass184.A09(AnonymousClass184.A0F(AnonymousClass184.A05(AnonymousClass184.A0E(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A08, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A09, A13), this.A04, A13), this.A05, A13), this.A06);
        AnonymousClass184.A0X(A13, 10);
        A13.put(C108955ca.A0g(), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamMexEvent {");
        AnonymousClass186.A00(this.A00, "isMex", A10);
        AnonymousClass186.A00(this.A08, "mexEventData", A10);
        AnonymousClass186.A00(this.A01, "mexEventDurationT", A10);
        AnonymousClass186.A00(this.A02, "mexEventEndTime", A10);
        AnonymousClass186.A00(this.A03, "mexEventEnvelopeResponseStatus", A10);
        AnonymousClass186.A00(this.A09, "mexEventOperation", A10);
        AnonymousClass186.A00(this.A04, "mexEventPayloadResponseStatus", A10);
        AnonymousClass186.A00(this.A05, "mexEventRequestSize", A10);
        AnonymousClass186.A00(this.A06, "mexEventResponseSize", A10);
        return AnonymousClass184.A0S(this.A07, "mexEventStartTime", A10);
    }
}
