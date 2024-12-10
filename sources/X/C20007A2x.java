package X;

import com.whatsapp.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.A2x  reason: case insensitive filesystem */
public final class C20007A2x {
    public String A00;
    public String A01;
    public JSONObject A02;
    public boolean A03;
    public final long A04;
    public final long A05;
    public final A7X A06;
    public final C18030ve A07;
    public final C195939uB A08;
    public final String A09;
    public final JSONObject A0A;
    public final AnonymousClass1NT A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized org.json.JSONObject A00(X.C20007A2x r3) {
        /*
            monitor-enter(r3)
            boolean r0 = r3.A03     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0008
            org.json.JSONObject r0 = r3.A02     // Catch:{ all -> 0x003f }
            goto L_0x003b
        L_0x0008:
            org.json.JSONObject r1 = r3.A0A     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r1 == 0) goto L_0x003d
            r0 = 1
            r3.A03 = r0     // Catch:{ all -> 0x003f }
            java.lang.String r0 = "encryptedData"
            java.lang.String r1 = r1.optString(r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            int r0 = r1.length()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            X.1NT r0 = r3.A0B     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r0.A00(r1)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003d
            int r0 = r1.length()     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x003d
            org.json.JSONObject r0 = X.C17880vN.A16(r1)     // Catch:{ JSONException -> 0x0033 }
            r3.A02 = r0     // Catch:{ JSONException -> 0x0033 }
            goto L_0x0039
        L_0x0033:
            r1 = move-exception
            java.lang.String r0 = "gdrive-api-v2/backup/failed to parse decrypted metadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x003f }
        L_0x0039:
            org.json.JSONObject r0 = r3.A02     // Catch:{ all -> 0x003f }
        L_0x003b:
            monitor-exit(r3)
            return r0
        L_0x003d:
            monitor-exit(r3)
            return r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20007A2x.A00(X.A2x):org.json.JSONObject");
    }

    public final synchronized String A03() {
        return this.A00;
    }

    public final long A01() {
        JSONObject jSONObject = this.A0A;
        if (jSONObject == null) {
            return -1;
        }
        if (jSONObject.has("mediaSize")) {
            return jSONObject.optLong("mediaSize", -1);
        }
        JSONObject A002 = A00(this);
        if (A002 != null) {
            return A002.optLong("mediaSize", -1);
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (r2.optBoolean("encryptedBackupEnabled", false) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C195999uI A02() {
        /*
            r4 = this;
            org.json.JSONObject r2 = r4.A0A
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = "encryptedBackupMetadata"
            org.json.JSONObject r1 = r2.optJSONObject(r0)
            if (r1 == 0) goto L_0x0027
            java.lang.String r0 = "isPasswordOrEncryptionKeyEncrypted"
            boolean r3 = r1.getBoolean(r0)
            java.lang.String r0 = "passkeyEncryptionMetadata"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0021
            X.9iN r0 = X.C19986A1x.A04
            X.A1x r0 = r0.A00(r1)
        L_0x0021:
            X.9uI r2 = new X.9uI
            r2.<init>(r0, r3)
            return r2
        L_0x0027:
            java.lang.String r1 = "encryptedBackupEnabled"
            r0 = 0
            boolean r2 = r2.optBoolean(r1, r0)
            r1 = 0
            r0 = 1
            if (r2 != 0) goto L_0x0034
        L_0x0032:
            r1 = 0
            r0 = 0
        L_0x0034:
            X.9uI r2 = new X.9uI
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20007A2x.A02():X.9uI");
    }

    public final JSONObject A04() {
        String optString;
        JSONObject jSONObject = this.A0A;
        if (!(jSONObject == null || (optString = jSONObject.optString("backupExpiry")) == null || optString.length() == 0)) {
            try {
                return C17880vN.A16(optString);
            } catch (JSONException e) {
                Log.w("gdrive-api-v2/get-backup-supported/failed to parse", e);
            }
        }
        return null;
    }

    public final boolean A05() {
        JSONObject jSONObject = this.A0A;
        if (jSONObject == null) {
            return true;
        }
        if (jSONObject.has("includeVideosInBackup")) {
            return jSONObject.optBoolean("includeVideosInBackup", true);
        }
        JSONObject A002 = A00(this);
        if (A002 != null) {
            return A002.optBoolean("includeVideosInBackup", true);
        }
        return true;
    }

    public C20007A2x(AnonymousClass1NT r1, A7X a7x, C18030ve r3, C195939uB r4, String str, String str2, String str3, JSONObject jSONObject, long j, long j2) {
        this.A07 = r3;
        this.A0B = r1;
        this.A08 = r4;
        this.A06 = a7x;
        this.A09 = str;
        this.A01 = str2;
        this.A05 = j;
        this.A04 = j2;
        this.A00 = str3;
        this.A0A = jSONObject;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Backup{jidUser='");
        A10.append(this.A09);
        A10.append("', name='");
        A10.append(this.A01);
        A10.append("', updateTime=");
        A10.append(this.A05);
        A10.append(", sizeBytes=");
        A10.append(this.A04);
        A10.append(", activeTransactionId='activeTransactionId', clientMetadata=");
        return AnonymousClass8BX.A0c(this.A0A, A10);
    }
}
