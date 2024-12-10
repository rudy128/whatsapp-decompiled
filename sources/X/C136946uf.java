package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.list.footer.WDSSectionFooter;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;
import com.whatsapp.wds.components.toggle.WDSSwitch;

/* renamed from: X.6uf  reason: invalid class name and case insensitive filesystem */
public final class C136946uf {
    public View A00;
    public View A01;
    public View A02;
    public WDSSwitch A03;
    public final Context A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final ImageView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final C18000vb A0D;
    public final View A0E;

    public C136946uf(Context context, View view, ViewStub viewStub, AnonymousClass11C r18, C18000vb r19, C18030ve r20, C58312kU r21, Integer num) {
        C58312kU r2 = r21;
        View view2 = view;
        C18070vi.A0g(view2, 1, r2);
        this.A04 = context;
        this.A0D = r19;
        View A062 = AnonymousClass1HF.A06(view2, 2131434548);
        C18030ve r7 = r20;
        if (A062 instanceof ViewStub) {
            A062 = AnonymousClass3MY.A0G((ViewStub) A062, AnonymousClass1J8.A05(r7) ? 2131627594 : 2131626735);
        }
        C18070vi.A0a(A062);
        this.A05 = A062;
        View A063 = AnonymousClass1HF.A06(view2, 2131434567);
        if (A063 instanceof ViewStub) {
            A063 = AnonymousClass3MY.A0G((ViewStub) A063, AnonymousClass1J8.A05(r7) ? 2131627597 : 2131626736);
            if (A063 instanceof WDSSectionHeader) {
                ((WDSSectionHeader) A063).setHeaderText(2131890655);
            }
        }
        C18070vi.A0a(A063);
        this.A0E = A063;
        this.A0C = AnonymousClass3Ma.A0E(view2, 2131434528);
        this.A0B = AnonymousClass3Ma.A0E(view2, 2131434527);
        View A064 = AnonymousClass1HF.A06(view2, 2131434547);
        if (A064 instanceof ViewStub) {
            A064 = AnonymousClass3MY.A0G((ViewStub) A064, AnonymousClass1J8.A05(r7) ? 2131627594 : 2131626734);
        }
        C18070vi.A0a(A064);
        this.A09 = A064;
        this.A0A = AnonymousClass3Ma.A0C(view2, 2131434526);
        this.A06 = C18070vi.A05(view2, 2131434525);
        this.A07 = C18070vi.A05(view2, 2131434537);
        this.A08 = C18070vi.A05(view2, 2131434538);
        if (viewStub != null) {
            View inflate = viewStub.inflate();
            this.A00 = AnonymousClass1HF.A06(inflate, 2131427935);
            this.A03 = (WDSSwitch) AnonymousClass1HF.A06(inflate, 2131427938);
            this.A01 = AnonymousClass1HF.A06(inflate, 2131427934);
            View A065 = AnonymousClass1HF.A06(inflate, 2131427936);
            if (A065 instanceof ViewStub) {
                A065 = AnonymousClass3MY.A0G((ViewStub) A065, AnonymousClass1J8.A05(r7) ? 2131627594 : 2131624243);
            }
            this.A02 = A065;
            if (A065 != null) {
                Integer num2 = num;
                AnonymousClass11C r4 = r18;
                if (A065 instanceof TextEmojiLabel) {
                    TextEmojiLabel textEmojiLabel = (TextEmojiLabel) A065;
                    AnonymousClass3Ma.A1L(r7, textEmojiLabel);
                    AnonymousClass3Ma.A1K(textEmojiLabel, r4);
                    Activity A052 = AnonymousClass3Ma.A05(A065);
                    C18070vi.A0z(A052, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                    r2.A00((AnonymousClass1FL) A052, textEmojiLabel, num2, 2131886816);
                } else if (A065 instanceof WDSSectionFooter) {
                    WDSSectionFooter wDSSectionFooter = (WDSSectionFooter) A065;
                    wDSSectionFooter.setFooterTextWithLink(AnonymousClass3MY.A0m(A065.getResources(), 2131886816), "learn-more", AnonymousClass4DZ.A02, new C39441t5(r7), new AnonymousClass3C5(r2, num2, A065, 37));
                    WaTextView waTextView = wDSSectionFooter.A01.A01;
                    if (waTextView != null) {
                        AnonymousClass3MZ.A1Q(waTextView, r4);
                    }
                }
            }
        }
    }

    public final void A01(Runnable runnable, int i) {
        View view = this.A06;
        view.setClickable(true);
        view.setOnClickListener(new AFS(runnable, 45));
        ImageView imageView = this.A0A;
        C18000vb r2 = this.A0D;
        Context context = this.A04;
        AnonymousClass3NL.A01(context, imageView, r2, 2131231849);
        AnonymousClass4aX.A0D(imageView, C72483Me.A03(context));
        this.A0C.setText(i);
        this.A09.setVisibility(0);
        this.A0B.setVisibility(8);
        this.A07.setVisibility(8);
        this.A08.setVisibility(8);
        this.A05.setVisibility(8);
    }

    public final void A02(Runnable runnable, int i, long j, long j2, long j3, boolean z, boolean z2) {
        Context context;
        TextView textView;
        int A002;
        C18000vb r7;
        String A092;
        if (!z || z2) {
            View view = this.A06;
            view.setEnabled(true);
            AnonymousClass48o.A00(view, runnable, 18);
            ImageView imageView = this.A0A;
            imageView.setImageResource(2131231865);
            context = this.A04;
            AnonymousClass4aX.A0D(imageView, C72483Me.A03(context));
            this.A0C.setText(i);
            textView = this.A0B;
            A002 = AnonymousClass1YL.A00(context, 2130971197, 2131102532);
        } else {
            View view2 = this.A06;
            view2.setEnabled(false);
            view2.setOnClickListener((View.OnClickListener) null);
            ImageView imageView2 = this.A0A;
            imageView2.setImageResource(2131232262);
            context = this.A04;
            AnonymousClass4aX.A0D(imageView2, AnonymousClass3Ma.A00(context, 2130969993, 2131101078));
            TextView textView2 = this.A0C;
            textView2.setText(2131890644);
            C72463Mc.A0y(context, textView2, 2130969993, 2131101078);
            textView = this.A0B;
            A002 = AnonymousClass1YL.A00(context, 2130969993, 2131101078);
        }
        AnonymousClass3MX.A1C(context, textView, A002);
        textView.setVisibility(0);
        if (j > 0) {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass11Y r0 = AnonymousClass11X.A00;
            r7 = this.A0D;
            A1b[0] = r0.A09(r7, j2);
            A092 = C17880vN.A0q(context, C88584aA.A02(r7, j), A1b, 1, 2131890650);
        } else {
            AnonymousClass11Y r02 = AnonymousClass11X.A00;
            r7 = this.A0D;
            A092 = r02.A09(r7, j2);
        }
        textView.setText(A092);
        View view3 = this.A07;
        if (z2) {
            view3.setVisibility(0);
            this.A08.setVisibility(0);
        } else {
            view3.setVisibility(8);
            this.A08.setVisibility(8);
        }
        this.A05.setVisibility(0);
        A04(AnonymousClass3Ma.A10(context, AnonymousClass6XO.A00(r7, 1, j3), new Object[1], 0, 2131890648));
        this.A09.setVisibility(8);
    }

    public final void A03(Runnable runnable, long j, long j2, long j3) {
        C18000vb r5;
        String A092;
        View view = this.A06;
        view.setEnabled(true);
        AnonymousClass48o.A00(view, runnable, 19);
        ImageView imageView = this.A0A;
        imageView.setImageResource(2131232296);
        Context context = this.A04;
        AnonymousClass4aX.A0D(imageView, C72483Me.A03(context));
        TextView textView = this.A0C;
        textView.setText(2131890654);
        C72463Mc.A0y(context, textView, 2130971198, 2131102533);
        TextView textView2 = this.A0B;
        textView2.setVisibility(0);
        C72463Mc.A0y(context, textView2, 2130971197, 2131102532);
        if (j > 0) {
            Object[] A1b = AnonymousClass3MW.A1b();
            AnonymousClass11Y r0 = AnonymousClass11X.A00;
            r5 = this.A0D;
            A1b[0] = r0.A09(r5, j2);
            A092 = C17880vN.A0q(context, C88584aA.A02(r5, j), A1b, 1, 2131890650);
        } else {
            AnonymousClass11Y r02 = AnonymousClass11X.A00;
            r5 = this.A0D;
            A092 = r02.A09(r5, j2);
        }
        textView2.setText(A092);
        this.A07.setVisibility(0);
        this.A05.setVisibility(0);
        A04(AnonymousClass3Ma.A10(context, AnonymousClass6XO.A00(r5, 1, j3), new Object[1], 0, 2131890648));
        this.A08.setVisibility(0);
        this.A09.setVisibility(8);
    }

    public final void A05(String str, String str2) {
        this.A06.setClickable(false);
        ImageView imageView = this.A0A;
        imageView.setImageResource(2131232262);
        Context context = this.A04;
        AnonymousClass4aX.A0D(imageView, AnonymousClass3Ma.A00(context, 2130969993, 2131101078));
        this.A0C.setText(2131890653);
        TextView textView = this.A0B;
        textView.setVisibility(0);
        textView.setText(str);
        C72463Mc.A0y(context, textView, 2130971197, 2131102532);
        this.A07.setVisibility(8);
        this.A05.setVisibility(0);
        A04(str2);
        this.A09.setVisibility(8);
        this.A08.setVisibility(8);
    }

    public final void A00(int i, int i2, int i3) {
        View view = this.A0E;
        if (view instanceof TextView) {
            ((TextView) view).setText(i);
        } else if (view instanceof WDSSectionHeader) {
            ((WDSSectionHeader) view).setHeaderText(i);
        }
        this.A0C.setText(i2);
        View view2 = this.A09;
        view2.setVisibility(0);
        if (view2 instanceof WDSSectionFooter) {
            ((WDSSectionFooter) view2).setFooterText(this.A04.getString(i3));
        } else if (view2 instanceof TextEmojiLabel) {
            ((TextView) view2).setText(i3);
        }
    }

    public final void A04(String str) {
        View view = this.A05;
        if (view instanceof TextView) {
            ((TextView) view).setText(str);
        } else if (view instanceof WDSSectionFooter) {
            ((WDSSectionFooter) view).setFooterText(str);
        }
    }
}
