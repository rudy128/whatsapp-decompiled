package X;

import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import java.util.List;

/* renamed from: X.82c  reason: invalid class name and case insensitive filesystem */
public final class C1588082c extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $stickers;
    public final /* synthetic */ StickerAddToPackBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1588082c(StickerAddToPackBottomSheet stickerAddToPackBottomSheet, List list) {
        super(1);
        this.this$0 = stickerAddToPackBottomSheet;
        this.$stickers = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        AnonymousClass00H r0 = this.this$0.A04;
        if (r0 != null) {
            AnonymousClass7RO.A02(AnonymousClass3MX.A0x(r0), this.this$0, this.$stickers, obj, 6);
            this.this$0.A28();
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }
}
