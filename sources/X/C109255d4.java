package X;

import android.app.SharedElementCallback;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5d4  reason: invalid class name and case insensitive filesystem */
public class C109255d4 extends SharedElementCallback {
    public final List A00 = AnonymousClass000.A13();
    public final /* synthetic */ AnonymousClass01E A01;

    public C109255d4(AnonymousClass01E r2) {
        this.A01 = r2;
    }

    public void onMapSharedElements(List list, Map map) {
        super.onMapSharedElements(list, map);
        AnonymousClass01E r7 = this.A01;
        ArrayList A13 = AnonymousClass000.A13();
        View A0F = AnonymousClass3MZ.A0F(r7);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            View view = (View) map.get(A0v);
            if (view == null) {
                view = AnonymousClass745.A06(A0F, A0v);
                if (view != null) {
                    map.put(A0v, view);
                }
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (parent != null) {
                    if (parent == A0F) {
                        break;
                    }
                    parent = parent.getParent();
                } else {
                    AnonymousClass1Xr.A04(view, (String) null);
                    map.remove(A0v);
                    C18070vi.A0d(A0v, 0);
                    if (C108975cc.A1N("thumb-transition-", A0v)) {
                        int width = view.getWidth();
                        int height = view.getHeight();
                        ViewGroup viewGroup = (ViewGroup) r7.findViewById(2131429574);
                        if (viewGroup != null) {
                            View view2 = new View(r7);
                            viewGroup.addView(view2);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                            layoutParams.addRule(14);
                            layoutParams.topMargin = -height;
                            view2.setLayoutParams(layoutParams);
                            A13.add(view2);
                            AnonymousClass1Xr.A04(view2, A0v);
                            map.put(A0v, view2);
                        }
                    }
                }
            }
        }
        this.A00.addAll(A13);
    }

    public void onSharedElementEnd(List list, List list2, List list3) {
        super.onSharedElementEnd(list, list2, list3);
        this.A01.setExitSharedElementCallback((SharedElementCallback) null);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass1Xr.A04(AnonymousClass3MX.A0E(it), (String) null);
        }
    }

    public void onSharedElementsArrived(List list, List list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            View A0E = AnonymousClass3MX.A0E(it);
            ((ViewGroup) A0E.getParent()).removeView(A0E);
        }
    }
}
