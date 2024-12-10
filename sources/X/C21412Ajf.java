package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipantJid;
import java.util.ArrayList;

/* renamed from: X.Ajf  reason: case insensitive filesystem */
public final /* synthetic */ class C21412Ajf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A99 A01;
    public final /* synthetic */ GroupJid A02;
    public final /* synthetic */ CallInfo A03;
    public final /* synthetic */ C178119Bw A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ CallParticipantJid[] A09;

    public final void run() {
        A99 a99 = this.A01;
        GroupJid groupJid = this.A02;
        CallParticipantJid[] callParticipantJidArr = this.A09;
        C178119Bw r5 = this.A04;
        CallInfo callInfo = this.A03;
        boolean z = this.A07;
        String str = this.A05;
        boolean z2 = this.A08;
        String str2 = this.A06;
        int i = this.A00;
        if (groupJid == null && callParticipantJidArr.length > 1 && r5 != null && callInfo != null) {
            A7S.A02(callInfo, r5);
        }
        int i2 = 2;
        if (z) {
            a99.A14(str, 3, 2);
            i2 = 3;
        } else if (!z2) {
            i2 = 0;
        }
        if (r5 != null) {
            if (groupJid != null) {
                a99.A0T.A07(groupJid, r5, str2);
                a99.A0T.A08(groupJid, r5, str2, i2);
            }
            if (C18020vd.A05(C18040vf.A02, a99.A2p, 12680)) {
                a99.A2L.execute(new AnonymousClass7RL(a99, r5, 0));
            } else {
                a99.A2j.A0A(r5);
            }
            if (i > 0 || z) {
                a99.A18 = str;
                return;
            }
            AnonymousClass00H r0 = a99.A3H;
            C42571yO r4 = (C42571yO) r0.get();
            r0.get();
            C18100vl r02 = C42571yO.A0I;
            ArrayList A0z = C17880vN.A0z(r3);
            for (CallParticipantJid callParticipantJid : callParticipantJidArr) {
                A0z.add(callParticipantJid.userJid);
            }
            r4.A0G(r5, AnonymousClass00R.A00, C29431cG.A12(A0z));
        }
    }

    public /* synthetic */ C21412Ajf(A99 a99, GroupJid groupJid, CallInfo callInfo, C178119Bw r4, String str, String str2, CallParticipantJid[] callParticipantJidArr, int i, boolean z, boolean z2) {
        this.A01 = a99;
        this.A02 = groupJid;
        this.A09 = callParticipantJidArr;
        this.A04 = r4;
        this.A03 = callInfo;
        this.A07 = z;
        this.A05 = str;
        this.A08 = z2;
        this.A06 = str2;
        this.A00 = i;
    }
}
