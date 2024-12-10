package X;

/* renamed from: X.4RS  reason: invalid class name */
public class AnonymousClass4RS {
    public final C51892a0 A00;
    public final AnonymousClass1HB A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.AnonymousClass1E7 r10) {
        /*
            r9 = this;
            X.1HB r7 = r9.A01
            X.4pt r2 = new X.4pt
            r2.<init>(r9, r10)
            X.19a r5 = r7.A01
            X.19Y r1 = r5.A06
            X.19b r0 = r5.A05
            int r0 = r0.A06
            r1.Bit(r2, r0)
            X.1BI r6 = X.AnonymousClass1E7.A00(r10)
            if (r6 == 0) goto L_0x00da
            X.00H r0 = r9.A03
            java.lang.Object r0 = r0.get()
            X.1Nb r0 = (X.AnonymousClass1Nb) r0
            X.1yM r0 = r0.A0Z(r6)
            if (r0 == 0) goto L_0x002e
            boolean r2 = r0.A0S
            java.lang.String r1 = "is_pinned_chat"
            r0 = 0
            r7.A00(r1, r2, r0)
        L_0x002e:
            X.2a0 r3 = r9.A00
            monitor-enter(r3)
            java.util.Set r2 = r3.A00     // Catch:{ all -> 0x00d7 }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x003d
            r2.add(r6)     // Catch:{ all -> 0x00d7 }
            goto L_0x0058
        L_0x003d:
            int r1 = r2.size()     // Catch:{ all -> 0x00d7 }
            r8 = 3
            r0 = 100
            if (r0 != r1) goto L_0x004d
            boolean r0 = r2.contains(r6)     // Catch:{ all -> 0x00d7 }
            if (r0 != 0) goto L_0x0056
            goto L_0x0055
        L_0x004d:
            boolean r0 = r2.add(r6)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0056
            r8 = 1
            goto L_0x0056
        L_0x0055:
            r8 = 4
        L_0x0056:
            monitor-exit(r3)
            goto L_0x005a
        L_0x0058:
            monitor-exit(r3)
            r8 = 2
        L_0x005a:
            java.lang.String r4 = "is_first_chat_open_after_start"
            java.lang.String r2 = "is_first_chat_open"
            r1 = 1
            r3 = 0
            if (r8 == r1) goto L_0x00d3
            r0 = 2
            if (r8 == r0) goto L_0x00cc
            r0 = 3
            if (r8 != r0) goto L_0x006e
            r7.A00(r2, r3, r3)
        L_0x006b:
            r7.A00(r4, r3, r3)
        L_0x006e:
            X.00H r2 = r9.A04
            java.lang.Object r0 = r2.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            int r0 = r0.A03(r6)
            r1 = 0
            if (r0 <= 0) goto L_0x007e
            r3 = 1
        L_0x007e:
            java.lang.String r0 = "has_unread_messages"
            r7.A00(r0, r3, r1)
            java.lang.Object r0 = r2.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            long r1 = r0.A08(r6)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00ae
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00ae
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toMinutes(r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00af
            java.lang.String r2 = "less_1_minute"
        L_0x00a8:
            java.lang.String r1 = "time_of_last_message"
            r0 = 0
            r5.A0A(r1, r2, r0)
        L_0x00ae:
            return
        L_0x00af:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toHours(r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00bc
            java.lang.String r2 = "less_1_hour"
            goto L_0x00a8
        L_0x00bc:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = r0.toDays(r3)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c9
            java.lang.String r2 = "less_1_day"
            goto L_0x00a8
        L_0x00c9:
            java.lang.String r2 = "more_1_day"
            goto L_0x00a8
        L_0x00cc:
            r7.A00(r2, r1, r3)
            r7.A00(r4, r1, r3)
            goto L_0x006e
        L_0x00d3:
            r7.A00(r2, r1, r3)
            goto L_0x006b
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00da:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4RS.A00(X.1E7):void");
    }

    public AnonymousClass4RS(C51892a0 r1, AnonymousClass1HB r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        this.A02 = r3;
        this.A04 = r4;
        this.A07 = r5;
        this.A03 = r6;
        this.A08 = r7;
        this.A01 = r2;
        this.A05 = r8;
        this.A06 = r9;
        this.A09 = r10;
        this.A00 = r1;
    }
}
