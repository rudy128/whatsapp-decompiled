package com.whatsapp.biz.linkedaccounts;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass4ZR;
import X.AnonymousClass745;
import X.AnonymousClass79Z;
import X.C108955ca;
import X.C109005cf;
import X.C1417376t;
import X.C17880vN;
import X.C23301Fm;
import X.C34001jj;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.mediaview.MediaViewBaseFragment;
import java.util.ArrayList;

public class LinkedAccountMediaView extends AnonymousClass1FY implements C23301Fm {
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

    public LinkedAccountMediaView(int i) {
        this.A00 = false;
        AnonymousClass79Z.A00(this, 19);
    }

    public static void A03(Context context, View view, C1417376t r5, UserJid userJid, String str, ArrayList arrayList, int i, int i2, int i3, boolean z) {
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context.getPackageName(), "com.whatsapp.biz.linkedaccounts.LinkedAccountMediaView");
        A0A.putExtra("extra_business_jid", userJid);
        A0A.putExtra("extra_target_post_index", i);
        A0A.putExtra("extra_account_type", i2);
        A0A.putExtra("extra_is_v2_5_enabled", z);
        A0A.putParcelableArrayListExtra("extra_post_list", arrayList);
        A0A.putExtra("extra_common_fields_for_analytics", r5);
        A0A.putExtra("extra_entry_point", i3);
        AnonymousClass745.A08(context, A0A, view, new AnonymousClass4ZR(context), str);
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
            AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
            Fragment A0Q = supportFragmentManager.A0Q("linked_account_media_view_fragment");
            if (A0Q == null) {
                A0Q = new LinkedAccountMediaViewFragment();
            }
            Bundle A0D = C17880vN.A0D();
            A0D.putParcelable("extra_business_jid", intent.getParcelableExtra("extra_business_jid"));
            A0D.putParcelableArrayList("extra_post_list", intent.getParcelableArrayListExtra("extra_post_list"));
            A0D.putInt("extra_account_type", intent.getIntExtra("extra_account_type", 0));
            A0D.putInt("extra_target_post_index", intent.getIntExtra("extra_target_post_index", 0));
            A0D.putBoolean("extra_is_v2_5_enabled", intent.getBooleanExtra("extra_is_v2_5_enabled", false));
            A0D.putBundle("animation_bundle", intent.getBundleExtra("animation_bundle"));
            A0D.putParcelable("extra_common_fields_for_analytics", intent.getParcelableExtra("extra_common_fields_for_analytics"));
            A0D.putInt("extra_entry_point", intent.getIntExtra("extra_entry_point", 0));
            A0Q.A1R(A0D);
            C34001jj r1 = new C34001jj(supportFragmentManager);
            r1.A0D(A0Q, "linked_account_media_view_fragment", 2131432449);
            r1.A01();
        }
    }

    public LinkedAccountMediaView() {
        this(0);
    }
}
