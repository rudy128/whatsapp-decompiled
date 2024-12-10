package com.whatsapp.bot.botmemory;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.MemoryViewModel$deleteAllMemories$2", f = "MemoryViewModel.kt", i = {0}, l = {85, 90}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240"}, s = {"I$0"})
public final class MemoryViewModel$deleteAllMemories$2 extends C30431dv implements AnonymousClass1OS {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ MemoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryViewModel$deleteAllMemories$2(MemoryViewModel memoryViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = memoryViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemoryViewModel$deleteAllMemories$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemoryViewModel$deleteAllMemories$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r7 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r6 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0036
            if (r0 == r9) goto L_0x005b
            if (r0 != r6) goto L_0x00a4
            java.lang.Object r0 = X.C108955ca.A0n(r12)
        L_0x0011:
            boolean r0 = r0 instanceof X.AnonymousClass1IU
            r1 = r0 ^ 1
            com.whatsapp.bot.botmemory.MemoryViewModel r0 = r11.this$0
            X.1G4 r3 = r0.A03
            if (r1 == 0) goto L_0x002f
        L_0x001b:
            java.lang.Object r2 = r3.getValue()
            X.0wS r1 = X.C18460wS.A00
            X.5vi r0 = new X.5vi
            r0.<init>(r5, r1)
            boolean r0 = r3.BFK(r2, r0)
            if (r0 == 0) goto L_0x001b
        L_0x002c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002f:
            boolean r0 = X.C115785vk.A00(r3)
            if (r0 == 0) goto L_0x002f
            goto L_0x002c
        L_0x0036:
            X.C30691eM.A01(r12)
            com.whatsapp.bot.botmemory.MemoryViewModel r10 = r11.this$0
            java.lang.Integer r2 = r10.A00
            if (r2 == 0) goto L_0x008d
            int r8 = r2.intValue()
            X.00H r0 = r10.A02
            java.lang.Object r1 = r0.get()
            com.whatsapp.bot.botmemory.data.MemoryRepository r1 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r1
            r11.L$0 = r2
            r11.L$1 = r10
            r11.I$0 = r8
            r11.label = r9
            r0 = 0
            java.lang.Object r1 = r1.A02(r11, r0)
            if (r1 != r7) goto L_0x0065
            return r7
        L_0x005b:
            int r8 = r11.I$0
            java.lang.Object r10 = r11.L$1
            com.whatsapp.bot.botmemory.MemoryViewModel r10 = (com.whatsapp.bot.botmemory.MemoryViewModel) r10
            java.lang.Object r1 = X.C108955ca.A0n(r12)
        L_0x0065:
            boolean r0 = r1 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x006a
            r1 = r5
        L_0x006a:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x008d
            int r0 = r1.size()
            long r0 = (long) r0
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r0)
            r3 = 0
            long r1 = r2.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x008d
            X.00H r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.6zQ r0 = (X.C139776zQ) r0
            r0.A03(r8, r1, r9)
        L_0x008d:
            com.whatsapp.bot.botmemory.MemoryViewModel r0 = r11.this$0
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            com.whatsapp.bot.botmemory.data.MemoryRepository r0 = (com.whatsapp.bot.botmemory.data.MemoryRepository) r0
            r11.L$0 = r5
            r11.L$1 = r5
            r11.label = r6
            java.lang.Object r0 = r0.A01(r11)
            if (r0 != r7) goto L_0x0011
            return r7
        L_0x00a4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.bot.botmemory.MemoryViewModel$deleteAllMemories$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
