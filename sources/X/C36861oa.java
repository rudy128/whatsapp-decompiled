package X;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1oa  reason: invalid class name and case insensitive filesystem */
public final class C36861oa implements C36851oZ, AnonymousClass11J {
    public int A00;
    public BroadcastReceiver A01;
    public boolean A02;
    public boolean A03;
    public int A04;
    public int A05 = 0;
    public long A06;
    public long A07;
    public BroadcastReceiver A08;
    public BroadcastReceiver A09;
    public BroadcastReceiver A0A;
    public BroadcastReceiver A0B;
    public String A0C;
    public boolean A0D;
    public final C36801oU A0E;
    public final AnonymousClass11E A0F;
    public final AnonymousClass118 A0G;
    public final C27301Vn A0H;
    public final C18030ve A0I;
    public final AnonymousClass19K A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass00H A0L;
    public final AtomicReference A0M = new AtomicReference(10);
    public final Handler A0N = new Handler(Looper.getMainLooper());
    public final C36841oY A0O;
    public final AnonymousClass11P A0P;
    public final C19830z4 A0Q;
    public final C18000vb A0R;
    public final AnonymousClass10I A0S;
    public final AnonymousClass00H A0T;
    public volatile Notification A0U;

    public void A05() {
        this.A0U = null;
        C27301Vn r2 = this.A0H;
        r2.BEJ(5, "GoogleDriveNotificationManager1");
        r2.BEJ(46, "GoogleDriveNotificationManager1");
    }

    public synchronized void A06() {
        int i = this.A05 + 1;
        this.A05 = i;
        if (i <= 1) {
            Log.i("gdrive-notification-manager/register");
            this.A0M.set(10);
            this.A03 = false;
            this.A02 = false;
            this.A0D = false;
            this.A04 = 0;
            this.A00 = 0;
            this.A06 = 0;
            this.A07 = 0;
            this.A0C = null;
            if (this.A0U != null) {
                Log.w("gdrive-notification-manager/register lastNotification is not null");
            }
            this.A0U = null;
            this.A0N.post(new C21457AkO((Object) this, 32));
            this.A0O.A01(this);
        }
    }

    public synchronized void A07() {
        Notification notification = this.A0U;
        Integer num = (Integer) this.A0M.get();
        if (!(notification == null || num == null)) {
            A05();
            int intValue = num.intValue();
            if ((intValue == 15 || intValue == 27) && A08(this.A03)) {
                Log.i("gdrive-notification-manager/re-posting important notification");
                this.A0H.BkR(46, notification);
            }
        }
        int i = this.A05 - 1;
        this.A05 = i;
        if (i <= 0) {
            Log.i("gdrive-notification-manager/unregister");
            this.A0N.post(new C21457AkO((Object) this, 34));
            this.A0O.A02(this);
            A02(this.A08);
            A02(this.A0A);
            A02(this.A09);
            A02(this.A0B);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(boolean r11) {
        /*
            r10 = this;
            r7 = 1
            if (r11 == 0) goto L_0x0009
            java.lang.String r0 = "gdrive-notification-manager/backup-error/backup-user-initiated/true"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r7
        L_0x0009:
            X.00H r0 = r10.A0T
            java.lang.Object r0 = r0.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            int r6 = r0.A03()
            long r8 = X.C41361wE.A01(r6)
            if (r6 == 0) goto L_0x008e
            if (r6 == r7) goto L_0x008c
            r0 = 2
            if (r6 == r0) goto L_0x003a
            r0 = 3
            if (r6 == r0) goto L_0x003a
            r0 = 4
            if (r6 == r0) goto L_0x008e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "gdrive-notification-manager/get-notification-frequency/unexpected-frequency/"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x003a:
            r2 = 2
        L_0x003b:
            X.0z4 r1 = r10.A0Q
            int r5 = r1.A0K()
            int r0 = r5 + 1
            int r0 = r0 % r2
            r2 = 1
            if (r0 == 0) goto L_0x005d
            r2 = 0
            java.lang.String r0 = r1.A0f()
            if (r0 == 0) goto L_0x0086
            long r3 = r1.A0U(r0)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r3
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            r7 = 0
        L_0x005c:
            r2 = r7
        L_0x005d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "gdrive-notification-manager/backup-error/frequency="
            r1.append(r0)
            java.lang.String r0 = X.C41361wE.A04(r6)
            r1.append(r0)
            java.lang.String r0 = "/success-backup-fail-count="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "/show-notification="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r2
        L_0x0086:
            java.lang.String r0 = "gdrive-notification-manager/backup-error/google-account-is-null/unexpected"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x005d
        L_0x008c:
            r2 = 5
            goto L_0x003b
        L_0x008e:
            r2 = 1
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36861oa.A08(boolean):boolean");
    }

    public void Bkn(boolean z) {
    }

    public synchronized void BmE(boolean z) {
        C139316yd r3;
        synchronized (this) {
            AtomicReference atomicReference = this.A0M;
            int intValue = ((Integer) atomicReference.get()).intValue();
            if (intValue != 23 && (z || intValue != 15)) {
                if (!A08(this.A03)) {
                    atomicReference.set(23);
                }
                Log.i("gdrive-notification-manager/backup-end");
                this.A04 = 0;
                Context context = this.A0G.A00;
                int i = 2131890670;
                if (z) {
                    i = 2131890671;
                }
                String string = context.getString(i);
                String string2 = context.getString(2131890668);
                C18030ve r2 = this.A0I;
                AnonymousClass00H r0 = C20134A8u.A00;
                if (C18020vd.A05(C18040vf.A02, r2, 603)) {
                    C161128Bv r22 = new C161128Bv(this, 5);
                    if (this.A01 != null) {
                        ((C29831cw) this.A0K.get()).A02(this.A01, context);
                    }
                    this.A01 = r22;
                    ((C29831cw) this.A0K.get()).A00(context, this.A01, new IntentFilter("clear_backup_worker"), C19620yd.A0B, (Handler) null, false);
                    r3 = new C139316yd(2131231822, context.getString(2131890807), A00("clear_backup_worker"));
                } else {
                    r3 = null;
                }
                A03(r3, this, string, string2, 1, -1, false, true);
            }
        }
    }

    public void BmH(long j, long j2) {
        int i;
        if (((Number) this.A0M.getAndSet(20)).intValue() != 20) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-missing");
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0G.A00;
            A03((C139316yd) null, this, context.getString(2131890680), context.getString(2131892324), 3, i, false, false);
        }
    }

    public void BmI(long j, long j2) {
        int i;
        if (((Number) this.A0M.getAndSet(19)).intValue() != 19) {
            Log.i("gdrive-notification-manager/backup-paused-for-sdcard-unmounted");
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0G.A00;
            A03((C139316yd) null, this, context.getString(2131890680), context.getString(2131892326), 3, i, false, false);
        }
    }

    public void BmJ(long j, long j2) {
        C139316yd r4;
        int i;
        if (((Number) this.A0M.getAndSet(16)).intValue() != 16) {
            Log.i("gdrive-notification-manager/backup-paused-wifi-unavailable");
            if (this.A08 == null) {
                this.A08 = new C161128Bv(this, 3);
                ((C29831cw) this.A0K.get()).A00(this.A0G.A00, this.A08, new IntentFilter("enable_backup_over_cellular"), C19620yd.A0B, (Handler) null, false);
            }
            if (this.A0F.A03(true) == 2) {
                r4 = new C139316yd(2131232241, this.A0G.A00.getString(2131890696), A00("enable_backup_over_cellular"));
            } else {
                r4 = null;
            }
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0G.A00;
            A03(r4, this, context.getString(2131890680), context.getString(2131890701), 3, i, false, false);
        }
    }

    public void BmK(int i) {
        AtomicReference atomicReference = this.A0M;
        boolean z = false;
        if (((Number) atomicReference.get()).intValue() != 12) {
            z = true;
        }
        if (((Number) atomicReference.getAndSet(12)).intValue() != 12 || System.currentTimeMillis() - this.A07 >= 200) {
            this.A07 = System.currentTimeMillis();
            Context context = this.A0G.A00;
            String string = context.getString(2131899057);
            int i2 = i;
            if (i >= 0 || z) {
                A03((C139316yd) null, this, string, context.getString(2131890669, new Object[]{this.A0R.A0M().format(((double) i2) / 100.0d)}), 2, -1, true, false);
            }
        }
    }

    public void BmL() {
        if (((Number) this.A0M.getAndSet(11)).intValue() != 11) {
            Log.i("gdrive-notification-manager/backup-prep-start");
            Context context = this.A0G.A00;
            A03((C139316yd) null, this, context.getString(2131899057), context.getString(2131899055), 2, -1, true, false);
        }
    }

    public void Bsb() {
    }

    public synchronized void BtJ(int i) {
        synchronized (this) {
            if (i != 10) {
                if (((Integer) this.A0M.getAndSet(15)).intValue() != 15) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-notification-manager/backup-error/");
                    sb.append(C41361wE.A03(i));
                    Log.i(sb.toString());
                    if (A08(this.A03)) {
                        Context context = this.A0G.A00;
                        String string = context.getString(2131890670);
                        int i2 = 2131890668;
                        if (i == 13) {
                            i2 = 2131886956;
                        }
                        A03((C139316yd) null, this, string, context.getString(i2), 1, -1, false, true);
                    }
                }
            }
        }
    }

    public void Bxz(long j, boolean z) {
        String str;
        if (((Number) this.A0M.getAndSet(33)).intValue() != 33) {
            StringBuilder sb = new StringBuilder();
            sb.append("gdrive-notification-manager/restore-end/");
            if (z) {
                str = "success";
            } else {
                str = "failed";
            }
            sb.append(str);
            sb.append(" restored: ");
            sb.append(j);
            Log.i(sb.toString());
        }
        if (!z || j != 0) {
            Context context = this.A0G.A00;
            A03((C139316yd) null, this, context.getString(2131890704), context.getString(2131890697, new Object[]{C88584aA.A03(this.A0R, j)}), 1, -1, false, true);
            return;
        }
        A05();
    }

    public void By0(long j, long j2) {
        int i;
        if (((Number) this.A0M.getAndSet(29)).intValue() != 29) {
            Log.i("gdrive-notification-manager/restore-paused-data-unavailable");
            Context context = this.A0G.A00;
            String string = context.getString(2131890705);
            String string2 = context.getString(2131890700);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A03((C139316yd) null, this, string, string2, 3, i, false, true);
        }
    }

    public void By1(long j, long j2) {
        int i;
        if (((Number) this.A0M.getAndSet(30)).intValue() != 30) {
            Log.i("gdrive-notification-manager/restore-paused-for-battery");
            if (this.A0B == null) {
                this.A0B = new C161128Bv(this, 7);
                ((C29831cw) this.A0K.get()).A00(this.A0G.A00, this.A0B, new IntentFilter("enable_restore_over_low_battery"), C19620yd.A0B, (Handler) null, false);
            }
            Context context = this.A0G.A00;
            C139316yd r5 = new C139316yd(2131232241, context.getString(2131890696), A00("enable_restore_over_low_battery"));
            String string = context.getString(2131890705);
            String string2 = context.getString(2131890699);
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A03(r5, this, string, string2, 3, i, false, true);
        }
    }

    public void By2(long j, long j2) {
        int i;
        if (((Number) this.A0M.getAndSet(32)).intValue() != 32) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-missing");
            Context context = this.A0G.A00;
            String string = context.getString(2131890705);
            String string2 = context.getString(2131892324);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A03((C139316yd) null, this, string, string2, 3, i, false, true);
        }
    }

    public void By3(long j, long j2) {
        int i;
        if (((Number) this.A0M.getAndSet(31)).intValue() != 31) {
            Log.i("gdrive-notification-manager/restore-paused-sdcard-unmounted");
            A05();
            Context context = this.A0G.A00;
            String string = context.getString(2131890705);
            String string2 = context.getString(2131892326);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A03((C139316yd) null, this, string, string2, 3, i, false, true);
        }
    }

    public synchronized void By5(int i) {
        synchronized (this) {
            Context context = this.A0G.A00;
            String string = context.getString(2131899059);
            AtomicReference atomicReference = this.A0M;
            if (((Integer) atomicReference.get()).intValue() != 25 || System.currentTimeMillis() - this.A06 >= 200) {
                this.A06 = System.currentTimeMillis();
                boolean z = false;
                if (((Integer) atomicReference.getAndSet(25)).intValue() != 25) {
                    z = true;
                }
                int i2 = i;
                if (i > 0 || z) {
                    A03((C139316yd) null, this, string, context.getString(2131890702, new Object[]{this.A0R.A0M().format(((double) i2) / 100.0d)}), 2, i2, true, false);
                }
            }
        }
    }

    public void By6() {
        Context context = this.A0G.A00;
        String string = context.getString(2131899059);
        if (((Number) this.A0M.getAndSet(24)).intValue() != 24) {
            Log.i("gdrive-notification-manager/restore-prep-start");
        }
        A03((C139316yd) null, this, string, context.getString(2131899058), 2, -1, true, false);
    }

    public void ByU(boolean z) {
    }

    public void ByV(long j, long j2) {
    }

    public void ByW() {
    }

    public void C4d() {
        if (((Number) this.A0M.getAndSet(21)).intValue() != 21) {
            Log.i("gdrive-notification-manager/backup-scrub-start");
            Context context = this.A0G.A00;
            A03((C139316yd) null, this, context.getString(2131899057), context.getString(2131895860), 2, -1, true, false);
        }
    }

    public void C9a() {
    }

    private PendingIntent A00(String str) {
        Intent intent = new Intent(str);
        intent.setPackage("com.whatsapp");
        return C1408573i.A01(this.A0G.A00, 0, intent, 0);
    }

    private C1409673t A01(String str) {
        Intent A1V;
        boolean equals = "action_restore".equals(str);
        this.A0L.get();
        Context context = this.A0G.A00;
        if (equals) {
            A1V = new Intent().setClassName(context.getPackageName(), "com.whatsapp.backup.google.RestoreFromBackupActivity");
            A1V.setAction("action_show_restore_one_time_setup");
            A1V.setAction((String) null);
            A1V.addFlags(A7Y.A0F);
        } else {
            C18070vi.A0d(context, 0);
            A1V = AnonymousClass1LU.A1V(context, (String) null, (String) null, 2);
        }
        C1409673t A032 = C217217d.A03(context);
        A032.A0M = "chat_history_backup@1";
        A032.A0A = C1408573i.A00(context, 0, A1V, 0);
        A032.A08.icon = 2131231578;
        A032.A06 = 1;
        return A032;
    }

    private void A02(BroadcastReceiver broadcastReceiver) {
        if (broadcastReceiver != null) {
            try {
                ((C29831cw) this.A0K.get()).A02(broadcastReceiver, this.A0G.A00);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    public static void A03(C139316yd r5, C36861oa r6, String str, String str2, int i, int i2, boolean z, boolean z2) {
        r6.A0C = str2;
        if (r6.A0D) {
            r6.A05();
        }
        C1409673t A012 = r6.A01((String) null);
        boolean z3 = true;
        if (i == 1) {
            A012.A07(0, 0, false);
        } else if (i != 2) {
            A012.A07(100, i2, false);
        } else {
            A012.A07(100, i2, true);
        }
        A012.A0G(z2);
        A012.A0H(z);
        A012.A0E(str);
        A012.A0D(str2);
        r6.A02 = z;
        if (r5 == null) {
            z3 = false;
        }
        r6.A0D = z3;
        if (r5 != null) {
            A012.A0Q.add(r5);
        }
        Notification A052 = A012.A05();
        r6.A0U = A052;
        r6.A0H.BkR(5, A052);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if ("action_delete".equals(r6) == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if ("action_restore_media".equals(r6) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A04(android.content.res.Resources r5, java.lang.String r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.C17990va
            if (r0 == 0) goto L_0x0008
            X.0va r5 = (X.C17990va) r5
            android.content.res.Resources r5 = r5.A00
        L_0x0008:
            X.73t r2 = r4.A01(r6)
            java.lang.String r0 = "action_restore"
            boolean r3 = r0.equals(r6)
            if (r3 != 0) goto L_0x001f
            java.lang.String r0 = "action_restore_media"
            boolean r1 = r0.equals(r6)
            r0 = 2131899057(0x7f1232b1, float:1.943305E38)
            if (r1 == 0) goto L_0x0022
        L_0x001f:
            r0 = 2131899059(0x7f1232b3, float:1.9433053E38)
        L_0x0022:
            java.lang.String r0 = r5.getString(r0)
            r2.A0E(r0)
            java.lang.String r0 = "action_backup"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x004e
            if (r3 != 0) goto L_0x005d
            java.lang.String r0 = "action_restore_media"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = "action_change_number"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x004e
            java.lang.String r0 = "action_delete"
            boolean r0 = r0.equals(r6)
            r1 = 2131898875(0x7f1231fb, float:1.943268E38)
            if (r0 != 0) goto L_0x0051
        L_0x004e:
            r1 = 2131899055(0x7f1232af, float:1.9433045E38)
        L_0x0051:
            java.lang.String r0 = r5.getString(r1)
            r2.A0D(r0)
            android.app.Notification r0 = r2.A05()
            return r0
        L_0x005d:
            r1 = 2131899058(0x7f1232b2, float:1.9433051E38)
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36861oa.A04(android.content.res.Resources, java.lang.String):android.app.Notification");
    }

    public void BmF(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-data-connection");
        if (((Number) this.A0M.getAndSet(17)).intValue() != 17) {
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            Context context = this.A0G.A00;
            A03((C139316yd) null, this, context.getString(2131890680), context.getString(2131890700), 3, i, false, false);
        }
    }

    public void BmG(long j, long j2) {
        int i;
        Log.i("gdrive-notification-manager/backup-paused-for-low-battery");
        if (((Number) this.A0M.getAndSet(18)).intValue() != 18) {
            if (this.A09 == null) {
                this.A09 = new C161128Bv(this, 4);
                ((C29831cw) this.A0K.get()).A00(this.A0G.A00, this.A09, new IntentFilter("enable_backup_over_low_battery"), C19620yd.A0B, (Handler) null, false);
            }
            Context context = this.A0G.A00;
            C139316yd r5 = new C139316yd(2131232241, context.getString(2131890696), A00("enable_backup_over_low_battery"));
            if (j2 > 0) {
                i = (int) ((100 * j) / j2);
            } else {
                i = -1;
            }
            A03(r5, this, context.getString(2131890680), context.getString(2131890699), 3, i, false, false);
        }
    }

    public synchronized void BmM(long j, long j2) {
        int i;
        synchronized (this) {
            AtomicReference atomicReference = this.A0M;
            boolean z = false;
            if (((Integer) atomicReference.get()).intValue() != 14) {
                z = true;
            }
            if (((Integer) atomicReference.getAndSet(14)).intValue() != 14 || System.currentTimeMillis() - this.A07 >= 200) {
                this.A07 = System.currentTimeMillis();
                long j3 = j2;
                long j4 = j;
                if (j2 > 0) {
                    i = (int) ((100 * j) / j2);
                } else {
                    i = 0;
                }
                if (i - this.A04 > 0 || z) {
                    Log.i(String.format(Locale.ENGLISH, "gdrive-notification-manager/backup-progress %d/%d (%d)", new Object[]{Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(i)}));
                    this.A04 = i;
                    Context context = this.A0G.A00;
                    String string = context.getString(2131899057);
                    C18000vb r7 = this.A0R;
                    String string2 = context.getString(2131895877, new Object[]{C88584aA.A03(r7, j4), C88584aA.A03(r7, j3), r7.A0M().format(((double) i) / 100.0d)});
                    if (!string2.equals(this.A0C)) {
                        A03((C139316yd) null, this, string, string2, 3, i, true, false);
                    }
                }
            }
        }
    }

    public void BmN() {
        this.A0M.getAndSet(13);
    }

    public void Bps(C59732mn r4) {
        this.A0S.CGF(new C21457AkO((Object) this, 33));
    }

    public void BtK(int i, Bundle bundle) {
        if (i != 10) {
            if (((Number) this.A0M.getAndSet(27)).intValue() != 27) {
                StringBuilder sb = new StringBuilder();
                sb.append("gdrive-notification-manager/media-restore-error/");
                sb.append(C41361wE.A03(i));
                Log.i(sb.toString());
                Context context = this.A0G.A00;
                A03((C139316yd) null, this, context.getString(2131890703), context.getString(2131890668), 1, -1, false, true);
            }
        }
    }

    public void BtL(int i, Bundle bundle) {
        StringBuilder sb = new StringBuilder();
        sb.append("gdrive-notification-manager/msgstore-restore-error/");
        sb.append(C41361wE.A03(i));
        Log.i(sb.toString());
    }

    public void By4(long j, long j2) {
        C139316yd r4;
        int i;
        if (((Number) this.A0M.getAndSet(28)).intValue() != 28) {
            Log.i("gdrive-notification-manager/restore-paused-wifi-unavailable");
            if (this.A0A == null) {
                this.A0A = new C161128Bv(this, 6);
                ((C29831cw) this.A0K.get()).A00(this.A0G.A00, this.A0A, new IntentFilter("enable_restore_over_cellular"), C19620yd.A0B, (Handler) null, false);
            }
            if (this.A0F.A03(true) == 2) {
                r4 = new C139316yd(2131232241, this.A0G.A00.getString(2131890696), A00("enable_restore_over_cellular"));
            } else {
                r4 = null;
            }
            Context context = this.A0G.A00;
            String string = context.getString(2131890705);
            String string2 = context.getString(2131890701);
            if (j2 > 0) {
                i = (int) ((j * 100) / j2);
            } else {
                i = -1;
            }
            A03(r4, this, string, string2, 3, i, false, true);
        }
    }

    public synchronized void By7(long j, long j2) {
        int i;
        synchronized (this) {
            Context context = this.A0G.A00;
            String string = context.getString(2131899059);
            AtomicReference atomicReference = this.A0M;
            if (((Integer) atomicReference.get()).intValue() != 26 || System.currentTimeMillis() - this.A07 >= 200) {
                this.A07 = System.currentTimeMillis();
                long j3 = j;
                long j4 = j2;
                if (((Integer) atomicReference.getAndSet(26)).intValue() != 26) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("gdrive-notification-manager/restore-progress ");
                    sb.append(j3);
                    sb.append("/");
                    sb.append(j4);
                    sb.append(" bytes.");
                    Log.i(sb.toString());
                }
                if (j2 > 0) {
                    i = (int) ((100 * j) / j2);
                } else {
                    i = -1;
                }
                this.A00 = i;
                C18000vb r7 = this.A0R;
                String string2 = context.getString(2131890698, new Object[]{C88584aA.A03(r7, j3), C88584aA.A03(r7, j4), r7.A0M().format(((double) this.A00) / 100.0d)});
                if (!string2.equals(this.A0C)) {
                    A03((C139316yd) null, this, string, string2, 3, this.A00, true, false);
                }
            }
        }
    }

    public C36861oa(C36801oU r3, C36841oY r4, AnonymousClass11E r5, AnonymousClass11P r6, AnonymousClass118 r7, C27301Vn r8, C19830z4 r9, C18000vb r10, C18030ve r11, AnonymousClass10I r12, AnonymousClass19K r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16) {
        this.A0G = r7;
        this.A0P = r6;
        this.A0I = r11;
        this.A0L = r14;
        this.A0S = r12;
        this.A0R = r10;
        this.A0J = r13;
        this.A0Q = r9;
        this.A0K = r15;
        this.A0H = r8;
        this.A0T = r16;
        this.A0F = r5;
        this.A0E = r3;
        this.A0O = r4;
    }

    public void BmD() {
        A05();
    }

    public void Bxy() {
        A05();
    }
}
