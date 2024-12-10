package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8Hs  reason: invalid class name and case insensitive filesystem */
public class C161778Hs extends C38391rD {
    public AnonymousClass1EC A00;
    public List A01 = AnonymousClass000.A13();
    public C22821Di A02;
    public C22821Di A03;
    public final Context A04;
    public final C24921Me A05;
    public final AnonymousClass11P A06;
    public final C18000vb A07;
    public final AnonymousClass1L9 A08;
    public final C37451pZ A09;
    public final C27201Vd A0A;
    public final AnonymousClass11C A0B;
    public final C18030ve A0C;
    public final C36401np A0D;

    public C161778Hs(Context context, AnonymousClass1L9 r4, C24921Me r5, C27201Vd r6, AnonymousClass11C r7, AnonymousClass11P r8, C18000vb r9, C18030ve r10, C36401np r11) {
        C18070vi.A0p(r10, r8, r4);
        C18070vi.A0d(r11, 5);
        C18070vi.A0q(r7, r6, r9);
        C18070vi.A0d(r5, 9);
        this.A04 = context;
        this.A0C = r10;
        this.A06 = r8;
        this.A08 = r4;
        this.A0D = r11;
        this.A0B = r7;
        this.A0A = r6;
        this.A07 = r9;
        this.A05 = r5;
        this.A09 = r6.A06(context, "group-pending-participants");
        A0K(true);
    }

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A09.A02();
    }

    public void A0U(AnonymousClass1E7 r5, C162108Iz r6) {
        C18070vi.A0d(r6, 0);
        TextEmojiLabel textEmojiLabel = r6.A02;
        C24921Me r1 = this.A05;
        textEmojiLabel.setText(r1.A0D(r5, -1).A01);
        if (!r5.A0B()) {
            String A0Q = r1.A0Q(r5);
            if (AnonymousClass8BS.A00(A0Q) != 0) {
                ((TextView) AnonymousClass3MY.A0I(r6.A06, 0)).setText(A0Q);
                this.A09.A07(r6.A01, r5);
            }
        }
        r6.A06.A04(8);
        this.A09.A07(r6.A01, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0140, code lost:
        if (r7.A02 != X.C179659Iv.A06) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r11, int r12) {
        /*
            r10 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            java.util.List r0 = r10.A01
            java.lang.Object r7 = r0.get(r12)
            X.B5D r7 = (X.B5D) r7
            boolean r0 = r7 instanceof X.AUC
            if (r0 != 0) goto L_0x008e
            X.AUB r0 = X.AUB.A00
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 != 0) goto L_0x008e
            boolean r0 = r7 instanceof X.AUA
            if (r0 == 0) goto L_0x00b2
            X.AUA r7 = (X.AUA) r7
            r5 = 0
            r9 = 1
            X.C18070vi.A0d(r7, r9)
            X.8Iz r11 = (X.C162108Iz) r11
            X.1E7 r6 = r7.A07
            android.view.View r1 = r11.A00
            X.1BI r0 = r6.A0J
            r1.setTag(r0)
            r10.A0U(r6, r11)
            int r3 = r7.A00
            if (r3 <= 0) goto L_0x00aa
            X.1bI r0 = r11.A05
            android.view.View r2 = X.AnonymousClass3MY.A0I(r0, r5)
            android.widget.TextView r2 = (android.widget.TextView) r2
            android.content.Context r0 = r10.A04
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131755255(0x7f1000f7, float:1.9141384E38)
            java.lang.String r0 = X.C72473Md.A0k(r1, r3, r0)
            r2.setText(r0)
        L_0x004d:
            X.1E7 r8 = r7.A06
            if (r8 != 0) goto L_0x008f
            X.1bI r1 = r11.A04
            r0 = 8
            r1.A04(r0)
        L_0x0058:
            java.lang.Integer r2 = r7.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r1 = 8
            if (r2 != r0) goto L_0x00e2
            com.whatsapp.wds.components.button.WDSButton r4 = r11.A07
            r4.setVisibility(r5)
            com.whatsapp.wds.components.button.WDSButton r3 = r11.A08
            r3.setVisibility(r5)
            com.whatsapp.WaTextView r0 = r11.A03
            r0.setVisibility(r1)
            X.1Me r1 = r10.A05
            r0 = -1
            X.1yg r0 = r1.A0D(r6, r0)
            java.lang.String r2 = r0.A01
            android.content.Context r1 = r10.A04
            r0 = 2131891043(0x7f121363, float:1.9416795E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r2, r9, r5, r0)
            r4.setContentDescription(r0)
            r0 = 2131891050(0x7f12136a, float:1.941681E38)
            java.lang.String r0 = X.C17890vO.A0R(r1, r2, r9, r5, r0)
            r3.setContentDescription(r0)
        L_0x008e:
            return
        L_0x008f:
            X.1bI r0 = r11.A04
            android.view.View r4 = X.AnonymousClass3MY.A0I(r0, r5)
            android.widget.TextView r4 = (android.widget.TextView) r4
            android.content.Context r3 = r10.A04
            r2 = 2131891040(0x7f121360, float:1.9416789E38)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            X.1Me r0 = r10.A05
            java.lang.String r0 = r0.A0I(r8)
            r1[r5] = r0
            X.AnonymousClass3MY.A0y(r3, r4, r1, r2)
            goto L_0x0058
        L_0x00aa:
            X.1bI r1 = r11.A05
            r0 = 8
            r1.A04(r0)
            goto L_0x004d
        L_0x00b2:
            boolean r0 = r7 instanceof X.AU7
            if (r0 == 0) goto L_0x00c8
            X.AU7 r7 = (X.AU7) r7
            long r1 = r7.A00
            X.8Ig r11 = (X.C161918Ig) r11
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            X.0vb r0 = r10.A07
            java.lang.String r0 = X.C64052u8.A0B(r0, r1)
        L_0x00c4:
            r4.setText(r0)
            return
        L_0x00c8:
            boolean r0 = r7 instanceof X.AU8
            if (r0 == 0) goto L_0x008e
            X.AU8 r7 = (X.AU8) r7
            X.8Ig r11 = (X.C161918Ig) r11
            com.whatsapp.TextEmojiLabel r4 = r11.A00
            android.content.Context r3 = r10.A04
            int r2 = r7.A00
            java.lang.Object[] r1 = r7.A01
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = r3.getString(r2, r0)
            goto L_0x00c4
        L_0x00e2:
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A07
            r0.setVisibility(r1)
            com.whatsapp.wds.components.button.WDSButton r0 = r11.A08
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r6 = r11.A03
            r6.setVisibility(r5)
            android.content.Context r5 = r10.A04
            r8 = 2130970019(0x7f0405a3, float:1.7548736E38)
            r2 = 2131101150(0x7f0605de, float:1.7814702E38)
            int r4 = X.AnonymousClass1YL.A00(r5, r8, r2)
            r3 = 2131231562(0x7f08034a, float:1.8079209E38)
            java.lang.Integer r0 = r7.A04
            int r1 = r0.intValue()
            if (r1 == r9) goto L_0x012f
            r0 = 2
            if (r1 == r0) goto L_0x0121
            r0 = 4
            if (r1 == r0) goto L_0x011a
            java.lang.String r0 = ""
        L_0x0110:
            X.AnonymousClass3MX.A1C(r5, r6, r4)
            X.AnonymousClass3MY.A0v(r5, r6, r3)
            r6.setText(r0)
            return
        L_0x011a:
            r4 = 2131101148(0x7f0605dc, float:1.7814698E38)
            r0 = 2131891057(0x7f121371, float:1.9416823E38)
            goto L_0x0127
        L_0x0121:
            r4 = 2131101148(0x7f0605dc, float:1.7814698E38)
            r0 = 2131891058(0x7f121372, float:1.9416825E38)
        L_0x0127:
            java.lang.String r0 = X.C18070vi.A0F(r5, r0)
            r3 = 2131231561(0x7f080349, float:1.8079206E38)
            goto L_0x0110
        L_0x012f:
            int r4 = X.AnonymousClass1YL.A00(r5, r8, r2)
            X.9It r1 = r7.A03
            X.9It r0 = X.C179639It.A03
            if (r1 != r0) goto L_0x0142
            X.9Iv r2 = r7.A02
            X.9Iv r1 = X.C179659Iv.A06
            r0 = 2131891082(0x7f12138a, float:1.9416874E38)
            if (r2 == r1) goto L_0x0145
        L_0x0142:
            r0 = 2131891051(0x7f12136b, float:1.9416811E38)
        L_0x0145:
            java.lang.String r0 = X.C18070vi.A0F(r5, r0)
            goto L_0x0110
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C161778Hs.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new AnonymousClass8IW(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625504, false), this);
                }
                if (i != 4) {
                    List list = C42011xT.A0I;
                    return new C162108Iz(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625506, false), this.A08, this);
                }
            }
            return new C161918Ig(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625505, false), this);
        }
        List list2 = C42011xT.A0I;
        AnonymousClass1L9 r3 = this.A08;
        C36401np r6 = this.A0D;
        return new C161908If(AnonymousClass3MX.A0B(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625503, false), r3, this.A0B, this, r6);
    }

    public long A0M(int i) {
        UserJid userJid;
        boolean z = this instanceof C172648tl;
        B5D b5d = (B5D) this.A01.get(i);
        if (z) {
            if (!(b5d instanceof AU9)) {
                return 0;
            }
            userJid = ((AU9) b5d).A00.A03;
        } else if (!(b5d instanceof AUA)) {
            return 0;
        } else {
            userJid = ((AUA) b5d).A05.A04;
        }
        return (long) userJid.hashCode();
    }

    public int A0Q() {
        return this.A01.size();
    }

    public int getItemViewType(int i) {
        Object obj = this.A01.get(i);
        if (obj instanceof AUB) {
            return 1;
        }
        if (obj instanceof AUC) {
            return 3;
        }
        if (obj instanceof AU7) {
            return 2;
        }
        if (obj instanceof AU8) {
            return 4;
        }
        return 0;
    }
}
