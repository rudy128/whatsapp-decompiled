package com.whatsapp.expressionstray.search;

import X.A59;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1GP;
import X.AnonymousClass1HF;
import X.AnonymousClass1L4;
import X.AnonymousClass1LU;
import X.AnonymousClass1OR;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass3NL;
import X.AnonymousClass78O;
import X.AnonymousClass78W;
import X.AnonymousClass7AT;
import X.AnonymousClass7BO;
import X.AnonymousClass7zH;
import X.AnonymousClass82H;
import X.AnonymousClass873;
import X.AnonymousClass874;
import X.AnonymousClass87C;
import X.AnonymousClass88B;
import X.C108965cb;
import X.C111025hp;
import X.C117225zQ;
import X.C121196Ih;
import X.C127246e2;
import X.C137716vu;
import X.C139436yq;
import X.C142737Ap;
import X.C150477kk;
import X.C150487kl;
import X.C150497km;
import X.C150507kn;
import X.C150517ko;
import X.C155867tR;
import X.C155877tS;
import X.C18000vb;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C19740yt;
import X.C27021Uk;
import X.C28931bI;
import X.C30391dr;
import X.C30451dy;
import X.C37581pm;
import X.C41561wd;
import X.C72453Mb;
import X.C84084Hu;
import X.C90964ev;
import X.C99274sY;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.ChipGroup;
import com.whatsapp.WaEditText;

public final class ExpressionsSearchView extends Hilt_ExpressionsSearchView {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public ImageView A03;
    public ViewFlipper A04;
    public ViewPager A05;
    public MaterialButton A06;
    public MaterialButton A07;
    public MaterialButton A08;
    public MaterialButton A09;
    public MaterialButtonToggleGroup A0A;
    public WaEditText A0B;
    public C18000vb A0C;
    public A59 A0D;
    public AnonymousClass873 A0E;
    public AnonymousClass874 A0F;
    public C127246e2 A0G;
    public C111025hp A0H;
    public C18030ve A0I;
    public AnonymousClass87C A0J;
    public AnonymousClass1LU A0K;
    public AnonymousClass1BI A0L;
    public C27021Uk A0M;
    public AnonymousClass88B A0N;
    public AnonymousClass1L4 A0O;
    public C28931bI A0P;
    public AnonymousClass00H A0Q;
    public String A0R;
    public boolean A0S;
    public final C18100vl A0T;
    public final C18100vl A0U;
    public final C18100vl A0V;
    public final int A0W = 2131625287;

    public void A21(Bundle bundle, View view) {
        String str;
        String str2;
        Bundle bundle2;
        String string;
        View A022;
        ChipGroup chipGroup;
        Resources.Theme theme;
        ImageView imageView;
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A02 = AnonymousClass3MW.A0C(view, 2131430747);
        this.A04 = (ViewFlipper) AnonymousClass1HF.A06(view, 2131430904);
        this.A00 = AnonymousClass1HF.A06(view, 2131428429);
        this.A05 = (ViewPager) AnonymousClass1HF.A06(view, 2131428427);
        this.A03 = AnonymousClass3MW.A0G(view, 2131428012);
        this.A01 = AnonymousClass1HF.A06(view, 2131429122);
        this.A0B = (WaEditText) AnonymousClass1HF.A06(view, 2131434853);
        this.A0A = (MaterialButtonToggleGroup) AnonymousClass1HF.A06(view, 2131428428);
        this.A07 = (MaterialButton) AnonymousClass1HF.A06(view, 2131430352);
        this.A06 = (MaterialButton) AnonymousClass1HF.A06(view, 2131428000);
        this.A08 = (MaterialButton) AnonymousClass1HF.A06(view, 2131431146);
        this.A09 = (MaterialButton) AnonymousClass1HF.A06(view, 2131435784);
        this.A0P = C28931bI.A00(view, 2131435764);
        AnonymousClass1BI r0 = this.A0L;
        C111025hp r3 = null;
        if (r0 != null) {
            str = r0.getRawString();
        } else {
            str = null;
        }
        AnonymousClass1GP A1E = A1E();
        C18100vl r4 = this.A0V;
        int A0I2 = C72453Mb.A0I(r4);
        C18070vi.A0b(A1E);
        this.A0H = new C111025hp(A1E, str, A0I2, true, true);
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            C18000vb r02 = this.A0C;
            if (r02 != null) {
                viewPager.setLayoutDirection(AnonymousClass3MW.A1Z(r02) ? 1 : 0);
                C111025hp r1 = this.A0H;
                if (r1 != null) {
                    viewPager.setOffscreenPageLimit(r1.A04.size());
                    r3 = r1;
                }
                viewPager.setAdapter(r3);
                viewPager.A0K(new C142737Ap(this, 1));
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        Context A1n = A1n();
        if (!(A1n == null || (imageView = this.A03) == null)) {
            C18000vb r12 = this.A0C;
            if (r12 != null) {
                AnonymousClass3NL.A01(A1n, imageView, r12, 2131231675);
            } else {
                str2 = "whatsAppLocale";
                C18070vi.A11(str2);
                throw null;
            }
        }
        if (C72453Mb.A0I(r4) == 7) {
            Context A1n2 = A1n();
            if (!(A1n2 == null || (theme = A1n2.getTheme()) == null)) {
                theme.applyStyle(2132083200, true);
            }
            WaEditText waEditText = this.A0B;
            if (waEditText != null) {
                waEditText.setTextColor(AnonymousClass3MZ.A09(this).getColor(2131103220));
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                viewGroup.setBackgroundColor(AnonymousClass3MZ.A09(this).getColor(2131103232));
            }
        }
        if (C72453Mb.A1a(this.A0U)) {
            C28931bI r03 = this.A0P;
            Integer num = null;
            if (!(r03 == null || (A022 = r03.A02()) == null || (chipGroup = (ChipGroup) A022.findViewById(2131435765)) == null)) {
                LayoutInflater A16 = A16();
                C18070vi.A0X(A16);
                for (TextView textView : C137716vu.A00(A16, chipGroup)) {
                    CharSequence text = textView.getText();
                    C84084Hu.A00(textView, new AnonymousClass82H(this, text));
                    chipGroup.addView(textView);
                    String str3 = this.A0R;
                    if (str3 != null && str3.equalsIgnoreCase(text.toString())) {
                        num = Integer.valueOf(textView.getId());
                    }
                }
                chipGroup.setChipSpacingVerticalResource(2131169544);
                if (num != null) {
                    chipGroup.A00(num.intValue());
                }
            }
        }
        C18100vl r5 = this.A0T;
        AnonymousClass7AT.A01(A1G(), ((ExpressionsSearchViewModel) r5.getValue()).A08, new AnonymousClass7zH(this), 27);
        C37581pm A0H2 = AnonymousClass3MZ.A0H(this);
        ExpressionsSearchView$observeExpressionsSideEffects$1 expressionsSearchView$observeExpressionsSideEffects$1 = new ExpressionsSearchView$observeExpressionsSideEffects$1(this, (C30391dr) null);
        AnonymousClass1OR r32 = AnonymousClass1OR.A00;
        Integer num2 = AnonymousClass00R.A00;
        C30451dy.A02(num2, r32, expressionsSearchView$observeExpressionsSideEffects$1, A0H2);
        WaEditText waEditText2 = this.A0B;
        if (waEditText2 != null) {
            waEditText2.addTextChangedListener(new C121196Ih(this, 2));
            waEditText2.setOnFocusChangeListener(new AnonymousClass78W(waEditText2, this, 2));
            waEditText2.setOnEditorActionListener(new C90964ev(this, waEditText2, 1));
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = this.A0A;
        if (materialButtonToggleGroup != null) {
            materialButtonToggleGroup.A06.add(new AnonymousClass7BO(this, 2));
        }
        View view2 = this.A01;
        if (view2 != null) {
            AnonymousClass78O.A00(view2, this, 46);
        }
        ImageView imageView2 = this.A03;
        if (imageView2 != null) {
            AnonymousClass78O.A00(imageView2, this, 47);
        }
        MaterialButton materialButton = this.A07;
        String str4 = null;
        if (materialButton != null) {
            Context A1n3 = A1n();
            String str5 = null;
            if (A1n3 != null) {
                str5 = A1n3.getString(2131898950);
            }
            materialButton.setContentDescription(str5);
        }
        MaterialButton materialButton2 = this.A08;
        if (materialButton2 != null) {
            Context A1n4 = A1n();
            String str6 = null;
            if (A1n4 != null) {
                str6 = A1n4.getString(2131890773);
            }
            materialButton2.setContentDescription(str6);
        }
        MaterialButton materialButton3 = this.A06;
        if (materialButton3 != null) {
            Context A1n5 = A1n();
            String str7 = null;
            if (A1n5 != null) {
                str7 = A1n5.getString(2131898717);
            }
            materialButton3.setContentDescription(str7);
        }
        MaterialButton materialButton4 = this.A09;
        if (materialButton4 != null) {
            Context A1n6 = A1n();
            if (A1n6 != null) {
                str4 = A1n6.getString(2131896514);
            }
            materialButton4.setContentDescription(str4);
        }
        ExpressionsSearchViewModel expressionsSearchViewModel = (ExpressionsSearchViewModel) r5.getValue();
        C30451dy.A02(num2, r32, new ExpressionsSearchViewModel$onTabsUpdated$1(expressionsSearchViewModel, (C30391dr) null, C72453Mb.A0I(r4)), C41561wd.A00(expressionsSearchViewModel));
        C18030ve r2 = this.A0I;
        if (r2 == null) {
            str2 = "abProps";
            C18070vi.A11(str2);
            throw null;
        } else if (C18020vd.A05(C18040vf.A02, r2, 3403) && C72453Mb.A0I(r4) == 8 && (bundle2 = this.A06) != null && (string = bundle2.getString("contextual_suggestion_query")) != null) {
            this.A0S = true;
            WaEditText waEditText3 = this.A0B;
            if (waEditText3 != null) {
                waEditText3.setText(string);
            }
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        C108965cb.A1B(this.A0B);
        AnonymousClass873 r0 = this.A0E;
        if (r0 != null) {
            r0.Btf();
        }
        ExpressionsSearchViewModel A0N2 = C108965cb.A0N(this);
        AnonymousClass3MX.A1Q(new ExpressionsSearchViewModel$onDismiss$1(A0N2, (C30391dr) null), C41561wd.A00(A0N2));
        super.onDismiss(dialogInterface);
    }

    public static final void A00(Bitmap bitmap, C127246e2 r3, ExpressionsSearchView expressionsSearchView) {
        MaterialButton materialButton;
        if (bitmap != null) {
            MaterialButton materialButton2 = expressionsSearchView.A06;
            if (materialButton2 != null) {
                materialButton2.setIconTint((ColorStateList) null);
            }
            MaterialButton materialButton3 = expressionsSearchView.A06;
            if (materialButton3 != null) {
                materialButton3.setIcon(C108965cb.A05(bitmap, materialButton3));
                if (!C18070vi.A18(r3, C117225zQ.A00)) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    colorMatrix.setSaturation(0.0f);
                    materialButton3.A01.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                    return;
                }
                materialButton3.A01.clearColorFilter();
                return;
            }
            return;
        }
        Context A1n = expressionsSearchView.A1n();
        if (A1n != null && (materialButton = expressionsSearchView.A06) != null) {
            materialButton.setIconTint(C19740yt.A03(A1n, 2131231471));
            C18030ve r2 = expressionsSearchView.A0I;
            if (r2 != null) {
                int i = 2131232292;
                if (C18020vd.A05(C18040vf.A01, r2, 9398)) {
                    i = 2131231709;
                }
                materialButton.setIconResource(i);
                return;
            }
            AnonymousClass3MW.A1A();
            throw null;
        }
    }

    public ExpressionsSearchView() {
        C150497km r1 = new C150497km(this);
        Integer num = AnonymousClass00R.A0C;
        C18100vl A002 = AnonymousClass1DF.A00(num, new C150507kn(r1));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ExpressionsSearchViewModel.class);
        this.A0T = C99274sY.A00(new C150517ko(A002), new C155877tS(this, A002), new C155867tR(A002), A15);
        this.A0V = AnonymousClass1DF.A00(num, new C150487kl(this));
        this.A0U = AnonymousClass1DF.A00(num, new C150477kk(this));
    }

    public void A1r() {
        super.A1r();
        this.A0J = null;
        this.A0N = null;
        this.A0E = null;
        this.A0H = null;
        this.A0F = null;
        this.A0L = null;
    }

    public int A2F() {
        return this.A0W;
    }

    public void A2I(C139436yq r1) {
        C72453Mb.A1N(r1);
    }
}
