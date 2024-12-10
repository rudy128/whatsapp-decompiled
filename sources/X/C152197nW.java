package X;

import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7nW  reason: invalid class name and case insensitive filesystem */
public final class C152197nW extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C131126kY this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C152197nW(C131126kY r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C131126kY r5 = this.this$0;
        List list = r5.A06;
        boolean z = false;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                if (C22971Dz.A0d(A0Q)) {
                    C18070vi.A0z(A0Q, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                    if (((AnonymousClass1PM) r5.A04.get()).A04((UserJid) A0Q)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
