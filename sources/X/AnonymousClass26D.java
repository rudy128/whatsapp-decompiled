package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.io.IOException;

/* renamed from: X.26D  reason: invalid class name */
public class AnonymousClass26D extends BroadcastReceiver {
    public AnonymousClass190 A00;
    public AnonymousClass11P A01;
    public C19830z4 A02;
    public C27371Vv A03;
    public final Object A04 = C17880vN.A0p();
    public volatile boolean A05 = false;

    public void onReceive(Context context, Intent intent) {
        String str;
        Context context2 = context;
        if (!this.A05) {
            synchronized (this.A04) {
                if (!this.A05) {
                    AnonymousClass10E r1 = AnonymousClass10E.A10(context2).AJU;
                    this.A01 = (AnonymousClass11P) r1.AAv.get();
                    this.A02 = (C19830z4) r1.ABl.get();
                    this.A00 = (AnonymousClass190) r1.A31.get();
                    this.A03 = (C27371Vv) r1.A3Q.get();
                    this.A05 = true;
                }
            }
        }
        Log.i("ProcessProviderMigrationInfo/on-receive");
        Bundle resultExtras = getResultExtras(true);
        int resultCode = getResultCode();
        Intent intent2 = intent;
        if (intent != null) {
            str = intent2.getAction();
        } else {
            str = null;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ProcessProviderMigrationInfo/on-receive/result-code=");
        A10.append(resultCode);
        C17900vP.A0f("/action=", str, A10);
        if (resultCode == -1 && resultExtras != null && intent != null) {
            boolean z = false;
            if ("com.whatsapp.registration.directmigration.initialMigrationInfoAction".equals(str)) {
                Log.i("ProcessProviderMigrationInfo/received-phone-number");
                C17880vN.A1E(C19830z4.A00(this.A02), "registration_sibling_app_country_code", resultExtras.getString("me_country_code", (String) null));
                C17880vN.A1E(C19830z4.A00(this.A02), "registration_sibling_app_phone_number", resultExtras.getString("phone_number", (String) null));
                C17900vP.A0M(this.A02, "direct_db_migration_timeout_in_secs", resultExtras.getInt("direct_db_migration_timeout_in_secs", VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT));
                boolean z2 = resultExtras.getBoolean("sister_app_content_provider_enabled", false);
                C17880vN.A1F(C19830z4.A00(this.A02), "sister_app_content_provider_is_enabled", z2);
                C17900vP.A0n("ProcessProviderMigrationInfo/sister-app-content-provider-is-enabled = ", AnonymousClass000.A10(), z2);
                boolean z3 = resultExtras.getBoolean("sister_app_is_auth_protected", false);
                C17880vN.A1F(C19830z4.A00(this.A02), "sister_app_is_auth_protected", z3);
                if (z3) {
                    C17880vN.A1D(C19830z4.A00(this.A02), "sister_app_auth_timeout", resultExtras.getLong("sister_app_privacy_auth_timeout", 60000));
                }
                C17900vP.A0n("ProcessProviderMigrationInfo/sister-app-is-auth-protected = ", AnonymousClass000.A10(), z3);
                byte[] byteArray = resultExtras.getByteArray("key_backup_token");
                String string = C17890vO.A0B(this.A02).getString("registration_sibling_app_phone_number", (String) null);
                if (!TextUtils.isEmpty(string) && byteArray != null && byteArray.length > 0) {
                    Log.i("ProcessProviderMigrationInfo/received-backup-token");
                    try {
                        byte[] A08 = C20138A8z.A08(context2, this.A00, this.A02, string, byteArray, 1);
                        if (A08 != null) {
                            C20138A8z.A02(context2, this.A00, this.A01, this.A02, (C57342iv) null, string, A08, 1);
                        }
                    } catch (IOException e) {
                        Log.e("ProcessProviderMigrationInfo/encryptAndSaveBackupToken failed with IOException:", e);
                    }
                }
            } else if (C17890vO.A1S(intent2, "com.whatsapp.registration.directmigration.recoveryTokenAction")) {
                Log.i("ProcessProviderMigrationInfo/received-token");
                String string2 = C17890vO.A0B(this.A02).getString("registration_sibling_app_country_code", (String) null);
                String string3 = C17890vO.A0B(this.A02).getString("registration_sibling_app_phone_number", (String) null);
                String A002 = C181659Ri.A00(C17900vP.A0A(string2, string3));
                byte[] byteArray2 = resultExtras.getByteArray("key_recovery_token");
                if (!TextUtils.isEmpty(A002) && byteArray2 != null) {
                    C17970vW.A0E(context2, A002, byteArray2);
                    z = true;
                }
                byte[] byteArray3 = resultExtras.getByteArray("key_backup_token");
                if (!TextUtils.isEmpty(string3) && byteArray3 != null) {
                    try {
                        C20138A8z.A02(context2, this.A00, this.A01, this.A02, (C57342iv) null, string3, byteArray3, 1);
                    } catch (IOException e2) {
                        Log.e("ProcessProviderMigrationInfo/encryptAndSaveToken failed with IOException:", e2);
                    }
                    z = true;
                }
                C17900vP.A0n("ProcessProviderMigrationInfo/onReceive/did-receive-token=", AnonymousClass000.A10(), z);
                if (z) {
                    this.A03.A00.A00 = true;
                }
            }
        }
    }
}
