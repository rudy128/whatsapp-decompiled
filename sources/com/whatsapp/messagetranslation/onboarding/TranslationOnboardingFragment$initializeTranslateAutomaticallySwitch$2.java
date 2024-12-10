package com.whatsapp.messagetranslation.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1Nb;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import androidx.appcompat.widget.SwitchCompat;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.TranslationOnboardingFragment$initializeTranslateAutomaticallySwitch$2", f = "TranslationOnboardingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationOnboardingFragment$initializeTranslateAutomaticallySwitch$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ SwitchCompat $switch;
    public int label;
    public final /* synthetic */ TranslationOnboardingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationOnboardingFragment$initializeTranslateAutomaticallySwitch$2(SwitchCompat switchCompat, AnonymousClass1BI r3, TranslationOnboardingFragment translationOnboardingFragment, C30391dr r5) {
        super(2, r5);
        this.this$0 = translationOnboardingFragment;
        this.$chatJid = r3;
        this.$switch = switchCompat;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        TranslationOnboardingFragment translationOnboardingFragment = this.this$0;
        return new TranslationOnboardingFragment$initializeTranslateAutomaticallySwitch$2(this.$switch, this.$chatJid, translationOnboardingFragment, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1Nb r1 = this.this$0.A02;
            if (r1 != null) {
                boolean z = r1.A0a(this.$chatJid).A0P;
                this.$switch.setChecked(z);
                TranslationViewModel translationViewModel = this.this$0.A01;
                if (translationViewModel == null) {
                    AnonymousClass3MW.A1H();
                } else {
                    translationViewModel.A03 = z;
                    return C27621Wu.A00;
                }
            } else {
                C18070vi.A11("chatSettingsStore");
            }
            throw null;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationOnboardingFragment$initializeTranslateAutomaticallySwitch$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
