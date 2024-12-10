package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.InteractiveAnnotation;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.6vO  reason: invalid class name and case insensitive filesystem */
public abstract class C137396vO {
    public static final void A00(Context context, AnonymousClass1KB r15, C36361nl r16, C18030ve r17, AnonymousClass21V r18, C32741hg r19, String str) {
        int i;
        AnonymousClass71S r0;
        C138716xZ r02;
        C18030ve r5 = r17;
        C18070vi.A0d(r5, 1);
        C36361nl r8 = r16;
        C32741hg r3 = r19;
        C72473Md.A1M(r8, r3, r15, 2);
        if (str != null) {
            Uri parse = Uri.parse(str);
            Uri.Builder buildUpon = parse.buildUpon();
            buildUpon.clearQuery();
            List A0M = C18070vi.A0M("fallback_url");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            C18070vi.A0X(queryParameterNames);
            Iterator<String> it = queryParameterNames.iterator();
            while (it.hasNext()) {
                String A0v = C17880vN.A0v(it);
                if (!A0M.contains(A0v)) {
                    buildUpon.appendQueryParameter(A0v, parse.getQueryParameter(A0v));
                }
            }
            String obj = buildUpon.toString();
            if (obj != null) {
                Context context2 = context;
                if (new Intent("android.intent.action.VIEW", Uri.parse(obj)).resolveActivity(context.getPackageManager()) == null && (obj = C137166v1.A01(str)) == null) {
                    r15.A08(2131886448, 0);
                    return;
                }
                if (C18020vd.A05(C18040vf.A02, r5, 12146)) {
                    String A00 = C137166v1.A00(obj);
                    if (C18070vi.A18(A00, "www.instagram.com")) {
                        i = 3;
                    } else if (C18070vi.A18(A00, "www.facebook.com")) {
                        i = 1;
                    }
                    Integer valueOf = Integer.valueOf(i);
                    if (!(valueOf == null || (r0 = r3.A01) == null)) {
                        AnonymousClass21V r32 = r18;
                        C56012gk r03 = (C56012gk) r0.A0D.get(C60562oE.A00(r32));
                        if (!(r03 == null || (r02 = (C138716xZ) r03.A08.get(r32.A0v)) == null)) {
                            r02.A0I = valueOf;
                        }
                    }
                }
                r8.CGW(context2, Uri.parse(obj), (AnonymousClass206) null, 0, 1);
            }
        }
    }

    public static final boolean A01(InteractiveAnnotation interactiveAnnotation, C18030ve r12, AnonymousClass21V r13, AnonymousClass1OS r14) {
        AnonymousClass206 r7;
        String A0P;
        Object obj;
        AnonymousClass97M r1;
        C18070vi.A0d(r12, 0);
        C18070vi.A0d(r13, 2);
        if (C1406872o.A01(interactiveAnnotation) && C18020vd.A05(C18040vf.A02, r12, 11819)) {
            String A0v = C108955ca.A0v(r12, 12138);
            AnonymousClass7LD r0 = (AnonymousClass7LD) C18070vi.A09(r13, AnonymousClass7LD.class).A02;
            String str = null;
            if (r0 != null) {
                Iterator it = r0.A00.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    AnonymousClass206 r2 = (AnonymousClass206) obj;
                    Object obj2 = interactiveAnnotation.data;
                    if ((obj2 instanceof AnonymousClass97M) && (r1 = (AnonymousClass97M) obj2) != null) {
                        long j = r2.A0x;
                        Long l = r1.A02;
                        if (l != null && j == l.longValue()) {
                            break;
                        }
                    }
                }
                r7 = (AnonymousClass206) obj;
                if (r7 != null) {
                    str = r7.A0P();
                }
            } else {
                r7 = null;
            }
            if (!C29431cG.A18(C108985cd.A0s(A0v, 1), C137166v1.A00(str))) {
                if (r7 == null || (A0P = r7.A0P()) == null) {
                    throw C17890vO.A0K();
                }
                r14.invoke(A0P, C108955ca.A0w(r13));
                return true;
            }
        }
        return false;
    }
}
