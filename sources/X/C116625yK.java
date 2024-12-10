package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.contact.picker.ContactPickerFragment;
import java.util.List;

/* renamed from: X.5yK  reason: invalid class name and case insensitive filesystem */
public class C116625yK extends C110225f8 {
    public AnonymousClass1XU A00;
    public AnonymousClass1XU A01;
    public List A02 = AnonymousClass000.A13();
    public boolean A03 = false;
    public final ContactPickerFragment A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final C25841Pv A07;
    public final AnonymousClass1VD A08;
    public final C24641Lc A09;
    public final C25831Pu A0A;
    public final AnonymousClass1PU A0B;
    public final AnonymousClass72B A0C;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r0 == false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View A00(android.view.ViewGroup r4) {
        /*
            r3 = this;
            com.whatsapp.contact.picker.ContactPickerFragment r1 = r3.A04
            android.view.LayoutInflater r2 = r1.A16()
            boolean r0 = r1.A2t()
            if (r0 == 0) goto L_0x0014
            r1 = 2131624679(0x7f0e02e7, float:1.8876545E38)
        L_0x000f:
            android.view.View r0 = X.AnonymousClass3MX.A09(r2, r4, r1)
            return r0
        L_0x0014:
            boolean r0 = r1.A2u()
            if (r0 == 0) goto L_0x001e
            r1 = 2131624680(0x7f0e02e8, float:1.8876547E38)
            goto L_0x000f
        L_0x001e:
            boolean r0 = r1.A3S
            if (r0 != 0) goto L_0x0026
            boolean r0 = r1.A3c
            if (r0 == 0) goto L_0x0033
        L_0x0026:
            X.0ve r1 = r1.A1U
            r0 = 11470(0x2cce, float:1.6073E-41)
            boolean r0 = X.C36301nf.A01(r1, r0)
            r1 = 2131624682(0x7f0e02ea, float:1.887655E38)
            if (r0 != 0) goto L_0x000f
        L_0x0033:
            r1 = 2131624676(0x7f0e02e4, float:1.8876538E38)
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116625yK.A00(android.view.ViewGroup):android.view.View");
    }

    public static void A01(Context context, C131076kT r4) {
        TextEmojiLabel textEmojiLabel = r4.A0D;
        textEmojiLabel.setVisibility(0);
        textEmojiLabel.A0L();
        C72463Mc.A0y(context, textEmojiLabel, 2130970340, 2131101312);
        r4.A07.setVisibility(8);
        r4.A02.setVisibility(8);
        r4.A0B.setVisibility(8);
        r4.A0C.setVisibility(8);
        r4.A0A.setVisibility(8);
        r4.A09.setVisibility(8);
    }

    public static void A02(Context context, C131076kT r4, int i) {
        TextEmojiLabel textEmojiLabel = r4.A0D;
        textEmojiLabel.setVisibility(0);
        int A002 = AnonymousClass3Ma.A00(context, 2130970337, 2131101306);
        textEmojiLabel.setText(i);
        textEmojiLabel.setTextColor(A002);
        textEmojiLabel.A0K();
        r4.A0E.A01.setTextColor(A002);
        r4.A06.setAlpha(0.5f);
    }

    private void A04(C1599786p r7, C131076kT r8, AnonymousClass1E7 r9) {
        String str;
        C46162Dk r1;
        ContactPickerFragment contactPickerFragment = this.A04;
        if (!(r7 instanceof AnonymousClass7EG) || !r9.A0C()) {
            if (!C22971Dz.A0V(r9.A0J) || (r1 = (C46162Dk) contactPickerFragment.A1F.A0A(r9.A0J)) == null || !r1.A0P()) {
                if (C18020vd.A05(C18040vf.A02, contactPickerFragment.A1U, 5839)) {
                    str = AnonymousClass72Y.A01(contactPickerFragment.A1n(), contactPickerFragment.A16, r9);
                } else {
                    String str2 = r9.A0Z;
                    str = "  ";
                    if (str2 != null) {
                        str = C17900vP.A0A(str2, str);
                    }
                }
            } else {
                AnonymousClass4XM r0 = (AnonymousClass4XM) contactPickerFragment.A2g.get();
                int A002 = AnonymousClass4XM.A00(r0, (int) r1.A0G);
                String A012 = r0.A01(A002);
                C18070vi.A0d(A012, 1);
                str = AnonymousClass3MZ.A09(contactPickerFragment).getQuantityString(2131755282, A002, AnonymousClass000.A1b(A012, 1));
            }
        } else if (TextUtils.isEmpty(r9.A0L())) {
            str = "";
        } else {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("~ ");
            str = AnonymousClass000.A0y(r9.A0L(), A10);
        }
        if (C18020vd.A05(C18040vf.A02, this.A06, 5839)) {
            A03(r8.A0D, str);
            return;
        }
        TextEmojiLabel textEmojiLabel = r8.A0D;
        textEmojiLabel.A0R(str);
        textEmojiLabel.setVisibility(C72453Mb.A01(AnonymousClass1EG.A0H(str) ? 1 : 0));
    }

    public int getCount() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A02.get(i);
    }

    public C116625yK(ContactPickerFragment contactPickerFragment, AnonymousClass11P r3, C18030ve r4, C25841Pv r5, AnonymousClass1VD r6, C24641Lc r7, C25831Pu r8, AnonymousClass1PU r9, AnonymousClass72B r10) {
        this.A04 = contactPickerFragment;
        this.A05 = r3;
        this.A06 = r4;
        this.A0B = r9;
        this.A07 = r5;
        this.A0C = r10;
        this.A09 = r7;
        this.A08 = r6;
        this.A0A = r8;
    }

    public static void A03(TextEmojiLabel textEmojiLabel, String str) {
        if (!AnonymousClass1EG.A0H(str)) {
            textEmojiLabel.A0R(str);
            textEmojiLabel.setVisibility(0);
            textEmojiLabel.setMaxLines(1);
            textEmojiLabel.setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        textEmojiLabel.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:107:0x034e, code lost:
        if (r9.A3c != false) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x079d, code lost:
        if (r7.A11 == false) goto L_0x080e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0892, code lost:
        if (r13 != false) goto L_0x06e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x08cc, code lost:
        if (r12 == false) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0a3c, code lost:
        if (r9.A3L != false) goto L_0x0a3e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:437:0x0bc0, code lost:
        if (r6.A3c != false) goto L_0x0bc2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x0bdd, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r2.A06, 6741) == 1) goto L_0x0bdf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x060b  */
    /* JADX WARNING: Removed duplicated region for block: B:449:0x0bea  */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0c84  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0cca  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0cd5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r31, android.view.View r32, android.view.ViewGroup r33) {
        /*
            r30 = this;
            r3 = r32
            r2 = r30
            java.util.List r0 = r2.A02
            r1 = r31
            java.lang.Object r5 = r0.get(r1)
            X.86p r5 = (X.C1599786p) r5
            boolean r0 = r5 instanceof X.AnonymousClass7EJ
            r4 = 8
            r12 = 1
            r1 = 0
            r6 = r33
            if (r0 == 0) goto L_0x007b
            X.0ve r0 = r2.A06
            boolean r7 = X.AnonymousClass1J8.A05(r0)
            if (r32 != 0) goto L_0x0036
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r2.A04
            android.view.LayoutInflater r3 = r0.A16()
            r0 = 2131625857(0x7f0e0781, float:1.8878934E38)
            if (r7 == 0) goto L_0x002e
            r0 = 2131625858(0x7f0e0782, float:1.8878936E38)
        L_0x002e:
            android.view.View r3 = r3.inflate(r0, r6, r1)
            r0 = 2
            r3.setImportantForAccessibility(r0)
        L_0x0036:
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r6 = r3.findViewById(r0)
            if (r7 == 0) goto L_0x0065
            com.whatsapp.wds.components.list.header.WDSSectionHeader r6 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r6
            X.7EJ r5 = (X.AnonymousClass7EJ) r5
            java.lang.String r0 = r5.A00
            r6.setHeaderText((java.lang.String) r0)
            X.6tF r0 = r6.A03
            if (r0 == 0) goto L_0x0055
            com.whatsapp.WaTextView r0 = r0.A00()
            if (r0 == 0) goto L_0x0055
            X.AnonymousClass1Y5.A0A(r0, r12)
        L_0x0055:
            r0 = 2131429399(0x7f0b0817, float:1.848047E38)
            android.view.View r1 = r3.findViewById(r0)
            boolean r0 = r5.A01
            if (r0 == 0) goto L_0x0061
            r4 = 0
        L_0x0061:
            r1.setVisibility(r4)
        L_0x0064:
            return r3
        L_0x0065:
            android.widget.TextView r6 = (android.widget.TextView) r6
            X.C43421zm.A04(r6)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r2.A04
            boolean r0 = r0.A3U
            if (r0 == 0) goto L_0x0073
            r6.setSingleLine(r1)
        L_0x0073:
            X.7EJ r5 = (X.AnonymousClass7EJ) r5
            java.lang.String r0 = r5.A00
            r6.setText(r0)
            goto L_0x0055
        L_0x007b:
            boolean r0 = r5 instanceof X.AnonymousClass7EF
            if (r0 == 0) goto L_0x00a0
            if (r32 != 0) goto L_0x0095
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r2.A04
            android.view.LayoutInflater r3 = r0.A16()
            r0 = 2131625851(0x7f0e077b, float:1.8878922E38)
            android.view.View r3 = r3.inflate(r0, r6, r1)
            android.widget.TextView r0 = X.C108975cc.A0C(r3)
            X.C43421zm.A04(r0)
        L_0x0095:
            r0 = 26
        L_0x0097:
            X.4dN r1 = new X.4dN
            r1.<init>(r2, r5, r0)
        L_0x009c:
            r3.setOnClickListener(r1)
            return r3
        L_0x00a0:
            boolean r0 = r5 instanceof X.AnonymousClass7E8
            if (r0 == 0) goto L_0x00ec
            if (r32 != 0) goto L_0x00b7
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r2.A04
            android.view.LayoutInflater r3 = r0.A16()
            r0 = 2131625850(0x7f0e077a, float:1.887892E38)
            android.view.View r3 = r3.inflate(r0, r6, r1)
            r0 = 2
            r3.setImportantForAccessibility(r0)
        L_0x00b7:
            com.whatsapp.contact.picker.ContactPickerFragment r7 = r2.A04
            X.1PR r0 = r7.A1S
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r4 = X.C18070vi.A03(r0)
            java.lang.String r0 = "disappearing_mode_duration_for_chat_picker_int"
            int r6 = r4.getInt(r0, r1)
            r0 = 2131430496(0x7f0b0c60, float:1.8482695E38)
            android.view.View r5 = r3.findViewById(r0)
            com.whatsapp.settings.SettingsRowIconText r5 = (com.whatsapp.settings.SettingsRowIconText) r5
            X.1FL r4 = r7.A1B()
            if (r4 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            X.1zj r0 = X.C43391zj.A00
            java.lang.String r0 = r0.A09(r4, r6, r1, r1)
            r5.setSubText((java.lang.CharSequence) r0)
        L_0x00e1:
            r0 = 12
            X.4dX r4 = new X.4dX
            r4.<init>(r2, r6, r0)
        L_0x00e8:
            r3.setOnClickListener(r4)
            return r3
        L_0x00ec:
            boolean r0 = r5 instanceof X.AnonymousClass7E9
            if (r0 == 0) goto L_0x0105
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r2.A04
            android.view.LayoutInflater r3 = r0.A16()
            r0 = 2131625853(0x7f0e077d, float:1.8878926E38)
            android.view.View r3 = r3.inflate(r0, r6, r1)
            r0 = 29
            X.783 r1 = new X.783
            r1.<init>(r2, r0)
            goto L_0x009c
        L_0x0105:
            boolean r0 = r5 instanceof X.AnonymousClass7EC
            if (r0 == 0) goto L_0x0135
            if (r32 != 0) goto L_0x0064
            android.view.View r3 = r2.A00(r6)
            com.whatsapp.contact.picker.ContactPickerFragment r0 = r2.A04
            android.content.Context r6 = r0.A1n()
            r4 = 2130970525(0x7f04079d, float:1.7549763E38)
            r0 = 2131102246(0x7f060a26, float:1.7816925E38)
            int r7 = X.AnonymousClass1YL.A00(r6, r4, r0)
            r0 = 34
            X.48h r4 = new X.48h
            r4.<init>(r2, r5, r0)
            r6 = 2131232296(0x7f080628, float:1.8080697E38)
            r8 = 2131231237(0x7f080205, float:1.807855E38)
            r9 = 2131888804(0x7f120aa4, float:1.9412254E38)
            r5 = r3
            r10 = r1
            X.C88554a7.A04(r5, r6, r7, r8, r9, r10)
            goto L_0x00e8
        L_0x0135:
            boolean r0 = r5 instanceof X.C116455xK
            if (r0 != 0) goto L_0x0ce4
            boolean r0 = r5 instanceof X.C116445xJ
            if (r0 != 0) goto L_0x0ce4
            boolean r0 = r5 instanceof X.AnonymousClass7EE
            if (r0 == 0) goto L_0x014d
            X.7EE r5 = (X.AnonymousClass7EE) r5
            int r0 = r5.A00
            android.view.View r3 = X.C88554a7.A00(r0, r6)
            r0 = 27
            goto L_0x0097
        L_0x014d:
            if (r32 == 0) goto L_0x0bb1
            java.lang.Object r0 = r3.getTag()
            boolean r0 = r0 instanceof X.C131076kT
            if (r0 == 0) goto L_0x0bb1
            java.lang.Object r0 = r3.getTag()
            X.6kT r0 = (X.C131076kT) r0
        L_0x015d:
            r3.setClickable(r1)
            r3.setLongClickable(r1)
            android.widget.ImageView r6 = r0.A04
            r29 = r6
            r6.setVisibility(r4)
            android.view.View r13 = r0.A00
            r13.setVisibility(r4)
            android.widget.TextView r6 = r0.A0A
            r28 = r6
            r6.setVisibility(r4)
            boolean r6 = r5 instanceof X.AnonymousClass7ED
            r10 = 0
            if (r6 == 0) goto L_0x020e
            r8 = r5
            X.7ED r8 = (X.AnonymousClass7ED) r8
            r6 = 2
            r3.setImportantForAccessibility(r6)
            r3.setBackgroundResource(r1)
            r6 = r28
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A0C
            r6.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r6 = r0.A0D
            r6.setVisibility(r4)
            android.widget.ImageView r7 = r0.A06
            r6 = 4
            r7.setVisibility(r6)
            X.1xh r6 = r0.A0E
            com.whatsapp.TextEmojiLabel r13 = r6.A01
            r13.A0L()
            java.lang.String r6 = r8.A00
            r13.setText(r6)
            com.whatsapp.contact.picker.ContactPickerFragment r9 = r2.A04
            android.content.Context r12 = r9.A1n()
            android.content.Context r11 = r9.A1n()
            r8 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r6 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.C72463Mc.A0w(r11, r12, r13, r8, r6)
            com.whatsapp.components.SelectionCheckView r6 = r0.A0F
            r6.A04(r1, r1)
            android.widget.ImageView r6 = r0.A07
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A09
            r6.setVisibility(r4)
            android.widget.ImageView r6 = r0.A02
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A0B
            r6.setVisibility(r4)
            android.view.View r6 = r0.A01
            r6.setOnClickListener(r10)
            r7.setOnClickListener(r10)
            r6.setClickable(r1)
            r7.setClickable(r1)
        L_0x01e0:
            boolean r6 = r9.A2s()
            if (r6 == 0) goto L_0x0204
            X.1E7 r6 = r5.getContact()
            if (r6 == 0) goto L_0x0208
            X.1E7 r5 = r5.getContact()
            boolean r5 = r5.A0O()
            if (r5 == 0) goto L_0x0208
            X.0ve r2 = r2.A06
            int r2 = X.C196929vs.A01(r2)
            android.widget.ImageView r0 = r0.A05
            r0.setImageResource(r2)
            r0.setVisibility(r1)
        L_0x0204:
            X.AnonymousClass1HF.A0f(r3, r10)
            return r3
        L_0x0208:
            android.widget.ImageView r0 = r0.A05
            r0.setVisibility(r4)
            goto L_0x0204
        L_0x020e:
            boolean r6 = r5 instanceof X.AnonymousClass7EI
            r3.setImportantForAccessibility(r12)
            com.whatsapp.contact.picker.ContactPickerFragment r9 = r2.A04
            if (r6 == 0) goto L_0x02b9
            X.1FL r13 = r9.A1B()
            X.1xh r6 = r0.A0E
            com.whatsapp.TextEmojiLabel r7 = r6.A01
            X.C43421zm.A04(r7)
            r8 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r6 = 2131101314(0x7f060682, float:1.7815034E38)
            X.C72463Mc.A0y(r13, r7, r8, r6)
            com.whatsapp.TextEmojiLabel r8 = r0.A0D
            r8.A0L()
            r11 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r6 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0y(r13, r8, r11, r6)
            android.widget.ImageView r6 = r0.A02
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A0B
            r6.setVisibility(r4)
            r6 = r28
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A09
            r6.setVisibility(r4)
            r6 = 2131886451(0x7f120173, float:1.9407481E38)
            r7.setText(r6)
            r7.A0N()
            android.widget.TextView r6 = r0.A0C
            r6.setVisibility(r1)
            X.AnonymousClass3MW.A1S(r6)
            r6 = 2131231682(0x7f0803c2, float:1.8079452E38)
            android.graphics.drawable.Drawable r6 = X.C24261Jm.A00(r13, r6)
            android.graphics.drawable.Drawable r11 = X.C27831Xu.A02(r6)
            r7 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r6 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r6 = X.AnonymousClass3Ma.A00(r13, r7, r6)
            X.C27831Xu.A0C(r11, r6)
            android.widget.ImageView r6 = r0.A07
            r6.setVisibility(r1)
            r6.setImageDrawable(r11)
            r6.setFocusable(r1)
            r6.setClickable(r1)
            r6.setBackground(r10)
            r6.setBackground(r10)
            android.widget.ImageView r7 = r0.A06
            r6 = 2131231235(0x7f080203, float:1.8078545E38)
            r7.setImageResource(r6)
            r6 = 2131886450(0x7f120172, float:1.940748E38)
            r8.setText(r6)
            boolean r6 = r9.A2u()
            if (r6 != 0) goto L_0x02a1
            r3.setPadding(r1, r1, r1, r1)
        L_0x02a1:
            boolean r6 = r2.A03
            if (r6 != 0) goto L_0x01e0
            r2.A03 = r12
            X.0zA r7 = r9.A0I
            boolean r6 = r7.A07()
            if (r6 == 0) goto L_0x01e0
            r7.A03()
            java.lang.String r0 = "logEntrypointImpression"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x02b9:
            X.1FL r8 = r9.A1B()
            X.1E7 r7 = r5.getContact()
            X.C17960vV.A07(r7)
            android.widget.ImageView r11 = r0.A06
            r11.setVisibility(r1)
            r11.setEnabled(r12)
            boolean r6 = r9.A2u()
            if (r6 != 0) goto L_0x02da
            android.widget.ImageView r12 = r0.A07
            r6 = 2131232942(0x7f0808ae, float:1.8082007E38)
            X.AnonymousClass3MY.A0v(r8, r12, r6)
        L_0x02da:
            X.0ve r6 = r2.A06
            r27 = r6
            boolean r14 = X.AnonymousClass1J8.A09(r27)
            X.1xh r6 = r0.A0E
            r19 = r6
            r12 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r6 = 2131101314(0x7f060682, float:1.7815034E38)
            if (r14 == 0) goto L_0x02f4
            r12 = 2130971979(0x7f040d4b, float:1.7552712E38)
            r6 = 2131103154(0x7f060db2, float:1.7818766E38)
        L_0x02f4:
            int r12 = X.AnonymousClass3Ma.A00(r8, r12, r6)
            r6 = r19
            com.whatsapp.TextEmojiLabel r6 = r6.A01
            r26 = r6
            r6.setTextColor(r12)
            X.02B r6 = r9.A0E
            if (r6 != 0) goto L_0x0b9f
            X.1BI r6 = r7.A0J
            boolean r6 = X.C22971Dz.A0a(r6)
            if (r6 != 0) goto L_0x0b9f
            boolean r6 = r9.A3V
            if (r6 != 0) goto L_0x0315
            boolean r6 = r9.A3M
            if (r6 == 0) goto L_0x0b9f
        L_0x0315:
            r12 = 11563(0x2d2b, float:1.6203E-41)
            r6 = r27
            boolean r6 = X.C36301nf.A01(r6, r12)
            if (r6 != 0) goto L_0x0b9f
            r6 = 13
            X.48j r12 = new X.48j
            r12.<init>(r7, r11, r2, r6)
            android.view.View r6 = r0.A01
            r25 = r6
            r6.setOnClickListener(r12)
            r11.setOnClickListener(r12)
            X.1Me r6 = r9.A0k
            java.lang.String r6 = r6.A0I(r7)
            r11.setContentDescription(r6)
        L_0x0339:
            boolean r6 = r5 instanceof X.C116555xy
            r18 = r6
            if (r6 == 0) goto L_0x0ab3
            r6 = r5
            X.5xy r6 = (X.C116555xy) r6
            r17 = r6
            boolean r6 = r9.A3V
            r15 = r6
            boolean r6 = r9.A3S
            if (r6 != 0) goto L_0x0350
            boolean r6 = r9.A3c
            r14 = 0
            if (r6 == 0) goto L_0x0351
        L_0x0350:
            r14 = 1
        L_0x0351:
            r6 = r17
            java.util.List r6 = r6.A00
            r16 = r6
            int r12 = r16.size()
            r6 = 1
            if (r12 <= r6) goto L_0x0aac
            android.content.Context r12 = r9.A1n()
            X.0vb r6 = r9.A19
            java.lang.String r12 = X.C24921Me.A02(r12, r6, r7)
            r6 = r28
            r6.setText(r12)
            r13 = 2130969198(0x7f04026e, float:1.7547071E38)
            r12 = 2131100214(0x7f060236, float:1.7812803E38)
            X.C72463Mc.A0y(r8, r6, r13, r12)
            r6.setVisibility(r1)
        L_0x0379:
            android.widget.LinearLayout r6 = r0.A08
            r6.setVisibility(r1)
            android.widget.TextView r12 = r0.A0B
            r12.setVisibility(r1)
            r12.setClickable(r1)
            r12.setFocusable(r1)
            android.widget.ImageView r6 = r0.A07
            r6.setVisibility(r4)
            android.widget.ImageView r6 = r0.A02
            r6.setVisibility(r4)
            if (r15 != 0) goto L_0x03a4
            if (r14 == 0) goto L_0x0a9e
            X.0vf r6 = X.C18040vf.A02
            r14 = 6741(0x1a55, float:9.446E-42)
            r13 = r27
            int r13 = X.C18020vd.A00(r6, r13, r14)
            r6 = 1
            if (r13 != r6) goto L_0x0a9e
        L_0x03a4:
            com.whatsapp.TextEmojiLabel r6 = r0.A0D
            r6.setVisibility(r4)
            r6 = r28
            r6.setVisibility(r4)
            int r13 = r16.size()
            r15 = 24
            r6 = 1
            if (r13 <= r6) goto L_0x0aa5
            r6 = 37
            X.4dV r14 = new X.4dV
            r13 = r17
            r14.<init>((java.lang.Object) r2, (java.lang.Object) r7, (java.lang.Object) r13, (int) r6)
        L_0x03c0:
            r12.setOnClickListener(r14)
            android.widget.TextView r6 = r0.A0C
            r6.setVisibility(r4)
            X.C43421zm.A04(r12)
        L_0x03cb:
            boolean r6 = r5 instanceof X.AnonymousClass7EG
            if (r6 == 0) goto L_0x03e7
            X.1E7 r6 = r5.getContact()
            X.C17960vV.A07(r6)
            boolean r6 = r6.A0C()
            if (r6 == 0) goto L_0x03e7
            r6 = r28
            r6.setVisibility(r1)
            r12 = 2131891572(0x7f121574, float:1.9417868E38)
            r6.setText(r12)
        L_0x03e7:
            boolean r6 = X.AnonymousClass1J8.A09(r27)
            if (r6 == 0) goto L_0x0a99
            r26.A0L()
        L_0x03f0:
            X.1pZ r6 = r9.A0m
            if (r6 == 0) goto L_0x03f7
            r6.A0C(r11, r7, r1)
        L_0x03f7:
            com.whatsapp.TextEmojiLabel r6 = r0.A0D
            X.1BI r12 = r7.A0J
            r6.setTag(r12)
            X.1BI r13 = r7.A0J
            boolean r12 = X.C22971Dz.A0a(r13)
            if (r12 == 0) goto L_0x0614
            r13 = 2131892379(0x7f12189b, float:1.9419505E38)
            r12 = r26
            r12.setText(r13)
            r26.A0N()
            android.widget.TextView r12 = r0.A0C
            X.AnonymousClass3MW.A1S(r12)
            android.widget.ImageView r14 = r0.A07
            r14.setVisibility(r1)
            r12 = 2131232119(0x7f080577, float:1.8080338E38)
            android.graphics.drawable.Drawable r12 = X.C24261Jm.A00(r8, r12)
            android.graphics.drawable.Drawable r15 = X.C27831Xu.A02(r12)
            r13 = 2130970828(0x7f0408cc, float:1.7550377E38)
            r12 = 2131102239(0x7f060a1f, float:1.781691E38)
            int r12 = X.AnonymousClass3Ma.A00(r8, r13, r12)
            X.C27831Xu.A0C(r15, r12)
            r14.setImageDrawable(r15)
            r12 = 2131899162(0x7f12331a, float:1.9433262E38)
            X.C108955ca.A1J(r14, r9, r12)
            r12 = 30
            X.AnonymousClass3Ma.A1B(r14, r2, r12)
            r14.setFocusable(r1)
            X.77K r12 = r9.A1M
            int r13 = r12.A00
            if (r13 == 0) goto L_0x05fc
            r12 = 1
            if (r13 == r12) goto L_0x05d2
            r12 = 2
            if (r13 != r12) goto L_0x0cdd
            android.content.Context r13 = r9.A1n()
            X.77K r12 = r9.A1M
            java.util.List r12 = r12.A02
            int r14 = r12.size()
            if (r14 == 0) goto L_0x0600
            android.content.res.Resources r13 = r13.getResources()
            java.lang.Object[] r15 = X.AnonymousClass3MW.A1a()
            X.C17880vN.A1T(r15, r14, r1)
            r12 = 2131755371(0x7f10016b, float:1.914162E38)
            java.lang.String r14 = r13.getQuantityString(r12, r14, r15)
        L_0x0470:
            X.72B r12 = r2.A0C
            X.6R1 r12 = r12.A02(r1)
            int r13 = r12.ordinal()
            r12 = 1
            if (r13 == r12) goto L_0x05b3
            r12 = 2
            if (r13 == r12) goto L_0x05b3
            r12 = 3
            if (r13 != r12) goto L_0x04ad
            X.77K r15 = r9.A1M
            boolean r12 = r15.A05
            if (r12 != 0) goto L_0x048d
            boolean r12 = r15.A06
            if (r12 == 0) goto L_0x04ad
        L_0x048d:
            android.content.Context r16 = r9.A14()
            r18 = 2131169436(0x7f07109c, float:1.7953202E38)
            r13 = 2131101312(0x7f060680, float:1.781503E38)
            r12 = 2130970340(0x7f0406e4, float:1.7549387E38)
            int r19 = X.AnonymousClass1YL.A00(r8, r12, r13)
            boolean r12 = r15.A05
            r13 = r12
            boolean r12 = r15.A06
            r17 = r14
            r20 = r13
            r21 = r12
            android.text.SpannableStringBuilder r14 = X.AnonymousClass74A.A00(r16, r17, r18, r19, r20, r21)
        L_0x04ad:
            r6.setText(r14)
            boolean r12 = r9.A2u()
            if (r12 != 0) goto L_0x04b9
            r3.setPadding(r1, r1, r1, r1)
        L_0x04b9:
            r9.A09 = r3
        L_0x04bb:
            java.util.Map r12 = r9.A4G
            java.util.Map r14 = java.util.Collections.unmodifiableMap(r12)
            java.lang.Class<X.1BI> r13 = X.AnonymousClass1BI.class
            com.whatsapp.jid.Jid r12 = r7.A06(r13)
            boolean r17 = r14.containsKey(r12)
            boolean r12 = r9.A2q()
            if (r12 == 0) goto L_0x04e4
            if (r17 == 0) goto L_0x05b0
            android.content.Context r15 = r3.getContext()
            r14 = 2130970064(0x7f0405d0, float:1.7548828E38)
            r12 = 2131101205(0x7f060615, float:1.7814813E38)
            int r12 = X.AnonymousClass1YL.A00(r15, r14, r12)
        L_0x04e1:
            r3.setBackgroundResource(r12)
        L_0x04e4:
            java.util.Set r12 = r9.A4I
            com.whatsapp.jid.Jid r14 = r7.A06(r13)
            boolean r14 = r12.remove(r14)
            com.whatsapp.components.SelectionCheckView r12 = r0.A0F
            r18 = r12
            if (r14 == 0) goto L_0x05a8
            android.view.ViewTreeObserver r16 = r18.getViewTreeObserver()
            r12 = 1
            X.798 r14 = new X.798
            r15 = r12
            r12 = r17
            r14.<init>(r2, r0, r15, r12)
            r12 = r16
            r12.addOnPreDrawListener(r14)
        L_0x0506:
            boolean r12 = r9.A3R
            if (r12 == 0) goto L_0x0557
            java.util.Set r12 = r9.A4H
            java.util.Set r14 = java.util.Collections.unmodifiableSet(r12)
            com.whatsapp.jid.Jid r12 = r7.A06(r13)
            boolean r12 = r14.contains(r12)
            if (r12 == 0) goto L_0x0557
            android.widget.LinearLayout r12 = r0.A08
            r12.setVisibility(r4)
            r12 = r28
            r12.setVisibility(r4)
            boolean r12 = r9.A2r()
            if (r12 != 0) goto L_0x0533
            r6.setVisibility(r1)
            r12 = 2131888744(0x7f120a68, float:1.9412132E38)
            r6.setText(r12)
        L_0x0533:
            r14 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r12 = 2131101306(0x7f06067a, float:1.7815018E38)
            int r8 = X.AnonymousClass3Ma.A00(r8, r14, r12)
            r6.A0K()
            r6.setTextColor(r8)
            r6 = r26
            r6.setTextColor(r8)
            android.widget.TextView r6 = r0.A0C
            r6.setTextColor(r8)
            r11.setEnabled(r1)
            r6 = 1
            r3.setClickable(r6)
            r3.setLongClickable(r6)
        L_0x0557:
            boolean r6 = r9.A3S
            if (r6 != 0) goto L_0x0563
            boolean r6 = r9.A3a
            if (r6 != 0) goto L_0x0563
            boolean r6 = r9.A3c
            if (r6 == 0) goto L_0x058c
        L_0x0563:
            android.widget.ImageView r8 = r0.A03
            if (r8 == 0) goto L_0x058c
            X.1CJ r12 = r9.A1F
            X.1M9 r11 = r9.A0f
            com.whatsapp.jid.Jid r6 = r7.A06(r13)
            X.1BI r6 = (X.AnonymousClass1BI) r6
            int r7 = X.C43391zj.A00(r11, r12, r6)
            r6 = 8
            if (r7 <= 0) goto L_0x057a
            r6 = 0
        L_0x057a:
            r8.setVisibility(r6)
            X.0vb r6 = r9.A19
            java.lang.String r6 = X.C43391zj.A01(r6, r7)
            r8.setContentDescription(r6)
            r6 = 2131231792(0x7f080430, float:1.8079675E38)
            r8.setImageResource(r6)
        L_0x058c:
            boolean r6 = r9.A3e
            if (r6 == 0) goto L_0x01e0
            X.1E7 r6 = r5.getContact()
            if (r6 == 0) goto L_0x01e0
            r5.getContact()
            android.widget.TextView r6 = r0.A0C
            r6.setVisibility(r4)
            X.1Dw r6 = com.whatsapp.jid.UserJid.Companion
            r7 = 1
            r6 = r18
            r6.setEnabled(r7)
            goto L_0x01e0
        L_0x05a8:
            r14 = r12
            r12 = r17
            r14.A04(r12, r1)
            goto L_0x0506
        L_0x05b0:
            r12 = 0
            goto L_0x04e1
        L_0x05b3:
            X.77K r12 = r9.A1M
            boolean r12 = r12.A05
            if (r12 == 0) goto L_0x04ad
            android.content.Context r16 = r9.A14()
            r13 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r12 = 2131101312(0x7f060680, float:1.781503E38)
            int r12 = X.AnonymousClass1YL.A00(r8, r13, r12)
            r15 = 2131169436(0x7f07109c, float:1.7953202E38)
            r13 = r16
            android.text.SpannableStringBuilder r14 = X.AnonymousClass74B.A00(r13, r14, r15, r12)
            goto L_0x04ad
        L_0x05d2:
            android.content.Context r13 = r9.A1n()
            X.77K r12 = r9.A1M
            java.util.List r12 = r12.A01
            int r15 = r12.size()
            if (r15 != 0) goto L_0x05e4
            r12 = 2131892916(0x7f121ab4, float:1.9420594E38)
            goto L_0x060e
        L_0x05e4:
            X.1Lc r12 = r2.A09
            boolean r14 = r12.A04()
            android.content.res.Resources r13 = r13.getResources()
            r12 = 2131755372(0x7f10016c, float:1.9141621E38)
            if (r14 == 0) goto L_0x05f6
            r12 = 2131755373(0x7f10016d, float:1.9141623E38)
        L_0x05f6:
            java.lang.String r14 = X.C72473Md.A0k(r13, r15, r12)
            goto L_0x0470
        L_0x05fc:
            android.content.Context r13 = r9.A1n()
        L_0x0600:
            X.1Lc r12 = r2.A09
            boolean r14 = r12.A04()
            r12 = 2131895739(0x7f1225bb, float:1.942632E38)
            if (r14 == 0) goto L_0x060e
            r12 = 2131895737(0x7f1225b9, float:1.9426315E38)
        L_0x060e:
            java.lang.String r14 = r13.getString(r12)
            goto L_0x0470
        L_0x0614:
            boolean r12 = X.C42701yb.A01(r13)
            if (r12 == 0) goto L_0x0654
            r11.setVisibility(r1)
            X.C43421zm.A04(r26)
            r14 = 2130970343(0x7f0406e7, float:1.7549393E38)
            r13 = 2131101314(0x7f060682, float:1.7815034E38)
            r12 = r26
            X.C72463Mc.A0y(r8, r12, r14, r13)
            java.lang.String r13 = r7.A0K()
            r12.setText(r13)
            android.widget.TextView r12 = r0.A0C
            r12.setVisibility(r4)
            r6.A0L()
            r13 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r12 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0y(r8, r6, r13, r12)
            r12 = 2131895738(0x7f1225ba, float:1.9426317E38)
            r6.setText(r12)
            boolean r12 = r9.A2u()
            if (r12 != 0) goto L_0x04bb
            r3.setPadding(r1, r1, r1, r1)
            goto L_0x04bb
        L_0x0654:
            android.content.res.Resources r13 = X.AnonymousClass3MZ.A09(r9)
            r12 = 2131167265(0x7f070821, float:1.7948799E38)
            int r12 = r13.getDimensionPixelSize(r12)
            r3.setPadding(r1, r1, r12, r1)
            X.11S r12 = r9.A0T
            boolean r12 = X.AnonymousClass3Ma.A1V(r12, r7)
            if (r12 == 0) goto L_0x089c
            boolean r12 = r9.A3V
            if (r12 != 0) goto L_0x067a
            boolean r12 = r9.A3S
            if (r12 != 0) goto L_0x067a
            boolean r12 = r9.A3c
            if (r12 != 0) goto L_0x067a
            boolean r12 = r9.A3a
            if (r12 == 0) goto L_0x089c
        L_0x067a:
            r17 = 1
            java.util.ArrayList r12 = r9.A32
            if (r12 != 0) goto L_0x0896
            r16 = 0
        L_0x0682:
            r13 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            r15 = r19
            r14 = r13
            r13 = r16
            r15.A09(r7, r14, r13, r12)
        L_0x068d:
            r14 = 0
        L_0x068e:
            boolean r12 = r7.A0F()
            if (r12 != 0) goto L_0x06c0
            X.1BI r12 = r7.A0J
            boolean r12 = X.C22971Dz.A0N(r12)
            if (r12 != 0) goto L_0x06c0
            boolean r12 = r9.A3U
            if (r12 == 0) goto L_0x08d5
            X.1BI r12 = r7.A0J
            boolean r12 = X.C22971Dz.A0N(r12)
            if (r12 != 0) goto L_0x06c0
            boolean r12 = r7.A0F()
            if (r12 != 0) goto L_0x08d5
            X.1BI r12 = r7.A0J
            com.whatsapp.jid.UserJid r13 = X.C22941Dw.A00(r12)
            if (r13 == 0) goto L_0x06c0
            X.1Pu r12 = r2.A0A
            boolean r12 = r12.A01(r13)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x08d5
        L_0x06c0:
            boolean r12 = r9.A3U
            r17 = 0
            if (r12 == 0) goto L_0x06e8
            X.1BI r12 = r7.A0J
            boolean r12 = X.C22971Dz.A0N(r12)
            if (r12 != 0) goto L_0x06e6
            boolean r12 = r7.A0F()
            if (r12 != 0) goto L_0x0856
            X.1BI r12 = r7.A0J
            com.whatsapp.jid.UserJid r13 = X.C22941Dw.A00(r12)
            if (r13 == 0) goto L_0x06e6
            X.1Pu r12 = r2.A0A
            boolean r12 = r12.A01(r13)
            r12 = r12 ^ 1
            if (r12 == 0) goto L_0x0856
        L_0x06e6:
            r17 = 1
        L_0x06e8:
            java.lang.String r16 = ""
            r13 = 1
            if (r17 == 0) goto L_0x074c
            r10 = 2131889187(0x7f120c23, float:1.941303E38)
            r11.setEnabled(r1)
            r3.setClickable(r13)
            r3.setLongClickable(r13)
            r6.setText(r10)
            r6.setSingleLine(r1)
            r6.A0K()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r13 = (android.widget.FrameLayout.LayoutParams) r13
            r10 = 49
            r13.gravity = r10
            android.content.res.Resources r10 = r8.getResources()
            r12 = 2131166513(0x7f070531, float:1.7947273E38)
            int r10 = r10.getDimensionPixelSize(r12)
            r13.topMargin = r10
            r11.setLayoutParams(r13)
            int r12 = X.AnonymousClass3MZ.A01(r8, r12)
            r10 = r26
            r10.setPadding(r1, r12, r1, r1)
            r12 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r10 = 2131101306(0x7f06067a, float:1.7815018E38)
        L_0x072b:
            int r12 = X.AnonymousClass1YL.A00(r8, r12, r10)
            r10 = r26
            X.AnonymousClass3MX.A1C(r8, r10, r12)
            X.1XU r10 = r2.A00
            if (r10 != 0) goto L_0x0740
            r12 = 6
            X.5hX r10 = new X.5hX
            r10.<init>(r2, r12)
            r2.A00 = r10
        L_0x0740:
            android.widget.TextView r13 = r0.A0C
            r12 = r16
            r13.setText(r12)
            r3.setLongClickable(r1)
            goto L_0x04bb
        L_0x074c:
            boolean r12 = r9.A3c
            if (r12 != 0) goto L_0x075c
            boolean r12 = r9.A3S
            if (r12 != 0) goto L_0x075c
            boolean r12 = r9.A3a
            if (r12 != 0) goto L_0x075c
            boolean r12 = r9.A3b
            if (r12 == 0) goto L_0x080e
        L_0x075c:
            boolean r12 = r7.A0F()
            if (r12 == 0) goto L_0x080e
            X.1MZ r12 = r9.A1I
            r17 = r12
            java.lang.Class<com.whatsapp.jid.GroupJid> r15 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r14 = r7.A06(r15)
            com.whatsapp.jid.GroupJid r14 = (com.whatsapp.jid.GroupJid) r14
            r12 = r17
            boolean r12 = r12.A0J(r14)
            if (r12 == 0) goto L_0x079f
            X.1PU r12 = r2.A0B
            r17 = r12
            java.lang.Class<X.1EC> r12 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r14 = r7.A06(r12)
            X.C17960vV.A07(r14)
            X.1BI r14 = (X.AnonymousClass1BI) r14
            r12 = r17
            boolean r12 = r12.A01(r7, r14)
            if (r12 != 0) goto L_0x079f
            X.18O r12 = r9.A0V
            X.18R r14 = X.AnonymousClass18O.A0j
            boolean r12 = r12.A09(r14)
            if (r12 == 0) goto L_0x080e
            boolean r12 = r9.A3D
            if (r12 == 0) goto L_0x080e
            boolean r12 = r7.A11
            if (r12 == 0) goto L_0x080e
        L_0x079f:
            X.1MZ r12 = r9.A1I
            com.whatsapp.jid.Jid r10 = r7.A06(r15)
            com.whatsapp.jid.GroupJid r10 = (com.whatsapp.jid.GroupJid) r10
            boolean r10 = r12.A0J(r10)
            if (r10 != 0) goto L_0x07d1
            boolean r10 = r7.A0j
            r12 = 2131892982(0x7f121af6, float:1.9420728E38)
            if (r10 == 0) goto L_0x07b7
            r12 = 2131887924(0x7f120734, float:1.9410469E38)
        L_0x07b7:
            r11.setEnabled(r1)
            r3.setClickable(r13)
            r3.setLongClickable(r13)
            r6.setText(r12)
            r6.A0K()
            r12 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r10 = 2131101306(0x7f06067a, float:1.7815018E38)
            X.C72463Mc.A0y(r8, r6, r12, r10)
            goto L_0x072b
        L_0x07d1:
            boolean r10 = r9.A3D
            if (r10 == 0) goto L_0x07e7
            boolean r10 = r7.A11
            if (r10 == 0) goto L_0x07e7
            X.18O r12 = r9.A0V
            X.18R r10 = X.AnonymousClass18O.A0j
            boolean r10 = r12.A09(r10)
            if (r10 == 0) goto L_0x07e7
            r12 = 2131892922(0x7f121aba, float:1.9420606E38)
            goto L_0x07b7
        L_0x07e7:
            X.00H r10 = r9.A2p
            java.lang.Object r10 = r10.get()
            X.1xo r10 = (X.C42211xo) r10
            boolean r10 = r10.A02(r7)
            if (r10 == 0) goto L_0x07f9
            r12 = 2131896640(0x7f122940, float:1.9428147E38)
            goto L_0x07b7
        L_0x07f9:
            X.00H r10 = r9.A2p
            java.lang.Object r10 = r10.get()
            X.1xo r10 = (X.C42211xo) r10
            boolean r10 = r10.A01(r7)
            r12 = 2131893154(0x7f121ba2, float:1.9421077E38)
            if (r10 == 0) goto L_0x07b7
            r12 = 2131888607(0x7f1209df, float:1.9411854E38)
            goto L_0x07b7
        L_0x080e:
            X.1Me r14 = r9.A0k
            java.lang.Class<X.1E9> r12 = X.AnonymousClass1E9.class
            com.whatsapp.jid.Jid r13 = r7.A06(r12)
            java.util.concurrent.ConcurrentHashMap r12 = r14.A07
            java.lang.String r13 = X.C108945cZ.A1G(r13, r12)
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 != 0) goto L_0x0843
            X.1BI r12 = r7.A0J
            boolean r12 = X.C22971Dz.A0N(r12)
            if (r12 == 0) goto L_0x0841
            java.lang.String r12 = r7.A0K()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0841
            java.util.ArrayList r12 = r9.A32
            if (r12 == 0) goto L_0x0841
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
        L_0x083c:
            r6.A0S(r13, r12, r1, r1)
            goto L_0x0740
        L_0x0841:
            r12 = 0
            goto L_0x083c
        L_0x0843:
            r12 = r16
            r6.setText(r12)
            X.10I r14 = r9.A1y
            X.1Me r13 = r9.A0k
            X.490 r12 = new X.490
            r12.<init>(r6, r13, r7)
            X.AnonymousClass3MW.A1T(r12, r14, r1)
            goto L_0x0740
        L_0x0856:
            X.1Pv r13 = r2.A07
            java.lang.Class<X.1EC> r15 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r12 = r7.A06(r15)
            X.C17960vV.A07(r12)
            X.1EC r12 = (X.AnonymousClass1EC) r12
            boolean r12 = r13.A00(r7, r12)
            r16 = r12 ^ 1
            X.1MZ r13 = r9.A1I
            java.lang.Class<com.whatsapp.jid.GroupJid> r12 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r12 = r7.A06(r12)
            com.whatsapp.jid.GroupJid r12 = (com.whatsapp.jid.GroupJid) r12
            boolean r12 = r13.A0J(r12)
            r14 = r12 ^ 1
            X.1PU r13 = r2.A0B
            com.whatsapp.jid.Jid r12 = r7.A06(r15)
            X.C17960vV.A07(r12)
            X.1BI r12 = (X.AnonymousClass1BI) r12
            boolean r13 = r13.A01(r7, r12)
            boolean r12 = r7.A0F()
            if (r12 == 0) goto L_0x06e8
            if (r16 != 0) goto L_0x06e6
            if (r14 != 0) goto L_0x06e6
            if (r13 == 0) goto L_0x06e8
            goto L_0x06e6
        L_0x0896:
            java.util.List r16 = java.util.Collections.unmodifiableList(r12)
            goto L_0x0682
        L_0x089c:
            r17 = 0
            X.1BI r12 = r7.A0J
            boolean r12 = X.C22971Dz.A0T(r12)
            r13 = -1
            if (r12 == 0) goto L_0x08a8
            r13 = 6
        L_0x08a8:
            X.1Me r12 = r9.A0k
            X.1yg r14 = r12.A0D(r7, r13)
            java.util.ArrayList r12 = r9.A32
            if (r12 != 0) goto L_0x08d0
            r22 = 0
        L_0x08b4:
            r12 = r19
            boolean r24 = r12.A0D(r7, r13)
            r20 = r14
            r21 = r7
            r23 = r13
            r19.A04(r20, r21, r22, r23, r24)
            java.lang.Integer r13 = r14.A00
            java.lang.Integer r12 = X.AnonymousClass00R.A0N
            boolean r12 = r13.equals(r12)
            r14 = 1
            if (r12 != 0) goto L_0x068e
            goto L_0x068d
        L_0x08d0:
            java.util.List r22 = java.util.Collections.unmodifiableList(r12)
            goto L_0x08b4
        L_0x08d5:
            if (r14 == 0) goto L_0x08ec
            r13 = 11864(0x2e58, float:1.6625E-41)
            r12 = r27
            boolean r12 = X.C36301nf.A01(r12, r13)
            if (r12 == 0) goto L_0x08ec
            X.1Me r12 = r9.A0k
            java.lang.String r12 = X.AnonymousClass3MX.A17(r12, r7)
            A03(r6, r12)
            goto L_0x04bb
        L_0x08ec:
            if (r18 == 0) goto L_0x08fd
            java.lang.String r12 = X.AnonymousClass17K.A02(r7)
            r6.setText(r12)
            r3.setLongClickable(r1)
            r3.setClickable(r1)
            goto L_0x04bb
        L_0x08fd:
            X.1BI r12 = r7.A0J
            boolean r12 = X.C22971Dz.A0V(r12)
            if (r12 == 0) goto L_0x096f
            android.widget.TextView r12 = r0.A0C
            r12.setVisibility(r4)
            java.util.HashSet r12 = r9.A4D
            java.util.Iterator r14 = r12.iterator()
        L_0x0910:
            boolean r12 = r14.hasNext()
            if (r12 == 0) goto L_0x096a
            java.lang.Object r13 = r14.next()
            java.lang.Number r13 = (java.lang.Number) r13
            X.00H r12 = r9.A2f
            java.lang.Object r12 = r12.get()
            X.61n r12 = (X.C1179361n) r12
            int r13 = r13.intValue()
            boolean r12 = r12.A03(r13)
            if (r12 != 0) goto L_0x0910
            r12 = 99
            if (r13 == r12) goto L_0x0910
            boolean r12 = r9.A3c
            if (r12 != 0) goto L_0x093e
            boolean r12 = r9.A3S
            if (r12 != 0) goto L_0x093e
            boolean r12 = r9.A3a
            if (r12 == 0) goto L_0x096a
        L_0x093e:
            r10 = 1
            r3.setClickable(r10)
            r3.setLongClickable(r1)
            r10 = 2131892725(0x7f1219f5, float:1.9420206E38)
            r6.setText(r10)
            r6.A0K()
            r13 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r12 = 2131101306(0x7f06067a, float:1.7815018E38)
            X.C72463Mc.A0y(r8, r6, r13, r12)
            r10 = r26
            X.C72463Mc.A0y(r8, r10, r13, r12)
            X.1XU r10 = r2.A00
            if (r10 != 0) goto L_0x04bb
            r12 = 6
            X.5hX r10 = new X.5hX
            r10.<init>(r2, r12)
            r2.A00 = r10
            goto L_0x04bb
        L_0x096a:
            r2.A04(r5, r0, r7)
            goto L_0x04bb
        L_0x096f:
            com.whatsapp.jid.UserJid r14 = X.AnonymousClass3MZ.A0x(r7)
            boolean r12 = r9.A2h()
            if (r12 == 0) goto L_0x09c2
            X.1VD r13 = r2.A08
            r12 = 1
            boolean r12 = r13.A01(r7, r12)
            if (r12 == 0) goto L_0x09c2
            r10 = 2131894911(0x7f12227f, float:1.942464E38)
            A02(r8, r0, r10)
        L_0x0988:
            X.1XU r10 = r2.A01
            if (r10 != 0) goto L_0x0994
            r12 = 5
            X.5hX r10 = new X.5hX
            r10.<init>(r2, r12)
            r2.A01 = r10
        L_0x0994:
            boolean r12 = r9.A2m()
            if (r12 != 0) goto L_0x04bb
            boolean r12 = r9.A3S
            if (r12 != 0) goto L_0x09a2
            boolean r12 = r9.A3c
            if (r12 == 0) goto L_0x09af
        L_0x09a2:
            r14 = 6741(0x1a55, float:9.446E-42)
            X.0vf r13 = X.C18040vf.A02
            r12 = r27
            int r13 = X.C18020vd.A00(r13, r12, r14)
            r12 = 1
            if (r13 == r12) goto L_0x04bb
        L_0x09af:
            android.content.Context r13 = r9.A1n()
            X.0vb r12 = r9.A19
            java.lang.String r13 = X.C24921Me.A02(r13, r12, r7)
            if (r13 == 0) goto L_0x04bb
            android.widget.TextView r12 = r0.A0C
            r12.setText(r13)
            goto L_0x04bb
        L_0x09c2:
            X.00H r13 = r9.A24
            boolean r12 = X.C72463Mc.A1U(r14, r13)
            if (r12 == 0) goto L_0x09e0
            r10 = 2131896778(0x7f1229ca, float:1.9428427E38)
            A02(r8, r0, r10)
            r12 = 0
            r10 = r25
            r10.setOnClickListener(r12)
            r11.setOnClickListener(r12)
            r10.setClickable(r1)
            r11.setClickable(r1)
            goto L_0x0988
        L_0x09e0:
            java.lang.String r12 = r9.A2C(r7)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0a14
            java.lang.String r10 = r9.A2C(r7)
            r6.setText(r10)
            r6.setVisibility(r1)
            r13 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r12 = 2131101306(0x7f06067a, float:1.7815018E38)
            r10 = r26
            X.C72463Mc.A0y(r8, r10, r13, r12)
            r10 = 1065353216(0x3f800000, float:1.0)
            r11.setAlpha(r10)
            r3.setLongClickable(r1)
            X.1XU r10 = r2.A00
            if (r10 != 0) goto L_0x0994
            r12 = 6
            X.5hX r10 = new X.5hX
            r10.<init>(r2, r12)
            r2.A00 = r10
            goto L_0x0994
        L_0x0a14:
            r12 = 1065353216(0x3f800000, float:1.0)
            r11.setAlpha(r12)
            if (r17 == 0) goto L_0x0a2d
            r12 = 2131892106(0x7f12178a, float:1.941895E38)
            java.lang.String r12 = r8.getString(r12)
            r6.A0R(r12)
            r6.setVisibility(r1)
        L_0x0a28:
            r3.setLongClickable(r1)
            goto L_0x0994
        L_0x0a2d:
            boolean r12 = r9.A2j()
            if (r12 != 0) goto L_0x0a3e
            boolean r12 = r9.A2k()
            if (r12 != 0) goto L_0x0a3e
            boolean r13 = r9.A3L
            r12 = 0
            if (r13 == 0) goto L_0x0a3f
        L_0x0a3e:
            r12 = 1
        L_0x0a3f:
            r13 = 8
            if (r12 == 0) goto L_0x0a69
            java.lang.String r12 = r7.A0Z
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 == 0) goto L_0x0a69
            r14 = 5839(0x16cf, float:8.182E-42)
            X.0vf r13 = X.C18040vf.A02
            r12 = r27
            boolean r12 = X.C18020vd.A05(r13, r12, r14)
            if (r12 == 0) goto L_0x0a65
            X.11P r13 = r2.A05
            android.content.Context r12 = r6.getContext()
            java.lang.String r12 = X.AnonymousClass72Y.A01(r12, r13, r7)
            A03(r6, r12)
            goto L_0x0a28
        L_0x0a65:
            r6.setVisibility(r4)
            goto L_0x0a28
        L_0x0a69:
            boolean r12 = r9.A30(r7)
            if (r12 == 0) goto L_0x0a7d
            r6.setVisibility(r4)
            android.widget.TextView r12 = r0.A0C
            r12.setVisibility(r4)
            r12 = r29
            r12.setVisibility(r1)
            goto L_0x0a28
        L_0x0a7d:
            boolean r12 = r9.A2r()
            if (r12 == 0) goto L_0x0a95
            java.lang.String r12 = r9.A2D(r7)
            r6.setText(r12)
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0a91
            r13 = 0
        L_0x0a91:
            r6.setVisibility(r13)
            goto L_0x0a28
        L_0x0a95:
            r2.A04(r5, r0, r7)
            goto L_0x0a28
        L_0x0a99:
            X.C43421zm.A04(r26)
            goto L_0x03f0
        L_0x0a9e:
            com.whatsapp.TextEmojiLabel r6 = r0.A0D
            r6.setVisibility(r1)
            r15 = 25
        L_0x0aa5:
            X.4dN r14 = new X.4dN
            r14.<init>(r2, r7, r15)
            goto L_0x03c0
        L_0x0aac:
            r6 = r28
            r6.setVisibility(r4)
            goto L_0x0379
        L_0x0ab3:
            boolean r6 = r9.A3M
            if (r6 == 0) goto L_0x0b23
            android.widget.TextView r6 = r0.A0C
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A0B
            r6.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r14 = r0.A0D
            r14.A0L()
            r12 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r6 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0y(r8, r14, r12, r6)
            X.1XU r13 = r2.A00
            if (r13 != 0) goto L_0x0adb
            r6 = 6
            X.5hX r13 = new X.5hX
            r13.<init>(r2, r6)
            r2.A00 = r13
        L_0x0adb:
            X.00H r6 = r9.A24
            X.1pj r12 = X.AnonymousClass3MW.A0V(r6)
            com.whatsapp.jid.UserJid r6 = X.AnonymousClass3MZ.A0x(r7)
            boolean r6 = r12.A0P(r6)
            if (r6 == 0) goto L_0x0b06
            r6 = r28
            r6.setVisibility(r4)
            r14.setVisibility(r1)
            android.widget.ImageView r6 = r0.A07
            r6.setVisibility(r4)
            r6.setOnClickListener(r10)
            android.widget.ImageView r6 = r0.A02
            r6.setVisibility(r4)
            r6.setOnClickListener(r10)
        L_0x0b03:
            r10 = r13
            goto L_0x03cb
        L_0x0b06:
            android.widget.ImageView r10 = r0.A07
            r10.setVisibility(r1)
            r6 = 28
            X.C90004dN.A00(r10, r2, r7, r6)
            android.widget.ImageView r10 = r0.A02
            r10.setVisibility(r1)
            r6 = 29
            X.C90004dN.A00(r10, r2, r7, r6)
            r14.setVisibility(r4)
            r6 = r28
            r6.setVisibility(r4)
            goto L_0x0b03
        L_0x0b23:
            boolean r6 = r9.A3R
            if (r6 == 0) goto L_0x0b4c
            android.widget.TextView r6 = r0.A0C
            r6.setVisibility(r4)
            android.widget.LinearLayout r6 = r0.A08
            r6.setVisibility(r1)
            android.widget.TextView r6 = r0.A0B
            r6.setVisibility(r4)
            android.widget.ImageView r6 = r0.A02
            r6.setVisibility(r4)
            android.widget.ImageView r6 = r0.A07
            r6.setVisibility(r4)
            com.whatsapp.TextEmojiLabel r6 = r0.A0D
            r6.setVisibility(r4)
            r6 = r28
            r6.setVisibility(r4)
            goto L_0x03cb
        L_0x0b4c:
            boolean r6 = r9.A3V
            if (r6 == 0) goto L_0x0b5c
            A01(r8, r0)
            boolean r6 = r5 instanceof X.AnonymousClass7EG
            if (r6 == 0) goto L_0x03cb
            r13.setVisibility(r1)
            goto L_0x03cb
        L_0x0b5c:
            boolean r6 = r9.A3O
            if (r6 == 0) goto L_0x0b65
            A01(r8, r0)
            goto L_0x03cb
        L_0x0b65:
            com.whatsapp.TextEmojiLabel r13 = r0.A0D
            r13.setVisibility(r1)
            r13.A0L()
            r12 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r6 = 2131101312(0x7f060680, float:1.781503E38)
            X.C72463Mc.A0y(r8, r13, r12, r6)
            android.widget.ImageView r6 = r0.A07
            r6.setVisibility(r4)
            android.widget.ImageView r6 = r0.A02
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A0B
            r6.setVisibility(r4)
            android.widget.TextView r13 = r0.A0C
            r13.setVisibility(r1)
            r12 = 2130969198(0x7f04026e, float:1.7547071E38)
            r6 = 2131100214(0x7f060236, float:1.7812803E38)
            X.C72463Mc.A0y(r8, r13, r12, r6)
            r6 = r28
            r6.setVisibility(r4)
            android.widget.TextView r6 = r0.A09
            r6.setVisibility(r4)
            goto L_0x03cb
        L_0x0b9f:
            android.view.View r6 = r0.A01
            r25 = r6
            r6.setOnClickListener(r10)
            r11.setOnClickListener(r10)
            r6.setClickable(r1)
            r11.setClickable(r1)
            goto L_0x0339
        L_0x0bb1:
            android.view.View r3 = r2.A00(r6)
            com.whatsapp.contact.picker.ContactPickerFragment r6 = r2.A04
            boolean r8 = r6.A3V
            boolean r0 = r6.A3S
            if (r0 != 0) goto L_0x0bc2
            boolean r0 = r6.A3c
            r7 = 0
            if (r0 == 0) goto L_0x0bc3
        L_0x0bc2:
            r7 = 1
        L_0x0bc3:
            r0 = 2131429480(0x7f0b0868, float:1.8480634E38)
            com.whatsapp.TextEmojiLabel r10 = X.AnonymousClass3MX.A0V(r3, r0)
            if (r7 == 0) goto L_0x0bcf
            r10.setMaxLines(r12)
        L_0x0bcf:
            if (r8 != 0) goto L_0x0bdf
            if (r7 == 0) goto L_0x0cd0
            X.0ve r8 = r2.A06
            r7 = 6741(0x1a55, float:9.446E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r8, r7)
            if (r0 != r12) goto L_0x0cd0
        L_0x0bdf:
            r0 = 2131431787(0x7f0b116b, float:1.8485313E38)
        L_0x0be2:
            android.widget.TextView r7 = X.AnonymousClass3MW.A0J(r3, r0)
            boolean r0 = r7 instanceof com.whatsapp.wds.components.button.WDSButton
            if (r0 == 0) goto L_0x0c07
            X.0ve r9 = r2.A06
            r8 = 6739(0x1a53, float:9.443E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r9, r8)
            if (r0 != r12) goto L_0x0c07
            r8 = r7
            com.whatsapp.wds.components.button.WDSButton r8 = (com.whatsapp.wds.components.button.WDSButton) r8
            X.1Xz r0 = X.C27881Xz.OUTLINE
            r8.setVariant(r0)
            X.4D1 r0 = X.AnonymousClass4D1.SMALL
            r8.setSize(r0)
            r0 = 0
            r7.setLetterSpacing(r0)
        L_0x0c07:
            r0 = 2131429479(0x7f0b0867, float:1.8480632E38)
            android.widget.ImageView r16 = X.AnonymousClass3MW.A0G(r3, r0)
            r0 = 2131429474(0x7f0b0862, float:1.8480622E38)
            android.widget.ImageView r17 = X.AnonymousClass3MW.A0G(r3, r0)
            r0 = 2131429455(0x7f0b084f, float:1.8480583E38)
            android.view.View r14 = X.AnonymousClass1HF.A06(r3, r0)
            X.3Kk r8 = r6.A0Y
            r0 = 2131429476(0x7f0b0864, float:1.8480626E38)
            X.1xh r28 = X.C42141xh.A01(r3, r8, r0)
            r0 = 2131429478(0x7f0b0866, float:1.848063E38)
            android.widget.TextView r23 = X.AnonymousClass3MW.A0J(r3, r0)
            r0 = 2131429472(0x7f0b0860, float:1.8480618E38)
            android.widget.ImageView r18 = X.AnonymousClass3MW.A0G(r3, r0)
            r0 = 2131429473(0x7f0b0861, float:1.848062E38)
            android.widget.ImageView r19 = X.AnonymousClass3MW.A0G(r3, r0)
            r0 = 2131427689(0x7f0b0169, float:1.8477001E38)
            android.widget.TextView r24 = X.AnonymousClass3MW.A0J(r3, r0)
            r0 = 2131435130(0x7f0b1e7a, float:1.8492093E38)
            android.view.View r9 = X.AnonymousClass1HF.A06(r3, r0)
            com.whatsapp.components.SelectionCheckView r9 = (com.whatsapp.components.SelectionCheckView) r9
            r0 = 2131429475(0x7f0b0863, float:1.8480624E38)
            android.widget.ImageView r20 = X.AnonymousClass3MW.A0G(r3, r0)
            r0 = 2131428775(0x7f0b05a7, float:1.8479204E38)
            android.widget.TextView r25 = X.AnonymousClass3MW.A0J(r3, r0)
            r0 = 2131428625(0x7f0b0511, float:1.84789E38)
            android.view.View r8 = X.AnonymousClass1HF.A06(r3, r0)
            android.widget.LinearLayout r8 = (android.widget.LinearLayout) r8
            r0 = 2131431592(0x7f0b10a8, float:1.8484918E38)
            android.widget.ImageView r21 = X.AnonymousClass3MW.A0G(r3, r0)
            r0 = 2131429020(0x7f0b069c, float:1.84797E38)
            android.view.View r15 = X.AnonymousClass1HF.A06(r3, r0)
            X.6kT r0 = new X.6kT
            r13 = r0
            r22 = r8
            r26 = r7
            r27 = r10
            r29 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r3.setTag(r0)
            boolean r7 = r6.A3M
            if (r7 == 0) goto L_0x0cc4
            X.0vb r10 = r6.A19
            r7 = 2131428625(0x7f0b0511, float:1.84789E38)
            android.view.View r9 = r3.findViewById(r7)
            android.content.res.Resources r8 = X.AnonymousClass3MZ.A09(r6)
            r7 = 2131166077(0x7f07037d, float:1.794639E38)
            int r7 = r8.getDimensionPixelSize(r7)
            X.C27641Ww.A05(r9, r10, r1, r7)
            android.widget.ImageView r9 = r0.A07
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            android.content.res.Resources r7 = X.AnonymousClass3MZ.A09(r6)
            r10 = 2131166088(0x7f070388, float:1.7946411E38)
            int r7 = r7.getDimensionPixelSize(r10)
            r8.width = r7
            r9.setLayoutParams(r8)
            android.widget.ImageView r9 = r0.A02
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            android.content.res.Resources r7 = X.AnonymousClass3MZ.A09(r6)
            int r7 = r7.getDimensionPixelSize(r10)
            r8.width = r7
            r9.setLayoutParams(r8)
        L_0x0cc4:
            boolean r6 = r6.A3S
            android.widget.ImageView r7 = r0.A06
            if (r6 == 0) goto L_0x0cd5
            r6 = 2
            r7.setImportantForAccessibility(r6)
            goto L_0x015d
        L_0x0cd0:
            r0 = 2131431786(0x7f0b116a, float:1.8485311E38)
            goto L_0x0be2
        L_0x0cd5:
            r6 = 2131886196(0x7f120074, float:1.9406964E38)
            X.AnonymousClass1Y5.A02(r7, r6)
            goto L_0x015d
        L_0x0cdd:
            java.lang.String r0 = "unknown status distribution mode"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0ce4:
            android.view.View r5 = (android.view.View) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116625yK.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
