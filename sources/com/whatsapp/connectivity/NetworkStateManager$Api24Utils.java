package com.whatsapp.connectivity;

import X.AnonymousClass000;
import X.AnonymousClass11C;
import X.AnonymousClass190;
import X.C18070vi;
import android.net.NetworkInfo;
import android.os.DeadSystemException;
import android.telephony.SubscriptionManager;
import android.util.Pair;

public final class NetworkStateManager$Api24Utils {
    public static final NetworkStateManager$Api24Utils INSTANCE = new Object();

    public final Pair determineNetworkStateUsingSubscriptionManager$app_infra_core_core(AnonymousClass11C r5, boolean z) {
        boolean z2;
        int i;
        int defaultDataSubscriptionId;
        C18070vi.A0d(r5, 0);
        SubscriptionManager A0J = r5.A0J();
        if (A0J == null || (defaultDataSubscriptionId = SubscriptionManager.getDefaultDataSubscriptionId()) == -1) {
            z2 = false;
            i = 0;
        } else {
            boolean isNetworkRoaming = A0J.isNetworkRoaming(defaultDataSubscriptionId);
            z2 = AnonymousClass000.A0i();
            int i2 = 2;
            if (isNetworkRoaming) {
                i2 = 3;
            }
            i = Integer.valueOf(i2);
        }
        return new Pair(z2, i);
    }

    public final NetworkInfo logCriticalEventIfDeadSystemExceptionOrThrow$app_infra_core_core(AnonymousClass190 r4, RuntimeException runtimeException) {
        boolean A15 = C18070vi.A15(r4, runtimeException);
        if (runtimeException.getCause() instanceof DeadSystemException) {
            r4.A0G("networkstatemanager/deadSystem", (String) null, A15);
            return null;
        }
        throw runtimeException;
    }
}
