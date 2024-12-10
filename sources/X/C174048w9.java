package X;

import android.view.View;

/* renamed from: X.8w9  reason: invalid class name and case insensitive filesystem */
public final class C174048w9 extends C174358we {
    public final View.OnClickListener A00;

    public C174048w9(View.OnClickListener onClickListener) {
        super(8);
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C18070vi.A14(this, obj) || !super.equals(obj)) {
            return false;
        }
        return C18070vi.A18(this.A00, ((C174048w9) obj).A00);
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass000.A1L(A1b, super.hashCode());
        return AnonymousClass000.A0P(this.A00, A1b, 1);
    }
}
