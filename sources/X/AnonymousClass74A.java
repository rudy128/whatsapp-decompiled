package X;

import android.content.ContentValues;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.74A  reason: invalid class name */
public abstract class AnonymousClass74A {
    public static final ArrayList A03(AnonymousClass73E r5, List list, List list2) {
        String str;
        ArrayList A16 = C108955ca.A16(r5, 2);
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        HashMap A04 = r5.A04(A0D);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            List list3 = (List) C108965cb.A0n(A04, C17880vN.A0Y(it2).A0x);
            if (list3 != null && !list3.isEmpty()) {
                Iterator it3 = list3.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        str = ((C136346tf) C108955ca.A0p(list3)).A05;
                        break;
                    }
                    C136346tf r1 = (C136346tf) it3.next();
                    if (list2.contains(r1.A02)) {
                        str = r1.A05;
                        break;
                    }
                }
            } else {
                str = null;
            }
            A16.add(str);
        }
        return A16;
    }

    public static final void A05(AnonymousClass1KB r6, AnonymousClass2LF r7, AnonymousClass00H r8, String str, List list, List list2) {
        C18070vi.A0d(r7, 5);
        AnonymousClass73E r4 = (AnonymousClass73E) r8.get();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C122646Re r2 = (C122646Re) it.next();
            C18070vi.A0d(r2, 1);
            ContentValues A08 = C17880vN.A08();
            C17880vN.A18(A08, "state", 1);
            A08.put("crossposting_session_id", str);
            r4.A03().A04(r2, list, 1);
            AnonymousClass73E.A01(A08, r2, r4, list);
        }
        AnonymousClass7RN.A00(r6, r7, list, 36);
    }

    public static final boolean A08(Collection collection) {
        AnonymousClass77K A00;
        C18070vi.A0d(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            AnonymousClass77K A002 = C63672tV.A00(A0Y);
            if ((A002 != null && A002.A06) || ((A00 = C63672tV.A00(A0Y)) != null && A00.A05)) {
                return true;
            }
        }
        return false;
    }

    public static final String A02(C147347Su r1) {
        if (r1 instanceof AnonymousClass6OG) {
            return "crosspost_error_already_shared";
        }
        if (r1 instanceof AnonymousClass6OH) {
            return "crosspost_error_duplicate_request";
        }
        if (r1 instanceof AnonymousClass6OM) {
            return "status_cannot_be_shared";
        }
        if (r1 instanceof AnonymousClass6ON) {
            return "eligibility_purpose_encryption_validation_error";
        }
        if (r1 instanceof AnonymousClass6OO) {
            return "eligibility_session_data_validation_error";
        }
        if (r1 instanceof AnonymousClass6OJ) {
            return "crosspost_generic_error";
        }
        if (r1 instanceof AnonymousClass6OK) {
            return "eligibility_generic_error";
        }
        if (r1 instanceof AnonymousClass6OI) {
            return "crosspost_error_account_not_linked";
        }
        if (r1 instanceof AnonymousClass6OL) {
            return "eligibility_check_error_account_not_linked";
        }
        throw AnonymousClass3MW.A14();
    }

    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, int i, int i2, boolean z, boolean z2) {
        C18070vi.A0h(context, charSequence);
        SpannableStringBuilder A09 = AnonymousClass3MW.A09(context.getString(2131894954));
        A04(A09, charSequence, "%1$s");
        SpannableStringBuilder A092 = AnonymousClass3MW.A09("");
        if (z) {
            Drawable A00 = C24261Jm.A00(context, 2131232284);
            if (A00 != null) {
                A092 = AnonymousClass3MW.A09(" ");
                C109005cf.A0M(context, A00, A092, AnonymousClass3MZ.A01(context, i), i2);
            }
            return new SpannableStringBuilder();
        }
        A04(A09, A092, "%2$s");
        SpannableStringBuilder A093 = AnonymousClass3MW.A09("");
        if (z2) {
            Drawable A002 = C24261Jm.A00(context, 2131233618);
            if (A002 != null) {
                A093 = AnonymousClass3MW.A09(" ");
                C109005cf.A0M(context, A002, A093, AnonymousClass3MZ.A01(context, i), i2);
            }
            return new SpannableStringBuilder();
        }
        A04(A09, A093, "%3$s");
        return A09;
    }

    public static final String A01() {
        ArrayList A0m = C29431cG.A0m(AnonymousClass1YF.A0R(C108985cd.A0f(), new char[]{'-'}));
        A0m.add(2, "waffle");
        return C108995ce.A0X("-", A0m);
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), charSequence);
        }
    }

    public static final void A06(AnonymousClass1KB r1, AnonymousClass2LF r2, AnonymousClass00H r3, List list, List list2, int i) {
        C18070vi.A0h(list, list2);
        C18070vi.A0d(r2, 4);
        ((AnonymousClass73E) r3.get()).A07(list, list2, i);
        AnonymousClass7RN.A00(r1, r2, list, 35);
    }

    public static final boolean A07(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        for (Object obj : collection) {
            if (obj instanceof C441822l) {
                return true;
            }
        }
        return false;
    }
}
