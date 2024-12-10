package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: X.AQq  reason: case insensitive filesystem */
public final /* synthetic */ class C20580AQq implements C72123Ks {
    public final /* synthetic */ C60002nE A00;
    public final /* synthetic */ DeviceJid A01;
    public final /* synthetic */ C36141nP A02;

    public final void BcN(byte[] bArr) {
        StringBuilder A10;
        String str;
        char c;
        AnonymousClass1P5 th;
        Throwable th2;
        C36141nP r6 = this.A02;
        DeviceJid deviceJid = this.A01;
        C60002nE r4 = this.A00;
        byte[] A022 = A3S.A02((AnonymousClass2HL) null, (C173578vJ) null, bArr);
        if (A022 == null) {
            A10 = AnonymousClass000.A10();
            str = "LocationNotificationHandleraxolotl derived invalid plaintext; jid=";
        } else {
            try {
                C166418cr A012 = C166418cr.A01(A022);
                ArrayList A013 = C20102A7g.A01(A012);
                int A002 = C20102A7g.A00(A012);
                if (!A013.isEmpty() || A002 != 0) {
                    A10 = AnonymousClass000.A10();
                    A10.append("LocationNotificationHandler/axolotl received an invalid protobuf; jid=");
                    A10.append(deviceJid);
                    A10.append("; messageTypes=");
                    A10.append(A013);
                    AnonymousClass8BT.A1M(A10);
                } else if ((A012.bitField0_ & 16384) != 0) {
                    C17900vP.A0Y(deviceJid, "LocationNotificationHandler/axolotl received sender key distribution message; jid=", AnonymousClass000.A10());
                    AnonymousClass8ZH r2 = A012.fastRatchetKeySenderKeyDistributionMessage_;
                    if (r2 == null) {
                        r2 = AnonymousClass8ZH.DEFAULT_INSTANCE;
                    }
                    int i = r2.bitField0_;
                    if ((i & 1) == 0 || (i & 2) == 0) {
                        A10 = AnonymousClass000.A10();
                        str = "LocationNotificationHandler/received incomplete sender key distribution message; jid=";
                    } else {
                        C59982nC r5 = new C59982nC(r4, C173408v1.A00.getRawString());
                        AnonymousClass1P3 r1 = r6.A03;
                        byte[] A06 = r2.axolotlSenderKeyDistributionMessage_.A06();
                        C71363Ez A014 = C25571Os.A01(r1.A0H, r5);
                        A014.lock();
                        try {
                            AnonymousClass1PJ r7 = r1.A01;
                            int length = A06.length;
                            if (length != 0) {
                                try {
                                    byte[][] A015 = C20011A3b.A01(A06, 1, length - 1);
                                    byte b = A015[0][0];
                                    byte[] bArr2 = A015[1];
                                    int i2 = (b & 255) >> 4;
                                    if (i2 < 3) {
                                        th2 = new AnonymousClass1P4(AnonymousClass001.A1I("Legacy message: ", AnonymousClass000.A10(), i2));
                                    } else if (i2 <= 3) {
                                        C165358b0 r22 = (C165358b0) C23577Bm6.A07(C165358b0.DEFAULT_INSTANCE, bArr2);
                                        int i3 = r22.bitField0_;
                                        if ((i3 & 1) == 0 || (i3 & 2) == 0 || r22.chainKeys_.size() <= 0 || (r22.bitField0_ & 4) == 0) {
                                            th2 = new AnonymousClass1P5("Incomplete message.");
                                        } else {
                                            int i4 = r22.id_;
                                            int i5 = r22.iteration_;
                                            C21344AiX A003 = C20065A5o.A00(r22.signingKey_);
                                            EE9 ee9 = r22.chainKeys_;
                                            int size = ee9.size();
                                            byte[][] bArr3 = new byte[size][];
                                            for (int i6 = 0; i6 < size; i6++) {
                                                bArr3[i6] = ((DSQ) ee9.get(i6)).A06();
                                            }
                                            AnonymousClass1P2 r8 = r7.A00.A01;
                                            C58462kj A023 = C62812s2.A02(r5);
                                            synchronized (C182219Tn.A00) {
                                                try {
                                                    C61912qU A016 = r8.A01(A023);
                                                    LinkedList linkedList = A016.A00;
                                                    linkedList.addFirst(new C199019zI(A003, AnonymousClass3K4.A00, bArr3, i4, i5));
                                                    if (linkedList.size() > 5) {
                                                        linkedList.removeLast();
                                                    }
                                                    r8.A03(A023, A016);
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                            }
                                            c = 0;
                                            A014.close();
                                            if (c == 64531) {
                                                A10 = AnonymousClass000.A10();
                                                str = "LocationNotificationHandler/received invalid sender key distribution message; jid=";
                                            } else if (c == 64529) {
                                                A10 = AnonymousClass000.A10();
                                                str = "LocationNotificationHandler/received legacy sender key distribution message; jid=";
                                            } else {
                                                return;
                                            }
                                        }
                                    } else {
                                        th2 = new AnonymousClass1P5(AnonymousClass001.A1I("Unknown version: ", AnonymousClass000.A10(), i2));
                                    }
                                    throw th2;
                                } catch (AnonymousClass1P8 | AnonymousClass1PN e) {
                                    th = new AnonymousClass1P5(e);
                                }
                            } else {
                                th = new AnonymousClass1P5("Data is empty");
                                throw th;
                            }
                        } catch (AnonymousClass1P4 e2) {
                            Log.w("SignalCoordinatorDefault/processSenderKeyFastRatchet", e2);
                            c = 64529;
                        } catch (AnonymousClass1P5 e3) {
                            Log.w("SignalCoordinatorDefault/processSenderKeyFastRatchet", e3);
                            c = 64531;
                        } catch (Exception e4) {
                            Log.w("SignalCoordinatorDefault/processSenderKeyFastRatchet", e4);
                            c = 64536;
                        } catch (Throwable th4) {
                            try {
                                A014.close();
                                throw th4;
                            } catch (Throwable th5) {
                                AnonymousClass0DT.A00(th4, th5);
                                throw th4;
                            }
                        }
                    }
                } else {
                    return;
                }
            } catch (AnonymousClass1PN e5) {
                Log.w(AnonymousClass001.A1E(deviceJid, "axolotl derived plaintext does not represent valid protocol buffer; jid=", AnonymousClass000.A10()), e5);
                return;
            }
        }
        A10.append(str);
        A10.append(deviceJid);
        AnonymousClass8BT.A1M(A10);
    }

    public /* synthetic */ C20580AQq(C60002nE r1, DeviceJid deviceJid, C36141nP r3) {
        this.A02 = r3;
        this.A01 = deviceJid;
        this.A00 = r1;
    }
}
