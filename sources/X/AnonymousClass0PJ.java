package X;

import java.text.BreakIterator;

/* renamed from: X.0PJ  reason: invalid class name */
public final class AnonymousClass0PJ {
    public static final C17020tb A00 = new AnonymousClass0VN(3);
    public static final C17020tb A01 = new AnonymousClass0VN(0);
    public static final C17020tb A02 = new AnonymousClass0VN(2);
    public static final C17020tb A03 = new AnonymousClass0VN(1);
    public static final /* synthetic */ AnonymousClass0PJ A04 = new Object();

    public static final AnonymousClass0Jq A01(C16260ry r11) {
        AnonymousClass0OV r1;
        C04620Oc r6;
        AnonymousClass0OV A022;
        AnonymousClass0OV r2;
        AnonymousClass0OV r3;
        boolean z;
        AnonymousClass0OV r12;
        boolean z2;
        int i;
        AnonymousClass0VO r0 = (AnonymousClass0VO) r11;
        AnonymousClass0Jq r8 = r0.A01;
        if (r8 == null) {
            return A03.BBt(r11);
        }
        boolean z3 = r0.A02;
        if (z3) {
            r1 = r8.A01;
            r6 = r0.A00;
            A022 = C04750Oq.A02(r6, r1, r11);
            r3 = r8.A00;
            r2 = A022;
        } else {
            r1 = r8.A00;
            r6 = r0.A00;
            A022 = C04750Oq.A02(r6, r1, r11);
            r2 = r8.A01;
            r3 = A022;
        }
        if (C18070vi.A18(A022, r1)) {
            return r8;
        }
        Integer BPk = r11.BPk();
        if (BPk == AnonymousClass00R.A00 || (BPk == AnonymousClass00R.A0C && r2.A00 > r3.A00)) {
            z = true;
        } else {
            z = false;
        }
        AnonymousClass0Jq r5 = new AnonymousClass0Jq(r2, r3, z);
        AnonymousClass0OV r4 = r5.A01;
        long j = r4.A01;
        AnonymousClass0OV r10 = r5.A00;
        AnonymousClass0OV r9 = r10;
        if (j != r10.A01) {
            boolean z4 = r5.A02;
            AnonymousClass0OV r02 = r10;
            if (z4) {
                r02 = r4;
            }
            if (r02.A00 != 0) {
                return r5;
            }
            if (!z4) {
                r10 = r4;
            }
            if (r6.A04().length() != r10.A00) {
                return r5;
            }
        } else if (r4.A00 != r10.A00) {
            return r5;
        }
        String A042 = r6.A04();
        int length = A042.length();
        if (length == 0) {
            return r5;
        }
        int i2 = r6.A02;
        boolean z5 = false;
        if (i2 == 0) {
            BreakIterator characterInstance = BreakIterator.getCharacterInstance();
            characterInstance.setText(A042);
            int following = characterInstance.following(0);
            if (z3) {
                return new AnonymousClass0Jq(A00(r6, r4, following), r9, true);
            }
            r12 = A00(r6, r9, following);
            z2 = false;
        } else {
            if (i2 == length) {
                BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                characterInstance2.setText(A042);
                i = characterInstance2.preceding(length);
                if (!z3) {
                    r12 = A00(r6, r9, i);
                    z2 = true;
                }
            } else {
                z5 = AnonymousClass000.A1T(r8.A02 ? 1 : 0, 1);
                boolean z6 = z3 ^ z5;
                BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                if (z6) {
                    characterInstance3.setText(A042);
                    i = characterInstance3.preceding(i2);
                } else {
                    characterInstance3.setText(A042);
                    i = characterInstance3.following(i2);
                }
                if (!z3) {
                    return new AnonymousClass0Jq(r4, A00(r6, r9, i), z5);
                }
            }
            return new AnonymousClass0Jq(A00(r6, r4, i), r9, z5);
        }
        return new AnonymousClass0Jq(r4, r12, z2);
    }

    public static final AnonymousClass0OV A00(C04620Oc r0, AnonymousClass0OV r1, int i) {
        return AnonymousClass0OV.A01(r0.A03().A0P(i), i, r1.A01);
    }
}
