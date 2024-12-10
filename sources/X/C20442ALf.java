package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.ALf  reason: case insensitive filesystem */
public class C20442ALf implements C28582E8t {
    public static int A0B = 1;
    public static int A0C = 2;
    public static int A0D = 3;
    public static int A0E = -1;
    public static int A0F = -1;
    public static boolean A0G;
    public View A00;
    public final AnonymousClass1GP A01;
    public final C22654BId A02;
    public final C19830z4 A03;
    public final AnonymousClass18K A04;
    public final C36511o1 A05;
    public final C38581rX A06;
    public final AnonymousClass1VD A07;
    public final C25161Nd A08;
    public final AnonymousClass11P A09;
    public final C18030ve A0A;

    private View A00() {
        ViewGroup.MarginLayoutParams layoutParams;
        if (this.A00 == null) {
            C22654BId bId = this.A02;
            LayoutInflater A0D2 = AnonymousClass3MZ.A0D(bId);
            if (A0G) {
                WDSBanner wDSBanner = (WDSBanner) A0D2.inflate(2131625537, bId, false);
                if (!C22891Dp.A02) {
                    int dimensionPixelSize = AnonymousClass000.A0Y(bId).getDimensionPixelSize(2131169544);
                    if (wDSBanner.getLayoutParams() != null) {
                        layoutParams = AnonymousClass3MW.A0B(wDSBanner);
                    } else {
                        layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    }
                    layoutParams.setMargins(layoutParams.leftMargin, dimensionPixelSize, layoutParams.rightMargin, dimensionPixelSize);
                    wDSBanner.requestLayout();
                }
                wDSBanner.setOnDismissListener((C18090vk) new C21528Alb(this, 2));
                AnonymousClass3MX.A1A(bId.getContext(), bId, 2131103198);
                this.A00 = wDSBanner;
            } else {
                View inflate = A0D2.inflate(2131625536, bId, false);
                this.A00 = inflate;
                AFU.A00(AnonymousClass1HF.A06(inflate, 2131430059), this, 25);
                bId.setBackgroundResource(AnonymousClass1YL.A00(bId.getContext(), 2130968767, 2131099836));
            }
        }
        return this.A00;
    }

    public static void A01(C20442ALf aLf) {
        aLf.A04.CC7(new C170728qZ());
        aLf.A02.A0e(1, 3);
        C19830z4 r5 = aLf.A03;
        r5.A1B(A0C);
        aLf.Bcv();
        int A002 = C17890vO.A00(C17890vO.A0B(r5), "create_group_tip_count") + 1;
        C17880vN.A1D(C19830z4.A00(r5).putInt("create_group_tip_count", A002), "create_group_tip_time", AnonymousClass11P.A01(aLf.A09));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        if (r4.A03() < A0D) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C25161Nd r4, X.C19830z4 r5) {
        /*
            int r0 = A0F
            r3 = 0
            if (r0 <= 0) goto L_0x0014
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r5)
            java.lang.String r0 = "groups_banner_total_day_count"
            int r1 = r1.getInt(r0, r3)
            int r0 = A0F
            if (r1 <= r0) goto L_0x0014
        L_0x0013:
            return r3
        L_0x0014:
            int r0 = A0E
            if (r0 <= 0) goto L_0x0027
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r5)
            java.lang.String r0 = "groups_banner_click_count"
            int r1 = r1.getInt(r0, r3)
            int r0 = A0E
            if (r1 < r0) goto L_0x0027
            return r3
        L_0x0027:
            X.1CJ r0 = r4.A02
            X.AnonymousClass1CJ.A01(r0)
            X.1Ne r2 = r4.A01
            monitor-enter(r2)
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0055 }
        L_0x0033:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0055 }
            X.1ng r0 = (X.C36311ng) r0     // Catch:{ all -> 0x0055 }
            X.1BI r0 = r0.A01     // Catch:{ all -> 0x0055 }
            boolean r0 = X.C22971Dz.A0e(r0)     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0033
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            goto L_0x0054
        L_0x0049:
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            int r1 = r4.A03()
            int r0 = A0D
            if (r1 < r0) goto L_0x0013
            r3 = 1
            return r3
        L_0x0054:
            return r3
        L_0x0055:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0055 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20442ALf.A02(X.1Nd, X.0z4):boolean");
    }

    public void Bcv() {
        C72453Mb.A1B(this.A00);
    }

    public boolean CLk() {
        C19830z4 r5 = this.A03;
        AnonymousClass00H r3 = r5.A00;
        int A002 = C17890vO.A00(C17880vN.A0B(r3), "create_group_tip_count");
        long A052 = C17890vO.A05(C17880vN.A0B(r3), "create_group_tip_time");
        if (!A02(this.A08, r5) || A002 >= A0B || A052 + 2592000000L >= AnonymousClass11P.A01(this.A09) || !C22654BId.A1f.A00(r5)) {
            return false;
        }
        return true;
    }

    public void CQJ() {
        if (this.A00 == null) {
            this.A02.addView(A00());
        }
        C22654BId bId = this.A02;
        AFU.A00(bId, this, 24);
        bId.A0e(1, 1);
        C19830z4 r6 = this.A03;
        if (r6.A2b("education_banner_timestamp", 86400000)) {
            AnonymousClass00H r4 = r6.A00;
            r6.A1B(C17880vN.A0B(r4).getInt("education_banner_count", 0) + 1);
            C17900vP.A0M(r6, "groups_banner_total_day_count", C17880vN.A0B(r4).getInt("groups_banner_total_day_count", 0) + 1);
            r6.A1i("education_banner_timestamp");
        }
        if (this.A06.A02()) {
            bId.setPadding(0, bId.getResources().getDimensionPixelSize(2131168779), 0, 0);
        }
        A00().setVisibility(0);
    }

    public C20442ALf(AnonymousClass1GP r3, C22654BId bId, C25161Nd r5, AnonymousClass11P r6, C19830z4 r7, C18030ve r8, AnonymousClass18K r9, C36511o1 r10, C38581rX r11, AnonymousClass1VD r12) {
        this.A09 = r6;
        this.A04 = r9;
        this.A01 = r3;
        this.A05 = r10;
        this.A02 = bId;
        this.A03 = r7;
        this.A08 = r5;
        this.A07 = r12;
        this.A0A = r8;
        this.A06 = r11;
        C18040vf r1 = C18040vf.A02;
        A0B = C18020vd.A00(r1, r8, 354);
        A0C = C18020vd.A00(r1, r8, 351);
        A0D = C18020vd.A00(r1, r8, 350);
        A0F = C18020vd.A00(r1, r8, 352);
        A0E = C18020vd.A00(r1, r8, 353);
        A0G = AnonymousClass1J8.A02(r8);
    }
}
