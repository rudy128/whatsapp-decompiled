package X;

import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel;
import com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$onToggleFavoriteSticker$1;

/* renamed from: X.7gm  reason: invalid class name and case insensitive filesystem */
public class C148027gm extends AnonymousClass1JJ implements AnonymousClass1OS {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C148027gm(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0013;
                case 2: goto L_0x0013;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet> r3 = com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet.class
            java.lang.String r5 = "onToggleFavoriteSticker(Lcom/whatsapp/funstickers/data/model/FunStickerModel;Lcom/whatsapp/stickers/Sticker;)V"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "onToggleFavoriteSticker"
        L_0x000e:
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0013:
            java.lang.Class<com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2> r3 = com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModelV2.class
            java.lang.String r5 = "getButtonOnClickForParticipantBanner(Ljava/util/List;Lcom/whatsapp/calling/incallnotifbanner/data/InCallBannerType;)Landroid/view/View$OnClickListener;"
            r6 = 0
            r1 = 2
            java.lang.String r4 = "getButtonOnClickForParticipantBanner"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148027gm.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        if (3 - this.A00 != 0) {
            C18070vi.A0h(obj, obj2);
            return new C90084dV(this.receiver, obj, obj2, 35);
        }
        AnonymousClass77V r5 = (AnonymousClass77V) obj;
        C1418377d r6 = (C1418377d) obj2;
        C18070vi.A0h(r5, r6);
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = (SearchFunStickersBottomSheet) this.receiver;
        WaEditText waEditText = searchFunStickersBottomSheet.A0A;
        if (waEditText != null) {
            waEditText.A0H();
        }
        if (r5.A06 != null) {
            SearchFunStickersViewModel A0Q = C108955ca.A0Q(searchFunStickersBottomSheet);
            AnonymousClass3MX.A1Q(new SearchFunStickersViewModel$onToggleFavoriteSticker$1(A0Q, r6, (C30391dr) null), C41561wd.A00(A0Q));
        }
        return C27621Wu.A00;
    }
}
