package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Pa  reason: invalid class name and case insensitive filesystem */
public final class C49062Pa extends A34 {
    public final C40971vb A00;
    public final C51712Zi A01;
    public final AnonymousClass1TD A02;
    public final ArrayList A03;
    public final LinkedHashMap A04;
    public final Set A05;
    public final Lock A06;

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        if (pair != null) {
            C51712Zi r0 = this.A01;
            Object obj2 = pair.first;
            C18070vi.A0W(obj2);
            Object obj3 = pair.second;
            C18070vi.A0W(obj3);
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
            callsHistoryFragmentViewModel.A0a((ArrayList) obj3, (LinkedHashMap) obj2);
        }
    }

    public C49062Pa(C40971vb r2, C51712Zi r3, AnonymousClass1TD r4, ArrayList arrayList, LinkedHashMap linkedHashMap, Set set, Lock lock) {
        C18070vi.A0p(lock, set, r4);
        C18070vi.A0d(r2, 5);
        C18070vi.A0l(linkedHashMap, arrayList);
        this.A01 = r3;
        this.A06 = lock;
        this.A05 = set;
        this.A02 = r4;
        this.A00 = r2;
        this.A04 = linkedHashMap;
        this.A03 = arrayList;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C70483Bg BO2;
        ArrayList A13 = AnonymousClass000.A13();
        Lock lock = this.A06;
        lock.lock();
        try {
            Set set = this.A05;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                LinkedHashMap linkedHashMap = this.A04;
                if (linkedHashMap.containsKey(A0v)) {
                    C41121vq r1 = (C41121vq) linkedHashMap.get(A0v);
                    if (((r1 instanceof C66582yP) || (r1 instanceof C66522yJ)) && (BO2 = r1.BO2()) != null) {
                        A13.addAll(BO2.A03());
                        linkedHashMap.remove(A0v);
                        it.remove();
                    }
                }
            }
            if (!A13.isEmpty()) {
                this.A02.A0C(A13);
                return C17890vO.A0G(new LinkedHashMap(this.A04), this.A03);
            }
            if (!set.isEmpty()) {
                Log.w("CallsHistoryFragmentV2ViewModel/deleteHistoricalCallItems failed to match group IDs");
                this.A00.A01();
            }
            lock.unlock();
            return null;
        } finally {
            lock.unlock();
        }
    }
}
