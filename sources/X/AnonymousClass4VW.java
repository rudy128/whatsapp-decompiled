package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.SectionHeaderView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.newsletter.insights.view.InsightsSectionView;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.4VW  reason: invalid class name */
public abstract class AnonymousClass4VW {
    public C36531o3 A00;
    public final long A01;
    public final C18000vb A02;
    public final C29681ch A03;
    public final AnonymousClass4QX A04;
    public final AnonymousClass74D A05;
    public final AnonymousClass4XM A06;
    public final AnonymousClass1K3 A07;

    public final CharSequence A01(Context context, float f, int i) {
        String A002 = this.A04.A00(Float.valueOf(f));
        if (f > 0.0f) {
            A002 = C17890vO.A0Z(A002, AnonymousClass000.A10(), '+');
        }
        String A0R = C17890vO.A0R(context, A002, 1, 0, i);
        if (f == 0.0f) {
            C18070vi.A0b(A0R);
            return A0R;
        }
        SpannableString spannableString = new SpannableString(A0R);
        int i2 = 2131103175;
        if (f >= 0.0f) {
            i2 = 2131103150;
        }
        int A003 = C19740yt.A00(context, i2);
        int A0F = AnonymousClass1YF.A0F(spannableString, A002, 0, false);
        spannableString.setSpan(new ForegroundColorSpan(A003), A0F, A002.length() + A0F, 33);
        return spannableString;
    }

    public void A02(View.OnClickListener onClickListener, View view, AnonymousClass1FU r9, AnonymousClass3VG r10) {
        ViewGroup viewGroup;
        int A1O;
        C18070vi.A0d(r9, 0);
        C18070vi.A0o(view, r10, onClickListener);
        C28931bI A0s = C72453Mb.A0s(view, 2131431663);
        if (r10.A0W("MISSING")) {
            WDSBanner wDSBanner = (WDSBanner) A0s.A02();
            AnonymousClass4XT r4 = new AnonymousClass4XT();
            r4.A02 = AnonymousClass4A9.A00;
            String string = r9.getString(2131892712, Arrays.copyOf(new Object[0], 0));
            C18070vi.A0b(string);
            AnonymousClass4XT.A00(wDSBanner, r4, AnonymousClass4W6.A01(r9, string, C18070vi.A0F(r9, 2131899101)));
            wDSBanner.setOnDismissListener((C18090vk) new AnonymousClass5OB(r9, this));
            AnonymousClass3MZ.A1O(wDSBanner, this, r9, 37);
        } else if (A0s.A00 != null) {
            AnonymousClass3MX.A0D(A0s).setVisibility(8);
        }
        if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
            ArrayList A002 = C83714Gj.A00(viewGroup, InsightsSectionView.class);
            if (r10.A0W("UNAVAILABLE")) {
                A1O = 2;
            } else {
                A1O = AnonymousClass000.A1O(r10.A0W("NETWORK_ERROR") ? 1 : 0);
            }
            Iterator it = A002.iterator();
            while (it.hasNext()) {
                InsightsSectionView insightsSectionView = (InsightsSectionView) it.next();
                insightsSectionView.setStatus(A1O);
                insightsSectionView.A00 = onClickListener;
            }
        }
    }

    public final void A03(View view, AnonymousClass3VG r13, C87234Uu r14) {
        long A012;
        AnonymousClass4UM r0;
        Long l;
        C18070vi.A0d(r14, 2);
        Map map = (Map) r13.A00.A06();
        if (map == null || (r0 = (AnonymousClass4UM) map.get(r14)) == null || (l = r0.A00) == null) {
            A012 = AnonymousClass11P.A01(r13.A02);
        } else {
            A012 = l.longValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(A012);
        instance.add(5, -29);
        long timeInMillis = instance.getTimeInMillis();
        TextEmojiLabel A0W = AnonymousClass3MX.A0W(view, 2131431665);
        A0W.A0P(C24261Jm.A00(A0W.getContext(), 2131233224), 2131169536);
        TextView A0E = C17880vN.A0E(view, 2131431664);
        AnonymousClass11Y r8 = AnonymousClass11X.A00;
        C18000vb r02 = this.A02;
        String A062 = r8.A06(r02, timeInMillis);
        String A063 = r8.A06(r02, A012);
        Resources resources = view.getResources();
        Object[] objArr = new Object[2];
        objArr[0] = A062;
        A0E.setText(AnonymousClass3MW.A0x(resources, A063, objArr, 1, 2131892683));
    }

    public final void A05(AnonymousClass1FU r7, SectionHeaderView sectionHeaderView, int i, int i2) {
        C18070vi.A0d(sectionHeaderView, 0);
        sectionHeaderView.setInfoIconVisibility(0);
        sectionHeaderView.setInfoIconClickListener(new AnonymousClass78C(r7, i2, this, i, 1));
    }

    public int A00() {
        if (this instanceof AnonymousClass43Z) {
            return 1;
        }
        if (this instanceof AnonymousClass43a) {
            return 2;
        }
        return 3;
    }

    public AnonymousClass4VW(C18000vb r1, C29681ch r2, AnonymousClass4QX r3, AnonymousClass74D r4, AnonymousClass4XM r5, AnonymousClass1K3 r6, long j) {
        this.A03 = r2;
        this.A01 = j;
        this.A07 = r6;
        this.A02 = r1;
        this.A05 = r4;
        this.A06 = r5;
        this.A04 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0125, code lost:
        if (r19 != null) goto L_0x0127;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(android.view.View r18, java.util.List r19, int r20) {
        /*
            r17 = this;
            r0 = 2131431694(0x7f0b110e, float:1.8485124E38)
            r1 = r18
            android.view.View r7 = r1.findViewById(r0)
            com.whatsapp.newsletter.insights.view.InsightsSectionView r7 = (com.whatsapp.newsletter.insights.view.InsightsSectionView) r7
            X.C18070vi.A0b(r7)
            r6 = 1
            X.4so r2 = new X.4so
            r2.<init>(r7, r6)
            java.lang.Class<com.whatsapp.newsletter.insights.view.InsightsItemView> r1 = com.whatsapp.newsletter.insights.view.InsightsItemView.class
            X.5US r0 = new X.5US
            r0.<init>(r1)
            X.7Sa r2 = X.AnonymousClass1b2.A09(r0, r2)
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>"
            X.C18070vi.A0z(r2, r0)
            X.5W0 r0 = X.AnonymousClass5W0.A00
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r2)
            java.util.List r0 = X.AnonymousClass1b2.A06(r0)
            r8 = r19
            boolean r0 = X.C18070vi.A18(r0, r8)
            r0 = r0 ^ 1
            r5 = 0
            if (r0 == 0) goto L_0x0125
            X.7Rp r1 = new X.7Rp
            r1.<init>((X.C147157Sa) r2)
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004e
            java.lang.Object r0 = r1.next()
            android.view.View r0 = (android.view.View) r0
            r7.removeView(r0)
            goto L_0x003e
        L_0x004e:
            if (r19 == 0) goto L_0x012e
            java.util.Iterator r16 = r8.iterator()
            r9 = 0
        L_0x0055:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r10 = r16.next()
            int r15 = r9 + 1
            if (r9 >= 0) goto L_0x0068
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x0068:
            X.4Uh r10 = (X.C87104Uh) r10
            android.content.Context r11 = X.AnonymousClass3MY.A04(r7)
            r0 = 0
            com.whatsapp.newsletter.insights.view.InsightsItemView r4 = new com.whatsapp.newsletter.insights.view.InsightsItemView
            r4.<init>(r11, r0)
            r0 = r20
            if (r20 <= 0) goto L_0x008a
            double r2 = r10.A00
            double r0 = (double) r0
            double r2 = r2 / r0
        L_0x007c:
            android.content.res.Resources r13 = r11.getResources()
            X.C18070vi.A0X(r13)
            java.lang.String r14 = r10.A02
            r12 = r17
            if (r14 == 0) goto L_0x00a1
            goto L_0x008d
        L_0x008a:
            r2 = 0
            goto L_0x007c
        L_0x008d:
            X.1K3 r1 = r12.A07     // Catch:{ Exception -> 0x0098 }
            X.0vb r0 = r12.A02     // Catch:{ Exception -> 0x0098 }
            java.lang.String r0 = r1.A03(r0, r14)     // Catch:{ Exception -> 0x0098 }
            if (r0 != 0) goto L_0x00a8
            goto L_0x00a1
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "TabHelper/Error parsing region code: "
            X.C17900vP.A0e(r0, r14, r1)
        L_0x00a1:
            r0 = 2131897311(0x7f122bdf, float:1.9429508E38)
            java.lang.String r0 = r13.getString(r0)
        L_0x00a8:
            X.C18070vi.A0b(r0)
            r4.setLabel(r0)
            X.4QX r1 = r12.A04
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
            java.lang.String r0 = r1.A00(r0)
            r4.setPrimaryValue(r0)
            X.4XM r14 = r12.A06
            double r0 = r10.A00
            int r13 = (int) r0
            java.lang.String r0 = r14.A01(r13)
            r4.setSecondaryValue(r0)
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r2 = r2 * r0
            int r1 = (int) r2
            r0 = 100
            if (r1 <= r0) goto L_0x00d1
            r1 = 100
        L_0x00d1:
            r4.setProgress(r1)
            boolean r0 = r12 instanceof X.AnonymousClass43Z
            if (r0 == 0) goto L_0x00e2
            r0 = 2131103164(0x7f060dbc, float:1.7818786E38)
            int r0 = X.C19740yt.A00(r11, r0)
            r4.setProgressColor(r0)
        L_0x00e2:
            r4.setTag(r10)
            if (r9 != 0) goto L_0x0107
            int r9 = r4.getPaddingLeft()
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131169535(0x7f0710ff, float:1.7953403E38)
            int r3 = r1.getDimensionPixelSize(r0)
            int r2 = r4.getPaddingRight()
            int r0 = r4.getPaddingBottom()
        L_0x00fe:
            r4.setPadding(r9, r3, r2, r0)
        L_0x0101:
            r7.addView(r4)
            r9 = r15
            goto L_0x0055
        L_0x0107:
            int r0 = X.AnonymousClass3MX.A02(r8, r6)
            if (r9 != r0) goto L_0x0101
            int r9 = r4.getPaddingLeft()
            int r3 = r4.getPaddingTop()
            int r2 = r4.getPaddingRight()
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131169544(0x7f071108, float:1.7953421E38)
            int r0 = r1.getDimensionPixelSize(r0)
            goto L_0x00fe
        L_0x0125:
            if (r19 == 0) goto L_0x012e
        L_0x0127:
            boolean r0 = r8.isEmpty()
            if (r0 != r6) goto L_0x012e
            r5 = 2
        L_0x012e:
            r7.setStatus(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VW.A04(android.view.View, java.util.List, int):void");
    }
}
