package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.98j  reason: invalid class name and case insensitive filesystem */
public final class C1773898j extends C20083A6j {
    public String A0F(Context context) {
        C20251ADj aDj;
        C18070vi.A0d(context, 0);
        if (A00(this)) {
            BDZ bdz = null;
            AEY aey = this.A02.A03;
            if (!(aey == null || (aDj = (C20251ADj) aey.A03.get(0)) == null)) {
                bdz = aDj.A00;
            }
            C18070vi.A0z(bdz, "null cannot be cast to non-null type com.whatsapp.protocol.CheckoutInfoContent.PaymentSettings.PaymentPixKey");
            C20934Abo abo = (C20934Abo) bdz;
            Object[] A1b = AnonymousClass3MW.A1b();
            String str = abo.A03;
            A1b[0] = context.getString(A3V.A00(str));
            String A10 = AnonymousClass3Ma.A10(context, A3V.A01(str, abo.A02), A1b, 1, 2131888299);
            if (A10.length() > 0) {
                return A10;
            }
        }
        return super.A0F(context);
    }

    public void A0H(C19998A2m a2m, AnonymousClass206 r49) {
        C19998A2m a2m2 = a2m;
        AnonymousClass206 r0 = r49;
        boolean A17 = C18070vi.A17(a2m2, r0);
        super.A0H(a2m2, r0);
        AnonymousClass8X8 r10 = a2m2.A00;
        C163878Wr A00 = AnonymousClass8X8.A00(r10);
        C163758Wf r3 = (C163758Wf) ((C166398cp) A00.A00).A0S().A0O();
        C20285AEt aEt = this.A02;
        String A002 = aEt.A00();
        if (A002 == null) {
            A002 = "payment_info";
        }
        C163888Ws r2 = (C163888Ws) AnonymousClass8Z3.DEFAULT_INSTANCE.A0N();
        r2.A0H(A002);
        AEY aey = aEt.A03;
        if (aey != null) {
            AnonymousClass1KJ r13 = aey.A00;
            List list = aey.A03;
            C20934Abo abo = (C20934Abo) ((C20251ADj) list.get(0)).A00;
            StringBuilder A10 = AnonymousClass000.A10();
            C18070vi.A0b(abo);
            A10.append(abo.A01);
            A10.append(" : ");
            String A0y = AnonymousClass000.A0y(abo.A02, A10);
            try {
                r2.A0G(C20122A8h.A06(new C20279AEn(r13, (C22565BDa) null, (AES) null, (C20266ADy) null, (AE0) null, new AEU((C20250ADi) null, new AE1(0, 100, (String) null), (AE1) null, (AE1) null, (AE1) null, "pending", (String) null, (String) null, "ORDER", C18070vi.A0M(new AET(new AE1(0, 100, (String) null), new AE1(0, 100, (String) null), "", "", "", (String) null, (List) null, 0))), (ADZ) null, new AE1(0, 100, (String) null), A0y, C181549Qx.A00(), (String) null, "physical-goods", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, list, (List) null, (List) null, (byte[]) null, 0, 0, -1, A17, false, false), a2m2.A0D).toString());
            } catch (JSONException e) {
                C108995ce.A1M("CheckoutMessageCustomizer/getJsonParameter/invalid parameter json: ", AnonymousClass000.A10(), e);
            }
        }
        r3.A0G((AnonymousClass8Z3) r2.A0C());
        A00.A0H(r3);
        AnonymousClass8X8.A06(A00, r10);
    }

    public static final boolean A00(C1773898j r2) {
        List list;
        C20934Abo abo;
        AEY aey = r2.A02.A03;
        if (aey != null) {
            list = aey.A03;
        } else {
            list = null;
        }
        if (list == null || list.isEmpty() || (abo = (C20934Abo) ((C20251ADj) list.get(0)).A00) == null || !A3V.A02(abo)) {
            return false;
        }
        return true;
    }

    public CharSequence A08(Context context, Paint paint) {
        Drawable A05 = A05(context);
        if (A05 == null) {
            return super.A08(context, paint);
        }
        CharSequence A03 = C72813Np.A03(paint, A05, A0F(context));
        C18070vi.A0X(A03);
        return A03;
    }
}
