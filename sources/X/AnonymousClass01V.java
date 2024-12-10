package X;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.msys.mci.DefaultCrypto;
import java.util.Locale;

/* renamed from: X.01V  reason: invalid class name */
public class AnonymousClass01V extends AnonymousClass013 implements AnonymousClass01U, LayoutInflater.Factory2 {
    public static final AnonymousClass00O A0o = new AnonymousClass00O(0);
    public static final boolean A0p = (!"robolectric".equals(Build.FINGERPRINT));
    public static final int[] A0q = {16842836};
    public int A00;
    public int A01;
    public int A02 = -100;
    public int A03;
    public MenuInflater A04;
    public ViewGroup A05;
    public Window A06;
    public PopupWindow A07;
    public OnBackInvokedDispatcher A08;
    public C003401n A09;
    public AnonymousClass01Y A0A;
    public AnonymousClass01Y A0B;
    public C004401x A0C;
    public AnonymousClass02B A0D;
    public ActionBarContextView A0E;
    public C002701f A0F;
    public AnonymousClass1HC A0G = null;
    public CharSequence A0H;
    public Runnable A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public Configuration A0T;
    public Rect A0U;
    public Rect A0V;
    public View A0W;
    public TextView A0X;
    public OnBackInvokedCallback A0Y;
    public AnonymousClass023 A0Z;
    public C002301b A0a;
    public C003201l A0b;
    public AnonymousClass028 A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public C003201l[] A0j;
    public final Context A0k;
    public final AnonymousClass01D A0l;
    public final Object A0m;
    public final Runnable A0n = new AnonymousClass01W(this);

    public static Configuration A08(Context context, Configuration configuration, AnonymousClass1HD r4, int i, boolean z) {
        int i2;
        if (i == 1) {
            i2 = 16;
        } else if (i == 2) {
            i2 = 32;
        } else if (z) {
            i2 = 0;
        } else {
            i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & -49);
        if (r4 != null) {
            A0H(configuration2, r4);
        }
        return configuration2;
    }

    public Context A0V(Context context) {
        Configuration configuration;
        this.A0d = true;
        int i = this.A02;
        if (i == -100) {
            i = AnonymousClass013.A00;
        }
        int A0k2 = A0k(context, i);
        if (AnonymousClass013.A07(context)) {
            AnonymousClass013.A04(context);
        }
        AnonymousClass1HD A0p2 = A0p(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(A08(context, (Configuration) null, A0p2, A0k2, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof C003101k) {
            try {
                ((C003101k) context).A03(A08(context, (Configuration) null, A0p2, A0k2, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!A0p) {
            return context;
        }
        Configuration configuration2 = new Configuration();
        configuration2.uiMode = -1;
        configuration2.fontScale = 0.0f;
        Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
        Configuration configuration4 = context.getResources().getConfiguration();
        configuration3.uiMode = configuration4.uiMode;
        if (!configuration3.equals(configuration4)) {
            configuration = new Configuration();
            configuration.fontScale = 0.0f;
            if (configuration3.diff(configuration4) != 0) {
                float f = configuration3.fontScale;
                float f2 = configuration4.fontScale;
                if (f != f2) {
                    configuration.fontScale = f2;
                }
                int i2 = configuration3.mcc;
                int i3 = configuration4.mcc;
                if (i2 != i3) {
                    configuration.mcc = i3;
                }
                int i4 = configuration3.mnc;
                int i5 = configuration4.mnc;
                if (i4 != i5) {
                    configuration.mnc = i5;
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    C003701q.A01(configuration3, configuration4, configuration);
                } else if (!AnonymousClass026.A00(configuration3.locale, configuration4.locale)) {
                    configuration.locale = configuration4.locale;
                }
                int i6 = configuration3.touchscreen;
                int i7 = configuration4.touchscreen;
                if (i6 != i7) {
                    configuration.touchscreen = i7;
                }
                int i8 = configuration3.keyboard;
                int i9 = configuration4.keyboard;
                if (i8 != i9) {
                    configuration.keyboard = i9;
                }
                int i10 = configuration3.keyboardHidden;
                int i11 = configuration4.keyboardHidden;
                if (i10 != i11) {
                    configuration.keyboardHidden = i11;
                }
                int i12 = configuration3.navigation;
                int i13 = configuration4.navigation;
                if (i12 != i13) {
                    configuration.navigation = i13;
                }
                int i14 = configuration3.navigationHidden;
                int i15 = configuration4.navigationHidden;
                if (i14 != i15) {
                    configuration.navigationHidden = i15;
                }
                int i16 = configuration3.orientation;
                int i17 = configuration4.orientation;
                if (i16 != i17) {
                    configuration.orientation = i17;
                }
                int i18 = configuration3.screenLayout & 15;
                int i19 = configuration4.screenLayout & 15;
                if (i18 != i19) {
                    configuration.screenLayout |= i19;
                }
                int i20 = configuration3.screenLayout & 192;
                int i21 = configuration4.screenLayout & 192;
                if (i20 != i21) {
                    configuration.screenLayout |= i21;
                }
                int i22 = configuration3.screenLayout & 48;
                int i23 = configuration4.screenLayout & 48;
                if (i22 != i23) {
                    configuration.screenLayout |= i23;
                }
                int i24 = configuration3.screenLayout & 768;
                int i25 = configuration4.screenLayout & 768;
                if (i24 != i25) {
                    configuration.screenLayout |= i25;
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    AnonymousClass025.A00(configuration3, configuration4, configuration);
                }
                int i26 = configuration3.uiMode & 15;
                int i27 = configuration4.uiMode & 15;
                if (i26 != i27) {
                    configuration.uiMode |= i27;
                }
                int i28 = configuration3.uiMode & 48;
                int i29 = configuration4.uiMode & 48;
                if (i28 != i29) {
                    configuration.uiMode |= i29;
                }
                int i30 = configuration3.screenWidthDp;
                int i31 = configuration4.screenWidthDp;
                if (i30 != i31) {
                    configuration.screenWidthDp = i31;
                }
                int i32 = configuration3.screenHeightDp;
                int i33 = configuration4.screenHeightDp;
                if (i32 != i33) {
                    configuration.screenHeightDp = i33;
                }
                int i34 = configuration3.smallestScreenWidthDp;
                int i35 = configuration4.smallestScreenWidthDp;
                if (i34 != i35) {
                    configuration.smallestScreenWidthDp = i35;
                }
                int i36 = configuration3.densityDpi;
                int i37 = configuration4.densityDpi;
                if (i36 != i37) {
                    configuration.densityDpi = i37;
                }
            }
        } else {
            configuration = null;
        }
        Configuration A082 = A08(context, configuration, A0p2, A0k2, true);
        C003101k r1 = new C003101k(context, 2132084044);
        r1.A03(A082);
        try {
            if (context.getTheme() != null) {
                A0K(r1.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return r1;
    }

    public void A0b() {
        this.A0d = true;
        A0Q(this, false, true);
        A0D();
        Object obj = this.A0m;
        if (obj instanceof Activity) {
            try {
                if (AnonymousClass1HK.A01((Activity) obj) != null) {
                    C003401n r0 = this.A09;
                    if (r0 == null) {
                        this.A0g = true;
                    } else {
                        r0.A0V(true);
                    }
                }
            } catch (IllegalArgumentException unused) {
            }
            AnonymousClass013.A05(this);
        }
        this.A0T = new Configuration(this.A0k.getResources().getConfiguration());
        this.A0f = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        if (r8 != false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c9, code lost:
        r2 = (android.view.ViewGroup.MarginLayoutParams) r0.getLayoutParams();
     */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A0l(X.AnonymousClass1HO r13) {
        /*
            r12 = this;
            r3 = 0
            int r11 = r13.A05()
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0E
            r2 = 8
            if (r0 == 0) goto L_0x00fb
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r0 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x00fb
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0E
            android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0E
            boolean r0 = r0.isShown()
            r10 = 1
            if (r0 == 0) goto L_0x00fd
            android.graphics.Rect r0 = r12.A0U
            if (r0 != 0) goto L_0x0036
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A0U = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r12.A0V = r0
        L_0x0036:
            android.graphics.Rect r6 = r12.A0U
            android.graphics.Rect r8 = r12.A0V
            int r7 = r13.A03()
            int r5 = r13.A05()
            int r1 = r13.A04()
            int r0 = r13.A02()
            r6.set(r7, r5, r1, r0)
            android.view.ViewGroup r5 = r12.A05
            java.lang.reflect.Method r1 = X.C002801g.A00
            if (r1 == 0) goto L_0x0066
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x005e }
            r0[r3] = r6     // Catch:{ Exception -> 0x005e }
            r0[r10] = r8     // Catch:{ Exception -> 0x005e }
            r1.invoke(r5, r0)     // Catch:{ Exception -> 0x005e }
            goto L_0x0066
        L_0x005e:
            r5 = move-exception
            java.lang.String r1 = "ViewUtils"
            java.lang.String r0 = "Could not invoke computeFitSystemWindows"
            android.util.Log.d(r1, r0, r5)
        L_0x0066:
            int r9 = r6.top
            int r5 = r6.left
            int r1 = r6.right
            android.view.ViewGroup r0 = r12.A05
            X.1HO r0 = X.AnonymousClass1HF.A0C(r0)
            if (r0 != 0) goto L_0x00f1
            r7 = 0
            r6 = 0
        L_0x0076:
            int r0 = r4.topMargin
            if (r0 != r9) goto L_0x00e9
            int r0 = r4.leftMargin
            if (r0 != r5) goto L_0x00e9
            int r0 = r4.rightMargin
            if (r0 != r1) goto L_0x00e9
            r8 = 0
        L_0x0083:
            if (r9 <= 0) goto L_0x00c5
            android.view.View r0 = r12.A0W
            if (r0 != 0) goto L_0x00c5
            android.content.Context r1 = r12.A0k
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r12.A0W = r0
            r0.setVisibility(r2)
            int r1 = r4.topMargin
            r0 = 51
            r5 = -1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r5, r1, r0)
            r2.leftMargin = r7
            r2.rightMargin = r6
            android.view.ViewGroup r1 = r12.A05
            android.view.View r0 = r12.A0W
            r1.addView(r0, r5, r2)
        L_0x00aa:
            android.view.View r0 = r12.A0W
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x00b9
            android.view.View r0 = r12.A0W
            r12.A0M(r0)
        L_0x00b9:
            boolean r0 = r12.A0Q
            if (r0 != 0) goto L_0x00c0
            if (r10 == 0) goto L_0x00c0
            r11 = 0
        L_0x00c0:
            if (r8 == 0) goto L_0x0109
            goto L_0x0104
        L_0x00c3:
            r10 = 0
            goto L_0x00b9
        L_0x00c5:
            android.view.View r0 = r12.A0W
            if (r0 == 0) goto L_0x00aa
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r0 = r2.height
            int r1 = r4.topMargin
            if (r0 != r1) goto L_0x00dd
            int r0 = r2.leftMargin
            if (r0 != r7) goto L_0x00dd
            int r0 = r2.rightMargin
            if (r0 == r6) goto L_0x00aa
        L_0x00dd:
            r2.height = r1
            r2.leftMargin = r7
            r2.rightMargin = r6
            android.view.View r0 = r12.A0W
            r0.setLayoutParams(r2)
            goto L_0x00aa
        L_0x00e9:
            r4.topMargin = r9
            r4.leftMargin = r5
            r4.rightMargin = r1
            r8 = 1
            goto L_0x0083
        L_0x00f1:
            int r7 = r0.A03()
            int r6 = r0.A04()
            goto L_0x0076
        L_0x00fb:
            r10 = 0
            goto L_0x0109
        L_0x00fd:
            int r0 = r4.topMargin
            if (r0 == 0) goto L_0x00fb
            r4.topMargin = r3
            r10 = 0
        L_0x0104:
            androidx.appcompat.widget.ActionBarContextView r0 = r12.A0E
            r0.setLayoutParams(r4)
        L_0x0109:
            android.view.View r0 = r12.A0W
            if (r0 == 0) goto L_0x0114
            if (r10 != 0) goto L_0x0111
            r3 = 8
        L_0x0111:
            r0.setVisibility(r3)
        L_0x0114:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0l(X.1HO):int");
    }

    public void A0s() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = null;
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.A08;
        if (!(onBackInvokedDispatcher2 == null || (onBackInvokedCallback = this.A0Y) == null)) {
            AnonymousClass02E.A02(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.A0Y = null;
        }
        Object obj = this.A0m;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                onBackInvokedDispatcher = AnonymousClass02E.A00(activity);
            }
        }
        this.A08 = onBackInvokedDispatcher;
        A0t();
    }

    public void A0u(int i) {
        C003201l A0m2 = A0m(i);
        if (A0m2.A0A != null) {
            Bundle bundle = new Bundle();
            A0m2.A0A.A0Q(bundle);
            if (bundle.size() > 0) {
                A0m2.A05 = bundle;
            }
            C003301m r0 = A0m2.A0A;
            r0.A0K();
            r0.clear();
        }
        A0m2.A0F = true;
        A0m2.A0E = true;
        if ((i == 108 || i == 0) && this.A0F != null) {
            C003201l A0m3 = A0m(0);
            A0m3.A0D = false;
            A0U((KeyEvent) null, A0m3);
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (r4 != null) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup A09() {
        /*
            r9 = this;
            android.content.Context r7 = r9.A0k
            int[] r0 = X.C002501d.A09
            android.content.res.TypedArray r1 = r7.obtainStyledAttributes(r0)
            r0 = 117(0x75, float:1.64E-43)
            r2 = 117(0x75, float:1.64E-43)
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x01af
            r0 = 126(0x7e, float:1.77E-43)
            r6 = 0
            boolean r0 = r1.getBoolean(r0, r6)
            r3 = 1
            if (r0 == 0) goto L_0x00f3
            r9.A0d(r3)
        L_0x001f:
            r0 = 118(0x76, float:1.65E-43)
            boolean r0 = r1.getBoolean(r0, r6)
            r2 = 109(0x6d, float:1.53E-43)
            if (r0 == 0) goto L_0x002c
            r9.A0d(r2)
        L_0x002c:
            r0 = 119(0x77, float:1.67E-43)
            boolean r0 = r1.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x0039
            r0 = 10
            r9.A0d(r0)
        L_0x0039:
            boolean r0 = r1.getBoolean(r6, r6)
            r9.A0N = r0
            r1.recycle()
            r9.A0D()
            android.view.Window r0 = r9.A06
            r0.getDecorView()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r7)
            boolean r0 = r9.A0S
            r5 = 0
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x0084
            r0 = 2131623948(0x7f0e000c, float:1.8875062E38)
            android.view.View r4 = r4.inflate(r0, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r9.A0P = r6
            r9.A0L = r6
        L_0x0064:
            if (r4 == 0) goto L_0x0169
        L_0x0066:
            X.01e r0 = new X.01e
            r0.<init>(r9)
            X.AnonymousClass1HF.A0g(r4, r0)
            X.01f r0 = r9.A0F
            if (r0 != 0) goto L_0x007d
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r0 = r4.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r9.A0X = r0
        L_0x007d:
            boolean r0 = X.C002801g.A01
            java.lang.String r8 = "Could not invoke makeOptionalFitsSystemWindows"
            java.lang.String r7 = "ViewUtils"
            goto L_0x0100
        L_0x0084:
            boolean r0 = r9.A0L
            if (r0 == 0) goto L_0x0169
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r1.resolveAttribute(r0, r4, r3)
            int r1 = r4.resourceId
            if (r1 == 0) goto L_0x00df
            X.01k r0 = new X.01k
            r0.<init>(r7, r1)
        L_0x00a0:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131623959(0x7f0e0017, float:1.8875084E38)
            android.view.View r4 = r1.inflate(r0, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r0 = 2131429843(0x7f0b09d3, float:1.848137E38)
            android.view.View r1 = r4.findViewById(r0)
            X.01f r1 = (X.C002701f) r1
            r9.A0F = r1
            android.view.Window r0 = r9.A06
            android.view.Window$Callback r0 = r0.getCallback()
            r1.setWindowCallback(r0)
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x00ca
            X.01f r0 = r9.A0F
            r0.BdN(r2)
        L_0x00ca:
            boolean r0 = r9.A0i
            if (r0 == 0) goto L_0x00d4
            X.01f r1 = r9.A0F
            r0 = 2
            r1.BdN(r0)
        L_0x00d4:
            boolean r0 = r9.A0h
            if (r0 == 0) goto L_0x0066
            X.01f r1 = r9.A0F
            r0 = 5
            r1.BdN(r0)
            goto L_0x0066
        L_0x00df:
            r0 = r7
            goto L_0x00a0
        L_0x00e1:
            boolean r1 = r9.A0Q
            r0 = 2131623957(0x7f0e0015, float:1.887508E38)
            if (r1 == 0) goto L_0x00eb
            r0 = 2131623958(0x7f0e0016, float:1.8875082E38)
        L_0x00eb:
            android.view.View r4 = r4.inflate(r0, r5)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            goto L_0x0064
        L_0x00f3:
            boolean r0 = r1.getBoolean(r2, r6)
            if (r0 == 0) goto L_0x001f
            r0 = 108(0x6c, float:1.51E-43)
            r9.A0d(r0)
            goto L_0x001f
        L_0x0100:
            java.lang.Class r2 = r4.getClass()     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
            java.lang.String r1 = "makeOptionalFitsSystemWindows"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
            java.lang.reflect.Method r1 = r2.getMethod(r1, r0)     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
            boolean r0 = r1.isAccessible()     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
            if (r0 != 0) goto L_0x0115
            r1.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
        L_0x0115:
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
            r1.invoke(r4, r0)     // Catch:{ NoSuchMethodException -> 0x0120, IllegalAccessException | InvocationTargetException -> 0x011b }
            goto L_0x0125
        L_0x011b:
            r0 = move-exception
            android.util.Log.d(r7, r8, r0)
            goto L_0x0125
        L_0x0120:
            java.lang.String r0 = "Could not find method makeOptionalFitsSystemWindows. Oh well..."
            android.util.Log.d(r7, r0)
        L_0x0125:
            r0 = 2131427473(0x7f0b0091, float:1.8476563E38)
            android.view.View r3 = r4.findViewById(r0)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r0 = r9.A06
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L_0x015c
        L_0x013b:
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x014c
            android.view.View r0 = r1.getChildAt(r6)
            r1.removeViewAt(r6)
            r3.addView(r0)
            goto L_0x013b
        L_0x014c:
            r0 = -1
            r1.setId(r0)
            r3.setId(r2)
            boolean r0 = r1 instanceof android.widget.FrameLayout
            if (r0 == 0) goto L_0x015c
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.setForeground(r5)
        L_0x015c:
            android.view.Window r0 = r9.A06
            r0.setContentView(r4)
            X.01j r0 = new X.01j
            r0.<init>(r9)
            r3.A00 = r0
            return r4
        L_0x0169:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "AppCompat does not support the current theme features: { windowActionBar: "
            r1.append(r0)
            boolean r0 = r9.A0L
            r1.append(r0)
            java.lang.String r0 = ", windowActionBarOverlay: "
            r1.append(r0)
            boolean r0 = r9.A0P
            r1.append(r0)
            java.lang.String r0 = ", android:windowIsFloating: "
            r1.append(r0)
            boolean r0 = r9.A0N
            r1.append(r0)
            java.lang.String r0 = ", windowActionModeOverlay: "
            r1.append(r0)
            boolean r0 = r9.A0Q
            r1.append(r0)
            java.lang.String r0 = ", windowNoTitle: "
            r1.append(r0)
            boolean r0 = r9.A0S
            r1.append(r0)
            java.lang.String r0 = " }"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x01af:
            r1.recycle()
            java.lang.String r0 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A09():android.view.ViewGroup");
    }

    private AnonymousClass01Y A0A(Context context) {
        AnonymousClass01Y r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        C003501o r2 = C003501o.A03;
        if (r2 == null) {
            Context applicationContext = context.getApplicationContext();
            r2 = new C003501o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            C003501o.A03 = r2;
        }
        C003601p r02 = new C003601p(this, r2);
        this.A0B = r02;
        return r02;
    }

    public static AnonymousClass1HD A0B(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return C003701q.A00(configuration);
        }
        return AnonymousClass1HD.A02(A0C(configuration.locale));
    }

    private void A0D() {
        if (this.A06 == null) {
            Object obj = this.A0m;
            if (obj instanceof Activity) {
                A0N(((Activity) obj).getWindow());
            }
        }
        if (this.A06 == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void A0E() {
        if (this.A0R) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public static void A0F(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else {
            new Handler(activity.getMainLooper()).post(new C449025f((Object) activity, 0));
        }
    }

    private void A0G(Configuration configuration) {
        Activity activity = (Activity) this.A0m;
        if (activity instanceof AnonymousClass1F9) {
            if (!((AnonymousClass1F9) activity).getLifecycle().A04().A00(C23401Fx.CREATED)) {
                return;
            }
        } else if (!this.A0f || this.A0K) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    public static void A0H(Configuration configuration, AnonymousClass1HD r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            C003701q.A02(configuration, r3);
            return;
        }
        A0J(configuration, r3.A06(0));
        A0I(configuration, r3.A06(0));
    }

    public static void A0K(Resources.Theme theme) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            AnonymousClass1HH.A00(theme);
        } else if (i >= 23) {
            AnonymousClass1HI.A00(theme);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0078, code lost:
        if (r0.getCount() > 0) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ec, code lost:
        if (r0 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fe, code lost:
        if (r0.width != -1) goto L_0x00b3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0L(android.view.KeyEvent r16, X.C003201l r17) {
        /*
            r15 = this;
            r5 = r17
            boolean r0 = r5.A0C
            if (r0 != 0) goto L_0x001f
            boolean r0 = r15.A0K
            if (r0 != 0) goto L_0x001f
            int r4 = r5.A01
            if (r4 != 0) goto L_0x0020
            android.content.Context r0 = r15.A0k
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenLayout
            r1 = r0 & 15
            r0 = 4
            if (r1 != r0) goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            android.view.Window r0 = r15.A06
            android.view.Window$Callback r1 = r0.getCallback()
            r3 = 1
            if (r1 == 0) goto L_0x0035
            X.01m r0 = r5.A0A
            boolean r0 = r1.onMenuOpened(r4, r0)
            if (r0 != 0) goto L_0x0035
            r15.A0w(r5, r3)
            return
        L_0x0035:
            android.content.Context r6 = r15.A0k
            java.lang.String r0 = "window"
            java.lang.Object r2 = r6.getSystemService(r0)
            android.view.ViewManager r2 = (android.view.ViewManager) r2
            if (r2 == 0) goto L_0x001f
            r0 = r16
            boolean r0 = r15.A0U(r0, r5)
            if (r0 == 0) goto L_0x001f
            android.view.ViewGroup r1 = r5.A08
            r9 = -2
            if (r1 == 0) goto L_0x0101
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x00f0
            int r0 = r1.getChildCount()
            if (r0 <= 0) goto L_0x005d
            android.view.ViewGroup r0 = r5.A08
            r0.removeAllViews()
        L_0x005d:
            android.view.View r0 = r5.A06
            if (r0 == 0) goto L_0x00d7
            r5.A07 = r0
        L_0x0063:
            android.view.View r0 = r5.A06
            if (r0 != 0) goto L_0x007a
            X.01u r1 = r5.A09
            X.01v r0 = r1.A03
            if (r0 != 0) goto L_0x0074
            X.01v r0 = new X.01v
            r0.<init>(r1)
            r1.A03 = r0
        L_0x0074:
            int r0 = r0.getCount()
            if (r0 <= 0) goto L_0x0175
        L_0x007a:
            android.view.View r0 = r5.A07
            android.view.ViewGroup$LayoutParams r6 = r0.getLayoutParams()
            if (r6 != 0) goto L_0x0087
            android.view.ViewGroup$LayoutParams r6 = new android.view.ViewGroup$LayoutParams
            r6.<init>(r9, r9)
        L_0x0087:
            int r1 = r5.A00
            android.view.ViewGroup r0 = r5.A08
            r0.setBackgroundResource(r1)
            android.view.View r0 = r5.A07
            android.view.ViewParent r1 = r0.getParent()
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x009f
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r0 = r5.A07
            r1.removeView(r0)
        L_0x009f:
            android.view.ViewGroup r1 = r5.A08
            android.view.View r0 = r5.A07
            r1.addView(r0, r6)
            android.view.View r0 = r5.A07
            boolean r0 = r0.hasFocus()
            if (r0 != 0) goto L_0x00b3
            android.view.View r0 = r5.A07
            r0.requestFocus()
        L_0x00b3:
            r8 = -2
        L_0x00b4:
            r10 = 0
            r5.A0B = r10
            r13 = 8519680(0x820000, float:1.1938615E-38)
            r14 = -3
            r12 = 1002(0x3ea, float:1.404E-42)
            android.view.WindowManager$LayoutParams r7 = new android.view.WindowManager$LayoutParams
            r11 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            int r0 = r5.A02
            r7.gravity = r0
            int r0 = r5.A03
            r7.windowAnimations = r0
            android.view.ViewGroup r0 = r5.A08
            r2.addView(r0, r7)
            r5.A0C = r3
            if (r4 != 0) goto L_0x001f
            r15.A0t()
            return
        L_0x00d7:
            X.01m r0 = r5.A0A
            if (r0 == 0) goto L_0x0175
            X.01x r0 = r15.A0C
            if (r0 != 0) goto L_0x00e6
            X.01x r0 = new X.01x
            r0.<init>(r15)
            r15.A0C = r0
        L_0x00e6:
            androidx.appcompat.view.menu.ExpandedMenuView r0 = r5.A00(r0)
            r5.A07 = r0
            if (r0 == 0) goto L_0x0175
            goto L_0x0063
        L_0x00f0:
            android.view.View r0 = r5.A06
            if (r0 == 0) goto L_0x00b3
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            if (r0 == 0) goto L_0x00b3
            int r1 = r0.width
            r0 = -1
            r8 = -1
            if (r1 == r0) goto L_0x00b4
            goto L_0x00b3
        L_0x0101:
            A0P(r15)
            X.01n r0 = r15.A09
            if (r0 == 0) goto L_0x010e
            android.content.Context r8 = r0.A0A()
            if (r8 != 0) goto L_0x010f
        L_0x010e:
            r8 = r6
        L_0x010f:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r7 = r0.newTheme()
            android.content.res.Resources$Theme r0 = r8.getTheme()
            r7.setTo(r0)
            r0 = 2130968591(0x7f04000f, float:1.754584E38)
            r7.resolveAttribute(r0, r1, r3)
            int r0 = r1.resourceId
            if (r0 == 0) goto L_0x0130
            r7.applyStyle(r0, r3)
        L_0x0130:
            r0 = 2130970684(0x7f04083c, float:1.7550085E38)
            r7.resolveAttribute(r0, r1, r3)
            int r0 = r1.resourceId
            if (r0 != 0) goto L_0x013d
            r0 = 2132084032(0x7f150540, float:1.9808223E38)
        L_0x013d:
            r7.applyStyle(r0, r3)
            r6 = 0
            X.01k r1 = new X.01k
            r1.<init>(r8, r6)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r7)
            r5.A04 = r1
            int[] r0 = X.C002501d.A09
            android.content.res.TypedArray r1 = r1.obtainStyledAttributes(r0)
            r0 = 86
            int r0 = r1.getResourceId(r0, r6)
            r5.A00 = r0
            int r0 = r1.getResourceId(r3, r6)
            r5.A03 = r0
            r1.recycle()
            android.content.Context r1 = r5.A04
            X.021 r0 = new X.021
            r0.<init>(r1, r15)
            r5.A08 = r0
            r0 = 81
            r5.A02 = r0
            goto L_0x005d
        L_0x0175:
            r5.A0E = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0L(android.view.KeyEvent, X.01l):void");
    }

    private void A0N(Window window) {
        if (this.A06 == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof C002301b)) {
                C002301b r0 = new C002301b(callback, this);
                this.A0a = r0;
                window.setCallback(r0);
                Context context = this.A0k;
                C002401c r1 = new C002401c(context, context.obtainStyledAttributes((AttributeSet) null, A0q));
                Drawable A042 = r1.A04(0);
                if (A042 != null) {
                    window.setBackgroundDrawable(A042);
                }
                r1.A02.recycle();
                this.A06 = window;
                if (Build.VERSION.SDK_INT >= 33 && this.A08 == null) {
                    A0s();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public static void A0O(AnonymousClass01V r6) {
        CharSequence charSequence;
        if (!r6.A0R) {
            r6.A05 = r6.A09();
            Object obj = r6.A0m;
            if (obj instanceof Activity) {
                charSequence = ((Activity) obj).getTitle();
            } else {
                charSequence = r6.A0H;
            }
            if (!TextUtils.isEmpty(charSequence)) {
                C002701f r0 = r6.A0F;
                if (r0 != null) {
                    r0.setWindowTitle(charSequence);
                } else {
                    C003401n r02 = r6.A09;
                    if (r02 != null) {
                        r02.A0T(charSequence);
                    } else {
                        TextView textView = r6.A0X;
                        if (textView != null) {
                            textView.setText(charSequence);
                        }
                    }
                }
            }
            ContentFrameLayout contentFrameLayout = (ContentFrameLayout) r6.A05.findViewById(16908290);
            View decorView = r6.A06.getDecorView();
            contentFrameLayout.A07.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
            if (contentFrameLayout.isLaidOut()) {
                contentFrameLayout.requestLayout();
            }
            TypedArray obtainStyledAttributes = r6.A0k.obtainStyledAttributes(C002501d.A09);
            obtainStyledAttributes.getValue(124, contentFrameLayout.getMinWidthMajor());
            obtainStyledAttributes.getValue(125, contentFrameLayout.getMinWidthMinor());
            if (obtainStyledAttributes.hasValue(122)) {
                obtainStyledAttributes.getValue(122, contentFrameLayout.getFixedWidthMajor());
            }
            if (obtainStyledAttributes.hasValue(123)) {
                obtainStyledAttributes.getValue(123, contentFrameLayout.getFixedWidthMinor());
            }
            if (obtainStyledAttributes.hasValue(120)) {
                obtainStyledAttributes.getValue(120, contentFrameLayout.getFixedHeightMajor());
            }
            if (obtainStyledAttributes.hasValue(121)) {
                obtainStyledAttributes.getValue(121, contentFrameLayout.getFixedHeightMinor());
            }
            obtainStyledAttributes.recycle();
            contentFrameLayout.requestLayout();
            r6.A0R = true;
            C003201l A0m2 = r6.A0m(0);
            if (!r6.A0K && A0m2.A0A == null) {
                r6.A01 = (1 << AnonymousClass74N.A03) | r6.A01;
                if (!r6.A0M) {
                    r6.A06.getDecorView().postOnAnimation(r6.A0n);
                    r6.A0M = true;
                }
            }
        }
    }

    public static void A0Q(AnonymousClass01V r5, boolean z, boolean z2) {
        AnonymousClass1HD r0;
        if (!r5.A0K) {
            int i = r5.A02;
            if (i == -100) {
                i = AnonymousClass013.A00;
            }
            Context context = r5.A0k;
            int A0k2 = r5.A0k(context, i);
            if (Build.VERSION.SDK_INT < 33) {
                r0 = r5.A0p(context);
            } else {
                r0 = null;
            }
            if (!z2 && r0 != null) {
                r0 = A0B(context.getResources().getConfiguration());
            }
            r5.A0S(r0, A0k2, z);
            if (i == 0) {
                r5.A0A(context).A03();
            } else {
                AnonymousClass01Y r02 = r5.A0B;
                if (r02 != null) {
                    r02.A02();
                }
                if (i == 3) {
                    AnonymousClass01Y r03 = r5.A0A;
                    if (r03 == null) {
                        r03 = new AnonymousClass01Z(context, r5);
                        r5.A0A = r03;
                    }
                    r03.A03();
                    return;
                }
            }
            AnonymousClass01Y r04 = r5.A0A;
            if (r04 != null) {
                r04.A02();
            }
        }
    }

    public static void A0R(AnonymousClass1HD r2) {
        if (Build.VERSION.SDK_INT >= 24) {
            C003701q.A03(r2);
        } else {
            Locale.setDefault(r2.A06(0));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0S(X.AnonymousClass1HD r9, int r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r4 = r8.A0k
            r0 = 0
            r5 = 0
            android.content.res.Configuration r3 = A08(r4, r0, r9, r10, r5)
            boolean r0 = r8.A0J
            if (r0 != 0) goto L_0x00b9
            java.lang.Object r7 = r8.A0m
            boolean r0 = r7 instanceof android.app.Activity
            if (r0 == 0) goto L_0x00b9
            android.content.pm.PackageManager r6 = r4.getPackageManager()
            if (r6 != 0) goto L_0x008b
            r6 = 0
        L_0x0019:
            android.content.res.Configuration r2 = r8.A0T
            if (r2 != 0) goto L_0x0025
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r2 = r0.getConfiguration()
        L_0x0025:
            int r0 = r2.uiMode
            r1 = r0 & 48
            int r0 = r3.uiMode
            r5 = r0 & 48
            X.1HD r0 = A0B(r2)
            r2 = 0
            if (r9 == 0) goto L_0x0038
            X.1HD r2 = A0B(r3)
        L_0x0038:
            r3 = 0
            r7 = 0
            if (r1 == r5) goto L_0x003e
            r7 = 512(0x200, float:7.175E-43)
        L_0x003e:
            if (r2 == 0) goto L_0x004a
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x004a
            r0 = r7 | 4
            r7 = r0 | 8192(0x2000, float:1.14794E-41)
        L_0x004a:
            r0 = r6 ^ -1
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0080
            if (r11 == 0) goto L_0x0080
            boolean r0 = r8.A0d
            if (r0 == 0) goto L_0x0080
            boolean r0 = A0p
            if (r0 != 0) goto L_0x005d
            boolean r0 = r8.A0f
            if (r0 == 0) goto L_0x0080
        L_0x005d:
            java.lang.Object r1 = r8.A0m
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0080
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r1.isChild()
            if (r0 != 0) goto L_0x0080
            A0F(r1)
        L_0x006e:
            if (r2 == 0) goto L_0x007f
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            X.1HD r0 = A0B(r0)
            A0R(r0)
        L_0x007f:
            return
        L_0x0080:
            if (r7 == 0) goto L_0x007f
            r0 = r7 & r6
            if (r0 != r7) goto L_0x0087
            r3 = 1
        L_0x0087:
            r8.A0T(r2, r5, r3)
            goto L_0x006e
        L_0x008b:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ NameNotFoundException -> 0x00af }
            r0 = 29
            if (r1 < r0) goto L_0x0094
            r2 = 269221888(0x100c0000, float:2.7610132E-29)
            goto L_0x009b
        L_0x0094:
            r0 = 24
            r2 = 0
            if (r1 < r0) goto L_0x009b
            r2 = 786432(0xc0000, float:1.102026E-39)
        L_0x009b:
            java.lang.Class r1 = r7.getClass()     // Catch:{ NameNotFoundException -> 0x00af }
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x00af }
            r0.<init>(r4, r1)     // Catch:{ NameNotFoundException -> 0x00af }
            android.content.pm.ActivityInfo r0 = r6.getActivityInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00af }
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.configChanges     // Catch:{ NameNotFoundException -> 0x00af }
            r8.A00 = r0     // Catch:{ NameNotFoundException -> 0x00af }
            goto L_0x00b9
        L_0x00af:
            r2 = move-exception
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Exception while getting ActivityInfo"
            android.util.Log.d(r1, r0, r2)
            r8.A00 = r5
        L_0x00b9:
            r0 = 1
            r8.A0J = r0
            int r6 = r8.A00
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0S(X.1HD, int, boolean):void");
    }

    private void A0T(AnonymousClass1HD r6, int i, boolean z) {
        Context context = this.A0k;
        Resources resources = context.getResources();
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.uiMode = i | (resources.getConfiguration().uiMode & -49);
        if (r6 != null) {
            A0H(configuration, r6);
        }
        resources.updateConfiguration(configuration, (DisplayMetrics) null);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            AnonymousClass024.A00(resources);
        }
        int i3 = this.A03;
        if (i3 != 0) {
            context.setTheme(i3);
            if (i2 >= 23) {
                context.getTheme().applyStyle(this.A03, true);
            }
        }
        if (z && (this.A0m instanceof Activity)) {
            A0G(configuration);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        if (r6 == 108) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0047, code lost:
        if (r13.A0F != false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (r8 != null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0U(android.view.KeyEvent r12, X.C003201l r13) {
        /*
            r11 = this;
            boolean r0 = r11.A0K
            r2 = 0
            if (r0 != 0) goto L_0x0076
            boolean r0 = r13.A0D
            r3 = 1
            if (r0 != 0) goto L_0x013c
            X.01l r0 = r11.A0b
            if (r0 == 0) goto L_0x0013
            if (r0 == r13) goto L_0x0013
            r11.A0w(r0, r2)
        L_0x0013:
            android.view.Window r0 = r11.A06
            android.view.Window$Callback r5 = r0.getCallback()
            if (r5 == 0) goto L_0x0023
            int r0 = r13.A01
            android.view.View r0 = r5.onCreatePanelView(r0)
            r13.A06 = r0
        L_0x0023:
            int r6 = r13.A01
            if (r6 == 0) goto L_0x002c
            r0 = 108(0x6c, float:1.51E-43)
            r10 = 0
            if (r6 != r0) goto L_0x0034
        L_0x002c:
            r10 = 1
            X.01f r0 = r11.A0F
            if (r0 == 0) goto L_0x0034
            r0.CJS()
        L_0x0034:
            android.view.View r0 = r13.A06
            if (r0 != 0) goto L_0x0133
            if (r10 == 0) goto L_0x0040
            X.01n r0 = r11.A09
            boolean r0 = r0 instanceof X.AnonymousClass022
            if (r0 != 0) goto L_0x0133
        L_0x0040:
            X.01m r7 = r13.A0A
            r4 = 0
            if (r7 == 0) goto L_0x0077
            boolean r0 = r13.A0F
            if (r0 == 0) goto L_0x00ee
        L_0x0049:
            if (r10 == 0) goto L_0x005d
            X.01f r1 = r11.A0F
            if (r1 == 0) goto L_0x005d
            X.023 r0 = r11.A0Z
            if (r0 != 0) goto L_0x005a
            X.023 r0 = new X.023
            r0.<init>(r11)
            r11.A0Z = r0
        L_0x005a:
            r1.setMenu(r7, r0)
        L_0x005d:
            X.01m r0 = r13.A0A
            r0.A0K()
            boolean r0 = r5.onCreatePanelMenu(r6, r0)
            if (r0 != 0) goto L_0x00ec
            r13.A01(r4)
            if (r10 == 0) goto L_0x0076
            X.01f r1 = r11.A0F
            if (r1 == 0) goto L_0x0076
            X.023 r0 = r11.A0Z
            r1.setMenu(r4, r0)
        L_0x0076:
            return r2
        L_0x0077:
            android.content.Context r7 = r11.A0k
            int r1 = r13.A01
            if (r1 == 0) goto L_0x0081
            r0 = 108(0x6c, float:1.51E-43)
            if (r1 != r0) goto L_0x00d1
        L_0x0081:
            X.01f r0 = r11.A0F
            if (r0 == 0) goto L_0x00d1
            android.util.TypedValue r9 = new android.util.TypedValue
            r9.<init>()
            android.content.res.Resources$Theme r1 = r7.getTheme()
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r1.resolveAttribute(r0, r9, r3)
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x00e4
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Resources$Theme r8 = r0.newTheme()
            r8.setTo(r1)
            int r0 = r9.resourceId
            r8.applyStyle(r0, r3)
            r0 = 2130968599(0x7f040017, float:1.7545856E38)
            r8.resolveAttribute(r0, r9, r3)
        L_0x00ae:
            int r0 = r9.resourceId
            if (r0 == 0) goto L_0x00e1
            if (r8 != 0) goto L_0x00bf
            android.content.res.Resources r0 = r7.getResources()
            android.content.res.Resources$Theme r8 = r0.newTheme()
            r8.setTo(r1)
        L_0x00bf:
            int r0 = r9.resourceId
            r8.applyStyle(r0, r3)
        L_0x00c4:
            X.01k r1 = new X.01k
            r1.<init>(r7, r2)
            android.content.res.Resources$Theme r0 = r1.getTheme()
            r0.setTo(r8)
            r7 = r1
        L_0x00d1:
            X.01m r0 = new X.01m
            r0.<init>(r7)
            r0.A0U(r11)
            r13.A01(r0)
            X.01m r7 = r13.A0A
            if (r7 != 0) goto L_0x0049
            return r2
        L_0x00e1:
            if (r8 == 0) goto L_0x00d1
            goto L_0x00c4
        L_0x00e4:
            r0 = 2130968599(0x7f040017, float:1.7545856E38)
            r1.resolveAttribute(r0, r9, r3)
            r8 = 0
            goto L_0x00ae
        L_0x00ec:
            r13.A0F = r2
        L_0x00ee:
            X.01m r1 = r13.A0A
            r1.A0K()
            android.os.Bundle r0 = r13.A05
            if (r0 == 0) goto L_0x00fc
            r1.A0P(r0)
            r13.A05 = r4
        L_0x00fc:
            android.view.View r1 = r13.A06
            X.01m r0 = r13.A0A
            boolean r0 = r5.onPreparePanel(r2, r1, r0)
            if (r0 != 0) goto L_0x0117
            if (r10 == 0) goto L_0x0111
            X.01f r1 = r11.A0F
            if (r1 == 0) goto L_0x0111
            X.023 r0 = r11.A0Z
            r1.setMenu(r4, r0)
        L_0x0111:
            X.01m r0 = r13.A0A
            r0.A0J()
            return r2
        L_0x0117:
            if (r12 == 0) goto L_0x013a
            int r0 = r12.getDeviceId()
        L_0x011d:
            android.view.KeyCharacterMap r0 = android.view.KeyCharacterMap.load(r0)
            int r0 = r0.getKeyboardType()
            r1 = 0
            if (r0 == r3) goto L_0x0129
            r1 = 1
        L_0x0129:
            X.01m r0 = r13.A0A
            r0.setQwertyMode(r1)
            X.01m r0 = r13.A0A
            r0.A0J()
        L_0x0133:
            r13.A0D = r3
            r13.A0B = r2
            r11.A0b = r13
            return r3
        L_0x013a:
            r0 = -1
            goto L_0x011d
        L_0x013c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0U(android.view.KeyEvent, X.01l):boolean");
    }

    public View A0W(String str, Context context, AttributeSet attributeSet) {
        AnonymousClass028 r0 = this.A0c;
        if (r0 == null) {
            Context context2 = this.A0k;
            String string = context2.obtainStyledAttributes(C002501d.A09).getString(116);
            if (string == null) {
                r0 = new AnonymousClass028();
                this.A0c = r0;
            } else {
                try {
                    r0 = (AnonymousClass028) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    this.A0c = r0;
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to instantiate custom view inflater ");
                    sb.append(string);
                    sb.append(". Falling back to default.");
                    Log.i("AppCompatDelegate", sb.toString(), th);
                    r0 = new AnonymousClass028();
                    this.A0c = r0;
                }
            }
        }
        return r0.A02(str, context, attributeSet);
    }

    public AnonymousClass02B A0X(AnonymousClass02H r4) {
        AnonymousClass01D r0;
        if (r4 != null) {
            AnonymousClass02B r02 = this.A0D;
            if (r02 != null) {
                r02.A05();
            }
            AnonymousClass02I r2 = new AnonymousClass02I(this, r4);
            A0P(this);
            C003401n r03 = this.A09;
            if (r03 != null) {
                AnonymousClass02B A0C2 = r03.A0C(r2);
                this.A0D = A0C2;
                if (!(A0C2 == null || (r0 = this.A0l) == null)) {
                    r0.C82(A0C2);
                }
            }
            if (this.A0D == null) {
                this.A0D = A0o(r2);
            }
            A0t();
            return this.A0D;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void A0Y() {
        LayoutInflater from = LayoutInflater.from(this.A0k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else if (!(from.getFactory2() instanceof AnonymousClass01V)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public void A0Z() {
        if (this.A09 != null) {
            A0P(this);
            if (!this.A09.A04()) {
                this.A01 = (1 << 0) | this.A01;
                if (!this.A0M) {
                    this.A06.getDecorView().postOnAnimation(this.A0n);
                    this.A0M = true;
                }
            }
        }
    }

    public void A0a() {
        if (this.A0L && this.A0R) {
            A0P(this);
            C003401n r0 = this.A09;
            if (r0 != null) {
                r0.A0D();
            }
        }
        AnonymousClass01X A012 = AnonymousClass01X.A01();
        Context context = this.A0k;
        synchronized (A012) {
            AnonymousClass02D r1 = A012.A00;
            synchronized (r1) {
                C001100p r02 = (C001100p) r1.A06.get(context);
                if (r02 != null) {
                    r02.A07();
                }
            }
        }
        this.A0T = new Configuration(context.getResources().getConfiguration());
        A0Q(this, false, false);
    }

    public void A0c() {
        Object obj = this.A0m;
        boolean z = obj instanceof Activity;
        if (z) {
            synchronized (AnonymousClass013.A07) {
                AnonymousClass013.A06(this);
            }
        }
        if (this.A0M) {
            this.A06.getDecorView().removeCallbacks(this.A0n);
        }
        this.A0K = true;
        int i = this.A02;
        if (i == -100 || !z || !((Activity) obj).isChangingConfigurations()) {
            A0o.remove(obj.getClass().getName());
        } else {
            A0o.put(obj.getClass().getName(), Integer.valueOf(i));
        }
        C003401n r0 = this.A09;
        if (r0 != null) {
            r0.A02();
        }
        AnonymousClass01Y r02 = this.A0B;
        if (r02 != null) {
            r02.A02();
        }
        AnonymousClass01Y r03 = this.A0A;
        if (r03 != null) {
            r03.A02();
        }
    }

    public void A0d(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = AnonymousClass74N.A03;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (!this.A0S || i != 108) {
            if (this.A0L && i == 1) {
                this.A0L = false;
            } else if (i != 1) {
                if (i == 2) {
                    A0E();
                    this.A0i = true;
                    return;
                } else if (i == 5) {
                    A0E();
                    this.A0h = true;
                    return;
                } else if (i == 10) {
                    A0E();
                    this.A0Q = true;
                    return;
                } else if (i == 108) {
                    A0E();
                    this.A0L = true;
                    return;
                } else if (i != 109) {
                    this.A06.requestFeature(i);
                    return;
                } else {
                    A0E();
                    this.A0P = true;
                    return;
                }
            }
            A0E();
            this.A0S = true;
        }
    }

    public void A0i(Toolbar toolbar) {
        Object obj = this.A0m;
        if (obj instanceof Activity) {
            A0P(this);
            C003401n r2 = this.A09;
            if (!(r2 instanceof C003901s)) {
                this.A04 = null;
                if (r2 != null) {
                    r2.A02();
                }
                this.A09 = null;
                if (toolbar != null) {
                    AnonymousClass022 r0 = new AnonymousClass022(this.A0a, toolbar, ((Activity) obj).getTitle());
                    this.A09 = r0;
                    this.A0a.A00 = r0.A05;
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.A0a.A00 = null;
                }
                A0Z();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    public final void A0j(CharSequence charSequence) {
        this.A0H = charSequence;
        C002701f r0 = this.A0F;
        if (r0 != null) {
            r0.setWindowTitle(charSequence);
            return;
        }
        C003401n r02 = this.A09;
        if (r02 != null) {
            r02.A0T(charSequence);
            return;
        }
        TextView textView = this.A0X;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public int A0k(Context context, int i) {
        AnonymousClass01Y A0A2;
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (!(i == 1 || i == 2)) {
                        if (i == 3) {
                            A0A2 = this.A0A;
                            if (A0A2 == null) {
                                A0A2 = new AnonymousClass01Z(context, this);
                                this.A0A = A0A2;
                            }
                        } else {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                    }
                } else if (Build.VERSION.SDK_INT < 23 || ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    A0A2 = A0A(context);
                }
                return A0A2.A00();
            }
            return i;
        }
        return -1;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.01l[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.01l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.01l[]} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.01l, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C003201l A0m(int r5) {
        /*
            r4 = this;
            X.01l[] r3 = r4.A0j
            if (r3 == 0) goto L_0x0007
            int r0 = r3.length
            if (r0 > r5) goto L_0x0015
        L_0x0007:
            int r0 = r5 + 1
            X.01l[] r2 = new X.C003201l[r0]
            if (r3 == 0) goto L_0x0012
            int r1 = r3.length
            r0 = 0
            java.lang.System.arraycopy(r3, r0, r2, r0, r1)
        L_0x0012:
            r4.A0j = r2
            r3 = r2
        L_0x0015:
            r1 = r3[r5]
            if (r1 != 0) goto L_0x0025
            X.01l r1 = new X.01l
            r1.<init>()
            r1.A01 = r5
            r0 = 0
            r1.A0E = r0
            r3[r5] = r1
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0m(int):X.01l");
    }

    public C003201l A0n(Menu menu) {
        C003201l[] r4 = this.A0j;
        if (r4 == null) {
            return null;
        }
        for (C003201l r1 : r4) {
            if (r1 != null && r1.A0A == menu) {
                return r1;
            }
        }
        return null;
    }

    public AnonymousClass1HD A0p(Context context) {
        AnonymousClass1HD A012;
        AnonymousClass1HD A022;
        if (Build.VERSION.SDK_INT >= 33 || (A012 = AnonymousClass013.A01()) == null) {
            return null;
        }
        AnonymousClass1HD A0B2 = A0B(context.getApplicationContext().getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            A022 = AnonymousClass027.A01(A012, A0B2);
        } else if (A012.A07()) {
            A022 = AnonymousClass1HD.A00();
        } else {
            A022 = AnonymousClass1HD.A02(A012.A06(0).toString());
        }
        if (!A022.A07()) {
            return A022;
        }
        return A0B2;
    }

    public void A0q() {
        C002701f r0 = this.A0F;
        if (r0 != null) {
            r0.BIu();
        }
        if (this.A07 != null) {
            this.A06.getDecorView().removeCallbacks(this.A0I);
            if (this.A07.isShowing()) {
                try {
                    this.A07.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.A07 = null;
        }
        A0r();
        C003301m r02 = A0m(0).A0A;
        if (r02 != null) {
            r02.close();
        }
    }

    public void A0r() {
        AnonymousClass1HC r0 = this.A0G;
        if (r0 != null) {
            r0.A01();
        }
    }

    public void A0t() {
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.A08 == null || (!A0m(0).A0C && this.A0D == null)) {
            OnBackInvokedCallback onBackInvokedCallback = this.A0Y;
            if (onBackInvokedCallback != null) {
                AnonymousClass02E.A02(this.A08, onBackInvokedCallback);
            }
        } else if (this.A0Y == null) {
            this.A0Y = AnonymousClass02E.A01(this, this.A08);
        }
    }

    /* JADX INFO: finally extract failed */
    public void A0v(Menu menu, C003201l r6, int i) {
        if (menu == null) {
            menu = r6.A0A;
        }
        if (r6.A0C && !this.A0K) {
            C002301b r3 = this.A0a;
            Window.Callback callback = this.A06.getCallback();
            try {
                r3.A02 = true;
                callback.onPanelClosed(i, menu);
                r3.A02 = false;
            } catch (Throwable th) {
                r3.A02 = false;
                throw th;
            }
        }
    }

    public void A0w(C003201l r4, boolean z) {
        ViewGroup viewGroup;
        C002701f r0;
        if (!z || r4.A01 != 0 || (r0 = this.A0F) == null || !r0.Bfj()) {
            ViewManager viewManager = (ViewManager) this.A0k.getSystemService("window");
            if (!(viewManager == null || !r4.A0C || (viewGroup = r4.A08) == null)) {
                viewManager.removeView(viewGroup);
                if (z) {
                    A0v((Menu) null, r4, r4.A01);
                }
            }
            r4.A0D = false;
            r4.A0B = false;
            r4.A0C = false;
            r4.A07 = null;
            r4.A0E = true;
            if (this.A0b == r4) {
                this.A0b = null;
            }
            if (r4.A01 == 0) {
                A0t();
                return;
            }
            return;
        }
        A0x(r4.A0A);
    }

    public void A0x(C003301m r3) {
        if (!this.A0e) {
            this.A0e = true;
            this.A0F.BIu();
            Window.Callback callback = this.A06.getCallback();
            if (callback != null && !this.A0K) {
                callback.onPanelClosed(AnonymousClass74N.A03, r3);
            }
            this.A0e = false;
        }
    }

    public boolean A0y() {
        boolean z = this.A0O;
        this.A0O = false;
        C003201l A0m2 = A0m(0);
        if (A0m2.A0C) {
            if (!z) {
                A0w(A0m2, true);
            }
            return true;
        }
        AnonymousClass02B r0 = this.A0D;
        if (r0 != null) {
            r0.A05();
            return true;
        }
        A0P(this);
        C003401n r02 = this.A09;
        if (r02 == null || !r02.A0a()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A10(android.view.KeyEvent r6) {
        /*
            r5 = this;
            java.lang.Object r1 = r5.A0m
            boolean r0 = r1 instanceof X.AnonymousClass1FA
            r4 = 1
            if (r0 != 0) goto L_0x000b
            boolean r0 = r1 instanceof X.AnonymousClass02A
            if (r0 == 0) goto L_0x001a
        L_0x000b:
            android.view.Window r0 = r5.A06
            android.view.View r0 = r0.getDecorView()
            if (r0 == 0) goto L_0x001a
            boolean r0 = X.AnonymousClass1HJ.A01(r0, r6)
            if (r0 == 0) goto L_0x001a
            return r4
        L_0x001a:
            int r1 = r6.getKeyCode()
            r0 = 82
            if (r1 != r0) goto L_0x003a
            X.01b r2 = r5.A0a
            android.view.Window r0 = r5.A06
            android.view.Window$Callback r0 = r0.getCallback()
            r1 = 0
            r2.A01 = r4     // Catch:{ all -> 0x0036 }
            boolean r0 = r0.dispatchKeyEvent(r6)     // Catch:{ all -> 0x0036 }
            r2.A01 = r1
            if (r0 == 0) goto L_0x003a
            return r4
        L_0x0036:
            r0 = move-exception
            r2.A01 = r1
            throw r0
        L_0x003a:
            int r3 = r6.getKeyCode()
            int r1 = r6.getAction()
            r0 = 4
            if (r1 != 0) goto L_0x0060
            r2 = 1
            r1 = 0
            if (r3 == r0) goto L_0x00eb
            r0 = 82
            if (r3 != r0) goto L_0x00f6
            int r0 = r6.getRepeatCount()
            if (r0 != 0) goto L_0x005e
            X.01l r1 = r5.A0m(r1)
            boolean r0 = r1.A0C
            if (r0 != 0) goto L_0x005e
            r5.A0U(r6, r1)
        L_0x005e:
            r0 = 1
            return r0
        L_0x0060:
            r2 = 0
            if (r3 == r0) goto L_0x00e3
            r0 = 82
            if (r3 != r0) goto L_0x00f6
            X.02B r0 = r5.A0D
            if (r0 != 0) goto L_0x005e
            X.01l r3 = r5.A0m(r2)
            X.01f r0 = r5.A0F
            if (r0 == 0) goto L_0x00ba
            boolean r0 = r0.BEF()
            if (r0 == 0) goto L_0x00ba
            android.content.Context r0 = r5.A0k
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            boolean r0 = r0.hasPermanentMenuKey()
            if (r0 != 0) goto L_0x00ba
            X.01f r0 = r5.A0F
            boolean r0 = r0.Bfj()
            if (r0 != 0) goto L_0x00b3
            boolean r0 = r5.A0K
            if (r0 != 0) goto L_0x005e
            boolean r0 = r5.A0U(r6, r3)
            if (r0 == 0) goto L_0x005e
            X.01f r0 = r5.A0F
            boolean r1 = r0.CN0()
        L_0x009d:
            if (r1 == 0) goto L_0x005e
        L_0x009f:
            android.content.Context r0 = r5.A0k
            android.content.Context r1 = r0.getApplicationContext()
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            if (r0 == 0) goto L_0x00da
            r0.playSoundEffect(r2)
            goto L_0x005e
        L_0x00b3:
            X.01f r0 = r5.A0F
            boolean r1 = r0.Bcz()
            goto L_0x009d
        L_0x00ba:
            boolean r1 = r3.A0C
            if (r1 != 0) goto L_0x00d6
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x00d6
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x005e
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x00d2
            r3.A0D = r2
            boolean r0 = r5.A0U(r6, r3)
            if (r0 == 0) goto L_0x005e
        L_0x00d2:
            r5.A0L(r6, r3)
            goto L_0x009f
        L_0x00d6:
            r5.A0w(r3, r4)
            goto L_0x009d
        L_0x00da:
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "Couldn't get audio manager"
            android.util.Log.w(r1, r0)
            goto L_0x005e
        L_0x00e3:
            boolean r0 = r5.A0y()
            if (r0 == 0) goto L_0x00f6
            goto L_0x005e
        L_0x00eb:
            int r0 = r6.getFlags()
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x00f4
            r2 = 0
        L_0x00f4:
            r5.A0O = r2
        L_0x00f6:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A10(android.view.KeyEvent):boolean");
    }

    public boolean ByE(MenuItem menuItem, C003301m r4) {
        C003201l A0n2;
        Window.Callback callback = this.A06.getCallback();
        if (callback == null || this.A0K || (A0n2 = A0n(r4.A06())) == null) {
            return false;
        }
        return callback.onMenuItemSelected(A0n2.A01, menuItem);
    }

    public void ByF(C003301m r7) {
        C002701f r0 = this.A0F;
        if (r0 == null || !r0.BEF() || (ViewConfiguration.get(this.A0k).hasPermanentMenuKey() && !this.A0F.Bfi())) {
            C003201l A0m2 = A0m(0);
            A0m2.A0E = true;
            A0w(A0m2, false);
            A0L((KeyEvent) null, A0m2);
            return;
        }
        Window.Callback callback = this.A06.getCallback();
        if (this.A0F.Bfj()) {
            this.A0F.Bcz();
            if (!this.A0K) {
                callback.onPanelClosed(AnonymousClass74N.A03, A0m(0).A0A);
            }
        } else if (callback != null && !this.A0K) {
            if (this.A0M && (this.A01 & 1) != 0) {
                View decorView = this.A06.getDecorView();
                Runnable runnable = this.A0n;
                decorView.removeCallbacks(runnable);
                runnable.run();
            }
            C003201l A0m3 = A0m(0);
            C003301m r1 = A0m3.A0A;
            if (r1 != null && !A0m3.A0F && callback.onPreparePanel(0, A0m3.A06, r1)) {
                callback.onMenuOpened(AnonymousClass74N.A03, A0m3.A0A);
                this.A0F.CN0();
            }
        }
    }

    public AnonymousClass01V(Context context, Window window, AnonymousClass01D r6, Object obj) {
        this.A0k = context;
        this.A0l = r6;
        this.A0m = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AnonymousClass01E)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        AnonymousClass01E r4 = (AnonymousClass01E) context;
                        if (r4 != null) {
                            this.A02 = ((AnonymousClass01V) r4.A2n()).A02;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        if (this.A02 == -100) {
            AnonymousClass00O r2 = A0o;
            String name = obj.getClass().getName();
            Number number = (Number) r2.get(name);
            if (number != null) {
                this.A02 = number.intValue();
                r2.remove(name);
            }
        }
        if (window != null) {
            A0N(window);
        }
        AnonymousClass01X.A02();
    }

    public static String A0C(Locale locale) {
        return locale.toLanguageTag();
    }

    public static void A0I(Configuration configuration, Locale locale) {
        configuration.setLayoutDirection(locale);
    }

    public static void A0J(Configuration configuration, Locale locale) {
        configuration.setLocale(locale);
    }

    private void A0M(View view) {
        int windowSystemUiVisibility = view.getWindowSystemUiVisibility() & DefaultCrypto.BUFFER_SIZE;
        Context context = this.A0k;
        int i = 2131099653;
        if (windowSystemUiVisibility != 0) {
            i = 2131099654;
        }
        view.setBackgroundColor(C19740yt.A00(context, i));
    }

    public static void A0P(AnonymousClass01V r3) {
        C003901s r1;
        A0O(r3);
        if (r3.A0L && r3.A09 == null) {
            Object obj = r3.A0m;
            if (obj instanceof Activity) {
                r1 = new C003901s((Activity) obj, r3.A0P);
            } else if (obj instanceof Dialog) {
                r1 = new C003901s((Dialog) obj);
            } else {
                return;
            }
            r3.A09 = r1;
            r1.A0V(r3.A0g);
        }
    }

    public void A0e(int i) {
        A0O(this);
        ViewGroup viewGroup = (ViewGroup) this.A05.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.A0k).inflate(i, viewGroup);
        this.A0a.A00(this.A06.getCallback());
    }

    public void A0f(View view) {
        A0O(this);
        ViewGroup viewGroup = (ViewGroup) this.A05.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.A0a.A00(this.A06.getCallback());
    }

    public void A0g(View view, ViewGroup.LayoutParams layoutParams) {
        A0O(this);
        ((ViewGroup) this.A05.findViewById(16908290)).addView(view, layoutParams);
        this.A0a.A00(this.A06.getCallback());
    }

    public void A0h(View view, ViewGroup.LayoutParams layoutParams) {
        A0O(this);
        ViewGroup viewGroup = (ViewGroup) this.A05.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.A0a.A00(this.A06.getCallback());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cd, code lost:
        if (r1 == false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02B A0o(X.AnonymousClass02H r10) {
        /*
            r9 = this;
            r9.A0r()
            X.02B r0 = r9.A0D
            if (r0 == 0) goto L_0x000a
            r0.A05()
        L_0x000a:
            X.01D r2 = r9.A0l
            r3 = 0
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            r4 = 0
            r7 = 1
            if (r0 != 0) goto L_0x0093
            boolean r0 = r9.A0N
            if (r0 == 0) goto L_0x012f
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.Context r8 = r9.A0k
            android.content.res.Resources$Theme r5 = r8.getTheme()
            r0 = 2130968598(0x7f040016, float:1.7545854E38)
            r5.resolveAttribute(r0, r6, r7)
            int r0 = r6.resourceId
            if (r0 == 0) goto L_0x012c
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r1 = r0.newTheme()
            r1.setTo(r5)
            int r0 = r6.resourceId
            r1.applyStyle(r0, r7)
            X.01k r5 = new X.01k
            r5.<init>(r8, r4)
            android.content.res.Resources$Theme r0 = r5.getTheme()
            r0.setTo(r1)
        L_0x0048:
            androidx.appcompat.widget.ActionBarContextView r0 = new androidx.appcompat.widget.ActionBarContextView
            r0.<init>(r5, r3)
            r9.A0E = r0
            r0 = 2130968613(0x7f040025, float:1.7545885E38)
            android.widget.PopupWindow r1 = new android.widget.PopupWindow
            r1.<init>(r5, r3, r0)
            r9.A07 = r1
            r0 = 2
            X.AnonymousClass1HL.A00(r1, r0)
            android.widget.PopupWindow r1 = r9.A07
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            r1.setContentView(r0)
            android.widget.PopupWindow r1 = r9.A07
            r0 = -1
            r1.setWidth(r0)
            android.content.res.Resources$Theme r1 = r5.getTheme()
            r0 = 2130968592(0x7f040010, float:1.7545842E38)
            r1.resolveAttribute(r0, r6, r7)
            int r1 = r6.data
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = android.util.TypedValue.complexToDimensionPixelSize(r1, r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            r0.A00 = r1
            android.widget.PopupWindow r1 = r9.A07
            r0 = -2
            r1.setHeight(r0)
            X.02K r0 = new X.02K
            r0.<init>(r9)
            r9.A0I = r0
        L_0x0093:
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            if (r0 == 0) goto L_0x00fc
            r9.A0r()
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            r0.A05()
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            android.content.Context r5 = r0.getContext()
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            X.02L r1 = new X.02L
            r1.<init>(r5, r10, r0)
            X.01m r0 = r1.A02()
            boolean r0 = r10.BqR(r0, r1)
            if (r0 == 0) goto L_0x0129
            r1.A06()
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            r0.A07(r1)
            r9.A0D = r1
            boolean r0 = r9.A0R
            if (r0 == 0) goto L_0x00cf
            android.view.ViewGroup r0 = r9.A05
            if (r0 == 0) goto L_0x00cf
            boolean r1 = r0.isLaidOut()
            r0 = 1
            if (r1 != 0) goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.appcompat.widget.ActionBarContextView r1 = r9.A0E
            if (r0 == 0) goto L_0x010b
            r0 = 0
            r1.setAlpha(r0)
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            X.1HC r1 = X.AnonymousClass1HF.A0B(r0)
            r1.A03(r3)
            r9.A0G = r1
            X.02M r0 = new X.02M
            r0.<init>(r9)
            r1.A0B(r0)
        L_0x00ed:
            android.widget.PopupWindow r0 = r9.A07
            if (r0 == 0) goto L_0x00fc
            android.view.Window r0 = r9.A06
            android.view.View r1 = r0.getDecorView()
            java.lang.Runnable r0 = r9.A0I
            r1.post(r0)
        L_0x00fc:
            X.02B r0 = r9.A0D
            if (r0 == 0) goto L_0x0105
            if (r2 == 0) goto L_0x0105
            r2.C82(r0)
        L_0x0105:
            r9.A0t()
            X.02B r0 = r9.A0D
            return r0
        L_0x010b:
            r1.setAlpha(r3)
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            r0.setVisibility(r4)
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            android.view.ViewParent r0 = r0.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x00ed
            androidx.appcompat.widget.ActionBarContextView r0 = r9.A0E
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r0 = (android.view.View) r0
            X.AnonymousClass1HF.A0T(r0)
            goto L_0x00ed
        L_0x0129:
            r9.A0D = r3
            goto L_0x00fc
        L_0x012c:
            r5 = r8
            goto L_0x0048
        L_0x012f:
            android.view.ViewGroup r1 = r9.A05
            r0 = 2131427511(0x7f0b00b7, float:1.847664E38)
            android.view.View r1 = r1.findViewById(r0)
            androidx.appcompat.widget.ViewStubCompat r1 = (androidx.appcompat.widget.ViewStubCompat) r1
            if (r1 == 0) goto L_0x0093
            A0P(r9)
            X.01n r0 = r9.A09
            if (r0 == 0) goto L_0x0149
            android.content.Context r0 = r0.A0A()
            if (r0 != 0) goto L_0x014b
        L_0x0149:
            android.content.Context r0 = r9.A0k
        L_0x014b:
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r1.A00 = r0
            android.view.View r0 = r1.A00()
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r9.A0E = r0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01V.A0o(X.02H):X.02B");
    }

    public boolean A0z(int i, KeyEvent keyEvent) {
        C003301m r0;
        C003301m r02;
        A0P(this);
        C003401n r03 = this.A09;
        if (r03 == null || !r03.A0b(i, keyEvent)) {
            C003201l r2 = this.A0b;
            if (r2 != null) {
                int keyCode = keyEvent.getKeyCode();
                if (!keyEvent.isSystem() && ((r2.A0D || A0U(keyEvent, r2)) && (r02 = r2.A0A) != null && r02.performShortcut(keyCode, keyEvent, 1))) {
                    C003201l r04 = this.A0b;
                    if (r04 != null) {
                        r04.A0B = true;
                        return true;
                    }
                }
            }
            if (this.A0b == null) {
                C003201l A0m2 = A0m(0);
                A0U(keyEvent, A0m2);
                int keyCode2 = keyEvent.getKeyCode();
                boolean z = false;
                if (!keyEvent.isSystem() && ((A0m2.A0D || A0U(keyEvent, A0m2)) && (r0 = A0m2.A0A) != null)) {
                    z = r0.performShortcut(keyCode2, keyEvent, 1);
                }
                A0m2.A0D = false;
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return A0W(str, context, attributeSet);
    }
}
