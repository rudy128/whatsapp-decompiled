package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.home.AiHomeViewAllFragment;
import java.util.List;

/* renamed from: X.7xv  reason: invalid class name and case insensitive filesystem */
public final class C157697xv extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AiHomeViewAllFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157697xv(AiHomeViewAllFragment aiHomeViewAllFragment) {
        super(1);
        this.this$0 = aiHomeViewAllFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list;
        C1594184l r5 = (C1594184l) obj;
        if (r5 instanceof C143337Cz) {
            C115115tQ r3 = this.this$0.A02;
            if (r3 != null) {
                int A0U = r3.A0U(C108945cZ.A1K(r3, 0));
                r3.A01.A03(r3.A00.size(), A0U);
                List list2 = (List) ((C143337Cz) r5).A00;
                if (list2 != null) {
                    C115115tQ r0 = this.this$0.A02;
                    if (r0 != null) {
                        r0.A0V(list2);
                    }
                }
            }
            C18070vi.A11("botListAdapter");
            throw null;
        } else if (r5 instanceof AnonymousClass7D0) {
            C115115tQ r1 = this.this$0.A02;
            if (r1 != null) {
                AnonymousClass7D0 r52 = (AnonymousClass7D0) r5;
                r1.A0W((List) r52.A00.A00);
                boolean z = r52.A01;
                AiHomeViewAllFragment aiHomeViewAllFragment = this.this$0;
                if (!z) {
                    RecyclerView recyclerView = aiHomeViewAllFragment.A00;
                    if (!(recyclerView == null || (list = recyclerView.A0L) == null)) {
                        list.clear();
                    }
                } else {
                    aiHomeViewAllFragment.A26();
                }
            }
            C18070vi.A11("botListAdapter");
            throw null;
        } else if (r5 instanceof AnonymousClass7D1) {
            AnonymousClass7D1 r53 = (AnonymousClass7D1) r5;
            boolean z2 = r53.A02;
            C115115tQ r12 = this.this$0.A02;
            if (z2) {
                if (r12 != null) {
                    r12.A0X((List) r53.A01);
                }
                C18070vi.A11("botListAdapter");
                throw null;
            }
            if (r12 != null) {
                r12.A0W(C18460wS.A00);
            }
            C18070vi.A11("botListAdapter");
            throw null;
        }
        return C27621Wu.A00;
    }
}
