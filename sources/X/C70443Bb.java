package X;

import java.io.Serializable;

/* renamed from: X.3Bb  reason: invalid class name and case insensitive filesystem */
public final class C70443Bb implements Serializable {
    public static final long serialVersionUID = 0;
    public final C18560wh[] elements;

    private final Object readResolve() {
        C18560wh[] r4 = this.elements;
        C18560wh r3 = AnonymousClass1OR.A00;
        for (C18560wh plus : r4) {
            r3 = r3.plus(plus);
        }
        return r3;
    }

    public C70443Bb(C18560wh[] r1) {
        this.elements = r1;
    }
}
