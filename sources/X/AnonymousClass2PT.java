package X;

import android.database.Cursor;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2PT  reason: invalid class name */
public class AnonymousClass2PT extends A34 {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C33251iW A01;
    public final WeakReference A02;
    public final boolean A03;
    public final boolean A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Set entrySet;
        Cursor A002;
        C33251iW r4 = this.A01;
        boolean z = this.A04;
        boolean z2 = this.A03;
        ArrayList A06 = r4.A0H.A06();
        HashSet A12 = C17880vN.A12();
        Iterator it = A06.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI A0Q = C17880vN.A0Q(it);
            if (r4.A0R.A03(A0Q) > 0) {
                r4.A0t.A0A(A0Q, (AnonymousClass206) null);
                r4.A03.A0J(new AnonymousClass3C0(r4, A0Q, 8));
            }
            A12.addAll(r4.A0C.A0A(A0Q, !z, z2));
        }
        AnonymousClass122 r6 = r4.A0U;
        if (z) {
            Log.i("CoreMessageStore/clearallmsgs_excludestarred");
            ArrayList A13 = AnonymousClass000.A13();
            C28781at A042 = r6.A0V.get();
            try {
                A002 = C23141Ev.A00(((C28801av) A042).A02, "SELECT DISTINCT chat_row_id FROM message", "GET_CHATS_FROM_MESSAGES_SQL");
                while (A002.moveToNext()) {
                    AnonymousClass1BI A0C = r6.A0C.A0C(A002);
                    if (A0C != null && !C22971Dz.A0a(A0C)) {
                        A13.add(A0C);
                    }
                }
                A002.close();
                A042.close();
                Iterator it2 = A13.iterator();
                while (it2.hasNext()) {
                    r6.BEq(C17880vN.A0Q(it2), (Long) null, true, z2);
                }
                Message.obtain(r6.A0O.A01, 8).sendToTarget();
            } catch (Throwable th) {
                th = th;
                try {
                    A042.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            Log.i("CoreMessageStore/clearallmsgs");
            AnonymousClass1Ez r5 = new AnonymousClass1Ez("msgstore/clearallmsgs");
            r6.A1M.clear();
            C28791au A05 = r6.A0V.A05();
            try {
                C41851xA BD0 = A05.BD0();
                try {
                    AnonymousClass122.A08(r6, r5);
                    AnonymousClass1CJ r1 = r6.A0D;
                    synchronized (r1) {
                        entrySet = AnonymousClass1CJ.A01(r1).entrySet();
                    }
                    Iterator it3 = entrySet.iterator();
                    while (it3.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(it3);
                        C29691ci r0 = (C29691ci) A16.getValue();
                        r0.A0C();
                        AnonymousClass1BI r2 = (AnonymousClass1BI) A16.getKey();
                        if (r2 != null && r0.A01 == 1) {
                            r6.A0Y(r2, (Long) null);
                        }
                    }
                    BD0.A00();
                    BD0.close();
                    A05.close();
                    C218617r r12 = r6.A05;
                    C64062u9.A0R(r12.A08().A0R);
                    C64062u9.A0R(r12.A08().A0J);
                    if (z2) {
                        AnonymousClass122.A02(r6);
                    }
                    Message.obtain(r6.A0O.A01, 8).sendToTarget();
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("CoreMessageStore/clearallmsgs time spent:");
                    C17890vO.A16(A10, r5.A02());
                } catch (Throwable th3) {
                    BD0.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                th = th4;
                A05.close();
                throw th;
            }
        }
        r4.A0C.A0R(A12);
        AnonymousClass1KB.A02(r4);
        r4.A09.A01();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.A00;
        if (elapsedRealtime >= 300) {
            return null;
        }
        SystemClock.sleep(300 - elapsedRealtime);
        return null;
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FR r0 = (AnonymousClass1FR) this.A02.get();
        if (r0 != null) {
            r0.CEx();
        }
    }

    public AnonymousClass2PT(AnonymousClass1FR r3, C33251iW r4, boolean z, boolean z2) {
        this.A02 = new WeakReference(r3);
        this.A01 = r4;
        this.A04 = z;
        this.A03 = z2;
    }
}
