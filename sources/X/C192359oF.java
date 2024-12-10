package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;

/* renamed from: X.9oF  reason: invalid class name and case insensitive filesystem */
public class C192359oF {
    public Context A00;
    public Uri A01;
    public final C192359oF A02;

    public boolean A00() {
        Context context = this.A00;
        Uri uri = this.A01;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            Cursor cursor = null;
            try {
                cursor = context.getContentResolver().query(uri, new String[]{"flags"}, (String) null, (String[]) null, (String) null);
                if (cursor.moveToFirst() && !cursor.isNull(0)) {
                    long j = cursor.getLong(0);
                    AnonymousClass9OA.A00(cursor);
                    if ((j & 512) != 0) {
                        return true;
                    }
                }
            } catch (Exception e) {
                Log.w("DocumentFile", AnonymousClass001.A1E(e, "Failed query: ", AnonymousClass000.A10()));
            } catch (Throwable th) {
                AnonymousClass9OA.A00((AutoCloseable) null);
                throw th;
            }
            AnonymousClass9OA.A00(cursor);
            return false;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.String, android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r10v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0045, code lost:
        if (r10 == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0047, B:20:0x006b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f A[ExcHandler: RuntimeException (r0v2 'e' java.lang.RuntimeException A[CUSTOM_DECLARE]), Splitter:B:11:0x0047] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C192359oF[] A01() {
        /*
            r13 = this;
            android.content.Context r6 = r13.A00
            android.content.ContentResolver r7 = r6.getContentResolver()
            android.net.Uri r1 = r13.A01
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r1)
            android.net.Uri r8 = android.provider.DocumentsContract.buildChildDocumentsUriUsingTree(r1, r0)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            r0 = 1
            r5 = 0
            r10 = 0
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ Exception -> 0x0035 }
            java.lang.String r0 = "document_id"
            r9[r5] = r0     // Catch:{ Exception -> 0x0035 }
            r12 = r10
            r11 = r10
            android.database.Cursor r10 = r7.query(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0035 }
        L_0x0023:
            boolean r0 = r10.moveToNext()     // Catch:{ Exception -> 0x0035 }
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r10.getString(r5)     // Catch:{ Exception -> 0x0035 }
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r0)     // Catch:{ Exception -> 0x0035 }
            r4.add(r0)     // Catch:{ Exception -> 0x0035 }
            goto L_0x0023
        L_0x0035:
            r3 = move-exception
            java.lang.String r2 = "DocumentFile"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0068 }
            java.lang.String r0 = "Failed query: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r3, r0, r1)     // Catch:{ all -> 0x0068 }
            android.util.Log.w(r2, r0)     // Catch:{ all -> 0x0068 }
            if (r10 == 0) goto L_0x004a
        L_0x0047:
            r10.close()     // Catch:{ RuntimeException -> 0x006f, Exception -> 0x004a }
        L_0x004a:
            int r0 = r4.size()
            android.net.Uri[] r0 = new android.net.Uri[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            android.net.Uri[] r4 = (android.net.Uri[]) r4
            int r3 = r4.length
            X.9oF[] r2 = new X.C192359oF[r3]
        L_0x0059:
            if (r5 >= r3) goto L_0x0067
            r1 = r4[r5]
            X.9oF r0 = new X.9oF
            r0.<init>(r6, r1, r13)
            r2[r5] = r0
            int r5 = r5 + 1
            goto L_0x0059
        L_0x0067:
            return r2
        L_0x0068:
            r0 = move-exception
            if (r10 == 0) goto L_0x0071
            r10.close()     // Catch:{ RuntimeException -> 0x006f, Exception -> 0x0071 }
            throw r0
        L_0x006f:
            r0 = move-exception
            throw r0
        L_0x0071:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192359oF.A01():X.9oF[]");
    }

    public C192359oF(Context context, Uri uri, C192359oF r3) {
        this.A02 = r3;
        this.A00 = context;
        this.A01 = uri;
    }
}
