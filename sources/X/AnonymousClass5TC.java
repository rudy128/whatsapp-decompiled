package X;

import android.content.Context;
import com.whatsapp.lists.home.ui.main.ListsHomeFragment;

/* renamed from: X.5TC  reason: invalid class name */
public final class AnonymousClass5TC extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ListsHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5TC(ListsHomeFragment listsHomeFragment) {
        super(1);
        this.this$0 = listsHomeFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C41761x1 r5 = (C41761x1) obj;
        Context A1n = this.this$0.A1n();
        if (A1n != null) {
            ListsHomeFragment listsHomeFragment = this.this$0;
            C72453Mb.A1S(r5);
            if (!((C88024Ya) AnonymousClass3MX.A0q(listsHomeFragment.A0A).A0G.getValue()).A04) {
                AnonymousClass00H r0 = listsHomeFragment.A04;
                if (r0 != null) {
                    ((C38501rO) r0.get()).A02(A1n, r5, listsHomeFragment.A07);
                } else {
                    C18070vi.A11("listsUtil");
                    throw null;
                }
            }
        }
        return C27621Wu.A00;
    }
}
