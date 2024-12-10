package X;

import java.util.Map;
import java.util.Set;

/* renamed from: X.Cu0  reason: case insensitive filesystem */
public abstract class C26180Cu0 {
    public static final Map A00;
    public static final Map A01 = AnonymousClass1D7.A0B(AnonymousClass1D6.A01("👍", C0L.A0f), AnonymousClass1D6.A01("🔥", C0L.A0L), AnonymousClass1D6.A01("😭", C0L.A0F), AnonymousClass1D6.A01("😡", C0L.A0H), AnonymousClass1D6.A01("🤦", C0L.A0K), AnonymousClass1D6.A01("🙏", C0L.A0M), AnonymousClass1D6.A01("👏", C0L.A0E), AnonymousClass1D6.A01("😬", C0L.A0N), AnonymousClass1D6.A01("😅", C0L.A0O), AnonymousClass1D6.A01("🪇", C0L.A0T), AnonymousClass1D6.A01("🥳", C0L.A0U), AnonymousClass1D6.A01("🎉", C0L.A0V), AnonymousClass1D6.A01("😔", C0L.A0W), AnonymousClass1D6.A01("🙌", C0L.A0X), AnonymousClass1D6.A01("😢", C0L.A0Y), AnonymousClass1D6.A01("🥰", C0L.A0Z), AnonymousClass1D6.A01("😮", C0L.A0e), AnonymousClass1D6.A01("👋", C0L.A0i), AnonymousClass1D6.A01("💔", C0L.A0D), AnonymousClass1D6.A01("🎲", C0L.A0G));
    public static final Map A02;
    public static final Set A03;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = X.AnonymousClass72X.A00(r8);
        r2 = X.C18040vf.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C18030ve r6, X.C25461Oh r7, java.lang.String r8) {
        /*
            r5 = 0
            r4 = 0
            if (r8 == 0) goto L_0x0043
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0043
            boolean r0 = X.AnonymousClass72X.A02(r8)
            if (r0 == 0) goto L_0x0043
            java.lang.String r3 = X.AnonymousClass72X.A00(r8)
            r0 = 11066(0x2b3a, float:1.5507E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r2, r6, r0)
            r0 = 12495(0x30cf, float:1.7509E-41)
            boolean r0 = X.C18020vd.A05(r2, r6, r0)
            X.C0L r1 = A00(r3, r0, r1)
            if (r1 == 0) goto L_0x0038
            r0 = 9757(0x261d, float:1.3672E-41)
            boolean r0 = X.C18020vd.A05(r2, r6, r0)
            if (r0 != 0) goto L_0x0039
            java.util.Set r0 = A03
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            return r5
        L_0x0039:
            java.lang.String r0 = r1.id
            int r1 = r7.A01(r0)
            r0 = 3
            if (r1 != r0) goto L_0x0043
            r4 = 1
        L_0x0043:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26180Cu0.A01(X.0ve, X.1Oh, java.lang.String):boolean");
    }

    static {
        AnonymousClass1D6[] r15 = new AnonymousClass1D6[7];
        AnonymousClass1D6.A03("💯", C0L.A0S, r15, 0);
        AnonymousClass1D6.A03("✨", C0L.A0d, r15, 1);
        AnonymousClass1D6.A03("😎", C0L.A0b, r15, 2);
        AnonymousClass1D6.A03("❤", C0L.A0Q, r15, 3);
        AnonymousClass1D6.A03("😉", C0L.A0k, r15, 4);
        AnonymousClass1D6.A03("💕", C0L.A0h, r15, 5);
        AnonymousClass1D6.A03("😘", C0L.A0J, r15, 6);
        A02 = AnonymousClass1D7.A0B(r15);
        AnonymousClass1D6[] r152 = new AnonymousClass1D6[7];
        AnonymousClass1D6.A03("💯", C0L.A0R, r152, 0);
        AnonymousClass1D6.A03("✨", C0L.A0c, r152, 1);
        AnonymousClass1D6.A03("😎", C0L.A0a, r152, 2);
        AnonymousClass1D6.A03("❤", C0L.A0P, r152, 3);
        AnonymousClass1D6.A03("😉", C0L.A0j, r152, 4);
        r152[5] = AnonymousClass1D6.A01("💕", C0L.A0g);
        AnonymousClass1D6.A03("😘", C0L.A0I, r152, 6);
        A00 = AnonymousClass1D7.A0B(r152);
        String[] A1b = C17880vN.A1b("💯", "✨", 7, 1);
        A1b[2] = "😎";
        A1b[3] = "❤";
        A1b[4] = "😉";
        A03 = BE8.A0r("💕", "😘", A1b, 5, 6);
    }

    public static final C0L A00(String str, boolean z, boolean z2) {
        Map map;
        if (z && A03.contains(str)) {
            map = A00;
        } else if (!z2 || !A03.contains(str)) {
            map = A01;
        } else {
            map = A02;
        }
        return (C0L) map.get(str);
    }

    public static final boolean A02(C18030ve r4, C25461Oh r5, String str) {
        boolean A16 = C18070vi.A16(r4, r5);
        if (str == null || str.length() == 0 || !AnonymousClass72X.A02(str)) {
            return false;
        }
        C18040vf r1 = C18040vf.A02;
        if (C36301nf.A02(r4, r1, 9083)) {
            return A16;
        }
        if (!C36301nf.A02(r4, r1, 3575) || !A01(r4, r5, str)) {
            return false;
        }
        return true;
    }

    public static final boolean A03(C18030ve r4, AnonymousClass206 r5) {
        String A0P;
        boolean A15 = C18070vi.A15(r4, r5);
        if (!(r5 instanceof AnonymousClass210) || (A0P = r5.A0P()) == null) {
            return A15;
        }
        C18040vf r1 = C18040vf.A02;
        if ((C36301nf.A02(r4, r1, 3575) || C36301nf.A02(r4, r1, 9083)) && AnonymousClass72X.A02(A0P)) {
            return true;
        }
        return false;
    }
}
