package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import com.whatsapp.inappsupport.ui.SupportVideoActivity;

/* renamed from: X.7Ny  reason: invalid class name and case insensitive filesystem */
public class C146137Ny implements AnonymousClass88S {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C146137Ny(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void C0q(boolean z, int i) {
        String str;
        String str2;
        int i2;
        AnonymousClass70X r0;
        switch (this.A00) {
            case 0:
                SupportVideoActivity supportVideoActivity = (SupportVideoActivity) this.A01;
                C129046hA r02 = (C129046hA) this.A02;
                C18070vi.A0d(r02, 1);
                if (i == 3) {
                    Window window = supportVideoActivity.getWindow();
                    if (z) {
                        window.addFlags(128);
                        supportVideoActivity.A4b().A05();
                        if (!r02.A01) {
                            C132976nx r3 = r02.A02;
                            AnonymousClass70X r2 = r02.A03;
                            int A05 = r2.A05();
                            int A06 = r2.A06();
                            if (r2.A0d()) {
                                str2 = "on";
                            } else {
                                str2 = "off";
                            }
                            r3.A00((Integer) null, str2, 1, A05, A06);
                            r02.A00 = r2.A05();
                            r02.A01 = true;
                            return;
                        }
                        return;
                    }
                    window.clearFlags(128);
                    if (r02.A01) {
                        C132976nx r32 = r02.A02;
                        AnonymousClass70X r22 = r02.A03;
                        int A052 = r22.A05();
                        int A062 = r22.A06();
                        if (r22.A0d()) {
                            str = "on";
                        } else {
                            str = "off";
                        }
                        r32.A00(Integer.valueOf(r22.A05() - r02.A00), str, 2, A052, A062);
                        r02.A01 = false;
                        return;
                    }
                    return;
                }
                supportVideoActivity.getWindow().clearFlags(128);
                return;
            case 1:
                View view = (View) this.A02;
                if (i == 1) {
                    C108975cc.A0u(view, 0);
                    return;
                }
                return;
            case 2:
                C130906kC r5 = (C130906kC) this.A01;
                AnonymousClass70X r4 = (AnonymousClass70X) this.A02;
                r5.A09.A04(C72453Mb.A01(r4.A0a() ? 1 : 0));
                FrameLayout frameLayout = r5.A01;
                Context context = frameLayout.getContext();
                int i3 = 2131894629;
                if (r4.A0a()) {
                    i3 = 2131893587;
                }
                AnonymousClass3MY.A0w(context, frameLayout, i3);
                C126246cQ r03 = r5.A08;
                boolean A0a = r4.A0a();
                AnonymousClass74G r23 = r03.A00;
                AnonymousClass3MY.A1L(r23.A0y, A0a);
                C41111vp r1 = r23.A0x;
                if (A0a || !((r0 = r23.A09.A00) == null || r0.A05() == 0)) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                AnonymousClass3MX.A1J(r1, i2);
                if (A0a) {
                    r23.A0u.A02++;
                    return;
                }
                return;
            default:
                AnonymousClass6GW r52 = (AnonymousClass6GW) this.A01;
                AnonymousClass70X r12 = (AnonymousClass70X) this.A02;
                if (i == 3) {
                    C136026t9 r42 = r52.A0F;
                    r42.A00 = Math.min((long) r12.A06(), C20113A7w.A0L);
                    r42.A01();
                    r52.A05.A01();
                    return;
                }
                return;
        }
    }
}
