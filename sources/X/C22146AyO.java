package X;

import com.google.android.gms.maps.model.LatLng;

/* renamed from: X.AyO  reason: case insensitive filesystem */
public final class C22146AyO extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C169258kf this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22146AyO(C169258kf r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C185719d2 r14 = (C185719d2) obj;
        if (r14 != null) {
            C169258kf r3 = this.this$0;
            C173738ve r1 = r3.A02;
            if (r1 == null) {
                C18070vi.A11("businessDirectorySharedPrefs");
                throw null;
            } else if (r1.A03.A00().getBoolean("location_access_granted", r1.A00.A07())) {
                AnonymousClass8FG A4b = r3.A4b();
                if (A4b.A0D) {
                    C41731wy r6 = A4b.A0U;
                    LatLng latLng = r14.A01;
                    double d = latLng.A00;
                    double d2 = latLng.A01;
                    r6.A0F(new C193039pR(C25306CdA.A01(new C20269AEc(d, d2), A4b.A04.A01)));
                    A4b.A0D = false;
                    A4b.A0K.A01(new LatLng(d, d2), A4b, (C19989A2b) null, r14.A02, "device", r14.A00);
                }
            }
        }
        return C27621Wu.A00;
    }
}
