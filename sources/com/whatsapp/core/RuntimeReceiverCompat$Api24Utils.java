package com.whatsapp.core;

import X.AnonymousClass190;
import X.C18070vi;
import android.os.DeadSystemException;

public final class RuntimeReceiverCompat$Api24Utils {
    public static final RuntimeReceiverCompat$Api24Utils INSTANCE = new Object();

    public final void logCriticalEventIfDeadSystemExceptionOrThrow(AnonymousClass190 r4, RuntimeException runtimeException) {
        boolean A15 = C18070vi.A15(r4, runtimeException);
        if (runtimeException.getCause() instanceof DeadSystemException) {
            r4.A0G("runtimereceivercompat/unregisterreceiver/deadSystem", (String) null, A15);
            return;
        }
        throw runtimeException;
    }
}
