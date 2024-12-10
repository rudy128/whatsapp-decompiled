package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.whatsapp.StickyHeadersRecyclerView;
import com.whatsapp.bot.metaai.imagine.AiImagineBottomSheet;
import com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer;

/* renamed from: X.5dy  reason: invalid class name and case insensitive filesystem */
public class C109765dy extends GestureDetector.SimpleOnGestureListener {
    public final int A00;
    public final Object A01;

    public C109765dy(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (4 - this.A00 != 0) {
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }
        ((C1422378r) this.A01).A00 = f;
        return AnonymousClass000.A1R((Math.abs(f) > Math.abs(f2) ? 1 : (Math.abs(f) == Math.abs(f2) ? 0 : -1)));
    }

    public void onLongPress(MotionEvent motionEvent) {
        C113615nN r0;
        View view;
        switch (this.A00) {
            case 2:
                C18070vi.A0d(motionEvent, 0);
                AiImagineBottomSheet.A00(motionEvent, (AiImagineBottomSheet) this.A01);
                return;
            case 3:
                C18070vi.A0d(motionEvent, 0);
                FloatingViewDraggableContainer floatingViewDraggableContainer = (FloatingViewDraggableContainer) this.A01;
                C26281Cwc cwc = floatingViewDraggableContainer.A00;
                if (cwc != null && cwc.A06 != null) {
                    C1409473r floatingViewManager = floatingViewDraggableContainer.getFloatingViewManager();
                    if (floatingViewManager.A05.canTap && floatingViewManager.A07().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (r0 = floatingViewManager.A04) != null && (view = r0.A0H) != null) {
                        view.performLongClick();
                    }
                    C26281Cwc cwc2 = floatingViewDraggableContainer.A00;
                    if (cwc2 != null) {
                        cwc2.A0A();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                View view2 = (View) this.A01;
                if (view2.isLongClickable()) {
                    view2.performLongClick();
                    return;
                }
                return;
            default:
                super.onLongPress(motionEvent);
                return;
        }
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (1 - this.A00 == 0) {
            C18070vi.A0d(motionEvent2, 1);
            C111225jD r1 = ((AiImagineBottomSheet) this.A01).A0J;
            if (r1 == null) {
                AnonymousClass3MW.A1H();
                throw null;
            }
            r1.A0A = true;
        }
        return super.onScroll(motionEvent, motionEvent2, f, f2);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        if (6 - this.A00 != 0) {
            return super.onSingleTapConfirmed(motionEvent);
        }
        ((C110515g2) this.A01).A01.BLS(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C113615nN r2;
        switch (this.A00) {
            case 0:
                StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A01;
                return ((AnonymousClass8AZ) ((C112265lC) stickyHeadersRecyclerView.A0B).A00).C6y(motionEvent, stickyHeadersRecyclerView.A04, stickyHeadersRecyclerView.A01);
            case 2:
                C18070vi.A0d(motionEvent, 0);
                AiImagineBottomSheet.A00(motionEvent, (AiImagineBottomSheet) this.A01);
                return true;
            case 3:
                C18070vi.A0d(motionEvent, 0);
                FloatingViewDraggableContainer floatingViewDraggableContainer = (FloatingViewDraggableContainer) this.A01;
                C1409473r floatingViewManager = floatingViewDraggableContainer.getFloatingViewManager();
                if (floatingViewManager.A05.canTap && floatingViewManager.A07().contains((int) motionEvent.getX(), (int) motionEvent.getY()) && (r2 = floatingViewManager.A04) != null) {
                    r2.A0C(motionEvent.getRawX(), motionEvent.getRawY());
                }
                C26281Cwc cwc = floatingViewDraggableContainer.A00;
                if (cwc != null) {
                    cwc.A0A();
                }
                floatingViewDraggableContainer.A07 = AnonymousClass3Ma.A1Z(floatingViewDraggableContainer.getFloatingViewManager().A05, C122686Ri.CONTROLS_HIDDEN);
                return true;
            case 5:
                return AnonymousClass740.A05((AnonymousClass740) this.A01);
            case 8:
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
