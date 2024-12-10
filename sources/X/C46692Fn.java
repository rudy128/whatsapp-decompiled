package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Fn  reason: invalid class name and case insensitive filesystem */
public final class C46692Fn extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Long A03;

    public C46692Fn() {
        super(894, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(4, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(2, this.A00);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A05(AnonymousClass184.A03(C17880vN.A0k(), this.A01, A13), this.A02, A13), this.A03, A13), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamE2eRetryAfterDelivery {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "deviceType", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A02), A10);
        AnonymousClass186.A00(this.A03, "msgRetryCount", A10);
        return AnonymousClass184.A0S(this.A00, "retryRevoke", A10);
    }
}
