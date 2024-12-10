package X;

/* renamed from: X.4YK  reason: invalid class name */
public final class AnonymousClass4YK {
    public final AnonymousClass1BI A00;
    public final Boolean A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YK) {
                AnonymousClass4YK r5 = (AnonymousClass4YK) obj;
                if (this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return (((C72453Mb.A0E(num, A00(num)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17880vN.A02(this.A01);
    }

    public AnonymousClass4YK(AnonymousClass1BI r1, Boolean bool, Integer num) {
        this.A02 = num;
        this.A00 = r1;
        this.A01 = bool;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "SCREEN_SHARE_CLICKED";
            case 1:
                return "SEND_MESSAGE";
            case 2:
                return "PROMPT_UPGRADE_BEFORE_SCREEN_SHARE";
            case 3:
                return "SCREEN_SHARING_NOT_SUPPORTED";
            case 4:
                return "TURN_ON_VIDEO_TO_SCREEN_SHARE";
            case 5:
                return "SCREEN_SHARING_NOT_SUPPORTED_NO_CONNECTED_PEERS";
            case 6:
                return "E2EE_MESSAGE_CLICKED";
            case 7:
                return "SECURE_BUSINESS_MESSAGE_CLICKED";
            default:
                return "SCREEN_SHARING_NOT_AVAILABLE_FOR_GLASSES";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SideEffect(sideEffect=");
        A10.append(A00(this.A02));
        A10.append(", targetJid=");
        A10.append(this.A00);
        A10.append(", isVideoCall=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
