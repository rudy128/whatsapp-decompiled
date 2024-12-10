package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63L  reason: invalid class name */
public final class AnonymousClass63L extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public AnonymousClass63L() {
        super(3952, new C18180vt(1, 100, 5000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(4, this.A03);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C108975cc.A0S(AnonymousClass184.A03(AnonymousClass184.A06(C108975cc.A0T(C17880vN.A0l(), this.A00, A13), this.A01, A13), this.A03, A13), this.A04, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamSearchLatency {");
        AnonymousClass186.A00(this.A00, "isCached", A10);
        AnonymousClass186.A00(this.A01, "isStarred", A10);
        AnonymousClass186.A00(this.A03, "page", A10);
        AnonymousClass186.A00(this.A04, "searchDuration", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "searchType", A10);
    }
}
