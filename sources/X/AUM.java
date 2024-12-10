package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AUM implements C437020o, C22512BAt {
    public final AnonymousClass00H A00;

    public AUM(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public Set BSF() {
        return C200410p.A0S(new C179859Ke[]{C179859Ke.A1C, C179859Ke.A1B, C179859Ke.A1A, C179859Ke.A19, C179859Ke.A2y, C179859Ke.A2z});
    }

    public AnonymousClass206 CBA(C166388co r28) {
        boolean z;
        DeviceJid deviceJid;
        C166388co r0 = r28;
        AnonymousClass22J r7 = new AnonymousClass22J(C20106A7k.A02(r0, this.A00), 10, C20106A7k.A00(r0));
        if ((r0.bitField0_ & 16) != 0) {
            AnonymousClass8BT.A1F(UserJid.Companion, r7, r0.participant_);
        }
        C179859Ke A0R = r0.A0R();
        switch (A0R.ordinal()) {
            case 40:
            case 45:
            case 169:
                z = false;
                break;
            case 41:
            case 46:
            case 170:
                z = true;
                break;
            default:
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Unexpected missed stub type ");
                throw AnonymousClass8BR.A0p(AnonymousClass000.A0y(A0R.name(), A10), 0);
        }
        AnonymousClass205 r5 = r7.A0v;
        AnonymousClass1BI r2 = r5.A00;
        UserJid A002 = C22941Dw.A00(r2);
        if (!C22971Dz.A0d(A002)) {
            C17900vP.A0X(r2, "CallLog/fromFMessage Legacy bad UserJid: ", AnonymousClass000.A10());
            return r7;
        }
        C89444cT r8 = new C89444cT(-1, A002, r5.A01, r5.A02);
        long j = r7.A0I;
        C179559Il r9 = C179559Il.NONE;
        List emptyList = Collections.emptyList();
        AnonymousClass1E0 r3 = DeviceJid.Companion;
        if (A002 != null) {
            deviceJid = A002.getPrimaryDevice();
        } else {
            deviceJid = null;
        }
        C178119Bw r32 = new C178119Bw((C59292m4) null, deviceJid, (GroupJid) null, r7, r8, r9, (AnonymousClass2Q4) null, (C58332kW) null, (String) null, emptyList, 0, 2, 0, 0, -1, j, 0, z, true, false);
        C179859Ke A0R2 = r0.A0R();
        if (A0R2 == C179859Ke.A2y || A0R2 == C179859Ke.A2z) {
            r32.A0G(2);
        }
        List singletonList = Collections.singletonList(r32);
        List list = r7.A00;
        list.clear();
        list.addAll(singletonList);
        C21486Akr.A01(45, list);
        return r7;
    }

    public void BDZ(C195629te r6, AnonymousClass8X1 r7, AnonymousClass206 r8) {
        AnonymousClass22O r3;
        C179859Ke r0;
        boolean A16 = C18070vi.A16(r8, r7);
        if (!(r8 instanceof AnonymousClass22O) || (r3 = (AnonymousClass22O) r8) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid message class: ");
            Class<?> cls = r8.getClass();
            Map map = AnonymousClass20F.A03;
            C18070vi.A0d(cls, A16 ? 1 : 0);
            throw new AnonymousClass1T8(26, AnonymousClass000.A0y(C60662oP.A01(cls), A10));
        }
        List list = r3.A00;
        boolean z = false;
        if (!list.isEmpty() && ((C178119Bw) list.get(0)).A0R()) {
            z = true;
        }
        int A17 = r3.A17();
        if (z) {
            if (A17 == 0 || (A17 != A16 && A17 == 2)) {
                r0 = C179859Ke.A2y;
            } else {
                r0 = C179859Ke.A2z;
            }
        } else if (A17 == 0) {
            r0 = C179859Ke.A1C;
        } else if (A17 == A16) {
            r0 = C179859Ke.A1B;
        } else if (A17 != 2) {
            r0 = C179859Ke.A19;
        } else {
            r0 = C179859Ke.A1A;
        }
        r7.A0I(r0);
    }

    public Integer BSW() {
        return AnonymousClass00R.A01;
    }
}
