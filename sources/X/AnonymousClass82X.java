package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.82X  reason: invalid class name */
public final class AnonymousClass82X extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ LayoutInflater $layoutInflater;
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82X(LayoutInflater layoutInflater, ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
        this.$layoutInflater = layoutInflater;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        if (list.isEmpty()) {
            this.this$0.A29();
        } else {
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = this.this$0;
            C18000vb r11 = reactionsBottomSheetDialogFragment.A0B;
            if (r11 != null) {
                LayoutInflater layoutInflater = this.$layoutInflater;
                C18070vi.A0b(layoutInflater);
                int size = list.size();
                String[] strArr = C1409073n.A04;
                C18070vi.A0d(layoutInflater, 1);
                View A0D = AnonymousClass3MY.A0D(layoutInflater, 2131626678);
                C18070vi.A0X(A0D);
                Context context = layoutInflater.getContext();
                TextView A0J = AnonymousClass3MW.A0J(A0D, 2131434354);
                C18070vi.A0b(context);
                C18070vi.A0d(context, 1);
                String quantityString = context.getResources().getQuantityString(2131755350, size, new Object[]{C1409073n.A01(context, r11, size)});
                C18070vi.A0X(quantityString);
                A0J.setText(quantityString);
                String A01 = C1409073n.A01(context, r11, size);
                String quantityString2 = context.getResources().getQuantityString(2131755348, size, new Object[]{A01});
                C18070vi.A0X(quantityString2);
                A0D.setContentDescription(quantityString2);
                ReactionsBottomSheetDialogFragment.A00(A0D, reactionsBottomSheetDialogFragment, 0);
            } else {
                AnonymousClass3MW.A1M();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
