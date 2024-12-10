package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1aC  reason: invalid class name and case insensitive filesystem */
public final class C28421aC implements C28411aB {
    public final C19830z4 A00;

    public /* bridge */ /* synthetic */ boolean Bck(Object obj) {
        String str;
        Jid jid = (Jid) obj;
        AnonymousClass00H r3 = this.A00.A00;
        if (!((SharedPreferences) r3.get()).getBoolean("about_community_nux_threshold_reached", false)) {
            Set<String> stringSet = ((SharedPreferences) r3.get()).getStringSet("pref_about_community_nux_seen_communities", new HashSet());
            if (jid != null) {
                str = jid.getRawString();
            } else {
                str = null;
            }
            if (stringSet.contains(str)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public void BkZ(boolean z) {
        C19830z4 r2 = this.A00;
        C19830z4.A00(r2).putBoolean("about_community_nux_threshold_reached", z).apply();
        if (!z) {
            C19830z4.A00(r2).remove("pref_about_community_nux_seen_communities").apply();
        }
    }

    public /* bridge */ /* synthetic */ void CJc(Object obj) {
        boolean z;
        SharedPreferences.Editor A002;
        Jid jid = (Jid) obj;
        if (jid != null) {
            C19830z4 r3 = this.A00;
            Set<String> stringSet = ((SharedPreferences) r3.A00.get()).getStringSet("pref_about_community_nux_seen_communities", new HashSet());
            stringSet.add(jid.getRawString());
            C19830z4.A00(r3).putStringSet("pref_about_community_nux_seen_communities", stringSet).apply();
            z = true;
            if (stringSet.size() >= 1) {
                A002 = C19830z4.A00(r3);
            } else {
                return;
            }
        } else {
            z = true;
            A002 = C19830z4.A00(this.A00);
        }
        A002.putBoolean("about_community_nux_threshold_reached", z).apply();
    }

    public C28421aC(C19830z4 r1) {
        this.A00 = r1;
    }

    public String BVY() {
        return "community_home";
    }
}
