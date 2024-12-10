package X;

import com.whatsapp.WaTextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.82w  reason: invalid class name and case insensitive filesystem */
public final class C1590082w extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C120016Ba $adapter;
    public final /* synthetic */ WaTextView $titleTextView;
    public final /* synthetic */ C112305lG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1590082w(WaTextView waTextView, C120016Ba r3, C112305lG r4) {
        super(1);
        this.this$0 = r4;
        this.$titleTextView = waTextView;
        this.$adapter = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C134846rF r6 = (C134846rF) obj;
        C112305lG r3 = this.this$0;
        WaTextView waTextView = this.$titleTextView;
        C18070vi.A0b(waTextView);
        C112305lG.A01(waTextView, r3, r6.A00);
        C120016Ba r4 = this.$adapter;
        List<C135836sq> list = r6.A01;
        ArrayList A0D = C29351c6.A0D(list);
        for (C135836sq r1 : list) {
            A0D.add(new AnonymousClass6BW(r1));
        }
        ArrayList A0m = C29431cG.A0m(A0D);
        if (A0m.isEmpty()) {
            A0m.add(AnonymousClass6BY.A00);
        }
        A0m.add(AnonymousClass6BX.A00);
        r4.A00.A00((Runnable) null, A0m);
        return C27621Wu.A00;
    }
}
