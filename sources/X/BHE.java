package X;

import android.view.SurfaceView;

public abstract class BHE extends SurfaceView implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public void A0B() {
        Bq5 bq5 = (Bq5) this;
        if (!bq5.A03) {
            bq5.A03 = true;
            AnonymousClass10E r1 = AnonymousClass3MY.A0O(bq5).A10;
            bq5.A0E = AnonymousClass10E.A13(r1);
            bq5.A0K = (AnonymousClass10I) r1.AC1.get();
            bq5.A0G = (AnonymousClass11C) r1.AAp.get();
            bq5.A0I = (C133846pb) r1.A00.A7f.get();
            bq5.A0J = (C18010vc) r1.A9s.get();
            bq5.A0H = (C219217x) r1.ABj.get();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
