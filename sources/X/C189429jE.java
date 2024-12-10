package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import org.json.JSONException;

/* renamed from: X.9jE  reason: invalid class name and case insensitive filesystem */
public class C189429jE {
    public final AnonymousClass1R0 A00;

    public AnonymousClass210 A00(AnonymousClass121 r10, C166418cr r11, AnonymousClass205 r12, long j) {
        String str;
        C20285AEt A0g;
        C20277AEk aEk;
        String str2;
        int i = r11.bitField1_;
        if ((i & 8) != 0) {
            C166398cp r0 = r11.interactiveMessage_;
            if (r0 == null) {
                r0 = C166398cp.DEFAULT_INSTANCE;
            }
            C164018Xf r02 = r0.body_;
            if (r02 == null) {
                r02 = C164018Xf.DEFAULT_INSTANCE;
            }
            str = r02.text_;
        } else if ((i & 1) != 0) {
            C165858bs r03 = r11.buttonsMessage_;
            if (r03 == null) {
                r03 = C165858bs.DEFAULT_INSTANCE;
            }
            str = r03.contentText_;
        } else {
            Log.e("MessageWithLinkStatusFactory/buildMessageWithLinkStatusMessage e2eMessage is not InteractiveMessage or ButtonsMessage");
            str = "";
        }
        AnonymousClass210 A0R = AnonymousClass8BX.A0R(r12, str, j);
        AnonymousClass1BI r3 = r12.A00;
        C17960vV.A07(r3);
        try {
            String A06 = A8o.A06(r11);
            if (A06 != null) {
                String optString = C17880vN.A16(A06).optString("reference_id");
                if (!AnonymousClass1EG.A0H(optString)) {
                    try {
                        Iterator it = C26021Qn.A00(((AnonymousClass122) r10).A0W, r3, 6).iterator();
                        while (it.hasNext()) {
                            AnonymousClass206 A0Y = C17880vN.A0Y(it);
                            if ((A0Y instanceof AnonymousClass21K) && (A0g = AnonymousClass8BR.A0g(A0Y)) != null && (aEk = A0g.A06) != null && aEk.A03.size() > 0) {
                                C20253ADl aDl = (C20253ADl) C108955ca.A0p(A0g.A06.A03);
                                C20271AEe aEe = aDl.A01;
                                if ("open_webview".equals(aEe.A02) && (str2 = aEe.A00) != null && optString.equals(C17880vN.A16(str2).optString("reference_id"))) {
                                    aDl.A00 = true;
                                    this.A00.A00(A0R, A0Y);
                                    r10.CQw(A0Y);
                                }
                            }
                        }
                    } catch (JSONException unused) {
                        Log.e("MessageWithLinkStatusFactory/updateMessageWithLinkMessageStatus can't parse button's paramsJson correctly");
                        return A0R;
                    }
                }
            }
        } catch (JSONException unused2) {
            Log.e("MessageWithLinkStatusFactory/buildMessageWithLinkStatusMessage can't parse json string");
        }
        return A0R;
    }

    public C189429jE(AnonymousClass1R0 r1) {
        this.A00 = r1;
    }
}
