package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass60B;
import X.AnonymousClass60C;
import X.AnonymousClass6TE;
import X.C1176460k;
import X.C17880vN;
import X.C19830z4;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$onClickCloseStickerMakerUpsell$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        List subList;
        AnonymousClass1G4 r3;
        List list;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C17880vN.A1F(C19830z4.A00(this.this$0.A0A), "sticker_maker_upsell_dismissed", true);
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            AnonymousClass6TE r5 = (AnonymousClass6TE) stickerExpressionsViewModel.A0l.getValue();
            int i = 0;
            if (r5 instanceof AnonymousClass60C) {
                AnonymousClass60C r52 = (AnonymousClass60C) r5;
                List list2 = r52.A01;
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!(it.next() instanceof C1176460k)) {
                        i++;
                    } else if (i != -1) {
                        subList = list2.subList(i + 1, list2.size());
                        r3 = stickerExpressionsViewModel.A0l;
                        list = r52.A02;
                    }
                }
                return C27621Wu.A00;
            }
            if (r5 instanceof AnonymousClass60B) {
                AnonymousClass60B r53 = (AnonymousClass60B) r5;
                List list3 = r53.A01;
                Iterator it2 = list3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    } else if (!(it2.next() instanceof C1176460k)) {
                        i++;
                    } else if (i != -1) {
                        subList = list3.subList(i + 1, list3.size());
                        r3 = stickerExpressionsViewModel.A0l;
                        list = r53.A02;
                    }
                }
            }
            return C27621Wu.A00;
            r3.setValue(new AnonymousClass60C((String) null, list, subList));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
