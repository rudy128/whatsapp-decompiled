package X;

import com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment;

/* renamed from: X.7rq  reason: invalid class name and case insensitive filesystem */
public final class C154877rq extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BkBottomSheetContentFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154877rq(BkBottomSheetContentFragment bkBottomSheetContentFragment) {
        super(0);
        this.this$0 = bkBottomSheetContentFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        BkBottomSheetContentFragment bkBottomSheetContentFragment = this.this$0;
        String string = bkBottomSheetContentFragment.A15().getString("bk_bottom_sheet_content_fragment", "");
        AnonymousClass00H r0 = bkBottomSheetContentFragment.A02;
        if (r0 != null) {
            C18070vi.A0b(string);
            return ((C20000A2o) r0.get()).A01(C178149Bz.A00(string), "bk_bottom_sheet_content_fragment", 0);
        }
        C18070vi.A11("bkCache");
        throw null;
    }
}
