package X;

import android.content.Context;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.List;

public final class AIs implements C16890tO {
    public /* synthetic */ String BQX() {
        return C02730Fd.A00(this);
    }

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C18070vi.A0j(view, obj2);
        view.post(new C21471Akc(obj2, (Object) view, 33));
        return null;
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        AnonymousClass8D2 r3;
        ViewParent viewParent = (C01930Bz) obj;
        List list = (List) obj2;
        C18070vi.A0j(viewParent, list);
        ViewParent viewParent2 = viewParent;
        while ((viewParent2 instanceof ViewGroup) && !(viewParent2 instanceof BV8)) {
            TouchDelegate touchDelegate = ((View) viewParent2).getTouchDelegate();
            if ((touchDelegate instanceof AnonymousClass8D2) && (r3 = (AnonymousClass8D2) touchDelegate) != null) {
                List list2 = r3.A00;
                if (C29401cD.A0N(list2, new C22091AxV(list))) {
                    C29391cC.A0H(list2, C21482Akn.A00);
                }
                if (r3.A00.isEmpty()) {
                    ((View) viewParent2).setTouchDelegate((TouchDelegate) null);
                }
            }
            viewParent2 = ((View) viewParent2).getParent();
        }
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
