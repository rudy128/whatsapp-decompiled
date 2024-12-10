package X;

import android.database.Cursor;
import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2PG  reason: invalid class name */
public class AnonymousClass2PG extends A34 {
    public final /* synthetic */ C34641kp A00;

    public AnonymousClass2PG(C34641kp r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Cursor A0A;
        C34641kp r4 = this.A00;
        ArrayList A02 = r4.A08.A02();
        AnonymousClass1WM r12 = r4.A09;
        ArrayList A13 = AnonymousClass000.A13();
        long A01 = AnonymousClass11P.A01(r12.A03) - 86400000;
        for (Object A0M : new AnonymousClass7T0(1).keySet()) {
            int A0M2 = AnonymousClass000.A0M(A0M);
            C28781at A04 = r12.A09.get();
            try {
                C202711m r10 = r12.A0E;
                C23141Ev r9 = ((C28801av) A04).A02;
                String str = C63702tY.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append(C63702tY.A00(A0M2));
                String A0y = AnonymousClass000.A0y(" WHERE message_add_on.from_me = 1  AND message_add_on.status < 4 AND message_add_on.timestamp > ? AND message_add_on.message_add_on_type = ?", A10);
                String[] A1Z = C17880vN.A1Z();
                C17880vN.A1V(A1Z, 0, A01);
                C17880vN.A1S(A1Z, A0M2, 1);
                A0A = r9.A0A(A0y, "MessageAddOnStore/getUnsentMessageAddOnCursor", A1Z);
                HashMap A012 = C63792th.A01(A0A, A0M2);
                while (A0A.moveToNext()) {
                    AnonymousClass212 A05 = r10.A05(A0A, A012);
                    if (A05 == null) {
                        Log.e("MessageAddOnManager/getMessageAddOnForParentMessage unexpected fmessage");
                    } else {
                        A05.A1B(A0A, r12.A08, A012);
                        AnonymousClass1W6 A0c = C17880vN.A0c(r12.A0F);
                        AnonymousClass206 A03 = A0c.A01.A03(A05.A02);
                        if (A03 == null) {
                            Log.w(AnonymousClass206.A03(A05, "MessageAddOnManager/fillInMessageAddOnReactionForNotification parent message missing addon=", AnonymousClass000.A10()));
                        } else {
                            if (A05 instanceof AnonymousClass22E) {
                                if (!(A03 instanceof AnonymousClass22H)) {
                                    Log.w(AnonymousClass206.A03(A05, "MessageAddOnManager/fillInMessageAddOn parent message not a poll for a poll vote addon=", AnonymousClass000.A10()));
                                } else {
                                    AnonymousClass22E r15 = (AnonymousClass22E) A05;
                                    ArrayList A002 = r12.A0C.A06.A00(r15.A0x);
                                    List list = r15.A06;
                                    list.clear();
                                    list.addAll(A002);
                                    AnonymousClass1WB.A01((AnonymousClass22H) A03, r15);
                                }
                            }
                            A05.A05 = new A51(A03.A0H(), A03.A0v);
                            A05.A04 = AnonymousClass9AT.A01(A03);
                            A13.add(A05);
                        }
                    }
                }
                A0A.close();
                A04.close();
            } catch (Throwable th) {
                try {
                    A04.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        }
        A02.addAll(A13);
        if (A02.isEmpty()) {
            return null;
        }
        int A032 = r4.A03.A03(true);
        HashMap A11 = C17880vN.A11();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (r4.A01(A0Y)) {
                if (A0Y.A12 == 0) {
                    A0Y.A12 = SystemClock.uptimeMillis();
                }
                if (!(A0Y instanceof AnonymousClass212)) {
                    A0Y.A1H = r4.A06.BYx(A0Y);
                }
                if (A0Y.A0u == 16) {
                    AnonymousClass218 r92 = (AnonymousClass218) A0Y;
                    if (r92.A02 == 2) {
                        C203911y r2 = (C203911y) r4.A0D.get();
                        C130816k3 r0 = new C130816k3(r2.A08, A0Y);
                        r0.A07 = true;
                        r0.A06 = true;
                        C203911y.A00(r2, new C136506tv(r0), (C26981Ug) null, (Runnable) null);
                    } else {
                        C33251iW r5 = r4.A02;
                        r5.A03.A0J(new AnonymousClass3C0(r5, r92, 21));
                    }
                } else if (A0Y instanceof AnonymousClass21V) {
                    AnonymousClass21V r22 = (AnonymousClass21V) A0Y;
                    C62572rc r93 = r22.A02;
                    boolean A1F = r22.A1F();
                    int A0D = r22.A0D();
                    if (A1F && (r93 == null || r93.A0G == null)) {
                        C34641kp.A00(r4, r22, (Runnable) null);
                    } else if (!C446824j.A03(A0D, 2)) {
                        C34641kp.A00(r4, A0Y, new AnonymousClass7Q7(r4, r93, A0Y, r22, A032, 4));
                    } else if (A032 == 1 || A032 == 2 || (r22 instanceof C438421d) || ((r22 instanceof C441822l) && r22.A09 == 1)) {
                        String str2 = r22.A0A;
                        if (str2 == null) {
                            r4.A01.A08(r22, false, false);
                        } else {
                            AbstractCollection abstractCollection = (AbstractCollection) A11.get(str2);
                            if (abstractCollection == null) {
                                abstractCollection = AnonymousClass000.A13();
                                A11.put(r22.A0A, abstractCollection);
                            }
                            abstractCollection.add(r22);
                        }
                    }
                } else {
                    C34641kp.A00(r4, A0Y, (Runnable) null);
                }
            }
        }
        Iterator A0j = C17890vO.A0j(A11);
        while (A0j.hasNext()) {
            r4.A01.A09(new C63642tS((ArrayList) A0j.next()), false, false);
        }
        return null;
        throw th;
    }
}
