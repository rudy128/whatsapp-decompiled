package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.74B  reason: invalid class name */
public abstract class AnonymousClass74B {
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass1KB r9, X.AnonymousClass2LI r10, X.AnonymousClass00H r11, X.AnonymousClass00H r12, java.util.List r13) {
        /*
            r0 = 2
            X.C18070vi.A0d(r10, r0)
            java.util.ArrayList r7 = X.C29351c6.A0D(r13)
            java.util.Iterator r1 = r13.iterator()
        L_0x000c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0016
            X.C108995ce.A1Q(r7, r1)
            goto L_0x000c
        L_0x0016:
            java.lang.Object r4 = r12.get()
            X.6pi r4 = (X.C133916pi) r4
            java.util.Iterator r3 = r13.iterator()
        L_0x0020:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0045
            X.206 r1 = X.C17880vN.A0Y(r3)
            boolean r0 = r1 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x0020
            X.00H r0 = r4.A02
            java.lang.Object r2 = r0.get()
            X.6fX r2 = (X.C128156fX) r2
            java.lang.String r1 = X.C108955ca.A0w(r1)
            java.util.Map r0 = r2.A00
            r0.remove(r1)
            java.util.Set r0 = r2.A01
            r0.remove(r1)
            goto L_0x0020
        L_0x0045:
            java.lang.Object r5 = r11.get()
            X.72Q r5 = (X.AnonymousClass72Q) r5
            r8 = 0
            java.lang.String r3 = X.AnonymousClass6WF.A00(r7)
            X.2rN r0 = r5.A02()
            X.C62422rN.A00(r0)
            X.00p r4 = r0.A00
            monitor-enter(r4)
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x00b3 }
        L_0x005e:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x006c
            long r0 = X.C17890vO.A07(r2)     // Catch:{ all -> 0x00b3 }
            r4.A08(r0)     // Catch:{ all -> 0x00b3 }
            goto L_0x005e
        L_0x006c:
            monitor-exit(r4)
            X.1Cd r0 = r5.A00
            X.1au r6 = r0.A05()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ac }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00ac }
            java.lang.String r4 = "status_crossposting"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "status_message_row_id IN "
            java.lang.String r3 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ all -> 0x00ac }
            java.util.ArrayList r2 = X.C29351c6.A0D(r7)     // Catch:{ all -> 0x00ac }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x00ac }
        L_0x008c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ac }
            if (r0 == 0) goto L_0x0096
            X.C108995ce.A1R(r2, r1)     // Catch:{ all -> 0x00ac }
            goto L_0x008c
        L_0x0096:
            java.lang.String[] r1 = X.C17890vO.A1b(r2, r8)     // Catch:{ all -> 0x00ac }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/DELETE_RECORDS_BY_MESSAGE_ROW_IDS"
            r5.A04(r4, r3, r0, r1)     // Catch:{ all -> 0x00ac }
            r6.close()
            r1 = 4
            X.Aim r0 = new X.Aim
            r0.<init>(r7, r10, r1)
            r9.A0J(r0)
            return
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass74B.A05(X.1KB, X.2LI, X.00H, X.00H, java.util.List):void");
    }

    public static final void A06(AnonymousClass1KB r2, AnonymousClass2LI r3, AnonymousClass00H r4, List list, int i) {
        AnonymousClass3Ma.A1O(list, 0, r3);
        ((AnonymousClass72Q) r4.get()).A06(list, i);
        r2.A0J(new C21357Aim(list, r3, 5));
    }

    public static final String A03(Integer num) {
        if (num == null) {
            return "other";
        }
        int intValue = num.intValue();
        if (intValue == 1) {
            return "auto_xpost_status_share_view";
        }
        if (intValue == 2) {
            return "auto_xpost_audience_selector_view";
        }
        if (intValue == 3) {
            return "contextual_share_icon";
        }
        if (intValue == 4) {
            return "contextual_share_upsell_banner_setup_link";
        }
        if (intValue == 5) {
            return "status_list_single_status_share_to_fb_menu";
        }
        if (intValue == 6) {
            return "status_list_single_status_long_press_share_to_fb_menu";
        }
        if (intValue == 7) {
            return "status_list_multiple_statuses_share_to_fb_menu";
        }
        if (intValue == 8) {
            return "status_detail_share_to_fb_menu";
        }
        if (intValue == 9) {
            return "auto_xpost_retry";
        }
        if (intValue == 10) {
            return "xpost_retry";
        }
        return "other";
    }

    public static final SpannableStringBuilder A00(Context context, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder A09;
        C18070vi.A0h(context, charSequence);
        SpannableStringBuilder A092 = AnonymousClass3MW.A09(context.getString(2131894953));
        A04(A092, charSequence, "%1$s");
        Drawable A00 = C24261Jm.A00(context, 2131232284);
        if (A00 == null) {
            A09 = new SpannableStringBuilder();
        } else {
            A09 = AnonymousClass3MW.A09(" ");
            C109005cf.A0M(context, A00, A09, AnonymousClass3MZ.A01(context, i), i2);
        }
        A04(A092, A09, "%2$s");
        return A092;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.lang.Object, X.87L] */
    public static final AnonymousClass77S A01(C58612ky r3, String str) {
        C18070vi.A0h(str, r3);
        return new AnonymousClass77S(new C1418477e(new Object(), String.class, r3.A01(str), "XfamilyStatusUniqueId"), 2);
    }

    public static final String A02() {
        String A0f = C108985cd.A0f();
        StringBuilder A10 = AnonymousClass000.A10();
        int length = A0f.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = A0f.charAt(i2);
            A10.append(charAt);
            if (charAt == '-' && (i = i + 1) == 2) {
                A10.append("waffle-");
            }
        }
        return C18070vi.A0H(A10);
    }

    public static final void A04(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str) {
        Matcher matcher = Pattern.compile(Pattern.quote(str)).matcher(spannableStringBuilder);
        if (matcher.find()) {
            spannableStringBuilder.replace(matcher.start(), matcher.end(), charSequence);
        }
    }

    public static final boolean A07(AnonymousClass206 r2) {
        AnonymousClass205 A0U = C108965cb.A0U(r2);
        if (!C108945cZ.A1S(A0U) || !A0U.A02) {
            return false;
        }
        if ((r2 instanceof AnonymousClass210) || (r2 instanceof AnonymousClass21Y) || (r2 instanceof C438421d) || (r2 instanceof C440021t) || (r2 instanceof C441822l)) {
            return true;
        }
        return false;
    }

    public static final boolean A08(Collection collection) {
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
