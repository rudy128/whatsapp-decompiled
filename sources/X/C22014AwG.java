package X;

import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.AwG  reason: case insensitive filesystem */
public final class C22014AwG extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1M9 $contactManager;
    public final /* synthetic */ AnonymousClass1MW $participantUserStore;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22014AwG(AnonymousClass1M9 r2, AnonymousClass1MW r3) {
        super(0);
        this.$contactManager = r2;
        this.$participantUserStore = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ArrayList A0M = this.$contactManager.A0M();
        AnonymousClass1MW r4 = this.$participantUserStore;
        ArrayList A0D = C29351c6.A0D(A0M);
        Iterator it = A0M.iterator();
        while (it.hasNext()) {
            Jid A06 = C17880vN.A0O(it).A06(AnonymousClass1EC.class);
            if (A06 != null) {
                A0D.add(r4.A0B((AnonymousClass1E9) A06));
            } else {
                throw C17880vN.A0g();
            }
        }
        return A0D;
    }
}
