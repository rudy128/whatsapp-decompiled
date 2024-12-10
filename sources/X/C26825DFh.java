package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spanned;
import android.view.View;

/* renamed from: X.DFh  reason: case insensitive filesystem */
public class C26825DFh implements C16890tO {
    public final DOZ A00;

    public /* bridge */ /* synthetic */ Object BD3(Context context, Object obj, Object obj2, Object obj3) {
        Spanned spanned;
        E13 dBy;
        Object obj4 = obj3;
        View view = (View) obj;
        if (obj4 instanceof CTX) {
            CTX ctx = (CTX) obj4;
            DOZ doz = this.A00;
            C18070vi.A0j(ctx, view);
            CharSequence charSequence = ctx.A04;
            if (!(!(charSequence instanceof Spanned) || (spanned = (Spanned) charSequence) == null || doz.A02.A01.BSo() == null)) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C22831BRj.class);
                C18070vi.A0X(spans);
                for (Object obj5 : spans) {
                    C22831BRj bRj = (C22831BRj) obj5;
                    DOZ doz2 = bRj.A00;
                    DFL dfl = bRj.A01;
                    Uri A002 = C25865CnY.A00(doz2, dfl);
                    if (A002 == null) {
                        dBy = C26746DBz.A00;
                    } else {
                        DVM dvm = new DVM();
                        dvm.put("uri_source", A002);
                        dBy = new C26745DBy(A002, C200610r.A05(dvm));
                    }
                    C22825BRd A02 = C25865CnY.A02(doz2, dfl);
                    C18070vi.A0d(dfl, 0);
                    dfl.A0I(74, false);
                    D4B d4b = C22831BRj.A02;
                    C28604E9v A01 = C25865CnY.A01(doz2, dfl);
                    C25869Cnd.A01();
                    Resources resources = bRj.A02;
                    C18070vi.A0d(resources, 0);
                    C27849Dmk dmk = new C27849Dmk(d4b, new C26738DBr(resources, A02, dBy, C17880vN.A13()), A01, bRj);
                    bRj.A01 = dmk;
                    dmk.invoke();
                    bRj.A00 = view;
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void CQ4(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        Spanned spanned;
        View view = (View) obj;
        if (obj3 instanceof CTX) {
            CTX ctx = (CTX) obj3;
            view.setContentDescription((CharSequence) null);
            DOZ doz = this.A00;
            C18070vi.A0d(ctx, 1);
            CharSequence charSequence = ctx.A04;
            if ((charSequence instanceof Spanned) && (spanned = (Spanned) charSequence) != null && doz.A02.A01.BSo() != null) {
                Object[] spans = spanned.getSpans(0, spanned.length(), C22831BRj.class);
                C18070vi.A0X(spans);
                for (Object obj5 : spans) {
                    C22627BGn bGn = (C22627BGn) obj5;
                    bGn.A00 = null;
                    C25869Cnd.A00().A07(bGn.A03);
                }
            }
        }
    }

    public C26825DFh(DOZ doz) {
        this.A00 = doz;
    }

    public /* synthetic */ String BQX() {
        return C25321CdS.A01(this);
    }

    public /* synthetic */ Class Bar() {
        return getClass();
    }

    public /* bridge */ /* synthetic */ boolean CMV(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
