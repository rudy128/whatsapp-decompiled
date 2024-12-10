package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63m  reason: invalid class name and case insensitive filesystem */
public final class C1184463m extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;

    public C1184463m() {
        super(4766, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(7, this.A00);
        r3.CHf(1, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(2, this.A01);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(6, this.A07);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A0A(AnonymousClass184.A03(C108955ca.A0e(), this.A00, A13), this.A02, A13), this.A03, A13), this.A01, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A07);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAiStickerLatency {");
        AnonymousClass186.A00(this.A00, "containsAnimated", A10);
        AnonymousClass186.A00(this.A02, "downloadLatency", A10);
        AnonymousClass186.A00(this.A03, "downloadLatencyFull", A10);
        AnonymousClass186.A00(this.A01, "includesUserCreation", A10);
        AnonymousClass186.A00(this.A04, "responseLatency", A10);
        AnonymousClass186.A00(this.A05, "serverLlmTime", A10);
        AnonymousClass186.A00(this.A06, "serverStickerGenTime", A10);
        return AnonymousClass184.A0S(this.A07, "stickerSessionId", A10);
    }
}
