package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2FQ  reason: invalid class name */
public final class AnonymousClass2FQ extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Long A02;

    public AnonymousClass2FQ() {
        super(2170, new C18180vt(1, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A02);
        r3.CHf(3, this.A00);
        r3.CHf(2, this.A01);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        AnonymousClass184.A0X(A13, 11);
        A13.put(C17880vN.A0h(), this.A02);
        AnonymousClass184.A0X(A13, 9);
        A13.put(AnonymousClass184.A04(AnonymousClass184.A0A(AnonymousClass184.A06(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A08(C17880vN.A0j(), this.A00, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), (Object) null, A13), this.A01);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamAndroidMessageTargetPerf {");
        AnonymousClass186.A00(this.A02, "durationReceiptT", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "mediaType", A10);
        return AnonymousClass184.A0S(C17900vP.A08(this.A01), "targetStage", A10);
    }
}
