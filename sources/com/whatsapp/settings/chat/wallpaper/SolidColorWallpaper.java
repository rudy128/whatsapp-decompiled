package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FU;
import X.AnonymousClass1LU;
import X.AnonymousClass28M;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.C110885hR;
import X.C17880vN;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C72453Mb;
import X.C72463Mc;
import X.C72473Md;
import X.C72483Me;
import X.C73703Wz;
import X.C91034f2;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.MenuItem;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.collections.AutoFitGridLayoutManager;

public class SolidColorWallpaper extends AnonymousClass1FU {
    public static final int[] A06 = {2131888398, 2131888451, 2131888438, 2131888418, 2131888410, 2131888454, 2131888447, 2131888463, 2131888441, 2131888462, 2131888392, 2131888393, 2131888450, 2131888374, 2131888448, 2131888430, 2131888415, 2131888390, 2131888378, 2131888442, 2131888461, 2131888414, 2131888395, 2131888435, 2131888455, 2131888391, 2131888388};
    public C18000vb A00;
    public C18030ve A01;
    public AnonymousClass1LU A02;
    public int[] A03;
    public boolean A04;
    public int[] A05;

    public SolidColorWallpaper() {
        this(0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1 && i2 == -1) {
            if (getIntent().getIntExtra("request_code", -1) != -1) {
                if (intent == null) {
                    intent = C17880vN.A0A();
                }
                intent.putExtra("request_code", getIntent().getIntExtra("request_code", -1));
            } else if (intent == null || !intent.hasExtra("wallpaper_color_file")) {
                setResult(0, (Intent) null);
                finish();
                return;
            }
            setResult(-1, intent);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void A2y() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            C72453Mb.A1K(r1, this);
            this.A01 = AnonymousClass10E.A8r(A0L);
            this.A02 = AnonymousClass3MY.A0Z(A0L);
            this.A00 = AnonymousClass10E.A6Q(A0L);
        }
    }

    public static Pair A03(Context context) {
        int[] intArray = context.getResources().getIntArray(2130903072);
        int length = intArray.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = i;
        }
        return new Pair(intArray, iArr);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C72463Mc.A0t(this);
        setTitle(2131896260);
        setContentView(2131627540);
        setSupportActionBar(AnonymousClass3Ma.A0G(this));
        boolean A1T = C72473Md.A1T(this);
        C110885hR.A0A(this, 2131435209).setVisibility(8);
        RecyclerView recyclerView = (RecyclerView) C110885hR.A0A(this, 2131429184);
        recyclerView.A0r(new AnonymousClass28M(this.A00, getResources().getDimensionPixelOffset(2131166894)));
        Pair A032 = A03(this);
        int[] iArr = (int[]) A032.first;
        this.A05 = iArr;
        this.A03 = (int[]) A032.second;
        recyclerView.setAdapter(new C73703Wz(this, this, iArr));
        recyclerView.A0R = A1T;
        Resources resources = getResources();
        int i = 2131166895;
        if (C18020vd.A05(C18040vf.A02, this.A01, 9196)) {
            i = 2131166896;
        }
        recyclerView.setLayoutManager(new AutoFitGridLayoutManager(this, resources.getDimensionPixelSize(i)));
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C72453Mb.A13(this);
        return true;
    }

    public SolidColorWallpaper(int i) {
        this.A04 = false;
        C91034f2.A00(this, 36);
    }
}
