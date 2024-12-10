package com.whatsapp.jobqueue.requirement;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1CJ;
import X.AnonymousClass1E9;
import X.AnonymousClass1MS;
import X.AnonymousClass1MZ;
import X.AnonymousClass1P1;
import X.AnonymousClass1P3;
import X.AnonymousClass1RP;
import X.AnonymousClass205;
import X.C000200d;
import X.C17880vN;
import X.C17900vP;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C22488B9u;
import X.C22931Dv;
import X.C22971Dz;
import X.C26111Qw;
import X.C50242Tr;
import X.C58002jz;
import X.C63872tp;
import X.C63962tz;
import android.content.Context;
import com.whatsapp.jid.DeviceJid;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.whispersystems.jobqueue.requirements.Requirement;

public class AxolotlMultiDeviceSessionRequirement implements Requirement, C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1P1 A00;
    public transient AnonymousClass1P3 A01;
    public transient AnonymousClass1RP A02;
    public transient C26111Qw A03;
    public transient AnonymousClass1BI A04;
    public transient C58002jz A05;
    public transient AnonymousClass00H A06;
    public transient Object A07 = C17880vN.A0p();
    public transient int A08;
    public transient List A09;
    public transient boolean A0A;
    public volatile transient int A0B;
    @Deprecated
    public boolean forceSenderKeyDistribution;
    public Boolean messageFromMe;
    public final String messageKeyId;
    public int messageType;
    public final String remoteRawJid;
    public final HashSet targetDeviceRawJids;

    public static List A00(AxolotlMultiDeviceSessionRequirement axolotlMultiDeviceSessionRequirement) {
        Set A002;
        List list;
        String A0I;
        synchronized (axolotlMultiDeviceSessionRequirement.A07) {
            if (axolotlMultiDeviceSessionRequirement instanceof AxolotlMultiDeviceSenderKeyRequirement) {
                AxolotlMultiDeviceSenderKeyRequirement axolotlMultiDeviceSenderKeyRequirement = (AxolotlMultiDeviceSenderKeyRequirement) axolotlMultiDeviceSessionRequirement;
                Set set = axolotlMultiDeviceSenderKeyRequirement.A05.A03;
                if (set == null || set.isEmpty()) {
                    C26111Qw r4 = axolotlMultiDeviceSenderKeyRequirement.A03;
                    AnonymousClass1BI r2 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    Boolean bool = axolotlMultiDeviceSenderKeyRequirement.messageFromMe;
                    C17960vV.A07(bool);
                    A002 = r4.A03(AnonymousClass205.A01(r2, axolotlMultiDeviceSenderKeyRequirement.messageKeyId, bool.booleanValue()));
                    AnonymousClass1BI r1 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    C22931Dv r0 = AnonymousClass1BI.A00;
                    AnonymousClass1E9 A003 = C50242Tr.A00(r1);
                    C17960vV.A07(A003);
                    int i = axolotlMultiDeviceSenderKeyRequirement.messageType;
                    C18030ve r9 = axolotlMultiDeviceSenderKeyRequirement.A04;
                    AnonymousClass11S r6 = axolotlMultiDeviceSenderKeyRequirement.A00;
                    AnonymousClass1CJ r42 = axolotlMultiDeviceSenderKeyRequirement.A01;
                    AnonymousClass1MS r22 = axolotlMultiDeviceSenderKeyRequirement.A02;
                    if (C18020vd.A05(C18040vf.A02, r9, 3069) && r42.A0R(A003)) {
                        if (i == 15 || i == 68) {
                            C63872tp A0A2 = r22.A0A(A003);
                            if (A0A2 != null && (!A0A2.A0X(r6))) {
                            }
                        }
                    }
                    boolean z = axolotlMultiDeviceSenderKeyRequirement.useParticipantUserHash;
                    AnonymousClass1MZ r02 = axolotlMultiDeviceSenderKeyRequirement.A03;
                    boolean z2 = axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption;
                    if (z) {
                        A0I = r02.A07(A003, z2);
                    } else {
                        C63872tp A0C = r02.A08.A0C(A003);
                        if (z2) {
                            A0I = A0C.A0G();
                        } else {
                            A0I = A0C.A0I();
                        }
                    }
                    if (!(!A0I.equals(axolotlMultiDeviceSenderKeyRequirement.groupParticipantHash))) {
                        HashSet A0N = axolotlMultiDeviceSenderKeyRequirement.A03.A08.A0C(A003).A0N(axolotlMultiDeviceSenderKeyRequirement.A00, axolotlMultiDeviceSenderKeyRequirement.A04, axolotlMultiDeviceSenderKeyRequirement.A05, axolotlMultiDeviceSenderKeyRequirement.useLidForEncryption);
                        A0N.retainAll(A002);
                        if (C22971Dz.A0O(A003)) {
                            HashSet A12 = C17880vN.A12();
                            Iterator it = A002.iterator();
                            while (it.hasNext()) {
                                DeviceJid A0R = C17880vN.A0R(it);
                                if (axolotlMultiDeviceSenderKeyRequirement.A00.A0P(A0R)) {
                                    A12.add(A0R);
                                }
                            }
                            A0N.addAll(A12);
                        }
                        A002 = A0N;
                    }
                } else {
                    A002 = axolotlMultiDeviceSenderKeyRequirement.A05.A00();
                }
            } else {
                A002 = axolotlMultiDeviceSessionRequirement.A05.A00();
            }
            if (!axolotlMultiDeviceSessionRequirement.A0A || axolotlMultiDeviceSessionRequirement.A08 != A002.size()) {
                if (!A002.isEmpty()) {
                    List A022 = axolotlMultiDeviceSessionRequirement.A00.A02(C63962tz.A06(A002));
                    axolotlMultiDeviceSessionRequirement.A09 = AnonymousClass000.A13();
                    int size = A022.size() / 100;
                    int size2 = A022.size() % 100;
                    for (int i2 = 0; i2 < size; i2++) {
                        axolotlMultiDeviceSessionRequirement.A09.add(A022.subList(i2 * 100, (i2 + 1) * 100));
                    }
                    if (size2 > 0) {
                        axolotlMultiDeviceSessionRequirement.A09.add(A022.subList(A022.size() - size2, A022.size()));
                    }
                } else {
                    axolotlMultiDeviceSessionRequirement.A09 = null;
                }
                axolotlMultiDeviceSessionRequirement.A0A = true;
                axolotlMultiDeviceSessionRequirement.A08 = A002.size();
                axolotlMultiDeviceSessionRequirement.A0B = 0;
            }
            list = axolotlMultiDeviceSessionRequirement.A09;
        }
        return list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r4.booleanValue() != false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AxolotlMultiDeviceSessionRequirement(X.AnonymousClass1BI r3, java.lang.Boolean r4, java.lang.String r5, java.util.Set r6, int r7) {
        /*
            r2 = this;
            r2.<init>()
            java.lang.Object r0 = X.C17880vN.A0p()
            r2.A07 = r0
            r2.messageKeyId = r5
            if (r4 == 0) goto L_0x0014
            boolean r1 = r4.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            r2.A04 = r3
            java.lang.String r0 = r3.getRawString()
            r2.remoteRawJid = r0
            java.util.HashSet r0 = X.C17880vN.A12()
            X.C22971Dz.A0H(r6, r0)
            r2.targetDeviceRawJids = r0
            r2.messageType = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.<init>(X.1BI, java.lang.Boolean, java.lang.String, java.util.Set, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r1 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void readObject(java.io.ObjectInputStream r3) {
        /*
            r2 = this;
            r3.defaultReadObject()
            java.lang.String r1 = r2.remoteRawJid     // Catch:{ 11T -> 0x002e }
            X.1Dv r0 = X.AnonymousClass1BI.A00     // Catch:{ 11T -> 0x002e }
            X.1BI r0 = X.C22931Dv.A01(r1)     // Catch:{ 11T -> 0x002e }
            r2.A04 = r0     // Catch:{ 11T -> 0x002e }
            java.lang.Object r0 = X.C17880vN.A0p()
            r2.A07 = r0
            java.lang.Boolean r0 = r2.messageFromMe
            if (r0 == 0) goto L_0x001e
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 1
        L_0x001f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.messageFromMe = r0
            boolean r0 = r2.forceSenderKeyDistribution
            if (r0 == 0) goto L_0x002d
            r0 = 58
            r2.messageType = r0
        L_0x002d:
            return
        L_0x002e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "invalid jid="
            r1.append(r0)
            java.lang.String r0 = r2.remoteRawJid
            java.io.InvalidObjectException r0 = X.C17900vP.A06(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.readObject(java.io.ObjectInputStream):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:25|26|27|28|29|63|60|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d1, code lost:
        if (r6 == r5) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x007f, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a9 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bfv() {
        /*
            r15 = this;
            java.util.List r4 = A00(r15)
            r14 = 1
            if (r4 == 0) goto L_0x00ee
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00ee
            int r3 = r15.A0B
        L_0x000f:
            X.1P3 r8 = r15.A01
            int r0 = r15.A0B
            java.lang.Object r2 = r4.get(r0)
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.String r1 = "containsAllSessions"
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r2)
            X.1Ov r2 = r8.A09
            java.util.LinkedHashMap r6 = r2.A04(r1, r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x002a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r5.next()
            boolean r0 = r6.containsKey(r1)
            if (r0 != 0) goto L_0x002a
            r6.put(r1, r1)
            goto L_0x002a
        L_0x003e:
            java.util.Collection r0 = r6.values()
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            java.util.HashSet r7 = X.C17880vN.A12()
            X.00H r11 = r8.A0P
            java.lang.Object r13 = r11.get()
            monitor-enter(r13)
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x00eb }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x00eb }
            java.util.HashSet r0 = r0.A00(r1)     // Catch:{ all -> 0x00eb }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00eb }
            r12 = 0
            if (r0 != 0) goto L_0x0064
            monitor-exit(r13)     // Catch:{ all -> 0x00eb }
            goto L_0x00d4
        L_0x0064:
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x00eb }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x00eb }
            java.util.HashSet r10 = r0.A01(r1)     // Catch:{ all -> 0x00eb }
            int r6 = r10.size()     // Catch:{ all -> 0x00eb }
            if (r6 != 0) goto L_0x0076
            monitor-exit(r13)     // Catch:{ all -> 0x00eb }
            goto L_0x00d3
        L_0x0076:
            java.util.LinkedHashMap r0 = r2.A05(r10)     // Catch:{ all -> 0x00eb }
            java.util.Iterator r9 = X.AnonymousClass000.A15(r0)     // Catch:{ all -> 0x00eb }
            r5 = 0
        L_0x007f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00eb }
            if (r0 == 0) goto L_0x00ad
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r9)     // Catch:{ all -> 0x00eb }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x00eb }
            X.2nE r2 = (X.C60002nE) r2     // Catch:{ all -> 0x00eb }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00eb }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x00eb }
            X.9zg r1 = new X.9zg     // Catch:{ IOException -> 0x00a9 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x00a9 }
            X.AnonymousClass1P3.A03(r1)     // Catch:{ IOException -> 0x00a9 }
            java.lang.Object r0 = r11.get()     // Catch:{ IOException -> 0x00a9 }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ IOException -> 0x00a9 }
            r0.A03(r1, r2)     // Catch:{ IOException -> 0x00a9 }
            int r5 = r5 + 1
            goto L_0x007f
        L_0x00a9:
            r7.add(r2)     // Catch:{ all -> 0x00eb }
            goto L_0x007f
        L_0x00ad:
            java.lang.Object r0 = r11.get()     // Catch:{ all -> 0x00eb }
            X.2nN r0 = (X.C60092nN) r0     // Catch:{ all -> 0x00eb }
            r0.A04(r10)     // Catch:{ all -> 0x00eb }
            monitor-exit(r13)     // Catch:{ all -> 0x00eb }
            java.util.Iterator r1 = r7.iterator()
        L_0x00bb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cb
            java.lang.Object r0 = r1.next()
            X.2nE r0 = (X.C60002nE) r0
            r8.A0G(r0)
            goto L_0x00bb
        L_0x00cb:
            int r0 = r7.size()
            if (r0 != 0) goto L_0x00d4
            if (r6 != r5) goto L_0x00d4
        L_0x00d3:
            r12 = 1
        L_0x00d4:
            r2 = 0
            if (r12 != 0) goto L_0x00d8
            return r2
        L_0x00d8:
            int r0 = r15.A0B
            int r1 = r0 + 1
            r15.A0B = r1
            int r0 = r4.size()
            if (r1 != r0) goto L_0x00e6
            r15.A0B = r2
        L_0x00e6:
            int r0 = r15.A0B
            if (r0 != r3) goto L_0x000f
            return r14
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x00eb }
            throw r0
        L_0x00ee:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.requirement.AxolotlMultiDeviceSessionRequirement.Bfv():boolean");
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17900vP.A04(context);
        this.A01 = (AnonymousClass1P3) r1.A9y.get();
        this.A06 = C000200d.A00(r1.A13);
        this.A03 = (C26111Qw) r1.A9M.get();
        this.A02 = (AnonymousClass1RP) r1.A6R.get();
        this.A00 = (AnonymousClass1P1) r1.A3K.get();
        AnonymousClass00H r6 = this.A06;
        C26111Qw r3 = this.A03;
        AnonymousClass1RP r2 = this.A02;
        AnonymousClass1BI r4 = this.A04;
        Boolean bool = this.messageFromMe;
        C17960vV.A07(bool);
        this.A05 = new C58002jz(r2, r3, r4, AnonymousClass205.A01(r4, this.messageKeyId, bool.booleanValue()), r6, this.targetDeviceRawJids, this.messageType);
    }
}
