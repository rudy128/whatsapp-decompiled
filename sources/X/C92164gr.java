package X;

import android.app.Activity;
import android.content.SharedPreferences;

/* renamed from: X.4gr  reason: invalid class name and case insensitive filesystem */
public class C92164gr implements C107005Ya {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C92164gr(AnonymousClass1FU r1, C19830z4 r2, int i, int i2) {
        this.A00 = i2;
        this.A02 = r1;
        this.A01 = i;
        this.A03 = r2;
    }

    public final void C31() {
        boolean z;
        SharedPreferences.Editor A002;
        String str;
        if (this.A00 != 0) {
            int i = this.A01;
            C19830z4 r3 = (C19830z4) this.A03;
            AnonymousClass4Yv.A00((Activity) this.A02, i);
            z = false;
            C17880vN.A1F(C19830z4.A00(r3), "pref_revoke_sender_nux_v2", false);
            A002 = C19830z4.A00(r3);
            str = "pref_revoke_admin_nux";
        } else {
            AnonymousClass4Yv.A00((Activity) this.A02, this.A01);
            z = false;
            A002 = C19830z4.A00((C19830z4) this.A03);
            str = "pref_revoke_sender_nux_v2";
        }
        C17880vN.A1F(A002, str, z);
    }
}
