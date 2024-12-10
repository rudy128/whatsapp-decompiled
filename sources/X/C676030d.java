package X;

import com.whatsapp.jid.PhoneUserJid;

/* renamed from: X.30d  reason: invalid class name and case insensitive filesystem */
public final class C676030d implements C108035b1 {
    public final C25591Ou A00;
    public final AnonymousClass1P3 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public void BwN(AnonymousClass1E1 r4, AnonymousClass1E1 r5, PhoneUserJid phoneUserJid) {
        if (r5 != null) {
            if (C18020vd.A05(C18040vf.A02, this.A02, 11811) && this.A01.A0D(C63962tz.A02(r5.getPrimaryDevice())) != null) {
                C17900vP.A0Y(phoneUserJid, "AxolotlLidChangeHandler/handleIdentityKeyOnMappingChange notifyIdentityChanged for ", AnonymousClass000.A10());
                this.A00.A00(phoneUserJid.getPrimaryDevice());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BwO(X.AnonymousClass1E1 r12, X.AnonymousClass1E1 r13, com.whatsapp.jid.PhoneUserJid r14) {
        /*
            r11 = this;
            if (r13 != 0) goto L_0x005d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AxolotlLidChangeHandler/handleSessionAndSenderKeyOnMappingLearnt for "
            r5 = r14
            X.C17900vP.A0Y(r14, r0, r1)
            X.00H r0 = r11.A04
            java.lang.Object r0 = r0.get()
            X.1Ls r0 = (X.C24801Ls) r0
            X.1au r3 = r0.A06()
            X.1xA r2 = r3.BD0()     // Catch:{ all -> 0x0053 }
            X.00H r0 = r11.A03     // Catch:{ all -> 0x004c }
            r0.get()     // Catch:{ all -> 0x004c }
            java.lang.String r6 = "sessions"
            java.lang.String r7 = "recipient_id"
            java.lang.String r8 = "recipient_type"
            java.lang.String r9 = "recipient_account_id"
            java.lang.String r10 = "recipient_account_type"
            r4 = r12
            X.AnonymousClass1MK.A00(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x004c }
            r0.get()     // Catch:{ all -> 0x004c }
            java.lang.String r6 = "sender_keys"
            java.lang.String r7 = "sender_id"
            java.lang.String r8 = "sender_type"
            java.lang.String r9 = "sender_account_id"
            java.lang.String r10 = "sender_account_type"
            X.AnonymousClass1MK.A00(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x004c }
            r2.A00()     // Catch:{ all -> 0x004c }
            r2.close()     // Catch:{ all -> 0x0053 }
            goto L_0x005a
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x005a:
            r3.close()
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676030d.BwO(X.1E1, X.1E1, com.whatsapp.jid.PhoneUserJid):void");
    }

    public C676030d(C25591Ou r1, AnonymousClass1P3 r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r3, r1, r2, r4, r5);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r4;
        this.A03 = r5;
    }
}
