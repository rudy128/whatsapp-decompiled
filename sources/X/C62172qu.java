package X;

import com.whatsapp.jid.GroupJid;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: X.2qu  reason: invalid class name and case insensitive filesystem */
public class C62172qu {
    public int A00;
    public long A01 = -1;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final int A07;
    public final GroupJid A08;
    public final C178119Bw A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final LinkedHashMap A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C62172qu(C178119Bw r3, int i, boolean z, boolean z2) {
        this.A0B = C40811vJ.A09(r3.A04.A02);
        this.A0D = C17880vN.A13();
        this.A0F = r3.A0J;
        this.A08 = r3.A0C;
        this.A07 = 0;
        this.A0G = false;
        this.A0C = null;
        this.A0E = z2;
        this.A09 = r3;
        this.A0A = Integer.valueOf(i);
        this.A02 = null;
        this.A06 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("callId=");
        A10.append(this.A0B);
        A10.append(" isVideoCall=");
        A10.append(this.A0F);
        A10.append(" groupJid=");
        A10.append(this.A08);
        A10.append(" jids=[ ");
        Iterator A0k = C17890vO.A0k(this.A0D);
        while (A0k.hasNext()) {
            A10.append(A0k.next());
            A10.append(" ");
        }
        A10.append("]");
        A10.append(" callLog=");
        A10.append(this.A09);
        A10.append(" entryPoint=");
        A10.append(this.A0A);
        A10.append(" groupPhash=");
        A10.append(this.A02);
        A10.append(" offerDelayMs=");
        A10.append(this.A00);
        A10.append(" shouldJoinAndAccept=");
        A10.append(this.A06);
        A10.append(" mute");
        A10.append(this.A05);
        return A10.toString();
    }

    public C62172qu(GroupJid groupJid, Integer num, String str, String str2, String str3, LinkedHashMap linkedHashMap, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0B = str;
        this.A0D = linkedHashMap;
        this.A0F = z;
        this.A08 = groupJid;
        this.A07 = i;
        this.A0G = z2;
        this.A0C = str2;
        this.A0E = z3;
        this.A0A = num;
        this.A02 = str3;
        this.A04 = z4;
        this.A03 = z5;
        this.A00 = i2;
        this.A09 = null;
        this.A05 = z6;
    }
}
