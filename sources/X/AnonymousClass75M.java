package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLngBounds;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.location.PlaceInfo;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;
import com.whatsapp.wds.components.search.WDSSearchBar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.75M  reason: invalid class name */
public abstract class AnonymousClass75M implements LocationListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Bitmap A04;
    public Location A05;
    public Handler A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public View A0E;
    public View A0F;
    public View A0G;
    public View A0H;
    public View A0I;
    public ImageView A0J;
    public ImageView A0K;
    public ListView A0L;
    public ProgressBar A0M;
    public ProgressBar A0N;
    public TextView A0O;
    public AnonymousClass01E A0P;
    public C146557Po A0Q;
    public AnonymousClass1BI A0R;
    public C130696jr A0S;
    public C132406mj A0T;
    public PlaceInfo A0U;
    public C20283AEr A0V;
    public WDSSearchBar A0W;
    public Integer A0X;
    public Runnable A0Y;
    public String A0Z;
    public String A0a;
    public Map A0b;
    public boolean A0c = true;
    public boolean A0d = false;
    public boolean A0e = false;
    public boolean A0f;
    public boolean A0g;
    public boolean A0h = false;
    public boolean A0i;
    public boolean A0j = false;
    public int A0k = -1;
    public Handler A0l;
    public HandlerThread A0m;
    public View A0n;
    public View A0o;
    public View A0p;
    public View A0q;
    public View A0r;
    public C146557Po A0s;
    public AnonymousClass9BW A0t;
    public C110255fB A0u;
    public AnonymousClass4VT A0v;
    public Runnable A0w;
    public boolean A0x = true;
    public final C19880zA A0y;
    public final AnonymousClass1L9 A0z;
    public final AnonymousClass1RB A10;
    public final AnonymousClass1KB A11;
    public final C33251iW A12;
    public final AnonymousClass1PM A13;
    public final C25491Ok A14;
    public final C88184Yq A15;
    public final AnonymousClass11C A16;
    public final AnonymousClass11P A17;
    public final AnonymousClass118 A18;
    public final C219217x A19;
    public final C19830z4 A1A;
    public final C18030ve A1B;
    public final AnonymousClass689 A1C;
    public final PlaceInfo A1D = new PlaceInfo();
    public final C198679yj A1E;
    public final AnonymousClass1W6 A1F;
    public final AnonymousClass129 A1G;
    public final AnonymousClass195 A1H;
    public final AnonymousClass190 A1I;
    public final AnonymousClass11S A1J;
    public final AnonymousClass181 A1K;
    public final AnonymousClass1VW A1L;
    public final C27191Vc A1M;
    public final C18000vb A1N;
    public final AnonymousClass1CJ A1O;
    public final AnonymousClass1L2 A1P;
    public final A59 A1Q;
    public final C1193267r A1R;
    public final AnonymousClass1KW A1S;
    public final EmojiSearchProvider A1T;
    public final AnonymousClass1D9 A1U;
    public final AnonymousClass1LU A1V;
    public final C27131Uv A1W;
    public final WhatsAppLibLoader A1X;
    public final C18010vc A1Y;
    public final AnonymousClass1L4 A1Z;
    public final AnonymousClass10I A1a;

    public static void A04(Location location, AnonymousClass75M r7, String str, int i, boolean z) {
        A05(location, r7, str, i, z, true);
    }

    public static void A07(AnonymousClass75M r5) {
        r5.A0i = false;
        Integer num = r5.A0X;
        Integer num2 = AnonymousClass00R.A0N;
        AnonymousClass01E r0 = r5.A0P;
        if (num == num2) {
            r0.finish();
            return;
        }
        View currentFocus = r0.getCurrentFocus();
        if (currentFocus != null) {
            r5.A1Z.A01(currentFocus);
        }
        if (r5.A07 != null) {
            r5.A0D.clearAnimation();
            if (r5.A0D.getVisibility() == 0) {
                r5.A0X((Float) null, false);
                C110075et r2 = new C110075et(r5, 2);
                r2.setDuration(350);
                C114545r0.A00(r2, r5, 8);
                r2.setInterpolator(new AccelerateInterpolator());
                r5.A0D.startAnimation(r2);
            } else {
                r5.A0D.setVisibility(8);
                A0C(r5, 0);
            }
            if (r5.A0T != null) {
                r5.A07.clearAnimation();
                int visibility = r5.A07.getVisibility();
                View view = r5.A07;
                if (visibility != 0) {
                    view.setVisibility(0);
                    r5.A0X((Float) null, false);
                    C132406mj r4 = r5.A0T;
                    C114545r0 r3 = new C114545r0(r5, 9);
                    C110075et r22 = new C110075et(r4, 0);
                    r22.setAnimationListener(new C114525qy(r3, r4, 2));
                    r22.setDuration(400);
                    r22.setInterpolator(new AccelerateInterpolator());
                    r4.A01.startAnimation(r22);
                    return;
                }
                view.setVisibility(0);
                if (r5.A07.getHeight() == 0) {
                    AnonymousClass79A.A00(r5.A07.getViewTreeObserver(), r5, 1);
                    return;
                }
                r5.A0T.A00(C108945cZ.A04(r5.A07));
                A04(r5.A0H(), r5, (String) null, r5.A0G(), false);
                r5.A0Y((Float) null, true);
                return;
            }
            return;
        }
        r5.A0X((Float) null, false);
        A04(r5.A0H(), r5, (String) null, r5.A0G(), false);
        r5.A0Y((Float) null, true);
    }

    public abstract int A0G();

    public abstract Location A0H();

    public C010105w A0I(int i) {
        AnonymousClass757 r2;
        C73203Rj r1;
        int i2;
        int i3;
        int i4;
        Uri A042;
        int i5 = i;
        if (i5 != 2) {
            int i6 = 3;
            if (i5 != 3) {
                i6 = 4;
                if (i5 != 4) {
                    r2 = null;
                    if (i5 != 5) {
                        return null;
                    }
                    r1 = AnonymousClass4a6.A00(this.A0P);
                    r1.A0E(2131891758);
                    i2 = 2131891757;
                }
            }
            View A092 = AnonymousClass3MX.A09(this.A0P.getLayoutInflater(), (ViewGroup) null, 2131625890);
            ImageView A0G2 = AnonymousClass3MW.A0G(A092, 2131431378);
            AnonymousClass01E r12 = this.A0P;
            if (i6 != 3) {
                i3 = 2131895740;
            } else {
                i3 = 2131896098;
            }
            AnonymousClass3MY.A0w(r12, A0G2, i3);
            int i7 = 2131232756;
            if (i6 != 3) {
                i7 = 2131232757;
            }
            A0G2.setImageResource(i7);
            TextEmojiLabel A0W2 = AnonymousClass3MX.A0W(A092, 2131432186);
            Context context = this.A18.A00;
            C18030ve r8 = this.A1B;
            AnonymousClass1KB r15 = this.A11;
            AnonymousClass1L9 r14 = this.A0z;
            AnonymousClass11C r7 = this.A16;
            AnonymousClass01E r22 = this.A0P;
            if (i6 != 3) {
                i4 = 2131892425;
            } else {
                i4 = 2131891771;
                if (C18020vd.A05(C18040vf.A02, r8, 332)) {
                    i4 = 2131891775;
                }
            }
            String A0R2 = C17890vO.A0R(r22, "learn-more", 1, 0, i4);
            C18040vf r4 = C18040vf.A02;
            boolean A052 = C18020vd.A05(r4, r8, 332);
            AnonymousClass129 r13 = this.A1G;
            if (A052) {
                Uri.Builder A022 = r13.A02();
                A022.appendPath("android");
                A022.appendPath("chats");
                A022.appendPath("how-to-use-location-features");
                AnonymousClass129.A01(A022, r13);
                A042 = A022.build();
            } else {
                A042 = r13.A04("26000049");
            }
            AnonymousClass1KB r18 = r15;
            Context context2 = context;
            C26302CxJ.A0K(context2, A042, r14, r18, A0W2, r7, r8, A0R2, "learn-more");
            C73203Rj A002 = AnonymousClass4a6.A00(this.A0P);
            A002.A0c(A092);
            A002.A0T(true);
            A002.A0X(new C1412474w(this, i6, 0), 2131898766);
            A002.A0G(new C1411674o(this, 7));
            int i8 = 2131887451;
            if (C18020vd.A05(r4, r8, 332)) {
                i8 = 2131886593;
            }
            A002.A0Z(new C1412474w(this, i6, 1), i8);
            return A002.create();
        }
        r2 = AnonymousClass757.A00(this, 49);
        r1 = AnonymousClass4a6.A00(this.A0P);
        r1.A0E(2131890839);
        i2 = 2131890838;
        r1.A0D(i2);
        r1.A0T(true);
        r1.A0Z(r2, 2131899286);
        return r1.create();
    }

    public void A0K() {
        if (this.A0X == AnonymousClass00R.A0N || this.A0i) {
            A0F(this, false);
        }
        this.A10.A06(this, "location-picker-onresume", 0.0f, 3, 5000, 1000);
        A0Y((Float) null, false);
    }

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N();

    public abstract void A0O();

    public abstract void A0P();

    public void A0Q(double d, double d2) {
        Integer num;
        PlaceInfo placeInfo = this.A1D;
        double d3 = d;
        placeInfo.A01 = d;
        double d4 = d2;
        placeInfo.A02 = d2;
        placeInfo.A06 = null;
        placeInfo.A04 = null;
        if ((this.A0e && !this.A0h) || (((num = this.A0X) == AnonymousClass00R.A01 || num == AnonymousClass00R.A0C) && TextUtils.isEmpty(this.A0Z))) {
            if (this.A0U == null && (this.A0d || this.A0j)) {
                this.A08.setVisibility(0);
            }
            this.A06.removeCallbacks(this.A0s);
            C146557Po r1 = new C146557Po(this, d3, d4, 0);
            this.A0s = r1;
            this.A06.post(r1);
        }
    }

    public abstract void A0R(int i);

    public abstract void A0T(Location location, Float f, int i, boolean z);

    public abstract void A0W(LatLngBounds latLngBounds, boolean z);

    public abstract void A0b(boolean z);

    public boolean A0c() {
        if (AnonymousClass000.A1P(this.A0W.A08.getVisibility())) {
            this.A0W.A02(true);
            return true;
        }
        this.A0S.A05.dismiss();
        if (!this.A0i) {
            return false;
        }
        A07(this);
        return true;
    }

    public abstract boolean A0d();

    public void onLocationChanged(Location location) {
        int i;
        if (C27091Ur.A01(location, this.A05)) {
            boolean z = true;
            if (location.hasAccuracy()) {
                i = Math.max(1, (int) location.getAccuracy());
            } else {
                i = -1;
            }
            if (i != this.A0k) {
                this.A0k = i;
            }
            A0A(this);
            C20283AEr aEr = this.A0V;
            if (aEr == null || aEr.A00() == null || !this.A0c || location.getAccuracy() >= 200.0f || this.A0V.A00().distanceTo(location) <= 1000.0f) {
                z = false;
            } else {
                this.A0c = false;
            }
            this.A05 = location;
            if (this.A0X == AnonymousClass00R.A0C) {
                this.A06.removeCallbacks(this.A0Q);
                C146557Po r5 = new C146557Po(this, this.A05.getLatitude(), this.A05.getLongitude(), 1);
                this.A0Q = r5;
                this.A06.post(r5);
            }
            if (this.A0V != null && !z) {
                return;
            }
            if ((location.getAccuracy() < 200.0f && location.getTime() + 60000 > System.currentTimeMillis()) || this.A0g) {
                this.A11.A0J(new C146867Qx(this, location, 1, z));
            }
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }

    public static Address A00(AnonymousClass75M r8, double d, double d2) {
        List<Address> list;
        try {
            list = new Geocoder(r8.A0P.getApplicationContext(), r8.A1N.A0N()).getFromLocation(d, d2, 1);
        } catch (Exception unused) {
            list = null;
        }
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (Address) C108955ca.A0p(list);
    }

    private PlaceInfo A01() {
        double d;
        PlaceInfo placeInfo = new PlaceInfo();
        if (this.A0e || TextUtils.isEmpty(this.A0a)) {
            PlaceInfo placeInfo2 = this.A1D;
            placeInfo.A04 = placeInfo2.A04;
            placeInfo.A01 = placeInfo2.A01;
            d = placeInfo2.A02;
        } else {
            placeInfo.A04 = this.A0a;
            placeInfo.A01 = this.A05.getLatitude();
            d = this.A05.getLongitude();
        }
        placeInfo.A02 = d;
        return placeInfo;
    }

    public static String A02(Address address, AnonymousClass75M r4) {
        if (address == null) {
            return r4.A0P.getString(2131891809);
        }
        StringBuilder A102 = AnonymousClass000.A10();
        for (int i = 0; i <= address.getMaxAddressLineIndex(); i++) {
            if (i != 0) {
                A102.append(", ");
            }
            A102.append(address.getAddressLine(i));
        }
        return A102.toString();
    }

    private void A03() {
        int indexOf;
        PlaceInfo placeInfo = this.A0U;
        if (placeInfo != null && (indexOf = this.A0V.A0D.indexOf(placeInfo)) >= 0) {
            A0B(this);
            ListView listView = this.A0L;
            listView.smoothScrollToPosition(indexOf + listView.getHeaderViewsCount());
        }
    }

    public static void A05(Location location, AnonymousClass75M r3, String str, int i, boolean z, boolean z2) {
        ProgressBar progressBar;
        r3.A0l.removeCallbacks(r3.A0w);
        if (r3.A0e) {
            progressBar = r3.A0N;
        } else {
            progressBar = r3.A0M;
        }
        progressBar.setVisibility(0);
        r3.A0U = null;
        r3.A0L();
        r3.A0P.findViewById(2131433876).setVisibility(8);
        r3.A0O.setVisibility(8);
        r3.A0G.setVisibility(8);
        r3.A0V = new C20283AEr();
        A0B(r3);
        AnonymousClass9BW r1 = new AnonymousClass9BW(location, r3, str, i, z, z2);
        r3.A0t = r1;
        C17890vO.A0u(r1, r3.A1a);
    }

    public static void A06(AnonymousClass75M r5) {
        C72453Mb.A1B(r5.A0L.findViewById(2131432180));
        boolean z = !r5.A0e;
        r5.A0e = z;
        float f = -0.5f;
        if (z) {
            f = 0.5f;
        }
        if (r5.A0X == AnonymousClass00R.A0C && !z) {
            A0A(r5);
        }
        r5.A0Y(Float.valueOf(f), true);
    }

    public static void A08(AnonymousClass75M r18) {
        Intent A0A2;
        PlaceInfo placeInfo;
        AnonymousClass75M r4 = r18;
        Integer num = r4.A0X;
        Integer num2 = AnonymousClass00R.A0C;
        if (num != num2) {
            if (C18020vd.A05(C18040vf.A02, r4.A1B, 332) && AnonymousClass3MX.A1T(C17890vO.A0B(r4.A1A), "nearby_location_new_user")) {
                r4.A0Y = new AnonymousClass7RA((Object) r4, 10);
                AnonymousClass4Yv.A01(r4.A0P, 4);
                return;
            }
        }
        r4.A15.A03(8);
        Integer num3 = r4.A0X;
        if (num3 == num2) {
            A0A2 = C17880vN.A0A();
            placeInfo = r4.A01();
            A0A2.putExtra("address", placeInfo.A04);
        } else if (num3 == AnonymousClass00R.A01) {
            A0A2 = C17880vN.A0A();
            A0A2.putExtra("locations_string", r4.A0Z);
            placeInfo = r4.A1D;
        } else {
            Location location = r4.A05;
            AnonymousClass206 r6 = null;
            if (location != null && location.getAccuracy() > 200.0f) {
                location = null;
            }
            long longExtra = r4.A0P.getIntent().getLongExtra("quoted_message_row_id", 0);
            AnonymousClass1EC A0Q2 = C108995ce.A0Q(r4.A0P);
            if (longExtra > 0) {
                r6 = r4.A1F.A01.A03(longExtra);
            } else if (A0Q2 != null) {
                r6 = C181589Rb.A00(A0Q2, (String) null, (String) null, AnonymousClass11P.A01(r4.A17));
            }
            AnonymousClass1BI r2 = r4.A0R;
            if (r2 != null) {
                C33251iW r3 = r4.A12;
                C17960vV.A07(r2);
                boolean A1a2 = AnonymousClass3MY.A1a(r4.A0P.getIntent(), "has_number_from_url");
                AnonymousClass205 A0Z2 = C17880vN.A0Z(r2, r3.A0x);
                AnonymousClass11P r11 = r3.A0K;
                AnonymousClass21B r22 = new AnonymousClass21B(A0Z2, AnonymousClass11P.A01(r11));
                if (location != null) {
                    r22.A00 = location.getLatitude();
                    r22.A01 = location.getLongitude();
                }
                r22.A0a(1);
                r3.A10.A00(r22, r6);
                if (A1a2) {
                    r22.A0b(4);
                }
                r3.A0b(r22);
                AnonymousClass122 r13 = r3.A0U;
                r13.BBN(r22, 2);
                AnonymousClass190 r7 = r3.A01;
                AnonymousClass181 r9 = r3.A06;
                C24681Lg r14 = r3.A0X;
                AnonymousClass1D9 r1 = r3.A0g;
                C49282Pw r62 = new C49282Pw(r7, r3.A02, r9, r3.A0I, r11, r3.A0M, r13, r14, r3.A0Y, r1, r3.A0i, r22);
                r62.A00 = 15;
                C17890vO.A0u(r62, r3.A19);
            }
            AnonymousClass01E r32 = r4.A0P;
            Intent A0A3 = C17880vN.A0A();
            Map map = r4.A0b;
            if (map != null) {
                A0A3.putExtra("carry_forward_extras", new HashMap(map));
            }
            r32.setResult(-1, A0A3);
            r4.A0P.finish();
        }
        A0A2.putExtra("longitude", placeInfo.A02);
        A0A2.putExtra("latitude", placeInfo.A01);
        r4.A0P.setResult(-1, A0A2);
        r4.A0P.finish();
    }

    public static void A09(AnonymousClass75M r5) {
        String str;
        C20283AEr aEr = r5.A0V;
        if (aEr == null || aEr.A0D.isEmpty()) {
            str = null;
        } else {
            C20283AEr aEr2 = r5.A0V;
            if (aEr2.A0B == 3) {
                str = C17880vN.A0q(r5.A0P, "<a href='https://foursquare.com/'>foursquare</a>", AnonymousClass3MW.A1a(), 0, 2131891805);
            } else {
                str = aEr2.A03;
            }
        }
        r5.A0G.setVisibility(8);
        if (str == null || r5.A0e) {
            r5.A0O.setVisibility(8);
            return;
        }
        AnonymousClass3MY.A1X(str, r5.A0O);
        r5.A0O.setVisibility(0);
    }

    public static void A0A(AnonymousClass75M r8) {
        View findViewById;
        String A0K2;
        if (!r8.A0d) {
            findViewById = r8.A0P.findViewById(2131432177);
        } else if (!r8.A0e) {
            findViewById = r8.A0C.findViewById(2131432180);
        } else {
            return;
        }
        TextView textView = (TextView) findViewById;
        if (textView != null) {
            Integer num = r8.A0X;
            Integer num2 = AnonymousClass00R.A0C;
            if (num == num2) {
                A0K2 = r8.A01().A04;
                if (!TextUtils.isEmpty(A0K2)) {
                    textView.setVisibility(0);
                }
                textView.setVisibility(8);
                return;
            }
            Integer num3 = AnonymousClass00R.A01;
            if (num != num3 || TextUtils.isEmpty(r8.A0Z)) {
                Integer num4 = r8.A0X;
                if (!(num4 == num3 || num4 == num2 || r8.A0k <= 0)) {
                    textView.setVisibility(0);
                    C18000vb r5 = r8.A1N;
                    int i = r8.A0k;
                    Object[] A1a2 = AnonymousClass3MW.A1a();
                    C17880vN.A1T(A1a2, i, 0);
                    A0K2 = r5.A0K(A1a2, 2131755221, (long) i);
                }
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            A0K2 = r8.A0Z;
            textView.setText(A0K2);
        }
    }

    public static void A0B(AnonymousClass75M r2) {
        List list;
        C110255fB r1 = r2.A0u;
        C20283AEr aEr = r2.A0V;
        if (aEr != null) {
            list = aEr.A0D;
        } else {
            list = null;
        }
        r1.A01 = list;
        r1.A00 = r2.A0U;
        r1.notifyDataSetChanged();
    }

    public static void A0C(AnonymousClass75M r3, int i) {
        r3.A01 = i;
        int max = Math.max(r3.A00, i);
        r3.A0E.setPadding(0, 0, 0, max);
        r3.A0E.requestLayout();
        r3.A0R(max);
    }

    public static void A0D(AnonymousClass75M r23, PlaceInfo placeInfo) {
        AnonymousClass206 r2;
        AnonymousClass01E r22;
        Intent A0A2;
        AnonymousClass75M r5 = r23;
        Integer num = r5.A0X;
        Integer num2 = AnonymousClass00R.A0C;
        PlaceInfo placeInfo2 = placeInfo;
        if (num != num2) {
            if (C18020vd.A05(C18040vf.A02, r5.A1B, 332) && AnonymousClass3MX.A1T(C17890vO.A0B(r5.A1A), "nearby_location_new_user")) {
                r5.A0Y = new C146507Pj(r5, placeInfo2, 45);
                AnonymousClass4Yv.A01(r5.A0P, 4);
                return;
            }
        }
        Integer num3 = r5.A0X;
        if (num3 == num2) {
            A0A2 = C17880vN.A0A();
            A0A2.putExtra("locations_string", placeInfo2.A06);
            A0A2.putExtra("longitude", placeInfo2.A02);
            A0A2.putExtra("latitude", placeInfo2.A01);
            A0A2.putExtra("address", placeInfo2.A04);
            A0A2.putExtra("vicinity", placeInfo2.A09);
        } else if (num3 == AnonymousClass00R.A01) {
            A0A2 = C17880vN.A0A();
            A0A2.putExtra("locations_string", placeInfo2.A06);
            PlaceInfo placeInfo3 = r5.A1D;
            A0A2.putExtra("longitude", placeInfo3.A02);
            A0A2.putExtra("latitude", placeInfo3.A01);
        } else {
            long longExtra = r5.A0P.getIntent().getLongExtra("quoted_message_row_id", 0);
            AnonymousClass1EC A0Q2 = C108995ce.A0Q(r5.A0P);
            if (longExtra > 0) {
                r2 = r5.A1F.A01.A03(longExtra);
            } else {
                r2 = null;
                if (A0Q2 != null) {
                    r2 = C181589Rb.A00(A0Q2, (String) null, (String) null, AnonymousClass11P.A01(r5.A17));
                }
            }
            AnonymousClass1BI r6 = r5.A0R;
            if (r6 != null) {
                C33251iW r8 = r5.A12;
                C17960vV.A07(r6);
                boolean A1a2 = AnonymousClass3MY.A1a(r5.A0P.getIntent(), "has_number_from_url");
                AnonymousClass205 A0Z2 = C17880vN.A0Z(r6, r8.A0x);
                AnonymousClass11P r7 = r8.A0K;
                AnonymousClass21B r62 = new AnonymousClass21B(A0Z2, AnonymousClass11P.A01(r7));
                r62.A0a(1);
                r62.A00 = placeInfo2.A01;
                r62.A01 = placeInfo2.A02;
                r62.A01 = placeInfo2.A06;
                r62.A00 = placeInfo2.A04;
                r62.A02 = placeInfo2.A08;
                r8.A10.A00(r62, r2);
                if (A1a2) {
                    r62.A0b(4);
                }
                r8.A0b(r62);
                AnonymousClass122 r11 = r8.A0U;
                r11.BBN(r62, 2);
                AnonymousClass10I r10 = r8.A19;
                AnonymousClass190 r13 = r8.A01;
                AnonymousClass181 r15 = r8.A06;
                C24681Lg r9 = r8.A0X;
                AnonymousClass1D9 r3 = r8.A0g;
                C219217x r24 = r8.A0M;
                AnonymousClass1RB r14 = r8.A02;
                C26111Qw r1 = r8.A0Y;
                C24681Lg r20 = r9;
                AnonymousClass122 r19 = r11;
                C219217x r18 = r24;
                AnonymousClass11P r17 = r7;
                AnonymousClass1RW r16 = r8.A0I;
                C17890vO.A0u(new C49282Pw(r13, r14, r15, r16, r17, r18, r19, r20, r1, r3, r8.A0i, r62), r10);
            }
            r22 = r5.A0P;
            A0A2 = C17880vN.A0A();
            Map map = r5.A0b;
            if (map != null) {
                A0A2.putExtra("carry_forward_extras", new HashMap(map));
            }
            r22.setResult(-1, A0A2);
            r5.A0P.finish();
        }
        r22 = r5.A0P;
        r22.setResult(-1, A0A2);
        r5.A0P.finish();
    }

    public static void A0E(AnonymousClass75M r3, Float f, int i, boolean z) {
        r3.A07.clearAnimation();
        r3.A0T(r3.A0H(), f, i, z);
        C132406mj r4 = r3.A0T;
        if (r4 == null) {
            return;
        }
        if (z) {
            View view = r4.A01;
            C110035ep r2 = new C110035ep(view, r4, i);
            r2.setDuration((long) ((int) (((float) i) / r4.A00.getDisplayMetrics().density)));
            view.startAnimation(r2);
            return;
        }
        View view2 = r4.A01;
        AnonymousClass3MX.A1F(view2, i);
        view2.requestLayout();
        r4.A00((float) i);
    }

    public static void A0F(AnonymousClass75M r6, boolean z) {
        AnonymousClass01E r1;
        int i;
        if (r6.A1J.A0N()) {
            r1 = r6.A0P;
            i = 5;
        } else if (C17890vO.A0B(r6.A1A).getBoolean("live_location_is_new_user", true)) {
            r1 = r6.A0P;
            i = 3;
        } else {
            LocationManager A0C2 = r6.A16.A0C();
            if (A0C2 != null && !A0C2.isProviderEnabled("gps") && !A0C2.isProviderEnabled("network")) {
                r1 = r6.A0P;
                i = 2;
            } else if (!r6.A19.A06()) {
                r6.A0i = false;
                r6.A0Y((Float) null, false);
                return;
            } else {
                r6.A0V = new C20283AEr();
                r6.A0i = true;
                View view = r6.A07;
                if (view != null) {
                    if (r6.A0T != null) {
                        view.clearAnimation();
                        C132406mj r5 = r6.A0T;
                        if (z) {
                            View view2 = r5.A01;
                            if (view2.getVisibility() == 0) {
                                C110075et r2 = new C110075et(r5, 1);
                                C114545r0.A00(r2, r5, 7);
                                r2.setDuration(350);
                                r2.setInterpolator(new AccelerateInterpolator());
                                view2.startAnimation(r2);
                            }
                        }
                        r5.A01.setVisibility(8);
                        r5.A00(0.0f);
                    }
                    r6.A0D.clearAnimation();
                    if (!z || r6.A0D.getVisibility() == 0) {
                        r6.A0D.setVisibility(0);
                        int height = r6.A0D.getHeight();
                        View view3 = r6.A0D;
                        if (height == 0) {
                            AnonymousClass79A.A00(view3.getViewTreeObserver(), r6, 2);
                            return;
                        }
                        A0C(r6, view3.getHeight());
                        r6.A0b(false);
                        r6.A0X((Float) null, false);
                        return;
                    }
                    r6.A0D.setVisibility(0);
                    r6.A0X((Float) null, false);
                    C110075et r22 = new C110075et(r6, 3);
                    r22.setDuration(400);
                    C114545r0.A00(r22, r6, 10);
                    r22.setInterpolator(new AccelerateInterpolator());
                    r6.A0D.startAnimation(r22);
                    return;
                }
                r6.A0b(true);
                r6.A0Y((Float) null, true);
                return;
            }
        }
        AnonymousClass4Yv.A01(r1, i);
    }

    public void A0J() {
        Handler handler = this.A0l;
        if (handler != null) {
            handler.removeCallbacks(this.A0w);
        }
        AnonymousClass9BW r1 = this.A0t;
        if (r1 != null) {
            r1.A0B(true);
            this.A0t = null;
        }
        this.A0v.A02.A04(false);
        C130696jr r2 = this.A0S;
        r2.A01.getViewTreeObserver().removeOnGlobalLayoutListener(r2.A02);
        r2.A07.A0L();
        this.A0m.quit();
        this.A15.A02(8);
    }

    public void A0S(Intent intent) {
        if (C17890vO.A1S(intent, "android.intent.action.SEARCH")) {
            A04(A0H(), this, intent.getStringExtra("query"), Math.max(A0G(), 50000), true);
        }
    }

    public void A0U(Bundle bundle) {
        bundle.putParcelable("places", this.A0V);
        bundle.putBoolean("show_live_location_setting", this.A0i);
        bundle.putBoolean("fullscreen", this.A0e);
        bundle.putBoolean("zoom_to_user", this.A0x);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x054c, code lost:
        if (((X.C32171gl) r1.A03()).Bey(r3) != false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x03dc, code lost:
        r9 = r6.A1M;
        r28 = r2;
        r26 = r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0V(android.os.Bundle r35, X.AnonymousClass01E r36) {
        /*
            r34 = this;
            r6 = r34
            r7 = r36
            r6.A0P = r7
            X.0ve r12 = r6.A1B
            boolean r2 = X.C87544Vz.A00(r12)
            r11 = 0
            r5 = 0
            android.view.LayoutInflater r1 = r7.getLayoutInflater()
            r0 = 2131625894(0x7f0e07a6, float:1.8879009E38)
            if (r2 == 0) goto L_0x001a
            r0 = 2131625896(0x7f0e07a8, float:1.8879013E38)
        L_0x001a:
            android.view.View r3 = r1.inflate(r0, r11, r5)
            r0 = 2131430190(0x7f0b0b2e, float:1.8482074E38)
            android.widget.TextView r4 = X.C17880vN.A0E(r3, r0)
            r2 = 2131891782(0x7f121646, float:1.9418294E38)
            r10 = 1
            java.lang.Object[] r1 = new java.lang.Object[r10]
            r0 = 15
            X.C17880vN.A1T(r1, r0, r5)
            X.AnonymousClass3MY.A0y(r7, r4, r1, r2)
            r0 = 2131430192(0x7f0b0b30, float:1.8482078E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r3, r0)
            r1 = 2131891783(0x7f121647, float:1.9418296E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            X.C17880vN.A1T(r0, r10, r5)
            X.AnonymousClass3MY.A0y(r7, r2, r0, r1)
            r0 = 2131430191(0x7f0b0b2f, float:1.8482076E38)
            android.widget.TextView r2 = X.C17880vN.A0E(r3, r0)
            r1 = 2131891784(0x7f121648, float:1.9418298E38)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r4 = 8
            X.C17880vN.A1T(r0, r4, r5)
            X.AnonymousClass3MY.A0y(r7, r2, r0, r1)
            r7.setContentView((android.view.View) r3)
            com.whatsapp.nativelibloader.WhatsAppLibLoader r0 = r6.A1X
            boolean r0 = r0.A04()
            if (r0 != 0) goto L_0x006f
            java.lang.String r0 = "aborting due to native libraries missing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0069:
            X.01E r0 = r6.A0P
            r0.finish()
        L_0x006e:
            return
        L_0x006f:
            X.11S r9 = r6.A1J
            r9.A0I()
            com.whatsapp.Me r0 = r9.A00
            if (r0 == 0) goto L_0x0069
            r8 = r35
            if (r35 == 0) goto L_0x00a1
            java.lang.String r1 = "places"
            android.os.Parcelable r0 = r8.getParcelable(r1)
            X.AEr r0 = (X.C20283AEr) r0
            r6.A0V = r0
            java.lang.String r0 = "show_live_location_setting"
            boolean r0 = r8.getBoolean(r0, r5)
            r6.A0i = r0
            r8.remove(r1)
            java.lang.String r0 = "fullscreen"
            boolean r0 = r8.getBoolean(r0, r5)
            r6.A0e = r0
            java.lang.String r0 = "zoom_to_user"
            boolean r0 = r8.getBoolean(r0, r5)
            r6.A0x = r0
        L_0x00a1:
            X.01E r0 = r6.A0P
            java.lang.String r0 = X.C72453Mb.A0u(r0)
            X.1BI r0 = X.AnonymousClass3MX.A0l(r0)
            r6.A0R = r0
            X.01E r0 = r6.A0P
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "start_in_fullscreen_mode"
            boolean r0 = r1.getBooleanExtra(r0, r5)
            r6.A0j = r0
            X.01E r0 = r6.A0P
            android.os.Bundle r2 = X.AnonymousClass3MY.A09(r0)
            if (r2 == 0) goto L_0x00d5
            java.lang.String r1 = "carry_forward_extras"
            java.io.Serializable r0 = r2.getSerializable(r1)
            boolean r0 = r0 instanceof java.util.Map
            if (r0 == 0) goto L_0x00d5
            java.io.Serializable r0 = r2.getSerializable(r1)
            java.util.Map r0 = (java.util.Map) r0
            r6.A0b = r0
        L_0x00d5:
            X.1BI r0 = r6.A0R
            if (r0 != 0) goto L_0x055d
            r13 = 0
        L_0x00da:
            X.1PM r2 = r6.A13
            X.1Ok r0 = r6.A14
            X.2tn r1 = new X.2tn
            r1.<init>((X.AnonymousClass1PM) r2, (X.C25491Ok) r0, (com.whatsapp.jid.UserJid) r13)
            r0 = 1506(0x5e2, float:2.11E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r12, r0)
            r2 = 0
            if (r0 == 0) goto L_0x04fb
            if (r13 == 0) goto L_0x04fb
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x04fb
        L_0x00f6:
            r6.A0d = r2
            android.content.Intent r0 = r7.getIntent()
            if (r0 == 0) goto L_0x0111
            android.content.Intent r1 = r7.getIntent()
            java.lang.String r0 = "mode"
            int r1 = r1.getIntExtra(r0, r5)
            r0 = 4
            java.lang.Integer[] r0 = X.AnonymousClass00R.A00(r0)
            r0 = r0[r1]
            r6.A0X = r0
        L_0x0111:
            r0 = 2131432239(0x7f0b132f, float:1.848623E38)
            android.view.View r0 = X.C110885hR.A0A(r7, r0)
            r6.A0I = r0
            r15 = 2
            X.794 r3 = new X.794
            r3.<init>(r6)
            r0 = 2131437029(0x7f0b25e5, float:1.8495945E38)
            android.view.View r0 = r7.findViewById(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = (com.whatsapp.wds.components.search.WDSSearchBar) r0
            r6.A0W = r0
            com.whatsapp.wds.components.search.WDSSearchView r2 = r0.A08
            r0 = 20
            X.7SB r0 = X.AnonymousClass7SB.A00(r6, r0)
            r2.setOnQueryTextSubmitListener(r0)
            X.4CB r0 = X.AnonymousClass4CB.A00
            r2.setTrailingButtonIcon(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r1 = r6.A0W
            r32 = 1
            X.78Z r0 = new X.78Z
            r0.<init>(r2, r3, r10)
            r1.addOnLayoutChangeListener(r0)
            com.whatsapp.wds.components.search.WDSSearchBar r0 = r6.A0W
            androidx.appcompat.widget.Toolbar r0 = r0.A07
            X.01n r2 = X.AnonymousClass3MY.A0K(r7, r0)
            r2.A0W(r10)
            java.lang.Integer r3 = r6.A0X
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r3 != r0) goto L_0x04e7
            r0 = 2131895608(0x7f122538, float:1.9426054E38)
            r2.A0M(r0)
        L_0x015e:
            boolean r0 = X.C87544Vz.A00(r12)
            if (r0 == 0) goto L_0x0167
            X.C181769Rt.A00(r7, r2)
        L_0x0167:
            r0 = 2131432277(0x7f0b1355, float:1.8486307E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A0F = r0
            if (r0 == 0) goto L_0x017b
            android.view.ViewTreeObserver r1 = r0.getViewTreeObserver()
            r0 = 10
            X.AnonymousClass793.A00(r1, r6, r0)
        L_0x017b:
            r0 = 2131433812(0x7f0b1954, float:1.848942E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A0q = r0
            r0 = 2131433877(0x7f0b1995, float:1.8489552E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A0r = r0
            r0 = 2131432268(0x7f0b134c, float:1.8486289E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A0B = r0
            r0 = 2131432274(0x7f0b1352, float:1.84863E38)
            android.view.View r1 = r7.findViewById(r0)
            r6.A0A = r1
            r0 = 2131889169(0x7f120c11, float:1.9412994E38)
            X.AnonymousClass3MY.A0w(r7, r1, r0)
            r0 = 2131432271(0x7f0b134f, float:1.8486295E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A09 = r0
            r0 = 2131432273(0x7f0b1351, float:1.8486299E38)
            android.view.View r0 = X.C110885hR.A0A(r7, r0)
            r6.A08 = r0
            r3 = 12
            X.AnonymousClass78K.A00(r0, r6, r3)
            X.01E r1 = r6.A0P
            r0 = 2131435174(0x7f0b1ea6, float:1.8492183E38)
            android.view.View r1 = r1.findViewById(r0)
            r6.A0n = r1
            r0 = 13
            X.AnonymousClass78K.A00(r1, r6, r0)
            X.01E r1 = r6.A0P
            r0 = 2131432128(0x7f0b12c0, float:1.8486005E38)
            android.view.View r1 = r1.findViewById(r0)
            r6.A0o = r1
            boolean r0 = r9.A0N()
            int r0 = X.C72453Mb.A01(r0)
            r1.setVisibility(r0)
            android.view.View r1 = r6.A0o
            r0 = 14
            X.AnonymousClass78K.A00(r1, r6, r0)
            android.view.View r1 = r6.A0o
            r0 = 2131432132(0x7f0b12c4, float:1.8486013E38)
            android.view.View r2 = r1.findViewById(r0)
            boolean r0 = r2 instanceof android.widget.ImageView
            if (r0 == 0) goto L_0x0209
            r1 = r2
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131232018(0x7f080512, float:1.8080133E38)
            r1.setImageResource(r0)
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131169535(0x7f0710ff, float:1.7953403E38)
            X.AnonymousClass3MY.A14(r1, r2, r0)
        L_0x0209:
            r0 = 2131431029(0x7f0b0e75, float:1.8483776E38)
            android.view.View r1 = X.C110885hR.A0A(r7, r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.A0J = r1
            r0 = 15
            X.AnonymousClass78K.A00(r1, r6, r0)
            android.os.Handler r14 = X.C17890vO.A0D()
            r6.A0l = r14
            r2 = 11
            X.7RA r13 = new X.7RA
            r13.<init>((java.lang.Object) r6, (int) r2)
            r6.A0w = r13
            X.AEr r0 = r6.A0V
            if (r0 != 0) goto L_0x0231
            r0 = 15000(0x3a98, double:7.411E-320)
            r14.postDelayed(r13, r0)
        L_0x0231:
            java.io.File r1 = r7.getCacheDir()
            java.lang.String r0 = "Places"
            java.io.File r21 = X.C17880vN.A0e(r1, r0)
            boolean r0 = r21.mkdirs()
            if (r0 != 0) goto L_0x024c
            boolean r0 = r21.isDirectory()
            if (r0 != 0) goto L_0x024c
            java.lang.String r0 = "LocationPickerUI/create unable to create places directory"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x024c:
            X.10I r0 = r6.A1a
            r16 = r0
            X.1KB r14 = r6.A11
            X.181 r13 = r6.A1K
            X.1D9 r1 = r6.A1U
            java.lang.String r22 = "location-picker"
            X.4Ra r0 = new X.4Ra
            r19 = r1
            r20 = r16
            r16 = r0
            r17 = r14
            r18 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22)
            X.01E r1 = r6.A0P
            android.content.res.Resources r13 = r1.getResources()
            r1 = 2131167326(0x7f07085e, float:1.7948922E38)
            int r1 = r13.getDimensionPixelSize(r1)
            r0.A00 = r1
            X.4VT r0 = r0.A00()
            r6.A0v = r0
            X.01E r1 = r6.A0P
            r0 = 2131432893(0x7f0b15bd, float:1.8487556E38)
            android.widget.ImageView r0 = X.AnonymousClass3MX.A0I(r1, r0)
            r6.A0K = r0
            X.01E r1 = r6.A0P
            r0 = 2131433776(0x7f0b1930, float:1.8489347E38)
            android.view.View r0 = r1.findViewById(r0)
            r6.A0H = r0
            X.01E r1 = r6.A0P
            r0 = 2131432143(0x7f0b12cf, float:1.8486035E38)
            android.view.View r0 = r1.findViewById(r0)
            r6.A0p = r0
            r0 = 2131434205(0x7f0b1add, float:1.8490217E38)
            android.view.View r13 = X.C110885hR.A0A(r7, r0)
            android.widget.ProgressBar r13 = (android.widget.ProgressBar) r13
            r6.A0M = r13
            X.AEr r1 = r6.A0V
            r0 = 8
            if (r1 != 0) goto L_0x02af
            r0 = 0
        L_0x02af:
            r13.setVisibility(r0)
            r0 = 2131434203(0x7f0b1adb, float:1.8490213E38)
            android.view.View r0 = r7.findViewById(r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r6.A0N = r0
            X.01E r1 = r6.A0P
            r0 = 2131625895(0x7f0e07a7, float:1.887901E38)
            android.view.View r14 = android.view.View.inflate(r1, r0, r11)
            r0 = 2131432189(0x7f0b12fd, float:1.8486128E38)
            android.widget.TextView r1 = X.C17880vN.A0E(r14, r0)
            r6.A0O = r1
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            X.01E r1 = r6.A0P
            r0 = 2131625897(0x7f0e07a9, float:1.8879015E38)
            android.view.View r13 = android.view.View.inflate(r1, r0, r11)
            r0 = 2131432191(0x7f0b12ff, float:1.8486132E38)
            android.view.View r0 = r13.findViewById(r0)
            r6.A0G = r0
            r0.setVisibility(r4)
            X.4VT r1 = r6.A0v
            X.5fB r0 = new X.5fB
            r0.<init>(r7, r1)
            r6.A0u = r0
            X.01E r1 = r6.A0P
            r0 = 2131433878(0x7f0b1996, float:1.8489554E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.ListView r0 = (android.widget.ListView) r0
            r6.A0L = r0
            boolean r0 = r6.A0d
            if (r0 == 0) goto L_0x04e1
            boolean r0 = X.AnonymousClass1J8.A05(r12)
            r1 = 2131625888(0x7f0e07a0, float:1.8878997E38)
            if (r0 == 0) goto L_0x0311
            r1 = 2131625889(0x7f0e07a1, float:1.8878999E38)
        L_0x0311:
            X.01E r0 = r6.A0P
            android.view.LayoutInflater r0 = r0.getLayoutInflater()
            android.view.View r1 = r0.inflate(r1, r11)
            android.widget.ListView r0 = r6.A0L
            r0.addHeaderView(r1, r11, r5)
            X.01E r0 = r6.A0P
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131625901(0x7f0e07ad, float:1.8879023E38)
            android.view.View r1 = r1.inflate(r0, r11)
            r6.A0C = r1
            android.widget.ListView r0 = r6.A0L
            r0.addHeaderView(r1, r11, r10)
        L_0x0334:
            android.widget.ListView r1 = r6.A0L
            X.5fB r0 = r6.A0u
            r1.setAdapter(r0)
            android.widget.ListView r0 = r6.A0L
            r0.setFooterDividersEnabled(r10)
            android.widget.ListView r0 = r6.A0L
            r0.addFooterView(r14, r11, r10)
            android.widget.ListView r0 = r6.A0L
            r0.addFooterView(r13, r11, r5)
            A09(r6)
            A0B(r6)
            android.widget.ListView r1 = r6.A0L
            X.79K r0 = new X.79K
            r0.<init>(r7, r6)
            r1.setOnItemClickListener(r0)
            X.01E r1 = r6.A0P
            r0 = 2131430189(0x7f0b0b2d, float:1.8482072E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.RadioGroup r0 = (android.widget.RadioGroup) r0
            X.79R r13 = new X.79R
            r13.<init>()
            r0.setOnCheckedChangeListener(r13)
            X.01E r0 = r6.A0P
            r33 = r0
            X.1L4 r0 = r6.A1Z
            r31 = r0
            X.190 r0 = r6.A1I
            r19 = r0
            X.1KW r0 = r6.A1S
            r26 = r0
            X.67r r0 = r6.A1R
            r25 = r0
            X.11C r0 = r6.A16
            r20 = r0
            X.0vb r10 = r6.A1N
            com.whatsapp.emoji.search.EmojiSearchProvider r0 = r6.A1T
            r27 = r0
            X.0z4 r0 = r6.A1A
            r21 = r0
            X.0vc r0 = r6.A1Y
            r18 = r0
            X.A59 r0 = r6.A1Q
            r17 = r0
            X.1L2 r0 = r6.A1P
            r16 = r0
            android.view.View r14 = r6.A0I
            X.1BI r1 = r6.A0R
            X.6jr r0 = new X.6jr
            r22 = r10
            r23 = r16
            r24 = r17
            r28 = r12
            r29 = r1
            r30 = r18
            r16 = r0
            r17 = r33
            r18 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r6.A0S = r0
            X.01E r1 = r6.A0P
            r0 = 2131435142(0x7f0b1e86, float:1.8492118E38)
            android.widget.ImageView r12 = X.AnonymousClass3MX.A0I(r1, r0)
            r1 = 2131232506(0x7f0806fa, float:1.8081123E38)
            X.01E r0 = r6.A0P
            X.AnonymousClass3NL.A01(r0, r12, r10, r1)
            X.AnonymousClass3MY.A1E(r12, r6, r13, r2)
            X.01E r1 = r6.A0P
            r0 = 2131624670(0x7f0e02de, float:1.8876526E38)
            android.view.View r1 = android.view.View.inflate(r1, r0, r11)
            r9.A0I()
            X.1E8 r2 = r9.A0D
            if (r2 == 0) goto L_0x0412
            X.1Vc r9 = r6.A1M
            android.content.Context r27 = r1.getContext()
            X.01E r0 = r6.A0P
            android.content.res.Resources r10 = r0.getResources()
            r0 = 2131168739(0x7f070de3, float:1.7951788E38)
            int r31 = r10.getDimensionPixelSize(r0)
            X.01E r0 = r6.A0P
            android.content.res.Resources r10 = r0.getResources()
            r0 = 2131168737(0x7f070de1, float:1.7951784E38)
            float r30 = r10.getDimension(r0)
            java.lang.String r29 = "LocationPickerUI.onCreate"
            r28 = r2
            r26 = r9
            android.graphics.Bitmap r11 = r26.A04(r27, r28, r29, r30, r31, r32)
            if (r11 != 0) goto L_0x0412
            X.1VW r9 = r6.A1L
            android.content.Context r0 = r1.getContext()
            android.graphics.Bitmap r11 = r9.A06(r0, r2)
        L_0x0412:
            r0 = 2131429433(0x7f0b0839, float:1.8480539E38)
            android.widget.ImageView r0 = X.AnonymousClass3MW.A0H(r1, r0)
            r0.setImageBitmap(r11)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r1.measure(r0, r0)
            int r9 = r1.getMeasuredWidth()
            int r2 = r1.getMeasuredHeight()
            android.graphics.Bitmap r0 = X.C108945cZ.A0H(r9, r2)
            r6.A04 = r0
            r1.layout(r5, r5, r9, r2)
            android.graphics.Bitmap r0 = r6.A04
            android.graphics.Canvas r0 = X.C108945cZ.A0I(r0)
            r1.draw(r0)
            r0 = 2131428345(0x7f0b03f9, float:1.8478332E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A07 = r0
            r0 = 2131432272(0x7f0b1350, float:1.8486297E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A0E = r0
            android.view.View r0 = r6.A07
            if (r0 == 0) goto L_0x04d9
            r0.setVisibility(r5)
            android.content.res.Resources r5 = r7.getResources()
            android.view.View r2 = r6.A07
            X.6c0 r1 = new X.6c0
            r1.<init>(r6)
            X.6mj r0 = new X.6mj
            r0.<init>(r5, r2, r1)
            r6.A0T = r0
        L_0x0468:
            r0 = 2131432144(0x7f0b12d0, float:1.8486037E38)
            android.view.View r0 = r7.findViewById(r0)
            r6.A0D = r0
            if (r0 == 0) goto L_0x0476
            r0.setVisibility(r4)
        L_0x0476:
            if (r35 != 0) goto L_0x049b
            X.17x r0 = r6.A19
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x049b
            android.location.LocationManager r1 = r20.A0C()
            if (r1 == 0) goto L_0x049b
            java.lang.String r0 = "gps"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x049b
            java.lang.String r0 = "network"
            boolean r0 = r1.isProviderEnabled(r0)
            if (r0 != 0) goto L_0x049b
            X.01E r0 = r6.A0P
            X.AnonymousClass4Yv.A01(r0, r15)
        L_0x049b:
            java.lang.String r1 = "GeoCode"
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            r6.A0m = r0
            r0.start()
            android.os.HandlerThread r0 = r6.A0m
            android.os.Looper r1 = r0.getLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r6.A06 = r0
            X.6LF r1 = new X.6LF
            r1.<init>(r6, r7, r3)
            r0 = 2131428611(0x7f0b0503, float:1.8478871E38)
            android.view.View r0 = X.C110885hR.A0A(r7, r0)
            r0.setOnClickListener(r1)
            r0 = 2131428612(0x7f0b0504, float:1.8478873E38)
            android.view.View r0 = r7.findViewById(r0)
            if (r0 == 0) goto L_0x04cf
            r0.setOnClickListener(r1)
        L_0x04cf:
            boolean r0 = r6.A0j
            if (r0 == 0) goto L_0x006e
            if (r35 != 0) goto L_0x006e
            A06(r6)
            return
        L_0x04d9:
            X.6jr r0 = r6.A0S
            com.whatsapp.mentions.MentionableEntry r0 = r0.A07
            r0.setMaxLines(r15)
            goto L_0x0468
        L_0x04e1:
            android.view.View r0 = r6.A0n
            r6.A0C = r0
            goto L_0x0334
        L_0x04e7:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            r0 = 2131895705(0x7f122599, float:1.942625E38)
            if (r3 != r1) goto L_0x04f6
            r0 = 2131895600(0x7f122530, float:1.9426038E38)
            r2.A0M(r0)
            goto L_0x015e
        L_0x04f6:
            r2.A0M(r0)
            goto L_0x015e
        L_0x04fb:
            X.1BI r0 = r6.A0R
            boolean r0 = X.C22971Dz.A0d(r0)
            if (r0 == 0) goto L_0x0511
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x00f6
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x0511
            goto L_0x00f6
        L_0x0511:
            r0 = 2515(0x9d3, float:3.524E-42)
            boolean r0 = X.C18020vd.A05(r3, r12, r0)
            if (r0 == 0) goto L_0x0524
            X.1ya r0 = r1.A01
            int r1 = r0.hostStorage
            r0 = 2
            if (r1 == r0) goto L_0x00f6
            if (r1 != r10) goto L_0x0524
            goto L_0x00f6
        L_0x0524:
            X.1BI r0 = r6.A0R
            boolean r0 = X.C22971Dz.A0T(r0)
            if (r0 == 0) goto L_0x0536
            r0 = 2584(0xa18, float:3.621E-42)
            boolean r0 = X.C18020vd.A05(r3, r12, r0)
            if (r0 != 0) goto L_0x0536
            goto L_0x00f6
        L_0x0536:
            X.1BI r3 = r6.A0R
            if (r3 == 0) goto L_0x0550
            X.0zA r1 = r6.A0y
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0550
            java.lang.Object r0 = r1.A03()
            X.1gl r0 = (X.C32171gl) r0
            boolean r0 = r0.Bey(r3)
            if (r0 == 0) goto L_0x0550
            goto L_0x00f6
        L_0x0550:
            X.1BI r0 = r6.A0R
            if (r0 == 0) goto L_0x00f6
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 != 0) goto L_0x00f6
            r2 = 1
            goto L_0x00f6
        L_0x055d:
            java.lang.String r0 = r0.getRawString()
            com.whatsapp.jid.UserJid r13 = X.C22941Dw.A02(r0)
            goto L_0x00da
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass75M.A0V(android.os.Bundle, X.01E):void");
    }

    public void A0Y(Float f, boolean z) {
        C219217x r4 = this.A19;
        boolean A062 = r4.A06();
        LocationSharingService.A03(this.A18.A00, this.A1H, r4, this.A1W);
        if (A062) {
            this.A0K.setVisibility(0);
            this.A0H.setVisibility(8);
            if (this.A0i) {
                this.A0n.setVisibility(8);
                this.A0r.setVisibility(8);
                this.A0o.setVisibility(8);
                if (this.A0D == null) {
                    this.A0p.setVisibility(0);
                }
            } else {
                this.A0r.setVisibility(0);
                boolean z2 = this.A0d;
                View view = this.A0o;
                if (z2) {
                    view.setVisibility(0);
                    this.A0n.setVisibility(8);
                } else {
                    view.setVisibility(8);
                    this.A0n.setVisibility(0);
                }
                if (this.A0D == null) {
                    this.A0p.setVisibility(8);
                }
            }
            View findViewById = this.A0P.findViewById(2131433777);
            if (findViewById != null) {
                findViewById.setVisibility(4);
                this.A02 = (int) (((double) this.A0F.getMeasuredHeight()) * 0.66d);
                ViewGroup.LayoutParams layoutParams = this.A0H.getLayoutParams();
                int i = this.A02;
                layoutParams.height = i;
                A0E(this, (Float) null, i, false);
            }
            A0X(f, z);
            return;
        }
        this.A0n.setVisibility(8);
        this.A0o.setVisibility(8);
        this.A0r.setVisibility(8);
        this.A0K.setVisibility(8);
        if (this.A0D == null) {
            this.A0p.setVisibility(8);
        }
        C19830z4 r0 = this.A1A;
        r0.A24(true);
        C17880vN.A1F(C19830z4.A00(r0), "nearby_location_new_user", true);
        View findViewById2 = this.A0P.findViewById(2131433777);
        this.A0B.setVisibility(8);
        boolean z3 = this.A0e;
        ImageView imageView = this.A0J;
        if (z3) {
            imageView.setImageResource(2131231144);
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
                if (findViewById2.getMeasuredHeight() > 0) {
                    A0E(this, f, findViewById2.getMeasuredHeight(), z);
                } else {
                    findViewById2.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass790(f, findViewById2, this, 1));
                }
            }
            this.A0H.setVisibility(8);
            return;
        }
        imageView.setImageResource(2131231145);
        this.A0H.setVisibility(0);
        if (findViewById2 != null) {
            findViewById2.setVisibility(4);
            if (this.A02 > 0) {
                ViewGroup.LayoutParams layoutParams2 = this.A0H.getLayoutParams();
                int i2 = this.A02;
                layoutParams2.height = i2;
                A0E(this, f, i2, z);
            }
        }
    }

    public void A0Z(Object obj) {
        Iterator it = this.A0V.A0D.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            PlaceInfo placeInfo = (PlaceInfo) it.next();
            if (obj.equals(placeInfo.A0D)) {
                this.A0U = placeInfo;
                break;
            }
        }
        A03();
    }

    public void A0a(String str, Object obj) {
        if (str != null) {
            for (PlaceInfo placeInfo : this.A0V.A0D) {
                if (obj.equals(placeInfo.A0D)) {
                    A0D(this, placeInfo);
                    return;
                }
            }
        }
    }

    public void A0X(Float f, boolean z) {
        int i;
        View view;
        int height;
        if (A0d()) {
            if (this.A0i) {
                if (AnonymousClass000.A1P(this.A0W.A08.getVisibility())) {
                    this.A0W.A02(true);
                }
                this.A0e = false;
                this.A0J.setVisibility(8);
                this.A0r.setVisibility(8);
            } else {
                C219217x r4 = this.A19;
                if (r4.A06()) {
                    Boolean bool = C17970vW.A03;
                    A0O();
                }
                A0L();
                A0N();
                this.A0J.setVisibility(0);
                if (this.A0e) {
                    this.A0J.setImageResource(2131231144);
                    AnonymousClass3MY.A0w(this.A0P, this.A0J, 2131896141);
                    if (this.A0d) {
                        ImageView A0H2 = AnonymousClass3MW.A0H(this.A0L, 2131435162);
                        if (A0H2 != null) {
                            A0H2.setImageResource(2131232063);
                        }
                        TextView A0E2 = C17880vN.A0E(this.A0L, 2131435163);
                        if (A0E2 != null) {
                            A0E2.setText(2131895740);
                        }
                    }
                    TextView A0L2 = AnonymousClass3MX.A0L(this.A0P, 2131432190);
                    Integer num = this.A0X;
                    if ((num == AnonymousClass00R.A01 || num == AnonymousClass00R.A0C) && A0L2 != null) {
                        A0L2.setText(2131895637);
                    }
                    A0P();
                    this.A0O.setVisibility(8);
                    View view2 = this.A07;
                    View view3 = this.A0r;
                    if (view2 != null) {
                        view3.setVisibility(0);
                        this.A0L.setAdapter((ListAdapter) null);
                        this.A0L.setOnScrollListener((AbsListView.OnScrollListener) null);
                        if (this.A0d) {
                            height = AnonymousClass3MW.A02(this.A0o, AnonymousClass3MW.A02(this.A0L.findViewById(2131435161), this.A0L.findViewById(2131432935).getHeight()));
                        } else {
                            height = this.A0n.getHeight();
                        }
                        AnonymousClass3MX.A1F(this.A0q, height);
                        A0E(this, f, height, true);
                    } else {
                        view3.setVisibility(8);
                    }
                    PlaceInfo placeInfo = this.A0U;
                    if ((placeInfo == null || placeInfo.A0D == null) && (!AnonymousClass000.A1P(this.A0W.A08.getVisibility()) || !AnonymousClass1L4.A00(this.A0I))) {
                        this.A0B.setVisibility(0);
                        this.A0P.invalidateOptionsMenu();
                    }
                    view = this.A0B;
                    view.setVisibility(8);
                    this.A0P.invalidateOptionsMenu();
                }
                if (this.A0d) {
                    ImageView A0H3 = AnonymousClass3MW.A0H(this.A0L, 2131435162);
                    if (A0H3 != null) {
                        A0H3.setImageResource(2131231154);
                    }
                    TextView A0E3 = C17880vN.A0E(this.A0L, 2131435163);
                    if (A0E3 != null) {
                        A0E3.setText(2131895742);
                    }
                    A0A(this);
                }
                TextView A0L3 = AnonymousClass3MX.A0L(this.A0P, 2131432190);
                if (A0L3 != null) {
                    Integer num2 = this.A0X;
                    if (num2 == AnonymousClass00R.A01) {
                        i = 2131895639;
                    } else if (num2 == AnonymousClass00R.A0C) {
                        i = 2131895637;
                    }
                    A0L3.setText(i);
                }
                this.A0J.setImageResource(2131231145);
                AnonymousClass3MY.A0w(this.A0P, this.A0J, 2131891217);
                A0M();
                boolean A062 = r4.A06();
                View view4 = this.A0r;
                if (A062) {
                    view4.setVisibility(0);
                } else {
                    view4.setVisibility(8);
                }
                A09(this);
                if (this.A07 != null) {
                    int i2 = this.A03;
                    if (AnonymousClass1L4.A00(this.A0I)) {
                        i2 /= 2;
                    }
                    AnonymousClass3MX.A1F(this.A0q, i2);
                    if (r4.A06()) {
                        A0E(this, f, i2, z);
                    }
                    this.A0L.setAdapter(this.A0u);
                    A03();
                }
            }
            this.A0B.setVisibility(8);
            view = this.A08;
            view.setVisibility(8);
            this.A0P.invalidateOptionsMenu();
        }
    }

    public boolean A0e(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 2131432620) {
            this.A0P.onSearchRequested();
            return true;
        } else if (itemId == 1) {
            this.A0c = false;
            A04(A0H(), this, (String) null, A0G(), false);
            return true;
        } else if (itemId != 16908332) {
            return false;
        } else {
            if (this.A0i) {
                this.A0S.A05.dismiss();
                A07(this);
                return true;
            }
            this.A0P.finish();
            return true;
        }
    }

    public AnonymousClass75M(C19880zA r3, AnonymousClass1L9 r4, AnonymousClass195 r5, AnonymousClass190 r6, AnonymousClass1RB r7, AnonymousClass1KB r8, AnonymousClass11S r9, AnonymousClass181 r10, C33251iW r11, AnonymousClass1VW r12, AnonymousClass1PM r13, C25491Ok r14, C27191Vc r15, C88184Yq r16, AnonymousClass11C r17, AnonymousClass11P r18, AnonymousClass118 r19, C219217x r20, C19830z4 r21, C18000vb r22, AnonymousClass1CJ r23, AnonymousClass1L2 r24, A59 a59, C1193267r r26, AnonymousClass1KW r27, EmojiSearchProvider emojiSearchProvider, C18030ve r29, AnonymousClass1D9 r30, AnonymousClass1LU r31, C27131Uv r32, AnonymousClass689 r33, C198679yj r34, WhatsAppLibLoader whatsAppLibLoader, C18010vc r36, AnonymousClass1W6 r37, AnonymousClass129 r38, AnonymousClass1L4 r39, AnonymousClass10I r40) {
        this.A18 = r19;
        this.A17 = r18;
        this.A1B = r29;
        this.A11 = r8;
        this.A1Z = r39;
        this.A1I = r6;
        this.A1J = r9;
        this.A1V = r31;
        this.A1a = r40;
        this.A1O = r23;
        this.A1K = r10;
        this.A1S = r27;
        this.A12 = r11;
        this.A1R = r26;
        this.A1U = r30;
        this.A0z = r4;
        this.A1C = r33;
        this.A1L = r12;
        this.A1G = r38;
        this.A16 = r17;
        this.A1N = r22;
        this.A1F = r37;
        this.A14 = r14;
        this.A1E = r34;
        this.A1X = whatsAppLibLoader;
        this.A1T = emojiSearchProvider;
        this.A13 = r13;
        this.A19 = r20;
        this.A1A = r21;
        this.A10 = r7;
        this.A1W = r32;
        this.A1Y = r36;
        this.A1H = r5;
        this.A1M = r15;
        this.A1Q = a59;
        this.A1P = r24;
        this.A15 = r16;
        this.A0y = r3;
    }
}
