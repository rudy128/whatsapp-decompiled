package X;

import android.content.BroadcastReceiver;
import android.os.Bundle;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.io.IOException;

/* renamed from: X.37A  reason: invalid class name */
public class AnonymousClass37A implements AnonymousClass1O5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C33721jH A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ byte[] A04;

    public AnonymousClass37A(C33721jH r1, String str, byte[] bArr, int i, int i2) {
        this.A02 = r1;
        this.A04 = bArr;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
    }

    public void BrD(String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ delivery failure");
        AnonymousClass190 r3 = this.A02.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupTokenProtocolHelper/iq delivery failure/");
        r3.A0G(C17880vN.A0t(A10, this.A00), (String) null, true);
    }

    public void Bt9(C29621ca r5, String str) {
        Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ error");
        AnonymousClass190 r3 = this.A02.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BackupTokenProtocolHelper/iq error/");
        r3.A0G(C17880vN.A0t(A10, this.A00), (String) null, true);
    }

    public void C7Z(C29621ca r14, String str) {
        String str2;
        Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/success");
        C33721jH r4 = this.A02;
        byte[] bArr = this.A04;
        String str3 = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        try {
            AnonymousClass11P r7 = r4.A01;
            C20138A8z.A02(r4.A02.A00, r4.A00, r7, r4.A03, new C57342iv(r4, i2), str3, bArr, i);
            if (i == 2) {
                C53842dB r1 = (C53842dB) r4.A05.get();
                Log.i("FoaBackupTokenSender/sendFoaBackupToken");
                AnonymousClass00H r2 = r1.A01;
                if (!((A14) r2.get()).A02()) {
                    str2 = "FoaBackupTokenSender/sendFoaBackupToken/not eligible";
                } else {
                    Bundle A0D = C17880vN.A0D();
                    byte[] A07 = C20138A8z.A07(r1.A00.A00, 2);
                    if (A07 == null) {
                        str2 = "FoaBackupTokenSender/sendFoaBackupToken/foa backup token is null";
                    } else {
                        A0D.putString("foa_backup_token", Base64.encodeToString(A07, 3));
                        ((A14) r2.get()).A01(new BroadcastReceiver(), A0D, "com.facebook.SET_FOA_BACKUP_TOKEN");
                    }
                }
                Log.i(str2);
            }
            Log.i("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken");
        } catch (IOException e) {
            Log.e("BackupTokenProtocolHelper/sendBackupTokenRequest/IQ success/encryptAndSaveToken/failed with IOException:", e);
            AnonymousClass190 r22 = r4.A00;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(e.getClass().getCanonicalName());
            r22.A0E("BackupTokenProtocolHelper/encryptAndSaveToken/failed", C17900vP.A0C(" : ", A10, e), e);
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
