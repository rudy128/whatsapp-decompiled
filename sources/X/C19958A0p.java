package X;

import java.io.IOException;

/* renamed from: X.A0p  reason: case insensitive filesystem */
public final class C19958A0p {
    public AiK A00;
    public final C196109uT A01;
    public final AnonymousClass118 A02;

    private final AiK A00() {
        AiK aiK;
        synchronized (this) {
            aiK = this.A00;
            if (aiK == null) {
                try {
                    aiK = AiK.A01((C183489Yl) null, C17880vN.A0e(C108945cZ.A16(this.A02), "FLOWS_ENTRYPOINT_METADATA_CACHE"), 1048576);
                } catch (IOException e) {
                    C108995ce.A1M("FlowsLogger/FlowsEntrypointMetadataCache/init: ", AnonymousClass000.A10(), e);
                    aiK = null;
                }
                this.A00 = aiK;
            }
        }
        return aiK;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0073, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0076, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C194419rh r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.io.ByteArrayOutputStream r3 = X.C108945cZ.A15()
            java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0070 }
            r4.<init>(r3)     // Catch:{ all -> 0x0070 }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ all -> 0x0069 }
            int r0 = r6.A00     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = "FLOW_ENTRY_POINT"
            r2.put(r0, r1)     // Catch:{ all -> 0x0069 }
            java.lang.Integer r0 = r6.A01     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "CLICK_SEQUENCE_NUMBER"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0069 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0069 }
        L_0x002d:
            r4.writeObject(r2)     // Catch:{ all -> 0x0069 }
            r4.close()     // Catch:{ all -> 0x0070 }
            byte[] r1 = r3.toByteArray()     // Catch:{ all -> 0x0070 }
            r3.close()
            X.C18070vi.A0X(r1)
            X.AiK r0 = r5.A00()
            if (r0 == 0) goto L_0x0068
            X.9oK r0 = X.AiK.A00(r0, r7)
            if (r0 == 0) goto L_0x0068
            X.9HU r2 = r0.A00()     // Catch:{ IOException -> 0x005e }
            r2.write(r1)     // Catch:{ all -> 0x0057 }
            r0.A01()     // Catch:{ all -> 0x0057 }
            r2.close()     // Catch:{ IOException -> 0x005e }
            return
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ IOException -> 0x005e }
            throw r0     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FlowsLogger/FlowsEntrypointMetadataCache/writeToDisk: "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x0068:
            return
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19958A0p.A02(X.9rh, java.lang.String):void");
    }

    public C19958A0p(AnonymousClass118 r1, C196109uT r2) {
        C18070vi.A0j(r1, r2);
        this.A02 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0072, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C194419rh A01(java.lang.String r5) {
        /*
            r4 = this;
            X.AiK r0 = r4.A00()
            if (r0 == 0) goto L_0x0073
            X.AiB r0 = r0.A0B(r5)
            if (r0 == 0) goto L_0x0073
            r1 = 0
            java.io.InputStream[] r0 = r0.A00
            r3 = r0[r1]
            int r0 = r3.available()     // Catch:{ all -> 0x006c }
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x006c }
            r3.read(r1)     // Catch:{ all -> 0x006c }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x006c }
            r0.<init>(r1)     // Catch:{ all -> 0x006c }
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ all -> 0x006c }
            r2.<init>(r0)     // Catch:{ all -> 0x006c }
            java.lang.Object r1 = r2.readObject()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x0065 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0065 }
            r2.close()     // Catch:{ all -> 0x006c }
            r3.close()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.String r0 = "FLOW_ENTRY_POINT"
            java.lang.String r0 = X.C17880vN.A0s(r0, r1)
            r3 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.Integer r0 = X.AnonymousClass1YD.A03(r0)
            if (r0 == 0) goto L_0x0064
            int r2 = r0.intValue()
            java.lang.String r0 = "CLICK_SEQUENCE_NUMBER"
            java.lang.String r0 = X.C17880vN.A0s(r0, r1)
            if (r0 == 0) goto L_0x0058
            java.lang.Integer r3 = X.AnonymousClass1YD.A03(r0)
        L_0x0058:
            java.lang.String r0 = "AD_CONTEXT"
            java.lang.String r1 = X.C17880vN.A0s(r0, r1)
            X.9rh r0 = new X.9rh
            r0.<init>(r3, r1, r2)
            return r0
        L_0x0064:
            return r3
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006c }
            throw r0     // Catch:{ all -> 0x006c }
        L_0x006c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0073:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19958A0p.A01(java.lang.String):X.9rh");
    }
}
