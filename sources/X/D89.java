package X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayDeque;

public class D89 implements E7I {
    public final /* synthetic */ C22646BHi A00;

    public D89(C22646BHi bHi) {
        this.A00 = bHi;
    }

    public static void A00(View view) {
        if (view != null) {
            AnonymousClass0J4 r4 = AnonymousClass0O7.A01;
            r4.A01("recursivelyNotifyVisibleBoundsChanged");
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(view);
            while (!arrayDeque.isEmpty()) {
                Object pop = arrayDeque.pop();
                if (pop instanceof AnonymousClass0sV) {
                    ((AnonymousClass0sV) pop).BkX();
                } else if (pop instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) pop;
                    int childCount = viewGroup.getChildCount();
                    while (true) {
                        childCount--;
                        if (-1 >= childCount) {
                            break;
                        }
                        arrayDeque.push(viewGroup.getChildAt(childCount));
                    }
                }
            }
            r4.A00();
        }
    }

    public void C0x(View view, int i) {
        A00(view);
    }

    public void C10(View view, C28483E3n e3n) {
        A00(view);
    }
}
