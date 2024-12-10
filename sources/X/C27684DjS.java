package X;

import android.graphics.Rect;

/* renamed from: X.DjS  reason: case insensitive filesystem */
public final class C27684DjS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26993DOp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27684DjS(C26993DOp dOp) {
        super(0);
        this.this$0 = dOp;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Rect A07 = AnonymousClass3MW.A07();
        C26993DOp dOp = this.this$0;
        A07.left = (int) C26993DOp.A0B(dOp).A0A;
        C18100vl r1 = dOp.A0h;
        A07.right = (int) BE6.A0f(r1).A0C;
        A07.top = (int) BE6.A0f(r1).A0D;
        A07.bottom = (int) BE6.A0f(r1).A09;
        return A07;
    }
}
