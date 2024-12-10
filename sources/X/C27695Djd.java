package X;

import android.graphics.Rect;

/* renamed from: X.Djd  reason: case insensitive filesystem */
public final class C27695Djd extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C26993DOp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27695Djd(C26993DOp dOp) {
        super(0);
        this.this$0 = dOp;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        float f;
        Rect A07 = AnonymousClass3MW.A07();
        C26993DOp dOp = this.this$0;
        C25621Cj1 A0e = BE6.A0e(dOp.A0o);
        if (A0e instanceof C23807Bpz) {
            f = ((C23807Bpz) A0e).A0A;
        } else {
            f = A0e.A07;
        }
        A07.left = (int) f;
        C25621Cj1.A00(A07, dOp.A0o);
        return A07;
    }
}
