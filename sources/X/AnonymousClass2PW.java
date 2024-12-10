package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2PW  reason: invalid class name */
public class AnonymousClass2PW extends A34 {
    public final C41071vl A00;
    public final WeakReference A01;
    public final ArrayList A02;
    public final Collection A03;
    public final LinkedHashMap A04;
    public final Lock A05;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        boolean z;
        boolean z2;
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = (CallsHistoryFragmentViewModel) this.A01.get();
        if (callsHistoryFragmentViewModel == null) {
            Log.w("ProcessUpdatedContactsTask/doInBackground view model reference null");
            return C17890vO.A0G(new LinkedHashMap(this.A04), this.A02);
        }
        Lock lock = this.A05;
        lock.lock();
        try {
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it);
                int i = 0;
                while (true) {
                    ArrayList arrayList = this.A02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    C66512yI r1 = (C66512yI) arrayList.get(i);
                    AnonymousClass1E7 r5 = r1.A02;
                    C58782lF r2 = r1.A01;
                    if ((!r2.A0E || !C42171xk.A00(r1.A02, A0O)) && (r2.A0E || !r2.A0A.contains(A0O))) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z2) {
                        if (r5 != null && r5.equals(A0O)) {
                            r5 = A0O;
                        }
                        C70483Bg r3 = r1.A00;
                        C178119Bw r0 = (C178119Bw) r3.A03().get(0);
                        C17960vV.A07(r0);
                        String str = r1.A03;
                        arrayList.set(i, new C66512yI(r3, callsHistoryFragmentViewModel.A0V(r1.A01, r5, str, r0.A0B().size()), r5, str));
                    }
                    i++;
                }
                LinkedHashMap linkedHashMap = this.A04;
                Iterator A0k = C17890vO.A0k(linkedHashMap);
                while (A0k.hasNext()) {
                    String A0v = C17880vN.A0v(A0k);
                    C41121vq r22 = (C41121vq) linkedHashMap.get(A0v);
                    if (r22 instanceof C66582yP) {
                        C66582yP r23 = (C66582yP) r22;
                        C58792lG r12 = r23.A02;
                        if ((!r12.A0H || !r12.A0E.contains(A0O)) && (r12.A0H || !C42171xk.A00(r12.A0A, A0O))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            C70483Bg r32 = r23.A01;
                            AnonymousClass1E7 r24 = r23.A03;
                            if (r24 != null) {
                                r24 = A0O;
                            }
                            linkedHashMap.put(A0v, new C66582yP(r32, callsHistoryFragmentViewModel.A0T(r32, r24), r24));
                        }
                    }
                }
            }
            return C17890vO.A0G(new LinkedHashMap(this.A04), this.A02);
        } finally {
            lock.unlock();
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C41071vl r0 = this.A00;
        ArrayList arrayList = (ArrayList) pair.second;
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
        callsHistoryFragmentViewModel.A0C = null;
        callsHistoryFragmentViewModel.A0a(arrayList, (LinkedHashMap) pair.first);
    }

    public AnonymousClass2PW(C41071vl r2, CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, ArrayList arrayList, Collection collection, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A05 = lock;
        this.A03 = collection;
        this.A04 = linkedHashMap;
        this.A02 = arrayList;
        this.A01 = new WeakReference(callsHistoryFragmentViewModel);
    }
}
