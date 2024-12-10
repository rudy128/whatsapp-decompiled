package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.7r2  reason: invalid class name and case insensitive filesystem */
public final class C154377r2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131116kX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154377r2(C131116kX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View view = this.this$0.A00;
        ViewStub A0F = AnonymousClass3MW.A0F(view, 2131429732);
        if (A0F == null) {
            return C18070vi.A05(view, 2131436551);
        }
        View A0G = AnonymousClass3MY.A0G(A0F, 2131627263);
        A0G.setVisibility(8);
        return A0G;
    }
}
