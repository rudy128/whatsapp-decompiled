package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5FF  reason: invalid class name */
public final class AnonymousClass5FF extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C98464rC this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5FF(C98464rC r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C98464rC r0 = this.this$0;
        AnonymousClass1EC r5 = r0.A00;
        String str = r0.A01;
        List<UserJid> list = r0.A02;
        ArrayList A0D = C29351c6.A0D(list);
        for (UserJid r1 : list) {
            A0D.add(new C178709Ed(r1));
        }
        return new AnonymousClass9F6(r5, str, (List) A0D);
    }
}
