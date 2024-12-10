package X;

import androidx.window.sidecar.SidecarDisplayFeature;

/* renamed from: X.Drl  reason: case insensitive filesystem */
public final class C28127Drl extends AnonymousClass11G implements C22821Di {
    public static final C28127Drl A00 = new C28127Drl();

    public C28127Drl() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
        C18070vi.A0d(sidecarDisplayFeature, 0);
        boolean z = true;
        if (!(sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
