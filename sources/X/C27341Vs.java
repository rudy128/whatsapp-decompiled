package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.1Vs  reason: invalid class name and case insensitive filesystem */
public final class C27341Vs {
    public final AnonymousClass118 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass190 A02;
    public final C23651Hc A03;
    public final AnonymousClass00H A04;

    public C27341Vs(AnonymousClass190 r2, C23651Hc r3, AnonymousClass118 r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r3, 5);
        this.A00 = r4;
        this.A02 = r2;
        this.A04 = r5;
        this.A01 = r6;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        if (java.lang.Byte.parseByte(r5) < 0) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.Runnable r21, java.lang.String r22, byte[] r23, byte[] r24) {
        /*
            r20 = this;
            r0 = 0
            r5 = r22
            X.C18070vi.A0d(r5, r0)
            r0 = 1
            r4 = r23
            X.C18070vi.A0d(r4, r0)
            r0 = 2
            r3 = r24
            X.C18070vi.A0d(r3, r0)
            r15 = r20
            X.190 r7 = r15.A02
            X.A8L.A02(r7, r3)
            r2 = 1
            int r1 = r4.length
            r0 = 32
            if (r1 == r0) goto L_0x0028
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "crypto-iq-incorrect-server-salt-size"
            r7.A0G(r0, r1, r2)
        L_0x0028:
            r6 = 1
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0035
            byte r0 = java.lang.Byte.parseByte(r5)     // Catch:{ NumberFormatException -> 0x0035 }
            if (r0 >= 0) goto L_0x003a
        L_0x0035:
            java.lang.String r0 = "crypto-iq-incorrect-key-version"
            r7.A0G(r0, r5, r2)
        L_0x003a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "BackupSendMethods/sendGetCipherKey/v="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r8 = r15.A04
            java.lang.Object r0 = r8.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            java.lang.String r2 = r0.A0B()
            r11 = 2
            X.1MD[] r12 = new X.AnonymousClass1MD[r11]
            java.lang.String r1 = "action"
            java.lang.String r10 = "get"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)
            r14 = 0
            r12[r14] = r0
            java.lang.String r1 = "version"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (java.lang.String) r5)
            r13 = 1
            r12[r6] = r0
            X.1ca[] r9 = new X.C29621ca[r11]
            java.lang.String r1 = "google"
            r6 = 0
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (byte[]) r3, (X.AnonymousClass1MD[]) r6)
            r9[r14] = r0
            java.lang.String r1 = "code"
            X.1ca r0 = new X.1ca
            r0.<init>((java.lang.String) r1, (byte[]) r4, (X.AnonymousClass1MD[]) r6)
            r9[r13] = r0
            java.lang.String r0 = "crypto"
            X.1ca r7 = new X.1ca
            r7.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r12, (X.C29621ca[]) r9)
            r0 = 4
            X.1MD[] r6 = new X.AnonymousClass1MD[r0]
            X.8v4 r9 = X.C173438v4.A00
            java.lang.String r1 = "to"
            X.1MD r0 = new X.1MD
            r0.<init>((com.whatsapp.jid.Jid) r9, (java.lang.String) r1)
            r6[r14] = r0
            java.lang.String r9 = "xmlns"
            java.lang.String r1 = "urn:xmpp:whatsapp:account"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r9, (java.lang.String) r1)
            r6[r13] = r0
            java.lang.String r1 = "type"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r1, (java.lang.String) r10)
            r6[r11] = r0
            java.lang.String r0 = "id"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r0, (java.lang.String) r2)
            r0 = 3
            r6[r0] = r1
            java.lang.String r0 = "iq"
            X.1ca r1 = new X.1ca
            r1.<init>((X.C29621ca) r7, (java.lang.String) r0, (X.AnonymousClass1MD[]) r6)
            java.lang.Object r0 = r8.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            X.AcY r14 = new X.AcY
            r16 = r21
            r19 = r3
            r18 = r4
            r17 = r5
            r14.<init>(r15, r16, r17, r18, r19)
            r8 = 32000(0x7d00, double:1.581E-319)
            r7 = 75
            r3 = r0
            r4 = r14
            r5 = r1
            r6 = r2
            r3.A0J(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27341Vs.A00(java.lang.Runnable, java.lang.String, byte[], byte[]):void");
    }

    public final boolean A01(Integer num, Runnable runnable, byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = bArr;
        C18070vi.A0d(bArr3, 1);
        if (!this.A03.A07) {
            return false;
        }
        Log.i("sendmethods/sendcreatecipherkey");
        AnonymousClass190 r2 = this.A02;
        A8L.A02(r2, bArr3);
        byte[] bArr4 = bArr2;
        int length = bArr4.length;
        if (length != 16) {
            r2.A0G("crypto-iq-incorrect-account-salt-size", String.valueOf(length), true);
        }
        AnonymousClass00H r6 = this.A04;
        String A0B = ((AnonymousClass1OZ) r6.get()).A0B();
        ((AnonymousClass1OZ) r6.get()).A0J(new C20982Aca(bArr4, bArr3, this, num, runnable, 0), new C29621ca(new C29621ca("crypto", new AnonymousClass1MD[]{new AnonymousClass1MD("action", "create")}, new C29621ca[]{new C29621ca("google", bArr3, (AnonymousClass1MD[]) null)}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD("xmlns", "urn:xmpp:whatsapp:account"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B)}), A0B, 74, 32000);
        return true;
    }
}
