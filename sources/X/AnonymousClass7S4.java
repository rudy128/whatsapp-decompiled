package X;

/* renamed from: X.7S4  reason: invalid class name */
public class AnonymousClass7S4 implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public AnonymousClass7S4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C18030ve A00(AnonymousClass7S4 r1) {
        C130776jz r12 = (C130776jz) r1.A01;
        C18070vi.A0d(r12, 0);
        return r12.A01;
    }

    public static C18100vl A01(Integer num, Object obj, int i) {
        return AnonymousClass1DF.A00(num, new AnonymousClass7S4(obj, i));
    }

    public static C18110vm A02(Object obj, int i) {
        return AnonymousClass1DF.A01(new AnonymousClass7S4(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:?, code lost:
        return java.lang.Integer.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x009b, code lost:
        r0 = X.C18020vd.A00(X.C18040vf.A02, r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        r0 = r1.getDimensionPixelSize(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r10 = this;
            int r0 = r10.A00
            switch(r0) {
                case 0: goto L_0x00ee;
                case 1: goto L_0x00ff;
                case 2: goto L_0x0110;
                case 3: goto L_0x0131;
                case 4: goto L_0x0148;
                case 5: goto L_0x015c;
                case 6: goto L_0x016c;
                case 7: goto L_0x017c;
                case 8: goto L_0x0193;
                case 9: goto L_0x001f;
                case 10: goto L_0x01b5;
                case 11: goto L_0x01c1;
                case 12: goto L_0x01cd;
                case 13: goto L_0x01d9;
                case 14: goto L_0x01e5;
                case 15: goto L_0x01f1;
                case 16: goto L_0x023c;
                case 17: goto L_0x024c;
                case 18: goto L_0x025d;
                case 19: goto L_0x028d;
                case 20: goto L_0x03e4;
                case 21: goto L_0x0298;
                case 22: goto L_0x0005;
                case 23: goto L_0x002b;
                case 24: goto L_0x003d;
                case 25: goto L_0x0005;
                case 26: goto L_0x02c7;
                case 27: goto L_0x02d2;
                case 28: goto L_0x02e3;
                case 29: goto L_0x02fe;
                case 30: goto L_0x030e;
                case 31: goto L_0x031f;
                case 32: goto L_0x0336;
                case 33: goto L_0x0347;
                case 34: goto L_0x0351;
                case 35: goto L_0x0365;
                case 36: goto L_0x0051;
                case 37: goto L_0x0063;
                case 38: goto L_0x0075;
                case 39: goto L_0x0087;
                case 40: goto L_0x0374;
                case 41: goto L_0x008e;
                case 42: goto L_0x0395;
                case 43: goto L_0x0095;
                case 44: goto L_0x03a0;
                case 45: goto L_0x03ad;
                case 46: goto L_0x03bc;
                case 47: goto L_0x00a3;
                case 48: goto L_0x00d4;
                case 49: goto L_0x040c;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A01
            X.71g r1 = (X.C1403971g) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A00
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131168911(0x7f070e8f, float:1.7952137E38)
        L_0x0016:
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x001a:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x001e:
            return r3
        L_0x001f:
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131168455(0x7f070cc7, float:1.7951212E38)
            goto L_0x0016
        L_0x002b:
            java.lang.Object r1 = r10.A01
            X.71g r1 = (X.C1403971g) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A00
            android.content.res.Resources r1 = X.AnonymousClass3MW.A05(r0)
            r0 = 2131168783(0x7f070e0f, float:1.7951878E38)
            goto L_0x0016
        L_0x003d:
            java.lang.Object r1 = r10.A01
            X.71g r1 = (X.C1403971g) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A00
            android.content.Context r1 = r0.A00
            r0 = 2131103104(0x7f060d80, float:1.7818665E38)
            int r0 = X.C19740yt.A00(r1, r0)
            goto L_0x001a
        L_0x0051:
            java.lang.Object r1 = r10.A01
            X.6hp r1 = (X.C129456hp) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.Context r0 = r1.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169535(0x7f0710ff, float:1.7953403E38)
            goto L_0x0016
        L_0x0063:
            java.lang.Object r1 = r10.A01
            X.6hp r1 = (X.C129456hp) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.Context r0 = r1.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169533(0x7f0710fd, float:1.7953399E38)
            goto L_0x0016
        L_0x0075:
            java.lang.Object r1 = r10.A01
            X.6hp r1 = (X.C129456hp) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.Context r0 = r1.A00
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169545(0x7f071109, float:1.7953423E38)
            goto L_0x0016
        L_0x0087:
            X.0ve r2 = A00(r10)
            r1 = 6582(0x19b6, float:9.223E-42)
            goto L_0x009b
        L_0x008e:
            X.0ve r2 = A00(r10)
            r1 = 6583(0x19b7, float:9.225E-42)
            goto L_0x009b
        L_0x0095:
            X.0ve r2 = A00(r10)
            r1 = 6584(0x19b8, float:9.226E-42)
        L_0x009b:
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            goto L_0x001a
        L_0x00a3:
            java.lang.Object r1 = r10.A01
            X.71P r1 = (X.AnonymousClass71P) r1
            X.0vl r0 = r1.A06
            java.lang.Object r3 = r0.getValue()
            X.6RM r3 = (X.AnonymousClass6RM) r3
            int r2 = r3.ordinal()
            r0 = 0
            if (r2 > r0) goto L_0x001e
            boolean r0 = r1 instanceof X.AnonymousClass6Pr
            if (r0 == 0) goto L_0x00d1
            X.6Pr r1 = (X.AnonymousClass6Pr) r1
            X.71P r0 = r1.A00
        L_0x00be:
            if (r0 == 0) goto L_0x001e
            X.0vl r0 = r0.A05
            java.lang.Object r1 = r0.getValue()
            X.6RM r1 = (X.AnonymousClass6RM) r1
            if (r1 == 0) goto L_0x001e
            int r0 = r1.ordinal()
            if (r0 <= r2) goto L_0x001e
            return r1
        L_0x00d1:
            X.71P r0 = r1.A00
            goto L_0x00be
        L_0x00d4:
            java.lang.Object r1 = r10.A01
            X.71P r1 = (X.AnonymousClass71P) r1
            X.0vl r0 = r1.A05
            java.lang.Object r0 = r0.getValue()
            X.6RM r0 = (X.AnonymousClass6RM) r0
            X.71P r3 = X.AnonymousClass71P.A00(r0, r1)
            if (r3 != 0) goto L_0x001e
            java.lang.String r0 = "Unable to find system?"
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x00ee:
            java.lang.Object r1 = r10.A01
            X.6ej r1 = (X.C127666ej) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "pref_consumer_marketing_disclosure"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x00ff:
            java.lang.Object r1 = r10.A01
            X.6oy r1 = (X.C133556oy) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "pref_consumer_marketing_disclosure_tos"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x0110:
            java.lang.Object r1 = r10.A01
            X.6EY r1 = (X.AnonymousClass6EY) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A04
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            java.util.concurrent.LinkedBlockingQueue r2 = new java.util.concurrent.LinkedBlockingQueue
            r2.<init>()
            java.lang.String r1 = "AlbumArtworkDirectDownloader"
            r3 = 1
            r4 = 8
            r6 = 5
            r5 = 10
            X.2Py r3 = r0.BHv(r1, r2, r3, r4, r5, r6)
            return r3
        L_0x0131:
            java.lang.Object r1 = r10.A01
            X.2P3 r1 = (X.AnonymousClass2P3) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.graphics.Bitmap r0 = X.A5O.A07
            java.io.File r2 = r1.A0A()
            r0 = 1048576(0x100000, double:5.180654E-318)
            X.A5O r3 = new X.A5O
            r3.<init>(r2, r0)
            return r3
        L_0x0148:
            java.lang.Object r0 = r10.A01
            X.2Lw r0 = (X.C48282Lw) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.00H r0 = r0.A08
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            X.10s r3 = new X.10s
            r3.<init>(r0, r1)
            return r3
        L_0x015c:
            java.lang.Object r1 = r10.A01
            X.73N r1 = (X.AnonymousClass73N) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 29
            X.7Qm r3 = new X.7Qm
            r3.<init>((X.AnonymousClass73N) r1, (int) r0)
            return r3
        L_0x016c:
            java.lang.Object r1 = r10.A01
            X.73N r1 = (X.AnonymousClass73N) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 28
            X.7Qm r3 = new X.7Qm
            r3.<init>((X.AnonymousClass73N) r1, (int) r0)
            return r3
        L_0x017c:
            java.lang.Object r1 = r10.A01
            X.6EX r1 = (X.AnonymousClass6EX) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A03
            X.10I r2 = X.AnonymousClass3MX.A0x(r0)
            java.lang.String r1 = "AlbumArtworkUploader"
            r0 = 10
            X.2Py r3 = r2.BkJ(r1, r0)
            return r3
        L_0x0193:
            java.lang.Object r5 = r10.A01
            com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel r5 = (com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel) r5
            r4 = 0
            X.C18070vi.A0d(r5, r4)
            X.1G4 r2 = r5.A06
            X.1G4 r1 = r5.A07
            X.7gf r0 = X.C147957gf.A00
            X.4ss r3 = X.AnonymousClass4Z8.A00(r0, r2, r1)
            X.1OX r2 = X.C41561wd.A00(r5)
            X.5cA r1 = X.AnonymousClass4ZC.A00
            X.6zW r0 = new X.6zW
            r0.<init>(r4, r4)
            X.1jt r3 = X.AnonymousClass4Z7.A01(r0, r2, r3, r1)
            return r3
        L_0x01b5:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131435414(0x7f0b1f96, float:1.849267E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            return r3
        L_0x01c1:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131434160(0x7f0b1ab0, float:1.8490126E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            return r3
        L_0x01cd:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131429510(0x7f0b0886, float:1.8480695E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            return r3
        L_0x01d9:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131436208(0x7f0b22b0, float:1.849428E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            return r3
        L_0x01e5:
            java.lang.Object r1 = r10.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 2131436123(0x7f0b225b, float:1.8494108E38)
            android.view.View r3 = X.C18070vi.A05(r1, r0)
            return r3
        L_0x01f1:
            java.lang.Object r1 = r10.A01
            com.whatsapp.reels.ReelsPreviewView r1 = (com.whatsapp.reels.ReelsPreviewView) r1
            X.00H r0 = r1.getWaWorkers()
            X.10I r5 = X.AnonymousClass3MX.A0x(r0)
            X.00H r0 = r1.getGlobalUI()
            X.1KB r2 = X.C108945cZ.A0a(r0)
            X.00H r0 = r1.getStatistics()
            java.lang.Object r3 = r0.get()
            X.181 r3 = (X.AnonymousClass181) r3
            X.00H r0 = r1.getWaHttpClient()
            java.lang.Object r4 = r0.get()
            X.1D9 r4 = (X.AnonymousClass1D9) r4
            X.00H r0 = r1.getWaContext()
            java.lang.Object r0 = r0.get()
            X.118 r0 = (X.AnonymousClass118) r0
            java.io.File r1 = X.C108945cZ.A16(r0)
            java.lang.String r0 = "reels_preview_view_cache"
            java.io.File r6 = X.C17880vN.A0e(r1, r0)
            java.lang.String r7 = "reels_preview_view"
            X.4Ra r1 = new X.4Ra
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 1
            r1.A05 = r0
            X.4VT r3 = r1.A00()
            return r3
        L_0x023c:
            java.lang.Object r0 = r10.A01
            X.7CM r0 = (X.AnonymousClass7CM) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.10I r0 = r0.A02
            X.10s r3 = new X.10s
            r3.<init>(r0, r1)
            return r3
        L_0x024c:
            java.lang.Object r2 = r10.A01
            X.5jU r2 = (X.C111295jU) r2
            X.1wy r1 = r2.A1N
            r0 = 0
            r1.A0E(r0)
            r0 = 0
            r2.A0p(r0)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x025d:
            java.lang.Object r1 = r10.A01
            X.5jU r1 = (X.C111295jU) r1
            java.util.List r0 = r1.A0K
            int r4 = r0.size()
            java.util.List r0 = r1.A0I
            int r5 = r0.size()
            java.util.List r0 = r1.A0M
            int r6 = r0.size()
            java.util.List r0 = r1.A0L
            int r7 = r0.size()
            X.6yD r0 = r1.A06
            java.util.List r0 = r0.A02
            int r8 = r0.size()
            android.util.SparseIntArray r0 = r1.A01
            int r9 = r0.size()
            X.9tF r3 = new X.9tF
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r3
        L_0x028d:
            java.lang.Object r1 = r10.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<X.00c> r0 = X.C000100c.class
            java.lang.Object r3 = X.AnonymousClass00E.A00(r1, r0)
            return r3
        L_0x0298:
            java.lang.Object r3 = r10.A01
            X.5jJ r3 = (X.C111255jJ) r3
            X.00H r0 = r3.A0B
            X.0ve r2 = X.C108955ca.A0R(r0)
            r1 = 11917(0x2e8d, float:1.6699E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x02ba
            X.00H r0 = r3.A0G
            java.lang.Object r2 = r0.get()
            X.10s r2 = (X.C200710s) r2
        L_0x02b4:
            X.1pb r3 = new X.1pb
            r3.<init>(r2)
            return r3
        L_0x02ba:
            X.00H r0 = r3.A0H
            X.10I r1 = X.AnonymousClass3MX.A0x(r0)
            r0 = 1
            X.10s r2 = new X.10s
            r2.<init>(r1, r0)
            goto L_0x02b4
        L_0x02c7:
            java.lang.Object r1 = r10.A01
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = "suggestions_pref_file"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x02d2:
            java.lang.Object r1 = r10.A01
            X.73G r1 = (X.AnonymousClass73G) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.118 r0 = r1.A09
            android.content.Context r0 = r0.A00
            X.BZ9 r3 = X.C25929Cot.A00(r0)
            return r3
        L_0x02e3:
            java.lang.Object r1 = r10.A01
            X.6yb r1 = (X.C139296yb) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r2 = r1.A02
            r1 = 3860(0xf14, float:5.409E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            long r2 = (long) r0
            r0 = 2
            long r2 = r2 / r0
            java.lang.Long r3 = java.lang.Long.valueOf(r2)
            return r3
        L_0x02fe:
            java.lang.Object r0 = r10.A01
            X.6yb r0 = (X.C139296yb) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.10I r0 = r0.A05
            X.10s r3 = new X.10s
            r3.<init>(r0, r1)
            return r3
        L_0x030e:
            java.lang.Object r1 = r10.A01
            X.6p2 r1 = (X.C133596p2) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "tos_gating_prefs"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x031f:
            java.lang.Object r1 = r10.A01
            X.7Bv r1 = (X.C143057Bv) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A03
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.122> r0 = X.AnonymousClass122.class
            X.11a r3 = r1.A01(r0)
            return r3
        L_0x0336:
            java.lang.Object r1 = r10.A01
            X.7P8 r1 = (X.AnonymousClass7P8) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "smb_eligibility_check_pref_file"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x0347:
            java.lang.Object r0 = r10.A01
            android.content.Context r0 = (android.content.Context) r0
            X.6hp r3 = new X.6hp
            r3.<init>(r0)
            return r3
        L_0x0351:
            java.lang.Object r0 = r10.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169414(0x7f071086, float:1.7953157E38)
            float r0 = X.AnonymousClass3MW.A00(r1, r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x0365:
            java.lang.Object r1 = r10.A01
            android.content.Context r1 = (android.content.Context) r1
            android.graphics.Paint r3 = X.AnonymousClass3MW.A06()
            r0 = 2131103166(0x7f060dbe, float:1.781879E38)
            X.AnonymousClass3MX.A19(r1, r3, r0)
            return r3
        L_0x0374:
            java.lang.Object r0 = r10.A01
            X.6jz r0 = (X.C130776jz) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.0vl r0 = r0.A06
            int r0 = X.C72453Mb.A0I(r0)
            r2 = 0
            X.1Oc r1 = X.C28851b7.A08(r1, r0)
            X.1JV r0 = X.AnonymousClass1JU.A00
            int r0 = X.C28851b7.A04(r0, r1)
            if (r0 != 0) goto L_0x0390
            r2 = 1
        L_0x0390:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r2)
            return r3
        L_0x0395:
            X.0ve r1 = A00(r10)
            r0 = 6581(0x19b5, float:9.222E-42)
            java.lang.Boolean r3 = X.AnonymousClass3MZ.A15(r1, r0)
            return r3
        L_0x03a0:
            X.0ve r2 = A00(r10)
            r1 = 6585(0x19b9, float:9.228E-42)
            X.0vf r0 = X.C18040vf.A02
            java.lang.String r3 = X.C18020vd.A01(r0, r2, r1)
            return r3
        L_0x03ad:
            java.lang.Object r2 = r10.A01
            X.6Po r2 = (X.AnonymousClass6Po) r2
            X.6jz r1 = r2.A02
            r0 = 1
            r1.A00 = r0
            r0 = 0
            r2.A00 = r0
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x03bc:
            java.lang.Object r0 = r10.A01
            X.71P r0 = (X.AnonymousClass71P) r0
            java.lang.Object r0 = r0.A03
            java.lang.Class r1 = r0.getClass()
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.lang.Package r0 = r1.getPackage()
            if (r0 == 0) goto L_0x03e1
            java.lang.String r1 = r0.getName()
            if (r1 == 0) goto L_0x03e1
            java.lang.String r0 = "com.whatsapp.wds"
            boolean r0 = X.C108975cc.A1N(r0, r1)
            if (r0 == 0) goto L_0x03e1
            X.6RM r3 = X.AnonymousClass6RM.WDS
            return r3
        L_0x03e1:
            X.6RM r3 = X.AnonymousClass6RM.CUSTOM
            return r3
        L_0x03e4:
            java.lang.Object r1 = r10.A01
            com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment r1 = (com.whatsapp.status.audienceselector.sharesheet.StatusAudienceSelectorShareSheetFragment) r1
            X.6pz r0 = r1.A0F
            if (r0 != 0) goto L_0x03f3
            java.lang.String r0 = "shareSheetController"
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x03f3:
            X.0vl r0 = r1.A0R
            java.lang.Object r1 = r0.getValue()
            X.6RU r1 = (X.AnonymousClass6RU) r1
            r0 = 0
            int r1 = X.C108955ca.A04(r1, r0)
            r0 = 3
            if (r1 == r0) goto L_0x0409
            r0 = 4
            if (r1 == r0) goto L_0x0409
            X.6Ql r3 = X.AnonymousClass6Ql.SHARE
            return r3
        L_0x0409:
            X.6Ql r3 = X.AnonymousClass6Ql.DONE
            return r3
        L_0x040c:
            java.lang.Object r2 = r10.A01
            X.71P r2 = (X.AnonymousClass71P) r2
            java.lang.Object r1 = r2.A03
            android.view.View r1 = (android.view.View) r1
            boolean r0 = r1.isShown()
            if (r0 == 0) goto L_0x043b
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x043b
            boolean r0 = r2 instanceof X.AnonymousClass6Pr
            if (r0 == 0) goto L_0x0438
            X.6Pr r2 = (X.AnonymousClass6Pr) r2
            X.71P r0 = r2.A00
        L_0x0428:
            if (r0 == 0) goto L_0x0432
            X.0vl r0 = r0.A07
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x043b
        L_0x0432:
            r0 = 1
        L_0x0433:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0438:
            X.71P r0 = r2.A00
            goto L_0x0428
        L_0x043b:
            r0 = 0
            goto L_0x0433
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S4.invoke():java.lang.Object");
    }
}
