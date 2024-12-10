package com.whatsapp.backup.google.workers;

import X.A0L;
import X.A1B;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11E;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass11W;
import X.AnonymousClass181;
import X.AnonymousClass18K;
import X.AnonymousClass19K;
import X.AnonymousClass1L7;
import X.AnonymousClass1LU;
import X.AnonymousClass1NL;
import X.AnonymousClass1NM;
import X.AnonymousClass1NP;
import X.AnonymousClass1NT;
import X.AnonymousClass1NW;
import X.AnonymousClass1O1;
import X.AnonymousClass1OZ;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BU;
import X.AnonymousClass8gY;
import X.C000100c;
import X.C000200d;
import X.C108955ca;
import X.C108965cb;
import X.C162168Jj;
import X.C162248Jv;
import X.C167368g8;
import X.C171378rc;
import X.C175238yN;
import X.C17890vO;
import X.C180129Lg;
import X.C18030ve;
import X.C191969nU;
import X.C195939uB;
import X.C196269uj;
import X.C19830z4;
import X.C19948A0f;
import X.C20078A6e;
import X.C218617r;
import X.C22881Do;
import X.C23651Hc;
import X.C27301Vn;
import X.C36801oU;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class GoogleEncryptedReUploadWorker extends Worker {
    public C191969nU A00;
    public boolean A01 = false;
    public final C218617r A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass181 A04;
    public final AnonymousClass1NW A05;
    public final AnonymousClass1NP A06;
    public final AnonymousClass1NT A07;
    public final C36801oU A08;
    public final C175238yN A09;
    public final AnonymousClass8gY A0A;
    public final C19948A0f A0B;
    public final A0L A0C;
    public final AnonymousClass11E A0D;
    public final AnonymousClass1L7 A0E;
    public final AnonymousClass1NM A0F;
    public final AnonymousClass11P A0G;
    public final AnonymousClass118 A0H;
    public final C19830z4 A0I;
    public final C18030ve A0J;
    public final AnonymousClass18K A0K;
    public final C171378rc A0L = new C171378rc();
    public final AnonymousClass1OZ A0M;
    public final C195939uB A0N;
    public final AnonymousClass1NL A0O;
    public final AnonymousClass11W A0P;
    public final AnonymousClass10I A0Q;
    public final AnonymousClass19K A0R;
    public final AnonymousClass00H A0S;
    public final List A0T = AnonymousClass000.A13();
    public final Random A0U;
    public final AtomicBoolean A0V;
    public final C27301Vn A0W;
    public final AnonymousClass1LU A0X;
    public final C22881Do A0Y;
    public final AnonymousClass1O1 A0Z;

    /* JADX WARNING: type inference failed for: r0v7, types: [X.9Lg, java.lang.Object] */
    private C180129Lg A00(int i, int i2) {
        C19830z4 r2 = this.A0I;
        String A0f = r2.A0f();
        if (!TextUtils.isEmpty(A0f)) {
            C171378rc r22 = this.A0L;
            Long valueOf = Long.valueOf((System.currentTimeMillis() - r2.A0T(A0f)) / 3600000);
            r22.A08 = valueOf;
            r22.A05 = valueOf;
        }
        C171378rc r1 = this.A0L;
        if (i < 6) {
            r1.A02 = Integer.valueOf(i2);
            this.A0K.CC7(r1);
            return new Object();
        }
        r1.A02 = C108955ca.A0e();
        this.A0K.CC7(r1);
        return new C162168Jj();
    }

    public static C162248Jv A01(AnonymousClass1NP r4, long j) {
        Integer num;
        A1B a1b = new A1B();
        a1b.A02 = true;
        if (r4.A04() == 0) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A0N;
        }
        a1b.A00 = num;
        C20078A6e A012 = a1b.A01();
        C196269uj r42 = new C196269uj(GoogleEncryptedReUploadWorker.class);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r42.A02(j, timeUnit);
        r42.A03(A012);
        r42.A06(AnonymousClass00R.A01, timeUnit, 900000);
        return (C162248Jv) r42.A00();
    }

    public static void A03(String str, boolean z) {
        if (z) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("google-encrypted-re-upload-worker ");
            A10.append(str);
            C17890vO.A1B(A10, ", work aborted");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v33, resolved type: X.8Jj} */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03a0, code lost:
        r21.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:?, code lost:
        r13.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r9.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03af, code lost:
        if (r5.A01() == false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03b1, code lost:
        r13 = r35.size();
        X.C17900vP.A0j("gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/", X.AnonymousClass000.A10(), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03c2, code lost:
        if (r5.A01() == false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03c4, code lost:
        r31.A0R.set(0);
        r9 = X.C20127A8m.A08(r5, r7, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03cf, code lost:
        if (r9 != false) goto L_0x03e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03d1, code lost:
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload/files/failed to delete files");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e8, code lost:
        r15 = new java.util.concurrent.atomic.AtomicBoolean(true);
        r3 = new java.util.concurrent.atomic.AtomicReference((java.lang.Object) null);
        r9 = new java.util.concurrent.CountDownLatch(r13);
        r16 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0400, code lost:
        if (r16.hasNext() == false) goto L_0x0453;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0402, code lost:
        r14 = (X.C20002A2r) r16.next();
        X.C18070vi.A0b(r14);
        r13 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0411, code lost:
        if (r13.exists() != false) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0413, code lost:
        r13 = X.AnonymousClass000.A10();
        r13.append("gdrive/encrypted-re-upload/backup-file file ");
        r13.append("<file>");
        X.C17890vO.A1A(r13, " does not exist");
        r9.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0430, code lost:
        if ((!r13.isDirectory()) == false) goto L_0x048d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0432, code lost:
        ((java.util.concurrent.Executor) X.C20134A8u.A00.get()).execute(new X.C21472Akd(r3, r31, r7, r14, r15, r9, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0453, code lost:
        com.whatsapp.util.Log.i("gdrive/encrypted-re-upload/files waiting for backup to finish...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r13 = r9.await(86400000, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x048d, code lost:
        r3 = X.AnonymousClass000.A10();
        r3.append("gdrive/encrypted-re-upload/backup-file/expected-file-got-directory-instead/");
        r3 = X.AnonymousClass000.A0o("<file>", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04cd, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x04d8, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04d9, code lost:
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload", r3);
        r31.A02.A0L(r31.A0D.A0f());
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00fa, code lost:
        if (r3 == null) goto L_0x00fc;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04cd A[ExcHandler: 1oV | 9LZ (r3v57 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:70:0x0264] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0509 A[Catch:{ InterruptedException -> 0x0462, 1oV | 9LZ -> 0x04cd, all -> 0x068e }] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x050a A[Catch:{ InterruptedException -> 0x0462, 1oV | 9LZ -> 0x04cd, all -> 0x068e }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0646 A[Catch:{ InterruptedException -> 0x0462, 1oV | 9LZ -> 0x04cd, all -> 0x068e }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017e A[Catch:{ InterruptedException -> 0x0462, 1oV | 9LZ -> 0x04cd, all -> 0x068e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r61 = this;
            java.lang.String r26 = "GoogleDriveNotificationManager1"
            java.lang.String r29 = "gdrive_old_media_enc_re_upload"
            r1 = 0
            r0 = r61
            X.0ve r12 = r0.A0J     // Catch:{ all -> 0x068e }
            r3 = 3129(0xc39, float:4.385E-42)
            X.0vf r2 = X.C18040vf.A02     // Catch:{ all -> 0x068e }
            boolean r3 = X.C18020vd.A05(r2, r12, r3)     // Catch:{ all -> 0x068e }
            if (r3 == 0) goto L_0x0070
            java.lang.String r3 = "google-encrypted-re-upload-worker/publishNotification enable setForegroundAsync"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x068e }
            X.118 r3 = r0.A0H     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            android.content.Context r7 = r3.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            X.73t r6 = X.C217217d.A03(r7)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            java.lang.String r3 = "chat_history_backup@1"
            r6.A0M = r3     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r4 = 2
            X.C18070vi.A0d(r7, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r3 = 0
            android.content.Intent r3 = X.AnonymousClass1LU.A1V(r7, r3, r3, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            android.app.PendingIntent r3 = X.C1408573i.A00(r7, r1, r3, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r6.A0A = r3     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            X.C17880vN.A1G(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r5 = 1
            r6.A06 = r5     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r3 = 2131899057(0x7f1232b1, float:1.943305E38)
            java.lang.String r3 = r4.getString(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r6.A0E(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r3 = 2131889882(0x7f120eda, float:1.941444E38)
            java.lang.String r3 = r4.getString(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r6.A0D(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r3 = 100
            r6.A07(r3, r3, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            android.app.Notification r6 = r6.A05()     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            boolean r5 = X.AnonymousClass112.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r4 = 5
            X.9rG r3 = new X.9rG     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r3.<init>(r4, r6, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            X.5oM r3 = r0.A06(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            r3.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0075 }
            goto L_0x0075
        L_0x0070:
            java.lang.String r3 = "google-encrypted-re-upload-worker/publishNotification skip setForegroundAsync"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ all -> 0x068e }
        L_0x0075:
            X.1O1 r3 = r0.A0Z     // Catch:{ all -> 0x068e }
            r60 = r3
            r10 = 1
            r4 = r3
            r3 = r29
            r4.A01(r3, r10)     // Catch:{ all -> 0x068e }
            androidx.work.WorkerParameters r3 = r0.A01     // Catch:{ all -> 0x068e }
            r59 = r3
            int r4 = r3.A00     // Catch:{ all -> 0x068e }
            X.8rc r8 = r0.A0L     // Catch:{ all -> 0x068e }
            java.lang.Long r3 = X.C17880vN.A0n(r4)     // Catch:{ all -> 0x068e }
            r8.A03 = r3     // Catch:{ all -> 0x068e }
            X.0z4 r3 = r0.A0I     // Catch:{ all -> 0x068e }
            r58 = r3
            java.lang.String r30 = r58.A0f()     // Catch:{ all -> 0x068e }
            X.11S r5 = r0.A03     // Catch:{ all -> 0x068e }
            r5.A0I()     // Catch:{ all -> 0x068e }
            com.whatsapp.Me r7 = r5.A00     // Catch:{ all -> 0x068e }
            X.1NT r3 = r0.A07     // Catch:{ all -> 0x068e }
            r57 = r3
            boolean r3 = r57.A04()     // Catch:{ all -> 0x068e }
            r6 = r3 ^ 1
            java.lang.String r3 = "backup encryption is not enabled"
            A03(r3, r6)     // Catch:{ all -> 0x068e }
            if (r6 != 0) goto L_0x066f
            X.1oU r6 = r0.A08     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.A0P     // Catch:{ all -> 0x068e }
            boolean r9 = r3.get()     // Catch:{ all -> 0x068e }
            java.lang.String r3 = "backup is running"
            A03(r3, r9)     // Catch:{ all -> 0x068e }
            if (r9 != 0) goto L_0x066f
            X.118 r3 = r0.A0H     // Catch:{ all -> 0x068e }
            android.content.Context r3 = r3.A00     // Catch:{ all -> 0x068e }
            boolean r3 = X.C41361wE.A09(r3)     // Catch:{ all -> 0x068e }
            r9 = r3 ^ 1
            java.lang.String r3 = "Google Drive is not accessible"
            A03(r3, r9)     // Catch:{ all -> 0x068e }
            if (r9 != 0) goto L_0x066f
            boolean r9 = android.text.TextUtils.isEmpty(r30)     // Catch:{ all -> 0x068e }
            java.lang.String r3 = "grdive account name is empty"
            A03(r3, r9)     // Catch:{ all -> 0x068e }
            if (r9 != 0) goto L_0x066f
            X.1Do r3 = r0.A0Y     // Catch:{ all -> 0x068e }
            boolean r9 = r3.A01     // Catch:{ all -> 0x068e }
            java.lang.String r3 = "WhatsApp login has failed"
            A03(r3, r9)     // Catch:{ all -> 0x068e }
            if (r9 != 0) goto L_0x066f
            X.1NW r3 = r0.A05     // Catch:{ all -> 0x068e }
            r21 = r3
            boolean r3 = r21.A03()     // Catch:{ all -> 0x068e }
            r9 = r3 ^ 1
            java.lang.String r3 = "read/write storage permission denied"
            A03(r3, r9)     // Catch:{ all -> 0x068e }
            if (r9 != 0) goto L_0x066f
            if (r7 == 0) goto L_0x00fc
            java.lang.String r3 = r7.jabber_id     // Catch:{ all -> 0x068e }
            r7 = 0
            if (r3 != 0) goto L_0x00fd
        L_0x00fc:
            r7 = 1
        L_0x00fd:
            java.lang.String r3 = "me or jabberId is null"
            A03(r3, r7)     // Catch:{ all -> 0x068e }
            if (r7 != 0) goto L_0x066f
            X.1NP r3 = r0.A06     // Catch:{ all -> 0x068e }
            r56 = r3
            boolean r7 = X.C20134A8u.A07(r56)     // Catch:{ all -> 0x068e }
            java.lang.String r3 = "media restore is pending"
            A03(r3, r7)     // Catch:{ all -> 0x068e }
            if (r7 != 0) goto L_0x066f
            r6.A08()     // Catch:{ all -> 0x068e }
            boolean r3 = r6.A09     // Catch:{ all -> 0x068e }
            r7 = r3 ^ 1
            java.lang.String r3 = "sdcard is not available"
            A03(r3, r7)     // Catch:{ all -> 0x068e }
            if (r7 == 0) goto L_0x0129
            r2 = 9
            X.9Lg r4 = r0.A00(r4, r2)     // Catch:{ all -> 0x068e }
            goto L_0x0674
        L_0x0129:
            r6.A07()     // Catch:{ all -> 0x068e }
            r6.A0A()     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.A0T     // Catch:{ all -> 0x068e }
            boolean r3 = r3.get()     // Catch:{ all -> 0x068e }
            r7 = r3 ^ 1
            java.lang.String r3 = "network is not available"
            A03(r3, r7)     // Catch:{ all -> 0x068e }
            if (r7 == 0) goto L_0x014e
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0U     // Catch:{ all -> 0x068e }
            boolean r3 = r2.get()     // Catch:{ all -> 0x068e }
            r2 = 5
            if (r3 == 0) goto L_0x0148
            r2 = 4
        L_0x0148:
            X.9Lg r4 = r0.A00(r4, r2)     // Catch:{ all -> 0x068e }
            goto L_0x0674
        L_0x014e:
            java.util.concurrent.atomic.AtomicBoolean r3 = r6.A0Q     // Catch:{ all -> 0x068e }
            boolean r7 = r3.getAndSet(r10)     // Catch:{ all -> 0x068e }
            java.lang.String r3 = "media re-encryption already running"
            A03(r3, r7)     // Catch:{ all -> 0x068e }
            if (r7 == 0) goto L_0x0162
            r2 = 3
            X.9Lg r4 = r0.A00(r4, r2)     // Catch:{ all -> 0x068e }
            goto L_0x0674
        L_0x0162:
            r6.A02()     // Catch:{ all -> 0x068e }
            r5.A0I()     // Catch:{ all -> 0x068e }
            com.whatsapp.Me r3 = r5.A00     // Catch:{ all -> 0x068e }
            if (r3 != 0) goto L_0x0195
            java.lang.String r2 = "google-re-enc-upload-worker/my-jid/me is null, can't proceed"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x068e }
        L_0x0171:
            java.lang.String r2 = "google-re-enc-upload-worker/handle-intent/backup jid is null."
        L_0x0173:
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x068e }
        L_0x0176:
            java.util.concurrent.atomic.AtomicBoolean r2 = r0.A0V     // Catch:{ all -> 0x068e }
            boolean r2 = r2.get()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0577
            X.8gY r3 = r0.A0A     // Catch:{ all -> 0x068e }
            boolean r2 = r3.A06()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0636
            r2 = r59
            int r2 = r2.A00     // Catch:{ all -> 0x068e }
            r4 = 6
            if (r2 >= r4) goto L_0x0618
            boolean r2 = r3.A04()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0535
            goto L_0x0532
        L_0x0195:
            java.lang.String r11 = r3.jabber_id     // Catch:{ all -> 0x068e }
            if (r11 != 0) goto L_0x019f
            java.lang.String r2 = "google-re-enc-upload-worker/my-jid/jidUser is null, fatal error."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x068e }
            goto L_0x0171
        L_0x019f:
            java.lang.String r54 = r58.A0f()     // Catch:{ all -> 0x068e }
            if (r54 != 0) goto L_0x01a8
            java.lang.String r2 = "google-re-enc-upload-worker/handle-intent/gdrive account name is null."
            goto L_0x0173
        L_0x01a8:
            android.content.Context r14 = r0.A00     // Catch:{ all -> 0x068e }
            X.11W r13 = r0.A0P     // Catch:{ all -> 0x068e }
            X.181 r9 = r0.A04     // Catch:{ all -> 0x068e }
            X.1L7 r3 = r0.A0E     // Catch:{ all -> 0x068e }
            r20 = r3
            X.9uB r7 = r0.A0N     // Catch:{ all -> 0x068e }
            X.A0f r3 = r0.A0B     // Catch:{ all -> 0x068e }
            r19 = r3
            X.1NL r5 = r0.A0O     // Catch:{ all -> 0x068e }
            X.11E r4 = r0.A0D     // Catch:{ all -> 0x068e }
            X.10I r3 = r0.A0Q     // Catch:{ all -> 0x068e }
            java.lang.String r55 = "background"
            X.A7X r41 = new X.A7X     // Catch:{ all -> 0x068e }
            r42 = r14
            r43 = r9
            r44 = r21
            r45 = r57
            r46 = r19
            r47 = r4
            r48 = r20
            r49 = r12
            r50 = r7
            r51 = r5
            r52 = r13
            r53 = r3
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55)     // Catch:{ all -> 0x068e }
            boolean r3 = r0.A01     // Catch:{ all -> 0x068e }
            if (r3 != 0) goto L_0x01ee
            java.util.List r4 = r0.A0T     // Catch:{ all -> 0x068e }
            X.17r r3 = r0.A02     // Catch:{ all -> 0x068e }
            java.util.ArrayList r3 = X.C20134A8u.A02(r3)     // Catch:{ all -> 0x068e }
            r4.addAll(r3)     // Catch:{ all -> 0x068e }
            r0.A01 = r10     // Catch:{ all -> 0x068e }
        L_0x01ee:
            X.11P r3 = r0.A0G     // Catch:{ all -> 0x068e }
            r18 = r3
            java.util.List r3 = r0.A0T     // Catch:{ all -> 0x068e }
            r17 = r3
            X.18K r3 = r0.A0K     // Catch:{ all -> 0x068e }
            r16 = r3
            X.17r r15 = r0.A02     // Catch:{ all -> 0x068e }
            X.1OZ r14 = r0.A0M     // Catch:{ all -> 0x068e }
            X.8gY r13 = r0.A0A     // Catch:{ all -> 0x068e }
            X.00H r3 = r0.A0S     // Catch:{ all -> 0x068e }
            java.lang.Object r9 = r3.get()     // Catch:{ all -> 0x068e }
            X.AMX r9 = (X.AMX) r9     // Catch:{ all -> 0x068e }
            X.1NM r7 = r0.A0F     // Catch:{ all -> 0x068e }
            X.A0L r5 = r0.A0C     // Catch:{ all -> 0x068e }
            X.8yN r3 = r0.A09     // Catch:{ all -> 0x068e }
            X.9nU r4 = new X.9nU     // Catch:{ all -> 0x068e }
            r31 = r4
            r32 = r15
            r33 = r21
            r34 = r56
            r35 = r57
            r36 = r3
            r37 = r9
            r38 = r19
            r39 = r13
            r40 = r5
            r42 = r20
            r43 = r7
            r44 = r18
            r45 = r58
            r46 = r12
            r47 = r16
            r48 = r8
            r49 = r14
            r50 = r11
            r51 = r17
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x068e }
            r0.A00 = r4     // Catch:{ all -> 0x068e }
            java.lang.String r28 = "gdrive/encrypted-re-upload"
            X.1NT r3 = r4.A03     // Catch:{ all -> 0x068e }
            boolean r3 = r3.A04()     // Catch:{ all -> 0x068e }
            r27 = 0
            if (r3 != 0) goto L_0x0250
            java.lang.String r2 = "gdrive/encrypted-re-upload/encryption is not enabled so nothing to be done here"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x068e }
            goto L_0x0176
        L_0x0250:
            X.8yN r3 = r4.A04     // Catch:{ all -> 0x068e }
            r43 = r3
            r5 = 15
            X.C20735AWq.A00(r3, r5)     // Catch:{ all -> 0x068e }
            X.A7X r11 = r4.A09     // Catch:{ all -> 0x068e }
            X.AmB r3 = r11.A05     // Catch:{ all -> 0x068e }
            r3.A00 = r1     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicInteger r3 = r11.A0E     // Catch:{ all -> 0x068e }
            r3.set(r1)     // Catch:{ all -> 0x068e }
            X.1oW r5 = r4.A07     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r3 = X.C20127A8m.A09(r5, r11)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r3 == 0) goto L_0x04c7
            java.lang.String r7 = "gdrive/encrypted-re-upload/files"
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r3 = r4.A0I     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.A2x r7 = X.C20127A8m.A01(r5, r11, r3, r7)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r7 != 0) goto L_0x0280
            java.lang.String r2 = "gdrive/encrypted-re-upload/files backup doesn't exist"
        L_0x027b:
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x04d6
        L_0x0280:
            X.11P r12 = r4.A0C     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.A8L r9 = X.A8L.A00     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.0ve r3 = r4.A0E     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            long r16 = r9.A06(r3, r1)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r18 = 16384(0x4000, double:8.0948E-320)
            X.8gK r9 = new X.8gK     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13 = r9
            r14 = r7
            r15 = r12
            r13.<init>(r14, r15, r16, r18)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r25 = "gdrive/backup/files"
            r12 = r25
            java.lang.Object r12 = X.A84.A00(r9, r5, r12)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r10)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = r24
            if (r12 != r9) goto L_0x04b7
            java.lang.String r9 = "gdrive/encrypted-re-upload/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r9 = r5.A01()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r9 == 0) goto L_0x04d6
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.List r12 = java.util.Collections.synchronizedList(r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.C18070vi.A0b(r12)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.Map r13 = r4.A0K     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13.clear()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.A0L r9 = r4.A08     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.HashMap r9 = r9.A01(r5, r7, r12, r10)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r9 != 0) goto L_0x02ca
            java.lang.String r2 = "gdrive/encrypted-re-upload/failed to load files for encrypted re-upload"
            goto L_0x027b
        L_0x02ca:
            r13.putAll(r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.List r9 = r4.A0J     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.ArrayList r14 = X.C17880vN.A10(r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r9 = X.C17880vN.A0z(r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.List r35 = java.util.Collections.synchronizedList(r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.C18070vi.A0b(r35)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r9 = "gdrive/encrypted-re-upload/files finding filesToBeUploaded"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r13 = "gdrive/encrypted-re-upload/perf/files-to-be-uploaded"
            X.1Ez r23 = new X.1Ez     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = r23
            r9.<init>((java.lang.String) r13)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = 785(0x311, float:1.1E-42)
            int r39 = X.C18020vd.A00(r2, r3, r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = 12868(0x3244, float:1.8032E-41)
            int r40 = X.C18020vd.A00(r2, r3, r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = 786(0x312, float:1.101E-42)
            long r41 = X.AnonymousClass8BR.A05(r3, r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r41 = r41 * r2
            java.util.Iterator r22 = r14.iterator()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x0309:
            boolean r2 = r22.hasNext()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x03a8
            java.io.File r21 = X.AnonymousClass8BS.A0T(r22)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r2 = r5.A01()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x04b3
            r35.size()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r9 = X.C17880vN.A0z(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.1NW r2 = r4.A01     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r2 = r2.A03()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x04bb
            r3 = 0
            r2 = r21
            boolean r2 = X.C20134A8u.A09(r3, r2, r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x04b3
            java.util.concurrent.atomic.AtomicReference r14 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r14.<init>(r3)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            int r2 = r9.size()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.concurrent.CountDownLatch r13 = new java.util.concurrent.CountDownLatch     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13.<init>(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.Iterator r20 = r9.iterator()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x0345:
            boolean r2 = r20.hasNext()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r19 = 1
            if (r2 == 0) goto L_0x03a0
            java.io.File r9 = X.AnonymousClass8BS.A0T(r20)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r2 = r5.A01()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x04b3
            boolean r2 = r9.exists()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x039d
            long r17 = r9.length()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r15 = 0
            int r2 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x039d
        L_0x0367:
            java.lang.String r3 = X.C20127A8m.A02(r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.AMX r2 = r4.A05     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r15 = r2.Bf0(r3)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r15 == 0) goto L_0x0379
            boolean r2 = r2.CLj(r9, r3)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r19 = r19 & r2
        L_0x0379:
            if (r3 == 0) goto L_0x0396
            if (r19 == 0) goto L_0x0396
            X.Ajc r2 = new X.Ajc     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r31 = r2
            r32 = r4
            r33 = r9
            r34 = r3
            r36 = r12
            r37 = r13
            r38 = r14
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.concurrent.ThreadPoolExecutor r3 = X.AnonymousClass9U7.A00     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r3.execute(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x0345
        L_0x0396:
            r9.length()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13.countDown()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x0345
        L_0x039d:
            r19 = 0
            goto L_0x0367
        L_0x03a0:
            r21.getAbsolutePath()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13.await()     // Catch:{ InterruptedException -> 0x049d, 1oV | 9LZ -> 0x04cd }
            goto L_0x04a1
        L_0x03a8:
            r23.A02()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r2 = r5.A01()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x04d6
            int r13 = r35.size()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = "gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/"
            X.C17900vP.A0j(r2, r3, r13)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r2 = r5.A01()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x04d6
            java.util.concurrent.atomic.AtomicLong r9 = r4.A0R     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = 0
            r9.set(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r9 = X.C20127A8m.A08(r5, r7, r11, r12)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r9 != 0) goto L_0x03e8
            java.lang.String r2 = "gdrive/encrypted-re-upload/files/failed to delete files"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x03d6:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = "gdrive/encrypted-re-upload/files backup finished (success ="
            r3.append(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = X.C17900vP.A0F(r3, r9)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x04d4
        L_0x03e8:
            java.util.concurrent.atomic.AtomicBoolean r15 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r15.<init>(r10)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r12 = 0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r3.<init>(r12)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.concurrent.CountDownLatch r9 = new java.util.concurrent.CountDownLatch     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9.<init>(r13)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.Iterator r16 = r35.iterator()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x03fc:
            boolean r2 = r16.hasNext()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x0453
            java.lang.Object r14 = r16.next()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.A2r r14 = (X.C20002A2r) r14     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.C18070vi.A0b(r14)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.io.File r13 = r14.A02     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            boolean r2 = r13.exists()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 != 0) goto L_0x042a
            java.lang.StringBuilder r13 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = "gdrive/encrypted-re-upload/backup-file file "
            r13.append(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = "<file>"
            r13.append(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = " does not exist"
            X.C17890vO.A1A(r13, r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9.countDown()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x03fc
        L_0x042a:
            boolean r2 = r13.isDirectory()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = r2 ^ 1
            if (r2 == 0) goto L_0x048d
            X.00H r2 = X.C20134A8u.A00     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.Object r13 = r2.get()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.util.concurrent.Executor r13 = (java.util.concurrent.Executor) r13     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r38 = 3
            X.Akd r2 = new X.Akd     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r31 = r2
            r32 = r3
            r33 = r4
            r34 = r7
            r35 = r14
            r36 = r15
            r37 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13.execute(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x03fc
        L_0x0453:
            java.lang.String r2 = "gdrive/encrypted-re-upload/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0462, 1oV | 9LZ -> 0x04cd }
            boolean r13 = r9.await(r2, r13)     // Catch:{ InterruptedException -> 0x0462, 1oV | 9LZ -> 0x04cd }
            goto L_0x0469
        L_0x0462:
            r13 = move-exception
            java.lang.String r9 = "gdrive/encrypted-re-upload/files upload interrupted"
            com.whatsapp.util.Log.e(r9, r13)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r13 = 0
        L_0x0469:
            boolean r9 = r15.get()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = r9 & r13
            if (r9 == 0) goto L_0x04c1
            X.1OZ r9 = r4.A0H     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9.A0E(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.8gL r3 = new X.8gL     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r3.<init>(r7, r12, r12)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2 = r25
            java.lang.Object r3 = X.A84.A00(r3, r5, r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r9 = 1
            r2 = r24
            if (r3 == r2) goto L_0x03d6
            r9 = 0
            java.lang.String r2 = "gdrive/encrypted-re-upload/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x03d6
        L_0x048d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = "gdrive/encrypted-re-upload/backup-file/expected-file-got-directory-instead/"
            r3.append(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            java.lang.String r2 = "<file>"
            java.lang.IllegalStateException r3 = X.AnonymousClass000.A0o(r2, r3)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x04b2
        L_0x049d:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x04a1:
            java.lang.Object r2 = r14.get()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            X.9LZ r2 = (X.AnonymousClass9LZ) r2     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r2 == 0) goto L_0x0309
            boolean r3 = r2 instanceof X.C167678gm     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            if (r3 != 0) goto L_0x04c0
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r3.<init>(r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x04b2:
            throw r3     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x04b3:
            java.lang.String r2 = "gdrive/encrypted-re-upload/files failed to generate list of files to be uploaded."
            goto L_0x027b
        L_0x04b7:
            java.lang.String r2 = "gdrive/encrypted-re-upload/files unable to start transaction"
            goto L_0x027b
        L_0x04bb:
            X.8gm r2 = new X.8gm     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            r2.<init>()     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x04c0:
            throw r2     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
        L_0x04c1:
            java.lang.String r2 = "gdrive/encrypted-re-upload/files failed to uploadFiles"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x04d6
        L_0x04c7:
            java.lang.String r2 = "gdrive/encrypted-re-upload/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8gf -> 0x04d8, 1oV | 9LZ -> 0x04cd }
            goto L_0x04d6
        L_0x04cd:
            r3 = move-exception
            r2 = r28
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x068e }
            goto L_0x04d6
        L_0x04d4:
            r27 = r9
        L_0x04d6:
            r5 = 0
            goto L_0x04ea
        L_0x04d8:
            r3 = move-exception
            r2 = r28
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x068e }
            X.1NP r3 = r4.A02     // Catch:{ all -> 0x068e }
            X.0z4 r2 = r4.A0D     // Catch:{ all -> 0x068e }
            java.lang.String r2 = r2.A0f()     // Catch:{ all -> 0x068e }
            r3.A0L(r2)     // Catch:{ all -> 0x068e }
            r5 = 1
        L_0x04ea:
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x068e }
            X.0z4 r7 = r4.A0D     // Catch:{ all -> 0x068e }
            java.lang.String r2 = r7.A0f()     // Catch:{ all -> 0x068e }
            long r2 = r7.A0T(r2)     // Catch:{ all -> 0x068e }
            long r12 = r12 - r2
            X.8rc r9 = r4.A0G     // Catch:{ all -> 0x068e }
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            long r12 = r12 / r2
            java.lang.Long r2 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x068e }
            r9.A08 = r2     // Catch:{ all -> 0x068e }
            r9.A05 = r2     // Catch:{ all -> 0x068e }
            if (r27 == 0) goto L_0x050a
            goto L_0x0585
        L_0x050a:
            X.1oW r2 = r4.A07     // Catch:{ all -> 0x068e }
            r2.A00()     // Catch:{ all -> 0x068e }
            X.A84.A02()     // Catch:{ all -> 0x068e }
            boolean r2 = r2.A06()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x051c
            java.lang.String r2 = "gdrive/encrypted-re-upload/wasn't successful because the needed resources are not available"
            goto L_0x0173
        L_0x051c:
            boolean r2 = r11.A0B()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0176
            r2 = 3
            if (r5 == 0) goto L_0x0527
            r2 = 10
        L_0x0527:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x068e }
            r9.A02 = r2     // Catch:{ all -> 0x068e }
            r4.A00()     // Catch:{ all -> 0x068e }
            goto L_0x0176
        L_0x0532:
            r4 = 9
            goto L_0x057e
        L_0x0535:
            boolean r2 = r3.A03()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0546
            java.util.concurrent.atomic.AtomicBoolean r2 = r6.A0U     // Catch:{ all -> 0x068e }
            boolean r2 = r2.get()     // Catch:{ all -> 0x068e }
            r4 = 4
            if (r2 != 0) goto L_0x057e
            r4 = 5
            goto L_0x057e
        L_0x0546:
            boolean r2 = r3.A05()     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x054f
            r4 = 8
            goto L_0x057e
        L_0x054f:
            boolean r2 = r3.A02()     // Catch:{ all -> 0x068e }
            if (r2 == 0) goto L_0x057e
            X.9uB r4 = r0.A0N     // Catch:{ all -> 0x068e }
            r3 = 0
            java.lang.String r2 = "encrypted-re-upload-worker/unknown condition was not met"
            r4.A03(r2, r3, r10)     // Catch:{ all -> 0x068e }
        L_0x055d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x068e }
            java.lang.String r2 = "google-encrypted-re-upload-worker/doWork conditions were not met(result code = "
            r3.append(r2)     // Catch:{ all -> 0x068e }
            java.lang.Integer r2 = r8.A02     // Catch:{ all -> 0x068e }
            r3.append(r2)     // Catch:{ all -> 0x068e }
            java.lang.String r2 = "), retrying backup later"
            X.C17890vO.A1A(r3, r2)     // Catch:{ all -> 0x068e }
            X.9nU r2 = r0.A00     // Catch:{ all -> 0x068e }
            if (r2 == 0) goto L_0x0577
            r2.A00()     // Catch:{ all -> 0x068e }
        L_0x0577:
            X.8Ji r4 = new X.8Ji     // Catch:{ all -> 0x068e }
            r4.<init>()     // Catch:{ all -> 0x068e }
            goto L_0x063b
        L_0x057e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x068e }
            r8.A02 = r2     // Catch:{ all -> 0x068e }
            goto L_0x055d
        L_0x0585:
            java.lang.String r5 = r7.A0f()     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicBoolean r2 = r4.A0L     // Catch:{ all -> 0x068e }
            boolean r3 = r2.get()     // Catch:{ all -> 0x068e }
            r2 = 2
            if (r3 == 0) goto L_0x0595
            if (r5 == 0) goto L_0x0595
            goto L_0x059e
        L_0x0595:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x068e }
            r9.A02 = r2     // Catch:{ all -> 0x068e }
            if (r5 == 0) goto L_0x05fc
            goto L_0x05a7
        L_0x059e:
            r7.A1k(r5, r2)     // Catch:{ all -> 0x068e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x068e }
            r9.A02 = r2     // Catch:{ all -> 0x068e }
        L_0x05a7:
            java.util.concurrent.atomic.AtomicLong r8 = r4.A0P     // Catch:{ all -> 0x068e }
            long r5 = r8.get()     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicLong r7 = r4.A0O     // Catch:{ all -> 0x068e }
            long r2 = r7.get()     // Catch:{ all -> 0x068e }
            java.lang.Long r2 = X.C17880vN.A0o(r5, r2)     // Catch:{ all -> 0x068e }
            r9.A04 = r2     // Catch:{ all -> 0x068e }
            long r2 = r8.get()     // Catch:{ all -> 0x068e }
            long r5 = r7.get()     // Catch:{ all -> 0x068e }
            long r2 = r2 + r5
            double r7 = (double) r2     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0Q     // Catch:{ all -> 0x068e }
            long r5 = r2.get()     // Catch:{ all -> 0x068e }
            double r2 = (double) r5     // Catch:{ all -> 0x068e }
            double r7 = r7 / r2
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x068e }
            r9.A00 = r2     // Catch:{ all -> 0x068e }
            r9.A01 = r2     // Catch:{ all -> 0x068e }
            java.lang.Long r2 = r9.A04     // Catch:{ all -> 0x068e }
            r9.A06 = r2     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0N     // Catch:{ all -> 0x068e }
            long r5 = r2.get()     // Catch:{ all -> 0x068e }
            java.util.concurrent.atomic.AtomicLong r2 = r4.A0R     // Catch:{ all -> 0x068e }
            long r2 = r2.get()     // Catch:{ all -> 0x068e }
            long r5 = r5 + r2
            r2 = 1048576(0x100000, double:5.180654E-318)
            long r5 = r5 / r2
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x068e }
            r9.A07 = r2     // Catch:{ all -> 0x068e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x068e }
            java.lang.String r2 = "gdrive/encrypted-re-upload/"
            X.C17900vP.A0Y(r9, r2, r3)     // Catch:{ all -> 0x068e }
            X.18K r2 = r4.A0F     // Catch:{ all -> 0x068e }
            r2.CC7(r9)     // Catch:{ all -> 0x068e }
        L_0x05fc:
            X.A0f r3 = r4.A06     // Catch:{ all -> 0x068e }
            java.lang.String r2 = r11.A0C     // Catch:{ all -> 0x068e }
            r3.A01(r2)     // Catch:{ all -> 0x068e }
            X.1oW r2 = r4.A07     // Catch:{ all -> 0x068e }
            r2.A00()     // Catch:{ all -> 0x068e }
            X.A84.A02()     // Catch:{ all -> 0x068e }
            r3 = 12
            r2 = r43
            X.C20735AWq.A00(r2, r3)     // Catch:{ all -> 0x068e }
            X.8Jk r4 = new X.8Jk     // Catch:{ all -> 0x068e }
            r4.<init>()     // Catch:{ all -> 0x068e }
            goto L_0x063b
        L_0x0618:
            java.lang.Integer r2 = X.C108955ca.A0e()     // Catch:{ all -> 0x068e }
            r8.A02 = r2     // Catch:{ all -> 0x068e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x068e }
            java.lang.String r2 = "google-encrypted-re-upload-worker/doWork worker reached the maximum amount of retries("
            r3.append(r2)     // Catch:{ all -> 0x068e }
            r3.append(r4)     // Catch:{ all -> 0x068e }
            java.lang.String r2 = "), failing"
            X.C17890vO.A19(r3, r2)     // Catch:{ all -> 0x068e }
            X.9nU r2 = r0.A00     // Catch:{ all -> 0x068e }
            if (r2 == 0) goto L_0x0636
            r2.A00()     // Catch:{ all -> 0x068e }
        L_0x0636:
            X.8Jj r4 = new X.8Jj     // Catch:{ all -> 0x068e }
            r4.<init>()     // Catch:{ all -> 0x068e }
        L_0x063b:
            X.8Ji r2 = new X.8Ji     // Catch:{ all -> 0x068e }
            r2.<init>()     // Catch:{ all -> 0x068e }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0674
            boolean r2 = r57.A04()     // Catch:{ all -> 0x068e }
            if (r2 == 0) goto L_0x0674
            boolean r2 = android.text.TextUtils.isEmpty(r30)     // Catch:{ all -> 0x068e }
            if (r2 != 0) goto L_0x0674
            r2 = r57
            X.0z4 r3 = r2.A05     // Catch:{ all -> 0x068e }
            r2 = r30
            int r2 = r3.A0M(r2)     // Catch:{ all -> 0x068e }
            if (r2 != r10) goto L_0x0674
            X.19K r3 = r0.A0R     // Catch:{ all -> 0x068e }
            java.util.Random r2 = r0.A0U     // Catch:{ all -> 0x068e }
            java.lang.Integer r8 = X.AnonymousClass00R.A0N     // Catch:{ all -> 0x068e }
            r5 = r56
            r6 = r58
            r7 = r3
            r9 = r2
            r10 = r1
            A02(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x068e }
            goto L_0x0674
        L_0x066f:
            r2 = 3
            X.9Lg r4 = r0.A00(r4, r2)     // Catch:{ all -> 0x068e }
        L_0x0674:
            r3 = r60
            r2 = r29
            r3.A01(r2, r1)
            X.1oU r2 = r0.A08
            r2.A09()
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.A0Q
            r2.getAndSet(r1)
            X.1Vn r2 = r0.A0W
            r1 = 5
            r0 = r26
            r2.BEJ(r1, r0)
            return r4
        L_0x068e:
            r4 = move-exception
            X.1O1 r3 = r0.A0Z
            r2 = r29
            r3.A01(r2, r1)
            X.1oU r2 = r0.A08
            r2.A09()
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.A0Q
            r2.getAndSet(r1)
            X.1Vn r2 = r0.A0W
            r1 = 5
            r0 = r26
            r2.BEJ(r1, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A0B():X.9Lg");
    }

    public GoogleEncryptedReUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A0V = atomicBoolean;
        C000100c A0H2 = C17890vO.A0H(context);
        this.A0U = new Random();
        this.A0G = A0H2.CP7();
        this.A0J = A0H2.BAL();
        this.A0Q = A0H2.CRy();
        AnonymousClass10E r1 = (AnonymousClass10E) A0H2;
        this.A0P = AnonymousClass8BU.A0e(r1);
        this.A03 = A0H2.BA6();
        this.A0H = AnonymousClass3MZ.A0l(r1);
        this.A0X = AnonymousClass3MY.A0Z(r1);
        this.A02 = (C218617r) r1.A8v.get();
        this.A04 = C108965cb.A0H(r1);
        this.A0K = A0H2.CS2();
        this.A0E = (AnonymousClass1L7) r1.A3t.get();
        this.A0Y = (C22881Do) r1.A5t.get();
        AnonymousClass1OZ BAA = A0H2.BAA();
        this.A0M = BAA;
        this.A0R = (AnonymousClass19K) r1.AC4.get();
        this.A07 = (AnonymousClass1NT) r1.A3f.get();
        this.A0F = (AnonymousClass1NM) r1.A6D.get();
        this.A0I = A0H2.CRw();
        this.A0N = (C195939uB) r1.A0e.get();
        this.A0B = (C19948A0f) r1.A9X.get();
        AnonymousClass10G r2 = r1.Ao8.A00;
        this.A0C = (A0L) r2.A0I.get();
        this.A0O = (AnonymousClass1NL) r1.A3u.get();
        this.A0W = (C27301Vn) r1.A9A.get();
        this.A0S = C000200d.A00(r2.A34);
        this.A0Z = (AnonymousClass1O1) r1.A5u.get();
        this.A05 = (AnonymousClass1NW) r1.A0h.get();
        this.A06 = (AnonymousClass1NP) r1.A0j.get();
        this.A09 = (C175238yN) r1.A4e.get();
        this.A0D = A0H2.BFf();
        C36801oU r3 = (C36801oU) r1.A4c.get();
        this.A08 = r3;
        this.A0A = new C167368g8((C23651Hc) r1.ACD.get(), r3, this, BAA, atomicBoolean);
    }

    public static void A02(AnonymousClass1NP r8, C19830z4 r9, AnonymousClass19K r10, Integer num, Random random, boolean z) {
        long j;
        String str;
        Calendar instance = Calendar.getInstance();
        if (!z) {
            int A032 = r8.A03();
            long A042 = AnonymousClass8BR.A04(r9.A0U(r9.A0f()));
            if (A032 == 1 || (A032 != 2 ? !(A032 != 3 || A042 < 2419200000L) : A042 >= 432000000)) {
                Log.i("google-encrypted-re-upload-worker/scheduleNextRun doesn't schedule run because google drive backup will run in the next backup slot");
                return;
            }
            long timeInMillis = instance.getTimeInMillis();
            if (instance.get(11) >= 2) {
                instance.add(5, 1);
            }
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 2);
            instance.add(13, random.nextInt((int) TimeUnit.SECONDS.convert(4, TimeUnit.HOURS)));
            j = instance.getTimeInMillis() - timeInMillis;
        } else {
            j = 0;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("google-encrypted-re-upload-worker/scheduleNextRun at ");
        A10.append(instance.getTime());
        A10.append(", immediately = ");
        A10.append(z);
        A10.append(", existingWorkPolicy = ");
        switch (num.intValue()) {
            case 1:
                str = "KEEP";
                break;
            case 2:
                str = "APPEND";
                break;
            default:
                str = "APPEND_OR_REPLACE";
                break;
        }
        C17890vO.A1A(A10, str);
        AnonymousClass8BR.A0D(r10).A07(A01(r8, j), num, "com.whatsapp.backup.google.google-encrypted-re-upload-worker");
    }
}
