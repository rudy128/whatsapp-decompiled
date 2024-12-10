package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Locale;

/* renamed from: X.7S3  reason: invalid class name */
public class AnonymousClass7S3 implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public AnonymousClass7S3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C18110vm A00(Object obj, int i) {
        return AnonymousClass1DF.A01(new AnonymousClass7S3(obj, i));
    }

    public static final boolean A01(Context context, String str, String str2) {
        String str3;
        try {
            PackageInfo A02 = C24211Jh.A02(context, str);
            if (!(A02 == null || TextUtils.isEmpty(A02.versionName) || (str3 = A02.versionName) == null)) {
                List A0S = AnonymousClass1YF.A0S(str3, new String[]{"."}, 0);
                String str4 = (String) C29431cG.A0c(A0S);
                if (str4 == null || !str4.equals("eng")) {
                    List A0S2 = AnonymousClass1YF.A0S(str2, new String[]{"."}, 0);
                    int i = 0;
                    while (i < A0S.size() && i < A0S2.size() && Long.parseLong(C17880vN.A0w(A0S, i)) <= Long.parseLong(C17880vN.A0w(A0S2, i))) {
                        if (Long.parseLong(C17880vN.A0w(A0S, i)) >= Long.parseLong(C17880vN.A0w(A0S2, i))) {
                            i++;
                        }
                    }
                }
                return true;
            }
        } catch (Exception e) {
            Log.e("FoaPresenceOnDeviceChecker/isPackageAtLeastVersion", e);
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02a7, code lost:
        if (A01(r1, "com.facebook.stella_debug", r2) == false) goto L_0x02ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02f2, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02f6, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02fb, code lost:
        return r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        r1.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0154, code lost:
        if (X.C25291Nq.A04(r1.A0E, 9285) == false) goto L_0x0156;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0083;
                case 1: goto L_0x0090;
                case 2: goto L_0x0097;
                case 3: goto L_0x00a4;
                case 4: goto L_0x02e8;
                case 5: goto L_0x00b0;
                case 6: goto L_0x0007;
                case 7: goto L_0x00c3;
                case 8: goto L_0x0033;
                case 9: goto L_0x003f;
                case 10: goto L_0x00e0;
                case 11: goto L_0x00ec;
                case 12: goto L_0x00f5;
                case 13: goto L_0x00f8;
                case 14: goto L_0x0103;
                case 15: goto L_0x011a;
                case 16: goto L_0x012b;
                case 17: goto L_0x013f;
                case 18: goto L_0x015c;
                case 19: goto L_0x017c;
                case 20: goto L_0x018c;
                case 21: goto L_0x01a3;
                case 22: goto L_0x01c5;
                case 23: goto L_0x01d6;
                case 24: goto L_0x01e7;
                case 25: goto L_0x01f6;
                case 26: goto L_0x0209;
                case 27: goto L_0x021f;
                case 28: goto L_0x0233;
                case 29: goto L_0x0242;
                case 30: goto L_0x0257;
                case 31: goto L_0x0268;
                case 32: goto L_0x02b0;
                case 33: goto L_0x02bd;
                case 34: goto L_0x02d2;
                case 35: goto L_0x0061;
                case 36: goto L_0x02fc;
                case 37: goto L_0x030d;
                case 38: goto L_0x0321;
                case 39: goto L_0x0332;
                case 40: goto L_0x0362;
                case 41: goto L_0x0376;
                case 42: goto L_0x0383;
                case 43: goto L_0x0393;
                case 44: goto L_0x03bc;
                case 45: goto L_0x03c9;
                case 46: goto L_0x03d6;
                case 47: goto L_0x03e8;
                case 48: goto L_0x03f8;
                case 49: goto L_0x03fe;
                default: goto L_0x0005;
            }
        L_0x0005:
            r3 = 0
        L_0x0006:
            return r3
        L_0x0007:
            java.lang.Object r1 = r9.A01
            X.3ho r1 = (X.C75603ho) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A08
            java.lang.Object r0 = r0.get()
            X.6xs r0 = (X.C138896xs) r0
            java.lang.Long r0 = r0.A00
            if (r0 == 0) goto L_0x0021
            java.lang.String r3 = r0.toString()
            if (r3 != 0) goto L_0x0006
        L_0x0021:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            long r0 = r0.nextLong()
            long r0 = java.lang.Math.abs(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            return r3
        L_0x0033:
            java.lang.Object r1 = r9.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1.A3O
            if (r0 == 0) goto L_0x0005
            X.4YE r1 = r1.A1l
            r0 = 1
            goto L_0x004a
        L_0x003f:
            java.lang.Object r1 = r9.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1.A3O
            if (r0 == 0) goto L_0x004e
            X.4YE r1 = r1.A1l
            r0 = 2
        L_0x004a:
            r1.A03(r0)
            goto L_0x0005
        L_0x004e:
            boolean r0 = r1.A3V
            if (r0 == 0) goto L_0x0005
            X.00H r0 = r1.A22
            java.lang.Object r2 = r0.get()
            X.1q1 r2 = (X.C37721q1) r2
            r1 = 1
            r0 = 18
            r2.A06(r1, r0)
            goto L_0x0005
        L_0x0061:
            java.lang.Object r2 = r9.A01
            com.whatsapp.mediaview.MediaViewFragment r2 = (com.whatsapp.mediaview.MediaViewFragment) r2
            X.205 r1 = r2.A0x
            r3 = 0
            if (r1 == 0) goto L_0x0006
            X.1W6 r0 = r2.A15
            X.206 r1 = X.C108945cZ.A0s(r1, r0)
            if (r1 == 0) goto L_0x0006
            boolean r0 = r1 instanceof X.AnonymousClass21V
            if (r0 != 0) goto L_0x0082
            boolean r0 = X.C20120A8f.A07(r1)
            if (r0 == 0) goto L_0x0006
            int r0 = r2.A03
            X.206 r1 = X.C20120A8f.A01(r1, r0)
        L_0x0082:
            return r1
        L_0x0083:
            java.lang.Object r0 = r9.A01
            X.7Fe r0 = (X.C143887Fe) r0
            X.0ve r1 = r0.A0R
            r0 = 9584(0x2570, float:1.343E-41)
            java.lang.Boolean r3 = X.AnonymousClass3MZ.A15(r1, r0)
            return r3
        L_0x0090:
            java.lang.Object r0 = r9.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.5Wl r3 = r0.A0I
            return r3
        L_0x0097:
            java.lang.Object r0 = r9.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.0ve r1 = r0.A1G
            r0 = 9875(0x2693, float:1.3838E-41)
            java.lang.Boolean r3 = X.AnonymousClass3MZ.A15(r1, r0)
            return r3
        L_0x00a4:
            java.lang.Object r0 = r9.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.1bI r0 = r0.A0Y
            if (r0 != 0) goto L_0x02f7
            java.lang.String r0 = "arEffectsTrayStub"
            goto L_0x02f2
        L_0x00b0:
            java.lang.Object r0 = r9.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.6lD r1 = r0.A16
            X.6u4 r0 = r0.A15
            int r0 = r0.A00
            boolean r0 = r1.A00(r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x00c3:
            java.lang.Object r1 = r9.A01
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            com.whatsapp.contact.picker.ContactPickerFragment.A0M(r1)
            r0 = 1
            r1.A3J = r0
            X.00H r0 = r1.A2b
            java.lang.Object r4 = r0.get()
            X.1Po r4 = (X.C25771Po) r4
            r3 = 0
            r2 = 38
            r1 = 1
            r0 = 0
            r4.A04(r3, r2, r0, r1)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x00e0:
            java.lang.Object r1 = r9.A01
            X.4aY r1 = (X.AnonymousClass4aY) r1
            X.4Xd r0 = r1.A2p
            X.AnonymousClass4aY.A1S(r1, r0)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x00ec:
            java.lang.Object r0 = r9.A01
            java.util.Locale r0 = (java.util.Locale) r0
            java.text.Collator r3 = java.text.Collator.getInstance(r0)
            return r3
        L_0x00f5:
            X.0wS r3 = X.C18460wS.A00
            return r3
        L_0x00f8:
            java.lang.Object r1 = r9.A01
            X.0vc r1 = (X.C18010vc) r1
            java.lang.String r0 = "consent"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x0103:
            java.lang.Object r1 = r9.A01
            X.2qs r1 = (X.C62152qs) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A06
            java.lang.Object r1 = r0.get()
            X.17w r1 = (X.C219117w) r1
            java.lang.Class<X.122> r0 = X.AnonymousClass122.class
            X.11a r3 = r1.A01(r0)
            return r3
        L_0x011a:
            java.lang.Object r1 = r9.A01
            X.5m1 r1 = (X.C112775m1) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r1 = r1.A09
            r0 = 9875(0x2693, float:1.3838E-41)
            java.lang.Boolean r3 = X.AnonymousClass3MZ.A15(r1, r0)
            return r3
        L_0x012b:
            java.lang.Object r0 = r9.A01
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = 0
            android.content.Intent r1 = r0.getIntent()
            java.lang.String r0 = "is_coming_from_chat"
            boolean r0 = r1.getBooleanExtra(r0, r2)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x013f:
            java.lang.Object r1 = r9.A01
            com.whatsapp.gallerypicker.GalleryPicker r1 = (com.whatsapp.gallerypicker.GalleryPicker) r1
            X.0vl r0 = r1.A0M
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0156
            X.0ve r1 = r1.A0E
            r0 = 9285(0x2445, float:1.3011E-41)
            boolean r1 = X.C25291Nq.A04(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0157
        L_0x0156:
            r0 = 0
        L_0x0157:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x015c:
            java.lang.Object r2 = r9.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r2 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r2
            com.whatsapp.WaTextView r0 = r2.A06
            X.C72453Mb.A1B(r0)
            android.view.View r0 = r2.A04
            X.C72453Mb.A1B(r0)
            X.5kp r1 = r2.A0H
            if (r1 == 0) goto L_0x0176
            java.util.ArrayList r0 = r1.A00
            r0.clear()
            r1.notifyDataSetChanged()
        L_0x0176:
            com.whatsapp.gallerypicker.GalleryPickerFragment.A02(r2)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x017c:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r0)
            r0 = 2131166893(0x7f0706ad, float:1.7948044E38)
            java.lang.Integer r3 = X.AnonymousClass3MY.A0i(r1, r0)
            return r3
        L_0x018c:
            java.lang.Object r0 = r9.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r0 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r0
            X.1Vd r2 = r0.A0A
            if (r2 == 0) goto L_0x019f
            android.content.Context r1 = r0.A14()
            java.lang.String r0 = "gallery-picker-fragment"
            X.1pZ r3 = r2.A06(r1, r0)
            return r3
        L_0x019f:
            java.lang.String r0 = "contactPhotos"
            goto L_0x02f2
        L_0x01a3:
            java.lang.Object r0 = r9.A01
            com.whatsapp.gallerypicker.GalleryPickerFragment r0 = (com.whatsapp.gallerypicker.GalleryPickerFragment) r0
            X.00H r0 = r0.A0L
            if (r0 == 0) goto L_0x01c1
            java.lang.Object r1 = r0.get()
            X.4Rw r1 = (X.C86504Rw) r1
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x01be
            com.whatsapp.gallery.views.GalleryPartialPermissionBanner r0 = r1.A00
            if (r0 == 0) goto L_0x01be
            r0 = 1
            r1.A01 = r0
        L_0x01be:
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x01c1:
            java.lang.String r0 = "galleryPartialPermissionProvider"
            goto L_0x02f2
        L_0x01c5:
            java.lang.Object r0 = r9.A01
            X.5nP r0 = (X.C113635nP) r0
            X.AnonymousClass3MX.A1O(r0)
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131431496(0x7f0b1048, float:1.8484723E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01d6:
            java.lang.Object r0 = r9.A01
            X.5nP r0 = (X.C113635nP) r0
            X.AnonymousClass3MX.A1O(r0)
            android.view.ViewGroup r1 = r0.A01
            r0 = 2131437025(0x7f0b25e1, float:1.8495937E38)
            android.view.View r3 = r1.findViewById(r0)
            return r3
        L_0x01e7:
            java.lang.Object r0 = r9.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            X.0ve r1 = r0.A27()
            r0 = 9875(0x2693, float:1.3838E-41)
            java.lang.Boolean r3 = X.AnonymousClass3MZ.A15(r1, r0)
            return r3
        L_0x01f6:
            java.lang.Object r0 = r9.A01
            com.whatsapp.gallery.MediaGalleryFragmentBase r0 = (com.whatsapp.gallery.MediaGalleryFragmentBase) r0
            X.0ve r1 = r0.A27()
            r0 = 12472(0x30b8, float:1.7477E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0209:
            java.lang.Object r1 = r9.A01
            X.5f7 r1 = (X.C110215f7) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.Context r1 = r1.A02
            r0 = 2131103204(0x7f060de4, float:1.7818868E38)
            int r0 = X.C19740yt.A00(r1, r0)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x021f:
            java.lang.Object r1 = r9.A01
            X.5f7 r1 = (X.C110215f7) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vl r0 = r1.A03
            int r0 = X.C72453Mb.A0I(r0)
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>(r0)
            return r3
        L_0x0233:
            java.lang.Object r1 = r9.A01
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0wl r0 = r1.A0G
            X.1OY r3 = X.AnonymousClass1OW.A02(r0)
            return r3
        L_0x0242:
            java.lang.Object r1 = r9.A01
            com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel r1 = (com.whatsapp.gallerypicker.viewmodels.GalleryPickerViewModel) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r1 = r1.A0C
            r0 = 12472(0x30b8, float:1.7477E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x0257:
            java.lang.Object r1 = r9.A01
            com.whatsapp.glasses.SUPBottomSheetView r1 = (com.whatsapp.glasses.SUPBottomSheetView) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            int r0 = r1.A00
            int r0 = r0 + 1
            r1.A00 = r0
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x0268:
            java.lang.Object r4 = r9.A01
            X.6je r4 = (X.C130566je) r4
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            X.0ve r2 = r4.A04
            r1 = 9709(0x25ed, float:1.3605E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x02a9
            X.6fJ r1 = r4.A05
            X.0vl r0 = r1.A01
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x02ae
            r0 = 9607(0x2587, float:1.3462E-41)
            java.lang.String r2 = X.C108955ca.A0v(r2, r0)
            int r0 = r2.length()
            if (r0 == 0) goto L_0x02a9
            X.118 r0 = r1.A00
            android.content.Context r1 = X.C108945cZ.A0E(r0)
            java.lang.String r0 = "com.facebook.stella"
            boolean r0 = A01(r1, r0, r2)
            if (r0 != 0) goto L_0x02a9
            java.lang.String r0 = "com.facebook.stella_debug"
            boolean r0 = A01(r1, r0, r2)
            if (r0 == 0) goto L_0x02ae
        L_0x02a9:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L_0x02ae:
            r3 = 0
            goto L_0x02a9
        L_0x02b0:
            java.lang.Object r1 = r9.A01
            X.0vd r1 = (X.C18020vd) r1
            java.lang.Boolean r0 = X.C17960vV.A01
            r0 = 6144(0x1800, float:8.61E-42)
            java.lang.Boolean r3 = X.AnonymousClass3MZ.A15(r1, r0)
            return r3
        L_0x02bd:
            java.lang.Boolean r0 = X.C17960vV.A01
            java.lang.String r2 = "WAHeroPlayerThread"
            r1 = -2
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r2, r1)
            r0.start()
            android.os.Looper r3 = r0.getLooper()
            X.C18070vi.A0X(r3)
            return r3
        L_0x02d2:
            java.lang.Object r0 = r9.A01
            com.whatsapp.identity.ScanQrCodeActivity r0 = (com.whatsapp.identity.ScanQrCodeActivity) r0
            X.1M9 r1 = r0.A05
            if (r1 == 0) goto L_0x02e5
            X.0vl r0 = r0.A0G
            X.1BI r0 = X.AnonymousClass3MX.A0m(r0)
            X.1E7 r3 = r1.A0H(r0)
            return r3
        L_0x02e5:
            java.lang.String r0 = "contactManager"
            goto L_0x02f2
        L_0x02e8:
            java.lang.Object r0 = r9.A01
            X.7DY r0 = (X.AnonymousClass7DY) r0
            X.1bI r0 = r0.A0W
            if (r0 != 0) goto L_0x02f7
            java.lang.String r0 = "arEffectsButtonHeaderStub"
        L_0x02f2:
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x02f7:
            android.view.View r3 = r0.A02()
            return r3
        L_0x02fc:
            java.lang.Object r1 = r9.A01
            X.6eU r1 = (X.C127516eU) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "message_translation_prefs"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x030d:
            java.lang.Object r0 = r9.A01
            X.6k4 r0 = (X.C130826k4) r0
            r1 = 0
            X.C18070vi.A0d(r0, r1)
            X.00H r0 = r0.A07
            X.10I r0 = X.AnonymousClass3MX.A0x(r0)
            X.10s r3 = new X.10s
            r3.<init>(r0, r1)
            return r3
        L_0x0321:
            java.lang.Object r1 = r9.A01
            X.6eV r1 = (X.C127526eV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "meta_ai_voice_message_store_prefs"
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x0332:
            java.lang.Object r1 = r9.A01
            X.6AT r1 = (X.AnonymousClass6AT) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.10I r6 = r1.A08
            X.1KB r3 = r1.A03
            X.181 r4 = r1.A05
            X.1D9 r5 = r1.A07
            X.118 r0 = r1.A06
            java.io.File r1 = X.C108945cZ.A16(r0)
            java.lang.String r0 = "voice_image_cache"
            java.io.File r7 = X.C17880vN.A0e(r1, r0)
            java.lang.String r8 = "voice-image"
            X.4Ra r2 = new X.4Ra
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 16777216(0x1000000, double:8.289046E-317)
            r2.A01 = r0
            r0 = 1
            r2.A05 = r0
            X.4VT r3 = r2.A00()
            return r3
        L_0x0362:
            java.lang.Object r0 = r9.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.content.res.Resources r1 = X.AnonymousClass3MZ.A09(r0)
            r0 = 2131165313(0x7f070081, float:1.794484E38)
            float r0 = r1.getDimension(r0)
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        L_0x0376:
            java.lang.Object r0 = r9.A01
            com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel r0 = (com.whatsapp.metaai.voice.ui.MetaAiVoiceViewModel) r0
            X.1wy r1 = r0.A0Q
            r0 = 0
            r1.A0F(r0)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x0383:
            java.lang.Object r2 = r9.A01
            X.AnonymousClass3MX.A1O(r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0 = 3
            X.5dh r3 = new X.5dh
            r3.<init>(r1, r2, r0)
            return r3
        L_0x0393:
            java.lang.Object r0 = r9.A01
            com.whatsapp.music.ui.MusicBrowseFragment r0 = (com.whatsapp.music.ui.MusicBrowseFragment) r0
            X.0vl r0 = r0.A0D
            java.lang.Object r4 = r0.getValue()
            X.5iT r4 = (X.C111155iT) r4
            android.os.Bundle r1 = r4.A00
            r3 = 0
            if (r1 == 0) goto L_0x03ba
            java.lang.String r0 = "search_text"
            java.lang.String r2 = r1.getString(r0)
        L_0x03aa:
            android.os.Bundle r1 = r4.A00
            if (r1 == 0) goto L_0x03b4
            java.lang.String r0 = "artist_id"
            java.lang.String r3 = r1.getString(r0)
        L_0x03b4:
            r4.A0T(r2, r3)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        L_0x03ba:
            r2 = r3
            goto L_0x03aa
        L_0x03bc:
            java.lang.Object r2 = r9.A01
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0 = 4
            X.5dh r3 = new X.5dh
            r3.<init>(r1, r2, r0)
            return r3
        L_0x03c9:
            java.lang.Object r2 = r9.A01
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0 = 5
            X.5dh r3 = new X.5dh
            r3.<init>(r1, r2, r0)
            return r3
        L_0x03d6:
            java.lang.Object r1 = r9.A01
            android.view.View r1 = (android.view.View) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            android.content.Context r0 = r1.getContext()
            X.5r5 r3 = new X.5r5
            r3.<init>(r0)
            return r3
        L_0x03e8:
            java.lang.Object r1 = r9.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 2131894929(0x7f122291, float:1.9424677E38)
            java.lang.String r3 = r1.getString(r0)
            return r3
        L_0x03f8:
            X.BGo r3 = new X.BGo
            r3.<init>()
            return r3
        L_0x03fe:
            java.lang.Object r1 = r9.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "android.app.action.SET_NEW_PASSWORD"
            android.content.Intent r0 = X.C108945cZ.A0G(r0)
            r1.startActivity(r0)
            X.1Wu r3 = X.C27621Wu.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7S3.invoke():java.lang.Object");
    }

    public AnonymousClass7S3(Locale locale, int i) {
        this.A00 = i;
        this.A01 = locale;
    }
}
