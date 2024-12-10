package X;

import android.app.Application;
import android.os.Bundle;

/* renamed from: X.8Eu  reason: invalid class name */
public final class AnonymousClass8Eu extends AnonymousClass287 {
    public final int A00;
    public final AnonymousClass9VK A01;
    public final String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8Eu(Bundle bundle, AnonymousClass1FE r3, AnonymousClass9VK r4, String str, int i) {
        super(bundle, r3);
        C18070vi.A0g(str, 3, r4);
        this.A00 = i;
        this.A02 = str;
        this.A01 = r4;
    }

    public AnonymousClass1J2 A01(C37361pP r16) {
        AnonymousClass9VK r0 = this.A01;
        int i = this.A00;
        String str = this.A02;
        C36251na r2 = r0.A00;
        AnonymousClass10E r1 = r2.A02;
        C18030ve A8r = AnonymousClass10E.A8r(r1);
        Application A002 = AnonymousClass0YX.A00(r1.Ao9);
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r1);
        AnonymousClass10G r12 = r1.A00;
        return new AnonymousClass8F9(A002, r16, (AnonymousClass9VL) r2.A01.A0F.get(), (C189319it) r12.A1l.get(), A12, (AnonymousClass0I4) r12.A0a.get(), AnonymousClass10G.A2k(r12), AnonymousClass1K1.A0J(r2.A00), A8r, (A17) r12.A0Z.get(), str, i);
    }
}
