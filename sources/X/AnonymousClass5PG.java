package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5PG  reason: invalid class name */
public final class AnonymousClass5PG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ C24921Me $contactNames;
    public final /* synthetic */ C75963mD this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PG(C75963mD r2, AnonymousClass1M9 r3, C24921Me r4) {
        super(0);
        this.this$0 = r2;
        this.$contactManager = r3;
        this.$contactNames = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A0B = this.this$0.A01.A0B();
        C75963mD r5 = this.this$0;
        AnonymousClass1M9 r3 = this.$contactManager;
        ArrayList A13 = AnonymousClass000.A13();
        Iterator it = A0B.iterator();
        while (it.hasNext()) {
            AnonymousClass11S r0 = r5.A00;
            UserJid userJid = ((C178109Bv) it.next()).A00;
            if (!r0.A0O(userJid)) {
                AnonymousClass3MY.A1O(r3, userJid, A13);
            }
        }
        return C29431cG.A0y(A13, new C98954rz(this.this$0, this.$contactNames, 0));
    }
}
