package com.whatsapp.search;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C134186qB;
import X.C136896ua;
import X.C18600wl;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
public final class AISearchTypeAheadSuggestionsProvider$initSearch$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $query;
    public final /* synthetic */ C136896ua $searchPerformanceEvent;
    public int label;
    public final /* synthetic */ C134186qB this$0;

    @DebugMetadata(c = "com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1$1", f = "AISearchTypeAheadSuggestionsProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            return new AnonymousClass1(r2, str, r6);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0088, code lost:
            r2.A01();
            r2.A04((java.lang.Boolean) null, X.AnonymousClass3MW.A0v(3), new java.lang.Long((long) r3.length()), (java.lang.Long) null);
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                int r0 = r8.label
                if (r0 != 0) goto L_0x00a7
                X.C30691eM.A01(r9)
                X.6qB r0 = X.C134186qB.this     // Catch:{ Exception -> 0x0088 }
                com.whatsapp.data.repository.MetaAISearchRepository r1 = r0.A0F     // Catch:{ Exception -> 0x0088 }
                java.lang.String r0 = r3     // Catch:{ Exception -> 0x0088 }
                X.76w r1 = r1.A02(r0)     // Catch:{ Exception -> 0x0088 }
                if (r1 == 0) goto L_0x004b
                X.6ua r0 = r2     // Catch:{ Exception -> 0x0088 }
                r0.A01()     // Catch:{ Exception -> 0x0088 }
                X.6qB r0 = X.C134186qB.this     // Catch:{ Exception -> 0x0088 }
                X.1Dg r0 = r0.A08     // Catch:{ Exception -> 0x0088 }
                java.util.List r2 = r1.A00     // Catch:{ Exception -> 0x0088 }
                r0.A0E(r2)     // Catch:{ Exception -> 0x0088 }
                X.6ua r6 = r2     // Catch:{ Exception -> 0x0088 }
                java.lang.Boolean r5 = X.AnonymousClass000.A0i()     // Catch:{ Exception -> 0x0088 }
                java.lang.String r0 = r3     // Catch:{ Exception -> 0x0088 }
                int r0 = r0.length()     // Catch:{ Exception -> 0x0088 }
                long r0 = (long) r0     // Catch:{ Exception -> 0x0088 }
                java.lang.Long r4 = new java.lang.Long     // Catch:{ Exception -> 0x0088 }
                r4.<init>(r0)     // Catch:{ Exception -> 0x0088 }
                int r0 = r2.size()     // Catch:{ Exception -> 0x0088 }
                long r2 = (long) r0     // Catch:{ Exception -> 0x0088 }
                java.lang.Long r1 = new java.lang.Long     // Catch:{ Exception -> 0x0088 }
                r1.<init>(r2)     // Catch:{ Exception -> 0x0088 }
                r0 = 0
                java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)     // Catch:{ Exception -> 0x0088 }
                r6.A04(r5, r0, r4, r1)     // Catch:{ Exception -> 0x0088 }
                X.6ua r0 = r2     // Catch:{ Exception -> 0x0088 }
                r0.A03()     // Catch:{ Exception -> 0x0088 }
                goto L_0x00a4
            L_0x004b:
                X.6qB r7 = X.C134186qB.this     // Catch:{ Exception -> 0x0088 }
                X.6ku r1 = r7.A0D     // Catch:{ Exception -> 0x0088 }
                r0 = 6
                X.6ua r6 = r1.A00(r0)     // Catch:{ Exception -> 0x0088 }
                java.lang.Object r5 = r7.A0H     // Catch:{ Exception -> 0x0088 }
                monitor-enter(r5)     // Catch:{ Exception -> 0x0088 }
                java.lang.Runnable r0 = r7.A00     // Catch:{ all -> 0x0085 }
                if (r0 != 0) goto L_0x0083
                monitor-enter(r6)     // Catch:{ all -> 0x0085 }
                long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0080 }
                java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0080 }
                r6.A00 = r0     // Catch:{ all -> 0x0080 }
                monitor-exit(r6)     // Catch:{ all -> 0x0085 }
                X.10I r4 = r7.A0G     // Catch:{ all -> 0x0085 }
                boolean r1 = r7.A02     // Catch:{ all -> 0x0085 }
                r0 = 500(0x1f4, float:7.0E-43)
                if (r1 == 0) goto L_0x0071
                r0 = 200(0xc8, float:2.8E-43)
            L_0x0071:
                long r2 = (long) r0     // Catch:{ all -> 0x0085 }
                r1 = 11
                X.7Pl r0 = new X.7Pl     // Catch:{ all -> 0x0085 }
                r0.<init>(r6, r7, r1)     // Catch:{ all -> 0x0085 }
                X.25d r0 = r4.CGv(r0, r2)     // Catch:{ all -> 0x0085 }
                r7.A00 = r0     // Catch:{ all -> 0x0085 }
                goto L_0x0083
            L_0x0080:
                r0 = move-exception
                monitor-exit(r6)     // Catch:{ all -> 0x0085 }
                throw r0     // Catch:{ all -> 0x0085 }
            L_0x0083:
                monitor-exit(r5)     // Catch:{ Exception -> 0x0088 }
                goto L_0x00a4
            L_0x0085:
                r0 = move-exception
                monitor-exit(r5)     // Catch:{ Exception -> 0x0088 }
                throw r0     // Catch:{ Exception -> 0x0088 }
            L_0x0088:
                X.6ua r0 = r2
                r0.A01()
                X.6ua r3 = r2
                java.lang.String r0 = r3
                int r0 = r0.length()
                long r0 = (long) r0
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r0)
                r0 = 3
                java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r0)
                r0 = 0
                r3.A04(r0, r1, r2, r0)
            L_0x00a4:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x00a7:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.search.AISearchTypeAheadSuggestionsProvider$initSearch$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AISearchTypeAheadSuggestionsProvider$initSearch$1(C134186qB r2, C136896ua r3, String str, C30391dr r5) {
        super(2, r5);
        this.this$0 = r2;
        this.$query = str;
        this.$searchPerformanceEvent = r3;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new AISearchTypeAheadSuggestionsProvider$initSearch$1(this.this$0, this.$searchPerformanceEvent, this.$query, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r7 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final C134186qB r5 = this.this$0;
            C18600wl r4 = r5.A0I;
            final String str = this.$query;
            final C136896ua r2 = this.$searchPerformanceEvent;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C30451dy.A00(this, r4, r0) == r7) {
                return r7;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AISearchTypeAheadSuggestionsProvider$initSearch$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
