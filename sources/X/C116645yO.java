package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import org.json.JSONObject;

/* renamed from: X.5yO  reason: invalid class name and case insensitive filesystem */
public final class C116645yO extends C196289ul {
    public final AnonymousClass00H A00;
    public final AnonymousClass1LU A01;
    public final A19 A02;

    public void A0A(Activity activity, AnonymousClass5XY r19, AnonymousClass206 r20, C20271AEe aEe, int i) {
        JSONObject optJSONObject;
        Intent A07;
        Activity activity2 = activity;
        C18070vi.A0d(activity2, 0);
        AnonymousClass206 r4 = r20;
        C20271AEe aEe2 = aEe;
        C18070vi.A0k(r4, aEe2);
        A19 a19 = this.A02;
        AnonymousClass205 r3 = r4.A0v;
        AnonymousClass1BI r6 = r3.A00;
        a19.A01(r6, "link_to_webview", (String) null, 0, 4);
        UserJid A0I = r4.A0I();
        if (A0I != null) {
            ((A5M) this.A00.get()).A02(A0I, r4, 0);
        }
        String str = aEe2.A00;
        String str2 = null;
        if (str == null || (optJSONObject = C17880vN.A16(str).optJSONObject("link")) == null) {
            Log.e("CheckoutFromLinkAction/execute: unsupported link type");
            return;
        }
        if (optJSONObject.optBoolean("in_app_webview")) {
            A07 = AnonymousClass1LU.A1f(activity2, optJSONObject.getString("url"), optJSONObject.optString("success_url"), optJSONObject.optString("cancel_url"), AnonymousClass001.A1I(r3.A01, AnonymousClass000.A10(), i), false);
            A07.putExtra("message_cta_type", "link_to_webview");
            if (r6 != null) {
                str2 = r6.getRawString();
            }
            A07.putExtra("webview_receiver_jid", str2);
        } else {
            A07 = AnonymousClass3MY.A07(Uri.parse(optJSONObject.getString("url")));
        }
        activity2.startActivity(A07);
    }

    public void A0B(Activity activity, AnonymousClass5XY r2, AnonymousClass206 r3, C20271AEe aEe, Class cls) {
        C18070vi.A0d(activity, 0);
        C18070vi.A0j(aEe, r3);
        A0A(activity, r2, r3, aEe, 0);
    }

    public boolean A0F(C18030ve r3, C166418cr r4) {
        C18070vi.A0d(r3, 1);
        return !C18020vd.A05(C18040vf.A02, r3, 3051);
    }

    public String A08(Context context, C20285AEt aEt, C20271AEe aEe) {
        String str;
        if (aEe == null || (str = aEe.A00) == null) {
            return null;
        }
        return A6n.A02("title", C17880vN.A16(str));
    }

    public C116645yO(AnonymousClass1LU r1, A19 a19, AnonymousClass00H r3) {
        C18070vi.A0o(a19, r3, r1);
        this.A02 = a19;
        this.A00 = r3;
        this.A01 = r1;
    }

    public int A04() {
        return 2131232150;
    }

    public String A07() {
        return "open_webview";
    }
}
