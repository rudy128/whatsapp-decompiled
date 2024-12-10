package X;

/* renamed from: X.7P2  reason: invalid class name */
public class AnonymousClass7P2 implements C107745aW {
    public final int A00;
    public final Object A01;

    public AnonymousClass7P2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0090, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r0.A0E, 6132) == false) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x012c, code lost:
        if (X.C72453Mb.A1a(com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A03(r0).A08) == false) goto L_0x012e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bq8() {
        /*
            r50 = this;
            r3 = r50
            int r0 = r3.A00
            r2 = 0
            if (r0 == 0) goto L_0x0013
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r0 = r3.A01
            X.1dr r0 = (X.C30391dr) r0
            r0.resumeWith(r1)
            return
        L_0x0013:
            java.lang.Object r0 = r3.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r0 = (com.whatsapp.mediacomposer.MediaComposerActivity) r0
            X.73D r1 = r0.A1q
            r20 = r1
            java.util.ArrayList r1 = r20.A04()
            java.util.Iterator r3 = r1.iterator()
        L_0x0023:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0096
            java.lang.Object r1 = r3.next()
            X.72S r1 = (X.AnonymousClass72S) r1
            java.lang.String r1 = r1.A0E()
            boolean r1 = X.AnonymousClass1EG.A0H(r1)
            if (r1 != 0) goto L_0x0023
            r3 = 1
        L_0x003a:
            r1 = 1
            if (r3 == 0) goto L_0x0042
            X.4Xm r3 = r0.A0Q
            r3.A00()
        L_0x0042:
            X.4Xm r5 = r0.A0Q
            X.4fO r4 = new X.4fO
            r4.<init>(r1)
            r3 = 109(0x6d, float:1.53E-43)
            r5.A01(r4, r3)
            X.6q7 r3 = X.C108955ca.A0V(r0)
            r3.A03 = r2
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "MediaComposerActivity/sendmedia uris size = "
            r4.append(r3)
            int r3 = X.AnonymousClass7JS.A01(r0)
            X.C17900vP.A0o(r4, r3)
            boolean r6 = com.whatsapp.mediacomposer.MediaComposerActivity.A1G(r0)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "send"
            boolean r43 = r4.getBooleanExtra(r3, r1)
            X.7JS r3 = r0.A0X
            boolean r3 = r3.A0N
            if (r3 == 0) goto L_0x0098
            if (r43 == 0) goto L_0x0098
            java.util.List r3 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A04(r0)
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0098
            if (r6 == 0) goto L_0x0092
            X.0ve r5 = r0.A0E
            r4 = 6132(0x17f4, float:8.593E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r3, r5, r4)
            if (r3 != 0) goto L_0x0098
        L_0x0092:
            com.whatsapp.mediacomposer.MediaComposerActivity.A1E(r0, r2)
            return
        L_0x0096:
            r3 = 0
            goto L_0x003a
        L_0x0098:
            X.00H r3 = r0.A11
            java.lang.Object r4 = r3.get()
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            if (r6 == 0) goto L_0x00b8
            X.1Le r3 = r0.A0M
            boolean r3 = r3.A0I()
            if (r3 == 0) goto L_0x00b2
            X.1Le r3 = r0.A0M
            boolean r3 = r3.A0H()
            if (r3 == 0) goto L_0x00b8
        L_0x00b2:
            if (r4 == 0) goto L_0x00b8
            r0.CMl(r4)
            return
        L_0x00b8:
            X.7JN r3 = r0.A0a
            X.6rx r3 = r3.A0A
            com.whatsapp.WaImageButton r3 = r3.A01
            r3.setEnabled(r2)
            com.whatsapp.mediacomposer.MediaComposerActivity.A0z(r0)
            com.whatsapp.mediacomposer.MediaComposerActivity.A10(r0)
            X.7JS r3 = r0.A0X
            boolean r3 = r3.A0N
            if (r3 == 0) goto L_0x0386
            X.206 r22 = com.whatsapp.mediacomposer.MediaComposerActivity.A0q(r0)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "picker_open_time"
            long r38 = X.C108975cc.A06(r4, r3)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "number_from_url"
            boolean r42 = r4.getBooleanExtra(r3, r2)
            int r37 = r0.BUd()
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "is_new_content"
            boolean r45 = r4.getBooleanExtra(r3, r2)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "gallery_duration_ms"
            long r40 = X.C108975cc.A05(r4, r3)
            android.content.Intent r4 = r0.getIntent()
            java.lang.String r3 = "extra_status_api_metadata"
            android.os.Parcelable r10 = r4.getParcelableExtra(r3)
            X.77N r10 = (X.AnonymousClass77N) r10
            r0.A1Z = r1
            X.1KB r6 = r0.A05
            java.lang.Runnable r5 = r0.A1u
            r3 = 300(0x12c, double:1.48E-321)
            r6.A0K(r5, r3)
            X.6kY r3 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A03(r0)
            java.util.List r3 = r3.A05
            int r3 = r3.size()
            if (r3 <= 0) goto L_0x012e
            X.6kY r3 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A03(r0)
            X.0vl r3 = r3.A08
            boolean r3 = X.C72453Mb.A1a(r3)
            r47 = 1
            if (r3 != 0) goto L_0x0130
        L_0x012e:
            r47 = 0
        L_0x0130:
            X.72S r3 = com.whatsapp.mediacomposer.MediaComposerActivity.A0c(r0)
            java.lang.String r19 = r3.A0F()
            X.1KW r8 = r0.A0D
            X.0vb r7 = r0.A0K
            X.1Sw r6 = r0.A0t
            X.0ve r5 = r0.A0E
            X.1Nq r4 = r0.A0U
            X.1T1 r3 = r0.A0E
            X.6yp r11 = X.C1409573s.A06
            r12 = r0
            r13 = r3
            r14 = r7
            r15 = r8
            r16 = r5
            r17 = r4
            r18 = r6
            X.73s r5 = r11.A02(r12, r13, r14, r15, r16, r17, r18, r19)
            if (r5 == 0) goto L_0x023f
            android.graphics.RectF r3 = r5.A02
            float r4 = r3.width()
            float r3 = r3.height()
            java.util.ArrayList r3 = r5.A06(r4, r3)
            if (r3 == 0) goto L_0x023f
            java.util.Iterator r5 = r3.iterator()
        L_0x016a:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x023f
            java.lang.Object r3 = r5.next()
            com.whatsapp.InteractiveAnnotation r3 = (com.whatsapp.InteractiveAnnotation) r3
            java.lang.Object r3 = r3.data
            boolean r4 = r3 instanceof X.C20947Ac1
            if (r4 == 0) goto L_0x016a
            X.Ac1 r3 = (X.C20947Ac1) r3
            if (r3 == 0) goto L_0x023f
            X.7JM r9 = new X.7JM
            r9.<init>(r3)
        L_0x0185:
            java.util.List r11 = X.AnonymousClass7JS.A03(r0)
            X.6wV r3 = r0.A0h
            boolean r3 = X.C138766xe.A00(r3)
            if (r3 == 0) goto L_0x01a3
            com.whatsapp.mediacomposer.MediaComposerFragment r3 = com.whatsapp.mediacomposer.MediaComposerActivity.A0d(r0)
            if (r3 == 0) goto L_0x01a3
            r11.clear()
            com.whatsapp.mediacomposer.MediaComposerFragment r3 = com.whatsapp.mediacomposer.MediaComposerActivity.A0d(r0)
            android.net.Uri r3 = r3.A01
            r11.add(r3)
        L_0x01a3:
            X.7JS r5 = r0.A0X
            com.whatsapp.mediacomposer.MediaComposerFragment r3 = com.whatsapp.mediacomposer.MediaComposerActivity.A0d(r0)
            r7 = 0
            if (r3 == 0) goto L_0x01c3
            android.net.Uri r4 = r3.A01
            if (r4 == 0) goto L_0x01c3
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r3 = r0.A0j
            java.util.HashSet r3 = r3.A0U()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x01c3
            boolean r3 = com.whatsapp.mediacomposer.MediaComposerActivity.A1F(r0)
            if (r3 == 0) goto L_0x01c3
            r7 = 1
        L_0x01c3:
            X.0ve r4 = r5.A07
            r3 = 8033(0x1f61, float:1.1257E-41)
            X.0vf r6 = X.C18040vf.A02
            boolean r3 = X.C18020vd.A05(r6, r4, r3)
            if (r3 == 0) goto L_0x01e2
            X.6rz r3 = r5.A00
            if (r3 == 0) goto L_0x0234
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r7)
            java.lang.Long r7 = r3.A02
            java.lang.Integer r3 = r3.A01
            X.6rz r4 = new X.6rz
            r4.<init>(r8, r3, r7)
        L_0x01e0:
            r5.A00 = r4
        L_0x01e2:
            X.00H r3 = r0.A1D
            X.0ve r4 = X.C108955ca.A0R(r3)
            r3 = 9400(0x24b8, float:1.3172E-41)
            boolean r3 = X.C18020vd.A05(r6, r4, r3)
            if (r3 == 0) goto L_0x0231
            int r4 = X.C72453Mb.A08(r0)
            r3 = 2
            if (r4 == r3) goto L_0x01f8
            r1 = 0
        L_0x01f8:
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r1)
        L_0x01fc:
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r1 = "apply_rotation_on_not_send"
            boolean r49 = r3.getBooleanExtra(r1, r2)
            X.0ve r1 = r0.A0E
            boolean r1 = X.C1402270m.A02(r1)
            if (r1 == 0) goto L_0x0242
            java.util.Iterator r3 = X.C108965cb.A0u(r0)
        L_0x0212:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x0242
            java.lang.Object r2 = r3.next()
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            boolean r1 = r2 instanceof com.whatsapp.mediacomposer.VideoComposerFragment
            if (r1 == 0) goto L_0x0212
            com.whatsapp.mediacomposer.VideoComposerFragment r2 = (com.whatsapp.mediacomposer.VideoComposerFragment) r2
            java.lang.String r1 = "VideoComposerFragment/release"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.70X r1 = r2.A0W
            if (r1 == 0) goto L_0x0212
            r1.A0D()
            goto L_0x0212
        L_0x0231:
            r24 = 0
            goto L_0x01fc
        L_0x0234:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r3 = 0
            X.6rz r4 = new X.6rz
            r4.<init>(r7, r3, r3)
            goto L_0x01e0
        L_0x023f:
            r9 = 0
            goto L_0x0185
        L_0x0242:
            X.6ZQ r7 = r0.A0C
            java.util.List r33 = com.whatsapp.mediacomposer.viewmodel.MediaJidViewModel.A04(r0)
            java.util.Collection r15 = r0.A1v
            X.6q7 r1 = X.C108955ca.A0V(r0)
            X.00H r1 = r1.A0A
            java.lang.Object r1 = r1.get()
            X.2iz r1 = (X.C57382iz) r1
            java.util.Map r14 = r1.A00
            java.util.HashSet r13 = r0.A1x
            com.whatsapp.mediacomposer.viewmodel.MediaViewOnceViewModel r1 = r0.A0k
            int r2 = r1.A0T()
            r1 = 3
            boolean r44 = X.AnonymousClass000.A1T(r2, r1)
            X.7JS r1 = r0.A0X
            X.77K r6 = r1.A0B()
            X.1DS r2 = r1.A02
            java.lang.Object r2 = r2.A06()
            java.util.Map r2 = (java.util.Map) r2
            java.util.List r1 = r1.A0D
            java.util.List r3 = X.C29431cG.A0q(r1)
            int r1 = X.C200510q.A00(r3)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            java.util.Iterator r8 = r3.iterator()
        L_0x0286:
            boolean r3 = r8.hasNext()
            r1 = 0
            if (r3 == 0) goto L_0x02a7
            java.lang.Object r4 = r8.next()
            X.36j r3 = new X.36j
            r3.<init>()
            r3.A00(r6)
            if (r2 == 0) goto L_0x02a1
            java.lang.Object r1 = r2.get(r4)
            java.util.Set r1 = (java.util.Set) r1
        L_0x02a1:
            r3.A05 = r1
            r5.put(r4, r3)
            goto L_0x0286
        L_0x02a7:
            java.util.LinkedHashMap r3 = X.AnonymousClass1D7.A08(r5)
            X.36j r2 = new X.36j
            r2.<init>()
            r2.A00(r6)
            r3.put(r1, r2)
            boolean r12 = r0.A1U
            java.lang.Integer r25 = com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel.A03(r0)
            com.whatsapp.mediacomposer.viewmodel.MediaQualityViewModel r1 = r0.A0j
            java.util.HashSet r32 = r1.A0U()
            java.lang.Long r8 = r0.A1M
            X.00H r1 = r0.A18
            java.lang.Object r1 = r1.get()
            X.6hD r1 = (X.C129076hD) r1
            java.util.HashSet r1 = r1.A02
            int r1 = r1.size()
            java.lang.Long r27 = X.C17880vN.A0n(r1)
            X.00H r1 = r0.A18
            java.lang.Object r1 = r1.get()
            X.6hD r1 = (X.C129076hD) r1
            java.util.HashSet r2 = r1.A02
            java.util.HashSet r1 = r1.A03
            java.util.Set r1 = X.C29431cG.A13(r2, r1)
            int r1 = r1.size()
            java.lang.Long r28 = X.C17880vN.A0n(r1)
            X.7JS r1 = r0.A0X
            X.6rz r6 = r1.A00
            X.0vl r1 = r1.A0E
            boolean r48 = X.C72453Mb.A1a(r1)
            X.6tV r5 = r0.A0o
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "photos_effect_count"
            java.lang.String r2 = r2.getStringExtra(r1)
            if (r2 == 0) goto L_0x0380
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0380
            X.709 r16 = X.AnonymousClass6WS.A00(r2)
        L_0x0310:
            android.content.Intent r2 = r0.getIntent()
            java.lang.String r1 = "videos_effect_count"
            java.lang.String r2 = r2.getStringExtra(r1)
            if (r2 == 0) goto L_0x037a
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x037a
            X.709 r17 = X.AnonymousClass6WS.A00(r2)
        L_0x0326:
            r29 = 0
            X.1K2 r1 = r7.A00
            X.1K1 r2 = r1.A00
            android.app.Activity r4 = r2.AAO
            X.6Md r1 = new X.6Md
            r23 = r5
            r26 = r8
            r30 = r15
            r31 = r13
            r34 = r11
            r35 = r14
            r36 = r3
            r46 = r12
            r18 = r20
            r19 = r6
            r20 = r0
            r21 = r9
            r14 = r4
            r15 = r10
            r13 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r40, r42, r43, r44, r45, r46, r47, r48, r49)
            X.AnonymousClass1K1.A6v(r2, r1)
            X.10I r2 = r0.A05
            X.C17890vO.A0u(r1, r2)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "MediaComposerActivity/runPrepareAndSendMediaTask statusDistributionInfo = "
            r2.append(r1)
            X.7JS r1 = r0.A0X
            X.77K r1 = r1.A0B()
            X.C17900vP.A0b(r1, r2)
            java.lang.String r1 = "CLOSE_ATTACHMENT_TRAY"
            android.content.Intent r1 = X.C108945cZ.A0G(r1)
            X.118 r0 = r0.A0I
            android.content.Context r0 = r0.A00
            X.A57 r0 = X.A57.A00(r0)
            r0.A03(r1)
            return
        L_0x037a:
            X.709 r17 = new X.709
            r17.<init>()
            goto L_0x0326
        L_0x0380:
            X.709 r16 = new X.709
            r16.<init>()
            goto L_0x0310
        L_0x0386:
            X.10I r3 = r0.A05
            r2 = 46
            X.7RA r1 = new X.7RA
            r1.<init>((java.lang.Object) r0, (int) r2)
            java.lang.String r0 = "MediaComposerActivity"
            r3.CGS(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7P2.Bq8():void");
    }
}
