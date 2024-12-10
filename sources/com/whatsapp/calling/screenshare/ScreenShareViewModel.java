package com.whatsapp.calling.screenshare;

import X.A69;
import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02n;
import X.AnonymousClass112;
import X.AnonymousClass118;
import X.AnonymousClass11S;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1HQ;
import X.AnonymousClass1OB;
import X.AnonymousClass1V6;
import X.AnonymousClass1V7;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass3VX;
import X.AnonymousClass6RY;
import X.C005702m;
import X.C108945cZ;
import X.C108965cb;
import X.C108975cc;
import X.C122576Qx;
import X.C134216qE;
import X.C1406772n;
import X.C149087iU;
import X.C1594684q;
import X.C175258yP;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C18600wl;
import X.C21141AfC;
import X.C30391dr;
import X.C41111vp;
import X.C41561wd;
import X.C41731wy;
import X.C72453Mb;
import X.C72473Md;
import android.content.Intent;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipCameraManager;
import java.util.concurrent.CancellationException;

public final class ScreenShareViewModel extends AnonymousClass3VX implements AnonymousClass1V6, C1594684q {
    public Intent A00;
    public MediaProjection A01;
    public AnonymousClass02n A02;
    public Integer A03;
    public AnonymousClass1OB A04;
    public final AnonymousClass1HQ A05;
    public final AnonymousClass1V7 A06;
    public final AnonymousClass118 A07;
    public final C18030ve A08;
    public final C41111vp A09;
    public final C41111vp A0A;
    public final C41731wy A0B;
    public final C41731wy A0C;
    public final C41731wy A0D;
    public final C41731wy A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final C18100vl A0H = AnonymousClass1DF.A01(new C149087iU(this));
    public final AnonymousClass11S A0I;
    public final C175258yP A0J;
    public final C21141AfC A0K;
    public final AnonymousClass1DC A0L;
    public final VoipCameraManager A0M;
    public final C18600wl A0N;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.content.Intent r3, com.whatsapp.calling.screenshare.ScreenShareViewModel r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L_0x002d
            X.0vl r0 = r4.A0H     // Catch:{ SecurityException -> 0x0013 }
            java.lang.Object r1 = r0.getValue()     // Catch:{ SecurityException -> 0x0013 }
            android.media.projection.MediaProjectionManager r1 = (android.media.projection.MediaProjectionManager) r1     // Catch:{ SecurityException -> 0x0013 }
            if (r1 == 0) goto L_0x001c
            r0 = -1
            android.media.projection.MediaProjection r0 = r1.getMediaProjection(r0, r3)     // Catch:{ SecurityException -> 0x0013 }
            goto L_0x001d
        L_0x0013:
            r1 = move-exception
            java.lang.String r0 = "SecurityException thrown while FGService running"
            com.whatsapp.util.Log.w(r0, r1)
            A08(r4)
        L_0x001c:
            r0 = r2
        L_0x001d:
            r4.A01 = r0
            if (r0 == 0) goto L_0x002d
            X.1OX r1 = X.C41561wd.A00(r4)
            com.whatsapp.calling.screenshare.ScreenShareViewModel$getMediaProjectionAndStartSharing$1$1$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$getMediaProjectionAndStartSharing$1$1$1
            r0.<init>(r4, r2)
            X.AnonymousClass3MX.A1Q(r0, r1)
        L_0x002d:
            r4.A00 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A06(android.content.Intent, com.whatsapp.calling.screenshare.ScreenShareViewModel):void");
    }

    public static final void A08(ScreenShareViewModel screenShareViewModel) {
        screenShareViewModel.A00 = null;
        C108945cZ.A0d(screenShareViewModel.A0F).A01(-13);
        AnonymousClass3MX.A1J(screenShareViewModel.A0B, 31);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.AnonymousClass6RY r8, com.whatsapp.calling.screenshare.ScreenShareViewModel r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.AnonymousClass7UK
            if (r0 == 0) goto L_0x009b
            r5 = r10
            X.7UK r5 = (X.AnonymousClass7UK) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L_0x0068
            if (r0 != r3) goto L_0x00a2
            java.lang.Object r8 = r5.L$1
            X.6RY r8 = (X.AnonymousClass6RY) r8
            java.lang.Object r9 = r5.L$0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r9 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r9
            X.C30691eM.A01(r1)
        L_0x0028:
            int r7 = X.AnonymousClass000.A0M(r1)
            X.00H r6 = r9.A0F
            X.A1P r5 = X.C108945cZ.A0d(r6)
            if (r7 == 0) goto L_0x0035
            r3 = 0
        L_0x0035:
            X.6uK r4 = r5.A0O
            r4.A00()
            if (r3 == 0) goto L_0x0046
            long r2 = r5.A0E
            long r0 = r4.A00
            long r0 = java.lang.Math.max(r2, r0)
            r5.A0E = r0
        L_0x0046:
            r4.A01()
            if (r7 == 0) goto L_0x005e
            X.A1P r0 = X.C108945cZ.A0d(r6)
            r0.A01(r7)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ScreenShareViewModel Failed to stop screen sharing: "
            X.C17900vP.A0i(r0, r1, r7)
            r9.A05()
        L_0x005e:
            X.A1P r0 = X.C108945cZ.A0d(r6)
            r0.A02(r8)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0068:
            X.C30691eM.A01(r1)
            X.00H r1 = r9.A0F
            X.A1P r0 = X.C108945cZ.A0d(r1)
            X.6uK r0 = r0.A0O
            r0.A01()
            r0.A02()
            X.A1P r0 = X.C108945cZ.A0d(r1)
            X.1OB r0 = r0.A0I
            X.AnonymousClass3Ma.A1R(r0)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r9.A03 = r0
            X.0wl r2 = r9.A0N
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$stopScreenSharing$res$1
            r0.<init>(r9, r1)
            r5.L$0 = r9
            r5.L$1 = r8
            r5.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r5, r2, r0)
            if (r1 != r4) goto L_0x0028
            return r4
        L_0x009b:
            X.7UK r5 = new X.7UK
            r5.<init>(r9, r10)
            goto L_0x0012
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A03(X.6RY, com.whatsapp.calling.screenshare.ScreenShareViewModel, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A04(com.whatsapp.calling.screenshare.ScreenShareViewModel r6, X.C30391dr r7) {
        /*
            boolean r0 = r7 instanceof X.C147487Ti
            if (r0 == 0) goto L_0x00b1
            r4 = r7
            X.7Ti r4 = (X.C147487Ti) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L_0x006a
            if (r0 != r3) goto L_0x00b8
            java.lang.Object r6 = r4.L$0
            com.whatsapp.calling.screenshare.ScreenShareViewModel r6 = (com.whatsapp.calling.screenshare.ScreenShareViewModel) r6
            X.C30691eM.A01(r1)
        L_0x0024:
            int r2 = X.AnonymousClass000.A0M(r1)
            if (r2 == 0) goto L_0x004a
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ScreenShareViewModel Failed to start screen sharing: "
            X.C17900vP.A0i(r0, r1, r2)
            X.00H r0 = r6.A0F
            X.A1P r0 = X.C108945cZ.A0d(r0)
            r0.A01(r2)
            X.1wy r1 = r6.A0B
            r0 = 31
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r1.A0F(r0)
            r6.A05()
        L_0x004a:
            X.00H r0 = r6.A0F
            X.A1P r5 = X.C108945cZ.A0d(r0)
            if (r2 == 0) goto L_0x0053
            r3 = 0
        L_0x0053:
            X.6uK r4 = r5.A0N
            r4.A00()
            if (r3 == 0) goto L_0x0064
            long r2 = r5.A0D
            long r0 = r4.A00
            long r0 = java.lang.Math.max(r2, r0)
            r5.A0D = r0
        L_0x0064:
            r4.A01()
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006a:
            X.C30691eM.A01(r1)
            X.00H r2 = r6.A0F
            X.A1P r1 = X.C108945cZ.A0d(r2)
            int r0 = r1.A06
            int r0 = r0 + 1
            r1.A06 = r0
            X.A1P r0 = X.C108945cZ.A0d(r2)
            X.6uK r0 = r0.A0N
            r0.A01()
            r0.A02()
            X.A1P r0 = X.C108945cZ.A0d(r2)
            X.6uK r0 = r0.A0Q
            r0.A01()
            r0.A02()
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r6.A03 = r0
            X.1vp r1 = r6.A0A
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.A0G(r0)
            X.0wl r2 = r6.A0N
            r1 = 0
            com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1 r0 = new com.whatsapp.calling.screenshare.ScreenShareViewModel$startScreenSharing$res$1
            r0.<init>(r6, r1)
            r4.L$0 = r6
            r4.label = r3
            java.lang.Object r1 = X.C30451dy.A00(r4, r2, r0)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x00b1:
            X.7Ti r4 = new X.7Ti
            r4.<init>(r6, r7)
            goto L_0x0012
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.screenshare.ScreenShareViewModel.A04(com.whatsapp.calling.screenshare.ScreenShareViewModel, X.1dr):java.lang.Object");
    }

    private final void A05() {
        MediaProjection mediaProjection = this.A01;
        if (mediaProjection != null) {
            mediaProjection.stop();
        }
        this.A01 = null;
        this.A0K.A06();
        this.A03 = AnonymousClass00R.A00;
        this.A0A.A0G(false);
    }

    public void A0S() {
        this.A0M.setMediaProjectionProvider((C1594684q) null);
        this.A0J.unregisterObserver(this);
        C108965cb.A1L(this.A0G, this);
    }

    public void C6R(boolean z) {
        if (z) {
            A06(this.A00, this);
        } else {
            A08(this);
        }
        C108965cb.A1L(this.A0G, this);
        AnonymousClass1OB r1 = this.A04;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
        }
        this.A04 = null;
    }

    public ScreenShareViewModel(AnonymousClass11S r3, AnonymousClass1HQ r4, C175258yP r5, AnonymousClass1V7 r6, C21141AfC afC, AnonymousClass118 r8, C18030ve r9, AnonymousClass1DC r10, VoipCameraManager voipCameraManager, AnonymousClass00H r12, AnonymousClass00H r13, C18600wl r14) {
        C18070vi.A0w(r9, r3, r8, r4, r5);
        C18070vi.A0x(r10, afC, r14, voipCameraManager, r6);
        C72473Md.A1L(r12, r13);
        this.A08 = r9;
        this.A0I = r3;
        this.A07 = r8;
        this.A05 = r4;
        this.A0J = r5;
        this.A0L = r10;
        this.A0K = afC;
        this.A0N = r14;
        this.A0M = voipCameraManager;
        this.A06 = r6;
        this.A0G = r12;
        this.A0F = r13;
        Boolean A0h = AnonymousClass000.A0h();
        this.A0A = AnonymousClass3MW.A0n(A0h);
        this.A0B = AnonymousClass3MW.A0o();
        this.A0D = AnonymousClass3MW.A0o();
        this.A0E = AnonymousClass3MW.A0o();
        this.A09 = AnonymousClass3MW.A0n(A0h);
        this.A0C = AnonymousClass3MW.A0o();
        this.A03 = AnonymousClass00R.A00;
        voipCameraManager.setMediaProjectionProvider(this);
        r5.registerObserver(this);
        C134216qE r0 = r5.A07().A07;
        if (r0 != null && r0.A0L) {
            this.A03 = AnonymousClass00R.A0N;
            this.A0A.A0G(true);
        }
    }

    public static final void A07(C005702m r4, ScreenShareViewModel screenShareViewModel) {
        boolean A1Z = C72453Mb.A1Z(r4);
        int i = r4.A00;
        if (i == -1) {
            C108945cZ.A0d(screenShareViewModel.A0F).A0K = true;
            if (AnonymousClass112.A0A()) {
                screenShareViewModel.A00 = r4.A01;
                C72453Mb.A1Q(screenShareViewModel.A0G, screenShareViewModel);
                Bundle A0D2 = C17880vN.A0D();
                A0D2.putBoolean("is_media_projection", true);
                screenShareViewModel.A06.A00(new A69("refresh_notification", A0D2));
                C30391dr A0j = C108975cc.A0j(screenShareViewModel.A04);
                screenShareViewModel.A04 = AnonymousClass3MY.A0s(new ScreenShareViewModel$tryStartScreenSharingAndroid14$1(screenShareViewModel, A0j), C41561wd.A00(screenShareViewModel));
            } else if (!AnonymousClass112.A06() || screenShareViewModel.A06.A06.get()) {
                A06(r4.A01, screenShareViewModel);
            } else {
                Log.i("ScreenShareViewModel Foreground service not running, unable to start screen sharing");
                AnonymousClass3MX.A1J(screenShareViewModel.A0B, 31);
                A08(screenShareViewModel);
            }
            AnonymousClass3MY.A1L(screenShareViewModel.A09, A1Z);
            return;
        }
        C17900vP.A0i("ScreenShareViewModel MediaProjection permission not granted: ", AnonymousClass000.A10(), i);
        AnonymousClass3MX.A1Q(new ScreenShareViewModel$registerForActivityResult$1$1(screenShareViewModel, (C30391dr) null), C41561wd.A00(screenShareViewModel));
    }

    public final void A0T(C122576Qx r4) {
        String str;
        AnonymousClass02n r2;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScreenShareViewModel toggleScreenSharing -- currentState: ");
        Integer num = this.A03;
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "STOPPING";
                    break;
                case 2:
                    str = "STARTING";
                    break;
                case 3:
                    str = "STARTED";
                    break;
                default:
                    str = "STOPPED";
                    break;
            }
        } else {
            str = "null";
        }
        C17890vO.A1A(A10, str);
        int intValue = this.A03.intValue();
        if (intValue == 0) {
            Log.i("ScreenShareViewModel tryStartScreenSharing");
            if (!AnonymousClass112.A06() || this.A06.A06.get()) {
                MediaProjectionManager mediaProjectionManager = (MediaProjectionManager) this.A0H.getValue();
                if (mediaProjectionManager != null && (r2 = this.A02) != null) {
                    Log.i("ScreenShareViewModel Requesting screen share permission");
                    Intent createScreenCaptureIntent = mediaProjectionManager.createScreenCaptureIntent();
                    C18070vi.A0X(createScreenCaptureIntent);
                    r2.A02((C1406772n) null, createScreenCaptureIntent);
                    AnonymousClass3MY.A1L(this.A09, true);
                    return;
                }
                return;
            }
            Log.i("ScreenShareViewModel Foreground service not running, unable to start screen sharing");
            AnonymousClass3MX.A1J(this.A0B, 31);
        } else if (intValue == 3) {
            C108945cZ.A0d(this.A0F).A07++;
            AnonymousClass3MX.A1Q(new ScreenShareViewModel$toggleScreenSharing$1(r4, this, (C30391dr) null), C41561wd.A00(this));
        }
    }

    public void C4X(int i) {
        C41731wy r1;
        C17900vP.A0j("ScreenShareViewModel onScreenShareEndedWithReason: ", AnonymousClass000.A10(), i);
        if (i != 2) {
            if (i == 3) {
                this.A03 = AnonymousClass00R.A01;
                r1 = this.A0D;
            } else {
                return;
            }
        } else if (this.A03 != AnonymousClass00R.A00) {
            this.A03 = AnonymousClass00R.A01;
            A05();
            AnonymousClass00H r2 = this.A0F;
            AnonymousClass3Ma.A1R(C108945cZ.A0d(r2).A0I);
            C108945cZ.A0d(r2).A02(AnonymousClass6RY.PEER_TAKEOVER);
            C108945cZ.A0d(r2).A0P.A00();
            r1 = this.A0E;
        } else {
            return;
        }
        r1.A0F((Object) null);
    }

    public void C4Y(UserJid userJid, boolean z, boolean z2) {
        StringBuilder A0K2 = C18070vi.A0K(userJid);
        A0K2.append("ScreenShareViewModel onScreenShareStateChanged -- jid: ");
        A0K2.append(userJid);
        A0K2.append(", isStarted: ");
        A0K2.append(z);
        C17900vP.A0n(", supportsGroupCallSharing: ", A0K2, z2);
        if (this.A0I.A0O(userJid)) {
            if (z) {
                this.A03 = AnonymousClass00R.A0N;
                this.A0A.A0G(true);
                this.A0C.A0F((Object) null);
            } else {
                A05();
                AnonymousClass3Ma.A1R(C108945cZ.A0d(this.A0F).A0I);
            }
            C108945cZ.A0d(this.A0F).A0J = z;
        }
    }

    public void C78() {
    }
}
