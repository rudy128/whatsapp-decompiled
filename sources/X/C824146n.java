package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.List;

/* renamed from: X.46n  reason: invalid class name and case insensitive filesystem */
public class C824146n extends AnonymousClass6FY {
    public AnonymousClass11S A00;
    public AnonymousClass1VW A01;
    public AnonymousClass11P A02;
    public C18000vb A03;
    public C25181Nf A04;
    public C18030ve A05;
    public C27131Uv A06;
    public AnonymousClass689 A07;
    public C73163Qi A08;
    public C73113Pg A09;
    public boolean A0A;
    public final C37451pZ A0B;

    public void A01() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0Q = C72483Me.A0Q(this);
            this.A02 = AnonymousClass10E.A6O(A0Q);
            this.A05 = AnonymousClass10E.A8r(A0Q);
            this.A00 = AnonymousClass10E.A17(A0Q);
            this.A07 = (AnonymousClass689) A0Q.A5q.get();
            this.A03 = AnonymousClass10E.A6Q(A0Q);
            this.A01 = AnonymousClass3MZ.A0e(A0Q);
            this.A06 = (C27131Uv) A0Q.A5p.get();
            this.A04 = AnonymousClass3MZ.A0m(A0Q);
        }
    }

    public void setMessage(AnonymousClass218 r13, List list) {
        String string;
        long A0I;
        String A012;
        String str = "";
        if (r13 instanceof AnonymousClass21B) {
            AnonymousClass21B r5 = (AnonymousClass21B) r13;
            C18030ve r1 = this.A05;
            String str2 = r5.A01;
            if (str2 == null) {
                str2 = str;
            }
            string = C84014Hn.A00(r1, str2, 2);
            A012 = C84014Hn.A00(this.A05, r5.A00, 2);
            String A19 = r5.A19();
            if (A19 != null) {
                Uri parse = Uri.parse(A19);
                if (parse.getHost() != null) {
                    str = parse.getHost();
                }
            }
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(A012)) {
                string = getContext().getString(2131894582);
            }
        } else {
            AnonymousClass219 r10 = (AnonymousClass219) r13;
            string = getContext().getString(2131891755);
            C27131Uv r12 = this.A06;
            if (r10.A0v.A02) {
                A0I = r12.A0J(r10);
            } else {
                A0I = r12.A0I(r10);
            }
            boolean A022 = C88254Yy.A02(this.A02, r10, A0I);
            A012 = C88254Yy.A01(getContext(), this.A00, this.A02, this.A03, this.A06, r10, A022);
        }
        this.A08.setTitleAndDescription(string, A012, list);
        if (str != null) {
            this.A08.setSubText(str, (List) null);
        }
        this.A09.setMessage(r13);
    }

    public C824146n(Context context, C37451pZ r2) {
        super(context);
        A01();
        this.A0B = r2;
        A04();
    }

    public View A02() {
        this.A08 = new C73163Qi(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int A042 = C72463Mc.A04(this);
        C27641Ww.A07(this.A08, this.A03, A042, 0, A042, 0);
        this.A08.setLayoutParams(layoutParams);
        return this.A08;
    }

    public View A03() {
        this.A09 = new C73113Pg(getContext(), this.A0B);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168528);
        this.A09.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return this.A09;
    }
}
