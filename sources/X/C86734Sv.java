package X;

import android.view.View;

/* renamed from: X.4Sv  reason: invalid class name and case insensitive filesystem */
public final class C86734Sv {
    public final View.OnClickListener A00;
    public final AnonymousClass4ZN A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C86734Sv) {
                C86734Sv r5 = (C86734Sv) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public C86734Sv(View.OnClickListener onClickListener, AnonymousClass4ZN r2) {
        this.A01 = r2;
        this.A00 = onClickListener;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ButtonContent(buttonStringProvider=");
        A10.append(this.A01);
        A10.append(", onClick=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
