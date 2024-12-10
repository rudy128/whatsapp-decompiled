package X;

import android.content.Context;

/* renamed from: X.4Yb  reason: invalid class name and case insensitive filesystem */
public final class C88034Yb {
    public final int A00;
    public final C29681ch A01;
    public final Integer A02;
    public final Integer A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88034Yb) {
                C88034Yb r5 = (C88034Yb) obj;
                if (!(this.A02 == r5.A02 && C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A03, r5.A03) && this.A00 == r5.A00 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Integer num = this.A02;
        return C17880vN.A01((((AnonymousClass000.A0N(this.A01, C72453Mb.A0E(num, AnonymousClass4H5.A00(num)) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + this.A00) * 31, this.A04);
    }

    public C88034Yb(C29681ch r1, Integer num, Integer num2, int i, boolean z) {
        this.A02 = num;
        this.A01 = r1;
        this.A03 = num2;
        this.A00 = i;
        this.A04 = z;
    }

    public static C73203Rj A00(Context context, C88034Yb r2) {
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        Integer num = r2.A03;
        if (num != null) {
            A002.A0E(num.intValue());
        }
        return A002;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterActionError(action=");
        A10.append(AnonymousClass4H5.A00(this.A02));
        A10.append(", jid=");
        A10.append(this.A01);
        A10.append(", title=");
        A10.append(this.A03);
        A10.append(", message=");
        A10.append(this.A00);
        A10.append(", shouldRetry=");
        return C17900vP.A0F(A10, this.A04);
    }
}
