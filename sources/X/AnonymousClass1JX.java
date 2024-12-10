package X;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* renamed from: X.1JX  reason: invalid class name */
public abstract class AnonymousClass1JX extends AnonymousClass1JU {
    public Random A09() {
        if (this instanceof AnonymousClass1JY) {
            Object obj = ((AnonymousClass1JY) this).A00.get();
            C18070vi.A0X(obj);
            return (Random) obj;
        }
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C18070vi.A0X(current);
        return current;
    }
}
