package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G7  reason: invalid class name */
public final class AnonymousClass2G7 extends AnonymousClass184 {
    public Double A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;

    public AnonymousClass2G7() {
        super(848, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A03);
        r3.CHf(1, this.A01);
        r3.CHf(4, this.A00);
        r3.CHf(3, this.A04);
        r3.CHf(2, this.A02);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A04(AnonymousClass184.A05(AnonymousClass184.A06(AnonymousClass184.A03(C17880vN.A0l(), this.A03, A13), this.A01, A13), this.A00, A13), this.A04, A13), this.A02);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamProfilePicDownload {");
        AnonymousClass186.A00(this.A03, "profilePicDownloadHttpCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "profilePicDownloadResult", A10);
        AnonymousClass186.A00(this.A00, "profilePicDownloadSize", A10);
        AnonymousClass186.A00(this.A04, "profilePicDownloadT", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A02), "profilePicType", A10);
    }
}
