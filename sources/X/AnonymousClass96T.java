package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.96T  reason: invalid class name */
public class AnonymousClass96T extends AnonymousClass8DX implements C22519BBc {
    public int A00;
    public View A01;
    public View A02;
    public FrameLayout A03;
    public ImageView A04;
    public ImageView A05;
    public ImageView A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass1KB A0A;
    public TextEmojiLabel A0B;
    public TextEmojiLabel A0C;
    public TextEmojiLabel A0D;
    public TextEmojiLabel A0E;
    public WaImageView A0F;
    public WaTextView A0G;
    public WaTextView A0H;
    public AnonymousClass1VW A0I;
    public AnonymousClass1M9 A0J;
    public C37451pZ A0K;
    public C27201Vd A0L;
    public AnonymousClass122 A0M;
    public AW0 A0N;
    public C18030ve A0O;
    public AnonymousClass1LU A0P;
    public C32091gc A0Q;
    public A6R A0R;
    public B8b A0S;
    public AnonymousClass1QO A0T;
    public AnonymousClass1QS A0U;
    public AQF A0V;
    public AnonymousClass1R2 A0W;
    public AnonymousClass10I A0X;
    public AnonymousClass00H A0Y;
    public String A0Z;

    private int getStatusLabel() {
        return this.A0W.A0G(this.A0N);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r1 != 200) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c5, code lost:
        if (r1 != 2) goto L_0x002d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x012e  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BDE(X.AW0 r6) {
        /*
            r5 = this;
            r5.A0N = r6
            android.content.Context r0 = r5.getContext()
            X.4ZR r3 = new X.4ZR
            r3.<init>(r0)
            X.AW0 r2 = r5.A0N
            int r1 = r2.A03
            r0 = 1
            if (r1 == r0) goto L_0x00d0
            r0 = 2
            if (r1 == r0) goto L_0x00fd
            r0 = 9
            if (r1 == r0) goto L_0x009e
            r0 = 10
            if (r1 == r0) goto L_0x00fd
            r0 = 20
            if (r1 == r0) goto L_0x00d0
            r0 = 100
            if (r1 == r0) goto L_0x00d0
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x00fd
        L_0x0029:
            X.1VW r4 = r5.A0I
            android.widget.ImageView r2 = r5.A05
        L_0x002d:
            r3 = 2131231047(0x7f080147, float:1.8078164E38)
        L_0x0030:
            r4.A09(r2, r3)
        L_0x0033:
            java.lang.String r0 = r5.getTransactionTitle()
            r2.setContentDescription(r0)
            r0 = 0
            r2.setOnClickListener(r0)
            boolean r0 = r6.A0M()
            if (r0 != 0) goto L_0x012e
            android.view.View r0 = r5.A01
            r1 = 8
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r5.A07
            r0.setVisibility(r1)
            android.widget.LinearLayout r1 = r5.A08
            r0 = 0
            r1.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r1 = r5.A0E
            java.lang.String r0 = r5.getTransactionTitle()
            r1.setText(r0)
            com.whatsapp.WaTextView r4 = r5.A0G
            android.content.Context r3 = r5.getContext()
            android.content.Context r1 = r5.getContext()
            r0 = 2131894171(0x7f121f9b, float:1.942314E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 12
            X.Ajq r1 = new X.Ajq
            r1.<init>(r0)
            java.lang.String r0 = "update-whatsapp"
            android.text.SpannableStringBuilder r0 = X.A3H.A02(r3, r1, r2, r0)
            r4.setText(r0)
            android.content.Context r1 = r5.getContext()
            android.content.Context r0 = r5.getContext()
            int r0 = X.C72463Mc.A02(r0)
            int r0 = X.C19740yt.A00(r1, r0)
            r4.setLinkTextColor(r0)
            r1 = 49
            X.AFR r0 = new X.AFR
            r0.<init>(r5, r1)
            r5.setOnClickListener(r0)
            return
        L_0x009e:
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x00c9
            X.1QS r1 = r5.A0U
            java.lang.String r0 = "P2M_LITE"
            X.AZ9 r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x00c9
        L_0x00ad:
            X.9uQ r0 = r0.BWi()
            if (r0 == 0) goto L_0x0029
            X.1VW r4 = r5.A0I
            android.widget.ImageView r2 = r5.A05
            X.AW0 r0 = r5.A0N
            int r1 = r0.A01
            r0 = 1
            r3 = 2131232006(0x7f080506, float:1.808011E38)
            if (r1 == r0) goto L_0x0030
            r0 = 2
            r3 = 2131232005(0x7f080505, float:1.8080107E38)
            if (r1 == r0) goto L_0x0030
            goto L_0x002d
        L_0x00c9:
            X.1QS r0 = r5.A0U
            X.BD1 r0 = r0.A06()
            goto L_0x00ad
        L_0x00d0:
            com.whatsapp.jid.UserJid r1 = r2.A0D
            if (r1 == 0) goto L_0x0029
            X.1M9 r0 = r5.A0J
            X.1E7 r1 = r0.A0H(r1)
            X.1pZ r0 = r5.A0K
            android.widget.ImageView r2 = r5.A05
            r0.A07(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 2131899523(0x7f123483, float:1.9433994E38)
            java.lang.String r0 = r3.A02(r0)
            r1.append(r0)
            X.AW0 r0 = r5.A0N
            com.whatsapp.jid.UserJid r0 = r0.A0D
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.AnonymousClass1Xr.A04(r2, r0)
            r0 = 46
            goto L_0x0129
        L_0x00fd:
            com.whatsapp.jid.UserJid r1 = r2.A0E
            if (r1 == 0) goto L_0x0029
            X.1M9 r0 = r5.A0J
            X.1E7 r1 = r0.A0H(r1)
            X.1pZ r0 = r5.A0K
            android.widget.ImageView r2 = r5.A05
            r0.A07(r2, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            r0 = 2131899523(0x7f123483, float:1.9433994E38)
            java.lang.String r0 = r3.A02(r0)
            r1.append(r0)
            X.AW0 r0 = r5.A0N
            com.whatsapp.jid.UserJid r0 = r0.A0E
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)
            X.AnonymousClass1Xr.A04(r2, r0)
            r0 = 47
        L_0x0129:
            X.AFR.A00(r2, r5, r0)
            goto L_0x0033
        L_0x012e:
            X.10I r1 = r5.A0X
            r0 = 13
            X.C21433Ak0.A00(r1, r5, r6, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96T.BDE(X.AW0):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void A01(X.AW0 r12, X.AnonymousClass206 r13) {
        /*
            r11 = this;
            android.view.View r0 = r11.A01
            r4 = 0
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r11.A07
            r0.setVisibility(r4)
            android.widget.LinearLayout r0 = r11.A08
            r3 = 8
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r1 = r11.A0D
            java.lang.String r0 = r11.getTransactionTitle()
            r1.setText(r0)
            X.8pG r2 = r12.A0A
            if (r2 == 0) goto L_0x00e9
            boolean r0 = r2 instanceof X.C170318pf
            if (r0 == 0) goto L_0x00e9
            r0 = r2
            X.8pf r0 = (X.C170318pf) r0
            X.77e r0 = r0.A08
            if (r0 == 0) goto L_0x00e9
            boolean r0 = X.C20061A5k.A02(r0)
            if (r0 != 0) goto L_0x00e9
            com.whatsapp.TextEmojiLabel r1 = r11.A0C
            boolean r0 = r2 instanceof X.C170318pf
            if (r0 == 0) goto L_0x00e6
            X.8pf r2 = (X.C170318pf) r2
            X.77e r0 = r2.A08
        L_0x003a:
            java.lang.Object r0 = r0.A00
            X.C17960vV.A07(r0)
            X.AnonymousClass8BR.A1E(r1, r0)
            android.widget.ImageView r0 = r11.A04
            if (r0 == 0) goto L_0x0049
            r0.setVisibility(r3)
        L_0x0049:
            if (r1 == 0) goto L_0x004e
            r1.setVisibility(r4)
        L_0x004e:
            int r1 = r12.A01
            r0 = 4
            if (r1 != r0) goto L_0x00de
            X.1QS r1 = r11.A0U
            java.lang.String r0 = "P2M_LITE"
            X.AZ9 r10 = r1.A05(r0)
            if (r10 == 0) goto L_0x00de
        L_0x005d:
            X.9nl r5 = r10.BQ8()
            android.widget.FrameLayout r6 = r11.A03
            r6.removeAllViews()
            if (r5 == 0) goto L_0x00f4
            android.content.Context r8 = r11.getContext()
            X.8pG r9 = r12.A0A
            r1 = r5
            X.8yb r1 = (X.C175368yb) r1
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            boolean r0 = r9 instanceof X.C170318pf
            r2 = 0
            if (r0 == 0) goto L_0x00b8
            X.8pf r9 = (X.C170318pf) r9
            java.lang.String r0 = r9.A0Y
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x009c
            X.18O r1 = r1.A00
            X.18R r0 = X.AnonymousClass18O.A0Z
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x009c
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131626425(0x7f0e09b9, float:1.8880086E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x009c:
            X.9ue r0 = r9.A0H
            if (r0 == 0) goto L_0x00b8
            X.9O4 r0 = r0.A0C
            if (r0 == 0) goto L_0x00b8
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x00b8
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131625668(0x7f0e06c4, float:1.887855E38)
            android.view.View r0 = r1.inflate(r0, r2)
            r7.add(r0)
        L_0x00b8:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00f4
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r8)
            X.C72473Md.A0y(r2)
            r0 = 1
            r2.setOrientation(r0)
            java.util.Iterator r1 = r7.iterator()
        L_0x00ce:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ee
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r2.addView(r0)
            goto L_0x00ce
        L_0x00de:
            X.1QS r0 = r11.A0U
            X.BD1 r10 = r0.A06()
            goto L_0x005d
        L_0x00e6:
            r0 = 0
            goto L_0x003a
        L_0x00e9:
            r11.setupTransactionMessage(r13)
            goto L_0x004e
        L_0x00ee:
            r6.addView(r2)
            r6.setVisibility(r4)
        L_0x00f4:
            if (r13 == 0) goto L_0x0266
            X.205 r0 = r13.A0v
            if (r0 == 0) goto L_0x0266
            X.1R2 r7 = r11.A0W
            X.1BI r0 = r0.A00
            if (r0 == 0) goto L_0x0263
            X.AW0 r0 = X.AnonymousClass25B.A00(r13)
            if (r0 == 0) goto L_0x0263
            X.AW0 r6 = X.AnonymousClass25B.A00(r13)
        L_0x010a:
            boolean r0 = r6.A0K()
            X.11S r1 = r7.A00
            if (r0 == 0) goto L_0x0230
            com.whatsapp.jid.UserJid r0 = r6.A0E
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x022b
            int r1 = r6.A03
            r0 = 40
            if (r1 != r0) goto L_0x012e
            int r1 = r6.A02
            r0 = 401(0x191, float:5.62E-43)
            if (r1 == r0) goto L_0x0226
            r0 = 417(0x1a1, float:5.84E-43)
            if (r1 == r0) goto L_0x0226
            r0 = 418(0x1a2, float:5.86E-43)
            if (r1 == r0) goto L_0x0226
        L_0x012e:
            r1 = 2131893988(0x7f121ee4, float:1.9422768E38)
        L_0x0131:
            android.widget.ImageView r6 = r11.A06
            r6.setVisibility(r3)
            if (r1 == 0) goto L_0x021e
            com.whatsapp.WaTextView r0 = r11.A0H
            r0.setText(r1)
            r0.setVisibility(r4)
            X.1QO r1 = r11.A0T
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x014e
            boolean r0 = r1.A0B()
            if (r0 == 0) goto L_0x0179
        L_0x014e:
            int r1 = r12.A03
            r0 = 100
            if (r1 == r0) goto L_0x0212
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto L_0x0212
            r2 = 2131231949(0x7f0804cd, float:1.8079993E38)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r11)
            r0 = 2131168241(0x7f070bf1, float:1.7950778E38)
        L_0x0162:
            int r1 = X.AnonymousClass3MW.A01(r1, r0)
            r6.setVisibility(r4)
            android.content.Context r0 = r11.getContext()
            X.AnonymousClass3MX.A1B(r0, r6, r2)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            r0.width = r1
            X.AnonymousClass3MX.A1F(r6, r1)
        L_0x0179:
            r11.setupRowButtons(r13, r5)
            com.whatsapp.TextEmojiLabel r6 = r11.A0B
            java.lang.CharSequence r0 = r11.getAmountText()
            r6.setText(r0)
            X.9iW r0 = r10.BWT()
            boolean r0 = r0.A00(r12)
            if (r0 == 0) goto L_0x01df
            X.AnonymousClass9RK.A00(r6)
        L_0x0192:
            int r1 = r11.getStatusColor()
            int r0 = r11.getStatusLabel()
            android.widget.TextView r5 = r11.A09
            if (r0 == 0) goto L_0x01db
            r5.setText(r0)
            r5.setTextColor(r1)
            r5.setVisibility(r4)
        L_0x01a7:
            int r1 = r12.A03
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 != r0) goto L_0x01ca
            r6.setVisibility(r3)
            X.AQF r2 = r11.A0V
            java.lang.String r1 = r12.A0K
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01d4
            r1 = 0
        L_0x01bb:
            android.view.View r0 = r11.A02
            if (r1 == 0) goto L_0x01cb
            r0.setVisibility(r3)
            com.whatsapp.WaImageView r0 = r11.A0F
            r0.setVisibility(r4)
        L_0x01c7:
            r5.setVisibility(r3)
        L_0x01ca:
            return
        L_0x01cb:
            r0.setVisibility(r4)
            com.whatsapp.WaImageView r0 = r11.A0F
            r0.setVisibility(r3)
            goto L_0x01c7
        L_0x01d4:
            java.util.HashSet r0 = r2.A00
            boolean r1 = r0.contains(r1)
            goto L_0x01bb
        L_0x01db:
            r5.setVisibility(r3)
            goto L_0x01a7
        L_0x01df:
            int r0 = r6.getPaintFlags()
            r0 = r0 & -17
            r6.setPaintFlags(r0)
            boolean r0 = r12.A0J()
            if (r0 != 0) goto L_0x01ff
            boolean r0 = X.AW0.A00(r12)
            if (r0 != 0) goto L_0x01ff
            android.content.Context r5 = r11.getContext()
            r0 = 2131102145(0x7f0609c1, float:1.781672E38)
        L_0x01fb:
            X.AnonymousClass3MX.A1C(r5, r6, r0)
            goto L_0x0192
        L_0x01ff:
            android.content.Context r5 = r11.getContext()
            android.content.Context r2 = r11.getContext()
            r1 = 2130971198(0x7f040a3e, float:1.7551128E38)
            r0 = 2131102533(0x7f060b45, float:1.7817507E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            goto L_0x01fb
        L_0x0212:
            r2 = 2131232303(0x7f08062f, float:1.8080711E38)
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r11)
            r0 = 2131168240(0x7f070bf0, float:1.7950776E38)
            goto L_0x0162
        L_0x021e:
            com.whatsapp.WaTextView r1 = r11.A0H
            r0 = 4
            r1.setVisibility(r0)
            goto L_0x0179
        L_0x0226:
            r1 = 2131893712(0x7f121dd0, float:1.9422208E38)
            goto L_0x0131
        L_0x022b:
            r1 = 2131893711(0x7f121dcf, float:1.9422206E38)
            goto L_0x0131
        L_0x0230:
            com.whatsapp.jid.UserJid r0 = r6.A0D
            boolean r2 = r1.A0O(r0)
            X.1QO r1 = r7.A09
            boolean r0 = r1.A0E()
            if (r0 != 0) goto L_0x024e
            boolean r0 = r1.A0B()
            if (r0 != 0) goto L_0x024e
            r1 = 2131893713(0x7f121dd1, float:1.942221E38)
            if (r2 == 0) goto L_0x0131
            r1 = 2131894101(0x7f121f55, float:1.9422997E38)
            goto L_0x0131
        L_0x024e:
            int r1 = r6.A03
            r0 = 100
            if (r1 != r0) goto L_0x0259
            r1 = 2131894098(0x7f121f52, float:1.9422991E38)
            goto L_0x0131
        L_0x0259:
            r1 = 2131894100(0x7f121f54, float:1.9422995E38)
            if (r2 == 0) goto L_0x0131
            r1 = 2131894099(0x7f121f53, float:1.9422993E38)
            goto L_0x0131
        L_0x0263:
            r1 = 0
            goto L_0x0131
        L_0x0266:
            X.1R2 r7 = r11.A0W
            X.AW0 r6 = r11.A0N
            goto L_0x010a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass96T.A01(X.AW0, X.206):void");
    }

    public void CEO() {
        AW0 aw0 = this.A0N;
        if (aw0 != null && this.A0S != null) {
            BDE(aw0);
        }
    }

    public CharSequence getAmountText() {
        String A0T2;
        Context context;
        int i;
        C20274AEh A0C2;
        int i2;
        ARR arr;
        Context context2;
        int i3;
        AW0 aw0 = this.A0N;
        AnonymousClass8pG r0 = aw0.A0A;
        if (r0 == null || (A0C2 = r0.A0C()) == null || (i2 = A0C2.A01) <= 1 || (arr = A0C2.A02) == null) {
            A0T2 = this.A0W.A0T(aw0);
            if (!this.A0N.A0K()) {
                int i4 = this.A0N.A03;
                if (i4 == 1 || i4 == 100) {
                    context = getContext();
                    i = 2131893870;
                } else if (i4 == 2 || i4 == 200) {
                    context = getContext();
                    i = 2131893869;
                }
                A0T2 = C17890vO.A0R(context, A0T2, 1, 0, i);
            }
        } else {
            AnonymousClass1R2 r02 = this.A0W;
            C17960vV.A07(arr);
            A0T2 = arr.A01.BLc(r02.A05, arr.A02);
            if (!this.A0N.A0K()) {
                int i5 = this.A0N.A03;
                if (i5 == 1 || i5 == 100) {
                    context2 = getContext();
                    i3 = 2131893757;
                } else if (i5 == 2 || i5 == 200) {
                    context2 = getContext();
                    i3 = 2131897003;
                }
                Object[] objArr = new Object[2];
                C17880vN.A1S(objArr, i2, 0);
                A0T2 = C17880vN.A0q(context2, A0T2, objArr, 1, i3);
            }
        }
        synchronized (this.A0N) {
        }
        getContext();
        return A0T2;
    }

    public String getTransactionTitle() {
        return this.A0W.A0a(this.A0N, false);
    }

    public void setupTransactionMessage(AnonymousClass206 r8) {
        ImageView imageView;
        TextEmojiLabel textEmojiLabel;
        int i;
        if (!(r8 instanceof AnonymousClass210) || TextUtils.isEmpty(r8.A0P())) {
            C18030ve r2 = this.A0O;
            C18040vf r1 = C18040vf.A02;
            if ((C18020vd.A05(r1, r2, 812) || C18020vd.A05(r1, r2, 811)) && (r8 instanceof C441322g)) {
                imageView = this.A04;
                if (imageView != null) {
                    AnonymousClass4aX.A0B(getContext(), imageView, 2131232328, 2131101888);
                }
                textEmojiLabel = this.A0C;
                textEmojiLabel.setText(2131893742);
                i = 0;
            } else {
                ImageView imageView2 = this.A04;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                TextEmojiLabel textEmojiLabel2 = this.A0C;
                if (textEmojiLabel2 != null) {
                    textEmojiLabel2.setVisibility(8);
                    return;
                }
                return;
            }
        } else {
            SpannableStringBuilder A092 = AnonymousClass3MW.A09(r8.A0P());
            this.A0Q.A06(getContext(), A092, r8.A0v.A00, r8.A0h, true);
            textEmojiLabel = this.A0C;
            textEmojiLabel.A0R(A092);
            imageView = this.A04;
            i = 8;
        }
        if (imageView != null) {
            imageView.setVisibility(i);
        }
        textEmojiLabel.setVisibility(0);
    }

    public AnonymousClass96T(Context context, B8b b8b, int i) {
        this(context);
        String str;
        this.A0S = b8b;
        if (i == 2) {
            str = "payment_home";
        } else if (i == 3) {
            str = "payment_transaction_history";
        } else if (i != 4) {
            str = "unknown";
        } else {
            str = "mandate_payment_screen";
        }
        this.A0Z = str;
        this.A00 = i;
    }

    public B8b getCallback() {
        return this.A0S;
    }

    public int getLayoutResourceId() {
        return 2131626424;
    }

    public int getStatusColor() {
        return C19740yt.A00(getContext(), AnonymousClass1R2.A01(this.A0N));
    }

    public void setCallback(B8b b8b) {
        this.A0S = b8b;
    }

    public void setLoggingScreenName(String str) {
        this.A0Z = str;
    }

    public void setupRowButtons(AnonymousClass206 r15, C192079nl r16) {
        Button button = (Button) AnonymousClass1HF.A06(this, 2131427371);
        A6R a6r = this.A0R;
        View view = this.A01;
        B8b b8b = this.A0S;
        AW0 aw0 = this.A0N;
        String str = this.A0Z;
        view.setVisibility(8);
        if (aw0.A0I()) {
            UserJid userJid = aw0.A0D;
            View A062 = AnonymousClass1HF.A06(view, 2131434581);
            View A063 = AnonymousClass1HF.A06(view, 2131434597);
            if (userJid != null && !A6R.A02(aw0, a6r) && !aw0.A0P) {
                A062.setVisibility(8);
                A063.setVisibility(8);
            }
            view.setVisibility(8);
        } else if (aw0.A02 == 102) {
            A6R.A00(view, button, aw0, a6r);
        } else {
            a6r.A05(view, (Button) null, aw0, r16, b8b, r15, str, false);
        }
    }

    public AnonymousClass96T(Context context) {
        super(context);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O2 = AnonymousClass3MW.A0O(generatedComponent());
            this.A0O = AnonymousClass10E.A8r(A0O2);
            this.A0A = AnonymousClass10E.A12(A0O2);
            this.A0Q = (C32091gc) A0O2.A6G.get();
            this.A0P = AnonymousClass3MY.A0Z(A0O2);
            this.A0X = AnonymousClass10E.AL1(A0O2);
            this.A0L = AnonymousClass3MZ.A0i(A0O2);
            this.A0I = AnonymousClass3MZ.A0e(A0O2);
            this.A0J = AnonymousClass10E.A4z(A0O2);
            this.A0U = AnonymousClass3MZ.A0z(A0O2);
            this.A0M = AnonymousClass3MZ.A0n(A0O2);
            this.A0W = AnonymousClass8BU.A0V(A0O2);
            this.A0T = AnonymousClass3Ma.A0q(A0O2);
            this.A0Y = C000200d.A00(A0O2.A86);
            AnonymousClass10G r1 = A0O2.A00;
            this.A0R = (A6R) r1.AEW.get();
            this.A0V = (AQF) r1.A3k.get();
        }
        AnonymousClass3MZ.A0D(this).inflate(2131626424, this, true);
        setOrientation(1);
        AnonymousClass3MY.A0v(getContext(), this, 2131232942);
        this.A05 = AnonymousClass3MW.A0H(this, 2131436359);
        this.A0D = AnonymousClass3MX.A0W(this, 2131436373);
        this.A04 = AnonymousClass3MW.A0H(this, 2131432690);
        this.A0C = AnonymousClass3MX.A0W(this, 2131436369);
        this.A0B = AnonymousClass3MX.A0W(this, 2131436339);
        this.A09 = C17880vN.A0E(this, 2131436378);
        this.A02 = findViewById(2131436377);
        this.A06 = AnonymousClass3MW.A0H(this, 2131436478);
        this.A0H = (WaTextView) findViewById(2131434615);
        this.A01 = findViewById(2131427485);
        this.A07 = AnonymousClass8BR.A0A(this, 2131436375);
        this.A0F = (WaImageView) findViewById(2131436367);
        this.A03 = (FrameLayout) findViewById(2131429749);
        this.A08 = AnonymousClass8BR.A0A(this, 2131436376);
        this.A0E = AnonymousClass3MX.A0W(this, 2131436374);
        this.A0G = (WaTextView) findViewById(2131436368);
        this.A0K = this.A0L.A05(getContext(), "peer-payment-transaction-row");
        this.A0C.setTextDirection(5);
        AnonymousClass4aX.A0D(this.A0F, AnonymousClass3MZ.A02(getContext(), getContext(), 2130970707, 2131102119));
        setOnClickListener(new AFR(this, 48));
    }
}
