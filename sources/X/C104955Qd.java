package X;

import android.view.View;
import com.whatsapp.backup.google.RestoreTransferSelectorActivity;
import java.util.List;

/* renamed from: X.5Qd  reason: invalid class name and case insensitive filesystem */
public final class C104955Qd extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ RestoreTransferSelectorActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104955Qd(RestoreTransferSelectorActivity restoreTransferSelectorActivity) {
        super(1);
        this.this$0 = restoreTransferSelectorActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view;
        int i;
        List list = (List) obj;
        C18070vi.A0d(list, 0);
        RestoreTransferSelectorActivity restoreTransferSelectorActivity = this.this$0;
        List list2 = restoreTransferSelectorActivity.A04;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view2 = (View) list2.get(i2);
            int A0n = AnonymousClass001.A0n(list, i2);
            if (A0n == 0) {
                view2.setBackgroundResource(2131232936);
                view = (View) list2.get(i2);
                i = 3;
                C90104dX.A00(view, restoreTransferSelectorActivity, i2, i);
            } else if (A0n == 1) {
                view2.setBackgroundResource(2131232937);
                view = (View) list2.get(i2);
                i = 4;
                C90104dX.A00(view, restoreTransferSelectorActivity, i2, i);
            } else if (A0n == 2) {
                view2.setBackgroundResource(2131232936);
                view2.setAlpha(0.3f);
            }
            view2.setOutlineProvider(new C22649BHn(0));
            view2.setClipToOutline(true);
        }
        return C27621Wu.A00;
    }
}
