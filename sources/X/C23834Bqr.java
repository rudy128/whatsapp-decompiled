package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Bqr  reason: case insensitive filesystem */
public final class C23834Bqr extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public C23834Bqr() {
        super(2472, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(4, this.A01);
        r3.CHf(2, this.A03);
        r3.CHf(3, this.A02);
        r3.CHf(1, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A06(C17880vN.A0l(), this.A00, A13), this.A01, A13), this.A03, A13), this.A02, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamUserNotice {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "noticeTriggeredBy", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "noticeType", A10);
        AnonymousClass186.A00(this.A03, "userNoticeContentVersion", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "userNoticeEvent", A10);
        return AnonymousClass184.A0S(this.A04, "userNoticeId", A10);
    }
}
