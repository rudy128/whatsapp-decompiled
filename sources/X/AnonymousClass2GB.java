package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GB  reason: invalid class name */
public final class AnonymousClass2GB extends AnonymousClass184 {
    public Boolean A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Integer A04;
    public Long A05;

    public AnonymousClass2GB() {
        super(3578, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A01);
        r3.CHf(1, this.A02);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A00);
        r3.CHf(5, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(AnonymousClass184.A03(C17880vN.A0m(), this.A01, A13), this.A02, A13), this.A05, A13), this.A03, A13), this.A00, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamE2eRetryReject {");
        AnonymousClass186.A00(C17900vP.A08(this.A01), "invisibleMessageCategory", A10);
        AnonymousClass184.A0W(C17900vP.A08(this.A02), A10);
        AnonymousClass186.A00(this.A05, "msgRetryCount", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "retryRejectReason", A10);
        AnonymousClass186.A00(this.A00, "retryRevoke", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A04), "senderDeviceType", A10);
    }
}
