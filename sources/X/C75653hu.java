package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3hu  reason: invalid class name and case insensitive filesystem */
public final class C75653hu extends C167288fl {
    public final /* synthetic */ AppAuthSettingsActivity A00;

    public C75653hu(AppAuthSettingsActivity appAuthSettingsActivity) {
        this.A00 = appAuthSettingsActivity;
    }

    public void A00() {
        Log.i("AppAuthSettingsActivity/fingerprint-success-animation-end");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        SwitchCompat A03 = appAuthSettingsActivity.A06;
        if (A03 == null) {
            C18070vi.A11("appAuthSettingsSwitch");
            throw null;
        }
        A03.setChecked(true);
        appAuthSettingsActivity.A0v(true);
    }

    public void A01() {
        Log.i("AppAuthSettingsActivity/fingerprint-error");
        this.A00.A0d();
    }

    public void A02(C42621yT r2, BCP bcp) {
        Log.i("AppAuthSettingsActivity/authenticate");
        ((AnonymousClass1XL) this.A00.A0A.get()).A00();
    }

    public void A03(byte[] bArr) {
        Log.i("AppAuthSettingsActivity/fingerprint-success");
        AppAuthSettingsActivity appAuthSettingsActivity = this.A00;
        appAuthSettingsActivity.A0A.A27(true);
        ((AnonymousClass1XL) appAuthSettingsActivity.A0A.get()).A02(false);
        appAuthSettingsActivity.A4c().A08();
        appAuthSettingsActivity.A4b().A01();
    }
}
