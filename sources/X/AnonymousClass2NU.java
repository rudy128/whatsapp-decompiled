package X;

import android.os.SystemClock;

/* renamed from: X.2NU  reason: invalid class name */
public final class AnonymousClass2NU extends C177919Bc {
    public final /* synthetic */ AnonymousClass2NV A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2NU(AnonymousClass2NV r3) {
        super(r3, true, false, false);
        this.A00 = r3;
    }

    public void A0N(C192039nf r1) {
    }

    public boolean A0O(C192039nf r2) {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02ff, code lost:
        if (r3 == 21) goto L_0x0301;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02d8 A[Catch:{ NumberFormatException -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02fc A[Catch:{ NumberFormatException -> 0x01a6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x030c A[SYNTHETIC, Splitter:B:132:0x030c] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01cb A[Catch:{ NumberFormatException -> 0x01a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C192039nf A0J() {
        /*
            r14 = this;
            X.2NV r3 = r14.A00
            X.1Cd r0 = r3.A02
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x001c
            X.19D r2 = r3.A04
            r1 = 12395(0x306b, float:1.7369E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001c
            X.1WZ r0 = r3.A03
            r0.A01()
        L_0x001c:
            X.1j7 r0 = r3.A01
            X.2bA r1 = new X.2bA
            r1.<init>(r14)
            X.11r r0 = X.C33621j7.A00(r0)
            X.1Wb r6 = r0.A09
            X.1Cd r5 = r6.A0I
            r5.A06()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r5.A04
            r4.lock()
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0333 }
            monitor-enter(r6)     // Catch:{ all -> 0x0333 }
            r5.A06()     // Catch:{ all -> 0x0330 }
            boolean r0 = r5.A08     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            X.2NU r0 = r1.A00     // Catch:{ all -> 0x0330 }
            X.8CU r8 = r0.A02     // Catch:{ all -> 0x0330 }
            boolean r0 = r8.isCancelled()     // Catch:{ all -> 0x0330 }
            java.lang.String r13 = "MessageStoreBackup/restoreFromMigration/canceled"
            if (r0 != 0) goto L_0x02cd
            X.1WZ r0 = r6.A0J     // Catch:{ all -> 0x0330 }
            r0.A01()     // Catch:{ all -> 0x0330 }
            X.1Cn r0 = r6.A0H     // Catch:{ all -> 0x0330 }
            r0.A02()     // Catch:{ all -> 0x0330 }
            X.1NR r10 = r6.A0S     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/filePath=msg_store"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            X.0z4 r11 = r10.A04     // Catch:{ all -> 0x0330 }
            java.lang.String r9 = r11.A0l()     // Catch:{ all -> 0x0330 }
            java.lang.String r1 = r11.A0n()     // Catch:{ all -> 0x0330 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/registered cc is "
            r2.append(r0)     // Catch:{ all -> 0x0330 }
            r2.append(r9)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = " phone number"
            r2.append(r0)     // Catch:{ all -> 0x0330 }
            r0 = 42
            java.lang.Character r0 = java.lang.Character.valueOf(r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = X.AnonymousClass1EG.A09(r0, r1)     // Catch:{ all -> 0x0330 }
            X.C17890vO.A1A(r2, r0)     // Catch:{ all -> 0x0330 }
            r3 = 0
            X.11C r12 = r10.A02     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            X.11B r2 = r12.A0O()     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            java.lang.String r7 = "msg_store"
            android.net.Uri r1 = X.AnonymousClass1NR.A01(r7, r9, r1)     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            java.lang.String r0 = "r"
            android.os.ParcelFileDescriptor r9 = r2.A06(r1, r0)     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            if (r9 == 0) goto L_0x0106
            java.io.FileDescriptor r0 = r9.getFileDescriptor()     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x0106
            X.11B r2 = r12.A0O()     // Catch:{ all -> 0x011e }
            java.lang.String r1 = r11.A0l()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = r11.A0n()     // Catch:{ all -> 0x011e }
            android.net.Uri r1 = X.AnonymousClass1NR.A01(r7, r1, r0)     // Catch:{ all -> 0x011e }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x011e }
            android.content.ContentResolver r0 = X.AnonymousClass11B.A00(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r1 = r0.getType(r1)     // Catch:{ all -> 0x011e }
            X.118 r0 = r10.A03     // Catch:{ all -> 0x011e }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x011e }
            java.io.File r0 = r0.getFilesDir()     // Catch:{ all -> 0x011e }
            java.io.File r7 = X.C17880vN.A0e(r0, r1)     // Catch:{ all -> 0x011e }
            boolean r0 = r7.exists()     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x00ef
            boolean r0 = r7.delete()     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x00ef
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/failed-to-delete"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011e }
            r1 = 15
            X.2Dm r0 = new X.2Dm     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x011e }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x011e }
            r9.close()     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            goto L_0x01bd
        L_0x00ef:
            java.io.FileDescriptor r0 = r9.getFileDescriptor()     // Catch:{ all -> 0x011e }
            int r1 = X.AnonymousClass1NR.A00(r10, r7, r0)     // Catch:{ all -> 0x011e }
            X.2Dm r0 = new X.2Dm     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x011e }
            r2.<init>(r0, r7)     // Catch:{ all -> 0x011e }
            r9.close()     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            goto L_0x01bd
        L_0x0106:
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateMsgStoreFile/consumer file is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x011e }
            r1 = 15
            X.2Dm r0 = new X.2Dm     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x011e }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x011e }
            if (r9 == 0) goto L_0x01bd
            r9.close()     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
            goto L_0x01bd
        L_0x011e:
            r1 = move-exception
            if (r9 == 0) goto L_0x0129
            r9.close()     // Catch:{ all -> 0x0125 }
            goto L_0x0129
        L_0x0125:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
        L_0x0129:
            throw r1     // Catch:{ IOException -> 0x012c, SecurityException -> 0x012a }
        L_0x012a:
            r0 = move-exception
            goto L_0x012d
        L_0x012c:
            r0 = move-exception
        L_0x012d:
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x0330 }
            java.lang.String r2 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/"
            java.lang.String r0 = ":\\s"
            java.lang.String[] r9 = r7.split(r0)     // Catch:{ NumberFormatException -> 0x01a6 }
            int r1 = r9.length     // Catch:{ NumberFormatException -> 0x01a6 }
            r0 = 2
            if (r1 != r0) goto L_0x01aa
            r0 = 1
            r0 = r9[r0]     // Catch:{ NumberFormatException -> 0x01a6 }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x01a6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NumberFormatException -> 0x01a6 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/parseErrorCodeIfPossible/error while fetching msg store: error is = "
            r1.append(r0)     // Catch:{ NumberFormatException -> 0x01a6 }
            switch(r9) {
                case 0: goto L_0x015c;
                case 1: goto L_0x015f;
                case 2: goto L_0x0162;
                case 3: goto L_0x0165;
                case 4: goto L_0x0168;
                case 5: goto L_0x016b;
                case 6: goto L_0x016e;
                case 7: goto L_0x0171;
                case 8: goto L_0x0174;
                case 9: goto L_0x0177;
                case 10: goto L_0x017a;
                case 11: goto L_0x017d;
                case 12: goto L_0x0180;
                case 13: goto L_0x0183;
                case 14: goto L_0x0186;
                case 15: goto L_0x0189;
                case 16: goto L_0x018c;
                case 17: goto L_0x018f;
                case 18: goto L_0x0192;
                case 19: goto L_0x0195;
                case 20: goto L_0x0198;
                case 21: goto L_0x019b;
                default: goto L_0x0150;
            }     // Catch:{ NumberFormatException -> 0x01a6 }
        L_0x0150:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ NumberFormatException -> 0x01a6 }
            java.lang.String r0 = "state is not recognized = "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r9)     // Catch:{ NumberFormatException -> 0x01a6 }
            throw r0     // Catch:{ NumberFormatException -> 0x01a6 }
        L_0x015c:
            java.lang.String r0 = "FAILED"
            goto L_0x019d
        L_0x015f:
            java.lang.String r0 = "SUCCESS_RESTORED"
            goto L_0x019d
        L_0x0162:
            java.lang.String r0 = "SUCCESS_CREATED"
            goto L_0x019d
        L_0x0165:
            java.lang.String r0 = "FAILED_JID_MISMATCH"
            goto L_0x019d
        L_0x0168:
            java.lang.String r0 = "FAILED_FILE_INTEGRITY_CHECK"
            goto L_0x019d
        L_0x016b:
            java.lang.String r0 = "FAILED_OUT_OF_SPACE"
            goto L_0x019d
        L_0x016e:
            java.lang.String r0 = "FAILED_MSG_STORE_ALREADY_EXISTS"
            goto L_0x019d
        L_0x0171:
            java.lang.String r0 = "FAILED_CANCELED"
            goto L_0x019d
        L_0x0174:
            java.lang.String r0 = "PROVIDER_SERVER_PROP_NOT_ENABLED"
            goto L_0x019d
        L_0x0177:
            java.lang.String r0 = "APP_SIGNATURE_MISMATCH"
            goto L_0x019d
        L_0x017a:
            java.lang.String r0 = "INCORRECT_CALLER_PACKAGE_NAME"
            goto L_0x019d
        L_0x017d:
            java.lang.String r0 = "REQUESTER_APP_VERSION_INCORRECT"
            goto L_0x019d
        L_0x0180:
            java.lang.String r0 = "INCORRECT_FILE_MODE"
            goto L_0x019d
        L_0x0183:
            java.lang.String r0 = "PHONE_NUMBER_MISMATCH"
            goto L_0x019d
        L_0x0186:
            java.lang.String r0 = "MSG_DB_DOES_NOT_EXIST"
            goto L_0x019d
        L_0x0189:
            java.lang.String r0 = "FAILED_TO_GET_BACKUP_FILE"
            goto L_0x019d
        L_0x018c:
            java.lang.String r0 = "BACKUP_FAILED_GENERIC"
            goto L_0x019d
        L_0x018f:
            java.lang.String r0 = "BACKUP_FAILED_OUT_OF_SPACE"
            goto L_0x019d
        L_0x0192:
            java.lang.String r0 = "BACKUP_FAILED_INVALID"
            goto L_0x019d
        L_0x0195:
            java.lang.String r0 = "SUCCESS_TRANSFER_DB_FILE"
            goto L_0x019d
        L_0x0198:
            java.lang.String r0 = "FAILED_DECRYPTION_KEY_MISSING"
            goto L_0x019d
        L_0x019b:
            java.lang.String r0 = "SUCCESS_BASE_RESTORED_INCREMENT_FAILED"
        L_0x019d:
            X.C17890vO.A19(r1, r0)     // Catch:{ NumberFormatException -> 0x01a6 }
            X.2Dm r1 = new X.2Dm     // Catch:{ NumberFormatException -> 0x01a6 }
            r1.<init>(r9)     // Catch:{ NumberFormatException -> 0x01a6 }
            goto L_0x01b8
        L_0x01a6:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x0330 }
        L_0x01aa:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0330 }
            X.C17900vP.A0e(r2, r7, r0)     // Catch:{ all -> 0x0330 }
            r0 = 15
            X.2Dm r1 = new X.2Dm     // Catch:{ all -> 0x0330 }
            r1.<init>(r0)     // Catch:{ all -> 0x0330 }
        L_0x01b8:
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0330 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0330 }
        L_0x01bd:
            java.lang.Object r7 = r2.first     // Catch:{ all -> 0x0330 }
            X.2Dm r7 = (X.C46182Dm) r7     // Catch:{ all -> 0x0330 }
            java.lang.Object r3 = r2.second     // Catch:{ all -> 0x0330 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x0330 }
            boolean r0 = r8.isCancelled()     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x02cd
            r1 = 19
            int r0 = r7.A00     // Catch:{ all -> 0x0330 }
            if (r1 != r0) goto L_0x02ee
            if (r3 == 0) goto L_0x02ee
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/received-file-decrypting"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = r3.getName()     // Catch:{ all -> 0x0330 }
            X.9JN r1 = X.AnonymousClass9QI.A00(r0)     // Catch:{ all -> 0x0330 }
            X.9JN r0 = X.AnonymousClass9JN.CRYPT15     // Catch:{ all -> 0x0330 }
            if (r1 != r0) goto L_0x0298
            java.lang.String r0 = "RSA"
            java.security.KeyPairGenerator r1 = java.security.KeyPairGenerator.getInstance(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r0 = 2024(0x7e8, float:2.836E-42)
            r1.initialize(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.security.KeyPair r12 = r1.generateKeyPair()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            android.os.Bundle r9 = X.C17880vN.A0D()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r1 = "query_param_country_code"
            java.lang.String r0 = r11.A0l()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r9.putString(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r1 = "query_param_phone_number"
            java.lang.String r0 = r11.A0n()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r9.putString(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r1 = "pk"
            java.security.PublicKey r0 = r12.getPublic()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            byte[] r0 = r0.getEncoded()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r9.putByteArray(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.11C r0 = r10.A02     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.11B r7 = r0.A0O()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r2 = ""
            java.lang.String r1 = r11.A0l()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r0 = r11.A0n()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            android.net.Uri r1 = X.AnonymousClass1NR.A01(r2, r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r0 = "retrieve_rk"
            android.os.Bundle r2 = r7.A05(r1, r9, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            if (r2 != 0) goto L_0x0239
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey null returned"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            goto L_0x02ca
        L_0x0239:
            java.security.PrivateKey r0 = r12.getPrivate()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            byte[] r7 = r0.getEncoded()     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r0 = "erk"
            byte[] r1 = X.AnonymousClass1NR.A02(r2, r0, r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            if (r1 != 0) goto L_0x024f
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey root key is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            goto L_0x02ca
        L_0x024f:
            X.1NO r11 = r10.A01     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.9pc r0 = new X.9pc     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r0.<init>(r1)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r11.A02(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r0 = "ph"
            byte[] r12 = X.AnonymousClass1NR.A02(r2, r0, r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r0 = "ps"
            byte[] r9 = X.AnonymousClass1NR.A02(r2, r0, r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            java.lang.String r1 = "ic"
            r0 = 100000(0x186a0, float:1.4013E-40)
            int r7 = r2.getInt(r1, r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            if (r12 == 0) goto L_0x028c
            if (r9 == 0) goto L_0x028c
            X.9pc r2 = new X.9pc     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r2.<init>(r12)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.9pc r1 = new X.9pc     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r1.<init>(r9)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.2m3 r0 = new X.2m3     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r0.<init>(r2, r1, r7)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r11.A01(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.1NP r1 = r10.A00     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.2Qv r0 = X.C49532Qv.PASSWORD_ENCRYPTED     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r1.A0J(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            goto L_0x02d2
        L_0x028c:
            X.1NP r1 = r10.A00     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            X.2Qv r0 = X.C49532Qv.ENCRYPTION_KEY_ENCRYPTED     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            r1.A0J(r0)     // Catch:{ IOException | NoSuchAlgorithmException -> 0x0294 }
            goto L_0x02d2
        L_0x0294:
            r1 = move-exception
            java.lang.String r0 = "MigrateFileDirectlyHelper/migrateBackupEncryptionKey failed"
            goto L_0x02c7
        L_0x0298:
            X.1Vt r9 = r6.A0D     // Catch:{ all -> 0x0330 }
            X.1Ug r7 = new X.1Ug     // Catch:{ all -> 0x0330 }
            r7.<init>()     // Catch:{ all -> 0x0330 }
            java.util.List r2 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x0330 }
            r1 = 40
            X.3Bw r0 = new X.3Bw     // Catch:{ all -> 0x0330 }
            r0.<init>(r9, r7, r1)     // Catch:{ all -> 0x0330 }
            r9.A00(r0, r2)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/try to get cipher key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02c4 }
            r0 = 3
            r6.A00 = r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02c4 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02c4 }
            r0 = 32000(0x7d00, double:1.581E-319)
            java.lang.Object r0 = r7.get(r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02c4 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x02c4 }
            if (r0 == 0) goto L_0x02ca
            goto L_0x02d2
        L_0x02c4:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/exception"
        L_0x02c7:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0330 }
        L_0x02ca:
            r0 = 20
            goto L_0x02e9
        L_0x02cd:
            com.whatsapp.util.Log.i((java.lang.String) r13)     // Catch:{ all -> 0x0330 }
            r0 = 7
            goto L_0x02e9
        L_0x02d2:
            boolean r0 = r8.isCancelled()     // Catch:{ all -> 0x0330 }
            if (r0 != 0) goto L_0x02cd
            java.lang.String r0 = "MessageStoreBackup/restoreFromMigration/restore-db-from-backup-now"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            java.util.List r2 = java.util.Collections.singletonList(r3)     // Catch:{ all -> 0x0330 }
            r1 = 1
            r0 = 0
            X.9nf r0 = X.C27431Wb.A01(r6, r0, r2, r1)     // Catch:{ all -> 0x0330 }
            int r0 = r0.A00     // Catch:{ all -> 0x0330 }
        L_0x02e9:
            X.2Dm r7 = new X.2Dm     // Catch:{ all -> 0x0330 }
            r7.<init>(r0)     // Catch:{ all -> 0x0330 }
        L_0x02ee:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup-or-direct-transfer/"
            X.C17900vP.A0Y(r7, r0, r1)     // Catch:{ all -> 0x0330 }
            int r3 = r7.A00     // Catch:{ all -> 0x0330 }
            r2 = 1
            if (r3 == r2) goto L_0x0301
            r0 = 21
            r1 = 0
            if (r3 != r0) goto L_0x0302
        L_0x0301:
            r1 = 1
        L_0x0302:
            r5.A06()     // Catch:{ SQLiteException -> 0x031b }
            X.1Cm r0 = r5.A02     // Catch:{ SQLiteException -> 0x031b }
            r0.Bbw()     // Catch:{ SQLiteException -> 0x031b }
            if (r1 == 0) goto L_0x031b
            r5.A06()     // Catch:{ all -> 0x0330 }
            r5.A08 = r2     // Catch:{ all -> 0x0330 }
            X.1ST r0 = r6.A0E     // Catch:{ all -> 0x0330 }
            r0.A0G()     // Catch:{ all -> 0x0330 }
            X.1Vy r0 = r6.A0R     // Catch:{ all -> 0x0330 }
            r0.A02()     // Catch:{ all -> 0x0330 }
        L_0x031b:
            monitor-exit(r6)     // Catch:{ all -> 0x0330 }
            goto L_0x0329
        L_0x031d:
            java.lang.String r0 = "MessageStoreBackup/initializeWithExistingMsgStore/restoring-from-backup/6"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0330 }
            r0 = 6
            X.9nf r7 = new X.9nf     // Catch:{ all -> 0x0330 }
            r7.<init>(r0)     // Catch:{ all -> 0x0330 }
            monitor-exit(r6)     // Catch:{ all -> 0x0330 }
        L_0x0329:
            r5.A06()
            r4.unlock()
            return r7
        L_0x0330:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0330 }
            throw r0     // Catch:{ all -> 0x0333 }
        L_0x0333:
            r0 = move-exception
            r5.A06()
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2NU.A0J():X.9nf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0100, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0103, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0107, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019a, code lost:
        if (r2 == false) goto L_0x019c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0L() {
        /*
            r13 = this;
            X.2NV r4 = r13.A00
            X.1Nb r0 = r4.A09
            X.1NR r2 = r0.A0H
            X.118 r0 = r0.A09
            android.content.Context r1 = r0.A00
            java.lang.String r0 = "chatsettings.db"
            java.io.File r1 = r1.getDatabasePath(r0)
            java.lang.String r0 = "chat_setting_store"
            int r1 = r2.A03(r1, r0)
            r0 = 19
            boolean r5 = X.AnonymousClass000.A1T(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully replaced chat setting "
            X.C17900vP.A0n(r0, r1, r5)
            X.4aW r3 = r4.A0A
            X.1NR r2 = r3.A0D
            X.118 r0 = r3.A08
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "wallpaper.jpg"
            java.io.File r1 = X.C17880vN.A0e(r1, r0)
            java.lang.String r0 = "wallpaper"
            int r1 = r2.A03(r1, r0)
            r0 = 19
            boolean r2 = X.AnonymousClass000.A1T(r1, r0)
            X.AnonymousClass4aW.A0A(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully replaced wall paper "
            X.C17900vP.A0n(r0, r1, r2)
            X.8or r6 = r4.A0B
            monitor-enter(r6)
            X.17y r0 = r6.A04     // Catch:{ IOException -> 0x0108 }
            X.17z r1 = r0.A00     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = ""
            java.io.File r2 = r1.A01(r0)     // Catch:{ IOException -> 0x0108 }
            X.1NR r1 = r6.A03     // Catch:{ IOException -> 0x0108 }
            java.lang.String r0 = "sticker_store"
            int r1 = r1.A03(r2, r0)     // Catch:{ IOException -> 0x0108 }
            r0 = 19
            if (r1 != r0) goto L_0x010e
            X.118 r0 = r6.A01     // Catch:{ all -> 0x0261 }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0261 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0261 }
            X.8sF r0 = new X.8sF     // Catch:{ all -> 0x0261 }
            r0.<init>()     // Catch:{ all -> 0x0261 }
            boolean r3 = r6.A0S(r0, r2)     // Catch:{ all -> 0x0261 }
            if (r3 == 0) goto L_0x0111
            X.00H r0 = r6.A07     // Catch:{ all -> 0x0261 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0261 }
            X.6uZ r0 = (X.C136886uZ) r0     // Catch:{ all -> 0x0261 }
            java.lang.String r8 = "/com.whatsapp/"
            java.lang.String r7 = "/com.whatsapp.w4b/"
            r2 = 1
            X.00H r0 = r0.A01     // Catch:{ all -> 0x0261 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0261 }
            X.1Ls r0 = (X.C24801Ls) r0     // Catch:{ all -> 0x0261 }
            X.1au r10 = r0.A06()     // Catch:{ all -> 0x0261 }
            X.1xA r11 = r10.BD0()     // Catch:{ all -> 0x0101 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fa }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x00fa }
            java.lang.String r1 = "UPDATE stickers SET file_path = REPLACE(file_path, ?, ?);"
            java.lang.String r0 = "UPDATE_STICKER_TABLE_FILE_PATH"
            X.2nI r9 = r9.A0D(r1, r0)     // Catch:{ all -> 0x00fa }
            android.database.sqlite.SQLiteStatement r0 = r9.A00     // Catch:{ all -> 0x00fa }
            r0.bindString(r2, r8)     // Catch:{ all -> 0x00fa }
            r1 = 2
            r0.bindString(r1, r7)     // Catch:{ all -> 0x00fa }
            r9.A00()     // Catch:{ all -> 0x00fa }
            r11.A00()     // Catch:{ all -> 0x00fa }
            r11.close()     // Catch:{ all -> 0x0101 }
            r10.close()     // Catch:{ all -> 0x0261 }
            X.1Ns r0 = r6.A00     // Catch:{ all -> 0x0261 }
            X.1Nr r0 = r0.A02     // Catch:{ all -> 0x0261 }
            X.1Cd r0 = r0.A00     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            X.1au r10 = r0.A05()     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String[] r9 = new java.lang.String[r1]     // Catch:{ all -> 0x00dd }
            r0 = 0
            r9[r0] = r8     // Catch:{ all -> 0x00dd }
            r9[r2] = r7     // Catch:{ all -> 0x00dd }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00dd }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00dd }
            java.lang.String r1 = "UPDATE media_refs SET path = REPLACE (path, ?, ?);"
            java.lang.String r0 = "MEDIA_REFS_CHANGE_PATH_SQL"
            r2.A0F(r1, r0, r9)     // Catch:{ all -> 0x00dd }
            r10.close()     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0111
        L_0x00dd:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x00e2 }
            goto L_0x00e6
        L_0x00e2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x00e6:
            throw r1     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x00e7:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = "MediaRefCounter/migrateFilePathoriginal path="
            r1.append(r0)     // Catch:{ all -> 0x0261 }
            r1.append(r8)     // Catch:{ all -> 0x0261 }
            java.lang.String r0 = "new path="
            X.C17900vP.A0h(r0, r7, r1, r2)     // Catch:{ all -> 0x0261 }
            goto L_0x0111
        L_0x00fa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x0101 }
            throw r0     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x0261 }
            throw r0     // Catch:{ all -> 0x0261 }
        L_0x0108:
            r1 = move-exception
            java.lang.String r0 = "StickerDBStorage/getFileToRestoreFrom: failed to copy sticker file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0261 }
        L_0x010e:
            monitor-exit(r6)
            r3 = 0
            goto L_0x0112
        L_0x0111:
            monitor-exit(r6)
        L_0x0112:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored stickers "
            X.C17900vP.A0n(r0, r1, r3)
            X.2Dc r7 = r4.A01
            r8 = 0
            X.1NR r2 = r7.A03     // Catch:{ IllegalArgumentException -> 0x0157 }
            java.lang.String r1 = "chat_lock_passcode"
            X.00H r0 = r7.A07     // Catch:{ IllegalArgumentException -> 0x0157 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x0157 }
            X.2nD r0 = (X.C59992nD) r0     // Catch:{ IllegalArgumentException -> 0x0157 }
            java.io.File r0 = r0.A01()     // Catch:{ IllegalArgumentException -> 0x0157 }
            int r1 = r2.A03(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0157 }
            r0 = 19
            boolean r6 = X.AnonymousClass000.A1T(r1, r0)
            X.1TK r2 = r7.A00     // Catch:{ IllegalArgumentException -> 0x0157 }
            X.0z4 r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0157 }
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)     // Catch:{ IllegalArgumentException -> 0x0157 }
            java.lang.String r0 = "chat_lock_broken_encoding_checked"
            boolean r0 = r1.getBoolean(r0, r8)     // Catch:{ IllegalArgumentException -> 0x0157 }
            if (r0 != 0) goto L_0x015e
            X.00H r0 = r7.A06     // Catch:{ IllegalArgumentException -> 0x0157 }
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalArgumentException -> 0x0157 }
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r0 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r0     // Catch:{ IllegalArgumentException -> 0x0157 }
            r0.A03()     // Catch:{ IllegalArgumentException -> 0x0157 }
            r2.A01()     // Catch:{ IllegalArgumentException -> 0x0157 }
            goto L_0x015e
        L_0x0157:
            r1 = move-exception
            java.lang.String r0 = "ChatLockBackup/restoreFromMigration failed"
            com.whatsapp.util.Log.e(r0, r1)
            r6 = 0
        L_0x015e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored chat lock "
            X.C17900vP.A0n(r0, r1, r6)
            X.1NR r7 = r4.A08
            X.0z4 r6 = r7.A04
            java.lang.String r2 = r6.A0l()
            java.lang.String r1 = r6.A0n()
            java.lang.String r0 = "share_preferences"
            android.net.Uri r8 = X.AnonymousClass1NR.A01(r0, r2, r1)
            X.11C r0 = r7.A02
            X.11B r7 = r0.A0O()
            r9 = 0
            r11 = r9
            r12 = r9
            r10 = r9
            android.database.Cursor r8 = r7.A03(r8, r9, r10, r11, r12)
            r9 = 0
            if (r8 != 0) goto L_0x01aa
            r2 = 0
        L_0x018c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>PrepareMessageStoreTransferTask/successfully restored some shared preferences setting "
            X.C17900vP.A0n(r0, r1, r2)
            if (r5 == 0) goto L_0x019c
            if (r3 == 0) goto L_0x019c
            r0 = 1
            if (r2 != 0) goto L_0x019d
        L_0x019c:
            r0 = 0
        L_0x019d:
            X.1Vv r1 = r4.A07
            r0 = r0 ^ 1
            X.1Vw r1 = r1.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            return
        L_0x01aa:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0257 }
            r1 = 1
            if (r0 == 0) goto L_0x0251
            r0 = 2
            java.lang.String r2 = r8.getString(r0)     // Catch:{ all -> 0x0257 }
            java.lang.String r7 = r8.getString(r9)     // Catch:{ all -> 0x0257 }
            int r0 = r2.hashCode()     // Catch:{ all -> 0x0257 }
            switch(r0) {
                case -1572742348: goto L_0x01c2;
                case -891985903: goto L_0x0207;
                case 104431: goto L_0x0218;
                case 3327612: goto L_0x0228;
                case 64711720: goto L_0x023d;
                default: goto L_0x01c1;
            }     // Catch:{ all -> 0x0257 }
        L_0x01c1:
            goto L_0x01aa
        L_0x01c2:
            java.lang.String r0 = "string_set"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0257 }
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = r8.getString(r1)     // Catch:{ JSONException -> 0x01fc }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x01fc }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x01fc }
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01fc }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ JSONException -> 0x01fc }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x01fc }
            r1 = 0
        L_0x01de:
            int r0 = r10.length()     // Catch:{ JSONException -> 0x01fc }
            if (r1 >= r0) goto L_0x01f0
            java.lang.Object r0 = r10.get(r1)     // Catch:{ JSONException -> 0x01fc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x01fc }
            r2.add(r0)     // Catch:{ JSONException -> 0x01fc }
            int r1 = r1 + 1
            goto L_0x01de
        L_0x01f0:
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r6)     // Catch:{ JSONException -> 0x01fc }
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r7, r2)     // Catch:{ JSONException -> 0x01fc }
            r0.apply()     // Catch:{ JSONException -> 0x01fc }
            goto L_0x01aa
        L_0x01fc:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0257 }
            java.lang.String r0 = "MigrateFileDirectlyHelper/replaceSharedPreferencesSetting/ failed to create json array for key: "
            X.C17900vP.A0h(r0, r7, r1, r2)     // Catch:{ all -> 0x0257 }
            goto L_0x01aa
        L_0x0207:
            java.lang.String r0 = "string"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0257 }
            if (r0 == 0) goto L_0x01aa
            java.lang.String r0 = r8.getString(r1)     // Catch:{ all -> 0x0257 }
            r6.A1u(r7, r0)     // Catch:{ all -> 0x0257 }
            goto L_0x01aa
        L_0x0218:
            java.lang.String r0 = "int"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0257 }
            if (r0 == 0) goto L_0x01aa
            int r0 = r8.getInt(r1)     // Catch:{ all -> 0x0257 }
            X.C17900vP.A0M(r6, r7, r0)     // Catch:{ all -> 0x0257 }
            goto L_0x01aa
        L_0x0228:
            java.lang.String r0 = "long"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0257 }
            if (r0 == 0) goto L_0x01aa
            long r0 = r8.getLong(r1)     // Catch:{ all -> 0x0257 }
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r6)     // Catch:{ all -> 0x0257 }
            X.C17880vN.A1D(r2, r7, r0)     // Catch:{ all -> 0x0257 }
            goto L_0x01aa
        L_0x023d:
            java.lang.String r0 = "boolean"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0257 }
            if (r0 == 0) goto L_0x01aa
            int r0 = r8.getInt(r1)     // Catch:{ all -> 0x0257 }
            if (r0 == r1) goto L_0x024c
            r1 = 0
        L_0x024c:
            r6.A1w(r7, r1)     // Catch:{ all -> 0x0257 }
            goto L_0x01aa
        L_0x0251:
            r8.close()
            r2 = 1
            goto L_0x018c
        L_0x0257:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x025c }
            throw r1
        L_0x025c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0261:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2NU.A0L():void");
    }

    public void A0M(long j) {
        if (j > 0) {
            SystemClock.sleep(j);
        }
    }

    public String A0K() {
        return "PrepareDirectTransferMsgStoreHelper/";
    }
}
