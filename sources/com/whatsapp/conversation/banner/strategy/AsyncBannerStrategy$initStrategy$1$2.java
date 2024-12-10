package com.whatsapp.conversation.banner.strategy;

import X.AnonymousClass000;
import X.AnonymousClass1FY;
import X.AnonymousClass1OS;
import X.C23381Fv;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import X.C94434kc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2", f = "AsyncBannerStrategy.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
public final class AsyncBannerStrategy$initStrategy$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1FY $this_apply;
    public int label;
    public final /* synthetic */ C94434kc this$0;

    @DebugMetadata(c = "com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2$1", f = "AsyncBannerStrategy.kt", i = {0, 1}, l = {70, 72, 75}, m = "invokeSuspend", n = {"$this$repeatOnLifecycle", "currentDisplayedMessage"}, s = {"L$0", "L$0"})
    /* renamed from: com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            AnonymousClass1 r0 = new AnonymousClass1(r4);
            r0.L$0 = obj;
            return r0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
            if (r11 == r4) goto L_0x004e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00a2 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
                int r0 = r10.label
                r5 = 3
                r9 = 2
                r8 = 1
                if (r0 == 0) goto L_0x001d
                if (r0 == r8) goto L_0x004f
                if (r0 == r9) goto L_0x0015
                if (r0 != r5) goto L_0x00a3
                X.C30691eM.A01(r11)
            L_0x0012:
                X.1Wu r0 = X.C27621Wu.A00
                return r0
            L_0x0015:
                java.lang.Object r1 = r10.L$0
                X.1Fz r1 = (X.C23421Fz) r1
                X.C30691eM.A01(r11)
                goto L_0x0084
            L_0x001d:
                X.C30691eM.A01(r11)
                java.lang.Object r7 = r10.L$0
                X.1OX r7 = (X.AnonymousClass1OX) r7
                X.4kc r0 = X.C94434kc.this
                com.whatsapp.pininchat.banner.PinInChatBannerViewModel r0 = r0.A02
                X.1DT r0 = r0.A01
                X.1Fz r0 = X.C87324Vd.A01(r0)
                r10.L$0 = r7
                r10.label = r8
                X.4OJ r0 = X.AnonymousClass4Z7.A02(r0, r8)
                r6 = 0
                X.5WJ r3 = new X.5WJ
                r3.<init>()
                X.0wh r2 = r0.A01
                X.1Fz r1 = r0.A03
                X.57I r0 = new X.57I
                r0.<init>(r6, r3, r1)
                X.AnonymousClass3MW.A1X(r2, r0, r7)
                java.lang.Object r11 = r3.BCp(r10)
                if (r11 != r4) goto L_0x0056
            L_0x004e:
                return r4
            L_0x004f:
                java.lang.Object r7 = r10.L$0
                X.1OX r7 = (X.AnonymousClass1OX) r7
                X.C30691eM.A01(r11)
            L_0x0056:
                X.1Fz r11 = (X.C23421Fz) r11
                X.4kc r0 = X.C94434kc.this
                com.whatsapp.pininchat.banner.PinInChatBannerViewModel r0 = r0.A02
                X.1vp r0 = r0.A03
                X.1Fz r0 = X.C87324Vd.A01(r0)
                r10.L$0 = r11
                r10.label = r9
                X.4OJ r0 = X.AnonymousClass4Z7.A02(r0, r8)
                r6 = 0
                X.5WJ r3 = new X.5WJ
                r3.<init>()
                X.0wh r2 = r0.A01
                X.1Fz r1 = r0.A03
                X.57I r0 = new X.57I
                r0.<init>(r6, r3, r1)
                X.AnonymousClass3MW.A1X(r2, r0, r7)
                java.lang.Object r0 = r3.BCp(r10)
                if (r0 == r4) goto L_0x004e
                r1 = r11
                r11 = r0
            L_0x0084:
                X.1Fz r11 = (X.C23421Fz) r11
                r3 = 0
                com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2$1$1 r0 = new com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2$1$1
                r0.<init>(r3)
                X.4ss r2 = X.AnonymousClass4Z8.A00(r0, r1, r11)
                X.4kc r1 = X.C94434kc.this
                r0 = 13
                X.4tB r0 = X.C99614tB.A00(r1, r0)
                r10.L$0 = r3
                r10.label = r5
                java.lang.Object r0 = r2.BFC(r10, r0)
                if (r0 != r4) goto L_0x0012
                return r4
            L_0x00a3:
                java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.conversation.banner.strategy.AsyncBannerStrategy$initStrategy$1$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncBannerStrategy$initStrategy$1$2(AnonymousClass1FY r2, C94434kc r3, C30391dr r4) {
        super(2, r4);
        this.$this_apply = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AsyncBannerStrategy$initStrategy$1$2(this.$this_apply, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C23381Fv lifecycle = this.$this_apply.getLifecycle();
            C23401Fx r3 = C23401Fx.STARTED;
            final C94434kc r2 = this.this$0;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A00(r3, lifecycle, this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AsyncBannerStrategy$initStrategy$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
