package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3uS  reason: invalid class name and case insensitive filesystem */
public abstract class C79103uS extends ViewGroup implements AnonymousClass009 {
    public AnonymousClass031 A00;

    public abstract void A1M();

    public static UserJid A1D(C79093uR r1) {
        C22941Dw r0 = UserJid.Companion;
        return C22941Dw.A01(r1.A0I.A0v.A00);
    }

    public static boolean A1H(C79093uR r2) {
        return r2.A0l.Bew(r2.A0I);
    }

    public static boolean A1J(C79093uR r2) {
        C18030ve r22 = r2.A0F;
        C18070vi.A0d(r22, 0);
        return C18020vd.A05(C18040vf.A02, r22, 9946);
    }

    public static boolean A1K(AnonymousClass3uP r3, AnonymousClass206 r4, AnonymousClass00H r5) {
        C51752Zm r2 = (C51752Zm) r3.A20.get();
        if (((C25811Ps) r5.get()).A0D(r4.A0v.A00)) {
            return false;
        }
        if (!r4.A11(512) && !r4.A11(4096)) {
            if (!C18020vd.A05(C18040vf.A02, r2.A00, 6939) || !r4.A11(33554432)) {
                return false;
            }
        }
        return true;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A00;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public static AnonymousClass1BI A1C(C79093uR r0) {
        return r0.getFMessage().A0v.A00;
    }

    public static void A1E(Context context, ImageView imageView, AnonymousClass3uP r3, int i) {
        imageView.setImageDrawable(C87424Vn.A01(context, i, r3.A2a()));
    }

    public static void A1F(C62572rc r2, AnonymousClass21V r3, String str, StringBuilder sb, boolean z) {
        sb.append(str);
        sb.append(z);
        sb.append(" type:");
        sb.append(r3.A0u);
        sb.append(" url:");
        sb.append(C137256vA.A00(r3.A07));
        sb.append(" file:");
        sb.append(r2.A0G);
        sb.append(" progress:");
        sb.append(r2.A0C);
        sb.append(" transferred:");
        sb.append(r2.A0V);
        sb.append(" transferring:");
        sb.append(r2.A0f);
        sb.append(" fileSize:");
        sb.append(r2.A0A);
        sb.append(" media_size:");
        sb.append(r3.A01);
        sb.append(" timestamp:");
        sb.append(r3.A0I);
        Log.i(sb.toString());
    }

    public static void A1G(C78503su r2) {
        r2.A2u();
        r2.getCarouselRecyclerView().A15(r2.getCarouselRecyclerView().getCurrentPosition());
    }

    public static boolean A1I(C79093uR r0) {
        return r0.getFMessage().A0v.A02;
    }

    public static boolean A1L(AnonymousClass3uL r0) {
        return AnonymousClass25A.A12(r0.getFMessage());
    }
}
