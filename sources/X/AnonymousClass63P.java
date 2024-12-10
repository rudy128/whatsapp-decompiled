package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.63P  reason: invalid class name */
public final class AnonymousClass63P extends AnonymousClass184 {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public AnonymousClass63P() {
        super(3982, new C18180vt(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 2, 0);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(5, this.A00);
        r3.CHf(1, this.A01);
        r3.CHf(2, this.A02);
        r3.CHf(3, this.A03);
        r3.CHf(4, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A06(C108975cc.A0T(C108975cc.A0S(AnonymousClass184.A03(C17880vN.A0l(), this.A00, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamXappCommunicationDetection {");
        AnonymousClass186.A00(this.A00, "buildId", A10);
        AnonymousClass186.A00(this.A01, "uriAuthority", A10);
        AnonymousClass186.A00(this.A02, "xappCommunicationOperation", A10);
        AnonymousClass186.A00(this.A03, "xappCommunicationScope", A10);
        return AnonymousClass184.A0S(this.A04, "xappContext", A10);
    }
}
