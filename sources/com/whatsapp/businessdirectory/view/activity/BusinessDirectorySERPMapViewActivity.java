package com.whatsapp.businessdirectory.view.activity;

import X.A36;
import X.A5P;
import X.A6I;
import X.AEQ;
import X.AFN;
import X.AGB;
import X.AIA;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1D6;
import X.AnonymousClass1K1;
import X.AnonymousClass2CT;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass689;
import X.AnonymousClass745;
import X.AnonymousClass8BR;
import X.AnonymousClass8BS;
import X.AnonymousClass8FG;
import X.AnonymousClass8I9;
import X.AnonymousClass8KV;
import X.AnonymousClass9VF;
import X.BAZ;
import X.BIS;
import X.C000200d;
import X.C108955ca;
import X.C113705na;
import X.C129976ig;
import X.C137116uw;
import X.C137506vZ;
import X.C169258kf;
import X.C173738ve;
import X.C173768vh;
import X.C17880vN;
import X.C17960vV;
import X.C18070vi;
import X.C197559wt;
import X.C20079A6f;
import X.C20269AEc;
import X.C20272AEf;
import X.C219217x;
import X.C24000Bth;
import X.C25007CTh;
import X.C28281Zt;
import X.C37961qT;
import X.C38251qy;
import X.C63662tU;
import X.C63932tv;
import X.C72453Mb;
import X.D44;
import X.D5O;
import X.DAE;
import android.app.ActionBar;
import android.content.Intent;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.os.Bundle;
import android.transition.ChangeBounds;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.Set;

public final class BusinessDirectorySERPMapViewActivity extends C169258kf implements BAZ {
    public ImageView A00;
    public RecyclerView A01;
    public RecyclerView A02;
    public DAE A03;
    public AnonymousClass9VF A04;
    public A6I A05;
    public C173768vh A06;
    public AnonymousClass2CT A07;
    public C129976ig A08;
    public A5P A09;
    public C24000Bth A0A;
    public boolean A0B;
    public final C113705na A0C;

    public void Bmp() {
    }

    public void Bym(Set set) {
        C18070vi.A0d(set, 0);
        AnonymousClass8FG A4b = A4b();
        A36 a36 = A4b.A0N;
        a36.A01 = set;
        A4b.A0J.A03((Boolean) null, A4b.A0L.A04(), a36.A06(), 75);
        AnonymousClass8FG.A05(A4b);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        if (menu.findItem(1) == null) {
            menu.add(0, 4, 1, getString(2131887029));
            MenuItem icon = menu.add(0, 1, 0, getString(2131899369)).setIcon(2131232271);
            C18070vi.A0X(icon);
            icon.setShowAsAction(2);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onSaveInstanceState(Bundle bundle) {
        C18070vi.A0d(bundle, 0);
        if (this.A04 != null) {
            AnonymousClass8FG A4b = A4b();
            A4b.A0H.A04("arg_should_animate_on_gps_change", Boolean.valueOf(A4b.A0D));
        }
        C24000Bth bth = this.A0A;
        if (bth == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        }
        bth.A0G(bundle);
        super.onSaveInstanceState(bundle);
    }

    public static final boolean A03(BusinessDirectorySERPMapViewActivity businessDirectorySERPMapViewActivity) {
        Object systemService = businessDirectorySERPMapViewActivity.getSystemService("location");
        C18070vi.A0z(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        C219217x r0 = businessDirectorySERPMapViewActivity.A05;
        if (r0 == null) {
            C18070vi.A11("waPermissionsHelper");
            throw null;
        } else if (!r0.A06() || !locationManager.isProviderEnabled("gps")) {
            return false;
        } else {
            return true;
        }
    }

    public void A2y() {
        if (!this.A0B) {
            this.A0B = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r3 = A002.AAQ;
            C63932tv.A02(r3, this);
            AnonymousClass10G r2 = r3.A00;
            C63932tv.A01(r3, r2, this);
            C63662tU.A00(r3, r2, this, r2.A5A);
            this.A02 = (C173738ve) r2.A0f.get();
            this.A08 = C000200d.A00(r2.A1W);
            this.A03 = AnonymousClass1K1.A0Y(A002);
            this.A09 = C000200d.A00(A002.A0y);
            this.A07 = (AnonymousClass689) r3.A5q.get();
            this.A06 = AnonymousClass3MY.A0Z(r3);
            this.A05 = AnonymousClass3Ma.A0b(r3);
            this.A05 = AnonymousClass1K1.A0M(A002);
            this.A08 = AnonymousClass1K1.A0X(A002);
            this.A07 = AnonymousClass1K1.A0S(A002);
            this.A06 = AnonymousClass1K1.A0Q(A002);
            this.A04 = (AnonymousClass9VF) A002.A3n.get();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.A04 != null) {
            if (i == 34) {
                if (i2 == -1) {
                    this.A0B = true;
                    C173738ve r0 = this.A02;
                    if (r0 != null) {
                        r0.A02(true);
                        A4c(false);
                    } else {
                        C18070vi.A11("businessDirectorySharedPrefs");
                        throw null;
                    }
                } else if (i2 == 0) {
                    A4b();
                }
                DAE dae = this.A03;
                if (dae != null) {
                    dae.A0D(A03(this));
                }
            } else if (i == 35) {
                LocationManager A0C2 = this.A08.A0C();
                boolean z = false;
                if (A0C2 != null && (A0C2.isProviderEnabled("gps") || A0C2.isProviderEnabled("network"))) {
                    z = true;
                }
                AnonymousClass8FG A4b = A4b();
                if (z) {
                    AnonymousClass3MX.A1J(A4b.A0W, 0);
                }
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.A04 != null) {
            AnonymousClass8FG A4b = A4b();
            A5P a5p = A4b.A08;
            AnonymousClass1D6 r1 = a5p.A06;
            if (r1 == null || r1.first == null) {
                A4b.A0J.A08(A4b.A0L.A04(), C17880vN.A0i(), (Map) null, 11, 72, 1);
                AnonymousClass3MX.A1J(A4b.A0W, 9);
                return;
            }
            AnonymousClass8KV r0 = (AnonymousClass8KV) r1.second;
            if (r0 != null) {
                r0.A0A();
            }
            a5p.A06 = null;
            AnonymousClass3MX.A1J(A4b.A0W, 12);
            A4b.A0J.A08(A4b.A0L.A04(), C108955ca.A0g(), (Map) null, 11, 72, 1);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        float f;
        if (AnonymousClass745.A00) {
            ChangeBounds changeBounds = new ChangeBounds();
            changeBounds.setDuration(300);
            changeBounds.setInterpolator(new D5O());
            changeBounds.excludeTarget(16908335, true);
            changeBounds.excludeTarget(16908336, true);
            changeBounds.excludeTarget(2131427474, true);
            Window window = getWindow();
            window.requestFeature(12);
            window.requestFeature(13);
            window.setSharedElementEnterTransition(changeBounds);
            window.setSharedElementExitTransition(changeBounds);
        }
        super.onCreate(bundle);
        AEQ aeq = (AEQ) AnonymousClass8BS.A05(this, 2131624046).getParcelableExtra("arg_parent_category");
        String str3 = null;
        if (aeq != null) {
            str = aeq.A01;
        } else {
            str = null;
        }
        setTitle(str);
        Toolbar A0G = AnonymousClass3Ma.A0G(this);
        CharSequence title = getTitle();
        if (title != null) {
            str3 = title.toString();
        }
        C17960vV.A07(str3);
        C137506vZ.A01(A0G, this.A00, str3);
        setSupportActionBar(A0G);
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        ActionBar actionBar2 = getActionBar();
        if (actionBar2 != null) {
            actionBar2.setDisplayShowHomeEnabled(true);
        }
        A0G.setNavigationOnClickListener(new AFN(this, 13));
        ImageView A0C2 = AnonymousClass3Ma.A0C(this.A00, 2131432893);
        AFN.A00(A0C2, this, 10);
        this.A00 = A0C2;
        C20079A6f A012 = C20079A6f.A01(getIntent().getStringExtra("arg_search_location"));
        if (A012 != null && C18070vi.A18(A012.A08, "device") && A03(this)) {
            ImageView imageView = this.A00;
            if (imageView == null) {
                str2 = "myLocationBtn";
                C18070vi.A11(str2);
                throw null;
            }
            imageView.setImageResource(2131232131);
        }
        RecyclerView recyclerView = (RecyclerView) C18070vi.A05(this.A00, 2131430850);
        AnonymousClass2CT r0 = this.A07;
        if (r0 != null) {
            recyclerView.setAdapter(r0);
            this.A01 = recyclerView;
            AnonymousClass3Ma.A15(this, recyclerView);
            this.A00 = (ViewGroup) C18070vi.A05(this.A00, 2131434183);
            RecyclerView recyclerView2 = (RecyclerView) C18070vi.A05(this.A00, 2131428552);
            C173768vh r02 = this.A06;
            if (r02 != null) {
                recyclerView2.setAdapter(r02);
                this.A02 = recyclerView2;
                C38251qy layoutManager = recyclerView2.getLayoutManager();
                C18070vi.A0z(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                RecyclerView recyclerView3 = this.A02;
                if (recyclerView3 == null) {
                    C18070vi.A11("horizontalBusinessListView");
                    throw null;
                }
                recyclerView3.setClipToPadding(false);
                linearLayoutManager.A08 = true;
                RecyclerView recyclerView4 = this.A02;
                if (recyclerView4 == null) {
                    C18070vi.A11("horizontalBusinessListView");
                    throw null;
                }
                recyclerView4.setItemAnimator((C37961qT) null);
                C113705na r1 = this.A0C;
                RecyclerView recyclerView5 = this.A02;
                if (recyclerView5 == null) {
                    C18070vi.A11("horizontalBusinessListView");
                    throw null;
                }
                r1.A08(recyclerView5);
                RecyclerView recyclerView6 = this.A02;
                if (recyclerView6 == null) {
                    C18070vi.A11("horizontalBusinessListView");
                    throw null;
                }
                recyclerView6.A0t(new AnonymousClass8I9(linearLayoutManager, this));
                CardView cardView = (CardView) C18070vi.A05(this.A00, 2131432286);
                this.A01 = cardView;
                if (cardView == null) {
                    str2 = "mapViewChip";
                } else {
                    AFN.A00(cardView, this, 15);
                    AnonymousClass689 r03 = this.A07;
                    if (r03 != null) {
                        r03.A04(this);
                        C20272AEf aEf = (C20272AEf) getIntent().getParcelableExtra("arg_map_view_config");
                        if (aEf != null) {
                            f = aEf.A01;
                        } else {
                            f = 16.0f;
                        }
                        C20079A6f A013 = C20079A6f.A01(C108955ca.A0r(this, "arg_search_location"));
                        double d = BIS.A0n;
                        C17960vV.A07(A013);
                        C18070vi.A0X(A013);
                        C25007CTh cTh = new C25007CTh();
                        cTh.A00 = 8;
                        cTh.A08 = true;
                        cTh.A05 = false;
                        cTh.A06 = C28281Zt.A0B(this);
                        cTh.A04 = "whatsapp_smb_business_discovery";
                        Double d2 = A013.A03;
                        C18070vi.A0b(d2);
                        double doubleValue = d2.doubleValue();
                        Double d3 = A013.A04;
                        C18070vi.A0b(d3);
                        cTh.A02 = new D44(new C20269AEc(doubleValue, d3.doubleValue()), f, 90.0f, 0.0f);
                        this.A0A = new C24000Bth(this, cTh);
                        ViewGroup A0C3 = AnonymousClass3MW.A0C(this.A00, 2131432287);
                        C24000Bth bth = this.A0A;
                        if (bth != null) {
                            bth.A0F(bundle);
                            C24000Bth bth2 = this.A0A;
                            if (bth2 != null) {
                                A0C3.addView(bth2);
                                if (this.A03 == null) {
                                    C24000Bth bth3 = this.A0A;
                                    if (bth3 == null) {
                                        C18070vi.A11("facebookMapView");
                                        throw null;
                                    } else {
                                        bth3.A0J(new AIA(bundle, this, 0));
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            }
                        }
                        C18070vi.A11("facebookMapView");
                    } else {
                        C18070vi.A11("locationUtils");
                    }
                    throw null;
                }
            } else {
                str2 = "horizontalBusinessListAdapter";
            }
        } else {
            str2 = "filterBarListAdapter";
        }
        C18070vi.A11(str2);
        throw null;
    }

    public void onDestroy() {
        if (this.A0A == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        }
        double d = BIS.A0n;
        C197559wt.A03 = null;
        C197559wt.A00 = null;
        C197559wt.A02 = null;
        C197559wt.A04 = null;
        C197559wt.A05 = null;
        C197559wt.A06 = null;
        C197559wt.A01 = null;
        super.onDestroy();
    }

    public BusinessDirectorySERPMapViewActivity(int i) {
        this.A0B = false;
        AGB.A00(this, 31);
    }

    public void onLowMemory() {
        super.onLowMemory();
        C24000Bth bth = this.A0A;
        if (bth == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        } else {
            bth.A0C();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) == 1) {
            AnonymousClass8FG A4b = A4b();
            A4b.A0J.A08(A4b.A0L.A04(), 1, (Map) null, 11, 62, 1);
            Intent A072 = AnonymousClass8BR.A07(this, BusinessDirectoryActivity.class);
            A072.putExtra("arg_launch_consumer_home", true);
            A072.setFlags(67108864);
            startActivity(A072);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onPause() {
        super.onPause();
        C24000Bth bth = this.A0A;
        if (bth == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        }
        double d = BIS.A0n;
        SensorManager sensorManager = bth.A04;
        if (sensorManager != null) {
            sensorManager.unregisterListener(bth.A0E);
        }
    }

    public void onResume() {
        super.onResume();
        C24000Bth bth = this.A0A;
        if (bth == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        }
        double d = BIS.A0n;
        bth.A0K();
        DAE dae = this.A03;
        if (dae != null) {
            dae.A0D(A03(this));
        }
    }

    public void onStart() {
        super.onStart();
        if (this.A0A == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        } else {
            double d = BIS.A0n;
        }
    }

    public void onStop() {
        super.onStop();
        if (this.A0A == null) {
            C18070vi.A11("facebookMapView");
            throw null;
        } else {
            double d = BIS.A0n;
        }
    }

    public BusinessDirectorySERPMapViewActivity() {
        this(0);
        this.A0C = new C113705na();
    }
}
