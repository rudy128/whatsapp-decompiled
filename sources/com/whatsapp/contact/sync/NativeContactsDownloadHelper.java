package com.whatsapp.contact.sync;

import X.AnonymousClass00R;
import X.AnonymousClass11S;
import X.AnonymousClass1OR;
import X.AnonymousClass1OX;
import X.AnonymousClass1PY;
import X.AnonymousClass1UK;
import X.AnonymousClass1UX;
import X.AnonymousClass1UY;
import X.C18070vi;
import X.C26931Ua;
import X.C26981Ug;
import X.C30391dr;
import X.C30451dy;
import X.C46072Ct;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class NativeContactsDownloadHelper {
    public final AnonymousClass11S A00;
    public final C26931Ua A01;
    public final AnonymousClass1UK A02;
    public final AnonymousClass1UY A03;
    public final List A04 = new ArrayList();
    public final AnonymousClass1OX A05;
    public final AnonymousClass1UX A06;
    public final AnonymousClass1PY A07;

    public NativeContactsDownloadHelper(AnonymousClass11S r2, C26931Ua r3, AnonymousClass1UK r4, AnonymousClass1UX r5, AnonymousClass1UY r6, AnonymousClass1PY r7, AnonymousClass1OX r8) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r7, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r3, 7);
        this.A05 = r8;
        this.A07 = r7;
        this.A02 = r4;
        this.A06 = r5;
        this.A03 = r6;
        this.A00 = r2;
        this.A01 = r3;
    }

    public final C26981Ug A01(Integer num, boolean z) {
        this.A04.clear();
        AnonymousClass11S r0 = this.A00;
        r0.A0I();
        PhoneUserJid phoneUserJid = r0.A0E;
        C26981Ug r6 = new C26981Ug();
        if (phoneUserJid == null) {
            Log.e("NativeContactsDownloadHelper/myJid is null");
            r6.BrF(C46072Ct.A00);
            return r6;
        }
        AnonymousClass1OX r2 = this.A05;
        NativeContactsDownloadHelper$startContactsDownload$1 nativeContactsDownloadHelper$startContactsDownload$1 = new NativeContactsDownloadHelper$startContactsDownload$1(this, phoneUserJid, r6, num, (C30391dr) null, z);
        C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, nativeContactsDownloadHelper$startContactsDownload$1, r2);
        return r6;
    }

    /* JADX WARNING: type inference failed for: r14v5, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x033d, code lost:
        if (r22 != false) goto L_0x033f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0373 A[Catch:{ 1Uc -> 0x038e }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0145 A[Catch:{ 1Uc -> 0x038e }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.whatsapp.contact.sync.NativeContactsDownloadHelper r23, com.whatsapp.jid.UserJid r24, X.C26981Ug r25, java.lang.Integer r26, java.lang.String r27, X.C30391dr r28, int r29, boolean r30) {
        /*
            r3 = r28
            r10 = r24
            r7 = r30
            r11 = r23
            r8 = r26
            r9 = r25
            boolean r0 = r3 instanceof X.C71393Fc
            if (r0 == 0) goto L_0x003e
            r6 = r3
            X.3Fc r6 = (X.C71393Fc) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003e
            int r2 = r2 - r1
            r6.label = r2
        L_0x001e:
            java.lang.Object r3 = r6.result
            X.1g4 r15 = X.C31751g4.COROUTINE_SUSPENDED
            int r2 = r6.label
            r0 = 2
            r5 = 0
            r1 = 1
            if (r2 == 0) goto L_0x006d
            if (r2 == r1) goto L_0x0051
            if (r2 != r0) goto L_0x0049
            java.lang.Object r5 = r6.L$3
            X.2Gl r5 = (X.C46932Gl) r5
            java.lang.Object r9 = r6.L$2
            X.1Ug r9 = (X.C26981Ug) r9
            java.lang.Object r8 = r6.L$1
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r11 = r6.L$0
            com.whatsapp.contact.sync.NativeContactsDownloadHelper r11 = (com.whatsapp.contact.sync.NativeContactsDownloadHelper) r11
            goto L_0x0044
        L_0x003e:
            X.3Fc r6 = new X.3Fc
            r6.<init>(r11, r3)
            goto L_0x001e
        L_0x0044:
            X.C30691eM.A01(r3)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x03bb
        L_0x0049:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0051:
            boolean r7 = r6.Z$0
            int r0 = r6.I$0
            r29 = r0
            java.lang.Object r5 = r6.L$4
            X.2Gl r5 = (X.C46932Gl) r5
            java.lang.Object r9 = r6.L$3
            X.1Ug r9 = (X.C26981Ug) r9
            java.lang.Object r8 = r6.L$2
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r10 = r6.L$1
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.Object r11 = r6.L$0
            com.whatsapp.contact.sync.NativeContactsDownloadHelper r11 = (com.whatsapp.contact.sync.NativeContactsDownloadHelper) r11
            goto L_0x00fe
        L_0x006d:
            X.C30691eM.A01(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput r4 = new com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUserQueryInput
            r4.<init>()
            java.lang.String r2 = "jid"
            r0 = 0
            X.C18070vi.A0d(r10, r0)
            java.lang.String r0 = r10.getRawString()
            r4.A05(r2, r0)
            X.1UK r0 = r11.A02
            X.2Gl r5 = r0.A01(r5)
            r3.add(r4)
            com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUsersInput r12 = new com.whatsapp.infra.graphql.generated.usync.calls.XWA2WAUsersInput
            r12.<init>()
            java.lang.String r0 = "query_input"
            r12.A06(r0, r3)
            X.9ju r3 = com.facebook.graphql.calls.GraphQlCallInput.A02
            if (r30 == 0) goto L_0x00da
            java.lang.String r2 = "REGISTRATION"
        L_0x00a0:
            java.lang.String r0 = "context"
            X.8Kx r3 = r3.A00()
            X.C162478Kx.A01(r3, r2, r0)
            java.lang.String r2 = "telemetry"
            X.8Kx r0 = r12.A02()
            r0.A06(r3, r2)
            X.A7K r4 = new X.A7K
            r4.<init>()
            java.lang.String r0 = "input"
            r4.A04(r12, r0)
            java.lang.Integer r2 = new java.lang.Integer
            r0 = r29
            r2.<init>(r0)
            java.lang.String r0 = "batch_size"
            r4.A05(r2, r0)
            java.lang.String r0 = "cursor"
            r2 = r27
            r4.A07(r0, r2)
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.SelfContactsQueryResponseImpl> r3 = com.whatsapp.infra.graphql.generated.usync.SelfContactsQueryResponseImpl.class
            java.lang.String r0 = "SelfContactsQuery"
            X.AIj r2 = new X.AIj
            r2.<init>(r4, r3, r0)
            goto L_0x00dd
        L_0x00da:
            java.lang.String r2 = "BACKGROUND"
            goto L_0x00a0
        L_0x00dd:
            X.1PY r0 = r11.A07     // Catch:{ 1Uc -> 0x038e }
            X.A2g r2 = r0.A01(r2)     // Catch:{ 1Uc -> 0x038e }
            r6.L$0 = r11     // Catch:{ 1Uc -> 0x038e }
            r6.L$1 = r10     // Catch:{ 1Uc -> 0x038e }
            r6.L$2 = r8     // Catch:{ 1Uc -> 0x038e }
            r6.L$3 = r9     // Catch:{ 1Uc -> 0x038e }
            r6.L$4 = r5     // Catch:{ 1Uc -> 0x038e }
            r0 = r29
            r6.I$0 = r0     // Catch:{ 1Uc -> 0x038e }
            r6.Z$0 = r7     // Catch:{ 1Uc -> 0x038e }
            r6.label = r1     // Catch:{ 1Uc -> 0x038e }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x038e }
            java.lang.Object r3 = r2.A01(r6, r0)     // Catch:{ 1Uc -> 0x038e }
            if (r3 != r15) goto L_0x0101
            return r15
        L_0x00fe:
            X.C30691eM.A01(r3)     // Catch:{ 1Uc -> 0x038e }
        L_0x0101:
            X.A8k r3 = (X.C20125A8k) r3     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r2 = "xwa2_fetch_wa_users"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.SelfContactsQueryResponseImpl$Xwa2FetchWaUsers> r0 = com.whatsapp.infra.graphql.generated.usync.SelfContactsQueryResponseImpl.Xwa2FetchWaUsers.class
            X.1IX r0 = r3.A0A(r0, r2)     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0371
            java.lang.Object r0 = X.C29431cG.A0c(r0)     // Catch:{ 1Uc -> 0x038e }
            X.A8k r0 = (X.C20125A8k) r0     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0371
            java.lang.String r4 = "__typename"
            org.json.JSONObject r12 = r0.A00     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r0 = r12.optString(r4)     // Catch:{ 1Uc -> 0x038e }
            int r2 = r0.hashCode()     // Catch:{ 1Uc -> 0x038e }
            r0 = 561612603(0x2179873b, float:8.454346E-19)
            if (r2 != r0) goto L_0x0371
            com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl r3 = new com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl     // Catch:{ 1Uc -> 0x038e }
            r3.<init>(r12)     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r2 = "contacts_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl$ContactsInfo> r0 = com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl.ContactsInfo.class
            X.A8k r0 = r3.A09(r0, r2)     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0371
            org.json.JSONObject r3 = r0.A00     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r0 = r3.optString(r4)     // Catch:{ 1Uc -> 0x038e }
            int r2 = r0.hashCode()     // Catch:{ 1Uc -> 0x038e }
            r0 = 180848385(0xac78701, float:1.9213786E-32)
            if (r2 != r0) goto L_0x0371
            com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl$ContactsInfo$InlineXWA2ContactsConnection r4 = new com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl$ContactsInfo$InlineXWA2ContactsConnection     // Catch:{ 1Uc -> 0x038e }
            r4.<init>(r3)     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r2 = "page_info"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl$ContactsInfo$InlineXWA2ContactsConnection$PageInfo> r0 = com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl.ContactsInfo.InlineXWA2ContactsConnection.PageInfo.class
            X.A8k r12 = r4.A09(r0, r2)     // Catch:{ 1Uc -> 0x038e }
            r22 = 0
            if (r12 == 0) goto L_0x0168
            java.lang.String r0 = "hasNextPage"
            boolean r0 = r12.A0G(r0)     // Catch:{ 1Uc -> 0x038e }
            if (r0 != r1) goto L_0x0168
            java.lang.String r0 = "endCursor"
            java.lang.String r0 = r12.A0F(r0)     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0168
            r22 = 1
        L_0x0168:
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl$ContactsInfo$InlineXWA2ContactsConnection$Edges> r0 = com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl.ContactsInfo.InlineXWA2ContactsConnection.Edges.class
            X.1IX r0 = r4.A0A(r0, r1)     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x01c7
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ 1Uc -> 0x038e }
            r14.<init>()     // Catch:{ 1Uc -> 0x038e }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ 1Uc -> 0x038e }
        L_0x017b:
            boolean r0 = r16.hasNext()     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x01c9
            java.lang.Object r13 = r16.next()     // Catch:{ 1Uc -> 0x038e }
            X.A8k r13 = (X.C20125A8k) r13     // Catch:{ 1Uc -> 0x038e }
            X.C18070vi.A0b(r13)     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r3 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl$ContactsInfo$InlineXWA2ContactsConnection$Edges$Node> r2 = com.whatsapp.infra.graphql.generated.usync.XWA2UserFragImpl.ContactsInfo.InlineXWA2ContactsConnection.Edges.Node.class
            X.A8k r1 = r13.A09(r2, r3)     // Catch:{ 1Uc -> 0x038e }
            X.C199610h.A04(r1)     // Catch:{ 1Uc -> 0x038e }
            X.C18070vi.A0X(r1)     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r0 = "pn"
            r1.A0F(r0)     // Catch:{ 1Uc -> 0x038e }
            X.A8k r1 = r13.A09(r2, r3)     // Catch:{ 1Uc -> 0x038e }
            X.C199610h.A04(r1)     // Catch:{ 1Uc -> 0x038e }
            X.C18070vi.A0X(r1)     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r1 = r1.A0F(r0)     // Catch:{ 1Uc -> 0x038e }
            r2 = 0
            if (r1 == 0) goto L_0x01b4
            android.os.Parcelable$Creator r0 = com.whatsapp.jid.PhoneUserJid.CREATOR     // Catch:{ 1Uc -> 0x038e }
            com.whatsapp.jid.PhoneUserJid r2 = X.C22951Dx.A00(r1)     // Catch:{ 1Uc -> 0x038e }
        L_0x01b4:
            java.lang.String r0 = "encrypted_metadata"
            X.1IX r1 = r13.A0C(r0)     // Catch:{ 1Uc -> 0x038e }
            if (r2 == 0) goto L_0x017b
            if (r1 == 0) goto L_0x017b
            X.1D6 r0 = new X.1D6     // Catch:{ 1Uc -> 0x038e }
            r0.<init>(r2, r1)     // Catch:{ 1Uc -> 0x038e }
            r14.add(r0)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x017b
        L_0x01c7:
            X.0wS r14 = X.C18460wS.A00     // Catch:{ 1Uc -> 0x038e }
        L_0x01c9:
            boolean r0 = r14.isEmpty()     // Catch:{ 1Uc -> 0x038e }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0318
            X.1UX r1 = r11.A06     // Catch:{ 1Uc -> 0x038e }
            X.3Ig r16 = new X.3Ig     // Catch:{ 1Uc -> 0x038e }
            r17 = r11
            r18 = r5
            r19 = r9
            r20 = r8
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22)     // Catch:{ 1Uc -> 0x038e }
            r0 = 1
            X.C18070vi.A0d(r5, r0)     // Catch:{ 1Uc -> 0x038e }
            X.1UW r0 = r1.A00     // Catch:{ 1Uc -> 0x038e }
            X.8XJ r0 = r0.A01()     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x033d
            X.EE9 r1 = r0.clientSecretKey_     // Catch:{ 1Uc -> 0x038e }
            if (r1 == 0) goto L_0x033d
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ 1Uc -> 0x038e }
            r20.<init>()     // Catch:{ 1Uc -> 0x038e }
            r0 = 10
            int r0 = X.C29351c6.A0C(r1, r0)     // Catch:{ 1Uc -> 0x038e }
            int r0 = X.C200610r.A03(r0)     // Catch:{ 1Uc -> 0x038e }
            r2 = 16
            if (r0 >= r2) goto L_0x0207
            r0 = 16
        L_0x0207:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch:{ 1Uc -> 0x038e }
            r3.<init>(r0)     // Catch:{ 1Uc -> 0x038e }
            java.util.Iterator r17 = r1.iterator()     // Catch:{ 1Uc -> 0x038e }
        L_0x0210:
            boolean r0 = r17.hasNext()     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0233
            java.lang.Object r0 = r17.next()     // Catch:{ 1Uc -> 0x038e }
            X.8ct r0 = (X.C166438ct) r0     // Catch:{ 1Uc -> 0x038e }
            long r1 = r0.keyId_     // Catch:{ 1Uc -> 0x038e }
            java.lang.Long r13 = java.lang.Long.valueOf(r1)     // Catch:{ 1Uc -> 0x038e }
            X.DSQ r0 = r0.clientSecretKeyData_     // Catch:{ 1Uc -> 0x038e }
            byte[] r2 = r0.A06()     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r1 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ 1Uc -> 0x038e }
            r0.<init>(r2, r1)     // Catch:{ 1Uc -> 0x038e }
            r3.put(r13, r0)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x0210
        L_0x0233:
            java.util.Iterator r19 = r14.iterator()     // Catch:{ 1Uc -> 0x038e }
        L_0x0237:
            boolean r0 = r19.hasNext()     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0310
            java.lang.Object r0 = r19.next()     // Catch:{ 1Uc -> 0x038e }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ 1Uc -> 0x038e }
            java.lang.Object r2 = r0.first     // Catch:{ 1Uc -> 0x038e }
            com.whatsapp.jid.PhoneUserJid r2 = (com.whatsapp.jid.PhoneUserJid) r2     // Catch:{ 1Uc -> 0x038e }
            java.lang.Object r1 = r0.second     // Catch:{ 1Uc -> 0x038e }
            java.util.List r1 = (java.util.List) r1     // Catch:{ 1Uc -> 0x038e }
            if (r2 == 0) goto L_0x0309
            if (r1 == 0) goto L_0x0309
            boolean r0 = r1.isEmpty()     // Catch:{ 1Uc -> 0x038e }
            if (r0 != 0) goto L_0x0309
            boolean r0 = r3.isEmpty()     // Catch:{ 1Uc -> 0x038e }
            if (r0 != 0) goto L_0x0309
            java.util.Iterator r18 = r1.iterator()     // Catch:{ 1Uc -> 0x038e }
        L_0x025f:
            boolean r0 = r18.hasNext()     // Catch:{ 1Uc -> 0x038e }
            if (r0 == 0) goto L_0x0237
            java.lang.Object r1 = r18.next()     // Catch:{ 1Uc -> 0x038e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 1Uc -> 0x038e }
            r0 = 0
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x02f5 }
            X.C18070vi.A0b(r1)     // Catch:{ Exception -> 0x02f5 }
            X.C18070vi.A0d(r1, r0)     // Catch:{ Exception -> 0x02f5 }
            X.2BE r0 = X.AnonymousClass2BE.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x025f }
            X.Bm6 r0 = X.C23577Bm6.A07(r0, r1)     // Catch:{ Exception -> 0x025f }
            X.2BE r0 = (X.AnonymousClass2BE) r0     // Catch:{ Exception -> 0x025f }
            if (r0 == 0) goto L_0x025f
            int r1 = r0.keyId_     // Catch:{ Exception -> 0x02f5 }
            long r13 = (long) r1     // Catch:{ Exception -> 0x02f5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x02f5 }
            java.lang.Object r14 = r3.get(r1)     // Catch:{ Exception -> 0x02f5 }
            javax.crypto.spec.SecretKeySpec r14 = (javax.crypto.spec.SecretKeySpec) r14     // Catch:{ Exception -> 0x02f5 }
            if (r14 == 0) goto L_0x025f
            X.DSQ r1 = r0.contactMetadataEncrypted_     // Catch:{ Exception -> 0x025f }
            byte[] r17 = r1.A06()     // Catch:{ Exception -> 0x025f }
            X.C18070vi.A0X(r17)     // Catch:{ Exception -> 0x025f }
            X.DSQ r0 = r0.iv_     // Catch:{ Exception -> 0x025f }
            byte[] r1 = r0.A06()     // Catch:{ Exception -> 0x025f }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x025f }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r13 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x025f }
            X.C18070vi.A0X(r13)     // Catch:{ Exception -> 0x025f }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ Exception -> 0x025f }
            r0.<init>(r1)     // Catch:{ Exception -> 0x025f }
            r1 = 2
            r13.init(r1, r14, r0)     // Catch:{ Exception -> 0x025f }
            r0 = r17
            byte[] r1 = r13.doFinal(r0)     // Catch:{ Exception -> 0x025f }
            X.C18070vi.A0X(r1)     // Catch:{ Exception -> 0x025f }
            X.2BO r0 = X.AnonymousClass2BO.DEFAULT_INSTANCE     // Catch:{ Exception -> 0x025f }
            X.Bm6 r13 = X.C23577Bm6.A07(r0, r1)     // Catch:{ Exception -> 0x025f }
            X.2BO r13 = (X.AnonymousClass2BO) r13     // Catch:{ Exception -> 0x025f }
            if (r13 == 0) goto L_0x025f
            int r1 = r13.syncPolicy_     // Catch:{ Exception -> 0x02f5 }
            if (r1 == 0) goto L_0x02d0
            r0 = 1
            if (r1 == r0) goto L_0x02d3
            X.2R6 r1 = X.AnonymousClass2R6.UNRECOGNIZED     // Catch:{ Exception -> 0x02f5 }
            goto L_0x02d5
        L_0x02d0:
            X.2R6 r1 = X.AnonymousClass2R6.SYNC_TO_DEVICE     // Catch:{ Exception -> 0x02f5 }
            goto L_0x02d5
        L_0x02d3:
            X.2R6 r1 = X.AnonymousClass2R6.NOT_SYNC_TO_DEVICE     // Catch:{ Exception -> 0x02f5 }
        L_0x02d5:
            X.2R6 r0 = X.AnonymousClass2R6.SYNC_TO_DEVICE     // Catch:{ Exception -> 0x02f5 }
            r28 = 1
            if (r1 != r0) goto L_0x02dd
            r28 = 0
        L_0x02dd:
            java.lang.String r0 = r13.firstName_     // Catch:{ Exception -> 0x02f5 }
            r17 = r0
            java.lang.String r14 = r13.lastName_     // Catch:{ Exception -> 0x02f5 }
            java.lang.String r1 = r13.businessName_     // Catch:{ Exception -> 0x02f5 }
            X.2v0 r0 = new X.2v0     // Catch:{ Exception -> 0x02f5 }
            r23 = r0
            r24 = r2
            r25 = r17
            r26 = r14
            r27 = r1
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ Exception -> 0x02f5 }
            goto L_0x0302
        L_0x02f5:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ 1Uc -> 0x038e }
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 1Uc -> 0x038e }
            r5.A00 = r0     // Catch:{ 1Uc -> 0x038e }
            goto L_0x025f
        L_0x0302:
            r1 = r20
            r1.add(r0)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x0237
        L_0x0309:
            java.lang.String r0 = "NativeContactMetadataAdapterInterfaceImpl/ The inputs are null or empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x0237
        L_0x0310:
            r1 = r16
            r0 = r20
            r1.invoke(r0)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x033d
        L_0x0318:
            if (r22 != 0) goto L_0x033f
            if (r7 == 0) goto L_0x0328
            X.1Ua r3 = r11.A01     // Catch:{ 1Uc -> 0x038e }
            X.11P r0 = r3.A01     // Catch:{ 1Uc -> 0x038e }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ 1Uc -> 0x038e }
            r2 = 7
            X.C26931Ua.A00(r3, r2, r0)     // Catch:{ 1Uc -> 0x038e }
        L_0x0328:
            X.1UK r3 = r11.A02     // Catch:{ 1Uc -> 0x038e }
            java.util.List r2 = r11.A04     // Catch:{ 1Uc -> 0x038e }
            int r0 = r2.size()     // Catch:{ 1Uc -> 0x038e }
            long r0 = (long) r0     // Catch:{ 1Uc -> 0x038e }
            r3.A02(r5, r8, r0)     // Catch:{ 1Uc -> 0x038e }
            X.2Cs r0 = new X.2Cs     // Catch:{ 1Uc -> 0x038e }
            r0.<init>(r2)     // Catch:{ 1Uc -> 0x038e }
            r9.BrF(r0)     // Catch:{ 1Uc -> 0x038e }
            goto L_0x03bb
        L_0x033d:
            if (r22 == 0) goto L_0x03bb
        L_0x033f:
            if (r12 == 0) goto L_0x0369
            java.lang.String r0 = "endCursor"
            java.lang.String r20 = r12.A0F(r0)     // Catch:{ 1Uc -> 0x038e }
            r6.L$0 = r11     // Catch:{ 1Uc -> 0x038e }
            r6.L$1 = r8     // Catch:{ 1Uc -> 0x038e }
            r6.L$2 = r9     // Catch:{ 1Uc -> 0x038e }
            r6.L$3 = r5     // Catch:{ 1Uc -> 0x038e }
            r6.L$4 = r4     // Catch:{ 1Uc -> 0x038e }
            r0 = 2
            r6.label = r0     // Catch:{ 1Uc -> 0x038e }
            r21 = r6
            r22 = r29
            r23 = r7
            r16 = r11
            r17 = r10
            r18 = r9
            r19 = r8
            java.lang.Object r0 = A00(r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 1Uc -> 0x038e }
            if (r0 != r15) goto L_0x03bb
            return r15
        L_0x0369:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 1Uc -> 0x038e }
            r0.<init>(r1)     // Catch:{ 1Uc -> 0x038e }
            throw r0     // Catch:{ 1Uc -> 0x038e }
        L_0x0371:
            if (r7 == 0) goto L_0x037f
            X.1Ua r3 = r11.A01     // Catch:{ 1Uc -> 0x038e }
            X.11P r0 = r3.A01     // Catch:{ 1Uc -> 0x038e }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ 1Uc -> 0x038e }
            r2 = 7
            X.C26931Ua.A00(r3, r2, r0)     // Catch:{ 1Uc -> 0x038e }
        L_0x037f:
            X.2Cv r0 = X.C50852Wa.A02     // Catch:{ 1Uc -> 0x038e }
            java.util.List r1 = r11.A04     // Catch:{ 1Uc -> 0x038e }
            X.2Cs r0 = new X.2Cs     // Catch:{ 1Uc -> 0x038e }
            r0.<init>(r1)     // Catch:{ 1Uc -> 0x038e }
            r9.BrF(r0)     // Catch:{ 1Uc -> 0x038e }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ 1Uc -> 0x038e }
            return r0
        L_0x038e:
            r4 = move-exception
            X.1UK r3 = r11.A02
            java.util.List r0 = r11.A04
            int r0 = r0.size()
            long r1 = (long) r0
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A01 = r0
            r5.A02 = r0
            r5.A03 = r8
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r5.A08 = r0
            X.AnonymousClass1UK.A00(r3, r5)
            X.18K r0 = r3.A02
            r0.CC7(r5)
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)
            r9.BrC(r4)
        L_0x03bb:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.contact.sync.NativeContactsDownloadHelper.A00(com.whatsapp.contact.sync.NativeContactsDownloadHelper, com.whatsapp.jid.UserJid, X.1Ug, java.lang.Integer, java.lang.String, X.1dr, int, boolean):java.lang.Object");
    }
}
