package X;

import android.os.Message;

public abstract class C6V {
    public abstract void A07();

    public abstract void A08();

    public boolean A06(Message message, Object obj) {
        BQm bQm;
        C18090vk dll;
        Boolean bool;
        if (this instanceof BXI) {
            BXI bxi = (BXI) this;
            C24426C3b c3b = (C24426C3b) obj;
            C18070vi.A0d(c3b, 0);
            bQm = bxi.A00;
            dll = new C27823Dlz(c3b, bxi);
        } else if (this instanceof BXM) {
            BXM bxm = (BXM) this;
            C24426C3b c3b2 = (C24426C3b) obj;
            C18070vi.A0d(c3b2, 0);
            bQm = bxm.A00;
            dll = new C27821Dlx(c3b2, bxm);
        } else if (this instanceof BXG) {
            BXG bxg = (BXG) this;
            C24426C3b c3b3 = (C24426C3b) obj;
            C18070vi.A0d(c3b3, 0);
            bQm = bxg.A00;
            dll = new C27820Dlw(bxg, c3b3);
        } else if (this instanceof BXH) {
            BXH bxh = (BXH) this;
            C24426C3b c3b4 = (C24426C3b) obj;
            C18070vi.A0d(c3b4, 0);
            bQm = bxh.A00;
            dll = new C27819Dlv(bxh, c3b4);
        } else if (this instanceof BXN) {
            BXN bxn = (BXN) this;
            C24426C3b c3b5 = (C24426C3b) obj;
            C18070vi.A0d(c3b5, 0);
            bQm = bxn.A01;
            dll = new C27816Dls(bxn, c3b5);
        } else if (this instanceof BXO) {
            BXO bxo = (BXO) this;
            C24426C3b c3b6 = (C24426C3b) obj;
            C18070vi.A0d(c3b6, 0);
            bQm = bxo.A00;
            dll = new C27812Dlo(bxo, c3b6);
        } else if (this instanceof BXJ) {
            BXJ bxj = (BXJ) this;
            C24426C3b c3b7 = (C24426C3b) obj;
            C18070vi.A0h(c3b7, message);
            if (c3b7 instanceof BXZ) {
                bxj.A02.A0F(new C27532Dgz(bxj));
            } else if (c3b7 instanceof BXR) {
                C24712CGy.A01.A02("sup:InitialStateDelegate", "[INITIAL]: Received ConnectionStepSuccess");
                C6B c6b = ((BXR) c3b7).A00;
                BQm bQm2 = bxj.A02;
                if (!C18070vi.A18(c6b, BQm.A01(bQm2))) {
                    return false;
                }
                bQm2.A0L.invoke(BWU.A00);
                bQm2.A00.A03 = C25522ChK.A00(bQm2.A04, bQm2, BQm.A0R, 1);
                return true;
            } else if (c3b7 instanceof BXW) {
                C24712CGy.A01.A02("sup:InitialStateDelegate", "[INITIAL]: Received Connect Message");
                if (!C25459CgC.A04) {
                    if (bxj.A00 == null) {
                        bxj.A02.A0F(new C27532Dgz(bxj));
                    }
                    BG4 bg4 = bxj.A02.A00;
                    Message obtainMessage = bg4.obtainMessage();
                    obtainMessage.copyFrom(message);
                    bg4.A09.add(obtainMessage);
                    return true;
                }
            } else {
                C24712CGy.A01.A02("sup:InitialStateDelegate", AnonymousClass001.A1E(c3b7, "[INITIAL]: Received invalid msg ", AnonymousClass000.A10()));
                return true;
            }
            return true;
        } else if (!(this instanceof BXE)) {
            return false;
        } else {
            BXE bxe = (BXE) this;
            C24426C3b c3b8 = (C24426C3b) obj;
            C18070vi.A0d(c3b8, 0);
            bQm = bxe.A00;
            dll = new C27809Dll(bxe, c3b8);
        }
        try {
            bool = dll.invoke();
        } catch (Throwable th) {
            bool = C108945cZ.A1J(th);
        }
        Throwable A00 = C30671eK.A00(bool);
        if (A00 != null) {
            BQm.A02(bQm, A00);
        }
        if (bool instanceof AnonymousClass1IU) {
            bool = false;
        }
        return AnonymousClass000.A1Y(bool);
    }
}
