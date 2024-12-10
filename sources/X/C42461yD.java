package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1yD  reason: invalid class name and case insensitive filesystem */
public abstract class C42461yD {
    public C59492mO A00;
    public C42351y2 A01;
    public final Context A02;
    public final AnonymousClass11S A03;
    public final AnonymousClass1M9 A04;
    public final C24921Me A05;
    public final C42071xZ A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass118 A08;
    public final C18000vb A09;
    public final AnonymousClass1CJ A0A;
    public final C18030ve A0B;
    public final C42211xo A0C;
    public final AnonymousClass1QO A0D;
    public final AnonymousClass1QS A0E;
    public final AnonymousClass1R2 A0F;
    public final C43351zf A0G;
    public final AnonymousClass00H A0H;
    public final C42341y1 A0I;
    public final AnonymousClass00H A0J;
    public final C32191gn A0K;
    public final C37551pj A0L;
    public final C34021jm A0M;
    public final AnonymousClass11C A0N;
    public final AnonymousClass1NA A0O;
    public final AnonymousClass12L A0P;
    public final C32091gc A0Q;
    public final AnonymousClass1PU A0R;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (r3 == 8) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C42461yD r6, java.lang.CharSequence r7, boolean r8, boolean r9) {
        /*
            r4 = r7
            boolean r0 = r6 instanceof X.C42481yF
            if (r0 == 0) goto L_0x002f
            r1 = r6
            X.1yF r1 = (X.C42481yF) r1
            int r3 = r1.A08
            r0 = 1
            if (r3 == r0) goto L_0x002b
            r0 = 10
            if (r3 == r0) goto L_0x002b
            X.0ve r2 = r1.A0B
            X.0vf r1 = X.C18040vf.A01
            r0 = 8944(0x22f0, float:1.2533E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x002f
            r0 = 11
            if (r3 == r0) goto L_0x002b
            r0 = 2
            if (r3 == r0) goto L_0x002b
            r0 = 4
            if (r3 == r0) goto L_0x002b
            r0 = 8
            if (r3 != r0) goto L_0x002f
        L_0x002b:
            java.lang.CharSequence r4 = X.C26302CxJ.A0E(r7)     // Catch:{ all -> 0x002f }
        L_0x002f:
            X.1xZ r0 = r6.A06
            com.whatsapp.TextEmojiLabel r2 = r0.A07
            X.1jm r0 = r6.A0M
            java.util.List r5 = r0.BXB()
            X.1zf r3 = r6.A0G
            r7 = 150(0x96, float:2.1E-43)
            r6 = 1065353216(0x3f800000, float:1.0)
            r8 = r8
            r9 = r9
            java.lang.CharSequence r0 = r2.A0M(r3, r4, r5, r6, r7, r8, r9)
            r2.setText(r0)
            java.lang.Boolean r0 = X.C17970vW.A03
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42461yD.A03(X.1yD, java.lang.CharSequence, boolean, boolean):void");
    }

    private Drawable A00(int i) {
        Context context = this.A02;
        Bitmap A002 = AnonymousClass4aX.A00(AnonymousClass4aX.A02(context, i, 2131101888));
        return AnonymousClass4aX.A07(context.getResources(), new BitmapDrawable(context.getResources(), A002), (int) context.getResources().getDimension(2131166358));
    }

    private void A04(CharSequence charSequence, int i) {
        C42071xZ r2 = this.A06;
        r2.A0N.A04(0);
        ((TextView) r2.A0N.A02()).setTextColor(i);
        ((TextView) r2.A0N.A02()).setText(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        if (((X.AnonymousClass215) r5).Bbc() != 1) goto L_0x023b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01df, code lost:
        if (r5.A0G() != 2147483648L) goto L_0x01e1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.AnonymousClass1E7 r18, X.AnonymousClass1E7 r19, com.whatsapp.jid.GroupJid r20, X.AnonymousClass206 r21) {
        /*
            r17 = this;
            r12 = r19
            r4 = r17
            X.0ve r2 = r4.A0B
            r1 = 11256(0x2bf8, float:1.5773E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r7 = 2
            r5 = r21
            if (r0 == 0) goto L_0x0043
            boolean r0 = r5 instanceof X.C436420i
            if (r0 == 0) goto L_0x0043
            r0 = r5
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            if (r1 == r7) goto L_0x0021
            r0 = 3
            if (r1 != r0) goto L_0x0043
        L_0x0021:
            java.lang.String r0 = r5.A0P()
            if (r0 == 0) goto L_0x023e
            int r0 = r0.length()
            if (r0 == 0) goto L_0x023e
            java.lang.String r6 = r5.A0P()
        L_0x0031:
            X.1xZ r0 = r4.A06
            X.1xg r0 = r0.A09
            X.1zf r3 = r4.A0G
            X.1xi r2 = r0.A03
            com.whatsapp.TextEmojiLabel r1 = r2.A01
            r0 = 0
            r1.setPlaceholder(r0)
            r0 = 0
            r2.A0F(r3, r6, r0)
        L_0x0043:
            X.1xZ r3 = r4.A06
            com.whatsapp.TextEmojiLabel r0 = r3.A07
            X.C43411zl.A00(r0)
            if (r21 == 0) goto L_0x023b
            boolean r0 = X.AnonymousClass25A.A0p(r5)
            r6 = 1
            if (r0 != 0) goto L_0x0068
            int r1 = r5.A0u
            r0 = 19
            if (r1 == r0) goto L_0x0068
            boolean r0 = X.AnonymousClass25A.A0J(r1)
            if (r0 == 0) goto L_0x023b
            r0 = r5
            X.215 r0 = (X.AnonymousClass215) r0
            int r0 = r0.Bbc()
            if (r0 != r6) goto L_0x023b
        L_0x0068:
            r2 = 0
            if (r6 != 0) goto L_0x006c
            r7 = 0
        L_0x006c:
            com.whatsapp.TextEmojiLabel r1 = r3.A07
            X.C18070vi.A0d(r1, r2)
            r1.getContext()
            android.graphics.Typeface r0 = X.C43421zm.A01()
            r1.setTypeface(r0, r7)
            r9 = 8
            java.lang.String r10 = ""
            r11 = 1
            r6 = r18
            if (r21 == 0) goto L_0x0109
            r0 = 16777216(0x1000000, double:8.289046E-317)
            boolean r0 = r5.A11(r0)
            if (r0 == 0) goto L_0x0109
            android.widget.ImageView r0 = r3.A05
            r0.setVisibility(r9)
            X.205 r0 = r5.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x00d7
            android.content.Context r1 = r4.A02
            r0 = 2131888475(0x7f12095b, float:1.9411586E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x00a1:
            r7 = r10
            r16 = 0
        L_0x00a4:
            r14 = r20
            r15 = r5
            r13 = r12
            r12 = r6
            r11 = r4
            r11.A0K(r12, r13, r14, r15, r16)
            if (r21 == 0) goto L_0x00b7
            int r1 = r5.A0D()
            r0 = 6
            if (r1 == r0) goto L_0x00b7
            r2 = 1
        L_0x00b7:
            boolean r0 = X.C87494Vu.A00(r5)
            A03(r4, r8, r2, r0)
            X.1xg r0 = r3.A09
            r0.A06(r10, r7)
            X.2mO r0 = r4.A00
            if (r0 == 0) goto L_0x00d6
            android.widget.ImageView r0 = r3.A05
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            boolean r0 = r0 instanceof X.C454028v
            if (r0 != 0) goto L_0x00d6
            X.2mO r0 = r4.A00
            r0.A02()
        L_0x00d6:
            return
        L_0x00d7:
            if (r19 != 0) goto L_0x00f0
            android.content.Context r1 = r4.A02
            r0 = 2131888476(0x7f12095c, float:1.9411588E38)
            java.lang.String r8 = r1.getString(r0)
        L_0x00e2:
            android.content.Context r7 = r4.A02
            r1 = 2131888474(0x7f12095a, float:1.9411584E38)
            java.lang.Object[] r0 = new java.lang.Object[r11]
            r0[r2] = r8
            java.lang.String r8 = r7.getString(r1, r0)
            goto L_0x00a1
        L_0x00f0:
            java.lang.Class<com.whatsapp.jid.GroupJid> r0 = com.whatsapp.jid.GroupJid.class
            com.whatsapp.jid.Jid r1 = r6.A06(r0)
            X.1BI r1 = (X.AnonymousClass1BI) r1
            if (r1 == 0) goto L_0x0107
            X.1Me r0 = r4.A05
            int r1 = r0.A0A(r1)
        L_0x0100:
            X.1Me r0 = r4.A05
            java.lang.String r8 = r0.A0T(r12, r1)
            goto L_0x00e2
        L_0x0107:
            r1 = 1
            goto L_0x0100
        L_0x0109:
            boolean r0 = r6.A0F()
            if (r0 == 0) goto L_0x013d
            X.1xo r0 = r4.A0C
            boolean r0 = r0.A02(r6)
            if (r0 == 0) goto L_0x013d
            android.content.Context r7 = r4.A02
            r0 = 2131896639(0x7f12293f, float:1.9428145E38)
        L_0x011c:
            java.lang.String r8 = r7.getString(r0)
            r1 = 2131231720(0x7f0803e8, float:1.8079529E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r1 = X.AnonymousClass4aX.A02(r7, r1, r0)
            android.widget.ImageView r0 = r3.A05
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r3.A05
            r0.setImageDrawable(r1)
            r7 = r10
            r0 = 0
        L_0x0136:
            r16 = 1
            if (r0 != 0) goto L_0x00a4
            r12 = 0
            goto L_0x00a4
        L_0x013d:
            X.1xo r0 = r4.A0C
            boolean r0 = r0.A01(r6)
            if (r0 == 0) goto L_0x014b
            android.content.Context r7 = r4.A02
            r0 = 2131888608(0x7f1209e0, float:1.9411856E38)
            goto L_0x011c
        L_0x014b:
            X.1pj r7 = r4.A0L
            X.1BI r1 = r6.A0J
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r1)
            boolean r0 = r7.A0P(r0)
            if (r0 == 0) goto L_0x0193
            X.12L r0 = r4.A0P
            boolean r0 = X.C42761yh.A00(r6, r0)
            if (r0 == 0) goto L_0x0174
            android.content.Context r1 = r4.A02
            r0 = 2131898329(0x7f122fd9, float:1.9431573E38)
            java.lang.String r8 = X.C80613xU.A04(r1, r0)
        L_0x016c:
            android.widget.ImageView r0 = r3.A06
            r0.setVisibility(r9)
        L_0x0171:
            r7 = r10
        L_0x0172:
            r0 = 1
            goto L_0x0136
        L_0x0174:
            boolean r0 = r6.A0E()
            if (r0 == 0) goto L_0x0184
            android.content.Context r7 = r4.A02
            r1 = 2131887205(0x7f120465, float:1.940901E38)
        L_0x017f:
            java.lang.String r8 = r7.getString(r1)
            goto L_0x016c
        L_0x0184:
            boolean r0 = r6.A0C()
            android.content.Context r7 = r4.A02
            r1 = 2131887210(0x7f12046a, float:1.940902E38)
            if (r0 == 0) goto L_0x017f
            r1 = 2131887207(0x7f120467, float:1.9409015E38)
            goto L_0x017f
        L_0x0193:
            if (r21 == 0) goto L_0x0233
            android.util.Pair r0 = r4.A0G(r5)
            java.lang.Object r8 = r0.second
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            X.206 r0 = r5.A0K()
            if (r0 == 0) goto L_0x01b2
            X.205 r0 = r0.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C22971Dz.A0a(r0)
            if (r0 == 0) goto L_0x01b2
            X.1bI r0 = r3.A0S
            r0.A04(r2)
        L_0x01b2:
            X.11P r9 = r4.A07
            X.0vb r7 = r4.A09
            long r0 = r5.A0I
            long r0 = r9.A09(r0)
            java.lang.String r10 = X.C64052u8.A0C(r7, r0, r2)
            long r0 = r5.A0I
            long r0 = r9.A09(r0)
            java.lang.String r7 = X.C64052u8.A0C(r7, r0, r11)
            r1 = 8
            int r11 = r5.A0D()
            r0 = 6
            if (r11 != r0) goto L_0x01e1
            long r15 = r5.A0G()
            r13 = 2147483648(0x80000000, double:1.0609978955E-314)
            int r11 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            r0 = 1
            if (r11 == 0) goto L_0x01e2
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            android.content.Context r11 = r4.A02
            if (r0 == 0) goto L_0x0228
            X.C18070vi.A0d(r11, r2)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r0 = 2131889570(0x7f120da2, float:1.9413807E38)
            java.lang.String r0 = r11.getString(r0)
            r9.append(r0)
            java.lang.String r0 = ": "
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            boolean r0 = r0 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0220
            X.1bI r0 = r3.A0T
            r0.A04(r2)
            X.1bI r0 = r3.A0T
        L_0x0210:
            android.view.View r0 = r0.A02()
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r9)
            android.widget.ImageView r0 = r3.A06
            r0.setVisibility(r1)
            goto L_0x0172
        L_0x0220:
            X.1bI r0 = r3.A0H
            r0.A04(r2)
            X.1bI r0 = r3.A0H
            goto L_0x0210
        L_0x0228:
            android.graphics.drawable.Drawable r1 = X.C63422t3.A00(r11, r9, r5)
            android.widget.ImageView r0 = r3.A06
            r0.setImageDrawable(r1)
            goto L_0x0172
        L_0x0233:
            android.widget.ImageView r0 = r3.A06
            r0.setVisibility(r9)
            r8 = r10
            goto L_0x0171
        L_0x023b:
            r6 = 0
            goto L_0x0068
        L_0x023e:
            X.118 r0 = r4.A08
            android.content.Context r0 = r0.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131890864(0x7f1212b0, float:1.9416432E38)
            java.lang.String r6 = r1.getString(r0)
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42461yD.A0H(X.1E7, X.1E7, com.whatsapp.jid.GroupJid, X.206):void");
    }

    public void A0I() {
        C59492mO r0 = this.A00;
        if (r0 != null) {
            r0.A02();
            this.A00 = null;
        }
    }

    public void A0J(C39621tN r14, C38341r8 r15, C139106yE r16, int i, boolean z) {
        C39211sh r1;
        AnonymousClass1BI A012;
        int i2 = i;
        if (this instanceof AnonymousClass2D5) {
            AnonymousClass2D5 r4 = (AnonymousClass2D5) this;
            AnonymousClass1M9 r6 = r4.A02;
            AnonymousClass206 r5 = ((AnonymousClass2NZ) r14).A00;
            AnonymousClass1E7 A002 = AnonymousClass25G.A00(r6, r5);
            AnonymousClass1E7 r12 = null;
            if (A002 == null || ((A012 = AnonymousClass25G.A01(r4.A03, A002, r5)) != null && (r12 = r6.A0D(A012)) == null)) {
                C18000vb r8 = r4.A05;
                C42071xZ r2 = r4.A06;
                C27641Ww.A07(r2.A02, r8, r4.A01.getResources().getDimensionPixelSize(2131167291), 0, 0, 0);
                r2.A01.setVisibility(8);
                r2.A08.setVisibility(8);
                r2.A0L.A04(8);
                r2.A0P.A04(8);
                r2.A06.setVisibility(8);
                r2.A05.setVisibility(8);
                r2.A0M.A04(8);
                r2.A0N.A04(8);
                r2.A0O.A04(8);
                r2.A0D.A04(8);
                r2.A0L(false, false);
                r2.A07.setVisibility(0);
                C43411zl.A00(r2.A07);
                r2.A07.A0L();
                r2.A07.setText("");
                r2.A07.setPlaceholder(80);
                r2.A09.A02();
                C116715yV r22 = new C116715yV(r4.A03, r6, r5);
                r4.A00 = r22;
                r4.A03.A00(new C143617Ec(r4, 0), r22);
            } else {
                AnonymousClass2D5.A00(new C128376ft(A002, r12, r5), r4);
            }
        } else {
            AnonymousClass2D6 r7 = (AnonymousClass2D6) this;
            C48582Na r142 = (C48582Na) r14;
            C139106yE r0 = r16;
            if (r16 != null) {
                r7.A00 = r0;
            }
            AnonymousClass1E7 r82 = r142.A00;
            Jid A062 = r82.A06(AnonymousClass1BI.class);
            C17960vV.A07(A062);
            AnonymousClass1BI r62 = (AnonymousClass1BI) A062;
            C42071xZ r52 = r7.A06;
            r52.A02.setPadding(0, 0, 0, 0);
            r7.A02.A07(r52.A04, r82);
            if (!C22971Dz.A0c(r62)) {
                r52.A04.setEnabled(true);
                StringBuilder sb = new StringBuilder();
                sb.append("com.whatsapp.conversationslist.ConversationsFragment");
                sb.append(C22971Dz.A06(r62));
                AnonymousClass1Xr.A04(r52.A04, sb.toString());
                AnonymousClass78T r11 = new AnonymousClass78T(r7, i2, 12, r62);
                C90014dO r9 = new C90014dO(r7, r62, 8);
                C1421578j r13 = new C1421578j(r62, r7, 6);
                boolean A013 = C36301nf.A01(r7.A0B, 11563);
                ImageView imageView = r52.A04;
                if (A013) {
                    imageView.setOnClickListener(r9);
                    r52.A01.setOnClickListener(r9);
                } else {
                    imageView.setOnClickListener(r11);
                    r52.A01.setOnClickListener(r11);
                }
                r52.A04.setOnLongClickListener(r13);
                View view = r52.A0H;
                view.setOnClickListener(r9);
                view.setOnLongClickListener(r13);
                r52.A01.setOnLongClickListener(r13);
                ImageView imageView2 = r52.A04;
                if (imageView2 instanceof WDSProfilePhoto) {
                    C139106yE r17 = r7.A00;
                    WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) imageView2;
                    boolean A032 = AnonymousClass73K.A03(r17, false);
                    wDSProfilePhoto.setStatusIndicatorEnabled(A032);
                    if (A032) {
                        if (r17.A01 > 0) {
                            r1 = C39211sh.UNSEEN;
                        } else {
                            r1 = C39211sh.SEEN_CHATLIST;
                        }
                        wDSProfilePhoto.setProfileStatus(new C39231sj(r1));
                    }
                }
            } else {
                C90014dO r18 = new C90014dO(r7, r62, 9);
                r52.A04.setEnabled(false);
                r52.A04.setOnClickListener(r18);
                r52.A04.setOnLongClickListener((View.OnLongClickListener) null);
                View view2 = r52.A0H;
                view2.setOnClickListener(r18);
                view2.setOnLongClickListener((View.OnLongClickListener) null);
                r52.A01.setOnClickListener(r18);
                r52.A01.setOnLongClickListener((View.OnLongClickListener) null);
            }
            r52.A0L(false, false);
            r52.A01.setVisibility(0);
            r52.A07.setVisibility(0);
            r52.A08.setVisibility(8);
            r52.A0M.A04(8);
            C28931bI r92 = r52.A0O;
            AnonymousClass1Nb r02 = r7.A05;
            C17960vV.A07(r62);
            boolean A0y = r02.A0y(r62);
            int i3 = 8;
            if (A0y) {
                i3 = 0;
            }
            r92.A04(i3);
            r52.A0L.A04(8);
            r52.A06.setVisibility(8);
            r52.A05.setVisibility(8);
            r52.A0P.A04(8);
            r52.A06.setVisibility(8);
            r52.A05.setVisibility(8);
            r52.A0D.A04(8);
            r52.A0N.A04(8);
            C43411zl.A00(r52.A07);
            r52.A07.A0L();
            r52.A07.setPlaceholder(0);
            C42131xg r93 = r52.A09;
            Context context = r7.A01;
            r93.A06.getDateView().setTextColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130970340, 2131101312)));
            r52.A09.A04(r82, r7.A0G, r7.A03.BXB());
            r52.A09.A03.A0E(r82);
            TextEmojiLabel textEmojiLabel = r52.A07;
            String str = r82.A0Z;
            if (str == null) {
                str = "";
            }
            textEmojiLabel.A0R(str);
            r52.A07.setVisibility(0);
            r52.A09.A03(0);
            String A022 = C24921Me.A02(context, r7.A04, r82);
            if (A022 != null) {
                r52.A09.A06(A022, (CharSequence) null);
            }
            Resources resources = r52.A04.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(2131166074);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(2131166369);
            C39191sf r23 = C39191sf.SMALL;
            if (dimensionPixelSize != resources.getDimensionPixelSize(r23.dimension)) {
                r23 = C39191sf.MEDIUM;
            }
            ImageView imageView3 = r52.A04;
            if (imageView3 instanceof WDSProfilePhoto) {
                ((WDSProfilePhoto) imageView3).setProfilePhotoSize(r23);
            } else {
                C42491yG.A09(imageView3, dimensionPixelSize, dimensionPixelSize);
            }
            C42491yG.A07(r52.A01, dimensionPixelSize2);
            r52.A02.setMinimumHeight(dimensionPixelSize2);
        }
        if (r15 != null) {
            r15.C4E(i2);
        }
    }

    public void A0K(AnonymousClass1E7 r6, AnonymousClass1E7 r7, GroupJid groupJid, AnonymousClass206 r9, boolean z) {
        String str;
        StringBuilder sb;
        if (r7 == null || !z) {
            str = null;
        } else {
            str = C63422t3.A01(this.A02, this.A03, this.A05, r7, r6);
        }
        C42071xZ r3 = this.A06;
        r3.A0R.A04(8);
        if (TextUtils.isEmpty(str)) {
            r3.A08.setVisibility(8);
            return;
        }
        if ((!C18000vb.A00(this.A09).A06) == C27641Ww.A0D(str)) {
            sb.append(str);
            sb.append(": ");
        } else {
            sb = new StringBuilder();
            sb.append(" :");
            sb.append(str);
        }
        r3.A08.A0R(sb.toString());
        r3.A08.setVisibility(0);
    }

    public C42461yD(Context context, AnonymousClass11S r3, C32191gn r4, C37551pj r5, AnonymousClass1M9 r6, C24921Me r7, C34021jm r8, C42071xZ r9, AnonymousClass11C r10, AnonymousClass11P r11, AnonymousClass118 r12, C18000vb r13, AnonymousClass1CJ r14, AnonymousClass1NA r15, C42351y2 r16, C18030ve r17, AnonymousClass12L r18, C42211xo r19, C32091gc r20, AnonymousClass1QO r21, AnonymousClass1QS r22, AnonymousClass1R2 r23, C42341y1 r24, AnonymousClass1PU r25, C43351zf r26, AnonymousClass00H r27, AnonymousClass00H r28) {
        this.A06 = r9;
        this.A02 = context;
        this.A07 = r11;
        this.A0B = r17;
        this.A0Q = r20;
        this.A03 = r3;
        this.A08 = r12;
        this.A0A = r14;
        this.A0P = r18;
        this.A0F = r23;
        this.A04 = r6;
        this.A0O = r15;
        this.A0N = r10;
        this.A05 = r7;
        this.A09 = r13;
        this.A0R = r25;
        this.A0E = r22;
        this.A0G = r26;
        this.A0L = r5;
        this.A0C = r19;
        this.A0D = r21;
        this.A0K = r4;
        this.A0M = r8;
        this.A01 = r16;
        this.A0I = r24;
        this.A0H = r27;
        this.A0J = r28;
    }

    public static Drawable A01(Context context, ImageView imageView, AnonymousClass215 r5) {
        Drawable drawable = null;
        if (r5.Bbc() != 1) {
            drawable = AnonymousClass4aX.A02(context, 2131232668, 2131101888);
        }
        imageView.setImageDrawable(drawable);
        Drawable A022 = AnonymousClass4aX.A02(context, 2131232657, 2131101888);
        imageView.setBackground(A022);
        imageView.setVisibility(0);
        return A022;
    }

    public static String A02(Context context, AnonymousClass215 r3) {
        int i;
        int Bbc = r3.Bbc();
        if (Bbc != 0) {
            if (Bbc == 1) {
                i = 2131897928;
                return context.getString(i);
            } else if (Bbc != 2) {
                throw new IllegalStateException("unhandled view once state");
            }
        }
        if (r3 instanceof AnonymousClass22W) {
            i = 2131889027;
        } else if (r3 instanceof C441122e) {
            i = 2131889038;
        } else {
            i = 2131889036;
            if (r3 instanceof C444523m) {
                i = 2131897906;
            }
        }
        return context.getString(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v56, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v57, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v59, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v60, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v91, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v113, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v119, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v131, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v132, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v133, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v134, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v136, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v137, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v138, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v139, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v140, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v142, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v143, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v144, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v145, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v146, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v147, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v148, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v151, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v212, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v213, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v214, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v216, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v217, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v218, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v223, resolved type: java.lang.CharSequence} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v224, resolved type: java.lang.CharSequence} */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0555, code lost:
        if (r2.A03 != 5) goto L_0x0557;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (((X.C436420i) r15).A00 != 2) goto L_0x0015;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x055d  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x066a  */
    /* JADX WARNING: Removed duplicated region for block: B:423:0x0a99  */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x0a9e  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0ba8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0G(X.AnonymousClass206 r15) {
        /*
            r14 = this;
            X.AW0 r2 = X.AnonymousClass25B.A00(r15)
            X.1xZ r3 = r14.A06
            X.1bI r6 = r3.A0P
            boolean r8 = r15 instanceof X.C436420i
            if (r8 == 0) goto L_0x0015
            r0 = r15
            X.20i r0 = (X.C436420i) r0
            int r4 = r0.A00
            r0 = 2
            r1 = 1
            if (r4 == r0) goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r7 = 8
            r5 = 0
            r0 = 8
            if (r1 == 0) goto L_0x001e
            r0 = 0
        L_0x001e:
            r6.A04(r0)
            boolean r1 = r15 instanceof X.AnonymousClass210
            r6 = 5
            java.lang.String r4 = ""
            r0 = 0
            if (r1 == 0) goto L_0x012a
            boolean r1 = r15 instanceof X.AnonymousClass216
            if (r1 == 0) goto L_0x00bb
            r2 = r15
            X.216 r2 = (X.AnonymousClass216) r2
            android.content.Context r1 = r14.A02
            java.lang.String r4 = A02(r1, r2)
            android.widget.ImageView r0 = r3.A05
            android.graphics.drawable.Drawable r0 = A01(r1, r0, r2)
        L_0x003c:
            boolean r1 = r4 instanceof java.lang.String
            if (r1 == 0) goto L_0x0048
            java.lang.String r4 = (java.lang.String) r4
            r1 = 128(0x80, float:1.794E-43)
            java.lang.String r4 = X.AnonymousClass1EG.A0E(r4, r1)
        L_0x0048:
            android.content.Context r7 = r14.A02
            X.1gc r6 = r14.A0Q
            java.util.List r1 = r15.A0h
            if (r1 == 0) goto L_0x0cf3
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>(r4)
            java.util.List r1 = r15.A0h
            int r1 = r1.size()
            r3 = 100
            if (r1 <= r3) goto L_0x0086
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "ConversationPreviewUtil/addMentionSpansToMessageText too many mentions/"
            r2.append(r1)
            java.lang.Class r1 = r5.getClass()
            r2.append(r1)
            java.lang.String r1 = " "
            r2.append(r1)
            java.util.List r1 = r15.A0h
            int r1 = r1.size()
            int r1 = r1 / r3
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x0086:
            java.util.List r2 = r15.A0h
            r9 = 0
            if (r2 == 0) goto L_0x0cf4
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0cf4
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x0cf4
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.Iterator r4 = r2.iterator()
        L_0x00a0:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0c85
            java.lang.Object r3 = r4.next()
            X.3Bi r3 = (X.C70503Bi) r3
            if (r3 == 0) goto L_0x00a0
            java.lang.String r2 = X.AnonymousClass4aJ.A00(r3)
            X.0yx r1 = new X.0yx
            r1.<init>(r3, r9)
            r8.put(r2, r1)
            goto L_0x00a0
        L_0x00bb:
            boolean r1 = X.C20097A7a.A05(r15)
            if (r1 == 0) goto L_0x00f5
            java.lang.String r2 = X.C20097A7a.A02(r15)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00cc
            r4 = r2
        L_0x00cc:
            java.lang.String r1 = r15.A0P()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x003c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "*"
            r2.append(r1)
            java.lang.String r1 = r15.A0P()
            r2.append(r1)
            java.lang.String r1 = "*\n\n"
            r2.append(r1)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            goto L_0x003c
        L_0x00f5:
            if (r2 != 0) goto L_0x0666
            boolean r1 = r15 instanceof X.C438721g
            if (r1 == 0) goto L_0x0111
            r2 = r15
            X.21g r2 = (X.C438721g) r2
            X.0ve r1 = r14.A0B
            boolean r1 = r2.A1D(r1)
            if (r1 == 0) goto L_0x0111
            android.content.Context r6 = r14.A02
            java.lang.String r4 = r2.A1B(r6)
            r1 = 2131232658(0x7f080792, float:1.8081431E38)
            goto L_0x0447
        L_0x0111:
            r2 = r15
            X.210 r2 = (X.AnonymousClass210) r2
            java.lang.String r1 = r2.A0S()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0124
            java.lang.String r4 = r2.A17()
            goto L_0x003c
        L_0x0124:
            java.lang.String r4 = r2.A0S()
            goto L_0x003c
        L_0x012a:
            if (r8 == 0) goto L_0x01a4
            r9 = r15
            X.20i r9 = (X.C436420i) r9
            android.content.Context r6 = r14.A02
            X.1gn r2 = r14.A0K
            com.whatsapp.TextEmojiLabel r0 = r3.A07
            android.text.TextPaint r4 = r0.getPaint()
            int r5 = r9.A00
            r0 = 3
            r1 = 2131890930(0x7f1212f2, float:1.9416566E38)
            if (r5 == r0) goto L_0x019f
            r0 = 2
            r1 = 2131890931(0x7f1212f3, float:1.9416568E38)
            if (r5 == r0) goto L_0x019f
            r0 = 169(0xa9, float:2.37E-43)
            r8 = 0
            r1 = 170(0xaa, float:2.38E-43)
            if (r5 == r0) goto L_0x0179
            if (r5 == r1) goto L_0x0179
            java.lang.String r4 = r2.A0S(r9, r8)
        L_0x0154:
            r1 = 2131231718(0x7f0803e6, float:1.8079525E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r1, r0)
            android.widget.ImageView r2 = r3.A05
            java.util.Set r1 = X.AnonymousClass2WQ.A01
            r1 = 163(0xa3, float:2.28E-43)
            if (r5 == r1) goto L_0x016e
            r1 = 162(0xa2, float:2.27E-43)
            if (r5 == r1) goto L_0x016e
            r1 = 164(0xa4, float:2.3E-43)
            if (r5 != r1) goto L_0x016f
        L_0x016e:
            r7 = 0
        L_0x016f:
            r2.setVisibility(r7)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x0179:
            X.2MQ r9 = (X.AnonymousClass2MQ) r9
            int r0 = r9.A00
            r2 = 2131890149(0x7f120fe5, float:1.9414982E38)
            if (r0 != r1) goto L_0x0185
            r2 = 2131890064(0x7f120f90, float:1.941481E38)
        L_0x0185:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r0 = r9.A01
            r1[r8] = r0
            java.lang.String r2 = r6.getString(r2, r1)
            r1 = 2131233223(0x7f0809c7, float:1.8082577E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r1, r0)
            java.lang.CharSequence r4 = X.C72813Np.A03(r4, r0, r2)
            goto L_0x0154
        L_0x019f:
            java.lang.String r4 = r6.getString(r1)
            goto L_0x0154
        L_0x01a4:
            boolean r1 = r15 instanceof X.AnonymousClass21K
            if (r1 == 0) goto L_0x01cc
            X.1y1 r2 = r14.A0I
            r1 = r15
            X.21K r1 = (X.AnonymousClass21K) r1
            X.A6j r1 = r2.A01(r1)
            if (r1 == 0) goto L_0x003c
            android.content.Context r0 = r14.A02
            java.lang.String r4 = r1.A0F(r0)
            android.graphics.drawable.Drawable r0 = r1.A05(r0)
            android.widget.ImageView r1 = r3.A05
            if (r0 == 0) goto L_0x01c2
            r7 = 0
        L_0x01c2:
            r1.setVisibility(r7)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x01cc:
            boolean r1 = r15 instanceof X.C439421n
            if (r1 == 0) goto L_0x01f2
            r4 = r15
            X.21n r4 = (X.C439421n) r4
            int r2 = X.AnonymousClass2T8.A00(r4)
            if (r2 == 0) goto L_0x01ec
            android.content.Context r1 = r14.A02
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r1, r2, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
        L_0x01ec:
            java.lang.String r4 = r4.BXV()
            goto L_0x003c
        L_0x01f2:
            boolean r1 = r15 instanceof X.AnonymousClass247
            if (r1 == 0) goto L_0x021f
            android.content.Context r2 = r14.A02
            r1 = 2131231993(0x7f0804f9, float:1.8080083E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r2 = r15
            X.247 r2 = (X.AnonymousClass247) r2
            X.118 r1 = r14.A08
            android.content.Context r3 = r1.A00
            X.0vb r4 = r14.A09
            long r5 = r2.A02
            long r7 = r2.A03
            java.lang.String r4 = X.C49852Se.A00(r3, r4, r5, r7)
            goto L_0x003c
        L_0x021f:
            boolean r1 = r15 instanceof X.C438421d
            if (r1 == 0) goto L_0x02a6
            boolean r0 = r15 instanceof X.AnonymousClass22Q
            android.content.Context r2 = r14.A02
            if (r0 == 0) goto L_0x0289
            r1 = 2131232335(0x7f08064f, float:1.8080776E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r5 = r15
            X.22Q r5 = (X.AnonymousClass22Q) r5
            java.lang.String r4 = r5.A0A
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0280
            java.lang.String r2 = r5.A02
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = " "
            if (r1 != 0) goto L_0x0264
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r4 = r1.toString()
        L_0x0264:
            java.lang.String r2 = r5.A05
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            goto L_0x003c
        L_0x0280:
            r1 = 2131886764(0x7f1202ac, float:1.9408116E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x003c
        L_0x0289:
            r1 = 2131231993(0x7f0804f9, float:1.8080083E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r1 = r15
            X.21d r1 = (X.C438421d) r1
            java.lang.String r4 = X.C63422t3.A02(r2, r1)
            goto L_0x003c
        L_0x02a6:
            boolean r1 = r15 instanceof X.C438921i
            if (r1 == 0) goto L_0x0341
            r6 = r15
            X.21i r6 = (X.C438921i) r6
            android.widget.ImageView r0 = r3.A05
            r0.setVisibility(r5)
            boolean r0 = X.A3I.A02(r15)
            if (r0 == 0) goto L_0x02cf
            android.content.Context r2 = r14.A02
            r1 = 2131232181(0x7f0805b5, float:1.8080464E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            java.lang.String r4 = X.C62872s8.A01(r2, r15)
            goto L_0x003c
        L_0x02cf:
            android.content.Context r5 = r14.A02
            r1 = 2131231685(0x7f0803c5, float:1.8079458E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r5, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            java.lang.String r2 = X.C20097A7a.A02(r15)
            java.lang.String r1 = r6.A0S()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0339
            java.lang.String r4 = r6.A01
        L_0x02f0:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto L_0x003c
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x030d
            java.lang.String r1 = r6.A19()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0334
            r1 = 2131889022(0x7f120b7e, float:1.9412696E38)
            java.lang.String r2 = r5.getString(r1)
        L_0x030d:
            int r1 = r6.A00
            if (r1 == 0) goto L_0x033e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r1 = " ("
            r3.append(r1)
            X.0vb r2 = r14.A09
            X.747 r1 = X.C62272r8.A04
            java.lang.String r1 = r1.A09(r2, r6)
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            java.lang.String r4 = r3.toString()
            goto L_0x003c
        L_0x0334:
            java.lang.String r2 = r6.A19()
            goto L_0x030d
        L_0x0339:
            java.lang.String r4 = r6.A0S()
            goto L_0x02f0
        L_0x033e:
            r4 = r2
            goto L_0x003c
        L_0x0341:
            boolean r1 = r15 instanceof X.C441822l
            r8 = 1
            if (r1 == 0) goto L_0x03aa
            r6 = r15
            X.22l r6 = (X.C441822l) r6
            boolean r1 = r15 instanceof X.C444523m
            if (r1 == 0) goto L_0x035e
            r2 = r15
            X.23m r2 = (X.C444523m) r2
            android.content.Context r1 = r14.A02
            java.lang.String r4 = A02(r1, r2)
            android.widget.ImageView r0 = r3.A05
            android.graphics.drawable.Drawable r0 = A01(r1, r0, r2)
            goto L_0x003c
        L_0x035e:
            int r1 = r6.A09
            if (r1 != r8) goto L_0x038b
            int r1 = r6.A0D
            if (r1 == 0) goto L_0x0381
            X.0vb r4 = r14.A09
            int r1 = r6.A0D
            long r1 = (long) r1
            java.lang.String r4 = X.C64052u8.A0D(r4, r0, r1)
        L_0x036f:
            android.content.Context r0 = r14.A02
            android.graphics.drawable.Drawable r0 = X.AnonymousClass72W.A01(r0, r6)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x0381:
            android.content.Context r1 = r14.A02
            r0 = 2131889040(0x7f120b90, float:1.9412732E38)
            java.lang.String r4 = r1.getString(r0)
            goto L_0x036f
        L_0x038b:
            android.content.Context r2 = r14.A02
            r0 = 2131889017(0x7f120b79, float:1.9412686E38)
            java.lang.String r4 = r2.getString(r0)
            r1 = 2131231963(0x7f0804db, float:1.8080022E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x03aa:
            boolean r1 = r15 instanceof X.AnonymousClass21Y
            if (r1 == 0) goto L_0x03cd
            r4 = r15
            X.21Y r4 = (X.AnonymousClass21Y) r4
            android.content.Context r2 = r14.A02
            r1 = 2131232402(0x7f080692, float:1.8080912E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            java.lang.String r4 = X.C63422t3.A03(r2, r4)
            goto L_0x003c
        L_0x03cd:
            boolean r1 = r15 instanceof X.C440922c
            if (r1 == 0) goto L_0x03f4
            android.content.Context r6 = r14.A02
            r1 = 2131232402(0x7f080692, float:1.8080912E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r2 = 2131889033(0x7f120b89, float:1.9412718E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r5] = r4
            java.lang.String r4 = r6.getString(r2, r1)
            goto L_0x003c
        L_0x03f4:
            boolean r1 = r15 instanceof X.C440021t
            if (r1 == 0) goto L_0x042a
            r4 = r15
            X.21V r4 = (X.AnonymousClass21V) r4
            android.content.Context r2 = r14.A02
            r1 = 2131232659(0x7f080793, float:1.8081434E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            java.lang.String r1 = r4.A18()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0424
            r1 = 2131889023(0x7f120b7f, float:1.9412698E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x003c
        L_0x0424:
            java.lang.String r4 = r4.A18()
            goto L_0x003c
        L_0x042a:
            boolean r1 = r15 instanceof X.C442222p
            if (r1 == 0) goto L_0x045d
            r1 = r15
            X.22p r1 = (X.C442222p) r1
            java.lang.String r0 = r1.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x045a
            android.content.Context r1 = r14.A02
            r0 = 2131889020(0x7f120b7c, float:1.9412692E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x0442:
            android.content.Context r6 = r14.A02
            r1 = 2131232181(0x7f0805b5, float:1.8080464E38)
        L_0x0447:
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r1, r0)
        L_0x044e:
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x045a:
            java.lang.String r4 = r1.A00
            goto L_0x0442
        L_0x045d:
            boolean r1 = r15 instanceof X.C442022n
            if (r1 == 0) goto L_0x046b
            X.118 r1 = r14.A08
            r0 = r15
            X.22n r0 = (X.C442022n) r0
            java.lang.String r4 = X.C124306Xv.A00(r1, r0)
            goto L_0x0442
        L_0x046b:
            boolean r1 = r15 instanceof X.AnonymousClass21B
            if (r1 == 0) goto L_0x0496
            java.lang.String r4 = X.C20097A7a.A02(r15)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x048d
            r1 = r15
            X.21B r1 = (X.AnonymousClass21B) r1
            java.lang.String r0 = r1.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0493
            android.content.Context r1 = r14.A02
            r0 = 2131889029(0x7f120b85, float:1.941271E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x048d:
            android.content.Context r6 = r14.A02
            r1 = 2131232060(0x7f08053c, float:1.8080219E38)
            goto L_0x0447
        L_0x0493:
            java.lang.String r4 = r1.A01
            goto L_0x048d
        L_0x0496:
            boolean r1 = r15 instanceof X.AnonymousClass219
            if (r1 == 0) goto L_0x04b4
            r0 = r15
            X.219 r0 = (X.AnonymousClass219) r0
            java.lang.String r4 = r0.A03
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x04ae
            android.content.Context r1 = r14.A02
            r0 = 2131889028(0x7f120b84, float:1.9412708E38)
            java.lang.String r4 = r1.getString(r0)
        L_0x04ae:
            android.content.Context r6 = r14.A02
            r1 = 2131232018(0x7f080512, float:1.8080133E38)
            goto L_0x0447
        L_0x04b4:
            boolean r1 = X.C20133A8t.A0A(r15)
            if (r1 == 0) goto L_0x0502
            if (r2 != 0) goto L_0x0666
            boolean r1 = r15 instanceof X.AnonymousClass24J
            if (r1 == 0) goto L_0x003c
            r0 = r15
            X.24J r0 = (X.AnonymousClass24J) r0
            java.lang.Integer r1 = r0.A00
            if (r1 == 0) goto L_0x0807
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0807
            X.0ve r2 = r14.A0B
            r1 = 6673(0x1a11, float:9.351E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0807
            X.11S r0 = r14.A03
            boolean r0 = r0.A0N()
            if (r0 == 0) goto L_0x0807
            android.content.Context r6 = r14.A02
            r1 = 2131233436(0x7f080a9c, float:1.808301E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r2 = 2131893421(0x7f121cad, float:1.9421618E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r5] = r4
            java.lang.String r4 = r6.getString(r2, r1)
            goto L_0x003c
        L_0x0502:
            boolean r1 = r15 instanceof X.AnonymousClass22O
            if (r1 == 0) goto L_0x054d
            r7 = r15
            X.22O r7 = (X.AnonymousClass22O) r7
            int r2 = r7.A17()
            if (r2 == 0) goto L_0x0549
            r1 = 2131889039(0x7f120b8f, float:1.941273E38)
            if (r2 == r8) goto L_0x051d
            r0 = 2
            r1 = 2131889026(0x7f120b82, float:1.9412704E38)
            if (r2 == r0) goto L_0x051d
            r1 = 2131889025(0x7f120b81, float:1.9412702E38)
        L_0x051d:
            android.content.Context r6 = r14.A02
            java.lang.String r4 = r6.getString(r1)
            android.widget.ImageView r0 = r3.A05
            r0.setVisibility(r5)
            boolean r0 = r7.A18()
            r2 = 2131232192(0x7f0805c0, float:1.8080486E38)
            if (r0 == 0) goto L_0x0534
            r2 = 2131232109(0x7f08056d, float:1.8080318E38)
        L_0x0534:
            r1 = 2130970567(0x7f0407c7, float:1.7549848E38)
            r0 = 2131101886(0x7f0608be, float:1.7816194E38)
            int r0 = X.AnonymousClass1YL.A00(r6, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r2, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x0549:
            r1 = 2131889041(0x7f120b91, float:1.9412734E38)
            goto L_0x051d
        L_0x054d:
            boolean r1 = r15 instanceof X.AnonymousClass23U
            if (r1 == 0) goto L_0x05ab
            if (r2 == 0) goto L_0x0c21
            int r1 = r2.A03
            if (r1 == r6) goto L_0x0c21
        L_0x0557:
            X.AW0 r6 = X.AnonymousClass25B.A00(r15)
            if (r6 == 0) goto L_0x0592
            android.content.Context r5 = r14.A02
            java.lang.CharSequence r3 = X.AnonymousClass1R2.A04(r5, r6)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L_0x0592
            X.1QO r1 = r14.A0D
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x05a6
            X.1QS r2 = r14.A0E
            java.lang.String r1 = r6.A0G
            X.2is r2 = r2.A04(r1)
            if (r2 == 0) goto L_0x05a6
            java.lang.String r1 = r6.A0I
            X.BD1 r1 = r2.A00(r1)
            if (r1 == 0) goto L_0x05a6
            int r2 = r1.Bah(r6)
        L_0x0587:
            android.content.res.Resources r1 = r5.getResources()
            int r1 = r1.getColor(r2)
            r14.A04(r3, r1)
        L_0x0592:
            X.1R2 r6 = r14.A0F
            X.AW0 r5 = X.AnonymousClass25B.A00(r15)
            if (r5 == 0) goto L_0x003c
            int r2 = r5.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r2 != r1) goto L_0x0826
            java.lang.String r4 = X.AnonymousClass1R2.A0B(r5, r6)
            goto L_0x003c
        L_0x05a6:
            int r2 = X.AnonymousClass1R2.A01(r6)
            goto L_0x0587
        L_0x05ab:
            boolean r1 = r15 instanceof X.AnonymousClass23O
            if (r1 == 0) goto L_0x0602
            r0 = r15
            X.23O r0 = (X.AnonymousClass23O) r0
            com.whatsapp.jid.UserJid r4 = r0.A00
            boolean r0 = r15.A0w()
            if (r0 == 0) goto L_0x05c8
            android.content.Context r6 = r14.A02
            r0 = 2131895352(0x7f122438, float:1.9425535E38)
        L_0x05bf:
            java.lang.String r4 = r6.getString(r0)
        L_0x05c3:
            r1 = 2131231720(0x7f0803e8, float:1.8079529E38)
            goto L_0x0447
        L_0x05c8:
            X.11S r0 = r14.A03
            boolean r0 = r0.A0O(r4)
            if (r0 == 0) goto L_0x05d6
            android.content.Context r6 = r14.A02
            r0 = 2131886554(0x7f1201da, float:1.940769E38)
            goto L_0x05bf
        L_0x05d6:
            if (r4 != 0) goto L_0x05de
            android.content.Context r6 = r14.A02
            r0 = 2131886552(0x7f1201d8, float:1.9407686E38)
            goto L_0x05bf
        L_0x05de:
            X.1Me r2 = r14.A05
            X.205 r0 = r15.A0v
            X.1BI r0 = r0.A00
            int r1 = r2.A0B(r0)
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r8]
            r0[r5] = r4
            java.util.ArrayList r0 = X.C220618l.newArrayList((java.lang.Object[]) r0)
            java.lang.String r2 = r2.A0a(r0, r1)
            android.content.Context r6 = r14.A02
            r1 = 2131886553(0x7f1201d9, float:1.9407688E38)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r5] = r2
            java.lang.String r4 = r6.getString(r1, r0)
            goto L_0x05c3
        L_0x0602:
            boolean r1 = r15 instanceof X.AnonymousClass23N
            if (r1 == 0) goto L_0x0643
            boolean r1 = r15.A0w()
            X.205 r0 = r15.A0v
            boolean r0 = r0.A02
            android.content.Context r6 = r14.A02
            if (r0 == 0) goto L_0x063a
            r0 = 2131895353(0x7f122439, float:1.9425537E38)
            if (r1 == 0) goto L_0x061a
            r0 = 2131895354(0x7f12243a, float:1.9425539E38)
        L_0x061a:
            java.lang.String r4 = r6.getString(r0)
            X.0vb r0 = r14.A09
            X.1Wz r0 = X.C18000vb.A00(r0)
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x05c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 160(0xa0, float:2.24E-43)
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            goto L_0x05c3
        L_0x063a:
            r0 = 2131895351(0x7f122437, float:1.9425533E38)
            if (r1 == 0) goto L_0x061a
            r0 = 2131895352(0x7f122438, float:1.9425535E38)
            goto L_0x061a
        L_0x0643:
            boolean r1 = r15 instanceof X.C439821r
            if (r1 == 0) goto L_0x0652
            android.content.Context r2 = r14.A02
            r1 = 2131899348(0x7f1233d4, float:1.943364E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x003c
        L_0x0652:
            boolean r1 = r15 instanceof X.C441322g
            if (r1 == 0) goto L_0x0689
            if (r2 != 0) goto L_0x0666
            android.content.Context r6 = r14.A02
            r0 = 2131889034(0x7f120b8a, float:1.941272E38)
            java.lang.String r4 = r6.getString(r0)
            r1 = 2131232326(0x7f080646, float:1.8080758E38)
            goto L_0x0447
        L_0x0666:
            int r1 = r2.A03
            if (r1 != r6) goto L_0x0557
            android.content.Context r2 = r14.A02
            r1 = 2131232667(0x7f08079b, float:1.808145E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r1 = 2131889045(0x7f120b95, float:1.9412742E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x003c
        L_0x0689:
            boolean r1 = r15 instanceof X.C441522i
            if (r1 == 0) goto L_0x069b
            android.content.Context r6 = r14.A02
            r0 = 2131889035(0x7f120b8b, float:1.9412722E38)
            java.lang.String r4 = r6.getString(r0)
            r1 = 2131232329(0x7f080649, float:1.8080764E38)
            goto L_0x0447
        L_0x069b:
            boolean r1 = r15 instanceof X.AnonymousClass21G
            if (r1 == 0) goto L_0x06b8
            android.content.Context r4 = r14.A02
            X.205 r1 = r15.A0v
            boolean r1 = r1.A02
            r2 = 2131893677(0x7f121dad, float:1.9422137E38)
            if (r1 == 0) goto L_0x06ad
            r2 = 2131893710(0x7f121dce, float:1.9422204E38)
        L_0x06ad:
            java.lang.String r4 = r4.getString(r2)
            android.widget.ImageView r1 = r3.A06
            r1.setVisibility(r7)
            goto L_0x003c
        L_0x06b8:
            boolean r1 = r15 instanceof X.AnonymousClass21I
            if (r1 == 0) goto L_0x06cb
            android.content.Context r4 = r14.A02
            X.205 r1 = r15.A0v
            boolean r1 = r1.A02
            r2 = 2131893708(0x7f121dcc, float:1.94222E38)
            if (r1 == 0) goto L_0x06ad
            r2 = 2131893709(0x7f121dcd, float:1.9422202E38)
            goto L_0x06ad
        L_0x06cb:
            boolean r1 = r15 instanceof X.AnonymousClass23S
            if (r1 == 0) goto L_0x06fc
            r0 = r15
            X.23S r0 = (X.AnonymousClass23S) r0
            int r0 = r0.A00
            r1 = 1
            if (r0 == r8) goto L_0x06d8
            r1 = 0
        L_0x06d8:
            android.content.Context r2 = r14.A02
            r0 = 2131891016(0x7f121348, float:1.941674E38)
            if (r1 == 0) goto L_0x06e2
            r0 = 2131893510(0x7f121d06, float:1.9421799E38)
        L_0x06e2:
            java.lang.String r4 = r2.getString(r0)
            r1 = 2131232663(0x7f080797, float:1.8081442E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            goto L_0x003c
        L_0x06fc:
            boolean r1 = r15 instanceof X.AnonymousClass22U
            if (r1 == 0) goto L_0x0737
            X.0ve r4 = r14.A0B
            r1 = 4893(0x131d, float:6.857E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x072b
            android.content.Context r2 = r14.A02
            r0 = 2131893296(0x7f121c30, float:1.9421365E38)
            java.lang.String r4 = r2.getString(r0)
        L_0x0715:
            r1 = 2131232304(0x7f080630, float:1.8080713E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            goto L_0x003c
        L_0x072b:
            r1 = r15
            X.22U r1 = (X.AnonymousClass22U) r1
            android.content.Context r2 = r14.A02
            X.0vb r0 = r14.A09
            java.lang.String r4 = X.C50062Sz.A00(r2, r0, r4, r1)
            goto L_0x0715
        L_0x0737:
            boolean r1 = r15 instanceof X.C442822v
            if (r1 == 0) goto L_0x075f
            r6 = r15
            X.22v r6 = (X.C442822v) r6
            X.1gn r5 = r14.A0K
            X.205 r2 = r6.A0v
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x075c
            X.11S r1 = r14.A03
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r4 = r1.A0E
        L_0x074d:
            int r2 = r6.A00
            int r1 = r6.A04
            java.lang.String r4 = r5.A0M(r4, r2, r1, r8)
            android.widget.ImageView r1 = r3.A06
            r1.setVisibility(r7)
            goto L_0x003c
        L_0x075c:
            X.1BI r4 = r2.A00
            goto L_0x074d
        L_0x075f:
            boolean r1 = r15 instanceof X.AnonymousClass22W
            if (r1 == 0) goto L_0x0774
            r2 = r15
            X.22W r2 = (X.AnonymousClass22W) r2
            android.content.Context r1 = r14.A02
            java.lang.String r4 = A02(r1, r2)
            android.widget.ImageView r0 = r3.A05
            android.graphics.drawable.Drawable r0 = A01(r1, r0, r2)
            goto L_0x003c
        L_0x0774:
            boolean r1 = r15 instanceof X.C441122e
            if (r1 == 0) goto L_0x0789
            r2 = r15
            X.22e r2 = (X.C441122e) r2
            android.content.Context r1 = r14.A02
            java.lang.String r4 = A02(r1, r2)
            android.widget.ImageView r0 = r3.A05
            android.graphics.drawable.Drawable r0 = A01(r1, r0, r2)
            goto L_0x003c
        L_0x0789:
            boolean r1 = r15 instanceof X.AnonymousClass21D
            if (r1 == 0) goto L_0x07ee
            X.1R2 r7 = r14.A0F
            r9 = r15
            X.21D r9 = (X.AnonymousClass21D) r9
            int r2 = r9.A00
            r1 = 3
            if (r2 != r1) goto L_0x0c21
            android.content.Context r6 = r14.A02
            X.205 r1 = r15.A0v
            boolean r4 = r1.A02
            X.1BI r3 = r1.A00
            X.C17960vV.A07(r3)
            X.1Me r2 = r7.A02
            X.1M9 r1 = r7.A01
            X.1E7 r1 = r1.A0H(r3)
            java.lang.String r3 = r2.A0O(r1)
            X.1QO r1 = r7.A09
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x07bb
            X.1QS r1 = r7.A0A
            r1.A06()
        L_0x07bb:
            r2 = 2131893648(0x7f121d90, float:1.9422078E38)
            if (r4 == 0) goto L_0x07c3
            r2 = 2131893649(0x7f121d91, float:1.942208E38)
        L_0x07c3:
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r5] = r3
            java.lang.String r4 = r6.getString(r2, r1)
            int r1 = r9.A00
            android.text.SpannableStringBuilder r5 = r7.A0J(r6, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x003c
            android.content.res.Resources r3 = r6.getResources()
            r2 = 2130970727(0x7f040867, float:1.7550172E38)
            r1 = 2131102146(0x7f0609c2, float:1.7816722E38)
            int r1 = X.AnonymousClass1YL.A00(r6, r2, r1)
            int r1 = r3.getColor(r1)
            r14.A04(r5, r1)
            goto L_0x003c
        L_0x07ee:
            boolean r1 = r15 instanceof X.AnonymousClass22G
            if (r1 == 0) goto L_0x0889
            r0 = r15
            X.22G r0 = (X.AnonymousClass22G) r0
            java.lang.String r4 = r0.BXE()
            r2 = 2131232664(0x7f080798, float:1.8081444E38)
            android.content.Context r1 = r14.A02
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r1, r2, r0)
            goto L_0x044e
        L_0x0807:
            android.content.Context r2 = r14.A02
            r1 = 2131232661(0x7f080795, float:1.8081438E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r1 = 2131889021(0x7f120b7d, float:1.9412694E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x003c
        L_0x0826:
            java.lang.String r1 = r5.A0I
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x083e
            X.1KN r1 = r5.A09
            if (r1 == 0) goto L_0x083e
            X.1KJ r3 = r5.A01()
            X.0vb r2 = r6.A05
            X.1KN r1 = r5.A09
            java.lang.String r4 = r3.BLa(r2, r1)
        L_0x083e:
            boolean r1 = r15 instanceof X.C441322g
            java.lang.String r5 = " • "
            if (r1 == 0) goto L_0x0863
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r5)
            X.118 r1 = r6.A04
            android.content.Context r2 = r1.A00
            r1 = 2131896431(0x7f12286f, float:1.9427723E38)
            java.lang.String r1 = r2.getString(r1)
            r3.append(r1)
            java.lang.String r4 = r3.toString()
            goto L_0x003c
        L_0x0863:
            int r1 = r15.A0u
            if (r1 != 0) goto L_0x003c
            java.lang.String r1 = r15.A0P()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x003c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r1 = r15.A0P()
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L_0x003c
        L_0x0889:
            boolean r1 = r15 instanceof X.C443222z
            if (r1 == 0) goto L_0x08b7
            X.118 r7 = r14.A08
            android.content.Context r6 = r7.A00
            r4 = 2131231856(0x7f080470, float:1.8079805E38)
            android.content.Context r2 = r14.A02
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            r0 = 2131100231(0x7f060247, float:1.7812838E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r4, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r1 = 2131894651(0x7f12217b, float:1.9424113E38)
            java.lang.String r4 = r7.A01(r1)
            goto L_0x003c
        L_0x08b7:
            boolean r1 = r15 instanceof X.C443022x
            if (r1 == 0) goto L_0x08e5
            X.118 r7 = r14.A08
            android.content.Context r6 = r7.A00
            r4 = 2131231856(0x7f080470, float:1.8079805E38)
            android.content.Context r2 = r14.A02
            r1 = 2130969234(0x7f040292, float:1.7547144E38)
            r0 = 2131100231(0x7f060247, float:1.7812838E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r6, r4, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r1 = 2131894666(0x7f12218a, float:1.9424143E38)
            java.lang.String r4 = r7.A01(r1)
            goto L_0x003c
        L_0x08e5:
            boolean r1 = r15 instanceof X.C444223j
            if (r1 == 0) goto L_0x0908
            X.118 r1 = r14.A08
            android.content.Context r3 = r1.A00
            X.1M9 r4 = r14.A04
            X.1Me r5 = r14.A05
            X.0vb r6 = r14.A09
            X.205 r2 = r15.A0v
            boolean r11 = r2.A02
            r1 = r15
            X.23j r1 = (X.C444223j) r1
            long r9 = r1.A01
            X.1BI r7 = r2.A00
            com.whatsapp.jid.UserJid r8 = r15.A0I()
            java.lang.String r4 = X.C63982u1.A02(r3, r4, r5, r6, r7, r8, r9, r11)
            goto L_0x003c
        L_0x0908:
            boolean r1 = r15 instanceof X.AnonymousClass22M
            if (r1 == 0) goto L_0x0be8
            r7 = r15
            X.22M r7 = (X.AnonymousClass22M) r7
            X.25F r1 = r7.A00
            X.229 r2 = r1.A02
            if (r2 == 0) goto L_0x003c
            X.00H r0 = r14.A0H
            java.lang.Object r9 = r0.get()
            X.1yO r9 = (X.C42571yO) r9
            X.118 r4 = r14.A08
            X.C18070vi.A0d(r4, r5)
            X.00H r2 = r9.A08
            r2.get()
            X.229 r0 = r1.A02
            X.9Bw r0 = (X.C178119Bw) r0
            if (r0 == 0) goto L_0x0a28
            com.whatsapp.jid.GroupJid r0 = r0.A0C
            if (r0 == 0) goto L_0x0a28
            X.11S r11 = r9.A00
            X.229 r1 = r1.A02
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.9Bw r1 = (X.C178119Bw) r1
            boolean r0 = X.C42571yO.A06(r7, r9)
            if (r0 == 0) goto L_0x0989
            r0 = 2131887711(0x7f12065f, float:1.9410037E38)
            java.lang.String r4 = r4.A01(r0)
            X.C18070vi.A0b(r4)
        L_0x094d:
            X.0ve r2 = r14.A0B
            boolean r0 = X.C50602Vb.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0982
            r1 = 6120(0x17e8, float:8.576E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r0 <= r8) goto L_0x0982
            int r2 = r9.A0B(r7)
            if (r2 == 0) goto L_0x0982
            X.2mO r1 = r14.A00
            if (r1 != 0) goto L_0x0970
            X.2mO r1 = new X.2mO
            r1.<init>()
            r14.A00 = r1
        L_0x0970:
            android.content.Context r0 = r14.A02
            X.28v r0 = r1.A00(r0, r2, r8)
        L_0x0976:
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            goto L_0x003c
        L_0x0982:
            android.content.Context r0 = r14.A02
            android.graphics.drawable.Drawable r0 = r9.A0E(r0, r7, r8)
            goto L_0x0976
        L_0x0989:
            boolean r0 = X.C42571yO.A09(r7, r9)
            if (r0 == 0) goto L_0x09c6
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x099e
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x09c6
        L_0x099e:
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x09b3
            r2 = 0
            r1 = 2131887730(0x7f120672, float:1.9410075E38)
            r0 = 2131887716(0x7f120664, float:1.9410047E38)
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r2, r1, r0)
            goto L_0x094d
        L_0x09b3:
            boolean r0 = r1.A0J
            r2 = 2131887736(0x7f120678, float:1.9410088E38)
            if (r0 == 0) goto L_0x09bd
            r2 = 2131887735(0x7f120677, float:1.9410085E38)
        L_0x09bd:
            r1 = 0
            r0 = 2131887730(0x7f120672, float:1.9410075E38)
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r1, r0, r2)
            goto L_0x094d
        L_0x09c6:
            boolean r0 = X.C42571yO.A08(r7, r9)
            if (r0 == 0) goto L_0x0b80
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x09f4
            r10 = 2131887716(0x7f120664, float:1.9410047E38)
        L_0x09d8:
            int r0 = r1.A06(r11)
            if (r0 != r6) goto L_0x09ff
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            r1 = 2131887713(0x7f120661, float:1.941004E38)
            if (r0 == 0) goto L_0x09ed
            r1 = 2131887718(0x7f120666, float:1.941005E38)
        L_0x09ed:
            r0 = 0
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r0, r1, r10)
            goto L_0x094d
        L_0x09f4:
            boolean r0 = r1.A0J
            r10 = 2131887715(0x7f120663, float:1.9410045E38)
            if (r0 == 0) goto L_0x09d8
            r10 = 2131887714(0x7f120662, float:1.9410043E38)
            goto L_0x09d8
        L_0x09ff:
            r2 = 2131887717(0x7f120665, float:1.9410049E38)
            java.util.ArrayList r0 = r1.A0B()
            java.util.Iterator r11 = r0.iterator()
            r1 = 0
        L_0x0a0b:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0a1e
            java.lang.Object r0 = r11.next()
            X.9Bv r0 = (X.C178109Bv) r0
            int r0 = r0.A01
            if (r0 != r6) goto L_0x0a0b
            int r1 = r1 + 1
            goto L_0x0a0b
        L_0x0a1e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r0, r2, r10)
            goto L_0x094d
        L_0x0a28:
            boolean r0 = X.C42571yO.A05(r7, r9)
            if (r0 == 0) goto L_0x0b14
            X.11S r11 = r9.A00
            X.229 r2 = r1.A02
            X.C17960vV.A07(r2)
            X.C18070vi.A0X(r2)
            X.9Bw r2 = (X.C178119Bw) r2
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            X.205 r1 = r7.A0v
            X.1BI r13 = r1.A00
            com.whatsapp.jid.UserJid r10 = X.C22941Dw.A01(r13)
            if (r10 != 0) goto L_0x0a66
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "CallingMessageUtil/getAdHocGroupCallLogMessageText: peerjid is null. This is group jid: "
            r12.append(r0)
            boolean r0 = r13 instanceof com.whatsapp.jid.GroupJid
            r12.append(r0)
            java.lang.String r0 = " and callType is "
            r12.append(r0)
            int r0 = r2.A07
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0a66:
            int r12 = r9.A0D(r10, r2)
            boolean r0 = X.C42571yO.A06(r7, r9)
            if (r0 != 0) goto L_0x0b7c
            boolean r0 = X.C42571yO.A08(r7, r9)
            if (r0 == 0) goto L_0x0af7
            boolean r10 = r1.A02
            if (r10 != 0) goto L_0x0a8d
            boolean r0 = X.C42571yO.A09(r7, r9)
            if (r0 == 0) goto L_0x0a95
            r2 = 2131887730(0x7f120672, float:1.9410075E38)
        L_0x0a83:
            r1 = 0
            r0 = 2131887710(0x7f12065e, float:1.9410035E38)
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r1, r2, r0)
            goto L_0x094d
        L_0x0a8d:
            r0 = 2
            if (r12 != r0) goto L_0x0a95
            r2 = 2131887729(0x7f120671, float:1.9410073E38)
            goto L_0x0b98
        L_0x0a95:
            r1 = 100
            if (r12 != r1) goto L_0x0a9e
            r2 = 2131887725(0x7f12066d, float:1.9410065E38)
            goto L_0x0b98
        L_0x0a9e:
            int r0 = r2.A06(r11)
            if (r0 != r1) goto L_0x0aa8
            r2 = 2131887727(0x7f12066f, float:1.941007E38)
            goto L_0x0a83
        L_0x0aa8:
            int r0 = r2.A06(r11)
            if (r0 != r6) goto L_0x0ab2
            r2 = 2131887726(0x7f12066e, float:1.9410067E38)
            goto L_0x0a83
        L_0x0ab2:
            if (r10 != 0) goto L_0x0ac7
            boolean r0 = r2.A0Y(r11)
            if (r0 != 0) goto L_0x0ac7
            r2 = 0
            r1 = 2131887728(0x7f120670, float:1.9410071E38)
            r0 = 2131887710(0x7f12065e, float:1.9410035E38)
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r2, r1, r0)
            goto L_0x094d
        L_0x0ac7:
            r0 = 2131887710(0x7f12065e, float:1.9410035E38)
            java.lang.String r6 = r4.A01(r0)
            X.C18070vi.A0X(r6)
            int r2 = r6.length()
            android.content.Context r1 = r4.A00
            r0 = 2131099995(0x7f06015b, float:1.7812359E38)
            int r1 = X.C19740yt.A00(r1, r0)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r6)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            r1 = 33
            r4.setSpan(r0, r5, r2, r1)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r8)
            r4.setSpan(r0, r5, r2, r1)
            goto L_0x094d
        L_0x0af7:
            boolean r0 = X.C42571yO.A07(r7, r9)
            if (r0 == 0) goto L_0x0b0f
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0b0f
            boolean r0 = X.C42571yO.A0A(r9, r2)
            r2 = 2131887719(0x7f120667, float:1.9410053E38)
            if (r0 == 0) goto L_0x0b98
            r2 = 2131887731(0x7f120673, float:1.9410077E38)
            goto L_0x0b98
        L_0x0b0f:
            r2 = 2131887710(0x7f12065e, float:1.9410035E38)
            goto L_0x0b98
        L_0x0b14:
            X.229 r1 = r1.A02
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            X.9Bw r1 = (X.C178119Bw) r1
            boolean r0 = X.C42571yO.A06(r7, r9)
            if (r0 != 0) goto L_0x0b7c
            boolean r0 = X.C42571yO.A09(r7, r9)
            if (r0 == 0) goto L_0x0b3e
            boolean r0 = r1.A0J
            r2 = 2131887730(0x7f120672, float:1.9410075E38)
        L_0x0b2f:
            r1 = 2131887736(0x7f120678, float:1.9410088E38)
            if (r0 == 0) goto L_0x0b37
            r1 = 2131887735(0x7f120677, float:1.9410085E38)
        L_0x0b37:
            r0 = 0
            android.text.SpannableString r4 = X.C42571yO.A01(r4, r0, r2, r1)
            goto L_0x094d
        L_0x0b3e:
            boolean r0 = X.C42571yO.A08(r7, r9)
            if (r0 == 0) goto L_0x0b4a
            boolean r0 = r1.A0J
            r2 = 2131887712(0x7f120660, float:1.9410039E38)
            goto L_0x0b2f
        L_0x0b4a:
            boolean r0 = X.C42571yO.A07(r7, r9)
            if (r0 == 0) goto L_0x0b67
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0b67
            boolean r0 = X.C42571yO.A0A(r9, r1)
            boolean r1 = r1.A0J
            if (r0 != 0) goto L_0x0ba3
            r2 = 2131887724(0x7f12066c, float:1.9410063E38)
            if (r1 == 0) goto L_0x0b98
            r2 = 2131887723(0x7f12066b, float:1.9410061E38)
            goto L_0x0b98
        L_0x0b67:
            boolean r0 = X.C42571yO.A04(r7, r9)
            if (r0 == 0) goto L_0x0b71
            r2 = 2131887709(0x7f12065d, float:1.9410033E38)
            goto L_0x0b98
        L_0x0b71:
            boolean r0 = r1.A0J
            r2 = 2131887736(0x7f120678, float:1.9410088E38)
            if (r0 == 0) goto L_0x0b98
            r2 = 2131887735(0x7f120677, float:1.9410085E38)
            goto L_0x0b98
        L_0x0b7c:
            r2 = 2131887711(0x7f12065f, float:1.9410037E38)
            goto L_0x0b98
        L_0x0b80:
            boolean r0 = X.C42571yO.A0A(r9, r1)
            if (r0 == 0) goto L_0x0bac
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0bac
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x0ba1
            r2 = 2131887734(0x7f120676, float:1.9410083E38)
        L_0x0b98:
            java.lang.String r4 = r4.A01(r2)
            X.C18070vi.A0b(r4)
            goto L_0x094d
        L_0x0ba1:
            boolean r1 = r1.A0J
        L_0x0ba3:
            r2 = 2131887733(0x7f120675, float:1.9410081E38)
            if (r1 == 0) goto L_0x0b98
            r2 = 2131887732(0x7f120674, float:1.941008E38)
            goto L_0x0b98
        L_0x0bac:
            boolean r0 = X.C42571yO.A07(r7, r9)
            if (r0 == 0) goto L_0x0bd0
            X.205 r0 = r7.A0v
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0bd0
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x0bc5
            r2 = 2131887722(0x7f12066a, float:1.941006E38)
            goto L_0x0b98
        L_0x0bc5:
            boolean r0 = r1.A0J
            r2 = 2131887721(0x7f120669, float:1.9410057E38)
            if (r0 == 0) goto L_0x0b98
            r2 = 2131887720(0x7f120668, float:1.9410055E38)
            goto L_0x0b98
        L_0x0bd0:
            r2.get()
            boolean r0 = X.C62362rH.A00(r7)
            if (r0 == 0) goto L_0x0bdd
            r2 = 2131887716(0x7f120664, float:1.9410047E38)
            goto L_0x0b98
        L_0x0bdd:
            boolean r0 = r1.A0J
            r2 = 2131887715(0x7f120663, float:1.9410045E38)
            if (r0 == 0) goto L_0x0b98
            r2 = 2131887714(0x7f120662, float:1.9410043E38)
            goto L_0x0b98
        L_0x0be8:
            boolean r1 = r15 instanceof X.C445823z
            if (r1 == 0) goto L_0x0c40
            X.0ve r4 = r14.A0B
            r2 = 5563(0x15bb, float:7.795E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r4, r2)
            if (r1 == 0) goto L_0x0c21
            X.205 r1 = r15.A0v
            boolean r1 = r1.A02
            if (r1 == 0) goto L_0x0c1c
            X.11S r1 = r14.A03
            r1.A0I()
            com.whatsapp.jid.PhoneUserJid r5 = r1.A0E
        L_0x0c05:
            X.1y2 r2 = r14.A01
            r4 = r15
            X.23z r4 = (X.C445823z) r4
            java.lang.Integer r6 = X.AnonymousClass00R.A00
            java.lang.Integer r7 = X.AnonymousClass00R.A01
            com.whatsapp.TextEmojiLabel r3 = r3.A07
            r1 = 128(0x80, float:1.794E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
            android.text.SpannableStringBuilder r4 = r2.A00(r3, r4, r5, r6, r7, r8)
            goto L_0x003c
        L_0x0c1c:
            X.1BI r5 = r15.A0H()
            goto L_0x0c05
        L_0x0c21:
            android.content.Context r2 = r14.A02
            r1 = 2131232667(0x7f08079b, float:1.808145E38)
            r0 = 2131101888(0x7f0608c0, float:1.7816198E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aX.A02(r2, r1, r0)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r1 = r3.A05
            r1.setImageDrawable(r0)
            r1 = 2131889044(0x7f120b94, float:1.941274E38)
            java.lang.String r4 = r2.getString(r1)
            goto L_0x003c
        L_0x0c40:
            boolean r1 = r15 instanceof X.AnonymousClass24N
            if (r1 == 0) goto L_0x0c60
            X.118 r2 = r14.A08
            r1 = 2131892506(0x7f12191a, float:1.9419762E38)
            java.lang.String r4 = r2.A01(r1)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r2 = r3.A05
            r1 = 2131233381(0x7f080a65, float:1.8082898E38)
            android.graphics.drawable.Drawable r1 = r14.A00(r1)
            r2.setImageDrawable(r1)
            goto L_0x003c
        L_0x0c60:
            int r2 = r15.A0u
            r1 = 103(0x67, float:1.44E-43)
            if (r2 != r1) goto L_0x003c
            X.00H r1 = r14.A0J
            java.lang.Object r1 = r1.get()
            X.2r9 r1 = (X.C62282r9) r1
            java.lang.String r4 = r1.A01(r15)
            android.widget.ImageView r1 = r3.A05
            r1.setVisibility(r5)
            android.widget.ImageView r2 = r3.A05
            r1 = 2131233361(0x7f080a51, float:1.8082857E38)
            android.graphics.drawable.Drawable r1 = r14.A00(r1)
            r2.setImageDrawable(r1)
            goto L_0x003c
        L_0x0c85:
            java.util.regex.Pattern r1 = X.C32091gc.A0D
            java.util.regex.Matcher r11 = r1.matcher(r5)
            r10 = 0
        L_0x0c8c:
            boolean r1 = r11.find()
            if (r1 == 0) goto L_0x0cf4
            java.lang.String r4 = r11.group()
            X.0yx r2 = X.C32091gc.A00(r6, r4, r8)
            if (r2 == 0) goto L_0x0c8c
            java.lang.Object r1 = r2.A00
            if (r1 != 0) goto L_0x0ca7
            java.lang.String r2 = "Mentions/null mention after map population"
            r1 = 0
            X.C17960vV.A0F(r1, r2)
            goto L_0x0c8c
        L_0x0ca7:
            int r9 = r11.start()
            int r9 = r9 + r10
            java.lang.Object r3 = r2.A01
            java.lang.String r3 = (java.lang.String) r3
            X.18O r2 = r6.A01
            X.18Q r1 = X.AnonymousClass18O.A1O
            int r1 = r2.A04(r1)
            java.lang.String r3 = X.AnonymousClass1EG.A0F(r3, r1)
            int r2 = r4.length()
            int r1 = r2 + r9
            r5.replace(r9, r1, r3)
            int r4 = r3.length()
            int r1 = r4 - r2
            int r10 = r10 + r1
            int r4 = r4 + r9
            r2 = 2130970497(0x7f040781, float:1.7549706E38)
            r1 = 2131101863(0x7f0608a7, float:1.7816148E38)
            int r1 = X.AnonymousClass1YL.A00(r7, r2, r1)
            int r2 = X.C19740yt.A00(r7, r1)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r2)
            r3 = 33
            r5.setSpan(r1, r9, r4, r3)
            r7.getApplicationContext()
            X.BGo r2 = new X.BGo
            r2.<init>()
            int r1 = r9 + 1
            r5.setSpan(r2, r1, r4, r3)
            goto L_0x0c8c
        L_0x0cf3:
            r5 = r4
        L_0x0cf4:
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42461yD.A0G(X.206):android.util.Pair");
    }
}
