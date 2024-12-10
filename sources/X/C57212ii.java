package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2ii  reason: invalid class name and case insensitive filesystem */
public final class C57212ii {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public final void A00(AnonymousClass350 r18, C63362sw r19, byte[] bArr, int i) {
        AnonymousClass205 r8;
        AnonymousClass350 r3 = r18;
        C63362sw r4 = r19;
        if (r3.A00 == null || !C22971Dz.A0d(r4.A0B.A00)) {
            r8 = r4.A0B;
        } else {
            r8 = AnonymousClass205.A01(((C59572mW) this.A00.get()).A00(r3, r4.A03()), r4.A0B.A01, false);
        }
        UserJid A05 = r4.A05();
        AnonymousClass205 A012 = AnonymousClass205.A01(((C59572mW) this.A00.get()).A00(r3, r4.A03()), r3.A04, false);
        C17960vV.A07(r3);
        UserJid userJid = r3.A01;
        long j = r4.A0X;
        byte[] bArr2 = null;
        C17960vV.A07(r3);
        String str = r3.A03;
        if (!AnonymousClass1EG.A0H(str)) {
            C23624Bmt A0N = C164118Xp.DEFAULT_INSTANCE.A0N();
            C164118Xp r1 = (C164118Xp) C17880vN.A0G(A0N);
            str.getClass();
            r1.bitField0_ |= 1;
            r1.editTargetId_ = str;
            C23624Bmt A0N2 = C165308av.DEFAULT_INSTANCE.A0N();
            C164118Xp r0 = (C164118Xp) A0N.A0C();
            C165308av r12 = (C165308av) C17880vN.A0G(A0N2);
            r0.getClass();
            r12.botMessageInfo_ = r0;
            r12.bitField0_ |= 1;
            bArr2 = A0N2.A0C().A0M();
        }
        if (((ARP) this.A01.get()).A01(new C195749tq(A05, userJid, r8, A012, (Long) null, bArr, bArr2, 2, i, j)) != 4) {
            Log.e("MessageSecretMsgOrphanStore//storeOrphanMessage/Failed to store orphan message");
        }
    }

    public C57212ii(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
