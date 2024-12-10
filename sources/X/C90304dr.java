package X;

import android.graphics.Point;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.whatsapp.WaEditText;
import com.whatsapp.areffects.tray.ArEffectsTrayFragment;
import com.whatsapp.areffects.viewmodel.BaseArEffectsViewModel;
import com.whatsapp.calling.views.InCallDialPadView;
import java.util.List;
import java.util.Map;

/* renamed from: X.4dr  reason: invalid class name and case insensitive filesystem */
public class C90304dr implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C90304dr(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C106535Wf r0;
        C86764Sy r02;
        Integer num;
        switch (this.A00) {
            case 0:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                }
                return false;
            case 1:
                AnonymousClass4aN r4 = (AnonymousClass4aN) this.A01;
                Handler handler = (Handler) this.A02;
                int action = motionEvent.getAction();
                if (action == 0) {
                    C107845ai r03 = r4.A02;
                    if (r03 == null) {
                        return true;
                    }
                    r03.BmC();
                    handler.sendEmptyMessageDelayed(0, (long) AnonymousClass4aN.A0Y);
                    return true;
                } else if (action != 1 && action != 3) {
                    return false;
                } else {
                    handler.removeMessages(0);
                    return true;
                }
            case 2:
                AnonymousClass3ZF r2 = (AnonymousClass3ZF) this.A01;
                C106535Wf r42 = (C106535Wf) this.A02;
                List list = C42011xT.A0I;
                if (motionEvent == null) {
                    return false;
                }
                C84604Kd r04 = r2.A00;
                C18070vi.A0d(r42, 0);
                ArEffectsTrayFragment arEffectsTrayFragment = r04.A00;
                C18100vl r3 = arEffectsTrayFragment.A05;
                Map A12 = AnonymousClass3MW.A12(AnonymousClass3MX.A0Y(r3).A0J);
                C18100vl r1 = arEffectsTrayFragment.A04;
                AnonymousClass4S8 r05 = (AnonymousClass4S8) A12.get(r1.getValue());
                if (r05 == null || (r02 = (C86764Sy) r05.A01.getValue()) == null) {
                    r0 = null;
                } else {
                    r0 = r02.A00;
                }
                if (!C18070vi.A18(r0, r42)) {
                    return false;
                }
                BaseArEffectsViewModel A0Y = AnonymousClass3MX.A0Y(r3);
                AnonymousClass4DE r12 = (AnonymousClass4DE) r1.getValue();
                if (!(A0Y instanceof C75603ho)) {
                    return false;
                }
                C75603ho r22 = (C75603ho) A0Y;
                C18070vi.A0d(r12, 0);
                if (!C72463Mc.A1a(r22.A0G)) {
                    return false;
                }
                r22.A07.C5h(motionEvent);
                return false;
            case 3:
                InCallDialPadView inCallDialPadView = (InCallDialPadView) this.A01;
                Map.Entry entry = (Map.Entry) this.A02;
                int action2 = motionEvent.getAction();
                if (action2 == 0) {
                    view.performHapticFeedback(3);
                    int A0M = AnonymousClass000.A0M(entry.getValue());
                    AudioManager A0D = inCallDialPadView.getSystemServices().A0D();
                    if (A0D != null) {
                        num = Integer.valueOf(A0D.getRingerMode());
                    } else {
                        num = null;
                    }
                    Integer[] numArr = new Integer[2];
                    AnonymousClass3MX.A1R(numArr, 0);
                    if (C29431cG.A18(C18070vi.A0O(1, numArr, 1), num)) {
                        return false;
                    }
                    ((ToneGenerator) inCallDialPadView.A06.getValue()).startTone(A0M, -1);
                    return false;
                } else if (action2 != 1 && action2 != 3) {
                    return false;
                } else {
                    ((ToneGenerator) inCallDialPadView.A06.getValue()).stopTone();
                    return false;
                }
            case 4:
                C74863d2 r32 = (C74863d2) this.A01;
                if (motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1) {
                    return false;
                }
                Point A0E = C72483Me.A0E(motionEvent, view);
                WaEditText waEditText = r32.A05;
                if (waEditText.isShown() && AnonymousClass3RR.A01(A0E, waEditText) && waEditText.A0J(A0E)) {
                    r32.A0E();
                    return true;
                } else if (motionEvent.getY() < 0.0f) {
                    return true;
                } else {
                    return false;
                }
            case 5:
                return ((C108535br) this.A02).CAN((View) this.A01, motionEvent);
            case 6:
                return ((C108535br) this.A02).C2E(motionEvent);
            case 7:
                AnonymousClass3RQ r23 = (AnonymousClass3RQ) this.A01;
                View view2 = (View) this.A02;
                C18070vi.A0h(r23, view2);
                C18070vi.A0d(motionEvent, 3);
                if (motionEvent.getAction() != 0) {
                    return false;
                }
                float x = motionEvent.getX();
                C80053wT r43 = r23.A02;
                if (x >= ((float) r43.getLeft()) && motionEvent.getX() <= ((float) r43.getRight()) && motionEvent.getY() >= ((float) view2.getTop()) && motionEvent.getY() <= ((float) view2.getBottom())) {
                    return false;
                }
                r23.dismiss();
                return true;
            case 8:
                return ((C94334kS) this.A02).C2E(motionEvent);
            case 9:
                ViewGroup viewGroup = (ViewGroup) this.A02;
                ((CIZ) this.A01).A00.onTouchEvent(motionEvent);
                if ((motionEvent.getAction() & 255) != 1) {
                    return false;
                }
                viewGroup.requestDisallowInterceptTouchEvent(false);
                return false;
            case 10:
                AnonymousClass42j r24 = (AnonymousClass42j) this.A01;
                C96764oN r13 = (C96764oN) this.A02;
                List list2 = C42011xT.A0I;
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                r24.A06.invoke(Long.valueOf(r13.A00.A03));
                return false;
            case 11:
                C821042p r14 = (C821042p) this.A01;
                C96674oE r25 = (C96674oE) this.A02;
                List list3 = C42011xT.A0I;
                if (motionEvent.getActionMasked() != 0) {
                    return false;
                }
                r14.A05.invoke(r25.A00);
                return false;
            default:
                C74853d1 r44 = (C74853d1) this.A01;
                List<WaEditText> list4 = (List) this.A02;
                if (!(motionEvent.getActionMasked() == 2 || motionEvent.getActionMasked() == 1)) {
                    Point A0E2 = C72483Me.A0E(motionEvent, view);
                    for (WaEditText waEditText2 : list4) {
                        if (AnonymousClass3RR.A01(A0E2, waEditText2) && waEditText2.A0J(A0E2)) {
                            r44.A08(waEditText2);
                            return true;
                        }
                    }
                    if (motionEvent.getY() < 0.0f) {
                        return true;
                    }
                }
                r44.A01.A0H.onTouch(view, motionEvent);
                return false;
        }
    }
}
