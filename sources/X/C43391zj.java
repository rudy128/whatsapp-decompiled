package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.1zj  reason: invalid class name and case insensitive filesystem */
public final class C43391zj {
    public static final C43391zj A00 = new Object();

    public static final int A00(AnonymousClass1M9 r1, AnonymousClass1CJ r2, AnonymousClass1BI r3) {
        AnonymousClass1E7 A0E;
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r1, 1);
        if (C22971Dz.A0e(r3)) {
            if (r3 == null || (A0E = r1.A0E(r3)) == null) {
                return 0;
            }
            return A0E.A04;
        } else if (!C22971Dz.A0d(r3)) {
            return 0;
        } else {
            C18070vi.A0z(r3, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
            C29721cl A0D = r2.A0D((UserJid) r3);
            if (A0D != null) {
                return A0D.expiration;
            }
            return 0;
        }
    }

    public static final String A01(C18000vb r6, int i) {
        int i2;
        int i3;
        C18070vi.A0d(r6, 0);
        if (i <= 0) {
            return "";
        }
        if (i >= 86400) {
            i2 = i / 86400;
            i3 = 2131755446;
        } else if (i >= 3600) {
            i2 = i / 3600;
            i3 = 2131755447;
        } else if (i >= 60) {
            i2 = i / 60;
            i3 = 2131755448;
        } else {
            String A0K = r6.A0K(new Object[]{Integer.valueOf(i)}, 2131755449, (long) i);
            C18070vi.A0X(A0K);
            return A0K;
        }
        String A0K2 = r6.A0K(new Object[]{Integer.valueOf(i2)}, i3, (long) i2);
        C18070vi.A0b(A0K2);
        return A0K2;
    }

    public static final void A02(View view, LottieAnimationView lottieAnimationView) {
        C18070vi.A0d(view, 0);
        C18070vi.A0d(lottieAnimationView, 1);
        Boolean bool = C17970vW.A03;
        lottieAnimationView.setAnimation("ephemeral_settings_lottie_animation.lottie");
        lottieAnimationView.setVisibility(0);
        view.setVisibility(8);
    }

    public static final boolean A04(AnonymousClass1M9 r1, AnonymousClass1CJ r2, AnonymousClass1BI r3) {
        C18070vi.A0d(r2, 0);
        C18070vi.A0d(r1, 1);
        C18070vi.A0d(r3, 2);
        if (A00(r1, r2, r3) > 0) {
            return true;
        }
        return false;
    }

    public static final boolean A05(AnonymousClass1M9 r4, AnonymousClass1CJ r5, AnonymousClass206 r6) {
        C18070vi.A0d(r5, 0);
        C18070vi.A0d(r4, 1);
        AnonymousClass1BI r3 = r6.A0v.A00;
        if (C22971Dz.A0N(r3) || r6.A11(16384) || r6.A11(65536)) {
            return false;
        }
        C17960vV.A07(r3);
        if (A00(r4, r5, r3) != r6.A05) {
            return true;
        }
        return false;
    }

    public static final boolean A06(AnonymousClass1PM r2, AnonymousClass1CJ r3, AnonymousClass1PS r4, AnonymousClass206 r5) {
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        AnonymousClass205 r0 = r5.A0v;
        AnonymousClass1BI r1 = r0.A00;
        if (r0.A02 || !C22971Dz.A0Y(r1) || r2.A04((UserJid) r1) || (r5 instanceof C442822v) || (r5 instanceof C442622t) || r3.A0A(r1) != null || r5.A05 != 0 || !r4.A06() || C42701yb.A01(r1)) {
            return false;
        }
        return true;
    }

    public static final boolean A07(AnonymousClass1CJ r5, AnonymousClass206 r6) {
        if (r6 instanceof AnonymousClass2M9) {
            return false;
        }
        AnonymousClass205 r1 = r6.A0v;
        if (!r1.A02) {
            return false;
        }
        AnonymousClass1BI r3 = r1.A00;
        if (!C22971Dz.A0Y(r3) || r6.A0T == null) {
            return false;
        }
        int i = r6.A00;
        if ((i == 2 || i == 1) && r5.A0A(r3) == null) {
            return true;
        }
        return false;
    }

    public static final boolean A08(AnonymousClass1CJ r4, AnonymousClass206 r5) {
        AnonymousClass205 r1 = r5.A0v;
        if (r1.A02 || (r5 instanceof C442822v) || (r5 instanceof C442622t)) {
            return false;
        }
        AnonymousClass1BI r12 = r1.A00;
        if (!C22971Dz.A0Y(r12) || r4.A0A(r12) != null || r5.A05 <= 0) {
            return false;
        }
        int i = r5.A00;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final String A09(Context context, int i, boolean z, boolean z2) {
        int i2;
        String string;
        int i3;
        if (i <= 0) {
            if (z2) {
                i3 = 2131889235;
                if (z) {
                    i3 = 2131889234;
                }
            } else {
                i3 = 2131889939;
                if (z) {
                    i3 = 2131889938;
                }
            }
            String string2 = context.getString(i3);
            C18070vi.A0X(string2);
            return string2;
        }
        if (i != 86400) {
            if (i == 604800) {
                i2 = 2131889943;
                if (!z) {
                    i2 = 2131889944;
                }
            } else if (i != 7776000) {
                int i4 = 2131755129;
                if (i > 86400) {
                    i /= 86400;
                    i4 = 2131755126;
                } else if (i >= 3600) {
                    i /= 3600;
                    i4 = 2131755127;
                } else if (i >= 60) {
                    i /= 60;
                    i4 = 2131755128;
                }
                string = context.getResources().getQuantityString(i4, i, new Object[]{Integer.valueOf(i)});
            } else {
                i2 = 2131889919;
                if (!z) {
                    i2 = 2131889920;
                }
            }
            string = context.getString(i2);
        } else {
            i2 = 2131889916;
            if (!z) {
                i2 = 2131889917;
            }
            string = context.getString(i2);
        }
        C18070vi.A0b(string);
        return string;
    }

    public static final void A03(RadioGroup radioGroup, C43391zj r11, C18030ve r12, int i, boolean z, boolean z2) {
        int[] iArr;
        AppCompatRadioButton appCompatRadioButton;
        if (!z) {
            C24521Kq r0 = C24521Kq.$redex_init_class;
        }
        if (C18020vd.A05(C18040vf.A02, r12, 1397)) {
            iArr = C19620yd.A0J;
        } else {
            iArr = C19620yd.A0K;
        }
        AppCompatRadioButton[] appCompatRadioButtonArr = new AppCompatRadioButton[4];
        int i2 = -1;
        int i3 = 0;
        do {
            int i4 = iArr[i3];
            if (!z2 || i4 != 0) {
                Context context = radioGroup.getContext();
                C18070vi.A0X(context);
                AppCompatRadioButton appCompatRadioButton2 = new AppCompatRadioButton(new ContextThemeWrapper(context, 2132083664));
                appCompatRadioButton2.setId(View.generateViewId());
                appCompatRadioButton2.setTag(Integer.valueOf(i4));
                appCompatRadioButton2.setText(r11.A09(context, i4, true, z));
                appCompatRadioButton2.setLayoutParams(new RadioGroup.LayoutParams(-1, -2));
                appCompatRadioButtonArr[i3] = appCompatRadioButton2;
                radioGroup.addView(appCompatRadioButton2);
                if (i4 == i) {
                    i2 = i3;
                }
            }
            i3++;
        } while (i3 < 4);
        if (i2 >= 0 && (appCompatRadioButton = appCompatRadioButtonArr[i2]) != null) {
            appCompatRadioButton.setChecked(true);
        }
    }
}
