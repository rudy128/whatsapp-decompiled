package X;

import android.location.LocationManager;
import android.os.Handler;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;

/* renamed from: X.8kf  reason: invalid class name and case insensitive filesystem */
public abstract class C169258kf extends C166798dz {
    public ViewGroup A00;
    public CardView A01;
    public C173738ve A02;
    public C189999kC A03;
    public AnonymousClass8FG A04;
    public C219217x A05;
    public AnonymousClass1LU A06;
    public AnonymousClass689 A07;
    public AnonymousClass00H A08;
    public AnonymousClass00H A09;
    public Runnable A0A;
    public boolean A0B;
    public final Handler A0C = C17890vO.A0D();
    public final AnonymousClass02n A0D = CDw(new AGI((Object) this, 0), new Object());

    public static final void A0V(C169258kf r4) {
        if (r4.A06 != null) {
            C134126q5 r3 = new C134126q5(r4);
            r3.A01 = 2131232061;
            String[] strArr = C27091Ur.A09;
            C18070vi.A0Z(strArr);
            r3.A0C = strArr;
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = "android.permission.ACCESS_COARSE_LOCATION";
            r3.A0B = A1Y;
            r3.A03 = 2131894344;
            r3.A02 = 2131894352;
            r4.startActivityForResult(r3.A00(), 34);
            return;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }

    public final AnonymousClass8FG A4b() {
        AnonymousClass8FG r0 = this.A04;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass3MW.A1H();
        throw null;
    }

    public final void A4c(boolean z) {
        LocationManager A0C2 = this.A08.A0C();
        boolean z2 = false;
        if (A0C2 != null && (A0C2.isProviderEnabled("gps") || A0C2.isProviderEnabled("network"))) {
            z2 = true;
        }
        if (z) {
            A4b().A0U(z2);
        } else if (z2) {
            AnonymousClass3MX.A1J(A4b().A0W, 0);
        } else {
            A0Q(this);
        }
    }

    public static final void A0Q(C169258kf r3) {
        C73203Rj A002 = AnonymousClass4a6.A00(r3);
        A002.A0E(2131890839);
        A002.A0D(2131890838);
        A9Q.A00(A002, r3, 8);
        A002.A00.A0O(C20160A9w.A00(r3, 2));
        A002.A0T(true);
        C20151A9n.A00(A002, r3, 26, 2131899286);
        AnonymousClass3MY.A1G(A002);
    }

    public void onResume() {
        AM7 am7;
        Integer num;
        super.onResume();
        if (this.A04 != null) {
            AnonymousClass8FG A4b = A4b();
            am7 = A4b.A0J;
            num = C20079A6f.A02(A4b);
        } else {
            AnonymousClass00H r0 = this.A08;
            if (r0 != null) {
                am7 = (AM7) C18070vi.A0E(r0);
                num = null;
            } else {
                C18070vi.A11("directorySearchAnalyticsManagerV2");
                throw null;
            }
        }
        am7.A04(num, 11, 73);
    }
}
