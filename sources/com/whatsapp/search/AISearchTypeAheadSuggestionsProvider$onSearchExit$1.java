package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C134186qB;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$onSearchExit$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {272}, m = "invokeSuspend", n = {}, s = {})
public final class AISearchTypeAheadSuggestionsProvider$onSearchExit$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C134186qB this$0;

    @DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$onSearchExit$1$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$onSearchExit$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0063 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                int r0 = r10.label
                if (r0 != 0) goto L_0x0082
                X.C30691eM.A01(r11)
                X.6qB r0 = X.C134186qB.this
                com.whatsapp.data.repository.MetaAISearchRepository r7 = r0.A0F
                X.6L0 r5 = r7.A02
                monitor-enter(r5)
                boolean r0 = r5.A00     // Catch:{ all -> 0x007f }
                if (r0 == 0) goto L_0x006a
                r6 = 0
                X.17r r1 = r5.A03     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.lang.String r0 = "ai_search_typeahead_suggestions"
                java.io.File r4 = r1.A0b(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                X.00z r0 = r5.A02     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.util.LinkedHashMap r0 = r0.A06()     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                r8.<init>()     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.util.Iterator r9 = X.AnonymousClass000.A15(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
            L_0x002a:
                boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                if (r0 == 0) goto L_0x005a
                java.util.Map$Entry r3 = X.AnonymousClass000.A16(r9)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                org.json.JSONObject r2 = X.C17880vN.A15()     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.lang.Object r0 = r3.getKey()     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                X.6qN r0 = (X.C134306qN) r0     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.lang.String r1 = r0.A00     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.lang.String r0 = "query"
                r2.put(r0, r1)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.lang.Object r0 = r3.getValue()     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                X.76w r0 = (X.C1417676w) r0     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                org.json.JSONArray r1 = X.AnonymousClass71U.A00(r0)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.lang.String r0 = "suggestions"
                r2.put(r0, r1)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                r8.put(r2)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                goto L_0x002a
            L_0x005a:
                java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
                X.AnonymousClass3Gr.A01(r4, r1, r0)     // Catch:{ Exception -> 0x0063, all -> 0x0066 }
            L_0x0063:
                r5.A00 = r6     // Catch:{ all -> 0x007f }
                goto L_0x006a
            L_0x0066:
                r0 = move-exception
                r5.A00 = r6     // Catch:{ all -> 0x007f }
                throw r0     // Catch:{ all -> 0x007f }
            L_0x006a:
                monitor-exit(r5)
                X.6fy r0 = r7.A01
                X.0vl r0 = r0.A01
                android.content.SharedPreferences$Editor r3 = X.C17890vO.A0A(r0)
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.String r0 = "typeahead_search_suggestions_last_save_time"
                X.C17880vN.A1D(r3, r0, r1)
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x007f:
                r0 = move-exception
                monitor-exit(r5)
                throw r0
            L_0x0082:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$onSearchExit$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AISearchTypeAheadSuggestionsProvider$onSearchExit$1(C134186qB r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AISearchTypeAheadSuggestionsProvider$onSearchExit$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AISearchTypeAheadSuggestionsProvider$onSearchExit$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C134186qB r3 = this.this$0;
            C18600wl r2 = r3.A0I;
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
        return C27621Wu.A00;
    }
}
