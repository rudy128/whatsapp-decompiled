package X;

import androidx.appcompat.widget.SwitchCompat;
import com.whatsapp.authentication.AppAuthSettingsActivity;
import com.whatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3S2  reason: invalid class name */
public class AnonymousClass3S2 extends C02120Cu {
    public final int A00;
    public final Object A01;

    public AnonymousClass3S2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00() {
        if (1 - this.A00 != 0) {
            super.A00();
            return;
        }
        Log.i("AppAuthenticationActivity/failed");
        ((AppAuthenticationActivity) this.A01).A00 = 3;
    }

    public void A01() {
        if (this.A00 != 0) {
            Log.i("AppAuthenticationActivity/success");
            AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) this.A01;
            appAuthenticationActivity.A00 = 3;
            ((AnonymousClass1XL) appAuthenticationActivity.A48().get()).A02(false);
            appAuthenticationActivity.A0Q();
            appAuthenticationActivity.finish();
            return;
        }
        Log.i("AppAuthSettingsActivity/success");
        AppAuthSettingsActivity appAuthSettingsActivity = (AppAuthSettingsActivity) this.A01;
        ((AnonymousClass1XL) appAuthSettingsActivity.A0A.get()).A02(false);
        appAuthSettingsActivity.A0A.A27(true);
        appAuthSettingsActivity.A4c().A08();
        appAuthSettingsActivity.A0v(true);
        SwitchCompat A03 = appAuthSettingsActivity.A06;
        if (A03 == null) {
            C18070vi.A11("appAuthSettingsSwitch");
            throw null;
        }
        A03.setChecked(true);
        appAuthSettingsActivity.A4b().A01();
        ((AnonymousClass1XL) appAuthSettingsActivity.A0A.get()).A01(appAuthSettingsActivity);
    }

    public void A02(int i, CharSequence charSequence) {
        if (this.A00 != 0) {
            Log.i("AppAuthenticationActivity/error");
            AppAuthenticationActivity appAuthenticationActivity = (AppAuthenticationActivity) this.A01;
            appAuthenticationActivity.A00 = 3;
            ((AnonymousClass1XL) appAuthenticationActivity.A48().get()).A02(true);
            if (i == 7) {
                Log.i("AppAuthenticationActivity/error-too-many-attempts");
                AnonymousClass1KB A03 = appAuthenticationActivity.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, 30);
                A03.A0G(appAuthenticationActivity.getString(2131886674, objArr), 1);
                return;
            }
            return;
        }
        if (i == 7) {
            AppAuthSettingsActivity appAuthSettingsActivity = (AppAuthSettingsActivity) this.A01;
            AnonymousClass1KB A0Q = appAuthSettingsActivity.A05;
            Object[] objArr2 = new Object[1];
            AnonymousClass000.A1L(objArr2, 30);
            A0Q.A0G(appAuthSettingsActivity.getString(2131886675, objArr2), 1);
        }
        Log.i("AppAuthSettingsActivity/error");
        ((AppAuthSettingsActivity) this.A01).A0d();
    }
}
