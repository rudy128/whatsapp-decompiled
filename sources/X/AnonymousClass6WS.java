package X;

import java.util.List;

/* renamed from: X.6WS  reason: invalid class name */
public abstract class AnonymousClass6WS {
    public static final AnonymousClass709 A00(String str) {
        List A0S = AnonymousClass1YF.A0S(str, new String[]{","}, 0);
        if (A0S.size() == 7) {
            int parseInt = Integer.parseInt(C17880vN.A0w(A0S, 0));
            int parseInt2 = Integer.parseInt(C17880vN.A0w(A0S, 1));
            int parseInt3 = Integer.parseInt(C17880vN.A0w(A0S, 2));
            int parseInt4 = Integer.parseInt(C17880vN.A0w(A0S, 3));
            int parseInt5 = Integer.parseInt(C17880vN.A0w(A0S, 4));
            int parseInt6 = Integer.parseInt(C17880vN.A0w(A0S, 5));
            int parseInt7 = Integer.parseInt(C17880vN.A0w(A0S, 6));
            C18460wS r1 = C18460wS.A00;
            AnonymousClass709 r0 = new AnonymousClass709(r1, r1);
            r0.A03 = parseInt;
            r0.A01 = parseInt2;
            r0.A02 = parseInt3;
            r0.A00 = parseInt4;
            r0.A06 = parseInt5;
            r0.A04 = parseInt6;
            r0.A05 = parseInt7;
            return r0;
        }
        throw AnonymousClass000.A0k("Failed requirement.");
    }
}
