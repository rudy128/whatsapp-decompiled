package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.TextEmojiLabel;
import java.util.Arrays;
import java.util.Locale;
import java.util.TreeMap;

/* renamed from: X.3Zv  reason: invalid class name and case insensitive filesystem */
public final class C74403Zv extends AnonymousClass1b8 {
    public static final int[] A0A = {2131890861, 2131890858};
    public static final int[] A0B = {2131890853, 2131890856};
    public static final int[] A0C = {2131890850, 2131890854};
    public static final int[] A0D = {2131890851, 2131890855};
    public static final int[] A0E = {2131890852, 2131890852};
    public static final int[] A0F = {2131890860, 2131890857};
    public static final int[] A0G = {2131890863, 2131890859};
    public final AnonymousClass1LC A00;
    public final C24521Kq A01;
    public final AnonymousClass129 A02;
    public final AnonymousClass1K3 A03;
    public final E3d A04;
    public final AnonymousClass1L9 A05;
    public final AnonymousClass1KB A06;
    public final AnonymousClass11C A07;
    public final C18000vb A08;
    public final C18030ve A09;

    public int A0E() {
        return 2;
    }

    public Object A0F(ViewGroup viewGroup, int i) {
        NestedScrollView nestedScrollView;
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            View inflate = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625471, viewGroup, false);
            C18070vi.A0z(inflate, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
            nestedScrollView = (NestedScrollView) inflate;
            TextView A0E2 = AnonymousClass3Ma.A0E(nestedScrollView, 2131431209);
            AnonymousClass1HF.A0q(A0E2, true);
            A0E2.setText(2131890845);
            AnonymousClass3Ma.A0E(nestedScrollView, 2131431208).setText(2131890844);
            View A052 = C18070vi.A05(nestedScrollView, 2131431204);
            AnonymousClass3MW.A0G(A052, 2131431203).setImageResource(2131231523);
            AnonymousClass3MY.A1X(AnonymousClass3Ma.A11(A052, 2131890841), AnonymousClass3MW.A0J(A052, 2131431207));
            View A053 = C18070vi.A05(nestedScrollView, 2131431205);
            AnonymousClass3MW.A0G(A053, 2131431203).setImageResource(2131231524);
            AnonymousClass3MY.A1X(AnonymousClass3Ma.A11(A053, 2131890842), AnonymousClass3MW.A0J(A053, 2131431207));
            View A054 = C18070vi.A05(nestedScrollView, 2131431206);
            String A0H = C18070vi.A0H(this.A02.A05("security-and-privacy", A00(this, AnonymousClass4ZD.A00)));
            AnonymousClass3MW.A0G(A054, 2131431203).setImageResource(2131231525);
            A02(C72453Mb.A0c(A054, 2131431207), AnonymousClass3Ma.A10(A054.getContext(), "0", new Object[1], 0, 2131890843), A0H);
        } else if (i == 1) {
            View inflate2 = AnonymousClass3MZ.A0D(viewGroup).inflate(2131625473, viewGroup, false);
            C18070vi.A0z(inflate2, "null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
            nestedScrollView = (NestedScrollView) inflate2;
            TextView A0E3 = AnonymousClass3Ma.A0E(nestedScrollView, 2131431224);
            AnonymousClass1HF.A0q(A0E3, true);
            Context A042 = AnonymousClass3MY.A04(nestedScrollView);
            int[] iArr = A0G;
            AnonymousClass1K3 r9 = this.A03;
            A0E3.setText(C18070vi.A0F(A042, AnonymousClass4ZD.A00(r9, iArr)));
            AnonymousClass3MY.A1X(C18070vi.A0F(AnonymousClass3MY.A04(nestedScrollView), AnonymousClass4ZD.A00(r9, A0A)), AnonymousClass3MW.A0J(nestedScrollView, 2131431221));
            TextEmojiLabel A0c = C72453Mb.A0c(nestedScrollView, 2131431219);
            String string = AnonymousClass3MY.A04(nestedScrollView).getString(AnonymousClass4ZD.A00(r9, A0B), Arrays.copyOf(new Object[]{"0"}, 1));
            C18070vi.A0X(string);
            String[] strArr = AnonymousClass4ZD.A00;
            AnonymousClass129 r6 = this.A02;
            A02(A0c, string, C18070vi.A0H(r6.A05("security-and-privacy", A00(this, strArr))));
            A01(C18070vi.A05(nestedScrollView, 2131431214), C18070vi.A0F(AnonymousClass3MY.A04(nestedScrollView), AnonymousClass4ZD.A00(r9, A0C)), new String[0], 2131231526);
            A01(C18070vi.A05(nestedScrollView, 2131431215), C18070vi.A0F(AnonymousClass3MY.A04(nestedScrollView), AnonymousClass4ZD.A00(r9, A0D)), new String[0], 2131231527);
            if (AnonymousClass4ZD.A01(r9)) {
                C72463Mc.A13(nestedScrollView, 2131431216);
            } else {
                AnonymousClass3MY.A1A(nestedScrollView, 2131431216, 0);
                View A055 = C18070vi.A05(nestedScrollView, 2131431216);
                String string2 = AnonymousClass3MY.A04(nestedScrollView).getString(AnonymousClass4ZD.A00(r9, A0E), Arrays.copyOf(new Object[]{"0"}, 1));
                C18070vi.A0X(string2);
                A01(A055, string2, new String[]{C18070vi.A0H(r6.A05("security-and-privacy", A00(this, AnonymousClass4ZD.A02)))}, 2131231528);
            }
            TextEmojiLabel A0c2 = C72453Mb.A0c(nestedScrollView, 2131431220);
            String string3 = AnonymousClass3MY.A04(nestedScrollView).getString(AnonymousClass4ZD.A00(r9, A0F), Arrays.copyOf(new Object[]{"0", "1", "2"}, 3));
            C18070vi.A0X(string3);
            String[] strArr2 = AnonymousClass4ZD.A03;
            AnonymousClass1LC r4 = this.A00;
            A02(A0c2, string3, C18070vi.A0H(r4.A00(A00(this, strArr2))), C18070vi.A0H(r4.A00(A00(this, AnonymousClass4ZD.A01))), C18070vi.A0H(r6.A05("security-and-privacy", A00(this, AnonymousClass4ZD.A04))));
        } else {
            throw AnonymousClass001.A13("Unknown page: ", AnonymousClass000.A10(), i);
        }
        Context context = nestedScrollView.getContext();
        if (context != null) {
            String A0F2 = C18070vi.A0F(context, 2131899073);
            String A0F3 = C18070vi.A0F(context, 2131899072);
            if (i != 0) {
                View findViewById = nestedScrollView.findViewById(2131435597);
                if (findViewById != null) {
                    findViewById.setContentDescription(A0F2);
                }
                i2 = 2131430473;
            } else {
                View findViewById2 = nestedScrollView.findViewById(2131435596);
                if (findViewById2 != null) {
                    findViewById2.setContentDescription(A0F2);
                }
                i2 = 2131430472;
            }
            View findViewById3 = nestedScrollView.findViewById(i2);
            if (findViewById3 != null) {
                findViewById3.setContentDescription(A0F3);
            }
        }
        nestedScrollView.A0B = this.A04;
        AnonymousClass3MY.A19(nestedScrollView, i);
        viewGroup.addView(nestedScrollView);
        return nestedScrollView;
    }

    public static String A00(C74403Zv r4, String[] strArr) {
        AnonymousClass1K3 r42 = r4.A03;
        C18070vi.A0d(strArr, 2);
        if (AnonymousClass4ZD.A01(r42)) {
            return strArr[2];
        }
        C24521Kq r0 = C24521Kq.$redex_init_class;
        if (r42.A05("BR")) {
            return strArr[1];
        }
        return strArr[0];
    }

    private final void A02(TextEmojiLabel textEmojiLabel, String str, String... strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < length; i++) {
            String valueOf = String.valueOf(i);
            objArr[i] = valueOf;
            treeMap.put(valueOf, Uri.parse(strArr[i]));
        }
        Context context = textEmojiLabel.getContext();
        C18030ve r10 = this.A09;
        AnonymousClass1KB r7 = this.A06;
        AnonymousClass1L9 r6 = this.A05;
        AnonymousClass11C r9 = this.A07;
        Locale A0N = this.A08.A0N();
        Object[] copyOf = Arrays.copyOf(objArr, length);
        String format = String.format(A0N, str, Arrays.copyOf(copyOf, copyOf.length));
        C18070vi.A0X(format);
        C26302CxJ.A0M(context, r6, r7, textEmojiLabel, r9, r10, format, treeMap);
    }

    public C74403Zv(E3d e3d, AnonymousClass1L9 r2, AnonymousClass1KB r3, AnonymousClass1LC r4, AnonymousClass11C r5, C24521Kq r6, C18000vb r7, C18030ve r8, AnonymousClass129 r9, AnonymousClass1K3 r10) {
        C72473Md.A1K(r6, e3d);
        this.A09 = r8;
        this.A06 = r3;
        this.A03 = r10;
        this.A05 = r2;
        this.A00 = r4;
        this.A02 = r9;
        this.A07 = r5;
        this.A08 = r7;
        this.A01 = r6;
        this.A04 = e3d;
    }

    private final void A01(View view, String str, String[] strArr, int i) {
        AnonymousClass3MW.A0G(view, 2131431217).setImageResource(i);
        A02(C72453Mb.A0c(view, 2131431218), str, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void A0G(ViewGroup viewGroup, Object obj, int i) {
        C18070vi.A0i(viewGroup, obj);
        viewGroup.removeView((View) obj);
    }

    public boolean A0H(View view, Object obj) {
        C18070vi.A0h(view, obj);
        return AnonymousClass000.A1Z(view, obj);
    }
}
