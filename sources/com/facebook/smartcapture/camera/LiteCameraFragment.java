package com.facebook.smartcapture.camera;

import X.AnonymousClass3MW;
import X.C18070vi;
import X.C22644BHg;
import X.E93;
import X.EDL;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import java.lang.ref.WeakReference;

public final class LiteCameraFragment extends Fragment implements E93 {
    public int A00;
    public int A01;
    public C22644BHg A02;
    public WeakReference A03 = AnonymousClass3MW.A0z((Object) null);
    public WeakReference A04 = AnonymousClass3MW.A0z((Object) null);
    public boolean A05;
    public View A06;
    public EDL A07;
    public WeakReference A08 = AnonymousClass3MW.A0z((Object) null);

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        EDL A25 = A25();
        layoutInflater.getContext();
        View BOA = A25.BOA();
        C18070vi.A0X(BOA);
        this.A06 = BOA;
        Context context = layoutInflater.getContext();
        C18070vi.A0X(context);
        View view = this.A06;
        if (view == null) {
            C18070vi.A11("cameraView");
            throw null;
        }
        C22644BHg bHg = new C22644BHg(context, view);
        this.A02 = bHg;
        return bHg;
    }

    public void BnS(Exception exc) {
        C18070vi.A0d(exc, 0);
        E93 e93 = (E93) this.A08.get();
        if (e93 != null) {
            e93.BnS(exc);
        }
    }

    public void Bni() {
        this.A05 = false;
    }

    public final EDL A25() {
        EDL edl = this.A07;
        if (edl != null) {
            return edl;
        }
        C18070vi.A11("cameraController");
        throw null;
    }

    public void A1r() {
        A25().destroy();
        super.A1r();
    }

    public void A1t() {
        A25().pause();
        A25().CEd(this);
        super.A1t();
    }

    public void A1u() {
        super.A1u();
        A25().BB3(this);
        A25().CG0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r3.getBoolean("use_camera2") == false) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1z(android.os.Bundle r10) {
        /*
            r9 = this;
            super.A1z(r10)
            android.os.Bundle r3 = r9.A06
            java.lang.String r1 = "photo_quality"
            r7 = 1048576(0x100000, float:1.469368E-39)
            if (r3 == 0) goto L_0x0015
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0015
            int r7 = r3.getInt(r1)
        L_0x0015:
            java.lang.String r1 = "video_quality"
            r6 = 921600(0xe1000, float:1.291437E-39)
            r8 = 921600(0xe1000, float:1.291437E-39)
            if (r3 == 0) goto L_0x0098
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0029
            int r8 = r3.getInt(r1)
        L_0x0029:
            java.lang.String r1 = "video_bitrate"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0098
            int r0 = r3.getInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
        L_0x0039:
            r4 = 1
            if (r3 == 0) goto L_0x0045
            java.lang.String r0 = "use_camera2"
            boolean r0 = r3.getBoolean(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r2 = 0
        L_0x0046:
            X.1FL r0 = r9.A1D()
            android.content.Context r1 = r0.getApplicationContext()
            X.C18070vi.A0X(r1)
            X.DAa r0 = new X.DAa
            r0.<init>(r9, r4)
            X.EDL r0 = com.facebook.cameracore.litecamera.factory.smartcapture.SmartCaptureSelfieCameraFactory.createLiteCameraController(r1, r2, r0, r5)
            r9.A07 = r0
            X.EDL r0 = r9.A25()
            r0.CLM(r8)
            X.EDL r0 = r9.A25()
            r0.CJv(r7)
            X.EDL r0 = r9.A25()
            r0.CK8(r6)
            X.EDL r0 = r9.A25()
            r0.CJx()
            r9.A25()
            X.EDL r0 = r9.A25()
            r0.CJm(r4)
            if (r3 == 0) goto L_0x0097
            java.lang.String r2 = "initial_camera_facing"
            boolean r0 = r3.containsKey(r2)
            if (r0 == 0) goto L_0x0097
            X.EDL r1 = r9.A25()
            int r0 = r3.getInt(r2)
            r1.CJA(r0)
        L_0x0097:
            return
        L_0x0098:
            r5 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.camera.LiteCameraFragment.A1z(android.os.Bundle):void");
    }

    public void BnZ() {
        A25().CHy();
        E93 e93 = (E93) this.A08.get();
        if (e93 != null) {
            e93.BnZ();
        }
    }

    public void Bna(String str, String str2) {
        C18070vi.A0h(str, str2);
        E93 e93 = (E93) this.A08.get();
        if (e93 != null) {
            e93.Bna(str, str2);
        }
    }
}
