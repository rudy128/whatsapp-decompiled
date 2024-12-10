package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Gl  reason: invalid class name and case insensitive filesystem */
public final class C46932Gl extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public Long A08;

    public C46932Gl() {
        super(5848, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
        r3.CHf(2, this.A04);
        r3.CHf(3, this.A05);
        r3.CHf(4, this.A01);
        r3.CHf(6, this.A06);
        r3.CHf(7, this.A02);
        r3.CHf(8, this.A03);
        r3.CHf(9, this.A07);
        r3.CHf(10, this.A08);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A00, A13), this.A04, A13), this.A05, A13), this.A01);
        AnonymousClass184.A0X(A13, 14);
        A13.put(AnonymousClass184.A07(AnonymousClass184.A0D(AnonymousClass184.A0C(AnonymousClass184.A0B(AnonymousClass184.A0F(AnonymousClass184.A0E(AnonymousClass184.A0A(AnonymousClass184.A09(C17880vN.A0m(), this.A06, A13), this.A02, A13), this.A03, A13), (Object) null, A13), (Object) null, A13), this.A07, A13), this.A08, A13), (Object) null, A13), (Object) null);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamContactsUploadDownloadEvent {");
        AnonymousClass186.A00(C17900vP.A08(this.A00), "clientContactDecryptStatus", A10);
        AnonymousClass186.A00(this.A04, "contactsUploadDownloadEndT", A10);
        AnonymousClass186.A00(this.A05, "contactsUploadDownloadErrorCode", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "contactsUploadDownloadEventType", A10);
        AnonymousClass186.A00(this.A06, "contactsUploadDownloadStartT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), "contactsUploadDownloadStatus", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A03), "contactsUploadDownloadTrigger", A10);
        AnonymousClass186.A00(this.A07, "ncOnboardT", A10);
        return AnonymousClass184.A0S(this.A08, "numContacts", A10);
    }
}
