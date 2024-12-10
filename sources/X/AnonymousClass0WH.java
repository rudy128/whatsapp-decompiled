package X;

import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;

/* renamed from: X.0WH  reason: invalid class name */
public final class AnonymousClass0WH implements C16690sq, View.OnDragListener {
    public final C17090tj A00 = new C01890As(this, 1);
    public final AnonymousClass09W A01 = new AnonymousClass09W(C12390lg.A00);
    public final AnonymousClass016 A02 = new AnonymousClass016((AnonymousClass1Y1) null, 0, 1);
    public final C36001nB A03;

    public boolean BfA(C17460uh r2) {
        return this.A02.contains(r2);
    }

    public void CE0(C17460uh r2) {
        this.A02.add(r2);
    }

    public boolean onDrag(View view, DragEvent dragEvent) {
        AnonymousClass0HB r1 = new AnonymousClass0HB(dragEvent);
        boolean z = false;
        switch (dragEvent.getAction()) {
            case 1:
                z = this.A01.A0N(r1);
                Iterator it = this.A02.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                break;
            case 2:
                this.A01.Byl(r1);
                return false;
            case 3:
                return this.A01.BsO(r1);
            case 4:
                this.A01.Bsf(r1);
                return false;
            case 6:
                this.A01.Btb(r1);
                return false;
        }
        return z;
    }

    public AnonymousClass0WH(C36001nB r5) {
        this.A03 = r5;
    }
}
