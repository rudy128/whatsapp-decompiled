package X;

import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2or  reason: invalid class name and case insensitive filesystem */
public abstract class C60942or {
    public static final Set A00;

    static {
        String[] strArr = new String[28];
        byte[] bArr = C26551So.A10;
        strArr[0] = "audio";
        strArr[1] = "image";
        strArr[2] = "video";
        strArr[3] = "ptv";
        strArr[4] = "kyc-id";
        strArr[5] = "sticker";
        strArr[6] = "document";
        strArr[7] = "ptt";
        strArr[8] = "gif";
        strArr[9] = "md-app-state";
        strArr[10] = "md-msg-hist";
        strArr[11] = "ppic";
        strArr[12] = "newsletter-image";
        strArr[13] = "newsletter-document";
        strArr[14] = "newsletter-video";
        strArr[15] = "newsletter-sticker";
        strArr[16] = "newsletter-sticker-pack";
        strArr[17] = "newsletter-audio";
        strArr[18] = "newsletter-ptt";
        strArr[19] = "newsletter-gif";
        strArr[20] = "newsletter-thumbnail-link";
        strArr[21] = "newsletter-thumbnail-sticker-pack";
        strArr[22] = "thumbnail-video";
        strArr[23] = "thumbnail-image";
        strArr[24] = "thumbnail-document";
        strArr[25] = "thumbnail-gif";
        strArr[26] = "thumbnail-link";
        A00 = C17900vP.A0I("thumbnail-sticker-pack", strArr, 27);
    }

    public static HashSet A00(C29621ca r6, Set set) {
        if (r6 == null) {
            return null;
        }
        HashSet A12 = C17880vN.A12();
        C29621ca[] r4 = r6.A02;
        if (r4 != null) {
            for (C29621ca r1 : r4) {
                if (set == null || set.contains(r1.A00)) {
                    A12.add(r1.A00);
                }
            }
        }
        return A12;
    }
}
