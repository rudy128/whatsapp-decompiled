package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.voipcalling.CallState;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.AWl  reason: case insensitive filesystem */
public class C20730AWl implements C23691Hg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C20730AWl(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A03 = str;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CGE(Object obj) {
        Object obj2;
        Object obj3 = obj;
        if (this.A00 != 0) {
            AnonymousClass1IV r6 = (AnonymousClass1IV) obj3;
            r6.BnK((AnonymousClass1BI) this.A01, (CallState) this.A02, this.A03);
            return;
        }
        InputStream inputStream = (InputStream) this.A01;
        OutputStream outputStream = (OutputStream) this.A02;
        String str = this.A03;
        BDJ bdj = (BDJ) obj3;
        C18070vi.A0d(bdj, 3);
        ChatTransferViewModel chatTransferViewModel = ((AW8) bdj).A00;
        if (chatTransferViewModel.A04) {
            AnonymousClass10E r10 = chatTransferViewModel.A0A.A00.A00;
            AnonymousClass11P A6O = AnonymousClass10E.A6O(r10);
            C18030ve A8r = AnonymousClass10E.A8r(r10);
            AnonymousClass190 A0N = AnonymousClass3MY.A0N(r10);
            AnonymousClass10G r1 = r10.A00;
            obj2 = new AWH(A0N, A6O, AnonymousClass8BU.A0F(r10), A8r, (C196129uV) r10.A6q.get(), (C192059nj) r10.A3q.get(), (C196139uW) r10.A3r.get(), (AMY) r1.A1f.get(), (A7P) r1.A32.get(), (C175248yO) r1.A3g.get(), inputStream, outputStream, str);
        } else {
            C198749yq r5 = chatTransferViewModel.A0G;
            if (!r5.A01) {
                r5.A09.A02();
                r5.A0D.get();
                C24521Kq r0 = C24521Kq.$redex_init_class;
                r5.A0A.A0G();
                r5.A03.A0h();
                r5.A01 = true;
            }
            AnonymousClass10E r102 = chatTransferViewModel.A0B.A00.A00;
            AnonymousClass11P A6O2 = AnonymousClass10E.A6O(r102);
            C18030ve A8r2 = AnonymousClass10E.A8r(r102);
            AnonymousClass190 A0N2 = AnonymousClass3MY.A0N(r102);
            AnonymousClass10I AL1 = AnonymousClass10E.AL1(r102);
            AnonymousClass10G r12 = r102.A00;
            AWI awi = new AWI(A0N2, (AnonymousClass1L7) r102.A3t.get(), A6O2, AnonymousClass8BU.A0F(r102), A8r2, (C195259t3) r12.A2G.get(), (C193089pW) r102.A56.get(), (C196129uV) r102.A6q.get(), (C198749yq) r12.A2f.get(), (A7P) r12.A32.get(), (C175248yO) r12.A3g.get(), AL1, inputStream, outputStream, str);
            chatTransferViewModel.A01 = awi;
            obj2 = awi;
        }
        C22514BAx bAx = (C22514BAx) obj2;
        chatTransferViewModel.A02 = bAx;
        if (bAx != null) {
            bAx.run();
        }
    }
}
