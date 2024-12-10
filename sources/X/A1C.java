package X;

import android.os.Bundle;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class A1C {
    public long A00;
    public C195999uI A01;
    public boolean A02;
    public boolean A03;
    public final long A04;
    public final String A05;

    public synchronized Bundle A01() {
        Bundle A0D;
        A0D = C17880vN.A0D();
        A0D.putString("account_name", this.A05);
        A0D.putLong("total_backup_size", this.A00);
        A0D.putLong("last_modified", this.A04);
        A0D.putBoolean("overwrite_local_files", this.A03);
        A0D.putBoolean("is_download_size_zero", this.A02);
        A0D.putString("encryption_metadata", AnonymousClass9Q9.A00(new AQX(this.A01.A00())));
        return A0D;
    }

    public synchronized String toString() {
        Locale locale;
        Object[] objArr;
        locale = Locale.ENGLISH;
        objArr = new Object[6];
        objArr[0] = C41361wE.A08(this.A05);
        objArr[1] = Boolean.valueOf(this.A03);
        AnonymousClass8BU.A1Q(objArr, this.A02);
        C17890vO.A1O(objArr, this.A04);
        C17890vO.A1P(objArr, this.A00);
        objArr[5] = this.A01;
        return String.format(locale, "Account:%s overwriteLocalFile:%b isDownloadSizeZero:%b lastModified:%s totalBackupSize: %d isPasswordProtected: %s", objArr);
    }

    public static A1C A00(Bundle bundle) {
        if (bundle.containsKey("account_name")) {
            String A0s = C108955ca.A0s(bundle, "account_name");
            try {
                String A0s2 = C108955ca.A0s(bundle, "encryption_metadata");
                C18070vi.A0d(A0s2, 0);
                JSONObject A16 = C17880vN.A16(A0s2);
                boolean z = A16.getBoolean("isPasswordOrEncryptionKeyEncrypted");
                JSONObject optJSONObject = A16.optJSONObject("passkeyEncryptionMetadata");
                C19986A1x a1x = null;
                if (optJSONObject != null) {
                    a1x = C19986A1x.A04.A00(optJSONObject);
                }
                A1C a1c = new A1C(new C195999uI(a1x, z), A0s, bundle.getLong("last_modified", -1), bundle.getLong("total_backup_size", -1), bundle.getBoolean("overwrite_local_files"), bundle.getBoolean("is_download_size_zero"));
                C17900vP.A0Y(a1c, "gdrive-activity/create-restore-data-from-bundle/ ", AnonymousClass000.A10());
                return a1c;
            } catch (JSONException e) {
                throw new IllegalStateException("Failed to parse encryption metadata", e);
            }
        } else {
            throw AnonymousClass000.A0n("account_name cannot be null.");
        }
    }

    public A1C(C195999uI r1, String str, long j, long j2, boolean z, boolean z2) {
        this.A05 = str;
        this.A04 = j;
        this.A00 = j2;
        this.A03 = z;
        this.A02 = z2;
        this.A01 = r1;
    }
}
