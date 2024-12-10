package X;

import java.util.HashMap;
import java.util.Map;

public abstract class CHM {
    public static final Map A00;
    public static final Map A01;

    static {
        HashMap A11 = C17880vN.A11();
        A00 = A11;
        HashMap A112 = C17880vN.A11();
        A01 = A112;
        Integer A0Z = BE7.A0Z();
        A11.put(A0Z, "The Play Store app is either not installed or not the official version.");
        A11.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        Integer A0Y = BE7.A0Y();
        A11.put(A0Y, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        A112.put(A0Z, "PLAY_STORE_NOT_FOUND");
        A112.put(-2, "INVALID_REQUEST");
        A112.put(A0Y, "INTERNAL_ERROR");
    }
}
