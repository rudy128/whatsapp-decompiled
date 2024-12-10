package X;

/* renamed from: X.7IX  reason: invalid class name */
public final class AnonymousClass7IX implements C1607289r {
    public final AnonymousClass118 A00;
    public final AnonymousClass190 A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0088, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBh(java.util.List r8) {
        /*
            r7 = this;
            r3 = 0
            X.C18070vi.A0d(r8, r3)
            X.118 r0 = r7.A00     // Catch:{ IOException -> 0x008d }
            android.content.Context r0 = r0.A00     // Catch:{ IOException -> 0x008d }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ IOException -> 0x008d }
            java.lang.String r0 = "reactions"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)     // Catch:{ IOException -> 0x008d }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ IOException -> 0x008d }
            r1.<init>(r0)     // Catch:{ IOException -> 0x008d }
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ IOException -> 0x008d }
            r0.<init>(r1)     // Catch:{ IOException -> 0x008d }
            android.util.JsonWriter r4 = new android.util.JsonWriter     // Catch:{ IOException -> 0x008d }
            r4.<init>(r0)     // Catch:{ IOException -> 0x008d }
            r4.beginObject()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "data"
            r4.name(r0)     // Catch:{ all -> 0x0086 }
            r4.beginObject()     // Catch:{ all -> 0x0086 }
            java.util.Iterator r6 = r8.iterator()     // Catch:{ all -> 0x0086 }
        L_0x0030:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x0086 }
            X.7Ib r5 = (X.C144627Ib) r5     // Catch:{ all -> 0x0086 }
            int[] r0 = r5.A04     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = X.C137176v2.A01(r0)     // Catch:{ all -> 0x0086 }
            r4.name(r0)     // Catch:{ all -> 0x0086 }
            r4.beginObject()     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "weight"
            android.util.JsonWriter r2 = r4.name(r0)     // Catch:{ all -> 0x0086 }
            float r0 = r5.A00     // Catch:{ all -> 0x0086 }
            double r0 = (double) r0     // Catch:{ all -> 0x0086 }
            r2.value(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "lastUsed"
            android.util.JsonWriter r2 = r4.name(r0)     // Catch:{ all -> 0x0086 }
            long r0 = r5.A02     // Catch:{ all -> 0x0086 }
            r2.value(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "added"
            android.util.JsonWriter r2 = r4.name(r0)     // Catch:{ all -> 0x0086 }
            long r0 = r5.A01     // Catch:{ all -> 0x0086 }
            r2.value(r0)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = "reactsAgo"
            android.util.JsonWriter r2 = r4.name(r0)     // Catch:{ all -> 0x0086 }
            long r0 = r5.A03     // Catch:{ all -> 0x0086 }
            r2.value(r0)     // Catch:{ all -> 0x0086 }
            r4.endObject()     // Catch:{ all -> 0x0086 }
            goto L_0x0030
        L_0x0079:
            r4.endObject()     // Catch:{ all -> 0x0086 }
            r4.endObject()     // Catch:{ all -> 0x0086 }
            r4.close()     // Catch:{ all -> 0x0086 }
            r4.close()     // Catch:{ IOException -> 0x008d }
            return
        L_0x0086:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ IOException -> 0x008d }
            throw r0     // Catch:{ IOException -> 0x008d }
        L_0x008d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.190 r2 = r7.A01
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "frequentreactions/save-error"
            r2.A0G(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IX.CBh(java.util.List):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.7Ib, java.lang.Object, X.8AP] */
    public /* bridge */ /* synthetic */ AnonymousClass8AP BHM(Object obj, float f) {
        int[] iArr = (int[]) obj;
        C18070vi.A0d(iArr, 0);
        long currentTimeMillis = System.currentTimeMillis();
        ? obj2 = new Object();
        obj2.A04 = iArr;
        obj2.A00 = f;
        obj2.A01 = currentTimeMillis;
        obj2.A02 = currentTimeMillis;
        obj2.A03 = 0;
        return obj2;
    }

    /* JADX WARNING: type inference failed for: r0v23, types: [X.7Ib, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList Bd5() {
        /*
            r13 = this;
            X.118 r0 = r13.A00
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "reactions"
            java.io.File r4 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r4.exists()
            r12 = 0
            if (r0 == 0) goto L_0x00eb
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x00d6 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ Exception -> 0x00d6 }
            r0.<init>(r4)     // Catch:{ Exception -> 0x00d6 }
            android.util.JsonReader r11 = new android.util.JsonReader     // Catch:{ Exception -> 0x00d6 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x00d6 }
            r11.beginObject()     // Catch:{ all -> 0x00cf }
        L_0x0026:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x008c
            java.lang.String r1 = "data"
            java.lang.String r0 = r11.nextName()     // Catch:{ all -> 0x00cf }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0088
            r11.beginObject()     // Catch:{ all -> 0x00cf }
        L_0x003b:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00cf }
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = r11.nextName()     // Catch:{ all -> 0x00cf }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00cf }
            X.737 r3 = X.C137176v2.A00(r0)     // Catch:{ all -> 0x00cf }
            r11.beginObject()     // Catch:{ all -> 0x00cf }
            r11.nextName()     // Catch:{ all -> 0x00cf }
            double r0 = r11.nextDouble()     // Catch:{ all -> 0x00cf }
            float r10 = (float) r0     // Catch:{ all -> 0x00cf }
            r11.nextName()     // Catch:{ all -> 0x00cf }
            long r7 = r11.nextLong()     // Catch:{ all -> 0x00cf }
            r11.nextName()     // Catch:{ all -> 0x00cf }
            long r5 = r11.nextLong()     // Catch:{ all -> 0x00cf }
            r11.nextName()     // Catch:{ all -> 0x00cf }
            long r1 = r11.nextLong()     // Catch:{ all -> 0x00cf }
            int[] r3 = r3.A00     // Catch:{ all -> 0x00cf }
            X.7Ib r0 = new X.7Ib     // Catch:{ all -> 0x00cf }
            r0.<init>()     // Catch:{ all -> 0x00cf }
            r0.A04 = r3     // Catch:{ all -> 0x00cf }
            r0.A00 = r10     // Catch:{ all -> 0x00cf }
            r0.A01 = r5     // Catch:{ all -> 0x00cf }
            r0.A02 = r7     // Catch:{ all -> 0x00cf }
            r0.A03 = r1     // Catch:{ all -> 0x00cf }
            r9.add(r0)     // Catch:{ all -> 0x00cf }
            r11.endObject()     // Catch:{ all -> 0x00cf }
            goto L_0x003b
        L_0x0084:
            r11.endObject()     // Catch:{ all -> 0x00cf }
            goto L_0x0026
        L_0x0088:
            r11.skipValue()     // Catch:{ all -> 0x00cf }
            goto L_0x0026
        L_0x008c:
            r11.endObject()     // Catch:{ all -> 0x00cf }
            r11.close()     // Catch:{ all -> 0x00cf }
            r11.close()     // Catch:{ Exception -> 0x00d6 }
            r12 = r9
            X.0ve r2 = r13.A03     // Catch:{ Exception -> 0x00d6 }
            r1 = 2880(0xb40, float:4.036E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x00d6 }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x00d6 }
            if (r0 != 0) goto L_0x00eb
            X.0vq r0 = X.C124576Yw.A00     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x00d6 }
            java.util.Set r3 = (java.util.Set) r3     // Catch:{ Exception -> 0x00d6 }
            java.util.Iterator r2 = r9.iterator()     // Catch:{ Exception -> 0x00d6 }
        L_0x00ae:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x00d6 }
            X.7Ib r0 = (X.C144627Ib) r0     // Catch:{ Exception -> 0x00d6 }
            int[] r0 = r0.A04     // Catch:{ Exception -> 0x00d6 }
            int[] r1 = X.AnonymousClass74I.A07(r0)     // Catch:{ Exception -> 0x00d6 }
            X.737 r0 = new X.737     // Catch:{ Exception -> 0x00d6 }
            r0.<init>((int[]) r1)     // Catch:{ Exception -> 0x00d6 }
            boolean r0 = r3.contains(r0)     // Catch:{ Exception -> 0x00d6 }
            if (r0 == 0) goto L_0x00ae
            r2.remove()     // Catch:{ Exception -> 0x00d6 }
            goto L_0x00ae
        L_0x00cf:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ Exception -> 0x00d6 }
            throw r0     // Catch:{ Exception -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            java.lang.String r0 = "frequentreactions/readfrequent "
            com.whatsapp.util.Log.e(r0, r1)
            X.190 r3 = r13.A01
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "frequentreactions/load-error"
            r3.A0G(r0, r2, r1)
            r4.delete()
        L_0x00eb:
            if (r12 != 0) goto L_0x00f1
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
        L_0x00f1:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IX.Bd5():java.util.ArrayList");
    }

    public AnonymousClass7IX(AnonymousClass190 r1, AnonymousClass11P r2, AnonymousClass118 r3, C18030ve r4) {
        C18070vi.A0s(r2, r4, r1, r3);
        this.A02 = r2;
        this.A03 = r4;
        this.A01 = r1;
        this.A00 = r3;
    }
}
