package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.whatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.location.LocationPicker2;

/* renamed from: X.Bti  reason: case insensitive filesystem */
public abstract class C24001Bti extends Bi5 {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public long A04;
    public SensorManager A05;
    public Location A06;
    public Display A07;
    public C25284Ccm A08;
    public AnonymousClass11C A09;
    public AnonymousClass11P A0A;
    public boolean A0B;
    public boolean A0C;
    public final SensorEventListener A0D;
    public final E2G A0E;
    public final float[] A0F;
    public final float[] A0G;
    public final float[] A0H;

    public void A0A(int i) {
        ImageView imageView;
        int i2;
        LocationPicker2 locationPicker2;
        ImageView imageView2;
        int i3;
        C23998Btf btf = (C23998Btf) this;
        if (btf.A00 != 0) {
            if (i != 0) {
                locationPicker2 = (LocationPicker2) btf.A01;
                imageView2 = locationPicker2.A0V.A0K;
                if (i != 1) {
                    i3 = 2131231146;
                } else {
                    imageView2.setImageResource(2131231147);
                    locationPicker2.A0V.A0h = true;
                    return;
                }
            } else {
                locationPicker2 = (LocationPicker2) btf.A01;
                imageView2 = locationPicker2.A0V.A0K;
                i3 = 2131231137;
            }
            imageView2.setImageResource(i3);
            locationPicker2.A0V.A0h = false;
            return;
        }
        int i4 = 8;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = (GroupChatLiveLocationsActivity2) btf.A01;
        if (i == 0) {
            C143087By r0 = groupChatLiveLocationsActivity2.A0O;
            r0.A0W = true;
            r0.A0U = true;
            View view = r0.A0C;
            if (r0.A0O == null) {
                i4 = 0;
            }
            view.setVisibility(i4);
            imageView = groupChatLiveLocationsActivity2.A04;
            i2 = 2131231137;
        } else if (i != 1) {
            groupChatLiveLocationsActivity2.A04.setImageResource(2131231146);
            groupChatLiveLocationsActivity2.A0O.A0U = false;
            return;
        } else {
            C143087By r02 = groupChatLiveLocationsActivity2.A0O;
            r02.A0W = true;
            r02.A0U = true;
            View view2 = r02.A0C;
            if (r02.A0O == null) {
                i4 = 0;
            }
            view2.setVisibility(i4);
            imageView = groupChatLiveLocationsActivity2.A04;
            i2 = 2131231147;
        }
        imageView.setImageResource(i2);
    }

    public static LatLng A00(LatLng latLng, double d) {
        return DJ0.A0E(latLng, d, 50.0d / 6378137.0d);
    }

    public void A09() {
        SensorManager sensorManager = this.A05;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0C = AnonymousClass000.A1W(defaultSensor);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0D, defaultSensor, 1);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A03 != 2) {
            this.A03 = 2;
            A0A(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A03;
    }

    public void setLocationMode(int i) {
        LatLng latLng;
        LatLng latLng2;
        int i2;
        C25284Ccm ccm = this.A08;
        if (ccm != null) {
            CameraPosition A022 = ccm.A02();
            if (i != 0) {
                if (i == 1) {
                    Location location = this.A06;
                    if (location != null) {
                        latLng2 = new LatLng(location.getLatitude(), this.A06.getLongitude());
                        this.A03 = 1;
                        i2 = 1;
                    } else {
                        latLng2 = A022.A03;
                        this.A03 = 2;
                        i2 = 2;
                    }
                    A0A(i2);
                    C18210vx.A02(latLng2, "location must not be null.");
                    ccm.A08(C26080Crv.A00(new CameraPosition(latLng2, A022.A02, 0.0f, 0.0f)));
                    return;
                } else if (i == 2) {
                    this.A03 = 2;
                    A0A(2);
                    return;
                } else {
                    return;
                }
            } else if (this.A0C) {
                this.A01 = A022.A02;
                i = 0;
                A0A(0);
                Location location2 = this.A06;
                if (location2 != null) {
                    latLng = new LatLng(location2.getLatitude(), this.A06.getLongitude());
                } else {
                    latLng = A022.A03;
                }
                ccm.A0A(C26080Crv.A00(DJ0.A0B(latLng, this)), this.A0E);
            } else {
                return;
            }
        }
        this.A03 = i;
    }

    public C24001Bti(Context context, GoogleMapOptions googleMapOptions) {
        super(context, googleMapOptions);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A0A = (AnonymousClass11P) A0O.AAv.get();
            this.A09 = (AnonymousClass11C) A0O.AAp.get();
        }
        this.A0G = new float[16];
        this.A0H = new float[3];
        this.A0F = new float[3];
        this.A03 = 2;
        this.A0E = new DKI(this, 0);
        this.A0D = new C26354CyG(this, 8);
        this.A05 = this.A09.A0A();
        this.A07 = this.A09.A0L().getDefaultDisplay();
        A07(new DKQ(this, 1));
    }

    public C25284Ccm A08(C28516E5a e5a) {
        C17960vV.A02();
        C25284Ccm ccm = this.A08;
        if (ccm != null) {
            e5a.Bxb(ccm);
            return this.A08;
        }
        A07(e5a);
        return null;
    }

    public void setMyLocation(Location location) {
        this.A06 = location;
    }
}
