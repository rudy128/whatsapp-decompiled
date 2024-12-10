package com.whatsapp.messagetranslation.onboarding;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1NN;
import X.AnonymousClass1OS;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass4RU;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C19830z4;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.messagetranslation.TranslationManager$setAutoTranslationsEnabledForConversation$1;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.TranslationViewModel$translate$1", f = "TranslationViewModel.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationViewModel$translate$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ TranslationViewModel this$0;

    @DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.TranslationViewModel$translate$1$1", f = "TranslationViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.messagetranslation.onboarding.TranslationViewModel$translate$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                TranslationViewModel translationViewModel = TranslationViewModel.this;
                List<AnonymousClass205> list = translationViewModel.A02;
                if (list != null) {
                    for (AnonymousClass205 A05 : list) {
                        AnonymousClass206 A052 = translationViewModel.A06.A01.A05(A05);
                        if (A052 != null) {
                            AnonymousClass4RU r2 = translationViewModel.A05;
                            String str = translationViewModel.A01;
                            String A16 = AnonymousClass3MZ.A16();
                            C18070vi.A0X(A16);
                            r2.A00(A052, str, A16);
                        }
                    }
                }
                TranslationViewModel translationViewModel2 = TranslationViewModel.this;
                AnonymousClass4RU r4 = translationViewModel2.A05;
                AnonymousClass1BI r3 = translationViewModel2.A00;
                if (r3 != null) {
                    String str2 = translationViewModel2.A01;
                    String A162 = AnonymousClass3MZ.A16();
                    C18070vi.A0X(A162);
                    boolean z = TranslationViewModel.this.A03;
                    AnonymousClass3MW.A1X(r4.A04, new TranslationManager$setAutoTranslationsEnabledForConversation$1(r3, r4, str2, A162, (C30391dr) null, z), r4.A06);
                    C17880vN.A1E(C19830z4.A00((C19830z4) TranslationViewModel.this.A07.get()), "last_selected_message_translation_source_language_tag", TranslationViewModel.this.A01);
                    return C27621Wu.A00;
                }
                C18070vi.A11("chatJid");
                throw null;
            }
            throw AnonymousClass000.A0l();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationViewModel$translate$1(TranslationViewModel translationViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = translationViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new TranslationViewModel$translate$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new TranslationViewModel$translate$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final TranslationViewModel translationViewModel = this.this$0;
            C18600wl r2 = translationViewModel.A08;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        TranslationViewModel translationViewModel2 = this.this$0;
        AnonymousClass1NN r1 = translationViewModel2.A04;
        AnonymousClass1BI r02 = translationViewModel2.A00;
        if (r02 != null) {
            r1.A02(r02);
            this.this$0.A04.A01(1);
            return C27621Wu.A00;
        }
        C18070vi.A11("chatJid");
        throw null;
    }
}
