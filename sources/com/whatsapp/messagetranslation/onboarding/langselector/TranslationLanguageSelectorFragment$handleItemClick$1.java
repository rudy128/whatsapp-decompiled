package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass2SS;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass435;
import X.AnonymousClass436;
import X.C122716Rq;
import X.C131606lN;
import X.C138776xf;
import X.C1407873b;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C37801q9;
import X.C73053Ou;
import X.C83294Eo;
import X.C87324Vd;
import X.C91564ft;
import android.view.View;
import android.widget.Button;
import com.whatsapp.messagetranslation.onboarding.TranslationViewModel;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$handleItemClick$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationLanguageSelectorFragment$handleItemClick$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C73053Ou $adapter;
    public final /* synthetic */ String $chatSettingLang;
    public final /* synthetic */ String $lastSelectedSourceLangTag;
    public final /* synthetic */ int $position;
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$handleItemClick$1(View view, C73053Ou r3, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, String str, String str2, C30391dr r7, int i) {
        super(2, r7);
        this.$adapter = r3;
        this.$position = i;
        this.this$0 = translationLanguageSelectorFragment;
        this.$view = view;
        this.$chatSettingLang = str;
        this.$lastSelectedSourceLangTag = str2;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        C73053Ou r2 = this.$adapter;
        int i = this.$position;
        return new TranslationLanguageSelectorFragment$handleItemClick$1(this.$view, r2, this.this$0, this.$chatSettingLang, this.$lastSelectedSourceLangTag, r10, i);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.4rD] */
    public final Object invokeSuspend(Object obj) {
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C83294Eo A00 = this.$adapter.getItem(this.$position);
            if (A00 instanceof AnonymousClass435) {
                TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
                int i = this.$position;
                C73053Ou r3 = this.$adapter;
                String str2 = ((AnonymousClass435) A00).A01;
                TranslationViewModel translationViewModel = translationLanguageSelectorFragment.A05;
                if (translationViewModel == null) {
                    str = "viewModel";
                } else {
                    C18070vi.A0d(str2, 0);
                    translationViewModel.A01 = str2;
                    r3.A00 = i;
                    Button button = translationLanguageSelectorFragment.A00;
                    if (button != null) {
                        button.setEnabled(true);
                    }
                    r3.notifyDataSetChanged();
                    return C27621Wu.A00;
                }
            } else {
                if (A00 instanceof AnonymousClass436) {
                    AnonymousClass436 r5 = (AnonymousClass436) A00;
                    boolean z = r5.A01;
                    TranslationLanguageSelectorFragment translationLanguageSelectorFragment2 = this.this$0;
                    if (z) {
                        C73053Ou r32 = this.$adapter;
                        AnonymousClass3MX.A1Q(new TranslationLanguageSelectorFragment$cancelDownload$1(r5, r32, translationLanguageSelectorFragment2, (C30391dr) null), AnonymousClass2SS.A00(translationLanguageSelectorFragment2));
                    } else {
                        Button button2 = translationLanguageSelectorFragment2.A00;
                        if (button2 != null) {
                            button2.setEnabled(false);
                        }
                        r5.A01 = true;
                        C122716Rq r9 = r5.A03;
                        C131606lN r0 = this.this$0.A06;
                        if (r0 != null) {
                            long A002 = C138776xf.A00(r0.A00(r9, false).BV1());
                            AnonymousClass00H r02 = this.this$0.A08;
                            if (r02 != null) {
                                boolean A08 = ((C1407873b) r02.get()).A08(r9);
                                TranslationLanguageSelectorFragment translationLanguageSelectorFragment3 = this.this$0;
                                if (!A08) {
                                    AnonymousClass00H r03 = translationLanguageSelectorFragment3.A08;
                                    if (r03 != null) {
                                        ((C1407873b) r03.get()).A07(r9);
                                        C37801q9 A1G = this.this$0.A1G();
                                        TranslationLanguageSelectorFragment translationLanguageSelectorFragment4 = this.this$0;
                                        C73053Ou r7 = this.$adapter;
                                        View view = this.$view;
                                        String str3 = this.$chatSettingLang;
                                        String str4 = this.$lastSelectedSourceLangTag;
                                        int i2 = this.$position;
                                        ? obj2 = new Object();
                                        AnonymousClass00H r04 = translationLanguageSelectorFragment4.A08;
                                        if (r04 != null) {
                                            C87324Vd.A00(AnonymousClass1OR.A00, ((C1407873b) r04.get()).A05(r9)).A0A(A1G, new C91564ft(view, A00, r7, translationLanguageSelectorFragment4, r9, str3, str4, obj2, i2, A002));
                                        }
                                    }
                                } else {
                                    View view2 = this.$view;
                                    C73053Ou r4 = this.$adapter;
                                    String str5 = this.$chatSettingLang;
                                    String str6 = this.$lastSelectedSourceLangTag;
                                    ArrayList A003 = TranslationLanguageSelectorFragment.A00(AnonymousClass3MY.A04(view2), translationLanguageSelectorFragment3);
                                    TranslationLanguageSelectorFragment.A02(r4, translationLanguageSelectorFragment3, str5, str6, A003);
                                    Button button3 = translationLanguageSelectorFragment3.A00;
                                    if (button3 != null) {
                                        button3.setEnabled(true);
                                    }
                                    C18070vi.A0d(A003, 0);
                                    r4.A01 = A003;
                                    r4.notifyDataSetChanged();
                                }
                            }
                            str = "mlModelManager";
                        } else {
                            str = "mlProviderFactory";
                        }
                    }
                }
                return C27621Wu.A00;
            }
            C18070vi.A11(str);
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationLanguageSelectorFragment$handleItemClick$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
