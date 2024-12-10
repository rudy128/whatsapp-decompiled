package X;

import android.os.Bundle;

public final class D8F implements C22403B6g {
    public static final C08 A0N = C08.STATIC;
    public static final CjD A0O = new Object();
    public static final C05 A0P = C05.SAME_SIZE;
    public static final C06 A0Q = C06.AUTO;
    public static final C07 A0R = C07.AUTO;
    public static final C0B A0S = C0B.FULL_SHEET;
    public static final String A0T;
    public D3L A00;
    public Integer A01;
    public Integer A02;
    public final int A03;
    public final D3N A04;
    public final D3N A05;
    public final D3D A06;
    public final D3E A07;
    public final C08 A08;
    public final D3P A09;
    public final C05 A0A;
    public final C06 A0B;
    public final C07 A0C;
    public final C0B A0D;
    public final C123686Vl A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.CjD, java.lang.Object] */
    static {
        String BZJ = AnonymousClass3MW.A15(D8F.class).BZJ();
        AnonymousClass8BR.A1I(BZJ);
        A0T = BZJ;
    }

    public int BYg() {
        return this.A03;
    }

    public D8F(D3N d3n, D3N d3n2, D3D d3d, D3E d3e, D3L d3l, C08 c08, D3P d3p, C05 c05, C06 c06, C07 c07, C0B c0b, C123686Vl r13, Integer num, Integer num2, Integer num3, Integer num4, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A03 = i;
        this.A0F = num;
        this.A0C = c07;
        this.A0D = c0b;
        this.A08 = c08;
        this.A0B = c06;
        this.A0G = num2;
        this.A01 = num3;
        this.A02 = num4;
        this.A0L = z;
        this.A05 = d3n;
        this.A04 = d3n2;
        this.A09 = d3p;
        this.A0A = c05;
        this.A00 = d3l;
        this.A0E = r13;
        this.A0K = z2;
        this.A0I = z3;
        this.A0H = str;
        this.A07 = d3e;
        this.A0M = z4;
        this.A0J = z5;
        this.A06 = d3d;
    }

    public final Bundle A00() {
        String str;
        Bundle A0D2 = C17880vN.A0D();
        A0D2.putInt("container_id", this.A03);
        A0D2.putString("drag_to_dismiss", this.A0C.value);
        A0D2.putString("mode", this.A0D.value);
        A0D2.putString("background_mode", this.A08.value);
        A0D2.putString("dimmed_background_tap_to_dismiss", this.A0B.value);
        Integer num = this.A0G;
        if (num != null) {
            A0D2.putInt("keyboard_soft_input_mode", num.intValue());
        }
        Integer num2 = this.A01;
        if (num2 != null) {
            A0D2.putString("animation_type", C25301Cd5.A01(num2));
        }
        Integer num3 = this.A02;
        if (num3 != null) {
            A0D2.putString("dismiss_animation_type", C25301Cd5.A01(num3));
        }
        C123686Vl r0 = this.A0E;
        if (r0 != null) {
            A0D2.putInt("custom_loading_view_resolver", C25925Coo.A00(r0));
        }
        D3L d3l = this.A00;
        if (d3l != null) {
            A0D2.putInt("on_dismiss_callback", C25925Coo.A00(d3l));
        }
        A0D2.putBoolean("native_use_slide_animation_for_full_screen", this.A0K);
        A0D2.putBoolean("native_disable_cancel_button_on_loading_screen", this.A0I);
        A0D2.putBoolean("clear_top_activity", this.A0L);
        A0D2.putParcelable("dimmed_background_color", this.A05);
        A0D2.putParcelable("background_overlay_color", this.A04);
        A0D2.putParcelable("bottom_sheet_margins", this.A09);
        A0D2.putString("corner_style", this.A0A.value);
        A0D2.setClassLoader(D8F.class.getClassLoader());
        String str2 = this.A0H;
        if (str2 != null) {
            A0D2.putString("bloks_screen_id", str2);
        }
        switch (this.A0F.intValue()) {
            case 0:
                str = "ForceDarkMode";
                break;
            case 1:
                str = "ForceLightMode";
                break;
            default:
                str = "Default";
                break;
        }
        A0D2.putString("dark_mode_config", str);
        A0D2.putParcelable("bottom_sheet_top_span", this.A07);
        A0D2.putBoolean("slide_to_anchor_immediately", this.A0M);
        A0D2.putBoolean("force_gradient_background", this.A0J);
        A0D2.putParcelable("key_dimming_behaviour", this.A06);
        return A0D2;
    }
}
