package androidx.compose.ui.platform;

import X.A7Y;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00O;
import X.AnonymousClass00P;
import X.AnonymousClass00Q;
import X.AnonymousClass00R;
import X.AnonymousClass016;
import X.AnonymousClass04B;
import X.AnonymousClass05F;
import X.AnonymousClass05K;
import X.AnonymousClass0BT;
import X.AnonymousClass0BU;
import X.AnonymousClass0BV;
import X.AnonymousClass0BW;
import X.AnonymousClass0BX;
import X.AnonymousClass0CK;
import X.AnonymousClass0F9;
import X.AnonymousClass0FA;
import X.AnonymousClass0FB;
import X.AnonymousClass0FY;
import X.AnonymousClass0FZ;
import X.AnonymousClass0GI;
import X.AnonymousClass0HU;
import X.AnonymousClass0HW;
import X.AnonymousClass0JM;
import X.AnonymousClass0Js;
import X.AnonymousClass0KP;
import X.AnonymousClass0LW;
import X.AnonymousClass0NP;
import X.AnonymousClass0NT;
import X.AnonymousClass0NU;
import X.AnonymousClass0PS;
import X.AnonymousClass0QR;
import X.AnonymousClass0QV;
import X.AnonymousClass0QY;
import X.AnonymousClass0RY;
import X.AnonymousClass0Rn;
import X.AnonymousClass0XV;
import X.AnonymousClass0XW;
import X.AnonymousClass0Z6;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1F9;
import X.AnonymousClass1GE;
import X.AnonymousClass1OS;
import X.AnonymousClass1XU;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZU;
import X.AnonymousClass3MT;
import X.AnonymousClass4W8;
import X.C03120Gr;
import X.C03150Gu;
import X.C03340Hr;
import X.C03500Im;
import X.C04600Oa;
import X.C05010Pz;
import X.C05060Qg;
import X.C05170Qs;
import X.C05280Ro;
import X.C06120Xa;
import X.C06140Xc;
import X.C06370Yb;
import X.C06650Zd;
import X.C06660Ze;
import X.C06670Zf;
import X.C06680Zg;
import X.C06720Zk;
import X.C06850Zx;
import X.C08710fX;
import X.C09070g7;
import X.C09330gX;
import X.C10040hh;
import X.C10050hi;
import X.C108485bm;
import X.C12340lb;
import X.C12350lc;
import X.C14670pO;
import X.C18070vi;
import X.C18090vk;
import X.C22339B3q;
import X.C22821Di;
import X.C24246By4;
import X.C25294Ccw;
import X.C25475CgU;
import X.C25476CgV;
import X.C25477CgW;
import X.C25691Pg;
import X.C25760ClV;
import X.C26137Ct0;
import X.C26227CvJ;
import X.C26228CvK;
import X.C26260Cw5;
import X.C27069DRu;
import X.C27621Wu;
import X.C28851b7;
import X.C29391cC;
import X.C29431cG;
import X.C36001nB;
import X.CIY;
import X.E3V;
import android.content.ClipDescription;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public final class AndroidComposeViewAccessibilityDelegateCompat extends AnonymousClass1XU implements AnonymousClass1GE {
    public static final int[] A0b = {2131427377, 2131427378, 2131427389, 2131427400, 2131427403, 2131427404, 2131427405, 2131427406, 2131427407, 2131427408, 2131427379, 2131427380, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427386, 2131427387, 2131427388, 2131427390, 2131427391, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427401, 2131427402};
    public int A00;
    public int A01;
    public int A02 = Integer.MIN_VALUE;
    public AccessibilityNodeInfo A03;
    public C03340Hr A04;
    public C03500Im A05;
    public AnonymousClass0NP A06;
    public Integer A07;
    public List A08;
    public boolean A09;
    public AnonymousClass016 A0A;
    public AnonymousClass04B A0B;
    public AnonymousClass04B A0C;
    public C25760ClV A0D;
    public Integer A0E;
    public HashMap A0F;
    public HashMap A0G;
    public Map A0H;
    public Map A0I;
    public C22821Di A0J = new C10040hh(this);
    public boolean A0K;
    public boolean A0L;
    public final AccessibilityManager A0M;
    public final AnonymousClass00P A0N;
    public final AnonymousClass016 A0O;
    public final AndroidComposeView A0P;
    public final List A0Q;
    public final Handler A0R;
    public final AccessibilityManager.AccessibilityStateChangeListener A0S;
    public final AccessibilityManager.TouchExplorationStateChangeListener A0T;
    public final AnonymousClass016 A0U;
    public final CIY A0V;
    public final Runnable A0W;
    public final HashMap A0X;
    public final HashMap A0Y;
    public final C22821Di A0Z;
    public final C108485bm A0a;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r7 != 16) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C06140Xc A0K(X.C05060Qg r6, int r7) {
        /*
            r5 = this;
            r4 = 0
            java.lang.String r2 = r5.A0X(r6)
            if (r2 == 0) goto L_0x001e
            int r0 = r2.length()
            if (r0 == 0) goto L_0x001e
            r0 = 1
            if (r7 == r0) goto L_0x0048
            r0 = 2
            if (r7 == r0) goto L_0x0059
            r3 = 4
            if (r7 == r3) goto L_0x001f
            r0 = 8
            if (r7 == r0) goto L_0x003b
            r0 = 16
            if (r7 == r0) goto L_0x001f
        L_0x001e:
            return r4
        L_0x001f:
            X.0Yb r1 = r6.A0H()
            X.0PS r0 = X.C03120Gr.A07
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x001e
            X.CvJ r1 = A0S(r1)
            if (r1 == 0) goto L_0x001e
            if (r7 != r3) goto L_0x0040
            X.0BW r0 = A0M()
            r0.A05(r1, r2)
            return r0
        L_0x003b:
            X.0BU r0 = A0O()
            goto L_0x0069
        L_0x0040:
            X.0BX r0 = A0N()
            r0.A05(r6, r1, r2)
            return r0
        L_0x0048:
            androidx.compose.ui.platform.AndroidComposeView r0 = r5.A0P
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r0)
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            X.0BT r0 = A0L(r0)
            goto L_0x0069
        L_0x0059:
            androidx.compose.ui.platform.AndroidComposeView r0 = r5.A0P
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r0)
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            X.0BV r0 = A0P(r0)
        L_0x0069:
            r0.A03(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0K(X.0Qg, int):X.0Xc");
    }

    private final String A0X(C05060Qg r5) {
        C27069DRu dRu;
        C06370Yb A0H2 = r5.A0H();
        AnonymousClass0PS r1 = C03150Gu.A02;
        if (A0H2.A0B(r1)) {
            return C25294Ccw.A00(",", (List) A0H2.A01(r1));
        }
        if (A0H2.A0B(C03120Gr.A0M)) {
            dRu = A0R(A0H2);
        } else {
            List list = (List) AnonymousClass0FY.A00(A0H2, C03150Gu.A0O);
            if (list == null) {
                return null;
            }
            dRu = (C27069DRu) C29431cG.A0c(list);
        }
        if (dRu != null) {
            return dRu.A02();
        }
        return null;
    }

    private final void A0j() {
        String str;
        C06370Yb A002;
        AnonymousClass016 r3 = new AnonymousClass016((AnonymousClass1Y1) null, 0, 1);
        AnonymousClass016 r5 = this.A0A;
        Iterator it = r5.iterator();
        while (it.hasNext()) {
            int A0M2 = AnonymousClass000.A0M(it.next());
            Map A0c = A0c();
            Integer valueOf = Integer.valueOf(A0M2);
            AnonymousClass0HU r0 = (AnonymousClass0HU) A0c.get(valueOf);
            if (r0 == null || !C05170Qs.A0D(r0.A01)) {
                r3.add(valueOf);
                C03500Im r02 = (C03500Im) this.A0I.get(valueOf);
                if (r02 == null || (A002 = r02.A00()) == null) {
                    str = null;
                } else {
                    str = (String) AnonymousClass0FY.A00(A002, C03150Gu.A0G);
                }
                A0l(A0M2, 32, str);
            }
        }
        r5.A05(r3);
        Map map = this.A0I;
        map.clear();
        Iterator A15 = AnonymousClass000.A15(A0c());
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (C05170Qs.A0D(((AnonymousClass0HU) A16.getValue()).A01) && r5.add(A16.getKey())) {
                A0l(AnonymousClass000.A0M(A16.getKey()), 16, (String) ((AnonymousClass0HU) A16.getValue()).A01.A0H().A01(C03150Gu.A0G));
            }
            map.put(A16.getKey(), new C03500Im(((AnonymousClass0HU) A16.getValue()).A01, A0c()));
        }
        this.A05 = new C03500Im(this.A0P.getSemanticsOwner().A00(), A0c());
    }

    private final void A0w(C03500Im r8, C05060Qg r9) {
        List A032 = C05060Qg.A03(r9, false, true);
        int size = A032.size();
        for (int i = 0; i < size; i++) {
            C05060Qg r2 = (C05060Qg) A032.get(i);
            if (C05060Qg.A08(r2, A0c()) && !r8.A01.contains(Integer.valueOf(r2.A02))) {
                A13(r2);
            }
        }
        Map map = this.A0I;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (!A0c().containsKey(A16.getKey())) {
                int A0M2 = AnonymousClass000.A0M(A16.getKey());
                AnonymousClass00P r22 = this.A0N;
                Integer valueOf = Integer.valueOf(A0M2);
                if (r22.containsKey(valueOf)) {
                    r22.remove(valueOf);
                } else {
                    this.A0O.add(valueOf);
                }
            }
        }
        List A033 = C05060Qg.A03(r9, false, true);
        int size2 = A033.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C05060Qg r1 = (C05060Qg) A033.get(i2);
            if (C05060Qg.A08(r1, A0c()) && C05060Qg.A08(r1, map)) {
                Object A0w = AnonymousClass000.A0w(map, r1.A02);
                C18070vi.A0b(A0w);
                A0w((C03500Im) A0w, r1);
            }
        }
    }

    public static final boolean A1L(AnonymousClass0Js r2, float f) {
        if (f < 0.0f && AnonymousClass000.A04(r2.A01().invoke()) > 0.0f) {
            return true;
        }
        if (f <= 0.0f || AnonymousClass000.A04(r2.A01().invoke()) >= AnonymousClass000.A04(r2.A00().invoke())) {
            return false;
        }
        return true;
    }

    public final void A1g() {
        this.A0K = true;
        if ((A1n() || this.A06 != null) && !this.A09) {
            this.A09 = true;
            this.A0R.post(this.A0W);
        }
    }

    public final void A1k(AnonymousClass0XV r2) {
        this.A0K = true;
        if (A1n() || this.A06 != null) {
            A0s(r2);
        }
    }

    public final boolean A1n() {
        return this.A0M.isEnabled() && AnonymousClass000.A1a(this.A08);
    }

    public /* synthetic */ void BqQ(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void BrH(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C0B(AnonymousClass1F9 r1) {
    }

    public /* synthetic */ void C3z(AnonymousClass1F9 r1) {
    }

    /* access modifiers changed from: private */
    public final int A00(int i) {
        if (i == this.A0P.getSemanticsOwner().A00().A02) {
            return -1;
        }
        return i;
    }

    /* access modifiers changed from: private */
    public final Rect A08(AnonymousClass0HU r9) {
        Rect rect = r9.A00;
        AndroidComposeView androidComposeView = this.A0P;
        long A0p = AnonymousClass001.A0p((float) rect.left, (float) rect.top);
        long j = AnonymousClass0QY.A03;
        long Bhv = androidComposeView.Bhv(A0p);
        long Bhv2 = androidComposeView.Bhv(AnonymousClass001.A0p((float) rect.right, (float) rect.bottom));
        return new Rect((int) ((float) Math.floor((double) AnonymousClass0QY.A01(Bhv))), (int) ((float) Math.floor((double) AnonymousClass0QY.A02(Bhv))), (int) ((float) Math.ceil((double) AnonymousClass0QY.A01(Bhv2))), (int) ((float) Math.ceil((double) AnonymousClass0QY.A02(Bhv2))));
    }

    private final SpannableString A0A(C05060Qg r9) {
        SpannableString spannableString;
        C27069DRu dRu;
        AndroidComposeView androidComposeView = this.A0P;
        E3V fontFamilyResolver = androidComposeView.getFontFamilyResolver();
        C06370Yb A0H2 = r9.A0H();
        C27069DRu A0R2 = A0R(A0H2);
        SpannableString spannableString2 = null;
        if (A0R2 != null) {
            spannableString = A0B(A0R2, fontFamilyResolver, this.A0V, androidComposeView.getDensity());
        } else {
            spannableString = null;
        }
        SpannableString spannableString3 = (SpannableString) A0U(spannableString);
        List list = (List) AnonymousClass0FY.A00(A0H2, C03150Gu.A0O);
        if (!(list == null || (dRu = (C27069DRu) C29431cG.A0c(list)) == null)) {
            spannableString2 = A0B(dRu, fontFamilyResolver, this.A0V, androidComposeView.getDensity());
        }
        SpannableString spannableString4 = (SpannableString) A0U(spannableString2);
        if (spannableString3 == null) {
            return spannableString4;
        }
        return spannableString3;
    }

    /* JADX WARNING: type inference failed for: r9v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v6, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010b A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString A0B(X.C27069DRu r38, X.E3V r39, X.CIY r40, X.C28644ECa r41) {
        /*
            r9 = r38
            java.lang.String r0 = r9.A00
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
            java.util.List r7 = r9.A03
            r6 = 0
            if (r7 == 0) goto L_0x0138
            int r5 = r7.size()
            r4 = 0
        L_0x0013:
            if (r4 >= r5) goto L_0x0138
            java.lang.Object r0 = r7.get(r4)
            X.CrE r0 = (X.C26047CrE) r0
            java.lang.Object r14 = r0.A02
            X.CrN r14 = (X.C26053CrN) r14
            int r3 = r0.A01
            int r2 = r0.A00
            r21 = 0
            X.EBX r13 = r14.A0D
            long r19 = r13.BOw()
            long r15 = r14.A01
            X.DSF r0 = r14.A09
            r24 = r0
            X.Cma r0 = r14.A07
            r38 = r0
            X.Cmb r0 = r14.A08
            r37 = r0
            java.lang.String r0 = r14.A0F
            r30 = r0
            long r11 = r14.A02
            X.Cmc r0 = r14.A0B
            r26 = r0
            X.Cr4 r0 = r14.A0E
            r29 = r0
            X.DUE r0 = r14.A0A
            r25 = r0
            long r0 = r14.A00
            X.Cme r10 = r14.A0C
            r27 = r10
            X.0NG r10 = r14.A03
            r23 = r10
            X.Ckc r10 = r14.A05
            r22 = r10
            X.0Cg r14 = r14.A04
            long r17 = r13.BOw()
            X.0Ek r10 = X.C05100Qk.A06
            int r10 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r10 == 0) goto L_0x0069
            X.EBX r13 = X.C25969Cpb.A00(r19)
        L_0x0069:
            X.CrN r10 = new X.CrN
            r28 = r13
            r31 = r15
            r33 = r11
            r35 = r0
            r17 = r10
            r18 = r23
            r19 = r14
            r20 = r22
            r22 = r38
            r23 = r37
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35)
            long r0 = r10.A02()
            X.C25861CnP.A00(r8, r3, r2, r0)
            long r0 = r10.A01
            r12 = r41
            r11 = r8
            r13 = r3
            r14 = r2
            r15 = r0
            X.C25861CnP.A02(r11, r12, r13, r14, r15)
            X.DSF r1 = r10.A09
            r11 = 33
            if (r1 != 0) goto L_0x00a0
            X.Cma r0 = r10.A07
            if (r0 == 0) goto L_0x00b2
            X.DSF r1 = X.DSF.A03
        L_0x00a0:
            X.Cma r0 = r10.A07
            if (r0 == 0) goto L_0x0135
            int r0 = r0.A00
        L_0x00a6:
            int r1 = X.C24505C6z.A00(r1, r0)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r1)
            r8.setSpan(r0, r3, r2, r11)
        L_0x00b2:
            X.CGf r12 = r10.A06
            if (r12 == 0) goto L_0x00c6
            boolean r0 = r12 instanceof X.BJG
            if (r0 == 0) goto L_0x010f
            X.BJG r12 = (X.BJG) r12
            java.lang.String r1 = r12.A00
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            r0.<init>(r1)
        L_0x00c3:
            r8.setSpan(r0, r3, r2, r11)
        L_0x00c6:
            X.Cme r0 = r10.A0C
            if (r0 == 0) goto L_0x00e4
            int r1 = r0.A00
            r0 = 1
            r0 = r0 | r1
            if (r0 != r1) goto L_0x00d8
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r8.setSpan(r0, r3, r2, r11)
        L_0x00d8:
            r0 = 2
            r0 = r0 | r1
            if (r0 != r1) goto L_0x00e4
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r8.setSpan(r0, r3, r2, r11)
        L_0x00e4:
            X.Cr4 r0 = r10.A0E
            if (r0 == 0) goto L_0x00f2
            float r1 = r0.A00
            android.text.style.ScaleXSpan r0 = new android.text.style.ScaleXSpan
            r0.<init>(r1)
            r8.setSpan(r0, r3, r2, r11)
        L_0x00f2:
            X.DUE r0 = r10.A0A
            X.C25861CnP.A01(r8, r0, r3, r2)
            long r0 = r10.A00
            long r12 = X.C05100Qk.A05
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x010b
            int r1 = X.AnonymousClass0Oy.A00(r0)
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            r0.<init>(r1)
            r8.setSpan(r0, r3, r2, r11)
        L_0x010b:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x010f:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x00c6
            X.Cmb r0 = r10.A08
            if (r0 == 0) goto L_0x0133
            int r1 = r0.A00
        L_0x011b:
            X.DSF r0 = X.DSF.A03
            r13 = r39
            X.ECY r0 = r13.CFu(r12, r0, r6, r1)
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type android.graphics.Typeface"
            X.C18070vi.A0z(r1, r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            android.text.style.TypefaceSpan r0 = X.C76.A00(r1)
            goto L_0x00c3
        L_0x0133:
            r1 = 1
            goto L_0x011b
        L_0x0135:
            r0 = 0
            goto L_0x00a6
        L_0x0138:
            int r7 = r9.length()
            java.util.List r11 = r9.A01
            if (r11 == 0) goto L_0x0168
            java.util.ArrayList r9 = X.AnonymousClass000.A14(r11)
            int r5 = r11.size()
            r4 = 0
        L_0x0149:
            if (r4 >= r5) goto L_0x016a
            java.lang.Object r3 = r11.get(r4)
            r2 = r3
            X.CrE r2 = (X.C26047CrE) r2
            java.lang.Object r0 = r2.A02
            boolean r0 = r0 instanceof X.C24418C2r
            if (r0 == 0) goto L_0x0165
            int r1 = r2.A01
            int r0 = r2.A00
            boolean r0 = X.C26069Crj.A02(r6, r7, r1, r0)
            if (r0 == 0) goto L_0x0165
            r9.add(r3)
        L_0x0165:
            int r4 = r4 + 1
            goto L_0x0149
        L_0x0168:
            X.0wS r9 = X.C18460wS.A00
        L_0x016a:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.TtsAnnotation>>"
            X.C18070vi.A0z(r9, r0)
            int r5 = r9.size()
            r4 = 0
        L_0x0174:
            r10 = 33
            if (r4 >= r5) goto L_0x01a3
            java.lang.Object r0 = r9.get(r4)
            X.CrE r0 = (X.C26047CrE) r0
            java.lang.Object r1 = r0.A02
            X.C2r r1 = (X.C24418C2r) r1
            int r3 = r0.A01
            int r2 = r0.A00
            boolean r0 = r1 instanceof X.BJE
            if (r0 == 0) goto L_0x019d
            X.BJE r1 = (X.BJE) r1
            java.lang.String r1 = r1.A00
            android.text.style.TtsSpan$VerbatimBuilder r0 = new android.text.style.TtsSpan$VerbatimBuilder
            r0.<init>(r1)
            android.text.style.TtsSpan r0 = r0.build()
            r8.setSpan(r0, r3, r2, r10)
            int r4 = r4 + 1
            goto L_0x0174
        L_0x019d:
            X.3EW r0 = new X.3EW
            r0.<init>()
            throw r0
        L_0x01a3:
            if (r11 == 0) goto L_0x01cd
            java.util.ArrayList r9 = X.AnonymousClass000.A14(r11)
            int r5 = r11.size()
            r4 = 0
        L_0x01ae:
            if (r4 >= r5) goto L_0x01cf
            java.lang.Object r3 = r11.get(r4)
            r2 = r3
            X.CrE r2 = (X.C26047CrE) r2
            java.lang.Object r0 = r2.A02
            boolean r0 = r0 instanceof X.C25127CZa
            if (r0 == 0) goto L_0x01ca
            int r1 = r2.A01
            int r0 = r2.A00
            boolean r0 = X.C26069Crj.A02(r6, r7, r1, r0)
            if (r0 == 0) goto L_0x01ca
            r9.add(r3)
        L_0x01ca:
            int r4 = r4 + 1
            goto L_0x01ae
        L_0x01cd:
            X.0wS r9 = X.C18460wS.A00
        L_0x01cf:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.UrlAnnotation>>"
            X.C18070vi.A0z(r9, r0)
            int r7 = r9.size()
        L_0x01d8:
            if (r6 >= r7) goto L_0x0202
            java.lang.Object r0 = r9.get(r6)
            X.CrE r0 = (X.C26047CrE) r0
            java.lang.Object r5 = r0.A02
            X.CZa r5 = (X.C25127CZa) r5
            int r4 = r0.A01
            int r3 = r0.A00
            r0 = r40
            java.util.WeakHashMap r2 = r0.A00
            java.lang.Object r1 = r2.get(r5)
            if (r1 != 0) goto L_0x01fc
            java.lang.String r0 = r5.A00
            android.text.style.URLSpan r1 = new android.text.style.URLSpan
            r1.<init>(r0)
            r2.put(r5, r1)
        L_0x01fc:
            r8.setSpan(r1, r4, r3, r10)
            int r6 = r6 + 1
            goto L_0x01d8
        L_0x0202:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0B(X.DRu, X.E3V, X.CIY, X.ECa):android.text.SpannableString");
    }

    private final AccessibilityEvent A0D(CharSequence charSequence, Integer num, Integer num2, Integer num3, int i) {
        AccessibilityEvent A0C2 = A0C(i, DefaultCrypto.BUFFER_SIZE);
        if (num != null) {
            A0C2.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            A0C2.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            A0C2.setItemCount(num3.intValue());
        }
        if (charSequence != null) {
            A0C2.getText().add(charSequence);
        }
        return A0C2;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewParent] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.accessibility.AccessibilityNodeInfo A0H(int r9) {
        /*
            r8 = this;
            androidx.compose.ui.platform.AndroidComposeView r6 = r8.A0P
            X.0Ii r0 = r6.getViewTreeOwners()
            r7 = 0
            if (r0 == 0) goto L_0x001c
            X.1F9 r0 = r0.A00()
            X.1Fv r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x001c
            X.1Fx r1 = r0.A04()
        L_0x0017:
            X.1Fx r0 = X.C23401Fx.DESTROYED
            if (r1 != r0) goto L_0x001e
            return r7
        L_0x001c:
            r1 = r7
            goto L_0x0017
        L_0x001e:
            X.CvK r5 = X.C26228CvK.A00()
            java.util.Map r0 = r8.A0c()
            java.lang.Object r4 = X.AnonymousClass000.A0w(r0, r9)
            X.0HU r4 = (X.AnonymousClass0HU) r4
            if (r4 != 0) goto L_0x002f
            return r7
        L_0x002f:
            X.0Qg r3 = r4.A01
            r2 = -1
            if (r9 != r2) goto L_0x0054
            android.view.ViewParent r1 = r6.getParentForAccessibility()
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L_0x003f
            r7 = r1
            android.view.View r7 = (android.view.View) r7
        L_0x003f:
            r5.A0E(r7)
        L_0x0042:
            r5.A0I(r6, r9)
            android.graphics.Rect r0 = r8.A08(r4)
            r5.A0D(r0)
            r8.A1C(r3, r5, r9)
            android.view.accessibility.AccessibilityNodeInfo r0 = r5.A06()
            return r0
        L_0x0054:
            X.0Qg r0 = r3.A0J()
            if (r0 == 0) goto L_0x0073
            int r1 = r0.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0073
            X.0I2 r0 = r6.getSemanticsOwner()
            X.0Qg r0 = r0.A00()
            int r0 = r0.A02
            if (r1 == r0) goto L_0x006f
            r2 = r1
        L_0x006f:
            r5.A0H(r6, r2)
            goto L_0x0042
        L_0x0073:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "semanticsNode "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " has null parent"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0H(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.0BT, X.0Xc] */
    public static final AnonymousClass0BT A0L(Locale locale) {
        AnonymousClass0BT r1 = AnonymousClass0BT.A01;
        AnonymousClass0BT r12 = r1;
        if (r1 == null) {
            ? r13 = new C06140Xc();
            r13.A00 = BreakIterator.getCharacterInstance(locale);
            AnonymousClass0BT.A01 = r13;
            r12 = r13;
        }
        C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.CharacterTextSegmentIterator");
        return r12;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.0BW, X.0Xc] */
    public static final AnonymousClass0BW A0M() {
        AnonymousClass0BW r1 = AnonymousClass0BW.A01;
        AnonymousClass0BW r12 = r1;
        if (r1 == null) {
            ? r13 = new C06140Xc();
            AnonymousClass0BW.A01 = r13;
            r12 = r13;
        }
        C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.LineTextSegmentIterator");
        return r12;
    }

    public static final AnonymousClass0BX A0N() {
        AnonymousClass0BX r1 = AnonymousClass0BX.A03;
        if (r1 == null) {
            r1 = new AnonymousClass0BX();
            AnonymousClass0BX.A03 = r1;
        }
        C18070vi.A0z(r1, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.PageTextSegmentIterator");
        return r1;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.0BU, X.0Xc] */
    public static final AnonymousClass0BU A0O() {
        AnonymousClass0BU r1 = AnonymousClass0BU.A00;
        AnonymousClass0BU r12 = r1;
        if (r1 == null) {
            ? r13 = new C06140Xc();
            AnonymousClass0BU.A00 = r13;
            r12 = r13;
        }
        C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
        return r12;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.0BV, X.0Xc] */
    public static final AnonymousClass0BV A0P(Locale locale) {
        AnonymousClass0BV r1 = AnonymousClass0BV.A01;
        AnonymousClass0BV r12 = r1;
        if (r1 == null) {
            ? r13 = new C06140Xc();
            r13.A00 = BreakIterator.getWordInstance(locale);
            AnonymousClass0BV.A01 = r13;
            r12 = r13;
        }
        C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.WordTextSegmentIterator");
        return r12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        if (r2 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.AnonymousClass0NT A0Q(X.C05060Qg r8) {
        /*
            r7 = this;
            X.0NP r4 = r7.A06
            r3 = 0
            if (r4 == 0) goto L_0x0022
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0022
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.A0P
            X.0Mp r1 = X.AnonymousClass0FU.A00(r0)
            if (r1 == 0) goto L_0x0022
            X.0Qg r0 = r8.A0J()
            if (r0 == 0) goto L_0x0023
            int r0 = r0.A02
            long r0 = (long) r0
            android.view.autofill.AutofillId r2 = r4.A01(r0)
            if (r2 != 0) goto L_0x0027
        L_0x0022:
            return r3
        L_0x0023:
            android.view.autofill.AutofillId r2 = r1.A01()
        L_0x0027:
            int r0 = r8.A02
            long r0 = (long) r0
            X.0NT r6 = r4.A02(r2, r0)
            if (r6 == 0) goto L_0x0022
            X.0Yb r2 = r8.A0H()
            X.0PS r0 = X.C03150Gu.A0H
            boolean r0 = r2.A0B(r0)
            if (r0 != 0) goto L_0x0022
            X.0PS r0 = X.C03150Gu.A0O
            java.lang.Object r1 = X.AnonymousClass0FY.A00(r2, r0)
            java.util.List r1 = (java.util.List) r1
            java.lang.String r3 = "\n"
            if (r1 == 0) goto L_0x0054
            java.lang.String r0 = "android.widget.TextView"
            r6.A06(r0)
            java.lang.String r0 = X.C25294Ccw.A00(r3, r1)
            r6.A05(r0)
        L_0x0054:
            X.0PS r0 = X.C03150Gu.A04
            java.lang.Object r1 = X.AnonymousClass0FY.A00(r2, r0)
            X.DRu r1 = (X.C27069DRu) r1
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "android.widget.EditText"
            r6.A06(r0)
            r6.A05(r1)
        L_0x0066:
            X.0PS r0 = X.C03150Gu.A02
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = X.C25294Ccw.A00(r3, r0)
            r6.A04(r0)
        L_0x0077:
            X.0PS r0 = X.C03150Gu.A0J
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r0)
            X.0JM r0 = (X.AnonymousClass0JM) r0
            if (r0 == 0) goto L_0x008c
            int r0 = r0.A00
            java.lang.String r0 = X.C05170Qs.A02(r0)
            if (r0 == 0) goto L_0x008c
            r6.A06(r0)
        L_0x008c:
            X.CvJ r0 = A0S(r2)
            if (r0 == 0) goto L_0x00b5
            X.Ccg r3 = r0.A0N()
            X.Cvq r0 = r3.A04()
            long r1 = r0.A05()
            X.ClU[] r0 = X.C26130Cst.A02
            float r2 = X.AnonymousClass001.A01(r1)
            X.ECa r1 = r3.A06()
            float r0 = r1.BQU()
            float r2 = r2 * r0
            float r0 = r1.BRu()
            float r2 = r2 * r0
            r6.A02(r2)
        L_0x00b5:
            X.0NU r5 = r8.A0B()
            float r1 = r5.A01
            int r4 = (int) r1
            float r3 = r5.A03
            int r2 = (int) r3
            float r0 = r5.A02
            float r0 = r0 - r1
            int r1 = (int) r0
            float r0 = r5.A00
            float r0 = r0 - r3
            int r0 = (int) r0
            r6.A03(r4, r2, r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A0Q(X.0Qg):X.0NT");
    }

    public static final C27069DRu A0R(C06370Yb r1) {
        return (C27069DRu) AnonymousClass0FY.A00(r1, C03150Gu.A04);
    }

    public static final C25475CgU A0T(AnonymousClass0HW r3) {
        return C25475CgU.A00(r3.A01, r3.A00, 0, false);
    }

    private final ArrayList A0Z(List list, boolean z) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList A13 = AnonymousClass000.A13();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A1D((C05060Qg) list.get(i), A13, linkedHashMap);
        }
        return A0Y(A13, linkedHashMap, z);
    }

    /* access modifiers changed from: private */
    public final Map A0c() {
        if (this.A0K) {
            this.A0K = false;
            this.A0H = C05170Qs.A05(this.A0P.getSemanticsOwner());
            if (A1n()) {
                A0h();
            }
        }
        return this.A0H;
    }

    private final void A0g() {
        AnonymousClass0NP r6 = this.A06;
        if (r6 != null && Build.VERSION.SDK_INT >= 29) {
            AnonymousClass00P r5 = this.A0N;
            if (!r5.isEmpty()) {
                List A0t = C29431cG.A0t(r5.values());
                ArrayList A14 = AnonymousClass000.A14(A0t);
                int size = A0t.size();
                for (int i = 0; i < size; i++) {
                    A14.add(((AnonymousClass0NT) A0t.get(i)).A01());
                }
                r6.A04(A14);
                r5.clear();
            }
            AnonymousClass016 r52 = this.A0O;
            if (!r52.isEmpty()) {
                List A0t2 = C29431cG.A0t(r52);
                ArrayList A142 = AnonymousClass000.A14(A0t2);
                int size2 = A0t2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    A142.add(Long.valueOf((long) AnonymousClass001.A0n(A0t2, i2)));
                }
                r6.A05(C29431cG.A1C(A142));
                r52.clear();
            }
        }
    }

    private final void A0h() {
        C05060Qg r3;
        HashMap hashMap = this.A0G;
        hashMap.clear();
        HashMap hashMap2 = this.A0F;
        hashMap2.clear();
        AnonymousClass0HU r0 = (AnonymousClass0HU) AnonymousClass000.A0w(A0c(), -1);
        if (r0 != null) {
            r3 = r0.A01;
        } else {
            r3 = null;
        }
        C18070vi.A0b(r3);
        int i = 1;
        ArrayList A0Z2 = A0Z(AnonymousClass1ZU.A06(r3), AnonymousClass000.A1Z(r3.A03.A0N(), C24246By4.Rtl));
        int A042 = AnonymousClass1ZU.A04(A0Z2);
        if (1 <= A042) {
            while (true) {
                int i2 = ((C05060Qg) A0Z2.get(i - 1)).A02;
                int i3 = ((C05060Qg) A0Z2.get(i)).A02;
                Integer valueOf = Integer.valueOf(i2);
                Integer valueOf2 = Integer.valueOf(i3);
                hashMap.put(valueOf, valueOf2);
                hashMap2.put(valueOf2, valueOf);
                if (i != A042) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void A0k(int i) {
        C03340Hr r3 = this.A04;
        if (r3 != null) {
            int i2 = r3.A05.A02;
            if (i != i2) {
                return;
            }
            if (SystemClock.uptimeMillis() - r3.A04 <= 1000) {
                AccessibilityEvent A0C2 = A0C(A00(i2), A7Y.A0F);
                A0C2.setFromIndex(r3.A01);
                A0C2.setToIndex(r3.A03);
                A0C2.setAction(r3.A00);
                A0C2.setMovementGranularity(r3.A02);
                A0C2.getText().add(A0X(r3.A05));
                A0p(A0C2);
            }
        }
        this.A04 = null;
    }

    /* access modifiers changed from: private */
    public final void A0m(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        Bundle extras;
        int i2;
        int i3;
        RectF rectF;
        HashMap hashMap;
        Map A0c = A0c();
        Integer valueOf = Integer.valueOf(i);
        AnonymousClass0HU r0 = (AnonymousClass0HU) A0c.get(valueOf);
        if (r0 != null) {
            C05060Qg r4 = r0.A01;
            String A0X2 = A0X(r4);
            String str2 = str;
            if (C18070vi.A18(str2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL")) {
                hashMap = this.A0G;
            } else if (C18070vi.A18(str2, "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL")) {
                hashMap = this.A0F;
            } else {
                C06370Yb A0H2 = r4.A0H();
                Bundle bundle2 = bundle;
                if (!A0H2.A0B(C03120Gr.A07) || bundle == null || !C18070vi.A18(str2, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
                    AnonymousClass0PS r1 = C03150Gu.A0N;
                    if (A0H2.A0B(r1) && bundle != null && C18070vi.A18(str2, "androidx.compose.ui.semantics.testTag")) {
                        String str3 = (String) AnonymousClass0FY.A00(A0H2, r1);
                        if (str3 != null) {
                            accessibilityNodeInfo.getExtras().putCharSequence(str2, str3);
                            return;
                        }
                        return;
                    } else if (C18070vi.A18(str2, "androidx.compose.ui.semantics.id")) {
                        extras = accessibilityNodeInfo.getExtras();
                        i2 = r4.A02;
                        extras.putInt(str2, i2);
                    } else {
                        return;
                    }
                } else {
                    int i4 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
                    int i5 = bundle2.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
                    if (i5 > 0 && i4 >= 0) {
                        if (A0X2 != null) {
                            i3 = A0X2.length();
                        } else {
                            i3 = Integer.MAX_VALUE;
                        }
                        if (i4 < i3) {
                            C26227CvJ A0S2 = A0S(A0H2);
                            if (A0S2 != null) {
                                ArrayList A13 = AnonymousClass000.A13();
                                int i6 = 0;
                                do {
                                    if (i4 + i6 >= A0S2.A0N().A03().length()) {
                                        rectF = null;
                                    } else {
                                        rectF = null;
                                        AnonymousClass0NU A022 = A0S2.A0J(i4 + i6).A02(r4.A09());
                                        AnonymousClass0NU A0C2 = r4.A0C();
                                        if (A022.A02 > A0C2.A01 && A0C2.A02 > A022.A01 && A022.A00 > A0C2.A03 && A0C2.A00 > A022.A03) {
                                            AnonymousClass0NU A032 = A022.A03(A0C2);
                                            AndroidComposeView androidComposeView = this.A0P;
                                            long A0p = AnonymousClass001.A0p(A032.A01, A032.A03);
                                            long j = AnonymousClass0QY.A03;
                                            long Bhv = androidComposeView.Bhv(A0p);
                                            long Bhv2 = androidComposeView.Bhv(AnonymousClass001.A0p(A032.A02, A032.A00));
                                            rectF = new RectF(AnonymousClass0QY.A01(Bhv), AnonymousClass0QY.A02(Bhv), AnonymousClass0QY.A01(Bhv2), AnonymousClass0QY.A02(Bhv2));
                                        }
                                    }
                                    A13.add(rectF);
                                    i6++;
                                } while (i6 < i5);
                                accessibilityNodeInfo.getExtras().putParcelableArray(str2, (Parcelable[]) A13.toArray(new RectF[0]));
                                return;
                            }
                            return;
                        }
                    }
                    Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
                    return;
                }
            }
            Number number = (Number) hashMap.get(valueOf);
            if (number != null) {
                extras = accessibilityNodeInfo.getExtras();
                i2 = number.intValue();
                extras.putInt(str2, i2);
            }
        }
    }

    private final void A0n(int i, String str) {
        AnonymousClass0NP r2 = this.A06;
        if (r2 != null && Build.VERSION.SDK_INT >= 29) {
            AutofillId A012 = r2.A01((long) i);
            if (A012 != null) {
                r2.A03(A012, str);
                return;
            }
            throw AnonymousClass000.A0n("Invalid content capture ID");
        }
    }

    private final void A0r(AnonymousClass016 r5, AnonymousClass0XV r6) {
        C06370Yb A0L2;
        AnonymousClass0XV A012;
        if (r6.A08 != null && !this.A0P.getAndroidViewsHandler$ui_release().A00.containsKey(r6)) {
            AnonymousClass016 r3 = this.A0U;
            int size = r3.size();
            int i = 0;
            while (i < size) {
                if (!C05170Qs.A08((AnonymousClass0XV) r3.A02(i), r6)) {
                    i++;
                } else {
                    return;
                }
            }
            if ((AnonymousClass000.A1O(8 & r6.A0S.A01.A00) || (r6 = C05170Qs.A00(r6, C12350lc.A00)) != null) && (A0L2 = r6.A0L()) != null) {
                if (!A0L2.A0A() && (A012 = C05170Qs.A00(r6, C12340lb.A00)) != null) {
                    r6 = A012;
                }
                int i2 = r6.A01;
                if (r5.add(Integer.valueOf(i2))) {
                    A1E(1, (List) null, A00(i2), EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void A0s(AnonymousClass0XV r3) {
        if (this.A0U.add(r3)) {
            this.A0a.CQ0(C27621Wu.A00);
        }
    }

    private final void A0t(AnonymousClass0XV r6) {
        if (r6.A08 != null && !this.A0P.getAndroidViewsHandler$ui_release().A00.containsKey(r6)) {
            int i = r6.A01;
            HashMap hashMap = this.A0X;
            Integer valueOf = Integer.valueOf(i);
            AnonymousClass0Js r3 = (AnonymousClass0Js) hashMap.get(valueOf);
            AnonymousClass0Js r2 = (AnonymousClass0Js) this.A0Y.get(valueOf);
            if (r3 != null || r2 != null) {
                AccessibilityEvent A0C2 = A0C(i, ZipDecompressor.UNZIP_BUFFER_SIZE);
                if (r3 != null) {
                    A0C2.setScrollX((int) AnonymousClass000.A04(r3.A01().invoke()));
                    A0C2.setMaxScrollX((int) AnonymousClass000.A04(r3.A00().invoke()));
                }
                if (r2 != null) {
                    A0C2.setScrollY((int) AnonymousClass000.A04(r2.A01().invoke()));
                    A0C2.setMaxScrollY((int) AnonymousClass000.A04(r2.A00().invoke()));
                }
                A0p(A0C2);
            }
        }
    }

    private final void A0v(C03500Im r10, C05060Qg r11) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List A032 = C05060Qg.A03(r11, false, true);
        int size = A032.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C05060Qg r8 = (C05060Qg) A032.get(i);
                if (C05060Qg.A08(r8, A0c())) {
                    if (!r10.A01.contains(Integer.valueOf(r8.A02))) {
                        break;
                    }
                    linkedHashSet.add(Integer.valueOf(r8.A02));
                }
                i++;
            } else {
                for (Object A0M2 : r10.A01) {
                    if (!linkedHashSet.contains(Integer.valueOf(AnonymousClass000.A0M(A0M2)))) {
                    }
                }
                List A033 = C05060Qg.A03(r11, false, true);
                int size2 = A033.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C05060Qg r2 = (C05060Qg) A033.get(i2);
                    if (C05060Qg.A08(r2, A0c())) {
                        Object A0w = AnonymousClass000.A0w(this.A0I, r2.A02);
                        C18070vi.A0b(A0w);
                        A0v((C03500Im) A0w, r2);
                    }
                }
                return;
            }
        }
        A0s(r11.A03);
    }

    public static /* synthetic */ void A0y(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        AndroidComposeView androidComposeView = androidComposeViewAccessibilityDelegateCompat.A0P;
        androidComposeView.Bjc(true);
        if (androidComposeViewAccessibilityDelegateCompat.A1n()) {
            androidComposeViewAccessibilityDelegateCompat.A0v(androidComposeViewAccessibilityDelegateCompat.A05, androidComposeView.getSemanticsOwner().A00());
        }
        if (androidComposeViewAccessibilityDelegateCompat.A06 != null) {
            androidComposeViewAccessibilityDelegateCompat.A0w(androidComposeViewAccessibilityDelegateCompat.A05, androidComposeView.getSemanticsOwner().A00());
        }
        androidComposeViewAccessibilityDelegateCompat.A1F(androidComposeViewAccessibilityDelegateCompat.A0c());
        androidComposeViewAccessibilityDelegateCompat.A0j();
        androidComposeViewAccessibilityDelegateCompat.A09 = false;
    }

    public static final void A10(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        List A092;
        if (z) {
            A092 = androidComposeViewAccessibilityDelegateCompat.A0M.getEnabledAccessibilityServiceList(-1);
        } else {
            A092 = AnonymousClass1ZU.A09();
        }
        androidComposeViewAccessibilityDelegateCompat.A08 = A092;
    }

    /* access modifiers changed from: private */
    public final void A12(C06120Xa r4) {
        if (r4.A05.contains(r4)) {
            this.A0P.getSnapshotObserver().A08(r4, new C08710fX(this, r4), this.A0Z);
        }
    }

    private final void A13(C05060Qg r5) {
        if (this.A06 != null) {
            A15(r5);
            int i = r5.A02;
            AnonymousClass0NT A0Q2 = A0Q(r5);
            if (A0Q2 != null) {
                AnonymousClass016 r2 = this.A0O;
                Integer valueOf = Integer.valueOf(i);
                if (r2.contains(valueOf)) {
                    r2.remove(valueOf);
                } else {
                    this.A0N.put(valueOf, A0Q2);
                }
            }
            List A032 = C05060Qg.A03(r5, false, true);
            int size = A032.size();
            for (int i2 = 0; i2 < size; i2++) {
                A13((C05060Qg) A032.get(i2));
            }
        }
    }

    private final void A14(C05060Qg r5) {
        if (this.A06 != null) {
            int i = r5.A02;
            AnonymousClass00P r2 = this.A0N;
            Integer valueOf = Integer.valueOf(i);
            if (r2.containsKey(valueOf)) {
                r2.remove(valueOf);
            } else {
                this.A0O.add(valueOf);
            }
            List A032 = C05060Qg.A03(r5, false, true);
            int size = A032.size();
            for (int i2 = 0; i2 < size; i2++) {
                A14((C05060Qg) A032.get(i2));
            }
        }
    }

    private final void A1D(C05060Qg r7, ArrayList arrayList, Map map) {
        boolean A1Z = AnonymousClass000.A1Z(r7.A03.A0N(), C24246By4.Rtl);
        boolean A1Y = AnonymousClass000.A1Y(r7.A0G().A02(C03150Gu.A0E, C09070g7.A00));
        if (A1Y || A1M(r7)) {
            Set keySet = A0c().keySet();
            Integer valueOf = Integer.valueOf(r7.A02);
            if (keySet.contains(valueOf)) {
                arrayList.add(r7);
            }
            if (A1Y) {
                map.put(valueOf, A0Z(C29431cG.A0m(C05060Qg.A03(r7, !r7.A05, false)), A1Z));
                return;
            }
        }
        List A032 = C05060Qg.A03(r7, !r7.A05, false);
        int size = A032.size();
        for (int i = 0; i < size; i++) {
            A1D((C05060Qg) A032.get(i), arrayList, map);
        }
    }

    private final void A1E(Integer num, List list, int i, int i2) {
        if (i == Integer.MIN_VALUE) {
            return;
        }
        if (A1n() || this.A06 != null) {
            AccessibilityEvent A0C2 = A0C(i, i2);
            if (num != null) {
                A0C2.setContentChangeTypes(num.intValue());
            }
            if (list != null) {
                A0C2.setContentDescription(C25294Ccw.A00(",", list));
            }
            A0p(A0C2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0313, code lost:
        if (r3.A0G().A0B(r8) == false) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0332, code lost:
        if (r3.A0G().A0B(r8) != false) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        if (r0 == false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A1F(java.util.Map r25) {
        /*
            r24 = this;
            r7 = r24
            java.util.List r6 = r7.A0Q
            java.util.ArrayList r22 = new java.util.ArrayList
            r0 = r22
            r0.<init>(r6)
            r6.clear()
            r23 = r25
            java.util.Set r0 = r23.keySet()
            java.util.Iterator r21 = r0.iterator()
        L_0x0018:
            boolean r0 = r21.hasNext()
            if (r0 == 0) goto L_0x049e
            java.lang.Object r0 = r21.next()
            int r5 = X.AnonymousClass000.A0M(r0)
            java.util.Map r0 = r7.A0I
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r1)
            X.0Im r4 = (X.C03500Im) r4
            r0 = r23
            java.lang.Object r0 = r0.get(r1)
            X.0HU r0 = (X.AnonymousClass0HU) r0
            if (r0 == 0) goto L_0x0497
            X.0Qg r3 = r0.A01
            X.0Yb r2 = r3.A0H()
            if (r4 != 0) goto L_0x0076
            java.util.Iterator r4 = r2.iterator()
        L_0x0048:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r4)
            java.lang.Object r0 = r0.getKey()
            X.0PS r1 = X.C03150Gu.A0O
            boolean r0 = X.C18070vi.A18(r0, r1)
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = X.C29431cG.A0c(r0)
        L_0x006a:
            int r1 = r3.A02
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r7.A0n(r1, r0)
            goto L_0x0048
        L_0x0074:
            r0 = 0
            goto L_0x006a
        L_0x0076:
            java.util.Iterator r20 = r2.iterator()
            r1 = 0
        L_0x007b:
            r19 = 0
        L_0x007d:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x047b
            java.util.Map$Entry r16 = X.AnonymousClass000.A16(r20)
            java.lang.Object r0 = r16.getKey()
            X.0PS r10 = X.C03150Gu.A08
            boolean r0 = X.C18070vi.A18(r0, r10)
            if (r0 != 0) goto L_0x009f
            java.lang.Object r8 = r16.getKey()
            X.0PS r0 = X.C03150Gu.A0T
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x00c0
        L_0x009f:
            int r9 = r22.size()
            r8 = 0
        L_0x00a4:
            if (r8 >= r9) goto L_0x0473
            r0 = r22
            java.lang.Object r0 = r0.get(r8)
            X.0Xa r0 = (X.C06120Xa) r0
            int r0 = r0.A04
            if (r0 != r5) goto L_0x046f
            r0 = r22
            java.lang.Object r8 = r0.get(r8)
            if (r8 == 0) goto L_0x0473
            r0 = 0
        L_0x00bb:
            r6.add(r8)
            if (r0 != 0) goto L_0x00d9
        L_0x00c0:
            java.lang.Object r9 = r16.getValue()
            X.0Yb r8 = r4.A00()
            java.lang.Object r0 = r16.getKey()
            X.0PS r0 = (X.AnonymousClass0PS) r0
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r8, r0)
            boolean r0 = X.C18070vi.A18(r9, r0)
            if (r0 == 0) goto L_0x00d9
            goto L_0x007d
        L_0x00d9:
            java.lang.Object r8 = r16.getKey()
            X.0PS r11 = X.C03150Gu.A0O
            boolean r0 = X.C18070vi.A18(r8, r11)
            if (r0 == 0) goto L_0x0116
            X.0Yb r0 = r4.A00()
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r0, r11)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0114
            java.lang.Object r8 = X.C29431cG.A0c(r0)
        L_0x00f5:
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r11)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0112
            java.lang.Object r9 = X.C29431cG.A0c(r0)
        L_0x0101:
            boolean r0 = X.C18070vi.A18(r8, r9)
            if (r0 != 0) goto L_0x007d
            int r8 = r3.A02
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r7.A0n(r8, r0)
            goto L_0x007d
        L_0x0112:
            r9 = 0
            goto L_0x0101
        L_0x0114:
            r8 = 0
            goto L_0x00f5
        L_0x0116:
            X.0PS r0 = X.C03150Gu.A0G
            boolean r0 = X.C18070vi.A18(r8, r0)
            r9 = 8
            if (r0 == 0) goto L_0x0136
            java.lang.Object r8 = r16.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.C18070vi.A0z(r8, r0)
            java.lang.String r8 = (java.lang.String) r8
            boolean r0 = r4.A01()
            if (r0 == 0) goto L_0x007d
            r7.A0l(r5, r9, r8)
            goto L_0x007d
        L_0x0136:
            X.0PS r0 = X.C03150Gu.A0M
            boolean r0 = X.C18070vi.A18(r8, r0)
            r15 = 64
            if (r0 != 0) goto L_0x0454
            X.0PS r0 = X.C03150Gu.A0R
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 != 0) goto L_0x0454
            X.0PS r0 = X.C03150Gu.A0I
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 != 0) goto L_0x0454
            X.0PS r13 = X.C03150Gu.A0L
            boolean r0 = X.C18070vi.A18(r8, r13)
            r12 = 4
            r14 = 1
            if (r0 == 0) goto L_0x01cb
            X.0Yb r8 = r3.A0G()
            X.0PS r0 = X.C03150Gu.A0J
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r8, r0)
            X.0JM r0 = (X.AnonymousClass0JM) r0
            if (r0 == 0) goto L_0x0454
            int r0 = r0.A00
            if (r0 != r12) goto L_0x0454
            X.0Yb r0 = r3.A0G()
            java.lang.Object r8 = X.AnonymousClass0FY.A00(r0, r13)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x01c5
            int r0 = r7.A00(r5)
            android.view.accessibility.AccessibilityEvent r10 = r7.A0C(r0, r12)
            X.0Qg r12 = r3.A0I()
            X.0Yb r8 = r12.A0G()
            X.0PS r0 = X.C03150Gu.A02
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r8, r0)
            java.util.List r0 = (java.util.List) r0
            java.lang.String r8 = ","
            if (r0 == 0) goto L_0x01c3
            java.lang.String r9 = X.C25294Ccw.A00(r8, r0)
        L_0x019e:
            X.0Yb r0 = r12.A0G()
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r0, r11)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x01c1
            java.lang.String r8 = X.C25294Ccw.A00(r8, r0)
        L_0x01ae:
            if (r9 == 0) goto L_0x01b3
            r10.setContentDescription(r9)
        L_0x01b3:
            if (r8 == 0) goto L_0x01bc
            java.util.List r0 = r10.getText()
            r0.add(r8)
        L_0x01bc:
            r7.A0p(r10)
            goto L_0x007d
        L_0x01c1:
            r8 = 0
            goto L_0x01ae
        L_0x01c3:
            r9 = 0
            goto L_0x019e
        L_0x01c5:
            int r10 = r7.A00(r5)
            goto L_0x02bf
        L_0x01cb:
            X.0PS r0 = X.C03150Gu.A02
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x01ed
            int r10 = r7.A00(r5)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.Object r8 = r16.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>"
            X.C18070vi.A0z(r8, r0)
            java.util.List r8 = (java.util.List) r8
        L_0x01e6:
            r0 = 2048(0x800, float:2.87E-42)
            r7.A1E(r9, r8, r10, r0)
            goto L_0x007d
        L_0x01ed:
            X.0PS r0 = X.C03150Gu.A04
            boolean r0 = X.C18070vi.A18(r8, r0)
            java.lang.String r12 = ""
            if (r0 == 0) goto L_0x0239
            X.0PS r15 = X.C03120Gr.A0M
            boolean r0 = r2.A0B(r15)
            if (r0 == 0) goto L_0x02c4
            X.0Yb r0 = r4.A00()
            X.DRu r14 = A0R(r0)
            if (r14 != 0) goto L_0x020a
            r14 = r12
        L_0x020a:
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            X.DRu r9 = A0R(r2)
            if (r9 != 0) goto L_0x0213
            r9 = r12
        L_0x0213:
            java.lang.CharSequence r9 = (java.lang.CharSequence) r9
            java.lang.CharSequence r18 = A0U(r9)
            int r13 = r14.length()
            int r12 = r9.length()
            r17 = r13
            if (r13 <= r12) goto L_0x0227
            r17 = r12
        L_0x0227:
            r11 = 0
        L_0x0228:
            r0 = r17
            if (r11 >= r0) goto L_0x02d0
            char r8 = r14.charAt(r11)
            char r0 = r9.charAt(r11)
            if (r8 != r0) goto L_0x02d0
            int r11 = r11 + 1
            goto L_0x0228
        L_0x0239:
            X.0PS r11 = X.C03150Gu.A0P
            boolean r0 = X.C18070vi.A18(r8, r11)
            if (r0 == 0) goto L_0x0287
            X.DRu r0 = A0R(r2)
            if (r0 == 0) goto L_0x024e
            java.lang.String r0 = r0.A02()
            if (r0 == 0) goto L_0x024e
            r12 = r0
        L_0x024e:
            java.lang.Object r0 = r2.A01(r11)
            X.Cw5 r0 = (X.C26260Cw5) r0
            long r8 = r0.A06()
            int r16 = r7.A00(r5)
            int r0 = X.AnonymousClass000.A0G(r8)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            int r0 = X.AnonymousClass000.A0H(r8)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r0)
            int r0 = r12.length()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            java.lang.CharSequence r12 = A0U(r12)
            r11 = r7
            android.view.accessibility.AccessibilityEvent r0 = r11.A0D(r12, r13, r14, r15, r16)
            r7.A0p(r0)
            int r0 = r3.A02
            r7.A0k(r0)
            goto L_0x007d
        L_0x0287:
            boolean r0 = X.C18070vi.A18(r8, r10)
            if (r0 != 0) goto L_0x0419
            X.0PS r0 = X.C03150Gu.A0T
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 != 0) goto L_0x0419
            X.0PS r0 = X.C03150Gu.A06
            boolean r0 = X.C18070vi.A18(r8, r0)
            if (r0 == 0) goto L_0x0398
            java.lang.Object r8 = r16.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Boolean"
            X.C18070vi.A0z(r8, r0)
            boolean r0 = X.AnonymousClass000.A1Y(r8)
            if (r0 == 0) goto L_0x02b9
            int r0 = r3.A02
            int r0 = r7.A00(r0)
            android.view.accessibility.AccessibilityEvent r0 = r7.A0C(r0, r9)
            r7.A0p(r0)
        L_0x02b9:
            int r0 = r3.A02
            int r10 = r7.A00(r0)
        L_0x02bf:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            goto L_0x02cd
        L_0x02c4:
            int r10 = r7.A00(r5)
            r0 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x02cd:
            r8 = 0
            goto L_0x01e6
        L_0x02d0:
            r10 = 0
        L_0x02d1:
            int r0 = r17 - r11
            if (r10 >= r0) goto L_0x02ea
            int r0 = r13 + -1
            int r0 = r0 - r10
            char r16 = r14.charAt(r0)
            int r0 = r12 + -1
            int r0 = r0 - r10
            char r8 = r9.charAt(r0)
            r0 = r16
            if (r0 != r8) goto L_0x02ea
            int r10 = r10 + 1
            goto L_0x02d1
        L_0x02ea:
            int r13 = r13 - r10
            int r13 = r13 - r11
            int r10 = r12 - r10
            int r10 = r10 - r11
            X.0Qg r0 = r4.A00
            r17 = r0
            X.0Yb r9 = r17.A0H()
            boolean r0 = r9.A0B(r15)
            if (r0 == 0) goto L_0x0315
            X.0Yb r0 = r17.A0G()
            X.0PS r8 = X.C03150Gu.A0H
            boolean r0 = r0.A0B(r8)
            if (r0 != 0) goto L_0x0315
            X.0Yb r0 = r3.A0G()
            boolean r0 = r0.A0B(r8)
            r16 = 1
            if (r0 != 0) goto L_0x0317
        L_0x0315:
            r16 = 0
        L_0x0317:
            boolean r0 = r9.A0B(r15)
            if (r0 == 0) goto L_0x0334
            X.0Yb r0 = r17.A0G()
            X.0PS r8 = X.C03150Gu.A0H
            boolean r0 = r0.A0B(r8)
            if (r0 == 0) goto L_0x0334
            X.0Yb r0 = r3.A0G()
            boolean r0 = r0.A0B(r8)
            r15 = 1
            if (r0 == 0) goto L_0x0335
        L_0x0334:
            r15 = 0
        L_0x0335:
            if (r16 != 0) goto L_0x0383
            if (r15 != 0) goto L_0x0383
            int r8 = r7.A00(r5)
            r0 = 16
            android.view.accessibility.AccessibilityEvent r9 = r7.A0C(r8, r0)
            r9.setFromIndex(r11)
            r9.setRemovedCount(r13)
            r9.setAddedCount(r10)
            r9.setBeforeText(r14)
            java.util.List r8 = r9.getText()
            r0 = r18
            r8.add(r0)
        L_0x0358:
            java.lang.String r0 = "android.widget.EditText"
            r9.setClassName(r0)
            r7.A0p(r9)
            if (r16 != 0) goto L_0x0364
            if (r15 == 0) goto L_0x007d
        L_0x0364:
            X.0PS r0 = X.C03150Gu.A0P
            java.lang.Object r0 = r2.A01(r0)
            X.Cw5 r0 = (X.C26260Cw5) r0
            long r10 = r0.A06()
            int r0 = X.AnonymousClass000.A0G(r10)
            r9.setFromIndex(r0)
            int r0 = X.AnonymousClass000.A0H(r10)
            r9.setToIndex(r0)
            r7.A0p(r9)
            goto L_0x007d
        L_0x0383:
            int r13 = r7.A00(r5)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8 = r7
            r9 = r18
            r11 = r10
            android.view.accessibility.AccessibilityEvent r9 = r8.A0D(r9, r10, r11, r12, r13)
            goto L_0x0358
        L_0x0398:
            X.0PS r9 = X.C03120Gr.A03
            boolean r0 = X.C18070vi.A18(r8, r9)
            if (r0 == 0) goto L_0x03e7
            java.lang.Object r8 = r2.A01(r9)
            java.util.List r8 = (java.util.List) r8
            X.0Yb r0 = r4.A00()
            java.lang.Object r10 = X.AnonymousClass0FY.A00(r0, r9)
            java.util.List r10 = (java.util.List) r10
            if (r10 == 0) goto L_0x040f
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            int r0 = r8.size()
            if (r1 >= r0) goto L_0x03c7
            r8.get(r1)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x03c7:
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x03dc
            r10.get(r1)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x03dc:
            boolean r0 = r9.containsAll(r8)
            if (r0 == 0) goto L_0x0415
            boolean r0 = r8.containsAll(r9)
            goto L_0x040c
        L_0x03e7:
            java.lang.Object r0 = r16.getValue()
            boolean r0 = r0 instanceof X.AnonymousClass0KP
            if (r0 == 0) goto L_0x0415
            java.lang.Object r9 = r16.getValue()
            java.lang.String r0 = "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>"
            X.C18070vi.A0z(r9, r0)
            X.0KP r9 = (X.AnonymousClass0KP) r9
            X.0Yb r8 = r4.A00()
            java.lang.Object r0 = r16.getKey()
            X.0PS r0 = (X.AnonymousClass0PS) r0
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r8, r0)
            boolean r0 = X.C05170Qs.A09(r9, r0)
        L_0x040c:
            if (r0 != 0) goto L_0x007b
            goto L_0x0415
        L_0x040f:
            boolean r0 = X.AnonymousClass000.A1a(r8)
            if (r0 == 0) goto L_0x007d
        L_0x0415:
            r19 = 1
            goto L_0x007d
        L_0x0419:
            X.0XV r0 = r3.A03
            r7.A0s(r0)
            int r9 = r6.size()
            r8 = 0
        L_0x0423:
            if (r8 >= r9) goto L_0x0452
            java.lang.Object r0 = r6.get(r8)
            X.0Xa r0 = (X.C06120Xa) r0
            int r0 = r0.A04
            if (r0 != r5) goto L_0x044f
            java.lang.Object r8 = r6.get(r8)
            X.0Xa r8 = (X.C06120Xa) r8
        L_0x0435:
            X.C18070vi.A0b(r8)
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r10)
            X.0Js r0 = (X.AnonymousClass0Js) r0
            r8.A00 = r0
            X.0PS r0 = X.C03150Gu.A0T
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r0)
            X.0Js r0 = (X.AnonymousClass0Js) r0
            r8.A01 = r0
            r7.A12(r8)
            goto L_0x007d
        L_0x044f:
            int r8 = r8 + 1
            goto L_0x0423
        L_0x0452:
            r8 = 0
            goto L_0x0435
        L_0x0454:
            int r8 = r7.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r10 = 0
            r9 = 2048(0x800, float:2.87E-42)
            r7.A1E(r0, r10, r8, r9)
            int r8 = r7.A00(r5)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r7.A1E(r0, r10, r8, r9)
            goto L_0x007d
        L_0x046f:
            int r8 = r8 + 1
            goto L_0x00a4
        L_0x0473:
            X.0Xa r8 = new X.0Xa
            r8.<init>(r6, r5)
            r0 = 1
            goto L_0x00bb
        L_0x047b:
            if (r19 != 0) goto L_0x0487
            X.0Yb r0 = r4.A00()
            boolean r0 = X.C05170Qs.A0A(r0, r3)
            if (r0 == 0) goto L_0x0018
        L_0x0487:
            int r3 = r7.A00(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r0 = 2048(0x800, float:2.87E-42)
            r7.A1E(r2, r1, r3, r0)
            goto L_0x0018
        L_0x0497:
            java.lang.String r0 = "no value for specified key"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x049e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A1F(java.util.Map):void");
    }

    public static final boolean A1Q(Collection collection, int i, long j, boolean z) {
        AnonymousClass0PS r2;
        AnonymousClass0Js r3;
        if (!AnonymousClass000.A1P((j > AnonymousClass0QY.A02 ? 1 : (j == AnonymousClass0QY.A02 ? 0 : -1)))) {
            if (Float.isNaN(AnonymousClass0QY.A01(j)) || Float.isNaN(AnonymousClass0QY.A02(j))) {
                throw AnonymousClass000.A0n("Offset argument contained a NaN value.");
            }
            if (z) {
                r2 = C03150Gu.A0T;
            } else {
                r2 = C03150Gu.A08;
            }
            if (collection == null || !collection.isEmpty()) {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    AnonymousClass0HU r32 = (AnonymousClass0HU) it.next();
                    Rect rect = r32.A00;
                    AnonymousClass0NU r4 = new AnonymousClass0NU((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
                    if (AnonymousClass0QY.A01(j) >= r4.A01 && AnonymousClass0QY.A01(j) < r4.A02 && AnonymousClass0QY.A02(j) >= r4.A03 && AnonymousClass0QY.A02(j) < r4.A00 && (r3 = (AnonymousClass0Js) AnonymousClass0FY.A00(r32.A01.A0G(), r2)) != null) {
                        boolean z2 = r3.A00;
                        int i2 = i;
                        if (z2) {
                            i2 = -i;
                        }
                        if ((i != 0 || !z2) && i2 >= 0) {
                            if (AnonymousClass000.A04(r3.A01().invoke()) < AnonymousClass000.A04(r3.A00().invoke())) {
                                return true;
                            }
                        } else if (AnonymousClass000.A04(r3.A01().invoke()) > 0.0f) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int A1b(float f, float f2) {
        AnonymousClass0XV A032;
        AnonymousClass0QR r0;
        AndroidComposeView androidComposeView = this.A0P;
        androidComposeView.Bjc(true);
        C06850Zx r8 = new C06850Zx();
        AnonymousClass0XV root = androidComposeView.getRoot();
        long A0p = AnonymousClass001.A0p(f, f2);
        long j = AnonymousClass0QY.A03;
        root.A0f(r8, A0p, true);
        AnonymousClass0XW r02 = (AnonymousClass0XW) C29431cG.A0e(r8);
        if (r02 == null || (A032 = AnonymousClass0QV.A03(r02)) == null || (r0 = A032.A0S) == null || !AnonymousClass000.A1O(8 & r0.A01.A00) || !C05170Qs.A0F(AnonymousClass0FZ.A00(A032, false)) || androidComposeView.getAndroidViewsHandler$ui_release().A00.get(A032) != null) {
            return Integer.MIN_VALUE;
        }
        return A00(A032.A01);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A1d(X.C30391dr r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C07600bS
            if (r0 == 0) goto L_0x0030
            r7 = r12
            X.0bS r7 = (X.C07600bS) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0030
            int r2 = r2 - r1
            r7.label = r2
        L_0x0012:
            java.lang.Object r9 = r7.result
            X.1g4 r8 = X.AnonymousClass3F6.A03()
            int r0 = r7.label
            r1 = 0
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0048
            if (r0 == r5) goto L_0x003b
            if (r0 != r6) goto L_0x0036
            java.lang.Object r4 = r7.L$2
            X.DXm r4 = (X.C27177DXm) r4
            java.lang.Object r3 = r7.L$1
            X.016 r3 = (X.AnonymousClass016) r3
            java.lang.Object r2 = r7.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x0059
        L_0x0030:
            X.0bS r7 = new X.0bS
            r7.<init>(r11, r12)
            goto L_0x0012
        L_0x0036:
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0l()
            throw r1
        L_0x003b:
            java.lang.Object r4 = r7.L$2
            X.DXm r4 = (X.C27177DXm) r4
            java.lang.Object r3 = r7.L$1
            X.016 r3 = (X.AnonymousClass016) r3
            java.lang.Object r2 = r7.L$0
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r2 = (androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat) r2
            goto L_0x006b
        L_0x0048:
            X.C30691eM.A01(r9)
            r0 = 0
            X.016 r3 = new X.016     // Catch:{ all -> 0x00dc }
            r3.<init>(r0, r1, r5)     // Catch:{ all -> 0x00dc }
            X.5bm r0 = r11.A0a     // Catch:{ all -> 0x00dc }
            X.DXm r4 = r0.Bh9()     // Catch:{ all -> 0x00dc }
            r2 = r11
            goto L_0x005c
        L_0x0059:
            X.C30691eM.A01(r9)     // Catch:{ all -> 0x00da }
        L_0x005c:
            r7.L$0 = r2     // Catch:{ all -> 0x00da }
            r7.L$1 = r3     // Catch:{ all -> 0x00da }
            r7.L$2 = r4     // Catch:{ all -> 0x00da }
            r7.label = r5     // Catch:{ all -> 0x00da }
            java.lang.Object r9 = r4.A01(r7)     // Catch:{ all -> 0x00da }
            if (r9 != r8) goto L_0x006e
            goto L_0x00d0
        L_0x006b:
            X.C30691eM.A01(r9)     // Catch:{ all -> 0x00da }
        L_0x006e:
            boolean r0 = X.AnonymousClass000.A1Y(r9)     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d2
            r4.A00()     // Catch:{ all -> 0x00da }
            X.0NP r1 = r2.A06     // Catch:{ all -> 0x00da }
            r0 = 1
            if (r1 != 0) goto L_0x007d
            r0 = 0
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r2.A0g()     // Catch:{ all -> 0x00da }
        L_0x0082:
            boolean r0 = r2.A1n()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00b0
            X.016 r10 = r2.A0U     // Catch:{ all -> 0x00da }
            int r9 = r10.size()     // Catch:{ all -> 0x00da }
            r1 = 0
        L_0x008f:
            if (r1 >= r9) goto L_0x00a0
            java.lang.Object r0 = r10.A02(r1)     // Catch:{ all -> 0x00da }
            X.0XV r0 = (X.AnonymousClass0XV) r0     // Catch:{ all -> 0x00da }
            r2.A0r(r3, r0)     // Catch:{ all -> 0x00da }
            r2.A0t(r0)     // Catch:{ all -> 0x00da }
            int r1 = r1 + 1
            goto L_0x008f
        L_0x00a0:
            r3.clear()     // Catch:{ all -> 0x00da }
            boolean r0 = r2.A09     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x00b0
            r2.A09 = r5     // Catch:{ all -> 0x00da }
            android.os.Handler r1 = r2.A0R     // Catch:{ all -> 0x00da }
            java.lang.Runnable r0 = r2.A0W     // Catch:{ all -> 0x00da }
            r1.post(r0)     // Catch:{ all -> 0x00da }
        L_0x00b0:
            X.016 r0 = r2.A0U     // Catch:{ all -> 0x00da }
            r0.clear()     // Catch:{ all -> 0x00da }
            java.util.HashMap r0 = r2.A0X     // Catch:{ all -> 0x00da }
            r0.clear()     // Catch:{ all -> 0x00da }
            java.util.HashMap r0 = r2.A0Y     // Catch:{ all -> 0x00da }
            r0.clear()     // Catch:{ all -> 0x00da }
            r7.L$0 = r2     // Catch:{ all -> 0x00da }
            r7.L$1 = r3     // Catch:{ all -> 0x00da }
            r7.L$2 = r4     // Catch:{ all -> 0x00da }
            r7.label = r6     // Catch:{ all -> 0x00da }
            r0 = 100
            java.lang.Object r0 = X.C62882s9.A00(r7, r0)     // Catch:{ all -> 0x00da }
            if (r0 != r8) goto L_0x005c
            goto L_0x00d1
        L_0x00d0:
            return r8
        L_0x00d1:
            return r8
        L_0x00d2:
            X.016 r0 = r2.A0U
            r0.clear()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00da:
            r1 = move-exception
            goto L_0x00de
        L_0x00dc:
            r1 = move-exception
            r2 = r11
        L_0x00de:
            X.016 r0 = r2.A0U
            r0.clear()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A1d(X.1dr):java.lang.Object");
    }

    public final void A1e() {
        this.A0E = AnonymousClass00R.A00;
        A0e();
    }

    public final void A1f() {
        this.A0E = AnonymousClass00R.A00;
        A0f();
    }

    public final void A1h() {
        this.A0E = AnonymousClass00R.A01;
        A0i();
    }

    public final void A1i(LongSparseArray longSparseArray) {
        C05010Pz.A00.A04(longSparseArray, this);
    }

    public final void A1j(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.A0M;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            int i2 = Integer.MIN_VALUE;
            if (action == 7 || action == 9) {
                i2 = A1b(motionEvent.getX(), motionEvent.getY());
                this.A0P.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                i = this.A02;
                if (i == i2) {
                    return;
                }
            } else if (action == 10) {
                i = this.A02;
                if (i == Integer.MIN_VALUE) {
                    this.A0P.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    return;
                }
            } else {
                return;
            }
            this.A02 = i2;
            A1E((Integer) null, (List) null, i2, 128);
            A1E((Integer) null, (List) null, i, 256);
        }
    }

    public void C6E() {
        A13(this.A0P.getSemanticsOwner().A00());
        A0g();
    }

    public void C71(AnonymousClass1F9 r2) {
        A14(this.A0P.getSemanticsOwner().A00());
        A0g();
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [X.00O, X.00P] */
    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.A0P = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        this.A0M = accessibilityManager;
        this.A0S = new AnonymousClass0Rn(this);
        this.A0T = new C05280Ro(this);
        this.A08 = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.A0E = AnonymousClass00R.A00;
        this.A0R = new Handler(Looper.getMainLooper());
        this.A0D = new C25760ClV(new AnonymousClass05K(this));
        this.A01 = Integer.MIN_VALUE;
        this.A0X = new HashMap();
        this.A0Y = new HashMap();
        this.A0B = new AnonymousClass04B(10);
        this.A0C = new AnonymousClass04B(10);
        this.A00 = -1;
        this.A0U = new AnonymousClass016((AnonymousClass1Y1) null, 0, 1);
        this.A0a = AnonymousClass4W8.A01(C25691Pg.SUSPEND, 1);
        this.A0K = true;
        this.A0N = new AnonymousClass00O(0);
        this.A0O = new AnonymousClass016((AnonymousClass1Y1) null, 0, 1);
        this.A0H = AnonymousClass1D7.A0I();
        this.A0A = new AnonymousClass016((AnonymousClass1Y1) null, 0, 1);
        this.A0G = new HashMap();
        this.A0F = new HashMap();
        this.A0V = new CIY();
        this.A0I = new LinkedHashMap();
        this.A05 = new C03500Im(androidComposeView.getSemanticsOwner().A00(), AnonymousClass1D7.A0I());
        androidComposeView.addOnAttachStateChangeListener(new AnonymousClass0RY(this));
        this.A0W = new AnonymousClass0Z6(this);
        this.A0Q = AnonymousClass000.A13();
        this.A0Z = new C10050hi(this);
    }

    private final int A03(C05060Qg r4) {
        C06370Yb A0H2 = r4.A0H();
        if (!A0H2.A0B(C03150Gu.A02)) {
            AnonymousClass0PS r1 = C03150Gu.A0P;
            if (A0H2.A0B(r1)) {
                return AnonymousClass000.A0H(((C26260Cw5) A0H2.A01(r1)).A06());
            }
        }
        return this.A00;
    }

    private final int A04(C05060Qg r4) {
        C06370Yb A0H2 = r4.A0H();
        if (!A0H2.A0B(C03150Gu.A02)) {
            AnonymousClass0PS r1 = C03150Gu.A0P;
            if (A0H2.A0B(r1)) {
                return AnonymousClass000.A0G(((C26260Cw5) A0H2.A01(r1)).A06());
            }
        }
        return this.A00;
    }

    public static final int A05(Object obj, Object obj2, AnonymousClass1OS r2) {
        return AnonymousClass000.A0M(r2.invoke(obj, obj2));
    }

    private final AccessibilityEvent A0C(int i, int i2) {
        AnonymousClass0HU r0;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        AndroidComposeView androidComposeView = this.A0P;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i);
        if (A1n() && (r0 = (AnonymousClass0HU) AnonymousClass000.A0w(A0c(), i)) != null) {
            obtain.setPassword(r0.A01.A0G().A0B(C03150Gu.A0H));
        }
        return obtain;
    }

    public static final C26227CvJ A0S(C06370Yb r3) {
        C22821Di r1;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass0KP r12 = (AnonymousClass0KP) AnonymousClass0FY.A00(r3, C03120Gr.A07);
        if (r12 == null || (r1 = (C22821Di) r12.A00()) == null || !AnonymousClass000.A1Y(r1.invoke(A13))) {
            return null;
        }
        return (C26227CvJ) A13.get(0);
    }

    public static final CharSequence A0U(CharSequence charSequence) {
        int i = 100000;
        if (charSequence == null || charSequence.length() == 0 || charSequence.length() <= 100000) {
            return charSequence;
        }
        if (Character.isHighSurrogate(charSequence.charAt(99999)) && Character.isLowSurrogate(charSequence.charAt(100000))) {
            i = 99999;
        }
        CharSequence subSequence = charSequence.subSequence(0, i);
        C18070vi.A0z(subSequence, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return subSequence;
    }

    private final String A0W(C05060Qg r9) {
        float A042;
        Resources A0Y2;
        int i;
        C06370Yb A0H2 = r9.A0H();
        Object A002 = AnonymousClass0FY.A00(A0H2, C03150Gu.A0M);
        AnonymousClass0CK r1 = (AnonymousClass0CK) AnonymousClass0FY.A00(A0H2, C03150Gu.A0R);
        AnonymousClass0JM r6 = (AnonymousClass0JM) AnonymousClass0FY.A00(A0H2, C03150Gu.A0J);
        if (r1 != null) {
            int ordinal = r1.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2 && A002 == null) {
                        A0Y2 = AnonymousClass000.A0Y(this.A0P);
                        i = 2131899082;
                    }
                } else if (r6 != null && r6.A00 == 2 && A002 == null) {
                    A0Y2 = AnonymousClass000.A0Y(this.A0P);
                    i = 2131899285;
                }
            } else if (r6 != null && r6.A00 == 2 && A002 == null) {
                A0Y2 = AnonymousClass000.A0Y(this.A0P);
                i = 2131899287;
            }
            A002 = A0Y2.getString(i);
        }
        Boolean bool = (Boolean) AnonymousClass0FY.A00(A0H2, C03150Gu.A0L);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((r6 == null || r6.A00 != 4) && A002 == null) {
                Resources A0Y3 = AnonymousClass000.A0Y(this.A0P);
                int i2 = 2131899272;
                if (booleanValue) {
                    i2 = 2131899380;
                }
                A002 = A0Y3.getString(i2);
            }
        }
        C04600Oa r12 = (C04600Oa) AnonymousClass0FY.A00(A0H2, C03150Gu.A0I);
        if (r12 != null) {
            if (r12 != C04600Oa.A01) {
                if (A002 == null) {
                    AnonymousClass3MT A003 = r12.A00();
                    if (AnonymousClass000.A04(A003.BRH()) - AnonymousClass000.A04(A003.BZX()) == 0.0f) {
                        A042 = 0.0f;
                    } else {
                        A042 = (0.0f - AnonymousClass000.A04(A003.BZX())) / (AnonymousClass000.A04(A003.BRH()) - AnonymousClass000.A04(A003.BZX()));
                    }
                    float A022 = C28851b7.A02(A042, 0.0f, 1.0f);
                    int i3 = 0;
                    if (A022 != 0.0f) {
                        i3 = 100;
                        if (A022 != 1.0f) {
                            i3 = C22339B3q.A01(A022 * 100.0f);
                            if (i3 < 1) {
                                i3 = 1;
                            } else if (i3 > 99) {
                                i3 = 99;
                            }
                        }
                    }
                    A002 = AnonymousClass000.A0Y(this.A0P).getString(2131899474, new Object[]{Integer.valueOf(i3)});
                }
            } else if (A002 == null) {
                A002 = AnonymousClass000.A0Y(this.A0P).getString(2131899081);
            }
        }
        return (String) A002;
    }

    private final ArrayList A0Y(ArrayList arrayList, Map map, boolean z) {
        Object obj;
        ArrayList A13 = AnonymousClass000.A13();
        int A042 = AnonymousClass1ZU.A04(arrayList);
        int i = 0;
        if (A042 >= 0) {
            int i2 = 0;
            while (true) {
                C05060Qg r1 = (C05060Qg) arrayList.get(i2);
                if (i2 == 0 || !A1P(r1, A13)) {
                    A13.add(new AnonymousClass1D6(r1.A0D(), AnonymousClass1ZU.A06(r1)));
                }
                if (i2 == A042) {
                    break;
                }
                i2++;
            }
        }
        C29391cC.A0H(A13, C06720Zk.A00);
        ArrayList A132 = AnonymousClass000.A13();
        int size = A13.size();
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass1D6 r6 = (AnonymousClass1D6) A13.get(i3);
            List list = (List) r6.A07();
            if (z) {
                obj = C06680Zg.A00;
            } else {
                obj = C06670Zf.A00;
            }
            C29391cC.A0H(list, new C06650Zd(new C06660Ze(AnonymousClass0XV.A0V, obj, 0), 5));
            A132.addAll((Collection) r6.A07());
        }
        C29391cC.A0H(A132, new C06650Zd(C14670pO.A00, 4));
        while (i <= AnonymousClass1ZU.A04(A132)) {
            List list2 = (List) AnonymousClass000.A0w(map, ((C05060Qg) A132.get(i)).A02);
            if (list2 != null) {
                if (!A1M((C05060Qg) A132.get(i))) {
                    A132.remove(i);
                } else {
                    i++;
                }
                A132.addAll(i, list2);
                i += list2.size();
            } else {
                i++;
            }
        }
        return A132;
    }

    private final void A0e() {
        AnonymousClass0KP r0;
        C18090vk r02;
        for (AnonymousClass0HU r03 : A0c().values()) {
            C06370Yb A0H2 = r03.A01.A0H();
            if (!(AnonymousClass0FY.A00(A0H2, C03150Gu.A0D) == null || (r0 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A00)) == null || (r02 = (C18090vk) r0.A00()) == null)) {
                r02.invoke();
            }
        }
    }

    private final void A0f() {
        AnonymousClass0KP r0;
        C22821Di r1;
        for (AnonymousClass0HU r02 : A0c().values()) {
            C06370Yb A0H2 = r02.A01.A0H();
            if (!(!C18070vi.A18(AnonymousClass0FY.A00(A0H2, C03150Gu.A0D), AnonymousClass000.A0i()) || (r0 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0O)) == null || (r1 = (C22821Di) r0.A00()) == null)) {
                r1.invoke(AnonymousClass000.A0h());
            }
        }
    }

    private final void A0i() {
        AnonymousClass0KP r0;
        C22821Di r1;
        for (AnonymousClass0HU r02 : A0c().values()) {
            C06370Yb A0H2 = r02.A01.A0H();
            if (!(!C18070vi.A18(AnonymousClass0FY.A00(A0H2, C03150Gu.A0D), AnonymousClass000.A0h()) || (r0 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0O)) == null || (r1 = (C22821Di) r0.A00()) == null)) {
                r1.invoke(AnonymousClass000.A0i());
            }
        }
    }

    private final void A0l(int i, int i2, String str) {
        AccessibilityEvent A0C2 = A0C(A00(i), 32);
        A0C2.setContentChangeTypes(i2);
        if (str != null) {
            A0C2.getText().add(str);
        }
        A0p(A0C2);
    }

    private final void A0p(AccessibilityEvent accessibilityEvent) {
        if (A1n()) {
            if (accessibilityEvent.getEventType() == 2048 || accessibilityEvent.getEventType() == 32768) {
                this.A0L = true;
            }
            try {
                this.A0J.invoke(accessibilityEvent);
            } finally {
                this.A0L = false;
            }
        }
    }

    private final void A15(C05060Qg r7) {
        AnonymousClass0KP r0;
        C22821Di r02;
        C22821Di r03;
        C06370Yb A0H2 = r7.A0H();
        Object A002 = AnonymousClass0FY.A00(A0H2, C03150Gu.A0D);
        Integer num = this.A0E;
        Integer num2 = AnonymousClass00R.A00;
        Boolean A0h = AnonymousClass000.A0h();
        Boolean A0i = AnonymousClass000.A0i();
        if (num == num2 && C18070vi.A18(A002, A0i)) {
            AnonymousClass0KP r04 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0O);
            if (r04 != null && (r03 = (C22821Di) r04.A00()) != null) {
                r03.invoke(A0h);
            }
        } else if (this.A0E == AnonymousClass00R.A01 && C18070vi.A18(A002, A0h) && (r0 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0O)) != null && (r02 = (C22821Di) r0.A00()) != null) {
            r02.invoke(A0i);
        }
    }

    private final void A16(C05060Qg r2, C26228CvK cvK) {
        cvK.A0d(A1N(r2));
    }

    private final void A17(C05060Qg r2, C26228CvK cvK) {
        cvK.A0W(A0W(r2));
    }

    private final void A18(C05060Qg r2, C26228CvK cvK) {
        cvK.A0X(A0A(r2));
    }

    public static final void A19(C05060Qg r8, C26228CvK cvK) {
        int size;
        C25475CgU A002;
        AnonymousClass0HW r0 = (AnonymousClass0HW) AnonymousClass0FY.A00(r8.A0G(), C03150Gu.A00);
        if (r0 != null) {
            A002 = A0T(r0);
        } else {
            ArrayList A13 = AnonymousClass000.A13();
            if (AnonymousClass0FY.A00(r8.A0G(), C03150Gu.A0K) != null) {
                List A032 = C05060Qg.A03(r8, false, true);
                int size2 = A032.size();
                for (int i = 0; i < size2; i++) {
                    C05060Qg r2 = (C05060Qg) A032.get(i);
                    if (r2.A0G().A0B(C03150Gu.A0L)) {
                        A13.add(r2);
                    }
                }
            }
            int i2 = 1;
            if (!A13.isEmpty()) {
                if (A1R(A13)) {
                    size = 1;
                    i2 = A13.size();
                } else {
                    size = A13.size();
                }
                A002 = C25475CgU.A00(size, i2, 0, false);
            } else {
                return;
            }
        }
        cvK.A0Z(A002);
    }

    public static final void A1A(C05060Qg r10, C26228CvK cvK) {
        AnonymousClass0FY.A00(r10.A0G(), C03150Gu.A01);
        C05060Qg A0J2 = r10.A0J();
        if (A0J2 != null && AnonymousClass0FY.A00(A0J2.A0G(), C03150Gu.A0K) != null) {
            AnonymousClass0HW r1 = (AnonymousClass0HW) AnonymousClass0FY.A00(A0J2.A0G(), C03150Gu.A00);
            if (r1 == null || (r1.A01 >= 0 && r1.A00 >= 0)) {
                C06370Yb A0G2 = r10.A0G();
                AnonymousClass0PS r2 = C03150Gu.A0L;
                if (A0G2.A0B(r2)) {
                    ArrayList A13 = AnonymousClass000.A13();
                    List A032 = C05060Qg.A03(A0J2, false, true);
                    int size = A032.size();
                    int i = 0;
                    for (int i2 = 0; i2 < size; i2++) {
                        C05060Qg r12 = (C05060Qg) A032.get(i2);
                        if (r12.A0G().A0B(r2)) {
                            A13.add(r12);
                            if (r12.A03.A0Q.A0G.A02 < r10.A03.A0Q.A0G.A02) {
                                i++;
                            }
                        }
                    }
                    if (!A13.isEmpty()) {
                        int i3 = 0;
                        if (!A1R(A13)) {
                            i3 = i;
                            i = 0;
                        }
                        cvK.A0a(C25476CgV.A00(i3, 1, i, 1, false, AnonymousClass000.A1Y(r10.A0G().A02(r2, C09330gX.A00))));
                    }
                }
            }
        }
    }

    public static final void A1B(C05060Qg r2, C26228CvK cvK) {
        C06370Yb A0H2 = r2.A0H();
        AnonymousClass0PS r1 = C03150Gu.A05;
        if (A0H2.A0B(r1)) {
            cvK.A09();
            cvK.A0R((CharSequence) AnonymousClass0FY.A00(A0H2, r1));
        }
    }

    public static final boolean A1J(AnonymousClass0Js r3) {
        C18090vk A012 = r3.A01();
        if (AnonymousClass000.A04(A012.invoke()) > 0.0f && !r3.A00) {
            return true;
        }
        if (AnonymousClass000.A04(A012.invoke()) >= AnonymousClass000.A04(r3.A00().invoke()) || !r3.A00) {
            return false;
        }
        return true;
    }

    public static final boolean A1K(AnonymousClass0Js r3) {
        C18090vk A012 = r3.A01();
        if (AnonymousClass000.A04(A012.invoke()) < AnonymousClass000.A04(r3.A00().invoke()) && !r3.A00) {
            return true;
        }
        if (AnonymousClass000.A04(A012.invoke()) <= 0.0f || !r3.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (A1N(r4) != false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A1M(X.C05060Qg r4) {
        /*
            r3 = this;
            java.lang.String r0 = X.C05170Qs.A03(r4)
            r2 = 0
            if (r0 != 0) goto L_0x001a
            android.text.SpannableString r0 = r3.A0A(r4)
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = r3.A0W(r4)
            if (r0 != 0) goto L_0x001a
            boolean r0 = A1N(r4)
            r1 = 0
            if (r0 == 0) goto L_0x001b
        L_0x001a:
            r1 = 1
        L_0x001b:
            X.0Yb r0 = r4.A0H()
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x002d
            boolean r0 = r4.A0M()
            if (r0 == 0) goto L_0x002e
            if (r1 == 0) goto L_0x002e
        L_0x002d:
            r2 = 1
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A1M(X.0Qg):boolean");
    }

    public static final boolean A1N(C05060Qg r4) {
        C06370Yb A0H2 = r4.A0H();
        Object A002 = AnonymousClass0FY.A00(A0H2, C03150Gu.A0R);
        AnonymousClass0JM r1 = (AnonymousClass0JM) AnonymousClass0FY.A00(A0H2, C03150Gu.A0J);
        boolean A1W = AnonymousClass000.A1W(A002);
        if (AnonymousClass0FY.A00(A0H2, C03150Gu.A0L) == null) {
            return A1W;
        }
        if (r1 == null || r1.A00 != 4) {
            return true;
        }
        return A1W;
    }

    private final boolean A1O(C05060Qg r12, int i, int i2, boolean z) {
        String A0X2;
        Integer num;
        C06370Yb A0H2 = r12.A0H();
        AnonymousClass0PS r1 = C03120Gr.A0L;
        boolean z2 = false;
        if (!A0H2.A0B(r1) || !C05170Qs.A0B(r12)) {
            if ((i == i2 && i2 == this.A00) || (A0X2 = A0X(r12)) == null) {
                return false;
            }
            if (i < 0 || i != i2 || i2 > A0X2.length()) {
                i = -1;
            }
            this.A00 = i;
            int length = A0X2.length();
            if (length > 0) {
                z2 = true;
            }
            int i3 = r12.A02;
            int A002 = A00(i3);
            Integer num2 = null;
            if (z2) {
                num = Integer.valueOf(this.A00);
                num2 = Integer.valueOf(length);
            } else {
                num = null;
            }
            A0p(A0D(A0X2, num, num, num2, A002));
            A0k(i3);
            return true;
        }
        C36001nB r3 = (C36001nB) ((AnonymousClass0KP) A0H2.A01(r1)).A00();
        if (r3 != null) {
            return AnonymousClass000.A1Y(r3.invoke(Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(z)));
        }
        return false;
    }

    public static final boolean A1P(C05060Qg r12, ArrayList arrayList) {
        float f = r12.A0D().A03;
        float f2 = r12.A0D().A00;
        boolean A1Q = AnonymousClass000.A1Q((f > f2 ? 1 : (f == f2 ? 0 : -1)));
        int A042 = AnonymousClass1ZU.A04(arrayList);
        if (A042 >= 0) {
            int i = 0;
            while (true) {
                AnonymousClass0NU r8 = (AnonymousClass0NU) ((AnonymousClass1D6) arrayList.get(i)).A06();
                boolean A1Q2 = AnonymousClass000.A1Q((r8.A03 > r8.A00 ? 1 : (r8.A03 == r8.A00 ? 0 : -1)));
                if (!A1Q && !A1Q2) {
                    float f3 = r8.A03;
                    float max = Math.max(f, f3);
                    float f4 = r8.A00;
                    if (max < Math.min(f2, f4)) {
                        arrayList.set(i, new AnonymousClass1D6(new AnonymousClass0NU(Math.max(r8.A01, 0.0f), Math.max(f3, f), Math.min(r8.A02, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((AnonymousClass1D6) arrayList.get(i)).A07()));
                        ((List) ((AnonymousClass1D6) arrayList.get(i)).A07()).add(r12);
                        return true;
                    }
                }
                if (i == A042) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A1R(java.util.List r11) {
        /*
            int r1 = r11.size()
            r0 = 2
            r6 = 1
            if (r1 < r0) goto L_0x00c8
            int r0 = r11.size()
            r1 = 0
            if (r0 == 0) goto L_0x0076
            int r0 = r11.size()
            if (r0 == r6) goto L_0x0076
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.Object r9 = r11.get(r1)
            int r4 = X.AnonymousClass1ZU.A04(r11)
            r3 = 0
        L_0x0022:
            if (r3 >= r4) goto L_0x007a
            int r3 = r3 + 1
            java.lang.Object r10 = r11.get(r3)
            r8 = r10
            X.0Qg r8 = (X.C05060Qg) r8
            X.0Qg r9 = (X.C05060Qg) r9
            X.0NU r0 = r9.A0C()
            long r0 = r0.A00()
            float r2 = X.AnonymousClass0QY.A01(r0)
            X.0NU r0 = r8.A0C()
            long r0 = r0.A00()
            float r0 = X.AnonymousClass0QY.A01(r0)
            float r2 = r2 - r0
            float r7 = java.lang.Math.abs(r2)
            X.0NU r0 = r9.A0C()
            long r0 = r0.A00()
            float r2 = X.AnonymousClass0QY.A02(r0)
            X.0NU r0 = r8.A0C()
            long r0 = r0.A00()
            float r0 = X.AnonymousClass0QY.A02(r0)
            float r2 = r2 - r0
            float r0 = java.lang.Math.abs(r2)
            long r0 = X.AnonymousClass001.A0p(r7, r0)
            X.0QY r0 = X.AnonymousClass000.A0e(r0)
            r5.add(r0)
            r9 = r10
            goto L_0x0022
        L_0x0076:
            X.0wS r5 = X.AnonymousClass1ZU.A09()
        L_0x007a:
            int r0 = r5.size()
            if (r0 != r6) goto L_0x0096
            java.lang.Object r1 = X.C29431cG.A0b(r5)
        L_0x0084:
            X.0QY r1 = (X.AnonymousClass0QY) r1
            long r2 = r1.A00
            float r1 = X.AnonymousClass0QY.A01(r2)
            float r0 = X.AnonymousClass0QY.A02(r2)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00c8
            r6 = 0
            return r6
        L_0x0096:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x00c0
            java.lang.Object r1 = X.C29431cG.A0b(r5)
            int r7 = X.AnonymousClass1ZU.A04(r5)
            if (r6 > r7) goto L_0x0084
            r4 = 1
        L_0x00a7:
            java.lang.Object r0 = r5.get(r4)
            X.0QY r0 = (X.AnonymousClass0QY) r0
            long r2 = r0.A00
            X.0QY r1 = (X.AnonymousClass0QY) r1
            long r0 = r1.A00
            long r0 = X.AnonymousClass0QY.A05(r0, r2)
            X.0QY r1 = X.AnonymousClass000.A0e(r0)
            if (r4 == r7) goto L_0x0084
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00c0:
            java.lang.String r1 = "Empty collection can't be reduced."
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x00c8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A1R(java.util.List):boolean");
    }

    public final AndroidComposeView A1c() {
        return this.A0P;
    }

    public final void A1m(Consumer consumer, long[] jArr) {
        C05010Pz.A03(this, consumer, jArr);
    }

    public final boolean A1o(int i, long j, boolean z) {
        if (!C18070vi.A18(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return false;
        }
        return A1Q(A0c().values(), i, j, z);
    }

    public C25760ClV A1a(View view) {
        return this.A0D;
    }

    public final void A1l(AnonymousClass0NP r1) {
        this.A06 = r1;
    }

    private final void A1C(C05060Qg r18, C26228CvK cvK, int i) {
        C26137Ct0 ct0;
        C26137Ct0 ct02;
        C26137Ct0 ct03;
        String str;
        ClipDescription primaryClipDescription;
        Resources A0Y2;
        int i2;
        C26228CvK cvK2 = cvK;
        cvK2.A0O("android.view.View");
        C05060Qg r3 = r18;
        C06370Yb A0H2 = r3.A0H();
        AnonymousClass0JM r1 = (AnonymousClass0JM) AnonymousClass0FY.A00(A0H2, C03150Gu.A0J);
        if (r1 != null && (r3.A00 || C05060Qg.A03(r3, false, true).isEmpty())) {
            int i3 = r1.A00;
            if (i3 == 4) {
                A0Y2 = AnonymousClass000.A0Y(this.A0P);
                i2 = 2131899472;
            } else if (i3 == 2) {
                A0Y2 = AnonymousClass000.A0Y(this.A0P);
                i2 = 2131899471;
            } else {
                String A022 = C05170Qs.A02(i3);
                if (i3 != 5 || r3.A0M() || A0H2.A0A()) {
                    cvK2.A0O(A022);
                }
            }
            cvK2.A0V(A0Y2.getString(i2));
        }
        AnonymousClass0PS r11 = C03120Gr.A0M;
        if (A0H2.A0B(r11)) {
            cvK2.A0O("android.widget.EditText");
        }
        if (r3.A0G().A0B(C03150Gu.A0O)) {
            cvK2.A0O("android.widget.TextView");
        }
        AndroidComposeView androidComposeView = this.A0P;
        cvK2.A0T(androidComposeView.getContext().getPackageName());
        cvK2.A0l(C05170Qs.A0E(r3));
        List A032 = C05060Qg.A03(r3, false, true);
        int size = A032.size();
        for (int i4 = 0; i4 < size; i4++) {
            C05060Qg r14 = (C05060Qg) A032.get(i4);
            if (C05060Qg.A08(r14, A0c())) {
                androidComposeView.getAndroidViewsHandler$ui_release().A00.get(r14.A03);
                if (r14.A02 != -1) {
                    cvK2.A0G(androidComposeView, r14.A02);
                }
            }
        }
        int i5 = i;
        if (i5 == this.A01) {
            cvK2.A0c(true);
            ct0 = C26137Ct0.A05;
        } else {
            cvK2.A0c(false);
            ct0 = C26137Ct0.A04;
        }
        cvK2.A0L(ct0);
        A18(r3, cvK2);
        A1B(r3, cvK2);
        A17(r3, cvK2);
        A16(r3, cvK2);
        Object A002 = AnonymousClass0FY.A00(A0H2, C03150Gu.A0R);
        if (A002 != null) {
            if (A002 == AnonymousClass0CK.On) {
                cvK2.A0e(true);
            } else if (A002 == AnonymousClass0CK.Off) {
                cvK2.A0e(false);
            }
        }
        AnonymousClass0PS r10 = C03150Gu.A0L;
        Boolean bool = (Boolean) AnonymousClass0FY.A00(A0H2, r10);
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (r1 == null || r1.A00 != 4) {
                cvK2.A0e(booleanValue);
            } else {
                cvK2.A0q(booleanValue);
            }
        }
        if (!A0H2.A0A() || C05060Qg.A03(r3, false, true).isEmpty()) {
            cvK2.A0Q(C05170Qs.A03(r3));
        }
        AnonymousClass0PS r12 = C03150Gu.A0N;
        String str2 = (String) AnonymousClass0FY.A00(A0H2, r12);
        if (str2 != null) {
            C05060Qg r16 = r3;
            while (true) {
                C06370Yb A0H3 = r16.A0H();
                AnonymousClass0PS r142 = AnonymousClass0GI.A00;
                if (!A0H3.A0B(r142)) {
                    r16 = r16.A0J();
                    if (r16 == null) {
                        break;
                    }
                } else if (AnonymousClass000.A1Y(A0H3.A01(r142))) {
                    cvK2.A0b(str2);
                }
            }
        }
        if (AnonymousClass0FY.A00(A0H2, C03150Gu.A07) != null) {
            cvK2.A0k(true);
        }
        cvK2.A0n(r3.A0G().A0B(C03150Gu.A0H));
        cvK2.A0g(A0H2.A0B(r11));
        cvK2.A0h(C05170Qs.A0B(r3));
        AnonymousClass0PS r143 = C03150Gu.A06;
        cvK2.A0i(A0H2.A0B(r143));
        if (cvK2.A0t()) {
            cvK2.A0j(AnonymousClass000.A1Y(A0H2.A01(r143)));
            if (cvK2.A0u()) {
                cvK2.A0A(2);
            } else {
                cvK2.A0A(1);
            }
        }
        cvK2.A0s(C05170Qs.A0F(r3));
        AnonymousClass0FY.A00(A0H2, C03150Gu.A0F);
        cvK2.A0f(false);
        AnonymousClass0KP r144 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A09);
        if (r144 != null) {
            boolean A18 = C18070vi.A18(AnonymousClass0FY.A00(A0H2, r10), true);
            cvK2.A0f(!A18);
            if (C05170Qs.A0B(r3) && !A18) {
                cvK2.A0L(new C26137Ct0(16, (CharSequence) r144.A00));
            }
        }
        cvK2.A0m(false);
        AnonymousClass0KP r102 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0B);
        if (r102 != null) {
            cvK2.A0m(true);
            if (C05170Qs.A0B(r3)) {
                cvK2.A0L(new C26137Ct0(32, (CharSequence) r102.A00));
            }
        }
        AnonymousClass0KP r0 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A02);
        if (r0 != null) {
            cvK2.A0L(new C26137Ct0(16384, (CharSequence) r0.A00));
        }
        if (C05170Qs.A0B(r3)) {
            AnonymousClass0KP r02 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, r11);
            if (r02 != null) {
                cvK2.A0L(new C26137Ct0(2097152, (CharSequence) r02.A00));
            }
            AnonymousClass0KP r03 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0A);
            if (r03 != null) {
                cvK2.A0L(new C26137Ct0(16908372, (CharSequence) r03.A00));
            }
            AnonymousClass0KP r04 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A04);
            if (r04 != null) {
                cvK2.A0L(new C26137Ct0(65536, (CharSequence) r04.A00));
            }
            AnonymousClass0KP r112 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0G);
            if (r112 != null && cvK2.A0u() && (primaryClipDescription = androidComposeView.getClipboardManager().A00.getPrimaryClipDescription()) != null && primaryClipDescription.hasMimeType("text/*")) {
                cvK2.A0L(new C26137Ct0(32768, (CharSequence) r112.A00));
            }
        }
        String A0X2 = A0X(r3);
        String str3 = null;
        if (!(A0X2 == null || A0X2.length() == 0)) {
            cvK2.A0C(A04(r3), A03(r3));
            AnonymousClass0KP r05 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A0L);
            if (r05 != null) {
                str3 = r05.A00;
            }
            cvK2.A0L(new C26137Ct0((int) A7Y.A0F, (CharSequence) str3));
            cvK2.A0A(256);
            cvK2.A0A(512);
            cvK2.A0B(11);
            List list = (List) AnonymousClass0FY.A00(A0H2, C03150Gu.A02);
            if ((list == null || list.isEmpty()) && A0H2.A0B(C03120Gr.A07) && !C05170Qs.A0C(r3)) {
                cvK2.A0B(cvK2.A05() | 4 | 16);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            ArrayList A13 = AnonymousClass000.A13();
            A13.add("androidx.compose.ui.semantics.id");
            CharSequence A072 = cvK2.A07();
            if (!(A072 == null || A072.length() == 0 || !A0H2.A0B(C03120Gr.A07))) {
                A13.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (A0H2.A0B(r12)) {
                A13.add("androidx.compose.ui.semantics.testTag");
            }
            AnonymousClass0F9.A00(cvK2.A06(), A13);
        }
        C04600Oa r103 = (C04600Oa) AnonymousClass0FY.A00(A0H2, C03150Gu.A0I);
        if (r103 != null) {
            AnonymousClass0PS r122 = C03120Gr.A0K;
            if (A0H2.A0B(r122)) {
                str = "android.widget.SeekBar";
            } else {
                str = "android.widget.ProgressBar";
            }
            cvK2.A0O(str);
            if (r103 != C04600Oa.A01) {
                AnonymousClass3MT A003 = r103.A00();
                cvK2.A0N(C25477CgW.A00(AnonymousClass000.A04(A003.BZX()), AnonymousClass000.A04(A003.BRH()), 0.0f, 1));
            }
            if (A0H2.A0B(r122) && C05170Qs.A0B(r3)) {
                AnonymousClass3MT A004 = r103.A00();
                float A042 = AnonymousClass000.A04(A004.BRH());
                float A043 = AnonymousClass000.A04(A004.BZX());
                if (A042 < A043) {
                    A042 = A043;
                }
                if (0.0f < A042) {
                    cvK2.A0L(C26137Ct0.A0Z);
                }
                float A044 = AnonymousClass000.A04(A004.BZX());
                float A045 = AnonymousClass000.A04(A004.BRH());
                if (A044 > A045) {
                    A044 = A045;
                }
                if (0.0f > A044) {
                    cvK2.A0L(C26137Ct0.A0X);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            AnonymousClass0FA.A00(r3, cvK2);
        }
        A19(r3, cvK2);
        A1A(r3, cvK2);
        AnonymousClass0Js r104 = (AnonymousClass0Js) AnonymousClass0FY.A00(A0H2, C03150Gu.A08);
        Object A005 = AnonymousClass0FY.A00(A0H2, C03120Gr.A0I);
        if (!(r104 == null || A005 == null)) {
            if (AnonymousClass0FY.A00(r3.A0G(), C03150Gu.A00) == null && AnonymousClass0FY.A00(r3.A0G(), C03150Gu.A0K) == null) {
                cvK2.A0O("android.widget.HorizontalScrollView");
            }
            if (AnonymousClass000.A04(r104.A00().invoke()) > 0.0f) {
                cvK2.A0p(true);
            }
            if (C05170Qs.A0B(r3)) {
                if (A1K(r104)) {
                    cvK2.A0L(C26137Ct0.A0Z);
                    if (r3.A03.A0N() == C24246By4.Rtl) {
                        ct03 = C26137Ct0.A0b;
                    } else {
                        ct03 = C26137Ct0.A0c;
                    }
                    cvK2.A0L(ct03);
                }
                if (A1J(r104)) {
                    cvK2.A0L(C26137Ct0.A0X);
                    if (r3.A03.A0N() == C24246By4.Rtl) {
                        ct02 = C26137Ct0.A0c;
                    } else {
                        ct02 = C26137Ct0.A0b;
                    }
                    cvK2.A0L(ct02);
                }
            }
        }
        AnonymousClass0Js r13 = (AnonymousClass0Js) AnonymousClass0FY.A00(A0H2, C03150Gu.A0T);
        if (!(r13 == null || A005 == null)) {
            if (AnonymousClass0FY.A00(r3.A0G(), C03150Gu.A00) == null && AnonymousClass0FY.A00(r3.A0G(), C03150Gu.A0K) == null) {
                cvK2.A0O("android.widget.ScrollView");
            }
            if (AnonymousClass000.A04(r13.A00().invoke()) > 0.0f) {
                cvK2.A0p(true);
            }
            if (C05170Qs.A0B(r3)) {
                if (A1K(r13)) {
                    cvK2.A0L(C26137Ct0.A0Z);
                    cvK2.A0L(C26137Ct0.A0Y);
                }
                if (A1J(r13)) {
                    cvK2.A0L(C26137Ct0.A0X);
                    cvK2.A0L(C26137Ct0.A0e);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass0FB.A00(r3, cvK2);
        }
        cvK2.A0U((CharSequence) AnonymousClass0FY.A00(A0H2, C03150Gu.A0G));
        if (C05170Qs.A0B(r3)) {
            AnonymousClass0KP r06 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A06);
            if (r06 != null) {
                cvK2.A0L(new C26137Ct0(262144, (CharSequence) r06.A00));
            }
            AnonymousClass0KP r07 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A01);
            if (r07 != null) {
                cvK2.A0L(new C26137Ct0(524288, (CharSequence) r07.A00));
            }
            AnonymousClass0KP r08 = (AnonymousClass0KP) AnonymousClass0FY.A00(A0H2, C03120Gr.A05);
            if (r08 != null) {
                cvK2.A0L(new C26137Ct0(1048576, (CharSequence) r08.A00));
            }
            AnonymousClass0PS r15 = C03120Gr.A03;
            if (A0H2.A0B(r15)) {
                List list2 = (List) A0H2.A01(r15);
                int size2 = list2.size();
                int[] iArr = A0b;
                if (size2 < 32) {
                    AnonymousClass04B r105 = new AnonymousClass04B(10);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    AnonymousClass04B r8 = this.A0C;
                    if (AnonymousClass00Q.A00(r8.A01, r8.A00, i5) >= 0) {
                        Object A006 = AnonymousClass0LW.A00(r8, i5);
                        ArrayList arrayList = new ArrayList(32);
                        int i6 = 0;
                        do {
                            arrayList.add(Integer.valueOf(iArr[i6]));
                            i6++;
                        } while (i6 < 32);
                        ArrayList A132 = AnonymousClass000.A13();
                        if (0 < list2.size()) {
                            list2.get(0);
                            C18070vi.A0b(A006);
                            throw AnonymousClass000.A0s("getLabel");
                        } else if (0 < A132.size()) {
                            A132.get(0);
                            ((Number) arrayList.get(0)).intValue();
                            throw AnonymousClass000.A0s("getLabel");
                        }
                    } else if (0 < list2.size()) {
                        list2.get(0);
                        throw AnonymousClass000.A0s("getLabel");
                    }
                    this.A0B.A02(i5, r105);
                    r8.A02(i5, linkedHashMap);
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("Can't have more than ");
                    A10.append(32);
                    throw AnonymousClass000.A0o(" custom actions for one widget", A10);
                }
            }
        }
        cvK2.A0o(A1M(r3));
        HashMap hashMap = this.A0G;
        Integer valueOf = Integer.valueOf(i5);
        Number number = (Number) hashMap.get(valueOf);
        if (number != null) {
            AnonymousClass05F androidViewsHandler$ui_release = androidComposeView.getAndroidViewsHandler$ui_release();
            int intValue = number.intValue();
            C05170Qs.A07(androidViewsHandler$ui_release, intValue);
            cvK2.A0J(androidComposeView, intValue);
            A0m(i5, cvK2.A06(), "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL", (Bundle) null);
        }
        Number number2 = (Number) this.A0F.get(valueOf);
        if (number2 != null) {
            C05170Qs.A07(androidComposeView.getAndroidViewsHandler$ui_release(), number2.intValue());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v41, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v42, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v51, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v77, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v78, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v79, resolved type: java.lang.Boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v80, resolved type: java.lang.Boolean} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List, java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v44, types: [java.lang.String] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0187, code lost:
        r1 = java.lang.Float.valueOf(r2);
        r0 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0191, code lost:
        r0 = r1.BZM();
        r3 = new X.AnonymousClass0NU(0.0f, 0.0f, X.AnonymousClass000.A02(r0), (float) X.AnonymousClass000.A0H(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x01a5, code lost:
        r1 = (X.AnonymousClass0Js) X.AnonymousClass0FY.A00(r8, X.C03150Gu.A0T);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01ad, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01af, code lost:
        if (r11 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b1, code lost:
        r2 = X.AnonymousClass0QG.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01b5, code lost:
        if (r13 != false) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01b7, code lost:
        if (r16 == false) goto L_0x01ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01b9, code lost:
        r2 = -r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01bc, code lost:
        if (r1.A00 == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01be, code lost:
        r2 = -r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01c3, code lost:
        if (A1L(r1, r2) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01c5, code lost:
        r4 = (X.AnonymousClass1OS) r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01cb, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01cd, code lost:
        r1 = java.lang.Float.valueOf(0.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x031e, code lost:
        r0 = java.lang.Float.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0322, code lost:
        r0 = r4.invoke(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x036b, code lost:
        r0 = r1.invoke(java.lang.Float.valueOf(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x044d, code lost:
        if (r7 != false) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0455, code lost:
        if (r7 != false) goto L_0x0439;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x045c, code lost:
        if (r7 != false) goto L_0x040e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008b, code lost:
        r3 = false;
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (r2 == 8192) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0094, code lost:
        r16 = false;
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009a, code lost:
        if (r2 == 16908345) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009c, code lost:
        r15 = false;
        r14 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a1, code lost:
        if (r2 == 16908347) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a3, code lost:
        r14 = false;
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        if (r2 == 16908344) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00aa, code lost:
        r13 = false;
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        if (r2 == 16908346) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b2, code lost:
        if (r15 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        if (r14 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b6, code lost:
        if (r3 != false) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b8, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b9, code lost:
        if (r16 == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00bb, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00bc, code lost:
        if (r13 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00be, code lost:
        if (r0 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
        if (r3 != false) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c2, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00c3, code lost:
        if (r16 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c5, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00c6, code lost:
        if (r3 != false) goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00c8, code lost:
        if (r16 == false) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ca, code lost:
        r2 = r5.A0H();
        r1 = (X.C04600Oa) X.AnonymousClass0FY.A00(r2, X.C03150Gu.A0I);
        r6 = (X.AnonymousClass0KP) X.AnonymousClass0FY.A00(r2, X.C03120Gr.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00de, code lost:
        if (r1 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e0, code lost:
        if (r6 == null) goto L_0x0123;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e2, code lost:
        r4 = r1.A00();
        r3 = X.AnonymousClass000.A04(r4.BRH());
        r1 = X.AnonymousClass000.A04(r4.BZX());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f8, code lost:
        if (r3 >= r1) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fa, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fb, code lost:
        r2 = X.AnonymousClass000.A04(r4.BZX());
        r1 = X.AnonymousClass000.A04(r4.BRH());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x010d, code lost:
        if (r2 <= r1) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x010f, code lost:
        r2 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0110, code lost:
        r3 = (r3 - r2) / 20.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0114, code lost:
        if (r16 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0116, code lost:
        r3 = -r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0117, code lost:
        r1 = (X.C22821Di) r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011d, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011f, code lost:
        r0 = 0.0f + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0123, code lost:
        r6 = r5.A03;
        r1 = r6.A0G();
        r0 = r1.BWE();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x012d, code lost:
        if (r0 == null) goto L_0x0191;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x012f, code lost:
        r3 = r0.Bhs(r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0133, code lost:
        r9 = X.AnonymousClass001.A0p(r3.A02 - r3.A01, r3.A00 - r3.A03);
        r0 = X.AnonymousClass0QG.A02;
        r8 = r5.A0H();
        r5 = (X.AnonymousClass0KP) X.AnonymousClass0FY.A00(r8, X.C03120Gr.A0I);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x014f, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0151, code lost:
        r4 = (X.AnonymousClass0Js) X.AnonymousClass0FY.A00(r8, X.C03150Gu.A08);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x015a, code lost:
        if (r4 == null) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x015c, code lost:
        if (r12 == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015e, code lost:
        r2 = X.AnonymousClass0QG.A02(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0162, code lost:
        if (r15 != false) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0164, code lost:
        if (r16 == false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0166, code lost:
        r2 = -r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0169, code lost:
        if (r4.A00 == false) goto L_0x016c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016b, code lost:
        r2 = -r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0172, code lost:
        if (r6.A0N() != X.C24246By4.Rtl) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0174, code lost:
        if (r15 != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0176, code lost:
        if (r14 == false) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0178, code lost:
        r2 = -r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x017d, code lost:
        if (A1L(r4, r2) == false) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x017f, code lost:
        r4 = (X.AnonymousClass1OS) r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0185, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1G(int r18, int r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r6 = r17
            java.util.Map r0 = r6.A0c()
            r3 = r18
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r3)
            X.0HU r0 = (X.AnonymousClass0HU) r0
            r7 = 0
            if (r0 == 0) goto L_0x04c5
            X.0Qg r5 = r0.A01
            r0 = 64
            r2 = r19
            if (r2 == r0) goto L_0x047a
            r0 = 128(0x80, float:1.794E-43)
            if (r2 == r0) goto L_0x0466
            r1 = 256(0x100, float:3.59E-43)
            r4 = 1
            r8 = r20
            if (r2 == r1) goto L_0x03cb
            r0 = 512(0x200, float:7.175E-43)
            if (r2 == r0) goto L_0x03cb
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r2 == r0) goto L_0x03a5
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r2 == r0) goto L_0x0382
            boolean r0 = X.C05170Qs.A0B(r5)
            if (r0 == 0) goto L_0x04c5
            if (r2 == r4) goto L_0x037b
            r0 = 2
            r1 = 0
            if (r2 == r0) goto L_0x04a5
            switch(r19) {
                case 16: goto L_0x01d3;
                case 32: goto L_0x01fa;
                case 4096: goto L_0x0093;
                case 8192: goto L_0x008b;
                case 32768: goto L_0x0202;
                case 65536: goto L_0x020a;
                case 262144: goto L_0x0212;
                case 524288: goto L_0x021a;
                case 1048576: goto L_0x0222;
                case 2097152: goto L_0x022a;
                case 16908342: goto L_0x0259;
                case 16908349: goto L_0x0347;
                case 16908372: goto L_0x0374;
                default: goto L_0x003f;
            }
        L_0x003f:
            switch(r19) {
                case 16908344: goto L_0x008b;
                case 16908345: goto L_0x008b;
                case 16908346: goto L_0x008b;
                case 16908347: goto L_0x008b;
                default: goto L_0x0042;
            }
        L_0x0042:
            switch(r19) {
                case 16908358: goto L_0x0073;
                case 16908359: goto L_0x007b;
                case 16908360: goto L_0x0083;
                case 16908361: goto L_0x03ac;
                default: goto L_0x0045;
            }
        L_0x0045:
            X.04B r0 = r6.A0B
            java.lang.Object r0 = X.AnonymousClass0LW.A00(r0, r3)
            X.04B r0 = (X.AnonymousClass04B) r0
            if (r0 == 0) goto L_0x04c5
            java.lang.Object r0 = X.AnonymousClass0LW.A00(r0, r2)
            if (r0 == 0) goto L_0x04c5
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A03
            java.lang.Object r1 = X.AnonymousClass0FY.A00(r1, r0)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x04c5
            int r0 = r1.size()
            if (r7 >= r0) goto L_0x04c5
            r1.get(r7)
            java.lang.String r0 = "getLabel"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0073:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0F
            goto L_0x03b2
        L_0x007b:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0C
            goto L_0x03b2
        L_0x0083:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0D
            goto L_0x03b2
        L_0x008b:
            r3 = 0
            r0 = 8192(0x2000, float:1.14794E-41)
            r16 = 1
            if (r2 == r0) goto L_0x009c
            goto L_0x0094
        L_0x0093:
            r3 = 1
        L_0x0094:
            r16 = 0
            r0 = 16908345(0x1020039, float:2.387739E-38)
            r15 = 1
            if (r2 == r0) goto L_0x00a3
        L_0x009c:
            r15 = 0
            r0 = 16908347(0x102003b, float:2.3877394E-38)
            r14 = 1
            if (r2 == r0) goto L_0x00aa
        L_0x00a3:
            r14 = 0
            r0 = 16908344(0x1020038, float:2.3877386E-38)
            r13 = 1
            if (r2 == r0) goto L_0x00b1
        L_0x00aa:
            r13 = 0
            r1 = 16908346(0x102003a, float:2.3877392E-38)
            r0 = 1
            if (r2 == r1) goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r15 != 0) goto L_0x00bb
            if (r14 != 0) goto L_0x00bb
            if (r3 != 0) goto L_0x00bb
            r12 = 0
            if (r16 == 0) goto L_0x00bc
        L_0x00bb:
            r12 = 1
        L_0x00bc:
            if (r13 != 0) goto L_0x00c5
            if (r0 != 0) goto L_0x00c5
            if (r3 != 0) goto L_0x00c5
            r11 = 0
            if (r16 == 0) goto L_0x0123
        L_0x00c5:
            r11 = 1
            if (r3 != 0) goto L_0x00ca
            if (r16 == 0) goto L_0x0123
        L_0x00ca:
            X.0Yb r2 = r5.A0H()
            X.0PS r0 = X.C03150Gu.A0I
            java.lang.Object r1 = X.AnonymousClass0FY.A00(r2, r0)
            X.0Oa r1 = (X.C04600Oa) r1
            X.0PS r0 = X.C03120Gr.A0K
            java.lang.Object r6 = X.AnonymousClass0FY.A00(r2, r0)
            X.0KP r6 = (X.AnonymousClass0KP) r6
            if (r1 == 0) goto L_0x0123
            if (r6 == 0) goto L_0x0123
            X.3MT r4 = r1.A00()
            java.lang.Comparable r0 = r4.BRH()
            float r3 = X.AnonymousClass000.A04(r0)
            java.lang.Comparable r0 = r4.BZX()
            float r1 = X.AnonymousClass000.A04(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fb
            r3 = r1
        L_0x00fb:
            java.lang.Comparable r0 = r4.BZX()
            float r2 = X.AnonymousClass000.A04(r0)
            java.lang.Comparable r0 = r4.BRH()
            float r1 = X.AnonymousClass000.A04(r0)
            int r0 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0110
            r2 = r1
        L_0x0110:
            float r3 = r3 - r2
            r0 = 1101004800(0x41a00000, float:20.0)
            float r3 = r3 / r0
            if (r16 == 0) goto L_0x0117
            float r3 = -r3
        L_0x0117:
            X.0vj r1 = r6.A00()
            X.1Di r1 = (X.C22821Di) r1
            if (r1 == 0) goto L_0x04c5
            r0 = 0
            float r0 = r0 + r3
            goto L_0x036b
        L_0x0123:
            X.0XV r6 = r5.A03
            X.0BQ r1 = r6.A0G()
            X.0tQ r0 = r1.BWE()
            if (r0 == 0) goto L_0x0191
            X.0NU r3 = r0.Bhs(r1, r4)
        L_0x0133:
            float r2 = r3.A02
            float r0 = r3.A01
            float r2 = r2 - r0
            float r1 = r3.A00
            float r0 = r3.A03
            float r1 = r1 - r0
            long r9 = X.AnonymousClass001.A0p(r2, r1)
            long r0 = X.AnonymousClass0QG.A02
            X.0Yb r8 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0I
            java.lang.Object r5 = X.AnonymousClass0FY.A00(r8, r0)
            X.0KP r5 = (X.AnonymousClass0KP) r5
            if (r5 == 0) goto L_0x04c5
            X.0PS r0 = X.C03150Gu.A08
            java.lang.Object r4 = X.AnonymousClass0FY.A00(r8, r0)
            X.0Js r4 = (X.AnonymousClass0Js) r4
            r3 = 0
            if (r4 == 0) goto L_0x01a5
            if (r12 == 0) goto L_0x01a5
            float r2 = X.AnonymousClass0QG.A02(r9)
            if (r15 != 0) goto L_0x0166
            if (r16 == 0) goto L_0x0167
        L_0x0166:
            float r2 = -r2
        L_0x0167:
            boolean r0 = r4.A00
            if (r0 == 0) goto L_0x016c
            float r2 = -r2
        L_0x016c:
            X.By4 r1 = r6.A0N()
            X.By4 r0 = X.C24246By4.Rtl
            if (r1 != r0) goto L_0x0179
            if (r15 != 0) goto L_0x0178
            if (r14 == 0) goto L_0x0179
        L_0x0178:
            float r2 = -r2
        L_0x0179:
            boolean r0 = A1L(r4, r2)
            if (r0 == 0) goto L_0x01a5
            X.0vj r4 = r5.A00()
            X.1OS r4 = (X.AnonymousClass1OS) r4
            if (r4 == 0) goto L_0x04c5
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            goto L_0x0322
        L_0x0191:
            long r0 = r1.BZM()
            float r2 = X.AnonymousClass000.A02(r0)
            int r0 = X.AnonymousClass000.A0H(r0)
            float r1 = (float) r0
            r0 = 0
            X.0NU r3 = new X.0NU
            r3.<init>(r0, r0, r2, r1)
            goto L_0x0133
        L_0x01a5:
            X.0PS r0 = X.C03150Gu.A0T
            java.lang.Object r1 = X.AnonymousClass0FY.A00(r8, r0)
            X.0Js r1 = (X.AnonymousClass0Js) r1
            if (r1 == 0) goto L_0x04c5
            if (r11 == 0) goto L_0x04c5
            float r2 = X.AnonymousClass0QG.A00(r9)
            if (r13 != 0) goto L_0x01b9
            if (r16 == 0) goto L_0x01ba
        L_0x01b9:
            float r2 = -r2
        L_0x01ba:
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x01bf
            float r2 = -r2
        L_0x01bf:
            boolean r0 = A1L(r1, r2)
            if (r0 == 0) goto L_0x04c5
            X.0vj r4 = r5.A00()
            X.1OS r4 = (X.AnonymousClass1OS) r4
            if (r4 == 0) goto L_0x04c5
            java.lang.Float r1 = java.lang.Float.valueOf(r3)
            goto L_0x031e
        L_0x01d3:
            X.0Yb r2 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A09
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r0)
            X.0KP r0 = (X.AnonymousClass0KP) r0
            if (r0 == 0) goto L_0x01ef
            X.0vj r0 = r0.A00()
            X.0vk r0 = (X.C18090vk) r0
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r1 = r0.invoke()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
        L_0x01ef:
            r0 = 0
            r6.A1E(r0, r0, r3, r4)
            if (r1 == 0) goto L_0x04c5
            boolean r7 = r1.booleanValue()
            return r7
        L_0x01fa:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0B
            goto L_0x03b2
        L_0x0202:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0G
            goto L_0x03b2
        L_0x020a:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A04
            goto L_0x03b2
        L_0x0212:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A06
            goto L_0x03b2
        L_0x021a:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A01
            goto L_0x03b2
        L_0x0222:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A05
            goto L_0x03b2
        L_0x022a:
            if (r20 == 0) goto L_0x0232
            java.lang.String r0 = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE"
            java.lang.String r1 = r8.getString(r0)
        L_0x0232:
            X.0Yb r2 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0M
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r2, r0)
            X.0KP r0 = (X.AnonymousClass0KP) r0
            if (r0 == 0) goto L_0x04c5
            X.0vj r4 = r0.A00()
            X.1Di r4 = (X.C22821Di) r4
            if (r4 == 0) goto L_0x04c5
            if (r1 != 0) goto L_0x024c
            java.lang.String r1 = ""
        L_0x024c:
            r3 = 6
            r2 = 0
            X.DRu r0 = new X.DRu
            r0.<init>(r2, r3, r1)
            java.lang.Object r0 = r4.invoke(r0)
            goto L_0x03c6
        L_0x0259:
            X.0Qg r8 = r5.A0J()
        L_0x025d:
            if (r8 == 0) goto L_0x04c5
            X.0Yb r1 = r8.A0G()
            if (r1 == 0) goto L_0x0341
            X.0PS r0 = X.C03120Gr.A0I
            java.lang.Object r6 = X.AnonymousClass0FY.A00(r1, r0)
            X.0KP r6 = (X.AnonymousClass0KP) r6
            if (r6 == 0) goto L_0x0341
            X.0XV r0 = r8.A03
            X.0BQ r9 = r0.A0G()
            X.0tQ r0 = r9.BWE()
            if (r0 == 0) goto L_0x032c
            X.0NU r3 = r0.Bhs(r9, r4)
        L_0x027f:
            X.0tQ r2 = r9.BWE()
            long r0 = X.AnonymousClass0QY.A03
            if (r2 == 0) goto L_0x028b
            long r0 = r2.Bhu(r0)
        L_0x028b:
            X.0NU r10 = r3.A02(r0)
            long r2 = r5.A09()
            long r0 = r5.A0A()
            long r0 = X.C25293Ccv.A01(r0)
            X.0NU r3 = X.C02470Ed.A00(r2, r0)
            X.0Yb r1 = r8.A0H()
            X.0PS r0 = X.C03150Gu.A08
            java.lang.Object r11 = X.AnonymousClass0FY.A00(r1, r0)
            X.0Js r11 = (X.AnonymousClass0Js) r11
            X.0PS r0 = X.C03150Gu.A0T
            java.lang.Object r9 = X.AnonymousClass0FY.A00(r1, r0)
            X.0Js r9 = (X.AnonymousClass0Js) r9
            float r8 = r3.A01
            float r0 = r10.A01
            float r8 = r8 - r0
            float r2 = r3.A02
            float r0 = r10.A02
            float r2 = r2 - r0
            float r1 = java.lang.Math.signum(r8)
            float r0 = java.lang.Math.signum(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x032a
            float r1 = java.lang.Math.abs(r8)
            float r0 = java.lang.Math.abs(r2)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x02d6
            r8 = r2
        L_0x02d6:
            if (r11 == 0) goto L_0x02dd
            boolean r0 = r11.A00
            if (r0 != r4) goto L_0x02dd
            float r8 = -r8
        L_0x02dd:
            X.0XV r0 = r5.A03
            X.By4 r1 = r0.A0N()
            X.By4 r0 = X.C24246By4.Rtl
            if (r1 != r0) goto L_0x02e8
            float r8 = -r8
        L_0x02e8:
            float r2 = r3.A03
            float r0 = r10.A03
            float r2 = r2 - r0
            float r3 = r3.A00
            float r0 = r10.A00
            float r3 = r3 - r0
            float r1 = java.lang.Math.signum(r2)
            float r0 = java.lang.Math.signum(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0328
            float r1 = java.lang.Math.abs(r2)
            float r0 = java.lang.Math.abs(r3)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x030b
            r2 = r3
        L_0x030b:
            if (r9 == 0) goto L_0x0312
            boolean r0 = r9.A00
            if (r0 != r4) goto L_0x0312
            float r2 = -r2
        L_0x0312:
            X.0vj r4 = r6.A00()
            X.1OS r4 = (X.AnonymousClass1OS) r4
            if (r4 == 0) goto L_0x04c5
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
        L_0x031e:
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
        L_0x0322:
            java.lang.Object r0 = r4.invoke(r1, r0)
            goto L_0x03c6
        L_0x0328:
            r2 = 0
            goto L_0x030b
        L_0x032a:
            r8 = 0
            goto L_0x02d6
        L_0x032c:
            long r0 = r9.BZM()
            float r2 = X.AnonymousClass000.A02(r0)
            int r0 = X.AnonymousClass000.A0H(r0)
            float r1 = (float) r0
            r0 = 0
            X.0NU r3 = new X.0NU
            r3.<init>(r0, r0, r2, r1)
            goto L_0x027f
        L_0x0341:
            X.0Qg r8 = r8.A0J()
            goto L_0x025d
        L_0x0347:
            if (r20 == 0) goto L_0x04c5
            java.lang.String r2 = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"
            boolean r0 = r8.containsKey(r2)
            if (r0 == 0) goto L_0x04c5
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0K
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r1, r0)
            X.0KP r0 = (X.AnonymousClass0KP) r0
            if (r0 == 0) goto L_0x04c5
            X.0vj r1 = r0.A00()
            X.1Di r1 = (X.C22821Di) r1
            if (r1 == 0) goto L_0x04c5
            float r0 = r8.getFloat(r2)
        L_0x036b:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            goto L_0x03c6
        L_0x0374:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0A
            goto L_0x03b2
        L_0x037b:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0H
            goto L_0x03b2
        L_0x0382:
            r2 = -1
            if (r20 == 0) goto L_0x03a3
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_START_INT"
            int r1 = r8.getInt(r0, r2)
            java.lang.String r0 = "ACTION_ARGUMENT_SELECTION_END_INT"
            int r2 = r8.getInt(r0, r2)
        L_0x0391:
            boolean r7 = r6.A1O(r5, r1, r2, r7)
            if (r7 == 0) goto L_0x04c5
            int r0 = r5.A02
            int r2 = r6.A00(r0)
            r1 = 0
            r0 = 0
            r6.A1E(r1, r1, r2, r0)
            return r7
        L_0x03a3:
            r1 = -1
            goto L_0x0391
        L_0x03a5:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A02
            goto L_0x03b2
        L_0x03ac:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03120Gr.A0E
        L_0x03b2:
            java.lang.Object r0 = X.AnonymousClass0FY.A00(r1, r0)
            X.0KP r0 = (X.AnonymousClass0KP) r0
            if (r0 == 0) goto L_0x04c5
            X.0vj r0 = r0.A00()
            X.0vk r0 = (X.C18090vk) r0
            if (r0 == 0) goto L_0x04c5
            java.lang.Object r0 = r0.invoke()
        L_0x03c6:
            boolean r7 = X.AnonymousClass000.A1Y(r0)
            return r7
        L_0x03cb:
            if (r20 == 0) goto L_0x04c5
            java.lang.String r0 = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"
            int r3 = r8.getInt(r0)
            java.lang.String r0 = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"
            boolean r10 = r8.getBoolean(r0)
            if (r2 != r1) goto L_0x03dc
            r7 = 1
        L_0x03dc:
            int r1 = r5.A02
            java.lang.Integer r0 = r6.A07
            r8 = -1
            if (r0 == 0) goto L_0x03e9
            int r0 = r0.intValue()
            if (r1 == r0) goto L_0x03f1
        L_0x03e9:
            r6.A00 = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A07 = r0
        L_0x03f1:
            java.lang.String r0 = r6.A0X(r5)
            r9 = 0
            if (r0 == 0) goto L_0x0464
            int r2 = r0.length()
            if (r2 == 0) goto L_0x0464
            X.0Xc r1 = r6.A0K(r5, r3)
            if (r1 == 0) goto L_0x0464
            int r0 = r6.A03(r5)
            if (r0 != r8) goto L_0x045c
            r0 = r2
            if (r7 == 0) goto L_0x045f
            r0 = 0
        L_0x040e:
            int[] r0 = r1.BLU(r0)
        L_0x0412:
            if (r0 == 0) goto L_0x0464
            r11 = r0[r9]
            r12 = r0[r4]
            if (r10 == 0) goto L_0x0450
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03150Gu.A02
            boolean r0 = r1.A0B(r0)
            if (r0 != 0) goto L_0x0450
            X.0PS r0 = X.C03150Gu.A04
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L_0x0450
            int r2 = r6.A04(r5)
            if (r2 != r8) goto L_0x044d
            r2 = r12
            if (r7 == 0) goto L_0x0458
            r2 = r11
        L_0x0438:
            r1 = r12
        L_0x0439:
            r9 = 256(0x100, float:3.59E-43)
        L_0x043b:
            long r13 = android.os.SystemClock.uptimeMillis()
            X.0Hr r0 = new X.0Hr
            r7 = r0
            r8 = r5
            r10 = r3
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r6.A04 = r0
            r6.A1O(r5, r2, r1, r4)
            goto L_0x04c4
        L_0x044d:
            if (r7 == 0) goto L_0x0458
            goto L_0x0438
        L_0x0450:
            r2 = r11
            if (r7 == 0) goto L_0x0454
            r2 = r12
        L_0x0454:
            r1 = r2
            if (r7 == 0) goto L_0x0459
            goto L_0x0439
        L_0x0458:
            r1 = r11
        L_0x0459:
            r9 = 512(0x200, float:7.175E-43)
            goto L_0x043b
        L_0x045c:
            if (r7 == 0) goto L_0x045f
            goto L_0x040e
        L_0x045f:
            int[] r0 = r1.CCD(r0)
            goto L_0x0412
        L_0x0464:
            r7 = 0
            return r7
        L_0x0466:
            int r0 = r6.A01
            if (r0 != r3) goto L_0x04c5
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r6.A01 = r0
            r0 = 0
            r6.A03 = r0
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0P
            r0.invalidate()
            r1 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            goto L_0x04a1
        L_0x047a:
            android.view.accessibility.AccessibilityManager r1 = r6.A0M
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L_0x04c5
            boolean r0 = r1.isTouchExplorationEnabled()
            if (r0 == 0) goto L_0x04c5
            int r2 = r6.A01
            if (r2 == r3) goto L_0x04c5
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L_0x0496
            r1 = 0
            r0 = 65536(0x10000, float:9.18355E-41)
            r6.A1E(r1, r1, r2, r0)
        L_0x0496:
            r6.A01 = r3
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0P
            r0.invalidate()
            r1 = 0
            r0 = 32768(0x8000, float:4.5918E-41)
        L_0x04a1:
            r6.A1E(r1, r1, r3, r0)
            goto L_0x04c4
        L_0x04a5:
            X.0Yb r1 = r5.A0H()
            X.0PS r0 = X.C03150Gu.A06
            java.lang.Object r1 = X.AnonymousClass0FY.A00(r1, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x04c5
            androidx.compose.ui.platform.AndroidComposeView r0 = r6.A0P
            X.0ui r0 = r0.getFocusOwner()
            X.0WK r0 = (X.AnonymousClass0WK) r0
            r0.BEt(r7, r4)
        L_0x04c4:
            r7 = 1
        L_0x04c5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.A1G(int, int, android.os.Bundle):boolean");
    }
}
