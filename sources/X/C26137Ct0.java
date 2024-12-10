package X;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.Ct0  reason: case insensitive filesystem */
public class C26137Ct0 {
    public static final C26137Ct0 A04 = new C26137Ct0(64, (CharSequence) null);
    public static final C26137Ct0 A05 = new C26137Ct0(128, (CharSequence) null);
    public static final C26137Ct0 A06 = new C26137Ct0(2, (CharSequence) null);
    public static final C26137Ct0 A07 = new C26137Ct0(8, (CharSequence) null);
    public static final C26137Ct0 A08 = new C26137Ct0(16, (CharSequence) null);
    public static final C26137Ct0 A09 = new C26137Ct0(524288, (CharSequence) null);
    public static final C26137Ct0 A0A;
    public static final C26137Ct0 A0B = new C26137Ct0(16384, (CharSequence) null);
    public static final C26137Ct0 A0C = new C26137Ct0(65536, (CharSequence) null);
    public static final C26137Ct0 A0D = new C26137Ct0(1048576, (CharSequence) null);
    public static final C26137Ct0 A0E;
    public static final C26137Ct0 A0F;
    public static final C26137Ct0 A0G;
    public static final C26137Ct0 A0H = new C26137Ct0(262144, (CharSequence) null);
    public static final C26137Ct0 A0I = new C26137Ct0(1, (CharSequence) null);
    public static final C26137Ct0 A0J;
    public static final C26137Ct0 A0K;
    public static final C26137Ct0 A0L = new C26137Ct0(32, (CharSequence) null);
    public static final C26137Ct0 A0M;
    public static final C26137Ct0 A0N;
    public static final C26137Ct0 A0O;
    public static final C26137Ct0 A0P;
    public static final C26137Ct0 A0Q;
    public static final C26137Ct0 A0R;
    public static final C26137Ct0 A0S;
    public static final C26137Ct0 A0T = new C26137Ct0(32768, (CharSequence) null);
    public static final C26137Ct0 A0U;
    public static final C26137Ct0 A0V;
    public static final C26137Ct0 A0W;
    public static final C26137Ct0 A0X = new C26137Ct0((int) DefaultCrypto.BUFFER_SIZE, (CharSequence) null);
    public static final C26137Ct0 A0Y;
    public static final C26137Ct0 A0Z = new C26137Ct0((int) ZipDecompressor.UNZIP_BUFFER_SIZE, (CharSequence) null);
    public static final C26137Ct0 A0a;
    public static final C26137Ct0 A0b;
    public static final C26137Ct0 A0c;
    public static final C26137Ct0 A0d;
    public static final C26137Ct0 A0e;
    public static final C26137Ct0 A0f = new C26137Ct0(4, (CharSequence) null);
    public static final C26137Ct0 A0g;
    public static final C26137Ct0 A0h = new C26137Ct0(BJz.class, (int) A7Y.A0F);
    public static final C26137Ct0 A0i = new C26137Ct0(BK0.class, 2097152);
    public static final C26137Ct0 A0j;
    public static final C26137Ct0 A0k;
    public static final C26137Ct0 A0l;
    public final int A00;
    public final E3b A01;
    public final Class A02;
    public final Object A03;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13 = null;
        Class<BJu> cls = BJu.class;
        A0N = new C26137Ct0((Class) cls, 256);
        A0V = new C26137Ct0((Class) cls, 512);
        Class<C22676BJv> cls2 = C22676BJv.class;
        A0O = new C26137Ct0((Class) cls2, (int) EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        A0W = new C26137Ct0((Class) cls2, (int) EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14 = null;
        A0j = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction, 16908342);
        if (i >= 23) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
        } else {
            accessibilityAction2 = null;
        }
        A0d = new C26137Ct0((E3b) null, (CharSequence) null, BJx.class, accessibilityAction2, 16908343);
        if (i >= 23) {
            accessibilityAction3 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
        } else {
            accessibilityAction3 = null;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15 = null;
        A0e = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction3, 16908344);
        if (i >= 23) {
            accessibilityAction4 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
        } else {
            accessibilityAction4 = null;
        }
        A0b = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction4, 16908345);
        if (i >= 23) {
            accessibilityAction5 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
        } else {
            accessibilityAction5 = null;
        }
        A0Y = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction5, 16908346);
        if (i >= 23) {
            accessibilityAction6 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
        } else {
            accessibilityAction6 = null;
        }
        A0c = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction6, 16908347);
        if (i >= 29) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16 = null;
        A0S = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction13, 16908358);
        if (i >= 29) {
            accessibilityAction15 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
        }
        A0P = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction15, 16908359);
        if (i >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction7 = null;
        }
        A0Q = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction7, 16908360);
        if (i >= 29) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17 = null;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18 = null;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19 = null;
        A0R = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction16, 16908361);
        if (i >= 23) {
            accessibilityAction8 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
        } else {
            accessibilityAction8 = null;
        }
        A0A = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction8, 16908348);
        int i2 = Build.VERSION.SDK_INT;
        if (i >= 24) {
            accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20 = null;
        A0g = new C26137Ct0((E3b) null, (CharSequence) null, BJy.class, accessibilityAction17, 16908349);
        if (i2 >= 26) {
            accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        }
        A0M = new C26137Ct0((E3b) null, (CharSequence) null, BJw.class, accessibilityAction20, 16908354);
        int i3 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityAction14 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21 = null;
        A0l = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction14, 16908356);
        if (i2 >= 28) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
        } else {
            accessibilityAction9 = null;
        }
        A0J = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction9, 16908357);
        if (i2 >= 30) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        }
        A0U = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction18, 16908362);
        if (i2 >= 30) {
            accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22 = null;
        A0K = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction21, 16908372);
        if (i2 >= 32) {
            accessibilityAction10 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction10 = null;
        }
        A0G = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction10, 16908373);
        if (i2 >= 32) {
            accessibilityAction11 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
        } else {
            accessibilityAction11 = null;
        }
        A0F = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction11, 16908374);
        if (i2 >= 32) {
            accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        A0E = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction19, 16908375);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 33) {
            accessibilityAction12 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
        } else {
            accessibilityAction12 = null;
        }
        A0k = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction12, 16908376);
        if (i4 >= 34) {
            accessibilityAction22 = C26158CtU.A00();
        }
        A0a = new C26137Ct0((E3b) null, (CharSequence) null, (Class) null, accessibilityAction22, 16908382);
    }

    public C26137Ct0(int i, CharSequence charSequence) {
        this((E3b) null, charSequence, (Class) null, (Object) null, i);
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C26137Ct0) && this.A03.equals(((C26137Ct0) obj).A03);
    }

    public int hashCode() {
        return this.A03.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AccessibilityActionCompat: ");
        String A012 = C26228CvK.A01(this.A00);
        if (A012.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.A03;
            if (accessibilityAction.getLabel() != null) {
                A012 = accessibilityAction.getLabel().toString();
            }
        }
        return AnonymousClass000.A0y(A012, A10);
    }

    public C26137Ct0(E3b e3b, CharSequence charSequence, Class cls, Object obj, int i) {
        this.A00 = i;
        this.A01 = e3b;
        this.A03 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.A02 = cls;
    }

    public C26137Ct0(Class cls, int i) {
        this((E3b) null, (CharSequence) null, cls, (Object) null, i);
    }
}
