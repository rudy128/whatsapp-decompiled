package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.google.android.material.navigationrail.NavigationRailView;
import com.whatsapp.HomeActivity;
import com.whatsapp.voipcalling.camera.VoipLiteCamera;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Fk  reason: invalid class name and case insensitive filesystem */
public abstract class C23281Fk extends C23261Fi implements C23271Fj {
    public View A00;
    public View A01;
    public ViewGroup A02;
    public C28221Zk A03;
    public C23661Hd A04;
    public AnonymousClass1LE A05;
    public AnonymousClass1LF A06;
    public AnonymousClass1LT A07;
    public AnonymousClass1DC A08;
    public C28931bI A09;
    public C28931bI A0A;
    public AnonymousClass00H A0B;
    public Integer A0C = AnonymousClass00R.A00;
    public boolean A0D;
    public final AnonymousClass1GV A0E = new C64892vV(this, 8);

    public C29201bm A4g() {
        HomeActivity homeActivity = (HomeActivity) this;
        C34011jl A4m = homeActivity.A4m(HomeActivity.A0c(homeActivity.A00));
        if (A4m instanceof C29201bm) {
            return (C29201bm) A4m;
        }
        return null;
    }

    public void A4h() {
        Handler handler;
        HomeActivity homeActivity = (HomeActivity) this;
        synchronized (homeActivity) {
            handler = homeActivity.A06;
            if (handler == null) {
                handler = new Handler(((C25151Nc) homeActivity.A22.get()).A00(), new AnonymousClass75Y(homeActivity, 0));
                homeActivity.A06 = handler;
            }
            C17960vV.A07(handler);
        }
        if (!handler.hasMessages(0)) {
            handler.sendEmptyMessageDelayed(0, 250);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (X.C22891Dp.A07 == false) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r1.length() == 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r1 = r3.getString(2131899103);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r2.A0S(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r0 != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005f, code lost:
        if (r3.A0C == X.AnonymousClass00R.A01) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A4i() {
        /*
            r6 = this;
            r3 = r6
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.01n r2 = r3.getSupportActionBar()
            if (r2 == 0) goto L_0x0054
            r1 = 8
            android.view.ViewGroup r0 = r3.A0D
            if (r0 == 0) goto L_0x0012
            r0.setVisibility(r1)
        L_0x0012:
            com.whatsapp.WaTextView r0 = r3.A0d
            if (r0 == 0) goto L_0x0019
            r0.setVisibility(r1)
        L_0x0019:
            int r5 = r3.A00
            r4 = 200(0xc8, float:2.8E-43)
            boolean r0 = X.C22891Dp.A02
            if (r0 == 0) goto L_0x0026
            boolean r1 = X.C22891Dp.A07
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r5 == r4) goto L_0x0055
            if (r0 == 0) goto L_0x005b
            java.lang.Integer r1 = r3.A0C
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0035
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x0057
        L_0x0035:
            androidx.appcompat.widget.Toolbar r0 = r3.A0G
            com.whatsapp.wds.components.topbar.WDSToolbar r0 = (com.whatsapp.wds.components.topbar.WDSToolbar) r0
            r0.A0Y()
        L_0x003c:
            X.1bB r1 = r3.A0b
            int r0 = r3.A00
            java.lang.String r1 = r1.A0K(r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0051
        L_0x004a:
            r0 = 2131899103(0x7f1232df, float:1.9433143E38)
            java.lang.String r1 = r3.getString(r0)
        L_0x0051:
            r2.A0S(r1)
        L_0x0054:
            return
        L_0x0055:
            if (r0 == 0) goto L_0x005b
        L_0x0057:
            com.whatsapp.HomeActivity.A19(r2, r3)
            return
        L_0x005b:
            java.lang.Integer r1 = r3.A0C
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x004a
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23281Fk.A4i():void");
    }

    public final boolean A4k() {
        int i;
        int i2;
        C23661Hd r0 = this.A04;
        if (r0 == null) {
            C18070vi.A11("deviceUtils");
            throw null;
        } else if (r0.A02(true)) {
            return false;
        } else {
            if (((C24001Il) this.A07.get()).A06() && this.A0D) {
                i = VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT;
                i2 = 600;
            } else if (!((C24001Il) this.A07.get()).A07()) {
                return false;
            } else {
                i = VoipLiteCamera.DEFAULT_SUPERNOVA_HEIGHT;
                i2 = VoipLiteCamera.DEFAULT_SUPERNOVA_WIDTH;
            }
            return AnonymousClass1ZO.A05(this, new C58282kR(i2).A00, i);
        }
    }

    public static final boolean A03(C23281Fk r2) {
        Integer num;
        AnonymousClass1LF r0 = r2.A06;
        if (r0 != null) {
            if (!r0.A08 || !r2.A4k()) {
                num = AnonymousClass00R.A00;
            } else {
                num = AnonymousClass00R.A01;
            }
            if (r2.A0C == num) {
                return false;
            }
            r2.A0C = num;
            return true;
        }
        C18070vi.A11("navBarHelper");
        throw null;
    }

    public final void A4j() {
        View view;
        String str;
        Integer num = this.A0C;
        int intValue = num.intValue();
        if ((intValue == 0 || intValue == 1) && (view = this.A00) != null) {
            view.setVisibility(8);
        }
        C28921bH r5 = new C28921bH(this, num);
        if (num.intValue() == 1) {
            C28931bI r1 = this.A0A;
            if (r1 == null) {
                View view2 = this.A01;
                if (view2 != null) {
                    r1 = new C28931bI(AnonymousClass1HF.A06(view2, 2131432932));
                }
                str = "rootView";
            }
            this.A0A = r1;
            this.A00 = r1.A02();
            View A062 = AnonymousClass1HF.A06(r1.A02(), 2131432919);
            C18070vi.A0X(A062);
            NavigationRailView navigationRailView = (NavigationRailView) A062;
            AnonymousClass1LF r12 = this.A06;
            if (r12 != null) {
                C18070vi.A0d(navigationRailView, 0);
                r12.A01 = navigationRailView;
                ViewGroup viewGroup = this.A02;
                if (viewGroup == null) {
                    str = "mainContainer";
                } else {
                    View view3 = this.A00;
                    AnonymousClass1LI r13 = r12.A04;
                    C18070vi.A0d(r13, 2);
                    if (view3 != null) {
                        r13.A0G(view3);
                        r13.A0E(view3);
                        C29191bl.A02(viewGroup, r13);
                    }
                    if (navigationRailView.A00 == null) {
                        navigationRailView.A00(View.inflate(this, 2131625553, (ViewGroup) null));
                    }
                    ViewGroup viewGroup2 = this.A02;
                    str = "mainContainer";
                    if (viewGroup2 != null) {
                        r5.Bvv(viewGroup2, viewGroup2, "rail_nav_sync", 0);
                        return;
                    }
                }
            }
            str = "navBarHelper";
        } else {
            C18030ve r2 = this.A0E;
            if (r2 == null || !C18020vd.A05(C18040vf.A01, r2, 12311)) {
                C28931bI r14 = this.A09;
                if (r14 == null) {
                    View view4 = this.A01;
                    if (view4 != null) {
                        r14 = new C28931bI(AnonymousClass1HF.A06(view4, 2131428340));
                    }
                    str = "rootView";
                }
                this.A09 = r14;
                this.A00 = r14.A02();
                View A063 = AnonymousClass1HF.A06(r14.A02(), 2131428335);
                C18070vi.A0X(A063);
                C28941bJ r22 = (C28941bJ) A063;
                AnonymousClass1LF r15 = this.A06;
                if (r15 != null) {
                    C18070vi.A0d(r22, 0);
                    r15.A01 = r22;
                    ViewGroup viewGroup3 = this.A02;
                    if (viewGroup3 != null) {
                        View view5 = this.A00;
                        AnonymousClass1LI r16 = r15.A03;
                        C18070vi.A0d(r16, 2);
                        if (view5 != null) {
                            r16.A0G(view5);
                            r16.A0E(view5);
                            C29191bl.A02(viewGroup3, r16);
                        }
                        View view6 = this.A00;
                        if (view6 != null) {
                            ViewGroup viewGroup4 = this.A02;
                            if (viewGroup4 != null) {
                                r5.Bvv(view6, viewGroup4, "bottom_nav_sync", 2131625549);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                    C18070vi.A11("mainContainer");
                    throw null;
                }
                str = "navBarHelper";
            } else {
                ViewGroup viewGroup5 = (ViewGroup) findViewById(2131429578);
                if (viewGroup5 != null) {
                    AnonymousClass1LT r0 = this.A07;
                    if (r0 != null) {
                        Context context = viewGroup5.getContext();
                        C18070vi.A0X(context);
                        C38831ry r4 = new C38831ry(context, new C38821rx(r0.A00, r0.A01));
                        C685433t r3 = new C685433t(viewGroup5, this, r5);
                        C38821rx r23 = r4.A00;
                        C38861s1 A002 = r23.A00("bottom_nav_async");
                        A002.A04 = r4;
                        A002.A00 = 2131625549;
                        A002.A02 = viewGroup5;
                        A002.A03 = r3;
                        r23.A01(A002);
                        return;
                    }
                    str = "waAsyncLayoutInflaterManager";
                } else {
                    return;
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        HomeActivity homeActivity = (HomeActivity) this;
        List list = HomeActivity.A2Y;
        list.clear();
        list.add(600);
        list.add(200);
        list.add(300);
        int i = 400;
        if (C18020vd.A05(C18040vf.A02, ((AnonymousClass1XN) homeActivity.A1L.get()).A03, 2358)) {
            i = 800;
        }
        list.add(Integer.valueOf(i));
        Collections.sort(list, new AnonymousClass3D3(homeActivity, 1));
        if (!(!C18000vb.A00(homeActivity.A00).A06)) {
            Collections.reverse(list);
        }
        View inflate = getLayoutInflater().inflate(2131625548, (ViewGroup) null, false);
        C18070vi.A0X(inflate);
        this.A01 = inflate;
        setContentView(inflate);
        View view = this.A01;
        if (view != null) {
            View findViewById = view.findViewById(2131432244);
            C18070vi.A0X(findViewById);
            this.A02 = (ViewGroup) findViewById;
            View view2 = this.A01;
            if (view2 != null) {
                this.A04 = view2;
                this.A00 = 2131429623;
                this.A01 = 2131429578;
                this.A05 = this;
                ((C24001Il) this.A07.get()).A03(this);
                boolean A072 = ((C24001Il) this.A07.get()).A07();
                this.A08 = A072;
                if (A072) {
                    A4e();
                }
                A03(this);
                View view3 = this.A01;
                if (view3 != null) {
                    AnonymousClass1ZO.A04((ViewGroup) view3, new C64892vV(this, 7));
                    AnonymousClass11P r6 = this.A05;
                    C18030ve r9 = this.A0E;
                    C18000vb r8 = this.A00;
                    AnonymousClass1LE r10 = this.A05;
                    if (r10 != null) {
                        AnonymousClass00H r0 = this.A0B;
                        if (r0 != null) {
                            AnonymousClass10I r12 = this.A05;
                            C19830z4 r7 = this.A0A;
                            this.A03 = new C28221Zk((ViewStub) null, (ViewStub) null, (ViewStub) null, (ImageView) findViewById(2131430767), (ImageView) findViewById(2131430769), r6, r7, r8, r9, r10, (AnonymousClass11A) r0.get(), r12);
                            return;
                        }
                        str = "mainThreadHandler";
                    } else {
                        str = "bottomNavHelper";
                    }
                    C18070vi.A11(str);
                    throw null;
                }
            }
            str = "rootView";
            C18070vi.A11(str);
            throw null;
        }
        C18070vi.A11("rootView");
        throw null;
    }

    public void onStart() {
        super.onStart();
        ((C24001Il) this.A07.get()).A04(this, this.A0E);
    }

    public void onStop() {
        super.onStop();
        ((C24001Il) this.A07.get()).A05(this.A0E);
    }
}
