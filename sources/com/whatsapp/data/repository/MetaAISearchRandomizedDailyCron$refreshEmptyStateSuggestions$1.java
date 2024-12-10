package com.whatsapp.data.repository;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7F5;
import X.C17880vN;
import X.C17890vO;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.repository.MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1", f = "MetaAISearchRandomizedDailyCron.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AnonymousClass7F5 this$0;

    @DebugMetadata(c = "com.whatsapp.data.repository.MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1$1", f = "MetaAISearchRandomizedDailyCron.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.data.repository.MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                this.label = 1;
                if (((MetaAISearchRepository) AnonymousClass7F5.this.A02.get()).A03(this) == r2) {
                    return r2;
                }
            } else if (i == 1) {
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            return C27621Wu.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1(AnonymousClass7F5 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MetaAISearchRandomizedDailyCron$refreshEmptyStateSuggestions$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C17880vN.A1E(C17890vO.A0A(this.this$0.A00.A01), "empty_state_search_suggestions", (String) null);
            final AnonymousClass7F5 r2 = this.this$0;
            C18600wl r1 = r2.A03;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r1, r0) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
