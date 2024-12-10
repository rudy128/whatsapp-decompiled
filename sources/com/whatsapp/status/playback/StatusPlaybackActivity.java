package com.whatsapp.status.playback;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass112;
import X.AnonymousClass190;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1LU;
import X.AnonymousClass1Nb;
import X.AnonymousClass1b8;
import X.AnonymousClass205;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass6Ga;
import X.AnonymousClass6Gp;
import X.AnonymousClass6gC;
import X.AnonymousClass70K;
import X.AnonymousClass70O;
import X.AnonymousClass70R;
import X.AnonymousClass71S;
import X.AnonymousClass74O;
import X.AnonymousClass7MC;
import X.AnonymousClass7R1;
import X.AnonymousClass7RH;
import X.AnonymousClass881;
import X.AnonymousClass89M;
import X.C108955ca;
import X.C108965cb;
import X.C108995ce;
import X.C110685gs;
import X.C111235jF;
import X.C114865s7;
import X.C116335x5;
import X.C122076Mr;
import X.C131106kW;
import X.C133576p0;
import X.C1409373q;
import X.C1422678u;
import X.C142757Ar;
import X.C147027Rn;
import X.C153707px;
import X.C17880vN;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C18180vt;
import X.C18460wS;
import X.C19620yd;
import X.C200710s;
import X.C219217x;
import X.C222219b;
import X.C23661Hd;
import X.C23671He;
import X.C24261Jm;
import X.C24661Le;
import X.C26204Cub;
import X.C26312CxV;
import X.C27066DRp;
import X.C28620EAs;
import X.C28901bF;
import X.C28931bI;
import X.C29351c6;
import X.C30361do;
import X.C32741hg;
import X.C39151sZ;
import X.C39351sv;
import X.C43531zx;
import X.C70813Cp;
import X.C72453Mb;
import X.C72483Me;
import X.C84484Jr;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.status.playback.fragment.StatusPlaybackFragment;
import com.whatsapp.ui.media.MediaCaptionTextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class StatusPlaybackActivity extends C114865s7 implements AnonymousClass89M {
    public static final Comparator A0j = new C147027Rn(37);
    public static final Interpolator A0k = new C26312CxV(3);
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public ViewPager A05;
    public C84484Jr A06;
    public C219217x A07;
    public C24661Le A08;
    public AnonymousClass205 A09;
    public AnonymousClass1Nb A0A;
    public C32741hg A0B;
    public C133576p0 A0C;
    public C111235jF A0D;
    public C28931bI A0E;
    public AnonymousClass00H A0F;
    public AnonymousClass00H A0G;
    public AnonymousClass00H A0H;
    public AnonymousClass00H A0I;
    public AnonymousClass00H A0J;
    public AnonymousClass00H A0K;
    public AnonymousClass00H A0L;
    public AnonymousClass00H A0M;
    public AnonymousClass00H A0N;
    public AnonymousClass00H A0O;
    public Runnable A0P;
    public Set A0Q = C17880vN.A14();
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public float A0a = 3.5f;
    public int A0b = 1;
    public long A0c;
    public C110685gs A0d;
    public boolean A0e;
    public boolean A0f;
    public final Rect A0g = AnonymousClass3MW.A07();
    public final Runnable A0h = new AnonymousClass7RH((Object) this, 24);
    public final C18100vl A0i = AnonymousClass1DF.A01(new C153707px(this));

    public static final void A0c(C133576p0 r6, StatusPlaybackActivity statusPlaybackActivity) {
        int i;
        boolean z = false;
        statusPlaybackActivity.A0e = false;
        if (r6 == null || r6.A01.size() == 0) {
            AnonymousClass190 r3 = statusPlaybackActivity.A03;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("StatusItemDataSet isNull: ");
            A10.append(AnonymousClass000.A1X(r6));
            A10.append(", isEmpty: ");
            if (r6 != null && r6.A01.size() == 0) {
                z = true;
            }
            r3.A0G("StatusPlaybackActivity/no statuses loaded", AnonymousClass3MY.A0r(A10, z), true);
            Log.i("No statuses to play");
            statusPlaybackActivity.finish();
            return;
        }
        boolean booleanExtra = statusPlaybackActivity.getIntent().getBooleanExtra("single_contact_update", false);
        statusPlaybackActivity.A4b();
        C18460wS r0 = C18460wS.A00;
        ArrayList A0D2 = C29351c6.A0D(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            it.next();
            A0D2.add(new AnonymousClass7MC());
        }
        statusPlaybackActivity.A4b();
        if (!booleanExtra) {
            Iterator it2 = A0D2.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw AnonymousClass000.A0s("getInsertGap");
            }
        }
        statusPlaybackActivity.A0C = r6;
        C219217x r02 = statusPlaybackActivity.A07;
        if (r02 != null) {
            if (r02.A0D()) {
                C219217x r1 = statusPlaybackActivity.A07;
                if (r1 != null) {
                    if (AnonymousClass112.A07() || r1.A0G()) {
                        z = true;
                    }
                }
            }
            statusPlaybackActivity.A0R = z;
            if (!z) {
                if (!AnonymousClass112.A07()) {
                    i = 2131894482;
                } else {
                    i = 2131894485;
                    if (!AnonymousClass112.A09()) {
                        i = 2131894484;
                    }
                }
                if (!statusPlaybackActivity.isFinishing()) {
                    statusPlaybackActivity.startActivityForResult(AnonymousClass74O.A03(statusPlaybackActivity, 2131894483, i, true), 151);
                }
            }
            ViewPager viewPager = statusPlaybackActivity.A05;
            if (viewPager != null) {
                viewPager.setAdapter(new C116335x5(AnonymousClass3MX.A0O(statusPlaybackActivity), statusPlaybackActivity));
            }
            ViewPager viewPager2 = statusPlaybackActivity.A05;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(statusPlaybackActivity.A4b().A00);
            }
            statusPlaybackActivity.A00 = statusPlaybackActivity.A4b().A00;
            ViewPager viewPager3 = statusPlaybackActivity.A05;
            if (viewPager3 != null) {
                viewPager3.A0K(new C142757Ar(statusPlaybackActivity));
            }
            ViewPager viewPager4 = statusPlaybackActivity.A05;
            if (viewPager4 != null) {
                C1422678u.A00(viewPager4, statusPlaybackActivity, 22);
            }
            ViewPager viewPager5 = statusPlaybackActivity.A05;
            if (viewPager5 != null) {
                viewPager5.setKeepScreenOn(true);
            }
            statusPlaybackActivity.A39(statusPlaybackActivity.A00, statusPlaybackActivity.A05);
            statusPlaybackActivity.A0e = true;
            return;
        }
        C18070vi.A11("waPermissionsHelper");
        throw null;
    }

    public int A31() {
        return 78318969;
    }

    public boolean A4X() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean BwG(java.lang.String r6, int r7, int r8, boolean r9) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            X.6p0 r0 = r5.A0C
            r1 = 0
            if (r0 == 0) goto L_0x0041
            int r3 = r0.A00(r6)
            r4 = 1080033280(0x40600000, float:3.5)
            r2 = 1
            if (r9 == 0) goto L_0x0049
            r5.A02 = r7
            r5.A01 = r8
            java.util.List r0 = r0.A01
            int r0 = X.AnonymousClass3MX.A02(r0, r2)
            if (r3 >= r0) goto L_0x0042
            X.5jF r0 = r5.A4b()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0042
            X.5gs r1 = r5.A0d
            if (r1 == 0) goto L_0x002e
            float r0 = r5.A0a
            r1.A00 = r0
        L_0x002e:
            r5.A0a = r4
            androidx.viewpager.widget.ViewPager r0 = r5.A05
            if (r0 == 0) goto L_0x0039
            int r3 = r3 + 1
        L_0x0036:
            r0.A0J(r3, r2)
        L_0x0039:
            X.5gs r1 = r5.A0d
            if (r1 == 0) goto L_0x0040
            r0 = 0
            r1.A00 = r0
        L_0x0040:
            r1 = 1
        L_0x0041:
            return r1
        L_0x0042:
            A0q(r5)
            r5.finish()
            goto L_0x0040
        L_0x0049:
            if (r3 <= 0) goto L_0x0041
            X.5jF r0 = r5.A4b()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0041
            X.5gs r1 = r5.A0d
            if (r1 == 0) goto L_0x005b
            float r0 = r5.A0a
            r1.A00 = r0
        L_0x005b:
            r5.A0a = r4
            r5.A02 = r7
            r5.A01 = r8
            androidx.viewpager.widget.ViewPager r0 = r5.A05
            if (r0 == 0) goto L_0x0039
            int r3 = r3 - r2
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusPlaybackActivity.BwG(java.lang.String, int, int, boolean):boolean");
    }

    public void BwK(String str) {
        AnonymousClass881 r1;
        StatusPlaybackFragment A032;
        C18070vi.A0d(str, 0);
        AnonymousClass00H r0 = this.A0J;
        if (r0 != null) {
            if (!C18020vd.A05(C18040vf.A02, C108955ca.A0R(r0), 9154) || this.A0e) {
                ViewPager viewPager = this.A05;
                if (viewPager != null) {
                    int currentItem = viewPager.getCurrentItem();
                    C133576p0 r02 = this.A0C;
                    if (r02 != null && (r1 = (AnonymousClass881) r02.A01.get(currentItem)) != null && C18070vi.A18(r1.BhH(), str) && (A032 = A03(this, r1.BhH())) != null) {
                        A032.A28();
                        A032.A2A(this.A0b);
                        return;
                    }
                    return;
                }
                return;
            }
            this.A0Q.add(str);
            return;
        }
        C18070vi.A11("statusConfig");
        throw null;
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C18070vi.A0d(keyEvent, 0);
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() != 0 || (keyCode != 24 && keyCode != 25)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        AnonymousClass00H r0 = this.A0K;
        if (r0 != null) {
            C1409373q r6 = (C1409373q) r0.get();
            boolean A1T = AnonymousClass000.A1T(keyCode, 24);
            if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r6.A08), 12053)) {
                ((C200710s) r6.A09.get()).execute(new C70813Cp(39, (Object) r6, A1T));
            } else {
                C1409373q.A03(r6, A1T);
            }
            AnonymousClass00H r02 = this.A0K;
            if (r02 != null) {
                if (((C1409373q) r02.get()).A04) {
                    AnonymousClass00H r03 = this.A0K;
                    if (r03 != null) {
                        C1409373q r04 = (C1409373q) r03.get();
                        r04.A04 = false;
                        C1409373q.A04(r04, false);
                    }
                }
                return true;
            }
        }
        C18070vi.A11("statusPlaybackAudioManager");
        throw null;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f;
        C18070vi.A0d(motionEvent, 0);
        C110685gs r2 = this.A0d;
        if (r2 != null) {
            if (!r2.isFinished() && r2.timePassed() < r2.getDuration() / 2) {
                return false;
            }
            if (motionEvent.getActionMasked() == 0) {
                long eventTime = motionEvent.getEventTime() - this.A0c;
                if (eventTime != 0) {
                    float f2 = (float) eventTime;
                    if (f2 <= 1000.0f) {
                        f = 1.0f + ((f2 * 2.5f) / 1000.0f);
                        this.A0a = f;
                        this.A0c = motionEvent.getEventTime();
                    }
                }
                f = 3.5f;
                this.A0a = f;
                this.A0c = motionEvent.getEventTime();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        if (this.A0T) {
            A0Q();
        } else if (this.A0U) {
            A0d(this);
        }
    }

    private final void A0Q() {
        Drawable A002;
        ViewGroup viewGroup = this.A04;
        if (viewGroup != null) {
            viewGroup.setClipToOutline(true);
            C23671He r3 = C23661Hd.A03;
            String str = null;
            if (r3.A01(this)) {
                A002 = null;
            } else {
                A002 = C24261Jm.A00(viewGroup.getContext(), 2131233037);
            }
            viewGroup.setBackground(A002);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams != null) {
                C39151sZ r1 = (C39151sZ) layoutParams;
                if (!r3.A01(this)) {
                    str = "9:16";
                }
                r1.A0t = str;
                if (this.A0S) {
                    r1.A08 = 0.0f;
                }
                viewGroup.setLayoutParams(r1);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public static final void A0V(Rect rect, StatusPlaybackActivity statusPlaybackActivity) {
        int i;
        int i2;
        View view = statusPlaybackActivity.A03;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                i = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
            } else {
                i = 0;
            }
            int i3 = rect.top;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                i2 = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginEnd();
            } else {
                i2 = 0;
            }
            C43531zx.A03(view, new C39351sv(i, i3, i2, C108995ce.A02(view)));
        }
    }

    public static final void A0q(StatusPlaybackActivity statusPlaybackActivity) {
        if (statusPlaybackActivity.A0f) {
            AnonymousClass00H r0 = statusPlaybackActivity.A0N;
            if (r0 != null) {
                r0.get();
                Intent A022 = AnonymousClass1LU.A02(statusPlaybackActivity);
                A022.setAction(C28901bF.A03);
                A022.setFlags(335544320);
                statusPlaybackActivity.A01.A0A(statusPlaybackActivity, A022);
                return;
            }
            AnonymousClass3MW.A1F();
            throw null;
        }
    }

    public static final void A0r(StatusPlaybackActivity statusPlaybackActivity, String str, int i, int i2) {
        int A002;
        AnonymousClass1b8 adapter;
        C133576p0 r0 = statusPlaybackActivity.A0C;
        if (r0 != null && (A002 = r0.A00(str)) >= 0) {
            List list = r0.A01;
            if (A002 < list.size()) {
                ViewPager viewPager = statusPlaybackActivity.A05;
                if (viewPager == null || A002 != viewPager.getCurrentItem()) {
                    list.remove(A002);
                    int i3 = statusPlaybackActivity.A00;
                    if (A002 <= i3) {
                        statusPlaybackActivity.A00 = i3 - 1;
                    }
                    ViewPager viewPager2 = statusPlaybackActivity.A05;
                    if (viewPager2 != null && (adapter = viewPager2.getAdapter()) != null) {
                        adapter.A04();
                    }
                } else if (statusPlaybackActivity.A4b().A01 || A002 == list.size() - 1) {
                    statusPlaybackActivity.finish();
                } else {
                    statusPlaybackActivity.A0P = new AnonymousClass7R1(statusPlaybackActivity, str, i, i2);
                    statusPlaybackActivity.BwG(str, i, i2, true);
                }
            }
        }
    }

    public final C111235jF A4b() {
        C111235jF r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public final StatusPlaybackFragment A4c(int i) {
        AnonymousClass881 r0;
        C133576p0 r2 = this.A0C;
        if (r2 == null || i < 0 || i >= r2.A01.size() || (r0 = (AnonymousClass881) r2.A01.get(i)) == null) {
            return null;
        }
        return A03(this, r0.BhH());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        AnonymousClass1b8 r0;
        boolean z = true;
        if (i == 10) {
            if (i2 != -1) {
                z = false;
            }
            this.A0W = z;
        } else if (i != 151) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0R = true;
            ViewPager viewPager = this.A05;
            if (viewPager != null) {
                r0 = viewPager.getAdapter();
            } else {
                r0 = null;
            }
            C17960vV.A07(r0);
            r0.A04();
            ViewPager viewPager2 = this.A05;
            if (viewPager2 != null) {
                viewPager2.setCurrentItem(A4b().A00);
            }
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        int i;
        AnonymousClass70K A012;
        ViewPager viewPager = this.A05;
        if (viewPager != null) {
            i = viewPager.getCurrentItem();
        } else {
            i = -1;
        }
        StatusPlaybackFragment A4c = A4c(i);
        if (!(A4c == null || (A012 = StatusPlaybackContactFragment.A01((StatusPlaybackContactFragment) A4c)) == null)) {
            AnonymousClass6Gp r4 = (AnonymousClass6Gp) A012;
            BottomSheetBehavior bottomSheetBehavior = r4.A01;
            if (bottomSheetBehavior.A0J == 3) {
                bottomSheetBehavior.A0W(4);
                return;
            }
            AnonymousClass70R A0L2 = r4.A0L();
            MediaCaptionTextView A062 = A0L2.A06();
            if (A062 == null || !A062.A0T()) {
                AnonymousClass70O A0K2 = r4.A0K();
                if (A0K2 instanceof AnonymousClass6Ga) {
                    ((AnonymousClass6Ga) A0K2).A08 = true;
                }
            } else {
                int i2 = 0;
                MediaCaptionTextView A063 = A0L2.A06();
                if (A063 != null) {
                    A063.setExpanded(false);
                }
                View view = A0L2.A01;
                if (view != null) {
                    if (!A0L2.A09()) {
                        i2 = 8;
                    }
                    view.setVisibility(i2);
                }
                r4.A0N();
                return;
            }
        }
        this.A02 = 3;
        super.onBackPressed();
        A0q(this);
    }

    public static final StatusPlaybackFragment A03(StatusPlaybackActivity statusPlaybackActivity, String str) {
        Object obj;
        Iterator A0u = C108965cb.A0u(statusPlaybackActivity);
        while (true) {
            if (!A0u.hasNext()) {
                obj = null;
                break;
            }
            obj = A0u.next();
            Fragment fragment = (Fragment) obj;
            if ((fragment instanceof StatusPlaybackFragment) && C18070vi.A18(str, ((StatusPlaybackFragment) fragment).A26())) {
                break;
            }
        }
        return (StatusPlaybackFragment) obj;
    }

    public static final void A0d(StatusPlaybackActivity statusPlaybackActivity) {
        boolean A1a;
        Drawable A002;
        View A0I2 = AnonymousClass3MY.A0I(AnonymousClass3Ma.A0x(statusPlaybackActivity, 2131436757), 0);
        C18070vi.A0V(A0I2);
        View A0D2 = AnonymousClass3MX.A0D(C72453Mb.A0s(A0I2, 2131427795));
        C23671He r7 = C23661Hd.A03;
        if (r7.A01(statusPlaybackActivity)) {
            A1a = true;
        } else {
            A1a = C72453Mb.A1a(statusPlaybackActivity.A0i);
        }
        String str = "9:16";
        if (A1a) {
            A0D2.setVisibility(8);
            ViewGroup viewGroup = statusPlaybackActivity.A04;
            if (viewGroup != null) {
                if (r7.A01(statusPlaybackActivity)) {
                    A002 = null;
                } else {
                    A002 = C24261Jm.A00(viewGroup.getContext(), 2131233037);
                }
                viewGroup.setBackground(A002);
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams != null) {
                    C39151sZ r1 = (C39151sZ) layoutParams;
                    r1.A0B = 0;
                    r1.A0C = -1;
                    if (r7.A01(statusPlaybackActivity)) {
                        str = null;
                    }
                    r1.A0t = str;
                    viewGroup.setLayoutParams(r1);
                    return;
                }
                throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            return;
        }
        A0D2.setVisibility(0);
        ViewGroup viewGroup2 = statusPlaybackActivity.A04;
        if (viewGroup2 != null) {
            AnonymousClass3MY.A0v(viewGroup2.getContext(), viewGroup2, 2131233037);
            ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
            if (layoutParams2 != null) {
                C39151sZ r12 = (C39151sZ) layoutParams2;
                r12.A0B = -1;
                r12.A0C = A0D2.getId();
                r12.A0t = str;
                viewGroup2.setLayoutParams(r12);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public C18180vt BYS() {
        return C19620yd.A01;
    }

    /* JADX WARNING: type inference failed for: r0v48, types: [android.widget.Scroller, X.5gs] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Boolean] */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0352, code lost:
        if (r9 != null) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0375, code lost:
        if (r9 != null) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0377, code lost:
        r5 = java.lang.Boolean.valueOf(r9.A0D());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x037f, code lost:
        r8.append(r5);
        r8.append(')');
        X.C17890vO.A0w(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x03a6, code lost:
        if (r9.A0D() == false) goto L_0x02d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r4.A01() == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (X.C18020vd.A05(r2, r13.A0E, 10919) == false) goto L_0x0096;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onCreate(r14)
            X.00H r0 = r13.A0J
            if (r0 == 0) goto L_0x0436
            X.0ve r1 = X.C108955ca.A0R(r0)
            X.0vf r2 = X.C18040vf.A01
            r0 = 9228(0x240c, float:1.2931E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            r13.A0U = r0
            X.00H r0 = r13.A0J
            if (r0 == 0) goto L_0x0436
            X.1Lc r0 = X.C108945cZ.A0v(r0)
            boolean r0 = r0.A01()
            r13.A0T = r0
            android.view.WindowManager r7 = r13.getWindowManager()
            X.C18070vi.A0X(r7)
            X.1He r5 = X.C23661Hd.A03
            boolean r0 = r5.A01(r13)
            r3 = 1
            r6 = r0 ^ 1
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 == 0) goto L_0x0170
            int r4 = X.C60572oF.A00(r7)
        L_0x003d:
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 == 0) goto L_0x0160
            int r0 = X.C60572oF.A01(r7)
        L_0x0047:
            if (r6 == 0) goto L_0x015c
            float r1 = (float) r0
            float r0 = (float) r4
        L_0x004b:
            float r1 = r1 / r0
            r0 = 1058013184(0x3f100000, float:0.5625)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r0 = X.C108975cc.A19(r0)
            r13.A0V = r0
            X.00H r0 = r13.A0J
            if (r0 == 0) goto L_0x0436
            X.1Lc r4 = X.C108945cZ.A0v(r0)
            X.0ve r1 = r4.A01
            r0 = 11188(0x2bb4, float:1.5678E-41)
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x006f
            boolean r1 = r4.A01()
            r0 = 1
            if (r1 != 0) goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            r13.A0S = r0
            boolean r0 = r13.A0U
            if (r0 == 0) goto L_0x0121
            r4 = 2131627046(0x7f0e0c26, float:1.8881345E38)
            boolean r0 = r5.A01(r13)
            if (r0 != 0) goto L_0x0087
            X.0vl r0 = r13.A0i
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0096
        L_0x0087:
            boolean r0 = r13.A0V
            if (r0 != 0) goto L_0x0096
            X.0ve r1 = r13.A0E
            r0 = 10919(0x2aa7, float:1.5301E-41)
            boolean r1 = X.C18020vd.A05(r2, r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0097
        L_0x0096:
            r0 = 0
        L_0x0097:
            r13.A0Z = r0
            android.view.Window r2 = r13.getWindow()
            if (r0 == 0) goto L_0x0113
            r0 = 1024(0x400, float:1.435E-42)
            r2.setFlags(r0, r0)
            android.view.Window r1 = r13.getWindow()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            android.view.Window r0 = r13.getWindow()
            X.AnonymousClass1L9.A04(r0)
        L_0x00b4:
            r13.setContentView((int) r4)
        L_0x00b7:
            r0 = 2131434744(0x7f0b1cf8, float:1.849131E38)
            android.view.View r2 = r13.findViewById(r0)
            r1 = 2
            X.79z r0 = new X.79z
            r0.<init>(r13, r1)
            X.AnonymousClass1HF.A0g(r2, r0)
            X.4Jr r7 = r13.A06
            if (r7 == 0) goto L_0x0433
            X.1Le r8 = r13.A08
            if (r8 == 0) goto L_0x0430
            X.00H r0 = r13.A0G
            if (r0 == 0) goto L_0x042d
            java.lang.Object r5 = X.C18070vi.A0E(r0)
            X.1Nb r6 = r13.A0A
            if (r6 == 0) goto L_0x042a
            X.C18070vi.A0d(r5, r1)
            r9 = 3
            X.4g8 r4 = new X.4g8
            r4.<init>(r5, r6, r7, r8, r9)
            X.1It r1 = new X.1It
            r1.<init>(r4, r13)
            java.lang.Class<X.5jF> r0 = X.C111235jF.class
            X.1J2 r1 = r1.A00(r0)
            X.5jF r1 = (X.C111235jF) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r13.A0D = r1
            X.1Fv r0 = r13.getLifecycle()
            r0.A05(r1)
            r0 = 2131433401(0x7f0b17b9, float:1.8488587E38)
            android.view.View r0 = r13.findViewById(r0)
            androidx.viewpager.widget.ViewPager r0 = (androidx.viewpager.widget.ViewPager) r0
            r13.A05 = r0
            android.view.animation.Interpolator r1 = A0k
            X.5gs r0 = new X.5gs
            r0.<init>(r13, r1)
            r13.A0d = r0
            goto L_0x0180
        L_0x0113:
            r1 = 2130968798(0x7f0400de, float:1.754626E38)
            r0 = 2131099872(0x7f0600e0, float:1.781211E38)
            int r0 = X.AnonymousClass3Ma.A00(r13, r1, r0)
            r2.setNavigationBarColor(r0)
            goto L_0x00b4
        L_0x0121:
            android.view.Window r1 = r13.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r1.setFlags(r0, r0)
            android.view.Window r1 = r13.getWindow()
            r0 = 134217728(0x8000000, float:3.85186E-34)
            r1.addFlags(r0)
            android.view.Window r0 = r13.getWindow()
            X.AnonymousClass1L9.A04(r0)
            boolean r0 = r13.A0T
            if (r0 == 0) goto L_0x0154
            r0 = 2131627023(0x7f0e0c0f, float:1.8881299E38)
            r13.setContentView((int) r0)
            r0 = 2131436759(0x7f0b24d7, float:1.8495397E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r13.A04 = r0
            r13.A0Q()
            goto L_0x00b7
        L_0x0154:
            r0 = 2131627021(0x7f0e0c0d, float:1.8881295E38)
            r13.setContentView((int) r0)
            goto L_0x00b7
        L_0x015c:
            float r1 = (float) r4
            float r0 = (float) r0
            goto L_0x004b
        L_0x0160:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r7.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            goto L_0x0047
        L_0x0170:
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r7.getDefaultDisplay()
            r0.getRealMetrics(r1)
            int r4 = r1.heightPixels
            goto L_0x003d
        L_0x0180:
            java.lang.Class<androidx.viewpager.widget.ViewPager> r1 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r0 = "mScroller"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0192 }
            r2.setAccessible(r3)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0192 }
            androidx.viewpager.widget.ViewPager r1 = r13.A05     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0192 }
            X.5gs r0 = r13.A0d     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0192 }
            r2.set(r1, r0)     // Catch:{ IllegalAccessException | IllegalArgumentException | NoSuchFieldException -> 0x0192 }
        L_0x0192:
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "playback_entry_method"
            int r1 = r1.getIntExtra(r0, r3)
            r13.A0b = r1
            r0 = 8
            if (r1 == r0) goto L_0x01a3
            r3 = 0
        L_0x01a3:
            r13.A0f = r3
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "single_contact_update"
            r6 = 0
            boolean r11 = r1.getBooleanExtra(r0, r6)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "should_chain_viewed_statuses"
            boolean r12 = r1.getBooleanExtra(r0, r6)
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r4 = "jid"
            java.lang.String r0 = r0.getStringExtra(r4)
            com.whatsapp.jid.UserJid r7 = X.C22971Dz.A05(r0)
            X.00H r0 = r13.A0J
            if (r0 == 0) goto L_0x0436
            X.0ve r2 = X.C108955ca.A0R(r0)
            r1 = 9154(0x23c2, float:1.2827E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0279
            X.1KB r3 = r13.A05
            java.lang.Runnable r2 = r13.A0h
            r0 = 500(0x1f4, double:2.47E-321)
            r3.A0K(r2, r0)
            X.5jF r0 = r13.A4b()
            X.1DS r2 = r0.A04
            X.81G r1 = new X.81G
            r1.<init>(r13)
            r0 = 18
            X.AnonymousClass7AS.A00(r13, r2, r1, r0)
            android.content.Intent r0 = r13.getIntent()
            X.205 r8 = X.AnonymousClass4aU.A02(r0)
            r13.A09 = r8
            X.5jF r9 = r13.A4b()
            X.1OX r1 = X.C41561wd.A00(r9)
            X.0wl r0 = r9.A0C
            r10 = 0
            com.whatsapp.status.playback.StatusPlaybackViewModel$loadStatuses$1 r6 = new com.whatsapp.status.playback.StatusPlaybackViewModel$loadStatuses$1
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.AnonymousClass3MW.A1X(r0, r6, r1)
        L_0x0210:
            X.00H r0 = r13.A0O
            if (r0 == 0) goto L_0x0439
            java.lang.Object r1 = r0.get()
            X.2dM r1 = (X.C53952dM) r1
            X.00H r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.11P r0 = (X.AnonymousClass11P) r0
            long r2 = r0.A05()
            android.content.SharedPreferences r0 = r1.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "statusLastOpenedDate"
            X.C17880vN.A1D(r1, r0, r2)
            android.content.Intent r0 = r13.getIntent()
            X.205 r0 = X.AnonymousClass4aU.A02(r0)
            if (r0 == 0) goto L_0x023f
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L_0x0241
        L_0x023f:
            java.lang.String r3 = ""
        L_0x0241:
            X.00H r0 = r13.A0M
            if (r0 == 0) goto L_0x0418
            java.lang.Object r0 = r0.get()
            X.COe r0 = (X.C24886COe) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r2 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "status_playback_message_id"
            java.lang.String r1 = ""
            java.lang.String r0 = r2.getString(r0, r1)
            if (r0 == 0) goto L_0x025c
            r1 = r0
        L_0x025c:
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0278
            X.00H r0 = r13.A0M
            if (r0 == 0) goto L_0x0418
            java.lang.Object r0 = r0.get()
            X.COe r0 = (X.C24886COe) r0
            r2 = 1
            X.0vl r0 = r0.A01
            android.content.SharedPreferences$Editor r1 = X.C17890vO.A0A(r0)
            java.lang.String r0 = "status_reminder_playback_flag"
            X.C17880vN.A1F(r1, r0, r2)
        L_0x0278:
            return
        L_0x0279:
            X.6p0 r3 = new X.6p0
            r3.<init>()
            java.lang.String r0 = X.C108955ca.A0r(r13, r4)
            com.whatsapp.jid.UserJid r2 = X.C22971Dz.A05(r0)
            r5 = 0
            if (r2 != 0) goto L_0x02a0
            java.lang.String r0 = "Could not retrieve jid from intent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x028e:
            A0c(r5, r13)
            X.00H r0 = r13.A0K
            if (r0 == 0) goto L_0x041b
            java.lang.Object r0 = r0.get()
            X.73q r0 = (X.C1409373q) r0
            r0.A05()
            goto L_0x0210
        L_0x02a0:
            android.content.Intent r0 = r13.getIntent()
            X.205 r8 = X.AnonymousClass4aU.A02(r0)
            r13.A09 = r8
            X.5jF r0 = r13.A4b()
            r4 = 0
            r0.A00 = r6
            X.7vI r0 = new X.7vI
            r0.<init>(r8, r13)
            X.0vm r0 = X.AnonymousClass1DF.A01(r0)
            r6 = 41
            java.lang.String r7 = "), statusInfo is expired ("
            java.lang.String r1 = ", statusInfo is null ("
            if (r8 == 0) goto L_0x0306
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0306
            X.1Le r0 = r13.A08
            if (r0 == 0) goto L_0x041e
            X.2sx r9 = r0.A08(r2)
            if (r9 == 0) goto L_0x0357
            boolean r0 = r9.A0D()
            if (r0 != 0) goto L_0x0357
        L_0x02d8:
            X.2sx r1 = r9.A06()
            X.7MD r0 = new X.7MD
            r0.<init>(r1)
            r3.A01(r0)
            X.5jF r1 = r13.A4b()
            int r0 = r9.A01()
            if (r0 <= 0) goto L_0x02ef
            r4 = 1
        L_0x02ef:
            r1.A02 = r4
        L_0x02f1:
            X.5jF r6 = r13.A4b()
            X.1OX r5 = X.C41561wd.A00(r6)
            X.0wl r4 = r6.A0C
            r1 = 0
            com.whatsapp.status.playback.StatusPlaybackViewModel$onStatusClick$1 r0 = new com.whatsapp.status.playback.StatusPlaybackViewModel$onStatusClick$1
            r0.<init>(r2, r6, r1, r11)
            X.AnonymousClass3MW.A1X(r4, r0, r5)
            r5 = r3
            goto L_0x028e
        L_0x0306:
            X.1E5 r0 = X.AnonymousClass1E5.A00
            if (r2 != r0) goto L_0x038c
            X.1Le r0 = r13.A08
            if (r0 == 0) goto L_0x041e
            X.2sx r9 = r0.A07()
            if (r9 == 0) goto L_0x0334
            boolean r0 = r9.A0D()
            if (r0 != 0) goto L_0x0334
            X.2sx r1 = r9.A06()
            X.7MD r0 = new X.7MD
            r0.<init>(r1)
            r3.A01(r0)
            X.5jF r1 = r13.A4b()
            int r0 = r9.A01()
            if (r0 <= 0) goto L_0x0331
            r4 = 1
        L_0x0331:
            r1.A03 = r4
            goto L_0x02f1
        L_0x0334:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "buildStatusPlaySetup with MeJid Intent error: "
            r8.append(r0)
            if (r9 == 0) goto L_0x0355
            java.lang.String r0 = r9.toString()
        L_0x0343:
            r8.append(r0)
            r8.append(r1)
            if (r9 != 0) goto L_0x034c
            r4 = 1
        L_0x034c:
            r8.append(r4)
            r8.append(r7)
            if (r9 == 0) goto L_0x037f
            goto L_0x0377
        L_0x0355:
            r0 = r5
            goto L_0x0343
        L_0x0357:
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            java.lang.String r0 = "buildStatusPlaySetup with messageKey error: "
            r8.append(r0)
            if (r9 == 0) goto L_0x038a
            java.lang.String r0 = r9.toString()
        L_0x0366:
            r8.append(r0)
            r8.append(r1)
            if (r9 != 0) goto L_0x036f
            r4 = 1
        L_0x036f:
            r8.append(r4)
            r8.append(r7)
            if (r9 == 0) goto L_0x037f
        L_0x0377:
            boolean r0 = r9.A0D()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
        L_0x037f:
            r8.append(r5)
            r8.append(r6)
            X.C17890vO.A0w(r8)
            goto L_0x02f1
        L_0x038a:
            r0 = r5
            goto L_0x0366
        L_0x038c:
            X.1Nb r0 = r13.A0A
            if (r0 == 0) goto L_0x0421
            X.1yM r0 = r0.A0a(r2)
            boolean r0 = r0.A0U
            if (r0 == 0) goto L_0x03aa
            X.1Le r0 = r13.A08
            if (r0 == 0) goto L_0x041e
            X.2sx r9 = r0.A08(r2)
            if (r9 == 0) goto L_0x02f1
            boolean r0 = r9.A0D()
            if (r0 != 0) goto L_0x02f1
            goto L_0x02d8
        L_0x03aa:
            X.5jF r1 = r13.A4b()
            X.00H r0 = r13.A0L
            if (r0 == 0) goto L_0x0424
            java.lang.Object r0 = X.C18070vi.A0E(r0)
            X.6ji r0 = (X.C130606ji) r0
            java.util.ArrayList r5 = r1.A0T(r2, r0, r11, r12)
            java.util.Iterator r4 = r5.iterator()
        L_0x03c0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r1 = r4.next()
            X.2sx r1 = (X.C63372sx) r1
            X.7MD r0 = new X.7MD
            r0.<init>(r1)
            r3.A01(r0)
            goto L_0x03c0
        L_0x03d5:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x03fa
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "buildStatusPlaySetup no accessible statuses. jid: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", singleContactUpdate: "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ", shouldUseStatusRanking: "
            r1.append(r0)
            r1.append(r12)
            X.C17890vO.A0w(r1)
        L_0x03fa:
            X.5jF r1 = r13.A4b()
            X.5jF r0 = r13.A4b()
            boolean r0 = r0.A03
            r0 = r0 ^ 1
            r1.A01 = r0
            X.5jF r1 = r13.A4b()
            java.lang.String r0 = r2.getRawString()
            int r0 = r3.A00(r0)
            r1.A00 = r0
            goto L_0x02f1
        L_0x0418:
            java.lang.String r0 = "statusSharedPreferences"
            goto L_0x043b
        L_0x041b:
            java.lang.String r0 = "statusPlaybackAudioManager"
            goto L_0x043b
        L_0x041e:
            java.lang.String r0 = "statusStore"
            goto L_0x0426
        L_0x0421:
            java.lang.String r0 = "chatSettingsStore"
            goto L_0x0426
        L_0x0424:
            java.lang.String r0 = "statusRanking"
        L_0x0426:
            X.C18070vi.A11(r0)
            throw r5
        L_0x042a:
            java.lang.String r0 = "chatSettingsStore"
            goto L_0x043b
        L_0x042d:
            java.lang.String r0 = "fMessageDatabase"
            goto L_0x043b
        L_0x0430:
            java.lang.String r0 = "statusStore"
            goto L_0x043b
        L_0x0433:
            java.lang.String r0 = "viewModelFactory"
            goto L_0x043b
        L_0x0436:
            java.lang.String r0 = "statusConfig"
            goto L_0x043b
        L_0x0439:
            java.lang.String r0 = "wamoPreferences"
        L_0x043b:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.status.playback.StatusPlaybackActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        String str;
        super.onDestroy();
        boolean A1a = AnonymousClass3MY.A1a(getIntent(), "from_playback_activity");
        AnonymousClass00H r0 = this.A0K;
        if (r0 != null) {
            C1409373q r2 = (C1409373q) r0.get();
            Handler handler = r2.A01;
            if (handler != null) {
                handler.removeCallbacks(r2.A0A);
            }
            C1409373q.A02(r2);
            r2.A02 = null;
            C32741hg r02 = this.A0B;
            if (r02 != null) {
                if (A1a) {
                    AnonymousClass71S r1 = r02.A01;
                    if (r1 != null) {
                        r1.A01 = null;
                        r1.A02 = null;
                    }
                } else {
                    r02.A05();
                }
                AnonymousClass00H r03 = this.A0I;
                if (r03 != null) {
                    C131106kW r5 = (C131106kW) r03.get();
                    if (A1a) {
                        C122076Mr r04 = r5.A00;
                        if (r04 != null) {
                            r04.A0F();
                        }
                        r5.A00 = null;
                    } else {
                        C122076Mr r05 = r5.A01;
                        if (r05 != null) {
                            r05.A0F();
                        }
                        r5.A01 = null;
                    }
                    if (C18020vd.A05(C18040vf.A02, r5.A07, 5972)) {
                        HashMap A11 = C17880vN.A11();
                        C26204Cub.A01(r5.A06.A00, (C27066DRp) AnonymousClass3MX.A14(((AnonymousClass6gC) r5.A0B.get()).A01), C28620EAs.A00, A11).A04();
                        Log.i("ReusableVideoPlayer/cleanup/clearAllPlayers");
                    }
                    ViewPager viewPager = this.A05;
                    if (viewPager != null) {
                        viewPager.setAdapter((AnonymousClass1b8) null);
                        return;
                    }
                    return;
                }
                str = "reusableVideoPlayer";
            } else {
                str = "statusesStatsManager";
            }
        } else {
            str = "statusPlaybackAudioManager";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onResume() {
        super.onResume();
        AnonymousClass00H r0 = this.A0H;
        if (r0 != null) {
            C18100vl r02 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 19);
            return;
        }
        C18070vi.A11("navigationTimeSpentManager");
        throw null;
    }
}
