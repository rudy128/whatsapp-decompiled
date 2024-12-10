package X;

/* renamed from: X.C5w  reason: case insensitive filesystem */
public class C24481C5w {
    public C28503E4l A00;

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C25669Cjz A00(android.os.Bundle r9) {
        /*
            r8 = this;
            java.lang.String r0 = "error_code"
            r3 = 1
            int r7 = r9.getInt(r0, r3)
            java.lang.String r1 = "exception"
            android.os.Parcelable r0 = r9.getParcelable(r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            r6 = 0
            if (r0 == 0) goto L_0x002e
            java.io.Serializable r0 = r0.getSerializable(r1)     // Catch:{ all -> 0x0020 }
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r1 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0022 }
            goto L_0x0031
        L_0x001d:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x0022 }
            goto L_0x0031
        L_0x0020:
            r2 = move-exception
            goto L_0x0024
        L_0x0022:
            r2 = move-exception
            r6 = r0
        L_0x0024:
            X.E4l r1 = r8.A00
            java.lang.String r0 = "IpcExceptionFactory_DESERIALIZATION_FAILED"
            r1.CFJ(r0, r2)
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x0032
        L_0x002e:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x0032
        L_0x0031:
            r6 = r0
        L_0x0032:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x003b
            java.lang.String r0 = "serialization_result"
            r9.getBoolean(r0, r3)
        L_0x003b:
            java.lang.String r0 = "stringified_exception"
            java.lang.String r5 = r9.getString(r0)
            java.lang.String r0 = "exception_hierarchies"
            java.util.ArrayList r0 = r9.getStringArrayList(r0)
            X.2AI r4 = X.AnonymousClass1IX.builder()
            if (r0 == 0) goto L_0x0077
            X.2AI r3 = X.AnonymousClass1IX.builder()
            java.util.Iterator r2 = r0.iterator()
        L_0x0055:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.String r1 = X.C17880vN.A0v(r2)
            java.lang.String r0 = "--"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0073
            X.1IX r0 = r3.build()
            r4.add((java.lang.Object) r0)
            X.2AI r3 = X.AnonymousClass1IX.builder()
            goto L_0x0055
        L_0x0073:
            r3.add((java.lang.Object) r1)
            goto L_0x0055
        L_0x0077:
            X.1IX r1 = r4.build()
            X.Cjz r0 = new X.Cjz
            r0.<init>(r1, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24481C5w.A00(android.os.Bundle):X.Cjz");
    }
}
