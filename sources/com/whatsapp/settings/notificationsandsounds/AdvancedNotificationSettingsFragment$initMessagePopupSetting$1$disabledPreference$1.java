package com.whatsapp.settings.notificationsandsounds;

import X.AnonymousClass8J3;
import X.C166668dO;
import X.C17880vN;
import X.C18070vi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.preference.ListPreference;

public final class AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1 extends ListPreference {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AdvancedNotificationSettingsFragment A01;

    public void A0G(AnonymousClass8J3 r4) {
        C18070vi.A0d(r4, 0);
        super.A0G(r4);
        View view = r4.A0H;
        TextView A0E = C17880vN.A0E(view, 16908310);
        TextView A0E2 = C17880vN.A0E(view, 16908304);
        int i = this.A00;
        A0E.setTextColor(i);
        A0E2.setTextColor(i);
        r4.A00 = true;
        r4.A01 = true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdvancedNotificationSettingsFragment$initMessagePopupSetting$1$disabledPreference$1(C166668dO r2, AdvancedNotificationSettingsFragment advancedNotificationSettingsFragment, int i) {
        super(r2, (AttributeSet) null);
        this.A01 = advancedNotificationSettingsFragment;
        this.A00 = i;
    }
}
