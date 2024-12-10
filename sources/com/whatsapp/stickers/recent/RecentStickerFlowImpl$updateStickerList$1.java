package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4I3;
import X.AnonymousClass6I0;
import X.AnonymousClass887;
import X.C108475bl;
import X.C108945cZ;
import X.C1193467t;
import X.C121166Hz;
import X.C124136Xe;
import X.C131016kN;
import X.C17880vN;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateStickerList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108475bl $this_updateStickerList;
    public int label;
    public final /* synthetic */ C131016kN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateStickerList$1(C131016kN r2, C30391dr r3, C108475bl r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$this_updateStickerList = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RecentStickerFlowImpl$updateStickerList$1(this.this$0, r5, this.$this_updateStickerList);
    }

    public final Object invokeSuspend(Object obj) {
        Object r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            ArrayList A0G = C108945cZ.A0w(this.this$0.A03).A0G();
            ArrayList A00 = C124136Xe.A00(A0G);
            if (C17880vN.A1X(A00)) {
                C1193467t A0w = C108945cZ.A0w(this.this$0.A03);
                Iterator it = A00.iterator();
                while (it.hasNext()) {
                    A0w.A0K((AnonymousClass887) null, C108945cZ.A0x(it));
                }
            }
            List A0w2 = C29431cG.A0w(A0G, C29431cG.A12(A00));
            boolean isEmpty = A0w2.isEmpty();
            C108475bl r1 = this.$this_updateStickerList;
            if (isEmpty) {
                r0 = AnonymousClass6I0.A00;
            } else {
                r0 = new C121166Hz(A0w2);
            }
            AnonymousClass4I3.A00(r0, r1);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$updateStickerList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
