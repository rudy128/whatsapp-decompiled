package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* renamed from: X.8IS  reason: invalid class name */
public abstract class AnonymousClass8IS extends C42011xT {
    public void A0B(C182879Wb r15) {
        C28931bI r1;
        int i;
        C28931bI r8;
        TextView textView;
        TextView A0M;
        TextView A0M2;
        String string;
        float f;
        C195679tj r0;
        A6S a6s;
        TextView textView2;
        String A0q;
        Context A0D;
        int i2;
        Object[] objArr;
        String str;
        BigDecimal bigDecimal;
        A6S a6s2;
        Context A0D2;
        int i3;
        A6S a6s3;
        if (this instanceof C168098iH) {
            C168098iH r6 = (C168098iH) this;
            ADV adv = ((C168008i8) r15).A00;
            r6.A02.setText(adv.A06);
            BigDecimal bigDecimal2 = adv.A02;
            if (bigDecimal2 == null || (a6s3 = adv.A01) == null) {
                A0D2 = C108945cZ.A0D(r6);
                i3 = 2131893277;
            } else {
                r6.A01.setText(a6s3.A03(r6.A0B, bigDecimal2, true));
                A0D2 = C108945cZ.A0D(r6);
                i3 = 2131893275;
            }
            Object[] objArr2 = new Object[1];
            C17880vN.A1T(objArr2, adv.A00, 0);
            r6.A03.setText(A0D2.getString(i3, objArr2));
            ImageView imageView = r6.A00;
            C20246ADe aDe = adv.A05;
            C20005A2v a2v = r6.A08;
            UserJid userJid = r6.A0C;
            C183889Zz r12 = null;
            if (userJid != null) {
                r12 = new C183889Zz(new C182919Wf(897465374), userJid);
            }
            AnonymousClass9PO.A00(imageView, r12, a2v, aDe);
            r6.A06.A0D(new C20471AMi(r6, adv, 7), userJid);
            return;
        }
        if (this instanceof C168068iE) {
            C168068iE r2 = (C168068iE) this;
            C168028iA r152 = (C168028iA) r15;
            r2.A00.setText(r152.A00);
            boolean z = r152.A01;
            r1 = r2.A01;
            i = C72453Mb.A07(z ? 1 : 0);
        } else if (this instanceof C168088iG) {
            C168088iG r82 = (C168088iG) this;
            C18070vi.A0d(r15, 0);
            if (r15 instanceof C168038iB) {
                C168038iB r153 = (C168038iB) r15;
                C195679tj r3 = r153.A00;
                C28931bI r02 = r82.A03;
                if (r3 != null) {
                    if (r02 != null) {
                        r02.A04(8);
                    }
                    C28931bI r03 = r82.A04;
                    if (r03 != null) {
                        r03.A04(0);
                    }
                    TextView textView3 = (TextView) r82.A06.getValue();
                    if (textView3 != null) {
                        textView3.setText(r3.A06);
                    }
                    View view = (View) r82.A07.getValue();
                    if (view != null) {
                        view.setVisibility(C72453Mb.A07(C18020vd.A05(C18040vf.A02, r82.A02, 7120) ^ true ? 1 : 0));
                    }
                    if (!(!C18020vd.A05(C18040vf.A02, r82.A02, 7120)) || (bigDecimal = r153.A02) == null || (a6s2 = r153.A01) == null) {
                        int i4 = r3.A00;
                        if (i4 == 2) {
                            C18100vl r13 = r82.A05;
                            View view2 = (View) r13.getValue();
                            if (view2 != null) {
                                view2.setVisibility(0);
                            }
                            textView2 = (TextView) r13.getValue();
                            if (textView2 != null) {
                                A0D = C108945cZ.A0D(r82);
                                i2 = 2131886684;
                                objArr = new Object[1];
                                str = r3.A03;
                            } else {
                                return;
                            }
                        } else if (i4 != 1 || (a6s = r153.A01) == null) {
                            C18100vl r22 = r82.A05;
                            TextView textView4 = (TextView) r22.getValue();
                            if (textView4 != null) {
                                textView4.setText((CharSequence) null);
                            }
                            View view3 = (View) r22.getValue();
                            if (view3 != null) {
                                view3.setVisibility(8);
                                return;
                            }
                            return;
                        } else {
                            C18100vl r23 = r82.A05;
                            View view4 = (View) r23.getValue();
                            if (view4 != null) {
                                view4.setVisibility(0);
                            }
                            BigDecimal A00 = C197309wU.A00(a6s, C17900vP.A01(AnonymousClass1YD.A04(r3.A03)));
                            textView2 = (TextView) r23.getValue();
                            if (textView2 != null) {
                                A0q = C17880vN.A0q(C108945cZ.A0D(r82), a6s.A03(r82.A01, A00, true), new Object[1], 0, 2131886682);
                                textView2.setText(A0q);
                                return;
                            }
                            return;
                        }
                    } else {
                        str = a6s2.A03(r82.A01, bigDecimal, true);
                        C18070vi.A0X(str);
                        textView2 = (TextView) r82.A05.getValue();
                        if (textView2 != null) {
                            A0D = C108945cZ.A0D(r82);
                            i2 = 2131886681;
                            objArr = new Object[1];
                        } else {
                            return;
                        }
                    }
                    A0q = C17880vN.A0q(A0D, str, objArr, 0, i2);
                    textView2.setText(A0q);
                    return;
                }
                if (r02 != null) {
                    r02.A04(0);
                }
                C28931bI r04 = r82.A04;
                if (r04 != null) {
                    r04.A04(8);
                    return;
                }
                return;
            }
            return;
        } else if (this instanceof C168118iJ) {
            C168118iJ r5 = (C168118iJ) this;
            C18070vi.A0d(r15, 0);
            if (r15 instanceof C168048iC) {
                View view5 = r5.A01;
                C168048iC r154 = (C168048iC) r15;
                boolean z2 = r154.A05;
                view5.setVisibility(C72453Mb.A01(z2 ^ true ? 1 : 0));
                View view6 = r5.A0H;
                int paddingLeft = view6.getPaddingLeft();
                if (z2) {
                    C72463Mc.A14(view6, paddingLeft, 0);
                } else {
                    C72463Mc.A14(view6, paddingLeft, r5.A00);
                }
                C168118iJ.A01(r5.A0B, r5.A0A, r154.A04);
                C168118iJ.A01(r5.A09, r5.A08, r154.A03);
                String str2 = r154.A01;
                if (str2 == null || str2.length() == 0) {
                    C28931bI r05 = r5.A05;
                    r8 = r5.A04;
                    AnonymousClass3Ma.A1M(r05);
                    AnonymousClass3Ma.A1M(r8);
                } else {
                    C28931bI r06 = r5.A05;
                    r8 = r5.A04;
                    if (r06 != null) {
                        r06.A04(0);
                    }
                    if (r8 != null) {
                        r8.A04(0);
                    }
                    if (!(r06 == null || (A0M2 = AnonymousClass3MX.A0M(r06)) == null)) {
                        Context context = view6.getContext();
                        if (!(!C18020vd.A05(C18040vf.A02, r5.A03, 7120)) || (r0 = r154.A00) == null) {
                            C195679tj r11 = r154.A00;
                            if (r11 != null) {
                                int i5 = r11.A00;
                                if (i5 == 1) {
                                    string = C17880vN.A0q(context, r11.A06, new Object[1], 0, 2131887960);
                                } else if (i5 == 2) {
                                    Object[] objArr3 = new Object[2];
                                    NumberFormat A0M3 = r5.A02.A0M();
                                    String str3 = r11.A03;
                                    Float f2 = null;
                                    try {
                                        if (C182189Tk.A00.A03(str3)) {
                                            f2 = Float.valueOf(Float.parseFloat(str3));
                                            if (f2 != null) {
                                                f = f2.floatValue();
                                                objArr3[0] = A0M3.format(Float.valueOf(f / 100.0f));
                                                string = C17880vN.A0q(context, r11.A06, objArr3, 1, 2131887961);
                                            }
                                        }
                                    } catch (NumberFormatException unused) {
                                    }
                                    f = 0.0f;
                                    objArr3[0] = A0M3.format(Float.valueOf(f / 100.0f));
                                    string = C17880vN.A0q(context, r11.A06, objArr3, 1, 2131887961);
                                }
                                C18070vi.A0X(string);
                            }
                            string = context.getString(2131887958);
                            C18070vi.A0X(string);
                        } else {
                            string = C17880vN.A0q(context, r0.A06, new Object[1], 0, 2131887959);
                            C18070vi.A0b(string);
                        }
                        A0M2.setText(string);
                    }
                    if (!(r8 == null || (A0M = AnonymousClass3MX.A0M(r8)) == null)) {
                        A0M.setText(str2);
                    }
                }
                String str4 = r154.A02;
                if (str4 != null) {
                    C168118iJ.A01(r5.A07, r5.A06, str4);
                    return;
                }
                AnonymousClass3Ma.A1M(r8);
                C28931bI r07 = r5.A07;
                if (!(r07 == null || (textView = (TextView) AnonymousClass3MY.A0I(r07, 0)) == null)) {
                    textView.setText(2131892959);
                }
                AnonymousClass3Ma.A1M(r5.A06);
                return;
            }
            return;
        } else if (this instanceof C168108iI) {
            C18070vi.A0d(r15, 0);
            A0C(r15, C18460wS.A00);
            return;
        } else if (this instanceof C168058iD) {
            C168058iD r52 = (C168058iD) this;
            C18070vi.A0d(r15, 0);
            C167998i7 r155 = (C167998i7) r15;
            r52.A00.setText(C72473Md.A0k(AnonymousClass000.A0Y(r52.A0H), r155.A00, 2131755344));
            boolean z3 = r155.A01;
            r1 = r52.A01;
            if (z3) {
                r1.A04(0);
                return;
            }
            i = 8;
        } else {
            return;
        }
        r1.A04(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C182879Wb r14, java.util.List r15) {
        /*
            r13 = this;
            boolean r0 = r13 instanceof X.C168108iI
            if (r0 == 0) goto L_0x0131
            r6 = r13
            X.8iI r6 = (X.C168108iI) r6
            r5 = 0
            X.C18070vi.A0d(r14, r5)
            X.8i9 r14 = (X.C168018i9) r14
            X.9rM r8 = r14.A00
            android.widget.TextView r1 = r6.A04
            X.AEv r4 = r8.A01
            java.lang.String r0 = r4.A08
            r1.setText(r0)
            com.whatsapp.biz.catalog.view.widgets.QuantitySelector r7 = r6.A0B
            long r2 = r8.A00
            long r0 = r4.A01
            r7.A04(r2, r0)
            r7.setVisibility(r5)
            long r0 = r8.A00
            java.math.BigDecimal r3 = r4.A09
            X.A6S r9 = r4.A07
            X.AE5 r11 = r4.A04
            X.0vb r8 = r6.A0E
            java.util.Date r12 = r14.A01
            r10 = 0
            if (r3 == 0) goto L_0x011d
            if (r9 == 0) goto L_0x011d
            java.math.BigDecimal r2 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r2 = r3.multiply(r2)
            r7 = 1
            java.lang.String r3 = r9.A03(r8, r2, r7)
            if (r11 == 0) goto L_0x0058
            boolean r2 = r11.A00(r12)
            if (r2 == 0) goto L_0x0058
            java.math.BigDecimal r2 = r11.A00
            java.math.BigDecimal r0 = java.math.BigDecimal.valueOf(r0)
            java.math.BigDecimal r0 = r2.multiply(r0)
            java.lang.String r10 = r9.A03(r8, r0, r7)
        L_0x0058:
            X.0yx r1 = X.AnonymousClass8BR.A0B(r3, r10)
        L_0x005c:
            java.lang.Object r2 = r1.A00
            if (r2 != 0) goto L_0x00f3
            android.widget.TextView r1 = r6.A02
            java.lang.String r0 = "$000.00"
            r1.setText(r0)
            android.widget.LinearLayout r1 = r6.A01
            r0 = 4
        L_0x006a:
            r1.setVisibility(r0)
        L_0x006d:
            boolean r0 = r15.isEmpty()
            if (r0 == 0) goto L_0x0095
            android.widget.ImageView r3 = r6.A00
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            boolean r0 = X.C168108iI.A00(r3, r6, r4)
            if (r0 != 0) goto L_0x0095
            X.9yv r0 = r6.A07
            java.lang.String r2 = r4.A0H
            X.C18070vi.A0d(r2, r5)
            X.A7x r1 = r0.A0H
            r0 = 0
            X.AEv r0 = r1.A0A(r0, r2)
            if (r0 == 0) goto L_0x00ef
            boolean r0 = X.C168108iI.A00(r3, r6, r0)
            if (r0 == 0) goto L_0x00ef
        L_0x0095:
            X.A1i r3 = r6.A0C
            X.9Wa r0 = r6.A08
            X.8Hz r0 = r0.A00
            X.AEW r2 = r0.A00
            com.whatsapp.jid.UserJid r1 = r6.A0F
            r0 = 0
            if (r1 == 0) goto L_0x00a8
            X.A7x r0 = r6.A0A
            X.9Hv r0 = r0.A09(r1)
        L_0x00a8:
            boolean r0 = r3.A01(r0, r2)
            if (r0 == 0) goto L_0x0124
            X.AE6 r0 = r4.A05
            if (r0 == 0) goto L_0x0124
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x0124
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0124
            android.widget.TextView r7 = r6.A05
            r7.setVisibility(r5)
            X.9k4 r1 = r6.A0D
            X.AE6 r0 = r4.A05
            java.util.List r3 = r1.A00(r0)
            boolean r0 = r3.isEmpty()
            r2 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00dc
            r7.setVisibility(r5)
            java.lang.Object r0 = r3.get(r5)
            X.AnonymousClass8BR.A1E(r7, r0)
        L_0x00dc:
            int r0 = r3.size()
            if (r0 <= r2) goto L_0x00ee
            android.widget.TextView r1 = r6.A06
            r1.setVisibility(r5)
            java.lang.Object r0 = r3.get(r2)
            X.AnonymousClass8BR.A1E(r1, r0)
        L_0x00ee:
            return
        L_0x00ef:
            X.AnonymousClass9PP.A00(r3)
            goto L_0x0095
        L_0x00f3:
            android.widget.LinearLayout r0 = r6.A01
            r0.setVisibility(r5)
            java.lang.Object r1 = r1.A01
            android.widget.TextView r0 = r6.A02
            if (r1 != 0) goto L_0x0107
            X.AnonymousClass8BR.A1E(r0, r2)
            android.widget.TextView r1 = r6.A03
            r0 = 8
            goto L_0x006a
        L_0x0107:
            X.AnonymousClass8BR.A1E(r0, r1)
            android.widget.TextView r1 = r6.A03
            X.AnonymousClass8BR.A1E(r1, r2)
            r1.setVisibility(r5)
            int r0 = r1.getPaintFlags()
            r0 = r0 | 16
            r1.setPaintFlags(r0)
            goto L_0x006d
        L_0x011d:
            X.0yx r1 = new X.0yx
            r1.<init>(r10, r10)
            goto L_0x005c
        L_0x0124:
            android.widget.TextView r0 = r6.A05
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r6.A06
            r0.setVisibility(r1)
            return
        L_0x0131:
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            r13.A0B(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8IS.A0C(X.9Wb, java.util.List):void");
    }
}
