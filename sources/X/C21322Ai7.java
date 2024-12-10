package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Ai7  reason: case insensitive filesystem */
public final class C21322Ai7 implements AnonymousClass3LU {
    public final AnonymousClass190 A00;
    public final C18030ve A01;
    public final AnonymousClass10I A02;
    public final ConcurrentHashMap A03 = AnonymousClass8BR.A17();
    public final C18100vl A04 = AnonymousClass1DF.A01(new C21524AlX(this, 8));
    public final C18100vl A05 = AnonymousClass1DF.A01(new C21524AlX(this, 9));
    public final AnonymousClass18K A06;

    public void CAd(String str, long j) {
        if (j >= C72453Mb.A0K(this.A05)) {
            C22681Cu r1 = new C22681Cu();
            r1.A02 = "work-manager-worker-duration";
            r1.A00 = Long.valueOf(j);
            r1.A01 = str;
            this.A06.CC7(r1);
        }
    }

    public C21322Ai7(AnonymousClass190 r3, C18030ve r4, AnonymousClass18K r5, AnonymousClass10I r6) {
        C18070vi.A0s(r4, r3, r6, r5);
        this.A01 = r4;
        this.A00 = r3;
        this.A02 = r6;
        this.A06 = r5;
        Boolean bool = C17960vV.A01;
    }
}
