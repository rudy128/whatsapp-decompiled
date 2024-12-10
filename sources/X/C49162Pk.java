package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Pk  reason: invalid class name and case insensitive filesystem */
public class C49162Pk extends A34 {
    public final /* synthetic */ C40971vb A00;

    public C49162Pk(C40971vb r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C89444cT r5;
        ArrayList A10;
        AnonymousClass1TD r3;
        C178119Bw A05;
        C40971vb r2 = this.A00;
        C40961va r7 = r2.A0C;
        Log.i("JoinableCallsMigrationManager/handleJoinableCallsDbMigration ");
        AnonymousClass1VE r6 = r7.A00;
        ArrayList A04 = r6.A04();
        if (!A04.isEmpty()) {
            StringBuilder A102 = AnonymousClass000.A10();
            C17890vO.A14("size=", A102, A04);
            ((AnonymousClass190) r7.A02.get()).A0G("joinable-call-database-migration", A102.toString(), false);
            Log.i("JoinableCallsMigrationManager/migrateJoinableCallsFromSharedPrefsToDb ");
            Iterator it = A04.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                long A042 = C17890vO.A04(AnonymousClass1VE.A00(r6), AnonymousClass001.A1H("joinable_", A0v, AnonymousClass000.A10()));
                if (!(A042 == -1 || (A05 = r3.A05(A042)) == null || A05.A0E == null)) {
                    A05.A0K(new AnonymousClass2Q4(A05.A0C, C40811vJ.A0A(A0v), A05.A01(), A05.A0J));
                    (r3 = r7.A01).A0A(A05);
                }
                r6.A08(A0v);
            }
        }
        C676730k r8 = new C676730k(this, 1);
        AnonymousClass1TD r72 = r2.A0I;
        ArrayList A09 = r72.A09(r8, 0, 100);
        AnonymousClass8CU r20 = this.A02;
        ArrayList arrayList = null;
        if (!r20.isCancelled()) {
            Log.i("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/doInBackground");
            try {
                r5 = C40811vJ.A05(r2.A0B);
            } catch (UnsatisfiedLinkError e) {
                Log.e((Throwable) e);
                r5 = null;
            }
            AnonymousClass1M9 r15 = r2.A0D;
            AnonymousClass126 r14 = r2.A0L;
            C24901Mc r13 = r2.A0Q;
            AnonymousClass11P r12 = r2.A0H;
            AnonymousClass126 r18 = r14;
            C24901Mc r19 = r13;
            AnonymousClass1M9 r142 = r15;
            C24921Me r152 = r2.A0G;
            C62102qn r122 = new C62102qn(r2.A0A, r142, r152, r12, r2.A0K, r18, r19);
            r2.A06 = r122;
            r122.A01(r5, A09);
            List list = r2.A06.A07;
            synchronized (list) {
                arrayList = C17880vN.A10(list);
            }
            if (A09.size() >= 100) {
                A0C(arrayList);
                ArrayList A092 = r72.A09(r8, 100, r2.A01);
                if (r20.isCancelled()) {
                    return null;
                }
                r2.A06.A01(r5, A092);
                List list2 = r2.A06.A07;
                synchronized (list2) {
                    A10 = C17880vN.A10(list2);
                }
                return A10;
            }
        }
        return arrayList;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        if (list != null) {
            list.size();
        }
        C40971vb r1 = this.A00;
        r1.A03 = null;
        C40971vb.A00(r1, list);
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        List[] listArr = (List[]) objArr;
        if (listArr == null || listArr.length < 1) {
            Log.i("CallsHistoryDataSource/RefreshCallsHistoryItemsTask/onProgressUpdate values empty");
        } else {
            C40971vb.A00(this.A00, listArr[0]);
        }
    }
}
