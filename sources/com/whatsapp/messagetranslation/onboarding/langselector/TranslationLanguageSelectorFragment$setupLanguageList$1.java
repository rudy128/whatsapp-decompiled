package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass1HF;
import X.AnonymousClass1OS;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.C17880vN;
import X.C17890vO;
import X.C18000vb;
import X.C18070vi;
import X.C18600wl;
import X.C19830z4;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C42551yM;
import X.C73053Ou;
import X.C90724eX;
import X.C90804ef;
import android.content.Context;
import android.view.View;
import com.whatsapp.BottomSheetListView;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$setupLanguageList$1", f = "TranslationLanguageSelectorFragment.kt", i = {0, 0}, l = {130}, m = "invokeSuspend", n = {"adapter", "languageList"}, s = {"L$0", "L$1"})
public final class TranslationLanguageSelectorFragment$setupLanguageList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ View $view;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$setupLanguageList$1(View view, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, C30391dr r4) {
        super(2, r4);
        this.$view = view;
        this.this$0 = translationLanguageSelectorFragment;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TranslationLanguageSelectorFragment$setupLanguageList$1(this.$view, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C73053Ou r7;
        List A00;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Context A04 = AnonymousClass3MY.A04(this.$view);
            C18000vb r0 = this.this$0.A04;
            if (r0 != null) {
                r7 = new C73053Ou(A04, r0);
                A00 = TranslationLanguageSelectorFragment.A00(AnonymousClass3MY.A04(this.$view), this.this$0);
                TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
                C18600wl r2 = translationLanguageSelectorFragment.A0D;
                if (r2 != null) {
                    TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1 translationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1 = new TranslationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1(translationLanguageSelectorFragment, (C30391dr) null);
                    this.L$0 = r7;
                    this.L$1 = A00;
                    this.label = 1;
                    obj = C30451dy.A00(this, r2, translationLanguageSelectorFragment$setupLanguageList$1$chatSettings$1);
                    if (obj == r5) {
                        return r5;
                    }
                } else {
                    str = "ioDispatcher";
                }
            } else {
                str = "whatsAppLocale";
            }
            C18070vi.A11(str);
            throw null;
        } else if (i == 1) {
            A00 = (List) this.L$1;
            r7 = (C73053Ou) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C18070vi.A0a(obj);
        String str2 = ((C42551yM) obj).A0M;
        C19830z4 r02 = this.this$0.A03;
        if (r02 != null) {
            String A0r = C17880vN.A0r(C17890vO.A0B(r02), "last_selected_message_translation_source_language_tag");
            TranslationLanguageSelectorFragment.A02(r7, this.this$0, str2, A0r, A00);
            C18070vi.A0d(A00, 0);
            r7.A01 = A00;
            r7.notifyDataSetChanged();
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment2 = this.this$0;
            View A06 = AnonymousClass1HF.A06(this.$view, 2131431934);
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment3 = this.this$0;
            View view = this.$view;
            BottomSheetListView bottomSheetListView = (BottomSheetListView) A06;
            C18070vi.A0b(bottomSheetListView);
            bottomSheetListView.setOnScrollListener(new C90724eX(C18070vi.A05(view, 2131430073), bottomSheetListView, AnonymousClass3MZ.A09(translationLanguageSelectorFragment3).getDimensionPixelSize(2131167226)));
            translationLanguageSelectorFragment2.A01 = bottomSheetListView;
            BottomSheetListView bottomSheetListView2 = this.this$0.A01;
            if (bottomSheetListView2 != null) {
                bottomSheetListView2.setAdapter(r7);
            }
            TranslationLanguageSelectorFragment translationLanguageSelectorFragment4 = this.this$0;
            BottomSheetListView bottomSheetListView3 = translationLanguageSelectorFragment4.A01;
            if (bottomSheetListView3 != null) {
                bottomSheetListView3.setOnItemClickListener(new C90804ef(this.$view, r7, translationLanguageSelectorFragment4, str2, A0r));
            }
            return C27621Wu.A00;
        }
        str = "waSharedPreferences";
        C18070vi.A11(str);
        throw null;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationLanguageSelectorFragment$setupLanguageList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
