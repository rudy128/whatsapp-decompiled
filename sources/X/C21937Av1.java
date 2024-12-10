package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Av1  reason: case insensitive filesystem */
public final class C21937Av1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C21323Ai8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21937Av1(C21323Ai8 ai8) {
        super(0);
        this.this$0 = ai8;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List<AnonymousClass1EC> list = this.this$0.A02;
        ArrayList A0D = C29351c6.A0D(list);
        for (AnonymousClass1EC r2 : list) {
            A0D.add(new C178709Ed(r2, 9));
        }
        C21323Ai8 ai8 = this.this$0;
        return new AnonymousClass9F5(ai8.A01, ai8.A00, A0D, 4);
    }
}
