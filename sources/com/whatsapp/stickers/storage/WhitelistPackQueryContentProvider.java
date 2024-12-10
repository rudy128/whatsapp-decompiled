package com.whatsapp.stickers.storage;

import X.AnonymousClass702;
import X.C19680yj;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.net.Uri;

public class WhitelistPackQueryContentProvider extends C19680yj {
    public UriMatcher A00;
    public AnonymousClass702 A01;

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException();
    }

    public String getType(Uri uri) {
        A09();
        StringBuilder sb = new StringBuilder();
        sb.append("vnd.android.cursor.item/vnd.");
        sb.append("com.whatsapp.provider.sticker_whitelist_check");
        sb.append(".");
        sb.append("is_whitelisted");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a0, code lost:
        com.whatsapp.util.Log.e("Exception when querying whitelist packs", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a5, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12) {
        /*
            r7 = this;
            r7.A09()
            r6 = 0
            r4 = r7
            monitor-enter(r4)     // Catch:{ Exception -> 0x009f }
            android.content.UriMatcher r0 = r7.A00     // Catch:{ all -> 0x009c }
            if (r0 != 0) goto L_0x001a
            r0 = -1
            android.content.UriMatcher r3 = new android.content.UriMatcher     // Catch:{ all -> 0x009c }
            r3.<init>(r0)     // Catch:{ all -> 0x009c }
            r7.A00 = r3     // Catch:{ all -> 0x009c }
            java.lang.String r2 = "com.whatsapp.provider.sticker_whitelist_check"
            java.lang.String r1 = "is_whitelisted"
            r0 = 1
            r3.addURI(r2, r1, r0)     // Catch:{ all -> 0x009c }
        L_0x001a:
            android.content.UriMatcher r0 = r7.A00     // Catch:{ all -> 0x009c }
            monitor-exit(r4)     // Catch:{ Exception -> 0x009f }
            int r0 = r0.match(r8)     // Catch:{ Exception -> 0x009f }
            r3 = 1
            if (r0 != r3) goto L_0x009b
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x009f }
            if (r0 == 0) goto L_0x009b
            android.content.Context r0 = r7.getContext()     // Catch:{ Exception -> 0x009f }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = "authority"
            java.lang.String r4 = r8.getQueryParameter(r0)     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = "identifier"
            java.lang.String r5 = r8.getQueryParameter(r0)     // Catch:{ Exception -> 0x009f }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x009f }
            if (r0 != 0) goto L_0x009b
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x009f }
            if (r0 != 0) goto L_0x009b
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ProviderInfo r0 = r1.resolveContentProvider(r4, r0)     // Catch:{ Exception -> 0x009f }
            if (r0 == 0) goto L_0x009b
            java.lang.String r2 = r7.getCallingPackage()     // Catch:{ Exception -> 0x009f }
            if (r2 == 0) goto L_0x007e
            java.lang.String r0 = r0.packageName     // Catch:{ Exception -> 0x009f }
            boolean r0 = r2.equals(r0)     // Catch:{ Exception -> 0x009f }
            if (r0 == 0) goto L_0x007e
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x009f }
            java.lang.String r1 = "result"
            r0 = 0
            r3[r0] = r1     // Catch:{ Exception -> 0x009f }
            android.database.MatrixCursor r2 = new android.database.MatrixCursor     // Catch:{ Exception -> 0x009f }
            r2.<init>(r3)     // Catch:{ Exception -> 0x009f }
            android.database.MatrixCursor$RowBuilder r1 = r2.newRow()     // Catch:{ Exception -> 0x009f }
            X.702 r0 = r7.A01     // Catch:{ Exception -> 0x009f }
            boolean r0 = r0.A04(r4, r5)     // Catch:{ Exception -> 0x009f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x009f }
            r1.add(r0)     // Catch:{ Exception -> 0x009f }
            return r2
        L_0x007e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009f }
            r1.<init>()     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = "the calling package "
            r1.append(r0)     // Catch:{ Exception -> 0x009f }
            r1.append(r2)     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = " does not own the queried authority: "
            r1.append(r0)     // Catch:{ Exception -> 0x009f }
            r1.append(r4)     // Catch:{ Exception -> 0x009f }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x009f }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x009f }
        L_0x009b:
            return r6
        L_0x009c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ Exception -> 0x009f }
            throw r0     // Catch:{ Exception -> 0x009f }
        L_0x009f:
            r1 = move-exception
            java.lang.String r0 = "Exception when querying whitelist packs"
            com.whatsapp.util.Log.e(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.storage.WhitelistPackQueryContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }
}
