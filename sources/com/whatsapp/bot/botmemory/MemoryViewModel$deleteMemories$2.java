package com.whatsapp.bot.botmemory;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C108955ca;
import X.C115765vi;
import X.C115785vk;
import X.C139776zQ;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.bot.botmemory.data.MemoryRepository;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.MemoryViewModel$deleteMemories$2", f = "MemoryViewModel.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class MemoryViewModel$deleteMemories$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $memoryIds;
    public int label;
    public final /* synthetic */ MemoryViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryViewModel$deleteMemories$2(MemoryViewModel memoryViewModel, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = memoryViewModel;
        this.$memoryIds = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MemoryViewModel$deleteMemories$2(this.this$0, this.$memoryIds, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        Object value;
        List list;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MemoryViewModel memoryViewModel = this.this$0;
            Integer num = memoryViewModel.A00;
            if (num != null) {
                ((C139776zQ) memoryViewModel.A01.get()).A03(num.intValue(), (long) this.$memoryIds.size(), false);
            }
            List list2 = this.$memoryIds;
            this.label = 1;
            A00 = ((MemoryRepository) this.this$0.A02.get()).A00(list2, this);
            if (A00 == r6) {
                return r6;
            }
        } else if (i == 1) {
            A00 = C108955ca.A0n(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        boolean z = A00 instanceof AnonymousClass1IU;
        boolean z2 = !z;
        MemoryViewModel memoryViewModel2 = this.this$0;
        if (z2) {
            AnonymousClass1G4 r4 = memoryViewModel2.A03;
            do {
                value = r4.getValue();
                Object obj2 = A00;
                if (z) {
                    obj2 = null;
                }
                list = (List) obj2;
                if (list == null) {
                    list = C18460wS.A00;
                }
            } while (!r4.BFK(value, new C115765vi(AnonymousClass3MW.A0v(2131891978), list)));
        } else {
            do {
            } while (!C115785vk.A00(memoryViewModel2.A03));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemoryViewModel$deleteMemories$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
