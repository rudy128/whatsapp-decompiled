package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.BTg  reason: case insensitive filesystem */
public final class C22872BTg extends C3J {
    public final long A00;
    public final Integer A01;
    public final Map A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C22872BTg) {
                C22872BTg bTg = (C22872BTg) obj;
                if (!(this.A01 == bTg.A01 && this.A00 == bTg.A00 && C18070vi.A18(this.A02, bTg.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A01;
        return AnonymousClass000.A0O(this.A02, AnonymousClass001.A0K(this.A00, C72453Mb.A0E(num, A00(num)) * 31));
    }

    public /* synthetic */ C22872BTg(Integer num, long j) {
        LinkedHashMap A13 = C17880vN.A13();
        this.A01 = num;
        this.A00 = j;
        this.A02 = A13;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PHONE_SCREEN_OFF";
            case 2:
                return "STREAM_STARTING";
            case 3:
                return "STREAM_STARTED";
            case 4:
                return "STREAM_PAUSE";
            case 5:
                return "STREAM_RESUME";
            case 6:
                return "STREAM_ENDS";
            case 7:
                return "STREAM_ERROR";
            case 8:
                return "TOGGLE_TO_PHONE";
            case 9:
                return "TOGGLE_TO_SG";
            case 10:
                return "PHONE_SCREEN_ON";
            case 11:
                return "PROMPT_DOUBLE_CAPTURE_PRESS";
            case 12:
                return "STREAM_ENDING";
            case 13:
                return "TOGGLE_TO_SG_PRE_LIVE";
            case 14:
                return "TOGGLE_TO_SG_WHILE_LIVE";
            case 15:
                return "STREAM_BROADCASTING";
            case 16:
                return "PHONE_VIDEO_OFF";
            case 17:
                return "PHONE_SCREEN_OFF_PRE_LIVE";
            case 18:
                return "PROMPT_PHONE_VIDEO_OFF_ERROR";
            case 19:
                return "PROMPT_GENERIC_ERROR";
            case 20:
                return "PROMPT_VIDEO_CAPTURE_USER_ED";
            case 21:
                return "PROMPT_PHOTO_CAPTURE_USER_ED";
            case 22:
                return "PHOTO_CAPTURED";
            case 23:
                return "PROMPT_PREVIEWING_FROM_GLASSES";
            case 24:
                return "PROMPT_SWITCH_TO_GLASSES_CAPTURE_USER_ED";
            default:
                return "PROMPT_ENABLE_PERMISSIONS_ERROR";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LifeCycleEvent(type=");
        A10.append(A00(this.A01));
        A10.append(", timestamp=");
        A10.append(this.A00);
        A10.append(", metadata=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
