package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.6oZ  reason: invalid class name and case insensitive filesystem */
public class C133326oZ {
    public final AnonymousClass00H A00;

    public C133326oZ(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final Intent A00(Context context) {
        C18070vi.A0d(context, 0);
        return C108995ce.A0C(context);
    }

    public Intent A01(Context context, String str) {
        C18070vi.A0d(context, 0);
        Intent A06 = AnonymousClass3MZ.A06(this.A00);
        A06.setClassName(context.getPackageName(), "com.whatsapp.settings.SettingsPrivacy");
        A06.putExtra("target_setting", str);
        return A06;
    }
}
