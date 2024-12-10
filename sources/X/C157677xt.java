package X;

import com.whatsapp.bot.home.AiHomeSearchFragment;
import java.util.List;

/* renamed from: X.7xt  reason: invalid class name and case insensitive filesystem */
public final class C157677xt extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiHomeSearchFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157677xt(AiHomeSearchFragment aiHomeSearchFragment) {
        super(1);
        this.this$0 = aiHomeSearchFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C1594184l r3 = (C1594184l) obj;
        if (r3 != null) {
            if (r3 instanceof AnonymousClass7D1) {
                obj2 = ((AnonymousClass7D1) r3).A01;
            } else if (r3 instanceof C143337Cz) {
                obj2 = ((C143337Cz) r3).A00;
            } else if (r3 instanceof AnonymousClass7D0) {
                obj2 = ((AnonymousClass7D0) r3).A00.A00;
            } else {
                throw AnonymousClass3MW.A14();
            }
            List list = (List) obj2;
            C115115tQ r0 = this.this$0.A02;
            if (r0 != null) {
                r0.A0X(list);
            } else {
                C18070vi.A11("botListAdapter");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
