package X;

import android.os.Message;
import com.facebook.wearable.mediastream.client.state.DiscoveredStateDelegate$handleStartConnection$4;

public final class BXK extends C22812BQn {
    public AnonymousClass1OB A00;
    public final BQm A01;
    public final AnonymousClass1G2 A02 = new C27189DXz(this, 1);

    public /* bridge */ /* synthetic */ boolean A06(Message message, Object obj) {
        C24426C3b c3b = (C24426C3b) obj;
        C18070vi.A0h(c3b, message);
        if (c3b instanceof BXW) {
            C25845Cn1 cn1 = C24712CGy.A01;
            cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED]: Received Connect");
            cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED]: handleStartConnection()");
            String[] A002 = C24709CGv.A01.A00();
            int length = A002.length;
            int i = 0;
            while (i < length) {
                String str = A002[i];
                BQm bQm = this.A01;
                if (bQm.A00.A00.checkSelfPermission(str) == -1) {
                    cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED]: BT permissions not granted!");
                    bQm.A0N.invoke(new C22951BWx("BT_PERMISSIONS_NOT_GRANTED"), (Object) null);
                } else {
                    i++;
                }
            }
            C26153CtL ctL = BQm.A0Q;
            if (ctL.A0A()) {
                cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED]: Media Stream Service is currently in use.  Send connection error");
                A0A(new C27527Dgu(this));
                return true;
            }
            if (ctL.A04().isEmpty()) {
                cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED]: There are no ready devices. Send hardware status to hide");
                A0A(new C27528Dgv(this));
            }
            cn1.A02("sup:DiscoveredStateDelegate", "[DISCOVERED]: Start device ready state observer");
            AnonymousClass1OY A022 = AnonymousClass1OW.A02(C23871Hy.A00);
            C30511e4 A023 = C30451dy.A02(AnonymousClass00R.A01, AnonymousClass1OR.A00, new DiscoveredStateDelegate$handleStartConnection$4(this, (C30391dr) null), A022);
            this.A00 = A023;
            A023.CNg();
            ctL.A06();
            return true;
        } else if ((c3b instanceof BXP) || (c3b instanceof C22954BXa)) {
            BG4 bg4 = this.A01.A00;
            Message obtainMessage = bg4.obtainMessage();
            obtainMessage.copyFrom(message);
            bg4.A09.add(obtainMessage);
            return true;
        } else if (c3b instanceof BXR) {
            BQm bQm2 = this.A01;
            bQm2.A0L.invoke(BWT.A00);
            C6B c6b = ((BXR) c3b).A00;
            if (C18070vi.A18(c6b, C25522ChK.A00(bQm2.A04, bQm2, BQm.A0R, 1))) {
                bQm2.A00.A03 = bQm2.A09();
                return true;
            } else if (!C18070vi.A18(c6b, BQm.A01(bQm2))) {
                return false;
            } else {
                C24712CGy.A01.A02("sup:DiscoveredStateDelegate", "Already on Discovered state. Ignoring");
                return true;
            }
        } else if (!(c3b instanceof BXQ)) {
            if ((c3b instanceof C22955BXb) || (c3b instanceof BXX) || (c3b instanceof BXS)) {
                return false;
            }
            C24712CGy.A01.A07("sup:DiscoveredStateDelegate", AnonymousClass001.A1E(c3b, "[DISCOVERED]: Received invalid msg ", AnonymousClass000.A10()), BE6.A0k());
            BQm bQm3 = this.A01;
            C22951BWx bWx = new C22951BWx("INVALID_STATE_MESSAGE");
            EEE[] eeeArr = BQm.A0R;
            bQm3.A0B(bWx);
            return false;
        }
        return true;
    }

    public void A07() {
        this.A01.A0F(new C27917Dns(this));
    }

    public void A08() {
        this.A01.A0F(new C27529Dgw(this));
    }

    public BXK(BQm bQm) {
        super(bQm);
        this.A01 = bQm;
    }
}
