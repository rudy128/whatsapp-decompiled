package X;

import com.whatsapp.WaTextView;

/* renamed from: X.82v  reason: invalid class name and case insensitive filesystem */
public final class C1589982v extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass6BZ $adapter;
    public final /* synthetic */ WaTextView $titleTextView;
    public final /* synthetic */ C112305lG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1589982v(WaTextView waTextView, AnonymousClass6BZ r3, C112305lG r4) {
        super(1);
        this.this$0 = r4;
        this.$titleTextView = waTextView;
        this.$adapter = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C134836rE r5 = (C134836rE) obj;
        C112305lG r3 = this.this$0;
        WaTextView waTextView = this.$titleTextView;
        C18070vi.A0b(waTextView);
        C112305lG.A01(waTextView, r3, r5.A00);
        AnonymousClass6BZ r0 = this.$adapter;
        r0.A00.A00((Runnable) null, r5.A01);
        return C27621Wu.A00;
    }
}
