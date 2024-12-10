package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.74F  reason: invalid class name */
public abstract class AnonymousClass74F {
    public static final C18100vl A00 = AnonymousClass1DF.A01(AnonymousClass7xC.A00);
    public static final int[] A01 = {-5886863, -7296959, -4087745, -8838856, -5339276, -1002704, -4803801, -3760180, -7640688, -30068, -11222427, -33941, -14236452, -11023873, -9148566, -8482653, -11102465, -9558658, -8729691, -14404032, -8219446};
    public static final int[] A02 = {0, 1, 2, 5, 6, 7, 8, 4};

    public static final String A05(C32011gU r7, AnonymousClass206 r8) {
        String A17;
        C18070vi.A0d(r7, 0);
        if (r8 instanceof C439521o) {
            return ((C439521o) r8).BXV();
        }
        if (r8 instanceof AnonymousClass210) {
            AnonymousClass210 r1 = (AnonymousClass210) r8;
            if (!(r1.A17() == null || (A17 = r1.A17()) == null)) {
                SpannableStringBuilder A09 = AnonymousClass3MW.A09(A06(A17, 0, A17.length(), 10, 700).toString());
                r7.A05(A09);
                URLSpan[] uRLSpanArr = (URLSpan[]) A09.getSpans(0, A09.length(), URLSpan.class);
                C18070vi.A0b(uRLSpanArr);
                for (URLSpan uRLSpan : uRLSpanArr) {
                    int spanStart = A09.getSpanStart(uRLSpan);
                    int spanEnd = A09.getSpanEnd(uRLSpan);
                    String url = uRLSpan.getURL();
                    C18070vi.A0X(url);
                    A09.replace(spanStart, spanEnd, C124326Xx.A00(url));
                }
                return C18070vi.A0H(A09);
            }
        }
        return r8.A0P();
    }

    public static final String A07(String str) {
        C18070vi.A0d(str, 0);
        C43281zY r4 = new C43281zY(str);
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            if (str.charAt(i) == 10) {
                i2 += 50;
            } else {
                i2++;
            }
            if (i2 > 700) {
                break;
            }
            r4.A00 = i;
            i += r4.A02(C43291zZ.A00(r4, false), i);
        }
        return C108955ca.A0q(0, i, str);
    }

    public static final int A00() {
        return A01[Math.abs(((Random) A00.getValue()).nextInt()) % 21];
    }

    public static final int A01(int i, int i2, boolean z) {
        if (z) {
            if (i < 50) {
                return 24;
            }
            if (i < 150) {
                if (i2 >= 640) {
                    return 19;
                }
                return 16;
            } else if (i2 < 560) {
                return 14;
            } else {
                if (i2 < 640) {
                    return 16;
                }
            }
            return 19;
        } else if (i < 50) {
            return 32;
        } else {
            if (i < 150) {
                return 24;
            }
            return 16;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r0.A00 <= 0) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(X.C143887Fe r4, int r5) {
        /*
            if (r4 == 0) goto L_0x0027
            android.graphics.Bitmap r0 = r4.A0C()
        L_0x0006:
            r3 = 0
            if (r0 == 0) goto L_0x0026
            X.6g9 r0 = r4.A05
            if (r0 == 0) goto L_0x0012
            int r0 = r0.A00
            r2 = 1
            if (r0 > 0) goto L_0x0013
        L_0x0012:
            r2 = 0
        L_0x0013:
            r0 = 250(0xfa, float:3.5E-43)
            boolean r1 = X.C108975cc.A1C(r5, r0)
            byte[] r0 = r4.A0K
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r2 != 0) goto L_0x0026
            if (r1 != 0) goto L_0x0026
            if (r0 != 0) goto L_0x0026
            r3 = 1
        L_0x0026:
            return r3
        L_0x0027:
            r0 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74F.A09(X.7Fe, int):boolean");
    }

    public static final int A02(C32011gU r5, CharSequence charSequence) {
        boolean A15 = C18070vi.A15(r5, charSequence);
        int i = 0;
        int A03 = A03(charSequence, A15 ? 1 : 0, charSequence.length());
        ArrayList A032 = r5.A03(charSequence.toString());
        if (A032 == null) {
            return A03;
        }
        Iterator it = A032.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            C18070vi.A0b(A0v);
            i += A0v.length() - C124326Xx.A00(A0v).length();
        }
        return A03 - i;
    }

    public static final int A03(CharSequence charSequence, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        while (i < i2) {
            if (charSequence.charAt(i) != 10) {
                A10.append(charSequence.charAt(i));
            }
            i++;
        }
        return C137186v3.A00(A10.toString());
    }

    public static final Typeface A04(Context context, int i) {
        switch (i) {
            case 1:
                return Typeface.SERIF;
            case 2:
                Typeface typeface = AnonymousClass69c.A0M;
                if (typeface != null) {
                    return typeface;
                }
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), "fonts/FacebookScriptWA-Regular.otf");
                AnonymousClass69c.A0M = createFromAsset;
                return createFromAsset;
            case 4:
                return Typeface.DEFAULT_BOLD;
            case 5:
                Typeface typeface2 = AnonymousClass69c.A0K;
                if (typeface2 != null) {
                    return typeface2;
                }
                Typeface createFromAsset2 = Typeface.createFromAsset(context.getAssets(), "fonts/MorningBreeze-Regular.ttf");
                AnonymousClass69c.A0K = createFromAsset2;
                return createFromAsset2;
            case 6:
                Typeface typeface3 = AnonymousClass69c.A0J;
                if (typeface3 != null) {
                    return typeface3;
                }
                Typeface createFromAsset3 = Typeface.createFromAsset(context.getAssets(), "fonts/Calistoga-Regular.ttf");
                AnonymousClass69c.A0J = createFromAsset3;
                return createFromAsset3;
            case 7:
                Typeface typeface4 = AnonymousClass69c.A0L;
                if (typeface4 != null) {
                    return typeface4;
                }
                Typeface createFromAsset4 = Typeface.createFromAsset(context.getAssets(), "fonts/Exo2-ExtraBold.ttf");
                AnonymousClass69c.A0L = createFromAsset4;
                return createFromAsset4;
            case 8:
                Typeface typeface5 = AnonymousClass69c.A0N;
                if (typeface5 != null) {
                    return typeface5;
                }
                Typeface createFromAsset5 = Typeface.createFromAsset(context.getAssets(), "fonts/CourierPrime-Bold.ttf");
                AnonymousClass69c.A0N = createFromAsset5;
                return createFromAsset5;
            default:
                return Typeface.SANS_SERIF;
        }
    }

    public static final String A06(CharSequence charSequence, int i, int i2, int i3, int i4) {
        StringBuilder A10 = AnonymousClass000.A10();
        for (int i5 = i; i5 < i2 && i3 >= 0 && i4 > 0; i5++) {
            A10.append(charSequence.charAt(i5));
            if (charSequence.charAt(i5) == 10) {
                i3--;
            } else {
                i4--;
            }
        }
        if (A10.length() > 0 && A10.charAt(A10.length() - 1) == 10 && charSequence.charAt(i) != 10 && i != i2 - 1) {
            A10.deleteCharAt(A10.length() - 1);
        }
        return C18070vi.A0H(A10);
    }

    public static final void A08(Context context, View view) {
        int i;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (((float) C72453Mb.A09(context)) > context.getResources().getDimension(2131168869) + (2.0f * context.getResources().getDimension(2131168860))) {
            i = AnonymousClass3MW.A01(context.getResources(), 2131168869);
        } else {
            i = -1;
        }
        layoutParams.width = i;
        layoutParams.height = -2;
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }
}
