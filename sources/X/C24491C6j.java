package X;

import com.facebook.wearable.mediastream.model.SUPToggleState;

/* renamed from: X.C6j  reason: case insensitive filesystem */
public abstract class C24491C6j {
    public void A00() {
        C22958BXe bXe = (C22958BXe) this;
        if (2 - bXe.A00 == 0) {
            C24712CGy.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onConnect");
            C26996DOs dOs = (C26996DOs) bXe.A01;
            C26197CuS cuS = dOs.A0F;
            cuS.A04();
            Boolean A0i = AnonymousClass000.A0i();
            SUPToggleState.deviceIsReadyToConnect = A0i;
            SUPToggleState sUPToggleState = dOs.A01;
            if (sUPToggleState instanceof C22963BXj) {
                dOs.A01 = sUPToggleState.toConnected(false);
                C22821Di r0 = dOs.A04;
                if (r0 != null) {
                    r0.invoke(A0i);
                }
            }
            dOs.A0E.A0E = cuS.A01;
        }
    }

    public void A01() {
        C22958BXe bXe = (C22958BXe) this;
        if (bXe.A00 == 0) {
            C24712CGy.A01.A02("sup:SUPDelegate", "MediaStreamStateListener:onDiscovered");
            C26996DOs dOs = (C26996DOs) bXe.A01;
            C26996DOs.A03(dOs, 1);
            dOs.A0E.A0K.remove("sup:SUPDelegate_ON_DISCOVERED_CALLBACK");
            if (C18070vi.A18(dOs.A01, C22961BXh.A00)) {
                dOs.A0A();
                C22821Di r2 = dOs.A04;
                if (r2 != null) {
                    r2.invoke(false);
                }
                dOs.A0C(false);
            }
        }
    }

    public abstract void A02();

    public void A03(C24474C5p c5p) {
        C22958BXe bXe = (C22958BXe) this;
        if (2 - bXe.A00 == 0) {
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaStreamStateListener:onError ");
            cn1.A02("sup:SUPDelegate", AnonymousClass000.A0y(c5p.A00(), A10));
            C26996DOs dOs = (C26996DOs) bXe.A01;
            if (dOs.A01 instanceof C22963BXj) {
                cn1.A01("sup:SUPDelegate", "SUP is not activated, switching to connected but not selected state");
                dOs.A01 = dOs.A01.toConnected(false);
                C26996DOs.A05(dOs, false);
            }
            dOs.A0F.A05(c5p);
            if (C26996DOs.A07(dOs)) {
                cn1.A01("sup:SUPDelegate", "MediaStreamStateListener:startErrorToConnectJob onError");
                C26996DOs.A06(dOs, true);
            }
            C26996DOs.A02(dOs);
        }
    }

    public abstract void A04(C24425C3a c3a);
}
