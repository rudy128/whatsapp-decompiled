package com.whatsapp.businessdirectory.view.activity;

import X.A5L;
import X.AA9;
import X.AGB;
import X.AM5;
import X.AP8;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass195;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1RB;
import X.AnonymousClass1XN;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4a6;
import X.AnonymousClass74O;
import X.AnonymousClass7CB;
import X.AnonymousClass8BT;
import X.AnonymousClass8BU;
import X.AnonymousClass8BV;
import X.BAW;
import X.C000200d;
import X.C010105w;
import X.C108965cb;
import X.C137116uw;
import X.C173738ve;
import X.C17880vN;
import X.C18000vb;
import X.C189329iu;
import X.C192699op;
import X.C19989A2b;
import X.C20041A4k;
import X.C20079A6f;
import X.C20151A9n;
import X.C21368Aix;
import X.C219217x;
import X.C22425B7h;
import X.C24001Bti;
import X.C25284Ccm;
import X.C27131Uv;
import X.C28516E5a;
import X.C40751vD;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.C73203Rj;
import X.DKQ;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.util.Log;

public class DirectorySetLocationMapActivity extends AnonymousClass1FY implements BAW {
    public Bundle A00;
    public C25284Ccm A01;
    public AnonymousClass195 A02;
    public C189329iu A03;
    public AnonymousClass1RB A04;
    public C40751vD A05;
    public AM5 A06;
    public C173738ve A07;
    public A5L A08;
    public C20041A4k A09;
    public AA9 A0A;
    public C219217x A0B;
    public C18000vb A0C;
    public AnonymousClass1LU A0D;
    public C24001Bti A0E;
    public C27131Uv A0F;
    public AnonymousClass1XN A0G;
    public AnonymousClass7CB A0H;
    public WhatsAppLibLoader A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public C192699op A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public final C28516E5a A0P;

    public static void A0Q(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        Double d;
        DirectorySetLocationMapActivity directorySetLocationMapActivity2 = directorySetLocationMapActivity;
        AA9 aa9 = directorySetLocationMapActivity.A0A;
        Double d2 = aa9.A09;
        if (d2 == null || (d = aa9.A0A) == null) {
            directorySetLocationMapActivity.A03();
        } else {
            directorySetLocationMapActivity.A0L.A01(AnonymousClass8BV.A09(d, d2.doubleValue()), directorySetLocationMapActivity2, (C19989A2b) null, aa9.A0C, "pin_on_map", 10.0f);
        }
    }

    public void A4c(C22425B7h b7h, Double d, Double d2) {
        C22425B7h b7h2 = b7h;
        if (!this.A07.A09()) {
            b7h.Bv5(-1, -1);
            return;
        }
        this.A05.CGF(new C21368Aix(this, d2, d, b7h2, 41));
    }

    public static void A0V(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        C25284Ccm ccm = directorySetLocationMapActivity.A01;
        if (ccm != null && ccm.A02() != null && directorySetLocationMapActivity.A01.A02().A03 != null) {
            LatLng latLng = directorySetLocationMapActivity.A01.A02().A03;
            AA9 aa9 = directorySetLocationMapActivity.A0A;
            aa9.A09 = Double.valueOf(latLng.A00);
            aa9.A0A = Double.valueOf(latLng.A01);
        }
    }

    public static void A0c(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        AA9 aa9 = directorySetLocationMapActivity.A0A;
        if (aa9.A09 == null || aa9.A0A == null) {
            directorySetLocationMapActivity.A03();
            return;
        }
        aa9.A08 = null;
        aa9.A06.setVisibility(0);
        AA9 aa92 = directorySetLocationMapActivity.A0A;
        directorySetLocationMapActivity.A4c(new AP8(directorySetLocationMapActivity, 0), aa92.A09, aa92.A0A);
    }

    public static void A0d(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        C25284Ccm ccm = directorySetLocationMapActivity.A01;
        if (ccm != null) {
            ccm.A0K(true);
            directorySetLocationMapActivity.A0A.A01();
            View view = directorySetLocationMapActivity.A0A.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            C24001Bti bti = directorySetLocationMapActivity.A0E;
            bti.A03 = 1;
            bti.A0A(1);
        }
    }

    public static void A0q(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        if (AnonymousClass74O.A0K(directorySetLocationMapActivity, directorySetLocationMapActivity.A0B, 2131894352, 2131894344, 34)) {
            directorySetLocationMapActivity.A0A.A01();
            View view = directorySetLocationMapActivity.A0A.A03;
            if (view != null) {
                view.setVisibility(0);
            }
            C24001Bti bti = directorySetLocationMapActivity.A0E;
            int i = bti.A03;
            if (i != 0) {
                if (i == 1) {
                    bti.setLocationMode(0);
                    return;
                } else if (i != 2) {
                    return;
                }
            }
            bti.setLocationMode(1);
        }
    }

    public static boolean A0r(DirectorySetLocationMapActivity directorySetLocationMapActivity) {
        Double d;
        if (TextUtils.isEmpty(directorySetLocationMapActivity.A0A.A0C)) {
            AA9 aa9 = directorySetLocationMapActivity.A0A;
            Double d2 = aa9.A09;
            if (d2 == null || (d = aa9.A0A) == null) {
                directorySetLocationMapActivity.A03();
            } else {
                directorySetLocationMapActivity.A4c(new AP8(directorySetLocationMapActivity, 1), d2, d);
                return false;
            }
        }
        return true;
    }

    public void A2y() {
        if (!this.A0M) {
            this.A0M = true;
            AnonymousClass10E r2 = C137116uw.A00(this).AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A00(r2, r1, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            this.A05 = C72453Mb.A0d(r2);
            this.A0D = AnonymousClass3MY.A0Z(r2);
            this.A0C = AnonymousClass10E.A6Q(r2);
            this.A0I = (WhatsAppLibLoader) r2.ABy.get();
            this.A0B = AnonymousClass3Ma.A0b(r2);
            this.A04 = (AnonymousClass1RB) r2.AUE.get();
            this.A0K = AnonymousClass8BT.A0f(r2);
            this.A0F = (C27131Uv) r2.A5p.get();
            this.A0G = AnonymousClass8BU.A0L(r1);
            this.A06 = AnonymousClass8BT.A0E(r1);
            this.A02 = (AnonymousClass195) r2.A0L.get();
            this.A0J = C000200d.A00(r1.A1W);
            this.A08 = (A5L) r1.A4P.get();
            this.A07 = (C173738ve) r1.A0f.get();
            this.A09 = (C20041A4k) r1.A8v.get();
            this.A0H = AnonymousClass8BT.A0O(r1);
            this.A03 = (C189329iu) r1.A1m.get();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x016b, code lost:
        r0 = r8.A09;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A4b(X.C25284Ccm r9) {
        /*
            r8 = this;
            X.Ccm r0 = r8.A01
            if (r0 != 0) goto L_0x01d4
            r8.A01 = r9
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap map is not available"
            X.C17960vV.A08(r9, r0)
            X.AA9 r2 = r8.A0A
            android.view.View r1 = r2.A03
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerView is not available"
            X.C17960vV.A08(r1, r0)
            android.view.View r1 = r2.A01
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerFillerView is not available"
            X.C17960vV.A08(r1, r0)
            android.view.View r1 = r2.A02
            java.lang.String r0 = "DirectorySetLocationMapActivity/setUpMap ui.centerPinView is not available"
            X.C17960vV.A08(r1, r0)
            r1 = 0
            r9.A0L(r1)
            X.Ccm r0 = r8.A01
            r0.A0J(r1)
            X.17x r0 = r8.A0B
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0064
            X.AA9 r0 = r8.A0A
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0064
            X.Ccm r1 = r8.A01
            r0 = 1
            r1.A0K(r0)
        L_0x003f:
            X.Ccm r0 = r8.A01
            X.CVJ r0 = r0.A01()
            r0.A00()
            X.Ccm r1 = r8.A01
            X.AJ9 r0 = new X.AJ9
            r0.<init>(r8)
            r1.A0G(r0)
            X.Ccm r1 = r8.A01
            X.AJ8 r0 = new X.AJ8
            r0.<init>(r8)
            r1.A0E(r0)
            X.Ccm r0 = r8.A01
            X.AJA r1 = new X.AJA
            r1.<init>(r8)
            goto L_0x007c
        L_0x0064:
            X.17x r0 = r8.A0B
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x003f
            X.AA9 r2 = r8.A0A
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x003f
            r1 = 1
            X.AP9 r0 = new X.AP9
            r0.<init>(r8, r1)
            r2.A02(r0)
            goto L_0x003f
        L_0x007c:
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x01cd }
            X.8RA r0 = new X.8RA     // Catch:{ RemoteException -> 0x01cd }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01cd }
            X.Cyz r2 = (X.C26399Cyz) r2     // Catch:{ RemoteException -> 0x01cd }
            android.os.Parcel r1 = r2.A04()     // Catch:{ RemoteException -> 0x01cd }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ RemoteException -> 0x01cd }
            r1.writeStrongBinder(r0)     // Catch:{ RemoteException -> 0x01cd }
            r0 = 42
            r2.A06(r0, r1)     // Catch:{ RemoteException -> 0x01cd }
            X.Ccm r0 = r8.A01
            X.AJ7 r1 = new X.AJ7
            r1.<init>(r8)
            com.google.android.gms.maps.internal.IGoogleMapDelegate r2 = r0.A01     // Catch:{ RemoteException -> 0x01c6 }
            X.8RB r0 = new X.8RB     // Catch:{ RemoteException -> 0x01c6 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x01c6 }
            X.Cyz r2 = (X.C26399Cyz) r2     // Catch:{ RemoteException -> 0x01c6 }
            android.os.Parcel r1 = r2.A04()     // Catch:{ RemoteException -> 0x01c6 }
            android.os.IBinder r0 = r0.asBinder()     // Catch:{ RemoteException -> 0x01c6 }
            r1.writeStrongBinder(r0)     // Catch:{ RemoteException -> 0x01c6 }
            r0 = 98
            r2.A06(r0, r1)     // Catch:{ RemoteException -> 0x01c6 }
            X.Ccm r1 = r8.A01
            X.AJ6 r0 = new X.AJ6
            r0.<init>(r8)
            r1.A0D(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131167634(0x7f070992, float:1.7949547E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.Ccm r0 = r8.A01
            r0.A07(r1, r1, r1, r1)
            android.os.Bundle r0 = r8.A00
            if (r0 == 0) goto L_0x013f
            java.lang.String r1 = "camera_zoom"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x010b
            android.os.Bundle r0 = r8.A00
            float r7 = r0.getFloat(r1)
            android.os.Bundle r1 = r8.A00
            java.lang.String r0 = "camera_lat"
            double r4 = r1.getDouble(r0)
            android.os.Bundle r1 = r8.A00
            java.lang.String r0 = "camera_lng"
            double r2 = r1.getDouble(r0)
            X.AA9 r6 = r8.A0A
            android.os.Bundle r1 = r8.A00
            java.lang.String r0 = "should_update_address"
            boolean r0 = r1.getBoolean(r0)
            r6.A0G = r0
            X.Ccm r1 = r8.A01
            com.google.android.gms.maps.model.LatLng r0 = new com.google.android.gms.maps.model.LatLng
            r0.<init>(r4, r2)
            X.CLK r0 = X.C26080Crv.A02(r0, r7)
            r1.A09(r0)
        L_0x010b:
            r0 = 0
            r8.A00 = r0
        L_0x010e:
            boolean r0 = X.C28281Zt.A0B(r8)
            if (r0 == 0) goto L_0x0120
            X.Ccm r1 = r8.A01
            r0 = 2132017211(0x7f14003b, float:1.9672694E38)
            X.Ba7 r0 = X.C23031Ba7.A00(r8, r0)
            r1.A0I(r0)
        L_0x0120:
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r0 = "country_name"
            java.lang.String r2 = r3.getStringExtra(r0)
            if (r2 == 0) goto L_0x0188
            X.AA9 r1 = r8.A0A
            r0 = 0
            r1.A08 = r0
            com.whatsapp.CircularProgressBar r1 = r1.A06
            r0 = 0
            r1.setVisibility(r0)
            X.10I r1 = r8.A05
            r0 = 36
            X.C21452AkJ.A00(r1, r8, r2, r0)
            return
        L_0x013f:
            X.AA9 r1 = r8.A0A
            java.lang.Double r0 = r1.A09
            if (r0 == 0) goto L_0x0163
            java.lang.Double r2 = r1.A0A
            if (r2 == 0) goto L_0x0163
            java.lang.Float r3 = r1.A0B
            if (r3 == 0) goto L_0x0163
            double r0 = r0.doubleValue()
            com.google.android.gms.maps.model.LatLng r2 = X.AnonymousClass8BV.A09(r2, r0)
            X.Ccm r1 = r8.A01
            float r0 = r3.floatValue()
        L_0x015b:
            X.CLK r0 = X.C26080Crv.A02(r2, r0)
            r1.A09(r0)
            goto L_0x010e
        L_0x0163:
            X.A5L r0 = r8.A08
            X.A6f r2 = r0.A02()
            if (r2 != 0) goto L_0x0175
            X.A4k r0 = r8.A09
            X.A6f r2 = r0.A00
            if (r2 != 0) goto L_0x0175
            X.A6f r2 = X.C20041A4k.A00(r0)
        L_0x0175:
            java.lang.String r1 = "city_default"
            java.lang.String r0 = r2.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x010e
            com.google.android.gms.maps.model.LatLng r2 = X.C20079A6f.A00(r2)
            X.Ccm r1 = r8.A01
            r0 = 1092616192(0x41200000, float:10.0)
            goto L_0x015b
        L_0x0188:
            java.lang.String r0 = "latitude"
            r1 = 4647503709213818880(0x407f400000000000, double:500.0)
            double r5 = r3.getDoubleExtra(r0, r1)
            java.lang.String r0 = "longitude"
            double r3 = r3.getDoubleExtra(r0, r1)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d4
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x01d4
            X.AA9 r1 = r8.A0A
            r0 = 0
            r1.A0F = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r1.A09 = r0
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r1.A0A = r0
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r5, r3)
            r0 = 1098907648(0x41800000, float:16.0)
            X.Ccm r1 = r8.A01
            X.C17960vV.A07(r1)
            X.CLK r0 = X.C26080Crv.A02(r2, r0)
            r1.A09(r0)
            return
        L_0x01c6:
            r1 = move-exception
            X.Da5 r0 = new X.Da5
            r0.<init>(r1)
            throw r0
        L_0x01cd:
            r1 = move-exception
            X.Da5 r0 = new X.Da5
            r0.<init>(r1)
            throw r0
        L_0x01d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.A4b(X.Ccm):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r2 == 7) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvo(X.C190599lD r6, int r7) {
        /*
            r5 = this;
            r0 = 24
            X.A9n r2 = new X.A9n
            r2.<init>(r5, r0)
            r5.CEx()
            r0 = -1
            if (r7 == r0) goto L_0x005f
            r0 = 1
            if (r7 == r0) goto L_0x0052
            r0 = 2
            if (r7 == r0) goto L_0x0052
            r0 = 3
            if (r7 == r0) goto L_0x0052
            r0 = 4
            if (r7 != r0) goto L_0x0051
            X.1vD r1 = r5.A05
            X.00H r0 = r5.A0K
            X.1o3 r0 = X.AnonymousClass3MW.A0a(r0)
            X.C196599vK.A00(r5, r1, r0)
        L_0x0024:
            X.00H r0 = r5.A0J
            java.lang.Object r4 = r0.get()
            X.AM7 r4 = (X.AM7) r4
            java.lang.String r0 = "imprecise_location_tile"
            java.util.HashMap r3 = r6.A00(r0)
            int r2 = r6.A00
            r1 = 28
            if (r2 == 0) goto L_0x0045
            r0 = 1
            if (r2 == r0) goto L_0x0043
            r0 = 4
            if (r2 == r0) goto L_0x0043
            r0 = 7
            r1 = 27
            if (r2 != r0) goto L_0x0045
        L_0x0043:
            r1 = 29
        L_0x0045:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r1 = r0.intValue()
            r0 = 7
            r4.BiG(r3, r0, r1)
        L_0x0051:
            return
        L_0x0052:
            r5.CEx()
            r1 = 2131887042(0x7f1203c2, float:1.940868E38)
            r0 = 2131887040(0x7f1203c0, float:1.9408676E38)
            X.C108965cb.A18(r5, r1, r0)
            goto L_0x0024
        L_0x005f:
            r5.CEx()
            X.3Rj r1 = X.AnonymousClass4a6.A00(r5)
            r0 = 2131887042(0x7f1203c2, float:1.940868E38)
            r1.A0E(r0)
            r0 = 2131887050(0x7f1203ca, float:1.9408696E38)
            r1.A0D(r0)
            r0 = 2131887092(0x7f1203f4, float:1.9408781E38)
            r1.A0Z(r2, r0)
            X.AnonymousClass8BU.A1A(r1)
            r1.A0C()
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.Bvo(X.9lD, int):void");
    }

    public void Bvp(C20079A6f a6f) {
        this.A0A.A08 = a6f;
        try {
            this.A07.A01(a6f);
            CEx();
            C72453Mb.A14(this);
        } catch (Exception e) {
            CEx();
            C108965cb.A18(this, 2131887042, 2131887040);
            this.A06.A05(C17880vN.A0j(), 28, 2);
            Log.e("DirectoryUserLocationPickerUI/onOptionsItemSelected Failed to store search location", e);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 34) {
            LocationSharingService.A03(getApplicationContext(), this.A02, this.A0B, this.A0F);
            if (i2 == -1) {
                AA9 aa9 = this.A0A;
                aa9.A0D = true;
                aa9.A0J.A02(true);
                A0d(this);
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r17) {
        /*
            r16 = this;
            r13 = r16
            r3 = r17
            super.onCreate(r3)
            r2 = 0
            if (r17 == 0) goto L_0x0012
            java.lang.String r0 = "zoom_to_user"
            boolean r0 = r3.getBoolean(r0, r2)
            r13.A0O = r0
        L_0x0012:
            X.9iu r4 = r13.A03
            X.AM5 r1 = r13.A06
            X.7CB r0 = r13.A0H
            X.9op r0 = r4.A00(r0, r1)
            r13.A0L = r0
            X.11S r10 = r13.A02
            X.11C r14 = r13.A08
            com.whatsapp.nativelibloader.WhatsAppLibLoader r15 = r13.A0I
            X.1RB r9 = r13.A04
            X.A5L r12 = r13.A08
            X.8ve r11 = r13.A07
            X.AA9 r8 = new X.AA9
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r13.A0A = r8
            r8.A07 = r13
            r0 = 2131625118(0x7f0e049e, float:1.8877435E38)
            r13.setContentView((int) r0)
            r0 = 2131895779(0x7f1225e3, float:1.94264E38)
            r13.setTitle(r0)
            android.view.View r1 = r13.A00
            r0 = 2131436270(0x7f0b22ee, float:1.8494406E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            androidx.appcompat.widget.Toolbar r0 = (androidx.appcompat.widget.Toolbar) r0
            X.01n r1 = X.C72463Mc.A0S(r13, r0)
            r0 = 1
            r1.A0G()
            r1.A0W(r0)
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r8.A0M
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "DirectoryUserLocationPickerUI/onCreate: aborting due to native libraries missing"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0062:
            r13.finish()
        L_0x0065:
            X.AA9 r4 = r13.A0A
            android.view.View r1 = r13.A00
            r0 = 2131432893(0x7f0b15bd, float:1.8487556E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0G(r1, r0)
            r4.A04 = r0
            X.C25407Cf9.A00(r13)
            com.google.android.gms.maps.GoogleMapOptions r4 = new com.google.android.gms.maps.GoogleMapOptions
            r4.<init>()
            r0 = 1
            r4.A00 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r4.A0C = r1
            r4.A05 = r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A08 = r0
            r4.A06 = r1
            r4.A0A = r0
            r4.A09 = r0
            X.8v8 r0 = new X.8v8
            r0.<init>(r13, r4, r13)
            r13.A0E = r0
            android.view.View r1 = r13.A00
            r0 = 2131432278(0x7f0b1356, float:1.8486309E38)
            android.view.ViewGroup r1 = X.AnonymousClass3MW.A0C(r1, r0)
            X.Bti r0 = r13.A0E
            r1.addView(r0)
            X.Bti r0 = r13.A0E
            r0.A05(r3)
            r13.A00 = r3
            X.Ccm r0 = r13.A01
            if (r0 != 0) goto L_0x00bb
            X.Bti r1 = r13.A0E
            X.E5a r0 = r13.A0P
            X.Ccm r0 = r1.A08(r0)
            r13.A01 = r0
        L_0x00bb:
            X.AA9 r0 = r13.A0A
            android.widget.ImageView r1 = r0.A04
            r0 = 14
            X.AFN.A00(r1, r13, r0)
            X.AA9 r0 = r13.A0A
            android.view.View r0 = r0.A01
            if (r0 == 0) goto L_0x00cd
            r0.setVisibility(r2)
        L_0x00cd:
            X.AA9 r3 = r13.A0A
            android.view.View r0 = r3.A02
            if (r0 == 0) goto L_0x00e4
            android.view.View r0 = r3.A01
            if (r0 == 0) goto L_0x00e4
            int r0 = r0.getHeight()
            android.view.animation.TranslateAnimation r1 = X.AnonymousClass8BY.A0D(r0)
            android.view.View r0 = r3.A02
            r0.startAnimation(r1)
        L_0x00e4:
            X.AA9 r0 = r13.A0A
            android.view.View r0 = r0.A03
            if (r0 == 0) goto L_0x00ed
            r0.setVisibility(r2)
        L_0x00ed:
            return
        L_0x00ee:
            X.11S r0 = r8.A0I
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x0062
            android.content.Intent r4 = r13.getIntent()
            java.lang.String r5 = "ARG_LATITUDE"
            boolean r0 = r4.hasExtra(r5)
            if (r0 == 0) goto L_0x0121
            java.lang.String r7 = "ARG_LONGITUDE"
            boolean r0 = r4.hasExtra(r7)
            if (r0 == 0) goto L_0x0121
            r0 = 0
            double r5 = r4.getDoubleExtra(r5, r0)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r8.A09 = r5
            double r0 = r4.getDoubleExtra(r7, r0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r8.A0A = r0
        L_0x0121:
            java.lang.String r1 = "ARG_ZOOM_LEVEL"
            r0 = 1098907648(0x41800000, float:16.0)
            float r0 = r4.getFloatExtra(r1, r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r8.A0B = r0
            java.lang.String r1 = "ARG_FULL_ADDRESS"
            boolean r0 = r4.hasExtra(r1)
            if (r0 == 0) goto L_0x013d
            java.lang.String r0 = r4.getStringExtra(r1)
            r8.A0C = r0
        L_0x013d:
            r0 = 2131434181(0x7f0b1ac5, float:1.8490169E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            com.whatsapp.CircularProgressBar r0 = (com.whatsapp.CircularProgressBar) r0
            r8.A06 = r0
            r0 = 2131431105(0x7f0b0ec1, float:1.848393E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r13, r0)
            r8.A05 = r0
            java.lang.String r0 = r8.A0C
            r8.A03(r0)
            X.A5L r1 = r8.A0K
            boolean r0 = r1.A05()
            r8.A0D = r0
            boolean r0 = r1.A05()
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            r8.A0E = r0
            android.view.View r1 = r13.A00
            r0 = 2131432268(0x7f0b134c, float:1.8486289E38)
            android.view.View r0 = X.AnonymousClass1HF.A06(r1, r0)
            r8.A03 = r0
            r0 = 2131432274(0x7f0b1352, float:1.84863E38)
            android.view.View r0 = r13.findViewById(r0)
            r8.A02 = r0
            r0 = 2131432271(0x7f0b134f, float:1.8486295E38)
            android.view.View r0 = r13.findViewById(r0)
            r8.A01 = r0
            android.view.View r1 = r13.A00
            r0 = 2131432893(0x7f0b15bd, float:1.8487556E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0G(r1, r0)
            r8.A04 = r0
            X.1FY r1 = r8.A07
            r0 = 2131436617(0x7f0b2449, float:1.849511E38)
            android.view.ViewGroup r0 = X.AnonymousClass3MX.A0F(r1, r0)
            android.animation.LayoutTransition r1 = r0.getLayoutTransition()
            r0 = 4
            r1.enableTransitionType(r0)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i) {
        AA9 aa9 = this.A0A;
        if (i == 2) {
            C20151A9n a9n = new C20151A9n(aa9, 27);
            C73203Rj A002 = AnonymousClass4a6.A00(aa9.A07);
            A002.A0E(2131890839);
            A002.A0D(2131890838);
            A002.A0X((DialogInterface.OnClickListener) null, 2131898766);
            A002.A0T(true);
            A002.A0Z(a9n, 2131887056);
            C010105w create = A002.create();
            if (create != null) {
                return create;
            }
        }
        return super.onCreateDialog(i);
    }

    public void onDestroy() {
        this.A0E.A01();
        super.onDestroy();
    }

    public void onPause() {
        this.A0E.A03();
        C24001Bti bti = this.A0E;
        SensorManager sensorManager = bti.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(bti.A0D);
        }
        this.A0N = this.A0B.A06();
        AA9 aa9 = this.A0A;
        aa9.A0H.A05(aa9);
        super.onPause();
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (this.A01 != null) {
            bundle.putFloat("camera_zoom", this.A0A.A0B.floatValue());
            Double d = this.A0A.A09;
            if (d != null) {
                bundle.putDouble("camera_lat", d.doubleValue());
            }
            Double d2 = this.A0A.A0A;
            if (d2 != null) {
                bundle.putDouble("camera_lng", d2.doubleValue());
            }
            bundle.putBoolean("should_update_address", this.A0A.A0G);
            bundle.putInt("map_location_mode", this.A0E.A03);
        }
        bundle.putBoolean("zoom_to_user", this.A0O);
        this.A0E.A06(bundle);
        this.A0A.A03.setVisibility(0);
        super.onSaveInstanceState(bundle);
    }

    public DirectorySetLocationMapActivity(int i) {
        this.A0M = false;
        AGB.A00(this, 32);
    }

    private void A03() {
        CEx();
        this.A0A.A06.setVisibility(8);
        this.A0A.A00();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 0, 0, getString(2131898925)).setShowAsAction(2);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0E.A02();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 0) {
            return super.onOptionsItemSelected(menuItem);
        }
        CNA(2131887073);
        if (!A0r(this)) {
            return true;
        }
        A0Q(this);
        return true;
    }

    public void onResume() {
        C25284Ccm ccm;
        super.onResume();
        if (this.A0B.A06() != this.A0N && this.A0B.A06() && this.A0A.A0D && (ccm = this.A01) != null) {
            ccm.A0K(true);
        }
        this.A0E.A04();
        this.A0E.A09();
        if (this.A01 == null) {
            this.A01 = this.A0E.A08(this.A0P);
        }
        AA9 aa9 = this.A0A;
        aa9.A0H.A06(aa9, "user-location-picker", 0.0f, 3, 5000, 1000);
    }

    public DirectorySetLocationMapActivity() {
        this(0);
        this.A0O = true;
        this.A0P = new DKQ(this, 0);
    }
}
