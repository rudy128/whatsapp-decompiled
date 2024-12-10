package com.whatsapp.registration.directmigration;

import X.A60;
import X.AnonymousClass00H;
import X.AnonymousClass11O;
import X.AnonymousClass11S;
import X.AnonymousClass18O;
import X.AnonymousClass190;
import X.AnonymousClass1Cd;
import X.AnonymousClass1EG;
import X.AnonymousClass1L7;
import X.AnonymousClass1NO;
import X.AnonymousClass1NP;
import X.AnonymousClass1NT;
import X.AnonymousClass1Nb;
import X.AnonymousClass4aW;
import X.AnonymousClass9JN;
import X.C170178or;
import X.C17960vV;
import X.C18030ve;
import X.C18070vi;
import X.C19680yj;
import X.C19760yx;
import X.C19770yy;
import X.C19830z4;
import X.C218617r;
import X.C219217x;
import X.C27431Wb;
import X.C29491cN;
import X.C33621j7;
import X.C46152Dc;
import X.C49532Qv;
import X.C57372iy;
import X.C59282m3;
import X.C59992nD;
import X.C72053Kl;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class MigrationContentProvider extends C19680yj {
    public static UriMatcher A0I;
    public static final List A0J;
    public AnonymousClass190 A00;
    public C218617r A01;
    public AnonymousClass11S A02;
    public AnonymousClass18O A03;
    public C29491cN A04;
    public AnonymousClass1NP A05;
    public C33621j7 A06;
    public AnonymousClass1NO A07;
    public AnonymousClass1NT A08;
    public C46152Dc A09;
    public AnonymousClass1L7 A0A;
    public C219217x A0B;
    public C19830z4 A0C;
    public AnonymousClass11O A0D;
    public C18030ve A0E;
    public AnonymousClass1Nb A0F;
    public AnonymousClass4aW A0G;
    public C170178or A0H;

    static {
        C19770yy r2 = C19770yy.STRING;
        ArrayList arrayList = new ArrayList(Arrays.asList(new C19760yx[]{new C19760yx("push_name", r2), new C19760yx("interface_gdrive_backup_frequency", r2), new C19760yx("interface_gdrive_backup_network_setting", r2), new C19760yx("gdrive_include_videos_in_backup", C19770yy.BOOL)}));
        arrayList.addAll(C19830z4.A01());
        A0J = Collections.unmodifiableList(arrayList);
    }

    private int A01(Uri uri, int i) {
        return A02(uri.getQueryParameter("query_param_country_code"), uri.getQueryParameter("query_param_phone_number"), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a2, code lost:
        if (r0 != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b2, code lost:
        if (r3 < r1) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        if (r3 == 268435456) goto L_0x00bf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A02(java.lang.String r17, java.lang.String r18, int r19) {
        /*
            r16 = this;
            r10 = r16
            android.content.Context r3 = r10.getContext()
            if (r3 != 0) goto L_0x000a
            r0 = 7
        L_0x0009:
            return r0
        L_0x000a:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            int r0 = android.os.Binder.getCallingUid()
            java.lang.String r2 = r1.getNameForUid(r0)
            r9 = 0
            android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch:{ RuntimeException -> 0x002c }
            android.content.pm.ApplicationInfo r0 = r3.getApplicationInfo()     // Catch:{ RuntimeException -> 0x002c }
            int r1 = r0.uid     // Catch:{ RuntimeException -> 0x002c }
            int r0 = android.os.Binder.getCallingUid()     // Catch:{ RuntimeException -> 0x002c }
            int r0 = r4.checkSignatures(r1, r0)     // Catch:{ RuntimeException -> 0x002c }
            if (r0 != 0) goto L_0x0044
            goto L_0x0043
        L_0x002c:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FileSharingHelper/checkSameSignatureCaller. Error is : "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r9 = 0
            goto L_0x0044
        L_0x0043:
            r9 = 1
        L_0x0044:
            X.11S r0 = r10.A02
            r0.A0I()
            com.whatsapp.Me r1 = r0.A00
            r12 = r17
            r13 = r18
            if (r1 != 0) goto L_0x0101
            java.lang.String r0 = "MigrationContentProvider/phoneNumberMatches/me is null"
            r10.A06(r0, r13)
            X.0z4 r0 = r10.A0C
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "saved_user_before_logout"
            r4 = 0
            java.lang.String r7 = r1.getString(r0, r4)
            X.0ve r0 = r10.A0E
            r6 = 11167(0x2b9f, float:1.5648E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            if (r0 != 0) goto L_0x00ca
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = X.C20056A5f.A02(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = X.C63942tw.A04(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ca
        L_0x008d:
            java.lang.String r0 = "MigrationContentProvider/phoneNumberMatches/userBeforeLogoutEmpty"
        L_0x008f:
            r10.A06(r0, r13)
        L_0x0092:
            r8 = 0
        L_0x0093:
            java.lang.String r0 = "com.whatsapp.w4b"
            boolean r1 = r0.equals(r2)
            java.lang.String r0 = "com.whatsapp"
            boolean r0 = r0.equals(r2)
            if (r1 != 0) goto L_0x00a4
            r5 = 0
            if (r0 == 0) goto L_0x00a5
        L_0x00a4:
            r5 = 1
        L_0x00a5:
            if (r2 == 0) goto L_0x00b4
            long r3 = X.C24211Jh.A00(r3, r2)
            if (r1 == 0) goto L_0x00c4
            r1 = 597(0x255, double:2.95E-321)
        L_0x00af:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 1
            if (r0 >= 0) goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r0 = -1
            r3 = r19
            if (r3 == r0) goto L_0x00bf
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = 0
            if (r3 != r1) goto L_0x00c0
        L_0x00bf:
            r0 = 1
        L_0x00c0:
            if (r9 != 0) goto L_0x01ad
            r0 = 2
            return r0
        L_0x00c4:
            if (r0 == 0) goto L_0x00b4
            r1 = 452962(0x6e962, double:2.23793E-318)
            goto L_0x00af
        L_0x00ca:
            X.0ve r0 = r10.A0E
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            if (r0 == 0) goto L_0x0113
            X.0z4 r0 = r10.A0C
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "pref_country_code_of_logged_out_user"
            java.lang.String r0 = r1.getString(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fe
            X.0z4 r0 = r10.A0C
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "pref_phone_number_of_logged_out_user"
            java.lang.String r0 = r1.getString(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0113
        L_0x00fe:
            java.lang.String r0 = "MigrationContentProvider/phoneNumberMatches/userBeforeLogoutEmptySavedWithMeManager"
            goto L_0x008f
        L_0x0101:
            java.lang.String r0 = r1.cc
            boolean r0 = r0.equals(r12)
            r6 = 1
            if (r0 == 0) goto L_0x0176
            java.lang.String r0 = r1.number
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0176
            goto L_0x0154
        L_0x0113:
            X.0ve r0 = r10.A0E
            boolean r0 = X.C18020vd.A05(r5, r0, r6)
            if (r0 == 0) goto L_0x0157
            X.0z4 r0 = r10.A0C
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "pref_country_code_of_logged_out_user"
            java.lang.String r14 = r1.getString(r0, r4)
            if (r14 != 0) goto L_0x012f
            java.lang.String r14 = ""
        L_0x012f:
            X.0z4 r0 = r10.A0C
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = "pref_phone_number_of_logged_out_user"
            java.lang.String r15 = r1.getString(r0, r4)
            if (r15 != 0) goto L_0x0143
            java.lang.String r15 = ""
        L_0x0143:
            boolean r0 = r14.equals(r12)
            if (r0 == 0) goto L_0x016f
            boolean r0 = r15.equals(r13)
            if (r0 == 0) goto L_0x016f
            java.lang.String r11 = "MigrationContentProvider/phoneNumberMatches/matchedWithUserBeforeLogout"
            r10.A07(r11, r12, r13, r14, r15)
        L_0x0154:
            r8 = 1
            goto L_0x0093
        L_0x0157:
            java.lang.String r14 = X.C20056A5f.A02(r7)
            if (r14 != 0) goto L_0x015f
            java.lang.String r14 = ""
        L_0x015f:
            java.lang.String r1 = X.C63942tw.A04(r7)
            X.C17960vV.A07(r1)
            int r0 = r14.length()
            java.lang.String r15 = r1.substring(r0)
            goto L_0x0143
        L_0x016f:
            java.lang.String r11 = "MigrationContentProvider/phoneNumberMatches/userBeforeLogoutMismatch"
            r10.A07(r11, r12, r13, r14, r15)
            goto L_0x0092
        L_0x0176:
            r8 = 0
            X.190 r5 = r10.A00
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r4 = r1.number
            r0 = 42
            java.lang.Character r1 = java.lang.Character.valueOf(r0)
            java.lang.String r0 = X.AnonymousClass1EG.A09(r1, r4)
            r7.append(r0)
            java.lang.String r0 = X.AnonymousClass1EG.A09(r1, r13)
            r7.append(r0)
            java.lang.String r0 = " has_multiple_accounts "
            r7.append(r0)
            X.1cN r0 = r10.A04
            boolean r0 = r0.A0E()
            r7.append(r0)
            java.lang.String r1 = r7.toString()
            java.lang.String r0 = "MigrationContentProvider/phoneNumberMatches/phone-number-mismatch"
            r5.A0G(r0, r1, r6)
            goto L_0x0093
        L_0x01ad:
            if (r5 != 0) goto L_0x01b1
            r0 = 3
            return r0
        L_0x01b1:
            if (r2 != 0) goto L_0x01b5
            r0 = 4
            return r0
        L_0x01b5:
            if (r0 != 0) goto L_0x01b9
            r0 = 5
            return r0
        L_0x01b9:
            r0 = 0
            if (r8 != 0) goto L_0x0009
            r0 = 6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.A02(java.lang.String, java.lang.String, int):int");
    }

    public static synchronized UriMatcher A03() {
        UriMatcher uriMatcher;
        synchronized (MigrationContentProvider.class) {
            if (A0I == null) {
                UriMatcher uriMatcher2 = new UriMatcher(-1);
                A0I = uriMatcher2;
                uriMatcher2.addURI("com.whatsapp.provider.MigrationContentProvider", "msg_store", 1);
                A0I.addURI("com.whatsapp.provider.MigrationContentProvider", "wallpaper", 2);
                A0I.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_setting_store", 3);
                A0I.addURI("com.whatsapp.provider.MigrationContentProvider", "sticker_store", 4);
                A0I.addURI("com.whatsapp.provider.MigrationContentProvider", "share_preferences", 5);
                A0I.addURI("com.whatsapp.provider.MigrationContentProvider", "media", 7);
                A0I.addURI("com.whatsapp.provider.MigrationContentProvider", "chat_lock_passcode", 8);
            }
            uriMatcher = A0I;
        }
        return uriMatcher;
    }

    private void A05(MatrixCursor matrixCursor, File file, int i) {
        int length;
        if (i != 0) {
            File[] listFiles = file.listFiles();
            if (listFiles == null || (length = listFiles.length) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("MigrationContentProvider/fillMediaCursor/skipping folder ");
                sb.append(file);
                Log.i(sb.toString());
                return;
            }
            int i2 = 0;
            do {
                File file2 = listFiles[i2];
                if (file2.isDirectory()) {
                    A05(matrixCursor, file2, i - 1);
                } else {
                    matrixCursor.addRow(new String[]{file2.getAbsolutePath().replace(this.A0A.A05().getAbsolutePath(), "")});
                }
                i2++;
            } while (i2 < length);
        }
    }

    private void A06(String str, String str2) {
        AnonymousClass190 r2 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1EG.A09('*', str2));
        sb.append(" has_multiple_accounts ");
        sb.append(this.A04.A0E());
        r2.A0G(str, sb.toString(), true);
    }

    private void A07(String str, String str2, String str3, String str4, String str5) {
        AnonymousClass190 r2 = this.A00;
        StringBuilder sb = new StringBuilder();
        sb.append(AnonymousClass1EG.A09('*', str5));
        sb.append(AnonymousClass1EG.A09('*', str3));
        sb.append("; has_multiple_accounts=");
        sb.append(this.A04.A0E());
        sb.append("; consumerCountryCode=");
        sb.append(str4);
        sb.append("; smb_cc=");
        sb.append(str2);
        r2.A0G(str, sb.toString(), true);
    }

    private File A04(String str) {
        if (!TextUtils.isEmpty(str) && this.A0B.A0G()) {
            File file = new File(this.A0A.A05(), str);
            try {
                if (!this.A01.A0l(file) || !file.exists()) {
                    return null;
                }
                return file;
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public Bundle call(String str, String str2, String str3, Bundle bundle) {
        A09();
        if (!"com.whatsapp.provider.MigrationContentProvider".equals(str)) {
            return null;
        }
        return call(str2, str3, bundle);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        File A042;
        A09();
        if (A01(uri, -1) != 0 || A03().match(uri) != 7 || (A042 = A04(uri.getQueryParameter("path"))) == null || !A042.delete()) {
            return 0;
        }
        return 1;
    }

    public String getType(Uri uri) {
        A09();
        if (A01(uri, -1) == 0) {
            if (1 == A03().match(uri)) {
                try {
                    Log.i("MigrationContentProvider/getType");
                    File A0I2 = C33621j7.A00(this.A06).A09.A0I();
                    if (A0I2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MigrationContentProvider/getType/msgstore-file-name = ");
                        sb.append(A0I2.getName());
                        Log.i(sb.toString());
                        return A0I2.getName();
                    }
                } catch (Exception e) {
                    Log.i("MigrationContentProvider/getType/exception = ", e);
                    return null;
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("This operation is not supported ");
                sb2.append(uri);
                throw new UnsupportedOperationException(sb2.toString());
            }
        }
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        A09();
        return null;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        int i2;
        String obj;
        File A0I2;
        A09();
        C18070vi.A0d(str, 0);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else if ("rwt".equals(str)) {
            i = 1006632960;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        int A012 = A01(uri, i);
        if (A012 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("MigrationContentProvider/openFile/");
            sb2.append(uri.getPath());
            Log.i(sb2.toString());
            int match = A03().match(uri);
            if (match == 1) {
                C27431Wb r6 = C33621j7.A00(this.A06).A09;
                AnonymousClass00H r4 = r6.A0Z;
                C57372iy r2 = (C57372iy) r4.get();
                boolean z = true;
                synchronized (r2) {
                    r2.A00 = true;
                }
                AnonymousClass1Cd r0 = r6.A0I;
                r0.A06();
                if (r0.A03.exists()) {
                    Log.i("MessageStoreBackup/getFileForMigration/backup-db");
                    int A0F2 = r6.A0F((C72053Kl) null, (Runnable) null, 1, 0);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("MessageStoreBackup/finish-backup-db-successful? = ");
                    if (A0F2 != 0) {
                        z = false;
                    }
                    sb3.append(z);
                    Log.i(sb3.toString());
                    if (A0F2 == 0) {
                        try {
                            A0I2 = r6.A0I();
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("MessageStoreBackup/getFileForMigration/latest-backup-file");
                            sb4.append(A0I2);
                            Log.i(sb4.toString());
                        } catch (IOException e) {
                            Log.e("MessageStoreBackup/getFileForMigration/exception = ", e);
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("MessageStoreBackup/failed-to-get-backup-file");
                            sb5.append(e);
                            throw new FileNotFoundException(sb5.toString());
                        }
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("MessageStoreBackup/getFileForMigration/backup-failed/backup-result = ");
                        sb6.append(A0F2);
                        sb6.append(" log = ");
                        C57372iy r22 = (C57372iy) r4.get();
                        synchronized (r22) {
                            obj = r22.A01.toString();
                            C18070vi.A0X(obj);
                        }
                        sb6.append(obj);
                        throw new FileNotFoundException(sb6.toString());
                    }
                } else {
                    throw new FileNotFoundException(String.valueOf(14));
                }
            } else if (match == 2) {
                A0I2 = new File(this.A0G.A08.A00.getFilesDir(), "wallpaper.jpg");
            } else if (match == 3) {
                AnonymousClass1Nb r42 = this.A0F;
                ReentrantReadWriteLock.WriteLock writeLock = r42.A0U().A02.writeLock();
                C17960vV.A07(writeLock);
                writeLock.lock();
                try {
                    A0I2 = r42.A09.A00.getDatabasePath("chatsettings.db");
                    if (A0I2.exists()) {
                        r42.A0U().close();
                    } else {
                        writeLock.unlock();
                        A0I2 = null;
                    }
                } finally {
                    writeLock.unlock();
                }
            } else if (match == 4) {
                A0I2 = this.A0H.A0U(AnonymousClass9JN.UNENCRYPTED).A03;
            } else if (match == 7) {
                A0I2 = A04(uri.getQueryParameter("path"));
            } else if (match == 8) {
                A0I2 = ((C59992nD) this.A09.A07.get()).A01();
            } else {
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Unknown URI ");
                sb7.append(uri);
                throw new IllegalArgumentException(sb7.toString());
            }
            if (A0I2 != null) {
                return ParcelFileDescriptor.open(A0I2, i);
            }
            return null;
        }
        switch (A012) {
            case 1:
                i2 = 8;
                break;
            case 2:
                i2 = 9;
                break;
            case 3:
                i2 = 10;
                break;
            case 4:
                i2 = 11;
                break;
            case 5:
                i2 = 12;
                break;
            case 6:
                i2 = 13;
                break;
            default:
                i2 = 0;
                break;
        }
        throw new FileNotFoundException(String.valueOf(i2));
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.database.Cursor query(android.net.Uri r14, java.lang.String[] r15, java.lang.String r16, java.lang.String[] r17, java.lang.String r18) {
        /*
            r13 = this;
            r13.A09()
            r0 = -1
            int r2 = r13.A01(r14, r0)
            if (r2 == 0) goto L_0x0020
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MigrationContentProvider/query denied "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r9 = 0
        L_0x001f:
            return r9
        L_0x0020:
            android.content.UriMatcher r0 = A03()
            int r1 = r0.match(r14)
            r0 = 5
            r8 = 3
            if (r1 == r0) goto L_0x0055
            r0 = 7
            if (r1 != r0) goto L_0x014a
            X.1L7 r0 = r13.A0A
            java.io.File r3 = r0.A05()
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "path"
            r2[r1] = r0
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            r9.<init>(r2)
            X.17x r0 = r13.A0B
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x001f
            boolean r0 = r3.exists()
            if (r0 == 0) goto L_0x001f
            r0 = 4
            r13.A05(r9, r3, r0)
            return r9
        L_0x0055:
            r7 = 4
            java.lang.String[] r2 = new java.lang.String[r8]
            r1 = 0
            java.lang.String r0 = "key"
            r2[r1] = r0
            java.lang.String r0 = "value"
            r6 = 1
            r5 = 2
            r2[r6] = r0
            java.lang.String r0 = "valueType"
            r4 = 0
            r2[r5] = r0
            android.database.MatrixCursor r9 = new android.database.MatrixCursor
            r9.<init>(r2)
            java.util.List r0 = A0J
            java.util.Iterator r12 = r0.iterator()
        L_0x0075:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r12.next()
            X.0yx r0 = (X.C19760yx) r0
            android.database.MatrixCursor$RowBuilder r3 = r9.newRow()
            java.lang.Object r10 = r0.A00
            r3.add(r10)
            java.lang.Object r0 = r0.A01
            X.C17960vV.A07(r0)
            X.0yy r0 = (X.C19770yy) r0
            X.C17960vV.A07(r10)
            java.lang.String r10 = (java.lang.String) r10
            int r2 = r0.ordinal()
            if (r2 == r5) goto L_0x0124
            if (r2 == r4) goto L_0x0119
            if (r2 == r7) goto L_0x0104
            if (r2 == r6) goto L_0x00d4
            if (r2 != r8) goto L_0x00b6
            X.0z4 r0 = r13.A0C
            java.util.Set r1 = r0.A0w(r10)
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
        L_0x00b3:
            r3.add(r0)
        L_0x00b6:
            if (r2 == r5) goto L_0x00d0
            if (r2 == r4) goto L_0x00cd
            if (r2 == r7) goto L_0x00ca
            if (r2 == r6) goto L_0x00c7
            if (r2 != r8) goto L_0x0161
            java.lang.String r0 = "string_set"
        L_0x00c3:
            r3.add(r0)
            goto L_0x0075
        L_0x00c7:
            java.lang.String r0 = "boolean"
            goto L_0x00c3
        L_0x00ca:
            java.lang.String r0 = "long"
            goto L_0x00c3
        L_0x00cd:
            java.lang.String r0 = "int"
            goto L_0x00c3
        L_0x00d0:
            java.lang.String r0 = "string"
            goto L_0x00c3
        L_0x00d4:
            X.1NP r1 = r13.A05
            X.C18070vi.A0d(r10, r4)
            android.content.SharedPreferences r0 = r1.A07()
            boolean r0 = r0.contains(r10)
            if (r0 == 0) goto L_0x00f1
            android.content.SharedPreferences r0 = r1.A07()
            boolean r0 = r0.getBoolean(r10, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 != 0) goto L_0x00fb
        L_0x00f1:
            X.0z4 r0 = r13.A0C
            boolean r0 = r0.A2Y(r10)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00fb:
            boolean r0 = r0.booleanValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00b3
        L_0x0104:
            X.0z4 r0 = r13.A0C
            X.00H r0 = r0.A00
            java.lang.Object r11 = r0.get()
            android.content.SharedPreferences r11 = (android.content.SharedPreferences) r11
            r0 = 0
            long r0 = r11.getLong(r10, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x00b3
        L_0x0119:
            X.0z4 r0 = r13.A0C
            int r0 = r0.A0N(r10)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x00b3
        L_0x0124:
            java.lang.String r11 = "push_name"
            boolean r0 = r11.equals(r10)
            if (r0 == 0) goto L_0x0138
            X.11O r0 = r13.A0D
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r11, r0)
            goto L_0x00b3
        L_0x0138:
            X.0z4 r0 = r13.A0C
            X.00H r0 = r0.A00
            java.lang.Object r1 = r0.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r0 = ""
            java.lang.String r0 = r1.getString(r10, r0)
            goto L_0x00b3
        L_0x014a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unknown URI "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0161:
            java.lang.String r1 = "unexpected type"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.registration.directmigration.MigrationContentProvider.query(android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String):android.database.Cursor");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        A09();
        return 0;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        String str3;
        String str4;
        A09();
        if (bundle == null) {
            Log.e("MigrationContentProvider/call no params passed");
            str4 = "No params passed";
        } else {
            int A022 = A02(bundle.getString("query_param_country_code"), bundle.getString("query_param_phone_number"), -1);
            if (A022 != 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("MigrationContentProvider/call denied ");
                sb.append(A022);
                Log.w(sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("call denied (");
                sb2.append(A022);
                sb2.append(")");
                throw new SecurityException(sb2.toString());
            } else if (!"retrieve_rk".equals(str)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("MigrationContentProvider/call failed/unsupported method ");
                sb3.append(str);
                Log.e(sb3.toString());
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Unsupported method (");
                sb4.append(str);
                sb4.append(")");
                str4 = sb4.toString();
            } else {
                if (!this.A08.A04()) {
                    str3 = "MigrationContentProvider/retrieveRK/encryption disabled";
                } else {
                    byte[] byteArray = bundle.getByteArray("pk");
                    if (byteArray == null) {
                        Log.e("MigrationContentProvider/retrieveRK/no public key");
                        str4 = "No key provided";
                    } else {
                        byte[] A032 = this.A07.A03();
                        if (A032 == null) {
                            str3 = "MigrationContentProvider/retrieveRK/no root key";
                        } else {
                            try {
                                Bundle bundle2 = new Bundle(1);
                                bundle2.putByteArray("erk", A60.A02(A032, byteArray));
                                C59282m3 A002 = this.A07.A00();
                                if (this.A05.A08() != C49532Qv.PASSWORD_ENCRYPTED || A002 == null) {
                                    return bundle2;
                                }
                                bundle2.putByteArray("ph", A60.A02(A002.A01.A00, byteArray));
                                bundle2.putByteArray("ps", A60.A02(A002.A02.A00, byteArray));
                                bundle2.putInt("ic", A002.A00);
                                return bundle2;
                            } catch (InvalidKeyException | NoSuchAlgorithmException | InvalidKeySpecException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                                Log.w("MigrationContentProvider/call encryption failed", e);
                                Bundle bundle3 = new Bundle();
                                bundle3.putString("error", "MigrationContentProvider/call encryption failed");
                                StringWriter stringWriter = new StringWriter();
                                e.printStackTrace(new PrintWriter(stringWriter));
                                bundle3.putString("exception", stringWriter.toString());
                                return bundle3;
                            }
                        }
                    }
                }
                Log.e(str3);
                return null;
            }
        }
        Bundle bundle4 = new Bundle();
        bundle4.putString("error", str4);
        return bundle4;
    }
}
