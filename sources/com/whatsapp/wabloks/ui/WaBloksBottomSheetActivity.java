package com.whatsapp.wabloks.ui;

import X.ADL;
import X.AnonymousClass00H;
import X.AnonymousClass1GP;
import X.AnonymousClass3MW;
import X.AnonymousClass6Nc;
import X.AnonymousClass7A4;
import X.AnonymousClass7OO;
import X.C108985cd;
import X.C108995ce;
import X.C133096oA;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C19760yx;
import X.C28281Zt;
import X.C72463Mc;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.wabloks.base.Hilt_BkScreenFragment;
import com.whatsapp.wabloks.ui.bottomsheet.Hilt_BkBottomSheetContainerFragment;
import java.io.Serializable;
import java.lang.ref.WeakReference;

public final class WaBloksBottomSheetActivity extends AnonymousClass6Nc {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public boolean A02;
    public final Intent A03 = C17880vN.A0A();

    public void CBt(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("error_dialog")) {
            finish();
        }
    }

    public boolean A4X() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment, androidx.fragment.app.Fragment, com.whatsapp.wabloks.ui.bottomsheet.Hilt_BkBottomSheetContainerFragment, androidx.fragment.app.DialogFragment] */
    /* JADX WARNING: type inference failed for: r1v8, types: [com.whatsapp.wabloks.base.BkFragment, com.whatsapp.wabloks.base.BkScreenFragment, java.lang.Object, com.whatsapp.wabloks.base.Hilt_BkScreenFragment] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        C72463Mc.A19(this, 2131436959);
        AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.A0Z.add(new AnonymousClass7A4(this, 2));
        String stringExtra = getIntent().getStringExtra("screen_name");
        C17960vV.A07(stringExtra);
        C18070vi.A0X(stringExtra);
        String stringExtra2 = getIntent().getStringExtra("screen_params");
        ADL adl = (ADL) getIntent().getParcelableExtra("screen_cache_config");
        boolean booleanExtra = getIntent().getBooleanExtra("is_async_component", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("restore_saved_instance", false);
        Intent intent = this.A03;
        intent.putExtra("passthrough_bundle", getIntent().getBundleExtra("passthrough_bundle"));
        this.A02 = getIntent().getBooleanExtra("disable_navigation_logging", false);
        setResult(0, intent);
        if (booleanExtra) {
            CNB(0, 2131891797);
            WeakReference A0z = AnonymousClass3MW.A0z(this);
            AnonymousClass00H r0 = this.A00;
            if (r0 != null) {
                WeakReference A0z2 = AnonymousClass3MW.A0z(this);
                boolean A0B = C28281Zt.A0B(this);
                ((C133096oA) r0.get()).A00(new AnonymousClass7OO(this, stringExtra, stringExtra2, A0z), adl, stringExtra, C108985cd.A0j(this.A02), stringExtra2, A0z2, A0B);
                return;
            }
            C18070vi.A11("asyncActionLauncherLazy");
            throw null;
        }
        ? hilt_BkBottomSheetContainerFragment = new Hilt_BkBottomSheetContainerFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("restore_saved_instance", booleanExtra2);
        hilt_BkBottomSheetContainerFragment.A1R(A0D);
        ? hilt_BkScreenFragment = new Hilt_BkScreenFragment();
        hilt_BkScreenFragment.A2A(stringExtra);
        C108995ce.A1F(hilt_BkScreenFragment, adl, (Serializable) null, stringExtra2);
        hilt_BkScreenFragment.A07 = true;
        hilt_BkBottomSheetContainerFragment.A00 = new C19760yx(hilt_BkScreenFragment, stringExtra);
        hilt_BkBottomSheetContainerFragment.A2C(getSupportFragmentManager(), "bloks_bottomsheet_container");
    }
}
