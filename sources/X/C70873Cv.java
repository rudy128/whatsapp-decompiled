package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.notification.AndroidWear;
import com.whatsapp.notification.DirectReplyService;
import java.util.ArrayList;

/* renamed from: X.3Cv  reason: invalid class name and case insensitive filesystem */
public class C70873Cv implements Runnable {
    public boolean A00;
    public boolean A01 = false;
    public final Context A02;
    public final AnonymousClass195 A03;
    public final AnonymousClass11S A04;
    public final C32531hL A05;
    public final AnonymousClass1HS A06;
    public final C34511kb A07;
    public final AnonymousClass1M9 A08;
    public final C24921Me A09;
    public final C31131f4 A0A;
    public final AnonymousClass1RW A0B;
    public final AnonymousClass11C A0C;
    public final C27301Vn A0D;
    public final C219217x A0E;
    public final C19830z4 A0F;
    public final AnonymousClass1CJ A0G;
    public final AnonymousClass1KW A0H;
    public final C18030ve A0I;
    public final AnonymousClass1LU A0J;
    public final C32011gU A0K;
    public final C32291gx A0L;
    public final C55002f3 A0M;
    public final C30251dd A0N;
    public final C217217d A0O;
    public final C62322rD A0P;
    public final C28601ab A0Q;
    public final AnonymousClass70P A0R;
    public final C18010vc A0S;
    public final AnonymousClass206 A0T;
    public final AnonymousClass1CM A0U;
    public final AnonymousClass1LD A0V;
    public final AnonymousClass1Nb A0W;
    public final C49002Ou A0X;
    public final AnonymousClass1W6 A0Y;
    public final C27231Vg A0Z;
    public final AnonymousClass16P A0a = ((AnonymousClass16P) C221618v.A02(AnonymousClass16P.class));
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final int A0h;
    public final AnonymousClass1KB A0i;
    public final C32251gt A0j;
    public final C28721an A0k;
    public final A5M A0l;
    public final C37551pj A0m;
    public final AnonymousClass1VM A0n;
    public final AnonymousClass1PM A0o;
    public final C25491Ok A0p;
    public final C25161Nd A0q;
    public final C32951i1 A0r;
    public final C18000vb A0s;
    public final AnonymousClass1MZ A0t;
    public final AnonymousClass12L A0u;
    public final C27291Vm A0v;
    public final C39541tF A0w;
    public final AnonymousClass1BI A0x;
    public final C55412fj A0y;
    public final C53632cq A0z;
    public final AnonymousClass16Q A10 = ((AnonymousClass16Q) C221618v.A02(AnonymousClass16Q.class));
    public final C25981Qj A11;
    public final C42341y1 A12;
    public final C24901Mc A13;
    public final C145887Mz A14;
    public final AnonymousClass1PU A15;
    public final AnonymousClass1DC A16;
    public final AnonymousClass00H A17;
    public final boolean A18;
    public final boolean A19;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: int} */
    /* JADX WARNING: type inference failed for: r0v114, types: [X.6fe, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03c1, code lost:
        if (r20 == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03f2, code lost:
        if (r10.A0z(8) != false) goto L_0x03f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0431, code lost:
        if (X.C217217d.A09(r1, X.C217217d.A0Y) != false) goto L_0x0433;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0196, code lost:
        if (A08(X.AnonymousClass1E7.A00(r5), r24, r6.A00.A0G) == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x02c1, code lost:
        if (r12 == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x02c3, code lost:
        A03(r3, r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0343, code lost:
        if (r35.A06(X.C36321nh.A00(r11)) == 2) goto L_0x0345;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0398  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03c5 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0485  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0580 A[SYNTHETIC, Splitter:B:175:0x0580] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0597 A[Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02be  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02c8  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0371  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(java.lang.StringBuilder r39, java.util.List r40, int r41, int r42, int r43, boolean r44, boolean r45, boolean r46) {
        /*
            r38 = this;
            r6 = 0
            r9 = 0
        L_0x0002:
            r37 = r40
            int r0 = r37.size()
            int r0 = r0 + -7
            int r0 = java.lang.Math.max(r6, r0)
            r7 = r38
            if (r9 >= r0) goto L_0x0030
            r0 = r37
            java.lang.Object r0 = r0.get(r9)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r6)
            X.2nW r0 = (X.C60182nW) r0
            X.206 r0 = r0.A00
            X.205 r0 = r0.A0v
            X.1BI r2 = r0.A00
            X.1Vn r1 = r7.A0D
            java.lang.String r0 = "UpdateMessageNotificationRunnable2"
            r1.BER(r2, r0)
            int r9 = r9 + 1
            goto L_0x0002
        L_0x0030:
            java.util.HashMap r16 = X.C17880vN.A11()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x006f
            if (r46 != 0) goto L_0x006f
            X.17d r0 = r7.A0O
            android.service.notification.StatusBarNotification[] r5 = r0.A0Q()
            int r4 = r5.length
        L_0x0043:
            if (r6 >= r4) goto L_0x006f
            r2 = r5[r6]
            java.lang.String r0 = r2.getTag()
            if (r0 == 0) goto L_0x006c
            int r1 = r2.getId()
            int r0 = r7.A00()
            if (r1 != r0) goto L_0x006c
            android.app.Notification r0 = r2.getNotification()
            android.os.Bundle r1 = r0.extras
            java.lang.String r0 = "last_row_id"
            long r0 = r1.getLong(r0)
            java.lang.String r3 = r2.getTag()
            r2 = r16
            X.C17880vN.A1N(r3, r2, r0)
        L_0x006c:
            int r6 = r6 + 1
            goto L_0x0043
        L_0x006f:
            int r0 = r37.size()
            if (r9 >= r0) goto L_0x060b
            r0 = r37
            java.lang.Object r17 = r0.get(r9)
            r0 = r17
            java.util.List r0 = (java.util.List) r0
            r17 = r0
            int r1 = r17.size()
            r10 = 1
            int r1 = r1 - r10
            java.lang.Object r6 = r0.get(r1)
            X.2nW r6 = (X.C60182nW) r6
            X.206 r0 = r6.A00
            X.1BI r1 = X.AnonymousClass205.A00(r0)
            X.1M9 r0 = r7.A08
            r36 = r0
            X.1E7 r5 = r0.A0H(r1)
            X.1CJ r0 = r7.A0G
            r35 = r0
            int r24 = r0.A03(r1)
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r35)
            java.lang.Object r0 = r0.get(r1)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x05d7
            r4 = 0
        L_0x00b0:
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r35)
            java.lang.Object r0 = r0.get(r1)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x05d1
            r23 = 0
        L_0x00be:
            X.1gt r0 = r7.A0j
            int r0 = r0.A00(r1)
            int r4 = r4 + r24
            int r4 = r4 + r23
            int r4 = r4 + r0
            X.1Nb r0 = r7.A0W
            r34 = r0
            X.1yM r18 = r0.A0a(r1)
            java.lang.String r0 = r18.A06()
            int r20 = java.lang.Integer.parseInt(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0105
            if (r46 != 0) goto L_0x0105
            X.1Vn r1 = r7.A0D
            X.1BI r0 = X.AnonymousClass1E7.A00(r5)
            java.lang.String r1 = r1.BHf(r0)
            r0 = r16
            java.lang.Object r0 = r0.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0105
            long r11 = r0.longValue()
            X.206 r0 = r6.A00
            long r0 = r0.A0x
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0105
        L_0x0101:
            int r9 = r9 + 1
            goto L_0x006f
        L_0x0105:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            android.content.Context r3 = r7.A02
            X.73t r2 = X.C217217d.A03(r3)
            boolean r0 = r7.A0f
            r19 = r0
            if (r0 == 0) goto L_0x0403
            java.lang.String r0 = "newsletter_key_messages"
        L_0x0117:
            r2.A0N = r0
            r1 = 8
            android.app.Notification r12 = r2.A08
            int r0 = r12.flags
            r1 = r1 | r0
            r12.flags = r1
            X.2fj r1 = r7.A0y
            X.206 r0 = r6.A00
            android.content.Context r11 = r1.A00
            java.lang.Class<com.whatsapp.notification.MessageNotificationDismissedReceiver> r13 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r11, r13)
            android.net.Uri r13 = X.C62952sG.A00(r5)
            r1.setData(r13)
            java.lang.String r15 = "last_message_time"
            long r13 = r0.A0I
            r1.putExtra(r15, r13)
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            java.lang.String r13 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "chat_jid"
            r1.putExtra(r0, r13)
            android.app.PendingIntent r0 = X.C17880vN.A06(r11, r1, r10)
            r12.deleteIntent = r0
            r15 = 2131231578(0x7f08035a, float:1.807924E38)
            r12.icon = r15
            android.os.Bundle r11 = X.C17880vN.A0D()
            X.206 r0 = r6.A00
            long r0 = r0.A0x
            java.lang.String r10 = "last_row_id"
            r11.putLong(r10, r0)
            android.os.Bundle r0 = r2.A0D
            if (r0 != 0) goto L_0x03fe
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r11)
            r2.A0D = r0
        L_0x016d:
            X.206 r0 = r6.A00
            boolean r32 = r7.A09(r5, r0)
            X.206 r0 = r6.A00
            boolean r0 = r0 instanceof X.AnonymousClass21L
            if (r0 == 0) goto L_0x0184
            X.1y1 r1 = r7.A12
            X.206 r0 = r6.A00
            X.21L r0 = (X.AnonymousClass21L) r0
            r1.A01(r0)
            r32 = 0
        L_0x0184:
            if (r20 != 0) goto L_0x0198
            X.1BI r11 = X.AnonymousClass1E7.A00(r5)
            X.206 r0 = r6.A00
            long r0 = r0.A0G
            r10 = r24
            boolean r0 = r7.A08(r11, r10, r0)
            r22 = 1
            if (r0 != 0) goto L_0x01b0
        L_0x0198:
            r22 = 0
            if (r20 == 0) goto L_0x01b0
            boolean r0 = r18.A0A()
            if (r0 != 0) goto L_0x01b0
            if (r45 != 0) goto L_0x03fa
            X.16Q r0 = r7.A10
            X.6cJ r0 = r0.A00
            if (r0 == 0) goto L_0x01b0
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1M
            if (r0 != 0) goto L_0x03fa
        L_0x01b0:
            r21 = 1
        L_0x01b2:
            X.70P r1 = r7.A0R
            X.206 r0 = r6.A00
            boolean r20 = r1.A06(r0)
            if (r20 == 0) goto L_0x03dd
            X.2rD r1 = r7.A0P
            X.206 r0 = r6.A00
            r1.A01(r3, r2, r5, r0)
            r32 = 0
        L_0x01c5:
            X.17d r0 = r7.A0O
            r33 = r0
            android.graphics.Bitmap r0 = r0.A0F(r5)
            X.2cr r1 = r6.A04(r5)
            X.AnonymousClass70v.A00(r0, r2)
            int r0 = r37.size()
            int r0 = r0 - r9
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r1.A01
            r2.A0E(r0)
            java.lang.CharSequence r0 = r1.A00
            r2.A0D(r0)
            X.206 r0 = r6.A00
            long r0 = r0.A0I
            r2.A09(r0)
            r2.A0P = r10
            java.lang.String r0 = "sortKey="
            r8.append(r0)
            r8.append(r10)
            r1 = 1
            r0 = r41
            boolean r29 = X.AnonymousClass000.A1T(r0, r1)
            r0 = r42
            boolean r30 = X.AnonymousClass000.A1T(r0, r1)
            r31 = r44
            r25 = r33
            r26 = r2
            r27 = r5
            r28 = r6
            r25.A0M(r26, r27, r28, r29, r30, r31, r32)
            X.1BI r10 = r7.A0x
            if (r10 != 0) goto L_0x024c
            X.73t r11 = X.C217217d.A03(r3)
            java.lang.String r0 = "msg"
            r11.A0L = r0
            r0 = r33
            X.118 r0 = r0.A07
            android.content.Context r1 = r0.A00
            r0 = 2131899099(0x7f1232db, float:1.9433134E38)
            java.lang.String r0 = r1.getString(r0)
            r11.A0E(r0)
            X.0vb r14 = r7.A0s
            long r12 = (long) r4
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.AnonymousClass000.A1L(r1, r4)
            r0 = 2131755286(0x7f100116, float:1.9141447E38)
            java.lang.String r0 = r14.A0K(r1, r0, r12)
            r11.A0D(r0)
            android.app.Notification r0 = r11.A08
            r0.icon = r15
            android.app.Notification r0 = r11.A05()
            r2.A09 = r0
        L_0x024c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x03da
            r1 = r18
            X.1zz r1 = (X.C43551zz) r1
            java.lang.String r11 = "Silent"
            java.lang.String r0 = r1.A07()
            boolean r0 = r11.equalsIgnoreCase(r0)
            java.lang.String r1 = r7.A02(r1, r0)
            r2.A0M = r1
            r13 = 1
            r2.A01 = r13
            r2.A02 = r4
            java.lang.String r0 = " channel="
            r8.append(r0)
            r8.append(r1)
            java.lang.String r0 = " number="
            r8.append(r0)
            r0 = r24
            r8.append(r0)
            java.lang.String r0 = " numberReactions="
            r8.append(r0)
            r0 = r23
            r8.append(r0)
        L_0x0287:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x03d7
            r0 = 28
            if (r1 >= r0) goto L_0x03d7
            r0 = r41
            if (r0 != r13) goto L_0x03d7
            boolean r1 = r7.A06()
            X.17d r0 = r6.A08
            r30 = r13
            r25 = r0
            r29 = r13
            r25.A0M(r26, r27, r28, r29, r30, r31, r32)
            r0 = r39
            r6.A07(r2, r5, r0, r1)
            boolean r12 = r6.A08(r3, r2, r5)
        L_0x02ad:
            X.0ve r0 = r7.A0I
            r25 = r0
            r11 = 3156(0xc54, float:4.422E-42)
            X.0vf r23 = X.C18040vf.A02
            r1 = r23
            boolean r0 = X.C18020vd.A05(r1, r0, r11)
            r11 = 1
            if (r0 != 0) goto L_0x03b2
            r11 = 0
            if (r22 == 0) goto L_0x03b2
            if (r12 != 0) goto L_0x03b2
        L_0x02c3:
            r7.A03(r3, r2, r5)
        L_0x02c6:
            if (r19 != 0) goto L_0x02e4
            X.1BI r0 = r5.A0J
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.getRawString()
            r2.A0O = r0
            java.lang.String r1 = r6.A06()
            if (r1 == 0) goto L_0x02e4
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x02e4
            java.util.ArrayList r0 = r2.A0S
            r0.add(r1)
        L_0x02e4:
            r1 = 0
            r0 = r17
            java.lang.Object r10 = r0.get(r1)
            X.2nW r10 = (X.C60182nW) r10
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x040b
            if (r12 != 0) goto L_0x040b
            X.6uT r0 = r33.A0G()
            androidx.core.app.NotificationCompat$MessagingStyle r15 = new androidx.core.app.NotificationCompat$MessagingStyle
            r15.<init>(r0)
            X.206 r0 = r6.A00
            X.205 r0 = r0.A0v
            X.1BI r11 = r0.A00
            X.1Me r0 = r7.A09
            r21 = r0
            int r1 = r0.A09(r5, r11)
            boolean r22 = X.C22971Dz.A0e(r11)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r15.A00 = r0
            r20 = 0
            r12 = r1
            r1 = r20
            r0 = r21
            java.lang.String r14 = r0.A0U(r5, r12, r1)
            r0 = 5665(0x1621, float:7.938E-42)
            r12 = r23
            r1 = r0
            r0 = r25
            boolean r0 = X.C18020vd.A05(r12, r0, r1)
            if (r0 == 0) goto L_0x03af
            r0 = r35
            boolean r0 = r0.A0U(r11)
            if (r0 != 0) goto L_0x0345
            X.1nh r0 = com.whatsapp.jid.GroupJid.Companion
            com.whatsapp.jid.GroupJid r1 = X.C36321nh.A00(r11)
            r0 = r35
            int r0 = r0.A06(r1)
            r1 = 2
            if (r0 != r1) goto L_0x03af
        L_0x0345:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r0 = X.C42941yz.A00(r11)
            if (r0 == 0) goto L_0x03af
            X.1kb r0 = r7.A07
            X.1EC r11 = (X.AnonymousClass1EC) r11
            X.1EC r1 = r0.A05(r11)
            if (r1 == 0) goto L_0x03af
            r0 = r36
            X.1E7 r11 = r0.A0H(r1)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r20] = r14
            r0 = r21
            java.lang.String r11 = r0.A0I(r11)
            r0 = 2131896589(0x7f12290d, float:1.9428044E38)
            java.lang.String r21 = X.C17880vN.A0q(r3, r11, r1, r13, r0)
        L_0x036f:
            if (r22 == 0) goto L_0x038e
            r0 = r24
            if (r0 <= r13) goto L_0x038c
            X.0vb r0 = r7.A0s
            r12 = r0
            r13 = 2131755075(0x7f100043, float:1.914102E38)
            long r0 = (long) r4
            r24 = r0
            r0 = 2
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r11[r20] = r14
            X.AnonymousClass000.A1M(r11, r4)
            r0 = r24
            java.lang.String r14 = r12.A0K(r11, r13, r0)
        L_0x038c:
            r15.A01 = r14
        L_0x038e:
            java.util.Iterator r20 = r17.iterator()
        L_0x0392:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0407
            java.lang.Object r0 = r20.next()
            X.2nW r0 = (X.C60182nW) r0
            long r13 = r0.A02()
            long r11 = r10.A02()
            int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x03ab
            r10 = r0
        L_0x03ab:
            r0.A0A(r2, r15, r5)
            goto L_0x0392
        L_0x03af:
            r21 = r14
            goto L_0x036f
        L_0x03b2:
            boolean r0 = r7.A07(r5)
            if (r0 == 0) goto L_0x03c5
            X.1LU r1 = r7.A0J
            r0 = 21
            X.C217217d.A08(r3, r2, r5, r1, r0)
        L_0x03bf:
            if (r11 == 0) goto L_0x02c6
            if (r20 != 0) goto L_0x02c6
            goto L_0x02c3
        L_0x03c5:
            if (r21 == 0) goto L_0x03bf
            if (r12 != 0) goto L_0x03bf
            if (r10 != 0) goto L_0x03bf
            if (r20 != 0) goto L_0x03bf
            X.6yd r1 = com.whatsapp.notification.AndroidWear.A00(r3, r5)
            java.util.ArrayList r0 = r2.A0Q
            r0.add(r1)
            goto L_0x03bf
        L_0x03d7:
            r12 = 0
            goto L_0x02ad
        L_0x03da:
            r13 = 1
            goto L_0x0287
        L_0x03dd:
            if (r32 == 0) goto L_0x01c5
            int r1 = r24 + r43
            X.206 r10 = r6.A00
            boolean r0 = r10 instanceof X.AnonymousClass21L
            if (r0 != 0) goto L_0x03f4
            boolean r0 = r10 instanceof X.AnonymousClass22Q
            if (r0 != 0) goto L_0x03f4
            r0 = 8
            boolean r10 = r10.A0z(r0)
            r0 = 1
            if (r10 == 0) goto L_0x03f5
        L_0x03f4:
            r0 = 0
        L_0x03f5:
            r7.A04(r2, r5, r1, r0)
            goto L_0x01c5
        L_0x03fa:
            r21 = 0
            goto L_0x01b2
        L_0x03fe:
            r0.putAll(r11)
            goto L_0x016d
        L_0x0403:
            java.lang.String r0 = "group_key_messages"
            goto L_0x0117
        L_0x0407:
            r2.A0B(r15)
            goto L_0x040d
        L_0x040b:
            r21 = 0
        L_0x040d:
            boolean r11 = r6 instanceof X.AnonymousClass2KX
            X.206 r1 = r6.A00
            boolean r0 = r1 instanceof X.AnonymousClass210
            r12 = 0
            if (r0 == 0) goto L_0x041e
            r0 = r1
            X.210 r0 = (X.AnonymousClass210) r0
            java.lang.String r0 = r0.A06
            if (r0 == 0) goto L_0x041e
            r12 = 1
        L_0x041e:
            android.net.Uri r1 = X.C217217d.A00(r1)
            java.util.List r0 = X.C217217d.A0Z
            boolean r0 = X.C217217d.A09(r1, r0)
            if (r0 != 0) goto L_0x0433
            java.util.List r0 = X.C217217d.A0Y
            boolean r0 = X.C217217d.A09(r1, r0)
            r13 = 0
            if (r0 == 0) goto L_0x0434
        L_0x0433:
            r13 = 1
        L_0x0434:
            X.206 r0 = r6.A00
            android.net.Uri r1 = X.C217217d.A00(r0)
            java.util.List r0 = X.C217217d.A0a
            boolean r15 = X.C217217d.A09(r1, r0)
            X.0yx r14 = r7.A01(r3, r5, r11)
            java.lang.Object r11 = r14.A01
            android.content.Intent r11 = (android.content.Intent) r11
            if (r12 == 0) goto L_0x0481
            X.1i1 r12 = r7.A0r
            X.206 r0 = r6.A00
            X.205 r0 = r0.A0v
            X.1BI r1 = r0.A00
            r0 = 11
            r12.A0C(r1, r0)
            java.lang.String r0 = "notificationContainsUrlPreview"
            r1 = 1
            r11.putExtra(r0, r1)
            if (r13 == 0) goto L_0x046f
            X.206 r0 = r6.A00
            X.205 r0 = r0.A0v
            X.1BI r13 = r0.A00
            r0 = 13
            r12.A0C(r13, r0)
            java.lang.String r0 = "notificationContainsUrlPreviewFb"
            r11.putExtra(r0, r1)
        L_0x046f:
            if (r15 == 0) goto L_0x0481
            X.206 r0 = r6.A00
            X.205 r0 = r0.A0v
            X.1BI r13 = r0.A00
            r0 = 15
            r12.A0C(r13, r0)
            java.lang.String r0 = "notificationContainsUrlPreviewIg"
            r11.putExtra(r0, r1)
        L_0x0481:
            boolean r0 = r10 instanceof X.AnonymousClass3LC
            if (r0 == 0) goto L_0x04b2
            r13 = r10
            X.3LC r13 = (X.AnonymousClass3LC) r13
            java.lang.String r12 = "row_id"
            long r0 = r10.A02()
            r11.putExtra(r12, r0)
            java.lang.String r12 = "sort_id"
            boolean r0 = r10 instanceof X.AnonymousClass2KX
            if (r0 == 0) goto L_0x0562
            r0 = r10
            X.2KX r0 = (X.AnonymousClass2KX) r0
            X.2eF r0 = r0.A00
            X.206 r0 = r0.A00
        L_0x049f:
            long r0 = r0.A0y
        L_0x04a1:
            r11.putExtra(r12, r0)
            java.lang.String r0 = "open_comment_thread"
            boolean r1 = r10 instanceof X.AnonymousClass2KY
            r11.putExtra(r0, r1)
            X.205 r0 = r13.BWG()
            X.AnonymousClass4aU.A00(r11, r0)
        L_0x04b2:
            java.lang.Object r0 = r14.A00
            X.C17960vV.A07(r0)
            int r0 = X.AnonymousClass000.A0M(r0)
            android.app.PendingIntent r0 = X.C17880vN.A07(r3, r11, r0)
            r2.A0A = r0
            X.2cq r0 = r7.A0z
            X.0ve r10 = r0.A00
            r1 = 11095(0x2b57, float:1.5547E-41)
            r0 = r23
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x0534
            X.206 r0 = r6.A00
            X.205 r0 = r0.A0v
            X.1BI r12 = r0.A00
            r0 = r33
            android.graphics.Bitmap r6 = r0.A0F(r5)
            r1 = 0
            X.C18070vi.A0d(r3, r1)
            X.C18070vi.A0j(r12, r6)
            android.content.Intent r11 = X.AnonymousClass1LU.A0C(r3, r1)
            java.lang.String r10 = "jid"
            java.lang.String r0 = X.C22971Dz.A06(r12)
            android.content.Intent r10 = r11.putExtra(r10, r0)
            X.C18070vi.A0X(r10)
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()
            java.lang.String r0 = "whatsapp://bubble?jid="
            r11.append(r0)
            java.lang.String r0 = r12.getRawString()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r11)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r10.setData(r0)
            r0 = 0
            X.C1408573i.A04(r10, r1)
            boolean r11 = X.C1408573i.A02
            if (r11 == 0) goto L_0x0516
            r0 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0516:
            android.app.PendingIntent r10 = android.app.PendingIntent.getActivity(r3, r1, r10, r0)
            androidx.core.graphics.drawable.IconCompat r6 = androidx.core.graphics.drawable.IconCompat.A03(r6)
            if (r10 == 0) goto L_0x0604
            r0 = 2147483647(0x7fffffff, float:NaN)
            int r1 = java.lang.Math.max(r0, r1)
            X.6fe r0 = new X.6fe
            r0.<init>()
            r0.A01 = r10
            r0.A02 = r6
            r0.A00 = r1
            r2.A0F = r0
        L_0x0534:
            android.app.Notification r2 = r2.A05()
            X.1ab r0 = r7.A0Q
            X.1ac r0 = r0.A00(r3)
            r0.A02(r4, r2)
            java.lang.String r0 = " jid="
            r8.append(r0)
            X.1BI r0 = r5.A0J
            r8.append(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/postChildNotification "
            X.C17900vP.A0Y(r8, r0, r1)
            java.lang.Class<X.1BI> r0 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r8 = r5.A06(r0)
            X.C17960vV.A07(r8)
            X.1BI r8 = (X.AnonymousClass1BI) r8
            if (r19 != 0) goto L_0x0587
            goto L_0x0580
        L_0x0562:
            boolean r0 = r10 instanceof X.AnonymousClass2KY
            if (r0 == 0) goto L_0x056f
            r0 = r10
            X.2KY r0 = (X.AnonymousClass2KY) r0
            X.2mk r0 = r0.A00
            long r0 = r0.A00
            goto L_0x04a1
        L_0x056f:
            boolean r0 = r10 instanceof X.AnonymousClass2KZ
            if (r0 == 0) goto L_0x057c
            r0 = r10
            X.2KZ r0 = (X.AnonymousClass2KZ) r0
            X.2fA r0 = r0.A00
            X.206 r0 = r0.A01
            goto L_0x049f
        L_0x057c:
            X.206 r0 = r10.A00
            goto L_0x049f
        L_0x0580:
            X.1hL r1 = r7.A05     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
            r0 = r21
            r1.A04(r3, r5, r0)     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
        L_0x0587:
            X.1Vn r6 = r7.A0D     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
            X.1Vo r6 = (X.AnonymousClass1Vo) r6     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
            java.lang.String r4 = r6.BHf(r8)     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
            boolean r3 = X.C22971Dz.A0V(r8)     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
            r1 = 0
            r0 = 1
            if (r3 == 0) goto L_0x0599
            r0 = 59
        L_0x0599:
            r6.BkT(r2, r4, r0, r1)     // Catch:{ SecurityException -> 0x059e, RuntimeException -> 0x05db }
            goto L_0x0101
        L_0x059e:
            r2 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/postChildNotification uid="
            r3.append(r0)
            int r0 = android.os.Process.myUid()
            r3.append(r0)
            java.lang.String r0 = " isNotificationSilent="
            r3.append(r0)
            boolean r1 = r7.A0g
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i(r0, r2)
            if (r1 != 0) goto L_0x0603
            boolean r0 = X.C39761tb.A05()
            if (r0 == 0) goto L_0x0603
            r1 = r34
            r0 = r18
            r1.A0s(r0)
            goto L_0x0101
        L_0x05d1:
            int r0 = r0.A09
            r23 = r0
            goto L_0x00be
        L_0x05d7:
            int r4 = r0.A07
            goto L_0x00b0
        L_0x05db:
            r2 = move-exception
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof android.os.TransactionTooLargeException
            if (r0 == 0) goto L_0x0603
            java.lang.String r0 = "Error posting notification"
            com.whatsapp.util.Log.e(r0, r2)
            java.util.Iterator r1 = r17.iterator()
        L_0x05ed:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0603
            java.lang.Object r0 = r1.next()
            X.2nW r0 = (X.C60182nW) r0
            X.2cr r0 = r0.A04(r5)
            java.lang.CharSequence r0 = r0.A00
            r0.length()
            goto L_0x05ed
        L_0x0603:
            throw r2
        L_0x0604:
            java.lang.String r0 = "Bubble requires non-null pending intent"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x060b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70873Cv.A05(java.lang.StringBuilder, java.util.List, int, int, int, boolean, boolean, boolean):void");
    }

    public boolean A09(AnonymousClass1E7 r10, AnonymousClass206 r11) {
        if (C22971Dz.A0V(r10.A0J) || (r11 instanceof C436420i)) {
            return false;
        }
        Jid A062 = r10.A06(AnonymousClass1BI.class);
        C17960vV.A07(A062);
        AnonymousClass1BI r1 = (AnonymousClass1BI) A062;
        if (this.A0G.A0R(r1) || this.A15.A01(r10, r1)) {
            return false;
        }
        C18030ve r5 = this.A0I;
        AnonymousClass12L r6 = this.A0u;
        C25491Ok r4 = this.A0p;
        C145887Mz r8 = this.A14;
        AnonymousClass1PM r3 = this.A0o;
        UserJid A002 = C22941Dw.A00(r1);
        return !C88424Zq.A00(r3, r4, r5, r6, A002, r8) && !C87454Vq.A01(r3, r5, r6, A002);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C70873Cv r5 = (C70873Cv) obj;
            AnonymousClass206 r2 = this.A0T;
            AnonymousClass206 r0 = r5.A0T;
            return (r2 == r0 || !(r2 == null || r0 == null || !r0.A0v.equals(r2.A0v))) && this.A0e == r5.A0e && this.A19 == r5.A19 && this.A0g == r5.A0g && C42171xk.A00(this.A0x, r5.A0x) && this.A0h == r5.A0h && this.A0d == r5.A0d;
        }
    }

    public C70873Cv(Context context, AnonymousClass195 r5, AnonymousClass1KB r6, AnonymousClass11S r7, C32531hL r8, C32251gt r9, C28721an r10, AnonymousClass1XL r11, A5M a5m, C37551pj r13, AnonymousClass1VM r14, AnonymousClass1HS r15, C34511kb r16, AnonymousClass1M9 r17, AnonymousClass1PM r18, C24921Me r19, C25491Ok r20, C25161Nd r21, C32951i1 r22, C31131f4 r23, AnonymousClass1RW r24, AnonymousClass11C r25, C27301Vn r26, C219217x r27, C19830z4 r28, C18000vb r29, AnonymousClass1CJ r30, AnonymousClass1MZ r31, AnonymousClass1KW r32, C18030ve r33, AnonymousClass12L r34, C27291Vm r35, AnonymousClass1LU r36, C39541tF r37, AnonymousClass1BI r38, C32011gU r39, C32291gx r40, C55412fj r41, C55002f3 r42, C30251dd r43, C53632cq r44, C217217d r45, C62322rD r46, C28601ab r47, AnonymousClass70P r48, C18010vc r49, AnonymousClass206 r50, C25981Qj r51, C42341y1 r52, AnonymousClass1CM r53, AnonymousClass1LD r54, AnonymousClass1Nb r55, C49002Ou r56, AnonymousClass1W6 r57, C24901Mc r58, C145887Mz r59, C27231Vg r60, AnonymousClass1PU r61, AnonymousClass1DC r62, AnonymousClass00H r63, AnonymousClass00H r64, AnonymousClass00H r65, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = z4;
        this.A02 = context;
        this.A0I = r33;
        this.A0i = r6;
        this.A04 = r7;
        this.A0J = r36;
        this.A0G = r30;
        this.A0K = r39;
        this.A0H = r32;
        this.A13 = r58;
        this.A0u = r34;
        this.A06 = r15;
        this.A0k = r10;
        this.A08 = r17;
        this.A15 = r61;
        this.A16 = r62;
        this.A0C = r25;
        this.A09 = r19;
        this.A0s = r29;
        this.A0Q = r47;
        this.A0Z = r60;
        this.A0m = r13;
        this.A0Y = r57;
        this.A0p = r20;
        this.A0r = r22;
        this.A0W = r55;
        this.A0b = r63;
        this.A0O = r45;
        this.A0R = r48;
        this.A05 = r8;
        this.A0l = a5m;
        this.A11 = r51;
        this.A0L = r40;
        this.A14 = r59;
        this.A0o = r18;
        this.A0E = r27;
        this.A0F = r28;
        this.A07 = r16;
        this.A0q = r21;
        this.A0D = r26;
        this.A0P = r46;
        this.A0V = r54;
        this.A0t = r31;
        this.A0j = r9;
        this.A0z = r44;
        this.A0U = r53;
        this.A0S = r49;
        this.A03 = r5;
        this.A0A = r23;
        this.A17 = r64;
        this.A0v = r35;
        this.A0n = r14;
        this.A0B = r24;
        this.A0y = r41;
        this.A0X = r56;
        this.A0g = z;
        this.A19 = z2;
        this.A0c = r65;
        this.A0e = z3;
        this.A0x = r38;
        this.A0h = i;
        this.A0M = r42;
        this.A0N = r43;
        this.A12 = r52;
        this.A0w = r37;
        this.A18 = r11.A07();
        this.A0f = z5;
        AnonymousClass206 r2 = r50;
        if (r50 == null || !AnonymousClass206.A08(r2)) {
            this.A0T = r2;
        } else {
            z6 = true;
        }
        this.A0d = z6;
    }

    private int A00() {
        if (this.A0f) {
            return 59;
        }
        if (this.A00) {
            return 57;
        }
        return 1;
    }

    private String A02(C43551zz r3, boolean z) {
        if (this.A0f) {
            return r3.A0D();
        }
        if (this.A01) {
            C25201Nh r1 = r3.A00;
            String A0E2 = r1.A0E("status_likes_notification");
            if (A0E2 == null) {
                return r1.A0C();
            }
            return r1.A0I(A0E2);
        } else if (this.A0g || z) {
            return r3.A0F();
        } else {
            return r3.A0E();
        }
    }

    private void A03(Context context, C1409673t r15, AnonymousClass1E7 r16) {
        AnonymousClass1E7 r5 = r16;
        if (this.A0f) {
            PendingIntent A032 = C1408573i.A03(context, new Intent(AndroidWear.A0D, C62952sG.A00(r5), context, AndroidWear.class), 134217728);
            String string = context.getString(2131892367);
            IconCompat A022 = IconCompat.A02((Resources) null, "", 2131232146);
            Bundle A0D2 = C17880vN.A0D();
            CharSequence A042 = C1409673t.A04(string);
            ArrayList A132 = AnonymousClass000.A13();
            ArrayList A133 = AnonymousClass000.A13();
            r15.A0Q.add(new C139316yd(A032, A0D2, A022, A042, C17900vP.A0s(A133, A133.isEmpty() ? 1 : 0), C17900vP.A0s(A132, A132.isEmpty() ? 1 : 0), 2, true, false));
            return;
        }
        Context context2 = this.A0O.A07.A00;
        Intent action = AnonymousClass1LU.A02(context2).setAction(C28901bF.A02);
        action.putExtra("fromNotification", true);
        action.putExtra("show_mute", true);
        action.putExtra("mute_jid", C22971Dz.A06(r5.A0J));
        C60392nx.A00(context2, action);
        r15.A0Q.add(new C139316yd(2131232146, context2.getString(2131892367), C17880vN.A07(context2, action, 4)));
    }

    private boolean A06() {
        if (!this.A18 || this.A00) {
            return false;
        }
        return true;
    }

    private boolean A07(AnonymousClass1E7 r4) {
        if (C18020vd.A05(C18040vf.A02, this.A0I, 2374)) {
            UserJid userJid = (UserJid) AnonymousClass1E7.A01(r4);
            C42741yf r0 = r4.A0G;
            if ((r0 == null || !r0.A02()) && userJid != null && !this.A13.A0A(userJid) && !this.A0m.A0P(userJid)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if ((r5 + 86400000) >= r7) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A08(X.AnonymousClass1BI r11, int r12, long r13) {
        /*
            r10 = this;
            r0 = 50
            r9 = 0
            if (r12 <= r0) goto L_0x0036
            X.0z4 r0 = r10.A0F
            android.content.SharedPreferences r3 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "last_read_conversation_time"
            r1 = 0
            long r7 = r3.getLong(r0, r1)
            X.1CJ r0 = r10.A0G
            long r5 = r0.A09(r11)
            long r13 = r13 - r5
            r3 = 300000(0x493e0, double:1.482197E-318)
            int r0 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            r3 = 0
            if (r0 >= 0) goto L_0x0023
            r3 = 1
        L_0x0023:
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0030
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r5 + r0
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r3 != 0) goto L_0x0035
            if (r0 == 0) goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70873Cv.A08(X.1BI, int, long):boolean");
    }

    public int hashCode() {
        return (((((((((((AnonymousClass001.A0k(this.A0T) * 31) + (this.A0g ? 1 : 0)) * 31) + (this.A19 ? 1 : 0)) * 31) + (this.A0e ? 1 : 0)) * 31) + C17880vN.A02(this.A0x)) * 31) + this.A0h) * 31) + (this.A0d ? 1 : 0);
    }

    private C19760yx A01(Context context, AnonymousClass1E7 r6, boolean z) {
        Uri A002 = C62952sG.A00(r6);
        String str = AnonymousClass2WR.A00;
        Intent A0C2 = AnonymousClass1LU.A0C(context, 2);
        A0C2.setData(A002);
        A0C2.setAction(str);
        A0C2.addFlags(335544320);
        Intent putExtra = A0C2.putExtra("fromNotification", true).putExtra("last_notification_keep_in_chat", z);
        C18020vd.A03(putExtra, r6, this.A0I);
        C60442o2.A01(putExtra, "ChatNotification");
        return new C19760yx(2, putExtra);
    }

    private void A04(C1409673t r7, AnonymousClass1E7 r8, int i, boolean z) {
        AnonymousClass1E7 r1 = r8;
        if (DirectReplyService.A01()) {
            r7.A0Q.add(DirectReplyService.A00(this.A02, r1, this.A0I, "com.whatsapp.intent.action.DIRECT_REPLY_FROM_MESSAGE", i, z));
            return;
        }
        Context context = this.A02;
        AnonymousClass1BI r4 = r8.A0J;
        Intent A0A2 = C17880vN.A0A();
        A0A2.setClassName(context.getPackageName(), "com.whatsapp.notification.PopupNotification");
        A0A2.putExtra("popup_notification_extra_quick_reply_jid", C22971Dz.A06(r4));
        A0A2.putExtra("popup_notification_extra_dismiss_notification", true);
        r7.A08(2131233420, context.getString(2131893060), C17880vN.A07(context, A0A2, 0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v23, resolved type: com.whatsapp.TextData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v25, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v550, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v551, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v26, resolved type: com.whatsapp.TextData} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v27, resolved type: com.whatsapp.TextData} */
    /* JADX WARNING: type inference failed for: r8v61, types: [X.00O, java.util.Map, X.00P] */
    /* JADX WARNING: type inference failed for: r40v1, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r15v8, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r14v10, types: [X.00O, X.00P, java.util.Map] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:407|408|409|410|411|412|(34:414|420|(2:569|(3:571|(1:573)|574)(4:575|(2:577|(2:579|580))|581|580))(1:424)|425|(2:427|(1:433)(1:564))(3:565|(1:567)|568)|434|(1:563)(1:438)|439|(10:442|(1:444)|446|(1:448)|450|451|(1:(1:561))(1:454)|455|456|(5:458|(2:460|(0))|551|(1:553)(1:(1:559))|(0)))|464|(7:467|(1:469)|471|(7:547|548|(1:550)|(1:485)(1:(2:532|533))|(5:488|(1:530)(2:494|(1:496)(1:529))|(1:500)|501|(2:503|(1:506)))|507|(3:509|(1:511)(1:527)|512)(1:528))|477|(0)|485)|513|(1:519)|520|(1:522)|523|(2:526|524)|849|582|(4:586|(6:589|(1:591)|592|(2:594|851)(1:852)|595|587)|850|596)|597|(1:607)(2:601|(1:603))|604|(1:606)|608|609|(1:614)(1:613)|(1:616)|617|625|(1:627)(1:718)|628|(1:631)|(4:633|(1:635)(1:717)|(1:637)|(14:639|(3:641|(1:643)(1:716)|644)|645|(1:647)|648|(8:650|(1:652)(2:705|(1:707)(2:708|(1:710)(1:711)))|653|654|(2:656|(1:658))(2:662|(1:664)(2:665|(1:667)(2:668|(1:670)(2:671|(1:673)(2:674|(1:676)(2:677|(1:679)(1:(1:681)(2:682|(1:684)(2:685|(1:687)(2:688|(1:704)(2:692|(1:694)(2:695|(1:697)(2:698|(2:700|(1:702))(3:703|660|661))))))))))))))|659|660|661)|713|(6:715|654|(0)(0)|659|660|661)|653|654|(0)(0)|659|660|661)(1:866))(1:865))) */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0474, code lost:
        if (r6 == 0) goto L_0x0476;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:?, code lost:
        r0 = X.AnonymousClass000.A0n(X.AnonymousClass001.A1H(" cannot be used with ", r10.A02, X.AnonymousClass000.A11(r1.A02)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f8, code lost:
        if (X.C22971Dz.A0g(r4) == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0b2a, code lost:
        if (r20 == false) goto L_0x0b2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0b32, code lost:
        if (r30 == false) goto L_0x0b34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0b8c, code lost:
        if (r11 == false) goto L_0x0b8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0b8e, code lost:
        A03(r7, r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0bc7, code lost:
        if (r20 != false) goto L_0x0bc9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0110, code lost:
        if (r2.A0G.A0S(r4.A0v.A00) == false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0c08, code lost:
        if (r1 != false) goto L_0x0c82;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0d6c, code lost:
        if (r8.equals("2") == false) goto L_0x0c0a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:542:0x0d79, code lost:
        r1 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0d7e, code lost:
        if ((1 - r10) == 0) goto L_0x0d89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0d80, code lost:
        r1 = {0, 750, 250, 750, 250} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0d83, code lost:
        r0.A08.vibrate = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0d89, code lost:
        r1 = {0, 300, 200, 300, 200} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0da5, code lost:
        if (r12 == false) goto L_0x0b8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0dbe, code lost:
        if (r1 != 1) goto L_0x0b6f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (r2.A0W.A0a(X.AnonymousClass205.A00(r4)).A0V == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x1108, code lost:
        if (X.C22971Dz.A0a(r5) == false) goto L_0x110a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:720:0x112b, code lost:
        if (r1.contains("android.permission.UPDATE_APP_OPS_STATS") != false) goto L_0x0fac;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:410:0x0a0e */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x088e A[Catch:{ SecurityException -> 0x086a }] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x08a1 A[Catch:{ Exception -> 0x0a3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0a5a  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0a92  */
    /* JADX WARNING: Removed duplicated region for block: B:438:0x0aae  */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0b28  */
    /* JADX WARNING: Removed duplicated region for block: B:448:0x0b30  */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x0b42 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:561:0x0dbb  */
    /* JADX WARNING: Removed duplicated region for block: B:563:0x0dc2  */
    /* JADX WARNING: Removed duplicated region for block: B:565:0x0de4  */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0e1a  */
    /* JADX WARNING: Removed duplicated region for block: B:656:0x1075  */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x108e  */
    /* JADX WARNING: Removed duplicated region for block: B:855:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r73 = this;
            X.C17960vV.A01()
            r2 = r73
            X.206 r4 = r2.A0T
            java.lang.String r34 = "null"
            java.lang.String r29 = " isNotificationSilent="
            boolean r0 = r2.A0g
            r22 = r0
            boolean r0 = r2.A19
            r19 = r0
            boolean r0 = r2.A0e
            r21 = r0
            X.1BI r5 = r2.A0x
            boolean r0 = r2.A0d
            r27 = r0
            X.1CM r0 = r2.A0U
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "messagenotification/notification suppressed: not in verified registration state"
        L_0x0027:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002a:
            return
        L_0x002b:
            if (r4 == 0) goto L_0x003c
            X.1Nb r1 = r2.A0W
            X.1BI r0 = X.AnonymousClass205.A00(r4)
            X.1yM r0 = r1.A0a(r0)
            boolean r0 = r0.A0V
            r12 = 0
            if (r0 != 0) goto L_0x003d
        L_0x003c:
            r12 = 1
        L_0x003d:
            X.1Nb r0 = r2.A0W
            r72 = r0
            X.1yM r11 = r72.A0W()
            X.1yM r3 = r72.A0V()
            java.lang.String r0 = r3.A06()
            int r10 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r11.A06()
            int r9 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r3.A07()
            java.lang.String r1 = r11.A07()
            java.lang.String r8 = r3.A05()
            java.lang.String r7 = r11.A05()
            java.lang.String r6 = r3.A08()
            java.lang.String r3 = r11.A08()
            if (r10 != 0) goto L_0x00a2
            if (r9 != 0) goto L_0x00a2
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00a2
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = "000000"
            boolean r0 = android.text.TextUtils.equals(r1, r8)
            if (r0 == 0) goto L_0x00a2
            boolean r0 = android.text.TextUtils.equals(r1, r7)
            if (r0 == 0) goto L_0x00a2
            java.lang.String r1 = "0"
            boolean r0 = android.text.TextUtils.equals(r1, r6)
            if (r0 == 0) goto L_0x00a2
            boolean r0 = android.text.TextUtils.equals(r1, r3)
            if (r0 == 0) goto L_0x00a2
            if (r12 == 0) goto L_0x00a2
            java.lang.String r0 = "messagenotification/notifications disabled"
            goto L_0x0027
        L_0x00a2:
            if (r4 != 0) goto L_0x00d3
            if (r27 != 0) goto L_0x00d3
            X.0z4 r0 = r2.A0F
            X.00H r7 = r0.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r7)
            java.lang.String r1 = "notification_hash"
            r6 = 0
            java.lang.String r0 = r0.getString(r1, r6)
            if (r0 == 0) goto L_0x00d3
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r7)
            java.lang.String r3 = r0.getString(r1, r6)
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r7)
            java.lang.String r0 = "last_notification_hash"
            java.lang.String r0 = r1.getString(r0, r6)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = "messagenotification/updateOnly skip"
            goto L_0x0027
        L_0x00d3:
            android.content.Context r7 = r2.A02
            X.1Vp r0 = new X.1Vp
            r0.<init>(r7)
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x00ed
            java.lang.String r0 = "messagenotification/notif disabled"
        L_0x00e2:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00e5:
            if (r4 == 0) goto L_0x002a
        L_0x00e7:
            X.1an r0 = r2.A0k
            r0.A01()
            return
        L_0x00ed:
            boolean r0 = r4 instanceof X.AnonymousClass227
            r16 = r0
            if (r0 == 0) goto L_0x00fa
            boolean r1 = X.C22971Dz.A0g(r4)
            r0 = 1
            if (r1 != 0) goto L_0x00fb
        L_0x00fa:
            r0 = 0
        L_0x00fb:
            r2.A01 = r0
            if (r4 == 0) goto L_0x012b
            X.1gx r0 = r2.A0L
            X.2nW r35 = r0.A05(r4)
            X.1CJ r1 = r2.A0G
            X.205 r0 = r4.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r1.A0S(r0)
            r3 = 1
            if (r0 != 0) goto L_0x0113
        L_0x0112:
            r3 = 0
        L_0x0113:
            r2.A00 = r3
            if (r4 == 0) goto L_0x012e
            X.17d r1 = r2.A0O
            r0 = r35
            boolean r0 = r1.A0P(r0, r3)
            if (r0 != 0) goto L_0x012e
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x012e
            java.lang.String r0 = "messagenotification/muted chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00e7
        L_0x012b:
            r35 = 0
            goto L_0x0112
        L_0x012e:
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x0142
            X.1yM r0 = r72.A0Y()
            X.1yM r0 = r0.A02()
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x0142
            java.lang.String r0 = "messagenotification/skip notification for status reactions"
            goto L_0x0027
        L_0x0142:
            if (r16 == 0) goto L_0x015a
            X.205 r0 = r4.A0v
            X.1BI r1 = r0.A00
            r0 = r72
            X.1yM r0 = r0.A0a(r1)
            X.1yM r0 = r0.A02()
            boolean r0 = r0.A0R
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = "messagenotification/skip notification for muted reaction"
            goto L_0x0027
        L_0x015a:
            boolean r0 = r4 instanceof X.C444723o
            if (r0 == 0) goto L_0x0162
            java.lang.String r0 = "messagenotification/skip notification for scheduled call edit"
            goto L_0x0027
        L_0x0162:
            if (r4 == 0) goto L_0x019b
            boolean r0 = X.AnonymousClass206.A08(r4)
            if (r0 == 0) goto L_0x0194
            X.36k r1 = X.C60472o5.A00(r4)
            if (r1 == 0) goto L_0x0194
            boolean r0 = r1 instanceof X.C48312Lz
            if (r0 == 0) goto L_0x0194
            java.lang.Long r0 = r1.A02()
            if (r0 == 0) goto L_0x0194
            X.1W6 r3 = r2.A0Y
            long r0 = r0.longValue()
            X.1W2 r3 = r3.A01
            X.206 r0 = r3.A03(r0)
            if (r0 == 0) goto L_0x0194
            X.205 r0 = r0.A0v
            boolean r0 = r0.A02
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0194
            java.lang.String r0 = "messagenotification/skip notification for comment message"
            goto L_0x0027
        L_0x0194:
            X.0ve r1 = r2.A0I
            r0 = 10456(0x28d8, float:1.4652E-41)
            r1.A0N(r0)
        L_0x019b:
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x033a
            r10 = 0
            if (r16 == 0) goto L_0x0337
            X.227 r4 = (X.AnonymousClass227) r4
        L_0x01a4:
            X.0ve r3 = r2.A0I
            r0 = 7497(0x1d49, float:1.0506E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r9, r3, r0)
            if (r0 == 0) goto L_0x002a
            r0 = 7499(0x1d4b, float:1.0508E-41)
            boolean r0 = X.C18020vd.A05(r9, r3, r0)
            if (r0 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            X.1W6 r0 = r2.A0Y
            X.206 r1 = X.C63792th.A00(r4, r0)
            int r5 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r5 < r0) goto L_0x0334
            X.1yM r5 = r72.A0Y()
            X.1zz r5 = (X.C43551zz) r5
            r0 = 1
            java.lang.String r8 = r2.A02(r5, r0)
        L_0x01d1:
            if (r1 == 0) goto L_0x002a
            boolean r0 = X.C63792th.A04(r4)
            if (r0 != 0) goto L_0x0204
            boolean r0 = r1 instanceof X.C441822l
            if (r0 == 0) goto L_0x029e
            r0 = r1
            X.22l r0 = (X.C441822l) r0
            int r0 = X.C124106Xb.A00(r7, r0)
            android.graphics.drawable.LayerDrawable r7 = X.C124116Xc.A00(r7, r0)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = 100
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r0, r3)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r10)
            int r5 = r6.getWidth()
            int r3 = r6.getHeight()
            r0 = 0
            r7.setBounds(r0, r0, r5, r3)
            r7.draw(r6)
        L_0x0204:
            X.2Ou r12 = r2.A0X
            X.00H r0 = r12.A00
            if (r0 == 0) goto L_0x12d6
            X.0vd r2 = X.C17880vN.A0P(r0)
            r0 = 7497(0x1d49, float:1.0506E-41)
            boolean r0 = X.C18020vd.A05(r9, r2, r0)
            if (r0 == 0) goto L_0x002a
            X.00H r0 = r12.A00
            if (r0 == 0) goto L_0x12d6
            X.0vd r2 = X.C17880vN.A0P(r0)
            r0 = 7499(0x1d4b, float:1.0508E-41)
            boolean r0 = X.C18020vd.A05(r9, r2, r0)
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = r4.A01
            if (r0 == 0) goto L_0x1298
            int r0 = r0.length()
            if (r0 == 0) goto L_0x1298
            X.118 r0 = r12.A06
            r20 = r0
            android.content.Context r11 = r0.A00
            X.C18070vi.A0X(r11)
            X.1BI r3 = r4.A0H()
            if (r3 == 0) goto L_0x1298
            r7 = 89
            X.00H r0 = r12.A05
            if (r0 == 0) goto L_0x12d2
            r0.get()
            com.whatsapp.jid.UserJid r5 = r1.A0I()
            r2 = 1
            r0 = 0
            android.content.Intent r5 = X.AnonymousClass1LU.A0j(r11, r5, r2, r0, r0)
            X.205 r2 = r1.A0v
            X.AnonymousClass4aU.A00(r5, r2)
            java.lang.String r0 = "accessed_from_status_notification"
            r5.putExtra(r0, r7)
            java.lang.String r1 = "playback_entry_method"
            r0 = 8
            r5.putExtra(r1, r0)
            int r0 = r2.hashCode()
            android.app.PendingIntent r16 = X.C17880vN.A07(r11, r5, r0)
            X.C18070vi.A0X(r16)
            X.00H r0 = r12.A02
            if (r0 == 0) goto L_0x12d9
            java.lang.Object r0 = r0.get()
            X.1M9 r0 = (X.AnonymousClass1M9) r0
            X.1E7 r1 = r0.A0H(r3)
            X.00H r0 = r12.A04
            if (r0 == 0) goto L_0x114f
            java.lang.Object r0 = r0.get()
            X.1Me r0 = (X.C24921Me) r0
            java.lang.String r13 = r0.A0N(r1)
            if (r13 != 0) goto L_0x028e
            java.lang.String r13 = ""
        L_0x028e:
            r1 = 2131896342(0x7f122816, float:1.9427543E38)
            r0 = r20
            java.lang.String r6 = X.C18070vi.A0G(r0, r1)
            java.lang.String r2 = r2.A01
            X.C18070vi.A0X(r2)
            goto L_0x112f
        L_0x029e:
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x02b0
            X.00H r0 = r2.A0b
            java.lang.Object r0 = r0.get()
            X.1gV r0 = (X.C32021gV) r0
            android.graphics.Bitmap r10 = r0.A0B(r1)
            goto L_0x0204
        L_0x02b0:
            boolean r0 = r1 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0204
            r15 = r1
            X.210 r15 = (X.AnonymousClass210) r15
            byte[] r0 = r15.A1A()
            if (r0 == 0) goto L_0x02d3
            r0 = 12340(0x3034, float:1.7292E-41)
            boolean r0 = X.C18020vd.A05(r9, r3, r0)
            if (r0 == 0) goto L_0x02d3
            X.00H r0 = r2.A0b
            java.lang.Object r0 = r0.get()
            X.1gV r0 = (X.C32021gV) r0
            android.graphics.Bitmap r10 = r0.A0B(r15)
            goto L_0x0204
        L_0x02d3:
            com.whatsapp.TextData r14 = r15.A02
            if (r14 != 0) goto L_0x02dc
            com.whatsapp.TextData r14 = new com.whatsapp.TextData
            r14.<init>()
        L_0x02dc:
            X.1gU r0 = r2.A0K
            java.lang.String r13 = X.AnonymousClass74F.A05(r0, r15)
            if (r13 == 0) goto L_0x0204
            int r3 = r13.length()
            r0 = 700(0x2bc, float:9.81E-43)
            r11 = 0
            if (r3 <= r0) goto L_0x02f1
            java.lang.String r13 = r13.substring(r11, r0)
        L_0x02f1:
            X.1KW r12 = r2.A0H
            X.11C r6 = r2.A0C
            X.0vc r5 = r2.A0S
            com.whatsapp.TextData r3 = r15.A02
            X.C18070vi.A0d(r7, r11)
            int r0 = r14.fontStyle
            android.graphics.Typeface r15 = X.AnonymousClass74F.A04(r7, r0)
            if (r15 != 0) goto L_0x0306
            android.graphics.Typeface r15 = android.graphics.Typeface.SANS_SERIF
        L_0x0306:
            r14 = r7
            r16 = r10
            r17 = r3
            r18 = r6
            r19 = r12
            r20 = r5
            r21 = r13
            X.6Ia r6 = X.C124196Xk.A00(r14, r15, r16, r17, r18, r19, r20, r21)
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            r0 = 100
            android.graphics.Bitmap r10 = android.graphics.Bitmap.createBitmap(r0, r0, r3)
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r10)
            int r3 = r5.getWidth()
            int r0 = r5.getHeight()
            r6.setBounds(r11, r11, r3, r0)
            r6.draw(r5)
            goto L_0x0204
        L_0x0334:
            r8 = r10
            goto L_0x01d1
        L_0x0337:
            r4 = r10
            goto L_0x01a4
        L_0x033a:
            boolean r0 = r4 instanceof X.AnonymousClass24R
            if (r0 == 0) goto L_0x0383
            r0 = r4
            X.24R r0 = (X.AnonymousClass24R) r0
            X.9Jt r1 = r0.A00
            X.9Jt r0 = X.C179749Jt.CONTROL_PASSED
            if (r1 != r0) goto L_0x0383
            X.0ve r3 = r2.A0I
            r1 = 10456(0x28d8, float:1.4652E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r1)
            if (r0 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            X.00H r3 = r2.A0c
            java.lang.Object r0 = r3.get()
            X.0zA r0 = (X.C19880zA) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x002a
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0373
            X.1yM r1 = r72.A0W()
            X.1zz r1 = (X.C43551zz) r1
            r0 = 0
            r2.A02(r1, r0)
        L_0x0373:
            java.lang.Object r0 = r3.get()
            X.0zA r0 = (X.C19880zA) r0
            r0.A03()
            java.lang.String r0 = "handleHandoverConversationNotification"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0383:
            java.util.ArrayList r28 = X.AnonymousClass000.A13()
            java.lang.StringBuilder r33 = X.AnonymousClass000.A10()
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            if (r5 == 0) goto L_0x03c3
            X.1gx r7 = r2.A0L
            int r0 = r2.A0h
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.1R3 r11 = r7.A0C
            int r4 = r0 + 1
            r0 = 7
            int r13 = java.lang.Math.min(r4, r0)
            long r15 = android.os.SystemClock.uptimeMillis()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "last-message-store/getlastmessagesfornotificationafterreply/jid:"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " count:"
            X.C17900vP.A0j(r0, r1, r13)
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            X.1Cd r0 = r11.A04
            X.1at r14 = r0.get()
            goto L_0x12e0
        L_0x03c3:
            boolean r0 = r2.A0f
            r20 = r0
            if (r0 != 0) goto L_0x0616
            boolean r0 = r2.A00
            X.1Nd r5 = r2.A0q
            if (r0 == 0) goto L_0x0610
            java.util.ArrayList r1 = r5.A0A()
        L_0x03d3:
            X.1tF r0 = r2.A0w
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x03e2
            java.util.ArrayList r0 = r5.A09()
            r1.addAll(r0)
        L_0x03e2:
            java.util.Iterator r32 = r1.iterator()
            r9 = 0
            r5 = 0
            r26 = 0
            r17 = 0
            r18 = 0
            r48 = 0
        L_0x03f0:
            boolean r0 = r32.hasNext()
            if (r0 == 0) goto L_0x0647
            X.1BI r8 = X.C17880vN.A0Q(r32)
            X.1gx r12 = r2.A0L
            boolean r6 = r2.A00
            java.util.Map r1 = r12.A0J
            java.lang.Object r0 = r1.get(r8)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x0419
            r0 = 0
            java.util.ArrayList r0 = r12.A06(r8, r0)
            r1.put(r8, r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0419
            X.C32291gx.A01(r0)
        L_0x0419:
            java.util.ArrayList r31 = X.AnonymousClass000.A13()
            java.util.Iterator r10 = r0.iterator()
        L_0x0421:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x043b
            java.lang.Object r1 = r10.next()
            X.2nW r1 = (X.C60182nW) r1
            X.17d r0 = r12.A0E
            boolean r0 = r0.A0P(r1, r6)
            if (r0 == 0) goto L_0x0421
            r0 = r31
            r0.add(r1)
            goto L_0x0421
        L_0x043b:
            X.1gt r0 = r2.A0j
            int r0 = r0.A00(r8)
            X.1CJ r6 = r2.A0G
            int r10 = r6.A03(r8)
            int r10 = r10 + r0
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r6)
            java.lang.Object r0 = r0.get(r8)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x05b5
            r1 = 0
        L_0x0455:
            java.util.concurrent.ConcurrentHashMap r0 = X.AnonymousClass1CJ.A01(r6)
            java.lang.Object r0 = r0.get(r8)
            X.1ci r0 = (X.C29691ci) r0
            if (r0 != 0) goto L_0x05af
            r30 = 0
        L_0x0463:
            X.1ci r0 = r6.A0A(r8)
            if (r0 == 0) goto L_0x0476
            long r23 = r0.A03()
            long r13 = r0.A04()
            int r6 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            r0 = 1
            if (r6 != 0) goto L_0x0477
        L_0x0476:
            r0 = 0
        L_0x0477:
            if (r10 > 0) goto L_0x0481
            if (r0 != 0) goto L_0x0481
            if (r1 > 0) goto L_0x0481
            boolean r0 = r4 instanceof X.AnonymousClass22A
            if (r0 == 0) goto L_0x03f0
        L_0x0481:
            int r0 = r31.size()
            if (r0 <= 0) goto L_0x03f0
            r1 = 0
            r0 = r31
            java.lang.Object r6 = r0.get(r1)
            X.2nW r6 = (X.C60182nW) r6
            if (r6 == 0) goto L_0x05fd
            X.2rD r1 = r2.A0P
            X.206 r0 = r6.A00
            boolean r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x03f0
            X.206 r0 = r6.A00
            long r0 = r0.A0G
            r13 = 0
            int r11 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r11 == 0) goto L_0x04ce
            r23 = 604800000(0x240c8400, double:2.988109026E-315)
            long r23 = r23 + r0
            X.11P r11 = r12.A08
            long r13 = X.AnonymousClass11P.A01(r11)
            int r11 = (r23 > r13 ? 1 : (r23 == r13 ? 0 : -1))
            if (r11 >= 0) goto L_0x04ce
            X.0z4 r11 = r12.A0A
            android.content.SharedPreferences r12 = X.C17890vO.A0B(r11)
            java.lang.String r11 = "last_read_conversation_time"
            long r12 = X.C17890vO.A05(r12, r11)
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 <= 0) goto L_0x04ce
        L_0x04c5:
            X.1Vn r1 = r2.A0D
            java.lang.String r0 = "UpdateMessageNotificationRunnable4"
            r1.BER(r8, r0)
            goto L_0x03f0
        L_0x04ce:
            X.2fj r11 = r2.A0y
            X.206 r0 = r6.A00
            r38 = r0
            java.util.concurrent.atomic.AtomicBoolean r1 = r11.A04
            r15 = 0
            r0 = 1
            boolean r0 = r1.compareAndSet(r15, r0)
            if (r0 == 0) goto L_0x058f
            X.2cJ r13 = r11.A01
            java.lang.String[] r25 = X.C17880vN.A1Y()
            X.11P r0 = r13.A00
            r37 = r0
            long r0 = X.AnonymousClass11P.A01(r37)
            r23 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r23
            r12 = r25
            X.C17880vN.A1U(r12, r15, r0)
            X.1Lt r0 = r13.A01
            r36 = r0
            X.1au r24 = r36.A06()
            r0 = r24
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1362 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x1362 }
            r13 = r0
            java.lang.String r12 = "dismissed_chat"
            java.lang.String r1 = "timestamp < ?"
            java.lang.String r0 = "CLEAR_OLD_CHATS"
            r14 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r25
            r14.A04(r13, r12, r1, r0)     // Catch:{ all -> 0x1362 }
            r24.close()
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            java.lang.String[] r12 = X.C17880vN.A1Y()
            long r0 = X.AnonymousClass11P.A01(r37)
            r13 = 604800000(0x240c8400, double:2.988109026E-315)
            long r0 = r0 - r13
            X.C17880vN.A1U(r12, r15, r0)
            X.1at r24 = r36.get()
            r0 = r24
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1362 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x1362 }
            java.lang.String r1 = "SELECT chat_jid, timestamp FROM dismissed_chat WHERE timestamp > ?"
            java.lang.String r0 = "GET_DISMISSED_CHATS"
            android.database.Cursor r14 = r13.A0A(r1, r0, r12)     // Catch:{ all -> 0x1362 }
            java.lang.String r0 = "chat_jid"
            int r15 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x1356 }
            java.lang.String r0 = "timestamp"
            int r13 = r14.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x1356 }
        L_0x054a:
            boolean r0 = r14.moveToNext()     // Catch:{ all -> 0x1356 }
            if (r0 == 0) goto L_0x056f
            java.lang.String r1 = r14.getString(r15)     // Catch:{ all -> 0x1356 }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x1356 }
            X.1BI r12 = r0.A02(r1)     // Catch:{ all -> 0x1356 }
            long r0 = r14.getLong(r13)     // Catch:{ all -> 0x1356 }
            if (r12 == 0) goto L_0x054a
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x1356 }
            X.0yx r0 = new X.0yx     // Catch:{ all -> 0x1356 }
            r0.<init>(r12, r1)     // Catch:{ all -> 0x1356 }
            r1 = r23
            r1.add(r0)     // Catch:{ all -> 0x1356 }
            goto L_0x054a
        L_0x056f:
            r14.close()     // Catch:{ all -> 0x1362 }
            r24.close()
            java.util.Iterator r13 = r23.iterator()
        L_0x0579:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x058f
            java.lang.Object r0 = r13.next()
            X.0yx r0 = (X.C19760yx) r0
            java.util.Map r12 = r11.A03
            java.lang.Object r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r12.put(r1, r0)
            goto L_0x0579
        L_0x058f:
            r0 = r38
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            java.util.Map r1 = r11.A03
            boolean r11 = r1.containsKey(r0)
            if (r11 == 0) goto L_0x05b9
            java.lang.Object r0 = r1.get(r0)
            long r12 = X.C17880vN.A05(r0)
            r0 = r38
            long r0 = r0.A0I
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 < 0) goto L_0x05b9
            goto L_0x04c5
        L_0x05af:
            int r0 = r0.A09
            r30 = r0
            goto L_0x0463
        L_0x05b5:
            int r1 = r0.A07
            goto L_0x0455
        L_0x05b9:
            int r17 = r17 + r10
            int r48 = r48 + r30
            int r18 = r18 + 1
            int r26 = r26 + r20
            java.util.Collections.reverse(r31)
            r1 = r28
            r0 = r31
            r1.add(r0)
            if (r9 == 0) goto L_0x05d9
            X.206 r0 = r9.A00
            long r10 = r0.A0I
            X.206 r0 = r6.A00
            long r0 = r0.A0I
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x05e0
        L_0x05d9:
            X.1M9 r0 = r2.A08
            X.1E7 r5 = r0.A0H(r8)
            r9 = r6
        L_0x05e0:
            X.206 r0 = r6.A00
            X.205 r1 = r0.A0v
            java.lang.String r6 = r1.A01
            r0 = r33
            r0.append(r6)
            boolean r6 = r1.A02
            r0.append(r6)
            X.1BI r0 = r1.A00
            java.lang.String r1 = X.C22971Dz.A06(r0)
            r0 = r33
            r0.append(r1)
            goto L_0x03f0
        L_0x05fd:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/curmsg/null "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " "
            X.C17900vP.A0k(r0, r1, r10)
            goto L_0x03f0
        L_0x0610:
            java.util.ArrayList r1 = r5.A06()
            goto L_0x03d3
        L_0x0616:
            X.1Nd r0 = r2.A0q
            X.1CJ r0 = r0.A02
            X.AnonymousClass1CJ.A01(r0)
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            java.util.Collection r0 = r0.A0H()
            java.util.Iterator r6 = r0.iterator()
        L_0x0629:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x03e2
            java.lang.Object r5 = r6.next()
            X.1ci r5 = (X.C29691ci) r5
            boolean r0 = r5 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0629
            X.2Dk r5 = (X.C46162Dk) r5
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0629
            X.1BI r0 = r5.A08()
            r1.add(r0)
            goto L_0x0629
        L_0x0647:
            if (r4 == 0) goto L_0x0657
            if (r16 != 0) goto L_0x0657
            X.1M9 r1 = r2.A08
            X.1BI r0 = X.AnonymousClass205.A00(r4)
            X.1E7 r5 = r1.A0H(r0)
            r9 = r35
        L_0x0657:
            java.lang.String r0 = r33.toString()
            java.lang.String r25 = X.C17970vW.A04(r0)
            X.C17960vV.A07(r25)
            boolean r1 = r2.A00
            X.0z4 r0 = r2.A0F
            r71 = r0
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r71)
            if (r1 == 0) goto L_0x0696
            java.lang.String r1 = "locked_chat_notification_hash"
        L_0x0670:
            java.lang.String r6 = X.C17880vN.A0r(r0, r1)
            X.17d r0 = r2.A0O
            r70 = r0
            boolean r1 = r2.A00
            boolean r0 = r0.A0P(r9, r1)
            r1 = r0 ^ 1
            r0 = r25
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x0699
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "messagenotification/same "
            r0 = r25
            java.lang.String r0 = X.AnonymousClass001.A1H(r1, r0, r2)
            goto L_0x0027
        L_0x0696:
            java.lang.String r1 = "notification_hash"
            goto L_0x0670
        L_0x0699:
            if (r18 == 0) goto L_0x06b0
            if (r5 == 0) goto L_0x06b0
            if (r1 == 0) goto L_0x06bd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/muted "
            r1.append(r0)
            X.1BI r0 = r5.A0J
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            goto L_0x00e2
        L_0x06b0:
            X.1Vn r3 = r2.A0D
            int r1 = r2.A00()
            java.lang.String r0 = "UpdateMessageNotificationRunnable1"
            r3.BEJ(r1, r0)
            goto L_0x00e5
        L_0x06bd:
            java.lang.String r0 = " hash="
            r3.append(r0)
            r0 = r25
            r3.append(r0)
            java.lang.String r0 = " msg="
            r3.append(r0)
            r0 = r17
            r3.append(r0)
            java.lang.String r0 = " contacts="
            r3.append(r0)
            r0 = r18
            r3.append(r0)
            java.lang.String r0 = " isWearRefresh="
            r3.append(r0)
            r0 = r21
            r3.append(r0)
            r0 = r29
            r3.append(r0)
            r0 = r22
            r3.append(r0)
            java.lang.String r0 = " newMessage="
            r3.append(r0)
            if (r4 == 0) goto L_0x06f8
            java.lang.String r34 = "nonNull"
        L_0x06f8:
            r0 = r34
            r3.append(r0)
            java.lang.Class<X.1BI> r23 = X.AnonymousClass1BI.class
            r0 = r23
            com.whatsapp.jid.Jid r6 = r5.A06(r0)
            X.C17960vV.A07(r6)
            X.1BI r6 = (X.AnonymousClass1BI) r6
            r0 = r72
            X.1yM r0 = r0.A0a(r6)
            boolean r15 = r0.A0A()
            r12 = 1
            if (r15 != 0) goto L_0x0745
            X.1dd r1 = r2.A0N
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            boolean r0 = r6 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0745
            java.util.concurrent.ConcurrentHashMap r1 = r1.A01
            monitor-enter(r1)
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x1367 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x1367 }
            if (r0 == 0) goto L_0x0744
            long r13 = r0.longValue()     // Catch:{ all -> 0x1367 }
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x1367 }
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x073c
            r1.remove(r6)     // Catch:{ all -> 0x1367 }
            goto L_0x0744
        L_0x073c:
            monitor-exit(r1)
            java.lang.String r0 = " noisy-group-silenced"
            r3.append(r0)
            r15 = 1
            goto L_0x0745
        L_0x0744:
            monitor-exit(r1)
        L_0x0745:
            X.206 r11 = r9.A00
            if (r15 != 0) goto L_0x07c8
            X.2f3 r10 = r2.A0M
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.C18070vi.A0d(r11, r12)
            boolean r0 = r6 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x07c8
            r1 = r6
            X.1E9 r1 = (X.AnonymousClass1E9) r1
            if (r1 == 0) goto L_0x07c8
            X.1CJ r0 = r10.A01
            long r30 = r0.A07(r1)
            r13 = 0
            int r0 = (r30 > r13 ? 1 : (r30 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x07c8
            X.1Qj r0 = r10.A03
            boolean r0 = r0.A00(r11)
            if (r0 != 0) goto L_0x07c8
            X.1MZ r0 = r10.A02
            X.1MW r0 = r0.A08
            X.2tp r0 = r0.A0C(r1)
            X.10f r14 = r0.A08()
            X.C18070vi.A0X(r14)
            int r1 = r14.size()
            r0 = 10
            if (r1 <= r0) goto L_0x07c8
            X.1IZ r13 = r14.iterator()
            r8 = 0
        L_0x078b:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x07b2
            java.lang.Object r0 = r13.next()
            X.2sr r0 = (X.C63312sr) r0
            X.1M9 r1 = r10.A00
            com.whatsapp.jid.UserJid r0 = r0.A04
            X.1E7 r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x078b
            X.2lf r0 = r0.A0H
            if (r0 == 0) goto L_0x078b
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x078b
            int r0 = r0.length()
            if (r0 == 0) goto L_0x078b
            int r8 = r8 + 1
            goto L_0x078b
        L_0x07b2:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = (float) r8
            float r1 = r1 * r0
            int r0 = r14.size()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x07c8
            java.lang.String r0 = " new-group-silenced"
            r3.append(r0)
            r15 = 1
        L_0x07c8:
            boolean r8 = X.C22971Dz.A0e(r6)
            java.util.List r1 = r11.A0h
            X.11S r0 = r2.A04
            boolean r1 = X.AnonymousClass4aJ.A05(r0, r1)
            X.206 r0 = r11.A0K()
            if (r0 == 0) goto L_0x0898
            X.1BI r0 = r0.A0H()
            if (r0 != 0) goto L_0x0898
        L_0x07e0:
            if (r15 == 0) goto L_0x0895
            if (r8 == 0) goto L_0x0895
            if (r1 != 0) goto L_0x07e8
            if (r12 == 0) goto L_0x0895
        L_0x07e8:
            X.1BI r1 = r11.A0H()
            if (r1 == 0) goto L_0x0895
            r0 = r72
            X.1yM r0 = r0.A0a(r1)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0895
            r0 = r72
            X.1yM r8 = r0.A0a(r1)
            r15 = 0
        L_0x0801:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r15)
            X.0yx r0 = new X.0yx
            r0.<init>(r8, r1)
            java.lang.Object r1 = r0.A00
            r35 = r1
            r1 = r35
            X.1yM r1 = (X.C42551yM) r1
            r35 = r1
            java.lang.Object r0 = r0.A01
            X.C17960vV.A07(r0)
            boolean r49 = X.AnonymousClass000.A1Y(r0)
            X.16Q r0 = r2.A10
            r69 = r0
            X.6cJ r0 = r0.A00
            if (r0 == 0) goto L_0x0892
            com.whatsapp.notification.PopupNotification r1 = r0.A00
            boolean r0 = r1.A1M
            if (r0 == 0) goto L_0x0892
            X.1BI r0 = r1.A0o
            r24 = r0
        L_0x082f:
            r0 = r24
            boolean r10 = r6.equals(r0)
            r0 = r23
            com.whatsapp.jid.Jid r1 = r5.A06(r0)
            X.C17960vV.A07(r1)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            r0 = r72
            X.1yM r42 = r0.A0a(r1)
            java.lang.String r0 = r42.A06()
            int r67 = java.lang.Integer.parseInt(r0)
            X.11C r0 = r2.A0C
            r68 = r0
            android.telephony.TelephonyManager r8 = r68.A0K()
            if (r4 == 0) goto L_0x088f
            if (r8 == 0) goto L_0x088f
            boolean r0 = X.AnonymousClass112.A08()
            if (r0 == 0) goto L_0x0888
            X.17x r1 = r2.A0E
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x0888
        L_0x086a:
            X.1HS r0 = r2.A06
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x088f
            if (r19 != 0) goto L_0x088f
            boolean r0 = r42.A0A()
            if (r0 == 0) goto L_0x087c
            if (r49 != 0) goto L_0x088f
        L_0x087c:
            if (r67 != 0) goto L_0x0880
            if (r10 == 0) goto L_0x088f
        L_0x0880:
            r50 = 1
        L_0x0882:
            X.C17960vV.A01()
            r19 = 1
            goto L_0x089b
        L_0x0888:
            int r0 = r8.getCallState()     // Catch:{ SecurityException -> 0x086a }
            if (r0 != 0) goto L_0x088f
            goto L_0x086a
        L_0x088f:
            r50 = 0
            goto L_0x0882
        L_0x0892:
            r24 = 0
            goto L_0x082f
        L_0x0895:
            r8 = 0
            goto L_0x0801
        L_0x0898:
            r12 = 0
            goto L_0x07e0
        L_0x089b:
            int r0 = X.C41371wF.A00(r7)     // Catch:{ Exception -> 0x0a3a }
            if (r0 != 0) goto L_0x0a41
            r11 = 0
            X.Cbz r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x0a3a }
            if (r0 != 0) goto L_0x09e4
            r10 = 0
            java.util.HashSet r34 = X.C17880vN.A12()     // Catch:{ Exception -> 0x0a3a }
            java.util.HashSet r33 = X.C17880vN.A12()     // Catch:{ Exception -> 0x0a3a }
            X.00P r12 = new X.00P     // Catch:{ Exception -> 0x0a3a }
            r12.<init>(r11)     // Catch:{ Exception -> 0x0a3a }
            X.00P r8 = new X.00P     // Catch:{ Exception -> 0x0a3a }
            r8.<init>(r11)     // Catch:{ Exception -> 0x0a3a }
            X.1wH r54 = X.C41381wH.A00     // Catch:{ Exception -> 0x0a3a }
            X.BYp r55 = X.CIA.A00     // Catch:{ Exception -> 0x0a3a }
            java.util.ArrayList r58 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0a3a }
            java.util.ArrayList r59 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0a3a }
            android.os.Looper r53 = r7.getMainLooper()     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r38 = r7.getPackageName()     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r39 = X.C17890vO.A0U(r7)     // Catch:{ Exception -> 0x0a3a }
            X.CPx r0 = X.C24723CHk.A00     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r1 = "Api must not be null"
            X.C18210vx.A02(r0, r1)     // Catch:{ Exception -> 0x0a3a }
            r8.put(r0, r10)     // Catch:{ Exception -> 0x0a3a }
            X.BYp r1 = r0.A00     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r0 = "Base client builder must not be null"
            X.C18210vx.A02(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            java.util.List r1 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x0a3a }
            r0 = r33
            r0.addAll(r1)     // Catch:{ Exception -> 0x0a3a }
            r0 = r34
            r0.addAll(r1)     // Catch:{ Exception -> 0x0a3a }
            boolean r0 = r8.isEmpty()     // Catch:{ Exception -> 0x0a3a }
            r1 = r0 ^ 1
            java.lang.String r0 = "must call addApi() to add at least one API"
            X.C18210vx.A07(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            X.DHz r0 = X.C26892DHz.A00     // Catch:{ Exception -> 0x0a3a }
            X.CPx r1 = X.CIA.A04     // Catch:{ Exception -> 0x0a3a }
            boolean r13 = r8.containsKey(r1)     // Catch:{ Exception -> 0x0a3a }
            if (r13 == 0) goto L_0x090b
            java.lang.Object r0 = r8.get(r1)     // Catch:{ Exception -> 0x0a3a }
            X.DHz r0 = (X.C26892DHz) r0     // Catch:{ Exception -> 0x0a3a }
        L_0x090b:
            X.CTL r32 = new X.CTL     // Catch:{ Exception -> 0x0a3a }
            r36 = r32
            r37 = r0
            r40 = r12
            r41 = r34
            r36.<init>(r37, r38, r39, r40, r41)     // Catch:{ Exception -> 0x0a3a }
            r0 = r32
            java.util.Map r0 = r0.A04     // Catch:{ Exception -> 0x0a3a }
            r36 = r0
            X.00P r15 = new X.00P     // Catch:{ Exception -> 0x0a3a }
            r15.<init>(r11)     // Catch:{ Exception -> 0x0a3a }
            X.00P r14 = new X.00P     // Catch:{ Exception -> 0x0a3a }
            r14.<init>(r11)     // Catch:{ Exception -> 0x0a3a }
            java.util.ArrayList r31 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0a3a }
            java.util.Set r0 = r8.keySet()     // Catch:{ Exception -> 0x0a3a }
            java.util.Iterator r30 = r0.iterator()     // Catch:{ Exception -> 0x0a3a }
        L_0x0934:
            boolean r0 = r30.hasNext()     // Catch:{ Exception -> 0x0a3a }
            if (r0 == 0) goto L_0x0983
            java.lang.Object r1 = r30.next()     // Catch:{ Exception -> 0x0a3a }
            X.CPx r1 = (X.C24924CPx) r1     // Catch:{ Exception -> 0x0a3a }
            java.lang.Object r66 = r8.get(r1)     // Catch:{ Exception -> 0x0a3a }
            r0 = r36
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0a3a }
            boolean r13 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x0a3a }
            r15.put(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            X.DI6 r12 = new X.DI6     // Catch:{ Exception -> 0x0a3a }
            r12.<init>(r1, r13)     // Catch:{ Exception -> 0x0a3a }
            r0 = r31
            r0.add(r12)     // Catch:{ Exception -> 0x0a3a }
            X.BYp r0 = r1.A00     // Catch:{ Exception -> 0x0a3a }
            X.C18210vx.A00(r0)     // Catch:{ Exception -> 0x0a3a }
            r64 = r12
            r60 = r0
            r61 = r7
            r62 = r53
            r63 = r12
            r65 = r32
            X.EDS r12 = r60.A00(r61, r62, r63, r64, r65, r66)     // Catch:{ Exception -> 0x0a3a }
            X.CAv r0 = r1.A01     // Catch:{ Exception -> 0x0a3a }
            r14.put(r0, r12)     // Catch:{ Exception -> 0x0a3a }
            boolean r0 = r12.CCu()     // Catch:{ Exception -> 0x0a3a }
            if (r0 == 0) goto L_0x0934
            if (r10 != 0) goto L_0x09cc
            r10 = r1
            goto L_0x0934
        L_0x0983:
            if (r10 == 0) goto L_0x09a2
            java.lang.String r8 = r10.A02     // Catch:{ Exception -> 0x0a3a }
            r1 = r34
            r0 = r33
            boolean r10 = r1.equals(r0)     // Catch:{ Exception -> 0x0a3a }
            r0 = r19
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0a3a }
            r0[r11] = r8     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r1 = "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead."
            if (r10 != 0) goto L_0x09a2
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x0a3a }
            goto L_0x09de
        L_0x09a2:
            java.util.Collection r1 = r14.values()     // Catch:{ Exception -> 0x0a3a }
            r0 = r19
            X.BZB.A00(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            java.util.concurrent.locks.ReentrantLock r62 = new java.util.concurrent.locks.ReentrantLock     // Catch:{ Exception -> 0x0a3a }
            r62.<init>()     // Catch:{ Exception -> 0x0a3a }
            X.BZB r0 = new X.BZB     // Catch:{ Exception -> 0x0a3a }
            r51 = r0
            r52 = r7
            r56 = r32
            r57 = r31
            r60 = r15
            r61 = r14
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ Exception -> 0x0a3a }
            java.util.Set r1 = X.C25260Cbz.A00     // Catch:{ Exception -> 0x0a3a }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0a3a }
            r1.add(r0)     // Catch:{ all -> 0x09c9 }
            monitor-exit(r1)     // Catch:{ all -> 0x09c9 }
            goto L_0x09df
        L_0x09c9:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x09c9 }
            goto L_0x09de
        L_0x09cc:
            java.lang.String r0 = r1.A02     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r8 = r10.A02     // Catch:{ Exception -> 0x0a3a }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r0 = " cannot be used with "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)     // Catch:{ Exception -> 0x0a3a }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ Exception -> 0x0a3a }
        L_0x09de:
            throw r0     // Catch:{ Exception -> 0x0a3a }
        L_0x09df:
            com.whatsapp.notification.AndroidWear.A0B = r0     // Catch:{ Exception -> 0x0a3a }
            r0.A07()     // Catch:{ Exception -> 0x0a3a }
        L_0x09e4:
            X.Cbz r0 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x0a3a }
            if (r0 == 0) goto L_0x0a41
            boolean r0 = r0.A06()     // Catch:{ Exception -> 0x0a3a }
            if (r0 == 0) goto L_0x0a41
            X.Cbz r1 = com.whatsapp.notification.AndroidWear.A0B     // Catch:{ Exception -> 0x0a3a }
            X.CPx r0 = X.C24723CHk.A00     // Catch:{ Exception -> 0x0a3a }
            X.BiJ r8 = new X.BiJ     // Catch:{ Exception -> 0x0a3a }
            r8.<init>(r0, r1)     // Catch:{ Exception -> 0x0a3a }
            r1.A05(r8)     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r0 = "await must not be called on the UI thread"
            X.C18210vx.A04(r0)     // Catch:{ Exception -> 0x0a3a }
            boolean r0 = r8.A0B     // Catch:{ Exception -> 0x0a3a }
            r1 = r0 ^ 1
            java.lang.String r0 = "Result has already been consumed"
            X.C18210vx.A08(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            java.util.concurrent.CountDownLatch r0 = r8.A08     // Catch:{ InterruptedException -> 0x0a0e }
            r0.await()     // Catch:{ InterruptedException -> 0x0a0e }
            goto L_0x0a13
        L_0x0a0e:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.A07     // Catch:{ Exception -> 0x0a3a }
            r8.A07(r0)     // Catch:{ Exception -> 0x0a3a }
        L_0x0a13:
            java.util.concurrent.CountDownLatch r0 = r8.A08     // Catch:{ Exception -> 0x0a3a }
            long r12 = r0.getCount()     // Catch:{ Exception -> 0x0a3a }
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1P(r0)     // Catch:{ Exception -> 0x0a3a }
            java.lang.String r0 = "Result is not ready."
            X.C18210vx.A08(r1, r0)     // Catch:{ Exception -> 0x0a3a }
            X.E5A r0 = com.google.android.gms.common.api.internal.BasePendingResult.A00(r8)     // Catch:{ Exception -> 0x0a3a }
            X.EDV r0 = (X.EDV) r0     // Catch:{ Exception -> 0x0a3a }
            X.DL2 r0 = (X.DL2) r0     // Catch:{ Exception -> 0x0a3a }
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x0a3a }
            r0.size()     // Catch:{ Exception -> 0x0a3a }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0a3a }
            if (r0 <= 0) goto L_0x0a41
            goto L_0x0a43
        L_0x0a3a:
            r1 = move-exception
            java.lang.String r0 = "androidwear/pairedcheck/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x136f }
            goto L_0x0a43
        L_0x0a41:
            r19 = 0
        L_0x0a43:
            java.lang.String r0 = " isAndroidWearPaired="
            r3.append(r0)
            r0 = r19
            r3.append(r0)
            boolean r0 = r2.A06()
            r8 = 134217728(0x8000000, float:3.85186E-34)
            r1 = 1
            if (r0 == 0) goto L_0x0e1a
            r0 = r18
            if (r0 != r1) goto L_0x0e1a
            r0 = 0
            X.0yx r0 = r2.A01(r7, r5, r0)
            java.lang.Object r1 = r0.A00
            X.C17960vV.A07(r1)
            int r1 = X.AnonymousClass000.A0M(r1)
            java.lang.Object r0 = r0.A01
            android.content.Intent r0 = (android.content.Intent) r0
            android.app.PendingIntent r37 = X.C1408573i.A00(r7, r1, r0, r8)
        L_0x0a70:
            java.lang.Class<com.whatsapp.notification.MessageNotificationDismissedReceiver> r0 = com.whatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r7, r0)
            java.lang.String r10 = "notification_hash"
            r0 = r25
            r1.putExtra(r10, r0)
            int r0 = r2.A00()
            android.app.PendingIntent r38 = X.C1408573i.A01(r7, r0, r1, r8)
            boolean r1 = r2.A06()
            int r26 = r17 + r48
            r10 = 0
            r8 = 1
            r0 = r18
            if (r0 != r8) goto L_0x0de4
            r0 = r17
            if (r0 == r8) goto L_0x0a9e
            if (r48 == 0) goto L_0x0dd1
            X.206 r0 = r9.A00
            boolean r0 = r0 instanceof X.AnonymousClass227
            if (r0 == 0) goto L_0x0dd1
        L_0x0a9e:
            if (r1 == 0) goto L_0x0dd1
            java.lang.CharSequence r44 = r9.A05(r5, r10)
        L_0x0aa4:
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0dc2
            r0 = r18
            if (r0 != r8) goto L_0x0dc2
            X.1Me r0 = r2.A09
            java.lang.String r0 = r0.A0I(r5)
            java.lang.String r45 = X.C63462t7.A02(r0)
        L_0x0ab8:
            X.1HS r15 = r2.A06
            X.0vb r1 = r2.A0s
            X.16P r0 = r2.A0a
            r58 = r0
            X.1f4 r13 = r2.A0A
            X.1VM r0 = r2.A0n
            boolean r59 = r2.A06()
            X.2qp r14 = new X.2qp
            r51 = r14
            r52 = r0
            r53 = r15
            r54 = r13
            r55 = r1
            r56 = r70
            r57 = r4
            r60 = r22
            r61 = r21
            r62 = r20
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)
            r36 = r14
            r39 = r7
            r40 = r5
            r41 = r9
            r43 = r35
            r46 = r3
            r47 = r17
            X.73t r0 = r36.A01(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)
            X.206 r1 = r9.A00
            boolean r20 = r2.A09(r5, r1)
            r1 = r23
            com.whatsapp.jid.Jid r1 = r5.A06(r1)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1CJ r10 = r2.A0G
            int r12 = r10.A03(r6)
            X.C17960vV.A07(r9)
            X.206 r10 = r9.A00
            long r10 = r10.A0G
            boolean r30 = r2.A08(r1, r12, r10)
            int r10 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r10 >= r1) goto L_0x0b91
            if (r21 != 0) goto L_0x0b91
            java.lang.String r1 = r42.A06()
            int r12 = java.lang.Integer.parseInt(r1)
            r11 = 0
            r10 = 1
            r1 = r18
            if (r1 != r8) goto L_0x0b2c
            r37 = 1
            if (r20 != 0) goto L_0x0b2e
        L_0x0b2c:
            r37 = 0
        L_0x0b2e:
            if (r12 != 0) goto L_0x0b34
            r20 = 1
            if (r30 != 0) goto L_0x0b36
        L_0x0b34:
            r20 = 0
        L_0x0b36:
            X.70P r8 = r2.A0R
            X.206 r1 = r9.A00
            boolean r12 = r8.A06(r1)
            r1 = r17
            if (r1 != r10) goto L_0x0db9
            if (r12 == 0) goto L_0x0db9
            X.2rD r11 = r2.A0P
            X.206 r8 = r9.A00
            X.1E7 r1 = r9.A03()
            r11.A01(r7, r0, r1, r8)
            r37 = 0
        L_0x0b51:
            X.17d r1 = r9.A08
            r35 = r10
            r30 = r1
            r31 = r0
            r32 = r5
            r33 = r9
            r34 = r10
            r36 = r19
            r30.A0M(r31, r32, r33, r34, r35, r36, r37)
            boolean r1 = r2.A06()
            r9.A07(r0, r5, r3, r1)
            boolean r11 = r9.A08(r7, r0, r5)
        L_0x0b6f:
            r1 = r18
            if (r1 != r10) goto L_0x0b91
            r1 = r70
            android.graphics.Bitmap r1 = r1.A0F(r5)
            X.AnonymousClass70v.A00(r1, r0)
            X.0ve r9 = r2.A0I
            r8 = 3156(0xc54, float:4.422E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r9, r8)
            r9 = 1
            if (r1 != 0) goto L_0x0d96
            r9 = 0
            if (r20 == 0) goto L_0x0d96
            if (r11 != 0) goto L_0x0d96
        L_0x0b8e:
            r2.A03(r7, r0, r5)
        L_0x0b91:
            long r8 = java.lang.System.currentTimeMillis()
            X.1gx r1 = r2.A0L
            long r10 = r1.A00
            long r30 = r8 - r10
            r1.A00 = r8
            r8 = 200(0xc8, double:9.9E-322)
            int r1 = (r30 > r8 ? 1 : (r30 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x0cb8
            if (r22 != 0) goto L_0x0cb8
            android.telephony.TelephonyManager r12 = r68.A0K()
            r1 = r23
            com.whatsapp.jid.Jid r8 = r5.A06(r1)
            X.C17960vV.A07(r8)
            X.1BI r8 = (X.AnonymousClass1BI) r8
            r1 = r72
            X.1yM r30 = r1.A0a(r8)
            boolean r11 = r15.A01()
            boolean r20 = r15.A03()
            r10 = 1
            r15 = 0
            if (r11 == 0) goto L_0x0bc9
            r9 = 1
            if (r20 == 0) goto L_0x0bca
        L_0x0bc9:
            r9 = 0
        L_0x0bca:
            if (r12 == 0) goto L_0x0bdc
            boolean r1 = X.AnonymousClass112.A08()
            if (r1 == 0) goto L_0x0d8d
            X.17x r8 = r2.A0E
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r1 = r8.A02(r1)
            if (r1 == 0) goto L_0x0d8d
        L_0x0bdc:
            r1 = 0
        L_0x0bdd:
            if (r11 != 0) goto L_0x0be9
            if (r1 != 0) goto L_0x0be9
            X.7Mo r8 = r13.A00
            if (r8 == 0) goto L_0x0d41
            boolean r8 = r8.A0O
            if (r8 == 0) goto L_0x0d41
        L_0x0be9:
            java.lang.String r8 = " vibrate=force off ("
            r3.append(r8)
            r3.append(r9)
            r8 = 32
            r3.append(r8)
            r3.append(r1)
            r8 = 41
            r3.append(r8)
            long[] r10 = new long[r10]
            r11 = 0
            r10[r15] = r11
            android.app.Notification r8 = r0.A08
            r8.vibrate = r10
            if (r1 != 0) goto L_0x0c82
        L_0x0c0a:
            if (r20 != 0) goto L_0x0c82
            X.1RW r1 = r2.A0B
            X.1RX r8 = r1.A00()
            X.1LD r1 = r2.A0V
            boolean r1 = r1.A01()
            if (r1 != 0) goto L_0x0d36
            X.195 r1 = r2.A03
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0d36
            r1 = r23
            com.whatsapp.jid.Jid r1 = r5.A06(r1)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            boolean r1 = r8.A01(r1)
            if (r1 == 0) goto L_0x0d36
            boolean r1 = r71.A2I()
            if (r1 == 0) goto L_0x0d33
            java.lang.String r1 = " tone=conversation"
            r3.append(r1)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C19620yd.A04
            r8.append(r1)
            r1 = 2132017176(0x7f140018, float:1.9672623E38)
            java.lang.String r8 = X.C17880vN.A0t(r8, r1)
        L_0x0c49:
            if (r9 == 0) goto L_0x0c61
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x0c61
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r1 = X.C19620yd.A04
            r8.append(r1)
            r1 = 2132017178(0x7f14001a, float:1.9672627E38)
            java.lang.String r8 = X.C17880vN.A0t(r8, r1)
        L_0x0c61:
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x0c82
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r1 = " sound="
            r3.append(r1)
            r3.append(r8)
            if (r8 == 0) goto L_0x0c82
            if (r49 != 0) goto L_0x0c82
            X.1Vg r1 = r2.A0Z
            r9 = r0
            r10 = r68
            r11 = r1
            r12 = r58
            X.C217217d.A07(r7, r8, r9, r10, r11, r12)
        L_0x0c82:
            X.1LD r8 = r2.A0V
            boolean r1 = r8.A01()
            if (r1 == 0) goto L_0x0d26
            java.lang.String r1 = r30.A05()
            java.lang.Integer r1 = X.C217217d.A05(r1)
            if (r1 == 0) goto L_0x0d23
            int r10 = r1.intValue()
            r8 = 1000(0x3e8, float:1.401E-42)
            r1 = 4000(0xfa0, float:5.605E-42)
            android.app.Notification r9 = r0.A08
            r9.ledARGB = r10
            r9.ledOnMS = r8
            r9.ledOffMS = r1
            r8 = 1
            int r1 = r9.flags
            r1 = r1 & -2
            r8 = r8 | r1
            r9.flags = r8
            java.lang.String r1 = " color="
            r3.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r10)
        L_0x0cb5:
            r3.append(r1)
        L_0x0cb8:
            r11 = 26
            X.7Rn r8 = new X.7Rn
            r8.<init>(r11)
            r1 = r28
            java.util.Collections.sort(r1, r8)
            int r8 = android.os.Build.VERSION.SDK_INT
            if (r8 < r11) goto L_0x0cde
            r1 = 27
            if (r8 > r1) goto L_0x0cde
            int r8 = r28.size()
            r1 = 2
            if (r8 != r1) goto L_0x0cde
            X.1Vn r9 = r2.A0D
            int r8 = r2.A00()
            java.lang.String r1 = "UpdateMessageNotificationRunnable3"
            r9.BEJ(r8, r1)
        L_0x0cde:
            boolean r1 = r2.A06()
            if (r1 == 0) goto L_0x0cf9
            r35 = 0
            r30 = r2
            r31 = r3
            r32 = r28
            r33 = r17
            r34 = r18
            r36 = r19
            r37 = r50
            r38 = r27
            r30.A05(r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x0cf9:
            androidx.core.app.NotificationCompat$InboxStyle r12 = new androidx.core.app.NotificationCompat$InboxStyle
            r12.<init>()
            java.lang.CharSequence r1 = X.C1409673t.A04(r44)
            r12.A01 = r1
            r1 = 1
            r12.A02 = r1
            java.lang.String r1 = r14.A00
            r19 = r1
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r28.iterator()
        L_0x0d13:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0e83
            java.lang.Object r1 = r8.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r9.addAll(r1)
            goto L_0x0d13
        L_0x0d23:
            java.lang.String r1 = " color=null"
            goto L_0x0cb5
        L_0x0d26:
            java.lang.String r1 = " screen_lock="
            r3.append(r1)
            boolean r1 = r8.A01()
            r3.append(r1)
            goto L_0x0cb8
        L_0x0d33:
            r8 = 0
            goto L_0x0c49
        L_0x0d36:
            java.lang.String r1 = " tone=notification"
            r3.append(r1)
            java.lang.String r8 = r30.A07()
            goto L_0x0c49
        L_0x0d41:
            if (r49 != 0) goto L_0x0c0a
            java.lang.String r8 = r30.A08()
            java.lang.String r1 = " vibrate="
            r3.append(r1)
            r3.append(r8)
            int r11 = r8.hashCode()
            r1 = 2
            switch(r11) {
                case 49: goto L_0x0d59;
                case 50: goto L_0x0d66;
                case 51: goto L_0x0d70;
                default: goto L_0x0d57;
            }
        L_0x0d57:
            goto L_0x0c0a
        L_0x0d59:
            java.lang.String r10 = "1"
            boolean r8 = r8.equals(r10)
            if (r8 == 0) goto L_0x0c0a
            r0.A06(r1)
            goto L_0x0c0a
        L_0x0d66:
            java.lang.String r1 = "2"
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x0d79
            goto L_0x0c0a
        L_0x0d70:
            java.lang.String r1 = "3"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0c0a
            r10 = 2
        L_0x0d79:
            r1 = 5
            long[] r1 = new long[r1]
            int r10 = 1 - r10
            if (r10 == 0) goto L_0x0d89
            r1 = {0, 750, 250, 750, 250} // fill-array
        L_0x0d83:
            android.app.Notification r8 = r0.A08
            r8.vibrate = r1
            goto L_0x0c0a
        L_0x0d89:
            r1 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x0d83
        L_0x0d8d:
            int r8 = r12.getCallState()     // Catch:{ SecurityException -> 0x0bdc }
            r1 = 1
            if (r8 != 0) goto L_0x0bdd
            goto L_0x0bdc
        L_0x0d96:
            boolean r1 = r2.A07(r5)
            if (r1 == 0) goto L_0x0da9
            X.1LU r8 = r2.A0J
            r1 = 21
            X.C217217d.A08(r7, r0, r5, r8, r1)
        L_0x0da3:
            if (r9 == 0) goto L_0x0b91
            if (r12 != 0) goto L_0x0b91
            goto L_0x0b8e
        L_0x0da9:
            if (r50 != 0) goto L_0x0da3
            if (r11 != 0) goto L_0x0da3
            if (r12 != 0) goto L_0x0da3
            X.6yd r8 = com.whatsapp.notification.AndroidWear.A00(r7, r5)
            java.util.ArrayList r1 = r0.A0Q
            r1.add(r8)
            goto L_0x0da3
        L_0x0db9:
            if (r37 == 0) goto L_0x0dbe
            r2.A04(r0, r5, r1, r10)
        L_0x0dbe:
            if (r1 != r10) goto L_0x0b6f
            goto L_0x0b51
        L_0x0dc2:
            r0 = r70
            X.118 r0 = r0.A07
            android.content.Context r1 = r0.A00
            r0 = 2131899099(0x7f1232db, float:1.9433134E38)
            java.lang.String r45 = r1.getString(r0)
            goto L_0x0ab8
        L_0x0dd1:
            X.0vb r14 = r9.A06
            r13 = 2131755286(0x7f100116, float:1.9141447E38)
            r0 = r26
            long r11 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.C17880vN.A1T(r1, r0, r10)
            java.lang.String r44 = r14.A0K(r1, r13, r11)
            goto L_0x0aa4
        L_0x0de4:
            X.1BI r0 = r5.A0J
            boolean r0 = X.C22971Dz.A0V(r0)
            r11 = 2
            X.0vb r13 = r9.A06
            r12 = 2131755288(0x7f100118, float:1.9141451E38)
            if (r0 == 0) goto L_0x0df5
            r12 = 2131755289(0x7f100119, float:1.9141453E38)
        L_0x0df5:
            r0 = r18
            long r0 = (long) r0
            r30 = r0
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r0 = r26
            long r14 = (long) r0
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.C17880vN.A1T(r1, r0, r10)
            r0 = 2131755287(0x7f100117, float:1.914145E38)
            java.lang.String r0 = r13.A0K(r1, r0, r14)
            r11[r10] = r0
            r0 = r18
            X.C17880vN.A1T(r11, r0, r8)
            r0 = r30
            java.lang.String r44 = r13.A0K(r11, r12, r0)
            goto L_0x0aa4
        L_0x0e1a:
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0e4b
            X.C17960vV.A0D(r0)
            android.content.Intent r1 = X.C17880vN.A0A()
            java.lang.String r10 = r7.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversationslist.LockedConversationsActivity"
            r1.setClassName(r10, r0)
            java.lang.String r0 = "fromNotification"
            r10 = 1
            android.content.Intent r1 = r1.putExtra(r0, r10)
            r0 = r18
            if (r0 != r10) goto L_0x0e44
            X.1BI r0 = r5.A0J
            java.lang.String r10 = X.C22971Dz.A06(r0)
            java.lang.String r0 = "jid"
            r1.putExtra(r0, r10)
        L_0x0e44:
            r0 = 0
            android.app.PendingIntent r37 = X.C1408573i.A00(r7, r0, r1, r8)
            goto L_0x0a70
        L_0x0e4b:
            r1 = r26
            r0 = r18
            if (r1 != r0) goto L_0x0e77
            X.0ve r10 = r2.A0I
            r1 = 12470(0x30b6, float:1.7474E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r10, r1)
            if (r0 == 0) goto L_0x0e77
            r10 = 6
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r7)
            java.lang.String r0 = X.C28901bF.A03
            r1.setAction(r0)
        L_0x0e6b:
            java.lang.String r11 = "fromNotification"
            r0 = 1
            r1.putExtra(r11, r0)
            android.app.PendingIntent r37 = X.C1408573i.A00(r7, r10, r1, r8)
            goto L_0x0a70
        L_0x0e77:
            r10 = 2
            android.content.Intent r1 = X.AnonymousClass1LU.A02(r7)
            java.lang.String r0 = X.C28901bF.A02
            android.content.Intent r1 = r1.setAction(r0)
            goto L_0x0e6b
        L_0x0e83:
            r8 = 0
            X.3D2 r1 = new X.3D2
            r1.<init>(r8)
            java.util.Collections.sort(r9, r1)
            int r1 = r9.size()
            int r1 = r1 + -7
            r13 = 0
            int r8 = java.lang.Math.max(r8, r1)
            int r1 = r9.size()
            java.util.List r17 = r9.subList(r8, r1)
            int r1 = r17.size()
            r10 = 1
            if (r1 <= r10) goto L_0x0f24
            boolean r1 = r2.A06()
            if (r1 == 0) goto L_0x0f24
            r9 = 0
        L_0x0ead:
            int r1 = r17.size()
            if (r9 >= r1) goto L_0x0f0f
            r1 = r17
            java.lang.Object r8 = r1.get(r9)
            X.2nW r8 = (X.C60182nW) r8
            X.1M9 r14 = r8.A03
            X.206 r1 = r8.A00
            X.1BI r1 = X.AnonymousClass205.A00(r1)
            X.1E7 r15 = r14.A0H(r1)
            r14 = 1
            r1 = r18
            if (r1 > r10) goto L_0x0ecd
            r14 = 0
        L_0x0ecd:
            java.lang.CharSequence r15 = r8.A05(r15, r14)
            if (r15 == 0) goto L_0x0edc
            java.util.ArrayList r14 = r12.A00
            java.lang.CharSequence r1 = X.C1409673t.A04(r15)
            r14.add(r1)
        L_0x0edc:
            java.lang.String r1 = " line:"
            r3.append(r1)
            java.lang.String r1 = "("
            r3.append(r1)
            int r1 = r15.length()
            r3.append(r1)
            r1 = 47
            r3.append(r1)
            X.206 r14 = r8.A00
            X.1BI r14 = X.AnonymousClass205.A00(r14)
            r3.append(r14)
            r3.append(r1)
            X.206 r1 = r8.A00
            X.205 r1 = r1.A0v
            java.lang.String r1 = r1.A01
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            int r9 = r9 + 1
            goto L_0x0ead
        L_0x0f0f:
            r0.A0B(r12)
            java.lang.String r1 = " inbox:"
            r3.append(r1)
            r8 = 8
            int r1 = r17.size()
            int r1 = java.lang.Math.min(r8, r1)
            r3.append(r1)
        L_0x0f24:
            int r1 = android.os.Build.VERSION.SDK_INT
            r8 = 0
            if (r1 < r11) goto L_0x0f46
            X.1BI r1 = r5.A0J
            boolean r1 = X.C22971Dz.A0V(r1)
            if (r1 != 0) goto L_0x0f46
            X.1BI r1 = r5.A0J
            X.C17960vV.A07(r1)
            java.lang.String r9 = r1.getRawString()
            if (r9 == 0) goto L_0x0f3e
            r0.A0O = r9
        L_0x0f3e:
            boolean r1 = r2.A00
            if (r1 == 0) goto L_0x0f48
            r0.A0G(r10)
            goto L_0x0f48
        L_0x0f46:
            r9 = r8
            goto L_0x0f3e
        L_0x0f48:
            android.app.Notification r11 = r0.A05()     // Catch:{ SecurityException -> 0x0f7e }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x0f7e }
            r0 = 24
            if (r1 < r0) goto L_0x0f62
            boolean r0 = r2.A06()     // Catch:{ SecurityException -> 0x0f7e }
            if (r0 == 0) goto L_0x0f62
            X.1ab r0 = r2.A0Q     // Catch:{ SecurityException -> 0x0f7e }
            X.1ac r0 = r0.A00(r7)     // Catch:{ SecurityException -> 0x0f7e }
            r0.A02(r13, r11)     // Catch:{ SecurityException -> 0x0f7e }
            goto L_0x0f6d
        L_0x0f62:
            X.1ab r0 = r2.A0Q     // Catch:{ SecurityException -> 0x0f7e }
            X.1ac r1 = r0.A00(r7)     // Catch:{ SecurityException -> 0x0f7e }
            r0 = r26
            r1.A02(r0, r11)     // Catch:{ SecurityException -> 0x0f7e }
        L_0x0f6d:
            if (r9 == 0) goto L_0x0f74
            X.1hL r0 = r2.A05     // Catch:{ SecurityException -> 0x0f7e }
            r0.A04(r7, r5, r8)     // Catch:{ SecurityException -> 0x0f7e }
        L_0x0f74:
            X.1Vn r1 = r2.A0D     // Catch:{ SecurityException -> 0x0f7e }
            int r0 = r2.A00()     // Catch:{ SecurityException -> 0x0f7e }
            r1.BkR(r0, r11)     // Catch:{ SecurityException -> 0x0f7e }
            goto L_0x0fac
        L_0x0f7e:
            r8 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/postSummaryNotification uid="
            r1.append(r0)
            int r0 = android.os.Process.myUid()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            com.whatsapp.util.Log.i(r0, r8)
            boolean r0 = X.C39761tb.A05()
            if (r0 == 0) goto L_0x111c
            if (r19 == 0) goto L_0x136e
            java.lang.String r0 = X.C39591tK.A01(r19)
            if (r0 == 0) goto L_0x136e
            r1 = r72
            X.1yM r1 = X.AnonymousClass1Nb.A01(r1, r0)
            r0 = r72
            r0.A0s(r1)
        L_0x0fac:
            boolean r0 = r2.A00
            android.content.SharedPreferences$Editor r8 = X.C19830z4.A00(r71)
            if (r0 == 0) goto L_0x1118
            java.lang.String r1 = "locked_chat_last_notification_hash"
        L_0x0fb6:
            r0 = r25
            X.C17880vN.A1E(r8, r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/notify"
            X.C17900vP.A0Y(r3, r0, r1)
            if (r4 == 0) goto L_0x0fdd
            if (r22 != 0) goto L_0x0fdd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "messagenotification/ new="
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass25A.A0D(r4)
            r1.append(r0)
            r0 = r29
            X.C17900vP.A0n(r0, r1, r13)
        L_0x0fdd:
            if (r21 != 0) goto L_0x002a
            X.1RW r0 = r2.A0B
            X.1RX r1 = r0.A00()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x1114
            X.BCs r0 = r1.A00()
            r0.COU(r6)
        L_0x0ff0:
            if (r50 == 0) goto L_0x100c
            X.1KB r8 = r2.A0i
            X.1LD r3 = r2.A0V
            X.195 r1 = r2.A03
            X.3Ck r0 = new X.3Ck
            r61 = r0
            r62 = r7
            r63 = r1
            r64 = r24
            r65 = r69
            r66 = r3
            r61.<init>(r62, r63, r64, r65, r66, r67)
            r8.A0J(r0)
        L_0x100c:
            if (r4 == 0) goto L_0x002a
            boolean r0 = r5.A0F()
            if (r0 == 0) goto L_0x1041
            X.1dd r3 = r2.A0N
            X.1E9 r6 = (X.AnonymousClass1E9) r6
            X.C18070vi.A0d(r6, r13)
            X.1MW r0 = r3.A00
            int r1 = r0.A09(r6)
            int r5 = r1 + -1
            r0 = 35
            if (r1 >= r0) goto L_0x1110
            long r7 = X.C30251dd.A06
        L_0x1029:
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r0 = X.C30251dd.A07
            long r13 = X.C30251dd.A04
            long r9 = (long) r5
            long r13 = r13 * r9
            long r0 = r0 + r13
            long r0 = java.lang.Math.min(r0, r7)
            java.lang.Long r1 = X.C17880vN.A0o(r11, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r3.A01
            r0.put(r6, r1)
        L_0x1041:
            X.1an r0 = r2.A0k
            r0.A01()
            X.205 r6 = r4.A0v
            X.1BI r5 = r6.A00
            if (r5 == 0) goto L_0x105e
            X.1i1 r1 = r2.A0r
            r0 = 0
            r1.A0C(r5, r0)
            X.A5M r3 = r2.A0l
            r1 = 33
            X.AkM r0 = new X.AkM
            r0.<init>(r3, r5, r4, r1)
            X.A5M.A01(r3, r0)
        L_0x105e:
            X.1Vm r7 = r2.A0v
            java.lang.String r9 = r6.toString()
            if (r5 == 0) goto L_0x110a
            boolean r0 = X.C22971Dz.A0e(r5)
            if (r0 == 0) goto L_0x10f1
            r11 = 2
        L_0x106d:
            java.lang.String r10 = r5.getRawString()
        L_0x1071:
            boolean r0 = r4 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x108e
            X.210 r4 = (X.AnonymousClass210) r4
            java.lang.String r0 = r4.A06
            r1 = 1
            if (r0 == 0) goto L_0x107e
            r1 = 18
        L_0x107e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        L_0x1082:
            X.10s r0 = r7.A03
            r12 = 0
            X.7R3 r6 = new X.7R3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.execute(r6)
            return
        L_0x108e:
            boolean r0 = r4 instanceof X.C441822l
            if (r0 == 0) goto L_0x1094
            r1 = 2
            goto L_0x107e
        L_0x1094:
            boolean r0 = r4 instanceof X.C438921i
            if (r0 == 0) goto L_0x109a
            r1 = 3
            goto L_0x107e
        L_0x109a:
            boolean r0 = r4 instanceof X.C438421d
            if (r0 == 0) goto L_0x10a0
            r1 = 4
            goto L_0x107e
        L_0x10a0:
            boolean r0 = r4 instanceof X.AnonymousClass21Y
            if (r0 == 0) goto L_0x10a6
            r1 = 5
            goto L_0x107e
        L_0x10a6:
            boolean r0 = r4 instanceof X.C441322g
            if (r0 == 0) goto L_0x10ad
            r1 = 8
            goto L_0x107e
        L_0x10ad:
            boolean r0 = r4 instanceof X.C441522i
            if (r0 == 0) goto L_0x10b4
            r1 = 32
            goto L_0x107e
        L_0x10b4:
            if (r16 == 0) goto L_0x10b9
            r1 = 9
            goto L_0x107e
        L_0x10b9:
            boolean r0 = r4 instanceof X.AnonymousClass23S
            if (r0 == 0) goto L_0x10c0
            r1 = 10
            goto L_0x107e
        L_0x10c0:
            boolean r0 = r4 instanceof X.AnonymousClass22A
            if (r0 == 0) goto L_0x10c7
            r1 = 14
            goto L_0x107e
        L_0x10c7:
            boolean r0 = r4 instanceof X.AnonymousClass2MH
            if (r0 != 0) goto L_0x10ee
            boolean r0 = r4 instanceof X.AnonymousClass21D
            if (r0 != 0) goto L_0x10ee
            boolean r0 = r4 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x10d6
            r1 = 16
            goto L_0x107e
        L_0x10d6:
            boolean r0 = r4 instanceof X.AnonymousClass218
            if (r0 == 0) goto L_0x10dd
            r1 = 17
            goto L_0x107e
        L_0x10dd:
            boolean r0 = r4 instanceof X.AnonymousClass22O
            if (r0 == 0) goto L_0x10ec
            X.22O r4 = (X.AnonymousClass22O) r4
            boolean r0 = r4.A18()
            r1 = 6
            if (r0 == 0) goto L_0x107e
            r1 = 7
            goto L_0x107e
        L_0x10ec:
            r8 = 0
            goto L_0x1082
        L_0x10ee:
            r1 = 15
            goto L_0x107e
        L_0x10f1:
            boolean r0 = X.C22971Dz.A0S(r5)
            if (r0 == 0) goto L_0x10fa
            r11 = 5
            goto L_0x106d
        L_0x10fa:
            boolean r0 = X.C22971Dz.A0d(r5)
            if (r0 == 0) goto L_0x1103
            r11 = 1
            goto L_0x106d
        L_0x1103:
            boolean r0 = X.C22971Dz.A0a(r5)
            r11 = 6
            if (r0 != 0) goto L_0x106d
        L_0x110a:
            r11 = 3
            if (r5 != 0) goto L_0x106d
            r10 = 0
            goto L_0x1071
        L_0x1110:
            long r7 = X.C30251dd.A05
            goto L_0x1029
        L_0x1114:
            X.AnonymousClass4IT.A00 = r10
            goto L_0x0ff0
        L_0x1118:
            java.lang.String r1 = "last_notification_hash"
            goto L_0x0fb6
        L_0x111c:
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "permission issue with UPDATE_APP_OPS_STATS should only occur in Android 4.3 or earlier"
            X.C17960vV.A0F(r13, r0)
            java.lang.String r0 = "android.permission.UPDATE_APP_OPS_STATS"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x136e
            goto L_0x0fac
        L_0x112f:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x1148 }
            java.nio.charset.Charset r0 = X.C26571Sq.A05     // Catch:{ NoSuchAlgorithmException -> 0x1148 }
            byte[] r0 = X.C18070vi.A1A(r2, r0)     // Catch:{ NoSuchAlgorithmException -> 0x1148 }
            byte[] r1 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x1148 }
            r0 = 0
            java.lang.String r5 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x1148 }
            X.C18070vi.A0b(r5)     // Catch:{ NoSuchAlgorithmException -> 0x1148 }
            goto L_0x1154
        L_0x1148:
            r1 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x114f:
            java.lang.String r0 = "waContactNames"
            goto L_0x12db
        L_0x1154:
            java.util.concurrent.ConcurrentHashMap r2 = X.C49002Ou.A03
            java.lang.Object r14 = r2.get(r5)
            X.1D6 r14 = (X.AnonymousClass1D6) r14
            if (r14 != 0) goto L_0x1162
            X.1D6 r14 = X.AnonymousClass1D6.A00(r13, r0)
        L_0x1162:
            java.lang.Object r1 = r14.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r14.second
            int r15 = X.AnonymousClass000.A0M(r0)
            if (r15 <= 0) goto L_0x1184
            android.content.res.Resources r3 = r11.getResources()
            java.lang.Object[] r1 = X.C17890vO.A1a(r1)
            r0 = 1
            X.C17880vN.A1T(r1, r15, r0)
            r0 = 2131755404(0x7f10018c, float:1.9141686E38)
            java.lang.String r1 = r3.getQuantityString(r0, r15, r1)
            X.C18070vi.A0b(r1)
        L_0x1184:
            java.lang.Object r3 = r14.first
            java.lang.Object r0 = r14.second
            int r0 = X.AnonymousClass000.A0M(r0)
            int r0 = r0 + 1
            X.1D6 r0 = X.AnonymousClass1D6.A00(r3, r0)
            r2.put(r5, r0)
            X.73t r3 = X.C217217d.A03(r11)
            r3.A0F(r6)
            r0 = 3
            r3.A06(r0)
            r2 = 1
            r3.A0G(r2)
            r0 = r16
            r3.A0A = r0
            r3.A0E(r1)
            r3.A0D(r6)
            java.lang.String r19 = "status_reactions_group_id"
            r0 = r19
            r3.A0N = r0
            r3.A01 = r2
            r18 = 89
            java.lang.Class<com.whatsapp.status.notifications.StatusNotificationDismissReceiver> r17 = com.whatsapp.status.notifications.StatusNotificationDismissReceiver.class
            android.content.Intent r14 = new android.content.Intent
            r0 = r17
            r14.<init>(r11, r0)
            java.lang.String r16 = "notification_tag"
            r0 = r16
            r14.putExtra(r0, r5)
            java.lang.String r1 = "notification_id"
            r14.putExtra(r1, r7)
            if (r5 == 0) goto L_0x11d4
            int r18 = r5.hashCode()
        L_0x11d4:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r15 = r0
            r0 = r18
            android.app.PendingIntent r0 = X.C1408573i.A01(r11, r0, r14, r15)
            X.C18070vi.A0X(r0)
            android.app.Notification r14 = r3.A08
            r14.deleteIntent = r0
            if (r8 == 0) goto L_0x11e8
            r3.A0M = r8
        L_0x11e8:
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r14.icon = r0
            if (r10 == 0) goto L_0x11f2
            X.AnonymousClass70v.A00(r10, r3)
        L_0x11f2:
            X.73t r14 = X.C217217d.A03(r11)
            r14.A0F(r6)
            r0 = 3
            r14.A06(r0)
            r14.A0G(r2)
            X.00H r0 = r12.A05
            if (r0 == 0) goto L_0x12d2
            r0.get()
            android.content.Intent r15 = X.C17880vN.A0A()
            java.lang.String r10 = r11.getPackageName()
            java.lang.String r0 = "com.whatsapp.status.playback.MyStatusesActivity"
            r15.setClassName(r10, r0)
            X.205 r0 = r4.A0v
            int r0 = r0.hashCode()
            android.app.PendingIntent r0 = X.C17880vN.A07(r11, r15, r0)
            X.C18070vi.A0X(r0)
            r14.A0A = r0
            r15 = 2131896343(0x7f122817, float:1.9427545E38)
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r4 = 0
            r10[r4] = r13
            r0 = r20
            java.lang.String r0 = r0.A02(r15, r10)
            r14.A0E(r0)
            r14.A0D(r6)
            r0 = r19
            r14.A0N = r0
            r14.A01 = r2
            r14.A0V = r2
            r2 = 0
            r6 = 90
            android.content.Intent r10 = new android.content.Intent
            r0 = r17
            r10.<init>(r11, r0)
            r0 = r16
            r10.putExtra(r0, r2)
            r10.putExtra(r1, r6)
            android.app.PendingIntent r0 = X.C17880vN.A06(r11, r10, r6)
            X.C18070vi.A0X(r0)
            android.app.Notification r1 = r14.A08
            r1.deleteIntent = r0
            if (r8 == 0) goto L_0x1260
            r14.A0M = r8
        L_0x1260:
            r0 = 2131231578(0x7f08035a, float:1.807924E38)
            r1.icon = r0
            X.1Vn r1 = r12.A07
            android.app.Notification r0 = r3.A05()
            X.C18070vi.A0X(r0)
            r1.BkT(r0, r5, r7, r4)
            android.app.Notification r0 = r14.A05()
            X.C18070vi.A0X(r0)
            r1.BkT(r0, r2, r6, r4)
            X.00H r0 = r12.A00
            if (r0 == 0) goto L_0x12cc
            X.0vd r1 = X.C17880vN.A0P(r0)
            r0 = 8728(0x2218, float:1.223E-41)
            boolean r0 = X.C18020vd.A05(r9, r1, r0)
            if (r0 == 0) goto L_0x1298
            X.00H r0 = r12.A02
            if (r0 == 0) goto L_0x12c5
            java.lang.Object r0 = r0.get()
            X.1Vm r0 = (X.C27291Vm) r0
            r0.A00(r7, r2)
        L_0x1298:
            X.00H r0 = r12.A00
            if (r0 == 0) goto L_0x12c1
            java.lang.Object r1 = r0.get()
            X.COe r1 = (X.C24886COe) r1
            X.00H r0 = r12.A01
            if (r0 == 0) goto L_0x12bd
            java.lang.Object r0 = r0.get()
            X.11P r0 = (X.AnonymousClass11P) r0
            long r2 = X.AnonymousClass11P.A01(r0)
            X.0vl r0 = r1.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "status_like_reply_last_timestamp"
            X.C17880vN.A1D(r1, r0, r2)
            return
        L_0x12bd:
            java.lang.String r0 = "time"
            goto L_0x12db
        L_0x12c1:
            java.lang.String r0 = "statusSharedPreferences"
            goto L_0x12db
        L_0x12c5:
            java.lang.String r0 = "wamNotificationDeliveryUtil"
            X.C18070vi.A11(r0)
            throw r2
        L_0x12cc:
            java.lang.String r0 = "abProps"
            X.C18070vi.A11(r0)
            throw r2
        L_0x12d2:
            java.lang.String r0 = "waIntents"
            goto L_0x12db
        L_0x12d6:
            java.lang.String r0 = "abProps"
            goto L_0x12db
        L_0x12d9:
            java.lang.String r0 = "contactManager"
        L_0x12db:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x12e0:
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x1351 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x1351 }
            java.lang.String r10 = X.AnonymousClass203.A0F     // Catch:{ all -> 0x1351 }
            java.lang.String[] r8 = X.C17880vN.A1Z()     // Catch:{ all -> 0x1351 }
            X.1LW r0 = r11.A00     // Catch:{ all -> 0x1351 }
            long r0 = r0.A09(r5)     // Catch:{ all -> 0x1351 }
            X.C17890vO.A1J(r8, r0)     // Catch:{ all -> 0x1351 }
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x1351 }
            r0 = 1
            r8[r0] = r1     // Catch:{ all -> 0x1351 }
            java.lang.String r0 = "GET_NOTIFICATION_MESSAGES_FOR_REPLY_SQL"
            android.database.Cursor r0 = r12.A0A(r10, r0, r8)     // Catch:{ all -> 0x1351 }
            X.AnonymousClass1R3.A02(r0, r11, r5, r9)     // Catch:{ all -> 0x1305 }
            goto L_0x1311
        L_0x1305:
            r1 = move-exception
            if (r0 == 0) goto L_0x1310
            r0.close()     // Catch:{ all -> 0x130c }
            goto L_0x1310
        L_0x130c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1351 }
        L_0x1310:
            throw r1     // Catch:{ all -> 0x1351 }
        L_0x1311:
            if (r0 == 0) goto L_0x1316
            r0.close()     // Catch:{ all -> 0x1351 }
        L_0x1316:
            r14.close()
            X.1LY r8 = r11.A02
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r15
            java.lang.String r5 = "LastMessageStore/getLastMessagesForNotificationAfterReply"
            r8.A01(r5, r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x1329:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x133b
            X.206 r0 = X.C17880vN.A0Y(r1)
            X.2nW r0 = r7.A05(r0)
            r6.add(r0)
            goto L_0x1329
        L_0x133b:
            java.util.Collections.reverse(r6)
            r0 = r28
            r0.add(r6)
            r8 = 0
            r11 = r8
            r12 = r8
            r5 = r2
            r6 = r3
            r7 = r0
            r9 = r8
            r10 = r4
            r13 = r27
            r5.A05(r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x1351:
            r8 = move-exception
            r14.close()     // Catch:{ all -> 0x136a }
            throw r8
        L_0x1356:
            r1 = move-exception
            if (r14 == 0) goto L_0x1361
            r14.close()     // Catch:{ all -> 0x135d }
            goto L_0x1361
        L_0x135d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x1362 }
        L_0x1361:
            throw r1     // Catch:{ all -> 0x1362 }
        L_0x1362:
            r8 = move-exception
            r24.close()     // Catch:{ all -> 0x136a }
            throw r8
        L_0x1367:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x136a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r8, r0)
        L_0x136e:
            throw r8
        L_0x136f:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70873Cv.run():void");
    }
}
