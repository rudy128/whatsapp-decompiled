package X;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class CDB {
    public static final C25819CmW A00(String str) {
        Boolean bool;
        if (str == null) {
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(str);
            long optLong = A16.optLong("numPhotoSent");
            long optLong2 = A16.optLong("numPhotoHdSent");
            long optLong3 = A16.optLong("numPhotoVoSent");
            long optLong4 = A16.optLong("numPhotoSentLte");
            long optLong5 = A16.optLong("numPhotoSentWifi");
            long optLong6 = A16.optLong("numVideoSent");
            long optLong7 = A16.optLong("numVideoHdSent");
            long optLong8 = A16.optLong("numVideoVoSent");
            long optLong9 = A16.optLong("numVideoSentLte");
            long optLong10 = A16.optLong("numVideoSentWifi");
            long optLong11 = A16.optLong("numDocsSent");
            long optLong12 = A16.optLong("numDocsSentLte");
            long optLong13 = A16.optLong("numDocsSentWifi");
            long optLong14 = A16.optLong("numLargeDocsSent");
            long optLong15 = A16.optLong("numLargeDocsNonWifi");
            long optLong16 = A16.optLong("numMediaSentAsDocs");
            long optLong17 = A16.optLong("numAudioSent");
            long optLong18 = A16.optLong("numSticker");
            long optLong19 = A16.optLong("numStickerPack");
            long optLong20 = A16.optLong("numUrl");
            long optLong21 = A16.optLong("numGifSent");
            long optLong22 = A16.optLong("numExternalShare");
            long optLong23 = A16.optLong("numMediaSentChat");
            long optLong24 = A16.optLong("numMediaSentGroup");
            long optLong25 = A16.optLong("numMediaSentCommunity");
            long optLong26 = A16.optLong("numMediaSentStatus");
            long optLong27 = A16.optLong("numMediaUploadFailed");
            if (A16.has("hdMediaTooltipSeen")) {
                bool = Boolean.valueOf(A16.getBoolean("hdMediaTooltipSeen"));
            } else {
                bool = null;
            }
            return new C25819CmW(bool, optLong, optLong3, optLong2, optLong4, optLong5, optLong6, optLong8, optLong7, optLong9, optLong10, optLong11, optLong12, optLong13, optLong14, optLong15, optLong16, optLong17, optLong18, optLong19, optLong20, optLong21, optLong22, optLong23, optLong24, optLong25, optLong26, optLong27);
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }
}
