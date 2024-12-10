package X;

import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;

/* renamed from: X.9op  reason: invalid class name and case insensitive filesystem */
public class C192699op {
    public C20652ATk A00;
    public C169138kQ A01;
    public final AnonymousClass9W9 A02;
    public final AnonymousClass16M A03;
    public final BAD A04;
    public final AnonymousClass9XW A05;

    public synchronized void A00() {
        C169138kQ r0 = this.A01;
        if (!(r0 == null || r0.A06.A09() == 2 || C108945cZ.A1T(this.A01.A06))) {
            this.A01.A0D();
            this.A01 = null;
        }
    }

    public void A01(LatLng latLng, BAW baw, C19989A2b a2b, String str, String str2, float f) {
        LatLng latLng2 = latLng;
        ArrayList A032 = C20086A6o.A03(latLng2.A00, latLng2.A01, 10);
        C17960vV.A07(A032);
        ArrayList A042 = C20086A6o.A04(10, C17880vN.A05(A032.get(0)), C17880vN.A05(A032.get(1)));
        LatLng A09 = AnonymousClass8BV.A09((Number) A042.get(1), AnonymousClass8BR.A00(A042.get(0)));
        synchronized (this) {
            A00();
            C20652ATk aTk = new C20652ATk(latLng2, baw, this, str, str2, f);
            this.A00 = aTk;
            AnonymousClass9W9 r2 = this.A02;
            BAD bad = this.A04;
            AnonymousClass16M r6 = this.A03;
            C191659mx r11 = this.A05.A00;
            AnonymousClass10E r0 = r2.A00.A00;
            AnonymousClass190 A0N = AnonymousClass3MY.A0N(r0);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r0);
            C169138kQ r22 = new C169138kQ(A09, A0N, AnonymousClass8BT.A0B(r0), r6, bad, AnonymousClass8BU.A0F(r0), AnonymousClass10E.A6Q(r0), aTk, r11, a2b, AL1);
            r22.A0E();
            this.A01 = r22;
        }
    }

    public C192699op(AnonymousClass9W9 r1, AnonymousClass16M r2, BAD bad, AnonymousClass9XW r4) {
        this.A04 = bad;
        this.A03 = r2;
        this.A05 = r4;
        this.A02 = r1;
    }
}
