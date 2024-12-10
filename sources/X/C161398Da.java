package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.8Da  reason: invalid class name and case insensitive filesystem */
public class C161398Da extends LinearLayout implements AnonymousClass009 {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public AnonymousClass11C A05;
    public C18030ve A06;
    public C36401np A07;
    public AnonymousClass031 A08;
    public boolean A09;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A08;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public C161398Da(Context context, C18000vb r12, AnonymousClass1KN r13, C198769ys r14, int i, boolean z) {
        super(context);
        WaImageView waImageView;
        String str;
        String str2;
        if (!this.A09) {
            this.A09 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A06 = AnonymousClass10E.A8r(A0O);
            this.A07 = AnonymousClass3MY.A0e(A0O.A00);
            this.A05 = AnonymousClass3Ma.A0a(A0O);
        }
        View.inflate(getContext(), 2131625593, this);
        this.A01 = AnonymousClass1HF.A06(this, 2131431593);
        this.A00 = AnonymousClass1HF.A06(this, 2131431595);
        this.A04 = AnonymousClass3MW.A0R(this, 2131431592);
        this.A03 = AnonymousClass3MX.A0V(this, 2131431594);
        this.A02 = AnonymousClass3MX.A0K(this, 2131431591);
        int i2 = 0;
        this.A01.setVisibility(0);
        if (z) {
            this.A00.setVisibility(0);
        }
        C22565BDa bDa = r14.A09.A00;
        AnonymousClass1KN r4 = ((ARR) bDa).A02;
        String str3 = r14.A0C;
        String string = context.getString(2131891309);
        if (i != 0) {
            if (i != 1) {
                if (!(i == 2 || i == 3)) {
                    if (i != 4) {
                        if (!(i == 5 || i == 7)) {
                            return;
                        }
                    } else if (r14.A01 != 0) {
                        return;
                    }
                }
                Runnable[] runnableArr = new Runnable[1];
                C21423Ajq.A00(runnableArr, 11, 0);
                SpannableString A042 = this.A07.A04(this.A03.getContext(), string, runnableArr, new String[]{"fine-print"}, new String[]{str3});
                AnonymousClass3Ma.A1K(this.A03, this.A05);
                AnonymousClass3Ma.A1L(this.A06, this.A03);
                this.A03.setText(A042);
                this.A02.getBackground().setLevel(1);
            } else if (r14.A00 == 0) {
                this.A03.setText(2131891311);
                this.A02.getBackground().setLevel(1);
            } else {
                return;
            }
            waImageView = this.A04;
            i2 = 8;
        } else if (r13.A00.compareTo(r4.A00) >= 0) {
            String str4 = r14.A0E;
            C22565BDa bDa2 = r14.A07;
            if (bDa2 != null) {
                ARR arr = (ARR) bDa2;
                str2 = C72473Md.A0j(context, A3U.A00(context, r12, arr.A01, arr.A02).toString(), 2131891304);
            } else {
                str2 = null;
            }
            Runnable[] runnableArr2 = new Runnable[1];
            C21423Ajq.A00(runnableArr2, 10, 0);
            SpannableString A043 = this.A07.A04(this.A03.getContext(), str2, runnableArr2, new String[]{"cashback-terms"}, new String[]{str4});
            AnonymousClass3Ma.A1K(this.A03, this.A05);
            AnonymousClass3Ma.A1L(this.A06, this.A03);
            this.A03.setText(A043);
            this.A02.getBackground().setLevel(0);
            waImageView = this.A04;
        } else {
            C22565BDa bDa3 = r14.A07;
            if (bDa3 == null || bDa == null) {
                str = null;
            } else {
                AnonymousClass1KN r0 = ((ARR) bDa).A02;
                ARR arr2 = (ARR) bDa3;
                AnonymousClass1KJ r1 = arr2.A01;
                String obj = A3U.A00(context, r12, r1, r0).toString();
                String obj2 = A3U.A00(context, r12, r1, arr2.A02).toString();
                Object[] A1b = AnonymousClass3MW.A1b();
                AnonymousClass001.A1Q(obj2, obj, A1b);
                str = context.getString(2131891310, A1b);
            }
            this.A03.setText(str);
            this.A02.getBackground().setLevel(0);
            this.A04.setVisibility(0);
            return;
        }
        waImageView.setVisibility(i2);
    }
}
