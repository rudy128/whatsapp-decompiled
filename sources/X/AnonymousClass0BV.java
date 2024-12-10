package X;

import java.text.BreakIterator;

/* renamed from: X.0BV  reason: invalid class name */
public final class AnonymousClass0BV extends C06140Xc {
    public static AnonymousClass0BV A01;
    public BreakIterator A00;

    private final boolean A00(int i) {
        if (i < 0 || i >= C06140Xc.A01(this)) {
            return false;
        }
        return Character.isLetterOrDigit(A02().codePointAt(i));
    }

    public void A03(String str) {
        this.A00 = str;
        BreakIterator breakIterator = this.A00;
        if (breakIterator == null) {
            C18070vi.A11("impl");
            throw null;
        } else {
            breakIterator.setText(str);
        }
    }

    public int[] BLU(int i) {
        if (C06140Xc.A01(this) > 0 && i < C06140Xc.A01(this)) {
            if (i < 0) {
                i = 0;
            }
            do {
                if (A00(i) || (A00(i) && (i == 0 || !A00(i - 1)))) {
                    BreakIterator breakIterator = this.A00;
                    if (breakIterator != null) {
                        int following = breakIterator.following(i);
                        if (following != -1 && following > 0 && A00(following - 1) && (following == C06140Xc.A01(this) || !A00(following))) {
                            return A04(i, following);
                        }
                    }
                } else {
                    BreakIterator breakIterator2 = this.A00;
                    if (breakIterator2 != null) {
                        i = breakIterator2.following(i);
                    }
                }
                C18070vi.A11("impl");
                throw null;
            } while (i != -1);
            return null;
        }
        return null;
    }

    public int[] CCD(int i) {
        int A012 = C06140Xc.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            do {
                if (i > 0) {
                    int i2 = i - 1;
                    if (!A00(i2) && (!A00(i2) || (i != C06140Xc.A01(this) && A00(i)))) {
                        BreakIterator breakIterator = this.A00;
                        if (breakIterator != null) {
                            i = breakIterator.preceding(i);
                        } else {
                            C18070vi.A11("impl");
                            throw null;
                        }
                    }
                }
                BreakIterator breakIterator2 = this.A00;
                if (breakIterator2 != null) {
                    int preceding = breakIterator2.preceding(i);
                    if (preceding != -1 && A00(preceding) && (preceding == 0 || !A00(preceding - 1))) {
                        return A04(preceding, i);
                    }
                }
                C18070vi.A11("impl");
                throw null;
            } while (i != -1);
            return null;
        }
        return null;
    }
}
