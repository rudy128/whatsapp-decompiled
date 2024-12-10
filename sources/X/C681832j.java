package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.Set;

/* renamed from: X.32j  reason: invalid class name and case insensitive filesystem */
public final class C681832j implements C25341Nv {
    public final AnonymousClass00H A00;

    public C681832j(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean Bca(AnonymousClass206 r3) {
        C18070vi.A0d(r3, 0);
        if (!(r3 instanceof AnonymousClass21W) || !r3.A0z(DefaultCrypto.BUFFER_SIZE)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.9gX, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e5, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r19) {
        /*
            r18 = this;
            r12 = 0
            r0 = r19
            X.C18070vi.A0d(r0, r12)
            X.206 r11 = r0.A00
            r0 = r18
            X.00H r0 = r0.A00
            java.lang.Object r6 = r0.get()
            X.1hp r6 = (X.C32831hp) r6
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageVideoCommon"
            X.C18070vi.A0z(r11, r0)
            X.21W r11 = (X.AnonymousClass21W) r11
            X.C18070vi.A0d(r11, r12)
            long r2 = r11.A0x
            r7 = 1
            r0 = 0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1R(r4)
            java.lang.String r4 = "MediaCoreMessageStore/loadProcessedVideo/invalid rowId"
            X.C17960vV.A0G(r5, r4)
            java.util.ArrayList r17 = X.AnonymousClass000.A13()
            X.1Cd r4 = r6.A00
            X.1at r10 = r4.get()
            r4 = r10
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x00e2 }
            X.1Ev r6 = r4.A02     // Catch:{ all -> 0x00e2 }
            java.lang.String r5 = "SELECT _id, message_row_id, direct_path, height, width, file_size, bitrate, quality, capabilities FROM media_processed_video WHERE message_row_id = ?"
            java.lang.String[] r4 = new java.lang.String[r7]     // Catch:{ all -> 0x00e2 }
            X.C17880vN.A1V(r4, r12, r2)     // Catch:{ all -> 0x00e2 }
            java.lang.String r2 = "GET_PROCESSED_VIDEOS_BY_MESSAGE_ROW_ID"
            android.database.Cursor r9 = r6.A0A(r5, r2, r4)     // Catch:{ all -> 0x00e2 }
        L_0x0048:
            boolean r2 = r9.moveToNext()     // Catch:{ all -> 0x00db }
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = "direct_path"
            java.lang.String r16 = X.C17890vO.A0S(r9, r2)     // Catch:{ all -> 0x00db }
            X.C18070vi.A0X(r16)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = "height"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00db }
            long r7 = X.AnonymousClass1Eu.A02(r9, r2, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = "width"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00db }
            long r5 = X.AnonymousClass1Eu.A02(r9, r2, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = "file_size"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00db }
            long r3 = X.AnonymousClass1Eu.A02(r9, r2, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r2 = "bitrate"
            int r2 = r9.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00db }
            long r1 = X.AnonymousClass1Eu.A02(r9, r2, r0)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "quality"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00db }
            int r0 = X.AnonymousClass1Eu.A00(r9, r0, r12)     // Catch:{ all -> 0x00db }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00db }
            java.lang.Integer r15 = X.C181059Oz.A00(r0)     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "capabilities"
            java.lang.String r14 = X.C17890vO.A0S(r9, r0)     // Catch:{ all -> 0x00db }
            if (r14 == 0) goto L_0x00c6
            java.lang.String[] r13 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00db }
            java.lang.String r0 = ","
            r13[r12] = r0     // Catch:{ all -> 0x00db }
            java.util.List r14 = X.AnonymousClass1YF.A0S(r14, r13, r12)     // Catch:{ all -> 0x00db }
        L_0x00a6:
            X.C18070vi.A0l(r15, r14)     // Catch:{ all -> 0x00db }
            X.9gX r13 = new X.9gX     // Catch:{ all -> 0x00db }
            r13.<init>()     // Catch:{ all -> 0x00db }
            r0 = r16
            r13.A05 = r0     // Catch:{ all -> 0x00db }
            r13.A02 = r7     // Catch:{ all -> 0x00db }
            r13.A03 = r5     // Catch:{ all -> 0x00db }
            r13.A01 = r3     // Catch:{ all -> 0x00db }
            r13.A00 = r1     // Catch:{ all -> 0x00db }
            r13.A04 = r15     // Catch:{ all -> 0x00db }
            r13.A06 = r14     // Catch:{ all -> 0x00db }
            r0 = r17
            r0.add(r13)     // Catch:{ all -> 0x00db }
            r0 = 0
            goto L_0x0048
        L_0x00c6:
            X.0wS r14 = X.C18460wS.A00     // Catch:{ all -> 0x00db }
            goto L_0x00a6
        L_0x00c9:
            r9.close()     // Catch:{ all -> 0x00e2 }
            r10.close()
            boolean r0 = r17.isEmpty()
            if (r0 != 0) goto L_0x00da
            r0 = r17
            r11.A1H(r0)
        L_0x00da:
            return
        L_0x00db:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            X.CDX.A00(r10, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C681832j.Bhl(X.25F):void");
    }

    public Set BZv() {
        return C18070vi.A0P(C692436l.class);
    }
}
