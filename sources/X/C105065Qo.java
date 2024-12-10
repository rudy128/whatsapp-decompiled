package X;

import com.whatsapp.calling.callrating.CallRatingBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5Qo  reason: invalid class name and case insensitive filesystem */
public final class C105065Qo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CallRatingBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105065Qo(CallRatingBottomSheet callRatingBottomSheet) {
        super(1);
        this.this$0 = callRatingBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        WDSButton wDSButton = this.this$0.A03;
        if (wDSButton != null) {
            wDSButton.setEnabled(AnonymousClass3MX.A1a(bool));
        }
        return C27621Wu.A00;
    }
}
