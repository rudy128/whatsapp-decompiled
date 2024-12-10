package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallState;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Ao  reason: invalid class name and case insensitive filesystem */
public class C70313Ao implements AnonymousClass1IV {
    public List A00;
    public final C61962qZ A01;
    public final AnonymousClass118 A02;
    public final C27301Vn A03;
    public final C19830z4 A04;
    public final AnonymousClass1TD A05;
    public final AnonymousClass1NN A06;
    public final AnonymousClass1Cd A07;
    public final AnonymousClass1Nb A08;
    public final AnonymousClass10I A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass1KB A0B;
    public final C28721an A0C;
    public final AnonymousClass1HS A0D;
    public final AnonymousClass1M9 A0E;
    public final C24921Me A0F;
    public final C27201Vd A0G;
    public final AnonymousClass11C A0H;
    public final C18000vb A0I;
    public final C18030ve A0J;
    public final AnonymousClass126 A0K;
    public final C24901Mc A0L;
    public final C27231Vg A0M;
    public final AnonymousClass00H A0N;
    public final AnonymousClass00H A0O;
    public final AnonymousClass00H A0P = C221618v.A00(AnonymousClass16P.class);

    public static synchronized void A02(C70313Ao r7) {
        ArrayList A13;
        synchronized (r7) {
            C61962qZ r4 = r7.A01;
            if (r4 != null) {
                C19830z4 r2 = r7.A04;
                AnonymousClass1TD r3 = r7.A05;
                C18070vi.A0h(r2, r3);
                r4.A00.execute(new C21368Aix(r2, r3, r4, (Object) null, 44));
            }
            if (r7.A00 == null) {
                long j = C17890vO.A0B(r7.A04).getLong("first_missed_call", 0);
                if (j > 0) {
                    A13 = r7.A05.A08(j);
                } else {
                    A13 = AnonymousClass000.A13();
                }
                r7.A00 = A13;
                StringBuilder A10 = AnonymousClass000.A10();
                C17890vO.A14("missedcallnotification/init count:", A10, A13);
                C17900vP.A0m(" timestamp:", A10, j);
            }
        }
    }

    public void A05() {
        C17900vP.A0n("missedcallnotification/clearNotification updateHash=", AnonymousClass000.A10(), true);
        C27301Vn r4 = this.A03;
        r4.BEJ(4, "MissedCallNotification1");
        C61962qZ r3 = this.A01;
        if (r3 != null) {
            r3.A00.execute(new C21431Ajy(r4, r3, 28));
        }
        C19830z4 r32 = this.A04;
        C17880vN.A1E(C19830z4.A00(r32), "dismissed_call_notification_hash", C17880vN.A0r(C17890vO.A0B(r32), "last_call_notification_hash"));
        C17880vN.A1E(C19830z4.A00(r32), "dismissed_missed_call_notification_key_list", (String) null);
    }

    public /* synthetic */ void Bmn() {
    }

    public /* synthetic */ void Bn7(C178119Bw r1) {
    }

    public void BnG(C178119Bw r11, boolean z) {
        C178119Bw r5 = r11;
        if (r11.A0A() != C179559Il.A04) {
            A02(this);
            C61962qZ r7 = this.A01;
            if (r7 != null) {
                C19830z4 r6 = this.A04;
                C53622cp r8 = new C53622cp(this, z);
                C18070vi.A0d(r6, 0);
                r7.A00.execute(new C21368Aix(r5, r6, r7, r8, 45));
            } else {
                if (this.A00.isEmpty()) {
                    C19830z4 r0 = this.A04;
                    C17880vN.A1D(C19830z4.A00(r0), "first_missed_call", r11.A01);
                }
                synchronized (this) {
                    this.A00.add(r11);
                }
                this.A09.CGF(new C70813Cp(20, (Object) this, z));
            }
            this.A06.A00();
        }
    }

    public /* synthetic */ void BnH(long j, boolean z, boolean z2, boolean z3, boolean z4) {
    }

    public /* synthetic */ void BnJ(C178119Bw r1) {
    }

    public /* synthetic */ void BnK(AnonymousClass1BI r1, CallState callState, String str) {
    }

    public /* synthetic */ void C5e() {
    }

    private String A00(C178119Bw r7) {
        if (r7.A0C == null) {
            return null;
        }
        boolean A0W = r7.A0W();
        GroupJid groupJid = r7.A0C;
        AnonymousClass1M9 r3 = this.A0E;
        C24921Me r2 = this.A0F;
        AnonymousClass1E7 A012 = C63982u1.A01(r3, this.A0K, groupJid, this.A0L, A0W);
        if (A012 != null) {
            return r2.A0T(A012, -1);
        }
        return null;
    }

    public static void A01(Notification notification, C70313Ao r5, int i, boolean z) {
        String A002;
        try {
            if (!(r5.A01 == null || i == 0)) {
                r5.A03.BEJ(i + 4, "Cancel MissedCallNotification");
            }
            r5.A03.BkR(i + 4, notification);
        } catch (SecurityException e) {
            if (!z && C39761tb.A05() && Build.VERSION.SDK_INT >= 26 && (A002 = AnonymousClass2SL.A00(notification)) != null) {
                AnonymousClass1Nb r1 = r5.A08;
                String A012 = C39591tK.A01(A002);
                if (A012 != null) {
                    r1.A0s(AnonymousClass1Nb.A01(r1, A012));
                    return;
                }
            }
            String obj = e.toString();
            C17960vV.A0F(false, "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier");
            if (!obj.contains("android.permission.UPDATE_APP_OPS_STATS") && !C39761tb.A0B()) {
                throw e;
            }
        }
        r5.A0C.A01();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:128:0x031a, code lost:
        if (r13.A0P(r11) != false) goto L_0x031c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r6.A0J == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r6.A0J != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0522, code lost:
        if (r13 == 0) goto L_0x053a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0526, code lost:
        if (r13 == 1) goto L_0x0534;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0528, code lost:
        if (r13 != 2) goto L_0x0531;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x052a, code lost:
        r0 = new long[]{0, 750, 250, 750, 250};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x052f, code lost:
        r11.vibrate = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0531, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0534, code lost:
        r0 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x053a, code lost:
        r2.A06(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x055d, code lost:
        if (r0 == false) goto L_0x0521;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        if (r6.A0O() == false) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r6.A0W() == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        if (r6.A0O() != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r6.A0R() == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
        if (r11 != false) goto L_0x00eb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A03(java.util.List r32, int r33, boolean r34) {
        /*
            r31 = this;
            r5 = r34
            r4 = r31
            X.118 r0 = r4.A02
            android.content.Context r3 = r0.A00
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.util.HashSet r10 = X.C17880vN.A12()
            r9 = r32
            java.util.Iterator r15 = r9.iterator()
            r13 = -9223372036854775808
            r12 = 0
            r11 = 1
            r23 = 1
            r22 = 1
            r21 = 0
            r20 = 1
            r19 = 1
            r8 = 1
        L_0x0025:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00b8
            java.lang.Object r6 = r15.next()
            X.9Bw r6 = (X.C178119Bw) r6
            com.whatsapp.jid.GroupJid r0 = r6.A0C
            if (r0 == 0) goto L_0x00af
            java.lang.String r0 = r4.A00(r6)
            if (r0 == 0) goto L_0x00af
            com.whatsapp.jid.GroupJid r0 = r6.A0C
            r10.add(r0)
            r1 = 1
        L_0x0041:
            if (r21 != 0) goto L_0x004d
            boolean r0 = r6.A0O()
            if (r0 == 0) goto L_0x004d
            if (r1 != 0) goto L_0x004d
            r21 = 1
        L_0x004d:
            if (r22 == 0) goto L_0x0055
            boolean r0 = r6.A0J
            r22 = 1
            if (r0 != 0) goto L_0x0057
        L_0x0055:
            r22 = 0
        L_0x0057:
            if (r11 == 0) goto L_0x005e
            boolean r0 = r6.A0J
            r11 = 1
            if (r0 == 0) goto L_0x005f
        L_0x005e:
            r11 = 0
        L_0x005f:
            if (r20 == 0) goto L_0x0069
            boolean r0 = r6.A0O()
            r20 = 1
            if (r0 != 0) goto L_0x006b
        L_0x0069:
            r20 = 0
        L_0x006b:
            if (r23 == 0) goto L_0x0075
            boolean r0 = r6.A0W()
            r23 = 1
            if (r0 != 0) goto L_0x0077
        L_0x0075:
            r23 = 0
        L_0x0077:
            if (r8 == 0) goto L_0x0080
            boolean r0 = r6.A0O()
            r8 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r8 = 0
        L_0x0081:
            if (r19 == 0) goto L_0x008b
            boolean r0 = r6.A0R()
            r19 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008b:
            r19 = 0
        L_0x008d:
            X.4cT r1 = r6.A04
            java.lang.String r0 = r1.A02
            r7.append(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            java.lang.String r0 = r0.getRawString()
            r7.append(r0)
            int r0 = r1.A00
            r7.append(r0)
            long r0 = r6.A01
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0025
            r13 = r0
            boolean r12 = r6.A0R()
            goto L_0x0025
        L_0x00af:
            X.4cT r0 = r6.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            r10.add(r0)
            r1 = 0
            goto L_0x0041
        L_0x00b8:
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = X.C17970vW.A04(r0)
            X.0z4 r0 = r4.A04
            r30 = r0
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r30)
            java.lang.String r0 = "dismissed_call_notification_hash"
            r2 = 0
            java.lang.String r0 = r1.getString(r0, r2)
            r8 = 0
            if (r6 == 0) goto L_0x00e2
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x00e2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "missedcallnotification/same "
            X.C17900vP.A0f(r0, r6, r1)
            return r2
        L_0x00e2:
            if (r12 == 0) goto L_0x00e5
            r5 = 1
        L_0x00e5:
            if (r22 != 0) goto L_0x00eb
            r18 = 1
            if (r11 == 0) goto L_0x00ed
        L_0x00eb:
            r18 = 0
        L_0x00ed:
            java.lang.Class<com.whatsapp.notification.MissedCallNotificationDismissedReceiver> r0 = com.whatsapp.notification.MissedCallNotificationDismissedReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0)
            r0 = 4
            android.app.PendingIntent r14 = X.C17880vN.A06(r3, r1, r0)
            X.00H r0 = r4.A0A
            java.lang.Object r7 = r0.get()
            X.1LU r7 = (X.AnonymousClass1LU) r7
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r3)
            java.lang.String r0 = X.C28901bF.A01
            android.content.Intent r11 = r1.setAction(r0)
            java.lang.String r0 = "fromNotification"
            r13 = 1
            r11.putExtra(r0, r13)
            int r0 = r9.size()
            int r0 = r0 + -1
            java.lang.Object r12 = r9.get(r0)
            X.9Bw r12 = (X.C178119Bw) r12
            X.4cT r0 = r12.A04
            com.whatsapp.jid.UserJid r2 = r0.A01
            java.lang.String r1 = r2.getRawString()
            java.lang.String r0 = "attributed_call_jid"
            r11.putExtra(r0, r1)
            r0 = 3
            android.app.PendingIntent r1 = X.C17880vN.A07(r3, r11, r0)
            X.1Nb r0 = r4.A08
            X.1yM r17 = r0.A0a(r2)
            X.73t r2 = X.C217217d.A03(r3)
            java.lang.String r16 = "call"
            r0 = r16
            r2.A0L = r0
            r2.A03 = r13
            android.app.Notification r11 = r2.A08
            r11.deleteIntent = r14
            r2.A0A = r1
            r2.A0G(r13)
            long r0 = r12.A01
            r2.A09(r0)
            r0 = 2131232189(0x7f0805bd, float:1.808048E38)
            r11.icon = r0
            X.11C r1 = r4.A0H
            X.11B r13 = r1.A0O()
            if (r13 != 0) goto L_0x0161
            java.lang.String r0 = "missedcallnotification/update cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0161:
            java.util.Iterator r15 = r10.iterator()
        L_0x0165:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x019c
            X.1BI r14 = X.C17880vN.A0Q(r15)
            boolean r0 = X.C22971Dz.A0d(r14)
            X.1M9 r12 = r4.A0E
            if (r0 == 0) goto L_0x0197
            X.1E7 r0 = r12.A0H(r14)
        L_0x017b:
            if (r13 == 0) goto L_0x0165
            if (r0 == 0) goto L_0x0165
            android.net.Uri r0 = r12.A09(r0, r13)
            if (r0 == 0) goto L_0x0165
            java.lang.String r12 = r0.toString()
            if (r12 == 0) goto L_0x0165
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0165
            java.util.ArrayList r0 = r2.A0S
            r0.add(r12)
            goto L_0x0165
        L_0x0197:
            X.1E7 r0 = r12.A0G(r14)
            goto L_0x017b
        L_0x019c:
            r12 = 2
            if (r5 != 0) goto L_0x0560
            X.1HS r0 = r4.A0D
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0516
            java.lang.String r5 = r17.A07()
        L_0x01ab:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0513
            android.net.Uri r25 = android.net.Uri.parse(r5)
            if (r25 == 0) goto L_0x0513
            X.1Vg r11 = r4.A0M
            X.00H r0 = r4.A0P
            java.lang.Object r0 = r0.get()
            X.16P r0 = (X.AnonymousClass16P) r0
            r5 = 0
            r24 = r3
            r26 = r2
            r27 = r1
            r28 = r11
            r29 = r0
            X.C217217d.A07(r24, r25, r26, r27, r28, r29)
        L_0x01cf:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "missedcallnotification/update count:"
            X.C17890vO.A15(r0, r1, r9)
            java.lang.String r0 = " contacts:"
            X.C17890vO.A14(r0, r1, r10)
            java.lang.String r0 = " quiet:"
            X.C17900vP.A0n(r0, r1, r5)
            int r1 = r10.size()
            r0 = 1
            if (r1 != r0) goto L_0x0457
            if (r21 != 0) goto L_0x0457
            if (r19 != 0) goto L_0x0457
            java.util.Iterator r0 = r10.iterator()
            X.1BI r12 = X.C17880vN.A0Q(r0)
            boolean r0 = X.C22971Dz.A0d(r12)
            X.1M9 r15 = r4.A0E
            if (r0 == 0) goto L_0x0451
            X.1E7 r10 = r15.A0H(r12)
        L_0x0201:
            int r1 = r9.size()
            r0 = 1
            if (r1 != r0) goto L_0x0423
            if (r20 == 0) goto L_0x0415
            if (r22 == 0) goto L_0x040b
            r13 = 2131897851(0x7f122dfb, float:1.9430603E38)
        L_0x020f:
            java.lang.Object[] r11 = new java.lang.Object[r0]
            X.1Me r14 = r4.A0F
            r1 = 0
            java.lang.Object r0 = r9.get(r1)
            X.9Bw r0 = (X.C178119Bw) r0
            X.4cT r0 = r0.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.1E7 r0 = r15.A0H(r0)
            java.lang.String r0 = r14.A0I(r0)
            java.lang.String r0 = X.C17880vN.A0q(r3, r0, r11, r1, r13)
        L_0x022a:
            r2.A0D(r0)
        L_0x022d:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r11 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r3.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r10 == 0) goto L_0x0408
            X.1Vd r0 = r4.A0G
            android.graphics.Bitmap r0 = r0.A03(r3, r10, r11, r1)
            if (r0 == 0) goto L_0x0250
            X.AnonymousClass70v.A00(r0, r2)
        L_0x0250:
            X.1Me r0 = r4.A0F
            java.lang.String r13 = r0.A0I(r10)
            if (r22 == 0) goto L_0x03fe
            r1 = 2131897851(0x7f122dfb, float:1.9430603E38)
        L_0x025b:
            r11 = 1
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r13, r11)
            java.lang.String r0 = r3.getString(r1, r0)
            r2.A0F(r0)
            r2.A0E(r13)
        L_0x026a:
            boolean r0 = r12 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x03af
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r22)
            java.lang.Boolean r26 = java.lang.Boolean.valueOf(r11)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r0.add(r12)
            r27 = r8
            r23 = r3
            r24 = r8
            r28 = r0
            android.content.Intent r1 = X.AnonymousClass1LU.A1H(r23, r24, r25, r26, r27, r28)
            java.lang.String r0 = X.AnonymousClass6Z8.A02
            r1.setAction(r0)
            java.lang.String r0 = "fromCallNotification"
            r1.putExtra(r0, r11)
        L_0x0293:
            r14 = r33
            if (r1 == 0) goto L_0x02a0
            X.2qZ r0 = r4.A01
            if (r0 == 0) goto L_0x02a0
            java.lang.String r0 = "notificationKey"
            r1.putExtra(r0, r14)
        L_0x02a0:
            if (r1 == 0) goto L_0x02a8
            int r0 = r33 + 3
            android.app.PendingIntent r8 = X.C17880vN.A07(r3, r1, r0)
        L_0x02a8:
            X.1BI r0 = r10.A0J
            r13 = 0
            android.content.Intent r12 = r7.A1w(r3, r0, r13)
            java.lang.String r0 = "MissedCallNotification"
            X.C60442o2.A01(r12, r0)
            java.lang.String r0 = "fromCallNotification"
            android.content.Intent r12 = r12.putExtra(r0, r11)
            java.lang.String r0 = "show_keyboard"
            android.content.Intent r11 = r12.putExtra(r0, r11)
            int r0 = r33 + 3
            android.app.PendingIntent r12 = X.C17880vN.A07(r3, r11, r0)
            if (r8 == 0) goto L_0x0324
            r11 = 2131231762(0x7f080412, float:1.8079614E38)
            if (r22 == 0) goto L_0x02d1
            r11 = 2131232406(0x7f080696, float:1.808092E38)
        L_0x02d1:
            r0 = 2131892252(0x7f12181c, float:1.9419247E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A08(r11, r0, r8)
            boolean r0 = com.whatsapp.notification.DirectReplyService.A01()
            if (r0 == 0) goto L_0x03a0
            X.00H r0 = r4.A0O
            r0.get()
            X.0ve r0 = r4.A0J
            java.lang.String r21 = "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL"
            r23 = 1
            r18 = r3
            r19 = r10
            r20 = r0
            r22 = r13
            X.6yd r11 = com.whatsapp.notification.DirectReplyService.A00(r18, r19, r20, r21, r22, r23)
            java.util.ArrayList r0 = r2.A0Q
            r0.add(r11)
        L_0x02fd:
            X.00H r0 = r4.A0N
            java.lang.Object r13 = r0.get()
            X.1pj r13 = (X.C37551pj) r13
            com.whatsapp.jid.Jid r11 = X.AnonymousClass1E7.A01(r10)
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11
            if (r11 == 0) goto L_0x031c
            X.2lf r0 = r10.A0H
            boolean r0 = X.AnonymousClass000.A1W(r0)
            if (r0 != 0) goto L_0x031c
            boolean r11 = r13.A0P(r11)
            r0 = 1
            if (r11 == 0) goto L_0x031d
        L_0x031c:
            r0 = 0
        L_0x031d:
            if (r0 == 0) goto L_0x0324
            r0 = 23
            X.C217217d.A08(r3, r2, r10, r7, r0)
        L_0x0324:
            X.1Vd r7 = r4.A0G
            r0 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r11 = r7.A03(r3, r10, r0, r0)
            if (r11 == 0) goto L_0x0368
            X.73W r10 = new X.73W
            r10.<init>()
            r7 = 2
            int r0 = r10.A05
            r7 = r7 | r0
            r10.A05 = r7
            r10.A09 = r11
            if (r1 == 0) goto L_0x0365
            r7 = 2131231756(0x7f08040c, float:1.8079602E38)
            r0 = 2131892252(0x7f12181c, float:1.9419247E38)
            java.lang.String r0 = r3.getString(r0)
            X.6yd r1 = new X.6yd
            r1.<init>(r7, r0, r8)
            java.util.ArrayList r0 = r10.A0C
            r0.add(r1)
            r7 = 2131231932(0x7f0804bc, float:1.8079959E38)
            r0 = 2131892254(0x7f12181e, float:1.9419251E38)
            java.lang.String r0 = r3.getString(r0)
            X.6yd r1 = new X.6yd
            r1.<init>(r7, r0, r12)
            java.util.ArrayList r0 = r10.A0C
            r0.add(r1)
        L_0x0365:
            r10.A04(r2)
        L_0x0368:
            X.73t r8 = X.C217217d.A03(r3)
            r0 = r16
            r8.A0L = r0
            r7 = 1
            r8.A03 = r7
            r0 = 2131898700(0x7f12314c, float:1.9432325E38)
            java.lang.String r0 = r3.getString(r0)
            r8.A0E(r0)
            X.0vb r11 = r4.A0I
            r10 = 2131755236(0x7f1000e4, float:1.9141346E38)
            int r0 = r9.size()
            long r0 = (long) r0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            int r3 = r9.size()
            X.AnonymousClass000.A1L(r7, r3)
            java.lang.String r0 = r11.A0K(r7, r10, r0)
            r8.A0D(r0)
            r1 = 2131232189(0x7f0805bd, float:1.808048E38)
            android.app.Notification r0 = r8.A08
            r0.icon = r1
            goto L_0x0566
        L_0x03a0:
            r11 = 2131233235(0x7f0809d3, float:1.8082602E38)
            r0 = 2131892254(0x7f12181e, float:1.9419251E38)
            java.lang.String r0 = r3.getString(r0)
            r2.A08(r11, r0, r12)
            goto L_0x02fd
        L_0x03af:
            boolean r0 = r12 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x03fb
            X.0ve r13 = r4.A0J
            r1 = 9886(0x269e, float:1.3853E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r13, r1)
            if (r0 == 0) goto L_0x03fb
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r22)
            android.content.Intent r13 = X.C17880vN.A0A()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            android.content.Intent r1 = r13.setClassName(r1, r0)
            if (r12 == 0) goto L_0x03dc
            java.lang.String r13 = "group_jid"
            java.lang.String r0 = r12.getRawString()
            r1.putExtra(r13, r0)
        L_0x03dc:
            if (r14 == 0) goto L_0x03e4
            java.lang.String r0 = "video_call"
            r1.putExtra(r0, r14)
        L_0x03e4:
            android.app.Activity r0 = X.C18050vg.A00(r3)
            if (r0 != 0) goto L_0x03ef
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r1.setFlags(r0)
        L_0x03ef:
            java.lang.String r0 = X.AnonymousClass6Z8.A02
            r1.setAction(r0)
            java.lang.String r0 = "fromCallNotification"
            r1.putExtra(r0, r11)
            goto L_0x0293
        L_0x03fb:
            r1 = r8
            goto L_0x0293
        L_0x03fe:
            r1 = 2131892253(0x7f12181d, float:1.941925E38)
            if (r23 == 0) goto L_0x025b
            r1 = 2131892257(0x7f121821, float:1.9419257E38)
            goto L_0x025b
        L_0x0408:
            r11 = 1
            goto L_0x026a
        L_0x040b:
            r13 = 2131892253(0x7f12181d, float:1.941925E38)
            if (r23 == 0) goto L_0x020f
            r13 = 2131892257(0x7f121821, float:1.9419257E38)
            goto L_0x020f
        L_0x0415:
            r0 = 2131898074(0x7f122eda, float:1.9431055E38)
            if (r22 == 0) goto L_0x041d
            r0 = 2131897849(0x7f122df9, float:1.94306E38)
        L_0x041d:
            java.lang.String r0 = r3.getString(r0)
            goto L_0x022a
        L_0x0423:
            if (r18 == 0) goto L_0x0442
            r15 = 2131755236(0x7f1000e4, float:1.9141346E38)
        L_0x0428:
            X.0vb r14 = r4.A0I
            int r0 = r9.size()
            long r0 = (long) r0
            r11 = 1
            java.lang.Object[] r13 = new java.lang.Object[r11]
            int r11 = r9.size()
            X.AnonymousClass000.A1L(r13, r11)
            java.lang.String r0 = r14.A0K(r13, r15, r0)
            r2.A0D(r0)
            goto L_0x022d
        L_0x0442:
            if (r22 == 0) goto L_0x0448
            r15 = 2131755484(0x7f1001dc, float:1.9141849E38)
            goto L_0x0428
        L_0x0448:
            r15 = 2131755237(0x7f1000e5, float:1.9141348E38)
            if (r23 == 0) goto L_0x0428
            r15 = 2131755238(0x7f1000e6, float:1.914135E38)
            goto L_0x0428
        L_0x0451:
            X.1E7 r10 = r15.A0G(r12)
            goto L_0x0201
        L_0x0457:
            if (r19 != 0) goto L_0x04fb
            if (r18 == 0) goto L_0x04ea
            r11 = 2131755236(0x7f1000e4, float:1.9141346E38)
        L_0x045e:
            X.0vb r10 = r4.A0I
            int r0 = r9.size()
            long r0 = (long) r0
            r7 = 1
            java.lang.Object[] r8 = new java.lang.Object[r7]
            int r7 = r9.size()
            X.AnonymousClass000.A1L(r8, r7)
            java.lang.String r0 = r10.A0K(r8, r11, r0)
        L_0x0473:
            r2.A0E(r0)
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            int r10 = r9.size()
            r0 = 1
            int r10 = r10 - r0
        L_0x0480:
            if (r10 < 0) goto L_0x0504
            java.lang.Object r11 = r9.get(r10)
            X.9Bw r11 = (X.C178119Bw) r11
            java.lang.String r1 = r4.A00(r11)
            if (r1 != 0) goto L_0x04cd
            boolean r0 = r11.A0O()
            if (r0 == 0) goto L_0x04d9
            X.0vb r0 = r4.A0I
            r18 = r0
            java.util.ArrayList r0 = r11.A0B()
            int r0 = r0.size()
            r13 = 2
            int r0 = r0 - r13
            long r0 = (long) r0
            java.lang.Object[] r12 = new java.lang.Object[r13]
            X.1Me r14 = r4.A0F
            X.1M9 r15 = r4.A0E
            X.4cT r7 = r11.A04
            com.whatsapp.jid.UserJid r7 = r7.A01
            X.1E7 r7 = r15.A0H(r7)
            java.lang.String r14 = r14.A0I(r7)
            r7 = 0
            r12[r7] = r14
            java.util.ArrayList r7 = r11.A0B()
            int r7 = r7.size()
            int r7 = r7 - r13
            X.AnonymousClass000.A1M(r12, r7)
            r11 = 2131755311(0x7f10012f, float:1.9141498E38)
            r7 = r18
            java.lang.String r1 = r7.A0K(r12, r11, r0)
        L_0x04cd:
            boolean r0 = r8.contains(r1)
            if (r0 != 0) goto L_0x04d6
            r8.add(r1)
        L_0x04d6:
            int r10 = r10 + -1
            goto L_0x0480
        L_0x04d9:
            X.1Me r7 = r4.A0F
            X.1M9 r1 = r4.A0E
            X.4cT r0 = r11.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.1E7 r0 = r1.A0H(r0)
            java.lang.String r1 = r7.A0I(r0)
            goto L_0x04cd
        L_0x04ea:
            if (r22 == 0) goto L_0x04f1
            r11 = 2131755484(0x7f1001dc, float:1.9141849E38)
            goto L_0x045e
        L_0x04f1:
            r11 = 2131755237(0x7f1000e5, float:1.9141348E38)
            if (r23 == 0) goto L_0x045e
            r11 = 2131755238(0x7f1000e6, float:1.914135E38)
            goto L_0x045e
        L_0x04fb:
            r0 = 2131892999(0x7f121b07, float:1.9420762E38)
            java.lang.String r0 = r3.getString(r0)
            goto L_0x0473
        L_0x0504:
            X.0vb r1 = r4.A0I
            r0 = 0
            java.lang.String r0 = X.C60592oI.A00(r1, r8, r0)
            r2.A0D(r0)
            X.C17900vP.A0L(r2, r0)
            goto L_0x0368
        L_0x0513:
            r5 = 0
            goto L_0x01cf
        L_0x0516:
            java.lang.String r5 = r17.A04()
            int r0 = r5.hashCode()
            switch(r0) {
                case 48: goto L_0x0556;
                case 49: goto L_0x054e;
                case 50: goto L_0x0546;
                case 51: goto L_0x053e;
                default: goto L_0x0521;
            }
        L_0x0521:
            r13 = -1
        L_0x0522:
            if (r13 == 0) goto L_0x053a
            r5 = 5
            r0 = 1
            if (r13 == r0) goto L_0x0534
            if (r13 != r12) goto L_0x0531
            long[] r0 = new long[r5]
            r0 = {0, 750, 250, 750, 250} // fill-array
        L_0x052f:
            r11.vibrate = r0
        L_0x0531:
            r5 = r8
            goto L_0x01ab
        L_0x0534:
            long[] r0 = new long[r5]
            r0 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x052f
        L_0x053a:
            r2.A06(r12)
            goto L_0x0531
        L_0x053e:
            java.lang.String r0 = "3"
            boolean r0 = r5.equals(r0)
            r13 = 2
            goto L_0x055d
        L_0x0546:
            java.lang.String r0 = "2"
            boolean r0 = r5.equals(r0)
            r13 = 1
            goto L_0x055d
        L_0x054e:
            java.lang.String r0 = "1"
            boolean r0 = r5.equals(r0)
            r13 = 0
            goto L_0x055d
        L_0x0556:
            java.lang.String r0 = "0"
            boolean r0 = r5.equals(r0)
            r13 = 3
        L_0x055d:
            if (r0 != 0) goto L_0x0522
            goto L_0x0521
        L_0x0560:
            r0 = 4
            r2.A06(r0)
            goto L_0x01cf
        L_0x0566:
            android.app.Notification r0 = r8.A05()     // Catch:{ SecurityException -> 0x056d }
            r2.A09 = r0     // Catch:{ SecurityException -> 0x056d }
            goto L_0x0575
        L_0x056d:
            r1 = move-exception
            boolean r0 = X.C39761tb.A0B()
            if (r0 != 0) goto L_0x0575
            throw r1
        L_0x0575:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0589
            r0 = r17
            X.1zz r0 = (X.C43551zz) r0
            r17 = r0
            if (r5 == 0) goto L_0x05a0
            java.lang.String r0 = r17.A0F()
        L_0x0587:
            r2.A0M = r0
        L_0x0589:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r30)
            java.lang.String r0 = "last_call_notification_hash"
            X.C17880vN.A1E(r1, r0, r6)
            X.2qZ r0 = r4.A01
            if (r0 == 0) goto L_0x059b
            java.lang.String r0 = "wa_missed_call_notifications"
            r2.A0N = r0
        L_0x059b:
            android.app.Notification r0 = r2.A05()
            return r0
        L_0x05a0:
            java.lang.String r0 = r17.A0E()
            goto L_0x0587
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70313Ao.A03(java.util.List, int, boolean):android.app.Notification");
    }

    public /* synthetic */ void A06(AnonymousClass1D6 r11, int i, boolean z) {
        String A0E2;
        Notification A032 = A03((List) r11.second, AnonymousClass000.A0M(r11.first), z);
        if (A032 != null) {
            C178119Bw r6 = (C178119Bw) ((AbstractList) r11.second).get(0);
            Context context = this.A02.A00;
            this.A0A.get();
            C1409673t A033 = C217217d.A03(context);
            A033.A0L = "call";
            A033.A0D(context.getResources().getQuantityString(2131755236, i, new Object[]{Integer.valueOf(i)}));
            A033.A03 = 1;
            A033.A0N = "wa_missed_call_notifications";
            Intent action = AnonymousClass1LU.A02(context).setAction(C28901bF.A01);
            action.putExtra("fromNotification", true);
            A033.A0A = C1408573i.A00(context, 3, action, 134217728);
            A033.A0V = true;
            if (Build.VERSION.SDK_INT >= 26) {
                C43551zz r0 = (C43551zz) this.A08.A0a(r6.A04.A01);
                if (z) {
                    A0E2 = r0.A0F();
                } else {
                    A0E2 = r0.A0E();
                }
                A033.A0M = A0E2;
            }
            A033.A08.icon = 2131232189;
            A01(A033.A05(), this, 0, z);
            A01(A032, this, AnonymousClass000.A0M(r11.first), z);
        }
    }

    public C70313Ao(AnonymousClass1KB r5, C28721an r6, AnonymousClass1HS r7, AnonymousClass1M9 r8, C24921Me r9, C27201Vd r10, AnonymousClass11C r11, AnonymousClass118 r12, C27301Vn r13, C19830z4 r14, C18000vb r15, AnonymousClass1TD r16, AnonymousClass1NN r17, AnonymousClass1Cd r18, C18030ve r19, AnonymousClass126 r20, AnonymousClass1Nb r21, C24901Mc r22, C27231Vg r23, AnonymousClass10I r24, AnonymousClass00H r25, AnonymousClass00H r26, AnonymousClass00H r27) {
        C61962qZ r0;
        C18030ve r1 = r19;
        this.A0J = r1;
        this.A02 = r12;
        this.A0B = r5;
        AnonymousClass10I r3 = r24;
        this.A09 = r3;
        this.A0L = r22;
        this.A0G = r10;
        this.A0D = r7;
        this.A0C = r6;
        this.A0E = r8;
        this.A0H = r11;
        this.A0F = r9;
        this.A0I = r15;
        this.A0M = r23;
        this.A0N = r25;
        this.A0K = r20;
        this.A05 = r16;
        this.A08 = r21;
        this.A07 = r18;
        this.A04 = r14;
        this.A06 = r17;
        this.A03 = r13;
        this.A0A = r26;
        if (C18020vd.A00(C18040vf.A02, r1, 8993) > 0) {
            r0 = new C61962qZ(r1, r3);
        } else {
            r0 = null;
        }
        this.A01 = r0;
        this.A0O = r27;
    }

    public void A04() {
        A02(this);
        C61962qZ r4 = this.A01;
        if (r4 != null) {
            C17880vN.A1B(C19830z4.A00(this.A04), "first_missed_call");
            C27301Vn r3 = this.A03;
            C18070vi.A0d(r3, 0);
            r4.A00.execute(new C21431Ajy(r3, r4, 28));
        }
        if (!this.A00.isEmpty()) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("missedcallnotification/clear ");
            C17900vP.A0o(A10, this.A00.size());
            C17880vN.A1B(C19830z4.A00(this.A04), "first_missed_call");
            this.A00.clear();
            A05();
            AnonymousClass1KB r32 = this.A0B;
            AnonymousClass1NN r2 = this.A06;
            r2.getClass();
            r32.A0J(new C449025f((Object) r2, 30));
            this.A0C.A01();
        }
    }
}
