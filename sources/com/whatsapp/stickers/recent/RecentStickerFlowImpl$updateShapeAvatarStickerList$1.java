package com.whatsapp.stickers.recent;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4I3;
import X.AnonymousClass6I0;
import X.AnonymousClass7JE;
import X.AnonymousClass8B0;
import X.C108475bl;
import X.C108985cd;
import X.C121166Hz;
import X.C131016kN;
import X.C1418377d;
import X.C17880vN;
import X.C18070vi;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.recent.RecentStickerFlowImpl$updateShapeAvatarStickerList$1", f = "RecentStickerFlowImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RecentStickerFlowImpl$updateShapeAvatarStickerList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108475bl $this_updateShapeAvatarStickerList;
    public int label;
    public final /* synthetic */ C131016kN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecentStickerFlowImpl$updateShapeAvatarStickerList$1(C131016kN r2, C30391dr r3, C108475bl r4) {
        super(2, r3);
        this.this$0 = r2;
        this.$this_updateShapeAvatarStickerList = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new RecentStickerFlowImpl$updateShapeAvatarStickerList$1(this.this$0, r5, this.$this_updateShapeAvatarStickerList);
    }

    public final Object invokeSuspend(Object obj) {
        C108475bl r1;
        Object r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            List<AnonymousClass8B0> A0v = C29431cG.A0v(this.this$0.A01.A0D(2), 8);
            ArrayList A0D = C29351c6.A0D(A0v);
            for (AnonymousClass8B0 r12 : A0v) {
                C18070vi.A0z(r12, "null cannot be cast to non-null type com.whatsapp.mediacomposer.doodle.shapepicker.StickerShapeCreator");
                A0D.add(((AnonymousClass7JE) r12).A00);
            }
            if (A0D.isEmpty()) {
                r1 = this.$this_updateShapeAvatarStickerList;
                r0 = AnonymousClass6I0.A00;
            } else {
                HashSet A12 = C17880vN.A12();
                ArrayList A13 = AnonymousClass000.A13();
                for (Object next : A0D) {
                    C108985cd.A1E(((C1418377d) next).A07, next, A12, A13);
                }
                r1 = this.$this_updateShapeAvatarStickerList;
                r0 = new C121166Hz(A13);
            }
            AnonymousClass4I3.A00(r0, r1);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RecentStickerFlowImpl$updateShapeAvatarStickerList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
