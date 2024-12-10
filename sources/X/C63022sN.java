package X;

import android.content.ContentValues;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2sN  reason: invalid class name and case insensitive filesystem */
public final class C63022sN {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass1DL A01;

    public static final void A00(ContentValues contentValues, C63022sN r3, AnonymousClass22S r4, long j) {
        C17880vN.A19(contentValues, "message_row_id", j);
        UserJid userJid = r4.A00;
        if (userJid != null) {
            contentValues.put("business_owner_jid", AnonymousClass1DL.A04(r3.A01, userJid));
        }
        C63432t4.A01(contentValues, "title", r4.A02);
        C63432t4.A01(contentValues, "description", r4.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C63022sN r7, X.AnonymousClass22S r8, java.lang.String r9, java.lang.String r10) {
        /*
            long r1 = r8.A0x
            r5 = 0
            r3 = 1
            r4 = 0
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            boolean r2 = X.AnonymousClass000.A1R(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CatalogMessageStore/fillCatalogDataIfAvailable/message must have row_id set; key="
            java.lang.String r0 = X.AnonymousClass206.A03(r8, r0, r1)
            X.C17960vV.A0G(r2, r0)
            java.lang.String[] r3 = new java.lang.String[r3]
            long r0 = r8.A0x
            X.C17880vN.A1V(r3, r4, r0)
            X.1Cd r0 = r7.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0066 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0066 }
            android.database.Cursor r5 = r0.A0A(r9, r10, r3)     // Catch:{ all -> 0x0066 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0058
            X.1DL r4 = r7.A01     // Catch:{ all -> 0x005f }
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "business_owner_jid"
            long r0 = X.C17890vO.A06(r5, r0)     // Catch:{ all -> 0x005f }
            com.whatsapp.jid.Jid r0 = r4.A0E(r3, r0)     // Catch:{ all -> 0x005f }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x005f }
            r8.A00 = r0     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "title"
            java.lang.String r0 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x005f }
            r8.A02 = r0     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "description"
            java.lang.String r0 = X.C17890vO.A0S(r5, r0)     // Catch:{ all -> 0x005f }
            r8.A01 = r0     // Catch:{ all -> 0x005f }
        L_0x0058:
            r5.close()     // Catch:{ all -> 0x0066 }
            r2.close()
            return
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63022sN.A01(X.2sN, X.22S, java.lang.String, java.lang.String):void");
    }

    public C63022sN(AnonymousClass1DL r1, AnonymousClass1Cd r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
