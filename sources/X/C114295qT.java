package X;

import android.view.View;
import com.whatsapp.camera.DragGalleryStripIndicator;

/* renamed from: X.5qT  reason: invalid class name and case insensitive filesystem */
public class C114295qT extends C6X {
    public boolean A00 = false;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ AnonymousClass7DY A02;
    public final /* synthetic */ AnonymousClass701 A03;
    public final /* synthetic */ C20050A4v A04;

    public C114295qT(AnonymousClass1FU r2, AnonymousClass7DY r3, AnonymousClass701 r4, C20050A4v a4v) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = a4v;
        this.A01 = r2;
    }

    public void A02(View view, float f) {
        String str;
        AnonymousClass7DY r1 = this.A02;
        View view2 = r1.A07;
        if (view2 == null) {
            str = "cameraActions";
        } else {
            float f2 = 1.0f - f;
            view2.setAlpha(f2);
            C133936pk r0 = r1.A0Q;
            if (r0 == null) {
                str = "cameraModeTabController";
            } else {
                r0.A02.setAlpha(f2);
                C140086zv r02 = r1.A0T;
                if (r02 == null) {
                    str = "recordingController";
                } else {
                    r02.A06.setAlpha(f2);
                    C133796pV r2 = r1.A0S;
                    if (r2 == null) {
                        str = "overlaysController";
                    } else {
                        r2.A00.setBackgroundColor(((int) (255.0f * f)) << 24);
                        AnonymousClass701 r22 = this.A03;
                        if (r22.A05.getConfiguration().orientation != 2 || r22.A0H) {
                            r22.A0B.setAlpha(f2);
                            DragGalleryStripIndicator dragGalleryStripIndicator = r22.A0D;
                            if (dragGalleryStripIndicator != null) {
                                dragGalleryStripIndicator.setAlpha(f2);
                            }
                        }
                        r22.A08.setAlpha(f);
                        return;
                    }
                }
            }
        }
        C18070vi.A11(str);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(android.view.View r19, int r20) {
        /*
            r18 = this;
            r9 = 8
            r7 = 4
            r5 = 0
            r1 = 3
            r6 = r18
            r8 = r20
            if (r8 != r1) goto L_0x00d2
            X.701 r0 = r6.A03
            android.view.View r0 = r0.A0A
            r0.setVisibility(r9)
        L_0x0012:
            X.701 r4 = r6.A03
            r3 = 1
            r4.A03(r3)
            X.7DY r10 = r6.A02
            boolean r12 = r6.A00
            androidx.fragment.app.Fragment r2 = r10.A0v
            r11 = 0
            boolean r0 = X.AnonymousClass000.A1S(r8, r7)
            r2.A23(r0)
            java.lang.String r17 = "cameraBottomSheetController"
            java.lang.String r16 = "cameraActions"
            if (r8 != r1) goto L_0x00b8
            if (r12 != 0) goto L_0x0049
            boolean r0 = r2 instanceof X.C1606389i
            if (r0 == 0) goto L_0x0049
            r15 = r2
            X.89i r15 = (X.C1606389i) r15
            X.6u4 r0 = r10.A15
            java.util.List r14 = r0.A08
            X.C18070vi.A0X(r14)
            java.util.Set r13 = r0.A09
            X.C18070vi.A0X(r13)
            X.73D r0 = r0.A03
            X.C18070vi.A0X(r0)
            r15.CKe(r0, r14, r13)
        L_0x0049:
            X.0z4 r0 = r10.A1E
            android.content.SharedPreferences$Editor r13 = X.C19830z4.A00(r0)
            java.lang.String r0 = "show_camera_gallery_tip"
            X.C17880vN.A1F(r13, r0, r5)
            android.view.View r0 = r10.A07
            if (r0 == 0) goto L_0x00ce
            r0.setVisibility(r7)
            X.701 r0 = r10.A0P
            if (r0 == 0) goto L_0x0069
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0C
            r0.A00 = r3
        L_0x0063:
            X.6pk r13 = r10.A0Q
            if (r13 != 0) goto L_0x006e
            java.lang.String r17 = "cameraModeTabController"
        L_0x0069:
            X.C18070vi.A11(r17)
        L_0x006c:
            r0 = 0
            throw r0
        L_0x006e:
            r0 = 0
            if (r8 != r1) goto L_0x0072
            r0 = 4
        L_0x0072:
            r13.A01(r0)
            if (r8 != r1) goto L_0x0078
            r11 = 4
        L_0x0078:
            X.88v r0 = r10.A0R
            if (r0 == 0) goto L_0x007f
            r0.setVisibility(r11)
        L_0x007f:
            if (r8 != r7) goto L_0x00dd
            if (r12 == 0) goto L_0x0098
            boolean r0 = r2 instanceof X.C1606389i
            if (r0 == 0) goto L_0x0098
            X.89i r2 = (X.C1606389i) r2
            X.6u4 r0 = r10.A15
            java.util.Set r1 = r0.A09
            X.C18070vi.A0X(r1)
            X.73D r0 = r0.A03
            X.C18070vi.A0X(r0)
            r2.BYp(r0, r1)
        L_0x0098:
            X.741 r2 = r10.A0M
            if (r2 != 0) goto L_0x00a2
            java.lang.String r0 = "cameraActionsController"
        L_0x009e:
            X.C18070vi.A11(r0)
            goto L_0x006c
        L_0x00a2:
            X.6u4 r0 = r10.A15
            java.util.Set r0 = r0.A09
            boolean r1 = X.C108945cZ.A1U(r0)
            int r0 = r0.size()
            r2.A0D(r1, r0)
            X.6pV r2 = r10.A0S
            if (r2 != 0) goto L_0x0135
            java.lang.String r0 = "overlaysController"
            goto L_0x009e
        L_0x00b8:
            android.view.View r0 = r10.A07
            if (r0 == 0) goto L_0x00ce
            r0.setVisibility(r5)
            X.6u4 r0 = r10.A15
            int r0 = r0.A01
            if (r0 == r3) goto L_0x0063
            X.701 r0 = r10.A0P
            if (r0 == 0) goto L_0x0069
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r0.A0C
            r0.A00 = r5
            goto L_0x0063
        L_0x00ce:
            X.C18070vi.A11(r16)
            goto L_0x006c
        L_0x00d2:
            if (r8 != r7) goto L_0x0012
            X.701 r0 = r6.A03
            android.view.View r0 = r0.A0A
            r0.setVisibility(r5)
            goto L_0x0012
        L_0x00dd:
            if (r8 != r3) goto L_0x00eb
            boolean r0 = r4.A0G
            if (r0 != 0) goto L_0x0145
            com.whatsapp.camera.CameraBottomSheetBehavior r0 = r4.A0C
            r0.A0W(r7)
            r6.A00 = r5
        L_0x00ea:
            return
        L_0x00eb:
            if (r8 != r1) goto L_0x0145
            X.A4v r8 = r6.A04
            r0 = 65
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 6
            r0 = 17
            r8.A02(r2, r1, r0)
            X.1FU r2 = r6.A01
            r1 = 2130969990(0x7f040586, float:1.7548677E38)
            r0 = 2131101076(0x7f060594, float:1.7814551E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.C28281Zt.A06(r2, r0)
            r1 = 2130970285(0x7f0406ad, float:1.7549276E38)
            r0 = 2131101276(0x7f06065c, float:1.7814957E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            X.C28281Zt.A07(r2, r0, r3)
            android.view.View r0 = r4.A07
            if (r0 == 0) goto L_0x011e
            r0.setVisibility(r7)
        L_0x011e:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            r0.setVisibility(r7)
            r6.A00 = r3
        L_0x0125:
            android.view.View r1 = r4.A08
            r1.setEnabled(r3)
            com.whatsapp.gallery.GalleryTabHostFragment r0 = r4.A0E
            if (r0 == 0) goto L_0x0131
            r0.A29(r3)
        L_0x0131:
            r1.setVisibility(r5)
            return
        L_0x0135:
            X.118 r0 = r10.A1D
            android.content.Context r1 = r0.A00
            r0 = 2131103368(0x7f060e88, float:1.78192E38)
            int r1 = X.C19740yt.A00(r1, r0)
            android.view.View r0 = r2.A00
            r0.setBackgroundColor(r1)
        L_0x0145:
            X.1FU r2 = r6.A01
            android.view.Window r0 = r2.getWindow()
            X.C28281Zt.A0A(r0, r5)
            int r0 = X.AnonymousClass4Z9.A01(r2, r5)
            X.C28281Zt.A05(r2, r0)
            r1 = 2130968944(0x7f040170, float:1.7546556E38)
            r0 = 2131100005(0x7f060165, float:1.781238E38)
            int r1 = X.AnonymousClass1YL.A00(r2, r1, r0)
            r0 = 2
            X.C28281Zt.A07(r2, r1, r0)
            android.view.View r1 = r4.A07
            if (r1 == 0) goto L_0x016f
            boolean r0 = r4.A0G
            if (r0 == 0) goto L_0x016c
            r9 = 0
        L_0x016c:
            r1.setVisibility(r9)
        L_0x016f:
            androidx.recyclerview.widget.RecyclerView r0 = r4.A0B
            r0.setVisibility(r5)
            if (r8 != r7) goto L_0x0125
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x017d
            X.AnonymousClass701.A00(r4)
        L_0x017d:
            r6.A00 = r5
            android.view.View r0 = r4.A08
            r0.setEnabled(r5)
            com.whatsapp.gallery.GalleryTabHostFragment r0 = r4.A0E
            if (r0 == 0) goto L_0x00ea
            r0.A29(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114295qT.A03(android.view.View, int):void");
    }
}
