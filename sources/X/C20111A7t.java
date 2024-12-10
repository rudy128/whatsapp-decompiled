package X;

import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: X.A7t  reason: case insensitive filesystem */
public class C20111A7t {
    public final BCN A00 = new C20450ALn(this);
    public final C25591Ou A01;
    public final AnonymousClass9j1 A02;
    public final C58662l3 A03;
    public final C22440B7w A04 = new AQS(this);
    public final C48022Kw A05;
    public final AnonymousClass1P3 A06;
    public final C25581Ot A07;
    public final C30781eV A08;
    public final C107295Zd A09 = new ARN(this);
    public final AnonymousClass2LS A0A;
    public final AnonymousClass1U5 A0B;
    public final C18030ve A0C;
    public final AnonymousClass18K A0D;
    public final AnonymousClass120 A0E;
    public final C25571Os A0F;
    public final C51952a7 A0G;
    public final C34711kx A0H;
    public volatile Future A0I;

    public static Pair A00(C20111A7t a7t) {
        C71363Ez A072 = a7t.A0F.A07();
        try {
            AnonymousClass1P3 r4 = a7t.A06;
            Pair A0N = C108945cZ.A0N(r4.A0f(), new C54492eE[]{r4.A0J(), r4.A0K()});
            if (A072 != null) {
                A072.close();
            }
            return A0N;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static A4S A01(C20111A7t a7t, C60002nE r5, DeviceJid deviceJid, C194059r6 r7, byte[] bArr, boolean z) {
        int i;
        if (a7t.A0B.A0D(deviceJid, r7, bArr, 2)) {
            int i2 = r7.A00;
            if (i2 == 0) {
                C17960vV.A0F(!z, "decryptStatelessly not supported for MSG type");
                return a7t.A06.A08((C72123Ks) null, r5, r7.A01);
            } else if (i2 == 1) {
                AnonymousClass1P3 r0 = a7t.A06;
                byte[] bArr2 = r7.A01;
                if (!z) {
                    return r0.A09((C72123Ks) null, r5, bArr2);
                }
                try {
                    return AnonymousClass1PJ.A00((C72123Ks) null, r5, r0.A01, new C21573AmN(bArr2), true);
                } catch (AnonymousClass1P5 e) {
                    e = e;
                    i = -1005;
                    return A4S.A00(e, (byte[]) null, i);
                } catch (AnonymousClass1PA e2) {
                    e = e2;
                    i = -1006;
                    return A4S.A00(e, (byte[]) null, i);
                } catch (Exception e3) {
                    e = e3;
                    Log.w("SignalCoordinatorDefault/decryptForIndividualPreKey", e);
                    i = -1000;
                    return A4S.A00(e, (byte[]) null, i);
                }
            } else {
                throw AnonymousClass001.A13("invalid ciphertext type; ciphertextType=", AnonymousClass000.A10(), i2);
            }
        } else {
            Log.e("voip/encryption/decryptCallPayload/invalid device identity");
            return new A4S((byte[]) null, -1010);
        }
    }

    public static DeviceJid A02(C20111A7t a7t, DeviceJid deviceJid, String str, int i, int i2) {
        AnonymousClass205 A012 = AnonymousClass205.A01(deviceJid.userJid, str, true);
        C60002nE A022 = C63962tz.A02(deviceJid);
        C25571Os r0 = a7t.A0F;
        C71363Ez A002 = C25571Os.A00(A022, r0);
        C25571Os.A03(A002, r0);
        try {
            AnonymousClass1P3 r6 = a7t.A06;
            C199249zg A0F2 = r6.A0F(A022);
            AnonymousClass9XJ r8 = A0F2.A01;
            byte[] A062 = r8.A00.aliceBaseKey_.A06();
            if (A0F2.A00 || r8.A00.remoteRegistrationId_ != i2) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("voip/receive_message/onPeerE2EDecryptionFailed registration id is not equal. stored= ");
                A10.append(r8.A00.remoteRegistrationId_);
                A10.append(", incoming=");
                A10.append(i2);
                C17900vP.A0Y(A012, ". Fetching new prekey for: ", A10);
                a7t.A03.A01(deviceJid);
            } else {
                if (i > 2) {
                    if (r6.A0d(A022, A012)) {
                        C17900vP.A0Y(A012, "voip/receive_message/onPeerE2EDecryptionFailed reg id is equal and has same basekey. Fetching new prekey for: ", AnonymousClass000.A10());
                        a7t.A03.A01(deviceJid);
                    }
                } else if (i == 2) {
                    C17900vP.A0Y(A012, "voip/receive_message/onPeerE2EDecryptionFailed recording base key. ", AnonymousClass000.A10());
                    r6.A0V(A022, A012, A062);
                }
                if (A002 != null) {
                    A002.close();
                }
                return deviceJid;
            }
            if (A002 != null) {
                A002.close();
            }
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static C194059r6 A03(C20111A7t a7t, DeviceJid deviceJid, C166418cr r4) {
        AnonymousClass1P3 r2 = a7t.A06;
        C17960vV.A0F(r2.A0b(C63962tz.A02(deviceJid)), "no session with deviceJid");
        C198079xk A0B2 = r2.A0B(C63962tz.A02(deviceJid), r4.A0M());
        return new C194059r6(A0B2.A02, AnonymousClass9QD.A00(A0B2.A00));
    }

    public static void A04(C20111A7t a7t, String str, byte[] bArr, int i) {
        int A062 = a7t.A06.A06();
        if (bArr != null) {
            int A012 = A8G.A01(bArr, 0);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/encryption/onE2EDecryptionFailed.  message.id=");
            A10.append(str);
            A10.append("; serverRegistrationId=");
            A10.append(A012);
            C17900vP.A0j("; localRegistrationId=", A10, A062);
            if (A012 != A062) {
                StringBuilder A102 = AnonymousClass000.A10();
                C17890vO.A10("voip/encryption/onE2EDecryptionFailed registration id received did not match local; message.id=", str, "; serverRegistrationId=", A102);
                A102.append(A012);
                C17900vP.A0j("; localRegistrationId=", A102, A062);
                C17900vP.A0j(" sending local pre keys to server; localRegistrationId=", AnonymousClass8BW.A0n(i, "voip/encryption/onE2EDecryptionFailed reject at retry: "), A062);
                a7t.A0E.A03();
                return;
            }
        }
        if (i > 1) {
            C17900vP.A0j(" sending get prekey digest; localRegistrationId=", AnonymousClass8BW.A0n(i, "voip/encryption/onE2EDecryptionFailed reject at retry: "), A062);
            a7t.A0E.A06();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v66, resolved type: X.Abw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v71, resolved type: X.Abw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v113, resolved type: X.8oR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v114, resolved type: X.8oR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v2, resolved type: X.8oR} */
    /* JADX WARNING: type inference failed for: r0v24, types: [X.Abw] */
    /* JADX WARNING: type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r0v65 */
    /* JADX WARNING: type inference failed for: r0v105 */
    /* JADX WARNING: type inference failed for: r0v112 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0302  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x02e2 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C198559yX A05(X.AnonymousClass97K r45, boolean r46) {
        /*
            r44 = this;
            r1 = r45
            com.whatsapp.protocol.VoipStanzaChildNode r0 = r1.A01
            r21 = r0
            com.whatsapp.protocol.VoipStanzaChildNode[] r5 = r21.getChildrenCopy()
            if (r5 != 0) goto L_0x001d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/encryption/decrypt-stanza no children, message.id="
        L_0x0012:
            r2.append(r0)
            java.lang.String r0 = r1.A03
            X.C17890vO.A1A(r2, r0)
            X.9yX r0 = X.C198559yX.A06
            return r0
        L_0x001d:
            int r0 = r5.length
            r43 = r0
            r3 = 0
            r4 = 0
            r8 = r3
            r39 = r3
            r6 = 0
        L_0x0026:
            r0 = r43
            if (r6 >= r0) goto L_0x0058
            r7 = r5[r6]
            java.lang.String r2 = "registration"
            java.lang.String r0 = r7.tag
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0047
            byte[] r8 = r7.getDataCopy()
            if (r8 == 0) goto L_0x0040
            int r2 = r8.length
            r0 = 4
            if (r2 == r0) goto L_0x0055
        L_0x0040:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid registration, message.id="
            goto L_0x0012
        L_0x0047:
            java.lang.String r2 = "device-identity"
            java.lang.String r0 = r7.tag
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0055
            byte[] r39 = r7.getDataCopy()
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x0026
        L_0x0058:
            com.whatsapp.protocol.VoipStanzaChildNode$Builder r20 = X.C40811vJ.A02(r21)
            r6 = r3
            r7 = r3
            r9 = 0
            r19 = 0
        L_0x0061:
            r0 = r43
            if (r4 >= r0) goto L_0x0350
            r2 = r5[r4]
            java.lang.String r0 = r2.tag
            java.lang.String r15 = "enc"
            boolean r0 = r15.equals(r0)
            if (r0 == 0) goto L_0x0338
            if (r9 == 0) goto L_0x0084
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/encryption/decrypt-stanza, duplicate <enc> message.id="
            r2.append(r0)
            java.lang.String r0 = r1.A03
            X.C17890vO.A1B(r2, r0)
        L_0x0081:
            int r4 = r4 + 1
            goto L_0x0061
        L_0x0084:
            java.lang.Byte r0 = X.C40811vJ.A07(r2)
            if (r0 != 0) goto L_0x0091
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/encryption/decrypt-stanza invalid retry count, message.id="
            goto L_0x0012
        L_0x0091:
            byte r19 = r0.byteValue()
            X.1ca r0 = r2.toProtocolTreeNode()     // Catch:{ 1UI -> 0x033f }
            X.9r6 r18 = X.AnonymousClass9RW.A00(r0)     // Catch:{ 1UI -> 0x033f }
            com.whatsapp.jid.Jid r2 = r1.A00
            boolean r0 = r2 instanceof com.whatsapp.jid.DeviceJid
            r6 = 0
            if (r0 == 0) goto L_0x00a7
            r6 = r2
            com.whatsapp.jid.DeviceJid r6 = (com.whatsapp.jid.DeviceJid) r6
        L_0x00a7:
            X.C17960vV.A07(r6)
            com.whatsapp.jid.DeviceJid r9 = r1.A03
            java.lang.String r0 = r1.A03
            r42 = r0
            java.lang.String r0 = r1.A02
            r41 = r0
            X.2HL r3 = new X.2HL
            r3.<init>()
            r0 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r0)
            r3.A00 = r12
            java.lang.Integer r0 = X.AnonymousClass8BS.A0U()
            r3.A0E = r0
            java.lang.Long r0 = X.C17880vN.A0n(r19)
            r3.A0I = r0
            r2 = r44
            X.2nE r36 = X.C63962tz.A02(r6)     // Catch:{ InterruptedException -> 0x0273 }
            X.1P3 r0 = r2.A06     // Catch:{ InterruptedException -> 0x0273 }
            boolean r0 = r0.A0Y()     // Catch:{ InterruptedException -> 0x0273 }
            r40 = r46
            if (r0 != 0) goto L_0x010f
            boolean r0 = r2.A07()     // Catch:{ InterruptedException -> 0x0273 }
            if (r0 != 0) goto L_0x010f
            X.1Ot r10 = r2.A07     // Catch:{ ExecutionException -> 0x0100 }
            X.Al7 r0 = new X.Al7     // Catch:{ ExecutionException -> 0x0100 }
            r34 = r0
            r35 = r2
            r37 = r6
            r38 = r18
            r34.<init>(r35, r36, r37, r38, r39, r40)     // Catch:{ ExecutionException -> 0x0100 }
            java.util.concurrent.Future r0 = r10.A01(r0)     // Catch:{ ExecutionException -> 0x0100 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0100 }
            X.A4S r0 = (X.A4S) r0     // Catch:{ ExecutionException -> 0x0100 }
            goto L_0x0119
        L_0x0100:
            r0 = move-exception
            java.lang.Throwable r6 = r0.getCause()     // Catch:{ InterruptedException -> 0x0273 }
            boolean r0 = r6 instanceof java.lang.Error     // Catch:{ InterruptedException -> 0x0273 }
            if (r0 == 0) goto L_0x010a
            throw r6     // Catch:{ InterruptedException -> 0x0273 }
        L_0x010a:
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r6)     // Catch:{ InterruptedException -> 0x0273 }
            throw r0     // Catch:{ InterruptedException -> 0x0273 }
        L_0x010f:
            r35 = r2
            r37 = r6
            r38 = r18
            X.A4S r0 = A01(r35, r36, r37, r38, r39, r40)     // Catch:{ InterruptedException -> 0x0273 }
        L_0x0119:
            int r6 = r0.A00     // Catch:{ InterruptedException -> 0x0273 }
            if (r6 != 0) goto L_0x0205
            byte[] r0 = r0.A01     // Catch:{ 1PN -> 0x01f4 }
            X.8cr r0 = X.C166418cr.A01(r0)     // Catch:{ 1PN -> 0x01f4 }
            X.8bY r13 = r0.call_     // Catch:{ 1PN -> 0x01f4 }
            if (r13 != 0) goto L_0x0129
            X.8bY r13 = X.C165658bY.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x01f4 }
        L_0x0129:
            X.DSQ r0 = r13.callKey_     // Catch:{ 1PN -> 0x01f4 }
            byte[] r6 = r0.A06()     // Catch:{ 1PN -> 0x01f4 }
            X.DSQ r0 = r13.conversionData_     // Catch:{ 1PN -> 0x01f1, InterruptedException -> 0x01ec }
            byte[] r17 = r0.A06()     // Catch:{ 1PN -> 0x01f1, InterruptedException -> 0x01ec }
            java.lang.String r11 = r13.conversionSource_     // Catch:{ 1PN -> 0x01e9, InterruptedException -> 0x01e4 }
            if (r9 == 0) goto L_0x013a
            goto L_0x013c
        L_0x013a:
            r10 = 0
            goto L_0x013e
        L_0x013c:
            com.whatsapp.jid.UserJid r10 = r9.userJid     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
        L_0x013e:
            X.0ve r14 = r2.A0C     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r9 = 11035(0x2b1b, float:1.5463E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            boolean r16 = X.C18020vd.A05(r0, r14, r9)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            if (r10 == 0) goto L_0x01cc
            r9 = 0
            if (r16 == 0) goto L_0x014e
            goto L_0x0150
        L_0x014e:
            r14 = r9
            goto L_0x0158
        L_0x0150:
            int r0 = r13.bitField0_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r0 = r0 & 16
            if (r0 == 0) goto L_0x014e
            java.lang.String r14 = r13.ctwaSignals_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
        L_0x0158:
            int r0 = r13.bitField0_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0167
            X.DSQ r0 = r13.conversionData_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            if (r0 == 0) goto L_0x0167
            java.lang.String r27 = r0.A04()     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            goto L_0x0169
        L_0x0167:
            r27 = r9
        L_0x0169:
            if (r16 == 0) goto L_0x0181
            if (r14 == 0) goto L_0x0181
            boolean r0 = X.AnonymousClass1YF.A0T(r14)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            if (r0 != 0) goto L_0x0181
            int r0 = r13.bitField0_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0181
            X.DSQ r0 = r13.ctwaPayload_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            if (r0 == 0) goto L_0x0181
            java.lang.String r27 = r0.A04()     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
        L_0x0181:
            int r0 = r13.bitField0_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r0 = r0 & 2
            if (r0 == 0) goto L_0x0189
            java.lang.String r9 = r13.conversionSource_     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
        L_0x0189:
            if (r27 == 0) goto L_0x01c5
            boolean r0 = X.AnonymousClass1YF.A0T(r27)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            if (r0 != 0) goto L_0x01c5
            if (r9 == 0) goto L_0x01c5
            boolean r0 = X.AnonymousClass1YF.A0T(r9)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            if (r0 != 0) goto L_0x01c5
            X.C17960vV.A07(r27)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            X.C17960vV.A07(r9)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            X.0wS r33 = X.C18460wS.A00     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            long r35 = java.lang.System.currentTimeMillis()     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r25 = 0
            java.lang.String r29 = ""
            r34 = -1
            r37 = 0
            X.4DN r23 = X.AnonymousClass4DN.DEFAULT     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            X.9IQ r24 = X.AnonymousClass9IQ.EXTERNAL     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            X.8oR r0 = new X.8oR     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r31 = r25
            r22 = r0
            r26 = r10
            r28 = r9
            r30 = r25
            r32 = r14
            r38 = r37
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r38)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            goto L_0x01d2
        L_0x01c5:
            r9 = 0
            X.2DY r0 = new X.2DY     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r0.<init>(r9)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            goto L_0x01d2
        L_0x01cc:
            r9 = 0
            X.2DY r0 = new X.2DY     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
            r0.<init>(r9)     // Catch:{ 1PN -> 0x01e1, InterruptedException -> 0x027c }
        L_0x01d2:
            r9 = 1
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)     // Catch:{ 1PN -> 0x01df }
            r3.A00 = r9     // Catch:{ 1PN -> 0x01df }
            r13 = r17
            r16 = 0
            goto L_0x0289
        L_0x01df:
            r13 = move-exception
            goto L_0x01fa
        L_0x01e1:
            r13 = move-exception
            r0 = 0
            goto L_0x01fa
        L_0x01e4:
            r10 = move-exception
            r0 = 0
            r13 = 0
            goto L_0x027f
        L_0x01e9:
            r13 = move-exception
            r0 = 0
            goto L_0x01f9
        L_0x01ec:
            r10 = move-exception
            r0 = 0
            r13 = 0
            goto L_0x0270
        L_0x01f1:
            r13 = move-exception
            r0 = 0
            goto L_0x01f7
        L_0x01f4:
            r13 = move-exception
            r0 = 0
            r6 = 0
        L_0x01f7:
            r17 = 0
        L_0x01f9:
            r11 = 0
        L_0x01fa:
            java.lang.String r10 = "plaintext does not represent a valid protocol buffer"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ InterruptedException -> 0x0202 }
            r9.<init>(r10, r13)     // Catch:{ InterruptedException -> 0x0202 }
            throw r9     // Catch:{ InterruptedException -> 0x0202 }
        L_0x0202:
            r10 = move-exception
            r13 = r11
            goto L_0x027f
        L_0x0205:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x0273 }
            java.lang.String r0 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key. status="
            X.C17900vP.A0j(r0, r9, r6)     // Catch:{ InterruptedException -> 0x0273 }
            r9 = -1008(0xfffffffffffffc10, float:NaN)
            r0 = 6
            if (r6 == r9) goto L_0x0261
            r0 = -1003(0xfffffffffffffc15, float:NaN)
            if (r6 != r0) goto L_0x021e
            java.lang.Integer r0 = X.C17880vN.A0j()     // Catch:{ InterruptedException -> 0x026c }
            r3.A08 = r0     // Catch:{ InterruptedException -> 0x026c }
            goto L_0x0267
        L_0x021e:
            r0 = -1010(0xfffffffffffffc0e, float:NaN)
            r9 = 4
            if (r6 != r0) goto L_0x0233
            java.lang.String r0 = "voip/encryption/decryptCallPayload/bad identity"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x026c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x026c }
            r0 = 0
            android.util.Pair r0 = X.C108945cZ.A0N(r6, r0)     // Catch:{ InterruptedException -> 0x026c }
            goto L_0x02dc
        L_0x0233:
            r0 = -1002(0xfffffffffffffc16, float:NaN)
            if (r6 != r0) goto L_0x023e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ InterruptedException -> 0x026c }
            r3.A08 = r0     // Catch:{ InterruptedException -> 0x026c }
            goto L_0x0267
        L_0x023e:
            r0 = -1001(0xfffffffffffffc17, float:NaN)
            if (r6 != r0) goto L_0x0252
            java.lang.String r0 = "voip/encryption/decryptCallPayload/duplicated e2e keys"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x0273 }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ InterruptedException -> 0x0273 }
            r13 = 0
            android.util.Pair r0 = X.C108945cZ.A0N(r0, r13)     // Catch:{ InterruptedException -> 0x0276 }
            goto L_0x02dc
        L_0x0252:
            r13 = 0
            r0 = -1007(0xfffffffffffffc11, float:NaN)
            if (r6 != r0) goto L_0x025e
            java.lang.Integer r0 = X.C17880vN.A0h()     // Catch:{ InterruptedException -> 0x0276 }
            r3.A08 = r0     // Catch:{ InterruptedException -> 0x0276 }
            goto L_0x0268
        L_0x025e:
            r3.A08 = r7     // Catch:{ InterruptedException -> 0x0276 }
            goto L_0x0268
        L_0x0261:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ InterruptedException -> 0x026c }
            r3.A08 = r0     // Catch:{ InterruptedException -> 0x026c }
        L_0x0267:
            r13 = 0
        L_0x0268:
            r0 = r13
            r6 = r13
            r11 = r13
            goto L_0x0287
        L_0x026c:
            r10 = move-exception
            r0 = 0
            r13 = 0
            r6 = 0
        L_0x0270:
            r17 = 0
            goto L_0x027f
        L_0x0273:
            r10 = move-exception
            r13 = 0
            goto L_0x0277
        L_0x0276:
            r10 = move-exception
        L_0x0277:
            r0 = r13
            r6 = r13
            r17 = r13
            goto L_0x027f
        L_0x027c:
            r10 = move-exception
            r13 = r11
            r0 = 0
        L_0x027f:
            java.lang.String r9 = "voip/encryption/decryptCallPayload/failed_to_decrypt_e2e_key: "
            com.whatsapp.util.Log.i(r9, r10)
            r11 = r13
            r13 = r17
        L_0x0287:
            r16 = 1
        L_0x0289:
            r9 = r18
            int r14 = r9.A00
            if (r14 != 0) goto L_0x0302
            r3.A06 = r7
        L_0x0291:
            r9 = 2
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            r3.A0H = r9
            r3.A07 = r7
            java.lang.Boolean r7 = r3.A00
            boolean r7 = r7.booleanValue()
            X.18K r10 = r2.A0D
            if (r7 == 0) goto L_0x02f8
            r10.CC7(r3)
        L_0x02a8:
            if (r16 == 0) goto L_0x02f6
            X.1P3 r3 = r2.A06
            boolean r3 = r3.A0Y()
            if (r3 != 0) goto L_0x02ee
            boolean r3 = r2.A07()
            if (r3 != 0) goto L_0x02ee
            X.1Ot r7 = r2.A07
            r27 = 5
            X.3Cm r3 = new X.3Cm
            r22 = r3
            r23 = r2
            r24 = r8
            r25 = r42
            r26 = r19
            r22.<init>(r23, r24, r25, r26, r27)
            r7.A00(r3)
        L_0x02ce:
            r2 = 3
        L_0x02cf:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            X.9eW r2 = new X.9eW
            r2.<init>(r0, r11, r6, r13)
            android.util.Pair r0 = X.C108945cZ.A0N(r3, r2)
        L_0x02dc:
            int r6 = X.C108965cb.A01(r0)
            if (r6 == 0) goto L_0x0329
            r1 = 0
            X.9yX r0 = new X.9yX
            r3 = r1
            r4 = r1
            r2 = r1
            r5 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L_0x02ee:
            r7 = r42
            r3 = r19
            A04(r2, r7, r8, r3)
            goto L_0x02ce
        L_0x02f6:
            r2 = 0
            goto L_0x02cf
        L_0x02f8:
            r9 = 1
            X.0vt r7 = new X.0vt
            r7.<init>(r9, r9)
            r10.CC0(r3, r7, r9)
            goto L_0x02a8
        L_0x0302:
            r9 = 1
            if (r14 != r9) goto L_0x030c
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r3.A06 = r9
            goto L_0x0291
        L_0x030c:
            java.lang.StringBuilder r10 = X.AnonymousClass000.A10()
            java.lang.String r9 = "voip/encryption/decryptCallPayload unrecognized ciphertext type; callId="
            r10.append(r9)
            r9 = r41
            r10.append(r9)
            java.lang.String r9 = " type="
            X.C17900vP.A0k(r9, r10, r14)
            r3.A00 = r12
            java.lang.Integer r9 = X.AnonymousClass3MY.A0g()
            r3.A08 = r9
            goto L_0x0291
        L_0x0329:
            java.lang.Object r0 = r0.second
            X.9eW r0 = (X.C186639eW) r0
            byte[] r3 = r0.A02
            byte[] r6 = r0.A03
            X.Abw r7 = r0.A00
            com.whatsapp.protocol.VoipStanzaChildNode r2 = X.AnonymousClass8BX.A0Q(r15, r3)
            r9 = 1
        L_0x0338:
            r0 = r20
            r0.addChild(r2)
            goto L_0x0081
        L_0x033f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "voip/encryption/decrypt-stanza fail to parse enc node, message.id="
            r2.append(r0)
            java.lang.String r0 = r1.A03
            X.C17890vO.A1A(r2, r0)
            X.9yX r0 = X.C198559yX.A06
            return r0
        L_0x0350:
            if (r9 == 0) goto L_0x0356
            com.whatsapp.protocol.VoipStanzaChildNode r21 = r20.build()
        L_0x0356:
            r14 = 0
            X.9yX r0 = new X.9yX
            r8 = r0
            r9 = r7
            r10 = r21
            r11 = r3
            r12 = r6
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20111A7t.A05(X.97K, boolean):X.9yX");
    }

    public void A06(DeviceJid deviceJid, String str, byte[] bArr, int i) {
        DeviceJid deviceJid2;
        int i2 = i;
        if (i < 0 || i > 4) {
            C17900vP.A0j("voip/receive_message/onPeerE2EDecryptionFailed do nothing for retry count: ", AnonymousClass000.A10(), i);
            return;
        }
        if (bArr == null || bArr.length != 4) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("voip/receive_message/onPeerE2EDecryptionFailed e2e decryption failure; invalid remote remoteRegBytes id; remoteRegistrationId=");
            C17890vO.A1A(A10, Arrays.toString(bArr));
            AnonymousClass9j1 r1 = this.A02;
            Log.i("VoiceService/SessionAndIdentityCallback/notifyFatalError");
            r1.A00.A0n(30, (String) null);
            return;
        }
        int A012 = A8G.A01(bArr, 0);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("voip/receive_message/onPeerE2EDecryptionFailed peer e2e decryption failure; remoteRegistrationId=");
        A102.append(A012);
        A102.append(" retryCount: ");
        A102.append(i);
        DeviceJid deviceJid3 = deviceJid;
        C17900vP.A0Y(deviceJid, " from: ", A102);
        String str2 = str;
        if (this.A06.A0Y() || A07()) {
            deviceJid2 = A02(this, deviceJid, str, i, A012);
        } else {
            try {
                deviceJid2 = (DeviceJid) this.A07.A01(new C21496Al5(this, deviceJid3, str2, i2, A012)).get();
            } catch (InterruptedException | ExecutionException e) {
                Log.i("voip/receive_message/onPeerE2EDecryptionFailed session retry threw: ", e);
                AnonymousClass9j1 r12 = this.A02;
                Log.i("VoiceService/SessionAndIdentityCallback/notifyFatalError");
                r12.A00.A0n(30, (String) null);
                return;
            }
        }
        if (deviceJid2 != null) {
            this.A02.A00(deviceJid2);
        }
    }

    public boolean A07() {
        int i = this.A0H.A06.get();
        C18030ve r1 = this.A0C;
        C18040vf r2 = C18040vf.A02;
        if (i < C18020vd.A00(r2, r1, 6477) || !C18020vd.A05(r2, this.A06.A0H.A04, 4883)) {
            return false;
        }
        return true;
    }

    public C20111A7t(C25591Ou r2, AnonymousClass120 r3, AnonymousClass9j1 r4, C58662l3 r5, C48022Kw r6, AnonymousClass1P3 r7, C25581Ot r8, C25571Os r9, C30781eV r10, C51952a7 r11, AnonymousClass2LS r12, AnonymousClass1U5 r13, C18030ve r14, AnonymousClass18K r15, C34711kx r16) {
        this.A0C = r14;
        this.A0D = r15;
        this.A0F = r9;
        this.A07 = r8;
        this.A0E = r3;
        this.A03 = r5;
        this.A01 = r2;
        this.A06 = r7;
        this.A0B = r13;
        this.A0H = r16;
        this.A05 = r6;
        this.A0A = r12;
        this.A0G = r11;
        this.A08 = r10;
        this.A02 = r4;
    }
}
