package com.whatsapp.location;

import X.A59;
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
import X.AnonymousClass1KB;
import X.AnonymousClass1KW;
import X.AnonymousClass1L2;
import X.AnonymousClass1L4;
import X.AnonymousClass1L9;
import X.AnonymousClass1LU;
import X.AnonymousClass1PM;
import X.AnonymousClass1RB;
import X.AnonymousClass1VW;
import X.AnonymousClass1W6;
import X.AnonymousClass689;
import X.AnonymousClass75M;
import X.AnonymousClass78K;
import X.AnonymousClass8BU;
import X.BIS;
import X.BPT;
import X.C010105w;
import X.C110885hR;
import X.C1193267r;
import X.C17960vV;
import X.C18000vb;
import X.C18010vc;
import X.C18030ve;
import X.C19620yd;
import X.C19830z4;
import X.C198679yj;
import X.C19880zA;
import X.C20269AEc;
import X.C219217x;
import X.C23798Bph;
import X.C23997Bte;
import X.C24000Bth;
import X.C24002Bto;
import X.C25007CTh;
import X.C25478CgX;
import X.C25491Ok;
import X.C25612Cis;
import X.C27131Uv;
import X.C27191Vc;
import X.C33251iW;
import X.C88184Yq;
import X.D44;
import X.DAB;
import X.DAE;
import X.E46;
import android.app.Dialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.wds.components.search.WDSSearchBar;

public class LocationPicker extends C23798Bph {
    public float A00;
    public float A01;
    public Bundle A02;
    public DAE A03;
    public BPT A04;
    public C25478CgX A05;
    public C25478CgX A06;
    public AnonymousClass195 A07;
    public AnonymousClass1RB A08;
    public AnonymousClass181 A09;
    public C33251iW A0A;
    public AnonymousClass1VW A0B;
    public AnonymousClass1PM A0C;
    public C25491Ok A0D;
    public C27191Vc A0E;
    public C88184Yq A0F;
    public AnonymousClass118 A0G;
    public C219217x A0H;
    public AnonymousClass1CJ A0I;
    public C1193267r A0J;
    public AnonymousClass18K A0K;
    public AnonymousClass1D9 A0L;
    public AnonymousClass1LU A0M;
    public C24000Bth A0N;
    public AnonymousClass75M A0O;
    public C27131Uv A0P;
    public AnonymousClass689 A0Q;
    public WhatsAppLibLoader A0R;
    public C18010vc A0S;
    public AnonymousClass129 A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public boolean A0Z;
    public C25478CgX A0a;
    public final E46 A0b = new DAB(this, 3);

    public static void A0Q(C20269AEc aEc, LocationPicker locationPicker) {
        C17960vV.A07(locationPicker.A03);
        BPT bpt = locationPicker.A04;
        if (bpt == null) {
            C25612Cis cis = new C25612Cis();
            cis.A00 = aEc;
            cis.A01 = locationPicker.A0a;
            DAE dae = locationPicker.A03;
            BPT bpt2 = new BPT(dae, cis);
            dae.A0B(bpt2);
            bpt2.A0D = dae;
            locationPicker.A04 = bpt2;
            return;
        }
        bpt.A0B(aEc);
        locationPicker.A04.A05(true);
    }

    public void onBackPressed() {
        if (!this.A0O.A0c()) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.onCreate(bundle2);
        setTitle(2131895705);
        C18030ve r4 = this.A0E;
        AnonymousClass11P r3 = this.A05;
        AnonymousClass18K r2 = this.A0K;
        C198679yj r48 = new C198679yj(this.A09, r3, r4, r2, this.A0L);
        AnonymousClass118 r32 = this.A0G;
        AnonymousClass11P r31 = this.A05;
        C18030ve r42 = this.A0E;
        AnonymousClass1KB r58 = this.A05;
        AnonymousClass1L4 r53 = this.A09;
        AnonymousClass190 r57 = this.A03;
        AnonymousClass11S r56 = this.A02;
        AnonymousClass1LU r44 = this.A0M;
        AnonymousClass10I r54 = this.A05;
        AnonymousClass1CJ r36 = this.A0I;
        AnonymousClass181 r55 = this.A09;
        AnonymousClass1KW r29 = this.A0D;
        C33251iW r28 = this.A0A;
        C1193267r r24 = this.A0J;
        AnonymousClass1D9 r23 = this.A0L;
        AnonymousClass1L9 r22 = this.A01;
        AnonymousClass689 r21 = this.A0Q;
        AnonymousClass1VW r25 = this.A0B;
        AnonymousClass129 r20 = this.A0T;
        AnonymousClass11C r19 = this.A08;
        C18000vb r18 = this.A00;
        C25491Ok r27 = this.A0D;
        WhatsAppLibLoader whatsAppLibLoader = this.A0R;
        AnonymousClass1PM r26 = this.A0C;
        C219217x r16 = this.A0H;
        C19830z4 r15 = this.A0A;
        AnonymousClass1RB r10 = this.A08;
        C27131Uv r9 = this.A0P;
        C18010vc r8 = this.A0S;
        AnonymousClass195 r7 = this.A07;
        C27191Vc r6 = this.A0E;
        AnonymousClass1L2 r43 = this.A0C;
        C88184Yq r33 = this.A0F;
        AnonymousClass129 r52 = r20;
        C24002Bto bto = new C24002Bto((C19880zA) this.A0X.get(), r22, r7, r57, r10, r58, r56, r55, r28, r25, r26, r27, r6, r33, r19, r31, r32, r16, r15, r18, r36, r43, (A59) this.A0V.get(), r24, r29, (EmojiSearchProvider) this.A0U.get(), r42, r23, r44, this, r9, r21, r48, whatsAppLibLoader, r8, (AnonymousClass1W6) this.A0W.get(), r52, r53, r54);
        this.A0O = bto;
        bto.A0V(bundle2, this);
        AnonymousClass78K.A00(this.A0O.A0A, this, 8);
        this.A0Q.A05(this);
        Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), 2131232818);
        Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), 2131232819);
        this.A05 = C25478CgX.A00(decodeResource);
        this.A06 = C25478CgX.A00(decodeResource2);
        this.A0a = C25478CgX.A00(this.A0O.A04);
        C25007CTh cTh = new C25007CTh();
        cTh.A00 = 1;
        cTh.A08 = true;
        cTh.A05 = false;
        cTh.A04 = "whatsapp_location_picker";
        this.A0N = new C23997Bte(this, cTh, this, 1);
        ((ViewGroup) C110885hR.A0A(this, 2131432278)).addView(this.A0N);
        this.A0N.A0F(bundle2);
        this.A02 = bundle2;
        if (this.A03 == null) {
            this.A03 = this.A0N.A0J(this.A0b);
        }
        this.A0O.A0K = (ImageView) C110885hR.A0A(this, 2131432893);
        AnonymousClass78K.A00(this.A0O.A0K, this, 9);
    }

    public Dialog onCreateDialog(int i) {
        C010105w A0I2 = this.A0O.A0I(i);
        if (A0I2 == null) {
            return super.onCreateDialog(i);
        }
        return A0I2;
    }

    public void onDestroy() {
        double d = BIS.A0n;
        this.A0O.A0J();
        if (this.A03 != null) {
            SharedPreferences.Editor A082 = AnonymousClass8BU.A08(this.A0S, C19620yd.A09);
            D44 A022 = this.A03.A02();
            C20269AEc aEc = A022.A03;
            A082.putFloat("share_location_lat", (float) aEc.A00);
            A082.putFloat("share_location_lon", (float) aEc.A01);
            A082.putFloat("share_location_zoom", A022.A02);
            A082.apply();
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.A0O.A0e(menuItem) || super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return false;
    }

    public void onPause() {
        double d = BIS.A0n;
        C24000Bth bth = this.A0N;
        SensorManager sensorManager = bth.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(bth.A0E);
        }
        AnonymousClass75M r1 = this.A0O;
        r1.A0f = r1.A19.A06();
        r1.A10.A05(r1);
        super.onPause();
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem findItem;
        if (this.A0O.A0i) {
            menu.findItem(2131432620).setVisible(false);
            findItem = menu.findItem(1);
        } else {
            if (!this.A0H.A06()) {
                findItem = menu.findItem(2131432620);
            }
            return true;
        }
        findItem.setVisible(false);
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        DAE dae = this.A03;
        if (dae != null) {
            D44 A022 = dae.A02();
            bundle.putFloat("camera_zoom", A022.A02);
            C20269AEc aEc = A022.A03;
            bundle.putDouble("camera_lat", aEc.A00);
            bundle.putDouble("camera_lng", aEc.A01);
            bundle.putInt("map_location_mode", this.A0N.A02);
        }
        this.A0N.A0G(bundle);
        this.A0O.A0U(bundle);
        super.onSaveInstanceState(bundle);
    }

    public boolean onSearchRequested() {
        WDSSearchBar.A01(this.A0O.A0W, true, true);
        return false;
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 2131432620, 0, 2131899369).setIcon(2131232271).setShowAsAction(2);
        menu.add(0, 1, 0, 2131894968).setIcon(2131232241).setShowAsAction(1);
        return true;
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.A0N.A0C();
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.A0O.A0S(intent);
    }

    public void onResume() {
        DAE dae;
        super.onResume();
        if (this.A0H.A06() != this.A0O.A0f) {
            invalidateOptionsMenu();
            if (this.A0H.A06() && (dae = this.A03) != null && !this.A0O.A0i) {
                dae.A0D(true);
            }
        }
        double d = BIS.A0n;
        this.A0N.A0K();
        if (this.A03 == null) {
            this.A03 = this.A0N.A0J(this.A0b);
        }
        this.A0O.A0K();
    }
}
