package com.whatsapp.location;

import X.A59;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass129;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass190;
import X.AnonymousClass195;
import X.AnonymousClass1CJ;
import X.AnonymousClass1D9;
import X.AnonymousClass1HF;
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1M9;
import X.AnonymousClass1PM;
import X.AnonymousClass1RB;
import X.AnonymousClass1VW;
import X.AnonymousClass1W6;
import X.AnonymousClass4aV;
import X.AnonymousClass4aX;
import X.AnonymousClass689;
import X.AnonymousClass736;
import X.AnonymousClass75M;
import X.AnonymousClass78K;
import X.AnonymousClass8BU;
import X.C010105w;
import X.C110885hR;
import X.C1193267r;
import X.C134196qC;
import X.C136736uJ;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C19620yd;
import X.C19740yt;
import X.C19830z4;
import X.C198679yj;
import X.C19880zA;
import X.C219217x;
import X.C23100BbF;
import X.C23799Bpj;
import X.C23998Btf;
import X.C24001Bti;
import X.C24002Bto;
import X.C24261Jm;
import X.C24921Me;
import X.C25280Ccd;
import X.C25284Ccm;
import X.C25407Cf9;
import X.C25491Ok;
import X.C27131Uv;
import X.C27191Vc;
import X.C27201Vd;
import X.C28516E5a;
import X.C31131f4;
import X.C31161f7;
import X.C31181f9;
import X.C33251iW;
import X.C37451pZ;
import X.C87544Vz;
import X.C88184Yq;
import X.CFF;
import X.CLL;
import X.CLr;
import X.DKQ;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.wds.components.search.WDSSearchBar;

public class LocationPicker2 extends C23799Bpj {
    public Bundle A00;
    public View A01;
    public C25284Ccm A02;
    public CLL A03;
    public CLL A04;
    public C25280Ccd A05;
    public AnonymousClass195 A06;
    public AnonymousClass1RB A07;
    public AnonymousClass181 A08;
    public C33251iW A09;
    public AnonymousClass1VW A0A;
    public AnonymousClass1M9 A0B;
    public AnonymousClass1PM A0C;
    public C24921Me A0D;
    public C25491Ok A0E;
    public C37451pZ A0F;
    public C27201Vd A0G;
    public C27191Vc A0H;
    public C88184Yq A0I;
    public C134196qC A0J;
    public C31131f4 A0K;
    public AnonymousClass118 A0L;
    public C219217x A0M;
    public AnonymousClass1CJ A0N;
    public C1193267r A0O;
    public AnonymousClass18K A0P;
    public AnonymousClass736 A0Q;
    public AnonymousClass1D9 A0R;
    public AnonymousClass1LU A0S;
    public CLr A0T;
    public C24001Bti A0U;
    public AnonymousClass75M A0V;
    public C27131Uv A0W;
    public AnonymousClass689 A0X;
    public WhatsAppLibLoader A0Y;
    public C18010vc A0Z;
    public AnonymousClass129 A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public AnonymousClass00H A0g;
    public AnonymousClass00H A0h;
    public boolean A0i;
    public CLL A0j;
    public BottomSheetBehavior A0k;
    public final C28516E5a A0l = new DKQ(this, 3);

    public static void A0V(LatLng latLng, LocationPicker2 locationPicker2) {
        C25284Ccm ccm = locationPicker2.A02;
        C17960vV.A07(ccm);
        C25280Ccd ccd = locationPicker2.A05;
        if (ccd == null) {
            C23100BbF bbF = new C23100BbF();
            bbF.A08 = latLng;
            bbF.A07 = locationPicker2.A0j;
            locationPicker2.A05 = ccm.A03(bbF);
            return;
        }
        ccd.A05(latLng);
        locationPicker2.A05.A08(true);
    }

    public void onBackPressed() {
        if (!this.A0V.A0c()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(2131895705);
        C18030ve r4 = this.A0E;
        AnonymousClass11P r3 = this.A05;
        AnonymousClass18K r2 = this.A0P;
        C198679yj r48 = new C198679yj(this.A08, r3, r4, r2, this.A0R);
        AnonymousClass118 r32 = this.A0L;
        AnonymousClass11P r31 = this.A05;
        C18030ve r42 = this.A0E;
        AnonymousClass1KB r58 = this.A05;
        AnonymousClass1L4 r53 = this.A09;
        AnonymousClass190 r57 = this.A03;
        AnonymousClass11S r56 = this.A02;
        AnonymousClass1LU r44 = this.A0S;
        AnonymousClass10I r54 = this.A05;
        AnonymousClass1CJ r36 = this.A0N;
        AnonymousClass181 r55 = this.A08;
        AnonymousClass1KW r29 = this.A0D;
        C33251iW r28 = this.A09;
        C1193267r r24 = this.A0O;
        AnonymousClass1D9 r23 = this.A0R;
        AnonymousClass1L9 r22 = this.A01;
        AnonymousClass689 r21 = this.A0X;
        AnonymousClass1VW r25 = this.A0A;
        AnonymousClass129 r20 = this.A0a;
        AnonymousClass11C r19 = this.A08;
        C18000vb r18 = this.A00;
        C25491Ok r27 = this.A0E;
        WhatsAppLibLoader whatsAppLibLoader = this.A0Y;
        AnonymousClass1PM r26 = this.A0C;
        C219217x r16 = this.A0M;
        C19830z4 r15 = this.A0A;
        AnonymousClass1RB r10 = this.A07;
        C27131Uv r9 = this.A0W;
        C18010vc r8 = this.A0Z;
        AnonymousClass195 r7 = this.A06;
        C27191Vc r6 = this.A0H;
        AnonymousClass1L2 r43 = this.A0C;
        C88184Yq r33 = this.A0I;
        AnonymousClass129 r52 = r20;
        C24002Bto bto = new C24002Bto((C19880zA) this.A0e.get(), r22, r7, r57, r10, r58, r56, r55, r28, r25, r26, r27, r6, r33, r19, r31, r32, r16, r15, r18, r36, r43, (A59) this.A0c.get(), r24, r29, (EmojiSearchProvider) this.A0b.get(), r42, r23, r44, this, r9, r21, r48, whatsAppLibLoader, r8, (AnonymousClass1W6) this.A0d.get(), r52, r53, r54);
        this.A0V = bto;
        bto.A0V(bundle2, this);
        AnonymousClass78K.A00(this.A0V.A0A, this, 10);
        C25407Cf9.A00(this);
        this.A03 = CFF.A00(BitmapFactory.decodeResource(getResources(), 2131232818));
        this.A04 = CFF.A00(BitmapFactory.decodeResource(getResources(), 2131232819));
        this.A0j = CFF.A00(this.A0V.A04);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.A00 = 1;
        Boolean A0h2 = AnonymousClass000.A0h();
        googleMapOptions.A0C = A0h2;
        googleMapOptions.A05 = A0h2;
        googleMapOptions.A08 = true;
        googleMapOptions.A06 = A0h2;
        googleMapOptions.A0A = true;
        googleMapOptions.A09 = true;
        this.A0U = new C23998Btf(this, googleMapOptions, this, 1);
        ((ViewGroup) C110885hR.A0A(this, 2131432278)).addView(this.A0U);
        this.A0U.A05(bundle2);
        this.A00 = bundle2;
        if (this.A02 == null) {
            this.A02 = this.A0U.A08(this.A0l);
        }
        this.A0V.A0K = (ImageView) C110885hR.A0A(this, 2131432893);
        AnonymousClass78K.A00(this.A0V.A0K, this, 11);
        boolean A002 = C87544Vz.A00(this.A0E);
        this.A0i = A002;
        if (A002) {
            View A062 = AnonymousClass1HF.A06(this.A00, 2131432239);
            this.A0k = new BottomSheetBehavior();
            ((C136736uJ) this.A0f.get()).A01(A062, this.A0k, this, this.A09);
            ((C136736uJ) this.A0f.get()).A03(this.A0k, false);
        }
    }

    public Dialog onCreateDialog(int i) {
        C010105w A0I2 = this.A0V.A0I(i);
        if (A0I2 == null) {
            return super.onCreateDialog(i);
        }
        return A0I2;
    }

    public void onDestroy() {
        this.A0U.A01();
        this.A0V.A0J();
        if (this.A02 != null) {
            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(this.A0Z, C19620yd.A09);
            CameraPosition A022 = this.A02.A02();
            LatLng latLng = A022.A03;
            A082.putFloat("share_location_lat", (float) latLng.A00);
            A082.putFloat("share_location_lon", (float) latLng.A01);
            A082.putFloat("share_location_zoom", A022.A02);
            A082.apply();
        }
        AnonymousClass4aV.A01(this.A01, this.A0K);
        C37451pZ r0 = this.A0F;
        if (r0 != null) {
            r0.A02();
            this.A0F = null;
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0V.A0e(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public void onPause() {
        this.A0U.A03();
        C24001Bti bti = this.A0U;
        SensorManager sensorManager = bti.A05;
        if (sensorManager != null) {
            sensorManager.unregisterListener(bti.A0D);
        }
        AnonymousClass75M r1 = this.A0V;
        r1.A0f = r1.A19.A06();
        r1.A10.A05(r1);
        AnonymousClass4aV.A06(this.A0K);
        ((C31161f7) this.A0g.get()).A01(this.A00);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0V.A0i) {
            menu.findItem(2131432620).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0M.A06()) {
                findItem = menu.findItem(2131432620);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onResume() {
        C25284Ccm ccm;
        super.onResume();
        if (this.A0M.A06() != this.A0V.A0f) {
            invalidateOptionsMenu();
            if (this.A0M.A06() && (ccm = this.A02) != null && !this.A0V.A0i) {
                ccm.A0K(true);
            }
        }
        this.A0U.A04();
        this.A0U.A09();
        if (this.A02 == null) {
            this.A02 = this.A0U.A08(this.A0l);
        }
        this.A0V.A0K();
        boolean z = ((C31161f7) this.A0g.get()).A03;
        View view = this.A00;
        if (z) {
            C18030ve r15 = this.A0E;
            AnonymousClass1KB r13 = this.A05;
            AnonymousClass11S r12 = this.A02;
            AnonymousClass10I r11 = this.A05;
            C27201Vd r10 = this.A0G;
            AnonymousClass1M9 r9 = this.A0B;
            C24921Me r8 = this.A0D;
            C18000vb r7 = this.A00;
            C134196qC r6 = this.A0J;
            C31131f4 r5 = this.A0K;
            AnonymousClass00H r4 = this.A0g;
            AnonymousClass00H r3 = this.A0h;
            View view2 = this.A01;
            C18030ve r26 = r15;
            C31131f4 r24 = r5;
            C134196qC r23 = r6;
            C27201Vd r22 = r10;
            C37451pZ r21 = this.A0F;
            C24921Me r20 = r8;
            AnonymousClass1M9 r19 = r9;
            AnonymousClass11S r18 = r12;
            AnonymousClass1KB r17 = r13;
            View view3 = view2;
            View view4 = view;
            Pair A002 = AnonymousClass4aV.A00(this, view4, view3, r17, r18, r19, r20, r21, r22, r23, r24, r7, r26, this.A0F, r11, r4, r3, "location-picker-activity");
            this.A01 = (View) A002.first;
            this.A0F = (C37451pZ) A002.second;
        } else if (C31181f9.A00(view)) {
            AnonymousClass4aV.A03(this.A00, this.A0K, this.A0g);
        }
        ((C31161f7) this.A0g.get()).A00();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C25284Ccm ccm = this.A02;
        if (ccm != null) {
            CameraPosition A022 = ccm.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            LatLng latLng = A022.A03;
            bundle.putDouble("camera_lat", latLng.A00);
            bundle.putDouble("camera_lng", latLng.A01);
            bundle.putInt("map_location_mode", this.A0U.A03);
        }
        this.A0U.A06(bundle);
        this.A0V.A0U(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        WDSSearchBar.A01(this.A0V.A0W, true, true);
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem icon = menu.add(0, 2131432620, 0, 2131899369).setIcon(2131232271);
        if (this.A0i) {
            icon.setIcon(2131232269);
        }
        icon.setShowAsAction(2);
        MenuItem icon2 = menu.add(0, 1, 0, 2131894968).setIcon(2131232241);
        if (this.A0i) {
            Drawable A002 = C24261Jm.A00(this, 2131232240);
            C17960vV.A07(A002);
            icon2.setIcon(AnonymousClass4aX.A08(A002, C19740yt.A00(this, 2131101352)));
        }
        icon2.setShowAsAction(1);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0U.A02();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0V.A0S(intent);
    }
}
