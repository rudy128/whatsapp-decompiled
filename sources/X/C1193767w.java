package X;

import com.whatsapp.infra.graphql.generated.textstatus.TextStatusUpdateNotificationResponseImpl;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.67w  reason: invalid class name and case insensitive filesystem */
public final class C1193767w extends AnonymousClass2SE {
    public final AnonymousClass1M9 A00;
    public final C24751Ln A01;
    public final C18030ve A02;

    public void A02(C172768tz r11) {
        String str;
        C18070vi.A0d(r11, 0);
        if (C18020vd.A05(C18040vf.A02, this.A02, 4921)) {
            C20125A8k A0I = C108985cd.A0I(r11.A00, TextStatusUpdateNotificationResponseImpl.Xwa2NotifyTextStatusOnUpdate.class, "xwa2_notify_text_status_on_update");
            C22941Dw r2 = UserJid.Companion;
            JSONObject jSONObject = A0I.A00;
            UserJid A04 = r2.A04(C108955ca.A11("jid", jSONObject));
            if (A04 == null) {
                Log.e("Null JID in TS updated notification");
            } else if (!C22971Dz.A0T(A04) || (A04 = this.A01.A0D((AnonymousClass1E1) A04)) != null) {
                long A06 = C109005cf.A06(jSONObject);
                AnonymousClass1M9 r4 = this.A00;
                String A0F = A0I.A0F("text");
                C20125A8k A09 = A0I.A09(TextStatusUpdateNotificationResponseImpl.Xwa2NotifyTextStatusOnUpdate.Emoji.class, "emoji");
                if (A09 != null) {
                    str = C72453Mb.A0z(A09, "content");
                } else {
                    str = "";
                }
                r4.A0k(A04, A0F, str, A06);
            }
        }
    }

    public C1193767w(AnonymousClass1M9 r1, C24751Ln r2, C18030ve r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public Class A00() {
        return TextStatusUpdateNotificationResponseImpl.class;
    }

    public String A01() {
        return "TextStatusUpdateNotification";
    }
}
