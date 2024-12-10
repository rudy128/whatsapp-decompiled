package com.whatsapp.location;

import X.AnonymousClass00H;
import X.AnonymousClass219;
import X.AnonymousClass21B;
import X.AnonymousClass689;
import X.BIC;
import X.BIS;
import X.BIW;
import X.C23031Ba7;
import X.C25478CgX;
import X.C60072nL;
import X.CLL;
import X.DAC;
import X.DKR;
import X.DKT;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.LatLng;

public class WaMapView extends BIW {
    public static C25478CgX A03;
    public static CLL A04;
    public BIS A00;
    public BIC A01;
    public AnonymousClass00H A02;

    public void setupGoogleMap(BIC bic, LatLng latLng, C23031Ba7 ba7) {
        bic.A07(new DKT(bic, latLng, ba7, this, 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r9.A00 != 0.0d) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(com.google.android.gms.maps.model.LatLng r9, X.C23031Ba7 r10, X.AnonymousClass689 r11) {
        /*
            r8 = this;
            double r0 = r9.A01
            r4 = 0
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0010
            double r2 = r9.A00
            int r5 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r2 = 0
            if (r5 == 0) goto L_0x0011
        L_0x0010:
            r2 = 1
        L_0x0011:
            r8.setVisibility(r4)
            if (r2 == 0) goto L_0x0129
            android.content.Context r2 = r8.getContext()
            boolean r2 = r11.A06(r2)
            if (r2 == 0) goto L_0x00d9
            X.BIC r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            if (r0 != 0) goto L_0x0071
            boolean r0 = r8 instanceof X.C24003Btp     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.maps.GoogleMapOptions r2 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r0 = 1
            r2.A00 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A0C = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.C25407Cf9.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.BIC r1 = new X.BIC     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1.<init>(r0, r2)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
        L_0x0052:
            r8.A01 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            boolean r0 = r11.A00     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            if (r0 != 0) goto L_0x007c
            android.view.ViewTreeObserver r2 = r1.getViewTreeObserver()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1 = 2
            X.797 r0 = new X.797     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r0.<init>(r8, r11, r1)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.addOnPreDrawListener(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
        L_0x0065:
            X.BIC r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r0 = 4
            r1.setVisibility(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.BIC r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r0 = -1
            r8.addView(r1, r0, r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
        L_0x0071:
            X.BIC r1 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.DKS r0 = new X.DKS     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r0.<init>(r9, r10, r8)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1.A07(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            goto L_0x00d3
        L_0x007c:
            r0 = 0
            r1.A05(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.BIC r0 = r8.A01     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r0.A04()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            goto L_0x0065
        L_0x0086:
            com.google.android.gms.maps.GoogleMapOptions r3 = new com.google.android.gms.maps.GoogleMapOptions     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.<init>()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1 = 1097859072(0x41700000, float:15.0)
            r0 = 0
            com.google.android.gms.maps.model.CameraPosition r2 = new com.google.android.gms.maps.model.CameraPosition     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r2.<init>(r9, r1, r0, r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1 = 1
            r3.A00 = r1     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            java.lang.Boolean r0 = X.AnonymousClass000.A0h()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A0C = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A05 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A08 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A06 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A0A = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A09 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A07 = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A01 = r2     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r3.A0B = r0     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.00H r0 = r8.A02     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            java.lang.Object r2 = r0.get()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.0vd r2 = (X.C18020vd) r2     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1 = 12570(0x311a, float:1.7614E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            if (r0 != 0) goto L_0x00c9
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.C25407Cf9.A00(r0)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
        L_0x00c9:
            android.content.Context r0 = r8.getContext()     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            X.BIC r1 = new X.BIC     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            r1.<init>(r0, r3)     // Catch:{ IncompatibleClassChangeError -> 0x00d4 }
            goto L_0x0052
        L_0x00d3:
            return
        L_0x00d4:
            r0 = move-exception
            com.whatsapp.util.Log.i((java.lang.Throwable) r0)
            return
        L_0x00d9:
            X.BIS r2 = r8.A00
            if (r2 != 0) goto L_0x011e
            double r2 = r9.A00
            X.AEc r5 = new X.AEc
            r5.<init>(r2, r0)
            r2 = 1097859072(0x41700000, float:15.0)
            r0 = 1
            X.D44 r1 = new X.D44
            r1.<init>(r5, r2, r0, r0)
            X.CTh r2 = new X.CTh
            r2.<init>()
            r0 = 1
            r2.A00 = r0
            r2.A08 = r4
            r2.A05 = r4
            r2.A07 = r4
            r2.A02 = r1
            java.lang.String r0 = "whatsapp_consumer"
            r2.A04 = r0
            android.content.Context r0 = r8.getContext()
            r11.A05(r0)
            double r0 = X.BIS.A0n
            android.content.Context r0 = r8.getContext()
            X.Bth r1 = new X.Bth
            r1.<init>(r0, r2)
            r8.A00 = r1
            r0 = 0
            r1.A0F(r0)
            X.BIS r1 = r8.A00
            r0 = -1
            r8.addView(r1, r0, r0)
        L_0x011e:
            X.BIS r2 = r8.A00
            r1 = 1
            X.DAD r0 = new X.DAD
            r0.<init>(r9, r8, r1)
            r2.A0H(r0)
        L_0x0129:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.WaMapView.A02(com.google.android.gms.maps.model.LatLng, X.Ba7, X.689):void");
    }

    public void A03(AnonymousClass689 r6, AnonymousClass219 r7, boolean z) {
        double d;
        double d2;
        C23031Ba7 A002;
        C60072nL r2;
        if (z || (r2 = r7.A02) == null) {
            d = r7.A00;
            d2 = r7.A01;
        } else {
            d = r2.A00;
            d2 = r2.A01;
        }
        LatLng latLng = new LatLng(d, d2);
        if (z) {
            A002 = null;
        } else {
            A002 = C23031Ba7.A00(getContext(), 2132017172);
        }
        A02(latLng, A002, r6);
    }

    public void A04(AnonymousClass689 r7, AnonymousClass21B r8) {
        LatLng latLng = new LatLng(r8.A00, r8.A01);
        A02(latLng, (C23031Ba7) null, r7);
        A01(latLng);
    }

    public BIS getFacebookMapView() {
        return this.A00;
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public void A01(LatLng latLng) {
        String string = getContext().getString(2131891807);
        BIC bic = this.A01;
        if (bic != null) {
            bic.A07(new DKR(latLng, string));
            return;
        }
        BIS bis = this.A00;
        if (bis != null) {
            bis.A0H(new DAC(latLng, string));
        }
    }

    public WaMapView(Context context) {
        super(context);
        A00();
    }

    public WaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WaMapView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00();
    }
}
