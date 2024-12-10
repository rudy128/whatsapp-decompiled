package com.whatsapp.wabloks.base;

import X.ADL;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1FL;
import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass7AM;
import X.AnonymousClass7OR;
import X.AnonymousClass89U;
import X.C108945cZ;
import X.C111175ia;
import X.C17880vN;
import X.C18070vi;
import X.C185219cE;
import X.C187029f9;
import X.C22415B6x;
import X.C25813CmQ;
import X.C26235CvV;
import X.C28111Yx;
import X.C57112iY;
import X.C58372ka;
import X.CXN;
import X.CXY;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.rendercore.RootHostView;
import com.whatsapp.shops.ShopsBkLayoutViewModel;
import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;
import java.util.Map;

public abstract class BkFragment extends Fragment {
    public static final Integer A09 = C17880vN.A0h();
    public static final Integer A0A = 578497046;
    public RootHostView A00;
    public C25813CmQ A01;
    public C26235CvV A02;
    public CXY A03;
    public C57112iY A04;
    public AnonymousClass00H A05;
    public Map A06;
    public AnonymousClass89U A07;
    public C111175ia A08;

    public void A28() {
    }

    private void A02() {
        CXN BNV = this.A07.BNV();
        AnonymousClass1FL A1B = A1B();
        C28111Yx.A02(A1B);
        BNV.A00(A1B.getApplicationContext(), (C22415B6x) this.A05.get(), this.A03);
    }

    public static void A03(BkFragment bkFragment) {
        if (bkFragment.A06 == null) {
            bkFragment.A1R(C17880vN.A0D());
        }
    }

    public void A1R(Bundle bundle) {
        if (this.A06 == null) {
            super.A1R(bundle);
            return;
        }
        throw AnonymousClass000.A0n("arguments already set");
    }

    public void A1s() {
        C25813CmQ cmQ = this.A01;
        if (cmQ != null) {
            cmQ.A01();
            this.A01 = null;
        }
        this.A00 = null;
        super.A1s();
    }

    public Class A26() {
        if (this instanceof BkBottomSheetContentFragment) {
            return GenericBkLayoutViewModel.class;
        }
        if (this instanceof BkScreenFragmentWithCustomPreloadScreens) {
            return GenericBkLayoutViewModelWithReload.class;
        }
        if (!(this instanceof BkScreenFragment)) {
            return ShopsBkLayoutViewModel.class;
        }
        return GenericBkLayoutViewModel.class;
    }

    public void A27() {
        if (this instanceof BkScreenFragment) {
            ((BkScreenFragment) this).A2C();
        }
    }

    public void A29(Integer num, String str) {
        int intValue;
        AnonymousClass00H r0;
        if (this instanceof BkScreenFragmentWithCustomPreloadScreens) {
            intValue = num.intValue();
            r0 = ((BkScreenFragmentWithCustomPreloadScreens) this).A07;
        } else if (this instanceof BkScreenFragment) {
            intValue = num.intValue();
            r0 = ((BkScreenFragment) this).A05;
        } else {
            return;
        }
        if (r0 != null) {
            ((C58372ka) r0.get()).A01(str, intValue);
        } else {
            C18070vi.A11("logger");
            throw null;
        }
    }

    public void A1u() {
        super.A1u();
        A02();
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A29(AnonymousClass3MY.A0f(), "START_RENDER");
        Fragment fragment = this.A0E;
        AnonymousClass1FL A1B = A1B();
        if (fragment instanceof AnonymousClass89U) {
            this.A07 = (AnonymousClass89U) fragment;
        } else if (A1B instanceof AnonymousClass89U) {
            this.A07 = (AnonymousClass89U) A1B;
        } else {
            A1B.finish();
        }
        this.A03 = this.A07.Bbg();
        A02();
        C111175ia r2 = (C111175ia) AnonymousClass3MW.A0N(this).A00(A26());
        this.A08 = r2;
        C26235CvV cvV = this.A02;
        if (cvV != null) {
            if (!r2.A02) {
                r2.A02 = true;
                AnonymousClass1DT A0S = C108945cZ.A0S();
                r2.A01 = A0S;
                r2.A00 = A0S;
                AnonymousClass7OR r22 = new AnonymousClass7OR(A0S, (CXY) null);
                C187029f9 r1 = new C187029f9();
                r1.A01 = cvV;
                r1.A00 = 5;
                r22.C3j(r1);
            }
        } else if (A15().containsKey("screen_name")) {
            String string = A15().getString("screen_params");
            String string2 = A15().getString("qpl_params");
            C111175ia r3 = this.A08;
            CXY cxy = this.A03;
            String string3 = A15().getString("screen_name");
            if (string3 != null) {
                r3.A0U(cxy, (ADL) A15().getParcelable("screen_cache_config"), string3, string, string2);
                return;
            }
            throw AnonymousClass000.A0n("BkFragment is missing screen name");
        } else if (bundle != null) {
            A1D().onBackPressed();
        } else {
            throw AnonymousClass000.A0n("data missing for init");
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.9Nv, java.lang.Object, X.17o] */
    public void A21(Bundle bundle, View view) {
        this.A00 = (RootHostView) AnonymousClass1HF.A06(view, A25());
        String string = A15().getString("data_module_job_id");
        String string2 = A15().getString("data_module_namespace");
        if (!(string == null || string2 == null)) {
            C185219cE r0 = (C185219cE) this.A03.A00().get(2131428241);
            C28111Yx.A02(r0);
            r0.A00 = string;
            r0.A01 = string2;
        }
        C111175ia r02 = this.A08;
        r02.A0T();
        r02.A00.A0A(A1G(), new AnonymousClass7AM(this, 22));
        ? obj = new Object();
        this.A0L.A05(obj);
        this.A03.A07.set(false);
        this.A03.A02.A04(view.getRootView(), obj);
    }

    public int A25() {
        return 2131428240;
    }

    public void A2A(String str) {
        A03(this);
        A15().putString("screen_name", str);
    }
}
