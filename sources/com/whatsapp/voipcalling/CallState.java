package com.whatsapp.voipcalling;

import X.C19780yz;
import X.C19810z2;

public enum CallState {
    NONE,
    CALLING,
    PRE_ACCEPT_RECEIVED,
    RECEIVED_CALL,
    ACCEPT_SENT,
    ACCEPT_RECEIVED,
    ACTIVE,
    ACTIVE_ELSEWHERE,
    REJOINING,
    LINK,
    CONNECTED_LONELY,
    PRECALLING,
    ENDING,
    BCALL_STARTING;

    public static C19810z2 getEntries() {
        return $ENTRIES;
    }

    /* access modifiers changed from: public */
    static {
        CallState[] $values;
        $ENTRIES = C19780yz.A00($values);
    }
}
