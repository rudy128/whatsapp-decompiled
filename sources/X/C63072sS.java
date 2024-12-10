package X;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: X.2sS  reason: invalid class name and case insensitive filesystem */
public class C63072sS {
    public static final ArrayList A03 = AnonymousClass000.A13();
    public SparseArray A00 = null;
    public WeakReference A01 = null;
    public WeakHashMap A02 = null;

    public static View A00(KeyEvent keyEvent, View view, C63072sS r6) {
        int size;
        View A002;
        WeakHashMap weakHashMap = r6.A02;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        A002 = A00(keyEvent, viewGroup.getChildAt(childCount), r6);
                    }
                } while (A002 == null);
                return A002;
            }
            AbstractList abstractList = (AbstractList) view.getTag(2131436018);
            if (abstractList != null && (size = abstractList.size() - 1) >= 0) {
                abstractList.get(size);
                throw AnonymousClass000.A0s("onUnhandledKeyEvent");
            }
        }
        return null;
    }
}
