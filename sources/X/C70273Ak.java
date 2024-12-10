package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3Ak  reason: invalid class name and case insensitive filesystem */
public class C70273Ak implements C34191k5 {
    public final int A00;
    public final Object A01;

    public C70273Ak(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A00(C178119Bw r5) {
        ConversationsFragment conversationsFragment;
        Object obj;
        if (r5 != null) {
            if (r5.A0C != null) {
                conversationsFragment = (ConversationsFragment) this.A01;
                obj = r5.A0C;
            } else if (r5.A0O()) {
                HashSet A0C = r5.A0C();
                ArrayList A13 = AnonymousClass000.A13();
                Iterator it = A0C.iterator();
                while (it.hasNext()) {
                    AnonymousClass1BI A0Q = C17880vN.A0Q(it);
                    if (!((ConversationsFragment) this.A01).A0s.A0O(A0Q)) {
                        A13.add(A0Q);
                    }
                }
                ConversationsFragment.A0m((ConversationsFragment) this.A01, A13);
                return;
            } else {
                conversationsFragment = (ConversationsFragment) this.A01;
                obj = r5.A04.A01;
            }
            ConversationsFragment.A0m(conversationsFragment, Collections.singletonList(obj));
        }
    }

    public void BnA() {
        if (this.A00 != 0) {
            ((ConversationsFragment) this.A01).A2A();
            return;
        }
        Log.i("CallsHistoryDataSource/onCallLogDeleted");
        C41031vh r2 = ((C40971vb) this.A01).A07;
        if (r2 != null) {
            Log.i("CallsHistoryViewModel/onCallLogCleared");
            AnonymousClass1J2.A01(r2.A00, new C177929Bd((Object) r2, 4));
        }
    }

    public void BnD() {
        if (this.A00 == 0) {
            Log.i("CallsHistoryDataSource/onCallLogHistoryApplied");
            ((C40971vb) this.A01).A01();
        }
    }

    public void BnE(C178119Bw r16) {
        C178119Bw r10 = r16;
        if (this.A00 != 0) {
            A00(r10);
            return;
        }
        Log.i("CallsHistoryDataSource/onCallLogUpdated");
        if (r10.A0E != null) {
            C40971vb r3 = (C40971vb) this.A01;
            if (C18020vd.A05(C18040vf.A02, r3.A0K, 6522)) {
                C41031vh r1 = r3.A07;
                if (r1 != null) {
                    Log.i("CallsHistoryViewModel/onOngoingCallLogUpdated");
                    CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r1.A00;
                    C17890vO.A0t(callsHistoryFragmentViewModel.A0A);
                    C41091vn r2 = callsHistoryFragmentViewModel.A0V;
                    Lock lock = callsHistoryFragmentViewModel.A0s;
                    LinkedHashMap linkedHashMap = callsHistoryFragmentViewModel.A0r;
                    ArrayList arrayList = callsHistoryFragmentViewModel.A0p;
                    AnonymousClass11P r5 = callsHistoryFragmentViewModel.A0b;
                    C18030ve r7 = callsHistoryFragmentViewModel.A0h;
                    C24901Mc r9 = callsHistoryFragmentViewModel.A0j;
                    C49262Pu r12 = new C49262Pu(r2, callsHistoryFragmentViewModel.A0Z, callsHistoryFragmentViewModel.A0a, r5, callsHistoryFragmentViewModel.A0g, r7, callsHistoryFragmentViewModel.A0i, r9, r10, new WeakReference(callsHistoryFragmentViewModel), arrayList, linkedHashMap, lock);
                    callsHistoryFragmentViewModel.A0A = r12;
                    AnonymousClass1J2.A01(callsHistoryFragmentViewModel, r12);
                    return;
                }
                return;
            }
        }
        ((C40971vb) this.A01).A01();
    }

    public void BnF(Collection collection) {
        if (this.A00 != 0) {
            collection.size();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                A00((C178119Bw) it.next());
            }
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CallsHistoryDataSource/onCallLogsDeleted: size:");
        C17900vP.A0o(A10, collection.size());
        C41031vh r2 = ((C40971vb) this.A01).A07;
        if (r2 != null) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("CallsHistoryViewModel/onCallLogsDeleted(");
            A102.append(collection.size());
            C17890vO.A1A(A102, ")");
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r2.A00;
            if (!callsHistoryFragmentViewModel.A0J) {
                Log.i("CallsHistoryViewModel/onCallLogsDeleted skip due to no active observer");
            } else {
                callsHistoryFragmentViewModel.A0R.A01();
            }
        }
    }
}
