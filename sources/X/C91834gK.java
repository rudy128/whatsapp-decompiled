package X;

import android.view.View;

/* renamed from: X.4gK  reason: invalid class name and case insensitive filesystem */
public class C91834gK implements C38591rZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C91834gK(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onResult(Object obj) {
        if (this.A00 != 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("TypingIndicatorBubble/cannot load animation with id=");
            A10.append(AnonymousClass000.A0Y((View) this.A01).getResourceEntryName(((C73133Pz) this.A02).A00));
            A10.append(", error is ");
            C17890vO.A19(A10, ((Throwable) obj).getMessage());
            return;
        }
        C38631rd r2 = (C38631rd) this.A01;
        C18070vi.A0d(r2, 0);
        r2.A0K((C39801tf) obj);
        r2.A0d.A04 = ((C84624Kf) this.A02).A00;
        r2.A07();
    }
}
