package com.whatsapp.backup.google.workers;

import X.A0L;
import X.A6Y;
import X.A7X;
import X.A84;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass19K;
import X.AnonymousClass1Cd;
import X.AnonymousClass1DK;
import X.AnonymousClass1L7;
import X.AnonymousClass1NM;
import X.AnonymousClass1NO;
import X.AnonymousClass1NP;
import X.AnonymousClass1NT;
import X.AnonymousClass1NW;
import X.AnonymousClass1O1;
import X.AnonymousClass1OZ;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8gY;
import X.C000100c;
import X.C000200d;
import X.C108965cb;
import X.C171878sQ;
import X.C175238yN;
import X.C17890vO;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C192369oH;
import X.C194159rG;
import X.C196239ug;
import X.C19830z4;
import X.C199349zq;
import X.C19948A0f;
import X.C20001A2q;
import X.C200410p;
import X.C20134A8u;
import X.C20739AWu;
import X.C218617r;
import X.C22881Do;
import X.C23651Hc;
import X.C27431Wb;
import X.C36801oU;
import X.C36841oY;
import X.C36861oa;
import X.C41361wE;
import X.C72453Mb;
import X.EEC;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.util.concurrent.atomic.AtomicBoolean;

public class GoogleBackupWorker extends Worker {
    public static final AtomicBoolean A0a = C108965cb.A0w();
    public final int A00;
    public final C218617r A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass1NW A03;
    public final AnonymousClass1NP A04;
    public final C192369oH A05;
    public final AnonymousClass1NO A06;
    public final AnonymousClass1NT A07;
    public final C36801oU A08;
    public final C196239ug A09;
    public final C175238yN A0A;
    public final C36841oY A0B;
    public final AnonymousClass8gY A0C;
    public final C36861oa A0D;
    public final C199349zq A0E;
    public final C19948A0f A0F;
    public final A0L A0G;
    public final AnonymousClass1L7 A0H;
    public final AnonymousClass1NM A0I;
    public final AnonymousClass11P A0J;
    public final AnonymousClass118 A0K;
    public final C19830z4 A0L;
    public final C27431Wb A0M;
    public final AnonymousClass1Cd A0N;
    public final AnonymousClass1DK A0O;
    public final C18030ve A0P;
    public final AnonymousClass18K A0Q;
    public final C171878sQ A0R;
    public final AnonymousClass1OZ A0S;
    public final C22881Do A0T;
    public final AnonymousClass1O1 A0U;
    public final AnonymousClass00H A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AtomicBoolean A0Y;
    public final AnonymousClass19K A0Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GoogleBackupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        int A0G2 = C72453Mb.A0G(context, workerParameters, 1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A0Y = atomicBoolean;
        A00(this);
        C000100c A0H2 = C17890vO.A0H(context);
        this.A0J = A0H2.CP7();
        this.A0P = A0H2.BAL();
        this.A02 = A0H2.BA6();
        AnonymousClass10E r7 = (AnonymousClass10E) A0H2;
        this.A0K = AnonymousClass3MZ.A0l(r7);
        this.A01 = (C218617r) r7.A8v.get();
        this.A0Q = A0H2.CS2();
        this.A0H = (AnonymousClass1L7) r7.A3t.get();
        this.A0T = (C22881Do) r7.A5t.get();
        AnonymousClass1OZ BAA = A0H2.BAA();
        this.A0S = BAA;
        this.A0Z = (AnonymousClass19K) r7.AC4.get();
        this.A0V = C000200d.A00(r7.A9q);
        this.A07 = (AnonymousClass1NT) r7.A3f.get();
        this.A0X = C000200d.A00(r7.A8O);
        this.A0O = (AnonymousClass1DK) r7.A6s.get();
        this.A0I = (AnonymousClass1NM) r7.A6D.get();
        this.A0M = (C27431Wb) r7.A6f.get();
        this.A09 = (C196239ug) r7.A4d.get();
        this.A0N = A0H2.Bjr();
        this.A0F = (C19948A0f) r7.A9X.get();
        this.A0L = A0H2.CRw();
        AnonymousClass10G r2 = r7.Ao8.A00;
        this.A0G = (A0L) r2.A0I.get();
        this.A06 = (AnonymousClass1NO) r7.A3e.get();
        this.A0W = C000200d.A00(r2.A34);
        this.A03 = (AnonymousClass1NW) r7.A0h.get();
        this.A0U = (AnonymousClass1O1) r7.A5u.get();
        this.A04 = (AnonymousClass1NP) r7.A0j.get();
        this.A05 = (C192369oH) r2.A0J.get();
        this.A0E = (C199349zq) r2.A3B.get();
        C36801oU r3 = (C36801oU) r7.A4c.get();
        this.A08 = r3;
        this.A0A = (C175238yN) r7.A4e.get();
        this.A0D = (C36861oa) r7.A4g.get();
        this.A0B = (C36841oY) r7.A4f.get();
        C171878sQ r6 = new C171878sQ();
        this.A0R = r6;
        r6.A0d = Integer.valueOf(A0G2);
        A6Y a6y = this.A01.A01;
        r6.A0e = Integer.valueOf(a6y.A02("KEY_BACKUP_SCHEDULE", 0));
        r6.A0a = Integer.valueOf(a6y.A02("KEY_BACKUP_NETWORK_SETTING", -1));
        this.A0C = new AnonymousClass8gY((C23651Hc) r7.ACD.get(), r3, BAA, atomicBoolean);
        this.A00 = a6y.A02("KEY_MAX_NUMBER_OF_RETRIES", 0);
    }

    private final void A01() {
        this.A0U.A01("gdrive_backup_with_worker", false);
        C36801oU r4 = this.A08;
        r4.A09();
        AnonymousClass1NP r3 = this.A04;
        AnonymousClass00H r0 = C20134A8u.A00;
        if (C17890vO.A1R(r3.A05()) || r4.A0P.get()) {
            r4.A0P.getAndSet(false);
            C196239ug r02 = this.A09;
            A7X A002 = r02.A00();
            AnonymousClass1O1 r1 = (AnonymousClass1O1) r02.A0B.get();
            if (A002 != null) {
                A002.A09(false);
            }
            r1.A01("gdrive_backup", false);
            this.A0C.A00();
            A84.A02();
            r4.A0G.open();
            r4.A0D.open();
            r4.A0A.open();
            r4.A04 = false;
            r3.A0H(0);
            r3.A0F(10);
        }
        C175238yN r12 = this.A0A;
        r12.A00 = -1;
        r12.A01 = -1;
        C36841oY r32 = this.A0B;
        r32.A06.set(0);
        r32.A05.set(0);
        r32.A04.set(0);
        r32.A07.set(0);
        r32.A03.set(0);
    }

    public static final void A02(GoogleBackupWorker googleBackupWorker, int i) {
        if (googleBackupWorker.A0C.A06()) {
            String A032 = C41361wE.A03(i);
            C18070vi.A0X(A032);
            if (i != 10) {
                A00(googleBackupWorker);
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                C18070vi.A0X(stackTrace);
                C200410p.A0I("\n", "", "", stackTrace);
                C17900vP.A0e("set-error/ ", A032, C20001A2q.A04(googleBackupWorker));
            }
            googleBackupWorker.A04.A0F(i);
            A00(googleBackupWorker);
            AnonymousClass8BR.A1G(googleBackupWorker.A0R, C41361wE.A00(i));
            C20739AWu.A00(googleBackupWorker.A0A, googleBackupWorker.A0B.A00(), i, 1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: X.9Lg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v34, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v35, resolved type: X.8Jk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v38, resolved type: X.9Lg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v39, resolved type: X.8Jj} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v40, resolved type: X.8Jj} */
    /* JADX WARNING: type inference failed for: r0v126, types: [X.9Lg, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x028c, code lost:
        if (r0.intValue() != 4) goto L_0x028e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0364, code lost:
        if (r1 == false) goto L_0x0366;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03c5 A[Catch:{ all -> 0x03d5, all -> 0x03dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C180129Lg A0B() {
        /*
            r54 = this;
            java.util.concurrent.atomic.AtomicBoolean r10 = A0a
            r9 = 0
            r11 = 1
            boolean r0 = r10.compareAndSet(r9, r11)
            r8 = r54
            if (r0 != 0) goto L_0x001b
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)
            java.lang.String r0 = "doWork, another worker already running, let's retry later"
            X.C17890vO.A1A(r1, r0)
            X.8Ji r0 = new X.8Ji
            r0.<init>()
            return r0
        L_0x001b:
            X.1oa r0 = r8.A0D     // Catch:{ all -> 0x03dd }
            r53 = r0
            r53.A06()     // Catch:{ all -> 0x03dd }
            r53.A05()     // Catch:{ all -> 0x03dd }
            X.0ve r0 = r8.A0P     // Catch:{ all -> 0x03dd }
            r40 = r0
            r2 = 3129(0xc39, float:4.385E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x03dd }
            boolean r2 = X.C18020vd.A05(r1, r0, r2)     // Catch:{ all -> 0x03dd }
            java.lang.String r7 = " user="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = A00(r8)     // Catch:{ all -> 0x03dd }
            if (r2 == 0) goto L_0x007d
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "publishNotification enable setForegroundAsync, attempt: sys="
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            androidx.work.WorkerParameters r6 = r8.A01     // Catch:{ all -> 0x03dd }
            int r0 = r6.A00     // Catch:{ all -> 0x03dd }
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            r1.append(r7)     // Catch:{ all -> 0x03dd }
            X.1NP r5 = r8.A04     // Catch:{ all -> 0x03dd }
            android.content.SharedPreferences r0 = r5.A07()     // Catch:{ all -> 0x03dd }
            java.lang.String r4 = "google_backup_retry_count"
            int r0 = r0.getInt(r4, r9)     // Catch:{ all -> 0x03dd }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x03dd }
            X.118 r0 = r8.A0K     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            android.content.res.Resources r2 = X.AnonymousClass3MW.A05(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            r1 = 0
            r0 = r53
            android.app.Notification r3 = r0.A04(r2, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            boolean r2 = X.AnonymousClass112.A06()     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            r1 = 5
            X.9rG r0 = new X.9rG     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            r0.<init>(r1, r3, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            X.5oM r0 = r8.A06(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x009e }
            goto L_0x009e
        L_0x007d:
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "publishNotification skip setForegroundAsync, attempt: sys="
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            androidx.work.WorkerParameters r6 = r8.A01     // Catch:{ all -> 0x03dd }
            int r0 = r6.A00     // Catch:{ all -> 0x03dd }
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            r1.append(r7)     // Catch:{ all -> 0x03dd }
            X.1NP r5 = r8.A04     // Catch:{ all -> 0x03dd }
            android.content.SharedPreferences r0 = r5.A07()     // Catch:{ all -> 0x03dd }
            java.lang.String r4 = "google_backup_retry_count"
            int r0 = r0.getInt(r4, r9)     // Catch:{ all -> 0x03dd }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x03dd }
        L_0x009e:
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork, attempt: sys="
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            int r0 = r6.A00     // Catch:{ all -> 0x03dd }
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            r1.append(r7)     // Catch:{ all -> 0x03dd }
            android.content.SharedPreferences r0 = r5.A07()     // Catch:{ all -> 0x03dd }
            int r0 = r0.getInt(r4, r9)     // Catch:{ all -> 0x03dd }
            X.C17900vP.A0o(r1, r0)     // Catch:{ all -> 0x03dd }
            X.0z4 r15 = r8.A0L     // Catch:{ all -> 0x03dd }
            java.lang.String r1 = r15.A0f()     // Catch:{ all -> 0x03dd }
            X.11S r0 = r8.A02     // Catch:{ all -> 0x03dd }
            r0.A0I()     // Catch:{ all -> 0x03dd }
            com.whatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x03dd }
            r46 = 0
            if (r0 != 0) goto L_0x00ee
            java.lang.StringBuilder r2 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "my-jid/me is null, can't proceed"
            X.C17890vO.A1A(r2, r0)     // Catch:{ all -> 0x03dd }
        L_0x00d4:
            X.1oU r14 = r8.A08     // Catch:{ all -> 0x03dd }
            java.util.concurrent.atomic.AtomicBoolean r2 = r14.A0P     // Catch:{ all -> 0x03dd }
            boolean r0 = r2.getAndSet(r11)     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x00ff
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork another backup is already running."
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            X.8Jj r1 = new X.8Jj     // Catch:{ all -> 0x03dd }
            r1.<init>()     // Catch:{ all -> 0x03dd }
            goto L_0x03c8
        L_0x00ee:
            java.lang.String r0 = r0.jabber_id     // Catch:{ all -> 0x03dd }
            if (r0 != 0) goto L_0x00fc
            java.lang.StringBuilder r2 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "my-jid/jidUser is null, fatal error."
            X.C17890vO.A19(r2, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x00d4
        L_0x00fc:
            r46 = r0
            goto L_0x00d4
        L_0x00ff:
            X.118 r0 = r8.A0K     // Catch:{ all -> 0x03dd }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x03dd }
            boolean r0 = X.C41361wE.A09(r0)     // Catch:{ all -> 0x03dd }
            if (r0 != 0) goto L_0x0128
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork Google Drive backups are disabled for this user."
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x03dd }
        L_0x0112:
            r2.getAndSet(r9)     // Catch:{ all -> 0x03dd }
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork, failed on backup conditions"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x03dd }
            r5.A0A()     // Catch:{ all -> 0x03dd }
            X.8Jj r1 = new X.8Jj     // Catch:{ all -> 0x03dd }
            r1.<init>()     // Catch:{ all -> 0x03dd }
            goto L_0x03c8
        L_0x0128:
            if (r1 == 0) goto L_0x01cf
            int r0 = r1.length()     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x01cf
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x03dd }
            X.8sQ r3 = r8.A0R     // Catch:{ all -> 0x03dd }
            java.lang.Integer r0 = r3.A0e     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x0153
            int r12 = r0.intValue()     // Catch:{ all -> 0x03dd }
            r0 = 4
            if (r12 != r0) goto L_0x0153
        L_0x0140:
            X.A6Y r0 = r6.A01     // Catch:{ all -> 0x03dd }
            java.lang.String r12 = "only_if_pending"
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x03dd }
            java.lang.Object r12 = r0.get(r12)     // Catch:{ all -> 0x03dd }
            boolean r0 = r12 instanceof java.lang.Boolean     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x0186
            boolean r0 = X.AnonymousClass000.A1Y(r12)     // Catch:{ all -> 0x03dd }
            goto L_0x016e
        L_0x0153:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x03dd }
            long r12 = r15.A0U(r1)     // Catch:{ all -> 0x03dd }
            long r16 = r16 - r12
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0140
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork backup called too early, ignoring"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x016e:
            if (r0 == 0) goto L_0x0186
            X.00H r0 = X.C20134A8u.A00     // Catch:{ all -> 0x03dd }
            int r0 = r5.A05()     // Catch:{ all -> 0x03dd }
            boolean r0 = X.C17890vO.A1R(r0)     // Catch:{ all -> 0x03dd }
            if (r0 != 0) goto L_0x0186
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork backup called when not pending and required, ignoring"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x0186:
            X.1Do r0 = r8.A0T     // Catch:{ all -> 0x03dd }
            boolean r0 = r0.A01     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x0197
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork WhatsApp Login has failed, google drive backup aborted"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x0197:
            X.1NW r0 = r8.A03     // Catch:{ all -> 0x03dd }
            r52 = r0
            boolean r0 = r52.A03()     // Catch:{ all -> 0x03dd }
            if (r0 != 0) goto L_0x01b1
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork read storage permission denied backup aborted"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            r0 = 23
            A02(r8, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x01b1:
            boolean r0 = X.C20134A8u.A07(r5)     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x01c2
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork cannot start backup, media restore is pending"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x01c2:
            if (r46 != 0) goto L_0x0200
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork my jid is null."
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x01cf:
            int r3 = r5.A05()     // Catch:{ all -> 0x03dd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = A00(r8)     // Catch:{ all -> 0x03dd }
            if (r3 == 0) goto L_0x01f6
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork accountName is null, cannot proceed further. Change google drive state from "
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            int r0 = r5.A05()     // Catch:{ all -> 0x03dd }
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = " to clean_state"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            r5.A0H(r9)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x01f6:
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork grdive account name is empty, google drive backup aborted"
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x03dd }
            goto L_0x0112
        L_0x0200:
            X.1O1 r2 = r8.A0U     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = "gdrive_backup_with_worker"
            r2.A01(r0, r11)     // Catch:{ all -> 0x03d8 }
            r0 = 10
            r5.A0F(r0)     // Catch:{ all -> 0x03d8 }
            r14.A08()     // Catch:{ all -> 0x03d8 }
            r14.A07()     // Catch:{ all -> 0x03d8 }
            r14.A0A()     // Catch:{ all -> 0x03d8 }
            r14.A02()     // Catch:{ all -> 0x03d8 }
            X.9ug r2 = r8.A09     // Catch:{ all -> 0x03d8 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = "backup"
            X.A7X r31 = r2.A01(r1, r0)     // Catch:{ all -> 0x03d8 }
            X.11P r0 = r8.A0J     // Catch:{ all -> 0x03d8 }
            r36 = r0
            X.17r r0 = r8.A01     // Catch:{ all -> 0x03d8 }
            r51 = r0
            X.18K r0 = r8.A0Q     // Catch:{ all -> 0x03d8 }
            r41 = r0
            X.1L7 r0 = r8.A0H     // Catch:{ all -> 0x03d8 }
            r34 = r0
            X.1OZ r0 = r8.A0S     // Catch:{ all -> 0x03d8 }
            r43 = r0
            X.1NT r0 = r8.A07     // Catch:{ all -> 0x03d8 }
            r23 = r0
            X.00H r0 = r8.A0X     // Catch:{ all -> 0x03d8 }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x03d8 }
            X.1Q5 r13 = (X.AnonymousClass1Q5) r13     // Catch:{ all -> 0x03d8 }
            X.00H r0 = r8.A0W     // Catch:{ all -> 0x03d8 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x03d8 }
            X.AMX r1 = (X.AMX) r1     // Catch:{ all -> 0x03d8 }
            X.1NM r0 = r8.A0I     // Catch:{ all -> 0x03d8 }
            r35 = r0
            X.1Wb r0 = r8.A0M     // Catch:{ all -> 0x03d8 }
            r38 = r0
            X.1Cd r0 = r8.A0N     // Catch:{ all -> 0x03d8 }
            r39 = r0
            X.A0f r0 = r8.A0F     // Catch:{ all -> 0x03d8 }
            r29 = r0
            X.A0L r0 = r8.A0G     // Catch:{ all -> 0x03d8 }
            r30 = r0
            X.1NO r0 = r8.A06     // Catch:{ all -> 0x03d8 }
            r22 = r0
            X.00H r0 = r8.A0V     // Catch:{ all -> 0x03d8 }
            r45 = r0
            X.9oH r0 = r8.A05     // Catch:{ all -> 0x03d8 }
            r20 = r0
            X.9zq r0 = r8.A0E     // Catch:{ all -> 0x03d8 }
            r28 = r0
            java.util.ArrayList r47 = X.C20134A8u.A02(r51)     // Catch:{ all -> 0x03d8 }
            X.1oY r12 = r8.A0B     // Catch:{ all -> 0x03d8 }
            java.util.concurrent.atomic.AtomicLong r0 = r12.A07     // Catch:{ all -> 0x03d8 }
            r19 = r0
            java.util.concurrent.atomic.AtomicLong r0 = r12.A06     // Catch:{ all -> 0x03d8 }
            r18 = r0
            X.8gY r0 = r8.A0C     // Catch:{ all -> 0x03d8 }
            r26 = r0
            java.lang.Integer r0 = r3.A0e     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x028e
            int r12 = r0.intValue()     // Catch:{ all -> 0x03d8 }
            r0 = 4
            r50 = 1
            if (r12 == r0) goto L_0x0290
        L_0x028e:
            r50 = 0
        L_0x0290:
            X.8yN r0 = r8.A0A     // Catch:{ all -> 0x03d8 }
            r17 = r0
            X.1DK r0 = r8.A0O     // Catch:{ all -> 0x03d8 }
            X.A0e r12 = new X.A0e     // Catch:{ all -> 0x03d8 }
            r12.<init>(r0)     // Catch:{ all -> 0x03d8 }
            X.AMb r0 = new X.AMb     // Catch:{ all -> 0x03d8 }
            r0.<init>(r8, r11)     // Catch:{ all -> 0x03d8 }
            X.8gr r16 = new X.8gr     // Catch:{ all -> 0x03d8 }
            r21 = r12
            r24 = r14
            r25 = r17
            r27 = r1
            r32 = r0
            r33 = r8
            r37 = r15
            r42 = r3
            r44 = r13
            r48 = r19
            r49 = r18
            r17 = r51
            r18 = r52
            r19 = r5
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x03d8 }
            android.content.SharedPreferences r0 = r5.A07()     // Catch:{ all -> 0x03d8 }
            int r0 = r0.getInt(r4, r9)     // Catch:{ all -> 0x03d8 }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x03d8 }
            r3.A0j = r0     // Catch:{ all -> 0x03d8 }
            java.lang.StringBuilder r3 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = "runBackup, attempt: sys="
            r3.append(r0)     // Catch:{ all -> 0x03d8 }
            int r0 = r6.A00     // Catch:{ all -> 0x03d8 }
            r3.append(r0)     // Catch:{ all -> 0x03d8 }
            r3.append(r7)     // Catch:{ all -> 0x03d8 }
            android.content.SharedPreferences r0 = r5.A07()     // Catch:{ all -> 0x03d8 }
            int r0 = r0.getInt(r4, r9)     // Catch:{ all -> 0x03d8 }
            r3.append(r0)     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = " isStopped="
            r3.append(r0)     // Catch:{ all -> 0x03d8 }
            int r1 = r8.A03     // Catch:{ all -> 0x03d8 }
            r0 = -256(0xffffffffffffff00, float:NaN)
            boolean r0 = X.AnonymousClass000.A1S(r1, r0)
            r3.append(r0)     // Catch:{ all -> 0x03d8 }
            java.lang.String r0 = " stopped="
            r3.append(r0)     // Catch:{ all -> 0x03d8 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r8.A0Y     // Catch:{ all -> 0x03d8 }
            boolean r0 = r1.get()     // Catch:{ all -> 0x03d8 }
            X.C17900vP.A0r(r3, r0)     // Catch:{ all -> 0x03d8 }
            boolean r0 = r1.get()     // Catch:{ all -> 0x03d8 }
            if (r0 == 0) goto L_0x0314
            r8.A01()     // Catch:{ all -> 0x03dd }
            r11 = 0
            goto L_0x031b
        L_0x0314:
            boolean r11 = r16.A07()     // Catch:{ all -> 0x03d8 }
            r8.A01()     // Catch:{ all -> 0x03dd }
        L_0x031b:
            boolean r0 = r1.get()     // Catch:{ all -> 0x03dd }
            if (r0 == 0) goto L_0x0341
            java.lang.StringBuilder r4 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "worker stopped return retry"
            r4.append(r0)     // Catch:{ all -> 0x03dd }
        L_0x032a:
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x03dd }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x03dd }
            X.8Ji r1 = new X.8Ji     // Catch:{ all -> 0x03dd }
            r1.<init>()     // Catch:{ all -> 0x03dd }
        L_0x0336:
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x03dd }
            r0.<init>()     // Catch:{ all -> 0x03dd }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x03dd }
            goto L_0x03c3
        L_0x0341:
            monitor-enter(r5)     // Catch:{ all -> 0x03dd }
            android.content.SharedPreferences r0 = r5.A07()     // Catch:{ all -> 0x03d5 }
            int r3 = r0.getInt(r4, r9)     // Catch:{ all -> 0x03d5 }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r5)     // Catch:{ all -> 0x03d5 }
            int r0 = r3 + 1
            android.content.SharedPreferences$Editor r0 = r1.putInt(r4, r0)     // Catch:{ all -> 0x03d5 }
            r0.commit()     // Catch:{ all -> 0x03d5 }
            monitor-exit(r5)     // Catch:{ all -> 0x03dd }
            java.lang.Object r4 = r2.A0D     // Catch:{ all -> 0x03dd }
            monitor-enter(r4)     // Catch:{ all -> 0x03dd }
            X.A7X r2 = r2.A00     // Catch:{ all -> 0x03d2 }
            if (r2 == 0) goto L_0x0366
            monitor-enter(r2)     // Catch:{ all -> 0x03d2 }
            boolean r1 = r2.A00     // Catch:{ all -> 0x03cf }
            monitor-exit(r2)     // Catch:{ all -> 0x03d2 }
            r0 = 1
            if (r1 != 0) goto L_0x0367
        L_0x0366:
            r0 = 0
        L_0x0367:
            monitor-exit(r4)     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x036b
            goto L_0x03ab
        L_0x036b:
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork done with success = "
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            r1.append(r11)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = ", attempt: sys="
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            int r2 = r6.A00     // Catch:{ all -> 0x03dd }
            r1.append(r2)     // Catch:{ all -> 0x03dd }
            X.C17900vP.A0j(r7, r1, r3)     // Catch:{ all -> 0x03dd }
            if (r11 == 0) goto L_0x038c
            X.8Jk r1 = new X.8Jk     // Catch:{ all -> 0x03dd }
            r1.<init>()     // Catch:{ all -> 0x03dd }
            goto L_0x0336
        L_0x038c:
            boolean r0 = r26.A06()     // Catch:{ all -> 0x03dd }
            if (r0 != 0) goto L_0x03bc
            int r1 = r8.A00     // Catch:{ all -> 0x03dd }
            if (r3 >= r1) goto L_0x03bc
            java.lang.StringBuilder r4 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork needs to be retried. Resource conditions were  not met. Attempt: sys="
            X.AnonymousClass000.A1E(r0, r7, r4, r2)     // Catch:{ all -> 0x03dd }
            r4.append(r3)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = " from "
            r4.append(r0)     // Catch:{ all -> 0x03dd }
            r4.append(r1)     // Catch:{ all -> 0x03dd }
            goto L_0x032a
        L_0x03ab:
            java.lang.StringBuilder r1 = X.C20001A2q.A04(r8)     // Catch:{ all -> 0x03dd }
            java.lang.String r0 = "doWork cancelled by user, attempt: sys="
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            int r0 = r6.A00     // Catch:{ all -> 0x03dd }
            r1.append(r0)     // Catch:{ all -> 0x03dd }
            X.C17900vP.A0j(r7, r1, r3)     // Catch:{ all -> 0x03dd }
        L_0x03bc:
            X.8Jj r1 = new X.8Jj     // Catch:{ all -> 0x03dd }
            r1.<init>()     // Catch:{ all -> 0x03dd }
            goto L_0x0336
        L_0x03c3:
            if (r0 != 0) goto L_0x03c8
            r5.A0A()     // Catch:{ all -> 0x03dd }
        L_0x03c8:
            r10.set(r9)
            r53.A07()
            return r1
        L_0x03cf:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03d2 }
            throw r0     // Catch:{ all -> 0x03d2 }
        L_0x03d2:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03d2 }
            goto L_0x03dc
        L_0x03d5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x03dd }
            goto L_0x03dc
        L_0x03d8:
            r0 = move-exception
            r8.A01()     // Catch:{ all -> 0x03dd }
        L_0x03dc:
            throw r0     // Catch:{ all -> 0x03dd }
        L_0x03dd:
            r1 = move-exception
            r10.set(r9)
            X.1oa r0 = r8.A0D
            r0.A07()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.workers.GoogleBackupWorker.A0B():X.9Lg");
    }

    public static final String A00(GoogleBackupWorker googleBackupWorker) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("google-backup-worker/");
        A10.append(googleBackupWorker.A01.A08);
        A10.append('/');
        A10.append(googleBackupWorker.hashCode());
        return C17890vO.A0c(A10, '/');
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.EEC, X.Bly, java.lang.Object] */
    public EEC A07() {
        C17890vO.A1A(C20001A2q.A04(this), "getForegroundInfoAsync");
        ? obj = new Object();
        obj.A03(new C194159rG(5, this.A0D.A04(AnonymousClass3MW.A05(this.A0K), (String) null), AnonymousClass112.A06() ? 1 : 0));
        return obj;
    }
}
