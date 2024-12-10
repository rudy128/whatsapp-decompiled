package X;

/* renamed from: X.9z4  reason: invalid class name and case insensitive filesystem */
public abstract class C198879z4 {
    public static final String A00 = A5Z.A01("WorkerFactory");

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0073 A[Catch:{ all -> 0x00bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20001A2q A01(android.content.Context r8, androidx.work.WorkerParameters r9, java.lang.String r10) {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.AnonymousClass8K5
            if (r0 == 0) goto L_0x0066
            X.8K5 r6 = (X.AnonymousClass8K5) r6
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r8)
            java.lang.String r0 = "ObservableWorkerFactory/Creating worker "
            X.C17900vP.A0f(r0, r10, r1)
            X.3LU r4 = r6.A01
            r0 = r4
            X.Ai7 r0 = (X.C21322Ai7) r0
            java.util.concurrent.ConcurrentHashMap r1 = r0.A03
            java.lang.Object r0 = r1.get(r10)
            if (r0 != 0) goto L_0x0021
            java.lang.Long r0 = X.C17890vO.A0L()
        L_0x0021:
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Long r0 = X.C108995ce.A0T(r0)
            r1.put(r10, r0)
            java.lang.Class r1 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x005c }
            java.lang.Class<X.A2q> r0 = X.C20001A2q.class
            java.lang.Class r5 = r1.asSubclass(r0)     // Catch:{ all -> 0x005c }
            if (r5 == 0) goto L_0x0066
            r3 = 2
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x0054 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0054 }
            java.lang.Class<androidx.work.WorkerParameters> r1 = androidx.work.WorkerParameters.class
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0054 }
            java.lang.reflect.Constructor r1 = r5.getDeclaredConstructor(r2)     // Catch:{ all -> 0x0054 }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r8, r9, r3, r0)     // Catch:{ all -> 0x0054 }
            java.lang.Object r1 = r1.newInstance(r0)     // Catch:{ all -> 0x0054 }
            X.A2q r1 = (X.C20001A2q) r1     // Catch:{ all -> 0x0054 }
            if (r1 == 0) goto L_0x0066
            goto L_0x0092
        L_0x0054:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ObservableWorkerFactory/Could not instantiate "
            goto L_0x0063
        L_0x005c:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ObservableWorkerFactory/Invalid class: "
        L_0x0063:
            X.C17900vP.A0h(r0, r10, r1, r2)
        L_0x0066:
            r5 = 0
            java.lang.Class r1 = java.lang.Class.forName(r10)     // Catch:{ all -> 0x00bc }
            java.lang.Class<X.A2q> r0 = X.C20001A2q.class
            java.lang.Class r4 = r1.asSubclass(r0)     // Catch:{ all -> 0x00bc }
            if (r4 == 0) goto L_0x00de
            r3 = 2
            java.lang.Class[] r2 = new java.lang.Class[r3]     // Catch:{ all -> 0x00ca }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x00ca }
            java.lang.Class<androidx.work.WorkerParameters> r1 = androidx.work.WorkerParameters.class
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x00ca }
            java.lang.reflect.Constructor r1 = r4.getDeclaredConstructor(r2)     // Catch:{ all -> 0x00ca }
            java.lang.Object[] r0 = X.C108945cZ.A1a(r8, r9, r3, r0)     // Catch:{ all -> 0x00ca }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x00ca }
            X.A2q r0 = (X.C20001A2q) r0     // Catch:{ all -> 0x00ca }
            r5 = r0
            if (r0 == 0) goto L_0x00de
            goto L_0x0099
        L_0x0092:
            X.11P r0 = r6.A00
            com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker r5 = new com.whatsapp.workmanager.ObservableWorkerFactory$LogExceptionsWorker
            r5.<init>(r1, r4, r0, r9)
        L_0x0099:
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x00de
            java.lang.String r2 = X.C17890vO.A0U(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WorkerFactory ("
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ") returned an instance of a ListenableWorker ("
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x00bc:
            r4 = move-exception
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid class: "
            goto L_0x00d7
        L_0x00ca:
            r4 = move-exception
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Could not instantiate "
        L_0x00d7:
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r10, r1)
            r3.A08(r2, r0, r4)
        L_0x00de:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198879z4.A01(android.content.Context, androidx.work.WorkerParameters, java.lang.String):X.A2q");
    }

    public static AnonymousClass8K4 A00() {
        return new AnonymousClass8K4();
    }
}
