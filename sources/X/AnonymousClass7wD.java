package X;

import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import java.util.List;

/* renamed from: X.7wD  reason: invalid class name */
public final class AnonymousClass7wD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FL $it;
    public final /* synthetic */ List $stickers;
    public final /* synthetic */ StickerAddToPackBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wD(AnonymousClass1FL r2, StickerAddToPackBottomSheet stickerAddToPackBottomSheet, List list) {
        super(0);
        this.this$0 = stickerAddToPackBottomSheet;
        this.$it = r2;
        this.$stickers = list;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A06.get();
        AnonymousClass1FL r3 = this.$it;
        C18070vi.A0b(r3);
        C145657Mc r2 = new C145657Mc(this.this$0, this.$stickers);
        C18070vi.A0d(r3, 0);
        C20098A7b.A01(C83634Gb.A00(r2, (String) null), r3.getSupportFragmentManager());
        return C27621Wu.A00;
    }
}
