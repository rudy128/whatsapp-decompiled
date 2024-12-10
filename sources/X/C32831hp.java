package X;

/* renamed from: X.1hp  reason: invalid class name and case insensitive filesystem */
public final class C32831hp {
    public final AnonymousClass1Cd A00;

    public C32831hp(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00aa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass21W r10) {
        /*
            r9 = this;
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.util.List r1 = r10.A1G()
            if (r1 == 0) goto L_0x00b2
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b2
            X.1Cd r0 = r9.A00
            X.1au r5 = r0.A05()
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x00ab }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x00a4 }
        L_0x001e:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00a4 }
            r4 = 0
            if (r0 == 0) goto L_0x009a
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x00a4 }
            X.9gX r3 = (X.C187889gX) r3     // Catch:{ all -> 0x00a4 }
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x00a4 }
            r2.<init>()     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "message_row_id"
            long r0 = r10.A0x     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            r2.put(r7, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A01(r2, r1, r0)     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "file_size"
            long r0 = r3.A01     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A00(r2, r0, r7)     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "height"
            long r0 = r3.A02     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A00(r2, r0, r7)     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "width"
            long r0 = r3.A03     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A00(r2, r0, r7)     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "bitrate"
            long r0 = r3.A00     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A00(r2, r0, r7)     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "quality"
            java.lang.Integer r0 = r3.A04     // Catch:{ all -> 0x00a4 }
            long r0 = X.AnonymousClass9P0.A00(r0)     // Catch:{ all -> 0x00a4 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A00(r2, r0, r7)     // Catch:{ all -> 0x00a4 }
            java.lang.String r7 = "capabilities"
            java.util.List r3 = r3.A06     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = ","
            java.lang.String r0 = ""
            java.lang.String r0 = X.C29431cG.A0g(r1, r0, r0, r3, r4)     // Catch:{ all -> 0x00a4 }
            X.C63432t4.A01(r2, r7, r0)     // Catch:{ all -> 0x00a4 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a4 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00a4 }
            java.lang.String r1 = "media_processed_video"
            java.lang.String r0 = "INSERT_MESSAGE_MEDIA_PROCESSED_VIDEO"
            r3.A05(r1, r0, r2)     // Catch:{ all -> 0x00a4 }
            goto L_0x001e
        L_0x009a:
            r6.A00()     // Catch:{ all -> 0x00a4 }
            r6.close()     // Catch:{ all -> 0x00ab }
            r5.close()
            return
        L_0x00a4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32831hp.A00(X.21W):void");
    }
}
