package com.whatsapp.messagetranslation;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass206;
import X.AnonymousClass4RU;
import X.C17880vN;
import X.C18600wl;
import X.C189449jG;
import X.C24681Lg;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.messagetranslation.TranslationManager$removeTranslation$1", f = "TranslationManager.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class TranslationManager$removeTranslation$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $selectedMessages;
    public int label;
    public final /* synthetic */ AnonymousClass4RU this$0;

    @DebugMetadata(c = "com.whatsapp.messagetranslation.TranslationManager$removeTranslation$1$1", f = "TranslationManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.messagetranslation.TranslationManager$removeTranslation$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r5) {
            return new AnonymousClass1(collection, r5);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                C30691eM.A01(obj);
                ((C24681Lg) AnonymousClass4RU.this.A02.get()).A04(collection, -1);
                return C27621Wu.A00;
            }
            throw AnonymousClass000.A0l();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TranslationManager$removeTranslation$1(AnonymousClass4RU r2, Collection collection, C30391dr r4) {
        super(2, r4);
        this.$selectedMessages = collection;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new TranslationManager$removeTranslation$1(this.this$0, this.$selectedMessages, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Iterator it = this.$selectedMessages.iterator();
            while (it.hasNext()) {
                AnonymousClass206 A0Y = C17880vN.A0Y(it);
                A0Y.A0k((String) null);
                C17880vN.A0c(this.this$0.A01).A05(A0Y, -1);
                ((C189449jG) this.this$0.A03.get()).A00(A0Y.A0x);
            }
            final AnonymousClass4RU r3 = this.this$0;
            C18600wl r2 = r3.A05;
            final Collection collection = this.$selectedMessages;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r2, r0) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TranslationManager$removeTranslation$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
