package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.2GS  reason: invalid class name */
public final class AnonymousClass2GS extends AnonymousClass184 {
    public Integer A00;
    public Integer A01;
    public Integer A02;
    public Long A03;
    public Long A04;
    public Long A05;
    public String A06;

    public AnonymousClass2GS() {
        super(3488, new C18180vt(1, 20, 20, false), 0, -1);
    }

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A03);
        r3.CHf(2, this.A00);
        r3.CHf(3, this.A04);
        r3.CHf(4, this.A01);
        r3.CHf(5, this.A05);
        r3.CHf(6, this.A02);
        r3.CHf(7, this.A06);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(AnonymousClass184.A09(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A06(AnonymousClass184.A05(AnonymousClass184.A04(C17880vN.A0h(), this.A03, A13), this.A00, A13), this.A04, A13), this.A01, A13), this.A05, A13), this.A02, A13), this.A06);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamKeepInChatPerf {");
        AnonymousClass186.A00(this.A03, "chatEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A00), "kicErrorCode", A10);
        AnonymousClass186.A00(this.A04, "kicMessageEphemeralityDuration", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A01), "kicRequestType", A10);
        AnonymousClass186.A00(this.A05, "requestSendTime", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A02), PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, A10);
        return AnonymousClass184.A0S(this.A06, "threadId", A10);
    }
}
