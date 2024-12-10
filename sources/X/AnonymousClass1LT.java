package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: X.1LT  reason: invalid class name */
public final class AnonymousClass1LT {
    public final AnonymousClass10I A00;
    public final HashMap A01 = new HashMap();
    public final C18030ve A02;

    public AnonymousClass1LT(C18030ve r2, AnonymousClass10I r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A02 = r2;
        this.A00 = r3;
    }

    public final View A00(Context context, ViewGroup viewGroup, int i, boolean z) {
        Object obj;
        C18070vi.A0d(context, 0);
        HashMap hashMap = this.A01;
        synchronized (hashMap) {
            LinkedList linkedList = (LinkedList) hashMap.get(Integer.valueOf(i));
            if (linkedList == null || linkedList.isEmpty()) {
                obj = null;
            } else {
                obj = linkedList.remove(0);
            }
        }
        if (obj != null && z) {
            C38831ry r3 = new C38831ry(context, new C38821rx(this.A00, hashMap));
            String valueOf = String.valueOf(i);
            C38821rx r2 = r3.A00;
            C38861s1 A002 = r2.A00(valueOf);
            A002.A04 = r3;
            A002.A00 = i;
            A002.A02 = viewGroup;
            A002.A06 = true;
            r2.A01(A002);
        }
        return (View) obj;
    }

    public final void A01(Context context, int i) {
        C18070vi.A0d(context, 0);
        C38831ry r0 = new C38831ry(context, new C38821rx(this.A00, this.A01));
        C38821rx r2 = r0.A00;
        C38861s1 A002 = r2.A00((String) null);
        A002.A04 = r0;
        A002.A00 = i;
        A002.A02 = null;
        A002.A06 = true;
        r2.A01(A002);
    }
}
