package com.facebook.cameracore.logging.crashmetadatalogger.implementation;

import X.C17880vN;
import X.C18070vi;
import com.facebook.breakpad.BreakpadManager;
import java.util.HashSet;
import java.util.Iterator;

public final class CameraARCrashMetadataLogger {
    public HashSet loggedKeys = C17880vN.A12();

    public final synchronized void cleanupBreakpadData() {
        Iterator it = this.loggedKeys.iterator();
        while (it.hasNext()) {
            BreakpadManager.removeCustomData(C17880vN.A0v(it));
        }
        this.loggedKeys.clear();
    }

    public final synchronized void setBreakpadData(String str, String str2) {
        BreakpadManager.setCustomData(str, str2, new Object[C18070vi.A15(str, str2)]);
        this.loggedKeys.add(str);
    }

    public final void setLoggedKeys(HashSet hashSet) {
        C18070vi.A0d(hashSet, 0);
        this.loggedKeys = hashSet;
    }

    public final HashSet getLoggedKeys() {
        return this.loggedKeys;
    }
}
