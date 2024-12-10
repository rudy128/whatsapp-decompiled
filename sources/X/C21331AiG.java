package X;

import java.io.Closeable;

/* renamed from: X.AiG  reason: case insensitive filesystem */
public final class C21331AiG implements Closeable {
    public final AnonymousClass9HQ A00;
    public final AnonymousClass9HQ A01;
    public final AnonymousClass9HQ A02;
    public final /* synthetic */ AnonymousClass1SR A03;

    public C21331AiG(AnonymousClass9HQ r1, AnonymousClass9HQ r2, AnonymousClass9HQ r3, AnonymousClass1SR r4) {
        this.A03 = r4;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }

    public C186809en A00() {
        String A002;
        AnonymousClass1SR r4 = this.A03;
        String A003 = this.A02.A00();
        String A004 = this.A00.A00();
        AnonymousClass9HQ r0 = this.A01;
        if (r0 == null) {
            A002 = null;
        } else {
            A002 = r0.A00();
        }
        return new C186809en(r4, A003, A004, A002);
    }

    public void close() {
        AnonymousClass1EY.A02(this.A00);
        AnonymousClass1EY.A02(this.A02);
        AnonymousClass1EY.A02(this.A01);
    }
}
