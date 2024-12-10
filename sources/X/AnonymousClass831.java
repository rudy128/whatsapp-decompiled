package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.bot.home.AiHomeFragment;
import com.whatsapp.bot.home.AiHomeViewModel;
import java.util.List;

/* renamed from: X.831  reason: invalid class name */
public final class AnonymousClass831 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C115105tP $adapter;
    public final /* synthetic */ LinearLayoutManager $layoutManager;
    public final /* synthetic */ RecyclerView $mainList;
    public final /* synthetic */ AiHomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass831(LinearLayoutManager linearLayoutManager, RecyclerView recyclerView, AiHomeFragment aiHomeFragment, C115105tP r5) {
        super(1);
        this.$adapter = r5;
        this.this$0 = aiHomeFragment;
        this.$mainList = recyclerView;
        this.$layoutManager = linearLayoutManager;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1594184l r6 = (C1594184l) obj;
        if (r6 != null) {
            if (r6 instanceof C143337Cz) {
                C115105tP r3 = this.$adapter;
                int A0U = r3.A0U(C108945cZ.A1K(r3, 0));
                r3.A01.A03(r3.A00.size(), A0U);
                List list = (List) ((C143337Cz) r6).A00;
                if (list != null) {
                    this.$adapter.A0V(list);
                }
            } else if (r6 instanceof AnonymousClass7D0) {
                AiHomeViewModel A0b = C108945cZ.A0b(this.this$0.A04);
                C128286fk r4 = A0b.A0A;
                boolean A1W = AnonymousClass000.A1W(A0b.A08.A00);
                if (!r4.A01 && A1W) {
                    AnonymousClass18K r32 = r4.A02;
                    C47192Hl r2 = new C47192Hl();
                    C108945cZ.A1M(r2, 71);
                    r2.A05 = r4.A00;
                    r2.A0E = C50542Uv.A00();
                    r32.CC7(r2);
                    r4.A01 = true;
                }
                AnonymousClass7D0 r62 = (AnonymousClass7D0) r6;
                this.$adapter.A0W((List) r62.A00.A00);
                if (!r62.A01) {
                    List list2 = this.$mainList.A0L;
                    if (list2 != null) {
                        list2.clear();
                    }
                } else {
                    AiHomeFragment aiHomeFragment = this.this$0;
                    LinearLayoutManager linearLayoutManager = this.$layoutManager;
                    C18070vi.A0d(linearLayoutManager, 0);
                    if (linearLayoutManager.A1Q() + 3 >= linearLayoutManager.A0K()) {
                        C108945cZ.A0b(aiHomeFragment.A04).A0F.CPw(C27621Wu.A00);
                    }
                }
            } else if (r6 instanceof AnonymousClass7D1) {
                AnonymousClass7D1 r63 = (AnonymousClass7D1) r6;
                boolean z = r63.A02;
                C115105tP r1 = this.$adapter;
                if (z) {
                    r1.A0X((List) r63.A01);
                } else {
                    r1.A0W(C18460wS.A00);
                }
            }
        }
        return C27621Wu.A00;
    }
}
