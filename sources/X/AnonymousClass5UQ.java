package X;

import android.content.Intent;
import com.whatsapp.settings.securitycheckup.SettingsSecurityCheckupActivity;

/* renamed from: X.5UQ  reason: invalid class name */
public final class AnonymousClass5UQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SettingsSecurityCheckupActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5UQ(SettingsSecurityCheckupActivity settingsSecurityCheckupActivity) {
        super(1);
        this.this$0 = settingsSecurityCheckupActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent A1m;
        String str;
        C108465bk r10 = (C108465bk) obj;
        C18070vi.A0d(r10, 0);
        SettingsSecurityCheckupActivity settingsSecurityCheckupActivity = this.this$0;
        if (r10 instanceof C97804q5) {
            if (settingsSecurityCheckupActivity.A00 != null) {
                A1m = C17880vN.A0A();
                A1m.setClassName(settingsSecurityCheckupActivity.getPackageName(), "com.whatsapp.settings.SettingsPasskeys");
                A1m.putExtra("passkey_creation_source", 5);
            }
            AnonymousClass3MW.A1F();
            throw null;
        } else if (r10 instanceof C97824q7) {
            C97824q7 r102 = (C97824q7) r10;
            if (!r102.A01 || r102.A02 || (str = r102.A00) == null || AnonymousClass1YF.A0T(str)) {
                if (settingsSecurityCheckupActivity.A00 != null) {
                    A1m = AnonymousClass1LU.A1O(settingsSecurityCheckupActivity, C17890vO.A0Q(), 5);
                }
                AnonymousClass3MW.A1F();
                throw null;
            }
            if (settingsSecurityCheckupActivity.A00 != null) {
                A1m = AnonymousClass1LU.A1d(settingsSecurityCheckupActivity, str, (String) null, C17890vO.A0Q(), 2, 5);
            }
            AnonymousClass3MW.A1F();
            throw null;
            C18070vi.A0b(A1m);
        } else if (r10 instanceof C97814q6) {
            if (settingsSecurityCheckupActivity.A00 != null) {
                A1m = AnonymousClass1LU.A1m(settingsSecurityCheckupActivity, true);
            }
            AnonymousClass3MW.A1F();
            throw null;
        } else {
            throw AnonymousClass3MW.A14();
        }
        settingsSecurityCheckupActivity.startActivity(A1m);
        return C27621Wu.A00;
    }
}
