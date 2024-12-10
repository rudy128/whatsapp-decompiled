package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.9Ea  reason: invalid class name and case insensitive filesystem */
public final class C178679Ea extends C20121A8g {
    public final C29621ca A00;
    public final List A01;
    public final List A02;

    public C178679Ea(UserJid userJid, UserJid userJid2, UserJid userJid3, UserJid userJid4, UserJid userJid5, String str, String str2, String str3, long j) {
        String[] strArr = new String[13];
        strArr[0] = "audio_record_fatal_error";
        strArr[1] = "crash";
        strArr[2] = "detect_identity_change";
        strArr[3] = "ended_by_peer";
        strArr[4] = "ended_by_self";
        strArr[5] = "ended_by_user";
        strArr[6] = "peer-interrupted";
        strArr[7] = "reconnecting";
        strArr[8] = "self-interrupted";
        strArr[9] = PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        strArr[10] = "unknown";
        strArr[11] = "video_decoder_fatal_error";
        List A0O = C18070vi.A0O("video_encoder_fatal_error", strArr, 12);
        this.A02 = A0O;
        String[] strArr2 = new String[2];
        strArr2[0] = "audio";
        List A0O2 = C18070vi.A0O("video", strArr2, 1);
        this.A01 = A0O2;
        C29591cX A0t = C108945cZ.A0t("call");
        AnonymousClass8BT.A1E(userJid, A0t, "to");
        AnonymousClass8BT.A1E(userJid2, A0t, "from");
        String str4 = str;
        AnonymousClass8BW.A1F(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, C29601cY.A04(str4, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t2 = C108945cZ.A0t("call_info");
        long j2 = j;
        if (C29601cY.A03(Long.valueOf(j2), 0, 9007199254740991L, false)) {
            C108965cb.A1I(A0t2, "duration", j2);
        }
        AnonymousClass8BT.A1E(userJid3, A0t2, "terminator");
        UserJid userJid6 = userJid4;
        if (userJid4 != null) {
            AnonymousClass8BT.A1E(userJid6, A0t2, "adder");
        }
        UserJid userJid7 = userJid5;
        if (userJid5 != null) {
            AnonymousClass8BT.A1E(userJid7, A0t2, "creator");
        }
        A0t2.A09(str2, "reason", A0O);
        A0t2.A08(str3, "mediatype", A0O2);
        this.A00 = C29591cX.A00(A0t2, A0t);
    }
}
