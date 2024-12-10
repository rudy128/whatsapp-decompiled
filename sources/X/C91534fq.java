package X;

import android.widget.CheckBox;
import com.whatsapp.WaEditText;
import com.whatsapp.settings.SettingsSetupUserProxyActivity;
import com.whatsapp.settings.SettingsSetupUserProxyViewModel;

/* renamed from: X.4fq  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91534fq implements C22851Dl {
    public final /* synthetic */ CheckBox A00;
    public final /* synthetic */ WaEditText A01;
    public final /* synthetic */ SettingsSetupUserProxyActivity A02;
    public final /* synthetic */ boolean A03;

    public final void Bo9(Object obj) {
        int intValue;
        String str;
        String str2;
        int i;
        WaEditText waEditText = this.A01;
        SettingsSetupUserProxyActivity settingsSetupUserProxyActivity = this.A02;
        CheckBox checkBox = this.A00;
        boolean z = this.A03;
        Integer A032 = AnonymousClass1YD.A03(AnonymousClass3MZ.A17(waEditText));
        if (A032 == null) {
            AnonymousClass190 r2 = settingsSetupUserProxyActivity.A03;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("input: ");
            A10.append(waEditText.getText());
            r2.A0G("unblocking/changeport failed to parse port as int", AnonymousClass000.A0y(". Verify whether this is a pattern for this locale or device or android version.", A10), false);
            return;
        }
        boolean isChecked = checkBox.isChecked();
        SettingsSetupUserProxyViewModel settingsSetupUserProxyViewModel = (SettingsSetupUserProxyViewModel) settingsSetupUserProxyActivity.A05.getValue();
        if (z) {
            i = A032.intValue();
            C88074Yf A0T = settingsSetupUserProxyViewModel.A0T();
            str = A0T.A02;
            str2 = A0T.A05;
            intValue = A0T.A00;
            isChecked = A0T.A06;
        } else {
            intValue = A032.intValue();
            C88074Yf A0T2 = settingsSetupUserProxyViewModel.A0T();
            str = A0T2.A02;
            str2 = A0T2.A05;
            i = A0T2.A01;
        }
        SettingsSetupUserProxyViewModel.A00(new C88074Yf(str, str2, intValue, i, isChecked), settingsSetupUserProxyViewModel);
    }

    public /* synthetic */ C91534fq(CheckBox checkBox, WaEditText waEditText, SettingsSetupUserProxyActivity settingsSetupUserProxyActivity, boolean z) {
        this.A01 = waEditText;
        this.A02 = settingsSetupUserProxyActivity;
        this.A00 = checkBox;
        this.A03 = z;
    }
}
