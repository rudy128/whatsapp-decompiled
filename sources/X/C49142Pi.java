package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Pi  reason: invalid class name and case insensitive filesystem */
public class C49142Pi extends A34 {
    public final C41051vj A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final AnonymousClass11P A03;
    public final C18030ve A04;
    public final AnonymousClass126 A05;
    public final C24901Mc A06;
    public final C178119Bw A07;
    public final WeakReference A08;
    public final ArrayList A09;
    public final LinkedHashMap A0A;
    public final Lock A0B;
    public final C27081Uq A0C;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Pair pair;
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = (CallsHistoryFragmentViewModel) this.A08.get();
        if (callsHistoryFragmentViewModel == null) {
            Log.w("ProcessOnCallEndedCallLogTask/doInBackground view model reference null");
            return C17890vO.A0G(new LinkedHashMap(this.A0A), this.A09);
        }
        Lock lock = this.A0B;
        lock.lock();
        try {
            LinkedHashMap linkedHashMap = this.A0A;
            if (linkedHashMap.size() > 0) {
                String A0v = C17880vN.A0v(C17890vO.A0k(linkedHashMap));
                C41121vq r2 = (C41121vq) linkedHashMap.get(A0v);
                if (r2 instanceof C66582yP) {
                    C66582yP r22 = (C66582yP) r2;
                    C70483Bg r3 = r22.A01;
                    if (r3.A05(this.A07, false)) {
                        AnonymousClass1E7 r1 = r22.A03;
                        C66582yP r23 = new C66582yP(r3, callsHistoryFragmentViewModel.A0T(r3, r1), r1);
                        linkedHashMap.remove(A0v);
                        LinkedHashMap A13 = C17880vN.A13();
                        A13.put(r23.A01.A02(), r23);
                        A13.putAll(linkedHashMap);
                        linkedHashMap.clear();
                        linkedHashMap.putAll(A13);
                        pair = C17890vO.A0G(new LinkedHashMap(linkedHashMap), this.A09);
                        return pair;
                    }
                }
            }
            AnonymousClass11P r4 = this.A03;
            C18030ve r32 = this.A04;
            AnonymousClass1M9 r7 = this.A01;
            C24921Me r12 = this.A02;
            C178119Bw r24 = this.A07;
            C18070vi.A0w(r4, r32, r7, r12, r24);
            C70483Bg r0 = new C70483Bg(r7, r12, r4, r32);
            r0.A04.add(r24);
            boolean A0W = r24.A0W();
            AnonymousClass1E7 A012 = C63982u1.A01(r7, this.A05, r24.A0C, this.A06, A0W);
            C66582yP r25 = new C66582yP(r0, callsHistoryFragmentViewModel.A0T(r0, A012), A012);
            LinkedHashMap A132 = C17880vN.A13();
            A132.put(r25.A01.A02(), r25);
            A132.putAll(linkedHashMap);
            linkedHashMap.clear();
            linkedHashMap.putAll(A132);
            pair = C17890vO.A0G(new LinkedHashMap(linkedHashMap), this.A09);
            return pair;
        } finally {
            lock.unlock();
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C41051vj r0 = this.A00;
        ArrayList arrayList = (ArrayList) pair.second;
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r0.A00;
        callsHistoryFragmentViewModel.A08 = null;
        callsHistoryFragmentViewModel.A0a(arrayList, (LinkedHashMap) pair.first);
    }

    public C49142Pi(C41051vj r2, CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, AnonymousClass1M9 r4, C24921Me r5, AnonymousClass11P r6, C27081Uq r7, C18030ve r8, AnonymousClass126 r9, C24901Mc r10, C178119Bw r11, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A0B = lock;
        this.A07 = r11;
        this.A0A = linkedHashMap;
        this.A09 = arrayList;
        this.A03 = r6;
        this.A04 = r8;
        this.A06 = r10;
        this.A01 = r4;
        this.A02 = r5;
        this.A05 = r9;
        this.A0C = r7;
        this.A08 = new WeakReference(callsHistoryFragmentViewModel);
    }
}
