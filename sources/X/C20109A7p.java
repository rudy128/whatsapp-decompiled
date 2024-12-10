package X;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.whatsapp.CircleWaImageView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView;

/* renamed from: X.A7p  reason: case insensitive filesystem */
public class C20109A7p {
    public View A00;
    public ViewGroup A01;
    public ViewGroup A02;
    public LinearLayout A03;
    public ShimmerFrameLayout A04;
    public AnonymousClass11S A05;
    public TextEmojiLabel A06;
    public TextEmojiLabel A07;
    public WaImageView A08;
    public WaImageView A09;
    public WaTextView A0A;
    public WaTextView A0B;
    public WaTextView A0C;
    public WaTextView A0D;
    public WaTextView A0E;
    public A6I A0F;
    public C192609og A0G;
    public C189989kB A0H;
    public DirectoryProductImagesCardView A0I;
    public C27191Vc A0J;
    public AnonymousClass118 A0K;
    public C18000vb A0L;
    public C18030ve A0M;
    public AnonymousClass1XN A0N;
    public C36921og A0O;
    public AnonymousClass10I A0P;
    public View A0Q;
    public View A0R;
    public View A0S;
    public View A0T;
    public ViewGroup A0U;
    public CircleWaImageView A0V;
    public WaImageButton A0W;
    public WaTextView A0X;
    public WaTextView A0Y;
    public WaTextView A0Z;
    public final Handler A0a = new Handler();

    public static Integer A00(C20109A7p a7p, C174298wY r2) {
        int A032;
        if (!r2.A0D) {
            return null;
        }
        if (!r2.A0B.A0P) {
            A032 = 0;
        } else if (a7p.A0I.A00()) {
            A032 = 3;
        } else {
            A032 = C72453Mb.A03(a7p.A0I.A01() ? 1 : 0);
        }
        return Integer.valueOf(A032);
    }

    public static Integer A01(C20109A7p a7p, C174298wY r4) {
        int i;
        if (!r4.A0D) {
            return null;
        }
        AF0 af0 = r4.A0B;
        if (af0.A0P) {
            return null;
        }
        if (!af0.A0Q) {
            i = 0;
        } else if (af0.A01 != 1 || TextUtils.isEmpty(a7p.A07.getText())) {
            int i2 = af0.A01;
            i = 2;
            if (i2 != 2) {
                return 1;
            }
        } else {
            i = 3;
        }
        return Integer.valueOf(i);
    }

    public static Integer A02(C20109A7p a7p, C174298wY r2) {
        int A032;
        if (!r2.A0D) {
            return null;
        }
        if (!r2.A0B.A0R) {
            A032 = 0;
        } else if (a7p.A0I.A00()) {
            A032 = 3;
        } else {
            A032 = C72453Mb.A03(a7p.A0I.A01() ? 1 : 0);
        }
        return Integer.valueOf(A032);
    }

    private void A03(Context context, View view, WaTextView waTextView, Integer num, int i, int i2) {
        if (num != null) {
            int i3 = 0;
            view.setVisibility(0);
            int intValue = num.intValue();
            if (intValue > 0) {
                long j = (long) intValue;
                String A012 = C196739vZ.A01(this.A0L, j);
                String A002 = C196739vZ.A00(j);
                if (A002 != null) {
                    switch (A002.hashCode()) {
                        case 66:
                            if (A002.equals("B")) {
                                i3 = 2131888738;
                                break;
                            }
                            break;
                        case C166418cr.EVENT_MESSAGE_FIELD_NUMBER:
                            if (A002.equals("K")) {
                                i3 = 2131888739;
                                break;
                            }
                            break;
                        case C166418cr.COMMENT_MESSAGE_FIELD_NUMBER:
                            if (A002.equals("M")) {
                                i3 = 2131888740;
                                break;
                            }
                            break;
                    }
                    StringBuilder A11 = AnonymousClass000.A11(A012);
                    C17880vN.A1A(context, A11, i3);
                    A012 = A11.toString();
                }
                waTextView.setText(context.getResources().getQuantityString(i, intValue, AnonymousClass8BV.A1b(A012)));
                return;
            }
            waTextView.setText(i2);
            return;
        }
        view.setVisibility(8);
    }

    public static void A04(C20109A7p a7p, C174298wY r5) {
        String str = r5.A01;
        if (TextUtils.isEmpty(str)) {
            a7p.A01.setVisibility(8);
            return;
        }
        a7p.A07.setVisibility(0);
        a7p.A04.setVisibility(8);
        a7p.A02.setVisibility(8);
        a7p.A07.setText(str);
    }

    public void A05(View view) {
        this.A00 = view;
        this.A0V = (CircleWaImageView) AnonymousClass1HF.A06(view, 2131428491);
        this.A06 = AnonymousClass3MX.A0V(view, 2131428554);
        this.A0C = AnonymousClass3MW.A0T(view, 2131433296);
        this.A0D = AnonymousClass3MW.A0T(view, 2131434055);
        this.A09 = AnonymousClass3MW.A0R(view, 2131433297);
        this.A0X = AnonymousClass3MW.A0T(view, 2131428921);
        this.A0A = AnonymousClass3MW.A0T(view, 2131427667);
        this.A0B = AnonymousClass3MW.A0T(view, 2131430072);
        this.A08 = AnonymousClass3MW.A0R(view, 2131427668);
        this.A0W = (WaImageButton) AnonymousClass1HF.A06(view, 2131432671);
        this.A0Y = AnonymousClass3MW.A0T(view, 2131430817);
        this.A0Z = AnonymousClass3MW.A0T(view, 2131431517);
        this.A0R = AnonymousClass1HF.A06(view, 2131430816);
        this.A0S = AnonymousClass1HF.A06(view, 2131431519);
        this.A0Q = AnonymousClass1HF.A06(view, 2131430815);
        this.A07 = AnonymousClass3MX.A0V(view, 2131428517);
        this.A02 = AnonymousClass3MW.A0C(view, 2131429935);
        this.A04 = (ShimmerFrameLayout) AnonymousClass1HF.A06(view, 2131429942);
        this.A0T = AnonymousClass1HF.A06(view, 2131434635);
        this.A01 = AnonymousClass3MW.A0C(view, 2131429933);
        this.A0I = (DirectoryProductImagesCardView) AnonymousClass1HF.A06(view, 2131434116);
        this.A0U = AnonymousClass3MW.A0C(view, 2131427661);
        this.A03 = AnonymousClass3MX.A0K(view, 2131435218);
        this.A0E = AnonymousClass3MW.A0T(view, 2131433256);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01d0, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01d1, code lost:
        r0 = r5.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01d3, code lost:
        if (r1 != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01d5, code lost:
        r8 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d7, code lost:
        r0.setVisibility(r8);
        X.AnonymousClass78Q.A00(r5.A0W, r5, r7, 49);
        r10 = r5.A05;
        r9 = r6.A0F;
        r8 = com.whatsapp.jid.UserJid.Companion;
        r5.A0W.setEnabled(!r10.A0O(r8.A04(r9)));
        r5.A00.setEnabled(!r10.A0O(r8.A04(r9)));
        X.C89994dM.A00(r5.A00, r5, r7, 0);
        r5.A0Q.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0211, code lost:
        if (r7.A05 == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0213, code lost:
        r8 = r5.A0N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x021b, code lost:
        if (X.AnonymousClass8BS.A1L(r8) == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0225, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8, 1564) == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0227, code lost:
        r10 = r6.A0N;
        r9 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0231, code lost:
        if (r9.hasNext() == false) goto L_0x030f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0233, code lost:
        r8 = (X.AEB) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0241, code lost:
        if ("facebook".equals(r8.A01) == false) goto L_0x022d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0243, code lost:
        r12 = java.lang.Integer.valueOf(r8.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0249, code lost:
        r9 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0251, code lost:
        if (r9.hasNext() == false) goto L_0x030c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0253, code lost:
        r8 = (X.AEB) r9.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 3429) != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0261, code lost:
        if ("instagram".equals(r8.A01) == false) goto L_0x024d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0263, code lost:
        r15 = java.lang.Integer.valueOf(r8.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0269, code lost:
        if (r12 != null) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x026b, code lost:
        if (r15 == null) goto L_0x0272;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x026d, code lost:
        r5.A0Q.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0272, code lost:
        A03(r4, r5.A0R, r5.A0Y, r12, 2131755025, 2131890286);
        A03(r4, r5.A0S, r5.A0Z, r15, 2131755026, 2131891363);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0296, code lost:
        if (r7.A05 == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0298, code lost:
        r4 = r5.A0N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02a0, code lost:
        if (X.AnonymousClass8BS.A1L(r4) == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02aa, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4, 1696) == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02ae, code lost:
        if (r6.A0S == false) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02b0, code lost:
        r5.A0T.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b5, code lost:
        r1 = r6.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b7, code lost:
        if (r1 == null) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02bd, code lost:
        if (r1.isEmpty() != false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02bf, code lost:
        r7 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r8 == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02c7, code lost:
        if (r7.hasNext() == false) goto L_0x0304;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02c9, code lost:
        r6 = (X.AEL) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02d1, code lost:
        if (r6.A04 == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02db, code lost:
        if ("restaurant_delivery".equals(r6.A03) == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x02dd, code lost:
        r4 = r5.A0N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02e5, code lost:
        if (X.AnonymousClass8BS.A1L(r4) == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x02ef, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4, 4457) == false) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r10 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02f1, code lost:
        r4 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02f3, code lost:
        r1 = android.text.TextUtils.isEmpty(r4);
        r0 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x02f9, code lost:
        if (r1 != false) goto L_0x04fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x02fb, code lost:
        r0.setVisibility(0);
        r5.A0E.setText(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0303, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0304, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0306, code lost:
        r5.A0T.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x030c, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x030f, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0312, code lost:
        r5.A0B.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0319, code lost:
        r0.setText(r10);
        r5.A0A.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0323, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0328, code lost:
        r5.A0D.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x032f, code lost:
        r0.setText(r10);
        r8 = r5.A0C;
        r1 = 2131099969;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0337, code lost:
        if (r11 == 0) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0339, code lost:
        r1 = 2131099970;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x033d, code lost:
        if (r11 == 1) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x033f, code lost:
        r1 = X.AnonymousClass1YL.A00(r4, 2130970340, 2131101312);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0349, code lost:
        X.AnonymousClass3MX.A1C(r4, r8, r1);
        r5.A0C.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0353, code lost:
        r1 = 2131887546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        if (r6.A0Q == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0356, code lost:
        r10 = r4.getString(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x035c, code lost:
        r5.A06.A0N();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0365, code lost:
        if (r7.A03 == false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0367, code lost:
        r11 = r6.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x036d, code lost:
        if (android.text.TextUtils.isEmpty(r11) != false) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x036f, code lost:
        r12 = r5.A0H;
        r10 = r5.A0V;
        r9 = X.C24261Jm.A00(r10.getContext(), 2131231047);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0388, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r12.A00, 2185) == false) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x038a, code lost:
        r10.setTag(2131433300, X.AnonymousClass000.A0i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0394, code lost:
        r12.A01.A01(r9, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        r2 = r5.A0N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x039b, code lost:
        r5.A0V.setImageResource(2131231047);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03a5, code lost:
        A04(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03aa, code lost:
        r5.A04.setVisibility(0);
        r5.A07.setVisibility(4);
        r0 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03b8, code lost:
        r28 = r5.A00;
        r5.A01.setVisibility(8);
        r10 = false;
        r5.A0I.setVisibility(0);
        r9 = X.C17880vN.A0z(3);
        r1 = r6.A06;
        r0 = r6.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d0, code lost:
        if (r1 == null) goto L_0x03d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d2, code lost:
        r9.addAll(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03d5, code lost:
        if (r0 == null) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03d7, code lost:
        r9.addAll(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03da, code lost:
        r1 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03dc, code lost:
        if (r1 == 0) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (X.AnonymousClass8BS.A1L(r2) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03de, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03df, code lost:
        if (r1 == 1) goto L_0x03ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03e2, code lost:
        if (r1 == 2) goto L_0x04c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03e4, code lost:
        X.C90084dV.A00(r5.A0I, r5, r7, r28, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03f3, code lost:
        if (r9.isEmpty() != false) goto L_0x04bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x03f5, code lost:
        r8 = r5.A0I;
        r1 = r5.A0H;
        X.C18070vi.A0d(r1, 1);
        r20 = X.AnonymousClass3MZ.A0D(r8);
        r11 = r8.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0402, code lost:
        if (r11 == null) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0404, code lost:
        r11.A05((X.CUR) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0408, code lost:
        r27 = r8.A01;
        r27.removeAllViews();
        r19 = X.C29431cG.A0v(r9, 3).iterator();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x041d, code lost:
        if (r19.hasNext() == false) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x041f, code lost:
        r18 = r19.next();
        r17 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0425, code lost:
        if (r11 >= 0) goto L_0x042c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0427, code lost:
        X.AnonymousClass1ZU.A0B();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x042b, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x042c, code lost:
        r18 = (java.lang.String) r18;
        X.C18070vi.A0b(r20);
        r12 = r20.inflate(2131624387, r8, false);
        r12.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        r16 = X.AnonymousClass3MW.A0H(r12, 2131434115);
        r13 = r12.findViewById(2131434112);
        r13.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0465, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r1.A00, 2185) == false) goto L_0x0473;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0467, code lost:
        r16.setTag(2131433300, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r2, 3361) != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0473, code lost:
        r1.A01.A00((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, r16, new X.C145877My(r12, r13, r1, 0), r18);
        r27.addView(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0495, code lost:
        if (r11 == (r9.size() - 1)) goto L_0x04b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0497, code lost:
        r13 = new android.view.View(r8.getContext());
        r13.setLayoutParams(new android.widget.LinearLayout.LayoutParams(r13.getResources().getDimensionPixelSize(2131166479), -1));
        r27.addView(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04b9, code lost:
        r11 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04bd, code lost:
        r5.A0I.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04c4, code lost:
        r12 = r5.A0I;
        r11 = r12.A01;
        r11.removeAllViews();
        r1 = X.AnonymousClass3MZ.A0D(r12);
        X.C18070vi.A0X(r1);
        r9 = r1.inflate(2131624387, r12, false);
        r9.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1, 1.0f));
        r9 = (com.facebook.shimmer.ShimmerFrameLayout) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x04e6, code lost:
        if (r10 == false) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04e8, code lost:
        X.AnonymousClass3MX.A0C(r9, 2131434112).setVisibility(0);
        r9.A05((X.CUR) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04f6, code lost:
        r12.A00 = r9;
        r11.addView(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04fd, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0500, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        r1 = r5.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0055, code lost:
        if (r10 != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r8 != false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        if (r9 == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0061, code lost:
        if (r10 != false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0063, code lost:
        if (r9 != false) goto L_0x03b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        if (r8 == false) goto L_0x00a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        r8 = r5.A00;
        r5.A01.setVisibility(0);
        r5.A0I.setVisibility(8);
        r9 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r9 == 0) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0079, code lost:
        if (r9 == 1) goto L_0x03a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007c, code lost:
        if (r9 != 2) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007e, code lost:
        r5.A02.setVisibility(0);
        r5.A07.setVisibility(4);
        r0 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        r0.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r6.A0P == false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0099, code lost:
        if (r5.A05.A0O(X.C22941Dw.A02(r6.A0F)) == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        A04(r5, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009e, code lost:
        X.C90084dV.A00(r5.A01, r5, r7, r8, 20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a5, code lost:
        r1 = r5.A0F;
        r1.A00 = r7.A06;
        r1.A07 = r7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b1, code lost:
        if (r7.A03 == false) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00bf, code lost:
        if (r5.A05.A0O(X.C22941Dw.A02(r6.A0F)) == false) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c1, code lost:
        X.C21434Ak1.A00(r5.A0P, r5, r5.A00.getContext(), r5.A0V, 14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d0, code lost:
        r5.A0V.setVisibility(X.C72453Mb.A07(r7.A04 ? 1 : 0));
        r5.A06.setText(r6.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
        if (r6.A08 != 2) goto L_0x035c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        r5.A06.A0O(X.C196929vs.A01(r5.A0M), 2131167222);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f5, code lost:
        r11 = r6.A07;
        r1 = 2131887545;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fa, code lost:
        if (r11 == 0) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        r1 = 2131887556;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (r11 == 1) goto L_0x0356;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0103, code lost:
        if (r11 == 2) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0106, code lost:
        r1 = android.text.TextUtils.isEmpty(r10);
        r9 = 8;
        r0 = r5.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r8 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010e, code lost:
        if (r1 == false) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0110, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0113, code lost:
        r11 = r6.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0115, code lost:
        if (r11 == null) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0117, code lost:
        r8 = r5.A0N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        if (X.AnonymousClass8BS.A1L(r8) == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0129, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r8, 4457) == false) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012b, code lost:
        r5.A0D.setVisibility(0);
        r5.A0D.setText(r11.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013b, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013d, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0144, code lost:
        if (r5.A0D.getVisibility() == 0) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0146, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0147, code lost:
        r0 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0149, code lost:
        if (r1 == false) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014b, code lost:
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        r0.setVisibility(r9);
        r8 = r6.A0L;
        r0 = r8.isEmpty();
        r1 = r5.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0157, code lost:
        if (r0 != false) goto L_0x0323;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0159, code lost:
        r1.setText(android.text.TextUtils.join(", ", r8));
        r5.A0X.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r6.A0R == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0167, code lost:
        r10 = r6.A0D;
        r9 = r6.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016b, code lost:
        if (r9 == null) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0171, code lost:
        if (r9.isEmpty() != false) goto L_0x017a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0173, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0178, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x017b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x017a, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017b, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017c, code lost:
        if (r0 == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017e, code lost:
        r10 = ((X.AE9) r9.get(0)).A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r2 = r5.A0N.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0186, code lost:
        r1 = android.text.TextUtils.isEmpty(r10);
        r0 = r5.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x018c, code lost:
        if (r1 == false) goto L_0x0319;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x018e, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0191, code lost:
        r9 = r7.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0193, code lost:
        if (r9 == false) goto L_0x0312;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0195, code lost:
        r5.A0B.setText(X.C181149Pi.A00(r4, r5.A0L.A0N(), X.AnonymousClass8BX.A0D(r7.A07, "origin").distanceTo(X.AnonymousClass8BX.A0D(X.AnonymousClass8BV.A09(r6.A0C, r6.A0B.doubleValue()), "destination"))));
        r5.A0B.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01cb, code lost:
        if (android.text.TextUtils.isEmpty(r10) != false) goto L_0x01d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01cd, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ce, code lost:
        if (r9 != false) goto L_0x01d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0025, code lost:
        if (X.AnonymousClass8BS.A1L(r2) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C174298wY r30) {
        /*
            r29 = this;
            r7 = r30
            X.AF0 r6 = r7.A0B
            r5 = r29
            android.view.View r0 = r5.A00
            android.content.Context r4 = r0.getContext()
            boolean r8 = r7.A0D
            r3 = 0
            if (r8 == 0) goto L_0x0016
            boolean r0 = r6.A0P
            r10 = 1
            if (r0 != 0) goto L_0x0019
        L_0x0016:
            r10 = 0
            if (r8 == 0) goto L_0x0032
        L_0x0019:
            boolean r0 = r6.A0R
            if (r0 == 0) goto L_0x0032
            X.1XN r0 = r5.A0N
            X.0ve r2 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r2)
            if (r0 == 0) goto L_0x0032
            r1 = 3429(0xd65, float:4.805E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r9 = 1
            if (r0 != 0) goto L_0x0050
        L_0x0032:
            r9 = 0
            if (r8 == 0) goto L_0x0050
            if (r10 != 0) goto L_0x0050
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L_0x0050
            X.1XN r0 = r5.A0N
            X.0ve r2 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r2)
            if (r0 == 0) goto L_0x0050
            r1 = 3361(0xd21, float:4.71E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r8 = 1
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            android.view.ViewGroup r1 = r5.A0U
            r2 = 8
            if (r10 != 0) goto L_0x005d
            if (r8 != 0) goto L_0x005d
            r0 = 8
            if (r9 == 0) goto L_0x005e
        L_0x005d:
            r0 = 0
        L_0x005e:
            r1.setVisibility(r0)
            if (r10 != 0) goto L_0x03b8
            if (r9 != 0) goto L_0x03b8
            if (r8 == 0) goto L_0x00a5
            android.view.View r8 = r5.A00
            android.view.ViewGroup r0 = r5.A01
            r0.setVisibility(r3)
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r5.A0I
            r0.setVisibility(r2)
            int r9 = r6.A01
            r1 = 4
            if (r9 == 0) goto L_0x03aa
            r0 = 1
            if (r9 == r0) goto L_0x03a5
            r0 = 2
            if (r9 != r0) goto L_0x008d
            android.view.ViewGroup r0 = r5.A02
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r5.A07
            r0.setVisibility(r1)
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.A04
        L_0x008a:
            r0.setVisibility(r1)
        L_0x008d:
            X.11S r1 = r5.A05
            java.lang.String r0 = r6.A0F
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x009e
            A04(r5, r7)
        L_0x009e:
            android.view.ViewGroup r1 = r5.A01
            r0 = 20
            X.C90084dV.A00(r1, r5, r7, r8, r0)
        L_0x00a5:
            X.A6I r1 = r5.A0F
            int r0 = r7.A06
            r1.A00 = r0
            java.lang.String r0 = r7.A02
            r1.A07 = r0
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x0363
            X.11S r1 = r5.A05
            java.lang.String r0 = r6.A0F
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A02(r0)
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x0363
            android.view.View r0 = r5.A00
            android.content.Context r9 = r0.getContext()
            com.whatsapp.CircleWaImageView r8 = r5.A0V
            X.10I r1 = r5.A0P
            r0 = 14
            X.C21434Ak1.A00(r1, r5, r9, r8, r0)
        L_0x00d0:
            com.whatsapp.CircleWaImageView r1 = r5.A0V
            boolean r0 = r7.A04
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            com.whatsapp.TextEmojiLabel r1 = r5.A06
            java.lang.String r0 = r6.A0I
            r1.setText(r0)
            int r1 = r6.A08
            r0 = 2
            if (r1 != r0) goto L_0x035c
            X.0ve r0 = r5.A0M
            int r8 = X.C196929vs.A01(r0)
            com.whatsapp.TextEmojiLabel r1 = r5.A06
            r0 = 2131167222(0x7f0707f6, float:1.7948711E38)
            r1.A0O(r8, r0)
        L_0x00f5:
            int r11 = r6.A07
            r1 = 2131887545(0x7f1205b9, float:1.94097E38)
            if (r11 == 0) goto L_0x0356
            r0 = 1
            r1 = 2131887556(0x7f1205c4, float:1.9409722E38)
            if (r11 == r0) goto L_0x0356
            r0 = 2
            if (r11 == r0) goto L_0x0353
            r10 = 0
        L_0x0106:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r9 = 8
            com.whatsapp.WaTextView r0 = r5.A0C
            if (r1 == 0) goto L_0x032f
            r0.setVisibility(r2)
        L_0x0113:
            X.ADt r11 = r6.A09
            if (r11 == 0) goto L_0x0328
            X.1XN r0 = r5.A0N
            X.0ve r8 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r8)
            if (r0 == 0) goto L_0x0328
            r1 = 4457(0x1169, float:6.246E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0328
            com.whatsapp.WaTextView r0 = r5.A0D
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r1 = r5.A0D
            java.lang.String r0 = r11.A02
            r1.setText(r0)
        L_0x0137:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x0146
            com.whatsapp.WaTextView r0 = r5.A0D
            int r0 = r0.getVisibility()
            r1 = 1
            if (r0 == 0) goto L_0x0147
        L_0x0146:
            r1 = 0
        L_0x0147:
            com.whatsapp.WaImageView r0 = r5.A09
            if (r1 == 0) goto L_0x014c
            r9 = 0
        L_0x014c:
            r0.setVisibility(r9)
            java.util.List r8 = r6.A0L
            boolean r0 = r8.isEmpty()
            com.whatsapp.WaTextView r1 = r5.A0X
            if (r0 != 0) goto L_0x0323
            java.lang.String r0 = ", "
            java.lang.String r0 = android.text.TextUtils.join(r0, r8)
            r1.setText(r0)
            com.whatsapp.WaTextView r0 = r5.A0X
            r0.setVisibility(r3)
        L_0x0167:
            java.lang.String r10 = r6.A0D
            java.util.List r9 = r6.A0K
            if (r9 == 0) goto L_0x017a
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x017a
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            r0 = 1
            if (r1 != 0) goto L_0x017b
        L_0x017a:
            r0 = 0
        L_0x017b:
            r8 = 0
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r9.get(r3)
            X.AE9 r0 = (X.AE9) r0
            java.lang.String r10 = r0.A03
        L_0x0186:
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            com.whatsapp.WaTextView r0 = r5.A0A
            if (r1 == 0) goto L_0x0319
            r0.setVisibility(r2)
        L_0x0191:
            boolean r9 = r7.A0C
            if (r9 == 0) goto L_0x0312
            com.google.android.gms.maps.model.LatLng r12 = r7.A07
            java.lang.Double r0 = r6.A0B
            double r0 = r0.doubleValue()
            java.lang.Double r11 = r6.A0C
            com.google.android.gms.maps.model.LatLng r11 = X.AnonymousClass8BV.A09(r11, r0)
            java.lang.String r0 = "origin"
            android.location.Location r1 = X.AnonymousClass8BX.A0D(r12, r0)
            java.lang.String r0 = "destination"
            android.location.Location r0 = X.AnonymousClass8BX.A0D(r11, r0)
            float r11 = r1.distanceTo(r0)
            com.whatsapp.WaTextView r1 = r5.A0B
            X.0vb r0 = r5.A0L
            java.util.Locale r0 = r0.A0N()
            java.lang.String r0 = X.C181149Pi.A00(r4, r0, r11)
            r1.setText(r0)
            com.whatsapp.WaTextView r0 = r5.A0B
            r0.setVisibility(r3)
        L_0x01c7:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x01d0
            r1 = 1
            if (r9 != 0) goto L_0x01d1
        L_0x01d0:
            r1 = 0
        L_0x01d1:
            com.whatsapp.WaImageView r0 = r5.A08
            if (r1 != 0) goto L_0x01d7
            r8 = 8
        L_0x01d7:
            r0.setVisibility(r8)
            com.whatsapp.WaImageButton r1 = r5.A0W
            r0 = 49
            X.AnonymousClass78Q.A00(r1, r5, r7, r0)
            X.11S r10 = r5.A05
            java.lang.String r9 = r6.A0F
            X.1Dw r8 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r0 = r8.A04(r9)
            boolean r0 = r10.A0O(r0)
            com.whatsapp.WaImageButton r1 = r5.A0W
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            android.view.View r1 = r5.A00
            com.whatsapp.jid.UserJid r0 = r8.A04(r9)
            boolean r0 = r10.A0O(r0)
            r0 = r0 ^ 1
            r1.setEnabled(r0)
            android.view.View r0 = r5.A00
            X.C89994dM.A00(r0, r5, r7, r3)
            android.view.View r0 = r5.A0Q
            r0.setVisibility(r2)
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0294
            X.1XN r0 = r5.A0N
            X.0ve r8 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r8)
            if (r0 == 0) goto L_0x0294
            r1 = 1564(0x61c, float:2.192E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0294
            java.util.List r10 = r6.A0N
            java.util.Iterator r9 = r10.iterator()
        L_0x022d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x030f
            java.lang.Object r8 = r9.next()
            X.AEB r8 = (X.AEB) r8
            java.lang.String r1 = "facebook"
            java.lang.String r0 = r8.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x022d
            int r0 = r8.A00
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x0249:
            java.util.Iterator r9 = r10.iterator()
        L_0x024d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x030c
            java.lang.Object r8 = r9.next()
            X.AEB r8 = (X.AEB) r8
            java.lang.String r1 = "instagram"
            java.lang.String r0 = r8.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x024d
            int r0 = r8.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x0269:
            if (r12 != 0) goto L_0x026d
            if (r15 == 0) goto L_0x0272
        L_0x026d:
            android.view.View r0 = r5.A0Q
            r0.setVisibility(r3)
        L_0x0272:
            r13 = 2131755025(0x7f100011, float:1.9140918E38)
            r14 = 2131890286(0x7f12106e, float:1.941526E38)
            com.whatsapp.WaTextView r1 = r5.A0Y
            android.view.View r0 = r5.A0R
            r8 = r5
            r9 = r4
            r10 = r0
            r11 = r1
            r8.A03(r9, r10, r11, r12, r13, r14)
            r16 = 2131755026(0x7f100012, float:1.914092E38)
            r17 = 2131891363(0x7f1214a3, float:1.9417444E38)
            com.whatsapp.WaTextView r1 = r5.A0Z
            android.view.View r0 = r5.A0S
            r11 = r5
            r12 = r4
            r13 = r0
            r14 = r1
            r11.A03(r12, r13, r14, r15, r16, r17)
        L_0x0294:
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0306
            X.1XN r0 = r5.A0N
            X.0ve r4 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r4)
            if (r0 == 0) goto L_0x0306
            r1 = 1696(0x6a0, float:2.377E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x0306
            boolean r0 = r6.A0S
            if (r0 == 0) goto L_0x0306
            android.view.View r0 = r5.A0T
            r0.setVisibility(r3)
        L_0x02b5:
            java.util.List r1 = r6.A0O
            if (r1 == 0) goto L_0x0304
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0304
            java.util.Iterator r7 = r1.iterator()
        L_0x02c3:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0304
            java.lang.Object r6 = r7.next()
            X.AEL r6 = (X.AEL) r6
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x02c3
            java.lang.String r1 = "restaurant_delivery"
            java.lang.String r0 = r6.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02c3
            X.1XN r0 = r5.A0N
            X.0ve r4 = r0.A03
            boolean r0 = X.AnonymousClass8BS.A1L(r4)
            if (r0 == 0) goto L_0x02c3
            r1 = 4457(0x1169, float:6.246E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r4, r1)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r4 = r6.A02
        L_0x02f3:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            android.widget.LinearLayout r0 = r5.A03
            if (r1 != 0) goto L_0x04fd
            r0.setVisibility(r3)
            com.whatsapp.WaTextView r0 = r5.A0E
            r0.setText(r4)
            return
        L_0x0304:
            r4 = 0
            goto L_0x02f3
        L_0x0306:
            android.view.View r0 = r5.A0T
            r0.setVisibility(r2)
            goto L_0x02b5
        L_0x030c:
            r15 = 0
            goto L_0x0269
        L_0x030f:
            r12 = 0
            goto L_0x0249
        L_0x0312:
            com.whatsapp.WaTextView r0 = r5.A0B
            r0.setVisibility(r2)
            goto L_0x01c7
        L_0x0319:
            r0.setText(r10)
            com.whatsapp.WaTextView r0 = r5.A0A
            r0.setVisibility(r3)
            goto L_0x0191
        L_0x0323:
            r1.setVisibility(r2)
            goto L_0x0167
        L_0x0328:
            com.whatsapp.WaTextView r0 = r5.A0D
            r0.setVisibility(r2)
            goto L_0x0137
        L_0x032f:
            r0.setText(r10)
            com.whatsapp.WaTextView r8 = r5.A0C
            r1 = 2131099969(0x7f060141, float:1.7812306E38)
            if (r11 == 0) goto L_0x0349
            r0 = 1
            r1 = 2131099970(0x7f060142, float:1.7812308E38)
            if (r11 == r0) goto L_0x0349
            r1 = 2130970340(0x7f0406e4, float:1.7549387E38)
            r0 = 2131101312(0x7f060680, float:1.781503E38)
            int r1 = X.AnonymousClass1YL.A00(r4, r1, r0)
        L_0x0349:
            X.AnonymousClass3MX.A1C(r4, r8, r1)
            com.whatsapp.WaTextView r0 = r5.A0C
            r0.setVisibility(r3)
            goto L_0x0113
        L_0x0353:
            r1 = 2131887546(0x7f1205ba, float:1.9409702E38)
        L_0x0356:
            java.lang.String r10 = r4.getString(r1)
            goto L_0x0106
        L_0x035c:
            com.whatsapp.TextEmojiLabel r0 = r5.A06
            r0.A0N()
            goto L_0x00f5
        L_0x0363:
            boolean r0 = r7.A03
            if (r0 == 0) goto L_0x039b
            java.lang.String r11 = r6.A0G
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x039b
            X.9kB r12 = r5.A0H
            com.whatsapp.CircleWaImageView r10 = r5.A0V
            android.content.Context r1 = r10.getContext()
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            android.graphics.drawable.Drawable r9 = X.C24261Jm.A00(r1, r0)
            X.0ve r8 = r12.A00
            r1 = 2185(0x889, float:3.062E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r8, r1)
            if (r0 == 0) goto L_0x0394
            r1 = 2131433300(0x7f0b1754, float:1.8488382E38)
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r10.setTag(r1, r0)
        L_0x0394:
            X.4VT r0 = r12.A01
            r0.A01(r9, r9, r10, r11)
            goto L_0x00d0
        L_0x039b:
            com.whatsapp.CircleWaImageView r1 = r5.A0V
            r0 = 2131231047(0x7f080147, float:1.8078164E38)
            r1.setImageResource(r0)
            goto L_0x00d0
        L_0x03a5:
            A04(r5, r7)
            goto L_0x008d
        L_0x03aa:
            com.facebook.shimmer.ShimmerFrameLayout r0 = r5.A04
            r0.setVisibility(r3)
            com.whatsapp.TextEmojiLabel r0 = r5.A07
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r5.A02
            goto L_0x008a
        L_0x03b8:
            android.view.View r0 = r5.A00
            r28 = r0
            android.view.ViewGroup r0 = r5.A01
            r0.setVisibility(r2)
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r5.A0I
            r10 = 0
            r0.setVisibility(r3)
            r0 = 3
            java.util.ArrayList r9 = X.C17880vN.A0z(r0)
            java.util.List r1 = r6.A06
            java.util.List r0 = r6.A05
            if (r1 == 0) goto L_0x03d5
            r9.addAll(r1)
        L_0x03d5:
            if (r0 == 0) goto L_0x03da
            r9.addAll(r0)
        L_0x03da:
            int r1 = r6.A01
            if (r1 == 0) goto L_0x04c4
            r10 = 1
            if (r1 == r10) goto L_0x03ef
            r0 = 2
            if (r1 == r0) goto L_0x04c4
        L_0x03e4:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r8 = r5.A0I
            r1 = 19
            r0 = r28
            X.C90084dV.A00(r8, r5, r7, r0, r1)
            goto L_0x00a5
        L_0x03ef:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x04bd
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r8 = r5.A0I
            X.9kB r1 = r5.A0H
            X.C18070vi.A0d(r1, r10)
            android.view.LayoutInflater r20 = X.AnonymousClass3MZ.A0D(r8)
            com.facebook.shimmer.ShimmerFrameLayout r11 = r8.A00
            if (r11 == 0) goto L_0x0408
            r0 = 0
            r11.A05(r0)
        L_0x0408:
            android.widget.LinearLayout r0 = r8.A01
            r27 = r0
            r27.removeAllViews()
            r0 = 3
            java.util.List r0 = X.C29431cG.A0v(r9, r0)
            java.util.Iterator r19 = r0.iterator()
            r11 = 0
        L_0x0419:
            boolean r0 = r19.hasNext()
            if (r0 == 0) goto L_0x03e4
            java.lang.Object r18 = r19.next()
            int r17 = r11 + 1
            if (r11 >= 0) goto L_0x042c
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x042c:
            r0 = r18
            java.lang.String r0 = (java.lang.String) r0
            r18 = r0
            X.C18070vi.A0b(r20)
            r12 = 2131624387(0x7f0e01c3, float:1.8875952E38)
            r0 = r20
            android.view.View r12 = r0.inflate(r12, r8, r3)
            r14 = -1
            r0 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r13 = new android.widget.LinearLayout$LayoutParams
            r13.<init>(r14, r14, r0)
            r12.setLayoutParams(r13)
            r0 = 2131434115(0x7f0b1a83, float:1.8490035E38)
            android.widget.ImageView r16 = X.AnonymousClass3MW.A0H(r12, r0)
            r0 = 2131434112(0x7f0b1a80, float:1.8490029E38)
            android.view.View r13 = r12.findViewById(r0)
            r13.setVisibility(r2)
            X.0ve r0 = r1.A00
            r15 = r0
            r14 = 2185(0x889, float:3.062E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r15, r14)
            if (r0 == 0) goto L_0x0473
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            r0 = 2131433300(0x7f0b1754, float:1.8488382E38)
            r15 = r16
            r15.setTag(r0, r14)
        L_0x0473:
            X.4VT r0 = r1.A01
            r14 = r0
            X.7My r0 = new X.7My
            r0.<init>(r12, r13, r1, r3)
            r22 = 0
            r21 = r14
            r23 = r22
            r24 = r16
            r25 = r0
            r26 = r18
            r21.A00(r22, r23, r24, r25, r26)
            r0 = r27
            r0.addView(r12)
            int r0 = r9.size()
            int r0 = r0 + -1
            if (r11 == r0) goto L_0x04b9
            android.content.Context r0 = r8.getContext()
            android.view.View r13 = new android.view.View
            r13.<init>(r0)
            android.content.res.Resources r11 = r13.getResources()
            r0 = 2131166479(0x7f07050f, float:1.7947205E38)
            int r12 = r11.getDimensionPixelSize(r0)
            r11 = -1
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r12, r11)
            r13.setLayoutParams(r0)
            r0 = r27
            r0.addView(r13)
        L_0x04b9:
            r11 = r17
            goto L_0x0419
        L_0x04bd:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r0 = r5.A0I
            r0.setVisibility(r2)
            goto L_0x03e4
        L_0x04c4:
            com.whatsapp.businessdirectory.view.custom.DirectoryProductImagesCardView r12 = r5.A0I
            android.widget.LinearLayout r11 = r12.A01
            r11.removeAllViews()
            android.view.LayoutInflater r1 = X.AnonymousClass3MZ.A0D(r12)
            X.C18070vi.A0X(r1)
            r0 = 2131624387(0x7f0e01c3, float:1.8875952E38)
            android.view.View r9 = r1.inflate(r0, r12, r3)
            r8 = -1
            r1 = 1065353216(0x3f800000, float:1.0)
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r8, r8, r1)
            r9.setLayoutParams(r0)
            com.facebook.shimmer.ShimmerFrameLayout r9 = (com.facebook.shimmer.ShimmerFrameLayout) r9
            if (r10 == 0) goto L_0x04f6
            r0 = 2131434112(0x7f0b1a80, float:1.8490029E38)
            android.view.View r0 = X.AnonymousClass3MX.A0C(r9, r0)
            r0.setVisibility(r3)
            r0 = 0
            r9.A05(r0)
        L_0x04f6:
            r12.A00 = r9
            r11.addView(r9)
            goto L_0x03e4
        L_0x04fd:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20109A7p.A06(X.8wY):void");
    }

    public C20109A7p(AnonymousClass11S r2, A6I a6i, C192609og r4, C189989kB r5, C27191Vc r6, AnonymousClass118 r7, C18000vb r8, C18030ve r9, AnonymousClass1XN r10, C36921og r11, AnonymousClass10I r12) {
        this.A0M = r9;
        this.A0K = r7;
        this.A05 = r2;
        this.A0P = r12;
        this.A0H = r5;
        this.A0L = r8;
        this.A0N = r10;
        this.A0G = r4;
        this.A0F = a6i;
        this.A0J = r6;
        this.A0O = r11;
    }
}
