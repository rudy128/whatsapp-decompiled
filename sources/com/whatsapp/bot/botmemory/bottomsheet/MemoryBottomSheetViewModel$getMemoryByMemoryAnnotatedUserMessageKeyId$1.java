package com.whatsapp.bot.botmemory.bottomsheet;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.AnonymousClass7PS;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import X.C87024Tz;
import com.whatsapp.botinfra.message.memory.BotMemoryMetadataRepository;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.bottomsheet.MemoryBottomSheetViewModel$getMemoryByMemoryAnnotatedUserMessageKeyId$1", f = "MemoryBottomSheetViewModel.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class MemoryBottomSheetViewModel$getMemoryByMemoryAnnotatedUserMessageKeyId$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $memoryAnnotatedUserMessageKeyId;
    public int label;
    public final /* synthetic */ MemoryBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryBottomSheetViewModel$getMemoryByMemoryAnnotatedUserMessageKeyId$1(MemoryBottomSheetViewModel memoryBottomSheetViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = memoryBottomSheetViewModel;
        this.$memoryAnnotatedUserMessageKeyId = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MemoryBottomSheetViewModel$getMemoryByMemoryAnnotatedUserMessageKeyId$1(this.this$0, this.$memoryAnnotatedUserMessageKeyId, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            String str = this.$memoryAnnotatedUserMessageKeyId;
            this.label = 1;
            A00 = ((BotMemoryMetadataRepository) this.this$0.A00.get()).A00(str, this);
            if (A00 == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
            A00 = ((C30671eK) obj).value;
        } else {
            throw AnonymousClass000.A0l();
        }
        boolean z = A00 instanceof AnonymousClass1IU;
        if (!z) {
            if (z) {
                A00 = null;
            }
            List<AnonymousClass7PS> list = (List) A00;
            if (list != null) {
                AnonymousClass1G4 r6 = this.this$0.A01;
                ArrayList A0D = C29351c6.A0D(list);
                for (AnonymousClass7PS r0 : list) {
                    A0D.add(new C87024Tz((String) r0.first, (String) r0.second, AnonymousClass000.A1Y(r0.third)));
                }
                r6.setValue(new C30671eK(A0D));
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemoryBottomSheetViewModel$getMemoryByMemoryAnnotatedUserMessageKeyId$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
