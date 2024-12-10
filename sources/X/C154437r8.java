package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.7r8  reason: invalid class name and case insensitive filesystem */
public final class C154437r8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131116kX this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C154437r8(C131116kX r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        View A05;
        View view = this.this$0.A00;
        ViewStub A0F = AnonymousClass3MW.A0F(view, 2131429731);
        if (A0F != null) {
            A05 = AnonymousClass3MY.A0G(A0F, 2131625035);
            A05.setVisibility(8);
        } else {
            A05 = C18070vi.A05(view, 2131429725);
        }
        A05.setPadding(0, 0, 8, 0);
        return A05;
    }
}
