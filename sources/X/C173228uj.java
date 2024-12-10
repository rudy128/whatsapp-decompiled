package X;

import com.whatsapp.infra.graphql.generated.account_sync.AccountSyncUsernameNotificationResponseImpl;
import com.whatsapp.infra.graphql.generated.account_sync.UserNameFieldImpl;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.8uj  reason: invalid class name and case insensitive filesystem */
public final class C173228uj extends AnonymousClass2SE implements B9U {
    public final AnonymousClass11S A00;
    public final C21077Ae7 A01;

    public void C3i(C180429Mm r6) {
        AnonymousClass11S r1;
        String str;
        if (r6 instanceof AnonymousClass9AN) {
            r1 = this.A00;
            str = ((AnonymousClass9AN) r6).A00;
        } else if (r6 instanceof AnonymousClass9AO) {
            if (((AnonymousClass9AO) r6).A00 == 404) {
                r1 = this.A00;
                str = "";
            } else {
                return;
            }
        } else if (!C18070vi.A18(r6, AnonymousClass9AP.A00)) {
            throw AnonymousClass3MW.A14();
        } else {
            return;
        }
        r1.A0K(str);
    }

    public C173228uj(AnonymousClass11S r1, C21077Ae7 ae7) {
        C18070vi.A0j(r1, ae7);
        this.A00 = r1;
        this.A01 = ae7;
    }

    public Class A00() {
        return AccountSyncUsernameNotificationResponseImpl.class;
    }

    public String A01() {
        return "AccountSyncUsernameNotification";
    }

    public void A02(C172768tz r6) {
        AnonymousClass1E2 r0;
        C20125A8k A09 = C199129zU.A00(r6).A09(AccountSyncUsernameNotificationResponseImpl.Xwa2NotifyWaUser.class, "xwa2_notify_wa_user");
        AnonymousClass11S r3 = this.A00;
        String A0F = A09.A0F("lid_jid");
        try {
            C42501yH r02 = AnonymousClass1E2.A01;
            r0 = C42501yH.A00(A0F);
        } catch (Throwable th) {
            Log.e(C17900vP.A0C("Failed to parse LidUserJid due to: ", AnonymousClass000.A10(), th), th);
            r0 = null;
        }
        if (r3.A0O(r0)) {
            C20125A8k A092 = new C20125A8k(A09.A00).A09(UserNameFieldImpl.UsernameInfo.class, "username_info");
            if (A092 != null) {
                JSONObject jSONObject = A092.A00;
                if (AnonymousClass8BT.A03(jSONObject) == 785443910) {
                    String A0F2 = new C20125A8k(jSONObject).A0F("username");
                    if (A0F2 == null) {
                        A0F2 = "";
                    }
                    r3.A0K(A0F2);
                    return;
                }
            }
            this.A01.Bb8(this);
        }
    }
}
