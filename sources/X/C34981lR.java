package X;

/* renamed from: X.1lR  reason: invalid class name and case insensitive filesystem */
public final class C34981lR {
    public C34991lS A00;
    public AnonymousClass10I A01;

    public final void A00(AnonymousClass705 r6, AnonymousClass3LQ r7, AnonymousClass67A r8, Runnable runnable) {
        String str;
        C18070vi.A0d(r8, 0);
        int i = 1;
        C18070vi.A0d(r6, 1);
        C34991lS r1 = this.A00;
        if (r1 != null) {
            AnonymousClass732 A002 = r1.A00(C35011lV.A00);
            if (A002 != null) {
                Object A003 = r8.A00();
                C17960vV.A07(A003);
                C18070vi.A0X(A003);
                i = ((Number) A003).intValue();
                if (i != 190) {
                    if (i != 3489014) {
                        switch (i) {
                            case 3489017:
                                break;
                            case 3489018:
                                if (r6.A04()) {
                                    C34991lS r2 = this.A00;
                                    if (r2 != null) {
                                        r2.A01(A002, new AnonymousClass7GT(runnable, r7, 5), r6);
                                        return;
                                    }
                                }
                                break;
                        }
                    } else {
                        Long A012 = r6.A01();
                        if (A012 != null) {
                            AnonymousClass10I r22 = this.A01;
                            if (r22 != null) {
                                r22.CGv(runnable, A012.longValue());
                                return;
                            }
                            str = "waWorkers";
                            C18070vi.A11(str);
                            throw null;
                        }
                    }
                }
                if (r6.A04()) {
                    C34991lS r23 = this.A00;
                    if (r23 != null) {
                        r23.A02(A002, new AnonymousClass7GU(runnable, i, 1, r7), r6);
                        return;
                    }
                }
            }
            r7.onError(i);
            return;
        }
        str = "fbUserEntityManagement";
        C18070vi.A11(str);
        throw null;
    }
}
