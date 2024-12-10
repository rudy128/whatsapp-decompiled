package X;

import android.content.SharedPreferences;
import java.util.Map;

/* renamed from: X.7L8  reason: invalid class name */
public final class AnonymousClass7L8 implements AnonymousClass8B1 {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public void Bla(String str) {
        C18070vi.A0d(str, 0);
        C17880vN.A1E(C17890vO.A0A(((C138886xr) this.A00.get()).A00.A01), "pref_avatar_art_revision", str);
    }

    public /* synthetic */ void BpC() {
    }

    public static SharedPreferences.Editor A00(SharedPreferences.Editor editor) {
        return editor.remove("pref_has_avatar_config").remove("pref_has_dismissed_sticker_upsell").remove("pref_has_dismissed_squid_upsell_").remove("pref_squid_version").remove("pref_automatic_squid").remove("pref_avatar_profile_photo_poses");
    }

    public void Bly(String str) {
        SharedPreferences.Editor remove;
        String str2;
        AnonymousClass00H r1 = this.A01;
        boolean A1W = C17880vN.A1W(C108995ce.A0F(r1), "pref_avatar_user_local_deletion");
        SharedPreferences.Editor A002 = A00(C17890vO.A0A(C108945cZ.A0o(r1).A01));
        if (A1W) {
            remove = A01(A002, "pref_avatar_sticker_onboarding_shown").remove("pref_avatar_sticker_search_dictionary_country_code");
            str2 = "pref_key_avatar_soc_warning_shown";
        } else {
            remove = A01(A002.remove("pref_avatar_sticker_onboarding_shown"), "pref_avatar_user_local_deletion").remove("pref_key_avatar_soc_warning_shown");
            str2 = "pref_avatar_sticker_search_dictionary_country_code";
        }
        C17880vN.A1B(remove.remove(str2), "pref_key_coin_flip_opt_in");
    }

    public void Blz() {
        AnonymousClass00H r2 = this.A01;
        if (C17880vN.A1W(C108995ce.A0F(r2), "pref_avatar_user_local_deletion")) {
            ((C136796uQ) this.A02.get()).A01();
            C17880vN.A1B(C108995ce.A0F(r2).edit(), "pref_avatar_user_local_deletion");
        }
    }

    public void Bm0(String str) {
        if (C18070vi.A18(str, "will_delete")) {
            C17880vN.A1F(C17890vO.A0A(C108945cZ.A0o(this.A01).A01), "pref_avatar_user_local_deletion", true);
        }
    }

    public void Bm2(String str, Map map) {
        C27031Ul A0o;
        boolean z;
        if (C18070vi.A18(str, "notice_screen_shown")) {
            A0o = C108945cZ.A0o(this.A01);
            z = false;
        } else if (C18070vi.A18(str, "user_confirmation_success")) {
            A0o = C108945cZ.A0o(this.A01);
            z = true;
        } else {
            return;
        }
        C17880vN.A1F(C17890vO.A0A(A0o.A01), "pref_avatar_notice_consent_accepted", z);
    }

    public void Bm4(boolean z, boolean z2) {
        AnonymousClass00H r3 = this.A01;
        C17880vN.A1F(C17890vO.A0A(C108945cZ.A0o(r3).A01), "pref_has_avatar_config", true);
        C17880vN.A1E(C108995ce.A0F(r3).edit(), "pref_avatar_profile_photo_poses", (String) null);
        C17880vN.A1E(C108995ce.A0F(r3).edit(), "pref_avatar_preview_cache_url", (String) null);
    }

    public AnonymousClass7L8(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public static SharedPreferences.Editor A01(SharedPreferences.Editor editor, String str) {
        return editor.remove(str).remove("pref_avatar_user_remote_deletion").remove("pref_avatar_notice_consent_accepted").remove("pref_avatar_preview_cache_url").remove("pref_avatar_art_revision").remove("pref_avatar_sticker_search_dictionary_revision").remove("pref_avatar_sticker_search_dictionary_state").remove("pref_avatar_sticker_search_dictionary_filters");
    }
}
