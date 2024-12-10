package X;

import com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation.PlatformEventsServiceObjectsWrapper;
import org.json.JSONObject;

/* renamed from: X.CWg  reason: case insensitive filesystem */
public final class C25073CWg {
    public final C24856CMz A00 = new C24856CMz();
    public final E6U A01;
    public final C18100vl A02;
    public final C18100vl A03;

    public final void A00(JSONObject jSONObject) {
        C24856CMz cMz = this.A00;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = cMz.A00;
        if (platformEventsServiceObjectsWrapper == null || !platformEventsServiceObjectsWrapper._isAlive) {
            cMz.A01.add(jSONObject);
        } else {
            platformEventsServiceObjectsWrapper.enqueueEvent(jSONObject);
        }
    }

    public C25073CWg(E6U e6u) {
        this.A01 = e6u;
        Integer num = AnonymousClass00R.A0C;
        this.A02 = AnonymousClass1DF.A00(num, new C27638Dii(this));
        this.A03 = AnonymousClass1DF.A00(num, new C27639Dij(this));
    }
}
