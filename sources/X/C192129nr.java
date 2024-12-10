package X;

import java.lang.ref.WeakReference;
import java.util.GregorianCalendar;

/* renamed from: X.9nr  reason: invalid class name and case insensitive filesystem */
public abstract class C192129nr {
    public final C21595Amj A00 = new C21595Amj(this);

    public Object A00() {
        String str;
        switch (((C177979Bi) this).A00) {
            case 0:
                str = "yyyy-MM-dd HH:mm:ss.SSSZ";
                break;
            case 3:
                str = "MMM dd, yyyy";
                break;
            case 4:
                str = "yyyy-MM-dd";
                break;
            default:
                return new GregorianCalendar();
        }
        return AnonymousClass8BS.A0q(str);
    }

    public final synchronized Object A01() {
        Object obj;
        C21595Amj amj = this.A00;
        obj = ((WeakReference) amj.get()).get();
        if (obj == null) {
            obj = A00();
            amj.set(AnonymousClass3MW.A0z(obj));
        }
        return obj;
    }
}
