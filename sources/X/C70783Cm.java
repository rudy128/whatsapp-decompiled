package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3Cm  reason: invalid class name and case insensitive filesystem */
public class C70783Cm implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public C70783Cm(C35801mp r2, AnonymousClass5YR r3, String str) {
        this.A00 = 17;
        this.A02 = r2;
        this.A01 = 11231;
        this.A03 = r3;
        this.A04 = str;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.2He} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: X.2Ha} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v35, resolved type: X.2He} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v36, resolved type: X.2He} */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0379, code lost:
        r4.A0J(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x037c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03da, code lost:
        r0.CC7(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0110, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2.A06, 1991) != false) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x02fb, code lost:
        if (r2 != 4) goto L_0x02f3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r2 = r20
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0160;
                case 1: goto L_0x001d;
                case 2: goto L_0x01cb;
                case 3: goto L_0x01ea;
                case 4: goto L_0x0250;
                case 5: goto L_0x0260;
                case 6: goto L_0x00b7;
                case 7: goto L_0x0270;
                case 8: goto L_0x0285;
                case 9: goto L_0x02fe;
                case 10: goto L_0x0339;
                case 11: goto L_0x0357;
                case 12: goto L_0x037d;
                case 13: goto L_0x038f;
                case 14: goto L_0x03b7;
                case 15: goto L_0x03de;
                case 16: goto L_0x0452;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A02
            X.1mp r0 = (X.C35801mp) r0
            java.lang.Object r3 = r2.A03
            X.5YR r3 = (X.AnonymousClass5YR) r3
            java.lang.String r1 = r2.A04
            X.00H r0 = r0.A0D
            java.lang.Object r0 = r0.get()
            X.6o3 r0 = (X.C133026o3) r0
            r0.A00(r3, r1)
        L_0x001c:
            return
        L_0x001d:
            java.lang.Object r5 = r2.A02
            X.1Zk r5 = (X.C28221Zk) r5
            int r0 = r2.A01
            java.lang.Object r4 = r2.A03
            X.1bm r4 = (X.C29201bm) r4
            java.lang.String r3 = r2.A04
            if (r0 != 0) goto L_0x0499
            X.0ve r2 = r5.A0C
            r1 = 11825(0x2e31, float:1.657E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0061
            if (r3 == 0) goto L_0x001c
            X.5eT r1 = r5.A03
            if (r1 != 0) goto L_0x048d
            android.widget.ImageView r2 = r5.A0A
            android.content.Context r1 = r2.getContext()
            X.5eT r0 = new X.5eT
            r0.<init>(r1)
            r5.A03 = r0
            r0.setText(r3)
            X.5eT r0 = r5.A03
            r0.setAnchorView(r2)
            X.5eT r0 = r5.A03
            r0.setContentDescription(r3)
            X.5eT r1 = r5.A03
            X.7PC r0 = new X.7PC
            r0.<init>(r4)
            r1.A05 = r0
            return
        L_0x0061:
            if (r3 == 0) goto L_0x001c
            android.view.ViewStub r1 = r5.A08
            if (r1 == 0) goto L_0x001c
            android.widget.TextView r0 = r5.A02
            if (r0 != 0) goto L_0x00b0
            android.view.View r0 = r1.inflate()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A02 = r0
            r0.setText(r3)
            android.widget.TextView r0 = r5.A02
            r0.setContentDescription(r3)
            android.widget.TextView r3 = r5.A02
            X.0vb r2 = r5.A0B
            android.content.Context r1 = r3.getContext()
            r0 = 2131233097(0x7f080949, float:1.8082322E38)
            android.graphics.drawable.Drawable r1 = X.C24261Jm.A00(r1, r0)
            X.3cP r0 = new X.3cP
            r0.<init>(r1, r2)
            r3.setBackground(r0)
            android.widget.TextView r3 = r5.A02
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.view.animation.AlphaAnimation r2 = new android.view.animation.AlphaAnimation
            r2.<init>(r1, r0)
            r0 = 100
            r2.setDuration(r0)
            r3.startAnimation(r2)
            android.widget.TextView r2 = r5.A02
            r1 = 8
            X.78Q r0 = new X.78Q
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r4, (int) r1)
            r2.setOnClickListener(r0)
        L_0x00b0:
            android.widget.TextView r1 = r5.A02
            r0 = 0
            r1.setVisibility(r0)
            return
        L_0x00b7:
            java.lang.Object r10 = r2.A02
            X.2sp r10 = (X.C63292sp) r10
            java.lang.Object r11 = r2.A03
            X.6ii r11 = (X.C129996ii) r11
            int r13 = r2.A01
            java.lang.String r12 = r2.A04
            X.1A3 r0 = X.AnonymousClass1A3.A01
            X.C18070vi.A0b(r0)
            X.2RD r14 = X.AnonymousClass2RD.E2EE
            X.1To r4 = r10.A09
            X.1Te r2 = r4.A0A
            X.11P r0 = r2.A04
            long r8 = X.AnonymousClass11P.A01(r0)
            X.1Pw r7 = r2.A03
            android.content.SharedPreferences r1 = X.C25851Pw.A00(r7)
            java.lang.String r0 = "syncd_last_device_reg_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r8 = r8 - r0
            r5 = 600000(0x927c0, double:2.964394E-318)
            r3 = 1
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto L_0x00ec
            r1 = 1
        L_0x00ec:
            boolean r0 = r7.A08()
            if (r0 != 0) goto L_0x0112
            if (r1 == 0) goto L_0x0114
            boolean r0 = X.C26711Te.A00(r2)
            if (r0 == 0) goto L_0x0114
            X.1RK r0 = r2.A05
            java.util.ArrayList r0 = r0.A07()
            boolean r0 = X.C17880vN.A1X(r0)
            if (r0 != 0) goto L_0x0114
            X.0ve r2 = r2.A06
            r1 = 1991(0x7c7, float:2.79E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0114
        L_0x0112:
            monitor-enter(r4)
            goto L_0x0116
        L_0x0114:
            r3 = 0
            goto L_0x0112
        L_0x0116:
            boolean r0 = r4.A03     // Catch:{ all -> 0x04fd }
            if (r0 == 0) goto L_0x0123
            java.lang.String r0 = "sync-manager/shouldCleanUpSyncdOnPairing isSyncing = true"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04fd }
            monitor-exit(r4)     // Catch:{ all -> 0x04fd }
            goto L_0x049d
        L_0x0123:
            monitor-exit(r4)     // Catch:{ all -> 0x04fd }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "sync-manager/shouldCleanUpSyncdOnPairing shouldCleanUpSyncdOnPairing = "
            X.C17900vP.A0n(r0, r1, r3)
            if (r3 == 0) goto L_0x049d
            java.lang.String r0 = "CompanionDeviceQrHandler/handleSyncdDirty clean syncD before companion dereg"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.11P r0 = r10.A0B
            long r14 = X.AnonymousClass11P.A01(r0)
            X.1Tc r0 = r10.A08
            X.2yb r9 = new X.2yb
            r9.<init>(r10, r11, r12, r13, r14)
            r0.registerObserver(r9)
            X.1Te r2 = r10.A07
            X.1Pw r0 = r2.A03
            boolean r0 = r0.A08()
            r1 = 10
            if (r0 == 0) goto L_0x0152
            r1 = 1
        L_0x0152:
            boolean r0 = r2.A04()
            if (r0 != 0) goto L_0x001c
            r2.A01(r1)
            r0 = 1
            r2.A03(r0)
            return
        L_0x0160:
            java.lang.Object r3 = r2.A02
            X.5rM r3 = (X.C114615rM) r3
            java.lang.String r9 = r2.A04
            java.lang.Object r7 = r2.A03
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r11 = r2.A01
            X.00H r0 = r3.A02
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r0.get()
            X.1Le r0 = (X.C24661Le) r0
            int r15 = r0.A05()
            X.00H r0 = r3.A02
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r0.get()
            X.1Le r0 = (X.C24661Le) r0
            java.util.ArrayList r13 = r0.A0A()
            X.00H r0 = r3.A02
            if (r0 == 0) goto L_0x01c3
            java.lang.Object r0 = r0.get()
            X.1Le r0 = (X.C24661Le) r0
            java.util.ArrayList r14 = r0.A0B()
            r16 = 0
            X.77K r4 = new X.77K
            r18 = r16
            r19 = r16
            r12 = r4
            r17 = r16
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            X.0ve r2 = r3.A0E
            r1 = 7558(0x1d86, float:1.0591E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01be
            r12 = 52
            r5 = 0
            r10 = 2
            r8 = r5
            r6 = r5
            android.content.Intent r0 = X.AnonymousClass1LU.A0S(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x01ba:
            r3.startActivity(r0)
            return
        L_0x01be:
            android.content.Intent r0 = X.AnonymousClass1LU.A0T(r3, r4, r7, r9)
            goto L_0x01ba
        L_0x01c3:
            java.lang.String r0 = "statusStore"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x01cb:
            java.lang.Object r5 = r2.A02
            X.1vd r5 = (X.C40991vd) r5
            java.lang.String r4 = r2.A04
            java.lang.Object r1 = r2.A03
            X.1BI r1 = (X.AnonymousClass1BI) r1
            int r3 = r2.A01
            X.1vb r2 = r5.A00
            X.1Uq r0 = r2.A0J
            X.2mw r1 = r0.A02(r1, r4)
            X.1KB r4 = r2.A09
            r0 = 25
            X.Akb r2 = new X.Akb
            r2.<init>((java.lang.Object) r5, (int) r3, (int) r0, (java.lang.Object) r1)
            goto L_0x0379
        L_0x01ea:
            java.lang.Object r4 = r2.A02
            X.A7S r4 = (X.A7S) r4
            java.lang.Object r3 = r2.A03
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            java.lang.String r6 = r2.A04
            r5 = 6
            X.11S r0 = r4.A01
            boolean r2 = r0.A0O(r3)
            r1 = r2 ^ 1
            java.lang.String r0 = "update1to1CallLog call cannot be from self"
            X.C17960vV.A0G(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "update1to1CallLog getCallLog with key[jid="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; fromMe="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; callId="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "]"
            X.C17890vO.A1A(r1, r0)
            r0 = -1
            X.9Bw r3 = r4.A05(r3, r6, r0, r2)
            if (r3 != 0) goto L_0x0237
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "update1to1CallLog No call log found callId "
            X.C17900vP.A0g(r0, r6, r1)
            return
        L_0x0237:
            r3.A0E(r5)
            X.0ve r2 = r4.A0C
            r1 = 12680(0x3188, float:1.7768E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            X.1TD r0 = r4.A09
            if (r1 == 0) goto L_0x024c
            r0.A0B(r3)
            return
        L_0x024c:
            r0.A0A(r3)
            return
        L_0x0250:
            java.lang.Object r4 = r2.A02
            com.whatsapp.calling.service.VoiceServiceEventCallback r4 = (com.whatsapp.calling.service.VoiceServiceEventCallback) r4
            java.lang.Object r3 = r2.A03
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r1 = r2.A01
            java.lang.String r0 = r2.A04
            r4.m46lambda$showCallNotAllowedActivity$8$comwhatsappcallingserviceVoiceServiceEventCallback(r3, r1, r0)
            return
        L_0x0260:
            java.lang.Object r4 = r2.A02
            X.A7t r4 = (X.C20111A7t) r4
            java.lang.String r3 = r2.A04
            java.lang.Object r1 = r2.A03
            byte[] r1 = (byte[]) r1
            int r0 = r2.A01
            X.C20111A7t.A04(r4, r3, r1, r0)
            return
        L_0x0270:
            java.lang.Object r0 = r2.A02
            X.2yb r0 = (X.C66702yb) r0
            java.lang.Object r4 = r2.A03
            X.6ii r4 = (X.C129996ii) r4
            int r3 = r2.A01
            java.lang.String r1 = r2.A04
            X.2sp r0 = r0.A02
            X.C63292sp.A00(r0)
            r0.A03(r4, r1, r3)
            return
        L_0x0285:
            java.lang.Object r0 = r2.A02
            X.37K r0 = (X.AnonymousClass37K) r0
            int r7 = r2.A01
            java.lang.String r4 = r2.A04
            java.lang.Object r3 = r2.A03
            java.lang.Number r3 = (java.lang.Number) r3
            X.AnonymousClass37K.A00(r0)
            X.2tu r5 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SyncResponseHandler/onGlobalError request failed with global error code="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", text="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", backoffMs="
            X.C17900vP.A0X(r3, r0, r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            java.util.Map r1 = X.C63922tu.A0K
            boolean r0 = r1.containsKey(r2)
            r6 = 0
            if (r0 == 0) goto L_0x02d3
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x02ce
            int r0 = X.AnonymousClass000.A0M(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A06(r0, r6)
            return
        L_0x02ce:
            java.lang.IllegalStateException r0 = X.C17880vN.A0g()
            throw r0
        L_0x02d3:
            int r2 = r7 / 100
            r0 = 5
            if (r2 != r0) goto L_0x02f8
            r4 = 1
            X.1NV r0 = r5.A0I
            java.lang.Long r6 = r0.A01()
            if (r3 == 0) goto L_0x02f3
            if (r6 == 0) goto L_0x02f3
            long r2 = r3.longValue()
            long r0 = r6.longValue()
            long r0 = java.lang.Math.max(r2, r0)
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
        L_0x02f3:
            r1 = 0
        L_0x02f4:
            X.C63922tu.A01(r5, r6, r4, r1)
            return
        L_0x02f8:
            r4 = 0
            r0 = 4
            r1 = 1
            if (r2 == r0) goto L_0x02f4
            goto L_0x02f3
        L_0x02fe:
            java.lang.Object r6 = r2.A02
            com.whatsapp.contact.picker.ContactPickerFragment r6 = (com.whatsapp.contact.picker.ContactPickerFragment) r6
            java.lang.String r5 = r2.A04
            int r4 = r2.A01
            java.lang.Object r2 = r2.A03
            android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2
            android.content.Context r0 = r6.A1n()
            X.3Rj r3 = X.AnonymousClass4a6.A00(r0)
            android.content.Context r1 = r6.A1n()
            X.1KW r0 = r6.A1T
            java.lang.CharSequence r0 = X.C43251zV.A05(r1, r0, r5)
            r3.A0k(r0)
            r0 = 2131892634(0x7f12199a, float:1.9420022E38)
            r3.A0D(r0)
            r3.A0Z(r2, r4)
            r2 = 2131898766(0x7f12318e, float:1.943246E38)
            r1 = 15
            X.74r r0 = new X.74r
            r0.<init>(r1)
            r3.A0X(r0, r2)
            r3.A0C()
            return
        L_0x0339:
            java.lang.Object r0 = r2.A02
            X.73j r0 = (X.C1408673j) r0
            java.lang.String r4 = r2.A04
            java.lang.Object r3 = r2.A03
            com.whatsapp.voipcalling.CallInfo r3 = (com.whatsapp.voipcalling.CallInfo) r3
            int r7 = r2.A01
            java.util.UUID r5 = java.util.UUID.randomUUID()
            X.C18070vi.A0X(r5)
            r6 = 16
            r8 = 1
            X.6to r2 = new X.6to
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0.A00 = r2
            return
        L_0x0357:
            java.lang.String r4 = r2.A04
            java.lang.Object r1 = r2.A02
            android.content.res.Resources r1 = (android.content.res.Resources) r1
            java.lang.Object r3 = r2.A03
            X.6t1 r3 = (X.C135946t1) r3
            int r2 = r2.A01
            X.C18070vi.A0b(r1)
            X.1KW r0 = r3.A01
            android.graphics.drawable.Drawable r1 = X.AnonymousClass72Y.A00(r1, r0, r4)
            r0 = 0
            r1.setBounds(r0, r0, r2, r2)
            X.1KB r4 = r3.A00
            r0 = 47
            X.3Ch r2 = new X.3Ch
            r2.<init>(r3, r1, r0)
        L_0x0379:
            r4.A0J(r2)
            return
        L_0x037d:
            java.lang.Object r4 = r2.A02
            X.5Zz r4 = (X.C107515Zz) r4
            java.lang.String r3 = r2.A04
            int r1 = r2.A01
            java.lang.Object r0 = r2.A03
            X.41t r0 = (X.C820341t) r0
            boolean r0 = r0.A01
            r4.Bwi(r1, r3, r0)
            return
        L_0x038f:
            int r0 = r2.A01
            java.lang.String r4 = r2.A04
            java.lang.Object r3 = r2.A02
            X.1BI r3 = (X.AnonymousClass1BI) r3
            java.lang.Object r1 = r2.A03
            X.2ps r1 = (X.C61552ps) r1
            X.2Ha r2 = new X.2Ha
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            r2.A01 = r4
            if (r3 == 0) goto L_0x03b5
            X.11S r0 = r1.A00
            java.lang.String r0 = X.C50202Tn.A00(r0, r3)
        L_0x03b0:
            r2.A02 = r0
            X.18K r0 = r1.A01
            goto L_0x03da
        L_0x03b5:
            r0 = 0
            goto L_0x03b0
        L_0x03b7:
            int r0 = r2.A01
            java.lang.String r4 = r2.A04
            java.lang.Object r3 = r2.A02
            X.2pt r3 = (X.C61562pt) r3
            java.lang.Object r1 = r2.A03
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.2He r2 = new X.2He
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A00 = r0
            r2.A02 = r4
            X.11S r0 = r3.A00
            java.lang.String r0 = X.C50202Tn.A00(r0, r1)
            r2.A01 = r0
            X.18K r0 = r3.A01
        L_0x03da:
            r0.CC7(r2)
            return
        L_0x03de:
            java.lang.Object r4 = r2.A02
            X.6Fy r4 = (X.C120866Fy) r4
            java.lang.String r7 = r2.A04
            int r3 = r2.A01
            java.lang.Object r2 = r2.A03
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r8 = r4.A04
            r1.append(r8)
            java.lang.String r6 = "/"
            r1.append(r6)
            r1.append(r7)
            java.lang.String r0 = "; async task started, start_id="
            X.C17900vP.A0j(r0, r1, r3)
            r2.run()     // Catch:{ Exception -> 0x0404 }
            goto L_0x0424
        L_0x0404:
            r5 = move-exception
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r8, r6, r7)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "; async task failed, start_id="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r3)     // Catch:{ all -> 0x043f }
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x043f }
            X.190 r2 = r4.A00     // Catch:{ all -> 0x043f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r7)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass001.A1E(r5, r0, r1)     // Catch:{ all -> 0x043f }
            java.lang.String r0 = "xpm-export-service-error"
            r2.A0E(r0, r1, r5)     // Catch:{ all -> 0x043f }
        L_0x0424:
            monitor-enter(r4)
            X.EDz r1 = r4.A03     // Catch:{ all -> 0x043c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x043c }
            r1.remove(r0)     // Catch:{ all -> 0x043c }
            X.C120866Fy.A01(r4)     // Catch:{ all -> 0x043c }
            monitor-exit(r4)     // Catch:{ all -> 0x043c }
            java.lang.StringBuilder r1 = X.C17900vP.A0H(r8, r6, r7)
            java.lang.String r0 = "; async task completed, start_id="
            X.C17900vP.A0j(r0, r1, r3)
            return
        L_0x043c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x043c }
            throw r0
        L_0x043f:
            r2 = move-exception
            monitor-enter(r4)
            X.EDz r1 = r4.A03     // Catch:{ all -> 0x044f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x044f }
            r1.remove(r0)     // Catch:{ all -> 0x044f }
            X.C120866Fy.A01(r4)     // Catch:{ all -> 0x044f }
            monitor-exit(r4)     // Catch:{ all -> 0x044f }
            throw r2
        L_0x044f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x044f }
            throw r0
        L_0x0452:
            java.lang.Object r5 = r2.A02
            X.A19 r5 = (X.A19) r5
            java.lang.Object r4 = r2.A03
            X.206 r4 = (X.AnonymousClass206) r4
            int r1 = r2.A01
            java.lang.String r3 = r2.A04
            X.9za r0 = r5.A01
            X.8ri r2 = r0.A01(r4, r1)
            org.json.JSONObject r1 = X.C17880vN.A15()
            java.lang.String r0 = "cta"
            r1.put(r0, r3)     // Catch:{ JSONException -> 0x046e }
            goto L_0x0473
        L_0x046e:
            java.lang.String r0 = "MessageWithLinkLogging/getEventAttributes failed to construct message class attributes"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0473:
            java.lang.String r0 = r1.toString()
            r2.A07 = r0
            boolean r0 = r4 instanceof X.C439521o
            if (r0 == 0) goto L_0x048b
            X.21o r4 = (X.C439521o) r4
            X.2k6 r0 = r4.A00
            java.lang.String r0 = r0.A05
        L_0x0483:
            r2.A08 = r0
            X.18K r0 = r5.A00
            r0.CC4(r2)
            return
        L_0x048b:
            r0 = 0
            goto L_0x0483
        L_0x048d:
            r0 = 0
            r1.setAnchorView(r0)
            X.5eT r1 = r5.A03
            android.widget.ImageView r0 = r5.A0A
            r1.setAnchorView(r0)
            return
        L_0x0499:
            r5.A06(r4)
            return
        L_0x049d:
            X.1U3 r3 = r10.A03
            monitor-enter(r3)
            X.0z4 r5 = r3.A01     // Catch:{ all -> 0x04fa }
            int r4 = r5.A03()     // Catch:{ all -> 0x04fa }
            int r1 = r5.A02()     // Catch:{ all -> 0x04fa }
            if (r4 <= 0) goto L_0x04e2
            if (r1 <= 0) goto L_0x04e2
            X.1RK r0 = r3.A02     // Catch:{ all -> 0x04fa }
            java.util.ArrayList r0 = r0.A07()     // Catch:{ all -> 0x04fa }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04fa }
            r2 = 1
            if (r0 != 0) goto L_0x04ca
            int r0 = r1 + 1
            if (r0 > 0) goto L_0x04c8
            java.lang.String r0 = "CompanionDeviceAdvUtil/incrementCurrentKeyIndex index overflow"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04fa }
            r3.A04()     // Catch:{ all -> 0x04fa }
            goto L_0x04ca
        L_0x04c8:
            r2 = r0
            goto L_0x04cf
        L_0x04ca:
            int r4 = r4 + 1
            if (r4 > 0) goto L_0x04cf
            r4 = 1
        L_0x04cf:
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = "adv_raw_id"
            X.C17880vN.A1C(r1, r0, r4)     // Catch:{ all -> 0x04fa }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r5)     // Catch:{ all -> 0x04fa }
            java.lang.String r0 = "adv_current_key_index"
            X.C17880vN.A1C(r1, r0, r2)     // Catch:{ all -> 0x04fa }
            goto L_0x04ed
        L_0x04e2:
            java.lang.String r0 = "CompanionDeviceAdvUtil/incrementCurrentKeyIndex empty id and index"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04fa }
            r3.A04()     // Catch:{ all -> 0x04fa }
            r3.A05()     // Catch:{ all -> 0x04fa }
        L_0x04ed:
            monitor-exit(r3)
            long r15 = r3.A01()
            r17 = 0
            r12 = r10
            r13 = r11
            X.C63292sp.A01(r12, r13, r14, r15, r17)
            return
        L_0x04fa:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x04fd:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04fd }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70783Cm.run():void");
    }

    public C70783Cm(Object obj, Object obj2, String str, int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
        this.A04 = str;
        this.A02 = obj;
        this.A03 = obj2;
    }

    public C70783Cm(A7S a7s, UserJid userJid, String str) {
        this.A00 = 3;
        this.A02 = a7s;
        this.A03 = userJid;
        this.A04 = str;
        this.A01 = 6;
    }
}
