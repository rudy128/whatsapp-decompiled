package X;

import android.content.res.Resources;
import android.view.View;

/* renamed from: X.4f5  reason: invalid class name and case insensitive filesystem */
public class C91064f5 implements AnonymousClass02j {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C91064f5(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void Bkx(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass4S6 r5 = (AnonymousClass4S6) this.A01;
            Object obj2 = this.A02;
            Object obj3 = this.A03;
            C005702m r7 = (C005702m) obj;
            C18070vi.A0d(r7, 3);
            if (r7.A00 == -1) {
                r5.A02.CGF(new AnonymousClass3C5(r5, obj3, new C91274fQ(new C91264fP(obj2, 12), r5, 1), 26));
                return;
            }
            return;
        }
        C18090vk r4 = (C18090vk) this.A02;
        Resources resources = (Resources) this.A03;
        C005702m r72 = (C005702m) obj;
        C18070vi.A0f(r4, 1, r72);
        if (r72.A00 == -1) {
            C31191fA.A00(resources, (View) r4.invoke(), 2131895545);
        }
    }
}
