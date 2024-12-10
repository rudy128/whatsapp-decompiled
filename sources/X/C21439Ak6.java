package X;

import android.content.Context;
import com.whatsapp.jid.UserJid;

/* renamed from: X.Ak6  reason: case insensitive filesystem */
public class C21439Ak6 implements Runnable {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C21439Ak6(C20035A4e a4e, AnonymousClass6RX r3, UserJid userJid, Integer num, String str, String str2, String str3) {
        this.A01 = a4e;
        this.A02 = userJid;
        this.A03 = r3;
        this.A04 = num;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013d, code lost:
        if (r9.equals("Instagram") != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0162, code lost:
        if (r9.equals("Messenger") == false) goto L_0x013f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0169, code lost:
        if (r9.equals("Facebook") != false) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016b, code lost:
        r0 = X.C19956A0n.A00(r8, r7, r9, r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            int r0 = r14.A00
            if (r0 == 0) goto L_0x0102
            java.lang.Object r11 = r14.A01
            X.A4e r11 = (X.C20035A4e) r11
            java.lang.Object r10 = r14.A02
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.Object r9 = r14.A03
            X.6RX r9 = (X.AnonymousClass6RX) r9
            java.lang.Object r8 = r14.A04
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.String r7 = r14.A05
            java.lang.String r6 = r14.A06
            java.lang.String r5 = r14.A07
            r4 = 0
            X.0ve r3 = r11.A00
            r0 = 12636(0x315c, float:1.7707E-41)
            X.0vf r2 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r2, r3, r0)
            r0 = 1
            if (r1 == r0) goto L_0x00fe
            r0 = 2
            if (r1 == r0) goto L_0x00fa
            java.lang.Integer r13 = X.AnonymousClass00R.A00
        L_0x002d:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r13 == r0) goto L_0x0067
            r0 = 2
            X.1D6[] r12 = new X.AnonymousClass1D6[r0]
            X.9Im r1 = X.C179569Im.ENTRY_POINT_TYPE
            int r0 = r9.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.AnonymousClass1D6.A03(r1, r0, r12, r4)
            X.9Im r1 = X.C179569Im.IS_PROVISIONAL
            java.lang.String r0 = "1"
            X.C108985cd.A1G(r1, r0, r12)
            java.util.LinkedHashMap r12 = X.AnonymousClass1D7.A0C(r12)
            if (r8 == 0) goto L_0x0055
            X.9Im r1 = X.C179569Im.ENTRY_POINT_SOURCE
            java.lang.String r0 = r8.toString()
            r12.put(r1, r0)
        L_0x0055:
            if (r7 == 0) goto L_0x0060
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            if (r13 != r0) goto L_0x0060
            X.9Im r0 = X.C179569Im.PROVISIONAL_PARTNER_TOKEN
            r12.put(r0, r7)
        L_0x0060:
            java.util.Map r0 = X.AnonymousClass1D7.A0F(r12)
            X.C20035A4e.A01(r11, r10, r0)
        L_0x0067:
            java.lang.String r1 = r10.getRawString()
            X.9ju r12 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r13 = 0
            X.C18070vi.A0d(r1, r4)
            java.lang.String r0 = "recipient_jid"
            X.8Kx r1 = X.C162478Kx.A00(r12, r1, r0)
            java.lang.String r0 = "partner_token"
            X.C162478Kx.A01(r1, r7, r0)
            org.json.JSONObject r7 = X.C17880vN.A15()
            java.lang.String r4 = "platform"
            java.lang.String r0 = "Android"
            r7.put(r4, r0)
            int r0 = r9.value
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "entry_point_type"
            r7.put(r0, r4)
            if (r8 == 0) goto L_0x00a1
            int r0 = r8.intValue()
            java.lang.String r4 = "source"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.put(r4, r0)
        L_0x00a1:
            java.lang.String r4 = X.C18070vi.A0H(r7)
            java.lang.String r0 = "deeplink_type"
            X.C162478Kx.A01(r1, r4, r0)
            if (r6 != 0) goto L_0x00ae
            if (r5 == 0) goto L_0x00d7
        L_0x00ae:
            r0 = 12822(0x3216, float:1.7967E-41)
            int r2 = X.C18020vd.A00(r2, r3, r0)
            r0 = 1
            if (r2 != r0) goto L_0x00d7
            if (r6 == 0) goto L_0x00bf
            java.lang.String r0 = "referer"
            X.8Kx r13 = X.C162478Kx.A00(r12, r6, r0)
        L_0x00bf:
            if (r5 == 0) goto L_0x00cc
            java.lang.String r0 = "text_hash"
            if (r13 != 0) goto L_0x00c9
            X.8Kx r13 = r12.A00()
        L_0x00c9:
            X.C162478Kx.A01(r13, r5, r0)
        L_0x00cc:
            java.lang.String r0 = "link_metadata"
            if (r13 != 0) goto L_0x00d4
            X.8Kx r13 = r12.A00()
        L_0x00d4:
            r1.A06(r13, r0)
        L_0x00d7:
            X.A7K r3 = X.A7K.A00()
            java.lang.String r0 = "request"
            X.C108975cc.A0z(r1, r3, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.external_ctx.ExternalCtxAuthoriseWAChatResponseImpl> r1 = com.whatsapp.infra.graphql.generated.external_ctx.ExternalCtxAuthoriseWAChatResponseImpl.class
            r2 = 1
            java.lang.String r0 = "ExternalCtxAuthoriseWAChat"
            X.AIj r1 = X.AIj.A00(r3, r1, r0)
            X.00H r0 = r11.A01
            X.A2g r1 = X.C108975cc.A0J(r1, r0)
            r1.A01 = r2
            X.B1e r0 = new X.B1e
            r0.<init>(r11, r9, r10, r8)
            r1.A04(r0)
            return
        L_0x00fa:
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
            goto L_0x002d
        L_0x00fe:
            java.lang.Integer r13 = X.AnonymousClass00R.A01
            goto L_0x002d
        L_0x0102:
            java.lang.Object r7 = r14.A01
            X.A0n r7 = (X.C19956A0n) r7
            java.lang.Object r8 = r14.A02
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r9 = r14.A05
            java.lang.String r6 = r14.A06
            java.lang.Object r5 = r14.A03
            java.lang.Object r4 = r14.A04
            r0 = 6
            X.C18070vi.A0d(r4, r0)
            java.lang.String r0 = ""
            if (r9 != 0) goto L_0x011b
            r9 = r0
        L_0x011b:
            if (r6 != 0) goto L_0x011e
            r6 = r0
        L_0x011e:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            int r10 = r9.hashCode()
            r0 = 561774310(0x217bfee6, float:8.5379463E-19)
            java.lang.String r2 = "Instagram"
            java.lang.String r1 = "Facebook"
            if (r10 == r0) goto L_0x0165
            r0 = 567859955(0x21d8daf3, float:1.4694685E-18)
            if (r10 == r0) goto L_0x015c
            r0 = 2032871314(0x792b2792, float:5.5542834E34)
            if (r10 != r0) goto L_0x013f
            boolean r0 = r9.equals(r2)
            if (r0 != 0) goto L_0x016b
        L_0x013f:
            java.util.ArrayList r0 = X.C19956A0n.A00(r8, r7, r1, r6)
            r3.addAll(r0)
            java.util.ArrayList r0 = X.C19956A0n.A00(r8, r7, r2, r6)
        L_0x014a:
            r3.addAll(r0)
        L_0x014d:
            X.1KB r2 = r7.A01
            if (r2 == 0) goto L_0x0170
            r1 = 9
            X.AkM r0 = new X.AkM
            r0.<init>(r5, r4, r3, r1)
            r2.CGP(r0)
            return
        L_0x015c:
            java.lang.String r0 = "Messenger"
            boolean r0 = r9.equals(r0)
            if (r0 != 0) goto L_0x014d
            goto L_0x013f
        L_0x0165:
            boolean r0 = r9.equals(r1)
            if (r0 == 0) goto L_0x013f
        L_0x016b:
            java.util.ArrayList r0 = X.C19956A0n.A00(r8, r7, r9, r6)
            goto L_0x014a
        L_0x0170:
            java.lang.String r0 = "globalUI"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21439Ak6.run():void");
    }

    public C21439Ak6(Context context, C19956A0n a0n, AnonymousClass86X r4, Object obj, String str, String str2) {
        this.A01 = a0n;
        this.A02 = context;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = "wa_android_bloks_native_auth";
        this.A03 = obj;
        this.A04 = r4;
    }
}
