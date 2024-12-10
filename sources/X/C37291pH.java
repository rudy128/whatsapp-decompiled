package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1pH  reason: invalid class name and case insensitive filesystem */
public final class C37291pH {
    public final AnonymousClass11S A00;
    public final C33501iv A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public C37291pH(AnonymousClass11S r2, C33501iv r3, AnonymousClass10I r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r6, 5);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
    }

    public static final boolean A00(Uri uri) {
        if (uri.getPathSegments().size() != 2) {
            return false;
        }
        String str = uri.getPathSegments().get(0);
        C18070vi.A0X(str);
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C18070vi.A0X(lowerCase);
        if (!"privacy".equals(lowerCase)) {
            return false;
        }
        String str2 = uri.getPathSegments().get(1);
        C18070vi.A0X(str2);
        String lowerCase2 = str2.toLowerCase(locale);
        C18070vi.A0X(lowerCase2);
        if ("disclosure".equals(lowerCase2)) {
            return true;
        }
        return false;
    }

    public final void A01(Context context, C125766be r4, C138126wZ r5, C160848Ae r6, Integer num, String str) {
        AnonymousClass71X.A01 = null;
        AnonymousClass71X.A03 = null;
        if (r6 != null) {
            AnonymousClass71X.A03 = new WeakReference(r6);
            AnonymousClass71X.A01 = r6;
            Boolean bool = C17970vW.A03;
        }
        AnonymousClass71X.A00 = null;
        AnonymousClass71X.A04 = null;
        AnonymousClass71X.A00 = r4;
        if (r4 != null) {
            AnonymousClass71X.A04 = new WeakReference(r4);
        }
        C18070vi.A0X(this.A04.get());
        context.startActivity(AnonymousClass1LU.A0V(context, r5, num, str, false));
        if (context instanceof Activity) {
            ((Activity) context).overridePendingTransition(0, 0);
        }
    }

    public final void A02(Context context, C138126wZ r9, C160848Ae r10, Integer num, String str) {
        C18070vi.A0d(context, 0);
        A01(context, (C125766be) null, r9, r10, num, str);
    }

    public final void A03(List list) {
        if (C18020vd.A05(C18040vf.A02, ((C52512b2) this.A03.get()).A00, 4679)) {
            this.A01.A04(list, true);
        }
    }

    public final void A04(C63592tN[] r4) {
        if (C18020vd.A05(C18040vf.A02, ((C52512b2) this.A03.get()).A00, 4679)) {
            this.A01.A05(r4);
        }
    }
}
