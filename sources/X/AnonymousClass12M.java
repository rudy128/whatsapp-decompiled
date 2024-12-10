package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.12M  reason: invalid class name */
public class AnonymousClass12M implements C201511a {
    public static final AnonymousClass1MD[] A0J = new AnonymousClass1MD[0];
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass11P A02;
    public final C18030ve A03;
    public final AnonymousClass10I A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final Map A0D = new HashMap();
    public final Set A0E = Collections.synchronizedSet(new HashSet());
    public final AnonymousClass1MC A0F;
    public final AnonymousClass1ME A0G = new Object();
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;

    public static void A03(AnonymousClass12M r12, AnonymousClass1EC r13, B9K b9k, Runnable runnable, String str, AnonymousClass1MD[] r17, int i) {
        AnonymousClass12M r6 = r12;
        AnonymousClass00H r3 = r12.A0A;
        String A0B2 = ((AnonymousClass1OZ) r3.get()).A0B();
        String str2 = str;
        C29621ca r4 = new C29621ca(str2, r17);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2));
        arrayList.add(new AnonymousClass1MD("xmlns", "w:g2"));
        arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        arrayList.add(new AnonymousClass1MD((Jid) r13, "to"));
        C29621ca r11 = new C29621ca(r4, "iq", (AnonymousClass1MD[]) arrayList.toArray(A0J));
        ((AnonymousClass1OZ) r3.get()).A0N(new C20979AcX(r6, b9k, runnable, str2, 0), r11, A0B2, i, 32000);
    }

    public void A0F(C75033dN r12, AnonymousClass1EC r13, int i, int i2) {
        AnonymousClass1MD[] r9;
        int i3;
        String str;
        if (i > 0) {
            r9 = C18020vd.A05(C18040vf.A02, this.A03, 7141) ? new AnonymousClass1MD[]{new AnonymousClass1MD("expiration", i), new AnonymousClass1MD("trigger", i2)} : new AnonymousClass1MD[]{new AnonymousClass1MD("expiration", i)};
            str = "ephemeral";
            i3 = 224;
        } else {
            r9 = null;
            i3 = 224;
            str = "not_ephemeral";
        }
        A03(this, r13, r12, r12, str, r9, i3);
        StringBuilder sb = new StringBuilder();
        sb.append("GroupXmppMethods/set-ephemeral-setting; ephemeralDuration=");
        sb.append(i);
        Log.i(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r3 = r6.A00;
        r1 = new java.lang.StringBuilder();
        r1.append(r8);
        r1.append(" - ");
        r1.append(r9);
        r3.A0G("GroupLidInfra/addressing_mode_mismatch", r1.toString(), false);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.AnonymousClass1EC r7, java.lang.String r8, int r9) {
        /*
            r6 = this;
            r0 = 5
            if (r0 == r9) goto L_0x0006
            r0 = 6
            if (r0 != r9) goto L_0x0050
        L_0x0006:
            java.util.Set r5 = r6.A0E
            monitor-enter(r5)
            boolean r0 = r5.contains(r7)     // Catch:{ all -> 0x0032 }
            r4 = 0
            if (r0 == 0) goto L_0x002d
            X.190 r3 = r6.A00     // Catch:{ all -> 0x0032 }
            java.lang.String r2 = "GroupLidInfra/one_in_flight_group_info_mismatch"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
            r1.<init>()     // Catch:{ all -> 0x0032 }
            r1.append(r8)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = " - "
            r1.append(r0)     // Catch:{ all -> 0x0032 }
            r1.append(r9)     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0032 }
            r3.A0G(r2, r0, r4)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            return
        L_0x002d:
            r5.add(r7)     // Catch:{ all -> 0x0032 }
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            goto L_0x0035
        L_0x0032:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0032 }
            throw r0
        L_0x0035:
            X.190 r3 = r6.A00
            java.lang.String r2 = "GroupLidInfra/addressing_mode_mismatch"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r8)
            java.lang.String r0 = " - "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            r3.A0G(r2, r0, r4)
        L_0x0050:
            X.2sm r0 = new X.2sm
            r0.<init>(r8, r9)
            r6.A0C(r0, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12M.A0H(X.1EC, java.lang.String, int):void");
    }

    public static void A01(C63262sm r1, AnonymousClass12M r2, AnonymousClass1EC r3) {
        int i = r1.A00;
        if (5 == i || 6 == i) {
            Set set = r2.A0E;
            synchronized (set) {
                set.remove(r3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r14.A03, 11262) == false) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass12M r18, X.AnonymousClass1EC r19, X.AnonymousClass1O5 r20, java.lang.String r21, java.util.List r22, int r23, boolean r24) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "GroupXmppMethods/"
            r1.append(r0)
            r13 = r21
            r1.append(r13)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r17 = r20
            if (r20 == 0) goto L_0x00f3
            r14 = r18
            X.00H r1 = r14.A0A
            java.lang.Object r0 = r1.get()
            X.1OZ r0 = (X.AnonymousClass1OZ) r0
            java.lang.String r16 = r0.A0B()
            java.lang.Object r12 = r1.get()
            X.1OZ r12 = (X.AnonymousClass1OZ) r12
            r15 = r22
            int r11 = r15.size()
            X.1ca[] r10 = new X.C29621ca[r11]
            java.lang.String r0 = "add"
            boolean r0 = r13.equals(r0)
            r9 = 1
            r8 = 0
            if (r0 == 0) goto L_0x004d
            X.0ve r2 = r14.A03
            r1 = 11262(0x2bfe, float:1.5781E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r7 = 0
            if (r0 == 0) goto L_0x0094
            X.00H r0 = r14.A0C
            java.lang.Object r0 = r0.get()
            X.1Mx r0 = (X.C25111Mx) r0
            java.util.LinkedHashMap r6 = r0.A09(r15)
        L_0x005d:
            r5 = 0
        L_0x005e:
            if (r5 >= r11) goto L_0x0096
            java.lang.Object r4 = r15.get(r5)
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            if (r6 == 0) goto L_0x0092
            boolean r0 = r6.containsKey(r4)
            if (r0 == 0) goto L_0x0092
            java.lang.Object r1 = r6.get(r4)
            byte[] r1 = (byte[]) r1
            java.lang.String r0 = "privacy"
            X.1ca r3 = new X.1ca
            r3.<init>((java.lang.String) r0, (byte[]) r1, (X.AnonymousClass1MD[]) r7)
        L_0x007b:
            X.1MD[] r2 = new X.AnonymousClass1MD[r9]
            java.lang.String r1 = "jid"
            X.1MD r0 = new X.1MD
            r0.<init>((com.whatsapp.jid.Jid) r4, (java.lang.String) r1)
            r2[r8] = r0
            java.lang.String r1 = "participant"
            X.1ca r0 = new X.1ca
            r0.<init>((X.C29621ca) r3, (java.lang.String) r1, (X.AnonymousClass1MD[]) r2)
            r10[r5] = r0
            int r5 = r5 + 1
            goto L_0x005e
        L_0x0092:
            r3 = r7
            goto L_0x007b
        L_0x0094:
            r6 = r7
            goto L_0x005d
        L_0x0096:
            X.1ca r3 = new X.1ca
            r3.<init>((java.lang.String) r13, (X.AnonymousClass1MD[]) r7, (X.C29621ca[]) r10)
            r0 = 4
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]
            java.lang.String r2 = "id"
            X.1MD r1 = new X.1MD
            r0 = r16
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r4[r8] = r1
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:g2"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r4[r9] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "set"
            X.1MD r1 = new X.1MD
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r4[r0] = r1
            java.lang.String r0 = "to"
            X.1MD r1 = new X.1MD
            r2 = r19
            r1.<init>((com.whatsapp.jid.Jid) r2, (java.lang.String) r0)
            r0 = 3
            r4[r0] = r1
            if (r24 == 0) goto L_0x00db
            java.lang.String r1 = "admin"
            X.1ca r0 = new X.1ca
            r0.<init>((X.C29621ca) r3, (java.lang.String) r1, (X.AnonymousClass1MD[]) r7)
            r3 = r0
        L_0x00db:
            java.lang.String r0 = "iq"
            X.1ca r2 = new X.1ca
            r2.<init>((X.C29621ca) r3, (java.lang.String) r0, (X.AnonymousClass1MD[]) r4)
            X.374 r1 = new X.374
            r0 = r17
            r1.<init>(r14, r0, r13, r8)
            r5 = 32000(0x7d00, double:1.581E-319)
            r4 = r23
            r0 = r12
            r3 = r16
            r0.A0N(r1, r2, r3, r4, r5)
        L_0x00f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass12M.A04(X.12M, X.1EC, X.1O5, java.lang.String, java.util.List, int, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [java.lang.Object, X.5qs] */
    public C114465qs A05(BC2 bc2, C55082fB r17) {
        AnonymousClass00H r3 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r3.get()).A0B();
        C55082fB r7 = r17;
        C29621ca r10 = new C29621ca(new C29621ca(new C29621ca("add_request", new AnonymousClass1MD[]{new AnonymousClass1MD("code", r7.A03), new AnonymousClass1MD("expiration", Long.toString(r7.A00)), new AnonymousClass1MD((Jid) r7.A02, "admin")}), "query", (AnonymousClass1MD[]) null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((Jid) r7.A01, "to")});
        ? obj = new Object();
        ((AnonymousClass1OZ) r3.get()).A0I(new C20993Acl(obj, this, bc2, 11), r10, A0B2, 208, 32000);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.5qs] */
    public C114465qs A06(BC2 bc2, String str) {
        AnonymousClass00H r6 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r6.get()).A0B();
        ? obj = new Object();
        BC2 bc22 = bc2;
        String str2 = str;
        if (C18020vd.A05(C18040vf.A02, this.A03, 9428)) {
            C18070vi.A0d(str2, 0);
            GraphQlCallInput graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A05("invite_code", str2);
            graphQlCallInput.A05("query_context", "GET_GROUP_BY_INVITE_CODE");
            A7K a7k = new A7K();
            a7k.A04(graphQlCallInput, "input");
            ((AnonymousClass1PY) this.A0H.get()).A01(new AIj(a7k, QueryGroupInfoByCodeResponseImpl.class, "QueryGroupInfoByCode")).A03(new C172738tw(obj, this, bc22, 1));
            return obj;
        }
        ((AnonymousClass1OZ) r6.get()).A0J(new C20993Acl(obj, this, bc22, 10), new C29621ca(new C29621ca("invite", new AnonymousClass1MD[]{new AnonymousClass1MD("code", str2)}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((Jid) C173428v3.A00, "to")}), A0B2, 107, 32000);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.5qs] */
    public C114465qs A07(BC3 bc3, AnonymousClass1EC r13, String str, String str2, String str3) {
        AnonymousClass00H r2 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r2.get()).A0B();
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new AnonymousClass1MD("prev", str));
        }
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2));
        }
        String str4 = str3;
        C29621ca r6 = null;
        if (TextUtils.isEmpty(str4)) {
            arrayList.add(new AnonymousClass1MD("delete", "true"));
        } else {
            r6 = new C29621ca("body", str4, (AnonymousClass1MD[]) null);
        }
        C29621ca r62 = new C29621ca(new C29621ca(r6, "description", (AnonymousClass1MD[]) arrayList.toArray(A0J)), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((Jid) r13, "to")});
        ? obj = new Object();
        ((AnonymousClass1OZ) r2.get()).A0I(new C20993Acl(obj, this, bc3, 12), r62, A0B2, 134, 32000);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r12v1, types: [java.lang.Object, X.5qs] */
    public C114465qs A08(C183169Xf r18, AnonymousClass1EC r19, List list) {
        C29621ca[] r8;
        AnonymousClass00H r4 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r4.get()).A0B();
        List list2 = list;
        if (list2.size() > 0) {
            int size = list2.size();
            r8 = new C29621ca[size];
            for (int i = 0; i < size; i++) {
                r8[i] = new C29621ca("participant", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) list2.get(i), "jid")});
            }
        } else {
            r8 = null;
        }
        AnonymousClass1EC r15 = r19;
        C29621ca r0 = new C29621ca(new C29621ca("revoke", (AnonymousClass1MD[]) null, r8), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((Jid) r15, "to")});
        ? obj = new Object();
        ((AnonymousClass1OZ) r4.get()).A0I(new C20978AcW(obj, this, r18, r15, 3), r0, A0B2, 210, 32000);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [java.lang.Object, X.5qs] */
    public C114465qs A09(B8C b8c, B9K b9k, C55082fB r31) {
        C55082fB r2 = r31;
        AnonymousClass1EC r15 = r2.A01;
        AnonymousClass00H r9 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r9.get()).A0B();
        ? obj = new Object();
        String str = r2.A03;
        long j = r2.A00;
        UserJid userJid = r2.A02;
        C29591cX r3 = new C29591cX("iq");
        r3.A04(new AnonymousClass1MD("xmlns", "w:g2"));
        r3.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
        r3.A04(new AnonymousClass1MD((Jid) r15, "to"));
        if (C29601cY.A04(A0B2, 0, 9007199254740991L, false)) {
            r3.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2));
        }
        C29591cX r22 = new C29591cX("accept");
        if (C29601cY.A04(str, 16, 16, false)) {
            r22.A04(new AnonymousClass1MD("code", str));
        }
        if (C29601cY.A03(Long.valueOf(j), 0, 9007199254740991L, false)) {
            r22.A04(new AnonymousClass1MD("expiration", j));
        }
        r22.A04(new AnonymousClass1MD((Jid) userJid, "admin"));
        r3.A05(r22.A03());
        C29621ca A032 = r3.A03();
        ((AnonymousClass1OZ) r9.get()).A0I(new C20982Aca(obj, this, b8c, r15, b9k, 2), A032, A0B2, 209, 32000);
        return obj;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, X.5qs] */
    public C114465qs A0A(B8C b8c, B9K b9k, String str) {
        AnonymousClass00H r3 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r3.get()).A0B();
        C29621ca r11 = new C29621ca(new C29621ca("invite", new AnonymousClass1MD[]{new AnonymousClass1MD("code", str)}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((Jid) C173428v3.A00, "to")});
        ? obj = new Object();
        ((AnonymousClass1OZ) r3.get()).A0I(new C20978AcW(obj, this, b8c, b9k, 2), r11, A0B2, AnonymousClass74N.A03, 32000);
        return obj;
    }

    public void A0B(AnonymousClass40e r4) {
        if (!C18020vd.A05(C18040vf.A02, this.A03, 11392)) {
            this.A04.CGS(new C146507Pj(this, r4, 6), "GroupXmppMethods/sendAddParticipants");
        }
    }

    public void A0C(C63262sm r19, AnonymousClass1EC r20) {
        AnonymousClass1EC r4 = r20;
        if (!((C54562eL) this.A05.get()).A00.A02(r4)) {
            Log.w("GroupXmppMethods/skip sendGetGroupInfo");
            return;
        }
        C63262sm r5 = r19;
        String str = r5.A01;
        StringBuilder sb = new StringBuilder();
        sb.append("GroupXmppMethods/sendGetGroupInfo");
        sb.append('/');
        sb.append(str);
        Log.w(sb.toString());
        this.A0D.put(r4, Long.valueOf(AnonymousClass11P.A01(this.A02)));
        String str2 = r5.A02;
        int A002 = C18020vd.A00(C18040vf.A02, this.A03, 8179);
        if (A002 == 0) {
            AnonymousClass00H r1 = this.A0A;
            String A0B2 = ((AnonymousClass1OZ) r1.get()).A0B();
            ((AnonymousClass1OZ) r1.get()).A0N(new C20993Acl(r4, this, r5, 13), new C29621ca(new C29621ca("query", str2 != null ? new AnonymousClass1MD[]{new AnonymousClass1MD("request", str), new AnonymousClass1MD("phash", str2)} : new AnonymousClass1MD[]{new AnonymousClass1MD("request", str)}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get"), new AnonymousClass1MD((Jid) r4, "to")}), A0B2, 20, 32000);
        } else if (A002 == 1) {
            ((AnonymousClass1PY) this.A0H.get()).A01(this.A0G.A01(r4, str, str2)).A03(new C172738tw(r4, this, r5, 0));
        }
    }

    public void A0D(C75033dN r19) {
        Log.i("GroupXmppMethod/sendLeaveGroup");
        AnonymousClass00H r1 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r1.get()).A0B();
        C75033dN r4 = r19;
        AnonymousClass1EC r2 = r4.A03;
        if (((AnonymousClass1OZ) r1.get()).A0N(new C97564pg(r4, this, 0, r4.A06), new C29621ca(new C29621ca("leave", (AnonymousClass1MD[]) null, new C29621ca[]{new C29621ca("group", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) r2, (String) PublicKeyCredentialControllerUtility.JSON_KEY_ID)})}), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((Jid) C173428v3.A00, "to")}), A0B2, 16, 32000)) {
            this.A0F.A00(r2, 5);
            this.A04.CGF(new C146507Pj(this, r4, 5));
        }
    }

    public void A0E(C75033dN r12) {
        AnonymousClass00H r3 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r3.get()).A0B();
        C29621ca r6 = new C29621ca(new C29621ca("subject", r12.A04, (AnonymousClass1MD[]) null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:g2"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"), new AnonymousClass1MD((Jid) r12.A03, "to")});
        C97554pf r5 = new C97554pf(r12, this, 0);
        Log.i("GroupXmppMethods/sendSetGroupSubject");
        ((AnonymousClass1OZ) r3.get()).A0N(r5, r6, A0B2, 17, 32000);
    }

    public void A0G(C108075b5 r16, C55082fB r17) {
        AnonymousClass00H r6 = this.A0A;
        String A0B2 = ((AnonymousClass1OZ) r6.get()).A0B();
        C55082fB r7 = r17;
        C29621ca r10 = new C29621ca(new C29621ca(new C29621ca("add_request", new AnonymousClass1MD[]{new AnonymousClass1MD("code", r7.A03), new AnonymousClass1MD("expiration", Long.toString(r7.A00)), new AnonymousClass1MD((Jid) r7.A02, "admin")}), "picture", (AnonymousClass1MD[]) null), "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", "w:profile:picture"), new AnonymousClass1MD((Jid) r7.A01, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get")});
        ((AnonymousClass1OZ) r6.get()).A0I(new C97574ph(r16, this, r7, 0), r10, A0B2, 212, 32000);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.1ME] */
    public AnonymousClass12M(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1MC r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass10I r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14, AnonymousClass00H r15, AnonymousClass00H r16, AnonymousClass00H r17) {
        this.A02 = r5;
        this.A03 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r7;
        this.A0A = r8;
        this.A08 = r9;
        this.A07 = r12;
        this.A0F = r4;
        this.A05 = r10;
        this.A0H = r11;
        this.A06 = r13;
        this.A0C = r14;
        this.A0B = r15;
        this.A09 = r16;
        this.A0I = r17;
    }

    public static C29621ca A00(String str, List list) {
        int size = list.size();
        C29621ca[] r6 = new C29621ca[size];
        for (int i = 0; i < size; i++) {
            r6[i] = new C29621ca("participant", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) list.get(i), "jid")});
        }
        return new C29621ca(str, (AnonymousClass1MD[]) null, r6);
    }

    public static void A02(C63262sm r2, AnonymousClass12M r3, AnonymousClass1EC r4, int i) {
        StringBuilder sb;
        A01(r2, r3, r4);
        if (i == 429) {
            r3.A0D.put(r4, Long.valueOf(AnonymousClass11P.A01(r3.A02)));
        }
        AnonymousClass126 r32 = (AnonymousClass126) r3.A06.get();
        if (i == 403) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("groupmgr/groupInfoError/not a participant: ");
            sb2.append(r4);
            Log.e(sb2.toString());
            r32.A0h(Collections.singletonList(r4), true);
        } else if (i != 404) {
            sb.append("groupmgr/groupInfoError/groupjid = ");
            sb.append(r4);
            sb.append("errorcode = ");
            sb.append(i);
            Log.i(sb.toString());
        } else {
            sb = new StringBuilder();
            sb.append("groupmgr/groupInfoError/does not exist: ");
            sb.append(r4);
            Log.e(sb.toString());
            if (r32.A0I.A06(r4) == 1) {
                r32.A0h(Collections.singletonList(r4), false);
            }
        }
    }
}
