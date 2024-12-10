package X;

import android.content.Context;
import android.os.Environment;
import com.whatsapp.chatlock.passcode.ChatLockPasscodeManager;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.crypto.NoSuchPaddingException;

/* renamed from: X.1NZ  reason: invalid class name */
public abstract class AnonymousClass1NZ {
    public final AnonymousClass1NP A00;
    public final AnonymousClass1NT A01;
    public final AnonymousClass1L7 A02;
    public final AnonymousClass1NX A03;
    public final C219317y A04;

    public final A26 A0F(C171828sL r4) {
        AnonymousClass9JN r0;
        C18070vi.A0d(r4, 0);
        AnonymousClass1Ez r1 = new AnonymousClass1Ez(A0M());
        if (this.A01.A04()) {
            r0 = AnonymousClass9JN.CRYPT15;
        } else {
            r0 = AnonymousClass9JN.CRYPT14;
        }
        A26 A0T = A0T(r4, r0);
        A0T.A00 = Long.valueOf(r1.A02());
        return A0T;
    }

    public void A0H() {
    }

    public final File A0G(AnonymousClass9JN r3) {
        File A032;
        if (r3 == AnonymousClass9JN.UNENCRYPTED) {
            C219417z r0 = this.A04.A00;
            C219417z.A00(r0);
            A032 = r0.A04;
        } else {
            A032 = this.A02.A03();
        }
        if (!A032.exists()) {
            A032.mkdirs();
        }
        return A032;
    }

    public void A0I(Context context, C171768sF r6, File file) {
        if (this instanceof AnonymousClass1Nb) {
            AnonymousClass1Nb r3 = (AnonymousClass1Nb) this;
            ArrayList A0N = r3.A0N(file);
            if (!A0N.isEmpty()) {
                AnonymousClass1Ez r1 = new AnonymousClass1Ez("chat-settings");
                boolean A0S = r3.A0S(r6, (File) A0N.get(A0N.size() - 1));
                if (r6 != null) {
                    r6.A0C = Long.valueOf(r1.A02());
                }
                if (A0S) {
                    AnonymousClass1Ez r12 = new AnonymousClass1Ez("wallpapers");
                    ((AnonymousClass1NZ) r3.A0P.get()).A0I(context, r6, file);
                    if (r6 != null) {
                        r6.A0N = Long.valueOf(r12.A02());
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        AnonymousClass1Ez r13 = new AnonymousClass1Ez(A0M());
        try {
            File file2 = (File) C29431cG.A0e(A0N(file));
            if (file2 != null) {
                A0S(r6, file2);
            }
        } finally {
            if (r6 != null) {
                A0K(r6, r13.A02());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00a9, code lost:
        if (r2 != -1) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0J(X.C171878sQ r18) {
        /*
            r17 = this;
            r6 = r17
            X.1NP r7 = r6.A00
            java.lang.String r13 = r6.A0M()
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            android.content.SharedPreferences r2 = r7.A07()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r0 = "_backup_status"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 1
            int r14 = r2.getInt(r1, r0)
            android.content.SharedPreferences r3 = r7.A07()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r0 = "_backup_size"
            r1.append(r0)
            java.lang.String r2 = r1.toString()
            r0 = -1
            long r15 = r3.getLong(r2, r0)
            android.content.SharedPreferences r4 = r7.A07()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r13)
            java.lang.String r2 = "_backup_media_size"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            long r0 = r4.getLong(r2, r0)
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r11 = 0
            X.A26 r10 = new X.A26
            r10.<init>(r11, r12, r13, r14, r15)
            int r1 = r10.A01
            r0 = 3
            if (r1 == r0) goto L_0x00b0
            long r4 = r10.A02
            int r1 = (int) r4
            r0 = -1
            if (r0 == r1) goto L_0x00b0
            double r2 = (double) r4
            r9 = r18
            r6.A0O(r9, r2)
            android.content.SharedPreferences r8 = r7.A07()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r13)
            java.lang.String r0 = "_backup_google_saved_size"
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r0 = 0
            long r7 = r8.getLong(r7, r0)
            double r0 = (double) r7
            double r2 = r2 - r0
            r6.A0Q(r9, r2)
            java.lang.Long r0 = r10.A04
            r7 = -1
            if (r0 == 0) goto L_0x00b1
            long r2 = r0.longValue()
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00a7
            double r0 = (double) r2
            r6.A0R(r9, r0)
        L_0x00a7:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x00b1
        L_0x00ab:
            long r4 = r4 - r2
            double r0 = (double) r4
            r6.A0P(r9, r0)
        L_0x00b0:
            return
        L_0x00b1:
            r2 = 0
            goto L_0x00ab
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NZ.A0J(X.8sQ):void");
    }

    public void A0K(C171768sF r2, long j) {
        if (this instanceof AnonymousClass2Dd) {
            r2.A0M = Long.valueOf(j);
        } else if (this instanceof C46152Dc) {
            r2.A0B = Long.valueOf(j);
        }
    }

    public final boolean A0L() {
        AnonymousClass1NW r2 = this.A03.A00;
        String externalStorageState = Environment.getExternalStorageState();
        if ((!AnonymousClass1NW.A00(r2) || !r2.A00.A0C()) && !r2.A01.A0K(externalStorageState)) {
            return false;
        }
        return true;
    }

    public String A0M() {
        if (this instanceof AnonymousClass2Dd) {
            return "wa-db";
        }
        if (this instanceof AnonymousClass1Nb) {
            return "chat-settings";
        }
        return "chatlock_backup";
    }

    public ArrayList A0N(File file) {
        ArrayList A022;
        String str;
        if (this instanceof AnonymousClass2Dd) {
            A022 = A3K.A02(AnonymousClass9JN.CRYPT14);
            str = "wa.db";
        } else if (this instanceof AnonymousClass1Nb) {
            A022 = A3K.A02(AnonymousClass9JN.CRYPT13);
            A022.add(".crypt1");
            str = "chatsettingsbackup.db";
        } else {
            C18070vi.A0d(file, 0);
            A022 = A3K.A02(AnonymousClass9JN.CRYPT14);
            str = "chatlock_backup.bkup";
        }
        return A8L.A01(new File(file, str), A022);
    }

    public void A0O(C171878sQ r2, double d) {
        if (this instanceof AnonymousClass2Dd) {
            r2.A0X = Double.valueOf(d);
        } else if (this instanceof AnonymousClass1Nb) {
            r2.A0K = Double.valueOf(d);
        }
    }

    public void A0P(C171878sQ r2, double d) {
        if (this instanceof AnonymousClass2Dd) {
            r2.A0Y = Double.valueOf(d);
        } else if (this instanceof AnonymousClass1Nb) {
            r2.A0L = Double.valueOf(d);
        } else if (this instanceof C46152Dc) {
            r2.A0I = Double.valueOf(d);
        }
    }

    public void A0Q(C171878sQ r2, double d) {
        if (this instanceof AnonymousClass2Dd) {
            r2.A0W = Double.valueOf(d);
        } else if (this instanceof AnonymousClass1Nb) {
            r2.A0J = Double.valueOf(d);
        }
    }

    public void A0R(C171878sQ r2, double d) {
        if (this instanceof AnonymousClass1Nb) {
            r2.A0Z = Double.valueOf(d);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f2, code lost:
        if (r1 == null) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0101 A[Catch:{ Exception -> 0x011f }] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0112 A[Catch:{ Exception -> 0x011f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0S(X.C171768sF r14, java.io.File r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.AnonymousClass2Dd
            if (r0 == 0) goto L_0x0093
            r3 = r13
            X.2Dd r3 = (X.AnonymousClass2Dd) r3
            X.1Lt r2 = r3.A0U()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r2.A02
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.writeLock()
            r4.lock()
            r9 = 0
            r2.A08()     // Catch:{ Exception -> 0x0078 }
            X.118 r0 = r2.A00     // Catch:{ Exception -> 0x0078 }
            android.content.Context r1 = r0.A00     // Catch:{ Exception -> 0x0078 }
            java.lang.String r0 = r2.getDatabaseName()     // Catch:{ Exception -> 0x0078 }
            java.io.File r8 = r1.getDatabasePath(r0)     // Catch:{ Exception -> 0x0078 }
            r15.getAbsolutePath()     // Catch:{ Exception -> 0x0078 }
            r8.getAbsolutePath()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r1 = r15.getName()     // Catch:{ Exception -> 0x0078 }
            java.lang.String r0 = "wa.db"
            int r0 = X.A3K.A00(r1, r0)     // Catch:{ Exception -> 0x0078 }
            X.9JN r1 = X.AnonymousClass9JN.A02(r0)     // Catch:{ Exception -> 0x0078 }
            X.00H r0 = r3.A03     // Catch:{ Exception -> 0x0078 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0078 }
            X.9mv r0 = (X.C191639mv) r0     // Catch:{ Exception -> 0x0078 }
            r7 = 0
            X.C18070vi.A0d(r1, r9)     // Catch:{ Exception -> 0x0078 }
            X.A5N r5 = r0.A00(r7, r1, r15, r9)     // Catch:{ Exception -> 0x0078 }
            X.118 r6 = r3.A00     // Catch:{ Exception -> 0x0078 }
            r11 = r9
            r10 = r9
            X.9jz r1 = r5.A07(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0078 }
            if (r14 == 0) goto L_0x005f
            int r0 = r1.A00     // Catch:{ Exception -> 0x0078 }
            int r0 = X.A3O.A00(r0)     // Catch:{ Exception -> 0x0078 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0078 }
            r14.A07 = r0     // Catch:{ Exception -> 0x0078 }
        L_0x005f:
            r4.unlock()
            X.1Lt r0 = r3.A02     // Catch:{ Exception -> 0x0071 }
            X.AnonymousClass2Dd.A00(r2, r0)     // Catch:{ Exception -> 0x0071 }
            r2.A08()     // Catch:{ Exception -> 0x0071 }
            int r1 = r1.A00
            r0 = 1
            if (r1 != r0) goto L_0x0077
            r9 = 1
            return r9
        L_0x0071:
            r1 = move-exception
            java.lang.String r0 = "WaDatabaseBackupProducer/restore copy backup tables failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0077:
            return r9
        L_0x0078:
            r1 = move-exception
            java.lang.String r0 = "WaDatabaseBackupProducer/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x008e }
            if (r14 == 0) goto L_0x008a
            int r0 = X.A3O.A02(r1)     // Catch:{ all -> 0x008e }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008e }
            r14.A07 = r0     // Catch:{ all -> 0x008e }
        L_0x008a:
            r4.unlock()
            return r9
        L_0x008e:
            r0 = move-exception
            r4.unlock()
            throw r0
        L_0x0093:
            boolean r0 = r13 instanceof X.AnonymousClass1Nb
            if (r0 == 0) goto L_0x0136
            r2 = r13
            X.1Nb r2 = (X.AnonymousClass1Nb) r2
            monitor-enter(r2)
            r2.A0i()     // Catch:{ all -> 0x0133 }
            X.118 r5 = r2.A09     // Catch:{ all -> 0x0133 }
            android.content.Context r1 = r5.A00     // Catch:{ all -> 0x0133 }
            java.lang.String r0 = "chatsettings.db"
            java.io.File r7 = r1.getDatabasePath(r0)     // Catch:{ all -> 0x0133 }
            boolean r0 = r15.exists()     // Catch:{ all -> 0x0133 }
            r8 = 0
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "chatsettingsbackup.db"
            java.io.File r1 = r1.getDatabasePath(r0)     // Catch:{ all -> 0x0133 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "chat-settings-store/restore/plain text backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
            X.17y r0 = r2.A04     // Catch:{ all -> 0x0133 }
            boolean r8 = X.C64062u9.A0P(r0, r1, r7)     // Catch:{ all -> 0x0133 }
            boolean r0 = r1.delete()     // Catch:{ all -> 0x0133 }
            if (r0 != 0) goto L_0x00d1
            java.lang.String r0 = "chat-settings-store/restore/unable to delete temp backup file"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0133 }
        L_0x00d1:
            if (r8 == 0) goto L_0x0131
            goto L_0x0117
        L_0x00d4:
            X.00H r0 = r2.A0J     // Catch:{ Exception -> 0x011f }
            java.lang.Object r4 = r0.get()     // Catch:{ Exception -> 0x011f }
            X.9mv r4 = (X.C191639mv) r4     // Catch:{ Exception -> 0x011f }
            java.lang.String r1 = r15.getName()     // Catch:{ Exception -> 0x011f }
            java.lang.String r0 = "chatsettingsbackup.db"
            int r3 = X.A3K.A00(r1, r0)     // Catch:{ Exception -> 0x011f }
            if (r3 <= 0) goto L_0x0113
            X.9JN r1 = X.AnonymousClass9JN.CRYPT13     // Catch:{ Exception -> 0x011f }
            int r0 = r1.version     // Catch:{ Exception -> 0x011f }
            if (r3 < r0) goto L_0x00f4
            X.9JN r1 = X.AnonymousClass9JN.A02(r3)     // Catch:{ Exception -> 0x011f }
            if (r1 == 0) goto L_0x0113
        L_0x00f4:
            r6 = 0
            X.A5N r4 = r4.A00(r6, r1, r15, r8)     // Catch:{ Exception -> 0x011f }
            r10 = r8
            r9 = r8
            X.9jz r1 = r4.A07(r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x011f }
            if (r14 == 0) goto L_0x010d
            int r0 = r1.A00     // Catch:{ Exception -> 0x011f }
            int r0 = X.A3O.A00(r0)     // Catch:{ Exception -> 0x011f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x011f }
            r14.A03 = r0     // Catch:{ Exception -> 0x011f }
        L_0x010d:
            int r1 = r1.A00     // Catch:{ Exception -> 0x011f }
            r0 = 1
            if (r1 != r0) goto L_0x0131
            goto L_0x0116
        L_0x0113:
            X.9JN r1 = X.AnonymousClass9JN.UNENCRYPTED     // Catch:{ Exception -> 0x011f }
            goto L_0x00f4
        L_0x0116:
            r8 = 1
        L_0x0117:
            X.1Nh r0 = r2.A00     // Catch:{ all -> 0x0133 }
            if (r0 == 0) goto L_0x0131
            r0.A0J()     // Catch:{ all -> 0x0133 }
            goto L_0x0131
        L_0x011f:
            r1 = move-exception
            java.lang.String r0 = "chat-settings-store/restore failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0133 }
            if (r14 == 0) goto L_0x0131
            int r0 = X.A3O.A02(r1)     // Catch:{ all -> 0x0133 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0133 }
            r14.A03 = r0     // Catch:{ all -> 0x0133 }
        L_0x0131:
            monitor-exit(r2)
            return r8
        L_0x0133:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0136:
            r4 = r13
            X.2Dc r4 = (X.C46152Dc) r4
            r1 = 1
            X.C18070vi.A0d(r15, r1)
            r10 = 0
            X.00H r5 = r4.A07     // Catch:{ Exception -> 0x01ba }
            java.lang.Object r0 = r5.get()     // Catch:{ Exception -> 0x01ba }
            X.2nD r0 = (X.C59992nD) r0     // Catch:{ Exception -> 0x01ba }
            java.io.File r9 = r0.A01()     // Catch:{ Exception -> 0x01ba }
            X.00H r0 = r4.A04     // Catch:{ Exception -> 0x01ba }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x01ba }
            X.9mv r3 = (X.C191639mv) r3     // Catch:{ Exception -> 0x01ba }
            java.lang.String r2 = r15.getName()     // Catch:{ Exception -> 0x01ba }
            X.C18070vi.A0X(r2)     // Catch:{ Exception -> 0x01ba }
            java.lang.String r0 = "chatlock_backup.bkup"
            int r0 = X.A3K.A00(r2, r0)     // Catch:{ Exception -> 0x01ba }
            if (r0 <= 0) goto L_0x01a3
            X.9JN r0 = X.AnonymousClass9JN.A02(r0)     // Catch:{ Exception -> 0x01ba }
            if (r0 == 0) goto L_0x01a3
        L_0x0167:
            r8 = 0
            X.A5N r6 = r3.A00(r8, r0, r15, r10)     // Catch:{ Exception -> 0x01ba }
            X.118 r7 = r4.A01     // Catch:{ Exception -> 0x01ba }
            r12 = r10
            r11 = r10
            X.9jz r3 = r6.A07(r7, r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x01ba }
            java.lang.Object r0 = r5.get()     // Catch:{ Exception -> 0x01ba }
            X.2nD r0 = (X.C59992nD) r0     // Catch:{ Exception -> 0x01ba }
            X.8ax r0 = r0.A00()     // Catch:{ Exception -> 0x01ba }
            if (r0 == 0) goto L_0x01a6
            X.1TK r5 = r4.A00     // Catch:{ Exception -> 0x01ba }
            X.0z4 r0 = r5.A00     // Catch:{ Exception -> 0x01ba }
            X.00H r0 = r0.A00     // Catch:{ Exception -> 0x01ba }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x01ba }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ Exception -> 0x01ba }
            java.lang.String r0 = "chat_lock_broken_encoding_checked"
            boolean r0 = r2.getBoolean(r0, r10)     // Catch:{ Exception -> 0x01ba }
            if (r0 != 0) goto L_0x01a6
            X.00H r0 = r4.A06     // Catch:{ Exception -> 0x01ba }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x01ba }
            com.whatsapp.chatlock.passcode.ChatLockPasscodeManager r0 = (com.whatsapp.chatlock.passcode.ChatLockPasscodeManager) r0     // Catch:{ Exception -> 0x01ba }
            r0.A03()     // Catch:{ Exception -> 0x01ba }
            r5.A01()     // Catch:{ Exception -> 0x01ba }
            goto L_0x01a6
        L_0x01a3:
            X.9JN r0 = X.AnonymousClass9JN.UNENCRYPTED     // Catch:{ Exception -> 0x01ba }
            goto L_0x0167
        L_0x01a6:
            if (r14 == 0) goto L_0x01b4
            int r0 = r3.A00     // Catch:{ Exception -> 0x01ba }
            int r0 = X.A3O.A00(r0)     // Catch:{ Exception -> 0x01ba }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x01ba }
            r14.A02 = r0     // Catch:{ Exception -> 0x01ba }
        L_0x01b4:
            int r0 = r3.A00     // Catch:{ Exception -> 0x01ba }
            if (r0 != r1) goto L_0x01cc
            r10 = 1
            return r10
        L_0x01ba:
            r1 = move-exception
            java.lang.String r0 = "ChatLockBackup/restore failed"
            com.whatsapp.util.Log.e(r0, r1)
            if (r14 == 0) goto L_0x01cc
            int r0 = X.A3O.A02(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.A02 = r0
        L_0x01cc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NZ.A0S(X.8sF, java.io.File):boolean");
    }

    public A26 A0T(C171828sL r18, AnonymousClass9JN r19) {
        A26 a26;
        A26 a262;
        C171828sL r1 = r18;
        AnonymousClass9JN r5 = r19;
        if (this instanceof AnonymousClass2Dd) {
            AnonymousClass2Dd r4 = (AnonymousClass2Dd) this;
            AnonymousClass1Ez r7 = new AnonymousClass1Ez("wa-db");
            if (!r4.A0L()) {
                Log.i("WaDatabaseBackupProducer/backup/skip no media or read-only media");
                a262 = new A26("wa-db", 1);
            } else {
                C24811Lt A0U = r4.A0U();
                StringBuilder sb = new StringBuilder();
                sb.append("wa.db.crypt");
                sb.append(r5.version);
                File file = new File(r4.A0G(r5), sb.toString());
                try {
                    if (!AnonymousClass2Dd.A00(r4.A02, A0U)) {
                        Log.e("WaDatabaseBackupProducer/failed-to-copy");
                        A0U.A08();
                        a262 = new A26("wa-db", 1);
                    } else if (!A0U.A07()) {
                        Log.e("WaDatabaseBackupProducer/backup/wal checkpoint failed");
                        A0U.A08();
                        a262 = new A26("wa-db", 1);
                    } else {
                        Log.i("WaDatabaseBackupProducer/backup/close-backup-db");
                        A0U.close();
                        Iterator it = r4.A0N(r4.A0G(r5)).iterator();
                        while (it.hasNext()) {
                            File file2 = (File) it.next();
                            if (!file2.equals(file) && file2.exists()) {
                                file2.delete();
                            }
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("WaDatabaseBackupProducer/backup/to ");
                        sb2.append(file);
                        Log.i(sb2.toString());
                        A5N A002 = ((C191639mv) r4.A03.get()).A00((C19947A0e) null, r5, file, false);
                        File databasePath = A0U.A00.A00.getDatabasePath(A0U.getDatabaseName());
                        if (C18020vd.A05(C18040vf.A02, r4.A01, 8968)) {
                            Context context = r4.A00.A00;
                            if (A002.A09(context, databasePath)) {
                                Log.i("WaDatabaseBackupProducer/backup/skip backup because backup file has the same source file");
                                a262 = new A26("wa-db", 2);
                            } else if (!A002.A0A(context, databasePath)) {
                                Log.w("WaDatabaseBackupProducer/backup/prepare for backup failed");
                                C64062u9.A0Q(file);
                                a262 = new A26("wa-db", 1);
                            }
                        } else if (!A002.A0A(r4.A00.A00, (File) null)) {
                            Log.w("WaDatabaseBackupProducer/backup/prepare for backup failed");
                            C64062u9.A0Q(file);
                            a262 = new A26("wa-db", 1);
                        }
                        A002.A08((C72053Kl) null, databasePath);
                        a262 = new A26(file, (Long) null, "wa-db", 0, r4.A0E(r4.A0G(r5)));
                    }
                } catch (IOException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e) {
                    Log.e("WaDatabaseBackupProducer/backup/failed", e);
                    C64062u9.A0Q(file);
                    a262 = new A26("wa-db", 1);
                } catch (Throwable th) {
                    A0U.A08();
                    throw th;
                }
                A0U.A08();
            }
            r1.A0C = Integer.valueOf(A3O.A01(a262.A01));
            r1.A0T = Long.valueOf(r7.A02());
            return a262;
        }
        C46152Dc r42 = (C46152Dc) this;
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(r1, 1);
        AnonymousClass1Ez r2 = new AnonymousClass1Ez("chatlock_backup");
        if (!((ChatLockPasscodeManager) ((C31191fA) r42.A05.get()).A0I.get()).A02.A05()) {
            a26 = new A26((File) null, (Long) null, "chatlock_backup", 3, 0);
        } else {
            File A012 = ((C59992nD) r42.A07.get()).A01();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("chatlock_backup.bkup.crypt");
            sb3.append(r5.version);
            File file3 = new File(r42.A0G(r5), sb3.toString());
            try {
                A5N A003 = ((C191639mv) r42.A04.get()).A00((C19947A0e) null, r5, file3, false);
                if (C18020vd.A05(C18040vf.A02, r42.A02, 8968)) {
                    Context context2 = r42.A01.A00;
                    if (A003.A09(context2, A012)) {
                        Log.i("ChatLockBackup/skip backup because backup file has the same source file");
                        a26 = new A26((File) null, (Long) null, "chatlock_backup", 2, 0);
                    } else if (!A003.A0A(context2, A012)) {
                        Log.e("ChatLockBackup/backup prepare for backup failed");
                        C64062u9.A0Q(file3);
                        a26 = new A26((File) null, (Long) null, "chatlock_backup", 1, 0);
                    }
                } else if (!A003.A0A(r42.A01.A00, (File) null)) {
                    Log.e("ChatLockBackup/backup prepare for backup failed");
                    C64062u9.A0Q(file3);
                    a26 = new A26((File) null, (Long) null, "chatlock_backup", 1, 0);
                }
                A003.A08((C72053Kl) null, A012);
                a26 = new A26(file3, (Long) null, "chatlock_backup", 0, r42.A0E(r42.A0G(r5)));
            } catch (IOException e2) {
                Log.e("ChatLockBackup/backup backup failed", e2);
                C64062u9.A0Q(file3);
                a26 = new A26((File) null, (Long) null, "chatlock_backup", 1, 0);
            }
        }
        r1.A05 = Integer.valueOf(A3O.A01(a26.A01));
        r1.A0G = Long.valueOf(r2.A02());
        return a26;
    }

    public AnonymousClass1NZ(AnonymousClass1NX r2) {
        this.A03 = r2;
        this.A02 = r2.A03;
        this.A01 = r2.A02;
        this.A00 = r2.A01;
        this.A04 = r2.A04;
    }

    public final long A0E(File file) {
        File file2 = (File) C29431cG.A0e(A0N(file));
        if (file2 != null) {
            return file2.length();
        }
        return 0;
    }
}
