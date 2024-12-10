package X;

import android.content.ContentValues;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1MQ  reason: invalid class name */
public class AnonymousClass1MQ {
    public final AnonymousClass11S A00;
    public final AnonymousClass1Cd A01;
    public final AnonymousClass1MN A02;
    public final C24751Ln A03;
    public final AnonymousClass1MO A04;
    public final AnonymousClass1ML A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public volatile String A08;

    public void A06() {
        String str;
        synchronized (this) {
            AnonymousClass11S r2 = this.A00;
            r2.A0I();
            if (r2.A02 == null) {
                str = null;
            } else {
                HashSet hashSet = new HashSet(this.A04.A00().keySet());
                r2.A0I();
                hashSet.add(r2.A02);
                str = C63442t5.A03(hashSet);
            }
            this.A08 = str;
        }
    }

    public static C199410f A00(C199410f r5, UserJid userJid) {
        HashSet hashSet = new HashSet();
        AnonymousClass1IZ it = r5.iterator();
        while (it.hasNext()) {
            DeviceJid A042 = DeviceJid.Companion.A04(userJid, ((Jid) it.next()).getDevice());
            boolean z = false;
            if (A042 != null) {
                z = true;
            }
            C17960vV.A0F(z, "DeviceJid must not be null");
            if (A042 != null) {
                hashSet.add(A042);
            }
        }
        return C199410f.copyOf((Collection) hashSet);
    }

    public static void A01(C199410f r7, C199410f r8, C199410f r9, AnonymousClass1MQ r10, UserJid userJid) {
        boolean z;
        PhoneUserJid A0D;
        PhoneUserJid A0D2;
        C41851xA BD0;
        PhoneUserJid A0D3;
        C61772qE r3 = (C61772qE) r10.A06.get();
        if (!r9.isEmpty()) {
            if (r3.A04.A0Y()) {
                r3.A0A.CGF(new C70733Ch(r3, r9, 20));
            } else {
                ((C25581Ot) r3.A0C.get()).A02(new C70733Ch(r3, r9, 21));
            }
        }
        if (!r8.isEmpty() && !r9.isEmpty()) {
            HashSet hashSet = new HashSet(r7);
            hashSet.removeAll(r9);
            hashSet.addAll(r8);
            AnonymousClass1MZ r0 = r3.A07;
            C199410f copyOf = C199410f.copyOf((Collection) hashSet);
            AnonymousClass1MW r5 = r0.A08;
            if (!copyOf.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ParticipantUserStore/onDevicesRefreshed ");
                sb.append(userJid);
                sb.append("/");
                sb.append(copyOf);
                Log.i(sb.toString());
                HashSet A0G = r5.A0G(userJid);
                HashMap hashMap = new HashMap();
                Iterator it = A0G.iterator();
                while (it.hasNext()) {
                    C63872tp A0B = r5.A0B((AnonymousClass1E9) it.next());
                    C54072dY A0E = A0B.A0E(copyOf, userJid);
                    if (A0B.A00 != 0 && C22971Dz.A0T(userJid)) {
                        boolean A0X = A0B.A0X(r5.A01);
                        C63312sr A0D4 = A0B.A0D(userJid, false);
                        if (A0D4 != null && ((A0D4.A01 != 0 || A0X) && (A0D3 = r5.A09.A0D((AnonymousClass1E1) userJid)) != null)) {
                            A0B.A0E(AnonymousClass1MW.A01(copyOf, A0D3), A0D3);
                        }
                    }
                    if (A0E.A00 || A0E.A01) {
                        hashMap.put(A0B, Boolean.valueOf(A0E.A02));
                    }
                }
                if (!hashMap.isEmpty()) {
                    C28791au A052 = r5.A06.A05();
                    try {
                        BD0 = A052.BD0();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            AnonymousClass1MW.A06((C63872tp) entry.getKey(), r5, userJid, ((Boolean) entry.getValue()).booleanValue());
                        }
                        BD0.A00();
                        BD0.close();
                        A052.close();
                        return;
                    } catch (Throwable th) {
                        try {
                            A052.close();
                            throw th;
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                            throw th;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (!r8.isEmpty()) {
            AnonymousClass1MW r4 = r3.A07.A08;
            if (!r8.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ParticipantUserStore/onDevicesAdded ");
                sb2.append(userJid);
                sb2.append("/");
                sb2.append(r8);
                Log.i(sb2.toString());
                HashSet A0G2 = r4.A0G(userJid);
                HashSet hashSet2 = new HashSet();
                Iterator it2 = A0G2.iterator();
                while (it2.hasNext()) {
                    C63872tp A0B2 = r4.A0B((AnonymousClass1E9) it2.next());
                    AnonymousClass1MW.A04(r8, A0B2, r4, userJid);
                    if (A0B2.A00 != 0 && C22971Dz.A0T(userJid)) {
                        boolean A0X2 = A0B2.A0X(r4.A01);
                        C63312sr A0D5 = A0B2.A0D(userJid, false);
                        if (A0D5 != null && ((A0D5.A01 != 0 || A0X2) && (A0D2 = r4.A09.A0D((AnonymousClass1E1) userJid)) != null)) {
                            AnonymousClass1MW.A04(AnonymousClass1MW.A01(r8, A0D2), A0B2, r4, A0D2);
                        }
                    }
                    hashSet2.add(A0B2);
                }
                AnonymousClass1MW.A07(r4, userJid, hashSet2, false);
                return;
            }
            return;
        } else if (!r9.isEmpty()) {
            AnonymousClass1MW r52 = r3.A07.A08;
            if (!r9.isEmpty()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ParticipantUserStore/onDevicesRemoved ");
                sb3.append(userJid);
                sb3.append("/");
                sb3.append(r9);
                Log.i(sb3.toString());
                HashSet A0G3 = r52.A0G(userJid);
                HashSet hashSet3 = new HashSet();
                Iterator it3 = A0G3.iterator();
                boolean z2 = false;
                while (it3.hasNext()) {
                    C63872tp A0B3 = r52.A0B((AnonymousClass1E9) it3.next());
                    boolean A0V = A0B3.A0V(r9, userJid);
                    if (A0B3.A00 != 0 && C22971Dz.A0T(userJid)) {
                        boolean A0X3 = A0B3.A0X(r52.A01);
                        C63312sr A0D6 = A0B3.A0D(userJid, false);
                        if (A0D6 != null && ((A0D6.A01 != 0 || A0X3) && (A0D = r52.A09.A0D((AnonymousClass1E1) userJid)) != null)) {
                            z = A0B3.A0V(AnonymousClass1MW.A01(r9, A0D), A0D);
                            z2 = z2 | z | A0V;
                            hashSet3.add(A0B3);
                        }
                    }
                    z = false;
                    z2 = z2 | z | A0V;
                    hashSet3.add(A0B3);
                }
                AnonymousClass1MW.A07(r52, userJid, hashSet3, z2);
                return;
            }
            return;
        } else {
            return;
        }
        throw th;
    }

    public static void A02(C199410f r12, C199410f r13, C199410f r14, AnonymousClass1MQ r15, UserJid userJid, boolean z, boolean z2) {
        C61772qE r6 = (C61772qE) r15.A06.get();
        C199410f r9 = r14;
        UserJid userJid2 = userJid;
        if (!r14.isEmpty()) {
            HashSet A0H = r6.A07.A08.A0H(r14);
            boolean z3 = z2;
            if (r6.A04.A0Y()) {
                r6.A0A.CGF(new C21437Ak4(r6, A0H, userJid2, r9, 12, z3));
            }
            ((C25581Ot) r6.A0C.get()).A02(new C21437Ak4(r6, A0H, userJid2, r9, 13, z3));
        }
        if (!r13.isEmpty() || !r14.isEmpty() || !z) {
            if (r6.A03.A2M() && z) {
                r13.toString();
                r14.toString();
                AnonymousClass11S r2 = r6.A00;
                if (r2.A0O(userJid2)) {
                    Iterator it = r6.A01.A06().iterator();
                    while (it.hasNext()) {
                        r2.A0O((AnonymousClass1BI) it.next());
                    }
                } else if (!r12.isEmpty()) {
                    if (r6.A01.A0G(userJid2)) {
                        r6.A06.BBY(r6.A09.A04(userJid2, userJid2, AnonymousClass11P.A01(r6.A02)));
                    }
                    Iterator it2 = C61772qE.A00(r6, userJid2).iterator();
                    while (it2.hasNext()) {
                        r6.A06.BBY(r6.A09.A04((AnonymousClass1BI) it2.next(), userJid2, AnonymousClass11P.A01(r6.A02)));
                    }
                }
            }
        } else if (r6.A03.A2M()) {
            if (r6.A01.A0G(userJid2)) {
                r6.A06.BBY(r6.A09.A04(userJid2, userJid2, AnonymousClass11P.A01(r6.A02)));
            }
            Iterator it3 = C61772qE.A00(r6, userJid2).iterator();
            while (it3.hasNext()) {
                r6.A06.BBY(r6.A09.A04((AnonymousClass1BI) it3.next(), userJid2, AnonymousClass11P.A01(r6.A02)));
            }
        }
        if (r6.A00.A0O(userJid2)) {
            Iterator it4 = r14.iterator();
            while (it4.hasNext()) {
                if (C62832s4.A00((Jid) it4.next())) {
                    r6.A0B.get();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [X.2MC] */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0202, code lost:
        if (r11 != -1) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0204, code lost:
        if (r8 == r11) goto L_0x0106;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A03(X.C28781at r17, X.C62512rW r18, X.C62512rW r19, X.AnonymousClass1MQ r20, com.whatsapp.jid.UserJid r21) {
        /*
            r1 = r18
            r3 = r19
            if (r18 != 0) goto L_0x000a
            if (r19 != 0) goto L_0x000a
        L_0x0008:
            r6 = 1
            return r6
        L_0x000a:
            r0 = 1
            if (r18 != 0) goto L_0x0240
            int r1 = r3.A00
        L_0x000f:
            if (r1 != r0) goto L_0x0008
        L_0x0011:
            r0 = r20
            X.00H r0 = r0.A07
            java.lang.Object r2 = r0.get()
            X.2dw r2 = (X.C54312dw) r2
            if (r19 == 0) goto L_0x023c
            int r1 = r3.A00
            r0 = 1
            if (r1 != r0) goto L_0x023c
            X.2RD r3 = X.AnonymousClass2RD.HOSTED
        L_0x0024:
            r0 = 1
            r4 = r21
            X.C18070vi.A0d(r4, r0)
            X.11S r0 = r2.A00
            r21 = r0
            boolean r19 = r0.A0O(r4)
            if (r19 != 0) goto L_0x0040
            r1 = 46
            X.3Bq r0 = new X.3Bq
            r0.<init>(r2, r1)
            r1 = r17
            r1.BJ7(r0)
        L_0x0040:
            X.00H r0 = r2.A02
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.12A> r0 = X.AnonymousClass12A.class
            X.11a r7 = r1.A01(r0)
            X.12A r7 = (X.AnonymousClass12A) r7
            r6 = 0
            X.11S r0 = r7.A01
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged: Only SMB supports CoEx!"
            X.C17960vV.A0F(r6, r0)
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/onUserADVAccountEncryptionTypeChanged invalid for this application"
        L_0x0060:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0063:
            r6 = 0
        L_0x0064:
            X.2GP r5 = new X.2GP
            r5.<init>()
            java.lang.String r0 = r4.user
            r5.A06 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)
            r5.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r5.A00 = r0
            int r0 = r21.A06()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A05 = r0
            X.2RD r1 = X.AnonymousClass2RD.HOSTED
            r0 = 1
            if (r3 != r1) goto L_0x008a
            r0 = 0
        L_0x008a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A04 = r0
            X.18K r0 = r2.A01
            r0.CC7(r5)
            return r6
        L_0x0096:
            X.00H r0 = r7.A05
            java.lang.Object r0 = r0.get()
            X.2Zm r0 = (X.C51752Zm) r0
            X.0ve r1 = r0.A00
            r0 = 6939(0x1b1b, float:9.724E-42)
            X.0vf r10 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r10, r1, r0)
            if (r0 != 0) goto L_0x00c8
            X.2RD r0 = X.AnonymousClass2RD.HOSTED
            if (r3 != r0) goto L_0x00c8
            X.190 r5 = r7.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ADV: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "unexpected-hosted-device"
            r5.A0G(r0, r1, r6)
            goto L_0x0063
        L_0x00c8:
            X.0vl r0 = r7.A06
            java.lang.Object r5 = r0.getValue()
            X.122 r5 = (X.AnonymousClass122) r5
            X.00H r0 = r7.A03
            java.lang.Object r0 = r0.get()
            X.1Ok r0 = (X.C25491Ok) r0
            X.00H r0 = r0.A02
            r0.get()
            boolean r0 = X.C22971Dz.A0T(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0109
            X.00H r0 = r5.A1A
            java.lang.Object r0 = r0.get()
            X.9oM r0 = (X.C192419oM) r0
            X.2Qs r7 = r0.A00(r4)
            X.2Qs r0 = X.C49502Qs.CTWA
            if (r7 == r0) goto L_0x0109
            X.1CJ r0 = r5.A0D
            boolean r0 = r0.A0P(r4)
            if (r0 != 0) goto L_0x0109
            X.0ve r7 = r5.A0q
            r0 = 11653(0x2d85, float:1.633E-41)
            boolean r0 = X.C18020vd.A05(r10, r7, r0)
            if (r0 == 0) goto L_0x0109
        L_0x0106:
            r6 = 1
            goto L_0x0064
        L_0x0109:
            X.1NK r0 = r5.A0a
            boolean r0 = r0.A09(r4)
            if (r0 != 0) goto L_0x0151
            X.2RD r0 = X.AnonymousClass2RD.HOSTED
            if (r3 != r0) goto L_0x0151
            X.1PQ r8 = r5.A11
            X.11P r0 = r5.A0A
            long r0 = X.AnonymousClass11P.A01(r0)
            X.11S r6 = r5.A06
            boolean r7 = r6.A0O(r4)
            r6 = 16
            if (r7 == 0) goto L_0x0129
            r6 = 17
        L_0x0129:
            X.2MC r9 = r8.A0D(r4, r6, r0)
        L_0x012d:
            r0 = -1
            X.AnonymousClass122.A07(r5, r9, r0)
            X.2Rs r0 = r5.A0J(r9, r0)
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0106
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "BusinessPrivacySystemMessageUpdater/insert transitional system message for jid: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " failed"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0060
        L_0x0151:
            X.1RZ r8 = r5.A14
            X.2RD r0 = X.AnonymousClass2RD.HOSTED
            r14 = 1
            if (r3 != r0) goto L_0x0159
            r14 = 5
        L_0x0159:
            X.1PQ r7 = r8.A04
            X.11P r0 = r8.A02
            long r15 = X.AnonymousClass11P.A01(r0)
            X.1yi r0 = X.C42771yi.A00()
            java.lang.String r13 = X.AnonymousClass17K.A00(r0, r4)
            r11 = r7
            r12 = r4
            X.2MD r9 = r11.A03(r12, r13, r14, r15)
            X.0ve r15 = r5.A0q
            r14 = 10133(0x2795, float:1.42E-41)
            boolean r0 = X.C18020vd.A05(r10, r15, r14)
            if (r0 == 0) goto L_0x012d
            int r8 = r9.A00
            X.1N2 r0 = r5.A0h
            X.1LW r13 = r0.A01
            long r17 = r13.A09(r4)
            X.1Cd r0 = r0.A03
            r20 = r0
            X.1at r16 = r20.get()
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0256 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0256 }
            java.lang.String r11 = "SELECT message_system_business_state.message_row_id, message_system_business_state.privacy_message_type FROM message_system_business_state JOIN message ON message_row_id = _id WHERE chat_row_id = ? ORDER BY sort_id DESC LIMIT 1"
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0256 }
            r7[r6] = r0     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "GET_LAST_SYSTEM_MESSAGE_BUSINESS"
            android.database.Cursor r12 = r12.A0A(r11, r0, r7)     // Catch:{ all -> 0x0256 }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x01b5
            java.lang.String r0 = "privacy_message_type"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x024a }
            int r11 = r12.getInt(r0)     // Catch:{ all -> 0x024a }
            r12.close()     // Catch:{ all -> 0x0256 }
            goto L_0x01bd
        L_0x01b5:
            r12.close()     // Catch:{ all -> 0x0256 }
            r16.close()
            r11 = -1
            goto L_0x01c0
        L_0x01bd:
            r16.close()
        L_0x01c0:
            r7 = -1
            if (r11 != r7) goto L_0x0201
            boolean r0 = X.C18020vd.A05(r10, r15, r14)
            if (r0 == 0) goto L_0x0201
            long r13 = r13.A09(r4)
            X.1at r16 = r20.get()
            r0 = r16
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0256 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0256 }
            java.lang.String r10 = "SELECT biz_state_id FROM message_system_initial_privacy_provider JOIN message ON message_row_id = _id WHERE chat_row_id = ? ORDER BY sort_id DESC LIMIT 1"
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0256 }
            r1[r6] = r0     // Catch:{ all -> 0x0256 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_INITIAL_PRIVACY_PROVIDER_FOR_CHAT"
            android.database.Cursor r12 = r12.A0A(r10, r0, r1)     // Catch:{ all -> 0x0256 }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x024a }
            if (r0 == 0) goto L_0x01fb
            java.lang.String r0 = "biz_state_id"
            int r0 = r12.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x024a }
            int r10 = r12.getInt(r0)     // Catch:{ all -> 0x024a }
            r12.close()     // Catch:{ all -> 0x0256 }
            goto L_0x0208
        L_0x01fb:
            r12.close()     // Catch:{ all -> 0x0256 }
            r16.close()
        L_0x0201:
            r1 = -1
            if (r11 == r7) goto L_0x0232
        L_0x0204:
            if (r8 != r11) goto L_0x012d
            goto L_0x0106
        L_0x0208:
            r16.close()
            if (r10 == r7) goto L_0x0201
            X.190 r7 = r5.A04
            r0 = 16
            r1 = 5
            if (r10 == r0) goto L_0x0232
            r0 = 17
            if (r10 == r0) goto L_0x023a
            switch(r10) {
                case 0: goto L_0x0234;
                case 1: goto L_0x0234;
                case 2: goto L_0x0234;
                case 3: goto L_0x0234;
                case 4: goto L_0x0234;
                case 5: goto L_0x0236;
                case 6: goto L_0x0236;
                case 7: goto L_0x0238;
                case 8: goto L_0x0238;
                case 9: goto L_0x0236;
                case 10: goto L_0x0236;
                default: goto L_0x021b;
            }
        L_0x021b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Unsupported business state:"
            r1.append(r0)
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "BusinessState/getBusinessTransitionFromBusinessState"
            r7.A0G(r0, r1, r6)
            r1 = -1
        L_0x0232:
            r11 = r1
            goto L_0x0204
        L_0x0234:
            r1 = 1
            goto L_0x0232
        L_0x0236:
            r1 = 2
            goto L_0x0232
        L_0x0238:
            r1 = 3
            goto L_0x0232
        L_0x023a:
            r1 = 4
            goto L_0x0232
        L_0x023c:
            X.2RD r3 = X.AnonymousClass2RD.E2EE
            goto L_0x0024
        L_0x0240:
            int r1 = r1.A00
            if (r19 == 0) goto L_0x000f
            int r0 = r3.A00
            if (r1 == r0) goto L_0x0008
            goto L_0x0011
        L_0x024a:
            r1 = move-exception
            if (r12 == 0) goto L_0x0255
            r12.close()     // Catch:{ all -> 0x0251 }
            goto L_0x0255
        L_0x0251:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0256 }
        L_0x0255:
            throw r1     // Catch:{ all -> 0x0256 }
        L_0x0256:
            r1 = move-exception
            r16.close()     // Catch:{ all -> 0x025b }
            throw r1
        L_0x025b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MQ.A03(X.1at, X.2rW, X.2rW, X.1MQ, com.whatsapp.jid.UserJid):boolean");
    }

    public C201110w A04() {
        AnonymousClass1IZ it = this.A04.A00().entrySet().iterator();
        C201210x r6 = new C201210x();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!AnonymousClass000.A1R((((C88344Zh) entry.getValue()).A01 > 0 ? 1 : (((C88344Zh) entry.getValue()).A01 == 0 ? 0 : -1)))) {
                r6.put(entry.getKey(), entry.getValue());
            }
        }
        return r6.build();
    }

    public C201110w A05(UserJid userJid) {
        AnonymousClass1E1 A032;
        C17960vV.A0H(!this.A00.A0O(userJid), "only get user for others");
        AnonymousClass1ML r4 = this.A05;
        if (userJid instanceof PhoneUserJid) {
            if (C18020vd.A05(C18040vf.A02, r4.A05, 7088) && (A032 = r4.A06.A03((PhoneUserJid) userJid, "getDevicesForUser", "user_device")) != null) {
                return C60362nt.A00(AnonymousClass1ML.A00(r4, A032), userJid);
            }
        }
        return AnonymousClass1ML.A00(r4, userJid);
    }

    public void A07() {
        C41851xA BD0;
        C28791au A052 = this.A01.A05();
        try {
            C41851xA BD02 = A052.BD0();
            try {
                AnonymousClass1MN r4 = this.A02;
                C28791au A053 = r4.A01.A05();
                try {
                    BD0 = A053.BD0();
                    ((C28801av) A053).A02.A04("user_device_info", (String) null, "CLEAR_ALL_USER_DEVICE_INFO_TABLE", (String[]) null);
                    BD0.A00();
                    Map map = r4.A04;
                    map.getClass();
                    A053.BJ7(new C70573Bq(map, 41));
                    BD0.close();
                    A053.close();
                    AnonymousClass1ML r42 = this.A05;
                    A053 = r42.A02.A05();
                    BD0 = A053.BD0();
                    ((C28801av) A053).A02.A04("user_device", (String) null, "CLEAR_ALL_USER_DEVICE_TABLE", (String[]) null);
                    BD0.A00();
                    AnonymousClass1MM r2 = r42.A04;
                    r2.getClass();
                    A053.BJ7(new C70573Bq(r2, 45));
                    BD0.close();
                    A053.close();
                    BD02.A00();
                    BD02.close();
                    A052.close();
                    return;
                } catch (Throwable th) {
                    A053.close();
                    throw th;
                }
                throw th;
            } catch (Throwable th2) {
                BD02.close();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                A052.close();
                throw th3;
            } catch (Throwable th4) {
                AnonymousClass0DT.A00(th3, th4);
                throw th3;
            }
        }
    }

    public void A09(C199410f r18, UserJid userJid, String str) {
        C41851xA BD0;
        C41851xA BD02;
        UserJid userJid2 = userJid;
        C17960vV.A0H(!this.A00.A0O(userJid2), "only remove device for others");
        C199410f r7 = r18;
        C17960vV.A0H(!r7.contains(userJid2.getPrimaryDevice()), "never remove primary device.");
        Set<UserJid> A0M = this.A03.A0M(userJid2);
        String str2 = str;
        if (!r7.isEmpty()) {
            HashMap hashMap = new HashMap();
            C28791au A052 = this.A01.A05();
            try {
                BD02 = A052.BD0();
                for (UserJid userJid3 : A0M) {
                    C199410f keySet = A05(userJid3).keySet();
                    hashMap.put(userJid3, keySet);
                    C199410f A002 = A00(r7, userJid3);
                    if (str != null) {
                        AnonymousClass1MN r3 = this.A02;
                        if (!A03(A052, r3.A03(userJid3), (C62512rW) null, this, userJid3)) {
                            BD02.close();
                            A052.close();
                            return;
                        }
                        r3.A06(userJid3);
                        this.A05.A06(userJid3);
                    } else {
                        this.A05.A04(A002, userJid3);
                    }
                    A02(keySet, C199410f.of(), A002, this, userJid3, false, "identity_changed".equals(str2));
                }
                BD02.A00();
                BD02.close();
                A052.close();
                for (UserJid userJid4 : A0M) {
                    Object obj = hashMap.get(userJid4);
                    C17960vV.A07(obj);
                    A01((C199410f) obj, C199410f.of(), A00(r7, userJid4), this, userJid4);
                }
                return;
            } catch (Throwable th) {
                th = th;
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else if (str != null) {
            C28791au A053 = this.A01.A05();
            try {
                BD0 = A053.BD0();
                Iterator it = A0M.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        BD0.A00();
                        break;
                    }
                    UserJid userJid5 = (UserJid) it.next();
                    AnonymousClass1MN r1 = this.A02;
                    if (A03(A053, r1.A03(userJid5), (C62512rW) null, this, userJid5)) {
                        r1.A06(userJid5);
                        this.A05.A06(userJid5);
                    }
                }
                BD0.close();
                A053.close();
                return;
            } catch (Throwable th3) {
                th = th3;
                A053.close();
                throw th;
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }

    public void A0A(C199410f r23, boolean z) {
        String str;
        Log.i("DeviceManager/removeMyDevices/start");
        AnonymousClass11S r2 = this.A00;
        r2.A0I();
        C199410f r5 = r23;
        C17960vV.A0H(!r5.contains(r2.A02), "never remove my primary device.");
        if (!r5.isEmpty()) {
            r2.A0I();
            PhoneUserJid phoneUserJid = r2.A0E;
            if (phoneUserJid == null) {
                str = "DeviceManager/removeMyDevices: me jid is null";
                Log.i(str);
            }
            C28791au A052 = this.A01.A05();
            try {
                C41851xA BD0 = A052.BD0();
                try {
                    AnonymousClass1MO r3 = this.A04;
                    C199410f keySet = r3.A00().keySet();
                    if (z) {
                        C28791au A062 = r3.A02.A06();
                        try {
                            C41851xA BD02 = A062.BD0();
                            try {
                                synchronized (r3) {
                                    long A012 = AnonymousClass11P.A01(r3.A01);
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("logout_time", Long.valueOf(A012));
                                    String[] A0j = C22971Dz.A0j(r5);
                                    String join = TextUtils.join(", ", Collections.nCopies(A0j.length, "?"));
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("device_id IN (");
                                    sb.append(join);
                                    sb.append(")");
                                    String obj = sb.toString();
                                    ((C28801av) A062).A02.A02(contentValues, "devices", obj, "markDeviceLoggedOut/UPDATE_DEVICES", A0j);
                                    BD02.A00();
                                    r3.A00 = null;
                                }
                                BD02.close();
                                A062.close();
                            } catch (Throwable th) {
                                BD02.close();
                                throw th;
                            }
                        } catch (Throwable th2) {
                            A062.close();
                            throw th2;
                        }
                    } else {
                        r3.A01(r5);
                    }
                    C199410f r17 = r5;
                    A02(keySet, C199410f.of(), r17, this, phoneUserJid, false, false);
                    BD0.A00();
                    BD0.close();
                    A052.close();
                    A06();
                    A01(keySet, C199410f.of(), r5, this, phoneUserJid);
                    AnonymousClass1E2 A09 = r2.A09();
                    if (A09 != null) {
                        A01(A00(keySet, A09), C199410f.of(), A00(r5, A09), this, A09);
                    }
                } catch (Throwable th3) {
                    BD0.close();
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    A052.close();
                    throw th4;
                } catch (Throwable th5) {
                    AnonymousClass0DT.A00(th4, th5);
                    throw th4;
                }
            }
        }
        str = "DeviceManager/removeMyDevices/done";
        Log.i(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00ae, code lost:
        if (r8.A07 == false) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c0, code lost:
        if (r8.A08 == false) goto L_0x00c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d9, code lost:
        if (r8.A0D == false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        if (r8.A0B == false) goto L_0x00e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f5, code lost:
        if (r8.A0A == false) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0103, code lost:
        if (r8.A06 == false) goto L_0x0105;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        if (r8.A09 == false) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011e, code lost:
        if (r8.A04 == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0178, code lost:
        if (r8.A0C == false) goto L_0x017a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0175 A[Catch:{ all -> 0x01dd }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C88344Zh r22) {
        /*
            r21 = this;
            java.lang.String r0 = "DeviceManager/addMyDevice/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = r22
            com.whatsapp.jid.DeviceJid r8 = r2.A08
            boolean r0 = X.C22971Dz.A0T(r8)
            r4 = r21
            X.11S r3 = r4.A00
            if (r0 == 0) goto L_0x0022
            X.1E2 r5 = r3.A0A()
        L_0x0017:
            X.10f r15 = X.C199410f.of(r8)
            X.1Cd r0 = r4.A01
            X.1au r13 = r0.A05()
            goto L_0x002b
        L_0x0022:
            r3.A0I()
            com.whatsapp.jid.PhoneUserJid r5 = r3.A0E
            X.C17960vV.A07(r5)
            goto L_0x0017
        L_0x002b:
            X.1xA r12 = r13.BD0()     // Catch:{ all -> 0x01fb }
            X.1MO r6 = r4.A04     // Catch:{ all -> 0x01f1 }
            X.10w r0 = r6.A00()     // Catch:{ all -> 0x01f1 }
            X.10f r14 = r0.keySet()     // Catch:{ all -> 0x01f1 }
            X.1MP r0 = r6.A02     // Catch:{ all -> 0x01f1 }
            X.1au r11 = r0.A06()     // Catch:{ all -> 0x01f1 }
            X.1xA r10 = r11.BD0()     // Catch:{ all -> 0x01e7 }
            monitor-enter(r6)     // Catch:{ all -> 0x01dd }
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x01da }
            r7.<init>()     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "device_id"
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "platform_type"
            X.2RG r0 = r2.A09     // Catch:{ all -> 0x01da }
            int r0 = r0.value     // Catch:{ all -> 0x01da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "device_os"
            java.lang.String r0 = r2.A0A     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r8 = "last_active"
            long r0 = r2.A00     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r8, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r8 = "login_time"
            long r0 = r2.A06     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r8, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r8 = "logout_time"
            long r0 = r2.A01     // Catch:{ all -> 0x01da }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r8, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "adv_key_index"
            int r0 = r2.A05     // Catch:{ all -> 0x01da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "full_sync_required"
            boolean r0 = r2.A0B     // Catch:{ all -> 0x01da }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "place_name"
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r9 = "support_bot_user_agent_chat_history"
            X.2qr r8 = r2.A07     // Catch:{ all -> 0x01da }
            if (r8 == 0) goto L_0x00b0
            boolean r1 = r8.A07     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r9, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r9 = "support_cag_reactions_and_polls_history"
            if (r8 == 0) goto L_0x00c2
            boolean r1 = r8.A08     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x00c3
        L_0x00c2:
            r0 = 0
        L_0x00c3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01da }
            r7.put(r9, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "companion_meta_nonce"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x01da }
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "support_recent_sync_chunk_message_tuning"
            if (r8 == 0) goto L_0x00db
            boolean r1 = r8.A0D     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x00dc
        L_0x00db:
            r0 = 0
        L_0x00dc:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "support_hosted_group_msg"
            if (r8 == 0) goto L_0x00e9
            boolean r1 = r8.A0B     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x00ea
        L_0x00e9:
            r0 = 0
        L_0x00ea:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "support_fbid_bot_chat_history"
            if (r8 == 0) goto L_0x00f7
            boolean r1 = r8.A0A     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x00f8
        L_0x00f7:
            r0 = 0
        L_0x00f8:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "support_biz_hosted_msg"
            if (r8 == 0) goto L_0x0105
            boolean r1 = r8.A06     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x0106
        L_0x0105:
            r0 = 0
        L_0x0106:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "support_call_log_history"
            if (r8 == 0) goto L_0x0113
            boolean r1 = r8.A09     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x0114
        L_0x0113:
            r0 = 0
        L_0x0114:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "inline_initial_hist_sync_payload_enabled"
            if (r8 == 0) goto L_0x0120
            boolean r1 = r8.A04     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x0121
        L_0x0120:
            r0 = 0
        L_0x0121:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r1 = "full_sync_days_limit"
            if (r8 == 0) goto L_0x0168
            java.lang.Integer r0 = r8.A00     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0168
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
        L_0x012f:
            java.lang.String r1 = "full_sync_size_mb_limit"
            if (r8 == 0) goto L_0x0164
            java.lang.Integer r0 = r8.A01     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0164
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
        L_0x013a:
            java.lang.String r1 = "storage_quota_mb"
            if (r8 == 0) goto L_0x0160
            java.lang.Integer r0 = r8.A03     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x0160
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
        L_0x0146:
            java.lang.String r1 = "recent_sync_days_limit"
            if (r8 == 0) goto L_0x015c
            java.lang.Integer r0 = r8.A02     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x015c
            r7.put(r1, r0)     // Catch:{ all -> 0x01da }
        L_0x0151:
            java.lang.String r2 = "support_add_on_history_sync_migration"
            if (r8 == 0) goto L_0x016c
            boolean r1 = r8.A05     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x016d
            goto L_0x016c
        L_0x015c:
            r7.putNull(r1)     // Catch:{ all -> 0x01da }
            goto L_0x0151
        L_0x0160:
            r7.putNull(r1)     // Catch:{ all -> 0x01da }
            goto L_0x0146
        L_0x0164:
            r7.putNull(r1)     // Catch:{ all -> 0x01da }
            goto L_0x013a
        L_0x0168:
            r7.putNull(r1)     // Catch:{ all -> 0x01da }
            goto L_0x012f
        L_0x016c:
            r0 = 0
        L_0x016d:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "support_message_association"
            if (r8 == 0) goto L_0x017a
            boolean r1 = r8.A0C     // Catch:{ all -> 0x01da }
            r0 = 1
            if (r1 != 0) goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            X.C63432t4.A02(r7, r2, r0)     // Catch:{ all -> 0x01da }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01da }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x01da }
            java.lang.String r2 = "devices"
            java.lang.String r1 = "addDevice/REPLACE_DEVICES"
            r0 = 0
            r8.A08(r2, r1, r7)     // Catch:{ all -> 0x01da }
            r10.A00()     // Catch:{ all -> 0x01da }
            r6.A00 = r0     // Catch:{ all -> 0x01da }
            monitor-exit(r6)     // Catch:{ all -> 0x01da }
            r10.close()     // Catch:{ all -> 0x01e7 }
            r11.close()     // Catch:{ all -> 0x01f1 }
            X.10f r16 = X.C199410f.of()     // Catch:{ all -> 0x01f1 }
            r19 = 0
            r20 = r19
            r18 = r5
            r17 = r4
            A02(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x01f1 }
            r12.A00()     // Catch:{ all -> 0x01f1 }
            r12.close()     // Catch:{ all -> 0x01fb }
            r13.close()
            r4.A06()
            X.10f r0 = X.C199410f.of()
            A01(r14, r15, r0, r4, r5)
            X.1E2 r3 = r3.A09()
            boolean r0 = X.C22971Dz.A0Y(r5)
            if (r0 == 0) goto L_0x01d4
            if (r3 == 0) goto L_0x01d4
            X.10f r2 = A00(r14, r3)
            X.10f r1 = A00(r15, r3)
            X.10f r0 = X.C199410f.of()
            A01(r2, r1, r0, r4, r3)
        L_0x01d4:
            java.lang.String r0 = "DeviceManager/addMyDevice/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01da:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01da }
            throw r0     // Catch:{ all -> 0x01dd }
        L_0x01dd:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x01e2 }
            goto L_0x01e6
        L_0x01e2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01e7 }
        L_0x01e6:
            throw r1     // Catch:{ all -> 0x01e7 }
        L_0x01e7:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x01ec }
            goto L_0x01f0
        L_0x01ec:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01f1 }
        L_0x01f0:
            throw r1     // Catch:{ all -> 0x01f1 }
        L_0x01f1:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x01f6 }
            goto L_0x01fa
        L_0x01f6:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x01fb }
        L_0x01fa:
            throw r1     // Catch:{ all -> 0x01fb }
        L_0x01fb:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0200 }
            throw r1
        L_0x0200:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MQ.A0B(X.4Zh):void");
    }

    public AnonymousClass1MQ(AnonymousClass11S r1, AnonymousClass1Cd r2, AnonymousClass1MN r3, C24751Ln r4, AnonymousClass1MO r5, AnonymousClass1ML r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A00 = r1;
        this.A05 = r6;
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
    }

    public void A08(C199410f r5) {
        C41851xA BD0;
        if (!r5.isEmpty()) {
            TextUtils.join(", ", r5);
            C28791au A052 = this.A01.A05();
            try {
                BD0 = A052.BD0();
                this.A04.A01(r5);
                BD0.A00();
                BD0.close();
                A052.close();
                A06();
                return;
            } catch (Throwable th) {
                try {
                    A052.close();
                    throw th;
                } catch (Throwable th2) {
                    AnonymousClass0DT.A00(th, th2);
                    throw th;
                }
            }
        } else {
            return;
        }
        throw th;
    }
}
