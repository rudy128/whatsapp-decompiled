package X;

import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.AMa  reason: case insensitive filesystem */
public class C20463AMa implements B75 {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final C218617r A0A;
    public final AnonymousClass1NW A0B;
    public final AnonymousClass1NP A0C;
    public final C192369oH A0D;
    public final C19947A0e A0E;
    public final AnonymousClass1NO A0F;
    public final AnonymousClass1NT A0G;
    public final C36801oU A0H;
    public final C175238yN A0I;
    public final AMX A0J;
    public final C199349zq A0K;
    public final C19948A0f A0L;
    public final C36821oW A0M;
    public final A0L A0N;
    public final A7X A0O;
    public final AnonymousClass1L7 A0P;
    public final AnonymousClass1NM A0Q;
    public final AnonymousClass11P A0R;
    public final C19830z4 A0S;
    public final C27431Wb A0T;
    public final AnonymousClass1Cd A0U;
    public final C18030ve A0V;
    public final AnonymousClass18K A0W;
    public final C171878sQ A0X;
    public final AnonymousClass1OZ A0Y;
    public final AnonymousClass00H A0Z;
    public final String A0a;
    public final Map A0b;
    public final AtomicInteger A0c;
    public final AtomicLong A0d;
    public final AtomicLong A0e;
    public final AtomicLong A0f;
    public final AtomicLong A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final B76 A0j;
    public final AnonymousClass1Q5 A0k;
    public final List A0l;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0057, code lost:
        if (r7.length() <= 0) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CCi(java.util.Collection r26, java.util.List r27, java.util.List r28) {
        /*
            r25 = this;
            r15 = 0
            r1 = 1
            r26.size()
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>(r0)
            int r0 = r26.size()
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch
            r8.<init>(r0)
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>(r1)
            int r1 = r26.size()
            r0 = 100
            if (r1 <= r0) goto L_0x0095
            int r14 = r26.size()
            int r14 = r14 / r0
        L_0x0026:
            java.util.Iterator r13 = r26.iterator()
            r1 = 0
        L_0x002b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0097
            int r12 = r1 + 1
            java.io.File r7 = X.AnonymousClass8BS.A0T(r13)
            r4 = r25
            X.1oW r0 = r4.A0M
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0042
            return r15
        L_0x0042:
            int r1 = r1 % r14
            boolean r24 = X.AnonymousClass000.A1P(r1)
            boolean r0 = r7.exists()
            r11 = 1
            if (r0 == 0) goto L_0x0059
            long r9 = r7.length()
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r3 = 1
            if (r0 > 0) goto L_0x005a
        L_0x0059:
            r3 = 0
        L_0x005a:
            java.lang.String r2 = X.C20127A8m.A02(r7)
            X.AMX r1 = r4.A0J
            boolean r0 = r1.Bf0(r2)
            if (r0 == 0) goto L_0x006d
            boolean r0 = r1.CLj(r7, r2)
            if (r0 != 0) goto L_0x006d
            r11 = 0
        L_0x006d:
            r3 = r3 & r11
            if (r2 == 0) goto L_0x008e
            if (r3 == 0) goto L_0x008e
            X.AjO r1 = new X.AjO
            r20 = r27
            r21 = r28
            r22 = r8
            r23 = r6
            r19 = r2
            r18 = r7
            r17 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.concurrent.ThreadPoolExecutor r0 = X.AnonymousClass9U7.A00
            r0.execute(r1)
        L_0x008c:
            r1 = r12
            goto L_0x002b
        L_0x008e:
            r7.length()
            r8.countDown()
            goto L_0x008c
        L_0x0095:
            r14 = 1
            goto L_0x0026
        L_0x0097:
            r8.await()     // Catch:{ InterruptedException -> 0x009b }
            goto L_0x00a1
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/collect-files-to-be-uploaded/waiting for files to be processed was interrupted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a1:
            java.lang.Object r1 = r6.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x00b4
            boolean r0 = r1 instanceof X.C167678gm
            if (r0 == 0) goto L_0x00ae
            throw r1
        L_0x00ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            boolean r0 = r5.get()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20463AMa.CCi(java.util.Collection, java.util.List, java.util.List):boolean");
    }

    public static String A00(C171878sQ r6) {
        int i;
        int i2;
        int i3;
        int i4;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[9];
        Double d = r6.A0A;
        if (d != null) {
            i = (int) d.doubleValue();
        } else {
            i = -1;
        }
        AnonymousClass000.A1L(objArr, i);
        Double d2 = r6.A06;
        if (d2 != null) {
            i2 = (int) d2.doubleValue();
        } else {
            i2 = -1;
        }
        AnonymousClass000.A1M(objArr, i2);
        Double d3 = r6.A08;
        if (d3 != null) {
            i3 = (int) d3.doubleValue();
        } else {
            i3 = -1;
        }
        AnonymousClass3Ma.A1S(objArr, i3);
        Double d4 = r6.A07;
        if (d4 != null) {
            i4 = (int) d4.doubleValue();
        } else {
            i4 = -1;
        }
        C17890vO.A1G(objArr, i4);
        objArr[4] = r6.A0n;
        objArr[5] = r6.A00;
        objArr[6] = r6.A0i;
        objArr[7] = r6.A0c;
        objArr[8] = r6.A0b;
        return String.format(locale, "total size:%d, chat size:%d, media size:%d, media files count:%d retryCount:%d includeVideos:%b wifi-on-finish:%b backup-stage:%d result:%d", objArr);
    }

    private final void A01() {
        C171878sQ r2;
        long j;
        long j2;
        try {
            Iterator A0r = AnonymousClass8BS.A0r(this.A0T.A0N(3));
            double d = 0.0d;
            while (A0r.hasNext()) {
                d += (double) AnonymousClass8BS.A0T(A0r).length();
            }
            r2 = this.A0X;
            r2.A06 = Double.valueOf(d);
        } catch (IOException e) {
            Log.e("gdrive/backup", e);
            r2 = this.A0X;
            r2.A06 = Double.valueOf(0.0d);
        }
        double d2 = (double) this.A0e.get();
        Double d3 = r2.A06;
        if (d3 != null) {
            r2.A08 = Double.valueOf(Math.max(d2 - d3.doubleValue(), 0.0d));
            r2.A0A = Double.valueOf((double) this.A05);
            Iterator it = this.A0l.iterator();
            long j3 = 0;
            while (it.hasNext()) {
                File A0T2 = AnonymousClass8BS.A0T(it);
                long j4 = 0;
                if (A0T2.exists()) {
                    if (A0T2.isDirectory()) {
                        LinkedList A14 = AnonymousClass8BR.A14();
                        A14.add(A0T2);
                        long j5 = 0;
                        while (A14.peek() != null) {
                            Object poll = A14.poll();
                            C17960vV.A07(poll);
                            File[] listFiles = ((File) poll).listFiles();
                            if (listFiles != null) {
                                for (File file : listFiles) {
                                    if (file.exists()) {
                                        if (file.isDirectory()) {
                                            A14.add(file);
                                        } else {
                                            if (file.length() > 0) {
                                                j2 = 1;
                                            } else {
                                                j2 = 0;
                                            }
                                            j5 += j2;
                                        }
                                    }
                                }
                            }
                        }
                        j4 = j5;
                    } else if (A0T2.length() > 0) {
                        j4 = 1;
                    }
                }
                j3 += j4;
            }
            r2.A07 = Double.valueOf((double) j3);
            r2.A0n = C17880vN.A0n(this.A0S.A0K());
            r2.A00 = Boolean.valueOf(this.A0C.A0P());
            if (this.A0H.A00 == 1) {
                j = 1;
            } else {
                j = 0;
            }
            r2.A0i = Long.valueOf(j);
            if (r2.A0c == null) {
                r2.A0c = 1;
            }
            r2.A09 = Double.valueOf((double) this.A0O.A03());
            Integer num = r2.A0b;
            if (num == null || num.intValue() == 1) {
                r2.A0b = C17880vN.A0i();
            }
            Iterator A0m = AnonymousClass8BX.A0m(this.A0Z);
            while (A0m.hasNext()) {
                ((AnonymousClass1NZ) A0m.next()).A0J(r2);
            }
            this.A0W.CC7(r2);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("gdrive/backup ");
            C17890vO.A1A(A10, A00(r2));
            return;
        }
        throw C17890vO.A0K();
    }

    public static final void A02(AnonymousClass9LZ r2, B76 b76) {
        int i;
        Log.e("gdrive/backup/exception-during-backup", r2);
        if (r2 instanceof C167698go) {
            Throwable cause = r2.getCause();
            if (cause instanceof BYF) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/google-play-services-unavailable");
                i = 21;
            } else if (cause instanceof UserRecoverableAuthException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/user-recoverable-exception");
                i = 28;
            } else if (cause instanceof SecurityException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/security-exception");
                i = 30;
            } else if (cause instanceof NullPointerException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/null-pointer-exception");
                i = 31;
            } else {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/unknown-cause", cause);
                i = 11;
            }
        } else if (r2 instanceof C167688gn) {
            i = 12;
        } else if (r2 instanceof C167568gb) {
            i = 18;
        } else if (r2 instanceof C167638gi) {
            i = 15;
        } else {
            i = 19;
            if (!(r2 instanceof C167618gg)) {
                if (r2 instanceof C167578gc) {
                    i = 32;
                } else if (!(r2 instanceof C167588gd)) {
                    if (r2 instanceof C167608gf) {
                        i = 13;
                    } else if (r2 instanceof C167628gh) {
                        i = 16;
                    } else if (r2 instanceof C167678gm) {
                        i = 23;
                    } else {
                        i = 25;
                        if (!(r2 instanceof C167598ge)) {
                            b76.onError(26);
                            Log.e("gdrive/backup/exception-during-backup/unexpected-failure", r2);
                            return;
                        }
                    }
                }
            }
        }
        b76.onError(i);
    }

    private final boolean A04(AtomicReference atomicReference, int i) {
        String A0y;
        if (!this.A0H.A0P.get()) {
            Log.i("gdrive/backup/cancelled.");
            return true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Log.i("gdrive/backup", th);
            if ((th instanceof C167698go) || (th instanceof C167688gn) || (th instanceof C167608gf) || (th instanceof C167618gg) || (th instanceof C167678gm) || (th instanceof C167598ge) || (th instanceof C167588gd) || (th instanceof C167578gc)) {
                throw th;
            }
        }
        AtomicLong atomicLong = this.A0e;
        if (atomicLong.get() > 0) {
            AtomicLong atomicLong2 = this.A0f;
            if ((((double) atomicLong2.get()) * 100.0d) / ((double) atomicLong.get()) > 1.0d) {
                StringBuilder A11 = AnonymousClass000.A11("gdrive/backup/too-many-failures/");
                A11.append((((double) atomicLong2.get()) * 100.0d) / ((double) atomicLong.get()));
                A0y = AnonymousClass000.A0y("% bytes", A11);
                Log.i(A0y);
                AnonymousClass8BR.A1G(this.A0X, 38);
                return true;
            }
        }
        int i2 = i;
        if (i <= 0) {
            return false;
        }
        AtomicInteger atomicInteger = this.A0c;
        double d = (double) i2;
        if ((((double) atomicInteger.get()) * 100.0d) / d <= 1.0d) {
            return false;
        }
        StringBuilder A112 = AnonymousClass000.A11("gdrive/backup/too-many-failures/");
        A112.append((((double) atomicInteger.get()) * 100.0d) / d);
        A0y = AnonymousClass000.A0y("% files", A112);
        Log.i(A0y);
        AnonymousClass8BR.A1G(this.A0X, 38);
        return true;
    }

    public void A06(boolean z) {
        C175238yN r2 = this.A0I;
        C17900vP.A0n("GoogleBackupRestoreObservable/backup-end/success: ", AnonymousClass000.A10(), false);
        r2.A00 = 0;
        C20737AWs.A00(r2, 1, false);
        if (z) {
            C19830z4 r5 = this.A0S;
            int i = C17890vO.A0B(r5).getInt("gdrive_successive_backup_failed_count", 0) + 1;
            C17900vP.A0j("wa-shared-preferences/increment-backup-failed-count/updated-count/", AnonymousClass000.A10(), i);
            C17900vP.A0M(r5, "gdrive_successive_backup_failed_count", i);
            if (r5.A0K() >= 4) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("gdrive/backup ");
                A10.append(r5.A0K());
                C17890vO.A19(A10, " successive backups have failed, this is probably unusual.");
            }
        }
        A01();
        this.A05 = 0;
        AnonymousClass1NP r0 = this.A0C;
        r0.A0H(0);
        if (z) {
            C17880vN.A1B(AnonymousClass8BT.A04(r0), "backup_overall_exec_time");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v618, resolved type: X.A2x} */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0690, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0694, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0699, code lost:
        X.CDX.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x069c, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06d7, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x06db, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        X.CDX.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06e0, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06e3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x06eb, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x06ef, code lost:
        r8 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:?, code lost:
        X.CDX.A00(r14, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x06f4, code lost:
        X.CDX.A00(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x06f7, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r3.A02() != false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x0bae, code lost:
        r9 = null;
        com.whatsapp.util.Log.i("gdrive/backup/files waiting for backup to finish...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:?, code lost:
        r42 = r42 & r15.await(86400000, java.util.concurrent.TimeUnit.MILLISECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0bff, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:?, code lost:
        X.CDX.A00(r12, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:0x0c2c, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:?, code lost:
        X.CDX.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x1009, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x100a, code lost:
        X.CDX.A00(r15, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0716 A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0727 A[SYNTHETIC, Splitter:B:245:0x0727] */
    /* JADX WARNING: Removed duplicated region for block: B:331:0x08f6 A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0919 A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }, LOOP:14: B:333:0x0913->B:335:0x0919, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0947 A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x096c A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:397:0x0ad9 A[Catch:{ InterruptedException -> 0x0bc0, all -> 0x0fdd }] */
    /* JADX WARNING: Removed duplicated region for block: B:548:0x0ee6 A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:549:0x0ef2 A[Catch:{ all -> 0x0fe2, 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }] */
    /* JADX WARNING: Removed duplicated region for block: B:574:0x0fcf  */
    /* JADX WARNING: Removed duplicated region for block: B:597:0x1023 A[Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }] */
    /* JADX WARNING: Removed duplicated region for block: B:619:0x10ef  */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x135e  */
    /* JADX WARNING: Removed duplicated region for block: B:773:0x0bae A[EDGE_INSN: B:773:0x0bae->B:423:0x0bae ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:609:0x1042=Splitter:B:609:0x1042, B:613:0x104a=Splitter:B:613:0x104a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07() {
        /*
            r69 = this;
            java.lang.String r39 = "gdrive/backup total wall time for backup: %2f seconds."
            r0 = r69
            X.8yN r1 = r0.A0I
            r68 = r1
            r2 = 17
            X.C20735AWq.A00(r1, r2)
            X.1NP r1 = r0.A0C
            r67 = r1
            r6 = 1
            r1.A0H(r6)
            X.1oU r1 = r0.A0H
            r66 = r1
            boolean r1 = r0.A0h
            r31 = r1
            r1 = r66
            X.00H r1 = r1.A0M
            java.lang.Object r1 = r1.get()
            X.1Vz r1 = (X.C27411Vz) r1
            X.1W0 r3 = r1.A00
            if (r31 == 0) goto L_0x0032
            boolean r1 = r3.A02()
            r2 = 1
            if (r1 == 0) goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            r1 = r66
            r1.A08 = r2
            r1.A0B(r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive/backup/force-backup-over-cellular/"
            r2.append(r1)
            r1 = r66
            boolean r1 = r1.A04
            X.C17900vP.A0r(r2, r1)
            X.8sQ r3 = r0.A0X
            X.1NT r1 = r0.A0G
            r65 = r1
            boolean r4 = r65.A04()
            r1 = 0
            if (r4 == 0) goto L_0x00d0
            java.lang.Long r4 = X.C108975cc.A0X()
        L_0x005c:
            r3.A0h = r4
            X.A7X r4 = r0.A0O
            r26 = r4
            X.AmB r4 = r4.A05
            r5 = 0
            r4.A00 = r5
            r4 = r26
            java.util.concurrent.atomic.AtomicInteger r4 = r4.A0E
            r4.set(r5)
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0f
            r64 = r4
            r4.set(r1)
            java.util.concurrent.atomic.AtomicInteger r4 = r0.A0c
            r63 = r4
            r11 = 0
            r4.set(r5)
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0d
            r33 = r4
            r4.set(r1)
            r0.A05 = r1
            r0.A01 = r5
            r0.A00 = r5
            r0.A07 = r1
            r0.A02 = r1
            r0.A03 = r1
            r0.A08 = r1
            r0.A06 = r1
            r0.A09 = r1
            r0.A04 = r1
            X.0z4 r4 = r0.A0S
            r62 = r4
            java.lang.String r41 = "gdrive_backup_start_timestamp"
            r5 = r4
            r4 = r41
            long r18 = r5.A0W(r4)
            int r4 = (r18 > r1 ? 1 : (r18 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b4
            long r18 = java.lang.System.currentTimeMillis()
            r4 = r41
            r1 = r18
            r5.A1q(r4, r1)
        L_0x00b4:
            long r23 = java.lang.System.currentTimeMillis()
            X.0ve r1 = r0.A0V
            r32 = r1
            r4 = 10913(0x2aa1, float:1.5292E-41)
            X.0vf r40 = X.C18040vf.A02
            r2 = r40
            int r4 = X.C18020vd.A00(r2, r1, r4)
            java.lang.Class<X.A84> r5 = X.A84.class
            monitor-enter(r5)
            r1 = 14
            if (r4 <= 0) goto L_0x00d5
            if (r4 >= r1) goto L_0x00d5
            goto L_0x00d8
        L_0x00d0:
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            goto L_0x005c
        L_0x00d5:
            X.A84.A00 = r1     // Catch:{ all -> 0x14b0 }
            goto L_0x00da
        L_0x00d8:
            X.A84.A00 = r4     // Catch:{ all -> 0x14b0 }
        L_0x00da:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x14b0 }
            java.lang.String r1 = "gdrive-retry-task/max-attempts-count/"
            X.C17900vP.A0j(r1, r2, r4)     // Catch:{ all -> 0x14b0 }
            monitor-exit(r5)
            r21 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Integer r29 = X.C17880vN.A0i()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r29
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1oW r1 = r0.A0M     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r61 = r1
            r2 = r26
            boolean r1 = X.C20127A8m.A09(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x100e
            java.lang.String r38 = "gdrive/backup/files"
            com.whatsapp.util.Log.i((java.lang.String) r38)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r68
            r1.A00 = r11     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = 16
            X.C20735AWq.A00(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Integer r1 = X.C108955ca.A0g()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.List r36 = java.util.Collections.synchronizedList(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.8g9 r4 = new X.8g9     // Catch:{ 9LZ -> 0x1000 }
            r1 = r36
            r4.<init>(r0, r1)     // Catch:{ 9LZ -> 0x1000 }
            java.lang.String r2 = "gdrive/backup/getLatestMessageStoreBackupFiles looking for message store backup files"
            r1 = r61
            java.lang.Object r1 = X.A84.A00(r4, r1, r2)     // Catch:{ 9LZ -> 0x1000 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 9LZ -> 0x1000 }
            if (r1 == 0) goto L_0x0ff3
            boolean r1 = r1.booleanValue()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0ff3
            X.C18070vi.A0b(r36)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r2 = r36.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0139:
            boolean r1 = r2.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0147
            java.io.File r1 = X.AnonymousClass8BS.A0T(r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.getName()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0139
        L_0x0147:
            java.util.ArrayList r27 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = r27
            r1 = r36
            r2.addAll(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1L7 r1 = r0.A0P     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r60 = r1
            java.io.File r2 = r60.A03()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r66
            X.C20134A8u.A09(r1, r2, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r27
            r1.addAll(r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r7 = 0
            java.util.Iterator r5 = r36.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x016d:
            boolean r1 = r5.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x018c
            java.io.File r4 = X.AnonymousClass8BS.A0T(r5)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r4 == 0) goto L_0x016d
            java.lang.String r2 = r4.getName()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "msgstore.db"
            boolean r1 = r2.startsWith(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x016d
            boolean r1 = r4.exists()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x016d
            r7 = 1
        L_0x018c:
            r1 = 31
            java.lang.Integer r37 = java.lang.Integer.valueOf(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r7 != 0) goto L_0x019f
            java.lang.String r1 = "gdrive/backup/files/chatdb doesn't exist"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0199:
            r1 = r37
            r3.A0b = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x1018
        L_0x019f:
            r1 = r66
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0P     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r59 = r1
            boolean r1 = r59.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r35 = "gdrive/backup/files/cancelled"
            if (r1 == 0) goto L_0x0fef
            java.lang.Integer r30 = X.C17880vN.A0j()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r30
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = r0.A0a     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r61
            r5 = r26
            r2 = r38
            X.A2x r20 = X.C20127A8m.A01(r4, r5, r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r20 != 0) goto L_0x01e4
            X.8gH r4 = new X.8gH     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4.<init>(r5, r1, r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = r61
            r1 = r38
            java.lang.Object r20 = X.A84.A00(r4, r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            X.A2x r1 = (X.C20007A2x) r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r20 = r1
            if (r1 != 0) goto L_0x01e4
            r1 = 30
            X.AnonymousClass8BR.A1G(r3, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/files unable to create backup"
        L_0x01df:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x1018
        L_0x01e4:
            boolean r1 = r59.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0fef
            java.lang.Integer r1 = X.C17880vN.A0k()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1Cu r9 = new X.1Cu     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r9.<init>()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "backupEstimatedDeltaSize"
            r9.A02 = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = "backup-size-estimation"
            X.1Ez r28 = new X.1Ez     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r28
            r1.<init>((java.lang.String) r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r4 = r27.iterator()     // Catch:{ all -> 0x0fe2 }
            r7 = 0
        L_0x0208:
            boolean r1 = r4.hasNext()     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0218
            java.io.File r1 = X.AnonymousClass8BS.A0T(r4)     // Catch:{ all -> 0x0fe2 }
            long r1 = r1.length()     // Catch:{ all -> 0x0fe2 }
            long r7 = r7 + r1
            goto L_0x0208
        L_0x0218:
            java.lang.String r14 = r62.A0f()     // Catch:{ all -> 0x0fe2 }
            if (r14 == 0) goto L_0x0278
            int r1 = r14.length()     // Catch:{ all -> 0x0fe2 }
            if (r1 == 0) goto L_0x0278
            android.content.SharedPreferences r5 = r67.A07()     // Catch:{ all -> 0x0fe2 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r1 = "backup_stats_media_size:"
            java.lang.String r4 = X.AnonymousClass001.A1H(r1, r14, r2)     // Catch:{ all -> 0x0fe2 }
            r1 = 0
            long r43 = r5.getLong(r4, r1)     // Catch:{ all -> 0x0fe2 }
            android.content.SharedPreferences r10 = r67.A07()     // Catch:{ all -> 0x0fe2 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r4 = "backup_stats_timestamp:"
            java.lang.String r4 = X.AnonymousClass001.A1H(r4, r14, r5)     // Catch:{ all -> 0x0fe2 }
            long r45 = r10.getLong(r4, r1)     // Catch:{ all -> 0x0fe2 }
            android.content.SharedPreferences r5 = r67.A07()     // Catch:{ all -> 0x0fe2 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r1 = "backup_stats_msg_id:"
            java.lang.String r4 = X.AnonymousClass001.A1H(r1, r14, r2)     // Catch:{ all -> 0x0fe2 }
            r1 = -1
            long r47 = r5.getLong(r4, r1)     // Catch:{ all -> 0x0fe2 }
            android.content.SharedPreferences r10 = r67.A07()     // Catch:{ all -> 0x0fe2 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r4 = "backup_stats_prem_msg_id:"
            java.lang.String r4 = X.AnonymousClass001.A1H(r4, r14, r5)     // Catch:{ all -> 0x0fe2 }
            long r49 = r10.getLong(r4, r1)     // Catch:{ all -> 0x0fe2 }
            X.2mP r15 = new X.2mP     // Catch:{ all -> 0x0fe2 }
            r42 = r15
            r42.<init>(r43, r45, r47, r49)     // Catch:{ all -> 0x0fe2 }
            goto L_0x0287
        L_0x0278:
            r47 = -1
            r43 = 0
            X.2mP r15 = new X.2mP     // Catch:{ all -> 0x0fe2 }
            r42 = r15
            r45 = r43
            r49 = r47
            r42.<init>(r43, r45, r47, r49)     // Catch:{ all -> 0x0fe2 }
        L_0x0287:
            if (r31 != 0) goto L_0x0320
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0fe2 }
            long r1 = r15.A03     // Catch:{ all -> 0x0fe2 }
            long r12 = r12 - r1
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r12 = r12 / r1
            r2 = 7406(0x1cee, float:1.0378E-41)
            r1 = r32
            long r4 = X.AnonymousClass8BR.A05(r1, r2)     // Catch:{ all -> 0x0fe2 }
            int r1 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0320
            java.lang.String r1 = "gdrive/backup/backup-size-estimation/incremental calculation"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0fe2 }
            java.lang.String r1 = "partial"
            r9.A01 = r1     // Catch:{ all -> 0x0fe2 }
            long r1 = r15.A00     // Catch:{ all -> 0x0fe2 }
            X.9zq r12 = r0.A0K     // Catch:{ all -> 0x0fe2 }
            X.AMX r4 = r0.A0J     // Catch:{ all -> 0x0fe2 }
            r57 = r4
            boolean r10 = r65.A04()     // Catch:{ all -> 0x0fe2 }
            long r4 = r15.A01     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r16 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0fe2 }
            if (r10 == 0) goto L_0x02c0
            r4 = 16
            goto L_0x02c2
        L_0x02c0:
            r4 = 0
        L_0x02c2:
            X.1Ez r17 = new X.1Ez     // Catch:{ all -> 0x0fe2 }
            r17.<init>()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r13 = "gdrive/backup/quota/calculateBackupSize"
            r10 = r17
            r10.A05(r13)     // Catch:{ all -> 0x0fe2 }
            X.0ve r14 = r12.A03     // Catch:{ all -> 0x0fe2 }
            r13 = 5250(0x1482, float:7.357E-42)
            r10 = r40
            int r15 = X.C18020vd.A00(r10, r14, r13)     // Catch:{ all -> 0x0fe2 }
            java.util.Set r14 = r57.BUb()     // Catch:{ all -> 0x0fe2 }
            X.AMN r13 = new X.AMN     // Catch:{ all -> 0x0fe2 }
            r10 = r16
            r13.<init>(r12, r10, r14, r15)     // Catch:{ all -> 0x0fe2 }
            r10 = r57
            X.0yx r10 = X.C199349zq.A00(r13, r10, r12, r4)     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r10 = r10.A00     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r10 = (java.lang.Long) r10     // Catch:{ all -> 0x0fe2 }
            long r15 = r10.longValue()     // Catch:{ all -> 0x0fe2 }
            X.0zA r10 = r12.A00     // Catch:{ all -> 0x0fe2 }
            boolean r10 = r10.A07()     // Catch:{ all -> 0x0fe2 }
            if (r10 == 0) goto L_0x031a
            X.AML r14 = new X.AML     // Catch:{ all -> 0x0fe2 }
            r14.<init>(r12)     // Catch:{ all -> 0x0fe2 }
            X.1Ez r13 = new X.1Ez     // Catch:{ all -> 0x0fe2 }
            r13.<init>()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r10 = "gdrive/backup/quota/calculatePremiumMessageMediaBackupSize"
            r13.A05(r10)     // Catch:{ all -> 0x0fe2 }
            r10 = r57
            X.0yx r4 = X.C199349zq.A00(r14, r10, r12, r4)     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r4 = r4.A00     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0fe2 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0fe2 }
            long r15 = r15 + r4
            r13.A02()     // Catch:{ all -> 0x0fe2 }
        L_0x031a:
            r17.A02()     // Catch:{ all -> 0x0fe2 }
            long r1 = r1 + r15
            goto L_0x03c9
        L_0x0320:
            java.lang.String r1 = "gdrive/backup/backup-size-estimation/full calculation"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0fe2 }
            java.lang.String r1 = "full"
            r9.A01 = r1     // Catch:{ all -> 0x0fe2 }
            X.9zq r12 = r0.A0K     // Catch:{ all -> 0x0fe2 }
            X.AMX r1 = r0.A0J     // Catch:{ all -> 0x0fe2 }
            r57 = r1
            boolean r1 = r65.A04()     // Catch:{ all -> 0x0fe2 }
            r2 = 0
            if (r1 == 0) goto L_0x0339
            r4 = 16
            goto L_0x033b
        L_0x0339:
            r4 = 0
        L_0x033b:
            X.1Ez r25 = new X.1Ez     // Catch:{ all -> 0x0fe2 }
            r25.<init>()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r10 = "gdrive/backup/quota/calculateBackupSize"
            r1 = r25
            r1.A05(r10)     // Catch:{ all -> 0x0fe2 }
            X.0ve r13 = r12.A03     // Catch:{ all -> 0x0fe2 }
            r10 = 5250(0x1482, float:7.357E-42)
            r1 = r40
            int r13 = X.C18020vd.A00(r1, r13, r10)     // Catch:{ all -> 0x0fe2 }
            java.util.Set r10 = r57.BUb()     // Catch:{ all -> 0x0fe2 }
            X.AMN r1 = new X.AMN     // Catch:{ all -> 0x0fe2 }
            r1.<init>(r12, r2, r10, r13)     // Catch:{ all -> 0x0fe2 }
            r2 = r57
            X.0yx r1 = X.C199349zq.A00(r1, r2, r12, r4)     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r2 = r1.A01     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0fe2 }
            long r47 = r2.longValue()     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0fe2 }
            long r1 = r1.longValue()     // Catch:{ all -> 0x0fe2 }
            X.0zA r10 = r12.A00     // Catch:{ all -> 0x0fe2 }
            boolean r10 = r10.A07()     // Catch:{ all -> 0x0fe2 }
            if (r10 == 0) goto L_0x03c6
            X.AML r17 = new X.AML     // Catch:{ all -> 0x0fe2 }
            r10 = r17
            r10.<init>(r12)     // Catch:{ all -> 0x0fe2 }
            X.1Ez r16 = new X.1Ez     // Catch:{ all -> 0x0fe2 }
            r16.<init>()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r10 = "gdrive/backup/quota/calculatePremiumMessageMediaBackupSize"
            r13 = r16
            r13.A05(r10)     // Catch:{ all -> 0x0fe2 }
            r13 = r57
            r10 = r17
            X.0yx r5 = X.C199349zq.A00(r10, r13, r12, r4)     // Catch:{ all -> 0x0fe2 }
            java.lang.Object r4 = r5.A00     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0fe2 }
            long r12 = r4.longValue()     // Catch:{ all -> 0x0fe2 }
            long r1 = r1 + r12
            java.lang.Object r4 = r5.A01     // Catch:{ all -> 0x0fe2 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0fe2 }
            long r49 = r4.longValue()     // Catch:{ all -> 0x0fe2 }
            r16.A02()     // Catch:{ all -> 0x0fe2 }
        L_0x03a7:
            r25.A02()     // Catch:{ all -> 0x0fe2 }
            long r45 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0fe2 }
            X.2mP r4 = new X.2mP     // Catch:{ all -> 0x0fe2 }
            r42 = r4
            r43 = r1
            r42.<init>(r43, r45, r47, r49)     // Catch:{ all -> 0x0fe2 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fe2 }
            java.lang.String r5 = "gdrive/backup/backup-size-estimation/new stats "
            X.C17900vP.A0Y(r15, r5, r10)     // Catch:{ all -> 0x0fe2 }
            r5 = r67
            r5.A0K(r4, r14)     // Catch:{ all -> 0x0fe2 }
            goto L_0x03c9
        L_0x03c6:
            r49 = -1
            goto L_0x03a7
        L_0x03c9:
            long r7 = r7 + r1
            java.lang.Long r1 = X.AnonymousClass8BT.A0n(r28)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r9.A00 = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.18K r1 = r0.A0W     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.CC7(r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r0.A05 = r7     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.11P r7 = r0.A0R     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A8L r4 = X.A8L.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = r32
            r1 = r31
            long r45 = r4.A06(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r0.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            long r1 = r1.A04     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r4 - r1
            X.8gK r1 = new X.8gK     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r42 = r1
            r43 = r20
            r44 = r7
            r47 = r4
            r42.<init>(r43, r44, r45, r47)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r61
            r2 = r38
            java.lang.Object r2 = X.A84.A00(r1, r4, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r34
            if (r2 != r1) goto L_0x092c
            java.lang.String r1 = "gdrive/backup/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = r61.A01()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x1018
            java.lang.Integer r1 = X.C17880vN.A0l()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.List r31 = java.util.Collections.synchronizedList(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C18070vi.A0b(r31)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r31
            X.C18070vi.A0d(r1, r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Map r1 = r0.A0b     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r56 = r1
            r56.clear()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A0L r7 = r0.A0N     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = r0.A0i     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r25 = r1
            r5 = r4
            r4 = r1
            r2 = r20
            r1 = r31
            java.util.HashMap r2 = r7.A01(r5, r2, r1, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r2 != 0) goto L_0x0448
            java.lang.String r1 = "gdrive/backup/failed to load files for backup"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0199
        L_0x0448:
            r1 = r56
            r1.putAll(r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Collection r2 = r2.values()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r65
            X.C20127A8m.A05(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = r59.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0fef
            X.1Cd r1 = r0.A0U     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r1 = r1.A03()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = (long) r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r54 = r1
            java.util.concurrent.atomic.AtomicLong r1 = r0.A0e     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r58 = r1
            r1 = 0
            r4 = r58
            r4.set(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r33
            r4.set(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Integer r1 = X.C17880vN.A0m()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r1 = X.C17880vN.A0z(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.List r28 = java.util.Collections.synchronizedList(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = -1
            java.util.concurrent.atomic.AtomicLong r32 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r32
            r1.<init>(r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.concurrent.atomic.AtomicLong r33 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r33
            r1.<init>(r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C18070vi.A0b(r28)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = 3
            r1 = r28
            X.C18070vi.A0d(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r46 = " and remove: "
            if (r25 == 0) goto L_0x06fc
            X.0ve r8 = r7.A08     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = 10314(0x284a, float:1.4453E-41)
            r1 = r40
            boolean r1 = X.C18020vd.A05(r1, r8, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x06fc
            java.lang.String r1 = "gdrive/backup-file-list-manager/collectFilesToBackupAndRemove/checking cache"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9nb r9 = r7.A02     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            X.A7X r1 = r1.A06     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = r1.A0C     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            java.lang.String r1 = r1.A09     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9sJ r12 = r9.A01(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Boolean r45 = java.lang.Boolean.valueOf(r11)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r12 == 0) goto L_0x06f8
            long r9 = r12.A01     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            long r1 = r1.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r13 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r13 != 0) goto L_0x06f8
            long r1 = r12.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r16 = r1
            r9 = 0
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x08de
            X.2kL r13 = r7.A04     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r1 = "files_to_remove_caching_timestamp"
            long r14 = r13.A00(r1)     // Catch:{ Exception -> 0x08d8 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ Exception -> 0x08d8 }
            r1 = 10439(0x28c7, float:1.4628E-41)
            long r1 = X.AnonymousClass8BR.A05(r8, r1)     // Catch:{ Exception -> 0x08d8 }
            long r1 = r9.toMillis(r1)     // Catch:{ Exception -> 0x08d8 }
            long r14 = r14 + r1
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x08d8 }
            int r1 = (r14 > r9 ? 1 : (r14 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x08de
            X.9zT r12 = r7.A05     // Catch:{ Exception -> 0x08d8 }
            X.2Dj r1 = r12.A01     // Catch:{ Exception -> 0x08d8 }
            r47 = r1
            X.1at r14 = r47.get()     // Catch:{ Exception -> 0x08d8 }
            r1 = r14
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x06ed }
            X.1Ev r15 = r1.A02     // Catch:{ all -> 0x06ed }
            java.lang.String r9 = X.C182289Tu.A00     // Catch:{ all -> 0x06ed }
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x06ed }
            java.lang.String r10 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x06ed }
            r2[r11] = r10     // Catch:{ all -> 0x06ed }
            java.lang.String r1 = "REMOTE_FILE_STORE_SELECT_FILES_TO_REMOVE"
            android.database.Cursor r9 = r15.A0A(r9, r1, r2)     // Catch:{ all -> 0x06ed }
            X.ARn r2 = new X.ARn     // Catch:{ all -> 0x06ed }
            r2.<init>(r12, r6)     // Catch:{ all -> 0x06ed }
            X.Akw r1 = new X.Akw     // Catch:{ all -> 0x06ed }
            r1.<init>(r9, r2)     // Catch:{ all -> 0x06ed }
            r14.close()     // Catch:{ Exception -> 0x08d8 }
            X.1JS r2 = X.AnonymousClass1JO.A01(r1)     // Catch:{ all -> 0x06e9 }
            X.7Sa r2 = X.AnonymousClass1b2.A0B(r2)     // Catch:{ all -> 0x06e9 }
            java.util.List r44 = X.AnonymousClass1b2.A06(r2)     // Catch:{ all -> 0x06e9 }
            r1.close()     // Catch:{ Exception -> 0x08d8 }
            java.lang.String r1 = "files_to_upload_caching_timestamp"
            long r42 = r13.A00(r1)     // Catch:{ Exception -> 0x06e4 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ Exception -> 0x06e4 }
            r1 = 10439(0x28c7, float:1.4628E-41)
            long r1 = X.AnonymousClass8BR.A05(r8, r1)     // Catch:{ Exception -> 0x06e4 }
            long r1 = r9.toMillis(r1)     // Catch:{ Exception -> 0x06e4 }
            long r42 = r42 + r1
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x06e4 }
            int r1 = (r42 > r13 ? 1 : (r42 == r13 ? 0 : -1))
            if (r1 < 0) goto L_0x08de
            X.9eC r15 = r7.A03     // Catch:{ Exception -> 0x06e4 }
            X.2Dj r1 = r15.A03     // Catch:{ Exception -> 0x06e4 }
            X.1at r14 = r1.get()     // Catch:{ Exception -> 0x06e4 }
            r1 = r14
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x06d9 }
            X.1Ev r13 = r1.A02     // Catch:{ all -> 0x06d9 }
            java.lang.String r9 = "SELECT\n  id,\n  upload_title,\n  transaction_id,\n  metadata,\n  media_decryption_hash\nFROM local_files\nWHERE backup_id = ?"
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x06d9 }
            r2[r11] = r10     // Catch:{ all -> 0x06d9 }
            java.lang.String r1 = "LOCAL_FILES_STORE_LOAD_FILES_FOR_BACKUP"
            android.database.Cursor r2 = r13.A0A(r9, r1, r2)     // Catch:{ all -> 0x06d9 }
            X.ARn r1 = new X.ARn     // Catch:{ all -> 0x06d9 }
            r1.<init>(r15, r11)     // Catch:{ all -> 0x06d9 }
            X.Akw r9 = new X.Akw     // Catch:{ all -> 0x06d9 }
            r9.<init>(r2, r1)     // Catch:{ all -> 0x06d9 }
            r14.close()     // Catch:{ Exception -> 0x06e4 }
            X.1JS r1 = X.AnonymousClass1JO.A01(r9)     // Catch:{ all -> 0x06d5 }
            X.7Sa r1 = X.AnonymousClass1b2.A0B(r1)     // Catch:{ all -> 0x06d5 }
            java.util.List r1 = X.AnonymousClass1b2.A06(r1)     // Catch:{ all -> 0x06d5 }
            r9.close()     // Catch:{ Exception -> 0x06e4 }
            java.util.ArrayList r9 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r14 = r1.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x058e:
            boolean r1 = r14.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x05ab
            java.lang.Object r13 = r14.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r13
            X.9q3 r1 = (X.C193409q3) r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = r1.A01     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = r20.A03()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = X.AnonymousClass8BR.A1T(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x058e
            r9.add(r13)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x058e
        L_0x05ab:
            r14 = 10
            java.util.ArrayList r1 = X.C29351c6.A0E(r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x05b5:
            boolean r2 = r9.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r2 == 0) goto L_0x05c7
            java.lang.Object r2 = r9.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9q3 r2 = (X.C193409q3) r2     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A2r r2 = r2.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.add(r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x05b5
        L_0x05c7:
            r2 = r28
            r2.addAll(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r9 = r44.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x05d0:
            boolean r1 = r9.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x05e8
            java.lang.Object r1 = r9.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9sI r1 = (X.C194789sI) r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A2d r1 = r1.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = r1.A01()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r56
            r1.remove(r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x05d0
        L_0x05e8:
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r42 = r44.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x05f0:
            boolean r1 = r42.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0617
            java.lang.Object r9 = r42.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r15 = r9
            X.9sI r15 = (X.C194789sI) r15     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9Ii r2 = r15.A01     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9Ii r1 = X.C179529Ii.TO_REMOVE     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r2 == r1) goto L_0x0613
            X.9Ii r1 = X.C179529Ii.REMOVED     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r2 != r1) goto L_0x05f0
            java.lang.String r2 = r15.A02     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = r20.A03()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = X.C18070vi.A18(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 != 0) goto L_0x05f0
        L_0x0613:
            r13.add(r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x05f0
        L_0x0617:
            java.util.ArrayList r1 = X.C29351c6.A0E(r13)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r9 = r13.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x061f:
            boolean r2 = r9.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r2 == 0) goto L_0x0631
            java.lang.Object r2 = r9.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9sI r2 = (X.C194789sI) r2     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A2d r2 = r2.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.add(r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x061f
        L_0x0631:
            r2 = r31
            r2.addAll(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r13 = r20.A03()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r13 == 0) goto L_0x06c9
            r2 = 10717(0x29dd, float:1.5018E-41)
            r1 = r40
            boolean r1 = X.C18020vd.A05(r1, r8, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 != 0) goto L_0x0655
            X.0wS r2 = X.C18460wS.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0648:
            int r1 = X.C29351c6.A0C(r2, r14)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r9 = X.C200610r.A03(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 16
            if (r9 >= r1) goto L_0x06a8
            goto L_0x06a6
        L_0x0655:
            X.1at r9 = r47.get()     // Catch:{ Exception -> 0x069d }
            r1 = r9
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0692 }
            X.1Ev r8 = r1.A02     // Catch:{ all -> 0x0692 }
            java.lang.String r2 = X.C182289Tu.A01     // Catch:{ all -> 0x0692 }
            r1 = 2
            java.lang.String[] r10 = X.C17880vN.A1b(r10, r13, r1, r6)     // Catch:{ all -> 0x0692 }
            java.lang.String r1 = "REMOTE_FILE_STORE_SELECT_UPLOADED_FILES"
            android.database.Cursor r8 = r8.A0A(r2, r1, r10)     // Catch:{ all -> 0x0692 }
            X.ARn r2 = new X.ARn     // Catch:{ all -> 0x0692 }
            r2.<init>(r12, r6)     // Catch:{ all -> 0x0692 }
            X.Akw r1 = new X.Akw     // Catch:{ all -> 0x0692 }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x0692 }
            r9.close()     // Catch:{ Exception -> 0x069d }
            X.1JS r2 = X.AnonymousClass1JO.A01(r1)     // Catch:{ all -> 0x068e }
            X.7Sa r8 = X.AnonymousClass1b2.A0B(r2)     // Catch:{ all -> 0x068e }
            X.B1w r2 = X.C22293B1w.A00     // Catch:{ all -> 0x068e }
            X.1b3 r2 = X.AnonymousClass1b2.A0C(r2, r8)     // Catch:{ all -> 0x068e }
            java.util.List r2 = X.AnonymousClass1b2.A06(r2)     // Catch:{ all -> 0x068e }
            r1.close()     // Catch:{ Exception -> 0x069d }
            goto L_0x0648
        L_0x068e:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0690 }
        L_0x0690:
            r8 = move-exception
            goto L_0x0699
        L_0x0692:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0694 }
        L_0x0694:
            r8 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ Exception -> 0x069d }
            goto L_0x069c
        L_0x0699:
            X.CDX.A00(r1, r2)     // Catch:{ Exception -> 0x069d }
        L_0x069c:
            throw r8     // Catch:{ Exception -> 0x069d }
        L_0x069d:
            r2 = move-exception
            java.lang.String r1 = "gdrive/backup-file-list-manager/load-uploaded-files cache error"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.0wS r2 = X.C18460wS.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0648
        L_0x06a6:
            r9 = 16
        L_0x06a8:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8.<init>(r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r9 = r2.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x06b1:
            boolean r1 = r9.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x06c4
            java.lang.Object r2 = r9.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r2
            X.A2d r1 = (X.C19990A2d) r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = r1.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8.put(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x06b1
        L_0x06c4:
            r1 = r56
            r1.putAll(r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x06c9:
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r34
            X.1D6 r8 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x08e8
        L_0x06d5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x06d7 }
        L_0x06d7:
            r2 = move-exception
            goto L_0x06e0
        L_0x06d9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x06db }
        L_0x06db:
            r2 = move-exception
            X.CDX.A00(r14, r1)     // Catch:{ Exception -> 0x06e4 }
            goto L_0x06e3
        L_0x06e0:
            X.CDX.A00(r9, r1)     // Catch:{ Exception -> 0x06e4 }
        L_0x06e3:
            throw r2     // Catch:{ Exception -> 0x06e4 }
        L_0x06e4:
            r2 = move-exception
            java.lang.String r1 = "gdrive/backup-file-list-manager/load-files-to-upload cache error"
            goto L_0x08db
        L_0x06e9:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x06eb }
        L_0x06eb:
            r8 = move-exception
            goto L_0x06f4
        L_0x06ed:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x06ef }
        L_0x06ef:
            r8 = move-exception
            X.CDX.A00(r14, r1)     // Catch:{ Exception -> 0x08d8 }
            goto L_0x06f7
        L_0x06f4:
            X.CDX.A00(r1, r2)     // Catch:{ Exception -> 0x08d8 }
        L_0x06f7:
            throw r8     // Catch:{ Exception -> 0x08d8 }
        L_0x06f8:
            r16 = -1
            goto L_0x08de
        L_0x06fc:
            r1 = -1
        L_0x06fe:
            java.lang.String r8 = "gdrive/backup-file-list-manager/collectFilesToBackupAndRemove/collect media files referenced from messages"
            com.whatsapp.util.Log.i((java.lang.String) r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r8 = "gdrive/backup-file-list-manager/perf/collect-referenced-files"
            X.1Ez r13 = new X.1Ez     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r13.<init>((java.lang.String) r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r10 = r27
            r9 = r28
            r8 = r31
            boolean r8 = r0.CCi(r10, r9, r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 != 0) goto L_0x0727
            java.lang.String r1 = "gdrive/backup-file-list-manager/collectReferencedFilesToBackup processing essential files failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x071b:
            r13.A02()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 25
            X.AnonymousClass8BR.A1G(r3, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/collectFilesToBackupAndRemove/failed to generate list of files to be uploaded."
            goto L_0x01df
        L_0x0727:
            X.9zq r8 = r7.A01     // Catch:{ 8ga -> 0x0925 }
            X.AMX r12 = r7.A00     // Catch:{ 8ga -> 0x0925 }
            r47 = r8
            r48 = r12
            r49 = r0
            r50 = r9
            r51 = r31
            r52 = r56
            X.0yx r14 = r47.A01(r48, r49, r50, r51, r52)     // Catch:{ 8ga -> 0x0925 }
            java.lang.Object r8 = r14.A00     // Catch:{ 8ga -> 0x0925 }
            X.C18070vi.A0W(r8)     // Catch:{ 8ga -> 0x0925 }
            long r8 = X.C17880vN.A05(r8)     // Catch:{ 8ga -> 0x0925 }
            r10 = r32
            r10.set(r8)     // Catch:{ 8ga -> 0x0925 }
            java.lang.Object r8 = r14.A01     // Catch:{ 8ga -> 0x0925 }
            X.C18070vi.A0W(r8)     // Catch:{ 8ga -> 0x0925 }
            long r8 = X.C17880vN.A05(r8)     // Catch:{ 8ga -> 0x0925 }
            r10 = r33
            r10.set(r8)     // Catch:{ 8ga -> 0x0925 }
            r13.A02()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r15 = X.C17890vO.A0l(r56)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x075e:
            boolean r8 = r15.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 == 0) goto L_0x07ae
            X.A2d r13 = X.AnonymousClass8BR.A0I(r15)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1L7 r8 = r7.A06     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r10 = r13.A01()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r9 = X.C41361wE.A07(r8, r10)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r9 == 0) goto L_0x07a3
            boolean r8 = X.C108975cc.A1M(r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 == 0) goto L_0x07a3
            java.io.File r9 = X.C108945cZ.A17(r9)     // Catch:{ IOException -> 0x079c }
            java.lang.String r8 = r9.getCanonicalPath()     // Catch:{ IOException -> 0x079c }
            boolean r14 = r12.Bf0(r8)     // Catch:{ IOException -> 0x079c }
            if (r14 == 0) goto L_0x075e
            boolean r8 = r12.CLj(r9, r8)     // Catch:{ IOException -> 0x079c }
            if (r8 != 0) goto L_0x075e
            r9.length()     // Catch:{ IOException -> 0x079c }
            r8 = r56
            r8.remove(r10)     // Catch:{ IOException -> 0x079c }
            r8 = r31
            r8.add(r13)     // Catch:{ IOException -> 0x079c }
            goto L_0x075e
        L_0x079c:
            r9 = move-exception
            java.lang.String r8 = "gdrive/backup-file-list-manager/collectFilesToBackupAndRemove/failed to get canonical path"
            com.whatsapp.util.Log.e(r8, r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x075e
        L_0x07a3:
            r8 = r56
            r8.remove(r10)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8 = r31
            r8.add(r13)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x075e
        L_0x07ae:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r9 = "gdrive/backup-file-list-manager/collectFilesToBackupAndRemove/files/ file to upload: "
            r8 = r28
            X.C17890vO.A15(r9, r10, r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8 = r46
            r10.append(r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r8 = r31.size()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C17900vP.A0o(r10, r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r25 == 0) goto L_0x090d
            X.0ve r10 = r7.A08     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r9 = 10314(0x284a, float:1.4453E-41)
            r8 = r40
            boolean r8 = X.C18020vd.A05(r8, r10, r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 == 0) goto L_0x090d
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x07e9
            X.9nb r10 = r7.A02     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            X.A7X r1 = r1.A06     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r9 = r1.A0C     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            java.lang.String r8 = r1.A09     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r1.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r10.A00(r9, r8, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x07e9:
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x0856
            X.2kL r14 = r7.A04     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8 = 0
            java.lang.String r10 = "files_to_remove_caching_timestamp"
            r14.A01(r10, r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r16 = r31.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x07fa:
            r9 = 1
        L_0x07fb:
            boolean r8 = r16.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 == 0) goto L_0x084d
            X.A2d r13 = X.AnonymousClass8BR.A0I(r16)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r9 == 0) goto L_0x084b
            X.9zT r8 = r7.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C18070vi.A0d(r13, r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.2Dj r8 = r8.A01     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1au r12 = r8.A06()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8 = r12
            X.1av r8 = (X.C28801av) r8     // Catch:{ all -> 0x0bfd }
            X.1Ev r8 = r8.A02     // Catch:{ all -> 0x0bfd }
            r17 = r8
            java.lang.String r44 = "remote_files"
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0bfd }
            r9.<init>(r6)     // Catch:{ all -> 0x0bfd }
            java.lang.String r15 = "state"
            X.9Ii r8 = X.C179529Ii.TO_REMOVE     // Catch:{ all -> 0x0bfd }
            int r8 = r8.value     // Catch:{ all -> 0x0bfd }
            X.C17880vN.A18(r9, r15, r8)     // Catch:{ all -> 0x0bfd }
            java.lang.String r45 = "backup_id = ? AND upload_title = ?"
            java.lang.String[] r8 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0bfd }
            X.C17880vN.A1V(r8, r11, r1)     // Catch:{ all -> 0x0bfd }
            java.lang.String r13 = r13.A06     // Catch:{ all -> 0x0bfd }
            X.C18070vi.A0W(r13)     // Catch:{ all -> 0x0bfd }
            r8[r6] = r13     // Catch:{ all -> 0x0bfd }
            java.lang.String r46 = "REMOTE_FILE_STORE_MARK_FOR_REMOVAL"
            r42 = r17
            r43 = r9
            r47 = r8
            int r8 = r42.A02(r43, r44, r45, r46, r47)     // Catch:{ all -> 0x0bfd }
            r12.close()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 < 0) goto L_0x084b
            goto L_0x07fa
        L_0x084b:
            r9 = 0
            goto L_0x07fb
        L_0x084d:
            if (r9 == 0) goto L_0x0856
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r14.A01(r10, r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0856:
            int r8 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x090d
            X.2kL r13 = r7.A04     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r12 = "files_to_upload_caching_timestamp"
            r4 = 0
            r13.A01(r12, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r17 = r28.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0867:
            r9 = 1
        L_0x0868:
            boolean r8 = r17.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 == 0) goto L_0x08ce
            java.lang.Object r10 = r17.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A2r r10 = (X.C20002A2r) r10     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r9 == 0) goto L_0x08cc
            X.9eC r8 = r7.A03     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C18070vi.A0d(r10, r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.2Dj r8 = r8.A03     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1au r15 = r8.A06()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8 = r15
            X.1av r8 = (X.C28801av) r8     // Catch:{ all -> 0x0c05 }
            X.1Ev r8 = r8.A02     // Catch:{ all -> 0x0c05 }
            r27 = r8
            java.lang.String r16 = "local_files"
            android.content.ContentValues r14 = X.C17880vN.A08()     // Catch:{ all -> 0x0c05 }
            java.lang.String r8 = "backup_id"
            X.C17880vN.A19(r14, r8, r1)     // Catch:{ all -> 0x0c05 }
            java.lang.String r9 = "upload_title"
            java.lang.String r8 = r10.A05     // Catch:{ all -> 0x0c05 }
            r14.put(r9, r8)     // Catch:{ all -> 0x0c05 }
            byte[] r9 = r10.A06     // Catch:{ all -> 0x0c05 }
            if (r9 == 0) goto L_0x08a3
            java.lang.String r8 = "media_decryption_hash"
            r14.put(r8, r9)     // Catch:{ all -> 0x0c05 }
        L_0x08a3:
            X.A55 r8 = r10.A01     // Catch:{ all -> 0x0c05 }
            if (r8 == 0) goto L_0x08ba
            java.lang.String r9 = X.A55.A01(r8)     // Catch:{ JSONException -> 0x08ae }
            if (r9 == 0) goto L_0x08ba
            goto L_0x08b5
        L_0x08ae:
            r9 = move-exception
            java.lang.String r8 = "gdrive/file-metadata/failed to create metadata"
            com.whatsapp.util.Log.e(r8, r9)     // Catch:{ all -> 0x0c05 }
            goto L_0x08ba
        L_0x08b5:
            java.lang.String r8 = "metadata"
            r14.put(r8, r9)     // Catch:{ all -> 0x0c05 }
        L_0x08ba:
            java.lang.String r10 = "LOCAL_FILES_STORE_SAVE_FILE"
            r9 = r27
            r8 = r16
            long r9 = r9.A05(r8, r10, r14)     // Catch:{ all -> 0x0c05 }
            r15.close()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r8 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x08cc
            goto L_0x0867
        L_0x08cc:
            r9 = 0
            goto L_0x0868
        L_0x08ce:
            if (r9 == 0) goto L_0x090d
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r13.A01(r12, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x090d
        L_0x08d8:
            r2 = move-exception
            java.lang.String r1 = "gdrive/backup-file-list-manager/load-files-to-remove cache error"
        L_0x08db:
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x08de:
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r45
            X.1D6 r8 = X.AnonymousClass1D6.A01(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x08e8:
            java.lang.Object r1 = r8.first     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = X.C17880vN.A05(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Object r8 = r8.second     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r8 = X.AnonymousClass000.A1Y(r8)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r8 == 0) goto L_0x06fe
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = "gdrive/backup-file-list-manager/collectFilesToBackupAndRemove/files-from-cache/ file to upload: "
            r1 = r28
            X.C17890vO.A15(r2, r4, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r46
            r4.append(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r1 = r31.size()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C17900vP.A0o(r4, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x090d:
            java.util.Iterator r8 = r28.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 0
        L_0x0913:
            boolean r4 = r8.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r4 == 0) goto L_0x0934
            java.lang.Object r4 = r8.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A2r r4 = (X.C20002A2r) r4     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r4.A00()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r1 + r4
            goto L_0x0913
        L_0x0925:
            java.lang.String r1 = "gdrive/backup-file-list-manager/collectReferencedFilesToBackup processing referenced media files failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x071b
        L_0x092c:
            r1 = r37
            r3.A0b = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/files unable to start transaction"
            goto L_0x01df
        L_0x0934:
            java.util.Collection r4 = r56.values()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C18070vi.A0d(r4, r11)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r10 = r4.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r8 = 0
        L_0x0941:
            boolean r4 = r10.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r4 == 0) goto L_0x0956
            X.A2d r5 = X.AnonymousClass8BR.A0I(r10)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A55 r4 = r5.A02     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r4 == 0) goto L_0x0952
            long r4 = r4.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0954
        L_0x0952:
            long r4 = r5.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0954:
            long r8 = r8 + r4
            goto L_0x0941
        L_0x0956:
            long r1 = r1 + r8
            r0.A05 = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r4 = "gdrive/backup/collectFilesToBackupAndRemove/files/estimated total size of backup "
            X.C17900vP.A0m(r4, r5, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r52 = java.lang.System.currentTimeMillis()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = r61.A01()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x1018
            java.lang.Integer r1 = X.AnonymousClass3MY.A0g()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r5 = r61
            r4 = r26
            r2 = r20
            r1 = r31
            boolean r1 = X.C20127A8m.A08(r5, r2, r4, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 != 0) goto L_0x098b
            r1 = r37
            r3.A0b = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/files/failed to delete files"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0c07
        L_0x098b:
            r42 = 1
            if (r25 == 0) goto L_0x0a06
            X.0ve r4 = r7.A08     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = 10314(0x284a, float:1.4453E-41)
            r1 = r40
            boolean r1 = X.C18020vd.A05(r1, r4, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0a06
            java.lang.String r5 = r20.A03()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r5 == 0) goto L_0x0a06
            X.9nb r4 = r7.A02     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            X.A7X r1 = r1.A06     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = r1.A0C     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r20
            java.lang.String r1 = r1.A09     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9sJ r1 = r4.A01(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0a06
            long r12 = r1.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r15 = r31.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x09b9:
            boolean r1 = r15.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0a06
            X.A2d r8 = X.AnonymousClass8BR.A0I(r15)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9zT r1 = r7.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.C18070vi.A0d(r8, r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r9 = 2
            X.2Dj r1 = r1.A01     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1au r4 = r1.A06()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r4
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0c2a }
            X.1Ev r14 = r1.A02     // Catch:{ all -> 0x0c2a }
            java.lang.String r45 = "remote_files"
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x0c2a }
            r2.<init>(r9)     // Catch:{ all -> 0x0c2a }
            java.lang.String r10 = "state"
            X.9Ii r1 = X.C179529Ii.REMOVED     // Catch:{ all -> 0x0c2a }
            int r1 = r1.value     // Catch:{ all -> 0x0c2a }
            X.C17880vN.A18(r2, r10, r1)     // Catch:{ all -> 0x0c2a }
            java.lang.String r1 = "transaction_id"
            r2.put(r1, r5)     // Catch:{ all -> 0x0c2a }
            java.lang.String r46 = "backup_id = ? AND upload_title = ?"
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ all -> 0x0c2a }
            X.C17880vN.A1V(r1, r11, r12)     // Catch:{ all -> 0x0c2a }
            java.lang.String r8 = r8.A06     // Catch:{ all -> 0x0c2a }
            X.C18070vi.A0W(r8)     // Catch:{ all -> 0x0c2a }
            r1[r6] = r8     // Catch:{ all -> 0x0c2a }
            java.lang.String r47 = "REMOTE_FILE_STORE_MARK_AS_REMOVED"
            r43 = r14
            r44 = r2
            r48 = r1
            r43.A02(r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0c2a }
            r4.close()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x09b9
        L_0x0a06:
            java.lang.Integer r1 = X.C108955ca.A0e()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r14 = r28.size()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/files/files-to-be-uploaded/count/"
            X.C17900vP.A0j(r1, r2, r14)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.Iterator r10 = r28.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r9 = 0
            r5 = 0
            r7 = 0
        L_0x0a21:
            boolean r1 = r10.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r16 = 1
            if (r1 == 0) goto L_0x0a5c
            java.lang.Object r4 = r10.next()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.A2r r4 = (X.C20002A2r) r4     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = r4.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "-increment-"
            boolean r1 = X.AnonymousClass1YF.A0Y(r2, r1, r11)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0a41
            long r7 = r7 + r16
            r1 = r29
            r3.A0f = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r5 = 1
            goto L_0x0a52
        L_0x0a41:
            java.lang.String r1 = "msgstore.db"
            boolean r1 = X.AnonymousClass1YF.A0Y(r2, r1, r11)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0a52
            long r7 = r7 + r16
            r9 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0f = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0a52:
            long r1 = r4.A00()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r58
            r4.addAndGet(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0a21
        L_0x0a5c:
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0p = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r9 == 0) goto L_0x0a6a
            if (r5 == 0) goto L_0x0a6a
            r1 = r30
            r3.A0f = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0a6a:
            boolean r1 = r61.A01()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x1018
            r1 = r66
            int r2 = r1.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r2 != r6) goto L_0x0ac7
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0a7a:
            r3.A0k = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0a7c:
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r62)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive_already_uploaded_bytes"
            long r1 = X.C17890vO.A05(r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.concurrent.atomic.AtomicLong r4 = r0.A0g     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r29 = r4
            r4.set(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r58
            r4.addAndGet(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r44 = r29.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r47 = r58.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.35L r1 = new X.35L     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r46 = 2
            r43 = r1
            r43.<init>(r44, r46, r47)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2 = r68
            r2.notifyAllObservers(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.concurrent.atomic.AtomicBoolean r27 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r27
            r1.<init>(r6)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 0
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r10.<init>(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.concurrent.CountDownLatch r15 = new java.util.concurrent.CountDownLatch     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r15.<init>(r14)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 0
            java.util.concurrent.atomic.AtomicLong r5 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r5.<init>(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.util.concurrent.atomic.AtomicLong r4 = new java.util.concurrent.atomic.AtomicLong     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4.<init>(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0acf
        L_0x0ac7:
            r1 = 2
            if (r2 != r1) goto L_0x0a7c
            java.lang.Long r1 = X.C17890vO.A0L()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0a7a
        L_0x0acf:
            java.util.Iterator r25 = r28.iterator()     // Catch:{ all -> 0x0fdd }
        L_0x0ad3:
            boolean r1 = r25.hasNext()     // Catch:{ all -> 0x0fdd }
            if (r1 == 0) goto L_0x0bae
            java.lang.Object r9 = r25.next()     // Catch:{ all -> 0x0fdd }
            X.A2r r9 = (X.C20002A2r) r9     // Catch:{ all -> 0x0fdd }
            boolean r1 = r0.A04(r10, r14)     // Catch:{ all -> 0x0fdd }
            if (r1 != 0) goto L_0x0fd9
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x0fdd }
            r50 = r5
            java.lang.String r2 = r9.A04     // Catch:{ all -> 0x0fdd }
            r1 = r57
            X.0vl r1 = r1.A01     // Catch:{ all -> 0x0fdd }
            boolean r1 = X.AnonymousClass8BX.A1V(r2, r1)     // Catch:{ all -> 0x0fdd }
            if (r1 != 0) goto L_0x0b02
            r1 = r57
            boolean r1 = r1.Bf0(r2)     // Catch:{ all -> 0x0fdd }
            r50 = 0
            if (r1 == 0) goto L_0x0b02
            r50 = r4
        L_0x0b02:
            java.io.File r1 = r9.A02     // Catch:{ all -> 0x0fdd }
            boolean r2 = r1.exists()     // Catch:{ all -> 0x0fdd }
            if (r2 != 0) goto L_0x0b22
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fdd }
            java.lang.String r1 = "gdrive/backup/backup-file file "
            r2.append(r1)     // Catch:{ all -> 0x0fdd }
            java.lang.String r1 = "<file>"
            r2.append(r1)     // Catch:{ all -> 0x0fdd }
            java.lang.String r1 = " does not exist"
            X.C17890vO.A1A(r2, r1)     // Catch:{ all -> 0x0fdd }
            r15.countDown()     // Catch:{ all -> 0x0fdd }
            goto L_0x0ba9
        L_0x0b22:
            boolean r1 = r1.isDirectory()     // Catch:{ all -> 0x0fdd }
            if (r1 == 0) goto L_0x0b3e
            r1 = r37
            r3.A0b = r1     // Catch:{ all -> 0x0fdd }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fdd }
            java.lang.String r1 = "gdrive-service/backup-file/expected-file-got-directory-instead/"
            r2.append(r1)     // Catch:{ all -> 0x0fdd }
            java.lang.String r1 = "<file>"
            X.C17890vO.A19(r2, r1)     // Catch:{ all -> 0x0fdd }
        L_0x0b3a:
            r15.countDown()     // Catch:{ all -> 0x0fdd }
            goto L_0x0b87
        L_0x0b3e:
            boolean r1 = r59.get()     // Catch:{ all -> 0x0fdd }
            if (r1 != 0) goto L_0x0b4a
            java.lang.String r1 = "gdrive/backup/backup-file backup has been cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0fdd }
            goto L_0x0b3a
        L_0x0b4a:
            long r12 = r58.get()     // Catch:{ all -> 0x0fdd }
            r7 = 0
            int r1 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b89
            long r7 = r64.get()     // Catch:{ all -> 0x0fdd }
            double r1 = (double) r7     // Catch:{ all -> 0x0fdd }
            r7 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 * r7
            long r12 = r58.get()     // Catch:{ all -> 0x0fdd }
            double r7 = (double) r12     // Catch:{ all -> 0x0fdd }
            double r1 = r1 / r7
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r7 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0b89
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0fdd }
            java.lang.String r1 = "gdrive/backup/backup-file/too-many-failures upload-failed:"
            r7.append(r1)     // Catch:{ all -> 0x0fdd }
            long r1 = r64.get()     // Catch:{ all -> 0x0fdd }
            r7.append(r1)     // Catch:{ all -> 0x0fdd }
            java.lang.String r2 = " upload-total:"
            r1 = r58
            X.C17900vP.A0Y(r1, r2, r7)     // Catch:{ all -> 0x0fdd }
            r15.countDown()     // Catch:{ all -> 0x0fdd }
            r1 = 38
            X.AnonymousClass8BR.A1G(r3, r1)     // Catch:{ all -> 0x0fdd }
        L_0x0b87:
            r1 = 0
            goto L_0x0baa
        L_0x0b89:
            X.00H r1 = X.C20134A8u.A00     // Catch:{ all -> 0x0fdd }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0fdd }
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2     // Catch:{ all -> 0x0fdd }
            X.AkV r1 = new X.AkV     // Catch:{ all -> 0x0fdd }
            r43 = r1
            r44 = r10
            r45 = r20
            r46 = r0
            r47 = r27
            r48 = r15
            r49 = r9
            r51 = r6
            r43.<init>(r44, r45, r46, r47, r48, r49, r50, r51)     // Catch:{ all -> 0x0fdd }
            r2.execute(r1)     // Catch:{ all -> 0x0fdd }
        L_0x0ba9:
            r1 = 1
        L_0x0baa:
            r42 = r42 & r1
            goto L_0x0ad3
        L_0x0bae:
            r9 = 0
            java.lang.String r1 = "gdrive/backup/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0fdd }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0bc0 }
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r1 = r15.await(r1, r7)     // Catch:{ InterruptedException -> 0x0bc0 }
            r42 = r42 & r1
            goto L_0x0bcc
        L_0x0bc0:
            r2 = move-exception
            java.lang.String r1 = "gdrive/backup/files upload interrupted"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0fdd }
            r1 = r37
            r3.A0b = r1     // Catch:{ all -> 0x0fdd }
            r42 = 0
        L_0x0bcc:
            boolean r1 = r0.A04(r10, r14)     // Catch:{ all -> 0x0fdd }
            if (r1 != 0) goto L_0x0fd9
            A03(r3, r5, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            boolean r1 = r27.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r42 = r42 & r1
            if (r42 == 0) goto L_0x0bf2
            java.lang.String r2 = "message-store-backups-not-uploaded"
            r1 = r36
            r0.A05(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Integer r1 = X.C108955ca.A0f()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/perf/build-metadata"
            X.1Ez r14 = new X.1Ez     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r14.<init>((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0c32
        L_0x0bf2:
            java.lang.String r1 = "gdrive/backup/files failed to uploadFiles"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Integer r1 = r3.A0b     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 != 0) goto L_0x1018
            goto L_0x0199
        L_0x0bfd:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0bff }
        L_0x0bff:
            r1 = move-exception
            X.CDX.A00(r12, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x100d
        L_0x0c05:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x1009 }
        L_0x0c07:
            if (r25 == 0) goto L_0x1018
            X.0ve r2 = r7.A08     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 10314(0x284a, float:1.4453E-41)
            r4 = r40
            boolean r1 = X.C18020vd.A05(r4, r2, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x1018
            X.2kL r5 = r7.A04     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r4 = "files_to_upload_caching_timestamp"
            r1 = 0
            r5.A01(r4, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r4 = "files_to_remove_caching_timestamp"
            r5.A01(r4, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r4 = "backup_files_caching_timestamp"
            r5.A01(r4, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x1018
        L_0x0c2a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0c2c }
        L_0x0c2c:
            r1 = move-exception
            X.CDX.A00(r4, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x100d
        L_0x0c32:
            java.lang.String r1 = "gdrive/backup/perf/build-metadata/filter-files-and-build-stats"
            X.1Ez r13 = new X.1Ez     // Catch:{ IOException -> 0x0edb }
            r13.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "msgstore.db.crypt(\\d+)|msgstore-increment-(\\d+).db.crypt(\\d+)"
            java.util.regex.Pattern r12 = java.util.regex.Pattern.compile(r1)     // Catch:{ IOException -> 0x0edb }
            java.util.ArrayList r4 = X.C108965cb.A0t(r12)     // Catch:{ IOException -> 0x0edb }
            java.io.File r2 = r60.A03()     // Catch:{ IOException -> 0x0edb }
            r1 = r66
            X.C20134A8u.A09(r1, r2, r4)     // Catch:{ IOException -> 0x0edb }
            java.util.HashSet r10 = X.AnonymousClass8BR.A12(r4)     // Catch:{ IOException -> 0x0edb }
            X.C17960vV.A07(r56)     // Catch:{ IOException -> 0x0edb }
            java.util.Iterator r15 = X.C17890vO.A0l(r56)     // Catch:{ IOException -> 0x0edb }
        L_0x0c57:
            boolean r1 = r15.hasNext()     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0ced
            X.A2d r1 = X.AnonymousClass8BR.A0I(r15)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r4 = r1.A01()     // Catch:{ IOException -> 0x0edb }
            r2 = r60
            java.lang.String r2 = X.C41361wE.A07(r2, r4)     // Catch:{ IOException -> 0x0edb }
            if (r2 == 0) goto L_0x0c57
            java.io.File r8 = X.C108945cZ.A17(r2)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r7 = r8.getCanonicalPath()     // Catch:{ IOException -> 0x0edb }
            X.A55 r2 = r1.A02     // Catch:{ IOException -> 0x0edb }
            if (r2 == 0) goto L_0x0c7c
            long r4 = r2.A00     // Catch:{ IOException -> 0x0edb }
            goto L_0x0c7e
        L_0x0c7c:
            long r4 = r1.A00     // Catch:{ IOException -> 0x0edb }
        L_0x0c7e:
            r27 = 0
            int r2 = (r4 > r27 ? 1 : (r4 == r27 ? 0 : -1))
            if (r2 >= 0) goto L_0x0c8e
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0edb }
            java.lang.String r2 = "gdrive/backup/build-stats/file-size-is-not-positive"
            X.C17900vP.A0X(r1, r2, r4)     // Catch:{ IOException -> 0x0edb }
            goto L_0x0c57
        L_0x0c8e:
            java.lang.String r1 = r8.getName()     // Catch:{ IOException -> 0x0edb }
            boolean r1 = X.AnonymousClass8BU.A1V(r1, r12)     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0c9d
            long r1 = r0.A03     // Catch:{ IOException -> 0x0edb }
            long r1 = r1 + r4
            r0.A03 = r1     // Catch:{ IOException -> 0x0edb }
        L_0x0c9d:
            r1 = r57
            boolean r1 = r1.Bf0(r7)     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0cb0
            long r1 = r0.A06     // Catch:{ IOException -> 0x0edb }
            long r1 = r1 + r4
            r0.A06 = r1     // Catch:{ IOException -> 0x0edb }
            int r1 = r0.A00     // Catch:{ IOException -> 0x0edb }
            int r1 = r1 + 1
            r0.A00 = r1     // Catch:{ IOException -> 0x0edb }
        L_0x0cb0:
            if (r7 == 0) goto L_0x0cdb
            r1 = r57
            X.0vl r1 = r1.A06     // Catch:{ IOException -> 0x0edb }
            boolean r1 = X.AnonymousClass8BX.A1V(r7, r1)     // Catch:{ IOException -> 0x0edb }
            if (r1 != 0) goto L_0x0cc6
            r1 = r57
            X.0vl r1 = r1.A04     // Catch:{ IOException -> 0x0edb }
            boolean r1 = X.AnonymousClass8BX.A1V(r7, r1)     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0ccb
        L_0x0cc6:
            long r1 = r0.A09     // Catch:{ IOException -> 0x0edb }
            long r1 = r1 + r4
            r0.A09 = r1     // Catch:{ IOException -> 0x0edb }
        L_0x0ccb:
            r1 = r57
            X.0vl r1 = r1.A03     // Catch:{ IOException -> 0x0edb }
            boolean r1 = X.AnonymousClass8BX.A1V(r7, r1)     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0cdb
            int r1 = r0.A01     // Catch:{ IOException -> 0x0edb }
            int r1 = r1 + 1
            r0.A01 = r1     // Catch:{ IOException -> 0x0edb }
        L_0x0cdb:
            boolean r1 = r10.contains(r8)     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0ce6
            long r1 = r0.A08     // Catch:{ IOException -> 0x0edb }
            long r1 = r1 + r4
            r0.A08 = r1     // Catch:{ IOException -> 0x0edb }
        L_0x0ce6:
            long r1 = r0.A02     // Catch:{ IOException -> 0x0edb }
            long r1 = r1 + r4
            r0.A02 = r1     // Catch:{ IOException -> 0x0edb }
            goto L_0x0c57
        L_0x0ced:
            r13.A02()     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "gdrive/backup/perf/build-metadata/metadata"
            X.1Ez r5 = new X.1Ez     // Catch:{ IOException -> 0x0edb }
            r5.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0edb }
            java.util.HashMap r4 = X.C17880vN.A11()     // Catch:{ IOException -> 0x0edb }
            java.lang.Long r1 = java.lang.Long.valueOf(r54)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "numOfMessages"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            r1 = r67
            X.AQW.A00(r1, r4)     // Catch:{ IOException -> 0x0edb }
            int r1 = r0.A01     // Catch:{ IOException -> 0x0edb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "numOfPhotos"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            int r1 = r0.A00     // Catch:{ IOException -> 0x0edb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "numOfMediaFiles"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            long r1 = r0.A06     // Catch:{ IOException -> 0x0edb }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "mediaSize"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            long r1 = r0.A09     // Catch:{ IOException -> 0x0edb }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "videoSize"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            java.util.LinkedHashMap r1 = X.AnonymousClass9QA.A00(r62)     // Catch:{ IOException -> 0x0edb }
            X.AQX r2 = new X.AQX     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "localSettings"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            boolean r1 = r65.A04()     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0d80
            X.AQX r1 = new X.AQX     // Catch:{ IOException -> 0x0edb }
            r1.<init>(r4)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r2 = X.AnonymousClass9Q9.A00(r1)     // Catch:{ IOException -> 0x0edb }
            r1 = r65
            java.lang.String r1 = r1.A01(r2)     // Catch:{ IOException -> 0x0edb }
            r4.clear()     // Catch:{ IOException -> 0x0edb }
            if (r1 == 0) goto L_0x0d80
            X.AQV r2 = new X.AQV     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "encryptedData"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
        L_0x0d80:
            r1 = r65
            X.1NP r1 = r1.A01     // Catch:{ IOException -> 0x0edb }
            X.2Qv r1 = r1.A08()     // Catch:{ IOException -> 0x0edb }
            int r2 = r1.ordinal()     // Catch:{ IOException -> 0x0edb }
            if (r2 == r11) goto L_0x0e14
            r1 = 3
            if (r2 == r1) goto L_0x0d97
            if (r2 == r6) goto L_0x0e1a
            r1 = 2
            if (r2 == r1) goto L_0x0e1a
            goto L_0x0e0f
        L_0x0d97:
            X.1NO r1 = r0.A0F     // Catch:{ IOException -> 0x0edb }
            java.lang.String r2 = "encb/EncBackupLocalStorage/failed to load passkey data"
            X.118 r1 = r1.A00     // Catch:{ IOException -> 0x0edb }
            android.content.Context r8 = r1.A00     // Catch:{ IOException -> 0x0edb }
            java.io.File r7 = r8.getFilesDir()     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "passkey_data.key"
            java.io.File r7 = X.C17880vN.A0e(r7, r1)     // Catch:{ IOException -> 0x0edb }
            boolean r7 = r7.exists()     // Catch:{ IOException -> 0x0edb }
            if (r7 == 0) goto L_0x0e08
            java.io.File r7 = X.AnonymousClass8BU.A0f(r8, r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            java.nio.charset.Charset r1 = X.C26571Sq.A05     // Catch:{ IOException | JSONException -> 0x0e04 }
            java.lang.String r1 = X.AnonymousClass3Gr.A00(r7, r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            org.json.JSONObject r7 = X.C17880vN.A16(r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            java.lang.String r1 = "version"
            int r1 = r7.getInt(r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            if (r1 != r6) goto L_0x0e08
            java.lang.String r1 = "credentialId"
            java.lang.String r1 = X.C18070vi.A0J(r1, r7)     // Catch:{ IOException | JSONException -> 0x0e04 }
            X.9pc r1 = X.C196759vb.A00(r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            X.9pb r10 = new X.9pb     // Catch:{ IOException | JSONException -> 0x0e04 }
            r10.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            java.lang.String r1 = "encapsulatedRootKey"
            java.lang.String r1 = X.C18070vi.A0J(r1, r7)     // Catch:{ IOException | JSONException -> 0x0e04 }
            X.9pc r1 = X.C196759vb.A00(r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            X.9pZ r8 = new X.9pZ     // Catch:{ IOException | JSONException -> 0x0e04 }
            r8.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0e04 }
            byte[] r1 = new byte[r11]     // Catch:{ IOException -> 0x0edb }
            byte[] r1 = java.util.Arrays.copyOf(r1, r11)     // Catch:{ IOException -> 0x0edb }
            X.9pc r7 = new X.9pc     // Catch:{ IOException -> 0x0edb }
            r7.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            byte[] r1 = new byte[r11]     // Catch:{ IOException -> 0x0edb }
            byte[] r1 = java.util.Arrays.copyOf(r1, r11)     // Catch:{ IOException -> 0x0edb }
            X.9pc r2 = new X.9pc     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            X.A1x r1 = new X.A1x     // Catch:{ IOException -> 0x0edb }
            r1.<init>(r8, r10, r7, r2)     // Catch:{ IOException -> 0x0edb }
            X.9uI r7 = new X.9uI     // Catch:{ IOException -> 0x0edb }
            r7.<init>(r1, r11)     // Catch:{ IOException -> 0x0edb }
            goto L_0x0e1f
        L_0x0e04:
            r1 = move-exception
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ IOException -> 0x0edb }
        L_0x0e08:
            java.lang.String r1 = "Check failed."
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r1)     // Catch:{ IOException -> 0x0edb }
            goto L_0x0e13
        L_0x0e0f:
            X.3EW r1 = X.AnonymousClass3MW.A14()     // Catch:{ IOException -> 0x0edb }
        L_0x0e13:
            throw r1     // Catch:{ IOException -> 0x0edb }
        L_0x0e14:
            X.9uI r7 = new X.9uI     // Catch:{ IOException -> 0x0edb }
            r7.<init>(r9, r11)     // Catch:{ IOException -> 0x0edb }
            goto L_0x0e1f
        L_0x0e1a:
            X.9uI r7 = new X.9uI     // Catch:{ IOException -> 0x0edb }
            r7.<init>(r9, r6)     // Catch:{ IOException -> 0x0edb }
        L_0x0e1f:
            java.util.HashMap r1 = r7.A00()     // Catch:{ IOException -> 0x0edb }
            X.AQX r2 = new X.AQX     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "encryptedBackupMetadata"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            boolean r1 = r7.A03     // Catch:{ IOException -> 0x0edb }
            X.AQW r2 = new X.AQW     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "encryptedBackupEnabled"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "backupVersion"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            long r1 = r0.A02     // Catch:{ IOException -> 0x0edb }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "backupSize"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            long r1 = r0.A03     // Catch:{ IOException -> 0x0edb }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ IOException -> 0x0edb }
            X.AQU r2 = new X.AQU     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "chatdbSize"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = X.C18170vs.A02()     // Catch:{ IOException -> 0x0edb }
            X.C18070vi.A0d(r1, r11)     // Catch:{ IOException -> 0x0edb }
            X.AQV r2 = new X.AQV     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "versionOfAppWhenBackup"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            X.A0e r10 = r0.A0E     // Catch:{ IOException -> 0x0edb }
            org.json.JSONObject r7 = X.C17880vN.A15()     // Catch:{ IOException -> 0x0edb }
            java.util.HashMap r8 = X.C19947A0e.A00(r10)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r2 = "backup_version"
            java.util.Iterator r13 = X.C17890vO.A0j(r8)     // Catch:{ JSONException -> 0x0ec2 }
        L_0x0e88:
            r12 = 1
        L_0x0e89:
            boolean r1 = r13.hasNext()     // Catch:{ JSONException -> 0x0ec2 }
            if (r1 == 0) goto L_0x0ea0
            java.lang.Object r1 = r13.next()     // Catch:{ JSONException -> 0x0ec2 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x0ec2 }
            if (r12 == 0) goto L_0x0e9e
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x0ec2 }
            if (r1 == 0) goto L_0x0e9e
            goto L_0x0e88
        L_0x0e9e:
            r12 = 0
            goto L_0x0e89
        L_0x0ea0:
            r7.put(r2, r6)     // Catch:{ JSONException -> 0x0ec2 }
            java.util.List r1 = r10.A00     // Catch:{ JSONException -> 0x0ec2 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ JSONException -> 0x0ec2 }
        L_0x0ea9:
            boolean r1 = r10.hasNext()     // Catch:{ JSONException -> 0x0ec2 }
            if (r1 == 0) goto L_0x0ec8
            java.lang.String r2 = X.C17880vN.A0v(r10)     // Catch:{ JSONException -> 0x0ec2 }
            java.lang.Object r1 = r8.get(r2)     // Catch:{ JSONException -> 0x0ec2 }
            X.C17960vV.A07(r1)     // Catch:{ JSONException -> 0x0ec2 }
            boolean r1 = X.AnonymousClass000.A1Y(r1)     // Catch:{ JSONException -> 0x0ec2 }
            r7.put(r2, r1)     // Catch:{ JSONException -> 0x0ec2 }
            goto L_0x0ea9
        L_0x0ec2:
            r2 = move-exception
            java.lang.String r1 = "BackupExpiryManager/getGoogleBackupJsonMetadata failed to create json"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ IOException -> 0x0edb }
        L_0x0ec8:
            java.lang.String r1 = X.C18070vi.A0H(r7)     // Catch:{ IOException -> 0x0edb }
            X.AQV r2 = new X.AQV     // Catch:{ IOException -> 0x0edb }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0edb }
            java.lang.String r1 = "backupExpiry"
            r4.put(r1, r2)     // Catch:{ IOException -> 0x0edb }
            r5.A02()     // Catch:{ IOException -> 0x0edb }
            r9 = r4
            goto L_0x0ee1
        L_0x0edb:
            r2 = move-exception
            java.lang.String r1 = "gdrive/backup/build-metadata"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0ee1:
            r14.A02()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r9 != 0) goto L_0x0ef2
            java.lang.String r1 = "gdrive/backup/files/failed to build metadata"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r37
            r3.A0b = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r12 = 0
            goto L_0x0f90
        L_0x0ef2:
            boolean r1 = r59.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0fef
            boolean r1 = r59.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0fef
            java.util.Iterator r7 = r31.iterator()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0f02:
            boolean r1 = r7.hasNext()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r1 == 0) goto L_0x0f1a
            X.A2d r1 = X.AnonymousClass8BR.A0I(r7)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r0.A04     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r1.A00     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r4 + r1
            r0.A04 = r4     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r0.A07     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r1 + r16
            r0.A07 = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0f02
        L_0x0f1a:
            java.lang.String r2 = "message-store-backups-deleted"
            r1 = r36
            r0.A05(r1, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.1OZ r4 = r0.A0Y     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            r4.A0E(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Integer r1 = X.AnonymousClass8BS.A0U()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0c = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.9oH r1 = r0.A0D     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.Aly r2 = new X.Aly     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r2.<init>(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.8gL r1 = new X.8gL     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r20
            r1.<init>(r4, r2, r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r4 = r61
            r2 = r38
            java.lang.Object r2 = X.A84.A00(r1, r4, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r12 = 1
            r1 = r34
            if (r2 != r1) goto L_0x0f72
            long r1 = r0.A06     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r54 = r32.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r56 = r33.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r5 = r62.A0f()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r7 = 0
            int r4 = (r54 > r7 ? 1 : (r54 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0f62
            int r4 = (r56 > r7 ? 1 : (r56 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0f67
        L_0x0f62:
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 < 0) goto L_0x0f67
            goto L_0x0f7d
        L_0x0f67:
            java.lang.String r1 = "gdrive/backup/backup-size-estimation: removing old stats after backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r67
            r1.A0L(r5)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0f90
        L_0x0f72:
            r12 = 0
            r1 = r37
            r3.A0b = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x0f90
        L_0x0f7d:
            java.lang.String r4 = "gdrive/backup/backup-size-estimation: updating stats after backup"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.2mP r4 = new X.2mP     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r49 = r4
            r50 = r1
            r49.<init>(r50, r52, r54, r56)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1 = r67
            r1.A0K(r4, r5)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0f90:
            long r4 = r29.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r64.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r4 + r1
            double r1 = (double) r4     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0C = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r4 = r64.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            double r1 = (double) r4     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A0B = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r7 = r58.get()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            long r1 = r0.A05     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r4)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r3.A01 = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/files backup finished (success ="
            r2.append(r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = X.C17900vP.A0F(r2, r12)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            if (r12 == 0) goto L_0x1019
            r1 = r67
            r1.A0H(r11)     // Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }
            X.B76 r2 = r0.A0j     // Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }
            r1 = 10
            goto L_0x1027
        L_0x0fd9:
            A03(r3, r5, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x1018
        L_0x0fdd:
            r1 = move-exception
            A03(r3, r5, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x100d
        L_0x0fe2:
            r2 = move-exception
            java.lang.Long r1 = X.AnonymousClass8BT.A0n(r28)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r9.A00 = r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            X.18K r1 = r0.A0W     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.CC7(r9)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            throw r2     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x0fef:
            com.whatsapp.util.Log.i((java.lang.String) r35)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x1018
        L_0x0ff3:
            java.lang.String r1 = "gdrive/backup/getLatestMessageStoreBackupFiles message store base backup file does not exist. The user deleted it or local backup is currently running."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r2 = "Message store base backup file does not exist."
            X.8gh r1 = new X.8gh     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.<init>(r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x100d
        L_0x1000:
            r4 = move-exception
            java.lang.String r2 = "Unexpected failure: "
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            r1.<init>(r2, r4)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            goto L_0x100d
        L_0x1009:
            r1 = move-exception
            X.CDX.A00(r15, r2)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x100d:
            throw r1     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x100e:
            r1 = 31
            X.AnonymousClass8BR.A1G(r3, r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
            java.lang.String r1 = "gdrive/backup/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gf -> 0x1048, 9LZ -> 0x1040, 1oV -> 0x1031 }
        L_0x1018:
            r12 = 0
        L_0x1019:
            r1 = r66
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0P     // Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }
            boolean r1 = r1.get()     // Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }
            if (r1 == 0) goto L_0x10a6
            X.B76 r2 = r0.A0j     // Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }
            r1 = 14
        L_0x1027:
            r2.onError(r1)     // Catch:{ 8gf -> 0x102f, 9LZ -> 0x102d, 1oV -> 0x102b }
            goto L_0x10a6
        L_0x102b:
            r2 = move-exception
            goto L_0x1033
        L_0x102d:
            r2 = move-exception
            goto L_0x1042
        L_0x102f:
            r2 = move-exception
            goto L_0x104a
        L_0x1031:
            r2 = move-exception
            r12 = 0
        L_0x1033:
            java.lang.String r1 = "gdrive/backup"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x146b }
            X.B76 r2 = r0.A0j     // Catch:{ all -> 0x146b }
            r1 = 20
            r2.onError(r1)     // Catch:{ all -> 0x146b }
            goto L_0x105d
        L_0x1040:
            r2 = move-exception
            r12 = 0
        L_0x1042:
            X.B76 r1 = r0.A0j     // Catch:{ all -> 0x146b }
            A02(r2, r1)     // Catch:{ all -> 0x146b }
            goto L_0x105d
        L_0x1048:
            r2 = move-exception
            r12 = 0
        L_0x104a:
            X.9oH r1 = r0.A0D     // Catch:{ all -> 0x146b }
            r1.A01(r6)     // Catch:{ all -> 0x146b }
            X.B76 r1 = r0.A0j     // Catch:{ all -> 0x146b }
            A02(r2, r1)     // Catch:{ all -> 0x146b }
            java.lang.String r2 = r62.A0f()     // Catch:{ all -> 0x146b }
            r1 = r67
            r1.A0L(r2)     // Catch:{ all -> 0x146b }
        L_0x105d:
            X.A84.A03()
            long r4 = java.lang.System.currentTimeMillis()
            java.util.Locale r10 = java.util.Locale.ENGLISH
            java.lang.Object[] r9 = new java.lang.Object[r6]
            long r7 = r4 - r18
            double r1 = (double) r7
            double r1 = r1 / r21
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r1 = X.C108945cZ.A1b(r1, r9, r11, r6)
            r2 = r39
            java.lang.String r1 = java.lang.String.format(r10, r2, r1)
            X.C18070vi.A0a(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r3.A0o = r1
            long r4 = r4 - r23
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.A0m = r1
            android.content.SharedPreferences r1 = r67.A07()
            java.lang.String r10 = "backup_overall_exec_time"
            long r1 = X.C17890vO.A05(r1, r10)
            long r4 = r4 + r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.A0l = r1
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r67)
            android.content.SharedPreferences$Editor r1 = r1.putLong(r10, r4)
            goto L_0x10ea
        L_0x10a6:
            X.A84.A03()
            long r13 = java.lang.System.currentTimeMillis()
            java.util.Locale r8 = java.util.Locale.ENGLISH
            java.lang.Object[] r7 = new java.lang.Object[r6]
            long r4 = r13 - r18
            double r1 = (double) r4
            double r1 = r1 / r21
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.lang.Object[] r2 = X.C108945cZ.A1b(r1, r7, r11, r6)
            r1 = r39
            X.C108955ca.A1W(r1, r8, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r3.A0o = r1
            long r13 = r13 - r23
            java.lang.Long r1 = java.lang.Long.valueOf(r13)
            r3.A0m = r1
            android.content.SharedPreferences r1 = r67.A07()
            java.lang.String r10 = "backup_overall_exec_time"
            long r1 = X.C17890vO.A05(r1, r10)
            long r1 = r1 + r13
            java.lang.Long r4 = java.lang.Long.valueOf(r1)
            r3.A0l = r4
            android.content.SharedPreferences$Editor r4 = X.AnonymousClass8BT.A04(r67)
            android.content.SharedPreferences$Editor r1 = r4.putLong(r10, r1)
        L_0x10ea:
            r1.apply()
            if (r12 == 0) goto L_0x135e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r3.A0b = r7
            long r4 = r0.A03
            double r1 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A06 = r1
            long r4 = r0.A08
            double r1 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A0D = r1
            long r4 = r0.A06
            double r1 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A08 = r1
            long r4 = r0.A02
            double r1 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A0A = r1
            long r4 = r0.A04
            double r1 = (double) r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A05 = r1
            int r1 = r0.A00
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A07 = r1
            long r1 = r0.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r3.A0g = r1
            int r1 = r62.A0K()
            java.lang.Long r1 = X.C17880vN.A0n(r1)
            r3.A0n = r1
            boolean r1 = r67.A0P()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r3.A00 = r1
            r1 = r66
            int r1 = r1.A00
            r4 = 0
            if (r1 != r6) goto L_0x1358
            java.lang.Long r1 = X.C108975cc.A0X()
        L_0x1153:
            r3.A0i = r1
            java.lang.Integer r1 = r3.A0c
            if (r1 != 0) goto L_0x115b
            r3.A0c = r7
        L_0x115b:
            int r7 = r26.A03()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive/backup/total-requests-in-backup-session/"
            X.C17900vP.A0j(r1, r2, r7)
            double r1 = (double) r7
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r3.A09 = r1
            java.lang.String r7 = r62.A0f()
            if (r7 == 0) goto L_0x11b9
            r1 = r62
            long r17 = r1.A0V(r7)
            long r8 = r0.A02
            r13 = -1
            int r1 = (r17 > r13 ? 1 : (r17 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x11b9
            r13 = 14
        L_0x1185:
            long r1 = (long) r13
            r14 = 1073741824(0x40000000, double:5.304989477E-315)
            long r1 = r1 * r14
            r15 = 1
            long r15 = r15 + r17
            int r14 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r14 > 0) goto L_0x1352
            int r14 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r14 > 0) goto L_0x1352
            X.9oH r2 = r0.A0D
            X.00H r1 = r2.A02
            X.1NP r16 = X.AnonymousClass8BS.A0A(r1)
            X.0ve r8 = r2.A01
            r2 = 7207(0x1c27, float:1.0099E-41)
            r1 = r40
            int r8 = X.C18020vd.A00(r1, r8, r2)
            if (r8 == 0) goto L_0x11b9
            android.content.SharedPreferences r2 = r16.A07()
            java.lang.String r1 = "backup_current_banner_type"
            int r1 = r2.getInt(r1, r11)
            r15 = 4
            if (r1 == 0) goto L_0x1314
            if (r1 == r15) goto L_0x1314
        L_0x11b9:
            long r1 = java.lang.System.currentTimeMillis()
            r8 = r62
            r8.A1n(r7, r1)
            long r1 = r0.A02
            r8.A1o(r7, r1)
            long r1 = r0.A06
            r8.A1m(r7, r1)
            long r1 = r0.A09
            r8.A1p(r7, r1)
            boolean r2 = r65.A04()
            r8.A1x(r7, r2)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r62)
            java.lang.String r1 = "gdrive_successive_backup_failed_count"
            X.C17880vN.A1C(r2, r1, r11)
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r62)
            r1 = r41
            android.content.SharedPreferences$Editor r2 = r2.remove(r1)
            java.lang.String r1 = "gdrive_already_uploaded_bytes"
            android.content.SharedPreferences$Editor r2 = r2.remove(r1)
            java.lang.String r1 = "gdrive_user_initiated_backup"
            X.C17880vN.A1B(r2, r1)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r67)
            X.C17880vN.A1B(r1, r10)
            X.A0f r2 = r0.A0L
            r1 = r26
            java.lang.String r1 = r1.A0C
            r2.A01(r1)
            java.util.concurrent.atomic.AtomicLong r1 = r0.A0e
            r1.set(r4)
            java.util.concurrent.atomic.AtomicLong r1 = r0.A0g
            r1.set(r4)
            r1 = r64
            r1.set(r4)
            r1 = r63
            r1.set(r11)
            r1 = r66
            r1.A04 = r11
            if (r7 == 0) goto L_0x1253
            int r1 = r7.length()
            if (r1 == 0) goto L_0x1253
            android.content.SharedPreferences$Editor r8 = X.AnonymousClass8BT.A04(r67)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "google_storage_usage_timestamp:"
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r7, r2)
            android.content.SharedPreferences$Editor r8 = r8.remove(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "google_storage_total_usage:"
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r7, r2)
            android.content.SharedPreferences$Editor r8 = r8.remove(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "google_storage_total_limit:"
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r7, r2)
            X.C17880vN.A1B(r8, r1)
        L_0x1253:
            X.1oW r1 = r0.A0M
            r1.A00()
            X.A84.A02()
            boolean r1 = r26.A0B()
            if (r1 == 0) goto L_0x1292
            java.lang.String r1 = "GoogleBackupRestoreObservable/backup cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r68
            r1.A00 = r11
            r2 = 10
            X.C20735AWq.A00(r1, r2)
        L_0x126f:
            r0.A05 = r4
        L_0x1271:
            r0 = r66
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P
            r0.getAndSet(r11)
            java.lang.Integer r0 = r3.A0b
            java.lang.String r2 = X.C17900vP.A08(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r67)
            java.lang.String r0 = "google_backup_result"
            android.content.SharedPreferences$Editor r3 = r1.putString(r0, r2)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "google_backup_timestamp"
            X.C17880vN.A1D(r3, r0, r1)
            return r12
        L_0x1292:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GoogleBackupRestoreObservable/backup-end/success: "
            X.C17900vP.A0n(r1, r2, r6)
            r1 = r68
            r1.A00 = r11
            X.C20737AWs.A00(r1, r6, r6)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive/backup "
            r2.append(r1)
            java.lang.String r1 = A00(r3)
            X.C17890vO.A1A(r2, r1)
            X.00H r1 = r0.A0Z
            java.util.Iterator r14 = X.AnonymousClass8BX.A0m(r1)
        L_0x12b8:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x130d
            java.lang.Object r1 = r14.next()
            X.1NZ r1 = (X.AnonymousClass1NZ) r1
            r1.A0J(r3)
            X.1NP r13 = r1.A00
            java.lang.String r10 = r1.A0M()
            X.C18070vi.A0d(r10, r11)
            android.content.SharedPreferences r8 = r13.A07()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r10)
            java.lang.String r1 = "_backup_size"
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)
            r6 = -1
            long r1 = r8.getLong(r1, r6)
            java.lang.String r9 = "_backup_google_saved_size"
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x1300
            java.lang.Long r6 = java.lang.Long.valueOf(r1)
            if (r6 == 0) goto L_0x12b8
            android.content.SharedPreferences$Editor r7 = X.AnonymousClass8BT.A04(r13)
            java.lang.String r6 = X.C17900vP.A0A(r10, r9)
            android.content.SharedPreferences$Editor r1 = r7.putLong(r6, r1)
        L_0x12fc:
            r1.apply()
            goto L_0x12b8
        L_0x1300:
            java.lang.String r2 = X.C17900vP.A0A(r10, r9)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r13)
            android.content.SharedPreferences$Editor r1 = r1.remove(r2)
            goto L_0x12fc
        L_0x130d:
            X.18K r1 = r0.A0W
            r1.CC7(r3)
            goto L_0x126f
        L_0x1314:
            r14 = 1
            int r1 = r13 - r6
            int r1 = r6 << r1
            r8 = r8 & r1
            if (r8 != 0) goto L_0x131d
            r14 = 0
        L_0x131d:
            android.content.SharedPreferences r1 = r16.A07()
            java.lang.String r9 = "backup_last_threshold_crossed"
            int r8 = r1.getInt(r9, r11)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "BackupStorageBannerManager/handleCrossingSizeThreshold: threshold="
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = "; thresholdEnabled="
            r2.append(r1)
            r2.append(r14)
            java.lang.String r1 = "; lastThreshold="
            X.C17900vP.A0j(r1, r2, r8)
            if (r14 == 0) goto L_0x11b9
            if (r13 <= r8) goto L_0x11b9
            r1 = r16
            r1.A0C(r15)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r16)
            X.C17880vN.A1C(r1, r9, r13)
            goto L_0x11b9
        L_0x1352:
            int r13 = r13 + -1
            if (r13 <= 0) goto L_0x11b9
            goto L_0x1185
        L_0x1358:
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            goto L_0x1153
        L_0x135e:
            X.1oW r5 = r0.A0M
            r5.A00()
            X.A84.A02()
            r1 = 0
            r4 = r64
            r4.set(r1)
            r1 = r63
            r1.set(r11)
            monitor-enter(r26)
            r1 = r26
            boolean r1 = r1.A00     // Catch:{ all -> 0x1468 }
            monitor-exit(r26)
            if (r1 == 0) goto L_0x13a0
            java.lang.String r1 = "gdrive/backup was canceled"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            r1 = 39
            X.AnonymousClass8BR.A1G(r3, r1)
            java.lang.String r1 = "GoogleBackupRestoreObservable/backup cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = r68
            r1.A00 = r11
            r2 = 10
            X.C20735AWq.A00(r1, r2)
            r0.A01()
            r1 = 0
            r0.A05 = r1
            r0 = r67
            r0.A0H(r11)
            goto L_0x1271
        L_0x13a0:
            boolean r1 = r5.A06()
            if (r1 != 0) goto L_0x145e
            java.lang.String r1 = "gdrive/backup failed on unavailable resource conditions"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            boolean r1 = r0 instanceof X.C167728gr
            if (r1 == 0) goto L_0x1437
            X.8gr r0 = (X.C167728gr) r0
            com.whatsapp.backup.google.workers.GoogleBackupWorker r5 = r0.A00
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.A0Y
            boolean r1 = r1.get()
            if (r1 != 0) goto L_0x1271
            X.8gY r6 = r5.A0C
            boolean r1 = r6.A06()
            if (r1 != 0) goto L_0x1271
            X.1NP r1 = r5.A04
            android.content.SharedPreferences r2 = r1.A07()
            java.lang.String r1 = "google_backup_retry_count"
            int r1 = X.C17890vO.A00(r2, r1)
            int r4 = r5.A00
            if (r1 >= r4) goto L_0x141d
            boolean r1 = r6.A04()
            if (r1 != 0) goto L_0x13fb
            X.8sQ r4 = r5.A0R
            r2 = 22
        L_0x13dd:
            X.AnonymousClass8BR.A1G(r4, r2)
        L_0x13e0:
            java.lang.StringBuilder r2 = X.C20001A2q.A04(r5)
            java.lang.String r1 = "doWork conditions were not met(result code = "
            r2.append(r1)
            X.8sQ r1 = r5.A0R
            java.lang.Integer r1 = r1.A0b
            r2.append(r1)
            java.lang.String r1 = "), retrying backup later"
            X.C17890vO.A1A(r2, r1)
            r1 = 0
        L_0x13f6:
            r0.A06(r1)
            goto L_0x1271
        L_0x13fb:
            boolean r1 = r6.A03()
            if (r1 != 0) goto L_0x1412
            X.1oU r1 = r5.A08
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0U
            boolean r1 = r1.get()
            X.8sQ r4 = r5.A0R
            r2 = 19
            if (r1 != 0) goto L_0x13dd
            r2 = 20
            goto L_0x13dd
        L_0x1412:
            boolean r1 = r6.A05()
            if (r1 != 0) goto L_0x13e0
            X.8sQ r4 = r5.A0R
            r2 = 21
            goto L_0x13dd
        L_0x141d:
            X.8sQ r2 = r5.A0R
            r1 = 24
            X.AnonymousClass8BR.A1G(r2, r1)
            java.lang.StringBuilder r2 = X.C20001A2q.A04(r5)
            java.lang.String r1 = "doWork worker reached the maximum amount of retries("
            r2.append(r1)
            r2.append(r4)
            java.lang.String r1 = "), failing"
            X.C17890vO.A19(r2, r1)
            r1 = 1
            goto L_0x13f6
        L_0x1437:
            boolean r1 = r5.A04()
            if (r1 != 0) goto L_0x1443
            r1 = 34
        L_0x143f:
            X.AnonymousClass8BR.A1G(r3, r1)
            goto L_0x1463
        L_0x1443:
            boolean r1 = r5.A02()
            if (r1 != 0) goto L_0x144c
            r1 = 37
            goto L_0x143f
        L_0x144c:
            boolean r1 = r5.A03()
            if (r1 != 0) goto L_0x1455
            r1 = 35
            goto L_0x143f
        L_0x1455:
            boolean r1 = r5.A05()
            if (r1 != 0) goto L_0x1463
            r1 = 36
            goto L_0x143f
        L_0x145e:
            java.lang.String r1 = "gdrive/backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x1463:
            r0.A06(r6)
            goto L_0x1271
        L_0x1468:
            r0 = move-exception
            monitor-exit(r26)
            throw r0
        L_0x146b:
            r10 = move-exception
            X.A84.A03()
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Locale r9 = java.util.Locale.ENGLISH
            java.lang.Object[] r2 = new java.lang.Object[r6]
            long r4 = r0 - r18
            double r7 = (double) r4
            double r7 = r7 / r21
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            java.lang.Object[] r6 = X.C108945cZ.A1b(r7, r2, r11, r6)
            r2 = r39
            X.C108955ca.A1W(r2, r9, r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r3.A0o = r2
            long r0 = r0 - r23
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.A0m = r2
            android.content.SharedPreferences r2 = r67.A07()
            java.lang.String r6 = "backup_overall_exec_time"
            long r4 = X.C17890vO.A05(r2, r6)
            long r0 = r0 + r4
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3.A0l = r2
            android.content.SharedPreferences r2 = r67.A07()
            X.AnonymousClass8BW.A12(r2, r6, r0)
            throw r10
        L_0x14b0:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20463AMa.A07():boolean");
    }

    public static void A03(C171878sQ r4, AtomicLong atomicLong, AtomicLong atomicLong2) {
        r4.A0H = Double.valueOf((double) atomicLong.get());
        r4.A0P = Double.valueOf((double) atomicLong2.get());
    }

    public final void A05(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String A062 = C41361wE.A06(this.A0P, AnonymousClass8BS.A0T(it));
            if (this.A0b.get(A062) == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("gdrive/backup/files/");
                A10.append(str);
                C17890vO.A19(A10, "/cancel-backup");
                throw new C167628gh(AnonymousClass001.A1H("Message store backup files are not backed up, file: ", A062, AnonymousClass000.A10()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x00f3, code lost:
        if (r62 != false) goto L_0x00f5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20463AMa(X.C218617r r30, X.AnonymousClass1NW r31, X.AnonymousClass1NP r32, X.C192369oH r33, X.C19947A0e r34, X.AnonymousClass1NO r35, X.AnonymousClass1NT r36, X.C36801oU r37, X.C175238yN r38, X.AMX r39, X.C199349zq r40, X.C19948A0f r41, X.C36821oW r42, X.A0L r43, X.A7X r44, X.B76 r45, X.AnonymousClass1L7 r46, X.AnonymousClass1NM r47, X.AnonymousClass11P r48, X.C19830z4 r49, X.C27431Wb r50, X.AnonymousClass1Cd r51, X.C18030ve r52, X.AnonymousClass18K r53, X.C171878sQ r54, X.AnonymousClass1OZ r55, X.AnonymousClass1Q5 r56, X.AnonymousClass00H r57, java.lang.String r58, java.util.List r59, java.util.concurrent.atomic.AtomicLong r60, java.util.concurrent.atomic.AtomicLong r61, boolean r62, boolean r63) {
        /*
            r29 = this;
            r8 = r52
            r12 = r48
            r16 = r46
            r7 = r53
            r28 = r30
            r1 = r16
            r0 = r28
            X.C18070vi.A0w(r12, r8, r0, r7, r1)
            r13 = r47
            r5 = r56
            r6 = r55
            r23 = r36
            r20 = r39
            r1 = r23
            r0 = r20
            X.C18070vi.A0x(r6, r1, r5, r0, r13)
            r9 = r51
            r10 = r50
            r11 = r49
            r17 = r43
            r18 = r41
            r1 = r18
            r0 = r17
            X.C18070vi.A0y(r10, r9, r1, r11, r0)
            r4 = r57
            r27 = r31
            r26 = r32
            r24 = r35
            r2 = r24
            r1 = r27
            r0 = r26
            X.C18070vi.A0t(r2, r1, r4, r0)
            r19 = r40
            r25 = r33
            r1 = r19
            r0 = r25
            X.AnonymousClass8BW.A1J(r0, r1)
            r1 = 22
            r22 = r37
            r0 = r22
            X.C18070vi.A0d(r0, r1)
            r0 = 24
            r3 = r59
            X.C18070vi.A0d(r3, r0)
            r0 = 25
            r2 = r60
            X.C18070vi.A0d(r2, r0)
            r0 = 26
            r1 = r61
            X.C18070vi.A0d(r1, r0)
            r0 = 28
            r15 = r42
            X.C18070vi.A0d(r15, r0)
            r14 = 30
            r21 = r38
            r0 = r21
            X.C18070vi.A0d(r0, r14)
            r0 = 31
            r14 = r54
            X.C18070vi.A0d(r14, r0)
            r0 = r29
            r0.<init>()
            r0.A0R = r12
            r0.A0V = r8
            r8 = r28
            r0.A0A = r8
            r0.A0W = r7
            r7 = r16
            r0.A0P = r7
            r0.A0Y = r6
            r6 = r23
            r0.A0G = r6
            r0.A0k = r5
            r5 = r20
            r0.A0J = r5
            r0.A0Q = r13
            r0.A0T = r10
            r0.A0U = r9
            r5 = r18
            r0.A0L = r5
            r0.A0S = r11
            r5 = r17
            r0.A0N = r5
            r5 = r24
            r0.A0F = r5
            r5 = r27
            r0.A0B = r5
            r0.A0Z = r4
            r4 = r26
            r0.A0C = r4
            r4 = r25
            r0.A0D = r4
            r4 = r19
            r0.A0K = r4
            r4 = r22
            r0.A0H = r4
            r4 = r58
            r0.A0a = r4
            r0.A0l = r3
            r0.A0g = r2
            r0.A0e = r1
            r1 = r44
            r0.A0O = r1
            r0.A0M = r15
            r2 = r62
            r0.A0h = r2
            r1 = r21
            r0.A0I = r1
            r0.A0X = r14
            r1 = r34
            r0.A0E = r1
            r1 = r45
            r0.A0j = r1
            r4 = 0
            if (r63 == 0) goto L_0x00f5
            r1 = 1
            if (r62 == 0) goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            r0.A0i = r1
            r2 = 0
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>(r2)
            r0.A0f = r1
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r1.<init>(r4)
            r0.A0c = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>(r2)
            r0.A0d = r1
            java.util.concurrent.ConcurrentHashMap r1 = X.AnonymousClass8BR.A17()
            r0.A0b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20463AMa.<init>(X.17r, X.1NW, X.1NP, X.9oH, X.A0e, X.1NO, X.1NT, X.1oU, X.8yN, X.AMX, X.9zq, X.A0f, X.1oW, X.A0L, X.A7X, X.B76, X.1L7, X.1NM, X.11P, X.0z4, X.1Wb, X.1Cd, X.0ve, X.18K, X.8sQ, X.1OZ, X.1Q5, X.00H, java.lang.String, java.util.List, java.util.concurrent.atomic.AtomicLong, java.util.concurrent.atomic.AtomicLong, boolean, boolean):void");
    }
}
