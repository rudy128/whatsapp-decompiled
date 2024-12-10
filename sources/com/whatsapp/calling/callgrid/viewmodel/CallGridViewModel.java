package com.whatsapp.calling.callgrid.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10I;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass126;
import X.AnonymousClass190;
import X.AnonymousClass1DC;
import X.AnonymousClass1DT;
import X.AnonymousClass1E7;
import X.AnonymousClass1IZ;
import X.AnonymousClass1L9;
import X.AnonymousClass1M9;
import X.AnonymousClass1MZ;
import X.AnonymousClass1V9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VX;
import X.AnonymousClass6IR;
import X.AnonymousClass6LP;
import X.AnonymousClass6RE;
import X.AnonymousClass70A;
import X.AnonymousClass73H;
import X.AnonymousClass7AH;
import X.C106595Wl;
import X.C108945cZ;
import X.C108965cb;
import X.C108975cc;
import X.C128326fo;
import X.C129986ih;
import X.C130786k0;
import X.C131896lq;
import X.C134216qE;
import X.C134536qk;
import X.C135156rk;
import X.C135646sX;
import X.C139926zf;
import X.C1402670q;
import X.C143867Fc;
import X.C175258yP;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18140vp;
import X.C200710s;
import X.C21141AfC;
import X.C21446AkD;
import X.C22851Dl;
import X.C23661Hd;
import X.C24901Mc;
import X.C24921Me;
import X.C40811vJ;
import X.C41111vp;
import X.C41731wy;
import X.C42171xk;
import X.C72463Mc;
import X.C86534Sa;
import X.C89344cJ;
import X.C92724hn;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Pair;
import android.util.Rational;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallState;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class CallGridViewModel extends AnonymousClass3VX {
    public int A00;
    public Rect A01;
    public Handler A02;
    public C106595Wl A03;
    public C135646sX A04;
    public AnonymousClass1E7 A05;
    public UserJid A06;
    public UserJid A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public Rational A0I;
    public C22851Dl A0J;
    public final AnonymousClass1DT A0K = AnonymousClass3MW.A0M(C17890vO.A0L());
    public final AnonymousClass1DT A0L = AnonymousClass3MW.A0M(new Object());
    public final AnonymousClass1DT A0M = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A0N;
    public final AnonymousClass1DT A0O = AnonymousClass3MW.A0M((Object) null);
    public final AnonymousClass1DT A0P;
    public final AnonymousClass1DT A0Q;
    public final AnonymousClass1DT A0R;
    public final AnonymousClass1DT A0S;
    public final AnonymousClass1DT A0T;
    public final AnonymousClass1DT A0U = AnonymousClass3MW.A0M(new C130786k0());
    public final AnonymousClass11S A0V;
    public final C175258yP A0W;
    public final C128326fo A0X;
    public final C129986ih A0Y;
    public final AnonymousClass1V9 A0Z;
    public final C131896lq A0a = new C131896lq();
    public final C21141AfC A0b;
    public final AnonymousClass1M9 A0c;
    public final C24921Me A0d;
    public final AnonymousClass1MZ A0e;
    public final C23661Hd A0f;
    public final C18030ve A0g;
    public final AnonymousClass126 A0h;
    public final C24901Mc A0i;
    public final C41111vp A0j;
    public final C41111vp A0k;
    public final C41111vp A0l;
    public final C41111vp A0m;
    public final C41111vp A0n;
    public final C41111vp A0o;
    public final C41111vp A0p = AnonymousClass3MW.A0n(true);
    public final C41111vp A0q;
    public final C41111vp A0r = AnonymousClass3MW.A0n(false);
    public final C41111vp A0s = AnonymousClass3MW.A0n(false);
    public final C41111vp A0t;
    public final C41111vp A0u;
    public final C41111vp A0v;
    public final C41111vp A0w;
    public final C41111vp A0x;
    public final C41731wy A0y;
    public final C41731wy A0z;
    public final C41731wy A10;
    public final C41731wy A11;
    public final AnonymousClass1DC A12;
    public final AnonymousClass10I A13;
    public final VoipCameraManager A14;
    public final AnonymousClass00H A15;
    public final AnonymousClass00H A16;
    public final HashSet A17;
    public final LinkedHashMap A18;
    public final C18140vp A19;
    public final C18140vp A1A;
    public final C18140vp A1B;
    public final C18140vp A1C;
    public final boolean A1D;
    public final AnonymousClass1L9 A1E;
    public final AnonymousClass190 A1F;
    public final C143867Fc A1G;
    public final AnonymousClass118 A1H;

    public float A0T(CallState callState, boolean z) {
        return 1.0f;
    }

    public void A0W(int i, int i2) {
        Rect rect = new Rect(0, i, 0, i2);
        if (!C42171xk.A00(this.A01, rect)) {
            this.A01 = rect;
            this.A0v.A0F(rect);
        }
    }

    public boolean A0a() {
        return false;
    }

    public void Bn8() {
        this.A07 = null;
        AnonymousClass1DT r1 = this.A0M;
        if (r1.A06() != null) {
            r1.A0F((Object) null);
        }
    }

    public void BnL(C86534Sa r2) {
        A0C(r2, this, false);
    }

    public void BnO(Bitmap bitmap, boolean z) {
        AnonymousClass6LP r3 = new AnonymousClass6LP(this);
        if (bitmap != null) {
            this.A13.CGM(r3, bitmap);
        } else if (!C108945cZ.A1T(r3)) {
            C41111vp r2 = r3.A00.A0j;
            r2.A0F(new C134536qk(((C134536qk) r2.A06()).A00, (Bitmap) null));
        }
    }

    public void C07(UserJid[] userJidArr, int[] iArr) {
        int length = userJidArr.length;
        if (length != iArr.length) {
            Log.e("CallGridViewModel/onParticipantAudioUpdated, participantJids and audioLevels should be one-on-one mapped");
            return;
        }
        HashSet hashSet = new HashSet(this.A18.keySet());
        for (int i = 0; i < length; i++) {
            C131896lq r2 = this.A0a;
            if (r2.A00.containsKey(userJidArr[i])) {
                r2.A00(Integer.valueOf(iArr[i]), userJidArr[i]);
            }
            hashSet.remove(userJidArr[i]);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C131896lq r1 = this.A0a;
            if (r1.A00.containsKey(next)) {
                r1.A00(0, next);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.util.Rational A04(X.C134216qE r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0053
            com.whatsapp.voipcalling.camera.VoipCameraManager r3 = r5.A14
            int r2 = r5.A00
            r0 = 1
            X.C18070vi.A0d(r3, r0)
            r1 = 0
            r0 = 0
            android.graphics.Point r0 = X.AnonymousClass73H.A01(r1, r6, r3, r2, r0)
            if (r0 == 0) goto L_0x0053
            int r1 = r0.x
            int r0 = r0.y
            android.util.Rational r4 = new android.util.Rational
            r4.<init>(r1, r0)
        L_0x001b:
            android.util.Rational r1 = r5.A0I
            java.lang.String r0 = "CallGridViewModel/getPictureInPictureTargetSize defaultPipSize cannot be null"
            X.C17960vV.A08(r1, r0)
            if (r4 != 0) goto L_0x0025
            r4 = r1
        L_0x0025:
            r1 = 100
            r0 = 239(0xef, float:3.35E-43)
            android.util.Rational r3 = new android.util.Rational
            r3.<init>(r1, r0)
            android.util.Rational r2 = new android.util.Rational
            r2.<init>(r0, r1)
            int r0 = r4.compareTo(r3)
            if (r0 >= 0) goto L_0x0043
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallGridViewModel/getPictureInPictureTargetSize aspect ratio too small "
            X.C17900vP.A0Z(r4, r0, r1)
            r4 = r3
        L_0x0043:
            int r0 = r4.compareTo(r2)
            if (r0 <= 0) goto L_0x0055
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "CallGridViewModel/getPictureInPictureTargetSize aspect ratio too large "
            X.C17900vP.A0Z(r4, r0, r1)
            return r2
        L_0x0053:
            r4 = 0
            goto L_0x001b
        L_0x0055:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A04(X.6qE):android.util.Rational");
    }

    public static C86534Sa A05(CallGridViewModel callGridViewModel) {
        return callGridViewModel.A0W.A07();
    }

    public static AnonymousClass6IR A06(CallGridViewModel callGridViewModel, UserJid userJid) {
        String A0q2;
        if (C72463Mc.A1Z(callGridViewModel.A19)) {
            A0q2 = callGridViewModel.A0d.A0X(userJid);
        } else {
            AnonymousClass1E7 A0E2 = callGridViewModel.A0c.A0E(userJid);
            if (A0E2 != null) {
                A0q2 = AnonymousClass3MY.A0q(callGridViewModel.A0d, A0E2);
            }
            return null;
        }
        if (A0q2 != null) {
            return C1402670q.A02(AnonymousClass000.A1b(A0q2, 1), 2131898268);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.6dj] */
    private void A08(C134216qE r5) {
        ? obj = new Object();
        Point A022 = AnonymousClass73H.A02(r5, this.A1G, this.A14, this.A00);
        obj.A01 = A022.x;
        obj.A00 = A022.y;
        this.A0L.A0F(obj);
    }

    private void A09(C134216qE r5) {
        if (C72463Mc.A1O(this.A0s) && A07(A05(this), this).size() <= 2) {
            if (r5.A0M) {
                this.A0q.A0F(this.A0o.A06());
                return;
            }
            VoipCameraManager voipCameraManager = this.A14;
            int i = this.A00;
            C18070vi.A0d(voipCameraManager, 1);
            Point A012 = AnonymousClass73H.A01((Point) null, r5, voipCameraManager, i, false);
            if (A012 != null) {
                AnonymousClass3MY.A1L(this.A0q, C108975cc.A1D(A012.x, A012.y));
            }
        }
    }

    public static void A0A(C134216qE r7, CallGridViewModel callGridViewModel) {
        AnonymousClass1DT r6 = callGridViewModel.A0U;
        Object A062 = r6.A06();
        C17960vV.A07(A062);
        C130786k0 r5 = (C130786k0) A062;
        VoipCameraManager voipCameraManager = callGridViewModel.A14;
        int i = callGridViewModel.A00;
        C18140vp r2 = callGridViewModel.A19;
        boolean A1Z = C72463Mc.A1Z(r2);
        C18070vi.A0d(voipCameraManager, 1);
        Point A012 = AnonymousClass73H.A01((Point) null, r7, voipCameraManager, i, A1Z);
        if (A012 != null) {
            r5.A06 = A012.x;
            r5.A04 = A012.y;
            r5.A07 = C72463Mc.A1Z(r2);
            r6.A0F(r5);
        }
    }

    public static void A0B(C86534Sa r7, CallGridViewModel callGridViewModel) {
        if (!callGridViewModel.A09 || r7.A0G) {
            C41111vp r6 = callGridViewModel.A0u;
            Object A062 = r6.A06();
            AnonymousClass6RE A0U2 = callGridViewModel.A0U(r7);
            AnonymousClass6RE r1 = AnonymousClass6RE.NONE;
            boolean A1Z = AnonymousClass3Ma.A1Z(A062, r1);
            boolean A1Z2 = AnonymousClass3Ma.A1Z(A0U2, r1);
            if (A1Z != A1Z2) {
                AnonymousClass1DT r2 = callGridViewModel.A0U;
                Object A063 = r2.A06();
                C17960vV.A07(A063);
                C130786k0 r12 = (C130786k0) A063;
                int i = 2131169249;
                if (A1Z2) {
                    i = 2131168264;
                }
                r12.A02 = i;
                r2.A0F(r12);
            }
            if (A0U2 != A062) {
                r6.A0F(A0U2);
            }
        }
    }

    public static void A0D(CallGridViewModel callGridViewModel) {
        A0C(callGridViewModel.A0W.A07(), callGridViewModel, false);
    }

    public static void A0E(CallGridViewModel callGridViewModel) {
        int i;
        C41111vp r4 = callGridViewModel.A0l;
        if (callGridViewModel.A0D) {
            i = 2131165649;
        } else {
            i = 2131169249;
            if (C72463Mc.A1O(callGridViewModel.A0r)) {
                i = 2131169250;
            }
        }
        boolean A1O = C72463Mc.A1O(callGridViewModel.A0n);
        int i2 = 0;
        if (!C72463Mc.A1O(callGridViewModel.A0r)) {
            i2 = 14;
        }
        r4.A0F(new C135156rk(i, A1O, i2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011b, code lost:
        if (r9 > r8.size()) goto L_0x011d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01c6, code lost:
        if (r2.A0h.equals(r0.A01) != false) goto L_0x0148;
     */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0233 A[LOOP:4: B:83:0x022d->B:85:0x0233, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c9 A[EDGE_INSN: B:90:0x01c9->B:72:0x01c9 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0F(com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r15) {
        /*
            java.util.LinkedHashMap r9 = r15.A18
            java.util.Collection r0 = r9.values()
            java.util.ArrayList r8 = X.C17880vN.A10(r0)
            com.whatsapp.jid.UserJid r0 = r15.A06
            r7 = 0
            if (r0 == 0) goto L_0x0065
            X.0ve r6 = r15.A0g
            r0 = 8538(0x215a, float:1.1964E-41)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r6, r0)
            if (r0 == 0) goto L_0x0038
            X.00H r0 = r15.A16
            X.A1P r4 = X.C108945cZ.A0d(r0)
            int r0 = r8.size()
            long r2 = (long) r0
            X.11S r1 = r15.A0V
            com.whatsapp.jid.UserJid r0 = r15.A06
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x00ef
            long r0 = r4.A0F
            long r0 = java.lang.Math.max(r0, r2)
            r4.A0F = r0
        L_0x0038:
            com.whatsapp.jid.UserJid r0 = r15.A06
            android.util.Pair r11 = A03(r0, r8)
            boolean r0 = r15.A0D
            r3 = 1
            if (r0 == 0) goto L_0x008e
            X.11S r1 = r15.A0V
            com.whatsapp.jid.UserJid r0 = r15.A06
            boolean r0 = r1.A0O(r0)
            if (r0 == 0) goto L_0x008e
            if (r11 == 0) goto L_0x0065
            int r2 = X.C108965cb.A01(r11)
            java.lang.Object r1 = r11.second
            X.70A r1 = (X.AnonymousClass70A) r1
            X.71r r0 = new X.71r
            r0.<init>(r1)
            r0.A0D = r3
            X.70A r0 = r0.A01()
            r8.add(r2, r0)
        L_0x0065:
            X.1vp r0 = r15.A0r
            boolean r0 = X.C72463Mc.A1O(r0)
            if (r0 == 0) goto L_0x00e3
            int r1 = r9.size()
            r0 = 8
            if (r1 <= r0) goto L_0x00e3
            X.1DT r1 = r15.A0R
            r0 = 6
            r2 = 6
            java.util.List r0 = r8.subList(r7, r0)
            r1.A0F(r0)
            X.1DT r1 = r15.A0N
            int r0 = r8.size()
            java.util.List r0 = r8.subList(r2, r0)
        L_0x008a:
            r1.A0F(r0)
            return
        L_0x008e:
            if (r11 == 0) goto L_0x0065
            java.lang.Object r0 = r11.second
            X.70A r0 = (X.AnonymousClass70A) r0
            if (r0 == 0) goto L_0x0065
            boolean r2 = r0.A0a
            X.71r r1 = new X.71r
            r1.<init>(r0)
            X.11S r10 = r15.A0V
            com.whatsapp.jid.UserJid r0 = r15.A06
            boolean r0 = r10.A0O(r0)
            if (r0 == 0) goto L_0x00e0
            r1.A0M = r3
        L_0x00a9:
            X.0vp r0 = r15.A19
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x00b3
            r1.A0a = r7
        L_0x00b3:
            X.70A r1 = r1.A01()
            java.util.ArrayList r4 = X.C108965cb.A0s(r1)
            boolean r0 = r15.A0D
            if (r0 == 0) goto L_0x00f9
            java.util.ArrayList r3 = X.C108965cb.A0s(r1)
            java.util.Iterator r2 = r8.iterator()
        L_0x00c7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00da
            java.lang.Object r1 = r2.next()
            X.70A r1 = (X.AnonymousClass70A) r1
            boolean r0 = r1.A0N
            if (r0 == 0) goto L_0x00c7
            r3.add(r1)
        L_0x00da:
            X.1DT r0 = r15.A0R
            r0.A0F(r3)
            goto L_0x00e8
        L_0x00e0:
            r1.A0L = r3
            goto L_0x00a9
        L_0x00e3:
            X.1DT r0 = r15.A0R
            r0.A0F(r8)
        L_0x00e8:
            X.1DT r1 = r15.A0N
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            goto L_0x008a
        L_0x00ef:
            long r0 = r4.A0C
            long r0 = java.lang.Math.max(r0, r2)
            r4.A0C = r0
            goto L_0x0038
        L_0x00f9:
            X.71r r0 = new X.71r
            r0.<init>(r1)
            r0.A0D = r3
            r0.A0d = r7
            r0.A0a = r2
            X.70A r2 = r0.A01()
            com.whatsapp.jid.UserJid r0 = r15.A06
            boolean r0 = r10.A0O(r0)
            if (r0 != 0) goto L_0x0153
            int r9 = X.C108965cb.A01(r11)
            if (r9 < 0) goto L_0x011d
            int r0 = r8.size()
            r1 = 1
            if (r9 <= r0) goto L_0x011e
        L_0x011d:
            r1 = 0
        L_0x011e:
            java.lang.String r0 = "updateParticipantsList: Invalid position for view state"
            X.C17960vV.A0F(r1, r0)
            int r0 = X.C108965cb.A01(r11)
            r8.add(r0, r2)
            X.4Sa r0 = A05(r15)
            boolean r0 = r0.A0N
            com.whatsapp.jid.UserJid r0 = X.C40811vJ.A01(r10, r0)
            r0.getClass()
            android.util.Pair r0 = A03(r0, r8)
            if (r0 == 0) goto L_0x0156
            java.lang.Object r2 = r0.second
            X.70A r2 = (X.AnonymousClass70A) r2
            boolean r0 = r2.A0J
            if (r0 == 0) goto L_0x01ba
            r4.add(r2)
        L_0x0148:
            X.71r r0 = new X.71r
            r0.<init>(r2)
            r0.A0G = r3
            X.70A r2 = r0.A01()
        L_0x0153:
            r8.add(r7, r2)
        L_0x0156:
            X.1DT r0 = r15.A0R
            r0.A0F(r4)
            X.1DT r9 = r15.A0N
            java.util.List r10 = X.AnonymousClass3MW.A10(r9)
            r0 = 7931(0x1efb, float:1.1114E-41)
            int r4 = X.C18020vd.A00(r5, r6, r0)
            if (r10 == 0) goto L_0x023b
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x023b
            if (r4 <= 0) goto L_0x023b
            int r0 = r8.size()
            X.70A[] r0 = new X.AnonymousClass70A[r0]
            java.lang.Object[] r6 = r8.toArray(r0)
            X.70A[] r6 = (X.AnonymousClass70A[]) r6
            r5 = 0
            r0 = r6[r7]
            X.71r r2 = new X.71r
            r2.<init>(r0)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r1 = 2147483646(0x7ffffffe, float:NaN)
            android.util.Pair r0 = X.C17890vO.A0E(r11, r1)
            r2.A09 = r0
            r2.A06 = r1
            X.70A r0 = r2.A01()
            r6[r7] = r0
        L_0x019a:
            int r12 = r6.length
            if (r3 >= r12) goto L_0x01c9
            r0 = r6[r3]
            int r2 = r0.A06
            if (r2 > 0) goto L_0x01a4
            r2 = -1
        L_0x01a4:
            r0 = r6[r3]
            X.71r r1 = new X.71r
            r1.<init>(r0)
            android.util.Pair r0 = X.C17890vO.A0E(r11, r2)
            r1.A09 = r0
            X.70A r0 = r1.A01()
            r6[r3] = r0
            int r3 = r3 + 1
            goto L_0x019a
        L_0x01ba:
            X.6sX r0 = r15.A04
            if (r0 == 0) goto L_0x0153
            com.whatsapp.jid.UserJid r1 = r2.A0h
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0153
            goto L_0x0148
        L_0x01c9:
            r1 = 5
            X.7Rn r0 = new X.7Rn
            r0.<init>(r1)
            java.util.Arrays.sort(r6, r0)
            int r13 = r4 + 1
            int r0 = X.C108955ca.A08(r10, r12)
            int r7 = java.lang.Math.min(r13, r0)
            r4 = 1
        L_0x01dd:
            if (r4 >= r7) goto L_0x022d
            java.lang.Object r2 = r10.get(r4)
            X.70A r2 = (X.AnonymousClass70A) r2
            com.whatsapp.jid.UserJid r14 = r2.A0h
            r1 = 0
            r3 = 0
        L_0x01e9:
            if (r1 >= r12) goto L_0x0225
            r0 = r6[r1]
            com.whatsapp.jid.UserJid r0 = r0.A0h
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x0228
            if (r3 < 0) goto L_0x0225
            if (r3 >= r13) goto L_0x0225
            android.util.Pair r0 = r2.A09
            java.lang.Object r15 = r0.second
            r14 = r6[r4]
            android.util.Pair r0 = r14.A09
            java.lang.Object r0 = r0.second
            X.71r r1 = new X.71r
            r1.<init>(r2)
            android.util.Pair r0 = X.C108945cZ.A0N(r11, r0)
            r1.A09 = r0
            X.70A r2 = r1.A01()
            X.71r r1 = new X.71r
            r1.<init>(r14)
            android.util.Pair r0 = X.C108945cZ.A0N(r11, r15)
            r1.A09 = r0
            X.70A r0 = r1.A01()
            r6[r4] = r2
            r6[r3] = r0
        L_0x0225:
            int r4 = r4 + 1
            goto L_0x01dd
        L_0x0228:
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L_0x01e9
        L_0x022d:
            int r0 = r8.size()
            if (r5 >= r0) goto L_0x023b
            r0 = r6[r5]
            r8.set(r5, r0)
            int r5 = r5 + 1
            goto L_0x022d
        L_0x023b:
            r9.A0F(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0F(com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel):void");
    }

    public static void A0G(CallGridViewModel callGridViewModel) {
        int i;
        if (callGridViewModel.A0D) {
            i = 2132084306;
        } else {
            i = 2132084310;
            if (C72463Mc.A1O(callGridViewModel.A0r)) {
                i = 2132084304;
            }
        }
        AnonymousClass3MX.A1J(callGridViewModel.A0x, i);
    }

    public static void A0H(CallGridViewModel callGridViewModel, UserJid userJid) {
        if (!C40811vJ.A0b(callGridViewModel.A0g, callGridViewModel.A19)) {
            AnonymousClass1DT r4 = callGridViewModel.A0M;
            Object A062 = r4.A06();
            if (A062 == null || userJid.equals(A062)) {
                AnonymousClass70A r0 = (AnonymousClass70A) callGridViewModel.A18.get(userJid);
                if (r0 == null) {
                    Log.w("voip/CallGridViewModel//toggleFocusedView participant not found");
                    if (A062 != null) {
                        r4.A0F((Object) null);
                    } else {
                        return;
                    }
                } else {
                    if (r0.A0E) {
                        userJid = null;
                    }
                    r4.A0F(userJid);
                }
                A0C(A05(callGridViewModel), callGridViewModel, false);
                return;
            }
            Log.e("voip/CallGridViewModel//toggleFocusedView previous focused participant must be cleared before switching");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0025 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A0I(int r6) {
        /*
            r5 = this;
            X.0ve r2 = r5.A0g
            r0 = 2331(0x91b, float:3.266E-42)
            X.0vf r1 = X.C18040vf.A02
            int r4 = X.C18020vd.A00(r1, r2, r0)
            r0 = 3807(0xedf, float:5.335E-42)
            int r3 = X.C18020vd.A00(r1, r2, r0)
            r2 = 0
            r1 = 1
            r0 = 2
            boolean r0 = X.C108975cc.A1C(r3, r0)
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0027
            X.0vp r0 = r5.A19
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 != 0) goto L_0x0027
        L_0x0023:
            if (r6 <= r1) goto L_0x0026
        L_0x0025:
            r2 = 1
        L_0x0026:
            return r2
        L_0x0027:
            if (r6 < r4) goto L_0x0026
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0I(int):boolean");
    }

    public void A0S() {
        C22851Dl r1;
        this.A0W.unregisterObserver(this);
        C21141AfC afC = this.A0b;
        afC.A01 = null;
        afC.A04();
        if (this.A12.BgK() && (r1 = this.A0J) != null) {
            this.A0Y.A00.A0D(r1);
            this.A0J = null;
        }
    }

    public AnonymousClass6RE A0U(C86534Sa r4) {
        if (this.A0D || !r4.A0M) {
            return AnonymousClass6RE.NONE;
        }
        if (this.A0E) {
            return AnonymousClass6RE.RINGING;
        }
        if (r4.A0F) {
            if (C18020vd.A05(C18040vf.A02, this.A0g, 3551)) {
                return AnonymousClass6RE.RING_ALL;
            }
        }
        return AnonymousClass6RE.GO_TO_CHAT;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.1LU, java.lang.Object] */
    public void A0X(Context context) {
        AnonymousClass1E7 r0 = this.A05;
        if (r0 != null) {
            this.A1E.A0B(context, AnonymousClass3MY.A06(context, new Object(), r0.A0J), "CallGridViewModel/onGoToChatButtonClicked");
        }
    }

    public void A0Y(Rational rational) {
        C134216qE r2;
        this.A0I = rational;
        if (this.A06 != null) {
            r2 = (C134216qE) A05(this).A06.get(this.A06);
        } else {
            r2 = null;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.A0S.A0F(A04(r2));
        }
    }

    public void BmO(C89344cJ r2) {
        this.A0y.A0F(r2);
    }

    public void Bn6(long j) {
        if (!this.A09) {
            this.A0K.A0F(Long.valueOf(j));
        }
    }

    public void Bnc() {
        if (!this.A17.isEmpty()) {
            if (C18020vd.A05(C18040vf.A02, this.A0g, 7971)) {
                A0C(A05(this), this, false);
            } else {
                this.A1F.A0G("CallGridViewModel/onCameraOpened", (String) null, false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (X.C18020vd.A00(X.C18040vf.A02, r7.A0g, 3807) >= 3) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bz3(X.C136336te r8, boolean r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x001a
            boolean r0 = r8.A06
            r6 = 2
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L_0x000d
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x001b
        L_0x000d:
            int r0 = r8.A00
            if (r0 != r6) goto L_0x001b
        L_0x0011:
            r7.A0H = r5
            X.4Sa r0 = A05(r7)
        L_0x0017:
            A0C(r0, r7, r4)
        L_0x001a:
            return
        L_0x001b:
            boolean r0 = r8.A05
            if (r0 == 0) goto L_0x0023
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x0035
        L_0x0023:
            int r0 = r8.A00
            if (r0 != r5) goto L_0x0035
            X.0ve r2 = r7.A0g
            r1 = 3807(0xedf, float:5.335E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 3
            if (r1 < r0) goto L_0x0035
            goto L_0x0011
        L_0x0035:
            X.1DT r0 = r7.A0M
            java.lang.Object r2 = r0.A06()
            X.11S r1 = r7.A0V
            X.8yP r3 = r7.A0W
            X.4Sa r0 = r3.A07()
            boolean r0 = r0.A0N
            com.whatsapp.jid.UserJid r0 = X.C40811vJ.A01(r1, r0)
            boolean r0 = X.C42171xk.A00(r2, r0)
            if (r0 == 0) goto L_0x0056
            r7.A0H = r4
        L_0x0051:
            X.4Sa r0 = r3.A07()
            goto L_0x0017
        L_0x0056:
            boolean r0 = r7.A0H
            if (r0 == 0) goto L_0x001a
            r7.A0H = r4
            int r0 = r8.A01
            if (r0 == r6) goto L_0x0051
            if (r0 != r5) goto L_0x001a
            X.0ve r2 = r7.A0g
            r1 = 3807(0xedf, float:5.335E-42)
            X.0vf r0 = X.C18040vf.A02
            int r1 = X.C18020vd.A00(r0, r2, r1)
            r0 = 3
            if (r1 < r0) goto L_0x001a
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.Bz3(X.6te, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r9 == false) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C4Y(com.whatsapp.jid.UserJid r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            r7.A0F = r9
            r7.A08 = r10
            com.whatsapp.jid.UserJid r0 = r7.A06
            X.11S r3 = r7.A0V
            boolean r4 = r3.A0O(r0)
            boolean r2 = r3.A0O(r8)
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x002e
            X.00H r1 = r7.A16
            X.A1P r0 = X.C108945cZ.A0d(r1)
            if (r4 == 0) goto L_0x00ee
            X.6uK r0 = r0.A0P
        L_0x001e:
            r0.A00()
            if (r9 == 0) goto L_0x002e
            X.A1P r0 = X.C108945cZ.A0d(r1)
            if (r2 == 0) goto L_0x00ea
            X.6uK r0 = r0.A0P
        L_0x002b:
            r0.A02()
        L_0x002e:
            int r1 = r7.A00
            r0 = 1
            if (r1 == r0) goto L_0x0036
            r0 = 3
            if (r1 != r0) goto L_0x004d
        L_0x0036:
            X.00H r0 = r7.A16
            X.A1P r1 = X.C108945cZ.A0d(r0)
            if (r2 != 0) goto L_0x0041
            r0 = 1
            if (r9 != 0) goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            X.6uK r1 = r1.A0L
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x004d
            r1.A02()
        L_0x004d:
            if (r9 == 0) goto L_0x006f
            com.whatsapp.jid.UserJid r6 = r7.A06
            if (r6 == 0) goto L_0x006f
            X.6ih r5 = r7.A0Y
            java.util.Set r0 = r5.A03
            r0.add(r6)
            java.util.Map r4 = r5.A02
            X.0wl r0 = r5.A04
            X.1OY r2 = X.AnonymousClass1OW.A02(r0)
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1
            r0.<init>(r5, r6, r1)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r2)
            r4.put(r6, r0)
        L_0x006f:
            boolean r0 = r3.A0O(r8)
            if (r0 != 0) goto L_0x0095
            X.6ih r5 = r7.A0Y
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            java.util.Set r0 = r5.A03
            r0.add(r8)
            java.util.Map r4 = r5.A02
            X.0wl r0 = r5.A04
            X.1OY r2 = X.AnonymousClass1OW.A02(r0)
            r1 = 0
            com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1 r0 = new com.whatsapp.calling.callgrid.viewmodel.ScreenSharePeerTransitionStateProvider$peerEnteredTransitionState$1
            r0.<init>(r5, r8, r1)
            X.1e4 r0 = X.AnonymousClass3MY.A0s(r0, r2)
            r4.put(r8, r0)
        L_0x0095:
            if (r9 == 0) goto L_0x00e3
            X.4Sa r0 = A05(r7)
            X.10w r0 = r0.A06
            java.lang.Object r2 = r0.get(r8)
            X.6qE r2 = (X.C134216qE) r2
        L_0x00a3:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x00b2
            X.1DT r1 = r7.A0S
            android.util.Rational r0 = r7.A04(r2)
            r1.A0F(r0)
        L_0x00b2:
            X.4Sa r2 = A05(r7)
            r0 = 0
            A0C(r2, r7, r0)
            X.1DT r1 = r7.A0N
            java.lang.Object r0 = r1.A06()
            if (r0 == 0) goto L_0x00e2
            java.util.List r0 = X.AnonymousClass3MW.A10(r1)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e2
            java.util.LinkedHashMap r0 = r7.A18
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            boolean r0 = r2.A0N
            com.whatsapp.jid.UserJid r0 = X.C40811vJ.A01(r3, r0)
            r1.remove(r0)
            r7.A0Z(r1)
        L_0x00e2:
            return
        L_0x00e3:
            r2 = 0
            goto L_0x00a3
        L_0x00e5:
            r1.A00()
            goto L_0x004d
        L_0x00ea:
            X.6uK r0 = r0.A0M
            goto L_0x002b
        L_0x00ee:
            X.6uK r0 = r0.A0M
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.C4Y(com.whatsapp.jid.UserJid, boolean, boolean):void");
    }

    public static Pair A03(UserJid userJid, List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass70A r1 = (AnonymousClass70A) it.next();
            if (userJid.equals(r1.A0h)) {
                it.remove();
                return C108945cZ.A0N(Integer.valueOf(i), r1);
            }
            i++;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r6.A0K != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.LinkedHashMap A07(X.C86534Sa r6, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r7) {
        /*
            java.util.LinkedHashMap r4 = X.C17880vN.A13()
            com.whatsapp.voipcalling.CallState r1 = r6.A0B
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x000f
            boolean r0 = r6.A0K
            r5 = 1
            if (r0 == 0) goto L_0x0010
        L_0x000f:
            r5 = 0
        L_0x0010:
            boolean r0 = r6.A0G
            if (r0 != 0) goto L_0x0029
            boolean r0 = r6.A0Q
            if (r0 != 0) goto L_0x0029
            boolean r0 = r6.A0L
            if (r0 != 0) goto L_0x0029
            X.0vp r0 = r7.A19
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0029
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0029
        L_0x0028:
            return r4
        L_0x0029:
            X.10w r0 = r6.A06
            X.10f r0 = r0.entrySet()
            X.1IZ r3 = r0.iterator()
        L_0x0033:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0028
            java.util.Map$Entry r2 = X.AnonymousClass000.A16(r3)
            java.lang.Object r0 = r2.getValue()
            X.6qE r0 = (X.C134216qE) r0
            boolean r0 = r0.A0M
            if (r0 != 0) goto L_0x0054
            java.lang.Object r0 = r2.getValue()
            X.6qE r0 = (X.C134216qE) r0
            int r1 = r0.A04
            r0 = 1
            if (r1 != r0) goto L_0x0033
            if (r5 == 0) goto L_0x0033
        L_0x0054:
            X.C108985cd.A1T(r2, r4)
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A07(X.4Sa, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel):java.util.LinkedHashMap");
    }

    public LinkedHashMap A0V(C86534Sa r2) {
        return A07(r2, this);
    }

    public void A0Z(List list) {
        if (list.size() > 1) {
            C175258yP r3 = this.A0W;
            Set set = r3.A0E;
            if (!set.containsAll(list) || set.size() != list.size()) {
                set.clear();
                set.addAll(list);
                C200710s r2 = r3.A0B;
                r2.A03();
                r2.execute(new C21446AkD(r3, 49));
            }
        }
    }

    public void BnM(C86534Sa r3) {
        if (A07(r3, this).size() > 8) {
            A0C(r3, this, true);
        }
    }

    public void C08(UserJid userJid) {
        C134216qE r2 = (C134216qE) A05(this).A06.get(userJid);
        if (r2 != null) {
            if (userJid.equals(this.A06) && Build.VERSION.SDK_INT >= 26) {
                this.A0S.A0F(A04(r2));
            }
            if (userJid.equals(this.A07)) {
                A0A(r2, this);
            } else {
                A09(r2);
            }
            if (C108965cb.A1W(this.A0M, userJid)) {
                A08(r2);
            }
        }
    }

    public CallGridViewModel(AnonymousClass1L9 r10, AnonymousClass190 r11, AnonymousClass11S r12, C175258yP r13, C143867Fc r14, C129986ih r15, AnonymousClass1V9 r16, C21141AfC afC, AnonymousClass1M9 r18, C24921Me r19, AnonymousClass118 r20, AnonymousClass1MZ r21, C23661Hd r22, C18030ve r23, AnonymousClass126 r24, C24901Mc r25, AnonymousClass1DC r26, AnonymousClass10I r27, VoipCameraManager voipCameraManager, AnonymousClass00H r29, AnonymousClass00H r30, C18140vp r31, C18140vp r32, C18140vp r33, C18140vp r34) {
        C41731wy A0o2 = AnonymousClass3MW.A0o();
        this.A10 = A0o2;
        this.A0o = AnonymousClass3MW.A0n(false);
        C41111vp A0n2 = AnonymousClass3MW.A0n(false);
        this.A0n = A0n2;
        this.A0q = AnonymousClass3MW.A0n(false);
        this.A0m = AnonymousClass3MW.A0n(C139926zf.A04);
        this.A0T = AnonymousClass3MW.A0M((Object) null);
        this.A0w = AnonymousClass3MW.A0n(false);
        this.A0x = AnonymousClass3MW.A0n(2132084310);
        this.A0S = C108945cZ.A0S();
        this.A0l = AnonymousClass3MW.A0n(new C135156rk(2131169249, C72463Mc.A1O(A0n2), !C72463Mc.A1O(this.A0r) ? 14 : 0));
        this.A0v = AnonymousClass3MW.A0n(AnonymousClass3MW.A07());
        this.A0u = AnonymousClass3MW.A0n(AnonymousClass6RE.NONE);
        this.A0j = AnonymousClass3MW.A0n(new C134536qk(8, (Bitmap) null));
        this.A0y = AnonymousClass3MW.A0o();
        this.A0t = AnonymousClass3MW.A0n(false);
        this.A0k = AnonymousClass3MW.A0n(0);
        this.A11 = AnonymousClass3MW.A0o();
        this.A0P = AnonymousClass3MW.A0M((Object) null);
        this.A0Q = AnonymousClass3MW.A0M((Object) null);
        this.A0z = AnonymousClass3MW.A0o();
        this.A03 = C92724hn.A00;
        this.A0E = false;
        this.A0H = true;
        C18030ve r1 = r23;
        this.A0g = r1;
        this.A0V = r12;
        this.A1H = r20;
        this.A13 = r27;
        this.A0i = r25;
        this.A0f = r22;
        this.A1E = r10;
        this.A1G = r14;
        AnonymousClass1DC r5 = r26;
        this.A12 = r5;
        this.A0c = r18;
        this.A14 = voipCameraManager;
        this.A0d = r19;
        this.A0h = r24;
        this.A0Z = r16;
        this.A0e = r21;
        this.A16 = r29;
        this.A19 = r31;
        this.A1A = r32;
        this.A1B = r33;
        this.A1C = r34;
        C21141AfC afC2 = afC;
        this.A0b = afC2;
        this.A15 = r30;
        this.A0Y = r15;
        this.A1F = r11;
        C18040vf r7 = C18040vf.A02;
        this.A1D = C18020vd.A05(r7, r1, 2594);
        this.A0X = new C128326fo();
        this.A18 = C17880vN.A13();
        this.A17 = C17880vN.A12();
        this.A0R = C108945cZ.A0S();
        this.A0N = C108945cZ.A0S();
        A0o2.A0F(AnonymousClass000.A13());
        this.A0W = r13;
        r13.registerObserver(this);
        C86534Sa A072 = r13.A07();
        this.A09 = C18020vd.A05(r7, r1, 7175);
        AnonymousClass1IZ it = A072.A06.values().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((C134216qE) it.next()).A0L) {
                    this.A0F = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.A08 = true;
        A0C(A072, this, false);
        afC2.A01 = this;
        AnonymousClass1DT r2 = this.A0U;
        Object A062 = r2.A06();
        C17960vV.A07(A062);
        C130786k0 r17 = (C130786k0) A062;
        r17.A02 = 2131169249;
        if (!(r17.A09 && r17.A08)) {
            r17.A09 = true;
            r17.A08 = true;
            r2.A0F(r17);
        }
        if (r5.BgK()) {
            AnonymousClass7AH r110 = new AnonymousClass7AH(r13, this, 1);
            this.A0J = r110;
            r15.A00.A0C(r110);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: X.6qE[][]} */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0285, code lost:
        if (r7.equals(r12.A07) == false) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a0, code lost:
        if (X.C108965cb.A1W(r0, r7) != false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02fa, code lost:
        if (r9 <= 3) goto L_0x05c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03ab, code lost:
        if (r4 != 2) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03b9, code lost:
        if (r25 != false) goto L_0x03bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03e2, code lost:
        if (r9 > 1) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03e4, code lost:
        if (r5 != false) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x040d, code lost:
        if (r26 == false) goto L_0x040f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0422, code lost:
        if (r9 >= r0) goto L_0x0424;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0459, code lost:
        if (r35 != 1) goto L_0x0520;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x04ab, code lost:
        if (r4 != 4) goto L_0x04ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x04c8, code lost:
        if (r12.A0A == false) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0508, code lost:
        if (r4 != 2) goto L_0x04ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0517, code lost:
        if (X.C18020vd.A00(r31, r14, 3807) >= 3) goto L_0x0519;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x058c, code lost:
        if (r1 >= -1) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x0637, code lost:
        if (r30 == false) goto L_0x0639;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0693, code lost:
        if (r11 == false) goto L_0x0695;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x09e7, code lost:
        if (r3 <= X.C108965cb.A01(r6)) goto L_0x09e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0a2e, code lost:
        if (r27.size() == 1) goto L_0x0a30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0a56, code lost:
        if (r27.size() == 0) goto L_0x0a30;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x032c  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x04e8  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x04fc  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x054b  */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x05b7  */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x05df  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:503:0x087f  */
    /* JADX WARNING: Removed duplicated region for block: B:551:0x0928  */
    /* JADX WARNING: Removed duplicated region for block: B:575:0x09a4  */
    /* JADX WARNING: Removed duplicated region for block: B:648:0x0ac1  */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0ace  */
    /* JADX WARNING: Removed duplicated region for block: B:654:0x0ad5  */
    /* JADX WARNING: Removed duplicated region for block: B:657:0x0ae9  */
    /* JADX WARNING: Removed duplicated region for block: B:663:0x0b12  */
    /* JADX WARNING: Removed duplicated region for block: B:666:0x0b27  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0C(X.C86534Sa r39, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r40, boolean r41) {
        /*
            r12 = r40
            X.1vp r1 = r12.A0t
            r13 = r39
            boolean r0 = r13.A0G
            r16 = r0
            X.AnonymousClass3MY.A1L(r1, r0)
            X.1vp r1 = r12.A0k
            int r0 = r13.A02
            X.AnonymousClass3MX.A1J(r1, r0)
            if (r16 == 0) goto L_0x001d
            boolean r0 = r12.A0a()
            if (r0 != 0) goto L_0x001d
            return
        L_0x001d:
            java.util.LinkedHashMap r17 = r12.A0V(r13)
            int r2 = r17.size()
            X.0ve r14 = r12.A0g
            r1 = 5055(0x13bf, float:7.084E-42)
            X.0vf r31 = X.C18040vf.A02
            r0 = r31
            boolean r0 = X.C18020vd.A05(r0, r14, r1)
            int r0 = X.C72453Mb.A05(r0)
            boolean r11 = r13.A0Q
            if (r11 != 0) goto L_0x005f
            if (r2 > r0) goto L_0x005f
            if (r16 != 0) goto L_0x005f
            java.util.HashMap r3 = new java.util.HashMap
            r0 = r17
            r3.<init>(r0)
            java.util.Iterator r2 = X.C17890vO.A0l(r17)
        L_0x0048:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005d
            java.lang.Object r1 = r2.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0M
            if (r0 == 0) goto L_0x0048
            com.whatsapp.jid.UserJid r0 = r1.A0A
            r3.remove(r0)
        L_0x005d:
            r17 = r3
        L_0x005f:
            r10 = 0
            com.whatsapp.voipcalling.CallState r0 = r13.A0B
            r40 = r0
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.CallState.NONE
            r18 = 0
            if (r0 == r1) goto L_0x008c
            X.1vp r3 = r12.A0j
            java.lang.Object r0 = r3.A06()
            X.6qk r0 = (X.C134536qk) r0
            int r0 = r0.A00
            r2 = 8
            if (r0 != r2) goto L_0x0082
            java.lang.Object r0 = r3.A06()
            X.6qk r0 = (X.C134536qk) r0
            android.graphics.Bitmap r0 = r0.A01
            if (r0 == 0) goto L_0x008c
        L_0x0082:
            X.6qk r1 = new X.6qk
            r0 = r18
            r1.<init>(r2, r0)
            r3.A0F(r1)
        L_0x008c:
            X.1vp r0 = r12.A0r
            r39 = r0
            boolean r0 = X.C72463Mc.A1O(r39)
            if (r11 == r0) goto L_0x00ad
            X.6fo r1 = r12.A0X
            java.util.Map r0 = r1.A00
            r0.clear()
            java.util.Set r0 = r1.A01
            r0.clear()
            X.0vl r0 = r1.A02
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
        L_0x00ad:
            r0 = r18
            r12.A06 = r0
            X.1DC r0 = r12.A12
            boolean r0 = r0.BgK()
            if (r0 == 0) goto L_0x00d1
            java.util.Iterator r2 = X.C17890vO.A0l(r17)
        L_0x00bd:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r1 = r2.next()
            X.6qE r1 = (X.C134216qE) r1
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x00bd
            com.whatsapp.jid.UserJid r0 = r1.A0A
            r12.A06 = r0
        L_0x00d1:
            X.0vp r0 = r12.A19
            r38 = r0
            boolean r0 = X.C40811vJ.A0b(r14, r0)
            if (r0 != 0) goto L_0x0100
            int r3 = r17.size()
            boolean r0 = r13.A0M
            boolean r1 = r13.A0N
            com.whatsapp.jid.UserJid r4 = r12.A06
            r2 = 0
            if (r4 == 0) goto L_0x0192
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x00f8
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x00fe
            X.11S r0 = r12.A0V
            boolean r0 = r0.A0O(r4)
            if (r0 != 0) goto L_0x00fe
        L_0x00f8:
            X.11S r0 = r12.A0V
            com.whatsapp.jid.UserJid r2 = X.C40811vJ.A01(r0, r1)
        L_0x00fe:
            r12.A07 = r2
        L_0x0100:
            A0B(r13, r12)
            r1 = 1
            if (r11 == 0) goto L_0x01c5
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r7 = X.C17890vO.A0l(r17)
        L_0x010e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r5 = r7.next()
            X.6qE r5 = (X.C134216qE) r5
            com.whatsapp.voipcalling.camera.VoipCameraManager r2 = r12.A14
            boolean r0 = r12.A0D
            boolean r0 = X.AnonymousClass73H.A04(r5, r14, r2, r0)
            X.6fo r4 = r12.A0X
            if (r0 == 0) goto L_0x0176
            com.whatsapp.jid.UserJid r3 = r5.A0A
            X.C18070vi.A0d(r3, r10)
            X.0vl r2 = r4.A02
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r2)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x0155
            java.util.Map r0 = r4.A00
            r0.remove(r3)
            java.util.Set r0 = r4.A01
            r0.remove(r3)
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r2)
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r3)
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r2)
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r3)
        L_0x0155:
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r2)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0172
            java.util.Map r0 = r4.A00
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x010e
            java.util.Set r0 = r4.A01
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x0172
            goto L_0x010e
        L_0x0172:
            r6.add(r5)
            goto L_0x010e
        L_0x0176:
            com.whatsapp.jid.UserJid r2 = r5.A0A
            X.C18070vi.A0d(r2, r10)
            java.util.Map r0 = r4.A00
            r0.remove(r2)
            java.util.Set r0 = r4.A01
            r0.remove(r2)
            X.0vl r0 = r4.A02
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.Set r0 = (java.util.Set) r0
            r0.remove(r2)
            goto L_0x010e
        L_0x0192:
            if (r0 == 0) goto L_0x019a
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x019a
            goto L_0x00fe
        L_0x019a:
            com.whatsapp.jid.UserJid r0 = r12.A07
            if (r0 == 0) goto L_0x01a1
            r0 = 2
            if (r3 <= r0) goto L_0x0100
        L_0x01a1:
            X.11S r0 = r12.A0V
            com.whatsapp.jid.UserJid r0 = X.C40811vJ.A01(r0, r1)
            r12.A07 = r0
            goto L_0x0100
        L_0x01ab:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x01c5
            X.10I r4 = r12.A13
            X.6LO r3 = new X.6LO
            r3.<init>(r12)
            X.6qE[][] r2 = new X.C134216qE[r1][]
            X.6qE[] r0 = new X.C134216qE[r10]
            java.lang.Object[] r0 = r6.toArray(r0)
            r2[r10] = r0
            r4.CGM(r3, r2)
        L_0x01c5:
            int r9 = r17.size()
            boolean r0 = r13.A0N
            r37 = r0
            boolean r2 = r13.A0K
            if (r11 == 0) goto L_0x021e
            r0 = r40
            X.C18070vi.A0d(r0, r10)
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r0 == r3) goto L_0x01de
            com.whatsapp.voipcalling.CallState r3 = com.whatsapp.voipcalling.CallState.CONNECTED_LONELY
            if (r0 != r3) goto L_0x021e
        L_0x01de:
            r0 = r38
            boolean r0 = X.C40811vJ.A0b(r14, r0)
            if (r0 == 0) goto L_0x021e
            if (r2 != 0) goto L_0x021e
            X.11S r2 = r12.A0V
            com.whatsapp.jid.UserJid r0 = r12.A06
            boolean r0 = r2.A0O(r0)
            if (r0 != 0) goto L_0x021e
            r0 = r37
            com.whatsapp.jid.UserJid r4 = X.C40811vJ.A01(r2, r0)
            int r3 = r17.size()
            r0 = 4
            if (r3 >= r0) goto L_0x0211
            X.6sX r0 = r12.A04
            if (r0 == 0) goto L_0x064c
            com.whatsapp.jid.UserJid r0 = r0.A02
            if (r0 != 0) goto L_0x0211
            com.whatsapp.jid.UserJid r0 = r12.A06
            if (r0 == 0) goto L_0x064c
            boolean r0 = r2.A0O(r0)
            if (r0 != 0) goto L_0x064c
        L_0x0211:
            X.6sX r0 = r12.A04
            if (r0 == 0) goto L_0x021e
            com.whatsapp.jid.UserJid r1 = r0.A02
            if (r1 == 0) goto L_0x021e
            r0 = r17
            r0.remove(r1)
        L_0x021e:
            java.util.ArrayList r20 = X.AnonymousClass000.A13()
            java.util.ArrayList r19 = X.AnonymousClass000.A13()
            java.util.Iterator r33 = X.C17890vO.A0l(r17)
            r36 = r18
        L_0x022c:
            boolean r0 = r33.hasNext()
            if (r0 == 0) goto L_0x065c
            java.lang.Object r8 = r33.next()
            X.6qE r8 = (X.C134216qE) r8
            java.util.LinkedHashMap r2 = r12.A18
            com.whatsapp.jid.UserJid r7 = r8.A0A
            boolean r0 = r2.containsKey(r7)
            if (r0 == 0) goto L_0x0640
            java.lang.Object r0 = r2.get(r7)
            X.C17960vV.A07(r0)
            X.70A r0 = (X.AnonymousClass70A) r0
            android.util.Pair r1 = r0.A09
        L_0x024d:
            boolean r0 = r2.containsKey(r7)
            if (r0 != 0) goto L_0x0258
            r0 = r19
            r0.add(r7)
        L_0x0258:
            boolean r0 = r8.A0M
            r32 = r0
            int r4 = r17.size()
            boolean r3 = r13.A0M
            if (r11 == 0) goto L_0x0287
            r2 = 1
            if (r3 == 0) goto L_0x026b
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x026d
        L_0x026b:
            if (r4 <= r2) goto L_0x0287
        L_0x026d:
            r0 = 4
            if (r4 < r0) goto L_0x027e
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x0287
            X.11S r2 = r12.A0V
            com.whatsapp.jid.UserJid r0 = r12.A06
            boolean r0 = r2.A0O(r0)
            if (r0 != 0) goto L_0x0287
        L_0x027e:
            com.whatsapp.jid.UserJid r0 = r12.A07
            boolean r0 = r7.equals(r0)
            r6 = 1
            if (r0 != 0) goto L_0x0288
        L_0x0287:
            r6 = 0
        L_0x0288:
            boolean r0 = r12.A0I(r9)
            if (r0 != 0) goto L_0x0290
            if (r3 == 0) goto L_0x02a2
        L_0x0290:
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x02a2
            X.1DT r0 = r12.A0M
            java.lang.Object r2 = r0.A06()
            if (r2 == 0) goto L_0x02a2
            boolean r0 = X.C108965cb.A1W(r0, r7)
            if (r0 != 0) goto L_0x02ae
        L_0x02a2:
            X.6sX r0 = r12.A04
            if (r0 == 0) goto L_0x063d
            com.whatsapp.jid.UserJid r0 = r0.A00
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x063d
        L_0x02ae:
            r5 = 1
        L_0x02af:
            boolean r0 = r13.A0L
            r30 = r0
            boolean r15 = r12.A0B
            X.1EC r0 = r13.A08
            r29 = r0
            boolean r0 = r13.A0J
            r28 = r0
            X.1M9 r0 = r12.A0c
            X.1E7 r27 = r0.A0H(r7)
            int r4 = X.AnonymousClass73H.A00(r8)
            int r0 = r8.A08
            r35 = r0
            r2 = 6
            boolean r26 = X.AnonymousClass000.A1T(r0, r2)
            boolean r0 = r12.A09
            r25 = r0
            int r0 = r8.A03
            r21 = r0
            r24 = 0
            if (r30 != 0) goto L_0x05ce
            if (r11 != 0) goto L_0x05ce
            if (r25 == 0) goto L_0x05ce
        L_0x02e0:
            r3 = 3
            if (r9 > r3) goto L_0x02e5
            if (r6 == 0) goto L_0x05ca
        L_0x02e5:
            boolean r0 = r12.A0A
            if (r0 == 0) goto L_0x05ca
            if (r5 != 0) goto L_0x05ca
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x05ca
            if (r32 == 0) goto L_0x05ca
            r2 = 1
            r0 = r35
            if (r0 != r2) goto L_0x05ca
            if (r15 != 0) goto L_0x05ca
            r23 = 1
            if (r9 <= r3) goto L_0x05c6
        L_0x02fc:
            r2 = 2
            if (r11 == 0) goto L_0x05ba
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x05c6
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x05c6
            if (r24 != 0) goto L_0x05c6
            if (r9 > r2) goto L_0x0317
            if (r6 != 0) goto L_0x0317
            boolean r0 = r12.A0F
            if (r0 != 0) goto L_0x0317
            boolean r0 = X.C72463Mc.A1Z(r38)
            if (r0 != 0) goto L_0x05c6
        L_0x0317:
            r22 = 1
        L_0x0319:
            X.6fo r2 = r12.A0X
            X.C18070vi.A0d(r7, r10)
            X.0vl r0 = r2.A02
            java.lang.Object r0 = X.AnonymousClass3MX.A14(r0)
            java.util.Set r0 = (java.util.Set) r0
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x05b7
            java.util.Map r0 = r2.A00
            java.lang.Object r3 = r0.get(r7)
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
        L_0x0334:
            X.11S r0 = r12.A0V
            r34 = r0
            int r0 = X.C108965cb.A01(r1)
            r15 = -1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            if (r0 != r15) goto L_0x05a2
            int r0 = X.C108965cb.A00(r1)
            if (r0 != r15) goto L_0x05a2
        L_0x0349:
            boolean r2 = r12.A0D
            boolean r0 = r12.A0G
            if (r11 == 0) goto L_0x059e
            if (r2 != 0) goto L_0x059e
            if (r32 != 0) goto L_0x059a
            int r2 = X.AnonymousClass73H.A00(r8)
            r0 = 3
            if (r2 != r0) goto L_0x059e
            r2 = 2
            r0 = r21
            if (r0 != r2) goto L_0x059e
        L_0x035f:
            r21 = 1
        L_0x0361:
            X.71r r2 = new X.71r
            r0 = r27
            r2.<init>(r0, r7)
            r0 = r32
            r2.A0N = r0
            r2.A09 = r1
            r2.A0J = r6
            r2.A0E = r5
            r2.A0O = r11
            boolean r0 = r8.A0N
            r2.A0K = r0
            boolean r0 = r8.A0D
            if (r0 == 0) goto L_0x054b
            r0 = 3
            if (r4 != r0) goto L_0x054b
            r1 = -2
        L_0x0380:
            r2.A03 = r1
            r0 = r30
            r2.A0F = r0
            r1 = 2131103434(0x7f060eca, float:1.7819334E38)
            if (r22 != 0) goto L_0x0398
            r0 = 2
            r1 = 2131103415(0x7f060eb7, float:1.7819296E38)
            if (r4 == r0) goto L_0x0398
            r0 = 3
            r1 = -1
            if (r4 != r0) goto L_0x0398
            r1 = 2131103410(0x7f060eb2, float:1.7819285E38)
        L_0x0398:
            r2.A02 = r1
            r0 = r22
            r2.A0a = r0
            r1 = 3
            boolean r0 = X.AnonymousClass000.A1T(r4, r1)
            r2.A0S = r0
            if (r22 != 0) goto L_0x03ad
            if (r4 == r1) goto L_0x03ad
            r15 = 2
            r0 = 0
            if (r4 != r15) goto L_0x03ae
        L_0x03ad:
            r0 = 1
        L_0x03ae:
            r2.A0R = r0
            r0 = r24
            r2.A0C = r0
            if (r30 != 0) goto L_0x03bb
            if (r24 != 0) goto L_0x03bb
            r0 = 1
            if (r25 == 0) goto L_0x03bc
        L_0x03bb:
            r0 = 0
        L_0x03bc:
            r2.A0W = r0
            if (r5 != 0) goto L_0x0548
            if (r25 == 0) goto L_0x03c4
            if (r30 == 0) goto L_0x0548
        L_0x03c4:
            r0 = 1
        L_0x03c5:
            r2.A0b = r0
            r0 = 1
            if (r26 != 0) goto L_0x03d2
            boolean r15 = r8.A0E
            if (r15 != 0) goto L_0x03d2
            if (r28 == 0) goto L_0x0545
            if (r3 != 0) goto L_0x0545
        L_0x03d2:
            r15 = 1
        L_0x03d3:
            r2.A0D = r15
            int r15 = r12.A00
            int r15 = r15 * -90
            r2.A04 = r15
            r2.A08 = r3
            if (r11 == 0) goto L_0x0542
            r3 = 1
            if (r6 == 0) goto L_0x03e4
            if (r9 > r0) goto L_0x03e6
        L_0x03e4:
            if (r5 == 0) goto L_0x0542
        L_0x03e6:
            r2.A0T = r3
            if (r11 == 0) goto L_0x052f
            X.6sX r3 = r12.A04
            if (r3 == 0) goto L_0x03f2
            boolean r3 = r3.A03
            if (r3 == 0) goto L_0x053f
        L_0x03f2:
            boolean r3 = r12.A0I(r9)
            if (r3 != 0) goto L_0x0402
            X.1vp r3 = r12.A0u
            java.lang.Object r15 = r3.A06()
            X.6RE r3 = X.AnonymousClass6RE.NONE
            if (r15 == r3) goto L_0x053f
        L_0x0402:
            r2.A0U = r0
            r2.A0V = r10
            boolean r0 = r8.A0H
            r2.A0I = r0
            if (r11 == 0) goto L_0x040f
            r0 = 1
            if (r26 != 0) goto L_0x0410
        L_0x040f:
            r0 = 0
        L_0x0410:
            r2.A0e = r0
            r3 = 2388(0x954, float:3.346E-42)
            r0 = r31
            int r0 = X.C18020vd.A00(r0, r14, r3)
            r3 = 1
            if (r11 == 0) goto L_0x052c
            if (r9 < r0) goto L_0x0529
            if (r5 != 0) goto L_0x0424
            r0 = 4
        L_0x0422:
            if (r9 < r0) goto L_0x0529
        L_0x0424:
            r2.A0Q = r3
            int r0 = r8.A00
            r2.A06 = r0
            r3 = 1
            if (r9 <= r3) goto L_0x0526
            com.whatsapp.voipcalling.camera.VoipCameraManager r0 = r12.A14
            boolean r0 = X.AnonymousClass73H.A03(r8, r14, r0)
            if (r0 != 0) goto L_0x0526
        L_0x0435:
            r2.A0f = r3
            boolean r3 = r12.A0D
            r2.A0H = r3
            boolean r0 = r12.A1D
            r2.A0P = r0
            if (r3 == 0) goto L_0x0523
            if (r24 != 0) goto L_0x0445
            if (r4 != r1) goto L_0x0523
        L_0x0445:
            r0 = 1
        L_0x0446:
            r2.A0c = r0
            r0 = r21
            r2.A0Z = r0
            if (r3 != 0) goto L_0x0520
            if (r11 == 0) goto L_0x0520
            if (r32 != 0) goto L_0x0520
            boolean r0 = r8.A0E
            if (r0 == 0) goto L_0x0520
            r3 = 1
            r0 = r35
            if (r0 != r3) goto L_0x0520
        L_0x045b:
            r2.A0Y = r3
            int r3 = r12.A00
            X.0vp r0 = r12.A1B
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r11 == 0) goto L_0x051d
            if (r0 == 0) goto L_0x051d
            r4 = 3153(0xc51, float:4.418E-42)
            r0 = r31
            int r4 = X.C18020vd.A00(r0, r14, r4)
            r0 = 2
            if (r4 >= r0) goto L_0x0476
            if (r26 != 0) goto L_0x051d
        L_0x0476:
            r2.A07 = r3
            X.6ih r0 = r12.A0Y
            java.util.Set r0 = r0.A03
            boolean r0 = r0.contains(r7)
            r2.A0d = r0
            if (r32 == 0) goto L_0x04ad
            r0 = 2
            if (r9 != r0) goto L_0x048b
            if (r6 != 0) goto L_0x048b
            if (r5 == 0) goto L_0x04ad
        L_0x048b:
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x04ad
            boolean r0 = r12.A0H
            if (r0 != 0) goto L_0x0495
            if (r5 == 0) goto L_0x04ad
        L_0x0495:
            boolean r0 = X.C72463Mc.A1Z(r38)
            if (r0 != 0) goto L_0x04ad
            int r4 = r8.A02
            r0 = 1
            if (r5 == 0) goto L_0x0504
            if (r4 == r0) goto L_0x0519
            r0 = 2
            if (r4 == r0) goto L_0x050b
            if (r4 == r1) goto L_0x0500
            r0 = 4
            r3 = 2131233374(0x7f080a5e, float:1.8082884E38)
            if (r4 == r0) goto L_0x04ae
        L_0x04ad:
            r3 = 0
        L_0x04ae:
            r2.A05 = r3
            r1 = r40
            r0 = r32
            float r0 = r12.A0T(r1, r0)
            r2.A00 = r0
            r0 = r23
            r2.A0X = r0
            X.5Wl r0 = r12.A03
            r2.A0A = r0
            if (r6 == 0) goto L_0x04ca
            boolean r1 = r12.A0A
            r0 = 1073741824(0x40000000, float:2.0)
            if (r1 != 0) goto L_0x04cc
        L_0x04ca:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x04cc:
            r2.A01 = r0
            X.70A r1 = r2.A01()
            r0 = r20
            r0.add(r1)
            if (r5 == 0) goto L_0x04e6
            r0 = r38
            boolean r0 = X.C40811vJ.A0b(r14, r0)
            if (r0 != 0) goto L_0x04e6
            r12.A08(r8)
            r36 = r7
        L_0x04e6:
            if (r6 == 0) goto L_0x04fc
            A0A(r8, r12)
        L_0x04eb:
            if (r18 != 0) goto L_0x022c
            r0 = 2
            if (r9 != r0) goto L_0x022c
            if (r6 != 0) goto L_0x022c
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x022c
            if (r11 == 0) goto L_0x022c
            r18 = r7
            goto L_0x022c
        L_0x04fc:
            r12.A09(r8)
            goto L_0x04eb
        L_0x0500:
            r3 = 2131233373(0x7f080a5d, float:1.8082882E38)
            goto L_0x04ae
        L_0x0504:
            r3 = 0
            if (r4 == r0) goto L_0x050f
            r0 = 2
            if (r4 == r0) goto L_0x050b
            goto L_0x04ae
        L_0x050b:
            r3 = 2131233376(0x7f080a60, float:1.8082888E38)
            goto L_0x04ae
        L_0x050f:
            r4 = 3807(0xedf, float:5.335E-42)
            r0 = r31
            int r0 = X.C18020vd.A00(r0, r14, r4)
            if (r0 < r1) goto L_0x04ae
        L_0x0519:
            r3 = 2131233375(0x7f080a5f, float:1.8082886E38)
            goto L_0x04ae
        L_0x051d:
            r3 = 0
            goto L_0x0476
        L_0x0520:
            r3 = 0
            goto L_0x045b
        L_0x0523:
            r0 = 0
            goto L_0x0446
        L_0x0526:
            r3 = 0
            goto L_0x0435
        L_0x0529:
            r3 = 0
            goto L_0x0424
        L_0x052c:
            r0 = 3
            goto L_0x0422
        L_0x052f:
            r15 = 1111(0x457, float:1.557E-42)
            r3 = r31
            boolean r3 = X.C18020vd.A05(r3, r14, r15)
            if (r3 == 0) goto L_0x053f
            if (r32 != 0) goto L_0x053f
            if (r16 != 0) goto L_0x053f
            goto L_0x0402
        L_0x053f:
            r0 = 0
            goto L_0x0402
        L_0x0542:
            r3 = 0
            goto L_0x03e6
        L_0x0545:
            r15 = 0
            goto L_0x03d3
        L_0x0548:
            r0 = 0
            goto L_0x03c5
        L_0x054b:
            if (r11 != 0) goto L_0x0598
            X.00H r0 = r12.A15
            r27 = r0
            java.lang.Object r0 = r27.get()
            X.3Eo r0 = (X.C71263Eo) r0
            boolean r0 = r0.A03(r7)
            if (r0 != 0) goto L_0x0579
            r15 = 0
            if (r29 == 0) goto L_0x0596
            X.1MZ r1 = r12.A0e
            r0 = r29
            X.2sr r0 = r1.A06(r0, r7)
        L_0x0568:
            java.lang.Object r1 = r27.get()
            X.3Eo r1 = (X.C71263Eo) r1
            if (r0 == 0) goto L_0x0576
            int r0 = r0.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
        L_0x0576:
            r1.A02(r7, r15)
        L_0x0579:
            java.lang.Object r0 = r27.get()
            X.3Eo r0 = (X.C71263Eo) r0
            java.lang.Integer r0 = r0.A01(r7)
            X.C17960vV.A07(r0)
            int r1 = r0.intValue()
            r15 = 0
            r0 = -1
            if (r1 < r0) goto L_0x058f
        L_0x058e:
            r15 = 1
        L_0x058f:
            java.lang.String r0 = "colorIndex should be no less than -1"
            X.C17960vV.A0F(r15, r0)
            goto L_0x0380
        L_0x0596:
            r0 = r15
            goto L_0x0568
        L_0x0598:
            r1 = -1
            goto L_0x058e
        L_0x059a:
            if (r0 == 0) goto L_0x059e
            goto L_0x035f
        L_0x059e:
            r21 = 0
            goto L_0x0361
        L_0x05a2:
            if (r11 == 0) goto L_0x0349
            r0 = 9
            if (r9 >= r0) goto L_0x0349
            r0 = r34
            boolean r0 = X.C40811vJ.A0G(r0, r14)
            if (r0 == 0) goto L_0x0349
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r2, r2)
            goto L_0x0349
        L_0x05b7:
            r3 = 0
            goto L_0x0334
        L_0x05ba:
            boolean r0 = r8.A0I
            if (r0 == 0) goto L_0x05c6
            if (r9 <= r2) goto L_0x0317
            if (r4 == r3) goto L_0x05c6
            if (r4 == r2) goto L_0x05c6
            goto L_0x0317
        L_0x05c6:
            r22 = 0
            goto L_0x0319
        L_0x05ca:
            r23 = 0
            goto L_0x02fc
        L_0x05ce:
            if (r28 == 0) goto L_0x05dc
            r2 = 12603(0x313b, float:1.766E-41)
            r0 = r31
            boolean r0 = X.C18020vd.A05(r0, r14, r2)
            if (r0 == 0) goto L_0x05dc
            goto L_0x02e0
        L_0x05dc:
            r2 = 2
            if (r4 != r2) goto L_0x05ea
            r2 = 2131898264(0x7f122f98, float:1.943144E38)
        L_0x05e2:
            java.lang.Object[] r0 = new java.lang.Object[r10]
        L_0x05e4:
            X.6IR r24 = X.C1402670q.A02(r0, r2)
            goto L_0x02e0
        L_0x05ea:
            r0 = 3
            if (r4 != r0) goto L_0x05fe
            if (r11 == 0) goto L_0x05f5
            if (r21 != 0) goto L_0x02e0
            r2 = 2131898279(0x7f122fa7, float:1.9431471E38)
            goto L_0x05e2
        L_0x05f5:
            r2 = 1
            r0 = r21
            if (r0 == r2) goto L_0x02e0
            r2 = 2131898096(0x7f122ef0, float:1.94311E38)
            goto L_0x05e2
        L_0x05fe:
            r0 = 9
            if (r4 != r0) goto L_0x0606
            r2 = 2131898277(0x7f122fa5, float:1.9431467E38)
            goto L_0x05e2
        L_0x0606:
            r0 = 5
            if (r4 != r0) goto L_0x02e0
            if (r6 != 0) goto L_0x02e0
            boolean r0 = r12.A0D
            if (r0 != 0) goto L_0x0635
            if (r26 != 0) goto L_0x0635
            if (r9 != r2) goto L_0x0635
            if (r5 != 0) goto L_0x0635
            com.whatsapp.jid.UserJid r0 = r12.A06
            if (r0 != 0) goto L_0x0635
            boolean r0 = X.C72463Mc.A1Z(r38)
            if (r0 != 0) goto L_0x0635
            X.1Me r2 = r12.A0d
            r0 = r27
            java.lang.String r3 = X.AnonymousClass3MY.A0q(r2, r0)
            if (r3 == 0) goto L_0x0639
            if (r32 != 0) goto L_0x0639
            r2 = 2131898266(0x7f122f9a, float:1.9431445E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            r0[r10] = r3
            goto L_0x05e4
        L_0x0635:
            if (r11 != 0) goto L_0x02e0
            if (r30 != 0) goto L_0x02e0
        L_0x0639:
            r2 = 2131898275(0x7f122fa3, float:1.9431463E38)
            goto L_0x05e2
        L_0x063d:
            r5 = 0
            goto L_0x02af
        L_0x0640:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r1 = new android.util.Pair
            r1.<init>(r0, r0)
            goto L_0x024d
        L_0x064c:
            r0 = r17
            r0.remove(r4)
            X.6sX r3 = new X.6sX
            r2 = r18
            r3.<init>(r4, r2, r2, r1)
            r12.A04 = r3
            goto L_0x0211
        L_0x065c:
            r26 = 2
            X.1DT r1 = r12.A0M
            java.lang.Object r2 = r1.A06()
            r0 = r36
            if (r2 == r0) goto L_0x0675
            r0 = r38
            boolean r0 = X.C40811vJ.A0b(r14, r0)
            if (r0 != 0) goto L_0x0675
            r0 = r36
            r1.A0F(r0)
        L_0x0675:
            boolean r0 = X.C72463Mc.A1O(r39)
            if (r0 == r11) goto L_0x069f
            r0 = r39
            X.AnonymousClass3MY.A1L(r0, r11)
            X.1vp r1 = r12.A0s
            X.1Hd r0 = r12.A0f
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0695
            X.0vp r0 = r12.A1C
            boolean r0 = X.C72463Mc.A1Z(r0)
            if (r0 == 0) goto L_0x0695
            r0 = 1
            if (r11 != 0) goto L_0x0696
        L_0x0695:
            r0 = 0
        L_0x0696:
            X.AnonymousClass3MY.A1L(r1, r0)
            A0E(r12)
            A0G(r12)
        L_0x069f:
            java.util.LinkedHashMap r0 = r12.A18
            r27 = r0
            java.util.Set r0 = r27.keySet()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            java.util.Set r0 = r17.keySet()
            r1.removeAll(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x06b7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x06e8
            java.lang.Object r2 = r3.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            X.6sX r0 = r12.A04
            if (r0 == 0) goto L_0x06e2
            com.whatsapp.jid.UserJid r0 = r0.A02
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x06d9
            X.6sX r0 = r12.A04
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x06e2
        L_0x06d9:
            r0 = r38
            boolean r0 = X.C40811vJ.A0b(r14, r0)
            if (r0 == 0) goto L_0x06e2
            goto L_0x06b7
        L_0x06e2:
            X.AfC r0 = r12.A0b
            r0.A07(r2)
            goto L_0x06b7
        L_0x06e8:
            boolean r0 = r19.isEmpty()
            if (r0 == 0) goto L_0x06f6
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x06f6
            if (r41 == 0) goto L_0x0a39
        L_0x06f6:
            if (r16 != 0) goto L_0x0a27
            X.7Fc r9 = r12.A1G
            X.1vp r0 = r12.A0n
            boolean r8 = X.C72463Mc.A1O(r0)
            if (r11 == 0) goto L_0x0831
            int r1 = r20.size()
            r0 = 8
            if (r1 <= r0) goto L_0x0831
            r1 = 0
            r3 = 0
        L_0x070c:
            int r0 = r20.size()
            if (r3 >= r0) goto L_0x07b2
            r0 = r20
            java.lang.Object r0 = r0.get(r3)
            X.70A r0 = (X.AnonymousClass70A) r0
            boolean r0 = r0.A0N
            if (r0 == 0) goto L_0x07ae
            r0 = r20
            java.lang.Object r2 = r0.get(r3)
            X.70A r2 = (X.AnonymousClass70A) r2
            r0.remove(r3)
        L_0x0729:
            X.C17960vV.A07(r2)
            r3 = 3
            r0 = r20
            X.C147027Rn.A01(r3, r0)
            r3 = 5
            r4 = 5
            java.util.List r0 = r0.subList(r10, r3)
            java.util.ArrayList r7 = X.C17880vN.A10(r0)
            int r0 = r7.size()
            int r6 = r0 + 1
            int r5 = r9.A01(r6, r8)
            int r14 = r9.A02(r6, r8)
            X.70A[] r9 = new X.AnonymousClass70A[r6]
            android.util.Pair r3 = r2.A09
            int r8 = r6 + -1
            int r0 = X.C108965cb.A01(r3)
            int r15 = r14 + -1
            if (r0 != r15) goto L_0x0798
            int r3 = X.C108965cb.A00(r3)
            int r0 = r5 + -1
            if (r3 != r0) goto L_0x0798
        L_0x0760:
            r9[r8] = r2
            r15 = 0
        L_0x0763:
            int r0 = r7.size()
            if (r15 >= r0) goto L_0x07b5
            java.lang.Object r3 = r7.get(r15)
            X.70A r3 = (X.AnonymousClass70A) r3
            android.util.Pair r2 = r3.A09
            int r0 = X.C108965cb.A01(r2)
            if (r0 >= r14) goto L_0x0795
            int r0 = X.C108965cb.A00(r2)
            if (r0 >= r5) goto L_0x0795
            int r0 = X.C108965cb.A01(r2)
            int r0 = r0 * r5
            int r2 = X.C108965cb.A00(r2)
            int r0 = r0 + r2
            if (r0 < 0) goto L_0x0795
            if (r0 >= r8) goto L_0x0795
            r2 = r9[r0]
            if (r2 != 0) goto L_0x0795
            r9[r0] = r3
            r7.remove(r15)
            goto L_0x0763
        L_0x0795:
            int r15 = r15 + 1
            goto L_0x0763
        L_0x0798:
            X.71r r3 = new X.71r
            r3.<init>(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            int r0 = r5 + -1
            android.util.Pair r0 = X.C17890vO.A0E(r2, r0)
            r3.A09 = r0
            X.70A r2 = r3.A01()
            goto L_0x0760
        L_0x07ae:
            int r3 = r3 + 1
            goto L_0x070c
        L_0x07b2:
            r2 = 0
            goto L_0x0729
        L_0x07b5:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x07ea
            r8 = 0
        L_0x07bc:
            if (r8 >= r6) goto L_0x07ea
            r0 = r9[r8]
            if (r0 != 0) goto L_0x082e
            java.lang.Object r0 = r7.get(r10)
            X.70A r0 = (X.AnonymousClass70A) r0
            X.71r r3 = new X.71r
            r3.<init>(r0)
            int r0 = r8 / r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r8 % r5
            android.util.Pair r0 = X.C17890vO.A0E(r2, r0)
            r3.A09 = r0
            X.70A r0 = r3.A01()
            r9[r8] = r0
            r7.remove(r10)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x082e
        L_0x07ea:
            java.util.List r0 = java.util.Arrays.asList(r9)
            java.util.ArrayList r2 = X.C17880vN.A10(r0)
            int r3 = r20.size()
            r0 = r20
            java.util.List r0 = r0.subList(r4, r3)
            java.util.ArrayList r3 = X.C17880vN.A10(r0)
            r0 = 4
            X.C147027Rn.A01(r0, r3)
            java.util.Iterator r4 = r3.iterator()
        L_0x0808:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0a25
            java.lang.Object r0 = r4.next()
            X.70A r0 = (X.AnonymousClass70A) r0
            X.71r r3 = new X.71r
            r3.<init>(r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r0 = X.C17890vO.A0E(r0, r1)
            r3.A09 = r0
            X.70A r0 = r3.A01()
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0808
        L_0x082e:
            int r8 = r8 + 1
            goto L_0x07bc
        L_0x0831:
            int r0 = r20.size()
            if (r0 == 0) goto L_0x0a23
            int r1 = r20.size()
            r0 = 1
            if (r1 == r0) goto L_0x0a23
            int r0 = r20.size()
            int r25 = r9.A01(r0, r8)
            int r0 = r20.size()
            int r24 = r9.A02(r0, r8)
            java.util.HashMap r7 = X.C17880vN.A11()
            java.util.ArrayList r23 = X.AnonymousClass000.A13()
            int r4 = r20.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r2 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            if (r4 == r2) goto L_0x086e
            r0 = r26
            if (r4 != r0) goto L_0x08c0
            r0 = -1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x086e:
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r3, r3)
        L_0x0873:
            java.util.Iterator r15 = r20.iterator()
            r5 = 0
        L_0x0878:
            boolean r0 = r15.hasNext()
            r4 = -1
            if (r0 == 0) goto L_0x0924
            java.lang.Object r2 = r15.next()
            X.70A r2 = (X.AnonymousClass70A) r2
            boolean r0 = r2.A0N
            if (r0 == 0) goto L_0x088b
            r5 = r2
            goto L_0x0878
        L_0x088b:
            android.util.Pair r3 = r2.A09
            int r0 = X.C108965cb.A01(r3)
            if (r0 == r4) goto L_0x08ba
            java.lang.Object r14 = r3.second
            int r1 = X.AnonymousClass000.A0M(r14)
            if (r1 == r4) goto L_0x08ba
            r0 = r25
            if (r1 >= r0) goto L_0x08ba
            boolean r0 = r7.containsKey(r14)
            if (r0 != 0) goto L_0x08ae
            java.lang.Object r1 = r3.second
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r7.put(r1, r0)
        L_0x08ae:
            java.lang.Object r0 = r3.second
            java.lang.Object r0 = r7.get(r0)
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L_0x0878
        L_0x08ba:
            r0 = r23
            r0.add(r2)
            goto L_0x0878
        L_0x08c0:
            r0 = 3
            if (r4 != r0) goto L_0x08ca
            if (r8 != 0) goto L_0x08f9
            android.util.Pair r6 = X.C108945cZ.A0N(r1, r3)
            goto L_0x0873
        L_0x08ca:
            r1 = 12
            if (r4 >= r1) goto L_0x0914
            int r0 = r9.A01(r4, r8)
            int r3 = r0 + -1
            int r6 = r9.A02(r4, r8)
            if (r3 < r0) goto L_0x08ff
            r6 = 0
        L_0x08db:
            X.0vp r1 = r9.A01
            boolean r3 = X.C72473Md.A1Z(r1)
            boolean r1 = r9.A00
            if (r1 == 0) goto L_0x08f0
            r1 = 6
            if (r4 == r1) goto L_0x08ec
            r1 = 8
            if (r4 != r1) goto L_0x08f0
        L_0x08ec:
            if (r3 == 0) goto L_0x08f0
            int r6 = r6 + -1
        L_0x08f0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            int r0 = r0 - r2
        L_0x08f5:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x08f9:
            android.util.Pair r6 = X.C108945cZ.A0N(r3, r1)
            goto L_0x0873
        L_0x08ff:
            r1 = 3
            if (r4 > r1) goto L_0x0904
            r6 = 1
            goto L_0x08db
        L_0x0904:
            int r5 = r6 + -1
            int r1 = r5 * r0
            int r1 = r4 - r1
            if (r1 > r3) goto L_0x090d
            r6 = r5
        L_0x090d:
            int r1 = r0 - r2
            if (r3 != r1) goto L_0x08db
            int r6 = r6 + -1
            goto L_0x08db
        L_0x0914:
            if (r8 == 0) goto L_0x091b
            java.lang.Integer r3 = java.lang.Integer.valueOf(r26)
            goto L_0x08f5
        L_0x091b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r26)
            goto L_0x08f9
        L_0x0924:
            int r14 = r25 + -1
        L_0x0926:
            if (r14 < 0) goto L_0x099b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            boolean r0 = r7.containsKey(r0)
            if (r0 != 0) goto L_0x093d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            r7.put(r1, r0)
        L_0x093d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.Object r3 = r7.get(r0)
            java.util.List r3 = (java.util.List) r3
            r0 = r26
            X.C147027Rn.A01(r0, r3)
            int r15 = r20.size()
            int r2 = r9.A02(r15, r8)
            int r1 = r9.A01(r15, r8)
            r22 = 1
            r0 = r22
            if (r15 == r0) goto L_0x0999
            if (r14 >= r1) goto L_0x0999
            r0 = 3
            if (r15 > r0) goto L_0x0989
            r2 = 1
        L_0x0964:
            int r0 = r3.size()
            if (r2 > r0) goto L_0x0985
            int r0 = r3.size()
            java.util.List r1 = r3.subList(r2, r0)
            r0 = r23
            r0.addAll(r10, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.util.List r0 = r3.subList(r10, r2)
            r7.put(r1, r0)
        L_0x0982:
            int r14 = r14 + -1
            goto L_0x0926
        L_0x0985:
            X.C108955ca.A1V(r3, r7, r14)
            goto L_0x0982
        L_0x0989:
            int r21 = r2 + -1
            int r0 = r21 * r1
            int r15 = r15 - r0
            if (r15 > r14) goto L_0x0992
            r2 = r21
        L_0x0992:
            int r1 = r1 - r22
            if (r14 != r1) goto L_0x0964
            int r2 = r2 + -1
            goto L_0x0964
        L_0x0999:
            r2 = 0
            goto L_0x0964
        L_0x099b:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r3 = 0
        L_0x09a0:
            r0 = r24
            if (r3 >= r0) goto L_0x0a11
            r8 = 0
        L_0x09a5:
            r0 = r25
            if (r8 >= r0) goto L_0x0a0e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r7.get(r0)
            java.util.List r9 = (java.util.List) r9
            if (r5 == 0) goto L_0x09db
            int r0 = X.C108965cb.A01(r6)
            if (r3 != r0) goto L_0x09db
            int r0 = X.C108965cb.A00(r6)
            if (r8 != r0) goto L_0x09db
            r0 = r5
        L_0x09c2:
            X.71r r1 = new X.71r
            r1.<init>(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            android.util.Pair r0 = X.C17890vO.A0E(r0, r8)
            r1.A09 = r0
            X.70A r0 = r1.A01()
            r2.add(r0)
        L_0x09d8:
            int r8 = r8 + 1
            goto L_0x09a5
        L_0x09db:
            int r0 = X.C108965cb.A00(r6)
            if (r8 != r0) goto L_0x09e9
            int r0 = X.C108965cb.A01(r6)
            int r1 = r3 + -1
            if (r3 > r0) goto L_0x09ea
        L_0x09e9:
            r1 = r3
        L_0x09ea:
            if (r9 == 0) goto L_0x0a01
            int r0 = r9.size()
            if (r1 >= r0) goto L_0x0a01
            java.lang.Object r0 = r9.get(r1)
            if (r0 == 0) goto L_0x0a01
            java.lang.Object r0 = r9.get(r1)
        L_0x09fc:
            X.70A r0 = (X.AnonymousClass70A) r0
            if (r0 == 0) goto L_0x09d8
            goto L_0x09c2
        L_0x0a01:
            boolean r0 = r23.isEmpty()
            if (r0 != 0) goto L_0x09d8
            r0 = r23
            java.lang.Object r0 = r0.remove(r10)
            goto L_0x09fc
        L_0x0a0e:
            int r3 = r3 + 1
            goto L_0x09a0
        L_0x0a11:
            if (r5 == 0) goto L_0x0a25
            int r0 = X.C108965cb.A01(r6)
            if (r0 != r4) goto L_0x0a25
            int r0 = X.C108965cb.A00(r6)
            if (r0 != r4) goto L_0x0a25
            r2.add(r5)
            goto L_0x0a25
        L_0x0a23:
            r2 = r20
        L_0x0a25:
            r20 = r2
        L_0x0a27:
            if (r11 == 0) goto L_0x0a51
            int r0 = r27.size()
            r1 = 1
            if (r0 != r1) goto L_0x0a31
        L_0x0a30:
            r10 = 1
        L_0x0a31:
            r27.clear()
            X.1vp r0 = r12.A0w
            X.AnonymousClass3MY.A1L(r0, r1)
        L_0x0a39:
            java.util.Iterator r3 = r20.iterator()
        L_0x0a3d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0a59
            java.lang.Object r2 = r3.next()
            X.70A r2 = (X.AnonymousClass70A) r2
            com.whatsapp.jid.UserJid r1 = r2.A0h
            r0 = r27
            r0.put(r1, r2)
            goto L_0x0a3d
        L_0x0a51:
            r1 = 1
            int r0 = r27.size()
            if (r0 != 0) goto L_0x0a31
            goto L_0x0a30
        L_0x0a59:
            r1 = 12
            if (r11 == 0) goto L_0x0a5f
            r1 = 9
        L_0x0a5f:
            boolean r0 = r19.isEmpty()
            if (r0 != 0) goto L_0x0a74
            if (r10 != 0) goto L_0x0a74
            int r0 = r27.size()
            if (r0 <= r1) goto L_0x0a74
            X.1wy r1 = r12.A10
            r0 = r19
            r1.A0F(r0)
        L_0x0a74:
            A0F(r12)
            boolean r0 = r12.A0D
            if (r0 == 0) goto L_0x0b31
            X.11S r2 = r12.A0V
            com.whatsapp.jid.UserJid r0 = r12.A06
            boolean r3 = r2.A0O(r0)
            int r1 = r27.size()
            r0 = 8
            if (r1 > r0) goto L_0x0a9f
            boolean r0 = r12.A0F
            if (r0 == 0) goto L_0x0b2e
            com.whatsapp.jid.UserJid r0 = r12.A06
            boolean r0 = r2.A0O(r0)
            if (r0 != 0) goto L_0x0b2e
            int r1 = r27.size()
            r0 = r26
            if (r1 <= r0) goto L_0x0b2e
        L_0x0a9f:
            r4 = 1
        L_0x0aa0:
            if (r3 != 0) goto L_0x0aa4
            if (r4 == 0) goto L_0x0b31
        L_0x0aa4:
            int r3 = r12.A00
            int r1 = r27.size()
            com.whatsapp.jid.UserJid r0 = r12.A06
            boolean r0 = r2.A0O(r0)
            X.6sV r2 = new X.6sV
            r2.<init>(r3, r1, r0, r4)
        L_0x0ab5:
            X.1DT r1 = r12.A0T
            java.lang.Object r0 = r1.A06()
            boolean r0 = X.C42171xk.A00(r0, r2)
            if (r0 != 0) goto L_0x0ac4
            r1.A0F(r2)
        L_0x0ac4:
            boolean r0 = r13.A0L
            r12.A0C = r0
            X.1EC r4 = r13.A08
            X.1E7 r1 = r12.A05
            if (r1 != 0) goto L_0x0b27
            r0 = 0
        L_0x0acf:
            boolean r0 = X.C42171xk.A00(r0, r4)
            if (r0 != 0) goto L_0x0ae3
            X.1M9 r3 = r12.A0c
            X.1Mc r2 = r12.A0i
            X.126 r1 = r12.A0h
            r0 = r16
            X.1E7 r0 = X.C63982u1.A01(r3, r1, r4, r2, r0)
            r12.A05 = r0
        L_0x0ae3:
            boolean r0 = X.C72463Mc.A1Z(r38)
            if (r0 == 0) goto L_0x0afe
            X.10I r2 = r12.A13
            r8 = 43
            X.Aix r1 = new X.Aix
            r3 = r1
            r4 = r12
            r5 = r17
            r6 = r13
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.String r0 = "CallGridViewModel/showMuteBannerIfNeeded"
            r2.CGS(r1, r0)
        L_0x0afe:
            int r1 = r17.size()
            r0 = r26
            if (r1 != r0) goto L_0x0b1d
            if (r11 == 0) goto L_0x0b1d
            X.11S r1 = r12.A0V
            r0 = r37
            com.whatsapp.jid.UserJid r0 = X.C40811vJ.A01(r1, r0)
            if (r0 == 0) goto L_0x0b1d
            r0 = r37
            com.whatsapp.jid.UserJid r1 = X.C40811vJ.A01(r1, r0)
            com.whatsapp.jid.UserJid r0 = r12.A07
            r1.equals(r0)
        L_0x0b1d:
            X.1DT r0 = r12.A0R
            java.util.List r0 = X.AnonymousClass3MW.A10(r0)
            r0.size()
            return
        L_0x0b27:
            java.lang.Class<X.1EC> r0 = X.AnonymousClass1EC.class
            com.whatsapp.jid.Jid r0 = r1.A06(r0)
            goto L_0x0acf
        L_0x0b2e:
            r4 = 0
            goto L_0x0aa0
        L_0x0b31:
            r2 = 0
            goto L_0x0ab5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel.A0C(X.4Sa, com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel, boolean):void");
    }
}
