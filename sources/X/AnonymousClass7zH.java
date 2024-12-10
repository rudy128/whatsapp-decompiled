package X;

import android.content.Context;
import android.view.View;
import android.widget.ViewFlipper;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7zH  reason: invalid class name */
public final class AnonymousClass7zH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ExpressionsSearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zH(ExpressionsSearchView expressionsSearchView) {
        super(1);
        this.this$0 = expressionsSearchView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C28931bI r0;
        View A02;
        ChipGroup chipGroup;
        View view;
        WaEditText waEditText;
        C111025hp r02;
        Fragment fragment;
        MaterialButtonToggleGroup materialButtonToggleGroup;
        int i;
        Integer valueOf;
        int intValue;
        ViewFlipper viewFlipper;
        AnonymousClass6TM r9 = (AnonymousClass6TM) obj;
        C18070vi.A0d(r9, 0);
        if (r9 instanceof C1176160g) {
            ExpressionsSearchView expressionsSearchView = this.this$0;
            C1176160g r92 = (C1176160g) r9;
            ViewFlipper viewFlipper2 = expressionsSearchView.A04;
            if (viewFlipper2 != null) {
                view = viewFlipper2.getCurrentView();
            } else {
                view = null;
            }
            if (!C18070vi.A18(view, expressionsSearchView.A00)) {
                ViewFlipper viewFlipper3 = expressionsSearchView.A04;
                if (!(viewFlipper3 == null || (valueOf = Integer.valueOf(viewFlipper3.indexOfChild(expressionsSearchView.A00))) == null || (intValue = valueOf.intValue()) == -1 || (viewFlipper = expressionsSearchView.A04) == null)) {
                    viewFlipper.setDisplayedChild(intValue);
                }
                View view2 = expressionsSearchView.A01;
                if (view2 != null) {
                    view2.setVisibility(8);
                    AnonymousClass3MW.A1Q(view2);
                }
            }
            C111025hp r4 = expressionsSearchView.A0H;
            if (r4 != null) {
                r4.A02 = r92.A02;
            }
            List list = r92.A03;
            if (r4 != null && !C18070vi.A18(list, r4.A04)) {
                MaterialButton materialButton = expressionsSearchView.A07;
                if (materialButton != null) {
                    materialButton.setVisibility(C72453Mb.A07(list.contains(C117235zR.A00) ? 1 : 0));
                }
                MaterialButton materialButton2 = expressionsSearchView.A08;
                if (materialButton2 != null) {
                    materialButton2.setVisibility(C72453Mb.A07(list.contains(C117245zS.A00) ? 1 : 0));
                }
                MaterialButton materialButton3 = expressionsSearchView.A06;
                if (materialButton3 != null) {
                    materialButton3.setVisibility(C72453Mb.A07(list.contains(C117225zQ.A00) ? 1 : 0));
                }
                MaterialButton materialButton4 = expressionsSearchView.A09;
                if (materialButton4 != null) {
                    materialButton4.setVisibility(C72453Mb.A07(list.contains(C117255zT.A00) ? 1 : 0));
                }
                r4.A04 = list;
                r4.A04();
            }
            C127246e2 r42 = r92.A02;
            int i2 = r92.A00;
            boolean z = r92.A04;
            if (i2 >= 0 && (r02 = expressionsSearchView.A0H) != null && i2 < r02.A04.size()) {
                C111025hp r03 = expressionsSearchView.A0H;
                AnonymousClass874 r5 = null;
                if (r03 != null) {
                    fragment = (Fragment) r03.A01.get(i2);
                } else {
                    fragment = null;
                }
                if ((fragment instanceof AnonymousClass874) && (r5 = (AnonymousClass874) fragment) != null) {
                    r5.CJE(true);
                }
                AnonymousClass874 r1 = expressionsSearchView.A0F;
                if (r1 != null && !r1.equals(r5)) {
                    r1.CJE(false);
                }
                expressionsSearchView.A0F = r5;
                ViewPager viewPager = expressionsSearchView.A05;
                if (viewPager != null) {
                    viewPager.A0J(i2, z);
                }
                if (C18070vi.A18(r42, C117235zR.A00)) {
                    materialButtonToggleGroup = expressionsSearchView.A0A;
                    if (materialButtonToggleGroup != null) {
                        i = 2131430352;
                    }
                } else if (C18070vi.A18(r42, C117245zS.A00)) {
                    materialButtonToggleGroup = expressionsSearchView.A0A;
                    if (materialButtonToggleGroup != null) {
                        i = 2131431146;
                    }
                } else if (C18070vi.A18(r42, C117225zQ.A00)) {
                    materialButtonToggleGroup = expressionsSearchView.A0A;
                    if (materialButtonToggleGroup != null) {
                        i = 2131428000;
                    }
                } else if (C18070vi.A18(r42, C117255zT.A00) && (materialButtonToggleGroup = expressionsSearchView.A0A) != null) {
                    i = 2131435784;
                }
                MaterialButtonToggleGroup.A01(materialButtonToggleGroup, i, true);
            }
            ExpressionsSearchView.A00(r92.A01, r42, expressionsSearchView);
            if (r92.A05 && (waEditText = expressionsSearchView.A0B) != null) {
                waEditText.requestFocus();
                waEditText.A0I(false);
                String str = expressionsSearchView.A0R;
                if (str != null) {
                    expressionsSearchView.A0S = true;
                    WaEditText waEditText2 = expressionsSearchView.A0B;
                    if (waEditText2 != null) {
                        waEditText2.setText(str);
                    }
                    waEditText.selectAll();
                    expressionsSearchView.A0R = null;
                }
            }
        } else if (r9 instanceof AnonymousClass60f) {
            ExpressionsSearchView expressionsSearchView2 = this.this$0;
            AnonymousClass60f r93 = (AnonymousClass60f) r9;
            ExpressionsSearchView.A00(r93.A00, r93.A01, expressionsSearchView2);
            String str2 = r93.A02;
            boolean A1R = AnonymousClass000.A1R(str2.length());
            View view3 = expressionsSearchView2.A01;
            if (view3 != null) {
                view3.setVisibility(C72453Mb.A0J(A1R));
            }
            if (!(r93.A03 || !C72453Mb.A1a(expressionsSearchView2.A0U) || (r0 = expressionsSearchView2.A0P) == null || (A02 = r0.A02()) == null || (chipGroup = (ChipGroup) A02.findViewById(2131435765)) == null)) {
                Context A04 = AnonymousClass3MY.A04(chipGroup);
                Map map = C137716vu.A00;
                LinkedHashMap A0b = C108995ce.A0b(map);
                Iterator A15 = AnonymousClass000.A15(map);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    A0b.put(AnonymousClass1YF.A0I(C108975cc.A0d(C18070vi.A0F(A04, AnonymousClass000.A0M(A16.getKey())))), A16.getValue());
                }
                Number A1D = C108945cZ.A1D(AnonymousClass1YF.A0I(C108975cc.A0d(str2)), A0b);
                if (A1D == null) {
                    chipGroup.A03.A04();
                } else {
                    chipGroup.A00(A1D.intValue());
                }
            }
        }
        return C27621Wu.A00;
    }
}
