package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1S3  reason: invalid class name */
public final class AnonymousClass1S3 implements C41921xJ {
    public final C25851Pw A00;
    public final C26331Rs A01;
    public final AnonymousClass1S1 A02;
    public final AnonymousClass00H A03;
    public final C26371Rw A04;
    public final AnonymousClass1S4 A05;
    public final AnonymousClass1S2 A06;
    public final AnonymousClass10I A07;

    public AnonymousClass1S3(C26371Rw r2, C25851Pw r3, AnonymousClass1S4 r4, AnonymousClass1S2 r5, C26331Rs r6, AnonymousClass1S1 r7, AnonymousClass10I r8, AnonymousClass00H r9) {
        C18070vi.A0d(r9, 1);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r3, 6);
        C18070vi.A0d(r7, 7);
        C18070vi.A0d(r5, 8);
        this.A03 = r9;
        this.A07 = r8;
        this.A04 = r2;
        this.A05 = r4;
        this.A01 = r6;
        this.A00 = r3;
        this.A02 = r7;
        this.A06 = r5;
    }

    public static final void A01(AnonymousClass1S3 r7, String str) {
        Cursor A0A;
        C20126A8l A012;
        synchronized (r7) {
            C26331Rs r5 = r7.A01;
            ArrayList arrayList = new ArrayList();
            C28781at A052 = r5.A00.get();
            try {
                A0A = ((C28801av) A052).A02.A0A("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", "SyncdMutationsTable.SELECT_ALL_MUTATIONS_WITH_SUPPORTED_VERSIONS_AND_MISSING_DEPENDENCIES", (String[]) null);
                while (A0A.moveToNext()) {
                    String string = A0A.getString(A0A.getColumnIndexOrThrow("mutation_index"));
                    C18070vi.A0d(string, 1);
                    if (C18070vi.A18(A4M.A00(string), str) && (A012 = C26331Rs.A01(A0A, r5)) != null) {
                        arrayList.add(A012);
                    }
                }
                A0A.close();
                A052.close();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7.A05((C20126A8l) it.next());
                }
            } catch (Throwable th) {
                try {
                    A052.close();
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
                throw th;
            }
        }
        return;
        throw th;
    }

    public final C20126A8l A02(A6U a6u) {
        StringBuilder sb;
        String str;
        C18070vi.A0d(a6u, 0);
        String str2 = a6u.A06[0];
        C60192nY A002 = ((C58862lN) this.A03.get()).A00(str2);
        if (A002 == null) {
            sb = new StringBuilder();
            str = "mutation-handlers/handleMutation no mutation handlers found to handle mutation: ";
        } else if (A002.A0J()) {
            try {
                C20126A8l A0C = A002.A0C(a6u, (String) null, false);
                if (A0C != null) {
                    A0C.A01 = a6u.A05;
                    return A0C;
                }
            } catch (C26341Rt e) {
                this.A04.A09(e.errorCode, (String) null);
            }
            sb = new StringBuilder();
            str = "mutation-handlers/handleMutation the handler couldn't create a valid mutation for ";
        } else {
            sb = new StringBuilder();
            str = "mutation-handlers/handler was not active for ";
        }
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
        String str3 = a6u.A04;
        int i = a6u.A00;
        byte[] bArr = a6u.A05;
        C17960vV.A07(bArr);
        C18070vi.A0X(bArr);
        throw new AnonymousClass2E2(a6u.A01, a6u.A02, a6u.A03, str3, (Throwable) null, bArr, 6, i);
    }

    public final void A05(C20126A8l a8l) {
        C18070vi.A0d(a8l, 0);
        C60192nY A002 = ((C58862lN) this.A03.get()).A00(a8l.A0B());
        if (A002 != null) {
            A002.A0G(a8l);
        }
    }

    public final void A06(String str) {
        Cursor A0A;
        C18070vi.A0d(str, 0);
        synchronized (this) {
            C26331Rs r5 = this.A01;
            List singletonList = Collections.singletonList(str);
            C18070vi.A0X(singletonList);
            ArrayList arrayList = new ArrayList();
            if (!singletonList.isEmpty()) {
                C443423b r1 = new C443423b(singletonList.toArray(C19620yd.A0M), 975);
                C28781at A052 = r5.A00.get();
                try {
                    Iterator it = r1.iterator();
                    while (it.hasNext()) {
                        String[] strArr = (String[]) it.next();
                        C23141Ev r3 = ((C28801av) A052).A02;
                        int length = strArr.length;
                        StringBuilder sb = new StringBuilder();
                        sb.append("SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 AND mutation_index IN ");
                        sb.append(AnonymousClass1H2.A00(length));
                        A0A = r3.A0A(sb.toString(), "SyncdMutationsTable.buildSelectStoredMutationsWhereDependenciesMissingByIndices", strArr);
                        while (A0A.moveToNext()) {
                            C20126A8l A012 = C26331Rs.A01(A0A, r5);
                            if (A012 != null) {
                                arrayList.add(A012);
                            }
                        }
                        A0A.close();
                    }
                    A052.close();
                } catch (Throwable th) {
                    try {
                        A052.close();
                    } catch (Throwable th2) {
                        AnonymousClass0DT.A00(th, th2);
                    }
                    throw th;
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                A05((C20126A8l) it2.next());
            }
        }
        return;
        throw th;
    }

    public final void A07(Collection collection) {
        C18070vi.A0d(collection, 0);
        ArrayList A002 = A00(collection);
        synchronized (this) {
            this.A01.A0I(A002);
        }
    }

    public final void A03() {
        if (this.A05.A01.A04() && !C25851Pw.A00(this.A00).getBoolean("pref_lid_migration_post_processing_complete", false)) {
            this.A07.CGF(new C146437Pc(this, 7));
        }
    }

    public static final ArrayList A00(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C20126A8l a8l = (C20126A8l) it.next();
            if (!(a8l instanceof C72173Kx) || !C22971Dz.A0S(((C72173Kx) a8l).getChatJid())) {
                arrayList.add(a8l);
            }
        }
        return arrayList;
    }

    public final void A04(C20126A8l a8l) {
        if (a8l.A0D() && (a8l instanceof C72173Kx) && AnonymousClass2T1.A00(a8l.A0B())) {
            AnonymousClass1S2 r2 = this.A06;
            AnonymousClass1BI chatJid = ((C72173Kx) a8l).getChatJid();
            synchronized (r2) {
                C18070vi.A0d(chatJid, 0);
                Set set = r2.A00;
                if (set != null) {
                    set.add(chatJid);
                }
            }
        }
    }

    public void BxC() {
        A03();
    }
}
