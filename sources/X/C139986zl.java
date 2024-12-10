package X;

import android.view.View;

/* renamed from: X.6zl  reason: invalid class name and case insensitive filesystem */
public final class C139986zl {
    public final View.OnClickListener A00;
    public final CharSequence A01;
    public final Integer A02;
    public final String A03;
    public final Integer A04;

    public C139986zl(View.OnClickListener onClickListener, CharSequence charSequence, Integer num, Integer num2, String str) {
        C18070vi.A0d(str, 3);
        this.A04 = num;
        this.A01 = charSequence;
        this.A03 = str;
        this.A02 = num2;
        this.A00 = onClickListener;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C139986zl) {
                C139986zl r5 = (C139986zl) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A03, r5.A03) || this.A02 != r5.A02 || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A03, ((AnonymousClass001.A0k(this.A04) * 31) + AnonymousClass001.A0k(this.A01)) * 31);
        Integer num = this.A02;
        return ((A022 + C72453Mb.A0E(num, A00(num))) * 31) + C17880vN.A02(this.A00);
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "MUSIC";
            case 1:
                return "MENTIONS";
            case 2:
                return "SHARING_API";
            case 3:
                return "FORWARDED_NEWSLETTER";
            default:
                return "RESHARED_FROM_MENTION";
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TopAttributionModel(ctaDrawableRes=");
        A10.append(this.A04);
        A10.append(", label=");
        A10.append(this.A01);
        A10.append(", contentDescription=");
        A10.append(this.A03);
        A10.append(", type=");
        A10.append(A00(this.A02));
        A10.append(", clickHandler=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
