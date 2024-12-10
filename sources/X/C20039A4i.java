package X;

import android.content.res.Resources;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.A4i  reason: case insensitive filesystem */
public final class C20039A4i {
    public AnonymousClass1FU A00;
    public final AnonymousClass11C A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass1CJ A03;
    public final C18030ve A04;
    public final Runnable A05;
    public final String A06;
    public final AnonymousClass2X1 A07;
    public final C34511kb A08;
    public final AnonymousClass11E A09;
    public final AnonymousClass1MZ A0A;
    public final AnonymousClass1EC A0B;
    public final AnonymousClass1EC A0C;

    public static final void A00(C20039A4i a4i, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        AnonymousClass1FU r4 = a4i.A00;
        if (r4 != null) {
            r4.CEx();
            if (!(i == -3 || i == -2)) {
                int i7 = 2131897319;
                if (i != 400) {
                    if (i != 401) {
                        i7 = 2131897320;
                        if (i != 404) {
                            if (!(i == 406 || i == 500)) {
                                if (i != 530) {
                                    i2 = 2131897322;
                                    i3 = 2131897321;
                                    i4 = 2131890910;
                                    i5 = 2131898766;
                                    i6 = 2;
                                    r4.A3v(new C20446ALj(a4i, i6), i2, i3, i4, i5);
                                }
                                String str = a4i.A06;
                                if (str == null || str.length() == 0) {
                                    i7 = 2131888544;
                                } else {
                                    Object[] A1a = AnonymousClass3MW.A1a();
                                    A1a[0] = str;
                                    r4.BhU(A1a, 0, 2131888543);
                                }
                            }
                        }
                    } else {
                        r4.BhU(new Object[0], 2131888509, 2131888510);
                    }
                    a4i.A05.run();
                    return;
                }
                r4.BhQ(i7);
                a4i.A05.run();
                return;
            }
            i2 = 2131897322;
            i3 = 2131897321;
            i4 = 2131890910;
            i5 = 2131898766;
            i6 = 1;
            r4.A3v(new C20446ALj(a4i, i6), i2, i3, i4, i5);
        }
    }

    public static final void A01(C20039A4i a4i, boolean z) {
        AnonymousClass1EC r3;
        C29621ca A0k;
        C20039A4i a4i2 = a4i;
        if (a4i2.A00 != null && (r3 = a4i2.A0B) != null) {
            AnonymousClass1EC r2 = a4i2.A0C;
            if (r2 == null) {
                A00(a4i2, 400);
                return;
            }
            boolean A092 = a4i2.A09.A09();
            AnonymousClass1FU r1 = a4i2.A00;
            if (A092) {
                if (r1 != null) {
                    r1.CNA(2131888572);
                }
                C185949dP r4 = new C185949dP(new AnonymousClass9XZ(a4i2), r2, AnonymousClass8BU.A0K(a4i2.A07.A00.A01));
                List A0M = C18070vi.A0M(r3);
                AnonymousClass1OZ r12 = r4.A02;
                String A0B2 = r12.A0B();
                int size = A0M.size();
                C29621ca[] r32 = new C29621ca[size];
                for (int i = 0; i < size; i++) {
                    if (z) {
                        AnonymousClass1MD[] r5 = new AnonymousClass1MD[2];
                        C17880vN.A1I((Jid) A0M.get(i), "jid", r5, 0);
                        C17880vN.A1Q("remove_orphaned_members", "true", r5, 1);
                        A0k = AnonymousClass8BR.A0k("group", r5);
                    } else {
                        AnonymousClass1MD[] r13 = new AnonymousClass1MD[1];
                        C17880vN.A1I((Jid) A0M.get(i), "jid", r13, 0);
                        A0k = AnonymousClass8BR.A0k("group", r13);
                    }
                    r32[i] = A0k;
                }
                AnonymousClass1MD[] r22 = new AnonymousClass1MD[1];
                C17880vN.A1Q("unlink_type", "sub_group", r22, 0);
                C29621ca A0l = AnonymousClass8BR.A0l("unlink", r22, r32);
                AnonymousClass1MD[] r23 = new AnonymousClass1MD[4];
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2, r23, 0);
                C17880vN.A1Q("xmlns", "w:g2", r23, 1);
                C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r23, 2);
                r12.A0I(new C20960AcE(r4.A00), C29621ca.A00(r4.A01, A0l, r23), A0B2, 308, 32000);
            } else if (r1 != null) {
                int i2 = 2131892439;
                if (AnonymousClass11E.A02(r1)) {
                    i2 = 2131892440;
                }
                r1.A05.A06(i2, 1);
            }
        }
    }

    public final void A02() {
        AnonymousClass1EC r1;
        AnonymousClass1FU r11;
        int i;
        String[] A1b;
        char c;
        C73203Rj A002;
        AnonymousClass1D6 A012;
        AnonymousClass1EC r8 = this.A0B;
        if (r8 != null && (r1 = this.A0C) != null && (r11 = this.A00) != null) {
            AnonymousClass1MZ r3 = this.A0A;
            if (r3.A0K(r1)) {
                String str = this.A06;
                if (this.A03.A06(r8) == 6) {
                    if (C18020vd.A05(C18040vf.A02, this.A04, 5021)) {
                        if (str == null || str.length() == 0) {
                            String A0F = C18070vi.A0F(r11, 2131888517);
                            Spanned fromHtml = Html.fromHtml(r11.getString(2131888514));
                            C18070vi.A0X(fromHtml);
                            A012 = AnonymousClass1D6.A01(A0F, fromHtml);
                        } else {
                            String A10 = AnonymousClass3Ma.A10(r11, str, new Object[1], 0, 2131888516);
                            Spanned A013 = AnonymousClass1EG.A01(r11, new Object[]{str}, 2131888513);
                            C18070vi.A0X(A013);
                            A012 = AnonymousClass1D6.A01(A10, A013);
                        }
                        A002 = AnonymousClass4a6.A00(r11);
                        A002.A0k((String) A012.first);
                        A002.A0S((CharSequence) A012.second);
                        A002.A0g(r11, new C20336AGs(this, 7), 2131888515);
                        A002.A0e(r11, (C22851Dl) null, 2131898766);
                        A002.A0C();
                        return;
                    }
                }
                View inflate = LayoutInflater.from(r11).inflate(2131626714, (ViewGroup) null);
                boolean z = true;
                if (r3.A08(r8).size() <= 1 && r3.A0J(r8)) {
                    z = false;
                }
                TextView A0J = AnonymousClass3MW.A0J(inflate, 2131436044);
                Resources A0D = C108955ca.A0D(r11);
                if (str == null || str.length() == 0) {
                    c = 2;
                    if (z) {
                        c = 0;
                    }
                } else {
                    c = 3;
                    if (z) {
                        c = 1;
                    }
                }
                String A0x = AnonymousClass3MW.A0x(A0D, str, new Object[1], 0, AnonymousClass9TQ.A00[c]);
                C18070vi.A0X(A0x);
                A0J.setText(A0x);
                View A062 = AnonymousClass1HF.A06(inflate, 2131434488);
                TextView textView = (TextView) A062;
                if (z) {
                    textView.setText(2131888571);
                } else {
                    textView.setVisibility(8);
                }
                C18070vi.A0X(A062);
                A002 = AnonymousClass4a6.A00(r11);
                A002.A0c(inflate);
                A002.A0E(2131888562);
                A002.A0g(r11, new C20330AGm(textView, this, 1), 2131888570);
                A002.A0e(r11, (C22851Dl) null, 2131898766);
                A002.A0C();
                return;
            }
            String str2 = this.A06;
            if (str2 == null) {
                Log.e("RemovalOfGroupFromCommunity/showDialogIfSubgroup group name is null");
                return;
            }
            String A0F2 = this.A03.A0F(r1);
            if (A0F2 == null) {
                i = 2131888565;
                A1b = new String[]{str2};
            } else {
                i = 2131888567;
                A1b = C17880vN.A1b(str2, A0F2, 2, 1);
            }
            r11.A3j(r11, 2131888568, i, 2131895092, 2131898766, (Integer) null, (String) null, new C22015AwH(r11, this), (C18090vk) null, A1b);
        }
    }

    public C20039A4i(AnonymousClass2X1 r4, AnonymousClass1FU r5, C34511kb r6, AnonymousClass11E r7, AnonymousClass11C r8, AnonymousClass118 r9, AnonymousClass1CJ r10, AnonymousClass1MZ r11, AnonymousClass1E7 r12, C18030ve r13, Runnable runnable, String str) {
        AnonymousClass1EC r0;
        C18070vi.A0w(r13, r9, r10, r8, r6);
        C18070vi.A0q(r11, r7, r4);
        C18070vi.A0d(r12, 11);
        this.A04 = r13;
        this.A02 = r9;
        this.A03 = r10;
        this.A01 = r8;
        this.A08 = r6;
        this.A0A = r11;
        this.A09 = r7;
        this.A07 = r4;
        this.A05 = runnable;
        this.A06 = str;
        AnonymousClass1EC r02 = (AnonymousClass1EC) r12.A06(AnonymousClass1EC.class);
        this.A0B = r02;
        if (r02 != null) {
            r0 = r6.A05(r02);
        } else {
            r0 = null;
        }
        this.A0C = r0;
        C17960vV.A02();
        if (((C23391Fw) r5.getLifecycle()).A02 != C23401Fx.DESTROYED) {
            this.A00 = r5;
            r5.getLifecycle().A05(new C20325AGh(this, 0));
            return;
        }
        this.A00 = null;
    }
}
