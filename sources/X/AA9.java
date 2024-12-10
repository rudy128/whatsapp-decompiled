package X;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

public class AA9 implements LocationListener {
    public Location A00;
    public View A01;
    public View A02;
    public View A03;
    public ImageView A04;
    public TextView A05;
    public CircularProgressBar A06;
    public AnonymousClass1FY A07;
    public C20079A6f A08;
    public Double A09;
    public Double A0A;
    public Float A0B = Float.valueOf(16.0f);
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public final AnonymousClass1RB A0H;
    public final AnonymousClass11S A0I;
    public final C173738ve A0J;
    public final A5L A0K;
    public final AnonymousClass11C A0L;
    public final WhatsAppLibLoader A0M;
    public final /* synthetic */ DirectorySetLocationMapActivity A0N;

    public void A00() {
        this.A0C = null;
        this.A05.setText(2131887059);
        C72463Mc.A0y(this.A07, this.A05, 2130970055, 2131101191);
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public AA9(AnonymousClass1RB r2, AnonymousClass11S r3, C173738ve r4, A5L a5l, DirectorySetLocationMapActivity directorySetLocationMapActivity, AnonymousClass11C r7, WhatsAppLibLoader whatsAppLibLoader) {
        this.A0N = directorySetLocationMapActivity;
        this.A0I = r3;
        this.A0L = r7;
        this.A0M = whatsAppLibLoader;
        this.A0H = r2;
        this.A0K = a5l;
        this.A0J = r4;
    }

    public void A01() {
        LocationManager A0C2 = this.A0L.A0C();
        if (A0C2 != null && !A0C2.isProviderEnabled("gps") && !A0C2.isProviderEnabled("network")) {
            AnonymousClass4Yv.A01(this.A07, 2);
        }
    }

    public void A02(C107125Ym r7) {
        View A082 = AnonymousClass3MX.A08(this.A07, 2131626448);
        TextView A0J2 = AnonymousClass3MW.A0J(A082, 2131433770);
        ImageView A0G2 = AnonymousClass3MW.A0G(A082, 2131433768);
        View A062 = AnonymousClass1HF.A06(A082, 2131435879);
        View A063 = AnonymousClass1HF.A06(A082, 2131428811);
        A0J2.setText(2131894352);
        A0G2.setImageResource(2131232061);
        C73203Rj A002 = AnonymousClass4a6.A00(this.A07);
        A002.A0c(A082);
        A002.A0T(true);
        C010105w create = A002.create();
        if (create.getWindow() != null) {
            AnonymousClass3Ma.A1H(create.getWindow(), C19740yt.A00(this.A07, 2131102739));
        }
        C90084dV.A00(A062, this, r7, create, 21);
        AFN.A00(A063, create, 18);
        create.show();
        this.A0E = true;
        C17880vN.A1F(AnonymousClass8BT.A05(this.A0J.A03), "DIRECTORY_LOCATION_INFO_SHOWN", true);
    }

    public void A03(String str) {
        this.A0C = str;
        if (!TextUtils.isEmpty(str)) {
            this.A05.setText(str);
            C72463Mc.A0y(this.A07, this.A05, 2130970343, 2131101314);
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            if (this.A00 == null) {
                DirectorySetLocationMapActivity directorySetLocationMapActivity = this.A0N;
                if (directorySetLocationMapActivity.A01 != null && this.A09 == null && this.A0A == null) {
                    directorySetLocationMapActivity.A0E.setLocationMode(1);
                    directorySetLocationMapActivity.A01.A09(C26080Crv.A01(new LatLng(location.getLatitude(), location.getLongitude())));
                }
            }
            DirectorySetLocationMapActivity directorySetLocationMapActivity2 = this.A0N;
            if (directorySetLocationMapActivity2.A0A.A0F && directorySetLocationMapActivity2.A01 != null) {
                directorySetLocationMapActivity2.A01.A08(C26080Crv.A01(new LatLng(location.getLatitude(), location.getLongitude())));
            }
            directorySetLocationMapActivity2.A0E.A06 = location;
            if (C27091Ur.A01(location, this.A00)) {
                this.A00 = location;
            }
        }
    }
}
