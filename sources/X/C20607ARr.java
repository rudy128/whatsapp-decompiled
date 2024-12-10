package X;

import com.whatsapp.util.Log;

/* renamed from: X.ARr  reason: case insensitive filesystem */
public class C20607ARr implements BCV {
    public final /* synthetic */ C170628qP A00;

    public C20607ARr(C170628qP r1) {
        this.A00 = r1;
    }

    public void Bki() {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onAbort");
    }

    public void Bsy(Integer num) {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onError");
    }

    public void C8h(Integer num) {
        Log.e("PAY:PaymentErrorMapAssetManager/triggerBackgroundFetch/onTimeOut");
    }

    public void onSuccess() {
        C170628qP r5 = this.A00;
        AnonymousClass1QD r4 = r5.A02;
        C17880vN.A1D(AnonymousClass8BU.A07(r4), "payments_error_map_last_sync_time_millis", AnonymousClass11P.A01(r4.A01));
        StringBuilder A11 = AnonymousClass000.A11(r5.A01.BPX());
        A11.append("_");
        A11.append(r5.A00.A05());
        A11.append("_");
        C17880vN.A1E(AnonymousClass8BU.A07(r4), "error_map_key", AnonymousClass000.A0y("1", A11));
    }
}
