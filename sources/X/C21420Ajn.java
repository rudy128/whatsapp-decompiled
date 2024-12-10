package X;

import com.whatsapp.fieldstats.events.WamCall;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallGroupInfo;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallParticipant;

/* renamed from: X.Ajn  reason: case insensitive filesystem */
public final /* synthetic */ class C21420Ajn implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ long A04;
    public final /* synthetic */ A7S A05;
    public final /* synthetic */ WamCall A06;
    public final /* synthetic */ GroupJid A07;
    public final /* synthetic */ UserJid A08;
    public final /* synthetic */ CallGroupInfo A09;
    public final /* synthetic */ CallInfo A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ String A0C;
    public final /* synthetic */ String A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;
    public final /* synthetic */ boolean A0I;

    public final void run() {
        boolean A1U;
        String str;
        A7S a7s = this.A05;
        UserJid userJid = this.A08;
        String str2 = this.A0D;
        int i = this.A00;
        CallInfo callInfo = this.A0A;
        GroupJid groupJid = this.A07;
        int i2 = this.A01;
        CallGroupInfo callGroupInfo = this.A09;
        long j = this.A04;
        int i3 = this.A02;
        String str3 = this.A0B;
        String str4 = this.A0C;
        boolean z = this.A0E;
        boolean z2 = this.A0F;
        boolean z3 = this.A0G;
        boolean z4 = this.A0H;
        boolean z5 = this.A0I;
        WamCall wamCall = this.A06;
        long j2 = this.A03;
        int i4 = 0;
        C178119Bw A052 = a7s.A05(userJid, str2, i, false);
        if (A052 != null) {
            if (callInfo == null) {
                A1U = false;
                str = null;
            } else {
                A1U = AnonymousClass8BU.A1U(callInfo, str2);
                str = callInfo.scheduledId;
                if (callInfo.isAudioChat()) {
                    i4 = 2;
                }
            }
            a7s.A08(groupJid, A052, str, i4);
            int i5 = 26;
            if (i2 == 0) {
                i5 = 4;
            }
            A052.A0E(2);
            if (callGroupInfo != null) {
                for (CallParticipant callParticipant : callGroupInfo.participants) {
                    if ("connected".equals(callParticipant.state)) {
                        A052.A0J(callParticipant.jid, 5);
                    }
                }
            }
            A7S.A01(a7s, A052);
            if (C18020vd.A05(C18040vf.A02, a7s.A0C, 12680)) {
                C17960vV.A0F(a7s.A07.A00.A06(), "Not on call log serial executor");
            } else if (C22781De.A03()) {
                a7s.A09.A0A(A052);
                a7s.A05.A0t(wamCall, callGroupInfo, A052, Integer.valueOf(i3), str2, str3, str4, i5, j, j2, z, A1U, z2, z3, z4, z5, true);
            }
            a7s.A09.A0B(A052);
            a7s.A05.A0t(wamCall, callGroupInfo, A052, Integer.valueOf(i3), str2, str3, str4, i5, j, j2, z, A1U, z2, z3, z4, z5, true);
        }
    }

    public /* synthetic */ C21420Ajn(A7S a7s, WamCall wamCall, GroupJid groupJid, UserJid userJid, CallGroupInfo callGroupInfo, CallInfo callInfo, String str, String str2, String str3, int i, int i2, int i3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A05 = a7s;
        this.A08 = userJid;
        this.A0D = str;
        this.A00 = i;
        this.A0A = callInfo;
        this.A07 = groupJid;
        this.A01 = i2;
        this.A09 = callGroupInfo;
        this.A04 = j;
        this.A02 = i3;
        this.A0B = str2;
        this.A0C = str3;
        this.A0E = z;
        this.A0F = z2;
        this.A0G = z3;
        this.A0H = z4;
        this.A0I = z5;
        this.A06 = wamCall;
        this.A03 = j2;
    }
}
