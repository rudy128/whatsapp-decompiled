package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;
import com.whatsapp.util.Log;

public class AMQ implements B71 {
    public final int A00;
    public final Object A01;

    public AMQ(EncBackupViewModel encBackupViewModel, int i) {
        this.A00 = i;
        this.A01 = encBackupViewModel;
    }

    public void BtE(int i, int i2, int i3) {
        AnonymousClass1DT r2;
        String str;
        Integer valueOf;
        int i4;
        if (this.A00 != 0) {
            EncBackupViewModel encBackupViewModel = (EncBackupViewModel) this.A01;
            if (i == 0) {
                Log.i("encb/EncBackupViewModel/successfully saved encryption key");
                r2 = encBackupViewModel.A07;
            } else {
                Log.e("encb/EncBackupViewModel/failed to save encryption key");
                return;
            }
        } else {
            EncBackupViewModel encBackupViewModel2 = (EncBackupViewModel) this.A01;
            if (i != 0) {
                int i5 = 8;
                if (i != 3) {
                    if (i == 8) {
                        Log.i("encb/EncBackupViewModel/invalid password");
                        AnonymousClass3MX.A1K(encBackupViewModel2.A06, i2);
                        if (i3 > 0) {
                            encBackupViewModel2.A0Z(4);
                            encBackupViewModel2.A08.A0E(Long.valueOf(((long) i3) * 1000));
                            encBackupViewModel2.A0K.CGv(encBackupViewModel2.A0M, 60000);
                        }
                        r2 = encBackupViewModel2.A04;
                        i4 = 5;
                    } else if (i != 404) {
                        i5 = 4;
                        if (i != 408) {
                            str = "encb/EncBackupViewModel/failed to retrieve and save backup key due to a server error";
                        } else {
                            Log.i("encb/EncBackupViewModel/request timeout");
                            if (i3 > 0) {
                                encBackupViewModel2.A0Z(4);
                                encBackupViewModel2.A08.A0E(Long.valueOf(((long) i3) * 1000));
                                encBackupViewModel2.A0K.CGv(encBackupViewModel2.A0M, 60000);
                                r2 = encBackupViewModel2.A04;
                                i4 = 6;
                            } else {
                                str = "encb/EncBackupViewModel/request timeout returned from server without timeout value";
                            }
                        }
                    } else {
                        Log.i("encb/EncBackupViewModel/account not found");
                        r2 = encBackupViewModel2.A04;
                        i4 = 7;
                    }
                    valueOf = Integer.valueOf(i4);
                    r2.A0E(valueOf);
                }
                str = "encb/EncBackupViewModel/failed to retrieve and save backup key due to a connection error";
                Log.e(str);
                r2 = encBackupViewModel2.A04;
                valueOf = Integer.valueOf(i5);
                r2.A0E(valueOf);
            }
            Log.i("encb/EncBackupViewModel/successfully retrieved and saved backup key");
            AnonymousClass3MX.A1K(encBackupViewModel2.A04, 3);
            r2 = encBackupViewModel2.A07;
        }
        i4 = -1;
        valueOf = Integer.valueOf(i4);
        r2.A0E(valueOf);
    }
}
