package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.whatsapp.camera.CameraBottomSheetBehavior;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.77p  reason: invalid class name and case insensitive filesystem */
public class C1419577p implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    public float A00 = 1.0f;
    public final ScaleGestureDetector A01;
    public final CIZ A02;
    public final C1599086i A03;
    public final boolean A04;

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public void onLongPress(MotionEvent motionEvent) {
    }

    public void onShowPress(MotionEvent motionEvent) {
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C1599086i r1 = this.A03;
        motionEvent.getX();
        motionEvent.getY();
        AnonymousClass7DV r12 = (AnonymousClass7DV) r1;
        if (r12.A00 != 0) {
            AnonymousClass74G.A02((AnonymousClass74G) r12.A01);
            return true;
        }
        AnonymousClass7DY r4 = (AnonymousClass7DY) r12.A01;
        r4.A1L.A02((Integer) null, 12, AnonymousClass7DY.A01(r4));
        AnonymousClass7DY.A0L(r4);
        AnonymousClass7DY.A0H(r4);
        return true;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        String str;
        if (!this.A04) {
            return false;
        }
        if (Math.abs(f) > Math.abs(f2)) {
            AnonymousClass7DV r1 = (AnonymousClass7DV) this.A03;
            if (r1.A00 != 0) {
                return true;
            }
            AnonymousClass7DY r12 = (AnonymousClass7DY) r1.A01;
            C160978Av r0 = r12.A0K;
            if (r0 != null) {
                if (r0.isRecording()) {
                    return true;
                }
                AnonymousClass741 r02 = r12.A0M;
                if (r02 == null) {
                    str = "cameraActionsController";
                } else if (r02.A0B || r12.A0f) {
                    return true;
                } else {
                    C133936pk r03 = r12.A0Q;
                    if (r03 == null) {
                        str = "cameraModeTabController";
                    } else {
                        r03.A02.getFlingListener().A00(f);
                        C1605288v r04 = r12.A0R;
                        if (r04 == null) {
                            return true;
                        }
                        r04.Buj(f);
                        return true;
                    }
                }
            }
            str = "camera";
        } else {
            int i = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            C1599086i r13 = this.A03;
            if (i < 0) {
                AnonymousClass7DV r14 = (AnonymousClass7DV) r13;
                if (r14.A00 != 0) {
                    return true;
                }
                AnonymousClass7DY r3 = (AnonymousClass7DY) r14.A01;
                C131506lD r2 = r3.A16;
                C136596u4 r15 = r3.A15;
                if ((!r2.A00(r15.A00)) || r3.A0f) {
                    return true;
                }
                C160978Av r05 = r3.A0K;
                if (r05 != null) {
                    if (r05.isRecording()) {
                        return true;
                    }
                    if (r15.A01 == 1) {
                        AnonymousClass701 r22 = r3.A0P;
                        if (r22 == null) {
                            str = "cameraBottomSheetController";
                        } else {
                            CameraBottomSheetBehavior cameraBottomSheetBehavior = r22.A0C;
                            cameraBottomSheetBehavior.A0W(3);
                            cameraBottomSheetBehavior.A00 = true;
                            r22.A06.setVisibility(0);
                            r22.A01();
                            return true;
                        }
                    } else {
                        AnonymousClass7DY.A0I(r3);
                        return true;
                    }
                }
                str = "camera";
            } else {
                r13.Buk();
                return true;
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        AnonymousClass7DV r1 = (AnonymousClass7DV) this.A03;
        if (r1.A00 != 0) {
            return true;
        }
        AnonymousClass7DY r12 = (AnonymousClass7DY) r1.A01;
        if (!C108945cZ.A1U(r12.A15.A09)) {
            AnonymousClass7DY.A0Z(r12, false, false);
        }
        AnonymousClass741 r4 = r12.A0M;
        if (r4 == null) {
            C18070vi.A11("cameraActionsController");
            throw null;
        }
        C28931bI r3 = r4.A0R;
        boolean z = false;
        if (r3.A00 != null) {
            z = true;
        }
        if (!z) {
            r3.A04(0);
            WDSButton wDSButton = r4.A09;
            if (wDSButton != null) {
                wDSButton.setEnabled(true);
            }
        }
        if (!r4.A0M.isRecording()) {
            r4.A0B = true;
            C1407172r r0 = r4.A07;
            if (r0 == null) {
                return true;
            }
            C1407172r.A01(r0);
            WDSButton wDSButton2 = r0.A01;
            if (wDSButton2 == null) {
                return true;
            }
            wDSButton2.invalidate();
            wDSButton2.removeCallbacks(r0.A02);
            return true;
        }
        r4.A0B = false;
        C72453Mb.A1D(r4.A03);
        return true;
    }

    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        WDSButton wDSButton;
        String str;
        AnonymousClass7DV r1 = (AnonymousClass7DV) this.A03;
        if (r1.A00 == 0) {
            AnonymousClass7DY r2 = (AnonymousClass7DY) r1.A01;
            C160978Av r0 = r2.A0K;
            if (r0 == null) {
                str = "camera";
            } else {
                if (!r0.isRecording()) {
                    AnonymousClass7DY.A0Z(r2, !r2.A0f, true);
                }
                AnonymousClass741 r12 = r2.A0M;
                if (r12 == null) {
                    str = "cameraActionsController";
                } else {
                    r12.A0B = false;
                    C1407172r r13 = r12.A07;
                    if (r13 != null && !r13.A03() && (wDSButton = r13.A01) != null) {
                        wDSButton.invalidate();
                        wDSButton.postDelayed(r13.A02, 2000);
                        return;
                    }
                    return;
                }
            }
            C18070vi.A11(str);
            throw null;
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.A04) {
            return false;
        }
        if (f2 < -30.0f) {
            this.A03.Buk();
        }
        return true;
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C1599086i r1 = this.A03;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        AnonymousClass7DV r12 = (AnonymousClass7DV) r1;
        if (r12.A00 != 0) {
            ((AnonymousClass74G) r12.A01).A04.BLS(x, y);
            return true;
        }
        AnonymousClass7DY r2 = (AnonymousClass7DY) r12.A01;
        C160978Av r0 = r2.A0K;
        if (r0 != null) {
            r0.BLS(x, y);
            C160978Av r02 = r2.A0K;
            if (r02 != null) {
                r02.BEu();
                AnonymousClass7DY.A0H(r2);
                return true;
            }
        }
        C18070vi.A11("camera");
        throw null;
    }

    public C1419577p(Context context, C1599086i r3, boolean z) {
        this.A02 = C108965cb.A0C(context, this);
        this.A01 = new ScaleGestureDetector(context, this);
        this.A04 = z;
        this.A03 = r3;
    }

    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        C1407172r r2;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float f = this.A00 * scaleFactor * scaleFactor;
        this.A00 = f;
        if (f < 1.0f) {
            this.A00 = 1.0f;
            f = 1.0f;
        }
        AnonymousClass7DV r1 = (AnonymousClass7DV) this.A03;
        if (r1.A00 != 0) {
            return true;
        }
        AnonymousClass741 r4 = ((AnonymousClass7DY) r1.A01).A0M;
        if (r4 == null) {
            C18070vi.A11("cameraActionsController");
            throw null;
        }
        float min = Math.min(f, 6.0f);
        C160978Av r22 = r4.A0M;
        int CLV = r22.CLV(C22339B3q.A01((((float) r22.getMaxZoom()) * (min - 1.0f)) / 5.0f));
        if (r22.isRecording() || (r2 = r4.A07) == null) {
            return true;
        }
        float f2 = ((float) CLV) / 100.0f;
        C1407172r.A01(r2);
        r2.A00 = f2;
        C1407172r.A02(r2, C1407172r.A00(r2, f2));
        return true;
    }
}
