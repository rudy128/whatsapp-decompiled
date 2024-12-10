package androidx.compose.ui.platform;

import X.A7Y;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass058;
import X.AnonymousClass05A;
import X.AnonymousClass05C;
import X.AnonymousClass05F;
import X.AnonymousClass05L;
import X.AnonymousClass08V;
import X.AnonymousClass0AG;
import X.AnonymousClass0CW;
import X.AnonymousClass0FC;
import X.AnonymousClass0FD;
import X.AnonymousClass0FF;
import X.AnonymousClass0FG;
import X.AnonymousClass0FI;
import X.AnonymousClass0HA;
import X.AnonymousClass0HC;
import X.AnonymousClass0HT;
import X.AnonymousClass0HV;
import X.AnonymousClass0I2;
import X.AnonymousClass0IU;
import X.AnonymousClass0IW;
import X.AnonymousClass0Ii;
import X.AnonymousClass0JJ;
import X.AnonymousClass0JL;
import X.AnonymousClass0KJ;
import X.AnonymousClass0LE;
import X.AnonymousClass0LM;
import X.AnonymousClass0LP;
import X.AnonymousClass0N0;
import X.AnonymousClass0NU;
import X.AnonymousClass0OF;
import X.AnonymousClass0PD;
import X.AnonymousClass0PW;
import X.AnonymousClass0Q9;
import X.AnonymousClass0QR;
import X.AnonymousClass0QV;
import X.AnonymousClass0QY;
import X.AnonymousClass0QZ;
import X.AnonymousClass0Qa;
import X.AnonymousClass0Qe;
import X.AnonymousClass0WC;
import X.AnonymousClass0WG;
import X.AnonymousClass0WH;
import X.AnonymousClass0WK;
import X.AnonymousClass0WO;
import X.AnonymousClass0XV;
import X.AnonymousClass0XW;
import X.AnonymousClass0Xk;
import X.AnonymousClass0Z3;
import X.AnonymousClass0Z4;
import X.AnonymousClass1F9;
import X.AnonymousClass1GE;
import X.AnonymousClass1HF;
import X.AnonymousClass1Y1;
import X.AnonymousClass3F6;
import X.C014308l;
import X.C015408x;
import X.C01840Ac;
import X.C03700Kb;
import X.C04340Mu;
import X.C04790Ov;
import X.C04800Ox;
import X.C04920Pn;
import X.C04950Pq;
import X.C04990Pv;
import X.C05040Qd;
import X.C05250Rk;
import X.C05260Rl;
import X.C05270Rm;
import X.C05870Wa;
import X.C05880Wb;
import X.C05900Wd;
import X.C05910We;
import X.C05930Wh;
import X.C06150Xd;
import X.C06160Xe;
import X.C06170Xf;
import X.C06180Xg;
import X.C06210Xj;
import X.C06260Xp;
import X.C06270Xq;
import X.C06290Xs;
import X.C06970a9;
import X.C07700du;
import X.C08270ep;
import X.C08280eq;
import X.C08350ex;
import X.C10020hf;
import X.C10030hg;
import X.C10880j3;
import X.C12320lZ;
import X.C12330la;
import X.C12630m4;
import X.C15770rB;
import X.C15800rE;
import X.C15810rF;
import X.C15840rI;
import X.C15870rL;
import X.C16300s2;
import X.C16320s4;
import X.C16390sB;
import X.C16500sM;
import X.C16510sN;
import X.C16690sq;
import X.C16710ss;
import X.C16750sx;
import X.C16880tN;
import X.C16950tU;
import X.C17090tj;
import X.C17140to;
import X.C17330uU;
import X.C17470ui;
import X.C18070vi;
import X.C18090vk;
import X.C18560wh;
import X.C22339B3q;
import X.C22821Di;
import X.C23381Fv;
import X.C24246By4;
import X.C25147CZy;
import X.C25290Ccs;
import X.C26599D5p;
import X.C27621Wu;
import X.C28644ECa;
import X.C30391dr;
import X.C78;
import X.C7A;
import X.D64;
import X.E07;
import X.E0B;
import X.E3V;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.ui.input.rotary.RotaryInputElement;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.text.font.AndroidFontLoader;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

public final class AndroidComposeView extends ViewGroup implements C17140to, AnonymousClass1GE, C16710ss, C15840rI {
    public static Class A1C;
    public static Method A1D;
    public long A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public long A06;
    public long A07 = AnonymousClass0QY.A02;
    public long A08;
    public MotionEvent A09;
    public AnonymousClass05F A0A;
    public AnonymousClass05C A0B;
    public Constraints A0C;
    public C28644ECa A0D;
    public List A0E;
    public C22821Di A0F;
    public C22821Di A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = true;
    public final AnonymousClass0HA A0N;
    public final C17470ui A0O;
    public final C05910We A0P;
    public final AnonymousClass0XV A0Q;
    public final AnonymousClass0PW A0R;
    public final C06150Xd A0S;
    public final C06180Xg A0T;
    public final C16500sM A0U;
    public final float[] A0V;
    public final float[] A0W;
    public final float[] A0X;
    public final ViewTreeObserver.OnGlobalLayoutListener A0Y;
    public final ViewTreeObserver.OnScrollChangedListener A0Z;
    public final ViewTreeObserver.OnTouchModeChangeListener A0a;
    public final C17330uU A0b;
    public final C17330uU A0c;
    public final C17330uU A0d;
    public final C16300s2 A0e;
    public final C06970a9 A0f;
    public final C17090tj A0g;
    public final C17090tj A0h;
    public final AnonymousClass0WG A0i;
    public final C16690sq A0j;
    public final AnonymousClass0HC A0k;
    public final C15800rE A0l;
    public final AnonymousClass0IW A0m;
    public final C16390sB A0n;
    public final AnonymousClass0IU A0o;
    public final AnonymousClass0N0 A0p;
    public final C05880Wb A0q = new C05880Wb((C05870Wa) null, (AnonymousClass1Y1) null, 1);
    public final AnonymousClass0Qe A0r;
    public final C15840rI A0s;
    public final AnonymousClass0Z4 A0t;
    public final AndroidComposeViewAccessibilityDelegateCompat A0u;
    public final AnonymousClass0WH A0v;
    public final C16750sx A0w;
    public final C16510sN A0x;
    public final C16880tN A0y;
    public final AnonymousClass0HV A0z;
    public final C06270Xq A10;
    public final EmptySemanticsElement A11;
    public final AnonymousClass0I2 A12;
    public final E07 A13;
    public final C25147CZy A14;
    public final D64 A15;
    public final Runnable A16;
    public final List A17;
    public final AtomicReference A18;
    public final C18560wh A19;
    public final C18090vk A1A;
    public final int[] A1B;

    public static final void A0K(AndroidComposeView androidComposeView) {
        androidComposeView.A0I = false;
        MotionEvent motionEvent = androidComposeView.A09;
        C18070vi.A0b(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            androidComposeView.A01(motionEvent);
            return;
        }
        throw AnonymousClass000.A0n("The ACTION_HOVER_EXIT event was not cleared.");
    }

    public static final /* synthetic */ void A0P(AndroidComposeView androidComposeView, C22821Di r2, long j) {
        androidComposeView.A0R(r2, j);
        throw null;
    }

    private final void A0R(C22821Di r7, long j) {
        Resources A0Y2 = AnonymousClass000.A0Y(this);
        new AnonymousClass058(C25290Ccs.A01(A0Y2.getDisplayMetrics().density, A0Y2.getConfiguration().fontScale), r7, (AnonymousClass1Y1) null, j);
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0FD.A00();
            throw null;
        }
        throw AnonymousClass000.A0s("getClipData");
    }

    public static final boolean A0S() {
        Boolean bool;
        Method method;
        try {
            Object obj = null;
            if (A1C == null) {
                Class<?> cls = Class.forName("android.os.SystemProperties");
                A1C = cls;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                } else {
                    method = null;
                }
                A1D = method;
            }
            Method method2 = A1D;
            if (method2 != null) {
                obj = method2.invoke((Object) null, new Object[]{"debug.layout", false});
            }
            if (!(obj instanceof Boolean) || (bool = (Boolean) obj) == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public final void A0Y() {
        this.A02 = true;
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void BrH(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public void C3P(AnonymousClass0XV r3, boolean z, boolean z2) {
        boolean A0F2;
        AnonymousClass0Qe r0 = this.A0r;
        if (z) {
            A0F2 = r0.A0D(r3, z2);
        } else {
            A0F2 = r0.A0F(r3, z2);
        }
        if (A0F2) {
            A0I((AnonymousClass0XV) null);
        }
    }

    public /* synthetic */ void C6E() {
    }

    public /* synthetic */ void C71(AnonymousClass1F9 r1) {
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return A05(this, i);
            }
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006c, code lost:
        if (r7.getSource() != r12.getSource()) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r7.getToolType(0) == r12.getToolType(0)) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007c, code lost:
        if (r7.getButtonState() != 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        r1 = r7.getActionMasked();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r1 == 0) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0085, code lost:
        if (r1 == 2) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        if (r1 == 6) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        if (r7.getActionMasked() == 10) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0092, code lost:
        if (r5 == false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0094, code lost:
        A0D(r7, 10, r7.getEventTime(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009c, code lost:
        r1 = r6.A0o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a0, code lost:
        if (r1.A00 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        r1.A02.A00.A07();
        r0 = r1.A01.A00;
        r0.A00();
        r0.A00.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b9, code lost:
        if (r12.getToolType(0) == 3) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00bb, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        if (r5 != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        if (r11 == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        if (r3 == 3) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c4, code lost:
        if (r3 == 9) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ca, code lost:
        if (A0U(r12) == false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cc, code lost:
        A0D(r12, 9, r12.getEventTime(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r7 == null) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00da, code lost:
        r7.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00dd, code lost:
        r6.A09 = android.view.MotionEvent.obtainNoHistory(r12);
        r0 = A01(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        android.os.Trace.endSection();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ea, code lost:
        r6.A0H = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ec, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005f, code lost:
        if (r7.getToolType(0) != 3) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0062, code lost:
        if (r7 != null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int A00(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            X.0Z4 r0 = r6.A0t
            r6.removeCallbacks(r0)
            r2 = 0
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()     // Catch:{ all -> 0x00f2 }
            r6.A00 = r0     // Catch:{ all -> 0x00f2 }
            X.0sM r0 = r6.A0U     // Catch:{ all -> 0x00f2 }
            float[] r5 = r6.A0W     // Catch:{ all -> 0x00f2 }
            r0.BDr(r6, r5)     // Catch:{ all -> 0x00f2 }
            float[] r0 = r6.A0X     // Catch:{ all -> 0x00f2 }
            X.AnonymousClass0FG.A00(r5, r0)     // Catch:{ all -> 0x00f2 }
            r12 = r18
            float r1 = r12.getX()     // Catch:{ all -> 0x00f2 }
            float r0 = r12.getY()     // Catch:{ all -> 0x00f2 }
            long r3 = X.AnonymousClass001.A0p(r1, r0)     // Catch:{ all -> 0x00f2 }
            long r0 = X.AnonymousClass0QY.A03     // Catch:{ all -> 0x00f2 }
            long r4 = X.C05040Qd.A00(r5, r3)     // Catch:{ all -> 0x00f2 }
            float r3 = r12.getRawX()     // Catch:{ all -> 0x00f2 }
            float r0 = X.AnonymousClass0QY.A01(r4)     // Catch:{ all -> 0x00f2 }
            float r3 = r3 - r0
            float r1 = r12.getRawY()     // Catch:{ all -> 0x00f2 }
            float r0 = X.AnonymousClass0QY.A02(r4)     // Catch:{ all -> 0x00f2 }
            float r1 = r1 - r0
            long r0 = X.AnonymousClass001.A0p(r3, r1)     // Catch:{ all -> 0x00f2 }
            r6.A01 = r0     // Catch:{ all -> 0x00f2 }
            r11 = 1
            r6.A0H = r11     // Catch:{ all -> 0x00f2 }
            r6.Bjc(r2)     // Catch:{ all -> 0x00f2 }
            java.lang.String r0 = "AndroidOwner:onTouch"
            android.os.Trace.beginSection(r0)     // Catch:{ all -> 0x00f2 }
            int r3 = r12.getActionMasked()     // Catch:{ all -> 0x00ed }
            android.view.MotionEvent r7 = r6.A09     // Catch:{ all -> 0x00ed }
            r4 = 3
            if (r7 == 0) goto L_0x0061
            int r0 = r7.getToolType(r2)     // Catch:{ all -> 0x00ed }
            r5 = 1
            if (r0 == r4) goto L_0x0064
        L_0x0061:
            r5 = 0
            if (r7 == 0) goto L_0x00b5
        L_0x0064:
            int r1 = r7.getSource()     // Catch:{ all -> 0x00ed }
            int r0 = r12.getSource()     // Catch:{ all -> 0x00ed }
            if (r1 != r0) goto L_0x0078
            int r1 = r7.getToolType(r2)     // Catch:{ all -> 0x00ed }
            int r0 = r12.getToolType(r2)     // Catch:{ all -> 0x00ed }
            if (r1 == r0) goto L_0x00b5
        L_0x0078:
            int r0 = r7.getButtonState()     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x009c
            int r1 = r7.getActionMasked()     // Catch:{ all -> 0x00ed }
            if (r1 == 0) goto L_0x009c
            r0 = 2
            if (r1 == r0) goto L_0x009c
            r0 = 6
            if (r1 == r0) goto L_0x009c
            int r0 = r7.getActionMasked()     // Catch:{ all -> 0x00ed }
            r8 = 10
            if (r0 == r8) goto L_0x00b5
            if (r5 == 0) goto L_0x00b5
            long r9 = r7.getEventTime()     // Catch:{ all -> 0x00ed }
            r6.A0D(r7, r8, r9, r11)     // Catch:{ all -> 0x00ed }
            goto L_0x00b5
        L_0x009c:
            X.0IU r1 = r6.A0o     // Catch:{ all -> 0x00ed }
            boolean r0 = r1.A00     // Catch:{ all -> 0x00ed }
            if (r0 != 0) goto L_0x00b5
            X.0HE r0 = r1.A02     // Catch:{ all -> 0x00ed }
            X.00p r0 = r0.A00     // Catch:{ all -> 0x00ed }
            r0.A07()     // Catch:{ all -> 0x00ed }
            X.0IE r0 = r1.A01     // Catch:{ all -> 0x00ed }
            X.0Kb r0 = r0.A00     // Catch:{ all -> 0x00ed }
            r0.A00()     // Catch:{ all -> 0x00ed }
            X.0a9 r0 = r0.A00     // Catch:{ all -> 0x00ed }
            r0.A08()     // Catch:{ all -> 0x00ed }
        L_0x00b5:
            int r0 = r12.getToolType(r2)     // Catch:{ all -> 0x00ed }
            if (r0 == r4) goto L_0x00bc
            r11 = 0
        L_0x00bc:
            if (r5 != 0) goto L_0x00d8
            if (r11 == 0) goto L_0x00d8
            if (r3 == r4) goto L_0x00d8
            r0 = 9
            if (r3 == r0) goto L_0x00d8
            boolean r0 = r6.A0U(r12)     // Catch:{ all -> 0x00ed }
            if (r0 == 0) goto L_0x00d8
            long r14 = r12.getEventTime()     // Catch:{ all -> 0x00ed }
            r13 = 9
            r16 = 1
            r11 = r6
            r11.A0D(r12, r13, r14, r16)     // Catch:{ all -> 0x00ed }
        L_0x00d8:
            if (r7 == 0) goto L_0x00dd
            r7.recycle()     // Catch:{ all -> 0x00ed }
        L_0x00dd:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtainNoHistory(r12)     // Catch:{ all -> 0x00ed }
            r6.A09 = r0     // Catch:{ all -> 0x00ed }
            int r0 = r6.A01(r12)     // Catch:{ all -> 0x00ed }
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f2 }
            r6.A0H = r2
            return r0
        L_0x00ed:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch:{ all -> 0x00f2 }
            throw r0     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            r0 = move-exception
            r6.A0H = r2
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A00(android.view.MotionEvent):int");
    }

    private final int A01(MotionEvent motionEvent) {
        Object obj;
        if (this.A0L) {
            this.A0L = false;
            C06270Xq.A01.setValue(new AnonymousClass0JL(motionEvent.getMetaState()));
        }
        AnonymousClass0IW r3 = this.A0m;
        AnonymousClass0HT A002 = r3.A00(motionEvent, this);
        if (A002 != null) {
            List list = A002.A01;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    obj = list.get(size);
                    if (!((AnonymousClass0KJ) obj).A09) {
                        if (i < 0) {
                            break;
                        }
                        size = i;
                    } else {
                        break;
                    }
                }
            }
            obj = null;
            AnonymousClass0KJ r1 = (AnonymousClass0KJ) obj;
            if (r1 != null) {
                this.A07 = r1.A04;
            }
            int A003 = this.A0o.A00(A002, this, A0U(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (A003 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                r3.A03.delete(pointerId);
                r3.A04.delete(pointerId);
            }
            return A003;
        }
        AnonymousClass0IU r12 = this.A0o;
        if (r12.A00) {
            return 0;
        }
        r12.A02.A00.A07();
        C03700Kb r0 = r12.A01.A00;
        r0.A00();
        r0.A00.A08();
        return 0;
    }

    private final View A05(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (C18070vi.A18(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View A052 = A05(viewGroup.getChildAt(i2), i);
                    if (A052 != null) {
                        return A052;
                    }
                }
            }
        }
        return null;
    }

    public static final C17090tj A06(C17090tj r1, C22821Di r2) {
        return r1.CP5(new RotaryInputElement(r2));
    }

    public static final C26599D5p A0A(Context context) {
        int i;
        if (Build.VERSION.SDK_INT >= 31) {
            i = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i = 0;
        }
        return new C26599D5p(i);
    }

    public static final FontFamilyResolverImpl A0B(Context context) {
        return new FontFamilyResolverImpl(new AndroidFontLoader(context), A0A(context));
    }

    /* access modifiers changed from: private */
    public final void A0C() {
        int[] iArr = this.A1B;
        getLocationOnScreen(iArr);
        long j = this.A06;
        int A0G2 = AnonymousClass000.A0G(j);
        int A0H2 = AnonymousClass000.A0H(j);
        boolean z = false;
        int i = iArr[0];
        if (!(A0G2 == i && A0H2 == iArr[1])) {
            this.A06 = C7A.A00(i, iArr[1]);
            if (!(A0G2 == Integer.MAX_VALUE || A0H2 == Integer.MAX_VALUE)) {
                this.A0Q.A0Q.A0G.A0d();
                z = true;
            }
        }
        AnonymousClass0Qe r2 = this.A0r;
        if (z) {
            C04340Mu r0 = r2.A05;
            AnonymousClass0XV r1 = r2.A04;
            C06970a9 r02 = r0.A01;
            r02.A08();
            r02.A0F(r1);
            r1.A0F = true;
        }
        r2.A05.A01();
    }

    /* access modifiers changed from: private */
    public final void A0D(MotionEvent motionEvent, int i, long j, boolean z) {
        int buttonState;
        long downTime;
        int i2;
        MotionEvent motionEvent2 = motionEvent;
        int actionMasked = motionEvent2.getActionMasked();
        int i3 = -1;
        int i4 = i;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent2.getActionIndex();
            }
        } else if (!(i4 == 9 || i4 == 10)) {
            i3 = 0;
        }
        int pointerCount = motionEvent2.getPointerCount() - (AnonymousClass000.A1Q(i3) ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerPropertiesArr[i5] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i6 = 0; i6 < pointerCount; i6++) {
                pointerCoordsArr[i6] = new MotionEvent.PointerCoords();
            }
            int i7 = 0;
            while (true) {
                if (i7 >= pointerCount) {
                    break;
                }
                if (i3 >= 0) {
                    i2 = 1;
                    if (i7 >= i3) {
                        int i8 = i2 + i7;
                        motionEvent2.getPointerProperties(i8, pointerPropertiesArr[i7]);
                        MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i7];
                        motionEvent2.getPointerCoords(i8, pointerCoords);
                        long A0p2 = AnonymousClass001.A0p(pointerCoords.x, pointerCoords.y);
                        long j2 = AnonymousClass0QY.A03;
                        long Bhv = Bhv(A0p2);
                        pointerCoords.x = AnonymousClass0QY.A01(Bhv);
                        pointerCoords.y = AnonymousClass0QY.A02(Bhv);
                        i7++;
                    }
                }
                i2 = 0;
                int i82 = i2 + i7;
                motionEvent2.getPointerProperties(i82, pointerPropertiesArr[i7]);
                MotionEvent.PointerCoords pointerCoords2 = pointerCoordsArr[i7];
                motionEvent2.getPointerCoords(i82, pointerCoords2);
                long A0p22 = AnonymousClass001.A0p(pointerCoords2.x, pointerCoords2.y);
                long j22 = AnonymousClass0QY.A03;
                long Bhv2 = Bhv(A0p22);
                pointerCoords2.x = AnonymousClass0QY.A01(Bhv2);
                pointerCoords2.y = AnonymousClass0QY.A02(Bhv2);
                i7++;
            }
            if (z) {
                buttonState = 0;
            } else {
                buttonState = motionEvent2.getButtonState();
            }
            long j3 = j;
            if (motionEvent2.getDownTime() == motionEvent2.getEventTime()) {
                downTime = j3;
            } else {
                downTime = motionEvent2.getDownTime();
            }
            MotionEvent obtain = MotionEvent.obtain(downTime, j3, i4, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent2.getMetaState(), buttonState, motionEvent2.getXPrecision(), motionEvent2.getYPrecision(), motionEvent2.getDeviceId(), motionEvent2.getEdgeFlags(), motionEvent2.getSource(), motionEvent2.getFlags());
            AnonymousClass0HT A002 = this.A0m.A00(obtain, this);
            C18070vi.A0b(A002);
            this.A0o.A00(A002, this, true);
            obtain.recycle();
        }
    }

    private final void A0H(AnonymousClass0XV r5) {
        int i = 0;
        this.A0r.A0G(r5, false);
        C06970a9 A0F2 = r5.A0F();
        int i2 = A0F2.A00;
        if (i2 > 0) {
            Object[] objArr = A0F2.A01;
            do {
                A0H((AnonymousClass0XV) objArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public static final void A0J(AndroidComposeView androidComposeView) {
        if (!androidComposeView.A0H) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != androidComposeView.A00) {
                androidComposeView.A00 = currentAnimationTimeMillis;
                C16500sM r0 = androidComposeView.A0U;
                float[] fArr = androidComposeView.A0W;
                r0.BDr(androidComposeView, fArr);
                AnonymousClass0FG.A00(fArr, androidComposeView.A0X);
                ViewParent parent = androidComposeView.getParent();
                View view = androidComposeView;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = view.getParent();
                }
                int[] iArr = androidComposeView.A1B;
                view.getLocationOnScreen(iArr);
                float f = (float) iArr[0];
                float f2 = (float) iArr[1];
                view.getLocationInWindow(iArr);
                long A0p2 = AnonymousClass001.A0p(f - ((float) iArr[0]), f2 - ((float) iArr[1]));
                long j = AnonymousClass0QY.A03;
                androidComposeView.A01 = A0p2;
            }
        }
    }

    public static /* synthetic */ void A0Q(AndroidComposeView androidComposeView, boolean z) {
        C05910We r0 = androidComposeView.A0P;
        int i = 2;
        if (z) {
            i = 1;
        }
        r0.A00.setValue(new AnonymousClass0JJ(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:141:0x009a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A0T(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r2 = r18
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r0)
            r0 = 26
            r3 = r19
            float r0 = r3.getAxisValue(r0)
            float r14 = -r0
            android.content.Context r0 = r2.getContext()
            float r0 = X.C28971bN.A01(r0, r1)
            float r13 = r14 * r0
            android.content.Context r0 = r2.getContext()
            float r0 = X.C28971bN.A00(r0, r1)
            float r14 = r14 * r0
            long r16 = r3.getEventTime()
            int r15 = r3.getDeviceId()
            X.0K5 r12 = new X.0K5
            r12.<init>(r13, r14, r15, r16)
            X.0ui r0 = r2.A0O
            X.0WK r0 = (X.AnonymousClass0WK) r0
            X.08x r0 = r0.A01
            X.08x r2 = X.C04800Ox.A00(r0)
            java.lang.String r10 = "visitAncestors called on an unattached node"
            r7 = 16384(0x4000, float:2.2959E-41)
            r6 = 0
            r5 = 1
            if (r2 == 0) goto L_0x01d7
            X.0XW r1 = r2.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x01d2
            X.0XW r9 = r1.A04
            X.0XV r8 = X.AnonymousClass0QV.A03(r2)
            if (r8 == 0) goto L_0x00ac
        L_0x0053:
            int r0 = X.AnonymousClass0QR.A01(r8, r7)
            if (r0 == 0) goto L_0x009d
        L_0x0059:
            if (r9 == 0) goto L_0x009d
            int r0 = r9.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x009a
            r4 = r6
            r3 = r9
        L_0x0062:
            boolean r0 = r3 instanceof X.C17590uu
            if (r0 != 0) goto L_0x00ad
            int r0 = r3.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0093
            boolean r0 = r3 instanceof X.C014308l
            if (r0 == 0) goto L_0x0093
            r0 = r3
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0075:
            if (r2 == 0) goto L_0x0090
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0081
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0084
            r3 = r2
        L_0x0081:
            X.0XW r2 = r2.A02
            goto L_0x0075
        L_0x0084:
            X.0a9 r4 = X.AnonymousClass001.A10(r4)
            X.0XW r3 = X.AnonymousClass000.A0d(r4, r3)
            r4.A0F(r2)
            goto L_0x0081
        L_0x0090:
            if (r1 != r5) goto L_0x0093
            goto L_0x0097
        L_0x0093:
            X.0XW r3 = X.AnonymousClass0QV.A00(r4)
        L_0x0097:
            if (r3 == 0) goto L_0x009a
            goto L_0x0062
        L_0x009a:
            X.0XW r9 = r9.A04
            goto L_0x0059
        L_0x009d:
            X.0XV r8 = r8.A0I()
            if (r8 == 0) goto L_0x00ac
            X.0QR r0 = r8.A0S
            if (r0 == 0) goto L_0x00aa
            X.0XW r9 = r0.A05
            goto L_0x0053
        L_0x00aa:
            r9 = r6
            goto L_0x0053
        L_0x00ac:
            r3 = r6
        L_0x00ad:
            X.0uu r3 = (X.C17590uu) r3
            if (r3 == 0) goto L_0x01d7
            r9 = r3
            X.0XW r9 = (X.AnonymousClass0XW) r9
            X.0XW r1 = r9.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x01cd
            X.0XW r11 = r1.A04
            X.0XV r10 = X.AnonymousClass0QV.A03(r3)
            r4 = r6
            if (r10 == 0) goto L_0x0136
        L_0x00c3:
            int r0 = X.AnonymousClass0QR.A01(r10, r7)
            if (r0 == 0) goto L_0x0116
        L_0x00c9:
            if (r11 == 0) goto L_0x0116
            int r0 = r11.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0113
            r8 = r11
            r3 = r6
        L_0x00d2:
            boolean r0 = r8 instanceof X.C17590uu
            if (r0 == 0) goto L_0x00e6
            if (r4 != 0) goto L_0x00dc
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
        L_0x00dc:
            r4.add(r8)
        L_0x00df:
            X.0XW r8 = X.AnonymousClass0QV.A00(r3)
        L_0x00e3:
            if (r8 == 0) goto L_0x0113
            goto L_0x00d2
        L_0x00e6:
            int r0 = r8.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x00df
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x00df
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x00f5:
            if (r2 == 0) goto L_0x0110
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x0101
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x0104
            r8 = r2
        L_0x0101:
            X.0XW r2 = r2.A02
            goto L_0x00f5
        L_0x0104:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r8 = X.AnonymousClass000.A0d(r3, r8)
            r3.A0F(r2)
            goto L_0x0101
        L_0x0110:
            if (r1 != r5) goto L_0x00df
            goto L_0x00e3
        L_0x0113:
            X.0XW r11 = r11.A04
            goto L_0x00c9
        L_0x0116:
            X.0XV r10 = r10.A0I()
            if (r10 == 0) goto L_0x0125
            X.0QR r0 = r10.A0S
            if (r0 == 0) goto L_0x0123
            X.0XW r11 = r0.A05
            goto L_0x00c3
        L_0x0123:
            r11 = r6
            goto L_0x00c3
        L_0x0125:
            if (r4 == 0) goto L_0x0136
            int r1 = X.AnonymousClass000.A0Q(r4)
            if (r1 < 0) goto L_0x0136
        L_0x012d:
            int r0 = r1 + -1
            r4.get(r1)
            if (r0 < 0) goto L_0x0136
            r1 = r0
            goto L_0x012d
        L_0x0136:
            X.0XW r8 = r9.A03
            r3 = r6
        L_0x0139:
            if (r8 == 0) goto L_0x0171
            boolean r0 = r8 instanceof X.C17590uu
            if (r0 != 0) goto L_0x016c
            int r0 = r8.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x016c
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x016c
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x014e:
            if (r2 == 0) goto L_0x0169
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x015a
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x015d
            r8 = r2
        L_0x015a:
            X.0XW r2 = r2.A02
            goto L_0x014e
        L_0x015d:
            X.0a9 r3 = X.AnonymousClass001.A10(r3)
            X.0XW r8 = X.AnonymousClass000.A0d(r3, r8)
            r3.A0F(r2)
            goto L_0x015a
        L_0x0169:
            if (r1 != r5) goto L_0x016c
            goto L_0x0139
        L_0x016c:
            X.0XW r8 = X.AnonymousClass0QV.A00(r3)
            goto L_0x0139
        L_0x0171:
            X.0XW r3 = r9.A03
        L_0x0173:
            if (r3 == 0) goto L_0x01b5
            boolean r0 = r3 instanceof X.C17590uu
            if (r0 == 0) goto L_0x0183
            X.0uu r3 = (X.C17590uu) r3
            boolean r0 = r3.C4A(r12)
            if (r0 == 0) goto L_0x01b0
        L_0x0181:
            r0 = 1
            return r0
        L_0x0183:
            int r0 = r3.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x01b0
            boolean r0 = r3 instanceof X.C014308l
            if (r0 == 0) goto L_0x01b0
            r0 = r3
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0192:
            if (r2 == 0) goto L_0x01ad
            int r0 = r2.A01
            r0 = r0 & r7
            if (r0 == 0) goto L_0x019e
            int r1 = r1 + 1
            if (r1 != r5) goto L_0x01a1
            r3 = r2
        L_0x019e:
            X.0XW r2 = r2.A02
            goto L_0x0192
        L_0x01a1:
            X.0a9 r6 = X.AnonymousClass001.A10(r6)
            X.0XW r3 = X.AnonymousClass000.A0d(r6, r3)
            r6.A0F(r2)
            goto L_0x019e
        L_0x01ad:
            if (r1 != r5) goto L_0x01b0
            goto L_0x0173
        L_0x01b0:
            X.0XW r3 = X.AnonymousClass0QV.A00(r6)
            goto L_0x0173
        L_0x01b5:
            if (r4 == 0) goto L_0x01d7
            int r2 = r4.size()
            r1 = 0
        L_0x01bc:
            if (r1 >= r2) goto L_0x01d7
            java.lang.Object r0 = r4.get(r1)
            X.0uu r0 = (X.C17590uu) r0
            boolean r0 = r0.C4A(r12)
            if (r0 != 0) goto L_0x0181
            int r1 = r1 + 1
            goto L_0x01bc
        L_0x01cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r10)
            throw r0
        L_0x01d2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r10)
            throw r0
        L_0x01d7:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0T(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: private */
    public final AnonymousClass0Ii get_viewTreeOwners() {
        return (AnonymousClass0Ii) this.A0b.getValue();
    }

    private void setFontFamilyResolver(E3V e3v) {
        this.A0c.setValue(e3v);
    }

    private void setLayoutDirection(C24246By4 by4) {
        this.A0d.setValue(by4);
    }

    private final void set_viewTreeOwners(AnonymousClass0Ii r2) {
        this.A0b.setValue(r2);
    }

    public final Object A0X(C30391dr r3) {
        Object A1d = this.A0u.A1d(r3);
        if (A1d != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return A1d;
    }

    public final void A0Z(C16950tU r2, boolean z) {
        List list;
        boolean z2 = this.A0J;
        if (z) {
            if (!z2) {
                list = this.A17;
            } else {
                list = this.A0E;
                if (list == null) {
                    list = AnonymousClass000.A13();
                    this.A0E = list;
                }
            }
            list.add(r2);
        } else if (!z2) {
            this.A17.remove(r2);
            List list2 = this.A0E;
            if (list2 != null) {
                list2.remove(r2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        if (r0.A00 < 10) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0a(X.C16950tU r6) {
        /*
            r5 = this;
            X.05C r0 = r5.A0B
            if (r0 == 0) goto L_0x0025
            boolean r0 = X.AnonymousClass05A.A0I
            if (r0 != 0) goto L_0x0025
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0025
            X.0HV r2 = r5.A0z
        L_0x0010:
            java.lang.ref.ReferenceQueue r0 = r2.A01
            java.lang.ref.Reference r1 = r0.poll()
            X.0a9 r0 = r2.A00
            if (r1 == 0) goto L_0x001e
            r0.A0H(r1)
            goto L_0x0010
        L_0x001e:
            int r1 = r0.A00
            r0 = 10
            r4 = 0
            if (r1 >= r0) goto L_0x0040
        L_0x0025:
            r4 = 1
            X.0HV r3 = r5.A0z
        L_0x0028:
            java.lang.ref.ReferenceQueue r2 = r3.A01
            java.lang.ref.Reference r1 = r2.poll()
            if (r1 == 0) goto L_0x0036
            X.0a9 r0 = r3.A00
            r0.A0H(r1)
            goto L_0x0028
        L_0x0036:
            X.0a9 r1 = r3.A00
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r6, r2)
            r1.A0F(r0)
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0a(X.0tU):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.05C, android.view.View] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C16950tU BHU(X.C18090vk r4, X.C22821Di r5) {
        /*
            r3 = this;
            X.0HV r2 = r3.A0z
        L_0x0002:
            java.lang.ref.ReferenceQueue r0 = r2.A01
            java.lang.ref.Reference r1 = r0.poll()
            if (r1 == 0) goto L_0x0010
            X.0a9 r0 = r2.A00
            r0.A0H(r1)
            goto L_0x0002
        L_0x0010:
            X.0a9 r1 = r2.A00
            int r0 = r1.A00
            if (r0 == 0) goto L_0x002c
            int r0 = r0 + -1
            java.lang.Object r0 = r1.A06(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            java.lang.Object r1 = r0.get()
            if (r1 == 0) goto L_0x0010
        L_0x0024:
            X.0tU r1 = (X.C16950tU) r1
            if (r1 == 0) goto L_0x002e
            r1.CG5(r4, r5)
            return r1
        L_0x002c:
            r1 = 0
            goto L_0x0024
        L_0x002e:
            boolean r0 = r3.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0047
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x0047
            boolean r0 = r3.A0K
            if (r0 == 0) goto L_0x0047
            X.0XZ r1 = new X.0XZ     // Catch:{ all -> 0x0044 }
            r1.<init>(r3, r4, r5)     // Catch:{ all -> 0x0044 }
            return r1
        L_0x0044:
            r0 = 0
            r3.A0K = r0
        L_0x0047:
            X.05C r0 = r3.A0B
            if (r0 != 0) goto L_0x007d
            X.0Hx r2 = X.AnonymousClass05A.A0K
            boolean r0 = X.AnonymousClass05A.A0H
            if (r0 != 0) goto L_0x005d
            android.content.Context r1 = r3.getContext()
            android.view.View r0 = new android.view.View
            r0.<init>(r1)
            r2.A00(r0)
        L_0x005d:
            boolean r1 = X.AnonymousClass05A.A0I
            android.content.Context r0 = r3.getContext()
            if (r1 == 0) goto L_0x008a
            X.05C r2 = new X.05C
            r2.<init>(r0)
            r0 = 0
            r2.setClipChildren(r0)
            r1 = 2131431452(0x7f0b101c, float:1.8484634E38)
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r2.setTag(r1, r0)
        L_0x0078:
            r3.A0B = r2
            r3.addView(r2)
        L_0x007d:
            boolean r0 = X.AnonymousClass05A.A0H
            X.05C r0 = r3.A0B
            X.C18070vi.A0b(r0)
            X.05A r1 = new X.05A
            r1.<init>(r3, r0, r4, r5)
            return r1
        L_0x008a:
            X.0BY r2 = new X.0BY
            r2.<init>(r0)
            r0 = 0
            r2.setClipChildren(r0)
            r1 = 2131431452(0x7f0b101c, float:1.8484634E38)
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()
            r2.setTag(r1, r0)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.BHU(X.0vk, X.1Di):X.0tU");
    }

    public void BLW(AnonymousClass0XV r2, boolean z) {
        this.A0r.A0C(r2, z);
    }

    public void Bjc(boolean z) {
        AnonymousClass0Qe r1 = this.A0r;
        if ((!r1.A03.A02()) || r1.A05.A01.A00 != 0) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            C18090vk r0 = null;
            if (z) {
                try {
                    r0 = this.A1A;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            }
            if (r1.A0H(r0)) {
                requestLayout();
            }
            r1.A05.A01();
            Trace.endSection();
        }
    }

    public void Bjd(AnonymousClass0XV r3, long j) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            AnonymousClass0Qe r1 = this.A0r;
            r1.A0B(r3, j);
            if (!(!r1.A03.A02())) {
                r1.A05.A01();
            }
        } finally {
            Trace.endSection();
        }
    }

    public void BrK(AnonymousClass0XV r2) {
        this.A0r.A03.A00(r2);
        this.A02 = true;
    }

    public void Bsd() {
        if (this.A02) {
            this.A0R.A03();
            this.A02 = false;
        }
        AnonymousClass05F r0 = this.A0A;
        if (r0 != null) {
            A0F(r0);
        }
        while (true) {
            C06970a9 r5 = this.A0f;
            int i = r5.A00;
            if (i != 0) {
                for (int i2 = 0; i2 < i; i2++) {
                    Object[] objArr = r5.A01;
                    C18090vk r1 = (C18090vk) objArr[i2];
                    objArr[i2] = null;
                    if (r1 != null) {
                        r1.invoke();
                    }
                }
                r5.A0A(0, i);
            } else {
                return;
            }
        }
    }

    public void BwZ(AnonymousClass0XV r2) {
        this.A0u.A1k(r2);
    }

    public void C3N(AnonymousClass0XV r2, boolean z, boolean z2, boolean z3) {
        boolean A0G2;
        AnonymousClass0Qe r0 = this.A0r;
        if (z) {
            A0G2 = r0.A0E(r2, z2);
        } else {
            A0G2 = r0.A0G(r2, z2);
        }
        if (A0G2 && z3) {
            A0I(r2);
        }
    }

    public void C51() {
        this.A0u.A1g();
    }

    public void CE2(C18090vk r3) {
        C06970a9 r1 = this.A0f;
        if (!r1.A0G(r3)) {
            r1.A0F(r3);
        }
    }

    public void CFX(AnonymousClass0XV r2) {
        this.A0r.A05.A01.A0F(r2);
        r2.A0F = true;
        A0I((AnonymousClass0XV) null);
    }

    public void autofill(SparseArray sparseArray) {
        AnonymousClass0WG r0;
        if (Build.VERSION.SDK_INT >= 26 && (r0 = this.A0i) != null) {
            AnonymousClass0LE.A00(sparseArray, r0);
        }
    }

    public boolean canScrollHorizontally(int i) {
        return this.A0u.A1o(i, this.A07, false);
    }

    public boolean canScrollVertically(int i) {
        return this.A0u.A1o(i, this.A07, true);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            Runnable runnable = this.A16;
            removeCallbacks(runnable);
            runnable.run();
        }
        if (!A0W(motionEvent) && isAttachedToWindow()) {
            this.A0u.A1j(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && A0U(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.A09;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.A09 = MotionEvent.obtainNoHistory(motionEvent);
                        this.A0I = true;
                        post(this.A16);
                        return false;
                    }
                }
            } else if (!A0V(motionEvent)) {
                return false;
            }
            if ((A00(motionEvent) & 1) == 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r8v27, types: [X.06y, X.0KZ] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0095, code lost:
        if ((X.AnonymousClass000.A0U(r19) & -9187201950435737472L) == 0) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0097, code lost:
        r13 = X.AnonymousClass06y.A00(r8, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a1, code lost:
        if (r8.A00 != 0) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ab, code lost:
        if (X.AnonymousClass001.A0x(r7, r13) == 254) goto L_0x0122;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ad, code lost:
        r0 = X.AnonymousClass0GO.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b0, code lost:
        if (r12 == 0) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        r1 = (r12 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b6, code lost:
        r24 = r8.A02;
        X.AnonymousClass06y.A01(r8, r1);
        r23 = r8.A02;
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        if (r15 >= r12) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00cc, code lost:
        if (X.AnonymousClass001.A0x(r7, r15) >= 128) goto L_0x0112;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ce, code lost:
        r21 = r24[r15];
        r1 = X.AnonymousClass001.A0E(X.AnonymousClass000.A0I(r21));
        r14 = X.AnonymousClass06y.A00(r8, r1 >>> 7);
        r1 = (long) (r1 & com.facebook.common.dextricks.StringTreeSet.OFFSET_BASE_ENCODING);
        r13 = r8.A03;
        r20 = r14 >> 3;
        r0 = (r14 & 7) << 3;
        r13[r20] = (r13[r20] & ((255 << r0) ^ -1)) | (r1 << r0);
        r0 = X.AnonymousClass000.A0E(r14, r8.A00);
        r20 = r0 >> 3;
        r0 = (r0 & 7) << 3;
        r13[r20] = (r13[r20] & ((255 << r0) ^ -1)) | (r1 << r0);
        r23[r14] = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0112, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x011c, code lost:
        r13 = X.AnonymousClass06y.A00(r8, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0122, code lost:
        r8.A01++;
        r7 = r8.A00;
        r12 = r8.A03;
        r19 = r13 >> 3;
        r17 = r12[r19];
        r16 = (r13 & 7) << 3;
        r8.A00 = r7 - X.AnonymousClass000.A1P((((r17 >> r16) & 255) > 128 ? 1 : (((r17 >> r16) & 255) == 128 ? 0 : -1)));
        r12[r19] = (r17 & ((255 << r16) ^ -1)) | (r5 << r16);
        r0 = X.AnonymousClass000.A0E(r13, r8.A00);
        r7 = r0 >> 3;
        r2 = (r0 & 7) << 3;
        r12[r7] = (r5 << r2) | (((255 << r2) ^ -1) & r12[r7]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0223, code lost:
        if ((X.AnonymousClass000.A0U(r20) & -9187201950435737472L) != 0) goto L_0x01ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0250, code lost:
        if (r6 != null) goto L_0x0252;
     */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x02f8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:265:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchKeyEvent(android.view.KeyEvent r32) {
        /*
            r31 = this;
            r30 = r31
            boolean r0 = r30.isFocused()
            r11 = r32
            if (r0 == 0) goto L_0x03e4
            int r2 = r11.getMetaState()
            X.0uU r1 = X.C06270Xq.A01
            X.0JL r0 = new X.0JL
            r0.<init>(r2)
            r1.setValue(r0)
            r0 = r30
            X.0ui r10 = r0.A0O
            X.0WK r10 = (X.AnonymousClass0WK) r10
            int r0 = r11.getKeyCode()
            long r3 = (long) r0
            r2 = 32
            long r3 = r3 << r2
            int r1 = X.C02580Eo.A00(r11)
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r1, r0)
            r9 = 1
            if (r0 == 0) goto L_0x016e
            X.06y r8 = r10.A00
            if (r8 != 0) goto L_0x0043
            X.06y r8 = new X.06y
            r8.<init>()
            X.070 r0 = X.AnonymousClass0GO.A01
            r0 = 3
            X.AnonymousClass06y.A01(r8, r0)
            r10.A00 = r8
        L_0x0043:
            long r5 = r3 >>> r2
            long r0 = r3 ^ r5
            int r2 = (int) r0
            int r0 = X.AnonymousClass001.A0E(r2)
            int r29 = r0 >>> 7
            r22 = r0 & 127(0x7f, float:1.78E-43)
            int r12 = r8.A00
            r2 = r29 & r12
            r21 = 0
        L_0x0056:
            long[] r7 = r8.A03
            long r19 = X.AnonymousClass002.A01(r7, r2)
            r0 = r22
            long r5 = (long) r0
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r5 * r15
            long r0 = r0 ^ r19
            long r13 = r0 - r15
            r27 = -1
            long r0 = r0 ^ r27
            long r0 = r0 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r17
        L_0x0076:
            r15 = 0
            int r13 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x008d
            int r13 = X.AnonymousClass001.A0H(r2, r12, r0)
            long[] r14 = r8.A02
            r15 = r14[r13]
            int r14 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r14 == 0) goto L_0x0168
            long r0 = X.AnonymousClass000.A0T(r0)
            goto L_0x0076
        L_0x008d:
            long r13 = X.AnonymousClass000.A0U(r19)
            long r13 = r13 & r17
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0115
            r0 = r29
            int r13 = X.AnonymousClass06y.A00(r8, r0)
            int r0 = r8.A00
            r25 = 255(0xff, double:1.26E-321)
            if (r0 != 0) goto L_0x0122
            long r14 = X.AnonymousClass001.A0x(r7, r13)
            r1 = 254(0xfe, double:1.255E-321)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0122
            X.070 r0 = X.AnonymousClass0GO.A01
            r1 = 6
            if (r12 == 0) goto L_0x00b6
            int r0 = r12 * 2
            int r1 = r0 + 1
        L_0x00b6:
            long[] r0 = r8.A02
            r24 = r0
            X.AnonymousClass06y.A01(r8, r1)
            long[] r0 = r8.A02
            r23 = r0
            r15 = 0
        L_0x00c2:
            if (r15 >= r12) goto L_0x011c
            long r13 = X.AnonymousClass001.A0x(r7, r15)
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0112
            r21 = r24[r15]
            int r0 = X.AnonymousClass000.A0I(r21)
            int r1 = X.AnonymousClass001.A0E(r0)
            int r0 = r1 >>> 7
            int r14 = X.AnonymousClass06y.A00(r8, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r1 = (long) r0
            long[] r13 = r8.A03
            int r20 = r14 >> 3
            r0 = r14 & 7
            int r0 = r0 << 3
            r18 = r13[r20]
            long r16 = r25 << r0
            long r16 = r16 ^ r27
            long r18 = r18 & r16
            long r16 = r1 << r0
            long r18 = r18 | r16
            r13[r20] = r18
            int r0 = r8.A00
            int r0 = X.AnonymousClass000.A0E(r14, r0)
            int r20 = r0 >> 3
            r0 = r0 & 7
            int r0 = r0 << 3
            r18 = r13[r20]
            long r16 = r25 << r0
            long r16 = r16 ^ r27
            long r18 = r18 & r16
            long r1 = r1 << r0
            long r18 = r18 | r1
            r13[r20] = r18
            r23[r14] = r21
        L_0x0112:
            int r15 = r15 + 1
            goto L_0x00c2
        L_0x0115:
            int r21 = r21 + 8
            int r2 = r2 + r21
            r2 = r2 & r12
            goto L_0x0056
        L_0x011c:
            r0 = r29
            int r13 = X.AnonymousClass06y.A00(r8, r0)
        L_0x0122:
            int r0 = r8.A01
            int r0 = r0 + 1
            r8.A01 = r0
            int r7 = r8.A00
            long[] r12 = r8.A03
            int r19 = r13 >> 3
            r17 = r12[r19]
            r0 = r13 & 7
            int r16 = r0 << 3
            long r14 = r17 >> r16
            long r14 = r14 & r25
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            int r7 = r7 - r0
            r8.A00 = r7
            long r0 = r25 << r16
            long r0 = r0 ^ r27
            long r17 = r17 & r0
            long r0 = r5 << r16
            long r17 = r17 | r0
            r12[r19] = r17
            int r0 = r8.A00
            int r0 = X.AnonymousClass000.A0E(r13, r0)
            int r7 = r0 >> 3
            r0 = r0 & 7
            int r2 = r0 << 3
            r0 = r12[r7]
            long r25 = r25 << r2
            long r25 = r25 ^ r27
            long r25 = r25 & r0
            long r5 = r5 << r2
            long r5 = r5 | r25
            r12[r7] = r5
        L_0x0168:
            long[] r0 = r8.A02
            r0[r13] = r3
            goto L_0x01ed
        L_0x016e:
            if (r1 != r9) goto L_0x01ed
            X.06y r6 = r10.A00
            if (r6 == 0) goto L_0x033a
            boolean r0 = r6.A03(r3)
            if (r0 != r9) goto L_0x033a
            long r7 = r3 >>> r2
            long r0 = r3 ^ r7
            int r2 = (int) r0
            int r0 = X.AnonymousClass001.A0E(r2)
            r12 = r0 & 127(0x7f, float:1.78E-43)
            int r8 = r6.A00
            int r7 = r0 >>> 7
            r7 = r7 & r8
            r22 = 0
        L_0x018c:
            long[] r5 = r6.A03
            long r20 = X.AnonymousClass002.A01(r5, r7)
            long r0 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r0 = r0 * r15
            long r0 = r0 ^ r20
            long r13 = r0 - r15
            r18 = -1
            long r0 = r0 ^ r18
            long r0 = r0 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r16
        L_0x01a9:
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x021b
            int r2 = X.AnonymousClass001.A0H(r7, r8, r0)
            long[] r13 = r6.A02
            r14 = r13[r2]
            int r13 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0216
            if (r2 < 0) goto L_0x01ed
            int r0 = r6.A01
            int r0 = r0 + -1
            r6.A01 = r0
            int r15 = r2 >> 3
            r0 = r2 & 7
            int r14 = r0 << 3
            r3 = r5[r15]
            r12 = 255(0xff, double:1.26E-321)
            long r0 = r12 << r14
            long r0 = r0 ^ r18
            long r3 = r3 & r0
            r6 = 254(0xfe, double:1.255E-321)
            long r0 = r6 << r14
            long r3 = r3 | r0
            r5[r15] = r3
            int r0 = X.AnonymousClass000.A0E(r2, r8)
            int r3 = r0 >> 3
            r0 = r0 & 7
            int r2 = r0 << 3
            r0 = r5[r3]
            long r12 = r12 << r2
            long r12 = r12 ^ r18
            long r0 = r0 & r12
            long r6 = r6 << r2
            long r0 = r0 | r6
            r5[r3] = r0
        L_0x01ed:
            X.08x r0 = r10.A01
            X.08x r7 = X.C04800Ox.A00(r0)
            if (r7 == 0) goto L_0x0333
            r4 = 1024(0x400, float:1.435E-42)
            r3 = 9216(0x2400, float:1.2914E-41)
            X.0XW r2 = r7.A03
            r1 = r2
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x032c
            int r0 = r2.A00
            r0 = r0 & r3
            r6 = 0
            if (r0 == 0) goto L_0x022c
        L_0x0206:
            X.0XW r2 = r2.A02
            if (r2 == 0) goto L_0x022c
            int r0 = r2.A01
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0206
            int r0 = r2.A01
            r0 = r0 & r4
            if (r0 != 0) goto L_0x022c
            r6 = r2
            goto L_0x0206
        L_0x0216:
            long r0 = X.AnonymousClass000.A0T(r0)
            goto L_0x01a9
        L_0x021b:
            long r1 = X.AnonymousClass000.A0U(r20)
            long r1 = r1 & r16
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 != 0) goto L_0x01ed
            int r22 = r22 + 8
            int r7 = r7 + r22
            r7 = r7 & r8
            goto L_0x018c
        L_0x022c:
            java.lang.String r10 = "visitAncestors called on an unattached node"
            r5 = 8192(0x2000, float:1.14794E-41)
            r4 = 0
            if (r6 != 0) goto L_0x0252
            X.0XW r8 = r1.A04
            X.0XV r7 = X.AnonymousClass0QV.A03(r7)
            if (r7 == 0) goto L_0x033a
        L_0x023b:
            int r0 = X.AnonymousClass0QR.A01(r7, r5)
            if (r0 == 0) goto L_0x02fc
        L_0x0241:
            if (r8 == 0) goto L_0x02fc
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x02f8
            r6 = r4
            r3 = r8
        L_0x024a:
            boolean r0 = r3 instanceof X.C17630uy
            if (r0 == 0) goto L_0x02c3
            X.0XW r6 = r3.A03
            if (r6 == 0) goto L_0x033a
        L_0x0252:
            X.0XW r1 = r6.A03
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0327
            X.0XW r12 = r1.A04
            X.0XV r10 = X.AnonymousClass0QV.A03(r6)
            r3 = r4
            if (r10 == 0) goto L_0x0344
        L_0x0261:
            int r0 = X.AnonymousClass0QR.A01(r10, r5)
            if (r0 == 0) goto L_0x02b4
        L_0x0267:
            if (r12 == 0) goto L_0x02b4
            int r0 = r12.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x02b1
            r8 = r12
            r7 = r4
        L_0x0270:
            boolean r0 = r8 instanceof X.C17630uy
            if (r0 == 0) goto L_0x0284
            if (r3 != 0) goto L_0x027a
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
        L_0x027a:
            r3.add(r8)
        L_0x027d:
            X.0XW r8 = X.AnonymousClass0QV.A00(r7)
        L_0x0281:
            if (r8 == 0) goto L_0x02b1
            goto L_0x0270
        L_0x0284:
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x027d
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x027d
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0293:
            if (r2 == 0) goto L_0x02ae
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x029f
            int r1 = r1 + 1
            if (r1 != r9) goto L_0x02a2
            r8 = r2
        L_0x029f:
            X.0XW r2 = r2.A02
            goto L_0x0293
        L_0x02a2:
            X.0a9 r7 = X.AnonymousClass001.A10(r7)
            X.0XW r8 = X.AnonymousClass000.A0d(r7, r8)
            r7.A0F(r2)
            goto L_0x029f
        L_0x02ae:
            if (r1 != r9) goto L_0x027d
            goto L_0x0281
        L_0x02b1:
            X.0XW r12 = r12.A04
            goto L_0x0267
        L_0x02b4:
            X.0XV r10 = r10.A0I()
            if (r10 == 0) goto L_0x030d
            X.0QR r0 = r10.A0S
            if (r0 == 0) goto L_0x02c1
            X.0XW r12 = r0.A05
            goto L_0x0261
        L_0x02c1:
            r12 = r4
            goto L_0x0261
        L_0x02c3:
            int r0 = r3.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x02f0
            boolean r0 = r3 instanceof X.C014308l
            if (r0 == 0) goto L_0x02f0
            r0 = r3
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x02d2:
            if (r2 == 0) goto L_0x02ed
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x02de
            int r1 = r1 + 1
            if (r1 != r9) goto L_0x02e1
            r3 = r2
        L_0x02de:
            X.0XW r2 = r2.A02
            goto L_0x02d2
        L_0x02e1:
            X.0a9 r6 = X.AnonymousClass001.A10(r6)
            X.0XW r3 = X.AnonymousClass000.A0d(r6, r3)
            r6.A0F(r2)
            goto L_0x02de
        L_0x02ed:
            if (r1 != r9) goto L_0x02f0
            goto L_0x02f4
        L_0x02f0:
            X.0XW r3 = X.AnonymousClass0QV.A00(r6)
        L_0x02f4:
            if (r3 == 0) goto L_0x02f8
            goto L_0x024a
        L_0x02f8:
            X.0XW r8 = r8.A04
            goto L_0x0241
        L_0x02fc:
            X.0XV r7 = r7.A0I()
            if (r7 == 0) goto L_0x033a
            X.0QR r0 = r7.A0S
            if (r0 == 0) goto L_0x030a
            X.0XW r8 = r0.A05
            goto L_0x023b
        L_0x030a:
            r8 = r4
            goto L_0x023b
        L_0x030d:
            if (r3 == 0) goto L_0x0344
            int r0 = X.AnonymousClass000.A0Q(r3)
            if (r0 < 0) goto L_0x0344
        L_0x0315:
            int r1 = r0 + -1
            java.lang.Object r0 = r3.get(r0)
            X.0uy r0 = (X.C17630uy) r0
            boolean r0 = r0.C1L(r11)
            if (r0 != 0) goto L_0x0355
            if (r1 < 0) goto L_0x0344
            r0 = r1
            goto L_0x0315
        L_0x0327:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r10)
            throw r0
        L_0x032c:
            java.lang.String r0 = "visitLocalDescendants called on an unattached node"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x0333:
            java.lang.String r0 = "Event can't be processed because we do not have an active focus target."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x033a:
            r0 = r30
            boolean r0 = super.dispatchKeyEvent(r11)
            r1 = 0
            if (r0 == 0) goto L_0x03ea
            goto L_0x0355
        L_0x0344:
            X.0XW r8 = r6.A03
            r7 = r4
        L_0x0347:
            if (r8 == 0) goto L_0x0389
            boolean r0 = r8 instanceof X.C17630uy
            if (r0 == 0) goto L_0x0357
            X.0uy r8 = (X.C17630uy) r8
            boolean r0 = r8.C1L(r11)
            if (r0 == 0) goto L_0x0384
        L_0x0355:
            r1 = 1
            return r1
        L_0x0357:
            int r0 = r8.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0384
            boolean r0 = r8 instanceof X.C014308l
            if (r0 == 0) goto L_0x0384
            r0 = r8
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x0366:
            if (r2 == 0) goto L_0x0381
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0372
            int r1 = r1 + 1
            if (r1 != r9) goto L_0x0375
            r8 = r2
        L_0x0372:
            X.0XW r2 = r2.A02
            goto L_0x0366
        L_0x0375:
            X.0a9 r7 = X.AnonymousClass001.A10(r7)
            X.0XW r8 = X.AnonymousClass000.A0d(r7, r8)
            r7.A0F(r2)
            goto L_0x0372
        L_0x0381:
            if (r1 != r9) goto L_0x0384
            goto L_0x0347
        L_0x0384:
            X.0XW r8 = X.AnonymousClass0QV.A00(r7)
            goto L_0x0347
        L_0x0389:
            X.0XW r6 = r6.A03
        L_0x038b:
            if (r6 == 0) goto L_0x03cc
            boolean r0 = r6 instanceof X.C17630uy
            if (r0 == 0) goto L_0x039a
            X.0uy r6 = (X.C17630uy) r6
            boolean r0 = r6.BwR(r11)
            if (r0 == 0) goto L_0x03c7
            goto L_0x0355
        L_0x039a:
            int r0 = r6.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x03c7
            boolean r0 = r6 instanceof X.C014308l
            if (r0 == 0) goto L_0x03c7
            r0 = r6
            X.08l r0 = (X.C014308l) r0
            X.0XW r2 = r0.A00
            r1 = 0
        L_0x03a9:
            if (r2 == 0) goto L_0x03c4
            int r0 = r2.A01
            r0 = r0 & r5
            if (r0 == 0) goto L_0x03b5
            int r1 = r1 + 1
            if (r1 != r9) goto L_0x03b8
            r6 = r2
        L_0x03b5:
            X.0XW r2 = r2.A02
            goto L_0x03a9
        L_0x03b8:
            X.0a9 r4 = X.AnonymousClass001.A10(r4)
            X.0XW r6 = X.AnonymousClass000.A0d(r4, r6)
            r4.A0F(r2)
            goto L_0x03b5
        L_0x03c4:
            if (r1 != r9) goto L_0x03c7
            goto L_0x038b
        L_0x03c7:
            X.0XW r6 = X.AnonymousClass0QV.A00(r4)
            goto L_0x038b
        L_0x03cc:
            if (r3 == 0) goto L_0x033a
            int r2 = r3.size()
            r1 = 0
        L_0x03d3:
            if (r1 >= r2) goto L_0x033a
            java.lang.Object r0 = r3.get(r1)
            X.0uy r0 = (X.C17630uy) r0
            boolean r0 = r0.BwR(r11)
            if (r0 != 0) goto L_0x0355
            int r1 = r1 + 1
            goto L_0x03d3
        L_0x03e4:
            r0 = r30
            boolean r1 = super.dispatchKeyEvent(r11)
        L_0x03ea:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A0I) {
            Runnable runnable = this.A16;
            removeCallbacks(runnable);
            MotionEvent motionEvent2 = this.A09;
            C18070vi.A0b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.A0I = false;
            } else {
                runnable.run();
            }
        }
        if (A0W(motionEvent) || !isAttachedToWindow() || (motionEvent.getActionMasked() == 2 && !A0V(motionEvent))) {
            return false;
        }
        int A002 = A00(motionEvent);
        if ((A002 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((A002 & 1) == 0) {
            return false;
        }
        return true;
    }

    public final AnonymousClass05F getAndroidViewsHandler$ui_release() {
        if (this.A0A == null) {
            AnonymousClass05F r0 = new AnonymousClass05F(getContext());
            this.A0A = r0;
            addView(r0);
        }
        AnonymousClass05F r02 = this.A0A;
        C18070vi.A0b(r02);
        return r02;
    }

    public void getFocusedRect(Rect rect) {
        AnonymousClass0NU A022;
        C015408x A002 = C04800Ox.A00(((AnonymousClass0WK) this.A0O).A01);
        if (A002 == null || (A022 = C04800Ox.A02(A002)) == null) {
            super.getFocusedRect(rect);
            return;
        }
        rect.left = C22339B3q.A01(A022.A01);
        rect.top = C22339B3q.A01(A022.A03);
        rect.right = C22339B3q.A01(A022.A02);
        rect.bottom = C22339B3q.A01(A022.A00);
    }

    public E3V getFontFamilyResolver() {
        return (E3V) this.A0c.getValue();
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.A0r.A03.A02();
    }

    public C24246By4 getLayoutDirection() {
        return (C24246By4) this.A0d.getValue();
    }

    public long getMeasureIteration() {
        if (this.A0r.A00) {
            return 1;
        }
        throw AnonymousClass000.A0k("measureIteration should be only used during the measure/layout pass");
    }

    public AnonymousClass0QZ getPlacementScope() {
        return new AnonymousClass0AG(this);
    }

    public final AnonymousClass0Ii getViewTreeOwners() {
        return (AnonymousClass0Ii) this.A0e.getValue();
    }

    public boolean onCheckIsTextEditor() {
        return this.A15.A03();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.A15.A02(editorInfo);
    }

    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.A0u.A1m(consumer, jArr);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.A0r.A0H(this.A1A);
        this.A0C = null;
        A0C();
        if (this.A0A != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d A[Catch:{ all -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "AndroidOwner:onMeasure"
            android.os.Trace.beginSection(r0)
            boolean r0 = r11.isAttachedToWindow()     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0010
            X.0XV r0 = r11.A0Q     // Catch:{ all -> 0x0076 }
            r11.A0H(r0)     // Catch:{ all -> 0x0076 }
        L_0x0010:
            long r0 = r11.A02(r12)     // Catch:{ all -> 0x0076 }
            r10 = 32
            long r2 = r0 >>> r10
            int r9 = (int) r2     // Catch:{ all -> 0x0076 }
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            int r8 = (int) r0     // Catch:{ all -> 0x0076 }
            long r6 = r11.A02(r13)     // Catch:{ all -> 0x0076 }
            long r2 = r6 >>> r10
            int r1 = (int) r2     // Catch:{ all -> 0x0076 }
            long r4 = r4 & r6
            int r0 = (int) r4     // Catch:{ all -> 0x0076 }
            long r3 = X.C26229CvL.A03(r9, r8, r1, r0)     // Catch:{ all -> 0x0076 }
            androidx.compose.ui.unit.Constraints r0 = r11.A0C     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x0039
            androidx.compose.ui.unit.Constraints r0 = androidx.compose.ui.unit.Constraints.A05(r3)     // Catch:{ all -> 0x0076 }
            r11.A0C = r0     // Catch:{ all -> 0x0076 }
            r0 = 0
            goto L_0x0042
        L_0x0039:
            long r1 = r0.A0B()     // Catch:{ all -> 0x0076 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0044
            r0 = 1
        L_0x0042:
            r11.A04 = r0     // Catch:{ all -> 0x0076 }
        L_0x0044:
            X.0Qe r0 = r11.A0r     // Catch:{ all -> 0x0076 }
            r0.A0A(r3)     // Catch:{ all -> 0x0076 }
            r0.A09()     // Catch:{ all -> 0x0076 }
            X.0XV r0 = r11.A0Q     // Catch:{ all -> 0x0076 }
            X.0Ok r0 = r0.A0Q     // Catch:{ all -> 0x0076 }
            X.0AK r4 = r0.A0G     // Catch:{ all -> 0x0076 }
            int r1 = r4.A01     // Catch:{ all -> 0x0076 }
            int r0 = r4.A00     // Catch:{ all -> 0x0076 }
            r11.setMeasuredDimension(r1, r0)     // Catch:{ all -> 0x0076 }
            X.05F r0 = r11.A0A     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0072
            X.05F r3 = r11.getAndroidViewsHandler$ui_release()     // Catch:{ all -> 0x0076 }
            int r0 = r4.A01     // Catch:{ all -> 0x0076 }
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)     // Catch:{ all -> 0x0076 }
            int r0 = r4.A00     // Catch:{ all -> 0x0076 }
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)     // Catch:{ all -> 0x0076 }
            r3.measure(r1, r0)     // Catch:{ all -> 0x0076 }
        L_0x0072:
            android.os.Trace.endSection()
            return
        L_0x0076:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onMeasure(int, int):void");
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        AnonymousClass0WG r0;
        if (Build.VERSION.SDK_INT >= 26 && viewStructure != null && (r0 = this.A0i) != null) {
            AnonymousClass0LE.A01(viewStructure, r0);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.A0M) {
            C24246By4 A012 = C04990Pv.A00(i);
            setLayoutDirection(A012);
            this.A0O.CJJ(A012);
        }
    }

    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        this.A0u.A1i(longSparseArray);
    }

    public void onWindowFocusChanged(boolean z) {
        boolean A0S2;
        AnonymousClass000.A1C(this.A10.A00, z);
        this.A0L = true;
        super.onWindowFocusChanged(z);
        if (z && this.A03 != (A0S2 = A0S())) {
            this.A03 = A0S2;
            A0G(this.A0Q);
        }
    }

    public AndroidComposeView(Context context, C18560wh r12) {
        super(context);
        AnonymousClass0WG r0;
        int i;
        C16500sM r02;
        this.A19 = r12;
        this.A0D = C78.A00(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.A00;
        this.A11 = emptySemanticsElement;
        this.A0O = new AnonymousClass0WK(new C10880j3(this));
        AnonymousClass0WH r5 = new AnonymousClass0WH(new C07700du(this));
        this.A0v = r5;
        this.A0j = r5;
        this.A10 = new C06270Xq();
        AnonymousClass0WC r1 = C17090tj.A00;
        C17090tj A002 = AnonymousClass0LM.A00(r1, new C10030hg(this));
        this.A0g = A002;
        C17090tj A062 = A06(r1, C12330la.A00);
        this.A0h = A062;
        this.A0k = new AnonymousClass0HC();
        AnonymousClass0XV r3 = new AnonymousClass0XV(false, AnonymousClass0PD.A00.addAndGet(1));
        r3.CJP(C01840Ac.A00);
        r3.CIh(getDensity());
        r3.CJY(emptySemanticsElement.CP5(A062).CP5(((AnonymousClass0WK) this.A0O).A03).CP5(A002).CP5(r5.A00));
        this.A0Q = r3;
        this.A0s = this;
        this.A12 = new AnonymousClass0I2(r3);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.A0u = androidComposeViewAccessibilityDelegateCompat;
        this.A0N = new AnonymousClass0HA();
        this.A17 = AnonymousClass000.A13();
        this.A0m = new AnonymousClass0IW();
        this.A0o = new AnonymousClass0IU(this.A0Q);
        this.A0F = C12320lZ.A00;
        if (Build.VERSION.SDK_INT >= 26) {
            r0 = new AnonymousClass0WG(this, this.A0N);
        } else {
            r0 = null;
        }
        this.A0i = r0;
        this.A0T = new C06180Xg(context);
        this.A0S = new C06150Xd(context);
        this.A0R = new AnonymousClass0PW(new C12630m4(this));
        this.A0r = new AnonymousClass0Qe(this.A0Q);
        this.A0y = new C06260Xp(ViewConfiguration.get(context));
        this.A06 = C7A.A00(Integer.MAX_VALUE, Integer.MAX_VALUE);
        int i2 = 2;
        this.A1B = new int[]{0, 0};
        float[] A082 = C05040Qd.A08();
        this.A0V = A082;
        this.A0W = C05040Qd.A08();
        this.A0X = C05040Qd.A08();
        this.A00 = -1;
        this.A01 = AnonymousClass0QY.A01;
        this.A0K = true;
        this.A0b = AnonymousClass0Q9.A02((Object) null);
        this.A0e = C04950Pq.A01(new C08280eq(this));
        this.A0Y = new C05250Rk(this, 4);
        this.A0Z = new C05260Rl(this);
        this.A0a = new C05270Rm(this);
        D64 d64 = new D64(this, this);
        this.A15 = d64;
        this.A14 = new C25147CZy((E0B) C04990Pv.A03().invoke(d64));
        this.A18 = new AtomicReference((Object) null);
        this.A0w = new C06210Xj(getTextInputService());
        this.A13 = new C06290Xs(context);
        this.A0c = new AnonymousClass08V(AnonymousClass0Q9.A05(), A0B(context));
        Configuration configuration = context.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        this.A05 = i;
        this.A0d = AnonymousClass0Q9.A01(C04990Pv.A02(context.getResources().getConfiguration()));
        this.A0l = new C05900Wd(this);
        this.A0P = new C05910We(new C10020hf(this), (AnonymousClass1Y1) null, isInTouchMode() ? 1 : i2);
        this.A0p = new AnonymousClass0N0(this);
        this.A0x = new AnonymousClass0Xk(this);
        this.A0z = new AnonymousClass0HV();
        this.A0f = C06970a9.A02(new C18090vk[16]);
        this.A0t = new AnonymousClass0Z4(this);
        this.A16 = new AnonymousClass0Z3(this);
        this.A1A = new C08270ep(this);
        if (Build.VERSION.SDK_INT >= 29) {
            r02 = new C06160Xe();
        } else {
            r02 = new C06170Xf(A082);
        }
        this.A0U = r02;
        setWillNotDraw(false);
        setFocusable(true);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            AnonymousClass0FF.A00(this);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        AnonymousClass1HF.A0f(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(r5);
        this.A0Q.A0i(this);
        if (i3 >= 29) {
            AnonymousClass0FC.A00(this);
        }
        this.A0n = new C05930Wh(this);
    }

    private final long A02(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                size = Integer.MAX_VALUE;
            } else if (mode == 1073741824) {
                long j = (long) size;
                return j | (j << 32);
            } else {
                throw new IllegalStateException();
            }
        }
        return ((long) size) | (0 << 32);
    }

    private final void A0F(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).Bsd();
            } else if (childAt instanceof ViewGroup) {
                A0F((ViewGroup) childAt);
            }
        }
    }

    private final void A0G(AnonymousClass0XV r5) {
        r5.A0U();
        C06970a9 A0F2 = r5.A0F();
        int i = A0F2.A00;
        if (i > 0) {
            Object[] objArr = A0F2.A01;
            int i2 = 0;
            do {
                A0G((AnonymousClass0XV) objArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        if (r3 == r2.A0Q) goto L_0x0033;
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000e A[LOOP:0: B:5:0x000e->B:14:0x002c, LOOP_START, PHI: r3 
      PHI: (r3v1 X.0XV) = (r3v0 X.0XV), (r3v3 X.0XV) binds: [B:4:0x000c, B:14:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A0I(X.AnonymousClass0XV r3) {
        /*
            r2 = this;
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L_0x0036
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L_0x0036
            if (r3 == 0) goto L_0x0037
        L_0x000e:
            X.0Ok r0 = r3.A0Q
            X.0AK r0 = r0.A0G
            java.lang.Integer r1 = r0.A05
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x002f
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x0028
            X.0XV r0 = r3.A0I()
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.A0n()
            if (r0 != 0) goto L_0x002f
        L_0x0028:
            X.0XV r3 = r3.A0I()
            if (r3 == 0) goto L_0x002f
            goto L_0x000e
        L_0x002f:
            X.0XV r0 = r2.A0Q
            if (r3 != r0) goto L_0x0037
        L_0x0033:
            r2.requestLayout()
        L_0x0036:
            return
        L_0x0037:
            int r0 = r2.getWidth()
            if (r0 == 0) goto L_0x0033
            int r0 = r2.getHeight()
            if (r0 == 0) goto L_0x0033
            r2.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.A0I(X.0XV):void");
    }

    private final boolean A0U(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f > x || x > ((float) getWidth()) || 0.0f > y || y > ((float) getHeight())) {
            return false;
        }
        return true;
    }

    private final boolean A0V(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.A09) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) {
            return false;
        }
        return true;
    }

    public static final boolean A0W(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        boolean z = false;
                        int pointerCount = motionEvent.getPointerCount();
                        int i = 1;
                        while (i < pointerCount) {
                            float x2 = motionEvent.getX(i);
                            if (!Float.isInfinite(x2) && !Float.isNaN(x2)) {
                                float y2 = motionEvent.getY(i);
                                if (!Float.isInfinite(y2) && !Float.isNaN(y2) && (Build.VERSION.SDK_INT < 29 || AnonymousClass0FI.A00(motionEvent, i))) {
                                    z = false;
                                    i++;
                                }
                            }
                        }
                        return z;
                    }
                }
            }
        }
        return true;
    }

    public long BDq(long j) {
        A0J(this);
        return C05040Qd.A00(this.A0X, j);
    }

    public long BDv(long j) {
        A0J(this);
        return C05040Qd.A00(this.A0W, j);
    }

    public long Bhv(long j) {
        A0J(this);
        long A002 = C05040Qd.A00(this.A0W, j);
        float A012 = AnonymousClass0QY.A01(A002);
        long j2 = this.A01;
        return AnonymousClass001.A0p(A012 + AnonymousClass0QY.A01(j2), AnonymousClass0QY.A02(A002) + AnonymousClass0QY.A02(j2));
    }

    public void C3z(AnonymousClass1F9 r2) {
        this.A03 = A0S();
    }

    public long CGz(long j) {
        A0J(this);
        float A012 = AnonymousClass0QY.A01(j);
        long j2 = this.A01;
        return C05040Qd.A00(this.A0X, AnonymousClass001.A0p(A012 - AnonymousClass0QY.A01(j2), AnonymousClass0QY.A02(j) - AnonymousClass0QY.A02(j2)));
    }

    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            A0G(this.A0Q);
        }
        Bjc(true);
        C04790Ov.A03();
        this.A0J = true;
        AnonymousClass0WO r2 = this.A0k.A00;
        Canvas canvas2 = r2.A00;
        r2.A00 = canvas;
        this.A0Q.A0e(r2);
        r2.A00 = canvas2;
        List list = this.A17;
        if (AnonymousClass000.A1a(list)) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C16950tU) list.get(i)).CQf();
            }
        }
        if (AnonymousClass05A.A0I) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        list.clear();
        this.A0J = false;
        List list2 = this.A0E;
        if (list2 != null) {
            C18070vi.A0b(list2);
            list.addAll(list2);
            list2.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 8) {
            if (motionEvent.isFromSource(4194304)) {
                return A0T(motionEvent);
            }
            if (!A0W(motionEvent) && isAttachedToWindow()) {
                if ((A00(motionEvent) & 1) == 0) {
                    return false;
                }
                return true;
            }
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C015408x A002;
        if (isFocused() && (A002 = C04800Ox.A00(((AnonymousClass0WK) this.A0O).A01)) != null) {
            AnonymousClass0XW r1 = A002.A03;
            if (r1.A07) {
                AnonymousClass0XW r8 = r1.A04;
                AnonymousClass0XV A032 = AnonymousClass0QV.A03(A002);
                if (A032 != null) {
                    while (true) {
                        if (AnonymousClass0QR.A01(A032, A7Y.A0F) != 0) {
                            while (r8 != null) {
                                if ((r8.A01 & A7Y.A0F) != 0) {
                                    C06970a9 r4 = null;
                                    AnonymousClass0XW r3 = r8;
                                    do {
                                        if ((r3.A01 & A7Y.A0F) != 0 && (r3 instanceof C014308l)) {
                                            int i = 0;
                                            for (AnonymousClass0XW r2 = ((C014308l) r3).A00; r2 != null; r2 = r2.A02) {
                                                if ((r2.A01 & A7Y.A0F) != 0) {
                                                    i++;
                                                    if (i == 1) {
                                                        r3 = r2;
                                                    } else {
                                                        r4 = AnonymousClass001.A10(r4);
                                                        r3 = AnonymousClass000.A0d(r4, r3);
                                                        r4.A0F(r2);
                                                    }
                                                }
                                            }
                                            if (i == 1) {
                                                continue;
                                            }
                                        }
                                        r3 = AnonymousClass0QV.A00(r4);
                                        continue;
                                    } while (r3 != null);
                                }
                                r8 = r8.A04;
                            }
                        }
                        A032 = A032.A0I();
                        if (A032 == null) {
                            break;
                        }
                        AnonymousClass0QR r0 = A032.A0S;
                        if (r0 != null) {
                            r8 = r0.A05;
                        } else {
                            r8 = null;
                        }
                    }
                }
            } else {
                throw AnonymousClass000.A0n("visitAncestors called on an unattached node");
            }
        }
        return AnonymousClass000.A1O(super.dispatchKeyEventPreIme(keyEvent) ? 1 : 0);
    }

    public C06150Xd getAccessibilityManager() {
        return this.A0S;
    }

    public C15770rB getAutofill() {
        return this.A0i;
    }

    public AnonymousClass0HA getAutofillTree() {
        return this.A0N;
    }

    public C06180Xg getClipboardManager() {
        return this.A0T;
    }

    public final C22821Di getConfigurationChangeObserver() {
        return this.A0F;
    }

    public C18560wh getCoroutineContext() {
        return this.A19;
    }

    public C28644ECa getDensity() {
        return this.A0D;
    }

    public C16690sq getDragAndDropManager() {
        return this.A0j;
    }

    public C17470ui getFocusOwner() {
        return this.A0O;
    }

    public E07 getFontLoader() {
        return this.A13;
    }

    public C15800rE getHapticFeedBack() {
        return this.A0l;
    }

    public C15810rF getInputModeManager() {
        return this.A0P;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.A00;
    }

    public AnonymousClass0N0 getModifierLocalManager() {
        return this.A0p;
    }

    public C16390sB getPointerIconService() {
        return this.A0n;
    }

    public AnonymousClass0XV getRoot() {
        return this.A0Q;
    }

    public C15840rI getRootForTest() {
        return this.A0s;
    }

    public AnonymousClass0I2 getSemanticsOwner() {
        return this.A12;
    }

    public C05880Wb getSharedDrawScope() {
        return this.A0q;
    }

    public boolean getShowLayoutBounds() {
        return this.A03;
    }

    public AnonymousClass0PW getSnapshotObserver() {
        return this.A0R;
    }

    public C16750sx getSoftwareKeyboardController() {
        return this.A0w;
    }

    public C25147CZy getTextInputService() {
        return this.A14;
    }

    public C16510sN getTextToolbar() {
        return this.A0x;
    }

    public View getView() {
        return this;
    }

    public C16880tN getViewConfiguration() {
        return this.A0y;
    }

    public C15870rL getWindowInfo() {
        return this.A10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            X.0XV r0 = r4.A0Q
            r4.A0H(r0)
            r4.A0G(r0)
            X.0PW r0 = r4.A0R
            X.0Pn r0 = r0.A00
            r0.A05()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0021
            X.0WG r1 = r4.A0i
            if (r1 == 0) goto L_0x0021
            X.05L r0 = X.AnonymousClass05L.A00
            r0.A00(r1)
        L_0x0021:
            X.1F9 r3 = X.AnonymousClass1ZG.A00(r4)
            X.1FE r2 = X.AnonymousClass1ZI.A00(r4)
            X.0Ii r0 = r4.getViewTreeOwners()
            if (r0 == 0) goto L_0x00c3
            if (r3 == 0) goto L_0x005d
            if (r2 == 0) goto L_0x005d
            X.1F9 r0 = r0.A00()
            if (r3 != r0) goto L_0x003b
            if (r2 == r0) goto L_0x005d
        L_0x003b:
            X.1Fv r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x0044
            r0.A06(r4)
        L_0x0044:
            X.1Fv r0 = r3.getLifecycle()
            r0.A05(r4)
            X.0Ii r1 = new X.0Ii
            r1.<init>(r3, r2)
            r4.set_viewTreeOwners(r1)
            X.1Di r0 = r4.A0G
            if (r0 == 0) goto L_0x005a
            r0.invoke(r1)
        L_0x005a:
            r0 = 0
            r4.A0G = r0
        L_0x005d:
            X.0We r1 = r4.A0P
            boolean r0 = r4.isInTouchMode()
            r2 = 2
            if (r0 == 0) goto L_0x0067
            r2 = 1
        L_0x0067:
            X.0uU r1 = r1.A00
            X.0JJ r0 = new X.0JJ
            r0.<init>(r2)
            r1.setValue(r0)
            X.0Ii r0 = r4.getViewTreeOwners()
            X.C18070vi.A0b(r0)
            X.1F9 r0 = r0.A00()
            X.1Fv r0 = r0.getLifecycle()
            r0.A05(r4)
            X.0Ii r0 = r4.getViewTreeOwners()
            X.C18070vi.A0b(r0)
            X.1F9 r0 = r0.A00()
            X.1Fv r1 = r0.getLifecycle()
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r4.A0u
            r1.A05(r0)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r4.A0Y
            r1.addOnGlobalLayoutListener(r0)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r4.A0Z
            r1.addOnScrollChangedListener(r0)
            android.view.ViewTreeObserver r1 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnTouchModeChangeListener r0 = r4.A0a
            r1.addOnTouchModeChangeListener(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x00c2
            X.0Rp r0 = new X.0Rp
            r0.<init>()
            android.view.translation.ViewTranslationCallback r0 = (android.view.translation.ViewTranslationCallback) r0
            X.AnonymousClass0LP.A01(r4, r0)
        L_0x00c2:
            return
        L_0x00c3:
            if (r3 == 0) goto L_0x00ce
            if (r2 != 0) goto L_0x0044
            java.lang.String r0 = "Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x00ce:
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onAttachedToWindow():void");
    }

    public void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        this.A0D = C78.A00(getContext());
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        if (i != this.A05) {
            this.A05 = i;
            setFontFamilyResolver(A0B(getContext()));
        }
        this.A0F.invoke(configuration);
    }

    public void onDetachedFromWindow() {
        AnonymousClass0WG r1;
        C23381Fv lifecycle;
        C23381Fv lifecycle2;
        super.onDetachedFromWindow();
        C04920Pn r12 = this.A0R.A00;
        C16320s4 r0 = r12.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r12.A04();
        AnonymousClass0Ii viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (lifecycle2 = viewTreeOwners.A00().getLifecycle()) == null)) {
            lifecycle2.A06(this);
        }
        AnonymousClass0Ii viewTreeOwners2 = getViewTreeOwners();
        if (!(viewTreeOwners2 == null || (lifecycle = viewTreeOwners2.A00().getLifecycle()) == null)) {
            lifecycle.A06(this.A0u);
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && (r1 = this.A0i) != null) {
            AnonymousClass05L.A00.A01(r1);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.A0Y);
        getViewTreeObserver().removeOnScrollChangedListener(this.A0Z);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.A0a);
        if (i >= 31) {
            AnonymousClass0LP.A00(this);
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Owner FocusChanged(");
        A102.append(z);
        Log.d("Compose Focus", AnonymousClass001.A1J(A102));
        AnonymousClass0WK r2 = (AnonymousClass0WK) this.A0O;
        AnonymousClass0OF r3 = r2.A05;
        r3.A01.A0F(new C08350ex(this, z));
        if (!r3.A00) {
            try {
                r3.A00 = true;
                if (z) {
                    C015408x r22 = r2.A01;
                    if (r22.A0O() == AnonymousClass0CW.Inactive) {
                        r22.A0R(AnonymousClass0CW.Active);
                    }
                } else {
                    AnonymousClass0Qa.A08(r2.A01, true, true);
                }
            } finally {
                AnonymousClass0OF.A01(r3);
            }
        } else if (z) {
            C015408x r23 = r2.A01;
            if (r23.A0O() == AnonymousClass0CW.Inactive) {
                r23.A0R(AnonymousClass0CW.Active);
            }
        } else {
            AnonymousClass0Qa.A08(r2.A01, true, true);
        }
    }

    public final void setOnViewTreeOwnersAvailable(C22821Di r2) {
        AnonymousClass0Ii viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            r2.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.A0G = r2;
        }
    }

    public final void setConfigurationChangeObserver(C22821Di r1) {
        this.A0F = r1;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.A00 = j;
    }

    public void setShowLayoutBounds(boolean z) {
        this.A03 = z;
    }
}
