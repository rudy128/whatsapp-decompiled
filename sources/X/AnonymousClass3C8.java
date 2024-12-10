package X;

/* renamed from: X.3C8  reason: invalid class name */
public class AnonymousClass3C8 implements Runnable {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public AnonymousClass3C8(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A04 = obj3;
        this.A01 = j;
    }

    /* JADX WARNING: type inference failed for: r3v29, types: [X.20i, X.2MG, X.206] */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x036e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x036f, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0372, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r0 = r21
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x009c;
                case 1: goto L_0x0295;
                case 2: goto L_0x02c5;
                case 3: goto L_0x02da;
                case 4: goto L_0x02f2;
                case 5: goto L_0x0373;
                case 6: goto L_0x03ab;
                case 7: goto L_0x0078;
                case 8: goto L_0x0007;
                case 9: goto L_0x0007;
                case 10: goto L_0x04d3;
                case 11: goto L_0x051c;
                case 12: goto L_0x053b;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r0.A02
            X.1j6 r5 = (X.C33611j6) r5
            java.lang.Object r3 = r0.A03
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            long r1 = r0.A01
            java.lang.Object r6 = r0.A04
            X.9r6 r6 = (X.C194059r6) r6
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            if (r3 == 0) goto L_0x0076
            com.whatsapp.jid.DeviceJid r0 = r3.getPrimaryDevice()
        L_0x001d:
            X.C17960vV.A07(r0)
            X.2nE r4 = X.C63962tz.A02(r0)
            X.8v1 r0 = X.C173408v1.A00
            java.lang.String r0 = r0.getRawString()
            X.2nC r7 = new X.2nC
            r7.<init>(r4, r0)
            X.1P3 r4 = r5.A00
            byte[] r6 = r6.A01
            X.30I r0 = new X.30I
            r0.<init>(r3, r5, r1)
            X.A4S r0 = r4.A0A(r0, r7, r6)
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0075
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "axolotl error while decrypt-group-using-fast-fatchet; status="
            X.C17900vP.A0k(r0, r1, r2)
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            if (r2 == r0) goto L_0x0065
            r0 = -1203(0xfffffffffffffb4d, float:NaN)
            if (r2 == r0) goto L_0x0065
            r0 = -1202(0xfffffffffffffb4e, float:NaN)
            if (r2 == r0) goto L_0x0065
            r0 = -1204(0xfffffffffffffb4c, float:NaN)
            if (r2 == r0) goto L_0x0065
            r0 = -1205(0xfffffffffffffb4b, float:NaN)
            if (r2 == r0) goto L_0x0065
            r0 = -1206(0xfffffffffffffb4a, float:NaN)
            if (r2 == r0) goto L_0x0065
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r2 != r0) goto L_0x0075
        L_0x0065:
            X.1Uv r2 = r5.A01
            X.1P0 r0 = r4.A06
            int r0 = r0.A02()
            byte[] r1 = X.A8G.A03(r0)
            r0 = 0
            r2.A0Y(r3, r1, r0)
        L_0x0075:
            return
        L_0x0076:
            r0 = 0
            goto L_0x001d
        L_0x0078:
            java.lang.Object r1 = r0.A02
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r1 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r1
            java.lang.Object r5 = r0.A03
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            java.lang.Object r4 = r0.A04
            java.util.Formatter r4 = (java.util.Formatter) r4
            long r2 = r0.A01
            X.C18070vi.A0j(r5, r4)
            com.whatsapp.WaTextView r1 = r1.A04
            if (r1 != 0) goto L_0x0094
            java.lang.String r0 = "durationText"
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0094:
            java.lang.String r0 = X.CDS.A00(r5, r4, r2)
            r1.setText(r0)
            return
        L_0x009c:
            java.lang.Object r10 = r0.A02
            X.2tE r10 = (X.C63512tE) r10
            java.lang.Object r9 = r0.A03
            byte[] r9 = (byte[]) r9
            java.lang.Object r12 = r0.A04
            byte[] r12 = (byte[]) r12
            X.2tb r8 = r10.A04
            android.content.SharedPreferences r0 = X.C63732tb.A00(r8)
            java.lang.String r13 = "blinding_factor_string"
            r6 = 0
            java.lang.String r0 = r0.getString(r13, r6)
            r5 = 8
            r11 = 0
            if (r0 == 0) goto L_0x0144
            byte[] r4 = android.util.Base64.decode(r0, r5)
        L_0x00be:
            r1 = 4
            r7 = 0
            if (r4 != 0) goto L_0x00ce
            java.lang.String r0 = "ACSToken/processSignedBlindedToken blinding factor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A04(r1)
        L_0x00ca:
            X.C63512tE.A02(r10, r7)
            return
        L_0x00ce:
            monitor-enter(r10)
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = r10.A00     // Catch:{ all -> 0x0292 }
            if (r3 != 0) goto L_0x00da
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x0292 }
            r3.<init>()     // Catch:{ all -> 0x0292 }
            r10.A00 = r3     // Catch:{ all -> 0x0292 }
        L_0x00da:
            monitor-exit(r10)     // Catch:{ all -> 0x0292 }
            int r2 = r9.length
            int r1 = r4.length
            int r0 = r12.length
            r14 = r3
            r15 = r9
            r16 = r2
            r17 = r4
            r18 = r1
            r19 = r12
            r20 = r0
            byte[] r4 = r14.A01(r15, r16, r17, r18, r19, r20)
            if (r4 == 0) goto L_0x013b
            int r3 = r4.length
            r2 = 1
            if (r3 == r2) goto L_0x013b
            boolean r0 = r10.A0F
            android.content.SharedPreferences r1 = X.C63732tb.A00(r8)
            if (r0 == 0) goto L_0x010b
            java.lang.String r0 = "next_original_token_string"
            java.lang.String r0 = r1.getString(r0, r6)
        L_0x0102:
            if (r0 == 0) goto L_0x0132
            byte[] r6 = android.util.Base64.decode(r0, r5)
            if (r6 == 0) goto L_0x0132
            goto L_0x0112
        L_0x010b:
            java.lang.String r0 = "original_token_string"
            java.lang.String r0 = r1.getString(r0, r6)
            goto L_0x0102
        L_0x0112:
            java.lang.String r1 = "SHA-512"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0126 }
            int r1 = r6.length     // Catch:{ NoSuchAlgorithmException -> 0x0126 }
            r2.update(r6, r7, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0126 }
            r2.update(r4, r7, r3)     // Catch:{ NoSuchAlgorithmException -> 0x0126 }
            byte[] r5 = r2.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0126 }
            if (r5 == 0) goto L_0x012c
            goto L_0x0147
        L_0x0126:
            r1 = move-exception
            java.lang.String r0 = "ACSToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x012c:
            r0 = 14
            r8.A04(r0)
            goto L_0x00ca
        L_0x0132:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A04(r2)
            goto L_0x00ca
        L_0x013b:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A04(r5)
            goto L_0x00ca
        L_0x0144:
            r4 = r6
            goto L_0x00be
        L_0x0147:
            monitor-enter(r10)
            java.lang.String r4 = "redeem_count"
            X.C63732tb.A01(r8, r4, r7)     // Catch:{ all -> 0x028f }
            r3 = 10
            java.lang.String r2 = android.util.Base64.encodeToString(r5, r3)     // Catch:{ all -> 0x028f }
            java.lang.String r1 = "shared_secret_string"
            X.C63732tb.A03(r8, r1, r2)     // Catch:{ all -> 0x028f }
            X.11P r1 = r10.A06     // Catch:{ all -> 0x028f }
            long r1 = X.AnonymousClass11P.A00(r1)     // Catch:{ all -> 0x028f }
            java.lang.String r12 = "base_timestamp"
            X.C63732tb.A02(r8, r12, r1)     // Catch:{ all -> 0x028f }
            X.C63732tb.A03(r8, r13, r11)     // Catch:{ all -> 0x028f }
            boolean r1 = r10.A0F     // Catch:{ all -> 0x028f }
            if (r1 == 0) goto L_0x0177
            java.lang.String r1 = "original_token_string"
            X.C63732tb.A03(r8, r1, r0)     // Catch:{ all -> 0x028f }
            java.lang.String r1 = "next_original_token_string"
            X.C63732tb.A03(r8, r1, r11)     // Catch:{ all -> 0x028f }
            r10.A0F = r7     // Catch:{ all -> 0x028f }
        L_0x0177:
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x028f }
            X.2db r12 = r10.A03     // Catch:{ all -> 0x028f }
            long r1 = r10.A0C     // Catch:{ all -> 0x028f }
            long r16 = r18 - r1
            int r1 = r10.A0B     // Catch:{ all -> 0x028f }
            long r1 = (long) r1     // Catch:{ all -> 0x028f }
            int r14 = r10.A01     // Catch:{ all -> 0x028f }
            r15 = 1
            X.2Gi r13 = new X.2Gi     // Catch:{ all -> 0x028f }
            r13.<init>()     // Catch:{ all -> 0x028f }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x028f }
            r13.A04 = r15     // Catch:{ all -> 0x028f }
            java.lang.Long r15 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x028f }
            r13.A05 = r15     // Catch:{ all -> 0x028f }
            java.lang.Long r15 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x028f }
            r13.A07 = r15     // Catch:{ all -> 0x028f }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x028f }
            r13.A06 = r1     // Catch:{ all -> 0x028f }
            X.195 r1 = r12.A00     // Catch:{ all -> 0x028f }
            boolean r2 = r1.A00     // Catch:{ all -> 0x028f }
            r1 = 2
            if (r2 == 0) goto L_0x01ac
            r1 = 1
        L_0x01ac:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x028f }
            r13.A02 = r1     // Catch:{ all -> 0x028f }
            X.1Hc r1 = r12.A01     // Catch:{ all -> 0x028f }
            boolean r1 = r1.A02()     // Catch:{ all -> 0x028f }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x028f }
            r13.A01 = r1     // Catch:{ all -> 0x028f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x028f }
            r13.A03 = r1     // Catch:{ all -> 0x028f }
            X.18K r12 = r12.A02     // Catch:{ all -> 0x028f }
            r12.CC7(r13)     // Catch:{ all -> 0x028f }
            r10.A0D = r11     // Catch:{ all -> 0x028f }
            r10.A0G = r11     // Catch:{ all -> 0x028f }
            r10.A0B = r7     // Catch:{ all -> 0x028f }
            r10.A0E = r7     // Catch:{ all -> 0x028f }
            r1 = 0
            r10.A0C = r1     // Catch:{ all -> 0x028f }
            r8.A04(r7)     // Catch:{ all -> 0x028f }
            X.2dc r11 = new X.2dc     // Catch:{ all -> 0x028f }
            r11.<init>(r6, r5, r7)     // Catch:{ all -> 0x028f }
            android.content.SharedPreferences r2 = X.C63732tb.A00(r8)     // Catch:{ all -> 0x028f }
            r1 = -1
            int r6 = r2.getInt(r4, r1)     // Catch:{ all -> 0x028f }
            X.0ve r7 = r10.A07     // Catch:{ all -> 0x028f }
            r2 = 1143(0x477, float:1.602E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x028f }
            boolean r1 = X.C18020vd.A05(r1, r7, r2)     // Catch:{ all -> 0x028f }
            if (r1 == 0) goto L_0x0216
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x028f }
            java.lang.String r1 = android.util.Base64.encodeToString(r9, r3)     // Catch:{ all -> 0x028f }
            r2.append(r1)     // Catch:{ all -> 0x028f }
            java.lang.String r1 = "+"
            r2.append(r1)     // Catch:{ all -> 0x028f }
            java.lang.String r1 = android.util.Base64.encodeToString(r5, r3)     // Catch:{ all -> 0x028f }
            java.lang.String r2 = X.AnonymousClass000.A0y(r1, r2)     // Catch:{ all -> 0x028f }
            X.2Ev r1 = new X.2Ev     // Catch:{ all -> 0x028f }
            r1.<init>()     // Catch:{ all -> 0x028f }
            r1.A01 = r2     // Catch:{ all -> 0x028f }
            r1.A00 = r0     // Catch:{ all -> 0x028f }
            r12.CC7(r1)     // Catch:{ all -> 0x028f }
        L_0x0216:
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.A0A     // Catch:{ all -> 0x028f }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x028f }
        L_0x021c:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x028f }
            if (r0 == 0) goto L_0x028a
            java.lang.Object r7 = r14.next()     // Catch:{ all -> 0x028f }
            X.2j4 r7 = (X.C57432j4) r7     // Catch:{ all -> 0x028f }
            java.lang.String r5 = r10.A09     // Catch:{ all -> 0x028f }
            r12 = 1
            java.lang.ref.WeakReference r0 = r7.A00     // Catch:{ all -> 0x028f }
            java.lang.Object r9 = r0.get()     // Catch:{ all -> 0x028f }
            X.3Lp r9 = (X.C72353Lp) r9     // Catch:{ all -> 0x028f }
            if (r9 == 0) goto L_0x027f
            byte[] r13 = r11.A01     // Catch:{ Exception -> 0x026b }
            if (r13 == 0) goto L_0x0265
            byte[] r0 = r11.A02     // Catch:{ Exception -> 0x026b }
            if (r0 == 0) goto L_0x0265
            X.2xK r0 = r7.A02     // Catch:{ Exception -> 0x026b }
            java.lang.String r2 = r0.A00(r11)     // Catch:{ Exception -> 0x026b }
            if (r2 == 0) goto L_0x0260
            int r0 = r2.length()     // Catch:{ Exception -> 0x026b }
            if (r0 == 0) goto L_0x0260
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x026b }
            java.lang.String r0 = android.util.Base64.encodeToString(r13, r3)     // Catch:{ Exception -> 0x026b }
            r1.append(r0)     // Catch:{ Exception -> 0x026b }
            r0 = 43
            java.lang.String r0 = X.C17890vO.A0Z(r2, r1, r0)     // Catch:{ Exception -> 0x026b }
            r9.C8n(r0)     // Catch:{ Exception -> 0x026b }
            goto L_0x027f
        L_0x0260:
            r0 = 2
            r9.C8m(r0)     // Catch:{ Exception -> 0x026b }
            goto L_0x027f
        L_0x0265:
            int r0 = r11.A00     // Catch:{ Exception -> 0x026b }
            r9.C8o(r0)     // Catch:{ Exception -> 0x026b }
            goto L_0x027f
        L_0x026b:
            java.lang.String r0 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued Error while fetching ACS token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0285 }
            X.2xK r0 = r7.A02     // Catch:{ all -> 0x0285 }
            X.190 r2 = r0.A00     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued"
            java.lang.String r0 = "Error while fetching ACS token"
            r2.A0G(r1, r0, r12)     // Catch:{ all -> 0x0285 }
            r0 = 5
            r9.C8m(r0)     // Catch:{ all -> 0x0285 }
        L_0x027f:
            r7.A00(r5)     // Catch:{ all -> 0x028f }
            int r6 = r6 + 1
            goto L_0x021c
        L_0x0285:
            r0 = move-exception
            r7.A00(r5)     // Catch:{ all -> 0x028f }
            throw r0     // Catch:{ all -> 0x028f }
        L_0x028a:
            X.C63732tb.A01(r8, r4, r6)     // Catch:{ all -> 0x028f }
            monitor-exit(r10)     // Catch:{ all -> 0x028f }
            return
        L_0x028f:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x028f }
            throw r1
        L_0x0292:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0292 }
            throw r1
        L_0x0295:
            java.lang.Object r1 = r0.A02
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = (com.whatsapp.calling.callhistory.view.CallsHistoryFragment) r1
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            long r12 = r0.A01
            java.lang.Object r10 = r0.A04
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10
            X.11P r6 = r1.A0M
            X.1KB r3 = r1.A08
            X.1VP r4 = r1.A0D
            X.1TD r7 = r1.A0O
            X.1Uq r9 = r1.A0R
            X.1TA r8 = r1.A0Q
            r11 = 19
            X.00H r0 = r1.A0j
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.12O> r0 = X.AnonymousClass12O.class
            X.11a r5 = r1.A01(r0)
            X.12O r5 = (X.AnonymousClass12O) r5
            X.C63982u1.A05(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x02c5:
            java.lang.Object r1 = r0.A02
            X.2i0 r1 = (X.C56772i0) r1
            java.lang.Object r3 = r0.A03
            X.2RD r3 = (X.AnonymousClass2RD) r3
            java.lang.Object r2 = r0.A04
            X.6ii r2 = (X.C129996ii) r2
            long r4 = r0.A01
            X.2sp r1 = r1.A00
            r6 = 1
            X.C63292sp.A01(r1, r2, r3, r4, r6)
            return
        L_0x02da:
            java.lang.Object r2 = r0.A02
            X.2Cp r2 = (X.C46032Cp) r2
            java.lang.Object r3 = r0.A03
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            java.lang.Object r4 = r0.A04
            X.8qE r4 = (X.C170568qE) r4
            long r0 = r0.A01
            r6 = -5
            r5 = 1
            X.C46032Cp.A03(r2, r3, r4, r5, r6)
            X.C46032Cp.A01(r2, r3, r0)
            return
        L_0x02f2:
            java.lang.Object r10 = r0.A02
            X.1BI r10 = (X.AnonymousClass1BI) r10
            java.lang.Object r9 = r0.A03
            X.5yQ r9 = (X.C116665yQ) r9
            long r1 = r0.A01
            java.lang.Object r8 = r0.A04
            X.206 r8 = (X.AnonymousClass206) r8
            if (r10 == 0) goto L_0x0326
            X.1PQ r3 = r9.A0B
            X.11P r0 = r9.A06
            long r4 = X.AnonymousClass11P.A01(r0)
            long r6 = r8.A0x
            java.lang.String r11 = "reminder content"
            X.1PP r0 = r3.A02
            X.205 r10 = X.C17880vN.A0Z(r10, r0)
            r0 = 162(0xa2, float:2.27E-43)
            X.2MG r3 = new X.2MG
            r3.<init>(r10, r0, r4)
            r3.A00 = r6
            r3.A02 = r11
            r3.A01 = r1
            X.121 r0 = r9.A0A
            r0.BBY(r3)
        L_0x0326:
            X.1LW r0 = r9.A09
            long r3 = r0.A0A(r8)
            X.00H r0 = r9.A0G
            java.lang.Object r0 = r0.get()
            X.2kQ r0 = (X.C58272kQ) r0
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            X.1Cd r0 = r0.A00
            X.1au r7 = r0.A05()
            r0 = 3
            android.content.ContentValues r6 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x036c }
            X.AnonymousClass206.A04(r6, r8)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "scheduled_reminder_timestamp_ms"
            X.C17880vN.A19(r6, r0, r1)     // Catch:{ all -> 0x036c }
            java.lang.String r0 = "chat_row_id"
            r6.put(r0, r3)     // Catch:{ all -> 0x036c }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x036c }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x036c }
            java.lang.String r4 = "scheduled_reminder_message"
            java.lang.String r3 = "ScheduledReminderMessageStore/INSERT"
            r0 = 5
            r5.A09(r4, r3, r6, r0)     // Catch:{ all -> 0x036c }
            r7.close()
            X.00H r0 = r9.A0F
            java.lang.Object r0 = r0.get()
            X.2rh r0 = (X.C62622rh) r0
            r0.A03(r8, r1)
            return
        L_0x036c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x036e }
        L_0x036e:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x0373:
            java.lang.Object r2 = r0.A02
            X.4aY r2 = (X.AnonymousClass4aY) r2
            java.lang.Object r4 = r0.A03
            X.1BI r4 = (X.AnonymousClass1BI) r4
            long r9 = r0.A01
            java.lang.Object r3 = r0.A04
            X.2H8 r3 = (X.AnonymousClass2H8) r3
            X.5cQ r0 = r2.A2Q
            X.1MZ r0 = r0.getGroupParticipantsManager()
            java.util.HashSet r1 = r0.A08(r4)
            X.5cQ r0 = r2.A2Q
            X.190 r0 = r0.getCrashLogs()
            java.util.Set r0 = X.C22971Dz.A0D(r0, r1)
            int r7 = r0.size()
            X.1ni r5 = r2.A4D
            int r8 = r1.size()
            r6 = 3
            X.10I r0 = r5.A0C
            X.3CQ r2 = new X.3CQ
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.CGF(r2)
            return
        L_0x03ab:
            java.lang.Object r2 = r0.A02
            X.2tl r2 = (X.C63832tl) r2
            java.lang.Object r10 = r0.A03
            byte[] r10 = (byte[]) r10
            java.lang.Object r14 = r0.A04
            byte[] r14 = (byte[]) r14
            X.2tM r1 = r2.A05
            android.content.SharedPreferences r0 = X.C63582tM.A00(r1)
            java.lang.String r6 = "blinding_factor"
            r12 = 0
            java.lang.String r0 = r0.getString(r6, r12)
            r4 = 8
            r5 = 0
            if (r0 == 0) goto L_0x03cd
            byte[] r12 = android.util.Base64.decode(r0, r4)
        L_0x03cd:
            r3 = 4
            r0 = 0
            if (r12 != 0) goto L_0x03dd
            java.lang.String r4 = "PrivateStatsToken/processSignedBlindedToken blindingFactor is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r1.A05(r3)
        L_0x03d9:
            X.C63832tl.A03(r2, r3, r0)
            return
        L_0x03dd:
            X.11P r8 = r2.A03
            android.os.SystemClock.elapsedRealtime()
            org.whispersystems.curve25519.NativeVOPRFExtension r9 = r2.A00
            if (r9 != 0) goto L_0x03ed
            org.whispersystems.curve25519.NativeVOPRFExtension r9 = new org.whispersystems.curve25519.NativeVOPRFExtension
            r9.<init>()
            r2.A00 = r9
        L_0x03ed:
            int r11 = r10.length
            int r13 = r12.length
            int r15 = r14.length
            byte[] r12 = r9.A01(r10, r11, r12, r13, r14, r15)
            android.os.SystemClock.elapsedRealtime()
            if (r12 == 0) goto L_0x043e
            int r11 = r12.length
            r14 = 1
            if (r11 == r14) goto L_0x043e
            r7 = 2
            boolean r9 = r2.A0F
            android.content.SharedPreferences r10 = X.C63582tM.A00(r1)
            if (r9 == 0) goto L_0x0415
            java.lang.String r9 = "next_original_token"
        L_0x0408:
            java.lang.String r9 = r10.getString(r9, r5)
            if (r9 == 0) goto L_0x0435
            byte[] r13 = android.util.Base64.decode(r9, r4)
            if (r13 == 0) goto L_0x0435
            goto L_0x0418
        L_0x0415:
            java.lang.String r9 = "original_token"
            goto L_0x0408
        L_0x0418:
            java.lang.String r4 = "SHA-512"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x042c }
            int r4 = r13.length     // Catch:{ NoSuchAlgorithmException -> 0x042c }
            r10.update(r13, r0, r4)     // Catch:{ NoSuchAlgorithmException -> 0x042c }
            r10.update(r12, r0, r11)     // Catch:{ NoSuchAlgorithmException -> 0x042c }
            byte[] r4 = r10.digest()     // Catch:{ NoSuchAlgorithmException -> 0x042c }
            if (r4 == 0) goto L_0x0432
            goto L_0x0447
        L_0x042c:
            r5 = move-exception
            java.lang.String r4 = "PrivateStatsToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r4, r5)
        L_0x0432:
            r4 = 14
            goto L_0x0443
        L_0x0435:
            java.lang.String r4 = "PrivateStatsToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r1.A05(r14)
            goto L_0x03d9
        L_0x043e:
            java.lang.String r5 = "PrivateStatsToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r5)
        L_0x0443:
            r1.A05(r4)
            goto L_0x03d9
        L_0x0447:
            monitor-enter(r2)
            r1.A04(r0)     // Catch:{ all -> 0x04d0 }
            r3 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r3)     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = "shared_secret"
            X.C63582tM.A02(r1, r3, r4)     // Catch:{ all -> 0x04d0 }
            X.18O r4 = r2.A01     // Catch:{ all -> 0x04d0 }
            X.18Q r3 = X.AnonymousClass18O.A06     // Catch:{ all -> 0x04d0 }
            int r10 = r4.A04(r3)     // Catch:{ all -> 0x04d0 }
            r4 = 10800(0x2a30, float:1.5134E-41)
            java.util.Random r3 = new java.util.Random     // Catch:{ all -> 0x04d0 }
            r3.<init>()     // Catch:{ all -> 0x04d0 }
            int r3 = r3.nextInt(r4)     // Catch:{ all -> 0x04d0 }
            int r10 = r10 - r3
            long r3 = (long) r10     // Catch:{ all -> 0x04d0 }
            java.lang.String r10 = "time_to_live"
            X.C63582tM.A01(r1, r10, r3)     // Catch:{ all -> 0x04d0 }
            long r3 = X.AnonymousClass11P.A00(r8)     // Catch:{ all -> 0x04d0 }
            java.lang.String r8 = "base_timestamp"
            X.C63582tM.A01(r1, r8, r3)     // Catch:{ all -> 0x04d0 }
            X.C63582tM.A02(r1, r6, r5)     // Catch:{ all -> 0x04d0 }
            boolean r3 = r2.A0F     // Catch:{ all -> 0x04d0 }
            if (r3 == 0) goto L_0x048e
            java.lang.String r3 = "original_token"
            X.C63582tM.A02(r1, r3, r9)     // Catch:{ all -> 0x04d0 }
            java.lang.String r3 = "next_original_token"
            X.C63582tM.A02(r1, r3, r5)     // Catch:{ all -> 0x04d0 }
            r2.A0F = r0     // Catch:{ all -> 0x04d0 }
        L_0x048e:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x04d0 }
            X.1Wj r13 = r2.A04     // Catch:{ all -> 0x04d0 }
            long r3 = r2.A0B     // Catch:{ all -> 0x04d0 }
            long r15 = r17 - r3
            long r3 = r2.A0C     // Catch:{ all -> 0x04d0 }
            long r17 = r17 - r3
            int r3 = r2.A0A     // Catch:{ all -> 0x04d0 }
            long r3 = (long) r3     // Catch:{ all -> 0x04d0 }
            r19 = r3
            r13.A01(r14, r15, r17, r19)     // Catch:{ all -> 0x04d0 }
            r2.A0D = r5     // Catch:{ all -> 0x04d0 }
            r2.A0G = r5     // Catch:{ all -> 0x04d0 }
            r2.A0A = r0     // Catch:{ all -> 0x04d0 }
            r2.A0E = r0     // Catch:{ all -> 0x04d0 }
            r3 = 0
            r2.A0B = r3     // Catch:{ all -> 0x04d0 }
            r2.A0C = r3     // Catch:{ all -> 0x04d0 }
            android.content.SharedPreferences r6 = X.C63582tM.A00(r1)     // Catch:{ all -> 0x04d0 }
            java.lang.String r5 = "first_token_stage"
            int r5 = r6.getInt(r5, r0)     // Catch:{ all -> 0x04d0 }
            if (r5 != r14) goto L_0x04cb
            r1.A03(r7)     // Catch:{ all -> 0x04d0 }
            java.lang.String r5 = "first_token_request_timestamp"
            X.C63582tM.A01(r1, r5, r3)     // Catch:{ all -> 0x04d0 }
            java.lang.String r5 = "first_token_delay_time"
            X.C63582tM.A01(r1, r5, r3)     // Catch:{ all -> 0x04d0 }
        L_0x04cb:
            r1.A05(r0)     // Catch:{ all -> 0x04d0 }
            monitor-exit(r2)     // Catch:{ all -> 0x04d0 }
            return
        L_0x04d0:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x04d0 }
            throw r1
        L_0x04d3:
            java.lang.Object r5 = r0.A02
            X.AW1 r5 = (X.AW1) r5
            java.lang.Object r6 = r0.A03
            X.1ch r6 = (X.C29681ch) r6
            long r1 = r0.A01
            java.lang.Object r3 = r0.A04
            X.0vk r3 = (X.C18090vk) r3
            r0 = 3
            X.C18070vi.A0d(r3, r0)
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.1hF r0 = (X.C32471hF) r0
            X.206 r0 = r0.A02(r6, r1)
            if (r0 == 0) goto L_0x04f7
            r3.invoke()
            return
        L_0x04f7:
            r0 = 1
            X.4oa r7 = new X.4oa
            r7.<init>(r3, r0)
            r3 = 25
            long r1 = r1 - r3
            r3 = 99
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0508
            r1 = 99
        L_0x0508:
            X.00H r0 = r5.A08
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.2rC r5 = (X.C62312rC) r5
            java.lang.Long r9 = java.lang.Long.valueOf(r1)
            r8 = 0
            r12 = 0
            r10 = 50
            r5.A01(r6, r7, r8, r9, r10, r12)
            return
        L_0x051c:
            java.lang.Object r5 = r0.A02
            X.2rG r5 = (X.C62352rG) r5
            java.lang.Object r1 = r0.A03
            X.3M9 r1 = (X.AnonymousClass3M9) r1
            long r3 = r0.A01
            java.lang.Object r2 = r0.A04
            X.1Ug r2 = (X.C26981Ug) r2
            r0 = 3
            X.C18070vi.A0d(r2, r0)
            r0 = 0
            r5.A02(r1, r3)     // Catch:{ all -> 0x0536 }
            r2.BrF(r0)
            return
        L_0x0536:
            r1 = move-exception
            r2.BrF(r0)
            throw r1
        L_0x053b:
            java.lang.Object r8 = r0.A02
            X.1Nb r8 = (X.AnonymousClass1Nb) r8
            long r6 = r0.A01
            java.lang.Object r5 = r0.A03
            X.1BI r5 = (X.AnonymousClass1BI) r5
            java.lang.Object r4 = r0.A04
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            X.00H r0 = r8.A0L
            java.lang.Object r3 = r0.get()
            X.1Q1 r3 = (X.AnonymousClass1Q1) r3
            X.11A r2 = X.C18070vi.A0B(r3, r5)
            if (r1 != 0) goto L_0x0568
            r1 = 7
        L_0x055a:
            X.3C4 r0 = new X.3C4
            r0.<init>(r3, r5, r4, r1)
            r2.A00(r0)
            X.1NN r0 = r8.A0D
            r0.A02(r5)
            return
        L_0x0568:
            r1 = 11
            goto L_0x055a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3C8.run():void");
    }
}
