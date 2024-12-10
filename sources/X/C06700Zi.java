package X;

import java.util.Comparator;

/* renamed from: X.0Zi  reason: invalid class name and case insensitive filesystem */
public final class C06700Zi implements Comparator {
    public static final C06700Zi A00 = new Object();

    /* renamed from: A00 */
    public int compare(C015408x r8, C015408x r9) {
        if (r8 == null) {
            throw AnonymousClass000.A0k("compare requires non-null focus targets");
        } else if (r9 != null) {
            boolean A03 = C04800Ox.A03(r8);
            int i = 0;
            boolean A032 = C04800Ox.A03(r9);
            if (A03) {
                if (!A032) {
                    return -1;
                }
                AnonymousClass0XV A033 = AnonymousClass0QV.A03(r8);
                AnonymousClass0XV A034 = AnonymousClass0QV.A03(r9);
                if (!C18070vi.A18(A033, A034)) {
                    C06970a9 A02 = C06970a9.A02(new AnonymousClass0XV[16]);
                    while (A033 != null) {
                        A02.A0B(0, A033);
                        A033 = A033.A0I();
                    }
                    C06970a9 A022 = C06970a9.A02(new AnonymousClass0XV[16]);
                    while (A034 != null) {
                        A022.A0B(0, A034);
                        A034 = A034.A0I();
                    }
                    int min = Math.min(A02.A00 - 1, A022.A00 - 1);
                    if (min >= 0) {
                        while (C18070vi.A18(A02.A01[i], A022.A01[i])) {
                            if (i != min) {
                                i++;
                            }
                        }
                        return C18070vi.A00(((AnonymousClass0XV) A02.A01[i]).A0Q.A0G.A02, ((AnonymousClass0XV) A022.A01[i]).A0Q.A0G.A02);
                    }
                    throw AnonymousClass000.A0n("Could not find a common ancestor between the two FocusModifiers.");
                }
            } else if (A032) {
                return 1;
            }
            return 0;
        } else {
            throw AnonymousClass000.A0k("compare requires non-null focus targets");
        }
    }
}
