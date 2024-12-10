package X;

/* renamed from: X.7Ke  reason: invalid class name and case insensitive filesystem */
public final class C145157Ke implements AnonymousClass8AC {
    public static final C145157Ke A05 = new C145157Ke(10, "ambiguous_delivery_destination", "There are multiple active OTP requests for the packages specified by this template, and we could not determine which package to deliver the code to.", true, true);
    public static final C145157Ke A06;
    public static final C145157Ke A07 = new C145157Ke(C17880vN.A0i(), "incorrect_signature_hash", "The signature hash of the installed app is %s, which does not match the signature hash declared in the one-tap template. Please update the template to reflect the correct signature hash", true, true);
    public static final C145157Ke A08 = new C145157Ke(0, "missing_handshake_or_disorder", "We received an OTP message but were unable to use one-tap as we did not receive the first part of the handshake.", false, true);
    public static final C145157Ke A09;
    public static final C145157Ke A0A;
    public static final C145157Ke A0B = new C145157Ke(1, "otp_request_expired", "Too much time elapsed between the OTP_REQUESTED intent and actual WhatsApp message delivery.", false, true);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C145157Ke) {
                C145157Ke r5 = (C145157Ke) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || this.A03 != r5.A03 || this.A04 != r5.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A00, (C17880vN.A03(this.A02) + C17900vP.A00(this.A01)) * 31), this.A03), this.A04);
    }

    static {
        Integer A0k = C17880vN.A0k();
        A06 = new C145157Ke(A0k, "incompatible_os_version", "The current Android version is < 19. one-tap is not supported due to missing platform features.", true, true);
        A0A = new C145157Ke(A0k, "no_retriever_button", (String) null, true, false);
        A09 = new C145157Ke(A0k, "no_package_name", (String) null, true, false);
    }

    public C145157Ke(Integer num, String str, String str2, boolean z, boolean z2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = num;
        this.A03 = z;
        this.A04 = z2;
    }

    public String BQI() {
        return this.A01;
    }

    public String BTj() {
        return this.A02;
    }

    public boolean BYy() {
        return this.A03;
    }

    public boolean BZD() {
        return this.A04;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OtpSecurityIneligibility(key=");
        A10.append(this.A02);
        A10.append(", debugMessage=");
        A10.append(this.A01);
        A10.append(", fallbackReason=");
        A10.append(this.A00);
        A10.append(", sendOnlyInEmulator=");
        A10.append(this.A03);
        A10.append(", shouldSendToThirdPartyApp=");
        return C17900vP.A0F(A10, this.A04);
    }
}
