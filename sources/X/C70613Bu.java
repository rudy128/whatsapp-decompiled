package X;

/* renamed from: X.3Bu  reason: invalid class name and case insensitive filesystem */
public class C70613Bu implements Runnable {
    public final int A00;
    public final Object A01;

    public C70613Bu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r2v15, types: [X.E1k, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r10 = r3.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0304, code lost:
        r0 = "globalUI";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0306, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x030a, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0311, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0322, code lost:
        if (((X.C30191dX) r4.A07.get()).A00.A03("android.permission.WRITE_CONTACTS") != 0) goto L_0x037c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        if (r10 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:?, code lost:
        r4.A02.A0O().A01(X.C17890vO.A0C(android.provider.ContactsContract.Data.CONTENT_URI.buildUpon(), "caller_is_syncadapter", "true"), "mimetype in (?,?,?)", new java.lang.String[]{"vnd.android.cursor.item/vnd.com.whatsapp.profile", "vnd.android.cursor.item/vnd.com.whatsapp.voip.call", "vnd.android.cursor.item/vnd.com.whatsapp.video.call"});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0354, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:?, code lost:
        com.whatsapp.util.Log.e("androidcontactssync/clearallwaentrypoints/SQLiteException", r3);
        r4.A00.A0E("android-contacts-sync/clearAllWaEntryPointsFromContacts", r3.getMessage(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r10 = new org.whispersystems.curve25519.NativeVOPRFExtension();
        r3.A00 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0367, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x036c, code lost:
        if (r2.getMessage() == null) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x037b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x037c, code lost:
        com.whatsapp.util.Log.w("androidcontactssync/clearallwaentrypoints/ does not have contacts write access");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0381, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0382, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r6 = r3.A04;
        r0 = new byte[X.C17890vO.A00(X.C63732tb.A00(r6), "token_length")];
        r4 = r10.A00;
        r4.A00(r0);
        r3.A0H = r0;
        r7 = null;
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (r12 >= 256) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        r7 = new byte[X.C63732tb.A00(r6).getInt("token_length", 0)];
        r4.A00(r7);
        r7[31] = (byte) (r7[31] & 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (r10.A00(r7) != false) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (r12 < 256) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        com.whatsapp.util.Log.w("ACSToken/generateCredentialToken cannot generate valid blindingFactor");
        r6.A04(5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r0 = r10.A02(r3.A0H, r7, X.C63732tb.A00(r6).getInt("token_length", 0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007f, code lost:
        if (r0 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0081, code lost:
        com.whatsapp.util.Log.e("ACSToken/generateCredentialToken failed to blind the token");
        r6.A04(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        X.C63512tE.A02(r3, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008e, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r3.A0F = r9;
        r3.A0G = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (r9 == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        X.C63732tb.A03(r6, "next_original_token_string", android.util.Base64.encodeToString(r3.A0H, 10));
        X.C63732tb.A03(r6, "blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        X.C63732tb.A03(r6, "original_token_string", android.util.Base64.encodeToString(r3.A0H, 10));
        X.C63732tb.A03(r6, "blinding_factor_string", android.util.Base64.encodeToString(r7, 10));
        X.C63732tb.A03(r6, "shared_secret_string", (java.lang.String) null);
        X.C63732tb.A01(r6, "redeem_count", -1);
        X.C63732tb.A02(r6, "base_timestamp", 0);
        X.C63732tb.A02(r6, "time_to_live_in_seconds", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00d9, code lost:
        r3.A0B = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00e1, code lost:
        if (r3.A02.A02() == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e3, code lost:
        r3.A0D = r3.A05.A00(r3.A0G, r3.A09);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ef, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
        X.C63512tE.A01(r3, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fb, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        if (r3.A0E != false) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e4, code lost:
        r2.notifyAllObservers(new X.C20735AWq(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        r3.A0E = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        monitor-enter(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r30 = this;
            r1 = r30
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0100;
                case 1: goto L_0x011c;
                case 2: goto L_0x012a;
                case 3: goto L_0x0132;
                case 4: goto L_0x013a;
                case 5: goto L_0x0142;
                case 6: goto L_0x014c;
                case 7: goto L_0x0154;
                case 8: goto L_0x015e;
                case 9: goto L_0x0166;
                case 10: goto L_0x01b8;
                case 11: goto L_0x01c1;
                case 12: goto L_0x01ca;
                case 13: goto L_0x01d3;
                case 14: goto L_0x01dc;
                case 15: goto L_0x01ed;
                case 16: goto L_0x01fa;
                case 17: goto L_0x0202;
                case 18: goto L_0x0218;
                case 19: goto L_0x0226;
                case 20: goto L_0x0238;
                case 21: goto L_0x0266;
                case 22: goto L_0x0281;
                case 23: goto L_0x028d;
                case 24: goto L_0x02bb;
                case 25: goto L_0x02bb;
                case 26: goto L_0x02c3;
                case 27: goto L_0x02f4;
                case 28: goto L_0x030b;
                case 29: goto L_0x0386;
                case 30: goto L_0x03f5;
                case 31: goto L_0x000e;
                case 32: goto L_0x000e;
                case 33: goto L_0x0007;
                case 34: goto L_0x0007;
                case 35: goto L_0x0419;
                case 36: goto L_0x0431;
                case 37: goto L_0x054f;
                case 38: goto L_0x0557;
                case 39: goto L_0x0560;
                case 40: goto L_0x056a;
                case 41: goto L_0x058b;
                case 42: goto L_0x0611;
                case 43: goto L_0x0619;
                case 44: goto L_0x0624;
                case 45: goto L_0x062f;
                case 46: goto L_0x0637;
                case 47: goto L_0x0645;
                case 48: goto L_0x064e;
                case 49: goto L_0x051f;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r1.A01
            X.2tE r3 = (X.C63512tE) r3
            r9 = 1
        L_0x000c:
            monitor-enter(r3)
            goto L_0x0014
        L_0x000e:
            java.lang.Object r3 = r1.A01
            X.2tE r3 = (X.C63512tE) r3
            r9 = 0
            goto L_0x000c
        L_0x0014:
            boolean r0 = r3.A0E     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00fb
            r2 = 1
            r3.A0E = r2     // Catch:{ all -> 0x00fd }
            monitor-enter(r3)     // Catch:{ all -> 0x00fd }
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = r3.A00     // Catch:{ all -> 0x00f8 }
            if (r10 != 0) goto L_0x0027
            org.whispersystems.curve25519.NativeVOPRFExtension r10 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x00f8 }
            r10.<init>()     // Catch:{ all -> 0x00f8 }
            r3.A00 = r10     // Catch:{ all -> 0x00f8 }
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x00f8 }
            X.2tb r6 = r3.A04     // Catch:{ all -> 0x00fd }
            android.content.SharedPreferences r0 = X.C63732tb.A00(r6)     // Catch:{ all -> 0x00fd }
            java.lang.String r11 = "token_length"
            int r0 = X.C17890vO.A00(r0, r11)     // Catch:{ all -> 0x00fd }
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x00fd }
            X.2hG r4 = r10.A00     // Catch:{ all -> 0x00fd }
            r4.A00(r0)     // Catch:{ all -> 0x00fd }
            r3.A0H = r0     // Catch:{ all -> 0x00fd }
            r8 = 0
            r5 = 0
            r7 = r8
            r12 = 0
        L_0x0042:
            r1 = 256(0x100, float:3.59E-43)
            if (r12 >= r1) goto L_0x0065
            android.content.SharedPreferences r0 = X.C63732tb.A00(r6)     // Catch:{ all -> 0x00fd }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x00fd }
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x00fd }
            r4.A00(r7)     // Catch:{ all -> 0x00fd }
            r13 = 31
            byte r0 = r7[r13]     // Catch:{ all -> 0x00fd }
            r0 = r0 & 31
            byte r0 = (byte) r0     // Catch:{ all -> 0x00fd }
            r7[r13] = r0     // Catch:{ all -> 0x00fd }
            boolean r0 = r10.A00(r7)     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x0065
            int r12 = r12 + 1
            goto L_0x0042
        L_0x0065:
            r4 = 5
            if (r12 < r1) goto L_0x0071
            java.lang.String r0 = "ACSToken/generateCredentialToken cannot generate valid blindingFactor"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            r6.A04(r4)     // Catch:{ all -> 0x00fd }
            goto L_0x008a
        L_0x0071:
            byte[] r1 = r3.A0H     // Catch:{ all -> 0x00fd }
            android.content.SharedPreferences r0 = X.C63732tb.A00(r6)     // Catch:{ all -> 0x00fd }
            int r0 = r0.getInt(r11, r5)     // Catch:{ all -> 0x00fd }
            byte[] r0 = r10.A02(r1, r7, r0)     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x008e
            java.lang.String r0 = "ACSToken/generateCredentialToken failed to blind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00fd }
            r0 = 7
            r6.A04(r0)     // Catch:{ all -> 0x00fd }
        L_0x008a:
            X.C63512tE.A02(r3, r2)     // Catch:{ all -> 0x00fd }
            goto L_0x00fb
        L_0x008e:
            monitor-enter(r3)     // Catch:{ all -> 0x00fd }
            r3.A0F = r9     // Catch:{ all -> 0x00f5 }
            r3.A0G = r0     // Catch:{ all -> 0x00f5 }
            r2 = 10
            if (r9 == 0) goto L_0x00ac
            byte[] r0 = r3.A0H     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "next_original_token_string"
            X.C63732tb.A03(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "blinding_factor_string"
            X.C63732tb.A03(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
            goto L_0x00d9
        L_0x00ac:
            byte[] r0 = r3.A0H     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "original_token_string"
            X.C63732tb.A03(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r1 = android.util.Base64.encodeToString(r7, r2)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "blinding_factor_string"
            X.C63732tb.A03(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "shared_secret_string"
            X.C63732tb.A03(r6, r0, r8)     // Catch:{ all -> 0x00f5 }
            r1 = -1
            java.lang.String r0 = "redeem_count"
            X.C63732tb.A01(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
            r1 = 0
            java.lang.String r0 = "base_timestamp"
            X.C63732tb.A02(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "time_to_live_in_seconds"
            X.C63732tb.A02(r6, r0, r1)     // Catch:{ all -> 0x00f5 }
        L_0x00d9:
            r3.A0B = r5     // Catch:{ all -> 0x00f5 }
            X.1Hc r0 = r3.A02     // Catch:{ all -> 0x00f5 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00f1
            X.37D r2 = r3.A05     // Catch:{ all -> 0x00f5 }
            byte[] r1 = r3.A0G     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r3.A09     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = r2.A00(r1, r0)     // Catch:{ all -> 0x00f5 }
            r3.A0D = r0     // Catch:{ all -> 0x00f5 }
        L_0x00ef:
            monitor-exit(r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x00fb
        L_0x00f1:
            X.C63512tE.A01(r3, r4)     // Catch:{ all -> 0x00f5 }
            goto L_0x00ef
        L_0x00f5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f5 }
            goto L_0x00fa
        L_0x00f8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00f8 }
        L_0x00fa:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fb:
            monitor-exit(r3)
            return
        L_0x00fd:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0100:
            java.lang.Object r5 = r1.A01
            X.99j r5 = (X.C1775899j) r5
            X.8Ch r0 = r5.A04
            r4 = 1
            r0.removeMessages(r4)
            X.10I r3 = r5.A05
            boolean r2 = r5.A0F
            boolean r0 = r5.A0E
            X.99g r1 = new X.99g
            r1.<init>(r5, r2, r4, r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.CGD(r1, r0)
            return
        L_0x011c:
            java.lang.Object r0 = r1.A01
            X.99g r0 = (X.AnonymousClass99g) r0
            X.99j r0 = r0.A01
            android.app.Activity r1 = r0.A01
            r0 = 108(0x6c, float:1.51E-43)
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x012a:
            java.lang.Object r0 = r1.A01
            X.1FP r0 = (X.AnonymousClass1FP) r0
            r0.A3H()
            return
        L_0x0132:
            java.lang.Object r0 = r1.A01
            X.1FP r0 = (X.AnonymousClass1FP) r0
            r0.A3L()
            return
        L_0x013a:
            java.lang.Object r0 = r1.A01
            X.1FP r0 = (X.AnonymousClass1FP) r0
            r0.A3I()
            return
        L_0x0142:
            java.lang.Object r0 = r1.A01
            X.4SD r0 = (X.AnonymousClass4SD) r0
            android.widget.ListView r0 = r0.A01
            r0.focusableViewAvailable(r0)
            return
        L_0x014c:
            java.lang.Object r0 = r1.A01
            com.whatsapp.WaEditText r0 = (com.whatsapp.WaEditText) r0
            com.whatsapp.WaEditText.A07(r0)
            return
        L_0x0154:
            java.lang.Object r0 = r1.A01
            X.2xO r0 = (X.C65962xO) r0
            X.1Mm r0 = r0.A00
            X.C25001Mm.A00(r0)
            return
        L_0x015e:
            java.lang.Object r0 = r1.A01
            X.8dS r0 = (X.C166688dS) r0
            r0.A4b()
            return
        L_0x0166:
            java.lang.Object r14 = r1.A01
            X.1hL r14 = (X.C32531hL) r14
            X.118 r0 = r14.A0A
            android.content.Context r0 = r0.A00
            r29 = r0
            X.190 r15 = r14.A02
            X.1CJ r13 = r14.A0D
            X.1VW r12 = r14.A04
            X.1M9 r11 = r14.A05
            X.1Me r10 = r14.A06
            X.11C r9 = r14.A09
            X.1Va r8 = r14.A08
            X.00H r0 = r14.A0H
            java.lang.Object r7 = r0.get()
            X.1pj r7 = (X.C37551pj) r7
            X.0zA r6 = r14.A00
            X.17x r5 = r14.A0B
            X.1Qq r4 = r14.A0F
            X.1MZ r3 = r14.A0G
            X.1Vc r2 = r14.A07
            X.1Nf r1 = r14.A0E
            X.0zA r0 = r14.A01
            X.00H r14 = r14.A0I
            r26 = r4
            r27 = r3
            r28 = r14
            r25 = r1
            r24 = r13
            r23 = r5
            r22 = r9
            r21 = r8
            r20 = r2
            r19 = r10
            r18 = r11
            r17 = r12
            r16 = r7
            r14 = r0
            r13 = r6
            r12 = r29
            X.AnonymousClass74N.A0E(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x01b8:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            X.C17960vV.A02()
            r1 = 3
            goto L_0x01e4
        L_0x01c1:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            X.C17960vV.A02()
            r1 = 1
            goto L_0x01e4
        L_0x01ca:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            X.C17960vV.A02()
            r1 = 2
            goto L_0x01e4
        L_0x01d3:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            X.C17960vV.A02()
            r1 = 4
            goto L_0x01e4
        L_0x01dc:
            java.lang.Object r2 = r1.A01
            X.10T r2 = (X.AnonymousClass10T) r2
            X.C17960vV.A02()
            r1 = 5
        L_0x01e4:
            X.AWq r0 = new X.AWq
            r0.<init>(r1)
            r2.notifyAllObservers(r0)
            return
        L_0x01ed:
            java.lang.Object r1 = r1.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/wait/timeout"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x01fa:
            java.lang.Object r0 = r1.A01
            android.webkit.CookieManager r0 = (android.webkit.CookieManager) r0
            r0.flush()
            return
        L_0x0202:
            java.lang.Object r0 = r1.A01
            X.2Ko r0 = (X.C47942Ko) r0
            X.00H r0 = r0.A0L
            X.10T r3 = X.C17880vN.A0V(r0)
            java.lang.String r2 = "event"
            r1 = 4
            X.7KZ r0 = new X.7KZ
            r0.<init>(r2, r1)
            r3.notifyAllObservers(r0)
            return
        L_0x0218:
            java.lang.Object r1 = r1.A01
            com.whatsapp.account.delete.DeleteAccountFeedback r1 = (com.whatsapp.account.delete.DeleteAccountFeedback) r1
            boolean r0 = r1.A08
            if (r0 == 0) goto L_0x0538
            X.0Iy r0 = r1.A05
            r0.A00()
            return
        L_0x0226:
            java.lang.Object r2 = r1.A01
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 0
            java.lang.String r0 = "RemoveAccountActivity/startRemoveAccount/failure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass4Yv.A00(r2, r1)
            r0 = 2
            X.AnonymousClass4Yv.A01(r2, r0)
            return
        L_0x0238:
            java.lang.Object r2 = r1.A01
            com.whatsapp.account.remove.RemoveAccountActivity r2 = (com.whatsapp.account.remove.RemoveAccountActivity) r2
            r0 = 0
            X.AnonymousClass4Yv.A00(r2, r0)
            X.1L9 r1 = r2.A01
            X.1LU r0 = r2.A02
            if (r0 == 0) goto L_0x0261
            X.0z4 r0 = r2.A0A
            int r5 = r0.A0E()
            long r7 = android.os.SystemClock.elapsedRealtime()
            X.11O r0 = r2.A0B
            java.lang.String r4 = r0.A01()
            r3 = 0
            r6 = 14
            android.content.Intent r0 = X.AnonymousClass1LU.A1X(r2, r3, r4, r5, r6, r7)
            r1.A08(r2, r0)
            return
        L_0x0261:
            java.lang.String r0 = "waIntents"
            goto L_0x0306
        L_0x0266:
            java.lang.Object r3 = r1.A01
            com.whatsapp.account.remove.RemoveAccountActivity r3 = (com.whatsapp.account.remove.RemoveAccountActivity) r3
            X.00H r0 = r3.A07
            if (r0 == 0) goto L_0x027d
            X.11A r2 = X.C17880vN.A0d(r0)
            r1 = 20
            X.3Bu r0 = new X.3Bu
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x027d:
            java.lang.String r0 = "mainThreadHandler"
            goto L_0x0306
        L_0x0281:
            java.lang.Object r0 = r1.A01
            X.2h1 r0 = (X.C56172h1) r0
            X.1KB r0 = r0.A00
            if (r0 == 0) goto L_0x0304
            r0.A04()
            return
        L_0x028d:
            java.lang.Object r1 = r1.A01
            X.1cN r1 = (X.C29491cN) r1
            java.lang.String r0 = "AccountSwitcher/processIntentAfterAccountSwitching/forcing contact sync"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.12E r2 = r1.A08
            X.11S r0 = r2.A04
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x02a3
            X.1Rm r4 = r2.A07
            goto L_0x0311
        L_0x02a3:
            X.2R1 r0 = X.AnonymousClass2R1.A03
            X.2sh r1 = X.C63212sh.A00(r0)
            r0 = 0
            r1.A03 = r0
            r1.A02 = r0
            X.2qq r0 = X.C62132qq.A0G
            r1.A00 = r0
            X.2re r1 = r1.A02()
            r0 = 1
            X.AnonymousClass12E.A00(r2, r1, r0)
            return
        L_0x02bb:
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r0.finish()
            return
        L_0x02c3:
            java.lang.Object r0 = r1.A01
            X.2mz r0 = (X.C59852mz) r0
            X.00H r0 = r0.A06
            X.1cN r0 = X.C17880vN.A0I(r0)
            X.00H r0 = r0.A0F
            X.2u4 r2 = X.C17880vN.A0J(r0)
            r8 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AccountSwitchingDataRepo/setShownMeTabMenuItemToolTip/"
            X.C17900vP.A0n(r0, r1, r8)
            X.2mj r0 = X.C64012u4.A01(r2)
            java.util.List r5 = r0.A03
            java.util.List r6 = r0.A02
            java.lang.String r4 = r0.A01
            boolean r9 = r0.A04
            int r7 = r0.A00
            X.2mj r3 = new X.2mj
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.C64012u4.A08(r3, r2)
            return
        L_0x02f4:
            java.lang.Object r0 = r1.A01
            X.2qm r0 = (X.C62092qm) r0
            r2 = 0
            X.1KB r1 = r0.A00
            if (r1 == 0) goto L_0x0304
            r0 = 2131891797(0x7f121655, float:1.9418324E38)
            r1.A07(r2, r0)
            return
        L_0x0304:
            java.lang.String r0 = "globalUI"
        L_0x0306:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x030b:
            java.lang.Object r0 = r1.A01
            com.whatsapp.accountsync.ProfileActivity r0 = (com.whatsapp.accountsync.ProfileActivity) r0
            X.1Rm r4 = r0.A02
        L_0x0311:
            monitor-enter(r4)
            X.00H r0 = r4.A07     // Catch:{ all -> 0x0383 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0383 }
            X.1dX r0 = (X.C30191dX) r0     // Catch:{ all -> 0x0383 }
            X.17x r1 = r0.A00     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            int r0 = r1.A03(r0)     // Catch:{ all -> 0x0383 }
            if (r0 != 0) goto L_0x037c
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI     // Catch:{ all -> 0x0383 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = "caller_is_syncadapter"
            java.lang.String r0 = "true"
            android.net.Uri r6 = X.C17890vO.A0C(r2, r1, r0)     // Catch:{ all -> 0x0383 }
            X.11C r0 = r4.A02     // Catch:{ all -> 0x0383 }
            X.11B r5 = r0.A0O()     // Catch:{ all -> 0x0383 }
            java.lang.String r3 = "mimetype in (?,?,?)"
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ IllegalArgumentException -> 0x0365, SecurityException -> 0x0367, SQLiteException -> 0x0354 }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r0 = 0
            r2[r0] = r1     // Catch:{ IllegalArgumentException -> 0x0365, SecurityException -> 0x0367, SQLiteException -> 0x0354 }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r0 = 1
            r2[r0] = r1     // Catch:{ IllegalArgumentException -> 0x0365, SecurityException -> 0x0367, SQLiteException -> 0x0354 }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r0 = 2
            r2[r0] = r1     // Catch:{ IllegalArgumentException -> 0x0365, SecurityException -> 0x0367, SQLiteException -> 0x0354 }
            r5.A01(r6, r3, r2)     // Catch:{ IllegalArgumentException -> 0x0365, SecurityException -> 0x0367, SQLiteException -> 0x0354 }
            goto L_0x0365
        L_0x0354:
            r3 = move-exception
            java.lang.String r0 = "androidcontactssync/clearallwaentrypoints/SQLiteException"
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x0383 }
            X.190 r2 = r4.A00     // Catch:{ all -> 0x0383 }
            java.lang.String r1 = "android-contacts-sync/clearAllWaEntryPointsFromContacts"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x0383 }
            r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x0383 }
        L_0x0365:
            monitor-exit(r4)
            return
        L_0x0367:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x037b
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0383 }
            java.lang.String r0 = "User 0 tying to get authenticator types for "
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0383 }
            if (r0 == 0) goto L_0x037b
            goto L_0x0381
        L_0x037b:
            throw r2     // Catch:{ all -> 0x0383 }
        L_0x037c:
            java.lang.String r0 = "androidcontactssync/clearallwaentrypoints/ does not have contacts write access"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0383 }
        L_0x0381:
            monitor-exit(r4)
            return
        L_0x0383:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0386:
            java.lang.Object r9 = r1.A01
            android.content.Context r9 = (android.content.Context) r9
            java.lang.String r7 = "AccountTransferReceiver/exception during export"
            r6 = 1
            byte[] r8 = X.C20138A8z.A07(r9, r6)
            if (r8 == 0) goto L_0x03ef
            int r0 = r8.length
            if (r0 == 0) goto L_0x03ef
            java.lang.String r0 = "AccountTransferReceiver/onReceive/exporting"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.CPx r4 = X.BZ0.A00
            X.DI2 r3 = X.DI2.A01
            X.DIj r2 = new X.DIj
            r2.<init>()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            X.Chd r0 = new X.Chd
            r0.<init>(r1, r2)
            X.BZ0 r5 = new X.BZ0
            r5.<init>(r9, r3, r4, r0)
            java.lang.String r4 = "com.whatsapp"
            X.BaI r1 = new X.BaI
            r1.<init>(r4, r8)
            X.BYI r0 = new X.BYI
            r0.<init>(r1)
            com.google.android.gms.tasks.zzw r3 = X.C26126Cso.A02(r5, r0, r6)
            X.C18070vi.A0X(r3)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x03dc }
            r0 = 10
            com.google.android.gms.tasks.Tasks.await(r3, r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x03dc }
            X.BaH r1 = new X.BaH
            r1.<init>(r4, r6)
            X.BYJ r0 = new X.BYJ
            r0.<init>(r1)
            X.C26126Cso.A02(r5, r0, r6)
            java.lang.String r0 = "AccountTransferReceiver/onReceive/exported successfully"
            goto L_0x03f1
        L_0x03dc:
            r2 = move-exception
            r0 = 2
            X.BaH r1 = new X.BaH
            r1.<init>(r4, r0)
            X.BYJ r0 = new X.BYJ
            r0.<init>(r1)
            X.C26126Cso.A02(r5, r0, r6)
            com.whatsapp.util.Log.e(r7, r2)
            return
        L_0x03ef:
            java.lang.String r0 = "AccountTransferReceiver/onReceive/encrypted backup token is not present"
        L_0x03f1:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x03f5:
            java.lang.Object r3 = r1.A01
            X.2tE r3 = (X.C63512tE) r3
            long r0 = android.os.SystemClock.elapsedRealtime()
            r3.A0C = r0
            X.1Hc r0 = r3.A02
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0414
            X.37D r2 = r3.A05
            byte[] r1 = r3.A0G
            java.lang.String r0 = r3.A09
            java.lang.String r0 = r2.A00(r1, r0)
            r3.A0D = r0
            return
        L_0x0414:
            r0 = 5
            X.C63512tE.A01(r3, r0)
            return
        L_0x0419:
            java.lang.Object r2 = r1.A01
            X.9p3 r2 = (X.C192829p3) r2
            X.A8S r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r2.A08
            X.1Ug r0 = r1.A08(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0538 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0538 }
            X.1DT r0 = r2.A04     // Catch:{ Exception -> 0x0538 }
            r0.A0E(r1)     // Catch:{ Exception -> 0x0538 }
            return
        L_0x0431:
            java.lang.Object r1 = r1.A01
            X.351 r1 = (X.AnonymousClass351) r1
            X.6ot r0 = r1.A01
            r0.A00()
            X.1WF r5 = r1.A00
            X.11m r3 = r5.A03
            X.00H r0 = r5.A05
            java.lang.Object r0 = r0.get()
            X.2iI r0 = (X.C56952iI) r0
            int r2 = r0.A00()
            java.lang.String[] r7 = X.C17880vN.A1Y()
            X.11P r0 = r3.A00
            long r0 = X.AnonymousClass11P.A01(r0)
            X.C17890vO.A1J(r7, r0)
            X.1Cd r0 = r3.A03
            X.1at r9 = r0.get()
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0545 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = X.C63702tY.A01     // Catch:{ all -> 0x0545 }
            java.lang.StringBuilder r8 = X.C17890vO.A0e()     // Catch:{ all -> 0x0545 }
            java.lang.String r4 = "chat_row_id"
            java.lang.String r3 = "message_add_on"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0545 }
            r0 = 0
            r1[r0] = r4     // Catch:{ all -> 0x0545 }
            X.AnonymousClass1H2.A02(r3, r8, r1)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " FROM "
            r8.append(r0)     // Catch:{ all -> 0x0545 }
            r8.append(r3)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " JOIN "
            r8.append(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "message_add_on_pin_in_chat"
            X.C17890vO.A17(r8, r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "message_add_on._id = message_add_on_pin_in_chat.message_add_on_row_id"
            r8.append(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " "
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r8)     // Catch:{ all -> 0x0545 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " HAVING COUNT(*) > "
            java.lang.String r2 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ all -> 0x0545 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " WHERE message_add_on.message_add_on_type = 79 AND (message_add_on.expiry_timestamp > ? OR IFNULL(message_add_on.expiry_timestamp,0) = 0) AND message_add_on_pin_in_chat.pin_in_chat_state = 1"
            r1.append(r0)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = " GROUP BY chat_row_id"
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0545 }
            java.lang.String r0 = "MessageAddOnStore/getChatRowIdsWithOverLimitPins"
            android.database.Cursor r3 = r6.A0A(r1, r0, r7)     // Catch:{ all -> 0x0545 }
            int r0 = r3.getCount()     // Catch:{ all -> 0x0539 }
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)     // Catch:{ all -> 0x0539 }
        L_0x04ba:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0539 }
            if (r0 == 0) goto L_0x04c8
            int r0 = r3.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0539 }
            X.C17900vP.A0K(r3, r2, r0)     // Catch:{ all -> 0x0539 }
            goto L_0x04ba
        L_0x04c8:
            r3.close()     // Catch:{ all -> 0x0545 }
            r9.close()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0538
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MessageAddOnPinInChatManager/enforceLimitForEligibleChats/chatRowIds size:"
            r1.append(r0)
            int r0 = r2.size()
            X.C17900vP.A0o(r1, r0)
            X.1Cd r0 = r5.A02
            X.1au r4 = r0.A05()
            X.1xA r3 = r4.BD0()     // Catch:{ all -> 0x051a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0510 }
        L_0x04f2:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0506
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0510 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0510 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0510 }
            r5.A01(r3, r4, r0)     // Catch:{ all -> 0x0510 }
            goto L_0x04f2
        L_0x0506:
            r3.A00()     // Catch:{ all -> 0x0510 }
            r3.close()     // Catch:{ all -> 0x051a }
            r4.close()
            return
        L_0x0510:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0515 }
            goto L_0x0519
        L_0x0515:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x051a }
        L_0x0519:
            throw r1     // Catch:{ all -> 0x051a }
        L_0x051a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x054a }
            throw r1
        L_0x051f:
            java.lang.Object r3 = r1.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r3 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r3
            r2 = 0
            X.1KB r0 = r3.A2H()
            r0.A04()
            X.1KB r1 = r3.A2H()
            r0 = 2131897172(0x7f122b54, float:1.9429226E38)
            r1.A08(r0, r2)
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment.A00(r3)
        L_0x0538:
            return
        L_0x0539:
            r1 = move-exception
            if (r3 == 0) goto L_0x0544
            r3.close()     // Catch:{ all -> 0x0540 }
            goto L_0x0544
        L_0x0540:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0545 }
        L_0x0544:
            throw r1     // Catch:{ all -> 0x0545 }
        L_0x0545:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x054a }
            throw r1
        L_0x054a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x054f:
            java.lang.Object r0 = r1.A01
            X.2Bq r0 = (X.C45782Bq) r0
            X.C45782Bq.A02(r0)
            return
        L_0x0557:
            java.lang.Object r1 = r1.A01
            X.2Bq r1 = (X.C45782Bq) r1
            r0 = 0
            X.C45782Bq.A01(r0, r1)
            return
        L_0x0560:
            java.lang.Object r0 = r1.A01
            X.2bj r0 = (X.C52942bj) r0
            com.whatsapp.anr.SigquitBasedANRDetector r1 = r0.A01
            r0 = 0
            r1.A0D = r0
            return
        L_0x056a:
            java.lang.Object r0 = r1.A01
            X.2bj r0 = (X.C52942bj) r0
            com.whatsapp.anr.SigquitBasedANRDetector r2 = r0.A01
            java.io.File r1 = r0.A00
            java.lang.String r0 = "SigquitBasedANRDetector/abortANRAndDiscardReport"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "SigquitBasedANRDetector/abortANR"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r2.A0D = r0
            X.00H r0 = r2.A08
            java.lang.Object r0 = r0.get()
            X.A1V r0 = (X.A1V) r0
            r0.A03(r1)
            return
        L_0x058b:
            java.lang.Object r2 = r1.A01
            X.1an r2 = (X.C28721an) r2
            monitor-enter(r2)
            X.118 r7 = r2.A06     // Catch:{ all -> 0x060e }
            android.content.Context r3 = r7.A00     // Catch:{ all -> 0x060e }
            android.appwidget.AppWidgetManager r1 = android.appwidget.AppWidgetManager.getInstance(r3)     // Catch:{ all -> 0x060e }
            java.lang.Class<com.whatsapp.appwidget.WidgetProvider> r5 = com.whatsapp.appwidget.WidgetProvider.class
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ RuntimeException -> 0x05a6 }
            r0.<init>(r3, r5)     // Catch:{ RuntimeException -> 0x05a6 }
            int[] r4 = r1.getAppWidgetIds(r0)     // Catch:{ RuntimeException -> 0x05a6 }
            if (r4 == 0) goto L_0x05c3
            goto L_0x05ae
        L_0x05a6:
            r1 = move-exception
            java.lang.String r0 = "widgetprovider/getAppWidgetIds failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x060e }
            goto L_0x05c3
        L_0x05ae:
            int r0 = r4.length     // Catch:{ all -> 0x060e }
            if (r0 <= 0) goto L_0x05c3
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x060e }
            r1.<init>(r3, r5)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "android.appwidget.action.APPWIDGET_UPDATE"
            r1.setAction(r0)     // Catch:{ all -> 0x060e }
            java.lang.String r0 = "appWidgetIds"
            r1.putExtra(r0, r4)     // Catch:{ all -> 0x060e }
            r3.sendBroadcast(r1)     // Catch:{ all -> 0x060e }
        L_0x05c3:
            X.1ab r0 = r2.A09     // Catch:{ all -> 0x060e }
            X.1ac r11 = r0.A00(r3)     // Catch:{ all -> 0x060e }
            if (r11 == 0) goto L_0x060c
            X.1ac r0 = r0.A01     // Catch:{ all -> 0x060e }
            if (r11 == r0) goto L_0x060c
            java.lang.Runnable r0 = r2.A01     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x05fa
            X.11S r4 = r2.A03     // Catch:{ all -> 0x060e }
            X.1CJ r8 = r2.A07     // Catch:{ all -> 0x060e }
            X.11C r6 = r2.A05     // Catch:{ all -> 0x060e }
            X.1R3 r9 = r2.A08     // Catch:{ all -> 0x060e }
            X.1Nb r12 = r2.A0A     // Catch:{ all -> 0x060e }
            X.1Nd r5 = r2.A04     // Catch:{ all -> 0x060e }
            X.3Ao r10 = r2.A00     // Catch:{ all -> 0x060e }
            if (r10 != 0) goto L_0x05f3
            X.00c r0 = X.C17890vO.A0H(r3)     // Catch:{ all -> 0x060e }
            X.10E r0 = (X.AnonymousClass10E) r0     // Catch:{ all -> 0x060e }
            X.00S r0 = r0.A6t     // Catch:{ all -> 0x060e }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x060e }
            X.3Ao r10 = (X.C70313Ao) r10     // Catch:{ all -> 0x060e }
            r2.A00 = r10     // Catch:{ all -> 0x060e }
        L_0x05f3:
            X.3CU r3 = new X.3CU     // Catch:{ all -> 0x060e }
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x060e }
            r2.A01 = r3     // Catch:{ all -> 0x060e }
        L_0x05fa:
            android.os.Handler r1 = r2.A00()     // Catch:{ all -> 0x060e }
            java.lang.Runnable r0 = r2.A01     // Catch:{ all -> 0x060e }
            r1.removeCallbacks(r0)     // Catch:{ all -> 0x060e }
            android.os.Handler r1 = r2.A00()     // Catch:{ all -> 0x060e }
            java.lang.Runnable r0 = r2.A01     // Catch:{ all -> 0x060e }
            r1.post(r0)     // Catch:{ all -> 0x060e }
        L_0x060c:
            monitor-exit(r2)
            return
        L_0x060e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0611:
            java.lang.Object r0 = r1.A01
            X.2vL r0 = (X.C64792vL) r0
            r0.onDataSetChanged()
            return
        L_0x0619:
            java.lang.Object r2 = r1.A01
            X.3R4 r2 = (X.AnonymousClass3R4) r2
            r1 = 0
            r0 = 1
            r2.A07 = r0
            r2.A06 = r1
            return
        L_0x0624:
            java.lang.Object r1 = r1.A01
            X.3R4 r1 = (X.AnonymousClass3R4) r1
            r0 = 0
            r1.A07 = r0
            r0 = 1
            r1.A06 = r0
            return
        L_0x062f:
            java.lang.Object r0 = r1.A01
            X.3R4 r0 = (X.AnonymousClass3R4) r0
            X.AnonymousClass3R4.A00(r0)
            return
        L_0x0637:
            java.lang.Object r1 = r1.A01
            X.8Dd r1 = (X.C161418Dd) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.28v r0 = r1.A05
            X.C161418Dd.A00(r0, r1)
            return
        L_0x0645:
            java.lang.Object r1 = r1.A01
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r1 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r1
            r0 = -1
            r1.C9N(r0)
            return
        L_0x064e:
            java.lang.Object r4 = r1.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            android.content.Context r0 = r4.A14()
            X.3Rj r1 = X.AnonymousClass4a6.A00(r0)
            r0 = 2131896038(0x7f1226e6, float:1.9426926E38)
            r1.A0D(r0)
            X.05w r3 = r1.create()
            r0 = 2131896037(0x7f1226e5, float:1.9426924E38)
            java.lang.String r2 = r4.A1H(r0)
            r0 = 15
            X.4aq r1 = new X.4aq
            r1.<init>(r4, r0)
            r0 = -1
            r3.A08(r0, r2, r1)
            r0 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r2 = r4.A1H(r0)
            r0 = 0
            X.A9R r1 = new X.A9R
            r1.<init>(r0)
            r0 = -2
            r3.A08(r0, r2, r1)
            r3.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70613Bu.run():void");
    }
}
