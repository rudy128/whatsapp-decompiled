package com.whatsapp.bot.botmemory;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.C108955ca;
import X.C115765vi;
import X.C115785vk;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.bot.botmemory.data.MemoryRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.MemoryViewModel$getMemories$2", f = "MemoryViewModel.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
public final class MemoryViewModel$getMemories$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryViewModel$getMemories$2(MemoryViewModel memoryViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = memoryViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemoryViewModel$getMemories$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemoryViewModel$getMemories$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object A02;
        Object value;
        List list;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            A02 = ((MemoryRepository) this.this$0.A02.get()).A02(this, true);
            if (A02 == r2) {
                return r2;
            }
        } else if (i == 1) {
            A02 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        boolean z = A02 instanceof AnonymousClass1IU;
        boolean z2 = !z;
        MemoryViewModel memoryViewModel = this.this$0;
        if (z2) {
            AnonymousClass1G4 r4 = memoryViewModel.A03;
            do {
                value = r4.getValue();
                Object obj2 = A02;
                if (z) {
                    obj2 = null;
                }
                list = (List) obj2;
                if (list == null) {
                    list = C18460wS.A00;
                }
            } while (!r4.BFK(value, new C115765vi((Integer) null, list)));
        } else {
            do {
            } while (!C115785vk.A00(memoryViewModel.A03));
        }
        return C27621Wu.A00;
    }
}
