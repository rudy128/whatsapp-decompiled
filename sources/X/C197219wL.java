package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.9wL  reason: invalid class name and case insensitive filesystem */
public abstract class C197219wL {
    public static boolean A00;

    public static final void A01(C25461Oh r8, B8P b8p, AnonymousClass00H r10, Set set, C18090vk r12) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0L c0l = (C0L) it.next();
            int A01 = r8.A01(c0l.id);
            if (!(A01 == 3 || A01 == 2)) {
                A1I a1i = (A1I) r10.get();
                a1i.A04.CGN(new C167248fh((C56532hc) a1i.A00.A00.A00.A4G.get(), c0l, AnonymousClass3MW.A0z(b8p)));
                r12.invoke();
            }
        }
    }

    public static final Bitmap A00(A1I a1i, C0L c0l) {
        C18070vi.A0h(c0l, a1i);
        File A01 = a1i.A01(c0l);
        if (A01 == null) {
            return null;
        }
        return BitmapFactory.decodeFile(A01.getPath());
    }
}
