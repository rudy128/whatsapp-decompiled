package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.Location;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import com.whatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.location.LocationPicker;

/* renamed from: X.Bth  reason: case insensitive filesystem */
public class C24000Bth extends BPV {
    public float A00;
    public float A01;
    public int A02;
    public long A03;
    public SensorManager A04;
    public Display A05;
    public DAE A06;
    public BPP A07;
    public C04 A08;
    public C36361nl A09;
    public AnonymousClass11C A0A;
    public AnonymousClass11P A0B;
    public C25600Cif A0C;
    public boolean A0D;
    public final SensorEventListener A0E;
    public final E46 A0F;
    public final float[] A0G;
    public final float[] A0H;
    public final float[] A0I;

    private void setupInfoButtonForFacebookMap(Context context) {
        A0H(new DAD(context, this, 0));
    }

    public void A0K() {
        SensorManager sensorManager = this.A04;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(11);
            this.A0D = AnonymousClass000.A1W(defaultSensor);
            if (defaultSensor != null) {
                sensorManager.registerListener(this.A0E, defaultSensor, 16000);
            }
        }
    }

    public void A0L(int i) {
        ImageView imageView;
        int i2;
        LocationPicker locationPicker;
        ImageView imageView2;
        int i3;
        if (this instanceof C23997Bte) {
            C23997Bte bte = (C23997Bte) this;
            if (bte.A00 != 0) {
                if (i != 0) {
                    locationPicker = (LocationPicker) bte.A01;
                    imageView2 = locationPicker.A0O.A0K;
                    if (i != 1) {
                        i3 = 2131231146;
                    } else {
                        imageView2.setImageResource(2131231147);
                        locationPicker.A0O.A0h = true;
                        return;
                    }
                } else {
                    locationPicker = (LocationPicker) bte.A01;
                    imageView2 = locationPicker.A0O.A0K;
                    i3 = 2131231137;
                }
                imageView2.setImageResource(i3);
                locationPicker.A0O.A0h = false;
                return;
            }
            int i4 = 8;
            GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = (GroupChatLiveLocationsActivity) bte.A01;
            if (i == 0) {
                C143087By r0 = groupChatLiveLocationsActivity.A0N;
                r0.A0W = true;
                r0.A0U = true;
                imageView = groupChatLiveLocationsActivity.A03;
                i2 = 2131231137;
            } else if (i != 1) {
                groupChatLiveLocationsActivity.A03.setImageResource(2131231146);
                groupChatLiveLocationsActivity.A0N.A0U = false;
                return;
            } else {
                C143087By r02 = groupChatLiveLocationsActivity.A0N;
                r02.A0W = true;
                r02.A0U = true;
                imageView = groupChatLiveLocationsActivity.A03;
                i2 = 2131231147;
            }
            imageView.setImageResource(i2);
            C143087By r03 = groupChatLiveLocationsActivity.A0N;
            View view = r03.A0C;
            if (r03.A0O == null) {
                i4 = 0;
            }
            view.setVisibility(i4);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A02 != 2) {
            this.A02 = 2;
            A0L(2);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getLocationMode() {
        return this.A02;
    }

    public Location getMyLocation() {
        DAE A0J = A0J(this.A0F);
        if (A0J == null || !A0J.A0M || A0J.A0G == null) {
            return null;
        }
        return A0J.A0U.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        if (r4 != null) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setLocationMode(int r7) {
        /*
            r6 = this;
            X.E46 r0 = r6.A0F
            X.DAE r5 = r6.A0J(r0)
            if (r5 != 0) goto L_0x000b
            r6.A02 = r7
        L_0x000a:
            return
        L_0x000b:
            X.D44 r3 = r5.A02()
            if (r7 == 0) goto L_0x001d
            r2 = 1
            r1 = 2
            if (r7 == r2) goto L_0x005c
            if (r7 != r1) goto L_0x000a
            r6.A02 = r1
            r6.A0L(r1)
            return
        L_0x001d:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L_0x000a
            float r0 = r3.A02
            r6.A01 = r0
            r0 = 0
            r6.A0L(r0)
            android.location.Location r0 = r6.getMyLocation()
            if (r0 == 0) goto L_0x0057
            X.AEc r4 = X.BEA.A0T(r0)
        L_0x0033:
            float r3 = r6.A00
            float r1 = r6.A01
            r0 = 1097859072(0x41700000, float:15.0)
            float r2 = java.lang.Math.max(r1, r0)
            r1 = 1
            X.D44 r0 = new X.D44
            r0.<init>(r4, r2, r1, r3)
            X.CXL r0 = X.C25306CdA.A00(r0)
            r5.A08(r0)
        L_0x004a:
            r0 = 43
            X.7Pj r2 = new X.7Pj
            r2.<init>(r6, r5, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            r6.postDelayed(r2, r0)
            return
        L_0x0057:
            X.AEc r4 = r3.A03
            if (r4 == 0) goto L_0x004a
            goto L_0x0033
        L_0x005c:
            android.location.Location r0 = r6.getMyLocation()
            if (r0 == 0) goto L_0x007d
            X.AEc r4 = X.BEA.A0T(r0)
            r6.A02 = r2
            r1 = 1
        L_0x0069:
            r6.A0L(r1)
            float r3 = r3.A02
            r2 = 1
            r1 = 0
            X.D44 r0 = new X.D44
            r0.<init>(r4, r3, r2, r1)
            X.CXL r0 = X.C25306CdA.A00(r0)
            r5.A08(r0)
            return
        L_0x007d:
            X.AEc r4 = r3.A03
            r6.A02 = r1
            goto L_0x0069
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24000Bth.setLocationMode(int):void");
    }

    public C24000Bth(Context context, C25007CTh cTh) {
        super(context, cTh);
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0O = AnonymousClass3MW.A0O(generatedComponent());
            this.A0B = (AnonymousClass11P) A0O.AAv.get();
            this.A09 = (C36361nl) A0O.A5h.get();
            this.A0A = (AnonymousClass11C) A0O.AAp.get();
        }
        this.A08 = C04.BOTTOM_RIGHT;
        this.A0H = new float[16];
        this.A0I = new float[3];
        this.A0G = new float[3];
        this.A02 = 2;
        this.A0F = new DAB(this, 1);
        this.A0E = new C26354CyG(this, 7);
        this.A08 = cTh.A01;
        this.A04 = this.A0A.A0A();
        Object A022 = AnonymousClass11C.A02(getContext(), "window");
        C17960vV.A07(A022);
        this.A05 = ((WindowManager) A022).getDefaultDisplay();
        setupInfoButtonForFacebookMap(getContext());
    }

    public DAE A0J(E46 e46) {
        C17960vV.A02();
        DAE dae = this.A06;
        if (dae != null) {
            e46.Bxa(dae);
            return this.A06;
        }
        A0H(e46);
        return null;
    }

    public void setInfoButtonPosition(C04 c04) {
        this.A08 = c04;
    }
}
