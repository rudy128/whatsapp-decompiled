package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.82z  reason: invalid class name and case insensitive filesystem */
public final class C1590382z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LayoutInflater $layoutInflater;
    public final /* synthetic */ C133866pd $tab;
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1590382z(LayoutInflater layoutInflater, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment, C133866pd r4) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
        this.$tab = r4;
        this.$layoutInflater = layoutInflater;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        if (!list.isEmpty()) {
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = this.this$0;
            int i = this.$tab.A00;
            C18000vb r10 = reactionsBottomSheetDialogFragment.A0B;
            if (r10 != null) {
                LayoutInflater layoutInflater = this.$layoutInflater;
                C18070vi.A0b(layoutInflater);
                String str = this.$tab.A03;
                int size = list.size();
                String[] strArr = C1409073n.A04;
                C18070vi.A0d(layoutInflater, 1);
                View inflate = layoutInflater.inflate(2131626678, (ViewGroup) null);
                C18070vi.A0X(inflate);
                Context context = layoutInflater.getContext();
                C72453Mb.A0c(inflate, 2131434355).A0S(str, (List) null, 0, false);
                TextView A0J = AnonymousClass3MW.A0J(inflate, 2131434354);
                C18070vi.A0b(context);
                A0J.setText(C1409073n.A01(context, r10, size));
                String quantityString = context.getResources().getQuantityString(2131755349, size, C108945cZ.A1a(C1409073n.A01(context, r10, size), str, 2, 1));
                C18070vi.A0X(quantityString);
                inflate.setContentDescription(quantityString);
                ReactionsBottomSheetDialogFragment.A00(inflate, reactionsBottomSheetDialogFragment, i);
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
