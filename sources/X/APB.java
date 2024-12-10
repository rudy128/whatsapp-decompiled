package X;

import androidx.fragment.app.Fragment;

public class APB implements C107905ao {
    public AnonymousClass02n A00;
    public AnonymousClass02n A01;
    public AnonymousClass02n A02;
    public final Fragment A03;
    public final C20321AGd A04;
    public final C189999kC A05;
    public final APP A06;
    public final C173728vd A07;
    public final C219217x A08;
    public final C18030ve A09;
    public final AnonymousClass19T A0A;

    public void BxH() {
        C17880vN.A1F(AnonymousClass8BT.A05(this.A07.A03), "location_access_granted", true);
        if (this.A08.A06()) {
            this.A06.BxF();
        } else {
            AnonymousClass02n r2 = this.A02;
            C134126q5 A0J = AnonymousClass8BY.A0J(this.A03);
            A0J.A02 = 2131887138;
            r2.A02((C1406772n) null, A0J.A00());
        }
        this.A0A.markerPoint(207368785, "business_search_location_permission_accepted");
    }

    public void BxI() {
        this.A0A.markerPoint(207368785, "business_search_location_permission_denied");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.Object, X.02h] */
    /* JADX WARNING: type inference failed for: r2v4, types: [java.lang.Object, X.02h] */
    public APB(Fragment fragment, AnonymousClass1DS r16, C189999kC r17, C185739d4 r18, APP app, C173728vd r20, C219217x r21, C18030ve r22, C183279Xq r23, AnonymousClass19T r24) {
        this.A09 = r22;
        this.A03 = fragment;
        this.A08 = r21;
        this.A0A = r24;
        this.A05 = r17;
        this.A07 = r20;
        this.A06 = app;
        AnonymousClass16K r4 = (AnonymousClass16K) C221618v.A02(AnonymousClass16L.class);
        String A002 = C197659x3.A00(r23.A00);
        C21525AlY alY = new C21525AlY(r16, this, 1);
        C18070vi.A0d(r4, 0);
        AnonymousClass10E r1 = r18.A00.A00.A00;
        AnonymousClass1KB A12 = AnonymousClass10E.A12(r1);
        C18030ve A8r = AnonymousClass10E.A8r(r1);
        AnonymousClass118 A0l = AnonymousClass3MZ.A0l(r1);
        AnonymousClass10I AL1 = AnonymousClass10E.AL1(r1);
        C169248kb r2 = new C169248kb(A12, r4, (C187629g7) r1.A00.A1T.get(), AnonymousClass3Ma.A0a(r1), A0l, AnonymousClass3Ma.A0b(r1), AnonymousClass10E.A6Q(r1), A8r, AL1, A002, alY);
        this.A04 = r2;
        Fragment fragment2 = this.A03;
        fragment2.A0L.A05(r2);
        C20335AGr.A00(fragment2.A1G(), r2.A04, this, 34);
        Fragment fragment3 = this.A03;
        this.A02 = fragment3.CDw(new AGI((Object) this, 5), new Object());
        this.A01 = fragment3.CDw(new AGI((Object) this, 6), new Object());
        this.A00 = fragment3.CDw(new AGI((Object) this, 7), new Object());
    }
}
