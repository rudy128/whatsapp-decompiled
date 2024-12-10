package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.SystemClock;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.WaMapView;
import java.lang.ref.Reference;
import java.util.HashMap;
import java.util.Iterator;

public final /* synthetic */ class DAC implements E46 {
    public final /* synthetic */ LatLng A00;
    public final /* synthetic */ String A01;

    public final void Bxa(DAE dae) {
        C25478CgX cgX;
        C25478CgX cgX2;
        LatLng latLng = this.A00;
        String str = this.A01;
        if (WaMapView.A03 == null) {
            if (C25930Cou.A02 == null) {
                cgX = null;
            } else {
                String A1I = AnonymousClass001.A1I("resource_", AnonymousClass000.A10(), 2131232085);
                HashMap hashMap = C25930Cou.A03;
                Reference reference = (Reference) hashMap.get(A1I);
                cgX = null;
                if (reference == null || (cgX2 = (C25478CgX) reference.get()) == null) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(C25930Cou.A02.getResources(), 2131232085);
                    if (decodeResource != null) {
                        cgX2 = new C25478CgX(decodeResource);
                        hashMap.put(A1I, AnonymousClass3MW.A0z(cgX2));
                    }
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = C25930Cou.A01;
                if (j >= 600000 || j == 0) {
                    C25930Cou.A01 = uptimeMillis;
                    Iterator A0i = C17890vO.A0i(hashMap);
                    while (A0i.hasNext()) {
                        if (((Reference) C17890vO.A0P(A0i)).get() == null) {
                            A0i.remove();
                        }
                    }
                }
                cgX = cgX2;
            }
            WaMapView.A03 = cgX;
        }
        C25612Cis cis = new C25612Cis();
        cis.A00 = DJ0.A05(latLng);
        cis.A01 = WaMapView.A03;
        cis.A03 = str;
        dae.A05();
        BPT bpt = new BPT(dae, cis);
        dae.A0B(bpt);
        bpt.A0D = dae;
    }

    public /* synthetic */ DAC(LatLng latLng, String str) {
        this.A00 = latLng;
        this.A01 = str;
    }
}
