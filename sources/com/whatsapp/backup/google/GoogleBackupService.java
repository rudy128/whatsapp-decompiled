package com.whatsapp.backup.google;

import X.A0L;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass18K;
import X.AnonymousClass19D;
import X.AnonymousClass19K;
import X.AnonymousClass1Cd;
import X.AnonymousClass1DK;
import X.AnonymousClass1KB;
import X.AnonymousClass1L7;
import X.AnonymousClass1NM;
import X.AnonymousClass1NT;
import X.AnonymousClass1NW;
import X.AnonymousClass1ST;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4aW;
import X.C000200d;
import X.C008503u;
import X.C175238yN;
import X.C17880vN;
import X.C18030ve;
import X.C192369oH;
import X.C195939uB;
import X.C196239ug;
import X.C19830z4;
import X.C199349zq;
import X.C19948A0f;
import X.C21457AkO;
import X.C218617r;
import X.C22611Cn;
import X.C27331Vr;
import X.C27401Vy;
import X.C27431Wb;
import X.C31221fD;
import X.C36801oU;
import X.C36841oY;
import X.C36861oa;
import X.C39571tI;
import X.C48592Nd;
import X.C72463Mc;
import android.app.Notification;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.whatsapp.Me;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GoogleBackupService extends C48592Nd {
    public C218617r A00;
    public AnonymousClass1KB A01;
    public AnonymousClass11S A02;
    public AnonymousClass1NW A03;
    public C192369oH A04;
    public AnonymousClass1NT A05;
    public C36801oU A06;
    public C196239ug A07;
    public C36841oY A08;
    public C36861oa A09;
    public C199349zq A0A;
    public C19948A0f A0B;
    public A0L A0C;
    public AnonymousClass1L7 A0D;
    public AnonymousClass1NM A0E;
    public AnonymousClass11C A0F;
    public AnonymousClass11P A0G;
    public AnonymousClass118 A0H;
    public C19830z4 A0I;
    public AnonymousClass1ST A0J;
    public C27431Wb A0K;
    public C22611Cn A0L;
    public AnonymousClass1Cd A0M;
    public AnonymousClass1DK A0N;
    public AnonymousClass19D A0O;
    public C18030ve A0P;
    public AnonymousClass18K A0Q;
    public C27331Vr A0R;
    public C27401Vy A0S;
    public AnonymousClass4aW A0T;
    public C195939uB A0U;
    public AnonymousClass10I A0V;
    public AnonymousClass19K A0W;
    public AnonymousClass00H A0X;
    public AnonymousClass00H A0Y;
    public AnonymousClass00H A0Z;
    public AnonymousClass00H A0a;
    public AnonymousClass00H A0b;
    public AnonymousClass00H A0c;
    public AnonymousClass00H A0d;
    public AnonymousClass00H A0e;
    public AnonymousClass00H A0f;
    public Map A0g;
    public Random A0h;
    public boolean A0i = false;
    public boolean A0j = false;
    public int A0k;
    public final ArrayList A0l = AnonymousClass000.A13();
    public final AtomicBoolean A0m = new AtomicBoolean(false);
    public final Binder A0n = new Binder();
    public final Object A0o = C17880vN.A0p();

    public GoogleBackupService() {
        super(GoogleBackupService.class.getCanonicalName());
    }

    private String A00() {
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        Me me = r0.A00;
        if (me == null) {
            Log.i("gdrive-service/my-jid/me is null, can't proceed");
            return null;
        }
        String str = me.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("gdrive-service/my-jid/jidUser is null, fatal error.");
        return null;
    }

    public void A08() {
        if (!this.A0i) {
            this.A0i = true;
            this.A0h = new Random();
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            this.A0G = AnonymousClass10E.A6O(r1);
            this.A0P = AnonymousClass10E.A8r(r1);
            this.A01 = AnonymousClass10E.A12(r1);
            this.A02 = AnonymousClass10E.A17(r1);
            this.A0H = AnonymousClass3MZ.A0l(r1);
            this.A0V = AnonymousClass10E.AL1(r1);
            this.A00 = (C218617r) r1.A8v.get();
            this.A0Q = AnonymousClass3Ma.A0g(r1);
            this.A0D = (AnonymousClass1L7) r1.A3t.get();
            this.A0O = C72463Mc.A0e(r1);
            this.A0a = C000200d.A00(r1.A5t);
            this.A0d = C000200d.A00(r1.A6N);
            this.A0F = AnonymousClass3Ma.A0a(r1);
            this.A0R = r1.AEK();
            this.A0W = (AnonymousClass19K) r1.AC4.get();
            this.A05 = (AnonymousClass1NT) r1.A3f.get();
            this.A0f = C000200d.A00(r1.A8O);
            AnonymousClass10G r2 = r1.A00;
            this.A0c = C000200d.A00(r2.A34);
            this.A0T = (AnonymousClass4aW) r2.A5C.get();
            this.A0E = (AnonymousClass1NM) r1.A6D.get();
            this.A0N = (AnonymousClass1DK) r1.A6s.get();
            this.A0J = (AnonymousClass1ST) r1.A6C.get();
            this.A0S = (C27401Vy) r1.AYG.get();
            this.A0K = (C27431Wb) r1.A6f.get();
            this.A0U = (C195939uB) r1.A0e.get();
            this.A07 = (C196239ug) r1.A4d.get();
            this.A0M = (AnonymousClass1Cd) r1.A6i.get();
            this.A0B = (C19948A0f) r1.A9X.get();
            this.A0I = AnonymousClass3Ma.A0c(r1);
            this.A0C = (A0L) r2.A0I.get();
            this.A0Z = C000200d.A00(r1.A3e);
            this.A03 = (AnonymousClass1NW) r1.A0h.get();
            this.A0b = C000200d.A00(r1.A5u);
            this.A0Y = C000200d.A00(r1.A0j);
            this.A04 = (C192369oH) r2.A0J.get();
            this.A0A = (C199349zq) r2.A3B.get();
            this.A0L = (C22611Cn) r1.A6h.get();
            this.A06 = (C36801oU) r1.A4c.get();
            this.A0e = C000200d.A00(r1.A4e);
            this.A09 = (C36861oa) r1.A4g.get();
            this.A08 = (C36841oY) r1.A4f.get();
            this.A0X = C000200d.A00(r1.A9q);
        }
    }

    public String A09() {
        String str;
        String A1H;
        C196239ug r0 = this.A07;
        synchronized (r0.A0D) {
            str = r0.A04;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.A09());
        if (TextUtils.isEmpty(str)) {
            A1H = "";
        } else {
            A1H = AnonymousClass001.A1H("/", str, AnonymousClass000.A10());
        }
        return AnonymousClass000.A0y(A1H, A10);
    }

    /* JADX WARNING: type inference failed for: r7v47, types: [java.lang.Object, java.util.Comparator] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:891:0x172e A[RETURN] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:694:0x12a0=Splitter:B:694:0x12a0, B:690:0x1291=Splitter:B:690:0x1291, B:686:0x1282=Splitter:B:686:0x1282, B:674:0x1253=Splitter:B:674:0x1253, B:678:0x1263=Splitter:B:678:0x1263, B:682:0x1273=Splitter:B:682:0x1273, B:709:0x12e8=Splitter:B:709:0x12e8} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:814:0x15e1=Splitter:B:814:0x15e1, B:824:0x15f2=Splitter:B:824:0x15f2, B:820:0x15eb=Splitter:B:820:0x15eb} */
    public void onHandleIntent(android.content.Intent r56) {
        /*
            r55 = this;
            r26 = 0
            r8 = r56
            if (r56 == 0) goto L_0x0030
            java.lang.String r3 = r8.getAction()
        L_0x000a:
            java.lang.String r11 = "gdrive-service/handle-intent started without an action."
            r0 = r55
            if (r3 == 0) goto L_0x0118
            java.lang.String r1 = "action_resume_restore"
            boolean r1 = r1.equals(r3)
            java.lang.String r10 = "action_restore"
            if (r1 == 0) goto L_0x002a
            X.00H r1 = r0.A0Y
            X.1NP r2 = X.AnonymousClass8BS.A0A(r1)
            X.00H r1 = X.C20134A8u.A00
            int r2 = r2.A05()
            r1 = 3
            if (r2 != r1) goto L_0x1712
            r3 = r10
        L_0x002a:
            X.9ug r2 = r0.A07
            java.lang.Object r1 = r2.A0D
            monitor-enter(r1)
            goto L_0x0033
        L_0x0030:
            r3 = r26
            goto L_0x000a
        L_0x0033:
            r2.A04 = r3     // Catch:{ all -> 0x0105 }
            monitor-exit(r1)     // Catch:{ all -> 0x0105 }
            X.1oU r1 = r0.A06
            r2 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0W
            r1.set(r2)
            X.118 r1 = r0.A0H
            android.content.Context r1 = r1.A00
            boolean r2 = X.C41361wE.A09(r1)
            r4 = 0
            X.1oU r1 = r0.A06
            if (r2 != 0) goto L_0x0052
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0W
            r1.set(r4)
            goto L_0x1717
        L_0x0052:
            r1.A08()
            X.1oU r1 = r0.A06
            r1.A07()
            X.1oU r1 = r0.A06
            r1.A0A()
            java.lang.String r1 = "backup_mode"
            java.lang.String r2 = r8.getStringExtra(r1)
            java.lang.String r1 = "user_initiated"
            boolean r6 = r1.equals(r2)
            X.0z4 r1 = r0.A0I
            if (r6 == 0) goto L_0x007d
            r5 = 1
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r1)
            java.lang.String r1 = "gdrive_user_initiated_backup"
            X.C17880vN.A1F(r2, r1, r5)
        L_0x0079:
            X.1oa r1 = r0.A09
            monitor-enter(r1)
            goto L_0x0088
        L_0x007d:
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r1)
            java.lang.String r1 = "gdrive_user_initiated_backup"
            boolean r6 = r2.getBoolean(r1, r4)
            goto L_0x0079
        L_0x0088:
            r1.A03 = r6     // Catch:{ all -> 0x0102 }
            monitor-exit(r1)
            java.lang.String r1 = "action_delete"
            boolean r9 = r3.equals(r1)
            java.lang.String r5 = "account_name"
            if (r9 == 0) goto L_0x00b4
            java.lang.String r7 = r8.getStringExtra(r5)
        L_0x0099:
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x0108
            if (r9 == 0) goto L_0x00bb
            java.lang.String r1 = "gdrive-service/handle-intent accountName is null or empty => user has never configured Google Drive backup and is now deleting WhatsApp account, nothing to delete."
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.00H r1 = r0.A0e
            X.10T r3 = X.C17880vN.A0V(r1)
            r1 = 1
            X.AWs r2 = new X.AWs
            r2.<init>(r1, r4)
            goto L_0x170e
        L_0x00b4:
            X.0z4 r1 = r0.A0I
            java.lang.String r7 = r1.A0f()
            goto L_0x0099
        L_0x00bb:
            X.00H r1 = r0.A0Y
            X.1NP r1 = X.AnonymousClass8BS.A0A(r1)
            int r3 = r1.A05()
            java.lang.String r1 = "gdrive-service/handle-intent "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r1)
            if (r3 == 0) goto L_0x00f7
            r2.append(r8)
            java.lang.String r1 = " accountName is null or empty, cannot proceed further also, change google drive state from "
            r2.append(r1)
            X.00H r1 = r0.A0Y
            X.1NP r1 = X.AnonymousClass8BS.A0A(r1)
            int r1 = r1.A05()
            r2.append(r1)
            java.lang.String r1 = " to clean_state"
            X.C17890vO.A19(r2, r1)
            X.00H r1 = r0.A0Y
            X.1NP r1 = X.AnonymousClass8BS.A0A(r1)
            r1.A0H(r4)
            X.1oa r1 = r0.A09
            r1.A05()
            goto L_0x1719
        L_0x00f7:
            r2.append(r8)
            java.lang.String r1 = " accountName is null or empty, cannot proceed further."
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)
            goto L_0x1714
        L_0x0102:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0105:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0105 }
            throw r0
        L_0x0108:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive-service/handle-intent action is "
            X.C17900vP.A0f(r1, r3, r2)
            int r1 = r3.hashCode()
            switch(r1) {
                case -1755890518: goto L_0x0148;
                case -818191995: goto L_0x015f;
                case 1035381739: goto L_0x017c;
                case 1096596436: goto L_0x01cc;
                case 1122735421: goto L_0x012f;
                case 1461510777: goto L_0x01fb;
                case 1583504647: goto L_0x011d;
                case 1996912751: goto L_0x01e1;
                default: goto L_0x0118;
            }
        L_0x0118:
            com.whatsapp.util.Log.e((java.lang.String) r11)
            goto L_0x1717
        L_0x011d:
            java.lang.String r1 = "action_list"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0118
            X.9ug r2 = r0.A07
            r1 = r26
            X.A7X r6 = r2.A01(r7, r1)
            goto L_0x0214
        L_0x012f:
            java.lang.String r1 = "action_fetch_backup_info"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0118
            android.os.Bundle r1 = r8.getExtras()
            X.C17960vV.A07(r1)
            java.lang.String r6 = r1.getString(r5)
            if (r6 != 0) goto L_0x0269
            java.lang.String r1 = "gdrive-service/handle-intent/ action action_fetch_backup_info called without account_name"
            goto L_0x1714
        L_0x0148:
            java.lang.String r1 = "action_restore_media"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0118
            X.0z4 r1 = r0.A0I
            java.lang.String r49 = r1.A0m()
            boolean r1 = android.text.TextUtils.isEmpty(r49)
            if (r1 == 0) goto L_0x0331
            java.lang.String r1 = "restore>google-service/restore-messages jidUser is null"
            goto L_0x0173
        L_0x015f:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L_0x0118
            X.0z4 r1 = r0.A0I
            java.lang.String r48 = r1.A0m()
            boolean r1 = android.text.TextUtils.isEmpty(r48)
            if (r1 == 0) goto L_0x0bd8
            java.lang.String r1 = "restore>google-service/restore-messages jid is null"
        L_0x0173:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.9ug r2 = r0.A07
            r1 = 18
            goto L_0x13ed
        L_0x017c:
            java.lang.String r1 = "action_backup"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0118
            java.lang.String r2 = "only_if_pending"
            boolean r11 = r8.getBooleanExtra(r2, r4)
            java.lang.String r1 = "gdrive-service/handle-intent/backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            long r9 = java.lang.System.currentTimeMillis()
            X.0z4 r1 = r0.A0I
            long r1 = r1.A0U(r7)
            long r9 = r9 - r1
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            r3 = 1
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            boolean r4 = X.AnonymousClass000.A1R(r1)
            if (r11 == 0) goto L_0x01b8
            X.00H r1 = r0.A0Y
            X.1NP r2 = X.AnonymousClass8BS.A0A(r1)
            X.00H r1 = X.C20134A8u.A00
            int r1 = r2.A05()
            boolean r1 = X.C17890vO.A1R(r1)
            if (r1 == 0) goto L_0x157f
        L_0x01b8:
            if (r6 != 0) goto L_0x01bc
            if (r4 == 0) goto L_0x157f
        L_0x01bc:
            X.00H r1 = r0.A0a
            java.lang.Object r1 = r1.get()
            X.1Do r1 = (X.C22881Do) r1
            boolean r1 = r1.A01
            if (r1 == 0) goto L_0x13dc
            java.lang.String r1 = "gdrive-service/handle-intent/backup WhatsApp Login has failed, google drive backup aborted"
            goto L_0x1714
        L_0x01cc:
            if (r9 == 0) goto L_0x0118
            java.lang.String r3 = "success"
            java.lang.String r11 = "failed"
            java.lang.String r9 = "gdrive-service/handle-intent"
            java.util.concurrent.atomic.AtomicBoolean r6 = r0.A0m
            r1 = 1
            boolean r1 = r6.getAndSet(r1)
            if (r1 == 0) goto L_0x1583
            java.lang.String r1 = "gdrive-service/handle-intent another deletion is already running."
            goto L_0x1714
        L_0x01e1:
            java.lang.String r1 = "action_change_number"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0118
            java.lang.String r1 = "old_phone_number"
            java.lang.String r6 = r8.getStringExtra(r1)
            java.lang.String r1 = "new_phone_number"
            java.lang.String r5 = r8.getStringExtra(r1)
            if (r6 != 0) goto L_0x1622
            java.lang.String r1 = "gdrive-service/handle-intent change number requested but old phone number was not passed in the request."
            goto L_0x1714
        L_0x01fb:
            java.lang.String r1 = "action_remove_backup_info"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0118
            android.os.Bundle r1 = r8.getExtras()
            X.C17960vV.A07(r1)
            java.lang.String r1 = r1.getString(r5)
            if (r1 != 0) goto L_0x16dd
            java.lang.String r1 = "gdrive-service/handle-intent/ action action_remove_backup_info called without account_name"
            goto L_0x1714
        L_0x0214:
            boolean r1 = r6.A0A()     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            if (r1 != 0) goto L_0x0221
            java.lang.String r1 = "gdrive-service/v2/list-files failed to make auth"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            goto L_0x1719
        L_0x0221:
            java.lang.String r3 = r0.A00()     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            if (r3 != 0) goto L_0x022e
            java.lang.String r1 = "gdrive-service/v2/list-files no jid"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            goto L_0x1719
        L_0x022e:
            X.A2x r5 = r6.A05(r3)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            if (r5 != 0) goto L_0x023f
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            java.lang.String r1 = "gdrive-service/v2/list-files no backup for "
            X.C17900vP.A0e(r1, r3, r2)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            goto L_0x1719
        L_0x023f:
            r3 = r26
        L_0x0241:
            java.lang.String r4 = r5.A09     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            r2 = 1000(0x3e8, float:1.401E-42)
            r1 = r26
            android.util.Pair r1 = r6.A04(r4, r3, r1, r2)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            if (r1 == 0) goto L_0x1719
            java.lang.Object r3 = r1.second     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            java.lang.Object r1 = r1.first     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            java.util.Iterator r2 = X.AnonymousClass8BR.A13(r1)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
        L_0x0257:
            boolean r1 = r2.hasNext()     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            if (r1 == 0) goto L_0x0261
            r2.next()     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            goto L_0x0257
        L_0x0261:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 8gb | 8ge | 8gn | 8go | 8gq -> 0x0329 }
            if (r1 == 0) goto L_0x0241
            goto L_0x1719
        L_0x0269:
            X.C17960vV.A00()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r1 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = "gdrive_last_successful_backup_timestamp:"
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r6, r2)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            boolean r1 = r3.contains(r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r1 != 0) goto L_0x1719
            X.1oU r3 = r0.A06     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.1oW r2 = r3.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = "fetch-account-data"
            X.8gX r4 = new X.8gX     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r4.<init>(r3, r2, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.9ug r2 = r0.A07     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r1 = r26
            X.A7X r2 = r2.A01(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            boolean r1 = X.C20127A8m.A09(r4, r2)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r1 != 0) goto L_0x02a6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/auth-failed/"
            X.AnonymousClass8BY.A1H(r1, r6, r2)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            goto L_0x1719
        L_0x02a6:
            java.lang.String r3 = r0.A00()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r3 == 0) goto L_0x1719
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2"
            X.A2x r8 = X.C20127A8m.A01(r4, r2, r3, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r8 != 0) goto L_0x02ce
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/no backup found/"
            r2.append(r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r2.append(r3)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = "/"
            X.AnonymousClass8BY.A1H(r1, r6, r2)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r3 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r1 = 0
            r3.A1n(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            goto L_0x1719
        L_0x02ce:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/setting-backup-data-for "
            X.AnonymousClass8BV.A1L(r1, r6, r2)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r1 = " data: "
            X.C17900vP.A0Y(r8, r1, r2)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r3 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            long r1 = r8.A05     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r3.A1n(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r3 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            long r1 = r8.A04     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r3.A1o(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r3 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            long r1 = r8.A01()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r3.A1m(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r7 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            java.lang.String r5 = "videoSize"
            r3 = -1
            org.json.JSONObject r2 = r8.A0A     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r2 == 0) goto L_0x0322
            boolean r1 = r2.has(r5)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r1 == 0) goto L_0x0317
            long r1 = r2.optLong(r5, r3)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
        L_0x0307:
            r7.A1p(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.0z4 r2 = r0.A0I     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            X.9uI r1 = r8.A02()     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            boolean r1 = r1.A01     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            r2.A1x(r6, r1)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            goto L_0x1701
        L_0x0317:
            org.json.JSONObject r1 = X.C20007A2x.A00(r8)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            if (r1 == 0) goto L_0x0322
            long r1 = r1.optLong(r5, r3)     // Catch:{ 8ge | 8gg | 8gn | 8go -> 0x0325 }
            goto L_0x0307
        L_0x0322:
            r1 = -1
            goto L_0x0307
        L_0x0325:
            r2 = move-exception
            java.lang.String r1 = "gdrive-service/handle-intent/action_fetch_backup_info"
            goto L_0x032c
        L_0x0329:
            r2 = move-exception
            java.lang.String r1 = "gdrive-service/v2/list-files failed"
        L_0x032c:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x1719
        L_0x0331:
            X.9ug r1 = r0.A07
            X.1oW r3 = r1.A09
            X.1oU r2 = r0.A06
            java.lang.String r1 = "media-restore"
            X.8gX r10 = new X.8gX
            r10.<init>(r2, r3, r1)
            X.11P r1 = r0.A0G
            r21 = r1
            X.0ve r1 = r0.A0P
            r20 = r1
            X.17r r1 = r0.A00
            r19 = r1
            X.18K r1 = r0.A0Q
            r18 = r1
            X.1L7 r1 = r0.A0D
            r17 = r1
            X.9ug r2 = r0.A07
            java.lang.String r1 = "restore"
            X.A7X r37 = r2.A01(r7, r1)
            X.1Vr r1 = r0.A0R
            r16 = r1
            X.1NT r15 = r0.A05
            X.1ST r14 = r0.A0J
            X.1Vy r13 = r0.A0S
            X.9uB r12 = r0.A0U
            X.9ug r11 = r0.A07
            X.0z4 r9 = r0.A0I
            X.1NW r7 = r0.A03
            X.00H r1 = r0.A0Y
            X.1NP r31 = X.AnonymousClass8BS.A0A(r1)
            X.1oU r6 = r0.A06
            X.00H r1 = r0.A0e
            java.lang.Object r5 = r1.get()
            X.8yN r5 = (X.C175238yN) r5
            X.9ug r1 = r0.A07
            X.8s7 r45 = r1.A02()
            X.9ug r2 = r0.A07
            java.lang.Object r1 = r2.A0D
            monitor-enter(r1)
            X.8s6 r4 = r2.A03     // Catch:{ all -> 0x0bd5 }
            if (r4 != 0) goto L_0x0392
            X.8s6 r4 = new X.8s6     // Catch:{ all -> 0x0bd5 }
            r4.<init>()     // Catch:{ all -> 0x0bd5 }
            r2.A03 = r4     // Catch:{ all -> 0x0bd5 }
        L_0x0392:
            monitor-exit(r1)     // Catch:{ all -> 0x0bd5 }
            X.1oY r1 = r0.A08
            java.util.concurrent.atomic.AtomicLong r3 = r1.A05
            java.util.concurrent.atomic.AtomicLong r2 = r1.A04
            X.9i4 r1 = new X.9i4
            r27 = r1
            r28 = r0
            r29 = r19
            r30 = r7
            r32 = r15
            r33 = r6
            r34 = r11
            r35 = r5
            r36 = r10
            r38 = r17
            r39 = r21
            r40 = r9
            r41 = r14
            r42 = r20
            r43 = r18
            r44 = r4
            r46 = r16
            r47 = r13
            r48 = r12
            r50 = r3
            r51 = r2
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            java.util.Map r15 = r0.A0g
            X.1NP r2 = r1.A03
            r54 = r2
            boolean r2 = X.C20134A8u.A07(r54)
            if (r2 != 0) goto L_0x03d8
            java.lang.String r1 = "restore>MediaRestoreAction/restore media called but media restore is not pending, request ignored."
            goto L_0x16cf
        L_0x03d8:
            X.1oU r2 = r1.A05
            r53 = r2
            r23 = 1
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.A0R
            r52 = r2
            r3 = r2
            r2 = r23
            boolean r2 = r3.getAndSet(r2)
            if (r2 == 0) goto L_0x03ef
            java.lang.String r1 = "restore>MediaRestoreAction/media restore is already running, request ignored."
            goto L_0x1714
        L_0x03ef:
            int r2 = r54.A02()
            r3 = 10
            if (r2 == r3) goto L_0x03fc
            X.9ug r2 = r1.A06
            r2.A05(r3)
        L_0x03fc:
            X.1Vy r2 = r1.A0H
            r2.A02()
            X.8yN r2 = r1.A07
            r51 = r2
            r3 = 0
            r2.A01 = r3
            r3 = 13
            X.C20735AWq.A00(r2, r3)
            X.8s7 r5 = r1.A0F
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r23)
            r5.A01 = r2
            X.8s6 r4 = r1.A0E
            r4.A01 = r2
            long r20 = java.lang.System.currentTimeMillis()
            r22 = 0
            r16 = 1
            r2 = 0
            long r7 = r54.A06()     // Catch:{ all -> 0x0b5c }
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0432
            java.lang.String r7 = "gdrive_restore_start_timestamp"
            r6 = r54
            r6.A0M(r7)     // Catch:{ all -> 0x0b5c }
        L_0x0432:
            java.lang.String r27 = "media_restore_start_timestamp"
            android.content.SharedPreferences r6 = r54.A07()     // Catch:{ all -> 0x0b5c }
            r7 = r27
            long r7 = X.C17890vO.A04(r6, r7)     // Catch:{ all -> 0x0b5c }
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x0449
            r6 = r54
            r7 = r27
            r6.A0M(r7)     // Catch:{ all -> 0x0b5c }
        L_0x0449:
            X.A7X r6 = r1.A09     // Catch:{ all -> 0x0b5c }
            r50 = r6
            X.AmB r6 = r6.A05     // Catch:{ all -> 0x0b5c }
            r7 = r22
            r6.A00 = r7     // Catch:{ all -> 0x0b5c }
            r6 = r50
            java.util.concurrent.atomic.AtomicInteger r6 = r6.A0E     // Catch:{ all -> 0x0b5c }
            r6.set(r7)     // Catch:{ all -> 0x0b5c }
            r7 = 2
            r6 = r54
            r6.A0H(r7)     // Catch:{ all -> 0x0b5c }
            r8 = 11
            java.lang.String r6 = "restore>MediaRestoreAction/stage: authenticating with google servers"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.1oW r6 = r1.A08     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r49 = r6
            r7 = r6
            r6 = r50
            boolean r6 = X.C20127A8m.A09(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x047b
            X.9ug r6 = r1.A06     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6.A05(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0ae5
        L_0x047b:
            java.lang.String r6 = "restore>MediaRestoreAction/stage: requesting backup"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r9 = r1.A0J     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r8 = "gdrive/restore-media"
            r6 = r50
            X.A2x r24 = X.C20127A8m.A01(r7, r6, r9, r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r24 != 0) goto L_0x0495
            X.9ug r7 = r1.A06     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 14
            r7.A05(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0ae5
        L_0x0495:
            X.9uI r6 = r24.A02()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r6 = r6.A01     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = X.AnonymousClass8BX.A06(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A0B = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.9uI r6 = r24.A02()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r6 = r6.A01     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = X.AnonymousClass8BX.A06(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A08 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r24
            long r6 = r6.A04     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r18 = r6
            r6 = r24
            org.json.JSONObject r6 = r6.A0A     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r25 = r6
            r6 = -1
            if (r25 == 0) goto L_0x04cd
            java.lang.String r9 = "chatdbSize"
            r8 = r25
            long r6 = r8.optLong(r9, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x04cd:
            long r8 = r18 - r6
            double r6 = (double) r8     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A04 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r6 = r24.A05()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A00 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r15 == 0) goto L_0x04e8
            boolean r6 = r15.isEmpty()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x0502
        L_0x04e8:
            java.lang.String r6 = "restore>MediaRestoreAction/stage: loading files from backup"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r53
            X.1oW r7 = r6.A0I     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r24
            java.util.Map r15 = X.C20127A8m.A04(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r15 != 0) goto L_0x0502
            X.9ug r7 = r1.A06     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 14
            r7.A05(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0ae5
        L_0x0502:
            X.1NT r7 = r1.A04     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Collection r6 = r15.values()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.C20127A8m.A05(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r48 = r54.A0Q()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.HashSet r38 = X.C17880vN.A12()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.17r r6 = r1.A01     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.io.File r6 = r6.A0J()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r7 = r6.getName()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r38
            r6.add(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r53
            int r7 = r6.A00     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r37 = java.lang.Long.valueOf(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 2
            if (r7 != r6) goto L_0x0536
            X.C17960vV.A07(r5)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r37
            r5.A0C = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A09 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0536:
            java.lang.String r36 = ","
            r7 = r36
            r6 = r38
            android.text.TextUtils.join(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/stage: collect files to download from the backup"
            java.util.ArrayList r6 = X.AnonymousClass8BU.A0w(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.List r35 = java.util.Collections.synchronizedList(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r7 = "restore>MediaRestoreAction/get-files-to-be-downloaded"
            X.1Ez r34 = new X.1Ez     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r34
            r6.<init>((java.lang.String) r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.1NW r6 = r1.A02     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r6 = r6.A03()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x088b
            java.util.concurrent.atomic.AtomicReference r33 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7 = r26
            r6 = r33
            r6.<init>(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Set r8 = r15.keySet()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicBoolean r32 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7 = r32
            r6 = r23
            r7.<init>(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r7 = r8.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.CountDownLatch r31 = new java.util.concurrent.CountDownLatch     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r31
            r6.<init>(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r30 = r8.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Iterator r29 = r8.iterator()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r13 = 0
        L_0x0584:
            boolean r6 = r29.hasNext()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x0656
            java.lang.String r12 = X.C17880vN.A0v(r29)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r13 % 100
            if (r6 != 0) goto L_0x05a5
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/get-files-to-be-downloaded "
            r8.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r8.append(r13)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r7 = "/"
            r6 = r30
            X.C17900vP.A0j(r7, r8, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x05a5:
            int r13 = r13 + 1
            boolean r6 = r49.A01()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x089d
            java.lang.Object r6 = r33.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.9LZ r6 = (X.AnonymousClass9LZ) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x05bf
            boolean r2 = r6 instanceof X.C167678gm     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r2 != 0) goto L_0x0667
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7.<init>(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x05be:
            throw r7     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x05bf:
            long r10 = (long) r13     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r30
            long r8 = (long) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r51
            int r14 = r6.A01     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x05d0
            r6 = 100
            long r6 = r6 * r10
            long r6 = r6 / r8
            int r14 = (int) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x05d0:
            r6 = r51
            int r6 = r6.A01     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r14 == r6) goto L_0x05fe
            java.util.Locale r28 = java.util.Locale.ENGLISH     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Object[] r7 = X.AnonymousClass8BR.A1a()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r22
            X.AnonymousClass3MX.A1S(r7, r6, r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r23
            X.AnonymousClass3MX.A1S(r7, r6, r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 2
            X.C17880vN.A1T(r7, r14, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r8 = "restore>GoogleBackupRestoreObservable/media-restore-preparation-progress %d/%d (%d%%)"
            r6 = r28
            X.C108955ca.A1X(r8, r6, r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r51
            r6.A01 = r14     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r8 = 3
            X.AWd r7 = new X.AWd     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7.<init>(r6, r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6.notifyAllObservers(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x05fe:
            java.lang.Object r7 = r15.get(r12)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.A2d r7 = (X.C19990A2d) r7     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.1L7 r6 = r1.A0A     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = X.C41361wE.A07(r6, r12)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x061a
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/get-files-to-be-downloaded/skipping-null-download-path relative path: "
            X.C17900vP.A0e(r6, r12, r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0615:
            r31.countDown()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0584
        L_0x061a:
            java.io.File r42 = X.C108945cZ.A17(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Iterator r8 = r38.iterator()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0622:
            boolean r6 = r8.hasNext()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x064e
            java.lang.String r6 = X.C17880vN.A0v(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r6 = r12.startsWith(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x0622
            X.AjT r6 = new X.AjT     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r39 = r6
            r40 = r1
            r41 = r7
            r43 = r12
            r44 = r35
            r45 = r31
            r46 = r32
            r47 = r33
            r39.<init>(r40, r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.ThreadPoolExecutor r7 = X.AnonymousClass9U7.A00     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7.execute(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0584
        L_0x064e:
            r7 = r36
            r6 = r38
            android.text.TextUtils.join(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0615
        L_0x0656:
            java.lang.Object r7 = r33.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.9LZ r7 = (X.AnonymousClass9LZ) r7     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r7 == 0) goto L_0x0668
            boolean r2 = r7 instanceof X.C167678gm     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r2 != 0) goto L_0x05be
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6.<init>(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0667:
            throw r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0668:
            java.lang.String r6 = "restore>MediaRestoreAction/get-files-to-be-downloaded waiting for all files to be processed."
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ InterruptedException -> 0x0899 }
            r31.await()     // Catch:{ InterruptedException -> 0x0899 }
            boolean r6 = r32.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x089d
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files/num-files-to-be-downloaded/"
            r7.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r35.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.C17900vP.A0o(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicInteger r7 = r1.A0K     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r35.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r6 / 10
            r7.set(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r34.A02()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            android.content.SharedPreferences r6 = r54.A07()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r7 = "gdrive_already_downloaded_bytes"
            boolean r6 = r6.contains(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x06cd
            android.content.SharedPreferences r6 = r54.A07()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x06a4:
            long r8 = r6.getLong(r7, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicLong r6 = r1.A0N     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r31 = r6
            r6.set(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Iterator r11 = r35.iterator()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x06b3:
            boolean r6 = r11.hasNext()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x06d6
            java.lang.Object r6 = r11.next()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Object r6 = r15.get(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.A2d r6 = (X.C19990A2d) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 == 0) goto L_0x06b3
            long r6 = r6.A00     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r10 = r31
            r10.addAndGet(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x06b3
        L_0x06cd:
            r6 = r54
            X.0z4 r6 = r6.A00     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            android.content.SharedPreferences r6 = X.C17890vO.A0B(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x06a4
        L_0x06d6:
            X.Akq r7 = new X.Akq     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7.<init>()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r35
            java.util.Collections.sort(r6, r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.0ve r10 = r1.A0C     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7 = 10445(0x28cd, float:1.4637E-41)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r7 = X.C18020vd.A00(r6, r10, r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r53
            int r28 = r6.A01(r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r35.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            double r6 = (double) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A03 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r12 = X.C17880vN.A0n(r28)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A0F = r12     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Iterator r14 = X.AnonymousClass8BU.A0x(r15)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 0
        L_0x0707:
            boolean r10 = r14.hasNext()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x0730
            java.lang.String r11 = X.C17880vN.A0v(r14)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.1L7 r10 = r1.A0A     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r10 = X.C41361wE.A07(r10, r11)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x0707
            java.util.Iterator r13 = r38.iterator()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x071d:
            boolean r10 = r13.hasNext()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x0707
            java.lang.String r10 = X.C17880vN.A0v(r13)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r10 = r11.startsWith(r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x071d
            long r6 = r6 + r16
            goto L_0x0707
        L_0x0730:
            double r10 = (double) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r6 = java.lang.Double.valueOf(r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A02 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A0F = r12     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.ArrayList r42 = X.AnonymousClass000.A13()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r10 = 0
            java.util.concurrent.atomic.AtomicInteger r14 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r14.<init>(r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicLong r6 = r1.A0M     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r30 = r6
            r6.set(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicLong r8 = r1.A0O     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            android.content.SharedPreferences r7 = r54.A07()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "pending_media_restore_already_downloaded_file_count"
            long r6 = r7.getLong(r6, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r8.set(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicLong r6 = r1.A0L     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r29 = r6
            r6.set(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r35.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.CountDownLatch r12 = new java.util.concurrent.CountDownLatch     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r12.<init>(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicReference r11 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r26
            r11.<init>(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.ThreadPoolExecutor r9 = X.C20134A8u.A03(r28)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/stage: start downloading files from google"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Iterator r26 = r35.iterator()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x077d:
            boolean r6 = r26.hasNext()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r8 = "/"
            if (r6 == 0) goto L_0x07cd
            java.lang.String r13 = X.C17880vN.A0v(r26)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r10 = r10 + 1
            int r6 = r10 % 100
            if (r6 != 0) goto L_0x07a5
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files enqueuing download  "
            r7.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7.append(r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r35
            X.C17890vO.A15(r8, r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = ": "
            X.C17900vP.A0f(r6, r13, r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x07a5:
            java.lang.Object r7 = r15.get(r13)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.A2d r7 = (X.C19990A2d) r7     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r7 == 0) goto L_0x07c4
            r45 = 4
            X.Akd r6 = new X.Akd     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r38 = r6
            r39 = r1
            r40 = r7
            r41 = r11
            r43 = r14
            r44 = r12
            r38.<init>(r39, r40, r41, r42, r43, r44, r45)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r9.execute(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x077d
        L_0x07c4:
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files resId cannot be null, skipping."
            com.whatsapp.util.Log.e((java.lang.String) r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r12.countDown()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x077d
        L_0x07cd:
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files waiting for all files to be restored."
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ InterruptedException -> 0x0894 }
            r12.await()     // Catch:{ InterruptedException -> 0x0894 }
            java.lang.Object r7 = r11.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.9LZ r7 = (X.AnonymousClass9LZ) r7     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r7 == 0) goto L_0x07f5
            boolean r6 = r7 instanceof X.C167698go     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x05be
            boolean r6 = r7 instanceof X.C167688gn     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x05be
            boolean r6 = r7 instanceof X.C167638gi     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x05be
            boolean r6 = r7 instanceof X.C167618gg     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x05be
            boolean r6 = r7 instanceof X.C167598ge     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x05be
            boolean r6 = r7 instanceof X.C167678gm     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 != 0) goto L_0x05be
        L_0x07f5:
            int r6 = r42.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r6 = X.C17880vN.A0n(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A0D = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r42.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r6 <= 0) goto L_0x0834
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files/failed-files/"
            r7.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r42.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.C17900vP.A0o(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.9uB r9 = r1.A0I     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r42.size()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r10.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r7 = " files  out of total "
            r6 = r35
            X.C17890vO.A15(r7, r10, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r10 = r10.toString()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r7 = "restore-media/failed to restore files"
            r6 = r23
            r9.A03(r7, r10, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0834:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>MediaRestoreAction/restore-files waiting for restore to finish: "
            r9.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r30.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r9.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r9.append(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r31.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r9.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = " ("
            r9.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r29.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r9.append(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = " failed)"
            X.C17890vO.A1A(r9, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r7 = r30.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x086f
            long r7 = r29.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0892
        L_0x086f:
            long r7 = r31.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x0892
            long r7 = r30.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r10 = r31.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r9 = 4
            X.35L r6 = new X.35L     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6.<init>(r7, r9, r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = r51
            r2.notifyAllObservers(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0892
        L_0x088b:
            X.8gm r7 = new X.8gm     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7.<init>()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x05be
        L_0x0892:
            r10 = 1
            goto L_0x08a6
        L_0x0894:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x08a5
        L_0x0899:
            r2 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x089d:
            java.lang.String r2 = "restore>MediaRestoreAction/restore-files failed to get list of files to be restored."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r34.A02()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x08a5:
            r10 = 0
        L_0x08a6:
            r2 = r54
            r3 = r22
            r2.A0H(r3)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r2 = "restore>MediaRestoreAction/stage: restoring files finished with "
            r3.append(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x08b9
            goto L_0x08bc
        L_0x08b9:
            java.lang.String r2 = "failure"
            goto L_0x08be
        L_0x08bc:
            java.lang.String r2 = "success"
        L_0x08be:
            X.C17890vO.A1A(r3, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x08c4
            goto L_0x08d0
        L_0x08c4:
            X.9ug r3 = r1.A06     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = 14
            r3.A05(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Integer r2 = X.C17880vN.A0l()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x08d6
        L_0x08d0:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r23)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A0A = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x08d6:
            r4.A07 = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = r53
            int r3 = r2.A00     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = r23
            if (r3 != r2) goto L_0x0968
            java.lang.Long r37 = java.lang.Long.valueOf(r16)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x08e4:
            r2 = r37
            r5.A0C = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x08e8:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r54.A06()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r6 = X.C108945cZ.A1B(r2, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A0D = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicLong r6 = r1.A0N     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r6.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            double r8 = (double) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r6 = java.lang.Double.valueOf(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A08 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.concurrent.atomic.AtomicLong r6 = r1.A0L     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r6.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            double r8 = (double) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r6 = java.lang.Double.valueOf(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A07 = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            android.content.SharedPreferences r7 = r54.A07()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r27
            long r6 = X.C17890vO.A04(r7, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r2 = X.C108945cZ.A1B(r2, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A0C = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r9 = "restore>MediaRestoreAction/total wall time for media + message restore: %.1f seconds."
            r2 = r23
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r2 = r5.A0D     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = r2.longValue()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            double r2 = (double) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r6
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r8[r22] = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String.format(r11, r9, r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r6 = X.AnonymousClass8BR.A04(r20)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A0B = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            android.content.SharedPreferences r3 = r54.A07()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r2 = "media_restore_overall_exec_time"
            long r2 = X.C17890vO.A05(r3, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r2 = r2 + r6
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r4.A0A = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r54
            r6.A0I(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = r18
            double r6 = (double) r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A06 = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x096d
        L_0x0968:
            r2 = 2
            if (r3 != r2) goto L_0x08e8
            goto L_0x08e4
        L_0x096d:
            r2 = -1
            if (r25 == 0) goto L_0x0979
            java.lang.String r9 = "chatdbSize"
            r8 = r25
            long r2 = r8.optLong(r9, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x0979:
            double r8 = (double) r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r2 = java.lang.Double.valueOf(r8)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A02 = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = -1
            if (r25 == 0) goto L_0x098c
            java.lang.String r9 = "chatdbSize"
            r8 = r25
            long r2 = r8.optLong(r9, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x098c:
            double r8 = (double) r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            double r6 = r6 - r8
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A04 = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            int r6 = r50.A03()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            double r2 = (double) r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Double r2 = java.lang.Double.valueOf(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A05 = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            boolean r2 = r24.A05()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r5.A00 = r2     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r2 = "restore>MediaRestoreAction/total-requests-in-restore-session/"
            X.C17900vP.A0j(r2, r3, r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x09b7
            r54.A09()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
        L_0x09b7:
            boolean r2 = r52.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r2 == 0) goto L_0x09f2
            int r3 = r54.A02()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = 10
            if (r3 != r2) goto L_0x0a74
            java.util.concurrent.atomic.AtomicLong r2 = r1.A0M     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            long r2 = r2.get()     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = 2
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            if (r10 == 0) goto L_0x09ef
            java.lang.String r6 = "successful"
        L_0x09d2:
            r7[r22] = r6     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6 = r23
            X.AnonymousClass3MX.A1S(r7, r6, r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            java.lang.String r6 = "restore>GoogleBackupRestoreObservable/notify-media-restore-end result:%s restored:%d"
            java.lang.String.format(r11, r6, r7)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r7 = -1
            r6 = r51
            r6.A01 = r7     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            X.AWe r6 = new X.AWe     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r6.<init>(r2, r10)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r2 = r51
            r2.notifyAllObservers(r6)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0a74
        L_0x09ef:
            java.lang.String r6 = "failed"
            goto L_0x09d2
        L_0x09f2:
            java.lang.String r2 = "restore>GoogleBackupRestoreObservable/notify-media-restore-cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r3 = -1
            r2 = r51
            r2.A01 = r3     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            r3 = 14
            X.C20735AWq.A00(r2, r3)     // Catch:{ 8gn -> 0x0a67, 8go -> 0x0a3a, 8gi -> 0x0a2c, 8gg -> 0x0a1e, 8gm -> 0x0a10, 8ge -> 0x0a02 }
            goto L_0x0a74
        L_0x0a02:
            r6 = move-exception
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 25
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            java.lang.String r2 = "restore>MediaRestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a10:
            r6 = move-exception
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 23
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            java.lang.String r2 = "restore>MediaRestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a1e:
            r6 = move-exception
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 19
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            java.lang.String r2 = "restore>MediaRestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a2c:
            r6 = move-exception
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 15
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            java.lang.String r2 = "restore>MediaRestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a3a:
            r3 = move-exception
            java.lang.String r2 = "restore>MediaRestoreAction/failure: access permission is mission for the provided google account"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x0b5c }
            java.lang.Throwable r2 = r3.getCause()     // Catch:{ all -> 0x0b5c }
            if (r2 != 0) goto L_0x0a53
            java.lang.String r2 = "restore>MediaRestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x0b5c }
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 11
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a53:
            boolean r2 = r2 instanceof X.BYF     // Catch:{ all -> 0x0b5c }
            if (r2 == 0) goto L_0x0a5f
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 21
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a5f:
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 11
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            goto L_0x0a74
        L_0x0a67:
            r6 = move-exception
            X.9ug r3 = r1.A06     // Catch:{ all -> 0x0b5c }
            r2 = 12
            r3.A05(r2)     // Catch:{ all -> 0x0b5c }
            java.lang.String r2 = "restore>MediaRestoreAction/failure: account not present on the device anymore"
            com.whatsapp.util.Log.e(r2, r6)     // Catch:{ all -> 0x0b5c }
        L_0x0a74:
            X.18K r3 = r1.A0D
            r3.CC7(r5)
            r2 = r53
            int r5 = r2.A00
            r2 = r23
            if (r5 != r2) goto L_0x0add
            java.lang.Long r2 = java.lang.Long.valueOf(r16)
        L_0x0a85:
            r4.A09 = r2
        L_0x0a87:
            X.C161048Be.A06(r1, r4)
            android.content.SharedPreferences r2 = r54.A07()
            r1 = r27
            long r7 = X.C17890vO.A04(r2, r1)
            r5 = 0
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0aae
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r2 = r54.A07()
            r1 = r27
            long r1 = X.C17890vO.A04(r2, r1)
            java.lang.Long r1 = X.C108945cZ.A1B(r5, r1)
            r4.A0C = r1
        L_0x0aae:
            long r5 = X.AnonymousClass8BR.A04(r20)
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r4.A0B = r1
            android.content.SharedPreferences r2 = r54.A07()
            java.lang.String r1 = "media_restore_overall_exec_time"
            long r1 = X.C17890vO.A05(r2, r1)
            long r1 = r1 + r5
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r4.A0A = r5
            r5 = r54
            r5.A0I(r1)
            int r1 = r50.A03()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r4.A03 = r1
            r3.CC7(r4)
            goto L_0x0b4b
        L_0x0add:
            r2 = 2
            if (r5 != r2) goto L_0x0a87
            java.lang.Long r2 = X.C17890vO.A0L()
            goto L_0x0a85
        L_0x0ae5:
            X.18K r9 = r1.A0D
            r9.CC7(r5)
            r5 = r53
            int r6 = r5.A00
            r5 = r23
            if (r6 != r5) goto L_0x0b54
            java.lang.Long r5 = java.lang.Long.valueOf(r16)
        L_0x0af6:
            r4.A09 = r5
        L_0x0af8:
            X.C161048Be.A06(r1, r4)
            android.content.SharedPreferences r5 = r54.A07()
            r1 = r27
            long r5 = X.C17890vO.A04(r5, r1)
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0b1d
            long r7 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r5 = r54.A07()
            r1 = r27
            long r5 = X.C17890vO.A04(r5, r1)
            java.lang.Long r1 = X.C108945cZ.A1B(r7, r5)
            r4.A0C = r1
        L_0x0b1d:
            long r6 = X.AnonymousClass8BR.A04(r20)
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            r4.A0B = r1
            android.content.SharedPreferences r5 = r54.A07()
            java.lang.String r1 = "media_restore_overall_exec_time"
            long r1 = r5.getLong(r1, r2)
            long r1 = r1 + r6
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r4.A0A = r3
            r3 = r54
            r3.A0I(r1)
            int r1 = r50.A03()
            double r1 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r4.A03 = r1
            r9.CC7(r4)
        L_0x0b4b:
            r2 = r52
            r1 = r22
            r2.getAndSet(r1)
            goto L_0x1719
        L_0x0b54:
            r5 = 2
            if (r6 != r5) goto L_0x0af8
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            goto L_0x0af6
        L_0x0b5c:
            r9 = move-exception
            X.18K r7 = r1.A0D
            r7.CC7(r5)
            r0 = r53
            int r2 = r0.A00
            r0 = r23
            if (r2 != r0) goto L_0x0bcd
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
        L_0x0b6e:
            r4.A09 = r0
        L_0x0b70:
            X.C161048Be.A06(r1, r4)
            java.lang.String r8 = "media_restore_start_timestamp"
            android.content.SharedPreferences r0 = r54.A07()
            long r5 = X.C17890vO.A04(r0, r8)
            r2 = 0
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0b95
            long r5 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r54.A07()
            long r2 = X.C17890vO.A04(r0, r8)
            java.lang.Long r0 = X.C108945cZ.A1B(r5, r2)
            r4.A0C = r0
        L_0x0b95:
            long r5 = X.AnonymousClass8BR.A04(r20)
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r4.A0B = r0
            android.content.SharedPreferences r2 = r54.A07()
            java.lang.String r0 = "media_restore_overall_exec_time"
            long r2 = X.C17890vO.A05(r2, r0)
            long r2 = r2 + r5
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A0A = r0
            r0 = r54
            r0.A0I(r2)
            X.A7X r0 = r1.A09
            int r0 = r0.A03()
            double r0 = (double) r0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A03 = r0
            r7.CC7(r4)
            r1 = r52
            r0 = r22
            r1.getAndSet(r0)
            throw r9
        L_0x0bcd:
            r0 = 2
            if (r2 != r0) goto L_0x0b70
            java.lang.Long r0 = X.C17890vO.A0L()
            goto L_0x0b6e
        L_0x0bd5:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0bd5 }
            throw r0
        L_0x0bd8:
            X.9ug r1 = r0.A07
            X.1oW r2 = r1.A0A
            X.1oU r1 = r0.A06
            java.lang.String r3 = "restore"
            X.8gX r10 = new X.8gX
            r10.<init>(r1, r2, r3)
            X.11P r1 = r0.A0G
            r18 = r1
            X.0ve r1 = r0.A0P
            r17 = r1
            X.18K r1 = r0.A0Q
            r16 = r1
            X.9ug r1 = r0.A07
            X.8s7 r45 = r1.A02()
            X.1L7 r15 = r0.A0D
            X.9ug r2 = r0.A07
            java.lang.Object r1 = r2.A0D
            monitor-enter(r1)
            X.8s2 r9 = r2.A02     // Catch:{ all -> 0x13d9 }
            if (r9 != 0) goto L_0x0c09
            X.8s2 r9 = new X.8s2     // Catch:{ all -> 0x13d9 }
            r9.<init>()     // Catch:{ all -> 0x13d9 }
            r2.A02 = r9     // Catch:{ all -> 0x13d9 }
        L_0x0c09:
            monitor-exit(r1)     // Catch:{ all -> 0x13d9 }
            X.19D r14 = r0.A0O
            X.9ug r1 = r0.A07
            X.A7X r35 = r1.A01(r7, r3)
            X.4aW r13 = r0.A0T
            X.1Wb r12 = r0.A0K
            X.9uB r11 = r0.A0U
            X.1DK r1 = r0.A0N
            X.A0e r8 = new X.A0e
            r8.<init>(r1)
            X.9ug r7 = r0.A07
            X.0z4 r6 = r0.A0I
            X.1oY r1 = r0.A08
            java.util.concurrent.atomic.AtomicLong r1 = r1.A04
            r1.getClass()
            X.AMU r5 = new X.AMU
            r5.<init>(r1)
            X.00H r1 = r0.A0Y
            X.1NP r29 = X.AnonymousClass8BS.A0A(r1)
            X.1NW r4 = r0.A03
            X.1Cn r2 = r0.A0L
            X.1oU r1 = r0.A06
            X.9i2 r3 = new X.9i2
            r27 = r3
            r28 = r4
            r30 = r8
            r31 = r5
            r32 = r1
            r33 = r7
            r34 = r10
            r36 = r15
            r37 = r18
            r38 = r6
            r39 = r12
            r40 = r2
            r41 = r14
            r42 = r17
            r43 = r16
            r44 = r9
            r46 = r13
            r47 = r11
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            X.00H r1 = r0.A0e
            java.lang.Object r12 = r1.get()
            X.8yN r12 = (X.C175238yN) r12
            java.lang.String r18 = "restore>RestoreAction/total-requests-till-restore-messages/"
            java.util.concurrent.atomic.AtomicLong r1 = r3.A0M
            r40 = r1
            r1 = 0
            java.lang.Long r19 = java.lang.Long.valueOf(r1)
            r4 = r40
            r4.set(r1)
            java.util.concurrent.atomic.AtomicLong r4 = r3.A0L
            r39 = r4
            r4.set(r1)
            X.1Cn r4 = r3.A0C
            X.1Cd r6 = r4.A00
            r4 = 0
            r5 = r26
            boolean r6 = r6.A09(r5, r4)
            r5 = 1
            if (r6 == 0) goto L_0x0ca1
            java.lang.String r1 = "restore>RestoreAction/media restore is pending, end message store download"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r1 = 2
            X.C20737AWs.A00(r12, r1, r5)
        L_0x0c9b:
            r1 = r26
            r0.A0g = r1
            goto L_0x1719
        L_0x0ca1:
            X.1oU r14 = r3.A05
            java.util.concurrent.atomic.AtomicBoolean r6 = r14.A0S
            r38 = r6
            boolean r6 = r6.getAndSet(r5)
            if (r6 == 0) goto L_0x0cb3
            java.lang.String r1 = "restore>RestoreAction/restore is already running"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0c9b
        L_0x0cb3:
            r16 = 1
            r20 = 2
            r21 = 0
            X.1NP r6 = r3.A02     // Catch:{ all -> 0x1383 }
            r37 = r6
            long r7 = r37.A06()     // Catch:{ all -> 0x1383 }
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0ccc
            java.lang.String r2 = "gdrive_restore_start_timestamp"
            r1 = r37
            r1.A0M(r2)     // Catch:{ all -> 0x1383 }
        L_0x0ccc:
            r1 = 9
            X.C20735AWq.A00(r12, r1)     // Catch:{ all -> 0x1383 }
            r2 = 3
            r1 = r37
            r1.A0H(r2)     // Catch:{ all -> 0x1383 }
            X.A7X r1 = r3.A08     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r36 = r1
            X.1oW r1 = r3.A07     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r35 = r1
            r2 = r1
            r1 = r36
            boolean r1 = X.C20127A8m.A09(r2, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0d31
            X.9ug r2 = r3.A06     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = 11
            r2.A05(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.8s2 r6 = r3.A0F     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Integer r1 = X.C17880vN.A0m()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r6.A07 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r20
            X.C20737AWs.A00(r12, r1, r4)     // Catch:{ all -> 0x1383 }
            int r2 = r14.A00
            if (r2 != r5) goto L_0x0d2e
            java.lang.Long r19 = java.lang.Long.valueOf(r16)
        L_0x0d04:
            r1 = r19
            r6.A0A = r1
        L_0x0d08:
            long r4 = java.lang.System.currentTimeMillis()
            long r1 = r37.A06()
            long r4 = r4 - r1
            r2 = r40
            r1 = r39
            X.C161048Be.A07(r6, r2, r1, r4)
            r2 = r36
            r1 = r38
            X.C161048Be.A05(r2, r3, r6, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r18)
            int r1 = r36.A03()
            X.C17900vP.A0o(r2, r1)
            java.lang.Integer r1 = r6.A07
            goto L_0x1359
        L_0x0d2e:
            if (r2 != r1) goto L_0x0d08
            goto L_0x0d04
        L_0x0d31:
            r1 = r26
            r3.A00 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/restore-messages/stage: get backup from google"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r10 = r3.A0K     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r6 = "gdrive-service/fetch-account-data-v2"
            r1 = r36
            X.A2x r13 = X.C20127A8m.A01(r2, r1, r10, r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r13 != 0) goto L_0x0d4d
            java.lang.String r1 = "restore>RestoreAction/restore-messages/backup doesn't exist(null), aborting restore."
        L_0x0d48:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x11ea
        L_0x0d4d:
            X.9uI r6 = r13.A02()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.19D r1 = r3.A0D     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r28 = r1
            X.C18070vi.A0d(r1, r4)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7 = 9372(0x249c, float:1.3133E-41)
            X.0vf r27 = X.C18040vf.A02     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2 = r27
            boolean r1 = X.C18020vd.A05(r2, r1, r7)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0d77
            boolean r1 = r6.A03     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0d77
            boolean r1 = r6.A01     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x0d77
            java.lang.String r1 = "/restore-messages/backup is encrypted with a passkey, not supported yet"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.8gl r1 = new X.8gl     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1.<init>()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0d76:
            throw r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0d77:
            org.json.JSONObject r8 = r13.A0A     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r8 == 0) goto L_0x0d9e
            java.lang.String r6 = "backupVersion"
            int r1 = r8.optInt(r6, r5)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 <= r5) goto L_0x0da3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "/restore-messages/backup version is newer than the app can support. Backup version: "
            r2.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r1 = r8.optInt(r6, r5)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = ", supported version: "
            X.C17900vP.A0i(r1, r2, r5)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.8gl r1 = new X.8gl     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1.<init>()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0d76
        L_0x0d9e:
            java.lang.String r1 = "gdrive-api-v2/backup-version metadata is null."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0da3:
            X.A0e r2 = r3.A03     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            org.json.JSONObject r1 = r13.A04()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r1 = r2.A02(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0dbf
            java.lang.String r1 = "restore>RestoreAction/restore-messages/backup is expired(not supported anymore)."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.9uB r6 = r3.A0I     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r2 = "restore/message backup is expired"
            r1 = r26
            r6.A03(r2, r1, r4)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x11ea
        L_0x0dbf:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "/restore-messages/version of app at time of backup was: "
            r4.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r2 = "unknown"
            if (r8 == 0) goto L_0x0dd5
            java.lang.String r1 = "versionOfAppWhenBackup"
            java.lang.String r2 = r8.optString(r1, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.C18070vi.A0X(r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0dd5:
            X.C17890vO.A1A(r4, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r1 = r37.A05()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != r5) goto L_0x0de2
            java.lang.String r1 = "restore>RestoreAction/restore-messages/cannot start restore, backup in progress."
            goto L_0x0d48
        L_0x0de2:
            X.8s2 r9 = r3.A0F     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = -1
            if (r8 == 0) goto L_0x0dee
            java.lang.String r4 = "chatdbSize"
            long r1 = r8.optLong(r4, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0dee:
            double r6 = (double) r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Double r1 = java.lang.Double.valueOf(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A00 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.9uI r1 = r13.A02()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r1 = r1.A01     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r1 = X.AnonymousClass8BX.A06(r1)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A09 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/restore-messages/stage: load files from google"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.1oW r1 = r14.A0I     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.Map r1 = X.C20127A8m.A04(r1, r13)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r3.A00 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x11ea
            boolean r1 = r37.A0Q()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x11e3
            java.util.Map r1 = r3.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r23 = r1
            java.util.ArrayList r25 = X.C20127A8m.A03(r23)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r1 = r25.size()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r4 = 1
            java.lang.Integer r24 = java.lang.Integer.valueOf(r5)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.8s7 r15 = r3.A0G     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 <= r5) goto L_0x11c6
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r15.A09 = r11     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r6 = X.AnonymousClass8BR.A06(r25)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r16
            java.lang.Long r1 = X.C108945cZ.A1B(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r15.A0E = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A06 = r11     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r6 = X.AnonymousClass8BR.A06(r25)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r16
            java.lang.Long r1 = X.C108945cZ.A1B(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A0C = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0e4f:
            boolean r1 = r35.A01()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x11ea
            java.lang.String r1 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/stage: restore user settings"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.9JN r1 = X.AnonymousClass9JN.A00()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r6 = r1.version     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.Iterator r7 = r25.iterator()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0e64:
            boolean r1 = r7.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x0e91
            X.A2d r1 = X.AnonymousClass8BR.A0I(r7)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r2 = r1.A01()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "msgstore.db"
            int r1 = X.A3K.A00(r2, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 <= r6) goto L_0x0e64
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/contains-newer-backup/true "
            r4.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r4.append(r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = " is newer than the supported"
            X.C17900vP.A0i(r1, r4, r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.8gl r2 = new X.8gl     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2.<init>()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0e90:
            throw r2     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0e91:
            boolean r1 = r25.isEmpty()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x119d
            X.1Wb r2 = r3.A0B     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r21
            r2.A0P(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.Iterator r10 = r25.iterator()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = 0
        L_0x0ea4:
            boolean r6 = r10.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0eb9
            X.A2d r7 = X.AnonymousClass8BR.A0I(r10)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.A55 r6 = r7.A02     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0eb5
            long r6 = r6.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0eb7
        L_0x0eb5:
            long r6 = r7.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0eb7:
            long r1 = r1 + r6
            goto L_0x0ea4
        L_0x0eb9:
            double r6 = (double) r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A00 = r6     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.ArrayList r22 = X.AnonymousClass000.A13()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.1L7 r6 = r3.A09     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r34 = r6
            java.io.File r7 = r34.A03()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r10 = X.C41361wE.A06(r6, r7)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r10 == 0) goto L_0x0f04
            java.util.Iterator r15 = X.AnonymousClass000.A15(r23)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0ed6:
            boolean r6 = r15.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0f04
            java.util.Map$Entry r11 = X.AnonymousClass000.A16(r15)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r6 = X.C17880vN.A0x(r11)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r6 = r6.startsWith(r10)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0ed6
            java.lang.String r7 = X.C17880vN.A0x(r11)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r6 = r34
            java.lang.String r6 = X.C41361wE.A07(r6, r7)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0ed6
            java.lang.Object r11 = r11.getValue()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.io.File r7 = X.C108945cZ.A17(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r6 = r22
            X.AnonymousClass3Ma.A1P(r11, r7, r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0ed6
        L_0x0f04:
            java.util.Iterator r15 = r22.iterator()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r6 = 0
        L_0x0f0a:
            boolean r10 = r15.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r10 == 0) goto L_0x0f25
            java.lang.Object r10 = r15.next()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.0yx r10 = (X.C19760yx) r10     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Object r11 = r10.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.A2d r11 = (X.C19990A2d) r11     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.A55 r10 = r11.A02     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r10 == 0) goto L_0x0f21
            long r10 = r10.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0f23
        L_0x0f21:
            long r10 = r11.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0f23:
            long r6 = r6 + r10
            goto L_0x0f0a
        L_0x0f25:
            double r10 = (double) r6     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Double r10 = java.lang.Double.valueOf(r10)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A05 = r10     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r1 = r1 + r6
            X.AMV r10 = new X.AMV     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r10.<init>(r12, r3, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.0z4 r7 = r3.A0A     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r6 = r3.A0J     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7.A1Z(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r1 = r13.A05     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7.A1n(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r1 = r13.A04     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7.A1o(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r1 = r13.A01()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7.A1m(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r15 = "videoSize"
            r1 = -1
            if (r8 == 0) goto L_0x0f5a
            boolean r11 = r8.has(r15)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r11 == 0) goto L_0x0f76
            long r1 = r8.optLong(r15, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0f5a:
            r7.A1p(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.9uI r1 = r13.A02()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r1 = r1.A01     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7.A1x(r6, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r6 = "backupFrequency"
            r2 = -1
            if (r8 == 0) goto L_0x0f92
            boolean r1 = r8.has(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x0f81
            int r6 = r8.optInt(r6, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0f8b
        L_0x0f76:
            org.json.JSONObject r11 = X.C20007A2x.A00(r13)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r11 == 0) goto L_0x0f5a
            long r1 = r11.optLong(r15, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0f5a
        L_0x0f81:
            org.json.JSONObject r1 = X.C20007A2x.A00(r13)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x0f92
            int r6 = r1.optInt(r6, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0f8b:
            if (r6 < 0) goto L_0x0f92
            r1 = r37
            r1.A0G(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0f92:
            java.lang.String r6 = "backupNetworkSettings"
            if (r8 == 0) goto L_0x0fab
            boolean r1 = r8.has(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x0fa1
            int r2 = r8.optInt(r6, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0fab
        L_0x0fa1:
            org.json.JSONObject r1 = X.C20007A2x.A00(r13)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x0fab
            int r2 = r1.optInt(r6, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0fab:
            r23 = 1
            if (r2 < 0) goto L_0x0fb5
            boolean r1 = r14.A0G(r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r23 = r1 & 1
        L_0x0fb5:
            boolean r2 = r13.A05()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r37
            r1.A0O(r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r2 = "gdrive-api-v2/backup/get-local-settings/failed to parse"
            java.lang.String r1 = "localSettings"
            if (r8 == 0) goto L_0x0fcf
            boolean r6 = r8.has(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0fcf
            org.json.JSONObject r1 = r8.getJSONObject(r1)     // Catch:{ JSONException -> 0x0feb }
            goto L_0x0fdf
        L_0x0fcf:
            org.json.JSONObject r6 = X.C20007A2x.A00(r13)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r6 == 0) goto L_0x0fe5
            boolean r8 = r6.has(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r8 == 0) goto L_0x0fe5
            org.json.JSONObject r1 = r6.getJSONObject(r1)     // Catch:{ JSONException -> 0x0feb }
        L_0x0fdf:
            if (r1 == 0) goto L_0x0fef
            r7.A1z(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0ff4
        L_0x0fe5:
            java.lang.String r1 = "gdrive-api-v2/backup/get-local-settings/localSettings-is-missing"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0fef
        L_0x0feb:
            r1 = move-exception
            com.whatsapp.util.Log.e(r2, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0fef:
            java.lang.String r1 = "restore>RestoreAction/restore-user-settings/local settings are empty"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x0ff4:
            r6 = 10270(0x281e, float:1.4391E-41)
            r2 = r27
            r1 = r28
            boolean r1 = X.C18020vd.A05(r2, r1, r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x10a3
            r6 = 10424(0x28b8, float:1.4607E-41)
            r1 = r28
            int r1 = X.C18020vd.A00(r2, r1, r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r2 = r14.A01(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Long r1 = X.C17880vN.A0n(r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A0D = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r24
            r9.A08 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r1 = r22.size()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r11.<init>(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.concurrent.ThreadPoolExecutor r8 = X.C20134A8u.A03(r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r7.<init>(r5)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r26
            r6.<init>(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.Iterator r13 = r22.iterator()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x1033:
            boolean r1 = r13.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x1058
            java.lang.Object r2 = r13.next()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.0yx r2 = (X.C19760yx) r2     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r33 = 5
            X.Akd r1 = new X.Akd     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r26 = r1
            r27 = r3
            r28 = r2
            r29 = r6
            r30 = r11
            r31 = r10
            r32 = r7
            r26.<init>(r27, r28, r29, r30, r31, r32, r33)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r8.execute(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x1033
        L_0x1058:
            java.lang.String r1 = "restore>RestoreAction/restore-files waiting for all files to be restored."
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ InterruptedException -> 0x1061 }
            r11.await()     // Catch:{ InterruptedException -> 0x1061 }
            goto L_0x106a
        L_0x1061:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r21
            r7.compareAndSet(r5, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x106a:
            java.lang.Object r2 = r6.get()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.9LZ r2 = (X.AnonymousClass9LZ) r2     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r2 == 0) goto L_0x108a
            boolean r1 = r2 instanceof X.C167698go     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0e90
            boolean r1 = r2 instanceof X.C167688gn     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0e90
            boolean r1 = r2 instanceof X.C167638gi     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0e90
            boolean r1 = r2 instanceof X.C167618gg     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0e90
            boolean r1 = r2 instanceof X.C167598ge     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0e90
            boolean r1 = r2 instanceof X.C167678gm     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 != 0) goto L_0x0e90
        L_0x108a:
            boolean r1 = r7.get()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x1096
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A08 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x1096:
            X.4aW r1 = r3.A0H     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1.A0F()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r22 = r7.get()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r22 = r22 & r23
            goto L_0x1131
        L_0x10a3:
            r1 = r24
            r9.A08 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.util.Iterator r15 = r22.iterator()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r22 = 1
        L_0x10ad:
            boolean r1 = r15.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x111c
            java.lang.Object r1 = r15.next()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.0yx r1 = (X.C19760yx) r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Object r13 = r1.A00     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.A2d r13 = (X.C19990A2d) r13     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.Object r8 = r1.A01     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.io.File r8 = (java.io.File) r8     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.A55 r1 = r13.A02     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x1119
            java.lang.String r11 = r1.A03     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x10c7:
            X.1NW r7 = r3.A01     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            long r1 = r8.length()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r6 = r34
            java.lang.String r1 = X.C41361wE.A05(r7, r6, r8, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r1 = r11.equals(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x10df
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/skipping/already-downloaded"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x10ad
        L_0x10df:
            r2 = r35
            r1 = r36
            boolean r1 = X.C20127A8m.A07(r10, r2, r1, r13, r8)     // Catch:{ 8gp -> 0x1110 }
            r22 = r22 & r1
            if (r22 == 0) goto L_0x10f3
            long r1 = r13.A00     // Catch:{ 8gp -> 0x1110 }
            r10.Bqp(r1)     // Catch:{ 8gp -> 0x1110 }
            r6 = r40
            goto L_0x10f7
        L_0x10f3:
            r6 = r39
            long r1 = r13.A00     // Catch:{ 8gp -> 0x1110 }
        L_0x10f7:
            r6.addAndGet(r1)     // Catch:{ 8gp -> 0x1110 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A10()     // Catch:{ 8gp -> 0x1110 }
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/success "
            X.C17900vP.A0N(r8, r1, r6)     // Catch:{ 8gp -> 0x1110 }
            java.lang.String r1 = " size: "
            r6.append(r1)     // Catch:{ 8gp -> 0x1110 }
            long r1 = r8.length()     // Catch:{ 8gp -> 0x1110 }
            X.C17890vO.A16(r6, r1)     // Catch:{ 8gp -> 0x1110 }
            goto L_0x10ad
        L_0x1110:
            r2 = move-exception
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/file-not-found"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r22 = 0
            goto L_0x10ad
        L_0x1119:
            java.lang.String r11 = r13.A03     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x10c7
        L_0x111c:
            if (r22 == 0) goto L_0x1124
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A08 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x1124:
            X.4aW r1 = r3.A0H     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1.A0F()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r22 = r22 & r23
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A0D = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x1131:
            if (r22 != 0) goto L_0x1138
            java.lang.String r1 = "restore>RestoreAction/restore-user-settings/unable to save user settings from google drive to shared prefs"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x1138:
            java.util.Iterator r11 = r25.iterator()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
        L_0x113c:
            boolean r1 = r11.hasNext()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x11ce
            X.A2d r7 = X.AnonymousClass8BR.A0I(r11)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r2 = r7.A06     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r1 = r34
            java.lang.String r6 = X.C41361wE.A07(r1, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r1 == 0) goto L_0x1160
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/no local path for message store backup "
            java.lang.String r1 = X.AnonymousClass001.A1H(r1, r2, r4)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0d48
        L_0x1160:
            java.io.File r9 = X.C108945cZ.A17(r6)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2 = r35
            r1 = r36
            boolean r1 = X.C20127A8m.A07(r10, r2, r1, r7, r9)     // Catch:{ 8gp -> 0x1191 }
            r4 = r4 & r1
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ 8gp -> 0x1191 }
            java.lang.String r1 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/restore file succeeded "
            X.C17900vP.A0N(r9, r1, r8)     // Catch:{ 8gp -> 0x1191 }
            java.lang.String r1 = " size: "
            r8.append(r1)     // Catch:{ 8gp -> 0x1191 }
            long r1 = r9.length()     // Catch:{ 8gp -> 0x1191 }
            X.C17890vO.A16(r8, r1)     // Catch:{ 8gp -> 0x1191 }
            if (r4 == 0) goto L_0x1189
            long r1 = r7.A00     // Catch:{ 8gp -> 0x1191 }
            r7 = r40
            goto L_0x118d
        L_0x1189:
            long r1 = r7.A00     // Catch:{ 8gp -> 0x1191 }
            r7 = r39
        L_0x118d:
            r7.addAndGet(r1)     // Catch:{ 8gp -> 0x1191 }
            goto L_0x113c
        L_0x1191:
            r2 = move-exception
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/file-not-found "
            X.C17900vP.A0h(r1, r6, r4, r2)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0e90
        L_0x119d:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/weird situation, no message backup file found for \""
            r2.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2.append(r10)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "\" (while remote file list size is: "
            r2.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            X.C17960vV.A07(r23)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            int r1 = r23.size()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = ")"
            X.C17890vO.A19(r2, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "no message backup file found in remote file list"
            X.8gp r2 = new X.8gp     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r2.<init>((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0e90
        L_0x11c6:
            r1 = r24
            r15.A09 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r9.A06 = r1     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x0e4f
        L_0x11ce:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            java.lang.String r1 = "restore>RestoreAction/restoreMessageStoreBaseAndIncrementsFromRemote/stage: restoring message store backup files finished with "
            r2.append(r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            if (r4 == 0) goto L_0x11da
            goto L_0x11dd
        L_0x11da:
            java.lang.String r1 = "failure"
            goto L_0x11df
        L_0x11dd:
            java.lang.String r1 = "success"
        L_0x11df:
            X.C17890vO.A1A(r2, r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            goto L_0x11eb
        L_0x11e3:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/skipping google drive db download, we are using local"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x12e6, 8go -> 0x12b8, 8gp -> 0x129e, 8gi -> 0x128f, 8gg -> 0x1280, 8gm -> 0x1271, 8gl -> 0x1261, 8ge -> 0x1251, all -> 0x1379 }
            r4 = 1
            goto L_0x11eb
        L_0x11ea:
            r4 = 0
        L_0x11eb:
            X.8s2 r2 = r3.A0F     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            java.lang.Double r6 = r2.A00     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            if (r6 == 0) goto L_0x1204
            java.lang.Double r1 = r2.A05     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            if (r1 == 0) goto L_0x1204
            double r8 = r6.doubleValue()     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            double r6 = r1.doubleValue()     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            double r8 = r8 + r6
            java.lang.Double r1 = java.lang.Double.valueOf(r8)     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r2.A02 = r1     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
        L_0x1204:
            if (r4 != 0) goto L_0x1215
            X.9ug r6 = r3.A06     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r1 = 14
            r6.A05(r1)     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            java.lang.Integer r1 = X.C17880vN.A0l()     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r2.A07 = r1     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            goto L_0x12f4
        L_0x1215:
            X.9ug r6 = r3.A06     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r1 = 10
            r6.A05(r1)     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            long r6 = r40.get()     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x1238
            long r6 = r39.get()     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x1238
            r1 = 41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r2.A07 = r1     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            goto L_0x12f4
        L_0x1238:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            r2.A07 = r1     // Catch:{ 8gn -> 0x124e, 8go -> 0x124c, 8gp -> 0x124a, 8gi -> 0x1248, 8gg -> 0x1246, 8gm -> 0x1244, 8gl -> 0x1242, 8ge -> 0x1240 }
            goto L_0x12f4
        L_0x1240:
            r6 = move-exception
            goto L_0x1253
        L_0x1242:
            r6 = move-exception
            goto L_0x1263
        L_0x1244:
            r6 = move-exception
            goto L_0x1273
        L_0x1246:
            r6 = move-exception
            goto L_0x1282
        L_0x1248:
            r6 = move-exception
            goto L_0x1291
        L_0x124a:
            r7 = move-exception
            goto L_0x12a0
        L_0x124c:
            r2 = move-exception
            goto L_0x12ba
        L_0x124e:
            r6 = move-exception
            goto L_0x12e8
        L_0x1251:
            r6 = move-exception
            r4 = 0
        L_0x1253:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 25
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x1261:
            r6 = move-exception
            r4 = 0
        L_0x1263:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 24
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: backup generated by a newer version of the app"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x1271:
            r6 = move-exception
            r4 = 0
        L_0x1273:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 23
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x1280:
            r6 = move-exception
            r4 = 0
        L_0x1282:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 19
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x128f:
            r6 = move-exception
            r4 = 0
        L_0x1291:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 15
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x129e:
            r7 = move-exception
            r4 = 0
        L_0x12a0:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 17
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: backup file not found"
            com.whatsapp.util.Log.e(r1, r7)     // Catch:{ all -> 0x137c }
            X.9uB r6 = r3.A0I     // Catch:{ all -> 0x137c }
            java.lang.String r2 = "restore/file-not-found"
            java.lang.String r1 = r7.getMessage()     // Catch:{ all -> 0x137c }
            r6.A03(r2, r1, r5)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x12b8:
            r2 = move-exception
            r4 = 0
        L_0x12ba:
            java.lang.String r1 = "restore>RestoreAction/failure: auth failed because accessing google account permission is missing"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x137c }
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x137c }
            if (r1 != 0) goto L_0x12d2
            java.lang.String r1 = "restore>RestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x137c }
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x12d2:
            boolean r1 = r1 instanceof X.BYF     // Catch:{ all -> 0x137c }
            if (r1 == 0) goto L_0x12de
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 21
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x12de:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            goto L_0x12f4
        L_0x12e6:
            r6 = move-exception
            r4 = 0
        L_0x12e8:
            X.9ug r2 = r3.A06     // Catch:{ all -> 0x137c }
            r1 = 12
            r2.A05(r1)     // Catch:{ all -> 0x137c }
            java.lang.String r1 = "restore>RestoreAction/failure: account not present on device anymore"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ all -> 0x137c }
        L_0x12f4:
            r1 = r20
            X.C20737AWs.A00(r12, r1, r4)     // Catch:{ all -> 0x1383 }
            java.util.Locale r10 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x1383 }
            java.lang.String r9 = "total wall time for message restore: %.1f seconds."
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x1383 }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1383 }
            long r1 = r37.A06()     // Catch:{ all -> 0x1383 }
            long r6 = r6 - r1
            double r1 = (double) r6     // Catch:{ all -> 0x1383 }
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r6
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ all -> 0x1383 }
            r8[r21] = r1     // Catch:{ all -> 0x1383 }
            X.C108955ca.A1X(r9, r10, r8)     // Catch:{ all -> 0x1383 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1383 }
            java.lang.String r1 = "restore>RestoreAction/finished with success status: "
            X.C17900vP.A0n(r1, r2, r4)     // Catch:{ all -> 0x1383 }
            java.util.Map r1 = r3.A00     // Catch:{ all -> 0x1383 }
            r26 = r1
            int r2 = r14.A00
            if (r2 != r5) goto L_0x1372
            X.8s2 r2 = r3.A0F
            java.lang.Long r19 = java.lang.Long.valueOf(r16)
        L_0x132f:
            r1 = r19
            r2.A0A = r1
        L_0x1333:
            long r4 = java.lang.System.currentTimeMillis()
            X.8s2 r6 = r3.A0F
            long r1 = r37.A06()
            long r4 = r4 - r1
            r2 = r40
            r1 = r39
            X.C161048Be.A07(r6, r2, r1, r4)
            X.A7X r4 = r3.A08
            r1 = r38
            X.C161048Be.A05(r4, r3, r6, r1)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r18)
            int r1 = r4.A03()
            X.C17900vP.A0o(r2, r1)
            java.lang.Integer r1 = r6.A07
        L_0x1359:
            java.lang.String r3 = X.C17900vP.A08(r1)
            android.content.SharedPreferences$Editor r2 = X.AnonymousClass8BT.A04(r37)
            java.lang.String r1 = "google_restore_result"
            android.content.SharedPreferences$Editor r4 = r2.putString(r1, r3)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.String r1 = "google_restore_timestamp"
            X.C17880vN.A1D(r4, r1, r2)
            goto L_0x0c9b
        L_0x1372:
            r1 = r20
            if (r2 != r1) goto L_0x1333
            X.8s2 r2 = r3.A0F
            goto L_0x132f
        L_0x1379:
            r1 = move-exception
            r4 = 0
            goto L_0x137d
        L_0x137c:
            r1 = move-exception
        L_0x137d:
            r0 = r20
            X.C20737AWs.A00(r12, r0, r4)     // Catch:{ all -> 0x1383 }
            throw r1     // Catch:{ all -> 0x1383 }
        L_0x1383:
            r8 = move-exception
            int r1 = r14.A00
            if (r1 == r5) goto L_0x13d2
            r0 = r20
            if (r1 != r0) goto L_0x1392
            X.8s2 r1 = r3.A0F
        L_0x138e:
            r0 = r19
            r1.A0A = r0
        L_0x1392:
            long r4 = java.lang.System.currentTimeMillis()
            X.8s2 r7 = r3.A0F
            X.1NP r6 = r3.A02
            long r0 = r6.A06()
            long r4 = r4 - r0
            r1 = r40
            r0 = r39
            X.C161048Be.A07(r7, r1, r0, r4)
            X.A7X r2 = r3.A08
            r0 = r38
            X.C161048Be.A05(r2, r3, r7, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r18)
            int r0 = r2.A03()
            X.C17900vP.A0o(r1, r0)
            java.lang.Integer r0 = r7.A07
            java.lang.String r2 = X.C17900vP.A08(r0)
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BT.A04(r6)
            java.lang.String r0 = "google_restore_result"
            android.content.SharedPreferences$Editor r3 = r1.putString(r0, r2)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "google_restore_timestamp"
            X.C17880vN.A1D(r3, r0, r1)
            throw r8
        L_0x13d2:
            X.8s2 r1 = r3.A0F
            java.lang.Long r19 = java.lang.Long.valueOf(r16)
            goto L_0x138e
        L_0x13d9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x13d9 }
            throw r0
        L_0x13dc:
            X.1NW r1 = r0.A03
            boolean r1 = r1.A03()
            if (r1 != 0) goto L_0x13f2
            java.lang.String r1 = "gdrive-service/handle-intent/backup/read-storage-permission-denied/aborting-backup"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.9ug r2 = r0.A07
            r1 = 23
        L_0x13ed:
            r2.A05(r1)
            goto L_0x1719
        L_0x13f2:
            X.00H r1 = r0.A0Y
            boolean r1 = X.AnonymousClass8BW.A1T(r1)
            if (r1 == 0) goto L_0x13fe
            java.lang.String r1 = "gdrive-service/handle-intent/backup cannot start backup, media restore in pending"
            goto L_0x1714
        L_0x13fe:
            X.1oU r1 = r0.A06
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0P
            boolean r1 = r1.getAndSet(r3)
            if (r1 == 0) goto L_0x140c
            java.lang.String r1 = "gdrive-service/handle-intent/backup another backup is already running."
            goto L_0x1714
        L_0x140c:
            X.00H r1 = r0.A0Y
            X.1NP r1 = X.AnonymousClass8BS.A0A(r1)
            int r1 = r1.A02()
            r2 = 10
            if (r1 == r2) goto L_0x141f
            X.9ug r1 = r0.A07
            r1.A05(r2)
        L_0x141f:
            X.00H r1 = r0.A0b
            java.lang.Object r2 = r1.get()
            X.1O1 r2 = (X.AnonymousClass1O1) r2
            java.lang.String r1 = "gdrive_backup"
            r2.A01(r1, r3)
            X.1oU r1 = r0.A06     // Catch:{ all -> 0x157a }
            r1.A02()     // Catch:{ all -> 0x157a }
            java.lang.String r45 = r0.A00()     // Catch:{ all -> 0x157a }
            if (r45 != 0) goto L_0x1441
            java.lang.String r1 = "gdrive-service/handle-intent/backup jid is null."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x157a }
            X.C161048Be.A04(r0)
            goto L_0x1719
        L_0x1441:
            boolean r1 = r0.A0j     // Catch:{ all -> 0x157a }
            if (r1 != 0) goto L_0x1452
            java.util.ArrayList r2 = r0.A0l     // Catch:{ all -> 0x157a }
            X.17r r1 = r0.A00     // Catch:{ all -> 0x157a }
            java.util.ArrayList r1 = X.C20134A8u.A02(r1)     // Catch:{ all -> 0x157a }
            r2.addAll(r1)     // Catch:{ all -> 0x157a }
            r0.A0j = r3     // Catch:{ all -> 0x157a }
        L_0x1452:
            X.11P r1 = r0.A0G     // Catch:{ all -> 0x157a }
            r35 = r1
            X.0ve r1 = r0.A0P     // Catch:{ all -> 0x157a }
            r39 = r1
            X.17r r1 = r0.A00     // Catch:{ all -> 0x157a }
            r52 = r1
            X.18K r1 = r0.A0Q     // Catch:{ all -> 0x157a }
            r40 = r1
            X.1L7 r1 = r0.A0D     // Catch:{ all -> 0x157a }
            r33 = r1
            X.00H r1 = r0.A0d     // Catch:{ all -> 0x157a }
            X.1OZ r42 = X.C17880vN.A0U(r1)     // Catch:{ all -> 0x157a }
            X.1NT r1 = r0.A05     // Catch:{ all -> 0x157a }
            r51 = r1
            X.00H r1 = r0.A0f     // Catch:{ all -> 0x157a }
            java.lang.Object r10 = r1.get()     // Catch:{ all -> 0x157a }
            X.1Q5 r10 = (X.AnonymousClass1Q5) r10     // Catch:{ all -> 0x157a }
            X.00H r1 = r0.A0c     // Catch:{ all -> 0x157a }
            java.lang.Object r9 = r1.get()     // Catch:{ all -> 0x157a }
            X.AMX r9 = (X.AMX) r9     // Catch:{ all -> 0x157a }
            X.1NM r1 = r0.A0E     // Catch:{ all -> 0x157a }
            r34 = r1
            X.1Wb r1 = r0.A0K     // Catch:{ all -> 0x157a }
            r37 = r1
            X.1Cd r1 = r0.A0M     // Catch:{ all -> 0x157a }
            r26 = r1
            X.A0f r1 = r0.A0B     // Catch:{ all -> 0x157a }
            r25 = r1
            X.0z4 r1 = r0.A0I     // Catch:{ all -> 0x157a }
            r23 = r1
            X.A0L r1 = r0.A0C     // Catch:{ all -> 0x157a }
            r22 = r1
            X.00H r1 = r0.A0Z     // Catch:{ all -> 0x157a }
            java.lang.Object r8 = r1.get()     // Catch:{ all -> 0x157a }
            X.1NO r8 = (X.AnonymousClass1NO) r8     // Catch:{ all -> 0x157a }
            X.1NW r1 = r0.A03     // Catch:{ all -> 0x157a }
            r21 = r1
            X.00H r1 = r0.A0X     // Catch:{ all -> 0x157a }
            r18 = r1
            X.00H r1 = r0.A0Y     // Catch:{ all -> 0x157a }
            X.1NP r19 = X.AnonymousClass8BS.A0A(r1)     // Catch:{ all -> 0x157a }
            X.9oH r1 = r0.A04     // Catch:{ all -> 0x157a }
            r20 = r1
            X.9zq r1 = r0.A0A     // Catch:{ all -> 0x157a }
            r17 = r1
            X.1oU r1 = r0.A06     // Catch:{ all -> 0x157a }
            r24 = r1
            java.util.ArrayList r15 = r0.A0l     // Catch:{ all -> 0x157a }
            X.1oY r1 = r0.A08     // Catch:{ all -> 0x157a }
            java.util.concurrent.atomic.AtomicLong r14 = r1.A07     // Catch:{ all -> 0x157a }
            java.util.concurrent.atomic.AtomicLong r13 = r1.A06     // Catch:{ all -> 0x157a }
            X.9ug r2 = r0.A07     // Catch:{ all -> 0x157a }
            java.lang.String r1 = "backup"
            X.A7X r31 = r2.A01(r7, r1)     // Catch:{ all -> 0x157a }
            X.9ug r3 = r0.A07     // Catch:{ all -> 0x157a }
            X.1oU r2 = r0.A06     // Catch:{ all -> 0x157a }
            X.1oY r1 = r0.A08     // Catch:{ all -> 0x157a }
            X.8gZ r12 = new X.8gZ     // Catch:{ all -> 0x157a }
            r12.<init>(r2, r3, r1)     // Catch:{ all -> 0x157a }
            X.00H r1 = r0.A0e     // Catch:{ all -> 0x157a }
            java.lang.Object r5 = r1.get()     // Catch:{ all -> 0x157a }
            X.8yN r5 = (X.C175238yN) r5     // Catch:{ all -> 0x157a }
            X.9ug r11 = r0.A07     // Catch:{ all -> 0x157a }
            java.lang.Object r4 = r11.A0D     // Catch:{ all -> 0x157a }
            monitor-enter(r4)     // Catch:{ all -> 0x157a }
            X.8sQ r3 = new X.8sQ     // Catch:{ all -> 0x1577 }
            r3.<init>()     // Catch:{ all -> 0x1577 }
            r11.A01 = r3     // Catch:{ all -> 0x1577 }
            java.lang.Integer r1 = X.C17880vN.A0h()     // Catch:{ all -> 0x1577 }
            r3.A0d = r1     // Catch:{ all -> 0x1577 }
            X.1NP r2 = r11.A06     // Catch:{ all -> 0x1577 }
            int r1 = X.C20134A8u.A00(r2, r6)     // Catch:{ all -> 0x1577 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x1577 }
            r3.A0e = r1     // Catch:{ all -> 0x1577 }
            X.8sQ r1 = r11.A01     // Catch:{ all -> 0x1577 }
            int r2 = r2.A04()     // Catch:{ all -> 0x1577 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x1577 }
            r1.A0a = r2     // Catch:{ all -> 0x1577 }
            X.8sQ r11 = r11.A01     // Catch:{ all -> 0x1577 }
            monitor-exit(r4)     // Catch:{ all -> 0x1577 }
            X.1DK r1 = r0.A0N     // Catch:{ all -> 0x157a }
            r4 = 1
            X.A0e r3 = new X.A0e     // Catch:{ all -> 0x157a }
            r3.<init>(r1)     // Catch:{ all -> 0x157a }
            r2 = 0
            X.AMb r1 = new X.AMb     // Catch:{ all -> 0x157a }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x157a }
            X.AMa r16 = new X.AMa     // Catch:{ all -> 0x157a }
            r27 = r17
            r28 = r25
            r29 = r12
            r30 = r22
            r32 = r1
            r36 = r23
            r38 = r26
            r41 = r11
            r43 = r10
            r44 = r18
            r46 = r15
            r47 = r14
            r48 = r13
            r49 = r6
            r50 = r2
            r17 = r52
            r18 = r21
            r21 = r3
            r22 = r8
            r23 = r51
            r25 = r5
            r26 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x157a }
            boolean r1 = r16.A07()     // Catch:{ all -> 0x157a }
            X.C161048Be.A04(r0)
            if (r1 == 0) goto L_0x1719
            X.1NT r1 = r0.A05
            boolean r1 = r1.A04()
            if (r1 == 0) goto L_0x1719
            X.0z4 r1 = r0.A0I
            int r1 = r1.A0M(r7)
            if (r1 != r4) goto L_0x1719
            X.19K r3 = r0.A0W
            java.util.Random r5 = r0.A0h
            X.0z4 r2 = r0.A0I
            X.00H r1 = r0.A0Y
            X.1NP r1 = X.AnonymousClass8BS.A0A(r1)
            r6 = r6 ^ 1
            java.lang.Integer r4 = X.AnonymousClass00R.A01
            com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A02(r1, r2, r3, r4, r5, r6)
            goto L_0x1719
        L_0x1577:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x1577 }
            throw r1     // Catch:{ all -> 0x157a }
        L_0x157a:
            r1 = move-exception
            X.C161048Be.A04(r0)
            throw r1
        L_0x157f:
            java.lang.String r1 = "gdrive-service/handle-intent/backup automated backup called too early, ignored"
            goto L_0x16cf
        L_0x1583:
            java.lang.String r1 = "jid_user"
            java.lang.String r8 = r8.getStringExtra(r1)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            if (r8 != 0) goto L_0x1591
            java.lang.String r1 = "gdrive-service/handle-intent DELETE called with no number."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            goto L_0x1602
        L_0x1591:
            X.9ug r2 = r0.A07     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            r1 = r26
            X.A7X r10 = r2.A01(r7, r1)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            X.1oU r5 = r0.A06     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            X.1oW r2 = r5.A0I     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            java.lang.String r1 = "delete-condition"
            X.8gX r7 = new X.8gX     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            r7.<init>(r5, r2, r1)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            boolean r1 = X.C20127A8m.A09(r7, r10)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            r5 = 0
            if (r1 != 0) goto L_0x15b1
            java.lang.String r1 = "gdrive-service/delete-backup/failed-to-fetch-auth-token"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            goto L_0x15c7
        L_0x15b1:
            X.8gA r2 = new X.8gA     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            r2.<init>(r0, r10, r8)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            java.lang.String r1 = "gdrive-service/delete-backup"
            java.lang.Object r1 = X.A84.A00(r2, r7, r1)     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            if (r1 == 0) goto L_0x15c7
            boolean r1 = r1.booleanValue()     // Catch:{ 8gn -> 0x15f0, 8go -> 0x15e9, 8gg -> 0x15e6, 8ge -> 0x15df, all -> 0x1613 }
            if (r1 == 0) goto L_0x15c7
            r5 = 1
        L_0x15c7:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x15dd, 8go -> 0x15db, 8gg -> 0x15d9, 8ge -> 0x15d7 }
            java.lang.String r1 = "gdrive-service/handle-intent/delete-all-files/"
            r2.append(r1)     // Catch:{ 8gn -> 0x15dd, 8go -> 0x15db, 8gg -> 0x15d9, 8ge -> 0x15d7 }
            if (r5 != 0) goto L_0x15d3
            r3 = r11
        L_0x15d3:
            X.C17890vO.A1A(r2, r3)     // Catch:{ 8gn -> 0x15dd, 8go -> 0x15db, 8gg -> 0x15d9, 8ge -> 0x15d7 }
            goto L_0x1603
        L_0x15d7:
            r3 = move-exception
            goto L_0x15e1
        L_0x15d9:
            r3 = move-exception
            goto L_0x15f7
        L_0x15db:
            r3 = move-exception
            goto L_0x15eb
        L_0x15dd:
            r3 = move-exception
            goto L_0x15f2
        L_0x15df:
            r3 = move-exception
            r5 = 0
        L_0x15e1:
            X.9ug r2 = r0.A07     // Catch:{ all -> 0x1611 }
            r1 = 25
            goto L_0x15fb
        L_0x15e6:
            r3 = move-exception
            r5 = 0
            goto L_0x15f7
        L_0x15e9:
            r3 = move-exception
            r5 = 0
        L_0x15eb:
            X.9ug r2 = r0.A07     // Catch:{ all -> 0x1611 }
            r1 = 11
            goto L_0x15fb
        L_0x15f0:
            r3 = move-exception
            r5 = 0
        L_0x15f2:
            X.9ug r2 = r0.A07     // Catch:{ all -> 0x1611 }
            r1 = 12
            goto L_0x15fb
        L_0x15f7:
            X.9ug r2 = r0.A07     // Catch:{ all -> 0x1611 }
            r1 = 19
        L_0x15fb:
            r2.A05(r1)     // Catch:{ all -> 0x1611 }
            com.whatsapp.util.Log.e(r9, r3)     // Catch:{ all -> 0x1611 }
            goto L_0x1603
        L_0x1602:
            r5 = 0
        L_0x1603:
            r6.set(r4)
            X.00H r1 = r0.A0e
            X.10T r1 = X.C17880vN.A0V(r1)
            X.C20737AWs.A00(r1, r4, r5)
            goto L_0x1719
        L_0x1611:
            r1 = move-exception
            goto L_0x1615
        L_0x1613:
            r1 = move-exception
            r5 = 0
        L_0x1615:
            r6.set(r4)
            X.00H r0 = r0.A0e
            X.10T r0 = X.C17880vN.A0V(r0)
            X.C20737AWs.A00(r0, r4, r5)
            throw r1
        L_0x1622:
            if (r5 != 0) goto L_0x1628
            java.lang.String r1 = "gdrive-service/handle-intent change number requested but new phone number was not passed in the request."
            goto L_0x1714
        L_0x1628:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive-service/handle-intent about to change number from "
            r2.append(r1)
            r2.append(r6)
            java.lang.String r4 = " to "
            X.C17900vP.A0f(r4, r5, r2)
            java.lang.String r9 = "gdrive-service/change-number-v2"
            r11 = 19
            r10 = 11
            r12 = 0
            X.9ug r2 = r0.A07     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            r1 = r26
            X.A7X r2 = r2.A01(r7, r1)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.1oU r1 = r0.A06     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.1oW r1 = r1.A0I     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            boolean r1 = X.C20127A8m.A09(r1, r2)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            if (r1 != 0) goto L_0x165d
            java.lang.String r1 = "gdrive-service/change-number/failed-to-fetch-auth-token"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.9ug r1 = r0.A07     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            r1.A05(r10)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            goto L_0x16be
        L_0x165d:
            X.1oU r1 = r0.A06     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.1oW r1 = r1.A0I     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.A2x r3 = X.C20127A8m.A01(r1, r2, r6, r9)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            if (r3 != 0) goto L_0x1679
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            java.lang.String r1 = "gdrive-service/change-number-v2 fetching backup name "
            r2.append(r1)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            r2.append(r6)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            java.lang.String r1 = " returned null, unexpected."
            X.C17890vO.A19(r2, r1)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            goto L_0x16be
        L_0x1679:
            X.1oU r1 = r0.A06     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.1oW r2 = r1.A0I     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            X.8gJ r1 = new X.8gJ     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            r1.<init>(r0, r3, r5, r6)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            java.lang.Object r1 = X.A84.A00(r1, r2, r9)     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            if (r1 == 0) goto L_0x16be
            boolean r1 = r1.booleanValue()     // Catch:{ 8gn -> 0x16b1, 8go -> 0x169e, 8gd | 8gg -> 0x1697, 8gp -> 0x16a5, 8ge -> 0x1691 }
            if (r1 == 0) goto L_0x16be
            goto L_0x16bd
        L_0x1691:
            r3 = move-exception
            X.9ug r2 = r0.A07
            r1 = 25
            goto L_0x16aa
        L_0x1697:
            r3 = move-exception
            X.9ug r1 = r0.A07
            r1.A05(r11)
            goto L_0x16ad
        L_0x169e:
            r3 = move-exception
            X.9ug r1 = r0.A07
            r1.A05(r10)
            goto L_0x16ad
        L_0x16a5:
            r3 = move-exception
            X.9ug r2 = r0.A07
            r1 = 17
        L_0x16aa:
            r2.A05(r1)
        L_0x16ad:
            com.whatsapp.util.Log.e(r9, r3)
            goto L_0x16be
        L_0x16b1:
            r3 = move-exception
            X.9ug r2 = r0.A07
            r1 = 12
            r2.A05(r1)
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)
            goto L_0x16be
        L_0x16bd:
            r12 = 1
        L_0x16be:
            java.lang.String r1 = "gdrive-service/handle-intent change number (from old number "
            java.lang.StringBuilder r2 = X.C17900vP.A0H(r1, r6, r4)
            if (r12 == 0) goto L_0x16d3
            r2.append(r5)
            java.lang.String r1 = ") succeeded."
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)
        L_0x16cf:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x1719
        L_0x16d3:
            r2.append(r5)
            java.lang.String r1 = ") failed."
            java.lang.String r1 = X.AnonymousClass000.A0y(r1, r2)
            goto L_0x1714
        L_0x16dd:
            X.0z4 r2 = r0.A0I
            r2.A1V(r1)
            X.0z4 r2 = r0.A0I
            java.lang.String r2 = r2.A0f()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x1701
            android.os.Bundle r2 = r8.getExtras()
            java.lang.String r1 = "remove_account_name"
            boolean r1 = r2.getBoolean(r1)
            if (r1 == 0) goto L_0x1701
            X.0z4 r2 = r0.A0I
            r1 = r26
            r2.A1Z(r1)
        L_0x1701:
            X.00H r1 = r0.A0e
            X.10T r3 = X.C17880vN.A0V(r1)
            r1 = 11
            X.AWq r2 = new X.AWq
            r2.<init>(r1)
        L_0x170e:
            r3.notifyAllObservers(r2)
            goto L_0x1719
        L_0x1712:
            java.lang.String r1 = "gdrive-service/handle-intent action resume_restore but no restore pending."
        L_0x1714:
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x1717:
            if (r56 == 0) goto L_0x172e
        L_0x1719:
            java.lang.Object r3 = r0.A0o
            monitor-enter(r3)
            int r2 = r0.A0k     // Catch:{ all -> 0x172b }
            if (r2 <= 0) goto L_0x1729
            r1 = 1
            int r2 = r2 - r1
            r0.A0k = r2     // Catch:{ all -> 0x172b }
            if (r2 != 0) goto L_0x1729
            r0.stopForeground(r1)     // Catch:{ all -> 0x172b }
        L_0x1729:
            monitor-exit(r3)     // Catch:{ all -> 0x172b }
            return
        L_0x172b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x172b }
            throw r0
        L_0x172e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.backup.google.GoogleBackupService.onHandleIntent(android.content.Intent):void");
    }

    public IBinder onBind(Intent intent) {
        return this.A0n;
    }

    public void onCreate() {
        A08();
        super.onCreate();
        this.A09.A06();
    }

    public void onDestroy() {
        super.onDestroy();
        C175238yN r1 = (C175238yN) this.A0e.get();
        r1.A00 = -1;
        r1.A01 = -1;
        C36841oY r3 = this.A08;
        r3.A06.set(0);
        r3.A05.set(0);
        r3.A04.set(0);
        r3.A07.set(0);
        r3.A03.set(0);
        this.A09.A07();
        this.A06.A0W.set(false);
        C21457AkO.A01(this.A0V, this, 29);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        Notification notification;
        int onStartCommand = super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return onStartCommand;
        }
        synchronized (this.A0o) {
            C39571tI.A00(this.A0H.A00, this.A0F);
            Notification A042 = this.A09.A04(AnonymousClass3MW.A05(this.A0H), intent.getAction());
            if (!(this.A0k == 0 || (notification = this.A09.A0U) == null)) {
                A042 = notification;
            }
            this.A09.A05();
            try {
                startForeground(5, A042);
                this.A0k++;
            } catch (IllegalStateException e) {
                Log.w("Failed to start foreground service GoogleBackupService", e);
                stopSelf();
            }
        }
        return onStartCommand;
    }

    public void onTimeout(int i, int i2) {
        super.onTimeout(i, i2);
        this.A06.A0W.set(false);
    }
}
