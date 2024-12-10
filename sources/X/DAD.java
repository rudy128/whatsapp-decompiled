package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;

public class DAD implements E46 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public DAD(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void Bxa(DAE dae) {
        if (this.A00 != 0) {
            int dimensionPixelSize = ((View) this.A01).getResources().getDimensionPixelSize(2131167635);
            dae.A07(dimensionPixelSize * 2, dimensionPixelSize, dimensionPixelSize);
            dae.A09(C25306CdA.A00(new D44(DJ0.A05((LatLng) this.A02), 15.0f, Float.MIN_VALUE, Float.MIN_VALUE)));
            return;
        }
        C24000Bth bth = (C24000Bth) this.A01;
        Context context = (Context) this.A02;
        BPP bpp = bth.A07;
        if (bpp == null) {
            C04 c04 = bth.A08;
            C25600Cif cif = bth.A0C;
            if (cif == null) {
                cif = new C25600Cif(context, bth);
                bth.A0C = cif;
            }
            Drawable A012 = AnonymousClass03S.A01(context, 2131232015);
            A012.getClass();
            bpp = new BPP(A012, dae, c04, cif);
            bth.A07 = bpp;
        }
        dae.A0B(bpp);
        bpp.A05(true);
    }
}
