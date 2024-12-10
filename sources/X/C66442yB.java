package X;

/* renamed from: X.2yB  reason: invalid class name and case insensitive filesystem */
public class C66442yB implements C22427B7j {
    public final int A00;
    public final Object A01;

    public C66442yB(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public AP5 BH0(C22428B7k b7k, C22429B7l b7l, C22430B7m b7m, C22431B7n b7n, A36 a36, C20531AOq aOq, C22553BCk bCk, C22495BAc bAc, int i) {
        AnonymousClass1XN r5;
        C198469yO r4;
        AnonymousClass9X1 r3;
        C185699d0 r11;
        C199299zl r12;
        C184169aW r10;
        C186559eO r7;
        AnonymousClass118 r9;
        AnonymousClass1XN r2;
        C20653ATl A0L;
        int i2 = this.A00;
        Object obj = this.A01;
        if (i2 != 0) {
            C37391pS r1 = (C37391pS) obj;
            AnonymousClass10G r72 = r1.A00.A00;
            r5 = (AnonymousClass1XN) r72.A0d.get();
            C37381pR r6 = r1.A01;
            AnonymousClass10E r8 = r6.A7C;
            AnonymousClass10G A11 = r8.A00;
            r4 = new C198469yO((C199299zl) A11.A1Q.get(), (AnonymousClass1XN) A11.A0d.get());
            r3 = new AnonymousClass9X1((C18000vb) r8.ABz.get());
            r11 = (C185699d0) r72.A1P.get();
            r12 = (C199299zl) r72.A1Q.get();
            AnonymousClass10G A112 = r8.A00;
            r10 = new C184169aW((C20041A4k) A112.A8v.get(), (C199299zl) A112.A1Q.get());
            r7 = new C186559eO(C37381pR.A0U(r6), (AnonymousClass118) r8.ABY.get(), (AnonymousClass1XN) r8.A00.A0d.get());
            r9 = (AnonymousClass118) r8.ABY.get();
            r2 = (AnonymousClass1XN) r8.A00.A0d.get();
            A0L = C37381pR.A0U(r6);
        } else {
            AnonymousClass1K2 r13 = (AnonymousClass1K2) obj;
            AnonymousClass10G r73 = r13.A01.A00;
            r5 = (AnonymousClass1XN) r73.A0d.get();
            AnonymousClass1K1 r62 = r13.A00;
            AnonymousClass10E r82 = r62.AAQ;
            AnonymousClass10G A113 = r82.A00;
            r4 = new C198469yO((C199299zl) A113.A1Q.get(), (AnonymousClass1XN) A113.A0d.get());
            r3 = new AnonymousClass9X1((C18000vb) r82.ABz.get());
            r11 = (C185699d0) r73.A1P.get();
            r12 = (C199299zl) r73.A1Q.get();
            AnonymousClass10G A114 = r82.A00;
            r10 = new C184169aW((C20041A4k) A114.A8v.get(), (C199299zl) A114.A1Q.get());
            r7 = new C186559eO(AnonymousClass1K1.A0L(r62), (AnonymousClass118) r82.ABY.get(), (AnonymousClass1XN) r82.A00.A0d.get());
            r9 = (AnonymousClass118) r82.ABY.get();
            r2 = (AnonymousClass1XN) r82.A00.A0d.get();
            A0L = AnonymousClass1K1.A0L(r62);
        }
        AnonymousClass1XN r25 = r5;
        AnonymousClass9X1 r20 = r3;
        return new AP5(r10, r11, r12, b7k, b7l, b7m, b7n, r4, r7, new C185729d3(A0L, r9, r2), r20, a36, aOq, bCk, bAc, r25, i);
    }
}
