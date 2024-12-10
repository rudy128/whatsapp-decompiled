package X;

import java.util.UUID;

/* renamed from: X.Dop  reason: case insensitive filesystem */
public final class C27953Dop extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26878DHk this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27953Dop(C26878DHk dHk) {
        super(1);
        this.this$0 = dHk;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        CXV A03;
        BTV btv = (BTV) obj;
        C18070vi.A0d(btv, 0);
        CL8 cl8 = this.this$0.A02;
        UUID uuid = btv.A01;
        String A0H = C18070vi.A0H(uuid);
        C4F c4f = btv.A00;
        if (C18070vi.A18(c4f, C23778BpN.A00)) {
            i = 0;
        } else if (C18070vi.A18(c4f, C23782BpR.A00)) {
            i = 4;
        } else if (C18070vi.A18(c4f, C23779BpO.A00)) {
            i = 1;
        } else if (C18070vi.A18(c4f, C23780BpP.A00)) {
            i = 2;
        } else if (C18070vi.A18(c4f, C23795Bpe.A00)) {
            i = 3;
        } else if (C18070vi.A18(c4f, C23781BpQ.A00)) {
            i = 5;
        } else if (C18070vi.A18(c4f, C23789BpY.A00)) {
            i = 6;
        } else if (C18070vi.A18(c4f, C23791Bpa.A00)) {
            i = 7;
        } else if (C18070vi.A18(c4f, C23792Bpb.A00)) {
            i = 8;
        } else if (C18070vi.A18(c4f, C23793Bpc.A00)) {
            i = 9;
        } else if (C18070vi.A18(c4f, C23783BpS.A00)) {
            i = 10;
        } else if (C18070vi.A18(c4f, C23785BpU.A00)) {
            i = 11;
        } else if (C18070vi.A18(c4f, C23786BpV.A00)) {
            i = 12;
        } else if (C18070vi.A18(c4f, C23787BpW.A00)) {
            i = 13;
        } else if (C18070vi.A18(c4f, C23784BpT.A00)) {
            i = 14;
        } else if (C18070vi.A18(c4f, C23788BpX.A00)) {
            i = 15;
        } else if (C18070vi.A18(c4f, C23790BpZ.A00)) {
            i = 16;
        } else if (C18070vi.A18(c4f, C23794Bpd.A00)) {
            i = 17;
        } else {
            throw AnonymousClass3MW.A14();
        }
        C25845Cn1 cn1 = C24712CGy.A01;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("device status update received for ");
        A10.append(A0H);
        cn1.A01("sup:HardwareStatusEventListener", AnonymousClass001.A1E(c4f, ": ", A10));
        BQm bQm = cl8.A00;
        C26153CtL ctL = BQm.A0Q;
        Integer valueOf = Integer.valueOf(i);
        String str = null;
        C26153CtL.A02(ctL, valueOf, uuid);
        CXV A032 = ctL.A03();
        if (A032 != null) {
            str = A032.A00();
        }
        if (C18070vi.A18(str, A0H)) {
            Integer[] numArr = new Integer[6];
            C17880vN.A1T(numArr, 10, 0);
            AnonymousClass000.A1M(numArr, 11);
            AnonymousClass3Ma.A1S(numArr, 12);
            C17890vO.A1G(numArr, 13);
            AnonymousClass3Ma.A1T(numArr, 14);
            AnonymousClass3Ma.A1U(numArr, 15);
            if (!C200410p.A0U(valueOf, numArr) || (A03 = ctL.A03()) == null || A03.A04 == null) {
                cn1.A01("sup:HardwareStatusEventListener", "Event for selected device.  Execute hardware status event callbacks");
                bQm.A0K.invoke(valueOf);
            }
        }
        return C27621Wu.A00;
    }
}
