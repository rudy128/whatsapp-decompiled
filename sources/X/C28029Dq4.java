package X;

import android.graphics.Rect;

/* renamed from: X.Dq4  reason: case insensitive filesystem */
public final class C28029Dq4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C17330uU $drawArea;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28029Dq4(C17330uU r2) {
        super(1);
        this.$drawArea = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C16910tQ r6 = (C16910tQ) obj;
        C18070vi.A0d(r6, 0);
        C17330uU r3 = this.$drawArea;
        long BZM = r6.BZM();
        r3.setValue(new Rect(0, 0, AnonymousClass000.A0G(BZM), AnonymousClass000.A0H(BZM)));
        return C27621Wu.A00;
    }
}
