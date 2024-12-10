package X;

import android.os.Message;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.util.Log;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.1gO  reason: invalid class name and case insensitive filesystem */
public abstract class C31951gO implements AnonymousClass1RJ {
    public final C25581Ot A00;
    public final C31931gM A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final ConcurrentHashMap A04 = new ConcurrentHashMap();
    public final int[] A05;
    public final AnonymousClass1OZ A06;

    public C31951gO(C25581Ot r2, C31931gM r3, AnonymousClass1OZ r4, AnonymousClass10I r5, AnonymousClass00H r6, int[] iArr) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r3, 4);
        this.A02 = r5;
        this.A06 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = iArr;
        this.A03 = r6;
    }

    public final boolean BcT(Message message, int i) {
        C60132nR r4;
        C18070vi.A0d(message, 1);
        int i2 = i;
        if (!C200410p.A0V(this.A05, i)) {
            StringBuilder sb = new StringBuilder();
            sb.append("BaseReceiptHandler/unexpected type=");
            sb.append(i);
            Log.e(sb.toString());
            return false;
        }
        Object obj = message.obj;
        C18070vi.A0b(obj);
        if (this instanceof C35391mA) {
            C18070vi.A0d(obj, 1);
            r4 = ((AnonymousClass3M9) obj).CNb();
            C17960vV.A07(r4);
            C18070vi.A0X(r4);
        } else if (this instanceof C35811mq) {
            C18070vi.A0d(obj, 1);
            r4 = ((C55792gN) obj).A02;
        } else if ((this instanceof C35601mV) || (this instanceof C35621mX)) {
            C18070vi.A0d(obj, 1);
            r4 = ((C56162h0) obj).A05;
        } else {
            if (!(this instanceof C31961gP)) {
                C18070vi.A0d(obj, 1);
            }
            r4 = (C60132nR) obj;
        }
        new C21365Aiu(this, r4, obj, i2, 41).run();
        return true;
    }

    public void A02(C60132nR r26, Object obj) {
        C200710s r2;
        Runnable r1;
        StringBuilder sb;
        String str;
        String str2;
        Object obj2 = obj;
        C60132nR r4 = r26;
        if (this instanceof C35391mA) {
            C35391mA r3 = (C35391mA) this;
            C18070vi.A0d(obj2, 1);
            C18070vi.A0d(r4, 2);
            try {
                ((C62352rG) r3.A02.get()).A02((AnonymousClass3M9) obj2, 5000);
                Set set = r3.A03;
                synchronized (set) {
                    set.remove(r4);
                }
            } catch (Throwable th) {
                Set set2 = r3.A03;
                synchronized (set2) {
                    set2.remove(r4);
                    throw th;
                }
            }
        } else if (this instanceof C35811mq) {
            C18070vi.A0d(obj2, 1);
            C18070vi.A0d(r4, 2);
            this.A04.put(r4, new AnonymousClass3C5(this, obj2, r4, 17));
        } else if (this instanceof C35621mX) {
            C18070vi.A0d(obj2, 1);
            C56162h0 r7 = (C56162h0) obj2;
            C35611mW r42 = ((C35621mX) this).A00;
            Jid jid = r7.A05.A02;
            DeviceJid A022 = DeviceJid.Companion.A02(jid);
            AnonymousClass205 r12 = r7.A02;
            byte[] bArr = r7.A0B;
            int i = r7.A00;
            long j = r7.A01;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got retry request from peer ");
            sb2.append(A022);
            sb2.append(" retryCount ");
            sb2.append(i);
            sb2.append(" for ");
            String str3 = r12.A01;
            sb2.append(str3);
            sb2.append(" originally sent at ");
            sb2.append(j);
            Log.i(sb2.toString());
            if (A022 == null || !r42.A00.A0P(A022) || !r42.A05.A02().contains(A022)) {
                sb = new StringBuilder();
                str = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/got peer message retry from device other than my companion: ";
            } else {
                AnonymousClass231 A032 = r42.A06.A03(A022, str3);
                if (A032 == null) {
                    sb = new StringBuilder();
                    sb.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/invalid peer message: ");
                    sb.append(str3);
                    str = " device: ";
                } else if (A032.A0I < AnonymousClass11P.A01(r42.A03) - 5184000000L) {
                    str2 = "PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/cannot send retry to older message";
                    Log.w(str2);
                } else {
                    r42.A02.A0G(A032, i);
                    if (i > 4) {
                        sb = new StringBuilder();
                        sb.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/skipping retry for ");
                        sb.append(r12);
                        str2 = sb.toString();
                        Log.w(str2);
                    }
                    DeviceJid A023 = DeviceJid.Companion.A02(jid);
                    byte[] bArr2 = r7.A0A;
                    byte[] bArr3 = r7.A09;
                    C54492eE r13 = r7.A04;
                    C54492eE r14 = r7.A03;
                    boolean z = r7.A08;
                    int A012 = A8G.A01(bArr, 0);
                    if (bArr2 == null || r14 == null || r13 == null || r42.A04.A0E(A023, bArr3, bArr2, (byte) 5, 3)) {
                        byte[] bArr4 = bArr2;
                        byte[] A002 = r42.A07.A00(A023, r12, r13, r14, bArr, bArr4, i, A012, z);
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/sending retry for msg = ");
                        sb3.append(A032);
                        sb3.append(" device = ");
                        sb3.append(A023);
                        Log.i(sb3.toString());
                        r42.A01.A01(new SendPeerMessageJob(A023, A032, A002, i));
                        return;
                    }
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("PeerMessageRetryHandler/onPeerMessageDecryptionFailureRetry/adv validation fails, key=");
                    sb4.append(r12);
                    Log.e(sb4.toString());
                    return;
                }
            }
            sb.append(str);
            sb.append(A022);
            str2 = sb.toString();
            Log.w(str2);
        } else {
            if (this instanceof C31961gP) {
                C31961gP r32 = (C31961gP) this;
                r2 = r32.A01.A03;
                r1 = new C70643By(r32, r4, 47);
            } else {
                C31971gQ r33 = (C31971gQ) this;
                C18070vi.A0d(r4, 2);
                r2 = r33.A00.A03;
                r1 = new C70733Ch(r33, r4, 27);
            }
            r2.execute(r1);
        }
    }

    public boolean A03(C60132nR r5) {
        if (!(this instanceof C35391mA)) {
            return false;
        }
        C35391mA r2 = (C35391mA) this;
        Set set = r2.A03;
        synchronized (set) {
            if (set.contains(r5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageStatusUpdateReceiptHandler/onMessageStatusUpdate receipt in queue; skipping stanzaKey:");
                sb.append(r5);
                Log.i(sb.toString());
                r2.A01.A03(r5.A00);
                return true;
            }
            set.add(r5);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C31951gO r5, X.C60132nR r6, java.lang.Object r7) {
        /*
            r5.A02(r6, r7)
            boolean r0 = r5 instanceof X.C35391mA
            if (r0 == 0) goto L_0x006a
            r3 = r5
            X.1mA r3 = (X.C35391mA) r3
            r4 = 0
            java.lang.String r1 = "receipt"
            java.lang.String r0 = r6.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006a
            java.lang.String r0 = "read"
            java.lang.String r2 = r6.A09
            boolean r1 = r0.equals(r2)
            java.lang.String r0 = "played"
            boolean r0 = r0.equals(r2)
            if (r1 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x006a
        L_0x0027:
            X.1N5 r1 = r3.A00
            com.whatsapp.jid.Jid r0 = r6.A02
            X.1BI r0 = X.C22971Dz.A00(r0)
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x006a
            r0 = 1
            X.1MD[] r3 = new X.AnonymousClass1MD[r0]
            java.lang.String r2 = "readreceipts"
            java.lang.String r1 = "disable"
            X.1MD r0 = new X.1MD
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r3[r4] = r0
            java.lang.String r0 = "features"
            X.1ca r1 = new X.1ca
            r1.<init>(r0, r3)
            X.2lD r0 = r6.A00()
            r0.A04 = r1
            X.2nR r1 = r0.A00()
        L_0x0054:
            X.C18070vi.A0b(r1)
            X.1OZ r0 = r5.A06
            r0.A0K(r1)
            java.util.concurrent.ConcurrentHashMap r0 = r5.A04
            java.lang.Object r0 = r0.remove(r6)
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L_0x0069
            r0.run()
        L_0x0069:
            return
        L_0x006a:
            r1 = r6
            goto L_0x0054
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31951gO.A00(X.1gO, X.2nR, java.lang.Object):void");
    }

    public final int[] BSG() {
        return this.A05;
    }
}
