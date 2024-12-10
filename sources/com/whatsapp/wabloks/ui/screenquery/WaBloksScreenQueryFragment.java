package com.whatsapp.wabloks.ui.screenquery;

import X.AHz;
import X.AI3;
import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1FL;
import X.AnonymousClass3MX;
import X.AnonymousClass6Y6;
import X.AnonymousClass6Y7;
import X.C133986pp;
import X.C136306tb;
import X.C17880vN;
import X.C179979Kq;
import X.C18070vi;
import X.C186379e6;
import X.C198829yy;
import X.C20320AGc;
import X.C22403B6g;
import X.C22566BDb;
import X.C25613Cit;
import X.C25813CmQ;
import X.C25913CoX;
import X.C26294Cx6;
import X.CXY;
import X.DOZ;
import X.E7J;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

public final class WaBloksScreenQueryFragment extends Fragment implements C22566BDb, E7J {
    public CXY A00;
    public AI3 A01;
    public String A02;
    public C20320AGc A03;
    public AHz A04;
    public boolean A05;

    public void A20(Bundle bundle) {
        int i;
        C18070vi.A0d(bundle, 0);
        C20320AGc aGc = this.A03;
        if (aGc == null) {
            C18070vi.A11("screenContainerDelegate");
            throw null;
        }
        AHz aHz = aGc.A02;
        bundle.putString("__nav_data_type", "screen_query");
        bundle.putBundle("key_screen_container_props_bundle", AHz.A00(aHz, true));
        switch (aGc.A01.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        bundle.putInt("bloks_screen_navigation_state", i);
    }

    public void BtZ(Integer num) {
        Integer num2;
        C18070vi.A0d(num, 0);
        int intValue = num.intValue();
        C20320AGc aGc = this.A03;
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
        if (this.A05) {
            if (AnonymousClass3MX.A0O(A1D()).A0K() > 0 && AnonymousClass3MX.A0O(A1D()).A0F) {
                AnonymousClass3MX.A0O(A1D()).A0b();
            } else if (A1B() != null) {
                A1D().finish();
            } else {
                throw AnonymousClass000.A0n("Tried to exit screen but could not find an activity or fragment manager");
            }
            return new View(A14());
        }
        C20320AGc aGc = this.A03;
        if (aGc != null) {
            return aGc.A00();
        }
        C18070vi.A11("screenContainerDelegate");
        throw null;
    }

    public /* bridge */ /* synthetic */ void BpW(C22403B6g b6g) {
        AI3 ai3 = (AI3) b6g;
        C18070vi.A0d(ai3, 0);
        if (this.A01 == null) {
            C18070vi.A11("containerConfig");
            throw null;
        }
        this.A01 = new AI3(ai3.A00);
        A00();
    }

    public void Bsg() {
        C20320AGc aGc = this.A03;
        if (aGc == null) {
            C18070vi.A11("screenContainerDelegate");
            throw null;
        } else {
            aGc.A01();
        }
    }

    public void CJb(C186379e6 r2) {
        C20320AGc aGc = this.A03;
        if (aGc == null) {
            C18070vi.A11("screenContainerDelegate");
            throw null;
        }
        aGc.A00 = r2;
        if (r2 != null) {
            aGc.A01();
        }
    }

    private final void A00() {
        C133986pp r3;
        WaSqBloksActivity waSqBloksActivity = (WaSqBloksActivity) A1B();
        if (waSqBloksActivity != null) {
            AI3 ai3 = this.A01;
            if (ai3 == null) {
                C18070vi.A11("containerConfig");
                throw null;
            }
            C136306tb r0 = ai3.A00;
            if (r0 != null) {
                r3 = AnonymousClass6Y6.A00(r0);
            } else {
                r3 = null;
            }
            C20320AGc aGc = this.A03;
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
            if (r3 != null && !r3.equals(waSqBloksActivity.A02)) {
                waSqBloksActivity.A02 = r3;
                AnonymousClass6Y7.A00(doz, waSqBloksActivity.A07, r3, waSqBloksActivity.A4b());
            }
        }
    }

    public void A1u() {
        super.A1u();
        A00();
    }

    public void A1z(Bundle bundle) {
        Bundle bundle2;
        super.A1z(bundle);
        C26294Cx6.A04("WaBloksScreenQueryFragment", "Initializing Bloks fragment");
        if (bundle == null) {
            bundle2 = A15();
        } else {
            bundle2 = bundle;
        }
        try {
            this.A04 = AHz.A0A.A00(bundle2);
            Context A14 = A14();
            if (this.A00 == null) {
                AnonymousClass1FL A1D = A1D();
                C18070vi.A0z(A1D, "null cannot be cast to non-null type com.whatsapp.wabloks.ui.screenquery.WaSqBloksActivity");
                this.A00 = ((WaSqBloksActivity) A1D).Bbg();
            }
            AHz aHz = this.A04;
            if (aHz != null) {
                C22403B6g b6g = aHz.A01;
                C18070vi.A0z(b6g, "null cannot be cast to non-null type com.whatsapp.wabloks.screenquery.fullscreencontainerconfig.WaBloksFullScreenContainerConfig");
                this.A01 = (AI3) b6g;
                C198829yy r1 = C20320AGc.A05;
                CXY cxy = this.A00;
                if (cxy != null) {
                    this.A03 = r1.A01(A14, bundle2, this, cxy);
                    AHz aHz2 = this.A04;
                    if (aHz2 != null) {
                        this.A02 = aHz2.A06;
                        new C25613Cit(bundle, this, this);
                        return;
                    }
                } else {
                    throw C17880vN.A0g();
                }
            }
            C18070vi.A11("screenProps");
            throw null;
        } catch (C179979Kq e) {
            C25913CoX.A02("WaBloksScreenQueryFragment", e);
            this.A05 = true;
        }
    }
}
