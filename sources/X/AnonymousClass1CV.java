package X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.1CV  reason: invalid class name */
public final class AnonymousClass1CV implements AnonymousClass1CU {
    public final AnonymousClass190 A00;
    public final AnonymousClass118 A01;
    public final AnonymousClass11O A02;
    public final AnonymousClass1CN A03;
    public final AnonymousClass1CP A04;
    public final AnonymousClass1CO A05;
    public final AnonymousClass1CT A06;
    public final C18030ve A07;

    public AnonymousClass1CV(AnonymousClass190 r2, AnonymousClass118 r3, AnonymousClass11O r4, AnonymousClass1CN r5, AnonymousClass1CP r6, AnonymousClass1CO r7, AnonymousClass1CT r8, C18030ve r9) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r4, 6);
        this.A07 = r9;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
        this.A02 = r4;
        this.A06 = r8;
        this.A03 = r5;
    }

    public /* bridge */ /* synthetic */ C22591Cl CCq(Set set) {
        Set set2 = set;
        C18070vi.A0d(set, 0);
        C22541Cg r3 = new C22541Cg();
        r3.A02 = this.A02.A00.getBoolean("force_db_check", false);
        C18030ve r2 = this.A07;
        C18040vf r1 = C18040vf.A02;
        r3.A03 = C18020vd.A05(r1, r2, 6482);
        r3.A00 = C18020vd.A05(r1, r2, 6136);
        r3.A01 = C18020vd.A05(r1, r2, 7142);
        r2.A0G(11854);
        C22551Ch r5 = new C22551Ch(r3);
        Context context = this.A03.A00.A00;
        C18070vi.A0X(context);
        File databasePath = context.getDatabasePath("msgstore.db");
        C18070vi.A0b(databasePath);
        Context context2 = this.A01.A00;
        AnonymousClass190 r32 = this.A00;
        AnonymousClass1CO r7 = this.A05;
        return new C22601Cm(context2, r32, new C22561Ci("msgstore.db"), r5, this.A04, r7, this.A06, databasePath, set2);
    }
}
