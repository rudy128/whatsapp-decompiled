package X;

import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.4Xd  reason: invalid class name and case insensitive filesystem */
public final class C87814Xd {
    public static final C87814Xd A0e = new C87814Xd((AnonymousClass4DN) null, (AnonymousClass4UE) null, (C87074Ue) null, (AnonymousClass1E2) null, (UserJid) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ArrayList) null, (List) null, (JSONObject) null, false, false, false, false, false, false, false, false);
    public final AnonymousClass4DN A00;
    public final AnonymousClass4UE A01;
    public final C87074Ue A02;
    public final AnonymousClass1E2 A03;
    public final UserJid A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final ArrayList A0T;
    public final List A0U;
    public final JSONObject A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;

    public final Bundle A00() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        byte[] bArr;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putString("data", this.A0F);
        A0D2.putString("source", this.A0O);
        A0D2.putString("entry_point", this.A0G);
        A0D2.putBoolean("has_ib", this.A0Z);
        A0D2.putBoolean("has_wm", this.A0a);
        A0D2.putBoolean("ads_logging_requires_tos", this.A0W);
        A0D2.putBoolean("show_ad_attribution", this.A0b);
        A0D2.putBoolean("show_keyboard", this.A0d);
        A0D2.putBoolean("auto_greeting_msg", this.A0c);
        String str9 = this.A09;
        A0D2.putString("auto_greeting_msg_cta_type", str9);
        A0D2.putString("auto_greeting_msg_cta_payload", this.A08);
        A0D2.putString("icebreaker", this.A0I);
        A0D2.putString("ctwa_context", this.A0D);
        A0D2.putString("source_url", this.A0R);
        UserJid userJid = this.A04;
        String str10 = null;
        if (userJid != null) {
            str = userJid.getRawString();
        } else {
            str = null;
        }
        A0D2.putString("jid", str);
        AnonymousClass1E2 r0 = this.A03;
        if (r0 != null) {
            str2 = r0.getRawString();
        } else {
            str2 = null;
        }
        A0D2.putString("lid", str2);
        A0D2.putString("productId", this.A0K);
        A0D2.putString("land_on_whatsapp_catalog", this.A0J);
        A0D2.putString("categoryId", this.A0B);
        JSONObject jSONObject = this.A0V;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        } else {
            str3 = null;
        }
        A0D2.putString("banner", str3);
        List list = this.A0U;
        if (list != null) {
            List<AnonymousClass4DT> A0q = C29431cG.A0q(list);
            ArrayList A0D3 = C29351c6.A0D(A0q);
            for (AnonymousClass4DT r02 : A0q) {
                A0D3.add(r02.label);
            }
            A0D2.putStringArrayList("client_filters", C17880vN.A10(A0D3));
        }
        A0D2.putString("ctwa_context_override_phone_number", this.A0E);
        A0D2.putBoolean("always_show_ad_attribution", this.A0X);
        AnonymousClass4UE r5 = this.A01;
        if (r5 != null) {
            str4 = r5.A00;
        } else {
            str4 = null;
        }
        A0D2.putString("flow_cta", str4);
        if (r5 != null) {
            str5 = r5.A02;
        } else {
            str5 = null;
        }
        A0D2.putString("flow_id", str5);
        if (r5 != null) {
            str6 = r5.A01;
        } else {
            str6 = null;
        }
        A0D2.putString("flow_first_screen", str6);
        A0D2.putString("source_id_override", this.A0Q);
        AnonymousClass4DN r03 = this.A00;
        if (r03 != null) {
            A0D2.putInt("consumer_disclosure_variant", r03.value);
        }
        A0D2.putString("headline", this.A0H);
        A0D2.putString("body", this.A0A);
        A0D2.putString("app", this.A07);
        A0D2.putString("source_id", this.A0P);
        A0D2.putString("referral_parameter", this.A0M);
        A0D2.putString("welcome_message", this.A0S);
        A0D2.putString("ctwa_clid", this.A0C);
        C87074Ue r52 = this.A02;
        if (r52 != null) {
            str7 = r52.A02;
        } else {
            str7 = null;
        }
        A0D2.putString("video_url", str7);
        if (r52 != null) {
            str8 = r52.A01;
        } else {
            str8 = null;
        }
        A0D2.putString("thumbnail_url", str8);
        if (r52 != null) {
            bArr = r52.A03;
        } else {
            bArr = null;
        }
        A0D2.putByteArray("thumbnail_data", bArr);
        if (r52 != null) {
            str10 = r52.A00;
        }
        A0D2.putString("og_img_url", str10);
        A0D2.putParcelableArrayList("icebreakers", this.A0T);
        A0D2.putBoolean("disable_nudge", this.A0Y);
        A0D2.putString("signals", this.A0N);
        A0D2.putString("auto_greeting_msg_cta_type", str9);
        A0D2.putString("redirect", this.A0L);
        A0D2.putString("ad_id", this.A06);
        A0D2.putString("ad_group_id", this.A05);
        return A0D2;
    }

    public C87814Xd(AnonymousClass4DN r2, AnonymousClass4UE r3, C87074Ue r4, AnonymousClass1E2 r5, UserJid userJid, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, ArrayList arrayList, List list, JSONObject jSONObject, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A0F = str;
        this.A0O = str2;
        this.A0G = str3;
        this.A0Z = z;
        this.A0a = z2;
        this.A0W = z3;
        this.A0b = z4;
        this.A0d = z5;
        this.A0c = z6;
        this.A09 = str4;
        this.A08 = str5;
        this.A0R = str6;
        this.A0D = str7;
        this.A0I = str8;
        this.A03 = r5;
        this.A04 = userJid;
        this.A0K = str9;
        this.A0J = str10;
        this.A0B = str11;
        this.A0V = jSONObject;
        this.A0U = list;
        this.A0E = str12;
        this.A0X = z7;
        this.A01 = r3;
        this.A0Q = str13;
        this.A07 = str14;
        this.A00 = r2;
        this.A0H = str15;
        this.A0A = str16;
        this.A0P = str17;
        this.A0M = str18;
        this.A0S = str19;
        this.A0C = str20;
        this.A02 = r4;
        this.A0T = arrayList;
        this.A0Y = z8;
        this.A0N = str21;
        this.A0L = str22;
        this.A06 = str23;
        this.A05 = str24;
    }
}
