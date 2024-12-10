package X;

import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;
import com.whatsapp.media.share.ShareMediaViewModel;

/* renamed from: X.7z8  reason: invalid class name */
public final class AnonymousClass7z8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SearchFunStickersBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7z8(SearchFunStickersBottomSheet searchFunStickersBottomSheet) {
        super(1);
        this.this$0 = searchFunStickersBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C1597485s r1;
        C135746sh r10 = (C135746sh) obj;
        ShareMediaViewModel shareMediaViewModel = (ShareMediaViewModel) this.this$0.A0X.getValue();
        AnonymousClass1BI r3 = r10.A02;
        C1418377d r5 = r10.A03;
        AnonymousClass1E7 r2 = r10.A01;
        Integer num = this.this$0.A0R;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 10;
        }
        shareMediaViewModel.A0T(r2, r3, (AnonymousClass206) null, r5, Integer.valueOf(i), r10.A00, false);
        this.this$0.A28();
        AnonymousClass1FL A1B = this.this$0.A1B();
        if ((A1B instanceof C1597485s) && (r1 = (C1597485s) A1B) != null) {
            AnonymousClass3MW.A1U(r1);
        }
        return C27621Wu.A00;
    }
}
