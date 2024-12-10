package com.whatsapp.businessdirectory.viewmodel;

import X.A5L;
import X.AM5;
import X.AnonymousClass118;
import X.AnonymousClass1DT;
import X.AnonymousClass1XN;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass8FK;
import X.C107905ao;
import X.C173738ve;
import X.C219217x;
import X.C41731wy;

public class LocationOptionPickerViewModel extends AnonymousClass8FK implements C107905ao {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0L();
    public final AM5 A01;
    public final C173738ve A02;
    public final A5L A03;
    public final AnonymousClass118 A04;
    public final C219217x A05;
    public final AnonymousClass1XN A06;
    public final C41731wy A07 = AnonymousClass3MW.A0o();

    public void BxH() {
        this.A01.A03(3, 1);
        this.A02.A02(true);
        A00(this);
    }

    public void BxI() {
        this.A01.A03(4, 1);
    }

    public static void A00(LocationOptionPickerViewModel locationOptionPickerViewModel) {
        if (locationOptionPickerViewModel.A05.A06()) {
            if (!locationOptionPickerViewModel.A06.A04()) {
                locationOptionPickerViewModel.A02.A00();
            }
            AnonymousClass3MX.A1J(locationOptionPickerViewModel.A07, 5);
            return;
        }
        AnonymousClass3MX.A1K(locationOptionPickerViewModel.A07, 1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.8kt, java.lang.Object, X.43G] */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004e, code lost:
        if (((android.location.LocationManager) r4.A04.A00.getSystemService("location")).isProviderEnabled("gps") == false) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LocationOptionPickerViewModel(android.app.Application r5, X.AM5 r6, X.C173738ve r7, X.A5L r8, X.AnonymousClass118 r9, X.C219217x r10, X.AnonymousClass1XN r11) {
        /*
            r4 = this;
            r4.<init>(r5)
            X.1wy r0 = X.AnonymousClass3MW.A0o()
            r4.A07 = r0
            X.1DT r0 = X.AnonymousClass3MW.A0L()
            r4.A00 = r0
            r4.A04 = r9
            r4.A01 = r6
            r4.A05 = r10
            r4.A06 = r11
            r4.A03 = r8
            r4.A02 = r7
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            r1 = 22
            r0 = 0
            X.8kt r2 = new X.8kt
            r2.<init>(r4, r1, r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0050
            boolean r0 = r10.A06()
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            int r0 = r10.A02(r0)
            if (r0 == 0) goto L_0x0050
            X.118 r0 = r4.A04
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "location"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r1 = 0
        L_0x0051:
            r2.A00 = r1
            r3.add(r2)
            r2 = 42
            r1 = 2
            X.8ks r0 = new X.8ks
            r0.<init>(r4, r2, r1)
            r3.add(r0)
            X.1DT r0 = r4.A00
            r0.A0E(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.viewmodel.LocationOptionPickerViewModel.<init>(android.app.Application, X.AM5, X.8ve, X.A5L, X.118, X.17x, X.1XN):void");
    }
}
