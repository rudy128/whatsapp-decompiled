package com.whatsapp.areffects;

import X.A2k;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass11C;
import X.AnonymousClass1D6;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass1YH;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass4DE;
import X.AnonymousClass4P0;
import X.AnonymousClass4VF;
import X.C17880vN;
import X.C17900vP;
import X.C18070vi;
import X.C18100vl;
import X.C18460wS;
import X.C24141Ja;
import X.C26550D3n;
import X.C28931bI;
import X.C29431cG;
import X.C30391dr;
import X.C34001jj;
import X.C72453Mb;
import X.C83484Fh;
import X.C86724Su;
import X.C90084dV;
import X.C90184df;
import X.C92414hG;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.areffects.button.ArEffectsAccessoryButton;
import com.whatsapp.areffects.tab.ArEffectsTabLayout;
import com.whatsapp.areffects.tray.ArEffectsTrayFragment;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArEffectsTrayCollectionFragment extends Hilt_ArEffectsTrayCollectionFragment {
    public ArEffectsTabLayout A00;
    public AnonymousClass11C A01;
    public WDSButton A02;
    public AnonymousClass00H A03;
    public final Map A04 = C17880vN.A13();
    public final C18100vl A05 = C83484Fh.A00(this);
    public final Map A06 = C17880vN.A13();

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131624213, viewGroup, false);
    }

    public void A20(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        ArEffectsTabLayout arEffectsTabLayout = this.A00;
        if (arEffectsTabLayout != null) {
            bundle.putInt("KEY_TAB_INDEX", Integer.valueOf(arEffectsTabLayout.getSelectedTabPosition()).intValue());
        }
        Iterator A15 = AnonymousClass000.A15(this.A06);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            Fragment fragment = (Fragment) A16.getValue();
            if (fragment.A1b()) {
                this.A04.put(key, A1E().A0N(fragment));
            }
        }
        Iterator A152 = AnonymousClass000.A15(this.A04);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            bundle.putParcelable(AnonymousClass001.A1E(A162.getKey(), "KEY_FRAGMENT_", AnonymousClass000.A10()), (C26550D3n) A162.getValue());
        }
    }

    public void A21(Bundle bundle, View view) {
        int indexOf;
        List list;
        View view2 = view;
        C18070vi.A0d(view2, 0);
        C18100vl r8 = this.A05;
        AnonymousClass4VF r7 = (AnonymousClass4VF) AnonymousClass3MX.A0Y(r8).A0H.getValue();
        List list2 = r7.A05;
        if (!list2.isEmpty()) {
            Bundle bundle2 = bundle;
            if (bundle != null) {
                for (Object next : list2) {
                    this.A04.put(next, C24141Ja.A00(bundle2, C26550D3n.class, AnonymousClass001.A1E(next, "KEY_FRAGMENT_", AnonymousClass000.A10())));
                }
            }
            ArEffectsTabLayout arEffectsTabLayout = (ArEffectsTabLayout) AnonymousClass1HF.A06(view2, 2131436000);
            this.A00 = arEffectsTabLayout;
            if (arEffectsTabLayout != null) {
                arEffectsTabLayout.setBackgroundColor(AnonymousClass1YH.A00((Resources.Theme) null, AnonymousClass3MZ.A09(this), r7.A00));
            }
            if (bundle != null) {
                indexOf = bundle2.getInt("KEY_TAB_INDEX");
            } else {
                Object obj = r7.A02;
                if (!list2.contains(obj)) {
                    obj = C29431cG.A0c(list2);
                }
                indexOf = list2.indexOf(obj);
            }
            Iterator it = list2.iterator();
            int i = 0;
            while (true) {
                boolean z = true;
                if (it.hasNext()) {
                    int i2 = i + 1;
                    AnonymousClass4DE r9 = (AnonymousClass4DE) it.next();
                    ArEffectsTabLayout arEffectsTabLayout2 = this.A00;
                    if (arEffectsTabLayout2 != null) {
                        if (i != indexOf) {
                            z = false;
                        }
                        C18070vi.A0d(r9, 0);
                        arEffectsTabLayout2.A01.add(r9);
                        int ordinal = r9.ordinal();
                        int i3 = 2131886697;
                        if (ordinal != 6) {
                            i3 = 2131886692;
                            if (ordinal != 2) {
                                if (ordinal == 3) {
                                    i3 = 2131886699;
                                } else {
                                    throw new UnsupportedOperationException(AnonymousClass001.A1E(r9, "Unsupported category: ", AnonymousClass000.A10()));
                                }
                            }
                        }
                        arEffectsTabLayout2.A0L(i3, z);
                    }
                    Map map = this.A06;
                    r8.getValue();
                    C18070vi.A0d(r9, 0);
                    ArEffectsTrayFragment arEffectsTrayFragment = new ArEffectsTrayFragment();
                    AnonymousClass1D6[] r1 = new AnonymousClass1D6[1];
                    AnonymousClass1D6.A03("category", r9.name(), r1, 0);
                    AnonymousClass3MX.A1I(arEffectsTrayFragment, r1);
                    arEffectsTrayFragment.A1U((C26550D3n) this.A04.get(r9));
                    map.put(r9, arEffectsTrayFragment);
                    i = i2;
                } else {
                    ArEffectsTabLayout arEffectsTabLayout3 = this.A00;
                    if (arEffectsTabLayout3 != null) {
                        arEffectsTabLayout3.setShouldCenterSelectedTab(r7.A08);
                    }
                    A01(this, (AnonymousClass4DE) null, (AnonymousClass4DE) list2.get(indexOf), false);
                    ArEffectsTabLayout arEffectsTabLayout4 = this.A00;
                    if (arEffectsTabLayout4 != null) {
                        arEffectsTabLayout4.setOnTabSelectedListener(new C92414hG(this));
                    }
                    if (!view2.isLaidOut() || view2.isLayoutRequested()) {
                        view2.addOnLayoutChangeListener(new C90184df());
                    } else {
                        AnonymousClass1HF.A0p(view2, C18070vi.A0M(new Rect(0, 0, view2.getWidth(), view2.getHeight())));
                    }
                    BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(r8);
                    A0Y.A0i(A0Y.A0N.getCoroutineContext());
                    A00(view2, r7.A04, true);
                    A00(view2, r7.A03, false);
                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) C18070vi.A05(view2, 2131435414);
                    WDSButton wDSButton = this.A02;
                    if (wDSButton != null) {
                        list = C18070vi.A0M(wDSButton);
                    } else {
                        list = C18460wS.A00;
                    }
                    AnonymousClass3MX.A1Q(new ArEffectsTrayCollectionFragment$onViewCreated$4(shimmerFrameLayout, this, list, (C30391dr) null), AnonymousClass3MZ.A0G(this));
                    return;
                }
            }
        }
    }

    private final void A00(View view, C86724Su r5, boolean z) {
        if (r5 != null) {
            int i = 2131430462;
            if (z) {
                i = 2131435584;
            }
            C28931bI A0s = C72453Mb.A0s(view, i);
            ArEffectsAccessoryButton arEffectsAccessoryButton = (ArEffectsAccessoryButton) A0s.A02();
            arEffectsAccessoryButton.setup(z);
            arEffectsAccessoryButton.setIcon(r5.A00);
            this.A02 = ((ArEffectsAccessoryButton) A0s.A02()).getButton();
            A0s.A05(new C90084dV((Object) this, (Object) r5, (Object) A0s, 5));
        }
    }

    public static final void A01(ArEffectsTrayCollectionFragment arEffectsTrayCollectionFragment, AnonymousClass4DE r5, AnonymousClass4DE r6, boolean z) {
        Fragment fragment;
        C17900vP.A0Y(r6, "ArEffectsTrayCollectionFragment/switchFragment Switching to category: ", AnonymousClass000.A10());
        if (!(r5 == null || (fragment = (Fragment) arEffectsTrayCollectionFragment.A06.get(r5)) == null || !fragment.A1b())) {
            arEffectsTrayCollectionFragment.A04.put(r5, arEffectsTrayCollectionFragment.A1E().A0N(fragment));
        }
        AnonymousClass1GP A1E = arEffectsTrayCollectionFragment.A1E();
        C18070vi.A0X(A1E);
        C34001jj r3 = new C34001jj(A1E);
        if (z) {
            r3.A06(2130772020, 2130772022, 0, 0);
        }
        Object obj = arEffectsTrayCollectionFragment.A06.get(r6);
        if (obj != null) {
            r3.A09((Fragment) obj, 2131430999);
            r3.A03();
            AnonymousClass3MX.A0Y(arEffectsTrayCollectionFragment.A05).A0f(r5, r6);
            return;
        }
        throw C17880vN.A0g();
    }

    public void A1r() {
        super.A1r();
        AnonymousClass00H r0 = this.A03;
        if (r0 != null) {
            AnonymousClass4P0 r2 = (AnonymousClass4P0) r0.get();
            synchronized (r2) {
                A2k a2k = r2.A01;
                if (a2k != null) {
                    a2k.A04(false);
                    r2.A01 = null;
                }
            }
            return;
        }
        C18070vi.A11("thumbnailLoader");
        throw null;
    }

    public void A1s() {
        super.A1s();
        this.A02 = null;
        ArEffectsTabLayout arEffectsTabLayout = this.A00;
        if (arEffectsTabLayout != null) {
            arEffectsTabLayout.A0g.clear();
        }
        this.A00 = null;
        this.A04.clear();
        this.A06.clear();
    }
}
