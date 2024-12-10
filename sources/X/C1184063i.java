package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63i  reason: invalid class name and case insensitive filesystem */
public final class C1184063i extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;

    public C1184063i() {
        super(5228, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A01);
        r3.CHf(4, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(6, this.A04);
        r3.CHf(7, this.A05);
        r3.CHf(8, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A01);
        AnonymousClass184.A0X(A13, 3);
        A13.put(AnonymousClass184.A0A(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(C17880vN.A0k(), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPtvDaily {");
        AnonymousClass186.A00(this.A00, "ptvPauseAutomaticCount", A10);
        AnonymousClass186.A00(this.A01, "ptvPauseCount", A10);
        AnonymousClass186.A00(this.A02, "ptvReactCount", A10);
        AnonymousClass186.A00(this.A03, "ptvReceiveCount", A10);
        AnonymousClass186.A00(this.A04, "ptvReplyCount", A10);
        AnonymousClass186.A00(this.A05, "ptvResumeCount", A10);
        return AnonymousClass184.A0S(this.A06, "ptvUnmuteCount", A10);
    }
}
