package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.expression.stickers.StickerExpressionsFragment;
import com.whatsapp.stickers.info.bottomsheet.EditCustomStickerPackBottomSheet;

/* renamed from: X.7zC  reason: invalid class name */
public final class AnonymousClass7zC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StickerExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7zC(StickerExpressionsFragment stickerExpressionsFragment) {
        super(1);
        this.this$0 = stickerExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass614 r5 = (AnonymousClass614) obj;
        C18070vi.A0d(r5, 0);
        AnonymousClass1FU A0M = C108985cd.A0M(this.this$0);
        String A00 = AnonymousClass725.A00(r5.A00);
        Bundle A0D = C17880vN.A0D();
        A0D.putString("arg_sticker_pack_id", A00);
        EditCustomStickerPackBottomSheet editCustomStickerPackBottomSheet = new EditCustomStickerPackBottomSheet();
        editCustomStickerPackBottomSheet.A1R(A0D);
        A0M.CMl(editCustomStickerPackBottomSheet);
        return C27621Wu.A00;
    }
}
