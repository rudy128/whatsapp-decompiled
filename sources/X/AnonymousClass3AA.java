package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.3AA  reason: invalid class name */
public final class AnonymousClass3AA implements C72303Lk {
    public final C26811To A00;
    public final AnonymousClass1TZ A01;
    public final C41911xI A02;
    public final AnonymousClass1S3 A03;

    public /* synthetic */ void Bld() {
    }

    public void Blc() {
        Cursor A0A;
        C169798mu r1;
        C20126A8l A012;
        Log.i("SyncdAsyncAppUpdatedObserver/onAsyncAppUpdated");
        C26811To r3 = this.A00;
        if (r3.A0T()) {
            this.A01.A00();
            AnonymousClass1S3 r2 = this.A03;
            synchronized (r2) {
                C26331Rs r6 = r2.A01;
                ArrayList A13 = AnonymousClass000.A13();
                C28781at A05 = r6.A00.get();
                try {
                    A0A = ((C28801av) A05).A02.A0A("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES", (String[]) null);
                    while (A0A.moveToNext()) {
                        String A0S = C17890vO.A0S(A0A, "mutation_index");
                        C18070vi.A0d(A0S, 0);
                        if ((!AnonymousClass2T1.A00(A4M.A00(A0S))) && (A012 = C26331Rs.A01(A0A, r6)) != null) {
                            A13.add(A012);
                        }
                    }
                    A0A.close();
                    A05.close();
                    Iterator it = A13.iterator();
                    while (it.hasNext()) {
                        r2.A05((C20126A8l) it.next());
                    }
                } catch (Throwable th) {
                    try {
                        A05.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
            r3.A0G();
            C41911xI r12 = this.A02;
            C26811To r22 = r12.A01;
            if (r22.A0T() && !r12.A00.A0N() && (r1 = (C169798mu) ((C58862lN) r12.A02.get()).A00("primary_version")) != null) {
                r22.A0N(Collections.singleton(r1.A0K("current")));
            }
            r3.A0I();
            return;
        }
        return;
        throw th;
    }

    public AnonymousClass3AA(C26811To r1, AnonymousClass1TZ r2, C41911xI r3, AnonymousClass1S3 r4) {
        C18070vi.A0s(r1, r4, r3, r2);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
