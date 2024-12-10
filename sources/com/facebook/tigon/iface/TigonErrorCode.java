package com.facebook.tigon.iface;

import X.AnonymousClass3MW;
import X.AnonymousClass8BX;
import X.C17880vN;
import X.C188959iH;
import X.C19780yz;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TigonErrorCode {
    NONE(0),
    CANCEL(1),
    TRANSIENT_ERROR(2),
    FATAL_ERROR(3),
    INVALID_REQUEST(4);
    
    public static final C188959iH A00 = null;
    public static final Map A01 = null;
    public final int value;

    public static final TigonErrorCode fromValue(int i) {
        return A00.fromValue(i);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, X.9iH] */
    /* access modifiers changed from: public */
    static {
        int i;
        TigonErrorCode[] tigonErrorCodeArr;
        A02 = C19780yz.A00(tigonErrorCodeArr);
        A00 = new Object();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r3));
        for (TigonErrorCode tigonErrorCode : values()) {
            C17880vN.A1O(tigonErrorCode, linkedHashMap, tigonErrorCode.value);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    TigonErrorCode(int i) {
        this.value = i;
    }

    public String toString() {
        switch (ordinal()) {
            case 0:
                return "None";
            case 1:
                return "Cancel";
            case 2:
                return "TransientError";
            case 3:
                return "FatalError";
            case 4:
                return "InvalidRequest";
            case 5:
                return "RequestNotSupported";
            default:
                throw AnonymousClass3MW.A14();
        }
    }
}
