package X;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class CDA {
    public static final C26030Cqo A00(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject A16 = C17880vN.A16(str);
            return new C26030Cqo(A16.optLong("numPhotoReceived"), A16.optLong("numPhotoDownloaded"), A16.optLong("numMidScan"), A16.optLong("numPhotoFull"), A16.optLong("numPhotoWifi"), A16.optLong("numPhotoVoDownloaded"), A16.optLong("numVideoReceived"), A16.optLong("numVideoDownloaded"), A16.optLong("numVideoDownloadedLte"), A16.optLong("numVideoDownloadedWifi"), A16.optLong("numVideoHdDownloaded"), A16.optLong("numVideoVoDownloaded"), A16.optLong("numDocsReceived"), A16.optLong("numDocsDownloaded"), A16.optLong("numLargeDocsReceived"), A16.optLong("numDocsDownloadedLte"), A16.optLong("numDocsDownloadedWifi"), A16.optLong("numMediaAsDocsDownloaded"), A16.optLong("numAudioReceived"), A16.optLong("numAudioDownloaded"), A16.optLong("numGifDownloaded"), A16.optLong("numInlinePlayedVideo"), A16.optLong("numUrlReceived"), A16.optLong("numMediaChatDownloaded"), A16.optLong("numMediaChatReceived"), A16.optLong("numMediaCommunityDownloaded"), A16.optLong("numMediaCommunityReceived"), A16.optLong("numMediaGroupDownloaded"), A16.optLong("numMediaGroupReceived"), A16.optLong("numMediaStatusDownloaded"), A16.optLong("numMediaStatusReceived"), A16.optLong("numMediaDownloadFailed"), A16.optLong("numStickerPackDownloaded"), A16.optLong("numStickerPackReceived"), A16.optLong("numStickerDownloaded"), A16.optLong("numStickerReceived"));
        } catch (JSONException e) {
            e.getMessage();
            return null;
        }
    }
}
