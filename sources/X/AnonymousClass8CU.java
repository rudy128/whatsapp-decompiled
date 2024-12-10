package X;

import android.os.AsyncTask;

/* renamed from: X.8CU  reason: invalid class name */
public final class AnonymousClass8CU extends AsyncTask {
    public final A34 A00;

    private void A00() {
        A34 a34 = this.A00;
        AnonymousClass1F9 r0 = a34.A01;
        if (r0 != null) {
            AnonymousClass1GC r1 = a34.A00;
            if (r1 != null) {
                r0.getLifecycle().A06(r1);
            }
            a34.A01 = null;
        }
    }

    public final Object doInBackground(Object... objArr) {
        return this.A00.A0G(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled(java.lang.Object r2) {
        /*
            r1 = this;
            X.A34 r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0D(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CU.onCancelled(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPostExecute(java.lang.Object r2) {
        /*
            r1 = this;
            X.A34 r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0H(r2)     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CU.onPostExecute(java.lang.Object):void");
    }

    public void onPreExecute() {
        this.A00.A0F();
    }

    public final void onProgressUpdate(Object... objArr) {
        this.A00.A0I(objArr);
    }

    public AnonymousClass8CU(A34 a34) {
        this.A00 = a34;
    }

    public void A01(Object... objArr) {
        publishProgress(objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000c, code lost:
        A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCancelled() {
        /*
            r1 = this;
            X.A34 r0 = r1.A00     // Catch:{ all -> 0x0009 }
            r0.A0E()     // Catch:{ all -> 0x0009 }
            r1.A00()
            return
        L_0x0009:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x000b }
        L_0x000b:
            r0 = move-exception
            r1.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CU.onCancelled():void");
    }
}
