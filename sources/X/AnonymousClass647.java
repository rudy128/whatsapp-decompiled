package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.647  reason: invalid class name */
public final class AnonymousClass647 extends AnonymousClass184 {
    public Long A00;
    public Long A01;
    public Long A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A06);
        r3.CHf(3, this.A07);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A08);
        r3.CHf(6, this.A09);
        r3.CHf(9, this.A02);
        r3.CHf(7, this.A03);
        r3.CHf(10, this.A04);
        r3.CHf(8, this.A05);
        r3.CHf(11, this.A0A);
    }

    public AnonymousClass647() {
        super(4472, new C18180vt(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A0D(AnonymousClass184.A0A(AnonymousClass184.A0C(AnonymousClass184.A09(AnonymousClass184.A0B(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(C17880vN.A0h(), this.A00, A13), this.A06, A13), this.A07, A13), this.A01, A13), this.A08, A13), this.A09, A13), this.A02, A13), this.A03, A13), this.A04, A13), this.A05, A13), this.A0A);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamXplatAttachmentFormatCheckEvent {");
        AnonymousClass186.A00(this.A00, "formatCheckContentLength", A10);
        AnonymousClass186.A00(this.A06, "formatCheckExtensionDetected", A10);
        AnonymousClass186.A00(this.A07, "formatCheckExtensionHint", A10);
        AnonymousClass186.A00(this.A01, "formatCheckFileSize", A10);
        AnonymousClass186.A00(this.A08, "formatCheckMimetypeDetected", A10);
        AnonymousClass186.A00(this.A09, "formatCheckMimetypeHint", A10);
        AnonymousClass186.A00(this.A02, "formatCheckReason", A10);
        AnonymousClass186.A00(this.A03, "formatCheckReturnCode", A10);
        AnonymousClass186.A00(this.A04, "formatCheckScore", A10);
        AnonymousClass186.A00(this.A05, "formatCheckTimeElapsedNs", A10);
        return AnonymousClass184.A0S(this.A0A, "formatCheckVersionString", A10);
    }
}
