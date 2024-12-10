package X;

/* renamed from: X.38y  reason: invalid class name and case insensitive filesystem */
public final class C698938y implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public C698938y(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0060, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0064, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0067, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            r7 = 0
            X.C18070vi.A0d(r9, r7)
            boolean r0 = r9 instanceof X.C442822v
            if (r0 == 0) goto L_0x0068
            X.00H r0 = r8.A00
            X.1RR r2 = X.C17880vN.A0N(r0)
            X.22v r9 = (X.C442822v) r9
            X.C18070vi.A0d(r9, r7)
            long r0 = r9.A0x
            int r0 = X.AnonymousClass1RR.A00(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A17(r0)
            long r3 = r9.A0x
            X.0vl r0 = r2.A0J
            java.lang.Object r0 = r0.getValue()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0061 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0061 }
            java.lang.String r2 = "SELECT ephemeral_trigger FROM message_ephemeral_setting WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0061 }
            X.C17880vN.A1U(r1, r7, r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "GET_EPHEMERAL_SETTING_TRIGGER"
            android.database.Cursor r2 = r6.A0A(r2, r0, r1)     // Catch:{ all -> 0x0061 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "ephemeral_trigger"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x005a }
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0085
        L_0x0052:
            r2.close()     // Catch:{ all -> 0x0061 }
            r5.close()
            r0 = 0
            goto L_0x0088
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0068:
            boolean r0 = r9 instanceof X.C442622t
            if (r0 == 0) goto L_0x008a
            X.00H r0 = r8.A00
            X.1RR r2 = X.C17880vN.A0N(r0)
            X.22t r9 = (X.C442622t) r9
            X.C18070vi.A0d(r9, r7)
            long r0 = r9.A0x
            int r0 = X.AnonymousClass1RR.A00(r2, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9.A17(r0)
            return
        L_0x0085:
            r5.close()
        L_0x0088:
            r9.A04 = r0
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C698938y.BL9(X.206):void");
    }

    public void BdY(AnonymousClass206 r10) {
        C18070vi.A0d(r10, 0);
        if (r10 instanceof C442822v) {
            AnonymousClass00H r0 = this.A00;
            AnonymousClass1RR A0N = C17880vN.A0N(r0);
            long j = r10.A0x;
            C442822v r102 = (C442822v) r10;
            A0N.A06((Boolean) null, r102.A00, 0, 0, j);
            C17880vN.A0N(r0).A05((C29691ci) null, r102);
        } else if (r10 instanceof C442622t) {
            AnonymousClass00H r02 = this.A00;
            C442622t r1 = (C442622t) r10;
            C17880vN.A0N(r02).A06((Boolean) null, r1.A00, r10.A00, 0, r10.A0x);
            C17880vN.A0N(r02).A03(r1);
        }
    }

    public void CQL(AnonymousClass206 r11) {
        C18070vi.A0d(r11, 0);
        if (r11 instanceof C442822v) {
            AnonymousClass00H r0 = this.A00;
            AnonymousClass1RR A0N = C17880vN.A0N(r0);
            long j = r11.A0x;
            C442822v r2 = (C442822v) r11;
            A0N.A06(r11.A0Q, r2.A00, 0, r11.A04, j);
            C17880vN.A0N(r0).A05((C29691ci) null, r2);
        } else if (r11 instanceof C442622t) {
            AnonymousClass00H r02 = this.A00;
            AnonymousClass1RR A0N2 = C17880vN.A0N(r02);
            long j2 = r11.A0x;
            C442622t r1 = (C442622t) r11;
            A0N2.A06(r11.A0Q, r1.A00, r11.A00, r11.A04, j2);
            C17880vN.A0N(r02).A03(r1);
        }
    }
}
