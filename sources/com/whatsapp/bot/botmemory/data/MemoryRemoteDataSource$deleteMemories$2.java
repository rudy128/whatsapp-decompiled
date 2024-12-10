package com.whatsapp.bot.botmemory.data;

import X.AnonymousClass000;
import X.AnonymousClass1IU;
import X.AnonymousClass1OS;
import X.C108795cJ;
import X.C17900vP;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import X.C31781g7;
import X.C72473Md;
import X.C820141r;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.botmemory.data.MemoryRemoteDataSource$deleteMemories$2", f = "MemoryRemoteDataSource.kt", i = {}, l = {143}, m = "invokeSuspend", n = {}, s = {})
public final class MemoryRemoteDataSource$deleteMemories$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108795cJ $request;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ MemoryRemoteDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemoryRemoteDataSource$deleteMemories$2(C108795cJ r2, MemoryRemoteDataSource memoryRemoteDataSource, C30391dr r4) {
        super(2, r4);
        this.this$0 = memoryRemoteDataSource;
        this.$request = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MemoryRemoteDataSource$deleteMemories$2(this.$request, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                MemoryRemoteDataSource memoryRemoteDataSource = this.this$0;
                C108795cJ r1 = this.$request;
                this.L$0 = memoryRemoteDataSource;
                this.L$1 = r1;
                this.label = 1;
                C31781g7 A0m = C72473Md.A0m(this);
                C72473Md.A0W(r1, memoryRemoteDataSource.A00).A03(new C820141r(A0m, 1));
                obj = A0m.A0C();
                if (obj == r4) {
                    return r4;
                }
            } catch (Exception e) {
                C17900vP.A0X(e, "MemoryRemoteDataSource/deleteMemories/Exception: ", AnonymousClass000.A10());
                obj2 = new AnonymousClass1IU(e);
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        obj2 = ((C30671eK) obj).value;
        return new C30671eK(obj2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemoryRemoteDataSource$deleteMemories$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
