package X;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.view.Display;
import android.view.SurfaceHolder;

public final class Bq5 extends Bq6 implements SurfaceHolder.Callback {
    public int A00;
    public int A01;
    public Camera A02;
    public boolean A03;
    public final SurfaceHolder A04;

    public static /* synthetic */ void getDisplayOrientation$annotations() {
    }

    public void CFx() {
        SurfaceHolder surfaceHolder = this.A04;
        Handler handler = this.A09;
        handler.getClass();
        handler.post(new AnonymousClass7RL(this, surfaceHolder, 18));
    }

    public Bq5(Context context) {
        super(context);
        A0B();
        SurfaceHolder holder = getHolder();
        C18070vi.A0X(holder);
        this.A04 = holder;
        holder.addCallback(this);
    }

    public final int getDisplayOrientation() {
        Display defaultDisplay = AnonymousClass11C.A01(getContext()).getDefaultDisplay();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.A00, cameraInfo);
        int rotation = defaultDisplay.getRotation();
        int i = 0;
        boolean A1T = AnonymousClass000.A1T(cameraInfo.facing, 1);
        int i2 = cameraInfo.orientation;
        if (rotation != 0) {
            if (rotation == 1) {
                i = 90;
            } else if (rotation == 2) {
                i = 180;
            } else if (rotation == 3) {
                i = 270;
            }
        }
        int i3 = (i2 - i) + 360;
        if (A1T) {
            i3 = 360 - ((i2 + i) % 360);
        }
        int i4 = i3 % 360;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("bloks_camera/startpreview display:");
        A10.append(i);
        A10.append(" camera:");
        A10.append(i2);
        A10.append(" preview:");
        A10.append(i4);
        C17900vP.A0n(" front:", A10, A1T);
        return i4;
    }
}
