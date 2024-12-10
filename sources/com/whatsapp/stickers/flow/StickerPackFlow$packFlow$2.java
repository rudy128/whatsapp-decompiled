package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6HC;
import X.C108945cZ;
import X.C108985cd;
import X.C123216To;
import X.C133436ok;
import X.C136936ue;
import X.C17880vN;
import X.C17890vO;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C41681wt;
import X.C98474rD;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$2", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$2 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$2(StickerPackFlow stickerPackFlow, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        StickerPackFlow$packFlow$2 stickerPackFlow$packFlow$2 = new StickerPackFlow$packFlow$2(this.this$0, r4);
        stickerPackFlow$packFlow$2.L$0 = obj;
        return stickerPackFlow$packFlow$2;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C123216To r3 = (C123216To) this.L$0;
            if (C18020vd.A05(C18040vf.A02, this.this$0.A01, 6970) && (r3 instanceof AnonymousClass6HC)) {
                List<C133436ok> list = ((AnonymousClass6HC) r3).A00;
                LinkedHashMap A13 = C17880vN.A13();
                for (C133436ok A01 : list) {
                    String A012 = A01.A01();
                    Object obj2 = A13.get(A012);
                    if (obj2 == null && !A13.containsKey(A012)) {
                        obj2 = new Object();
                    }
                    C98474rD r1 = (C98474rD) obj2;
                    r1.element++;
                    A13.put(A012, r1);
                }
                Iterator A15 = AnonymousClass000.A15(A13);
                while (A15.hasNext()) {
                    Map.Entry A16 = AnonymousClass000.A16(A15);
                    C18070vi.A0z(A16, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
                    C41681wt.A02(A16).setValue(Integer.valueOf(((C98474rD) A16.getValue()).element));
                }
                Map A03 = C41681wt.A03(A13);
                LinkedHashMap A132 = C17880vN.A13();
                Iterator A152 = AnonymousClass000.A15(A03);
                while (A152.hasNext()) {
                    Map.Entry A162 = AnonymousClass000.A16(A152);
                    if (AnonymousClass000.A0M(A162.getValue()) > 1) {
                        C108985cd.A1T(A162, A132);
                    }
                }
                if (!A132.isEmpty()) {
                    StickerPackFlow stickerPackFlow = this.this$0;
                    Iterator A153 = AnonymousClass000.A15(A132);
                    while (A153.hasNext()) {
                        Map.Entry A163 = AnonymousClass000.A16(A153);
                        String A0x = C17880vN.A0x(A163);
                        int A0M = AnonymousClass000.A0M(A163.getValue());
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Duplicate sticker pack ID detected: ");
                        A10.append(A0x);
                        A10.append(" (");
                        A10.append(A0M);
                        C17890vO.A19(A10, " x)");
                        C136936ue A0p = C108945cZ.A0p(stickerPackFlow.A02);
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append("Duplicates: pack id = ");
                        A102.append(A0x);
                        A102.append(" ; size = ");
                        A0p.A02(2, "duplicate_sticker_pack", C17880vN.A0t(A102, A132.size()));
                    }
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
