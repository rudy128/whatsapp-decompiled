package X;

import android.content.res.Resources;
import com.whatsapp.calling.header.ui.CallScreenHeaderView;

/* renamed from: X.5MT  reason: invalid class name */
public final class AnonymousClass5MT extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ boolean $isIncomingCallState;
    public final /* synthetic */ CallScreenHeaderView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MT(CallScreenHeaderView callScreenHeaderView, boolean z) {
        super(0);
        this.this$0 = callScreenHeaderView;
        this.$isIncomingCallState = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Resources resources = this.this$0.getResources();
        int i = 2131169436;
        if (this.$isIncomingCallState) {
            i = 2131167015;
        }
        return AnonymousClass3MY.A0i(resources, i);
    }
}
