package com.whatsapp.registration.backuptoken;

import X.C17880vN;
import android.app.backup.BackupAgentHelper;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.app.backup.FileBackupHelper;
import android.os.ParcelFileDescriptor;

public final class BackupTokenAgentHelper extends BackupAgentHelper {
    public void onBackup(ParcelFileDescriptor parcelFileDescriptor, BackupDataOutput backupDataOutput, ParcelFileDescriptor parcelFileDescriptor2) {
    }

    public void onRestore(BackupDataInput backupDataInput, int i, ParcelFileDescriptor parcelFileDescriptor) {
    }

    public void onCreate() {
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "backup_token";
        addHelper("backup_helper_key", new FileBackupHelper(this, A1Y));
    }
}
