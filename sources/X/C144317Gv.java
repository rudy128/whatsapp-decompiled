package X;

import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.Set;

/* renamed from: X.7Gv  reason: invalid class name and case insensitive filesystem */
public final class C144317Gv implements C25341Nv {
    public final C24681Lg A00;
    public final C18030ve A01;
    public final C18100vl A02 = AnonymousClass1DF.A01(new C150647l1(this));
    public final AnonymousClass1KB A03;
    public final AnonymousClass00H A04;

    public boolean Bca(AnonymousClass206 r5) {
        C18070vi.A0d(r5, 0);
        if (!(r5 instanceof C441822l) || r5.A0E() == 2 || !C72453Mb.A1a(this.A02) || !r5.A0z(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0093, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0097, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009b, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bhl(X.AnonymousClass25F r15) {
        /*
            r14 = this;
            r0 = 0
            X.C18070vi.A0d(r15, r0)
            X.206 r4 = r15.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageAudio"
            X.C18070vi.A0z(r4, r0)
            X.22k r4 = (X.C441722k) r4
            X.0vl r0 = r14.A02
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x00b1
            X.00H r0 = r14.A04
            java.lang.Object r0 = r0.get()
            X.6lK r0 = (X.C131576lK) r0
            r9 = 0
            X.C18070vi.A0d(r4, r9)
            long r5 = r4.A0x
            X.1Cd r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0098 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0098 }
            java.lang.String r2 = "\n          SELECT\n            message_row_id,\n            substring_start,\n            substring_length,\n            timestamp,\n            duration,\n            confidence\n          FROM transcription_segment\n          WHERE message_row_id = ?\n        "
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0098 }
            r7 = 0
            r1[r9] = r0     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "GET_AUDIO_DATA_SQL"
            android.database.Cursor r5 = r8.A0A(r2, r0, r1)     // Catch:{ all -> 0x0098 }
            int r6 = r5.getCount()     // Catch:{ all -> 0x0091 }
            java.util.ArrayList r2 = X.C17880vN.A0z(r6)     // Catch:{ all -> 0x0091 }
        L_0x0049:
            if (r7 >= r6) goto L_0x008d
            r5.moveToPosition(r7)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "substring_start"
            int r9 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "substring_length"
            int r10 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "timestamp"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0091 }
            r12 = -1
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x006b
            int r12 = r5.getInt(r1)     // Catch:{ all -> 0x0091 }
        L_0x006b:
            java.lang.String r0 = "duration"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0091 }
            r13 = -1
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x0091 }
            if (r0 != 0) goto L_0x007c
            int r13 = r5.getInt(r1)     // Catch:{ all -> 0x0091 }
        L_0x007c:
            java.lang.String r0 = "confidence"
            int r11 = X.C17890vO.A01(r5, r0)     // Catch:{ all -> 0x0091 }
            X.6t3 r8 = new X.6t3     // Catch:{ all -> 0x0091 }
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0091 }
            r2.add(r8)     // Catch:{ all -> 0x0091 }
            int r7 = r7 + 1
            goto L_0x0049
        L_0x008d:
            r5.close()     // Catch:{ all -> 0x0098 }
            goto L_0x009f
        L_0x0091:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0093 }
        L_0x0093:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x009f:
            r3.close()
            r4.A1I(r2)
            X.1KB r2 = r14.A03
            r1 = 14
            X.7Qq r0 = new X.7Qq
            r0.<init>(r14, r4, r1)
            r2.A0J(r0)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C144317Gv.Bhl(X.25F):void");
    }

    public Set BZv() {
        return C18070vi.A0P(AnonymousClass7LE.class);
    }

    public C144317Gv(AnonymousClass1KB r2, C24681Lg r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0s(r5, r3, r2, r4);
        this.A04 = r5;
        this.A00 = r3;
        this.A03 = r2;
        this.A01 = r4;
    }
}
