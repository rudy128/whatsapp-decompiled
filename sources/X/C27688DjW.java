package X;

import android.graphics.Rect;

/* renamed from: X.DjW  reason: case insensitive filesystem */
public final class C27688DjW extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26993DOp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27688DjW(C26993DOp dOp) {
        super(0);
        this.this$0 = dOp;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Rect A07 = AnonymousClass3MW.A07();
        C26993DOp dOp = this.this$0;
        A07.left = (int) C26993DOp.A0B(dOp).A0B;
        C18100vl r2 = dOp.A0h;
        A07.right = (int) (BE6.A0f(r2).A05 + BE6.A0f(r2).A0C);
        A07.top = (int) BE6.A0f(r2).A0D;
        A07.bottom = (int) BE6.A0f(r2).A09;
        return A07;
    }
}
