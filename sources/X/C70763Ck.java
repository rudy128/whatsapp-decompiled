package X;

import android.content.Context;

/* renamed from: X.3Ck  reason: invalid class name and case insensitive filesystem */
public class C70763Ck implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    public C70763Ck(Context context, AnonymousClass195 r3, AnonymousClass1BI r4, AnonymousClass16Q r5, AnonymousClass1LD r6, int i) {
        this.A00 = 5;
        C18070vi.A0j(context, r6);
        C18070vi.A0d(r3, 4);
        this.A03 = context;
        this.A06 = r6;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = i;
        this.A05 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0244, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:?, code lost:
        com.whatsapp.util.Log.w("RecvPreKeyMessageListener/onGetPreKeyDigest prekey digest SHA1 algorithm unknown", r1);
        r4.A00.A03();
        r4.A02.A2A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0258, code lost:
        r4.A00.A03();
        r4.A02.A2A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02d1, code lost:
        if (r5 < 100) goto L_0x02d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0390, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0395, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0396, code lost:
        if (r16 != null) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x039b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03ae, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:41:0x0102, B:90:0x0206, B:161:0x038c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r18 = this;
            r3 = r18
            int r0 = r3.A00
            switch(r0) {
                case 0: goto L_0x00ab;
                case 1: goto L_0x0322;
                case 2: goto L_0x0344;
                case 3: goto L_0x00e1;
                case 4: goto L_0x0268;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A02
            X.195 r4 = (X.AnonymousClass195) r4
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r3.A06
            X.1LD r0 = (X.AnonymousClass1LD) r0
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x004b
            java.lang.Object r4 = r3.A04
            X.16Q r4 = (X.AnonymousClass16Q) r4
            X.6cJ r0 = r4.A00
            if (r0 == 0) goto L_0x004a
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1M
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "messagenotification/popupnotification/foreground"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002c:
            java.lang.Object r3 = r3.A05
            X.1BI r3 = (X.AnonymousClass1BI) r3
            X.6cJ r0 = r4.A00
            if (r0 == 0) goto L_0x0041
            com.whatsapp.notification.PopupNotification r2 = r0.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "popupnotification/set-quick-reply-jid:"
            X.C17900vP.A0Y(r3, r0, r1)
            r2.A0o = r3
        L_0x0041:
            X.6cJ r0 = r4.A00
            if (r0 == 0) goto L_0x004a
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            r0.A48()
        L_0x004a:
            return
        L_0x004b:
            java.lang.String r0 = "messagenotification/popupnotification/background"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r0 = r3.A06
            X.1LD r0 = (X.AnonymousClass1LD) r0
            boolean r0 = r0.A01()
            r2 = 3
            if (r0 == 0) goto L_0x0062
            int r1 = r3.A01
            r0 = 2
            if (r1 == r0) goto L_0x006a
            if (r1 == r2) goto L_0x006a
        L_0x0062:
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x007a
            int r0 = r3.A01
            if (r0 == r2) goto L_0x007a
        L_0x006a:
            r1 = 1
        L_0x006b:
            java.lang.Object r4 = r3.A04
            X.16Q r4 = (X.AnonymousClass16Q) r4
            X.6cJ r0 = r4.A00
            if (r0 == 0) goto L_0x007c
            com.whatsapp.notification.PopupNotification r0 = r0.A00
            boolean r0 = r0.A1M
            if (r0 == 0) goto L_0x007c
            goto L_0x002c
        L_0x007a:
            r1 = 0
            goto L_0x006b
        L_0x007c:
            if (r1 == 0) goto L_0x004a
            java.lang.Object r5 = r3.A03
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r4 = r3.A05
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            r3 = 0
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.notification.PopupNotification"
            r2.setClassName(r1, r0)
            java.lang.String r1 = "popup_notification_extra_quick_reply_jid"
            java.lang.String r0 = X.C22971Dz.A06(r4)
            r2.putExtra(r1, r0)
            java.lang.String r0 = "popup_notification_extra_dismiss_notification"
            r2.putExtra(r0, r3)
            r0 = 268697600(0x10040000, float:2.603241E-29)
            r2.setFlags(r0)
            r5.startActivity(r2)
            return
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            int r0 = r3.A01
            if (r2 >= r0) goto L_0x004a
            java.lang.Object r0 = r3.A05
            java.util.AbstractList r0 = (java.util.AbstractList) r0
            java.lang.Object r1 = r0.get(r2)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r3.A03
            java.util.AbstractList r0 = (java.util.AbstractList) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass1Xr.A04(r1, r0)
            java.lang.Object r0 = r3.A06
            java.util.AbstractList r0 = (java.util.AbstractList) r0
            java.lang.Object r1 = r0.get(r2)
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r0 = r3.A04
            java.util.AbstractList r0 = (java.util.AbstractList) r0
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass1Xr.A04(r1, r0)
            int r2 = r2 + 1
            goto L_0x00ac
        L_0x00e1:
            java.lang.Object r4 = r3.A02
            X.1kN r4 = (X.C34371kN) r4
            java.lang.Object r6 = r3.A03
            byte[] r6 = (byte[]) r6
            int r0 = r3.A01
            byte r1 = (byte) r0
            java.lang.Object r10 = r3.A04
            byte[] r10 = (byte[]) r10
            java.lang.Object r5 = r3.A05
            byte[][] r5 = (byte[][]) r5
            java.lang.Object r7 = r3.A06
            byte[] r7 = (byte[]) r7
            X.1Os r0 = r4.A04
            X.3Ez r16 = r0.A07()
            r0 = 5
            r2 = 0
            if (r1 == r0) goto L_0x010e
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0395 }
            r0.A03()     // Catch:{ all -> 0x0395 }
            X.0z4 r0 = r4.A02     // Catch:{ all -> 0x0395 }
            r0.A2A(r2)     // Catch:{ all -> 0x0395 }
            goto L_0x0262
        L_0x010e:
            int r1 = X.A8G.A01(r6, r2)     // Catch:{ all -> 0x0395 }
            X.1P3 r6 = r4.A03     // Catch:{ all -> 0x0395 }
            X.1P0 r0 = r6.A06     // Catch:{ all -> 0x0395 }
            int r0 = r0.A02()     // Catch:{ all -> 0x0395 }
            if (r1 == r0) goto L_0x0128
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0395 }
            r0.A03()     // Catch:{ all -> 0x0395 }
            X.0z4 r0 = r4.A02     // Catch:{ all -> 0x0395 }
            r0.A2A(r2)     // Catch:{ all -> 0x0395 }
            goto L_0x0262
        L_0x0128:
            byte[] r9 = r6.A0f()     // Catch:{ all -> 0x0395 }
            X.2eE r8 = r6.A0J()     // Catch:{ all -> 0x0395 }
            byte[] r0 = r8.A01     // Catch:{ all -> 0x0395 }
            boolean r0 = java.util.Arrays.equals(r0, r10)     // Catch:{ all -> 0x0395 }
            if (r0 != 0) goto L_0x0144
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0395 }
            r0.A03()     // Catch:{ all -> 0x0395 }
            X.0z4 r0 = r4.A02     // Catch:{ all -> 0x0395 }
            r0.A2A(r2)     // Catch:{ all -> 0x0395 }
            goto L_0x0262
        L_0x0144:
            int r3 = r5.length     // Catch:{ all -> 0x0395 }
            int[] r11 = new int[r3]     // Catch:{ all -> 0x0395 }
            r1 = 0
        L_0x0148:
            if (r1 >= r3) goto L_0x0155
            r0 = r5[r1]     // Catch:{ all -> 0x0395 }
            int r0 = X.A8G.A00(r0)     // Catch:{ all -> 0x0395 }
            r11[r1] = r0     // Catch:{ all -> 0x0395 }
            int r1 = r1 + 1
            goto L_0x0148
        L_0x0155:
            X.1Os r0 = r6.A0H     // Catch:{ all -> 0x0395 }
            X.3Ez r15 = r0.A07()     // Catch:{ all -> 0x0395 }
            java.util.ArrayList r5 = X.C17880vN.A0z(r3)     // Catch:{ all -> 0x0389 }
            android.util.SparseArray r10 = new android.util.SparseArray     // Catch:{ all -> 0x0389 }
            r10.<init>(r3)     // Catch:{ all -> 0x0389 }
            X.1PC r0 = r6.A07     // Catch:{ all -> 0x0389 }
            java.util.ArrayList r13 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0389 }
            X.1MH r0 = r0.A01     // Catch:{ all -> 0x0389 }
            X.1at r14 = r0.get()     // Catch:{ all -> 0x0389 }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x037f }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x037f }
            java.lang.String r1 = "SELECT prekey_id, record FROM prekeys"
            java.lang.String r0 = "SignalPreKeyStore/getPreKeys"
            android.database.Cursor r12 = X.C23141Ev.A00(r6, r1, r0)     // Catch:{ all -> 0x037f }
        L_0x017d:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x0373 }
            if (r0 == 0) goto L_0x0198
            java.lang.String r0 = "prekey_id"
            int r6 = X.C17890vO.A01(r12, r0)     // Catch:{ all -> 0x0373 }
            java.lang.String r0 = "record"
            byte[] r1 = X.C17890vO.A1X(r12, r0)     // Catch:{ all -> 0x0373 }
            X.2bm r0 = new X.2bm     // Catch:{ all -> 0x0373 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0373 }
            r13.add(r0)     // Catch:{ all -> 0x0373 }
            goto L_0x017d
        L_0x0198:
            r12.close()     // Catch:{ all -> 0x037f }
            r14.close()     // Catch:{ all -> 0x0389 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0389 }
        L_0x01a2:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0389 }
            if (r0 == 0) goto L_0x01cd
            java.lang.Object r12 = r13.next()     // Catch:{ all -> 0x0389 }
            X.2bm r12 = (X.C52972bm) r12     // Catch:{ all -> 0x0389 }
            int r1 = r12.A00     // Catch:{ IOException -> 0x01ba }
            byte[] r0 = r12.A01     // Catch:{ IOException -> 0x01ba }
            X.2eE r0 = X.AnonymousClass1P3.A01(r0, r1)     // Catch:{ IOException -> 0x01ba }
            r10.put(r1, r0)     // Catch:{ IOException -> 0x01ba }
            goto L_0x01a2
        L_0x01ba:
            r6 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "SignalCoordinator/error reading prekey "
            r1.append(r0)     // Catch:{ all -> 0x0389 }
            int r0 = r12.A00     // Catch:{ all -> 0x0389 }
            r1.append(r0)     // Catch:{ all -> 0x0389 }
            X.C17880vN.A1M(r1, r6)     // Catch:{ all -> 0x0389 }
            goto L_0x01a2
        L_0x01cd:
            r1 = 0
        L_0x01ce:
            if (r1 >= r3) goto L_0x01e4
            r0 = r11[r1]     // Catch:{ all -> 0x0389 }
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x0389 }
            X.2eE r0 = (X.C54492eE) r0     // Catch:{ all -> 0x0389 }
            if (r0 != 0) goto L_0x01db
            goto L_0x01e1
        L_0x01db:
            r5.add(r0)     // Catch:{ all -> 0x0389 }
            int r1 = r1 + 1
            goto L_0x01ce
        L_0x01e1:
            if (r15 == 0) goto L_0x0258
            goto L_0x0255
        L_0x01e4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = "SignalCoordinator/reporting back "
            X.C17890vO.A14(r0, r1, r5)     // Catch:{ all -> 0x0389 }
            java.lang.String r0 = " sequenced prekeys"
            X.C17890vO.A1A(r1, r0)     // Catch:{ all -> 0x0389 }
            X.2eE[] r0 = new X.C54492eE[r2]     // Catch:{ all -> 0x0389 }
            java.lang.Object[] r6 = r5.toArray(r0)     // Catch:{ all -> 0x0389 }
            X.2eE[] r6 = (X.C54492eE[]) r6     // Catch:{ all -> 0x0389 }
            if (r15 == 0) goto L_0x01ff
            r15.close()     // Catch:{ all -> 0x0395 }
        L_0x01ff:
            if (r6 == 0) goto L_0x0258
            int r5 = r6.length     // Catch:{ all -> 0x0395 }
            if (r5 != r3) goto L_0x0258
            java.lang.String r0 = "SHA1"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0244 }
            r3.update(r9)     // Catch:{ all -> 0x0395 }
            byte[] r0 = r8.A00     // Catch:{ all -> 0x0395 }
            r3.update(r0)     // Catch:{ all -> 0x0395 }
            byte[] r0 = r8.A02     // Catch:{ all -> 0x0395 }
            r3.update(r0)     // Catch:{ all -> 0x0395 }
            r1 = 0
        L_0x0218:
            if (r1 >= r5) goto L_0x0224
            r0 = r6[r1]     // Catch:{ all -> 0x0395 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x0395 }
            r3.update(r0)     // Catch:{ all -> 0x0395 }
            int r1 = r1 + 1
            goto L_0x0218
        L_0x0224:
            byte[] r0 = r3.digest()     // Catch:{ all -> 0x0395 }
            boolean r0 = java.util.Arrays.equals(r0, r7)     // Catch:{ all -> 0x0395 }
            if (r0 != 0) goto L_0x023e
            java.lang.String r0 = "RecvPreKeyMessageListener/onGetPreKeyDigest prekey digest check failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0395 }
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0395 }
            r0.A03()     // Catch:{ all -> 0x0395 }
        L_0x0238:
            X.0z4 r0 = r4.A02     // Catch:{ all -> 0x0395 }
            r0.A2A(r2)     // Catch:{ all -> 0x0395 }
            goto L_0x0262
        L_0x023e:
            java.lang.String r0 = "RecvPreKeyMessageListener/onGetPreKeyDigest prekey digest check passed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0395 }
            goto L_0x0238
        L_0x0244:
            r1 = move-exception
            java.lang.String r0 = "RecvPreKeyMessageListener/onGetPreKeyDigest prekey digest SHA1 algorithm unknown"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0395 }
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0395 }
            r0.A03()     // Catch:{ all -> 0x0395 }
            X.0z4 r0 = r4.A02     // Catch:{ all -> 0x0395 }
            r0.A2A(r2)     // Catch:{ all -> 0x0395 }
            goto L_0x0262
        L_0x0255:
            r15.close()     // Catch:{ all -> 0x0395 }
        L_0x0258:
            X.120 r0 = r4.A00     // Catch:{ all -> 0x0395 }
            r0.A03()     // Catch:{ all -> 0x0395 }
            X.0z4 r0 = r4.A02     // Catch:{ all -> 0x0395 }
            r0.A2A(r2)     // Catch:{ all -> 0x0395 }
        L_0x0262:
            if (r16 == 0) goto L_0x004a
            r16.close()
            return
        L_0x0268:
            java.lang.Object r11 = r3.A02
            X.AW1 r11 = (X.AW1) r11
            java.lang.Object r7 = r3.A03
            X.1ch r7 = (X.C29681ch) r7
            java.lang.Object r4 = r3.A04
            X.1ci r4 = (X.C29691ci) r4
            java.lang.Object r12 = r3.A05
            java.lang.Long r12 = (java.lang.Long) r12
            int r13 = r3.A01
            java.lang.Object r8 = r3.A06
            X.B8R r8 = (X.B8R) r8
            X.00H r0 = r11.A0C
            java.lang.Object r2 = r0.get()
            X.1NJ r2 = (X.AnonymousClass1NJ) r2
            java.lang.String[] r5 = X.C17880vN.A1Y()
            X.1LW r0 = r2.A00
            long r0 = r0.A09(r7)
            X.C17890vO.A1J(r5, r0)
            X.1Cd r0 = r2.A02
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03a8 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x03a8 }
            java.lang.String r1 = "   SELECT sort_id FROM available_message_view WHERE chat_row_id = ? AND (message_type != '7') AND (message_type != '8') ORDER BY sort_id ASC LIMIT 1"
            java.lang.String r0 = "GET_FIRST_SORT_REF_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x03a8 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x039c }
            if (r0 == 0) goto L_0x02b7
            java.lang.String r0 = "sort_id"
            long r5 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x039c }
            r2.close()     // Catch:{ all -> 0x03a8 }
            goto L_0x02c9
        L_0x02b7:
            r2.close()     // Catch:{ all -> 0x03a8 }
            r3.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SortIdStore/ getFirstSortId can't get value for "
            X.C17900vP.A0Z(r7, r0, r1)
            r5 = -9223372036854775808
            goto L_0x02d3
        L_0x02c9:
            r3.close()
            r14 = r5
            r1 = 100
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d5
        L_0x02d3:
            r14 = 100
        L_0x02d5:
            X.2Dk r4 = (X.C46162Dk) r4
            boolean r0 = r4.A0C
            r9 = 0
            if (r0 == 0) goto L_0x02e6
            r10 = r7
            X.AW1.A01(r10, r11, r12, r13, r14)
        L_0x02e0:
            if (r8 == 0) goto L_0x004a
            r8.CFT(r9)
            return
        L_0x02e6:
            r1 = 1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x02fc
            X.00H r0 = r11.A08
            java.lang.Object r6 = X.C18070vi.A0E(r0)
            X.2rC r6 = (X.C62312rC) r6
            r13 = 0
            r11 = 50
            r10 = r9
            r6.A01(r7, r8, r9, r10, r11, r13)
            return
        L_0x02fc:
            r10 = r7
            X.AW1.A01(r10, r11, r12, r13, r14)
            if (r12 == 0) goto L_0x004a
            long r1 = r12.longValue()
            long r1 = r1 - r5
            r15 = 50
            int r0 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r0 > 0) goto L_0x02e0
            X.00H r0 = r11.A08
            java.lang.Object r10 = X.C18070vi.A0E(r0)
            X.2rC r10 = (X.C62312rC) r10
            java.lang.Long r13 = java.lang.Long.valueOf(r5)
            r17 = 0
            r11 = r7
            r12 = r8
            r14 = r9
            r10.A01(r11, r12, r13, r14, r15, r17)
            return
        L_0x0322:
            java.lang.Object r2 = r3.A05
            X.A58 r2 = (X.A58) r2
            java.lang.Object r1 = r3.A04
            android.view.View r1 = (android.view.View) r1
            X.71i r0 = X.C1404171i.A06
            r2.A03(r1, r0)
            java.lang.Object r1 = r3.A03
            java.util.Set r1 = (java.util.Set) r1
            java.lang.Object r0 = r3.A02
            r1.remove(r0)
            java.lang.Object r0 = r3.A06
            X.6wl r0 = (X.C138246wl) r0
            android.util.SparseArray r1 = r0.A01
            int r0 = r3.A01
            r1.remove(r0)
            return
        L_0x0344:
            java.lang.Object r8 = r3.A02
            X.3uP r8 = (X.AnonymousClass3uP) r8
            int r7 = r3.A01
            java.lang.Object r6 = r3.A03
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            java.lang.Object r5 = r3.A04
            X.1yg r5 = (X.C42751yg) r5
            java.lang.Object r2 = r3.A05
            X.1BI r2 = (X.AnonymousClass1BI) r2
            java.lang.Object r4 = r3.A06
            X.00H r0 = r8.A1p
            java.lang.Object r1 = r0.get()
            X.1kb r1 = (X.C34511kb) r1
            java.lang.Integer r0 = r5.A00
            java.lang.String r3 = r1.A06(r6, r2, r0, r7)
            X.1KB r2 = r8.A0S
            r1 = 9
            X.AkY r0 = new X.AkY
            r0.<init>(r8, r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x0373:
            r1 = move-exception
            if (r12 == 0) goto L_0x037e
            r12.close()     // Catch:{ all -> 0x037a }
            goto L_0x037e
        L_0x037a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x037f }
        L_0x037e:
            throw r1     // Catch:{ all -> 0x037f }
        L_0x037f:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x0384 }
            goto L_0x0388
        L_0x0384:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0389 }
        L_0x0388:
            throw r1     // Catch:{ all -> 0x0389 }
        L_0x0389:
            r1 = move-exception
            if (r15 == 0) goto L_0x0394
            r15.close()     // Catch:{ all -> 0x0390 }
            goto L_0x0394
        L_0x0390:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0395 }
        L_0x0394:
            throw r1     // Catch:{ all -> 0x0395 }
        L_0x0395:
            r1 = move-exception
            if (r16 == 0) goto L_0x03b1
            r16.close()     // Catch:{ all -> 0x03ad }
            throw r1
        L_0x039c:
            r1 = move-exception
            if (r2 == 0) goto L_0x03a7
            r2.close()     // Catch:{ all -> 0x03a3 }
            goto L_0x03a7
        L_0x03a3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03a8 }
        L_0x03a7:
            throw r1     // Catch:{ all -> 0x03a8 }
        L_0x03a8:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x03ad }
            throw r1
        L_0x03ad:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x03b1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70763Ck.run():void");
    }

    public C70763Ck(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
        this.A05 = obj2;
        this.A03 = obj3;
        this.A06 = obj4;
        this.A04 = obj5;
    }
}
