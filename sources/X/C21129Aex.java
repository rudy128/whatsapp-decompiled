package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipantJid;

/* renamed from: X.Aex  reason: case insensitive filesystem */
public final /* synthetic */ class C21129Aex implements AnonymousClass1TI {
    public final /* synthetic */ int A00;
    public final /* synthetic */ A99 A01;
    public final /* synthetic */ GroupJid A02;
    public final /* synthetic */ CallInfo A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ CallParticipantJid[] A08;

    public final void accept(Object obj) {
        A99 a99 = this.A01;
        GroupJid groupJid = this.A02;
        CallParticipantJid[] callParticipantJidArr = this.A08;
        CallInfo callInfo = this.A03;
        boolean z = this.A06;
        String str = this.A04;
        boolean z2 = this.A07;
        a99.A22.CGP(new C21412Ajf(a99, groupJid, callInfo, (C178119Bw) ((C19880zA) obj).A04(), str, this.A05, callParticipantJidArr, this.A00, z, z2));
    }

    public /* synthetic */ C21129Aex(A99 a99, GroupJid groupJid, CallInfo callInfo, String str, String str2, CallParticipantJid[] callParticipantJidArr, int i, boolean z, boolean z2) {
        this.A01 = a99;
        this.A02 = groupJid;
        this.A08 = callParticipantJidArr;
        this.A03 = callInfo;
        this.A06 = z;
        this.A04 = str;
        this.A07 = z2;
        this.A05 = str2;
        this.A00 = i;
    }
}
