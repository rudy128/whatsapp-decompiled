package X;

/* renamed from: X.4ri  reason: invalid class name and case insensitive filesystem */
public class C98784ri implements Runnable {
    public final int A00;
    public final Object A01;

    public C98784ri(C79053uH r1, int i) {
        this.A00 = i;
        if (21 - i != 0) {
            this.A01 = r1;
        } else {
            this.A01 = r1;
        }
    }

    public static void A00(AnonymousClass10I r1, Object obj, int i) {
        r1.CGF(new C98784ri(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0498, code lost:
        r0.apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x049b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x04de, code lost:
        if (r0.booleanValue() == false) goto L_0x04e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04e1, code lost:
        if (r2 != null) goto L_0x04e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x04e5, code lost:
        if (r2.A0C != false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x04e7, code lost:
        if (r1 != false) goto L_0x04ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04e9, code lost:
        r6 = X.C78543sy.A05(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0613, code lost:
        r2.A06(r1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0617, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x06bb, code lost:
        r4.A0J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x06be, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a5, code lost:
        if (r2 != null) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
        r0 = r5.putLong(r4, X.C17890vO.A05(r0, r4) + 1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r29 = this;
            r1 = r29
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0367;
                case 1: goto L_0x004e;
                case 2: goto L_0x007b;
                case 3: goto L_0x0696;
                case 4: goto L_0x049c;
                case 5: goto L_0x0506;
                case 6: goto L_0x050e;
                case 7: goto L_0x0521;
                case 8: goto L_0x00ca;
                case 9: goto L_0x052e;
                case 10: goto L_0x0542;
                case 11: goto L_0x060a;
                case 12: goto L_0x054d;
                case 13: goto L_0x0571;
                case 14: goto L_0x0579;
                case 15: goto L_0x0581;
                case 16: goto L_0x00e6;
                case 17: goto L_0x0589;
                case 18: goto L_0x059d;
                case 19: goto L_0x02fb;
                case 20: goto L_0x05a5;
                case 21: goto L_0x05e7;
                case 22: goto L_0x000f;
                case 23: goto L_0x0020;
                case 24: goto L_0x0031;
                case 25: goto L_0x031e;
                case 26: goto L_0x0335;
                case 27: goto L_0x05ef;
                case 28: goto L_0x05f7;
                case 29: goto L_0x0358;
                case 30: goto L_0x0367;
                case 31: goto L_0x0602;
                case 32: goto L_0x060a;
                case 33: goto L_0x0618;
                case 34: goto L_0x0620;
                case 35: goto L_0x0401;
                case 36: goto L_0x0628;
                case 37: goto L_0x0630;
                case 38: goto L_0x0638;
                case 39: goto L_0x064a;
                case 40: goto L_0x064a;
                case 41: goto L_0x0655;
                case 42: goto L_0x044e;
                case 43: goto L_0x0661;
                case 44: goto L_0x0007;
                case 45: goto L_0x0007;
                case 46: goto L_0x0007;
                case 47: goto L_0x0461;
                case 48: goto L_0x0676;
                case 49: goto L_0x068e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            X.AnonymousClass3Ma.A1Q(r0)
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r1.A01
            X.7Jk r0 = (X.C144977Jk) r0
            android.content.SharedPreferences$Editor r5 = X.C144977Jk.A00(r0)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r4 = "ptv_pause_count"
            goto L_0x0041
        L_0x0020:
            java.lang.Object r0 = r1.A01
            X.7Jk r0 = (X.C144977Jk) r0
            android.content.SharedPreferences$Editor r5 = X.C144977Jk.A00(r0)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r4 = "ptv_resume_count"
            goto L_0x0041
        L_0x0031:
            java.lang.Object r0 = r1.A01
            X.7Jk r0 = (X.C144977Jk) r0
            android.content.SharedPreferences$Editor r5 = X.C144977Jk.A00(r0)
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r0 = X.C17880vN.A0C(r0)
            java.lang.String r4 = "ptv_unmute_count"
        L_0x0041:
            long r2 = X.C17890vO.A05(r0, r4)
            r0 = 1
            long r2 = r2 + r0
            android.content.SharedPreferences$Editor r0 = r5.putLong(r4, r2)
            goto L_0x0498
        L_0x004e:
            java.lang.Object r2 = r1.A01
            X.3so r2 = (X.C78443so) r2
            java.util.ArrayList r1 = r2.A0a
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000e
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            if (r1 == 0) goto L_0x000e
            X.1M9 r0 = r2.A0j
            X.1E7 r1 = r0.A0E(r1)
            if (r1 == 0) goto L_0x000e
            boolean r0 = r1.A0E()
            if (r0 == 0) goto L_0x000e
            X.1KB r4 = r2.A0S
            r0 = 2
            X.4rl r3 = new X.4rl
            r3.<init>(r2, r1, r0)
            goto L_0x06bb
        L_0x007b:
            java.lang.Object r3 = r1.A01
            X.4d3 r3 = (X.C89804d3) r3
            X.1BI r2 = r3.A04
            boolean r0 = X.C42701yb.A01(r2)
            if (r0 == 0) goto L_0x000e
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x00c8
            X.1PW r1 = r3.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.00H r0 = r1.A02
            java.lang.Object r0 = r0.get()
            X.1Pl r0 = (X.C25741Pl) r0
            X.24e r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x00c8
            java.lang.String r2 = r0.A0F
            if (r2 == 0) goto L_0x00c8
        L_0x00a7:
            X.2Hl r1 = new X.2Hl
            r1.<init>()
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A02 = r0
            r1.A0C = r2
            java.lang.Integer r0 = X.C17880vN.A0k()
            r1.A06 = r0
            java.lang.String r0 = X.C50542Uv.A00()
            r1.A0E = r0
            X.18K r0 = r3.A03
            r0.CC7(r1)
            return
        L_0x00c8:
            r2 = 0
            goto L_0x00a7
        L_0x00ca:
            java.lang.Object r1 = r1.A01
            X.3tz r1 = (X.C78953tz) r1
            X.0zA r0 = r1.getBenefitsAccessManager()
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x000e
            X.0zA r0 = r1.getBenefitsAccessManager()
            r0.A03()
            java.lang.String r0 = "isAccessAllowed"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x00e6:
            java.lang.Object r6 = r1.A01
            X.49n r6 = (X.C827349n) r6
            r11 = 0
            X.C18070vi.A0d(r6, r11)
            X.4a0 r0 = r6.A00
            X.4TS r10 = r0.A03
            if (r10 == 0) goto L_0x000e
            X.21X r9 = r10.A01
            X.4Px r1 = r6.A05
            android.view.ViewGroup r8 = r6.A03
            android.app.Activity r7 = X.AnonymousClass3Ma.A05(r8)
            X.4a0 r0 = r6.A00
            boolean r0 = r0.A06
            r3 = r0 ^ 1
            X.4ZL r1 = r1.A00
            X.C17960vV.A02()
            X.2rc r0 = r9.A02
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "VideoPlayerPoolManager/requestVideoPlayerInstance/mediaDataV2 is null"
        L_0x010f:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0112:
            X.4a0 r1 = r6.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            X.4a0 r10 = X.C88514a0.A00(r1, r0)
        L_0x011a:
            X.C827349n.A02(r6, r10)
            return
        L_0x011e:
            java.io.File r2 = r0.A0G
            if (r2 != 0) goto L_0x012d
            X.0ve r0 = r1.A07
            boolean r0 = X.AnonymousClass72Z.A02(r0, r9)
            if (r0 != 0) goto L_0x012d
            java.lang.String r0 = "VideoPlayerPoolManager/requestVideoPlayerInstance/file is null and video is not streamable"
            goto L_0x010f
        L_0x012d:
            if (r3 == 0) goto L_0x013b
            X.2Kv r3 = r1.A04
            java.lang.String r0 = "messageaudio/play"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 9
            X.C17890vO.A0r(r3, r9, r0)
        L_0x013b:
            java.util.List r4 = r1.A0C
            boolean r0 = r4.isEmpty()
            r12 = 4
            if (r0 == 0) goto L_0x0161
            java.util.List r3 = r1.A0D
            int r0 = r3.size()
            if (r0 < r12) goto L_0x0161
            java.lang.Object r3 = r3.remove(r11)
            X.4OI r3 = (X.AnonymousClass4OI) r3
            X.4LI r0 = r3.A01
            if (r0 == 0) goto L_0x015b
            X.49n r0 = r0.A00
            X.C827349n.A00(r0)
        L_0x015b:
            r4.add(r3)
            r3.hashCode()
        L_0x0161:
            java.util.List r5 = r1.A0D
            r5.size()
            r4.size()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x0236
            java.lang.Object r12 = r4.remove(r11)
            X.4OI r12 = (X.AnonymousClass4OI) r12
            X.0ve r0 = r1.A07
            boolean r0 = X.AnonymousClass72Z.A02(r0, r9)
            if (r0 == 0) goto L_0x022f
            X.00H r0 = r1.A0B
            java.lang.Object r2 = r0.get()
            X.6oM r2 = (X.C133216oM) r2
            X.1FU r7 = (X.AnonymousClass1FU) r7
            X.6Mm r0 = X.AnonymousClass4ZL.A00(r9, r1)
            X.6My r2 = r2.A00(r7, r9, r0)
            X.70X r1 = r12.A03
            r0 = 0
            r1.A0R(r0, r2)
        L_0x0195:
            r12.hashCode()
            X.205 r0 = r9.A0v
            java.lang.String r0 = r0.A01
            r12.A02 = r0
        L_0x019e:
            r5.add(r12)
            X.4a0 r0 = r6.A00
            boolean r0 = r0.A06
            X.70X r3 = r12.A03
            r3.A0W(r0)
            X.4a0 r0 = r6.A00
            int r0 = r0.A00
            r3.A0O(r0)
            r0 = 1
            r3.A0C = r0
            r3.A0D = r0
            int r0 = r10.A00
            r3.A0P(r0)
            X.4LH r0 = new X.4LH
            r0.<init>(r6)
            r12.A00 = r0
            X.4LI r0 = new X.4LI
            r0.<init>(r6)
            r12.A01 = r0
            r1 = 1
            X.4r1 r0 = new X.4r1
            r0.<init>(r6, r12, r1)
            r3.A0T(r0)
            X.4qz r0 = new X.4qz
            r0.<init>(r6, r11)
            r3.A0S(r0)
            r8.removeAllViews()
            android.view.View r2 = r3.A09()
            if (r2 == 0) goto L_0x01fe
            android.view.ViewParent r1 = r2.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x01f2
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x01f2
            r1.removeAllViews()
        L_0x01f2:
            r8.setVisibility(r11)
            r1 = -1
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            r0.<init>(r1, r1)
            r8.addView(r2, r0)
        L_0x01fe:
            boolean r0 = r3.A0e()
            if (r0 == 0) goto L_0x022b
            r3.A0J()
        L_0x0207:
            X.4a0 r0 = r6.A00
            int r0 = r0.A01
            r3.A0N(r0)
            X.4a0 r0 = r6.A00
            X.4TS r11 = r0.A03
            boolean r2 = r0.A07
            int r14 = r0.A02
            boolean r1 = r0.A06
            java.lang.Integer r13 = r0.A05
            int r15 = r0.A01
            int r0 = r0.A00
            X.4a0 r10 = new X.4a0
            r18 = r1
            r16 = r0
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x011a
        L_0x022b:
            r3.A0G()
            goto L_0x0207
        L_0x022f:
            X.70X r0 = r12.A03
            r0.A0V(r2)
            goto L_0x0195
        L_0x0236:
            int r0 = r5.size()
            if (r0 >= r12) goto L_0x0112
            X.0ve r4 = r1.A07
            r3 = 6393(0x18f9, float:8.959E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r16 = X.C18020vd.A05(r0, r4, r3)
            boolean r0 = X.AnonymousClass72Z.A02(r4, r9)
            if (r0 == 0) goto L_0x02b4
            X.00H r0 = r1.A0B
            java.lang.Object r3 = r0.get()
            X.6oM r3 = (X.C133216oM) r3
            r2 = r7
            X.1FU r2 = (X.AnonymousClass1FU) r2
            X.6Mm r0 = X.AnonymousClass4ZL.A00(r9, r1)
            X.6My r14 = r3.A00(r2, r9, r0)
            X.190 r0 = r1.A02
            r18 = r0
            X.1KB r0 = r1.A03
            r17 = r0
            X.11C r15 = r1.A05
            X.118 r13 = r1.A06
            X.00H r0 = r1.A0A
            java.lang.Object r0 = r0.get()
            X.4PA r0 = (X.AnonymousClass4PA) r0
            X.10I r3 = r0.A02
            X.00H r0 = r1.A09
            java.lang.Object r0 = r0.get()
            X.6gC r0 = (X.AnonymousClass6gC) r0
            X.4Pw r2 = r1.A08
            r26 = 0
            X.6Mr r1 = new X.6Mr
            r23 = r4
            r24 = r0
            r25 = r3
            r27 = r12
            r28 = r11
            r19 = r18
            r20 = r17
            r21 = r15
            r22 = r13
            r17 = r1
            r18 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A0f(r14)
        L_0x029f:
            r1.A0B = r2
            if (r16 == 0) goto L_0x02a6
            r0 = 1
            r1.A0F = r0
        L_0x02a6:
            X.205 r0 = r9.A0v
            java.lang.String r0 = r0.A01
            X.4OI r12 = new X.4OI
            r12.<init>(r1, r0)
            r12.hashCode()
            goto L_0x019e
        L_0x02b4:
            X.190 r0 = r1.A02
            r19 = r0
            X.1KB r0 = r1.A03
            r18 = r0
            X.11C r0 = r1.A05
            r17 = r0
            X.118 r15 = r1.A06
            android.net.Uri r13 = android.net.Uri.fromFile(r2)
            X.00H r0 = r1.A0A
            java.lang.Object r0 = r0.get()
            X.4PA r0 = (X.AnonymousClass4PA) r0
            X.10I r3 = r0.A02
            X.00H r0 = r1.A09
            java.lang.Object r0 = r0.get()
            X.6gC r0 = (X.AnonymousClass6gC) r0
            X.4Pw r2 = r1.A08
            r26 = 0
            r14 = 1
            X.6Mr r1 = new X.6Mr
            r23 = r4
            r24 = r0
            r25 = r3
            r27 = r12
            r28 = r11
            r20 = r18
            r21 = r17
            r22 = r15
            r17 = r1
            r18 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r1.A04 = r13
            r1.A0S = r14
            goto L_0x029f
        L_0x02fb:
            java.lang.Object r1 = r1.A01
            X.3uL r1 = (X.AnonymousClass3uL) r1
            X.00H r0 = r1.A2K
            java.lang.Object r2 = r0.get()
            X.1iV r2 = (X.C33241iV) r2
            X.21V r3 = r1.getFMessage()
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r6 = 1
            boolean r0 = X.C33241iV.A03(r3)
            if (r0 == 0) goto L_0x000e
            r4 = 0
            r8 = r6
            r5 = r4
            r7 = r6
            X.C33241iV.A01(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x031e:
            java.lang.Object r2 = r1.A01
            X.3uH r2 = (X.C79053uH) r2
            X.00H r0 = r2.A05
            X.16x r1 = X.AnonymousClass3MX.A0d(r0)
            r0 = 0
            r1.A02 = r0
            boolean r0 = r2.A2t()
            if (r0 == 0) goto L_0x000e
            X.C79053uH.A03(r2)
            return
        L_0x0335:
            java.lang.Object r3 = r1.A01
            X.3uR r3 = (X.C79093uR) r3
            X.1BI r2 = X.C79103uS.A1C(r3)
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = r3.getContext()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            r0 = 14
            android.content.Intent r2 = X.C72463Mc.A0F(r1, r2, r0)
            android.content.Context r1 = r3.getContext()
            r0 = 0
            r1.startActivity(r2, r0)
            return
        L_0x0358:
            java.lang.Object r0 = r1.A01
            X.4XZ r0 = (X.AnonymousClass4XZ) r0
            X.21V r2 = r0.A07
            if (r2 == 0) goto L_0x000e
            X.3uJ r1 = r0.A0D
            r0 = 2
            r1.A2T(r2, r0)
            return
        L_0x0367:
            java.lang.Object r1 = r1.A01
            X.3uO r1 = (X.AnonymousClass3uO) r1
            X.206 r3 = r1.A0I
            X.210 r3 = (X.AnonymousClass210) r3
            r2 = 6
            int r0 = r3.A01
            if (r2 != r0) goto L_0x000e
            X.11S r0 = r1.A0U
            boolean r0 = X.AnonymousClass25A.A0P(r0, r3)
            if (r0 != 0) goto L_0x000e
            X.11S r0 = r1.A0U
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            r6 = 0
            if (r0 == 0) goto L_0x03fe
            X.00H r0 = r1.A0N
            java.lang.Object r4 = r0.get()
            X.A2e r4 = (X.C19991A2e) r4
            X.205 r0 = r3.A0v
            java.lang.String r2 = r0.A01
            X.11S r0 = r1.A0U
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            java.lang.String r0 = r0.getRawString()
            java.lang.String r8 = r4.A01(r2, r0)
            X.00H r0 = r1.A0N
            r0.get()
            X.11S r0 = r1.A0U
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            java.lang.String r10 = X.C19991A2e.A00(r0)
        L_0x03ae:
            com.whatsapp.jid.UserJid r5 = X.AnonymousClass3Ma.A0o(r3)
            X.0ve r4 = r1.A0F
            r2 = 12571(0x311b, float:1.7616E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r2)
            if (r0 == 0) goto L_0x03d4
            if (r5 == 0) goto L_0x03d4
            X.00H r0 = r1.A0M
            java.lang.Object r0 = r0.get()
            X.AR0 r0 = (X.AR0) r0
            java.lang.Object r0 = r0.A02(r5)
            boolean r0 = X.AnonymousClass000.A1W(r0)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x03d4:
            if (r8 == 0) goto L_0x000e
            X.00H r0 = r1.A0N
            java.lang.Object r4 = r0.get()
            X.A2e r4 = (X.C19991A2e) r4
            X.00H r0 = r1.A0Q
            java.lang.Object r0 = r0.get()
            X.2r5 r0 = (X.C62242r5) r0
            int r11 = r0.A01(r3)
            X.9z6 r2 = X.C198899z6.A00
            X.0ve r1 = r1.A0F
            java.lang.String r0 = r3.A07
            java.lang.String r7 = r2.A00(r1, r0)
            com.whatsapp.jid.UserJid r5 = r3.A0I()
            java.lang.String r9 = "link"
            r4.A03(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x03fe:
            r8 = r6
            r10 = r6
            goto L_0x03ae
        L_0x0401:
            java.lang.Object r5 = r1.A01
            X.4VQ r5 = (X.AnonymousClass4VQ) r5
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            boolean r0 = r5.A05
            if (r0 == 0) goto L_0x000e
            X.49n r1 = r5.A0E
            boolean r0 = r1.A0Y()
            if (r0 != 0) goto L_0x043e
            boolean r0 = r1.A0a()
            if (r0 == 0) goto L_0x043e
            int r0 = r1.A06()
            if (r0 == 0) goto L_0x043e
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r0 = r1.A06()
            long r2 = (long) r0
            int r0 = r1.A07()
            long r0 = (long) r0
            long r2 = r2 - r0
            long r3 = r4.toSeconds(r2)
            android.widget.TextView r2 = r5.A0A
            X.0vb r1 = r5.A0I
            r0 = 0
            java.lang.String r0 = X.C64052u8.A0D(r1, r0, r3)
            r2.setText(r0)
        L_0x043e:
            X.0vl r0 = r5.A0Q
            java.lang.Object r3 = r0.getValue()
            android.os.Handler r3 = (android.os.Handler) r3
            java.lang.Runnable r2 = r5.A00
            r0 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r2, r0)
            return
        L_0x044e:
            java.lang.Object r1 = r1.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r1 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r1
            X.4UI r0 = r1.A0G
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x000e
            X.4UI r1 = r1.A0G
            r0 = 1
            r1.A00(r0)
            return
        L_0x0461:
            java.lang.Object r0 = r1.A01
            X.CuA r0 = (X.C26186CuA) r0
            X.00H r0 = r0.A05
            X.4a3 r3 = X.AnonymousClass3MX.A0y(r0)
            X.0ve r2 = r3.A01
            r1 = 12233(0x2fc9, float:1.7142E-41)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r1 < 0) goto L_0x000e
            if (r0 == 0) goto L_0x000e
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r0) goto L_0x000e
            X.0z4 r3 = r3.A00
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r3)
            java.lang.String r2 = "voice_message_transcription_upsell_count"
            int r0 = X.C17890vO.A00(r0, r2)
            int r1 = r0 + 1
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r3)
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
        L_0x0498:
            r0.apply()
            return
        L_0x049c:
            java.lang.Object r3 = r1.A01
            X.3sy r3 = (X.C78543sy) r3
            X.1E7 r0 = r3.A03
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r2 = r0.A06(r4)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.0ve r1 = r3.A0F
            r0 = 6551(0x1997, float:9.18E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            r6 = 0
            if (r0 == 0) goto L_0x0504
            if (r2 == 0) goto L_0x0504
            X.00H r0 = r3.getCtwaFlowContextStore()
            java.lang.Object r0 = r0.get()
            X.A5S r0 = (X.A5S) r0
            java.lang.Object r2 = r0.A04(r2)
            X.4FP r2 = (X.AnonymousClass4FP) r2
        L_0x04c9:
            X.0ve r1 = r3.A0F
            r0 = 10399(0x289f, float:1.4572E-41)
            boolean r0 = X.C18020vd.A05(r5, r1, r0)
            if (r0 == 0) goto L_0x04e0
            if (r2 == 0) goto L_0x04ed
            java.lang.Boolean r0 = r2.A04
            if (r0 == 0) goto L_0x04e0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 != 0) goto L_0x04e3
        L_0x04e0:
            r1 = 0
            if (r2 == 0) goto L_0x04ed
        L_0x04e3:
            boolean r0 = r2.A0C
            if (r0 != 0) goto L_0x04ed
            if (r1 != 0) goto L_0x04ed
            java.lang.String r6 = X.C78543sy.A05(r3, r2)
        L_0x04ed:
            X.4OU r5 = r3.A0D
            X.1E7 r0 = r3.A03
            com.whatsapp.jid.Jid r4 = r0.A06(r4)
            X.4U7 r3 = r3.A01
            r7 = 1
            X.10I r0 = r5.A03
            r8 = 5
            X.4rm r2 = new X.4rm
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.CGF(r2)
            return
        L_0x0504:
            r2 = r6
            goto L_0x04c9
        L_0x0506:
            java.lang.Object r0 = r1.A01
            X.3sy r0 = (X.C78543sy) r0
            X.C78543sy.A07(r0)
            return
        L_0x050e:
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            int r0 = r2.getWidth()
            r1.height = r0
            return
        L_0x0521:
            java.lang.Object r2 = r1.A01
            X.3tz r2 = (X.C78953tz) r2
            r1 = 0
            r0 = 4
            X.C78953tz.A05(r2, r1, r0)
            r2.A2r()
            return
        L_0x052e:
            java.lang.Object r2 = r1.A01
            X.3u2 r2 = (X.C78983u2) r2
            android.view.View r1 = r2.A03
            r0 = 4
            r1.setVisibility(r0)
            X.206 r0 = r2.A0I
            X.21V r0 = (X.AnonymousClass21V) r0
            X.21t r0 = (X.C440021t) r0
            X.C78983u2.A0B(r2, r0)
            return
        L_0x0542:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.1KB r2 = r0.A0S
            r1 = 2131887919(0x7f12072f, float:1.9410459E38)
            goto L_0x0613
        L_0x054d:
            java.lang.Object r3 = r1.A01
            X.3u2 r3 = (X.C78983u2) r3
            X.206 r2 = r3.A0I
            X.21V r2 = (X.AnonymousClass21V) r2
            X.21X r2 = (X.AnonymousClass21X) r2
            X.C78983u2.A05(r3)
            X.4TR r0 = r3.A0C
            if (r0 == 0) goto L_0x056d
            int r1 = r0.A00(r2)
        L_0x0562:
            X.49n r0 = r3.A0D
            r0.A0g(r2, r1)
            r0.A0E()
            java.lang.Boolean r0 = X.C17970vW.A03
            return
        L_0x056d:
            r1 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0562
        L_0x0571:
            java.lang.Object r0 = r1.A01
            X.3u2 r0 = (X.C78983u2) r0
            X.C78983u2.A0A(r0)
            return
        L_0x0579:
            java.lang.Object r0 = r1.A01
            X.3u3 r0 = (X.AnonymousClass3u3) r0
            X.AnonymousClass3u3.A0G(r0)
            return
        L_0x0581:
            java.lang.Object r0 = r1.A01
            X.3u7 r0 = (X.AnonymousClass3u7) r0
            X.AnonymousClass3u7.A01(r0)
            return
        L_0x0589:
            java.lang.Object r2 = r1.A01
            X.49n r2 = (X.C827349n) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.4a0 r1 = r2.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            X.4a0 r0 = X.C88514a0.A00(r1, r0)
            X.C827349n.A02(r2, r0)
            return
        L_0x059d:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            r0.A1u()
            return
        L_0x05a5:
            java.lang.Object r7 = r1.A01
            X.3su r7 = (X.C78503su) r7
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            java.util.ArrayList r0 = r7.A03
            java.util.Iterator r8 = r0.iterator()
        L_0x05b3:
            boolean r0 = r8.hasNext()
            r2 = 4
            if (r0 == 0) goto L_0x05d7
            java.lang.Object r6 = r8.next()
            X.210 r6 = (X.AnonymousClass210) r6
            int r0 = r6.A01
            if (r0 != r2) goto L_0x05b3
            long r4 = r6.A0G
            X.11P r0 = r7.A0u
            long r2 = X.AnonymousClass11P.A01(r0)
            r0 = 30000(0x7530, double:1.4822E-319)
            long r2 = r2 - r0
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x05b3
            r9.add(r6)
            goto L_0x05b3
        L_0x05d7:
            X.122 r1 = r7.A0x
            java.util.List r0 = X.C29431cG.A0t(r9)
            r1.BIL(r0, r2)
            r0 = 0
            r7.A04 = r0
            r7.A2t()
            return
        L_0x05e7:
            java.lang.Object r0 = r1.A01
            X.3uL r0 = (X.AnonymousClass3uL) r0
            r0.A2p()
            return
        L_0x05ef:
            java.lang.Object r0 = r1.A01
            X.3uI r0 = (X.C79063uI) r0
            X.C79063uI.setLottieComposition$lambda$13$lambda$11$lambda$10(r0)
            return
        L_0x05f7:
            java.lang.Object r2 = r1.A01
            X.3uP r2 = (X.AnonymousClass3uP) r2
            X.206 r1 = r2.A0I
            r0 = 2
            r2.A2T(r1, r0)
            return
        L_0x0602:
            java.lang.Object r0 = r1.A01
            X.3uK r0 = (X.AnonymousClass3uK) r0
            X.AnonymousClass3uK.A0C(r0)
            return
        L_0x060a:
            java.lang.Object r0 = r1.A01
            X.3uP r0 = (X.AnonymousClass3uP) r0
            X.1KB r2 = r0.A0S
            r1 = 2131890637(0x7f1211cd, float:1.9415971E38)
        L_0x0613:
            r0 = 1
            r2.A06(r1, r0)
            return
        L_0x0618:
            java.lang.Object r0 = r1.A01
            X.3uK r0 = (X.AnonymousClass3uK) r0
            X.AnonymousClass3uK.A0A(r0)
            return
        L_0x0620:
            java.lang.Object r0 = r1.A01
            X.3uK r0 = (X.AnonymousClass3uK) r0
            X.AnonymousClass3uK.A05(r0)
            return
        L_0x0628:
            java.lang.Object r1 = r1.A01
            X.BqR r1 = (X.C23816BqR) r1
            r0 = 0
            r1.A00 = r0
            return
        L_0x0630:
            java.lang.Object r1 = r1.A01
            X.4kt r1 = (X.C94604kt) r1
            r0 = 0
            r1.A0q = r0
            return
        L_0x0638:
            java.lang.Object r0 = r1.A01
            X.3v6 r0 = (X.AnonymousClass3v6) r0
            X.A5M r3 = r0.A00
            X.206 r0 = r0.A01
            java.util.List r2 = X.C18070vi.A0M(r0)
            r1 = 6
            r0 = 0
            r3.A05(r0, r2, r1)
            return
        L_0x064a:
            java.lang.Object r0 = r1.A01
            X.3QI r0 = (X.AnonymousClass3QI) r0
            r1 = 0
            android.widget.ImageView r0 = r0.A01
            r0.setVisibility(r1)
            return
        L_0x0655:
            java.lang.Object r0 = r1.A01
            X.3QI r0 = (X.AnonymousClass3QI) r0
            android.widget.ImageView r1 = r0.A01
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x0661:
            java.lang.Object r3 = r1.A01
            com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity r3 = (com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity) r3
            X.00H r0 = r3.A0M
            java.lang.Object r2 = r0.get()
            X.2jR r2 = (X.C57662jR) r2
            java.util.ArrayList r1 = com.whatsapp.conversation.conversationrow.album.MediaAlbumActivity.A0z(r3)
            r0 = 1
            r2.A00(r3, r1, r0)
            return
        L_0x0676:
            java.lang.Object r1 = r1.A01
            X.CuA r1 = (X.C26186CuA) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A07
            java.lang.Object r0 = r0.get()
            X.6kM r0 = (X.C131006kM) r0
            X.6mJ r2 = r0.A02
            r0 = 1
            r2.A00(r0)
            return
        L_0x068e:
            java.lang.Object r0 = r1.A01
            X.0vk r0 = (X.C18090vk) r0
            r0.invoke()
            return
        L_0x0696:
            java.lang.Object r5 = r1.A01
            X.4d3 r5 = (X.C89804d3) r5
            X.1BI r2 = r5.A04
            boolean r0 = X.C22971Dz.A0d(r2)
            r1 = 0
            if (r0 == 0) goto L_0x06b2
            X.1PW r0 = r5.A02
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.24e r0 = r0.A02(r2)
            if (r0 == 0) goto L_0x06b2
            boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x06b2
            r1 = 1
        L_0x06b2:
            X.1KB r4 = r5.A01
            r0 = 35
            X.7RK r3 = new X.7RK
            r3.<init>((int) r0, (java.lang.Object) r5, (boolean) r1)
        L_0x06bb:
            r4.A0J(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C98784ri.run():void");
    }

    public C98784ri(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
