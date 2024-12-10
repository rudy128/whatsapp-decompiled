package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2G1  reason: invalid class name */
public final class AnonymousClass2G1 extends AnonymousClass184 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public AnonymousClass2G1() {
        super(1684, AnonymousClass184.A01(), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A01);
        r3.CHf(7, this.A02);
        r3.CHf(5, this.A03);
        r3.CHf(1, this.A04);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A03(AnonymousClass184.A07(AnonymousClass184.A09(AnonymousClass184.A05(AnonymousClass184.A08(AnonymousClass184.A0A(C17880vN.A0i(), this.A00, A13), (Object) null, A13), (Object) null, A13), this.A01, A13), this.A02, A13), this.A03, A13), this.A04);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamCriticalEvent {");
        AnonymousClass186.A00(this.A00, "context", A10);
        AnonymousClass186.A00(this.A01, "debug", A10);
        AnonymousClass186.A00(this.A02, "extraDebug", A10);
        AnonymousClass186.A00(this.A03, "mobileBuildId", A10);
        return AnonymousClass184.A0S(this.A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A10);
    }
}
