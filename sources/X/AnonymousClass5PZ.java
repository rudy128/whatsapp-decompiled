package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.5PZ  reason: invalid class name */
public final class AnonymousClass5PZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ C24921Me $contactNames;
    public final /* synthetic */ AnonymousClass1EC $groupJid;
    public final /* synthetic */ C75973mE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5PZ(C75973mE r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass1EC r5) {
        super(0);
        this.this$0 = r2;
        this.$groupJid = r5;
        this.$contactManager = r3;
        this.$contactNames = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1MW r1 = this.this$0.A01;
        AnonymousClass1EC r0 = this.$groupJid;
        if (r0 != null) {
            C199410f<C63312sr> A0O = C72483Me.A0O(r1.A0B(r0));
            C18070vi.A0b(A0O);
            C75973mE r5 = this.this$0;
            AnonymousClass1M9 r4 = this.$contactManager;
            ArrayList A13 = AnonymousClass000.A13();
            for (C63312sr r12 : A0O) {
                AnonymousClass11S r02 = r5.A00;
                UserJid userJid = r12.A04;
                if (!r02.A0O(userJid)) {
                    AnonymousClass3MY.A1O(r4, userJid, A13);
                }
            }
            return C98974s1.A00(A13, this.$contactNames, 2);
        }
        throw C17890vO.A0K();
    }
}
