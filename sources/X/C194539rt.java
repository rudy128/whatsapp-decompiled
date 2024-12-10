package X;

import java.util.Collection;
import java.util.Map;
import java.util.Stack;

/* renamed from: X.9rt  reason: invalid class name and case insensitive filesystem */
public final class C194539rt {
    public final Map A00 = C17880vN.A13();
    public final Stack A01 = new Stack();
    public final Stack A02 = new Stack();

    public final boolean A01(String str) {
        C18070vi.A0d(str, 0);
        Stack<C193989qz> stack = this.A01;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            for (C193989qz r0 : stack) {
                if (C18070vi.A18(r0.A01, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A02(String str) {
        C18070vi.A0d(str, 0);
        Stack<C193989qz> stack = this.A02;
        if (!(stack instanceof Collection) || !stack.isEmpty()) {
            for (C193989qz r0 : stack) {
                if (C18070vi.A18(r0.A01, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final C193989qz A00() {
        Object peek;
        Stack stack = this.A02;
        if (!stack.isEmpty()) {
            peek = stack.peek();
        } else {
            peek = this.A01.peek();
        }
        C18070vi.A0X(peek);
        return (C193989qz) peek;
    }
}
