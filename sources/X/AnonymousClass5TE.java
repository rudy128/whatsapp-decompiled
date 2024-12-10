package X;

import android.content.Context;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;

/* renamed from: X.5TE  reason: invalid class name */
public final class AnonymousClass5TE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TE(ListsHomeFragment listsHomeFragment) {
        super(1);
        this.this$0 = listsHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass00H r0 = this.this$0.A04;
        if (r0 != null) {
            r0.get();
            Context A14 = this.this$0.A14();
            C73193Ri A00 = C73193Ri.A00(A14);
            A00.A0d(A14.getString(2131891733));
            A00.A0a(new C1411874q(29), A14.getString(2131893144));
            AnonymousClass3MY.A1G(A00);
            return C27621Wu.A00;
        }
        C18070vi.A11("listsUtil");
        throw null;
    }
}
