package X;

import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.Set;

/* renamed from: X.Aj7  reason: case insensitive filesystem */
public final /* synthetic */ class C21378Aj7 implements Runnable {
    public final /* synthetic */ WorkDatabase A00;
    public final /* synthetic */ A2t A01;
    public final /* synthetic */ A2t A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ Set A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: finally extract failed */
    public final void run() {
        AnonymousClass8JH r8;
        BDc A012;
        AnonymousClass3EW r0;
        WorkDatabase workDatabase = this.A00;
        A2t a2t = this.A01;
        A2t a2t2 = this.A02;
        List list = this.A04;
        String str = this.A03;
        Set set = this.A05;
        boolean z = this.A06;
        BD8 A0E = workDatabase.A0E();
        BA4 A0F = workDatabase.A0F();
        Integer num = a2t.A0G;
        int i = a2t.A02;
        long j = a2t.A07;
        int i2 = a2t.A0K + 1;
        int i3 = a2t.A01;
        long j2 = a2t.A09;
        int i4 = a2t.A00;
        String str2 = a2t2.A0M;
        String str3 = a2t2.A0I;
        String str4 = a2t2.A0H;
        A6Y a6y = a2t2.A0C;
        A6Y a6y2 = a2t2.A0D;
        long j3 = a2t2.A05;
        long j4 = a2t2.A06;
        long j5 = a2t2.A04;
        C20078A6e a6e = a2t2.A0B;
        Integer num2 = a2t2.A0E;
        long j6 = a2t2.A03;
        long j7 = a2t2.A08;
        long j8 = a2t2.A0A;
        boolean z2 = a2t2.A0J;
        A2t a2t3 = new A2t(a6e, a6y, a6y2, num, num2, a2t2.A0F, str2, str3, str4, i, i3, i2, i4, a2t2.A0L, j3, j4, j5, j6, j, j7, j8, j2, z2);
        if (a2t2.A00 == 1) {
            a2t3.A09 = a2t2.A09;
            a2t3.A00++;
        }
        A2t A002 = C196369uw.A00(a2t3, list);
        C20365AHv aHv = (C20365AHv) A0E;
        C20076A6c a6c = aHv.A02;
        a6c.A06();
        a6c.A07();
        try {
            r8 = aHv.A01;
            A012 = r8.A01();
            String str5 = A002.A0M;
            C20137A8y.A0B(A012, A002, str5);
            byte[] A013 = A6Y.A01(A002.A0D);
            if (A013 == null) {
                A012.BDA(6);
            } else {
                A012.BD5(6, A013);
            }
            int A014 = AnonymousClass8BY.A01(A012, A002);
            int i5 = 1;
            if (A014 == 0) {
                i5 = 0;
            } else if (A014 != 1) {
                r0 = AnonymousClass3MW.A14();
                throw r0;
            }
            int A022 = AnonymousClass8BY.A02(A012, A002, i5);
            int i6 = 1;
            if (A022 == 0) {
                i6 = 0;
            } else if (A022 != 1) {
                r0 = AnonymousClass3MW.A14();
                throw r0;
            }
            C20137A8y.A0A(A012, A002, i6);
            A012.BDB(31, str5);
            ((C162128Jb) A012).A00.executeUpdateDelete();
            r8.A02(A012);
            a6c.A08();
            C20076A6c.A02(a6c);
            C20366AHw aHw = (C20366AHw) A0F;
            C20076A6c a6c2 = aHw.A01;
            a6c2.A06();
            C19955A0m a0m = aHw.A02;
            BDc A015 = a0m.A01();
            A015.BDB(1, str);
            a6c2.A07();
            try {
                AHW.A00(a6c2, A015);
                C20076A6c.A02(a6c2);
                a0m.A02(A015);
                A0F.Bdf(str, set);
                if (!z) {
                    A0E.Biq(str, -1);
                    workDatabase.A0D().BIB(str);
                }
            } catch (Throwable th) {
                C20076A6c.A02(a6c2);
                a0m.A02(A015);
                throw th;
            }
        } catch (Throwable th2) {
            C20076A6c.A02(a6c);
            throw th2;
        }
    }

    public /* synthetic */ C21378Aj7(WorkDatabase workDatabase, A2t a2t, A2t a2t2, String str, List list, Set set, boolean z) {
        this.A00 = workDatabase;
        this.A01 = a2t;
        this.A02 = a2t2;
        this.A04 = list;
        this.A03 = str;
        this.A05 = set;
        this.A06 = z;
    }
}
