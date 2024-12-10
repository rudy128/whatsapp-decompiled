package X;

import com.whatsapp.WaTextView;
import com.whatsapp.updates.ui.statusmuting.MutedStatusesActivity;
import java.util.List;

/* renamed from: X.81f  reason: invalid class name and case insensitive filesystem */
public final class C1585781f extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ MutedStatusesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1585781f(MutedStatusesActivity mutedStatusesActivity) {
        super(1);
        this.this$0 = mutedStatusesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        List list = (List) obj;
        WaTextView waTextView = this.this$0.A04;
        if (waTextView == null) {
            str = "noStatusesTextView";
        } else {
            waTextView.setVisibility(C72453Mb.A07(list.isEmpty() ? 1 : 0));
            C112435lT r4 = this.this$0.A06;
            if (r4 == null) {
                str = "adapter";
            } else {
                C108955ca.A1O(r4.A00);
                C116705yU r3 = new C116705yU(r4.A01, list);
                ((C37471pb) r4.A07.getValue()).A00(new C143627Ed(r4, list, 5), r3);
                r4.A00 = r3;
                return C27621Wu.A00;
            }
        }
        C18070vi.A11(str);
        throw null;
    }
}
