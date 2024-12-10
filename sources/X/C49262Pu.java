package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Pu  reason: invalid class name and case insensitive filesystem */
public final class C49262Pu extends A34 {
    public final C41091vn A00;
    public final C178119Bw A01;
    public final WeakReference A02;
    public final ArrayList A03;
    public final ArrayList A04 = AnonymousClass000.A13();
    public final LinkedHashMap A05;
    public final Lock A06;
    public final AnonymousClass1M9 A07;
    public final C24921Me A08;
    public final AnonymousClass11P A09;
    public final C27081Uq A0A;
    public final C18030ve A0B;
    public final AnonymousClass126 A0C;
    public final C24901Mc A0D;

    private final C66512yI A00(CallsHistoryFragmentViewModel callsHistoryFragmentViewModel) {
        AnonymousClass11P r5 = this.A09;
        C18030ve r1 = this.A0B;
        AnonymousClass1M9 r3 = this.A07;
        C24921Me r0 = this.A08;
        C178119Bw r2 = this.A01;
        C18070vi.A0w(r5, r1, r3, r0, r2);
        C70483Bg r4 = new C70483Bg(r3, r0, r5, r1);
        r4.A04.add(r2);
        AnonymousClass1E7 A002 = C62792s0.A00(r3, this.A0C, this.A0D, r2);
        String A032 = this.A0A.A03(r2);
        return new C66512yI(r4, callsHistoryFragmentViewModel.A0U(r4, A002, A032), A002, A032);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = (CallsHistoryFragmentViewModel) this.A02.get();
        if (callsHistoryFragmentViewModel == null) {
            Log.w("ProcessUpdatedOngoingJoinableCallTask/doInBackground view model reference null");
            return C17890vO.A0G(new LinkedHashMap(this.A05), this.A03);
        }
        Lock lock = this.A06;
        lock.lock();
        boolean z = false;
        try {
            ArrayList arrayList = this.A03;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C66512yI r6 = (C66512yI) it.next();
                if (!z) {
                    List A032 = r6.A00.A03();
                    if (!(A032 instanceof Collection) || !A032.isEmpty()) {
                        Iterator it2 = A032.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (C18070vi.A18(((C178119Bw) it2.next()).A04.A02, this.A01.A04.A02)) {
                                    z = true;
                                    this.A04.add(A00(callsHistoryFragmentViewModel));
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                this.A04.add(r6);
            }
            if (!z) {
                this.A04.add(A00(callsHistoryFragmentViewModel));
            }
            arrayList.clear();
            ArrayList arrayList2 = this.A04;
            arrayList.addAll(arrayList2);
            return new Pair(new LinkedHashMap(this.A05), arrayList2);
        } finally {
            lock.unlock();
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C18070vi.A0d(pair, 0);
        C41091vn r0 = this.A00;
        Object obj2 = pair.first;
        C18070vi.A0W(obj2);
        Object obj3 = pair.second;
        C18070vi.A0W(obj3);
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
        callsHistoryFragmentViewModel.A0A = null;
        callsHistoryFragmentViewModel.A0a((ArrayList) obj3, (LinkedHashMap) obj2);
    }

    public C49262Pu(C41091vn r2, AnonymousClass1M9 r3, C24921Me r4, AnonymousClass11P r5, C27081Uq r6, C18030ve r7, AnonymousClass126 r8, C24901Mc r9, C178119Bw r10, WeakReference weakReference, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        C18070vi.A0j(r2, lock);
        C18070vi.A0g(linkedHashMap, 4, arrayList);
        C18070vi.A0x(r5, r7, r9, r3, r4);
        C18070vi.A0d(r8, 11);
        C18070vi.A0d(r6, 12);
        this.A00 = r2;
        this.A06 = lock;
        this.A01 = r10;
        this.A05 = linkedHashMap;
        this.A03 = arrayList;
        this.A09 = r5;
        this.A0B = r7;
        this.A0D = r9;
        this.A07 = r3;
        this.A08 = r4;
        this.A0C = r8;
        this.A0A = r6;
        this.A02 = weakReference;
    }
}
