package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63v  reason: invalid class name and case insensitive filesystem */
public final class C1185363v extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public String A07;
    public String A08;

    public C1185363v() {
        super(1650, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(9, this.A07);
        r3.CHf(2, this.A00);
        r3.CHf(7, this.A04);
        r3.CHf(6, this.A05);
        r3.CHf(5, this.A06);
        r3.CHf(8, this.A01);
        r3.CHf(1, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A0A(AnonymousClass184.A07(AnonymousClass184.A08(AnonymousClass184.A09(C108975cc.A0S(AnonymousClass184.A0B(C108975cc.A0T(C17880vN.A0k(), this.A02, A13), this.A03, A13), this.A07, A13), this.A00, A13), this.A04, A13), this.A05, A13), this.A06, A13), this.A01, A13), this.A08);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamGifBatchLoad {");
        AnonymousClass186.A00(this.A02, "gifBatchConnectionDownloadT", A10);
        AnonymousClass186.A00(this.A03, "gifBatchConnectionSetupT", A10);
        AnonymousClass186.A00(this.A07, "gifBatchErrorMessage", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "gifBatchEventType", A10);
        AnonymousClass186.A00(this.A04, "gifBatchHttpCode", A10);
        AnonymousClass186.A00(this.A05, "gifBatchOverallT", A10);
        AnonymousClass186.A00(this.A06, "gifBatchParseResponseT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "gifBatchResult", A10);
        return AnonymousClass184.A0S(this.A08, "gifProvider", A10);
    }
}
