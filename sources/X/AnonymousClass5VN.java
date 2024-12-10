package X;

import android.content.Context;

/* renamed from: X.5VN  reason: invalid class name */
public final class AnonymousClass5VN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ AnonymousClass1BI $senderJid;
    public final /* synthetic */ C73373Vg this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VN(C73373Vg r2, AnonymousClass1BI r3, AnonymousClass1BI r4) {
        super(1);
        this.this$0 = r2;
        this.$senderJid = r3;
        this.$chatJid = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        C18070vi.A0d(context, 0);
        AnonymousClass1E7 A0H = this.this$0.A0K.A0H(this.$senderJid);
        C73373Vg r0 = this.this$0;
        String A01 = C63422t3.A01(context, r0.A0B, r0.A0L, A0H, r0.A0K.A0H(this.$chatJid));
        C18070vi.A0X(A01);
        return A01;
    }
}
