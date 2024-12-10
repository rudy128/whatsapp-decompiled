package X;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: X.Akb  reason: case insensitive filesystem */
public class C21470Akb implements Runnable {
    public int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C21470Akb(Context context, AnonymousClass1VE r3) {
        this.A01 = 27;
        this.A02 = context;
        this.A00 = 2132017171;
        this.A03 = r3;
    }

    public static void A00(Object obj, Object obj2, Executor executor, int i, int i2) {
        executor.execute(new C21470Akb(obj, i, i2, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0508, code lost:
        r0 = r23.putString(r21, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0510, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0513, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0581, code lost:
        if (com.whatsapp.backup.google.RestoreFromBackupActivity.A19(r8) != false) goto L_0x0e04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0583, code lost:
        r0 = r8.A01;
        X.C17960vV.A05(r0);
        r0.setIndeterminate(false);
        r1 = r8.A03;
        X.C17960vV.A05(r1);
        r1.setText(2131886439);
        r1 = r8.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0598, code lost:
        if (r1 != null) goto L_0x05a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x059a, code lost:
        r1 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) X.C110885hR.A0A(r8, 2131431178);
        r8.A0E = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x05a5, code lost:
        r1.A01 = 4;
        r0 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05aa, code lost:
        if (r0 == null) goto L_0x05af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x05ac, code lost:
        r0.cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05af, code lost:
        r0 = X.C110885hR.A0A(r8, 2131431163);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05b8, code lost:
        if (r3 == null) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05ba, code lost:
        r0.setVisibility(0);
        X.AnonymousClass3MW.A0I(r8, 2131431162).setText(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x05c7, code lost:
        X.AnonymousClass8BS.A0z(r8, 2131431098, 0);
        com.whatsapp.backup.google.RestoreFromBackupActivity.A0y(r8, com.whatsapp.backup.google.RestoreFromBackupActivity.A0Q(r8));
        X.AnonymousClass8BS.A0z(r8, 2131431173, 8);
        r8.A0E.setVisibility(8);
        r8.A01.setVisibility(8);
        r8.A03.setVisibility(8);
        com.whatsapp.backup.google.RestoreFromBackupActivity.A0s(r2, new X.AnonymousClass78J(r8, 46), r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x05f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05f4, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x069c, code lost:
        X.C17890vO.A0w(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0839, code lost:
        if (r13 != null) goto L_0x06d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0bfc, code lost:
        r2.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0bff, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:?, code lost:
        r5.call("kill_process", (java.lang.String) null, (android.os.Bundle) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0cea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x0ceb, code lost:
        r5.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0cee, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0cef, code lost:
        r5.release();
        r2 = r4.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0cf4, code lost:
        if (r2 == null) goto L_0x0cf6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0cf6, code lost:
        X.C18070vi.A11("mainThreadHandler");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0cfb, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0cfc, code lost:
        r2.post(new X.AnonymousClass3C0(r4, r3, 41));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0d06, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0e04, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error ");
        r1.append(r6);
        r0 = X.AnonymousClass000.A0y(" since Activity is about to finish.", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0e16, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0e19, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x026d, code lost:
        if (r0 == false) goto L_0x026f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x080a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:468:0x0cea A[ExcHandler: all (r0v45 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:440:0x0c46] */
    /* JADX WARNING: Removed duplicated region for block: B:681:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r25 = this;
            r3 = r25
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0d83;
                case 1: goto L_0x092e;
                case 2: goto L_0x0d75;
                case 3: goto L_0x0d69;
                case 4: goto L_0x08f1;
                case 5: goto L_0x0d5b;
                case 6: goto L_0x0d4b;
                case 7: goto L_0x0d39;
                case 8: goto L_0x0d2a;
                case 9: goto L_0x093c;
                case 10: goto L_0x08a8;
                case 11: goto L_0x0d1c;
                case 12: goto L_0x088e;
                case 13: goto L_0x083d;
                case 14: goto L_0x0d0c;
                case 15: goto L_0x0c26;
                case 16: goto L_0x06a3;
                case 17: goto L_0x0c12;
                case 18: goto L_0x0c00;
                case 19: goto L_0x053a;
                case 20: goto L_0x0bc5;
                case 21: goto L_0x0965;
                case 22: goto L_0x0514;
                case 23: goto L_0x0b34;
                case 24: goto L_0x0007;
                case 25: goto L_0x0007;
                case 26: goto L_0x0b26;
                case 27: goto L_0x04e9;
                case 28: goto L_0x049e;
                case 29: goto L_0x0afd;
                case 30: goto L_0x0ae9;
                case 31: goto L_0x0acb;
                case 32: goto L_0x0170;
                case 33: goto L_0x0049;
                case 34: goto L_0x0a99;
                case 35: goto L_0x0466;
                case 36: goto L_0x0448;
                case 37: goto L_0x0a63;
                case 38: goto L_0x041f;
                case 39: goto L_0x0a47;
                case 40: goto L_0x0a30;
                case 41: goto L_0x03e6;
                case 42: goto L_0x09d6;
                case 43: goto L_0x0233;
                case 44: goto L_0x099e;
                case 45: goto L_0x0991;
                case 46: goto L_0x021c;
                case 47: goto L_0x01fe;
                case 48: goto L_0x01d3;
                case 49: goto L_0x0983;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r3.A02
            X.1vd r0 = (X.C40991vd) r0
            java.lang.Object r6 = r3.A03
            X.2mw r6 = (X.C59822mw) r6
            int r2 = r3.A00
            X.1vb r0 = r0.A00
            X.1vh r1 = r0.A07
            if (r2 == 0) goto L_0x001e
            r0 = 1
            if (r2 == r0) goto L_0x003b
            r0 = 2
            if (r2 == r0) goto L_0x003b
        L_0x001d:
            return
        L_0x001e:
            if (r6 == 0) goto L_0x003b
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r5 = r1.A00
            X.2yJ r0 = r5.A06
            if (r0 == 0) goto L_0x002e
            long r3 = r0.A00
            long r1 = r6.A03
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
        L_0x002e:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A07(r5, r6)
        L_0x0031:
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel.A06(r5)
            return
        L_0x003b:
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentViewModel r0 = r1.A00
            X.1vb r1 = r0.A0R
            r1.A02()
            r0 = 1
            if (r2 != r0) goto L_0x001d
            r1.A01()
            return
        L_0x0049:
            java.lang.Object r2 = r3.A02
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r1 = r3.A03
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r0 = r3.A00
            r24 = r0
            r2.A09()
            android.content.SharedPreferences r23 = X.C32951i1.A00(r2)
            java.lang.String r22 = r1.getRawString()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r22)
            java.lang.String r21 = "_notification"
            r0 = r21
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r1 = "null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null,null"
            r0 = r23
            java.lang.String r1 = r0.getString(r2, r1)
            java.lang.String r20 = ","
            r0 = r20
            java.lang.String[] r1 = r1.split(r0)
            r0 = 0
            java.lang.Long r15 = X.C63782tg.A05(r1, r0)
            r0 = 1
            java.lang.Long r14 = X.C63782tg.A05(r1, r0)
            r0 = 2
            java.lang.Long r19 = X.C63782tg.A05(r1, r0)
            r0 = 3
            java.lang.Long r18 = X.C63782tg.A05(r1, r0)
            r0 = 4
            java.lang.Long r17 = X.C63782tg.A05(r1, r0)
            r0 = 5
            java.lang.Long r13 = X.C63782tg.A05(r1, r0)
            r0 = 6
            java.lang.Long r12 = X.C63782tg.A05(r1, r0)
            r0 = 7
            java.lang.Long r11 = X.C63782tg.A05(r1, r0)
            r0 = 8
            java.lang.Long r16 = X.C63782tg.A05(r1, r0)
            r0 = 9
            java.lang.Long r10 = X.C63782tg.A05(r1, r0)
            r0 = 10
            java.lang.Long r9 = X.C63782tg.A05(r1, r0)
            r0 = 11
            java.lang.Long r8 = X.C63782tg.A05(r1, r0)
            r0 = 12
            java.lang.Long r7 = X.C63782tg.A05(r1, r0)
            r0 = 13
            java.lang.Long r6 = X.C63782tg.A05(r1, r0)
            r0 = 14
            java.lang.Long r5 = X.C63782tg.A05(r1, r0)
            r0 = 15
            java.lang.Long r4 = X.C63782tg.A05(r1, r0)
            r0 = 16
            java.lang.Long r3 = X.C63782tg.A05(r1, r0)
            r1 = 1
            switch(r24) {
                case 0: goto L_0x016a;
                case 1: goto L_0x0164;
                case 2: goto L_0x015d;
                case 3: goto L_0x0156;
                case 4: goto L_0x014f;
                case 5: goto L_0x014a;
                case 6: goto L_0x0145;
                case 7: goto L_0x0140;
                case 8: goto L_0x00e3;
                case 9: goto L_0x013b;
                case 10: goto L_0x0136;
                case 11: goto L_0x0131;
                case 12: goto L_0x012c;
                case 13: goto L_0x0127;
                case 14: goto L_0x0122;
                case 15: goto L_0x011d;
                default: goto L_0x00df;
            }
        L_0x00df:
            java.lang.Long r3 = X.C63782tg.A04(r3, r1)
        L_0x00e3:
            android.content.SharedPreferences$Editor r23 = r23.edit()
            r1 = r22
            r0 = r21
            java.lang.String r21 = X.C17900vP.A0A(r1, r0)
            r0 = 17
            java.lang.Long[] r2 = new java.lang.Long[r0]
            r1 = r19
            r0 = r18
            X.C17900vP.A0O(r15, r14, r1, r0, r2)
            r0 = r17
            X.C17900vP.A0P(r0, r13, r12, r11, r2)
            r0 = r16
            X.C17890vO.A0x(r0, r10, r2)
            X.C17900vP.A0Q(r9, r8, r7, r6, r2)
            r0 = 14
            r2[r0] = r5
            r0 = 15
            r2[r0] = r4
            r0 = 16
            java.util.List r1 = X.AnonymousClass8BR.A15(r3, r2, r0)
            r0 = r20
            java.lang.String r2 = android.text.TextUtils.join(r0, r1)
            goto L_0x0508
        L_0x011d:
            java.lang.Long r4 = X.C63782tg.A04(r4, r1)
            goto L_0x00e3
        L_0x0122:
            java.lang.Long r5 = X.C63782tg.A04(r5, r1)
            goto L_0x00e3
        L_0x0127:
            java.lang.Long r6 = X.C63782tg.A04(r6, r1)
            goto L_0x00e3
        L_0x012c:
            java.lang.Long r7 = X.C63782tg.A04(r7, r1)
            goto L_0x00e3
        L_0x0131:
            java.lang.Long r8 = X.C63782tg.A04(r8, r1)
            goto L_0x00e3
        L_0x0136:
            java.lang.Long r9 = X.C63782tg.A04(r9, r1)
            goto L_0x00e3
        L_0x013b:
            java.lang.Long r10 = X.C63782tg.A04(r10, r1)
            goto L_0x00e3
        L_0x0140:
            java.lang.Long r11 = X.C63782tg.A04(r11, r1)
            goto L_0x00e3
        L_0x0145:
            java.lang.Long r12 = X.C63782tg.A04(r12, r1)
            goto L_0x00e3
        L_0x014a:
            java.lang.Long r13 = X.C63782tg.A04(r13, r1)
            goto L_0x00e3
        L_0x014f:
            r0 = r17
            java.lang.Long r17 = X.C63782tg.A04(r0, r1)
            goto L_0x00e3
        L_0x0156:
            r0 = r18
            java.lang.Long r18 = X.C63782tg.A04(r0, r1)
            goto L_0x00e3
        L_0x015d:
            r0 = r19
            java.lang.Long r19 = X.C63782tg.A04(r0, r1)
            goto L_0x00e3
        L_0x0164:
            java.lang.Long r14 = X.C63782tg.A04(r14, r1)
            goto L_0x00e3
        L_0x016a:
            java.lang.Long r15 = X.C63782tg.A04(r15, r1)
            goto L_0x00e3
        L_0x0170:
            java.lang.Object r0 = r3.A02
            X.1i1 r0 = (X.C32951i1) r0
            java.lang.Object r10 = r3.A03
            com.whatsapp.jid.Jid r10 = (com.whatsapp.jid.Jid) r10
            r0.A09()
            android.content.SharedPreferences r11 = X.C32951i1.A00(r0)
            java.lang.String r0 = r10.getRawString()
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r0)
            java.lang.String r9 = "_businessTools"
            java.lang.String r1 = X.AnonymousClass000.A0y(r9, r0)
            java.lang.String r0 = "null,null,null,null"
            java.lang.String r0 = r11.getString(r1, r0)
            java.lang.String r7 = ","
            java.lang.String[] r1 = r0.split(r7)
            r0 = 0
            java.lang.Long r8 = X.C63782tg.A05(r1, r0)
            r0 = 1
            java.lang.Long r6 = X.C63782tg.A05(r1, r0)
            r0 = 2
            java.lang.Long r5 = X.C63782tg.A05(r1, r0)
            r4 = 3
            java.lang.Long r2 = X.C63782tg.A05(r1, r4)
            r0 = 1
            java.lang.Long r3 = X.C63782tg.A04(r2, r0)
            android.content.SharedPreferences$Editor r2 = r11.edit()
            java.lang.String r0 = r10.getRawString()
            java.lang.String r1 = X.C17900vP.A0A(r0, r9)
            r0 = 4
            java.lang.Long[] r0 = new java.lang.Long[r0]
            X.AnonymousClass8BX.A1K(r8, r6, r5, r0)
            java.util.List r0 = X.AnonymousClass8BR.A15(r3, r0, r4)
            java.lang.String r0 = android.text.TextUtils.join(r7, r0)
            android.content.SharedPreferences$Editor r0 = r2.putString(r1, r0)
            goto L_0x0510
        L_0x01d3:
            java.lang.Object r0 = r3.A02
            X.1Co r0 = (X.C22621Co) r0
            java.lang.Object r1 = r3.A03
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r3 = r3.A00
            X.00H r0 = r0.A01
            java.lang.Object r0 = r0.get()
            X.1as r0 = (X.C28771as) r0
            X.1Nb r2 = r0.A0J
            X.00H r0 = r2.A0K
            r0.get()
            java.lang.String r0 = r1.getRawString()
            X.1yM r1 = X.AnonymousClass1Nb.A01(r2, r0)
            int r0 = r1.A02
            if (r3 == r0) goto L_0x001d
            r1.A02 = r3
            X.AnonymousClass1Nb.A07(r1, r2)
            return
        L_0x01fe:
            java.lang.Object r0 = r3.A02
            X.1Vt r0 = (X.C27351Vt) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A03
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.9j8 r0 = (X.AnonymousClass9j8) r0
            java.util.Map r0 = r0.A00
            int r0 = r0.size()
            if (r0 != r2) goto L_0x001d
            r1.run()
            return
        L_0x021c:
            java.lang.Object r5 = r3.A02
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r4 = r3.A03
            X.A4F r4 = (X.A4F) r4
            int r2 = r3.A00
            if (r5 == 0) goto L_0x001d
            X.18K r1 = r4.A02
            r0 = 1
            X.8rE r0 = X.A4F.A00(r4, r5, r2, r0)
            r1.CC7(r0)
            return
        L_0x0233:
            java.lang.Object r8 = r3.A02
            X.4aY r8 = (X.AnonymousClass4aY) r8
            java.lang.Object r7 = r3.A03
            X.1ch r7 = (X.C29681ch) r7
            int r9 = r3.A00
            X.00H r0 = r8.A5l
            java.lang.Object r0 = r0.get()
            X.4X5 r0 = (X.AnonymousClass4X5) r0
            X.00H r0 = r0.A0J
            java.lang.Object r11 = r0.get()
            X.9lv r11 = (X.C191039lv) r11
            r13 = 0
            X.C18070vi.A0d(r7, r13)
            X.1CJ r0 = r11.A01
            X.1ci r2 = X.AnonymousClass1CJ.A00(r0, r7)
            boolean r0 = r2 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x03e3
            X.2Dk r2 = (X.C46162Dk) r2
        L_0x025d:
            r14 = 1
            if (r2 == 0) goto L_0x026f
            X.9Ig r1 = r2.A02
            X.9Ig r0 = X.C179509Ig.SUBSCRIBED
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 == 0) goto L_0x026f
            boolean r0 = r2.A0B
            r2 = 1
            if (r0 != 0) goto L_0x0270
        L_0x026f:
            r2 = 0
        L_0x0270:
            X.9pY r10 = r11.A03
            X.9qs r4 = r10.A00
            java.lang.String r6 = "newsletter_total_unmute_nudges_shown_key"
            java.lang.String r0 = r4.A00(r6)
            if (r0 == 0) goto L_0x03e0
            int r1 = java.lang.Integer.parseInt(r0)
        L_0x0280:
            X.1c4 r12 = r11.A02
            X.0ve r5 = r12.A02
            r0 = 7530(0x1d6a, float:1.0552E-41)
            X.0vf r3 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r3, r5, r0)
            if (r1 == r0) goto L_0x028f
            r14 = 0
        L_0x028f:
            if (r2 == 0) goto L_0x0dac
            if (r14 != 0) goto L_0x0daf
            boolean r0 = X.AnonymousClass1c4.A02(r12, r13)
            if (r0 != 0) goto L_0x001d
            X.11P r11 = r11.A00
            long r0 = X.AnonymousClass11P.A01(r11)
            java.util.concurrent.TimeUnit r15 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r2 = "newsletter_last_unmute_nudge_shown_timestamp_key"
            java.lang.String r4 = r4.A00(r2)
            if (r4 == 0) goto L_0x03dc
            long r13 = java.lang.Long.parseLong(r4)
        L_0x02ad:
            long r0 = r0 - r13
            long r15 = r15.toDays(r0)
            r13 = 2
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
            java.util.List r0 = r10.A00()
            java.util.Set r1 = X.C29431cG.A12(r0)
            java.lang.String r0 = r7.user
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x001d
            r0 = 1
            boolean r0 = X.AnonymousClass1c4.A02(r12, r0)
            if (r0 == 0) goto L_0x0356
            java.util.List r13 = r10.A01(r7)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto L_0x001d
            int r1 = r13.size()
            r0 = 1
            if (r1 == r0) goto L_0x001d
            java.lang.Object r0 = X.C29431cG.A0b(r13)
            long r10 = X.C17880vN.A05(r0)
            java.lang.Object r0 = X.C29431cG.A0d(r13)
            long r0 = X.C17880vN.A05(r0)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r0 - r10
            long r11 = r4.toDays(r0)
            int r1 = r13.size()
            r0 = 5
            if (r1 < r0) goto L_0x001d
            if (r9 != 0) goto L_0x001d
            r9 = 1
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x001d
        L_0x0306:
            r0 = 7529(0x1d69, float:1.055E-41)
            boolean r0 = X.C18020vd.A05(r3, r5, r0)
            if (r0 == 0) goto L_0x001d
            X.1KB r3 = r8.A1L
            r1 = 22
            X.4rn r0 = new X.4rn
            r0.<init>((java.lang.Object) r8, (int) r1)
            r3.A0J(r0)
            X.00H r0 = r8.A5l
            java.lang.Object r0 = r0.get()
            X.4X5 r0 = (X.AnonymousClass4X5) r0
            X.00H r0 = r0.A0J
            java.lang.Object r1 = r0.get()
            X.9lv r1 = (X.C191039lv) r1
            X.9pY r4 = r1.A03
            X.9qs r3 = r4.A00
            java.lang.String r0 = r3.A00(r6)
            if (r0 == 0) goto L_0x0354
            int r0 = java.lang.Integer.parseInt(r0)
        L_0x0338:
            int r0 = r0 + 1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A01(r6, r0)
            X.11P r0 = r1.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3.A01(r2, r0)
            X.0wS r0 = X.C18460wS.A00
            r4.A02(r7, r0)
            return
        L_0x0354:
            r0 = 0
            goto L_0x0338
        L_0x0356:
            r0 = 3
            boolean r0 = X.AnonymousClass1c4.A02(r12, r0)
            if (r0 == 0) goto L_0x03c6
            java.util.List r14 = r10.A01(r7)
            long r10 = X.AnonymousClass11P.A01(r11)
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.Object r0 = X.C29431cG.A0b(r14)
            long r0 = X.C17880vN.A05(r0)
            long r0 = r0 - r10
            long r12 = r4.toDays(r0)
            r10 = 0
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x001d
            r12 = 1
            java.util.List r0 = X.C29431cG.A0p(r14)
            java.util.HashSet r13 = X.C17880vN.A12()
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.util.Iterator r14 = r0.iterator()
        L_0x038f:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x03b5
            long r0 = X.C17890vO.A07(r14)
            java.util.Date r10 = new java.util.Date
            r10.<init>(r0)
            java.lang.String r4 = "yyyy-MM-dd"
            java.text.SimpleDateFormat r4 = X.AnonymousClass8BS.A0q(r4)
            java.lang.String r10 = r4.format(r10)
            boolean r4 = r13.contains(r10)
            if (r4 != 0) goto L_0x038f
            X.C17880vN.A1R(r11, r0)
            r13.add(r10)
            goto L_0x038f
        L_0x03b5:
            if (r9 != 0) goto L_0x001d
            int r0 = r11.size()
            if (r0 <= r12) goto L_0x001d
            int r1 = r11.size()
            r0 = 4
            if (r1 >= r0) goto L_0x001d
            goto L_0x0306
        L_0x03c6:
            r0 = 2
            boolean r0 = X.AnonymousClass1c4.A02(r12, r0)
            if (r0 == 0) goto L_0x001d
            r0 = 1
            if (r9 != r0) goto L_0x001d
            java.util.List r0 = r10.A01(r7)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x001d
            goto L_0x0306
        L_0x03dc:
            r13 = 0
            goto L_0x02ad
        L_0x03e0:
            r1 = 0
            goto L_0x0280
        L_0x03e3:
            r2 = 0
            goto L_0x025d
        L_0x03e6:
            java.lang.Object r2 = r3.A02
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r5 = r3.A03
            X.8nl r5 = (X.C169908nl) r5
            int r4 = r3.A00
            X.AEt r0 = X.AnonymousClass8BR.A0g(r2)
            if (r0 == 0) goto L_0x041d
            X.AEk r0 = r0.A06
            if (r0 == 0) goto L_0x041d
            java.util.List r3 = r0.A03
        L_0x03fc:
            X.00H r0 = r5.A07
            X.1W6 r1 = X.C17880vN.A0c(r0)
            X.205 r0 = r2.A0v
            X.206 r2 = X.C108945cZ.A0s(r0, r1)
            if (r2 == 0) goto L_0x001d
            if (r3 == 0) goto L_0x001d
            java.lang.Object r1 = X.C29431cG.A0f(r3, r4)
            X.ADl r1 = (X.C20253ADl) r1
            if (r1 == 0) goto L_0x001d
            r0 = 1
            r1.A00 = r0
            X.122 r0 = r5.A01
            r0.CQw(r2)
            return
        L_0x041d:
            r3 = 0
            goto L_0x03fc
        L_0x041f:
            java.lang.Object r5 = r3.A02
            X.5yP r5 = (X.C116655yP) r5
            java.lang.Object r4 = r3.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r1 = r3.A00
            X.00H r0 = r5.A0A
            java.lang.Object r0 = r0.get()
            X.1iV r0 = (X.C33241iV) r0
            r2 = 11
            X.C33241iV.A00(r0, r4, r2, r1)
            com.whatsapp.jid.UserJid r1 = r4.A0I()
            if (r1 == 0) goto L_0x001d
            X.00H r0 = r5.A07
            java.lang.Object r0 = r0.get()
            X.A5M r0 = (X.A5M) r0
            r0.A02(r1, r4, r2)
            return
        L_0x0448:
            java.lang.Object r5 = r3.A02
            X.3uR r5 = (X.C79093uR) r5
            java.lang.Object r4 = r3.A03
            android.view.View r4 = (android.view.View) r4
            int r2 = r3.A00
            X.206 r0 = r5.getFMessage()
            X.205 r1 = r0.A0v
            java.lang.Object r0 = r5.getTag()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001d
            r4.setVisibility(r2)
            return
        L_0x0466:
            java.lang.Object r6 = r3.A02
            X.3uP r6 = (X.AnonymousClass3uP) r6
            java.lang.Object r5 = r3.A03
            X.206 r5 = (X.AnonymousClass206) r5
            int r4 = r3.A00
            X.5cR r3 = r6.A0k
            X.00H r0 = r6.A28
            java.lang.Object r2 = r0.get()
            X.4Yp r2 = (X.C88174Yp) r2
            java.lang.String[] r0 = X.C1409073n.A04
            r0 = 0
            int r1 = X.C72453Mb.A0G(r5, r2, r0)
            if (r3 == 0) goto L_0x001d
            int r0 = r3.getContainerType()
            if (r0 == 0) goto L_0x048b
            if (r0 != r1) goto L_0x001d
        L_0x048b:
            boolean r0 = r2.A02(r5)
            if (r0 == 0) goto L_0x001d
            X.1KB r2 = r6.A0S
            r1 = 37
            X.Akb r0 = new X.Akb
            r0.<init>((java.lang.Object) r6, (int) r4, (int) r1, (java.lang.Object) r5)
            r2.A0J(r0)
            return
        L_0x049e:
            java.lang.Object r5 = r3.A02
            X.1gf r5 = (X.C32111gf) r5
            int r4 = r3.A00
            java.lang.Object r3 = r3.A03
            X.1EC r3 = (X.AnonymousClass1EC) r3
            r6 = 2
            X.00H r0 = r5.A0B
            java.lang.Object r7 = r0.get()
            X.1ub r7 = (X.C40371ub) r7
            X.1gd r0 = r5.A03
            int r2 = r0.BVA(r3)
            X.1MZ r0 = r5.A07
            X.1MW r0 = r0.A08
            X.2tp r0 = r0.A0B(r3)
            int r0 = r0.A06()
            long r0 = (long) r0
            r7.A0B(r4, r0, r2)
            r0 = 3
            if (r4 == r0) goto L_0x04d4
            r0 = 4
            if (r4 == r0) goto L_0x0dfa
            r0 = 5
            if (r4 == r0) goto L_0x04d4
            r0 = 6
            if (r4 == r0) goto L_0x04d4
            return
        L_0x04d4:
            X.00H r1 = r5.A0A
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r1)
            X.1EC r2 = r0.A05(r3)
            if (r2 == 0) goto L_0x001d
            X.1kb r1 = X.AnonymousClass3MW.A0Z(r1)
            r0 = 1
            r1.A0J(r2, r0)
            return
        L_0x04e9:
            java.lang.Object r0 = r3.A02
            android.content.Context r0 = (android.content.Context) r0
            java.lang.Object r3 = r3.A03
            X.1VE r3 = (X.AnonymousClass1VE) r3
            int r2 = X.C40811vJ.A00(r0)
            if (r2 <= 0) goto L_0x001d
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass3MZ.A08(r3)
            java.lang.String r0 = "end_call_tone_duration_ms"
            X.C17880vN.A1C(r1, r0, r2)
            java.lang.String r2 = "2.24.24.78"
            android.content.SharedPreferences$Editor r23 = X.AnonymousClass3MZ.A08(r3)
            java.lang.String r21 = "end_call_tone_duration_last_cached_app_version"
        L_0x0508:
            r1 = r23
            r0 = r21
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)
        L_0x0510:
            r0.apply()
            return
        L_0x0514:
            java.lang.Object r1 = r3.A02
            com.whatsapp.biz.catalog.manager.CatalogManager r1 = (com.whatsapp.biz.catalog.manager.CatalogManager) r1
            java.lang.Object r4 = r3.A03
            X.9tO r4 = (X.C195469tO) r4
            int r3 = r3.A00
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.List r0 = r1.A08
            java.util.Iterator r2 = X.AnonymousClass8BV.A0y(r0)
        L_0x0528:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r2.next()
            X.BAK r1 = (X.BAK) r1
            java.lang.String r0 = r4.A04
            r1.BuO(r0, r3)
            goto L_0x0528
        L_0x053a:
            java.lang.Object r0 = r3.A02
            X.8gV r0 = (X.C167518gV) r0
            int r6 = r3.A00
            java.lang.Object r3 = r3.A03
            android.os.BaseBundle r3 = (android.os.BaseBundle) r3
            com.whatsapp.backup.google.RestoreFromBackupActivity r8 = r0.A01
            X.C17960vV.A02()
            r0 = 10
            if (r6 == r0) goto L_0x055d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/display-msgstore-download-error/"
            r1.append(r0)
            java.lang.String r0 = X.C41361wE.A03(r6)
            X.C17890vO.A1A(r1, r0)
        L_0x055d:
            r7 = 2131895332(0x7f122424, float:1.9425494E38)
            java.lang.String r4 = X.AnonymousClass8BR.A0z(r8)
            X.C17960vV.A07(r4)
            r10 = 2
            r9 = 1
            r5 = 0
            switch(r6) {
                case 10: goto L_0x001d;
                case 11: goto L_0x05f8;
                case 12: goto L_0x0608;
                case 13: goto L_0x061a;
                case 14: goto L_0x056d;
                case 15: goto L_0x0627;
                case 16: goto L_0x0e1a;
                case 17: goto L_0x056d;
                case 18: goto L_0x056d;
                case 19: goto L_0x056d;
                case 20: goto L_0x0e1a;
                case 21: goto L_0x05f8;
                case 22: goto L_0x056d;
                case 23: goto L_0x069f;
                case 24: goto L_0x0674;
                case 25: goto L_0x056d;
                case 26: goto L_0x068c;
                case 27: goto L_0x068c;
                case 28: goto L_0x05f8;
                case 29: goto L_0x05f8;
                case 30: goto L_0x05f8;
                case 31: goto L_0x05f8;
                default: goto L_0x056d;
            }
        L_0x056d:
            r1 = 2131890722(0x7f121222, float:1.9416144E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = X.AnonymousClass8BV.A0q(r8, r0, r7, r5, r1)
            r0 = 44
            X.78J r2 = new X.78J
            r2.<init>(r8, r0)
        L_0x057d:
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A19(r8)
            if (r0 != 0) goto L_0x0e04
            android.widget.ProgressBar r0 = r8.A01
            X.C17960vV.A05(r0)
            r0.setIndeterminate(r5)
            android.widget.TextView r1 = r8.A03
            X.C17960vV.A05(r1)
            r0 = 2131886439(0x7f120167, float:1.9407457E38)
            r1.setText(r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r1 = r8.A0E
            if (r1 != 0) goto L_0x05a5
            r0 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r1 = X.C110885hR.A0A(r8, r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r1 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r1
            r8.A0E = r1
        L_0x05a5:
            r0 = 4
            r1.A01 = r0
            X.5er r0 = r1.A02
            if (r0 == 0) goto L_0x05af
            r0.cancel()
        L_0x05af:
            r0 = 2131431163(0x7f0b0efb, float:1.8484047E38)
            android.view.View r0 = X.C110885hR.A0A(r8, r0)
            r1 = 8
            if (r3 == 0) goto L_0x05f4
            r0.setVisibility(r5)
            r0 = 2131431162(0x7f0b0efa, float:1.8484045E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0I(r8, r0)
            r0.setText(r3)
        L_0x05c7:
            r0 = 2131431098(0x7f0b0eba, float:1.8483916E38)
            X.AnonymousClass8BS.A0z(r8, r0, r5)
            X.9uI r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0Q(r8)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0y(r8, r0)
            r0 = 2131431173(0x7f0b0f05, float:1.8484068E38)
            X.AnonymousClass8BS.A0z(r8, r0, r1)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r8.A0E
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r8.A01
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.A03
            r0.setVisibility(r1)
            r1 = 46
            X.78J r0 = new X.78J
            r0.<init>(r8, r1)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0s(r2, r0, r8, r7)
            return
        L_0x05f4:
            r0.setVisibility(r1)
            goto L_0x05c7
        L_0x05f8:
            r1 = 2131890719(0x7f12121f, float:1.9416138E38)
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.String r3 = X.AnonymousClass8BV.A0q(r8, r0, r7, r5, r1)
            X.AFV r2 = new X.AFV
            r2.<init>(r10, r4, r8)
            goto L_0x057d
        L_0x0608:
            r1 = 2131890718(0x7f12121e, float:1.9416136E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r5] = r4
            java.lang.String r3 = X.AnonymousClass8BV.A0q(r8, r0, r7, r9, r1)
            X.AFV r2 = new X.AFV
            r2.<init>(r9, r4, r8)
            goto L_0x057d
        L_0x061a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unexpected/"
            r1.append(r0)
            r1.append(r6)
            goto L_0x069c
        L_0x0627:
            r0 = -1
            java.lang.String r2 = "msgstore_bytes_to_be_downloaded"
            long r3 = r3.getLong(r2, r0)
            java.lang.String r11 = r8.getString(r7)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0664
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " message store download size: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " is invalid"
            X.C17890vO.A19(r1, r0)
            r2 = 2131890721(0x7f121221, float:1.9416142E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r11
        L_0x0659:
            java.lang.String r3 = r8.getString(r2, r1)
            X.4dX r2 = new X.4dX
            r2.<init>(r8)
            goto L_0x057d
        L_0x0664:
            r2 = 2131890720(0x7f121220, float:1.941614E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            X.0vb r0 = r8.A00
            java.lang.String r0 = X.C88584aA.A03(r0, r3)
            r1[r5] = r0
            r1[r9] = r11
            goto L_0x0659
        L_0x0674:
            r2 = 2131890724(0x7f121224, float:1.9416148E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r0 = 2131890723(0x7f121223, float:1.9416146E38)
            java.lang.String r3 = X.AnonymousClass8BV.A0q(r8, r1, r0, r5, r2)
            r0 = 45
            X.78J r2 = new X.78J
            r2.<init>(r8, r0)
            r7 = 2131897387(0x7f122c2b, float:1.9429662E38)
            goto L_0x057d
        L_0x068c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error/unhandled-error/"
            r1.append(r0)
            java.lang.String r0 = X.C41361wE.A03(r6)
            r1.append(r0)
        L_0x069c:
            X.C17890vO.A0w(r1)
        L_0x069f:
            r3 = 0
            r2 = r3
            goto L_0x057d
        L_0x06a3:
            java.lang.Object r1 = r3.A02
            X.2sn r1 = (X.C63272sn) r1
            java.lang.Object r4 = r3.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r6 = r3.A00
            r0 = 56
            if (r6 == r0) goto L_0x06bd
            r0 = 68
            if (r6 == r0) goto L_0x06bd
            r0 = 93
            if (r6 == r0) goto L_0x06bd
            r0 = 67
            if (r6 != r0) goto L_0x001d
        L_0x06bd:
            X.1WM r5 = r1.A01
            java.util.HashSet r3 = X.C17880vN.A12()
            r0 = 56
            if (r6 != r0) goto L_0x07e0
            X.8BG r0 = X.C63892tr.A01(r4)
            if (r0 == 0) goto L_0x07fe
            X.8BG r0 = X.C63892tr.A01(r4)
            java.util.Collection r13 = r0.BMv()
        L_0x06d5:
            java.util.HashSet r2 = X.C17880vN.A12()
            java.util.Iterator r7 = r13.iterator()
        L_0x06dd:
            boolean r0 = r7.hasNext()
            r9 = 17
            if (r0 == 0) goto L_0x06fd
            X.206 r1 = X.C17880vN.A0Y(r7)
            X.11S r0 = r5.A00
            boolean r0 = X.AnonymousClass25A.A0P(r0, r1)
            if (r0 != 0) goto L_0x06dd
            int r0 = r1.A0D()
            if (r0 == r9) goto L_0x06dd
            long r0 = r1.A0x
            X.C17880vN.A1R(r2, r0)
            goto L_0x06dd
        L_0x06fd:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x07bd
            r8 = 0
            java.util.ArrayList r7 = X.C29351c6.A0D(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x070c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x071e
            long r0 = X.C17890vO.A07(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.add(r0)
            goto L_0x070c
        L_0x071e:
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.Object[] r2 = r7.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r0 = 975(0x3cf, float:1.366E-42)
            X.23b r1 = new X.23b
            r1.<init>(r2, r0)
            java.util.HashSet r8 = X.C17880vN.A12()
            X.1Cd r0 = r5.A09
            X.1at r12 = r0.get()
            java.util.Iterator r11 = r1.iterator()     // Catch:{ all -> 0x0e2d }
        L_0x073b:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0e2d }
            if (r0 == 0) goto L_0x079c
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x0e2d }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x0e2d }
            int r10 = r7.length     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = X.C63702tY.A01     // Catch:{ all -> 0x0e2d }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "SELECT _id FROM message_add_on WHERE "
            r2.append(r0)     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "status = "
            r2.append(r0)     // Catch:{ all -> 0x0e2d }
            r2.append(r9)     // Catch:{ all -> 0x0e2d }
            java.lang.String r1 = " AND "
            r2.append(r1)     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "from_me = 0"
            r2.append(r0)     // Catch:{ all -> 0x0e2d }
            r2.append(r1)     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "_id IN "
            r2.append(r0)     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r10)     // Catch:{ all -> 0x0e2d }
            r2.append(r0)     // Catch:{ all -> 0x0e2d }
            r2.append(r1)     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "(message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0)"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ all -> 0x0e2d }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0e2d }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "MessageAddOnStore/ensureMessageAddOnStatusesUpToDate"
            android.database.Cursor r2 = r1.A0A(r2, r0, r7)     // Catch:{ all -> 0x0e2d }
            java.lang.String r0 = "_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0e21 }
        L_0x078e:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0e21 }
            if (r0 == 0) goto L_0x0798
            X.C17900vP.A0K(r2, r8, r1)     // Catch:{ all -> 0x0e21 }
            goto L_0x078e
        L_0x0798:
            r2.close()     // Catch:{ all -> 0x0e2d }
            goto L_0x073b
        L_0x079c:
            r12.close()
            java.util.Iterator r7 = r13.iterator()
        L_0x07a3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x07bd
            X.206 r2 = X.C17880vN.A0Y(r7)
            long r0 = r2.A0x
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x07a3
            r2.A0a(r9)
            goto L_0x07a3
        L_0x07bd:
            java.util.Iterator r2 = r13.iterator()
        L_0x07c1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x07fe
            X.206 r1 = X.C17880vN.A0Y(r2)
            X.11S r0 = r5.A00
            boolean r0 = X.AnonymousClass25A.A0P(r0, r1)
            if (r0 != 0) goto L_0x07c1
            int r0 = r1.A0D()
            if (r0 == r9) goto L_0x07c1
            r3.add(r1)
            r1.A0a(r9)
            goto L_0x07c1
        L_0x07e0:
            r0 = 68
            if (r6 != r0) goto L_0x082a
            X.22A r2 = X.C63892tr.A02(r4)
            if (r2 == 0) goto L_0x07fe
            X.205 r0 = r2.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x07fe
            int r1 = r2.A0D()
            r0 = 17
            if (r1 == r0) goto L_0x07fe
            r3.add(r2)
            r2.A0a(r0)
        L_0x07fe:
            long r2 = X.AnonymousClass1WM.A02(r5, r3)
            X.205 r0 = r4.A0v
            X.1BI r4 = r0.A00
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x001d
            if (r4 == 0) goto L_0x001d
            java.util.List r1 = X.C63792th.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x081d
            X.1LW r0 = r5.A04
            r0.A0L(r4, r2)
        L_0x081d:
            X.1gz r0 = r5.A0W
            if (r0 == 0) goto L_0x001d
            X.1gz r0 = r5.A0W
            X.1gx r1 = r0.A00
            r0 = 0
            r1.A0A(r4, r0)
            return
        L_0x082a:
            r0 = 67
            if (r6 != r0) goto L_0x07fe
            boolean r0 = r4 instanceof X.AnonymousClass22H
            if (r0 == 0) goto L_0x07fe
            r0 = r4
            X.22H r0 = (X.AnonymousClass22H) r0
            java.util.List r13 = r0.A17()
            if (r13 == 0) goto L_0x07fe
            goto L_0x06d5
        L_0x083d:
            java.lang.Object r4 = r3.A02
            X.1iW r4 = (X.C33251iW) r4
            int r1 = r3.A00
            java.lang.Object r5 = r3.A03
            X.206 r5 = (X.AnonymousClass206) r5
            X.1hP r3 = r4.A0m
            r2 = 2
            if (r1 == r2) goto L_0x088c
            r0 = 3
            if (r1 == r0) goto L_0x0858
            r0 = 4
            if (r1 == r0) goto L_0x088a
            r0 = 10
            r2 = 7
            if (r1 == r0) goto L_0x0858
            r2 = 0
        L_0x0858:
            X.00H r0 = r4.A1Q
            int r1 = X.C62242r5.A00(r5, r0)
            X.00H r0 = r4.A1O
            java.lang.Object r0 = r0.get()
            X.6mb r0 = (X.C132326mb) r0
            X.6tu r0 = r0.A00(r5)
            r3.A03(r0, r2, r1)
            X.0ve r2 = r4.A0c
            r1 = 9006(0x232e, float:1.262E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001d
            X.1iV r4 = r4.A0s
            boolean r0 = X.C33241iV.A03(r5)
            if (r0 == 0) goto L_0x001d
            r6 = 0
            r8 = 0
            r9 = 3
            r7 = r6
            r10 = r8
            X.C33241iV.A01(r4, r5, r6, r7, r8, r9, r10)
            return
        L_0x088a:
            r2 = 3
            goto L_0x0858
        L_0x088c:
            r2 = 1
            goto L_0x0858
        L_0x088e:
            java.lang.Object r0 = r3.A02
            X.1iW r0 = (X.C33251iW) r0
            java.lang.Object r4 = r3.A03
            java.io.File r4 = (java.io.File) r4
            int r3 = r3.A00
            X.1Ns r2 = r0.A05     // Catch:{ IOException -> 0x0e38 }
            r1 = 0
            X.17r r0 = r2.A00     // Catch:{ IOException -> 0x0e38 }
            boolean r0 = r0.A0m(r4)     // Catch:{ IOException -> 0x0e38 }
            if (r0 == 0) goto L_0x001d
            X.C25311Ns.A01(r2, r4, r3, r1)     // Catch:{ IOException -> 0x0e38 }
            goto L_0x0e37
        L_0x08a8:
            java.lang.Object r6 = r3.A02
            X.A74 r6 = (X.A74) r6
            java.lang.Object r2 = r3.A03
            X.1BI r2 = (X.AnonymousClass1BI) r2
            int r1 = r3.A00
            X.1R3 r0 = r6.A00
            java.util.ArrayList r0 = r0.A07(r2, r1)
            java.util.Iterator r5 = r0.iterator()
        L_0x08bc:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x001d
            X.206 r4 = X.C17880vN.A0Y(r5)
            if (r4 == 0) goto L_0x001d
            X.8qr r3 = new X.8qr
            r3.<init>()
            X.205 r0 = r4.A0v
            java.lang.String r0 = r0.A01
            r3.A02 = r0
            java.lang.String r0 = X.A74.A00(r4)
            r3.A01 = r0
            int r2 = r4.A0u
            int r1 = r4.A09
            boolean r0 = X.AnonymousClass25A.A0t(r4)
            int r0 = X.C1409973w.A01(r2, r1, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.A00 = r0
            X.18K r0 = r6.A02
            r0.CC7(r3)
            goto L_0x08bc
        L_0x08f1:
            java.lang.Object r5 = r3.A02
            X.BM5 r5 = (X.BM5) r5
            androidx.recyclerview.widget.RecyclerView r2 = r5.A0I
            if (r2 == 0) goto L_0x001d
            boolean r0 = r2.A0S
            if (r0 == 0) goto L_0x001d
            java.lang.Object r1 = r3.A03
            X.CxS r1 = (X.C26309CxS) r1
            boolean r0 = r1.A04
            if (r0 != 0) goto L_0x001d
            X.1xT r0 = r1.A0C
            int r1 = r0.A05()
            r0 = -1
            if (r1 == r0) goto L_0x001d
            X.1qT r0 = r2.A0C
            if (r0 == 0) goto L_0x0918
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0e3f
        L_0x0918:
            java.util.List r4 = r5.A0K
            int r2 = r4.size()
            r1 = 0
        L_0x091f:
            if (r1 >= r2) goto L_0x001d
            java.lang.Object r0 = r4.get(r1)
            X.CxS r0 = (X.C26309CxS) r0
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0e3f
            int r1 = r1 + 1
            goto L_0x091f
        L_0x092e:
            java.lang.Object r0 = r3.A03
            X.2Ws r0 = (X.C51032Ws) r0
            int r1 = r3.A00
            X.1Zq r0 = r0.A00
            if (r0 == 0) goto L_0x001d
            r0.A01(r1)
            return
        L_0x093c:
            java.lang.Object r6 = r3.A02     // Catch:{ Exception -> 0x0f79 }
            X.9hf r6 = (X.C188589hf) r6     // Catch:{ Exception -> 0x0f79 }
            boolean r0 = r6.A01     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x001d
            X.E7V r0 = r6.A05     // Catch:{ Exception -> 0x0f79 }
            long r0 = r0.now()     // Catch:{ Exception -> 0x0f79 }
            X.9mf r2 = r6.A06     // Catch:{ Exception -> 0x0f79 }
            java.util.List r8 = r6.A0B     // Catch:{ Exception -> 0x0f79 }
            r2.A00(r8)     // Catch:{ Exception -> 0x0f79 }
            X.6zn r7 = r6.A09     // Catch:{ Exception -> 0x0f79 }
            r7.A03(r8, r0)     // Catch:{ Exception -> 0x0f79 }
            java.util.List r0 = r6.A0C     // Catch:{ Exception -> 0x0f79 }
            r18 = r0
            boolean r0 = r18.isEmpty()     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f73
            X.9cX r5 = r6.A08     // Catch:{ Exception -> 0x0f79 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0e45
        L_0x0965:
            java.lang.Object r4 = r3.A02
            com.whatsapp.biz.catalog.manager.CatalogManager r4 = (com.whatsapp.biz.catalog.manager.CatalogManager) r4
            java.lang.Object r2 = r3.A03
            int r1 = r3.A00
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.util.Map r0 = r4.A0A
            java.lang.Object r0 = r0.remove(r2)
            X.BAJ r0 = (X.BAJ) r0
            if (r0 != 0) goto L_0x097f
            java.lang.String r0 = "The response handler must not be null"
            goto L_0x0e16
        L_0x097f:
            r0.BuM(r1)
            return
        L_0x0983:
            java.lang.Object r2 = r3.A02
            X.122 r2 = (X.AnonymousClass122) r2
            java.lang.Object r1 = r3.A03
            X.206 r1 = (X.AnonymousClass206) r1
            int r0 = r3.A00
            X.AnonymousClass122.A06(r2, r1, r0)
            return
        L_0x0991:
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x099b
            java.lang.Object r0 = r3.A02
        L_0x0997:
            X.C108945cZ.A1P(r0)
            return
        L_0x099b:
            java.lang.Object r0 = r3.A03
            goto L_0x0997
        L_0x099e:
            java.lang.Object r6 = r3.A02
            X.1ju r6 = (X.C34091ju) r6
            java.lang.Object r0 = r3.A03
            java.util.Set r0 = (java.util.Set) r0
            int r5 = r3.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x09ac:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x09c4
            X.1BI r3 = X.C17880vN.A0Q(r4)
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A0Q
            X.1px r2 = r0.A1Z
            X.11P r0 = r0.A1q
            long r0 = X.AnonymousClass11P.A01(r0)
            r2.A01(r3, r0)
            goto L_0x09ac
        L_0x09c4:
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A0Q
            X.1KB r2 = r0.A0r
            r0 = 1
            r1 = 2131894563(0x7f122123, float:1.9423934E38)
            if (r5 != r0) goto L_0x09d1
            r1 = 2131894564(0x7f122124, float:1.9423936E38)
        L_0x09d1:
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x09d6:
            java.lang.Object r5 = r3.A02
            X.8G7 r5 = (X.AnonymousClass8G7) r5
            java.lang.Object r4 = r3.A03
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            int r11 = r3.A00
            X.1M9 r0 = r5.A0B
            X.1E7 r8 = r0.A0E(r4)
            if (r8 != 0) goto L_0x0a01
            r3 = 0
        L_0x09e9:
            X.1Va r2 = r5.A0D
            r1 = 0
            X.1M9 r0 = r2.A00
            X.1E7 r0 = r0.A0E(r4)
            if (r0 == 0) goto L_0x09f8
            java.lang.String r1 = r2.A01(r0)
        L_0x09f8:
            X.1Dg r2 = r5.A01
            X.9dC r0 = new X.9dC
            r0.<init>(r3, r4, r1)
            goto L_0x0bfc
        L_0x0a01:
            X.0ve r2 = r5.A0F
            r1 = 3573(0xdf5, float:5.007E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r15 = r0 ^ 1
            r0 = 3798(0xed6, float:5.322E-42)
            long r2 = X.AnonymousClass8BR.A05(r2, r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            long r12 = java.lang.Math.max(r0, r2)
            X.1Vc r6 = r5.A0C
            X.118 r0 = r5.A0E
            android.content.Context r7 = r0.A00
            r14 = 1
            java.lang.String r9 = "ProfilePictureViewModel.loadProfilePictureInBackground"
            r10 = 0
            android.graphics.Bitmap r3 = r6.A03(r7, r8, r9, r10, r11, r12, r14, r15)
            if (r3 == 0) goto L_0x09e9
            r1 = 0
            goto L_0x09f8
        L_0x0a30:
            java.lang.Object r0 = r3.A02
            X.8np r0 = (X.C169938np) r0
            java.lang.Object r4 = r3.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r2 = r3.A00
            X.00H r0 = r0.A03
            java.lang.Object r1 = r0.get()
            X.1iV r1 = (X.C33241iV) r1
            r0 = 2
            X.C33241iV.A00(r1, r4, r0, r2)
            return
        L_0x0a47:
            java.lang.Object r0 = r3.A02
            X.5yP r0 = (X.C116655yP) r0
            java.lang.Object r4 = r3.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r3 = r3.A00
            X.00H r0 = r0.A09
            java.lang.Object r2 = r0.get()
            X.9kk r2 = (X.C190319kk) r2
            java.lang.String r1 = "cta-app"
            java.lang.String r0 = java.lang.String.valueOf(r3)
            r2.A00(r4, r1, r0)
            return
        L_0x0a63:
            java.lang.Object r2 = r3.A02
            X.3uP r2 = (X.AnonymousClass3uP) r2
            int r4 = r3.A00
            java.lang.Object r3 = r3.A03
            X.206 r3 = (X.AnonymousClass206) r3
            r6 = 2
            X.5cR r1 = r2.A0k
            int r5 = r2.A02
            boolean r7 = r2.A0V
            if (r4 != r6) goto L_0x0a90
            java.lang.Runnable r4 = r2.A2Y
            r1.CNE(r2, r3, r4, r5, r6, r7)
            r0 = 1
            r2.A2h = r0
            android.view.View r1 = r2.A05
            if (r1 == 0) goto L_0x0a8c
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r0 = r2.A05
            r0.bringToFront()
            return
        L_0x0a8c:
            X.AnonymousClass3uP.A0d(r2)
            return
        L_0x0a90:
            r0 = r1
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r7
            r0.CND(r1, r2, r3, r4, r5)
            return
        L_0x0a99:
            java.lang.Object r2 = r3.A02
            X.1i1 r2 = (X.C32951i1) r2
            java.lang.Object r0 = r3.A03
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            int r1 = r3.A00
            r2.A09()
            android.content.SharedPreferences r5 = X.C32951i1.A00(r2)
            java.lang.String r4 = r0.getRawString()
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = X.C60332nq.A01()
            java.lang.String r0 = r5.getString(r4, r0)
            X.2S9 r3 = X.C60332nq.A00(r0)
            java.lang.Long r2 = r3.A0q
            long r0 = (long) r1
            java.lang.Long r0 = X.C63782tg.A04(r2, r0)
            r3.A0q = r0
            X.C32951i1.A02(r5, r3, r4)
            return
        L_0x0acb:
            java.lang.Object r0 = r3.A02
            X.1Re r0 = (X.C26191Re) r0
            java.lang.Object r1 = r3.A03
            java.util.List r1 = (java.util.List) r1
            int r3 = r3.A00
            X.1Mm r2 = r0.A00
            r0 = 0
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r0]
            java.lang.Object[] r1 = r1.toArray(r0)
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1
            com.whatsapp.jobqueue.job.SyncDevicesJob r0 = new com.whatsapp.jobqueue.job.SyncDevicesJob
            r0.<init>(r1, r3)
            r2.A01(r0)
            return
        L_0x0ae9:
            java.lang.Object r1 = r3.A02
            X.28n r1 = (X.C453328n) r1
            java.lang.Object r4 = r3.A03
            X.4V0 r4 = (X.AnonymousClass4V0) r4
            int r2 = r3.A00
            java.util.List r0 = X.C42011xT.A0I
            X.1kb r1 = r1.A03
            com.whatsapp.jid.GroupJid r0 = r4.A01
            r1.A0J(r0, r2)
            return
        L_0x0afd:
            java.lang.Object r5 = r3.A02
            X.1gf r5 = (X.C32111gf) r5
            int r4 = r3.A00
            java.lang.Object r1 = r3.A03
            X.1EC r1 = (X.AnonymousClass1EC) r1
            X.00H r0 = r5.A0B
            java.lang.Object r3 = r0.get()
            X.1ub r3 = (X.C40371ub) r3
            X.1gd r0 = r5.A03
            int r2 = r0.BVA(r1)
            X.1MZ r0 = r5.A07
            X.1MW r0 = r0.A08
            X.2tp r0 = r0.A0B(r1)
            int r0 = r0.A06()
            long r0 = (long) r0
            r3.A0A(r4, r0, r2)
            return
        L_0x0b26:
            java.lang.Object r2 = r3.A02
            X.A99 r2 = (X.A99) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A03
            java.util.List r0 = (java.util.List) r0
            r2.A0p(r1, r0)
            return
        L_0x0b34:
            java.lang.Object r0 = r3.A02
            X.Adx r0 = (X.C21067Adx) r0
            int r5 = r3.A00
            java.lang.Object r4 = r3.A03
            com.whatsapp.voipcalling.CallInfo r4 = (com.whatsapp.voipcalling.CallInfo) r4
            X.A99 r3 = r0.A0E
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r3.A1E
            if (r2 == 0) goto L_0x0b4d
            r1 = 3
            X.Aij r0 = new X.Aij
            r0.<init>(r5, r1)
            r2.execute(r0)
        L_0x0b4d:
            X.Adx r2 = r3.A0R
            X.C17960vV.A07(r2)
            X.BCr r1 = r3.A0f
            if (r1 == 0) goto L_0x0b5f
            java.lang.String r0 = r4.callId
            boolean r0 = r2.A0F(r0)
            r1.CQS(r4, r5, r0)
        L_0x0b5f:
            java.lang.String r0 = r4.callId
            boolean r6 = r2.A0F(r0)
            X.0vp r0 = r3.A3j
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0b89
            X.00H r0 = r3.A3E
            java.lang.Object r1 = r0.get()
            X.4Yd r1 = (X.C88054Yd) r1
            java.lang.String r0 = r4.callId
            boolean r2 = r2.A0G(r0)
            X.0vl r0 = r1.A00
            X.1G4 r1 = X.AnonymousClass3MW.A17(r0)
            X.4U2 r0 = new X.4U2
            r0.<init>(r5, r6, r2)
            r1.setValue(r0)
        L_0x0b89:
            X.6qE r0 = r4.self
            if (r0 == 0) goto L_0x0b99
            X.8yP r2 = r3.A2D
            boolean r1 = r0.A0I
            X.AWj r0 = new X.AWj
            r0.<init>(r5, r6, r1)
            r2.notifyAllObservers(r0)
        L_0x0b99:
            X.0zA r1 = r3.A1v
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0bbe
            java.lang.Object r2 = r1.A03()
            X.1pD r2 = (X.C37251pD) r2
            X.1TM r0 = r2.A01
            X.18O r1 = r0.A00
            X.18R r0 = X.AnonymousClass18O.A0G
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0bbe
            X.1pB r2 = r2.A02
            r1 = 2
            X.7Id r0 = new X.7Id
            r0.<init>(r1)
            X.C37231pB.A00(r0, r2)
        L_0x0bbe:
            X.A99.A0C(r3, r4)
            r0 = 0
            r3.A1k = r0
            return
        L_0x0bc5:
            java.lang.Object r4 = r3.A02
            X.B4q r4 = (X.C22362B4q) r4
            java.lang.Object r1 = r3.A03
            int r2 = r3.A00
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.ANH r4 = (X.ANH) r4
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0be3
            java.lang.Object r2 = r4.A01
            X.9yn r2 = (X.C198719yn) r2
            X.10I r1 = r2.A0C
            r0 = 24
            X.C21424Ajr.A00(r1, r2, r0)
            return
        L_0x0be3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to load promotions with errorCode="
            X.C17900vP.A0i(r0, r1, r2)
            java.lang.Object r2 = r4.A01
            X.9yn r2 = (X.C198719yn) r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0D
            r0 = 0
            r1.set(r0)
            X.1DT r2 = r2.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x0bfc:
            r2.A0E(r0)
            return
        L_0x0c00:
            java.lang.Object r2 = r3.A02
            X.1FU r2 = (X.AnonymousClass1FU) r2
            java.lang.Object r0 = r3.A03
            com.google.android.gms.auth.UserRecoverableAuthException r0 = (com.google.android.gms.auth.UserRecoverableAuthException) r0
            int r1 = r3.A00
            android.content.Intent r0 = r0.A00()
            r2.CNh(r0, r1)
            return
        L_0x0c12:
            java.lang.Object r0 = r3.A02
            X.2sn r0 = (X.C63272sn) r0
            java.lang.Object r1 = r3.A03
            X.206 r1 = (X.AnonymousClass206) r1
            r2 = 0
            r3 = 56
            boolean r4 = r0.A04(r1, r3)
            r5 = 0
            X.C63272sn.A01(r0, r1, r2, r3, r4, r5)
            return
        L_0x0c26:
            java.lang.Object r4 = r3.A02
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity r4 = (com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity) r4
            int r2 = r3.A00
            java.lang.Object r3 = r3.A03
            android.content.ContentResolver r1 = r4.getContentResolver()
            java.lang.String r0 = "com.whatsapp.accountswitching.AccountSwitchingContentProvider"
            android.content.ContentProviderClient r5 = r1.acquireUnstableContentProviderClient(r0)
            if (r5 == 0) goto L_0x0d07
            r0 = 1
            if (r2 == r0) goto L_0x0cc3
            r0 = 2
            if (r2 == r0) goto L_0x0c87
            r0 = 3
            if (r2 == r0) goto L_0x0c65
            r0 = 4
            if (r2 != r0) goto L_0x0c5e
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            java.lang.String r1 = "remove_account_lid"
            java.lang.String r0 = r0.getStringExtra(r1)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            r2.putString(r1, r0)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            java.lang.String r1 = "remove_account"
            r0 = 0
            r5.call(r1, r0, r2)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            goto L_0x0cc9
        L_0x0c5e:
            java.lang.String r0 = "AccountSwitchingActivity/one of the flags should be set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            goto L_0x0cc2
        L_0x0c65:
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            java.lang.String r7 = "switch_to_account_lid"
            java.lang.String r6 = r0.getStringExtra(r7)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            r2 = 0
            if (r6 == 0) goto L_0x0c85
            int r0 = r6.length()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            if (r0 == 0) goto L_0x0c85
            android.os.Bundle r1 = X.C17880vN.A0D()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            r1.putString(r7, r6)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
        L_0x0c7f:
            java.lang.String r0 = "abandon_add_account"
            r5.call(r0, r2, r1)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            goto L_0x0cc9
        L_0x0c85:
            r1 = r2
            goto L_0x0c7f
        L_0x0c87:
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            java.lang.String r8 = "switch_to_account_lid"
            java.lang.String r7 = r0.getStringExtra(r8)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            android.content.Intent r0 = r4.getIntent()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            java.lang.String r6 = "switch_to_account_dir_id"
            java.lang.String r1 = r0.getStringExtra(r6)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            if (r7 == 0) goto L_0x0ca3
            int r0 = r7.length()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            if (r0 != 0) goto L_0x0cab
        L_0x0ca3:
            if (r1 == 0) goto L_0x0cbc
            int r0 = r1.length()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            if (r0 == 0) goto L_0x0cbc
        L_0x0cab:
            android.os.Bundle r2 = X.C17880vN.A0D()     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            r2.putString(r8, r7)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            r2.putString(r6, r1)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            java.lang.String r1 = "switch_account"
            r0 = 0
            r5.call(r1, r0, r2)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
            goto L_0x0cc9
        L_0x0cbc:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
        L_0x0cc2:
            throw r0     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
        L_0x0cc3:
            java.lang.String r1 = "add_account"
            r0 = 0
            r5.call(r1, r0, r0)     // Catch:{ RemoteException -> 0x0cc9, IllegalStateException -> 0x0ce3, all -> 0x0cea }
        L_0x0cc9:
            r5.release()
            java.lang.String r1 = "account_switching"
            r0 = 0
            java.io.File r1 = r4.getDir(r1, r0)
            java.lang.String r0 = "checkpoint"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r0.exists()
            r0 = r0 ^ 1
            com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity.A03(r4, r0)
            return
        L_0x0ce3:
            r1 = 0
            java.lang.String r0 = "kill_process"
            r5.call(r0, r1, r1)     // Catch:{ RemoteException -> 0x0cef, all -> 0x0cea }
            goto L_0x0cef
        L_0x0cea:
            r0 = move-exception
            r5.release()
            throw r0
        L_0x0cef:
            r5.release()
            android.os.Handler r2 = r4.A00
            if (r2 != 0) goto L_0x0cfc
            java.lang.String r0 = "mainThreadHandler"
            X.C18070vi.A11(r0)
            throw r1
        L_0x0cfc:
            r1 = 41
            X.3C0 r0 = new X.3C0
            r0.<init>(r4, r3, r1)
            r2.post(r0)
            return
        L_0x0d07:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x0d0c:
            java.lang.Object r5 = r3.A02
            int r4 = r3.A00
            java.lang.Object r2 = r3.A03
            java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r0 = 15
            A00(r5, r2, r1, r4, r0)
            return
        L_0x0d1c:
            java.lang.Object r2 = r3.A02
            X.1KB r2 = (X.AnonymousClass1KB) r2
            java.lang.Object r1 = r3.A03
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r0 = r3.A00
            r2.A0G(r1, r0)
            return
        L_0x0d2a:
            java.lang.Object r4 = r3.A02
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            java.lang.Object r2 = r3.A03
            android.view.View r2 = (android.view.View) r2
            int r1 = r3.A00
            r0 = 0
            com.google.android.material.bottomsheet.BottomSheetBehavior.A07(r2, r4, r1, r0)
            return
        L_0x0d39:
            java.lang.Object r1 = r3.A03
            com.google.android.gms.vision.clearcut.DynamiteClearcutLogger r1 = (com.google.android.gms.vision.clearcut.DynamiteClearcutLogger) r1
            java.util.concurrent.ExecutorService r0 = com.google.android.gms.vision.clearcut.DynamiteClearcutLogger.zza
            com.google.android.gms.vision.clearcut.VisionClearcutLogger r2 = r1.zzc
            int r1 = r3.A00
            java.lang.Object r0 = r3.A02
            X.Bhi r0 = (X.C23478Bhi) r0
            r2.zza(r1, r0)
            return
        L_0x0d4b:
            java.lang.Object r0 = r3.A02
            androidx.work.impl.foreground.SystemForegroundService r0 = (androidx.work.impl.foreground.SystemForegroundService) r0
            android.app.NotificationManager r2 = r0.A00
            int r1 = r3.A00
            java.lang.Object r0 = r3.A03
            android.app.Notification r0 = (android.app.Notification) r0
            r2.notify(r1, r0)
            return
        L_0x0d5b:
            java.lang.Object r2 = r3.A02
            X.AHh r2 = (X.C20351AHh) r2
            java.lang.Object r1 = r3.A03
            android.content.Intent r1 = (android.content.Intent) r1
            int r0 = r3.A00
            r2.A02(r1, r0)
            return
        L_0x0d69:
            java.lang.Object r2 = r3.A02
            X.E7B r2 = (X.E7B) r2
            int r1 = r3.A00
            java.lang.Object r0 = r3.A03
            r2.C3v(r1, r0)
            return
        L_0x0d75:
            java.lang.Object r0 = r3.A02
            X.Cve r0 = (X.C26241Cve) r0
            int r2 = r3.A00
            java.lang.Object r1 = r3.A03
            X.E7B r0 = r0.A04
            r0.C3v(r2, r1)
            return
        L_0x0d83:
            java.lang.Object r8 = r3.A03
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r7 = r8.length
            int[] r6 = new int[r7]
            java.lang.Object r5 = r3.A02
            android.app.Activity r5 = (android.app.Activity) r5
            android.content.pm.PackageManager r4 = r5.getPackageManager()
            java.lang.String r2 = r5.getPackageName()
            r1 = 0
        L_0x0d97:
            if (r1 >= r7) goto L_0x0da4
            r0 = r8[r1]
            int r0 = r4.checkPermission(r0, r2)
            r6[r1] = r0
            int r1 = r1 + 1
            goto L_0x0d97
        L_0x0da4:
            X.1FK r5 = (X.AnonymousClass1FK) r5
            int r0 = r3.A00
            r5.onRequestPermissionsResult(r0, r8, r6)
            return
        L_0x0dac:
            if (r14 != 0) goto L_0x0daf
            return
        L_0x0daf:
            java.util.List r0 = r10.A01(r7)
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x0dbe
            X.0wS r0 = X.C18460wS.A00
            r10.A02(r7, r0)
        L_0x0dbe:
            java.util.List r0 = r10.A00()
            java.util.Iterator r3 = r0.iterator()
        L_0x0dc6:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0de7
            java.lang.String r2 = X.C17880vN.A0v(r3)
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0dc6
            java.lang.String r1 = "newsletter"
            X.1Du r0 = X.C29681ch.A02
            X.1ch r1 = r0.A03(r2, r1)
            X.C18070vi.A0X(r1)
            X.0wS r0 = X.C18460wS.A00
            r10.A02(r1, r0)
            goto L_0x0dc6
        L_0x0de7:
            java.lang.String r1 = "newsletter_never_nudge_to_unmute_list_key"
            java.lang.String r0 = ""
            r4.A01(r1, r0)
            r2 = 0
            java.lang.String r1 = "newsletter_last_unmute_nudge_shown_timestamp_key"
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r4.A01(r1, r0)
            return
        L_0x0dfa:
            X.00H r0 = r5.A0A
            X.1kb r0 = X.AnonymousClass3MW.A0Z(r0)
            r0.A0E(r6)
            return
        L_0x0e04:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/display-msgstore-download-error failed to display error "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " since Activity is about to finish."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x0e16:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0e1a:
            java.lang.String r0 = "Unexpected error"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0e21:
            r1 = move-exception
            if (r2 == 0) goto L_0x0e2c
            r2.close()     // Catch:{ all -> 0x0e28 }
            goto L_0x0e2c
        L_0x0e28:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0e2d }
        L_0x0e2c:
            throw r1     // Catch:{ all -> 0x0e2d }
        L_0x0e2d:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0e32 }
            throw r1
        L_0x0e32:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x0e37:
            return
        L_0x0e38:
            r1 = move-exception
            java.lang.String r0 = "UserActions/userActionSendMediaMessages/addManagedFileReferencesIfExternalShared"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0e3f:
            androidx.recyclerview.widget.RecyclerView r0 = r5.A0I
            r0.post(r3)
            return
        L_0x0e45:
            java.util.Map r9 = r5.A00     // Catch:{ all -> 0x0f70 }
            java.util.Set r1 = r9.keySet()     // Catch:{ all -> 0x0f70 }
            r0 = r18
            r0.addAll(r1)     // Catch:{ all -> 0x0f70 }
            monitor-exit(r5)     // Catch:{ Exception -> 0x0f79 }
            java.util.Iterator r17 = r18.iterator()     // Catch:{ Exception -> 0x0f79 }
        L_0x0e55:
            boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f59
            java.lang.Object r10 = r17.next()     // Catch:{ Exception -> 0x0f79 }
            X.A0d r10 = (X.C19946A0d) r10     // Catch:{ Exception -> 0x0f79 }
            monitor-enter(r5)     // Catch:{ Exception -> 0x0f79 }
            r0 = 0
            X.C18070vi.A0d(r10, r0)     // Catch:{ all -> 0x0f70 }
            java.lang.Object r4 = r9.get(r10)     // Catch:{ all -> 0x0f70 }
            X.71i r4 = (X.C1404171i) r4     // Catch:{ all -> 0x0f70 }
            if (r4 != 0) goto L_0x0e73
            X.71i r4 = X.C1404171i.A06     // Catch:{ all -> 0x0f70 }
            X.C18070vi.A0Z(r4)     // Catch:{ all -> 0x0f70 }
        L_0x0e73:
            monitor-exit(r5)     // Catch:{ Exception -> 0x0f79 }
            java.util.Iterator r16 = r8.iterator()     // Catch:{ Exception -> 0x0f79 }
        L_0x0e78:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0e55
            java.lang.Object r11 = r16.next()     // Catch:{ Exception -> 0x0f79 }
            android.graphics.Rect r11 = (android.graphics.Rect) r11     // Catch:{ Exception -> 0x0f79 }
            android.graphics.Rect r2 = r6.A03     // Catch:{ Exception -> 0x0f79 }
            android.graphics.Rect r1 = r6.A02     // Catch:{ Exception -> 0x0f79 }
            X.C18070vi.A0n(r2, r1, r11)     // Catch:{ Exception -> 0x0f79 }
            java.lang.ref.WeakReference r0 = r10.A00     // Catch:{ Exception -> 0x0f79 }
            java.lang.Object r14 = r0.get()     // Catch:{ Exception -> 0x0f79 }
            android.view.View r14 = (android.view.View) r14     // Catch:{ Exception -> 0x0f79 }
            if (r14 == 0) goto L_0x0e78
            android.graphics.Point r0 = X.AnonymousClass9TI.A00     // Catch:{ Exception -> 0x0f79 }
            boolean r0 = r14.isShown()     // Catch:{ Exception -> 0x0f79 }
            if (r0 != 0) goto L_0x0ea4
            r2.setEmpty()     // Catch:{ Exception -> 0x0f79 }
            r1.setEmpty()     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0e78
        L_0x0ea4:
            android.graphics.Point r15 = X.AnonymousClass9TI.A00     // Catch:{ Exception -> 0x0f79 }
            boolean r0 = r14.getGlobalVisibleRect(r2, r15)     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f51
            boolean r0 = r2.intersect(r11)     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f51
            int r13 = r15.x     // Catch:{ Exception -> 0x0f79 }
            int r12 = r15.y     // Catch:{ Exception -> 0x0f79 }
            int r0 = r14.getWidth()     // Catch:{ Exception -> 0x0f79 }
            int r11 = r13 + r0
            int r0 = r15.y     // Catch:{ Exception -> 0x0f79 }
            int r0 = X.AnonymousClass3MW.A02(r14, r0)     // Catch:{ Exception -> 0x0f79 }
            r1.set(r13, r12, r11, r0)     // Catch:{ Exception -> 0x0f79 }
            X.71i r11 = X.C1404171i.A06     // Catch:{ Exception -> 0x0f79 }
            if (r4 == r11) goto L_0x0e78
            java.util.Map r13 = r7.A04     // Catch:{ Exception -> 0x0f79 }
            java.lang.String r14 = r4.A00     // Catch:{ Exception -> 0x0f79 }
            java.lang.Object r12 = r13.get(r14)     // Catch:{ Exception -> 0x0f79 }
            X.6fh r12 = (X.C128256fh) r12     // Catch:{ Exception -> 0x0f79 }
            X.6wH r15 = r7.A02     // Catch:{ Exception -> 0x0f79 }
            java.util.Set r0 = r15.A01     // Catch:{ Exception -> 0x0f79 }
            boolean r0 = r0.add(r4)     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0ef1
            java.util.Map r0 = r15.A00     // Catch:{ Exception -> 0x0f79 }
            r0.remove(r14)     // Catch:{ Exception -> 0x0f79 }
            if (r12 != 0) goto L_0x0eed
            X.6fh r12 = new X.6fh     // Catch:{ Exception -> 0x0f79 }
            r12.<init>()     // Catch:{ Exception -> 0x0f79 }
            r13.put(r14, r12)     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0ef1
        L_0x0eed:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x0f79 }
            r12.A00 = r0     // Catch:{ Exception -> 0x0f79 }
        L_0x0ef1:
            android.graphics.Rect r0 = r12.A01     // Catch:{ Exception -> 0x0f79 }
            r0.set(r1)     // Catch:{ Exception -> 0x0f79 }
            java.util.List r1 = r12.A02     // Catch:{ Exception -> 0x0f79 }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x0f79 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0f79 }
            r1.add(r0)     // Catch:{ Exception -> 0x0f79 }
            X.71i r1 = r4.A02     // Catch:{ Exception -> 0x0f79 }
            if (r1 == r11) goto L_0x0e78
            X.6wH r11 = r7.A01     // Catch:{ Exception -> 0x0f79 }
            java.util.Set r0 = r11.A01     // Catch:{ Exception -> 0x0f79 }
            boolean r0 = r0.add(r1)     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f17
            java.util.Map r11 = r11.A00     // Catch:{ Exception -> 0x0f79 }
            java.lang.String r0 = r1.A00     // Catch:{ Exception -> 0x0f79 }
            r11.remove(r0)     // Catch:{ Exception -> 0x0f79 }
            r0 = 1
            goto L_0x0f18
        L_0x0f17:
            r0 = 0
        L_0x0f18:
            java.lang.String r12 = r1.A00     // Catch:{ Exception -> 0x0f79 }
            java.lang.Object r11 = r13.get(r12)     // Catch:{ Exception -> 0x0f79 }
            X.6fh r11 = (X.C128256fh) r11     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f45
            if (r11 == 0) goto L_0x0f36
            java.util.List r0 = r11.A02     // Catch:{ Exception -> 0x0f79 }
            r0.clear()     // Catch:{ Exception -> 0x0f79 }
            boolean r0 = r7.A05     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f31
            boolean r0 = r1.A01     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f45
        L_0x0f31:
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ Exception -> 0x0f79 }
            r11.A00 = r0     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0f45
        L_0x0f36:
            X.6fh r11 = new X.6fh     // Catch:{ Exception -> 0x0f79 }
            r11.<init>()     // Catch:{ Exception -> 0x0f79 }
            android.graphics.Rect r1 = r11.A01     // Catch:{ Exception -> 0x0f79 }
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.set(r0, r0, r0, r0)     // Catch:{ Exception -> 0x0f79 }
            r13.put(r12, r11)     // Catch:{ Exception -> 0x0f79 }
        L_0x0f45:
            java.util.List r1 = r11.A02     // Catch:{ Exception -> 0x0f79 }
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x0f79 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0f79 }
            r1.add(r0)     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0e78
        L_0x0f51:
            r1.setEmpty()     // Catch:{ Exception -> 0x0f79 }
            r2.setEmpty()     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0e78
        L_0x0f59:
            r7.A02()     // Catch:{ Exception -> 0x0f79 }
            X.16z r0 = r6.A00     // Catch:{ Exception -> 0x0f79 }
            if (r0 == 0) goto L_0x0f63
            r0.C4M()     // Catch:{ Exception -> 0x0f79 }
        L_0x0f63:
            r18.clear()     // Catch:{ Exception -> 0x0f79 }
            android.os.Handler r4 = r6.A04     // Catch:{ Exception -> 0x0f79 }
            java.lang.Runnable r2 = r6.A0A     // Catch:{ Exception -> 0x0f79 }
            r0 = 100
            r4.postDelayed(r2, r0)     // Catch:{ Exception -> 0x0f79 }
            return
        L_0x0f70:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ Exception -> 0x0f79 }
            goto L_0x0f78
        L_0x0f73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x0f79 }
            r0.<init>()     // Catch:{ Exception -> 0x0f79 }
        L_0x0f78:
            throw r0     // Catch:{ Exception -> 0x0f79 }
        L_0x0f79:
            r5 = move-exception
            java.lang.StackTraceElement[] r1 = r5.getStackTrace()
            java.lang.Object r0 = r3.A03
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.StackTraceElement[] r4 = r0.getStackTrace()
            int r3 = r1.length
            int r2 = r4.length
            int r0 = r3 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.StackTraceElement[] r1 = (java.lang.StackTraceElement[]) r1
            r0 = 0
            java.lang.System.arraycopy(r4, r0, r1, r3, r2)
            r5.setStackTrace(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21470Akb.run():void");
    }

    public C21470Akb(C32951i1 r2, AnonymousClass1BI r3, int i, int i2) {
        this.A01 = i2;
        if (32 - i2 != 0) {
            this.A02 = r2;
            this.A03 = r3;
            this.A00 = i;
            return;
        }
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = 3;
    }

    public C21470Akb(C63272sn r2, AnonymousClass206 r3) {
        this.A01 = 17;
        this.A02 = r2;
        this.A03 = r3;
        this.A00 = 56;
    }

    public C21470Akb(Object obj, int i, int i2, Object obj2) {
        this.A01 = i2;
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i;
    }

    public C21470Akb(C188589hf r2, Exception exc) {
        this.A01 = 9;
        this.A02 = r2;
        this.A00 = 100;
        this.A03 = exc;
    }
}
