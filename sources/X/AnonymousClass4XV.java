package X;

import java.util.Set;

/* renamed from: X.4XV  reason: invalid class name */
public final class AnonymousClass4XV {
    public final AnonymousClass4KV A00;
    public final AnonymousClass4KW A01;
    public final AnonymousClass4KX A02;
    public final AnonymousClass4KY A03;
    public final AnonymousClass4KZ A04;
    public final C84574Ka A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;

    public final boolean A01(int i) {
        C18030ve r2;
        int i2;
        Integer[] numArr = new Integer[3];
        AnonymousClass000.A1L(numArr, 45);
        AnonymousClass000.A1M(numArr, 47);
        AnonymousClass3Ma.A1S(numArr, 46);
        Set A0S = C200410p.A0S(numArr);
        Integer valueOf = Integer.valueOf(i);
        if (A0S.contains(valueOf)) {
            r2 = this.A06;
            i2 = 11610;
        } else if (C83604Fy.A00().contains(valueOf)) {
            r2 = this.A06;
            i2 = 12111;
        } else if (i == 25) {
            r2 = this.A06;
            i2 = 10467;
        } else if (i != 4) {
            return false;
        } else {
            C18030ve r5 = this.A06;
            C18040vf r22 = C18040vf.A02;
            if ((C18020vd.A00(r22, r5, 11853) & (1 << 0)) == 0 && (C18020vd.A00(r22, r5, 11853) & (1 << 1)) == 0) {
                return false;
            }
            return true;
        }
        return C18020vd.A05(C18040vf.A02, r2, i2);
    }

    public static final C178119Bw A00(AnonymousClass4XV r1, C89444cT r2, int i) {
        if (r2 == null || !r1.A01(i)) {
            return null;
        }
        return ((AnonymousClass1TD) r1.A07.get()).A07(r2);
    }

    public AnonymousClass4XV(AnonymousClass4KV r1, AnonymousClass4KW r2, AnonymousClass4KX r3, AnonymousClass4KY r4, AnonymousClass4KZ r5, C84574Ka r6, C18030ve r7, AnonymousClass00H r8) {
        C18070vi.A0w(r7, r8, r1, r2, r3);
        C18070vi.A0q(r4, r5, r6);
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
