package X;

/* renamed from: X.8JG  reason: invalid class name */
public abstract class AnonymousClass8JG extends C19955A0m {
    public final void A03(Object obj) {
        String str;
        AnonymousClass3EW r0;
        BDc A01 = A01();
        try {
            switch (((AnonymousClass8JE) this).A00) {
                case 0:
                    AnonymousClass9ZV r5 = (AnonymousClass9ZV) obj;
                    A01.BDB(1, r5.A01);
                    str = r5.A00;
                    break;
                case 1:
                    C193269po r52 = (C193269po) obj;
                    A01.BDB(1, r52.A01);
                    Long l = r52.A00;
                    if (l != null) {
                        A01.BD9(2, l.longValue());
                        break;
                    } else {
                        A01.BDA(2);
                        break;
                    }
                case 2:
                    C194169rH r53 = (C194169rH) obj;
                    A01.BDB(1, r53.A02);
                    A01.BD9(2, (long) r53.A00);
                    A01.BD9(3, (long) r53.A01);
                    break;
                case 3:
                    AnonymousClass9ZW r54 = (AnonymousClass9ZW) obj;
                    A01.BDB(1, r54.A00);
                    str = r54.A01;
                    break;
                case 4:
                    AnonymousClass9ZX r55 = (AnonymousClass9ZX) obj;
                    A01.BDB(1, r55.A01);
                    byte[] A012 = A6Y.A01(r55.A00);
                    if (A012 != null) {
                        A01.BD5(2, A012);
                        break;
                    } else {
                        A01.BDA(2);
                        break;
                    }
                case 5:
                    A2t a2t = (A2t) obj;
                    C20137A8y.A0B(A01, a2t, a2t.A0M);
                    byte[] A013 = A6Y.A01(a2t.A0D);
                    if (A013 == null) {
                        A01.BDA(6);
                    } else {
                        A01.BD5(6, A013);
                    }
                    int A014 = AnonymousClass8BY.A01(A01, a2t);
                    int i = 1;
                    if (A014 == 0) {
                        i = 0;
                    } else if (A014 != 1) {
                        r0 = AnonymousClass3MW.A14();
                        throw r0;
                    }
                    int A02 = AnonymousClass8BY.A02(A01, a2t, i);
                    int i2 = 1;
                    if (A02 == 0) {
                        i2 = 0;
                    } else if (A02 != 1) {
                        r0 = AnonymousClass3MW.A14();
                        throw r0;
                    }
                    C20137A8y.A0A(A01, a2t, i2);
                    break;
                default:
                    AnonymousClass9ZY r56 = (AnonymousClass9ZY) obj;
                    A01.BDB(1, r56.A00);
                    str = r56.A01;
                    break;
            }
            A01.BDB(2, str);
            ((C162128Jb) A01).A00.executeInsert();
        } finally {
            A02(A01);
        }
    }
}
