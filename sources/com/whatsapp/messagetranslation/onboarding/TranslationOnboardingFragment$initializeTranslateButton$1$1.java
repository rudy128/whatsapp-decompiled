package com.whatsapp.messagetranslation.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1HF;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C37581pm;
import X.C90054dS;
import X.C91374fa;
import X.C98494rF;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment$initializeTranslateButton$1$1", f = "TranslationOnboardingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationOnboardingFragment$initializeTranslateButton$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $fMessageKeys;
    public final /* synthetic */ boolean $isTranslated;
    public final /* synthetic */ WDSButton $this_apply;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TranslationOnboardingFragment this$0;

    @DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment$initializeTranslateButton$1$1$1", f = "TranslationOnboardingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment$initializeTranslateButton$1$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            C98494rF r3 = A00;
            return new AnonymousClass1(translationOnboardingFragment, wDSButton, r6, r3);
        }

        public final Object invokeSuspend(Object obj) {
            String A0S;
            String A0S2;
            if (this.label == 0) {
                C30691eM.A01(obj);
                AnonymousClass206 r0 = (AnonymousClass206) A00.element;
                if (r0 == null || (A0S2 = r0.A0S()) == null || A0S2.length() == 0) {
                    WDSButton wDSButton = wDSButton;
                    wDSButton.setText(wDSButton.getResources().getString(2131897131));
                    C90054dS.A00(wDSButton, translationOnboardingFragment, 2);
                } else {
                    WDSButton wDSButton2 = wDSButton;
                    wDSButton2.setText(wDSButton2.getResources().getString(2131895145));
                    AnonymousClass3MZ.A1O(wDSButton, A00, translationOnboardingFragment, 21);
                }
                TranslationOnboardingFragment translationOnboardingFragment = translationOnboardingFragment;
                AnonymousClass206 r5 = (AnonymousClass206) A00.element;
                translationOnboardingFragment.A1F().A0t(new C91374fa(translationOnboardingFragment, 26), translationOnboardingFragment, "translation_language_selector_result_key");
                if (!(r5 == null || (A0S = r5.A0S()) == null || A0S.length() == 0)) {
                    AnonymousClass1HF.A06(translationOnboardingFragment.A17(), 2131436429).setEnabled(true);
                    C37581pm A0H = AnonymousClass3MZ.A0H(translationOnboardingFragment);
                    C18600wl r2 = translationOnboardingFragment.A06;
                    if (r2 != null) {
                        AnonymousClass3MW.A1X(r2, new TranslationOnboardingFragment$initializeTranslateFromButton$2(translationOnboardingFragment, r5, (C30391dr) null), A0H);
                    } else {
                        AnonymousClass3MW.A1K();
                        throw null;
                    }
                }
                C90054dS.A00(translationOnboardingFragment.A17().findViewById(2131436431), translationOnboardingFragment, 0);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationOnboardingFragment$initializeTranslateButton$1$1(TranslationOnboardingFragment translationOnboardingFragment, WDSButton wDSButton, List list, C30391dr r5, boolean z) {
        super(2, r5);
        this.$isTranslated = z;
        this.$fMessageKeys = list;
        this.this$0 = translationOnboardingFragment;
        this.$this_apply = wDSButton;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        boolean z = this.$isTranslated;
        TranslationOnboardingFragment$initializeTranslateButton$1$1 translationOnboardingFragment$initializeTranslateButton$1$1 = new TranslationOnboardingFragment$initializeTranslateButton$1$1(this.this$0, this.$this_apply, this.$fMessageKeys, r8, z);
        translationOnboardingFragment$initializeTranslateButton$1$1.L$0 = obj;
        return translationOnboardingFragment$initializeTranslateButton$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        List list;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r6 = (AnonymousClass1OX) this.L$0;
            final C98494rF A00 = C98494rF.A00();
            if (this.$isTranslated && (list = this.$fMessageKeys) != null && !list.isEmpty()) {
                AnonymousClass00H r0 = this.this$0.A03;
                if (r0 != null) {
                    A00.element = C17880vN.A0c(r0).A01.A05((AnonymousClass205) this.$fMessageKeys.get(0));
                } else {
                    str = "fMessageDatabase";
                    C18070vi.A11(str);
                    throw null;
                }
            }
            final TranslationOnboardingFragment translationOnboardingFragment = this.this$0;
            C18600wl r3 = translationOnboardingFragment.A07;
            if (r3 != null) {
                final WDSButton wDSButton = this.$this_apply;
                AnonymousClass3MW.A1X(r3, new AnonymousClass1((C30391dr) null), r6);
                return C27621Wu.A00;
            }
            str = "mainDispatcher";
            C18070vi.A11(str);
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationOnboardingFragment$initializeTranslateButton$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
