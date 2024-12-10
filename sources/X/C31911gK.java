package X;

import android.os.Message;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1gK  reason: invalid class name and case insensitive filesystem */
public abstract class C31911gK implements AnonymousClass1RJ {
    public Jid A00;
    public Jid A01;
    public Runnable A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass1OZ A04;
    public final AnonymousClass1N7 A05;
    public final C200710s A06;
    public final AnonymousClass10I A07;
    public final Map A08 = new LinkedHashMap();
    public final Set A09 = new LinkedHashSet();
    public final AtomicReference A0A = new AtomicReference();
    public final int[] A0B;

    public C31911gK(AnonymousClass190 r3, AnonymousClass1OZ r4, AnonymousClass1N7 r5, AnonymousClass10I r6, int[] iArr, boolean z) {
        C200710s r0;
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        this.A03 = r3;
        this.A07 = r6;
        this.A04 = r4;
        this.A05 = r5;
        this.A0B = iArr;
        if (z) {
            r0 = new C200710s(r6, false);
        } else {
            r0 = null;
        }
        this.A06 = r0;
    }

    public boolean BcT(Message message, int i) {
        Message message2 = message;
        C18070vi.A0d(message2, 1);
        int i2 = i;
        if (!C200410p.A0V(this.A0B, i2)) {
            return false;
        }
        Object obj = message2.obj;
        C18070vi.A0z(obj, "null cannot be cast to non-null type com.whatsapp.protocol.ProtocolTreeNode");
        C17960vV.A07(obj);
        C18070vi.A0X(obj);
        C29621ca r11 = (C29621ca) obj;
        try {
            long j = message2.getData().getLong("loggableStanzaId");
            Class<Jid> cls = Jid.class;
            Jid A0F = r11.A0F(cls, "from");
            String A0P = r11.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            Jid A0F2 = r11.A0F(cls, "participant");
            String A0Q = r11.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
            C58762lD r4 = new C58762lD();
            r4.A02 = A0F;
            r4.A06 = "notification";
            r4.A08 = A0P;
            r4.A09 = A0Q;
            r4.A01 = A0F2;
            r4.A00 = j;
            new C21365Aiu(this, r11, r4.A00(), i2, 36).run();
            return true;
        } catch (AnonymousClass1UI e) {
            StringBuilder sb = new StringBuilder();
            sb.append("BaseNotificationHandler/handleXmppMessage/corrupt-stream-error/invalid stanza=");
            sb.append(r11);
            Log.e(sb.toString(), e);
            AnonymousClass190 r2 = this.A03;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("source=BaseNotificationHandler stanzaKey generation fails, msg=");
            sb2.append(e.getMessage());
            r2.A0G("CorruptStreamException", sb2.toString(), false);
            return true;
        }
    }

    public static final void A00(C31911gK r7, C29621ca r8, C60132nR r9, int i) {
        AtomicReference atomicReference = r7.A0A;
        Object andSet = atomicReference.getAndSet(r9);
        String A0Q = r8.A0Q("offline", (String) null);
        if (andSet != null) {
            AnonymousClass190 r5 = r7.A03;
            StringBuilder sb = new StringBuilder();
            sb.append("oldStanzaKey=");
            sb.append(andSet);
            sb.append("; type=");
            sb.append(r7.A0B);
            sb.append("; offline=");
            sb.append(A0Q);
            r5.A0G("BaseNotificationHandler/oldStanzaKeyNotNull", sb.toString(), false);
        }
        r7.A01 = r9.A02;
        r7.A00 = r9.A01;
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("BaseNotificationHandler/handleAndAckNotification handlerType=");
            sb2.append(i);
            sb2.append(" id=");
            sb2.append(r8.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) null));
            sb2.append(" type=");
            sb2.append(r8.A0Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null));
            sb2.append(" t=");
            sb2.append(r8.A0Q("t", (String) null));
            sb2.append(" retry=");
            sb2.append(r8.A0Q("retry", (String) null));
            sb2.append(" offline=");
            sb2.append(A0Q);
            Log.i(sb2.toString());
            r7.A05(r8, i);
        } catch (AnonymousClass1UI e) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("BaseNotificationHandler/handleAndAckNotification/corrupt-stream-error/stanza ");
            sb3.append(e.stanza);
            sb3.append(" node=");
            sb3.append(r8);
            Log.w(sb3.toString(), e);
            AnonymousClass190 r2 = r7.A03;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("source=BaseNotificationHandler recvType=");
            sb4.append(i);
            sb4.append(" message=");
            sb4.append(e.getMessage());
            r2.A0G("CorruptStreamException", sb4.toString(), false);
        }
        C60132nR r22 = (C60132nR) atomicReference.getAndSet((Object) null);
        if (r22 != null && !r7.A09.contains(r22)) {
            r7.A04.A0K(r22);
            r7.A08.remove(r22.A08);
        }
    }

    public final C62502rV A04(boolean z) {
        C60132nR r3;
        if (z) {
            Object andSet = this.A0A.getAndSet((Object) null);
            C17960vV.A07(andSet);
            C18070vi.A0X(andSet);
            r3 = (C60132nR) andSet;
            Set set = this.A09;
            synchronized (set) {
                set.add(r3);
                Runnable runnable = this.A02;
                if (runnable != null) {
                    AnonymousClass10I r0 = this.A07;
                    C17960vV.A07(runnable);
                    r0.CEz(runnable);
                }
                AnonymousClass10I r5 = this.A07;
                StringBuilder sb = new StringBuilder();
                sb.append("delay_ack_BaseNotificationHandler/");
                int[] iArr = this.A0B;
                C18070vi.A0d(iArr, 0);
                int i = iArr[0];
                if (Integer.valueOf(i) == null) {
                    i = -1;
                }
                sb.append(i);
                sb.toString();
                this.A02 = r5.CGv(new C70583Br(this, 33), 6000);
            }
        } else {
            r3 = (C60132nR) this.A0A.get();
        }
        C53552ci r1 = null;
        if (r3 == null) {
            return null;
        }
        if (z) {
            r1 = new C53552ci(this, r3);
        }
        return new C62502rV(r1, r3);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r0v42, types: [X.72G, androidx.core.app.NotificationCompat$BigTextStyle] */
    /* JADX WARNING: type inference failed for: r3v30, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r6v10, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r6v13, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x075c, code lost:
        if ("true".equals(r4.A0P("from_me")) == false) goto L_0x075e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a75, code lost:
        if (r1 != null) goto L_0x0a77;
     */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x07a6  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0a89  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0ab9  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0ad6 A[LOOP:9: B:375:0x0ad0->B:377:0x0ad6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:569:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C29621ca r30, int r31) {
        /*
            r29 = this;
            r0 = r29
            boolean r2 = r0 instanceof X.C36151nQ
            r1 = r30
            r3 = r31
            if (r2 == 0) goto L_0x00e3
            X.1nQ r0 = (X.C36151nQ) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 236(0xec, float:3.31E-43)
            if (r3 != r2) goto L_0x0069
            r2 = 0
            X.1ca r4 = r1.A0J(r2)
            if (r4 == 0) goto L_0x0069
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r3 = r1.A0F(r3, r2)
            java.lang.String r2 = "set"
            boolean r2 = X.C29621ca.A07(r4, r2)
            if (r2 == 0) goto L_0x00b7
            java.lang.String r2 = "hash"
            r5 = 0
            java.lang.String r2 = r4.A0Q(r2, r5)
            if (r2 == 0) goto L_0x006a
            X.2qq r4 = X.C62132qq.A0O
            X.C18070vi.A0Z(r4)
            int r1 = r2.length()
            if (r1 == 0) goto L_0x0069
            java.nio.charset.Charset r1 = X.C26571Sq.A05
            byte[] r2 = r2.getBytes(r1)
            X.C18070vi.A0X(r2)
            r1 = 0
            byte[] r3 = android.util.Base64.decode(r2, r1)
            java.util.Arrays.toString(r3)
            X.2R1 r2 = X.AnonymousClass2R1.A0L
            X.2sh r1 = new X.2sh
            r1.<init>(r2, r5)
            r2 = 1
            r1.A03 = r2
            r1.A00 = r4
            r1.A03(r3)
            X.2re r1 = r1.A02()
            X.12E r0 = r0.A01
            X.AnonymousClass12E.A00(r0, r1, r2)
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r6 = r4.A0M()
            java.lang.String r2 = "t"
            java.lang.String r2 = r1.A0Q(r2, r5)
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A01(r3)
            if (r2 == 0) goto L_0x0069
            if (r5 == 0) goto L_0x0069
            long r3 = java.lang.Long.parseLong(r2)
            r1 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.add(r5)
            boolean r1 = X.C22971Dz.A0T(r5)
            if (r1 == 0) goto L_0x00a1
            X.1Ln r1 = r0.A02
            X.1E1 r5 = (X.AnonymousClass1E1) r5
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0D(r5)
            if (r1 == 0) goto L_0x00a1
            r2.add(r1)
        L_0x00a1:
            java.util.Iterator r5 = r2.iterator()
        L_0x00a5:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0069
            java.lang.Object r2 = r5.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.1M9 r1 = r0.A00
            r1.A0j(r2, r6, r3)
            goto L_0x00a5
        L_0x00b7:
            java.lang.String r1 = "delete"
            boolean r1 = X.C29621ca.A07(r4, r1)
            if (r1 == 0) goto L_0x0069
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r5 = X.C22941Dw.A01(r3)
            if (r5 == 0) goto L_0x0069
            X.1M9 r4 = r0.A00
            X.1M2 r3 = r4.A04
            r1 = 0
            r0 = 0
            r3.A0V(r5, r0, r1)
            X.1MA r0 = r4.A03
            r0.A0C(r5)
            X.11A r2 = r4.A0I
            r1 = 16
            X.3Bv r0 = new X.3Bv
            r0.<init>(r4, r5, r1)
            r2.A00(r0)
            return
        L_0x00e3:
            boolean r2 = r0 instanceof X.C32001gT
            if (r2 == 0) goto L_0x0158
            X.1gT r0 = (X.C32001gT) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 238(0xee, float:3.34E-43)
            if (r3 != r2) goto L_0x0069
            r2 = 0
            X.1ca r6 = r1.A0J(r2)
            if (r6 == 0) goto L_0x0069
            java.lang.String r3 = "creation"
            r1 = 0
            long r10 = r6.A0D(r3, r1)
            r7 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r7
            byte[] r9 = r6.A01
            X.11P r1 = r0.A01
            long r2 = X.AnonymousClass11P.A01(r1)
            r4 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r2 = r2 + r4
            long r2 = r2 / r7
            java.lang.String r1 = "expiration"
            long r12 = r6.A0D(r1, r2)
            long r12 = r12 * r7
            java.lang.String r2 = "report_type"
            r1 = 0
            java.lang.String r2 = r6.A0Q(r2, r1)
            if (r2 == 0) goto L_0x0155
            java.lang.String r1 = "newsletters"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0155
            X.00H r1 = r0.A04
        L_0x012c:
            java.lang.Object r8 = r1.get()
            X.C18070vi.A0X(r8)
            X.7Fd r8 = (X.C143877Fd) r8
            if (r9 == 0) goto L_0x013a
            r8.A0H(r9, r10, r12)
        L_0x013a:
            X.1KB r4 = r0.A00
            X.1FR r1 = r4.A00
            boolean r1 = r1 instanceof X.C72403Lu
            if (r1 != 0) goto L_0x0145
            r8.A08()
        L_0x0145:
            X.21i r3 = r8.A05()
            if (r3 == 0) goto L_0x0069
            r2 = 2
            X.7Pl r1 = new X.7Pl
            r1.<init>(r0, r3, r2)
            r4.A0J(r1)
            return
        L_0x0155:
            X.00H r1 = r0.A03
            goto L_0x012c
        L_0x0158:
            boolean r2 = r0 instanceof X.C33891jY
            if (r2 == 0) goto L_0x0258
            X.1jY r0 = (X.C33891jY) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 251(0xfb, float:3.52E-43)
            if (r3 != r2) goto L_0x0069
            X.1ca r5 = r1.A0I()
            X.C18070vi.A0X(r5)
            java.lang.String r1 = "device_logout"
            boolean r1 = X.C29621ca.A07(r5, r1)
            if (r1 == 0) goto L_0x01b6
            java.lang.String r2 = "t"
            java.lang.String r1 = r5.A0P(r2)
            long r2 = r5.A0E(r1, r2)
            r6 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r6
            java.lang.String r1 = "id"
            java.lang.String r7 = r5.A0P(r1)
            java.lang.String r4 = "device"
            r1 = 0
            java.lang.String r6 = r5.A0Q(r4, r1)
            int r1 = r7.length()
            if (r1 == 0) goto L_0x0b3d
            X.2lz r4 = new X.2lz
            r4.<init>(r2, r6, r7)
            X.1jT r3 = r0.A02
            X.0ve r2 = r3.A0G
            r1 = 2466(0x9a2, float:3.456E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0069
            X.1KB r2 = r3.A04
            r1 = 30
            X.7Pk r0 = new X.7Pk
            r0.<init>(r3, r4, r1)
            r2.CGP(r0)
            return
        L_0x01b6:
            java.lang.String r1 = "wa_old_registration"
            boolean r1 = X.C29621ca.A07(r5, r1)
            if (r1 == 0) goto L_0x0b56
            java.lang.String r2 = "code"
            r1 = 0
            java.lang.String r7 = r5.A0Q(r2, r1)
            java.lang.String r2 = "expiry_t"
            r1 = 0
            int r1 = r5.A0A(r2, r1)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = (long) r1
            long r3 = r3.toMillis(r1)
            X.0z4 r6 = r0.A01
            java.lang.String r1 = r6.A0j()
            byte[] r2 = X.A9B.A0Y(r1)
            r1 = 11
            java.lang.String r10 = android.util.Base64.encodeToString(r2, r1)
            if (r10 == 0) goto L_0x022c
            if (r7 == 0) goto L_0x022c
            X.11P r1 = r0.A00
            long r8 = X.AnonymousClass11P.A01(r1)
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x022c
            java.lang.String r2 = "device_id"
            java.lang.String r1 = ""
            java.lang.String r1 = r5.A0Q(r2, r1)
            boolean r1 = r10.equals(r1)
            if (r1 != 0) goto L_0x022c
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r6)
            java.lang.String r1 = "device_switching_code"
            android.content.SharedPreferences$Editor r1 = r2.putString(r1, r7)
            r1.apply()
            android.content.SharedPreferences$Editor r2 = X.C19830z4.A00(r6)
            java.lang.String r1 = "device_switching_code_expiry"
            android.content.SharedPreferences$Editor r1 = r2.putLong(r1, r3)
            r1.apply()
            X.1jT r5 = r0.A02
            X.118 r1 = r5.A0A
            android.content.Context r4 = r1.A00
            X.1KB r3 = r5.A04
            r2 = 13
            X.7Qz r1 = new X.7Qz
            r1.<init>(r5, r4, r7, r2)
            r3.CGP(r1)
        L_0x022c:
            r1 = 1
            X.2rV r3 = r0.A04(r1)
            java.lang.String r0 = r6.A0j()
            byte[] r1 = X.A9B.A0Y(r0)
            r0 = 11
            java.lang.String r2 = android.util.Base64.encodeToString(r1, r0)
            if (r3 == 0) goto L_0x0069
            if (r2 != 0) goto L_0x0245
            java.lang.String r2 = ""
        L_0x0245:
            java.lang.String r1 = "device_id"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (java.lang.String) r2)
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.C18070vi.A0X(r1)
            r0 = 0
            X.C62502rV.A00(r0, r3, r1)
            return
        L_0x0258:
            boolean r2 = r0 instanceof X.C35571mS
            if (r2 == 0) goto L_0x0303
            X.1mS r0 = (X.C35571mS) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 235(0xeb, float:3.3E-43)
            if (r3 != r2) goto L_0x0069
            r2 = 0
            X.1ca r3 = r1.A0J(r2)
            if (r3 == 0) goto L_0x0069
            java.lang.String r1 = "log"
            boolean r1 = X.C29621ca.A07(r3, r1)
            if (r1 == 0) goto L_0x02a4
            X.1mQ r3 = r0.A03
            r3.A06()
            X.118 r1 = r0.A00
            android.content.Context r4 = r1.A00
            r5 = 0
            java.lang.String r7 = ""
            r2 = 1
            java.lang.String r10 = "NotCalculated"
            r15 = -1
            r20 = 0
            r8 = r5
            r9 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r6 = r5
            r17 = r15
            r19 = r2
            r21 = r20
            java.lang.String r1 = r3.A04(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r17, r19, r20, r21)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.190 r1 = r0.A03
            java.lang.String r0 = "AppMessagingXmppHandler/onLogNotification"
            r1.A0G(r0, r5, r2)
            return
        L_0x02a4:
            java.lang.String r1 = "props"
            boolean r1 = X.C29621ca.A07(r3, r1)
            if (r1 == 0) goto L_0x02b3
            X.1Mn r1 = r0.A02
            r0 = 1
            r1.A04(r0)
            return
        L_0x02b3:
            java.lang.String r1 = "abprops"
            boolean r1 = X.C29621ca.A07(r3, r1)
            if (r1 == 0) goto L_0x02d6
            X.1mR r2 = r0.A01
            r1 = 1
            X.1Hc r0 = r2.A00
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0069
            java.lang.String r0 = "sendmethods/sendGetABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0vp r0 = r2.A01
            java.lang.Object r0 = r0.get()
            X.2jv r0 = (X.C57962jv) r0
            r0.A00(r1)
            return
        L_0x02d6:
            java.lang.String r1 = "push-config"
            boolean r1 = X.C29621ca.A07(r3, r1)
            if (r1 == 0) goto L_0x0069
            java.lang.String r2 = "type"
            r1 = 0
            java.lang.String r2 = r3.A0Q(r2, r1)
            if (r2 == 0) goto L_0x0b64
            java.lang.String r1 = "gcm"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x0b64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "push-config notification: unknown type "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            goto L_0x088a
        L_0x0303:
            boolean r2 = r0 instanceof X.C35581mT
            if (r2 == 0) goto L_0x033d
            X.1mT r0 = (X.C35581mT) r0
            r2 = 0
            X.1ca r5 = r1.A0J(r2)
            if (r5 == 0) goto L_0x0069
            java.lang.String r2 = "count"
            boolean r2 = X.C29621ca.A07(r5, r2)
            if (r2 == 0) goto L_0x03ea
            java.lang.String r2 = "value"
            java.lang.String r1 = r5.A0P(r2)
            int r5 = r5.A0B(r1, r2)
            r1 = 1
            X.2rV r4 = r0.A04(r1)
            X.1P3 r1 = r0.A03
            boolean r1 = r1.A0Y()
            if (r1 == 0) goto L_0x0b83
            X.10I r3 = r0.A07
            r1 = 33
            X.3Cu r2 = new X.3Cu
            r2.<init>(r0, r5, r1, r4)
        L_0x0339:
            r3.CGF(r2)
            return
        L_0x033d:
            boolean r2 = r0 instanceof X.C33881jX
            if (r2 == 0) goto L_0x03b7
            X.1jX r0 = (X.C33881jX) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 234(0xea, float:3.28E-43)
            if (r3 != r2) goto L_0x0069
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            java.lang.String r2 = "tokens"
            X.1ca r3 = r1.A0L(r2)
            java.lang.String r2 = "token"
            java.util.List r2 = r3.A0R(r2)
            X.C18070vi.A0X(r2)
            java.util.Iterator r9 = r2.iterator()
        L_0x0365:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0470
            java.lang.Object r8 = r9.next()
            X.1ca r8 = (X.C29621ca) r8
            java.lang.String r2 = "type"
            java.lang.String r4 = r8.A0P(r2)
            int r3 = r4.hashCode()
            r2 = 1266415832(0x4b7bf8d8, float:1.651324E7)
            if (r3 != r2) goto L_0x0365
            java.lang.String r2 = "trusted_contact"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0365
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r6 = r1.A0F(r3, r2)
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            if (r6 == 0) goto L_0x0365
            byte[] r5 = r8.A01
            if (r5 == 0) goto L_0x0b96
            java.lang.String r4 = "t"
            java.lang.String r2 = r1.A0P(r4)
            long r2 = r1.A0E(r2, r4)
            long r3 = r8.A0D(r4, r2)
            X.1Mx r2 = r0.A01
            java.lang.Integer r3 = r2.A07(r6, r5, r3)
            java.lang.Integer r2 = X.AnonymousClass00R.A0C
            if (r3 == r2) goto L_0x0365
            r7.add(r6)
            goto L_0x0365
        L_0x03b7:
            boolean r2 = r0 instanceof X.C33961jf
            if (r2 == 0) goto L_0x048b
            X.1jf r0 = (X.C33961jf) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            java.lang.String r2 = "update"
            X.1ca r3 = r1.A0L(r2)
            java.lang.String r2 = "hash"
            java.lang.String r5 = r3.A0P(r2)
            java.lang.String r3 = "offline"
            r2 = 0
            java.lang.String r1 = r1.A0Q(r3, r2)
            if (r1 != 0) goto L_0x0b9e
            X.1Hc r1 = r0.A00
            boolean r1 = r1.A01()
            if (r1 != 0) goto L_0x0b9e
            X.10I r3 = r0.A03
            r1 = 38
            X.7Qs r2 = new X.7Qs
            r2.<init>(r1, r5, r0)
            goto L_0x0339
        L_0x03ea:
            java.lang.String r2 = "identity"
            boolean r2 = X.C29621ca.A07(r5, r2)
            if (r2 == 0) goto L_0x0456
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r9 = r1.A0F(r10, r2)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            if (r9 == 0) goto L_0x043e
            r8 = 0
            r7 = 0
            r6 = 0
            java.lang.String r3 = "type"
            java.lang.String r2 = ""
            java.lang.String r4 = r1.A0Q(r3, r2)
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            java.lang.String r2 = "lid"
            com.whatsapp.jid.Jid r2 = r1.A0F(r10, r2)
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            if (r2 == 0) goto L_0x0419
            r7 = r2
        L_0x0419:
            java.lang.String r2 = "display_name"
            java.lang.String r2 = r1.A0Q(r2, r8)
            boolean r1 = X.AnonymousClass1EG.A0H(r2)
            if (r1 != 0) goto L_0x0429
            X.C18070vi.A0d(r2, r3)
            r8 = r2
        L_0x0429:
            X.2nJ r3 = X.C61202pI.A00(r9, r7, r6, r8, r4)
            X.00H r1 = r0.A08
            java.lang.Object r2 = r1.get()
            X.1fv r2 = (X.C31661fv) r2
            com.whatsapp.jid.UserJid r1 = r3.A02
            java.util.Map r1 = java.util.Collections.singletonMap(r1, r3)
            r2.A02(r1)
        L_0x043e:
            com.whatsapp.jid.Jid r2 = r0.A01
            X.1E0 r1 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r4 = r1.A02(r2)
            X.C17960vV.A07(r4)
            X.1ks r3 = r0.A06
            r2 = 14
            X.3C5 r1 = new X.3C5
            r1.<init>(r0, r5, r4, r2)
            r3.A00(r1)
            return
        L_0x0456:
            java.lang.String r1 = "digest"
            boolean r1 = X.C29621ca.A07(r5, r1)
            if (r1 == 0) goto L_0x0069
            java.lang.String r1 = "server asked us to run an e2e key digest check"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0z4 r2 = r0.A02
            r1 = 1
            r2.A2A(r1)
            X.120 r0 = r0.A00
            r0.A06()
            return
        L_0x0470:
            java.util.Iterator r5 = r7.iterator()
        L_0x0474:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0069
            java.lang.Object r4 = r5.next()
            X.1KB r3 = r0.A00
            r2 = 30
            X.Ak0 r1 = new X.Ak0
            r1.<init>(r0, r4, r2)
            r3.A0J(r1)
            goto L_0x0474
        L_0x048b:
            boolean r2 = r0 instanceof X.C33871jW
            if (r2 == 0) goto L_0x04b5
            X.1jW r0 = (X.C33871jW) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            java.lang.String r2 = "add"
            X.1ca r7 = r1.A0K(r2)
            java.lang.String r2 = "remove"
            X.1ca r6 = r1.A0K(r2)
            r4 = r7
            if (r7 != 0) goto L_0x0bd3
            r4 = r6
            if (r6 != 0) goto L_0x0bd3
            java.lang.String r0 = "DeviceUpdateNotificationHandler/handleXmppMessage/unknown type of device notification."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "unknown device notification not found"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x04b5:
            boolean r2 = r0 instanceof X.C33601j5
            if (r2 == 0) goto L_0x0626
            X.1j5 r0 = (X.C33601j5) r0
            r9 = 1
            X.C18070vi.A0d(r1, r9)
            r2 = 256(0x100, float:3.59E-43)
            if (r3 != r2) goto L_0x0069
            X.1ca r2 = r1.A0I()
            java.lang.String r4 = r2.A00
            int r3 = r4.hashCode()
            r2 = -399537033(0xffffffffe82f8c77, float:-3.316021E24)
            if (r3 == r2) goto L_0x05b1
            r2 = -48889673(0xfffffffffd1600b7, float:-1.2461744E37)
            if (r3 != r2) goto L_0x0cb5
            java.lang.String r8 = "message_delivery_updates"
            boolean r2 = r4.equals(r8)
            if (r2 == 0) goto L_0x0cb5
            java.lang.String r2 = "notification"
            X.C29621ca.A04(r1, r2)
            X.2rm r6 = new X.2rm
            r6.<init>()
            X.A96 r7 = X.A96.A00
            r3 = 26
            X.AhV r2 = new X.AhV
            r2.<init>(r7, r3)
            r3 = 0
            java.lang.Object r5 = r2.BCF(r1, r6)
            X.9DI r5 = (X.AnonymousClass9DI) r5
            if (r5 == 0) goto L_0x0c9d
            r2 = 3
            java.lang.String[] r4 = new java.lang.String[r2]
            r4[r3] = r8
            java.lang.String r2 = "messages"
            r4[r9] = r2
            r3 = 2
            java.lang.String r2 = "message"
            r4[r3] = r2
            r3 = 27
            X.AhV r2 = new X.AhV
            r2.<init>(r7, r3)
            r14 = 1
            r16 = 300(0x12c, double:1.48E-321)
            r10 = r6
            r11 = r1
            r12 = r2
            r13 = r4
            java.util.ArrayList r1 = r10.A08(r11, r12, r13, r14, r16)
            if (r1 == 0) goto L_0x0c95
            java.lang.Object r7 = r5.A00
            X.1ch r7 = (X.C29681ch) r7
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r13 = r1.iterator()
        L_0x0530:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0c89
            java.lang.Object r1 = r13.next()
            X.9DM r1 = (X.AnonymousClass9DM) r1
            java.lang.Object r3 = r1.A00
            X.9Ch r3 = (X.C178229Ch) r3
            long r1 = r3.A01
            long r3 = r3.A00
            X.00H r8 = r0.A03
            java.lang.Object r8 = r8.get()
            X.1hF r8 = (X.C32471hF) r8
            X.206 r12 = r8.A02(r7, r1)
            r10 = 0
            r9 = 0
            int r8 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r8 != 0) goto L_0x0579
            if (r12 != 0) goto L_0x0575
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "NewsletterNotificationHandler/Unexpectedly failed to find message to remove for serverId: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1Qo r2 = r0.A00
            X.3xK r1 = X.C80533xK.A02
        L_0x0571:
            r2.A00(r1, r9)
            goto L_0x0530
        L_0x0575:
            r5.add(r12)
            goto L_0x0530
        L_0x0579:
            int r8 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r8 != 0) goto L_0x059c
            if (r12 != 0) goto L_0x0598
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = "NewsletterNotificationHandler/Unexpectedly failed to find message to add for serverId: "
            r4.append(r3)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.1Qo r2 = r0.A00
            X.3xK r1 = X.C80533xK.A01
            goto L_0x0571
        L_0x0598:
            r6.add(r12)
            goto L_0x0530
        L_0x059c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "NewsletterNotificationHandler/messageDeliveryUpdatesProcessNotification - Unknown issue type: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0530
        L_0x05b1:
            java.lang.String r7 = "live_updates"
            boolean r2 = r4.equals(r7)
            if (r2 == 0) goto L_0x0cb5
            java.lang.String r2 = "notification"
            X.C29621ca.A04(r1, r2)
            X.2rm r6 = new X.2rm
            r6.<init>()
            X.A96 r5 = X.A96.A00
            r2 = 24
            X.AhV r4 = new X.AhV
            r4.<init>(r5, r2)
            r2 = 2
            java.lang.String[] r3 = new java.lang.String[r2]
            r2 = 0
            r3[r2] = r7
            java.lang.String r2 = "messages"
            r3[r9] = r2
            java.lang.Object r4 = r6.A03(r1, r4, r3)
            X.9DL r4 = (X.AnonymousClass9DL) r4
            if (r4 == 0) goto L_0x0cad
            r3 = 25
            X.AhV r2 = new X.AhV
            r2.<init>(r5, r3)
            java.lang.Object r1 = r2.BCF(r1, r6)
            X.9DI r1 = (X.AnonymousClass9DI) r1
            if (r1 == 0) goto L_0x0ca5
            java.lang.Object r5 = r1.A00
            X.1ch r5 = (X.C29681ch) r5
            java.lang.Object r1 = r4.A03
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0069
            long r7 = r1.longValue()
            r1 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r1
            X.00H r0 = r0.A01
            java.lang.Object r2 = r0.get()
            X.AW1 r2 = (X.AW1) r2
            java.lang.Object r0 = r4.A01
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x060e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r6 = r1.next()
            X.9DM r6 = (X.AnonymousClass9DM) r6
            X.00H r0 = r2.A08
            java.lang.Object r4 = r0.get()
            X.2rC r4 = (X.C62312rC) r4
            r4.A02(r5, r6, r7, r9)
            goto L_0x060e
        L_0x0626:
            boolean r2 = r0 instanceof X.C31921gL
            if (r2 == 0) goto L_0x0738
            X.1gL r0 = (X.C31921gL) r0
            r2 = 210(0xd2, float:2.94E-43)
            if (r3 != r2) goto L_0x0069
            r6 = 1
            X.C18070vi.A0d(r1, r6)
            X.8v4 r13 = X.C173438v4.A00
            java.lang.String r21 = "server_sync"
            java.lang.String r2 = "notification"
            X.C29621ca.A04(r1, r2)
            X.2rm r3 = new X.2rm
            r3.<init>()
            java.lang.String[] r7 = new java.lang.String[r6]
            java.lang.String r2 = "from"
            r15 = 0
            r7[r15] = r2
            java.lang.Class<X.8v4> r10 = X.C173438v4.class
            r4 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r11 = java.lang.Long.valueOf(r4)
            r4 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r12 = java.lang.Long.valueOf(r4)
            r8 = r3
            r9 = r1
            r14 = r7
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)
            if (r2 == 0) goto L_0x0cd9
            java.lang.String[] r4 = new java.lang.String[r6]
            java.lang.String r2 = "type"
            r4[r15] = r2
            java.lang.Class<java.lang.String> r18 = java.lang.String.class
            r2 = 0
            r16 = r3
            r17 = r1
            r19 = r11
            r20 = r12
            r22 = r4
            r23 = r15
            java.lang.Object r4 = r16.A05(r17, r18, r19, r20, r21, r22, r23)
            if (r4 == 0) goto L_0x0cd1
            X.2p0 r8 = X.C61032p0.A00
            r5 = 5
            X.AhW r4 = new X.AhW
            r4.<init>(r8, r5)
            java.lang.Object r7 = r4.BCF(r1, r3)
            X.9DC r7 = (X.AnonymousClass9DC) r7
            if (r7 == 0) goto L_0x0cc9
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String r4 = "collection"
            r6[r15] = r4
            r5 = 6
            X.AhW r4 = new X.AhW
            r4.<init>(r8, r5)
            r12 = 1
            r14 = 20
            r8 = r3
            r10 = r4
            r11 = r6
            java.util.ArrayList r1 = r8.A08(r9, r10, r11, r12, r14)
            if (r1 == 0) goto L_0x0cc1
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r9 = r1.iterator()
        L_0x06b5:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x06f7
            java.lang.Object r1 = r9.next()
            X.9D6 r1 = (X.AnonymousClass9D6) r1
            java.lang.String r8 = r1.A02
            long r3 = r1.A00
            boolean r1 = android.text.TextUtils.isEmpty(r8)
            if (r1 != 0) goto L_0x06b5
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r6.put(r8, r1)
            java.lang.Object r1 = r7.A02
            if (r1 == 0) goto L_0x06b5
            java.util.Map r5 = r0.A02
            boolean r1 = r5.containsKey(r8)
            if (r1 == 0) goto L_0x06f4
            java.lang.Object r1 = r5.get(r8)
            X.C17960vV.A07(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
        L_0x06eb:
            long r3 = r3 + r12
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r5.put(r8, r1)
            goto L_0x06b5
        L_0x06f4:
            r3 = 0
            goto L_0x06eb
        L_0x06f7:
            X.1To r5 = r0.A00
            boolean r0 = r5.A0T()
            if (r0 != 0) goto L_0x070e
            X.11Q r0 = r5.A0N
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = r1.getInt(r0, r2)
            r0 = 1
            if (r1 != r0) goto L_0x0069
        L_0x070e:
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x0716:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0cbd
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            X.1TS r3 = r5.A0R
            java.lang.Object r2 = r0.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r3.A04(r2, r0)
            goto L_0x0716
        L_0x0738:
            boolean r2 = r0 instanceof X.C33591j4
            if (r2 == 0) goto L_0x08c7
            X.1j4 r0 = (X.C33591j4) r0
            r2 = 97
            if (r3 != r2) goto L_0x0069
            java.lang.String r2 = "rmr"
            X.1ca r4 = r1.A0K(r2)
            r8 = 0
            r7 = 1
            r12 = 0
            if (r4 == 0) goto L_0x075e
            r12 = 1
            java.lang.String r2 = "from_me"
            java.lang.String r3 = r4.A0P(r2)
            java.lang.String r2 = "true"
            boolean r2 = r2.equals(r3)
            r5 = 1
            if (r2 != 0) goto L_0x07e8
        L_0x075e:
            r5 = 0
            if (r12 != 0) goto L_0x07e8
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r2 = r1.A0G(r3, r2)
        L_0x0769:
            X.1BI r4 = X.C22971Dz.A00(r2)
            java.lang.String r2 = "id"
            java.lang.String r10 = r1.A0P(r2)
            X.205 r3 = new X.205
            r3.<init>(r4, r10, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "media retry notification received; stanzaKeyId="
            r4.append(r2)
            r4.append(r10)
            java.lang.String r9 = "; key="
            r4.append(r9)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.00H r2 = r0.A02
            java.lang.Object r2 = r2.get()
            X.1W6 r2 = (X.AnonymousClass1W6) r2
            X.1W2 r2 = r2.A01
            X.206 r6 = r2.A05(r3)
            boolean r2 = r6 instanceof X.AnonymousClass21V
            if (r2 == 0) goto L_0x0069
            X.21V r6 = (X.AnonymousClass21V) r6
            X.2rc r5 = r6.A02
            if (r5 == 0) goto L_0x0cf3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = "media auto download re-enabled; stanzaKeyId="
            r4.append(r2)
            r4.append(r10)
            r4.append(r9)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r2 = "encrypt"
            X.1ca r4 = r1.A0K(r2)
            java.lang.String r2 = "enc_p"
            r9 = 0
            if (r4 == 0) goto L_0x07e6
            X.1ca r2 = r4.A0K(r2)
            if (r2 == 0) goto L_0x07e6
            byte[] r11 = r2.A01
        L_0x07d9:
            java.lang.String r2 = "enc_iv"
            if (r4 == 0) goto L_0x07f2
            X.1ca r2 = r4.A0K(r2)
            if (r2 == 0) goto L_0x07f2
            byte[] r10 = r2.A01
            goto L_0x07f3
        L_0x07e6:
            r11 = r9
            goto L_0x07d9
        L_0x07e8:
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class
            java.lang.String r2 = "jid"
            com.whatsapp.jid.Jid r2 = r4.A0G(r3, r2)
            goto L_0x0769
        L_0x07f2:
            r10 = r9
        L_0x07f3:
            java.lang.String r4 = r3.A01     // Catch:{ 1PN -> 0x0cec }
            byte[] r3 = r5.A0a     // Catch:{ 1PN -> 0x0cec }
            X.C17960vV.A07(r3)     // Catch:{ 1PN -> 0x0cec }
            if (r11 == 0) goto L_0x0829
            if (r10 == 0) goto L_0x0829
            X.00H r2 = r0.A03     // Catch:{ 1PN -> 0x0cec }
            r2.get()     // Catch:{ 1PN -> 0x0cec }
            X.C18070vi.A0d(r3, r7)     // Catch:{ 1PN -> 0x0cec }
            r2 = 2
            X.C18070vi.A0d(r4, r2)     // Catch:{ 1PN -> 0x0cec }
            X.C61992qc.A00(r3, r10)     // Catch:{ 1PN -> 0x0cec }
            r2 = 3
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOOOOO(r2, r4, r11, r3, r10)     // Catch:{ 1PN -> 0x0cec }
            com.facebook.simplejni.NativeHolder r2 = (com.facebook.simplejni.NativeHolder) r2     // Catch:{ 1PN -> 0x0cec }
            if (r2 == 0) goto L_0x0ce1
            X.2pL r9 = new X.2pL     // Catch:{ 1PN -> 0x0cec }
            r9.<init>(r2)     // Catch:{ 1PN -> 0x0cec }
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r4 = r9.A00
            r2 = 32
            java.lang.Object r2 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r7, r2, r4)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x082a
        L_0x0829:
            r2 = 0
        L_0x082a:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0832
            r5.A0J = r2
        L_0x0832:
            if (r9 == 0) goto L_0x08c4
            com.whatsapp.wamsys.JniBridge.getInstance()
            com.facebook.simplejni.NativeHolder r9 = r9.A00
            r3 = 33
            long r3 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r7, r3, r9)
            int r9 = (int) r3
        L_0x0840:
            java.lang.String r3 = "error"
            X.1ca r3 = r1.A0K(r3)
            if (r3 == 0) goto L_0x084e
            java.lang.String r1 = "code"
            int r9 = r3.A0A(r1, r8)
        L_0x084e:
            if (r12 == 0) goto L_0x08c0
            r1 = 2
            if (r9 == r1) goto L_0x0856
            r1 = 3
            if (r9 != r1) goto L_0x08c0
        L_0x0856:
            X.121 r1 = r0.A00
            r1.CQw(r6)
            X.1j3 r5 = r0.A01
            X.1hB r4 = r5.A05
            X.2rc r1 = r6.A02
            java.lang.String r3 = ", message.mediaHash="
            if (r1 != 0) goto L_0x088e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download due to missing media data; message.key = "
        L_0x086c:
            r1.append(r0)
            X.205 r0 = r6.A0v
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = r6.A05
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            if (r8 == 0) goto L_0x0069
            r5.A05(r6)
            java.lang.String r0 = "media retry notification; queue auto download"
        L_0x088a:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x088e:
            boolean r0 = r1.A0f
            if (r0 != 0) goto L_0x089a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; not transferring; message.key = "
            goto L_0x086c
        L_0x089a:
            X.00H r0 = r4.A0J
            java.lang.Object r0 = r0.get()
            X.168 r0 = (X.AnonymousClass168) r0
            X.5ti r1 = r0.A00(r1)
            if (r1 == 0) goto L_0x08b8
            if (r2 == 0) goto L_0x08b0
            X.6uk r0 = r1.A0d
            monitor-enter(r0)
            r0.A0E = r2     // Catch:{ all -> 0x0ce9 }
            monitor-exit(r0)
        L_0x08b0:
            java.util.concurrent.CountDownLatch r0 = r1.A0y
            r0.countDown()
            java.lang.String r0 = "media retry notification; resume reuploading download"
            goto L_0x088a
        L_0x08b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MediaDownloadManager/resumeReuploadingDownload/MMS unable to resume download; downloader not found; message.key = "
            goto L_0x086c
        L_0x08c0:
            r8 = 1
            r5.A0Q = r7
            goto L_0x0856
        L_0x08c4:
            r9 = 1
            goto L_0x0840
        L_0x08c7:
            boolean r2 = r0 instanceof X.C34121jx
            if (r2 == 0) goto L_0x09e1
            X.1jx r0 = (X.C34121jx) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 270(0x10e, float:3.78E-43)
            if (r3 != r2) goto L_0x0069
            X.1ca r4 = r1.A0I()
            X.C18070vi.A0X(r4)
            java.lang.String r3 = "t"
            r2 = 0
            java.lang.String r6 = r1.A0Q(r3, r2)
            java.lang.String r1 = "ping"
            boolean r1 = X.C29621ca.A07(r4, r1)
            if (r1 == 0) goto L_0x0e17
            java.lang.String r1 = "display_name"
            r5 = 0
            java.lang.String r11 = r4.A0Q(r1, r2)
            X.1ca r3 = r4.A0I()
            X.C18070vi.A0X(r3)
            java.lang.String r2 = "id"
            java.lang.String r1 = r3.A0P(r2)
            int r2 = r3.A0B(r1, r2)
            java.lang.String r1 = "name"
            java.lang.String r10 = r3.A0Q(r1, r5)
            X.1jg r4 = r0.A02
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            if (r6 == 0) goto L_0x09de
            long r1 = java.lang.Long.parseLong(r6)
            java.lang.Long r8 = java.lang.Long.valueOf(r1)
        L_0x091a:
            android.content.SharedPreferences r1 = X.C33971jg.A00(r4)
            java.lang.String r6 = "interop_reach_notifs"
            java.util.Set r1 = r1.getStringSet(r6, r5)
            if (r1 == 0) goto L_0x09da
            java.util.List r1 = X.C29431cG.A0t(r1)
        L_0x092a:
            java.util.ArrayList r7 = X.C29431cG.A0m(r1)
            java.lang.String r5 = ":"
            r1 = 4
            java.lang.CharSequence[] r3 = new java.lang.CharSequence[r1]
            r2 = 0
            java.lang.String r1 = java.lang.String.valueOf(r9)
            r3[r2] = r1
            r1 = 1
            r3[r1] = r10
            r1 = 2
            r3[r1] = r11
            r2 = 3
            java.lang.String r1 = java.lang.String.valueOf(r8)
            r3[r2] = r1
            java.lang.String r1 = X.AnonymousClass1EG.A08(r5, r3)
            X.C18070vi.A0X(r1)
            r7.add(r1)
            android.content.SharedPreferences r1 = X.C33971jg.A00(r4)
            android.content.SharedPreferences$Editor r2 = r1.edit()
            java.util.Set r1 = X.C29431cG.A12(r7)
            android.content.SharedPreferences$Editor r1 = r2.putStringSet(r6, r1)
            r1.apply()
            X.118 r1 = r0.A00
            X.1Vn r5 = r0.A01
            java.lang.String r9 = X.C137246v9.A00(r1, r4)
            r8 = 0
            r7 = 1
            android.content.Context r6 = r1.A00
            X.C18070vi.A0X(r6)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.interopui.setting.InteropReachNotificationSettingsActivity"
            r2.setClassName(r1, r0)
            android.app.PendingIntent r4 = X.C1408573i.A00(r6, r8, r2, r8)
            r0 = 2131896726(0x7f122996, float:1.9428321E38)
            java.lang.String r3 = r6.getString(r0)
            X.C18070vi.A0X(r3)
            X.73t r2 = X.C217217d.A03(r6)
            java.lang.String r0 = "critical_app_alerts@1"
            r2.A0M = r0
            java.lang.String r0 = "msg"
            r2.A0L = r0
            r2.A03 = r7
            r2.A0G(r7)
            r0 = 4
            r2.A06(r0)
            r2.A06 = r8
            r2.A0A = r4
            r2.A0E(r9)
            r2.A0D(r3)
            r1 = 2131232146(0x7f080592, float:1.8080393E38)
            r0 = 2131894887(0x7f122267, float:1.9424591E38)
            java.lang.String r0 = r6.getString(r0)
            r2.A08(r1, r0, r4)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A07(r3)
            r2.A0B(r0)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r2.A08
            r0.icon = r1
            android.app.Notification r1 = r2.A05()
            X.C18070vi.A0X(r1)
            r0 = 102(0x66, float:1.43E-43)
            r5.BkR(r0, r1)
            return
        L_0x09da:
            X.0wS r1 = X.C18460wS.A00
            goto L_0x092a
        L_0x09de:
            r8 = 0
            goto L_0x091a
        L_0x09e1:
            boolean r2 = r0 instanceof X.C36121nN
            if (r2 == 0) goto L_0x0a25
            X.1nN r0 = (X.C36121nN) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            java.lang.String r2 = "update"
            X.1ca r4 = r1.A0K(r2)
            if (r4 == 0) goto L_0x0d23
            java.lang.String r3 = "op_name"
            r2 = 0
            java.lang.String r3 = r4.A0Q(r3, r2)
            if (r3 == 0) goto L_0x0d23
            int r2 = r3.length()
            if (r2 == 0) goto L_0x0d23
            java.util.Locale r2 = java.util.Locale.US
            X.C18070vi.A0Z(r2)
            java.lang.String r3 = r3.toLowerCase(r2)
            X.C18070vi.A0X(r3)
            X.0vl r2 = r0.A01
            java.lang.Object r2 = r2.getValue()
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r2 = r2.get(r3)
            X.2SE r2 = (X.AnonymousClass2SE) r2
            if (r2 == 0) goto L_0x0d0c
            r2.A01 = r0
            r2.A03(r1)
            return
        L_0x0a25:
            boolean r2 = r0 instanceof X.C33911ja
            if (r2 == 0) goto L_0x0af7
            X.1ja r0 = (X.C33911ja) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r4 = r1.A0G(r3, r2)
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.String r5 = "t"
            r2 = 0
            long r13 = r1.A0D(r5, r2)
            java.lang.String r2 = "disappearing_mode"
            X.1ca r3 = r1.A0K(r2)
            if (r3 == 0) goto L_0x0d2b
            java.lang.String r2 = "duration"
            r1 = 0
            int r6 = r3.A0A(r2, r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r1 = X.C22971Dz.A0T(r4)
            X.1M9 r2 = r0.A00
            if (r1 == 0) goto L_0x0aa2
            X.1E7 r1 = r2.A0E(r4)
            if (r1 == 0) goto L_0x0a67
            r3.add(r1)
        L_0x0a67:
            X.1E1 r4 = (X.AnonymousClass1E1) r4
            X.1Ln r1 = r2.A0G
            com.whatsapp.jid.PhoneUserJid r1 = r1.A0D(r4)
            if (r1 == 0) goto L_0x0a7a
            X.1E7 r1 = r2.A0E(r1)
            if (r1 == 0) goto L_0x0a7a
        L_0x0a77:
            r3.add(r1)
        L_0x0a7a:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r3.iterator()
        L_0x0a83:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0aaa
            java.lang.Object r3 = r4.next()
            X.1E7 r3 = (X.AnonymousClass1E7) r3
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            X.1BI r1 = r3.A0J
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r1)
            if (r2 == 0) goto L_0x0a83
            X.1D6 r1 = new X.1D6
            r1.<init>(r2, r3)
            r5.add(r1)
            goto L_0x0a83
        L_0x0aa2:
            X.1E7 r1 = r2.A0H(r4)
            X.C18070vi.A0b(r1)
            goto L_0x0a77
        L_0x0aaa:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x0ab3:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0acc
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.lang.Object r1 = r1.second
            X.1E7 r1 = (X.AnonymousClass1E7) r1
            int r1 = r1.A02
            if (r1 == r6) goto L_0x0ab3
            r4.add(r2)
            goto L_0x0ab3
        L_0x0acc:
            java.util.Iterator r5 = r4.iterator()
        L_0x0ad0:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0069
            java.lang.Object r1 = r5.next()
            X.1D6 r1 = (X.AnonymousClass1D6) r1
            java.lang.Object r4 = r1.first
            java.lang.Object r3 = r1.second
            X.00H r1 = r0.A01
            java.lang.Object r2 = r1.get()
            X.2kZ r2 = (X.C58362kZ) r2
            r12 = 0
            X.7Q5 r1 = new X.7Q5
            r7 = r1
            r8 = r0
            r9 = r4
            r10 = r3
            r11 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r2.A01(r1)
            goto L_0x0ad0
        L_0x0af7:
            boolean r2 = r0 instanceof X.C36041nF
            if (r2 == 0) goto L_0x0b07
            X.1nF r0 = (X.C36041nF) r0
            r7 = 1
            X.C18070vi.A0d(r1, r7)
            r2 = 265(0x109, float:3.71E-43)
            if (r3 != r2) goto L_0x0069
            goto L_0x0d33
        L_0x0b07:
            boolean r2 = r0 instanceof X.C36081nJ
            if (r2 == 0) goto L_0x0b2b
            X.1nJ r0 = (X.C36081nJ) r0
            r2 = 1
            X.C18070vi.A0d(r1, r2)
            r2 = 228(0xe4, float:3.2E-43)
            if (r3 != r2) goto L_0x0069
            java.lang.String r2 = "migrate"
            X.1ca r3 = r1.A0K(r2)
            if (r3 == 0) goto L_0x0e14
            java.lang.String r2 = "urgency"
            r1 = 0
            int r1 = r3.A0A(r2, r1)
            X.1NP r0 = r0.A00
            r0.A0D(r1)
            return
        L_0x0b2b:
            X.1nK r0 = (X.C36091nK) r0
            r1 = 248(0xf8, float:3.48E-43)
            if (r3 != r1) goto L_0x0069
            X.1Cw r2 = r0.A00
            r1 = 5
            r2.A0H(r1)
            X.1fa r0 = r0.A01
            r0.A00()
            return
        L_0x0b3d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Logout ID is empty for tag: "
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0b56:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "RegistrationNotificationHandler/handleXmppMessage: unknown tag="
            r1.append(r0)
            java.lang.String r0 = r5.A00
            goto L_0x0e23
        L_0x0b64:
            java.lang.String r1 = "push-config notification: force replacing GCM token"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.118 r1 = r0.A00
            android.content.Context r5 = r1.A00
            X.1Mu r4 = r0.A04
            java.lang.String r0 = "GCM: force replacing gcm token"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r3 = "com.whatsapp.action.FORCE_REPLACE"
            r0 = 0
            java.lang.Class<com.whatsapp.push.RegistrationIntentService> r2 = com.whatsapp.push.RegistrationIntentService.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r3, r0, r5, r2)
            r0 = 4
            r4.A01(r5, r1, r2, r0)
            return
        L_0x0b83:
            X.00H r1 = r0.A09
            java.lang.Object r3 = r1.get()
            X.1Ot r3 = (X.C25581Ot) r3
            r2 = 34
            X.3Cu r1 = new X.3Cu
            r1.<init>(r0, r5, r2, r4)
            r3.A02(r1)
            return
        L_0x0b96:
            java.lang.String r1 = "required token element to contain data"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0b9e:
            monitor-enter(r0)
            int r1 = r5.length()     // Catch:{ all -> 0x0ce9 }
            if (r1 == 0) goto L_0x0bd1
            X.0z4 r4 = r0.A02     // Catch:{ all -> 0x0ce9 }
            X.00H r1 = r4.A00     // Catch:{ all -> 0x0ce9 }
            java.lang.Object r2 = r1.get()     // Catch:{ all -> 0x0ce9 }
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2     // Catch:{ all -> 0x0ce9 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0ce9 }
            r1.<init>()     // Catch:{ all -> 0x0ce9 }
            java.lang.String r3 = "pending_side_list_hash"
            java.util.Set r2 = r2.getStringSet(r3, r1)     // Catch:{ all -> 0x0ce9 }
            X.C17960vV.A07(r2)     // Catch:{ all -> 0x0ce9 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0ce9 }
            boolean r1 = r2.add(r5)     // Catch:{ all -> 0x0ce9 }
            if (r1 == 0) goto L_0x0bd1
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x0ce9 }
            android.content.SharedPreferences$Editor r1 = r1.putStringSet(r3, r2)     // Catch:{ all -> 0x0ce9 }
            r1.apply()     // Catch:{ all -> 0x0ce9 }
        L_0x0bd1:
            monitor-exit(r0)
            return
        L_0x0bd3:
            java.lang.Class<X.1E2> r3 = X.AnonymousClass1E2.class
            java.lang.String r2 = "lid"
            com.whatsapp.jid.Jid r5 = r1.A0F(r3, r2)
            java.lang.String r2 = "device_hash"
            java.lang.String r14 = r4.A0P(r2)
            java.lang.String r2 = "device_lid_hash"
            r15 = 0
            java.lang.String r3 = r4.A0Q(r2, r15)
            java.lang.String r2 = "key-index-list"
            X.1ca r4 = r4.A0K(r2)
            if (r5 == 0) goto L_0x0c42
            if (r3 == 0) goto L_0x0c42
            X.0yx r10 = new X.0yx
            r10.<init>(r5, r3)
        L_0x0bf7:
            X.10w r11 = X.C60522oA.A01(r7)
            X.C18070vi.A0X(r11)
            X.10w r12 = X.C60522oA.A01(r6)
            X.C18070vi.A0X(r12)
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            java.lang.String r2 = "from"
            com.whatsapp.jid.Jid r13 = r1.A0G(r3, r2)
            com.whatsapp.jid.UserJid r13 = (com.whatsapp.jid.UserJid) r13
            X.C17960vV.A07(r14)
            if (r4 == 0) goto L_0x0c3f
            byte[] r15 = r4.A01
            java.lang.String r3 = "ts"
            java.lang.String r2 = r4.A0P(r3)
            long r16 = r4.A0E(r2, r3)
        L_0x0c21:
            X.2qA r9 = new X.2qA
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r3 = "offline"
            r2 = 0
            java.lang.String r1 = r1.A0Q(r3, r2)
            if (r1 == 0) goto L_0x0c6f
            com.whatsapp.jid.UserJid r1 = r9.A06
            X.C17960vV.A07(r1)
            X.1Re r3 = r0.A01
            java.util.Set r0 = java.util.Collections.singleton(r1)
            X.C18070vi.A0X(r0)
            monitor-enter(r3)
            goto L_0x0c44
        L_0x0c3f:
            r16 = 0
            goto L_0x0c21
        L_0x0c42:
            r10 = r15
            goto L_0x0bf7
        L_0x0c44:
            java.util.HashSet r1 = X.C26191Re.A00(r3)     // Catch:{ all -> 0x0c6c }
            boolean r0 = r1.addAll(r0)     // Catch:{ all -> 0x0c6c }
            if (r0 == 0) goto L_0x0c6a
            java.lang.String[] r0 = X.C22971Dz.A0j(r1)     // Catch:{ all -> 0x0c6c }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0c6c }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x0c6c }
            r2.<init>(r0)     // Catch:{ all -> 0x0c6c }
            X.0z4 r0 = r3.A05     // Catch:{ all -> 0x0c6c }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x0c6c }
            java.lang.String r0 = "pending_users_to_sync_device"
            android.content.SharedPreferences$Editor r0 = r1.putStringSet(r0, r2)     // Catch:{ all -> 0x0c6c }
            r0.apply()     // Catch:{ all -> 0x0c6c }
        L_0x0c6a:
            monitor-exit(r3)
            return
        L_0x0c6c:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x0c6f:
            X.190 r2 = r0.A03
            X.11S r3 = r0.A00
            X.123 r4 = r0.A03
            X.00H r5 = r0.A06
            X.1Re r6 = r0.A01
            X.1MR r7 = r0.A04
            X.1U5 r8 = r0.A02
            r10 = 0
            X.3Cg r1 = new X.3Cg
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            X.10I r0 = r0.A05
            r0.CGF(r1)
            return
        L_0x0c89:
            X.00H r0 = r0.A02
            java.lang.Object r0 = r0.get()
            X.4Qz r0 = (X.C86274Qz) r0
            r0.A00(r7, r6, r5)
            return
        L_0x0c95:
            java.lang.String r1 = r6.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0c9d:
            java.lang.String r1 = r6.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0ca5:
            java.lang.String r1 = r6.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0cad:
            java.lang.String r1 = r6.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0cb5:
            java.lang.String r1 = "UNSUPPORTED TYPE OF NEWSLETTER NOTIFICATION"
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0cbd:
            r5.A0I()
            return
        L_0x0cc1:
            java.lang.String r1 = r3.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0cc9:
            java.lang.String r1 = r3.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0cd1:
            java.lang.String r1 = r3.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0cd9:
            java.lang.String r1 = r3.A00
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0ce1:
            java.lang.String r1 = "encrypted message id is different from the expected one"
            X.1PN r0 = new X.1PN     // Catch:{ 1PN -> 0x0cec }
            r0.<init>((java.lang.String) r1)     // Catch:{ 1PN -> 0x0cec }
            throw r0     // Catch:{ 1PN -> 0x0cec }
        L_0x0ce9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0cec:
            r1 = move-exception
            java.lang.String r0 = "malformed encrypted data"
            com.whatsapp.util.Log.w(r0, r1)
            return
        L_0x0cf3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "missing media data for media message; stanzaKeyId="
            r1.append(r0)
            r1.append(r10)
            r1.append(r9)
            r1.append(r3)
            java.lang.String r0 = r1.toString()
            goto L_0x0dc3
        L_0x0d0c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "mexnotificationrouter/onhandlernotfound there was no MexNotificationJsonHandler registered to handle notifications for the key "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0d23:
            java.lang.String r1 = "mexnotificationrouter/onoperationnotfound the operation for this notification was not found. Expected an 'update' tag with a non-empty 'operation_name' attribute."
            X.1UI r0 = new X.1UI
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0d2b:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0d33:
            java.lang.String r13 = "crsc_continuation"
            X.8v4 r21 = X.C173438v4.A00     // Catch:{ 1UI -> 0x0e0d }
            java.lang.String r2 = "notification"
            X.C29621ca.A04(r1, r2)     // Catch:{ 1UI -> 0x0e0d }
            X.2rm r6 = new X.2rm     // Catch:{ 1UI -> 0x0e0d }
            r6.<init>()     // Catch:{ 1UI -> 0x0e0d }
            r2 = 2
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ 1UI -> 0x0e0d }
            java.lang.String r2 = "encrypted_pairing_request"
            r15 = 0
            r5[r15] = r2     // Catch:{ 1UI -> 0x0e0d }
            java.lang.String r2 = "#elementValue"
            r5[r7] = r2     // Catch:{ 1UI -> 0x0e0d }
            r2 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            java.lang.Long r11 = java.lang.Long.valueOf(r2)     // Catch:{ 1UI -> 0x0e0d }
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ 1UI -> 0x0e0d }
            java.lang.Class<byte[]> r24 = byte[].class
            r4 = 0
            r22 = r6
            r23 = r1
            r25 = r11
            r26 = r12
            r27 = r4
            r28 = r5
            java.lang.Object r3 = r22.A04(r23, r24, r25, r26, r27, r28)     // Catch:{ 1UI -> 0x0e0d }
            byte[] r3 = (byte[]) r3     // Catch:{ 1UI -> 0x0e0d }
            if (r3 == 0) goto L_0x0dfd
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x0e0d }
            java.lang.String r2 = "type"
            r5[r15] = r2     // Catch:{ 1UI -> 0x0e0d }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r8 = r6
            r9 = r1
            r14 = r5
            java.lang.Object r2 = r8.A05(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ 1UI -> 0x0e0d }
            if (r2 == 0) goto L_0x0df5
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch:{ 1UI -> 0x0e0d }
            java.lang.String r2 = "from"
            r5[r15] = r2     // Catch:{ 1UI -> 0x0e0d }
            java.lang.Class<X.8v4> r18 = X.C173438v4.class
            r16 = r6
            r17 = r1
            r19 = r11
            r20 = r12
            r22 = r5
            r23 = r15
            java.lang.Object r2 = r16.A05(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1UI -> 0x0e0d }
            if (r2 == 0) goto L_0x0ded
            X.9wY r7 = X.C197349wY.A00     // Catch:{ 1UI -> 0x0e0d }
            r5 = 15
            X.AhV r2 = new X.AhV     // Catch:{ 1UI -> 0x0e0d }
            r2.<init>(r7, r5)     // Catch:{ 1UI -> 0x0e0d }
            java.lang.Object r1 = r2.BCF(r1, r6)     // Catch:{ 1UI -> 0x0e0d }
            if (r1 == 0) goto L_0x0e05
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager r5 = r0.A00
            X.1my r0 = r5.A01
            X.0ve r2 = r0.A00
            r1 = 9361(0x2491, float:1.3118E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0dc7
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/receiveEncryptedPairingRequestNotification ignoring unexpected notification"
        L_0x0dc3:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0dc7:
            X.8Yh r0 = X.C164298Yh.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0de1 }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r3)     // Catch:{ 1PN -> 0x0de1 }
            X.8Yh r0 = (X.C164298Yh) r0     // Catch:{ 1PN -> 0x0de1 }
            X.C18070vi.A0b(r0)     // Catch:{ 1PN -> 0x0de1 }
            X.1OX r3 = r5.A06
            X.0wl r2 = r5.A05
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1 r1 = new com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager$receiveEncryptedPairingRequestNotification$1
            r1.<init>(r5, r0, r4)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            X.C30451dy.A02(r0, r2, r1, r3)
            return
        L_0x0de1:
            java.lang.String r0 = "CompanionRegOverSideChannelV2Manager/receiveEncryptedPairingRequestNotification failed to parse notification payload"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager.A02(r5)
            com.whatsapp.companiondevice.crscv2.CompanionRegOverSideChannelV2Manager.A01(r5)
            return
        L_0x0ded:
            java.lang.String r0 = r6.A00     // Catch:{ 1UI -> 0x0e0d }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x0e0d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x0e0d }
            goto L_0x0e0c
        L_0x0df5:
            java.lang.String r0 = r6.A00     // Catch:{ 1UI -> 0x0e0d }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x0e0d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x0e0d }
            goto L_0x0e0c
        L_0x0dfd:
            java.lang.String r0 = r6.A00     // Catch:{ 1UI -> 0x0e0d }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x0e0d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x0e0d }
            goto L_0x0e0c
        L_0x0e05:
            java.lang.String r0 = r6.A00     // Catch:{ 1UI -> 0x0e0d }
            X.1UI r1 = new X.1UI     // Catch:{ 1UI -> 0x0e0d }
            r1.<init>((java.lang.String) r0)     // Catch:{ 1UI -> 0x0e0d }
        L_0x0e0c:
            throw r1     // Catch:{ 1UI -> 0x0e0d }
        L_0x0e0d:
            r1 = move-exception
            java.lang.String r0 = "CRSCEncryptedPairingRequestNotificationHandler/handleNotification/invalid stanza"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0e14:
            java.lang.String r0 = "encb/EncBackupNotificationHandler/migrate child node missing"
            goto L_0x0e2a
        L_0x0e17:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "InteropNotificationHandler/handleNotification: unknown tag="
            r1.append(r0)
            java.lang.String r0 = r4.A00
        L_0x0e23:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0e2a:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31911gK.A05(X.1ca, int):void");
    }

    public int[] BSG() {
        return this.A0B;
    }
}
