package com.whatsapp.stickers.starred;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass4I3;
import X.AnonymousClass6I2;
import X.AnonymousClass6I3;
import X.AnonymousClass70H;
import X.C108475bl;
import X.C108945cZ;
import X.C108985cd;
import X.C124136Xe;
import X.C124166Xh;
import X.C136656uA;
import X.C138666xU;
import X.C140046zr;
import X.C1418377d;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.starred.StarredStickersFlow$updateStickerList$1", f = "StarredStickersFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StarredStickersFlow$updateStickerList$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108475bl $this_updateStickerList;
    public final /* synthetic */ int $type;
    public int label;
    public final /* synthetic */ C138666xU this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarredStickersFlow$updateStickerList$1(C138666xU r2, C30391dr r3, C108475bl r4, int i) {
        super(2, r3);
        this.this$0 = r2;
        this.$type = i;
        this.$this_updateStickerList = r4;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new StarredStickersFlow$updateStickerList$1(this.this$0, r6, this.$this_updateStickerList, this.$type);
    }

    public final Object invokeSuspend(Object obj) {
        C108475bl r1;
        Object r0;
        C1418377d A00;
        String str;
        if (this.label == 0) {
            C30691eM.A01(obj);
            int i = this.$type;
            C17960vV.A00();
            ArrayList A01 = ((C140046zr) this.this$0.A02.get()).A05.A01(Integer.MAX_VALUE, i);
            int i2 = this.$type;
            C138666xU r4 = this.this$0;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = A01.iterator();
            while (it.hasNext()) {
                C136656uA r2 = (C136656uA) it.next();
                if ((i2 == 1 || !((str = r2.A00) == null || str.length() == 0)) && (A00 = C124166Xh.A00(r4.A01, (AnonymousClass70H) C18070vi.A0E(r4.A03), r2)) != null) {
                    A13.add(A00);
                }
            }
            ArrayList A002 = C124136Xe.A00(A13);
            C138666xU r3 = this.this$0;
            Iterator it2 = A002.iterator();
            while (it2.hasNext()) {
                String str2 = C108945cZ.A0x(it2).A0F;
                if (str2 != null) {
                    ((C140046zr) r3.A02.get()).A02(str2);
                }
            }
            List A0w = C29431cG.A0w(A13, C29431cG.A12(A002));
            if (A0w.isEmpty()) {
                r1 = this.$this_updateStickerList;
                r0 = AnonymousClass6I3.A00;
            } else {
                int i3 = this.$type;
                HashSet A12 = C17880vN.A12();
                ArrayList A132 = AnonymousClass000.A13();
                Iterator it3 = A0w.iterator();
                if (i3 == 2) {
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        C108985cd.A1E(((C1418377d) next).A07, next, A12, A132);
                    }
                } else {
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        C108985cd.A1E(((C1418377d) next2).A0F, next2, A12, A132);
                    }
                }
                r1 = this.$this_updateStickerList;
                r0 = new AnonymousClass6I2(A132);
            }
            AnonymousClass4I3.A00(r0, r1);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StarredStickersFlow$updateStickerList$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
