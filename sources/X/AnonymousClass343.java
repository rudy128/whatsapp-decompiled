package X;

import android.text.TextUtils;
import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.343  reason: invalid class name */
public class AnonymousClass343 implements BC8 {
    public final int A00;
    public final int A01;
    public final C19880zA A02;
    public final AnonymousClass190 A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass1P1 A05;
    public final AnonymousClass1P3 A06;
    public final AnonymousClass1MZ A07;
    public final AnonymousClass1U5 A08;
    public final C18030ve A09;
    public final A8R A0A;
    public final C58002jz A0B;
    public final C63182se A0C;
    public final C49352Qd A0D;
    public final C49352Qd A0E;
    public final C58302kT A0F;
    public final AnonymousClass1PT A0G;
    public final C166418cr A0H;
    public final AnonymousClass206 A0I;
    public final AnonymousClass205 A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final Map A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final byte[] A0Q;
    public final C19880zA A0R;
    public final C19880zA A0S;
    public final C19880zA A0T;
    public final C19880zA A0U;
    public final C52122aP A0V;
    public final Jid A0W;

    private C198079xk A00(DeviceJid deviceJid, C166418cr r13, AnonymousClass206 r14, int i) {
        int A012;
        DeviceJid deviceJid2 = deviceJid;
        C198079xk A0B2 = this.A06.A0B(AnonymousClass1P1.A00(C63962tz.A02(deviceJid), this.A0E, this.A0D), r13.A0M());
        if (deviceJid.getDevice() == 0 || this.A0B.A00().contains(deviceJid)) {
            AnonymousClass1PT r1 = this.A0G;
            Jid jid = this.A0W;
            int i2 = this.A01;
            if (A0B2.A01 == 0) {
                A012 = 0;
            } else {
                A012 = this.A0F.A01(deviceJid) + 1;
            }
            r1.A09(A0B2, deviceJid2, jid, r14, i2, A012, this.A00, i, this.A0O);
            return A0B2;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("E2eMessageEncryptor/createEncryptedMessage recipientDevice=");
        A10.append(deviceJid);
        C17890vO.A1B(A10, " identity has changed, ignoring encryption failure");
        return null;
    }

    public static C166418cr A01(C23577Bm6 bm6, C187959ge r2) {
        C23624Bmt A0N2 = C166418cr.DEFAULT_INSTANCE.A0N();
        A0N2.A0F(bm6);
        AnonymousClass8X8 r0 = (AnonymousClass8X8) A0N2;
        AnonymousClass9AU.A03(r2, r0);
        return (C166418cr) r0.A0C();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        if (r6 != false) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.TreeMap A03(java.util.Map r19, int r20) {
        /*
            r18 = this;
            java.util.TreeMap r3 = new java.util.TreeMap
            r3.<init>()
            java.util.HashMap r7 = X.C17880vN.A11()
            java.util.Iterator r6 = X.AnonymousClass000.A15(r19)
        L_0x000d:
            boolean r0 = r6.hasNext()
            r5 = r18
            if (r0 == 0) goto L_0x0039
            java.util.Map$Entry r4 = X.AnonymousClass000.A16(r6)
            java.lang.Object r0 = r4.getKey()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            X.2nE r2 = X.C63962tz.A02(r0)
            X.2Qd r1 = r5.A0E
            X.2Qd r0 = r5.A0D
            X.2nE r1 = X.AnonymousClass1P1.A00(r2, r1, r0)
            java.lang.Object r0 = r4.getValue()
            X.DNC r0 = (X.DNC) r0
            byte[] r0 = r0.A0M()
            r7.put(r1, r0)
            goto L_0x000d
        L_0x0039:
            X.1P3 r6 = r5.A06
            java.util.HashMap r4 = X.C17880vN.A11()
            java.util.Iterator r2 = X.C17890vO.A0i(r7)
        L_0x0043:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0061
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.Object r1 = r0.getKey()
            X.2nE r1 = (X.C60002nE) r1
            java.lang.Object r0 = r0.getValue()
            byte[] r0 = (byte[]) r0
            X.9xk r0 = r6.A0B(r1, r0)
            r4.put(r1, r0)
            goto L_0x0043
        L_0x0061:
            java.util.Iterator r7 = X.C17890vO.A0i(r4)
            r2 = 0
            r4 = r2
        L_0x0067:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00df
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r7)
            java.lang.Object r0 = r1.getKey()
            X.2nE r0 = (X.C60002nE) r0
            com.whatsapp.jid.DeviceJid r10 = X.C63962tz.A03(r0)
            X.C17960vV.A07(r10)
            java.lang.Object r9 = r1.getValue()
            X.9xk r9 = (X.C198079xk) r9
            int r1 = r9.A01
            if (r1 == 0) goto L_0x00dd
            if (r4 != 0) goto L_0x0090
            X.2jz r0 = r5.A0B
            java.util.Set r4 = r0.A00()
        L_0x0090:
            boolean r6 = r4.contains(r10)
            if (r6 == 0) goto L_0x00bf
        L_0x0096:
            X.1PT r8 = r5.A0G
            X.206 r12 = r5.A0I
            com.whatsapp.jid.Jid r11 = r5.A0W
            int r13 = r5.A01
            if (r1 != 0) goto L_0x00b6
            r14 = 0
        L_0x00a1:
            int r15 = r5.A00
            boolean r0 = r5.A0O
            r16 = r20
            r17 = r0
            r8.A09(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r1 != 0) goto L_0x00bf
            X.9r6 r0 = X.C198079xk.A00(r9)
            r3.put(r10, r0)
            goto L_0x0067
        L_0x00b6:
            X.2kT r0 = r5.A0F
            int r0 = r0.A01(r10)
            int r14 = r0 + 1
            goto L_0x00a1
        L_0x00bf:
            int r0 = r10.getDevice()
            if (r0 != 0) goto L_0x00d3
            if (r6 == 0) goto L_0x00d3
            X.2kT r0 = r5.A0F
            int r0 = r0.A00(r10)
            X.2RT r1 = new X.2RT
            r1.<init>(r10, r0)
            throw r1
        L_0x00d3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "E2eMessageEncryptor/encryptMessages/dropping message due to encryption failure for "
            X.C17900vP.A0X(r10, r0, r1)
            goto L_0x0067
        L_0x00dd:
            r6 = 1
            goto L_0x0096
        L_0x00df:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x00f7
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x00f7
            java.lang.String r0 = "E2eMessageEncryptor/encryptMessages/no encrypted messages due to encryption failures"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            X.2RT r1 = new X.2RT
            r1.<init>(r2, r0)
            throw r1
        L_0x00f7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass343.A03(java.util.Map, int):java.util.TreeMap");
    }

    public C166418cr A05(C51942a6 r5, C187959ge r6, String str) {
        byte[] bArr = r5.A00;
        C17960vV.A07(bArr);
        AnonymousClass8ZH r0 = ((C166418cr) C166418cr.A00().A00).senderKeyDistributionMessage_;
        if (r0 == null) {
            r0 = AnonymousClass8ZH.DEFAULT_INSTANCE;
        }
        C163908Wu r2 = (C163908Wu) r0.A0O();
        r2.A0H(this.A0M);
        r2.A0G(DSQ.A01(bArr, 0, bArr.length));
        AnonymousClass8X8 A002 = C166418cr.A00();
        A002.A0P(r2);
        AnonymousClass9AU.A03(r6, A002);
        C166418cr r22 = (C166418cr) A002.A0C();
        if (str != null) {
            return A8R.A01(this.A09, r22, (String) null, str);
        }
        return r22;
    }

    /* JADX WARNING: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x019b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194059r6 BDW(com.whatsapp.jid.DeviceJid r23, int r24, boolean r25) {
        /*
            r22 = this;
            r2 = r23
            r3 = r22
            r1 = r24
            if (r25 == 0) goto L_0x00bd
            X.205 r0 = r3.A0J
            X.1BI r4 = r0.A00
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1E9 r4 = X.C50242Tr.A00(r4)
            X.C17960vV.A07(r4)
            boolean r5 = r3.A0P
            X.11S r0 = r3.A04
            if (r5 == 0) goto L_0x0055
            X.1yJ r11 = r0.A08()
        L_0x001f:
            X.C17960vV.A07(r11)
            com.whatsapp.jid.DeviceJid r11 = (com.whatsapp.jid.DeviceJid) r11
            X.2nE r6 = X.C63962tz.A02(r11)
            X.2Qd r5 = r3.A0E
            X.2Qd r0 = r3.A0D
            X.2nE r6 = X.AnonymousClass1P1.A00(r6, r5, r0)
            java.lang.String r0 = r3.A0M
            X.2nC r5 = new X.2nC
            r5.<init>(r6, r0)
            X.8cr r7 = r3.A0H
            X.206 r10 = r3.A0I
            boolean r0 = X.A8R.A06(r10)
            if (r0 == 0) goto L_0x0045
            X.8cr r7 = X.A8R.A03(r7, r10)
        L_0x0045:
            X.1P3 r6 = r3.A06
            byte[] r12 = r7.A0M()
            X.1Os r0 = r6.A0H
            X.3Ez r15 = X.C25571Os.A01(r0, r5)
            r15.lock()
            goto L_0x005b
        L_0x0055:
            r0.A0I()
            X.1E3 r11 = r0.A02
            goto L_0x001f
        L_0x005b:
            X.0ve r0 = r6.A0K     // Catch:{ all -> 0x00b3 }
            X.C20069A5t.A01(r0)     // Catch:{ all -> 0x00b3 }
            X.1PJ r7 = r6.A01     // Catch:{ all -> 0x00b3 }
            X.1Ot r0 = r7.A03     // Catch:{ all -> 0x00b3 }
            boolean r9 = r0.A03()     // Catch:{ all -> 0x00b3 }
            X.1PH r7 = r7.A00     // Catch:{ all -> 0x00b3 }
            X.1Oy r14 = r7.A04     // Catch:{ all -> 0x00b3 }
            X.2kj r8 = X.C62812s2.A02(r5)     // Catch:{ all -> 0x00b3 }
            if (r9 == 0) goto L_0x007d
            java.lang.Object r7 = X.C20024A3q.A00     // Catch:{ all -> 0x00b3 }
            monitor-enter(r7)     // Catch:{ all -> 0x00b3 }
            X.C181959Sm.A00(r14, r8)     // Catch:{ all -> 0x007a }
            monitor-exit(r7)     // Catch:{ all -> 0x007a }
            goto L_0x0080
        L_0x007a:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x00b3 }
        L_0x007d:
            X.C181959Sm.A00(r14, r8)     // Catch:{ all -> 0x00b3 }
        L_0x0080:
            X.2kj r13 = X.C62812s2.A02(r5)     // Catch:{ all -> 0x00b3 }
            r9 = 0
            r8 = 0
            byte[] r7 = X.C60782ob.A00(r12)     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
            boolean r0 = r0.A03()     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
            if (r0 == 0) goto L_0x009c
            java.lang.Object r12 = X.C20024A3q.A00     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
            monitor-enter(r12)     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
            byte[] r7 = X.C20024A3q.A01(r14, r13, r7)     // Catch:{ all -> 0x0099 }
            monitor-exit(r12)     // Catch:{ all -> 0x0099 }
            goto L_0x00a0
        L_0x0099:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x0099 }
            throw r0     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
        L_0x009c:
            byte[] r7 = X.C20024A3q.A01(r14, r13, r7)     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
        L_0x00a0:
            r0 = 3
            X.9xk r13 = new X.9xk     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
            r13.<init>(r7, r0, r8)     // Catch:{ 1P8 -> 0x00ab, 1P7 -> 0x00a8 }
            goto L_0x012f
        L_0x00a8:
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            goto L_0x00ad
        L_0x00ab:
            r0 = -1002(0xfffffffffffffc16, float:NaN)
        L_0x00ad:
            X.9xk r13 = new X.9xk     // Catch:{ all -> 0x00b3 }
            r13.<init>(r9, r8, r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x012f
        L_0x00b3:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x00b8 }
            throw r1
        L_0x00b8:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x00bd:
            X.C17960vV.A07(r2)
            int r0 = r2.getDevice()
            if (r0 == 0) goto L_0x00e5
            X.2jz r0 = r3.A0B
            java.util.Set r0 = r0.A00()
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x00e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "E2eMessageEncryptor/targetDeviceJid="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " identity has changed, dropping the message"
            X.C17890vO.A1B(r1, r0)
        L_0x00e3:
            r0 = 0
            return r0
        L_0x00e5:
            X.205 r6 = r3.A0J
            X.1BI r0 = r6.A00
            com.whatsapp.jid.UserJid r9 = X.C22941Dw.A00(r0)
            X.A8R r8 = r3.A0A
            X.8cr r5 = r3.A0H
            X.206 r7 = r3.A0I
            java.lang.String r4 = r3.A0L
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r4 = r3.A0M
        L_0x00fd:
            r10 = r8
            r11 = r2
            r12 = r5
            r13 = r7
            r14 = r6
            r15 = r4
            X.8cr r6 = r10.A08(r11, r12, r13, r14, r15)
            if (r9 != 0) goto L_0x010b
            com.whatsapp.jid.UserJid r9 = r2.userJid
        L_0x010b:
            X.1U5 r0 = r8.A02
            X.9ge r0 = r0.A06(r9)
            if (r0 == 0) goto L_0x0117
            X.8cr r6 = A01(r6, r0)
        L_0x0117:
            X.0ve r5 = r3.A09
            r4 = 1723(0x6bb, float:2.414E-42)
            X.0vf r0 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r0, r5, r4)
            r0 = -1
            if (r4 == r0) goto L_0x0128
            X.8cr r6 = X.A8R.A02(r6, r4)
        L_0x0128:
            X.9xk r13 = r3.A00(r2, r6, r7, r1)
            if (r13 != 0) goto L_0x017c
            goto L_0x00e3
        L_0x012f:
            r15.close()
            X.1PT r12 = r3.A0G
            int r8 = r3.A01
            int r7 = r13.A01
            if (r7 != 0) goto L_0x019b
            r18 = 0
        L_0x013c:
            int r11 = r3.A00
            boolean r0 = r3.A0O
            r19 = r11
            r20 = r1
            r21 = r0
            r16 = r10
            r17 = r8
            r15 = r4
            r14 = r9
            r12.A09(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r7 != r0) goto L_0x0185
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "E2eMessageEncryptor/createCommonEncryptedMessageForGroup cipher has invalid sender key"
            r1.append(r0)
            java.lang.String r0 = r3.A0K
            X.C17890vO.A1B(r1, r0)
            r1 = 1
            X.1Oy r0 = r6.A08
            boolean r0 = r0.A05(r5, r1)
            if (r0 == 0) goto L_0x0171
            java.lang.Integer r0 = X.C17880vN.A0m()
            r12.A0D(r4, r0)
        L_0x0171:
            X.1MZ r1 = r3.A07
            X.1MW r0 = r1.A08
            X.2tp r0 = r0.A0C(r4)
            r1.A09(r0)
        L_0x017c:
            int r0 = r13.A01
            if (r0 != 0) goto L_0x01a4
            X.9r6 r0 = X.C198079xk.A00(r13)
            return r0
        L_0x0185:
            if (r7 == 0) goto L_0x017c
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r7 == r0) goto L_0x017c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error when calling signalCoordinator.encryptForGroup(); status="
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r7)
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
        L_0x019b:
            X.2kT r0 = r3.A0F
            int r0 = r0.A01(r11)
            int r18 = r0 + 1
            goto L_0x013c
        L_0x01a4:
            boolean r1 = r3.A0P
            X.11S r0 = r3.A04
            if (r1 == 0) goto L_0x01c3
            X.1yJ r0 = r0.A08()
        L_0x01ae:
            if (r25 == 0) goto L_0x01b1
            r2 = r0
        L_0x01b1:
            X.2kT r1 = r3.A0F
            X.C17960vV.A07(r2)
            r0 = r2
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            int r0 = r1.A00(r0)
            X.2RT r1 = new X.2RT
            r1.<init>(r2, r0)
            throw r1
        L_0x01c3:
            r0.A0I()
            X.1E3 r0 = r0.A02
            goto L_0x01ae
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass343.BDW(com.whatsapp.jid.DeviceJid, int, boolean):X.9r6");
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d2, code lost:
        if (r10.A0P(r1) == false) goto L_0x01d4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C194609s0 BWN(boolean r22, boolean r23, boolean r24) {
        /*
            r21 = this;
            r6 = r21
            com.whatsapp.jid.Jid r1 = r6.A0W
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1E9 r9 = X.C50242Tr.A00(r1)
            if (r23 == 0) goto L_0x0121
            X.C17960vV.A07(r9)
            java.util.HashMap r4 = X.C17880vN.A11()
            if (r9 != 0) goto L_0x002d
            r8 = 0
        L_0x0016:
            r5 = 0
            if (r8 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "E2eMessageEncryptorgetParticipantsDataForForceOneOneEncryption/unable to retrieve participants for one time message "
            r1.append(r0)
            java.lang.String r0 = r6.A0K
            X.C17890vO.A1B(r1, r0)
            X.9s0 r3 = new X.9s0
            r3.<init>(r5, r4, r5)
            return r3
        L_0x002d:
            X.2jz r0 = r6.A0B
            java.util.Set r8 = r0.A00()
            goto L_0x0016
        L_0x0034:
            boolean r0 = X.C22971Dz.A0O(r9)
            if (r0 == 0) goto L_0x0050
            byte[] r0 = r6.A0Q
            if (r0 == 0) goto L_0x0050
            java.util.Map r0 = r6.A0N
            if (r0 == 0) goto L_0x0050
            android.os.Parcelable$Creator r0 = X.C47712Jo.CREATOR
            boolean r0 = r9 instanceof X.C47712Jo
            if (r0 == 0) goto L_0x0058
            X.2Jo r9 = (X.C47712Jo) r9
        L_0x004a:
            X.C17960vV.A07(r9)
            r6.A04(r9, r8, r4)
        L_0x0050:
            java.lang.String r0 = "E2eMessageEncryptor/getParticipantsDataForForceOneOneEncryption"
            X.1Ez r3 = new X.1Ez
            r3.<init>((java.lang.String) r0)
            goto L_0x005a
        L_0x0058:
            r9 = 0
            goto L_0x004a
        L_0x005a:
            r3.A04()     // Catch:{ all -> 0x011c }
            X.190 r1 = r6.A03     // Catch:{ all -> 0x011c }
            int r0 = r8.size()     // Catch:{ all -> 0x011c }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x011c }
            r2.<init>(r0)     // Catch:{ all -> 0x011c }
            X.C22971Dz.A0F(r1, r8, r2)     // Catch:{ all -> 0x011c }
            X.1U5 r1 = r6.A08     // Catch:{ all -> 0x011c }
            boolean r0 = r6.A0P     // Catch:{ all -> 0x011c }
            java.util.HashMap r9 = r1.A09(r2, r0)     // Catch:{ all -> 0x011c }
            java.util.TreeMap r7 = new java.util.TreeMap     // Catch:{ all -> 0x011c }
            r7.<init>()     // Catch:{ all -> 0x011c }
            X.0zA r1 = r6.A02     // Catch:{ all -> 0x011c }
            boolean r0 = r1.A07()     // Catch:{ all -> 0x011c }
            r12 = 0
            r2 = 1
            if (r0 == 0) goto L_0x008c
            r1.A03()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "isPremiumMessageBroadcast"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{ all -> 0x011c }
            throw r0     // Catch:{ all -> 0x011c }
        L_0x008c:
            r8.size()     // Catch:{ all -> 0x011c }
            java.util.Iterator r11 = r8.iterator()     // Catch:{ all -> 0x011c }
        L_0x0093:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00e7
            com.whatsapp.jid.DeviceJid r14 = X.C17880vN.A0R(r11)     // Catch:{ all -> 0x011c }
            X.11S r0 = r6.A04     // Catch:{ all -> 0x011c }
            boolean r0 = r0.A0Q(r14)     // Catch:{ all -> 0x011c }
            if (r0 != 0) goto L_0x0093
            X.A8R r13 = r6.A0A     // Catch:{ all -> 0x011c }
            X.205 r10 = r6.A0J     // Catch:{ all -> 0x011c }
            X.8cr r15 = r6.A0H     // Catch:{ all -> 0x011c }
            X.206 r8 = r6.A0I     // Catch:{ all -> 0x011c }
            java.lang.String r1 = r6.A0L     // Catch:{ all -> 0x011c }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r1 = r6.A0M     // Catch:{ all -> 0x011c }
        L_0x00b7:
            r16 = r8
            r17 = r10
            r18 = r1
            X.8cr r10 = r13.A08(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x011c }
            com.whatsapp.jid.UserJid r0 = r14.userJid     // Catch:{ all -> 0x011c }
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x011c }
            X.9ge r0 = (X.C187959ge) r0     // Catch:{ all -> 0x011c }
            if (r0 == 0) goto L_0x00cf
            X.8cr r10 = A01(r10, r0)     // Catch:{ all -> 0x011c }
        L_0x00cf:
            X.0ve r8 = r6.A09     // Catch:{ all -> 0x011c }
            r1 = 1723(0x6bb, float:2.414E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x011c }
            int r1 = X.C18020vd.A00(r0, r8, r1)     // Catch:{ all -> 0x011c }
            r0 = -1
            if (r1 == r0) goto L_0x00e0
            X.8cr r10 = X.A8R.A02(r10, r1)     // Catch:{ all -> 0x011c }
        L_0x00e0:
            if (r12 != 0) goto L_0x00e3
            r12 = 1
        L_0x00e3:
            r7.put(r14, r10)     // Catch:{ all -> 0x011c }
            goto L_0x0093
        L_0x00e7:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "e2e messages created: "
            r1.append(r0)     // Catch:{ all -> 0x011c }
            int r0 = r7.size()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x011c }
            r3.A03(r0)     // Catch:{ all -> 0x011c }
            java.util.TreeMap r2 = r6.A03(r7, r2)     // Catch:{ all -> 0x011c }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = "messages encrypted: "
            r1.append(r0)     // Catch:{ all -> 0x011c }
            int r0 = r2.size()     // Catch:{ all -> 0x011c }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x011c }
            r3.A03(r0)     // Catch:{ all -> 0x011c }
            r3.A02()
            X.9s0 r3 = new X.9s0
            r3.<init>(r5, r4, r2)
            return r3
        L_0x011c:
            r0 = move-exception
            r3.A02()
            throw r0
        L_0x0121:
            if (r22 == 0) goto L_0x02c8
            if (r24 == 0) goto L_0x02c8
            X.C17960vV.A07(r9)
            java.util.HashMap r12 = X.C17880vN.A11()
            if (r9 != 0) goto L_0x0146
            r11 = 0
        L_0x012f:
            r13 = 0
            if (r11 != 0) goto L_0x014d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "E2eMessageEncryptor/getParticipantsData/unable to retrieve participants in group at time of message "
            r1.append(r0)
            java.lang.String r0 = r6.A0K
            X.C17890vO.A1B(r1, r0)
            X.9s0 r3 = new X.9s0
            r3.<init>(r13, r12, r13)
            return r3
        L_0x0146:
            X.2jz r0 = r6.A0B
            java.util.Set r11 = r0.A00()
            goto L_0x012f
        L_0x014d:
            boolean r0 = X.C22971Dz.A0O(r9)
            if (r0 == 0) goto L_0x016a
            byte[] r0 = r6.A0Q
            if (r0 == 0) goto L_0x016a
            java.util.Map r0 = r6.A0N
            if (r0 == 0) goto L_0x016a
            android.os.Parcelable$Creator r0 = X.C47712Jo.CREATOR
            boolean r0 = r9 instanceof X.C47712Jo
            if (r0 == 0) goto L_0x0196
            r0 = r9
            X.2Jo r0 = (X.C47712Jo) r0
        L_0x0164:
            X.C17960vV.A07(r0)
            r6.A04(r0, r11, r12)
        L_0x016a:
            X.1MZ r0 = r6.A07
            X.1MW r0 = r0.A08
            X.2tp r2 = r0.A0C(r9)
            X.0ve r0 = r6.A09
            r20 = r0
            X.11S r10 = r6.A04
            X.2se r1 = r6.A0C
            boolean r8 = r6.A0P
            java.util.HashSet r7 = r2.A0N(r10, r0, r1, r8)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0189
            r7.retainAll(r11)
        L_0x0189:
            java.util.TreeMap r19 = new java.util.TreeMap
            r19.<init>()
            java.lang.String r0 = "E2eMessageEncryptor/getParticipantsData"
            X.1Ez r5 = new X.1Ez
            r5.<init>((java.lang.String) r0)
            goto L_0x0198
        L_0x0196:
            r0 = 0
            goto L_0x0164
        L_0x0198:
            r5.A04()     // Catch:{ all -> 0x02c3 }
            X.190 r2 = r6.A03     // Catch:{ all -> 0x02c3 }
            int r0 = r7.size()     // Catch:{ all -> 0x02c3 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x02c3 }
            r1.<init>(r0)     // Catch:{ all -> 0x02c3 }
            X.C22971Dz.A0F(r2, r7, r1)     // Catch:{ all -> 0x02c3 }
            X.1U5 r0 = r6.A08     // Catch:{ all -> 0x02c3 }
            java.util.HashMap r4 = r0.A09(r1, r8)     // Catch:{ all -> 0x02c3 }
            java.util.Iterator r18 = r11.iterator()     // Catch:{ all -> 0x02c3 }
            r14 = r13
            r3 = r13
            r17 = r13
            r2 = r13
        L_0x01b8:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x02c3 }
            if (r0 == 0) goto L_0x0249
            com.whatsapp.jid.DeviceJid r1 = X.C17880vN.A0R(r18)     // Catch:{ all -> 0x02c3 }
            boolean r15 = r7.contains(r1)     // Catch:{ all -> 0x02c3 }
            boolean r0 = X.C22971Dz.A0O(r9)     // Catch:{ all -> 0x02c3 }
            if (r0 == 0) goto L_0x01d4
            boolean r0 = r10.A0P(r1)     // Catch:{ all -> 0x02c3 }
            r16 = 1
            if (r0 != 0) goto L_0x01d6
        L_0x01d4:
            r16 = 0
        L_0x01d6:
            if (r15 == 0) goto L_0x0228
            if (r14 != 0) goto L_0x0202
            if (r8 == 0) goto L_0x01e1
            X.1yJ r0 = r10.A08()     // Catch:{ all -> 0x02c3 }
            goto L_0x01e6
        L_0x01e1:
            r10.A0I()     // Catch:{ all -> 0x02c3 }
            X.1E3 r0 = r10.A02     // Catch:{ all -> 0x02c3 }
        L_0x01e6:
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x02c3 }
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0     // Catch:{ all -> 0x02c3 }
            X.1P1 r14 = r6.A05     // Catch:{ all -> 0x02c3 }
            X.2nE r0 = X.C63962tz.A02(r0)     // Catch:{ all -> 0x02c3 }
            X.2nE r14 = r14.A01(r0)     // Catch:{ all -> 0x02c3 }
            java.lang.String r0 = r6.A0M     // Catch:{ all -> 0x02c3 }
            X.2nC r15 = new X.2nC     // Catch:{ all -> 0x02c3 }
            r15.<init>(r14, r0)     // Catch:{ all -> 0x02c3 }
            X.1P3 r0 = r6.A06     // Catch:{ all -> 0x02c3 }
            X.2a6 r14 = r0.A0E(r15)     // Catch:{ all -> 0x02c3 }
        L_0x0202:
            if (r16 == 0) goto L_0x0219
            if (r3 != 0) goto L_0x020a
            java.lang.String r3 = r6.A02(r11)     // Catch:{ all -> 0x02c3 }
        L_0x020a:
            if (r2 != 0) goto L_0x023c
            com.whatsapp.jid.UserJid r0 = r1.userJid     // Catch:{ all -> 0x02c3 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x02c3 }
            X.9ge r0 = (X.C187959ge) r0     // Catch:{ all -> 0x02c3 }
            X.8cr r2 = r6.A05(r14, r0, r3)     // Catch:{ all -> 0x02c3 }
            goto L_0x023c
        L_0x0219:
            com.whatsapp.jid.UserJid r0 = r1.userJid     // Catch:{ all -> 0x02c3 }
            java.lang.Object r0 = r4.get(r0)     // Catch:{ all -> 0x02c3 }
            X.9ge r0 = (X.C187959ge) r0     // Catch:{ all -> 0x02c3 }
            X.8cr r0 = r6.A05(r14, r0, r13)     // Catch:{ all -> 0x02c3 }
            r15 = r2
            r2 = r0
            goto L_0x023d
        L_0x0228:
            if (r16 == 0) goto L_0x0245
            if (r3 != 0) goto L_0x0230
            java.lang.String r3 = r6.A02(r11)     // Catch:{ all -> 0x02c3 }
        L_0x0230:
            if (r17 != 0) goto L_0x0238
            r0 = r20
            X.8cr r17 = X.A8R.A01(r0, r13, r13, r3)     // Catch:{ all -> 0x02c3 }
        L_0x0238:
            r15 = r2
            r2 = r17
            goto L_0x023d
        L_0x023c:
            r15 = r2
        L_0x023d:
            if (r2 == 0) goto L_0x0246
            r0 = r19
            r0.put(r1, r2)     // Catch:{ all -> 0x02c3 }
            goto L_0x0246
        L_0x0245:
            r15 = r2
        L_0x0246:
            r2 = r15
            goto L_0x01b8
        L_0x0249:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02c3 }
            java.lang.String r0 = "e2e messages created: "
            r1.append(r0)     // Catch:{ all -> 0x02c3 }
            int r0 = r19.size()     // Catch:{ all -> 0x02c3 }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x02c3 }
            r5.A03(r0)     // Catch:{ all -> 0x02c3 }
            boolean r0 = r19.isEmpty()     // Catch:{ all -> 0x02c3 }
            if (r0 != 0) goto L_0x026a
            r1 = 2
            r0 = r19
            java.util.TreeMap r13 = r6.A03(r0, r1)     // Catch:{ all -> 0x02c3 }
        L_0x026a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x02c3 }
            java.lang.String r0 = "messages encrypted: "
            r1.append(r0)     // Catch:{ all -> 0x02c3 }
            if (r13 == 0) goto L_0x0276
            goto L_0x0278
        L_0x0276:
            r0 = 0
            goto L_0x027c
        L_0x0278:
            int r0 = r13.size()     // Catch:{ all -> 0x02c3 }
        L_0x027c:
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x02c3 }
            r5.A03(r0)     // Catch:{ all -> 0x02c3 }
            r5.A02()
            boolean r0 = X.C22971Dz.A0N(r9)
            if (r0 == 0) goto L_0x02bc
            java.util.TreeSet r3 = new java.util.TreeSet
            r3.<init>()
            java.util.Iterator r2 = r11.iterator()
        L_0x0295:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02b7
            com.whatsapp.jid.DeviceJid r1 = X.C17880vN.A0R(r2)
            if (r13 == 0) goto L_0x02a7
            boolean r0 = r13.containsKey(r1)
            if (r0 != 0) goto L_0x0295
        L_0x02a7:
            com.whatsapp.jid.UserJid r1 = r1.userJid
            boolean r0 = r10.A0O(r1)
            if (r0 != 0) goto L_0x0295
            com.whatsapp.jid.DeviceJid r0 = r1.getPrimaryDevice()
            r3.add(r0)
            goto L_0x0295
        L_0x02b7:
            java.util.ArrayList r0 = X.C17880vN.A10(r3)
            goto L_0x02bd
        L_0x02bc:
            r0 = 0
        L_0x02bd:
            X.9s0 r3 = new X.9s0
            r3.<init>(r0, r12, r13)
            return r3
        L_0x02c3:
            r0 = move-exception
            r5.A02()
            throw r0
        L_0x02c8:
            java.util.HashMap r1 = X.C17880vN.A11()
            r0 = 0
            X.9s0 r3 = new X.9s0
            r3.<init>(r0, r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass343.BWN(boolean, boolean, boolean):X.9s0");
    }

    public AnonymousClass343(C19880zA r3, C19880zA r4, C19880zA r5, C19880zA r6, C19880zA r7, AnonymousClass190 r8, AnonymousClass11S r9, AnonymousClass1P1 r10, AnonymousClass1P3 r11, AnonymousClass1MZ r12, AnonymousClass1U5 r13, C52122aP r14, C18030ve r15, A8R a8r, C58002jz r17, C63182se r18, C49352Qd r19, C49352Qd r20, C58302kT r21, AnonymousClass1PT r22, C166418cr r23, AnonymousClass206 r24, AnonymousClass205 r25, String str, String str2, String str3, Map map, byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.A09 = r15;
        this.A03 = r8;
        this.A04 = r9;
        this.A0G = r22;
        this.A0A = a8r;
        this.A06 = r11;
        this.A08 = r13;
        this.A0V = r14;
        this.A07 = r12;
        this.A0R = r3;
        this.A0C = r18;
        this.A02 = r4;
        this.A05 = r10;
        this.A0S = r5;
        this.A0B = r17;
        this.A0U = r6;
        this.A0T = r7;
        String str4 = str;
        this.A0W = Jid.Companion.A02(str4);
        this.A0M = str4;
        this.A0L = str2;
        this.A0J = r25;
        this.A0I = r24;
        this.A0H = r23;
        this.A0Q = bArr;
        this.A0N = map;
        this.A0K = str3;
        this.A0F = r21;
        this.A01 = i;
        this.A00 = i2;
        this.A0P = z;
        this.A0O = z2;
        this.A0E = r19;
        this.A0D = r20;
    }

    private String A02(Collection collection) {
        HashSet A12 = C17880vN.A12();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            UserJid userJid = C17880vN.A0R(it).userJid;
            if (!this.A04.A0O(userJid)) {
                A12.add(userJid.getPrimaryDevice());
            }
        }
        return C63442t5.A03(A12);
    }

    private void A04(C47712Jo r22, Collection collection, Map map) {
        AnonymousClass11S r7;
        Jid A012;
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                if (C22971Dz.A0T(C17880vN.A0S(it))) {
                    r7 = this.A04;
                    A012 = r7.A0A();
                    break;
                }
            } else {
                r7 = this.A04;
                A012 = AnonymousClass11S.A01(r7);
                break;
            }
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            DeviceJid A0R2 = C17880vN.A0R(it2);
            Map map2 = map;
            if (!map2.containsKey(A0R2) && !r7.A0P(A0R2)) {
                UserJid userJid = A0R2.userJid;
                C29721cl r1 = (C29721cl) this.A0N.get(userJid.getPrimaryDevice().getRawString());
                if (r1 != null) {
                    byte[] bArr = this.A0Q;
                    C18070vi.A0d(bArr, 1);
                    C47712Jo r10 = r22;
                    C18070vi.A0f(r10, 3, A012);
                    int i = r1.expiration;
                    AnonymousClass9ZB r0 = new AnonymousClass9ZB((NativeHolder) JniBridge.jvidispatchOII((long) i, C17880vN.A04(r1.ephemeralSettingTimestamp)));
                    String rawString = userJid.getRawString();
                    String rawString2 = A012.getRawString();
                    NativeHolder nativeHolder = r0.A00;
                    Object jvidispatchOOOOOOO = JniBridge.jvidispatchOOOOOOO(0, rawString, rawString2, (Object) null, nativeHolder, bArr, r10.getRawString());
                    if (jvidispatchOOOOOOO != null) {
                        map2.put(A0R2, jvidispatchOOOOOOO);
                    } else {
                        Log.e("E2eMessageEncryptor/buildBroadcastListEphemeralSettings/failed to encrypt broadcast setting");
                        throw new AnonymousClass2RT(A0R2, this.A0F.A00(A0R2));
                    }
                } else {
                    Log.e("E2eMessageEncryptor/buildBroadcastListEphemeralSettings/missing broadcast setting");
                    throw new AnonymousClass2RT(A0R2, 4);
                }
            }
        }
    }

    public Map BV7(Collection collection) {
        HashMap A11 = C17880vN.A11();
        if (!collection.isEmpty()) {
            collection.retainAll(this.A0B.A00());
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                DeviceJid A0R2 = C17880vN.A0R(it);
                AnonymousClass205 r12 = this.A0J;
                UserJid A002 = C22941Dw.A00(r12.A00);
                A8R a8r = this.A0A;
                C166418cr r10 = this.A0H;
                AnonymousClass206 r11 = this.A0I;
                String str = this.A0L;
                if (TextUtils.isEmpty(str)) {
                    str = this.A0M;
                }
                C166418cr A082 = a8r.A08(A0R2, r10, r11, r12, str);
                if (A002 == null) {
                    A002 = A0R2.userJid;
                }
                C187959ge A062 = a8r.A02.A06(A002);
                if (A062 != null) {
                    A082 = A01(A082, A062);
                }
                int A003 = C18020vd.A00(C18040vf.A02, this.A09, 1723);
                if (A003 != -1) {
                    A082 = A8R.A02(A082, A003);
                }
                if (!z) {
                    z = true;
                }
                C198079xk A004 = A00(A0R2, A082, r11, 0);
                if (A004 != null && A004.A01 == 0) {
                    A11.put(A0R2, C198079xk.A00(A004));
                }
            }
        }
        return A11;
    }
}
