package X;

import android.content.Context;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3s2  reason: invalid class name and case insensitive filesystem */
public final class C78043s2 extends AnonymousClass3WP {
    public final int A00;
    public final Context A01;
    public final AnonymousClass1GP A02;
    public final A1M A03;
    public final C108875cR A04;
    public final List A05;

    public C78043s2(Context context, AnonymousClass1GP r8, A1M a1m, C108875cR r10, C108675c7 r11, AnonymousClass21L r12) {
        Object next;
        int A012;
        String str;
        C18070vi.A0d(context, 1);
        C18070vi.A0p(r8, a1m, r11);
        C18070vi.A0d(r12, 6);
        this.A01 = context;
        this.A02 = r8;
        this.A03 = a1m;
        C17960vV.A0C(C20120A8f.A07(r12));
        List A17 = r12.A17();
        A17 = A17 == null ? C18460wS.A00 : A17;
        this.A05 = A17;
        this.A04 = new C94594ks(r11, r10, 0);
        ArrayList A0D = C29351c6.A0D(A17);
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (!(A0Y instanceof AnonymousClass21K)) {
                Log.e(AnonymousClass206.A03(A0Y, "CarouselMessageAdapter/measureTextLines; unsupported message type for message: key=", AnonymousClass000.A10()));
            } else {
                if (A0Y instanceof C445323u) {
                    SpannableString A013 = this.A03.A01((AnonymousClass22Q) A0Y);
                    if (A013 != null) {
                        A012 = A01(A013, this.A01.getResources().getDimension(2131169436));
                        if (A012 > 2) {
                            A012 = 2;
                        }
                    }
                } else {
                    C20285AEt BPK = ((AnonymousClass21K) A0Y).BPK();
                    A012 = A01((BPK == null || (str = BPK.A0B) == null) ? "" : str, this.A01.getResources().getDimension(2131169432));
                }
                C17890vO.A1D(A0D, A012);
            }
            A012 = 0;
            C17890vO.A1D(A0D, A012);
        }
        Iterator it2 = A0D.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int A0M = AnonymousClass000.A0M(next);
                do {
                    Object next2 = it2.next();
                    int A0M2 = AnonymousClass000.A0M(next2);
                    if (A0M < A0M2) {
                        next = next2;
                        A0M = A0M2;
                    }
                } while (it2.hasNext());
            }
        }
        this.A00 = Math.max(1, C72463Mc.A0B((Number) next));
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        Context context = this.A01;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        CardView A002 = AnonymousClass3WP.A00(frameLayout, viewGroup);
        A002.setCardBackgroundColor(0);
        A002.setBackgroundColor(0);
        A002.setRadius(0.0f);
        C43531zx.A03(A002, new C39351sv(0, 0, 0, 0));
        A002.setCardElevation(0.0f);
        A002.setElevation(0.0f);
        return new AnonymousClass3s5(context, A002, this.A02, this.A04, this.A00);
    }

    private final int A01(CharSequence charSequence, float f) {
        TextPaint textPaint = new TextPaint();
        Context context = this.A01;
        textPaint.setTypeface(C43421zm.A01());
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(f);
        int dimension = (int) ((context.getResources().getDimension(2131165762) + (2.0f * context.getResources().getDimension(2131166347))) - (2.0f * context.getResources().getDimension(2131168354)));
        return new StaticLayout(charSequence, textPaint, dimension, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
    }

    public int A0Q() {
        return this.A05.size();
    }

    public final int A0U(AnonymousClass205 r4) {
        Iterator it = this.A05.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (AnonymousClass3MZ.A10(it).equals(r4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r2, int i) {
        AnonymousClass3ZZ r22 = (AnonymousClass3ZZ) r2;
        C18070vi.A0d(r22, 0);
        Object A0f = C29431cG.A0f(this.A05, i);
        if (A0f != null) {
            r22.A0B(A0f);
        }
    }

    public int getItemViewType(int i) {
        Object A0f = C29431cG.A0f(this.A05, i);
        if (A0f instanceof C438521e) {
            return 1;
        }
        if (A0f instanceof C438121a) {
            return 2;
        }
        if (A0f instanceof C445323u) {
            return 3;
        }
        return 0;
    }
}
