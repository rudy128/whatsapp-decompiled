package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5PH  reason: invalid class name */
public final class AnonymousClass5PH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ C24921Me $contactNames;
    public final /* synthetic */ C75983mF this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PH(C75983mF r2, AnonymousClass1M9 r3, C24921Me r4) {
        super(0);
        this.this$0 = r2;
        this.$contactManager = r3;
        this.$contactNames = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C75983mF r0 = this.this$0;
        AnonymousClass1MW r1 = r0.A01;
        GroupJid groupJid = r0.A01;
        if (groupJid != null) {
            C199410f<C63312sr> A0O = C72483Me.A0O(r1.A0B(groupJid));
            C18070vi.A0b(A0O);
            C75983mF r5 = this.this$0;
            AnonymousClass1M9 r3 = this.$contactManager;
            ArrayList A13 = AnonymousClass000.A13();
            for (C63312sr r12 : A0O) {
                AnonymousClass11S r02 = r5.A00;
                UserJid userJid = r12.A04;
                if (!r02.A0O(userJid)) {
                    AnonymousClass3MY.A1O(r3, userJid, A13);
                }
            }
            return C29431cG.A0y(A13, new C98954rz(this.this$0, this.$contactNames, 1));
        }
        throw C17890vO.A0K();
    }
}
