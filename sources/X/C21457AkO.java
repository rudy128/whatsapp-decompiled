package X;

import com.whatsapp.backup.encryptedbackup.EncBackupViewModel;

/* renamed from: X.AkO  reason: case insensitive filesystem */
public class C21457AkO implements Runnable {
    public final int A00;
    public final Object A01;

    public C21457AkO(EncBackupViewModel encBackupViewModel, int i) {
        this.A00 = i;
        switch (i) {
            case 11:
            case 12:
            case 13:
                this.A01 = encBackupViewModel;
                return;
            default:
                this.A01 = encBackupViewModel;
                return;
        }
    }

    public static void A00(AnonymousClass1KB r1, Object obj, int i) {
        r1.A0J(new C21457AkO(obj, i));
    }

    public static void A01(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C21457AkO(obj, i));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02ed, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0307, code lost:
        r2.notifyAllObservers(new X.AnonymousClass7KX(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x030f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0485, code lost:
        r0 = "waIntents";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x048d, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0491, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0496, code lost:
        r0.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0499, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x050d, code lost:
        r0.A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0510, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x078a, code lost:
        r1.A0E(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x078d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02e9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02ea, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            int r0 = r12.A00
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0202;
                case 2: goto L_0x0202;
                case 3: goto L_0x0228;
                case 4: goto L_0x0228;
                case 5: goto L_0x0027;
                case 6: goto L_0x023c;
                case 7: goto L_0x02ee;
                case 8: goto L_0x02fb;
                case 9: goto L_0x0310;
                case 10: goto L_0x031c;
                case 11: goto L_0x0324;
                case 12: goto L_0x03f3;
                case 13: goto L_0x0432;
                case 14: goto L_0x0092;
                case 15: goto L_0x0451;
                case 16: goto L_0x0492;
                case 17: goto L_0x0492;
                case 18: goto L_0x049a;
                case 19: goto L_0x00c7;
                case 20: goto L_0x06a8;
                case 21: goto L_0x04b3;
                case 22: goto L_0x04ec;
                case 23: goto L_0x04f9;
                case 24: goto L_0x012b;
                case 25: goto L_0x0501;
                case 26: goto L_0x0506;
                case 27: goto L_0x0511;
                case 28: goto L_0x0536;
                case 29: goto L_0x0561;
                case 30: goto L_0x04ec;
                case 31: goto L_0x05b0;
                case 32: goto L_0x0636;
                case 33: goto L_0x015d;
                case 34: goto L_0x0640;
                case 35: goto L_0x064a;
                case 36: goto L_0x0653;
                case 37: goto L_0x019d;
                case 38: goto L_0x0005;
                case 39: goto L_0x01c8;
                case 40: goto L_0x065d;
                case 41: goto L_0x01d9;
                case 42: goto L_0x06a8;
                case 43: goto L_0x0005;
                case 44: goto L_0x06b3;
                case 45: goto L_0x06c8;
                case 46: goto L_0x06d6;
                case 47: goto L_0x0728;
                case 48: goto L_0x0733;
                case 49: goto L_0x074e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            X.1Wb r0 = r2.A0L
            long r0 = r0.A0G()
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0x(r2, r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r1 = r12.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            com.whatsapp.CodeInputField r0 = r1.A02
            if (r0 == 0) goto L_0x001e
            r0.requestFocus()
        L_0x001e:
            com.whatsapp.CodeInputField r1 = r1.A02
            if (r1 == 0) goto L_0x0012
            r0 = 0
            r1.A0I(r0)
            return
        L_0x0027:
            java.lang.Object r3 = r12.A01
            X.AbC r3 = (X.C20896AbC) r3
            X.00H r4 = r3.A04
            java.lang.Object r0 = r4.get()
            X.1Ul r0 = (X.C27031Ul) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "pref_avatar_preview_cache_url"
            r2 = 0
            X.C17880vN.A1E(r1, r0, r2)
            java.lang.Object r0 = r4.get()
            X.1Ul r0 = (X.C27031Ul) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "pref_avatar_profile_photo_poses"
            X.C17880vN.A1E(r1, r0, r2)
            X.71w r0 = r3.A01
            r0.A03()
            X.6uS r0 = r3.A02
            r0.A03()
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.1Uk r0 = (X.C27021Uk) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0012
            X.195 r0 = r3.A00
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x075d
            X.00H r0 = r3.A05
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            X.9hw r2 = (X.C188759hw) r2
            java.lang.String r3 = "avatar_art_update"
            X.B1v r4 = X.C22292B1v.A00
            r5 = 7
            r6 = 1
            X.C18070vi.A0d(r3, r6)
            java.util.concurrent.atomic.AtomicBoolean r1 = r2.A0I
            r0 = 0
            r1.set(r0)
            X.10I r0 = r2.A08
            r8 = r6
            X.7QH r1 = new X.7QH
            r7 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.CGF(r1)
            return
        L_0x0092:
            java.lang.Object r6 = r12.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r6 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r6
            r1 = 60000(0xea60, double:2.9644E-319)
            X.1DT r5 = r6.A08
            java.lang.Number r0 = X.C108945cZ.A1C(r5)
            if (r0 == 0) goto L_0x0012
            long r3 = r0.longValue()
            long r3 = r3 - r1
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x076d
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r5.A0E(r0)
            X.1DT r1 = r6.A04
            java.lang.Object r0 = r1.A06()
            r1.A0E(r0)
            X.10I r3 = r6.A0K
            java.lang.Runnable r2 = r6.A0M
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.CGv(r2, r0)
            return
        L_0x00c7:
            java.lang.Object r1 = r12.A01
            X.Amr r1 = (X.C21602Amr) r1
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/taking-too-long"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9Bg r0 = r1.A00
            java.lang.ref.WeakReference r0 = r0.A07
            java.lang.Object r9 = r0.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L_0x0012
            r0 = 2131890725(0x7f121225, float:1.941615E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r8 = X.AnonymousClass3MW.A09(r0)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r10 = 0
            java.lang.Object[] r7 = r8.getSpans(r10, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x078e
            int r6 = r7.length
        L_0x00fb:
            if (r10 >= r6) goto L_0x078e
            r5 = r7[r10]
            java.lang.String r1 = "skip-looking-for-backups"
            java.lang.String r0 = r5.getURL()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = "restore>RestoreFromBackupActivity/one-time-setup/taking-too-long/allow-user-to-skip-looking-for-backups"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r4 = r8.getSpanStart(r5)
            int r3 = r8.getSpanEnd(r5)
            int r2 = r8.getSpanFlags(r5)
            r8.removeSpan(r5)
            r1 = 0
            X.8Cw r0 = new X.8Cw
            r0.<init>(r9, r1)
            r8.setSpan(r0, r4, r3, r2)
        L_0x0128:
            int r10 = r10 + 1
            goto L_0x00fb
        L_0x012b:
            java.lang.Object r1 = r12.A01
            X.1oU r1 = (X.C36801oU) r1
            X.118 r0 = r1.A0J
            android.content.Context r0 = r0.A00
            boolean r0 = X.C41361wE.A09(r0)
            if (r0 == 0) goto L_0x0012
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0P
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x07a0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0S
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x07a0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0R
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x07a0
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0Q
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x07a0
            r1.A06()
            return
        L_0x015d:
            java.lang.Object r6 = r12.A01
            X.1oa r6 = (X.C36861oa) r6
            java.util.concurrent.atomic.AtomicReference r8 = r6.A0M
            java.lang.Object r0 = r8.get()
            int r7 = X.AnonymousClass000.A0M(r0)
            X.11E r1 = r6.A0F
            r0 = 1
            int r5 = r1.A03(r0)
            r0 = 28
            r2 = 100
            java.lang.Integer r4 = X.AnonymousClass8BS.A0U()
            r1 = 2
            if (r7 != r0) goto L_0x018b
            if (r5 == r1) goto L_0x0181
            if (r5 != 0) goto L_0x0012
        L_0x0181:
            r8.set(r4)
            int r0 = r6.A00
            long r0 = (long) r0
            r6.By4(r0, r2)
            return
        L_0x018b:
            r0 = 16
            if (r7 != r0) goto L_0x0012
            if (r5 == r1) goto L_0x0193
            if (r5 != 0) goto L_0x0012
        L_0x0193:
            r8.set(r4)
            int r0 = r6.A00
            long r0 = (long) r0
            r6.BmJ(r0, r2)
            return
        L_0x019d:
            java.lang.Object r2 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            android.os.ConditionVariable r0 = r2.A0w
            r0.block()
            X.1NP r0 = X.AnonymousClass8BU.A0B(r2)
            boolean r0 = X.C20127A8m.A06(r0)
            if (r0 != 0) goto L_0x01bc
            X.1NP r0 = X.AnonymousClass8BU.A0B(r2)
            int r1 = r0.A02()
            r0 = 12
            if (r1 != r0) goto L_0x0012
        L_0x01bc:
            X.9ug r1 = r2.A0C
            r0 = 10
            r1.A05(r0)
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A14(r2, r0)
            return
        L_0x01c8:
            java.lang.Object r1 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A19(r1)
            if (r0 != 0) goto L_0x0012
            r0 = 2131431163(0x7f0b0efb, float:1.8484047E38)
            X.AnonymousClass8BV.A12(r1, r0)
            return
        L_0x01d9:
            java.lang.Object r4 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            X.118 r0 = r4.A0H
            android.content.Context r0 = r0.A00
            int r3 = X.C41371wF.A00(r0)
            r0 = 3
            X.A9Q r2 = new X.A9Q
            r2.<init>(r4, r0)
            r1 = 1
            r0 = 0
            android.app.Dialog r1 = X.C20134A8u.A01(r4, r2, r3, r0, r1)
            if (r1 == 0) goto L_0x07a4
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A19(r4)
            if (r0 != 0) goto L_0x0012
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/prompting-user-to-fix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.show()
            return
        L_0x0202:
            java.lang.Object r2 = r12.A01
            X.3i0 r2 = (X.C75663i0) r2
            X.129 r1 = r2.A00
            if (r1 == 0) goto L_0x0224
            java.lang.String r0 = "3689134054667330"
            android.net.Uri r1 = r1.A03(r0)
            X.C18070vi.A0X(r1)
            X.00H r0 = r2.A03
            if (r0 == 0) goto L_0x0485
            r0.get()
            android.content.Intent r1 = X.AnonymousClass3MY.A07(r1)
            X.1L9 r0 = r2.A01
            r0.A08(r2, r1)
            return
        L_0x0224:
            java.lang.String r0 = "faqLinkFactory"
            goto L_0x048d
        L_0x0228:
            java.lang.Object r3 = r12.A01
            X.10T r3 = (X.AnonymousClass10T) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            java.lang.String r2 = "event"
            r1 = 4
            X.7KZ r0 = new X.7KZ
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x023c:
            java.lang.Object r7 = r12.A01
            X.AbC r7 = (X.C20896AbC) r7
            X.00H r0 = r7.A05
            java.lang.Object r4 = r0.get()
            X.9hw r4 = (X.C188759hw) r4
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A0I
            r0 = 1
            r1.set(r0)
            java.util.concurrent.atomic.AtomicReference r6 = r4.A01
            java.lang.Object r3 = r6.get()
            java.lang.String r3 = (java.lang.String) r3
            r5 = 0
            if (r3 == 0) goto L_0x0268
            X.1KB r2 = r4.A02
            r1 = 16
            X.AkJ r0 = new X.AkJ
            r0.<init>(r1, r3, r4)
            r2.A0J(r0)
            r6.set(r5)
        L_0x0268:
            X.00H r0 = r4.A0H
            java.lang.Object r1 = r0.get()
            X.73Q r1 = (X.AnonymousClass73Q) r1
            r0 = 2
            java.util.ArrayList r0 = X.AnonymousClass73Q.A01(r1, r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x0279:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0293
            java.lang.Object r1 = r3.next()
            X.725 r1 = (X.AnonymousClass725) r1
            boolean r0 = r1.A0S
            if (r0 == 0) goto L_0x0279
            X.1SB r2 = r4.A07
            java.lang.String r1 = r1.A0H
            X.3LI r0 = r4.A06
            r2.A0H(r0, r1)
            goto L_0x0279
        L_0x0293:
            r4.A00 = r5
            X.71w r0 = r4.A04
            r0.A03()
            X.67t r3 = r4.A05
            X.10s r2 = r3.A07
            r1 = 15
            X.7RI r0 = new X.7RI
            r0.<init>(r3, r1)
            r2.execute(r0)
            X.00H r0 = r4.A0F
            java.lang.Object r6 = r0.get()
            X.6zr r6 = (X.C140046zr) r6
            X.C17960vV.A00()
            X.C140046zr.A00(r6)
            X.6zY r0 = r6.A05
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1au r5 = r0.A06()
            java.lang.String r4 = "is_avatar = ?"
            java.lang.String[] r3 = X.C17880vN.A1Y()     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "1"
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x02e7 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x02e7 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x02e7 }
            java.lang.String r1 = "starred_stickers"
            java.lang.String r0 = "removeStarredAvatarStickers/DELETE_STARRED_AVATAR_STICKERS"
            r2.A04(r1, r4, r0, r3)     // Catch:{ all -> 0x02e7 }
            r5.close()
            X.C140046zr.A00(r6)
            X.6uS r0 = r7.A02
            r0.A03()
            return
        L_0x02e7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x02e9 }
        L_0x02e9:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x02ee:
            java.lang.Object r0 = r12.A01
            X.9fM r0 = (X.C187159fM) r0
            X.00H r0 = r0.A04
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 34
            goto L_0x0307
        L_0x02fb:
            java.lang.Object r0 = r12.A01
            X.9fM r0 = (X.C187159fM) r0
            X.00H r0 = r0.A04
            X.10T r2 = X.C17880vN.A0V(r0)
            r1 = 30
        L_0x0307:
            X.7KX r0 = new X.7KX
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x0310:
            java.lang.Object r1 = r12.A01
            android.os.ConditionVariable r1 = (android.os.ConditionVariable) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r1.open()
            return
        L_0x031c:
            java.lang.Object r0 = r12.A01
            X.1NT r0 = (X.AnonymousClass1NT) r0
            r0.A02()
            return
        L_0x0324:
            java.lang.Object r4 = r12.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            X.1NT r0 = r4.A0F
            X.1NO r7 = r0.A02
            X.2m3 r0 = r7.A00()
            if (r0 == 0) goto L_0x03e9
            X.1DT r0 = r4.A05
            java.lang.Object r0 = X.AnonymousClass8BS.A0W(r0)
            java.lang.String r0 = (java.lang.String) r0
            byte[] r11 = r0.getBytes()
            X.2m3 r10 = r7.A00()
            X.C17960vV.A07(r10)
            X.9pc r0 = r10.A02
            byte[] r9 = r0.A00
            int r8 = r10.A00
            r6 = 512(0x200, float:7.175E-43)
            java.lang.String r5 = "PBKDF2WithHmacSHA512"
            int r3 = r11.length
            char[] r2 = new char[r3]
            r1 = 0
        L_0x0353:
            if (r1 >= r3) goto L_0x035d
            byte r0 = r11[r1]
            char r0 = (char) r0
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0353
        L_0x035d:
            javax.crypto.SecretKey r0 = X.C17970vW.A08(r5, r9, r2, r8, r6)
            byte[] r1 = r0.getEncoded()
            X.9pc r0 = r10.A01
            byte[] r0 = r0.A00
            boolean r0 = java.security.MessageDigest.isEqual(r1, r0)
            r6 = 1
            r5 = 5
            if (r0 == 0) goto L_0x03aa
            java.lang.String r0 = "encb/EncBackupViewModel/successfully verified password"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DT r0 = r4.A0A
            X.AnonymousClass3MY.A1M(r0, r6)
            X.1NP r0 = r4.A0D
            r0.A0E(r5)
            int r0 = r4.A0T()
            r2 = 3
            r1 = 4
            if (r0 == r1) goto L_0x039c
            if (r0 == r5) goto L_0x038e
            r4.A0V()
            return
        L_0x038e:
            X.1DT r0 = r4.A04
            X.AnonymousClass3MX.A1K(r0, r2)
            r4.A0Y(r1)
            X.1DT r1 = r4.A03
            r0 = 300(0x12c, float:4.2E-43)
            goto L_0x0786
        L_0x039c:
            X.1DT r0 = r4.A04
            X.AnonymousClass3MX.A1K(r0, r2)
            r4.A0Y(r1)
            X.1DT r1 = r4.A03
            r0 = 302(0x12e, float:4.23E-43)
            goto L_0x0786
        L_0x03aa:
            java.lang.String r0 = "encb/EncBackupViewModel/invalid password"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NP r3 = r4.A0D
            android.content.SharedPreferences r0 = r3.A07()
            java.lang.String r1 = "encrypted_backup_num_attempts_remaining"
            int r2 = X.AnonymousClass8BT.A01(r0, r1)
            if (r2 >= 0) goto L_0x03c7
            X.0z4 r0 = r3.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r0)
            int r2 = X.C17890vO.A00(r0, r1)
        L_0x03c7:
            int r2 = r2 - r6
            if (r2 > 0) goto L_0x03d9
            X.118 r0 = r7.A00
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)
            java.lang.String r0 = "password_data.key"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            X.C64062u9.A0Q(r0)
        L_0x03d9:
            r3.A0E(r2)
            X.1DT r0 = r4.A06
            X.AnonymousClass3MX.A1K(r0, r2)
            X.1DT r1 = r4.A04
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x078a
        L_0x03e9:
            java.lang.String r0 = "encb/EncBackupViewModel/no attempts remaining"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1DT r1 = r4.A04
            r0 = 7
            goto L_0x0786
        L_0x03f3:
            java.lang.Object r3 = r12.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r3 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r3
            X.00H r0 = r3.A0L     // Catch:{ 1oV -> 0x0403 }
            X.1OZ r2 = X.C17880vN.A0U(r0)     // Catch:{ 1oV -> 0x0403 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0E(r0)     // Catch:{ 1oV -> 0x0403 }
            goto L_0x0414
        L_0x0403:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupViewModel/Failed to connect to chatd"
            com.whatsapp.util.Log.w(r0, r1)
            r1 = 4
            java.lang.String r0 = "encb/EncBackupViewModel/failed to retrieve and save backup key due to a server error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1DT r0 = r3.A04
            X.AnonymousClass3MX.A1K(r0, r1)
        L_0x0414:
            X.1NT r2 = r3.A0F
            X.1DT r0 = r3.A05
            java.lang.Object r7 = X.AnonymousClass8BS.A0W(r0)
            java.lang.String r7 = (java.lang.String) r7
            r0 = 0
            X.AMQ r1 = new X.AMQ
            r1.<init>(r3, r0)
            X.10I r5 = r2.A07
            com.whatsapp.wamsys.JniBridge r6 = r2.A08
            X.1NU r3 = r2.A03
            X.1NV r4 = r2.A06
            X.8g3 r0 = new X.8g3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0496
        L_0x0432:
            java.lang.Object r4 = r12.A01
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r4 = (com.whatsapp.backup.encryptedbackup.EncBackupViewModel) r4
            X.1DT r3 = r4.A01
            X.1NT r0 = r4.A0F
            byte[] r0 = r0.A05()     // Catch:{ IOException -> 0x0778 }
            java.lang.String r2 = X.AnonymousClass1EG.A0G(r0)     // Catch:{ IOException -> 0x0778 }
            int r1 = r2.length()     // Catch:{ IOException -> 0x0778 }
            r0 = 64
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            X.C17960vV.A0C(r0)     // Catch:{ IOException -> 0x0778 }
            goto L_0x077f
        L_0x0451:
            java.lang.Object r4 = r12.A01
            com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment r4 = (com.whatsapp.backup.encryptedbackup.RestorePasswordInputFragment) r4
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r4.A26()
            r0 = 3
            r1.A0Z(r0)
            X.1LC r1 = r4.A01
            if (r1 == 0) goto L_0x0488
            java.lang.String r0 = "https://faq.whatsapp.com/general/chats/cant-remember-password-for-encrypted-backup"
            android.net.Uri r0 = r1.A00(r0)
            java.lang.String r3 = X.C18070vi.A0H(r0)
            X.1LU r0 = r4.A02
            if (r0 == 0) goto L_0x0485
            android.content.Context r2 = r4.A14()
            r1 = 1
            r0 = 0
            android.content.Intent r2 = X.AnonymousClass1LU.A1g(r2, r3, r0, r1, r1)
            X.1L9 r1 = r4.A00
            if (r1 == 0) goto L_0x048b
            X.1FL r0 = r4.A1D()
            r1.A08(r0, r2)
            return
        L_0x0485:
            java.lang.String r0 = "waIntents"
            goto L_0x048d
        L_0x0488:
            java.lang.String r0 = "waLinkFactory"
            goto L_0x048d
        L_0x048b:
            java.lang.String r0 = "activityUtils"
        L_0x048d:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0492:
            java.lang.Object r0 = r12.A01
            X.AMT r0 = (X.AMT) r0
        L_0x0496:
            r0.A00()
            return
        L_0x049a:
            java.lang.Object r2 = r12.A01
            X.8g4 r2 = (X.AnonymousClass8g4) r2
            X.1NT r1 = r2.A08
            java.lang.String r0 = r2.A0C
            r1.A03(r0)
            java.lang.String r0 = "encb/RegisterUserHandler/encrypted backup enabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9WV r0 = r2.A09
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A00
            r0 = 0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel.A00(r1, r0)
            return
        L_0x04b3:
            java.lang.Object r2 = r12.A01
            X.8gR r2 = (X.C167498gR) r2
            android.os.ConditionVariable r0 = r2.A0L
            r0.block()
            X.00H r0 = r2.A0H
            X.1NP r0 = X.AnonymousClass8BS.A0A(r0)
            boolean r0 = X.C20127A8m.A06(r0)
            if (r0 != 0) goto L_0x04d6
            X.00H r0 = r2.A0H
            X.1NP r0 = X.AnonymousClass8BS.A0A(r0)
            int r1 = r0.A02()
            r0 = 12
            if (r1 != r0) goto L_0x04e9
        L_0x04d6:
            X.9ug r1 = r2.A03
            r0 = 10
            r1.A05(r0)
            X.00H r0 = r2.A0H
            boolean r0 = X.AnonymousClass8BW.A1T(r0)
            if (r0 != 0) goto L_0x04e9
            X.C167498gR.A0q(r2)
            return
        L_0x04e9:
            X.1oU r0 = r2.A02
            goto L_0x050d
        L_0x04ec:
            java.lang.Object r1 = r12.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x04f9:
            java.lang.Object r0 = r12.A01
            X.1oU r0 = (X.C36801oU) r0
            r0.A0A()
            return
        L_0x0501:
            java.lang.Object r0 = r12.A01
            X.1oU r0 = (X.C36801oU) r0
            goto L_0x050d
        L_0x0506:
            java.lang.Object r0 = r12.A01
            X.1oU r0 = (X.C36801oU) r0
            r0.A0A()
        L_0x050d:
            r0.A06()
            return
        L_0x0511:
            java.lang.Object r1 = r12.A01
            X.9ug r1 = (X.C196239ug) r1
            X.1oU r0 = r1.A07
            r0.A08()
            r0.A07()
            r0.A0A()
            X.00H r0 = r1.A0C
            java.lang.Object r1 = r0.get()
            X.8yN r1 = (X.C175238yN) r1
            java.lang.String r0 = "GoogleBackupRestoreObservable/backup cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.A00 = r0
            r0 = 10
            X.C20735AWq.A00(r1, r0)
            return
        L_0x0536:
            java.lang.Object r2 = r12.A01
            X.9ug r2 = (X.C196239ug) r2
            X.1oU r0 = r2.A07
            r0.A08()
            r0.A07()
            r0.A0A()
            X.00H r0 = r2.A0C
            java.lang.Object r1 = r0.get()
            X.8yN r1 = (X.C175238yN) r1
            java.lang.String r0 = "restore>GoogleBackupRestoreObservable/notify-media-restore-cancelled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = -1
            r1.A01 = r0
            r0 = 14
            X.C20735AWq.A00(r1, r0)
            X.1NP r1 = r2.A06
            r0 = 0
            r1.A0H(r0)
            return
        L_0x0561:
            java.lang.Object r3 = r12.A01
            com.whatsapp.backup.google.GoogleBackupService r3 = (com.whatsapp.backup.google.GoogleBackupService) r3
            X.0ve r2 = r3.A0P
            X.00H r0 = X.C20134A8u.A00
            r1 = 603(0x25b, float:8.45E-43)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x05a2
            X.19K r0 = r3.A0W
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x05a2
            X.19K r0 = r3.A0W     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            X.A7W r1 = X.AnonymousClass8BR.A0D(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            java.lang.String r0 = "com.whatsapp.backup.google.google-backup-worker"
            X.5oM r0 = r1.A04(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            java.util.Iterator r2 = X.AnonymousClass8BR.A13(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
        L_0x058f:
            boolean r0 = r2.hasNext()     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            if (r0 == 0) goto L_0x05a2
            java.lang.Object r0 = r2.next()     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            X.9tt r0 = (X.C195779tt) r0     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            java.lang.Integer r1 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ InterruptedException | ExecutionException -> 0x05a2 }
            if (r1 != r0) goto L_0x058f
            return
        L_0x05a2:
            X.9ug r0 = r3.A07
            r0.A03()
            X.A84.A02()
            X.1oU r0 = r3.A06
            r0.A09()
            return
        L_0x05b0:
            java.lang.Object r0 = r12.A01
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r0 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r0
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r2 = r0.A05
            int r1 = r0.A00
            java.lang.String r0 = "gdrive-new-user-setup/next-setup-prompt-timestamp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0z4 r7 = r2.A04
            if (r1 == 0) goto L_0x0615
            java.lang.String r0 = "wa-shared-prefs/reset-gdrive-prompt-shown-count"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r7)
            java.lang.String r3 = "gdrive_setup_user_prompted_count"
            X.C17880vN.A1B(r0, r3)
        L_0x05cf:
            long r4 = java.lang.System.currentTimeMillis()
            X.00H r8 = r7.A00
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r8)
            r6 = 0
            int r1 = r0.getInt(r3, r6)
            r0 = 4
            if (r1 >= r0) goto L_0x0607
            int r0 = r1 * 30
            long r2 = (long) r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
        L_0x05e8:
            long r4 = r4 + r2
        L_0x05e9:
            r7.A1K(r4)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = X.AnonymousClass3MW.A1a()
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r8)
            long r0 = r0.getLong(r3, r1)
            X.AnonymousClass3MX.A1S(r4, r6, r0)
            java.lang.String r0 = "gdrive-new-user-setup/next-setup-prompt-timestamp/%d ms"
            X.C108955ca.A1X(r0, r5, r4)
            return
        L_0x0607:
            if (r1 != r0) goto L_0x060f
            r2 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            goto L_0x05e8
        L_0x060f:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x05e9
        L_0x0615:
            java.lang.String r0 = "wa-shared-prefs/increment-gdrive-prompt-shown-count"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r7)
            java.lang.String r3 = "gdrive_setup_user_prompted_count"
            int r0 = X.C17890vO.A00(r0, r3)
            if (r0 >= 0) goto L_0x0627
            r0 = 0
        L_0x0627:
            int r2 = r0 + 1
            X.C17900vP.A0M(r7, r3, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "wa-shared-prefs/increment-gdriveprompt-shown-count/new-count/"
            X.C17900vP.A0j(r0, r1, r2)
            goto L_0x05cf
        L_0x0636:
            java.lang.Object r1 = r12.A01
            X.1oa r1 = (X.C36861oa) r1
            X.11E r0 = r1.A0F
            r0.registerObserver(r1)
            return
        L_0x0640:
            java.lang.Object r1 = r12.A01
            X.1oa r1 = (X.C36861oa) r1
            X.11E r0 = r1.A0F
            r0.unregisterObserver(r1)
            return
        L_0x064a:
            java.lang.Object r1 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A11(r1, r0)
            return
        L_0x0653:
            java.lang.Object r0 = r12.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.1KB r0 = r0.A05
            r0.A04()
            return
        L_0x065d:
            java.lang.Object r2 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0E
            if (r0 != 0) goto L_0x0670
            r0 = 2131431178(0x7f0b0f0a, float:1.8484078E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r2.A0E = r0
        L_0x0670:
            r0 = 2131431163(0x7f0b0efb, float:1.8484047E38)
            X.AnonymousClass8BV.A12(r2, r0)
            com.whatsapp.wds.components.textlayout.WDSTextLayout r1 = X.AnonymousClass8BV.A0P(r2)
            r0 = 0
            r1.setPrimaryButtonText(r0)
            r1.setSecondaryButtonText(r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0E
            X.C17960vV.A05(r0)
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A01
            X.C17960vV.A05(r0)
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A03
            X.C17960vV.A05(r0)
            r0.setVisibility(r1)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0E
            r0.A01()
            android.widget.TextView r1 = r2.A03
            r0 = 2131895894(0x7f122656, float:1.9426634E38)
            r1.setText(r0)
            return
        L_0x06a8:
            java.lang.Object r1 = r12.A01
            X.1FU r1 = (X.AnonymousClass1FU) r1
            r0 = 2131895879(0x7f122647, float:1.9426603E38)
            r1.BhQ(r0)
            return
        L_0x06b3:
            java.lang.Object r2 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            X.122 r1 = r2.A0K
            r0 = 0
            r1.A0N(r0, r0)
            X.122 r0 = r2.A0K
            r0.A0L()
            X.122 r0 = r2.A0K
            r0.A0M()
            return
        L_0x06c8:
            java.lang.Object r0 = r12.A01
            X.1FU r0 = (X.AnonymousClass1FU) r0
            X.1KB r2 = r0.A05
            r1 = 0
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r2.A07(r1, r0)
            return
        L_0x06d6:
            java.lang.Object r2 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            X.A1C r0 = r2.A0A
            if (r0 == 0) goto L_0x0720
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0720
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1L7 r0 = r2.A04
            java.io.File r1 = r0.A03()
            X.1oU r0 = r2.A0B
            X.C20134A8u.A09(r0, r1, r3)
            X.1Wb r0 = r2.A0L
            java.util.ArrayList r0 = r0.A0K()
            r3.addAll(r0)
            java.util.Iterator r1 = r3.iterator()
        L_0x06fe:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x070c
            java.io.File r0 = X.AnonymousClass8BS.A0T(r1)
            r0.delete()
            goto L_0x06fe
        L_0x070c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "restore>RestoreFromBackupActivity/after-msgstore-verified/handle-failure/clean up downloaded files for"
            r1.append(r0)
            X.A1C r0 = r2.A0A
            java.lang.String r0 = r0.A05
            java.lang.String r0 = X.C41361wE.A08(r0)
            X.C17890vO.A1A(r1, r0)
        L_0x0720:
            X.1KB r1 = r2.A05
            r0 = 36
            A00(r1, r2, r0)
            return
        L_0x0728:
            java.lang.Object r0 = r12.A01
            com.whatsapp.backup.google.RestoreFromBackupActivity r0 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r0
            X.1oU r1 = r0.A0B
            r0 = 0
            r1.A0G(r0)
            return
        L_0x0733:
            java.lang.Object r0 = r12.A01
            X.8gV r0 = (X.C167518gV) r0
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = r0.A01
            android.widget.ProgressBar r1 = r2.A01
            r0 = 0
            r1.setIndeterminate(r0)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/msgstore download started"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "restoring_from_backup"
            r2.A0i = r0
            java.lang.String r0 = "backup_found"
            X.AnonymousClass8BT.A1A(r2, r0)
            return
        L_0x074e:
            java.lang.Object r0 = r12.A01
            X.8gV r0 = (X.C167518gV) r0
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = r0.A01
            r0 = 0
            r1.A0i = r0
            java.lang.String r0 = "unknown"
            X.AnonymousClass8BT.A1A(r1, r0)
            return
        L_0x075d:
            X.00H r0 = r3.A06
            java.lang.Object r3 = r0.get()
            X.2hr r3 = (X.C56682hr) r3
            r2 = 7
            r1 = 1
            java.lang.String r0 = "avatar_art_update"
            r3.A00(r2, r0, r1)
            return
        L_0x076d:
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r5.A0E(r0)
            X.1DT r1 = r6.A04
            r0 = 1
            goto L_0x0786
        L_0x0778:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/getAndSaveRootKey/failed to get and save root key"
            com.whatsapp.util.Log.e(r0, r1)
            r2 = 0
        L_0x077f:
            r3.A0E(r2)
            X.1DT r1 = r4.A03
            r0 = 301(0x12d, float:4.22E-43)
        L_0x0786:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x078a:
            r1.A0E(r0)
            return
        L_0x078e:
            r0 = 2131431090(0x7f0b0eb2, float:1.84839E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0I(r9, r0)
            r1.setText(r8)
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            return
        L_0x07a0:
            r1.A0A()
            return
        L_0x07a4:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/ no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21457AkO.run():void");
    }

    public C21457AkO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
