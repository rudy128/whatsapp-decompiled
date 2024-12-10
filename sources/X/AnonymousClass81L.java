package X;

import com.whatsapp.stickers.info.bottomsheet.EditCustomStickerPackBottomSheet;
import java.util.Set;

/* renamed from: X.81L  reason: invalid class name */
public final class AnonymousClass81L extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EditCustomStickerPackBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81L(EditCustomStickerPackBottomSheet editCustomStickerPackBottomSheet) {
        super(1);
        this.this$0 = editCustomStickerPackBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        EditCustomStickerPackBottomSheet editCustomStickerPackBottomSheet = this.this$0;
        Set set = editCustomStickerPackBottomSheet.A0C;
        if (set.contains(obj)) {
            set.remove(obj);
        } else {
            set.add(obj);
        }
        EditCustomStickerPackBottomSheet.A00(editCustomStickerPackBottomSheet, set.size());
        return C27621Wu.A00;
    }
}
