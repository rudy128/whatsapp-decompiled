package X;

import com.whatsapp.stickers.info.bottomsheet.StickerAddToPackBottomSheet;
import java.util.List;

/* renamed from: X.7Mc  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C145657Mc implements C107665aO {
    public final /* synthetic */ StickerAddToPackBottomSheet A00;
    public final /* synthetic */ List A01;

    public final void Boq(String str) {
        StickerAddToPackBottomSheet stickerAddToPackBottomSheet = this.A00;
        List list = this.A01;
        C18070vi.A0n(stickerAddToPackBottomSheet, list, str);
        AnonymousClass00H r0 = stickerAddToPackBottomSheet.A04;
        if (r0 != null) {
            AnonymousClass3MX.A0x(r0).CGF(new C146887Qz(stickerAddToPackBottomSheet, list, str, 22));
            stickerAddToPackBottomSheet.A28();
            return;
        }
        AnonymousClass3MW.A1G();
        throw null;
    }

    public /* synthetic */ C145657Mc(StickerAddToPackBottomSheet stickerAddToPackBottomSheet, List list) {
        this.A00 = stickerAddToPackBottomSheet;
        this.A01 = list;
    }
}
