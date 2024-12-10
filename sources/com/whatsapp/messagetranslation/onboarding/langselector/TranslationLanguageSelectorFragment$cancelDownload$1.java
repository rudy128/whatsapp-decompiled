package com.whatsapp.messagetranslation.onboarding.langselector;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1OS;
import X.AnonymousClass2SS;
import X.AnonymousClass3MX;
import X.AnonymousClass436;
import X.C122716Rq;
import X.C1407873b;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C37581pm;
import X.C73053Ou;
import android.widget.Button;
import com.whatsapp.ml.v2.MLModelManagerV2$cancelDownloadInternal$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$cancelDownload$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationLanguageSelectorFragment$cancelDownload$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C73053Ou $adapter;
    public final /* synthetic */ AnonymousClass436 $item;
    public int label;
    public final /* synthetic */ TranslationLanguageSelectorFragment this$0;

    @DebugMetadata(c = "com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$cancelDownload$1$1", f = "TranslationLanguageSelectorFragment.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.messagetranslation.onboarding.langselector.TranslationLanguageSelectorFragment$cancelDownload$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(r2, translationLanguageSelectorFragment, r5);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass00H r0 = translationLanguageSelectorFragment.A08;
                if (r0 != null) {
                    C1407873b r5 = (C1407873b) r0.get();
                    C122716Rq r4 = r2.A03;
                    this.label = 1;
                    if (C30451dy.A00(this, r5.A07, new MLModelManagerV2$cancelDownloadInternal$2(r5, r4, (C30391dr) null, false)) == r6) {
                        return r6;
                    }
                } else {
                    C18070vi.A11("mlModelManager");
                    throw null;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationLanguageSelectorFragment$cancelDownload$1(AnonymousClass436 r2, C73053Ou r3, TranslationLanguageSelectorFragment translationLanguageSelectorFragment, C30391dr r5) {
        super(2, r5);
        this.$item = r2;
        this.this$0 = translationLanguageSelectorFragment;
        this.$adapter = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new TranslationLanguageSelectorFragment$cancelDownload$1(this.$item, this.$adapter, this.this$0, r6);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$item.A01 = false;
            Button button = this.this$0.A00;
            if (button != null) {
                button.setEnabled(true);
            }
            C37581pm A00 = AnonymousClass2SS.A00(this.this$0);
            final TranslationLanguageSelectorFragment translationLanguageSelectorFragment = this.this$0;
            final AnonymousClass436 r2 = this.$item;
            AnonymousClass3MX.A1Q(new AnonymousClass1((C30391dr) null), A00);
            this.$adapter.notifyDataSetChanged();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationLanguageSelectorFragment$cancelDownload$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
