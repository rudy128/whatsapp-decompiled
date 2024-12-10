package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gx  reason: invalid class name and case insensitive filesystem */
public final class C47052Gx extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Integer A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Long A07;
    public Long A08;
    public Long A09;

    public C47052Gx() {
        super(2244, new C18180vt(1, 1, 100, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(6, this.A03);
        r3.CHf(14, this.A00);
        r3.CHf(3, this.A07);
        r3.CHf(1, this.A04);
        r3.CHf(2, this.A08);
        r3.CHf(11, this.A09);
        r3.CHf(10, this.A01);
        r3.CHf(4, this.A05);
        r3.CHf(9, this.A06);
        r3.CHf(5, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0m(), this.A03);
        AnonymousClass184.A0X(A13, 12);
        A13.put(14, this.A00);
        AnonymousClass184.A0X(A13, 13);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A0B(AnonymousClass184.A06(AnonymousClass184.A0C(AnonymousClass184.A0D(AnonymousClass184.A04(AnonymousClass184.A03(C17880vN.A0j(), this.A07, A13), this.A04, A13), this.A08, A13), this.A09, A13), this.A01, A13), this.A05, A13), this.A06, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamPsBufferUpload {");
        AnonymousClass186.A00(C17900vP.A08(this.A03), "applicationState", A10);
        AnonymousClass186.A00(this.A00, "isUserSampled", A10);
        AnonymousClass186.A00(this.A07, "psBufferUploadHttpResponseCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "psBufferUploadResult", A10);
        AnonymousClass186.A00(this.A08, "psBufferUploadT", A10);
        AnonymousClass186.A00(this.A09, "psDitheredT", A10);
        AnonymousClass186.A00(this.A01, "psForceUpload", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "psTokenNotReadyReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "psUploadReason", A10);
        return AnonymousClass184.A0S(this.A02, "waConnectedToChatd", A10);
    }
}
