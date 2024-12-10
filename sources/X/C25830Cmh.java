package X;

import android.content.SharedPreferences;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.Cmh  reason: case insensitive filesystem */
public final class C25830Cmh {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C27753DkZ(this));
    public final C19830z4 A02;
    public final C18030ve A03;

    private final C25819CmW A00(C25819CmW cmW) {
        C25819CmW cmW2 = cmW;
        if (!C18020vd.A05(C18040vf.A02, this.A03, 7122)) {
            return cmW2;
        }
        Boolean valueOf = Boolean.valueOf(C17890vO.A0B(this.A02).getBoolean("media_quality_tooltip_shown", false));
        long j = cmW2.A0F;
        long j2 = cmW2.A0I;
        long j3 = cmW2.A0E;
        long j4 = cmW2.A0G;
        long j5 = cmW2.A0H;
        return new C25819CmW(valueOf, j, j2, j3, j4, j5, cmW2.A0N, cmW2.A0Q, cmW2.A0M, cmW2.A0O, cmW2.A0P, cmW2.A01, cmW2.A02, cmW2.A03, cmW2.A07, cmW2.A06, cmW2.A08, cmW2.A00, cmW2.A0J, cmW2.A0K, cmW2.A0L, cmW2.A05, cmW2.A04, cmW2.A09, cmW2.A0B, cmW2.A0A, cmW2.A0C, cmW2.A0D);
    }

    public final C26030Cqo A01() {
        C26030Cqo A002;
        String string = ((SharedPreferences) this.A01.getValue()).getString("media_engagement_daily_received_key", (String) null);
        if (string == null || string.length() == 0 || (A002 = CDA.A00(string)) == null) {
            return new C26030Cqo(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        }
        return A002;
    }

    public final C25819CmW A02() {
        C25819CmW cmW;
        String string = ((SharedPreferences) this.A01.getValue()).getString("media_engagement_daily_sent_key", (String) null);
        if (string == null || string.length() == 0) {
            cmW = new C25819CmW((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        } else {
            cmW = CDB.A00(string);
            if (cmW == null) {
                cmW = new C25819CmW((Boolean) null, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
            }
        }
        return A00(cmW);
    }

    public final void A03(C26030Cqo cqo) {
        try {
            SharedPreferences.Editor A0A = C17890vO.A0A(this.A01);
            JSONObject A15 = C17880vN.A15();
            A15.put("numPhotoReceived", cqo.A0M);
            A15.put("numPhotoDownloaded", cqo.A0J);
            A15.put("numMidScan", cqo.A0L);
            A15.put("numPhotoFull", cqo.A0K);
            A15.put("numPhotoWifi", cqo.A0O);
            A15.put("numPhotoVoDownloaded", cqo.A0N);
            A15.put("numVideoReceived", cqo.A0Y);
            A15.put("numVideoDownloaded", cqo.A0U);
            A15.put("numVideoDownloadedLte", cqo.A0V);
            A15.put("numVideoDownloadedWifi", cqo.A0W);
            A15.put("numVideoHdDownloaded", cqo.A0X);
            A15.put("numVideoVoDownloaded", cqo.A0Z);
            A15.put("numDocsReceived", cqo.A05);
            A15.put("numDocsDownloaded", cqo.A02);
            A15.put("numLargeDocsReceived", cqo.A08);
            A15.put("numDocsDownloadedLte", cqo.A03);
            A15.put("numDocsDownloadedWifi", cqo.A04);
            A15.put("numMediaAsDocsDownloaded", cqo.A09);
            A15.put("numAudioReceived", cqo.A01);
            A15.put("numAudioDownloaded", cqo.A00);
            A15.put("numGifDownloaded", cqo.A06);
            A15.put("numInlinePlayedVideo", cqo.A07);
            A15.put("numUrlReceived", cqo.A0T);
            A15.put("numMediaChatDownloaded", cqo.A0A);
            A15.put("numMediaChatReceived", cqo.A0B);
            A15.put("numMediaCommunityDownloaded", cqo.A0C);
            A15.put("numMediaCommunityReceived", cqo.A0D);
            A15.put("numMediaGroupDownloaded", cqo.A0F);
            A15.put("numMediaGroupReceived", cqo.A0G);
            A15.put("numMediaStatusDownloaded", cqo.A0H);
            A15.put("numMediaStatusReceived", cqo.A0I);
            A15.put("numMediaDownloadFailed", cqo.A0E);
            A15.put("numStickerPackDownloaded", cqo.A0Q);
            A15.put("numStickerPackReceived", cqo.A0R);
            A15.put("numStickerDownloaded", cqo.A0P);
            A15.put("numStickerReceived", cqo.A0S);
            C17880vN.A1E(A0A, "media_engagement_daily_received_key", C18070vi.A0H(A15));
        } catch (JSONException e) {
            e.getMessage();
        }
    }

    public C25830Cmh(C19830z4 r2, C18030ve r3, C18010vc r4) {
        C18070vi.A0o(r4, r3, r2);
        this.A00 = r4;
        this.A03 = r3;
        this.A02 = r2;
    }

    public final void A04(C25819CmW cmW) {
        try {
            C25819CmW A002 = A00(cmW);
            SharedPreferences.Editor A0A = C17890vO.A0A(this.A01);
            JSONObject A15 = C17880vN.A15();
            A15.put("numPhotoSent", A002.A0F);
            A15.put("numPhotoHdSent", A002.A0E);
            A15.put("numPhotoVoSent", A002.A0I);
            A15.put("numPhotoSentLte", A002.A0G);
            A15.put("numPhotoSentWifi", A002.A0H);
            A15.put("numVideoSent", A002.A0N);
            A15.put("numVideoHdSent", A002.A0M);
            A15.put("numVideoVoSent", A002.A0Q);
            A15.put("numVideoSentLte", A002.A0O);
            A15.put("numVideoSentWifi", A002.A0P);
            A15.put("numDocsSent", A002.A01);
            A15.put("numDocsSentLte", A002.A02);
            A15.put("numDocsSentWifi", A002.A03);
            A15.put("numLargeDocsSent", A002.A07);
            A15.put("numLargeDocsNonWifi", A002.A06);
            A15.put("numMediaSentAsDocs", A002.A08);
            A15.put("numAudioSent", A002.A00);
            A15.put("numSticker", A002.A0J);
            A15.put("numStickerPack", A002.A0K);
            A15.put("numUrl", A002.A0L);
            A15.put("numGifSent", A002.A05);
            A15.put("numExternalShare", A002.A04);
            A15.put("numMediaSentChat", A002.A09);
            A15.put("numMediaSentGroup", A002.A0B);
            A15.put("numMediaSentCommunity", A002.A0A);
            A15.put("numMediaSentStatus", A002.A0C);
            A15.put("numMediaUploadFailed", A002.A0D);
            Boolean bool = A002.A0R;
            if (bool != null) {
                A15.put("hdMediaTooltipSeen", bool.booleanValue());
            }
            C17880vN.A1E(A0A, "media_engagement_daily_sent_key", C18070vi.A0H(A15));
        } catch (JSONException e) {
            e.getMessage();
        }
    }
}
