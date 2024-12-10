package com.whatsapp.systemstatus;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1MB;
import X.AnonymousClass3Ma;
import X.C132216mP;
import X.C18070vi;
import X.C72473Md;
import X.C72483Me;
import X.C91034f2;
import java.util.List;

public final class SystemStatusActivity extends AnonymousClass1FY {
    public C132216mP A00;
    public AnonymousClass1MB A01;
    public boolean A02;
    public final List A03;

    public SystemStatusActivity() {
        this(0);
        String[] strArr = new String[4];
        strArr[0] = "broadcast";
        strArr[1] = "registration";
        strArr[2] = "sync";
        this.A03 = C18070vi.A0O("status", strArr, 3);
    }

    public void A2y() {
        if (!this.A02) {
            this.A02 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            this.A00 = (C132216mP) r1.A4S.get();
            this.A01 = AnonymousClass3Ma.A0k(A0L);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008c, code lost:
        if (r6 == null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x035f, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0363, code lost:
        if (r0 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0365, code lost:
        r0 = getString(r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0379, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x037d, code lost:
        if (r0 == null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x037f, code lost:
        r0 = getString(r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0211, code lost:
        r0 = java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0215, code lost:
        if (r0 == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0217, code lost:
        r9 = getString(r0.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x021f, code lost:
        if (r9 == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0221, code lost:
        r10.append("  • ");
        r10.append(r9);
        r10.append(10);
        r13 = r13 + 1;
        r7 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r5 = r27
            r0 = r28
            super.onCreate(r0)
            r0 = 2131896765(0x7f1229bd, float:1.94284E38)
            r1 = 2131896765(0x7f1229bd, float:1.94284E38)
            r5.setTitle(r0)
            X.01n r0 = r5.getSupportActionBar()
            r4 = 1
            if (r0 == 0) goto L_0x0020
            r0.A0W(r4)
            r0.A0G()
            r0.A0M(r1)
        L_0x0020:
            r0 = 2131627163(0x7f0e0c9b, float:1.8881583E38)
            r5.setContentView((int) r0)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.from"
            java.lang.String r22 = X.C72453Mb.A0x(r1, r0)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.type"
            r8 = 0
            int r3 = r1.getIntExtra(r0, r8)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.email"
            boolean r17 = r1.getBooleanExtra(r0, r4)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.version"
            boolean r16 = r1.getBooleanExtra(r0, r4)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.statusonly"
            boolean r15 = r1.getBooleanExtra(r0, r8)
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.serverfeaturesunavailable"
            java.util.ArrayList r2 = r1.getStringArrayListExtra(r0)
            if (r2 != 0) goto L_0x0069
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
        L_0x0069:
            java.lang.String r6 = "registration"
            boolean r0 = r2.remove(r6)
            X.4rF r1 = X.C98494rF.A00()
            if (r16 != 0) goto L_0x012b
            r7 = 2131895022(0x7f1222ee, float:1.9424865E38)
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = "https://whatsapp.com/android"
            java.lang.String r6 = X.C17880vN.A0q(r5, r0, r6, r8, r7)
            r0 = 2131896766(0x7f1229be, float:1.9428403E38)
            if (r17 == 0) goto L_0x0088
            r0 = 2131896767(0x7f1229bf, float:1.9428405E38)
        L_0x0088:
            java.lang.String r6 = X.C17890vO.A0R(r5, r6, r4, r8, r0)
        L_0x008c:
            if (r6 != 0) goto L_0x0097
        L_0x008e:
            if (r15 == 0) goto L_0x00f5
            r0 = 2131895940(0x7f122684, float:1.9426727E38)
            java.lang.String r6 = r5.getString(r0)
        L_0x0097:
            r0 = 2131435993(0x7f0b21d9, float:1.8493844E38)
            android.widget.TextView r0 = X.AnonymousClass3MX.A0L(r5, r0)
            r0.setText(r6)
            if (r15 != 0) goto L_0x03a6
            if (r17 == 0) goto L_0x03a6
            java.lang.Object r0 = r1.element
            if (r0 != 0) goto L_0x00cd
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            r0 = 43
            r7.append(r0)
            java.lang.String r6 = "+"
            r0 = 0
            java.lang.String r0 = X.C29431cG.A0h(r6, r2, r0)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r7)
            r1.element = r0
            if (r16 != 0) goto L_0x00cd
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r0)
            java.lang.String r0 = "+version"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            r1.element = r0
        L_0x00cd:
            r0 = 2131435995(0x7f0b21db, float:1.8493848E38)
            android.view.View r2 = r5.findViewById(r0)
            X.4d0 r0 = new X.4d0
            r6 = r0
            r7 = r5
            r8 = r1
            r9 = r22
            r10 = r3
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r2.setOnClickListener(r0)
            r0 = 2131435994(0x7f0b21da, float:1.8493846E38)
            android.view.View r2 = r5.findViewById(r0)
            r1 = 44
            X.78P r0 = new X.78P
            r0.<init>((java.lang.Object) r5, (int) r1)
            r2.setOnClickListener(r0)
            return
        L_0x00f5:
            X.6mP r9 = r5.A00
            if (r9 == 0) goto L_0x03b0
            X.1MB r0 = r5.A01
            if (r0 == 0) goto L_0x03ad
            boolean r26 = r0.A00()
            java.lang.Object r8 = r1.element
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Integer r21 = java.lang.Integer.valueOf(r3)
            android.content.Intent r7 = r5.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r19 = r7.getBundleExtra(r0)
            r20 = 0
            X.6np r0 = r9.A00
            r25 = r20
            r23 = r8
            r24 = r20
            r18 = r0
            android.content.Intent r0 = r18.A00(r19, r20, r21, r22, r23, r24, r25, r26)
            r5.startActivity(r0)
            r5.finish()
            goto L_0x0097
        L_0x012b:
            if (r3 == r4) goto L_0x0157
            if (r0 == 0) goto L_0x03a3
            if (r17 != 0) goto L_0x03a1
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            r0 = 2131896758(0x7f1229b6, float:1.9428386E38)
            X.C17880vN.A1A(r5, r8, r0)
            r0 = 32
            r8.append(r0)
            java.util.List r0 = r5.A03
            boolean r6 = r0.contains(r6)
        L_0x0146:
            r0 = 2131896732(0x7f12299c, float:1.9428334E38)
            if (r6 == 0) goto L_0x014e
            r0 = 2131896734(0x7f12299e, float:1.9428338E38)
        L_0x014e:
            X.C17880vN.A1A(r5, r8, r0)
            java.lang.String r6 = r8.toString()
            goto L_0x008c
        L_0x0157:
            java.lang.String r0 = "chat"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x016d
            r0 = 2131896730(0x7f12299a, float:1.942833E38)
            if (r17 == 0) goto L_0x0167
            r0 = 2131896731(0x7f12299b, float:1.9428332E38)
        L_0x0167:
            java.lang.String r6 = r5.getString(r0)
            goto L_0x008c
        L_0x016d:
            int r0 = r2.size()
            r6 = 0
            if (r0 <= 0) goto L_0x008e
            r2.size()
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.util.Iterator r14 = r2.iterator()
            X.C18070vi.A0X(r14)
            r7 = r6
            r13 = 0
        L_0x0184:
            boolean r0 = r14.hasNext()
            r12 = 10
            if (r0 == 0) goto L_0x0231
            java.lang.Object r11 = r14.next()
            X.C18070vi.A0X(r11)
            java.lang.String r11 = (java.lang.String) r11
            int r0 = r11.hashCode()
            switch(r0) {
                case -1618876223: goto L_0x0206;
                case -1012222381: goto L_0x01fa;
                case -892481550: goto L_0x01ee;
                case -309425751: goto L_0x01e2;
                case 3314326: goto L_0x01d6;
                case 3452698: goto L_0x01ca;
                case 3545755: goto L_0x01be;
                case 98629247: goto L_0x01b2;
                case 1262089803: goto L_0x01a6;
                default: goto L_0x019c;
            }
        L_0x019c:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sysstatus/create/m-down/string-not-found "
            X.C17900vP.A0e(r0, r11, r9)
            goto L_0x0184
        L_0x01a6:
            java.lang.String r0 = "multimedia"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896744(0x7f1229a8, float:1.9428358E38)
            goto L_0x0211
        L_0x01b2:
            java.lang.String r0 = "group"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896738(0x7f1229a2, float:1.9428346E38)
            goto L_0x0211
        L_0x01be:
            java.lang.String r0 = "sync"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896764(0x7f1229bc, float:1.9428398E38)
            goto L_0x0211
        L_0x01ca:
            java.lang.String r0 = "push"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896757(0x7f1229b5, float:1.9428384E38)
            goto L_0x0211
        L_0x01d6:
            java.lang.String r0 = "last"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896741(0x7f1229a5, float:1.9428352E38)
            goto L_0x0211
        L_0x01e2:
            java.lang.String r0 = "profile"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896754(0x7f1229b2, float:1.9428378E38)
            goto L_0x0211
        L_0x01ee:
            java.lang.String r0 = "status"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896761(0x7f1229b9, float:1.9428392E38)
            goto L_0x0211
        L_0x01fa:
            java.lang.String r0 = "online"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896751(0x7f1229af, float:1.9428372E38)
            goto L_0x0211
        L_0x0206:
            java.lang.String r0 = "broadcast"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x019c
            r0 = 2131896729(0x7f122999, float:1.9428327E38)
        L_0x0211:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x019c
            int r0 = r0.intValue()
            java.lang.String r9 = r5.getString(r0)
            if (r9 == 0) goto L_0x019c
            java.lang.String r0 = "  • "
            r10.append(r0)
            r10.append(r9)
            r10.append(r12)
            int r13 = r13 + 1
            r7 = r11
            goto L_0x0184
        L_0x0231:
            if (r13 <= r4) goto L_0x0260
            r10.append(r12)
            java.lang.String r6 = "\n\n"
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            if (r17 == 0) goto L_0x024f
            r0 = 2131896746(0x7f1229aa, float:1.9428362E38)
            X.C17880vN.A1A(r5, r8, r0)
            r8.append(r6)
            r8.append(r10)
            r0 = 2131896748(0x7f1229ac, float:1.9428366E38)
            goto L_0x014e
        L_0x024f:
            r0 = 2131896745(0x7f1229a9, float:1.942836E38)
            X.C17880vN.A1A(r5, r8, r0)
            r8.append(r6)
            r8.append(r10)
            r0 = 2131896747(0x7f1229ab, float:1.9428364E38)
            goto L_0x014e
        L_0x0260:
            if (r13 <= 0) goto L_0x008e
            if (r17 == 0) goto L_0x02e9
            if (r7 == 0) goto L_0x026d
            int r0 = r7.hashCode()
            switch(r0) {
                case -1618876223: goto L_0x036e;
                case -1012222381: goto L_0x02dc;
                case -892481550: goto L_0x02cf;
                case -309425751: goto L_0x02c2;
                case 3314326: goto L_0x02b5;
                case 3452698: goto L_0x02a8;
                case 3545755: goto L_0x029b;
                case 98629247: goto L_0x028e;
                case 1262089803: goto L_0x0281;
                default: goto L_0x026d;
            }
        L_0x026d:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sysstatus/create/down/string-not-found "
            r7.append(r0)
            java.lang.Object r0 = r2.get(r8)
            java.lang.String r0 = (java.lang.String) r0
            X.C17890vO.A19(r7, r0)
            goto L_0x008e
        L_0x0281:
            java.lang.String r0 = "multimedia"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896743(0x7f1229a7, float:1.9428356E38)
            goto L_0x0379
        L_0x028e:
            java.lang.String r0 = "group"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896737(0x7f1229a1, float:1.9428344E38)
            goto L_0x0379
        L_0x029b:
            java.lang.String r0 = "sync"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896763(0x7f1229bb, float:1.9428396E38)
            goto L_0x0379
        L_0x02a8:
            java.lang.String r0 = "push"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896756(0x7f1229b4, float:1.9428382E38)
            goto L_0x0379
        L_0x02b5:
            java.lang.String r0 = "last"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896740(0x7f1229a4, float:1.942835E38)
            goto L_0x0379
        L_0x02c2:
            java.lang.String r0 = "profile"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896753(0x7f1229b1, float:1.9428376E38)
            goto L_0x0379
        L_0x02cf:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896760(0x7f1229b8, float:1.942839E38)
            goto L_0x0379
        L_0x02dc:
            java.lang.String r0 = "online"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896750(0x7f1229ae, float:1.942837E38)
            goto L_0x0379
        L_0x02e9:
            if (r7 == 0) goto L_0x026d
            int r0 = r7.hashCode()
            switch(r0) {
                case -1618876223: goto L_0x0354;
                case -1012222381: goto L_0x0348;
                case -892481550: goto L_0x033c;
                case -309425751: goto L_0x0330;
                case 3314326: goto L_0x0324;
                case 3452698: goto L_0x0318;
                case 3545755: goto L_0x030c;
                case 98629247: goto L_0x0300;
                case 1262089803: goto L_0x02f4;
                default: goto L_0x02f2;
            }
        L_0x02f2:
            goto L_0x026d
        L_0x02f4:
            java.lang.String r0 = "multimedia"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896742(0x7f1229a6, float:1.9428354E38)
            goto L_0x035f
        L_0x0300:
            java.lang.String r0 = "group"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896736(0x7f1229a0, float:1.9428342E38)
            goto L_0x035f
        L_0x030c:
            java.lang.String r0 = "sync"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896762(0x7f1229ba, float:1.9428394E38)
            goto L_0x035f
        L_0x0318:
            java.lang.String r0 = "push"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896755(0x7f1229b3, float:1.942838E38)
            goto L_0x035f
        L_0x0324:
            java.lang.String r0 = "last"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896739(0x7f1229a3, float:1.9428348E38)
            goto L_0x035f
        L_0x0330:
            java.lang.String r0 = "profile"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896752(0x7f1229b0, float:1.9428374E38)
            goto L_0x035f
        L_0x033c:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896759(0x7f1229b7, float:1.9428388E38)
            goto L_0x035f
        L_0x0348:
            java.lang.String r0 = "online"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896749(0x7f1229ad, float:1.9428368E38)
            goto L_0x035f
        L_0x0354:
            java.lang.String r0 = "broadcast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896727(0x7f122997, float:1.9428323E38)
        L_0x035f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x026d
            int r0 = r0.intValue()
            java.lang.String r0 = r5.getString(r0)
            goto L_0x0387
        L_0x036e:
            java.lang.String r0 = "broadcast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x026d
            r0 = 2131896728(0x7f122998, float:1.9428325E38)
        L_0x0379:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            if (r0 == 0) goto L_0x026d
            int r0 = r0.intValue()
            java.lang.String r0 = r5.getString(r0)
        L_0x0387:
            if (r0 == 0) goto L_0x026d
            java.lang.StringBuilder r8 = X.AnonymousClass000.A11(r0)
            r0 = 32
            r8.append(r0)
            if (r17 == 0) goto L_0x0399
            r0 = 2131896733(0x7f12299d, float:1.9428336E38)
            goto L_0x014e
        L_0x0399:
            java.util.List r0 = r5.A03
            boolean r6 = X.C29431cG.A18(r0, r7)
            goto L_0x0146
        L_0x03a1:
            r1.element = r6
        L_0x03a3:
            r6 = 0
            goto L_0x008e
        L_0x03a6:
            r0 = 2131435992(0x7f0b21d8, float:1.8493842E38)
            X.C72463Mc.A19(r5, r0)
            return
        L_0x03ad:
            java.lang.String r0 = "supportGatingUtils"
            goto L_0x03b2
        L_0x03b0:
            java.lang.String r0 = "sendFeedback"
        L_0x03b2:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.systemstatus.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }

    public SystemStatusActivity(int i) {
        this.A02 = false;
        C91034f2.A00(this, 46);
    }
}
