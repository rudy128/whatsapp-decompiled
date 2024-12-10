package X;

import android.os.Bundle;
import com.whatsapp.expressionstray.expression.stickers.SearchFunStickersBottomSheet;

/* renamed from: X.7wI  reason: invalid class name */
public final class AnonymousClass7wI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1GP $fragmentManager;
    public final /* synthetic */ AnonymousClass778 $funStickerData;
    public final /* synthetic */ int $stickerOrigin;
    public final /* synthetic */ C131946lv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wI(AnonymousClass1GP r2, C131946lv r3, AnonymousClass778 r4, int i) {
        super(0);
        this.this$0 = r3;
        this.$stickerOrigin = i;
        this.$funStickerData = r4;
        this.$fragmentManager = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        int i = this.$stickerOrigin;
        AnonymousClass778 r4 = this.$funStickerData;
        AnonymousClass1GP r3 = this.$fragmentManager;
        SearchFunStickersBottomSheet searchFunStickersBottomSheet = new SearchFunStickersBottomSheet();
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("stickerOrigin", i);
        if (r4 != null) {
            A0D.putParcelable("funStickerData", r4);
        }
        searchFunStickersBottomSheet.A1R(A0D);
        C20098A7b.A03(searchFunStickersBottomSheet, r3, "search_fun_stickers_bottom_sheet");
        return C27621Wu.A00;
    }
}
