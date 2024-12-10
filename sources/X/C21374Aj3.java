package X;

import com.whatsapp.voipcalling.Voip;

/* renamed from: X.Aj3  reason: case insensitive filesystem */
public class C21374Aj3 implements Runnable {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public C21374Aj3(Object obj, String str, int i, int i2, boolean z, boolean z2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = z;
        this.A05 = z2;
        this.A03 = str;
        this.A01 = i;
    }

    public final void run() {
        String str;
        if (this.A00 != 0) {
            AS4 as4 = (AS4) this.A02;
            String str2 = this.A03;
            boolean z = this.A04;
            boolean z2 = this.A05;
            int i = this.A01;
            String str3 = as4.A04;
            String str4 = as4.A03;
            if (z) {
                C172058si r1 = as4.A01;
                if (z2) {
                    str = "forward_network_1_start";
                } else {
                    str = "forward_network_start";
                }
                C20081A6h.A02(r1, str, i);
            }
            as4.A00.A00(str3, str4, str2).CBv(as4.A02);
            return;
        }
        A99 a99 = (A99) this.A02;
        boolean z3 = this.A04;
        boolean z4 = this.A05;
        String str5 = this.A03;
        int i2 = this.A01;
        if (z3) {
            AnonymousClass8BX.A18(a99);
        }
        boolean A052 = C18020vd.A05(C18040vf.A02, a99.A2p, 8180);
        if (z4) {
            a99.A1U = true;
        }
        int previewCallLink = Voip.previewCallLink(str5, z3, A052);
        if (previewCallLink == 0) {
            a99.A0x = Integer.valueOf(i2);
            if (a99.A1U) {
                Voip.joinCallLink();
                return;
            }
            return;
        }
        C17900vP.A0i("voip/actionPreviewCallLink failed error: ", AnonymousClass000.A10(), previewCallLink);
    }
}
