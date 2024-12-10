package X;

import android.text.TextUtils;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2Cp  reason: invalid class name and case insensitive filesystem */
public class C46032Cp extends C60192nY {
    public Runnable A00;
    public List A01 = AnonymousClass000.A13();
    public final AnonymousClass190 A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1M9 A04;
    public final C26781Tl A05;
    public final AnonymousClass12E A06;
    public final AnonymousClass11Q A07;
    public final AnonymousClass118 A08;
    public final C19830z4 A09;
    public final C24751Ln A0A;
    public final C26331Rs A0B;
    public final AnonymousClass1UN A0C;
    public final AnonymousClass10I A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final C24921Me A0G;
    public final AnonymousClass11P A0H;
    public final AnonymousClass1MZ A0I;
    public final C18030ve A0J;
    public final C26301Rp A0K;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C20126A8l A0C(X.A6U r18, java.lang.String r19, boolean r20) {
        /*
            r17 = this;
            r7 = 1
            r4 = r18
            X.C18070vi.A0d(r4, r7)
            java.lang.String[] r3 = r4.A06
            X.2rJ r6 = r4.A01
            X.8cn r1 = r4.A03
            int r2 = r3.length
            r0 = 2
            r12 = 0
            if (r2 != r0) goto L_0x003a
            java.lang.String r2 = "contact"
            r0 = 0
            r0 = r3[r0]
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x003a
            X.1Dw r2 = com.whatsapp.jid.UserJid.Companion
            r0 = r3[r7]
            com.whatsapp.jid.UserJid r10 = r2.A04(r0)
            java.lang.String r5 = "contact-mutation/from-key-value "
            if (r10 != 0) goto L_0x003b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = "unable to create user jid from "
            r1.append(r0)
            r0 = r3[r7]
        L_0x0034:
            r1.append(r0)
        L_0x0037:
            X.C17890vO.A0w(r1)
        L_0x003a:
            return r12
        L_0x003b:
            X.2rJ r7 = X.C62382rJ.A03
            boolean r0 = X.C18070vi.A18(r7, r6)
            r11 = r19
            if (r0 == 0) goto L_0x00a0
            if (r1 == 0) goto L_0x0098
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L_0x0098
            int r0 = r1.bitField0_
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0098
            long r14 = r1.timestamp_
            X.8aw r2 = r1.contactAction_
            if (r2 != 0) goto L_0x005b
            X.8aw r2 = X.C165318aw.DEFAULT_INSTANCE
        L_0x005b:
            int r1 = r2.bitField0_
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0091
            java.lang.String r13 = r2.fullName_
            r0 = r1 & 2
            if (r0 == 0) goto L_0x0069
            java.lang.String r12 = r2.firstName_
        L_0x0069:
            r0 = r1 & 4
            if (r0 == 0) goto L_0x008f
            X.1Dw r1 = com.whatsapp.jid.UserJid.Companion
            java.lang.String r0 = r2.lidJid_
            com.whatsapp.jid.UserJid r9 = r1.A04(r0)
            boolean r0 = r9 instanceof X.AnonymousClass1E2
            if (r0 == 0) goto L_0x008f
            X.1E2 r9 = (X.AnonymousClass1E2) r9
        L_0x007b:
            int r0 = r2.bitField0_
            r0 = r0 & 8
            if (r0 == 0) goto L_0x008d
            boolean r0 = r2.saveOnPrimaryAddressbook_
        L_0x0083:
            X.A2n r8 = r4.A02
            X.8qE r6 = new X.8qE
            r16 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16)
            return r6
        L_0x008d:
            r0 = 0
            goto L_0x0083
        L_0x008f:
            r9 = 0
            goto L_0x007b
        L_0x0091:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = "fullName was not in contactAction protobuf"
            goto L_0x0034
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = "syncActionValue is null, missing timestamp, or is missing contactAction"
            goto L_0x0034
        L_0x00a0:
            X.2rJ r3 = X.C62382rJ.A02
            boolean r0 = r3.equals(r6)
            if (r0 == 0) goto L_0x00c4
            if (r1 == 0) goto L_0x00c1
            boolean r0 = r1.A0R()
            if (r0 == 0) goto L_0x00c1
            long r1 = r1.timestamp_
        L_0x00b2:
            X.A2n r0 = r4.A02
            r16 = 0
            X.8qE r6 = new X.8qE
            r7 = r3
            r8 = r0
            r9 = r12
            r13 = r12
            r14 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r16)
            return r6
        L_0x00c1:
            r1 = 0
            goto L_0x00b2
        L_0x00c4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = "unknown operation: "
            r1.append(r0)
            r1.append(r6)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46032Cp.A0C(X.A6U, java.lang.String, boolean):X.A8l");
    }

    public boolean A0J() {
        return true;
    }

    public static void A01(C46032Cp r7, AnonymousClass1E7 r8, long j) {
        C59042lf r0;
        if (((C139486yv) r7.A0E.get()).A02()) {
            AnonymousClass1E7 r5 = r8;
            AnonymousClass1BI r6 = r8.A0J;
            AnonymousClass1M9 r4 = r7.A04;
            if (r4.A04.A0N(r6).size() == 1 && (r0 = r8.A0H) != null) {
                r7.A05(r0.A01);
            } else if (r8.A0H == null) {
                C17900vP.A0X(r6, "ContactMutationHandler/deleteOSAddressBookContact: contact.key is null for jid ", AnonymousClass000.A10());
            }
            try {
                r4.A0Y(r5, r6, Long.valueOf(j), r6.user, String.valueOf(((C42771yi) r7.A0F.get()).A0H(AnonymousClass17K.A00(C42771yi.A00(), r8.A0J), (String) null).countryCode_));
            } catch (C24931Mf e) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Couldn't parse the contact number: ");
                C17890vO.A19(A10, e.message);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("ContactMutationHandler/deleteOSAddressBookContact: ");
                A102.append(r6);
                C17890vO.A19(A102, " failed to parse, contact not deleted");
            }
        }
    }

    public static void A03(C46032Cp r5, AnonymousClass1E7 r6, C170568qE r7, int i, long j) {
        String str;
        if (r6.A0H == null) {
            r5.A05.A00(r7.A01.user);
        }
        String str2 = r7.A03;
        String str3 = r7.A02;
        String A002 = A00(str2, str3);
        String A003 = A00(str2, str3);
        if (str3.indexOf(A003) == 0) {
            str = str3.substring(A003.length());
        } else {
            str = "";
        }
        String trim = str.trim();
        r6.A0H = new C59042lf(j, r7.A01.user);
        r6.A0R = str3;
        r6.A0T = A002;
        r6.A0S = trim;
        r6.A09 = i;
        r5.A04.A0t(Collections.singleton(r6), false);
        if (j == -5 && i == 1) {
            r5.A06.A0D((Integer) null);
        }
    }

    public List A0F(boolean z) {
        C17960vV.A0F(false, "Please use createBootstrapMutations(initialData) method instead");
        return A0L(Collections.emptyList());
    }

    public /* bridge */ /* synthetic */ void A0H(C20126A8l a8l) {
        boolean z;
        C62382rJ r1;
        C62382rJ r0;
        C170568qE r5 = (C170568qE) a8l;
        AnonymousClass1E7 A0I2 = this.A04.A0I(r5.A01, false);
        if (A0I2 == null || !A0I2.A0H()) {
            z = false;
            r1 = r5.A05;
            r0 = C62382rJ.A02;
        } else {
            z = true;
            if (A0I2.A10) {
                r1 = r5.A05;
                r0 = C62382rJ.A03;
            }
            r1 = r5.A05;
            r0 = C62382rJ.A02;
        }
        if (r1 == r0) {
            A08(r5);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("contact-mutation-handler/handleNotReadyToSyncPendingMutation delete mutation isValidWhatsAppContact = ");
        A10.append(z);
        A10.append("; WAState=");
        Log.w(AnonymousClass3MY.A0r(A10, A0I2.A10));
        A06(r5);
    }

    /* JADX WARNING: type inference failed for: r3v9, types: [X.3Cl] */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0331, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0332, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0335, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b7, code lost:
        if (((X.C139486yv) r3.get()).A02() != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b9, code lost:
        A02(r8, r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r8.A09.A2J() != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        r0 = -5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0222, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0223, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        throw r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0I(X.C20126A8l r22, X.C20126A8l r23) {
        /*
            r21 = this;
            r9 = r22
            X.8qE r9 = (X.C170568qE) r9
            r8 = r21
            r4 = r23
            if (r23 == 0) goto L_0x0016
            long r5 = r4.A04
            long r1 = r9.A04
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0016
            r8.A09(r9)
            return
        L_0x0016:
            X.11S r2 = r8.A03
            boolean r0 = r2.A0N()
            if (r0 != 0) goto L_0x0101
            X.1UN r0 = r8.A0C
            X.0ve r2 = r0.A04
            boolean r0 = X.AnonymousClass3MX.A1W(r2)
            if (r0 == 0) goto L_0x0048
            r1 = 11032(0x2b18, float:1.5459E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0048
            X.00H r3 = r8.A0E
            java.lang.Object r0 = r3.get()
            X.6yv r0 = (X.C139486yv) r0
            boolean r0 = r0.A02()
            if (r0 != 0) goto L_0x004c
            X.0z4 r0 = r8.A09
            boolean r0 = r0.A2J()
            if (r0 != 0) goto L_0x004c
        L_0x0048:
            r8.A0B(r9, r4)
            return
        L_0x004c:
            X.1M9 r7 = r8.A04
            com.whatsapp.jid.UserJid r0 = r9.A01
            X.1E7 r2 = r7.A0H(r0)
            X.2rJ r1 = r9.A05
            X.2rJ r0 = X.C62382rJ.A02
            if (r1 != r0) goto L_0x007c
            java.lang.String r0 = "ContactMutationHandler/handleMutationInPrimaryMode/remove operation"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2lf r0 = r2.A0H
            if (r0 == 0) goto L_0x0048
            long r0 = r0.A00
            r5 = 0
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x006f
            A01(r8, r2, r0)
            goto L_0x0048
        L_0x006f:
            r0 = 2
            r2.A01 = r0
            r7.A0U(r2)
            X.12E r1 = r8.A06
            r0 = 0
            r1.A0D(r0)
            goto L_0x0048
        L_0x007c:
            X.2lf r1 = r2.A0H
            if (r1 == 0) goto L_0x00f0
            long r5 = r1.A00
            r10 = -5
            int r0 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
        L_0x0086:
            if (r0 != 0) goto L_0x00a9
            r0 = 0
            r2.A01 = r0
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00bd
            java.lang.Object r0 = r3.get()
            X.6yv r0 = (X.C139486yv) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00f3
            X.10I r5 = r8.A0D
            r0 = 4
            X.3Cl r3 = new X.3Cl
            r3.<init>(r8, r2, r9, r0)
            java.lang.String r0 = "Save to phone"
        L_0x00a5:
            r5.CGS(r3, r0)
            goto L_0x0048
        L_0x00a9:
            boolean r0 = r9.A04
            if (r0 == 0) goto L_0x00c8
            java.lang.Object r0 = r3.get()
            X.6yv r0 = (X.C139486yv) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00c5
        L_0x00b9:
            A02(r8, r2, r9)
            goto L_0x0048
        L_0x00bd:
            X.0z4 r0 = r8.A09
            boolean r0 = r0.A2J()
            if (r0 == 0) goto L_0x00b9
        L_0x00c5:
            r0 = -5
            goto L_0x00f7
        L_0x00c8:
            if (r1 != 0) goto L_0x00d1
            java.lang.String r0 = "ContactMutationHandler/convertSyncedToUnsyncedContact: contact.key is null"
        L_0x00cc:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0048
        L_0x00d1:
            X.0z4 r0 = r8.A09
            boolean r0 = r0.A2J()
            if (r0 != 0) goto L_0x00dc
            java.lang.String r0 = "ContactMutationHandler/convertSyncedToUnsyncedContact: backup isn't on"
            goto L_0x00cc
        L_0x00dc:
            X.2lf r0 = r2.A0H
            long r0 = r0.A00
            X.10I r5 = r8.A0D
            r14 = 3
            X.3C8 r3 = new X.3C8
            r10 = r3
            r11 = r8
            r12 = r2
            r13 = r9
            r15 = r0
            r10.<init>(r11, r12, r13, r14, r15)
            java.lang.String r0 = "convert synced to unsynced contact"
            goto L_0x00a5
        L_0x00f0:
            boolean r0 = r9.A04
            goto L_0x0086
        L_0x00f3:
            X.2lf r0 = r2.A0H
            long r0 = r0.A00
        L_0x00f7:
            r13 = 1
            r10 = r8
            r11 = r2
            r12 = r9
            r14 = r0
            A03(r10, r11, r12, r13, r14)
            goto L_0x0048
        L_0x0101:
            com.whatsapp.jid.UserJid r11 = r9.A01
            X.2rJ r1 = r9.A05
            X.2rJ r0 = X.C62382rJ.A03
            if (r1 != r0) goto L_0x022a
            boolean r0 = r2.A0O(r11)
            if (r0 == 0) goto L_0x0123
            X.11Q r0 = r8.A07
            java.lang.String r2 = r9.A02
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "self_contact_name"
            X.C17880vN.A1E(r1, r0, r2)
            goto L_0x0048
        L_0x0123:
            X.1M9 r3 = r8.A04
            r3.A0H(r11)
            java.lang.String r0 = r9.A03
            java.lang.String r7 = r9.A02
            java.lang.String r6 = A00(r0, r7)
            java.lang.String r12 = r11.user
            X.1E2 r2 = r9.A00
            if (r2 == 0) goto L_0x0142
            boolean r0 = r11 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0142
            X.1Ln r1 = r8.A0A
            r0 = r11
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            r1.A0P(r2, r0)
        L_0x0142:
            X.1E7 r5 = r3.A0E(r11)
            if (r5 == 0) goto L_0x01c9
            X.1M2 r10 = r3.A04
            r0 = 4
            android.content.ContentValues r2 = new android.content.ContentValues
            r2.<init>(r0)
            java.lang.String r0 = "number"
            r2.put(r0, r12)
            r0 = -3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "raw_contact_id"
            r2.put(r0, r1)
            java.lang.String r0 = "given_name"
            r2.put(r0, r6)
            java.lang.String r0 = "display_name"
            r2.put(r0, r7)
            X.1BI r0 = r5.A0J
            X.AnonymousClass1M2.A0A(r2, r10, r0)
            X.00H r0 = r10.A09
            java.lang.Object r2 = r0.get()
            X.2Kb r2 = (X.C47812Kb) r2
            java.util.Set r1 = java.util.Collections.singleton(r5)
            r0 = 5
            X.AnonymousClass35V.A00(r2, r1, r0)
        L_0x017f:
            X.0ve r2 = r3.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x01f1
            X.1Lo r0 = r3.A02
            r5 = 1
            X.C18070vi.A0e(r12, r5, r6)
            X.00H r0 = r0.A00
            java.lang.Object r3 = r0.get()
            X.1Ly r3 = (X.C24861Ly) r3
            java.lang.String r2 = "jid"
            java.lang.String r1 = "number"
            r0 = 5
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>(r0)
            r10.put(r1, r12)
            r0 = -3
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "raw_contact_id"
            r10.put(r0, r1)
            java.lang.String r0 = "given_name"
            r10.put(r0, r6)
            java.lang.String r0 = "display_name"
            r10.put(r0, r7)
            java.lang.String r0 = r11.getRawString()
            r10.put(r2, r0)
            X.1Lt r0 = r3.A00
            X.1au r7 = r0.A06()
            goto L_0x01d3
        L_0x01c9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactManager/updateContactSyncd attempting to update contact that is not in db with jid="
            X.C17900vP.A0X(r11, r0, r1)
            goto L_0x017f
        L_0x01d3:
            X.C18070vi.A0b(r7)     // Catch:{ all -> 0x0220 }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ all -> 0x0220 }
            r0 = 0
            X.C17880vN.A1J(r11, r1, r0)     // Catch:{ all -> 0x0220 }
            java.lang.String r3 = "wa_address_book"
            java.lang.String r0 = "jid = ?"
            long r5 = X.C24861Ly.A01(r10, r7, r3, r0, r1)     // Catch:{ all -> 0x0220 }
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x01ee
            X.C24861Ly.A00(r10, r7, r3)     // Catch:{ all -> 0x0220 }
        L_0x01ee:
            r7.close()
        L_0x01f1:
            X.11Q r0 = r8.A07
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "companion_syncd_critical_bootstrap_state"
            int r1 = X.C17890vO.A00(r1, r0)
            r0 = 1
            if (r1 == r0) goto L_0x0048
            r0 = 2
            if (r1 == r0) goto L_0x0048
            monitor-enter(r8)
            java.util.List r0 = r8.A01     // Catch:{ all -> 0x0227 }
            r0.add(r11)     // Catch:{ all -> 0x0227 }
            java.lang.Runnable r0 = r8.A00     // Catch:{ all -> 0x0227 }
            if (r0 != 0) goto L_0x021d
            X.10I r3 = r8.A0D     // Catch:{ all -> 0x0227 }
            r0 = 6
            X.7Pc r2 = new X.7Pc     // Catch:{ all -> 0x0227 }
            r2.<init>(r8, r0)     // Catch:{ all -> 0x0227 }
            r0 = 10000(0x2710, double:4.9407E-320)
            X.25d r0 = r3.CGv(r2, r0)     // Catch:{ all -> 0x0227 }
            r8.A00 = r0     // Catch:{ all -> 0x0227 }
        L_0x021d:
            monitor-exit(r8)
            goto L_0x0048
        L_0x0220:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0222 }
        L_0x0222:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x0227:
            r1 = move-exception
            monitor-exit(r8)
            throw r1
        L_0x022a:
            X.2rJ r0 = X.C62382rJ.A02
            if (r1 != r0) goto L_0x0336
            boolean r0 = r2.A0O(r11)
            if (r0 == 0) goto L_0x024b
            X.11Q r0 = r8.A07
            r2 = 0
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r0)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "self_contact_name"
            X.C17880vN.A1E(r1, r0, r2)
        L_0x0245:
            X.1Rs r0 = r8.A0B
            r0.A0H(r9)
            return
        L_0x024b:
            X.1M9 r10 = r8.A04
            X.1E7 r7 = r10.A0E(r11)
            if (r7 == 0) goto L_0x031b
            X.1M2 r0 = r10.A04
            r20 = r0
            r0 = 3
            android.content.ContentValues r13 = new android.content.ContentValues
            r13.<init>(r0)
            r0 = -1
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            java.lang.String r6 = "raw_contact_id"
            r13.put(r6, r12)
            r5 = 0
            java.lang.String r4 = "given_name"
            r13.put(r4, r5)
            java.lang.String r3 = "display_name"
            r13.put(r3, r5)
            r2 = 0
            r0 = r20
            X.1Lt r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x02c0 }
            X.1au r19 = r0.A06()     // Catch:{ IllegalArgumentException -> 0x02c0 }
            X.1xA r18 = r19.BD0()     // Catch:{ all -> 0x02b6 }
            java.lang.String r17 = "wa_contacts"
            java.lang.String r16 = "wa_contacts._id = ?"
            java.lang.String[] r14 = X.C17880vN.A1Y()     // Catch:{ all -> 0x02ac }
            long r0 = r7.A0J()     // Catch:{ all -> 0x02ac }
            X.C17880vN.A1V(r14, r2, r0)     // Catch:{ all -> 0x02ac }
            r15 = r19
            r1 = r17
            r0 = r16
            long r15 = X.C24861Ly.A01(r13, r15, r1, r0, r14)     // Catch:{ all -> 0x02ac }
            r13 = 1
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x02a2
            r2 = 1
        L_0x02a2:
            r18.A00()     // Catch:{ all -> 0x02ac }
            r18.close()     // Catch:{ all -> 0x02b6 }
            r19.close()     // Catch:{ IllegalArgumentException -> 0x02c0 }
            goto L_0x02d3
        L_0x02ac:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x02b1 }
            goto L_0x02b5
        L_0x02b1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x02b6 }
        L_0x02b5:
            throw r1     // Catch:{ all -> 0x02b6 }
        L_0x02b6:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x02bb }
            goto L_0x02bf
        L_0x02bb:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IllegalArgumentException -> 0x02c0 }
        L_0x02bf:
            throw r1     // Catch:{ IllegalArgumentException -> 0x02c0 }
        L_0x02c0:
            r13 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactManagerDatabase/unable to remove contact from syncd mutation "
            r1.append(r0)
            X.1BI r0 = r7.A0J
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.C17960vV.A09(r0, r13)
        L_0x02d3:
            r7.A0R = r5
            r7.A0T = r5
            if (r2 == 0) goto L_0x02e9
            r0 = r20
            X.00H r0 = r0.A09
            X.10T r2 = X.C17880vN.A0V(r0)
            java.util.Set r1 = java.util.Collections.singleton(r7)
            r0 = 6
            X.AnonymousClass35V.A00(r2, r1, r0)
        L_0x02e9:
            X.0ve r2 = r10.A0H
            r1 = 10624(0x2980, float:1.4887E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0328
            X.1Lo r0 = r10.A02
            X.00H r0 = r0.A00
            java.lang.Object r2 = r0.get()
            X.1Ly r2 = (X.C24861Ly) r2
            r0 = 3
            android.content.ContentValues r1 = new android.content.ContentValues
            r1.<init>(r0)
            r1.put(r4, r5)
            r1.put(r3, r5)
            r1.put(r6, r12)
            X.1Lt r0 = r2.A00
            X.1au r2 = r0.A06()
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x032f }
            X.AnonymousClass2Q6.A07(r1, r7, r2)     // Catch:{ all -> 0x032f }
            goto L_0x0325
        L_0x031b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactManager/removeContactSyncd attempting to remove contact that is not in db with jid="
            X.C17900vP.A0X(r11, r0, r1)
            goto L_0x0328
        L_0x0325:
            r2.close()
        L_0x0328:
            X.1MA r0 = r10.A03
            r0.A0C(r11)
            goto L_0x0245
        L_0x032f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0331 }
        L_0x0331:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0336:
            java.lang.String r0 = "ContactMutationHandler/handleMutation received undefined SyncD operation"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46032Cp.A0I(X.A8l, X.A8l):void");
    }

    public List A0L(List list) {
        PhoneUserJid A002 = AnonymousClass11S.A00(this.A03);
        if (A002 == null) {
            Log.e("contact-mutation-handler/createBootstrapMutations me is null");
            return Collections.emptyList();
        }
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1M9 r0 = this.A04;
        r0.A0m(A13);
        AnonymousClass1E7 A0I2 = r0.A0I(A002, false);
        if (A0I2 != null && A0I2.A0H()) {
            C108985cd.A1I(A0I2, A13);
        }
        HashMap A11 = C17880vN.A11();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            AnonymousClass1E7 A0O = C17880vN.A0O(it);
            UserJid A003 = C22941Dw.A00(A0O.A0J);
            if (A003 != null) {
                A11.put(A003, A0O);
            }
        }
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A133 = AnonymousClass000.A13();
        ArrayList A134 = AnonymousClass000.A13();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C186669eZ r2 = (C186669eZ) it2.next();
            AnonymousClass1BI r9 = r2.A00.A06;
            if (C22971Dz.A0Y(r9)) {
                Log.i("contact-mutation-handler/createBootstrapMutations attempting to add jid from 1:1 chat");
                A04(r9, A002, A132, A11);
            } else if (C22971Dz.A0e(r9)) {
                C17900vP.A0Y(r9, "contact-mutation-handler/createBootstrapMutations attempting to add jids that messaged in group or were mentioned: ", AnonymousClass000.A10());
                Iterator it3 = r2.A03.iterator();
                while (it3.hasNext()) {
                    AnonymousClass206 A0Y = C17880vN.A0Y(it3);
                    A04(A0Y.A0H(), A002, A133, A11);
                    Iterator it4 = AnonymousClass4aJ.A02(UserJid.class, A0Y.A0h).iterator();
                    while (it4.hasNext()) {
                        A04(C17880vN.A0S(it4), A002, A133, A11);
                    }
                }
                AnonymousClass1MZ r22 = this.A0I;
                C36321nh r02 = GroupJid.Companion;
                GroupJid A004 = C36321nh.A00(r9);
                C17960vV.A07(A004);
                C199410f A092 = r22.A08.A0C(A004).A09();
                C17900vP.A0Y(r9, "contact-mutation-handler/createBootstrapMutations attempting to add all participant jids for group: ", AnonymousClass000.A10());
                AnonymousClass1IZ it5 = A092.iterator();
                while (it5.hasNext()) {
                    A04(C17880vN.A0S(it5), A002, A134, A11);
                }
            }
        }
        List<Collection> asList = Arrays.asList(new Collection[]{A132, A133, A134, A11.keySet()});
        ArrayList A135 = AnonymousClass000.A13();
        for (Collection addAll : asList) {
            A135.addAll(addAll);
        }
        return A0K(C62382rJ.A03, A135);
    }

    public C46032Cp(AnonymousClass190 r2, AnonymousClass11S r3, AnonymousClass1M9 r4, C26781Tl r5, C24921Me r6, AnonymousClass12E r7, AnonymousClass11Q r8, AnonymousClass11P r9, AnonymousClass118 r10, C19830z4 r11, AnonymousClass1MZ r12, C24751Ln r13, C26331Rs r14, AnonymousClass1UN r15, C18030ve r16, AnonymousClass10I r17, C26301Rp r18, AnonymousClass00H r19, AnonymousClass00H r20) {
        super(r14);
        this.A0H = r9;
        this.A0J = r16;
        this.A03 = r3;
        this.A08 = r10;
        this.A0D = r17;
        this.A0K = r18;
        this.A04 = r4;
        this.A0G = r6;
        this.A0F = r19;
        this.A0A = r13;
        this.A06 = r7;
        this.A0B = r14;
        this.A09 = r11;
        this.A0E = r20;
        this.A0I = r12;
        this.A07 = r8;
        this.A05 = r5;
        this.A02 = r2;
        this.A0C = r15;
    }

    public static String A00(String str, String str2) {
        if (str.trim().length() != 0) {
            return str;
        }
        String[] split = str2.split(" ");
        if (split.length > 0) {
            return split[0];
        }
        return "";
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.6jd, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A02(X.C46032Cp r11, X.AnonymousClass1E7 r12, X.C170568qE r13) {
        /*
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r3 = "+"
            r1.append(r3)
            com.whatsapp.jid.UserJid r2 = r13.A01
            java.lang.String r0 = r2.user
            java.lang.String r4 = ""
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r11.A05(r0)
            X.2lf r0 = r12.A0H
            if (r0 != 0) goto L_0x0025
            X.1Tl r1 = r11.A05
            java.lang.String r0 = r2.user
            r1.A00(r0)
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)
            java.lang.String r0 = r2.user
            java.lang.String r0 = r0.replace(r3, r4)
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r1)
            X.00H r5 = r11.A0E
            java.lang.Object r1 = r5.get()
            X.6yv r1 = (X.C139486yv) r1
            X.118 r0 = r11.A08
            android.content.Context r3 = r0.A00
            r2 = 0
            X.C18070vi.A0d(r3, r2)
            boolean r0 = r1.A02()
            java.lang.String r6 = "PHONE"
            if (r0 == 0) goto L_0x00d3
            android.accounts.AccountManager r1 = android.accounts.AccountManager.get(r3)
            java.lang.String r0 = "com.google"
            android.accounts.Account[] r1 = r1.getAccountsByType(r0)
            X.C18070vi.A0X(r1)
            int r0 = r1.length
            if (r0 == 0) goto L_0x00d3
            r10 = r1[r2]
            X.C18070vi.A0b(r10)
        L_0x0060:
            java.lang.String r0 = r13.A03
            java.lang.String r2 = r13.A02
            java.lang.String r3 = A00(r0, r2)
            java.lang.String r1 = A00(r0, r2)
            int r0 = r2.indexOf(r1)
            if (r0 != 0) goto L_0x007a
            int r0 = r1.length()
            java.lang.String r4 = r2.substring(r0)
        L_0x007a:
            java.lang.String r1 = r4.trim()
            X.6jd r2 = new X.6jd
            r2.<init>()
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r2.A04 = r3
            r2.A05 = r1
            X.2lf r0 = r12.A0H
            if (r0 == 0) goto L_0x00d1
            long r3 = r0.A00
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x00d1
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L_0x009b:
            r2.A00 = r0
            r2.A06 = r7
            java.lang.String r1 = r10.type
            boolean r0 = r6.equals(r1)
            if (r0 != 0) goto L_0x00ad
            java.lang.String r0 = r10.name
            r2.A01 = r0
            r2.A02 = r1
        L_0x00ad:
            java.lang.Object r1 = r5.get()
            X.6yv r1 = (X.C139486yv) r1
            java.lang.String r4 = r2.A01
            java.lang.String r5 = r2.A02
            java.lang.String r6 = r2.A04
            java.lang.String r7 = r2.A05
            java.lang.Long r3 = r2.A00
            java.lang.String r8 = r2.A06
            java.lang.String r9 = r2.A03
            boolean r10 = r2.A07
            X.6tn r2 = new X.6tn
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            X.2yl r0 = new X.2yl
            r0.<init>(r11, r12, r13)
            r1.A01(r2, r0)
            return
        L_0x00d1:
            r0 = 0
            goto L_0x009b
        L_0x00d3:
            r0 = 2131894509(0x7f1220ed, float:1.9423825E38)
            java.lang.String r0 = r3.getString(r0)
            android.accounts.Account r10 = new android.accounts.Account
            r10.<init>(r0, r6)
            goto L_0x0060
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46032Cp.A02(X.2Cp, X.1E7, X.8qE):void");
    }

    public static void A04(Jid jid, UserJid userJid, List list, Map map) {
        UserJid A002 = C22941Dw.A00(jid);
        if (A002 != null && !userJid.equals(jid) && map.containsKey(A002)) {
            C17900vP.A0Y(A002, "contact-mutation-handler/populateJidList adding jid: ", AnonymousClass000.A10());
            list.add(A002);
        }
    }

    private void A05(String str) {
        if (!TextUtils.isEmpty(str)) {
            String replace = str.replace("+", "");
            if (!TextUtils.isEmpty(replace)) {
                C26301Rp r3 = this.A0K;
                HashSet A0M = r3.A0M("SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION");
                if (A0M.add(replace)) {
                    r3.A0N("SYNC_MANAGER_CONTACTS_UPDATED_BY_COMPANION", A0M);
                }
            }
        }
    }

    public String A0D() {
        return "critical_unblock_low";
    }

    public String A0E() {
        return "contact";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (r5.A09 != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        if (r5 == null) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A0K(X.C62382rJ r20, java.util.Collection r21) {
        /*
            r19 = this;
            java.util.HashSet r3 = X.C17880vN.A12()
            int r0 = r21.size()
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)
            r1 = r19
            X.11P r0 = r1.A0H
            long r16 = X.AnonymousClass11P.A01(r0)
            java.util.Iterator r7 = r21.iterator()
        L_0x0018:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0089
            java.lang.Object r12 = r7.next()
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12
            boolean r0 = r3.contains(r12)
            if (r0 != 0) goto L_0x0018
            X.2rJ r6 = X.C62382rJ.A03
            r9 = r20
            boolean r0 = r9.equals(r6)
            r4 = 1
            r15 = 0
            if (r0 == 0) goto L_0x0087
            X.1M9 r0 = r1.A04
            X.1E7 r5 = r0.A0I(r12, r4)
            if (r5 != 0) goto L_0x0056
        L_0x003e:
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x0056
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contact-sync-handler/create-contact-mutations given contact "
            r4.append(r0)
            r4.append(r12)
            java.lang.String r0 = " doesn't exist in DB but should"
            X.C17890vO.A19(r4, r0)
            goto L_0x0018
        L_0x0056:
            boolean r0 = r12 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0085
            X.1Ln r4 = r1.A0A
            r0 = r12
            com.whatsapp.jid.PhoneUserJid r0 = (com.whatsapp.jid.PhoneUserJid) r0
            X.1E2 r11 = r4.A0C(r0)
        L_0x0063:
            if (r5 == 0) goto L_0x0083
            java.lang.String r14 = r5.A0T
            X.1Me r0 = r1.A0G
            java.lang.String r15 = r0.A0I(r5)
            int r0 = r5.A09
            r18 = 1
            if (r0 == 0) goto L_0x0075
        L_0x0073:
            r18 = 0
        L_0x0075:
            r10 = 0
            X.8qE r8 = new X.8qE
            r13 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r18)
            r2.add(r8)
            r3.add(r12)
            goto L_0x0018
        L_0x0083:
            r14 = r15
            goto L_0x0073
        L_0x0085:
            r11 = r15
            goto L_0x0063
        L_0x0087:
            r5 = r15
            goto L_0x003e
        L_0x0089:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46032Cp.A0K(X.2rJ, java.util.Collection):java.util.ArrayList");
    }
}
