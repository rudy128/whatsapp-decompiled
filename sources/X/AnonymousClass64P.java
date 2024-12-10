package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.64P  reason: invalid class name */
public final class AnonymousClass64P extends AnonymousClass184 {
    public Boolean A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Long A0A;
    public Long A0B;
    public Long A0C;
    public Long A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public String A0K;
    public String A0L;

    public void serialize(C107425Zq r3) {
        C18070vi.A0d(r3, 0);
        r3.CHf(1, this.A0A);
        r3.CHf(12, this.A04);
        r3.CHf(2, this.A05);
        r3.CHf(3, this.A06);
        r3.CHf(13, this.A00);
        r3.CHf(14, this.A01);
        r3.CHf(15, this.A02);
        r3.CHf(11, this.A0B);
        r3.CHf(20, this.A0E);
        r3.CHf(5, this.A07);
        r3.CHf(6, this.A08);
        r3.CHf(16, this.A0F);
        r3.CHf(21, this.A0C);
        r3.CHf(23, this.A0G);
        r3.CHf(24, this.A03);
        r3.CHf(7, this.A09);
        r3.CHf(22, this.A0H);
        r3.CHf(8, this.A0I);
        r3.CHf(18, this.A0J);
        r3.CHf(17, this.A0K);
        r3.CHf(9, this.A0L);
        r3.CHf(25, this.A0D);
    }

    public AnonymousClass64P() {
        super(3468, AnonymousClass184.A02(), 2, 113760892);
    }

    public Map getFieldsMap() {
        LinkedHashMap A13 = C17880vN.A13();
        A13.put(C17880vN.A0h(), this.A0A);
        AnonymousClass184.A0X(A13, 19);
        A13.put(AnonymousClass184.A0B(AnonymousClass184.A0J(AnonymousClass184.A0K(AnonymousClass184.A0A(AnonymousClass184.A0O(AnonymousClass184.A09(AnonymousClass184.A0Q(AnonymousClass184.A0P(AnonymousClass184.A0N(AnonymousClass184.A0I(AnonymousClass184.A08(AnonymousClass184.A07(AnonymousClass184.A0M(AnonymousClass184.A0D(AnonymousClass184.A0H(AnonymousClass184.A0G(AnonymousClass184.A0F(C108975cc.A0T(C108975cc.A0S(C108955ca.A0h(), this.A04, A13), this.A05, A13), this.A06, A13), this.A00, A13), this.A01, A13), this.A02, A13), this.A0B, A13), this.A0E, A13), this.A07, A13), this.A08, A13), this.A0F, A13), this.A0C, A13), this.A0G, A13), this.A03, A13), this.A09, A13), this.A0H, A13), this.A0I, A13), this.A0J, A13), this.A0K, A13), this.A0L);
        AnonymousClass184.A0X(A13, 10);
        A13.put(25, this.A0D);
        return A13;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WamOtpRetriever {");
        AnonymousClass186.A00(this.A0A, "businessPhoneNumber", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A04), "chatsFolderType", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A05), "ctaFallbackReason", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A06), "ctaType", A10);
        AnonymousClass186.A00(this.A00, "isKeepChatsArchivedEnabled", A10);
        AnonymousClass186.A00(this.A01, "isMessageNotificationEnabled", A10);
        AnonymousClass186.A00(this.A02, "isNotificationEnabled", A10);
        AnonymousClass186.A00(this.A0B, "messageReceivedElapsedTimeSeconds", A10);
        AnonymousClass186.A00(this.A0E, "otpCorrelationId", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A07), "otpEventSource", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A08), "otpEventType", A10);
        AnonymousClass186.A00(this.A0F, "otpFailureReason", A10);
        AnonymousClass186.A00(this.A0C, "otpHandshakeElapsedTimeMs", A10);
        AnonymousClass186.A00(this.A0G, "otpHandshakeId", A10);
        AnonymousClass186.A00(this.A03, "otpMaskLinkedDevices", A10);
        AnonymousClass186.A00(C17900vP.A08(this.A09), "otpProductType", A10);
        AnonymousClass186.A00(this.A0H, "otpSdkVersion", A10);
        AnonymousClass186.A00(this.A0I, "otpSessionId", A10);
        AnonymousClass186.A00(this.A0J, "receiverCountryCode", A10);
        AnonymousClass186.A00(this.A0K, "templateId", A10);
        AnonymousClass186.A00(this.A0L, "thirdPartyPackageNameFromIntent", A10);
        return AnonymousClass184.A0S(this.A0D, "waDeviceId", A10);
    }
}
