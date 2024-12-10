package com.facebook.smartcapture.camera;

import X.AnonymousClass02n;
import X.AnonymousClass1GO;
import X.AnonymousClass3MW;
import X.BE6;
import X.C110885hR;
import X.C17880vN;
import X.C18070vi;
import X.C19740yt;
import X.C20151A9n;
import X.C22643BHf;
import X.C26331Cxo;
import X.C26333Cxq;
import X.D46;
import X.D5Y;
import X.E93;
import X.EDL;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public final class PhotoCameraFragment extends Fragment implements E93 {
    public static final AtomicBoolean A0A = BE6.A16(true);
    public EDL A00;
    public D46 A01 = new D46("", "", "", "", "", "", "", "");
    public WeakReference A02 = AnonymousClass3MW.A0z((Object) null);
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public View A06;
    public C22643BHf A07;
    public WeakReference A08 = AnonymousClass3MW.A0z((Object) null);
    public final AnonymousClass02n A09 = CDw(new D5Y(this, 1), new Object());

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        EDL A25 = A25();
        layoutInflater.getContext();
        this.A06 = A25.BOA();
        Context context = layoutInflater.getContext();
        C18070vi.A0X(context);
        View view = this.A06;
        if (view == null) {
            C18070vi.A11("cameraView");
            throw null;
        }
        C22643BHf bHf = new C22643BHf(context, view, this.A05);
        this.A07 = bHf;
        return bHf;
    }

    public final void A26(D46 d46, Integer num, Integer num2, Integer num3) {
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("initial_camera_facing", 1);
        if (num != null) {
            A0D.putInt("photo_quality", num.intValue());
        }
        if (num2 != null) {
            A0D.putInt("video_quality", num2.intValue());
        }
        if (num3 != null) {
            A0D.putInt("video_bitrate", num3.intValue());
        }
        A0D.putBoolean("use_camera2", false);
        A0D.putBoolean("use_photo_only", true);
        A0D.putParcelable("permissions_dialog_texts", d46);
        A1R(A0D);
    }

    public void BnS(Exception exc) {
        C18070vi.A0d(exc, 0);
        E93 e93 = (E93) this.A02.get();
        if (e93 != null) {
            e93.BnS(exc);
        }
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.CyS, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
        if (r3.getBoolean("use_camera2") != true) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r3 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r3.getBoolean("use_photo_only") == true) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004e, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004f, code lost:
        r15.A05 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        if (r3 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if (r3.containsKey("permissions_dialog_texts") != true) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r0 = (X.D46) r3.getParcelable("permissions_dialog_texts");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r0 != null) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r0 = r15.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r15.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0067, code lost:
        r8 = A1D();
        r12 = new X.C26814DEw(false);
        r7 = r8.getApplicationContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (r14 == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0079, code lost:
        r0 = X.C24248By6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        r7 = new X.DAU(r7.getApplicationContext(), (android.view.TextureView) null, new java.lang.Object(), X.C25316CdM.A01(r8, r0), r12, "SmartCaptureSelfie", r14);
        r7.A0C = new X.C26793DEb();
        r7.A0F = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r0 = X.C24248By6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r7.CLM(921600);
        r7.CJv(1048576);
        r7.CK8(921600);
        r7.CJA(1);
        r7.A05();
        r7.CJm(true);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r16) {
        /*
            r15 = this;
            r0 = r16
            super.A1z(r0)
            android.os.Bundle r3 = r15.A06
            java.lang.String r1 = "photo_quality"
            r4 = 1048576(0x100000, float:1.469368E-39)
            if (r3 == 0) goto L_0x0017
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0017
            int r4 = r3.getInt(r1)
        L_0x0017:
            java.lang.String r1 = "video_quality"
            r2 = 921600(0xe1000, float:1.291437E-39)
            r5 = 921600(0xe1000, float:1.291437E-39)
            if (r3 == 0) goto L_0x0036
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x002b
            int r5 = r3.getInt(r1)
        L_0x002b:
            java.lang.String r1 = "video_bitrate"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0036
            r3.getInt(r1)
        L_0x0036:
            r1 = 1
            if (r3 == 0) goto L_0x0042
            java.lang.String r0 = "use_camera2"
            boolean r0 = r3.getBoolean(r0)
            r14 = 1
            if (r0 == r1) goto L_0x0045
        L_0x0042:
            r14 = 0
            if (r3 == 0) goto L_0x004e
        L_0x0045:
            java.lang.String r0 = "use_photo_only"
            boolean r6 = r3.getBoolean(r0)
            r0 = 1
            if (r6 == r1) goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            r15.A05 = r0
            if (r3 == 0) goto L_0x0067
            java.lang.String r6 = "permissions_dialog_texts"
            boolean r0 = r3.containsKey(r6)
            if (r0 != r1) goto L_0x0067
            android.os.Parcelable r0 = r3.getParcelable(r6)
            X.D46 r0 = (X.D46) r0
            if (r0 != 0) goto L_0x0065
            X.D46 r0 = r15.A01
        L_0x0065:
            r15.A01 = r0
        L_0x0067:
            X.1FL r8 = r15.A1D()
            r6 = 0
            X.DEw r12 = new X.DEw
            r12.<init>(r6)
            java.lang.String r13 = "SmartCaptureSelfie"
            android.content.Context r7 = r8.getApplicationContext()
            if (r14 == 0) goto L_0x0098
            X.By6 r0 = X.C24248By6.CAMERA2
        L_0x007b:
            X.EAk r11 = X.C25316CdM.A01(r8, r0)
            r9 = 0
            android.content.Context r8 = r7.getApplicationContext()
            X.CyS r10 = new X.CyS
            r10.<init>()
            X.DAU r7 = new X.DAU
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            X.DEb r0 = new X.DEb
            r0.<init>()
            r7.A0C = r0
            r7.A0F = r6
            goto L_0x009b
        L_0x0098:
            X.By6 r0 = X.C24248By6.CAMERA1
            goto L_0x007b
        L_0x009b:
            r7.CLM(r2)     // Catch:{ Exception -> 0x00af }
            r0 = 1048576(0x100000, float:1.469368E-39)
            r7.CJv(r0)     // Catch:{ Exception -> 0x00af }
            r7.CK8(r2)     // Catch:{ Exception -> 0x00af }
            r7.CJA(r1)     // Catch:{ Exception -> 0x00af }
            r7.A05()     // Catch:{ Exception -> 0x00af }
            r7.CJm(r1)     // Catch:{ Exception -> 0x00af }
        L_0x00af:
            r15.A00 = r7
            X.EDL r0 = r15.A25()
            r0.CLM(r5)
            X.EDL r0 = r15.A25()
            r0.CJv(r4)
            X.EDL r0 = r15.A25()
            r0.CK8(r2)
            r15.A25()
            X.EDL r0 = r15.A25()
            r0.CJm(r1)
            if (r3 == 0) goto L_0x00e5
            java.lang.String r2 = "initial_camera_facing"
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x00e5
            X.EDL r1 = r15.A25()
            int r0 = r3.getInt(r2)
            r1.CJA(r0)
        L_0x00e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.camera.PhotoCameraFragment.A1z(android.os.Bundle):void");
    }

    public final EDL A25() {
        EDL edl = this.A00;
        if (edl != null) {
            return edl;
        }
        C18070vi.A11("cameraController");
        throw null;
    }

    public void BnZ() {
        if (!this.A05) {
            A25().CHy();
        }
        E93 e93 = (E93) this.A02.get();
        if (e93 != null) {
            e93.BnZ();
        }
    }

    public void Bni() {
    }

    public static final boolean A00(PhotoCameraFragment photoCameraFragment) {
        boolean z;
        AlertDialog.Builder negativeButton;
        int i;
        if (C19740yt.A01(photoCameraFragment.A14(), "android.permission.CAMERA") == 0) {
            return true;
        }
        if (!photoCameraFragment.A03) {
            if (!A0A.compareAndSet(true, false)) {
                AnonymousClass1GO r0 = photoCameraFragment.A0G;
                if (r0 != null) {
                    z = C110885hR.A0C(r0.A04, "android.permission.CAMERA");
                } else {
                    z = false;
                }
                if (z) {
                    negativeButton = new AlertDialog.Builder(photoCameraFragment.A14()).setTitle(photoCameraFragment.A01.A03).setMessage(photoCameraFragment.A01.A02).setPositiveButton(photoCameraFragment.A01.A01, new C26331Cxo(photoCameraFragment, 1)).setNegativeButton(photoCameraFragment.A01.A00, (DialogInterface.OnClickListener) null);
                    i = 2;
                } else if (photoCameraFragment.A04) {
                    negativeButton = new AlertDialog.Builder(photoCameraFragment.A14()).setTitle(photoCameraFragment.A01.A07).setMessage(photoCameraFragment.A01.A06).setPositiveButton(photoCameraFragment.A01.A05, new C20151A9n(photoCameraFragment, 2)).setNegativeButton(photoCameraFragment.A01.A04, (DialogInterface.OnClickListener) null);
                    i = 3;
                }
                negativeButton.setOnDismissListener(new C26333Cxq(photoCameraFragment, i)).create().show();
                photoCameraFragment.A03 = true;
            }
            photoCameraFragment.A09.A03("android.permission.CAMERA");
            return false;
        }
        return false;
    }

    public void A1r() {
        A25().destroy();
        super.A1r();
    }

    public void A1t() {
        if (!A25().Be2()) {
            A25().pause();
        }
        A25().CEd(this);
        super.A1t();
    }

    public void A1u() {
        super.A1u();
        A25().BB3(this);
        if (A00(this)) {
            A25().CG0();
        }
    }

    public void Bna(String str, String str2) {
        C18070vi.A0h(str, str2);
        E93 e93 = (E93) this.A02.get();
        if (e93 != null) {
            e93.Bna(str, str2);
        }
    }
}
