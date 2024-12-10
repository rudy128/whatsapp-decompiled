package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.WaImageView;
import com.whatsapp.mediacomposer.doodle.ColorPickerComponent;
import com.whatsapp.mediacomposer.doodle.penmode.PenModeView;
import com.whatsapp.mediacomposer.doodle.universaltoolpicker.UniversalToolPickerView;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.5cz  reason: invalid class name and case insensitive filesystem */
public final class C109205cz extends Dialog {
    public int A00 = -1;
    public ViewGroup A01;
    public ViewGroup A02;
    public ViewGroup A03;
    public FrameLayout A04;
    public WaImageView A05;
    public WaImageView A06;
    public ColorPickerComponent A07;
    public C139616z9 A08;
    public C109455dT A09;
    public PenModeView A0A;
    public UniversalToolPickerView A0B;
    public WDSButton A0C;
    public final int A0D = getContext().getResources().getDimensionPixelSize(2131166569);
    public final int A0E = getContext().getResources().getDimensionPixelSize(2131166570);
    public final int A0F = getContext().getResources().getDimensionPixelSize(2131166571);
    public final View.OnLayoutChangeListener A0G = new C1420978d((Object) this, 8);
    public final AnonymousClass11P A0H;
    public final AnonymousClass6UC A0I;
    public final AnonymousClass7JF A0J;
    public final C136986uj A0K;
    public final C24641Lc A0L;
    public final C20050A4v A0M;
    public final C18100vl A0N = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152037nG(this));
    public final boolean A0O;
    public final boolean A0P;
    public final int[] A0Q;
    public final AnonymousClass87P A0R;
    public final C139256yX A0S;
    public final C133396og A0T = new C133396og(this);
    public final C132036m4 A0U;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109205cz(Activity activity, AnonymousClass11P r4, AnonymousClass6UC r5, AnonymousClass7JF r6, AnonymousClass87P r7, C139256yX r8, C132036m4 r9, C136986uj r10, C24641Lc r11, C20050A4v a4v, int[] iArr, boolean z, boolean z2) {
        super(activity, 2132083222);
        C18070vi.A0f(r5, 2, r9);
        this.A0I = r5;
        this.A0S = r8;
        this.A0U = r9;
        this.A0R = r7;
        this.A0Q = iArr;
        this.A0P = z;
        this.A0O = z2;
        this.A0K = r10;
        this.A0L = r11;
        this.A0M = a4v;
        this.A0J = r6;
        this.A0H = r4;
    }

    public void onBackPressed() {
        C139616z9 r0 = this.A08;
        if (r0 == null) {
            C18070vi.A11("penDialogController");
            throw null;
        } else if (!r0.A02) {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            setContentView(2131625143);
            View findViewById = findViewById(2131430134);
            C18070vi.A0X(findViewById);
            this.A04 = (FrameLayout) findViewById;
            View findViewById2 = findViewById(2131433735);
            C18070vi.A0X(findViewById2);
            this.A0C = (WDSButton) findViewById2;
            View findViewById3 = findViewById(2131433737);
            C18070vi.A0X(findViewById3);
            this.A05 = (WaImageView) findViewById3;
            View findViewById4 = findViewById(2131433738);
            C18070vi.A0X(findViewById4);
            this.A06 = (WaImageView) findViewById4;
            View findViewById5 = findViewById(2131428829);
            C18070vi.A0X(findViewById5);
            this.A01 = (ViewGroup) findViewById5;
            View findViewById6 = findViewById(2131433734);
            C18070vi.A0X(findViewById6);
            this.A07 = (ColorPickerComponent) findViewById6;
            View findViewById7 = findViewById(2131433744);
            C18070vi.A0X(findViewById7);
            this.A0A = (PenModeView) findViewById7;
            View findViewById8 = findViewById(2131430135);
            C18070vi.A0X(findViewById8);
            this.A03 = (ViewGroup) findViewById8;
            View findViewById9 = findViewById(2131433736);
            C18070vi.A0X(findViewById9);
            this.A02 = (ViewGroup) findViewById9;
            window.setLayout(-1, -1);
            window.setFlags(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
            if (Build.VERSION.SDK_INT >= 28) {
                window.getAttributes().layoutInDisplayCutoutMode = 1;
            }
            FrameLayout frameLayout = this.A04;
            if (frameLayout == null) {
                C18070vi.A11("rootLayout");
                throw null;
            }
            frameLayout.addOnLayoutChangeListener(this.A0G);
            WDSButton wDSButton = this.A0C;
            if (wDSButton == null) {
                C18070vi.A11("doneButton");
                throw null;
            }
            AnonymousClass78K.A00(wDSButton, this, 23);
            ViewGroup viewGroup = this.A01;
            if (viewGroup == null) {
                C18070vi.A11("canvas");
                throw null;
            }
            C1422678u.A00(viewGroup, this, 18);
            Context context = getContext();
            C18070vi.A0X(context);
            C109455dT r3 = new C109455dT(context, 2131231878);
            this.A09 = r3;
            WaImageView waImageView = this.A05;
            if (waImageView == null) {
                C18070vi.A11("penButton");
                throw null;
            }
            waImageView.setImageDrawable(r3);
            if (C18020vd.A05(C18040vf.A02, this.A0L.A01, 7952)) {
                WaImageView waImageView2 = this.A05;
                if (waImageView2 == null) {
                    C18070vi.A11("penButton");
                    throw null;
                }
                waImageView2.setVisibility(8);
                ViewGroup viewGroup2 = this.A03;
                if (viewGroup2 == null) {
                    C18070vi.A11("penDoodleTopBar");
                    throw null;
                }
                WDSButton wDSButton2 = this.A0C;
                if (wDSButton2 == null) {
                    C18070vi.A11("doneButton");
                    throw null;
                }
                viewGroup2.removeView(wDSButton2);
                ViewGroup viewGroup3 = this.A02;
                if (viewGroup3 == null) {
                    C18070vi.A11("penDialogIconContainer");
                    throw null;
                }
                WDSButton wDSButton3 = this.A0C;
                if (wDSButton3 == null) {
                    C18070vi.A11("doneButton");
                    throw null;
                }
                viewGroup3.addView(wDSButton3);
                WDSButton wDSButton4 = this.A0C;
                if (wDSButton4 == null) {
                    C18070vi.A11("doneButton");
                    throw null;
                }
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 16;
                wDSButton4.setLayoutParams(layoutParams);
                ColorPickerComponent colorPickerComponent = this.A07;
                if (colorPickerComponent == null) {
                    C18070vi.A11("colorPicker");
                    throw null;
                }
                colorPickerComponent.setVisibility(8);
                PenModeView penModeView = this.A0A;
                if (penModeView == null) {
                    C18070vi.A11("penModeView");
                    throw null;
                }
                penModeView.setVisibility(8);
                Context context2 = getContext();
                C18070vi.A0X(context2);
                UniversalToolPickerView universalToolPickerView = new UniversalToolPickerView(context2, (AttributeSet) null);
                this.A0B = universalToolPickerView;
                universalToolPickerView.A05(new AnonymousClass7JK(this, 1), 1, 1, 0, this.A0I.A00, 2, this.A0P, this.A0O);
                UniversalToolPickerView universalToolPickerView2 = this.A0B;
                if (universalToolPickerView2 != null) {
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2, 80);
                    FrameLayout frameLayout2 = this.A04;
                    if (frameLayout2 == null) {
                        C18070vi.A11("rootLayout");
                        throw null;
                    }
                    layoutParams2.bottomMargin = frameLayout2.getResources().getDimensionPixelSize(2131168774);
                    FrameLayout frameLayout3 = this.A04;
                    if (frameLayout3 == null) {
                        C18070vi.A11("rootLayout");
                        throw null;
                    } else {
                        layoutParams2.setMarginStart(frameLayout3.getResources().getDimensionPixelSize(2131168775));
                        universalToolPickerView2.setLayoutParams(layoutParams2);
                    }
                }
                FrameLayout frameLayout4 = this.A04;
                if (frameLayout4 == null) {
                    C18070vi.A11("rootLayout");
                    throw null;
                }
                frameLayout4.addView(this.A0B);
            } else {
                ColorPickerComponent colorPickerComponent2 = this.A07;
                if (colorPickerComponent2 == null) {
                    C18070vi.A11("colorPicker");
                    throw null;
                }
                colorPickerComponent2.A04((C136926ud) null, new AnonymousClass7J4(this, 1), (AnonymousClass87Q) null, false, false);
                ColorPickerComponent colorPickerComponent3 = this.A07;
                if (colorPickerComponent3 == null) {
                    C18070vi.A11("colorPicker");
                    throw null;
                }
                colorPickerComponent3.A03();
                PenModeView penModeView2 = this.A0A;
                if (penModeView2 == null) {
                    C18070vi.A11("penModeView");
                    throw null;
                }
                penModeView2.A00 = new AnonymousClass7JB(this);
            }
            Context context3 = getContext();
            C18070vi.A0X(context3);
            C109455dT r5 = new C109455dT(context3, 2131232370);
            r5.A02 = C19740yt.A00(getContext(), 2131103238);
            r5.A00 = 1.0f;
            r5.invalidateSelf();
            WaImageView waImageView3 = this.A06;
            if (waImageView3 == null) {
                C18070vi.A11("undoButton");
                throw null;
            }
            waImageView3.setImageDrawable(r5);
            WaImageView waImageView4 = this.A06;
            if (waImageView4 == null) {
                C18070vi.A11("undoButton");
                throw null;
            }
            AnonymousClass78K.A00(waImageView4, this, 24);
            WaImageView waImageView5 = this.A06;
            if (waImageView5 == null) {
                C18070vi.A11("undoButton");
                throw null;
            }
            C1421478i.A00(waImageView5, this, 7);
            int A002 = C19740yt.A00(getContext(), 2131100169);
            int i = this.A0I.A00;
            int i2 = this.A0D;
            C139616z9 r9 = new C139616z9(this.A0R, this.A0S, this.A0T, this.A0U, i, A002, i2);
            this.A08 = r9;
            int i3 = r9.A05;
            r9.A00 = i3;
            r9.A0A.A01(i3);
            r9.A02(2, r9.A06);
            C139616z9.A00(r9, false);
            if (!this.A0O) {
                PenModeView penModeView3 = this.A0A;
                if (penModeView3 == null) {
                    C18070vi.A11("penModeView");
                    throw null;
                }
                AnonymousClass1HF.A06(penModeView3, 2131433739).setVisibility(8);
                AnonymousClass3MY.A1A(penModeView3, 2131433740, 8);
            }
        }
    }
}
