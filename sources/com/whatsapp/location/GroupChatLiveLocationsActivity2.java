package com.whatsapp.location;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass195;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1FY;
import X.AnonymousClass1KB;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1Q1;
import X.AnonymousClass1RB;
import X.AnonymousClass1VP;
import X.AnonymousClass1VW;
import X.AnonymousClass689;
import X.AnonymousClass78K;
import X.AnonymousClass8BU;
import X.BE9;
import X.BEB;
import X.C000200d;
import X.C010105w;
import X.C108955ca;
import X.C108985cd;
import X.C109005cf;
import X.C109015cg;
import X.C110885hR;
import X.C139086yC;
import X.C143087By;
import X.C146447Pd;
import X.C17880vN;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C19620yd;
import X.C219217x;
import X.C23164BcK;
import X.C23651Hc;
import X.C23998Btf;
import X.C23999Btg;
import X.C24001Bti;
import X.C24671Lf;
import X.C24681Lg;
import X.C24921Me;
import X.C25123CYw;
import X.C25134CZk;
import X.C25181Nf;
import X.C25191Ng;
import X.C25280Ccd;
import X.C25284Ccm;
import X.C25407Cf9;
import X.C26080Crv;
import X.C27101Us;
import X.C27131Uv;
import X.C27191Vc;
import X.C27201Vd;
import X.C28516E5a;
import X.C29831cw;
import X.C43251zV;
import X.C60072nL;
import X.C72043Kk;
import X.C91044f3;
import X.D59;
import X.DKI;
import X.DKQ;
import X.DUQ;
import X.E2G;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.SensorManager;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupChatLiveLocationsActivity2 extends AnonymousClass1FY {
    public float A00;
    public int A01;
    public Bundle A02;
    public MenuItem A03;
    public ImageView A04;
    public E2G A05;
    public C25284Ccm A06;
    public AnonymousClass195 A07;
    public AnonymousClass1RB A08;
    public C72043Kk A09;
    public C23651Hc A0A;
    public AnonymousClass1VP A0B;
    public AnonymousClass1VW A0C;
    public AnonymousClass1M9 A0D;
    public C24671Lf A0E;
    public C24921Me A0F;
    public C27201Vd A0G;
    public C27191Vc A0H;
    public C219217x A0I;
    public C25181Nf A0J;
    public AnonymousClass1MZ A0K;
    public C24681Lg A0L;
    public AnonymousClass1LU A0M;
    public C24001Bti A0N;
    public C143087By A0O;
    public C27131Uv A0P;
    public AnonymousClass689 A0Q;
    public C27101Us A0R;
    public C18010vc A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public Map A0W;
    public Set A0X;
    public boolean A0Y;
    public final C28516E5a A0Z;
    public volatile boolean A0a;
    public volatile boolean A0b;

    public static float A03(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, float f, float f2) {
        if (f <= 0.0f) {
            return f2;
        }
        C25284Ccm ccm = groupChatLiveLocationsActivity2.A06;
        C17960vV.A07(ccm);
        C23164BcK A022 = ccm.A00().A02();
        Location location = new Location("");
        LatLng latLng = A022.A02;
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        Location location2 = new Location("");
        LatLng latLng2 = A022.A03;
        location2.setLatitude(latLng2.A00);
        location2.setLongitude(latLng2.A01);
        double distanceTo = (double) location2.distanceTo(location);
        if (distanceTo <= 0.0d) {
            return f2;
        }
        float log = (float) (((double) groupChatLiveLocationsActivity2.A06.A02().A02) + (Math.log((distanceTo / ((double) f)) / 30.0d) / Math.log(2.0d)));
        if (log > 16.0f) {
            return 16.0f;
        }
        return log;
    }

    private void A0V(C25123CYw cYw, boolean z) {
        C17960vV.A07(this.A06);
        LatLngBounds A002 = cYw.A00();
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131166944);
        int i = dimensionPixelSize * 2;
        if (this.A0N.getHeight() > i && this.A0N.getWidth() > i) {
            if (!z) {
                this.A06.A05();
                this.A06.A09(C26080Crv.A03(A002, dimensionPixelSize));
                this.A0N.postDelayed(new C146447Pd(this, 49), 500);
            } else if (!this.A0a) {
                this.A0a = true;
                this.A06.A05();
                this.A06.A0A(C26080Crv.A03(A002, dimensionPixelSize), this.A05);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.C6N, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0c(com.whatsapp.location.GroupChatLiveLocationsActivity2 r12) {
        /*
            X.Ccm r2 = r12.A06
            if (r2 == 0) goto L_0x0153
            X.7By r1 = r12.A0O
            X.2nL r0 = r1.A0P
            r4 = 0
            r6 = 1
            if (r0 != 0) goto L_0x0122
            X.2nL r0 = r1.A0O
            if (r0 != 0) goto L_0x0122
            X.17x r0 = r12.A0I
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x001d
            X.Ccm r0 = r12.A06
            r0.A0K(r6)
        L_0x001d:
            X.Bti r0 = r12.A0N
            int r1 = r0.getWidth()
            X.Bti r0 = r12.A0N
            int r0 = r0.getHeight()
            if (r1 == 0) goto L_0x0153
            if (r0 == 0) goto L_0x0153
            java.util.Set r3 = r12.A0X
            java.util.ArrayList r11 = X.C17880vN.A10(r3)
            r3.clear()
            X.Ccm r0 = r12.A06
            X.CZk r8 = r0.A00()
            X.7By r7 = r12.A0O
            X.Ccm r0 = r12.A06
            r0.A02()
            X.C6N r5 = new X.C6N
            r5.<init>()
            r5.A01 = r8
            r0 = 0
            com.google.android.gms.maps.model.LatLng r2 = new com.google.android.gms.maps.model.LatLng
            r2.<init>(r0, r0)
            r8.A00(r2)
            r7.A0Y(r5)
            X.7By r0 = r12.A0O
            java.util.List r0 = r0.A1B
            java.util.Iterator r10 = r0.iterator()
        L_0x005f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x012d
            java.lang.Object r5 = r10.next()
            X.6yC r5 = (X.C139086yC) r5
            java.util.Map r9 = r12.A0W
            java.lang.String r8 = r5.A03
            java.lang.Object r2 = r9.get(r8)
            X.Ccd r2 = (X.C25280Ccd) r2
            com.google.android.gms.maps.model.LatLng r1 = r5.A00()
            if (r2 == 0) goto L_0x00ed
            java.lang.Object r7 = r2.A01()
            boolean r0 = r7 instanceof X.C139086yC
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r2.A09()
            if (r0 != 0) goto L_0x008c
            r2.A08(r6)
        L_0x008c:
            r2.A05(r1)
            X.6yC r7 = (X.C139086yC) r7
            int r1 = r7.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x009d
            int r1 = r7.A01
            int r0 = r5.A01
            if (r1 == r0) goto L_0x00b3
        L_0x009d:
            X.7By r0 = r12.A0O
            android.graphics.Bitmap r1 = r0.A0G(r5)
            X.7By r0 = r12.A0O
            java.lang.String r0 = r0.A0M(r5)
            r2.A07(r0)
            X.CLL r0 = X.CFF.A00(r1)
            r2.A04(r0)
        L_0x00b3:
            int r0 = r5.A00
            if (r0 != r6) goto L_0x00ba
            r8 = 1120403456(0x42c80000, float:100.0)
            goto L_0x00c6
        L_0x00ba:
            java.util.List r0 = r5.A04
            int r0 = r0.size()
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 <= r6) goto L_0x00c6
            r8 = 1112014848(0x42480000, float:50.0)
        L_0x00c6:
            X.EBq r7 = r2.A00     // Catch:{ RemoteException -> 0x0127 }
            X.Cyz r7 = (X.C26399Cyz) r7     // Catch:{ RemoteException -> 0x0127 }
            android.os.Parcel r1 = r7.A04()     // Catch:{ RemoteException -> 0x0127 }
            r1.writeFloat(r8)     // Catch:{ RemoteException -> 0x0127 }
            r0 = 27
            r7.A06(r0, r1)     // Catch:{ RemoteException -> 0x0127 }
            r2.A06(r5)
            X.2nL r1 = r5.A02
            X.7By r0 = r12.A0O
            X.2nL r0 = r0.A0Q
            if (r1 != r0) goto L_0x00e9
            r2.A03()
        L_0x00e4:
            r3.add(r2)
            goto L_0x005f
        L_0x00e9:
            r2.A02()
            goto L_0x00e4
        L_0x00ed:
            com.google.android.gms.maps.model.LatLng r7 = r5.A00()
            X.7By r0 = r12.A0O
            android.graphics.Bitmap r0 = r0.A0G(r5)
            X.BbF r2 = new X.BbF
            r2.<init>()
            X.CLL r0 = X.CFF.A00(r0)
            r2.A07 = r0
            X.7By r0 = r12.A0O
            java.lang.String r0 = r0.A0M(r5)
            r2.A09 = r0
            r1 = 1063172178(0x3f5eb852, float:0.87)
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.A00 = r0
            r2.A01 = r1
            X.Ccm r0 = r12.A06
            X.C17960vV.A07(r0)
            r2.A08 = r7
            X.Ccd r2 = r0.A03(r2)
            r9.put(r8, r2)
            goto L_0x00b3
        L_0x0122:
            r2.A0K(r4)
            goto L_0x001d
        L_0x0127:
            r0 = move-exception
            X.Da5 r0 = X.C27226Da5.A00(r0)
            throw r0
        L_0x012d:
            java.util.Iterator r2 = r11.iterator()
        L_0x0131:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r1 = r2.next()
            X.Ccd r1 = (X.C25280Ccd) r1
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L_0x0131
            java.lang.Object r0 = r1.A01()
            if (r0 == 0) goto L_0x0131
            boolean r0 = r1.A09()
            if (r0 == 0) goto L_0x0131
            r1.A08(r4)
            goto L_0x0131
        L_0x0153:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A0c(com.whatsapp.location.GroupChatLiveLocationsActivity2):void");
    }

    public static void A0d(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, List list, boolean z) {
        C17960vV.A07(groupChatLiveLocationsActivity2.A06);
        if (list.size() != 1) {
            C25123CYw cYw = new C25123CYw();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C60072nL r0 = (C60072nL) it.next();
                cYw.A01(new LatLng(r0.A00, r0.A01));
            }
            groupChatLiveLocationsActivity2.A0V(cYw, z);
        } else if (!z) {
            groupChatLiveLocationsActivity2.A06.A09(C26080Crv.A02(new LatLng(((C60072nL) list.get(0)).A00, ((C60072nL) list.get(0)).A01), 16.0f));
        } else if (!groupChatLiveLocationsActivity2.A0a) {
            groupChatLiveLocationsActivity2.A0a = true;
            groupChatLiveLocationsActivity2.A06.A0A(C26080Crv.A02(new LatLng(((C60072nL) list.get(0)).A00, ((C60072nL) list.get(0)).A01), 16.0f), groupChatLiveLocationsActivity2.A05);
        }
    }

    public static void A0q(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2, boolean z) {
        if (groupChatLiveLocationsActivity2.A06 != null && !groupChatLiveLocationsActivity2.A0O.A0W) {
            Set set = groupChatLiveLocationsActivity2.A0X;
            if (set.isEmpty()) {
                return;
            }
            if (groupChatLiveLocationsActivity2.A0N.getWidth() <= 0 || groupChatLiveLocationsActivity2.A0N.getHeight() <= 0) {
                groupChatLiveLocationsActivity2.A0N.getViewTreeObserver().addOnGlobalLayoutListener(new D59(groupChatLiveLocationsActivity2, 2));
            } else if (!z || !groupChatLiveLocationsActivity2.A0a) {
                ArrayList A10 = C17880vN.A10(set);
                C17960vV.A07(groupChatLiveLocationsActivity2.A06);
                if (!A10.isEmpty()) {
                    LatLng A0I2 = groupChatLiveLocationsActivity2.A0O.A0I();
                    if (A0I2 != null) {
                        Collections.sort(A10, new DUQ(A0I2.A00, A0I2.A01, 1));
                    }
                    C25123CYw cYw = new C25123CYw();
                    C25123CYw cYw2 = new C25123CYw();
                    cYw2.A01(((C25280Ccd) A10.get(0)).A00());
                    cYw.A01(((C25280Ccd) A10.get(0)).A00());
                    int i = 1;
                    while (i < A10.size()) {
                        C25280Ccd ccd = (C25280Ccd) A10.get(i);
                        cYw2.A01(ccd.A00());
                        if (!C143087By.A0F(cYw2.A00())) {
                            break;
                        }
                        cYw.A01(ccd.A00());
                        i++;
                    }
                    if (i == 1) {
                        Object A012 = ((C25280Ccd) A10.get(0)).A01();
                        C17960vV.A07(A012);
                        A0d(groupChatLiveLocationsActivity2, ((C139086yC) A012).A04, z);
                        return;
                    }
                    groupChatLiveLocationsActivity2.A0V(cYw, z);
                }
            } else {
                groupChatLiveLocationsActivity2.A0b = true;
            }
        }
    }

    public static boolean A0r(LatLng latLng, GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        C25284Ccm ccm = groupChatLiveLocationsActivity2.A06;
        C17960vV.A07(ccm);
        C25134CZk A002 = ccm.A00();
        if (A002.A02().A04.A00(latLng)) {
            return false;
        }
        if (latLng.A00 >= A002.A02().A04.A01.A00) {
            return true;
        }
        Point A003 = A002.A00(A002.A02().A04.A01);
        A003.offset(0, groupChatLiveLocationsActivity2.A0O.A02);
        return !new LatLngBounds(A002.A01(A003), A002.A02().A04.A00).A00(latLng);
    }

    public void A2y() {
        if (!this.A0Y) {
            this.A0Y = true;
            AnonymousClass10E A0A2 = C109005cf.A0A(C108955ca.A0K(this), this);
            BEB.A10(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            BEB.A0x(A0A2, r2, this);
            C109015cg.A03(A0A2, r2, this, r2.A5A);
            this.A0M = BE9.A0a(A0A2);
            this.A0B = (AnonymousClass1VP) A0A2.A1l.get();
            this.A0G = BE9.A0Y(A0A2);
            this.A0Q = (AnonymousClass689) A0A2.A5q.get();
            this.A0C = BE9.A0W(A0A2);
            this.A0D = AnonymousClass10E.A50(A0A2);
            this.A0F = C108985cd.A0R(A0A2);
            this.A0E = (C24671Lf) A0A2.A2g.get();
            this.A0L = (C24681Lg) A0A2.A6Y.get();
            this.A0T = C000200d.A00(A0A2.A2A);
            this.A0I = (C219217x) A0A2.ABj.get();
            this.A08 = (AnonymousClass1RB) A0A2.AUE.get();
            this.A0V = C000200d.A00(A0A2.A9c);
            this.A0P = (C27131Uv) A0A2.A5p.get();
            this.A0K = (AnonymousClass1MZ) A0A2.A4t.get();
            this.A0S = (C18010vc) A0A2.A9s.get();
            this.A07 = (AnonymousClass195) A0A2.A0L.get();
            this.A0J = (C25181Nf) A0A2.A2o.get();
            this.A0H = (C27191Vc) A0A2.A2i.get();
            this.A0U = C000200d.A00(A0A2.A4u);
            this.A09 = (C72043Kk) r2.A1j.get();
            this.A0R = (C27101Us) A0A2.A5r.get();
            this.A0A = (C23651Hc) A0A2.ACD.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (!this.A0O.A0b(i, i2)) {
            super.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        AnonymousClass11P r27 = this.A05;
        C18030ve r26 = this.A0E;
        AnonymousClass1KB r25 = this.A05;
        AnonymousClass11S r22 = this.A02;
        AnonymousClass1LU r19 = this.A0M;
        AnonymousClass10I r18 = this.A05;
        AnonymousClass1L9 r41 = this.A01;
        C27201Vd r24 = this.A0G;
        AnonymousClass689 r17 = this.A0Q;
        AnonymousClass1VW r20 = this.A0C;
        AnonymousClass1M9 r21 = this.A0D;
        C24921Me r23 = this.A0F;
        C18000vb r16 = this.A00;
        C24671Lf r15 = this.A0E;
        C24681Lg r14 = this.A0L;
        C23651Hc r13 = this.A0A;
        C219217x r12 = this.A0I;
        AnonymousClass1RB r11 = this.A08;
        C27131Uv r8 = this.A0P;
        AnonymousClass195 r7 = this.A07;
        AnonymousClass1L9 r142 = r41;
        AnonymousClass195 r152 = r7;
        this.A0O = new C23999Btg(r142, r152, r11, r25, r22, r13, r20, r21, r15, r23, r24, this.A0H, (C29831cw) this.A0V.get(), r27, r12, r16, (AnonymousClass1Q1) this.A0T.get(), r14, r26, (C25191Ng) this.A0U.get(), r19, r8, r17, this.A0R, r18, this, 1);
        getSupportActionBar().A0W(true);
        setContentView(2131625535);
        C25181Nf r4 = this.A0J;
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(getIntent().getStringExtra("jid"));
        C17960vV.A07(A022);
        AnonymousClass1E7 A012 = r4.A01(A022);
        getSupportActionBar().A0S(C43251zV.A05(this, this.A0D, this.A0F.A0P(A012)));
        this.A0O.A0U(this, bundle2);
        C25407Cf9.A00(this);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        googleMapOptions.A05 = AnonymousClass000.A0h();
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = true;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0N = new C23998Btf(this, googleMapOptions, this, 0);
        ((ViewGroup) C110885hR.A0A(this, 2131432278)).addView(this.A0N);
        this.A0N.A05(bundle2);
        ImageView imageView = (ImageView) C110885hR.A0A(this, 2131432893);
        this.A04 = imageView;
        AnonymousClass78K.A00(imageView, this, 6);
        this.A02 = bundle2;
        A0Q();
    }

    public Dialog onCreateDialog(int i) {
        C010105w A0H2 = this.A0O.A0H(i);
        if (A0H2 == null) {
            return super.onCreateDialog(i);
        }
        return A0H2;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        SharedPreferences.Editor putBoolean;
        C25284Ccm ccm;
        int i;
        if (this.A06 != null) {
            int itemId = menuItem.getItemId();
            if (itemId == 2131432283) {
                this.A06.A06(1);
                putBoolean = AnonymousClass8BU.A08(this.A0S, C19620yd.A09).putInt("live_location_map_type", 1);
            } else {
                if (itemId == 2131432284) {
                    ccm = this.A06;
                    i = 4;
                } else if (itemId == 2131432285) {
                    ccm = this.A06;
                    i = 3;
                } else if (itemId == 2131432282) {
                    boolean z = !this.A06.A0M();
                    this.A06.A0L(z);
                    this.A03.setChecked(z);
                    putBoolean = AnonymousClass8BU.A08(this.A0S, C19620yd.A09).putBoolean("live_location_show_traffic", z);
                } else if (itemId == 16908332) {
                    finish();
                    return true;
                }
                ccm.A06(i);
                putBoolean = AnonymousClass8BU.A08(this.A0S, C19620yd.A09).putInt("live_location_map_type", i);
            }
            putBoolean.apply();
            return true;
        }
        return false;
    }

    public void onSaveInstanceState(Bundle bundle) {
        C25284Ccm ccm = this.A06;
        if (ccm != null) {
            CameraPosition A022 = ccm.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0N.A03);
        }
        this.A0N.A06(bundle);
        this.A0O.A0V(bundle);
        super.onSaveInstanceState(bundle);
    }

    public GroupChatLiveLocationsActivity2(int i) {
        this.A0Y = false;
        C91044f3.A00(this, 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r3.A0I.A06() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0Q() {
        /*
            r3 = this;
            X.C17960vV.A02()
            X.Ccm r0 = r3.A06
            if (r0 != 0) goto L_0x0011
            X.Bti r1 = r3.A0N
            X.E5a r0 = r3.A0Z
            X.Ccm r0 = r1.A08(r0)
            r3.A06 = r0
        L_0x0011:
            android.widget.ImageView r2 = r3.A04
            X.7By r0 = r3.A0O
            X.2nL r0 = r0.A0O
            if (r0 != 0) goto L_0x0022
            X.17x r0 = r3.A0I
            boolean r1 = r0.A06()
            r0 = 0
            if (r1 != 0) goto L_0x0024
        L_0x0022:
            r0 = 8
        L_0x0024:
            r2.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.location.GroupChatLiveLocationsActivity2.A0Q():void");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C25284Ccm ccm;
        getMenuInflater().inflate(2131820568, menu);
        MenuItem findItem = menu.findItem(2131432282);
        this.A03 = findItem;
        if (findItem == null || (ccm = this.A06) == null) {
            return true;
        }
        findItem.setChecked(ccm.A0M());
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0N.A01();
        this.A0O.A0O();
        if (this.A06 != null) {
            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(this.A0S, C19620yd.A09);
            CameraPosition A022 = this.A06.A02();
            LatLng latLng = A022.A03;
            A082.putFloat("live_location_lat", (float) latLng.A00);
            A082.putFloat("live_location_lng", (float) latLng.A01);
            A082.putFloat("live_location_zoom", A022.A02);
            A082.apply();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0N.A02();
    }

    public void onPause() {
        super.onPause();
        this.A0N.A03();
        C24001Bti bti = this.A0N;
        SensorManager sensorManager = bti.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(bti.A0D);
        }
        this.A0O.A0P();
    }

    public void onResume() {
        super.onResume();
        this.A0N.A04();
        this.A0N.A09();
        this.A0O.A0Q();
        A0Q();
    }

    public GroupChatLiveLocationsActivity2() {
        this(0);
        this.A0X = C17880vN.A12();
        this.A0W = C17880vN.A11();
        this.A01 = 0;
        this.A00 = -1.0f;
        this.A0b = false;
        this.A05 = new DKI(this, 1);
        this.A0Z = new DKQ(this, 2);
    }
}
