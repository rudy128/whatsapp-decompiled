package com.whatsapp.wabloks.ui.screenquery;

import X.AHz;
import X.AI2;
import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1FL;
import X.AnonymousClass3MX;
import X.AnonymousClass6Y6;
import X.AnonymousClass6Y7;
import X.AnonymousClass89U;
import X.C133986pp;
import X.C136306tb;
import X.C1425579x;
import X.C17880vN;
import X.C179979Kq;
import X.C18070vi;
import X.C181819Ry;
import X.C186379e6;
import X.C198829yy;
import X.C20320AGc;
import X.C22403B6g;
import X.C22566BDb;
import X.C25613Cit;
import X.C25813CmQ;
import X.C25913CoX;
import X.C72453Mb;
import X.CXY;
import X.DOZ;
import X.E7J;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.whatsapp.wds.components.topbar.WDSToolbar;

public final class WaBloksScreenQueryBottomSheetFragment extends Fragment implements C22566BDb, E7J {
    public C20320AGc A00;
    public AHz A01;
    public CXY A02;
    public AI2 A03;
    public boolean A04;

    public void BtZ(Integer num) {
        Integer num2;
        C18070vi.A0d(num, 0);
        int intValue = num.intValue();
        C20320AGc aGc = this.A00;
        if (intValue != 1) {
            if (aGc != null) {
                num2 = AnonymousClass00R.A0C;
            }
            C18070vi.A11("screenContainerDelegate");
            throw null;
        }
        if (aGc != null) {
            num2 = AnonymousClass00R.A01;
        }
        C18070vi.A11("screenContainerDelegate");
        throw null;
        aGc.A02(num2);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (this.A04) {
            if (AnonymousClass3MX.A0O(A1D()).A0K() > 0 && AnonymousClass3MX.A0O(A1D()).A0F) {
                AnonymousClass3MX.A0O(A1D()).A0b();
            } else if (A1B() != null) {
                A1D().finish();
            } else {
                throw AnonymousClass000.A0n("Tried to exit screen but could not find an activity or fragment manager");
            }
            return new View(A14());
        }
        C20320AGc aGc = this.A00;
        if (aGc != null) {
            return aGc.A00();
        }
        C18070vi.A11("screenContainerDelegate");
        throw null;
    }

    public void A1z(Bundle bundle) {
        Bundle bundle2;
        CXY Bbg;
        if (bundle == null) {
            bundle2 = A15();
        } else {
            bundle2 = bundle;
        }
        if (this.A02 == null) {
            AnonymousClass1FL A1D = A1D();
            if (A1D instanceof WaSqBloksActivity) {
                Bbg = ((WaSqBloksActivity) A1D).Bbg();
            } else if (A1D instanceof AnonymousClass89U) {
                Bbg = ((AnonymousClass89U) A1D).Bbg();
            } else {
                throw AnonymousClass000.A0n("This activity does not have a valid host surface for Bloks. Please implement BkFragmentHostSurface or WaSqBloksActivity");
            }
            this.A02 = Bbg;
        }
        try {
            this.A01 = AHz.A0A.A00(bundle2);
            Context A14 = A14();
            AHz aHz = this.A01;
            if (aHz == null) {
                C18070vi.A11("screenProps");
                throw null;
            }
            C22403B6g b6g = aHz.A01;
            C18070vi.A0z(b6g, "null cannot be cast to non-null type com.whatsapp.wabloks.screenquery.bottomsheetcontainerconfig.WaBloksBottomSheetContainerConfig");
            this.A03 = (AI2) b6g;
            C198829yy r1 = C20320AGc.A05;
            CXY cxy = this.A02;
            if (cxy != null) {
                this.A00 = r1.A01(A14, bundle2, this, cxy);
                new C25613Cit(bundle, this, this);
                super.A1z(bundle);
                return;
            }
            throw C17880vN.A0g();
        } catch (C179979Kq e) {
            C25913CoX.A02("WaBloksScreenQueryFragment", e);
            this.A04 = true;
        }
    }

    public /* bridge */ /* synthetic */ void BpW(C22403B6g b6g) {
        WaBloksScreenQueryBottomSheetHostFragment A002;
        C133986pp r3;
        AI2 ai2 = (AI2) b6g;
        C18070vi.A0d(ai2, 0);
        if (this.A03 == null) {
            C18070vi.A11("containerConfig");
            throw null;
        }
        this.A03 = new AI2(ai2.A00);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null && (A002 = C181819Ry.A00(A1B)) != null) {
            AI2 ai22 = this.A03;
            if (ai22 == null) {
                C18070vi.A11("containerConfig");
                throw null;
            }
            C136306tb r0 = ai22.A00;
            if (r0 != null) {
                r3 = AnonymousClass6Y6.A00(r0);
            } else {
                r3 = null;
            }
            C20320AGc aGc = this.A00;
            if (aGc == null) {
                C18070vi.A11("screenContainerDelegate");
                throw null;
            }
            C25813CmQ cmQ = aGc.A03;
            if (cmQ.A04.get()) {
                C25913CoX.A01("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
            }
            DOZ doz = cmQ.A01;
            C18070vi.A0X(doz);
            if (r3 == null) {
                C72453Mb.A1D(A002.A02);
            } else if (!r3.equals(A002.A01)) {
                A002.A01 = r3;
                WDSToolbar wDSToolbar = A002.A02;
                if (wDSToolbar != null) {
                    AnonymousClass6Y7.A00(doz, (C1425579x) null, r3, wDSToolbar);
                }
            }
        }
    }

    public void Bsg() {
        C20320AGc aGc = this.A00;
        if (aGc == null) {
            C18070vi.A11("screenContainerDelegate");
            throw null;
        } else {
            aGc.A01();
        }
    }

    public void CJb(C186379e6 r2) {
        C20320AGc aGc = this.A00;
        if (aGc == null) {
            C18070vi.A11("screenContainerDelegate");
            throw null;
        }
        aGc.A00 = r2;
        if (r2 != null) {
            aGc.A01();
        }
    }
}
