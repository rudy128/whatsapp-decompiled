package X;

import android.os.Handler;

/* renamed from: X.8FJ  reason: invalid class name */
public class AnonymousClass8FJ extends AnonymousClass1DS {
    public int A00 = 0;
    public C20079A6f A01;
    public final Handler A02 = new Handler();
    public final C173738ve A03;
    public final A5L A04;
    public final C20041A4k A05;
    public final C22426B7i A06;
    public final AnonymousClass1XN A07;
    public final AnonymousClass10I A08;
    public final Runnable A09 = new C21446AkD(this, 22);
    public final C22495BAc A0A;
    public final C219217x A0B;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.8vp, X.8we] */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.8vr, X.8we] */
    public static C174358we A00(AnonymousClass8FJ r4) {
        String str = null;
        switch (r4.A00) {
            case 0:
                AnonymousClass48l r1 = new AnonymousClass48l(r4, 0);
                ? r3 = new C174358we(18);
                r3.A00 = r1;
                return r3;
            case 1:
                return new C173968w1();
            case 2:
                C20079A6f a6f = r4.A01;
                if (a6f != null) {
                    AnonymousClass48l r2 = new AnonymousClass48l(r4, 2);
                    ? r0 = new C174358we(4);
                    r0.A00 = a6f;
                    r0.A01 = r2;
                    return r0;
                }
                break;
            case 4:
                break;
            case 7:
                if (r4.A07.A05()) {
                    return new C174238wS(r4.A0A, (String) null);
                }
                String str2 = r4.A01.A07;
                C17960vV.A07(str2);
                return new C174018w6(new AnonymousClass48l(r4, 1), str2);
            default:
                return new C173958w0();
        }
        C20079A6f a6f2 = r4.A01;
        if (a6f2 != null) {
            str = a6f2.A07;
        }
        return new C174038w8(new AnonymousClass48l(r4, 3), str);
    }

    public int A0G() {
        switch (this.A00) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 0;
        }
    }

    public void A0H() {
        long j;
        if (this.A0B.A06()) {
            C173738ve r1 = this.A03;
            if (r1.A03.A00().getBoolean("location_access_granted", r1.A00.A07())) {
                this.A00 = 1;
                Handler handler = this.A02;
                Runnable runnable = this.A09;
                if (this.A07.A04()) {
                    j = C20113A7w.A0L;
                } else {
                    j = 60000;
                }
                handler.postDelayed(runnable, j);
                A02(this);
            }
        }
        C20041A4k a4k = this.A05;
        C20079A6f A022 = a4k.A02();
        this.A01 = A022;
        if (A022.A05()) {
            int i = 4;
            if (a4k.A06.A00().contains(C20041A4k.A01(a4k))) {
                i = 7;
            }
            this.A00 = i;
        } else {
            this.A00 = 0;
        }
        A02(this);
    }

    public AnonymousClass8FJ(C173738ve r3, A5L a5l, C20041A4k a4k, C22426B7i b7i, C22495BAc bAc, C219217x r8, AnonymousClass1XN r9, AnonymousClass10I r10) {
        this.A08 = r10;
        this.A0B = r8;
        this.A07 = r9;
        this.A04 = a5l;
        this.A06 = b7i;
        this.A0A = bAc;
        this.A03 = r3;
        this.A05 = a4k;
        C21446AkD.A01(r10, this, 21);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r2.A06.A00().contains(r1) == false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.C20079A6f r9, X.AnonymousClass8FJ r10) {
        /*
            boolean r0 = r9.A05()
            if (r0 == 0) goto L_0x001f
            X.A4k r0 = r10.A05
            java.lang.String r1 = X.C20041A4k.A01(r0)
            X.1XN r0 = r0.A06
            java.util.HashSet r0 = r0.A00()
            boolean r1 = r0.contains(r1)
            r0 = 7
            if (r1 != 0) goto L_0x001a
        L_0x0019:
            r0 = 4
        L_0x001a:
            r10.A00 = r0
            r10.A01 = r9
            return
        L_0x001f:
            X.1XN r0 = r10.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x006b
            X.A4k r2 = r10.A05
            com.google.android.gms.maps.model.LatLng r3 = X.C20079A6f.A00(r9)
            X.118 r0 = r2.A04
            android.content.Context r1 = r0.A00
            X.0vb r0 = r2.A05
            java.util.Locale r0 = r0.A0N()
            double r4 = r3.A00
            double r6 = r3.A01
            android.location.Geocoder r3 = new android.location.Geocoder
            r3.<init>(r1, r0)
            r8 = 1
            java.util.List r1 = r3.getFromLocation(r4, r6, r8)     // Catch:{ Exception -> 0x0058 }
            if (r1 == 0) goto L_0x005e
            boolean r0 = r1.isEmpty()     // Catch:{ Exception -> 0x0058 }
            if (r0 != 0) goto L_0x005e
            java.lang.Object r0 = X.C108955ca.A0p(r1)     // Catch:{ Exception -> 0x0058 }
            android.location.Address r0 = (android.location.Address) r0     // Catch:{ Exception -> 0x0058 }
            java.lang.String r1 = r0.getCountryCode()     // Catch:{ Exception -> 0x0058 }
            goto L_0x005f
        L_0x0058:
            r1 = move-exception
            java.lang.String r0 = "SearchLocationUtil/geoLocateCountryCodeFromLatLng/failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x005e:
            r1 = 0
        L_0x005f:
            X.1XN r0 = r2.A06
            java.util.HashSet r0 = r0.A00()
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0019
        L_0x006b:
            r0 = 2
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8FJ.A01(X.A6f, X.8FJ):void");
    }

    public static void A02(AnonymousClass8FJ r2) {
        C174358we A002 = A00(r2);
        Object A062 = r2.A06();
        if (A062 == null || !A062.equals(A002)) {
            r2.A0E(A002);
        }
    }
}
