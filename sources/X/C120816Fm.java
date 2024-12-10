package X;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import com.whatsapp.TextEmojiLabel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Fm  reason: invalid class name and case insensitive filesystem */
public abstract class C120816Fm extends C120826Fn {
    public C19760yx A00;
    public TextEmojiLabel A01;
    public C42131xg A02;
    public AnonymousClass2DC A03;
    public CharSequence A04;
    public C116715yV A05;
    public final int A06;
    public final C37471pb A07;
    public final int A08;

    public abstract CharSequence A05(AnonymousClass1E7 r1, AnonymousClass206 r2);

    public static void A02(AnonymousClass206 r3, C120816Fm r4, List list) {
        C19760yx r2 = r4.A00;
        if (r2 != null && Boolean.TRUE.equals(r2.A00) && r4.A04 != null) {
            r4.A09(C43351zf.A02(r4.getContext(), r4.A06, r4.A05((AnonymousClass1E7) r2.A01, r3), list), r4.A04);
        }
    }

    private void setTitleColorBasedOnQuery(List list) {
        C42131xg r0;
        int i;
        if (list == null || list.isEmpty()) {
            r0 = this.A02;
            i = this.A08;
        } else {
            r0 = this.A02;
            i = this.A06;
        }
        r0.A06.getContactNameView().setTextColor(i);
    }

    public CharSequence A06(AnonymousClass206 r10, List list) {
        String str;
        C62572rc r0;
        String str2;
        String str3;
        if (this instanceof C120706Fa) {
            C120706Fa r4 = (C120706Fa) this;
            AnonymousClass210 r102 = (AnonymousClass210) r10;
            if (r4 instanceof C120806Fl) {
                C120806Fl r42 = (C120806Fl) r4;
                C18030ve r3 = r42.A08;
                C32011gU r5 = r42.A01;
                Context context = r42.getContext();
                if (r102.A17() == null) {
                    str3 = "";
                } else {
                    str3 = r102.A17();
                }
                if (list != null && !"".equals(str3)) {
                    String str4 = C87754Wv.A05.A01(context, r3, r5, r102).A03;
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (!str4.isEmpty() && str3.contains(str4)) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (str4.contains(C17880vN.A0v(it))) {
                                int indexOf = str3.indexOf(str4);
                                if (indexOf == 0 || indexOf == str3.length() - str4.length()) {
                                    String str5 = r102.A06;
                                    String str6 = r102.A05;
                                    String A002 = AnonymousClass2VB.A00(r5, str4);
                                    String[] strArr = new String[3];
                                    AnonymousClass001.A1Q(str5, str6, strArr);
                                    strArr[2] = A002;
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        int i = 0;
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String A0v = C17880vN.A0v(it2);
                                        while (true) {
                                            String str7 = strArr[i];
                                            if (str7 != null && str7.contains(A0v)) {
                                                return str3.replace(str4, "");
                                            }
                                            i++;
                                            if (i >= 3) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                str3 = "";
                if ((r102 instanceof C438721g) && ((C438721g) r102).A1D(r4.A08)) {
                    return str3;
                }
                if (r102.A0L().A00 != null) {
                    String str8 = r102.A0L().A00.A00;
                    if (!TextUtils.isEmpty(str8)) {
                        str3 = str8;
                    }
                    if (!TextUtils.isEmpty(r102.A0P())) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("*");
                        A10.append(r102.A0P());
                        return AnonymousClass001.A1H("*\n\n", str3, A10);
                    }
                } else if (r102.A17() != null) {
                    return r102.A17();
                }
            }
            return str3;
        } else if ((this instanceof C120726Fd) || (this instanceof C120736Fe)) {
            return "";
        } else {
            if (this instanceof C120796Fk) {
                C120796Fk r2 = (C120796Fk) this;
                AnonymousClass21V r103 = (AnonymousClass21V) r10;
                str = C20097A7a.A02(r103);
                if (TextUtils.isEmpty(str) && ((str = r103.A18()) == null || C20097A7a.A05(r103))) {
                    return r2.getDefaultMessageText();
                }
            } else {
                AnonymousClass6Fc r1 = (AnonymousClass6Fc) this;
                if (r1 instanceof AnonymousClass6FR) {
                    C441722k r104 = (C441722k) r10;
                    C18030ve r22 = ((AnonymousClass6FR) r1).A01.A01;
                    C18040vf r12 = C18040vf.A02;
                    if (!C18020vd.A05(r12, r22, 2890) || !C18020vd.A05(r12, r22, 10286)) {
                        return "";
                    }
                    AnonymousClass7LG r13 = (AnonymousClass7LG) r104.A00.A02;
                    CM2 cm2 = null;
                    if (r13 != null) {
                        cm2 = r13.A04;
                    }
                    str = "";
                    if (!(cm2 instanceof C24126Bvs) || (r0 = r104.A02) == null || (str2 = r0.A0P) == null) {
                        return str;
                    }
                    return str2;
                } else if (!(r1 instanceof AnonymousClass6FS)) {
                    return "";
                } else {
                    AnonymousClass218 r105 = (AnonymousClass218) r10;
                    if (!(r105 instanceof AnonymousClass219) || (str = ((AnonymousClass219) r105).A03) == null) {
                        return "";
                    }
                }
            }
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (r0 == null) goto L_0x0027;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0067 A[SYNTHETIC, Splitter:B:11:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass206 r12, java.util.List r13) {
        /*
            r11 = this;
            X.5yV r0 = r11.A05
            X.C108955ca.A1O(r0)
            X.2DC r0 = r11.A03
            X.C108955ca.A1O(r0)
            r8 = r13
            r11.setTitleColorBasedOnQuery(r13)
            X.1M9 r0 = r11.A02
            X.1E7 r3 = X.AnonymousClass25G.A00(r0, r12)
            r2 = 0
            if (r3 == 0) goto L_0x0027
            X.11S r0 = r11.A01
            X.1BI r1 = X.AnonymousClass25G.A01(r0, r3, r12)
            if (r1 == 0) goto L_0x005e
            X.1M9 r0 = r11.A02
            X.1E7 r0 = r0.A0D(r1)
            if (r0 != 0) goto L_0x005f
        L_0x0027:
            X.1xg r0 = r11.A02
            r0.A02()
            java.lang.Boolean r1 = X.AnonymousClass000.A0h()
            X.0yx r0 = new X.0yx
            r0.<init>(r1, r2)
            r11.A00 = r0
            X.11S r1 = r11.A01
            X.1M9 r0 = r11.A02
            X.5yV r3 = new X.5yV
            r3.<init>(r1, r0, r12)
            r11.A05 = r3
            X.1pb r2 = r11.A07
            r1 = 1
            X.7Ef r0 = new X.7Ef
            r0.<init>(r12, r11, r13, r1)
            r2.A00(r0, r3)
            java.lang.CharSequence r7 = r11.A06(r12, r13)
        L_0x0051:
            X.0ve r2 = r11.A08
            X.0vf r1 = X.C18040vf.A01
            r0 = 8944(0x22f0, float:1.2533E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x006b
            goto L_0x0067
        L_0x005e:
            r0 = r2
        L_0x005f:
            java.lang.CharSequence r7 = r11.A06(r12, r13)
            r11.A07(r3, r0, r12, r13)
            goto L_0x0051
        L_0x0067:
            java.lang.CharSequence r7 = X.C26302CxJ.A0E(r7)     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            android.content.Context r1 = r11.getContext()
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.text.TextPaint r2 = r0.getPaint()
            com.whatsapp.TextEmojiLabel r0 = r11.A01
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            int r10 = r0.getMeasuredWidth()
            X.1KW r5 = r11.A07
            X.11C r3 = r11.A04
            X.0vb r4 = r11.A06
            X.0vc r6 = r11.A09
            r9 = 3
            X.2DC r0 = new X.2DC
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.A03 = r0
            r10 = 0
            X.7Ef r5 = new X.7Ef
            r5.<init>(r12, r11, r13, r10)
            int r1 = r7.length()
            r0 = 768(0x300, float:1.076E-42)
            if (r1 > r0) goto L_0x00c7
            X.1zY r9 = new X.1zY
            r9.<init>(r7)
            int r8 = r7.length()
            r7 = 0
        L_0x00a9:
            if (r7 >= r8) goto L_0x00bd
            r9.A00 = r7
            long r3 = X.C43291zZ.A00(r9, r10)
            int r6 = r9.A02(r3, r7)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00c7
            int r7 = r7 + r6
            goto L_0x00a9
        L_0x00bd:
            X.2DC r0 = r11.A03
            java.lang.Object r0 = r0.call()     // Catch:{ 1QC -> 0x00d5 }
            r5.BpK(r0)     // Catch:{ 1QC -> 0x00d5 }
            return
        L_0x00c7:
            com.whatsapp.TextEmojiLabel r1 = r11.A01
            r0 = 80
            r1.setPlaceholder(r0)
            X.1pb r1 = r11.A07
            X.2DC r0 = r11.A03
            r1.A00(r5, r0)
        L_0x00d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C120816Fm.A08(X.206, java.util.List):void");
    }

    public Paint getMessageViewPaint() {
        return this.A01.getPaint();
    }

    public C120816Fm(Context context, C37471pb r4) {
        super(context);
        this.A07 = r4;
        this.A06 = AnonymousClass3Ma.A00(context, 2130970340, 2131101312);
        this.A08 = AnonymousClass3Ma.A00(context, 2130970343, 2131101314);
        if (!(this instanceof AnonymousClass6FS) && !(this instanceof AnonymousClass6FT)) {
            A04();
        }
    }

    public static CharSequence A01(AnonymousClass1E7 r8, AnonymousClass206 r9, C120826Fn r10) {
        Context context = r10.getContext();
        boolean z = r9.A0v.A02;
        return AnonymousClass25G.A03(context, r10.A01, r10.A03, r10.A06, r8, r10.A08, z);
    }

    public void A07(AnonymousClass1E7 r6, AnonymousClass1E7 r7, AnonymousClass206 r8, List list) {
        C42131xg r1;
        int i;
        this.A00 = new C19760yx(AnonymousClass000.A0i(), r7);
        this.A02.A04(r6, C43351zf.A01, list);
        this.A02.A03.A0E(r6);
        setTitleColorBasedOnQuery(list);
        if (this instanceof C120796Fk) {
            r1 = this.A02;
            i = 8;
        } else {
            C19760yx r0 = new C19760yx(C64052u8.A0C(this.A06, this.A05.A09(r8.A0I), false), C64052u8.A0C(this.A06, this.A05.A09(r8.A0I), true));
            this.A02.A06((CharSequence) r0.A00, (CharSequence) r0.A01);
            r1 = this.A02;
            i = 0;
        }
        r1.A03(i);
        A02(r8, this, list);
    }

    public void A09(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence A042 = AnonymousClass25G.A04(charSequence, charSequence2);
        this.A01.setPlaceholder(0);
        if (TextUtils.isEmpty(A042)) {
            this.A01.setVisibility(8);
            return;
        }
        this.A01.setVisibility(0);
        this.A01.A0R(A042);
    }
}
