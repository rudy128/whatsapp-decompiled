package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.A34;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass1FB;
import X.AnonymousClass3Ma;
import X.AnonymousClass47N;
import X.AnonymousClass47Z;
import X.C110885hR;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C85314Mx;
import X.C87864Xj;
import X.C91034f2;
import X.C91814gI;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.collections.MarginCorrectedViewPager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class DownloadableWallpaperPreviewActivity extends AnonymousClass47N {
    public MarginCorrectedViewPager A00;
    public C87864Xj A01;
    public List A02;
    public List A03;
    public Resources A04;
    public AnonymousClass47Z A05;
    public C85314Mx A06;
    public boolean A07;
    public final Set A08;

    public DownloadableWallpaperPreviewActivity() {
        this(0);
        this.A08 = C17880vN.A12();
        this.A06 = new C85314Mx(this);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C110885hR.A0A(this, 2131429504).setBackgroundColor(AnonymousClass3Ma.A00(this, 2130970830, 2131102245));
        this.A00.setEnabled(false);
        try {
            this.A04 = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
        } catch (PackageManager.NameNotFoundException e) {
            Log.e("DownloadableWallpaperPreviewActivity/com.whatsapp.wallpaper could not be found.", e);
        }
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("THUMBNAIL_URIS_KEY");
        C17960vV.A07(parcelableArrayListExtra);
        this.A02 = parcelableArrayListExtra;
        ArrayList<Integer> integerArrayListExtra = getIntent().getIntegerArrayListExtra("WHATSAPP_THUMBNAIL_RES_KEY");
        this.A03 = getIntent().getIntegerArrayListExtra("WHATSAPP_FULL_RES_KEY");
        this.A00 = (MarginCorrectedViewPager) C110885hR.A0A(this, 2131436980);
        AnonymousClass10I r9 = this.A05;
        C87864Xj r7 = this.A01;
        AnonymousClass47Z r3 = new AnonymousClass47Z(this, this.A04, this.A00, r7, this.A06, r9, this.A02, integerArrayListExtra, this.A03, this.A01);
        this.A05 = r3;
        this.A00.setAdapter(r3);
        this.A00.setPageMargin(getResources().getDimensionPixelOffset(2131166582));
        this.A00.A0K(new C91814gI(this, 1));
        this.A00.setCurrentItem(getIntent().getIntExtra("STARTING_POSITION_KEY", 0));
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass47N.A0V(A0L, r1, this);
            this.A01 = (C87864Xj) r1.A1a.get();
        }
    }

    public void onDestroy() {
        Iterator A0l = C17890vO.A0l(this.A05.A06);
        while (A0l.hasNext()) {
            ((A34) A0l.next()).A0B(true);
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C72453Mb.A13(this);
        return true;
    }

    public void onBackPressed() {
        C72453Mb.A13(this);
    }

    public DownloadableWallpaperPreviewActivity(int i) {
        this.A07 = false;
        C91034f2.A00(this, 41);
    }
}
