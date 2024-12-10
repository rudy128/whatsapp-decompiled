package com.whatsapp.bot.botmemory;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.C108965cb;
import X.C147277Sn;
import X.C147317Sr;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C87334Ve;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.MemoryActivity$onCreate$6", f = "MemoryActivity.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
public final class MemoryActivity$onCreate$6 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemoryActivity this$0;

    @DebugMetadata(c = "com.whatsapp.bot.botmemory.MemoryActivity$onCreate$6$1", f = "MemoryActivity.kt", i = {}, l = {118}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.whatsapp.bot.botmemory.MemoryActivity$onCreate$6$1  reason: invalid class name */
    public final class AnonymousClass1 extends C30431dv implements AnonymousClass1OS {
        public int label;

        public final C30391dr create(Object obj, C30391dr r4) {
            return new AnonymousClass1(r4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return new AnonymousClass1((C30391dr) obj2).invokeSuspend(C27621Wu.A00);
        }

        public final Object invokeSuspend(Object obj) {
            C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C30691eM.A01(obj);
                AnonymousClass1G1 r3 = C108965cb.A0J(MemoryActivity.this).A04;
                C147277Sn r0 = new C147277Sn(MemoryActivity.this, 2);
                this.label = 1;
                if (r3.BFC(this, r0) == r5) {
                    return r5;
                }
            } else if (i != 1) {
                throw AnonymousClass000.A0l();
            } else {
                C30691eM.A01(obj);
            }
            throw new C147317Sr();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryActivity$onCreate$6(MemoryActivity memoryActivity, C30391dr r3) {
        super(2, r3);
        this.this$0 = memoryActivity;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemoryActivity$onCreate$6(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemoryActivity$onCreate$6(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            final MemoryActivity memoryActivity = this.this$0;
            C23401Fx r2 = C23401Fx.STARTED;
            AnonymousClass1 r0 = new AnonymousClass1((C30391dr) null);
            this.label = 1;
            if (C87334Ve.A01(r2, memoryActivity, this, r0) == r5) {
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
