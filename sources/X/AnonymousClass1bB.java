package X;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.HomeActivity;

/* renamed from: X.1bB  reason: invalid class name */
public class AnonymousClass1bB extends C28861b9 implements AnonymousClass1bA {
    public final int A00;
    public final HomeActivity A01;
    public final C28871bC[] A02;

    public AnonymousClass1bB(AnonymousClass1GP r2, HomeActivity homeActivity) {
        super(r2, 0);
        int size = HomeActivity.A2Y.size();
        this.A00 = size;
        this.A02 = new C28871bC[size];
        this.A01 = homeActivity;
    }

    public C28871bC A0J(int i) {
        ImageView imageView;
        ColorStateList valueOf;
        C28871bC[] r4 = this.A02;
        int i2 = i;
        if (r4[i] == null) {
            HomeActivity homeActivity = this.A01;
            View inflate = homeActivity.getLayoutInflater().inflate(2131625556, (ViewGroup) null, false);
            C28871bC r13 = new C28871bC(inflate, (ViewGroup) AnonymousClass1HF.A06(inflate, 2131435999), (ImageView) AnonymousClass1HF.A06(inflate, 2131431496), (TextView) AnonymousClass1HF.A06(inflate, 2131435996), (TextView) AnonymousClass1HF.A06(inflate, 2131428036));
            TextView textView = r13.A06;
            textView.setText(A0C(i2));
            textView.setContentDescription(A0C(i2));
            if (i2 != HomeActivity.A0c(400)) {
                C28081Yu.A00(C19740yt.A03(homeActivity, 2131102476), r13.A04);
            }
            if (i2 == HomeActivity.A0c(300)) {
                ImageView imageView2 = r13.A04;
                imageView2.setImageDrawable(C24261Jm.A00(homeActivity, 2131232731).mutate());
                C27641Ww.A05(imageView2, homeActivity.A00, homeActivity.getResources().getDimensionPixelSize(2131168997), 0);
            } else if (i2 == HomeActivity.A0c(400)) {
                C18000vb r8 = homeActivity.A00;
                ImageView imageView3 = r13.A04;
                C27641Ww.A05(imageView3, r8, homeActivity.getResources().getDimensionPixelSize(2131168993), 0);
                if (Build.VERSION.SDK_INT > 21) {
                    C454028v A03 = C454028v.A03(homeActivity, 2131231763);
                    homeActivity.A0H = A03;
                    imageView3.setImageDrawable(A03);
                } else {
                    imageView3.setImageResource(2131233230);
                }
            } else if (i2 == HomeActivity.A0c(600)) {
                int i3 = 2131233254;
                if (C22891Dp.A02) {
                    i3 = 2131233256;
                }
                C24291Jp A002 = C24291Jp.A00((Resources.Theme) null, homeActivity.getResources(), i3);
                C18000vb r0 = homeActivity.A00;
                ImageView imageView4 = r13.A04;
                C27641Ww.A05(imageView4, r0, 0, 0);
                C42491yG.A09(r13.A03, homeActivity.getResources().getDimensionPixelSize(2131168998), 0);
                textView.setVisibility(8);
                imageView4.setVisibility(0);
                imageView4.setImageDrawable(A002);
                imageView4.setContentDescription(homeActivity.getString(2131888508));
                if (C22891Dp.A02) {
                    C28931bI r1 = new C28931bI(AnonymousClass1HF.A06(r13.A02, 2131431499));
                    if (r1.A01() != 0) {
                        r1.A04(0);
                        ImageView imageView5 = (ImageView) r1.A02();
                        r13.A01 = imageView5;
                        if (imageView5 != null) {
                            imageView5.setVisibility(8);
                        }
                    }
                    int dimensionPixelSize = homeActivity.getResources().getDimensionPixelSize(2131169540);
                    imageView4.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
                }
            }
            if (C22891Dp.A02) {
                int A003 = C19740yt.A00(homeActivity, AnonymousClass1YL.A00(homeActivity, 2130970058, 2131101196));
                int A004 = C19740yt.A00(homeActivity, AnonymousClass1YL.A00(homeActivity, 2130971952, 2131103094));
                textView.setTextColor(A003);
                if (i2 == HomeActivity.A0c(300)) {
                    imageView = r13.A04;
                    valueOf = ColorStateList.valueOf(A004);
                } else {
                    if (i2 != HomeActivity.A0c(400)) {
                        imageView = r13.A04;
                        valueOf = ColorStateList.valueOf(A003);
                    }
                    r13.A05.setTextColor(C19740yt.A00(homeActivity, AnonymousClass1YL.A00(homeActivity, 2130971983, 2131103163)));
                }
                C28081Yu.A00(valueOf, imageView);
                r13.A05.setTextColor(C19740yt.A00(homeActivity, AnonymousClass1YL.A00(homeActivity, 2130971983, 2131103163)));
            }
            r4[i] = r13;
        }
        return r4[i];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r0 == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, ((X.AnonymousClass1c4) r3.A1g.get()).A02, 10996) != false) goto L_0x007d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0K(int r5) {
        /*
            r4 = this;
            r0 = 200(0xc8, float:2.8E-43)
            if (r5 == r0) goto L_0x0081
            r0 = 300(0x12c, float:4.2E-43)
            if (r5 == r0) goto L_0x0056
            r0 = 400(0x190, float:5.6E-43)
            if (r5 == r0) goto L_0x0047
            r0 = 600(0x258, float:8.41E-43)
            if (r5 == r0) goto L_0x0041
            r0 = 700(0x2bc, float:9.81E-43)
            if (r5 == r0) goto L_0x0022
            r0 = 800(0x320, float:1.121E-42)
            if (r5 != r0) goto L_0x0087
            com.whatsapp.HomeActivity r3 = r4.A01
            r2 = 2131897721(0x7f122d79, float:1.943034E38)
        L_0x001d:
            java.lang.String r0 = r3.getString(r2)
            return r0
        L_0x0022:
            com.whatsapp.HomeActivity r3 = r4.A01
            X.0ve r1 = r3.A0E
            r0 = 12122(0x2f5a, float:1.6987E-41)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x003d
            X.0ve r1 = r3.A0E
            r0 = 12125(0x2f5d, float:1.6991E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            r2 = 2131887153(0x7f120431, float:1.9408905E38)
            if (r0 != 0) goto L_0x001d
        L_0x003d:
            r2 = 2131887152(0x7f120430, float:1.9408903E38)
            goto L_0x001d
        L_0x0041:
            com.whatsapp.HomeActivity r3 = r4.A01
            r2 = 2131888485(0x7f120965, float:1.9411607E38)
            goto L_0x001d
        L_0x0047:
            com.whatsapp.HomeActivity r3 = r4.A01
            java.lang.Integer r1 = r3.A0C
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2 = 2131887860(0x7f1206f4, float:1.941034E38)
            if (r1 != r0) goto L_0x001d
            r2 = 2131887861(0x7f1206f5, float:1.9410341E38)
            goto L_0x001d
        L_0x0056:
            com.whatsapp.HomeActivity r3 = r4.A01
            X.00H r0 = r3.A1g
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x007d
            X.00H r0 = r3.A1g
            java.lang.Object r0 = r0.get()
            X.1c4 r0 = (X.AnonymousClass1c4) r0
            X.0ve r2 = r0.A02
            r1 = 10996(0x2af4, float:1.5409E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r2 = 2131897381(0x7f122c25, float:1.942965E38)
            if (r0 == 0) goto L_0x001d
        L_0x007d:
            r2 = 2131896397(0x7f12284d, float:1.9427654E38)
            goto L_0x001d
        L_0x0081:
            com.whatsapp.HomeActivity r3 = r4.A01
            r2 = 2131888256(0x7f120880, float:1.9411142E38)
            goto L_0x001d
        L_0x0087:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "The item position should be less or equal to:"
            r1.append(r0)
            int r0 = r4.A00
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1bB.A0K(int):java.lang.String");
    }

    public View BW7(int i) {
        return A0J(i).A02;
    }
}
