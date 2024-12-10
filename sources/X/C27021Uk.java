package X;

import android.content.SharedPreferences;
import com.whatsapp.productinfra.avatar.data.AvatarConfigRepository$hasAvatarAwait$2;
import com.whatsapp.util.Log;

/* renamed from: X.1Uk  reason: invalid class name and case insensitive filesystem */
public final class C27021Uk {
    public final C18140vp A00;
    public final C18140vp A01;
    public final C18600wl A02;
    public final C18140vp A03;

    public C27021Uk(C18140vp r2, C18140vp r3, C18140vp r4, C18600wl r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r4, 4);
        this.A02 = r5;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }

    public final Object A00(C30391dr r5, boolean z) {
        C27031Ul r3 = (C27031Ul) this.A01.get();
        if (((C133856pc) this.A03.get()).A00() != null) {
            return C30451dy.A00(r5, this.A02, new AvatarConfigRepository$hasAvatarAwait$2(this, r3, (C30391dr) null, z));
        }
        Log.e("AvatarConfigRepository/hasAvatarAwait avatar user does not exist");
        return false;
    }

    public final boolean A01() {
        C18100vl r1 = ((C27031Ul) this.A01.get()).A01;
        if (((SharedPreferences) r1.getValue()).contains("pref_has_avatar_config")) {
            boolean z = ((SharedPreferences) r1.getValue()).getBoolean("pref_has_avatar_config", false);
            if (Boolean.valueOf(z) != null) {
                return z;
            }
        }
        Log.i("AvatarRepository/unknown avatar config state, returning false.");
        return false;
    }
}
