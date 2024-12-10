package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.CallParticipantJid;
import java.util.List;

/* renamed from: X.Alt  reason: case insensitive filesystem */
public final /* synthetic */ class C21546Alt implements C22821Di {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C21132Af0 A01;
    public final /* synthetic */ A99 A02;
    public final /* synthetic */ GroupJid A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ CallParticipantJid[] A0A;

    public final Object invoke(Object obj) {
        A99 a99 = this.A02;
        C21132Af0 af0 = this.A01;
        GroupJid groupJid = this.A03;
        CallParticipantJid[] callParticipantJidArr = this.A0A;
        boolean z = this.A08;
        String str = this.A04;
        boolean z2 = this.A09;
        return a99.A0S(af0, groupJid, (Integer) obj, str, this.A05, this.A06, callParticipantJidArr, this.A00, z, z2, this.A07);
    }

    public /* synthetic */ C21546Alt(C21132Af0 af0, A99 a99, GroupJid groupJid, String str, String str2, List list, CallParticipantJid[] callParticipantJidArr, int i, boolean z, boolean z2, boolean z3) {
        this.A02 = a99;
        this.A01 = af0;
        this.A03 = groupJid;
        this.A0A = callParticipantJidArr;
        this.A08 = z;
        this.A04 = str;
        this.A09 = z2;
        this.A05 = str2;
        this.A00 = i;
        this.A06 = list;
        this.A07 = z3;
    }
}
