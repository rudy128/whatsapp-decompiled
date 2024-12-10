package X;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7Pn  reason: invalid class name and case insensitive filesystem */
public class C146547Pn implements Runnable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Object A03;

    public C146547Pn(Object obj, float f, float f2, int i) {
        this.A02 = i;
        this.A03 = obj;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void run() {
        switch (this.A02) {
            case 0:
                AnonymousClass7DY r6 = (AnonymousClass7DY) this.A03;
                float f = this.A00;
                float f2 = this.A01;
                C133796pV r3 = r6.A0S;
                if (r3 == null) {
                    C18070vi.A11("overlaysController");
                } else {
                    View view = r6.A0A;
                    if (view != null) {
                        float left = ((float) view.getLeft()) + f;
                        View view2 = r6.A0A;
                        if (view2 != null) {
                            r3.A00(left, ((float) view2.getTop()) + f2);
                            return;
                        }
                    }
                    C18070vi.A11("cameraView");
                }
                throw null;
            case 1:
                Bq6 bq6 = (Bq6) this.A03;
                float f3 = this.A00;
                float f4 = this.A01;
                synchronized (bq6) {
                    Camera camera = bq6.A07;
                    if (camera != null && bq6.A0M) {
                        camera.cancelAutoFocus();
                        Camera.Parameters parameters = bq6.A07.getParameters();
                        if (parameters.getMaxNumFocusAreas() > 0) {
                            float dimension = AnonymousClass000.A0Y(bq6).getDimension(2131165405) / 2.0f;
                            RectF rectF = new RectF(f3 - dimension, f4 - dimension, dimension + f3, dimension + f4);
                            Matrix A0J = C108945cZ.A0J();
                            float f5 = 1.0f;
                            if (bq6.A0N) {
                                f5 = -1.0f;
                            }
                            A0J.setScale(f5, 1.0f);
                            A0J.postRotate((float) bq6.A01);
                            float width = (float) bq6.getWidth();
                            float height = (float) bq6.getHeight();
                            A0J.postScale(width / 2000.0f, height / 2000.0f);
                            A0J.postTranslate(width / 2.0f, height / 2.0f);
                            A0J.invert(A0J);
                            A0J.mapRect(rectF);
                            Rect A07 = AnonymousClass3MW.A07();
                            int A002 = Bq6.A00(rectF.left);
                            A07.left = A002;
                            int A003 = Bq6.A00(rectF.top);
                            A07.top = A003;
                            int A004 = Bq6.A00(rectF.right);
                            A07.right = A004;
                            int A005 = Bq6.A00(rectF.bottom);
                            A07.bottom = A005;
                            if (C108945cZ.A05(A003, A005) < 10) {
                                A07.top = A003 - 5;
                                A07.bottom = A005 + 5;
                            }
                            if (C108945cZ.A05(A002, A004) < 10) {
                                A07.left = A002 - 5;
                                A07.right = A004 + 5;
                            }
                            ArrayList A13 = AnonymousClass000.A13();
                            A13.add(new Camera.Area(A07, 1000));
                            parameters.setFocusAreas(A13);
                            List<String> supportedFocusModes = parameters.getSupportedFocusModes();
                            if (supportedFocusModes != null && supportedFocusModes.contains("auto")) {
                                parameters.setFocusMode("auto");
                            }
                            bq6.A07.setParameters(parameters);
                            C28598E9p e9p = bq6.A0F;
                            e9p.getClass();
                            e9p.Blw(f3, f4);
                        }
                        bq6.A07.autoFocus(new AnonymousClass75J(bq6, 0));
                    }
                }
                return;
            default:
                float f6 = this.A00;
                float f7 = this.A01;
                AnonymousClass74G r32 = (AnonymousClass74G) ((AnonymousClass7DT) this.A03).A01;
                r32.A05.A00(((float) r32.A08.A01.getLeft()) + f6, ((float) r32.A08.A01.getTop()) + f7);
                return;
        }
    }
}
