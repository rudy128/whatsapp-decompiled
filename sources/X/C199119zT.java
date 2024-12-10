package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import org.json.JSONException;

/* renamed from: X.9zT  reason: invalid class name and case insensitive filesystem */
public final class C199119zT {
    public final AnonymousClass1NT A00;
    public final AnonymousClass2Dj A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.C19990A2d r7, long r8) {
        /*
            r6 = this;
            r0 = 1
            X.C18070vi.A0d(r7, r0)
            X.2Dj r0 = r6.A01
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001f }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "remote_files"
            android.content.ContentValues r2 = A00(r7, r8)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = "REMOTE_FILE_STORE_INSERT_REMOTE_FILE"
            r0 = 5
            r4.A09(r3, r1, r2, r0)     // Catch:{ all -> 0x001f }
            r5.close()
            return
        L_0x001f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C199119zT.A01(X.A2d, long):void");
    }

    public C199119zT(AnonymousClass1NT r1, AnonymousClass2Dj r2) {
        C18070vi.A0j(r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }

    public static final ContentValues A00(C19990A2d a2d, long j) {
        String str;
        ContentValues A08 = C17880vN.A08();
        C17880vN.A19(A08, "backup_id", j);
        A08.put("upload_title", a2d.A06);
        A08.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, a2d.A05);
        A08.put("mime_type", a2d.A04);
        A08.put("md5_hash", a2d.A03);
        A08.put("size_bytes", Long.valueOf(a2d.A00));
        A08.put("upload_time", Long.valueOf(a2d.A01));
        A55 a55 = a2d.A02;
        if (a55 != null) {
            try {
                str = A55.A01(a55);
            } catch (JSONException e) {
                Log.e("gdrive/file-metadata/failed to create metadata", e);
                str = null;
            }
            if (str != null) {
                A08.put("metadata", str);
            }
        }
        return A08;
    }
}
