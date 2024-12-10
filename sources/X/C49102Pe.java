package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Pe  reason: invalid class name and case insensitive filesystem */
public class C49102Pe extends A34 {
    public final C41081vm A00;
    public final AnonymousClass1M9 A01;
    public final C27081Uq A02;
    public final AnonymousClass126 A03;
    public final C24901Mc A04;
    public final WeakReference A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final LinkedHashMap A08;
    public final Lock A09;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b1, code lost:
        r0 = r8.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r19) {
        /*
            r18 = this;
            r4 = r18
            java.lang.ref.WeakReference r0 = r4.A05
            java.lang.Object r5 = r0.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r5 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r5
            if (r5 != 0) goto L_0x001f
            java.lang.String r0 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.LinkedHashMap r0 = r4.A08
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.ArrayList r0 = r4.A07
            android.util.Pair r0 = X.C17890vO.A0G(r1, r0)
            return r0
        L_0x001f:
            java.util.concurrent.locks.Lock r3 = r4.A09
            r3.lock()
            java.util.ArrayList r0 = r4.A06     // Catch:{ all -> 0x0127 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0127 }
        L_0x002a:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r11 = r9.next()     // Catch:{ all -> 0x0127 }
            X.3Bg r11 = (X.C70483Bg) r11     // Catch:{ all -> 0x0127 }
            java.util.List r0 = r11.A03()     // Catch:{ all -> 0x0127 }
            int r0 = r0.size()     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x0054
            java.lang.String r0 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground no call logs registered to group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r0 = r4.A08     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0127 }
            r1.<init>(r0)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r0 = r4.A07     // Catch:{ all -> 0x0127 }
            android.util.Pair r0 = X.C17890vO.A0G(r1, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x0054:
            java.util.List r0 = r11.A03()     // Catch:{ all -> 0x0127 }
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0127 }
            if (r0 != 0) goto L_0x0073
            java.lang.String r0 = "ProcessOnAdditionalCallGroupsLoadedTask/doInBackground call log null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r0 = r4.A08     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0127 }
            r1.<init>(r0)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r0 = r4.A07     // Catch:{ all -> 0x0127 }
            android.util.Pair r0 = X.C17890vO.A0G(r1, r0)     // Catch:{ all -> 0x0127 }
            goto L_0x0123
        L_0x0073:
            java.util.List r0 = r11.A03()     // Catch:{ all -> 0x0127 }
            java.lang.Object r8 = r0.get(r1)     // Catch:{ all -> 0x0127 }
            X.9Bw r8 = (X.C178119Bw) r8     // Catch:{ all -> 0x0127 }
            X.9Bw r0 = X.C18070vi.A0C(r11)     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0088
            X.2Q4 r0 = r0.A0E     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x0088
            r1 = 1
        L_0x0088:
            if (r1 == 0) goto L_0x00a9
            X.1M9 r2 = r4.A01     // Catch:{ all -> 0x0127 }
            X.1Mc r1 = r4.A04     // Catch:{ all -> 0x0127 }
            X.126 r0 = r4.A03     // Catch:{ all -> 0x0127 }
            X.1E7 r6 = X.C62792s0.A00(r2, r0, r1, r8)     // Catch:{ all -> 0x0127 }
            X.1Uq r0 = r4.A02     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r0.A03(r8)     // Catch:{ all -> 0x0127 }
            X.2lF r0 = r5.A0U(r11, r6, r2)     // Catch:{ all -> 0x0127 }
            X.2yI r1 = new X.2yI     // Catch:{ all -> 0x0127 }
            r1.<init>(r11, r0, r6, r2)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r0 = r4.A07     // Catch:{ all -> 0x0127 }
            r0.add(r1)     // Catch:{ all -> 0x0127 }
            goto L_0x002a
        L_0x00a9:
            X.2kW r0 = r8.A0F     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00f2
            com.whatsapp.jid.GroupJid r0 = r8.A0C     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00f2
            X.2kW r0 = r8.A0F     // Catch:{ all -> 0x0127 }
            X.1Uq r2 = r4.A02     // Catch:{ all -> 0x0127 }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x0127 }
            com.whatsapp.jid.GroupJid r0 = r8.A0C     // Catch:{ all -> 0x0127 }
            X.2mw r7 = r2.A02(r0, r1)     // Catch:{ all -> 0x0127 }
            if (r7 == 0) goto L_0x00f2
            int r0 = r8.A06     // Catch:{ all -> 0x0127 }
            r6 = 2
            if (r0 == r6) goto L_0x00c5
            r6 = 3
        L_0x00c5:
            X.9Bw r0 = X.C18070vi.A0C(r11)     // Catch:{ all -> 0x0127 }
            if (r0 == 0) goto L_0x00ef
            long r0 = r0.A01     // Catch:{ all -> 0x0127 }
            X.11P r2 = r11.A02     // Catch:{ all -> 0x0127 }
            long r0 = r2.A09(r0)     // Catch:{ all -> 0x0127 }
        L_0x00d3:
            X.2lB r12 = r5.A0W(r7, r6, r0)     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r6 = r4.A08     // Catch:{ all -> 0x0127 }
            java.lang.String r2 = r11.A02()     // Catch:{ all -> 0x0127 }
            long r14 = r7.A03     // Catch:{ all -> 0x0127 }
            long r0 = r7.A02     // Catch:{ all -> 0x0127 }
            X.1BI r13 = r7.A04     // Catch:{ all -> 0x0127 }
            X.2yJ r10 = new X.2yJ     // Catch:{ all -> 0x0127 }
            r16 = r0
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x0127 }
            r6.put(r2, r10)     // Catch:{ all -> 0x0127 }
            goto L_0x002a
        L_0x00ef:
            r0 = 0
            goto L_0x00d3
        L_0x00f2:
            boolean r7 = r8.A0W()     // Catch:{ all -> 0x0127 }
            com.whatsapp.jid.GroupJid r6 = r8.A0C     // Catch:{ all -> 0x0127 }
            X.1M9 r2 = r4.A01     // Catch:{ all -> 0x0127 }
            X.1Mc r1 = r4.A04     // Catch:{ all -> 0x0127 }
            X.126 r0 = r4.A03     // Catch:{ all -> 0x0127 }
            X.1E7 r1 = X.C63982u1.A01(r2, r0, r6, r1, r7)     // Catch:{ all -> 0x0127 }
            X.2lG r0 = r5.A0T(r11, r1)     // Catch:{ all -> 0x0127 }
            X.2yP r2 = new X.2yP     // Catch:{ all -> 0x0127 }
            r2.<init>(r11, r0, r1)     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r1 = r4.A08     // Catch:{ all -> 0x0127 }
            java.lang.String r0 = r11.A02()     // Catch:{ all -> 0x0127 }
            r1.put(r0, r2)     // Catch:{ all -> 0x0127 }
            goto L_0x002a
        L_0x0116:
            java.util.LinkedHashMap r0 = r4.A08     // Catch:{ all -> 0x0127 }
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0127 }
            r1.<init>(r0)     // Catch:{ all -> 0x0127 }
            java.util.ArrayList r0 = r4.A07     // Catch:{ all -> 0x0127 }
            android.util.Pair r0 = X.C17890vO.A0G(r1, r0)     // Catch:{ all -> 0x0127 }
        L_0x0123:
            r3.unlock()
            return r0
        L_0x0127:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49102Pe.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C41081vm r1 = this.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) pair.first);
        ArrayList A10 = C17880vN.A10((Collection) pair.second);
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r1.A00;
        callsHistoryFragmentViewModel.A07 = null;
        callsHistoryFragmentViewModel.A0a(A10, linkedHashMap);
    }

    public C49102Pe(C41081vm r2, CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, AnonymousClass1M9 r4, C27081Uq r5, AnonymousClass126 r6, C24901Mc r7, ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap, Lock lock) {
        this.A09 = lock;
        this.A06 = arrayList;
        this.A00 = r2;
        this.A08 = linkedHashMap;
        this.A07 = arrayList2;
        this.A04 = r7;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = new WeakReference(callsHistoryFragmentViewModel);
    }
}
