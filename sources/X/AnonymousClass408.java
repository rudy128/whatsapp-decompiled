package X;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.gallery.DocumentsGalleryFragment;
import java.util.Calendar;
import java.util.List;

/* renamed from: X.408  reason: invalid class name */
public class AnonymousClass408 extends AnonymousClass3XJ implements AnonymousClass8AZ {
    public int A00;
    public final ContentObserver A01 = new C72593Mt(C17890vO.A0D(), this);
    public final /* synthetic */ DocumentsGalleryFragment A02;

    public AnonymousClass408(DocumentsGalleryFragment documentsGalleryFragment) {
        this.A02 = documentsGalleryFragment;
    }

    public int A0Q() {
        return this.A00;
    }

    public Cursor A0U(Cursor cursor) {
        int i;
        Cursor cursor2 = this.A00;
        if (cursor2 != null) {
            cursor2.unregisterContentObserver(this.A01);
        }
        if (cursor != null) {
            cursor.registerContentObserver(this.A01);
            i = cursor.getCount();
        } else {
            i = 0;
        }
        this.A00 = i;
        return super.A0U(cursor);
    }

    public int BPU(int i) {
        return ((C147397Sz) this.A02.A0L.get(i)).bucketCount;
    }

    public int BSM() {
        return this.A02.A0L.size();
    }

    public long BSN(int i) {
        return -((Calendar) this.A02.A0L.get(i)).getTimeInMillis();
    }

    public /* bridge */ /* synthetic */ void Bma(C42011xT r3, int i) {
        List list = C42011xT.A0I;
        ((C73973Ya) r3).A00.setText(this.A02.A0L.get(i).toString());
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        Cursor cursor = this.A00;
        if (cursor != null && i < cursor.getCount()) {
            super.Bmc(r2, i);
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqT(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View inflate = LayoutInflater.from(context).inflate(2131625961, viewGroup, false);
        inflate.setClickable(false);
        inflate.setBackgroundColor(AnonymousClass3Ma.A00(context, 2130969988, 2131101073));
        return new C73973Ya(inflate);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = AnonymousClass3MZ.A0D(viewGroup);
        List list = C42011xT.A0I;
        return new AnonymousClass3ZX(AnonymousClass3MX.A09(A0D, viewGroup, 2131625127), this.A02);
    }

    public /* bridge */ /* synthetic */ boolean C6y(MotionEvent motionEvent, C42011xT r3, int i) {
        return false;
    }
}
