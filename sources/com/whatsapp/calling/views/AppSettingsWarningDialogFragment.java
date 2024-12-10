package com.whatsapp.calling.views;

import X.AnonymousClass11C;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C40811vJ;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;

public class AppSettingsWarningDialogFragment extends Hilt_AppSettingsWarningDialogFragment {
    public int A00;
    public AnonymousClass11C A01;

    public void A1u() {
        super.A1u();
        if (!C40811vJ.A0M(this.A01)) {
            A28();
        }
    }

    public Dialog A27(Bundle bundle) {
        int i;
        int i2;
        this.A00 = A15().getInt("reason", 0);
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        int i3 = 2131898109;
        if (this.A00 == 1) {
            i3 = 2131895464;
        }
        A04.A0E(i3);
        int i4 = this.A00;
        if ("samsung".equalsIgnoreCase(Build.MANUFACTURER)) {
            int i5 = Build.VERSION.SDK_INT;
            if (i5 == 31) {
                i = 2131898106;
                if (i4 == 1) {
                    i = 2131895461;
                }
            } else if (i5 >= 28 && i5 <= 30) {
                i = 2131898108;
                if (i4 == 1) {
                    i = 2131895463;
                }
            }
            A04.A0D(i);
            if (this.A00 == 1 || ("samsung".equalsIgnoreCase(Build.MANUFACTURER) && (i2 = Build.VERSION.SDK_INT) >= 28 && i2 <= 31)) {
                A04.setPositiveButton(2131894393, new AnonymousClass4aq(this, 33));
            }
            A04.setNegativeButton(2131899286, new AnonymousClass4aq(this, 32));
            return A04.create();
        }
        i = 2131898107;
        if (i4 == 1) {
            i = 2131895462;
        }
        A04.A0D(i);
        A04.setPositiveButton(2131894393, new AnonymousClass4aq(this, 33));
        A04.setNegativeButton(2131899286, new AnonymousClass4aq(this, 32));
        return A04.create();
    }
}
