package com.whatsapp.migration.transfer.ui;

import X.C173628vP;
import X.C18070vi;

public final class P2pTransferActivity$Api29Utils {
    public static final P2pTransferActivity$Api29Utils INSTANCE = new Object();

    public final void openNetworkSettings(C173628vP r2) {
        C18070vi.A0d(r2, 0);
        C173628vP.A0d(r2, "android.settings.panel.action.INTERNET_CONNECTIVITY");
    }

    public final boolean openWifiSettings(C173628vP r2) {
        C18070vi.A0d(r2, 0);
        return C173628vP.A0d(r2, "android.settings.panel.action.WIFI");
    }
}
