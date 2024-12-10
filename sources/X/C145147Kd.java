package X;

/* renamed from: X.7Kd  reason: invalid class name and case insensitive filesystem */
public final class C145147Kd implements AnonymousClass8AC {
    public static final C145147Kd A02 = new C145147Kd("whatsapp_message_notification_disabled", "We received an OTP message, but were unable to show the OTP notification as you disabled WhatsApp notifications in the WhatsApp settings. Please un-mute the chat in the chat screen");
    public static final C145147Kd A03 = new C145147Kd("whatsapp_notification_disabled", "We received an OTP message, but were unable to show the OTP notification as you disabled WhatsApp notifications. Please turn it on in device settings");
    public static final C145147Kd A04 = new C145147Kd("zero_tap_unavailable", "Zero-tap is not yet available in this version of WhatsApp. Message will be delivered one-tap. Please update to the newest version of WhatsApp to test zero-tap");
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C145147Kd) {
                C145147Kd r5 = (C145147Kd) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C17890vO.A02(this.A00, C17880vN.A03(this.A01)) * 31) + 1231) * 31) + 1231;
    }

    public C145147Kd(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String BQI() {
        return this.A00;
    }

    public String BTj() {
        return this.A01;
    }

    public boolean BYy() {
        return true;
    }

    public boolean BZD() {
        return true;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OtpEligibilityWarning(key=");
        A10.append(this.A01);
        A10.append(", debugMessage=");
        A10.append(this.A00);
        AnonymousClass000.A1G(A10, ", fallbackReason=");
        C108975cc.A16(A10, ", sendOnlyInEmulator=");
        A10.append(", shouldSendToThirdPartyApp=");
        return C17900vP.A0F(A10, true);
    }
}
