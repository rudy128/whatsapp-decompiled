package X;

import android.view.View;

/* renamed from: X.0Xn  reason: invalid class name and case insensitive filesystem */
public final class C06240Xn implements C17060tg {
    public static final C06240Xn A00 = new Object();

    public C18090vk Bdh(AnonymousClass05G r4) {
        C05230Ra r2 = new C05230Ra(r4, 2);
        r4.addOnAttachStateChangeListener(r2);
        AnonymousClass0Y3 r1 = new AnonymousClass0Y3(r4);
        A00(r4, r1);
        return new C09380gc(r4, r1, r2);
    }

    public static final void A00(View view, C1593084a r3) {
        AnonymousClass6Z9 r0 = (AnonymousClass6Z9) view.getTag(2131433963);
        if (r0 == null) {
            r0 = new AnonymousClass6Z9();
            view.setTag(2131433963, r0);
        }
        r0.A00.add(r3);
    }
}
