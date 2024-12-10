package X;

import android.content.Context;

/* renamed from: X.5PK  reason: invalid class name */
public final class AnonymousClass5PK extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ AnonymousClass3QQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PK(Context context, AnonymousClass3QQ r3, AnonymousClass1EC r4) {
        super(0);
        this.this$0 = r3;
        this.$context = context;
        this.$groupJid = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass5XS r0 = this.this$0.A02;
        Context context = this.$context;
        AnonymousClass1EC r4 = this.$groupJid;
        C94774lA r02 = (C94774lA) r0;
        int i = r02.A00;
        Object obj = r02.A01;
        if (i != 0) {
            AnonymousClass10E r03 = ((AnonymousClass10H) obj).A00;
            AnonymousClass10G r2 = r03.A00;
            AnonymousClass485 r3 = new AnonymousClass485(context, AnonymousClass10E.A6O(r03), AnonymousClass3MY.A0Z(r03), r4);
            r2.AXF(r3);
            return r3;
        }
        AnonymousClass1K2 r04 = (AnonymousClass1K2) obj;
        AnonymousClass1K1 r22 = r04.A00;
        AnonymousClass10E r05 = r04.A01;
        AnonymousClass485 r32 = new AnonymousClass485(context, AnonymousClass10E.A6O(r05), AnonymousClass3MY.A0Z(r05), r4);
        r22.A8v(r32);
        return r32;
    }
}
