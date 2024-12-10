package X;

import java.util.concurrent.Executor;

/* renamed from: X.AlA  reason: case insensitive filesystem */
public final class C21501AlA implements Executor {
    public final C200710s A00;

    public C21501AlA(AnonymousClass10I r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = new C200710s(r3, true);
    }

    public void execute(Runnable runnable) {
        C18070vi.A0d(runnable, 0);
        this.A00.execute(runnable);
    }
}
