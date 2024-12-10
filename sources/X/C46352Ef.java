package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2Ef  reason: invalid class name and case insensitive filesystem */
public final class C46352Ef extends AnonymousClass184 {
    public Long A00;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A00);
    }

    public C46352Ef() {
        super(3178, new C18180vt(1, 1000, SearchActionVerificationClientService.NOTIFICATION_ID, false), 2, 37887164);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A00);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamClockSkewDifferenceT {");
        return AnonymousClass184.A0S(this.A00, "clockSkewHourly", A10);
    }
}
