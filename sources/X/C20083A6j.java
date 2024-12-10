package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* renamed from: X.A6j  reason: case insensitive filesystem */
public abstract class C20083A6j {
    public final C18000vb A00;
    public final A79 A01;
    public final C20285AEt A02;

    public CharSequence A08(Context context, Paint paint) {
        String str;
        int length;
        StringBuilder A10 = AnonymousClass000.A10();
        String A0D = A0D();
        if (!(A0D == null || (length = A0D.length()) == 0)) {
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= i) {
                int i3 = i;
                if (!z) {
                    i3 = i2;
                }
                boolean A0u = C109005cf.A0u(A0D, i3);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    i--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i2++;
                }
            }
            A10.append(C108985cd.A0g(i, i2, A0D));
        }
        AEE aee = this.A02.A05;
        if (aee != null) {
            str = aee.A01;
        } else {
            str = null;
        }
        A03(str, "\n", A10);
        A03(A07(context, paint), "\n", A10);
        Drawable A05 = A05(context);
        if (A05 == null) {
            return A10;
        }
        CharSequence A03 = C72813Np.A03(paint, A05, A10);
        C18070vi.A0b(A03);
        return A03;
    }

    public static final void A03(CharSequence charSequence, String str, StringBuilder sb) {
        if (charSequence != null && charSequence.length() != 0) {
            if (sb.length() > 0) {
                sb.append(str);
            }
            sb.append(charSequence);
        }
    }

    public int A04() {
        if (this instanceof C1773798i) {
            return 33;
        }
        if (this instanceof C1773598g) {
            return 25;
        }
        if (this instanceof C1773998k) {
            if (!AnonymousClass8BU.A1S(this.A02, "galaxy_message")) {
                return 35;
            }
            return 1;
        } else if (this instanceof C1774098l) {
            return 55;
        } else {
            return 1;
        }
    }

    public Drawable A05(Context context) {
        int i;
        if (this instanceof C1773798i) {
            C18070vi.A0d(context, 0);
            Drawable A022 = AnonymousClass4aX.A02(context, 2131232301, 2131101888);
            C18070vi.A0X(A022);
            return A022;
        }
        if (this instanceof C1773898j) {
            C18070vi.A0d(context, 0);
            if (!C1773898j.A00((C1773898j) this)) {
                return null;
            }
            i = 2131231696;
        } else if (!(this instanceof C1774198m)) {
            return null;
        } else {
            C18070vi.A0d(context, 0);
            i = 2131233415;
        }
        return AnonymousClass4aX.A02(context, i, AnonymousClass1YL.A00(context, 2130970920, 2131102363));
    }

    public C29621ca A06() {
        if (this instanceof C1773698h) {
            AnonymousClass1MD[] r2 = new AnonymousClass1MD[1];
            AnonymousClass8BV.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "product_list", r2);
            return new C29621ca(AnonymousClass8BR.A0k("list", r2), "biz", (AnonymousClass1MD[]) null);
        } else if (this instanceof C1773898j) {
            C29591cX A0t = C108945cZ.A0t("biz");
            C29591cX A0t2 = C108945cZ.A0t("interactive");
            C29591cX.A01(A0t2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "native_flow");
            C108965cb.A1H(A0t2, "v", C164818a7.DEFAULT_INSTANCE.messageVersion_);
            AnonymousClass1MD[] r22 = new AnonymousClass1MD[1];
            AnonymousClass8BV.A1M(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "payment_info", r22);
            A0t2.A05(AnonymousClass8BR.A0k("native_flow", r22));
            return C29591cX.A00(A0t2, A0t);
        } else if (!(this instanceof C1774198m)) {
            return null;
        } else {
            AnonymousClass1MD[] r23 = new AnonymousClass1MD[1];
            AnonymousClass8BV.A1M("native_flow_name", "order_details", r23);
            return AnonymousClass8BR.A0k("biz", r23);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A00, 4672) != false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Integer A09() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.C1773798i
            if (r0 != 0) goto L_0x0041
            boolean r0 = r4 instanceof X.C1773698h
            if (r0 != 0) goto L_0x0041
            boolean r0 = r4 instanceof X.C1773998k
            if (r0 == 0) goto L_0x001f
            r3 = r4
            X.98k r3 = (X.C1773998k) r3
            X.AEt r2 = r3.A02
            int r1 = r2.A00
            r0 = 9
            if (r1 != r0) goto L_0x0022
            java.lang.String r0 = "galaxy_message"
            boolean r0 = X.AnonymousClass8BU.A1S(r2, r0)
            if (r0 == 0) goto L_0x0022
        L_0x001f:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            return r0
        L_0x0022:
            X.AEk r0 = r2.A06
            if (r0 == 0) goto L_0x002b
            int r1 = r0.A01
            r0 = 1
            if (r1 == r0) goto L_0x0041
        L_0x002b:
            java.lang.String r0 = r2.A0E
            if (r0 == 0) goto L_0x001f
            int r0 = r0.length()
            if (r0 == 0) goto L_0x001f
            X.0ve r2 = r3.A00
            r1 = 4672(0x1240, float:6.547E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001f
        L_0x0041:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083A6j.A09():java.lang.Integer");
    }

    public String A0A() {
        String str;
        if (this instanceof C1774198m) {
            StringBuilder A10 = AnonymousClass000.A10();
            C20285AEt aEt = this.A02;
            return A01(aEt, aEt.A0B, "\n", A10);
        } else if (this instanceof C1774098l) {
            return A0B();
        } else {
            StringBuilder A102 = AnonymousClass000.A10();
            A03(A0D(), "\n", A102);
            C20285AEt aEt2 = this.A02;
            AEE aee = aEt2.A05;
            if (aee != null) {
                str = aee.A01;
            } else {
                str = null;
            }
            A03(str, "\n", A102);
            return A01(aEt2, aEt2.A0B, "\n", A102);
        }
    }

    public String A0C() {
        String str;
        String str2;
        List list;
        if (this instanceof C1774198m) {
            C20285AEt aEt = this.A02;
            String str3 = null;
            C20279AEn aEn = aEt.A02;
            if (aEn == null) {
                return null;
            }
            List list2 = aEn.A0D.A09;
            if (list2 != null) {
                C18000vb r3 = this.A00;
                Object[] A1a = AnonymousClass3MW.A1a();
                C18070vi.A0b(list2);
                AnonymousClass000.A1L(A1a, list2.size());
                str2 = r3.A0C(2131888287, A1a);
            } else {
                str2 = null;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C20279AEn aEn2 = aEt.A02;
            if (!(aEn2 == null || (list = aEn2.A0D.A09) == null || list.isEmpty())) {
                str3 = C29431cG.A0h(", ", list, B3I.A00);
            }
            A03(str3, " ", A10);
            C20279AEn aEn3 = aEt.A02;
            if (!(aEn3 == null || aEn3.A0A == null || aEn3.A0F == null)) {
                A03(aEn3.A06(this.A00), " ", A10);
            }
            A03(str2, " ", A10);
            return A01(aEt, aEt.A0B, " ", A10);
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A03(A0D(), " ", A102);
        C20285AEt aEt2 = this.A02;
        AEE aee = aEt2.A05;
        if (aee != null) {
            str = aee.A01;
        } else {
            str = null;
        }
        A03(str, " ", A102);
        return A01(aEt2, aEt2.A0B, " ", A102);
    }

    public final String A0D() {
        AEE aee = this.A02.A05;
        if (aee != null) {
            return aee.A02;
        }
        return null;
    }

    public String A0E(Context context) {
        C20285AEt aEt;
        String str;
        C18030ve r5;
        Number number;
        Map map;
        Map map2;
        if (this instanceof C1773998k) {
            C1773998k r1 = (C1773998k) this;
            C18070vi.A0d(context, 0);
            aEt = r1.A02;
            str = aEt.A0B;
            r5 = r1.A00;
        } else if (!(this instanceof C1774198m)) {
            return this.A02.A0B;
        } else {
            C1774198m r12 = (C1774198m) this;
            C18070vi.A0d(context, 0);
            aEt = r12.A02;
            str = aEt.A0B;
            r5 = r12.A00;
        }
        if (!TextUtils.isEmpty(aEt.A01())) {
            String A012 = aEt.A01();
            if (AnonymousClass8BU.A1S(aEt, "review_order")) {
                if (A012 != null) {
                    String A022 = C20096A6z.A02(A012);
                    if (AnonymousClass000.A1O(AnonymousClass8BX.A03(r5))) {
                        map2 = C20096A6z.A03;
                    } else {
                        map2 = C20096A6z.A02;
                    }
                    number = C108945cZ.A1E(A022, map2);
                }
                number = null;
            } else if (AnonymousClass8BU.A1S(aEt, "payment_method")) {
                number = C20096A6z.A00(r5, A012);
            } else {
                if (!(!AnonymousClass8BU.A1S(aEt, "payment_status") || A012 == null || A012.length() == 0)) {
                    String str2 = null;
                    try {
                        str2 = C17880vN.A16(A012).optString("payment_status", "pending");
                    } catch (JSONException e) {
                        Log.e("CheckoutInfoContentParser/getCustomPaymentMethodStr failed to parse parameters json", e);
                    }
                    if (C20096A6z.A03(r5)) {
                        map = C20096A6z.A01;
                    } else {
                        map = C20096A6z.A00;
                    }
                    number = C108945cZ.A1E(str2, map);
                }
                number = null;
            }
            if (number != null) {
                String string = context.getResources().getString(number.intValue());
                if (TextUtils.isEmpty(str)) {
                    return string;
                }
                CharSequence[] charSequenceArr = new CharSequence[2];
                AnonymousClass001.A1Q(string, str, charSequenceArr);
                return AnonymousClass1EG.A08("\n", charSequenceArr);
            }
        }
        return str;
    }

    public void A0I(C29591cX r8) {
        String str;
        if (this instanceof C1773998k) {
            C20285AEt aEt = this.A02;
            if (AnonymousClass8BU.A1S(aEt, "review_order")) {
                C29591cX.A01(r8, "native_flow_name", "order_status");
                return;
            }
            int i = C164818a7.DEFAULT_INSTANCE.messageVersion_;
            C20277AEk aEk = aEt.A06;
            if (aEk == null || !AnonymousClass000.A1a(aEk.A03)) {
                str = "";
            } else {
                C20277AEk aEk2 = aEt.A06;
                C18070vi.A0b(aEk2);
                str = ((C20253ADl) aEk2.A03.get(0)).A01.A02;
            }
            C29591cX A0t = C108945cZ.A0t("interactive");
            C29591cX.A01(A0t, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "native_flow");
            C108965cb.A1H(A0t, "v", i);
            AnonymousClass1MD[] r1 = new AnonymousClass1MD[1];
            C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str, r1, 0);
            A0t.A05(AnonymousClass8BR.A0k("native_flow", r1));
            C108955ca.A1P(A0t, r8);
        }
    }

    public boolean A0J() {
        if (this instanceof C1774298n) {
            return false;
        }
        return AnonymousClass3Ma.A1Z(A09(), AnonymousClass00R.A00);
    }

    public C20083A6j(C20285AEt aEt, C185129c4 r3) {
        this.A02 = aEt;
        this.A01 = r3.A01;
        this.A00 = r3.A00;
    }

    public static String A01(C20285AEt aEt, CharSequence charSequence, String str, StringBuilder sb) {
        A03(charSequence, str, sb);
        A03(aEt.A0C, str, sb);
        String obj = sb.toString();
        C18070vi.A0X(obj);
        return obj;
    }

    public static void A02(C19998A2m a2m, AnonymousClass206 r2, C20285AEt aEt, AnonymousClass00H r4) {
        ((C42341y1) r4.get()).A00(aEt).A0H(a2m, r2);
    }

    public CharSequence A07(Context context, Paint paint) {
        StringBuilder A10 = AnonymousClass000.A10();
        C20285AEt aEt = this.A02;
        return A01(aEt, aEt.A0B, "\n", A10);
    }

    public String A0B() {
        String str;
        StringBuilder A10 = AnonymousClass000.A10();
        A03(A0D(), " ", A10);
        C20285AEt aEt = this.A02;
        AEE aee = aEt.A05;
        if (aee != null) {
            str = aee.A01;
        } else {
            str = null;
        }
        A03(str, " ", A10);
        return A01(aEt, aEt.A0B, " ", A10);
    }

    public String A0F(Context context) {
        int length;
        StringBuilder A10 = AnonymousClass000.A10();
        String A0D = A0D();
        if (!(A0D == null || (length = A0D.length()) == 0)) {
            A10.append("*");
            int i = length - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= i) {
                int i3 = i;
                if (!z) {
                    i3 = i2;
                }
                boolean A0u = C109005cf.A0u(A0D, i3);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    i--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i2++;
                }
            }
            A10.append(C108985cd.A0g(i, i2, A0D));
            A10.append("*\n");
        }
        C20285AEt aEt = this.A02;
        return A01(aEt, aEt.A0B, "\n", A10);
    }

    public String A0G(Context context) {
        StringBuilder A10 = AnonymousClass000.A10();
        A03(A0D(), " ", A10);
        C20285AEt aEt = this.A02;
        return A01(aEt, aEt.A0B, " ", A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0135, code lost:
        if (r7 != null) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0139, code lost:
        if (r8 == false) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0H(X.C19998A2m r12, X.AnonymousClass206 r13) {
        /*
            r11 = this;
            X.C18070vi.A0h(r12, r13)
            boolean r0 = r13 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x0133
            r0 = r13
            X.21K r0 = (X.AnonymousClass21K) r0
            if (r0 == 0) goto L_0x0133
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x0133
            X.8X8 r3 = r12.A00
            X.Bm6 r0 = r3.A00
            X.8cr r0 = (X.C166418cr) r0
            X.8cp r0 = r0.interactiveMessage_
            if (r0 != 0) goto L_0x001e
            X.8cp r0 = X.C166398cp.DEFAULT_INSTANCE
        L_0x001e:
            X.Bmt r2 = r0.A0O()
            X.8bW r0 = X.AnonymousClass8BW.A0M(r2)
            X.Bmt r5 = r0.A0O()
            X.8X3 r5 = (X.AnonymousClass8X3) r5
            X.Bm6 r0 = r2.A00
            X.8cp r0 = (X.C166398cp) r0
            X.8Xf r0 = r0.body_
            if (r0 != 0) goto L_0x0036
            X.8Xf r0 = X.C164018Xf.DEFAULT_INSTANCE
        L_0x0036:
            X.Bmt r10 = r0.A0O()
            X.Bm6 r0 = r2.A00
            X.8cp r0 = (X.C166398cp) r0
            X.8Xg r0 = r0.footer_
            if (r0 != 0) goto L_0x0044
            X.8Xg r0 = X.C164028Xg.DEFAULT_INSTANCE
        L_0x0044:
            X.Bmt r9 = r0.A0O()
            java.lang.String r4 = r11.A0D()
            r8 = 0
            if (r4 == 0) goto L_0x013d
            int r0 = r4.length()
            if (r0 == 0) goto L_0x013d
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8bW r1 = (X.C165638bW) r1
            int r0 = X.C165638bW.DOCUMENT_MESSAGE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.title_ = r4
            r1 = 0
        L_0x0066:
            X.AEt r4 = r11.A02
            X.AEE r7 = r4.A05
            if (r7 == 0) goto L_0x0134
            java.lang.String r6 = r7.A01
            if (r6 == 0) goto L_0x0134
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0134
            X.Bm6 r1 = X.C17880vN.A0G(r5)
            X.8bW r1 = (X.C165638bW) r1
            int r0 = X.C165638bW.DOCUMENT_MESSAGE_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
            r1.subtitle_ = r6
        L_0x0086:
            byte[] r0 = r7.A03
            if (r0 == 0) goto L_0x0139
            X.BmB r6 = X.C17900vP.A03(r5, r0)
            X.Bm6 r1 = r5.A00
            X.8bW r1 = (X.C165638bW) r1
            int r0 = X.C165638bW.DOCUMENT_MESSAGE_FIELD_NUMBER
            r0 = 6
            r1.mediaCase_ = r0
            r1.media_ = r6
            r5.A0G()
        L_0x009c:
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cp r1 = (X.C166398cp) r1
            X.Bm6 r0 = r5.A0C()
            X.8bW r0 = (X.C165638bW) r0
            r0.getClass()
            r1.header_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
        L_0x00b3:
            java.lang.String r5 = r4.A0B
            if (r5 == 0) goto L_0x00e4
            int r0 = r5.length()
            if (r0 == 0) goto L_0x00e4
            X.Bm6 r1 = X.C17880vN.A0G(r10)
            X.8Xf r1 = (X.C164018Xf) r1
            int r0 = X.C164018Xf.TEXT_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r5
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cp r1 = (X.C166398cp) r1
            X.Bm6 r0 = r10.A0C()
            X.8Xf r0 = (X.C164018Xf) r0
            r0.getClass()
            r1.body_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 2
            r1.bitField0_ = r0
        L_0x00e4:
            java.lang.String r4 = r4.A0C
            if (r4 == 0) goto L_0x0115
            int r0 = r4.length()
            if (r0 == 0) goto L_0x0115
            X.Bm6 r1 = X.C17880vN.A0G(r9)
            X.8Xg r1 = (X.C164028Xg) r1
            int r0 = X.C164028Xg.TEXT_FIELD_NUMBER
            int r0 = r1.bitField0_
            r0 = r0 | 1
            r1.bitField0_ = r0
            r1.text_ = r4
            X.Bm6 r1 = X.C17880vN.A0G(r2)
            X.8cp r1 = (X.C166398cp) r1
            X.Bm6 r0 = r9.A0C()
            X.8Xg r0 = (X.C164028Xg) r0
            r0.getClass()
            r1.footer_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 4
            r1.bitField0_ = r0
        L_0x0115:
            boolean r0 = X.C19998A2m.A00(r12, r13)
            if (r0 == 0) goto L_0x0130
            X.A79 r0 = r11.A01
            X.8cd r0 = X.A79.A01(r2, r0, r12, r13)
            X.Bm6 r1 = r2.A00
            X.8cp r1 = (X.C166398cp) r1
            r0.getClass()
            r1.contextInfo_ = r0
            int r0 = r1.bitField0_
            r0 = r0 | 128(0x80, float:1.794E-43)
            r1.bitField0_ = r0
        L_0x0130:
            X.AnonymousClass8X8.A06(r2, r3)
        L_0x0133:
            return
        L_0x0134:
            r8 = r1
            if (r7 == 0) goto L_0x0139
            goto L_0x0086
        L_0x0139:
            if (r8 != 0) goto L_0x00b3
            goto L_0x009c
        L_0x013d:
            r1 = 1
            goto L_0x0066
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20083A6j.A0H(X.A2m, X.206):void");
    }
}
