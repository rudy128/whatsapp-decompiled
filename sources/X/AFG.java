package X;

import android.view.View;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.VoipActivityV2;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;
import java.util.Iterator;

public class AFG implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public AFG(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
        this.A03 = z2;
    }

    public final void onClick(View view) {
        String str;
        int A002;
        if (this.A00 != 0) {
            VoipCallControlBottomSheetV2 voipCallControlBottomSheetV2 = (VoipCallControlBottomSheetV2) this.A01;
            boolean z = this.A02;
            boolean z2 = this.A03;
            String str2 = voipCallControlBottomSheetV2.A0d;
            if (str2 != null) {
                VoipActivityV2 voipActivityV2 = voipCallControlBottomSheetV2.A0b.A00;
                ((C195199sx) voipActivityV2.A1x.get()).A02(voipActivityV2.A08, str2);
                ((C195199sx) voipCallControlBottomSheetV2.A0c.get()).A00();
            }
            if (z) {
                A002 = 3;
            } else {
                A002 = AnonymousClass8BU.A00(z2 ? 1 : 0);
            }
            VoipCallControlBottomSheetV2.A06(voipCallControlBottomSheetV2, A002);
            return;
        }
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A01;
        boolean z3 = this.A02;
        boolean z4 = this.A03;
        A8V A0q = AnonymousClass8BR.A0q(restoreFromBackupActivity.A0g);
        if (z3) {
            str = "restore_successful";
        } else {
            str = "restore_unsuccessful";
        }
        A0q.A0I(str, "next");
        if (!z4) {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/no media to restore");
            AnonymousClass1NP A0B = AnonymousClass8BU.A0B(restoreFromBackupActivity);
            AnonymousClass00H r0 = C20134A8u.A00;
            A0B.A0H(0);
            AnonymousClass8BU.A0B(restoreFromBackupActivity).A09();
        } else if (restoreFromBackupActivity.A07.A03(true) != 1) {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi not available, show dialog to restore on cellular.");
            AnonymousClass4VU r1 = new AnonymousClass4VU(12);
            AnonymousClass8BS.A12(restoreFromBackupActivity, r1, 2131890726);
            r1.A05(false);
            AnonymousClass8BS.A11(restoreFromBackupActivity, r1, 2131899286);
            AnonymousClass8BW.A0I(restoreFromBackupActivity, r1, 2131890744).A2C(restoreFromBackupActivity.getSupportFragmentManager(), (String) null);
            return;
        } else {
            Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/Wi-Fi available, starting media restore.");
            Log.i("restore>RestoreFromBackupActivity/start to restore media");
            AnonymousClass8BU.A0B(restoreFromBackupActivity).A09();
            C25081Mu.A00(restoreFromBackupActivity, AnonymousClass1LU.A1M(restoreFromBackupActivity, "action_restore_media"));
        }
        Iterator A0h = C17890vO.A0h(restoreFromBackupActivity.A0c);
        while (A0h.hasNext()) {
            AnonymousClass1NZ r02 = (AnonymousClass1NZ) A0h.next();
            String A0M = r02.A0M();
            try {
                r02.A0H();
            } catch (Exception e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("restore>RestoreFromBackupActivity/failed on post restore ");
                C17890vO.A13(A0M, A10, e);
            }
        }
        Log.i("restore>RestoreFromBackupActivity/msgstore-download-finish/setting result of Google Drive activity to BACKUP_FOUND_AND_RESTORED.");
        restoreFromBackupActivity.setResult(3);
        restoreFromBackupActivity.finish();
    }
}
