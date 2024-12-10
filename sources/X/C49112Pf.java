package X;

import android.util.Pair;
import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2Pf  reason: invalid class name and case insensitive filesystem */
public class C49112Pf extends A34 {
    public final C41041vi A00;
    public final AnonymousClass1M9 A01;
    public final C27081Uq A02;
    public final AnonymousClass126 A03;
    public final C24901Mc A04;
    public final WeakReference A05;
    public final ArrayList A06;
    public final ArrayList A07;
    public final LinkedHashMap A08;
    public final Lock A09;

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ae, code lost:
        r0 = r8.A0F;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r20) {
        /*
            r19 = this;
            r5 = r19
            java.lang.ref.WeakReference r0 = r5.A05
            java.lang.Object r4 = r0.get()
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r4 = (com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel) r4
            if (r4 != 0) goto L_0x001f
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground view model reference null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.util.LinkedHashMap r0 = r5.A08
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.ArrayList r0 = r5.A06
            android.util.Pair r0 = X.C17890vO.A0G(r1, r0)
            return r0
        L_0x001f:
            java.util.concurrent.locks.Lock r6 = r5.A09
            r6.lock()
            java.util.LinkedHashMap r3 = r5.A08     // Catch:{ all -> 0x011a }
            r3.clear()     // Catch:{ all -> 0x011a }
            java.util.ArrayList r2 = r5.A06     // Catch:{ all -> 0x011a }
            r2.clear()     // Catch:{ all -> 0x011a }
            java.util.ArrayList r0 = r5.A07     // Catch:{ all -> 0x011a }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x011a }
        L_0x0034:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x011a }
            X.3Bg r0 = (X.C70483Bg) r0     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground original call group is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011a }
        L_0x0047:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x011a }
            r0.<init>(r3)     // Catch:{ all -> 0x011a }
            android.util.Pair r0 = X.C17890vO.A0G(r0, r2)     // Catch:{ all -> 0x011a }
            goto L_0x0116
        L_0x0052:
            java.lang.Object r12 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x010f }
            X.3Bg r12 = (X.C70483Bg) r12     // Catch:{ CloneNotSupportedException -> 0x010f }
            java.util.List r7 = r12.A04     // Catch:{ all -> 0x011a }
            int r0 = r7.size()     // Catch:{ all -> 0x011a }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground no call logs registered to group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011a }
            goto L_0x0047
        L_0x0066:
            java.util.List r1 = r12.A03()     // Catch:{ all -> 0x011a }
            r0 = 0
            java.lang.Object r8 = r1.get(r0)     // Catch:{ all -> 0x011a }
            X.9Bw r8 = (X.C178119Bw) r8     // Catch:{ all -> 0x011a }
            if (r8 != 0) goto L_0x0079
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground call log null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011a }
            goto L_0x0047
        L_0x0079:
            java.lang.Object r0 = X.C29431cG.A0c(r7)     // Catch:{ all -> 0x011a }
            X.9Bw r0 = (X.C178119Bw) r0     // Catch:{ all -> 0x011a }
            r1 = 0
            if (r0 == 0) goto L_0x0087
            X.2Q4 r0 = r0.A0E     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x0087
            r1 = 1
        L_0x0087:
            if (r1 == 0) goto L_0x00a6
            X.1M9 r7 = r5.A01     // Catch:{ all -> 0x011a }
            X.1Mc r1 = r5.A04     // Catch:{ all -> 0x011a }
            X.126 r0 = r5.A03     // Catch:{ all -> 0x011a }
            X.1E7 r9 = X.C62792s0.A00(r7, r0, r1, r8)     // Catch:{ all -> 0x011a }
            X.1Uq r0 = r5.A02     // Catch:{ all -> 0x011a }
            java.lang.String r7 = r0.A03(r8)     // Catch:{ all -> 0x011a }
            X.2lF r1 = r4.A0U(r12, r9, r7)     // Catch:{ all -> 0x011a }
            X.2yI r0 = new X.2yI     // Catch:{ all -> 0x011a }
            r0.<init>(r12, r1, r9, r7)     // Catch:{ all -> 0x011a }
            r2.add(r0)     // Catch:{ all -> 0x011a }
            goto L_0x0034
        L_0x00a6:
            X.2kW r0 = r8.A0F     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00ed
            com.whatsapp.jid.GroupJid r0 = r8.A0C     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00ed
            X.2kW r0 = r8.A0F     // Catch:{ all -> 0x011a }
            X.1Uq r7 = r5.A02     // Catch:{ all -> 0x011a }
            java.lang.String r1 = r0.A00     // Catch:{ all -> 0x011a }
            com.whatsapp.jid.GroupJid r0 = r8.A0C     // Catch:{ all -> 0x011a }
            X.2mw r7 = r7.A02(r0, r1)     // Catch:{ all -> 0x011a }
            if (r7 == 0) goto L_0x00ed
            int r0 = r8.A06     // Catch:{ all -> 0x011a }
            r9 = 2
            if (r0 == r9) goto L_0x00c2
            r9 = 3
        L_0x00c2:
            X.9Bw r0 = X.C18070vi.A0C(r12)     // Catch:{ all -> 0x011a }
            if (r0 == 0) goto L_0x00ea
            long r0 = r0.A01     // Catch:{ all -> 0x011a }
            X.11P r8 = r12.A02     // Catch:{ all -> 0x011a }
            long r0 = r8.A09(r0)     // Catch:{ all -> 0x011a }
        L_0x00d0:
            X.2lB r13 = r4.A0W(r7, r9, r0)     // Catch:{ all -> 0x011a }
            java.lang.String r8 = r12.A02()     // Catch:{ all -> 0x011a }
            long r15 = r7.A03     // Catch:{ all -> 0x011a }
            long r0 = r7.A02     // Catch:{ all -> 0x011a }
            X.1BI r14 = r7.A04     // Catch:{ all -> 0x011a }
            X.2yJ r11 = new X.2yJ     // Catch:{ all -> 0x011a }
            r17 = r0
            r11.<init>(r12, r13, r14, r15, r17)     // Catch:{ all -> 0x011a }
            r3.put(r8, r11)     // Catch:{ all -> 0x011a }
            goto L_0x0034
        L_0x00ea:
            r0 = 0
            goto L_0x00d0
        L_0x00ed:
            boolean r9 = r8.A0W()     // Catch:{ all -> 0x011a }
            com.whatsapp.jid.GroupJid r8 = r8.A0C     // Catch:{ all -> 0x011a }
            X.1M9 r7 = r5.A01     // Catch:{ all -> 0x011a }
            X.1Mc r1 = r5.A04     // Catch:{ all -> 0x011a }
            X.126 r0 = r5.A03     // Catch:{ all -> 0x011a }
            X.1E7 r7 = X.C63982u1.A01(r7, r0, r8, r1, r9)     // Catch:{ all -> 0x011a }
            X.2lG r0 = r4.A0T(r12, r7)     // Catch:{ all -> 0x011a }
            X.2yP r1 = new X.2yP     // Catch:{ all -> 0x011a }
            r1.<init>(r12, r0, r7)     // Catch:{ all -> 0x011a }
            java.lang.String r0 = r12.A02()     // Catch:{ all -> 0x011a }
            r3.put(r0, r1)     // Catch:{ all -> 0x011a }
            goto L_0x0034
        L_0x010f:
            java.lang.String r0 = "ProcessUpdatedCallLogTask/doInBackground failed to clone call group"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x011a }
            goto L_0x0047
        L_0x0116:
            r6.unlock()
            return r0
        L_0x011a:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49112Pf.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Pair pair = (Pair) obj;
        C41041vi r1 = this.A00;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) pair.first);
        ArrayList A10 = C17880vN.A10((Collection) pair.second);
        CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r1.A00;
        callsHistoryFragmentViewModel.A0B = null;
        if (callsHistoryFragmentViewModel.A00 == 0) {
            callsHistoryFragmentViewModel.A00 = 1;
        }
        callsHistoryFragmentViewModel.A0a(A10, linkedHashMap);
    }

    public C49112Pf(C41041vi r2, CallsHistoryFragmentViewModel callsHistoryFragmentViewModel, AnonymousClass1M9 r4, C27081Uq r5, AnonymousClass126 r6, C24901Mc r7, ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap, Lock lock) {
        this.A00 = r2;
        this.A09 = lock;
        this.A07 = C17880vN.A10(arrayList);
        this.A08 = linkedHashMap;
        this.A06 = arrayList2;
        this.A04 = r7;
        this.A01 = r4;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = new WeakReference(callsHistoryFragmentViewModel);
    }
}
