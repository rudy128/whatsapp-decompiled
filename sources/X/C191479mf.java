package X;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.9mf  reason: invalid class name and case insensitive filesystem */
public class C191479mf {
    public final Rect A00 = AnonymousClass3MW.A07();
    public final Rect A01 = AnonymousClass3MW.A07();
    public final C21350Aif A02;
    public final WeakReference A03;
    public final List A04 = AnonymousClass8BR.A14();
    public final List A05 = AnonymousClass000.A13();

    public C191479mf(View view, C21350Aif aif) {
        this.A03 = AnonymousClass3MW.A0z(view);
        this.A02 = aif;
    }

    public void A00(List list) {
        list.clear();
        List list2 = this.A04;
        list2.clear();
        View view = (View) this.A03.get();
        if (view != null) {
            Rect rect = this.A01;
            if (view.getGlobalVisibleRect(rect) && !rect.isEmpty()) {
                list2.add(rect);
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    it.next();
                    Rect rect2 = this.A00;
                    rect2.setEmpty();
                    ListIterator listIterator = list2.listIterator();
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        C28111Yx.A02(next);
                        Rect rect3 = (Rect) next;
                        if (Rect.intersects(rect2, rect3)) {
                            listIterator.remove();
                            int i = rect2.top;
                            int i2 = rect3.top;
                            if (i > i2) {
                                listIterator.add(new Rect(rect3.left, i2, rect3.right, i));
                            }
                            int i3 = rect2.bottom;
                            int i4 = rect3.bottom;
                            if (i3 < i4) {
                                listIterator.add(new Rect(rect3.left, i3, rect3.right, i4));
                            }
                            int i5 = rect2.left;
                            int i6 = rect3.left;
                            if (i5 > i6) {
                                listIterator.add(new Rect(i6, Math.max(rect3.top, rect2.top), i5, Math.min(rect3.bottom, rect2.bottom)));
                            }
                            int i7 = rect2.right;
                            int i8 = rect3.right;
                            if (i7 < i8) {
                                listIterator.add(new Rect(i7, Math.max(rect3.top, rect2.top), i8, Math.min(rect3.bottom, rect2.bottom)));
                            }
                        }
                    }
                }
                list.addAll(list2);
            }
        }
    }
}
