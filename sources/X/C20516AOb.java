package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import javax.crypto.SecretKey;
import org.json.JSONObject;

/* renamed from: X.AOb  reason: case insensitive filesystem */
public final class C20516AOb implements C22537BBu {
    public final C189299ir A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass122 A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08 = C217517g.A00(32870);
    public final AnonymousClass00H A09;

    public String BOU(Activity activity) {
        Bundle extras;
        String string;
        C18070vi.A0d(activity, 0);
        Intent intent = activity.getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (string = extras.getString("chat_id")) != null && string.length() != 0) {
            return string;
        }
        Jid jid = (Jid) ((AnonymousClass9XH) this.A08.get()).A00.get("chat_jid");
        if (jid != null) {
            return jid.getRawString();
        }
        return null;
    }

    public String BV6(Activity activity) {
        Bundle extras;
        String string;
        C18070vi.A0d(activity, 0);
        Intent intent = activity.getIntent();
        if (intent == null || (extras = intent.getExtras()) == null || (string = extras.getString("message_id")) == null || string.length() == 0) {
            return C108945cZ.A1G("key_msg_id", ((AnonymousClass9XH) this.A08.get()).A00);
        }
        return string;
    }

    public void CHT(Activity activity, C190469kz r34, Map map) {
        Intent intent;
        Bundle extras;
        boolean z;
        boolean z2;
        Activity activity2 = activity;
        if (activity != null && (intent = activity2.getIntent()) != null && (extras = intent.getExtras()) != null) {
            String string = extras.getString("chat_id");
            UserJid A022 = C22941Dw.A02(string);
            String string2 = extras.getString("flow_token");
            String string3 = extras.getString("flow_message_version");
            this.A05.get();
            SecretKey A0q = AnonymousClass8BX.A0q();
            byte[] A1a = AnonymousClass8BV.A1a(16);
            C18070vi.A0b(A0q);
            C18070vi.A0d(A0q, 1);
            String string4 = extras.getString("user_locale");
            String string5 = extras.getString("flow_id");
            if (string3 != null && string != null && A022 != null && string2 != null && string4 != null) {
                Map map2 = map;
                if (map != null && string5 != null) {
                    map2.put("flow_token", string2);
                    C18030ve r1 = this.A03;
                    if (!C18020vd.A05(C18040vf.A02, r1, 5374) || "100".equalsIgnoreCase(AnonymousClass8BX.A0e("version", map2))) {
                        map2.put("user_locale", string4);
                    }
                    if (map2.containsKey("show_loading")) {
                        z = AnonymousClass000.A1Y(AnonymousClass8BS.A0X("show_loading", "null cannot be cast to non-null type kotlin.Boolean", map2));
                    } else {
                        z = false;
                    }
                    if (map2.containsKey("show_full_screen_error")) {
                        z2 = AnonymousClass000.A1Y(AnonymousClass8BS.A0X("show_full_screen_error", "null cannot be cast to non-null type kotlin.Boolean", map2));
                    } else {
                        z2 = false;
                    }
                    map2.remove("show_loading");
                    map2.remove("show_full_screen_error");
                    ((B9Z) activity2).CL9(z);
                    JSONObject jSONObject = new JSONObject(map2);
                    C195229t0 r11 = new C195229t0(string5, string3, C18070vi.A0H(jSONObject), A0q, A1a);
                    AnonymousClass00H r8 = this.A07;
                    C189299ir r112 = this.A00;
                    AnonymousClass1KB r12 = this.A01;
                    AnonymousClass10I r7 = this.A04;
                    C190469kz r13 = r34;
                    C192049ng r21 = (C192049ng) C18070vi.A0E(r8);
                    r21.A01(new AS6(activity2, r112, r12, r13, (A25) C18070vi.A0E(this.A09), this.A02, r1, r11, (C192049ng) C18070vi.A0E(r8), (AnonymousClass1W6) C18070vi.A0E(this.A06), r7, true, z2), A022, C18070vi.A0H(jSONObject), string3, "UNKNOWN", A0q, A1a, false, false, false);
                }
            }
        }
    }

    public C20516AOb(C189299ir r2, AnonymousClass1KB r3, AnonymousClass122 r4, C18030ve r5, AnonymousClass10I r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r6, r4, r7, r3, r2);
        C18070vi.A0q(r8, r5, r9);
        C18070vi.A0d(r10, 9);
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = r7;
        this.A01 = r3;
        this.A00 = r2;
        this.A07 = r8;
        this.A03 = r5;
        this.A09 = r9;
        this.A05 = r10;
    }
}
