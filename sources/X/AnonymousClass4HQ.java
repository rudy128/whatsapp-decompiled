package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsListView;
import java.util.List;

/* renamed from: X.4HQ  reason: invalid class name */
public abstract class AnonymousClass4HQ {
    public static C010105w A00(Context context, List list, C18090vk r9, C22821Di r10) {
        C18070vi.A0d(list, 0);
        View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(context), 2131625177);
        View A05 = C18070vi.A05(A0D, 2131433997);
        View A052 = C18070vi.A05(A0D, 2131432938);
        C72973Om r2 = new C72973Om(context, list);
        ((AbsListView) C18070vi.A05(A0D, 2131430287)).setAdapter(r2);
        C73203Rj A00 = AnonymousClass4a6.A00(context);
        A00.A0c(A0D);
        A00.A0T(false);
        C010105w A0L = AnonymousClass3MY.A0L(A00);
        C90024dP.A00(A052, r9, A0L, 19);
        AnonymousClass3Ma.A1F(A05, r10, r2, A0L, 36);
        return A0L;
    }
}
