package X;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.BUp  reason: case insensitive filesystem */
public final class C22904BUp extends C25632CjI {
    public int A00 = -1;
    public final CameraExtensionCharacteristics A01;
    public final C25632CjI A02;
    public final List A03;
    public final Map A04 = C17880vN.A11();
    public final Map A05 = C17880vN.A11();
    public final Map A06 = C17880vN.A11();
    public final Map A07 = C17880vN.A11();
    public final Map A08 = C17880vN.A11();

    public C22904BUp(CameraExtensionCharacteristics cameraExtensionCharacteristics, C25632CjI cjI) {
        ArrayList A13 = AnonymousClass000.A13();
        this.A03 = A13;
        this.A02 = cjI;
        this.A01 = cameraExtensionCharacteristics;
        C17890vO.A1D(A13, -1);
        this.A00 = -1;
    }

    private ArrayList A00(CameraExtensionCharacteristics cameraExtensionCharacteristics, CKI cki, int i, int i2, int i3) {
        List extensionSupportedSizes;
        List list;
        HashSet A12;
        if (i == 1) {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, i2);
        } else {
            extensionSupportedSizes = cameraExtensionCharacteristics.getExtensionSupportedSizes(i3, SurfaceTexture.class);
        }
        if (extensionSupportedSizes == null || extensionSupportedSizes.isEmpty()) {
            list = Collections.emptyList();
        } else {
            int size = extensionSupportedSizes.size();
            ArrayList A0z = C17880vN.A0z(size);
            for (int i4 = 0; i4 < size; i4++) {
                A0z.add(new C26132Csv(((Size) extensionSupportedSizes.get(i4)).getWidth(), ((Size) extensionSupportedSizes.get(i4)).getHeight()));
            }
            list = Collections.unmodifiableList(A0z);
        }
        List A11 = BE6.A11(cki, this.A02);
        if (A11.size() < list.size()) {
            A12 = AnonymousClass8BR.A12(A11);
            A11 = list;
        } else {
            A12 = AnonymousClass8BR.A12(list);
        }
        int size2 = A11.size();
        int size3 = A12.size();
        ArrayList A0z2 = C17880vN.A0z(size3);
        for (int i5 = 0; i5 < size2; i5++) {
            Object obj = A11.get(i5);
            if (A12.contains(obj)) {
                A0z2.add(obj);
                if (A0z2.size() == size3) {
                    break;
                }
            }
        }
        return A0z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r0.contains(r1) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        if (X.BE9.A1T(X.C25632CjI.A0c, r10.A02) == false) goto L_0x00a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A02(X.CKI r11) {
        /*
            r10 = this;
            r0 = -1
            r4 = r10
            int r2 = r10.A00
            if (r0 == r2) goto L_0x002b
            int r1 = r11.A00
            r0 = 41
            if (r1 == r0) goto L_0x00e6
            r0 = 52
            if (r1 == r0) goto L_0x00ae
            r0 = 71
            if (r1 == r0) goto L_0x0061
            r0 = 84
            if (r1 == r0) goto L_0x005e
            r0 = 89
            if (r1 == r0) goto L_0x005b
            r0 = 92
            if (r1 == r0) goto L_0x005b
            r0 = 49
            if (r1 == r0) goto L_0x0045
            r0 = 50
            if (r1 == r0) goto L_0x00c4
            switch(r1) {
                case 79: goto L_0x0032;
                case 80: goto L_0x0032;
                case 81: goto L_0x0032;
                default: goto L_0x002b;
            }
        L_0x002b:
            X.CjI r0 = r10.A02
            java.lang.Object r0 = r0.A02(r11)
            return r0
        L_0x0032:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.util.Map r0 = r10.A04
            java.lang.Object r0 = X.AnonymousClass000.A0w(r0, r2)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x005b
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x005b
            goto L_0x002b
        L_0x0045:
            java.util.Map r1 = r10.A06
            boolean r0 = X.C108965cb.A1a(r1, r2)
            if (r0 != 0) goto L_0x00df
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            X.CKI r6 = X.C25632CjI.A0v
            r7 = 1
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x00d8
        L_0x005b:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x005e:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x0061:
            java.util.Map r1 = r10.A05
            boolean r0 = X.C108965cb.A1a(r1, r2)
            if (r0 != 0) goto L_0x00df
            java.util.Map r3 = r10.A07
            int r0 = r10.A00
            boolean r0 = X.C108965cb.A1a(r3, r0)
            if (r0 != 0) goto L_0x0087
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r8 = 35
            X.CKI r6 = X.C25632CjI.A0p
            r7 = 1
            java.util.ArrayList r0 = r4.A00(r5, r6, r7, r8, r9)
            r3.put(r2, r0)
        L_0x0087:
            int r0 = r10.A00
            java.lang.Object r0 = X.AnonymousClass000.A0w(r3, r0)
            java.util.List r0 = (java.util.List) r0
            r0.getClass()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00a3
            X.CjI r2 = r10.A02
            X.CKI r0 = X.C25632CjI.A0c
            boolean r2 = X.BE9.A1T(r0, r2)
            r0 = 1
            if (r2 != 0) goto L_0x00a4
        L_0x00a3:
            r0 = 0
        L_0x00a4:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            int r0 = r10.A00
            X.C17880vN.A1O(r2, r1, r0)
            goto L_0x00df
        L_0x00ae:
            java.util.Map r1 = r10.A07
            boolean r0 = X.C108965cb.A1a(r1, r2)
            if (r0 != 0) goto L_0x00df
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            r8 = 35
            X.CKI r6 = X.C25632CjI.A0p
            r7 = 1
            goto L_0x00d8
        L_0x00c4:
            java.util.Map r1 = r10.A08
            boolean r0 = X.C108965cb.A1a(r1, r2)
            if (r0 != 0) goto L_0x00df
            int r9 = r10.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
            android.hardware.camera2.CameraExtensionCharacteristics r5 = r10.A01
            X.CKI r6 = X.C25632CjI.A0z
            r7 = 0
            r8 = 0
        L_0x00d8:
            java.util.ArrayList r0 = r4.A00(r5, r6, r7, r8, r9)
            r1.put(r2, r0)
        L_0x00df:
            int r0 = r10.A00
            java.lang.Object r0 = X.AnonymousClass000.A0w(r1, r0)
            return r0
        L_0x00e6:
            java.util.List r0 = r10.A03
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22904BUp.A02(X.CKI):java.lang.Object");
    }

    public void A03(int i) {
        this.A00 = i;
        if (i != -1) {
            Map map = this.A04;
            Integer valueOf = Integer.valueOf(i);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, this.A01.getAvailableCaptureRequestKeys(i));
            }
        }
    }
}
