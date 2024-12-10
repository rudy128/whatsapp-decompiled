package X;

import android.view.View;

/* renamed from: X.4Tx  reason: invalid class name and case insensitive filesystem */
public final class C87004Tx {
    public final View.OnClickListener A00;
    public final String A01;

    public C87004Tx(View.OnClickListener onClickListener, String str) {
        C18070vi.A0d(str, 1);
        this.A01 = str;
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87004Tx) {
                C87004Tx r5 = (C87004Tx) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ButtonSpec(buttonText=");
        A10.append(this.A01);
        A10.append(", clickListener=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
