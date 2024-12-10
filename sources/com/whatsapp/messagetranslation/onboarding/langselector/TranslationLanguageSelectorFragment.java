package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11E;
import X.AnonymousClass1HF;
import X.AnonymousClass1Nb;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass434;
import X.AnonymousClass435;
import X.AnonymousClass436;
import X.AnonymousClass4a6;
import X.C010105w;
import X.C122716Rq;
import X.C124016Ws;
import X.C127516eU;
import X.C131606lN;
import X.C138776xf;
import X.C1407873b;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C18090vk;
import X.C18600wl;
import X.C19830z4;
import X.C25351CeA;
import X.C30391dr;
import X.C72463Mc;
import X.C73053Ou;
import X.C73203Rj;
import X.C74483bk;
import X.C83294Eo;
import X.C90054dS;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.BottomSheetListView;
import com.whatsapp.messagetranslation.onboarding.TranslationViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;

public final class TranslationLanguageSelectorFragment extends Hilt_TranslationLanguageSelectorFragment {
    public static final List A0E;
    public Button A00;
    public BottomSheetListView A01;
    public AnonymousClass11E A02;
    public C19830z4 A03;
    public C18000vb A04;
    public TranslationViewModel A05;
    public C131606lN A06;
    public AnonymousClass1Nb A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public AnonymousClass00H A0A;
    public AnonymousClass00H A0B;
    public AnonymousClass00H A0C;
    public C18600wl A0D;

    static {
        String[] strArr = new String[6];
        strArr[0] = "ar";
        strArr[1] = "en";
        strArr[2] = "es";
        strArr[3] = "hi";
        strArr[4] = "pt";
        A0E = C18070vi.A0O("ru", strArr, 5);
    }

    public static final void A01(View view, C73053Ou r6, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2, int i, boolean z) {
        TranslationLanguageSelectorFragment translationLanguageSelectorFragment2 = translationLanguageSelectorFragment;
        AnonymousClass00H r0 = translationLanguageSelectorFragment.A0A;
        if (r0 != null) {
            C17880vN.A1F(C17890vO.A0A(((C127516eU) r0.get()).A01), "is_download_translation_model_wifi_only", z);
            AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$handleItemClick$1(view, r6, translationLanguageSelectorFragment2, str, str2, (C30391dr) null, i), AnonymousClass3MZ.A0H(translationLanguageSelectorFragment));
            return;
        }
        C18070vi.A11("mtSharedPreferences");
        throw null;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        TranslationViewModel translationViewModel = (TranslationViewModel) AnonymousClass3Ma.A0I(this).A00(TranslationViewModel.class);
        this.A05 = translationViewModel;
        if (translationViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        View A0L = C72463Mc.A0L(view);
        C18070vi.A0d(A0L, 0);
        BottomSheetBehavior.A02(A0L).A0Z(new C74483bk(translationViewModel, 5));
        C90054dS.A00(AnonymousClass1HF.A06(view, 2131429133), this, 3);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131427810);
        A0J.setText(2131899534);
        ViewGroup.LayoutParams layoutParams = A0J.getLayoutParams();
        C18070vi.A0z(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.width = -1;
        marginLayoutParams.setMarginStart(0);
        A0J.setLayoutParams(marginLayoutParams);
        AnonymousClass3MX.A1C(A0J.getContext(), A0J, 2131103221);
        A0J.setMaxLines(2);
        A0J.setTextAlignment(4);
        Button button = (Button) AnonymousClass1HF.A06(view, 2131429537);
        this.A00 = button;
        if (button != null) {
            C90054dS.A00(button, this, 4);
        }
        AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$setupLanguageList$1(view, this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
    }

    public static final ArrayList A00(Context context, TranslationLanguageSelectorFragment translationLanguageSelectorFragment) {
        String str;
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        List list = A0E;
        ArrayList A133 = AnonymousClass000.A13();
        for (Object next : list) {
            AnonymousClass3MZ.A1V(next, A133, C18070vi.A18(next, AnonymousClass3MZ.A16()) ? 1 : 0);
        }
        Iterator it = A133.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            String A012 = C25351CeA.A01(Locale.forLanguageTag(A0v));
            C18070vi.A0X(A012);
            String A16 = AnonymousClass3MZ.A16();
            C18070vi.A0X(A16);
            C122716Rq A002 = C124016Ws.A00(A0v, A16);
            AnonymousClass00H r0 = translationLanguageSelectorFragment.A08;
            if (r0 == null) {
                str = "mlModelManager";
            } else if (!((C1407873b) r0.get()).A08(A002)) {
                String A162 = AnonymousClass3MZ.A16();
                C18070vi.A0X(A162);
                C122716Rq A003 = C124016Ws.A00(A0v, A162);
                C131606lN r1 = translationLanguageSelectorFragment.A06;
                if (r1 != null) {
                    A132.add(new AnonymousClass436(A003, A012, A0v, (int) C138776xf.A00(r1.A00(A002, false).BV1())));
                } else {
                    str = "mlProviderFactory";
                }
            } else {
                A13.add(new AnonymousClass435(A012, A0v));
            }
            C18070vi.A11(str);
            throw null;
        }
        ArrayList A134 = AnonymousClass000.A13();
        if (A13.size() > 0) {
            A134.add(new AnonymousClass434(C18070vi.A0F(context, 2131899538)));
            A134.addAll(A13);
        }
        if (A132.size() > 0) {
            A134.add(new AnonymousClass434(C18070vi.A0F(context, 2131899537)));
            A134.addAll(A132);
        }
        return A134;
    }

    public static final void A02(C73053Ou r6, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2, List list) {
        ArrayList A13 = AnonymousClass000.A13();
        if (list.get(1) instanceof AnonymousClass435) {
            int size = list.size();
            for (int i = 1; i < size; i++) {
                if (list.get(i) instanceof AnonymousClass435) {
                    Object obj = list.get(i);
                    C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.messagetranslation.onboarding.langselector.SingleSelectDownloadedLanguageItem");
                    A13.add(((AnonymousClass435) obj).A01);
                } else {
                    for (Object A18 : A0E) {
                        if (!C18070vi.A18(A18, AnonymousClass3MZ.A16())) {
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
        }
        int i2 = 0;
        if (A13.size() > 0) {
            TranslationViewModel translationViewModel = translationLanguageSelectorFragment.A05;
            if (translationViewModel != null) {
                if (str == null || str.length() == 0 || !A13.contains(str)) {
                    if (str2 == null || str2.length() == 0 || !A13.contains(str2)) {
                        str = (String) A13.get(0);
                    } else {
                        str = str2;
                    }
                }
                C18070vi.A0d(str, 0);
                translationViewModel.A01 = str;
            }
            C18070vi.A11("viewModel");
            throw null;
        }
        TranslationViewModel translationViewModel2 = translationLanguageSelectorFragment.A05;
        if (translationViewModel2 != null) {
            if (translationViewModel2.A01.length() > 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C83294Eo r1 = (C83294Eo) it.next();
                    if (r1 instanceof AnonymousClass435) {
                        String str3 = ((AnonymousClass435) r1).A01;
                        TranslationViewModel translationViewModel3 = translationLanguageSelectorFragment.A05;
                        if (translationViewModel3 != null) {
                            if (C18070vi.A18(str3, translationViewModel3.A01)) {
                                if (i2 != -1) {
                                    r6.A00 = i2;
                                    return;
                                }
                                return;
                            }
                        }
                    }
                    i2++;
                }
                return;
            }
            return;
        }
        C18070vi.A11("viewModel");
        throw null;
    }

    public static final void A03(TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, C18090vk r6, C18090vk r7, int i, int i2) {
        View A082 = AnonymousClass3MX.A08(translationLanguageSelectorFragment.A1D(), 2131627232);
        C73203Rj A042 = AnonymousClass4a6.A04(translationLanguageSelectorFragment);
        A042.A0c(A082);
        A042.A0T(false);
        C010105w A0L = AnonymousClass3MY.A0L(A042);
        AnonymousClass3MW.A0J(A082, 2131436208).setText(i);
        AnonymousClass3MW.A0J(A082, 2131432664).setText(str);
        TextView A0J = AnonymousClass3MW.A0J(A082, 2131427466);
        A0J.setText(i2);
        AnonymousClass3MZ.A1O(A0J, A0L, r6, 22);
        AnonymousClass3MZ.A1O(AnonymousClass1HF.A06(A082, 2131433257), A0L, r7, 23);
        A0L.show();
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
        this.A01 = null;
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        A27.setCanceledOnTouchOutside(false);
        return A27;
    }

    public int A2F() {
        return 2131625775;
    }
}
