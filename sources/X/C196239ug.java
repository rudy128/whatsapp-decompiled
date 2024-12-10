package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.9ug  reason: invalid class name and case insensitive filesystem */
public class C196239ug {
    public A7X A00;
    public C171878sQ A01;
    public C171638s2 A02;
    public C171678s6 A03;
    public String A04;
    public C171688s7 A05;
    public final AnonymousClass1NP A06;
    public final C36801oU A07;
    public final C36841oY A08;
    public final C36821oW A09 = new C167528gW(this, 0);
    public final C36821oW A0A = new C167528gW(this, 1);
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final Object A0D = C17880vN.A0p();
    public final AnonymousClass181 A0E;
    public final AnonymousClass1NW A0F;
    public final AnonymousClass1NT A0G;
    public final C36861oa A0H;
    public final C19948A0f A0I;
    public final AnonymousClass11E A0J;
    public final AnonymousClass1L7 A0K;
    public final AnonymousClass118 A0L;
    public final C19830z4 A0M;
    public final C18030ve A0N;
    public final C195939uB A0O;
    public final AnonymousClass1NL A0P;
    public final AnonymousClass11W A0Q;
    public final AnonymousClass10I A0R;

    public A7X A00() {
        A7X a7x;
        synchronized (this.A0D) {
            a7x = this.A00;
        }
        return a7x;
    }

    public A7X A01(String str, String str2) {
        A7X a7x;
        synchronized (this.A0D) {
            Pair pair = A7X.A0J;
            Context context = this.A0L.A00;
            C18030ve r11 = this.A0N;
            AnonymousClass11W r14 = this.A0Q;
            AnonymousClass181 r5 = this.A0E;
            AnonymousClass1L7 r10 = this.A0K;
            AnonymousClass1NT r7 = this.A0G;
            C195939uB r12 = this.A0O;
            a7x = new A7X(context, r5, this.A0F, r7, this.A0I, this.A0J, r10, r11, r12, this.A0P, r14, this.A0R, str, str2);
            this.A00 = a7x;
        }
        return a7x;
    }

    public C171688s7 A02() {
        C171688s7 r0;
        synchronized (this.A0D) {
            r0 = this.A05;
            if (r0 == null) {
                r0 = new C171688s7();
                this.A05 = r0;
            }
        }
        return r0;
    }

    public void A03() {
        synchronized (this.A0D) {
            A7X a7x = this.A00;
            if (a7x != null) {
                synchronized (a7x) {
                    Log.i("gdrive-api/cancel");
                    a7x.A00 = true;
                    a7x.A09(false);
                }
            }
        }
        ((AnonymousClass1O1) this.A0B.get()).A01("gdrive_backup", false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r5 = this;
            java.lang.String r0 = "gdrive-service/cancel-pending-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NP r3 = r5.A06
            X.00H r0 = X.C20134A8u.A00
            int r0 = r3.A05()
            boolean r0 = X.C17890vO.A1R(r0)
            java.lang.String r1 = "gdrive-service/drive-api/null"
            r2 = 0
            if (r0 != 0) goto L_0x00ba
            X.1oU r4 = r5.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0P
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x00ba
            boolean r0 = X.C20134A8u.A07(r3)
            if (r0 == 0) goto L_0x0090
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0R
            r0.getAndSet(r2)
            android.os.ConditionVariable r0 = r4.A0G
            r0.open()
            X.A7X r0 = r5.A00()
            if (r0 == 0) goto L_0x007b
            java.lang.String r0 = "gdrive-service/cancel-media-restore/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A03()
            android.os.ConditionVariable r0 = r4.A0F
            r0.open()
            android.os.ConditionVariable r0 = r4.A0C
            r0.open()
            X.00H r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.8yN r1 = (X.C175238yN) r1
            java.lang.String r0 = "restore>GoogleBackupRestoreObservable/notify-media-restore-cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            r1.A01 = r0
            r0 = 14
            X.C20735AWq.A00(r1, r0)
        L_0x005d:
            r3.A0H(r2)
        L_0x0060:
            r0 = 10
            r5.A05(r0)
            X.0z4 r3 = r5.A0M
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r1 = "gdrive_user_initiated_backup"
            boolean r0 = r0.getBoolean(r1, r2)
            if (r0 == 0) goto L_0x007a
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r3)
            X.C17880vN.A1F(r0, r1, r2)
        L_0x007a:
            return
        L_0x007b:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.ConditionVariable r0 = r4.A0F
            r0.open()
            android.os.ConditionVariable r0 = r4.A0C
            r0.open()
            X.10I r1 = r5.A0R
            r0 = 28
            X.C21457AkO.A01(r1, r5, r0)
            goto L_0x0060
        L_0x0090:
            int r1 = r3.A05()
            r0 = 3
            if (r1 != r0) goto L_0x00b4
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0S
            r0.getAndSet(r2)
            android.os.ConditionVariable r0 = r4.A0G
            r0.open()
            r5.A03()
            android.os.ConditionVariable r0 = r4.A0E
            r0.open()
            android.os.ConditionVariable r0 = r4.A0B
            r0.open()
            X.1oa r0 = r5.A0H
            r0.A05()
            goto L_0x005d
        L_0x00b4:
            java.lang.String r0 = "gdrive-service/cancel/nothing-to-cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0060
        L_0x00ba:
            X.1oU r4 = r5.A07
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0P
            r0.getAndSet(r2)
            X.A84.A02()
            android.os.ConditionVariable r0 = r4.A0G
            r0.open()
            X.A7X r0 = r5.A00()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "gdrive-service/cancel-backup/interrupt-drive-api"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A03()
            android.os.ConditionVariable r0 = r4.A0D
            r0.open()
            android.os.ConditionVariable r0 = r4.A0A
            r0.open()
        L_0x00e1:
            X.1oa r0 = r5.A0H
            r0.A05()
            r4.A04 = r2
            goto L_0x005d
        L_0x00ea:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            android.os.ConditionVariable r0 = r4.A0D
            r0.open()
            android.os.ConditionVariable r0 = r4.A0A
            r0.open()
            X.10I r1 = r5.A0R
            r0 = 27
            X.C21457AkO.A01(r1, r5, r0)
            goto L_0x00e1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196239ug.A04():void");
    }

    public C196239ug(AnonymousClass181 r3, AnonymousClass1NW r4, AnonymousClass1NP r5, AnonymousClass1NT r6, C36801oU r7, C36841oY r8, C36861oa r9, C19948A0f a0f, AnonymousClass11E r11, AnonymousClass1L7 r12, AnonymousClass118 r13, C19830z4 r14, C18030ve r15, C195939uB r16, AnonymousClass1NL r17, AnonymousClass11W r18, AnonymousClass10I r19, AnonymousClass00H r20, AnonymousClass00H r21) {
        this.A0L = r13;
        this.A0N = r15;
        this.A0Q = r18;
        this.A0R = r19;
        this.A0E = r3;
        this.A0K = r12;
        this.A0G = r6;
        this.A0O = r16;
        this.A0I = a0f;
        this.A0M = r14;
        this.A0P = r17;
        this.A0B = r20;
        this.A0F = r4;
        this.A06 = r5;
        this.A0J = r11;
        this.A07 = r7;
        this.A0C = r21;
        this.A0H = r9;
        this.A08 = r8;
    }

    public void A05(int i) {
        String str;
        C171678s6 r0;
        AnonymousClass10T r2;
        Bundle bundle;
        int i2;
        C171638s2 r1;
        C171878sQ r12;
        String A032 = C41361wE.A03(i);
        if (i != 10) {
            TextUtils.join("\n", Thread.currentThread().getStackTrace());
            C17900vP.A0e("gdrive-service/set-error/", A032, AnonymousClass000.A10());
        }
        AnonymousClass1NP r7 = this.A06;
        r7.A0F(i);
        Object obj = this.A0D;
        synchronized (obj) {
            str = this.A04;
        }
        if (C20134A8u.A07(r7) || "action_restore_media".equals(str)) {
            C20739AWu.A00(C17880vN.A0V(this.A0C), this.A08.A00(), i, 3);
            C171688s7 A022 = A02();
            Integer valueOf = Integer.valueOf(C41361wE.A00(i));
            A022.A0A = valueOf;
            synchronized (obj) {
                r0 = this.A03;
                if (r0 == null) {
                    r0 = new C171678s6();
                    this.A03 = r0;
                }
            }
            r0.A07 = valueOf;
            return;
        }
        if (r7.A05() == 3 || "action_restore".equals(str)) {
            synchronized (obj) {
                r1 = this.A02;
                if (r1 == null) {
                    r1 = new C171638s2();
                    this.A02 = r1;
                }
            }
            r1.A07 = Integer.valueOf(C41361wE.A00(i));
            r2 = C17880vN.A0V(this.A0C);
            bundle = this.A08.A00();
            i2 = 2;
        } else {
            if (C17890vO.A1R(r7.A05()) || "action_backup".equals(str)) {
                synchronized (obj) {
                    r12 = this.A01;
                }
                if (r12 != null && r12.A0b == null) {
                    AnonymousClass8BR.A1G(r12, C41361wE.A00(i));
                }
            } else if (str != null) {
                if (i != 10) {
                    C17900vP.A0e("gdrive-service/set-error/unexpected-service-start-action/", str, AnonymousClass000.A10());
                    return;
                }
                return;
            } else if (i != 10) {
                Log.e("gdrive-service/set-error/unexpected-service-start-action/null", new Throwable());
                return;
            } else {
                Log.i("gdrive-service/set-error/action-is-null and nothing is pending (probably backup attempt failed)");
            }
            r2 = C17880vN.A0V(this.A0C);
            bundle = this.A08.A00();
            i2 = 1;
        }
        C20739AWu.A00(r2, bundle, i, i2);
    }
}
