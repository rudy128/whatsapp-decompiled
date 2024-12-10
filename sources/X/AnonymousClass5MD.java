package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5MD  reason: invalid class name */
public final class AnonymousClass5MD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ C75943mB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5MD(C75943mB r2, AnonymousClass1M9 r3) {
        super(0);
        this.this$0 = r2;
        this.$contactManager = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A0B = this.this$0.A03.A0B();
        C75943mB r5 = this.this$0;
        AnonymousClass1M9 r4 = this.$contactManager;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0B.iterator();
        while (it.hasNext()) {
            AnonymousClass11S r0 = r5.A00;
            UserJid userJid = ((C178109Bv) it.next()).A00;
            if (!r0.A0O(userJid)) {
                AnonymousClass3MY.A1O(r4, userJid, A13);
            }
        }
        return A13;
    }
}
