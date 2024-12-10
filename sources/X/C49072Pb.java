package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Pb  reason: invalid class name and case insensitive filesystem */
public class C49072Pb extends A34 {
    public final C41061vk A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1BI A02;
    public final WeakReference A03;
    public final ArrayList A04;
    public final LinkedHashMap A05;
    public final Lock A06;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList arrayList;
        boolean z;
        boolean z2;
        String str;
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = (CallsHistoryFragmentViewModel) this.A03.get();
        if (callsHistoryFragmentViewModel == null) {
            str = "ProcessOnProfilePhotoChangedTask/doInBackground view model reference null";
        } else {
            AnonymousClass1E7 A0E = this.A01.A0E(this.A02);
            if (A0E == null) {
                str = "ProcessOnProfilePhotoChangedTask/doInBackground failed to convert";
            } else {
                Lock lock = this.A06;
                lock.lock();
                int i = 0;
                while (true) {
                    try {
                        arrayList = this.A04;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        C66512yI r1 = (C66512yI) arrayList.get(i);
                        AnonymousClass1E7 r26 = r1.A02;
                        C58782lF r2 = r1.A01;
                        if ((!r2.A0E || !C42171xk.A00(r1.A02, A0E)) && (r2.A0E || !r2.A0A.contains(A0E))) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            C70483Bg r25 = r1.A00;
                            String str2 = r1.A03;
                            C58782lF r12 = r1.A01;
                            int i2 = r12.A00;
                            int i3 = r12.A01;
                            List list = r12.A0A;
                            int i4 = r12.A02;
                            AnonymousClass4ZN r19 = r12.A05;
                            AnonymousClass4ZN r18 = r12.A04;
                            boolean z3 = r12.A0D;
                            boolean z4 = r12.A0E;
                            boolean z5 = r12.A0F;
                            AnonymousClass4ZN r14 = r12.A07;
                            List list2 = r12.A0B;
                            AnonymousClass4ZN r122 = r12.A08;
                            AnonymousClass4ZN r6 = r12.A06;
                            int i5 = r12.A03;
                            boolean z6 = r12.A0G;
                            boolean z7 = r12.A0C;
                            String A032 = CallsHistoryFragmentViewModel.A03(r26);
                            C58782lF r3 = new C58782lF();
                            r3.A00 = i2;
                            r3.A01 = i3;
                            r3.A0A = list;
                            r3.A02 = i4;
                            r3.A05 = r19;
                            r3.A04 = r18;
                            r3.A0D = z3;
                            r3.A0E = z4;
                            r3.A0F = z5;
                            r3.A07 = r14;
                            r3.A0B = list2;
                            r3.A08 = r122;
                            r3.A06 = r6;
                            r3.A09 = A032;
                            r3.A03 = i5;
                            r3.A0G = z6;
                            r3.A0C = z7;
                            arrayList.set(i, new C66512yI(r25, r3, r26, str2));
                        }
                        i++;
                    } finally {
                        lock.unlock();
                    }
                }
                LinkedHashMap linkedHashMap = this.A05;
                Iterator A0k = C17890vO.A0k(linkedHashMap);
                while (A0k.hasNext()) {
                    String A0v = C17880vN.A0v(A0k);
                    C41121vq r22 = (C41121vq) linkedHashMap.get(A0v);
                    if (r22 instanceof C66582yP) {
                        C66582yP r23 = (C66582yP) r22;
                        C58792lG r13 = r23.A02;
                        if ((!r13.A0H || !r13.A0E.contains(A0E)) && (r13.A0H || !C42171xk.A00(r13.A0A, A0E))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            AnonymousClass1E7 r32 = r23.A03;
                            C70483Bg r24 = r23.A01;
                            linkedHashMap.put(A0v, new C66582yP(r24, callsHistoryFragmentViewModel.A0T(r24, r32), r32));
                        }
                    }
                }
                return C17890vO.A0G(new LinkedHashMap(linkedHashMap), arrayList);
            }
        }
        Log.w(str);
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        boolean z;
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        Pair pair = (Pair) obj;
        C41061vk r2 = this.A00;
        if (pair == null) {
            z = true;
            linkedHashMap = C17880vN.A13();
            arrayList = AnonymousClass000.A13();
        } else {
            z = false;
            linkedHashMap = (LinkedHashMap) pair.first;
            arrayList = (ArrayList) pair.second;
        }
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r2.A00;
        callsHistoryFragmentViewModel.A09 = null;
        if (z) {
            Log.i("CallsHistoryFragmentV2ViewModel/ProcessOnProfilePhotoChangedTask refreshCalls");
            callsHistoryFragmentViewModel.A0R.A01();
            return;
        }
        callsHistoryFragmentViewModel.A0a(arrayList, linkedHashMap);
    }

    public C49072Pb(C41061vk r2, CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, AnonymousClass1M9 r4, AnonymousClass1BI r5, ArrayList arrayList, LinkedHashMap linkedHashMap, Lock lock) {
        this.A02 = r5;
        this.A06 = lock;
        this.A00 = r2;
        this.A05 = linkedHashMap;
        this.A04 = arrayList;
        this.A01 = r4;
        this.A03 = new WeakReference(callsHistoryFragmentViewModel);
    }
}
