package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3X6  reason: invalid class name */
public class AnonymousClass3X6 extends C38391rD {
    public final Handler A00;
    public final C24771Lp A01;
    public final AnonymousClass11C A02;
    public final AnonymousClass118 A03;
    public final C139176yM A04;
    public final C127736eq A05;
    public final AnonymousClass4M3 A06;
    public final AnonymousClass10I A07;
    public final List A08;
    public final Map A09;

    public int A0Q() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r10, int i) {
        A34 a34;
        String str;
        int i2;
        GradientDrawable gradientDrawable;
        ImageView.ScaleType scaleType;
        C74073Yk r102 = (C74073Yk) r10;
        AnonymousClass3MY.A1E(r102.A0H, this, r102, 24);
        Integer num = (Integer) this.A08.get(i);
        if (r102 instanceof AnonymousClass47W) {
            AnonymousClass47W r5 = (AnonymousClass47W) r102;
            Context context = r5.A0H.getContext();
            int intValue = num.intValue();
            Drawable drawable = null;
            if (intValue == 0) {
                str = context.getString(2131898401);
                i2 = 2131232436;
                gradientDrawable = AnonymousClass3MX.A06(context, i2);
            } else if (intValue == 1) {
                str = context.getString(2131898402);
                i2 = 2131232437;
                gradientDrawable = AnonymousClass3MX.A06(context, i2);
            } else if (intValue == 2) {
                str = context.getString(2131896260);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setSize(1, 1);
                gradientDrawable2.setColor(C19740yt.A00(context, 2131102938));
                Drawable[] drawableArr = new Drawable[2];
                AnonymousClass3MY.A1V(gradientDrawable2, AnonymousClass4aX.A08(AnonymousClass3MX.A06(context, 2131233686), AnonymousClass3Ma.A00(context, 2130971825, 2131102967)), drawableArr);
                gradientDrawable = new LayerDrawable(drawableArr);
            } else if (intValue == 3) {
                str = context.getString(2131898403);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setSize(1, 1);
                gradientDrawable3.setColor(C19740yt.A00(context, 2131099948));
                drawable = AnonymousClass4aX.A03(context, 2130971957, 2131103410, 2131232193);
                gradientDrawable = gradientDrawable3;
            } else {
                throw new RuntimeException(AnonymousClass001.A1E(num, "Unknown categoryType: ", AnonymousClass000.A10()));
            }
            AnonymousClass3Qg r1 = r5.A00;
            r1.A00(gradientDrawable, drawable, str);
            if (intValue == 2) {
                scaleType = ImageView.ScaleType.CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            r1.setPreviewScaleType(scaleType);
        } else if (r102 instanceof AnonymousClass47X) {
            AnonymousClass47X r3 = (AnonymousClass47X) r102;
            Context context2 = r3.A0H.getContext();
            String string = context2.getString(2131898403);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setSize(1, 1);
            gradientDrawable4.setColor(C19740yt.A00(context2, 2131102915));
            r3.A05.A00(gradientDrawable4, AnonymousClass4aX.A03(context2, 2130971802, 2131102916, 2131232193), string);
            if (!r3.A01 && r3.A00 == null) {
                C825748x r2 = new C825748x(r3.A03, new C85254Mr(r3, string));
                r3.A00 = r2;
                r3.A06.CGD(r2, new Object[0]);
            }
        }
        if ((r102 instanceof AnonymousClass47X) && (a34 = ((AnonymousClass47X) r102).A00) != null) {
            this.A09.put(Integer.valueOf(i), a34);
        }
    }

    public int getItemViewType(int i) {
        return AnonymousClass001.A0n(this.A08, i);
    }

    public AnonymousClass3X6(Handler handler, C24771Lp r4, AnonymousClass11C r5, AnonymousClass118 r6, C139176yM r7, C127736eq r8, AnonymousClass10I r9, List list) {
        HashMap A11 = C17880vN.A11();
        this.A09 = A11;
        this.A06 = new AnonymousClass4M3(A11);
        this.A08 = list;
        this.A05 = r8;
        this.A00 = handler;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A07 = r9;
        this.A04 = r7;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 5) {
            AnonymousClass4M3 r2 = this.A06;
            List list = C42011xT.A0I;
            C18070vi.A0h(context, r2);
            View A0D = AnonymousClass3MY.A0D(LayoutInflater.from(context), 2131627536);
            C18070vi.A0X(A0D);
            return new C74073Yk(A0D, r2);
        } else if (i == 4) {
            AnonymousClass4M3 r22 = this.A06;
            List list2 = C42011xT.A0I;
            C18070vi.A0h(context, r22);
            View A0D2 = AnonymousClass3MY.A0D(LayoutInflater.from(context), 2131627535);
            C18070vi.A0b(A0D2);
            return new C74073Yk(A0D2, r22);
        } else if (i == 3) {
            Handler handler = this.A00;
            AnonymousClass11C r23 = this.A02;
            C24771Lp r1 = this.A01;
            AnonymousClass118 r5 = this.A03;
            AnonymousClass10I r10 = this.A07;
            C139176yM r6 = this.A04;
            AnonymousClass4M3 r8 = this.A06;
            List list3 = C42011xT.A0I;
            return new AnonymousClass47X(r5, r6, new C136166tN(handler, r1, r23, "image-loader-wallpaper-category"), r8, new AnonymousClass3Qg(context), r10);
        } else {
            AnonymousClass4M3 r12 = this.A06;
            List list4 = C42011xT.A0I;
            return new AnonymousClass47W(r12, new AnonymousClass3Qg(context));
        }
    }
}
