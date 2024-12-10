package X;

import android.view.ViewGroup;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1bl  reason: invalid class name and case insensitive filesystem */
public class C29191bl {
    public static ArrayList A02 = new ArrayList();
    public static AnonymousClass1LG A03 = new C29061bY();
    public static ThreadLocal sRunningTransitions = new ThreadLocal();
    public AnonymousClass00P A00 = new AnonymousClass00O(0);
    public AnonymousClass00P A01 = new AnonymousClass00O(0);

    /* JADX WARNING: type inference failed for: r2v0, types: [X.00O, X.00P, java.lang.Object] */
    public static AnonymousClass00P A00() {
        AnonymousClass00P r2;
        Reference reference = (Reference) sRunningTransitions.get();
        if (reference != null && (r2 = (AnonymousClass00P) reference.get()) != null) {
            return r2;
        }
        ? r22 = new AnonymousClass00O(0);
        sRunningTransitions.set(new WeakReference(r22));
        return r22;
    }

    public static void A01(ViewGroup viewGroup) {
        A02.remove(viewGroup);
        AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
        if (abstractCollection != null && !abstractCollection.isEmpty()) {
            ArrayList arrayList = new ArrayList(abstractCollection);
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((AnonymousClass1LG) arrayList.get(size)).A0I(viewGroup);
                } else {
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, X.2vA, android.view.View$OnAttachStateChangeListener] */
    public static void A02(ViewGroup viewGroup, AnonymousClass1LG r4) {
        ArrayList arrayList = A02;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (r4 == null) {
                r4 = A03;
            }
            AnonymousClass1LG A04 = r4.clone();
            AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
            if (abstractCollection != null && abstractCollection.size() > 0) {
                Iterator it = abstractCollection.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass1LG) it.next()).A0F(viewGroup);
                }
            }
            if (A04 != null) {
                A04.A0K(viewGroup, true);
            }
            viewGroup.getTag(2131436422);
            viewGroup.setTag(2131436422, (Object) null);
            if (A04 != null) {
                ? obj = new Object();
                obj.A01 = A04;
                obj.A00 = viewGroup;
                viewGroup.addOnAttachStateChangeListener(obj);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
            }
        }
    }
}
