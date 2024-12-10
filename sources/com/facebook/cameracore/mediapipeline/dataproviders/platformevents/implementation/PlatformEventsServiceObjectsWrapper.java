package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AnonymousClass000;
import X.AnonymousClass8BX;
import X.C17880vN;
import X.C18070vi;
import X.C199610h;
import X.C24815CLi;
import X.C24856CMz;
import X.C25073CWg;
import com.facebook.jni.HybridData;
import java.util.LinkedList;
import org.json.JSONException;
import org.json.JSONObject;

public final class PlatformEventsServiceObjectsWrapper {
    public boolean _isAlive;
    public final C24815CLi delegate;
    public final C24856CMz input;
    public final HybridData mHybridData = initHybrid();

    private final native void enqueueEventNative(String str);

    private final native HybridData initHybrid();

    public void enqueueEvent(JSONObject jSONObject) {
        C18070vi.A0d(jSONObject, 0);
        enqueueEventNative(C18070vi.A0H(jSONObject));
    }

    public final void start() {
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper;
        this._isAlive = true;
        C24856CMz cMz = this.input;
        if (cMz != null && (platformEventsServiceObjectsWrapper = cMz.A00) != null && platformEventsServiceObjectsWrapper._isAlive) {
            while (true) {
                LinkedList linkedList = cMz.A01;
                if (!linkedList.isEmpty()) {
                    PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper2 = cMz.A00;
                    Object pop = linkedList.pop();
                    C199610h.A04(pop);
                    platformEventsServiceObjectsWrapper2.enqueueEvent((JSONObject) pop);
                } else {
                    return;
                }
            }
        }
    }

    public PlatformEventsServiceObjectsWrapper(C24815CLi cLi, C24856CMz cMz) {
        this.delegate = cLi;
        this.input = cMz;
        cMz.A00 = this;
    }

    public final void didReceiveEngineEvent(String str) {
        try {
            JSONObject A16 = C17880vN.A16(str);
            C24815CLi cLi = this.delegate;
            if (cLi != null) {
                C25073CWg cWg = cLi.A00;
                C18070vi.A0d(cWg, 0);
                cWg.A01.BtR(A16);
            }
        } catch (JSONException e) {
            throw AnonymousClass8BX.A0V(e, "Invalid json events from engine: ", AnonymousClass000.A10());
        }
    }
}
