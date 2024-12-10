package X;

import android.view.ViewTreeObserver;
import java.util.AbstractMap;

/* renamed from: X.2vI  reason: invalid class name and case insensitive filesystem */
public final class C64762vI implements ViewTreeObserver.OnGlobalLayoutListener {
    public int A00;
    public final String A01;
    public final /* synthetic */ AnonymousClass1K9 A02;

    public C64762vI(AnonymousClass1K9 r1, String str) {
        this.A02 = r1;
        this.A01 = str;
    }

    public void onGlobalLayout() {
        AnonymousClass1K9 r1 = this.A02;
        if (r1.A00 == 0) {
            this.A00++;
            AnonymousClass1K5 r4 = r1.A02;
            String str = this.A01;
            Boolean bool = r4.A00;
            if (bool == null) {
                if (r4.A04.get() != null) {
                    C24521Kq r0 = C24521Kq.$redex_init_class;
                }
                bool = false;
                r4.A00 = bool;
            }
            bool.equals(AnonymousClass000.A0i());
            C18100vl r02 = r4.A06;
            AbstractMap abstractMap = (AbstractMap) r02.getValue();
            int i = ((AbstractMap) r02.getValue()).get(str);
            if (i == null) {
                i = 0;
            }
            C17890vO.A0z(str, abstractMap, AnonymousClass000.A0M(i) + 1);
        }
    }
}
