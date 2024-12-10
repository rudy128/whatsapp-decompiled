package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;

/* renamed from: X.1mq  reason: invalid class name and case insensitive filesystem */
public final class C35811mq extends C31951gO {
    public final AnonymousClass11S A00;
    public final AnonymousClass1TP A01;
    public final AnonymousClass11E A02;
    public final AnonymousClass1TH A03;
    public final C26391Ry A04;
    public final C18030ve A05;
    public final C32861hs A06;
    public final AnonymousClass1O2 A07;
    public final AnonymousClass1TO A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35811mq(X.AnonymousClass11S r23, X.AnonymousClass1TP r24, X.AnonymousClass11E r25, X.C25581Ot r26, X.C31931gM r27, X.AnonymousClass1TH r28, X.C26391Ry r29, X.C18030ve r30, X.C32861hs r31, X.AnonymousClass1O2 r32, X.AnonymousClass1OZ r33, X.AnonymousClass1TO r34, X.AnonymousClass10I r35, X.AnonymousClass00H r36, X.AnonymousClass00H r37, X.AnonymousClass00H r38) {
        /*
            r22 = this;
            r2 = 1
            r9 = r30
            X.C18070vi.A0d(r9, r2)
            r0 = 2
            r10 = r23
            X.C18070vi.A0d(r10, r0)
            r1 = 3
            r19 = r35
            r0 = r19
            X.C18070vi.A0d(r0, r1)
            r1 = 4
            r18 = r33
            r0 = r18
            X.C18070vi.A0d(r0, r1)
            r3 = 5
            r16 = r26
            r0 = r16
            X.C18070vi.A0d(r0, r3)
            r3 = 6
            r17 = r27
            r0 = r17
            X.C18070vi.A0d(r0, r3)
            r0 = 7
            r5 = r36
            X.C18070vi.A0d(r5, r0)
            r0 = 8
            r7 = r32
            X.C18070vi.A0d(r7, r0)
            r0 = 9
            r11 = r29
            X.C18070vi.A0d(r11, r0)
            r0 = 10
            r6 = r34
            X.C18070vi.A0d(r6, r0)
            r0 = 11
            r14 = r24
            X.C18070vi.A0d(r14, r0)
            r0 = 12
            r4 = r37
            X.C18070vi.A0d(r4, r0)
            r0 = 13
            r3 = r38
            X.C18070vi.A0d(r3, r0)
            r0 = 14
            r12 = r28
            X.C18070vi.A0d(r12, r0)
            r0 = 15
            r8 = r31
            X.C18070vi.A0d(r8, r0)
            r0 = 16
            r13 = r25
            X.C18070vi.A0d(r13, r0)
            int[] r2 = new int[r2]
            r15 = 0
            r0 = 69
            r2[r15] = r0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            r0 = 0
            X.0vq r1 = new X.0vq
            r1.<init>(r15, r0)
            r0 = r22
            r20 = r1
            r21 = r2
            r15 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0.A05 = r9
            r0.A00 = r10
            r0.A09 = r5
            r0.A07 = r7
            r0.A04 = r11
            r0.A08 = r6
            r0.A01 = r14
            r0.A0A = r4
            r0.A0B = r3
            r0.A03 = r12
            r0.A06 = r8
            r0.A02 = r13
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35811mq.<init>(X.11S, X.1TP, X.11E, X.1Ot, X.1gM, X.1TH, X.1Ry, X.0ve, X.1hs, X.1O2, X.1OZ, X.1TO, X.10I, X.00H, X.00H, X.00H):void");
    }

    public static final int A01(C35811mq r7, String str, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        String obj;
        if (bArr2 == null) {
            return 1;
        }
        if (bArr == null) {
            obj = "MessageServerErrorReceiptHandler/validateServerErrorEncData/badmediadata;";
        } else if (bArr3 == null) {
            obj = "MessageServerErrorReceiptHandler/validateServerErrorEncData/incomplete enc data";
        } else {
            r7.A0B.get();
            C61992qc.A00(bArr, bArr3);
            NativeHolder nativeHolder = (NativeHolder) JniBridge.jvidispatchOOOOO(1, str, bArr2, bArr, bArr3);
            if (nativeHolder != null) {
                C61242pM r0 = new C61242pM(nativeHolder);
                JniBridge.getInstance();
                NativeHolder nativeHolder2 = r0.A00;
                if (str.equals(JniBridge.jvidispatchOIO(1, 30, nativeHolder2))) {
                    return 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("MessageServerErrorReceiptHandler/validateServerErrorEncData/incorrect stanza id; key=");
                sb.append(str);
                sb.append("; stanzaId=");
                JniBridge.getInstance();
                sb.append((String) JniBridge.jvidispatchOIO(1, 30, nativeHolder2));
                obj = sb.toString();
            } else {
                Log.e("MessageServerErrorReceiptHandler/validateServerErrorEncData/malformed enc data");
                return 3;
            }
        }
        Log.e(obj);
        return 0;
    }
}
