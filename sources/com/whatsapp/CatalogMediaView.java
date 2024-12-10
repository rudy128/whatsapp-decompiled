package com.whatsapp;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C109005cf;
import X.C17880vN;
import X.C23301Fm;
import X.C34001jj;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.biz.catalog.CatalogMediaViewFragment;
import com.whatsapp.mediaview.MediaViewBaseFragment;

public final class CatalogMediaView extends AnonymousClass1FY implements C23301Fm {
    public boolean A00;

    public void Brw() {
    }

    public void ByB() {
    }

    public void C86() {
    }

    public boolean CMW() {
        return true;
    }

    public void A2y() {
        if (!this.A00) {
            this.A00 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
        }
    }

    public CatalogMediaView(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 2);
    }

    public void ByA() {
        finish();
    }

    public void onCreate(Bundle bundle) {
        MediaViewBaseFragment.A00(this);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            setContentView(2131625980);
            AnonymousClass1GP A0O = AnonymousClass3MX.A0O(this);
            Fragment A0Q = A0O.A0Q("catalog_media_view_fragment");
            if (A0Q == null) {
                A0Q = new CatalogMediaViewFragment();
            }
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("product", intent.getParcelableExtra("product"));
            A0D.putInt("target_image_index", intent.getIntExtra("target_image_index", 0));
            A0D.putString("cached_jid", intent.getStringExtra("cached_jid"));
            A0D.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A0Q.A1R(A0D);
            C34001jj r1 = new C34001jj(A0O);
            r1.A0D(A0Q, "catalog_media_view_fragment", 2131432449);
            r1.A01();
        }
    }

    public void onStop() {
        super.onStop();
        AnonymousClass3MZ.A0F(this).setSystemUiVisibility(3840);
    }

    public CatalogMediaView() {
        this(0);
    }
}
