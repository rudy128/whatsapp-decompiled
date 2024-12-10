package com.whatsapp.settings.chat.wallpaper.downloadable.picker;

import X.A34;
import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1J8;
import X.AnonymousClass1LU;
import X.AnonymousClass28M;
import X.AnonymousClass3MY;
import X.AnonymousClass3XG;
import X.AnonymousClass47Q;
import X.AnonymousClass786;
import X.BLj;
import X.C110885hR;
import X.C17890vO;
import X.C18000vb;
import X.C19760yx;
import X.C200710s;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C85304Mw;
import X.C87864Xj;
import X.C91034f2;
import X.C91524fp;
import X.C98844ro;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DownloadableWallpaperPickerActivity extends AnonymousClass47Q {
    public View A00;
    public View A01;
    public C19760yx A02;
    public RecyclerView A03;
    public C18000vb A04;
    public AnonymousClass1LU A05;
    public C87864Xj A06;
    public AnonymousClass3XG A07;
    public List A08;
    public boolean A09;

    public DownloadableWallpaperPickerActivity() {
        this(0);
        this.A08 = AnonymousClass000.A13();
    }

    public static void A03(DownloadableWallpaperPickerActivity downloadableWallpaperPickerActivity) {
        int i;
        boolean A012 = AnonymousClass1J8.A01(downloadableWallpaperPickerActivity.A0E);
        C87864Xj r3 = downloadableWallpaperPickerActivity.A06;
        C200710s r2 = r3.A04;
        if (A012) {
            i = 33;
        } else {
            i = 34;
        }
        r2.execute(new C98844ro((Object) r3, i));
    }

    public void A2y() {
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A05 = AnonymousClass3MY.A0Z(A0L);
            this.A04 = AnonymousClass10E.A6Q(A0L);
            this.A06 = (C87864Xj) r1.A1a.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 111) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        int identifier;
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("IS_BRIGHT_KEY", true);
        int i = 2131898402;
        if (booleanExtra) {
            i = 2131898401;
        }
        AnonymousClass3MY.A0t(this, i);
        Resources resources = null;
        try {
            resources = getPackageManager().getResourcesForApplication("com.whatsapp.wallpaper");
            ArrayList A13 = AnonymousClass000.A13();
            ArrayList A132 = AnonymousClass000.A13();
            try {
                int identifier2 = resources.getIdentifier("wallpapers", "array", "com.whatsapp.wallpaper");
                if (identifier2 != 0) {
                    for (String str : resources.getStringArray(identifier2)) {
                        int identifier3 = resources.getIdentifier(str, "drawable", "com.whatsapp.wallpaper");
                        if (!(identifier3 == 0 || (identifier = resources.getIdentifier(AnonymousClass000.A0y("_small", AnonymousClass000.A11(str)), "drawable", "com.whatsapp.wallpaper")) == 0)) {
                            C17890vO.A1D(A13, identifier);
                            C17890vO.A1D(A132, identifier3);
                        }
                    }
                }
            } catch (Resources.NotFoundException e) {
                Log.e("WallpaperUtils/resource not found", e);
            }
            this.A02 = new C19760yx(A13, A132);
        } catch (PackageManager.NameNotFoundException e2) {
            Log.e("WallpaperCurrentPreviewActivity/com.whatsapp.wallpaper could not be found.", e2);
        }
        this.A01 = C110885hR.A0A(this, 2131436998);
        this.A00 = C110885hR.A0A(this, 2131436995);
        this.A03 = (RecyclerView) C110885hR.A0A(this, 2131436996);
        AnonymousClass3XG r2 = new AnonymousClass3XG(resources, this.A0E, new C85304Mw(this, booleanExtra), this.A05);
        this.A07 = r2;
        this.A03.setLayoutManager(new BLj(this, r2));
        this.A03.A0r(new AnonymousClass28M(this.A04, getResources().getDimensionPixelOffset(2131169305)));
        this.A03.setAdapter(this.A07);
        if (this.A06.A00.A06() == null) {
            A03(this);
        }
        C72463Mc.A0t(this);
        View A0A = C110885hR.A0A(this, 2131436997);
        A0A.setOnClickListener(new AnonymousClass786(this, A0A, 22));
        C87864Xj r3 = this.A06;
        r3.A04.execute(new C98844ro((Object) r3, 34));
        this.A06.A00.A0A(this, new C91524fp(A0A, this, 2, booleanExtra));
    }

    public void onDestroy() {
        super.onDestroy();
        Iterator A0l = C17890vO.A0l(this.A07.A05);
        while (A0l.hasNext()) {
            ((A34) A0l.next()).A0B(true);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C72453Mb.A13(this);
        return true;
    }

    public DownloadableWallpaperPickerActivity(int i) {
        this.A09 = false;
        C91034f2.A00(this, 40);
    }
}
