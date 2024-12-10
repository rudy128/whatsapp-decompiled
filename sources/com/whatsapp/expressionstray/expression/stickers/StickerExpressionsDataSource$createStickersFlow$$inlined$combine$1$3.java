package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass3MW;
import X.AnonymousClass605;
import X.AnonymousClass606;
import X.AnonymousClass6HC;
import X.AnonymousClass6HD;
import X.AnonymousClass6I0;
import X.AnonymousClass6I1;
import X.AnonymousClass6I2;
import X.AnonymousClass6I3;
import X.AnonymousClass6I4;
import X.AnonymousClass6TI;
import X.AnonymousClass6TJ;
import X.AnonymousClass6TK;
import X.C1175760b;
import X.C121166Hz;
import X.C123216To;
import X.C123276Tu;
import X.C123286Tv;
import X.C138646xS;
import X.C18070vi;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3", f = "StickerExpressionsDataSource.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ C138646xS this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3(C138646xS r2, C30391dr r3) {
        super(3, r3);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        StickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3 stickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3 = new StickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3(this.this$0, (C30391dr) obj3);
        stickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3.L$0 = obj;
        stickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3.L$1 = obj2;
        return stickerExpressionsDataSource$createStickersFlow$$inlined$combine$1$3.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        List list3;
        Object r11;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r2 = (AnonymousClass1G2) this.L$0;
            Object[] objArr = (Object[]) this.L$1;
            Object obj2 = objArr[0];
            C18070vi.A0z(obj2, "null cannot be cast to non-null type com.whatsapp.stickers.flow.StickerPackData");
            C123216To r6 = (C123216To) obj2;
            Object obj3 = objArr[1];
            C18070vi.A0z(obj3, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickersData");
            AnonymousClass6TI r12 = (AnonymousClass6TI) obj3;
            Object obj4 = objArr[2];
            C18070vi.A0z(obj4, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.stickers.mediacomposer.ShapeStickersData");
            AnonymousClass6TJ r13 = (AnonymousClass6TJ) obj4;
            Object obj5 = objArr[3];
            C18070vi.A0z(obj5, "null cannot be cast to non-null type com.whatsapp.stickers.recent.RecentStickerList");
            C123276Tu r9 = (C123276Tu) obj5;
            Object obj6 = objArr[4];
            C18070vi.A0z(obj6, "null cannot be cast to non-null type com.whatsapp.stickers.starred.StarredStickersList");
            C123286Tv r8 = (C123286Tv) obj6;
            Object obj7 = objArr[5];
            C18070vi.A0z(obj7, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.stickers.received.ReceivedStickersResult");
            AnonymousClass6TK r7 = (AnonymousClass6TK) obj7;
            Object obj8 = objArr[6];
            C18070vi.A0z(obj8, "null cannot be cast to non-null type com.whatsapp.expressionstray.expression.stickers.mediacomposer.ShapeStickersData");
            AnonymousClass6TJ r14 = (AnonymousClass6TJ) obj8;
            C18070vi.A0d(r6, 1);
            C18070vi.A0p(r12, r13, r9);
            C18070vi.A0d(r8, 5);
            C18070vi.A0d(r7, 6);
            C18070vi.A0d(r14, 7);
            if (!(r6 instanceof AnonymousClass6HD) || !(r8 instanceof AnonymousClass6I4) || !(r9 instanceof AnonymousClass6I1)) {
                List list4 = null;
                if (r9 instanceof C121166Hz) {
                    list = ((C121166Hz) r9).A00;
                } else if (r9 instanceof AnonymousClass6I0) {
                    list = C18460wS.A00;
                } else if (r9 instanceof AnonymousClass6I1) {
                    list = null;
                } else {
                    throw AnonymousClass3MW.A14();
                }
                if (r8 instanceof AnonymousClass6I2) {
                    list4 = ((AnonymousClass6I2) r8).A00;
                } else if (r8 instanceof AnonymousClass6I3) {
                    list4 = C18460wS.A00;
                } else if (!(r8 instanceof AnonymousClass6I4)) {
                    throw AnonymousClass3MW.A14();
                }
                if (r6 instanceof AnonymousClass6HC) {
                    list2 = ((AnonymousClass6HC) r6).A00;
                } else {
                    list2 = C18460wS.A00;
                }
                if (r7 instanceof C1175760b) {
                    list3 = ((C1175760b) r7).A00;
                } else {
                    list3 = C18460wS.A00;
                }
                r11 = new AnonymousClass605(r12, r13, r14, list, list4, list2, list3);
            } else {
                r11 = AnonymousClass606.A00;
            }
            this.label = 1;
            if (r2.BJt(r11, this) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
