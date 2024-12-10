package com.whatsapp.gallerypicker;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass1L4;
import X.AnonymousClass3MY;
import X.AnonymousClass7S3;
import X.C106915Xr;
import X.C108945cZ;
import X.C108965cb;
import X.C108995ce;
import X.C114255qP;
import X.C114315qV;
import X.C124216Xm;
import X.C130436jQ;
import X.C136736uJ;
import X.C1422478s;
import X.C1422678u;
import X.C17880vN;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18100vl;
import X.C181769Rt;
import X.C29351c6;
import X.C72453Mb;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class GalleryPickerBottomSheetActivity extends GalleryPicker implements C106915Xr {
    public BottomSheetBehavior A00;
    public Float A01;
    public Integer A02;
    public final C18100vl A03 = AnonymousClass7S3.A00(this, 17);

    public void onConfigurationChanged(Configuration configuration) {
        String str;
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        this.A01 = A03();
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            r0.get();
            BottomSheetBehavior bottomSheetBehavior = this.A00;
            if (bottomSheetBehavior != null) {
                Float f = this.A01;
                boolean z = !AnonymousClass000.A1W(f);
                bottomSheetBehavior.A0h = z;
                if (f != null) {
                    bottomSheetBehavior.A0T(f.floatValue());
                }
                if (!z && f != null) {
                    bottomSheetBehavior.A0Z(new C114255qP(f, bottomSheetBehavior, 3));
                }
                A0Q();
                return;
            }
            str = "contentSheetBehaviour";
        } else {
            str = "mediaAttachmentUtils";
        }
        C18070vi.A11(str);
        throw null;
    }

    public void onCreate(Bundle bundle) {
        String str;
        Bundle A09;
        int i;
        super.onCreate(bundle);
        View A05 = C18070vi.A05(this.A00, 2131431065);
        BottomSheetBehavior bottomSheetBehavior = new BottomSheetBehavior();
        this.A00 = bottomSheetBehavior;
        bottomSheetBehavior.A0Z(new C114315qV(this, 8));
        this.A01 = A03();
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            C136736uJ r2 = (C136736uJ) r0.get();
            BottomSheetBehavior bottomSheetBehavior2 = this.A00;
            if (bottomSheetBehavior2 != null) {
                AnonymousClass1L4 r6 = this.A09;
                C18070vi.A0W(r6);
                Float f = this.A01;
                r2.A02(A05, bottomSheetBehavior2, this, r6, f, !AnonymousClass000.A1W(f), false);
                C181769Rt.A00(this, getSupportActionBar());
                C1422478s.A00(findViewById(2131431065), 6);
                C1422678u.A00(findViewById(2131434744), this, 16);
                A0Q();
                C130436jQ r3 = this.A0C;
                if (r3 != null) {
                    if (C124216Xm.A00(C108945cZ.A0E(r3.A01), r3.A03, r3.A05) && (A09 = AnonymousClass3MY.A09(this)) != null) {
                        int i2 = A09.getInt("origin", -1);
                        if (Integer.valueOf(i2) != null && i2 == 49 && (i = A09.getInt("entrypoint", 1)) != -1) {
                            this.A02 = Integer.valueOf(i);
                            return;
                        }
                        return;
                    }
                    return;
                }
                str = "logger";
            } else {
                str = "contentSheetBehaviour";
            }
        } else {
            str = "mediaAttachmentUtils";
        }
        C18070vi.A11(str);
        throw null;
    }

    private final Float A03() {
        int i;
        float f;
        if (!C72453Mb.A1a(this.A0M) || (i = C108965cb.A03(this).screenHeightDp) <= 500) {
            return null;
        }
        if (i < 1000) {
            f = 1.0f - ((((float) (i - 500)) * 0.5f) / 500.0f);
            if (0.0f >= f || f >= 1.0f) {
                return null;
            }
        } else {
            f = 0.5f;
        }
        if (C72453Mb.A1a(this.A03)) {
            return Float.valueOf(f);
        }
        return null;
    }

    private final void A0Q() {
        String str;
        AnonymousClass00H r0 = this.A0E;
        if (r0 != null) {
            C136736uJ r2 = (C136736uJ) r0.get();
            BottomSheetBehavior bottomSheetBehavior = this.A00;
            if (bottomSheetBehavior != null) {
                r2.A03(bottomSheetBehavior, AnonymousClass000.A1W(this.A01));
                return;
            }
            str = "contentSheetBehaviour";
        } else {
            str = "mediaAttachmentUtils";
        }
        C18070vi.A11(str);
        throw null;
    }

    public static final void A0V(GalleryPickerBottomSheetActivity galleryPickerBottomSheetActivity) {
        if (C18020vd.A05(C18040vf.A02, galleryPickerBottomSheetActivity.A0E, 11376)) {
            Set A0T = C108945cZ.A0g(galleryPickerBottomSheetActivity.A0L).A0T();
            ArrayList A0D = C29351c6.A0D(A0T);
            Iterator it = A0T.iterator();
            while (it.hasNext()) {
                C108995ce.A1P(A0D, it);
            }
            Intent putParcelableArrayListExtra = C17880vN.A0A().putParcelableArrayListExtra("result_extra_media_selection", C17880vN.A10(A0D));
            C18070vi.A0X(putParcelableArrayListExtra);
            galleryPickerBottomSheetActivity.setResult(0, putParcelableArrayListExtra);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        if (r0 == 2) goto L_0x007c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r8 = this;
            super.finish()
            r1 = 0
            r0 = 2130772007(0x7f010027, float:1.714712E38)
            r8.overridePendingTransition(r1, r0)
            X.6jQ r3 = r8.A0C
            if (r3 == 0) goto L_0x0083
            X.0ve r2 = r3.A03
            X.118 r0 = r3.A01
            android.content.Context r1 = X.C108945cZ.A0E(r0)
            X.1DC r0 = r3.A05
            boolean r0 = X.C124216Xm.A00(r1, r2, r0)
            if (r0 == 0) goto L_0x0078
            X.6jQ r5 = r8.A0C
            if (r5 == 0) goto L_0x0083
            java.lang.Integer r7 = r8.A02
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0078
            X.17x r1 = r5.A02
            java.lang.String[] r0 = X.AnonymousClass73I.A01()
            int r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0078
            java.lang.Integer r1 = r1.A05()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x0078
            r6 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            X.0ve r2 = r5.A03
            X.118 r0 = r5.A01
            android.content.Context r1 = X.C108945cZ.A0E(r0)
            X.1DC r0 = r5.A05
            boolean r0 = X.C124216Xm.A00(r1, r2, r0)
            if (r0 == 0) goto L_0x0075
            r3 = 3
            X.62f r2 = new X.62f
            r2.<init>()
            r1 = 1
            if (r7 == 0) goto L_0x0081
            int r0 = r7.intValue()
            if (r0 == 0) goto L_0x007c
            if (r0 != r1) goto L_0x0079
            java.lang.Integer r0 = X.AnonymousClass3MY.A0f()
        L_0x0066:
            r2.A01 = r0
            r2.A02 = r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.A00 = r0
            X.18K r0 = r5.A04
            r0.CC7(r2)
        L_0x0075:
            r0 = 1
            r5.A00 = r0
        L_0x0078:
            return
        L_0x0079:
            r1 = 2
            if (r0 != r6) goto L_0x0081
        L_0x007c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            goto L_0x0066
        L_0x0081:
            r0 = 0
            goto L_0x0066
        L_0x0083:
            java.lang.String r0 = "logger"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallerypicker.GalleryPickerBottomSheetActivity.finish():void");
    }
}
