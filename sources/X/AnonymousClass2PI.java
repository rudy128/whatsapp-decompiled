package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2PI  reason: invalid class name */
public class AnonymousClass2PI extends A34 {
    public final /* synthetic */ C40971vb A00;

    public AnonymousClass2PI(C40971vb r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList A10;
        C40971vb r1 = this.A00;
        if (r1.A06 == null) {
            C18030ve r7 = r1.A0K;
            AnonymousClass1M9 r4 = r1.A0D;
            AnonymousClass126 r8 = r1.A0L;
            C24901Mc r9 = r1.A0Q;
            AnonymousClass11P r6 = r1.A0H;
            r1.A06 = new C62102qn(r1.A0A, r4, r1.A0G, r6, r7, r8, r9);
        }
        C676730k r42 = new C676730k(this, 0);
        AnonymousClass1TD r3 = r1.A0I;
        int i = r1.A01;
        ArrayList A09 = r3.A09(r42, i, r1.A00 + i);
        C89444cT r43 = null;
        if (this.A02.isCancelled()) {
            return null;
        }
        r1.A09.A0J(new C21431Ajy(this, A09, 16));
        Log.i("CallsHistoryDataSource/LoadAdditionalCallLogRecordsTask/doInBackground");
        try {
            r43 = C40811vJ.A05(r1.A0B);
        } catch (UnsatisfiedLinkError e) {
            Log.e((Throwable) e);
        }
        int size = r1.A06.A07.size();
        r1.A06.A01(r43, A09);
        List list = r1.A06.A07;
        synchronized (list) {
            A10 = C17880vN.A10(list);
        }
        if (A10.isEmpty() || A10.size() == size) {
            return AnonymousClass000.A13();
        }
        return A10.subList(size, A10.size());
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Collection collection = (Collection) obj;
        C40971vb r1 = this.A00;
        r1.A02 = null;
        if (collection == null) {
            Log.i("CallsHistoryDataSource/notifyAdditionalCallGroupsLoaded task result null");
            return;
        }
        C41031vh r12 = r1.A07;
        if (r12 != null) {
            ArrayList A10 = C17880vN.A10(collection);
            Log.i("CallsHistoryViewModel/onAdditionalCallGroupsLoaded");
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r12.A00;
            C17890vO.A0t(callsHistoryFragmentViewModel.A07);
            Lock lock = callsHistoryFragmentViewModel.A0s;
            C41081vm r13 = callsHistoryFragmentViewModel.A0U;
            LinkedHashMap linkedHashMap = callsHistoryFragmentViewModel.A0r;
            ArrayList arrayList = callsHistoryFragmentViewModel.A0p;
            C24901Mc r6 = callsHistoryFragmentViewModel.A0j;
            C49102Pe r0 = new C49102Pe(r13, callsHistoryFragmentViewModel, callsHistoryFragmentViewModel.A0Z, callsHistoryFragmentViewModel.A0g, callsHistoryFragmentViewModel.A0i, r6, A10, arrayList, linkedHashMap, lock);
            callsHistoryFragmentViewModel.A07 = r0;
            AnonymousClass1J2.A01(callsHistoryFragmentViewModel, r0);
        }
    }
}
