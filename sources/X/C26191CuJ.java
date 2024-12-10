package X;

import java.text.BreakIterator;
import java.util.Locale;

/* renamed from: X.CuJ  reason: case insensitive filesystem */
public final class C26191CuJ {
    public final int A00;
    public final int A01;
    public final CharSequence A02;
    public final BreakIterator A03;

    public C26191CuJ(CharSequence charSequence, Locale locale, int i) {
        this.A02 = charSequence;
        if (0 > charSequence.length()) {
            throw AnonymousClass000.A0k("input start index is outside the CharSequence");
        } else if (i < 0 || i > charSequence.length()) {
            throw AnonymousClass000.A0k("input end index is outside the CharSequence");
        } else {
            BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            this.A03 = wordInstance;
            this.A01 = Math.max(0, -50);
            this.A00 = Math.min(charSequence.length(), i + 50);
            wordInstance.setText(new DUD(charSequence, i));
        }
    }

    public static final void A00(C26191CuJ cuJ, int i) {
        int i2 = cuJ.A01;
        int i3 = cuJ.A00;
        if (i > i3 || i2 > i) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid offset: ");
            A10.append(i);
            A10.append(". Valid range is [");
            A10.append(i2);
            A10.append(" , ");
            A10.append(i3);
            A10.append(']');
            throw AnonymousClass000.A0j(A10);
        }
    }

    public static final boolean A02(C26191CuJ cuJ, int i) {
        int i2 = cuJ.A01 + 1;
        if (i > cuJ.A00 || i2 > i || !Character.isLetterOrDigit(Character.codePointBefore(cuJ.A02, i))) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C26191CuJ cuJ, int i) {
        int i2 = cuJ.A01;
        if (i >= cuJ.A00 || i2 > i || !Character.isLetterOrDigit(Character.codePointAt(cuJ.A02, i))) {
            return false;
        }
        return true;
    }

    public final boolean A04(int i) {
        int i2 = this.A01 + 1;
        if (i > this.A00 || i2 > i) {
            return false;
        }
        return A01(Character.codePointBefore(this.A02, i));
    }

    public static final boolean A01(int i) {
        int type = Character.getType(i);
        if (type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21) {
            return true;
        }
        return false;
    }
}
