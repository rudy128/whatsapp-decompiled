package X;

import com.whatsapp.location.LocationSharingService;

/* renamed from: X.99x  reason: invalid class name */
public abstract class AnonymousClass99x extends C29651cd implements AnonymousClass009 {
    public boolean A00 = false;
    public final Object A01 = C17880vN.A0p();
    public volatile C008203r A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C008203r(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            LocationSharingService locationSharingService = (LocationSharingService) this;
            AnonymousClass10E r2 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            locationSharingService.A06 = AnonymousClass10E.A6O(r2);
            locationSharingService.A09 = AnonymousClass3MY.A0Z(r2);
            locationSharingService.A0B = AnonymousClass10E.AL1(r2);
            locationSharingService.A05 = AnonymousClass3Ma.A0a(r2);
            locationSharingService.A08 = AnonymousClass3Ma.A0c(r2);
            locationSharingService.A07 = AnonymousClass3Ma.A0b(r2);
            locationSharingService.A03 = (C27411Vz) r2.A0m.get();
            locationSharingService.A02 = (AnonymousClass1RB) r2.AUE.get();
            locationSharingService.A0A = (C27131Uv) r2.A5p.get();
            locationSharingService.A04 = (C190019kF) r2.Adf.get();
            locationSharingService.A01 = (AnonymousClass195) r2.A0L.get();
            locationSharingService.A0C = C000200d.A00(r2.ACA);
        }
        super.onCreate();
    }
}
