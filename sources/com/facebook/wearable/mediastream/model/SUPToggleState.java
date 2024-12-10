package com.facebook.wearable.mediastream.model;

import X.AnonymousClass1Y1;
import X.BE6;
import X.BY9;
import X.C22873BTh;
import X.C22959BXf;
import X.C24597CAs;
import X.C24867CNl;

public abstract class SUPToggleState {
    public static final C24597CAs Companion = new Object();
    public static Boolean deviceIsReadyToConnect = null;
    public static boolean hingeOpen = true;
    public static boolean viewVisible = true;

    public C24867CNl getCurrentStatusIndicatorState() {
        return null;
    }

    public SUPToggleState getUpdatedStatusIndicatorAttributes(Boolean bool, C24867CNl cNl, Boolean bool2, Boolean bool3, Boolean bool4) {
        return null;
    }

    public SUPToggleState toConnected(boolean z) {
        return new C22959BXf(new C22873BTh(new BY9(100), false, false, false, false), z);
    }

    public static /* synthetic */ SUPToggleState getUpdatedStatusIndicatorAttributes$default(SUPToggleState sUPToggleState, Boolean bool, C24867CNl cNl, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                bool = null;
            }
            if ((i & 2) != 0) {
                cNl = null;
            }
            if ((i & 4) != 0) {
                bool2 = null;
            }
            if ((i & 8) != 0) {
                bool3 = null;
            }
            if ((i & 16) != 0) {
                bool4 = null;
            }
            return sUPToggleState.getUpdatedStatusIndicatorAttributes(bool, cNl, bool2, bool3, bool4);
        }
        throw BE6.A0v("Super calls with default arguments not supported in this target, function: getUpdatedStatusIndicatorAttributes");
    }

    public /* synthetic */ SUPToggleState(AnonymousClass1Y1 r1) {
    }

    public SUPToggleState() {
    }
}
