package X;

import android.view.View;

/* renamed from: X.2OJ  reason: invalid class name */
public class AnonymousClass2OJ extends AnonymousClass38H {
    public final C18030ve A00;

    public String BTj() {
        if (this instanceof AnonymousClass2O8) {
            return "video_upload_quality";
        }
        if (this instanceof AnonymousClass2O7) {
            return "photo_upload_quality";
        }
        return "media_upload_quality_section";
    }

    public String BWD() {
        if ((this instanceof AnonymousClass2O8) || (this instanceof AnonymousClass2O7)) {
            return "media_upload_quality_section";
        }
        return "storage_and_data";
    }

    public String BXZ() {
        AnonymousClass118 r1;
        int i;
        if (this instanceof AnonymousClass2O8) {
            r1 = this.A01;
            i = 2131896060;
        } else {
            boolean z = this instanceof AnonymousClass2O7;
            r1 = this.A01;
            if (z) {
                i = 2131895969;
            } else {
                i = 2131895923;
            }
        }
        String A01 = r1.A01(i);
        C18070vi.A0X(A01);
        return A01;
    }

    public View BbT(View view) {
        int i;
        if (this instanceof AnonymousClass2O8) {
            C18070vi.A0d(view, 0);
            i = 2131435261;
        } else if (this instanceof AnonymousClass2O7) {
            C18070vi.A0d(view, 0);
            i = 2131435249;
        } else {
            C18070vi.A0d(view, 0);
            i = 2131432416;
        }
        return view.findViewById(i);
    }

    public boolean BgM() {
        if ((this instanceof AnonymousClass2O8) || (this instanceof AnonymousClass2O7)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        if (X.C18020vd.A05(r2, r3, 2653) == false) goto L_0x0010;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (X.C18020vd.A05(r2, r3, 662) != false) goto L_0x0010;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bh4() {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.AnonymousClass2O8
            if (r0 == 0) goto L_0x001b
            X.0ve r3 = r4.A00
            r0 = 662(0x296, float:9.28E-43)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0019
        L_0x0010:
            r0 = 7589(0x1da5, float:1.0634E-41)
            boolean r1 = X.C18020vd.A05(r2, r3, r0)
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            return r0
        L_0x001b:
            boolean r1 = r4 instanceof X.AnonymousClass2O7
            X.0ve r3 = r4.A00
            r0 = 702(0x2be, float:9.84E-43)
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r1 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x0019
            r0 = 2653(0xa5d, float:3.718E-42)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0019
            goto L_0x0010
        L_0x0034:
            if (r0 == 0) goto L_0x0048
            r0 = 2653(0xa5d, float:3.718E-42)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0048
            r0 = 7589(0x1da5, float:1.0634E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0048
        L_0x0046:
            r0 = 1
            return r0
        L_0x0048:
            r0 = 662(0x296, float:9.28E-43)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 == 0) goto L_0x0019
            r0 = 7589(0x1da5, float:1.0634E-41)
            boolean r0 = X.C18020vd.A05(r2, r3, r0)
            if (r0 != 0) goto L_0x0019
            goto L_0x0046
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2OJ.Bh4():boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2OJ(AnonymousClass118 r1, C18030ve r2) {
        super(r1);
        C18070vi.A0j(r1, r2);
        this.A00 = r2;
    }
}
