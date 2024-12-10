package X;

import android.util.Pair;
import java.util.Stack;

/* renamed from: X.712  reason: invalid class name */
public abstract class AnonymousClass712 {
    public static final C138866xp A00;
    public static final C138866xp A01;
    public static final C138866xp A02;

    static {
        C138866xp r3 = new C138866xp("({[", ")}]");
        A02 = r3;
        C138866xp r2 = new C138866xp("*~_", "*~_");
        A00 = r2;
        C138866xp[] r1 = new C138866xp[2];
        AnonymousClass001.A1Q(r3, r2, r1);
        A01 = new C138866xp(r1);
    }

    public static boolean A01(Pair pair, CharSequence charSequence) {
        C138866xp r5 = A02;
        Stack stack = new Stack();
        for (int A012 = C108965cb.A01(pair); A012 < C108965cb.A00(pair); A012++) {
            char charAt = charSequence.charAt(A012);
            String valueOf = String.valueOf(charAt);
            if ("({[".contains(valueOf)) {
                stack.push(Character.valueOf(charAt));
            } else if (!")}]".contains(valueOf)) {
                continue;
            } else if (stack.empty() || !r5.A00(((Character) stack.peek()).charValue(), charAt)) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }

    public static Pair A00(Pair pair, C138866xp r6, CharSequence charSequence) {
        char c;
        Object valueOf;
        Object obj;
        int A012 = C108965cb.A01(pair);
        char c2 = 0;
        if (A012 != 0) {
            c = charSequence.charAt(A012 - 1);
        } else {
            c = 0;
        }
        if (C108965cb.A00(pair) != charSequence.length()) {
            c2 = charSequence.charAt(C108965cb.A00(pair));
        }
        char charAt = charSequence.charAt(C108965cb.A01(pair));
        char charAt2 = charSequence.charAt(C108965cb.A00(pair) - 1);
        if (!r6.A00(c, c2)) {
            if (r6.A00(c, charAt2)) {
                valueOf = pair.first;
            } else if (r6.A00(charAt, c2)) {
                valueOf = Integer.valueOf(C108965cb.A01(pair) + 1);
                obj = pair.second;
                return C108945cZ.A0N(valueOf, obj);
            } else if (r6.A00(charAt, charAt2)) {
                valueOf = Integer.valueOf(C108965cb.A01(pair) + 1);
            }
            obj = Integer.valueOf(C108965cb.A00(pair) - 1);
            return C108945cZ.A0N(valueOf, obj);
        }
        return pair;
    }
}
