package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1WB  reason: invalid class name */
public class AnonymousClass1WB {
    public final AnonymousClass11S A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass121 A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass1Cd A04;
    public final C24751Ln A05;
    public final AnonymousClass1WA A06;
    public final C202711m A07;
    public final C18030ve A08;
    public final C59422mH A09;
    public final AnonymousClass1W9 A0A;
    public final JniBridge A0B;
    public final Object A0C = new Object();
    public final AnonymousClass1DL A0D;

    public static AnonymousClass22E A00(AnonymousClass1WB r12, AnonymousClass1BI r13, AnonymousClass206 r14, boolean z) {
        long j;
        Cursor A032;
        long j2 = r14.A0x;
        if (r13 != null) {
            j = r12.A0D.A09(r13);
        } else {
            j = -1;
        }
        C28781at A042 = r12.A04.get();
        try {
            C202711m r4 = r12.A07;
            A032 = r4.A03(A042, 67, j2, j, z);
            if (A032.moveToNext()) {
                HashMap A012 = C63792th.A01(A032, 67);
                AnonymousClass212 A052 = r4.A05(A032, A012);
                if (!(A052 instanceof AnonymousClass22E)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageAddOnPollVoteManager/getMessageAddOnPollVoteForMessageAndSender unexpected fmessage ");
                    sb.append(A052);
                    Log.e(sb.toString());
                } else {
                    AnonymousClass22E r42 = (AnonymousClass22E) A052;
                    r42.A1B(A032, r12.A0D, A012);
                    ArrayList A002 = r12.A06.A00(r42.A0x);
                    List list = r42.A06;
                    list.clear();
                    list.addAll(A002);
                    r42.A05 = new A51(r14.A0H(), r14.A0v);
                    A032.close();
                    A042.close();
                    return r42;
                }
            }
            A032.close();
            A042.close();
            return null;
        } catch (Throwable th) {
            try {
                A042.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public static void A01(AnonymousClass22H r9, AnonymousClass22E r10) {
        ArrayList arrayList;
        List<A18> list = r9.A07;
        List list2 = r10.A06;
        if (list2.isEmpty()) {
            arrayList = new ArrayList();
        } else {
            HashSet hashSet = new HashSet();
            for (A18 a18 : list) {
                if (list2.contains(Long.valueOf(a18.A01)) && a18.A01 != -1) {
                    hashSet.add(a18.A02);
                }
            }
            arrayList = new ArrayList(hashSet);
        }
        r10.A01 = arrayList;
        r10.A05 = r9.A1D;
    }

    public static void A02(AnonymousClass22H r7, List list, List list2, List list3) {
        if (C22971Dz.A0V(r7.A0v.A00)) {
            HashSet hashSet = new HashSet();
            HashSet hashSet2 = new HashSet();
            for (Object next : list2) {
                if (list3 == null || !list3.contains(next)) {
                    hashSet.add(next);
                }
            }
            if (list3 != null) {
                for (Object next2 : list3) {
                    if (!list2.contains(next2)) {
                        hashSet2.add(next2);
                    }
                }
            }
            for (A18 a18 : r7.A07) {
                if (hashSet.contains(Long.valueOf(a18.A01))) {
                    a18.A00++;
                }
                if (hashSet2.contains(Long.valueOf(a18.A01))) {
                    a18.A00--;
                }
            }
            AnonymousClass25F r1 = r7.A06;
            synchronized (r1) {
                r1.A02((AnonymousClass229) null);
                r1.A01();
                r1.A02(new C693036r(list));
            }
            return;
        }
        AnonymousClass25F r12 = r7.A06;
        synchronized (r12) {
            r12.A02(new C693036r(list));
        }
        for (A18 a182 : r7.A07) {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((AnonymousClass22E) ((AnonymousClass212) it.next())).A06.contains(Long.valueOf(a182.A01))) {
                    i++;
                }
            }
            a182.A00 = i;
        }
    }

    public AnonymousClass1WB(AnonymousClass11S r2, AnonymousClass1CJ r3, AnonymousClass121 r4, AnonymousClass1MZ r5, AnonymousClass1DL r6, AnonymousClass1Cd r7, C24751Ln r8, AnonymousClass1WA r9, C202711m r10, C18030ve r11, C59422mH r12, AnonymousClass1W9 r13, JniBridge jniBridge) {
        Boolean bool = C17960vV.A01;
        this.A08 = r11;
        this.A0D = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A0B = jniBridge;
        this.A05 = r8;
        this.A09 = r12;
        this.A07 = r10;
        this.A04 = r7;
        this.A0A = r13;
        this.A02 = r4;
        this.A03 = r5;
        this.A06 = r9;
    }
}
