package X;

import com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.2PJ  reason: invalid class name */
public class AnonymousClass2PJ extends A34 {
    public final /* synthetic */ C40971vb A00;

    public AnonymousClass2PJ(C40971vb r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r9) {
        /*
            r8 = this;
            X.1vb r4 = r8.A00
            X.00H r0 = r4.A0W
            java.lang.Object r0 = r0.get()
            com.whatsapp.favorite.FavoriteManager r0 = (com.whatsapp.favorite.FavoriteManager) r0
            X.1xG r6 = r0.A04
            r0 = 4
            r3 = 0
            java.lang.String[] r5 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0046 }
            X.C17890vO.A1F(r5, r0)     // Catch:{ all -> 0x0046 }
            X.1Cd r0 = r6.A02     // Catch:{ all -> 0x0046 }
            X.1at r7 = r0.get()     // Catch:{ all -> 0x0046 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "SELECT _id, jid_row_id, favorite_type, sort_order FROM favorite ORDER BY sort_order ASC LIMIT ?"
            java.lang.String r0 = "FavoriteStore/FAVORITE_GET_ALL_FAVORITES_WITH_LIMIT"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x003f }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r5 = X.C41891xG.A01(r2, r6)     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0034
            r2.close()     // Catch:{ all -> 0x003f }
        L_0x0034:
            r7.close()     // Catch:{ all -> 0x0046 }
            goto L_0x0055
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r2 = move-exception
            java.lang.String r0 = "FavoriteStore/getAllFavoritesWithLimit failed to retrieve all favorites"
            com.whatsapp.util.Log.e(r0, r2)
            X.190 r1 = r6.A00
            java.lang.String r0 = "FavoriteStore/getAllFavoritesWithLimit"
            r1.A0E(r0, r3, r2)
            X.0wS r5 = X.C18460wS.A00
        L_0x0055:
            java.util.Iterator r3 = r5.iterator()
        L_0x0059:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x007f
            java.lang.Object r2 = r3.next()
            X.2rT r2 = (X.C62482rT) r2
            X.2Qt r1 = r2.A02
            X.2Qt r0 = X.C49512Qt.GROUP
            if (r1 != r0) goto L_0x0059
            X.1BI r1 = r2.A03
            boolean r0 = r1 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0059
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            X.00H r0 = r4.A0X
            java.lang.Object r0 = r0.get()
            X.1MW r0 = (X.AnonymousClass1MW) r0
            r0.A0B(r1)
            goto L_0x0059
        L_0x007f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2PJ.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        List list = (List) obj;
        C40971vb r2 = this.A00;
        r2.A04 = null;
        StringBuilder A10 = AnonymousClass000.A10();
        C17890vO.A15("CallsHistoryDataSource/RefreshFavoritesTask/onPostExecute retrieved ", A10, list);
        C17890vO.A1A(A10, " favorites");
        C41031vh r1 = r2.A07;
        if (r1 != null) {
            Log.i("CallsHistoryViewModel/onOngoingCallLogUpdated");
            CallsHistoryFragmentViewModel callsHistoryFragmentViewModel = r1.A00;
            callsHistoryFragmentViewModel.A0G = list;
            CallsHistoryFragmentViewModel.A06(callsHistoryFragmentViewModel);
        }
    }
}
