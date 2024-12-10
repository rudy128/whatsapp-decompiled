package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass11S;
import X.AnonymousClass12E;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1MZ;
import X.AnonymousClass1PT;
import X.AnonymousClass1RP;
import X.AnonymousClass205;
import X.AnonymousClass206;
import X.AnonymousClass213;
import X.AnonymousClass3EB;
import X.AnonymousClass3EC;
import X.C000100c;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C18030ve;
import X.C190849lc;
import X.C203911y;
import X.C22488B9u;
import X.C22941Dw;
import X.C22971Dz;
import X.C25931Qe;
import X.C26071Qs;
import X.C26111Qw;
import X.C26171Rc;
import X.C26191Re;
import X.C32691hb;
import X.C55912gZ;
import X.C57282ip;
import X.C57842jj;
import X.C60472o5;
import X.C62162qt;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.Set;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public class SyncDeviceAndResendMessageJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient int A00;
    public transient AnonymousClass190 A01;
    public transient AnonymousClass11S A02;
    public transient AnonymousClass12E A03;
    public transient C26191Re A04;
    public transient C55912gZ A05;
    public transient AnonymousClass1MZ A06;
    public transient AnonymousClass1RP A07;
    public transient C26111Qw A08;
    public transient C26071Qs A09;
    public transient C18030ve A0A;
    public transient C57842jj A0B;
    public transient C203911y A0C;
    public transient AnonymousClass205 A0D;
    public transient Boolean A0E;
    public transient Set A0F = C17880vN.A12();
    public transient C26171Rc A0G;
    public transient AnonymousClass11P A0H;
    public transient AnonymousClass1CJ A0I;
    public transient C32691hb A0J;
    public transient C25931Qe A0K;
    public transient C57282ip A0L;
    public transient AnonymousClass1PT A0M;
    public transient boolean A0N;
    public final long expirationMs;
    public final String messageId;
    public final String messageRawChatJid;
    public final String[] rawUserJids;
    public final long startTimeMs;

    public SyncDeviceAndResendMessageJob(AnonymousClass205 r6, UserJid[] userJidArr, long j, long j2, boolean z) {
        super(AnonymousClass3EC.A00(new C190849lc()));
        C17960vV.A0J(userJidArr);
        for (UserJid userJid : userJidArr) {
            Set set = this.A0F;
            C17960vV.A08(userJid, "invalid jid");
            set.add(userJid);
        }
        this.A0D = r6;
        this.rawUserJids = C22971Dz.A0j(Arrays.asList(userJidArr));
        this.messageId = r6.A01;
        AnonymousClass1BI r0 = r6.A00;
        C17960vV.A07(r0);
        this.messageRawChatJid = r0.getRawString();
        this.expirationMs = j2;
        this.startTimeMs = j;
        this.A0E = Boolean.valueOf(z);
    }

    private AnonymousClass206 A00(AnonymousClass205 r3) {
        AnonymousClass206 A002 = this.A0L.A00(r3, true);
        if (A002 == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SyncDeviceAndResendMessageJob/revokeMessage/message ");
            A10.append(r3);
            C17890vO.A1A(A10, " no longer exist");
            return null;
        }
        if (AnonymousClass206.A08(A002) && C60472o5.A00(A002) == null) {
            this.A0K.A05(A002);
        }
        if (A002 instanceof AnonymousClass213) {
            return this.A0J.A01((AnonymousClass213) A002);
        }
        return A002;
    }

    public boolean A0B() {
        for (Requirement requirement : this.parameters.requirements) {
            if (!requirement.Bfv()) {
                if (requirement instanceof AnonymousClass3EB) {
                    this.A00 = 1;
                    this.A0N = true;
                    return false;
                }
                this.A00 = 2;
                return false;
            }
        }
        return true;
    }

    public void A0E(int i) {
        AnonymousClass206 A002 = this.A0L.A00(this.A0D, true);
        if (A002 != null) {
            Set A032 = this.A08.A03(this.A0D);
            AnonymousClass1PT r2 = this.A0M;
            C62162qt r1 = new C62162qt(A002);
            r1.A04 = i;
            r1.A03 = 1;
            C22971Dz.A0E(this.A01, r1, A032);
            r1.A0A = true;
            r1.A0C = this.A0N;
            C62162qt.A00(r1, r2, A032);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.rawUserJids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("rawJids must not be empty");
        }
        this.A0F = C17880vN.A12();
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            UserJid A022 = C22941Dw.A02(str);
            if (A022 != null) {
                this.A0F.add(A022);
                i++;
            } else {
                throw new InvalidObjectException(C17900vP.A0A("invalid jid:", str));
            }
        }
        AnonymousClass1BI A023 = AnonymousClass1BI.A00.A02(this.messageRawChatJid);
        if (A023 != null) {
            this.A0D = AnonymousClass205.A01(A023, this.messageId, true);
        } else {
            throw C17900vP.A06(this.messageRawChatJid, AnonymousClass000.A11("invalid jid:"));
        }
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDeviceAndResendMessageJob/onAdded/sync devices job added param=");
        C17890vO.A1A(A10, A0D());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDeviceAndResendMessageJob/onCanceled/param=");
        C17890vO.A1B(A10, A0D());
        C26171Rc r1 = this.A0G;
        AnonymousClass205 r0 = this.A0D;
        Set set = r1.A02;
        synchronized (set) {
            set.remove(r0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.HashSet} */
    /* JADX WARNING: type inference failed for: r6v7, types: [java.util.HashSet, java.util.AbstractCollection] */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x04b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x04be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x04c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x028a, code lost:
        if (((X.C59742mo) r9.A0H.get()).A02.A0R(r8) == false) goto L_0x028c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0356 A[Catch:{ all -> 0x05a4, Exception -> 0x05aa }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r19 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/param="
            r1.append(r0)
            r3 = r19
            java.lang.String r0 = r3.A0D()
            X.C17890vO.A1A(r1, r0)
            long r4 = r3.expirationMs
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            X.11P r0 = r3.A0H
            long r4 = X.AnonymousClass11P.A01(r0)
            long r1 = r3.expirationMs
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0059
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/skipping job due to expiration"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = 5
            r3.A0E(r0)
            int r0 = r3.A00
            if (r0 <= 0) goto L_0x0058
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/expiration due to waiting for requirements"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.190 r4 = r3.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            int r0 = r3.A00
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1.append(r0)
            java.lang.String r0 = "-"
            r1.append(r0)
            java.lang.Boolean r0 = r3.A0E
            java.lang.String r2 = X.C17890vO.A0V(r0, r1)
            r1 = 0
            java.lang.String r0 = "e2e-backfill-expired"
            r4.A0G(r0, r2, r1)
        L_0x0058:
            return
        L_0x0059:
            X.205 r0 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.206 r2 = r3.A00(r0)     // Catch:{ Exception -> 0x05aa }
            X.205 r0 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.1BI r1 = r0.A00     // Catch:{ Exception -> 0x05aa }
            boolean r0 = X.C22971Dz.A0T(r1)     // Catch:{ Exception -> 0x05aa }
            if (r0 != 0) goto L_0x024e
            X.1CJ r0 = r3.A0I     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r0.A0R(r1)     // Catch:{ Exception -> 0x05aa }
            if (r0 != 0) goto L_0x024e
            X.205 r0 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.1BI r0 = r0.A00     // Catch:{ Exception -> 0x05aa }
            boolean r0 = X.C22971Dz.A0a(r0)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x007f
            boolean r0 = r2 instanceof X.AnonymousClass212     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x024e
        L_0x007f:
            X.0ve r1 = r3.A0A     // Catch:{ Exception -> 0x05aa }
            r0 = 2193(0x891, float:3.073E-42)
            X.0vf r6 = X.C18040vf.A02     // Catch:{ Exception -> 0x05aa }
            boolean r0 = X.C18020vd.A05(r6, r1, r0)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x024e
            X.1MZ r1 = r3.A06     // Catch:{ Exception -> 0x05aa }
            X.205 r0 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.1BI r0 = r0.A00     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r1.A0I(r0)     // Catch:{ Exception -> 0x05aa }
            if (r0 != 0) goto L_0x024e
            java.util.Set r0 = r3.A0F     // Catch:{ Exception -> 0x05aa }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ Exception -> 0x05aa }
            r2.<init>(r0)     // Catch:{ Exception -> 0x05aa }
            X.11S r0 = r3.A02     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)     // Catch:{ Exception -> 0x05aa }
            r2.remove(r0)     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x05aa }
            r5 = 0
            if (r0 == 0) goto L_0x00ca
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/requestPrekeyForDevices only self device in the list. recipients size="
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            java.util.Set r0 = r3.A0F     // Catch:{ Exception -> 0x05aa }
            int r0 = r0.size()     // Catch:{ Exception -> 0x05aa }
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            X.C17890vO.A0w(r1)     // Catch:{ Exception -> 0x05aa }
        L_0x00c3:
            r0 = 8
            r3.A0E(r0)     // Catch:{ Exception -> 0x05aa }
            goto L_0x0592
        L_0x00ca:
            X.2jj r4 = r3.A0B     // Catch:{ Exception -> 0x05aa }
            X.00H r0 = r4.A00     // Catch:{ Exception -> 0x05aa }
            X.0vd r1 = X.C17880vN.A0P(r0)     // Catch:{ Exception -> 0x05aa }
            r0 = 10180(0x27c4, float:1.4265E-41)
            boolean r0 = X.C18020vd.A05(r6, r1, r0)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x00e4
            r4.A00(r2)     // Catch:{ Exception -> 0x00de }
            goto L_0x00e4
        L_0x00de:
            r1 = move-exception
            java.lang.String r0 = "ConversationDelegate/requestMissingLidsOnFetchPreKeyForMissingDevices"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x05aa }
        L_0x00e4:
            X.2gZ r7 = r3.A05     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = ""
            X.C17960vV.A0A(r0, r2)     // Catch:{ Exception -> 0x05aa }
            X.1Ug r8 = new X.1Ug     // Catch:{ Exception -> 0x05aa }
            r8.<init>()     // Catch:{ Exception -> 0x05aa }
            X.2c6 r11 = new X.2c6     // Catch:{ Exception -> 0x05aa }
            r11.<init>(r7, r8)     // Catch:{ Exception -> 0x05aa }
            X.190 r10 = r7.A00     // Catch:{ Exception -> 0x05aa }
            X.00H r0 = r7.A06     // Catch:{ Exception -> 0x05aa }
            X.1OZ r9 = X.C17880vN.A0U(r0)     // Catch:{ Exception -> 0x05aa }
            java.util.HashMap r6 = X.C17880vN.A11()     // Catch:{ Exception -> 0x05aa }
            java.util.Iterator r14 = r2.iterator()     // Catch:{ Exception -> 0x05aa }
        L_0x0105:
            boolean r0 = r14.hasNext()     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0147
            com.whatsapp.jid.UserJid r4 = X.C17880vN.A0T(r14)     // Catch:{ Exception -> 0x05aa }
            java.util.HashMap r2 = X.C17880vN.A11()     // Catch:{ Exception -> 0x05aa }
            X.1MR r0 = r7.A03     // Catch:{ Exception -> 0x05aa }
            java.util.HashSet r0 = r0.A0A(r4)     // Catch:{ Exception -> 0x05aa }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x05aa }
        L_0x011d:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0143
            com.whatsapp.jid.DeviceJid r1 = X.C17880vN.A0R(r13)     // Catch:{ Exception -> 0x05aa }
            X.1P1 r12 = r7.A01     // Catch:{ Exception -> 0x05aa }
            X.2nE r0 = X.C63962tz.A02(r1)     // Catch:{ Exception -> 0x05aa }
            X.2nE r12 = r12.A01(r0)     // Catch:{ Exception -> 0x05aa }
            X.1P3 r0 = r7.A02     // Catch:{ Exception -> 0x05aa }
            X.9zg r0 = r0.A0F(r12)     // Catch:{ Exception -> 0x05aa }
            X.9XJ r0 = r0.A01     // Catch:{ Exception -> 0x05aa }
            X.8cI r0 = r0.A00     // Catch:{ Exception -> 0x05aa }
            int r0 = r0.remoteRegistrationId_     // Catch:{ Exception -> 0x05aa }
            if (r0 <= 0) goto L_0x011d
            X.C17890vO.A0z(r1, r2, r0)     // Catch:{ Exception -> 0x05aa }
            goto L_0x011d
        L_0x0143:
            r6.put(r4, r2)     // Catch:{ Exception -> 0x05aa }
            goto L_0x0105
        L_0x0147:
            X.375 r7 = new X.375     // Catch:{ Exception -> 0x05aa }
            r7.<init>(r10, r11, r9, r6)     // Catch:{ Exception -> 0x05aa }
            java.util.Map r2 = r7.A01     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x05aa }
            r0 = r0 ^ 1
            X.C17960vV.A0C(r0)     // Catch:{ Exception -> 0x05aa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "FetchPrekeyForAllDevicesProtocolHelper/sendFetchPrekeyForAllDeviceRequest size="
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            int r0 = r2.size()     // Catch:{ Exception -> 0x05aa }
            X.C17900vP.A0o(r1, r0)     // Catch:{ Exception -> 0x05aa }
            X.1OZ r6 = r7.A00     // Catch:{ Exception -> 0x05aa }
            java.lang.String r4 = r6.A0B()     // Catch:{ Exception -> 0x05aa }
            int r0 = r2.size()     // Catch:{ Exception -> 0x05aa }
            java.util.ArrayList r11 = X.C17880vN.A0z(r0)     // Catch:{ Exception -> 0x05aa }
            java.util.Iterator r18 = X.AnonymousClass000.A15(r2)     // Catch:{ Exception -> 0x05aa }
        L_0x0179:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x05aa }
            r10 = 0
            java.lang.String r14 = "id"
            r12 = 1
            if (r0 == 0) goto L_0x01f3
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r18)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r13 = r0.getKey()     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.Jid r13 = (com.whatsapp.jid.Jid) r13     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x05aa }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x05aa }
            int r0 = r1.size()     // Catch:{ Exception -> 0x05aa }
            java.util.ArrayList r2 = X.C17880vN.A0z(r0)     // Catch:{ Exception -> 0x05aa }
            java.util.Iterator r17 = X.AnonymousClass000.A15(r1)     // Catch:{ Exception -> 0x05aa }
        L_0x019f:
            boolean r0 = r17.hasNext()     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x01dc
            java.util.Map$Entry r16 = X.AnonymousClass000.A16(r17)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r16.getValue()     // Catch:{ Exception -> 0x05aa }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x05aa }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x05aa }
            byte[] r1 = X.A8G.A03(r0)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "registration"
            X.1ca r15 = new X.1ca     // Catch:{ Exception -> 0x05aa }
            r15.<init>((java.lang.String) r0, (byte[]) r1, (X.AnonymousClass1MD[]) r10)     // Catch:{ Exception -> 0x05aa }
            X.1MD[] r9 = new X.AnonymousClass1MD[r12]     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r16.getKey()     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0     // Catch:{ Exception -> 0x05aa }
            int r1 = r0.getDevice()     // Catch:{ Exception -> 0x05aa }
            X.1MD r0 = new X.1MD     // Catch:{ Exception -> 0x05aa }
            r0.<init>((java.lang.String) r14, (int) r1)     // Catch:{ Exception -> 0x05aa }
            r9[r5] = r0     // Catch:{ Exception -> 0x05aa }
            java.lang.String r1 = "device"
            X.1ca r0 = new X.1ca     // Catch:{ Exception -> 0x05aa }
            r0.<init>((X.C29621ca) r15, (java.lang.String) r1, (X.AnonymousClass1MD[]) r9)     // Catch:{ Exception -> 0x05aa }
            r2.add(r0)     // Catch:{ Exception -> 0x05aa }
            goto L_0x019f
        L_0x01dc:
            X.1MD[] r9 = new X.AnonymousClass1MD[r12]     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "jid"
            X.C17880vN.A1I(r13, r0, r9, r5)     // Catch:{ Exception -> 0x05aa }
            X.1ca[] r2 = X.C17890vO.A1Y(r2, r5)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r1 = "user"
            X.1ca r0 = new X.1ca     // Catch:{ Exception -> 0x05aa }
            r0.<init>((java.lang.String) r1, (X.AnonymousClass1MD[]) r9, (X.C29621ca[]) r2)     // Catch:{ Exception -> 0x05aa }
            r11.add(r0)     // Catch:{ Exception -> 0x05aa }
            goto L_0x0179
        L_0x01f3:
            r0 = 4
            X.1MD[] r9 = new X.AnonymousClass1MD[r0]     // Catch:{ Exception -> 0x05aa }
            X.C17880vN.A1Q(r14, r4, r9, r5)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r1 = "xmlns"
            java.lang.String r0 = "encrypt"
            X.C17880vN.A1Q(r1, r0, r9, r12)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r1 = "type"
            java.lang.String r0 = "get"
            X.C17890vO.A12(r1, r0, r9)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r2 = "to"
            X.8v4 r0 = X.C173438v4.A00     // Catch:{ Exception -> 0x05aa }
            X.1MD r1 = new X.1MD     // Catch:{ Exception -> 0x05aa }
            r1.<init>((com.whatsapp.jid.Jid) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x05aa }
            r0 = 3
            r9[r0] = r1     // Catch:{ Exception -> 0x05aa }
            X.1ca[] r1 = X.C17890vO.A1Y(r11, r5)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "key_fetch"
            X.1ca r2 = new X.1ca     // Catch:{ Exception -> 0x05aa }
            r2.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r10, (X.C29621ca[]) r1)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r1 = "iq"
            X.1ca r0 = new X.1ca     // Catch:{ Exception -> 0x05aa }
            r0.<init>((X.C29621ca) r2, (java.lang.String) r1, (X.AnonymousClass1MD[]) r9)     // Catch:{ Exception -> 0x05aa }
            r14 = 64000(0xfa00, double:3.162E-319)
            r13 = 346(0x15a, float:4.85E-43)
            r9 = r6
            r10 = r7
            r11 = r0
            r12 = r4
            r9.A0I(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r8.get()     // Catch:{ Exception -> 0x05aa }
            boolean r4 = X.AnonymousClass000.A1Y(r0)     // Catch:{ Exception -> 0x05aa }
            X.1Re r2 = r3.A04     // Catch:{ Exception -> 0x05aa }
            java.util.Set r1 = r3.A0F     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r5]     // Catch:{ Exception -> 0x05aa }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.UserJid[] r1 = (com.whatsapp.jid.UserJid[]) r1     // Catch:{ Exception -> 0x05aa }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ Exception -> 0x05aa }
            goto L_0x0354
        L_0x024e:
            X.205 r0 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.1BI r0 = r0.A00     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x032e
            X.0ve r2 = r3.A0A     // Catch:{ Exception -> 0x05aa }
            r1 = 4961(0x1361, float:6.952E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ Exception -> 0x05aa }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x032e
            java.util.Set r0 = r3.A0F     // Catch:{ Exception -> 0x05aa }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ Exception -> 0x05aa }
            r12.<init>(r0)     // Catch:{ Exception -> 0x05aa }
            X.1MZ r9 = r3.A06     // Catch:{ Exception -> 0x05aa }
            X.205 r0 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.1BI r8 = r0.A00     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r8 instanceof X.AnonymousClass1E9     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0331
            boolean r0 = r8 instanceof X.C29671cg     // Catch:{ Exception -> 0x05aa }
            if (r0 != 0) goto L_0x0331
            boolean r0 = r8 instanceof com.whatsapp.jid.GroupJid     // Catch:{ Exception -> 0x05aa }
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x028c
            X.00H r0 = r9.A0H     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x05aa }
            X.2mo r0 = (X.C59742mo) r0     // Catch:{ Exception -> 0x05aa }
            X.1CJ r0 = r0.A02     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r0.A0R(r8)     // Catch:{ Exception -> 0x05aa }
            r4 = 1
            if (r0 != 0) goto L_0x028d
        L_0x028c:
            r4 = 0
        L_0x028d:
            r1 = r8
            X.1E9 r1 = (X.AnonymousClass1E9) r1     // Catch:{ Exception -> 0x05aa }
            X.1MW r0 = r9.A08     // Catch:{ Exception -> 0x05aa }
            X.2tp r2 = r0.A0B(r1)     // Catch:{ Exception -> 0x05aa }
            X.11S r1 = r9.A02     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r1)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x02a9
            X.2sr r0 = r2.A0D(r0, r5)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x02a9
            int r0 = r0.A01     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x02a9
            goto L_0x02bb
        L_0x02a9:
            X.1E2 r0 = r1.A09()     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x02ba
            X.2sr r0 = r2.A0D(r0, r5)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x02ba
            int r0 = r0.A01     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x02ba
            goto L_0x02bb
        L_0x02ba:
            r6 = 0
        L_0x02bb:
            if (r4 == 0) goto L_0x0331
            if (r6 == 0) goto L_0x0331
            java.util.HashSet r6 = X.C17880vN.A12()     // Catch:{ Exception -> 0x05aa }
            X.1MR r1 = r9.A0C     // Catch:{ Exception -> 0x05aa }
            java.util.Map r0 = r2.A08     // Catch:{ Exception -> 0x05aa }
            java.util.Set r0 = r0.keySet()     // Catch:{ Exception -> 0x05aa }
            X.10f r0 = X.C199410f.copyOf((java.util.Collection) r0)     // Catch:{ Exception -> 0x05aa }
            java.util.HashMap r10 = r1.A07(r0)     // Catch:{ Exception -> 0x05aa }
            X.10f r0 = r2.A0C()     // Catch:{ Exception -> 0x05aa }
            java.util.HashMap r0 = r1.A07(r0)     // Catch:{ Exception -> 0x05aa }
            java.util.Iterator r11 = X.C17890vO.A0i(r0)     // Catch:{ Exception -> 0x05aa }
        L_0x02df:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0313
            java.util.Map$Entry r7 = X.AnonymousClass000.A16(r11)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r1 = r7.getKey()     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1     // Catch:{ Exception -> 0x05aa }
            X.1Ln r0 = r9.A0B     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.jid.PhoneUserJid r1 = (com.whatsapp.jid.PhoneUserJid) r1     // Catch:{ Exception -> 0x05aa }
            X.1E1 r4 = r0.A0A(r1)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r2 = r10.get(r4)     // Catch:{ Exception -> 0x05aa }
            java.util.Set r2 = (java.util.Set) r2     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r7.getValue()     // Catch:{ Exception -> 0x05aa }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ Exception -> 0x05aa }
            if (r2 == 0) goto L_0x030f
            int r1 = r0.size()     // Catch:{ Exception -> 0x05aa }
            int r0 = r2.size()     // Catch:{ Exception -> 0x05aa }
            if (r1 == r0) goto L_0x02df
        L_0x030f:
            r6.add(r4)     // Catch:{ Exception -> 0x05aa }
            goto L_0x02df
        L_0x0313:
            int r0 = r6.size()     // Catch:{ Exception -> 0x05aa }
            if (r0 <= 0) goto L_0x0333
            X.190 r2 = r9.A00     // Catch:{ Exception -> 0x05aa }
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r8)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = ":"
            X.C17890vO.A14(r0, r1, r6)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "pnh-cag-missing-lids"
            r2.A0G(r0, r1, r5)     // Catch:{ Exception -> 0x05aa }
            goto L_0x0333
        L_0x032e:
            java.util.Set r12 = r3.A0F     // Catch:{ Exception -> 0x05aa }
            goto L_0x0336
        L_0x0331:
            X.1Om r6 = X.C25511Om.A00     // Catch:{ Exception -> 0x05aa }
        L_0x0333:
            r12.addAll(r6)     // Catch:{ Exception -> 0x05aa }
        L_0x0336:
            X.12E r9 = r3.A03     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "jid list is empty"
            X.C17960vV.A0A(r0, r12)     // Catch:{ Exception -> 0x05aa }
            X.2R1 r11 = X.AnonymousClass2R1.A0I     // Catch:{ Exception -> 0x05aa }
            r12.size()     // Catch:{ Exception -> 0x05aa }
            X.2qq r10 = X.C62132qq.A0H     // Catch:{ Exception -> 0x05aa }
            r13 = 1
            r14 = r13
            X.2P4 r0 = r9.A04(r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x05aa }
            X.2rf r0 = (X.C62602rf) r0     // Catch:{ Exception -> 0x05aa }
            boolean r4 = r0.A00()     // Catch:{ Exception -> 0x05aa }
        L_0x0354:
            if (r4 == 0) goto L_0x00c3
            X.205 r2 = r3.A0D     // Catch:{ Exception -> 0x05aa }
            X.206 r8 = r3.A00(r2)     // Catch:{ Exception -> 0x05aa }
            if (r8 == 0) goto L_0x0058
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/message = "
            X.C17900vP.A0Y(r8, r0, r1)     // Catch:{ Exception -> 0x05aa }
            X.1Qw r0 = r3.A08     // Catch:{ Exception -> 0x05aa }
            java.util.Set r9 = r0.A03(r2)     // Catch:{ Exception -> 0x05aa }
            X.1RP r10 = r3.A07     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r8 instanceof X.AnonymousClass23N     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x038a
            java.util.Set r7 = r10.A07(r8)     // Catch:{ Exception -> 0x05aa }
        L_0x0377:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/original list = "
            X.C17900vP.A0Y(r9, r0, r1)     // Catch:{ Exception -> 0x05aa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/new list = "
            X.C17900vP.A0Y(r7, r0, r1)     // Catch:{ Exception -> 0x05aa }
            goto L_0x03b9
        L_0x038a:
            X.205 r0 = r8.A0v     // Catch:{ Exception -> 0x05aa }
            boolean r1 = r0.A02     // Catch:{ Exception -> 0x05aa }
            if (r1 == 0) goto L_0x039d
            long r6 = r8.A0G     // Catch:{ Exception -> 0x05aa }
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x039d
            java.util.HashSet r7 = X.AnonymousClass1RP.A04(r10, r8)     // Catch:{ Exception -> 0x05aa }
            goto L_0x0377
        L_0x039d:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "MessageDeviceTargetManager/getDevicesToResendMessage/invalid message: "
            r4.append(r0)     // Catch:{ Exception -> 0x05aa }
            r4.append(r1)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = " : "
            r4.append(r0)     // Catch:{ Exception -> 0x05aa }
            long r0 = r8.A0G     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = X.C17880vN.A0u(r4, r0)     // Catch:{ Exception -> 0x05aa }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ Exception -> 0x05aa }
            r7 = 0
            goto L_0x0377
        L_0x03b9:
            if (r7 == 0) goto L_0x0058
            r7.removeAll(r9)     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x05aa }
            if (r0 != 0) goto L_0x0554
            X.1Qs r1 = r3.A09     // Catch:{ Exception -> 0x05aa }
            X.190 r0 = r3.A01     // Catch:{ Exception -> 0x05aa }
            java.util.Set r0 = X.C22971Dz.A0D(r0, r7)     // Catch:{ Exception -> 0x05aa }
            java.util.HashMap r6 = r1.A01(r0)     // Catch:{ Exception -> 0x05aa }
            X.1Qw r0 = r3.A08     // Catch:{ Exception -> 0x05aa }
            X.1Qt r5 = X.C26111Qw.A01(r0, r2)     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r5 instanceof X.AnonymousClass2De     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0437
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x05aa }
            r4.<init>()     // Catch:{ Exception -> 0x05aa }
        L_0x03df:
            java.util.HashSet r5 = X.C17880vN.A12()     // Catch:{ Exception -> 0x05aa }
            java.util.Iterator r9 = r7.iterator()     // Catch:{ Exception -> 0x05aa }
        L_0x03e7:
            boolean r0 = r9.hasNext()     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0553
            com.whatsapp.jid.DeviceJid r7 = X.C17880vN.A0R(r9)     // Catch:{ Exception -> 0x05aa }
            boolean r0 = X.C62832s4.A00(r7)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x03fd
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping hosted jid"
        L_0x03f9:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x05aa }
            goto L_0x03e7
        L_0x03fd:
            com.whatsapp.jid.UserJid r2 = r7.userJid     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r1 = r6.get(r2)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r4.get(r2)     // Catch:{ Exception -> 0x05aa }
            boolean r0 = X.C42171xk.A00(r1, r0)     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x0411
            r5.add(r7)     // Catch:{ Exception -> 0x05aa }
            goto L_0x03e7
        L_0x0411:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/filterInvalidDevices/dropping: "
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            r1.append(r7)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = " currentVersion: "
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r6.get(r2)     // Catch:{ Exception -> 0x05aa }
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = " versionsAtTimeOfMessageSend: "
            r1.append(r0)     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r4.get(r2)     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ Exception -> 0x05aa }
            goto L_0x03f9
        L_0x0437:
            boolean r0 = r5 instanceof X.C26091Qu     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x04ce
            X.1Qu r5 = (X.C26091Qu) r5     // Catch:{ Exception -> 0x05aa }
            r9 = 0
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x05aa }
            r4.<init>()     // Catch:{ Exception -> 0x05aa }
            X.00H r0 = r5.A01     // Catch:{ Exception -> 0x05aa }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x05aa }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ Exception -> 0x05aa }
            X.1W2 r0 = r0.A01     // Catch:{ Exception -> 0x05aa }
            X.206 r1 = r0.A05(r2)     // Catch:{ Exception -> 0x05aa }
            if (r1 == 0) goto L_0x03df
            r0 = 1
            java.lang.String[] r10 = new java.lang.String[r0]     // Catch:{ Exception -> 0x05aa }
            long r0 = r1.A0x     // Catch:{ Exception -> 0x05aa }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x05aa }
            r10[r9] = r0     // Catch:{ Exception -> 0x05aa }
            X.1Cd r0 = r5.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c3 }
            X.1at r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c3 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04bc }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x04bc }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, primary_device_version FROM receipt_device WHERE message_row_id = ?"
            java.lang.String r0 = "MessageReceiptDeviceStore/GET_PRIMARY_DEVICE_VERSIONS_SQL"
            android.database.Cursor r10 = r9.A0A(r1, r0, r10)     // Catch:{ all -> 0x04bc }
            java.lang.String r0 = "primary_device_version"
            int r12 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04b5 }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x04b5 }
        L_0x047d:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x04b5 }
            if (r0 == 0) goto L_0x04ad
            long r0 = r10.getLong(r11)     // Catch:{ all -> 0x04b5 }
            X.1DL r13 = r5.A02     // Catch:{ all -> 0x04b5 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r9 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r1 = r13.A0E(r9, r0)     // Catch:{ all -> 0x04b5 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x04b5 }
            if (r1 == 0) goto L_0x047d
            int r0 = r1.getDevice()     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x047d
            boolean r0 = r10.isNull(r12)     // Catch:{ all -> 0x04b5 }
            if (r0 != 0) goto L_0x047d
            com.whatsapp.jid.UserJid r9 = r1.userJid     // Catch:{ all -> 0x04b5 }
            long r0 = r10.getLong(r12)     // Catch:{ all -> 0x04b5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x04b5 }
            r4.put(r9, r0)     // Catch:{ all -> 0x04b5 }
            goto L_0x047d
        L_0x04ad:
            r10.close()     // Catch:{ all -> 0x04bc }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c3 }
            goto L_0x03df
        L_0x04b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04b7 }
        L_0x04b7:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x04bc }
            throw r0     // Catch:{ all -> 0x04bc }
        L_0x04bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x04be }
        L_0x04be:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c3 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c3 }
        L_0x04c3:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x05aa }
            X.1Cn r0 = r5.A03     // Catch:{ Exception -> 0x05aa }
            r0.A03()     // Catch:{ Exception -> 0x05aa }
            goto L_0x03df
        L_0x04ce:
            X.1Qv r5 = (X.C26101Qv) r5     // Catch:{ Exception -> 0x05aa }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Exception -> 0x05aa }
            r4.<init>()     // Catch:{ Exception -> 0x05aa }
            X.1BI r1 = r2.A00     // Catch:{ Exception -> 0x05aa }
            X.C17960vV.A07(r1)     // Catch:{ Exception -> 0x05aa }
            X.1LW r0 = r5.A00     // Catch:{ Exception -> 0x05aa }
            long r10 = r0.A09(r1)     // Catch:{ Exception -> 0x05aa }
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ Exception -> 0x05aa }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ Exception -> 0x05aa }
            r9[r1] = r0     // Catch:{ Exception -> 0x05aa }
            boolean r0 = r2.A02     // Catch:{ Exception -> 0x05aa }
            if (r0 == 0) goto L_0x04ff
            java.lang.String r1 = "1"
        L_0x04f0:
            r0 = 1
            r9[r0] = r1     // Catch:{ Exception -> 0x05aa }
            r1 = 2
            java.lang.String r0 = r2.A01     // Catch:{ Exception -> 0x05aa }
            r9[r1] = r0     // Catch:{ Exception -> 0x05aa }
            X.1Cd r0 = r5.A04     // Catch:{ Exception -> 0x05aa }
            X.1at r13 = r0.get()     // Catch:{ Exception -> 0x05aa }
            goto L_0x0502
        L_0x04ff:
            java.lang.String r1 = "0"
            goto L_0x04f0
        L_0x0502:
            r0 = r13
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x059f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x059f }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, primary_device_version FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ?"
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/GET_PRIMARY_DEVICE_VERSIONS_SQL"
            android.database.Cursor r10 = r2.A0A(r1, r0, r9)     // Catch:{ all -> 0x059f }
            java.lang.String r0 = "primary_device_version"
            int r11 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0593 }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r9 = r10.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0593 }
        L_0x051b:
            boolean r0 = r10.moveToNext()     // Catch:{ all -> 0x0593 }
            if (r0 == 0) goto L_0x054b
            long r0 = r10.getLong(r9)     // Catch:{ all -> 0x0593 }
            X.1DL r12 = r5.A02     // Catch:{ all -> 0x0593 }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r2 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r1 = r12.A0E(r2, r0)     // Catch:{ all -> 0x0593 }
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1     // Catch:{ all -> 0x0593 }
            if (r1 == 0) goto L_0x051b
            int r0 = r1.getDevice()     // Catch:{ all -> 0x0593 }
            if (r0 != 0) goto L_0x051b
            boolean r0 = r10.isNull(r11)     // Catch:{ all -> 0x0593 }
            if (r0 != 0) goto L_0x051b
            com.whatsapp.jid.UserJid r2 = r1.userJid     // Catch:{ all -> 0x0593 }
            long r0 = r10.getLong(r11)     // Catch:{ all -> 0x0593 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0593 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0593 }
            goto L_0x051b
        L_0x054b:
            r10.close()     // Catch:{ all -> 0x059f }
            r13.close()     // Catch:{ Exception -> 0x05aa }
            goto L_0x03df
        L_0x0553:
            r7 = r5
        L_0x0554:
            boolean r0 = r7.isEmpty()     // Catch:{ Exception -> 0x05aa }
            if (r0 != 0) goto L_0x0058
            X.1RP r0 = r3.A07     // Catch:{ Exception -> 0x05aa }
            r0.A08(r8, r7)     // Catch:{ Exception -> 0x05aa }
            X.1Qw r0 = r3.A08     // Catch:{ Exception -> 0x05aa }
            X.1Qt r0 = X.C26111Qw.A00(r0, r8)     // Catch:{ Exception -> 0x05aa }
            r0.A08(r8, r7)     // Catch:{ Exception -> 0x05aa }
            X.1Ug r11 = new X.1Ug     // Catch:{ Exception -> 0x05aa }
            r11.<init>()     // Catch:{ Exception -> 0x05aa }
            X.11y r10 = r3.A0C     // Catch:{ Exception -> 0x05aa }
            long r4 = r3.expirationMs     // Catch:{ Exception -> 0x05aa }
            long r1 = r3.startTimeMs     // Catch:{ Exception -> 0x05aa }
            r9 = 0
            X.11P r0 = r10.A08     // Catch:{ Exception -> 0x05aa }
            X.6k3 r6 = new X.6k3     // Catch:{ Exception -> 0x05aa }
            r6.<init>(r0, r8)     // Catch:{ Exception -> 0x05aa }
            r0 = 0
            r6.A07 = r0     // Catch:{ Exception -> 0x05aa }
            r6.A06 = r0     // Catch:{ Exception -> 0x05aa }
            r6.A05 = r7     // Catch:{ Exception -> 0x05aa }
            r6.A02 = r4     // Catch:{ Exception -> 0x05aa }
            r6.A00 = r1     // Catch:{ Exception -> 0x05aa }
            X.6tv r0 = new X.6tv     // Catch:{ Exception -> 0x05aa }
            r0.<init>(r6)     // Catch:{ Exception -> 0x05aa }
            X.C203911y.A00(r10, r0, r11, r9)     // Catch:{ Exception -> 0x05aa }
            r11.get()     // Catch:{ Exception -> 0x05aa }
            goto L_0x05a9
        L_0x0592:
            return
        L_0x0593:
            r1 = move-exception
            if (r10 == 0) goto L_0x059e
            r10.close()     // Catch:{ all -> 0x059a }
            goto L_0x059e
        L_0x059a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x059f }
        L_0x059e:
            throw r1     // Catch:{ all -> 0x059f }
        L_0x059f:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x05a4 }
            goto L_0x05a8
        L_0x05a4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x05aa }
        L_0x05a8:
            throw r1     // Catch:{ Exception -> 0x05aa }
        L_0x05a9:
            return
        L_0x05aa:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SyncDeviceAndResendMessageJob/onRun/error, param="
            r1.append(r0)
            java.lang.String r0 = r3.A0D()
            X.C17890vO.A19(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceAndResendMessageJob.A0A():void");
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDeviceAndResendMessageJob/onShouldReply/param=");
        A10.append(A0D());
        C17900vP.A0Z(exc, " ;exception=", A10);
        return true;
    }

    public String A0D() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; key=");
        A10.append(this.A0D);
        A10.append("; timeoutMs=");
        A10.append(this.expirationMs);
        A10.append("; rawJids=");
        A10.append(this.A0F);
        A10.append("; offlineInProgressDuringMessageSend=");
        return C17890vO.A0V(this.A0E, A10);
    }

    public void CIZ(Context context) {
        C000100c A042 = C17900vP.A04(context);
        this.A0H = A042.CP7();
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A0A = AnonymousClass10E.A8r(r1);
        this.A01 = A042.BG6();
        this.A02 = A042.BA6();
        this.A0I = (AnonymousClass1CJ) r1.A2H.get();
        this.A0M = (AnonymousClass1PT) r1.A6U.get();
        this.A04 = (C26191Re) r1.A3O.get();
        this.A0B = (C57842jj) r1.A6u.get();
        this.A03 = (AnonymousClass12E) r1.A2k.get();
        this.A0C = (C203911y) r1.A9n.get();
        this.A0L = (C57282ip) r1.A6a.get();
        this.A0J = (C32691hb) r1.A3a.get();
        this.A08 = (C26111Qw) r1.A9M.get();
        this.A0G = (C26171Rc) r1.A3N.get();
        this.A0K = (C25931Qe) r1.A3z.get();
        this.A06 = (AnonymousClass1MZ) r1.A4t.get();
        this.A09 = (C26071Qs) r1.A8c.get();
        this.A07 = (AnonymousClass1RP) r1.A6R.get();
        this.A05 = (C55912gZ) r1.Ao8.A00.A2E.get();
        this.A0G.A01(this.A0D);
    }
}
