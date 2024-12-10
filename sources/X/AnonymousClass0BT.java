package X;

import java.text.BreakIterator;

/* renamed from: X.0BT  reason: invalid class name */
public class AnonymousClass0BT extends C06140Xc {
    public static AnonymousClass0BT A01;
    public BreakIterator A00;

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
        int A012 = C06140Xc.A01(this);
        if (A012 > 0 && i < A012) {
            if (i < 0) {
                i = 0;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    break;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (!isBoundary) {
                    if (breakIterator2 == null) {
                        break;
                    }
                    i = breakIterator2.following(i);
                    if (i == -1) {
                        break;
                    }
                } else if (breakIterator2 != null) {
                    int following = breakIterator2.following(i);
                    if (following != -1) {
                        return A04(i, following);
                    }
                }
            }
            C18070vi.A11("impl");
            throw null;
        }
        return null;
    }

    public int[] CCD(int i) {
        int A012 = C06140Xc.A01(this);
        if (A012 > 0 && i > 0) {
            if (i > A012) {
                i = A012;
            }
            while (true) {
                BreakIterator breakIterator = this.A00;
                if (breakIterator == null) {
                    break;
                }
                boolean isBoundary = breakIterator.isBoundary(i);
                BreakIterator breakIterator2 = this.A00;
                if (!isBoundary) {
                    if (breakIterator2 == null) {
                        break;
                    }
                    i = breakIterator2.preceding(i);
                    if (i == -1) {
                        break;
                    }
                } else if (breakIterator2 != null) {
                    int preceding = breakIterator2.preceding(i);
                    if (preceding != -1) {
                        return A04(preceding, i);
                    }
                }
            }
            C18070vi.A11("impl");
            throw null;
        }
        return null;
    }
}
