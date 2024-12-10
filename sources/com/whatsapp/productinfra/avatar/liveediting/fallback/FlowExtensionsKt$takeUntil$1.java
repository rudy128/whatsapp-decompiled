package com.whatsapp.productinfra.avatar.liveediting.fallback;

import X.AnonymousClass000;
import X.AnonymousClass00R;
import X.AnonymousClass1G2;
import X.AnonymousClass1OB;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import X.C83114Dw;
import X.C99614tB;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$takeUntil$1", f = "FlowExtensions.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class FlowExtensionsKt$takeUntil$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $notifier;
    public final /* synthetic */ C23421Fz $this_takeUntil;
    public /* synthetic */ Object L$0;
    public int label;

    @DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$takeUntil$1$1", f = "FlowExtensions.kt", i = {0}, l = {32}, m = "invokeSuspend", n = {"job"}, s = {"L$0"})
    /* renamed from: com.whatsapp.productinfra.avatar.liveediting.fallback.FlowExtensionsKt$takeUntil$1$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public /* synthetic */ Object L$0;
        public int label;

        public final C30391dr create(Object obj, C30391dr r6) {
            AnonymousClass1 r0 = new AnonymousClass1(r6, r3, r2, r4);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invokeSuspend(Object obj) {
            AnonymousClass1OB A02;
            C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                Integer num = AnonymousClass00R.A0N;
                FlowExtensionsKt$takeUntil$1$1$job$1 flowExtensionsKt$takeUntil$1$1$job$1 = new FlowExtensionsKt$takeUntil$1$1$job$1((C30391dr) null, r2);
                A02 = C30451dy.A02(num, AnonymousClass1OR.A00, flowExtensionsKt$takeUntil$1$1$job$1, (AnonymousClass1OX) this.L$0);
                C23421Fz r2 = r3;
                C99614tB A00 = C99614tB.A00(r4, 38);
                this.L$0 = A02;
                this.label = 1;
                if (r2.BFC(this, A00) == r6) {
                    return r6;
                }
            } else if (i == 1) {
                A02 = (AnonymousClass1OB) this.L$0;
                C30691eM.A01(obj);
            } else {
                throw AnonymousClass000.A0l();
            }
            A02.BEM((CancellationException) null);
            return C27621Wu.A00;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$takeUntil$1(C30391dr r2, C23421Fz r3, C23421Fz r4) {
        super(2, r2);
        this.$this_takeUntil = r3;
        this.$notifier = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        FlowExtensionsKt$takeUntil$1 flowExtensionsKt$takeUntil$1 = new FlowExtensionsKt$takeUntil$1(r5, this.$this_takeUntil, this.$notifier);
        flowExtensionsKt$takeUntil$1.L$0 = obj;
        return flowExtensionsKt$takeUntil$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final AnonymousClass1G2 r4 = (AnonymousClass1G2) this.L$0;
            final C23421Fz r3 = this.$this_takeUntil;
            final C23421Fz r2 = this.$notifier;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (AnonymousClass1OW.A00(this, r0) == r6) {
                return r6;
            }
        } else if (i == 1) {
            try {
                C30691eM.A01(obj);
            } catch (C83114Dw unused) {
            }
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FlowExtensionsKt$takeUntil$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
