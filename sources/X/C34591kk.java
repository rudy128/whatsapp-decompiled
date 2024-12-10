package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteFullException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1kk  reason: invalid class name and case insensitive filesystem */
public class C34591kk {
    public final AnonymousClass11P A00;
    public final AnonymousClass1Q8 A01;
    public final AnonymousClass1LW A02;
    public final AnonymousClass1Q6 A03;
    public final AnonymousClass1CL A04;
    public final C22611Cn A05;
    public final AnonymousClass1Cd A06;
    public final AnonymousClass1NK A07;
    public final AnonymousClass00H A08;
    public final Map A09;
    public final AtomicBoolean A0A;

    public int A01(AnonymousClass1BI r4) {
        int i = 0;
        if (r4 != null) {
            Iterator it = A02().iterator();
            while (it.hasNext()) {
                if (r4.equals(((AnonymousClass206) it.next()).A0v.A00)) {
                    i++;
                }
            }
        }
        return i;
    }

    private void A00() {
        Cursor A0A2;
        AtomicBoolean atomicBoolean = this.A0A;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                ArrayList arrayList = new ArrayList();
                AnonymousClass1Ez r7 = new AnonymousClass1Ez(false);
                r7.A05("unsentmsgstore/unsendmessages");
                long A022 = this.A07.A02(AnonymousClass11P.A01(this.A00) - 172800000);
                try {
                    C28781at A042 = this.A06.get();
                    try {
                        A0A2 = ((C28801av) A042).A02.A0A(AnonymousClass203.A0O, "UNSENT_MESSAGES_SQL", new String[]{String.valueOf(A022)});
                        int columnIndexOrThrow = A0A2.getColumnIndexOrThrow("chat_row_id");
                        while (A0A2.moveToNext()) {
                            AnonymousClass1BI A0B = this.A02.A0B((long) A0A2.getInt(columnIndexOrThrow));
                            if (A0B == null) {
                                Log.w("unsentmsgstore/unsent/jid is null!");
                            } else {
                                AnonymousClass206 A023 = ((AnonymousClass1W6) this.A08.get()).A02(A0A2, A0B);
                                if (A023 == null) {
                                    Log.w("unsentmsgstore/unsent/can't read message from cursor.");
                                } else {
                                    int i = A023.A0u;
                                    if (!(i == 8 || i == 10 || i == 7)) {
                                        if (A023.A0D() != 7 || !C22971Dz.A0e(A023.A0v.A00)) {
                                            if (!A023.A0l || C22971Dz.A0N(A0B)) {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("unsentmsgstore/unsent/add key=");
                                                sb.append(A023.A0v.A01);
                                                sb.append(" type=");
                                                sb.append(i);
                                                sb.append(" status=");
                                                sb.append(A023.A0C);
                                                Log.i(sb.toString());
                                                arrayList.add(A023);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        A0A2.close();
                        A042.close();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("unsentmsgstore/unsent ");
                        sb2.append(arrayList.size());
                        sb2.append(" | time spent:");
                        sb2.append(r7.A02());
                        Log.i(sb2.toString());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            AnonymousClass206 r2 = (AnonymousClass206) it.next();
                            this.A09.put(r2.A0v, r2);
                        }
                        if (!atomicBoolean.compareAndSet(false, true)) {
                            Log.e("unsent messages cache initialization failed to change the related flag");
                        }
                    } catch (Throwable th) {
                        A042.close();
                        throw th;
                    }
                } catch (IllegalStateException e) {
                    Log.i("unsentmsgstore/unsent/IllegalStateException ", e);
                } catch (SQLiteDatabaseCorruptException e2) {
                    Log.e((Throwable) e2);
                    this.A05.A03();
                } catch (SQLiteFullException e3) {
                    this.A04.A00(0);
                    throw e3;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                }
            }
        }
        return;
        throw th;
    }

    public ArrayList A02() {
        long A012 = AnonymousClass11P.A01(this.A00);
        if (!this.A0A.get()) {
            A00();
        }
        Map map = this.A03.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AnonymousClass206) ((Map.Entry) it.next()).getValue()).A0I + 86400000 < A012) {
                it.remove();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/unsendmessages/cached:");
        sb.append(map.size());
        Log.i(sb.toString());
        ArrayList arrayList = new ArrayList(map.size());
        for (Object add : map.values()) {
            arrayList.add(add);
        }
        Collections.sort(arrayList, new C98924rw(16));
        return arrayList;
    }

    public boolean A03() {
        if (!this.A0A.get()) {
            A00();
        }
        AnonymousClass1Q6 r1 = this.A03;
        long A012 = AnonymousClass11P.A01(this.A00);
        Map map = r1.A02;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (((AnonymousClass206) ((Map.Entry) it.next()).getValue()).A0I + 86400000 < A012) {
                it.remove();
            }
        }
        return !map.isEmpty();
    }

    public C34591kk(AnonymousClass11P r2, AnonymousClass1Q8 r3, AnonymousClass1LW r4, AnonymousClass1Q6 r5, AnonymousClass1CL r6, C22611Cn r7, AnonymousClass1Cd r8, AnonymousClass1NK r9, AnonymousClass00H r10) {
        this.A00 = r2;
        this.A02 = r4;
        this.A07 = r9;
        this.A08 = r10;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A05 = r7;
        this.A09 = r5.A02;
        this.A0A = r5.A04;
    }
}
